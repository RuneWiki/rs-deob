import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class188 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lv;")
    public static class73 field2993 = new class73();

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2995 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2994 = -1;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 7)
    public static void method1402(int arg0) {
        int var1 = 104 % ((arg0) / 57);
        field2993 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 27)
    public static final void method1403(String arg0, int arg1, boolean arg2) {
        field2992++;
        class4 var3 = class67.method510(1, 3, arg1);
        var3.method14(24710);
        var3.field29 = arg0;
        if (arg2) {
            field2993 = (class73) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V", line = 42)
    public static final void method1404(int arg0, int arg1, int arg2) {
        class4 var3 = class67.method510(1, 13, arg1);
        field2991++;
        if (arg0 <= -56) {
            var3.method14(24710);
            var3.field20 = arg2;
        }
    }
}
