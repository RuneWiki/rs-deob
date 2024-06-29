import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 extends class107 {

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "[Lqc;")
    public class99[] field1344;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field1346 = 0;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field1347 = 0;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lrc;")
    private static class105 field1349 = class43.method374("flash3:", 0);

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lrc;")
    public static class105 field1343 = field1349;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
    public static int field1348 = 0;

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lle;")
    public static class71 field1354 = new class71(64);

    @OriginalMember(owner = "client!ka", name = "qb", descriptor = "Lrc;")
    public static class105 field1359 = class43.method374("Classic", 0);

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lrc;")
    public static class105 field1356 = class43.method374("Nehmen", 0);

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "Lrc;")
    public static class105 field1360 = class43.method374(": ", 0);

    @OriginalMember(owner = "client!ka", name = "tb", descriptor = "Z")
    public static boolean field1362 = false;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "Lrc;")
    private static class105 field1361 = class43.method374("Loaded gamescreen", 0);

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "Lrc;")
    public static class105 field1358 = field1361;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V", line = 16)
    public static final void method484(boolean arg0) {
        class34.method322(-115);
        class85.method708(-125);
        field1342++;
        class37.method343((byte) -12);
        if (arg0) {
            method489(null, null, 108, null);
        }
        class28.method267((byte) 122);
        class36.method337(121);
        client.method210(arg0);
        class72.method613(97);
        class29.method279(false);
        class90.method745(14834);
        class18.method197(2);
        class14.method160(0);
        class55.method417((byte) 46);
        ((class30) class38.field874).method286((byte) -86);
        class60.field1340.method602((byte) -70);
        class106.field2439.method762(-272);
        class55.field1093.method762(-272);
        class31.field737.method762(-272);
        class72.field1589.method762(-272);
        class14.field275.method762(-272);
        class57.field1203.method762(-272);
        class66.field1501.method762(-272);
        class111.field2591.method762(-272);
        class42.field945.method762(-272);
        class90.field2073.method762(-272);
        class130.field3163.method762(-272);
        class126.field3066.method762(-272);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILpb;)V", line = 55)
    public static final void method485(int arg0, class92 arg1) {
        if (arg0 != 16234) {
            method491(true, true);
        }
        class36.field828 = arg1;
        field1353++;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lpb;Lpb;IZ)V", line = 65)
    public class61(class92 arg0, class92 arg1, int arg2, boolean arg3) {
        class3 var5 = new class3();
        int var6 = arg0.method749(0, arg2);
        this.field1344 = new class99[var6];
        int[] var7 = arg0.method763((byte) -32, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class128 var9 = null;
            byte[] var10 = arg0.method766(var7[var8], (byte) -45, arg2);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class128 var12 = (class128) var5.method31(1280); var12 != null; var12 = (class128) var5.method26((byte) 108)) {
                if (var12.field3116 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method752(-106, var11, 0);
                } else {
                    var13 = arg1.method752(-111, 0, var11);
                }
                var9 = new class128(var11, var13);
                var5.method23(1024, var9);
            }
            this.field1344[var7[var8]] = new class99(var10, var9);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V", line = 121)
    public static void method486(boolean arg0) {
        field1358 = null;
        field1361 = null;
        field1360 = null;
        if (!arg0) {
            return;
        }
        field1356 = null;
        field1354 = null;
        field1343 = null;
        field1349 = null;
        field1359 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z", line = 139)
    public final boolean method487(int arg0, int arg1) {
        if (arg1 != 0) {
            method491(false, true);
        }
        field1352++;
        return this.field1344[arg0].field2273;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpb;Lrc;Lrc;I)[Lbd;", line = 153)
    public static final class11[] method488(class92 arg0, class105 arg1, class105 arg2, int arg3) {
        field1351++;
        int var4 = arg0.method753(arg2, 3);
        int var5 = arg0.method765(var4, (byte) -59, arg1);
        if (arg3 != -10) {
            field1360 = null;
        }
        return class100.method809(var5, var4, (byte) -54, arg0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lrc;Lrc;ILpb;)[Leb;", line = 171)
    public static final class27[] method489(class105 arg0, class105 arg1, int arg2, class92 arg3) {
        if (arg2 != 6134) {
            method485(91, null);
        }
        int var4 = arg3.method753(arg1, 3);
        int var5 = arg3.method765(var4, (byte) 114, arg0);
        field1355++;
        return class86.method714(var4, arg3, (byte) -48, var5);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V", line = 198)
    public static final void method490(int arg0, int arg1) {
        class80.method687(-2);
        field1350++;
        int var2 = class57.method459((byte) -39, arg0).field989;
        if (var2 == 0) {
            return;
        }
        int var3 = class16.field337[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class38.method357(0.9D);
                ((class30) class38.field874).method284(0, 0.9D);
            }
            if (var3 == 2) {
                class38.method357(0.8D);
                ((class30) class38.field874).method284(0, 0.8D);
            }
            if (var3 == 3) {
                class38.method357(0.7D);
                ((class30) class38.field874).method284(0, 0.7D);
            }
            if (var3 == 4) {
                class38.method357(0.6D);
                ((class30) class38.field874).method284(arg1 ^ 0x1A, 0.6D);
            }
            class132.method1049((byte) 80);
            class67.field1506 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class116.field2700 != var4) {
                if (class116.field2700 == 0 && class9.field174 != -1) {
                    class96.method797(var4, false, 0, 94, class9.field174, 0, class57.field1203);
                    class60.field1336 = 0;
                } else if (var4 == 0) {
                    class96.method798((byte) -53);
                    class60.field1336 = 0;
                } else {
                    class95.method782(var4, arg1 + 88);
                }
                class116.field2700 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class60.field1341 = 127;
            }
            if (var3 == 1) {
                class60.field1341 = 96;
            }
            if (var3 == 2) {
                class60.field1341 = 64;
            }
            if (var3 == 3) {
                class60.field1341 = 32;
            }
            if (var3 == 4) {
                class60.field1341 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class92.field2152 = 127;
            }
            if (var3 == 1) {
                class92.field2152 = 96;
            }
            if (var3 == 2) {
                class92.field2152 = 64;
            }
            if (var3 == 3) {
                class92.field2152 = 32;
            }
            if (var3 == 4) {
                class92.field2152 = 0;
            }
        }
        if (arg1 != 26) {
            return;
        }
        if (var2 == 9) {
            class121.field2969 = var3;
        }
        if (var2 == 8) {
            class39.field893 = var3;
            class90.field2064 = true;
        }
        if (var2 == 5) {
            class1.field9 = var3;
        }
        if (var2 == 6) {
            class86.field1947 = var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZ)V", line = 365)
    public static final void method491(boolean arg0, boolean arg1) {
        class34.field801 = arg1;
        if (class34.field801) {
            int var15 = class18.field389.method67(0);
            int var16 = class18.field389.method106((byte) -92);
            int var17 = class18.field389.method67(0);
            int var18 = class18.field389.method101(2);
            class18.field389.method790((byte) -76);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class18.field389.method785(205, 1);
                        if (var37 == 1) {
                            class125.field3050[var19][var35][var36] = class18.field389.method785(205, 26);
                        } else {
                            class125.field3050[var19][var35][var36] = -1;
                        }
                    }
                }
            }
            class18.field389.method789((byte) -127);
            int var20 = (class80.field1794 - class18.field389.field143) / 16;
            class104.field2345 = new int[var20][4];
            for (int var21 = 0; var21 < var20; var21++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class104.field2345[var21][var34] = class18.field389.method63(-32);
                }
            }
            int var22 = class18.field389.method103(0);
            class116.field2721 = new byte[var20][];
            class125.field3049 = new int[var20];
            class73.field1606 = new int[var20];
            class23.field568 = new byte[var20][];
            class45.field1016 = new int[var20];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class125.field3050[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class73.field1606[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class73.field1606[var23] = var30;
                                int var32 = var30 >> 8 & 0xFF;
                                int var33 = var30 & 0xFF;
                                class125.field3049[var23] = class14.field275.method753(class108.method878(new class105[] { class35.field814, class75.method637(var32, 8241), class60.field1339, class75.method637(var33, 8241) }, 2867), 3);
                                class45.field1016[var23] = class14.field275.method753(class108.method878(new class105[] { class72.field1597, class75.method637(var32, 8241), class60.field1339, class75.method637(var33, 8241) }, 2867), 3);
                                var23++;
                            }
                        }
                    }
                }
            }
            class58.method471(var15, var17, var18, (byte) 22, var22, var16);
        } else {
            int var2 = class18.field389.method67(0);
            int var3 = class18.field389.method108((byte) -126);
            int var4 = class18.field389.method65(false);
            int var5 = (class80.field1794 - class18.field389.field143) / 16;
            class104.field2345 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class104.field2345[var6][var14] = class18.field389.method87(-3);
                }
            }
            int var7 = class18.field389.method103(0);
            int var8 = class18.field389.method67(0);
            class23.field568 = new byte[var5][];
            class45.field1016 = new int[var5];
            class125.field3049 = new int[var5];
            class73.field1606 = new int[var5];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            class116.field2721 = new byte[var5][];
            if (var2 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class73.field1606[var10] = var13;
                        class125.field3049[var10] = class14.field275.method753(class108.method878(new class105[] { class35.field814, class75.method637(var11, 8241), class60.field1339, class75.method637(var12, 8241) }, 2867), 3);
                        class45.field1016[var10] = class14.field275.method753(class108.method878(new class105[] { class72.field1597, class75.method637(var11, 8241), class60.field1339, class75.method637(var12, 8241) }, 2867), 3);
                        var10++;
                    }
                }
            }
            class58.method471(var7, var2, var3, (byte) 22, var8, var4);
        }
        field1345++;
        if (arg0) {
            method488(null, null, null, 95);
        }
    }
}
