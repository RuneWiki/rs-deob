import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class296 extends class470 {

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    private int field4058;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "[B")
    public static byte[] field4055 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field4065 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lhv;")
    public static class442 field4056;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lha;")
    public static class52 field4062;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        if (arg2 <= -95) {
            ++field4067;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZII)I")
    public static final int method1889(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4064;
        class133 var4 = class568.method3229(arg2, (byte) -88, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = arg0;
            for (int var6 = 0; ~var6 > ~var4.field2116.length; ++var6) {
                if (var4.field2115[var6] == arg3) {
                    var5 += var4.field2116[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static void method1890(int arg0) {
        field4062 = null;
        field4055 = null;
        if (arg0 == 0) {
            field4056 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIILmc;)V")
    public static final void method1891(byte arg0, int arg1, int arg2, class114 arg3) {
        class231.field3282 = arg2;
        ++field4060;
        class78.field1268 = arg1;
        class31.field508 = arg3;
        int var4 = 52 / ((arg0 - -56) / 61);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V")
    public static final void method1892(int arg0, byte arg1) {
        ++field4061;
        if (~arg0 != 0) {
            if (class197.field2797[arg0]) {
                class313.field4217.method215((byte) -59, arg0);
                class618.field8850[arg0] = null;
                class75.field1198[arg0] = null;
                class197.field2797[arg0] = false;
                if (arg1 > -68) {
                    field4055 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        ++field4057;
        int var4 = this.field4058 * arg2 >> 12;
        int var5 = 85 / ((arg0 - -1) / 39);
        int var6 = this.field4063 * arg2 >> 12;
        int var7 = this.field4059 * arg1 >> 12;
        int var8 = this.field4053 * arg1 >> 12;
        class523.method3017(var7, var6, super.field6611, 1135, var4, var8);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)V")
    public final void method313(int arg0, byte arg1, int arg2) {
        if (arg1 >= -99) {
            this.method313(25, (byte) 127, 69);
        }
        ++field4066;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIIII)V")
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4059 = arg1;
        this.field4058 = arg0;
        this.field4063 = arg2;
        this.field4053 = arg3;
    }
}
