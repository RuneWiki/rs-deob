import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 {

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
    public static int[] field437 = new int[500];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[Lqg;")
    public static class428[] field433 = new class428[14];

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "J")
    public static long field438;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lri;")
    public static class97 field434;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lri;")
    public static class97 field436;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 5)
    public static void method432(int arg0) {
        field437 = null;
        if (arg0 == 4) {
            field436 = null;
            field434 = null;
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I", line = 21)
    public static final int method433(byte arg0, int arg1) {
        if (arg0 >= -73) {
            method432(-13);
        }
        field435++;
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)Z", line = 40)
    public static final boolean method434(boolean arg0, int arg1) {
        if (!arg0) {
            method433((byte) -61, -52);
        }
        field431++;
        return arg1 >= 4 && arg1 <= 8;
    }
}
