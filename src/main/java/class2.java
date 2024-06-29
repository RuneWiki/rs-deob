import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class634 {

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    private int field12 = 4096;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
    private int field16 = 4096;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    private int field11 = 4096;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "Ljava/util/Calendar;")
    public static Calendar field10 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field14;
        if (arg2) {
            field9 = -82;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field11 = arg1.method1476(-123);
                }
            } else {
                this.field12 = arg1.method1476(-74);
            }
        } else {
            this.field16 = arg1.method1476(-116);
        }
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V")
    public static void method4(int arg0) {
        if (arg0 != 14049) {
            field10 = null;
        }
        field10 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lha;I)V")
    public static final void method5(class58 arg0, int arg1) {
        ++field8;
        int var2 = 0;
        int var3 = 0;
        if (class397.field5443) {
            var2 = class389.method2400(102);
            var3 = class752.method4192(1);
        }
        int var4 = class655.field9351 + var2;
        int var5 = class183.field2187 + var3;
        int var6 = class236.field2806;
        int var7 = class542.field7804 - 3;
        byte var8 = 20;
        class395.method2422(class236.field2806, class542.field7804, class183.field2187 + var3, true, class655.field9351 - -var2, class486.field6928.method2936(class489.field6978, -84), arg0, var8);
        int var9 = class353.field4537.method694((byte) 121) - -var2;
        if (arg1 == -1) {
            int var10 = var3 + class353.field4537.method691((byte) -125);
            if (class260.field3231) {
                int var11 = 0;
                for (class177 var12 = (class177) class331.field4291.method2067(22462); var12 != null; var12 = (class177) class331.field4291.method2066(0)) {
                    int var16 = var11 * 16 + var5 + var8 + 13;
                    if (var9 > class655.field9351 - -var2 && var9 < class655.field9351 - -class236.field2806 + var2 && var16 + -13 < var10 && var16 - -4 > var10 && (var12.field2078 > 1 || ((class649) var12.field2081.field4488.field8923).field9275)) {
                        arg0.method370(class655.field9351 + var2, var16 + -12, class236.field2806, 16, 255 - class331.field4297 << 24 | class578.field8173, 1);
                    }
                    ++var11;
                }
                if (class336.field4322 != null) {
                    int var13 = 0;
                    class395.method2422(class750.field10484, class134.field1515, class210.field2484, true, class330.field4283, class336.field4322.field2080, arg0, var8);
                    for (class649 var14 = (class649) class336.field4322.field2081.method2067(22462); var14 != null; var14 = (class649) class336.field4322.field2081.method2066(0)) {
                        int var15 = var8 - -13 + class210.field2484 - -(var13 * 16);
                        if (var9 > class330.field4283 && class750.field10484 + class330.field4283 > var9 && ~var10 < ~(var15 + -13) && ~var10 > ~(var15 + 4) && var14.field9275) {
                            arg0.method370(class330.field4283, var15 - 12, class750.field10484, 16, class578.field8173 | -class331.field4297 + 255 << 24, 1);
                        }
                        ++var13;
                    }
                    class647.method3687(-28759, var8, class330.field4283, class750.field10484, arg0, class210.field2484, class134.field1515);
                }
            } else {
                int var17 = 0;
                for (class649 var18 = (class649) class265.field3289.method1719(65280); var18 != null; var18 = (class649) class265.field3289.method1723(-20665)) {
                    int var28 = (-var17 + -1 + class343.field4449) * 16 + var5 + var8 + 13;
                    if (class655.field9351 - -var2 < var9 && class655.field9351 + var2 + class236.field2806 > var9 && var10 > var28 + -13 && var28 - -4 > var10 && var18.field9275) {
                        arg0.method370(class655.field9351 + var2, var28 + -12, class236.field2806, 16, class578.field8173 | -class331.field4297 + 255 << 24, 1);
                    }
                    ++var17;
                }
            }
            class647.method3687(-28759, var8, class655.field9351 - -var2, class236.field2806, arg0, class183.field2187 + var3, class542.field7804);
            if (!class260.field3231) {
                int var19 = 0;
                for (class649 var20 = (class649) class265.field3289.method1719(65280); var20 != null; var20 = (class649) class265.field3289.method1723(-20665)) {
                    int var21 = (-var19 + -1 + class343.field4449) * 16 + var5 - -var8 + 13;
                    class215.method1260(var5, var20, -16777216 | class697.field9813, class12.field98 | -16777216, var9, var6, var4, arg0, -2, var7, var10, var21);
                    ++var19;
                }
            } else {
                int var22 = 0;
                for (class177 var23 = (class177) class331.field4291.method2067(22462); var23 != null; var23 = (class177) class331.field4291.method2066(0)) {
                    int var27 = var22 * 16 + 13 + class183.field2187 + var3 + var8;
                    ++var22;
                    if (~var23.field2078 != -2) {
                        class320.method1914(arg0, 0, class183.field2187 + var3, var23, var27, class12.field98 | -16777216, class655.field9351 + var2, class236.field2806, class697.field9813 | -16777216, class542.field7804, var9, var10);
                    } else {
                        class215.method1260(class183.field2187 - -var3, (class649) var23.field2081.field4488.field8923, class697.field9813 | -16777216, class12.field98 | -16777216, var9, class236.field2806, class655.field9351 + var2, arg0, -2, class542.field7804, var10, var27);
                    }
                }
                if (class336.field4322 != null) {
                    int var24 = 0;
                    for (class649 var25 = (class649) class336.field4322.field2081.method2067(22462); var25 != null; var25 = (class649) class336.field4322.field2081.method2066(0)) {
                        int var26 = var24 * 16 + class210.field2484 + 13 + var8;
                        class215.method1260(class210.field2484, var25, class697.field9813 | -16777216, class12.field98 | -16777216, var9, class750.field10484, class330.field4283, arg0, arg1 ^ 1, class134.field1515, var10, var26);
                        ++var24;
                    }
                    class193.method1172(class750.field10484, class210.field2484, class134.field1515, (byte) -39, class330.field4283);
                }
            }
            class193.method1172(class236.field2806, class183.field2187 + var3, class542.field7804, (byte) -99, class655.field9351 + var2);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)Z")
    public static final boolean method6(int arg0, boolean arg1) {
        ++field15;
        if (arg1) {
            method6(93, false);
        }
        return arg0 == 0 || ~arg0 == -2 || ~arg0 == -3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)[[I")
    public final int[][] method7(byte arg0, int arg1) {
        ++field13;
        int[][] var3 = super.field9126.method132(0, arg1);
        int var4 = 20 / ((arg0 - -56) / 53);
        if (super.field9126.field295) {
            int[][] var5 = this.method3642(0, arg1, true);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class635.field9139 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (~var13 == ~var14 && var14 == var15) {
                    var9[var12] = this.field16 * var13 >> 12;
                    var10[var12] = this.field12 * var14 >> 12;
                    var11[var12] = this.field11 * var15 >> 12;
                } else {
                    var9[var12] = this.field16;
                    var10[var12] = this.field12;
                    var11[var12] = this.field11;
                }
            }
        }
        return var3;
    }
}
