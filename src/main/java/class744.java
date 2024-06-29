import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class744 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "S")
    public short field9993;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "B")
    public byte field9995;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "B")
    public byte field9997;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lhca;")
    public class490 field9994;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lhq;")
    public static class160 field9996;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lin;")
    public static class91 field9998;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method4072(int arg0) {
        if (arg0 != -9341) {
            method4072(-16);
        }
        field9998 = null;
        field9996 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lhca;III)V")
    public class744(class490 arg0, int arg1, int arg2, int arg3) {
        this.field9993 = (short) arg1;
        this.field9995 = (byte) arg3;
        this.field9997 = (byte) arg2;
        this.field9994 = arg0;
    }
}
