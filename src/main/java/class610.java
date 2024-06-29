import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class610 {

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method3488(int arg0, byte arg1) {
        field8601++;
        if (arg1 < 67) {
            return null;
        }
        class124 var2 = (class124) class662.field9426.method3512(true, (long) arg0);
        if (var2 != null) {
            class149 var3 = var2.field1904.method4077(false);
            if (var3 != null) {
                double var4 = var2.field1904.method4083((byte) -79);
                if (var4 >= (double) var3.method1128((byte) 83) && (double) var3.method1131(14615) >= var4) {
                    return var3.method1133(0);
                }
            }
        }
        return null;
    }
}
