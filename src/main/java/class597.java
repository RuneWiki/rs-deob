import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class597 extends class649 {

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "[I")
    public static int[] field8456 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
    public final int method3425(int arg0) {
        ++field8457;
        if (arg0 != 3) {
            field8456 = null;
        }
        return super.field9223;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            return -114;
        } else {
            ++field8453;
            return 1;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZZII)V")
    public static final void method3426(String arg0, int arg1, String arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        class666.field9462.field6219 = 1;
        ++field8459;
        String var7 = arg0.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg6 != -1) {
            class193 var11 = class382.field5728.method1997((byte) 119, arg6);
            if (var11 == null || !arg4 == var11.method1463(-6764)) {
                return;
            }
            if (var11.method1463(arg1 + -6764)) {
                var10 = var11.field3338;
            } else {
                var9 = var11.field3339;
            }
        }
        int var12 = 0;
        for (int var13 = 0; ~class556.field7917.field1228 < ~var13; ++var13) {
            class688 var16 = class556.field7917.method741(115, var13);
            if ((!arg3 || var16.field9735) && ~var16.field9750 == 0 && var16.field9713 == -1 && var16.field9736 == 0 && ~var16.field9714.toLowerCase().indexOf(var7) != 0) {
                if (~arg6 != 0) {
                    if (arg4) {
                        if (!arg2.equals(var16.method3832(arg6, var10, 23604))) {
                            continue;
                        }
                    } else if (~var16.method3837(arg6, var9, (byte) -124) != ~arg5) {
                        continue;
                    }
                }
                if (~var12 <= -251) {
                    class15.field155 = -1;
                    class112.field1732 = null;
                    return;
                }
                if (var12 >= var8.length) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; ++var18) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class210.field3501 = 0;
        class15.field155 = var12;
        class112.field1732 = var8;
        String[] var14 = new String[class15.field155];
        for (int var15 = arg1; class15.field155 > var15; ++var15) {
            var14[var15] = class556.field7917.method741(class584.method3367(arg1, 121), var8[var15]).field9714;
        }
        class592.method3394(var14, class112.field1732, 0);
        class666.field9462.method2611((byte) 108);
        class666.field9462.field6219 = 2;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
    public static void method3427(boolean arg0) {
        if (arg0) {
            field8456 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLofa;)Lgs;")
    public static final class744 method3428(boolean arg0, class301 arg1) {
        ++field8458;
        if (!arg0) {
            field8456 = null;
        }
        return new class744(arg1.method1977((byte) 8), arg1.method1977((byte) 115), arg1.method1977((byte) -123), arg1.method1977((byte) 117), arg1.method1952(22085), arg1.method1952(22085), arg1.method1987(-33));
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = 45 / ((-18 - arg0) / 50);
        ++field8452;
        return 3;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field8454;
        if (~super.field9223 > -1 || ~super.field9223 < -5) {
            super.field9223 = this.method135(-108);
        }
        if (arg0 != 1) {
            field8456 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILhs;)V")
    public class597(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lhs;)V")
    public class597(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 <= -120) {
            ++field8455;
            super.field9223 = arg0;
        }
    }
}
