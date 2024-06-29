import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class397 extends class232 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Z")
    private boolean field5639 = false;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "[F")
    private float[] field5648 = new float[4];

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "Lhga;")
    private class182 field5645;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lhga;")
    private class182 field5637;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lhga;")
    private class182 field5633;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Lhga;")
    private class182 field5643;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
    private boolean field5641;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Lkt;")
    private class166 field5646;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Liv;")
    public static class106 field5634 = new class106("game4", 3);

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[I")
    public static int[] field5651 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "[Z")
    public static boolean[] field5653 = new boolean[100];

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "F")
    public static float field5640;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lcb;")
    public static class544 field5630;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Z")
    private boolean field5638;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
    private boolean field5647;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    public final void method1606(int arg0) {
        if (arg0 != 8261) {
            this.method1268(71);
        }
        ++field5632;
        int var2 = super.field3368.method1130(0);
        class468 var3 = super.field3368.method1047((byte) -20);
        if (this.field5647) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field5643.field2759 : this.field5637.field2759);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field5645.field2759 : this.field5633.field2759);
        }
        OpenGL.glEnable(34336);
        this.field5638 = true;
        var3.method2764((float) var2, 0.0F, -1.0F, 0.0F, this.field5648, (byte) 97);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field5648[0], this.field5648[1], this.field5648[2], this.field5648[3]);
        this.method1268(98);
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
    public static void method2419(int arg0) {
        if (arg0 != 34336) {
            method2419(-13);
        }
        field5630 = null;
        field5651 = null;
        field5653 = null;
        field5634 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        super.field3368.method1140((byte) -84, 1);
        ++field5631;
        super.field3368.method1104(true, (class749) null);
        super.field3368.method1136((byte) -123, class174.field2460, class174.field2460);
        super.field3368.method1056(32, class412.field5814, 0);
        super.field3368.method1056(32, class490.field6966, 2);
        if (arg0 > 77) {
            super.field3368.method1157(1, 0, class412.field5814);
            super.field3368.method1140((byte) -101, 0);
            if (this.field5639) {
                super.field3368.method1056(32, class412.field5814, 0);
                super.field3368.method1157(1, 0, class412.field5814);
                this.field5639 = false;
            }
            if (this.field5638) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field5638 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        ++field5649;
        if (arg1 <= 21) {
            this.method572(false, 122);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        ++field5636;
        this.field5647 = arg0;
        super.field3368.method1140((byte) -64, 1);
        super.field3368.method1104(true, this.field5646);
        super.field3368.method1136((byte) -116, class468.field6696, class438.field6278);
        if (arg1 != -126) {
            this.field5637 = null;
        }
        super.field3368.method1056(arg1 + 158, class490.field6966, 0);
        super.field3368.method1057(2, false, class412.field5814, true, (byte) 123);
        super.field3368.method1157(1, 0, class490.field6967);
        super.field3368.method1140((byte) -39, 0);
        this.method1606(8261);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        ++field5650;
        if (arg1 != null) {
            if (this.field5639) {
                super.field3368.method1056(32, class412.field5814, 0);
                super.field3368.method1157(1, 0, class412.field5814);
                this.field5639 = false;
            }
            super.field3368.method1104(true, arg1);
            super.field3368.method1088((byte) -31, arg2);
        } else if (!this.field5639) {
            super.field3368.method1104(true, super.field3368.field2200);
            super.field3368.method1088((byte) -31, 1);
            super.field3368.method1056(arg0 + -2273, class490.field6967, 0);
            super.field3368.method1157(1, 0, class490.field6967);
            this.field5639 = true;
        }
        if (arg0 != 2305) {
            field5652 = 21;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLha;Loga;Lor;)V")
    public static final void method2420(byte arg0, class66 arg1, class497 arg2, class665 arg3) {
        ++field5642;
        int var4 = 90 / ((arg0 - 29) / 35);
        class112 var5 = arg3.method3786(arg1, 131072);
        if (var5 != null) {
            int var6 = var5.method777();
            if (var5.method789() > var6) {
                var6 = var5.method789();
            }
            byte var7 = 10;
            int var8 = arg2.field7068;
            int var9 = arg2.field7066;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            if (arg3.field9326 != null) {
                var10 = class408.field5763.method1737(class744.field10362, (class112[]) null, arg3.field9326, (int[]) null, true);
                for (int var13 = 0; ~var13 > ~var10; ++var13) {
                    String var14 = class744.field10362[var13];
                    if (var10 + -1 > var13) {
                        var14 = var14.substring(0, var14.length() - 4);
                    }
                    int var15 = class650.field9151.method4107(var14);
                    if (var11 < var15) {
                        var11 = var15;
                    }
                }
                var12 = var10 * class650.field9151.method4104() + class650.field9151.method4110() / 2;
            }
            int var16 = var6 / 2 + arg2.field7068;
            int var17 = arg2.field7066;
            if (~var8 > ~(class436.field6224 + var6)) {
                var16 = class436.field6224 - -(var6 / 2) - (-var7 - (var11 / 2 - -5));
                var8 = class436.field6224;
            } else if (~(-var6 + class436.field6242) > ~var8) {
                var8 = -var6 + class436.field6242;
                var16 = -(var11 / 2) + -5 + -var7 + class436.field6242 - var6 / 2;
            }
            if (class436.field6232 + var6 <= var9) {
                if (~(class436.field6240 - var6) > ~var9) {
                    var17 = -var7 + -var12 + -(var6 / 2) + class436.field6240;
                    var9 = -var6 + class436.field6240;
                }
            } else {
                var9 = class436.field6232;
                var17 = var6 / 2 + class436.field6232 + var7;
            }
            int var18 = (int) (Math.atan2((double) (-arg2.field7068 + var8), (double) (-arg2.field7066 + var9)) / 3.141592653589793D * 32767.0D) & 65535;
            var5.method799((float) var6 / 2.0F + (float) var8, (float) var6 / 2.0F + (float) var9, 4096, var18);
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            int var22 = -2;
            if (arg3.field9326 != null) {
                var20 = var17;
                var19 = var16 - var11 / 2 - 5;
                var22 = var17 + 3 - -(class650.field9151.method4104() * var10);
                var21 = var11 + var19 + 10;
                if (arg3.field9376 != 0) {
                    arg1.method488(var17, var19, arg3.field9376, -var17 + var22, 1, -var19 + var21);
                }
                if (~arg3.field9357 != -1) {
                    arg1.method467(var17, -var19 + var21, (byte) 115, -var17 + var22, arg3.field9357, var19);
                }
                for (int var23 = 0; ~var10 < ~var23; ++var23) {
                    String var24 = class744.field10362[var23];
                    if (~var23 > ~(var10 - 1)) {
                        var24 = var24.substring(0, -4 + var24.length());
                    }
                    class650.field9151.method4109(arg1, var24, var16, var17, arg3.field9341, true);
                    var17 += class650.field9151.method4104();
                }
            }
            if (arg3.field9354 != -1 || arg3.field9326 != null) {
                class724 var25 = new class724(arg2);
                int var26 = var6 >> 1;
                var25.field10158 = -var26 + var9;
                var25.field10151 = var21;
                var25.field10159 = -var26 + var8;
                var25.field10147 = var22;
                var25.field10155 = var19;
                var25.field10148 = var9 + var26;
                var25.field10160 = var8 + var26;
                var25.field10153 = var20;
                class425.field5983.method2510(var25, false);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final void method1268(int arg0) {
        if (arg0 < 35) {
            field5652 = 51;
        }
        if (this.field5638) {
            int var2 = super.field3368.method425();
            int var3 = super.field3368.method460();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3368.method1135((byte) -100), (float) super.field3368.method1106((byte) 103) / 255.0F);
            super.field3368.method1140((byte) -35, 1);
            super.field3368.method1059(true, super.field3368.method1060((byte) -14));
            super.field3368.method1140((byte) -103, 0);
        }
        ++field5644;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        if (arg0 != -30998) {
            return true;
        } else {
            ++field5629;
            return this.field5641;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Log;Lcb;)V")
    public class397(class673 arg0, class544 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9534) {
            this.field5645 = class786.method4310(25394, 34336, arg1.method3126((byte) 119, "gl", "uw_ground_unlit"), arg0);
            this.field5637 = class786.method4310(25394, 34336, arg1.method3126((byte) 71, "gl", "uw_ground_lit"), arg0);
            this.field5633 = class786.method4310(25394, 34336, arg1.method3126((byte) 41, "gl", "uw_model_unlit"), arg0);
            this.field5643 = class786.method4310(25394, 34336, arg1.method3126((byte) -107, "gl", "uw_model_lit"), arg0);
            if (!(this.field5645 != null & this.field5637 != null & this.field5633 != null & this.field5643 != null)) {
                this.field5641 = false;
            } else {
                this.field5646 = super.field3368.method1058(false, new int[] { 0, -1 }, 1, (byte) -24, 2);
                this.field5646.method42(false, (byte) -122, false);
                this.field5641 = true;
            }
        } else {
            this.field5641 = false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        int var4 = -109 % ((arg0 - 48) / 51);
        ++field5635;
    }
}
