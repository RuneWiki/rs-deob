import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lqe;")
    public static class179 field66 = class206.method1380("Benutzername: ", (byte) -127);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Ls;")
    public static class194 field63 = new class194(64);

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lqe;")
    public static class179 field67 = class206.method1380("Spieler", (byte) 31);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method30(int arg0) {
        field63 = null;
        if (arg0 != 64) {
            field67 = null;
        }
        field66 = null;
        field67 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z")
    public static final boolean method31(int arg0, byte arg1) {
        field65++;
        int var2 = 21 % ((14 - arg1) / 63);
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lpf;")
    public static final class169 method32(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3678;
    }
}
