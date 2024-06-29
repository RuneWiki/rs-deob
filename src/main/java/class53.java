import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class53 {

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Le;")
    public static class191 field960 = class54.method368("blaugr-Un:", 2047);

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lci;")
    public static class162 field963 = new class162(5000);

    @OriginalMember(owner = "client!g", name = "j", descriptor = "[I")
    public static int[] field966 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[I")
    public static int[] field967 = new int[256];

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Z")
    public static boolean field968 = false;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
    public static final void method357(int arg0, byte arg1, int arg2) {
        class158.field2680[arg2] = arg0;
        class240 var3 = (class240) class156.field2666.method612((long) arg2, true);
        if (var3 == null) {
            class240 var4 = new class240(4611686018427387905L);
            class156.field2666.method605((long) arg2, -3, var4);
        } else if (var3.field4272 != 4611686018427387905L) {
            var3.field4272 = class27.method198((byte) -118) + 500L | 0x4000000000000000L;
        }
        field959++;
        int var5 = 81 % ((arg1 + 37) / 53);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIZ[[[Lnd;)Z")
    public static final boolean method358(int arg0, int arg1, int arg2, int arg3, boolean arg4, class199[][][] arg5) {
        field957++;
        byte var6 = arg4 ? 1 : (byte) (class182.field3131 & 0xFF);
        if (class137.field2301[class261.field4598][arg2][arg1] == var6) {
            return false;
        } else if ((class270.field4755[class261.field4598][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class19.field256[var7] = arg2;
            int var32 = var7 + 1;
            class196.field3502[var7] = arg1;
            class137.field2301[class261.field4598][arg2][arg1] = var6;
            while (var32 != var8) {
                int var10 = class19.field256[var8] & 0xFFFF;
                int var11 = (class19.field256[var8] & 0xFF0ED5) >> 16;
                int var12 = class196.field3502[var8] & 0xFFFF;
                int var13 = class19.field256[var8] >> 24 & 0xFF;
                int var14 = (class196.field3502[var8] & 0xFF2BBE) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                boolean var16 = false;
                if ((class270.field4755[class261.field4598][var10][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label225: for (int var17 = class261.field4598 + 1; var17 <= 3; var17++) {
                    if ((class270.field4755[var17][var10][var12] & 0x8) == 0) {
                        if (var15 && arg5[var17][var10][var12] != null) {
                            if (arg5[var17][var10][var12].field3535 != null) {
                                int var20 = class16.method121(8, var11);
                                if (arg5[var17][var10][var12].field3535.field4502 == var20 || arg5[var17][var10][var12].field3535.field4495 == var20) {
                                    continue;
                                }
                                if (var13 != 0) {
                                    int var21 = class16.method121(8, var13);
                                    if (arg5[var17][var10][var12].field3535.field4502 == var21 || arg5[var17][var10][var12].field3535.field4495 == var21) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var22 = class16.method121(8, var14);
                                    if (arg5[var17][var10][var12].field3535.field4502 == var22 || arg5[var17][var10][var12].field3535.field4495 == var22) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var17][var10][var12].field3549 != null) {
                                for (int var23 = 0; var23 < arg5[var17][var10][var12].field3550; var23++) {
                                    int var24 = (int) (arg5[var17][var10][var12].field3549[var23].field136 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = (int) (arg5[var17][var10][var12].field3549[var23].field136 >> 20 & 0x3L);
                                    int var26 = var25 << 6 | var24;
                                    if (var11 == var26 || var13 != 0 && var13 == var26 || var14 != 0 && var14 == var26) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        class199 var27 = arg5[var17][var10][var12];
                        var16 = true;
                        if (var27 != null && var27.field3550 > 0) {
                            for (int var28 = 0; var28 < var27.field3550; var28++) {
                                class12 var29 = var27.field3549[var28];
                                if (var29.field152 != var29.field146 || var29.field150 != var29.field144) {
                                    for (int var30 = var29.field152; var30 <= var29.field146; var30++) {
                                        for (int var31 = var29.field144; var31 <= var29.field150; var31++) {
                                            class137.field2301[var17][var30][var31] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class137.field2301[var17][var10][var12] = var6;
                    }
                }
                if (var16) {
                    if (class25.field362[arg3] < class12.field143[class261.field4598 + 1][var10][var12]) {
                        class25.field362[arg3] = class12.field143[class261.field4598 + 1][var10][var12];
                    }
                    int var18 = var10 << 7;
                    if (var18 < class223.field3976[arg3]) {
                        class223.field3976[arg3] = var18;
                    } else if (class157.field2674[arg3] < var18) {
                        class157.field2674[arg3] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class82.field1386[arg3]) {
                        class82.field1386[arg3] = var19;
                    } else if (var19 > class232.field4150[arg3]) {
                        class232.field4150[arg3] = var19;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class137.field2301[class261.field4598][var10 - 1][var12] != var6) {
                        class19.field256[var32] = class217.method1476(class217.method1476(1179648, var10 - 1), -754974720);
                        class196.field3502[var32] = class217.method1476(var12, 1245184);
                        var32 = var32 + 1 & 0xFFF;
                        class137.field2301[class261.field4598][var10 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var10 - 1) >= 0 && class137.field2301[class261.field4598][var10 - 1][var12] != var6 && (class270.field4755[class261.field4598][var10][var12] & 0x4) == 0 && (class270.field4755[class261.field4598][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class19.field256[var32] = class217.method1476(1375731712, class217.method1476(var10 - 1, 1179648));
                            class196.field3502[var32] = class217.method1476(var12, 1245184);
                            var32 = var32 + 1 & 0xFFF;
                            class137.field2301[class261.field4598][var10 - 1][var12] = var6;
                        }
                        if (class137.field2301[class261.field4598][var10][var12] != var6) {
                            class19.field256[var32] = class217.method1476(318767104, class217.method1476(var10, 5373952));
                            class196.field3502[var32] = class217.method1476(5439488, var12);
                            var32 = var32 + 1 & 0xFFF;
                            class137.field2301[class261.field4598][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class137.field2301[class261.field4598][var10 + 1][var12] != var6 && (class270.field4755[class261.field4598][var10][var12] & 0x4) == 0 && (class270.field4755[class261.field4598][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class19.field256[var32] = class217.method1476(-1845493760, class217.method1476(var10 + 1, 5373952));
                            class196.field3502[var32] = class217.method1476(var12, 5439488);
                            class137.field2301[class261.field4598][var10 + 1][var12] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var10 + 1 < 104 && class137.field2301[class261.field4598][var10 + 1][var12] != var6) {
                        class19.field256[var32] = class217.method1476(class217.method1476(var10 + 1, 9568256), 1392508928);
                        class196.field3502[var32] = class217.method1476(var12, 9633792);
                        class137.field2301[class261.field4598][var10 + 1][var12] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var10 - 1) >= 0 && class137.field2301[class261.field4598][var10 - 1][var12] != var6 && (class270.field4755[class261.field4598][var10][var12] & 0x4) == 0 && (class270.field4755[class261.field4598][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class19.field256[var32] = class217.method1476(class217.method1476(13762560, var10 - 1), 301989888);
                            class196.field3502[var32] = class217.method1476(13828096, var12);
                            var32 = var32 + 1 & 0xFFF;
                            class137.field2301[class261.field4598][var10 - 1][var12] = var6;
                        }
                        if (class137.field2301[class261.field4598][var10][var12] != var6) {
                            class19.field256[var32] = class217.method1476(class217.method1476(13762560, var10), -1828716544);
                            class196.field3502[var32] = class217.method1476(13828096, var12);
                            var32 = var32 + 1 & 0xFFF;
                            class137.field2301[class261.field4598][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && class137.field2301[class261.field4598][var10 + 1][var12] != var6 && (class270.field4755[class261.field4598][var10][var12] & 0x4) == 0 && (class270.field4755[class261.field4598][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class19.field256[var32] = class217.method1476(class217.method1476(9568256, var10 + 1), -771751936);
                            class196.field3502[var32] = class217.method1476(var12, 9633792);
                            var32 = var32 + 1 & 0xFFF;
                            class137.field2301[class261.field4598][var10 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class25.field362[arg3] != -1000000) {
                class25.field362[arg3] += 10;
                class223.field3976[arg3] -= 50;
                class157.field2674[arg3] += 50;
                class232.field4150[arg3] += 50;
                class82.field1386[arg3] -= 50;
            }
            int var9 = 26 % ((-arg0 - 35) / 44);
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method359(int arg0) {
        if (arg0 >= -40) {
            method360(34, (byte) 9);
        }
        field960 = null;
        field966 = null;
        field967 = null;
        field963 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
    public static final void method360(int arg0, byte arg1) {
        field958++;
        if (arg1 == -28) {
            class241 var2 = class14.method97(3, arg0, -126);
            var2.method1691(0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)[Lli;")
    public static final class155[] method361(byte arg0) {
        field961++;
        class155[] var1 = new class155[class232.field4145];
        if (arg0 != -110) {
            method362(-82);
        }
        for (int var2 = 0; var2 < class232.field4145; var2++) {
            byte[] var3 = class161.field2731[var2];
            int var4 = class68.field1183[var2] * class47.field842[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class19.field261[class167.method1128(255, var3[var6])];
            }
            var1[var2] = new class155(class36.field661, class3.field22, class253.field4489[var2], class245.field4360[var2], class68.field1183[var2], class47.field842[var2], var5);
        }
        class228.method1628((byte) 0);
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)[Lc;")
    public static final class60[] method362(int arg0) {
        field965++;
        class60[] var1 = new class60[class232.field4145];
        for (int var2 = 0; var2 < class232.field4145; var2++) {
            var1[var2] = new class60(class36.field661, class3.field22, class253.field4489[var2], class245.field4360[var2], class68.field1183[var2], class47.field842[var2], class161.field2731[var2], class19.field261);
        }
        class228.method1628((byte) 0);
        return arg0 == 9568256 ? var1 : null;
    }
}
