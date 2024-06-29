import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lea;")
    private class30 field2378 = new class30();

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lje;")
    private static class67 field2363 = class85.method592(255, "May");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lje;")
    public static class67 field2359 = class85.method592(255, "::clientdrop");

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2361 = 0;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lje;")
    private static class67 field2370 = class85.method592(255, "Jun");

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lje;")
    private static class67 field2368 = class85.method592(255, "Apr");

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lje;")
    private static class67 field2362 = class85.method592(255, "Aug");

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lje;")
    private static class67 field2366 = class85.method592(255, "Sep");

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lje;")
    private static class67 field2374 = class85.method592(255, "Mar");

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lje;")
    public static class67 field2360 = class85.method592(255, "<col=00ff80>");

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lje;")
    private static class67 field2373 = class85.method592(255, "Oct");

    @OriginalMember(owner = "client!p", name = "x", descriptor = "Lje;")
    private static class67 field2382 = class85.method592(255, "Jan");

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lje;")
    private static class67 field2375 = class85.method592(255, "Dec");

    @OriginalMember(owner = "client!p", name = "w", descriptor = "[Lje;")
    public static class67[] field2381 = new class67[200];

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lje;")
    public static class67 field2388 = class85.method592(255, "(U(Y");

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lje;")
    private static class67 field2376 = class85.method592(255, "Feb");

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lje;")
    private static class67 field2386 = class85.method592(255, "Nov");

    @OriginalMember(owner = "client!p", name = "F", descriptor = "[I")
    public static int[] field2389 = new int[2000];

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Lje;")
    private static class67 field2387 = class85.method592(255, "Jul");

    @OriginalMember(owner = "client!p", name = "s", descriptor = "[Lje;")
    public static class67[] field2377 = new class67[] { field2382, field2376, field2374, field2368, field2363, field2370, field2387, field2362, field2366, field2373, field2386, field2375 };

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lpc;")
    public static class107 field2367;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lfd;")
    public static class40 field2380;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field2369;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IJ)V")
    public static final void method822(int arg0, long arg1) {
        int var3 = -36 / ((-arg0 - 16) / 51);
        field2372++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class129.method985(arg1 - 1L, false);
            class129.method985(1L, false);
        } else {
            class129.method985(arg1, false);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Lea;")
    public final class30 method823(int arg0) {
        field2384++;
        class30 var2 = this.field2378.field527;
        if (arg0 >= -40) {
            field2362 = null;
        }
        if (this.field2378 == var2) {
            return null;
        } else {
            var2.method192((byte) -66);
            return var2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lea;I)V")
    public final void method824(class30 arg0, int arg1) {
        if (arg0.field533 != null) {
            arg0.method192((byte) -66);
        }
        arg0.field527 = this.field2378;
        if (arg1 == 1) {
            arg0.field533 = this.field2378.field533;
            field2390++;
            arg0.field533.field527 = arg0;
            arg0.field527.field533 = arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Lea;")
    public final class30 method825(int arg0) {
        field2364++;
        class30 var2 = this.field2378.field527;
        if (this.field2378 == var2) {
            return null;
        } else if (arg0 == 26030) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)I")
    public static final int method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg4;
            arg4 = var8;
        }
        field2371++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg6;
        } else if (~var7 == arg2) {
            return 7 + 1 - arg1 - arg5;
        } else {
            return 7 + 1 - arg4 - arg6;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Lea;I)V")
    public final void method827(class30 arg0, int arg1) {
        if (arg0.field533 != null) {
            arg0.method192((byte) -66);
        }
        if (arg1 != -2) {
            field2376 = null;
        }
        arg0.field527 = this.field2378.field527;
        arg0.field533 = this.field2378;
        arg0.field533.field527 = arg0;
        field2383++;
        arg0.field527.field533 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class104() {
        this.field2378.field533 = this.field2378;
        this.field2378.field527 = this.field2378;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lna;I)V")
    public static final void method828(class91 arg0, int arg1) {
        field2379++;
        byte[] var2 = new byte[24];
        if (class127.field2798 != null) {
            try {
                class127.field2798.method1174(false, 0L);
                class127.field2798.method1182(false, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg1 == -25) {
            arg0.method628(24, 22286, 0, var2);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public static void method829(int arg0) {
        field2377 = null;
        field2360 = null;
        field2381 = null;
        field2389 = null;
        field2359 = null;
        field2374 = null;
        field2388 = null;
        field2375 = null;
        field2363 = null;
        field2368 = null;
        field2366 = null;
        field2382 = null;
        field2362 = null;
        field2386 = null;
        field2369 = null;
        field2376 = null;
        field2387 = null;
        field2380 = null;
        field2367 = null;
        field2370 = null;
        if (arg0 <= 103) {
            method829(46);
        }
        field2373 = null;
    }
}
