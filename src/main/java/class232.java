import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class232 {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lvf;")
    private static class265 field4096 = class87.method582(-46, "Loaded update list");

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Lvf;")
    public static class265 field4097 = field4096;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4098 = -1;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lvf;")
    public static class265 field4099 = class87.method582(-46, "um");

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lik;")
    public static class219 field4089 = new class219();

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4102 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lgk;")
    public static class6 field4094;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method1564(int arg0) {
        if (arg0 != 18434) {
            method1565((byte) -63);
        }
        field4094 = null;
        field4097 = null;
        field4099 = null;
        field4089 = null;
        field4096 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
    public static final int method1565(byte arg0) {
        field4090++;
        int var1 = 10 / ((arg0 + 17) / 39);
        return 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lba;B)V")
    public static final void method1566(class140 arg0, byte arg1) {
        field4092++;
        arg0.field2582 = arg0.field2601;
        if (arg0.field2551 == 0) {
            arg0.field2599 = 0;
            return;
        }
        if (arg0.field2570 != -1 && arg0.field2591 == 0) {
            class216 var2 = class174.method1142(arg0.field2570, false);
            if (arg0.field2590 > 0 && var2.field3889 == 0) {
                arg0.field2599++;
                return;
            }
            if (arg0.field2590 <= 0 && var2.field3884 == 0) {
                arg0.field2599++;
                return;
            }
        }
        int var3 = arg0.field2564;
        if (arg1 < 123) {
            return;
        }
        int var4 = arg0.field2600;
        int var5 = arg0.field2536[arg0.field2551 - 1] * 128 + (arg0.method822(2) * 64);
        int var6 = arg0.field2575[arg0.field2551 - 1] * 128 + (arg0.method822(2) * 64);
        if (var5 - var4 > 256 || var5 - var4 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg0.field2600 = var5;
            arg0.field2564 = var6;
            return;
        }
        if (var4 < var5) {
            if (var6 > var3) {
                arg0.field2580 = 1280;
            } else if (var6 >= var3) {
                arg0.field2580 = 1536;
            } else {
                arg0.field2580 = 1792;
            }
        } else if (var5 < var4) {
            if (var3 < var6) {
                arg0.field2580 = 768;
            } else if (var6 < var3) {
                arg0.field2580 = 256;
            } else {
                arg0.field2580 = 512;
            }
        } else if (var6 > var3) {
            arg0.field2580 = 1024;
        } else if (var6 < var3) {
            arg0.field2580 = 0;
        }
        int var7 = arg0.field2580 - arg0.field2563 & 0x7FF;
        int var8 = arg0.field2558;
        int var9 = 4;
        boolean var10 = true;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field2562;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field2588;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field2576;
        }
        if (var8 == -1) {
            var8 = arg0.field2562;
        }
        arg0.field2582 = var8;
        if (arg0 instanceof class23) {
            var10 = ((class23) arg0).field681.field4785;
        }
        if (var10) {
            if (arg0.field2580 != arg0.field2563 && arg0.field2584 == -1 && arg0.field2553 != 0) {
                var9 = 2;
            }
            if (arg0.field2551 > 2) {
                var9 = 6;
            }
            if (arg0.field2551 > 3) {
                var9 = 8;
            }
            if (arg0.field2599 > 0 && arg0.field2551 > 1) {
                var9 = 8;
                arg0.field2599--;
            }
        } else {
            if (arg0.field2551 > 1) {
                var9 = 6;
            }
            if (arg0.field2551 > 2) {
                var9 = 8;
            }
            if (arg0.field2599 > 0 && arg0.field2551 > 1) {
                var9 = 8;
                arg0.field2599--;
            }
        }
        if (arg0.field2609[arg0.field2551 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var4) {
            arg0.field2600 += var9;
            if (arg0.field2600 > var5) {
                arg0.field2600 = var5;
            }
        } else if (var5 < var4) {
            arg0.field2600 -= var9;
            if (arg0.field2600 < var5) {
                arg0.field2600 = var5;
            }
        }
        if (var9 >= 8 && arg0.field2582 == arg0.field2562 && arg0.field2587 != -1) {
            arg0.field2582 = arg0.field2587;
        }
        if (var3 < var6) {
            arg0.field2564 += var9;
            if (var6 < arg0.field2564) {
                arg0.field2564 = var6;
            }
        } else if (var6 < var3) {
            arg0.field2564 -= var9;
            if (arg0.field2564 < var6) {
                arg0.field2564 = var6;
            }
        }
        if (arg0.field2600 != var5 || arg0.field2564 != var6) {
            return;
        }
        arg0.field2551--;
        if (arg0.field2590 > 0) {
            arg0.field2590--;
            return;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)I")
    public static final int method1567(boolean arg0, int arg1) {
        field4093++;
        if (!arg0) {
            method1567(true, -113);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZZ)V")
    public static final void method1568(boolean arg0, boolean arg1) {
        if (arg1) {
            field4091++;
            class59.method441(class8.field271, arg0, class26.field706, class50.field1053, 0);
        }
    }
}
