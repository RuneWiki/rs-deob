import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class246 extends class56 {

    @OriginalMember(owner = "client!cca", name = "D", descriptor = "I")
    private int field3281 = 4096;

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "Z")
    private boolean field3288 = true;

    @OriginalMember(owner = "client!cca", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3287 = null;

    @OriginalMember(owner = "client!cca", name = "J", descriptor = "Lpw;")
    public static class705 field3286 = new class705();

    @OriginalMember(owner = "client!cca", name = "E", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!cca", name = "G", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!cca", name = "H", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!cca", name = "I", descriptor = "[I")
    public static int[] field3285;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILee;I)V")
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3288 = ~arg1.method3750((byte) 35) == -2;
            }
        } else {
            this.field3281 = arg1.method3757((byte) -65);
        }
        if (arg0 != 3731) {
            this.method6(43, (class675) null, -45);
        }
        ++field3284;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)[[I")
    public final int[][] method5(int arg0, int arg1) {
        ++field3282;
        int[][] var3 = super.field668.method3009(arg1 + -1, arg0);
        if (arg1 != 1) {
            this.method5(-41, 41);
        }
        if (super.field668.field7292) {
            int[] var4 = this.method367(4463, 0, class636.field8759 & arg0 + -1);
            int[] var5 = this.method367(arg1 ^ 4462, 0, arg0);
            int[] var6 = this.method367(4463, 0, arg0 + 1 & class636.field8759);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class328.field4576; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3281;
                int var12 = (var5[class445.field6318 & var10 - -1] + -var5[var10 + -1 & class445.field6318]) * this.field3281;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field3288) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var20 = 2048 - -(var20 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
    public static void method1569(boolean arg0) {
        field3286 = null;
        field3285 = null;
        if (!arg0) {
            method1569(false);
        }
        field3287 = null;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
    public class246() {
        super(1, false);
    }
}
