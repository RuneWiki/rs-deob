import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class153 {

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public int field2599 = 2048;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public int field2600 = 0;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public int field2602 = 0;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public int field2603 = 2048;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "Lfn;")
    public static class124 field2601 = new class124();

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field2604 = -1;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "Z")
    public static volatile boolean field2605 = true;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "Loda;")
    public static class103 field2606 = new class103();

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILqh;)V")
    private final void method1193(int arg0, int arg1, class61 arg2) {
        if (arg1 <= 47) {
            this.method1193(44, -28, null);
        }
        if (arg0 == 1) {
            this.field2600 = arg2.method732(-559537960);
        } else if (arg0 == 2) {
            this.field2599 = arg2.method723((byte) -25);
        } else if (arg0 == 3) {
            this.field2603 = arg2.method723((byte) -25);
        } else if (arg0 == 4) {
            this.field2602 = arg2.method721(-461515024);
        }
        field2607++;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
    public static void method1194(int arg0) {
        field2601 = null;
        if (arg0 == 0) {
            field2606 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lqh;I)V")
    public final void method1195(class61 arg0, int arg1) {
        if (arg1 != -1) {
            field2604 = -22;
        }
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                field2598++;
                return;
            }
            this.method1193(var3, 101, arg0);
        }
    }
}
