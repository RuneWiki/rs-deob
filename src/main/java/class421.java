import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class421 {

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Ls;")
    public static class186 field6341 = new class186(11, 8);

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "Lmo;")
    public static class531 field6344 = new class531(12, 15);

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lnn;I)Lej;")
    public static final class80 method2570(class289 arg0, int arg1) {
        arg0.method1858(-3256);
        field6345++;
        if (arg1 < 118) {
            method2572(3);
        }
        int var2 = arg0.method1858(-3256);
        class80 var3 = class528.method3126(var2, 1604);
        var3.field1590 = arg0.method1858(-3256);
        int var4 = arg0.method1858(-3256);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1858(-3256);
            var3.method26(var6, 105, arg0);
        }
        var3.method23(true);
        return var3;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLza;)V")
    public abstract void method9(byte arg0, class288 arg1);

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lza;I)Lnd;")
    public abstract class385 method15(class288 arg0, int arg1);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBILvs;Lza;ZI)V")
    public abstract void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lwi;IIB)V")
    public static final void method2571(class328 arg0, int arg1, int arg2, byte arg3) {
        field6342++;
        if (arg0 == null || class373.field5469.field4458 == arg0) {
            return;
        }
        int var4 = arg0.field4976;
        int var5 = arg0.field4979;
        int var6 = arg0.field4972;
        int var7 = (int) arg0.field4981;
        long var8 = arg0.field4981;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 30) {
            class388 var10 = class447.method2677(var4, 0, var5);
            if (var10 != null) {
                class320.method2056(arg3 - 150);
                class99 var11 = client.method1371(var10);
                class144.method1072(var11.field1918, var11.method881(20740), var10, false);
                class101.field1932 = class67.method587(var10, 116);
                class373.field5465 = var10.field5729 + "<col=ffffff>";
                if (class101.field1932 == null) {
                    class101.field1932 = "Null";
                }
            }
            return;
        }
        if (var6 == 57) {
            class508.field7400++;
            class68.field1381 = arg1;
            class61.field1262 = 2;
            class108.field1991 = 0;
            class491.field7198 = arg2;
            class459.method2765(class509.field7426, (byte) 87);
            class335.field5062.method1875((byte) 24, class496.field7292 + var4);
            class335.field5062.method1875((byte) -95, var7);
            class335.field5062.method1875((byte) 0, class212.field3378 + var5);
            class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
            class68.method596(var4, -30623, var5);
        }
        if (var6 == 10) {
            class108.field1991 = 0;
            class68.field1381 = arg1;
            class491.field7198 = arg2;
            class61.field1262 = 2;
            class173.field2788++;
            class459.method2765(class257.field3939, (byte) 87);
            class335.field5062.method1853(var7, 62);
            class335.field5062.method1861(false, var4 + class496.field7292);
            class335.field5062.method1874(class179.field2912.method1458(100, 82) ? 1 : 0, 128);
            class335.field5062.method1853(class212.field3378 + var5, 10);
            class68.method596(var4, -30623, var5);
        }
        if (var6 == 60) {
            class61.field1262 = 2;
            class68.field1381 = arg1;
            class75.field1531++;
            class108.field1991 = 0;
            class491.field7198 = arg2;
            class459.method2765(class486.field7166, (byte) 87);
            class335.field5062.method1861(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class335.field5062.method1830((byte) -113, class179.field2912.method1458(100, 82) ? 1 : 0);
            class335.field5062.method1875((byte) -88, class212.field3378 + var5);
            class335.field5062.method1861(false, class496.field7292 + var4);
            class248.method1607(var8, true, var4, var5);
        }
        if (var6 == 8) {
            class366 var12 = class73.field1444[var7];
            if (var12 != null) {
                class491.field7198 = arg2;
                class68.field1381 = arg1;
                class61.field1262 = 2;
                class293.field4480++;
                class108.field1991 = 0;
                class459.method2765(class229.field3557, (byte) 87);
                class335.field5062.method1874(class179.field2912.method1458(arg3 + 31, 82) ? 1 : 0, 128);
                class335.field5062.method1865(var7, 812856296);
                class377.method2317(-1, 0, var12.field7870[0], true, var12.method2241(-61), var12.field7866[0], -2, var12.method2241(arg3 - 116), 0);
            }
        }
        if (var6 == 15) {
            class491.field7198 = arg2;
            class61.field1262 = 2;
            class190.field3048++;
            class68.field1381 = arg1;
            class108.field1991 = 0;
            class459.method2765(class429.field6414, (byte) 87);
            class335.field5062.method1865(var7, arg3 ^ 0x307333AD);
            class335.field5062.method1853(class212.field3378 + var5, 106);
            class335.field5062.method1875((byte) 46, var4 + class496.field7292);
            class335.field5062.method1874(class179.field2912.method1458(arg3 ^ 0x21, 82) ? 1 : 0, 128);
            class68.method596(var4, arg3 - 30692, var5);
        }
        if (var6 == 13) {
            class500.field7337++;
            class61.field1262 = 2;
            class108.field1991 = 0;
            class68.field1381 = arg1;
            class491.field7198 = arg2;
            class459.method2765(class438.field6509, (byte) 87);
            class335.field5062.method1853((int) (var8 >>> 32) & Integer.MAX_VALUE, 35);
            class335.field5062.method1865(class212.field3378 + var5, 812856296);
            class335.field5062.method1861(false, class496.field7292 + var4);
            class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
            class248.method1607(var8, true, var4, var5);
        }
        if (arg3 != 69) {
            return;
        }
        if (var6 == 6) {
            class435 var13 = (class435) class209.field3337.method1622((long) var7, arg3 ^ 0x25);
            if (var13 != null) {
                class108.field1991 = 0;
                class491.field7198 = arg2;
                class163 var14 = var13.field6471;
                class68.field1381 = arg1;
                class453.field6728++;
                class61.field1262 = 2;
                class459.method2765(class320.field4900, (byte) 87);
                class335.field5062.method1853(var7, 44);
                class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
                class377.method2317(-1, 0, var14.field7870[0], true, var14.method2241(arg3 ^ 0xFFFFFF85), var14.field7866[0], -2, var14.method2241(-87), 0);
            }
        }
        if (var6 == 18) {
            class61.field1262 = 2;
            class473.field7002++;
            class491.field7198 = arg2;
            class68.field1381 = arg1;
            class108.field1991 = 0;
            class459.method2765(class140.field2331, (byte) 87);
            class335.field5062.method1862((byte) -115, class506.field7383);
            class335.field5062.method1830((byte) -33, class179.field2912.method1458(arg3 ^ 0x21, 82) ? 1 : 0);
            class335.field5062.method1861(false, class160.field2579);
            class335.field5062.method1853(class15.field266.field7789, 75);
            class335.field5062.method1853(class341.field5130, arg3 ^ 0x35);
        }
        if (var6 == 21) {
            class366 var15 = class73.field1444[var7];
            if (var15 != null) {
                class61.field1262 = 2;
                class134.field2245++;
                class108.field1991 = 0;
                class491.field7198 = arg2;
                class68.field1381 = arg1;
                class459.method2765(class246.field3794, (byte) 87);
                class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
                class335.field5062.method1853(var7, 14);
                class377.method2317(arg3 ^ 0xFFFFFFBA, 0, var15.field7870[0], true, var15.method2241(-32), var15.field7866[0], -2, var15.method2241(arg3 ^ -112), 0);
            }
        }
        if (var6 == 51) {
            class435 var16 = (class435) class209.field3337.method1622((long) var7, -106);
            if (var16 != null) {
                class460.field6849++;
                class491.field7198 = arg2;
                class61.field1262 = 2;
                class68.field1381 = arg1;
                class163 var17 = var16.field6471;
                class108.field1991 = 0;
                class459.method2765(class403.field6088, (byte) 87);
                class335.field5062.method1861(false, var7);
                class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
                class377.method2317(-1, 0, var17.field7870[0], true, var17.method2241(-86), var17.field7866[0], -2, var17.method2241(-128), 0);
            }
        }
        if (var6 == 20) {
            class435 var18 = (class435) class209.field3337.method1622((long) var7, 92);
            if (var18 != null) {
                class163 var19 = var18.field6471;
                class68.field1381 = arg1;
                class491.field7198 = arg2;
                class141.field2339++;
                class108.field1991 = 0;
                class61.field1262 = 2;
                class459.method2765(class428.field6398, (byte) 87);
                class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
                class335.field5062.method1875((byte) -102, var7);
                class377.method2317(-1, 0, var19.field7870[0], true, var19.method2241(-99), var19.field7866[0], -2, var19.method2241(-88), 0);
            }
        }
        if (var6 == 46) {
            class366 var20 = class73.field1444[var7];
            if (var20 != null) {
                class68.field1381 = arg1;
                class359.field5281++;
                class61.field1262 = 2;
                class108.field1991 = 0;
                class491.field7198 = arg2;
                class459.method2765(class41.field573, (byte) 87);
                class335.field5062.method1875((byte) 98, var7);
                class335.field5062.method1874(class179.field2912.method1458(arg3 ^ 0x21, 82) ? 1 : 0, 128);
                class377.method2317(-1, 0, var20.field7870[0], true, var20.method2241(arg3 ^ 0xFFFFFFF1), var20.field7866[0], -2, var20.method2241(arg3 ^ -37), 0);
            }
        }
        if (var6 == 59) {
            class68.field1381 = arg1;
            class108.field1991 = 0;
            class533.field7733++;
            class61.field1262 = 2;
            class491.field7198 = arg2;
            class459.method2765(class50.field1006, (byte) 87);
            class335.field5062.method1861(false, var7);
            class335.field5062.method1814(class179.field2912.method1458(arg3 + 31, 82) ? 1 : 0, true);
            class335.field5062.method1861(false, class212.field3378 + var5);
            class335.field5062.method1853(class496.field7292 + var4, 28);
            class68.method596(var4, arg3 ^ 0xFFFF8824, var5);
        }
        if (var6 == 16) {
            class68.field1381 = arg1;
            class491.field7198 = arg2;
            class61.field1262 = 2;
            class108.field1991 = 0;
            class108.field1989++;
            class459.method2765(class208.field3334, (byte) 87);
            class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
            class335.field5062.method1865(var7, 812856296);
            class335.field5062.method1853(var5 + class212.field3378, arg3 + -50);
            class335.field5062.method1861(false, class496.field7292 + var4);
            class68.method596(var4, -30623, var5);
        }
        if (var6 == 47) {
            class68.field1381 = arg1;
            class491.field7198 = arg2;
            class458.field6793++;
            class61.field1262 = 2;
            class108.field1991 = 0;
            class459.method2765(class377.field5513, (byte) 87);
            class335.field5062.method1853(var7, 44);
            class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
            class335.field5062.method1861(false, class160.field2579);
            class335.field5062.method1853(class496.field7292 + var4, 106);
            class335.field5062.method1853(class212.field3378 + var5, 4);
            class335.field5062.method1879(class506.field7383, -329997008);
            class335.field5062.method1875((byte) 103, class341.field5130);
            class68.method596(var4, -30623, var5);
        }
        if (var6 == 11) {
            class435 var21 = (class435) class209.field3337.method1622((long) var7, -109);
            if (var21 != null) {
                class61.field1262 = 2;
                class491.field7198 = arg2;
                class68.field1381 = arg1;
                class108.field1991 = 0;
                class244.field3780++;
                class163 var22 = var21.field6471;
                class459.method2765(class450.field6696, (byte) 87);
                class335.field5062.method1873(class506.field7383, false);
                class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
                class335.field5062.method1853(var7, 95);
                class335.field5062.method1853(class160.field2579, arg3 ^ 0x75);
                class335.field5062.method1861(false, class341.field5130);
                class377.method2317(-1, 0, var22.field7870[0], true, var22.method2241(-118), var22.field7866[0], -2, var22.method2241(-46), 0);
            }
        }
        if (var6 == 23) {
            class366 var23 = class73.field1444[var7];
            if (var23 != null) {
                class246.field3795++;
                class108.field1991 = 0;
                class61.field1262 = 2;
                class491.field7198 = arg2;
                class68.field1381 = arg1;
                class459.method2765(class456.field6762, (byte) 87);
                class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
                class335.field5062.method1875((byte) -92, var7);
                class377.method2317(-1, 0, var23.field7870[0], true, var23.method2241(-67), var23.field7866[0], -2, var23.method2241(-63), 0);
            }
        }
        if (var6 == 1008) {
            class61.field1262 = 2;
            class491.field7198 = arg2;
            class108.field1991 = 0;
            class531.field7728++;
            class68.field1381 = arg1;
            class459.method2765(class13.field238, (byte) 87);
            class335.field5062.method1865(var7, 812856296);
        }
        if (var6 == 49) {
            class199.field3231++;
            class108.field1991 = 0;
            class61.field1262 = 1;
            class491.field7198 = arg2;
            class68.field1381 = arg1;
            class459.method2765(class514.field7466, (byte) 87);
            class335.field5062.method1861(false, class212.field3378 + var5);
            class335.field5062.method1861(false, class160.field2579);
            class335.field5062.method1865(class496.field7292 + var4, arg3 + 812856227);
            class335.field5062.method1861(false, class341.field5130);
            class335.field5062.method1879(class506.field7383, -329997008);
            class377.method2317(-1, 0, var5, true, 1, var4, -4, 1, 0);
        }
        if (var6 == 45 || var6 == 1001) {
            class379.method2334(var7, var5, arg0.field4977, arg3 ^ 0xFFFFCE2A, var4);
        }
        if (var6 == 19 && class299.field4518 == null) {
            class417.method2556(var4, -86, var5);
            class299.field4518 = class447.method2677(var4, 0, var5);
            class429.method2587(class299.field4518, (byte) -63);
        }
        if (var6 == 5) {
            if (class239.field3706 > 0 && class179.field2912.method1458(100, 82) && class179.field2912.method1458(100, 81)) {
                class127.method1001(class212.field3378 + var5, class496.field7292 + var4, 63, class15.field266.field6084);
            } else {
                class359.method2213(var5, (byte) 19, var4, var7);
                if (var7 == 1) {
                    class335.field5062.method1814(-1, true);
                    class335.field5062.method1814(-1, true);
                    class335.field5062.method1865((int) class525.field7631, 812856296);
                    class335.field5062.method1814(57, true);
                    class335.field5062.method1814(class1.field49, true);
                    class335.field5062.method1814(class60.field1242, true);
                    class335.field5062.method1814(89, true);
                    class335.field5062.method1865(class15.field266.field6073, arg3 + 812856227);
                    class335.field5062.method1865(class15.field266.field6078, 812856296);
                    class335.field5062.method1814(63, true);
                } else {
                    class108.field1991 = 0;
                    class491.field7198 = arg2;
                    class61.field1262 = 1;
                    class68.field1381 = arg1;
                }
                class377.method2317(-1, 0, var5, true, 1, var4, -4, 1, 0);
            }
        }
        if (var6 == 4) {
            class491.field7198 = arg2;
            class61.field1262 = 2;
            class68.field1381 = arg1;
            class161.field2587++;
            class108.field1991 = 0;
            class459.method2765(class325.field4939, (byte) 87);
            class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
            class335.field5062.method1853(class496.field7292 + var4, 83);
            class335.field5062.method1875((byte) -122, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class335.field5062.method1865(class212.field3378 + var5, arg3 + 812856227);
            class248.method1607(var8, true, var4, var5);
        }
        if (var6 == 44) {
            class366 var24 = class73.field1444[var7];
            if (var24 != null) {
                class68.field1381 = arg1;
                class405.field6104++;
                class108.field1991 = 0;
                class61.field1262 = 2;
                class491.field7198 = arg2;
                class459.method2765(class284.field4279, (byte) 87);
                class335.field5062.method1875((byte) -97, var7);
                class335.field5062.method1830((byte) -54, class179.field2912.method1458(100, 82) ? 1 : 0);
                class377.method2317(-1, 0, var24.field7870[0], true, var24.method2241(-87), var24.field7866[0], -2, var24.method2241(-13), 0);
            }
        }
        if (var6 == 17) {
            class108.field1991 = 0;
            class491.field7198 = arg2;
            class68.field1381 = arg1;
            class354.field5221++;
            class61.field1262 = 2;
            class459.method2765(class527.field7654, (byte) 87);
            class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
            class335.field5062.method1853(class212.field3378 + var5, 98);
            class335.field5062.method1853((int) (var8 >>> 32) & Integer.MAX_VALUE, 77);
            class335.field5062.method1865(class496.field7292 + var4, 812856296);
            class248.method1607(var8, true, var4, var5);
        }
        if (var6 == 9) {
            class435 var25 = (class435) class209.field3337.method1622((long) var7, arg3 ^ 0xFFFFFFCE);
            if (var25 != null) {
                class68.field1381 = arg1;
                class491.field7198 = arg2;
                class108.field1991 = 0;
                class163 var26 = var25.field6471;
                class101.field1931++;
                class61.field1262 = 2;
                class459.method2765(class329.field4987, (byte) 87);
                class335.field5062.method1874(class179.field2912.method1458(arg3 ^ 0x21, 82) ? 1 : 0, arg3 ^ 0xC5);
                class335.field5062.method1865(var7, 812856296);
                class377.method2317(-1, 0, var26.field7870[0], true, var26.method2241(-99), var26.field7866[0], -2, var26.method2241(-77), 0);
            }
        }
        if (var6 == 1012) {
            class68.field1381 = arg1;
            class108.field1991 = 0;
            class491.field7198 = arg2;
            class61.field1262 = 2;
            class435 var27 = (class435) class209.field3337.method1622((long) var7, arg3 ^ 0xFFFFFFCD);
            if (var27 != null) {
                class163 var28 = var27.field6471;
                class51 var29 = var28.field2613;
                if (var29.field1038 != null) {
                    var29 = var29.method475(class402.field6080, -1);
                }
                if (var29 != null) {
                    class459.method2765(class398.field6040, (byte) 87);
                    class130.field2206++;
                    class335.field5062.method1865(var29.field1071, 812856296);
                }
            }
        }
        if (var6 == 25) {
            class366 var30 = class73.field1444[var7];
            if (var30 != null) {
                class61.field1262 = 2;
                class491.field7198 = arg2;
                class473.field7002++;
                class108.field1991 = 0;
                class68.field1381 = arg1;
                class459.method2765(class140.field2331, (byte) 87);
                class335.field5062.method1862((byte) -115, class506.field7383);
                class335.field5062.method1830((byte) -72, class179.field2912.method1458(100, 82) ? 1 : 0);
                class335.field5062.method1861(false, class160.field2579);
                class335.field5062.method1853(var7, arg3 - 42);
                class335.field5062.method1853(class341.field5130, 79);
                class377.method2317(-1, 0, var30.field7870[0], true, var30.method2241(-80), var30.field7866[0], -2, var30.method2241(arg3 - 160), 0);
            }
        }
        if (var6 == 3) {
            class388 var31 = class447.method2677(var4, 0, var5);
            if (var31 != null) {
                class107.method915(var31, (byte) -86);
            }
        }
        if (var6 == 1003) {
            class491.field7198 = arg2;
            class61.field1262 = 2;
            class68.field1381 = arg1;
            class190.field3051++;
            class108.field1991 = 0;
            class459.method2765(class383.field5594, (byte) 87);
            class335.field5062.method1865(var7, 812856296);
        }
        if (var6 == 22) {
            class435 var32 = (class435) class209.field3337.method1622((long) var7, 102);
            if (var32 != null) {
                class111.field2029++;
                class163 var33 = var32.field6471;
                class108.field1991 = 0;
                class491.field7198 = arg2;
                class68.field1381 = arg1;
                class61.field1262 = 2;
                class459.method2765(class20.field314, (byte) 87);
                class335.field5062.method1853(var7, 65);
                class335.field5062.method1874(class179.field2912.method1458(100, 82) ? 1 : 0, 128);
                class377.method2317(-1, 0, var33.field7870[0], true, var33.method2241(arg3 ^ 0xFFFFFFC4), var33.field7866[0], -2, var33.method2241(arg3 ^ -123), 0);
            }
        }
        if (var6 == 12) {
            class366 var34 = class73.field1444[var7];
            if (var34 != null) {
                class491.field7198 = arg2;
                class25.field355++;
                class68.field1381 = arg1;
                class61.field1262 = 2;
                class108.field1991 = 0;
                class459.method2765(class318.field4837, (byte) 87);
                class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
                class335.field5062.method1875((byte) 2, var7);
                class377.method2317(-1, 0, var34.field7870[0], true, var34.method2241(-11), var34.field7866[0], -2, var34.method2241(arg3 - 173), 0);
            }
        }
        if (var6 == 1004) {
            class362.field5299++;
            class61.field1262 = 2;
            class68.field1381 = arg1;
            class108.field1991 = 0;
            class491.field7198 = arg2;
            class459.method2765(class54.field1155, (byte) 87);
            class335.field5062.method1875((byte) 80, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class335.field5062.method1875((byte) 35, class212.field3378 + var5);
            class335.field5062.method1853(class496.field7292 + var4, 83);
            class335.field5062.method1874(class179.field2912.method1458(100, 82) ? 1 : 0, 128);
            class248.method1607(var8, true, var4, var5);
        }
        if (var6 == 48) {
            if (class239.field3706 > 0 && class179.field2912.method1458(100, 82) && class179.field2912.method1458(100, 81)) {
                class127.method1001(class212.field3378 + var5, class496.field7292 + var4, 63, class15.field266.field6084);
            } else {
                class108.field1991 = 0;
                class61.field1262 = 1;
                class68.field1381 = arg1;
                class491.field7198 = arg2;
                class262.field3984++;
                class459.method2765(class374.field5482, (byte) 87);
                class335.field5062.method1875((byte) -90, class212.field3378 + var5);
                class335.field5062.method1875((byte) -103, class496.field7292 + var4);
            }
        }
        if (var6 == 50) {
            class366 var35 = class73.field1444[var7];
            if (var35 != null) {
                class308.field4677++;
                class491.field7198 = arg2;
                class61.field1262 = 2;
                class68.field1381 = arg1;
                class108.field1991 = 0;
                class459.method2765(class329.field4995, (byte) 87);
                class335.field5062.method1875((byte) 103, var7);
                class335.field5062.method1874(class179.field2912.method1458(arg3 ^ 0x21, 82) ? 1 : 0, 128);
                class377.method2317(-1, 0, var35.field7870[0], true, var35.method2241(-120), var35.field7866[0], -2, var35.method2241(-122), 0);
            }
        }
        if (var6 == 58) {
            class108.field1991 = 0;
            class491.field7198 = arg2;
            class68.field1381 = arg1;
            class61.field1262 = 2;
            class71.field1433++;
            class459.method2765(class11.field146, (byte) 87);
            class335.field5062.method1853(class160.field2579, arg3 ^ 0x79);
            class335.field5062.method1829(class506.field7383, (byte) -112);
            class335.field5062.method1820(false, class179.field2912.method1458(100, 82) ? 1 : 0);
            class335.field5062.method1861(false, class341.field5130);
            class335.field5062.method1853(class496.field7292 + var4, arg3 ^ 0x59);
            class335.field5062.method1861(false, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class335.field5062.method1853(class212.field3378 + var5, arg3 ^ 0x70);
            class248.method1607(var8, true, var4, var5);
        }
        if (var6 == 2) {
            class366 var36 = class73.field1444[var7];
            if (var36 != null) {
                class95.field1864++;
                class68.field1381 = arg1;
                class61.field1262 = 2;
                class108.field1991 = 0;
                class491.field7198 = arg2;
                class459.method2765(class181.field2924, (byte) 87);
                class335.field5062.method1853(var7, arg3 ^ 0x3B);
                class335.field5062.method1814(class179.field2912.method1458(100, 82) ? 1 : 0, true);
                class377.method2317(-1, 0, var36.field7870[0], true, var36.method2241(-106), var36.field7866[0], -2, var36.method2241(-53), 0);
            }
        }
        if (var6 == 1002 || var6 == 1011 || var6 == 1010 || var6 == 1006 || var6 == 1009) {
            class65.method573(var6, 1011, var4, var7);
        }
        if (class233.field3597) {
            class320.method2056(-80);
        }
        if (class237.field3645 != null && class220.field3453 == 0) {
            class429.method2587(class237.field3645, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)V")
    public static void method2572(int arg0) {
        field6344 = null;
        field6341 = null;
        if (arg0 != 0) {
            field6344 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZLza;II)Z")
    public abstract boolean method14(boolean arg0, class288 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z")
    public abstract boolean method19(byte arg0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZILha;)V")
    public static final void method2573(boolean arg0, int arg1, class43 arg2) {
        class479.field7068 = 0;
        class208.field3332 = arg0;
        field6347++;
        class518.method3076(0, arg2);
        class169.method1187((byte) 43, arg2);
        if (class208.field3332) {
            System.out.println("---endgpp---");
        }
        if (arg2.field4399 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg2.field4399 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "(I)V")
    public static final void method2574(int arg0) {
        field6343++;
        if (arg0 > -125) {
            return;
        }
        for (int var1 = 0; var1 < class341.field5128; var1++) {
            int var2 = class515.field7477[var1];
            class435 var3 = (class435) class209.field3337.method1622((long) var2, 96);
            if (var3 != null) {
                class163 var4 = var3.field6471;
                class70.method606(var4, var4.field2613.field1050, -212);
            }
        }
    }
}
