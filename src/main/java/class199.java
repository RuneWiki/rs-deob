import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class199 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lta;")
    public static class217 field3397 = null;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lwl;")
    public static class100[] field3399 = new class100[14];

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3402 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lve;")
    public static class293 field3398 = new class293();

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
    public static boolean field3403 = false;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field3404 = -1;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[B")
    public static byte[] field3401;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 4)
    public static void method1498(byte arg0) {
        field3401 = null;
        field3399 = null;
        field3397 = null;
        field3398 = null;
        field3402 = null;
        if (arg0 <= 47) {
            method1498((byte) -10);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 30)
    public static final void method1499(int arg0) {
        field3400++;
        class324.method2246(false, (byte) -39);
        class329.field5239 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class180.field3039.length; var2++) {
            if (class88.field1386[var2] != -1 && class180.field3039[var2] == null) {
                class180.field3039[var2] = class92.field1446.method441(false, class88.field1386[var2], 0);
                if (class180.field3039[var2] == null) {
                    class329.field5239++;
                    var1 = false;
                }
            }
            if (class349.field5547[var2] != -1 && class310.field4910[var2] == null) {
                class310.field4910[var2] = class92.field1446.method451(class349.field5547[var2], 0, false, class44.field706[var2]);
                if (class310.field4910[var2] == null) {
                    var1 = false;
                    class329.field5239++;
                }
            }
            if (class43.field680) {
                if (class154.field2746[var2] != -1 && class277.field4409[var2] == null) {
                    class277.field4409[var2] = class92.field1446.method441(false, class154.field2746[var2], 0);
                    if (class277.field4409[var2] == null) {
                        var1 = false;
                        class329.field5239++;
                    }
                }
                if (class276.field4400[var2] != -1 && class144.field2624[var2] == null) {
                    class144.field2624[var2] = class92.field1446.method441(false, class276.field4400[var2], 0);
                    if (class144.field2624[var2] == null) {
                        var1 = false;
                        class329.field5239++;
                    }
                }
            }
            if (class201.field3431 != null && class100.field1618[var2] == null && class201.field3431[var2] != -1) {
                class100.field1618[var2] = class92.field1446.method451(class201.field3431[var2], 0, false, class44.field706[var2]);
                if (class100.field1618[var2] == null) {
                    var1 = false;
                    class329.field5239++;
                }
            }
        }
        if (class133.field2271 == null) {
            if (class21.field329 == null || !class166.field2895.method446(class21.field329.field5174 + "_labels", 0)) {
                class133.field2271 = new class304(0);
            } else if (class166.field2895.method460(class21.field329.field5174 + "_labels", arg0 - 25)) {
                class133.field2271 = class40.method339(1, class166.field2895, class21.field329.field5174 + "_labels");
            } else {
                var1 = false;
                class329.field5239++;
            }
        }
        if (!var1) {
            class28.field381 = 1;
            return;
        }
        boolean var3 = true;
        class288.field4602 = 0;
        for (int var4 = 0; var4 < class180.field3039.length; var4++) {
            byte[] var5 = class310.field4910[var4];
            if (var5 != null) {
                int var6 = (class56.field866[var4] >> 8) * 64 - class24.field345;
                int var7 = (class56.field866[var4] & 0xFF) * 64 - class34.field484;
                if (class7.field90) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class159.method1270(var7, var5, -54, var6);
            }
            if (class43.field680) {
                byte[] var8 = class144.field2624[var4];
                if (var8 != null) {
                    int var9 = (class56.field866[var4] >> 8) * 64 - class24.field345;
                    int var10 = (class56.field866[var4] & 0xFF) * 64 - class34.field484;
                    if (class7.field90) {
                        var9 = 10;
                        var10 = 10;
                    }
                    var3 &= class159.method1270(var10, var8, arg0 ^ 0xFFFFFFF8, var9);
                }
            }
        }
        if (!var3) {
            class28.field381 = 2;
            return;
        }
        if (class28.field381 != 0) {
            class120.method1019(23516, class30.field437 + "<br>(100%)", true);
        }
        class215.method1587(false);
        class28.method251(-1);
        boolean var11 = false;
        if (class43.field680 && class285.field4521) {
            for (int var12 = 0; var12 < class180.field3039.length; var12++) {
                if (class144.field2624[var12] != null || class277.field4409[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class124.method1037(4, 104, arg0, class43.field680 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class163.field2882[var13].method1504(false);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class152.field2683[var14][var15][var16] = 0;
                }
            }
        }
        class37.method324(false, (byte) -125);
        if (class43.field680) {
            class14.field224.method1597();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class14.field222[var17][var18].field4978 = true;
                }
            }
        }
        if (class43.field680) {
            class245.method1707();
        }
        if (class43.field680) {
            class262.method1811(true);
        }
        class215.method1587(false);
        System.gc();
        class324.method2246(true, (byte) -39);
        class84.method760(false, -108);
        if (!class7.field90) {
            class11.method110(false, -72);
            class324.method2246(true, (byte) -39);
            if (class43.field680) {
                int var19 = class218.field3632.field1975[0] >> 3;
                int var20 = class218.field3632.field2034[0] >> 3;
                class155.method1240(arg0 ^ 0x6A, var19, var20);
            }
            class100.method868(false, -83);
            if (class100.field1618 != null) {
                class53.method484(-105);
            }
        }
        if (class7.field90) {
            class313.method2162(false, true);
            class324.method2246(true, (byte) -39);
            if (class43.field680) {
                int var21 = class218.field3632.field1975[0] >> 3;
                int var22 = class218.field3632.field2034[0] >> 3;
                class155.method1240(2, var21, var22);
            }
            class297.method2022(arg0 ^ 0xFB0, false);
        }
        class28.method251(-1);
        class324.method2246(true, (byte) -39);
        class276.method1899(class7.field90 ? class222.field3700 : (int[][][]) null, false, 124, class163.field2882);
        if (class43.field680) {
            class245.method1714();
        }
        class324.method2246(true, (byte) -39);
        int var23 = class44.field690;
        if (var23 > class205.field3497) {
            var23 = class205.field3497;
        }
        if (var23 < class205.field3497 - 1) {
            int var24 = class205.field3497 - 1;
        }
        if (class56.method499(28)) {
            class52.method475(0);
        } else {
            class52.method475(class44.field690);
        }
        class57.method516(31732);
        if (class43.field680 && var11) {
            class304.method2094(true);
            class84.method760(true, -74);
            if (!class7.field90) {
                class11.method110(true, 118);
                class324.method2246(true, (byte) -39);
                class100.method868(true, -126);
            }
            if (class7.field90) {
                class313.method2162(true, true);
                class324.method2246(true, (byte) -39);
                class297.method2022(4056, true);
            }
            class28.method251(-1);
            class324.method2246(true, (byte) -39);
            class276.method1899(class7.field90 ? class222.field3700 : (int[][][]) null, true, 94, class163.field2882);
            class324.method2246(true, (byte) -39);
            class57.method516(31732);
            class304.method2094(false);
        }
        if (class43.field680) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class14.field222[var25][var26].method2165(class137.field2487[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class107.method936(var28, 0, var27);
            }
        }
        class126.method1049(4892);
        class215.method1587(false);
        class152.method1200(6);
        class28.method251(-1);
        class283.field4479 = false;
        if (class43.field680) {
            class316.method2175(true, false);
        }
        if (class271.field4321 != null && class279.field4426 != null && class88.field1397 == 25) {
            class341.field5443.method26(58, arg0 - 97);
            class341.field5443.method2320(-6128, 1057001181);
            class347.field5529++;
        }
        if (!class7.field90) {
            int var29 = (class144.field2626 - 6) / 8;
            int var30 = (class144.field2626 + 6) / 8;
            int var31 = (class181.field3047 - 6) / 8;
            int var32 = (class181.field3047 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= (var30 + 1); var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var29 > var33 || var33 > var30 || var34 < var31 || var34 > var32) {
                        class92.field1446.method438(arg0 ^ 0xFFFFFF97, "m" + var33 + "_" + var34);
                        class92.field1446.method438(arg0 - 105, "l" + var33 + "_" + var34);
                    }
                }
            }
        }
        if (class88.field1397 == 28) {
            class33.method302((byte) 120, 10);
        } else {
            class33.method302((byte) -79, 30);
            if (class279.field4426 != null) {
                class341.field5443.method26(198, arg0 ^ 0x6F);
            }
        }
        class332.method2308((byte) -127);
        class215.method1587(false);
        class116.method986(0);
    }
}
