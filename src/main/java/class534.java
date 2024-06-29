import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class534 {

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "[J")
    public static long[] field7035 = new long[256];

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field7037 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[F")
    public static float[] field7039;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "F")
    public static float field7040;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lwu;")
    public static class376 field7038;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V")
    public static void method2968(boolean arg0) {
        field7037 = null;
        if (arg0) {
            field7038 = null;
        }
        field7035 = null;
        field7039 = null;
        field7038 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZII)I")
    public static final int method2969(int arg0, boolean arg1, int arg2, int arg3) {
        field7036++;
        if ((class184.field2782[arg0][arg3][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg1) {
            return -96;
        } else if (arg0 <= 0 || (class184.field2782[1][arg3][arg2] & 0x2) == 0) {
            return arg0;
        } else {
            return arg0 - 1;
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
            field7035[var0] = var1;
        }
        field7039 = new float[16];
    }
}
