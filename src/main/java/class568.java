import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class568 extends class362 {

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "Ljava/lang/String;")
    public String field7814;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field7816 = 0;

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "[[B")
    public static byte[][] field7815;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 4)
    public static void method3286(int arg0) {
        if (arg0 >= 108) {
            field7815 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 15)
    public static final void method3287(int arg0) {
        class141.field2335 = null;
        class692.field9363 = null;
        class525.field7271 = null;
        field7813++;
        if (arg0 != 13022) {
            method3286(-79);
        }
        class587.field8002 = false;
        class262.field3752 = null;
        class272.field3823 = null;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V", line = 33)
    public class568() {
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 35)
    public class568(String arg0) {
        this.field7814 = arg0;
    }

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)I", line = 44)
    public static final int method3288(int arg0) {
        if (arg0 != 0) {
            method3288(101);
        }
        field7817++;
        return class665.method3728(2012104999, false);
    }
}
