import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class322 extends class27 {

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    private int field4848 = 1;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    private int field4850 = 1;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field4849 = 0;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4853 = 0;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lph;")
    public static class361 field4851;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "[[Z")
    public static boolean[][] field4852;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V", line = 7)
    public static void method2237(byte arg0) {
        field4852 = (boolean[][]) null;
        field4851 = null;
        int var1 = -70 % ((-arg0 - 55) / 57);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[[I", line = 21)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            this.method19(13, 123);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        field4845++;
        if (this.field379.field1171) {
            int var4 = this.field4848 + this.field4848 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4850 + this.field4850 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var6][][];
            for (int var9 = arg1 - this.field4850; var9 <= this.field4850 + arg1; var9++) {
                int[][] var10 = this.method168(0, -113, class214.field3080 & var9);
                int[][] var11 = new int[3][class209.field3053];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field4848; var18 <= this.field4848; var18++) {
                    int var19 = class150.field2180 & var18;
                    var13 += var16[var19];
                    var12 += var15[var19];
                    var14 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class209.field3053 > var23) {
                    var20[var23] = var5 * var12 >> 16;
                    var21[var23] = var5 * var13 >> 16;
                    var22[var23] = var5 * var14 >> 16;
                    int var24 = var23 - this.field4848 & class150.field2180;
                    int var25 = var12 - var15[var24];
                    int var26 = var13 - var16[var24];
                    int var27 = var14 - var17[var24];
                    var23++;
                    int var28 = this.field4848 + var23 & class150.field2180;
                    var13 = var16[var28] + var26;
                    var12 = var15[var28] + var25;
                    var14 = var17[var28] + var27;
                }
                var8[this.field4850 + var9 - arg1] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class209.field3053; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var6; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[2][var32];
                    var35 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var7 * var33 >> 16;
                var30[var32] = var7 * var35 >> 16;
                var31[var32] = var7 * var34 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIB)I", line = 163)
    public static final int method2238(int arg0, int arg1, byte arg2) {
        field4854++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            if (arg2 != -122) {
                field4852 = (boolean[][]) ((boolean[][]) null);
            }
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[I", line = 205)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            this.field4850 = -114;
        }
        field4846++;
        int[] var3 = this.field375.method2087(arg1 ^ 0x1A, arg0);
        if (this.field375.field4382) {
            int var4 = this.field4850 + this.field4850 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4848 + this.field4848 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field4850; var9 <= (arg0 + this.field4850); var9++) {
                int[] var10 = this.method164(var9 & class214.field3080, 23, 0);
                int var11 = 0;
                for (int var12 = -this.field4848; var12 <= this.field4848; var12++) {
                    var11 += var10[class150.field2180 & var12];
                }
                int[] var13 = new int[class209.field3053];
                int var14 = 0;
                while (var14 < class209.field3053) {
                    var13[var14] = var7 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field4848 & class150.field2180];
                    var14++;
                    var11 = var10[this.field4848 + var14 & class150.field2180] + var15;
                }
                var8[var9 + this.field4850 - arg0] = var13;
            }
            for (int var16 = 0; var16 < class209.field3053; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILsb;I)V", line = 292)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            field4853 = 100;
        }
        if (arg2 == 0) {
            this.field4848 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field4850 = arg1.method1319(255);
        } else if (arg2 == 2) {
            this.field376 = arg1.method1319(arg0 + 6091) == 1;
        }
        field4847++;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 338)
    public class322() {
        super(1, false);
    }
}
