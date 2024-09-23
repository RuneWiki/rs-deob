import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private int field592 = -31142;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private boolean field593 = false;

    @OriginalMember(owner = "gb", name = "v", descriptor = "Z")
    public boolean field602 = false;

    @OriginalMember(owner = "gb", name = "n", descriptor = "Lnc;")
    private SpotAnimType field594;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field594 = SpotAnimType.field1084[arg0];
        this.field596 = arg7;
        this.field597 = arg5;
        this.field598 = arg3;
        this.field599 = arg2;
        this.field595 = arg1 + arg4;
        while (arg6 >= 0) {
            this.field592 = -338;
        }
        this.field602 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II)V")
    public final void method160(int arg0, int arg1) {
        this.field601 += arg1;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            do {
                do {
                    if (this.field601 <= this.field594.field1088.method369(7, this.field600)) {
                        return;
                    }
                    this.field601 -= this.field594.field1088.method369(7, this.field600) + 1;
                    this.field600++;
                } while (this.field600 < this.field594.field1088.field1070);
            } while (this.field600 >= 0 && this.field600 < this.field594.field1088.field1070);
            this.field600 = 0;
            this.field602 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)Lfb;")
    public final Model method121(int arg0) {
        Model var2 = this.field594.method373();
        if (var2 == null) {
            return null;
        }
        Model var3 = new Model(8, true, !this.field594.field1089, false, var2);
        if (!this.field602) {
            var3.method142((byte) 9);
            var3.method143(this.field594.field1088.field1071[this.field600], false);
            var3.field557 = null;
            var3.field556 = null;
        }
        if (this.field594.field1092 != 128 || this.field594.field1093 != 128) {
            var3.method151(this.field594.field1092, this.field594.field1092, this.field594.field1093, -797);
        }
        if (this.field594.field1094 != 0) {
            if (this.field594.field1094 == 90) {
                var3.method146(35866);
            }
            if (this.field594.field1094 == 180) {
                var3.method146(35866);
                var3.method146(35866);
            }
            if (this.field594.field1094 == 270) {
                var3.method146(35866);
                var3.method146(35866);
                var3.method146(35866);
            }
        }
        var3.method152(this.field594.field1095 + 64, this.field594.field1096 + 850, -30, -50, -30, true);
        if (arg0 != 0) {
            this.field593 = !this.field593;
        }
        return var3;
    }
}
