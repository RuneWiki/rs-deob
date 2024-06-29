import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class238 extends class60 {

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[La;")
    public class290[] field3582;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I[La;)V", line = 4)
    public class238(int arg0, class290[] arg1) {
        this.field3581 = arg0;
        this.field3582 = arg1;
    }
}
