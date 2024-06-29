import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class22 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
    public static boolean field251;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILpaa;Lha;)V")
    public static final void method124(int arg0, class712 arg1, class545 arg2) {
        field252++;
        boolean var3 = class487.field6572.method3046(arg1.field10017, (byte) 116, arg1.field10087, arg1.field9960 | arg0, arg1.field10004, arg1.field9953, arg1.field9964 ? class473.field6483.field9257 : null, arg2) == null;
        if (var3) {
            class16.field206.method3116(29066, new class491(arg1.field9953, arg1.field10017, arg1.field10087, arg1.field9960 | 0xFF000000, arg1.field10004, arg1.field9964));
            class116.method764(arg1, -1176833464);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
    public static final void method125(int arg0, int arg1) {
        if (class93.field1268 == arg0) {
            class142.field1978 = arg1;
        } else if (class93.field1268 == 2) {
            class178.field2525 = arg1;
        }
        field250++;
    }
}
