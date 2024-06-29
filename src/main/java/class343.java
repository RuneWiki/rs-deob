import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class343 extends class220 {

    @OriginalMember(owner = "client!pq", name = "U", descriptor = "I")
    private int field5034 = 32768;

    @OriginalMember(owner = "client!pq", name = "V", descriptor = "[I")
    public static int[] field5035 = new int[25];

    @OriginalMember(owner = "client!pq", name = "W", descriptor = "Ljava/lang/String;")
    public static String field5036 = "white:";

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
    public static int field5031 = 0;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "[[[Lpm;")
    public static class10[][][] field5032;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field5037;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (super.field3135.field4087) {
            int[] var4 = this.method1366(1, (byte) -40, arg0);
            int[] var5 = this.method1366(2, (byte) -40, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class344.field5043; ++var9) {
                int var10 = (1048152 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field5034 >> 12;
                int var12 = class30.field520[var10] * var11 >> 12;
                int var13 = class442.field6459[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class392.field5887;
                int var15 = class315.field4510 & (var13 >> 12) + arg0;
                int[][] var16 = this.method1369(0, (byte) 121, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg1 != 0) {
            this.method440(46);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
    public class343() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field5029;
        int[] var3 = super.field3125.method2005(arg1, (byte) -112);
        if (arg0 != -11543) {
            this.field5034 = 33;
        }
        if (super.field3125.field4676) {
            int[] var4 = this.method1366(1, (byte) -40, arg1);
            int[] var5 = this.method1366(2, (byte) -40, arg1);
            for (int var6 = 0; ~class344.field5043 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field5034 >> 12;
                int var9 = class30.field520[var7] * var8 >> 12;
                int var10 = class442.field6459[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class392.field5887;
                int var12 = class315.field4510 & (var10 >> 12) + arg1;
                int[] var13 = this.method1366(0, (byte) -40, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        class261.method1638(arg0);
        ++field5030;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field5033;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field3131 = arg2.method1697(114) == 1;
            }
        } else {
            this.field5034 = arg2.method1685(arg1 + 8153) << 4;
        }
        if (arg1 != -49) {
            field5035 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V")
    public static void method2264(int arg0) {
        field5035 = null;
        if (arg0 < 21) {
            method2264(-14);
        }
        field5032 = null;
        field5036 = null;
    }
}
