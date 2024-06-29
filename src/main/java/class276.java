import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class276 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field3763;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[Lwn;")
    public static class77[] field3767;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
    public abstract boolean method1474(int arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method1740(int arg0) {
        class233.field3265 = -1;
        field3765++;
        class93.field1300 = -1;
        class63.field852 = 0;
        if (arg0 != -12252) {
            field3763 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method1741(int arg0) {
        field3763 = null;
        field3767 = null;
        if (arg0 != 0) {
            field3763 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3764++;
        class231.method1508((byte) 44, arg6);
        int var7 = 0;
        if (arg4 != -1743385695) {
            return;
        }
        int var8 = arg6 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg0 >= class143.field2090 && arg0 <= class42.field543) {
            int[] var14 = class83.field1157[arg0];
            int var15 = class294.method1789(arg3 - arg6, (byte) -5, class430.field6003, class80.field1119);
            int var16 = class294.method1789(arg3 + arg6, (byte) -5, class430.field6003, class80.field1119);
            int var17 = class294.method1789(arg3 - var8, (byte) -5, class430.field6003, class80.field1119);
            int var18 = class294.method1789(arg3 + var8, (byte) -5, class430.field6003, class80.field1119);
            class149.method1112(arg1, var17, 8, var15, var14);
            class149.method1112(arg5, var18, 8, var17, var14);
            class149.method1112(arg1, var16, 8, var18, var14);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class1.field1[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class143.field2090 && class42.field543 >= var20) {
                    if (var8 > var9) {
                        int var22 = class1.field1[var9];
                        int var23 = class294.method1789(arg3 + var7, (byte) -5, class430.field6003, class80.field1119);
                        int var24 = class294.method1789(arg3 - var7, (byte) -5, class430.field6003, class80.field1119);
                        int var25 = class294.method1789(arg3 + var22, (byte) -5, class430.field6003, class80.field1119);
                        int var26 = class294.method1789(arg3 - var22, (byte) -5, class430.field6003, class80.field1119);
                        if (class42.field543 >= var21) {
                            int[] var27 = class83.field1157[var21];
                            class149.method1112(arg1, var26, 8, var24, var27);
                            class149.method1112(arg5, var25, 8, var26, var27);
                            class149.method1112(arg1, var23, 8, var25, var27);
                        }
                        if (var20 >= class143.field2090) {
                            int[] var28 = class83.field1157[var20];
                            class149.method1112(arg1, var26, 8, var24, var28);
                            class149.method1112(arg5, var25, 8, var26, var28);
                            class149.method1112(arg1, var23, arg4 ^ 0x98160BA9, var25, var28);
                        }
                    } else {
                        int var29 = class294.method1789(arg3 + var7, (byte) -5, class430.field6003, class80.field1119);
                        int var30 = class294.method1789(arg3 - var7, (byte) -5, class430.field6003, class80.field1119);
                        if (var21 <= class42.field543) {
                            class149.method1112(arg1, var29, 8, var30, class83.field1157[var21]);
                        }
                        if (var20 >= class143.field2090) {
                            class149.method1112(arg1, var29, 8, var30, class83.field1157[var20]);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class143.field2090 <= var32 && class42.field543 >= var31) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (var33 >= class80.field1119 && class430.field6003 >= var34) {
                    int var35 = class294.method1789(var33, (byte) -5, class430.field6003, class80.field1119);
                    int var36 = class294.method1789(var34, (byte) -5, class430.field6003, class80.field1119);
                    if (var7 < var8) {
                        int var37 = var11 < var7 ? class1.field1[var7] : var11;
                        int var38 = class294.method1789(arg3 + var37, (byte) -5, class430.field6003, class80.field1119);
                        int var39 = class294.method1789(arg3 - var37, (byte) -5, class430.field6003, class80.field1119);
                        if (class42.field543 >= var32) {
                            int[] var40 = class83.field1157[var32];
                            class149.method1112(arg1, var39, 8, var36, var40);
                            class149.method1112(arg5, var38, arg4 + 1743385703, var39, var40);
                            class149.method1112(arg1, var35, 8, var38, var40);
                        }
                        if (var31 >= class143.field2090) {
                            int[] var41 = class83.field1157[var31];
                            class149.method1112(arg1, var39, 8, var36, var41);
                            class149.method1112(arg5, var38, 8, var39, var41);
                            class149.method1112(arg1, var35, 8, var38, var41);
                        }
                    } else {
                        if (class42.field543 >= var32) {
                            class149.method1112(arg1, var35, 8, var36, class83.field1157[var32]);
                        }
                        if (var31 >= class143.field2090) {
                            class149.method1112(arg1, var35, 8, var36, class83.field1157[var31]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public abstract void method1479(byte arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILea;)V")
    public static final void method1743(int arg0, class58 arg1) {
        if (arg0 >= -33) {
            return;
        }
        field3766++;
        int var2 = class75.field1073;
        int var3 = class49.field631;
        int var4 = class4.field32;
        int var5 = class124.field1873;
        int var6 = -10660793;
        arg1.method461(var4, var6, var5, -91, var2, var3);
        arg1.method461(var4 - 2, -16777216, 16, -91, var2 + 1, var3 + 1);
        arg1.method460((byte) 48, var2 + 1, -16777216, var4 - 2, var5 + -19, var3 + 18);
        class269.field3685.method486(var2 + 3, var6, (byte) 44, var3 + 14, -1, class436.field6154.method2313((byte) -124, class445.field6241));
        int var7 = class116.field1759.method34(true);
        int var8 = class116.field1759.method30((byte) 115);
        int var9 = 0;
        for (class429 var10 = (class429) class451.field6491.method1173(0); var10 != null; var10 = (class429) class451.field6491.method1165(true)) {
            int var11 = var3 + ((-1 - var9 + class149.field2171) * 16) + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var11 - 13 < var8 && var11 + 3 > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class101.method772(var10.field5977, 9)) {
                var13 = class367.method2308(false, (int) var10.field5969).field186;
            } else if (class323.method1966((byte) 63, var10.field5977)) {
                class419 var14 = class428.field5951[(int) var10.field5969];
                if (var14 != null) {
                    var13 = var14.field5807.field3291;
                }
            } else if (class13.method69(var10.field5977, 99)) {
                if (var10.field5977 == 1011) {
                    var13 = class133.method996((byte) -19, (int) var10.field5969).field6303;
                } else {
                    var13 = class133.method996((byte) -19, (int) (var10.field5969 >>> 32 & 0x7FFFFFFFL)).field6303;
                }
            }
            String var15 = class361.method2225(var10, -74);
            if (var13 != null) {
                var15 = var15 + class303.method1837(var13, -3560);
            }
            class269.field3685.method485(class160.field2277, var15, (byte) 81, 0, class406.field5627, var12, var11, var2 + 3);
            var9++;
        }
        class218.method1452(class4.field32, class124.field1873, class75.field1073, 0, class49.field631);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public abstract void method1476(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILh;)V")
    public static final void method1744(int arg0, class429 arg1) {
        field3761++;
        if (arg1 == null || class451.field6491.field2296 == arg1) {
            return;
        }
        int var2 = arg1.field5975;
        int var3 = arg1.field5974;
        int var4 = arg1.field5977;
        int var5 = (int) arg1.field5969;
        if (arg0 != 0) {
            method1743(83, (class58) null);
        }
        long var6 = arg1.field5969;
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var8;
        int var9;
        if (class446.field6255 == null) {
            var9 = class219.field3081;
            var8 = class332.field4480;
        } else {
            var8 = class446.field6255.method121((byte) 94);
            var9 = class446.field6255.method126(false);
        }
        if (var4 == 19) {
            class423 var10 = class87.field1227[var5];
            if (var10 != null) {
                class220.field3085 = 0;
                class50.field641 = 2;
                class128.field1945++;
                class271.field3702 = var9;
                class309.field4197 = var8;
                class88.field1232.method1151(64, (byte) -53);
                class88.field1232.method2267(var5, (byte) -103);
                class88.field1232.method2260(class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0, (byte) 77);
                class398.method2469(var10.field2659[0], true, var10.method1285(-70), 0, var10.method1285(-99), var10.field2662[0], -2, 0, class359.field4970.field2659[0], arg0 - 109, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 10) {
            class419 var11 = class428.field5951[var5];
            if (var11 != null) {
                class271.field3702 = var9;
                class50.field641 = 2;
                class60.field803++;
                class309.field4197 = var8;
                class220.field3085 = 0;
                class88.field1232.method1151(75, (byte) 87);
                class88.field1232.method2286(var5, -65);
                class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, 1537846408);
                class398.method2469(var11.field2659[0], true, var11.method1285(-75), 0, var11.method1285(-119), var11.field2662[0], -2, 0, class359.field4970.field2659[0], 108, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 45) {
            class50.field641 = 2;
            class51.field645++;
            class271.field3702 = var9;
            class220.field3085 = 0;
            class309.field4197 = var8;
            class88.field1232.method1151(198, (byte) 96);
            class88.field1232.method2267(var5, (byte) -103);
            class88.field1232.method2279((byte) -61, class371.field5148 + var3);
            class88.field1232.method2267(class6.field65 + var2, (byte) -103);
            class88.field1232.method2260(class146.field2122.method1474(-20986, 82) ? 1 : 0, (byte) 73);
            class101.method773(var3, var2, 0);
        }
        if (var4 == 1008) {
            class309.field4197 = var8;
            class50.field641 = 2;
            class450.field6456++;
            class271.field3702 = var9;
            class220.field3085 = 0;
            class88.field1232.method1151(188, (byte) 113);
            class88.field1232.method2267(var5, (byte) -103);
        }
        if (var4 == 9) {
            class227.field3143++;
            class271.field3702 = var9;
            class220.field3085 = 0;
            class50.field641 = 2;
            class309.field4197 = var8;
            class88.field1232.method1151(4, (byte) 103);
            class88.field1232.method2275(-65, class34.field467);
            class88.field1232.method2273(1481174032, class217.field3045);
            class88.field1232.method2262(class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0, -118);
            class88.field1232.method2286(class371.field5148 + var3, -65);
            class88.field1232.method2279((byte) -100, var5);
            class88.field1232.method2279((byte) 80, class6.field65 + var2);
            class101.method773(var3, var2, 0);
        }
        if (var4 == 1011) {
            class50.field641 = 2;
            class271.field3702 = var9;
            class428.field5959++;
            class220.field3085 = 0;
            class309.field4197 = var8;
            class88.field1232.method1151(222, (byte) 91);
            class88.field1232.method2286(var5, -65);
        }
        if (var4 == 48) {
            class423 var12 = class87.field1227[var5];
            if (var12 != null) {
                class271.field3702 = var9;
                class309.field4197 = var8;
                class187.field2708++;
                class50.field641 = 2;
                class220.field3085 = 0;
                class88.field1232.method1151(221, (byte) -91);
                class88.field1232.method2267(var5, (byte) -103);
                class88.field1232.method2262(class146.field2122.method1474(-20986, 82) ? 1 : 0, -97);
                class398.method2469(var12.field2659[0], true, var12.method1285(-79), 0, var12.method1285(-96), var12.field2662[0], -2, 0, class359.field4970.field2659[0], 125, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 23 && class50.field640 == null) {
            class264.method1692(var3, var2, (byte) 91);
            class50.field640 = class451.method2815(var3, var2, (byte) -53);
            class298.method1821((byte) -84, class50.field640);
        }
        if (var4 == 12) {
            class313.field4251++;
            class50.field641 = 2;
            class271.field3702 = var9;
            class309.field4197 = var8;
            class220.field3085 = 0;
            class88.field1232.method1151(71, (byte) 121);
            class88.field1232.method2286(class6.field65 + var2, -65);
            class88.field1232.method2262(class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0, -121);
            class88.field1232.method2286(class371.field5148 + var3, arg0 ^ 0xFFFFFFBF);
            class88.field1232.method2279((byte) 125, var5);
            class101.method773(var3, var2, arg0);
        }
        if (var4 == 6) {
            class108 var13 = class451.method2815(var3, var2, (byte) -53);
            if (var13 != null) {
                class107.method808((byte) 60, var13);
            }
        }
        if (var4 == 20) {
            class423 var14 = class87.field1227[var5];
            if (var14 != null) {
                class50.field641 = 2;
                class220.field3085 = 0;
                class309.field4197 = var8;
                class271.field3702 = var9;
                field3762++;
                class88.field1232.method1151(37, (byte) 109);
                class88.field1232.method2275(arg0 + 125, var5);
                class88.field1232.method2262(class146.field2122.method1474(-20986, 82) ? 1 : 0, -111);
                class398.method2469(var14.field2659[0], true, var14.method1285(arg0 ^ 0xFFFFFFA0), 0, var14.method1285(-119), var14.field2662[0], -2, 0, class359.field4970.field2659[0], 113, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 1012 || var4 == 1007 || var4 == 1010 || var4 == 1003 || var4 == 1002) {
            class188.method1307(var5, (byte) -109, var4, var2);
        }
        if (var4 == 57) {
            class423 var15 = class87.field1227[var5];
            if (var15 != null) {
                class50.field641 = 2;
                class271.field3702 = var9;
                class220.field3085 = 0;
                class65.field889++;
                class309.field4197 = var8;
                class88.field1232.method1151(208, (byte) -54);
                class88.field1232.method2262(class146.field2122.method1474(-20986, 82) ? 1 : 0, -112);
                class88.field1232.method2279((byte) -82, var5);
                class398.method2469(var15.field2659[0], true, var15.method1285(-86), 0, var15.method1285(-128), var15.field2662[0], -2, 0, class359.field4970.field2659[0], -23, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 4) {
            class419 var16 = class428.field5951[var5];
            if (var16 != null) {
                class50.field641 = 2;
                class220.field3085 = 0;
                class309.field4197 = var8;
                class271.field3702 = var9;
                class231.field3252++;
                class88.field1232.method1151(161, (byte) 104);
                class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, arg0 + 1537846408);
                class88.field1232.method2267(var5, (byte) -103);
                class398.method2469(var16.field2659[0], true, var16.method1285(-126), 0, var16.method1285(arg0 ^ 0xFFFFFF89), var16.field2662[0], -2, 0, class359.field4970.field2659[0], 91, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 1001) {
            class50.field641 = 2;
            class220.field3085 = 0;
            class271.field3702 = var9;
            class111.field1708++;
            class309.field4197 = var8;
            class88.field1232.method1151(197, (byte) -97);
            class88.field1232.method2250(false, class146.field2122.method1474(arg0 - 20986, 82) ? 1 : 0);
            class88.field1232.method2275(124, class6.field65 + var2);
            class88.field1232.method2279((byte) 103, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class88.field1232.method2275(-120, class371.field5148 + var3);
            class182.method1269((byte) -74, var2, var3, var6);
        }
        if (var4 == 15) {
            class423 var17 = class87.field1227[var5];
            if (var17 != null) {
                class220.field3085 = 0;
                class159.field2261++;
                class50.field641 = 2;
                class309.field4197 = var8;
                class271.field3702 = var9;
                class88.field1232.method1151(167, (byte) -71);
                class88.field1232.method2286(var5, -65);
                class88.field1232.method2250(false, class146.field2122.method1474(-20986, 82) ? 1 : 0);
                class398.method2469(var17.field2659[0], true, var17.method1285(arg0 - 85), 0, var17.method1285(-94), var17.field2662[0], -2, 0, class359.field4970.field2659[0], 108, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 60) {
            class309.field4197 = var8;
            class220.field3085 = 0;
            class267.field3664++;
            class50.field641 = 2;
            class271.field3702 = var9;
            class88.field1232.method1151(58, (byte) -82);
            class88.field1232.method2286(class371.field5148 + var3, -65);
            class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, arg0 + 1537846408);
            class88.field1232.method2279((byte) 82, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class88.field1232.method2267(var2 + class6.field65, (byte) -103);
            class182.method1269((byte) -66, var2, var3, var6);
        }
        if (var4 == 47) {
            class419 var18 = class428.field5951[var5];
            if (var18 != null) {
                class220.field3085 = 0;
                class271.field3702 = var9;
                class50.field641 = 2;
                class106.field1488++;
                class309.field4197 = var8;
                class88.field1232.method1151(158, (byte) -89);
                class88.field1232.method2279((byte) -60, var5);
                class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, 1537846408);
                class398.method2469(var18.field2659[0], true, var18.method1285(-66), 0, var18.method1285(-77), var18.field2662[0], -2, 0, class359.field4970.field2659[0], arg0 ^ 0xFFFFFFE7, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 25) {
            class423 var19 = class87.field1227[var5];
            if (var19 != null) {
                class218.field3057++;
                class220.field3085 = 0;
                class271.field3702 = var9;
                class309.field4197 = var8;
                class50.field641 = 2;
                class88.field1232.method1151(185, (byte) -29);
                class88.field1232.method2279((byte) 78, var5);
                class88.field1232.method2262(class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0, -97);
                class398.method2469(var19.field2659[0], true, var19.method1285(-67), 0, var19.method1285(-104), var19.field2662[0], -2, 0, class359.field4970.field2659[0], 115, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 30) {
            class403.field5573++;
            class271.field3702 = var9;
            class50.field641 = 1;
            class309.field4197 = var8;
            class220.field3085 = 0;
            class88.field1232.method1151(11, (byte) 92);
            class88.field1232.method2299((byte) -124, class217.field3045);
            class88.field1232.method2286(class371.field5148 + var3, -65);
            class88.field1232.method2275(125, class34.field467);
            class88.field1232.method2286(class6.field65 + var2, -65);
            class398.method2469(var3, true, 1, 0, 1, var2, -4, 0, class359.field4970.field2659[0], 103, class359.field4970.field2662[0]);
        }
        if (var4 == 1006) {
            class271.field3702 = var9;
            class50.field641 = 2;
            class309.field4197 = var8;
            class220.field3085 = 0;
            class419 var20 = class428.field5951[var5];
            if (var20 != null) {
                class233 var21 = var20.field5807;
                if (var21.field3327 != null) {
                    var21 = var21.method1524((byte) 110);
                }
                if (var21 != null) {
                    class88.field1232.method1151(231, (byte) 88);
                    class446.field6247++;
                    class88.field1232.method2267(var21.field3272, (byte) -103);
                }
            }
        }
        if (var4 == 3) {
            class220.field3085 = 0;
            class309.field4197 = var8;
            class403.field5564++;
            class271.field3702 = var9;
            class50.field641 = 2;
            class88.field1232.method1151(141, (byte) -75);
            class88.field1232.method2286((int) (var6 >>> 32) & Integer.MAX_VALUE, -65);
            class88.field1232.method2250(false, class146.field2122.method1474(-20986, 82) ? 1 : 0);
            class88.field1232.method2267(class6.field65 + var2, (byte) -103);
            class88.field1232.method2279((byte) 79, class371.field5148 + var3);
            class182.method1269((byte) -99, var2, var3, var6);
        }
        if (var4 == 58) {
            class271.field3702 = var9;
            class220.field3085 = 0;
            class309.field4197 = var8;
            class50.field641 = 2;
            class337.field4553++;
            class88.field1232.method1151(168, (byte) 100);
            class88.field1232.method2260(class146.field2122.method1474(arg0 - 20986, 82) ? 1 : 0, (byte) 63);
            class88.field1232.method2286(Integer.MAX_VALUE & (int) (var6 >>> 32), -65);
            class88.field1232.method2279((byte) 112, class6.field65 + var2);
            class88.field1232.method2286(var3 + class371.field5148, -65);
            class182.method1269((byte) -33, var2, var3, var6);
        }
        if (var4 == 51) {
            class220.field3085 = 0;
            class271.field3702 = var9;
            class284.field3869++;
            class309.field4197 = var8;
            class50.field641 = 2;
            class88.field1232.method1151(48, (byte) -89);
            class88.field1232.method2279((byte) 107, var5);
            class88.field1232.method2275(123, class6.field65 + var2);
            class88.field1232.method2260(class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0, (byte) 9);
            class88.field1232.method2279((byte) -100, var3 + class371.field5148);
            class101.method773(var3, var2, arg0);
        }
        if (var4 == 18) {
            class419 var22 = class428.field5951[var5];
            if (var22 != null) {
                class220.field3085 = 0;
                class50.field641 = 2;
                class127.field1886++;
                class309.field4197 = var8;
                class271.field3702 = var9;
                class88.field1232.method1151(61, (byte) 100);
                class88.field1232.method2279((byte) -94, var5);
                class88.field1232.method2262(class146.field2122.method1474(-20986, 82) ? 1 : 0, -125);
                class398.method2469(var22.field2659[0], true, var22.method1285(-100), 0, var22.method1285(arg0 ^ 0xFFFFFF93), var22.field2662[0], -2, 0, class359.field4970.field2659[0], 107, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 17) {
            class423 var23 = class87.field1227[var5];
            if (var23 != null) {
                class309.field4197 = var8;
                class271.field3702 = var9;
                class220.field3085 = 0;
                class50.field641 = 2;
                class85.field1189++;
                class88.field1232.method1151(179, (byte) 115);
                class88.field1232.method2286(var5, -65);
                class88.field1232.method2279((byte) 95, class34.field467);
                class88.field1232.method2260(class146.field2122.method1474(-20986, 82) ? 1 : 0, (byte) 118);
                class88.field1232.method2261(class217.field3045, arg0 ^ 0xFFFFFF50);
                class398.method2469(var23.field2659[0], true, var23.method1285(-104), 0, var23.method1285(-125), var23.field2662[0], -2, 0, class359.field4970.field2659[0], arg0 ^ 0xFFFFFF85, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 5) {
            class108 var24 = class451.method2815(var3, var2, (byte) -53);
            if (var24 != null) {
                class429.method2645(4);
                class310 var25 = client.method1634(var24);
                class211.method1420(var3, var25.field4204, var2, (byte) 58, var24.field1669, var24.field1675, var25.method1875(arg0 + 2644133));
                class302.field4121 = class166.method1184(var24, (byte) -71);
                if (class302.field4121 == null) {
                    class302.field4121 = "Null";
                }
                class119.field1816 = var24.field1658 + "<col=ffffff>";
            }
            return;
        }
        if (var4 == 50) {
            if (class157.field2234 > 0 && class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) && class146.field2122.method1474(-20986, 81)) {
                class246.method1601(class343.field4623, 63, class6.field65 + var2, class371.field5148 - -var3);
            } else {
                class220.field3085 = 0;
                class105.field1456++;
                class50.field641 = 1;
                class309.field4197 = var8;
                class271.field3702 = var9;
                class88.field1232.method1151(132, (byte) 97);
                class88.field1232.method2279((byte) 115, class6.field65 + var2);
                class88.field1232.method2267(class371.field5148 + var3, (byte) -103);
            }
        }
        if (var4 == 13) {
            if (class157.field2234 > 0 && class146.field2122.method1474(-20986, 82) && class146.field2122.method1474(-20986, 81)) {
                class246.method1601(class343.field4623, arg0 + 63, class6.field65 - -var2, class371.field5148 + var3);
            } else {
                class105.method805(var3, true, var5, var2);
                if (var5 == 1) {
                    class88.field1232.method2280(-1, 1537846408);
                    class88.field1232.method2280(-1, 1537846408);
                    class88.field1232.method2275(arg0 - 37, (int) class332.field4483);
                    class88.field1232.method2280(57, 1537846408);
                    class88.field1232.method2280(class19.field249, 1537846408);
                    class88.field1232.method2280(class129.field1950, 1537846408);
                    class88.field1232.method2280(89, arg0 ^ 0x5BA9AC88);
                    class88.field1232.method2275(21, class359.field4970.field40);
                    class88.field1232.method2275(3, class359.field4970.field44);
                    class88.field1232.method2280(63, 1537846408);
                } else {
                    class271.field3702 = var9;
                    class309.field4197 = var8;
                    class50.field641 = 1;
                    class220.field3085 = 0;
                }
                class398.method2469(var3, true, 1, 0, 1, var2, -4, 0, class359.field4970.field2659[0], -46, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 11) {
            class271.field3702 = var9;
            class50.field641 = 2;
            class18.field235++;
            class309.field4197 = var8;
            class220.field3085 = 0;
            class88.field1232.method1151(63, (byte) 98);
            class88.field1232.method2267(var5, (byte) -103);
            class88.field1232.method2267(class6.field65 + var2, (byte) -103);
            class88.field1232.method2250(false, class146.field2122.method1474(arg0 - 20986, 82) ? 1 : 0);
            class88.field1232.method2267(class371.field5148 + var3, (byte) -103);
            class101.method773(var3, var2, arg0);
        }
        if (var4 == 2 || var4 == 1009) {
            class233.method1519(var2, var5, var3, arg0 ^ 0x1, arg1.field5972);
        }
        if (var4 == 49) {
            class419 var26 = class428.field5951[var5];
            if (var26 != null) {
                class220.field3085 = 0;
                class373.field5164++;
                class309.field4197 = var8;
                class271.field3702 = var9;
                class50.field641 = 2;
                class88.field1232.method1151(95, (byte) 83);
                class88.field1232.method2280(class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0, 1537846408);
                class88.field1232.method2279((byte) -115, var5);
                class398.method2469(var26.field2659[0], true, var26.method1285(arg0 - 78), 0, var26.method1285(-105), var26.field2662[0], -2, 0, class359.field4970.field2659[0], -50, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 59) {
            class271.field3702 = var9;
            class281.field3822++;
            class309.field4197 = var8;
            class50.field641 = 2;
            class220.field3085 = 0;
            class88.field1232.method1151(232, (byte) -41);
            class88.field1232.method2267(class34.field467, (byte) -103);
            class88.field1232.method2275(-118, class371.field5148 + var3);
            class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, 1537846408);
            class88.field1232.method2273(1481174032, class217.field3045);
            class88.field1232.method2279((byte) -95, class6.field65 + var2);
            class88.field1232.method2286(Integer.MAX_VALUE & (int) (var6 >>> 32), -65);
            class182.method1269((byte) -54, var2, var3, var6);
        }
        if (var4 == 21) {
            class50.field641 = 2;
            class220.field3085 = 0;
            class85.field1186++;
            class271.field3702 = var9;
            class309.field4197 = var8;
            class88.field1232.method1151(47, (byte) 120);
            class88.field1232.method2275(arg0 + 122, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class88.field1232.method2275(arg0 ^ 0x11, class6.field65 + var2);
            class88.field1232.method2250(false, class146.field2122.method1474(arg0 ^ 0xFFFFAE06, 82) ? 1 : 0);
            class88.field1232.method2267(class371.field5148 + var3, (byte) -103);
            class182.method1269((byte) -30, var2, var3, var6);
        }
        if (var4 == 22) {
            class271.field3702 = var9;
            class50.field641 = 2;
            class309.field4197 = var8;
            class220.field3085 = 0;
            class93.field1297++;
            class88.field1232.method1151(228, (byte) -104);
            class88.field1232.method2267(class371.field5148 + var3, (byte) -103);
            class88.field1232.method2262(class146.field2122.method1474(-20986, 82) ? 1 : 0, -98);
            class88.field1232.method2267(class6.field65 + var2, (byte) -103);
            class88.field1232.method2275(-115, var5);
            class101.method773(var3, var2, 0);
        }
        if (var4 == 8) {
            class423 var27 = class87.field1227[var5];
            if (var27 != null) {
                class50.field641 = 2;
                class271.field3702 = var9;
                class65.field887++;
                class220.field3085 = 0;
                class309.field4197 = var8;
                class88.field1232.method1151(108, (byte) 100);
                class88.field1232.method2262(class146.field2122.method1474(-20986, 82) ? 1 : 0, -84);
                class88.field1232.method2275(arg0 - 92, var5);
                class398.method2469(var27.field2659[0], true, var27.method1285(-111), 0, var27.method1285(arg0 - 121), var27.field2662[0], -2, 0, class359.field4970.field2659[0], 118, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 46) {
            class423 var28 = class87.field1227[var5];
            if (var28 != null) {
                class220.field3085 = 0;
                class418.field5788++;
                class271.field3702 = var9;
                class309.field4197 = var8;
                class50.field641 = 2;
                class88.field1232.method1151(233, (byte) 108);
                class88.field1232.method2280(class146.field2122.method1474(-20986, 82) ? 1 : 0, 1537846408);
                class88.field1232.method2286(var5, -65);
                class398.method2469(var28.field2659[0], true, var28.method1285(-77), 0, var28.method1285(-118), var28.field2662[0], -2, 0, class359.field4970.field2659[0], arg0 - 103, class359.field4970.field2662[0]);
            }
        }
        if (var4 == 44) {
            class419 var29 = class428.field5951[var5];
            if (var29 != null) {
                class50.field641 = 2;
                class309.field4197 = var8;
                class271.field3702 = var9;
                class220.field3085 = 0;
                field3759++;
                class88.field1232.method1151(73, (byte) -67);
                class88.field1232.method2275(120, var5);
                class88.field1232.method2273(arg0 + 1481174032, class217.field3045);
                class88.field1232.method2260(class146.field2122.method1474(-20986, 82) ? 1 : 0, (byte) 116);
                class88.field1232.method2267(class34.field467, (byte) -103);
                class398.method2469(var29.field2659[0], true, var29.method1285(-91), 0, var29.method1285(arg0 - 77), var29.field2662[0], -2, 0, class359.field4970.field2659[0], -37, class359.field4970.field2662[0]);
            }
        }
        if (class213.field2980) {
            class429.method2645(4);
        }
        if (class186.field2686 != null && class26.field340 == 0) {
            class298.method1821((byte) -125, class186.field2686);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Lmb;")
    public abstract class260 method1478(byte arg0);
}
