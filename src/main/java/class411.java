import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class411 extends class149 {

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    private int field6217 = 0;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Lot;")
    private class506 field6222 = new class506();

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lqu;")
    public static class219 field6219 = new class219(8, 3);

    @OriginalMember(owner = "client!um", name = "D", descriptor = "Z")
    public static boolean field6235 = false;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Lbi;")
    public static class104 field6234 = new class104(99, 7);

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field6238 = 1337;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "Ld;")
    public static class66 field6231;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "[I")
    public static int[] field6236;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(FFIIFIIZ)[F")
    public static final float[] method2626(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, boolean arg7) {
        ++field6220;
        if (!arg7) {
            field6236 = null;
        }
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[8] = var10;
        var8[0] = var10;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[4] = 1.0F;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (-(var16 * var16) + 1.0F)));
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 - -(arg6 * arg6)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg6) / var19;
                var15 = (float) arg5 / var19;
            }
            var13[0] = var14 * var14 * var17 + var16;
            var13[2] = var14 * var15 * var17;
            var13[5] = var14 * var18;
            var13[6] = var14 * var15 * var17;
            var13[1] = var15 * var18;
            var13[7] = -var14 * var18;
            var13[3] = -var15 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[4] = var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[8] *= arg0;
        var9[3] *= arg1;
        var9[7] *= arg0;
        var9[5] *= arg1;
        var9[2] *= arg4;
        var9[0] *= arg4;
        var9[4] *= arg1;
        var9[6] *= arg0;
        var9[1] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    private final void method2627(int arg0) {
        ++field6226;
        int var2 = super.field2009++;
        if (arg0 != 2604) {
            method2631(-114, (byte) 9);
        }
        if (~super.field2009 <= -5001) {
            super.field2009 = 0;
        }
        this.field6217 = super.field2006[var2];
        Object var3 = super.field2008[var2];
        super.field2008[var2] = null;
        if (~this.field6217 == -22) {
            class31.method204(this.field6222, (class409) var3);
        } else if (~this.field6217 != -21) {
            if (~this.field6217 <= -31 && ~this.field6217 >= -34) {
                class104.field1523.method1309(3000.0F, super.field2004[var2] * 1.5F);
                ((class223) var3).method689(class192.field2847, class241.field3919, class78.field1156, class357.field5543, ~(this.field6217 + -30) == -1);
            } else if (~this.field6217 <= -41 && ~this.field6217 >= -44) {
                class104.field1523.method1309(3000.0F, super.field2004[var2] * 1.5F);
                ((class223) var3).method689(class192.field2847, class241.field3919, class78.field1156, class221.field3735, this.field6217 + -40 == 0);
            } else {
                if (this.field6217 != 22) {
                    if (~this.field6217 == -24) {
                        class104.field1523.method1245();
                        return;
                    }
                    if (~this.field6217 == -25) {
                        class104.field1523.method1242(0, (class415[]) null);
                        return;
                    }
                } else {
                    class104.field1523.method1326(-1, 1583160, 40, 127);
                }
            }
        } else {
            class409 var4 = (class409) var3;
            if (var4.field6180 != null) {
                var4.field6180.method102(-1, class104.field1523);
            }
            if (var4.field6188 != null) {
                var4.field6188.method102(-1, class104.field1523);
            }
            if (var4.field6189 != null) {
                var4.field6189.method102(-1, class104.field1523);
            }
            if (var4.field6192 != null) {
                var4.field6192.method102(-1, class104.field1523);
            }
            if (var4.field6176 != null) {
                var4.field6176.method102(-1, class104.field1523);
            }
            for (class192 var5 = var4.field6175; var5 != null; var5 = var5.field2841) {
                var5.field2845.method102(-1, class104.field1523);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(FLya;BIZ)V")
    public final void method906(float arg0, class223 arg1, byte arg2, int arg3, boolean arg4) {
        super.field2006[super.field2005] = (byte) (arg4 ? arg3 + 40 : arg3 + 30);
        ++field6227;
        super.field2008[super.field2005] = arg1;
        super.field2004[super.field2005] = arg0;
        ++super.field2005;
        if (super.field2005 >= 5000) {
            super.field2005 = 0;
        }
        if (arg2 != 111) {
            method2630((byte) 107);
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
    public static final void method2628(int arg0) {
        ++class440.field6822;
        class81.method578((byte) 66, class30.field319);
        ++field6230;
        class170.field2488.method1479((byte) -107, class5.method47(-1129530388));
        class170.field2488.method1437(class489.field7400, 0);
        class170.field2488.method1437(class219.field3715, arg0 ^ arg0);
        class170.field2488.method1479((byte) -95, class141.field1911.field6097);
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
    public static void method2629(int arg0) {
        field6236 = null;
        field6231 = null;
        field6234 = null;
        if (arg0 <= 58) {
            field6231 = null;
        }
        field6219 = null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
    public final void method908(int arg0, int arg1) {
        if (arg1 >= -16) {
            this.field6222 = null;
        }
        ++field6223;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLce;)V")
    public final void method910(byte arg0, class409 arg1) {
        --super.field2009;
        ++field6224;
        if (super.field2009 < 0) {
            super.field2009 = 4999;
        }
        super.field2006[super.field2009] = 21;
        super.field2008[super.field2009] = arg1;
        if (arg0 <= 123) {
            this.field6222 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)V")
    public final void method909(int arg0, int arg1) {
        super.field2006[super.field2005] = (byte) arg0;
        ++field6232;
        ++super.field2005;
        if (~super.field2005 <= -5001) {
            super.field2005 = 0;
        }
        if (arg1 != 5) {
            field6235 = false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILce;)V")
    public final void method911(int arg0, class409 arg1) {
        ++field6225;
        super.field2006[super.field2005] = 21;
        if (arg0 >= 64) {
            super.field2008[super.field2005] = arg1;
            ++super.field2005;
            if (super.field2005 >= 5000) {
                super.field2005 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(BLce;)V")
    public final void method912(byte arg0, class409 arg1) {
        ++field6229;
        super.field2006[super.field2005] = 20;
        super.field2008[super.field2005] = arg1;
        ++super.field2005;
        if (arg0 > -1) {
            this.method913(-107);
        }
        if (super.field2005 >= 5000) {
            super.field2005 = 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static final void method2630(byte arg0) {
        ++field6237;
        class337.method2240(false, arg0 ^ 75);
        class64.field1008 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class402.field6047.length; ++var2) {
            if (~class122.field1666[var2] != 0 && class402.field6047[var2] == null) {
                class402.field6047[var2] = class128.field1730.method1004(class122.field1666[var2], false, 0);
                if (class402.field6047[var2] == null) {
                    var1 = false;
                    ++class64.field1008;
                }
            }
            if (class346.field5392[var2] != -1 && class187.field2729[var2] == null) {
                class187.field2729[var2] = class128.field1730.method1011(class84.field1228[var2], false, 0, class346.field5392[var2]);
                if (class187.field2729[var2] == null) {
                    ++class64.field1008;
                    var1 = false;
                }
            }
            if (field6236[var2] != -1 && class94.field1365[var2] == null) {
                class94.field1365[var2] = class128.field1730.method1004(field6236[var2], false, 0);
                if (class94.field1365[var2] == null) {
                    var1 = false;
                    ++class64.field1008;
                }
            }
            if (class321.field4987[var2] != -1 && class77.field1154[var2] == null) {
                class77.field1154[var2] = class128.field1730.method1004(class321.field4987[var2], false, 0);
                if (class77.field1154[var2] == null) {
                    var1 = false;
                    ++class64.field1008;
                }
            }
            if (class100.field1431 != null && class140.field1906[var2] == null && class100.field1431[var2] != -1) {
                class140.field1906[var2] = class128.field1730.method1011(class84.field1228[var2], false, 0, class100.field1431[var2]);
                if (class140.field1906[var2] == null) {
                    ++class64.field1008;
                    var1 = false;
                }
            }
        }
        if (class76.field1130 == null) {
            if (class305.field4797 != null && class52.field706.method1007(1, class305.field4797.field4169 + "_staticelements")) {
                if (!class52.field706.method1001((byte) -56, class305.field4797.field4169 + "_staticelements")) {
                    ++class64.field1008;
                    var1 = false;
                } else {
                    class76.field1130 = class481.method2967(false, class305.field4797.field4169 + "_staticelements", class153.field2049, class52.field706);
                }
            } else {
                class76.field1130 = new class218(0);
            }
        }
        if (!var1) {
            class189.field2744 = 1;
        } else {
            class361.field5590 = 0;
            boolean var3 = true;
            for (int var4 = 0; class402.field6047.length > var4; ++var4) {
                byte[] var19 = class187.field2729[var4];
                if (var19 != null) {
                    int var20 = (class529.field7782[var4] >> 8) * 64 + -class453.field7018;
                    int var21 = (255 & class529.field7782[var4]) * 64 + -class126.field1718;
                    if (~class357.field5545 != -1) {
                        var20 = 10;
                        var21 = 10;
                    }
                    var3 &= class260.method1772(class135.field1839, var20, (byte) -116, class197.field3038, var21, var19);
                }
                byte[] var22 = class77.field1154[var4];
                if (var22 != null) {
                    int var23 = (class529.field7782[var4] >> 8) * 64 + -class453.field7018;
                    int var24 = (class529.field7782[var4] & 255) * 64 + -class126.field1718;
                    if (class357.field5545 != 0) {
                        var23 = 10;
                        var24 = 10;
                    }
                    var3 &= class260.method1772(class135.field1839, var23, (byte) -119, class197.field3038, var24, var22);
                }
            }
            if (!var3) {
                class189.field2744 = 2;
            } else {
                if (~class189.field2744 != -1) {
                    class57.method439(true, class382.field5862.method1583(83, class12.field131) + "<br>(100%)", (byte) -60, class128.field1741);
                }
                class500.method3052(0);
                class54.method410(arg0 + 20175);
                boolean var5 = false;
                if (class19.field198.method1266() && class141.field1911.field6123) {
                    for (int var6 = 0; ~var6 > ~class402.field6047.length; ++var6) {
                        if (class77.field1154[var6] != null || class94.field1365[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class141.field1911.field6120) {
                    var7 = class487.field7387[class415.field6293];
                } else {
                    var7 = class380.field5842[class415.field6293];
                }
                if (class19.field198.method1275()) {
                    ++var7;
                }
                class297.method1992(7, 4, class135.field1839, class197.field3038, var7, var5, class19.field198.method1324() > 0);
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class352.field5488[var8].method1907(80);
                }
                class170.method1076(0);
                class256.method1753((byte) 120, false);
                class244.method1698((byte) -5);
                class302.field4737 = null;
                class500.method3052(0);
                System.gc();
                class337.method2240(true, arg0 + -75);
                class80.method574(127);
                class440.field6823 = class141.field1911.method2603((byte) -98, class452.field7013);
                if (arg0 != 75) {
                    field6238 = 0;
                }
                class264.field4275 = class141.field1911.field6123;
                class65.field1014 = class491.field7438 >= 96;
                class215.field3653 = class141.field1911.method2601((byte) -14, class452.field7013);
                class68.field1039 = !class141.field1911.field6096;
                class419.field6350 = class141.field1911.method1635(class452.field7013, -1) ? -1 : class254.field4119;
                class72.field1080 = class141.field1911.field6099;
                class293.field4628 = class452.field7013 == 1 || class141.field1911.field6106;
                class196.field3035 = new class242(4, class135.field1839, class197.field3038, false);
                if (class357.field5545 == 0) {
                    class375.method2430(class402.field6047, class196.field3035, false);
                } else {
                    class169.method1073(class402.field6047, (byte) -82, class196.field3035);
                }
                class232.method1652(class135.field1839 >> 4, true, class197.field3038 >> 4);
                class131.method816(17797);
                if (var5) {
                    class202.method1377(true);
                    class498.field7492 = new class242(1, class135.field1839, class197.field3038, true);
                    if (~class357.field5545 != -1) {
                        class169.method1073(class94.field1365, (byte) -92, class498.field7492);
                        class337.method2240(true, arg0 ^ 75);
                    } else {
                        class375.method2430(class94.field1365, class498.field7492, false);
                        class337.method2240(true, 0);
                    }
                    class498.field7492.method2842(class196.field3035.field6988[0], 122, 0);
                    class498.field7492.method2847(class19.field198, (byte) -88, (class284[]) null, (int[][][]) null);
                    class202.method1377(false);
                }
                class196.field3035.method2847(class19.field198, (byte) -115, class352.field5488, var5 ? class498.field7492.field6988 : null);
                if (class357.field5545 != 0) {
                    class337.method2240(true, arg0 ^ 75);
                    class286.method1929(class187.field2729, class196.field3035, true);
                } else {
                    class337.method2240(true, 0);
                    class149.method907(class196.field3035, class187.field2729, false);
                    if (class140.field1906 != null) {
                        class310.method2085(17106);
                    }
                }
                class54.method410(arg0 + 20175);
                class337.method2240(true, 0);
                class196.field3035.method2845(!var5 ? null : class103.field1520[0], (class223) null, false, class19.field198);
                class196.field3035.method1684(class19.field198, (byte) -31);
                class337.method2240(true, 0);
                if (var5) {
                    class202.method1377(true);
                    class337.method2240(true, arg0 ^ 75);
                    if (~class357.field5545 != -1) {
                        class286.method1929(class77.field1154, class498.field7492, true);
                    } else {
                        class149.method907(class498.field7492, class77.field1154, false);
                    }
                    class54.method410(arg0 + 20175);
                    class337.method2240(true, 0);
                    class498.field7492.method2845((class223) null, class244.field3956[0], false, class19.field198);
                    class498.field7492.method1684(class19.field198, (byte) -62);
                    class337.method2240(true, 0);
                    class202.method1377(false);
                }
                class202.method1380(-1433);
                int var9 = class196.field3035.field3925;
                if (class201.field3057 < var9) {
                    var9 = class201.field3057;
                }
                if (~(class201.field3057 + -1) < ~var9) {
                    var9 = class201.field3057 - 1;
                }
                if (class141.field1911.method1635(class452.field7013, arg0 + -76)) {
                    class472.method2944(0);
                } else {
                    class472.method2944(var9);
                }
                for (int var10 = 0; ~var10 > -5; ++var10) {
                    for (int var17 = 0; class135.field1839 > var17; ++var17) {
                        for (int var18 = 0; ~class197.field3038 < ~var18; ++var18) {
                            class498.method3047((byte) -92, var18, var10, var17);
                        }
                    }
                }
                class98.method658(arg0 + -71);
                class500.method3052(0);
                class17.method91(arg0 + -76);
                class54.method410(20250);
                class108.field1552 = false;
                class490.method3008(-128);
                if (class92.field1342 != null && class338.field5281 != null && ~class148.field1994 == -11) {
                    ++class319.field4971;
                    class81.method578((byte) 66, class537.field7859);
                    class170.field2488.method1477(65280, 1057001181);
                }
                if (class357.field5545 == 0) {
                    int var11 = (-(class135.field1839 >> 4) + class517.field7675) / 8;
                    int var12 = ((class135.field1839 >> 4) + class517.field7675) / 8;
                    int var13 = (-(class197.field3038 >> 4) + class95.field1386) / 8;
                    int var14 = ((class197.field3038 >> 4) + class95.field1386) / 8;
                    for (int var15 = var11 + -1; var15 <= var12 + 1; ++var15) {
                        for (int var16 = var13 - 1; ~(var14 + 1) <= ~var16; ++var16) {
                            if (var15 < var11 || ~var15 < ~var12 || ~var16 > ~var13 || ~var16 < ~var14) {
                                class128.field1730.method1020(122, "m" + var15 + "_" + var16);
                                class128.field1730.method1020(-59, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (class148.field1994 != 3) {
                    if (class148.field1994 != 7) {
                        class89.method610(9, (byte) -76);
                        if (class338.field5281 != null) {
                            class81.method578((byte) 66, class444.field6906);
                        }
                    } else {
                        class89.method610(6, (byte) -61);
                    }
                } else {
                    class89.method610(2, (byte) -92);
                }
                class535.method3168((byte) 57);
                class500.method3052(arg0 + -75);
                class68.method485(0);
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
    public final void method915(int arg0) {
        if (arg0 != 0) {
            this.method912((byte) 84, (class409) null);
        }
        ++field6218;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
    public static final void method2631(int arg0, byte arg1) {
        ++field6221;
        class456 var2 = class233.method1654(arg0, 12, 39);
        if (arg1 >= -75) {
            field6238 = 71;
        }
        var2.method2862(0);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public final void method913(int arg0) {
        if (arg0 == 0) {
            ++field6233;
            while (super.field2009 != super.field2005) {
                this.method2627(arg0 ^ 2604);
            }
        }
    }
}
