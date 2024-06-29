import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class60 extends class272 {

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    private int field1076 = 1;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    private int field1082 = 1;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "[Lwb;")
    public static class129[] field1084 = new class129[6];

    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lli;")
    public static class185 field1089 = class245.method1649(" weitere Optionen", -78);

    @OriginalMember(owner = "client!je", name = "X", descriptor = "Lli;")
    public static class185 field1090 = class245.method1649("leuchten2:", -28);

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Z")
    public static boolean field1080;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "[I")
    public static int[] field1085;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "[S")
    public static short[] field1077;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "[[[I")
    public static int[][][] field1075;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[[[S")
    public static short[][][] field1081;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        int var3 = -17 / ((-60 - arg1) / 45);
        ++field1086;
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int var5 = this.field1076 + 1 + this.field1076;
            int var6 = 65536 / var5;
            int var7 = this.field1082 + 1 + this.field1082;
            int[][][] var8 = new int[var5][][];
            int var9 = 65536 / var7;
            for (int var10 = arg0 - this.field1076; arg0 - -this.field1076 >= var10; ++var10) {
                int var20 = 0;
                int var21 = 0;
                int[][] var22 = this.method1860(class99.field1826 & var10, 3, 0);
                int[][] var23 = new int[3][class246.field4385];
                int var24 = 0;
                int[] var25 = var22[1];
                int[] var26 = var22[0];
                int[] var27 = var22[2];
                for (int var28 = -this.field1082; ~this.field1082 <= ~var28; ++var28) {
                    int var38 = class59.field1037 & var28;
                    var20 += var26[var38];
                    var24 += var27[var38];
                    var21 += var25[var38];
                }
                int[] var29 = var23[0];
                int[] var30 = var23[1];
                int[] var31 = var23[2];
                int var32 = 0;
                while (class246.field4385 > var32) {
                    var29[var32] = var9 * var20 >> 16;
                    var30[var32] = var9 * var21 >> 16;
                    var31[var32] = var9 * var24 >> 16;
                    int var33 = -this.field1082 + var32 & class59.field1037;
                    int var34 = var21 - var25[var33];
                    int var35 = var20 - var26[var33];
                    int var36 = var24 - var27[var33];
                    ++var32;
                    int var37 = class59.field1037 & var32 - -this.field1082;
                    var24 = var27[var37] + var36;
                    var21 = var25[var37] + var34;
                    var20 = var26[var37] + var35;
                }
                var8[this.field1076 + var10 + -arg0] = var23;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; var14 < class246.field4385; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; ~var18 > ~var5; ++var18) {
                    int[][] var19 = var8[var18];
                    var16 += var19[1][var14];
                    var15 += var19[0][var14];
                    var17 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, false);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Z")
    public static final boolean method421(int arg0, int arg1) {
        if (arg0 != 230) {
            return true;
        } else {
            ++field1088;
            return ~arg1 == -199 || arg1 == 230 || ~arg1 == -157 || ~arg1 == -141 || arg1 == 223;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            return null;
        } else {
            ++field1079;
            int[] var3 = super.field4819.method1632(arg1 + -4421, arg0);
            if (super.field4819.field4294) {
                int var4 = this.field1076 + 1 + this.field1076;
                int var5 = 65536 / var4;
                int var6 = this.field1082 + this.field1082 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = arg0 - this.field1076; ~(arg0 - -this.field1076) <= ~var9; ++var9) {
                    int[] var13 = this.method1866(class99.field1826 & var9, 0, 127);
                    int[] var14 = new int[class246.field4385];
                    int var15 = 0;
                    for (int var16 = -this.field1082; ~this.field1082 <= ~var16; ++var16) {
                        var15 += var13[var16 & class59.field1037];
                    }
                    int var17 = 0;
                    while (~class246.field4385 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field1082 + var17 & class59.field1037];
                        ++var17;
                        var15 = var13[class59.field1037 & var17 - -this.field1082] + var18;
                    }
                    var8[this.field1076 + var9 + -arg0] = var14;
                }
                for (int var10 = 0; ~class246.field4385 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; ~var4 < ~var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B[Lp;IZII)V")
    public static final void method422(byte arg0, class82[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = 0; ~var6 > ~arg1.length; ++var6) {
            class82 var7 = arg1[var6];
            if (var7 != null && ~var7.field1580 == ~arg2) {
                class119.method885(arg4, (byte) 5, var7, arg5, arg3);
                class119.method881(arg5, arg4, var7, (byte) -106);
                if (~var7.field1590 < ~(-var7.field1498 + var7.field1552)) {
                    var7.field1590 = -var7.field1498 + var7.field1552;
                }
                if (~var7.field1590 > -1) {
                    var7.field1590 = 0;
                }
                if (-var7.field1505 + var7.field1628 < var7.field1565) {
                    var7.field1565 = -var7.field1505 + var7.field1628;
                }
                if (var7.field1565 < 0) {
                    var7.field1565 = 0;
                }
                if (var7.field1612 == 0) {
                    class116.method809(1815818576, var7, arg3);
                }
            }
        }
        if (arg0 > -67) {
            field1089 = null;
        }
        ++field1083;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field4832 = arg0.method867(false) == 1;
                }
            } else {
                this.field1076 = arg0.method867(false);
            }
        } else {
            this.field1082 = arg0.method867(false);
        }
        int var5 = -109 % ((arg1 - -21) / 55);
        ++field1087;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V")
    public static void method423(int arg0) {
        field1084 = null;
        field1085 = null;
        field1090 = null;
        if (arg0 > 34) {
            field1081 = null;
            field1089 = null;
            field1077 = null;
            field1075 = null;
        }
    }
}
