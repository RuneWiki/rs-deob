import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class381 {

    @OriginalMember(owner = "client!uia", name = "i", descriptor = "Lwq;")
    private class178 field5779 = new class178(64);

    @OriginalMember(owner = "client!uia", name = "j", descriptor = "Lwq;")
    public class178 field5785 = new class178(2);

    @OriginalMember(owner = "client!uia", name = "h", descriptor = "Lla;")
    private class476 field5776;

    @OriginalMember(owner = "client!uia", name = "f", descriptor = "Lla;")
    public class476 field5781;

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5787 = new String[] { method3061(method3060("sJ@+-.")), method3061(method3060("sJ@+ToMHqV.")), method3061(method3060("hVMi")), method3061(method3060("}\r\u000f+\u0015")), method3061(method3060("sJ@++.")), method3061(method3060("sJ@+..")), method3061(method3060("sJ@+*.")), method3061(method3060("sJ@+).")), method3061(method3060("sJ@+,.")), method3061(method3060("sJ@+/.")) };

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "Lpda;")
    public static class655 field5783 = null;

    @OriginalMember(owner = "client!uia", name = "g", descriptor = "Lib;")
    public static class163 field5777 = new class163(1350);

    @OriginalMember(owner = "client!uia", name = "m", descriptor = "I")
    public static int field5786 = 100;

    @OriginalMember(owner = "client!uia", name = "k", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!uia", name = "l", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIIII[FI)V", line = 6)
    public static final void method3053(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
        try {
            field5782++;
            if (arg2 > 0 && !class40.method269(arg2, arg4 ^ 0xFFFFFF94)) {
                throw new IllegalArgumentException("");
            } else if (arg1 <= 0 || class40.method269(arg1, 98)) {
                int var7 = class673.method4947(arg3, true);
                if (arg4 != -2) {
                    field5777 = null;
                }
                int var8 = 0;
                int var9 = arg2 < arg1 ? arg2 : arg1;
                int var10 = arg2 >> 1;
                int var11 = arg1 >> 1;
                float[] var12 = arg5;
                float[] var13 = new float[var7 * var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Df(arg0, var8, arg6, arg2, arg1, 0, arg3, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg2 * var7;
                    for (int var15 = 0; var15 < var7; var15++) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var14 + var15;
                        for (int var19 = 0; var19 < var11; var19++) {
                            for (int var20 = 0; var20 < var10; var20++) {
                                float var21 = var12[var17];
                                int var22 = var7 + var17;
                                float var23 = var12[var22] + var21;
                                float var24 = var12[var18] + var23;
                                var17 = var7 + var22;
                                int var25 = var7 + var18;
                                float var26 = var12[var25] + var24;
                                var18 = var7 + var25;
                                var13[var16] = var26 * 0.25F;
                                var16 += var7;
                            }
                            var17 += var14;
                            var18 += var14;
                        }
                    }
                    float[] var27 = var13;
                    var13 = var12;
                    arg1 = var11;
                    var12 = var27;
                    arg2 = var10;
                    var11 >>= 0x1;
                    var10 >>= 0x1;
                    var9 >>= 0x1;
                    var8++;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field5787[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5787[2] : field5787[3]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)V", line = 105)
    public static void method3054(byte arg0) {
        try {
            field5777 = null;
            int var1 = 74 % ((arg0 - 14) / 49);
            field5783 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5787[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IZ)Lad;", line = 117)
    public final class446 method3055(int arg0, boolean arg1) {
        try {
            field5784++;
            class178 var3 = this.field5779;
            class446 var4;
            synchronized (this.field5779) {
                var4 = (class446) this.field5779.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field5776;
            byte[] var6;
            synchronized (this.field5776) {
                var6 = this.field5776.method3632(33, arg0, 14);
            }
            class446 var7 = new class446();
            var7.field6541 = this;
            if (var6 != null) {
                var7.method3427((byte) 12, new class163(var6));
            }
            class178 var8 = this.field5779;
            synchronized (this.field5779) {
                this.field5779.method1556((long) arg0, var7, 1);
                if (arg1) {
                    this.method3058(-21, 27);
                }
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5787[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)V", line = 149)
    public final void method3056(byte arg0) {
        try {
            field5780++;
            class178 var2 = this.field5779;
            synchronized (this.field5779) {
                this.field5779.method1559(0);
            }
            class178 var3 = this.field5785;
            synchronized (this.field5785) {
                this.field5785.method1559(0);
            }
            if (arg0 != -112) {
                field5786 = 55;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5787[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)V", line = 169)
    public static final void method3057(int arg0) {
        try {
            field5774++;
            if (class172.field2403 == null) {
                class172.field2403 = new int[65536];
                double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
                if (arg0 != 6) {
                    method3054((byte) 108);
                }
                for (int var3 = 0; var3 < 65536; var3++) {
                    double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
                    double var6 = (double) ((var3 & 0x38E) >> 7) / 8.0D + 0.0625D;
                    double var8 = (double) (var3 & 0x7F) / 128.0D;
                    double var10 = var8;
                    double var12 = var8;
                    double var14 = var8;
                    if (var6 != 0.0D) {
                        double var16;
                        if ((var8 < 0.5D)) {
                            var16 = (var6 + 1.0D) * var8;
                        } else {
                            var16 = var6 + var8 - var6 * var8;
                        }
                        double var18 = var8 * 2.0D - var16;
                        double var20 = var4 + 0.3333333333333333D;
                        if (var20 > 1.0D) {
                            var20--;
                        }
                        double var24 = var4 - 0.3333333333333333D;
                        if ((var4 * 6.0D < 1.0D)) {
                            var12 = (var16 - var18) * 6.0D * var4 + var18;
                        } else if ((var4 * 2.0D < 1.0D)) {
                            var12 = var16;
                        } else if ((var4 * 3.0D < 2.0D)) {
                            var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                        } else {
                            var12 = var18;
                        }
                        if (var20 * 6.0D < 1.0D) {
                            var10 = (var16 - var18) * 6.0D * var20 + var18;
                        } else if (var20 * 2.0D < 1.0D) {
                            var10 = var16;
                        } else if ((var20 * 3.0D < 2.0D)) {
                            var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                        } else {
                            var10 = var18;
                        }
                        if (var24 < 0.0D) {
                            var24++;
                        }
                        if ((var24 * 6.0D < 1.0D)) {
                            var14 = (var16 - var18) * 6.0D * var24 + var18;
                        } else if (var24 * 2.0D < 1.0D) {
                            var14 = var16;
                        } else if (var24 * 3.0D < 2.0D) {
                            var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                        } else {
                            var14 = var18;
                        }
                    }
                    double var26 = Math.pow(var10, var1);
                    double var28 = Math.pow(var12, var1);
                    double var30 = Math.pow(var14, var1);
                    int var32 = (int) (var26 * 256.0D);
                    int var33 = (int) (var28 * 256.0D);
                    int var34 = (int) (var30 * 256.0D);
                    int var35 = (var32 << 16) + (var33 << 8) + var34;
                    class172.field2403[var3] = var35;
                }
            }
        } catch (RuntimeException var37) {
            throw class759.method5498(var37, field5787[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)V", line = 285)
    public final void method3058(int arg0, int arg1) {
        try {
            class178 var3 = this.field5779;
            synchronized (this.field5779) {
                this.field5779.method1557(arg0, (byte) -119);
            }
            if (arg1 != 2) {
                field5777 = null;
            }
            field5778++;
            class178 var4 = this.field5785;
            synchronized (this.field5785) {
                this.field5785.method1557(arg0, (byte) -121);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5787[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 301)
    public final void method3059(int arg0) {
        try {
            field5775++;
            class178 var2 = this.field5779;
            synchronized (this.field5779) {
                this.field5779.method1569(10574);
                if (arg0 > -102) {
                    field5777 = null;
                }
            }
            class178 var3 = this.field5785;
            synchronized (this.field5785) {
                this.field5785.method1569(10574);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5787[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Lto;ILla;Lla;)V", line = 335)
    public class381(class8 arg0, int arg1, class476 arg2, class476 arg3) {
        try {
            this.field5776 = arg2;
            this.field5781 = arg3;
            this.field5776.method3646(33, (byte) -123);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5787[1] + (arg0 == null ? field5787[2] : field5787[3]) + ',' + arg1 + ',' + (arg2 == null ? field5787[2] : field5787[3]) + ',' + (arg3 == null ? field5787[2] : field5787[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3060(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3061(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
