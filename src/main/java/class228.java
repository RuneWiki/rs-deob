import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class228 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Lvf;")
    public static class265 field4042 = class87.method582(-46, "gelb:");

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lfl;")
    public static class192 field4046;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)V")
    public abstract void method80(int arg0, byte arg1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(JZIB)Lvf;")
    public static final class265 method1544(long arg0, boolean arg1, int arg2, byte arg3) {
        field4041++;
        if (arg3 != -26) {
            method1547((byte) -89);
        }
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        long var5 = arg0 / (long) arg2;
        int var7 = 1;
        while (var5 != 0L) {
            var7++;
            var5 /= (long) arg2;
        }
        int var8 = var7;
        if (arg0 < 0L || arg1) {
            var8 = var7 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg0 < 0L) {
            var9[0] = 45;
        } else if (arg1) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var7; var10++) {
            int var12 = (int) (arg0 % (long) arg2);
            arg0 /= (long) arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class265 var11 = new class265();
        var11.field4640 = var8;
        var11.field4643 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
    public static final void method1545(int arg0, int arg1) {
        class263.field4590 = arg0;
        field4040++;
        class174.field3125 = -1;
        int var2 = 27 % ((20 - arg1) / 58);
        class174.field3125 = -1;
        class30.method246(44);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = arg11; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class93.field1657[var12][var31] = 0;
                class258.field4444[var12][var31] = 99999999;
            }
        }
        field4043++;
        class93.field1657[arg6][arg7] = 99;
        int var13 = arg6;
        class258.field4444[arg6][arg7] = 0;
        byte var14 = 0;
        int var15 = 0;
        class8.field268[var14] = arg6;
        int var32 = var14 + 1;
        class80.field1513[var14] = arg7;
        int var16 = arg7;
        boolean var17 = false;
        int[][] var18 = class130.field2279[class216.field3902].field4422;
        while (var32 != var15) {
            var16 = class80.field1513[var15];
            var13 = class8.field268[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg1 == var13 && arg3 == var16) {
                var17 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class130.field2279[class216.field3902].method1684(arg0 - 1, var13, arg3, (byte) 5, var16, 2, arg1, arg2)) {
                    var17 = true;
                    break;
                }
                if (arg0 < 10 && class130.field2279[class216.field3902].method1688(var16, var13, arg2, arg3, arg0 - 1, (byte) -128, 2, arg1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg10 != 0 && class130.field2279[class216.field3902].method1698((byte) -127, arg4, arg9, arg3, var13, 2, var16, arg10, arg1)) {
                var17 = true;
                break;
            }
            int var30 = class258.field4444[var13][var16] + 1;
            if (var13 > 0 && class93.field1657[var13 - 1][var16] == 0 && (var18[var13 - 1][var16] & 0x12C010E) == 0 && (var18[var13 - 1][var16 + 1] & 0x12C0138) == 0) {
                class8.field268[var32] = var13 - 1;
                class80.field1513[var32] = var16;
                class93.field1657[var13 - 1][var16] = 2;
                class258.field4444[var13 - 1][var16] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class93.field1657[var13 + 1][var16] == 0 && (var18[var13 + 2][var16] & 0x12C0183) == 0 && (var18[var13 + 2][var16 + 1] & 0x12C01E0) == 0) {
                class8.field268[var32] = var13 + 1;
                class80.field1513[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 + 1][var16] = 8;
                class258.field4444[var13 + 1][var16] = var30;
            }
            if (var16 > 0 && class93.field1657[var13][var16 - 1] == 0 && (var18[var13][var16 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var16 - 1] & 0x12C0183) == 0) {
                class8.field268[var32] = var13;
                class80.field1513[var32] = var16 - 1;
                class93.field1657[var13][var16 - 1] = 1;
                class258.field4444[var13][var16 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 < 102 && class93.field1657[var13][var16 + 1] == 0 && (var18[var13][var16 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var16 + 2] & 0x12C01E0) == 0) {
                class8.field268[var32] = var13;
                class80.field1513[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13][var16 + 1] = 4;
                class258.field4444[var13][var16 + 1] = var30;
            }
            if (var13 > 0 && var16 > 0 && class93.field1657[var13 - 1][var16 - 1] == 0 && (var18[var13 - 1][var16] & 0x12C0138) == 0 && (var18[var13 - 1][var16 - 1] & 0x12C010E) == 0 && (var18[var13][var16 - 1] & 0x12C0183) == 0) {
                class8.field268[var32] = var13 - 1;
                class80.field1513[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 - 1][var16 - 1] = 3;
                class258.field4444[var13 - 1][var16 - 1] = var30;
            }
            if (var13 < 102 && var16 > 0 && class93.field1657[var13 + 1][var16 - 1] == 0 && (var18[var13 + 1][var16 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var16 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var16] & 0x12C01E0) == 0) {
                class8.field268[var32] = var13 + 1;
                class80.field1513[var32] = var16 - 1;
                class93.field1657[var13 + 1][var16 - 1] = 9;
                class258.field4444[var13 + 1][var16 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var16 < 102 && class93.field1657[var13 - 1][var16 + 1] == 0 && (var18[var13 - 1][var16 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var16 + 2] & 0x12C0138) == 0 && (var18[var13][var16 + 2] & 0x12C01E0) == 0) {
                class8.field268[var32] = var13 - 1;
                class80.field1513[var32] = var16 + 1;
                class93.field1657[var13 - 1][var16 + 1] = 6;
                class258.field4444[var13 - 1][var16 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var16 < 102 && class93.field1657[var13 + 1][var16 + 1] == 0 && (var18[var13 + 1][var16 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var16 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var16 + 1] & 0x12C0183) == 0) {
                class8.field268[var32] = var13 + 1;
                class80.field1513[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 + 1][var16 + 1] = 12;
                class258.field4444[var13 + 1][var16 + 1] = var30;
            }
        }
        class242.field4210 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg1 - var21; var22 <= arg1 + var21; var22++) {
                for (int var23 = arg3 - var21; var23 <= (arg3 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class258.field4444[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg3 > var23) {
                            var24 = arg3 - var23;
                        } else if ((arg10 + arg3 - 1) < var23) {
                            var24 = 1 - arg3 - (arg10 - var23);
                        }
                        if (arg1 > var22) {
                            var25 = arg1 - var22;
                        } else if (var22 > arg1 + arg4 - 1) {
                            var25 = var22 + 1 - arg4 - arg1;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && var20 > class258.field4444[var22][var23]) {
                            var19 = var26;
                            var13 = var22;
                            var16 = var23;
                            var20 = class258.field4444[var22][var23];
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg7 == var16) {
                return false;
            }
            class242.field4210 = 1;
        }
        byte var27 = 0;
        class8.field268[var27] = var13;
        int var33 = var27 + 1;
        class80.field1513[var27] = var16;
        int var28;
        int var29 = var28 = class93.field1657[var13][var16];
        while (arg6 != var13 || arg7 != var16) {
            if (var28 != var29) {
                class8.field268[var33] = var13;
                class80.field1513[var33++] = var16;
                var28 = var29;
            }
            if ((var29 & 0x1) != 0) {
                var16++;
            } else if ((var29 & 0x4) != 0) {
                var16--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class93.field1657[var13][var16];
        }
        if (var33 > 0) {
            class48.method390(var33, arg5, (byte) -100);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)I")
    public abstract int method78(byte arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[B")
    public abstract byte[] method88(int arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static final void method1547(byte arg0) {
        class116.method777((byte) 34, false);
        field4045++;
        class174.field3121 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class254.field4372.length; var2++) {
            if (class50.field1059[var2] != -1 && class254.field4372[var2] == null) {
                class254.field4372[var2] = class30.field757.method1332(true, 0, class50.field1059[var2]);
                if (class254.field4372[var2] == null) {
                    var1 = false;
                    class174.field3121++;
                }
            }
            if (class69.field1313[var2] != -1 && class218.field3930[var2] == null) {
                class218.field3930[var2] = class30.field757.method1309(0, false, class69.field1313[var2], class257.field4407[var2]);
                if (class218.field3930[var2] == null) {
                    var1 = false;
                    class174.field3121++;
                }
            }
            if (class141.field2625 != null && class15.field441[var2] == null && class141.field2625[var2] != -1) {
                class15.field441[var2] = class30.field757.method1309(0, false, class141.field2625[var2], class257.field4407[var2]);
                if (class15.field441[var2] == null) {
                    class174.field3121++;
                    var1 = false;
                }
            }
        }
        if (class221.field3962 == null) {
            if (class56.field1148 == null || !class252.field4340.method1323((byte) -45, class148.method1022(10, new class265[] { class56.field1148.field410, class97.field1708 }))) {
                class221.field3962 = new class145(0);
            } else if (class252.field4340.method1312(class148.method1022(10, new class265[] { class56.field1148.field410, class97.field1708 }), 1)) {
                class221.field3962 = class256.method1681((byte) 36, class252.field4340, class148.method1022(10, new class265[] { class56.field1148.field410, class97.field1708 }));
            } else {
                class174.field3121++;
                var1 = false;
            }
        }
        if (!var1) {
            class211.field3792 = 1;
            return;
        }
        boolean var3 = true;
        class82.field1542 = 0;
        for (int var4 = 0; var4 < class254.field4372.length; var4++) {
            byte[] var21 = class218.field3930[var4];
            if (var21 != null) {
                int var22 = (class111.field1953[var4] >> 8) * 64 - class64.field1248;
                int var23 = (class111.field1953[var4] & 0xFF) * 64 - class231.field4073;
                if (class190.field3414) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class205.method1407(var23, var21, (byte) -119, var22);
            }
        }
        if (!var3) {
            class211.field3792 = 2;
            return;
        }
        if (class211.field3792 != 0) {
            class166.method1094(24974, true, class148.method1022(10, new class265[] { class119.field2103, class275.field4860 }));
        }
        class44.method369(true);
        class225.method1522(true);
        int var5 = 56 % ((arg0 + 34) / 49);
        boolean var6 = false;
        class280.method1911(4, 104, 104, 25, var6);
        for (int var7 = 0; var7 < 4; var7++) {
            class130.field2279[var7].method1691((byte) -125);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var19 = 0; var19 < 104; var19++) {
                for (int var20 = 0; var20 < 104; var20++) {
                    class230.field4064[var8][var19][var20] = 0;
                }
            }
        }
        class210.method1445(-128, false);
        class44.method369(true);
        System.gc();
        class116.method777((byte) 34, true);
        class68.method486(1212553190, false);
        if (!class190.field3414) {
            class170.method1124(false, 64);
            class116.method777((byte) 34, true);
            class32.method265((byte) -23, false);
            if (class15.field441 != null) {
                class282.method1916(104);
            }
        }
        if (class190.field3414) {
            class68.method491(27440, false);
            class116.method777((byte) 34, true);
            class143.method981(false, -2401);
        }
        class225.method1522(true);
        class116.method777((byte) 34, true);
        class206.method1411((byte) 106, class130.field2279, false);
        class116.method777((byte) 34, true);
        int var9 = class268.field4721;
        if (var9 > class216.field3902) {
            var9 = class216.field3902;
        }
        if ((class216.field3902 - 1) > var9) {
            int var10 = class216.field3902 - 1;
        }
        if (class231.method1561(25088)) {
            class101.method679(0);
        } else {
            class101.method679(class268.field4721);
        }
        class141.method971(21092);
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var18 = 0; var18 < 104; var18++) {
                class131.method876(var18, 1, var11);
            }
        }
        client.method1469((byte) 0);
        class44.method369(true);
        class40.method339((byte) 68);
        class225.method1522(true);
        if (class49.field1044 != null && class197.field3520 != null && class246.field4281 == 25) {
            class154.field2855++;
            class55.field1133.method1863(true, 110);
            class55.field1133.method898((byte) 50, 1057001181);
        }
        if (!class190.field3414) {
            int var12 = (class45.field1006 - 6) / 8;
            int var13 = (class45.field1006 + 6) / 8;
            int var14 = (class105.field1850 + 6) / 8;
            int var15 = (class105.field1850 - 6) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var15 - 1; var17 <= (var14 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var15 > var17 || var14 < var17) {
                        class30.field757.method1306(class148.method1022(10, new class265[] { class63.field1238, class241.method1609(true, var16), class140.field2537, class241.method1609(true, var17) }), 5489);
                        class30.field757.method1306(class148.method1022(10, new class265[] { class52.field1090, class241.method1609(true, var16), class140.field2537, class241.method1609(true, var17) }), 5489);
                    }
                }
            }
        }
        if (class246.field4281 == 28) {
            class70.method497(125, 10);
        } else {
            class70.method497(123, 30);
            if (class197.field3520 != null) {
                class55.field1133.method1863(true, 126);
            }
        }
        class214.method1456(-101);
        class44.method369(true);
        class263.method1757((byte) -108);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Loc;")
    public abstract class121 method89(int arg0);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method1548(int arg0) {
        field4046 = null;
        field4042 = null;
        int var1 = 36 / ((43 - arg0) / 45);
    }
}
