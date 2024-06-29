import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[S")
    public static short[] field2170 = new short[] { -1, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Z")
    public static volatile boolean field2169 = false;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static volatile int field2173 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lqd;")
    public static class115 field2172 = new class115(100);

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lqd;")
    public static class115 field2175 = new class115(50);

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field2180 = 3353893;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field2184 = -1;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lid;")
    public static class60 field2191 = class11.method72("Die Adresse dieses Computers wurde gesperrt)1", (byte) -37);

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2187 = 50;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "[I")
    public static int[] field2189 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
    public static int[] field2192 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
    public static int[] field2178 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public static int[] field2182 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "F", descriptor = "[S")
    public static short[] field2194 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
    public static int[] field2185 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
    public static int[] field2177 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "B", descriptor = "[I")
    public static int[] field2190 = new int[field2187];

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Lid;")
    public static class60 field2195 = class11.method72("und haben es deaktiviert)3 Klicken Sie auf der", (byte) -38);

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Lid;")
    public static class60 field2196 = class11.method72("Sichtbare Karte vorbereitet)3", (byte) -40);

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[Lid;")
    public static class60[] field2176 = new class60[field2187];

    @OriginalMember(owner = "client!md", name = "I", descriptor = "J")
    public static long field2197 = 0L;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Lfd;")
    public static class40 field2186;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lie;")
    public static class61 field2179;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Z")
    public static boolean field2193;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[I")
    public static int[] field2174;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
    public static int[] field2188;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method721(byte arg0) {
        field2171++;
        if (class61.field1512[98]) {
            class12.field202 += (12 - class12.field202) / 2;
        } else if (class61.field1512[99]) {
            class12.field202 += (-class12.field202 - 12) / 2;
        } else {
            class12.field202 /= 2;
        }
        if (class61.field1512[96]) {
            class15.field352 += (-class15.field352 - 24) / 2;
        } else if (class61.field1512[97]) {
            class15.field352 += (24 - class15.field352) / 2;
        } else {
            class15.field352 /= 2;
        }
        class157.field3590 = class15.field352 / 2 + class157.field3590 & 0x7FF;
        int var1 = class141.field3224 + class107.field2640.field828;
        int var2 = class74.field1788 + class107.field2640.field854;
        if (class10.field175 - var2 < -500 || class10.field175 - var2 > 500 || class45.field1186 - var1 < -500 || class45.field1186 - var1 > 500) {
            class10.field175 = var2;
            class45.field1186 = var1;
        }
        if (class10.field175 != var2) {
            class10.field175 += (var2 - class10.field175) / 16;
        }
        class47.field1248 += class12.field202 / 2;
        if (class47.field1248 < 128) {
            class47.field1248 = 128;
        }
        int var3 = class10.field175 >> 7;
        if (class45.field1186 != var1) {
            class45.field1186 += (var1 - class45.field1186) / 16;
        }
        if (class47.field1248 > 383) {
            class47.field1248 = 383;
        }
        int var4 = class45.field1186 >> 7;
        if (arg0 != -62) {
            field2194 = null;
        }
        int var5 = class50.method381(class46.field1222, class45.field1186, class10.field175, (byte) 10);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class46.field1222;
                    if (var9 < 3 && (class124.field2869[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var5 - class113.field2711[var9][var7][var8];
                    if (var10 > var6) {
                        var6 = var10;
                    }
                }
            }
        }
        int var11 = var6 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class33.field771) {
            class33.field771 += (var11 - class33.field771) / 24;
        } else if (class33.field771 > var11) {
            class33.field771 += (var11 - class33.field771) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method722(int arg0) {
        field2166++;
        int var1 = 0;
        if (arg0 >= -1) {
            method724(-69, false);
        }
        while (class72.field1748 > var1) {
            int var2 = class1.field1[var1];
            class53 var3 = class5.field83[var2];
            if (var3 != null) {
                class144.method1109((byte) 41, var3, var3.field1337.field3463);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method723(int arg0) {
        field2163++;
        if (arg0 != 2) {
            method724(-13, true);
        }
        while (true) {
            class66 var1 = class47.field1243;
            class98 var2;
            synchronized (class47.field1243) {
                var2 = (class98) class66.field1614.method502(-55);
            }
            if (var2 == null) {
                return;
            }
            var2.field2394.method858((byte) 95, false, (int) var2.field2929, var2.field2397, var2.field2407);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)Z")
    public static final boolean method724(int arg0, boolean arg1) {
        if (arg1) {
            method723(74);
        }
        field2165++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method725(byte arg0) {
        field2176 = null;
        field2185 = null;
        field2172 = null;
        field2194 = null;
        field2189 = null;
        field2192 = null;
        field2190 = null;
        field2195 = null;
        field2170 = null;
        field2175 = null;
        field2179 = null;
        field2188 = null;
        field2178 = null;
        field2186 = null;
        field2196 = null;
        field2182 = null;
        field2174 = null;
        field2177 = null;
        if (arg0 == 41) {
            field2191 = null;
        }
    }
}
