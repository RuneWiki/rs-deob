import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class38 {

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "Lgl;")
    public static class429 field553 = class382.method2354(-9074);

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "[S")
    public static short[] field556 = new short[256];

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "Los;")
    public static class309 field555 = new class309("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "Llb;")
    public static class383 field557 = new class383("WTI", 5);

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "[[Z")
    public static boolean[][] field559;

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V", line = 43)
    public class38(int arg0, int arg1, int arg2) {
        this.field551 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field558++;
        }
        this.field554 = arg1;
        this.field552 = 0x1 << this.field558;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V", line = 60)
    public static void method248(int arg0) {
        field553 = null;
        field556 = null;
        field559 = null;
        field557 = null;
        field555 = null;
        if (arg0 != 5) {
            field559 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method185(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method187();

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class31 method189(int arg0, int arg1, class31 arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method179(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method176(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method182(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public abstract void method190(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method186(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lbk;[I)V")
    public abstract void method178(class256 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method191(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method188(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method177(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method180(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
