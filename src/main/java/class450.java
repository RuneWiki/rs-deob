import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class450 extends class335 {

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    private int field5944 = 32768;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "Leba;")
    public static class550 field5942 = new class550(31, -1);

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Ljm;")
    public static class285 field5948;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "Lf;")
    public static class532 field5946;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILio;I)V", line = 5)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4537 = arg1.method930(255) == 1;
            }
        } else {
            this.field5944 = arg1.method963(-119) << 4;
        }
        ++field5945;
        if (arg2 != -66) {
            field5948 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)V", line = 40)
    public static void method2530(byte arg0) {
        field5948 = null;
        field5946 = null;
        if (arg0 != -25) {
            method2531((byte) -109, 11, -29);
        }
        field5942 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[I", line = 58)
    public final int[] method3(boolean arg0, int arg1) {
        ++field5949;
        if (!arg0) {
            return null;
        } else {
            int[] var3 = super.field4525.method2344(-2, arg1);
            if (super.field4525.field5435) {
                int[] var4 = this.method1969(1, arg1, -114);
                int[] var5 = this.method1969(2, arg1, -124);
                for (int var6 = 0; var6 < class649.field8968; ++var6) {
                    int var7 = (4089 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field5944 >> 12;
                    int var9 = class245.field3211[var7] * var8 >> 12;
                    int var10 = class104.field1239[var7] * var8 >> 12;
                    int var11 = (var9 >> 12) + var6 & class29.field413;
                    int var12 = (var10 >> 12) + arg1 & class326.field4386;
                    int[] var13 = this.method1969(0, var12, -115);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 112)
    public class450() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)Z", line = 117)
    public static final boolean method2531(byte arg0, int arg1, int arg2) {
        ++field5941;
        if (arg0 >= -84) {
            return true;
        } else {
            return ~(arg1 & 32768) != -1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 129)
    public final void method317(byte arg0) {
        class420.method2371(10779);
        ++field5943;
        int var2 = 123 % ((arg0 - 58) / 60);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)[[I", line = 141)
    public final int[][] method1(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field5947;
            int[][] var3 = super.field4527.method669(arg0, (byte) 2);
            if (super.field4527.field1468) {
                int[] var4 = this.method1969(1, arg0, -120);
                int[] var5 = this.method1969(2, arg0, -48);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; class649.field8968 > var9; ++var9) {
                    int var10 = (1045361 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field5944 >> 12;
                    int var12 = class245.field3211[var10] * var11 >> 12;
                    int var13 = class104.field1239[var10] * var11 >> 12;
                    int var14 = class29.field413 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg0 & class326.field4386;
                    int[][] var16 = this.method1968(var15, 3, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBI)Z", line = 199)
    public static final boolean method2532(int arg0, byte arg1, int arg2) {
        ++field5950;
        int var3 = 114 / ((arg1 - -56) / 60);
        return ~(2048 & arg2) != -1;
    }
}
