import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class106 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lje;")
    public static class67 field2415 = class85.method592(255, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lje;")
    public static class67 field2417 = class85.method592(255, "Angreifen");

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field2419 = new int[4000];

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lje;")
    public static class67 field2418 = class85.method592(255, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lje;")
    public static class67 field2422 = class85.method592(255, "");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lje;")
    public static class67 field2413 = field2422;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lje;")
    public static class67 field2416 = field2422;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lje;")
    public static class67 field2412 = field2422;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lje;")
    public static class67 field2414 = field2422;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lje;")
    public static class67 field2423 = field2422;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lje;")
    public static class67 field2425 = field2422;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lob;")
    public static class99 field2427 = new class99(50);

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Lje;")
    private static class67 field2430 = class85.method592(255, "Your account is already logged in)3");

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lje;")
    public static class67 field2431 = field2430;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[[[B")
    public static byte[][][] field2424;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)I")
    public abstract int method175(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BJ)V")
    public static final void method835(byte arg0, long arg1) {
        field2410++;
        if (arg1 == 0L) {
            return;
        }
        if (class92.field2059 >= 100) {
            class88.method614(class101.field2272, class52.field1030, 58, 0);
            return;
        }
        class67 var3 = class91.method674((byte) -116, arg1).method460(103);
        for (int var4 = 0; var4 < class92.field2059; var4++) {
            if (class14.field244[var4] == arg1) {
                class88.method614(class49.method314(new class67[] { var3, class141.field3200 }, arg0 - 98), class52.field1030, arg0 ^ 0x17, 0);
                return;
            }
        }
        if (arg0 != 98) {
            field2427 = null;
        }
        for (int var5 = 0; var5 < class137.field3087; var5++) {
            if (class107.field2454[var5] == arg1) {
                class88.method614(class49.method314(new class67[] { class24.field434, var3, class50.field955 }, 0), class52.field1030, arg0 ^ 0xA, 0);
                return;
            }
        }
        if (var3.method455(class37.field667.field1854, 18909)) {
            class88.method614(class86.field1910, class52.field1030, arg0 + 2, 0);
            return;
        }
        class14.field244[class92.field2059] = arg1;
        class80.field1768++;
        class68.field1377[class92.field2059++] = class91.method674((byte) -116, arg1);
        class27.field486 = class86.field1899;
        class69.field1399.method285(162, (byte) 64);
        class69.field1399.method656(-97, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Lkc;")
    public static final class72 method836(int arg0, int arg1, int arg2) {
        field2421++;
        class72 var3 = class67.method467((byte) -13, arg1);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1494 == null || var3.field1494.length <= arg0) {
            return null;
        } else {
            if (arg2 != 13) {
                field2419 = null;
            }
            return var3.field1494[arg0];
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
    public static final void method837(boolean arg0, byte arg1) {
        field2426++;
        if (arg1 <= 62) {
            return;
        }
        class79.field1750 = arg0;
        if (!class79.field1750) {
            int var2 = (class155.field3544 - class9.field196.field2043) / 16;
            class142.field3254 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class142.field3254[var3][var14] = class9.field196.method671(-488712568);
                }
            }
            int var4 = class9.field196.method641(255);
            int var5 = class9.field196.method648(22591);
            int var6 = class9.field196.method659(false);
            int var7 = class9.field196.method641(255);
            int var8 = class9.field196.method649(false);
            class152.field3491 = new byte[var2][];
            class25.field464 = new int[var2];
            class42.field802 = new int[var2];
            class67.field1329 = new int[var2];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            class116.field2616 = new byte[var2][];
            if (var7 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class42.field802[var10] = var13;
                        class25.field464[var10] = class98.field2183.method251(0, class49.method314(new class67[] { class52.field1037, class60.method420(var11, 28498), class34.field604, class60.method420(var12, 28498) }, 0));
                        class67.field1329[var10] = class98.field2183.method251(0, class49.method314(new class67[] { class40.field737, class60.method420(var11, 28498), class34.field604, class60.method420(var12, 28498) }, 0));
                        var10++;
                    }
                }
            }
            class158.method1218(var5, var8, var7, var6, var4, 5151);
            return;
        }
        int var15 = class9.field196.method659(false);
        int var16 = class9.field196.method630((byte) -49);
        int var17 = class9.field196.method649(false);
        int var18 = class9.field196.method648(22591);
        class9.field196.method284(false);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class9.field196.method283(8, 1);
                    if (var37 == 1) {
                        class148.field3381[var19][var35][var36] = class9.field196.method283(8, 26);
                    } else {
                        class148.field3381[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class9.field196.method287(94);
        int var20 = (class155.field3544 - class9.field196.field2043) / 16;
        class142.field3254 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class142.field3254[var21][var34] = class9.field196.method646((byte) -52);
            }
        }
        int var22 = class9.field196.method630((byte) -49);
        class67.field1329 = new int[var20];
        class25.field464 = new int[var20];
        class42.field802 = new int[var20];
        class116.field2616 = new byte[var20][];
        class152.field3491 = new byte[var20][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class148.field3381[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class42.field802[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            int var32 = var30 >> 8 & 0xFF;
                            class42.field802[var23] = var30;
                            int var33 = var30 & 0xFF;
                            class25.field464[var23] = class98.field2183.method251(0, class49.method314(new class67[] { class52.field1037, class60.method420(var32, 28498), class34.field604, class60.method420(var33, 28498) }, 0));
                            class67.field1329[var23] = class98.field2183.method251(0, class49.method314(new class67[] { class40.field737, class60.method420(var32, 28498), class34.field604, class60.method420(var33, 28498) }, 0));
                            var23++;
                        }
                    }
                }
            }
        }
        class158.method1218(var15, var17, var18, var16, var22, 5151);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lqa;")
    public static final class112 method838(int arg0, int arg1) {
        field2429++;
        class112 var2 = (class112) class30.field541.method764((long) arg1, arg0 + 11321);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1628.method267((byte) -124, arg1, 9);
        if (arg0 != 12861) {
            field2430 = null;
        }
        class112 var4 = new class112();
        var4.field2541 = arg1;
        if (var3 != null) {
            var4.method894((byte) -71, new class91(var3));
        }
        var4.method885((byte) 106);
        class30.field541.method765((long) arg1, var4, (byte) -63);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
    public static final void method839(int arg0, int arg1) {
        field2420++;
        if (arg1 == -1) {
            return;
        }
        int var2 = -93 % ((arg0 + 27) / 46);
        if (!class99.field2211[arg1]) {
            return;
        }
        class75.field1627.method252(-74, arg1);
        if (class55.field1062[arg1] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class55.field1062[arg1].length; var4++) {
            if (class55.field1062[arg1][var4] != null) {
                if (class55.field1062[arg1][var4].field1546 == 2) {
                    var3 = false;
                } else {
                    class55.field1062[arg1][var4] = null;
                }
            }
        }
        if (var3) {
            class55.field1062[arg1] = null;
        }
        class99.field2211[arg1] = false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method840(byte arg0) {
        field2416 = null;
        field2417 = null;
        field2418 = null;
        field2413 = null;
        field2431 = null;
        field2424 = null;
        field2422 = null;
        int var1 = 25 % ((-arg0 - 57) / 33);
        field2414 = null;
        field2423 = null;
        field2427 = null;
        field2412 = null;
        field2425 = null;
        field2419 = null;
        field2430 = null;
        field2415 = null;
    }
}
