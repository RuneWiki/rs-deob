import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class193 {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2585 = -1;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2588 = null;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILlm;Llm;)V")
    public static final void method1160(int arg0, class347 arg1, class347 arg2) {
        class226.field2968 = arg2;
        field2586++;
        if (arg0 == -2) {
            class379.field5498 = arg1;
            class226.field2968.method2272(91, 36);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class87.field1227 <= arg0 && class299.field4382 >= arg2 && arg3 >= class379.field5521 && class125.field1751 >= arg6) {
            if (arg4 == 1) {
                class331.method2193(arg5, arg0, arg6, 110, arg2, arg3);
            } else {
                class62.method430(arg6, 117, arg0, arg3, arg5, arg4, arg2);
            }
        } else if (arg4 == 1) {
            class202.method1195((byte) 7, arg3, arg0, arg5, arg2, arg6);
        } else {
            class98.method665(arg2, arg5, arg0, arg6, false, arg4, arg3);
        }
        field2584++;
        if (arg1 > -112) {
            field2585 = -52;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field2588 = null;
        if (arg0 != 1) {
            field2585 = -70;
        }
    }
}
