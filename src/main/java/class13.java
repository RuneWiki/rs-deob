import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class13 extends class117 {

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    private int field131 = 3216;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    private int field134 = 4096;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    private int field142 = 3216;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "[I")
    private int[] field136 = new int[3];

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    public static int field137 = 0;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "Ljava/lang/String;")
    public static String field132 = "Loaded sprites";

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "[J")
    public static long[] field143 = new long[1000];

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field139 = -1;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lag;")
    public static class211 field146 = null;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "[Lbi;")
    public static class229[] field133;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
    public static void method62(boolean arg0) {
        if (arg0) {
            field146 = null;
            field133 = null;
            field132 = null;
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field131 = arg0.method1142(arg1 + -19225);
                }
            } else {
                this.field142 = arg0.method1142(arg1 + -19225);
            }
        } else {
            this.field134 = arg0.method1142(arg1 + -19225);
        }
        if (arg1 != 255) {
            this.field134 = -56;
        }
        ++field140;
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)V")
    private final void method63(int arg0) {
        ++field144;
        double var2 = Math.cos((double) ((float) this.field131 / 4096.0F));
        this.field136[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field142 / 4096.0F)));
        this.field136[1] = (int) (var2 * Math.cos((double) ((float) this.field142 / 4096.0F)) * 4096.0D);
        if (arg0 != -1008125588) {
            field139 = 98;
        }
        this.field136[2] = (int) (Math.sin((double) ((float) this.field131 / 4096.0F)) * 4096.0D);
        int var4 = this.field136[0] * this.field136[0] >> 12;
        int var5 = this.field136[1] * this.field136[1] >> 12;
        int var6 = this.field136[2] * this.field136[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 - -var5 + var6 >> 12)));
        if (~var7 != -1) {
            this.field136[0] = (this.field136[0] << 12) / var7;
            this.field136[1] = (this.field136[1] << 12) / var7;
            this.field136[2] = (this.field136[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field135;
        this.method63(arg0 ^ -1008125587);
        if (arg0 != 1) {
            this.method63(108);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field141;
        if (arg0 != 2) {
            this.field131 = -60;
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 78);
        if (super.field1883.field1313) {
            int var4 = class228.field3679 * this.field134 >> 12;
            int[] var5 = this.method837(0, 0, class293.field4689 & arg1 + -1);
            int[] var6 = this.method837(arg0 ^ 2, 0, arg1);
            int[] var7 = this.method837(0, 0, arg1 - -1 & class293.field4689);
            for (int var8 = 0; class168.field2737 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                int var11 = (var6[class234.field3769 & var8 - 1] + -var6[class234.field3769 & var8 - -1]) * var4 >> 12;
                if (~var10 > -1) {
                    var10 = -var10;
                }
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (~var10 < -256) {
                    var10 = 255;
                }
                int var13 = 255 & class2.field23[((var10 + 1) * var10 >> 1) + var12];
                int var14 = var13 * 4096 >> 8;
                int var15 = this.field136[2] * var14 >> 12;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field136[1] * var16 >> 12;
                int var18 = var11 * var13 >> 8;
                int var19 = this.field136[0] * var18 >> 12;
                var3[var8] = var15 + var19 - -var17;
            }
        }
        return var3;
    }
}
