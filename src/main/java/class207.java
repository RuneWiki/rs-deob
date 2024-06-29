import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class207 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
    public static int[] field3636 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Leb;")
    public static class230 field3635 = class68.method589(0, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Leb;")
    public static class230 field3637 = class68.method589(0, "mapflag");

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1449(byte arg0) {
        field3637 = null;
        if (arg0 < 5) {
            method1451(false, (class128) null);
        }
        field3635 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static final void method1450(int arg0) {
        field3643++;
        int var1 = class249.field4411 + class56.field1033.field2300;
        if (class28.field515[98]) {
            class66.field1240 += (12 - class66.field1240) / 2;
        } else if (class28.field515[99]) {
            class66.field1240 += (-class66.field1240 - 12) / 2;
        } else {
            class66.field1240 /= 2;
        }
        if (class28.field515[96]) {
            class183.field3220 += (-class183.field3220 - 24) / 2;
        } else if (class28.field515[97]) {
            class183.field3220 += (24 - class183.field3220) / 2;
        } else {
            class183.field3220 /= 2;
        }
        if (arg0 != 12) {
            method1451(false, (class128) null);
        }
        class71.field1298 += class66.field1240 / 2;
        int var2 = class186.field3257 + class56.field1033.field2274;
        if ((class80.field1457 - var2) < -500 || class80.field1457 - var2 > 500 || (class88.field1530 - var1) < -500 || class88.field1530 - var1 > 500) {
            class88.field1530 = var1;
            class80.field1457 = var2;
        }
        if (class80.field1457 != var2) {
            class80.field1457 += (var2 - class80.field1457) / 16;
        }
        if (class88.field1530 != var1) {
            class88.field1530 += (var1 - class88.field1530) / 16;
        }
        class34.field641 += class183.field3220 / 2;
        class146.method1119((byte) -48);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLob;)V")
    public static final void method1451(boolean arg0, class128 arg1) {
        field3640++;
        arg1.field2282 = arg1.field2305;
        if (arg1.field2287 == 0) {
            arg1.field2264 = 0;
            return;
        }
        if (arg1.field2303 != -1 && arg1.field2246 == 0) {
            class249 var2 = class237.method1667(arg1.field2303, 2);
            if (arg1.field2299 > 0 && var2.field4432 == 0) {
                arg1.field2264++;
                return;
            }
            if (arg1.field2299 <= 0 && var2.field4435 == 0) {
                arg1.field2264++;
                return;
            }
        }
        int var3 = arg1.field2274;
        int var4 = arg1.field2300;
        int var5 = arg1.field2296[arg1.field2287 - 1] * 128 + (arg1.method1005(0) * 64);
        int var6 = arg1.field2253[arg1.field2287 - 1] * 128 + arg1.method1005(0) * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg1.field2300 = var6;
            arg1.field2274 = var5;
            return;
        }
        if (var5 <= var3) {
            if (var5 >= var3) {
                if (var4 < var6) {
                    arg1.field2278 = 1024;
                } else if (var4 > var6) {
                    arg1.field2278 = 0;
                }
            } else if (var6 > var4) {
                arg1.field2278 = 768;
            } else if (var6 < var4) {
                arg1.field2278 = 256;
            } else {
                arg1.field2278 = 512;
            }
        } else if (var4 < var6) {
            arg1.field2278 = 1280;
        } else if (var4 > var6) {
            arg1.field2278 = 1792;
        } else {
            arg1.field2278 = 1536;
        }
        int var7 = arg1.field2278 - arg1.field2289 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field2301;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field2252;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field2283;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field2298;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg1.field2252;
        }
        arg1.field2282 = var8;
        if (arg0) {
            method1451(false, (class128) null);
        }
        boolean var10 = true;
        if (arg1 instanceof class109) {
            var10 = ((class109) arg1).field1956.field1783;
        }
        if (var10) {
            if (arg1.field2289 != arg1.field2278 && arg1.field2280 == -1 && arg1.field2270 != 0) {
                var9 = 2;
            }
            if (arg1.field2287 > 2) {
                var9 = 6;
            }
            if (arg1.field2287 > 3) {
                var9 = 8;
            }
            if (arg1.field2264 > 0 && arg1.field2287 > 1) {
                arg1.field2264--;
                var9 = 8;
            }
        } else {
            if (arg1.field2287 > 1) {
                var9 = 6;
            }
            if (arg1.field2287 > 2) {
                var9 = 8;
            }
            if (arg1.field2264 > 0 && arg1.field2287 > 1) {
                arg1.field2264--;
                var9 = 8;
            }
        }
        if (arg1.field2239[arg1.field2287 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field2274 += var9;
            if (arg1.field2274 > var5) {
                arg1.field2274 = var5;
            }
        } else if (var5 < var3) {
            arg1.field2274 -= var9;
            if (arg1.field2274 < var5) {
                arg1.field2274 = var5;
            }
        }
        if (var9 >= 8 && arg1.field2282 == arg1.field2252 && arg1.field2250 != -1) {
            arg1.field2282 = arg1.field2250;
        }
        if (var4 < var6) {
            arg1.field2300 += var9;
            if (arg1.field2300 > var6) {
                arg1.field2300 = var6;
            }
        } else if (var6 < var4) {
            arg1.field2300 -= var9;
            if (var6 > arg1.field2300) {
                arg1.field2300 = var6;
            }
        }
        if (arg1.field2274 == var5 && arg1.field2300 == var6) {
            if (arg1.field2299 > 0) {
                arg1.field2299--;
            }
            arg1.field2287--;
        }
    }
}
