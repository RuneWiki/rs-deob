import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class536 extends class377 {

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    private int field6744 = 585;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field6753 = 0;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    public static int field6752 = -1;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Ldr;")
    public static class675 field6748 = new class675(98, -1);

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "Le;")
    public static class498 field6746;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZBZ)V")
    public static final void method2886(boolean arg0, byte arg1, boolean arg2) {
        ++field6747;
        if (arg1 <= -9) {
            if (arg2) {
                ++class299.field3804;
                class171.method1034((byte) 124);
            }
            if (arg0) {
                ++class591.field7943;
                class10.method45(127);
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field6749;
        int var3 = 54 / ((arg1 - 5) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -114);
        if (super.field4842.field6354) {
            int var5 = class596.field8003[arg0];
            for (int var6 = 0; ~var6 > ~class528.field6661; ++var6) {
                int var7 = class136.field1654[var6];
                if (~this.field6744 > ~var7 && 4096 - this.field6744 > var7 && var5 > -this.field6744 + 2048 && this.field6744 + 2048 > var5) {
                    int var8 = 2048 - var7;
                    int var9 = ~var8 > -1 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field6744 + 2048);
                    var4[var6] = -var11 + 4096;
                } else if (-this.field6744 + 2048 < var7 && ~(this.field6744 + 2048) < ~var7) {
                    int var12 = var5 + -2048;
                    int var13 = var12 < 0 ? -var12 : var12;
                    int var14 = var13 - this.field6744;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (2048 - this.field6744);
                } else if (this.field6744 <= var5 && var5 <= 4096 - this.field6744) {
                    if (this.field6744 <= var7 && ~var7 >= ~(4096 - this.field6744)) {
                        var4[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = ~var16 <= -1 ? var16 : -var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field6744 + 2048);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 <= -1 ? var20 : -var20;
                    int var22 = var21 - this.field6744;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field6744 + 2048);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    public class536() {
        super(0, true);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(III)I")
    public static final int method2887(int arg0, int arg1, int arg2) {
        ++field6750;
        if (arg1 <= 39) {
            method2886(false, (byte) 105, true);
        }
        int var3 = arg2 - -(arg0 * 57);
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 - -1376312589;
        return (133923187 & var5) >> 19;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (arg0 == 0) {
            this.field6744 = arg2.method3031(-1);
        }
        ++field6751;
        int var5 = -119 % ((arg1 - 13) / 55);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILpfa;)I")
    public static final int method2888(int arg0, class275 arg1) {
        ++field6754;
        int var2 = arg0;
        if (arg1.method1669((byte) 125, class480.field5978)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1669((byte) -77, class51.field646)) {
            ++var2;
        }
        if (arg1.method1669((byte) 121, class550.field6908)) {
            ++var2;
        }
        if (arg1.method1669((byte) -117, class364.field4665)) {
            ++var2;
        }
        if (arg1.method1669((byte) 105, class631.field8564)) {
            ++var2;
        }
        if (arg1.method1669((byte) 120, class17.field169)) {
            ++var2;
        }
        if (arg1.method1669((byte) -99, class56.field718)) {
            ++var2;
        }
        if (arg1.method1669((byte) 124, class177.field2070)) {
            ++var2;
        }
        if (arg1.method1669((byte) -103, class301.field3835)) {
            ++var2;
        }
        if (arg1.method1669((byte) 115, class696.field9642)) {
            ++var2;
        }
        if (arg1.method1669((byte) -121, class207.field2452)) {
            ++var2;
        }
        if (arg1.method1669((byte) -112, class477.field5950)) {
            ++var2;
        }
        if (arg1.method1669((byte) -24, class687.field9451)) {
            ++var2;
        }
        if (arg1.method1669((byte) -32, class290.field3665)) {
            ++var2;
        }
        if (arg1.method1669((byte) 110, class410.field5277)) {
            ++var2;
        }
        if (arg1.method1669((byte) -33, class90.field1162)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V")
    public static void method2889(int arg0) {
        field6748 = null;
        if (arg0 != 4096) {
            method2889(41);
        }
        field6746 = null;
    }
}
