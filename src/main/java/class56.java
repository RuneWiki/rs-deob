import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class56 extends class89 {

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    private int field944 = 4096;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    private int field946 = 4096;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    private int field951 = 4096;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "Lda;")
    public static class275 field942 = class255.method1672(95, "mapfunction");

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "Lma;")
    public static class105 field947;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "Lm;")
    public static class38 field940;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field950;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field951 = arg1.method608(121);
                }
            } else {
                this.field946 = arg1.method608(79);
            }
        } else {
            this.field944 = arg1.method608(106);
        }
        if (arg0 != -20503) {
            this.method21(false, 97);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method21(boolean arg0, int arg1) {
        ++field941;
        if (!arg0) {
            this.method49(-123, (class85) null, -59);
        }
        int[][] var3 = super.field1512.method824(arg1, (byte) -33);
        if (super.field1512.field2007) {
            int[][] var4 = this.method648(true, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class65.field1070; ++var11) {
                int var12 = var9[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var12 == var14) {
                    var6[var11] = this.field944 * var13 >> 12;
                    var8[var11] = this.field946 * var12 >> 12;
                    var10[var11] = this.field951 * var14 >> 12;
                } else {
                    var6[var11] = this.field944;
                    var8[var11] = this.field946;
                    var10[var11] = this.field951;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
    public static final int method353(boolean arg0) {
        if (!arg0) {
            field948 = 3;
        }
        ++field949;
        return 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I[III[I)V")
    public static final void method354(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg3 > -113) {
            method353(true);
        }
        if (~arg0 < ~arg2) {
            int var5 = arg2;
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; ~arg0 < ~var9; ++var9) {
                if (~((1 & var9) + var7) > ~arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg1[arg0] = arg1[var5];
            arg1[var5] = var7;
            arg4[arg0] = arg4[var5];
            arg4[var5] = var8;
            method354(var5 + -1, arg1, arg2, -117, arg4);
            method354(arg0, arg1, var5 + 1, -115, arg4);
        }
        ++field945;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
    public static void method355(boolean arg0) {
        field942 = null;
        field947 = null;
        field940 = null;
        if (!arg0) {
            method355(true);
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, false);
    }
}
