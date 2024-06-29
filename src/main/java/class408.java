import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class408 extends class751 {

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    private int field5760 = 4096;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "[I")
    private int[] field5758 = new int[3];

    @OriginalMember(owner = "client!fu", name = "B", descriptor = "I")
    private int field5757 = 3216;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    private int field5761 = 3216;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "[I")
    public static int[] field5766 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!fu", name = "A", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "Lkf;")
    public static class263 field5763;

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class408() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(II)V")
    public static final void method2459(int arg0, int arg1) {
        ++field5764;
        if (arg1 == 0) {
            class678 var2 = class630.method3597(29636, 17, (long) arg0);
            var2.method3836((byte) -26);
        }
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
    private final void method2460(int arg0) {
        ++field5762;
        double var2 = Math.cos((double) ((float) this.field5761 / 4096.0F));
        this.field5758[0] = (int) (4096.0D * Math.sin((double) ((float) this.field5757 / 4096.0F)) * var2);
        this.field5758[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field5757 / 4096.0F)));
        this.field5758[2] = (int) (Math.sin((double) ((float) this.field5761 / 4096.0F)) * 4096.0D);
        if (arg0 < 112) {
            method2459(83, 55);
        }
        int var4 = this.field5758[0] * this.field5758[0] >> 12;
        int var5 = this.field5758[1] * this.field5758[1] >> 12;
        int var6 = this.field5758[2] * this.field5758[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field5758[2] = (this.field5758[2] << 12) / var7;
            this.field5758[0] = (this.field5758[0] << 12) / var7;
            this.field5758[1] = (this.field5758[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(B)V")
    public static void method2461(byte arg0) {
        field5766 = null;
        if (arg0 < 81) {
            method2461((byte) 57);
        }
        field5763 = null;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public final void method1454(byte arg0) {
        if (arg0 >= 123) {
            this.method2460(127);
            ++field5765;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field5756;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            method2461((byte) -92);
        }
        if (super.field10405.field8923) {
            int var4 = class787.field10820 * this.field5760 >> 12;
            int[] var5 = this.method4173(arg0 - 1 & class348.field5094, (byte) -115, 0);
            int[] var6 = this.method4173(arg0, (byte) -123, 0);
            int[] var7 = this.method4173(arg0 + 1 & class348.field5094, (byte) -117, 0);
            for (int var8 = 0; class673.field9452 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class407.field5754 & var8 + -1] - var6[class407.field5754 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class153.field2275[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field5758[1] * var16 >> 12;
                int var18 = this.field5758[2] * var14 >> 12;
                int var19 = this.field5758[0] * var15 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field5761 = arg1.method898((byte) -95);
                }
            } else {
                this.field5757 = arg1.method898((byte) -111);
            }
        } else {
            this.field5760 = arg1.method898((byte) -123);
        }
        ++field5759;
        int var5 = 105 % ((arg0 - 25) / 63);
    }
}
