import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class class567 extends class209 {

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public int field7101;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public int field7104;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public int field7102;

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIII)V")
    public class567(int arg0, int arg1, int arg2, int arg3) {
        this.field7103 = arg3;
        this.field7101 = arg1;
        this.field7104 = arg2;
        this.field7102 = arg0;
    }
}
