import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class232 {

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "J")
    public long field3672 = 0L;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lok;")
    public static class41 field3669 = class137.method956("(Z", 45);

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
    public static int[] field3671 = new int[128];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Lth;")
    public class126 field3674;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lmh;")
    public static class65 field3666;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
    public static int[] field3661;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 10)
    public static void method1651(int arg0) {
        field3666 = null;
        field3661 = null;
        field3669 = null;
        field3671 = null;
        if (arg0 <= 26) {
            field3666 = (class65) null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[SZ[Lok;)V", line = 32)
    public static final void method1652(int arg0, int arg1, short[] arg2, boolean arg3, class41[] arg4) {
        field3675++;
        if (!arg3 || arg0 >= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        class41 var7 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var7;
        short var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (var7 == null || arg4[var9] != null && arg4[var9].method292((byte) -69, var7) < (var9 & 0x1)) {
                class41 var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                short var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg4[arg1] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var8;
        method1652(arg0, var6 - 1, arg2, true, arg4);
        method1652(var6 + 1, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILok;)V", line = 114)
    public static final void method1653(int arg0, int arg1, class41 arg2) {
        field3660++;
        class46 var3 = class195.method1396(2, arg1, false);
        int var4 = -69 / ((-arg0 - 8) / 56);
        var3.method337(0);
        var3.field724 = arg2;
    }
}
