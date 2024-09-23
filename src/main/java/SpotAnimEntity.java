import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private int field601 = -159;

    @OriginalMember(owner = "gb", name = "u", descriptor = "Z")
    public boolean field610 = false;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Lnc;")
    private SpotAnimType field602;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field602 = SpotAnimType.field1097[arg2];
        this.field604 = arg6;
        this.field605 = arg1;
        this.field606 = arg0;
        if (!arg7) {
            throw new NullPointerException();
        }
        this.field607 = arg5;
        this.field603 = arg3 + arg4;
        this.field610 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II)V")
    public final void method160(int arg0, int arg1) {
        this.field609 += arg1;
        if (arg0 != 0) {
            this.field601 = 52;
        }
        while (true) {
            do {
                do {
                    if (this.field609 <= this.field602.field1101.method373(true, this.field608)) {
                        return;
                    }
                    this.field609 -= this.field602.field1101.method373(true, this.field608) + 1;
                    this.field608++;
                } while (this.field608 < this.field602.field1101.field1082);
            } while (this.field608 >= 0 && this.field608 < this.field602.field1101.field1082);
            this.field608 = 0;
            this.field610 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Z)Lfb;")
    public final Model method121(boolean arg0) {
        Model var2 = this.field602.method377();
        if (arg0) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            Model var3 = new Model(-435, true, false, var2, !this.field602.field1102);
            if (!this.field610) {
                var3.method142(8);
                var3.method143(true, this.field602.field1101.field1083[this.field608]);
                var3.field566 = null;
                var3.field565 = null;
            }
            if (this.field602.field1105 != 128 || this.field602.field1106 != 128) {
                var3.method151(this.field602.field1106, this.field602.field1105, 0, this.field602.field1105);
            }
            if (this.field602.field1107 != 0) {
                if (this.field602.field1107 == 90) {
                    var3.method146(0);
                }
                if (this.field602.field1107 == 180) {
                    var3.method146(0);
                    var3.method146(0);
                }
                if (this.field602.field1107 == 270) {
                    var3.method146(0);
                    var3.method146(0);
                    var3.method146(0);
                }
            }
            var3.method152(this.field602.field1108 + 64, this.field602.field1109 + 850, -30, -50, -30, true);
            return var3;
        }
    }
}
