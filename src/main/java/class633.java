import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class633 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Llj;")
    public static class633 field8885 = new class633();

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Llj;")
    public static class633 field8887 = new class633();

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Llj;")
    public static class633 field8888 = new class633();

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Llj;")
    public static class633 field8889 = new class633();

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field8891 = -1;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
    public static int[] field8892;

    @OriginalMember(owner = "client!lj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8884++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method3622(byte arg0) {
        field8892 = null;
        field8885 = null;
        field8887 = null;
        if (arg0 > 90) {
            field8889 = null;
            field8888 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static final void method3623(byte arg0) {
        field8886++;
        int var1 = -65 % ((10 - arg0) / 51);
        if (class239.field3592 != null) {
            try {
                class239.field3592.close();
            } catch (IOException var2) {
            }
        }
        class239.field3592 = null;
    }
}
