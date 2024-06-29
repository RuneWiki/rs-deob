import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class508 extends class682 {

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field7233 = 0;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field7234;
        super.field9647.method2603(false, (byte) -121);
        if (arg0 != 0) {
            this.method286(true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ltha;II)V")
    public final void method292(class292 arg0, int arg1, int arg2) {
        if (arg2 == -16997) {
            super.field9647.method2621(arg2 ^ 16997, arg0);
            ++field7240;
            super.field9647.method2573(arg1, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
    public final void method285(byte arg0, boolean arg1) {
        super.field9647.method2603(true, (byte) -121);
        ++field7238;
        if (arg0 != 52) {
            this.method285((byte) 39, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lnv;)V")
    public class508(class417 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
    public final void method287(int arg0, boolean arg1) {
        if (arg0 > 111) {
            ++field7239;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lnaa;BI)V")
    public static final void method3010(class71 arg0, byte arg1, int arg2) {
        ++field7237;
        if (class568.field8077) {
            arg2 = 0;
            class568.field8077 = false;
        }
        if (arg1 != 40) {
            field7233 = -69;
        }
        if (class673.field9545 == null || !class673.field9545.method521(arg0, (byte) 88)) {
            class673.field9545 = arg0;
            class368.field4705 = class652.method3700(arg1 + -41);
            class149.field1657 = arg2;
            class468.field6699 = arg2;
            if (~class468.field6699 != -1) {
                class229.field2672 = class294.field3624;
                class402.field5489 = class501.field7036;
                class472.field6755 = class28.field313;
                class701.field9883 = class30.field338;
                class156.field1721 = class135.field1531;
                class547.field7869 = class674.field9559;
                class615.field8829 = class253.field3046;
                class608.field8636 = class287.field3518;
                class151.field1665 = class716.field10051;
                class697.field9811 = class591.field8336;
                return;
            }
            class289.method1716((byte) 124);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 0) {
            field7233 = -20;
        }
        ++field7236;
        int var7 = class211.method1255(class224.field2571, arg4, false, class578.field8182);
        int var8 = class211.method1255(class224.field2571, arg6, false, class578.field8182);
        int var9 = class211.method1255(class338.field4355, arg5, false, class744.field10385);
        int var10 = class211.method1255(class338.field4355, arg0, false, class744.field10385);
        int var11 = class211.method1255(class224.field2571, arg2 + arg4, false, class578.field8182);
        int var12 = class211.method1255(class224.field2571, -arg2 + arg6, false, class578.field8182);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class223.method1297(class408.field5585[var13], -7, var9, arg1, var10);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class223.method1297(class408.field5585[var14], -7, var9, arg1, var10);
        }
        int var15 = class211.method1255(class338.field4355, arg2 + arg5, false, class744.field10385);
        int var16 = class211.method1255(class338.field4355, -arg2 + arg0, false, class744.field10385);
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class408.field5585[var17];
            class223.method1297(var18, -7, var9, arg1, var15);
            class223.method1297(var18, -7, var16, arg1, var10);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)Z")
    public final boolean method286(boolean arg0) {
        if (!arg0) {
            field7233 = -42;
        }
        ++field7235;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)V")
    public final void method289(int arg0, byte arg1, int arg2) {
        ++field7241;
        if (arg1 <= 72) {
            method3010((class71) null, (byte) 121, 14);
        }
    }
}
