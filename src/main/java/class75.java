import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class75 {

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Z")
    public static boolean field787 = false;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 3)
    public static final void method481(int arg0) {
        class526.method2992((long) class469.field6549, class453.field6284, 64);
        field788++;
        if (class397.field5320 != -1) {
            class511.method2929(class397.field5320, 255);
        }
        for (int var1 = arg0; var1 < class675.field9572; var1++) {
            if (class406.field5409[var1]) {
                class663.field9429[var1] = true;
            }
            class576.field8221[var1] = class406.field5409[var1];
            class406.field5409[var1] = false;
        }
        class390.field5213 = class469.field6549;
        if (class453.field6284.method315()) {
            class234.field2983 = true;
        }
        if (class397.field5320 != -1) {
            class675.field9572 = 0;
            class607.method3383((byte) -123);
        }
        class453.field6284.method378();
        class397.method2171(2, class453.field6284);
        int var2 = class145.method793(true);
        if (var2 == -1) {
            var2 = class378.field4915;
        }
        if (var2 == -1) {
            var2 = class191.field2305;
        }
        class625.method3495(var2, -1);
        class233.field2978 = 0;
    }
}
