import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class195 extends class259 {

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "[I")
    public static int[] field3499 = new int[4096];

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lcc;")
    public static class209 field3500 = class95.method669(113, "<br>");

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field3516 = -1;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Lcc;")
    public class209 field3501;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lp;")
    public static class285 field3502;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "[Lca;")
    public static class264[] field3513;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public static void method1335(byte arg0) {
        field3502 = null;
        int var1 = 94 % ((-46 - arg0) / 58);
        field3499 = null;
        field3500 = null;
        field3513 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLtf;)Lcc;")
    public static final class209 method1336(byte arg0, class106 arg1) {
        ++field3512;
        return arg0 != -72 ? null : class214.method1505(arg1, 32767, 97);
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)I")
    public final int method1337(int arg0) {
        ++field3510;
        if (arg0 < 117) {
            this.field3511 = -33;
        }
        return (int) (255L & super.field596 >>> 32);
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V")
    public final void method1338(int arg0) {
        super.field4681 |= Long.MIN_VALUE;
        if (~this.method1343(29406) == -1L) {
            class213.field3851.method501(this, true);
        }
        ++field3505;
        if (arg0 != 0) {
            field3499 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
    public static final void method1339(int arg0, int arg1, int arg2, int arg3) {
        class109 var4 = class106.field2089[arg0][arg1][arg2];
        if (var4 != null) {
            class181 var5 = var4.field2218;
            if (var5 != null) {
                var5.field3281 = var5.field3281 * arg3 / 16;
                var5.field3262 = var5.field3262 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public final void method1340(boolean arg0) {
        super.field4681 = Long.MIN_VALUE & super.field4681 | class180.method1236(93) - -500L;
        class256.field4618.method501(this, arg0);
        ++field3509;
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)I")
    public final int method1341(int arg0) {
        if (arg0 != -15267) {
            return 70;
        } else {
            ++field3504;
            return (int) super.field596;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3508;
        if (arg5 != 7771) {
            method1339(-3, 33, 90, 53);
        }
        class273[] var7 = class1.field21;
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class273 var9 = var7[var8];
            if (var9 != null && ~var9.field4830 == -3) {
                class50.method380(-39, arg0 >> 1, arg4, (-class245.field4444 + var9.field4845 << 7) + var9.field4834, (-class174.field3178 + var9.field4843 << 7) - -var9.field4836, arg3, var9.field4838 * 2, arg6 >> 1);
                if (class97.field1891 > -1 && class163.field2968 % 20 < 10) {
                    class249.field4482[var9.field4833].method232(arg2 - (-class97.field1891 + 12), arg1 + -28 + class241.field4372);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
    public class195(int arg0, int arg1) {
        super.field596 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)J")
    public final long method1343(int arg0) {
        if (arg0 != 29406) {
            return 89L;
        } else {
            ++field3514;
            return Long.MAX_VALUE & super.field4681;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLsj;Lsj;)V")
    public static final void method1344(byte arg0, class49 arg1, class49 arg2) {
        class130.field2495 = arg1;
        ++field3515;
        class103.field1982 = arg2;
        if (arg0 != 18) {
            field3513 = null;
        }
    }
}
