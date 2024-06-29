import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class548 extends class354 {

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "[I")
    public static int[] field7669 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        super.field4545 = arg1;
        if (arg0 != -1) {
            method3187(true);
        }
        ++field7665;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V")
    public static final void method3186(int arg0, int arg1, int arg2) {
        ++field7670;
        int var3 = class270.field3406.method1619(false, class454.field6027.method2547(-79, class243.field3143));
        int var5;
        if (class517.field7240) {
            for (class184 var4 = (class184) class330.field4215.method118(-30553); var4 != null; var4 = (class184) class330.field4215.method111(22548)) {
                int var6;
                if (~var4.field2555 == -2) {
                    var6 = class349.method2047((byte) -19, (class277) var4.field2556.field313.field8921);
                } else {
                    var6 = class211.method1355(127, var4);
                }
                if (~var6 < ~var3) {
                    var3 = var6;
                }
            }
            var5 = class512.field7203 * 16 + 21;
            class424.field5496 = class512.field7203 * 16 + (!class697.field9709 ? 22 : 26);
            var3 += 8;
        } else {
            for (class277 var7 = (class277) class343.field4334.method3672(-1); var7 != null; var7 = (class277) class343.field4334.method3662(-1)) {
                int var10 = class349.method2047((byte) -19, var7);
                if (~var3 > ~var10) {
                    var3 = var10;
                }
            }
            var5 = class159.field2181 * 16 - -21;
            var3 += 8;
            class424.field5496 = (!class697.field9709 ? 22 : 26) + class159.field2181 * 16;
        }
        int var8 = -(var3 / 2) + arg1;
        if (var3 + var8 > class356.field4586) {
            var8 = -var3 + class356.field4586;
        }
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg0;
        if (~class466.field6263 > ~(arg0 - -var5)) {
            var9 = -var5 + class466.field6263;
        }
        class652.field9070 = var8;
        if (var9 < arg2) {
            var9 = 0;
        }
        class91.field1249 = var3;
        class648.field8969 = var9;
        class14.field276 = true;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field7664;
        if (arg0 != 3) {
            this.method389(-34, 7);
        }
        return 1;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(ILwo;)V")
    public class548(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V")
    public static final void method3187(boolean arg0) {
        ++field7667;
        class700 var1 = null;
        try {
            var1 = class465.method2644(2, "2");
            if (!arg0) {
                return;
            }
            class461 var2 = new class461(3 - -(class593.field8287 * 6));
            var2.method2578(1, -1221492240);
            var2.method2620(class593.field8287, false);
            for (int var3 = 0; ~class564.field7931.length < ~var3; ++var3) {
                if (class133.field1924[var3]) {
                    var2.method2620(var3, false);
                    var2.method2568(class564.field7931[var3], -535701016);
                }
            }
            var1.method3937(-14430, 0, var2.field6193, var2.field6180);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3941(true);
            }
        } catch (Exception var4) {
        }
        class412.field5244 = class446.method2525(500);
        class473.field6353 = false;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lwo;)V")
    public class548(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            this.method388(2);
        }
        ++field7671;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)I")
    public final int method3188(byte arg0) {
        int var2 = 22 % ((7 - arg0) / 45);
        ++field7666;
        return super.field4545;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V")
    public static void method3189(int arg0) {
        field7669 = null;
        if (arg0 <= 92) {
            method3186(77, -46, 109);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field7668;
        int var2 = 18 % ((37 - arg0) / 63);
        return 0;
    }
}
