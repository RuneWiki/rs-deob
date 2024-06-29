import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class484 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field7356 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field7357 = -1;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(ILza;)Lon;")
    public abstract class514 method108(int arg0, class497 arg1);

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(B)V")
    public static void method2981(byte arg0) {
        field7356 = null;
        if (arg0 != 16) {
            method2981((byte) 9);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public abstract void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
    public abstract void method934(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILza;)Z")
    public abstract boolean method105(int arg0, int arg1, int arg2, class497 arg3);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(ILza;)V")
    public abstract void method102(int arg0, class497 arg1);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)Z")
    public abstract boolean method936(boolean arg0);
}
