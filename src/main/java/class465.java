import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class465 extends class747 {

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "[[I")
    public static int[][] field6468 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "Lkr;")
    public static class602 field6467 = new class602(110, 20);

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "Ljava/lang/Object;")
    public static volatile Object field6471 = null;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method182(int arg0, int arg1) {
        ++field6466;
        if (arg1 >= -89) {
            this.method183((class63) null, -85, -49);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int[] var4 = this.method4156(-121, arg0, 0);
            int[] var5 = this.method4156(-115, arg0, 1);
            int[] var6 = this.method4156(-124, arg0, 2);
            for (int var7 = 0; ~var7 > ~class73.field1095; ++var7) {
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

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)[[I", line = 58)
    public final int[][] method688(int arg0, int arg1) {
        ++field6472;
        int[][] var3 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int[] var4 = this.method4156(-122, arg1, 2);
            int[][] var5 = this.method4158(0, arg1, 2);
            int[][] var6 = this.method4158(1, arg1, 2);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class73.field1095; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        int var19 = 66 / ((35 - arg0) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 136)
    public class465() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ldc;II)V", line = 148)
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field6470;
        if (arg1 == 11608) {
            if (arg2 == 0) {
                super.field10281 = arg0.method505((byte) -119) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 161)
    public static void method2845(int arg0) {
        field6468 = null;
        field6467 = null;
        if (arg0 <= 61) {
            method2845(71);
        }
        field6471 = null;
    }
}
