import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class82 extends class147 {

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Lsd;")
    public static class74 field982 = new class74(63, 6);

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Ljava/util/Random;")
    public static Random field989 = new Random();

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lec;")
    public static class40 field990 = new class40("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "Z")
    public static boolean field992 = true;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
    public int[] field977;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "[I")
    public int[] field978;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[I")
    public int[] field979;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[Lgj;")
    public class405[] field976;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[Lgj;")
    public class405[] field983;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "[[[B")
    public byte[][][] field985;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 4)
    public static final void method415(boolean arg0) {
        field986++;
        class210 var1 = class160.field1926;
        synchronized (class160.field1926) {
            if (!arg0) {
                class160.field1926.method1169(1076);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I", line = 19)
    public static final int method416(int arg0, int arg1, int arg2) {
        field988++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg0 != 24832) {
            field989 = null;
        }
        if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V", line = 61)
    public static void method417(boolean arg0) {
        if (arg0) {
            method415(false);
        }
        field982 = null;
        field990 = null;
        field989 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 77)
    public static final void method418(int arg0) {
        field987++;
        int var1 = class90.field1130 * 128 + 64;
        int var2 = class233.field3241 * 128 + 64;
        int var3 = class375.method2264(-1547, var2, class100.field1217, var1) - class258.field3729;
        if (class317.field4626 < 100) {
            if (var1 > class58.field734) {
                class58.field734 += (var1 - class58.field734) * class317.field4626 / 1000 + class47.field625;
                if (var1 < class58.field734) {
                    class58.field734 = var1;
                }
            }
            if (class58.field734 > var1) {
                class58.field734 -= class47.field625 + ((class58.field734 - var1) * class317.field4626 / 1000);
                if (var1 > class58.field734) {
                    class58.field734 = var1;
                }
            }
            if (var3 > class427.field6145) {
                class427.field6145 += (var3 - class427.field6145) * class317.field4626 / 1000 + class47.field625;
                if (var3 < class427.field6145) {
                    class427.field6145 = var3;
                }
            }
            if (var3 < class427.field6145) {
                class427.field6145 -= (class427.field6145 - var3) * class317.field4626 / 1000 + class47.field625;
                if (var3 > class427.field6145) {
                    class427.field6145 = var3;
                }
            }
            if (class351.field5047 < var2) {
                class351.field5047 += (var2 - class351.field5047) * class317.field4626 / 1000 + class47.field625;
                if (var2 < class351.field5047) {
                    class351.field5047 = var2;
                }
            }
            if (var2 < class351.field5047) {
                class351.field5047 -= (class351.field5047 - var2) * class317.field4626 / 1000 + class47.field625;
                if (var2 > class351.field5047) {
                    class351.field5047 = var2;
                }
            }
        } else {
            class58.field734 = class90.field1130 * 128 + 64;
            class351.field5047 = class233.field3241 * 128 + 64;
            class427.field6145 = class375.method2264(-1547, class351.field5047, class100.field1217, class58.field734) - class258.field3729;
        }
        int var4 = class19.field255 * 128 + 64;
        int var5 = class88.field1093 * 128 + 64;
        int var6 = class375.method2264(arg0 ^ 0xFFFFD83B, var5, class100.field1217, var4) - class404.field5745;
        int var7 = var4 - class58.field734;
        int var8 = var6 - class427.field6145;
        int var9 = var5 - class351.field5047;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (arg0 != 8654) {
            field990 = null;
        }
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class120.field1490 < var11) {
            class120.field1490 += (var11 - class120.field1490 >> 3) * class41.field501 / 1000 + class282.field4110 << 3;
            if (var11 < class120.field1490) {
                class120.field1490 = var11;
            }
        }
        if (var11 < class120.field1490) {
            class120.field1490 -= (class120.field1490 - var11 >> 3) * class41.field501 / 1000 + class282.field4110 << 3;
            if (class120.field1490 < var11) {
                class120.field1490 = var11;
            }
        }
        int var13 = var12 - class13.field193;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class13.field193 += class41.field501 * var14 / 1000 + class282.field4110 << 3;
            class13.field193 &= 0x3FFF;
        }
        if (var14 < 0) {
            class13.field193 -= -var14 * class41.field501 / 1000 + class282.field4110 << 3;
            class13.field193 &= 0x3FFF;
        }
        int var15 = var12 - class13.field193;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class13.field193 = var12;
        }
        class401.field5718 = 0;
    }
}
