import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class594 extends class74 {

    @OriginalMember(owner = "client!mw", name = "N", descriptor = "[F")
    private float[] field8357 = new float[4];

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "Lml;")
    private class36 field8349;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "Lml;")
    private class36 field8343;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "Lml;")
    private class36 field8342;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "Lml;")
    private class36 field8344;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "Z")
    private boolean field8340;

    @OriginalMember(owner = "client!mw", name = "L", descriptor = "Lls;")
    private class459 field8355;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "Lfca;")
    public static class139 field8339 = new class139();

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!mw", name = "H", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!mw", name = "K", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "Z")
    private boolean field8350;

    @OriginalMember(owner = "client!mw", name = "M", descriptor = "Z")
    private boolean field8356;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method347(int arg0, boolean arg1) {
        this.field8350 = arg1;
        ++field8353;
        super.field1011.method2589(0, 1);
        super.field1011.method2596(this.field8355, 0);
        int var3 = -28 % ((52 - arg0) / 36);
        super.field1011.method2550(class542.field7243, true, class538.field7226);
        super.field1011.method2602(0, 1, class700.field9903);
        super.field1011.method1676(false, class5.field119, 2, true, (byte) -105);
        super.field1011.method2561(0, class141.field1830, -18836);
        super.field1011.method2589(0, 0);
        this.method443(-16573);
    }

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V", line = 24)
    public final void method443(int arg0) {
        ++field8341;
        int var2 = super.field1011.method2531(true);
        class691 var3 = super.field1011.method2559((byte) 88);
        if (this.field8350) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field8344.field489 : this.field8343.field489);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field8349.field489 : this.field8342.field489);
        }
        OpenGL.glEnable(34336);
        this.field8356 = true;
        var3.method3906(0.0F, this.field8357, -1.0F, 0, (float) var2, 0.0F);
        if (arg0 != -16573) {
            this.method347(-69, true);
        }
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field8357[0], this.field8357[1], this.field8357[2], this.field8357[3]);
        this.method348(26185);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILhfa;)V", line = 54)
    public final void method341(int arg0, int arg1, class466 arg2) {
        ++field8347;
        if (arg1 > 47) {
            super.field1011.method2596(arg2, 0);
            super.field1011.method2595(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V", line = 67)
    public final void method343(int arg0) {
        ++field8345;
        super.field1011.method2589(0, 1);
        super.field1011.method2596((class466) null, 0);
        super.field1011.method2550(class112.field1466, true, class112.field1466);
        if (arg0 == -19092) {
            super.field1011.method2602(0, 1, class5.field119);
            super.field1011.method2602(2, arg0 ^ -19091, class700.field9903);
            super.field1011.method2561(0, class5.field119, -18836);
            super.field1011.method2589(0, 0);
            if (this.field8356) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field8356 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)Z", line = 95)
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.field8355 = null;
        }
        ++field8348;
        return this.field8340;
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(B)V", line = 107)
    public static void method3265(byte arg0) {
        int var1 = 3 / ((57 - arg0) / 41);
        field8339 = null;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Llm;Lpl;)V", line = 121)
    public class594(class337 arg0, class612 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field4376) {
            this.field8349 = class225.method1355((byte) 100, arg1.method3345(103, "gl", "uw_ground_unlit"), arg0, 34336);
            this.field8343 = class225.method1355((byte) 107, arg1.method3345(103, "gl", "uw_ground_lit"), arg0, 34336);
            this.field8342 = class225.method1355((byte) 124, arg1.method3345(78, "gl", "uw_model_unlit"), arg0, 34336);
            this.field8344 = class225.method1355((byte) 125, arg1.method3345(58, "gl", "uw_model_lit"), arg0, 34336);
            if (!(this.field8342 != null & this.field8349 != null & this.field8343 != null & this.field8344 != null)) {
                this.field8340 = false;
            } else {
                this.field8355 = super.field1011.method2576(2, false, 1, new int[] { 0, -1 }, (byte) 76);
                this.field8355.method525((byte) -81, false, false);
                this.field8340 = true;
            }
        } else {
            this.field8340 = false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 154)
    public final void method348(int arg0) {
        if (this.field8356) {
            int var2 = super.field1011.method1055();
            int var3 = super.field1011.method974();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field1011.method2590(9), (float) super.field1011.method2582(-30561) / 255.0F);
            super.field1011.method2589(0, 1);
            super.field1011.method2597((byte) 48, super.field1011.method2543(true));
            super.field1011.method2589(0, 0);
        }
        ++field8338;
        if (arg0 != 26185) {
            field8351 = 61;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V", line = 181)
    public final void method339(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field8343 = null;
        }
        ++field8354;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(IZ)V", line = 196)
    public static final void method3266(int arg0, boolean arg1) {
        ++field8337;
        while (~class298.field3671.method201(false, class8.field162) <= -16) {
            int var2 = class298.field3671.method200(false, 15);
            if (~var2 == -32768) {
                break;
            }
            boolean var3 = false;
            class206 var4 = (class206) class180.field2318.method399(-32748, (long) var2);
            if (var4 == null) {
                class307 var5 = new class307();
                var5.field9676 = var2;
                var4 = new class206(var5);
                class180.field2318.method402(var4, (byte) -48, (long) var2);
                class518.field7076[class441.field5585++] = var4;
                var3 = true;
            }
            class307 var6 = var4.field2618;
            class153.field1958[class470.field5974++] = var2;
            var6.field9659 = class133.field1735;
            if (var6.field3902 != null && var6.field3902.method3230((byte) -76)) {
                class361.method1986(var6, (byte) -126);
            }
            int var7 = class298.field3671.method200(false, 1);
            if (var7 == 1) {
                class456.field5831[class281.field3526++] = var2;
            }
            int var8;
            if (!arg1) {
                var8 = class298.field3671.method200(false, 5);
                if (~var8 < -16) {
                    var8 -= 32;
                }
            } else {
                var8 = class298.field3671.method200(false, 8);
                if (~var8 < -128) {
                    var8 -= 256;
                }
            }
            int var9 = class298.field3671.method200(false, 2);
            int var10 = class298.field3671.method200(false, 1);
            var6.method1781(class287.field3581.method1490(class298.field3671.method200(false, 14), (byte) -117), 0);
            int var11 = (-1417674745 & class298.field3671.method200(false, 3) - -4) << 11;
            int var12;
            if (!arg1) {
                var12 = class298.field3671.method200(false, 5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            } else {
                var12 = class298.field3671.method200(false, 8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            }
            var6.method3863(var6.field3902.field8210, 0);
            var6.field9716 = var6.field3902.field8214 << 3;
            if (var3) {
                var6.method3873(var11, 1003, true);
            }
            var6.method1772(var10 == 1, class376.field4748.field9754[0] + var12, (byte) 45, var6.method2785(-1), var9, class376.field4748.field9758[0] - -var8);
            if (var6.field3902.method3230((byte) 119)) {
                class57.method364(-112, (class514) null, (class441) null, 0, var6, var6.field9758[0], var6.field9754[0], var6.field6470);
            }
        }
        class298.field3671.method206((byte) -127);
        int var13 = 16 / ((arg0 - 24) / 32);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)V", line = 300)
    public final void method340(int arg0, int arg1, byte arg2) {
        ++field8346;
        if (arg2 != 65) {
            this.field8349 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLni;)I", line = 313)
    public static final int method3267(byte arg0, class687 arg1) {
        ++field8352;
        if (arg1.field9716 == 0) {
            return 0;
        } else {
            int var2 = 105 % ((75 - arg0) / 37);
            if (~arg1.field9650 != 0) {
                class687 var3 = null;
                if (arg1.field9650 >= 32768) {
                    if (arg1.field9650 >= 32768) {
                        var3 = class351.field4490[arg1.field9650 + -32768];
                    }
                } else {
                    class206 var4 = (class206) class180.field2318.method399(-32748, (long) arg1.field9650);
                    if (var4 != null) {
                        var3 = var4.field2618;
                    }
                }
                if (var3 != null) {
                    int var5 = -var3.field6461 + arg1.field6461;
                    int var6 = arg1.field6464 - var3.field6464;
                    if (~var5 != -1 || ~var6 != -1) {
                        arg1.method3869(false, (int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 16383);
                    }
                }
            }
            if (!(arg1 instanceof class514)) {
                if (arg1 instanceof class307) {
                    class307 var7 = (class307) arg1;
                    if (~var7.field3899 != 0 && (var7.field9756 == 0 || var7.field9748 > 0)) {
                        int var8 = -((-class145.field1879 + -class145.field1879 + var7.field3899) * 256) + var7.field6461;
                        int var9 = -((var7.field3909 - (class630.field8817 - -class630.field8817)) * 256) + var7.field6464;
                        if (var8 != 0 || ~var9 != -1) {
                            var7.method3869(false, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var9)));
                        }
                        var7.field3899 = -1;
                    }
                }
            } else {
                class514 var10 = (class514) arg1;
                if (~var10.field6986 != 0 && (var10.field9756 == 0 || ~var10.field9748 < -1)) {
                    var10.method3869(false, var10.field6986);
                    var10.field6986 = -1;
                }
            }
            return arg1.method3866((byte) 68);
        }
    }
}
