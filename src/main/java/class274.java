import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class274 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    private int field4814 = 65000;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Lbh;")
    private class7 field4815 = null;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "Lbh;")
    private class7 field4813 = null;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    private int field4812;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Leb;")
    public static class230 field4816 = class68.method589(0, "::replacecanvas");

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Leb;")
    public static class230 field4818 = class68.method589(0, "Lade)3)3)3");

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field4824 = 2;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lkk;")
    public static class223 field4821;

    @OriginalMember(owner = "client!lh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4819++;
        return "Cache:" + this.field4812;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BIZZ)Z")
    private final boolean method1863(int arg0, byte[] arg1, int arg2, boolean arg3, boolean arg4) {
        field4823++;
        class7 var6 = this.field4813;
        synchronized (this.field4813) {
            try {
                int var7;
                if (arg3) {
                    if (this.field4815.method64((byte) 102) < (long) (arg0 * 6 + 6)) {
                        return false;
                    }
                    this.field4815.method69((long) (arg0 * 6), -1);
                    this.field4815.method73(6, -12312, class243.field4182, 0);
                    var7 = ((class243.field4182[4] & 0xFF) << 8) + (class243.field4182[3] & 0xFF << 16) + (class243.field4182[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field4813.method64((byte) 102) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field4813.method64((byte) 102) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class243.field4182[0] = (byte) (arg2 >> 16);
                class243.field4182[4] = (byte) (var7 >> 8);
                class243.field4182[2] = (byte) arg2;
                if (!arg4) {
                    return true;
                }
                class243.field4182[1] = (byte) (arg2 >> 8);
                class243.field4182[5] = (byte) var7;
                int var11 = 0;
                int var12 = 0;
                class243.field4182[3] = (byte) (var7 >> 16);
                this.field4815.method69((long) (arg0 * 6), -1);
                this.field4815.method75(6, 25733, class243.field4182, 0);
                while (arg2 > var11) {
                    int var13 = 0;
                    if (arg3) {
                        label110: {
                            this.field4813.method69((long) (var7 * 520), -1);
                            try {
                                this.field4813.method73(8, -12312, class243.field4182, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            var13 = ((class243.field4182[4] & 0xFF) << 16) - (-((class243.field4182[5] & 0xFF) << 8) - (class243.field4182[6] & 0xFF));
                            int var14 = (class243.field4182[0] & 0xFF << 8) + (class243.field4182[1] & 0xFF);
                            int var15 = class243.field4182[7] & 0xFF;
                            int var16 = (class243.field4182[2] & 0xFF << 8) + (class243.field4182[3] & 0xFF);
                            if (arg0 == var14 && var12 == var16 && this.field4812 == var15) {
                                if (var13 >= 0 && (this.field4813.method64((byte) 102) / 520L) >= ((long) var13)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field4813.method64((byte) 102) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class243.field4182[2] = (byte) (var12 >> 8);
                    class243.field4182[0] = (byte) (arg0 >> 8);
                    class243.field4182[1] = (byte) arg0;
                    class243.field4182[3] = (byte) var12;
                    class243.field4182[7] = (byte) this.field4812;
                    var12++;
                    int var19 = arg2 - var11;
                    if ((arg2 - var11) <= 512) {
                        var13 = 0;
                    }
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class243.field4182[6] = (byte) var13;
                    class243.field4182[5] = (byte) (var13 >> 8);
                    class243.field4182[4] = (byte) (var13 >> 16);
                    this.field4813.method69((long) (var7 * 520), -1);
                    var7 = var13;
                    this.field4813.method75(8, 25733, class243.field4182, 0);
                    this.field4813.method75(var19, 25733, arg1, var11);
                    var11 += var19;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[B")
    public final byte[] method1864(int arg0, int arg1) {
        field4820++;
        class7 var3 = this.field4813;
        synchronized (this.field4813) {
            try {
                if (this.field4815.method64((byte) 102) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field4815.method69((long) (arg0 * 6), -1);
                this.field4815.method73(6, -12312, class243.field4182, 0);
                int var5 = (class243.field4182[5] & 0xFF) + (class243.field4182[4] & 0xFF << 8) + (class243.field4182[3] & 0xFF << 16);
                int var6 = ((class243.field4182[0] & 0xFF) << 16) + ((class243.field4182[1] & 0xFF << 8) + (class243.field4182[2] & 0xFF));
                if (var6 < 0 || var6 > this.field4814) {
                    return null;
                } else if (var5 > 0 && ((long) var5) <= (this.field4813.method64((byte) 102) / 520L)) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    if (arg1 != 8) {
                        field4818 = null;
                    }
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field4813.method69((long) (var5 * 520), arg1 - 9);
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field4813.method73(var13 + 8, arg1 + -12320, class243.field4182, 0);
                        int var14 = ((class243.field4182[0] & 0xFF) << 8) + (class243.field4182[1] & 0xFF);
                        int var15 = (class243.field4182[2] & 0xFF << 8) + (class243.field4182[3] & 0xFF);
                        int var16 = (class243.field4182[6] & 0xFF) + ((class243.field4182[5] & 0xFF) << 8) + (class243.field4182[4] & 0xFF << 16);
                        int var17 = class243.field4182[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field4812 == var17) {
                            if (var16 >= 0 && (this.field4813.method64((byte) 102) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class243.field4182[var20 + 8];
                                }
                                var5 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ[BI)Z")
    public final boolean method1865(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field4822++;
        class7 var5 = this.field4813;
        synchronized (this.field4813) {
            if (arg0 < 0 || this.field4814 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1863(arg3, arg2, arg0, arg1, true);
            if (!var6) {
                var6 = this.method1863(arg3, arg2, arg0, false, true);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILbh;Lbh;I)V")
    public class274(int arg0, class7 arg1, class7 arg2, int arg3) {
        this.field4815 = arg2;
        this.field4812 = arg0;
        this.field4813 = arg1;
        this.field4814 = arg3;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method1866(int arg0) {
        field4821 = null;
        int var1 = 46 % ((-arg0 - 46) / 50);
        field4818 = null;
        field4816 = null;
    }
}
