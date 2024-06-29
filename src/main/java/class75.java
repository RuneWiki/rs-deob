import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class75 extends class264 {

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
    private int field1074 = 1;

    @OriginalMember(owner = "client!tr", name = "X", descriptor = "I")
    private int field1082 = 0;

    @OriginalMember(owner = "client!tr", name = "W", descriptor = "I")
    private int field1081 = 0;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!tr", name = "Y", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field1080;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static final void method664(byte arg0) {
        if (arg0 < 99) {
            field1083 = -29;
        }
        ++field1072;
        for (class105 var1 = (class105) class178.field2707.method775(1); var1 != null; var1 = (class105) class178.field2707.method763(0)) {
            class260 var2 = var1.field1476;
            if (~class387.field5306 == ~var2.field4531 && ~class364.field5010 >= ~var2.field3704) {
                if (class364.field5010 >= var2.field3721) {
                    if (~var2.field3736 < -1) {
                        class361 var3 = class163.field2377[var2.field3736 - 1];
                        if (var3 != null && ~var3.field4537 <= -1 && class36.field388 * 128 > var3.field4537 && var3.field4530 >= 0 && var3.field4530 < class68.field998 * 128) {
                            var2.method1748(0, var3.field4530, var3.field4537, class407.method2440(var3.field4537, -16490, var3.field4530, var2.field4531) + -var2.field3716, class364.field5010);
                        }
                    }
                    if (var2.field3736 < 0) {
                        int var4 = -var2.field3736 + -1;
                        class39 var5;
                        if (~class168.field2432 == ~var4) {
                            var5 = class262.field3781;
                        } else {
                            var5 = class112.field1570[var4];
                        }
                        if (var5 != null && ~var5.field4537 <= -1 && class36.field388 * 128 > var5.field4537 && ~var5.field4530 <= -1 && var5.field4530 < class68.field998 * 128) {
                            var2.method1748(0, var5.field4530, var5.field4537, class407.method2440(var5.field4537, -16490, var5.field4530, var2.field4531) - var2.field3716, class364.field5010);
                        }
                    }
                    var2.method1749(class385.field5283, (byte) 87);
                    class363.method2230(var2, true);
                }
            } else {
                var1.method2714(-100);
                var2.method1750(-11264);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)V")
    public final void method95(int arg0) {
        if (arg0 != -8) {
            method666(51);
        }
        ++field1073;
        class163.method1206((byte) -114);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 < 31) {
            field1079 = -52;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field1074 = arg1.method1172((byte) -113);
                }
            } else {
                this.field1081 = arg1.method1172((byte) -109);
            }
        } else {
            this.field1082 = arg1.method1172((byte) -27);
        }
        ++field1075;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V")
    public static final void method665(int arg0, byte arg1) {
        ++field1078;
        class261.field3755 = arg0;
        class336 var2 = class402.field5517;
        synchronized (class402.field5517) {
            class402.field5517.method2109(-1);
        }
        class336 var3 = class282.field4052;
        synchronized (class282.field4052) {
            class282.field4052.method2109(-1);
        }
        int var4 = 115 / ((arg1 - -34) / 41);
    }

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "(I)V")
    public static void method666(int arg0) {
        field1080 = null;
        if (arg0 != -1) {
            field1083 = 12;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg1 != 21034) {
            return null;
        } else {
            ++field1077;
            int[] var3 = super.field3808.method958((byte) 64, arg0);
            if (super.field3808.field1732) {
                int var4 = class379.field5216[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~var6 > ~class478.field6792; ++var6) {
                    int var7 = class151.field2084[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field1082 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field1074 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field1074;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (~this.field1081 != -1) {
                        if (this.field1081 == 2) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class421.field5827[255 & var12 >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }
}
