import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class35 {

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field556 = 0;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lff;")
    public static class9 field554 = new class9(63, -2);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Z")
    public static boolean field560 = false;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method266(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method267(int arg0, int arg1, int arg2, boolean arg3) {
        field553++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[arg0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - arg1 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method268();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method269(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method270(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lor;[I)V")
    public abstract void method271(class451 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method272(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method273(byte arg0) {
        if (arg0 == -20) {
            field554 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method274(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method276(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class377 method279(int arg0, int arg1, class377 arg2);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method280(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        this.field557 = arg0;
        this.field559 = arg1;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field558++;
        }
        this.field555 = 0x1 << this.field558;
    }

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method281(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    static {
        new class304("From", "Von:", "De", "De");
    }
}
