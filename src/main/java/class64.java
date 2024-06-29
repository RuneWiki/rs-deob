import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class64 extends class601 {

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    private int field782 = 32768;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "Lro;")
    public static class2 field776 = new class2();

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "[I")
    public static int[] field786 = new int[14];

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Lda;")
    public static class60 field785;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "[[[I")
    public static int[][][] field787;

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 3)
    public class64() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IZ)[[I", line = 7)
    public final int[][] method7(int arg0, boolean arg1) {
        ++field781;
        int[][] var3 = super.field7890.method3963(1, arg0);
        if (super.field7890.field9769) {
            int[] var4 = this.method3266((byte) 64, arg0, 1);
            int[] var5 = this.method3266((byte) 64, arg0, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class171.field2624 < ~var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field782 >> 12;
                int var12 = class379.field5284[var10] * var11 >> 12;
                int var13 = class105.field1442[var10] * var11 >> 12;
                int var14 = class445.field6116 & (var12 >> 12) + var9;
                int var15 = class112.field1855 & arg0 - -(var13 >> 12);
                int[][] var16 = this.method3268(var15, 0, 65535);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (!arg1) {
            field776 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)[I", line = 66)
    public final int[] method5(byte arg0, int arg1) {
        ++field779;
        if (arg0 != -40) {
            method546(-88, (byte) -69);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int[] var4 = this.method3266((byte) 64, arg1, 1);
            int[] var5 = this.method3266((byte) 64, arg1, 2);
            for (int var6 = 0; ~var6 > ~class171.field2624; ++var6) {
                int var7 = (var4[var6] & 4085) >> 4;
                int var8 = var5[var6] * this.field782 >> 12;
                int var9 = class379.field5284[var7] * var8 >> 12;
                int var10 = class105.field1442[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class445.field6116;
                int var12 = class112.field1855 & (var10 >> 12) + arg1;
                int[] var13 = this.method3266((byte) 64, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)V", line = 115)
    public static final void method546(int arg0, byte arg1) {
        class362.field5097.method553(arg0, -15782);
        ++field777;
        if (arg1 < 116) {
            field785 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)Z", line = 129)
    public static final boolean method547(int arg0, int arg1, int arg2) {
        ++field778;
        if (arg0 != -3) {
            return false;
        } else {
            return ~(arg2 & 2048) != -1 | class390.method2312(arg2, false, arg1) || class548.method3062(arg1, 55, arg2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[B)Z", line = 141)
    public static final boolean method548(int arg0, byte[] arg1) {
        ++field783;
        class677 var2 = new class677(arg1);
        int var3 = var2.method3821((byte) -71);
        if (~var3 != -3) {
            return false;
        } else if (arg0 > -123) {
            return true;
        } else {
            boolean var4 = var2.method3821((byte) -105) == 1;
            if (var4) {
                class373.method2185(-1, var2);
            }
            class164.method1181(var2, -1);
            return true;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lee;BI)V", line = 168)
    public final void method6(class677 arg0, byte arg1, int arg2) {
        if (arg1 == -61) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    super.field7897 = arg0.method3821((byte) 84) == 1;
                }
            } else {
                this.field782 = arg0.method3807(-1) << 4;
            }
            ++field780;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 210)
    public static void method549(int arg0) {
        field787 = null;
        field786 = null;
        field785 = null;
        field776 = null;
        if (arg0 != 28045) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 224)
    public final void method108(int arg0) {
        class564.method3118(true);
        ++field784;
        if (arg0 != 8351) {
            field786 = null;
        }
    }
}
