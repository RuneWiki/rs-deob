import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class584 extends class143 {

    @OriginalMember(owner = "client!mda", name = "J", descriptor = "Lcea;")
    public class94 field8557;

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "Lrba;")
    public class102 field8549;

    @OriginalMember(owner = "client!mda", name = "K", descriptor = "Lkq;")
    public static class696 field8558 = new class696(3, 2);

    @OriginalMember(owner = "client!mda", name = "M", descriptor = "Ljava/lang/String;")
    public static String field8560 = null;

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "F")
    public static float field8555;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "I")
    public int field8550;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
    public int field8551;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "I")
    public int field8552;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
    public int field8554;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
    public int field8556;

    @OriginalMember(owner = "client!mda", name = "L", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public static void method3373(int arg0) {
        field8560 = null;
        if (arg0 == 0) {
            field8558 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V")
    public static final void method3374(int arg0) {
        if (arg0 != -6) {
            field8558 = null;
        }
        if (class515.field7636 == 9) {
            class595.method3408((byte) 18, 5);
        } else if (class515.field7636 == 5 || class515.field7636 == 6) {
            class595.method3408((byte) 24, 3);
        } else if (class515.field7636 == 12) {
            class595.method3408((byte) 49, 3);
        }
        field8553++;
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
    public final void method3375(int arg0) {
        field8559++;
        this.field8550 = this.field8557.field1389;
        this.field8552 = this.field8557.field1396;
        this.field8556 = this.field8557.field1391;
        if (this.field8557.field1394 != null) {
            this.field8557.field1394.method183(this.field8549.field1664, this.field8549.field1660, this.field8549.field1669, class406.field5830);
        }
        this.field8551 = class406.field5830[arg0];
        this.field8554 = class406.field5830[0];
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lcea;Lhda;)V")
    public class584(class94 arg0, class635 arg1) {
        this.field8557 = arg0;
        this.field8549 = this.field8557.method722(false);
        this.method3375(2);
    }
}
