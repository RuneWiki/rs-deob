import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class312 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lci;")
    public static class320 field4655;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 6)
    public static void method1984(byte arg0) {
        if (arg0 <= 85) {
            method1985(true);
        }
        field4655 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method1985(boolean arg0) {
        class316.field4697.method2980(-182819096);
        field4656++;
        class425.field6026.method2980(-182819096);
        if (!arg0) {
            field4655 = null;
        }
        class248.field3697.method2980(-182819096);
        class260.field3847.method2980(-182819096);
        class316.field4701.method2980(-182819096);
    }
}
