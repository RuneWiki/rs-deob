import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class403 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    private int field5703 = 65000;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Luo;")
    private class207 field5710 = null;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Luo;")
    private class207 field5707 = null;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    private int field5709;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lvi;")
    public static class560 field5708 = new class560(10);

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public static int[] field5712 = new int[14];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method2371(int arg0, boolean arg1, int arg2) {
        field5705++;
        if (arg0 != 1829835024) {
            method2372(-91, -78);
        }
        return arg1 && arg2 >= 0 ? class499.method2807((byte) -120, 10, arg2, arg1) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Z")
    public static final boolean method2372(int arg0, int arg1) {
        if (arg1 >= -44) {
            method2375(-126);
        }
        field5704++;
        return arg0 == 0 || arg0 == 2 || arg0 == 4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[B")
    public final byte[] method2373(byte arg0, int arg1) {
        field5701++;
        class207 var3 = this.field5707;
        synchronized (this.field5707) {
            try {
                if (this.field5710.method1290(arg0 ^ 0x71) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field5710.method1291((byte) -123, (long) (arg1 * 6));
                this.field5710.method1296(6, class506.field6845, 109, 0);
                int var5 = (class506.field6845[2] & 0xFF) + ((class506.field6845[1] & 0xFF) << 8) + (class506.field6845[0] & 0xFF << 16);
                int var6 = (class506.field6845[5] & 0xFF) + (class506.field6845[3] & 0xFF << 16) + (class506.field6845[4] & 0xFF << 8);
                if (var5 < 0 || this.field5703 < var5) {
                    return null;
                } else if (var6 > 0 && ((long) var6) <= (this.field5707.method1290(100) / 520L)) {
                    if (arg0 != 21) {
                        this.field5710 = null;
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var10 < var5) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field5707.method1291((byte) -100, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field5707.method1296(var13 + 8, class506.field6845, arg0 + 93, 0);
                        int var14 = ((class506.field6845[0] & 0xFF) << 8) + (class506.field6845[1] & 0xFF);
                        int var15 = (class506.field6845[2] & 0xFF << 8) + (class506.field6845[3] & 0xFF);
                        int var16 = (class506.field6845[4] & 0xFF << 16) + ((class506.field6845[5] & 0xFF) << 8) + (class506.field6845[6] & 0xFF);
                        int var17 = class506.field6845[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field5709 == var17) {
                            if (var16 >= 0 && ((long) var16) <= (this.field5707.method1290(100) / 520L)) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class506.field6845[var20 + 8];
                                }
                                var11++;
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

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method2374(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field5702++;
        class207 var6 = this.field5707;
        synchronized (this.field5707) {
            try {
                int var7;
                if (arg2) {
                    if (this.field5710.method1290(100) < ((long) (arg4 * 6 + 6))) {
                        return false;
                    }
                    this.field5710.method1291((byte) -110, (long) (arg4 * 6));
                    this.field5710.method1296(6, class506.field6845, 126, 0);
                    var7 = (class506.field6845[3] & 0xFF << 16) - (-((class506.field6845[4] & 0xFF) << 8) - (class506.field6845[5] & 0xFF));
                    if (var7 <= 0 || (long) var7 > this.field5707.method1290(100) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field5707.method1290(100) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                if (arg3 <= 79) {
                    return false;
                }
                class506.field6845[3] = (byte) (var7 >> 16);
                class506.field6845[4] = (byte) (var7 >> 8);
                class506.field6845[0] = (byte) (arg0 >> 16);
                class506.field6845[2] = (byte) arg0;
                class506.field6845[5] = (byte) var7;
                class506.field6845[1] = (byte) (arg0 >> 8);
                this.field5710.method1291((byte) -128, (long) (arg4 * 6));
                this.field5710.method1289(0, 6, class506.field6845, 127);
                int var11 = 0;
                int var12 = 0;
                while (arg0 > var11) {
                    int var13 = 0;
                    if (arg2) {
                        label110: {
                            this.field5707.method1291((byte) -112, (long) (var7 * 520));
                            try {
                                this.field5707.method1296(8, class506.field6845, 122, 0);
                            } catch (EOFException var36) {
                                return true;
                            }
                            int var14 = ((class506.field6845[0] & 0xFF) << 8) + (class506.field6845[1] & 0xFF);
                            var13 = (class506.field6845[6] & 0xFF) + (((class506.field6845[4] & 0xFF) << 16) + ((class506.field6845[5] & 0xFF) << 8));
                            int var15 = (class506.field6845[2] & 0xFF << 8) + (class506.field6845[3] & 0xFF);
                            int var16 = class506.field6845[7] & 0xFF;
                            if (arg4 == var14 && var12 == var15 && this.field5709 == var16) {
                                if (var13 >= 0 && ((long) var13) <= (this.field5707.method1290(100) / 520L)) {
                                    break label110;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg2 = false;
                        var13 = (int) ((this.field5707.method1290(100) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var7 == var13) {
                            var13++;
                        }
                    }
                    class506.field6845[3] = (byte) var12;
                    class506.field6845[1] = (byte) arg4;
                    class506.field6845[2] = (byte) (var12 >> 8);
                    class506.field6845[0] = (byte) (arg4 >> 8);
                    if ((arg0 - var11) <= 512) {
                        var13 = 0;
                    }
                    class506.field6845[6] = (byte) var13;
                    class506.field6845[4] = (byte) (var13 >> 16);
                    class506.field6845[5] = (byte) (var13 >> 8);
                    class506.field6845[7] = (byte) this.field5709;
                    this.field5707.method1291((byte) -108, (long) (var7 * 520));
                    this.field5707.method1289(0, 8, class506.field6845, 126);
                    int var19 = arg0 - var11;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field5707.method1289(var11, var19, arg1, 126);
                    var12++;
                    var11 += var19;
                    var7 = var13;
                }
                return true;
            } catch (IOException var37) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method2375(int arg0) {
        if (arg0 != 7) {
            method2375(-14);
        }
        field5712 = null;
        field5708 = null;
    }

    @OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5706++;
        return "Cache:" + this.field5709;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[BII)Z")
    public final boolean method2376(boolean arg0, byte[] arg1, int arg2, int arg3) {
        field5711++;
        class207 var5 = this.field5707;
        synchronized (this.field5707) {
            if (arg2 < 0 || arg2 > this.field5703) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2374(arg2, arg1, arg0, 92, arg3);
            if (!var6) {
                var6 = this.method2374(arg2, arg1, false, 121, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(ILuo;Luo;I)V")
    public class403(int arg0, class207 arg1, class207 arg2, int arg3) {
        this.field5710 = arg2;
        this.field5703 = arg3;
        this.field5707 = arg1;
        this.field5709 = arg0;
    }
}
