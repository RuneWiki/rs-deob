import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class24 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field345 = 2;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lfg;")
    public static class48 field349 = new class48(64);

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field350 = 0;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lce;")
    public static class126 field353 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field342;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
    public static int[] field344;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[Lni;")
    public static class215[] field351;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lgd;I)V", line = 10)
    public static final void method116(class138 arg0, int arg1) {
        field347++;
        if (arg0.field2465 == 0) {
            return;
        }
        if (arg0.field2475 != -1 && arg0.field2475 < 32768) {
            class89 var2 = class199.field3391[arg0.field2475];
            if (var2 != null) {
                int var3 = arg0.field2461 - var2.field2461;
                int var4 = arg0.field2487 - var2.field2487;
                if (var3 != 0 || var4 != 0) {
                    arg0.field2444 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2475 >= 32768) {
            int var5 = arg0.field2475 - 32768;
            if (class11.field145 == var5) {
                var5 = 2047;
            }
            class301 var6 = class85.field1352[var5];
            if (var6 != null) {
                int var7 = arg0.field2461 - var6.field2461;
                int var8 = arg0.field2487 - var6.field2487;
                if (var7 != 0 || var8 != 0) {
                    arg0.field2444 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2498 != 0 || arg0.field2457 != 0) && (arg0.field2489 == 0 || arg0.field2490 > 0)) {
            int var9 = arg0.field2461 - ((arg0.field2498 - class58.field914 - class58.field914) * 64);
            int var10 = arg0.field2487 - ((arg0.field2457 - class138.field2473 - class138.field2473) * 64);
            if (var9 != 0 || var10 != 0) {
                arg0.field2444 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2457 = 0;
            arg0.field2498 = 0;
        }
        int var11 = arg0.field2444 - arg0.field2483 & 0x7FF;
        if (arg1 == var11) {
            arg0.field2459 = 0;
            return;
        }
        arg0.field2459++;
        if (var11 <= 1024) {
            arg0.field2483 += arg0.field2465;
            boolean var12 = true;
            if (var11 < arg0.field2465 || 2048 - arg0.field2465 < var11) {
                var12 = false;
                arg0.field2483 = arg0.field2444;
            }
            if (arg0.field2501 == arg0.field2441 && (arg0.field2459 > 25 || var12)) {
                if (arg0.field2496 == -1) {
                    arg0.field2501 = arg0.field2458;
                } else {
                    arg0.field2501 = arg0.field2496;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field2483 -= arg0.field2465;
            if (arg0.field2465 > var11 || var11 > (2048 - arg0.field2465)) {
                var13 = false;
                arg0.field2483 = arg0.field2444;
            }
            if (arg0.field2501 == arg0.field2441 && (arg0.field2459 > 25 || var13)) {
                if (arg0.field2506 == -1) {
                    arg0.field2501 = arg0.field2458;
                } else {
                    arg0.field2501 = arg0.field2506;
                }
            }
        }
        arg0.field2483 &= 0x7FF;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 131)
    public static final void method117(int arg0) {
        class238.field4025 = 0;
        if (arg0 != -1) {
            field351 = (class215[]) null;
        }
        field348++;
        int var1 = (class286.field4744.field2461 >> 7) + class58.field914;
        int var2 = (class286.field4744.field2487 >> 7) + class138.field2473;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class238.field4025 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class238.field4025 = 1;
        }
        if (class238.field4025 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class238.field4025 = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 165)
    public static void method118(boolean arg0) {
        if (!arg0) {
            return;
        }
        field351 = null;
        field342 = null;
        field349 = null;
        field344 = null;
        field353 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIII)V", line = 191)
    public static final void method119(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field340++;
        for (class314 var5 = (class314) class185.field3202.method898((byte) -94); var5 != null; var5 = (class314) class185.field3202.method893((byte) 64)) {
            class158.method1164(arg4, (byte) 55, arg2, var5, arg1, arg3);
        }
        for (class314 var6 = (class314) class82.field1322.method898((byte) -66); var6 != null; var6 = (class314) class82.field1322.method893((byte) -91)) {
            byte var7 = 1;
            if (var6.field5379.field2501 == var6.field5379.field2441) {
                var7 = 0;
            } else if (var6.field5379.field2501 == var6.field5379.field2464) {
                var7 = 2;
            }
            if (var6.field5396 != var7) {
                int var8 = class253.method1716(true, var6.field5379);
                if (var6.field5387 != var8) {
                    if (var6.field5382 != null) {
                        class278.field4633.method562(var6.field5382);
                        var6.field5382 = null;
                    }
                    var6.field5387 = var8;
                }
                var6.field5396 = var7;
            }
            var6.field5402 = var6.field5379.field2461;
            var6.field5389 = var6.field5379.field2461 + (var6.field5379.method1013(false) * 64);
            var6.field5400 = var6.field5379.field2487;
            var6.field5377 = var6.field5379.field2487 + var6.field5379.method1013(false) * 64;
            class158.method1164(arg4, (byte) -121, arg2, var6, arg1, arg3);
        }
        if (arg0 != -73) {
            return;
        }
        for (class314 var9 = (class314) class199.field3389.method1630((byte) 56); var9 != null; var9 = (class314) class199.field3389.method1632(-121)) {
            byte var10 = 1;
            if (var9.field5386.field2501 == var9.field5386.field2441) {
                var10 = 0;
            } else if (var9.field5386.field2501 == var9.field5386.field2464) {
                var10 = 2;
            }
            if (var9.field5396 != var10) {
                int var11 = class260.method1761((byte) 111, var9.field5386);
                if (var9.field5387 != var11) {
                    if (var9.field5382 != null) {
                        class278.field4633.method562(var9.field5382);
                        var9.field5382 = null;
                    }
                    var9.field5387 = var11;
                }
                var9.field5396 = var10;
            }
            var9.field5402 = var9.field5386.field2461;
            var9.field5389 = var9.field5386.field2461 + (var9.field5386.method1013(false) * 64);
            var9.field5400 = var9.field5386.field2487;
            var9.field5377 = var9.field5386.field2487 + var9.field5386.method1013(false) * 64;
            class158.method1164(arg4, (byte) -109, arg2, var9, arg1, arg3);
        }
    }
}
