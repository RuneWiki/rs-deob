import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class26 {

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "S")
    public short field456;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "B")
    public byte field454;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "B")
    public byte field457;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lmp;")
    public class89 field455;

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lse;Lmp;III)V")
    public class26(class282 arg0, class89 arg1, int arg2, int arg3, int arg4) {
        this.field456 = (short) arg2;
        this.field454 = (byte) arg3;
        this.field457 = (byte) arg4;
        this.field455 = arg1;
    }
}
