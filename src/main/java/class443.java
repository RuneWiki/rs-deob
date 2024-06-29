import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class class443 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public int field6324;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lwd;")
    public static class39 field6327;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lpn;")
    public static class72 field6328;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lg;")
    public static class470 field6325;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[Lmi;")
    public static class443[] field6329;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lhq;[I)V")
    public abstract void method1866(class190 arg0, int[] arg1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lph;IIIIZ)V")
    public abstract void method1864(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1867(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILph;)Lph;")
    public abstract class125 method1869(int arg0, int arg1, class125 arg2);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method2616(int arg0) {
        field6328 = null;
        field6325 = null;
        field6327 = null;
        field6329 = null;
        if (arg0 != 1) {
            method2617(42, 69, -50, (class261) null, (class261) null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
    public abstract void method1868();

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
    public abstract int method1861(int arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public abstract void method1863(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
    public abstract int method1857(int arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lph;IIIIZ)V")
    public abstract void method1858(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Lph;IIIIZ)Z")
    public abstract boolean method1871(class125 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1865(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILv;Lv;)V")
    public static final void method2617(int arg0, int arg1, int arg2, class261 arg3, class261 arg4) {
        class263 var5 = class88.method444(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3783 = arg3;
            var5.field3780 = arg4;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)V")
    public abstract void method1859(int arg0, int arg1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1870(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V")
    public class443(int arg0, int arg1) {
        this.field6324 = arg1;
        this.field6326 = arg0;
    }

    static {
        new class40((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field6327 = class76.method387(true);
        field6328 = new class72(32, 1);
    }
}
