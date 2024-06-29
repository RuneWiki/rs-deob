import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class41 extends class499 {

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lau;")
    public class516 field612;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Lbp;")
    public class261 field618;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method297(int arg0) {
        field613++;
        this.field615 = this.field612.field7653;
        this.field611 = this.field612.field7652;
        this.field614 = this.field612.field7647;
        if (this.field612.field7644 != null) {
            this.field612.field7644.method972(this.field618.field3467, this.field618.field3463, this.field618.field3459, class247.field3278);
        }
        this.field617 = class247.field3278[arg0];
        this.field616 = class247.field3278[2];
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lau;Llr;)V")
    public class41(class516 arg0, class527 arg1) {
        this.field612 = arg0;
        this.field618 = this.field612.method3043(-125);
        this.method297(0);
    }
}
