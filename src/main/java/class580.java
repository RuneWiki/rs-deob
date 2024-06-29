import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class580 extends class555 {

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "I")
    public static int field7931 = 0;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "F")
    public static float field7926;

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lkba;I)I")
    public static final int method3197(class573 arg0, int arg1) {
        ++field7922;
        int var2 = arg0.field7814;
        class266 var3 = arg0.method1432(~arg1);
        if (arg1 != 0) {
            field7931 = -117;
        }
        if (arg0.field3021) {
            var2 = arg0.field7797;
        } else if (~arg0.field3067 != ~var3.field3451 && ~arg0.field3067 != ~var3.field3454 && arg0.field3067 != var3.field3449 && arg0.field3067 != var3.field3460) {
            if (arg0.field3067 == var3.field3442 || ~arg0.field3067 == ~var3.field3470 || arg0.field3067 == var3.field3487 || ~arg0.field3067 == ~var3.field3483) {
                var2 = arg0.field7790;
            }
        } else {
            var2 = arg0.field7805;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lqq;)V")
    public class580(class651 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
    public final void method126(int arg0, int arg1, int arg2) {
        ++field7928;
        if (arg0 <= 81) {
            field7926 = 0.44345647F;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIIIZI)V")
    public static final void method3198(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (~(!arg1 ? class602.field8408.field4310 : class602.field8408.field4320) != -1 && arg3 != 0 && ~class413.field5414 > -51 && arg2 != -1) {
            class67.field824[class413.field5414++] = new class480((byte) (!arg1 ? 2 : 3), arg2, arg3, arg4, arg6, arg0);
        }
        ++field7929;
        if (!arg5) {
            ;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 < 45) {
            this.method126(-59, -21, 103);
        }
        ++field7920;
        super.field7580.method3630(86, false);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZ)V")
    public final void method124(boolean arg0, boolean arg1) {
        super.field7580.method3630(86, arg0);
        ++field7923;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lot;BI)V")
    public final void method127(class222 arg0, byte arg1, int arg2) {
        ++field7924;
        super.field7580.method3613((byte) 115, arg0);
        super.field7580.method3676(arg2, (byte) -84);
        if (arg1 > -93) {
            field7926 = -0.9436315F;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)V")
    public static final void method3199(int arg0) {
        ++field7927;
        if (class146.field1963 != null) {
            class694.field9791.method1306((byte) -128);
            class180.method1206();
            class349.method2071(-31428);
            class237.method1466(2048);
            class3.method12(false);
            class121.method713(53);
            if (class292.field3855 != null) {
                class292.field3855.method3249((byte) 68);
            }
            class326.method1898(-18164);
            class80.method430((byte) -125);
            class353.method2088((byte) 28);
            class208.method1322(-31764);
            class551.method3082((byte) 123, false);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class573 var5 = class513.field7145[var1];
                if (var5 != null) {
                    for (int var6 = 0; var5.field3091.length > var6; ++var6) {
                        var5.field3091[var6] = null;
                    }
                }
            }
            for (int var2 = 0; ~var2 > ~class468.field6163; ++var2) {
                class351 var3 = class591.field8148[var2].field5354;
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~var3.field3091.length; ++var4) {
                        var3.field3091[var4] = null;
                    }
                }
            }
            class38.field510 = null;
            class546.field7466 = null;
            class146.field1963.method3127(true);
            class146.field1963 = null;
        }
        if (arg0 > -30) {
            method3199(75);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        ++field7930;
        if (arg0 != -20112) {
            field7926 = 0.7178679F;
        }
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        if (arg1 != -13443) {
            field7931 = -98;
        }
        ++field7925;
    }
}
