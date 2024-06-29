import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class717 {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "B")
    public byte field10089;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "B")
    public byte field10087;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "S")
    public short field10084;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lic;")
    public class726 field10091;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field10086 = 1;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lic;III)V")
    public class717(class726 arg0, int arg1, int arg2, int arg3) {
        this.field10089 = (byte) arg3;
        this.field10087 = (byte) arg2;
        this.field10084 = (short) arg1;
        this.field10091 = arg0;
    }
}
