import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class172 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field2553 = 2;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field2550 = 127;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "Z")
    public boolean field2565 = true;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field2563 = 0;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
    public boolean field2562 = true;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
    public boolean field2556 = false;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public int field2566 = 3;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public int field2574 = 1;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    public int field2569 = 127;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public int field2568 = 2;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public int field2580 = 2;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public int field2564 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public int field2549 = 127;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Z")
    public boolean field2567 = true;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field2560 = 0;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public int field2584 = 0;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public int field2576 = 0;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "Z")
    public boolean field2583 = false;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "Z")
    public boolean field2582 = true;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "Z")
    public boolean field2578 = false;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "Z")
    public boolean field2571 = true;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Z")
    public boolean field2577 = true;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field2561 = 2;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "Z")
    public boolean field2585 = true;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "Z")
    public boolean field2581 = true;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field2573 = 0;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "Z")
    public boolean field2587 = true;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "Z")
    public boolean field2586 = true;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "Z")
    public boolean field2579 = true;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public int field2588 = 0;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "Z")
    public boolean field2590 = true;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[Z")
    public static boolean[] field2551 = new boolean[5];

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lbd;")
    public static class44 field2559 = new class44(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Z")
    public boolean field2554;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "Z")
    public boolean field2575;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "Z")
    public boolean field2589;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZII)V")
    public final void method1212(boolean arg0, int arg1, int arg2) {
        if (arg2 == 1 || arg2 == 3) {
            this.field2568 = arg1;
        } else {
            this.field2573 = arg1;
        }
        if (arg0) {
            this.method1215(-56, 63);
        }
        field2555++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
    public final int method1213(byte arg0, int arg1) {
        if (arg0 != -35) {
            this.field2583 = false;
        }
        field2572++;
        return arg1 == 1 || arg1 == 3 ? this.field2568 : this.field2573;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIZ)V")
    public final void method1214(byte arg0, int arg1, boolean arg2) {
        if (arg1 == 1 || arg1 == 3) {
            this.field2589 = arg2;
        } else {
            this.field2575 = arg2;
        }
        field2570++;
        if (arg0 <= 92) {
            this.field2566 = -81;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
    public final boolean method1215(int arg0, int arg1) {
        field2558++;
        if (arg1 != -4) {
            this.method1215(-57, -35);
        }
        return arg0 == 1 || arg0 == 3 ? this.field2589 : this.field2575;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1216(int arg0) {
        if (arg0 != 0) {
            method1216(-78);
        }
        field2551 = null;
        field2559 = null;
    }
}
