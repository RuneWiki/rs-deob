import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class734 extends class86 {

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "[Lgu;")
    public static class757[] field9960 = new class757[8];

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "Low;")
    public static class780 field9967 = new class780(true);

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "I")
    public static int field9961;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public static int field9968;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    public static int field9969;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 == -65) {
            if (~super.field1200 != -2 && super.field1200 != 0) {
                super.field1200 = this.method73(0);
            }
            ++field9963;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        ++field9965;
        return arg1 != -2 ? -46 : 1;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)I")
    public final int method3991(boolean arg0) {
        ++field9964;
        if (arg0) {
            this.method72(-115, 100);
        }
        return super.field1200;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
    public static final void method3992(byte arg0) {
        ++field9959;
        if (class505.field6464 != null) {
            for (int var1 = 0; class269.field3552 > var1; ++var1) {
                class505.field6464[var1] = null;
            }
            class505.field6464 = null;
        }
        if (class75.field1067 != null) {
            for (int var2 = 0; var2 < class779.field10635; ++var2) {
                class75.field1067[var2] = null;
            }
            class75.field1067 = null;
        }
        if (class763.field10388 != null) {
            for (int var3 = 0; class164.field2177 > var3; ++var3) {
                class763.field10388[var3] = null;
            }
            class763.field10388 = null;
        }
        class380.field4659 = null;
        class656.field8454 = null;
        int var4 = 3 % (arg0 / 62);
        class317.field3953 = -1;
        class566.field7172 = -1;
        class86.field1201 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        if (arg0 != 0) {
            return 62;
        } else {
            ++field9958;
            return 1;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(ILsf;)V")
    public class734(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lsf;)V")
    public class734(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        if (arg1) {
            this.method76(9, false);
        }
        ++field9962;
        super.field1200 = arg0;
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
    public static void method3993(byte arg0) {
        field9960 = null;
        field9967 = null;
        if (arg0 < 104) {
            method3996(67);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "(B)V")
    public static final void method3994(byte arg0) {
        if (arg0 != -48) {
            method3995((File) null, (byte) -45, -41);
        }
        while (~class356.field4337.method4028(class199.field2766, 8) <= -16) {
            int var1 = class356.field4337.method4023(true, 15);
            if (~var1 == -32768) {
                break;
            }
            boolean var2 = false;
            class232 var3 = (class232) class444.field5811.method2616((long) var1, (byte) -97);
            if (var3 == null) {
                class727 var4 = new class727();
                var4.field4737 = var1;
                var3 = new class232(var4);
                class444.field5811.method2619(var3, (long) var1, arg0 + 47);
                var2 = true;
                class542.field6811[class750.field10228++] = var3;
            }
            class727 var5 = var3.field3125;
            class88.field1224[class349.field4271++] = var1;
            var5.field4662 = class100.field1330;
            if (var5.field9545 != null && var5.field9545.method1580(false)) {
                class569.method3062(-10290, var5);
            }
            int var6 = class356.field4337.method4023(true, 2);
            int var7 = class356.field4337.method4023(true, 5);
            if (~var7 < -16) {
                var7 -= 32;
            }
            int var8 = class356.field4337.method4023(true, 1);
            if (var8 == 1) {
                class752.field10246[class338.field4123++] = var1;
            }
            int var9 = 15372 & 4 + class356.field4337.method4023(true, 3) << 11;
            int var10 = class356.field4337.method4023(true, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var5.method3887(class595.field7561.method765((byte) -53, class356.field4337.method4023(true, 14)), 1);
            int var11 = class356.field4337.method4023(true, 1);
            var5.method2174(arg0 ^ -48, var5.field9545.field3314);
            var5.field4750 = var5.field9545.field3270 << 3;
            if (var2) {
                var5.method2179(arg0 + 332, var9, true);
            }
            var5.method3888(class422.field5564.field4758[0] + var10, var5.method190((byte) -66), class422.field5564.field4767[0] - -var7, var11 == 1, 0, var6);
            if (var5.field9545.method1580(false)) {
                class663.method3612(0, var5.field4758[0], var5.field4767[0], (class33) null, var5.field2895, var5, 1588241065, (class773) null);
            }
        }
        ++field9961;
        class356.field4337.method4030(false);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/io/File;BI)[B")
    public static final byte[] method3995(File arg0, byte arg1, int arg2) {
        ++field9966;
        try {
            if (arg1 < 121) {
                method3994((byte) -26);
            }
            byte[] var3 = new byte[arg2];
            class438.method2505(arg2, var3, arg0, 0);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)I")
    public static final int method3996(int arg0) {
        ++field9968;
        if (arg0 >= -66) {
            return 2;
        } else {
            byte var1;
            if (~class91.field1248 > -97) {
                class588.method3149(0, true);
                var1 = 1;
            } else {
                int var2 = class365.method2101(100);
                if (~var2 >= -101) {
                    class104.method601(85);
                    var1 = 4;
                } else if (~var2 < -501) {
                    if (~var2 >= -1001) {
                        var1 = 2;
                        class11.method46((byte) 121);
                    } else {
                        class588.method3149(0, true);
                        var1 = 1;
                    }
                } else {
                    class432.method2482(1);
                    var1 = 3;
                }
            }
            if (~class485.field6252.field6949.method2402(false) != -1) {
                class485.field6252.method2986(0, class485.field6252.field6922, (byte) 116);
                class432.method2483((byte) 76, 0, false);
            }
            class627.method3356(93);
            return var1;
        }
    }
}
