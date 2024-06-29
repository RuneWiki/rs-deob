import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class337 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public int field5200;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field5198;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field5197;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[B")
    public static byte[] field5194 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field5195 = 0;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Luv;")
    public static class2 field5199 = new class2(26, 8);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Loo;")
    public static class31 field5201 = new class31("RC", 1);

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ta", name = "ca", descriptor = "()V")
    public abstract void method705();

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method717(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(IILba;)Lba;")
    public abstract class502 method712(int arg0, int arg1, class502 arg2);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lba;IIIIZ)V")
    public abstract void method706(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(II)I")
    public abstract int method707(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public abstract int method718(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method711(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method2064(byte arg0) {
        field5201 = null;
        field5199 = null;
        field5194 = null;
        if (arg0 != 1) {
            method2065(-7, null);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lwr;[I)V")
    public abstract void method715(class531 arg0, int[] arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILtr;)V")
    public static final void method2065(int arg0, class245 arg1) {
        field5196++;
        arg1.field3392 = null;
        if (arg0 > class364.field5568) {
            class113.field1720.method3094(-2713, arg1);
            class364.field5568++;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lba;IIIIZ)V")
    public abstract void method703(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V")
    public class337(int arg0, int arg1, int arg2) {
        this.field5200 = arg1;
        while (arg2 > 1) {
            this.field5197++;
            arg2 >>= 0x1;
        }
        this.field5198 = arg0;
        this.field5193 = 0x1 << this.field5197;
    }

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)V")
    public abstract void method719(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public abstract boolean method710(class502 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public abstract void method704(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method714(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);
}
