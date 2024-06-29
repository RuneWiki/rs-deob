import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class143 {

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[C")
    public static char[] field1838 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Ldq;")
    public static class493 field1841 = new class493(89, -1);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lla;")
    public static class316 field1843;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lge;")
    public static class502 field1839;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V", line = 25)
    public static final void method963(int arg0, byte arg1) {
        field1837++;
        class179.field2366 = -1;
        if (arg0 == 37) {
            class241.field3106 = 3.0F;
        } else if (arg0 == 50) {
            class241.field3106 = 4.0F;
        } else if (arg0 == 75) {
            class241.field3106 = 6.0F;
        } else if (arg0 == 100) {
            class241.field3106 = 8.0F;
        } else if (arg0 == 200) {
            class241.field3106 = 16.0F;
        }
        if (arg1 != 36) {
            method963(88, (byte) 18);
        }
        class179.field2366 = -1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 66)
    public static void method964(byte arg0) {
        field1841 = null;
        field1839 = null;
        field1838 = null;
        if (arg0 > -53) {
            method964((byte) -58);
        }
        field1843 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V", line = 80)
    public class143(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field1840++;
        }
        this.field1842 = arg0;
        this.field1844 = arg1;
        this.field1836 = 0x1 << this.field1840;
    }

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "(II)I")
    public abstract int method399(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public abstract void method393(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lku;[I)V")
    public abstract void method385(class256 arg0, int[] arg1);

    @OriginalMember(owner = "client!ta", name = "ca", descriptor = "()V")
    public abstract void method401();

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lba;IIIIZ)V")
    public abstract void method387(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method395(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lba;IIIIZ)Z")
    public abstract boolean method391(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public abstract int method396(int arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lba;IIIIZ)V")
    public abstract void method390(class264 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method392(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method386(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "(IILba;)Lba;")
    public abstract class264 method398(int arg0, int arg1, class264 arg2);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)V")
    public abstract void method394(int arg0, int arg1, int arg2);
}
