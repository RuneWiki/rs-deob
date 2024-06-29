import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class116 extends class147 {

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "J")
    public long field1830;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[I")
    public static int[] field1824 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field1828 = -1;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 7)
    public static void method806(int arg0) {
        field1824 = null;
        if (arg0 != 1000) {
            field1828 = 55;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII)I", line = 21)
    public static final int method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1825++;
        if ((arg2 & 0x1) == arg5) {
            int var7 = arg4;
            arg4 = arg3;
            arg3 = var7;
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg0;
        } else if (var8 == 2) {
            return 7 - (arg4 - 1) - arg6;
        } else {
            return 1 + 7 - arg3 - arg0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 53)
    public static final void method808(int arg0) {
        int var1 = -101 / ((arg0 - 10) / 59);
        class86.field1416 = new class297[class240.field3884.method1877(0)][];
        field1827++;
        class259.field4226 = new boolean[class240.field3884.method1877(0)];
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Lna;", line = 72)
    public static final class26 method809(int arg0, int arg1) {
        field1826++;
        if (arg1 < 100000) {
            return class236.method1587(new class26[] { class95.field1551, class149.method1019((byte) 9, arg1), class149.field2335 }, (byte) -65);
        } else {
            if (arg0 != 1000) {
                method809(-54, 54);
            }
            return arg1 >= 10000000 ? class236.method1587(new class26[] { class230.field3650, class149.method1019((byte) 9, arg1 / 1000000), class198.field3070, class149.field2335 }, (byte) -85) : class236.method1587(new class26[] { class131.field1993, class149.method1019((byte) 9, arg1 / 1000), class132.field2005, class149.field2335 }, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 104)
    public class116() {
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(J)V", line = 106)
    public class116(long arg0) {
        this.field1830 = arg0;
    }
}
