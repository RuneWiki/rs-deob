import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class214 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field3587 = 0;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lqd;")
    public static class40 field3586 = class147.method1106("Verbindung zum Update)2Server hergestellt)3", (byte) -96);

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "Lqd;")
    public static class40 field3590 = class147.method1106("details", (byte) -68);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lsj;")
    public static class52 field3585 = new class52();

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "[[[B")
    public static byte[][][] field3591;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILsd;)V", line = 16)
    public final void method1514(int arg0, class26 arg1) {
        while (true) {
            int var3 = arg1.method226(255);
            if (var3 == 0) {
                if (arg0 != -1) {
                    return;
                }
                field3588++;
                return;
            }
            this.method1516(var3, arg0 + 6, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 54)
    public static void method1515(byte arg0) {
        field3586 = null;
        field3585 = null;
        if (arg0 > -123) {
            method1515((byte) 115);
        }
        field3591 = (byte[][][]) null;
        field3590 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILsd;)V", line = 78)
    private final void method1516(int arg0, int arg1, class26 arg2) {
        if (arg0 == arg1) {
            this.field3587 = arg2.method197(-1);
        }
        field3589++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lsd;I)Laj;", line = 92)
    public static final class1 method1517(class26 arg0, int arg1) {
        field3592++;
        if (arg1 <= 30) {
            method1515((byte) -19);
        }
        return new class1(arg0.method201(true), arg0.method201(true), arg0.method201(true), arg0.method201(true), arg0.method244(-26711), arg0.method244(-26711), arg0.method226(255));
    }
}
