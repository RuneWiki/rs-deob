import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class142 extends class171 {

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "[B")
    public byte[] field2590;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field2588 = 0;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field2591 = 2;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lwf;")
    public static class16 field2589 = new class16(5);

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Lha;")
    public static class46 field2598 = class271.method1828("blaugr-Un:", -46);

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Lha;")
    public static class46 field2597 = class271.method1828(" steht bereits auf Ihrer Ignorieren)2Liste(Q", -46);

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "Lha;")
    private static class46 field2600 = class271.method1828("flash1:", -46);

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "Lha;")
    public static class46 field2595 = field2600;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "Lha;")
    public static class46 field2596 = field2600;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "[B")
    public static byte[] field2602 = new byte[520];

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "Lfa;")
    public static class211 field2601;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[I")
    public static int[] field2594;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "[Lkg;")
    public static class21[] field2599;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        int var1 = -102 / ((arg0 - 23) / 43);
        field2598 = null;
        field2600 = null;
        field2601 = null;
        field2599 = null;
        field2602 = null;
        field2597 = null;
        field2589 = null;
        field2594 = null;
        field2595 = null;
        field2596 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "([B)V")
    public class142(byte[] arg0) {
        this.field2590 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static final void method1072(int arg0) {
        if (arg0 != -1) {
            field2602 = null;
        }
        field2593++;
        try {
            if (class76.field1427 == 1) {
                int var1 = class23.field340.method795(-24148);
                if (var1 > 0 && class23.field340.method829(false)) {
                    int var2 = var1 - class217.field3838;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class23.field340.method821(true, var2);
                } else {
                    class23.field340.method792(0);
                    class23.field340.method816(-120);
                    if (class111.field2110 == null) {
                        class76.field1427 = 0;
                    } else {
                        class76.field1427 = 2;
                    }
                    class122.field2275 = null;
                    class138.field2477 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class23.field340.method792(0);
            class111.field2110 = null;
            class76.field1427 = 0;
            class122.field2275 = null;
            class138.field2477 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)J")
    public static final long method1073(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        return var3 == null || var3.field3606 == null ? 0L : var3.field3606.field2949;
    }
}
