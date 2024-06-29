import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class60 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "[Loa;")
    public static class133[] field1117 = new class133[6];

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Ltg;")
    private static class184 field1118 = class135.method812("Take", 3);

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field1124 = 99;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Ltg;")
    public static class184 field1122 = class135.method812("<col=00ff80>", 3);

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Ltg;")
    private static class184 field1125 = class135.method812("Your profile will be transferred in:", 3);

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Ltg;")
    public static class184 field1119 = field1125;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Ltg;")
    public static class184 field1116 = class135.method812("runes", 3);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Ltg;")
    public static class184 field1113 = field1118;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[S")
    public static short[] field1126 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
    public static int[] field1130 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lpc;")
    public static class144 field1127;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Ljava/awt/Font;")
    public static Font field1112;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static final void method330(byte arg0) {
        class71.field1341 = null;
        class189.field3679 = null;
        class191.field3724 = null;
        class145.field2618 = null;
        class29.field492 = null;
        field1121++;
        class123.field2237 = null;
        class83.field1475 = null;
        class170.field3234 = null;
        if (arg0 == 92) {
            class101.field1865 = null;
            class167.field2987 = null;
            class129.field2327 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method331(boolean arg0) {
        field1128++;
        if (arg0) {
            method336(-30, 0);
        }
        for (int var1 = 0; var1 < class87.field1610; var1++) {
            int var2 = class103.field1881[var1];
            class158 var3 = class52.field948[var2];
            int var4 = class21.field394.method588((byte) -80);
            if ((var4 & 0x10) != 0) {
                var3.field611 = class21.field394.method596(-1);
                var3.field628 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class21.field394.method605(-128);
                int var6 = class21.field394.method605(121);
                var3.method215(class161.field2903, var5, 0, var6);
                var3.field640 = class161.field2903 + 300;
                var3.field601 = class21.field394.method614(0);
            }
            if ((var4 & 0x40) != 0) {
                var3.field653 = class21.field394.method611(false);
                if (var3.field653 == 65535) {
                    var3.field653 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class21.field394.method578((byte) -100);
                int var8 = class21.field394.method614(0);
                var3.method215(class161.field2903, var7, 0, var8);
            }
            if ((var4 & 0x4) != 0) {
                var3.field605 = class21.field394.method611(false);
                var3.field654 = class21.field394.method572(arg0);
            }
            if ((var4 & 0x80) != 0) {
                var3.field619 = class21.field394.method564(58);
                int var9 = class21.field394.method610(1163269216);
                var3.field641 = (var9 & 0xFFFF) + class161.field2903;
                var3.field638 = var9 >> 16;
                if (var3.field619 == 65535) {
                    var3.field619 = -1;
                }
                var3.field607 = 0;
                var3.field660 = 0;
                if (var3.field641 > class161.field2903) {
                    var3.field660 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class21.field394.method590(true);
                int var11 = class21.field394.method605(20);
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var3.field612 == var10 && var10 != -1) {
                    int var12 = class83.method465(var10, -1).field3640;
                    if (var12 == 1) {
                        var3.field662 = 0;
                        var3.field630 = var11;
                        var3.field595 = 0;
                        var3.field600 = 0;
                    }
                    if (var12 == 2) {
                        var3.field662 = 0;
                    }
                } else if (var10 == -1 || var3.field612 == -1 || class83.method465(var10, -1).field3619 >= class83.method465(var3.field612, -1).field3619) {
                    var3.field662 = 0;
                    var3.field600 = 0;
                    var3.field595 = 0;
                    var3.field630 = var11;
                    var3.field642 = var3.field598;
                    var3.field612 = var10;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field2832 = class194.method1233(class21.field394.method572(false), 32137);
                var3.field656 = var3.field2832.field774;
                var3.field604 = var3.field2832.field794;
                var3.field627 = var3.field2832.field769;
                var3.field596 = var3.field2832.field795;
                var3.field636 = var3.field2832.field778;
                var3.field626 = var3.field2832.field761;
                var3.field663 = var3.field2832.field781;
                var3.field651 = var3.field2832.field784;
                var3.field629 = var3.field2832.field797;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ltg;Lvb;Ltg;I)[Lsc;")
    public static final class171[] method332(class184 arg0, class197 arg1, class184 arg2, int arg3) {
        field1120++;
        if (arg3 == 0) {
            int var4 = arg1.method1261(arg2, (byte) 124);
            int var5 = arg1.method1273(arg0, 120, var4);
            return class15.method93((byte) -97, var5, arg1, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method333(int arg0) {
        field1122 = null;
        field1125 = null;
        field1117 = null;
        field1119 = null;
        field1116 = null;
        field1113 = null;
        if (arg0 != 64) {
            method330((byte) 85);
        }
        field1127 = null;
        field1112 = null;
        field1118 = null;
        field1130 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method334(int arg0, int arg1) {
        field1114++;
        if (class101.field1875 == 0) {
            class130.field2362.method484(-157, arg0);
        } else {
            class175.field3325 = arg0;
        }
        if (arg1 >= -29) {
            field1113 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lvb;IIBLvb;)Lna;")
    public static final class124 method335(class197 arg0, int arg1, int arg2, byte arg3, class197 arg4) {
        field1129++;
        if (arg3 > -119) {
            field1126 = null;
        }
        return class94.method542(arg4, -119, arg1, arg2) ? class108.method674(-17820, arg0.method1249((byte) 49, arg1, arg2)) : null;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Lmh;")
    public static final class122 method336(int arg0, int arg1) {
        class122 var2 = (class122) class109.field1968.method773((long) arg0, 1);
        field1115++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2259.method1249((byte) 72, arg0, arg1);
        class122 var4 = new class122();
        var4.field2203 = arg0;
        if (var3 != null) {
            var4.method743(-18448, new class97(var3));
        }
        var4.method741((byte) 45);
        if (var4.field2204 != -1) {
            var4.method734(method336(var4.field2204, 10), arg1 - 9, method336(var4.field2191, arg1));
        }
        if (!class6.field118 && var4.field2190) {
            var4.field2233 = class150.field2683;
            var4.field2193 = null;
            var4.field2226 = 0;
            var4.field2232 = null;
            var4.field2172 = false;
        }
        class109.field1968.method776(var4, (long) arg0, (byte) -26);
        return var4;
    }
}
