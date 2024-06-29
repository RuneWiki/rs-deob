import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class123 extends class424 {

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field1591 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field1593 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public int field1590 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public int field1594 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public int field1598 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public int field1597 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field1595 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public int field1603 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Lkq;")
    public class700 field1596;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field1599 = 0;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "Lnj;")
    public static class415 field1602 = new class415(25, 7);

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "J")
    public static long field1592;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    public static void method911(boolean arg0) {
        field1602 = null;
        if (!arg0) {
            method911(true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Z")
    public final boolean method912(int arg0, int arg1, int arg2) {
        if (arg0 != Integer.MAX_VALUE) {
            this.field1594 = -53;
        }
        field1600++;
        if (this.field1595 <= arg1 && this.field1594 >= arg1 && this.field1590 <= arg2 && this.field1597 >= arg2) {
            return true;
        } else {
            return this.field1593 <= arg1 && this.field1598 >= arg1 && this.field1591 <= arg2 && this.field1603 >= arg2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lkq;)V")
    public class123(class700 arg0) {
        this.field1596 = arg0;
    }
}
