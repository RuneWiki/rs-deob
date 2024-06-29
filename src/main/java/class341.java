import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class341 extends class476 {

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field4938 = 0;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "Lhi;")
    public static class45 field4937 = new class45(23, 8);

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "Z")
    public static boolean field4939 = false;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZIIILdk;II)V", line = 4)
    public static final void method2067(boolean arg0, int arg1, int arg2, int arg3, class421 arg4, int arg5, int arg6) {
        class428.field6223 = arg1;
        class100.field1594 = arg6;
        class320.field4400 = arg5;
        class87.field1418 = 1;
        if (arg3 > 96) {
            class238.field3287 = arg0;
            field4936++;
            class135.field2056 = arg4;
            class390.field5635 = arg2;
        }
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(II)V", line = 28)
    public class341(int arg0, int arg1) {
        this.field4934 = arg0;
        this.field4935 = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V", line = 44)
    public static void method2068(byte arg0) {
        if (arg0 >= 108) {
            field4937 = null;
        }
    }
}
