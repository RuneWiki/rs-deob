import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class141 {

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
    private int field2139 = 0;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lvd;")
    private class4 field2141 = null;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    private int field2143 = 0;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "Lhd;")
    private class17 field2138;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "Lcf;")
    private class142 field2140;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "[Lqg;")
    private class157[] field2142;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lvd;I)Z")
    public final boolean method1103(class4 arg0, int arg1) {
        if (this.field2143 == 0) {
            return false;
        }
        if (this.field2141 != arg0) {
            this.field2142[Integer.MAX_VALUE & this.field2143].method557(arg0);
            this.field2141 = arg0;
        }
        int var3 = -89 % ((arg1 + 67) / 52);
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZB)V")
    public final void method1104(int arg0, boolean arg1, byte arg2) {
        if ((this.field2139 != arg0 | arg1) & this.field2143 != 0) {
            this.field2142[Integer.MAX_VALUE & this.field2143].method553(arg0);
            this.field2139 = arg0;
        }
        if (arg2 > -100) {
            this.field2141 = (class4) null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZZII)V")
    public final void method1105(boolean arg0, boolean arg1, int arg2, int arg3) {
        int var5 = 41 % ((-arg3 - 34) / 60);
        boolean var6 = arg1 & this.field2138.method203();
        if (!var6 && (arg2 == 4 || arg2 == 8)) {
            arg2 = 2;
        }
        if (arg2 != 0 && arg0) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field2143 != arg2) {
            if (this.field2143 != 0) {
                this.field2142[this.field2143 & Integer.MAX_VALUE].method552();
            }
            if (arg2 != 0) {
                this.field2142[Integer.MAX_VALUE & arg2].method554(arg0);
                this.field2142[Integer.MAX_VALUE & arg2].method556(arg0);
            }
            this.field2141 = null;
            this.field2139 = Integer.MIN_VALUE;
            this.field2143 = arg2;
        } else if (this.field2143 != 0) {
            this.field2142[this.field2143 & Integer.MAX_VALUE].method556(arg0);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Z")
    public final boolean method1106(int arg0, int arg1) {
        return arg0 == 13109 ? this.field2142[arg1].method555() : true;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lhd;)V")
    public class141(class17 arg0) {
        this.field2138 = arg0;
        this.field2140 = new class142(arg0);
        this.field2142 = new class157[9];
        this.field2142[1] = new class65(arg0);
        this.field2142[2] = new class252(arg0, this.field2140);
        this.field2142[4] = new class92(arg0, this.field2140);
        this.field2142[5] = new class444(arg0, this.field2140);
        this.field2142[6] = new class62(arg0);
        this.field2142[7] = new class376(arg0);
        this.field2142[3] = new class333(arg0);
        this.field2142[8] = new class311(arg0);
        if (!this.field2142[8].method555()) {
            this.field2142[8] = this.field2142[4];
        }
    }
}
