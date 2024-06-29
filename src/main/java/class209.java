import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class209 {

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public int field2725 = 0;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
    public int field2731 = 0;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "Z")
    private boolean field2721 = false;

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "Lkr;")
    public static class602 field2728 = new class602(16, 10);

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public static int field2732 = -1;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "[Lnfa;")
    public static class228[] field2735 = new class228[4];

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    private int field2716;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public int field2729;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "J")
    public long field2730;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "Luu;")
    public static class237 field2734;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1244(byte arg0) {
        field2722++;
        class669.field9235 = new class396[50];
        if (arg0 == 16) {
            class12.field108 = 0;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 23)
    public static void method1245(int arg0) {
        field2735 = null;
        field2734 = null;
        if (arg0 >= 9) {
            field2728 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V", line = 42)
    public final void method1246(int arg0) {
        this.field2733 = class24.field308[this.field2716 << 3];
        field2727++;
        long var2 = (long) this.field2723;
        long var4 = (long) this.field2726;
        long var6 = (long) this.field2717;
        this.field2714 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field2718 == 0) {
            this.field2718 = 1;
        }
        if (arg0 < 0) {
            method1244((byte) 101);
        }
        if (this.field2719 == 0) {
            this.field2730 = 2147483647L;
        } else if (this.field2719 == 1) {
            this.field2730 = (this.field2714 * 8 / this.field2718);
            this.field2730 *= this.field2730;
        } else if (this.field2719 == 2) {
            this.field2730 = (this.field2714 * 8 / this.field2718);
        }
        if (this.field2721) {
            this.field2714 *= -1;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILdc;)V", line = 95)
    public final void method1247(int arg0, class63 arg1) {
        if (arg0 != 29045) {
            this.field2723 = 23;
        }
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field2724++;
                return;
            }
            this.method1248(var3, arg1, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILdc;B)V", line = 121)
    private final void method1248(int arg0, class63 arg1, byte arg2) {
        field2720++;
        if (arg0 == 1) {
            this.field2716 = arg1.method482(-772591672);
        } else if (arg0 == 2) {
            arg1.method505((byte) -119);
        } else if (arg0 == 3) {
            this.field2723 = arg1.method457(-14532);
            this.field2726 = arg1.method457(-14532);
            this.field2717 = arg1.method457(-14532);
        } else if (arg0 == 4) {
            this.field2719 = arg1.method505((byte) -119);
            this.field2718 = arg1.method457(-14532);
        } else if (arg0 == 6) {
            this.field2729 = arg1.method505((byte) -119);
        } else if (arg0 == 8) {
            this.field2725 = 1;
        } else if (arg0 == 9) {
            this.field2731 = 1;
        } else if (arg0 == 10) {
            this.field2721 = true;
        }
        if (arg2 != 112) {
            this.method1246(-20);
        }
    }
}
