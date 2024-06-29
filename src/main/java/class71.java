import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class71 extends class157 {

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    private int field1341 = 0;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    private int field1347 = 4096;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "Lcc;")
    public static class209 field1342 = class95.method669(117, "Regarder dans cette direction");

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Z")
    public static boolean field1343 = true;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "Lcc;")
    public static class209 field1340 = class95.method669(95, "Polices charg-Bes");

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "Lpl;")
    public static class286 field1349 = new class286();

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "Lcc;")
    public static class209 field1353 = class95.method669(111, "p11_full");

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1352;
        int var9 = -arg2 + arg4;
        int var10 = -arg0 + arg1;
        int var11 = 2 % ((70 - arg5) / 55);
        int var12 = (-arg8 + arg6 << 16) / var10;
        int var13 = (-arg7 + arg3 << 16) / var9;
        class192.method1316(var12, 0, arg8, arg1, 0, 128, arg0, var13, arg4, arg2, arg7);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
    public static void method517(byte arg0) {
        field1340 = null;
        if (arg0 <= 47) {
            method517((byte) -77);
        }
        field1342 = null;
        field1349 = null;
        field1353 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        ++field1348;
        int[][] var3 = super.field2872.method533(arg1, arg0 + 2);
        if (arg0 != 1) {
            return null;
        } else {
            if (super.field2872.field1434) {
                int[][] var4 = this.method1093(arg1, 0, 64);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                int[] var10 = var3[1];
                for (int var11 = 0; var11 < class226.field4124; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (var12 >= this.field1341) {
                        if (~this.field1347 > ~var12) {
                            var9[var11] = this.field1347;
                        } else {
                            var9[var11] = var12;
                        }
                    } else {
                        var9[var11] = this.field1341;
                    }
                    if (~this.field1341 < ~var13) {
                        var10[var11] = this.field1341;
                    } else if (var13 > this.field1347) {
                        var10[var11] = this.field1347;
                    } else {
                        var10[var11] = var13;
                    }
                    if (var14 < this.field1341) {
                        var8[var11] = this.field1341;
                    } else if (this.field1347 >= var14) {
                        var8[var11] = var14;
                    } else {
                        var8[var11] = this.field1347;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2877 = arg2.method774((byte) 87) == 1;
                }
            } else {
                this.field1347 = arg2.method736(121);
            }
        } else {
            this.field1341 = arg2.method736(125);
        }
        ++field1350;
        if (arg1 > -29) {
            this.method1(-78, (byte) -29, (class106) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class71() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            return null;
        } else {
            ++field1344;
            int[] var3 = super.field2879.method1269(arg1, arg0 ^ -17853);
            if (super.field2879.field3363) {
                int[] var4 = this.method1097((byte) 75, 0, arg1);
                for (int var5 = 0; class226.field4124 > var5; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 <= ~this.field1341) {
                        if (this.field1347 < var6) {
                            var3[var5] = this.field1347;
                        } else {
                            var3[var5] = var6;
                        }
                    } else {
                        var3[var5] = this.field1341;
                    }
                }
            }
            return var3;
        }
    }
}
