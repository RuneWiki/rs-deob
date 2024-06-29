import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class195 {

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public int field2854 = 2048;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public int field2852 = 2048;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field2856 = 0;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public int field2857 = 0;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "[I")
    public static int[] field2853;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field2853 = null;
        if (arg0 != 3914) {
            method1376(9);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lsl;B)V")
    public final void method1377(class479 arg0, byte arg1) {
        field2851++;
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                int var4 = -72 / ((54 - arg1) / 32);
                return;
            }
            this.method1378(25510, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILsl;I)V")
    private final void method1378(int arg0, class479 arg1, int arg2) {
        if (arg0 != 25510) {
            return;
        }
        if (arg2 == 1) {
            this.field2857 = arg1.method2886(true);
        } else if (arg2 == 2) {
            this.field2852 = arg1.method2882(-1);
        } else if (arg2 == 3) {
            this.field2854 = arg1.method2882(-1);
        } else if (arg2 == 4) {
            this.field2856 = arg1.method2870(-11395);
        }
        field2855++;
    }
}
