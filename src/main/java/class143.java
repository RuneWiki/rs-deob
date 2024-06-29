import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class143 extends class224 {

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "Z")
    private boolean field2091 = true;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    private int field2102 = 4096;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "[I")
    public static int[] field2092 = new int[14];

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "[I")
    public static int[] field2096 = new int[200];

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[J")
    public static long[] field2101 = new long[200];

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "Z")
    public static boolean field2098 = true;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Ldl;")
    public static class123 field2099;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)V")
    public static final void method951(byte arg0, boolean arg1) {
        class94.field1462 = new int[104];
        class23.field292 = 99;
        ++field2094;
        class231.field3720 = new int[104];
        class290.field4576 = new int[104];
        byte var2;
        if (!arg1) {
            var2 = 4;
        } else {
            var2 = 1;
        }
        class185.field2899 = new byte[var2][104][104];
        class80.field1149 = new int[var2][105][105];
        class245.field3933 = new byte[var2][105][105];
        class4.field49 = new byte[var2][104][104];
        class157.field2427 = new byte[var2][104][104];
        class108.field1657 = new int[104];
        if (arg0 != 87) {
            method951((byte) 46, false);
        }
        class262.field4226 = new int[104];
        class110.field1665 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIILhi;IJZ)Z")
    public static final boolean method952(int arg0, int arg1, int arg2, int arg3, int arg4, class219 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class3.method9(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field2095;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field2091 = arg0.method201(255) == 1;
            }
        } else {
            this.field2102 = arg0.method190(-3);
        }
        if (arg2 > -46) {
            field2096 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    public static void method953(int arg0) {
        field2092 = null;
        field2101 = null;
        field2096 = null;
        if (arg0 != 3495) {
            method951((byte) 93, true);
        }
        field2099 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method954(byte arg0, String arg1) {
        int var2 = -117 / ((-17 - arg0) / 41);
        int var3 = class71.method478((byte) -105, arg1);
        ++field2097;
        if (var3 != -1) {
            class69.method468(class107.field1644.field1096[var3], class107.field1644.field1105[var3], 0);
        }
    }

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)Lkj;")
    public static final class145 method955(int arg0) {
        ++field2100;
        class15 var1 = new class15(class46.field583, class209.field3253, class206.field3221[0], class226.field3653[0], class236.field3777[0], class228.field3696[0], class101.field1574[0], class72.field1023);
        class222.method1506((byte) 119);
        if (arg0 <= 16) {
            method955(-101);
        }
        return var1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field2093;
            int[][] var3 = super.field3616.method1341(false, arg0);
            if (super.field3616.field3042) {
                int[] var4 = this.method1527(arg0 + -1 & class261.field4217, 0, (byte) 84);
                int[] var5 = this.method1527(arg0, 0, (byte) 84);
                int[] var6 = this.method1527(arg0 + 1 & class261.field4217, 0, (byte) 84);
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var3[0];
                for (int var10 = 0; ~class78.field1108 < ~var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field2102;
                    int var12 = (var5[var10 + 1 & class206.field3220] + -var5[class206.field3220 & var10 + -1]) * this.field2102;
                    int var13 = var12 >> 12;
                    int var14 = var13 * var13 >> 12;
                    int var15 = var11 >> 12;
                    int var16 = var15 * var15 >> 12;
                    int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var14 - -4096 + var16) / 4096.0F)));
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var12 / var17;
                        var19 = var11 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var19 = 0;
                        var20 = 0;
                        var18 = 0;
                    }
                    if (this.field2091) {
                        var20 = (var20 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                    }
                    var9[var10] = var18;
                    var7[var10] = var19;
                    var8[var10] = var20;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, false);
    }
}
