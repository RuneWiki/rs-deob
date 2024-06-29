import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class135 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "B")
    public byte field1727;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "B")
    public byte field1728;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lip;")
    public class49 field1726;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "S")
    public short field1729;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lql;Lip;III)V", line = 7)
    public class135(class346 arg0, class49 arg1, int arg2, int arg3, int arg4) {
        this.field1727 = (byte) arg4;
        this.field1728 = (byte) arg3;
        this.field1726 = arg1;
        this.field1729 = (short) arg2;
    }
}
