import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class131 extends class260 {

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "Loh;")
    public static class263 field2399 = class253.method1681(-124, "weiss:");

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Loh;")
    public static class263 field2401 = class253.method1681(-122, "Cabbage");

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Loh;")
    public static class263 field2402 = class253.method1681(-127, "::rebuild");

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "J")
    public static long field2398 = 0L;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "[Lbb;")
    public static class88[] field2400;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        int[] var3 = super.field4511.method304(arg0, false);
        ++field2404;
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field4511.field1029) {
                int var4 = class275.field4825[arg0];
                for (int var5 = 0; ~class49.field1052 < ~var5; ++var5) {
                    var3[var5] = this.method844(class70.field1409[var5], var4, (byte) -126) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class131() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static void method843(byte arg0) {
        field2401 = null;
        field2399 = null;
        if (arg0 != -121) {
            field2401 = null;
        }
        field2402 = null;
        field2400 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIB)I")
    private final int method844(int arg0, int arg1, byte arg2) {
        ++field2407;
        if (arg2 != -126) {
            return 31;
        } else {
            int var4 = arg1 * 57 + arg0;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIIIIIIIIIIB)Z")
    public static final boolean method845(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        ++field2406;
        if (arg11 > -92) {
            method846(53, 63, 86, (byte) 95, -61, 120, -78, -4, -25);
        }
        if (class229.field4018.method898(86) == 2) {
            return class214.method1455(arg10, arg2, arg5, arg1, arg7, arg3, arg6, (byte) -85, arg9, arg4, arg0, arg8);
        } else {
            return class229.field4018.method898(81) > 2 ? class125.method807(arg3, arg7, arg0, arg5, arg6, arg8, class229.field4018.method898(69), arg10, 105, arg1, arg4, arg2, arg9) : class115.method753(arg0, arg7, arg10, arg1, arg2, arg8, -1, arg6, arg5, arg3, arg4, arg9);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method846(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 24 % ((10 - arg3) / 63);
        ++field2405;
        if (class166.method1090((byte) -125, arg2)) {
            class232.field4054 = null;
            class78.method532(arg1, class164.field2974[arg2], arg4, arg7, arg6, (byte) 83, arg5, arg0, arg8, -1);
            if (class232.field4054 != null) {
                class78.method532(arg1, class232.field4054, arg4, class126.field2327, arg6, (byte) 83, arg5, class87.field1748, arg8, -1412584499);
                class232.field4054 = null;
            }
        } else if (~arg6 != 0) {
            class21.field629[arg6] = true;
        } else {
            for (int var10 = 0; ~var10 > -101; ++var10) {
                class21.field629[var10] = true;
            }
        }
    }
}
