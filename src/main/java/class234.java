import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class234 extends class135 {

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public int field3761 = 0;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field3759 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[I")
    public static int[] field3753 = new int[256];

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field3760 = 0;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "S")
    public static short field3762;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "D")
    public static double field3763;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "[I")
    public static int[] field3756;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Llj;I)V")
    public final void method1588(class25 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                if (arg1 >= -18) {
                    field3763 = 0.10091779111717218D;
                }
                field3757++;
                return;
            }
            this.method1590((byte) -54, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
    public static void method1589(byte arg0) {
        field3756 = null;
        int var1 = 85 / ((arg0 - 39) / 60);
        field3753 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BILlj;)V")
    private final void method1590(byte arg0, int arg1, class25 arg2) {
        field3755++;
        if (arg1 == 2) {
            this.field3761 = arg2.method190(-3);
        }
        int var4 = 96 / ((54 - arg0) / 52);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IBI)I")
    public static final int method1591(int arg0, byte arg1, int arg2) {
        int var3 = arg0 >>> 31;
        if (arg1 != 113) {
            method1592(false);
        }
        field3758++;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)I")
    public static final int method1592(boolean arg0) {
        field3754++;
        if (class107.field1644 == null) {
            return -1;
        }
        while (class96.field1476 < class107.field1644.field1110) {
            if (class107.field1644.method528(class96.field1476, (byte) -83)) {
                return class96.field1476++;
            }
            class96.field1476++;
        }
        if (!arg0) {
            field3753 = null;
        }
        return -1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3753[var0] = var1;
        }
        field3762 = 205;
        field3763 = -1.0D;
    }
}
