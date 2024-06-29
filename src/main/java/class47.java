import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class47 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    private int field854 = 65000;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ld;")
    private class75 field852 = null;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Ld;")
    private class75 field851 = null;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    private int field859;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Le;")
    public static class86 field860 = new class86();

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "[[B")
    public static byte[][] field858;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BIII)Z")
    public final boolean method351(byte[] arg0, int arg1, int arg2, int arg3) {
        field853++;
        class75 var5 = this.field852;
        synchronized (this.field852) {
            if (arg1 < arg2 || this.field854 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method354(true, 3209, arg1, arg0, arg3);
            if (!var6) {
                var6 = this.method354(false, arg2 + 3209, arg1, arg0, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLda;)V")
    public static final void method352(byte arg0, class22 arg1) {
        field856++;
        class140.field2441 = arg1.method186(76, class197.field3264);
        class109.field1961 = arg1.method186(114, class157.field2715);
        if (arg0 >= -73) {
            field858 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method353(int arg0) {
        field858 = null;
        if (arg0 != 520) {
            field860 = null;
        }
        field860 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII[BI)Z")
    private final boolean method354(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field857++;
        class75 var6 = this.field852;
        synchronized (this.field852) {
            try {
                if (arg1 != 3209) {
                    this.toString();
                }
                int var7;
                if (arg0) {
                    if ((long) (arg4 * 6 + 6) > this.field851.method570((byte) -116)) {
                        return false;
                    }
                    this.field851.method562((long) (arg4 * 6), -118);
                    this.field851.method568(class61.field1121, (byte) -114, 0, 6);
                    var7 = (class61.field1121[5] & 0xFF) + ((class61.field1121[4] & 0xFF) << 8) + ((class61.field1121[3] & 0xFF) << 16);
                    if (var7 <= 0 || this.field852.method570((byte) 39) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field852.method570((byte) -116) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class61.field1121[0] = (byte) (arg2 >> 16);
                class61.field1121[5] = (byte) var7;
                class61.field1121[4] = (byte) (var7 >> 8);
                class61.field1121[1] = (byte) (arg2 >> 8);
                class61.field1121[3] = (byte) (var7 >> 16);
                class61.field1121[2] = (byte) arg2;
                this.field851.method562((long) (arg4 * 6), -52);
                int var10 = 0;
                int var11 = 0;
                this.field851.method569((byte) -118, 6, class61.field1121, 0);
                while (var10 < arg2) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field852.method562((long) (var7 * 520), arg1 ^ 0xFFFFF305);
                            try {
                                this.field852.method568(class61.field1121, (byte) -114, 0, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class61.field1121[6] & 0xFF) + (((class61.field1121[4] & 0xFF) << 16) + ((class61.field1121[5] & 0xFF) << 8));
                            int var13 = ((class61.field1121[0] & 0xFF) << 8) + (class61.field1121[1] & 0xFF);
                            int var14 = class61.field1121[7] & 0xFF;
                            int var15 = ((class61.field1121[2] & 0xFF) << 8) + (class61.field1121[3] & 0xFF);
                            if (arg4 == var13 && var11 == var15 && this.field859 == var14) {
                                if (var12 >= 0 && this.field852.method570((byte) 15) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg2 - var10;
                    if (var12 == 0) {
                        var12 = (int) ((this.field852.method570((byte) -120) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg0 = false;
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class61.field1121[0] = (byte) (arg4 >> 8);
                    class61.field1121[2] = (byte) (var11 >> 8);
                    class61.field1121[3] = (byte) var11;
                    class61.field1121[1] = (byte) arg4;
                    var11++;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class61.field1121[7] = (byte) this.field859;
                    if ((arg2 - var10) <= 512) {
                        var12 = 0;
                    }
                    class61.field1121[4] = (byte) (var12 >> 16);
                    class61.field1121[6] = (byte) var12;
                    class61.field1121[5] = (byte) (var12 >> 8);
                    this.field852.method562((long) (var7 * 520), -95);
                    var7 = var12;
                    this.field852.method569((byte) -76, 8, class61.field1121, 0);
                    this.field852.method569((byte) -119, var18, arg3, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)[B")
    public final byte[] method355(int arg0, boolean arg1) {
        field855++;
        class75 var3 = this.field852;
        synchronized (this.field852) {
            if (!arg1) {
                this.method351((byte[]) null, 21, -68, 75);
            }
            try {
                if (this.field851.method570((byte) 97) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field851.method562((long) (arg0 * 6), -59);
                this.field851.method568(class61.field1121, (byte) -114, 0, 6);
                int var5 = (class61.field1121[3] & 0xFF << 16) + ((class61.field1121[4] & 0xFF) << 8) + (class61.field1121[5] & 0xFF);
                int var6 = (class61.field1121[2] & 0xFF) + ((class61.field1121[1] & 0xFF) << 8) + (class61.field1121[0] & 0xFF << 16);
                if (var6 < 0 || var6 > this.field854) {
                    return null;
                } else if (var5 > 0 && ((long) var5) <= (this.field852.method570((byte) -119) / 520L)) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var11) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field852.method562((long) (var5 * 520), -56);
                        int var13 = var6 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field852.method568(class61.field1121, (byte) -114, 0, var13 + 8);
                        int var14 = ((class61.field1121[2] & 0xFF) << 8) + (class61.field1121[3] & 0xFF);
                        int var15 = (class61.field1121[0] & 0xFF << 8) + (class61.field1121[1] & 0xFF);
                        int var16 = class61.field1121[7] & 0xFF;
                        int var17 = (class61.field1121[4] & 0xFF << 16) - (-(class61.field1121[5] & 0xFF << 8) - (class61.field1121[6] & 0xFF));
                        if (arg0 == var15 && var10 == var14 && this.field859 == var16) {
                            if (var17 >= 0 && ((long) var17) <= (this.field852.method570((byte) -120) / 520L)) {
                                var10++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var11++] = class61.field1121[var20 + 8];
                                }
                                var5 = var17;
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

    @OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field850++;
        return "Cache:" + this.field859;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(ILd;Ld;I)V")
    public class47(int arg0, class75 arg1, class75 arg2, int arg3) {
        this.field852 = arg1;
        this.field851 = arg2;
        this.field859 = arg0;
        this.field854 = arg3;
    }
}
