import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class259 extends OutputStream {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4152 = 0;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Ltu;")
    public static class7 field4151;

    @OriginalMember(owner = "client!j", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4154++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1821(int arg0) {
        if (arg0 != -8) {
            method1822(12, 57, 14, 28, -70);
        }
        field4151 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 46) {
            return;
        }
        field4153++;
        if (class402.field5935 == 1) {
            class528.field7732[class381.field5600 / 100].method2316(class537.field7882 - 8, class307.field4695 + -8);
        }
        if (class402.field5935 == 2) {
            class528.field7732[class381.field5600 / 100 + 4].method2316(class537.field7882 - 8, class307.field4695 + -8);
        }
        class11.method65(1);
    }
}
