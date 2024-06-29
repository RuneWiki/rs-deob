import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class155 {

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
    public static boolean field2557 = true;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
    public static int[] field2553;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "[[[J")
    public static long[][][] field2554;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BIII)V")
    public static final void method1163(byte arg0, int arg1, int arg2, int arg3) {
        field2555++;
        int var4 = arg3 + class143.field2474;
        int var5 = arg1 + class63.field917;
        if (class541.field7946 == null || arg3 < 0 || arg1 < 0 || class430.field6136 <= arg3 || class580.field8504 <= arg1 || !class525.field7713.method3471(class76.field1182, false) && class103.field1708.field3158 != arg2) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg2 << 28 | var4);
        class430 var8 = (class430) class480.field6870.method2818(arg0 ^ 0x5941, var6);
        if (arg0 != -84) {
            field2557 = true;
        }
        if (var8 == null) {
            class61.method516(arg2, arg3, arg1);
            return;
        }
        class417 var9 = (class417) var8.field6133.method3905(arg0 - 27);
        if (var9 == null) {
            class61.method516(arg2, arg3, arg1);
            return;
        }
        class82 var10 = (class82) class61.method516(arg2, arg3, arg1);
        if (var10 == null) {
            var10 = new class82(arg3 << 9, class687.field9745[arg2].method3858(arg1, arg3, (byte) 28), arg1 << 9, arg2, arg2);
        } else {
            var10.field1240 = var10.field1245 = -1;
        }
        var10.field1256 = var9.field5939;
        var10.field1239 = var9.field5941;
        label61: while (true) {
            class417 var11 = (class417) var8.field6133.method3899(0);
            if (var11 == null) {
                break;
            }
            if (var10.field1239 != var11.field5941) {
                var10.field1252 = var11.field5939;
                var10.field1240 = var11.field5941;
                while (true) {
                    class417 var12 = (class417) var8.field6133.method3899(0);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field1239 != var12.field5941 && var10.field1240 != var12.field5941) {
                        var10.field1245 = var12.field5941;
                        var10.field1247 = var12.field5939;
                    }
                }
            }
        }
        int var13 = class603.method3433((arg1 << 9) + 256, arg2, (arg3 << 9) + 256, -41);
        var10.field3158 = (byte) arg2;
        var10.field1254 = 0;
        var10.field3155 = arg3 << 9;
        var10.field3160 = var13;
        var10.field3163 = (byte) arg2;
        var10.field3154 = arg1 << 9;
        if (class151.method1151(arg1, arg3, (byte) -49)) {
            var10.field3163++;
        }
        method1167(arg2, arg3, arg1, var13, var10);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public static final void method1164(boolean arg0) {
        class448.method2610(false, false);
        field2558++;
        class73.field1169 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class436.field6271.length; var2++) {
            if (class297.field4200[var2] != -1 && class436.field6271[var2] == null) {
                class436.field6271[var2] = class466.field6733.method2081(32, 0, class297.field4200[var2]);
                if (class436.field6271[var2] == null) {
                    var1 = false;
                    class73.field1169++;
                }
            }
            if (class623.field8876[var2] != -1 && class395.field5713[var2] == null) {
                class395.field5713[var2] = class466.field6733.method2075(0, -99, class623.field8876[var2], class500.field7433[var2]);
                if (class395.field5713[var2] == null) {
                    class73.field1169++;
                    var1 = false;
                }
            }
            if (class204.field3165[var2] != -1 && class648.field9181[var2] == null) {
                class648.field9181[var2] = class466.field6733.method2081(122, 0, class204.field3165[var2]);
                if (class648.field9181[var2] == null) {
                    var1 = false;
                    class73.field1169++;
                }
            }
            if (class694.field9865[var2] != -1 && class113.field1805[var2] == null) {
                class113.field1805[var2] = class466.field6733.method2081(-126, 0, class694.field9865[var2]);
                if (class113.field1805[var2] == null) {
                    class73.field1169++;
                    var1 = false;
                }
            }
            if (class223.field3352 != null && class556.field8139[var2] == null && class223.field3352[var2] != -1) {
                class556.field8139[var2] = class466.field6733.method2075(0, 81, class223.field3352[var2], class500.field7433[var2]);
                if (class556.field8139[var2] == null) {
                    class73.field1169++;
                    var1 = false;
                }
            }
        }
        if (class189.field2961 == null) {
            if (class491.field7055 == null || !class72.field1152.method2087((byte) -72, class491.field7055.field5111 + "_staticelements")) {
                class189.field2961 = new class149(0);
            } else if (class72.field1152.method2072(class491.field7055.field5111 + "_staticelements", -6257)) {
                class189.field2961 = class512.method3047(class491.field7055.field5111 + "_staticelements", class206.field3186, class72.field1152, (byte) 39);
            } else {
                var1 = false;
                class73.field1169++;
            }
        }
        if (!var1) {
            class105.field1736 = 1;
            return;
        }
        boolean var3 = true;
        class113.field1806 = 0;
        for (int var4 = 0; var4 < class436.field6271.length; var4++) {
            byte[] var21 = class395.field5713[var4];
            if (var21 != null) {
                int var22 = (class221.field3306[var4] >> 8) * 64 - class143.field2474;
                int var23 = (class221.field3306[var4] & 0xFF) * 64 - class63.field917;
                if (class121.field1983 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class440.method2569(var22, class580.field8504, 11103, var23, class430.field6136, var21);
            }
            byte[] var24 = class113.field1805[var4];
            if (var24 != null) {
                int var25 = (class221.field3306[var4] >> 8) * 64 - class143.field2474;
                int var26 = (class221.field3306[var4] & 0xFF) * 64 - class63.field917;
                if (class121.field1983 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class440.method2569(var25, class580.field8504, 11103, var26, class430.field6136, var24);
            }
        }
        if (!var3) {
            class105.field1736 = 2;
            return;
        }
        if (class105.field1736 != 0) {
            class194.method1361(class637.field9048, (byte) -12, true, class399.field5763, class335.field4670, class343.field4761.method2059(class238.field3511, true) + "<br>(100%)");
        }
        class655.method3701((byte) 38);
        class293.method1795((byte) -79);
        boolean var5 = false;
        if (class637.field9048.method767() && class525.field7713.field5981) {
            for (int var6 = 0; var6 < class436.field6271.length; var6++) {
                if (class113.field1805[var6] != null || class648.field9181[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class525.field7713.field5972) {
            var7 = class42.field577[class569.field8314];
        } else {
            var7 = class597.field8635[class569.field8314];
        }
        if (class637.field9048.method778()) {
            var7++;
        }
        class621.method3505(class637.field9048, class680.field9683, 9, 4, class430.field6136, class580.field8504, var7, var5, class637.field9048.method802() > 0);
        class311.method1882(class563.field8217);
        if (class563.field8217 == 0) {
            class452.method2631(null);
        } else {
            class452.method2631(class424.field6054);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class45.field609[var8].method3165(true);
        }
        class114.method923(false);
        class136.method1041(-125, false);
        class355.method2151(29229);
        class347.field4911 = null;
        class237.field3503 = false;
        class655.method3701((byte) 38);
        System.gc();
        class448.method2610(arg0, true);
        class699.method3929(125);
        class74.field1175 = class525.field7713.method2484(class76.field1182, arg0);
        class73.field1168 = class246.field3583 >= 96;
        class167.field2739 = class525.field7713.field5981;
        class363.field5056 = class525.field7713.method2485((byte) 72, class76.field1182);
        class412.field5868 = !class525.field7713.field5986;
        class447.field6461 = class525.field7713.method3471(class76.field1182, false) ? -1 : class132.field2149;
        class542.field7984 = class435.method2550(class76.field1182, (byte) -50) || class525.field7713.field5967;
        class701.field9925 = class525.field7713.field5979;
        class583.field8545 = new class678(4, class430.field6136, class580.field8504, false);
        if (class121.field1983 == 0) {
            class669.method3778(class436.field6271, class583.field8545, -29559);
        } else {
            class39.method325(class436.field6271, 0, class583.field8545);
        }
        class26.method247(class580.field8504 >> 4, (byte) 84, class430.field6136 >> 4);
        class126.method1000(-6648);
        if (var5) {
            class699.method3928(true);
            class462.field6636 = new class678(1, class430.field6136, class580.field8504, true);
            if (class121.field1983 == 0) {
                class669.method3778(class648.field9181, class462.field6636, -29559);
                class448.method2610(arg0, true);
            } else {
                class39.method325(class648.field9181, 0, class462.field6636);
                class448.method2610(false, true);
            }
            class462.field6636.method870(class583.field8545.field1692[0], 2, 0);
            class462.field6636.method866(null, class637.field9048, false, null);
            class699.method3928(false);
        }
        class583.field8545.method866(var5 ? class462.field6636.field1692 : null, class637.field9048, false, class45.field609);
        if (class121.field1983 == 0) {
            class448.method2610(false, true);
            class49.method391(class583.field8545, class395.field5713, 8945);
            if (class556.field8139 != null) {
                class577.method3343(0);
            }
        } else {
            class448.method2610(false, true);
            class618.method3495((byte) 96, class395.field5713, class583.field8545);
        }
        class293.method1795((byte) -110);
        if (class246.field3583 < 96) {
            class399.method2424((byte) 42);
        }
        class448.method2610(arg0, true);
        class583.field8545.method860(class637.field9048, null, var5 ? class340.field4723[0] : null, 3);
        class583.field8545.method3834(class637.field9048, -6997, arg0);
        class448.method2610(false, true);
        if (var5) {
            class699.method3928(true);
            class448.method2610(false, true);
            if (class121.field1983 == 0) {
                class49.method391(class462.field6636, class113.field1805, 8945);
            } else {
                class618.method3495((byte) 96, class113.field1805, class462.field6636);
            }
            class293.method1795((byte) -94);
            class448.method2610(false, true);
            class462.field6636.method860(class637.field9048, class621.field8841[0], null, 3);
            class462.field6636.method3834(class637.field9048, -6997, true);
            class448.method2610(false, true);
            class699.method3928(false);
        }
        class535.method3140((byte) 3);
        int var9 = class583.field8545.field9651;
        if (class416.field5926 < var9) {
            var9 = class416.field5926;
        }
        if ((class416.field5926 - 1) > var9) {
            var9 = class416.field5926 - 1;
        }
        if (class525.field7713.method3471(class76.field1182, false)) {
            class150.method1147(0);
        } else {
            class150.method1147(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class430.field6136; var19++) {
                for (int var20 = 0; var20 < class580.field8504; var20++) {
                    method1163((byte) -84, var20, var10, var19);
                }
            }
        }
        class247.method1588(-115);
        class655.method3701((byte) 38);
        class102.method858((byte) 57);
        class293.method1795((byte) -89);
        class276.method1724(256);
        if (class699.field9906 != null && class256.field3696 != null && class515.field7636 == 11) {
            class482.field6895++;
            class699 var11 = class452.method2630(class699.field9897, class507.field7529, (byte) 121);
            var11.field9908.method2733(arg0, 1057001181);
            class149.method1134(var11, !arg0);
        }
        if (class121.field1983 == 0) {
            int var12 = (class443.field6420 - (class430.field6136 >> 4)) / 8;
            int var13 = ((class430.field6136 >> 4) + class443.field6420) / 8;
            int var14 = (class316.field4372 - (class580.field8504 >> 4)) / 8;
            int var15 = ((class580.field8504 >> 4) + class316.field4372) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class466.field6733.method2092("m" + var16 + "_" + var17, -6382);
                        class466.field6733.method2092("l" + var16 + "_" + var17, -6382);
                    }
                }
            }
        }
        if (class515.field7636 == 4) {
            class595.method3408((byte) 30, 3);
        } else if (class515.field7636 == 8) {
            class595.method3408((byte) 125, 7);
        } else {
            class595.method3408((byte) 32, 10);
            if (class256.field3696 != null) {
                class699 var18 = class452.method2630(class699.field9897, class555.field8114, (byte) 121);
                class149.method1134(var18, true);
            }
        }
        class596.method3412((byte) 107);
        class655.method3701((byte) 38);
        class692.method3892(-7848);
        if (class511.field7610) {
            class28.method269(32316, "Took: " + (class254.method1619(!arg0) - class538.field7902) + "ms");
            class511.field7610 = false;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public static void method1165(int arg0) {
        field2553 = null;
        field2554 = null;
        if (arg0 >= -31) {
            field2553 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)[Ldm;")
    public static final class680[] method1166(int arg0) {
        if (class332.field4625 == null) {
            class680[] var1 = class65.method540(121, class653.field9220);
            class680[] var2 = new class680[var1.length];
            int var3 = 0;
            int var4 = class525.field7713.method3482(0, class76.field1182);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class680 var9 = var1[var5];
                if ((var9.field9682 <= 0 || var9.field9682 >= 24) && var9.field9677 >= 800 && var9.field9674 >= 600 && (var4 != 2 || var9.field9677 <= 800 && var9.field9674 <= 600) && (var4 != 1 || var9.field9677 <= 1024 && var9.field9674 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class680 var11 = var2[var10];
                        if (var9.field9677 == var11.field9677 && var9.field9674 == var11.field9674) {
                            if (var11.field9682 < var9.field9682) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class332.field4625 = new class680[var3];
            class553.method3243(var2, 0, class332.field4625, 0, var3);
            int[] var6 = new int[class332.field4625.length];
            for (int var7 = 0; var7 < class332.field4625.length; var7++) {
                class680 var8 = class332.field4625[var7];
                var6[var7] = var8.field9677 * var8.field9674;
            }
            class522.method3078(class332.field4625, (byte) -100, var6);
        }
        field2556++;
        return arg0 >= -100 ? null : class332.field4625;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIILkj;)V")
    private static final void method1167(int arg0, int arg1, int arg2, int arg3, class72 arg4) {
        class293 var5 = class316.method1907(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field3155 = (arg1 << class49.field637) + class211.field3229;
        arg4.field3160 = arg3;
        arg4.field3154 = (arg2 << class49.field637) + class211.field3229;
        if (var5.field4084 != null) {
            arg4.field3160 -= var5.field4084.field9737;
        }
        var5.field4089 = arg4;
        int var6 = class687.field9745 == class340.field4723 ? 1 : 0;
        if (arg4.method633(true)) {
            if (arg4.method630(-122)) {
                class430.field6131[var6][class352.field4945[var6]++] = arg4;
                return;
            }
            class431.field6138[var6][class310.field4305[var6]++] = arg4;
            return;
        }
        class128.field2093[var6][class108.field1764[var6]++] = arg4;
    }
}
