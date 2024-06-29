import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class364 {

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field5543 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public int field5539;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field5540;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public int field5544;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[Llf;")
    public static class129[] field5542;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method2346(int arg0) {
        if (arg0 < 15) {
            field5543 = 51;
        }
        field5542 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjg;)V")
    public static final void method2347(int arg0, class186 arg1) {
        field5546++;
        if (arg1.field3066.length - arg1.field3044 < 1) {
            return;
        }
        int var2 = arg1.method1322(false);
        if (~var2 > arg0 || var2 > 1 || (arg1.field3066.length - arg1.field3044) < 2) {
            return;
        }
        int var3 = arg1.method1272((byte) -49);
        if (var3 * 6 != arg1.field3066.length - arg1.field3044) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field3066.length <= arg1.field3044) {
                            return;
                        }
                        var4 = arg1.method1272((byte) -122);
                        var5 = arg1.method1284(8388607);
                    } while (var4 >= class158.field2520.length);
                } while (!class338.field5250[var4]);
            } while (class54.method360((byte) 103, var4).field881 == '1' && (var5 < -1 || var5 > 1));
            class158.field2520[var4] = var5;
        }
    }
}
