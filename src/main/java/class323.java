import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class323 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field4668 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field4670 = -1;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "J")
    public static long field4666;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
    public static final int method2007(int arg0, int arg1) {
        if (arg1 != 177185355) {
            method2008(29, -59, true);
        }
        field4667++;
        return (arg0 & 0x3FF08) >> 11;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZ)V")
    public static final void method2008(int arg0, int arg1, boolean arg2) {
        class490.field6891 = arg0;
        field4669++;
        class343.field4929 = arg1;
        class177.method1207(arg0 + 39997, client.field8777.field3411, client.field8777.field3409);
        if (arg2) {
            class480.method2765(false, 0, "", "");
        } else {
            class408.method2479((byte) -96);
            class480.method2765(false, 0, class101.field1737, class636.field9236);
        }
    }
}
