import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class357 extends class306 {

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field5667 = 64;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "I")
    public static int field5664 = 0;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5662 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field5671 = -1;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5672 = " ";

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)I", line = 5)
    public static final int method2456(int arg0, int arg1) {
        if (arg0 != 32676) {
            method2457(-44, -71);
        }
        field5668++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method47(int arg0, int arg1) {
        field5663++;
        int[] var3 = this.field4757.method903(arg0, -102);
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 119, 0);
            int[] var5 = this.method2161(arg0, (byte) 127, 1);
            int[] var6 = this.method2161(arg0, (byte) 116, 2);
            for (int var7 = 0; var7 < class31.field367; var7++) {
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
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 69)
    public class357() {
        super(3, false);
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(II)I", line = 76)
    public static final int method2457(int arg0, int arg1) {
        if (arg0 > -83) {
            method2458(-102, (class16) null);
        }
        field5666++;
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[[I", line = 96)
    public final int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            field5667 = -67;
        }
        int[][] var3 = this.field4752.method1866(arg0, 0);
        field5670++;
        if (this.field4752.field4179) {
            int[] var4 = this.method2161(arg0, (byte) 124, 2);
            int[][] var5 = this.method2160(0, (byte) 6, arg0);
            int[][] var6 = this.method2160(1, (byte) 118, arg0);
            int[] var7 = var3[1];
            int[] var8 = var5[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var5[2];
            int[] var12 = var5[0];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class31.field367; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var9[var16] = var12[var16];
                    var7[var16] = var8[var16];
                    var10[var16] = var11[var16];
                } else if (var17 == 0) {
                    var9[var16] = var14[var16];
                    var7[var16] = var13[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var9[var16] = var12[var16] * var17 + (var14[var16] * var18) >> 12;
                    var7[var16] = var8[var16] * var17 + var13[var16] * var18 >> 12;
                    var10[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILlf;I)V", line = 175)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            field5667 = -118;
        }
        if (arg2 == 0) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        field5665++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILnk;)V", line = 190)
    public static final void method2458(int arg0, class16 arg1) {
        class90.field1187 = arg1;
        if (arg0 != 2) {
            field5664 = -74;
        }
        field5661++;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V", line = 207)
    public static void method2459(int arg0) {
        if (arg0 != 0) {
            field5664 = -36;
        }
        field5662 = null;
        field5672 = null;
    }
}
