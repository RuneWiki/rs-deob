import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class175 extends class62 {

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Lef;")
    public static class214 field2732 = null;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "Lrh;")
    public static class46 field2735 = new class46();

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Lce;")
    public static class216 field2738 = new class216();

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[Lfd;")
    public static class122[] field2742 = new class122[28];

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "[I")
    public static int[] field2743 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Ldl;")
    public static class123 field2745;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "Ld;")
    public class237 field2740;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[B")
    public byte[] field2739;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        field2732 = null;
        if (arg0 == -103) {
            field2745 = null;
            field2738 = null;
            field2742 = null;
            field2735 = null;
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)[B")
    public final byte[] method432(int arg0) {
        if (arg0 != 24977) {
            this.method434((byte) -83);
        }
        ++field2733;
        if (super.field854) {
            throw new RuntimeException();
        } else {
            return this.field2739;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)I")
    public final int method434(byte arg0) {
        ++field2736;
        if (super.field854) {
            return 0;
        } else {
            if (arg0 != -104) {
                field2732 = null;
            }
            return 100;
        }
    }
}
