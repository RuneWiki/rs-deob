import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class39 extends class88 {

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "[Lpe;")
    public class241[] field480;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "Ljava/lang/String;")
    public static String field478 = "Loading...";

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Lsb;")
    public static class110 field483 = new class110(32);

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "Z")
    public static boolean field486 = true;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Ls;")
    public static class107 field488;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "[I")
    public static int[] field482;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "[[I")
    public static int[][] field487;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method210(int arg0, int arg1, int arg2, long arg3) {
        class246 var5 = class46.field585[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4046 != null && var5.field4046.field2977 == arg3) {
            return true;
        } else if (var5.field4054 != null && var5.field4054.field2051 == arg3) {
            return true;
        } else if (var5.field4056 != null && var5.field4056.field118 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4044; var6++) {
                if (var5.field4038[var6].field244 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IC)C")
    public static final char method211(int arg0, char arg1) {
        field481++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg1 == 'œ') {
            return 'e';
        } else {
            int var2 = -7 / ((40 - arg0) / 55);
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public static void method212(int arg0) {
        field483 = null;
        if (arg0 != -9998) {
            field483 = null;
        }
        field478 = null;
        field488 = null;
        field487 = null;
        field482 = null;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)Z")
    public final boolean method213(int arg0, int arg1) {
        if (arg0 < 9) {
            field486 = true;
        }
        field479++;
        return this.field480[arg1].field3966;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILnl;ZLnl;)I")
    public static final int method214(int arg0, int arg1, class216 arg2, boolean arg3, class216 arg4) {
        field485++;
        if (arg0 == 1) {
            int var5 = arg2.field3846;
            int var6 = arg4.field3846;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg0 == 2) {
            return class128.method872((byte) 83, class281.field4458, arg2.method1516((byte) 30).field3076, arg4.method1516((byte) 30).field3076);
        } else if (arg0 == 3) {
            if (arg4.field3472.equals("-")) {
                if (arg2.field3472.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field3472.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class128.method872((byte) 122, class281.field4458, arg2.field3472, arg4.field3472);
            }
        } else if (arg0 == 4) {
            if (arg4.method1648((byte) 82)) {
                return arg2.method1648((byte) 82) ? 0 : 1;
            } else if (arg2.method1648((byte) 82)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg4.method1647(-104)) {
                return arg2.method1647(19) ? 0 : 1;
            } else if (arg2.method1647(arg1 + 8537)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg4.method1646(4)) {
                return arg2.method1646(4) ? 0 : 1;
            } else if (arg2.method1646(arg1 + 8661)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 7) {
            return arg1 == -8657 ? arg4.field3466 - arg2.field3466 : -125;
        } else if (arg4.method1650((byte) -121)) {
            return arg2.method1650((byte) -121) ? 0 : 1;
        } else if (arg2.method1650((byte) -121)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Leh;Leh;IZ)V")
    public class39(class137 arg0, class137 arg1, int arg2, boolean arg3) {
        class269 var5 = new class269();
        int var6 = arg0.method926(26899, arg2);
        this.field480 = new class241[var6];
        int[] var7 = arg0.method942(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method928(arg2, (byte) 121, var7[var8]);
            class75 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class75 var12 = (class75) var5.method1802(43); var12 != null; var12 = (class75) var5.method1815(0)) {
                if (var12.field941 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method934(-1, var11, 0);
                } else {
                    var13 = arg1.method934(-1, 0, var11);
                }
                var10 = new class75(var11, var13);
                var5.method1803(var10, -1);
            }
            this.field480[var7[var8]] = new class241(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)Z")
    public final boolean method215(int arg0, int arg1) {
        if (arg1 == -22272) {
            field484++;
            return this.field480[arg0].field3978;
        } else {
            return true;
        }
    }
}
