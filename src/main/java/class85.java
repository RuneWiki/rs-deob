import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class85 extends class417 {

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "Lbu;")
    public class19 field1212 = new class19();

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "Llu;")
    public static class610 field1213 = new class610(27, 2);

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V", line = 6)
    public static void method638(byte arg0) {
        field1213 = null;
        if (arg0 != 86) {
            field1213 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V", line = 17)
    public static final void method639(int arg0) {
        if (arg0 != 2) {
            return;
        }
        for (class14 var1 = (class14) class1.field5.method124((byte) 42); var1 != null; var1 = (class14) class1.field5.method120(arg0 ^ 0x26)) {
            if (var1.field140) {
                var1.method103((byte) 126);
            }
        }
        field1214++;
        for (class14 var2 = (class14) class615.field9103.method124((byte) 42); var2 != null; var2 = (class14) class615.field9103.method120(-108)) {
            if (var2.field140) {
                var2.method103((byte) 126);
            }
        }
    }
}
