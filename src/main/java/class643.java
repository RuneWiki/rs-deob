import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class643 extends class386 {

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "[I")
    private int[] field9174 = new int[3];

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    private int field9178 = 3216;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    private int field9175 = 4096;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    private int field9179 = 3216;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "Lwo;")
    public static class690 field9181 = new class690(95, -2);

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "Z")
    public static boolean field9182 = false;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field9183 = 0;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "Ljk;")
    public static class585 field9184 = new class585(49, 4);

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "Z")
    public static boolean field9185;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 3)
    private final void method3654(int arg0) {
        ++field9173;
        double var2 = Math.cos((double) ((float) this.field9178 / 4096.0F));
        this.field9174[0] = (int) (Math.sin((double) ((float) this.field9179 / 4096.0F)) * var2 * 4096.0D);
        this.field9174[1] = (int) (var2 * Math.cos((double) ((float) this.field9179 / 4096.0F)) * 4096.0D);
        this.field9174[2] = (int) (4096.0D * Math.sin((double) ((float) this.field9178 / 4096.0F)));
        if (arg0 >= 55) {
            int var4 = this.field9174[0] * this.field9174[0] >> 12;
            int var5 = this.field9174[1] * this.field9174[1] >> 12;
            int var6 = this.field9174[2] * this.field9174[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 - -var6 >> 12)));
            if (var7 != 0) {
                this.field9174[2] = (this.field9174[2] << 12) / var7;
                this.field9174[1] = (this.field9174[1] << 12) / var7;
                this.field9174[0] = (this.field9174[0] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I", line = 34)
    public final int[] method359(int arg0, int arg1) {
        ++field9177;
        int[] var3 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int var4 = class693.field9857 * this.field9175 >> 12;
            int[] var5 = this.method2212((byte) -63, class206.field2474 & arg0 + -1, 0);
            int[] var6 = this.method2212((byte) 97, arg0, 0);
            int[] var7 = this.method2212((byte) 121, arg0 + 1 & class206.field2474, 0);
            for (int var8 = 0; ~var8 > ~class599.field8643; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class276.field3782 & var8 + -1] - var6[class276.field3782 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class493.field6895[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field9174[0] * var16 >> 12;
                int var18 = this.field9174[2] * var14 >> 12;
                int var19 = this.field9174[1] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        int var20 = -120 / ((arg1 - 13) / 40);
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 105)
    public class643() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V", line = 118)
    public static void method3655(int arg0) {
        if (arg0 == 431246284) {
            field9181 = null;
            field9184 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLun;)V", line = 133)
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field9180;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field9178 = arg2.method2260(-54);
                }
            } else {
                this.field9179 = arg2.method2260(-128);
            }
        } else {
            this.field9175 = arg2.method2260(-35);
        }
        if (arg1 <= 111) {
            this.field9174 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 192)
    public final void method358(int arg0) {
        this.method3654(89);
        ++field9176;
        if (arg0 < 0) {
            this.method355(-61, (byte) -49, (class389) null);
        }
    }
}
