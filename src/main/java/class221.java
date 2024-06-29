import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class221 extends class214 {

    @OriginalMember(owner = "client!qu", name = "I", descriptor = "I")
    private int field3597 = 3216;

    @OriginalMember(owner = "client!qu", name = "M", descriptor = "I")
    private int field3601 = 3216;

    @OriginalMember(owner = "client!qu", name = "J", descriptor = "[I")
    private int[] field3598 = new int[3];

    @OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
    private int field3594 = 4096;

    @OriginalMember(owner = "client!qu", name = "D", descriptor = "I")
    public static int field3592 = -1;

    @OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!qu", name = "K", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!qu", name = "L", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!qu", name = "N", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!qu", name = "O", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!qu", name = "P", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!qu", name = "E", descriptor = "[Lraa;")
    public static class353[] field3593;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field3597 = arg1.method1989((byte) -62);
                }
            } else {
                this.field3601 = arg1.method1989((byte) -66);
            }
        } else {
            this.field3594 = arg1.method1989((byte) -51);
        }
        ++field3599;
        if (arg0 <= 92) {
            field3592 = 32;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
    private final void method1571(boolean arg0) {
        ++field3603;
        double var2 = Math.cos((double) ((float) this.field3597 / 4096.0F));
        this.field3598[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field3601 / 4096.0F)));
        this.field3598[1] = (int) (Math.cos((double) ((float) this.field3601 / 4096.0F)) * var2 * 4096.0D);
        this.field3598[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3597 / 4096.0F)));
        int var4 = this.field3598[0] * this.field3598[0] >> 12;
        int var5 = this.field3598[1] * this.field3598[1] >> 12;
        int var6 = this.field3598[2] * this.field3598[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (arg0) {
            method1573(-128);
        }
        if (var7 != 0) {
            this.field3598[1] = (this.field3598[1] << 12) / var7;
            this.field3598[0] = (this.field3598[0] << 12) / var7;
            this.field3598[2] = (this.field3598[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(ZII)I")
    public static final int method1572(boolean arg0, int arg1, int arg2) {
        ++field3596;
        if (~class430.field6288 == 0) {
            return 1;
        } else {
            if (arg1 != class654.field9289.field5415.method2004(3)) {
                class573.method3331(-22364, true, class641.field9006.method3621(90, class467.field6804), arg1);
                if (~class654.field9289.field5415.method2004(3) != ~arg1) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class400.field5941.getSize();
                class104.method853(class594.field8343, class641.field9006.method3621(121, class467.field6804), class364.field5573, (byte) -10, class74.field1105, true);
                class352 var4 = class357.method2284(class532.field7662, class430.field6288, 0, (byte) -123);
                long var5 = class18.method109(-11121);
                class364.field5573.method374();
                class257.field4038.method675(0, class581.field8224, 0);
                class364.field5573.method244(class257.field4038);
                class364.field5573.method288(var3.width / 2, var3.height / 2, 512, 512);
                class364.field5573.method328(1.0F);
                class364.field5573.method259(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class282 var7 = class364.field5573.method301(var4, 2048, 64, 64, 768);
                int var8 = 0;
                if (arg0) {
                    field3593 = null;
                }
                label45: for (int var9 = 0; var9 < 500; ++var9) {
                    class364.field5573.method1328(0);
                    class364.field5573.method1287();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; var10 >= var11; ++var11) {
                            class44.field744.method675((int) (((float) var11 - (float) var10 / 2.0F) * (float) class382.field5732), 0, (var10 + 1) * class382.field5732);
                            var7.method1007(class44.field744, (class385) null, 0);
                            ++var8;
                            if (~(class18.method109(-11121) + -var5) <= ~((long) arg2)) {
                                break label45;
                            }
                        }
                    }
                }
                class364.field5573.method1338();
                long var12 = (long) (var8 * 1000) / (class18.method109(-11121) + -var5);
                class364.field5573.method1328(0);
                class364.field5573.method1287();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field3593 = null;
        if (arg0 != -13118) {
            method1572(true, 96, 123);
        }
    }

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 > 48) {
            this.method1571(false);
            ++field3595;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        if (arg1 != 5) {
            return null;
        } else {
            ++field3602;
            int[] var3 = super.field3544.method3869(arg0, arg1 ^ -117);
            if (super.field3544.field9836) {
                int var4 = class153.field2379 * this.field3594 >> 12;
                int[] var5 = this.method1545(arg0 + -1 & class580.field8203, 0, -1);
                int[] var6 = this.method1545(arg0, 0, -1);
                int[] var7 = this.method1545(arg0 + 1 & class580.field8203, 0, arg1 ^ -6);
                for (int var8 = 0; ~class626.field8787 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 - 1 & class245.field3948] + -var6[class245.field3948 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    int var12 = var9 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = class242.field3912[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                    int var14 = var10 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field3598[0] * var14 >> 12;
                    int var18 = this.field3598[1] * var16 >> 12;
                    int var19 = this.field3598[2] * var15 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
    public class221() {
        super(1, true);
    }
}
