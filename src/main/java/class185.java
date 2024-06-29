import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class185 extends class82 {

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "[Ltg;")
    public class185[] field2812;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Z")
    public boolean field2814;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[I")
    public static int[] field2808 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lcj;")
    public class119 field2802;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Llc;")
    public class86 field2804;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BII)[I")
    public final int[] method1146(byte arg0, int arg1, int arg2) {
        field2809++;
        if (arg0 <= 116) {
            return null;
        } else if (this.field2812[arg2].field2814) {
            return this.field2812[arg2].method34(arg1, 113);
        } else {
            return this.field2812[arg2].method39(true, arg1)[0];
        }
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public void method162(byte arg0) {
        if (arg0 != 80) {
            return;
        }
        if (this.field2814) {
            this.field2804.method564(22631);
            this.field2804 = null;
        } else {
            this.field2802.method752(arg0 ^ 0xED8);
            this.field2802 = null;
        }
        field2811++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBI)V")
    public final void method1147(int arg0, byte arg1, int arg2) {
        field2800++;
        int var4 = this.field2806 == 255 ? arg0 : this.field2806;
        if (arg1 > -101) {
            this.field2814 = false;
        }
        if (this.field2814) {
            this.field2804 = new class86(var4, arg0, arg2);
        } else {
            this.field2802 = new class119(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)I")
    public int method1148(int arg0) {
        if (arg0 == 0) {
            field2805++;
            return -1;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[[I")
    public int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2806 = 79;
        }
        field2813++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static final void method1149(boolean arg0) {
        field2798++;
        class274.field4121.method1782(0);
        class66.field1063.method1782(0);
        if (!arg0) {
            method1149(false);
        }
        class153.field2236.method1782(0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method1150(String arg0, byte arg1) throws ClassNotFoundException {
        field2807++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg1 > -106) {
                field2808 = null;
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static void method1151(boolean arg0) {
        field2808 = null;
        if (arg0) {
            method1151(false);
        }
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public void method30(int arg0) {
        if (arg0 != -9) {
            this.method1152(false, -111, 117);
        }
        field2797++;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILfl;I)V")
    public void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 == -6357) {
            field2815++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)I")
    public int method160(int arg0) {
        if (arg0 < 118) {
            return 64;
        } else {
            field2799++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(ZII)[[I")
    public final int[][] method1152(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return null;
        }
        field2810++;
        if (!this.field2812[arg1].field2814) {
            return this.field2812[arg1].method39(true, arg2);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field2812[arg1].method34(arg2, 71);
        var4[1] = var5;
        var4[0] = var5;
        var4[2] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
    public int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            this.method34(-8, 4);
        }
        field2803++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IZ)V")
    public class185(int arg0, boolean arg1) {
        this.field2812 = new class185[arg0];
        this.field2814 = arg1;
    }
}
