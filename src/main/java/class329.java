import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class329 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    private int field4389 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    private int field4391 = 0;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lna;")
    private class50 field4387 = null;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lql;")
    private class346 field4392;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lbo;")
    private class354 field4388;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "[Lha;")
    private class48[] field4390;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)Z")
    public final boolean method1884(int arg0, byte arg1) {
        int var3 = -32 % ((-arg1 - 16) / 49);
        return this.field4390[arg0].method74();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lna;B)Z")
    public final boolean method1885(class50 arg0, byte arg1) {
        if (this.field4391 == 0) {
            return false;
        }
        if (arg1 != -10) {
            this.field4390 = (class48[]) null;
        }
        if (this.field4387 != arg0) {
            this.field4390[this.field4391 & Integer.MAX_VALUE].method71(arg0);
            this.field4387 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIZI)V")
    public final void method1886(boolean arg0, int arg1, boolean arg2, int arg3) {
        boolean var5 = arg2 & this.field4392.method1632();
        if (arg1 != 5) {
            this.method1886(true, 59, false, -49);
        }
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg0) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field4391 != arg3) {
            if (this.field4391 != 0) {
                this.field4390[this.field4391 & Integer.MAX_VALUE].method72();
            }
            if (arg3 != 0) {
                this.field4390[arg3 & Integer.MAX_VALUE].method73(arg0);
                this.field4390[Integer.MAX_VALUE & arg3].method70(arg0);
            }
            this.field4391 = arg3;
            this.field4387 = null;
            this.field4389 = Integer.MIN_VALUE;
        } else if (this.field4391 != 0) {
            this.field4390[this.field4391 & Integer.MAX_VALUE].method70(arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZIZ)V")
    public final void method1887(boolean arg0, int arg1, boolean arg2) {
        if (this.field4391 != 0 & (arg0 | this.field4389 != arg1)) {
            this.field4390[Integer.MAX_VALUE & this.field4391].method69(arg1);
            this.field4389 = arg1;
        }
        if (!arg2) {
            this.field4389 = 15;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lql;)V")
    public class329(class346 arg0) {
        this.field4392 = arg0;
        this.field4388 = new class354(arg0);
        this.field4390 = new class48[9];
        this.field4390[1] = new class276(arg0);
        this.field4390[2] = new class31(arg0, this.field4388);
        this.field4390[4] = new class273(arg0, this.field4388);
        this.field4390[5] = new class35(arg0, this.field4388);
        this.field4390[6] = new class25(arg0);
        this.field4390[7] = new class16(arg0);
        this.field4390[3] = new class258(arg0);
        this.field4390[8] = this.field4390[4];
    }
}
