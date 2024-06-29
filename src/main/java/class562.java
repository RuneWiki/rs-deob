import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class562 extends class379 {

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "Ljava/lang/String;")
    public String field7772;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
    public static final void method3263(int arg0, int arg1) {
        field7773++;
        if (class289.field3493 != 7 || class303.field3619 != 0 || class5.field53 != 0) {
            return;
        }
        class506.field7198 = arg1;
        class48.method454(9, -1);
        if (arg0 >= 59) {
            ;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class562() {
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class562(String arg0) {
        this.field7772 = arg0;
    }
}
