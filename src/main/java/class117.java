import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class117 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1902 = "scroll:";

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static final int method823(int arg0, int arg1) {
        field1901++;
        return arg0 == -410785432 ? arg1 >>> 8 : -43;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method824(byte arg0) {
        if (arg0 == -34) {
            field1902 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjava/lang/String;IJSLjava/lang/String;I)V")
    public static final void method825(int arg0, int arg1, String arg2, int arg3, long arg4, short arg5, String arg6, int arg7) {
        field1903++;
        if (class47.field687) {
            return;
        }
        if (class128.field2018 < 500) {
            class88.field1492[class128.field2018] = arg2;
            class256.field4099[class128.field2018] = arg6;
            class268.field4273[class128.field2018] = arg0 == -1 ? class248.field4020 : arg0;
            class146.field2319[class128.field2018] = arg5;
            class243.field3962[class128.field2018] = arg4;
            class29.field415[class128.field2018] = arg7;
            class45.field648[class128.field2018] = arg3;
            class128.field2018++;
        }
        if (arg1 != -1) {
            field1902 = null;
        }
    }
}
