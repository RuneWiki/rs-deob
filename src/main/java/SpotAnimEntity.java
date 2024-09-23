import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private int field610 = 826;

    @OriginalMember(owner = "gb", name = "u", descriptor = "Z")
    public boolean field619 = false;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Loc;")
    private SpotAnimType field611;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field611 = SpotAnimType.field1138[arg3];
        if (arg5 >= 0) {
            this.field610 = -352;
        }
        this.field613 = arg2;
        this.field614 = arg1;
        this.field615 = arg0;
        this.field616 = arg4;
        this.field612 = arg6 + arg7;
        this.field619 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II)V")
    public final void method163(int arg0, int arg1) {
        this.field618 += arg1;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field618 <= this.field611.field1142.method382(0, this.field617)) {
                        return;
                    }
                    this.field618 -= this.field611.field1142.method382(0, this.field617) + 1;
                    this.field617++;
                } while (this.field617 < this.field611.field1142.field1121);
            } while (this.field617 >= 0 && this.field617 < this.field611.field1142.field1121);
            this.field617 = 0;
            this.field619 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        Model var2 = this.field611.method386();
        if (arg0 != 5560) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            Model var3 = new Model(var2, true, false, !this.field611.field1143, -796);
            if (!this.field619) {
                var3.method145(-591);
                var3.method146(this.field611.field1142.field1122[this.field617], 13056);
                var3.field575 = null;
                var3.field574 = null;
            }
            if (this.field611.field1146 != 128 || this.field611.field1147 != 128) {
                var3.method154(this.field611.field1147, this.field611.field1146, 4, this.field611.field1146);
            }
            if (this.field611.field1148 != 0) {
                if (this.field611.field1148 == 90) {
                    var3.method149((byte) 3);
                }
                if (this.field611.field1148 == 180) {
                    var3.method149((byte) 3);
                    var3.method149((byte) 3);
                }
                if (this.field611.field1148 == 270) {
                    var3.method149((byte) 3);
                    var3.method149((byte) 3);
                    var3.method149((byte) 3);
                }
            }
            var3.method155(this.field611.field1149 + 64, this.field611.field1150 + 850, -30, -50, -30, true);
            return var3;
        }
    }
}
