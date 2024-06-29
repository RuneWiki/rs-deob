import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lec;")
    public static class28 field4 = class28.method210(-46, "Unable to connect)3");

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lec;")
    public static class28 field7 = class28.method210(-46, "Mem:");

    @OriginalMember(owner = "client!a", name = "i", descriptor = "Lec;")
    public static class28 field9 = class28.method210(-46, "Imported music");

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lec;")
    public static class28 field8 = class28.method210(-46, "Please contact customer support)3");

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lec;")
    public static class28 field6 = null;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lec;")
    public static class28 field11 = class28.method210(-46, "backbase1");

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[J")
    public static long[] field5 = new long[200];

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lec;")
    public static class28 field12 = class28.method210(-46, "hitmarks");

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lec;")
    public static class28 field2 = class28.method210(-46, "(U5");

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13 = -1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lwc;")
    public static class128 field10;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method1(byte arg0) {
        if (arg0 != 88) {
            field13 = 27;
        }
        field5 = null;
        field6 = null;
        field9 = null;
        field12 = null;
        field7 = null;
        field11 = null;
        field8 = null;
        field10 = null;
        field2 = null;
        field4 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZ)V")
    public static final void method2(boolean arg0, boolean arg1) {
        if (!arg0) {
            method3(-34, (byte) -113, -36, null);
        }
        field1++;
        class63.field1406 = arg1;
        if (!class63.field1406) {
            int var25 = class56.field1282.method859(7482);
            int var26 = (class76.field1692 - class56.field1282.field2554) / 16;
            class103.field2195 = new int[var26][4];
            for (int var27 = 0; var27 < var26; var27++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class103.field2195[var27][var37] = class56.field1282.method882(125);
                }
            }
            int var28 = class56.field1282.method859(7482);
            int var29 = class56.field1282.method859(7482);
            int var30 = class56.field1282.method878((byte) -121);
            int var31 = class56.field1282.method903(2);
            boolean var32 = false;
            if ((var31 / 8 == 48 || var31 / 8 == 49) && var28 / 8 == 48) {
                var32 = true;
            }
            class68.field1534 = new byte[var26][];
            class109.field2272 = new int[var26];
            class3.field52 = new byte[var26][];
            if (var31 / 8 == 48 && var28 / 8 == 148) {
                var32 = true;
            }
            class27.field573 = new int[var26];
            class109.field2303 = new int[var26];
            int var33 = 0;
            for (int var34 = (var31 - 6) / 8; var34 <= (var31 + 6) / 8; var34++) {
                for (int var35 = (var28 - 6) / 8; var35 <= (var28 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var32 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class109.field2272[var33] = var36;
                        class27.field573[var33] = class7.field101.method942(class68.method537(1, new class28[] { class11.field183, class5.method25(6366, var34), class126.field2736, class5.method25(6366, var35) }), 1);
                        class109.field2303[var33] = class7.field101.method942(class68.method537(1, new class28[] { class56.field1298, class5.method25(6366, var34), class126.field2736, class5.method25(6366, var35) }), 1);
                        var33++;
                    }
                }
            }
            class18.method108(var25, var31, var29, var28, var30, true);
            return;
        }
        int var2 = class56.field1282.method893((byte) 124);
        class56.field1282.method158((byte) -6);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class56.field1282.method159(0, 1);
                    if (var24 == 1) {
                        class45.field1006[var3][var22][var23] = class56.field1282.method159(0, 26);
                    } else {
                        class45.field1006[var3][var22][var23] = -1;
                    }
                }
            }
        }
        class56.field1282.method163((byte) 97);
        int var4 = (class76.field1692 - class56.field1282.field2554) / 16;
        class103.field2195 = new int[var4][4];
        for (int var5 = 0; var5 < var4; var5++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class103.field2195[var5][var21] = class56.field1282.method856((byte) -89);
            }
        }
        int var6 = class56.field1282.method878((byte) -121);
        int var7 = class56.field1282.method874(true);
        int var8 = class56.field1282.method893((byte) 76);
        int var9 = class56.field1282.method874(true);
        class27.field573 = new int[var4];
        class109.field2303 = new int[var4];
        class3.field52 = new byte[var4][];
        class68.field1534 = new byte[var4][];
        class109.field2272 = new int[var4];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class45.field1006[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + (var16 / 8);
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class109.field2272[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class109.field2272[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class27.field573[var10] = class7.field101.method942(class68.method537(1, new class28[] { class11.field183, class5.method25(6366, var19), class126.field2736, class5.method25(6366, var20) }), 1);
                            class109.field2303[var10] = class7.field101.method942(class68.method537(1, new class28[] { class56.field1298, class5.method25(6366, var19), class126.field2736, class5.method25(6366, var20) }), 1);
                            var10++;
                        }
                    }
                }
            }
        }
        class18.method108(var2, var8, var7, var9, var6, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBILha;)V")
    public static final void method3(int arg0, byte arg1, int arg2, class43 arg3) {
        field3++;
        if (arg1 >= -70) {
            return;
        }
        if ((arg2 & 0x80) != 0) {
            arg3.field1463 = class56.field1282.method859(7482);
            if (arg3.field1463 == 65535) {
                arg3.field1463 = -1;
            }
        }
        if ((arg2 & 0x40) != 0) {
            int var4 = class56.field1282.method878((byte) -121);
            byte[] var5 = new byte[var4];
            class119 var6 = new class119(var5);
            class56.field1282.method855(0, var4, var5, 10131);
            class78.field1807[arg0] = var6;
            arg3.method345(0, var6);
        }
        if ((arg2 & 0x10) != 0) {
            arg3.field1435 = class56.field1282.method885((byte) -87);
            if (arg3.field1435.method216(0, (byte) 123) == 126) {
                arg3.field1435 = arg3.field1435.method218(1, false);
                class87.method645(-92, arg3.field1435, arg3.field919, 2);
            } else if (class37.field848 == arg3) {
                class87.method645(-12, arg3.field1435, arg3.field919, 2);
            }
            arg3.field1452 = 0;
            arg3.field1497 = 0;
            arg3.field1479 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            int var7 = class56.field1282.method859(7482);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class56.field1282.method878((byte) -121);
            if (arg3.field1505 == var7 && var7 != -1) {
                int var9 = class23.method166(0, var7).field225;
                if (var9 == 1) {
                    arg3.field1498 = 0;
                    arg3.field1434 = 0;
                    arg3.field1467 = 0;
                    arg3.field1482 = var8;
                }
                if (var9 == 2) {
                    arg3.field1434 = 0;
                }
            } else if (var7 == -1 || arg3.field1505 == -1 || class23.method166(0, var7).field229 >= class23.method166(0, arg3.field1505).field229) {
                arg3.field1467 = 0;
                arg3.field1498 = 0;
                arg3.field1434 = 0;
                arg3.field1482 = var8;
                arg3.field1444 = arg3.field1484;
                arg3.field1505 = var7;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field1488 = class56.field1282.method878((byte) -121);
            arg3.field1459 = class56.field1282.method900((byte) 127);
            arg3.field1457 = class56.field1282.method878((byte) -121);
            arg3.field1464 = class56.field1282.method878((byte) -121);
            arg3.field1450 = class56.field1282.method859(7482) + class83.field1888;
            arg3.field1474 = class56.field1282.method893((byte) 102) + class83.field1888;
            arg3.field1475 = class56.field1282.method900((byte) 127);
            arg3.method524((byte) 16);
        }
        if ((arg2 & 0x400) != 0) {
            arg3.field1489 = class56.field1282.method893((byte) 80);
            int var10 = class56.field1282.method882(-115);
            arg3.field1442 = class83.field1888 + (var10 & 0xFFFF);
            arg3.field1476 = 0;
            if (arg3.field1489 == 65535) {
                arg3.field1489 = -1;
            }
            arg3.field1491 = 0;
            arg3.field1473 = var10 >> 16;
            if (arg3.field1442 > class83.field1888) {
                arg3.field1491 = -1;
            }
        }
        if ((arg2 & 0x1) != 0) {
            int var11 = class56.field1282.method859(7482);
            int var12 = class56.field1282.method878((byte) -121);
            int var13 = class56.field1282.method878((byte) -121);
            int var14 = class56.field1282.field2554;
            if (arg3.field919 != null && arg3.field936 != null) {
                long var15 = arg3.field919.method237(240);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class69.field1546; var18++) {
                        if (class5.field92[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class103.field2193 == 0) {
                    class112.field2401.field2554 = 0;
                    class56.field1282.method855(0, var13, class112.field2401.field2531, 10131);
                    class112.field2401.field2554 = 0;
                    class28 var19 = class48.method390(class112.field2401, false).method221(40);
                    arg3.field1479 = 150;
                    arg3.field1452 = var11 >> 8;
                    arg3.field1497 = var11 & 0xFF;
                    arg3.field1435 = var19;
                    if (var12 == 2 || var12 == 3) {
                        class87.method645(123, var19, class68.method537(1, new class28[] { class63.field1394, arg3.field919 }), 1);
                    } else if (var12 == 1) {
                        class87.method645(101, var19, class68.method537(1, new class28[] { class88.field1961, arg3.field919 }), 1);
                    } else {
                        class87.method645(12, var19, arg3.field919, 2);
                    }
                }
            }
            class56.field1282.field2554 = var13 + var14;
        }
        if ((arg2 & 0x200) != 0) {
            int var20 = class56.field1282.method879((byte) 45);
            int var21 = class56.field1282.method879((byte) 45);
            arg3.method525(class83.field1888, var21, var20, (byte) -8);
            arg3.field1455 = class83.field1888 + 300;
            arg3.field1448 = class56.field1282.method900((byte) 127);
            arg3.field1437 = class56.field1282.method878((byte) -121);
        }
        if ((arg2 & 0x20) != 0) {
            int var22 = class56.field1282.method862(-31050);
            int var23 = class56.field1282.method879((byte) 45);
            arg3.method525(class83.field1888, var23, var22, (byte) -8);
            arg3.field1455 = class83.field1888 + 300;
            arg3.field1448 = class56.field1282.method900((byte) 127);
            arg3.field1437 = class56.field1282.method900((byte) 127);
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field1443 = class56.field1282.method859(7482);
            arg3.field1477 = class56.field1282.method893((byte) 65);
        }
    }
}
