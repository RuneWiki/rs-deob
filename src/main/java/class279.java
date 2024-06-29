import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class279 extends class242 {

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    public static int field4881 = 0;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field4883 = 0;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "Lp;")
    public static class280 field4887 = class18.method140((byte) -120, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "[I")
    public static int[] field4884;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1849(byte arg0) {
        field4887 = null;
        field4884 = null;
        if (arg0 < 119) {
            field4884 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)I")
    public static final int method1850(int arg0, byte arg1) {
        if (arg1 != -66) {
            field4883 = -33;
        }
        ++field4885;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field4882;
        int var3 = -124 / ((73 - arg1) / 41);
        int[] var4 = super.field4251.method1417((byte) 120, arg0);
        if (super.field4251.field3655) {
            int var5 = class117.field2106[arg0];
            for (int var6 = 0; ~var6 > ~class264.field4654; ++var6) {
                var4[var6] = this.method1853(class102.field1701[var6], var5, 17753) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)V")
    public static final void method1851(boolean arg0) {
        if (arg0) {
            field4887 = null;
        }
        class105.field1750.method1485((byte) -102);
        ++field4889;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 3;
        if (arg5 > -55) {
            field4883 = 4;
        }
        ++field4886;
        if (~(1 & arg0) == -2) {
            int var8 = arg2;
            arg2 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg1;
        } else if (~var7 == -2) {
            return 7 - arg6 + -arg2 + 1;
        } else {
            return var7 == 2 ? -arg1 + 7 + -arg3 + 1 : arg6;
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(III)I")
    private final int method1853(int arg0, int arg1, int arg2) {
        ++field4888;
        int var4 = arg0 - -(arg1 * 57);
        int var5 = var4 << 1 ^ var4;
        if (arg2 != 17753) {
            method1851(false);
        }
        return -(((var5 * 15731 * var5 - -789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class279() {
        super(0, true);
    }
}
