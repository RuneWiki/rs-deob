import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class422 extends class56 {

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    private int field5949 = 3216;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "[I")
    private int[] field5952 = new int[3];

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    private int field5951 = 4096;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    private int field5950 = 3216;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Lqfa;")
    public static class98 field5954 = new class98(26, 0);

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field5956 = 0;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "Lqfa;")
    public static class98 field5959 = new class98(80, 11);

    @OriginalMember(owner = "client!un", name = "O", descriptor = "[Lcp;")
    public static class723[] field5960 = new class723[37];

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Lqfa;")
    public static class98 field5961 = new class98(17, 0);

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V", line = 3)
    private final void method2588(int arg0) {
        ++field5957;
        double var2 = Math.cos((double) ((float) this.field5949 / 4096.0F));
        this.field5952[0] = (int) (var2 * Math.sin((double) ((float) this.field5950 / 4096.0F)) * 4096.0D);
        this.field5952[1] = (int) (Math.cos((double) ((float) this.field5950 / 4096.0F)) * var2 * 4096.0D);
        this.field5952[2] = (int) (Math.sin((double) ((float) this.field5949 / 4096.0F)) * 4096.0D);
        int var4 = this.field5952[0] * this.field5952[0] >> 12;
        if (arg0 != 16692) {
            field5959 = null;
        }
        int var5 = this.field5952[1] * this.field5952[1] >> 12;
        int var6 = this.field5952[2] * this.field5952[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (~var7 != -1) {
            this.field5952[0] = (this.field5952[0] << 12) / var7;
            this.field5952[1] = (this.field5952[1] << 12) / var7;
            this.field5952[2] = (this.field5952[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 37)
    public class422() {
        super(1, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILee;I)V", line = 45)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field5949 = arg1.method3757((byte) -65);
                }
            } else {
                this.field5950 = arg1.method3757((byte) -65);
            }
        } else {
            this.field5951 = arg1.method3757((byte) -65);
        }
        ++field5953;
        if (arg0 != 3731) {
            this.method2588(-70);
        }
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V", line = 93)
    public static void method2589(int arg0) {
        field5954 = null;
        field5961 = null;
        field5959 = null;
        field5960 = null;
        if (arg0 != -17189) {
            method2589(65);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)[I", line = 122)
    public final int[] method24(int arg0, boolean arg1) {
        ++field5955;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (!arg1) {
            return null;
        } else {
            if (super.field673.field8073) {
                int var4 = class340.field4702 * this.field5951 >> 12;
                int[] var5 = this.method367(4463, 0, arg0 + -1 & class636.field8759);
                int[] var6 = this.method367(4463, 0, arg0);
                int[] var7 = this.method367(4463, 0, class636.field8759 & arg0 + 1);
                for (int var8 = 0; class328.field4576 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class445.field6318] + -var6[class445.field6318 & var8 - -1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (~var11 > -1) {
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
                    int var13 = 255 & class728.field10182[((var12 + 1) * var12 >> 1) + var11];
                    int var14 = var10 * var13 >> 8;
                    int var15 = var9 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field5952[1] * var15 >> 12;
                    int var18 = this.field5952[0] * var14 >> 12;
                    int var19 = this.field5952[2] * var16 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 203)
    public final void method364(int arg0) {
        if (arg0 != 7) {
            this.field5949 = -71;
        }
        this.method2588(arg0 + 16685);
        ++field5958;
    }
}
