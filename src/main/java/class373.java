import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class373 extends class118 {

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "Lpf;")
    public static class425 field5436 = new class425(36, 15);

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "Lwl;")
    public static class452 field5440 = new class452(90, 12);

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIII)V")
    public static final void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5439;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg4 * arg4;
        int var9 = arg1 * arg1;
        if (arg3 <= -73) {
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg1 << 1;
            int var13 = (-var12 + 1) * var8 + var10;
            int var14 = -((var12 + -1) * var11) + var9;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) - -3) * var10;
            int var18 = ((arg1 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            class379.method2285(125, class292.field4448[arg0], arg4 + arg5, arg2, arg5 - arg4);
            int var20 = (arg1 + -1) * var15;
            while (var7 > 0) {
                if (var13 < 0) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        ++var6;
                        var17 += var16;
                        var19 += var16;
                    }
                }
                if (var14 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    ++var6;
                    var17 += var16;
                }
                var14 += -var18;
                var13 += -var20;
                var18 -= var15;
                --var7;
                var20 -= var15;
                int var21 = -var7 + arg0;
                int var22 = arg0 + var7;
                int var23 = arg5 + var6;
                int var24 = -var6 + arg5;
                class379.method2285(124, class292.field4448[var21], var23, arg2, var24);
                class379.method2285(126, class292.field4448[var22], var23, arg2, var24);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIZII)V")
    public static final void method2240(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field5438;
        if (class277.field4216 == null) {
            class196.field2965.method1615(arg0, -16777216, arg4, arg1, arg5, (byte) -119);
        } else if (~class113.field1500.field1900 <= -1 && class113.field1500.field1900 < class115.field1522 * 128 && class113.field1500.field1892 >= 0 && class198.field3004 * 128 > class113.field1500.field1892) {
            ++class267.field4078;
            if (class113.field1500 != null && ~(class113.field1500.field1900 - (class113.field1500.method911(0) * 64 - 64) >> 7) == ~class8.field80 && class113.field1500.field1892 + 64 + -(class113.field1500.method911(0) * 64) >> 7 == class452.field6685) {
                class8.field80 = -1;
                class452.field6685 = -1;
                class351.method2111(125);
            }
            class294.method1832(-3);
            if (!arg3) {
                class345.method2104(-126);
            }
            class127.method746((byte) -124);
            class294.method1829(true, 101, arg1, arg5, arg0, arg4);
            int var6 = class371.field5413;
            int var7 = class94.field1310;
            int var8 = class177.field2687;
            int var9 = class272.field4165;
            if (~class80.field1054 != -2) {
                if (class80.field1054 != 4) {
                    if (class80.field1054 == 5) {
                        class88.method575(-50, var9);
                    }
                } else {
                    int var10 = (int) class188.field2811;
                    if (~var10 > ~(class198.field3007 >> 8)) {
                        var10 = class198.field3007 >> 8;
                    }
                    if (class79.field1038[4] && ~var10 > ~(class161.field2245[4] + 128)) {
                        var10 = class161.field2245[4] + 128;
                    }
                    int var11 = 16383 & (int) class462.field6810;
                    class433.method2664(class103.field1401, var11, (var10 >> 3) * 3 + 600, class136.field1804, (byte) -1, var10, class437.method2686(class143.field1911, 0, class155.field2138, class331.field4950) + -50, var9);
                }
            } else {
                int var12 = (int) class188.field2811;
                if (class198.field3007 >> 8 > var12) {
                    var12 = class198.field3007 >> 8;
                }
                if (class79.field1038[4] && ~var12 > ~(class161.field2245[4] - -128)) {
                    var12 = class161.field2245[4] + 128;
                }
                int var13 = 16383 & (int) class462.field6810 + class240.field3601;
                class433.method2664(class103.field1401, var13, 600 - -((var12 >> 3) * 3), class136.field1804, (byte) -1, var12, -50 + class437.method2686(class143.field1911, 0, class113.field1500.field1892, class113.field1500.field1900), var9);
            }
            int var14 = class185.field2790;
            int var15 = class127.field1626;
            int var16 = class196.field2967;
            int var17 = class350.field5204;
            int var18 = class201.field3037;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class79.field1038[var19]) {
                    int var22 = (int) ((double) (-class381.field5556[var19]) + (double) (class381.field5556[var19] * 2 - -1) * Math.random() + Math.sin((double) class28.field367[var19] / 100.0D * (double) class427.field6288[var19]) * (double) class161.field2245[var19]);
                    if (~var19 == -5) {
                        class350.field5204 += var22;
                        if (~class350.field5204 <= -1025) {
                            if (class350.field5204 > 3072) {
                                class350.field5204 = 3072;
                            }
                        } else {
                            class350.field5204 = 1024;
                        }
                    }
                    if (var19 == 3) {
                        class201.field3037 = 16383 & class201.field3037 + var22;
                    }
                    if (var19 == 0) {
                        class185.field2790 += var22;
                    }
                    if (var19 == 1) {
                        class127.field1626 += var22;
                    }
                    if (var19 == 2) {
                        class196.field2967 += var22;
                    }
                }
            }
            if (~class185.field2790 > -1) {
                class185.field2790 = 0;
            }
            if (~((class275.field4206 << 7) + -1) > ~class185.field2790) {
                class185.field2790 = (class275.field4206 << 7) + -1;
            }
            if (class196.field2967 < 0) {
                class196.field2967 = 0;
            }
            if (~class196.field2967 < ~((class265.field4044 << 7) - 1)) {
                class196.field2967 = (class265.field4044 << 7) + -1;
            }
            class87.method569(1);
            class443.method2709((byte) -107);
            class196.field2965.method436(var6, var7, var6 - -var8, var7 - -var9);
            class196.field2965.method353();
            int var20 = class162.field2252;
            if (class31.field396 != null) {
                class31.field396.method772(class201.field3037, 0, var6, var20, class350.field5204, var7, var9, class74.field973 << 3, var8, class196.field2965);
            } else {
                class196.field2965.method437(var20);
            }
            class374.method2244((byte) -78);
            class94.field1312.method612(class185.field2790, class127.field1626, class196.field2967, -class350.field5204 & 16383, -class201.field3037 & 16383, 16383 & -class363.field5344);
            class196.field2965.method397(class94.field1312);
            class196.field2965.method399(var6 - -(var8 / 2), var7 - -(var9 / 2), class442.field6498 << 1, class442.field6498 << 1);
            class315.method1925(class442.field6498 << 1, class442.field6498 << 1, var8 / 2 + var6, var9 / 2 + var7, (byte) -114);
            class257.method1600(class196.field2967, class185.field2790, (byte) 36, 16383 & -class201.field3037, 16383 & -class350.field5204, class127.field1626, 16383 & -class363.field5344);
            byte var21 = ~class113.method684(1) != -3 ? 1 : (byte) class267.field4078;
            class326.method2009(class196.field2965, class26.field332, class86.field1213, class94.field1312, class185.field2790, class127.field1626, class196.field2967, class75.field1016, class170.field2630, class301.field4545, class383.field5589, class282.field4314, class150.field2078, class113.field1500.field1902 + 1, var21, class113.field1500.field1900 >> 7, class113.field1500.field1892 >> 7, !class424.field6237);
            if (arg2 != -970) {
                field5440 = null;
            }
            class374.method2244((byte) -78);
            if (class19.field263 == 30) {
                class72.method479(var9, var8, var7, 256, 122, var6, 256);
                class311.method1895(var6, var9, 256, var8, var7, 256, true);
                class107.method666(var7, var6, 256, (byte) 61, var9, var8, 256);
                class463.method2853(var8, var9, var6, true, var7);
            }
            class88.method585();
            class201.field3037 = var18;
            class127.field1626 = var15;
            class350.field5204 = var17;
            class196.field2967 = var16;
            class185.field2790 = var14;
            if (class253.field3861 && ~class8.field92.method299((byte) 70) == -1) {
                class253.field3861 = false;
            }
            if (class253.field3861) {
                class196.field2965.method1615(var8, -16777216, var9, var6, var7, (byte) -119);
                class217.method1322(class380.field5552, class28.field365.method937((byte) -67, class27.field356), 100, false);
            }
        } else {
            class196.field2965.method1615(arg0, -16777216, arg4, arg1, arg5, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
    public class373() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V")
    public static void method2241(int arg0) {
        field5436 = null;
        if (arg0 != 29246) {
            method2239(-8, 117, -31, -64, -73, 52);
        }
        field5440 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field5437;
        if (arg0 != 1) {
            method2239(6, -17, -21, -78, 5, 106);
        }
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[][] var4 = this.method708(arg1, (byte) -96, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class440.field6474 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
