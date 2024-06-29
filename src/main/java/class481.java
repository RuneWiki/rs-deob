import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class481 extends class22 {

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field6529 = 0;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lig;)V")
    public static final void method2836(class674 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class269.field3635[var1]; var2++) {
                if (class261.field3566[var1][var2] == arg0) {
                    class34.method242(class261.field3566[var1], var2 + 1, class261.field3566[var1], var2, class269.field3635[var1] - var2 - 1);
                    var10002 = class269.field3635[var1]--;
                    class380.field5357 = true;
                    return;
                }
            }
            for (int var3 = 0; var3 < class352.field4548[var1]; var3++) {
                if (class160.field2206[var1][var3] == arg0) {
                    class34.method242(class160.field2206[var1], var3 + 1, class160.field2206[var1], var3, class352.field4548[var1] - var3 - 1);
                    var10002 = class352.field4548[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class609.field8671[var1]; var4++) {
                if (class140.field1931[var1][var4] == arg0) {
                    class34.method242(class140.field1931[var1], var4 + 1, class140.field1931[var1], var4, class609.field8671[var1] - var4 - 1);
                    var10002 = class609.field8671[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Luia;")
    public abstract class273 method796(int arg0);
}
