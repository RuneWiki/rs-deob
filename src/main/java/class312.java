import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class312 {

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "Lgba;")
    public static class388 field4206;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method1832(int arg0, int arg1, byte arg2) {
        field4207++;
        int var3 = -80 / ((arg2 - 61) / 36);
        int var4 = arg1 - arg0;
        if (var4 < -9) {
            return "<col=ff0000>";
        } else if (var4 < -6) {
            return "<col=ff3000>";
        } else if (var4 < -3) {
            return "<col=ff7000>";
        } else if (var4 < 0) {
            return "<col=ffb000>";
        } else if (var4 > 9) {
            return "<col=00ff00>";
        } else if (var4 > 6) {
            return "<col=40ff00>";
        } else if (var4 > 3) {
            return "<col=80ff00>";
        } else if (var4 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
    public static void method1833(int arg0) {
        field4206 = null;
        int var1 = -9 % ((-arg0 - 90) / 34);
    }
}
