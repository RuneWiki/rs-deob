import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class194 extends class59 {

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "Z")
    private boolean field3844 = true;

    @OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
    private int field3853 = 4096;

    @OriginalMember(owner = "client!ve", name = "ab", descriptor = "Lsd;")
    public static class166 field3850 = class135.method935("scrollbar", 0);

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lsd;")
    public static class166 field3848 = class135.method935(" zuerst von Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    public static int field3849 = 0;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field3842 = 0;

    @OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "Lv;")
    public static class189 field3845;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "Lf;")
    public static class47 field3847;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field3843;
        if (!arg0) {
            method1297(1);
        }
        int[][] var3 = super.field1207.method528(71, arg1);
        if (super.field1207.field1320) {
            int[] var4 = this.method499(0, arg1 + -1 & class137.field2679, 0);
            int[] var5 = this.method499(0, arg1, 0);
            int[] var6 = this.method499(0, arg1 + 1 & class137.field2679, 0);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class98.field1879; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3853;
                int var12 = var11 >> 12;
                int var13 = (var5[class187.field3571 & var10 + 1] - var5[class187.field3571 & var10 + -1]) * this.field3853;
                int var14 = var13 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var12 * var12 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((var16 + 4096 + var15) / 4096)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = var13 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field3844) {
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var9[var10] = var19;
                var7[var10] = var18;
                var8[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field3846;
        if (arg1 >= 18) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    this.field3844 = ~arg0.method400(255) == -2;
                }
            } else {
                this.field3853 = arg0.method405(2);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public static void method1297(int arg0) {
        field3845 = null;
        if (arg0 >= -118) {
            method1297(-7);
        }
        field3847 = null;
        field3850 = null;
        field3848 = null;
    }
}
