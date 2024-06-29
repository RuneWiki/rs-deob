import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class83 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    private int field1014 = 0;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    private int field1018 = 0;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Lbl;")
    private class425 field1019 = null;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lmi;")
    private class315 field1016;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lmb;")
    private class158 field1017;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "[Lfo;")
    private class331[] field1015;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZI)V")
    public final void method471(int arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            this.field1018 = 71;
        }
        if (this.field1018 != 0 & (this.field1014 != arg0 | arg1)) {
            this.field1015[Integer.MAX_VALUE & this.field1018].method815(arg0);
            this.field1014 = arg0;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)Z")
    public final boolean method472(byte arg0, int arg1) {
        if (arg0 != -62) {
            this.method474(-73, true, false, -91);
        }
        return this.field1015[arg1].method812();
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lbl;B)Z")
    public final boolean method473(class425 arg0, byte arg1) {
        if (this.field1018 == 0) {
            return false;
        }
        int var3 = 9 / ((arg1 + 33) / 54);
        if (this.field1019 != arg0) {
            this.field1015[Integer.MAX_VALUE & this.field1018].method817(arg0);
            this.field1019 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZZI)V")
    public final void method474(int arg0, boolean arg1, boolean arg2, int arg3) {
        boolean var5 = arg1 & this.field1016.method645();
        if (arg0 != 3) {
            this.method474(-68, false, true, -112);
        }
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field1018 != arg3) {
            if (this.field1018 != 0) {
                this.field1015[Integer.MAX_VALUE & this.field1018].method816();
            }
            if (arg3 != 0) {
                this.field1015[Integer.MAX_VALUE & arg3].method811(arg2);
                this.field1015[arg3 & Integer.MAX_VALUE].method813(arg2);
            }
            this.field1014 = Integer.MIN_VALUE;
            this.field1018 = arg3;
            this.field1019 = null;
        } else if (this.field1018 != 0) {
            this.field1015[Integer.MAX_VALUE & this.field1018].method813(arg2);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lmi;)V")
    public class83(class315 arg0) {
        this.field1016 = arg0;
        this.field1017 = new class158(arg0);
        this.field1015 = new class331[9];
        this.field1015[1] = new class137(arg0);
        this.field1015[2] = new class461(arg0, this.field1017);
        this.field1015[4] = new class129(arg0, this.field1017);
        this.field1015[5] = new class379(arg0, this.field1017);
        this.field1015[6] = new class397(arg0);
        this.field1015[7] = new class376(arg0);
        this.field1015[3] = new class336(arg0);
        this.field1015[8] = this.field1015[4];
    }
}
