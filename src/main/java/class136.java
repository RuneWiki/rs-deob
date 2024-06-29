import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class136 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1920 = -1;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field1917 = 0;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lfc;")
    public static class235 field1922 = new class235(100, -1);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1926 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "[I")
    public static int[] field1927 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Ler;")
    public static class92 field1924;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method972(boolean arg0) {
        field1923++;
        if (class630.field8790.method426()) {
            class630.field8790.method437(class105.field1413);
            class475.method2703((byte) 111);
            class630.field8790.method413(class105.field1413);
            class630.field8790.method381(class105.field1413);
        } else {
            class339.method2033(class429.field6020, -28863);
        }
        if (arg0) {
            field1924 = null;
        }
        class336.method2026(100);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 39)
    public static void method973(int arg0) {
        field1927 = null;
        field1924 = null;
        field1922 = null;
        if (arg0 != -14856) {
            field1920 = -63;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V", line = 50)
    public class136(int arg0, int arg1, int arg2) {
        this.field1916 = arg1;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field1921++;
        }
        this.field1918 = arg0;
        this.field1919 = 0x1 << this.field1921;
    }

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method277(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method266(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method272(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lld;[I)V")
    public abstract void method282(class154 arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method271(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method276(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class271 method281(int arg0, int arg1, class271 arg2);

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method267(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method280(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method270();

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method273(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method278(class271 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
