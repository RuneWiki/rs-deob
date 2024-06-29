import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class359 extends class369 {

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "[F")
    private float[] field4825 = new float[4];

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Liea;")
    private class131 field4813;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "Liea;")
    private class131 field4811;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "Liea;")
    private class131 field4818;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "Liea;")
    private class131 field4827;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "Z")
    private boolean field4824;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "Lpm;")
    private class134 field4822;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
    public static int[] field4808 = new int[13];

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field4816 = 0;

    @OriginalMember(owner = "client!kr", name = "K", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Lsb;")
    public static class305 field4805 = new class305(31, 3);

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4829 = null;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "Lgk;")
    public static class616 field4830 = new class616();

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "Z")
    private boolean field4821;

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "Z")
    private boolean field4823;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "[Lsda;")
    public static class7[] field4820;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 6)
    public final void method56(byte arg0) {
        ++field4809;
        int var2 = super.field5047.method2037(9);
        class537 var3 = super.field5047.method2030(29443);
        if (!this.field4823) {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field4813.field1477 : this.field4818.field1477);
        } else {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field4827.field1477 : this.field4811.field1477);
        }
        OpenGL.glEnable(34336);
        this.field4821 = true;
        if (arg0 < 36) {
            method2111(-0.1537172F, -0.28000358F, 0.21065873F, (byte) -45);
        }
        var3.method3018(0.0F, -1.0F, 0.0F, this.field4825, (float) var2, -32586);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field4825[0], this.field4825[1], this.field4825[2], this.field4825[3]);
        this.method11(126);
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Z", line = 35)
    public final boolean method8(int arg0) {
        int var2 = -35 % ((37 - arg0) / 36);
        ++field4804;
        return this.field4824;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V", line = 47)
    public static void method2107(boolean arg0) {
        field4805 = null;
        if (!arg0) {
            field4820 = null;
        }
        field4808 = null;
        field4820 = null;
        field4829 = null;
        field4830 = null;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lmr;Ltf;)V", line = 64)
    public class359(class221 arg0, class701 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field2740) {
            this.field4813 = class489.method2839(155, arg1.method3862("uw_ground_unlit", "gl", (byte) -123), 34336, arg0);
            this.field4811 = class489.method2839(155, arg1.method3862("uw_ground_lit", "gl", (byte) 72), 34336, arg0);
            this.field4818 = class489.method2839(155, arg1.method3862("uw_model_unlit", "gl", (byte) -109), 34336, arg0);
            this.field4827 = class489.method2839(155, arg1.method3862("uw_model_lit", "gl", (byte) 46), 34336, arg0);
            if (!(this.field4818 != null & this.field4813 != null & this.field4811 != null & this.field4827 != null)) {
                this.field4824 = false;
            } else {
                this.field4822 = super.field5047.method1983(false, (byte) 80, 1, 2, new int[] { 0, -1 });
                this.field4822.method759(false, -19314, false);
                this.field4824 = true;
            }
        } else {
            this.field4824 = false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZ)V", line = 90)
    public final void method5(int arg0, boolean arg1) {
        if (arg0 != 382) {
            method2109((byte) 43);
        }
        ++field4807;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BILlc;)V", line = 100)
    public final void method9(byte arg0, int arg1, class686 arg2) {
        ++field4814;
        super.field5047.method1997(126, arg2);
        if (arg0 != -94) {
            this.method3((byte) -103);
        }
        super.field5047.method2004(arg1, 2);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V", line = 119)
    public static final void method2108(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15) {
        class472.field6806 = class568.field8078.method953() > 0;
        class527.field7431 = arg15;
        class309.field3830 = arg1 >> class559.field7984;
        class379.field5139 = arg3 >> class559.field7984;
        class258.field3241 = arg1;
        class696.field9775 = arg3;
        class112.field1188 = arg2;
        class72.field731 = class309.field3830 - class460.field6544;
        if (class72.field731 < 0) {
            class137.field1503 = -class72.field731;
            class72.field731 = 0;
        } else {
            class137.field1503 = 0;
        }
        class76.field786 = class379.field5139 - class460.field6544;
        if (class76.field786 < 0) {
            class599.field8438 = -class76.field786;
            class76.field786 = 0;
        } else {
            class599.field8438 = 0;
        }
        class48.field497 = class460.field6544 + class309.field3830;
        if (class48.field497 > class122.field1369) {
            class48.field497 = class122.field1369;
        }
        class112.field1184 = class460.field6544 + class379.field5139;
        if (class112.field1184 > class247.field3058) {
            class112.field1184 = class247.field3058;
        }
        boolean[][] var16 = class475.field6837;
        boolean[][] var17 = class41.field408;
        if (class527.field7431) {
            for (int var18 = 0; var18 < class460.field6544 + class460.field6544 + 2; ++var18) {
                for (int var21 = 0; var21 < class460.field6544 + class460.field6544 + 2; ++var21) {
                    int var22 = class309.field3830 - class460.field6544 + var18;
                    int var23 = class379.field5139 - class460.field6544 + var21;
                    if (var22 >= 0 && var23 >= 0 && var22 < class122.field1369 && var23 < class247.field3058) {
                        int var24 = var22 << class559.field7984;
                        int var25 = var23 << class559.field7984;
                        int var26 = class385.field5193[class385.field5193.length - 1].method1608(var23, 840, var22) - (1000 << class559.field7984 - 7);
                        int var27 = class666.field9303 != null ? class666.field9303[0].method1608(var23, 840, var22) + class171.field1904 : class385.field5193[0].method1608(var23, 840, var22) + class171.field1904;
                        class41.field408[var18][var21] = class568.field8078.method1006(var24, var26, var25, var24, var27, var25);
                    } else {
                        class41.field408[var18][var21] = false;
                    }
                }
            }
            for (int var19 = 0; var19 < class460.field6544 + class460.field6544 + 1; ++var19) {
                for (int var20 = 0; var20 < class460.field6544 + class460.field6544 + 1; ++var20) {
                    class475.field6837[var19][var20] = class41.field408[var19][var20] || class41.field408[var19 + 1][var20] || class41.field408[var19][var20 + 1] || class41.field408[var19 + 1][var20 + 1];
                }
            }
            class68.field684 = arg5;
            class408.field5450 = arg6;
            class660.field9256 = arg7;
            class349.field4728 = arg8;
            class390.field5273 = arg9;
            class56.method294(Integer.MAX_VALUE, arg10, class568.field8078);
        } else {
            if (class400.field5379 == null) {
                class400.field5379 = new boolean[class122.field1369 + class122.field1369 + 1][class247.field3058 + class122.field1369 + 1];
                for (int var28 = 0; var28 < class400.field5379.length; ++var28) {
                    for (int var29 = 0; var29 < class400.field5379[0].length; ++var29) {
                        class400.field5379[var28][var29] = true;
                    }
                }
            }
            class41.field408 = class400.field5379;
            class475.field6837 = class400.field5379;
            class72.field731 = 0;
            class76.field786 = 0;
            class48.field497 = class122.field1369;
            class112.field1184 = class247.field3058;
            class108.field1173 = 0;
        }
        class400.method2255((byte) -103, class568.field8078);
        for (class315 var30 = (class315) class517.field7362.method1672((byte) 102); var30 != null; var30 = (class315) class517.field7362.method1669(-2747)) {
            var30.method1821(73);
            class689.method3811(var30, 0);
        }
        if (class472.field6806) {
            for (int var31 = 0; var31 < class137.field1501; ++var31) {
                class85.field860[var31].method1434(arg14, false, arg0);
            }
        }
        if (class110.field1180) {
            class381.field5160 = class568.field8078.method938();
            class568.field8078.method963(class287.field3588);
            int var32 = (class287.field3588[2] - class287.field3588[0]) / class531.field7481;
            for (int var33 = 0; var33 < class531.field7481 - 1; ++var33) {
                class494.field7162[var33] = (var33 + 1) * var32 + class61.field625[var33];
            }
            for (int var34 = 0; var34 < class642.field9080.length; ++var34) {
                class642.field9080[var34].method3320();
            }
        }
        if (class604.field8494 != null) {
            if (class110.field1180) {
                class600.method3357(0);
            }
            class496.method2865(true);
            class568.field8078.method936(-1, 1583160, 40, 127);
            class300.method1745(true, arg4, arg10, arg11);
            if (class110.field1180) {
                class23.method108();
            }
            class568.field8078.method1047();
            class496.method2865(false);
        }
        class300.method1745(false, arg4, arg10, arg11);
        if (class110.field1180) {
            for (int var35 = 0; var35 < class612.field8618; ++var35) {
                class507.field7283[var35] = class560.field7992[var35];
            }
            class600.method3357(0);
            for (int var36 = 0; var36 < class642.field9080.length; ++var36) {
                class642.field9080[var36].method3320();
            }
        }
        if (class110.field1180) {
            class23.method108();
            for (int var37 = 0; var37 < class612.field8618; ++var37) {
                class560.field7992[var37] = class507.field7283[var37];
            }
            if (class15.field126 == 2) {
                int var10002;
                if (class180.field2020[0] < class180.field2020[1]) {
                    if (class61.field625[0] + class494.field7162[0] > class287.field3588[0]) {
                        var10002 = class61.field625[0]++;
                    }
                } else if (class180.field2020[0] > class180.field2020[1] && class61.field625[0] + class494.field7162[0] < class287.field3588[2]) {
                    var10002 = class61.field625[0]--;
                }
            }
        }
        if (!class527.field7431) {
            class475.field6837 = var16;
            class41.field408 = var17;
        }
        class398.method2246();
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 387)
    public final void method3(byte arg0) {
        ++field4810;
        super.field5047.method2015(1, -2);
        super.field5047.method1997(127, (class686) null);
        super.field5047.method1994(-30, class250.field3133, class250.field3133);
        super.field5047.method2012((byte) -80, 0, class304.field3769);
        super.field5047.method2012((byte) -49, 2, class107.field1154);
        int var2 = -41 / ((54 - arg0) / 47);
        super.field5047.method1979(0, class304.field3769, (byte) -77);
        super.field5047.method2015(0, -2);
        if (this.field4821) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4821 = false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V", line = 417)
    public final void method10(boolean arg0, int arg1) {
        ++field4826;
        this.field4823 = arg0;
        super.field5047.method2015(1, -2);
        super.field5047.method1997(126, this.field4822);
        if (arg1 == -14330) {
            super.field5047.method1994(-30, class428.field6081, class239.field2967);
            super.field5047.method2012((byte) -96, 0, class107.field1154);
            super.field5047.method1328(2, false, true, true, class304.field3769);
            super.field5047.method1979(0, class692.field9717, (byte) -32);
            super.field5047.method2015(0, -2);
            this.method56((byte) 46);
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V", line = 441)
    public final void method11(int arg0) {
        if (this.field4821) {
            int var2 = super.field5047.method971();
            int var3 = super.field5047.method966();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5047.method2022(0), (float) super.field5047.method2052(-6771) / 255.0F);
            super.field5047.method2015(1, -2);
            super.field5047.method1988(super.field5047.method1990(0), 4);
            super.field5047.method2015(0, -2);
        }
        ++field4812;
        if (arg0 < 52) {
            this.field4823 = true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(B)V", line = 468)
    public static final void method2109(byte arg0) {
        ++field4815;
        int var1 = class639.field9075.method2640((byte) 48, class430.field6109);
        if (var1 == 0) {
            class125.field1420 = null;
            class579.method3276((byte) 14, 0);
        } else if (~var1 == -2) {
            class570.method3224((byte) 0, (byte) -127);
            class579.method3276((byte) 14, 512);
            if (class16.field131 != null) {
                class290.method1691(80);
            }
        } else {
            class570.method3224((byte) (255 & class330.field4057 + -4), (byte) -124);
            class579.method3276((byte) 14, 2);
        }
        if (arg0 >= -97) {
            field4816 = -107;
        }
        class138.field1524 = class169.field1888;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)V", line = 504)
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 == 8250) {
            ++field4806;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZB)V", line = 515)
    public static final void method2110(boolean arg0, byte arg1) {
        ++field4819;
        if (arg1 > 90) {
            ++class488.field7098;
            class653 var2 = class699.method3845((byte) 45, class39.field395, class312.field3877);
            class568.method3220(var2, (byte) 49);
            for (class633 var3 = (class633) class14.field117.method3674(-39); var3 != null; var3 = (class633) class14.field117.method3672(-1)) {
                if (!var3.method1925(14325)) {
                    var3 = (class633) class14.field117.method3674(-115);
                    if (var3 == null) {
                        break;
                    }
                }
                if (~var3.field8921 == -1) {
                    class604.method3377((byte) -25, var3, arg0, true);
                }
            }
            if (class250.field3132 != null) {
                class130.method741(class250.field3132, 26034);
                class250.field3132 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(FFFB)I", line = 555)
    public static final int method2111(float arg0, float arg1, float arg2, byte arg3) {
        ++field4817;
        if (arg3 >= -98) {
            method2108(-124, -118, 118, 42, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -2, (byte) -1, 86, -103, true, true);
        }
        float var4 = !(arg1 < 0.0F) ? arg1 : -arg1;
        float var5 = !(arg0 < 0.0F) ? arg0 : -arg0;
        float var6 = !(arg2 < 0.0F) ? arg2 : -arg2;
        if (var5 > var4 && var5 > var6) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return !(arg2 > 0.0F) ? 3 : 2;
        } else {
            return !(arg1 > 0.0F) ? 5 : 4;
        }
    }
}
