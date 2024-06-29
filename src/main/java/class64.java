import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field1435 = 0;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field1438 = 0;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[Lna;")
    public static class91[] field1437 = new class91[4];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lv;")
    public static class146 field1432 = class159.method1226((byte) -37, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[I")
    public static int[] field1443 = new int[25];

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Lv;")
    public static class146 field1450 = class159.method1226((byte) -37, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field1451 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Ljd;")
    public class66 field1441;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Ljd;")
    public class66 field1442;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[Lue;")
    public static class144[] field1454;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Z")
    public static final boolean method461(int arg0, boolean arg1) {
        if (arg1) {
            method463(-117);
        }
        field1433++;
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lv;")
    public static final class146 method462(int arg0, int arg1) {
        field1445++;
        class146 var2 = new class146();
        var2.field3372 = arg1;
        var2.field3365 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1432 = null;
        field1454 = null;
        field1437 = null;
        field1443 = null;
        field1450 = null;
        if (arg0 != 1) {
            method463(-49);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
    public static final void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1446++;
        if (class87.field2055 == arg0 && class146.field3356 == arg5 && (class9.field172 == arg3 || !class91.field2196)) {
            return;
        }
        class146.field3356 = arg5;
        class87.field2055 = arg0;
        class9.field172 = arg3;
        if (!class91.field2196) {
            class9.field172 = 0;
        }
        class88.method702(25, false);
        class12.method70(true, -120, class152.field3501);
        int var6 = class76.field1814;
        int var7 = class63.field1429;
        class76.field1814 = (arg5 - 6) * 8;
        class63.field1429 = arg0 * 8 - 48;
        int var8 = class63.field1429 - var7;
        int var9 = class76.field1814 - var6;
        int var10 = class76.field1814;
        int var11 = class63.field1429;
        for (int var12 = 0; var12 < 32768; var12++) {
            class38 var28 = class34.field735[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field788[var29] -= var8;
                    var28.field738[var29] -= var9;
                }
                var28.field790 -= var9 * 128;
                var28.field757 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class67 var26 = class125.field2902[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field788[var27] -= var8;
                    var26.field738[var27] -= var9;
                }
                var26.field757 -= var8 * 128;
                var26.field790 -= var9 * 128;
            }
        }
        class148.field3428 = arg3;
        class116.field2696.method233(false, 0, arg4, arg1);
        byte var14 = 0;
        byte var15 = 1;
        byte var16 = 104;
        if (var8 < 0) {
            var16 = -1;
            var15 = -1;
            var14 = 103;
        }
        int var17 = arg2;
        byte var18 = 104;
        byte var19 = 1;
        if (var9 < 0) {
            var18 = -1;
            var19 = -1;
            var17 = 103;
        }
        for (int var20 = var14; var20 != var16; var20 += var15) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var9 + var22;
                int var24 = var20 + var8;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class148.field3434[var25][var20][var22] = class148.field3434[var25][var24][var23];
                    } else {
                        class148.field3434[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class101 var21 = (class101) class12.field183.method1138(25852); var21 != null; var21 = (class101) class12.field183.method1142(arg2 + 1)) {
            var21.field2453 -= var9;
            var21.field2447 -= var8;
            if (var21.field2447 < 0 || var21.field2453 < 0 || var21.field2447 >= 104 || var21.field2453 >= 104) {
                var21.method217(-1264);
            }
        }
        if (class63.field1421 != 0) {
            class110.field2608 -= var9;
            class63.field1421 -= var8;
        }
        class76.field1806 = 0;
        class51.field1162 = -1;
        class150.field3477 = false;
        class108.field2578.method1145((byte) -72);
        class79.field1939.method1145((byte) -72);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method465(byte arg0) {
        int var1 = 40 % ((arg0 - 34) / 44);
        class44 var2 = (class44) class79.field1939.method1138(25852);
        field1434++;
        while (var2 != null) {
            if (class148.field3428 != var2.field1022 || class94.field2229 > var2.field999) {
                var2.method217(-1264);
            } else if (class94.field2229 >= var2.field986) {
                if (var2.field1008 > 0) {
                    class38 var3 = class34.field735[var2.field1008 - 1];
                    if (var3 != null && var3.field757 >= 0 && var3.field757 < 13312 && var3.field790 >= 0 && var3.field790 < 13312) {
                        var2.method296(var3.field790, class94.field2229, var3.field757, (byte) 111, class79.method612(var2.field1022, var3.field757, var3.field790, false) - var2.field1026);
                    }
                }
                if (var2.field1008 < 0) {
                    int var4 = -var2.field1008 - 1;
                    class67 var5;
                    if (class49.field1135 == var4) {
                        var5 = class116.field2696;
                    } else {
                        var5 = class125.field2902[var4];
                    }
                    if (var5 != null && var5.field757 >= 0 && var5.field757 < 13312 && var5.field790 >= 0 && var5.field790 < 13312) {
                        var2.method296(var5.field790, class94.field2229, var5.field757, (byte) 125, class79.method612(var2.field1022, var5.field757, var5.field790, false) - var2.field1026);
                    }
                }
                var2.method295(class1.field16, 19312);
                class66.field1496.method1189(class148.field3428, (int) var2.field991, (int) var2.field1021, (int) var2.field1012, 60, var2, var2.field1009, -1, false);
            }
            var2 = (class44) class79.field1939.method1142(1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Ldd;")
    public static final class26 method466(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field1439++;
        if (class34.field736[var2] == null || class34.field736[var2][var3] == null) {
            boolean var4 = class54.method365(arg0 ^ 0x8D68CC69, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg0 != -1922515024) {
            method463(-56);
        }
        return class34.field736[var2][var3];
    }
}
