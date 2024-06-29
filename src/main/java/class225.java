import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class225 extends class159 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[Lmo;")
    public class360[] field3523;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I[Lmo;)V", line = 4)
    public class225(int arg0, class360[] arg1) {
        this.field3524 = arg0;
        this.field3523 = arg1;
    }
}
