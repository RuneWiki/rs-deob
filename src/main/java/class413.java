import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class413 extends class425 {

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lkn;")
    public class442 field5907 = new class442();

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field5905 = "";

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
    public static boolean field5904 = false;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field5911;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "Ltj;")
    public static class108 field5910;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "Lvj;")
    public static class256 field5909;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "Lt;")
    public static class400 field5912;

    static {
        new class349("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field5911 = new String[] { "en", "de", "fr", "pt", "nl" };
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[[[BIBII)V", line = 5)
    public static final void method2607(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class239.field3528++;
        class450.field6440 = 0;
        for (int var6 = class180.field2546; var6 < class243.field3603; var6++) {
            class74[][] var17 = class385.field5449[var6];
            for (int var18 = class25.field308; var18 < class183.field2589; var18++) {
                for (int var19 = class28.field353; var19 < class441.field6306; var19++) {
                    class74 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class9.field125[var18 + class150.field2249 - class65.field891][var19 + class150.field2249 - class333.field4842] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field972 = true;
                            var20.field962 = true;
                            if (var20.field970 == null) {
                                var20.field973 = false;
                            } else {
                                var20.field973 = true;
                            }
                            class450.field6440++;
                        } else {
                            var20.field972 = false;
                            var20.field962 = false;
                            var20.field959 = 0;
                            if (var18 >= class65.field891 - 16 && var18 <= class65.field891 + 16 && var19 >= class333.field4842 - 16 && var19 <= class333.field4842 + 16 && (var20.field975 != null || var20.field977 != null || var20.field967 != null || var20.field976 != null || var20.field969 != null || var20.field970 != null)) {
                                class312.field4615.method1919(121, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class439.field6280 == class241.field3567;
        for (int var8 = class180.field2546; var8 < class243.field3603; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class294.field4251.method864() && var8 >= arg2 && arg1 != null) {
                int var10 = class9.field125.length;
                if (class9.field125.length + class25.field308 > class394.field5548) {
                    var10 -= class9.field125.length + class25.field308 - class394.field5548;
                }
                int var11 = class9.field125[0].length;
                if (class9.field125[0].length + class28.field353 > class407.field5751) {
                    var11 -= class9.field125[0].length + class28.field353 - class407.field5751;
                }
                int var12 = class57.field761;
                while (true) {
                    if (var12 >= var10) {
                        class312.field4615.method1911(var9, (byte) -118, var8, true, class439.field6280[var8]);
                        break;
                    }
                    int var13 = class25.field308 + var12 - class57.field761;
                    for (int var14 = class365.field5221; var14 < var11; var14++) {
                        class213.field3013[var12][var14] = false;
                        if (class9.field125[var12][var14]) {
                            int var15 = class28.field353 + var14 - class365.field5221;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class385.field5449[var16][var13][var15] != null && class385.field5449[var16][var13][var15].field961 == var8) {
                                    class213.field3013[var12][var14] = class385.field5449[var16][var13][var15].field972;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class312.field4615.method1911(var9, (byte) -118, var8, false, class439.field6280[var8]);
            }
            class312.field4615.method1913(true);
        }
        if (!class407.method2568(true)) {
            class407.method2568(false);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLvq;)V", line = 145)
    public static final void method2608(byte arg0, class269 arg1) {
        if (arg0 != 69) {
            method2609(87);
        }
        field5903++;
        int var2 = class129.field1832;
        int var3 = class352.field5116;
        int var4 = class264.field3882;
        int var5 = class291.field4227;
        int var6 = -10660793;
        arg1.method1832(var2, var6, var4, 1, var3, var5);
        arg1.method1832(var2 + 1, -16777216, var4 + -2, 1, var3 + 1, 16);
        arg1.method1837(var3 + 18, var5 + -19, var4 - 2, -16777216, (byte) -106, var2 + 1);
        class154.field2285.method2197(var6, -1, var2 + 3, (byte) -105, class190.field2725.method2284((byte) 96, class309.field4497), var3 + 14);
        int var7 = class270.field3949.method536(0);
        int var8 = class270.field3949.method543(7);
        int var9 = 0;
        for (class382 var10 = (class382) class228.field3392.method2752(-115); var10 != null; var10 = (class382) class228.field3392.method2754(-1)) {
            int var11 = (class381.field5412 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && (var2 + var4) > var7 && var8 > var11 - 13 && (var11 + 3) > var8) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class411.method2601(-3, var10.field5420)) {
                var13 = class167.method1202(true, (int) var10.field5421).field5807;
            } else if (class126.method762(var10.field5420, false)) {
                class446 var14 = class442.field6317[(int) var10.field5421];
                if (var14 != null) {
                    var13 = var14.field6375.field4985;
                }
            } else if (class204.method1426(var10.field5420, false)) {
                if (var10.field5420 == 1004) {
                    var13 = class398.method2496(arg0 - 182, (int) var10.field5421).field4073;
                } else {
                    var13 = class398.method2496(-120, (int) (var10.field5421 >>> 32 & 0x7FFFFFFFL)).field4073;
                }
            }
            String var15 = class239.method1631((byte) 28, var10);
            if (var13 != null) {
                var15 = var15 + class291.method1971(41, var13);
            }
            class154.field2285.method2196(var11, var2 + 3, class376.field5361, class110.field1426, -2401, var12, var15, 0);
            var9++;
        }
        class401.method2516(class129.field1832, class264.field3882, false, class352.field5116, class291.field4227);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 232)
    public static void method2609(int arg0) {
        field5905 = null;
        field5910 = null;
        field5912 = null;
        field5909 = null;
        field5911 = null;
        if (arg0 < 4) {
            field5905 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V", line = 252)
    public static final void method2610(byte arg0, int arg1) {
        class334.field4849 = arg1;
        int var2 = -115 / ((arg0 - 4) / 47);
        class385.field5445 = 100;
        field5908++;
        class166.field2377 = 3;
        class252.field3743 = -1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V", line = 265)
    public static final void method2611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -42) {
            return;
        }
        for (class13 var5 = (class13) class266.field3900.method2752(-110); var5 != null; var5 = (class13) class266.field3900.method2754(-1)) {
            class85.method503(arg4, arg2, -81, var5, arg3, arg0);
        }
        field5906++;
        for (class13 var6 = (class13) class433.field6188.method2752(-80); var6 != null; var6 = (class13) class433.field6188.method2754(-1)) {
            byte var11 = 1;
            class3 var12 = var6.field200.method2093(-1498200479);
            if (var6.field200.field4513) {
                var11 = 0;
            } else if (var6.field200.field4537 == var12.field23 || var6.field200.field4537 == var12.field31 || var6.field200.field4537 == var12.field33 || var6.field200.field4537 == var12.field51) {
                var11 = 2;
            } else if (var6.field200.field4537 == var12.field59 || var6.field200.field4537 == var12.field44 || var6.field200.field4537 == var12.field18 || var6.field200.field4537 == var12.field66) {
                var11 = 3;
            }
            if (var6.field204 != var11) {
                int var13 = class185.method1325((byte) -65, var6.field200);
                if (var6.field188 != var13) {
                    if (var6.field178 != null) {
                        class378.field5380.method2296(var6.field178);
                        var6.field178 = null;
                    }
                    var6.field188 = var13;
                }
                var6.field204 = var11;
            }
            var6.field181 = var6.field200.field4463;
            var6.field180 = var6.field200.field4463 + var6.field200.method773((byte) 124) * 64;
            var6.field191 = var6.field200.field4466;
            var6.field199 = var6.field200.field4466 + var6.field200.method773((byte) 108) * 64;
            class85.method503(arg4, arg2, -122, var6, arg3, arg0);
        }
        for (class13 var7 = (class13) class96.field1233.method1383(-113); var7 != null; var7 = (class13) class96.field1233.method1378((byte) 98)) {
            byte var8 = 1;
            class3 var9 = var7.field194.method2093(-1498200479);
            if (var7.field194.field4513) {
                var8 = 0;
            } else if (var7.field194.field4537 == var9.field23 || var7.field194.field4537 == var9.field31 || var7.field194.field4537 == var9.field33 || var7.field194.field4537 == var9.field51) {
                var8 = 2;
            } else if (var7.field194.field4537 == var9.field59 || var7.field194.field4537 == var9.field44 || var7.field194.field4537 == var9.field18 || var7.field194.field4537 == var9.field66) {
                var8 = 3;
            }
            if (var7.field204 != var8) {
                int var10 = class6.method26(var7.field194, 9251);
                if (var7.field188 != var10) {
                    if (var7.field178 != null) {
                        class378.field5380.method2296(var7.field178);
                        var7.field178 = null;
                    }
                    var7.field188 = var10;
                }
                var7.field204 = var8;
            }
            var7.field181 = var7.field194.field4463;
            var7.field180 = var7.field194.field4463 + var7.field194.method773((byte) 99) * 64;
            var7.field191 = var7.field194.field4466;
            var7.field199 = var7.field194.field4466 + (var7.field194.method773((byte) 62) * 64);
            class85.method503(arg4, arg2, -33, var7, arg3, arg0);
        }
    }
}
