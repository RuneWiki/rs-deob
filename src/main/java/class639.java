import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class639 extends class434 {

    @OriginalMember(owner = "client!hda", name = "bb", descriptor = "Ljb;")
    public class670 field8892;

    @OriginalMember(owner = "client!hda", name = "ab", descriptor = "Lnj;")
    public static class415 field8891 = new class415(80, 8);

    @OriginalMember(owner = "client!hda", name = "cb", descriptor = "I")
    public static int field8893 = -1;

    @OriginalMember(owner = "client!hda", name = "Z", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
    public final void method2479(byte arg0) {
        this.field8892 = new class670((class110) super.field5596);
        ++field8890;
        if (arg0 != -18) {
            method3524(-127);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public static void method3524(int arg0) {
        field8891 = null;
        if (arg0 > -56) {
            field8891 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Ljfa;)V")
    public class639(class110 arg0) {
        super(arg0);
        this.field8892 = new class670(arg0);
        super.field5619 = new class55(super.field5596);
        super.field5608 = new class55(super.field5596);
        super.field5609 = new class55(super.field5596);
        super.field5600 = new class55(super.field5596);
        super.field5601 = new class55(super.field5596);
        super.field5628 = new class55(super.field5596);
        super.field5625 = new class55(super.field5596);
        super.field5618 = new class55(super.field5596);
        super.field5606 = new class55(super.field5596);
        super.field5630 = new class55(super.field5596);
    }
}
