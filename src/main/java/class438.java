import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class438 extends class405 {

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "Lrb;")
    public class284 field6448;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field6447 = 0;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2365(int arg0);

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lrb;I)V")
    public class438(class284 arg0, int arg1) {
        this.field6448 = arg0;
        this.field6449 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)Z")
    public abstract boolean method2368(int arg0);
}
