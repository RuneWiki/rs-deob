import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class160 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "B")
    public byte field2430;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "S")
    public short field2429;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "B")
    public byte field2432;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Luq;")
    public class233 field2431;

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lge;Luq;III)V", line = 8)
    public class160(class104 arg0, class233 arg1, int arg2, int arg3, int arg4) {
        this.field2430 = (byte) arg3;
        this.field2429 = (short) arg2;
        this.field2432 = (byte) arg4;
        this.field2431 = arg1;
    }
}
