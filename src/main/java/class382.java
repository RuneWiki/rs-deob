import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class382 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    private int field5721 = 0;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    private int field5722 = 0;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Ldg;")
    private class223 field5723 = null;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "Lih;")
    private class330 field5725;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Lrj;")
    private class12 field5726;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[Laq;")
    private class233[] field5724;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZI)V", line = 5)
    public final void method2512(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 != 0) {
            this.method2515(false, -77, true);
        }
        boolean var5 = arg2 & this.field5725.method2165();
        if (!var5 && (arg1 == 4 || arg1 == 8)) {
            arg1 = 2;
        }
        if (arg1 != 0 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field5721 != arg1) {
            if (this.field5721 != 0) {
                this.field5724[Integer.MAX_VALUE & this.field5721].method826();
            }
            if (arg1 != 0) {
                this.field5724[Integer.MAX_VALUE & arg1].method829(arg0);
                this.field5724[Integer.MAX_VALUE & arg1].method827(arg0);
            }
            this.field5722 = Integer.MIN_VALUE;
            this.field5721 = arg1;
            this.field5723 = null;
        } else if (this.field5721 != 0) {
            this.field5724[Integer.MAX_VALUE & this.field5721].method827(arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lih;)V", line = 99)
    public class382(class330 arg0) {
        this.field5725 = arg0;
        this.field5726 = new class12(arg0);
        this.field5724 = new class233[9];
        this.field5724[1] = new class253(arg0);
        this.field5724[2] = new class260(arg0, this.field5726);
        this.field5724[4] = new class147(arg0, this.field5726);
        this.field5724[5] = new class118(arg0, this.field5726);
        this.field5724[6] = new class352(arg0);
        this.field5724[7] = new class427(arg0);
        this.field5724[3] = new class211(arg0);
        this.field5724[8] = this.field5724[4];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z", line = 48)
    public final boolean method2513(byte arg0, int arg1) {
        return arg0 == 126 ? this.field5724[arg1].method830() : true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILdg;)Z", line = 58)
    public final boolean method2514(int arg0, class223 arg1) {
        if (this.field5721 == arg0) {
            return false;
        }
        if (this.field5723 != arg1) {
            this.field5724[this.field5721 & Integer.MAX_VALUE].method825(arg1);
            this.field5723 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZ)V", line = 84)
    public final void method2515(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field5725 = (class330) null;
        }
        if (this.field5721 != 0 & (this.field5722 != arg1 | arg0)) {
            this.field5724[Integer.MAX_VALUE & this.field5721].method828(arg1);
            this.field5722 = arg1;
        }
    }
}
