import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class402 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    private int field5711 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lue;")
    private class127 field5712 = null;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    private int field5710 = 0;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ltb;")
    private class227 field5713;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lrl;")
    private class430 field5714;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[Loh;")
    private class232[] field5709;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
    public final boolean method2524(int arg0, int arg1) {
        return arg1 == -1 ? this.field5709[arg0].method358() : false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLue;)Z")
    public final boolean method2525(byte arg0, class127 arg1) {
        if (arg0 <= 13) {
            this.field5713 = (class227) null;
        }
        if (this.field5711 == 0) {
            return false;
        }
        if (this.field5712 != arg1) {
            this.field5709[this.field5711 & Integer.MAX_VALUE].method356(arg1);
            this.field5712 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZB)V")
    public final void method2526(int arg0, boolean arg1, byte arg2) {
        if (arg2 != 119) {
            this.method2527(false, false, -87, 86);
        }
        if ((arg1 | this.field5710 != arg0) & this.field5711 != 0) {
            this.field5709[this.field5711 & Integer.MAX_VALUE].method355(arg0);
            this.field5710 = arg0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZII)V")
    public final void method2527(boolean arg0, boolean arg1, int arg2, int arg3) {
        boolean var5 = arg0 & this.field5713.method66();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (arg2 <= 49) {
            this.field5713 = (class227) null;
        }
        if (this.field5711 != arg3) {
            if (this.field5711 != 0) {
                this.field5709[Integer.MAX_VALUE & this.field5711].method352();
            }
            if (arg3 != 0) {
                this.field5709[Integer.MAX_VALUE & arg3].method354(arg1);
                this.field5709[Integer.MAX_VALUE & arg3].method357(arg1);
            }
            this.field5710 = Integer.MIN_VALUE;
            this.field5711 = arg3;
            this.field5712 = null;
        } else if (this.field5711 != 0) {
            this.field5709[this.field5711 & Integer.MAX_VALUE].method357(arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ltb;)V")
    public class402(class227 arg0) {
        this.field5713 = arg0;
        this.field5714 = new class430(arg0);
        this.field5709 = new class232[9];
        this.field5709[1] = new class38(arg0);
        this.field5709[2] = new class287(arg0, this.field5714);
        this.field5709[4] = new class424(arg0, this.field5714);
        this.field5709[5] = new class213(arg0, this.field5714);
        this.field5709[6] = new class58(arg0);
        this.field5709[7] = new class259(arg0);
        this.field5709[3] = new class147(arg0);
        this.field5709[8] = this.field5709[4];
    }
}
