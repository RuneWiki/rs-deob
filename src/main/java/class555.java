import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class555 {

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lqq;")
    public class651 field7580;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
    public void method120(byte arg0) {
        if (arg0 > -118) {
            this.field7580 = null;
        }
        field7579++;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public void method122(int arg0) {
        field7578++;
        if (arg0 != 12844) {
            this.field7580 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
    public void method119(int arg0) {
        if (arg0 > -94) {
            this.field7580 = null;
        }
        field7577++;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lot;BI)V")
    public abstract void method127(class222 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
    public abstract void method126(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
    public void method118(boolean arg0) {
        if (!arg0) {
            field7576++;
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Z")
    public abstract boolean method125(int arg0);

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
    public void method128(int arg0) {
        if (arg0 == -6486) {
            field7581++;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lqq;)V")
    public class555(class651 arg0) {
        this.field7580 = arg0;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZZ)V")
    public abstract void method124(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
    public abstract void method121(byte arg0);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V")
    public abstract void method117(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
    public void method129(int arg0) {
        field7582++;
        if (arg0 < 33) {
            this.method128(33);
        }
    }
}
