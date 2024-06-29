import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class379 extends class38 {

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    private int field5725 = 4096;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    private int field5730 = 3216;

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    private int field5731 = 3216;

    @OriginalMember(owner = "client!ln", name = "M", descriptor = "[I")
    private int[] field5733 = new int[3];

    @OriginalMember(owner = "client!ln", name = "N", descriptor = "I")
    public static int field5734 = 0;

    @OriginalMember(owner = "client!ln", name = "L", descriptor = "Lqe;")
    public static class469 field5732 = new class469(83, 0);

    @OriginalMember(owner = "client!ln", name = "O", descriptor = "[I")
    public static int[] field5735 = new int[14];

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ln", name = "P", descriptor = "[Lvba;")
    public static class41[] field5736;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILrg;)V", line = 3)
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field5726;
        if (arg0 >= 34) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field5731 = arg2.method3712((byte) 123);
                    }
                } else {
                    this.field5730 = arg2.method3712((byte) 106);
                }
            } else {
                this.field5725 = arg2.method3712((byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 47)
    public class379() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)V", line = 50)
    public static void method2448(byte arg0) {
        field5732 = null;
        int var1 = -48 / ((arg0 - 84) / 37);
        field5735 = null;
        field5736 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)[I", line = 78)
    public final int[] method199(byte arg0, int arg1) {
        ++field5728;
        int[] var3 = super.field397.method1376(arg1, (byte) 127);
        if (super.field397.field3005) {
            int var4 = class514.field7297 * this.field5725 >> 12;
            int[] var5 = this.method189(class619.field8708 & arg1 + -1, 0, (byte) -92);
            int[] var6 = this.method189(arg1, 0, (byte) -92);
            int[] var7 = this.method189(arg1 + 1 & class619.field8708, 0, (byte) -92);
            for (int var8 = 0; ~var8 > ~class729.field10216; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class554.field7909] + -var6[var8 + 1 & class554.field7909]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class213.field3190[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field5733[2] * var16 >> 12;
                int var18 = this.field5733[0] * var14 >> 12;
                int var19 = this.field5733[1] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        if (arg0 > -43) {
            method2448((byte) 28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)V", line = 151)
    private final void method2449(byte arg0) {
        ++field5727;
        double var2 = Math.cos((double) ((float) this.field5731 / 4096.0F));
        this.field5733[0] = (int) (var2 * Math.sin((double) ((float) this.field5730 / 4096.0F)) * 4096.0D);
        this.field5733[1] = (int) (var2 * Math.cos((double) ((float) this.field5730 / 4096.0F)) * 4096.0D);
        this.field5733[2] = (int) (4096.0D * Math.sin((double) ((float) this.field5731 / 4096.0F)));
        int var4 = this.field5733[0] * this.field5733[0] >> 12;
        int var5 = this.field5733[1] * this.field5733[1] >> 12;
        int var6 = this.field5733[2] * this.field5733[2] >> 12;
        if (arg0 != 98) {
            this.method199((byte) -60, -109);
        }
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
            this.field5733[2] = (this.field5733[2] << 12) / var7;
            this.field5733[1] = (this.field5733[1] << 12) / var7;
            this.field5733[0] = (this.field5733[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 190)
    public final void method191(byte arg0) {
        if (arg0 < 120) {
            this.field5725 = -103;
        }
        this.method2449((byte) 98);
        ++field5729;
    }
}
