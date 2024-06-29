import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class402 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lnj;")
    private class133 field5863 = null;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    private int field5865 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    private int field5861 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lhj;")
    private class338 field5862;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lqf;")
    private class404 field5866;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[Lnp;")
    private class284[] field5864;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLnj;)Z", line = 5)
    public final boolean method2593(byte arg0, class133 arg1) {
        if (this.field5861 == 0) {
            return false;
        }
        if (this.field5863 != arg1) {
            this.field5864[Integer.MAX_VALUE & this.field5861].method693(arg1);
            this.field5863 = arg1;
        }
        int var3 = -49 / ((38 - arg0) / 43);
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZZ)V", line = 23)
    public final void method2594(int arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            this.method2595(95, -83);
        }
        if (this.field5861 != 0 & (this.field5865 != arg0 | arg1)) {
            this.field5864[Integer.MAX_VALUE & this.field5861].method697(arg0);
            this.field5865 = arg0;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lhj;)V", line = 99)
    public class402(class338 arg0) {
        this.field5862 = arg0;
        this.field5866 = new class404(arg0);
        this.field5864 = new class284[9];
        this.field5864[1] = new class330(arg0);
        this.field5864[2] = new class98(arg0, this.field5866);
        this.field5864[4] = new class397(arg0, this.field5866);
        this.field5864[5] = new class228(arg0, this.field5866);
        this.field5864[6] = new class277(arg0);
        this.field5864[7] = new class421(arg0);
        this.field5864[3] = new class211(arg0);
        this.field5864[8] = this.field5864[4];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z", line = 47)
    public final boolean method2595(int arg0, int arg1) {
        if (arg1 != 8) {
            this.field5862 = (class338) null;
        }
        return this.field5864[arg0].method694();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIZI)V", line = 60)
    public final void method2596(boolean arg0, int arg1, boolean arg2, int arg3) {
        boolean var5 = arg2 & this.field5862.method1728();
        if (arg3 <= 66) {
            this.field5862 = (class338) null;
        }
        if (!var5 && (arg1 == 4 || arg1 == 8)) {
            arg1 = 2;
        }
        if (arg1 != 0 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field5861 != arg1) {
            if (this.field5861 != 0) {
                this.field5864[Integer.MAX_VALUE & this.field5861].method699();
            }
            if (arg1 != 0) {
                this.field5864[Integer.MAX_VALUE & arg1].method695(arg0);
                this.field5864[arg1 & Integer.MAX_VALUE].method696(arg0);
            }
            this.field5861 = arg1;
            this.field5863 = null;
            this.field5865 = Integer.MIN_VALUE;
        } else if (this.field5861 != 0) {
            this.field5864[this.field5861 & Integer.MAX_VALUE].method696(arg0);
        }
    }
}
