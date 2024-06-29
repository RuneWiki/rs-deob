import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class286 extends class512 {

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    private int field4682 = 4096;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    private int field4689 = 409;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "[I")
    private int[] field4686 = new int[3];

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    private int field4691 = 4096;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    private int field4688 = 4096;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "[I")
    public static int[] field4683 = new int[2];

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "[I")
    public static int[] field4690 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
    public class286() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        int var3 = -37 % ((arg0 - -40) / 47);
        ++field4681;
        int[][] var4 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 64, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class402.field6113; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field4686[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~this.field4689 > ~var14) {
                    var9[var12] = var13;
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field4686[1];
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~this.field4689 > ~var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field4686[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (var18 > this.field4689) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field4691 * var13 >> 12;
                            var10[var12] = this.field4688 * var15 >> 12;
                            var11[var12] = this.field4682 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;BLia;)I")
    public static final int method1861(String arg0, byte arg1, class23 arg2) {
        ++field4685;
        if (arg1 != 53) {
            method1863(-46);
        }
        int var3 = arg2.field301;
        byte[] var4 = class251.method1697(arg1 ^ 2883861, arg0);
        arg2.method124(var4.length, arg1 + -53);
        arg2.field301 += class298.field4798.method1323(var4, 0, arg2.field302, arg2.field301, var4.length, 0);
        return -var3 + arg2.field301;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field4687;
        if (arg0) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 == -5) {
                                int var5 = arg2.method181(106);
                                this.field4686[2] = class344.method2224(0, var5 >> 12);
                                this.field4686[1] = class344.method2224(var5 >> 4, 4080);
                                this.field4686[0] = class344.method2224(16711680, var5) << 4;
                            }
                        } else {
                            this.field4691 = arg2.method132(26);
                        }
                    } else {
                        this.field4688 = arg2.method132(87);
                    }
                } else {
                    this.field4682 = arg2.method132(112);
                }
            } else {
                this.field4689 = arg2.method132(105);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V")
    public static void method1862(boolean arg0) {
        field4690 = null;
        field4683 = null;
        if (!arg0) {
            field4690 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)V")
    public static final void method1863(int arg0) {
        ++field4684;
        if (arg0 == 47) {
            if (class305.field4873 != null) {
                class20.field221.method566(true);
                class337.method2131();
                class104.method714(-1);
                class481.method2830(-38);
                class394.method2465(-22670);
                class176.method1191((byte) -113);
                if (class162.field2571 != null) {
                    class162.field2571.method2491(16383);
                }
                class510.method3005(116);
                class416.method2565((byte) -49);
                class423.method2592((byte) -95);
                class118.method942(false, 25616);
                class66.method429((byte) -125);
                for (int var1 = 0; ~var1 > -2049; ++var1) {
                    class166 var5 = class435.field6489[var1];
                    if (var5 != null) {
                        var5.field3161 = null;
                        for (int var6 = 0; var6 < var5.field3160.length; ++var6) {
                            var5.field3160[var6] = null;
                        }
                    }
                }
                for (int var2 = 0; ~var2 > ~class353.field5506; ++var2) {
                    class265 var3 = class393.field6008[var2].field7355;
                    if (var3 != null) {
                        for (int var4 = 0; ~var3.field3160.length < ~var4; ++var4) {
                            var3.field3160[var4] = null;
                        }
                    }
                }
                class350.field5472 = null;
                class71.field1242 = null;
                class305.field4873.method2867((byte) -82);
                class305.field4873 = null;
            }
        }
    }
}
