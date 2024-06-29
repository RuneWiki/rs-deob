import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class96 extends class287 {

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Lqe;")
    public class502 field1545;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Lsq;")
    public class363 field1547;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Ldk;")
    public static class421 field1552;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
    public final void method774(int arg0) {
        this.field1551 = this.field1545.field7332;
        this.field1546 = this.field1545.field7333;
        int var2 = -33 / ((-arg0 - 47) / 36);
        field1543++;
        this.field1549 = this.field1545.field7338;
        if (this.field1545.field7345 != null) {
            this.field1545.field7345.method945(this.field1547.field5206, this.field1547.field5209, this.field1547.field5208, class473.field6848);
        }
        this.field1548 = class473.field6848[0];
        this.field1544 = class473.field6848[2];
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V")
    public static void method775(int arg0) {
        field1552 = null;
        if (arg0 != 0) {
            method775(112);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lqe;Lbv;)V")
    public class96(class502 arg0, class471 arg1) {
        this.field1545 = arg0;
        this.field1547 = this.field1545.method2984((byte) 81);
        this.method774(-108);
    }
}
