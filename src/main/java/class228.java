import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class228 extends class42 {

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Lf;")
    private class257 field3387;

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lvo;Lvo;Lfga;)V")
    public class228(class345 arg0, class345 arg1, class340 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        ++field3383;
        if (!super.method348(arg0)) {
            return false;
        } else {
            return arg0 != 21378 ? false : super.field573.method2077(arg0 ^ 21378, ((class340) super.field576).field4724);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method343(int arg0) {
        if (arg0 <= -29) {
            super.method343(-57);
            ++field3384;
            this.field3387 = class699.method3926(((class340) super.field576).field4724, (byte) -126, super.field573);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIZ)V")
    public final void method342(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3385;
        int var5 = this.method347((byte) 59) * super.field576.field8300 / 10000;
        int[] var6 = new int[4];
        class637.field9048.method764(var6);
        class637.field9048.method771(arg0, arg1 + 2, arg0 + var5, super.field576.field8291 + arg1);
        this.field3387.method1632(arg0, arg1 - -2, super.field576.field8300, super.field576.field8291);
        class637.field9048.method771(var6[arg2], var6[1], var6[2], var6[3]);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIZI)V")
    public final void method345(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3386;
        class637.field9048.method791(arg3 - 2, arg0, super.field576.field8300 - -4, super.field576.field8291 + 2, ((class340) super.field576).field4726, arg1);
        class637.field9048.method791(arg3 + -1, arg0 + 1, super.field576.field8300 - -2, super.field576.field8291, 0, 0);
    }
}
