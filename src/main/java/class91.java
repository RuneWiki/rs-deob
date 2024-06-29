import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class91 {

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lua;")
    public static class139 field2100 = new class139(5000);

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
    public static boolean field2106 = false;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Laf;")
    public static class7 field2109 = class48.method406(40, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field2108 = 0;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Laf;")
    public static class7 field2103 = class48.method406(40, "Spieler");

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Laf;")
    private static class7 field2105 = class48.method406(40, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Laf;")
    public static class7 field2112 = field2105;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lod;")
    public class101 field2099;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Lod;")
    public class101 field2101;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lod;")
    public class101 field2107;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "[I")
    public static int[] field2113;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[[[B")
    public static byte[][][] field2104;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static final void method735(byte arg0) {
        field2096++;
        for (class130 var1 = (class130) class75.field1738.method758(255); var1 != null; var1 = (class130) class75.field1738.method766(arg0 ^ 0xFFFFFFA3)) {
            if (var1.field3073 == -1) {
                var1.field3091 = 0;
                class116.method904(var1, arg0 - 140);
            } else {
                var1.method1124((byte) 62);
            }
        }
        if (arg0 != 57) {
            method739(108);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static final void method736(byte arg0) {
        if (arg0 > -109) {
            return;
        }
        field2097++;
        while (field2100.method1145(false, class87.field2026) >= 27) {
            int var1 = field2100.method1138(15, false);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class121.field2843[var1] == null) {
                class121.field2843[var1] = new class141();
                var2 = true;
            }
            class141 var3 = class121.field2843[var1];
            class155.field3600[class106.field2615++] = var1;
            var3.field476 = class155.field3611;
            int var4 = field2100.method1138(5, false);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = field2100.method1138(5, false);
            int var6 = class6.field113[field2100.method1138(3, false)];
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var2) {
                var3.field492 = var3.field485 = var6;
            }
            var3.field3323 = class135.method1101(field2100.method1138(14, false), 3215);
            int var7 = field2100.method1138(1, false);
            if (var7 == 1) {
                class21.field537[class98.field2325++] = var1;
            }
            int var8 = field2100.method1138(1, false);
            var3.field466 = var3.field3323.field2252;
            var3.field490 = var3.field3323.field2225;
            var3.field460 = var3.field3323.field2233;
            var3.field454 = var3.field3323.field2240;
            var3.field473 = var3.field3323.field2220;
            var3.field447 = var3.field3323.field2249;
            var3.field472 = var3.field3323.field2255;
            if (var3.field466 == 0) {
                var3.field485 = 0;
            }
            var3.field459 = var3.field3323.field2257;
            var3.field465 = var3.field3323.field2224;
            var3.method178(class21.field531.field493[0] + var5, (byte) -124, class21.field531.field509[0] + var4, var8 == 1);
        }
        field2100.method1134(32381);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method737(byte arg0, Component arg1) {
        field2094++;
        arg1.addMouseListener(class106.field2589);
        arg1.addMouseMotionListener(class106.field2589);
        if (arg0 < 41) {
            field2108 = 95;
        }
        arg1.addFocusListener(class106.field2589);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static void method738(byte arg0) {
        field2105 = null;
        field2104 = null;
        field2112 = null;
        field2113 = null;
        field2109 = null;
        if (arg0 > -75) {
            method738((byte) 89);
        }
        field2103 = null;
        field2100 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method739(int arg0) {
        class47.field1155 = new int[33];
        field2111++;
        class102.field2416 = new int[151];
        class13.field343 = new int[151];
        class64.field1411 = new int[33];
        for (int var1 = arg0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class93.field2184.field2724[class93.field2184.field2723 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class64.field1411[var1] = var6;
            class47.field1155[var1] = var7 - var6;
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 0;
            int var4 = 999;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class93.field2184.field2724[var5 + class93.field2184.field2723 * var2] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var4 == 999) {
                        var4 = var5;
                    }
                } else if (var4 != 999) {
                    var3 = var5;
                    break;
                }
            }
            class102.field2416[var2 - 5] = var4 - 25;
            class13.field343[var2 - 5] = var3 - var4;
        }
    }
}
