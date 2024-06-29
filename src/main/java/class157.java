import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class157 {

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field2572 = -1;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2568 = "Loaded fonts";

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2576 = "wave2:";

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lub;")
    public static class23 field2575;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I", line = 10)
    public static final int method1164(int arg0, int arg1, int arg2) {
        field2567++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 33)
    public static final boolean method1165(String arg0, boolean arg1) {
        field2571++;
        return arg1 ? class168.method1260(arg0, true, true, 10) : true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 54)
    public static void method1166(byte arg0) {
        int var1 = -44 % ((-arg0 - 24) / 49);
        field2576 = null;
        field2575 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V", line = 62)
    public class157(int arg0, int arg1, int arg2) {
        this.field2574 = arg2;
        this.field2573 = arg1;
        this.field2570 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
    public abstract void method141(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V")
    public abstract void method142(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)V")
    public abstract void method144(int arg0, int arg1, int arg2);
}
