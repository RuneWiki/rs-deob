import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class423 {

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "[Z")
    public static boolean[] field5968 = new boolean[8];

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Lpj;")
    public static class132 field5965;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "Lme;")
    public static class177 field5969;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "[Lxa;")
    public static class461[] field5966;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public static void method2404(byte arg0) {
        field5965 = null;
        field5969 = null;
        if (arg0 < -37) {
            field5968 = null;
            field5966 = null;
        }
    }
}
