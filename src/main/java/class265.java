import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class265 extends class45 {

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "[I")
    private int[] field3813 = new int[3];

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    private int field3817 = 4096;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "I")
    private int field3820 = 3216;

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
    private int field3821 = 3216;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "Lno;")
    public static class494 field3812 = new class494("", 14);

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method35(int arg0, int arg1) {
        ++field3816;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            method1704((byte) -128);
        }
        if (super.field854.field1928) {
            int var4 = class65.field1124 * this.field3817 >> 12;
            int[] var5 = this.method434(0, class506.field7463 & arg1 + -1, 116);
            int[] var6 = this.method434(0, arg1, arg0 ^ 118);
            int[] var7 = this.method434(0, arg1 + 1 & class506.field7463, arg0 + -11);
            for (int var8 = 0; ~class259.field3768 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class290.field4128] + -var6[class290.field4128 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class366.field5527[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field3813[0] * var15 >> 12;
                int var18 = this.field3813[1] * var16 >> 12;
                int var19 = this.field3813[2] * var14 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 195)
    public class265() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V", line = 81)
    public final void method38(int arg0) {
        ++field3818;
        this.method1703(true);
        if (arg0 != 4095) {
            this.method38(-101);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V", line = 94)
    private final void method1703(boolean arg0) {
        ++field3814;
        double var2 = Math.cos((double) ((float) this.field3821 / 4096.0F));
        this.field3813[0] = (int) (Math.sin((double) ((float) this.field3820 / 4096.0F)) * var2 * 4096.0D);
        this.field3813[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field3820 / 4096.0F)));
        this.field3813[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3821 / 4096.0F)));
        int var4 = this.field3813[0] * this.field3813[0] >> 12;
        if (!arg0) {
            field3812 = null;
        }
        int var5 = this.field3813[1] * this.field3813[1] >> 12;
        int var6 = this.field3813[2] * this.field3813[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field3813[2] = (this.field3813[2] << 12) / var7;
            this.field3813[1] = (this.field3813[1] << 12) / var7;
            this.field3813[0] = (this.field3813[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lcu;II)V", line = 124)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3821 = arg0.method1069((byte) -116);
                }
            } else {
                this.field3820 = arg0.method1069((byte) -65);
            }
        } else {
            this.field3817 = arg0.method1069((byte) -98);
        }
        if (arg1 != -26471) {
            this.field3821 = -28;
        }
        ++field3815;
    }

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "(B)V", line = 175)
    public static void method1704(byte arg0) {
        field3812 = null;
        int var1 = 57 / ((arg0 - -8) / 38);
    }
}
