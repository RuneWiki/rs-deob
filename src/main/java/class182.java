import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class182 extends class264 {

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    private int field3362 = 0;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    private int field3367 = 0;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    private int field3370 = 1;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Lcf;")
    public static class93 field3365 = class147.method1066("mapdots", -48);

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "[I")
    public static int[] field3368 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "Lcf;")
    public static class93 field3363 = class147.method1066("tremblement:", -48);

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        field3368 = null;
        field3365 = null;
        field3363 = null;
        if (arg0 < 29) {
            method1340((byte) -30);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 == -3) {
            ++field3369;
            class55.method310(arg0 + 4099);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        int[] var3 = super.field4716.method532((byte) 91, arg0);
        ++field3364;
        if (super.field4716.field1424) {
            int var4 = class67.field1220[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class176.field3060; ++var6) {
                int var7 = class144.field2497[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field3367 == -1) {
                    var9 = (var7 - var4) * this.field3370;
                } else {
                    int var10 = var8 * var8 - -(var5 * var5) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field3370 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field3362 == -1) {
                    var12 = class232.field4148[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field3362 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 >= -83 ? null : var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field3370 = arg2.method1907(16832);
                }
            } else {
                this.field3362 = arg2.method1907(16832);
            }
        } else {
            this.field3367 = arg2.method1907(16832);
        }
        if (arg0 < 11) {
            method1340((byte) 116);
        }
        ++field3371;
    }
}
