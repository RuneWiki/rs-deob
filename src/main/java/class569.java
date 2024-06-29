import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class569 implements class301 {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lgaa;")
    private class267 field8017 = class69.field1245;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Llca;")
    public class597 field8018;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Z")
    private boolean field8023;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lig;")
    public class218 field8028;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    private int field8009;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field8011;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lhp;")
    public class296 field8007;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    private int field8021;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field8013 = 0;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lvg;")
    public static class49 field8022 = null;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Lwba;")
    public static class46 field8030;

    @OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.method3240(false);
        field8020++;
        super.finalize();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I", line = 14)
    public final int method3235(byte arg0) {
        field8026++;
        if (arg0 != 61) {
            this.field8009 = 97;
        }
        if (class218.field3050 == this.field8028) {
            if (class502.field7105 == this.field8018) {
                return 6407;
            }
            if (class75.field1306 == this.field8018) {
                return 6408;
            }
            if (class87.field1467 == this.field8018) {
                return 6406;
            }
            if (class547.field7690 == this.field8018) {
                return 6409;
            }
            if (class87.field1430 == this.field8018) {
                return 6410;
            }
            if (class2.field11 == this.field8018) {
                return 6145;
            }
        } else if (class218.field3053 == this.field8028) {
            if (class502.field7105 == this.field8018) {
                return 34843;
            }
            if (class75.field1306 == this.field8018) {
                return 34842;
            }
            if (class87.field1467 == this.field8018) {
                return 34844;
            }
            if (class547.field7690 == this.field8018) {
                return 34846;
            }
            if (class87.field1430 == this.field8018) {
                return 34847;
            }
            if (class2.field11 == this.field8018) {
                return 6145;
            }
        } else if (class218.field3054 == this.field8028) {
            if (class502.field7105 == this.field8018) {
                return 34837;
            }
            if (class75.field1306 == this.field8018) {
                return 34836;
            }
            if (class87.field1467 == this.field8018) {
                return 34838;
            }
            if (class547.field7690 == this.field8018) {
                return 34840;
            }
            if (class87.field1430 == this.field8018) {
                return 34841;
            }
            if (class2.field11 == this.field8018) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z", line = 111)
    public static final boolean method3236(int arg0, int arg1) {
        field8027++;
        class330.field4882 = true;
        if (arg0 != -13206) {
            field8030 = null;
        }
        class467.field6717 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V", line = 126)
    private final void method3237(int arg0, int arg1) {
        field8010++;
        this.field8007.field5629 -= arg0;
        if (arg1 != -1302694168) {
            field8013 = -59;
        }
        this.field8007.field5629 += this.method3244(false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqp;ILqp;)V", line = 140)
    public static final void method3238(class609 arg0, int arg1, class609 arg2) {
        if (arg0.field8563 != null) {
            arg0.method3414(0);
        }
        field8019++;
        arg0.field8563 = arg2.field8563;
        if (arg1 != -1777914136) {
            field8013 = 57;
        }
        arg0.field8562 = arg2;
        arg0.field8563.field8562 = arg0;
        arg0.field8562.field8563 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V", line = 158)
    private final void method3239(boolean arg0) {
        field8029++;
        this.field8007.method2337(arg0, this);
        if (class69.field1245 == this.field8017) {
            OpenGL.glTexParameteri(this.field8011, 10241, this.field8023 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8011, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8011, 10241, this.field8023 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8011, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(Z)V", line = 179)
    private final void method3240(boolean arg0) {
        if (arg0) {
            this.method3239(false);
        }
        if (this.field8021 > 0) {
            this.field8007.method1909(this.field8021, this.method3244(false), 6049);
            this.field8021 = 0;
        }
        field8015++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[BZI)V", line = 195)
    public final void method3241(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        field8016++;
        if (arg4 > 0 && !class284.method1835(arg4, 61)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class284.method1835(arg1, 118)) {
            int var6 = this.field8018.field8431;
            int var7 = 0;
            int var8 = arg4 < arg1 ? arg4 : arg1;
            int var9 = arg4 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg2;
            if (!arg3) {
                this.field8009 = -107;
            }
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var7, this.method3235((byte) 61), arg4, arg1, 0, class351.method2159(this.field8018, (byte) 77), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
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
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                var11 = var14;
                arg1 = var10;
                arg4 = var9;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lgaa;I)V", line = 294)
    public final void method54(class267 arg0, int arg1) {
        field8012++;
        if (this.field8017 != arg0) {
            this.field8017 = arg0;
            this.method3239(false);
        }
        if (arg1 != -26149) {
            this.field8009 = -128;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)I", line = 314)
    public static final int method3242(int arg0, int arg1) {
        field8024++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < arg1) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 329)
    public static final void method3243(int arg0) {
        field8014++;
        class623.field8731 = false;
        if (arg0 != 23509) {
            field8022 = null;
        }
        class349.method2156(0, class101.field1573, class352.field5079, class450.field6490, class70.field1246);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 347)
    public final void method861(int arg0) {
        field8008++;
        int var2 = this.field8007.method2331((byte) 117);
        if (arg0 > -42) {
            this.method3237(-120, -103);
        }
        int var3 = this.field8007.field4442[var2];
        if (this.field8011 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field8011);
            this.field8007.field4442[var2] = this.field8011;
        }
        OpenGL.glBindTexture(this.field8011, this.field8021);
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(Z)I", line = 387)
    private final int method3244(boolean arg0) {
        field8006++;
        if (arg0) {
            return 28;
        } else {
            int var2 = this.field8018.field8431 * this.field8009 * this.field8028.field3046;
            return this.field8023 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 400)
    public static void method3245(byte arg0) {
        field8030 = null;
        if (arg0 != -59) {
            field8030 = null;
        }
        field8022 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[FBII)V", line = 412)
    public final void method3246(int arg0, float[] arg1, byte arg2, int arg3, int arg4) {
        field8005++;
        if (arg0 > 0 && !class284.method1835(arg0, 119)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class284.method1835(arg3, 89)) {
            int var6 = this.field8018.field8431;
            int var7 = 0;
            int var8 = arg0 >= arg3 ? arg3 : arg0;
            if (arg2 > -102) {
                this.method3247(null, 63, -33, 0, 64);
            }
            int var9 = arg0 >> 1;
            int var10 = arg3 >> 1;
            float[] var11 = arg1;
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method3235((byte) 61), arg0, arg3, 0, class351.method2159(this.field8018, (byte) 112), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                float[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var15 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                var12 = var11;
                arg3 = var10;
                arg0 = var9;
                var11 = var14;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([IIIII)V", line = 508)
    public final void method3247(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field8025++;
        if (arg1 > 0 && !class284.method1835(arg1, arg2 ^ 0x80)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class284.method1835(arg3, 45)) {
            throw new IllegalArgumentException("");
        } else if (class75.field1306 == this.field8018) {
            int var6 = 0;
            if (arg2 == 255) {
                int var7 = arg3 <= arg1 ? arg3 : arg1;
                int var8 = arg1 >> 1;
                int var9 = arg3 >> 1;
                int[] var10 = arg0;
                int[] var11 = new int[var8 * var9];
                while (true) {
                    OpenGL.glTexImage2Di(arg4, var6, this.method3235((byte) 61), arg1, arg3, 0, 32993, this.field8007.field4441, var10, 0);
                    if (var7 <= 1) {
                        return;
                    }
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = var13 + arg1;
                    for (int var15 = 0; var15 < var9; var15++) {
                        for (int var17 = 0; var17 < var8; var17++) {
                            int var18 = var10[var13++];
                            int var19 = var10[var14++];
                            int var20 = var10[var13++];
                            int var21 = var18 >> 16 & 0xFF;
                            int var22 = var18 & 0xFF;
                            int var23 = var10[var14++];
                            int var24 = var18 >> 8 & 0xFF;
                            int var25 = var18 >> 24 & 0xFF;
                            int var26 = (var20 >> 16 & 0xFF) + var21;
                            int var27 = ((var20 & 0xFFBF) >> 8) + var24;
                            int var28 = (var20 & 0xFF) + var22;
                            int var29 = (var20 >> 24 & 0xFF) + var25;
                            int var30 = ((var19 & 0xFFE622) >> 16) + var26;
                            int var31 = (var19 >> 24 & 0xFF) + var29;
                            int var32 = (var19 & 0xFF) + var28;
                            int var33 = ((var19 & 0xFF62) >> 8) + var27;
                            int var34 = (var23 >> 24 & 0xFF) + var31;
                            int var35 = ((var23 & 0xFFA8) >> 8) + var33;
                            int var36 = ((var23 & 0xFF088A) >> 16) + var30;
                            int var37 = (var23 & 0xFF) + var32;
                            var11[var12++] = class486.method2826(class486.method2826(class689.method3797(var35, 1020) << 6, class486.method2826(class689.method3797(1020, var34) << 22, class689.method3797(var36, 1020) << 14)), class689.method3797(var37 >> 2, 255));
                        }
                        var14 += arg1;
                        var13 += arg1;
                    }
                    int[] var16 = var11;
                    var11 = var10;
                    arg3 = var9;
                    arg1 = var8;
                    var10 = var16;
                    var9 >>= 0x1;
                    var6++;
                    var8 >>= 0x1;
                    var7 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lhp;ILlca;Lig;IZ)V", line = 628)
    public class569(class296 arg0, int arg1, class597 arg2, class218 arg3, int arg4, boolean arg5) {
        this.field8018 = arg2;
        this.field8023 = arg5;
        this.field8028 = arg3;
        this.field8009 = arg4;
        this.field8011 = arg1;
        this.field8007 = arg0;
        OpenGL.glGenTextures(1, class385.field5430, 0);
        this.field8021 = class385.field5430[0];
        this.method3239(false);
        this.method3237(0, -1302694168);
    }
}
