import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class695 extends class748 {

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    private int field9700 = 0;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    private int field9704 = 16;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    private int field9703 = 4096;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    private int field9707 = 2000;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    private int field9708 = 0;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field9702;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg1) {
            this.method23((byte) -62);
        }
        ++field9706;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field9703 = arg2.method193(2);
                        }
                    } else {
                        this.field9708 = arg2.method193(2);
                    }
                } else {
                    this.field9704 = arg2.method194((byte) 119);
                }
            } else {
                this.field9707 = arg2.method193(2);
            }
        } else {
            this.field9700 = arg2.method194((byte) 119);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        ++field9702;
        if (arg0 != 67) {
            field9701 = 6;
        }
        class503.method3003((byte) -87);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field9705;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (arg1 != 255) {
            this.method20(69, true, (class26) null);
        }
        if (super.field10407.field9527) {
            int var4 = this.field9703 >> 1;
            int[][] var5 = super.field10407.method3874(109);
            Random var6 = new Random((long) this.field9700);
            for (int var7 = 0; this.field9707 > var7; ++var7) {
                int var8 = ~this.field9703 < -1 ? this.field9708 - -class99.method676(this.field9703, var6, -47) + -var4 : this.field9708;
                int var9 = 255 & var8 >> 4;
                int var10 = class99.method676(class424.field5889, var6, -92);
                int var11 = class99.method676(class245.field3400, var6, -121);
                int var12 = (class666.field9382[var9] * this.field9704 >> 12) + var10;
                int var13 = (class510.field7112[var9] * this.field9704 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class99.method676(4096, var6, -108) >> 2);
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = var26 - -((-var10 + var28) * var25) + 1024;
                        int var30 = class354.field4552 & var28;
                        int var31 = class150.field2077 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class695() {
        super(0, true);
    }
}
