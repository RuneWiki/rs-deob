import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ug")
public class class191 extends class85 {

    @OriginalMember(owner = "ug", name = "T", descriptor = "Z")
    private boolean field3651 = true;

    @OriginalMember(owner = "ug", name = "X", descriptor = "I")
    private int field3655 = 4096;

    @OriginalMember(owner = "ug", name = "V", descriptor = "Llf;")
    public static class109 field3653 = class35.method275("leuchten3:", 2);

    @OriginalMember(owner = "ug", name = "Y", descriptor = "Lrc;")
    public static class160 field3656 = new class160(64);

    @OriginalMember(owner = "ug", name = "eb", descriptor = "Llf;")
    public static class109 field3662 = class35.method275("(U3", 2);

    @OriginalMember(owner = "ug", name = "Z", descriptor = "Llf;")
    public static class109 field3657 = class35.method275(":assistreq:", 2);

    @OriginalMember(owner = "ug", name = "cb", descriptor = "Llf;")
    public static class109 field3660 = class35.method275("0(U", 2);

    @OriginalMember(owner = "ug", name = "bb", descriptor = "I")
    public static int field3659 = 0;

    @OriginalMember(owner = "ug", name = "fb", descriptor = "Llf;")
    public static class109 field3663 = class35.method275("b12_full", 2);

    @OriginalMember(owner = "ug", name = "db", descriptor = "Llf;")
    private static class109 field3661 = class35.method275("You have only just left another world)3", 2);

    @OriginalMember(owner = "ug", name = "ab", descriptor = "Llf;")
    public static class109 field3658 = field3661;

    @OriginalMember(owner = "ug", name = "Q", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "ug", name = "R", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "ug", name = "S", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "ug", name = "U", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "ug", name = "W", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "ug", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg0 >= -120) {
            method1288(57);
        }
        ++field3654;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field3651 = ~arg2.method598((byte) 99) == -2;
            }
        } else {
            this.field3655 = arg2.method569(true);
        }
    }

    @OriginalMember(owner = "ug", name = "d", descriptor = "(B)V")
    public static final void method1287(byte arg0) {
        int var1 = 39 % ((36 - arg0) / 45);
        class88.field1836 = null;
        class103.field2044 = null;
        class106.field2110 = null;
        class187.field3577 = null;
        class185.field3522 = null;
        class40.field846 = null;
        class59.field1173 = null;
        class35.field781 = null;
        class142.field2745 = null;
        class9.field123 = null;
        class204.field4018 = null;
        ++field3652;
    }

    @OriginalMember(owner = "ug", name = "e", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field3658 = null;
        field3662 = null;
        field3657 = null;
        field3656 = null;
        field3660 = null;
        if (arg0 <= 68) {
            method1288(-46);
        }
        field3663 = null;
        field3661 = null;
        field3653 = null;
    }

    @OriginalMember(owner = "ug", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        if (arg1 != 2177) {
            return null;
        } else {
            ++field3648;
            int[][] var3 = super.field1719.method673((byte) -128, arg0);
            if (super.field1719.field1926) {
                int[] var4 = this.method540(arg0 + -1 & class150.field2892, 124, 0);
                int[] var5 = this.method540(arg0, 7, 0);
                int[] var6 = this.method540(arg0 + 1 & class150.field2892, arg1 ^ 2236, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; ~class57.field1152 < ~var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field3655;
                    int var12 = (var5[var10 + 1 & class29.field624] + -var5[var10 + -1 & class29.field624]) * this.field3655;
                    int var13 = var12 >> 12;
                    int var14 = var13 * var13 >> 12;
                    int var15 = var11 >> 12;
                    int var16 = var15 * var15 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((var14 - -var16 + 4096) / 4096)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = 16777216 / var17;
                        var19 = var12 / var17;
                        var20 = var11 / var17;
                    } else {
                        var19 = 0;
                        var20 = 0;
                        var18 = 0;
                    }
                    if (this.field3651) {
                        var19 = 2048 - -(var19 >> 1);
                        var20 = 2048 - -(var20 >> 1);
                        var18 = 2048 - -(var18 >> 1);
                    }
                    var7[var10] = var19;
                    var8[var10] = var20;
                    var9[var10] = var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "ug", name = "<init>", descriptor = "()V")
    public class191() {
        super(1, false);
    }
}
