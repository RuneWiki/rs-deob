import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class38 {

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "[Ldv;")
    public static class477[] field412 = new class477[5];

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "[Lmh;")
    public static class454[] field419;

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "Leh;")
    public static class246 field418;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "Lla;")
    public static class319 field415;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IZII)V")
    public static final void method209(int arg0, boolean arg1, int arg2, int arg3) {
        field409++;
        if (arg0 < 37) {
            return;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class289.field4225 = arg3;
        class75.field940 = arg2;
        class366.field5230 = arg1;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method2(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method11(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class31 method13(int arg0, int arg1, class31 arg2);

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method8(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)Z")
    public static final boolean method210(int arg0, int arg1) {
        field410++;
        if (arg0 == 1) {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)V")
    public abstract void method15(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method10(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method3(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lls;[I)V")
    public abstract void method6(class95 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III)Ldj;")
    public static final class232 method211(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3487;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method17(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method12(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method5(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method4();

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method9(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(B)V")
    public static void method212(byte arg0) {
        field415 = null;
        field419 = null;
        field418 = null;
        field412 = null;
        int var1 = 47 / ((64 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
    public class38(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field414++;
        }
        this.field413 = arg1;
        this.field411 = arg0;
        this.field416 = 0x1 << this.field414;
    }

    static {
        for (int var0 = 0; var0 < field412.length; var0++) {
            field412[var0] = new class477();
        }
        field419 = new class454[14];
        field418 = new class246(56, 4);
    }
}
