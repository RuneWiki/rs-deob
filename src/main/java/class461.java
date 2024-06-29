import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class461 {

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2742(int arg0) {
        class55 var1 = class175.field2676;
        synchronized (class175.field2676) {
            if (arg0 != 16440) {
                return;
            }
            class175.field2676.method484(43);
        }
        field6909++;
        class55 var2 = class345.field5180;
        synchronized (class345.field5180) {
            class345.field5180.method484(-107);
        }
    }
}
