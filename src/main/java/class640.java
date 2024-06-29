import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class640 extends class585 {

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
    private int field8969 = 4096;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "I")
    public static int field8968 = -1;

    @OriginalMember(owner = "client!jaa", name = "J", descriptor = "Loo;")
    public static class652 field8972 = new class652(5);

    @OriginalMember(owner = "client!jaa", name = "K", descriptor = "Lgb;")
    public static class226 field8973 = new class226();

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(B)V")
    public static void method3653(byte arg0) {
        int var1 = -76 / ((arg0 - -19) / 60);
        field8973 = null;
        field8972 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lda;)V")
    public static final void method3654(class66 arg0) {
        class679.field9437 = arg0;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZIIIIIIF)[[I")
    public static final int[][] method3655(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        ++field8970;
        int[][] var9 = new int[arg3][arg2];
        class198 var10 = new class198();
        var10.field3033 = arg6;
        var10.field3021 = arg0;
        var10.field3027 = arg7;
        var10.field3019 = (int) ((float) arg5 * arg8);
        var10.field3023 = arg1;
        var10.method52(-4096);
        class686.method3867(-9851, arg3, arg2);
        for (int var11 = 0; arg3 > var11; ++var11) {
            var10.method1369(110, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
    public class640() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field8971;
        if (~arg2 == -1) {
            this.field8969 = arg0.method2998(true);
        }
        if (arg1 != 1) {
            this.method55(-46, -33);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field8967;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-128, 0, class305.field4391 & arg0 + -1);
            int[] var5 = this.method3415(-128, 0, arg0);
            int[] var6 = this.method3415(-128, 0, arg0 + 1 & class305.field4391);
            for (int var7 = 0; ~var7 > ~class293.field4278; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field8969;
                int var9 = (var5[var7 + 1 & class625.field8759] + -var5[class625.field8759 & var7 + -1]) * this.field8969;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg1 < 123) {
            field8968 = -4;
        }
        return var3;
    }
}
