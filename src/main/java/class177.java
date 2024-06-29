import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class177 {

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lld;")
    public static class105 field2403 = new class105();

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
    public static boolean field2407 = false;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lgd;")
    public static class206 field2406 = new class206(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[I")
    public static int[] field2404;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[Ljd;")
    public static class139[] field2405;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[[Lbh;")
    public static class27[][] field2408;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 17)
    public static void method1014(int arg0) {
        field2408 = null;
        field2403 = null;
        field2406 = null;
        if (arg0 != -10487) {
            method1014(-8);
        }
        field2404 = null;
        field2405 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V", line = 51)
    public class177(int arg0, int arg1) {
        this.field2410 = arg0;
        this.field2409 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method382(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
    public abstract void method366();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public abstract int method371(int arg0, int arg1);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)V")
    public abstract void method374(int arg0, int arg1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lof;[I)V")
    public abstract void method380(class404 arg0, int[] arg1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public abstract void method365(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lkb;IIIIZ)V")
    public abstract void method379(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Lkb;IIIIZ)V")
    public abstract void method372(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method381(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
    public abstract int method368(int arg0, int arg1);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method383(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILkb;)Lkb;")
    public abstract class449 method369(int arg0, int arg1, class449 arg2);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(Lkb;IIIIZ)Z")
    public abstract boolean method373(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
