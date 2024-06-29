import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class245 extends class80 {

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    private int field3782 = 4096;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    private int field3784 = 3216;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    private int field3783 = 3216;

    @OriginalMember(owner = "client!rr", name = "S", descriptor = "[I")
    private int[] field3792 = new int[3];

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "Los;")
    public static class309 field3787 = new class309("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!rr", name = "R", descriptor = "Lo;")
    public static class24 field3791;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "Lur;")
    public static class378 field3789;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field3786;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            field3787 = null;
        }
        if (super.field1601.field124) {
            int var4 = class379.field5549 * this.field3782 >> 12;
            int[] var5 = this.method710(arg0 + -1 & class359.field5269, 0, (byte) 116);
            int[] var6 = this.method710(arg0, 0, (byte) 71);
            int[] var7 = this.method710(class359.field5269 & arg0 + 1, 0, (byte) 98);
            for (int var8 = 0; ~var8 > ~class137.field2308; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class308.field4672 & var8 - 1] + -var6[class308.field4672 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class161.field2590[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field3792[1] * var15 >> 12;
                int var18 = this.field3792[2] * var16 >> 12;
                int var19 = this.field3792[0] * var14 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (arg0) {
            this.method1593(-81);
            ++field3788;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V")
    private final void method1593(int arg0) {
        ++field3790;
        double var2 = Math.cos((double) ((float) this.field3784 / 4096.0F));
        this.field3792[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field3783 / 4096.0F)));
        this.field3792[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field3783 / 4096.0F)));
        this.field3792[2] = (int) (Math.sin((double) ((float) this.field3784 / 4096.0F)) * 4096.0D);
        if (arg0 > -65) {
            this.field3782 = 78;
        }
        int var4 = this.field3792[0] * this.field3792[0] >> 12;
        int var5 = this.field3792[1] * this.field3792[1] >> 12;
        int var6 = this.field3792[2] * this.field3792[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field3792[2] = (this.field3792[2] << 12) / var7;
            this.field3792[0] = (this.field3792[0] << 12) / var7;
            this.field3792[1] = (this.field3792[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3784 = arg2.method1841((byte) 25);
                }
            } else {
                this.field3783 = arg2.method1841((byte) 29);
            }
        } else {
            this.field3782 = arg2.method1841((byte) -9);
        }
        ++field3785;
        int var5 = -84 % ((28 - arg1) / 53);
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
    public class245() {
        super(1, true);
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)V")
    public static void method1594(boolean arg0) {
        field3787 = null;
        if (arg0) {
            field3787 = null;
        }
        field3789 = null;
        field3791 = null;
    }
}
