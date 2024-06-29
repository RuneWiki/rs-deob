import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class497 extends class435 {

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "S")
    public short field7404;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
    public static int field7402 = -1;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)V", line = 4)
    public static final void method2978(int arg0, int arg1) {
        field7403++;
        class440.field6371 = arg1;
        class106.field1751 = 100;
        class277.field3924 = -1;
        class530.field7820 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V", line = 22)
    public class497() {
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(S)V", line = 24)
    public class497(short arg0) {
        this.field7404 = arg0;
    }
}
