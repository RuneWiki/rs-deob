import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class71 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lnm;")
    public static class221 field1099;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "[[B")
    public static byte[][] field1096;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 5)
    public static final void method490(int arg0) {
        class157.field2523 = class117.method757(0.4F, 4, arg0, 35, (byte) -81, 2048, true, 8);
        field1095++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 18)
    public static void method491(int arg0) {
        field1096 = (byte[][]) null;
        field1099 = null;
        if (arg0 != 2048) {
            method491(-80);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IJ)V", line = 31)
    public static final void method492(int arg0, long arg1) {
        class195.field2992.field5137 = 0;
        class195.field2992.method2193(21, false);
        class195.field2992.method2228(arg1, true);
        class26.field399 = 0;
        field1097++;
        class45.field654 = -3;
        class268.field4421 = arg0;
        class55.field843 = 1;
    }
}
