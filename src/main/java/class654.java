import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class654 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    public static final void method3746(boolean arg0) {
        field9131++;
        int var1 = class514.field7278;
        int[] var2 = class522.field7381;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class702 var4 = class767.field10560[var2[var3]];
            if (var4 != null) {
                class724.method4062(48, var4.method2102(!arg0), var4);
            }
        }
    }
}
