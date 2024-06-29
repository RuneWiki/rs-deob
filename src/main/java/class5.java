import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class7 {

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    private int field63 = 4096;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "Lca;")
    public static class22 field65;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "[I")
    public static int[] field61;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)V")
    public static final void method28(int arg0, int arg1) {
        ++field60;
        if (class202.field3820 != arg0) {
            class54.field1041 = arg1;
        } else {
            class85.field1690.method493(-115, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class5() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static void method29(byte arg0) {
        field65 = null;
        field61 = null;
        if (arg0 > -111) {
            method28(105, -126);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field64;
        if (arg0 < 13) {
            field65 = null;
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1 - 1 & class54.field1050, 0, 58);
            int[] var5 = this.method52(arg1, 0, 83);
            int[] var6 = this.method52(arg1 + 1 & class54.field1050, 0, 97);
            for (int var7 = 0; var7 < class117.field2272; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field63;
                int var9 = (var5[class106.field2030 & var7 - -1] + -var5[var7 + -1 & class106.field2030]) * this.field63;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var11) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (arg0 == 0) {
            this.field63 = arg2.method1007(122);
        }
        ++field66;
        int var4 = -5 % ((66 - arg1) / 57);
    }
}
