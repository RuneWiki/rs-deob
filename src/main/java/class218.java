import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class218 extends class199 {

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "[I")
    public static int[] field3076;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 4)
    public static void method1580(int arg0) {
        if (arg0 != 8) {
            method1581((class333) null, (byte) -115);
        }
        field3076 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwf;B)V", line = 17)
    public static final void method1581(class333 arg0, byte arg1) {
        class333 var2 = class223.method1622(72, arg0);
        field3074++;
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class192.field2660;
            var3 = class163.field2314;
        } else {
            var3 = var2.field5056;
            var4 = var2.field5172;
        }
        class154.method1188(false, var3, arg0, var4, -4);
        class260.method1793(var3, var4, arg0, 125);
        int var5 = 7 / ((arg1 - 26) / 39);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)Z", line = 45)
    public static final boolean method1582(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class204.field2833; var3++) {
            class232 var4 = class291.field4236[var3];
            if (var4.field3328 == 1) {
                int var5 = var4.field3317 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3319 * var5 >> 8) + var4.field3315;
                    int var7 = (var4.field3329 * var5 >> 8) + var4.field3335;
                    int var8 = (var4.field3324 * var5 >> 8) + var4.field3327;
                    int var9 = (var4.field3323 * var5 >> 8) + var4.field3337;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3328 == 2) {
                int var10 = arg0 - var4.field3317;
                if (var10 > 0) {
                    int var11 = (var4.field3319 * var10 >> 8) + var4.field3315;
                    int var12 = (var4.field3329 * var10 >> 8) + var4.field3335;
                    int var13 = (var4.field3324 * var10 >> 8) + var4.field3327;
                    int var14 = (var4.field3323 * var10 >> 8) + var4.field3337;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3328 == 3) {
                int var15 = var4.field3315 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3316 * var15 >> 8) + var4.field3317;
                    int var17 = (var4.field3334 * var15 >> 8) + var4.field3332;
                    int var18 = (var4.field3324 * var15 >> 8) + var4.field3327;
                    int var19 = (var4.field3323 * var15 >> 8) + var4.field3337;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3328 == 4) {
                int var20 = arg2 - var4.field3315;
                if (var20 > 0) {
                    int var21 = (var4.field3316 * var20 >> 8) + var4.field3317;
                    int var22 = (var4.field3334 * var20 >> 8) + var4.field3332;
                    int var23 = (var4.field3324 * var20 >> 8) + var4.field3327;
                    int var24 = (var4.field3323 * var20 >> 8) + var4.field3337;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3328 == 5) {
                int var25 = arg1 - var4.field3327;
                if (var25 > 0) {
                    int var26 = (var4.field3316 * var25 >> 8) + var4.field3317;
                    int var27 = (var4.field3334 * var25 >> 8) + var4.field3332;
                    int var28 = (var4.field3319 * var25 >> 8) + var4.field3315;
                    int var29 = (var4.field3329 * var25 >> 8) + var4.field3335;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLfd;I)V", line = 169)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        field3077++;
        if (arg0 != -43) {
            method1582(90, 65, 93);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 182)
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I", line = 188)
    public final int[] method190(int arg0, int arg1) {
        field3073++;
        int[] var3 = this.field2802.method2502(arg1, -116);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(arg0 ^ 0x1895, arg1, 0);
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return arg0 == -1735 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I", line = 222)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            field3076 = (int[]) null;
        }
        int[][] var3 = this.field2796.method2187(arg0, -83);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, arg0, (byte) -51);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class95.field1235; var11++) {
                var7[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var8[var11];
                var10[var11] = 4096 - var6[var11];
            }
        }
        field3075++;
        return var3;
    }
}
