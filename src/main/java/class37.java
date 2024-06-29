import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class37 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field554 = 3353893;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method246(boolean arg0) {
        for (int var1 = -1; var1 < class345.field5501; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class306.field4895[var1];
            }
            class258 var3 = class56.field924[var2];
            if (var3 != null) {
                class70.method598(var3.method1634(-1), var3, 13402);
            }
        }
        if (!arg0) {
            field555++;
        }
    }
}
