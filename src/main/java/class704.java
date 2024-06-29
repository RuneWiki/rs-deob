import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class704 extends class504 {

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public int field9905;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "Z")
    public static boolean field9907 = false;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Lbi;")
    public static class449 field9906;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3889(int arg0) {
        field9906 = null;
        if (arg0 != 23014) {
            method3889(66);
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
    public class704() {
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(I)V")
    public class704(int arg0) {
        this.field9905 = arg0;
    }
}
