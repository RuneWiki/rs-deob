import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class462 extends class219 {

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lrf;")
    public class92 field6599;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Loha;")
    public class771 field6598;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field6594;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public int field6597;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public int field6600;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public int field6601;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public int field6602;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Lcv;")
    public static class592 field6595;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 3)
    public final void method2744(byte arg0) {
        this.field6600 = this.field6599.field1203;
        this.field6602 = this.field6599.field1202;
        this.field6597 = this.field6599.field1205;
        field6596++;
        if (this.field6599.field1199 != null) {
            this.field6599.field1199.method1965(this.field6598.field10629, this.field6598.field10625, this.field6598.field10640, class177.field2695);
        }
        this.field6594 = class177.field2695[0];
        if (arg0 > -79) {
            this.field6597 = 52;
        }
        this.field6601 = class177.field2695[2];
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 28)
    public static void method2745(int arg0) {
        if (arg0 < 16) {
            method2745(99);
        }
        field6595 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lrf;Lqo;)V", line = 46)
    public class462(class92 arg0, class24 arg1) {
        this.field6599 = arg0;
        this.field6598 = this.field6599.method656(-19478);
        this.method2744((byte) -91);
    }
}
