import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field236 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field235 = 0;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field238 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[[[I")
    public static int[][][] field237;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lya;I)V")
    public static final void method112(class38 arg0, int arg1) {
        field242++;
        int var2 = class88.field1290;
        int var3 = -90 / ((arg1 - 47) / 36);
        int var4 = class263.field3634;
        int var5 = class464.field6821;
        int var6 = class142.field2034;
        int var7 = -10660793;
        arg0.method325(var2, var5, var7, 1, var4, var6);
        arg0.method325(var2 + 1, var5 - 2, -16777216, 1, var4 + 1, 16);
        arg0.method233(var6 - 19, var4 + 18, var5 - 2, var2 + 1, false, -16777216);
        class135.field1949.method1833(var2 + 3, class391.field5725.method2731(62, class372.field5455), -1, 127, var4 + 14, var7);
        int var8 = class518.field7668.method1813(0);
        int var9 = class518.field7668.method1822(126);
        int var10 = 0;
        for (class82 var11 = (class82) class526.field7778.method2818((byte) 121); var11 != null; var11 = (class82) class526.field7778.method2820((byte) -58)) {
            int var12 = (class274.field3764 - var10 - 1) * 16 + var4 + 31;
            short var13 = -1;
            if (var8 > var2 && var2 + var5 > var8 && (var12 - 13) < var9 && (var12 + 3) > var9 && var11.field1234) {
                var13 = -256;
            }
            int[] var14 = null;
            if (class256.method1540(var11.field1230, -122)) {
                var14 = class328.field4480.method3091(58, (int) var11.field1238).field7552;
            } else if (var11.field1235 != -1) {
                var14 = class328.field4480.method3091(60, var11.field1235).field7552;
            } else if (class442.method2632((byte) -120, var11.field1230)) {
                class502 var17 = class378.field5533[(int) var11.field1238];
                if (var17 != null) {
                    class79 var18 = var17.field7387;
                    if (var18.field1143 != null) {
                        var18 = var18.method646(0, class421.field6166);
                    }
                    if (var18 != null) {
                        var14 = var18.field1209;
                    }
                }
            } else if (class90.method672(var11.field1230, (byte) 30)) {
                Object var15 = null;
                class220 var16;
                if (var11.field1230 == 1006) {
                    var16 = class78.field1141.method2103((int) var11.field1238, true);
                } else {
                    var16 = class78.field1141.method2103((int) (var11.field1238 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var16.field3080 != null) {
                    var16 = var16.method1362(true, class421.field6166);
                }
                if (var16 != null) {
                    var14 = var16.field3132;
                }
            }
            String var19 = class113.method813(var11, -2048);
            if (var14 != null) {
                var19 = var19 + class235.method1451(0, var14);
            }
            class135.field1949.method1827(var12, 0, class383.field5592, class150.field2264, var19, var2 + 3, (byte) -24, var13);
            var10++;
            if (var11.field1236) {
                class511.field7573.method85(class407.field5952.method2867(var19, (byte) -70) + var2 + 5, var12 + -12);
            }
        }
        class469.method2750(class464.field6821, class142.field2034, (byte) 107, class263.field3634, class88.field1290);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIFI[FIIIFI)V")
    public static final void method113(int arg0, int arg1, int arg2, float arg3, int arg4, float[] arg5, int arg6, int arg7, int arg8, float arg9, int arg10) {
        int var11 = arg2 - arg7;
        int var12 = arg4 - arg1;
        field241++;
        int var13 = arg8 - arg6;
        float var14 = arg5[2] * (float) var12 + arg5[0] * (float) var13 + arg5[1] * (float) var11;
        float var15 = arg5[5] * (float) var12 + arg5[3] * (float) var13 + arg5[4] * (float) var11;
        float var16 = arg5[8] * (float) var12 + arg5[arg0] * (float) var13 + arg5[7] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var17 = arg9 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg10 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg10 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg10 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class195.field2783 = var17;
        class226.field3208 = var18;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method114(byte arg0) {
        int var1 = 105 / ((arg0 + 69) / 38);
        field236 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method115(int arg0) {
        class105.method776(false, arg0 + 21634);
        field240++;
        class509.field7554 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class526.field7779.length; var2++) {
            if (class117.field1750[var2] != -1 && class526.field7779[var2] == null) {
                class526.field7779[var2] = class297.field4079.method727(0, class117.field1750[var2], 34);
                if (class526.field7779[var2] == null) {
                    var1 = false;
                    class509.field7554++;
                }
            }
            if (class487.field7130[var2] != -1 && class80.field1224[var2] == null) {
                class80.field1224[var2] = class297.field4079.method732(0, 23159, class110.field1649[var2], class487.field7130[var2]);
                if (class80.field1224[var2] == null) {
                    var1 = false;
                    class509.field7554++;
                }
            }
            if (class250.field3463[var2] != -1 && class322.field4391[var2] == null) {
                class322.field4391[var2] = class297.field4079.method727(0, class250.field3463[var2], 114);
                if (class322.field4391[var2] == null) {
                    class509.field7554++;
                    var1 = false;
                }
            }
            if (class110.field1657[var2] != -1 && class11.field165[var2] == null) {
                class11.field165[var2] = class297.field4079.method727(0, class110.field1657[var2], -91);
                if (class11.field165[var2] == null) {
                    var1 = false;
                    class509.field7554++;
                }
            }
            if (class411.field6007 != null && class318.field4372[var2] == null && class411.field6007[var2] != -1) {
                class318.field4372[var2] = class297.field4079.method732(0, 23159, class110.field1649[var2], class411.field6007[var2]);
                if (class318.field4372[var2] == null) {
                    class509.field7554++;
                    var1 = false;
                }
            }
        }
        if (class398.field5823 == null) {
            if (class61.field764 == null || !class352.field5173.method743(false, class61.field764.field3478 + "_staticelements")) {
                class398.field5823 = new class414(0);
            } else if (class352.field5173.method740(true, class61.field764.field3478 + "_staticelements")) {
                class398.field5823 = class367.method2215(class61.field764.field3478 + "_staticelements", class64.field870, class352.field5173, arg0 + 27774);
            } else {
                var1 = false;
                class509.field7554++;
            }
        }
        if (!var1) {
            class30.field401 = 1;
            return;
        }
        boolean var3 = true;
        class445.field6556 = 0;
        for (int var4 = 0; var4 < class526.field7779.length; var4++) {
            byte[] var19 = class80.field1224[var4];
            if (var19 != null) {
                int var20 = (class310.field4218[var4] >> 8) * 64 - class510.field7566;
                int var21 = (class310.field4218[var4] & 0xFF) * 64 - class14.field204;
                if (class403.field5918 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class239.method1458(var20, var21, class422.field6182, class527.field7799, var19, -127);
            }
            byte[] var22 = class11.field165[var4];
            if (var22 != null) {
                int var23 = (class310.field4218[var4] >> 8) * 64 - class510.field7566;
                int var24 = (class310.field4218[var4] & 0xFF) * 64 - class14.field204;
                if (class403.field5918 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class239.method1458(var23, var24, class422.field6182, class527.field7799, var22, arg0 ^ 0x5487);
            }
        }
        if (!var3) {
            class30.field401 = 2;
            return;
        }
        if (class30.field401 != 0) {
            class203.method1262(class297.field4084, true, class156.field2371.method2731(62, class372.field5455) + "<br>(100%)", 2048);
        }
        class358.method2144((byte) 90);
        class142.method959(-21808);
        boolean var5 = false;
        if (class269.field3721.method276() && class20.field269.field7636) {
            for (int var6 = 0; var6 < class526.field7779.length; var6++) {
                if (class11.field165[var6] != null || class322.field4391[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class20.field269.field7653) {
            var7 = class376.field5509[class433.field6358];
        } else {
            var7 = class210.field2937[class433.field6358];
        }
        if (class269.field3721.method273()) {
            var7++;
        }
        class469.method2751(7, 4, class527.field7799, class422.field6182, var7, var5, class269.field3721.method263() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class82.field1229[var8].method945((byte) 66);
        }
        class329.method1907(0);
        class371.method2226(false, arg0 ^ 0x54B9);
        class84.method660(arg0 ^ 0xFFFFAB06);
        class294.field4052 = null;
        class358.method2144((byte) 63);
        System.gc();
        class105.method776(true, 41);
        class459.method2690(true);
        class132.field1931 = class20.field269.method3085(class152.field2332, (byte) -79);
        class14.field210 = class261.field3627 >= 96;
        class113.field1690 = class20.field269.field7636;
        class106.field1593 = class20.field269.method3084((byte) -96, class152.field2332);
        class466.field6838 = !class20.field269.field7660;
        class182.field2677 = class20.field269.method1712(class152.field2332, false) ? -1 : class124.field1854;
        class474.field6930 = class152.field2332 == 1 || class20.field269.field7631;
        class83.field1242 = class20.field269.field7632;
        class98.field1484 = new class349(4, class527.field7799, class422.field6182, false);
        if (class403.field5918 == 0) {
            class171.method1115(arg0 ^ 0xFFFFAB60, class98.field1484, class526.field7779);
        } else {
            class50.method439((byte) -105, class526.field7779, class98.field1484);
        }
        class497.method2901(106, class527.field7799 >> 4, class422.field6182 >> 4);
        class207.method1284(false);
        if (var5) {
            class11.method52(true);
            class282.field3861 = new class349(1, class527.field7799, class422.field6182, true);
            if (class403.field5918 == 0) {
                class171.method1115(110, class282.field3861, class322.field4391);
                class105.method776(true, -127);
            } else {
                class50.method439((byte) 88, class322.field4391, class282.field3861);
                class105.method776(true, 96);
            }
            class282.field3861.method1880(class98.field1484.field4410[0], 0, 124);
            class282.field3861.method1881(class269.field3721, (byte) -103, null, null);
            class11.method52(false);
        }
        class98.field1484.method1881(class269.field3721, (byte) -105, class82.field1229, var5 ? class282.field3861.field4410 : null);
        if (class403.field5918 == 0) {
            class105.method776(true, 126);
            class489.method2862(class98.field1484, (byte) -50, class80.field1224);
            if (class318.field4372 != null) {
                class424.method2520((byte) 125);
            }
        } else {
            class105.method776(true, -125);
            class371.method2225(class98.field1484, class80.field1224, true);
        }
        class142.method959(-21808);
        class105.method776(true, -121);
        class98.field1484.method1885(var5 ? class89.field1302[0] : null, null, class269.field3721, 1);
        class98.field1484.method2076(-118, class269.field3721);
        class105.method776(true, 27);
        if (var5) {
            class11.method52(true);
            class105.method776(true, -123);
            if (class403.field5918 == 0) {
                class489.method2862(class282.field3861, (byte) -50, class11.field165);
            } else {
                class371.method2225(class282.field3861, class11.field165, true);
            }
            class142.method959(arg0 - 52);
            class105.method776(true, 35);
            class282.field3861.method1885(null, class385.field5608[0], class269.field3721, 1);
            class282.field3861.method2076(-118, class269.field3721);
            class105.method776(true, 85);
            class11.method52(false);
        }
        class442.method2636((byte) -110);
        int var9 = class98.field1484.field5091;
        if (var9 > class436.field6379) {
            var9 = class436.field6379;
        }
        if (var9 < class436.field6379 - 1) {
            var9 = class436.field6379 - 1;
        }
        if (arg0 != -21756) {
            field237 = null;
        }
        if (class20.field269.method1712(class152.field2332, false)) {
            class236.method1452(0);
        } else {
            class236.method1452(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class527.field7799; var17++) {
                for (int var18 = 0; var18 < class422.field6182; var18++) {
                    class224.method1392((byte) -73, var10, var18, var17);
                }
            }
        }
        class53.method459(1);
        class358.method2144((byte) 61);
        class194.method1207(arg0 + 21756);
        class142.method959(-21808);
        class373.field5480 = false;
        class310.method1798((byte) 93);
        if (class367.field5383 != null && class33.field438 != null && class492.field7178 == 25) {
            class381.field5562++;
            class491.method2878((byte) 92, class253.field3502);
            class481.field7027.method2359(1057001181, -101);
        }
        if (class403.field5918 == 0) {
            int var11 = (class38.field474 - (class527.field7799 >> 4)) / 8;
            int var12 = ((class527.field7799 >> 4) + class38.field474) / 8;
            int var13 = (class434.field6363 - (class422.field6182 >> 4)) / 8;
            int var14 = ((class422.field6182 >> 4) + class434.field6363) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var15 < var11 || var12 < var15 || var13 > var16 || var14 < var16) {
                        class297.field4079.method756("m" + var15 + "_" + var16, (byte) -91);
                        class297.field4079.method756("l" + var15 + "_" + var16, (byte) -96);
                    }
                }
            }
        }
        if (class492.field7178 == 28) {
            class448.method2651(10, (byte) 112);
        } else {
            class448.method2651(30, (byte) 112);
            if (class33.field438 != null) {
                class491.method2878((byte) 92, class427.field6258);
            }
        }
        class398.method2401(arg0 + 21756);
        class358.method2144((byte) 77);
        class409.method2445(-33);
    }
}
