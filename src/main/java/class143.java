import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class143 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lpf;")
    public static class425 field1907 = new class425(46, 3);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljg;")
    public static class241 field1909 = new class241(16);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1910 = -1;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Ljg;")
    public static class241 field1913;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field1914;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method104(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILqn;)Lqn;")
    public abstract class380 method110(int arg0, int arg1, class380 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
    public abstract void method101();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method891(int arg0) {
        int var1 = 125 % ((arg0 - 20) / 35);
        field1913 = null;
        field1907 = null;
        field1909 = null;
        field1914 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lqn;IIIIZ)V")
    public abstract void method94(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method97(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Lqn;IIIIZ)Z")
    public abstract boolean method99(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method107(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
    public abstract int method100(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)I")
    public abstract int method92(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
    public class143(int arg0, int arg1) {
        this.field1908 = arg1;
        this.field1906 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ldt;[I)V")
    public abstract void method105(class147 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Lqn;IIIIZ)V")
    public abstract void method95(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public abstract void method106(int arg0, int arg1, int arg2);

    static {
        new class151("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field1912 = 0;
        field1913 = new class241(10);
    }
}
