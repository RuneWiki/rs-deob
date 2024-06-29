import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class8 extends class180 {

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field141 = -1;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "Ltm;")
    public static class112 field153 = new class112("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "Ltm;")
    public static class112 field168 = new class112("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!tr", name = "W", descriptor = "Lcs;")
    public static class351 field172 = new class351(65, 4);

    @OriginalMember(owner = "client!tr", name = "Y", descriptor = "I")
    public static int field174 = 100;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "Lcu;")
    public class144 field156;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "Lwc;")
    public static class161 field169;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "Ldp;")
    public class204 field160;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Llc;")
    public class263 field147;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "Lrl;")
    public class305 field155;

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "Lfc;")
    public static class343 field167;

    @OriginalMember(owner = "client!tr", name = "X", descriptor = "[I")
    public static int[] field173;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "[Ldh;")
    public static class269[] field166;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)V")
    public static final void method92(int arg0, boolean arg1) {
        if (arg0 != -128) {
            return;
        }
        field151++;
        while (class388.field5458.method807(class7.field136, (byte) -111) >= 15) {
            int var2 = class388.field5458.method801((byte) -87, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class256.field3581[var2] == null) {
                class256.field3581[var2] = new class196();
                var3 = true;
                class256.field3581[var2].field1119 = var2;
            }
            class196 var4 = class256.field3581[var2];
            class42.field718[class32.field520++] = var2;
            var4.field1090 = class356.field4972;
            if (var4.field2789 != null && var4.field2789.method776(arg0 ^ 0xFFFFFF80)) {
                class7.method87(-125, var4);
            }
            int var5 = class388.field5458.method801((byte) -87, 1);
            if (var5 == 1) {
                class454.field6278[class477.field6744++] = var2;
            }
            var4.method1248(class467.field6550.method1359(class388.field5458.method801((byte) -87, 14), true), -2);
            int var6 = class388.field5458.method801((byte) -87, 2);
            int var7;
            if (arg1) {
                var7 = class388.field5458.method801((byte) -87, 8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = class388.field5458.method801((byte) -87, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8;
            if (arg1) {
                var8 = class388.field5458.method801((byte) -87, 8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class388.field5458.method801((byte) -87, 5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = (class388.field5458.method801((byte) -87, 3) + 4 & 0xC8E00007) << 11;
            int var10 = class388.field5458.method801((byte) -87, 1);
            var4.method506(arg0 + 64, var4.field2789.field1786);
            var4.field1063 = var4.field2789.field1806 << 3;
            if (var4.field1063 == 0) {
                var4.method511(arg0 ^ 0x3829, 0);
            } else if (var3) {
                var4.method511(-14423, var9);
            }
            var4.method1251(var4.method206(arg0 ^ 0xFFFFFF80), class2.field21.field1140[0] + var8, var6, (byte) 78, var10 == 1, class2.field21.field1144[0] + var7);
            if (var4.field2789.method776(0)) {
                class167.method1024((class23) null, var4, 128, var4.field6766, var4.field1144[0], 0, (class475) null, var4.field1140[0]);
            }
        }
        class388.field5458.method806((byte) -56);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static final void method93(byte arg0) {
        field145++;
        if (class479.field6783 != null) {
            return;
        }
        class479.field6783 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 120 % ((-arg0 - 1) / 46);
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) ((var4 & 0xFCB7) >> 10) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if ((var9 < 0.5D)) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - var7 * var9;
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if ((var5 * 6.0D < 1.0D)) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if (var5 * 2.0D < 1.0D) {
                    var13 = var17;
                } else if ((var5 * 3.0D < 2.0D)) {
                    var13 = (0.6666666666666666D - var5) * (var17 - var19) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var21 * 6.0D < 1.0D) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if ((var21 * 2.0D < 1.0D)) {
                    var11 = var17;
                } else if ((var21 * 3.0D < 2.0D)) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if (var25 < 0.0D) {
                    var25++;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if (var25 * 2.0D < 1.0D) {
                    var15 = var17;
                } else if ((var25 * 3.0D < 2.0D)) {
                    var15 = (var17 - var19) * (0.6666666666666666D - var25) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var1);
            double var29 = Math.pow(var13, var1);
            double var31 = Math.pow(var15, var1);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class479.field6783[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public static final void method94(int arg0, int arg1) {
        field164++;
        if (class478.field6764 == arg0) {
            return;
        }
        if (class478.field6764 == 0) {
            class30.method243(82);
        }
        if (arg0 == 40) {
            class115.method730(1);
        }
        if (arg0 != 40 && class381.field5410 != null) {
            class381.field5410.method2632(32214);
            class381.field5410 = null;
        }
        if (class478.field6764 == 25 || class478.field6764 == 28) {
            class63.field969.field4693 = 2;
            class475.field6725.field4693 = 2;
            class454.field6275.field4693 = 2;
            class357.field4988.field4693 = 2;
            class47.field763.field4693 = 2;
            class460.field6480.field4693 = 2;
            class254.field3551.field4693 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class314.field4262 = 1;
            class181.field2626 = 0;
            class455.field6292 = 0;
            class198.field2842 = 0;
            class228.field3233 = 1;
            class432.method2527(20809, true);
            class63.field969.field4693 = 1;
            class475.field6725.field4693 = 1;
            class454.field6275.field4693 = 1;
            class357.field4988.field4693 = 1;
            class47.field763.field4693 = 1;
            class460.field6480.field4693 = 1;
            class254.field3551.field4693 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class181.method1188((byte) 78);
        }
        if (arg0 == 5) {
            class154.method939((byte) -75, class120.field1685, class338.field4636);
        } else {
            class82.method564((byte) -103);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        int var3 = -22 % ((arg1 - 65) / 38);
        boolean var4 = class478.field6764 == 5 || class478.field6764 == 10 || class478.field6764 == 28;
        if (var4 != var2) {
            if (var2) {
                class282.field3867 = class456.field6307;
                if (class47.field766 == 0) {
                    class310.method1875(2, -7);
                } else {
                    class202.method1288(-1, 255, false, class101.field1440, 2, 0, class456.field6307);
                }
                class374.field5299.method2763(false, (byte) -69);
            } else {
                class310.method1875(2, -7);
                class374.field5299.method2763(true, (byte) -76);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class338.field4636.method1066();
        }
        class478.field6764 = arg0;
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V")
    public static void method95(int arg0) {
        field166 = null;
        field153 = null;
        field169 = null;
        field172 = null;
        field173 = null;
        field168 = null;
        if (arg0 != 19159) {
            field172 = null;
        }
        field167 = null;
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V")
    public final void method96(byte arg0) {
        this.field147 = null;
        field165++;
        if (arg0 != -123) {
            this.method96((byte) 120);
        }
        this.field155 = null;
        this.field156 = null;
        this.field160 = null;
    }
}
