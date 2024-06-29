import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class23 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field338 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public static int[] field334 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lla;")
    public static class319 field333 = new class319(61, 4);

    @OriginalMember(owner = "client!o", name = "j", descriptor = "[Z")
    public static boolean[] field342 = new boolean[8];

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z")
    public static final boolean method207(boolean arg0) {
        field335++;
        try {
            if (class406.field6164 == 2) {
                if (class373.field5679 == null) {
                    class373.field5679 = class483.method2899(class445.field6686, class342.field5271, class372.field5667);
                    if (class373.field5679 == null) {
                        return false;
                    }
                }
                if (class418.field6367 == null) {
                    class418.field6367 = new class540(class164.field2213, class52.field741);
                }
                if (class480.field7082.method1394(22050, -1, class373.field5679, class370.field5659, class418.field6367)) {
                    class480.field7082.method1395(16256);
                    class480.field7082.method1393(class162.field2114, -96);
                    class480.field7082.method1413((byte) -62, class433.field6577, class373.field5679);
                    class445.field6686 = null;
                    class406.field6164 = 0;
                    class373.field5679 = null;
                    class418.field6367 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class480.field7082.method1405(16);
            class406.field6164 = 0;
            class373.field5679 = null;
            class445.field6686 = null;
            class418.field6367 = null;
        }
        if (!arg0) {
            field334 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!o", name = "ia", descriptor = "(Lia;IIIIZ)V")
    public abstract void method209(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public abstract void method210(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "U", descriptor = "()V")
    public abstract void method211();

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lia;IIIIZ)Z")
    public abstract boolean method212(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method213(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method214(byte arg0) {
        field334 = null;
        int var1 = 125 % ((2 - arg0) / 47);
        field342 = null;
        field333 = null;
    }

    @OriginalMember(owner = "client!o", name = "q", descriptor = "(IILia;)Lia;")
    public abstract class423 method215(int arg0, int arg1, class423 arg2);

    @OriginalMember(owner = "client!o", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method216(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lbe;[I)V")
    public abstract void method217(class28 arg0, int[] arg1);

    @OriginalMember(owner = "client!o", name = "R", descriptor = "(II)I")
    public abstract int method218(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "m", descriptor = "(III)V")
    public abstract void method219(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILmk;)Z")
    public static final boolean method220(int arg0, class38 arg1) {
        field339++;
        if (arg1 == null) {
            return false;
        }
        int var2 = -126 / ((arg0 - 30) / 62);
        if (!arg1.field556) {
            return false;
        } else if (!arg1.method320(class12.field207, (byte) 69)) {
            return false;
        } else if (class535.field7863.method1747((long) arg1.field563, false) == null) {
            return class296.field4379.method1747((long) arg1.field571, false) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method221(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(III)V")
    public class23(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field341++;
        }
        this.field337 = arg1;
        this.field340 = arg0;
        this.field336 = 0x1 << this.field341;
    }

    @OriginalMember(owner = "client!o", name = "oa", descriptor = "(II)I")
    public abstract int method222(int arg0, int arg1);

    @OriginalMember(owner = "client!o", name = "H", descriptor = "(Lia;IIIIZ)V")
    public abstract void method223(class423 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
