import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class96 extends class149 {

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Lvr;")
    public static class306 field1395 = new class306();

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    private static int field1402 = 0;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    public static int field1403 = 104;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Lrm;")
    public static class181 field1401;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "Lra;")
    public static class271 field1399;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)[[I")
    public final int[][] method139(byte arg0, int arg1) {
        if (arg0 >= -45) {
            field1402 = 57;
        }
        ++field1396;
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class316.field4838 > var7; ++var7) {
                this.method666(-118, var7, arg1);
                int[][] var8 = this.method984((byte) 121, 0, class397.field6032);
                var4[var7] = var8[0][field1402];
                var5[var7] = var8[1][field1402];
                var6[var7] = var8[2][field1402];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static void method665(byte arg0) {
        field1399 = null;
        field1395 = null;
        if (arg0 != 113) {
            field1395 = null;
        }
        field1401 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 == -1) {
            super.field2148 = ~arg2.method618((byte) 100) == -2;
        }
        ++field1397;
        if (arg1 != 35) {
            field1400 = 104;
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
    private final void method666(int arg0, int arg1, int arg2) {
        ++field1404;
        int var4 = class197.field2791[arg1];
        int var5 = class185.field2613[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if (arg0 <= -2) {
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class397.field6032 = arg2;
                field1402 = arg1;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class397.field6032 = arg1;
                field1402 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class397.field6032 = arg1;
                field1402 = -arg2 + class316.field4838;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                field1402 = arg1;
                class397.field6032 = -arg2 + class150.field2159;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                field1402 = -arg1 + class316.field4838;
                class397.field6032 = class150.field2159 - arg2;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                field1402 = class316.field4838 - arg2;
                class397.field6032 = -arg1 + class150.field2159;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                field1402 = arg2;
                class397.field6032 = -arg1 + class150.field2159;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class397.field6032 = arg2;
                field1402 = -arg1 + class316.field4838;
            }
            class397.field6032 &= class51.field694;
            field1402 &= class320.field4897;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class96() {
        super(1, false);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field1398;
        if (arg0 != -10835) {
            return null;
        } else {
            int[] var3 = super.field2152.method2891(arg1, (byte) 123);
            if (super.field2152.field7051) {
                for (int var4 = 0; ~var4 > ~class316.field4838; ++var4) {
                    this.method666(-111, var4, arg1);
                    int[] var5 = this.method983(0, 24824, class397.field6032);
                    var3[var4] = var5[field1402];
                }
            }
            return var3;
        }
    }
}
