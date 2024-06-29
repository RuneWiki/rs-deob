import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class193 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lwf;")
    public static class306 field2917;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Lra;")
    public static class88 field2914;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[[[I")
    public static int[][][] field2911;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 5)
    public static final String method1314(String arg0, byte arg1) {
        field2915++;
        String var2 = class305.method2073(false, class108.method723(arg0, -63));
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 <= 112) {
            method1316(-19, (byte) -123);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 26)
    public static void method1315(int arg0) {
        field2914 = null;
        field2911 = (int[][][]) null;
        field2917 = null;
        if (arg0 != 0) {
            field2917 = (class306) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V", line = 43)
    public static final void method1316(int arg0, byte arg1) {
        field2916++;
        class190.field2894 = 3;
        class96.field1470 = 20;
        if (arg1 != 12) {
            method1316(74, (byte) -118);
        }
        class30.field368 = arg0;
    }
}
