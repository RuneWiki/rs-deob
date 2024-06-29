import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class413 extends class4 {

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    private int field5678 = 4096;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
    private int field5688 = 3216;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    private int field5683 = 3216;

    @OriginalMember(owner = "client!pg", name = "P", descriptor = "[I")
    private int[] field5689 = new int[3];

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "[I")
    public static int[] field5684 = new int[32];

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "Lgba;")
    public static class358 field5685 = new class358();

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field5679;
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = class134.field1635 * this.field5678 >> 12;
            int[] var5 = this.method20(0, -21986, arg1 + -1 & class376.field5248);
            int[] var6 = this.method20(0, -21986, arg1);
            int[] var7 = this.method20(0, -21986, arg1 + 1 & class376.field5248);
            for (int var8 = 0; class132.field1627 > var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class150.field1971] + -var6[class150.field1971 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class642.field9323[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field5689[1] * var15 >> 12;
                int var18 = this.field5689[0] * var14 >> 12;
                int var19 = this.field5689[2] * var16 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        if (arg0 != 10) {
            this.field5688 = -26;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
    private final void method2461(int arg0) {
        ++field5682;
        double var2 = Math.cos((double) ((float) this.field5683 / 4096.0F));
        this.field5689[0] = (int) (var2 * Math.sin((double) ((float) this.field5688 / 4096.0F)) * 4096.0D);
        this.field5689[1] = (int) (Math.cos((double) ((float) this.field5688 / 4096.0F)) * var2 * 4096.0D);
        this.field5689[2] = (int) (4096.0D * Math.sin((double) ((float) this.field5683 / 4096.0F)));
        int var4 = this.field5689[0] * this.field5689[0] >> 12;
        int var5 = this.field5689[1] * this.field5689[1] >> 12;
        if (arg0 < 91) {
            this.field5689 = null;
        }
        int var6 = this.field5689[2] * this.field5689[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field5689[0] = (this.field5689[0] << 12) / var7;
            this.field5689[2] = (this.field5689[2] << 12) / var7;
            this.field5689[1] = (this.field5689[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
    public static final int method2462(int arg0, int arg1) {
        if (arg0 > -96) {
            method2463(125);
        }
        ++field5687;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field5680;
        if (arg0 != -9) {
            method2463(-78);
        }
        this.method2461(125);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class413() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)V")
    public static void method2463(int arg0) {
        field5685 = null;
        if (arg0 == -1556) {
            field5684 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ln;Lkr;I)V")
    public static final void method2464(class473 arg0, class329 arg1, int arg2) {
        ++field5686;
        class431.field5871 = arg0;
        if (arg2 <= -119) {
            class486.field6784 = arg1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field5681;
        if (arg0 > -89) {
            this.field5688 = 90;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field5683 = arg1.method3090(-123);
                }
            } else {
                this.field5688 = arg1.method3090(-120);
            }
        } else {
            this.field5678 = arg1.method3090(-122);
        }
    }
}
