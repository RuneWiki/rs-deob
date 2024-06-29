import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class141 extends class264 {

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    private int field1971 = 4096;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "[Lkk;")
    public static class161[] field1970 = new class161[2048];

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field1972 = 0;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "Lrc;")
    public static class108 field1973 = new class108(97, 14);

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLkk;I)V", line = 5)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 > 31) {
            if (~arg2 == -1) {
                this.field1971 = arg1.method1134(-16848);
            }
            ++field1969;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 20)
    public static void method1018(byte arg0) {
        field1970 = null;
        field1973 = null;
        if (arg0 < 122) {
            field1972 = 47;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I", line = 34)
    public final int[] method90(int arg0, int arg1) {
        ++field1974;
        int[] var3 = super.field3808.method958((byte) 73, arg0);
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(class301.field4265 & arg0 - 1, (byte) -99, 0);
            int[] var5 = this.method1788(arg0, (byte) -8, 0);
            int[] var6 = this.method1788(arg0 - -1 & class301.field4265, (byte) -82, 0);
            for (int var7 = 0; var7 < class478.field6792; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1971;
                int var9 = (var5[var7 + 1 & class205.field3007] + -var5[class205.field3007 & var7 + -1]) * this.field1971;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return arg1 != 21034 ? null : var3;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIII)V", line = 87)
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1975;
        if (arg1 != -22806) {
            method1021((class183) null, -95, -60, 52, (boolean[]) null);
        }
        if (~arg3 == ~arg8 && ~arg4 == ~arg9 && arg0 == arg7 && ~arg2 == ~arg6) {
            class371.method2266(arg8, arg9, arg0, -17232, arg5, arg2);
        } else {
            int var10 = arg8;
            int var11 = arg9;
            int var12 = arg8 * 3;
            int var13 = arg9 * 3;
            int var14 = arg3 * 3;
            int var15 = arg4 * 3;
            int var16 = arg7 * 3;
            int var17 = arg6 * 3;
            int var18 = arg0 - (var16 - var14 - -arg8);
            int var19 = -arg9 + var15 + arg2 + -var17;
            int var20 = -var14 + -var14 + var12 + var16;
            int var21 = -var15 + var17 + -var15 + var13;
            int var22 = -var12 + var14;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 - -var31 >> 12) + arg8;
                int var34 = (var28 - -var30 - -var32 >> 12) + arg9;
                class371.method2266(var10, var11, var33, arg1 ^ 6746, arg5, var34);
                var11 = var34;
                var10 = var33;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 164)
    public class141() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V", line = 177)
    public static final void method1020(int arg0) {
        ++field1968;
        if (class421.field5826 < 1024.0F) {
            class421.field5826 = 1024.0F;
        }
        if (class421.field5826 > 3072.0F) {
            class421.field5826 = 3072.0F;
        }
        while (class91.field1281 >= 16384.0F) {
            class91.field1281 -= 16384.0F;
        }
        while (class91.field1281 < 0.0F) {
            class91.field1281 += 16384.0F;
        }
        int var1 = class279.field4006 >> 7;
        int var2 = class108.field1520 >> 7;
        int var3 = class407.method2440(class279.field4006, -16490, class108.field1520, class387.field5306);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && ~var1 > -101 && var2 < 100) {
            for (int var5 = var1 + -4; var5 <= var1 + 4; ++var5) {
                for (int var6 = var2 + -4; var2 + 4 >= var6; ++var6) {
                    int var7 = class387.field5306;
                    if (~var7 > -4 && class94.method783(var5, (byte) -104, var6)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class311.field4402.field4462 != null && class311.field4402.field4462[var7] != null) {
                        var8 = (255 & class311.field4402.field4462[var7][var5][var6]) * 8;
                    }
                    int var9 = -class340.field4692[var7].method591(var5, var6) - -var8 + var3;
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (~var10 > -262145) {
            var10 = 262144;
        }
        if (arg0 == -101) {
            if (var10 <= class334.field4649) {
                if (~class334.field4649 < ~var10) {
                    class334.field4649 += (-class334.field4649 + var10) / 80;
                    return;
                }
            } else {
                class334.field4649 += (-class334.field4649 + var10) / 24;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ldh;III[Z)V", line = 261)
    public static final void method1021(class183 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class427.field5960 != class340.field4692) {
            int var5 = class190.field2858[arg1].method590(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class241 var7 = class190.field2858[var6];
                    if (var7 != null) {
                        var7.method589(arg0, arg2, var5 - var7.method590(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }
}
