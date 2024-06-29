import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class95 extends class615 {

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    private int field1450 = 4096;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "Lob;")
    public static class691 field1448 = new class691();

    @OriginalMember(owner = "client!er", name = "K", descriptor = "[I")
    public static int[] field1453 = new int[1];

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)V")
    public static void method744(int arg0) {
        if (arg0 <= 78) {
            field1448 = null;
        }
        field1453 = null;
        field1448 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BILeh;)V")
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (arg0 <= 44) {
            this.method8(-55, (byte) -70);
        }
        ++field1454;
        if (~arg1 == -1) {
            this.field1450 = arg2.method2001((byte) -83);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLrc;Lrc;)V")
    public static final void method745(byte arg0, class504 arg1, class504 arg2) {
        if (arg2.field6723 != null) {
            arg2.method2797(-106);
        }
        if (arg0 > -71) {
            method746(false);
        }
        ++field1452;
        arg2.field6722 = arg1;
        arg2.field6723 = arg1.field6723;
        arg2.field6723.field6722 = arg2;
        arg2.field6722.field6723 = arg2;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, true);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)[I")
    public final int[] method8(int arg0, byte arg1) {
        ++field1451;
        int[] var3 = super.field8125.method298(arg0, 116);
        if (arg1 != -18) {
            return null;
        } else {
            if (super.field8125.field579) {
                int[] var4 = this.method3366(0, 997, class658.field9107 & arg0 - 1);
                int[] var5 = this.method3366(0, 997, arg0);
                int[] var6 = this.method3366(0, 997, arg0 + 1 & class658.field9107);
                for (int var7 = 0; ~var7 > ~class505.field6740; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field1450;
                    int var9 = (var5[var7 + 1 & class313.field4306] + -var5[class313.field4306 & var7 + -1]) * this.field1450;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)) * 4096.0D);
                    int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)I")
    public static final int method746(boolean arg0) {
        ++field1449;
        if (!arg0) {
            field1448 = null;
        }
        return class166.field2584;
    }
}
