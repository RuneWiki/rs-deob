import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class230 extends class154 {

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "Lfja;")
    public static class783 field3353 = new class783(131, 12);

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "[[I")
    public static int[][] field3354 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Ljava/lang/String;", line = 7)
    public static final String method1564(int arg0, int arg1) {
        if (arg1 == -25142) {
            field3351++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF1D) >> 8) + "." + (arg0 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 22)
    public static void method1565(byte arg0) {
        if (arg0 != 91) {
            field3354 = null;
        }
        field3353 = null;
        field3354 = null;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(II)V", line = 35)
    public class230(int arg0, int arg1) {
        this.field3355 = arg0;
        this.field3352 = arg1;
    }
}
