import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class167 {

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field2832 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Z")
    public static boolean field2826 = false;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Z")
    public static volatile boolean field2828 = true;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Loh;")
    public static class258 field2830 = class153.method1046("::qa_op_test", 89);

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "J")
    public static long field2835 = 0L;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lmb;")
    public static class172 field2834 = new class172(30);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[S")
    public static short[] field2838;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[[[B")
    public static byte[][][] field2829;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[[[B")
    public static byte[][][] field2836;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1108(int arg0, int arg1, int arg2) {
        field2833++;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = arg0 & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FEE6CA) >> 19;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 64)
    public static void method1109(int arg0) {
        field2838 = null;
        if (arg0 == 0) {
            field2830 = null;
            field2834 = null;
            field2829 = (byte[][][]) null;
            field2836 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lva;II)V", line = 80)
    private final void method1110(class235 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field2835 = -64L;
        }
        if (arg1 == 5) {
            this.field2832 = arg0.method1615(-128);
        }
        field2837++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lva;I)V", line = 106)
    public final void method1111(class235 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field2827++;
        while (true) {
            int var3 = arg0.method1589(90);
            if (var3 == 0) {
                return;
            }
            this.method1110(arg0, var3, 0);
        }
    }
}
