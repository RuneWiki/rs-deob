import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class58 extends class86 {

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "Ljava/lang/String;")
    public static String field906 = "Please remove ";

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field913 = 0;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field912;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIIII)I", line = 5)
    public static final int method575(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field909++;
        if (!arg0) {
            method575(false, 35, -16, -10, -63);
        }
        int var5 = 65536 - class107.field1605[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method576(byte arg0, int arg1) {
        class119.field1824 = 1000 / arg1;
        if (arg0 != -38) {
            method577(76, 37, -84, -60, -26, -90);
        }
        field911++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[I", line = 28)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 <= 7) {
            field912 = (String) null;
        }
        field907++;
        int[] var3 = this.field1225.method1914(arg0, -92);
        if (this.field1225.field3995) {
            class65.method639(var3, 0, class93.field1424, class135.field2257[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V", line = 54)
    public static final void method577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -34) {
            method577(67, -5, 88, -69, -62, 115);
        }
        if (class43.field693 <= arg3 && arg4 <= class128.field2130 && arg0 >= class328.field5042 && arg1 <= class284.field4385) {
            class281.method2052(arg2, arg0, arg1, -10, arg4, arg3);
        } else {
            class244.method1838(arg2, 6598, arg1, arg4, arg3, arg0);
        }
        field908++;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 77)
    public static void method578(byte arg0) {
        field906 = null;
        field912 = null;
        if (arg0 <= 32) {
            method576((byte) -122, -128);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 87)
    public class58() {
        super(0, true);
    }
}
