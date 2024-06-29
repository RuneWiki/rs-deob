import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class61 extends class28 {

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Ljava/lang/String;")
    public String field848;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "F")
    public static float field845;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lpq;")
    public static class159 field846;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method381(int arg0) {
        field846 = null;
        if (arg0 != -32529) {
            method382(-29, -126, 52);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z")
    public static final boolean method382(int arg0, int arg1, int arg2) {
        if (arg1 <= 95) {
            return false;
        } else {
            field849++;
            return (arg0 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class61() {
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class61(String arg0) {
        this.field848 = arg0;
    }
}
