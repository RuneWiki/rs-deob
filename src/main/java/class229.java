import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class229 extends class185 {

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    private int field3454 = 3216;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    private int field3451 = 3216;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    private int field3455 = 4096;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
    private int[] field3456 = new int[3];

    @OriginalMember(owner = "client!me", name = "N", descriptor = "[I")
    public static int[] field3452 = new int[32];

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3448 = "shake:";

    @OriginalMember(owner = "client!me", name = "U", descriptor = "[J")
    public static long[] field3459 = new long[500];

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field3458 = 0;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Ljl;")
    public static class253 field3449 = new class253(8);

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "[[[I")
    public static int[][][] field3461;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public static void method1464(byte arg0) {
        field3449 = null;
        if (arg0 != -24) {
            method1464((byte) -40);
        }
        field3459 = null;
        field3448 = null;
        field3452 = null;
        field3461 = null;
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        ++field3453;
        this.method1465(-8603);
        if (arg0 != -9) {
            this.method1465(120);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field3450;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 <= 70) {
            this.field3455 = -51;
        }
        if (super.field2804.field1384) {
            int var4 = class49.field782 * this.field3455 >> 12;
            int[] var5 = this.method1146((byte) 120, arg0 + -1 & class10.field133, 0);
            int[] var6 = this.method1146((byte) 121, arg0, 0);
            int[] var7 = this.method1146((byte) 121, arg0 + 1 & class10.field133, 0);
            for (int var8 = 0; var8 < class174.field2648; ++var8) {
                int var9 = (var6[var8 - 1 & class53.field873] + -var6[var8 + 1 & class53.field873]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class186.field2822[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field3456[1] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field3456[2] * var17 >> 12;
                int var19 = this.field3456[0] * var15 >> 12;
                var3[var8] = var16 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "i", descriptor = "(I)V")
    private final void method1465(int arg0) {
        ++field3457;
        double var2 = Math.cos((double) ((float) this.field3451 / 4096.0F));
        this.field3456[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field3454 / 4096.0F)));
        this.field3456[1] = (int) (4096.0D * var2 * Math.cos((double) ((float) this.field3454 / 4096.0F)));
        this.field3456[2] = (int) (Math.sin((double) ((float) this.field3451 / 4096.0F)) * 4096.0D);
        int var4 = this.field3456[0] * this.field3456[0] >> 12;
        int var5 = this.field3456[1] * this.field3456[1] >> 12;
        int var6 = this.field3456[2] * this.field3456[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - (-var5 - var6) >> 12)));
        if (arg0 != -8603) {
            field3461 = null;
        }
        if (var7 != 0) {
            this.field3456[0] = (this.field3456[0] << 12) / var7;
            this.field3456[1] = (this.field3456[1] << 12) / var7;
            this.field3456[2] = (this.field3456[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field3460;
        if (arg2 != -6357) {
            this.field3456 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3451 = arg1.method1575(false);
                }
            } else {
                this.field3454 = arg1.method1575(false);
            }
        } else {
            this.field3455 = arg1.method1575(false);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, true);
    }
}
