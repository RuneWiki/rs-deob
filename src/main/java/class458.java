import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class458 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6541 = null;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6539;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2712(int arg0) {
        class455.field6519 = arg0;
        for (int var1 = 0; var1 < class196.field2540; var1++) {
            for (int var2 = 0; var2 < class247.field3229; var2++) {
                if (class443.field6387[arg0][var1][var2] == null) {
                    class443.field6387[arg0][var1][var2] = new class194(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 34)
    public static void method2713(byte arg0) {
        field6541 = null;
        if (arg0 <= 109) {
            field6541 = null;
        }
        field6539 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V", line = 49)
    public static final void method2714(int arg0, int arg1, int arg2) {
        field6540++;
        class74 var3 = class171.field2240[arg2][arg1];
        if (var3 != null) {
            class578.field7890 = var3.field998;
            class69.field955 = var3.field997;
            class565.field7734 = var3.field996;
        }
        class512.method2992(1055253410);
        if (arg0 != 0) {
            field6542 = -53;
        }
    }
}
