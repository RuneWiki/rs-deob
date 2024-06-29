import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class11 extends class140 {

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field239 = -1;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        field234++;
        if (!arg0) {
            this.field238 = 0;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 54) {
            this.method125(false);
        }
        field236++;
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILqa;Leq;IIZ)V")
    public final void method127(int arg0, int arg1, class162 arg2, class140 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 != 1) {
            this.method126((byte) 105);
        }
        field240++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)I")
    public abstract int method128(byte arg0);

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIIII)V")
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field242 = arg2;
        this.field241 = arg0;
        this.field238 = arg6;
        this.field233 = arg4;
        this.field244 = arg3;
        this.field237 = arg1;
        this.field235 = arg5;
    }
}
