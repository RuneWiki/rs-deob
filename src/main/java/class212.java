import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class212 extends class89 {

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    private int field3590 = 4096;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "Lda;")
    public static class275 field3584 = class255.method1672(124, "welle2:");

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Lda;")
    public static class275 field3588 = class255.method1672(112, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Lma;")
    public static class105 field3589;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3590 = arg1.method608(44);
        }
        ++field3586;
        if (arg0 != -20503) {
            this.method49(15, (class85) null, -68);
        }
    }

    @OriginalMember(owner = "client!le", name = "i", descriptor = "(I)V")
    public static void method1363(int arg0) {
        field3588 = null;
        field3589 = null;
        if (arg0 < 100) {
            field3584 = null;
        }
        field3584 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)Lda;")
    public static final class275 method1364(int arg0, int arg1, boolean arg2) {
        if (arg0 != 32559) {
            return null;
        } else {
            ++field3591;
            return class189.method1253(arg2, arg1, 30997, 10);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class212() {
        super(1, true);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            field3584 = null;
        }
        ++field3585;
        int[] var3 = super.field1503.method229(arg0, (byte) -55);
        if (super.field1503.field664) {
            int[] var4 = this.method645(-128, 0, class277.field4837 & arg0 + -1);
            int[] var5 = this.method645(-17, 0, arg0);
            int[] var6 = this.method645(102, 0, arg0 + 1 & class277.field4837);
            for (int var7 = 0; class65.field1070 > var7; ++var7) {
                int var8 = (var5[class1.field11 & var7 - -1] + -var5[class1.field11 & var7 + -1]) * this.field3590;
                int var9 = (var6[var7] + -var4[var7]) * this.field3590;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
