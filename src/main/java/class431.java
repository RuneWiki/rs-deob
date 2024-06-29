import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class431 extends class585 {

    @OriginalMember(owner = "client!fr", name = "J", descriptor = "[I")
    private int[] field5840 = new int[3];

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
    private int field5837 = 3216;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    private int field5836 = 3216;

    @OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
    private int field5839 = 4096;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field5843;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int var4 = class602.field8438 * this.field5839 >> 12;
            int[] var5 = this.method3415(-127, 0, class305.field4391 & arg0 - 1);
            int[] var6 = this.method3415(-128, 0, arg0);
            int[] var7 = this.method3415(-127, 0, arg0 + 1 & class305.field4391);
            for (int var8 = 0; ~class293.field4278 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class625.field8759 & var8 - 1] + -var6[class625.field8759 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class522.field7387[((var12 - -1) * var12 >> 1) + var11] & 255;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field5840[0] * var16 >> 12;
                int var18 = this.field5840[1] * var14 >> 12;
                int var19 = this.field5840[2] * var15 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        if (arg1 < 123) {
            this.field5837 = 13;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field5842;
        if (arg1 == 1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        this.field5837 = arg0.method2998(true);
                    }
                } else {
                    this.field5836 = arg0.method2998(true);
                }
            } else {
                this.field5839 = arg0.method2998(true);
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 == -4096) {
            ++field5838;
            this.method2586(67);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    private final void method2586(int arg0) {
        ++field5844;
        double var2 = Math.cos((double) ((float) this.field5837 / 4096.0F));
        this.field5840[0] = (int) (var2 * Math.sin((double) ((float) this.field5836 / 4096.0F)) * 4096.0D);
        this.field5840[1] = (int) (var2 * Math.cos((double) ((float) this.field5836 / 4096.0F)) * 4096.0D);
        this.field5840[2] = (int) (Math.sin((double) ((float) this.field5837 / 4096.0F)) * 4096.0D);
        int var4 = this.field5840[0] * this.field5840[0] >> 12;
        int var5 = this.field5840[1] * this.field5840[1] >> 12;
        int var6 = this.field5840[2] * this.field5840[2] >> 12;
        if (arg0 <= 39) {
            this.method55(-63, 12);
        }
        int var7 = (int) (Math.sqrt((double) (var4 - (-var5 + -var6) >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field5840[2] = (this.field5840[2] << 12) / var7;
            this.field5840[0] = (this.field5840[0] << 12) / var7;
            this.field5840[1] = (this.field5840[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class431() {
        super(1, true);
    }
}
