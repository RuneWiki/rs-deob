import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class192 implements class663 {

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Lej;")
    private class123 field2915 = class395.field5936;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Z")
    private boolean field2911;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lpd;")
    public class259 field2904;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lok;")
    public class256 field2899;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    private int field2909;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lno;")
    public class704 field2896;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
    public static int[] field2905;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I", line = 5)
    public final int method1330(byte arg0) {
        field2913++;
        if (arg0 != -37) {
            this.method1334(21, (byte) 122);
        }
        if (class256.field3677 == this.field2899) {
            if (class505.field7177 == this.field2904) {
                return 6407;
            }
            if (class752.field10511 == this.field2904) {
                return 6408;
            }
            if (class39.field413 == this.field2904) {
                return 6406;
            }
            if (class478.field6935 == this.field2904) {
                return 6409;
            }
            if (class683.field9458 == this.field2904) {
                return 6410;
            }
            if (class375.field5682 == this.field2904) {
                return 6145;
            }
        } else if (class256.field3680 == this.field2899) {
            if (class505.field7177 == this.field2904) {
                return 34843;
            }
            if (class752.field10511 == this.field2904) {
                return 34842;
            }
            if (class39.field413 == this.field2904) {
                return 34844;
            }
            if (class478.field6935 == this.field2904) {
                return 34846;
            }
            if (class683.field9458 == this.field2904) {
                return 34847;
            }
            if (class375.field5682 == this.field2904) {
                return 6145;
            }
        } else if (class256.field3681 == this.field2899) {
            if (class505.field7177 == this.field2904) {
                return 34837;
            }
            if (class752.field10511 == this.field2904) {
                return 34836;
            }
            if (class39.field413 == this.field2904) {
                return 34838;
            }
            if (class478.field6935 == this.field2904) {
                return 34840;
            }
            if (class683.field9458 == this.field2904) {
                return 34841;
            }
            if (class375.field5682 == this.field2904) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[FII)V", line = 102)
    public final void method1331(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field2901++;
        if (arg0 > 0 && !class627.method3619(arg4 + 17874, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class627.method3619(2, arg3)) {
            int var6 = this.field2904.field3704;
            int var7 = 0;
            int var8 = arg3 > arg0 ? arg0 : arg3;
            int var9 = arg0 >> 1;
            int var10 = arg3 >> 1;
            float[] var11 = arg2;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var7, this.method1330((byte) -37), arg0, arg3, 0, class489.method2929(this.field2904, 6407), 5126, var11, 0);
                if (var8 <= 1) {
                    if (arg4 != -17872) {
                        this.field2909 = 70;
                        return;
                    }
                    return;
                }
                int var13 = arg0 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg3 = var10;
                var11 = var15;
                arg0 = var9;
                var9 >>= 0x1;
                var7++;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BII)V", line = 198)
    public final void method1332(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field2908++;
        if (arg1 > 0 && !class627.method3619(2, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class627.method3619(2, arg3)) {
            int var6 = this.field2904.field3704;
            if (arg0 > -7) {
                method1336(27, 0.70098984F, -0.100186385F, 0.8010463F);
            }
            int var7 = 0;
            int var8 = arg3 <= arg1 ? arg3 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg2;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method1330((byte) -37), arg1, arg3, 0, class489.method2929(this.field2904, 6407), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                arg3 = var10;
                var11 = var14;
                arg1 = var9;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 295)
    private final void method1333(int arg0) {
        this.field2896.method2294(this, -2);
        field2906++;
        if (arg0 != 10241) {
            this.field2915 = null;
        }
        if (class395.field5936 == this.field2915) {
            OpenGL.glTexParameteri(this.field2907, 10241, this.field2911 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2907, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2907, 10241, this.field2911 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2907, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V", line = 321)
    private final void method1334(int arg0, byte arg1) {
        if (arg1 > 119) {
            this.field2896.field5532 -= arg0;
            field2903++;
            this.field2896.field5532 += this.method1337((byte) -101);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 334)
    public final void method1335(int arg0) {
        if (arg0 != 193) {
            return;
        }
        field2898++;
        int var2 = this.field2896.method2419(51);
        int var3 = this.field2896.field9920[var2];
        if (this.field2907 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field2907);
            this.field2896.field9920[var2] = this.field2907;
        }
        OpenGL.glBindTexture(this.field2907, this.field2897);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IFFF)I", line = 363)
    public static final int method1336(int arg0, float arg1, float arg2, float arg3) {
        field2914++;
        float var4 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var5 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (arg0 != 10264) {
            field2905 = null;
        }
        if (var5 > var4 && var6 < var5) {
            return arg2 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg3 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I", line = 409)
    private final int method1337(byte arg0) {
        field2895++;
        if (arg0 > -70) {
            this.method1339(false);
        }
        int var2 = this.field2904.field3704 * this.field2899.field3673 * this.field2909;
        return this.field2911 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIIB)V", line = 422)
    public final void method1338(int[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = -77 % ((-arg4 - 35) / 34);
        field2912++;
        if (arg1 > 0 && !class627.method3619(2, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class627.method3619(2, arg2)) {
            throw new IllegalArgumentException("");
        } else if (class752.field10511 == this.field2904) {
            int var7 = 0;
            int var8 = arg2 <= arg1 ? arg2 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg2 >> 1;
            int[] var11 = arg0;
            int[] var12 = new int[var9 * var10];
            while (true) {
                OpenGL.glTexImage2Di(arg3, var7, this.method1330((byte) -37), arg1, arg2, 0, 32993, this.field2896.field9922, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = 0;
                int var14 = 0;
                int var15 = arg1 + var14;
                int[] var16 = var12;
                for (int var17 = 0; var17 < var10; var17++) {
                    for (int var18 = 0; var18 < var9; var18++) {
                        int var19 = var11[var14++];
                        int var20 = var11[var15++];
                        int var21 = var11[var14++];
                        int var22 = var19 >> 8 & 0xFF;
                        int var23 = var11[var15++];
                        int var24 = var19 & 0xFF;
                        int var25 = var19 >> 16 & 0xFF;
                        int var26 = var19 >> 24 & 0xFF;
                        int var27 = (var21 >> 24 & 0xFF) + var26;
                        int var28 = (var21 & 0xFF) + var24;
                        int var29 = ((var21 & 0xFF81E0) >> 16) + var25;
                        int var30 = ((var21 & 0xFFF8) >> 8) + var22;
                        int var31 = (var20 >> 16 & 0xFF) + var29;
                        int var32 = (var20 & 0xFF) + var28;
                        int var33 = (var20 >> 24 & 0xFF) + var27;
                        int var34 = ((var20 & 0xFF1F) >> 8) + var30;
                        int var35 = (var23 >> 24 & 0xFF) + var33;
                        int var36 = ((var23 & 0xFFD1) >> 8) + var34;
                        int var37 = ((var23 & 0xFF79D9) >> 16) + var31;
                        int var38 = (var23 & 0xFF) + var32;
                        var12[var13++] = class625.method3600(class625.method3600(class493.method2943(var36, 1020) << 6, class625.method3600(class493.method2943(var37 << 14, 16711680), class493.method2943(var35 << 22, -16777216))), class493.method2943(1020, var38) >> 2);
                    }
                    var14 += arg1;
                    var15 += arg1;
                }
                var12 = var11;
                arg1 = var9;
                var11 = var16;
                arg2 = var10;
                var9 >>= 0x1;
                var7++;
                var8 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V", line = 528)
    private final void method1339(boolean arg0) {
        field2902++;
        if (this.field2897 > 0) {
            this.field2896.method4005(this.method1337((byte) -86), 0, this.field2897);
            this.field2897 = 0;
        }
        if (!arg0) {
            this.method1338(null, -118, -95, -10, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V", line = 549)
    public static final void method1340(int arg0, byte arg1, int arg2) {
        if (arg1 >= -57) {
            method1340(-51, (byte) 4, 15);
        }
        field2910++;
        class150 var3 = class676.method3885(1000, 1, arg0);
        var3.method1116(82);
        var3.field2346 = arg2;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V", line = 563)
    public static void method1341(byte arg0) {
        if (arg0 >= -19) {
            field2905 = null;
        }
        field2905 = null;
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 573)
    protected final void finalize() throws Throwable {
        field2900++;
        this.method1339(true);
        super.finalize();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLej;)V", line = 582)
    public final void method1342(byte arg0, class123 arg1) {
        if (arg0 < 33) {
            return;
        }
        field2916++;
        if (this.field2915 != arg1) {
            this.field2915 = arg1;
            this.method1333(10241);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lno;ILpd;Lok;IZ)V", line = 611)
    public class192(class704 arg0, int arg1, class259 arg2, class256 arg3, int arg4, boolean arg5) {
        this.field2911 = arg5;
        this.field2904 = arg2;
        this.field2899 = arg3;
        this.field2909 = arg4;
        this.field2907 = arg1;
        this.field2896 = arg0;
        OpenGL.glGenTextures(1, class466.field6829, 0);
        this.field2897 = class466.field6829[0];
        this.method1333(10241);
        this.method1334(0, (byte) 123);
    }
}
