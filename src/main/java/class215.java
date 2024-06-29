import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class215 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "[I")
    public static int[] field2758 = new int[13];

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public static void method1321(boolean arg0) {
        if (!arg0) {
            field2758 = null;
        }
        field2758 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIZIILqn;I)V")
    public static final void method1322(int arg0, int arg1, boolean arg2, int arg3, int arg4, class47 arg5, int arg6) {
        field2757++;
        class534.field7859 = arg5;
        class76.field985 = arg3;
        class498.field7216 = arg2;
        class176.field2324 = 1;
        class156.field1978 = arg6;
        class1.field5 = arg0;
        class9.field148 = class155.field1965.method2681(42) / arg4;
        if (class9.field148 < 1) {
            class9.field148 = 1;
        }
        if (arg1 != 13) {
            field2758 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IFIIIFB[FFIF)V")
    public abstract void method967(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, byte arg6, float[] arg7, float arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
    public static int method1323(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
