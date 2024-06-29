import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class85 extends class69 {

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[I")
    public static int[] field1153 = new int[100];

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Leg;")
    public static class272 field1163 = new class272(2);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ltl;")
    public static class186 field1156;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient;")
    public static client field1168;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "[I")
    public static int[] field1174;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[[I")
    public static int[][] field1162;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V")
    public static final void method608(boolean arg0, int arg1) {
        int var2 = class70.field969;
        field1154++;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (!arg0) {
            method608(false, -50);
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class235 var20;
            if (arg1 == 0) {
                var20 = class197.field3179;
            } else {
                var20 = class260.field4141[class51.field721[var3]];
            }
            if (var20 != null && var20.method376(-11127)) {
                int var21 = var20.method385((byte) 90);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field614 & 0x7F) == 64 && (var20.field613 & 0x7F) == 64) {
                            int var22 = var20.field614 >> 7;
                            int var23 = var20.field613 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class161.field2616[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field614 & 0x7F) == 0 && (var20.field613 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field614 & 0x7F) == 64 && (var20.field613 & 0x7F) == 64)) {
                        int var24 = var20.field614 - var21 * 64 >> 7;
                        int var25 = var20.field613 - (var21 * 64) >> 7;
                        int var26 = var24 + var20.method385((byte) 121);
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        int var27 = var20.method385((byte) -111) + var25;
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        for (int var28 = var24; var28 < var26; var28++) {
                            for (int var29 = var25; var29 < var27; var29++) {
                                var10002 = class161.field2616[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class235 var7;
            if (arg1 == 0) {
                var5 = 8791798054912L;
                var7 = class197.field3179;
            } else {
                var5 = (long) class51.field721[var4] << 32;
                var7 = class260.field4141[class51.field721[var4]];
            }
            if (var7 != null && var7.method376(-11127)) {
                int var8 = var7.method385((byte) -49);
                if (arg1 == 0 || arg1 == var8) {
                    var7.field651 = true;
                    var7.field3732 = false;
                    if ((class183.field2928 && class70.field969 > 200 || class70.field969 > 50) && arg1 != 0 && var7.field659 == var7.method375(0).field2862) {
                        var7.field3732 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field614 & 0x7F) == 64 && (var7.field613 & 0x7F) == 64) {
                            int var18 = var7.field614 >> 7;
                            int var19 = var7.field613 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class161.field2616[var18][var19] > 1) {
                                var10002 = class161.field2616[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field614 & 0x7F) == 0 && (var7.field613 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field614 & 0x7F) == 64 && (var7.field613 & 0x7F) == 0) {
                        int var9 = var7.field614 - (var8 * 64) >> 7;
                        int var10 = var8 + var9;
                        int var11 = var7.field613 - (var8 * 64) >> 7;
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        int var12 = var11 + var8;
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        boolean var13 = true;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        for (int var14 = var9; var14 < var10; var14++) {
                            for (int var17 = var11; var17 < var12; var17++) {
                                if (class161.field2616[var14][var17] <= 1) {
                                    var13 = false;
                                    break;
                                }
                            }
                        }
                        if (var13) {
                            int var15 = var9;
                            while (true) {
                                if (var10 <= var15) {
                                    continue label217;
                                }
                                for (int var16 = var11; var16 < var12; var16++) {
                                    var10002 = class161.field2616[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var7.field688 == null || class9.field141 < var7.field674 || class9.field141 >= var7.field630) {
                        var7.field651 = false;
                        var7.field643 = class220.method1461(var7.field614, class28.field336, var7.field613, 52);
                        class147.method1004(class28.field336, var7.field614, var7.field613, var7.field643, var8 * 64 + 60 - 64, var7, var7.field657, var5, var7.field616);
                    } else {
                        var7.field651 = false;
                        var7.field3732 = false;
                        var7.field643 = class220.method1461(var7.field614, class28.field336, var7.field613, 92);
                        class262.method1718(class28.field336, var7.field614, var7.field613, var7.field643, var7, var7.field657, var5, var7.field638, var7.field701, var7.field673, var7.field627);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(ZI)V")
    public static final void method609(boolean arg0, int arg1) {
        class219.field3510.method1832(arg1, (byte) 70);
        field1160++;
        if (!arg0) {
            field1163 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1156 = null;
        field1153 = null;
        field1174 = null;
        field1162 = null;
        if (arg0 != -65) {
            method608(false, 93);
        }
        field1168 = null;
        field1163 = null;
    }
}
