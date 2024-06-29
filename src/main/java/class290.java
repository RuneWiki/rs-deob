import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class290 {

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
    public int field3838 = 128;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public int field3847 = 128;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public int field3845;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Llga;")
    public static class712 field3842 = new class712(7, 6);

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "Lfa;")
    public static class236 field3843;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "Lvt;")
    public static class306 field3844;

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I)V", line = 64)
    public class290(int arg0) {
        this.field3845 = arg0;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(IIIIII)V", line = 71)
    private class290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3839 = arg3;
        this.field3846 = arg4;
        this.field3840 = arg5;
        this.field3845 = arg0;
        this.field3847 = arg2;
        this.field3838 = arg1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1731(boolean arg0) {
        if (arg0) {
            field3844 = null;
        }
        field3843 = null;
        field3844 = null;
        field3842 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Loaa;I)V", line = 27)
    public final void method1732(class290 arg0, int arg1) {
        if (arg1 != 6) {
            this.method1733(127);
        }
        this.field3839 = arg0.field3839;
        this.field3840 = arg0.field3840;
        this.field3845 = arg0.field3845;
        field3837++;
        this.field3847 = arg0.field3847;
        this.field3846 = arg0.field3846;
        this.field3838 = arg0.field3838;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Loaa;", line = 43)
    public final class290 method1733(int arg0) {
        field3841++;
        if (arg0 != 128) {
            this.method1732(null, 107);
        }
        return new class290(this.field3845, this.field3838, this.field3847, this.field3839, this.field3846, this.field3840);
    }
}
