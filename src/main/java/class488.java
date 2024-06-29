import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class488 extends class498 {

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field6819;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6817 = null;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Lej;")
    public static class179 field6818;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method2959(int arg0) {
        if (arg0 != -745) {
            method2959(-108);
        }
        field6818 = null;
        field6817 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
    public class488(int arg0) {
        this.field6819 = arg0;
    }
}
