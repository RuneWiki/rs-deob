import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class135 extends class105 {

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "Leh;")
    public static class47 field2655 = class195.method1282((byte) -4, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field2656 = 2301979;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "Leh;")
    public static class47 field2653 = class195.method1282((byte) -4, "<col=80ff00>");

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "Leh;")
    private static class47 field2648 = class195.method1282((byte) -4, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Leh;")
    public static class47 field2649 = field2648;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "Leh;")
    public static class47 field2650 = field2648;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public static final void method982() {
        for (int var0 = 0; var0 < class8.field167; ++var0) {
            for (int var5 = 0; var5 < class103.field2156; ++var5) {
                for (int var6 = 0; var6 < class100.field2102; ++var6) {
                    class173.field3351[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class119.field2418; ++var1) {
            for (int var4 = 0; var4 < class119.field2412[var1]; ++var4) {
                class119.field2414[var1][var4] = null;
            }
            class119.field2412[var1] = 0;
        }
        for (int var2 = 0; var2 < class14.field305; ++var2) {
            class103.field2166[var2] = null;
        }
        class14.field305 = 0;
        for (int var3 = 0; var3 < class147.field2883.length; ++var3) {
            class147.field2883[var3] = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(Z)V")
    public static void method983(boolean arg0) {
        field2650 = null;
        if (!arg0) {
            field2650 = null;
        }
        field2655 = null;
        field2653 = null;
        field2648 = null;
        field2649 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field2652;
        if (arg2 == -256) {
            if (arg0 == 0) {
                super.field2179 = ~arg1.method604((byte) -127) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field2659;
            int[][] var3 = super.field2186.method10(arg0, (byte) 51);
            if (super.field2186.field28) {
                int[] var4 = this.method851(2, arg1, arg0);
                int[][] var5 = this.method854(0, (byte) 30, arg0);
                int[][] var6 = this.method854(1, (byte) -70, arg0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var6[0];
                int[] var13 = var5[2];
                int[] var14 = var6[2];
                int[] var15 = var6[1];
                for (int var16 = 0; ~var16 > ~class149.field2928; ++var16) {
                    int var17 = var4[var16];
                    if (var17 == 4096) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var13[var16];
                    } else if (~var17 == -1) {
                        var7[var16] = var12[var16];
                        var8[var16] = var15[var16];
                        var9[var16] = var14[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var12[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                        var9[var16] = var13[var16] * var17 - -(var14[var16] * var18) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
    public static final boolean method984(int arg0, int arg1) {
        ++field2658;
        if (arg0 >= -56) {
            method985(-99, (int[]) null, -118, -15);
        }
        return ~(1 & arg1 >> 28) != -1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[III)I")
    public static final int method985(int arg0, int[] arg1, int arg2, int arg3) {
        ++field2657;
        if (arg2 != 4096) {
            field2656 = 105;
        }
        return arg1[1] * arg3 + arg1[0] * arg0;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class135() {
        super(3, false);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field2654;
        if (arg1 < 78) {
            field2656 = -118;
        }
        int[] var3 = super.field2192.method336(-78, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            int[] var5 = this.method851(1, true, arg0);
            int[] var6 = this.method851(2, true, arg0);
            for (int var7 = 0; ~class149.field2928 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 == -4097) {
                    var3[var7] = var4[var7];
                } else if (~var8 == -1) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
