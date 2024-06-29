import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class239 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[[I")
    public static int[][] field3054 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lbv;")
    public static class568 field3052 = new class568();

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lha;")
    public static class116 field3057;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lkr;")
    public static class329 field3056;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)Z")
    public abstract boolean method64(int arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILqa;I)Z")
    public abstract boolean method63(int arg0, int arg1, class167 arg2, int arg3);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLqa;)Lqba;")
    public abstract class541 method59(byte arg0, class167 arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IZ)I")
    public static final int method1493(String arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1495(-26, null);
        }
        field3055++;
        return class24.method152(true, arg0, arg1, (byte) -104);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Lqa;I)V")
    public abstract void method66(class167 arg0, int arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public abstract void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6);

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public abstract void method56(byte arg0);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3052 = null;
        field3054 = null;
        field3057 = null;
        if (arg0 == 1) {
            field3056 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1495(int arg0, String arg1) {
        field3053++;
        if (arg0 <= 84) {
            field3052 = null;
        }
        for (int var2 = 0; var2 < class418.field5717.length; var2++) {
            if (class418.field5717[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(ILqa;)Lud;")
    public abstract class119 method58(int arg0, class167 arg1);
}
