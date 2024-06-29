import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class44 extends class123 {

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    private int field665 = -32768;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Lqe;")
    public static class35 field662;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "[Lkl;")
    public static class65[] field668;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZILgb;)V", line = 14)
    public static final void method370(int arg0, int arg1, int arg2, boolean arg3, int arg4, class213 arg5) {
        class272.field4706 = arg5;
        if (arg0 != -32768) {
            field668 = (class65[]) null;
        }
        class93.field1644 = arg1;
        field667++;
        class292.field5027 = 1;
        class169.field2886 = arg3;
        class70.field1208 = arg2;
        class59.field984 = 10000;
        class284.field4895 = arg4;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIJ)V", line = 43)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field666++;
        class305 var11 = class186.method1256((byte) 126, this.field663).method473((byte) 126, this.field660, (class2) null, 0);
        if (var11 != null) {
            var11.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field665 = var11.method361();
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(III)Lp;", line = 62)
    public static final class23 method371(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class23 var4 = var3.field3923;
            var3.field3923 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 73)
    public static void method372(int arg0) {
        field662 = null;
        if (arg0 != 25980) {
            method371(-39, -65, -47);
        }
        field668 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "()I", line = 84)
    public final int method361() {
        field664++;
        return this.field665;
    }
}
