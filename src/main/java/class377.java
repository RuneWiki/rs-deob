import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class377 {

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public int field4822 = 128;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public int field4821 = 128;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public int field4823;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public int field4818;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)Lmv;")
    public final class377 method2157(boolean arg0) {
        field4817++;
        if (!arg0) {
            this.field4821 = -65;
        }
        return new class377(this.field4824, this.field4822, this.field4821, this.field4823, this.field4820, this.field4818);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILmv;)V")
    public final void method2158(int arg0, class377 arg1) {
        this.field4818 = arg1.field4818;
        this.field4820 = arg1.field4820;
        field4819++;
        if (arg0 == 10368) {
            this.field4824 = arg1.field4824;
            this.field4822 = arg1.field4822;
            this.field4821 = arg1.field4821;
            this.field4823 = arg1.field4823;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(I)V")
    public class377(int arg0) {
        this.field4824 = arg0;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(IIIIII)V")
    private class377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4824 = arg0;
        this.field4822 = arg1;
        this.field4821 = arg2;
        this.field4820 = arg4;
        this.field4823 = arg3;
        this.field4818 = arg5;
    }
}
