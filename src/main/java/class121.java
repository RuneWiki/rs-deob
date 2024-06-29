import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class121 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    private int field1684 = 0;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    private int field1682 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lme;")
    private class360 field1686 = null;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Lnf;")
    private class256 field1681;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lqg;")
    private class155 field1683;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[Lkm;")
    private class436[] field1685;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Z", line = 5)
    public final boolean method774(int arg0, int arg1) {
        return arg0 == 3973 ? this.field1685[arg1].method159() : true;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lnf;)V", line = 101)
    public class121(class256 arg0) {
        this.field1681 = arg0;
        this.field1683 = new class155(arg0);
        this.field1685 = new class436[9];
        this.field1685[1] = new class381(arg0);
        this.field1685[2] = new class325(arg0, this.field1683);
        this.field1685[4] = new class208(arg0, this.field1683);
        this.field1685[5] = new class303(arg0, this.field1683);
        this.field1685[6] = new class141(arg0);
        this.field1685[7] = new class24(arg0);
        this.field1685[3] = new class109(arg0);
        this.field1685[8] = this.field1685[4];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZB)V", line = 29)
    public final void method775(int arg0, boolean arg1, byte arg2) {
        if ((arg1 | this.field1684 != arg0) & this.field1682 != 0) {
            this.field1685[Integer.MAX_VALUE & this.field1682].method162(arg0);
            this.field1684 = arg0;
        }
        int var4 = 103 / ((5 - arg2) / 59);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZZB)V", line = 44)
    public final void method776(int arg0, boolean arg1, boolean arg2, byte arg3) {
        boolean var5 = arg1 & this.field1681.method1734();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg3 != -103) {
            this.field1681 = (class256) null;
        }
        if (this.field1682 != arg0) {
            if (this.field1682 != 0) {
                this.field1685[this.field1682 & Integer.MAX_VALUE].method157();
            }
            if (arg0 != 0) {
                this.field1685[arg0 & Integer.MAX_VALUE].method158(arg2);
                this.field1685[arg0 & Integer.MAX_VALUE].method161(arg2);
            }
            this.field1684 = Integer.MIN_VALUE;
            this.field1682 = arg0;
            this.field1686 = null;
        } else if (this.field1682 != 0) {
            this.field1685[Integer.MAX_VALUE & this.field1682].method161(arg2);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZLme;)Z", line = 83)
    public final boolean method777(boolean arg0, class360 arg1) {
        if (this.field1682 == 0) {
            return false;
        }
        if (this.field1686 != arg1) {
            this.field1685[this.field1682 & Integer.MAX_VALUE].method160(arg1);
            this.field1686 = arg1;
        }
        if (arg0) {
            this.field1682 = 116;
        }
        return true;
    }
}
