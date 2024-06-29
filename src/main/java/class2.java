import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class214 {

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    private int field15 = 32768;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "J")
    public static long field7 = -1L;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "Lcs;")
    public static class351 field11 = new class351(61, 2);

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "Z")
    public static boolean field23;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "Ldc;")
    public static class167 field22;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "Lqr;")
    public static class23 field21;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "Lkm;")
    public static class487 field18;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "[Z")
    public static boolean[] field19;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "[[I")
    public static int[][] field16;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZILfc;IB)V")
    public static final void method8(int arg0, boolean arg1, int arg2, class343 arg3, int arg4, byte arg5) {
        if (arg5 >= 54) {
            class71.field1041 = arg0;
            class174.field2565 = arg2;
            class18.field302 = arg4;
            class70.field1040 = 1;
            ++field10;
            class351.field4802 = 10000;
            class344.field4708 = arg1;
            class351.field4805 = arg3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public static void method9(int arg0) {
        field18 = null;
        field22 = null;
        if (arg0 < -120) {
            field21 = null;
            field16 = null;
            field11 = null;
            field19 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)I")
    public static final int method10(int arg0, int arg1, int arg2) {
        ++field13;
        if (arg1 < 113) {
            field17 = 71;
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (~arg0 == 0) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (127 & arg0) * arg2 >> 7;
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (arg0 & 65408) - -var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class2() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field14;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644) {
            int[] var4 = this.method1352(arg0, 1, arg1 + -218);
            int[] var5 = this.method1352(arg0, 2, -106);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class399.field5585; ++var9) {
                int var10 = (1045775 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field15 >> 12;
                int var12 = class328.field4534[var10] * var11 >> 12;
                int var13 = class406.field5629[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class467.field6551;
                int var15 = class183.field2659 & (var13 >> 12) + arg0;
                int[][] var16 = this.method1354(0, var15, (byte) 23);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg1 != 92) {
            method13(-121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        ++field9;
        if (arg0 == 27108) {
            class407.method2390((byte) -111);
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)Lba;")
    public static final class265 method13(int arg0) {
        if (arg0 != 871605004) {
            method10(123, -94, 84);
        }
        ++field5;
        class265 var1 = (class265) class393.field5521.method1587(0);
        if (var1 != null) {
            var1.method1182(28818);
            var1.method738(-13002);
            return var1;
        } else {
            class265 var2;
            do {
                var2 = (class265) class238.field3356.method1587(0);
                if (var2 == null) {
                    return null;
                }
                if (var2.method1673(0) > class193.method1237(-9581)) {
                    return null;
                }
                var2.method1182(arg0 + -871576186);
                var2.method738(-13002);
            } while ((Long.MIN_VALUE & var2.field1649) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field6;
        if (arg0 != 123) {
            return null;
        } else {
            int[] var3 = super.field3024.method2585(arg1, arg0 + -123);
            if (super.field3024.field6135) {
                int[] var4 = this.method1352(arg1, 1, -92);
                int[] var5 = this.method1352(arg1, 2, -41);
                for (int var6 = 0; var6 < class399.field5585; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field15 >> 12;
                    int var9 = class328.field4534[var7] * var8 >> 12;
                    int var10 = class406.field5629[var7] * var8 >> 12;
                    int var11 = (var9 >> 12) + var6 & class467.field6551;
                    int var12 = (var10 >> 12) + arg1 & class183.field2659;
                    int[] var13 = this.method1352(var12, 0, arg0 ^ -88);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 >= -114) {
            this.method14((byte) 95, -5);
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field3032 = arg0.method2503(true) == 1;
            }
        } else {
            this.field15 = arg0.method2508(true) << 4;
        }
        ++field8;
    }

    static {
        new class112(" days.", " Tage.", " jours.", " dias.");
        field23 = true;
    }
}
