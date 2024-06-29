import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class654 extends class71 {

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "[I")
    public static int[] field8748 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field8745;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field8746;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method3654(byte arg0) {
        if (arg0 <= 48) {
            field8747 = -111;
        }
        field8748 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method3655(int arg0) {
        if (class472.field6541 == null || class639.field8569 == null) {
            class639.field8569 = new int[256];
            class472.field6541 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class472.field6541[var1] = (int) (Math.sin(var3) * 4096.0D);
                class639.field8569[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        int var2 = 96 % ((arg0 + 5) / 46);
        field8749++;
    }
}
