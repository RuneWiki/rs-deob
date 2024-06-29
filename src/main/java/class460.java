import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class460 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field6862;

    static {
        new class305("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Ljava/lang/String;", line = 20)
    public static final String method2830(int arg0, int arg1, int arg2) {
        field6862++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (arg1 > ~var3) {
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
}
