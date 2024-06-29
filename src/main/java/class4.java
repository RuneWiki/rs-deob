import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class13 {

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Lec;")
    private static class32 field52 = class73.method594(" is already on your ignore list", true);

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "[I")
    public static int[] field55 = new int[128];

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public static int field68 = 0;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "Lec;")
    private static class32 field54 = class73.method594("Please use a different world)3", true);

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "Lec;")
    public static class32 field63 = field54;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "Lec;")
    private static class32 field67 = class73.method594("Select a world", true);

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "Lec;")
    public static class32 field65 = field67;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Lec;")
    public static class32 field62 = field54;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Lec;")
    public static class32 field64 = class73.method594("headicons_prayer", true);

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "Lec;")
    private static class32 field74 = class73.method594("New User", true);

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "Lec;")
    private static class32 field77 = class73.method594("Your account has been disabled)3", true);

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Lec;")
    public static class32 field73 = field74;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "Lec;")
    public static class32 field70 = class73.method594("Lade Eingabe)2Steuerungsprogramm)3)3)3", true);

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "Lec;")
    public static class32 field59 = field52;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Lec;")
    public static class32 field58 = field77;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "Lec;")
    public static class32 field79 = class73.method594("Lade Sprites )2 ", true);

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lec;")
    public static class32 field69 = class73.method594("headicons_hint", true);

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "Lea;")
    public static class30 field56;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Lea;")
    public static class30 field57;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "Lhb;")
    public static class51 field71;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "Lb;")
    public static class8 field81;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILea;)[Lhb;")
    public static final class51[] method12(int arg0, int arg1, int arg2, class30 arg3) {
        field53++;
        if (class28.method193(arg0, arg3, -308039560, arg1)) {
            if (arg2 != -1) {
                field64 = null;
            }
            return class144.method1086(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljd;I)V")
    public final void method13(class66 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method533(255);
            if (var3 == 0) {
                if (arg1 < 97) {
                    method18(4);
                }
                field60++;
                return;
            }
            this.method14((byte) -114, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILjd;)V")
    private final void method14(byte arg0, int arg1, class66 arg2) {
        if (arg1 == 1) {
            this.field75 = arg2.method532(0);
            this.field66 = arg2.method533(255);
            this.field78 = arg2.method533(255);
        }
        if (arg0 > -54) {
            field71 = null;
        }
        field80++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)I")
    public static final int method15(int arg0, boolean arg1, int arg2) {
        field76++;
        if (arg1) {
            method12(-90, 82, 25, null);
        }
        if (arg2 >= 2) {
            int var3 = method15(arg0 * arg0, false, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            return var3;
        } else if (arg2 == 1) {
            return arg0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZB)V")
    public static final void method16(boolean arg0, byte arg1) {
        field82++;
        class56.field1300 = arg0;
        if (class56.field1300) {
            int var15 = class158.field3614.method532(0);
            int var16 = class158.field3614.method521(55);
            int var17 = class158.field3614.method532(0);
            int var18 = class158.field3614.method519(false);
            class158.field3614.method352(8);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class158.field3614.method353(1, (byte) 69);
                        if (var37 == 1) {
                            class32.field641[var19][var35][var36] = class158.field3614.method353(26, (byte) 69);
                        } else {
                            class32.field641[var19][var35][var36] = -1;
                        }
                    }
                }
            }
            class158.field3614.method356(7);
            int var20 = (class115.field2702 - class158.field3614.field1569) / 16;
            class63.field1455 = new int[var20][4];
            for (int var21 = 0; var21 < var20; var21++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class63.field1455[var21][var34] = class158.field3614.method510(38);
                }
            }
            int var22 = class158.field3614.method525((byte) 116);
            class74.field1748 = new int[var20];
            class27.field483 = new byte[var20][];
            class39.field936 = new int[var20];
            class119.field2843 = new int[var20];
            class142.field3258 = new byte[var20][];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class32.field641[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class39.field936[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                class39.field936[var23] = var30;
                                int var32 = var30 & 0xFF;
                                int var33 = var30 >> 8 & 0xFF;
                                class119.field2843[var23] = class134.field3117.method201(3, class52.method403(new class32[] { class36.field768, class159.method1230(var33, 0), class19.field361, class159.method1230(var32, 0) }, (byte) -20));
                                class74.field1748[var23] = class134.field3117.method201(3, class52.method403(new class32[] { class114.field2671, class159.method1230(var33, 0), class19.field361, class159.method1230(var32, 0) }, (byte) -20));
                                var23++;
                            }
                        }
                    }
                }
            }
            class121.method957(var16, var15, var22, var17, (byte) -128, var18);
        } else {
            int var2 = class158.field3614.method530((byte) 95);
            int var3 = class158.field3614.method519(false);
            int var4 = class158.field3614.method532(0);
            int var5 = (class115.field2702 - class158.field3614.field1569) / 16;
            class63.field1455 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class63.field1455[var6][var14] = class158.field3614.method550((byte) 104);
                }
            }
            int var7 = class158.field3614.method525((byte) 116);
            boolean var8 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && (var3 / 8) == 48) {
                var8 = true;
            }
            int var9 = class158.field3614.method532(0);
            class74.field1748 = new int[var5];
            class142.field3258 = new byte[var5][];
            class27.field483 = new byte[var5][];
            class39.field936 = new int[var5];
            if (var4 / 8 == 48 && var3 / 8 == 148) {
                var8 = true;
            }
            class119.field2843 = new int[var5];
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class39.field936[var10] = var13;
                        class119.field2843[var10] = class134.field3117.method201(3, class52.method403(new class32[] { class36.field768, class159.method1230(var11, 0), class19.field361, class159.method1230(var12, 0) }, (byte) -20));
                        class74.field1748[var10] = class134.field3117.method201(3, class52.method403(new class32[] { class114.field2671, class159.method1230(var11, 0), class19.field361, class159.method1230(var12, 0) }, (byte) -20));
                        var10++;
                    }
                }
            }
            class121.method957(var2, var9, var3, var4, (byte) -128, var7);
        }
        if (arg1 < 85) {
            method16(true, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBII)V")
    public static final void method17(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = -82 / ((-arg1 - 7) / 40);
        if (class70.field1630 != 0 && arg3 != 0 && class143.field3279 < 50) {
            class53.field1196[class143.field3279] = arg0;
            class126.field2925[class143.field3279] = arg3;
            class112.field2628[class143.field3279] = arg2;
            class65.field1510[class143.field3279] = null;
            class114.field2674[class143.field3279] = 0;
            class143.field3279++;
        }
        field61++;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public static void method18(int arg0) {
        field73 = null;
        field79 = null;
        field63 = null;
        field62 = null;
        field58 = null;
        field67 = null;
        field71 = null;
        field70 = null;
        field59 = null;
        field65 = null;
        field64 = null;
        field69 = null;
        field54 = null;
        field81 = null;
        field55 = null;
        field52 = null;
        field74 = null;
        field57 = null;
        field56 = null;
        field77 = null;
        if (arg0 != 0) {
            method17(58, (byte) -101, 123, -102);
        }
    }
}
