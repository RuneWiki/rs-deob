import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class424 extends class194 {

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    private int field5801 = 20;

    @OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
    private int field5808 = 0;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
    private int field5805 = 1365;

    @OriginalMember(owner = "client!fr", name = "R", descriptor = "I")
    private int field5809 = 0;

    @OriginalMember(owner = "client!fr", name = "S", descriptor = "Lhq;")
    public static class365 field5810 = new class365(10);

    @OriginalMember(owner = "client!fr", name = "U", descriptor = "I")
    public static int field5812 = 0;

    @OriginalMember(owner = "client!fr", name = "W", descriptor = "[I")
    public static int[] field5814 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!fr", name = "P", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!fr", name = "T", descriptor = "Luc;")
    public static class176 field5811;

    @OriginalMember(owner = "client!fr", name = "V", descriptor = "Lwo;")
    public static class285 field5813;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -87 % ((arg1 - 52) / 61);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field5809 = arg2.method1587((byte) -102);
                    }
                } else {
                    this.field5808 = arg2.method1587((byte) -102);
                }
            } else {
                this.field5801 = arg2.method1587((byte) -102);
            }
        } else {
            this.field5805 = arg2.method1587((byte) -102);
        }
        ++field5807;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)V")
    public static final void method2597(int arg0, int arg1, int arg2, int arg3) {
        ++field5806;
        String var4 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (63 & arg2) + "," + (63 & arg0);
        System.out.println(var4);
        class210.method1289(true, 10, var4);
        if (arg3 != 66885254) {
            method2597(28, -16, 59, -66);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IC)C")
    public static final char method2598(int arg0, char arg1) {
        ++field5804;
        if (arg1 == 198) {
            return 'E';
        } else if (~arg1 == -231) {
            return 'e';
        } else if (~arg1 == -224) {
            return 's';
        } else if (~arg1 == -339) {
            return 'E';
        } else if (arg1 == 339) {
            return 'e';
        } else {
            int var2 = 69 / ((arg0 - -56) / 47);
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class424() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field5803;
        int var3 = 73 / ((arg1 - 57) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            for (int var5 = 0; ~class138.field1579 < ~var5; ++var5) {
                int var6 = (class277.field3585[var5] << 12) / this.field5805 - -this.field5808;
                int var7 = (class249.field3283[arg0] << 12) / this.field5805 + this.field5809;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14 = 0;
                while (~(var12 - -var13) > -16385 && ~var14 > ~this.field5801) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = var8 + var12 - var13;
                    var13 = var11 * var11 >> 12;
                    ++var14;
                    var12 = var10 * var10 >> 12;
                }
                var4[var5] = ~(this.field5801 + -1) >= ~var14 ? 0 : (var14 << 12) / this.field5801;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
    public static void method2599(byte arg0) {
        field5813 = null;
        if (arg0 == 14) {
            field5811 = null;
            field5810 = null;
            field5814 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIII)V")
    public static final void method2600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5802;
        class277.field3586 = arg3;
        class127.field1415 = arg4;
        if (arg1 != -1025) {
            method2599((byte) -22);
        }
        client.field6059 = arg2;
        class66.field797 = arg0;
        class255.field3313 = arg5;
        if (class255.field3313 >= 100) {
            int var6 = class277.field3586 * 128 + 64;
            int var7 = class66.field797 * 128 + 64;
            int var8 = class189.method1170(var7, var6, true, class43.field513) + -class127.field1415;
            int var9 = -class287.field3784 + var6;
            int var10 = -class51.field587 + var8;
            int var11 = var7 - class80.field979;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class178.field2081 = 16383 & (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D);
            class433.field5912 = 16383 & (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D);
            class127.field1417 = 0;
            if (~class178.field2081 > -1025) {
                class178.field2081 = 1024;
            }
            if (class178.field2081 > 3072) {
                class178.field2081 = 3072;
            }
        }
        class320.field4294 = 2;
    }
}
