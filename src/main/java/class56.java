import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class56 extends class377 {

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    private int field713 = 1;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private int field716 = 0;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    private int field717 = 0;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        class430.method2367(-10177);
        if (arg0 <= 52) {
            this.method27(-10, 10, (class572) null);
        }
        ++field712;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        int var3 = -45 % ((5 - arg1) / 53);
        ++field714;
        int[] var4 = super.field4842.method2772(arg0, (byte) -122);
        if (super.field4842.field6354) {
            int var5 = class596.field8003[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; class528.field6661 > var7; ++var7) {
                int var8 = class136.field1654[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (~this.field717 != -1) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field713 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field713;
                }
                int var13 = var12 - (-4096 & var12);
                if (this.field716 == 0) {
                    var13 = class595.field7986[255 & var13 >> 4] + 4096 >> 1;
                } else if (~this.field716 == -3) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field715;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field713 = arg2.method3097((byte) 12);
                }
            } else {
                this.field716 = arg2.method3097((byte) 12);
            }
        } else {
            this.field717 = arg2.method3097((byte) 12);
        }
        int var5 = -69 % ((13 - arg1) / 55);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, true);
    }
}
