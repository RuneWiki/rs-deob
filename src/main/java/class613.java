import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class613 {

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "I")
    private int field8625 = 0;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
    private int field8626 = 0;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
    private int field8631 = 0;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "Lpq;")
    private class194 field8629;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "Lsa;")
    private class780 field8635;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "[Lef;")
    private class203[] field8634;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "Llfa;")
    public class347 field8628;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "J")
    public static long field8627;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)I", line = 4)
    public static int method3544(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZIZII)V", line = 13)
    public final void method3545(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg4 != -1) {
            this.field8634 = null;
        }
        field8633++;
        boolean var7 = arg1 & this.field8629.method193();
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg5 = arg0;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg3) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field8631 != arg2) {
            if (this.field8631 != 0) {
                this.field8634[this.field8631 & Integer.MAX_VALUE].method686(98);
            }
            if (arg2 != 0) {
                this.field8634[Integer.MAX_VALUE & arg2].method688((byte) -37, arg3);
                this.field8634[arg2 & Integer.MAX_VALUE].method681(arg3, (byte) 58);
                this.field8634[Integer.MAX_VALUE & arg2].method682(arg5, arg0, true);
            }
            this.field8626 = arg5;
            this.field8631 = arg2;
            this.field8625 = arg0;
        } else if (this.field8631 != 0) {
            this.field8634[this.field8631 & Integer.MAX_VALUE].method681(arg3, (byte) 34);
            if (this.field8625 != arg0 || this.field8626 != arg5) {
                this.field8634[Integer.MAX_VALUE & this.field8631].method682(arg5, arg0, true);
                this.field8626 = arg5;
                this.field8625 = arg0;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)Z", line = 77)
    public final boolean method3546(int arg0, int arg1) {
        field8630++;
        if (arg0 != 4) {
            field8627 = 60L;
        }
        return this.field8634[arg1].method687(-12);
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lpq;)V", line = 112)
    public class613(class194 arg0) {
        this.field8629 = arg0;
        this.field8635 = new class780(arg0);
        this.field8634 = new class203[10];
        this.field8634[1] = new class558(arg0);
        this.field8634[2] = new class95(arg0, this.field8635);
        this.field8634[4] = new class261(arg0, this.field8635);
        this.field8634[5] = new class530(arg0, this.field8635);
        this.field8634[6] = new class421(arg0);
        this.field8634[7] = new class471(arg0);
        this.field8634[3] = this.field8628 = new class347(arg0);
        this.field8634[8] = new class724(arg0, this.field8635);
        this.field8634[9] = new class214(arg0, this.field8635);
        if (!this.field8634[8].method687(-12)) {
            this.field8634[8] = this.field8634[4];
        }
        if (!this.field8634[9].method687(-12)) {
            this.field8634[9] = this.field8634[8];
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBLwha;)Z", line = 98)
    public final boolean method3547(int arg0, byte arg1, class539 arg2) {
        field8632++;
        int var4 = 103 / ((arg1 + 50) / 58);
        if (this.field8631 == 0) {
            return false;
        } else {
            this.field8634[Integer.MAX_VALUE & this.field8631].method683(arg0, false, arg2);
            return true;
        }
    }
}
