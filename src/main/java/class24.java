import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class24 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Ldh;")
    public static class216 field351;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Lqt;")
    public static class459 field352;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lnl;")
    public static class393 field353;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method142(String arg0, int arg1, int arg2) {
        class267.field4011++;
        field348++;
        class228.method1528(true, class222.field3394);
        class276.field4124.method3048(-2034159384, class132.method966(arg0, 10240) + 1);
        if (arg1 != -1) {
            field349 = 96;
        }
        class276.field4124.method3039(arg1 ^ 0x30, arg2);
        class276.field4124.method3057((byte) -28, arg0);
    }

    @OriginalMember(owner = "client!o", name = "R", descriptor = "(II)I")
    public abstract int method143(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public abstract void method144(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        if (arg0 < -105) {
            field353 = null;
            field352 = null;
            field351 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method147(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!o", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public abstract void method148(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!o", name = "m", descriptor = "(III)V")
    public abstract void method149(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(Lia;IIIIZ)V")
    public abstract void method150(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!o", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method151(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method152(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!o", name = "q", descriptor = "(IILia;)Lia;")
    public abstract class424 method153(int arg0, int arg1, class424 arg2);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public abstract boolean method154(class424 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!o", name = "U", descriptor = "()V")
    public abstract void method155();

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(II)I")
    public abstract int method156(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lni;[I)V")
    public abstract void method157(class369 arg0, int[] arg1);

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(III)V")
    public class24(int arg0, int arg1, int arg2) {
        this.field347 = arg0;
        while (arg2 > 1) {
            this.field345++;
            arg2 >>= 0x1;
        }
        this.field350 = arg1;
        this.field346 = 0x1 << this.field345;
    }

    static {
        new class44("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
        field349 = 0;
        field351 = new class216(4, -1);
        field352 = new class459(72, 7);
    }
}
