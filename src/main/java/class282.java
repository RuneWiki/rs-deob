import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class282 extends class96 {

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    private int field3598 = 4096;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    private int field3601 = 4096;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    private int field3606 = 4096;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Z")
    public static boolean field3600 = false;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "Lum;")
    public static class82 field3603 = new class82("WTRC", 1);

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field3610 = -1;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Luq;")
    public static class246 field3609;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILbt;)V", line = 13)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3598 = arg2.method568((byte) 110);
                }
            } else {
                this.field3606 = arg2.method568((byte) 110);
            }
        } else {
            this.field3601 = arg2.method568((byte) 110);
        }
        if (arg1 != -1) {
            this.method36(-3, 13);
        }
        ++field3604;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V", line = 73)
    public class282() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)[Lsu;", line = 62)
    public static final class111[] method1723(byte arg0) {
        if (arg0 >= -6) {
            field3600 = false;
        }
        ++field3602;
        return new class111[] { class192.field2493, class198.field2553, class508.field7464 };
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I", line = 76)
    public final int[][] method36(int arg0, int arg1) {
        ++field3608;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[][] var4 = this.method659(0, -107, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class269.field3403; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field3601 * var12 >> 12;
                    var9[var11] = this.field3606 * var13 >> 12;
                    var10[var11] = this.field3598 * var14 >> 12;
                } else {
                    var8[var11] = this.field3601;
                    var9[var11] = this.field3606;
                    var10[var11] = this.field3598;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V", line = 138)
    public static final void method1724(boolean arg0) {
        ++field3607;
        int var1 = 0;
        if (class421.field5647.method3102(class520.field7690, (byte) 48)) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class421.field5647.field7697) {
            var1 |= 64;
        }
        class449.method2660(var1, (byte) 0);
        class52.field715.method1157(-22344, var1);
        class89.field1238.method117((byte) -26, var1);
        class192.field2495.method1868(var1, -28874);
        class472.field6897.method1496(27220, var1);
        class366.method2147(var1, 1858731079);
        class100.method678(-123, var1);
        class340.method2002((byte) 64, var1);
        class478.method2871(var1, arg0);
        if (~class65.field821 == -11) {
            class294.method1767(28, (byte) -81);
        } else if (class65.field821 == 30) {
            class294.method1767(25, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V", line = 181)
    public static void method1725(byte arg0) {
        int var1 = 14 / ((-82 - arg0) / 41);
        field3603 = null;
        field3609 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)I", line = 198)
    public static final int method1726(int arg0, int arg1) {
        ++field3599;
        if (arg0 != 1) {
            method1724(true);
        }
        return 127 & arg1 >> 11;
    }
}
