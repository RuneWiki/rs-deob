import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class241 extends class149 {

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    private int field3394 = 0;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    private int field3393 = 0;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    private int field3398 = 1;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        ++field3399;
        int[] var3 = super.field2152.method2891(arg1, (byte) 91);
        if (arg0 != -10835) {
            this.field3398 = -64;
        }
        if (super.field2152.field7051) {
            int var4 = class185.field2613[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class316.field4838; ++var6) {
                int var7 = class197.field2791[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (this.field3394 != 0) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field3398 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field3398;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field3393 == 0) {
                    var12 = class25.field406[255 & var12 >> 4] + 4096 >> 1;
                } else if (~this.field3393 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 > -86) {
            field3397 = 34;
        }
        ++field3395;
        class117.method761(0);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 == 35) {
            ++field3396;
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 3) {
                        this.field3398 = arg2.method618((byte) 100);
                    }
                } else {
                    this.field3393 = arg2.method618((byte) 100);
                }
            } else {
                this.field3394 = arg2.method618((byte) 100);
            }
        }
    }
}
