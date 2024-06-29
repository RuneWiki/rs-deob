import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class19 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lad;")
    public static class5 field507 = class88.method674("Abbrechen", -81);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lad;")
    private static class5 field515 = class88.method674("glow2:", -101);

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lad;")
    public static class5 field511 = class88.method674("mapmarker", -114);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lad;")
    public static class5 field508 = class88.method674("_", 76);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lad;")
    public static class5 field509 = class88.method674("backvmid1", -110);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lad;")
    public static class5 field517 = class88.method674("blinken1:", 29);

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lad;")
    public static class5 field516 = field515;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lad;")
    public static class5 field518 = class88.method674("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen", 99);

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Z")
    public static boolean field513 = false;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "J")
    public static long field512;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lv;")
    public static class126 field522;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 12)
    public static final void method157(byte arg0) {
        field514++;
        int var1 = class135.field3263.method1007(class9.field309);
        for (int var2 = 0; var2 < class4.field145; var2++) {
            int var10 = class135.field3263.method1006(class121.field3008[var2]);
            if (var10 > var1) {
                var1 = var10;
            }
        }
        if (arg0 < 73) {
            method158(false);
        }
        var1 += 8;
        int var3 = class4.field145 * 15 + 21;
        if (class4.field124 > 4 && class104.field2524 > 4 && class4.field124 < 516 && class104.field2524 < 338) {
            class128.field3069 = true;
            class89.field2103 = 0;
            class98.field2371 = var1;
            class9.field310 = class4.field145 * 15 + 22;
            int var4 = class4.field124 - var1 / 2 - 4;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            int var5 = class104.field2524 - 4;
            class43.field1102 = var4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class88.field2054 = var5;
        }
        if (class4.field124 > 553 && class104.field2524 > 205 && class4.field124 < 743 && class104.field2524 < 466) {
            class9.field310 = class4.field145 * 15 + 22;
            class128.field3069 = true;
            int var6 = class104.field2524 - 205;
            if (var6 < 0) {
                var6 = 0;
            } else if (var3 + var6 > 261) {
                var6 = 261 - var3;
            }
            class89.field2103 = 1;
            int var7 = class4.field124 - var1 / 2 - 553;
            class88.field2054 = var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var1 + var7 > 190) {
                var7 = 190 - var1;
            }
            class43.field1102 = var7;
            class98.field2371 = var1;
        }
        if (class4.field124 <= 17 || class104.field2524 <= 357 || class4.field124 >= 496 || class104.field2524 >= 453) {
            return;
        }
        class128.field3069 = true;
        class89.field2103 = 2;
        class98.field2371 = var1;
        class9.field310 = class4.field145 * 15 + 22;
        int var8 = class4.field124 - var1 / 2 - 17;
        int var9 = class104.field2524 - 357;
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class43.field1102 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class88.field2054 = var9;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 132)
    public static void method158(boolean arg0) {
        field516 = null;
        field511 = null;
        field518 = null;
        field507 = null;
        field515 = null;
        field509 = null;
        field517 = null;
        field508 = null;
        field522 = null;
        if (!arg0) {
            field508 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BII)Z", line = 194)
    public static final boolean method159(int arg0, byte[] arg1, int arg2, int arg3) {
        field506++;
        if (arg3 != 9936) {
            return true;
        }
        int var4 = -1;
        boolean var5 = true;
        class39 var6 = new class39(arg1);
        label69: while (true) {
            int var7 = var6.method328((byte) 85);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            var4 += var7;
            boolean var9 = false;
            while (true) {
                int var12;
                class70 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method328((byte) 85);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var6.method330(-30864);
                                    }
                                    int var10 = var6.method328((byte) 85);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var6.method330(-30864) >> 2;
                                    int var13 = var8 >> 6 & 0x3F;
                                    var14 = arg0 + var11;
                                    var15 = arg2 + var13;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class42.method357(var4, (byte) -42);
                } while (var12 == 22 && class40.field1048 && var16.field1667 == 0 && !var16.field1697);
                var9 = true;
                if (!var16.method550((byte) 52)) {
                    var5 = false;
                    class89.field2099++;
                }
            }
        }
    }
}
