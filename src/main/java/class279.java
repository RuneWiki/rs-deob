import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class279 implements class343 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Ljava/lang/String;")
    private String field3823;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lsea;")
    private class648 field3827;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lem;")
    public static class206 field3821 = new class206(66, 3);

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Z")
    public static boolean field3824 = true;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3825 = 0;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)I", line = 4)
    public final int method301(int arg0) {
        field3828++;
        if (this.field3827.method3637(false, this.field3823)) {
            return 100;
        } else {
            if (arg0 != 28158) {
                field3824 = true;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 21)
    public static void method1723(boolean arg0) {
        field3821 = null;
        if (arg0) {
            field3826 = 68;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lmv;", line = 35)
    public final class342 method302(byte arg0) {
        if (arg0 >= -88) {
            field3821 = null;
        }
        field3822++;
        return class342.field4585;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lsea;Ljava/lang/String;)V", line = 56)
    public class279(class648 arg0, String arg1) {
        this.field3823 = arg1;
        this.field3827 = arg0;
    }
}
