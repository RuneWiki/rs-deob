import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class240 extends class212 {

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field4169 = 7759444;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "Lsc;")
    public static class181 field4170 = class149.method967(255, "");

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "[Lsc;")
    public static class181[] field4167;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)[Ltg;")
    public static final class107[] method1635(int arg0) {
        ++field4171;
        class107[] var1 = new class107[class33.field535];
        if (arg0 != 255) {
            field4167 = null;
        }
        for (int var2 = 0; ~class33.field535 < ~var2; ++var2) {
            byte[] var3 = class143.field2319[var2];
            int var4 = class196.field3425[var2] * class121.field1978[var2];
            if (class254.field4448[var2]) {
                int[] var5 = new int[var4];
                byte[] var6 = class238.field4138[var2];
                for (int var7 = 0; ~var7 > ~var4; ++var7) {
                    var5[var7] = class185.method1291(class5.method43(var6[var7] << 24, -16777216), class254.field4443[class5.method43(var3[var7], 255)]);
                }
                var1[var2] = new class133(class219.field3777, class78.field1273, class220.field3782[var2], class23.field410[var2], class196.field3425[var2], class121.field1978[var2], var5);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; ++var9) {
                    var8[var9] = class254.field4443[class5.method43(255, var3[var9])];
                }
                var1[var2] = new class48(class219.field3777, class78.field1273, class220.field3782[var2], class23.field410[var2], class196.field3425[var2], class121.field1978[var2], var8);
            }
        }
        class143.method919(16);
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)V")
    public static void method1636(byte arg0) {
        field4170 = null;
        if (arg0 < 41) {
            method1636((byte) -96);
        }
        field4167 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBI)I")
    private final int method1637(int arg0, byte arg1, int arg2) {
        int var4 = arg0 * 57 + arg2;
        ++field4168;
        int var5 = var4 << 1 ^ var4;
        if (arg1 >= -24) {
            field4170 = null;
        }
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field4172;
        if (arg1 <= 25) {
            method1636((byte) -90);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = class176.field3090[arg0];
            for (int var5 = 0; var5 < class26.field452; ++var5) {
                var3[var5] = this.method1637(var4, (byte) -122, class253.field4416[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4173;
        if (arg1 == -21307) {
            if (class77.method537(-1, arg5)) {
                class256.field4482 = null;
                class156.method1043(arg0, arg2, -1, arg8, arg4, arg6, (byte) 35, arg3, arg7, class208.field3563[arg5]);
                if (class256.field4482 != null) {
                    class156.method1043(arg0, arg2, -1412584499, arg8, class42.field643, arg6, (byte) 35, arg3, class52.field818, class256.field4482);
                    class256.field4482 = null;
                }
            } else if (arg0 != -1) {
                class61.field943[arg0] = true;
            } else {
                for (int var9 = 0; var9 < 100; ++var9) {
                    class61.field943[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class240() {
        super(0, true);
    }
}
