import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class57 extends class255 {

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    private int field898 = -32768;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field888 = 0;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field886 = 0;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[I")
    public static int[] field887 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lbd;")
    public static class162 field895 = class17.method142(0, "::breakcon");

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lbd;")
    public static class162 field894 = class17.method142(0, "floorshadows");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Lwc;")
    public static class53 field890 = new class53();

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "[[[Lnm;")
    public static class225[][][] field896;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lbf;", line = 5)
    public static final class54 method399(int arg0, int arg1) {
        int var2 = 64 / ((2 - arg0) / 38);
        field897++;
        class54 var3 = (class54) class184.field3177.method1536((long) arg1, -98);
        if (var3 != null) {
            return var3;
        }
        class54 var4 = class35.method279(arg1, false, (byte) 120, class200.field3402, class261.field4352);
        if (var4 != null) {
            class184.field3177.method1532((long) arg1, -94, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()I", line = 39)
    public final int method46() {
        field893++;
        return this.field898;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIJ)V", line = 59)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class176 var11 = class304.method2075(this.field892, 4).method916(this.field891, (byte) 78, 0, (class142) null);
        field889++;
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field898 = var11.method46();
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 83)
    public static void method400(byte arg0) {
        field887 = null;
        if (arg0 >= -37) {
            method400((byte) 34);
        }
        field896 = (class225[][][]) null;
        field894 = null;
        field890 = null;
        field895 = null;
    }
}
