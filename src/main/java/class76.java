import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class76 extends class11 {

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "[I")
    public static int[] field1018 = new int[6];

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "Ldn;")
    public static class357 field1014 = new class357("WTWIP", 3);

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field1021 = 100;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class76() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field1016;
        int var3 = 67 / ((arg0 - -75) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[] var5 = this.method48(arg1, 2, (byte) -66);
            int[][] var6 = this.method49(arg1, 0, 120);
            int[][] var7 = this.method49(arg1, 1, 124);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; class90.field1316 > var17; ++var17) {
                int var18 = var5[var17];
                if (var18 != 4096) {
                    if (var18 == 0) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                    } else {
                        int var19 = 4096 - var18;
                        var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                        var9[var17] = var12[var17] * var18 - -(var15[var17] * var19) >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                    }
                } else {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field1020;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 0, (byte) -112);
            int[] var5 = this.method48(arg1, 1, (byte) -127);
            int[] var6 = this.method48(arg1, 2, (byte) -102);
            for (int var7 = 0; class90.field1316 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
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
        if (arg0 >= -42) {
            this.method44(3, -73);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 <= -40) {
            if (~arg2 == -1) {
                super.field167 = arg0.method2348(-2) == 1;
            }
            ++field1022;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method606(int arg0, String arg1) {
        ++field1017;
        if (arg1 != null) {
            if ((class174.field2588 < 100 || class217.field3019) && ~class174.field2588 > -201) {
                String var2 = class525.method3124(false, arg1);
                if (var2 != null) {
                    for (int var3 = 0; ~var3 > ~class174.field2588; ++var3) {
                        String var7 = class525.method3124(false, class258.field3597[var3]);
                        if (var7 != null && var7.equals(var2)) {
                            class49.method438(arg1 + class471.field6882.method2731(arg0 ^ -247, class372.field5455), (byte) -114);
                            return;
                        }
                        if (class473.field6913[var3] != null) {
                            String var8 = class525.method3124(false, class473.field6913[var3]);
                            if (var8 != null && var8.equals(var2)) {
                                class49.method438(arg1 + class471.field6882.method2731(62, class372.field5455), (byte) -92);
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; ~class18.field235 < ~var4; ++var4) {
                        String var5 = class525.method3124(false, class165.field2479[var4]);
                        if (var5 != null && var5.equals(var2)) {
                            class49.method438(class256.field3562.method2731(62, class372.field5455) + arg1 + class118.field1763.method2731(62, class372.field5455), (byte) -87);
                            return;
                        }
                        if (class413.field6031[var4] != null) {
                            String var6 = class525.method3124(false, class413.field6031[var4]);
                            if (var6 != null && var6.equals(var2)) {
                                class49.method438(class256.field3562.method2731(62, class372.field5455) + arg1 + class118.field1763.method2731(62, class372.field5455), (byte) -101);
                                return;
                            }
                        }
                    }
                    if (class525.method3124(false, class316.field4324.field6421).equals(var2)) {
                        class49.method438(class440.field6506.method2731(62, class372.field5455), (byte) -127);
                    } else {
                        ++class153.field2341;
                        if (arg0 != -201) {
                            method607(-71, -108);
                        }
                        class491.method2878((byte) 92, class292.field4038);
                        class481.field7027.method2302(-4, class252.method1507(arg1, true));
                        class481.field7027.method2349(arg1, true);
                    }
                }
            } else {
                class49.method438(class202.field2846.method2731(62, class372.field5455), (byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)I")
    public static final int method607(int arg0, int arg1) {
        ++field1015;
        if (arg0 < 96) {
            return 0;
        } else if (~arg0 > -129) {
            return 2;
        } else {
            if (arg1 != -20636) {
                field1018 = null;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)V")
    public static void method608(boolean arg0) {
        field1018 = null;
        if (arg0) {
            field1014 = null;
        }
    }
}
