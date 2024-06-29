import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class404 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Let;")
    private class179 field5597 = null;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    private int field5600 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    private int field5601 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lqi;")
    private class458 field5596;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Lco;")
    private class149 field5598;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[Lrg;")
    private class150[] field5599;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)Z")
    public final boolean method2378(byte arg0, int arg1) {
        return arg0 > -105 ? true : this.field5599[arg1].method7();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBZZ)V")
    public final void method2379(int arg0, byte arg1, boolean arg2, boolean arg3) {
        boolean var5 = arg3 & this.field5596.method1098();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg1 != 113) {
            return;
        }
        if (this.field5601 != arg0) {
            if (this.field5601 != 0) {
                this.field5599[this.field5601 & Integer.MAX_VALUE].method2();
            }
            if (arg0 != 0) {
                this.field5599[Integer.MAX_VALUE & arg0].method5(arg2);
                this.field5599[arg0 & Integer.MAX_VALUE].method3(arg2);
            }
            this.field5601 = arg0;
            this.field5600 = Integer.MIN_VALUE;
            this.field5597 = null;
        } else if (this.field5601 != 0) {
            this.field5599[this.field5601 & Integer.MAX_VALUE].method3(arg2);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLet;)Z")
    public final boolean method2380(byte arg0, class179 arg1) {
        if (arg0 != -22) {
            return false;
        } else if (this.field5601 == 0) {
            return false;
        } else {
            if (this.field5597 != arg1) {
                this.field5599[Integer.MAX_VALUE & this.field5601].method6(arg1);
                this.field5597 = arg1;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZI)V")
    public final void method2381(int arg0, boolean arg1, int arg2) {
        if (this.field5601 != 0 & (this.field5600 != arg0 | arg1)) {
            this.field5599[Integer.MAX_VALUE & this.field5601].method1(arg0);
            this.field5600 = arg0;
        }
        if (arg2 != 4716) {
            this.method2378((byte) -1, -32);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lqi;)V")
    public class404(class458 arg0) {
        this.field5596 = arg0;
        this.field5598 = new class149(arg0);
        this.field5599 = new class150[9];
        this.field5599[1] = new class1(arg0);
        this.field5599[2] = new class188(arg0, this.field5598);
        this.field5599[4] = new class354(arg0, this.field5598);
        this.field5599[5] = new class368(arg0, this.field5598);
        this.field5599[6] = new class98(arg0);
        this.field5599[7] = new class481(arg0);
        this.field5599[3] = new class453(arg0);
        this.field5599[8] = this.field5599[4];
    }
}
