import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class54 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field552 = "wave2:";

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field553 = 0;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 8)
    public static final String method269(int arg0, int arg1, byte arg2) {
        field555++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        }
        if (arg2 != -68) {
            field554 = -36;
        }
        if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 54)
    public static void method272(boolean arg0) {
        field552 = null;
        if (arg0) {
            method272(false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lam;ILam;)V", line = 85)
    public static final void method281(class286 arg0, int arg1, class286 arg2) {
        class337.field4500 = arg0;
        class71.field787 = arg2;
        field551++;
        if (arg1 != 3639) {
            field553 = -93;
        }
        class357.field5057 = class337.field4500.method1691(3, 0);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V", line = 97)
    public class54(int arg0, int arg1) {
        this.field550 = arg1;
        this.field556 = arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
    public abstract int method265(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lve;IIIIZ)V")
    public abstract void method266(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method267(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method268(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lfs;[I)V")
    public abstract void method270(class349 arg0, int[] arg1);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I")
    public abstract int method271(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Lve;IIIIZ)V")
    public abstract void method273(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILve;)Lve;")
    public abstract class307 method274(int arg0, int arg1, class307 arg2);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)V")
    public abstract void method276(int arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public abstract void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Lve;IIIIZ)Z")
    public abstract boolean method278(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
    public abstract void method280();
}
