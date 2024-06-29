import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class122 extends class751 {

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    private int field1587 = 204;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    private int field1589 = 1;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    private int field1588 = 1;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
    public static final void method904(boolean arg0, int arg1) {
        ++field1592;
        if (arg0) {
            method904(false, -73);
        }
        class22.field334 = 3;
        class108.field1313 = arg1;
        class503.field7192 = -1;
        class668.field9392 = 100;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field1593;
        if (arg1 != 4095) {
            this.method309(-67, (class120) null, -71);
        }
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            for (int var4 = 0; class673.field9452 > var4; ++var4) {
                int var5 = class179.field2708[var4];
                int var6 = class619.field8728[arg0];
                int var7 = this.field1588 * var5 >> 12;
                int var8 = this.field1589 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1588) * this.field1588;
                int var10 = var6 % (4096 / this.field1589) * this.field1589;
                if (var10 < this.field1587) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field1587 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field1587) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field1591;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field1587 = arg1.method898((byte) -91);
                }
            } else {
                this.field1589 = arg1.method842(2384);
            }
        } else {
            this.field1588 = arg1.method842(2384);
        }
        int var5 = -100 / ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class122() {
        super(0, true);
    }
}
