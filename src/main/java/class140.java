import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class140 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[[I")
    public static int[][] field2668 = new int[104][104];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[Lcg;")
    public static class1[] field2670 = new class1[4];

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
    public static int[] field2674 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lhh;")
    private static class163 field2677 = class137.method1065("Loading interfaces )2 ", 17);

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Lhh;")
    private static class163 field2675 = class137.method1065("", 17);

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Lhh;")
    public static class163 field2682 = field2677;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field2683 = -1;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lhh;")
    public static class163 field2678 = field2675;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field2680;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[B")
    public byte[] field2669;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[B")
    public byte[] field2672;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lpa;I)V")
    public static final void method1077(class123 arg0, int arg1) {
        class135.field2620 = arg0;
        field2671++;
        if (arg1 != 31012) {
            method1080(false, 62);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field2675 = null;
        field2674 = null;
        field2678 = null;
        field2677 = null;
        field2668 = null;
        int var1 = -65 / ((arg0 + 2) / 57);
        field2682 = null;
        field2670 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static final void method1079(byte arg0) {
        if (arg0 != 49) {
            return;
        }
        field2676++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class202.field3647 - 1; var2++) {
                if (class4.field76[var2] < 1000 && class4.field76[var2 + 1] > 1000) {
                    class163 var3 = class60.field993[var2];
                    class60.field993[var2] = class60.field993[var2 + 1];
                    var1 = false;
                    class60.field993[var2 + 1] = var3;
                    class163 var4 = class62.field1047[var2];
                    class62.field1047[var2] = class62.field1047[var2 + 1];
                    class62.field1047[var2 + 1] = var4;
                    int var5 = class23.field375[var2];
                    class23.field375[var2] = class23.field375[var2 + 1];
                    class23.field375[var2 + 1] = var5;
                    int var6 = class213.field3882[var2];
                    class213.field3882[var2] = class213.field3882[var2 + 1];
                    class213.field3882[var2 + 1] = var6;
                    short var7 = class4.field76[var2];
                    class4.field76[var2] = class4.field76[var2 + 1];
                    class4.field76[var2 + 1] = var7;
                    long var8 = class51.field860[var2];
                    class51.field860[var2] = class51.field860[var2 + 1];
                    class51.field860[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1080(boolean arg0, int arg1) {
        if (!arg0) {
            field2674 = null;
        }
        field2686++;
        return (-arg1 & arg1) == arg1;
    }
}
