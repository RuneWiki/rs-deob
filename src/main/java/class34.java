import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class34 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[B")
    public static byte[] field971 = new byte[520];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "[F")
    public static float[] field973 = new float[16];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lgw;")
    public static class155 field969 = new class155();

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field974 = new String[100];

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method516(int arg0) {
        field973 = null;
        field974 = null;
        field969 = null;
        if (arg0 != 520) {
            field972 = -39;
        }
        field971 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)J")
    public abstract long method517(byte arg0);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZI)I")
    public static final int method518(int arg0, boolean arg1, int arg2) {
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (!arg1) {
            return 95;
        }
        field970++;
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    static {
        new class571("", 76);
    }
}
