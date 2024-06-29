import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class60 extends class62 {

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    private int field746 = 3216;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    private int field747 = 4096;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "[I")
    private int[] field755 = new int[3];

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    private int field749 = 3216;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field756 = 0;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Lh;")
    public static class572 field757 = new class572("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "[I")
    public static int[] field758;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    private final void method392(byte arg0) {
        if (arg0 > -80) {
            method393(14, 123, false, -118, -22, -46, (class328) null);
        }
        ++field748;
        double var2 = Math.cos((double) ((float) this.field746 / 4096.0F));
        this.field755[0] = (int) (4096.0D * Math.sin((double) ((float) this.field749 / 4096.0F)) * var2);
        this.field755[1] = (int) (4096.0D * Math.cos((double) ((float) this.field749 / 4096.0F)) * var2);
        this.field755[2] = (int) (4096.0D * Math.sin((double) ((float) this.field746 / 4096.0F)));
        int var4 = this.field755[0] * this.field755[0] >> 12;
        int var5 = this.field755[1] * this.field755[1] >> 12;
        int var6 = this.field755[2] * this.field755[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (var7 != 0) {
            this.field755[0] = (this.field755[0] << 12) / var7;
            this.field755[1] = (this.field755[1] << 12) / var7;
            this.field755[2] = (this.field755[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field754;
        if (arg1 == -1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field746 = arg0.method1045(true);
                    }
                } else {
                    this.field749 = arg0.method1045(true);
                }
            } else {
                this.field747 = arg0.method1045(true);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZIIILkda;)V")
    public static final void method393(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class328 arg6) {
        class219.field3190 = 1;
        class624.field9191 = arg3;
        class511.field7276 = arg1;
        if (arg0 == 17502) {
            class271.field3841 = arg5;
            class271.field3843 = arg2;
            class514.field7343 = arg6;
            ++field751;
            class312.field4298 = class129.field1796.method1098(4096) / arg4;
            if (class312.field4298 < 1) {
                class312.field4298 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static void method394(boolean arg0) {
        field758 = null;
        if (arg0) {
            method394(true);
        }
        field757 = null;
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        this.method392((byte) -114);
        if (arg0 >= -37) {
            this.field746 = 15;
        }
        ++field752;
    }

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
    public static final void method396(int arg0) {
        ++field750;
        class396.field5453.method837(127);
        if (arg0 != 20035) {
            field757 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class60() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field753;
        int[] var3 = super.field774.method3086(arg0, -2);
        if (super.field774.field7499) {
            int var4 = class433.field5803 * this.field747 >> 12;
            int[] var5 = this.method408(arg0 + -1 & class285.field3989, 0, (byte) -69);
            int[] var6 = this.method408(arg0, 0, (byte) -69);
            int[] var7 = this.method408(class285.field3989 & arg0 - -1, 0, (byte) -69);
            for (int var8 = 0; class438.field5847 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class410.field5604] - var6[class410.field5604 & var8 + 1]) * var4 >> 12;
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
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class344.field4742[((var12 - -1) * var12 >> 1) + var11];
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field755[1] * var14 >> 12;
                int var18 = this.field755[0] * var16 >> 12;
                int var19 = this.field755[2] * var15 >> 12;
                var3[var8] = var18 - (-var17 + -var19);
            }
        }
        if (arg1 != 656024161) {
            this.method11((class148) null, 0, 14);
        }
        return var3;
    }
}
