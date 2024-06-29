import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class108 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lv;")
    public static class122 field2666 = class55.method425(-117, "(X");

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lv;")
    private static class122 field2668 = class55.method425(-120, "glow2:");

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lv;")
    private static class122 field2670 = class55.method425(-62, "Loading friend list");

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lv;")
    private static class122 field2677 = class55.method425(-59, "Please contact customer support)3");

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2674 = 256;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static volatile int field2675 = -1;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Z")
    public static boolean field2672 = false;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lv;")
    public static class122 field2665 = field2677;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field2676 = -1;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lv;")
    public static class122 field2664 = field2668;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lv;")
    public static class122 field2680 = field2670;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lrd;")
    public static class106 field2673;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIII)I", line = 7)
    public static final int method837(byte arg0, int arg1, int arg2, int arg3) {
        field2669++;
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg3;
        int var8 = arg1 & 0x7F;
        if (arg0 != 59) {
            method837((byte) 89, -118, -75, -45);
        }
        if (arg3 < 3 && (class54.field1408[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var9 = (128 - var8) * class93.field2372[var7][var4][var5 - -1] + class93.field2372[var7][var4 + 1][var5 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class93.field2372[var7][var4][var5] + class93.field2372[var7][var4 + 1][var5] * var8 >> 7;
        return (128 - var6) * var10 + var6 * var9 >> 7;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 40)
    public static void method838(byte arg0) {
        field2680 = null;
        if (arg0 != -7) {
            method838((byte) 29);
        }
        field2666 = null;
        field2668 = null;
        field2677 = null;
        field2673 = null;
        field2670 = null;
        field2664 = null;
        field2665 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lv;IIILv;II)V", line = 78)
    public static final void method839(class122 arg0, int arg1, int arg2, int arg3, class122 arg4, int arg5, int arg6) {
        if (class51.field1313 < 500) {
            class23.field617[class51.field1313] = class59.method454(new class122[] { arg0, class21.field577, arg4 }, 5176);
            class56.field1483[class51.field1313] = arg2;
            class34.field837[class51.field1313] = arg3;
            class88.field2255[class51.field1313] = arg5;
            class60.field1550[class51.field1313] = arg1;
            class51.field1313++;
        }
        field2667++;
        int var7 = 62 / ((-arg6 - 61) / 59);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)[B", line = 142)
    public static final synchronized byte[] method840(byte arg0, int arg1) {
        field2679++;
        if (arg1 == 100 && class84.field2187 > 0) {
            byte[] var2 = class7.field167[--class84.field2187];
            class7.field167[class84.field2187] = null;
            return var2;
        } else if (arg1 == 5000 && class102.field2525 > 0) {
            byte[] var3 = class119.field2895[--class102.field2525];
            class119.field2895[class102.field2525] = null;
            return var3;
        } else {
            int var4 = 37 % ((6 - arg0) / 54);
            if (arg1 == 30000 && class72.field1868 > 0) {
                byte[] var5 = class42.field1092[--class72.field1868];
                class42.field1092[class72.field1868] = null;
                return var5;
            } else {
                return new byte[arg1];
            }
        }
    }
}
