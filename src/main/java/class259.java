import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class259 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    private int field3704 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    private int field3705 = 0;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Llp;")
    private class220 field3709 = null;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lao;")
    private class157 field3708;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lim;")
    private class342 field3707;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[Loi;")
    private class44[] field3706;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZI)V")
    public final void method1737(byte arg0, boolean arg1, int arg2) {
        if (arg0 <= 54) {
            this.method1737((byte) 89, true, -92);
        }
        if ((this.field3704 != arg2 | arg1) & this.field3705 != 0) {
            this.field3706[this.field3705 & Integer.MAX_VALUE].method228(arg2);
            this.field3704 = arg2;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZIZ)V")
    public final void method1738(int arg0, boolean arg1, int arg2, boolean arg3) {
        boolean var5 = arg1 & this.field3708.method599();
        if (!var5 && (arg0 == 4 || arg0 == 8)) {
            arg0 = 2;
        }
        if (arg0 != 0 && arg3) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (arg2 != 0) {
            this.method1737((byte) 100, false, 2);
        }
        if (this.field3705 != arg0) {
            if (this.field3705 != 0) {
                this.field3706[Integer.MAX_VALUE & this.field3705].method229();
            }
            if (arg0 != 0) {
                this.field3706[arg0 & Integer.MAX_VALUE].method227(arg3);
                this.field3706[arg0 & Integer.MAX_VALUE].method230(arg3);
            }
            this.field3709 = null;
            this.field3704 = Integer.MIN_VALUE;
            this.field3705 = arg0;
        } else if (this.field3705 != 0) {
            this.field3706[this.field3705 & Integer.MAX_VALUE].method230(arg3);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILlp;)Z")
    public final boolean method1739(int arg0, class220 arg1) {
        if (this.field3705 == 0) {
            return false;
        }
        if (arg0 != Integer.MAX_VALUE) {
            this.field3704 = -54;
        }
        if (this.field3709 != arg1) {
            this.field3706[this.field3705 & Integer.MAX_VALUE].method231(arg1);
            this.field3709 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Z")
    public final boolean method1740(int arg0, int arg1) {
        int var3 = -85 / ((20 - arg0) / 60);
        return this.field3706[arg1].method232();
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lao;)V")
    public class259(class157 arg0) {
        this.field3708 = arg0;
        this.field3707 = new class342(arg0);
        this.field3706 = new class44[9];
        this.field3706[1] = new class38(arg0);
        this.field3706[2] = new class386(arg0, this.field3707);
        this.field3706[4] = new class350(arg0, this.field3707);
        this.field3706[5] = new class416(arg0, this.field3707);
        this.field3706[6] = new class61(arg0);
        this.field3706[7] = new class139(arg0);
        this.field3706[3] = new class96(arg0);
        this.field3706[8] = this.field3706[4];
    }
}
