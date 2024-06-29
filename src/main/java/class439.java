import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class439 extends class292 {

    @OriginalMember(owner = "client!maa", name = "w", descriptor = "[F")
    private float[] field6327 = new float[4];

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "Lrga;")
    private class220 field6335;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "Lrga;")
    private class220 field6334;

    @OriginalMember(owner = "client!maa", name = "r", descriptor = "Lrga;")
    private class220 field6322;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "Lrga;")
    private class220 field6337;

    @OriginalMember(owner = "client!maa", name = "A", descriptor = "Z")
    private boolean field6331;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "Lhi;")
    private class190 field6336;

    @OriginalMember(owner = "client!maa", name = "v", descriptor = "Lqfa;")
    public static class85 field6326 = new class85(9, -2);

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!maa", name = "t", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!maa", name = "x", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!maa", name = "y", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!maa", name = "B", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!maa", name = "u", descriptor = "Z")
    private boolean field6325;

    @OriginalMember(owner = "client!maa", name = "H", descriptor = "Z")
    private boolean field6338;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        super.field4393.method3266(-2, arg2);
        ++field6330;
        super.field4393.method3195(-12, arg1);
        if (arg0 <= 28) {
            method2655(-120);
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        ++field6321;
        super.field4393.method3223(15, 1);
        super.field4393.method3266(-2, (class116) null);
        if (arg0 <= 27) {
            this.method602(true, (byte) 91);
        }
        super.field4393.method3232(class509.field7205, class509.field7205, (byte) -121);
        super.field4393.method3231(0, class435.field6296, (byte) -46);
        super.field4393.method3231(2, class370.field5487, (byte) -23);
        super.field4393.method3224(0, (byte) -80, class435.field6296);
        super.field4393.method3223(15, 0);
        if (this.field6325) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6325 = false;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public final void method1327(int arg0) {
        ++field6324;
        int var2 = super.field4393.method3206((byte) -64);
        if (arg0 < 105) {
            this.method600(-54, -119, 43);
        }
        class391 var3 = super.field4393.method3202(8370);
        if (this.field6338) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field6337.field3328 : this.field6334.field3328);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field6322.field3328 : this.field6335.field3328);
        }
        OpenGL.glEnable(34336);
        this.field6325 = true;
        var3.method2402(0.0F, this.field6327, (byte) -5, 0.0F, -1.0F, (float) var2);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6327[0], this.field6327[1], this.field6327[2], this.field6327[3]);
        this.method1326((byte) -102);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        int var4 = 99 / ((-45 - arg1) / 59);
        ++field6333;
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        this.field6338 = arg0;
        ++field6328;
        super.field4393.method3223(arg1 ^ -125, 1);
        super.field4393.method3266(-2, this.field6336);
        super.field4393.method3232(class42.field1079, class525.field7399, (byte) -89);
        super.field4393.method3231(0, class370.field5487, (byte) -23);
        super.field4393.method2845(class435.field6296, 110, true, false, 2);
        if (arg1 != -116) {
            this.method1326((byte) 106);
        }
        super.field4393.method3224(0, (byte) -80, class661.field9521);
        super.field4393.method3223(15, 0);
        this.method1327(arg1 ^ -32);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Ljq;Lom;)V")
    public class439(class475 arg0, class344 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field6839) {
            this.field6335 = class316.method2041((byte) 123, 34336, arg1.method2211("gl", 19558, "uw_ground_unlit"), arg0);
            this.field6334 = class316.method2041((byte) 115, 34336, arg1.method2211("gl", 19558, "uw_ground_lit"), arg0);
            this.field6322 = class316.method2041((byte) 101, 34336, arg1.method2211("gl", 19558, "uw_model_unlit"), arg0);
            this.field6337 = class316.method2041((byte) 65, 34336, arg1.method2211("gl", 19558, "uw_model_lit"), arg0);
            if (!(this.field6337 != null & this.field6335 != null & this.field6334 != null & this.field6322 != null)) {
                this.field6331 = false;
            } else {
                this.field6336 = super.field4393.method3270(1, new int[] { 0, -1 }, (byte) 50, false, 2);
                this.field6336.method465(false, 13321, false);
                this.field6331 = true;
            }
        } else {
            this.field6331 = false;
        }
    }

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        if (arg0 != 24561) {
            return true;
        } else {
            ++field6329;
            return this.field6331;
        }
    }

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(I)V")
    public static void method2654(int arg0) {
        if (arg0 != 0) {
            method2655(77);
        }
        field6326 = null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        ++field6323;
        if (arg1 != 54) {
            this.method1327(105);
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        if (arg0 >= -81) {
            this.method604(-6);
        }
        if (this.field6325) {
            int var2 = super.field4393.method86();
            int var3 = super.field4393.method66();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field4393.method3226(0), (float) super.field4393.method3235(8) / 255.0F);
            super.field4393.method3223(15, 1);
            super.field4393.method3242((byte) -73, super.field4393.method3198(0));
            super.field4393.method3223(15, 0);
        }
        ++field6332;
    }

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "(I)V")
    public static final void method2655(int arg0) {
        if (arg0 != Integer.MIN_VALUE) {
            method2655(44);
        }
        ++field6339;
        class126.field2299.method3650((byte) 70);
        int var1 = class126.field2299.method3648(-108, 8);
        if (~var1 > ~class363.field5389) {
            for (int var2 = var1; ~var2 > ~class363.field5389; ++var2) {
                class288.field4296[class86.field1625++] = class367.field5444[var2];
            }
        }
        if (~var1 < ~class363.field5389) {
            throw new RuntimeException("gnpov1");
        } else {
            class363.field5389 = 0;
            for (int var3 = 0; var3 < var1; ++var3) {
                int var4 = class367.field5444[var3];
                class22 var5 = ((class436) class208.field3179.method2596((long) var4, 57)).field6298;
                int var6 = class126.field2299.method3648(-106, 1);
                if (~var6 == -1) {
                    class367.field5444[class363.field5389++] = var4;
                    var5.field8683 = class336.field5031;
                } else {
                    int var7 = class126.field2299.method3648(arg0 + -2147483552, 2);
                    if (~var7 == -1) {
                        class367.field5444[class363.field5389++] = var4;
                        var5.field8683 = class336.field5031;
                        class623.field9010[class398.field5793++] = var4;
                    } else if (var7 == 1) {
                        class367.field5444[class363.field5389++] = var4;
                        var5.field8683 = class336.field5031;
                        int var8 = class126.field2299.method3648(-94, 3);
                        var5.method452(-110, var8, 1);
                        int var9 = class126.field2299.method3648(arg0 ^ -2147483580, 1);
                        if (~var9 == -2) {
                            class623.field9010[class398.field5793++] = var4;
                        }
                    } else if (var7 == 2) {
                        class367.field5444[class363.field5389++] = var4;
                        var5.field8683 = class336.field5031;
                        if (class126.field2299.method3648(-69, 1) == 1) {
                            int var10 = class126.field2299.method3648(arg0 ^ -2147483587, 3);
                            var5.method452(108, var10, 2);
                            int var11 = class126.field2299.method3648(arg0 ^ -2147483545, 3);
                            var5.method452(arg0 + -2147483604, var11, 2);
                        } else {
                            int var12 = class126.field2299.method3648(98, 3);
                            var5.method452(-123, var12, 0);
                        }
                        int var13 = class126.field2299.method3648(-128, 1);
                        if (~var13 == -2) {
                            class623.field9010[class398.field5793++] = var4;
                        }
                    } else if (var7 == 3) {
                        class288.field4296[class86.field1625++] = var4;
                    }
                }
            }
        }
    }
}
