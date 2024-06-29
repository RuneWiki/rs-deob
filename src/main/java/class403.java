import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class403 {

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field5685 = 1;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
    public static int[] field5678 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "C")
    public char field5681;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lae;")
    public static class283 field5684;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method2469(byte arg0) {
        if (arg0 != 21) {
            method2473(-76, -4, 109);
        }
        field5678 = null;
        field5684 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lgga;I)V")
    public final void method2470(class511 arg0, int arg1) {
        if (arg1 != -1) {
            field5684 = null;
        }
        while (true) {
            int var3 = arg0.method3013(arg1 ^ 0xFFFFFFB2);
            if (var3 == 0) {
                field5679++;
                return;
            }
            this.method2472(arg1 ^ 0x1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2471(int arg0, String arg1) {
        if (arg0 != 2) {
            method2473(108, -34, 104);
        }
        field5686++;
        if (class456.field6371 == null) {
            return;
        }
        class591.field8330++;
        class116 var2 = class248.method1672(class84.field1023, class134.field1715, -20647);
        var2.field1575.method3005(255, class395.method2435(arg1, arg0 ^ 0x3));
        var2.field1575.method3037(0, arg1);
        class443.method2655(0, var2);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILgga;)V")
    private final void method2472(int arg0, int arg1, class511 arg2) {
        field5683++;
        if (~arg1 == arg0) {
            this.field5681 = class395.method2438(arg2.method3030(arg0 - 25982), arg0 ^ 0x7E);
        } else if (arg1 == 2) {
            this.field5685 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
    public static final boolean method2473(int arg0, int arg1, int arg2) {
        field5680++;
        if (class705.method3977(arg0, arg1, arg2)) {
            return (arg0 & 0xB000) != 0 | class140.method930(arg0, arg1, -20667) | class165.method1043((byte) -110, arg0, arg1) ? true : (class455.method2739(false, arg0, arg1) | class726.method4041(-1, arg0, arg1)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
    public static final int method2474(int arg0, int arg1) {
        field5677++;
        if (arg1 != 1899037992) {
            field5678 = null;
        }
        return arg0 >>> 8;
    }
}
