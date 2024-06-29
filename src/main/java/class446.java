import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class446 extends class65 {

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public int field6474;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public int field6473;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method2723(int arg0, int arg1, int arg2) {
        field6475++;
        if (arg2 >= -33) {
            return null;
        }
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
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

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(II)V")
    public class446(int arg0, int arg1) {
        this.field6474 = arg0;
        this.field6473 = arg1;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIZ)Loc;")
    public static final class33 method2724(int arg0, int arg1, boolean arg2) {
        field6476++;
        if (arg1 != 9) {
            method2723(124, -5, -73);
        }
        long var3 = (long) (arg0 | (arg2 ? Integer.MIN_VALUE : 0));
        return (class33) class379.field5696.method3512(true, var3);
    }
}
