import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class418 extends class555 {

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Lqi;")
    private class510 field5487;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "Lln;")
    private class96 field5494;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lqaa;")
    private class133 field5495;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field5499 = null;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Lve;")
    public static class244 field5488 = new class244(0, 0);

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "[I")
    public static int[] field5503 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Lga;")
    public static class332 field5501;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "Lwv;")
    public static class423 field5502;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIII)V", line = 4)
    public static final void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != -12139) {
            method2366(29);
        }
        class452.method2540(arg3, 0, arg8, arg0, arg5, arg2, arg7, arg1, arg4, arg6 ^ -11627);
        ++field5486;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)V", line = 17)
    public static void method2366(int arg0) {
        field5501 = null;
        field5502 = null;
        field5488 = null;
        if (arg0 != 0) {
            method2366(3);
        }
        field5503 = null;
        field5499 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V", line = 34)
    public final void method124(boolean arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field5495.field1847);
        ++field5491;
        OpenGL.glEnable(34336);
        if (arg0) {
            super.field7580.method3624(class533.field7324, -117, 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 47)
    public final void method121(byte arg0) {
        if (arg0 <= 45) {
            field5499 = null;
        }
        super.field7580.method3624(class630.field8719, -128, 0);
        ++field5496;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V", line = 62)
    public final void method117(boolean arg0, int arg1) {
        ++field5490;
        super.field7580.method3672((byte) -111, class297.field3927, class298.field3941);
        if (arg1 != -13443) {
            this.method121((byte) 59);
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 77)
    public static final void method2367(byte arg0) {
        ++field5493;
        int var1 = class289.field3807.method963(-123);
        boolean var2 = ~class289.field3807.method930(255) == -2;
        int var3 = class289.field3807.method954(2);
        int var4 = class289.field3807.method945((byte) -114);
        class391.field5236 = class289.field3807.method930(255);
        class645.method3589(82);
        class5.method33((byte) 51, var4);
        if (arg0 >= -87) {
            method2368(30, 78, 6, 0, -6);
        }
        class289.field3807.method3011(-1);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; ~var20 > ~(class703.field9886 >> 3); ++var20) {
                for (int var21 = 0; class431.field5789 >> 3 > var21; ++var21) {
                    int var22 = class289.field3807.method3008(false, 1);
                    if (~var22 != -2) {
                        class328.field4408[var5][var20][var21] = -1;
                    } else {
                        class328.field4408[var5][var20][var21] = class289.field3807.method3008(false, 26);
                    }
                }
            }
        }
        class289.field3807.method3016(75);
        int var6 = (class151.field2070 - class289.field3807.field2219) / 16;
        class581.field7947 = new int[var6][4];
        for (int var7 = 0; var6 > var7; ++var7) {
            for (int var19 = 0; var19 < 4; ++var19) {
                class581.field7947[var7][var19] = class289.field3807.method908(false);
            }
        }
        class245.field3207 = new int[var6];
        class361.field4785 = new byte[var6][];
        class229.field2972 = new int[var6];
        class37.field506 = new byte[var6][];
        class552.field7545 = new int[var6];
        class126.field1760 = new int[var6];
        class311.field4201 = new int[var6];
        class297.field3929 = new byte[var6][];
        class191.field2645 = null;
        class502.field6923 = null;
        class611.field8486 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; ++var9) {
            for (int var10 = 0; ~(class703.field9886 >> 3) < ~var10; ++var10) {
                for (int var11 = 0; ~(class431.field5789 >> 3) < ~var11; ++var11) {
                    int var12 = class328.field4408[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 16772364) >> 14;
                        int var14 = var12 >> 3 & 2047;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var8 > var16; ++var16) {
                            if (~class126.field1760[var16] == ~var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (~var15 != 0) {
                            class126.field1760[var8] = var15;
                            int var17 = 255 & var15 >> 8;
                            int var18 = var15 & 255;
                            class245.field3207[var8] = class543.field7433.method1959(5743, "m" + var17 + "_" + var18);
                            class229.field2972[var8] = class543.field7433.method1959(5743, "l" + var17 + "_" + var18);
                            class552.field7545[var8] = class543.field7433.method1959(5743, "um" + var17 + "_" + var18);
                            class311.field4201[var8] = class543.field7433.method1959(5743, "ul" + var17 + "_" + var18);
                            ++var8;
                        }
                    }
                }
            }
        }
        class96.method545(11, var3, (byte) 17, var1, var2);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 227)
    public final void method126(int arg0, int arg1, int arg2) {
        ++field5492;
        if (!this.field5494.field1153) {
            int var4 = super.field7580.field9245 % 4000 * 16 / 4000;
            super.field7580.method3613((byte) 103, this.field5494.field1160[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field7580.field9245 % 4000) / 4000.0F;
            super.field7580.method3613((byte) 96, this.field5494.field1155);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg0 <= 81) {
            method2366(59);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lot;BI)V", line = 261)
    public final void method127(class222 arg0, byte arg1, int arg2) {
        ++field5498;
        if (arg1 >= -93) {
            this.field5495 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V", line = 271)
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5497;
        if (arg3 != 34336) {
            method2366(-114);
        }
        class256 var5 = class592.method3279((byte) -40, 8, arg0);
        var5.method1549(arg3 ^ -64266);
        var5.field3358 = arg2;
        var5.field3354 = arg1;
        var5.field3359 = arg4;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z", line = 287)
    public final boolean method125(int arg0) {
        ++field5489;
        if (arg0 != -20112) {
            field5503 = null;
        }
        return this.field5495 != null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lqi;Lga;Lln;)V", line = 299)
    public class418(class510 arg0, class332 arg1, class96 arg2) {
        super(arg0);
        this.field5487 = arg0;
        this.field5494 = arg2;
        if (arg1 != null && this.field5494.method544((byte) -122) && this.field5487.field7134) {
            this.field5495 = class85.method466(2251, arg1.method1947(5, "transparent_water", "gl"), 34336, this.field5487);
        } else {
            this.field5495 = null;
        }
    }
}
