import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class279 {

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lpe;")
    private class615 field3652;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field3653 = 0;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "F")
    public static float field3654 = 1.0F;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;)V", line = 16)
    public static final void method1683(String arg0, byte arg1, File arg2) {
        if (arg1 >= -87) {
            field3654 = -0.6869991F;
        }
        field3655++;
        class305.field4010.put(arg0, arg2);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 43)
    public class279(class635 arg0, int arg1, class615 arg2) {
        new class668(64);
        this.field3652 = arg2;
        this.field3649 = this.field3652.method3341(15, -19046);
    }
}
