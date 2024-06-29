import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class155 extends class189 {

    @OriginalMember(owner = "client!rb", name = "rb", descriptor = "I")
    private int field3244 = 32768;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "Lgg;")
    private static class63 field3234 = class116.method911(43, "Please reload this page)3");

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "Lgg;")
    private static class63 field3238 = class116.method911(43, "wishes to trade with you)3");

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lgg;")
    public static class63 field3233 = field3234;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "Lgg;")
    public static class63 field3237 = field3238;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "Lgg;")
    private static class63 field3235 = class116.method911(43, "Please use a different world)3");

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "Lgg;")
    public static class63 field3240 = field3235;

    @OriginalMember(owner = "client!rb", name = "wb", descriptor = "Lgg;")
    public static class63 field3249 = class116.method911(43, "::fpson");

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "Lgg;")
    public static class63 field3242 = field3235;

    @OriginalMember(owner = "client!rb", name = "yb", descriptor = "Lgg;")
    public static class63 field3251 = class116.method911(43, "<col=ffffff>");

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "Lgg;")
    public static class63 field3239 = class116.method911(43, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "Lgg;")
    public static class63 field3236 = class116.method911(43, "::fps ");

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!rb", name = "qb", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!rb", name = "sb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!rb", name = "tb", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!rb", name = "vb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!rb", name = "xb", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!rb", name = "zb", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!rb", name = "Ab", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!rb", name = "ub", descriptor = "Lmc;")
    public static class111 field3247;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3243;
        int[] var3 = super.field3825.method681(arg1, (byte) -40);
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(1, arg1, 11433);
            int[] var5 = this.method1245(2, arg1, 11433);
            for (int var6 = 0; var6 < class54.field1430; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3244 >> 12;
                int var9 = class30.field773[var7] * var8 >> 12;
                int var10 = var6 - -(var9 >> 12) & class75.field1867;
                int var11 = class183.field3716[var7] * var8 >> 12;
                int var12 = class1.field4 & arg1 - -(var11 >> 12);
                int[] var13 = this.method1245(0, var12, 11433);
                var3[var6] = var13[var10];
            }
        }
        if (arg0 != 0) {
            this.method84(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class155() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 > 32) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    super.field3811 = arg2.method64(31790) == 1;
                }
            } else {
                this.field3244 = arg2.method46((byte) 65) << 4;
            }
            ++field3250;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)V")
    public static void method1077(byte arg0) {
        if (arg0 >= -2) {
            field3235 = null;
        }
        field3238 = null;
        field3239 = null;
        field3237 = null;
        field3235 = null;
        field3242 = null;
        field3234 = null;
        field3236 = null;
        field3240 = null;
        field3233 = null;
        field3247 = null;
        field3251 = null;
        field3249 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        ++field3246;
        if (!arg0) {
            field3249 = null;
        }
        class166.method1123(100);
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
    public static final void method1078(byte arg0) {
        ++field3241;
        if (arg0 == 10) {
            for (class132 var1 = (class132) class133.field2885.method699(-10679); var1 != null; var1 = (class132) class133.field2885.method701(120)) {
                int var2 = var1.field2865;
                if (class144.method1026((byte) -126, var2)) {
                    boolean var3 = true;
                    class54[] var4 = class23.field539[var2];
                    for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                        if (var4[var5] != null) {
                            var3 = var4[var5].field1336;
                            break;
                        }
                    }
                    if (!var3) {
                        int var6 = (int) var1.field3612;
                        class54 var7 = class59.method555(var6, arg0 ^ 32167);
                        if (var7 != null) {
                            class113.method901(0, var7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3252;
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (arg1 <= 34) {
            return null;
        } else {
            if (super.field3808.field561) {
                int[] var4 = this.method1245(1, arg0, 11433);
                int[] var5 = this.method1245(2, arg0, 11433);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~class54.field1430 < ~var9; ++var9) {
                    int var10 = (1046571 & var4[var9] * 255) >> 12;
                    int var11 = var5[var9] * this.field3244 >> 12;
                    int var12 = class30.field773[var10] * var11 >> 12;
                    int var13 = class183.field3716[var10] * var11 >> 12;
                    int var14 = class75.field1867 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg0 & class1.field4;
                    int[][] var16 = this.method1244((byte) 20, var15, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }
}
