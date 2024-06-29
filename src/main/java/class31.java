import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
    private boolean field546;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Z")
    private boolean field554;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        if (arg0 < 22) {
            this.method195(-105);
        }
        field547++;
        return this.field546;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
    public final int method193(int arg0) {
        if (arg0 != 0) {
            this.field548 = 85;
        }
        field553++;
        return this.field550;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I")
    public final int method194(int arg0) {
        field552++;
        return arg0 == 0 ? this.field548 : -69;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)Z")
    public final boolean method195(int arg0) {
        if (arg0 != 5583) {
            this.method193(29);
        }
        field551++;
        return this.field554;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ZIIZ)V")
    public class31(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field546 = arg3;
        this.field550 = arg1;
        this.field548 = arg2;
        this.field554 = arg0;
    }
}
