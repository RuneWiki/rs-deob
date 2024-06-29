import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class527 {

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field7312 = 0;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field7314 = 0;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3131(int arg0) {
        field7313++;
        if (arg0 != -1) {
            return;
        }
        for (class379 var1 = (class379) class76.field1112.method3618(-119); var1 != null; var1 = (class379) class76.field1112.method3619(0)) {
            class711 var2 = var1.field5428;
            if (var2.field9918) {
                var1.method549(6410);
                var2.method4002((byte) 27);
            } else if (class483.field6741 >= var2.field9912) {
                var2.method4001(arg0 + 1, class449.field6216);
                if (var2.field9918) {
                    var1.method549(arg0 ^ 0xFFFFE6F5);
                } else {
                    class117.method738(var2, true);
                }
            }
        }
    }
}
