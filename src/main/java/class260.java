import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class260 {

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public int field4014;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public int field4011;

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4020 = new String[] { method2195(method2194("N}v\u000bu\u0005")), method2195(method2194("N}v\u000br\u0005")), method2195(method2194("N}v\u000b\u000bDp~Q\t\u0005")), method2195(method2194("N}v\u000bt\u0005")), method2195(method2194("Ck{I")), method2195(method2194("V09\u000bJ")), method2195(method2194("N}v\u000bs\u0005")), method2195(method2194("N}v\u000bv\u0005")) };

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "[[I")
    public static int[][] field4016 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lfq;B)V")
    public static final void method2189(class213 arg0, byte arg1) {
        try {
            if (arg0.field3261 != null) {
                arg0.field3261.field368 = 0;
            }
            field4015++;
            int var2 = -12 / ((arg1 - 64) / 54);
            arg0.field3264 = false;
            for (class213 var3 = arg0.method1158(); var3 != null; var3 = arg0.method1151()) {
                method2189(var3, (byte) 125);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4020[6] + (arg0 == null ? field4020[4] : field4020[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)Z")
    public final boolean method2190(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg1 > -67) {
                return true;
            }
            field4013++;
            if (this.field4019 > arg3 || this.field4011 < arg3) {
                return false;
            } else if (arg2 < this.field4014 || this.field4005 < arg2) {
                return false;
            } else if (arg0 >= this.field4010 && arg0 <= this.field4009) {
                int var5 = arg3 - this.field4008;
                int var6 = arg0 - this.field4018;
                return this.field4012 > (var5 * var5 + var6 * var6);
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4020[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIIZIIIII)V")
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            this.field4012 = arg0 * arg0;
            this.field4007 = arg7;
            this.field4018 = arg4;
            field4017++;
            this.field4008 = arg3;
            if (arg5) {
                this.field4018 = -75;
            }
            this.field4011 = this.field4008 + arg10;
            this.field4019 = this.field4008 + arg6;
            this.field4005 = this.field4007 + arg2;
            this.field4010 = this.field4018 + arg8;
            this.field4014 = this.field4007 + arg9;
            this.field4009 = this.field4018 + arg1;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4020[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
    public static void method2192(int arg0) {
        try {
            if (arg0 != -13936) {
                field4016 = null;
            }
            field4016 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4020[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)I")
    public static final int method2193(int arg0, int arg1) {
        try {
            field4004++;
            double var2 = (double) ((arg1 & arg0) >> 16) / 256.0D;
            double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
            double var6 = (double) (arg0 & 0xFF) / 256.0D;
            double var8 = var2;
            if (var2 > var4) {
                var8 = var4;
            }
            if (var8 > var6) {
                var8 = var6;
            }
            double var10 = var2;
            if (var2 < var4) {
                var10 = var4;
            }
            if (var10 < var6) {
                var10 = var6;
            }
            double var12 = 0.0D;
            double var14 = 0.0D;
            double var16 = (var8 + var10) / 2.0D;
            if (var8 != var10) {
                if (var16 < 0.5D) {
                    var14 = (var10 - var8) / (var8 + var10);
                }
                if (var16 >= 0.5D) {
                    var14 = (var10 - var8) / (2.0D - var10 - var8);
                }
                if (var2 == var10) {
                    var12 = (var4 - var6) / (var10 - var8);
                } else if (var4 == var10) {
                    var12 = (var6 - var2) / (var10 - var8) + 2.0D;
                } else if (var6 == var10) {
                    var12 = (var2 - var4) / (var10 - var8) + 4.0D;
                }
            }
            double var18 = var12 / 6.0D;
            int var20 = (int) (var18 * 256.0D);
            int var21 = (int) (var14 * 256.0D);
            int var22 = (int) (var16 * 256.0D);
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > 255) {
                var22 = 255;
            }
            if (var22 > 243) {
                var21 >>= 0x4;
            } else if (var22 > 217) {
                var21 >>= 0x3;
            } else if (var22 > 192) {
                var21 >>= 0x2;
            } else if (var22 > 179) {
                var21 >>= 0x1;
            }
            return ((var20 >> 2 & 0x3F) << 10) + ((var21 >> 5 << 7) + (var22 >> 1));
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field4020[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            this.field4012 = arg3 * arg3;
            this.field4007 = arg1;
            this.field4018 = arg2;
            this.field4008 = arg0;
            this.field4014 = this.field4007 + arg6;
            this.field4009 = this.field4018 + arg9;
            this.field4005 = this.field4007 + arg7;
            this.field4010 = this.field4018 + arg8;
            this.field4019 = this.field4008 + arg4;
            this.field4011 = this.field4008 + arg5;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field4020[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2194(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2195(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
