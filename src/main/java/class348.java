import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class348 extends class184 {

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "Z")
    private boolean field4884 = false;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "Z")
    private boolean field4889;

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "[Lni;")
    private class518[] field4872;

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "Lqaa;")
    public static class27 field4887 = new class27(48, 2);

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!tu", name = "B", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!tu", name = "C", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "Leha;")
    private class89 field4880;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZLeq;IZ)V", line = 6)
    public static final void method2182(int arg0, int arg1, boolean arg2, class209 arg3, int arg4, boolean arg5) {
        class187.method1325(0L, arg0, arg1, arg3, (byte) -114, arg2, arg4);
        if (arg5) {
            method2186(93, (byte) 45, -49);
        }
        ++field4870;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Liia;ZI)V", line = 23)
    public final void method700(class87 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field4880 = null;
        }
        super.field2626.method3425(arg0, -62);
        ++field4888;
        super.field2626.method3417(arg2, 0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V", line = 35)
    public final void method702(boolean arg0) {
        if (this.field4884) {
            if (!this.field4889) {
                super.field2626.method3413(2, 33984);
                super.field2626.method3425((class87) null, -55);
            }
            super.field2626.method3413(1, 33984);
            super.field2626.method3425((class87) null, 117);
            super.field2626.method3413(0, 33984);
            this.field4880.method834((byte) 105, '\u0001');
            this.field4884 = false;
        } else {
            super.field2626.method3453(7482, 5890, 0, 770);
        }
        ++field4881;
        if (!arg0) {
            this.method702(true);
        }
        super.field2626.method3485(8448, (byte) 95, 8448);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZIIIIIII)V", line = 66)
    public static final void method2183(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4878;
        if (!arg2) {
            if (~arg1 <= ~class156.field2337 && ~arg1 >= ~class612.field8854 && ~arg0 <= ~class156.field2337 && ~arg0 >= ~class612.field8854 && class156.field2337 <= arg8 && ~arg8 >= ~class612.field8854 && arg9 >= class156.field2337 && class612.field8854 >= arg9 && class558.field7940 <= arg7 && ~arg7 >= ~class748.field10458 && class558.field7940 <= arg6 && ~class748.field10458 <= ~arg6 && ~class558.field7940 >= ~arg3 && ~class748.field10458 <= ~arg3 && ~class558.field7940 >= ~arg4 && arg4 <= class748.field10458) {
                class681.method3848(arg0, arg1, arg9, arg5, (byte) -61, arg4, arg6, arg7, arg8, arg3);
            } else {
                class8.method42(arg7, arg3, arg4, arg1, arg8, (byte) 31, arg0, arg5, arg6, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)I", line = 83)
    public static final int method2184(int arg0, int arg1, int arg2) {
        ++field4874;
        if (~arg1 != -2 && ~arg1 != -4) {
            return arg0 != -3106 ? -45 : class250.field3568[3 & arg2];
        } else {
            return class411.field5691[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z", line = 99)
    public final boolean method698(int arg0) {
        if (arg0 != -20958) {
            this.field4884 = true;
        }
        ++field4871;
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)V", line = 111)
    public final void method705(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field4889 = false;
        }
        ++field4877;
        if (this.field4884) {
            super.field2626.method3413(1, 33984);
            super.field2626.method3425(this.field4872[arg1 - 1], -124);
            super.field2626.method3413(0, 33984);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V", line = 129)
    public static void method2185(byte arg0) {
        field4887 = null;
        if (arg0 != 72) {
            field4891 = -44;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Loea;)V", line = 141)
    public class348(class594 arg0) {
        super(arg0);
        if (arg0.field8606) {
            this.field4889 = ~arg0.field8622 > -4;
            int var2 = this.field4889 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (~var14 == -3) {
                                    var15 = var12;
                                } else if (var14 != 3) {
                                    if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var12;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field4872 = new class518[3];
            this.field4872[0] = new class518(super.field2626, 6406, 64, false, var4, 6406);
            this.field4872[1] = new class518(super.field2626, 6406, 64, false, var5, 6406);
            this.field4872[2] = new class518(super.field2626, 6406, 64, false, var3, 6406);
            this.method2188((byte) -90);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V", line = 254)
    public final void method704(boolean arg0, int arg1) {
        if (arg1 != -28981) {
            method2184(23, 32, 34);
        }
        super.field2626.method3485(8448, (byte) 68, 7681);
        ++field4879;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)Z", line = 270)
    public static final boolean method2186(int arg0, byte arg1, int arg2) {
        if (arg1 > -123) {
            method2189(21);
        }
        ++field4886;
        return ~(16 & arg0) != -1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIIBI)V", line = 282)
    public static final void method2187(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field4875;
        if (-arg1 + arg4 >= class156.field2337 && ~class612.field8854 <= ~(arg4 - -arg1) && ~(-arg1 + arg0) <= ~class558.field7940 && ~class748.field10458 <= ~(arg0 + arg1)) {
            class225.method1557(arg1, arg4, (byte) 0, arg2, arg0);
        } else {
            class647.method3673(arg2, arg1, -60, arg0, arg4);
        }
        if (arg3 <= 124) {
            method2187(100, -56, 127, (byte) -17, -83);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V", line = 299)
    public final void method699(int arg0, boolean arg1) {
        ++field4885;
        if (this.field4880 != null && arg1) {
            if (!this.field4889) {
                super.field2626.method3413(2, 33984);
                super.field2626.method3425(super.field2626.field8603, 83);
                super.field2626.method3413(0, 33984);
            }
            this.field4880.method834((byte) 105, '\u0000');
            this.field4884 = true;
        } else {
            super.field2626.method3453(7482, 34168, 0, 770);
        }
        if (arg0 >= -54) {
            this.method704(false, -45);
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V", line = 326)
    private final void method2188(byte arg0) {
        ++field4882;
        this.field4880 = new class89(super.field2626, 2);
        this.field4880.method836(4864, 0);
        super.field2626.method3413(1, 33984);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 != -90) {
            this.method699(85, false);
        }
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field4889) {
            super.field2626.method3485(7681, (byte) 55, 8448);
            super.field2626.method3464(0, 768, false, 34168);
            super.field2626.method3413(2, 33984);
            super.field2626.method3485(260, (byte) 42, 7681);
            super.field2626.method3464(0, 768, false, 34168);
            super.field2626.method3464(1, 770, false, 34168);
            super.field2626.method3453(arg0 + 7572, 34167, 0, 770);
        } else {
            super.field2626.method3485(260, (byte) 112, 7681);
            super.field2626.method3464(0, 770, false, 5890);
            super.field2626.method3453(7482, 34167, 0, 770);
        }
        super.field2626.method3413(0, 33984);
        this.field4880.method832(arg0 ^ -59);
        this.field4880.method836(4864, 1);
        super.field2626.method3413(1, arg0 ^ -33946);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field4889) {
            super.field2626.method3485(8448, (byte) 111, 8448);
            super.field2626.method3464(0, 768, false, 5890);
            super.field2626.method3453(arg0 ^ -7524, 5890, 0, 770);
        } else {
            super.field2626.method3485(8448, (byte) 114, 8448);
            super.field2626.method3464(0, 768, false, 5890);
            super.field2626.method3413(2, 33984);
            super.field2626.method3485(8448, (byte) 88, 8448);
            super.field2626.method3464(0, 768, false, 5890);
            super.field2626.method3464(1, 768, false, 34168);
            super.field2626.method3453(7482, 5890, 0, 770);
        }
        super.field2626.method3413(0, 33984);
        this.field4880.method832(arg0 ^ -59);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 399)
    public static final void method2189(int arg0) {
        ++field4876;
        class700.method3936((long) class605.field8787, 3259, class359.field5046);
        if (~class401.field5610 != 0) {
            class6.method35(false, class401.field5610);
        }
        for (int var1 = 0; class114.field1830 > var1; ++var1) {
            if (class329.field4646[var1]) {
                class443.field6170[var1] = true;
            }
            class280.field3932[var1] = class329.field4646[var1];
            class329.field4646[var1] = false;
        }
        int var2 = -113 % ((-66 - arg0) / 35);
        class214.field3063 = class605.field8787;
        if (~class401.field5610 != 0) {
            class114.field1830 = 0;
            class615.method3535(97);
        }
        class359.field5046.method601();
        class82.method801(class359.field5046, true);
        int var3 = class528.method3120((byte) 91);
        if (~var3 == 0) {
            var3 = class458.field6611;
        }
        if (var3 == -1) {
            var3 = class273.field3898;
        }
        class194.method1354((byte) 96, var3);
        class373.field5232 = 0;
    }
}
