import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class95 extends class115 {

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    private int field1438 = -1;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "[I")
    public static int[] field1439 = new int[200];

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "Lhe;")
    public static class79 field1451 = new class79(5000);

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "[J")
    public static long[] field1452 = new long[200];

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "[I")
    private int[] field1443;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class191.method1225(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return client.method1433(var6 + 1, class107.field1556[arg0][arg1][arg3] + arg5, var7 + 1) && client.method1433(var6 + 128 - 1, class107.field1556[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && client.method1433(var6 + 128 - 1, class107.field1556[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && client.method1433(var6 + 1, class107.field1556[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class280.field4466[arg0][var8][var14] == -class242.field3649) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class107.field1556[arg0][arg1][arg3] + arg5;
            if (!client.method1433(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!client.method1433(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!client.method1433(var9, var11, var13)) {
                        return false;
                    } else if (!client.method1433(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)Z")
    private final boolean method641(int arg0) {
        ++field1440;
        if (this.field1443 != null) {
            return true;
        } else if (arg0 <= this.field1438) {
            int var2 = class77.field1178;
            int var3 = class192.field2753;
            int var4 = class137.field1989.method698(this.field1438, arg0 + -7854) ? 64 : 128;
            this.field1443 = class137.field1989.method699(arg0 + 1, this.field1438);
            this.field1449 = var4;
            this.field1444 = var4;
            class142.method941(false, var2, var3);
            return this.field1443 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class95() {
        super(0, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method239(byte arg0) {
        super.method239(arg0);
        this.field1443 = null;
        ++field1447;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field1448;
        if (~arg2 == arg0) {
            this.field1438 = arg1.method756(arg0 + -29900);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field1450;
        if (arg0 >= -33) {
            this.field1438 = 39;
        }
        int[][] var3 = super.field1716.method6(arg1, (byte) 114);
        if (super.field1716.field23 && this.method641(0)) {
            int var4 = (~class192.field2753 == ~this.field1444 ? arg1 : this.field1444 * arg1 / class192.field2753) * this.field1449;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class77.field1178 != ~this.field1449) {
                for (int var8 = 0; ~var8 > ~class77.field1178; ++var8) {
                    int var9 = this.field1449 * var8 / class77.field1178;
                    int var10 = this.field1443[var4 - -var9];
                    var7[var8] = class184.method1188(4080, var10 << 4);
                    var6[var8] = class184.method1188(var10 >> 4, 4080);
                    var5[var8] = class184.method1188(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class77.field1178 > var11; ++var11) {
                    int var12 = this.field1443[var4++];
                    var7[var11] = class184.method1188(var12 << 4, 4080);
                    var6[var11] = class184.method1188(4080, var12 >> 4);
                    var5[var11] = class184.method1188(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V")
    public static void method642(boolean arg0) {
        if (arg0) {
            field1453 = 35;
        }
        field1439 = null;
        field1451 = null;
        field1452 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIII)I")
    public static final int method643(int arg0, int arg1, int arg2, int arg3) {
        ++field1446;
        if (arg0 != 2) {
            method643(-99, -79, -59, -63);
        }
        if (arg2 > 243) {
            arg3 >>= 4;
        } else if (~arg2 < -218) {
            arg3 >>= 3;
        } else if (~arg2 < -193) {
            arg3 >>= 2;
        } else if (~arg2 < -180) {
            arg3 >>= 1;
        }
        return (arg2 >> 1) + (arg1 >> 2 << 10) + (arg3 >> 5 << 7);
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)I")
    public final int method644(int arg0) {
        if (arg0 != -20926) {
            this.field1443 = null;
        }
        ++field1442;
        return this.field1438;
    }
}
