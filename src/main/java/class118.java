import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class118 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    private int field1635 = 0;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    private int field1637 = 0;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lap;")
    private class26 field1639 = null;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lnm;")
    private class254 field1638;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lvq;")
    private class326 field1636;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[Lwf;")
    private class30[] field1634;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIZI)V")
    public final void method841(boolean arg0, int arg1, boolean arg2, int arg3) {
        boolean var5 = arg0 & this.field1638.method566();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg1 <= 77) {
            return;
        }
        if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field1635 != arg3) {
            if (this.field1635 != 0) {
                this.field1634[Integer.MAX_VALUE & this.field1635].method261();
            }
            if (arg3 != 0) {
                this.field1634[Integer.MAX_VALUE & arg3].method265(arg2);
                this.field1634[arg3 & Integer.MAX_VALUE].method263(arg2);
            }
            this.field1635 = arg3;
            this.field1637 = Integer.MIN_VALUE;
            this.field1639 = null;
        } else if (this.field1635 != 0) {
            this.field1634[Integer.MAX_VALUE & this.field1635].method263(arg2);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    public final boolean method842(int arg0, int arg1) {
        if (arg0 > -50) {
            this.method842(58, -99);
        }
        return this.field1634[arg1].method262();
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZII)V")
    public final void method843(boolean arg0, int arg1, int arg2) {
        if ((arg0 | this.field1637 != arg2) & this.field1635 != arg1) {
            this.field1634[this.field1635 & Integer.MAX_VALUE].method264(arg2);
            this.field1637 = arg2;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lap;B)Z")
    public final boolean method844(class26 arg0, byte arg1) {
        if (this.field1635 == 0) {
            return false;
        }
        if (this.field1639 != arg0) {
            this.field1634[Integer.MAX_VALUE & this.field1635].method266(arg0);
            this.field1639 = arg0;
        }
        return arg1 > -72 ? true : true;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lnm;)V")
    public class118(class254 arg0) {
        this.field1638 = arg0;
        this.field1636 = new class326(arg0);
        this.field1634 = new class30[9];
        this.field1634[1] = new class457(arg0);
        this.field1634[2] = new class168(arg0, this.field1636);
        this.field1634[4] = new class196(arg0, this.field1636);
        this.field1634[5] = new class455(arg0, this.field1636);
        this.field1634[6] = new class224(arg0);
        this.field1634[7] = new class192(arg0);
        this.field1634[3] = new class185(arg0);
        this.field1634[8] = this.field1634[4];
    }
}
