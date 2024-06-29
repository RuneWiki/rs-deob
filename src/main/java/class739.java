import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class739 extends class775 {

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    private int field10019;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    private int field10023;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
    private int field10024;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    private int field10021;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(III)V", line = 6)
    public final void method109(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.method110(-63, 7, -52);
        }
        ++field10018;
        int var4 = this.field10019 * arg2 >> 12;
        int var5 = this.field10021 * arg2 >> 12;
        int var6 = this.field10024 * arg1 >> 12;
        int var7 = this.field10023 * arg1 >> 12;
        class791.method4324(var6, var5, var4, super.field10662, var7, 64);
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)V", line = 26)
    public final void method110(int arg0, int arg1, int arg2) {
        ++field10020;
        int var4 = this.field10019 * arg0 >> 12;
        if (arg1 != 512) {
            this.field10024 = -66;
        }
        int var5 = this.field10021 * arg0 >> 12;
        int var6 = this.field10024 * arg2 >> 12;
        int var7 = this.field10023 * arg2 >> 12;
        class427.method2575(super.field10661, var7, super.field10665, -39, var5, var4, super.field10662, var6);
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(IIIIIII)V", line = 50)
    public class739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field10019 = arg0;
        this.field10023 = arg3;
        this.field10024 = arg1;
        this.field10021 = arg2;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V", line = 62)
    public final void method111(int arg0, int arg1, int arg2) {
        ++field10022;
        if (arg2 != 17793) {
            this.method109(-11, -110, -43);
        }
    }
}
