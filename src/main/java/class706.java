import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class706 {

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "[[[I")
    public static int[][][] field9816 = new int[2][][];

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Ljn;")
    public static class134 field9815 = new class134(104, 6);

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Lhia;")
    public static class48 field9819;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "Lhia;")
    public static class48 field9820;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V", line = 3)
    public static void method3985(byte arg0) {
        field9820 = null;
        field9815 = null;
        int var1 = -102 % ((arg0 + 58) / 61);
        field9816 = null;
        field9819 = null;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z", line = 22)
    public static final boolean method3986(int arg0, int arg1) {
        field9818++;
        if (arg1 != 5495) {
            method3986(116, -28);
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILro;III)V", line = 36)
    public static final void method3987(int arg0, class286 arg1, int arg2, int arg3, int arg4) {
        field9817++;
        if (arg2 <= 32) {
            field9820 = null;
        }
        for (class571 var5 = (class571) class566.field7987.method1041(1048832); var5 != null; var5 = (class571) class566.field7987.method1033(-1)) {
            if (var5.field8025 == arg3 && (arg0 << 9) == var5.field8036 && arg4 << 9 == var5.field8033 && var5.field8038.field4124 == arg1.field4124) {
                if (var5.field8026 != null) {
                    class44.field468.method2512(var5.field8026);
                    var5.field8026 = null;
                }
                if (var5.field8049 != null) {
                    class44.field468.method2512(var5.field8049);
                    var5.field8049 = null;
                }
                var5.method527(-11229);
                return;
            }
        }
    }
}
