import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class186 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2695 = new String[200];

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field2696 = 0;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2698 = "Loaded title screen";

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[[I")
    public static int[][] field2697;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        field2698 = null;
        field2697 = null;
        field2695 = null;
        if (arg0 < 18) {
            field2696 = -46;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIB)V")
    public static final void method1352(int arg0, int arg1, byte arg2) {
        field2694++;
        class450 var3 = class59.method540(7, arg0, 1000);
        var3.method2800(256);
        var3.field6498 = arg1;
        if (arg2 >= -76) {
            field2697 = null;
        }
    }
}
