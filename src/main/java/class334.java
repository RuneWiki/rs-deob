import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class334 {

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public int field4797 = 128;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public int field4801 = 128;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public int field4799;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "[I")
    public static int[] field4796 = new int[2];

    @OriginalMember(owner = "client!br", name = "h", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Lbr;")
    public final class334 method2169(boolean arg0) {
        field4804++;
        if (!arg0) {
            this.field4798 = -113;
        }
        return new class334(this.field4798, this.field4801, this.field4797, this.field4799, this.field4800, this.field4802);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public static void method2170(int arg0) {
        field4796 = null;
        if (arg0 != 128) {
            field4796 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lbr;B)V")
    public final void method2171(class334 arg0, byte arg1) {
        this.field4801 = arg0.field4801;
        field4803++;
        this.field4797 = arg0.field4797;
        this.field4799 = arg0.field4799;
        this.field4798 = arg0.field4798;
        this.field4802 = arg0.field4802;
        this.field4800 = arg0.field4800;
        int var3 = 56 % (-arg1 / 48);
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
    public class334(int arg0) {
        this.field4798 = arg0;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIIIII)V")
    private class334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4800 = arg4;
        this.field4797 = arg2;
        this.field4799 = arg3;
        this.field4798 = arg0;
        this.field4801 = arg1;
        this.field4802 = arg5;
    }
}
