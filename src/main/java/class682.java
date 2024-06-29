import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class682 extends class508 {

    @OriginalMember(owner = "client!mt", name = "x", descriptor = "Lqg;")
    public class214 field9588;

    @OriginalMember(owner = "client!mt", name = "v", descriptor = "Lvj;")
    public class422 field9586;

    @OriginalMember(owner = "client!mt", name = "s", descriptor = "I")
    public int field9583;

    @OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
    public int field9584;

    @OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
    public int field9585;

    @OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
    public int field9589;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "I")
    public int field9590;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
    public final void method3841(byte arg0) {
        this.field9585 = this.field9588.field2663;
        this.field9583 = this.field9588.field2664;
        field9587++;
        this.field9590 = this.field9588.field2657;
        if (this.field9588.field2667 != null) {
            this.field9588.field2667.method905(this.field9586.field5302, this.field9586.field5303, this.field9586.field5292, class350.field4470);
        }
        this.field9589 = class350.field4470[0];
        if (arg0 <= 6) {
            this.field9590 = 126;
        }
        this.field9584 = class350.field4470[2];
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lqg;Ltq;)V")
    public class682(class214 arg0, class93 arg1) {
        this.field9588 = arg0;
        this.field9586 = this.field9588.method1270(126);
        this.method3841((byte) 80);
    }
}
