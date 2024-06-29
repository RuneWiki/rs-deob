import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class107 {

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "Lpj;")
    private static class237 field475 = class33.method353("Loading fonts )2 ", 62);

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lpj;")
    public static class237 field477 = field475;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lpj;")
    private static class237 field484 = class33.method353("Continue", 85);

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lpj;")
    public static class237 field485 = class33.method353("gelb:", 81);

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lpj;")
    public static class237 field480 = field484;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.method241(18681, arg0.method313((byte) -80));
        }
        if (arg2 != -32513) {
            this.field481 = 126;
        }
        ++field472;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    private class26(int arg0) {
        super(0, false);
        this.method241(18681, arg0);
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)Z")
    public static final boolean method237(int arg0) {
        ++field473;
        if (arg0 != 1031585668) {
            return true;
        } else {
            if (class53.field1106) {
                try {
                    if ((Boolean) class212.field3616.method1622(class268.field4572.field1306, false)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
    public static void method238(int arg0) {
        field484 = null;
        if (arg0 != -1) {
            field484 = null;
        }
        field477 = null;
        field475 = null;
        field480 = null;
        field485 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg5;
        ++field471;
        int var7 = -arg1 + arg0;
        if (var7 != 0) {
            if (var6 == 0) {
                class65.method537(arg5, arg0, arg4 + 23172, arg3, arg1);
            } else {
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = ~var7 > ~var6;
                if (var8) {
                    int var9 = arg1;
                    arg1 = arg5;
                    int var10 = arg0;
                    arg5 = var9;
                    arg0 = arg2;
                    arg2 = var10;
                }
                if (~arg0 > ~arg1) {
                    int var11 = arg1;
                    int var12 = arg5;
                    arg1 = arg0;
                    arg0 = var11;
                    arg5 = arg2;
                    arg2 = var12;
                }
                if (arg4 != -23175) {
                    field478 = 7;
                }
                int var13 = arg5;
                int var14 = -arg1 + arg0;
                int var15 = -(var14 >> 1);
                int var16 = arg2 - arg5;
                int var17 = ~arg5 > ~arg2 ? 1 : -1;
                if (var16 < 0) {
                    var16 = -var16;
                }
                if (var8) {
                    for (int var18 = arg1; ~arg0 <= ~var18; ++var18) {
                        var15 += var16;
                        class62.field1241[var18][var13] = arg3;
                        if (var15 > 0) {
                            var13 += var17;
                            var15 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg1; ~arg0 <= ~var19; ++var19) {
                        class62.field1241[var13][var19] = arg3;
                        var15 += var16;
                        if (~var15 < -1) {
                            var13 += var17;
                            var15 -= var14;
                        }
                    }
                }
            }
        } else {
            if (var6 != 0) {
                class24.method219(false, arg3, arg5, arg2, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class26() {
        this(0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int var3 = 43 % ((26 - arg0) / 45);
        ++field482;
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class106.field1862 < ~var8; ++var8) {
                var6[var8] = this.field481;
                var5[var8] = this.field474;
                var7[var8] = this.field483;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    private final void method241(int arg0, int arg1) {
        if (arg0 != 18681) {
            field478 = -33;
        }
        this.field483 = (arg1 & 255) << 4;
        ++field479;
        this.field481 = arg1 >> 12 & 4080;
        this.field474 = (arg1 & 65280) >> 4;
    }
}
