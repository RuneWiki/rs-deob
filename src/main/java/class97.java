import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class97 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
    public static int[] field1823 = new int[256];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Lqe;")
    public static class179 field1826 = class206.method1380("<col=40ff00>", (byte) 9);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Z")
    public static boolean field1825;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public static final void method623(int arg0, int arg1, int arg2) {
        field1824++;
        if (arg2 != 29295) {
            method624((byte) -61);
        }
        if (class155.field2796 != arg1) {
            class124.field2292 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class124.field2292[var3] = (var3 << 12) / arg1;
            }
            class227.field4193 = arg1 - 1;
            class189.field3506 = arg1 == 64 ? 2048 : 4096;
            class155.field2796 = arg1;
        }
        if (class117.field2216 == arg0) {
            return;
        }
        if (class155.field2796 == arg0) {
            class94.field1769 = class124.field2292;
        } else {
            class94.field1769 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class94.field1769[var4] = (var4 << 12) / arg0;
            }
        }
        class233.field4296 = arg0 - 1;
        class117.field2216 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method624(byte arg0) {
        field1826 = null;
        field1823 = null;
        if (arg0 >= -2) {
            field1821 = 37;
        }
    }
}
