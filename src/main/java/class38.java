import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "J")
    public static volatile long field990 = 0L;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Lic;")
    private static class59 field991 = class59.method433(0, "yellow:");

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lic;")
    public static class59 field976 = field991;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[I")
    public static int[] field986 = new int[32];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    public static int[] field973 = new int[50];

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lic;")
    public static class59 field982 = class59.method433(0, "titlebox");

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lic;")
    public static class59 field974 = field991;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lic;")
    public static class59 field992;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lic;")
    private static class59 field994;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Lic;")
    public static class59 field1000;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lic;")
    public static class59 field995;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "Lic;")
    public static class59 field1001;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "Lic;")
    public static class59 field999;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lic;")
    private static class59 field998;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lic;")
    public static class59 field996;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "Lic;")
    public static class59 field997;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ldd;")
    public static class26 field988;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Lmd;")
    public static class87 field993;

    @OriginalMember(owner = "client!fb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field984++;
    }

    @OriginalMember(owner = "client!fb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field987++;
        if (class18.field353 != null) {
            class41.field1056 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class137.field3064.length) {
                var3 = class137.field3064[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class107.field2553 >= 0 && var3 >= 0) {
                class158.field3517[class107.field2553] = ~var3;
                class107.field2553 = class107.field2553 + 1 & 0x7F;
                if (class108.field2606 == class107.field2553) {
                    class107.field2553 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!fb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field980++;
        if (class18.field353 == null) {
            return;
        }
        class41.field1056 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class137.field3064.length) {
            var3 = class137.field3064[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class107.field2553 >= 0 && var3 >= 0) {
            class158.field3517[class107.field2553] = var3;
            class107.field2553 = class107.field2553 + 1 & 0x7F;
            if (class108.field2606 == class107.field2553) {
                class107.field2553 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class46.field1181 + 1 & 0x7F;
            if (class42.field1089 != var4) {
                class85.field2143[class46.field1181] = var3;
                class155.field3364[class46.field1181] = -1;
                class46.field1181 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class18.field353 != null) {
            class107.field2553 = -1;
        }
        field983++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)[Lce;")
    public static final class20[] method290(int arg0) {
        field979++;
        class20[] var1 = new class20[class61.field1565];
        for (int var2 = arg0; var2 < class61.field1565; var2++) {
            class20 var3 = new class20();
            var3.field444 = class5.field105;
            var3.field439 = class100.field2478;
            var3.field438 = class100.field2471[var2];
            var3.field443 = class15.field298[var2];
            var3.field440 = class44.field1120[var2];
            var3.field442 = client.field488[var2];
            var3.field441 = class34.field918;
            var3.field437 = class136.field3037[var2];
            var1[var2] = var3;
        }
        class2.method10(-6);
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method291(int arg0) {
        class42.method320(false, class102.field2492);
        field981++;
        class76.field1870++;
        if (class61.field1556 && class26.field668) {
            int var1 = class145.field3166;
            int var2 = class16.field325;
            int var3 = var2 - class107.field2551;
            if (var3 < class128.field2894) {
                var3 = class128.field2894;
            }
            int var4 = var1 - class75.field1853;
            if (class102.field2492.field3629 + var3 > class128.field2894 + class17.field329.field3629) {
                var3 = class128.field2894 + class17.field329.field3629 - class102.field2492.field3629;
            }
            if (var4 < class55.field1346) {
                var4 = class55.field1346;
            }
            int var5 = class102.field2492.field3551;
            int var6 = class17.field329.field3555 + var3 - class128.field2894;
            int var7 = var3 - class75.field1851;
            if (class55.field1346 + class17.field329.field3549 < var4 - -class102.field2492.field3549) {
                var4 = class17.field329.field3549 + class55.field1346 - class102.field2492.field3549;
            }
            int var8 = var4 - class44.field1129;
            int var9 = var4 + class17.field329.field3538 - class55.field1346;
            if (class102.field2492.field3531 < class76.field1870 && (var5 < var7 || -var5 > var7 || var8 > var5 || var8 < -var5)) {
                class22.field523 = true;
            }
            if (class102.field2492.field3639 != null && class22.field523) {
                class139 var10 = new class139();
                var10.field3103 = var9;
                var10.field3104 = class102.field2492;
                var10.field3090 = var6;
                var10.field3096 = class102.field2492.field3639;
                class125.method948(var10, arg0 - 30163);
            }
            if (~class159.field3667 == arg0) {
                if (class22.field523) {
                    if (class102.field2492.field3654 != null) {
                        class139 var11 = new class139();
                        var11.field3104 = class102.field2492;
                        var11.field3095 = class126.field2864;
                        var11.field3096 = class102.field2492.field3654;
                        var11.field3103 = var9;
                        var11.field3090 = var6;
                        class125.method948(var11, -30164);
                    }
                    if (class126.field2864 != null && class46.method363(class102.field2492, (byte) -74) != null) {
                        class80.field1982++;
                        class125.field2842.method1072(72, -1);
                        class125.field2842.method1198(class102.field2492.field3573, 127);
                        class125.field2842.method1165(arg0 + 44, class126.field2864.field3567);
                        class125.field2842.method1165(66, class102.field2492.field3567);
                        class125.field2842.method1163(class126.field2864.field3573, (byte) 88);
                    }
                } else if ((class134.field2977 == 1 || class83.method681(0, class107.field2557 - 1)) && class107.field2557 > 2) {
                    class24.method166(0);
                } else if (class107.field2557 > 0) {
                    class30.method237(8107, class107.field2557 - 1);
                }
                class102.field2492 = null;
            }
        } else if (class76.field1870 > 1) {
            class102.field2492 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLwd;)Lic;")
    public static final class59 method292(byte arg0, class157 arg1) {
        if (arg0 > -16) {
            method292((byte) 85, null);
        }
        field978++;
        return class147.method1091(32767, arg1, -27783);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method293(byte arg0) {
        field973 = null;
        field999 = null;
        field1001 = null;
        field976 = null;
        field988 = null;
        field974 = null;
        field991 = null;
        field986 = null;
        field995 = null;
        field996 = null;
        field998 = null;
        field992 = null;
        field993 = null;
        field997 = null;
        field994 = null;
        if (arg0 != 99) {
            method293((byte) 121);
        }
        field1000 = null;
        field982 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static final void method294(byte arg0) {
        if (arg0 != 116) {
            return;
        }
        field985++;
        if (class136.field3039 != null || class102.field2492 != null) {
            return;
        }
        int var1 = class41.field1065;
        if (class98.field2440) {
            if (var1 != 1) {
                int var6 = class16.field325;
                int var7 = class145.field3166;
                if (var6 < class159.field3646 - 10 || class159.field3646 + class138.field3081 + 10 < var6 || class128.field2895 - 10 > var7 || class30.field781 + class128.field2895 + 10 < var7) {
                    class98.field2440 = false;
                    class149.method1106(-15412, class30.field781, class138.field3081, class128.field2895, class159.field3646);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class159.field3646;
            int var9 = class138.field3081;
            int var10 = class128.field2895;
            int var11 = class3.field68;
            int var12 = class81.field2005;
            int var13 = -1;
            for (int var14 = 0; var14 < class107.field2557; var14++) {
                int var15 = (class107.field2557 - var14 - 1) * 15 + var10 + 31;
                if (var11 > var8 && var11 < var8 + var9 && var12 > var15 - 13 && var12 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class30.method237(8107, var13);
            }
            class98.field2440 = false;
            class149.method1106(arg0 - 15528, class30.field781, class138.field3081, class128.field2895, class159.field3646);
            return;
        }
        if (var1 == 1 && class107.field2557 > 0) {
            int var2 = class53.field1324[class107.field2557 - 1];
            if (var2 == 32 || var2 == 1 || var2 == 42 || var2 == 48 || var2 == 3 || var2 == 34 || var2 == 30 || var2 == 24 || var2 == 8 || var2 == 16 || var2 == 51 || var2 == 1007) {
                int var3 = class120.field2772[class107.field2557 - 1];
                int var4 = class23.field546[class107.field2557 - 1];
                class159 var5 = class134.method1032(var4, 499749840);
                if (class106.method827(class112.method915(var5, arg0 ^ 0x8642FBD4), (byte) -125) || class79.method652(class112.method915(var5, -2042430560), true)) {
                    class29.field768 = false;
                    class29.field767 = 0;
                    if (class136.field3039 != null) {
                        class42.method320(false, class136.field3039);
                    }
                    class136.field3039 = class134.method1032(var4, arg0 + 499749724);
                    class94.field2409 = var3;
                    class63.field1609 = class81.field2005;
                    class94.field2408 = class3.field68;
                    class42.method320(false, class136.field3039);
                    return;
                }
            }
        }
        if (var1 == 1 && (class134.field2977 == 1 && class107.field2557 > 2 || class83.method681(0, class107.field2557 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class107.field2557 > 0) {
            class30.method237(8107, class107.field2557 - 1);
        }
        if (var1 == 2 && class107.field2557 > 0) {
            class24.method166(0);
            return;
        }
    }

    @OriginalMember(owner = "client!fb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field977++;
        int var2 = class107.method842(arg0, 128);
        if (var2 >= 0) {
            int var3 = class46.field1181 + 1 & 0x7F;
            if (class42.field1089 != var3) {
                class85.field2143[class46.field1181] = -1;
                class155.field3364[class46.field1181] = var2;
                class46.field1181 = var3;
            }
        }
        arg0.consume();
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field986[var1] = var0 - 1;
            var0 += var0;
        }
        field992 = class59.method433(0, "(U3");
        field994 = class59.method433(0, "green:");
        field1000 = class59.method433(0, "");
        field995 = field994;
        field1001 = field994;
        field999 = class59.method433(0, " )2> <col=ffffff>");
        field998 = class59.method433(0, "Loaded wordpack");
        field996 = field1000;
        field997 = field998;
    }
}
