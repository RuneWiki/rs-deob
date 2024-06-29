import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class137 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lgd;")
    public static class46 field3259 = new class46(64);

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Laf;")
    private static class7 field3273 = class48.method406(40, "Please try again)3");

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Laf;")
    public static class7 field3269 = field3273;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Laf;")
    private static class7 field3270 = class48.method406(40, "Malformed login packet)3");

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
    public static int[] field3272 = new int[200];

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Laf;")
    private static class7 field3278 = class48.method406(40, "Username: ");

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Laf;")
    public static class7 field3276 = class48.method406(40, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
    public static int[] field3275 = new int[25];

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Laf;")
    public static class7 field3274 = field3270;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static volatile int field3280 = 0;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Laf;")
    public static class7 field3281 = field3278;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "J")
    public long field3261;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lof;")
    public static class103 field3271;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lte;")
    public class137 field3262;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lte;")
    public class137 field3268;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[[I")
    public static int[][] field3277;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public final void method1124(byte arg0) {
        field3263++;
        if (this.field3262 == null) {
            return;
        }
        this.field3262.field3268 = this.field3268;
        if (arg0 != 62) {
            this.field3261 = -112L;
        }
        this.field3268.field3262 = this.field3262;
        this.field3262 = null;
        this.field3268 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1125(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3267++;
        if (class9.method106(arg4, (byte) 113)) {
            if (arg2) {
                field3281 = null;
            }
            class77.method659(arg3, arg6, -1, class52.field1251[arg4], arg1, arg5, !arg2, arg0, arg7);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLkb;IILaf;Laf;)V")
    public static final void method1126(boolean arg0, class71 arg1, int arg2, int arg3, class7 arg4, class7 arg5) {
        field3264++;
        int var6 = 20 % ((arg3 - 15) / 47);
        int var7 = arg1.method586(arg4, -4795);
        int var8 = arg1.method560(arg5, var7, 116);
        client.method203(arg2, var8, -11361, arg0, var7, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
    public static final boolean method1127(int arg0, int arg1) {
        if (arg1 != -3889) {
            method1125(48, -92, false, 73, -94, -7, 95, 111);
        }
        field3257++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
    public static final void method1128(byte arg0, int arg1) {
        field3266++;
        int var2 = -7 / ((arg0 + 22) / 47);
        if (arg1 == -1 || !class9.method106(arg1, (byte) 120)) {
            return;
        }
        class103[] var3 = class52.field1251[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class103 var5 = var3[var4];
            if (var5.field2495 != null) {
                class39 var6 = new class39();
                var6.field962 = var5.field2495;
                var6.field967 = var5;
                class80.method675(-2001, var6);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static void method1129(byte arg0) {
        field3272 = null;
        field3273 = null;
        field3276 = null;
        field3274 = null;
        field3270 = null;
        field3259 = null;
        field3278 = null;
        if (arg0 >= -104) {
            return;
        }
        field3271 = null;
        field3275 = null;
        field3269 = null;
        field3277 = null;
        field3281 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z")
    public final boolean method1130(int arg0) {
        field3260++;
        if (this.field3262 == null) {
            return false;
        } else {
            if (arg0 != 0) {
                method1127(24, 78);
            }
            return true;
        }
    }
}
