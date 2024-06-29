import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class171 extends class105 {

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "Z")
    public static boolean field3089 = false;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "Ldg;")
    public static class276 field3088 = new class276(64);

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    private static int field3091 = 3353893;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "Lvf;")
    private static class265 field3090 = class87.method582(-46, "Attack");

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lvf;")
    public static class265 field3093 = field3090;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Z")
    public static boolean field3092 = false;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field3094 = 0;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ)V")
    public static final void method1127(byte arg0, boolean arg1) {
        ++field3084;
        if (!arg1 == class281.field4956) {
            if (arg0 < 87) {
                method1129(-4, 73, 117, -4, -56, 83);
            }
            class281.field4956 = arg1;
            class200.method1380(-1);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        if (arg1 > -110) {
            this.method12(37, 24, (class135) null);
        }
        int[][] var3 = super.field1870.method569((byte) -112, arg0);
        if (super.field1870.field1567) {
            int[] var4 = this.method705(arg0, (byte) -62, 2);
            int[][] var5 = this.method702((byte) 94, arg0, 0);
            int[][] var6 = this.method702((byte) 94, arg0, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class94.field1668; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        ++field3086;
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
    public static void method1128(boolean arg0) {
        field3093 = null;
        field3088 = null;
        if (!arg0) {
            field3090 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public static final void method1129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class2.field30[0].method277(arg2, arg1);
        class2.field30[1].method277(arg2, arg1 + -16 + arg0);
        int var6 = (arg0 + -32) * arg0 / arg3;
        if (~var6 > -9) {
            var6 = 8;
        }
        ++field3080;
        int var7 = (-var6 + arg0 + -32) * arg5 / (arg3 - arg0);
        class35.method295(arg2, arg1 + 16, 16, arg0 + -32, class211.field3798);
        class35.method295(arg2, arg1 + arg4 + var7, 16, var6, class40.field913);
        class35.method297(arg2, arg1 + var7 + 16, var6, class269.field4786);
        class35.method297(arg2 + 1, arg1 - -var7 + 16, var6, class269.field4786);
        class35.method283(arg2, var7 + 16 + arg1, 16, class269.field4786);
        class35.method283(arg2, arg1 + 17 - -var7, 16, class269.field4786);
        class35.method297(arg2 + 15, arg1 + var7 + 16, var6, field3091);
        class35.method297(arg2 - -14, arg1 + var7 - -17, var6 + -1, field3091);
        class35.method283(arg2, arg1 - (-var7 + -15) + var6, 16, field3091);
        class35.method283(arg2 + 1, arg1 - (-var7 + -14) + var6, 15, field3091);
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        ++field3081;
        try {
            if (class216.field3899 == 1) {
                int var1 = class270.field4818.method198(31);
                if (var1 > 0 && class270.field4818.method177((byte) -111)) {
                    int var2 = var1 - class55.field1127;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class270.field4818.method190(-386301040, var2);
                    return;
                }
                class270.field4818.method193(0);
                class270.field4818.method179(4);
                class31.field785 = null;
                class245.field4272 = null;
                if (class125.field2245 == null) {
                    class216.field3899 = 0;
                } else {
                    class216.field3899 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class270.field4818.method193(0);
            class31.field785 = null;
            class125.field2245 = null;
            class245.field4272 = null;
            class216.field3899 = 0;
        }
        if (arg0 > -18) {
            method1128(true);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIILfl;I)V")
    public static final void method1131(int arg0, boolean arg1, int arg2, int arg3, class192 arg4, int arg5) {
        class186.field3372 = arg5;
        class219.field3957 = arg1;
        class120.field2114 = arg3;
        class125.field2245 = arg4;
        class29.field745 = arg0;
        class55.field1127 = arg2;
        ++field3087;
        class216.field3899 = 1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field3079;
        if (~arg0 == -1) {
            super.field1853 = arg2.method920((byte) 72) == 1;
        }
        if (arg1 != 255) {
            field3089 = false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field3083;
        if (arg0 != 8055) {
            field3092 = true;
        }
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int[] var4 = this.method705(arg1, (byte) -76, 0);
            int[] var5 = this.method705(arg1, (byte) -108, 1);
            int[] var6 = this.method705(arg1, (byte) -65, 2);
            for (int var7 = 0; ~class94.field1668 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class171() {
        super(3, false);
    }
}
