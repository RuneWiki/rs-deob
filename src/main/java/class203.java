import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class203 {

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Lvo;")
    private class205 field2863 = null;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    private int field2864 = 0;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    private int field2861 = 0;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lks;")
    private class173 field2862;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lle;")
    private class68 field2866;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "[Ljh;")
    private class457[] field2865;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZZB)V", line = 4)
    public final void method1394(int arg0, boolean arg1, boolean arg2, byte arg3) {
        boolean var5 = arg2 & this.field2862.method69();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg1) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg3 >= -46) {
            this.field2865 = (class457[]) null;
        }
        if (this.field2864 != arg0) {
            if (this.field2864 != 0) {
                this.field2865[this.field2864 & Integer.MAX_VALUE].method64();
            }
            if (arg0 != 0) {
                this.field2865[Integer.MAX_VALUE & arg0].method61(arg1);
                this.field2865[Integer.MAX_VALUE & arg0].method62(arg1);
            }
            this.field2861 = Integer.MIN_VALUE;
            this.field2863 = null;
            this.field2864 = arg0;
        } else if (this.field2864 != 0) {
            this.field2865[this.field2864 & Integer.MAX_VALUE].method62(arg1);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lvo;I)Z", line = 44)
    public final boolean method1395(class205 arg0, int arg1) {
        if (this.field2864 == 0) {
            return false;
        }
        if (this.field2863 != arg0) {
            this.field2865[Integer.MAX_VALUE & this.field2864].method63(arg0);
            this.field2863 = arg0;
        }
        if (arg1 != Integer.MAX_VALUE) {
            this.method1395((class205) null, -53);
        }
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)Z", line = 63)
    public final boolean method1396(int arg0, byte arg1) {
        return arg1 > -1 ? false : this.field2865[arg0].method65();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZB)V", line = 73)
    public final void method1397(int arg0, boolean arg1, byte arg2) {
        if (arg2 >= 28 && (this.field2861 != arg0 | arg1) & this.field2864 != 0) {
            this.field2865[this.field2864 & Integer.MAX_VALUE].method60(arg0);
            this.field2861 = arg0;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lks;)V", line = 98)
    public class203(class173 arg0) {
        this.field2862 = arg0;
        this.field2866 = new class68(arg0);
        this.field2865 = new class457[9];
        this.field2865[1] = new class284(arg0);
        this.field2865[2] = new class8(arg0, this.field2866);
        this.field2865[4] = new class87(arg0, this.field2866);
        this.field2865[5] = new class355(arg0, this.field2866);
        this.field2865[6] = new class258(arg0);
        this.field2865[7] = new class197(arg0);
        this.field2865[3] = new class414(arg0);
        this.field2865[8] = this.field2865[4];
    }
}
