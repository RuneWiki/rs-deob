import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class363 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "B")
    public byte field5287;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "B")
    public byte field5290;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "S")
    public short field5288;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lti;")
    public class254 field5289;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lpo;Lti;III)V", line = 8)
    public class363(class332 arg0, class254 arg1, int arg2, int arg3, int arg4) {
        this.field5287 = (byte) arg4;
        this.field5290 = (byte) arg3;
        this.field5288 = (short) arg2;
        this.field5289 = arg1;
    }
}
