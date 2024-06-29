import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class124 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lpl;I)V", line = 8)
    public static final void method660(class612 arg0, int arg1) {
        field1563++;
        if (arg1 <= -127) {
            class512.field6953 = arg0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method661(int arg0, int arg1, int arg2) {
        field1562++;
        if (arg2 >= -123) {
            method661(70, 51, -12);
        }
        return class131.method688(arg1, 0, arg0) & (class177.method1122(arg0, -545, arg1) | (arg1 & 0x2000) != 0 | class106.method600(arg0, arg1, -128));
    }
}
