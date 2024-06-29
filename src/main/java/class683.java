import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class683 extends class251 {

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public int field9634;

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "Z")
    public static boolean field9638 = false;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "Lch;")
    public static class219 field9635;

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "Lmv;")
    public static class295 field9637;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Lmh;", line = 4)
    public final class139 method599(int arg0) {
        field9633++;
        int var2 = 113 % ((-arg0 - 89) / 34);
        return class285.field3809;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Frame;ILew;)V", line = 18)
    public static final void method3826(Frame arg0, int arg1, class226 arg2) {
        while (true) {
            class254 var3 = arg2.method1404((byte) -24, arg0);
            while (var3.field3311 == 0) {
                class687.method3846(10L, -90);
            }
            if (var3.field3311 == 1) {
                field9636++;
                arg0.setVisible(false);
                arg0.dispose();
                if (arg1 != 10) {
                    field9637 = null;
                    return;
                }
                return;
            }
            class687.method3846(100L, 76);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V", line = 43)
    public static void method3827(boolean arg0) {
        field9635 = null;
        if (arg0) {
            method3827(true);
        }
        field9637 = null;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ltca;Lvea;IIIIIIIIIIIIII)V", line = 56)
    public class683(class545 arg0, class305 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field9634 = arg15;
    }
}
