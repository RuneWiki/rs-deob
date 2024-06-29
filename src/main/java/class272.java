import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class272 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    private int field3713 = 0;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    private int field3716 = 0;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lt;")
    private class321 field3715 = null;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lmm;")
    private class357 field3714;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lgk;")
    private class256 field3712;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[Lte;")
    private class114[] field3711;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZIB)V", line = 5)
    public final void method1725(boolean arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 >= -66) {
            return;
        }
        boolean var5 = arg0 & this.field3714.method205();
        if (!var5 && (arg2 == 4 || arg2 == 8)) {
            arg2 = 2;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field3713 != arg2) {
            if (this.field3713 != 0) {
                this.field3711[this.field3713 & Integer.MAX_VALUE].method306();
            }
            if (arg2 != 0) {
                this.field3711[Integer.MAX_VALUE & arg2].method303(arg1);
                this.field3711[arg2 & Integer.MAX_VALUE].method304(arg1);
            }
            this.field3716 = Integer.MIN_VALUE;
            this.field3713 = arg2;
            this.field3715 = null;
        } else if (this.field3713 != 0) {
            this.field3711[Integer.MAX_VALUE & this.field3713].method304(arg1);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Z", line = 45)
    public final boolean method1726(byte arg0, int arg1) {
        if (arg0 != -42) {
            this.field3713 = -106;
        }
        return this.field3711[arg1].method309();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lt;B)Z", line = 57)
    public final boolean method1727(class321 arg0, byte arg1) {
        if (this.field3713 == 0) {
            return false;
        }
        if (arg1 < 89) {
            this.field3711 = (class114[]) null;
        }
        if (this.field3715 != arg0) {
            this.field3711[Integer.MAX_VALUE & this.field3713].method307(arg0);
            this.field3715 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lmm;)V", line = 101)
    public class272(class357 arg0) {
        this.field3714 = arg0;
        this.field3712 = new class256(arg0);
        this.field3711 = new class114[9];
        this.field3711[1] = new class347(arg0);
        this.field3711[2] = new class33(arg0, this.field3712);
        this.field3711[4] = new class110(arg0, this.field3712);
        this.field3711[5] = new class289(arg0, this.field3712);
        this.field3711[6] = new class239(arg0);
        this.field3711[7] = new class420(arg0);
        this.field3711[3] = new class40(arg0);
        this.field3711[8] = this.field3711[4];
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZII)V", line = 88)
    public final void method1728(boolean arg0, int arg1, int arg2) {
        if (this.field3713 != 0 & (arg0 | this.field3716 != arg1)) {
            this.field3711[this.field3713 & Integer.MAX_VALUE].method308(arg1);
            this.field3716 = arg1;
        }
        int var4 = 65 % ((arg2 + 68) / 39);
    }
}
