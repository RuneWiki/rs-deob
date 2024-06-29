import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class494 {

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public int field7111;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "[I")
    public int[] field7110;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "[I")
    public int[] field7108;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "Z")
    public static boolean field7107 = false;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZI)V", line = 6)
    public static final void method3008(boolean arg0, int arg1) {
        field7109++;
        if (class683.field9700.length() == arg1) {
            return;
        }
        class646.method3726("--> " + class683.field9700, -91);
        class368.method2316(arg0, class683.field9700, false, 10);
        class308.field4179 = 0;
        class683.field9700 = "";
        class514.field7446 = 0;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(I)V", line = 25)
    public class494(int arg0) {
        this.field7111 = arg0;
        this.field7110 = new int[this.field7111];
        this.field7108 = new int[this.field7111];
    }
}
