import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 extends class119 {

    @OriginalMember(owner = "client!r", name = "M", descriptor = "[I")
    public static int[] field2747 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static volatile int field2742 = -1;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lv;")
    private static class146 field2744 = class159.method1226((byte) -37, "Error loading your profile)3");

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Lv;")
    public static class146 field2745 = field2744;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "Lv;")
    public static class146 field2743 = class159.method1226((byte) -37, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Lv;")
    public static class146 field2754 = class159.method1226((byte) -37, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Lv;")
    public static class146 field2740 = class159.method1226((byte) -37, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!r", name = "X", descriptor = "Lv;")
    public static class146 field2757 = class159.method1226((byte) -37, "scrollbar");

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)V")
    public static final void method900(byte arg0, int arg1, int arg2) {
        class152 var3 = class148.field3434[class148.field3428][arg1][arg2];
        field2741++;
        if (var3 == null) {
            class66.field1496.method1210(class148.field3428, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        class54 var5 = null;
        class54 var6 = (class54) var3.method1138(arg0 ^ 0x64B5);
        if (arg0 != 73) {
            return;
        }
        while (var6 != null) {
            class59 var11 = class73.method524((byte) 103, var6.field1248);
            int var12 = var11.field1374;
            if (var11.field1344 == 1) {
                var12 = (var6.field1251 + 1) * var12;
            }
            if (var12 > var4) {
                var4 = var12;
                var5 = var6;
            }
            var6 = (class54) var3.method1142(1);
        }
        if (var5 == null) {
            class66.field1496.method1210(class148.field3428, arg1, arg2);
            return;
        }
        var3.method1137(arg0 - 71, var5);
        class54 var7 = (class54) var3.method1138(25852);
        class54 var8 = null;
        int var9 = (arg2 << 7) + (arg1 + 1610612736);
        class54 var10 = null;
        while (var7 != null) {
            if (var5.field1248 != var7.field1248) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field1248 != var8.field1248 && var10 == null) {
                    var10 = var7;
                }
            }
            var7 = (class54) var3.method1142(1);
        }
        class66.field1496.method1202(class148.field3428, arg1, arg2, class79.method612(class148.field3428, arg1 * 128 + 64, arg2 * 128 + 64, false), var5, var9, var8, var10);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIII)I")
    public static final int method901(int arg0, int arg1, int arg2, int arg3) {
        field2748++;
        int var4 = arg3 & 0x3;
        if (arg1 >= -60) {
            return 27;
        } else if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILne;I)V")
    private final void method902(int arg0, class95 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2751 = arg1.method795(1);
            this.field2752 = arg1.method790((byte) 73);
            this.field2753 = arg1.method790((byte) 73);
        }
        if (arg0 != -32485) {
            method903((byte) 100);
        }
        field2750++;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Lie;")
    public static final class61 method903(byte arg0) {
        field2746++;
        class61 var1 = new class61();
        var1.field1415 = class67.field1538;
        var1.field1412 = class41.field935[0];
        byte[] var2 = class46.field1063[0];
        var1.field1413 = class122.field2840[0];
        var1.field1414 = class30.field617[0];
        var1.field1410 = class37.field833[0];
        int var3 = var1.field1414 * var1.field1412;
        if (arg0 != -40) {
            return null;
        }
        var1.field1416 = class22.field373;
        var1.field1411 = new int[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1411[var4] = class59.field1358[class90.method711(255, var2[var4])];
        }
        class69.method492(81);
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLne;)V")
    public final void method904(boolean arg0, class95 arg1) {
        if (!arg0) {
            field2747 = null;
        }
        while (true) {
            int var3 = arg1.method790((byte) 73);
            if (var3 == 0) {
                field2758++;
                return;
            }
            this.method902(-32485, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
    public static final void method905(int arg0, int arg1) {
        field2759++;
        if (arg1 != -4) {
            field2743 = null;
        }
        class152.method1140(true);
        class69.method484((byte) 39);
        int var2 = class46.method316(true, arg0).field824;
        if (var2 == 0) {
            return;
        }
        int var3 = class148.field3454[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class45.method305(0.9D);
                ((class49) class45.field1046).method339(arg1 ^ 0x3, 0.9D);
            }
            if (var3 == 2) {
                class45.method305(0.8D);
                ((class49) class45.field1046).method339(-1, 0.8D);
            }
            if (var3 == 3) {
                class45.method305(0.7D);
                ((class49) class45.field1046).method339(arg1 + 3, 0.7D);
            }
            if (var3 == 4) {
                class45.method305(0.6D);
                ((class49) class45.field1046).method339(-1, 0.6D);
            }
            class117.method899(5);
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
            if (class38.field852 != var4) {
                if (class38.field852 == 0 && class141.field3222 != -1) {
                    class119.method908(class141.field3222, 1, var4, 0, class60.field1377, false);
                    class22.field375 = false;
                } else if (var4 == 0) {
                    class100.method831(20096);
                    class22.field375 = false;
                } else {
                    class100.method829((byte) -110, var4);
                }
                class38.field852 = var4;
            }
        }
        if (var2 == 5) {
            class9.field178 = var3;
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class54.field1255 = 127;
            }
            if (var3 == 1) {
                class54.field1255 = 96;
            }
            if (var3 == 2) {
                class54.field1255 = 64;
            }
            if (var3 == 3) {
                class54.field1255 = 32;
            }
            if (var3 == 4) {
                class54.field1255 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class44.field1001 = 127;
            }
            if (var3 == 1) {
                class44.field1001 = 96;
            }
            if (var3 == 2) {
                class44.field1001 = 64;
            }
            if (var3 == 3) {
                class44.field1001 = 32;
            }
            if (var3 == 4) {
                class44.field1001 = 0;
            }
        }
        if (var2 == 9) {
            class125.field2903 = var3;
        }
        if (var2 == 6) {
            class97.field2356 = var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public static void method906(int arg0) {
        field2754 = null;
        field2744 = null;
        field2757 = null;
        field2747 = null;
        field2740 = null;
        field2743 = null;
        if (arg0 != -6) {
            method900((byte) -28, 19, -118);
        }
        field2745 = null;
    }
}
