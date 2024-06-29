import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class426 extends class648 {

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "F")
    private float field6315 = 0.0F;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lpba;")
    private class333 field6318;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field6322 = 2;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
    public static int[] field6317;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[[I")
    public static int[][] field6326;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbca;II)V", line = 4)
    public final void method1455(class663 arg0, int arg1, int arg2) {
        super.field9139.method2294(arg0, -2);
        ++field6316;
        if (arg1 != 12885) {
            method2661(-87);
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(Z)V", line = 16)
    public final void method2631(boolean arg0) {
        ++field6328;
        if (!arg0) {
            field6317 = null;
        }
        if (super.field9139.method2419(61) == 0) {
            class441 var2 = super.field9139.method2350((byte) 37);
            super.field9139.method2375((byte) -126, 1);
            class441 var3 = super.field9139.method2299(-25498);
            var3.method772(var2);
            var3.method2728(0.125F, (byte) 108, 1.0F, 0.125F);
            var3.method2725((byte) -80, 0.0F, 0.0F, this.field6315);
            super.field9139.method2291(class60.field854, -110);
            super.field9139.method2375((byte) 36, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Z", line = 41)
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            method2662(23);
        }
        ++field6327;
        return this.field6318.method2102(arg0 + -13003);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([FIIBIIIIFIF[FFI)V", line = 59)
    public static final void method2659(float[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10, float[] arg11, float arg12, int arg13) {
        int var14 = arg9 - arg5;
        if (arg3 != -84) {
            method2661(-97);
        }
        ++field6321;
        int var15 = arg1 - arg4;
        int var16 = arg6 - arg2;
        float var17 = arg11[2] * (float) var14 + arg11[0] * (float) var16 + arg11[1] * (float) var15;
        float var18 = arg11[5] * (float) var14 + arg11[3] * (float) var16 + arg11[4] * (float) var15;
        float var19 = arg11[8] * (float) var14 + arg11[7] * (float) var15 + arg11[6] * (float) var16;
        float var20;
        float var21;
        if (~arg7 == -1) {
            var20 = -var19 + arg8 + 0.5F;
            var21 = arg10 + var17 + 0.5F;
        } else if (~arg7 != -2) {
            if (arg7 == 2) {
                var20 = -var18 + arg12 + 0.5F;
                var21 = -var17 + arg10 + 0.5F;
            } else if (arg7 != 3) {
                if (~arg7 == -5) {
                    var20 = -var18 + arg12 + 0.5F;
                    var21 = arg8 + var19 + 0.5F;
                } else {
                    var21 = -var19 + arg8 + 0.5F;
                    var20 = -var18 + arg12 + 0.5F;
                }
            } else {
                var21 = arg10 + var17 + 0.5F;
                var20 = -var18 + arg12 + 0.5F;
            }
        } else {
            var21 = arg10 + var17 + 0.5F;
            var20 = arg8 + var19 + 0.5F;
        }
        if (arg13 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg13 != 2) {
            if (arg13 == 3) {
                float var23 = var21;
                var21 = var20;
                var20 = -var23;
            }
        } else {
            var21 = -var21;
            var20 = -var20;
        }
        arg0[1] = var20;
        arg0[0] = var21;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lwu;Lpba;)V", line = 185)
    public class426(class373 arg0, class333 arg1) {
        super(arg0);
        this.field6318 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 156)
    public final void method1450(int arg0) {
        ++field6324;
        super.field9139.method2375((byte) 19, 1);
        super.field9139.method2300(class336.field4874, class336.field4874, 0);
        super.field9139.method2329(0, (byte) -124, class331.field4759);
        super.field9139.method2407(0, class331.field4759, 73);
        if (arg0 < -67) {
            super.field9139.method2331(1, 8);
            super.field9139.method2294((class663) null, -2);
            super.field9139.method2375((byte) 19, 0);
            super.field9139.method2407(0, class331.field4759, 55);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V", line = 175)
    public final void method1448(boolean arg0, int arg1) {
        super.field9139.method2300(class499.field7099, class336.field4874, arg1 + arg1);
        ++field6325;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 195)
    public static final void method2660() {
        byte var0 = 10;
        byte var1 = 30;
        if (class735.field10295 != 0 && class654.field9181 != null) {
            class118.field1620.method530(class98.field1384);
            for (int var2 = 0; var2 < class575.field8142.length; ++var2) {
                class118.field1620.method437(-256, class98.field1384[3] - class98.field1384[1], class98.field1384[1], class575.field8142[var2] + class192.field2905[var2], 1);
            }
            for (int var3 = 0; var3 < class266.field3799; ++var3) {
                class417 var11 = class85.field1210[var3];
                class118.field1620.method421(var11.field6249[0], var11.field6242[0], var11.field6239[0], class259.field3699);
                class118.field1620.method421(var11.field6249[1], var11.field6242[1], var11.field6239[1], class371.field5329);
                class118.field1620.method421(var11.field6249[2], var11.field6242[2], var11.field6239[2], class727.field10156);
                class118.field1620.method421(var11.field6249[3], var11.field6242[3], var11.field6239[3], class305.field4321);
                if (class259.field3699[2] != -1 && class371.field5329[2] != -1 && class727.field10156[2] != -1 && class305.field4321[2] != -1) {
                    int var12 = -65536;
                    if (var11.field6241 == 4) {
                        var12 = -16776961;
                    }
                    class118.field1620.method506(class259.field3699[1], class371.field5329[1], (byte) 107, class259.field3699[0], var12, class371.field5329[0]);
                    class118.field1620.method506(class371.field5329[1], class727.field10156[1], (byte) 48, class371.field5329[0], var12, class727.field10156[0]);
                    class118.field1620.method506(class727.field10156[1], class305.field4321[1], (byte) 86, class727.field10156[0], var12, class305.field4321[0]);
                    class118.field1620.method506(class305.field4321[1], class259.field3699[1], (byte) 67, class305.field4321[0], var12, class259.field3699[0]);
                    class118.field1620.method506(class259.field3699[1], class727.field10156[1], (byte) 41, class259.field3699[0], var12, class727.field10156[0]);
                }
            }
            class654.field9181.method546(false, -16777216, var0, "Dynamic: " + class425.field6313 + "/" + 5000, var1 + 45, -256);
            class654.field9181.method546(false, -16777216, var0, "Total Opaque Onscreen: " + class91.field1277 + "/" + 10000, var1 + 60, -256);
            class654.field9181.method546(false, -16777216, var0, "Total Trans Onscreen: " + class630.field8794 + "/" + 5000, var1 + 75, -256);
            class654.field9181.method546(false, -16777216, var0, "Occluders: " + (class44.field480 + class411.field6179) + " Active: " + class266.field3799, var1 + 90, -256);
            class654.field9181.method546(false, -16777216, var0, "Occluded: Ground:" + class118.field1621 + " Walls: " + class406.field6142 + " CPs: " + class619.field8704 + " Pixels: " + class357.field5193, var1 + 105, -256);
            class654.field9181.method546(false, -16777216, var0, "Occlude Calc Took: " + class461.field6803 / 1000L + "us", var1 + 120, -256);
            if (class735.field10295 == 2 && class255.field3667 != null) {
                for (int var4 = 0; var4 < class255.field3667.length; ++var4) {
                    float var6 = (float) class255.field3667[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class255.field3667[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class536 var5 = class118.field1620.method531(class394.field5922, class270.field3864, class255.field3667, class270.field3864, 0, (byte) -101);
                var5.method133(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 280)
    public static void method2661(int arg0) {
        if (arg0 != 1) {
            method2662(15);
        }
        field6326 = null;
        field6317 = null;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)Z", line = 291)
    public static final boolean method2662(int arg0) {
        ++field6319;
        if (class152.field2350 != 0) {
            return true;
        } else {
            int var1 = 64 % ((arg0 - 41) / 47);
            return class520.field7449.method2129((byte) 48);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V", line = 305)
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (arg0 > 33) {
            super.field9139.method2375((byte) -85, 1);
            ++field6320;
            if ((arg1 & 128) != 0) {
                super.field9139.method2294((class663) null, -2);
            } else if ((arg2 & 1) != 1) {
                if (!this.field6318.field4782) {
                    super.field9139.method2294(this.field6318.field4779[0], -2);
                } else {
                    super.field9139.method2294(this.field6318.field4775, -2);
                }
            } else if (this.field6318.field4782) {
                this.field6315 = (float) (super.field9139.field5552 % 4000) / 4000.0F;
                super.field9139.method2294(this.field6318.field4775, -2);
            } else {
                int var4 = super.field9139.field5552 % 4000 * 16 / 4000;
                super.field9139.method2294(this.field6318.field4779[var4], -2);
            }
            super.field9139.method2375((byte) 113, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZZ)V", line = 349)
    public final void method1451(boolean arg0, boolean arg1) {
        ++field6323;
        super.field9139.method2375((byte) -90, 1);
        super.field9139.method2300(class499.field7099, class661.field9242, 0);
        super.field9139.method2340(class331.field4759, true, 0, arg0, true);
        super.field9139.method2407(0, class328.field4670, 87);
        super.field9139.method2331(0, 8);
        super.field9139.method2375((byte) -70, 0);
        super.field9139.method2415(-16777216, 0);
        super.field9139.method2407(0, class469.field6850, 82);
        this.method2631(true);
    }
}
