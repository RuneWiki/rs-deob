import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class559 extends class4 {

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "Lpaa;")
    public static class317 field7822 = new class317(2, 4);

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "Lim;")
    public static class353 field7826 = new class353(97, 8);

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field7824;
        if (arg0 >= -89) {
            field7826 = null;
        }
        if (~arg2 == -1) {
            super.field44 = arg1.method3045(-125) == 1;
        }
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(IBI)V")
    private final void method3143(int arg0, byte arg1, int arg2) {
        ++field7825;
        int var4 = class66.field881[arg2];
        int var5 = class130.field1606[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class97.field1304 = arg2;
            class269.field3423 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class97.field1304 = arg0;
            class269.field3423 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class269.field3423 = arg2;
            class97.field1304 = -arg0 + class132.field1627;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class97.field1304 = arg2;
            class269.field3423 = -arg0 + class620.field8925;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class269.field3423 = -arg0 + class620.field8925;
            class97.field1304 = -arg2 + class132.field1627;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class97.field1304 = class132.field1627 - arg0;
            class269.field3423 = -arg2 + class620.field8925;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class269.field3423 = class620.field8925 - arg2;
            class97.field1304 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class269.field3423 = arg0;
            class97.field1304 = class132.field1627 - arg2;
        }
        if (arg1 == 47) {
            class269.field3423 &= class376.field5248;
            class97.field1304 &= class150.field1971;
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
    public class559() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field7821;
        int[] var3 = super.field31.method2252(arg1, arg0 + 1);
        if (arg0 != 10) {
            field7822 = null;
        }
        if (super.field31.field5127) {
            for (int var4 = 0; var4 < class132.field1627; ++var4) {
                this.method3143(arg1, (byte) 47, var4);
                int[] var5 = this.method20(0, arg0 + -21996, class269.field3423);
                var3[var4] = var5[class97.field1304];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field7823;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (arg1 >= -83) {
            return null;
        } else {
            if (super.field38.field7618) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class132.field1627 > var7; ++var7) {
                    this.method3143(arg0, (byte) 47, var7);
                    int[][] var8 = this.method22(class269.field3423, (byte) -97, 0);
                    var4[var7] = var8[0][class97.field1304];
                    var5[var7] = var8[1][class97.field1304];
                    var6[var7] = var8[2][class97.field1304];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "(I)V")
    public static void method3144(int arg0) {
        field7826 = null;
        if (arg0 != 97) {
            method3144(97);
        }
        field7822 = null;
    }
}
