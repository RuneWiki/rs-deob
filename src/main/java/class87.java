import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class87 extends class214 {

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "Lqaa;")
    public static class285 field1274 = new class285(0, -1);

    @OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
    public static int field1282 = 0;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client!lba", name = "H", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!lba", name = "K", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lba", name = "O", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!lba", name = "L", descriptor = "Lro;")
    public static class522 field1280;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILofa;I)V", line = 6)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 > 92) {
            ++field1272;
            if (arg2 == 0) {
                this.method759(arg1.method1952(22085), 65);
            }
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V", line = 32)
    private class87(int arg0) {
        super(0, false);
        this.method759(arg0, 77);
    }

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(II)[[I", line = 40)
    public final int[][] method62(int arg0, int arg1) {
        ++field1278;
        int[][] var3 = super.field3545.method2996((byte) 119, arg0);
        if (arg1 != -256) {
            return null;
        } else {
            if (super.field3545.field7147) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class626.field8787 > var7; ++var7) {
                    var4[var7] = this.field1276;
                    var5[var7] = this.field1273;
                    var6[var7] = this.field1275;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V", line = 80)
    public class87() {
        this(0);
    }

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(II)V", line = 84)
    private final void method759(int arg0, int arg1) {
        this.field1276 = arg0 >> 12 & 4080;
        this.field1275 = (255 & arg0) << 4;
        this.field1273 = (arg0 & 65280) >> 4;
        if (arg1 < 15) {
            method761(125);
        }
        ++field1281;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILofa;)Lsd;", line = 97)
    public static final class56 method760(int arg0, class301 arg1) {
        ++field1277;
        if (arg0 != -6733) {
            field1279 = -8;
        }
        int var2 = arg1.method1934(-2);
        return new class56(var2);
    }

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V", line = 110)
    public static final void method761(int arg0) {
        ++field1283;
        class248 var1 = (class248) class641.field9057.method3463((byte) -50);
        int var2 = -118 % ((arg0 - 56) / 32);
        while (var1 != null) {
            if (var1.field3966 > 0) {
                --var1.field3966;
            }
            if (~var1.field3966 != -1) {
                if (var1.field3975 > 0) {
                    --var1.field3975;
                }
                if (var1.field3975 == 0 && ~var1.field3971 <= -2 && ~var1.field3964 <= -2 && ~var1.field3971 >= ~(class191.field3229 + -2) && ~(class314.field4720 + -2) <= ~var1.field3964 && (var1.field3979 < 0 || class181.method1399((byte) -124, var1.field3972, var1.field3979))) {
                    class659.method3706(var1.field3967, var1.field3964, var1.field3972, var1.field3979, 115, -1, var1.field3971, var1.field3977, var1.field3965);
                    var1.field3975 = -1;
                    if (~var1.field3979 == ~var1.field3968 && var1.field3968 == -1) {
                        var1.method636((byte) 97);
                    } else if (~var1.field3979 == ~var1.field3968 && ~var1.field3977 == ~var1.field3969 && var1.field3976 == var1.field3972) {
                        var1.method636((byte) 97);
                    }
                }
            } else if (var1.field3968 < 0 || class181.method1399((byte) 126, var1.field3976, var1.field3968)) {
                class659.method3706(var1.field3967, var1.field3964, var1.field3976, var1.field3968, 76, -1, var1.field3971, var1.field3969, var1.field3965);
                var1.method636((byte) 97);
            }
            var1 = (class248) class641.field9057.method3469((byte) 107);
        }
    }

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "(I)V", line = 170)
    public static void method762(int arg0) {
        field1280 = null;
        field1274 = null;
        if (arg0 < 96) {
            field1280 = null;
        }
    }
}
