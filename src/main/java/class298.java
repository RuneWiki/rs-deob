import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class298 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lib;")
    private class3 field4830 = new class3();

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lok;")
    private static class41 field4826 = class137.method956("Loading interfaces )2 ", 45);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    public static boolean field4824 = false;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field4836 = 0;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "[[I")
    public static int[][] field4834 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "[[S")
    public static short[][] field4838 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lok;")
    public static class41 field4832 = class137.method956("(Y", 45);

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lok;")
    public static class41 field4831 = field4826;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "Lib;")
    private class3 field4839;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lmh;")
    public static class65 field4820;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Lce;", line = 9)
    public static final class198 method2052(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5208;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 24)
    public final int method2053(byte arg0) {
        field4821++;
        if (arg0 != 85) {
            this.field4839 = (class3) null;
        }
        int var2 = 0;
        class3 var3 = this.field4830.field37;
        while (this.field4830 != var3) {
            var3 = var3.field37;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V", line = 51)
    public final void method2054(byte arg0) {
        while (true) {
            class3 var2 = this.field4830.field37;
            if (this.field4830 == var2) {
                if (arg0 < 26) {
                    return;
                }
                field4823++;
                this.field4839 = null;
                return;
            }
            var2.method11(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lib;I)V", line = 78)
    public final void method2055(class3 arg0, int arg1) {
        if (arg0.field45 != null) {
            arg0.method11(true);
        }
        arg0.field45 = this.field4830.field45;
        field4825++;
        arg0.field37 = this.field4830;
        if (arg1 < 4) {
            this.field4830 = (class3) null;
        }
        arg0.field45.field37 = arg0;
        arg0.field37.field45 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 95)
    public static final int method2056(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        field4827++;
        return arg1 == 1802566600 ? var6 & 0xFF : -53;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lib;", line = 118)
    public final class3 method2057(int arg0) {
        field4837++;
        class3 var2 = this.field4830.field37;
        if (this.field4830 == var2) {
            this.field4839 = null;
            return null;
        } else {
            int var3 = -108 / ((arg0 - 14) / 32);
            this.field4839 = var2.field37;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lib;", line = 157)
    public final class3 method2058(boolean arg0) {
        if (arg0) {
            this.field4839 = (class3) null;
        }
        field4835++;
        class3 var2 = this.field4839;
        if (this.field4830 == var2) {
            this.field4839 = null;
            return null;
        } else {
            this.field4839 = var2.field37;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)Lib;", line = 185)
    public final class3 method2059(boolean arg0) {
        if (arg0) {
            this.field4830 = (class3) null;
        }
        field4833++;
        class3 var2 = this.field4830.field37;
        if (this.field4830 == var2) {
            return null;
        } else {
            var2.method11(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 205)
    public static void method2060(int arg0) {
        field4834 = (int[][]) null;
        field4838 = (short[][]) null;
        if (arg0 != -15739) {
            field4828 = -55;
        }
        field4832 = null;
        field4831 = null;
        field4820 = null;
        field4826 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 227)
    public static final void method2061(byte arg0, Component arg1) {
        arg1.removeKeyListener(class248.field3960);
        arg1.removeFocusListener(class248.field3960);
        field4822++;
        class308.field5190 = -1;
        int var2 = -90 % ((53 - arg0) / 63);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 255)
    public class298() {
        this.field4830.field37 = this.field4830;
        this.field4830.field45 = this.field4830;
    }
}
