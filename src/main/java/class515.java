import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class515 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "J")
    public static long field7544 = 0L;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIII)I", line = 3)
    public static final int method3051(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field7545++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0) {
            method3051(true, 125, -105, 101);
        }
        if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method3052(boolean arg0) {
        class112.method801((byte) 81, arg0);
        field7546++;
        if (class333.field4436 >= 0 && class333.field4436 != 0) {
            class435.method2608(-123, class333.field4436);
            class333.field4436 = -1;
        }
    }
}
