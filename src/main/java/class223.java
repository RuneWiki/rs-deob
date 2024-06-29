import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class223 extends class532 {

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[F")
    private float[] field2594 = new float[4];

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Z")
    private boolean field2597 = false;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Laja;")
    private class100 field2601;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Laja;")
    private class100 field2605;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Laja;")
    private class100 field2602;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Laja;")
    private class100 field2596;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "Z")
    private boolean field2613;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lada;")
    private class175 field2590;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field2604 = 100;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field2607 = 1338;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "[I")
    public static int[] field2591 = new int[32];

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Z")
    private boolean field2598;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Z")
    private boolean field2603;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 7)
    public final void method1371(int arg0) {
        if (arg0 != 64) {
            field2607 = -118;
        }
        ++field2606;
        int var2 = super.field7494.method2668((byte) -78);
        class256 var3 = super.field7494.method2713(-6057);
        if (!this.field2603) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field2602.field1302 : this.field2601.field1302);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field2596.field1302 : this.field2605.field1302);
        }
        OpenGL.glEnable(34336);
        this.field2598 = true;
        var3.method1521(-1.0F, (byte) 89, (float) var2, 0.0F, 0.0F, this.field2594);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field2594[0], this.field2594[1], this.field2594[2], this.field2594[3]);
        this.method705(arg0 + 1516);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILkq;IILaa;ZLha;II)V", line = 38)
    public static final void method1372(int arg0, class620 arg1, int arg2, int arg3, class513 arg4, boolean arg5, class66 arg6, int arg7, int arg8) {
        ++field2599;
        class305 var9 = class2.field33.method4140(36, arg7);
        if (var9 != null && var9.field3660 && var9.method1763((byte) 126, class2.field30)) {
            if (var9.field3644 != null) {
                int[] var10 = new int[var9.field3644.length];
                for (int var11 = 0; var10.length / 2 > var11; ++var11) {
                    int var28;
                    if (class7.field100 != 4) {
                        var28 = 16383 & (int) class47.field626 - -class579.field7884;
                    } else {
                        var28 = 16383 & (int) class47.field626;
                    }
                    int var29 = class789.field10868[var28];
                    int var30 = class789.field10864[var28];
                    if (~class7.field100 != -5) {
                        var30 = var30 * 256 / (class251.field2948 - -256);
                        var29 = var29 * 256 / (class251.field2948 + 256);
                    }
                    var10[var11 * 2] = arg1.field8506 / 2 + ((var9.field3644[var11 * 2] * 4 + arg8) * var30 + (var9.field3644[var11 * 2 + 1] * 4 + arg0) * var29 >> 14) + arg2;
                    var10[var11 * 2 - -1] = arg1.field8416 / 2 + -((arg0 - -(var9.field3644[var11 * 2 + 1] * 4)) * var30 - (var9.field3644[var11 * 2] * 4 + arg8) * var29 >> 14) + arg3;
                }
                class160.method1126(arg6, var10, var9.field3630, arg1.field8379, arg1.field8470);
                if (var9.field3655 <= 0) {
                    for (int var12 = 0; var12 < var10.length / 2 + -1; ++var12) {
                        arg6.method619(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 - -2], var10[var12 * 2 + 1 - -2], var9.field3642[var9.field3670[var12] & 255], 1, arg4, arg2, arg3);
                    }
                    arg6.method619(var10[var10.length + -2], var10[var10.length + -1], var10[0], var10[1], var9.field3642[var9.field3670[var9.field3670.length + -1] & 255], 1, arg4, arg2, arg3);
                } else {
                    for (int var13 = 0; ~(var10.length / 2 + -1) < ~var13; ++var13) {
                        int var21 = var10[var13 * 2];
                        int var22 = var10[var13 * 2 + 1];
                        int var23 = var10[var13 * 2 + 2];
                        int var24 = var10[(var13 + 1) * 2 + 1];
                        if (~var23 > ~var21) {
                            int var25 = var21;
                            var21 = var23;
                            int var26 = var22;
                            var22 = var24;
                            var23 = var25;
                            var24 = var26;
                        } else if (var21 == var23 && var22 > var24) {
                            int var27 = var22;
                            var22 = var24;
                            var24 = var27;
                        }
                        arg6.method621(var21, var22, var23, var24, var9.field3642[255 & var9.field3670[var13]], 1, arg4, arg2, arg3, var9.field3655, var9.field3633, var9.field3669);
                    }
                    int var14 = var10[var10.length + -2];
                    int var15 = var10[var10.length - 1];
                    int var16 = var10[0];
                    int var17 = var10[1];
                    if (var16 < var14) {
                        int var18 = var14;
                        int var19 = var15;
                        var14 = var16;
                        var15 = var17;
                        var16 = var18;
                        var17 = var19;
                    } else if (var14 == var16 && ~var15 < ~var17) {
                        int var20 = var15;
                        var15 = var17;
                        var17 = var20;
                    }
                    arg6.method621(var14, var15, var16, var17, var9.field3642[var9.field3670[var9.field3670.length + -1] & 255], 1, arg4, arg2, arg3, var9.field3655, var9.field3633, var9.field3669);
                }
            }
            class312 var31 = null;
            if (~var9.field3666 != 0) {
                var31 = var9.method1762(arg6, false, (byte) 59);
                if (var31 != null) {
                    class455.method2758(arg0, var31, arg8, arg4, (byte) -6, arg3, arg2, arg1);
                }
            }
            if (var9.field3641 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method1637();
                }
                class67 var33 = class145.field1820;
                class307 var34 = class620.field8388;
                if (var9.field3676 == 1) {
                    var33 = class708.field9946;
                    var34 = class466.field6523;
                }
                if (~var9.field3676 == -3) {
                    var33 = class452.field6380;
                    var34 = class332.field4108;
                }
                class483.method2865(var33, var9.field3649, arg2, arg8, arg4, var34, -46, var32, arg1, var9.field3641, arg0, arg3);
            }
        }
        if (arg5) {
            field2591 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lnv;Lbt;)V", line = 424)
    public class223(class439 arg0, class48 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field5893) {
            this.field2601 = class124.method962(arg1.method436("gl", -3637, "uw_ground_unlit"), -110, arg0, 34336);
            this.field2605 = class124.method962(arg1.method436("gl", -3637, "uw_ground_lit"), 72, arg0, 34336);
            this.field2602 = class124.method962(arg1.method436("gl", -3637, "uw_model_unlit"), 47, arg0, 34336);
            this.field2596 = class124.method962(arg1.method436("gl", -3637, "uw_model_lit"), -89, arg0, 34336);
            if (!(this.field2601 != null & this.field2605 != null & this.field2602 != null & this.field2596 != null)) {
                this.field2613 = false;
            } else {
                this.field2590 = super.field7494.method2712(false, 2, 1, 0, new int[] { 0, -1 });
                this.field2590.method1198(false, false, (byte) -125);
                this.field2613 = true;
            }
        } else {
            this.field2613 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZB)V", line = 221)
    public final void method702(boolean arg0, byte arg1) {
        ++field2608;
        this.field2603 = arg0;
        super.field7494.method2691(false, 1);
        super.field7494.method2643(-2, this.field2590);
        super.field7494.method2716(class75.field1039, arg1 + 128, class8.field135);
        if (arg1 != -10) {
            this.method1371(14);
        }
        super.field7494.method2694((byte) -49, 0, class555.field7718);
        super.field7494.method4(class507.field7214, true, (byte) 108, false, 2);
        super.field7494.method2703(class616.field8291, (byte) 25, 0);
        super.field7494.method2691(false, 0);
        this.method1371(64);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZILgaa;)V", line = 240)
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (arg2 != null) {
            if (this.field2597) {
                super.field7494.method2694((byte) -49, 0, class507.field7214);
                super.field7494.method2703(class507.field7214, (byte) 26, 0);
                this.field2597 = false;
            }
            super.field7494.method2643(-2, arg2);
            super.field7494.method2649((byte) 126, arg1);
        } else if (!this.field2597) {
            super.field7494.method2643(-2, super.field7494.field6257);
            super.field7494.method2649((byte) 126, 1);
            super.field7494.method2694((byte) -49, 0, class616.field8291);
            super.field7494.method2703(class616.field8291, (byte) 59, 0);
            this.field2597 = true;
        }
        ++field2609;
        if (!arg0) {
            this.field2601 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)V", line = 279)
    public final void method700(int arg0, byte arg1, int arg2) {
        ++field2592;
        if (arg1 != 94) {
            this.method705(125);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)V", line = 289)
    public final void method707(boolean arg0, int arg1) {
        if (arg1 != 30902) {
            this.method702(true, (byte) -108);
        }
        ++field2600;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)Z", line = 299)
    public final boolean method703(byte arg0) {
        if (arg0 <= 126) {
            this.method1371(80);
        }
        ++field2593;
        return this.field2613;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)V", line = 310)
    public static final void method1373(byte arg0) {
        ++field2595;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class461.field6476[var1] = false;
        }
        if (arg0 == 59) {
            class231.field2759 = class599.field8107;
            class718.field10090 = 0;
            class441.field5921 = class111.field1405;
            class719.field10094 = -1;
            class131.field1617 = -1;
            class404.field5329 = 0;
            class353.field4397 = class303.field3622;
            class7.field100 = 5;
            class701.field9881 = class228.field2707;
            client.field3934 = -1;
            class316.field3889 = class793.field10893;
            class267.field3160 = -1;
            class460.field6473 = class350.field4366;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(B)V", line = 350)
    public static void method1374(byte arg0) {
        field2591 = null;
        int var1 = 80 % ((arg0 - 65) / 57);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 360)
    public final void method705(int arg0) {
        ++field2610;
        if (arg0 == 1580) {
            if (this.field2598) {
                int var2 = super.field7494.method568();
                int var3 = super.field7494.method610();
                float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
                float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7494.method2654((byte) -103), (float) super.field7494.method2660((byte) -105) / 255.0F);
                super.field7494.method2691(false, 1);
                super.field7494.method2673(super.field7494.method2680(arg0 + -1572), 125);
                super.field7494.method2691(false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 388)
    public final void method699(boolean arg0) {
        ++field2611;
        super.field7494.method2691(arg0, 1);
        super.field7494.method2643(-2, (class315) null);
        super.field7494.method2716(class269.field3180, 98, class269.field3180);
        super.field7494.method2694((byte) -49, 0, class507.field7214);
        super.field7494.method2694((byte) -49, 2, class555.field7718);
        super.field7494.method2703(class507.field7214, (byte) 78, 0);
        super.field7494.method2691(false, 0);
        if (this.field2597) {
            super.field7494.method2694((byte) -49, 0, class507.field7214);
            super.field7494.method2703(class507.field7214, (byte) 86, 0);
            this.field2597 = false;
        }
        if (this.field2598) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field2598 = false;
        }
    }
}
