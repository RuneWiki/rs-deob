import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class205 extends class349 {

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "I")
    private int field2687 = 32768;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "Z")
    public static boolean field2682 = false;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)[[I")
    public final int[][] method9(int arg0, byte arg1) {
        int var3 = -102 / ((-32 - arg1) / 47);
        ++field2686;
        int[][] var4 = super.field5103.method2268(true, arg0);
        if (super.field5103.field5314) {
            int[] var5 = this.method2181(1, -1090477337, arg0);
            int[] var6 = this.method2181(2, -1090477337, arg0);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; class39.field497 > var10; ++var10) {
                int var11 = (1047659 & var5[var10] * 255) >> 12;
                int var12 = var6[var10] * this.field2687 >> 12;
                int var13 = class15.field127[var11] * var12 >> 12;
                int var14 = class339.field4960[var11] * var12 >> 12;
                int var15 = class144.field1839 & (var13 >> 12) + var10;
                int var16 = class4.field38 & (var14 >> 12) + arg0;
                int[][] var17 = this.method2180(0, 125, var16);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
    public class205() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILdga;)V")
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            field2682 = true;
        }
        ++field2688;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field5100 = arg2.method957((byte) -122) == 1;
            }
        } else {
            this.field2687 = arg2.method922((byte) -127) << 4;
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V")
    public final void method11(byte arg0) {
        if (arg0 > -51) {
            this.field2687 = -13;
        }
        ++field2683;
        class55.method350(0);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field2684;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = 53 / ((56 - arg0) / 41);
        if (super.field5109.field7515) {
            int[] var5 = this.method2181(1, -1090477337, arg1);
            int[] var6 = this.method2181(2, -1090477337, arg1);
            for (int var7 = 0; ~var7 > ~class39.field497; ++var7) {
                int var8 = (var5[var7] & 4089) >> 4;
                int var9 = var6[var7] * this.field2687 >> 12;
                int var10 = class15.field127[var8] * var9 >> 12;
                int var11 = class339.field4960[var8] * var9 >> 12;
                int var12 = (var10 >> 12) + var7 & class144.field1839;
                int var13 = class4.field38 & (var11 >> 12) + arg1;
                int[] var14 = this.method2181(0, -1090477337, var13);
                var3[var7] = var14[var12];
            }
        }
        return var3;
    }
}
