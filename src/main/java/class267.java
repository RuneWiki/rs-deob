import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class267 extends class584 {

    @OriginalMember(owner = "client!gaa", name = "B", descriptor = "[F")
    private float[] field3374 = new float[4];

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Z")
    private boolean field3370;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "Luaa;")
    private class103 field3358;

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "Luaa;")
    private class103 field3368;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "Luaa;")
    private class103 field3365;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "Luaa;")
    private class103 field3363;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "Z")
    private boolean field3367;

    @OriginalMember(owner = "client!gaa", name = "A", descriptor = "Z")
    private boolean field3373;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(ZI)V", line = 3)
    public final void method180(boolean arg0, int arg1) {
        this.field3373 = arg0;
        ++field3369;
        if (arg1 != -1) {
            this.field3374 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILep;Lep;)V", line = 15)
    public static final void method1508(int arg0, class382 arg1, class382 arg2) {
        if (arg0 > 3) {
            ++class415.field5508;
            class480.method2802(class190.field2299, 16751);
            ++field3376;
            class334.field4314.method2554(arg2.field5055, 255);
            class334.field4314.method2537(18244, arg2.field5110);
            class334.field4314.method2566(arg2.field5073, true);
            class334.field4314.method2540(arg1.field5073, -88);
            class334.field4314.method2523(arg1.field5055, (byte) 47);
            class334.field4314.method2521(-1531903640, arg1.field5110);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Z", line = 37)
    public static final boolean method1509(int arg0, int arg1) {
        if (arg1 != -21571) {
            field3364 = 123;
        }
        ++field3366;
        return arg0 == 7 || ~arg0 == -10;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V", line = 48)
    public static final void method1510(String arg0, int arg1, String arg2, int arg3) {
        class347.field4526 = arg3;
        class19.field176 = 2;
        ++field3362;
        if (arg1 != 29476) {
            method1508(0, (class382) null, (class382) null);
        }
        class363.method1993(arg2, false, arg0, 99);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V", line = 63)
    public final void method184(int arg0) {
        if (arg0 < -19) {
            ++field3372;
            int var2 = super.field8309.method2707(1);
            class667 var3 = super.field8309.method2708((byte) 120);
            var3.method3744(0.0F, 0.0F, (float) var2, 1, this.field3374, -1.0F);
            if (this.field3373) {
                OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field3368.field1115 : this.field3363.field1115);
            } else {
                OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field3365.field1115 : this.field3358.field1115);
            }
            OpenGL.glEnable(34336);
            this.field3367 = true;
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3374[0], this.field3374[1], this.field3374[2], this.field3374[3]);
            this.method179((byte) 79);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V", line = 91)
    public final void method174(int arg0) {
        ++field3379;
        if (this.field3367) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3367 = false;
        }
        int var2 = -9 % ((86 - arg0) / 40);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(III)Z", line = 111)
    public static final boolean method1511(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field3364 = -105;
        }
        ++field3359;
        return ~(arg1 & 1408) != -1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZ)V", line = 126)
    public final void method177(boolean arg0, boolean arg1) {
        ++field3377;
        if (!arg1) {
            this.method184(70);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIIIIII)V", line = 138)
    public static final void method1512(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3361;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg6 + arg4;
        int var12 = -arg6 + arg2;
        int var13 = arg4 * arg4;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        if (arg0 != -42) {
            method1512((byte) -109, 35, -22, 46, 83, 14, -32, 14);
        }
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg2 + -1) * var27;
        int var37 = var30;
        if (~class58.field602 >= ~arg5 && ~arg5 >= ~class501.field7217) {
            int[] var38 = class156.field1755[arg5];
            int var39 = class512.method2932((byte) -46, arg1 - arg4, class163.field1942, class326.field4246);
            int var40 = class512.method2932((byte) -46, arg1 + arg4, class163.field1942, class326.field4246);
            int var41 = class512.method2932((byte) -46, arg1 - var11, class163.field1942, class326.field4246);
            int var42 = class512.method2932((byte) -46, arg1 + var11, class163.field1942, class326.field4246);
            class445.method2463(var39, arg0 ^ -66, var41, arg3, var38);
            class445.method2463(var41, 106, var42, arg7, var38);
            class445.method2463(var42, 95, var40, arg3, var38);
        }
        int var43 = (var12 + -1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (~var23 > -1) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    ++var8;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    ++var10;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                ++var8;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            --var9;
            var36 -= var27;
            int var45 = -var9 + arg5;
            int var46 = arg5 - -var9;
            if (~class58.field602 >= ~var46 && class501.field7217 >= var45) {
                int var47 = class512.method2932((byte) -46, arg1 - -var8, class163.field1942, class326.field4246);
                int var48 = class512.method2932((byte) -46, -var8 + arg1, class163.field1942, class326.field4246);
                if (!var44) {
                    if (class58.field602 <= var45) {
                        class445.method2463(var48, 95, var47, arg3, class156.field1755[var45]);
                    }
                    if (var46 <= class501.field7217) {
                        class445.method2463(var48, 125, var47, arg3, class156.field1755[var46]);
                    }
                } else {
                    int var49 = class512.method2932((byte) -46, arg1 + var10, class163.field1942, class326.field4246);
                    int var50 = class512.method2932((byte) -46, -var10 + arg1, class163.field1942, class326.field4246);
                    if (~class58.field602 >= ~var45) {
                        int[] var51 = class156.field1755[var45];
                        class445.method2463(var48, arg0 + 166, var50, arg3, var51);
                        class445.method2463(var50, arg0 + 160, var49, arg7, var51);
                        class445.method2463(var49, arg0 ^ -120, var47, arg3, var51);
                    }
                    if (~class501.field7217 <= ~var46) {
                        int[] var52 = class156.field1755[var46];
                        class445.method2463(var48, 93, var50, arg3, var52);
                        class445.method2463(var50, 111, var49, arg7, var52);
                        class445.method2463(var49, 111, var47, arg3, var52);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lnfa;Ljo;)V", line = 345)
    public class267(class621 arg0, class303 arg1) {
        super(arg0);
        if (!arg0.field8822) {
            this.field3370 = false;
        } else {
            this.field3358 = class379.method2077(arg0, arg1.method1734("uw_ground_unlit", 11434, "gl"), (byte) -91, 34336);
            this.field3368 = class379.method2077(arg0, arg1.method1734("uw_ground_lit", 11434, "gl"), (byte) -97, 34336);
            this.field3365 = class379.method2077(arg0, arg1.method1734("uw_model_unlit", 11434, "gl"), (byte) -103, 34336);
            this.field3363 = class379.method2077(arg0, arg1.method1734("uw_model_lit", 11434, "gl"), (byte) -97, 34336);
            this.field3370 = this.field3363 != null & this.field3358 != null & this.field3368 != null & this.field3365 != null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V", line = 365)
    public final void method175(int arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            method1508(-106, (class382) null, (class382) null);
        }
        ++field3378;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILld;B)V", line = 382)
    public final void method185(int arg0, class155 arg1, byte arg2) {
        super.field8309.method2696(-2, arg1);
        if (arg2 < 17) {
            this.method178((byte) -103);
        }
        ++field3371;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V", line = 394)
    public final void method179(byte arg0) {
        ++field3375;
        if (arg0 > 26) {
            if (this.field3367) {
                OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.field8309.method321() + -1280), (float) (-768 + super.field8309.method321()), 1.0F / (float) super.field8309.method2739((byte) 74), (float) super.field8309.method2682(100) / 255.0F);
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)Z", line = 411)
    public final boolean method178(byte arg0) {
        if (arg0 >= -6) {
            method1508(-109, (class382) null, (class382) null);
        }
        ++field3360;
        return this.field3370;
    }
}
