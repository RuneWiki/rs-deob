import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class113 extends class4 {

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    private int field1455 = 4096;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    private int field1451 = 4096;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    private int field1457 = 4096;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "[I")
    public static int[] field1456 = new int[120];

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1453 = 100;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 < -89) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field1457 = arg1.method3090(-79);
                    }
                } else {
                    this.field1451 = arg1.method3090(-76);
                }
            } else {
                this.field1455 = arg1.method3090(-95);
            }
            ++field1452;
        }
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
    public static final void method609(int arg0) {
        ++field1458;
        int var1 = arg0;
        if (class501.field6954.method3152(-115, class428.field5845)) {
            int var2 = arg0 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (!class501.field6954.field7880) {
            var1 |= 64;
        }
        class425.method2496(var1, (byte) -74);
        class626.field9084.method1094(var1, 63);
        class98.field1307.method3384(var1, 0);
        class579.field8053.method3627(var1, (byte) -40);
        class410.field5636.method345(var1, (byte) -76);
        class608.method3483(true, var1);
        class344.method2156(var1, 43);
        class446.method2595(var1, 1039742598);
        class234.method1477(var1, (byte) 80);
        class633.method3662(arg0 + 1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        ++field1454;
        if (arg1 >= -83) {
            return null;
        } else {
            int[][] var3 = super.field38.method3021((byte) 89, arg0);
            if (super.field38.field7618) {
                int[][] var4 = this.method22(arg0, (byte) -82, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class132.field1627 < ~var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && ~var13 == ~var14) {
                        var8[var11] = this.field1455 * var12 >> 12;
                        var9[var11] = this.field1451 * var13 >> 12;
                        var10[var11] = this.field1457 * var14 >> 12;
                    } else {
                        var8[var11] = this.field1455;
                        var9[var11] = this.field1451;
                        var10[var11] = this.field1457;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1461;
        if (~(arg5 - -arg6) < ~arg8 && arg5 < arg8 - -arg1) {
            if (arg4 + arg7 > arg2 && ~arg4 > ~(arg2 + arg3)) {
                return arg0 <= 3 ? true : true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1456 = null;
        if (arg0 >= -3) {
            method609(67);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method612(boolean arg0) {
        class311[] var1 = class75.field1023;
        synchronized (class75.field1023) {
            if (!arg0) {
                method611((byte) 31);
            }
            int var2 = 0;
            while (true) {
                if (class75.field1023.length <= var2) {
                    break;
                }
                class75.field1023[var2] = new class311();
                class516.field7208[var2] = 0;
                ++var2;
            }
        }
        ++field1459;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -121; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1456[var1] = var0 / 4;
        }
    }
}
