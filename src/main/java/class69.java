import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class69 extends class188 {

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Lph;")
    public static class229 field1108 = class266.method1858(" steht bereits auf Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field1107 = 1;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Lph;")
    public static class229 field1109 = class266.method1858(": ", 0);

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[Lcl;")
    public static class32[] field1102;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lri;II)I", line = 8)
    public static final int method539(class301 arg0, int arg1, int arg2) {
        field1105++;
        if (arg0.field4968 == null || arg1 >= arg0.field4968.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4968[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            if (arg2 != -254567536) {
                return -36;
            }
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class230.field3825[var3[var4++]];
                }
                if (var7 == 2) {
                    var9 = class171.field2819[var3[var4++]];
                }
                if (var7 == 3) {
                    var9 = class145.field2347[var3[var4++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class301 var12 = class206.method1440(var11, (byte) -68);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class124.method920(-84, var13).field3123 || class185.field3006)) {
                        for (int var14 = 0; var14 < var12.field4922.length; var14++) {
                            if ((var13 + 1) == var12.field4922[var14]) {
                                var9 += var12.field4909[var14];
                            }
                        }
                    }
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 5) {
                    var9 = class166.field2711[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class57.field799[class171.field2819[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class166.field2711[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class230.field3820.field3468;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class301.field4992[var15]) {
                            var9 += class171.field2819[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class301 var18 = class206.method1440(var17, (byte) -68);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class124.method920(-84, var19).field3123 || class185.field3006)) {
                        for (int var20 = 0; var20 < var18.field4922.length; var20++) {
                            if (var19 + 1 == var18.field4922[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class53.field749;
                }
                if (var7 == 12) {
                    var9 = class111.field1872;
                }
                if (var7 == 13) {
                    int var21 = class166.field2711[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class218.method1527(var23, (byte) -7);
                }
                if (var7 == 18) {
                    var9 = (class230.field3820.field5147 >> 7) + class1.field9;
                }
                if (var7 == 19) {
                    var9 = (class230.field3820.field5168 >> 7) + class1.field1;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var5 += var9;
                    }
                    if (var6 == 1) {
                        var5 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var6 == 3) {
                        var5 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 213)
    public static void method540(byte arg0) {
        field1102 = null;
        if (arg0 == -52) {
            field1109 = null;
            field1108 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIII)V", line = 237)
    public static final void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1110++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = arg3 - arg5;
        int var11 = arg4 - arg5;
        int var12 = 0;
        int var13 = var11 * var11;
        int var14 = arg4 * arg4;
        int var15 = arg3 * arg3;
        int var16 = var10 * var10;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg4 << 1;
        int var22 = var11 << 1;
        int var23 = var14 - (var21 - 1) * var19;
        int var24 = (1 - var21) * var15 + var17;
        int var25 = (1 - var22) * var16 + var18;
        int var26 = var13 - ((var22 - 1) * var20);
        int var27 = var15 << 2;
        int var28 = var14 << 2;
        int var29 = var13 << 2;
        int var30 = var16 << 2;
        int var31 = 37 / ((arg7 - 57) / 34);
        int var32 = (var21 - 3) * var19;
        int var33 = var17 * 3;
        int var34 = var28;
        int var35 = var18 * 3;
        int var36 = (arg4 - 1) * var27;
        int var37 = (var22 - 3) * var20;
        int var38 = var29;
        int var39 = (var11 - 1) * var30;
        if (arg2 >= class206.field3398 && arg2 <= class214.field3533) {
            int[] var40 = class202.field3337[arg2];
            int var41 = class178.method1278(class77.field1289, arg0 - arg3, -18842, class192.field3172);
            int var42 = class178.method1278(class77.field1289, arg0 + arg3, -18842, class192.field3172);
            int var43 = class178.method1278(class77.field1289, arg0 - var10, -18842, class192.field3172);
            int var44 = class178.method1278(class77.field1289, arg0 + var10, -18842, class192.field3172);
            class193.method1354((byte) -37, var43, var41, arg6, var40);
            class193.method1354((byte) -37, var44, var43, arg1, var40);
            class193.method1354((byte) -37, var42, var44, arg6, var40);
        }
        while (var9 > 0) {
            boolean var45 = var11 >= var9;
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var33;
                    var23 += var34;
                    var34 += var28;
                    var33 += var28;
                    var12++;
                }
            }
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var25 += var35;
                        var35 += var29;
                        var8++;
                        var38 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var25 += var35;
                    var35 += var29;
                    var8++;
                    var38 += var29;
                }
                var25 += -var39;
                var26 += -var37;
                var39 -= var30;
                var37 -= var30;
            }
            var9--;
            int var46 = arg2 - var9;
            if (var23 < 0) {
                var12++;
                var24 += var33;
                var23 += var34;
                var34 += var28;
                var33 += var28;
            }
            var24 += -var36;
            int var47 = arg2 + var9;
            if (class206.field3398 <= var47 && class214.field3533 >= var46) {
                int var48 = class178.method1278(class77.field1289, arg0 + var12, -18842, class192.field3172);
                int var49 = class178.method1278(class77.field1289, arg0 - var12, -18842, class192.field3172);
                if (var45) {
                    int var50 = class178.method1278(class77.field1289, arg0 + var8, -18842, class192.field3172);
                    int var51 = class178.method1278(class77.field1289, arg0 - var8, -18842, class192.field3172);
                    if (class206.field3398 <= var46) {
                        int[] var52 = class202.field3337[var46];
                        class193.method1354((byte) -37, var51, var49, arg6, var52);
                        class193.method1354((byte) -37, var50, var51, arg1, var52);
                        class193.method1354((byte) -37, var48, var50, arg6, var52);
                    }
                    if (class214.field3533 >= var47) {
                        int[] var53 = class202.field3337[var47];
                        class193.method1354((byte) -37, var51, var49, arg6, var53);
                        class193.method1354((byte) -37, var50, var51, arg1, var53);
                        class193.method1354((byte) -37, var48, var50, arg6, var53);
                    }
                } else {
                    if (var46 >= class206.field3398) {
                        class193.method1354((byte) -37, var48, var49, arg6, class202.field3337[var46]);
                    }
                    if (var47 <= class214.field3533) {
                        class193.method1354((byte) -37, var48, var49, arg6, class202.field3337[var47]);
                    }
                }
            }
            var23 += -var32;
            var32 -= var27;
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z", line = 454)
    public static final boolean method542(int arg0, int arg1) {
        field1101++;
        if (class133.field2164[arg0]) {
            return true;
        } else if (class75.field1264.method512(arg0, (byte) -74)) {
            int var2 = class75.field1264.method517((byte) -126, arg0);
            if (var2 == 0) {
                class133.field2164[arg0] = true;
                return true;
            }
            if (class37.field604[arg0] == null) {
                class37.field604[arg0] = new class301[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class37.field604[arg0][var3] == null) {
                    byte[] var4 = class75.field1264.method523(arg1 - 14, var3, arg0);
                    if (var4 != null) {
                        class37.field604[arg0][var3] = new class301();
                        class37.field604[arg0][var3].field4948 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class37.field604[arg0][var3].method2020(new class164(var4), arg1 ^ 0xFFFFF7D1);
                        } else {
                            class37.field604[arg0][var3].method2018(false, new class164(var4));
                        }
                    }
                }
            }
            if (arg1 != -1) {
                method542(-111, 81);
            }
            class133.field2164[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 521)
    public static final void method543(int arg0, int arg1, int arg2) {
        field1103++;
        class227 var3 = class8.field108[class298.field4849][arg2][arg1];
        if (var3 == null) {
            class323.method2215(class298.field4849, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class37 var5 = null;
        for (class37 var6 = (class37) var3.method1580((byte) -39); var6 != null; var6 = (class37) var3.method1579((byte) 28)) {
            class191 var7 = class124.method920(-84, var6.field605.field2505);
            int var8 = var7.field3113;
            if (var7.field3134 == 1) {
                var8 = (var6.field605.field2511 + 1) * var8;
            }
            if (var4 < var8) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class323.method2215(class298.field4849, arg2, arg1);
            return;
        }
        class154 var9 = null;
        class154 var10 = null;
        var3.method1578(0, var5);
        for (class37 var11 = (class37) var3.method1580((byte) -39); var11 != null; var11 = (class37) var3.method1579((byte) 28)) {
            class154 var12 = var11.field605;
            if (var5.field605.field2505 != var12.field2505) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field2505 != var12.field2505 && var10 == null) {
                    var10 = var12;
                }
            }
        }
        long var13 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class5.method29(class298.field4849, arg2, arg1, class259.method1801(arg1 * 128 + 64, -20428, class298.field4849, arg0 * arg2 + 64), var5.field605, var13, var9, var10);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lpk;ZI)V", line = 601)
    public static final void method544(class48 arg0, boolean arg1, int arg2) {
        int var3 = arg0.field700;
        int var4 = (int) arg0.field1325;
        field1104++;
        arg0.method598(107);
        if (arg1) {
            class76.method576(var3, 0);
        }
        class165.method1211(358076592, var3);
        class301 var5 = class206.method1440(var4, (byte) -68);
        if (var5 != null) {
            class296.method2006(var5, arg2 + 116);
        }
        int var6 = class314.field5337;
        int var7 = 0;
        if (arg2 != 10) {
            return;
        }
        while (var7 < var6) {
            if (class66.method501(class53.field748[var7], -105)) {
                class157.method1126((byte) 3, var7);
            }
            var7++;
        }
        if (class314.field5337 == 1) {
            class186.field3027 = false;
            class329.method2253(class108.field1845, false, class156.field2537, class36.field595, class304.field5078);
        } else {
            class329.method2253(class108.field1845, false, class156.field2537, class36.field595, class304.field5078);
            int var8 = class213.field3517.method258(class134.field2183);
            for (int var9 = 0; var9 < class314.field5337; var9++) {
                int var10 = class213.field3517.method258(class263.method1834(var9, (byte) -119));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class108.field1845 = var8 + 8;
            class156.field2537 = class314.field5337 * 15 + 22;
        }
        if (class198.field3292 != -1) {
            class253.method1772(1, arg2 - 10, class198.field3292);
        }
    }
}
