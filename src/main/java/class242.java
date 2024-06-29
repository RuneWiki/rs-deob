import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class242 extends class349 {

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)[I", line = 5)
    public final int[] method13(byte arg0, int arg1) {
        ++field3157;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int[] var4 = this.method2181(0, -1090477337, arg1);
            int[] var5 = this.method2181(1, -1090477337, arg1);
            int[] var6 = this.method2181(2, -1090477337, arg1);
            for (int var7 = 0; ~class39.field497 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        int var9 = -104 / ((56 - arg0) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V", line = 57)
    public class242() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V", line = 60)
    public static final void method1487(byte arg0) {
        class608.field8292.method2510(-1);
        ++field3160;
        class108.field1301.method2711(-14886);
        if (arg0 >= -74) {
            method1488(-104);
        }
        class218.field2818.method2711(-14886);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILdga;)V", line = 75)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 == 4095) {
            ++field3159;
            if (arg1 == 0) {
                super.field5100 = ~arg2.method957((byte) -73) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[[I", line = 96)
    public final int[][] method9(int arg0, byte arg1) {
        ++field3156;
        int[][] var3 = super.field5103.method2268(true, arg0);
        int var4 = -124 % ((-32 - arg1) / 47);
        if (super.field5103.field5314) {
            int[] var5 = this.method2181(2, -1090477337, arg0);
            int[][] var6 = this.method2180(0, 49, arg0);
            int[][] var7 = this.method2180(1, 110, arg0);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class39.field497; ++var17) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                } else if (var18 == 0) {
                    var8[var17] = var14[var17];
                    var9[var17] = var15[var17];
                    var10[var17] = var16[var17];
                } else {
                    int var19 = -var18 + 4096;
                    var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                    var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)Z", line = 174)
    public static final boolean method1488(int arg0) {
        ++field3161;
        if (~class369.field5301 != -1) {
            return true;
        } else {
            return arg0 != -1799947892 ? true : class648.field9178.method314((byte) 99);
        }
    }
}
