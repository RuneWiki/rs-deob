import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class564 {

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "[Llh;")
    public static class487[] field8100 = new class487[35];

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "Lrl;")
    public static class672 field8101 = new class672(14, 16);

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "[I")
    public static int[] field8104 = new int[1];

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "Lha;")
    public class54 field8103;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Lda;")
    public class55 field8102;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "[[Lpca;")
    public static class665[][] field8105;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)Z")
    public static final boolean method3343(int arg0, int arg1) {
        if (arg1 != 26314) {
            method3344((byte) 90);
        }
        field8099++;
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public static void method3344(byte arg0) {
        field8104 = null;
        field8101 = null;
        if (arg0 >= 15) {
            field8100 = null;
            field8105 = null;
        }
    }
}
