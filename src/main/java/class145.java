import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class145 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lsd;")
    private class233 field1700 = null;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    private int field1703 = 0;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    private int field1702 = 0;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lh;")
    private class327 field1701;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Lsh;")
    private class435 field1705;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "[Les;")
    private class404[] field1704;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lh;)V", line = 64)
    public class145(class327 arg0) {
        this.field1701 = arg0;
        this.field1705 = new class435(arg0);
        this.field1704 = new class404[9];
        this.field1704[1] = new class289(arg0);
        this.field1704[2] = new class85(arg0, this.field1705);
        this.field1704[4] = new class329(arg0, this.field1705);
        this.field1704[5] = new class109(arg0, this.field1705);
        this.field1704[6] = new class73(arg0);
        this.field1704[7] = new class142(arg0);
        this.field1704[3] = new class60(arg0);
        this.field1704[8] = this.field1704[4];
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)Z", line = 9)
    public final boolean method939(boolean arg0, int arg1) {
        return arg0 ? false : this.field1704[arg1].method350();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lsd;B)Z", line = 21)
    public final boolean method940(class233 arg0, byte arg1) {
        if (this.field1703 == 0) {
            return false;
        }
        if (this.field1700 != arg0) {
            this.field1704[Integer.MAX_VALUE & this.field1703].method353(arg0);
            this.field1700 = arg0;
        }
        if (arg1 != 100) {
            this.field1700 = (class233) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBZ)V", line = 43)
    public final void method941(int arg0, byte arg1, boolean arg2) {
        if (arg1 <= -46 && this.field1703 != 0 & (this.field1702 != arg0 | arg2)) {
            this.field1704[Integer.MAX_VALUE & this.field1703].method351(arg0);
            this.field1702 = arg0;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZI)V", line = 83)
    public final void method942(int arg0, boolean arg1, boolean arg2, int arg3) {
        boolean var5 = arg1 & this.field1701.method783();
        if (arg3 > -44) {
            this.field1703 = -98;
        }
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field1703 != arg0) {
            if (this.field1703 != 0) {
                this.field1704[Integer.MAX_VALUE & this.field1703].method352();
            }
            if (arg0 != 0) {
                this.field1704[arg0 & Integer.MAX_VALUE].method348(arg2);
                this.field1704[Integer.MAX_VALUE & arg0].method349(arg2);
            }
            this.field1700 = null;
            this.field1703 = arg0;
            this.field1702 = Integer.MIN_VALUE;
        } else if (this.field1703 != 0) {
            this.field1704[this.field1703 & Integer.MAX_VALUE].method349(arg2);
        }
    }
}
