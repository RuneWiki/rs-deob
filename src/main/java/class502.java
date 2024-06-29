import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class502 extends class634 {

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    private int field7053 = 4096;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "[[I")
    public static int[][] field7054 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[I")
    public static int[] field7051;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        if (arg0 >= -55) {
            return null;
        } else {
            ++field7052;
            int[] var3 = super.field9114.method1858(100, arg1);
            if (super.field9114.field3897) {
                int[] var4 = this.method3641(class312.field3870 & arg1 + -1, 20604, 0);
                int[] var5 = this.method3641(arg1, 20604, 0);
                int[] var6 = this.method3641(arg1 + 1 & class312.field3870, 20604, 0);
                for (int var7 = 0; var7 < class635.field9139; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field7053;
                    int var9 = (var5[class110.field1162 & var7 - -1] + -var5[class110.field1162 & var7 + -1]) * this.field7053;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)));
                    int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (~arg0 == -1) {
            this.field7053 = arg1.method1476(-1);
        }
        if (!arg2) {
            ++field7058;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILei;)Ljava/lang/String;")
    public static final String method2979(int arg0, class177 arg1) {
        if (arg0 > -121) {
            method2981((class58) null, (byte) 46);
        }
        ++field7055;
        return arg1.field2080 + " <col=ffffff>>";
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public static void method2980(int arg0) {
        field7054 = null;
        field7051 = null;
        int var1 = -62 / ((arg0 - 59) / 59);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lha;B)V")
    public static final void method2981(class58 arg0, byte arg1) {
        ++field7056;
        int var2 = 0;
        int var3 = 0;
        if (class397.field5443) {
            var2 = class389.method2400(50);
            var3 = class752.method4192(1);
        }
        arg0.method432(var2, var3, class705.field9926 + var2, var3 + 350);
        arg0.method370(var2, var3, class705.field9926, 350, class687.field9704 << 24 | 3351159, 1);
        class16.method75(var3, (byte) 36, var3 + 350, var2, class705.field9926 + var2);
        int var4 = 350 / class217.field2522;
        if (~class626.field8989 < -1) {
            int var5 = 342 - class217.field2522;
            int var6 = var4 * var5 / (var4 - (-class626.field8989 + 1));
            int var7 = 4;
            if (class626.field8989 > 1) {
                var7 += (class626.field8989 - class185.field2210 + -1) * (-var6 + var5) / (class626.field8989 + -1);
            }
            arg0.method370(var2 + -16 + class705.field9926, var3 + var7, 12, var6, 3351159 | class687.field9704 << 24, 2);
            for (int var8 = class185.field2210; var8 < class185.field2210 + var4 && ~var8 > ~class626.field8989; ++var8) {
                String[] var9 = class625.method3586(class15.field140[var8], '\b', -16647);
                int var10 = (class705.field9926 - 8 - 16) / var9.length;
                for (int var11 = 0; ~var9.length < ~var11; ++var11) {
                    int var12 = var10 * var11 + 8;
                    arg0.method432(var2 - -var12, var3, var2 + var10 + -8 + var12, var3 + 350);
                    class720.field10104.method442(var2 + var12, -16777216, -((-class185.field2210 + var8) * class217.field2522) + -2 + -class529.field7534 + var3 + -class740.field10344.field7728 + 350, -1, class511.method3019(var9[var11], (byte) -54), 0);
                }
            }
        }
        class322.field4116.method441(-1, "Build: 632", var3 - -330, -16777216, (byte) -47, class705.field9926 + var2 + -25);
        arg0.method432(var2, var3, class705.field9926 + var2, var3 + 350);
        arg0.method374(124, class705.field9926, var2, -class529.field7534 + var3 - -350, -1);
        class567.field8070.method442(var2 + 10, -16777216, var3 + 350 + -1 + -class96.field1014.field7728, -1, "--> " + class511.method3019(class417.field5723, (byte) -54), 0);
        if (arg1 > 115) {
            if (class579.field8197) {
                int var13 = -1;
                if (class392.field5398 % 30 > 15) {
                    var13 = 16777215;
                }
                arg0.method412(class96.field1014.method3137((byte) -54, "--> " + class511.method3019(class417.field5723, (byte) -54).substring(0, class607.field8623)) + 10 + var2, var3 + 350 - (class96.field1014.field7728 - -11), var13, 19154, 12);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class502() {
        super(1, true);
    }
}
