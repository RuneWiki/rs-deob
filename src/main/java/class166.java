import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class166 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2715 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lpi;")
    public static class192 field2716 = new class192(0, -1);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lck;")
    public static class1 field2718 = new class1(128);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[J")
    public static long[] field2719 = new long[256];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lvh;")
    public static class108 field2720;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field2714;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        field2719 = null;
        if (arg0 <= 87) {
            method1115(-111, (class108) null, true);
        }
        field2714 = null;
        field2718 = null;
        field2716 = null;
        field2720 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILvh;Z)[Lfc;")
    public static final class148[] method1115(int arg0, class108 arg1, boolean arg2) {
        field2713++;
        if (class60.method375((byte) -39, arg0, arg1)) {
            return arg2 ? null : class132.method920((byte) 127);
        } else {
            return null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2719[var0] = var1;
        }
    }
}
