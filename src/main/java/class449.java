import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class449 extends class175 {

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
    private int field6454 = -1;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ifa", name = "M", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ifa", name = "O", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "[I")
    public int[] field6457;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILdt;Z)V", line = 3)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field6454 = arg1.method1728((byte) 105);
        }
        ++field6462;
        if (arg2) {
            this.field6454 = 52;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)Z", line = 17)
    public final boolean method2672(byte arg0) {
        ++field6456;
        if (arg0 != 71) {
            this.method238(72, (byte) -32);
        }
        if (this.field6457 != null) {
            return true;
        } else if (this.field6454 >= 0) {
            class162 var2 = class406.field5756 < 0 ? class162.method1129(class582.field7913, this.field6454) : class162.method1115(class582.field7913, class406.field5756, this.field6454);
            var2.method1121();
            this.field6457 = var2.method1125();
            this.field6459 = var2.field2155;
            this.field6458 = var2.field2156;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V", line = 44)
    public class449() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)[[I", line = 50)
    public int[][] method238(int arg0, byte arg1) {
        ++field6463;
        if (arg1 >= -47) {
            this.field6454 = 51;
        }
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (super.field2316.field8746 && this.method2672((byte) 71)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field6458 * (class561.field7687 != this.field6459 ? this.field6459 * arg0 / class561.field7687 : arg0);
            if (class598.field8136 != this.field6458) {
                for (int var8 = 0; ~class598.field8136 < ~var8; ++var8) {
                    int var9 = this.field6458 * var8 / class598.field8136;
                    int var10 = this.field6457[var7 + var9];
                    var6[var8] = class519.method3018(var10 << 4, 4080);
                    var5[var8] = class519.method3018(4080, var10 >> 4);
                    var4[var8] = class519.method3018(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~class598.field8136 < ~var11; ++var11) {
                    int var12 = this.field6457[var7++];
                    var6[var11] = class519.method3018(4080, var12 << 4);
                    var5[var11] = class519.method3018(var12, 65280) >> 4;
                    var4[var11] = class519.method3018(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)I", line = 119)
    public final int method1207(boolean arg0) {
        if (!arg0) {
            this.method1203((byte) 117);
        }
        ++field6460;
        return this.field6454;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIII)V", line = 130)
    public static final void method2673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class125.field1721.field5176.method1871(43) != 0 && ~arg5 != -1 && class10.field118 < 50 && arg0 != -1) {
            class642.field8649[class10.field118++] = new class183((byte) 1, arg0, arg5, arg1, arg2, 0, arg3, (class214) null);
        }
        ++field6455;
        if (arg4 != 2003865932) {
            method2673(14, -62, 0, -8, 80, -19);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V", line = 151)
    public final void method1203(byte arg0) {
        ++field6461;
        super.method1203(arg0);
        this.field6457 = null;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(JJ)J", line = 163)
    public static long method2674(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
