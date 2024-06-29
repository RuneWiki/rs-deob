import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class513 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[[Z")
    public static boolean[][] field7625;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILvo;IIIZ)V")
    public static final void method3050(int arg0, class345 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class342.method2055(arg5, (long) arg3, arg1, arg3 - 116, arg0, arg4, arg2);
        field7624++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method3051(int arg0) {
        int var1 = 57 % ((arg0 + 6) / 62);
        field7625 = null;
    }
}
