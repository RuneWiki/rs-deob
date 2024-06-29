import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class248 extends class328 {

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    private int field3608 = 4096;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    private int field3615 = 4096;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    private int field3612 = 4096;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field3613 = 0;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field3616;

    static {
        new class567("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIB)I", line = 7)
    public static final int method1572(int arg0, int arg1, byte arg2) {
        ++field3610;
        if (arg2 <= 58) {
            return -74;
        } else {
            int var3 = 0;
            while (~arg0 < -1) {
                var3 = 1 & arg1 | var3 << 1;
                --arg0;
                arg1 >>>= 1;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)[[I", line = 29)
    public final int[][] method7(int arg0, int arg1) {
        ++field3616;
        int[][] var3 = super.field4725.method1886((byte) 30, arg0);
        int var4 = 91 / ((46 - arg1) / 54);
        if (super.field4725.field4371) {
            int[][] var5 = this.method2040(0, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~var12 > ~class449.field6539; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (var13 == var14 && ~var14 == ~var15) {
                    var9[var12] = this.field3615 * var13 >> 12;
                    var10[var12] = this.field3608 * var14 >> 12;
                    var11[var12] = this.field3612 * var15 >> 12;
                } else {
                    var9[var12] = this.field3615;
                    var10[var12] = this.field3608;
                    var11[var12] = this.field3612;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 92)
    public class248() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 95)
    public static final void method1573(byte arg0, String arg1) {
        ++field3611;
        if (class90.field1620) {
            boolean var2 = false;
            int var3 = class43.field586;
            if (arg0 == 21) {
                int[] var4 = class343.field4927;
                for (int var5 = 0; var3 > var5; ++var5) {
                    class400 var6 = class39.field536[var4[var5]];
                    if (var6 != null && class644.field9367 != var6 && var6.field5958 != null && var6.field5958.equalsIgnoreCase(arg1)) {
                        ++class268.field3901;
                        class624.method3537(arg0 ^ -77, class270.field3969);
                        class127.field2088.method1710(0, 17);
                        class127.field2088.method1699(true, class68.field1296);
                        class127.field2088.method1702(class293.field4224, false);
                        class127.field2088.method1718(arg0 ^ -24, var4[var5]);
                        class127.field2088.method1742(class388.field5795, false);
                        var2 = true;
                        class233.method1521(var6.field1572[0], (byte) -78, 0, -2, 0, var6.field1571[0], var6.method781((byte) 27), true, var6.method781((byte) -123));
                        break;
                    }
                }
                if (!var2) {
                    class83.method758((byte) 125, class93.field1640.method3220(false, class538.field7500) + arg1);
                }
                if (class90.field1620) {
                    class294.method1853(arg0 ^ 36);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BILco;)V", line = 147)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 > 75) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field3612 = arg2.method1745(32132);
                    }
                } else {
                    this.field3608 = arg2.method1745(32132);
                }
            } else {
                this.field3615 = arg2.method1745(32132);
            }
            ++field3609;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lco;B)Los;", line = 202)
    public static final class467 method1574(class268 arg0, byte arg1) {
        if (arg1 != 96) {
            field3613 = 80;
        }
        ++field3614;
        return new class467(arg0.method1730(arg1 + 13340), arg0.method1730(arg1 + 13340), arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(arg1 ^ 13340), arg0.method1730(13436), arg0.method1700((byte) 44), arg0.method1738(arg1 ^ 159));
    }
}
