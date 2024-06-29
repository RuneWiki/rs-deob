import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class555 extends class314 {

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field8026 = 0;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    private int field8030 = 1;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field8029 = 0;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "S")
    public static short field8031 = 1;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "Lhga;")
    public static class158 field8027 = new class158(115, -1);

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 >= -1) {
            this.method3((byte) -46);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field8030 = arg1.method70(-9059);
                }
            } else {
                this.field8029 = arg1.method70(-9059);
            }
        } else {
            this.field8026 = arg1.method70(-9059);
        }
        ++field8025;
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V")
    public static final void method3320(int arg0) {
        ++field8024;
        if (class528.field7705 < 0) {
            class2.field16 = -1;
            class55.field717 = -1;
            class528.field7705 = 0;
        }
        if (class378.field5905 < class528.field7705) {
            class528.field7705 = class378.field5905;
            class2.field16 = -1;
            class55.field717 = -1;
        }
        if (class97.field1570 < 0) {
            class55.field717 = -1;
            class2.field16 = -1;
            class97.field1570 = 0;
        }
        if (arg0 == -7733) {
            if (class378.field5888 < class97.field1570) {
                class97.field1570 = class378.field5888;
                class2.field16 = -1;
                class55.field717 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field8028;
        int[] var3 = super.field4928.method534((byte) -106, arg0);
        if (super.field4928.field618) {
            int var4 = class657.field9166[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class81.field1009; ++var6) {
                int var7 = class328.field5091[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field8026 == 0) {
                    var9 = (-var4 + var7) * this.field8030;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field8030 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field8029 != -1) {
                    if (~this.field8029 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class204.field3328[255 & var12 >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 <= 109 ? null : var3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class555() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method3321(byte arg0) {
        if (arg0 >= -22) {
            method3321((byte) 71);
        }
        field8027 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        class46.method546(-15541);
        if (arg0 != -15) {
            this.method3((byte) -70);
        }
        ++field8032;
    }
}
