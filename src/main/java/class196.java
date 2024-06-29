import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class196 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "Lp;")
    private static class280 field3429 = class18.method140((byte) -127, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lp;")
    private static class280 field3428 = class18.method140((byte) -117, "Close");

    @OriginalMember(owner = "client!t", name = "k", descriptor = "Lp;")
    public static class280 field3435 = field3429;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Lp;")
    public static class280 field3438 = field3428;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "J")
    public long field3437;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lgf;")
    public static class123 field3439;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "Lrk;")
    public class265 field3431;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lrk;")
    public class265 field3434;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "Lrk;")
    public class265 field3440;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[[I")
    public static int[][] field3426;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1342(int arg0) {
        field3438 = null;
        if (arg0 != 12802) {
            return;
        }
        field3439 = null;
        field3426 = null;
        field3428 = null;
        field3435 = null;
        field3429 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
    public static final void method1343(int arg0, int arg1) {
        field3436++;
        class201 var2 = (class201) class103.field1708.method150((long) arg0, 127);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field3511.length; var3++) {
            var2.field3511[var3] = -1;
            var2.field3520[var3] = 0;
        }
        int var4 = -29 % ((arg1 - 82) / 35);
    }
}
