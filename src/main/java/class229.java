import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class229 extends class35 {

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static final void method1707(byte arg0) {
        field3351++;
        int var1 = 86 % ((41 - arg0) / 51);
        for (class39 var2 = (class39) class83.field1358.method2488(2); var2 != null; var2 = (class39) class83.field1358.method2488(2)) {
            class416.method2601((byte) 112, var2);
        }
        client.method1816();
        client.method1809();
        client.method1813();
        client.method1821();
        client.method1812();
        client.method1818();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(CI)C")
    public static final char method1708(char arg0, int arg1) {
        field3350++;
        return ~arg0 == arg1 || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }
}
