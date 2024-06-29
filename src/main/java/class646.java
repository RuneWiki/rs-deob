import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class646 {

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "B")
    private byte field9108;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field9107;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field9112;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public int field9113;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field9106;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field9110;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I")
    public final int method3759(int arg0) {
        field9111++;
        if (arg0 != 7) {
            this.method3760(18);
        }
        return this.field9108 & 0x7;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class646() {
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
    public final int method3760(int arg0) {
        field9109++;
        if (arg0 != 1) {
            this.field9112 = 115;
        }
        return (this.field9108 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lrg;)V")
    public class646(class645 arg0) {
        this.field9108 = arg0.method3743(true);
        this.field9107 = arg0.method3712((byte) -104);
        this.field9112 = arg0.method3720(-19541);
        this.field9113 = arg0.method3720(-19541);
        this.field9106 = arg0.method3720(-19541);
        this.field9110 = arg0.method3720(-19541);
    }
}
