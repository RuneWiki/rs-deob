import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class319 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lcs;")
    public static class189 field4527 = new class189(64);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lfi;")
    public static class331 field4528 = new class331(64);

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "F")
    public static float field4532;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llg;IIIIZ)Z")
    public abstract boolean method1978(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILlg;)Llg;")
    public abstract class238 method1979(int arg0, int arg1, class238 arg2);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Llg;IIIIZ)V")
    public abstract void method1980(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    public abstract void method1981();

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
    public abstract void method1982(int arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Llg;IIIIZ)V")
    public abstract void method1983(class238 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1984(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILaf;I)V")
    public static final void method1985(int arg0, int arg1, class249 arg2, int arg3) {
        field4529++;
        if (arg3 != 64) {
            field4528 = null;
        }
        class114.field1321[arg0][arg1] = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1987(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method1988(int arg0) {
        field4527 = null;
        field4528 = null;
        if (arg0 != 64) {
            field4527 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lvg;[I)V")
    public abstract void method1989(class33 arg0, int[] arg1);

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)I")
    public abstract int method1990(int arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
    public abstract int method1991(int arg0, int arg1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public abstract void method1992(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
    public class319(int arg0, int arg1) {
        this.field4530 = arg0;
        this.field4531 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method1993(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);
}
