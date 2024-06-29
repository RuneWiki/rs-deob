import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class195 extends class42 {

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
    public int field2718;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "[I")
    public static int[] field2715;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        if (arg0 != 12) {
            field2715 = null;
        }
        field2715 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BI)Z")
    public static final boolean method1246(byte arg0, int arg1) {
        field2713++;
        if (arg1 == 21 || arg1 == 44 || arg1 == 13 || arg1 == 5 || arg1 == 48) {
            return true;
        } else if (arg1 == 4 || arg1 == 1004) {
            return true;
        } else {
            int var2 = -34 % ((64 - arg0) / 47);
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lmd;I)V")
    public static final void method1247(class379 arg0, int arg1) {
        field2719++;
        if ((arg0.field5152.length - arg0.field5173) < 1) {
            return;
        }
        if (arg1 >= -50) {
            field2712 = 91;
        }
        int var2 = arg0.method2238(255);
        if (var2 < 0 || var2 > 1 || arg0.field5152.length - arg0.field5173 < 2) {
            return;
        }
        int var3 = arg0.method2212((byte) 83);
        if (var3 * 6 != arg0.field5152.length - arg0.field5173) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field5173 >= arg0.field5152.length) {
                            return;
                        }
                        var4 = arg0.method2212((byte) 83);
                        var5 = arg0.method2232((byte) 127);
                    } while (class98.field1478.length <= var4);
                } while (!class131.field1900[var4]);
            } while (class349.field4710.method2126((byte) -87, var4).field4184 == '1' && (var5 < -1 || var5 > 1));
            class98.field1478[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(II)V")
    public class195(int arg0, int arg1) {
        this.field2717 = arg0;
        this.field2718 = arg1;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
    public static final void method1248(byte arg0) {
        field2716++;
        if (class392.field5313) {
            return;
        }
        class497.method2852(63, class490.field6821);
        if (class376.field5102 != null) {
            class497.method2852(-114, class376.field5102);
        }
        if (arg0 <= -33) {
            class392.field5313 = true;
        }
    }
}
