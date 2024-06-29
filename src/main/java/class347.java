import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class347 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    private int field5080 = 0;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    private int field5079 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lfl;")
    private class439 field5077 = null;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lpo;")
    private class332 field5081;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lde;")
    private class312 field5078;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[Lt;")
    private class399[] field5082;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLfl;)Z", line = 4)
    public final boolean method2209(byte arg0, class439 arg1) {
        if (this.field5080 == 0) {
            return false;
        }
        int var3 = -86 / ((-arg0 - 54) / 41);
        if (this.field5077 != arg1) {
            this.field5082[this.field5080 & Integer.MAX_VALUE].method376(arg1);
            this.field5077 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZI)V", line = 26)
    public final void method2210(boolean arg0, boolean arg1, int arg2) {
        if (this.field5080 != 0 & (this.field5079 != arg2 | arg0)) {
            this.field5082[this.field5080 & Integer.MAX_VALUE].method377(arg2);
            this.field5079 = arg2;
        }
        if (arg1) {
            this.method2211(88, (byte) 13, false, false);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBZZ)V", line = 41)
    public final void method2211(int arg0, byte arg1, boolean arg2, boolean arg3) {
        boolean var5 = arg3 & this.field5081.method951();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field5080 != arg0) {
            if (this.field5080 != 0) {
                this.field5082[Integer.MAX_VALUE & this.field5080].method379();
            }
            if (arg0 != 0) {
                this.field5082[arg0 & Integer.MAX_VALUE].method374(arg2);
                this.field5082[Integer.MAX_VALUE & arg0].method378(arg2);
            }
            this.field5080 = arg0;
            this.field5077 = null;
            this.field5079 = Integer.MIN_VALUE;
        } else if (this.field5080 != 0) {
            this.field5082[this.field5080 & Integer.MAX_VALUE].method378(arg2);
        }
        if (arg1 > -36) {
            this.field5080 = 78;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z", line = 82)
    public final boolean method2212(int arg0, int arg1) {
        int var3 = 54 / ((arg1 + 44) / 63);
        return this.field5082[arg0].method375();
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lpo;)V", line = 98)
    public class347(class332 arg0) {
        this.field5081 = arg0;
        this.field5078 = new class312(arg0);
        this.field5082 = new class399[9];
        this.field5082[1] = new class321(arg0);
        this.field5082[2] = new class120(arg0, this.field5078);
        this.field5082[4] = new class234(arg0, this.field5078);
        this.field5082[5] = new class131(arg0, this.field5078);
        this.field5082[6] = new class361(arg0);
        this.field5082[7] = new class317(arg0);
        this.field5082[3] = new class61(arg0);
        this.field5082[8] = this.field5082[4];
    }
}
