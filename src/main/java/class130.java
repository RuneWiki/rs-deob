import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class130 extends class4 {

    @OriginalMember(owner = "client!aca", name = "K", descriptor = "I")
    private int field1601 = 1;

    @OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
    private int field1600 = 0;

    @OriginalMember(owner = "client!aca", name = "N", descriptor = "I")
    private int field1604 = 0;

    @OriginalMember(owner = "client!aca", name = "G", descriptor = "Lim;")
    public static class353 field1597 = new class353(34, 1);

    @OriginalMember(owner = "client!aca", name = "O", descriptor = "I")
    public static int field1605 = 0;

    @OriginalMember(owner = "client!aca", name = "Q", descriptor = "[I")
    public static int[] field1607 = new int[1000];

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!aca", name = "F", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!aca", name = "H", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!aca", name = "I", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!aca", name = "M", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!aca", name = "L", descriptor = "Lkr;")
    public static class329 field1602;

    @OriginalMember(owner = "client!aca", name = "P", descriptor = "[I")
    public static int[] field1606;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field1596;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = field1606[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class132.field1627; ++var6) {
                int var7 = class66.field881[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (~this.field1604 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1601 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1601;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field1600 == 0) {
                    var12 = class225.field2880[(var12 & 4088) >> 4] + 4096 >> 1;
                } else if (~this.field1600 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != 10) {
            this.method18(-35);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 >= -89) {
            this.method18(101);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field1601 = arg1.method3045(-128);
                }
            } else {
                this.field1600 = arg1.method3045(-127);
            }
        } else {
            this.field1604 = arg1.method3045(-128);
        }
        ++field1595;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZII)Lfg;")
    public static final class164 method695(boolean arg0, int arg1, int arg2) {
        ++field1603;
        if (arg2 != Integer.MIN_VALUE) {
            method696(20);
        }
        long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
        return (class164) class368.field5130.method3476(var3, (byte) 28);
    }

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "(I)V")
    public static void method696(int arg0) {
        field1607 = null;
        if (arg0 != 1) {
            field1607 = null;
        }
        field1602 = null;
        field1597 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        class78.method446((byte) -86);
        ++field1599;
        if (arg0 != -9) {
            field1605 = 92;
        }
    }
}
