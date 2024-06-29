import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class721 extends Exception {

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
    public static int[] field9799 = new int[4096];

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[[I")
    public static int[][] field9800 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Lub;")
    public static class20 field9801;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 6)
    public static void method4005(byte arg0) {
        field9801 = null;
        field9799 = null;
        if (arg0 == -126) {
            field9800 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lat;B)Lat;", line = 22)
    public static final class378 method4006(class378 arg0, byte arg1) {
        field9798++;
        int var2 = 98 / ((arg1 + 14) / 41);
        class378 var3 = client.method1979(arg0);
        if (var3 == null) {
            var3 = arg0.field5458;
        }
        return var3;
    }
}
