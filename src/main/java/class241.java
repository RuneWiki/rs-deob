import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class241 extends class366 {

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "Lrl;")
    public class430 field3550;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "Lvd;")
    public class26 field3557;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "F")
    public static float field3553 = 1024.0F;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "Z")
    public static boolean field3551 = false;

    @OriginalMember(owner = "client!ep", name = "Q", descriptor = "[Lao;")
    public static class158[] field3561 = new class158[0];

    @OriginalMember(owner = "client!ep", name = "R", descriptor = "Lub;")
    public static class15 field3562 = new class15(256);

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public int field3558;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ep", name = "S", descriptor = "I")
    public int field3563;

    @OriginalMember(owner = "client!ep", name = "T", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!ep", name = "U", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ep", name = "V", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ep", name = "W", descriptor = "[Luh;")
    public static class92[] field3567;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(IB)V")
    public static final void method1643(int arg0, byte arg1) {
        class425.field6069.method91(arg1 + 72, arg0);
        if (arg1 != -68) {
            method1643(36, (byte) 73);
        }
        field3559++;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public final void method1644(int arg0) {
        this.field3563 = this.field3550.field6119;
        this.field3554 = this.field3550.field6111;
        field3556++;
        this.field3564 = this.field3550.field6117;
        if (this.field3550.field6114 != null) {
            this.field3550.field6114.method1147(this.field3557.field330, this.field3557.field333, this.field3557.field329, class109.field1414);
        }
        if (arg0 != 7177) {
            field3555 = 63;
        }
        this.field3549 = class109.field1414[2];
        this.field3558 = class109.field1414[0];
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLtj;Ltj;)V")
    public static final void method1645(boolean arg0, class108 arg1, class108 arg2) {
        field3552++;
        class212.field3003 = arg2;
        if (arg0) {
            method1646(-60);
        }
        class84.field1070 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
    public static void method1646(int arg0) {
        field3561 = null;
        if (arg0 == -2716) {
            field3567 = null;
            field3562 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lrl;Lnl;)V")
    public class241(class430 arg0, class328 arg1) {
        this.field3550 = arg0;
        this.field3557 = class394.method2484(arg0.field6121, 24111);
        this.method1644(7177);
    }
}
