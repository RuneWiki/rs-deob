import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private int field611 = 650;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private boolean field612 = true;

    @OriginalMember(owner = "gb", name = "v", descriptor = "Z")
    public boolean field621 = false;

    @OriginalMember(owner = "gb", name = "n", descriptor = "Lpc;")
    private SpotAnimType field613;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field613 = SpotAnimType.field1130[arg3];
        this.field615 = arg7;
        if (arg0 != 0) {
            this.field612 = !this.field612;
        }
        this.field616 = arg4;
        this.field617 = arg1;
        this.field618 = arg6;
        this.field614 = arg2 + arg5;
        this.field621 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II)V")
    public final void method164(int arg0, int arg1) {
        this.field620 += arg1;
        int var3 = 55 / arg0;
        while (true) {
            do {
                do {
                    if (this.field620 <= this.field613.field1134.method384(this.field619, true)) {
                        return;
                    }
                    this.field620 -= this.field613.field1134.method384(this.field619, true) + 1;
                    this.field619++;
                } while (this.field619 < this.field613.field1134.field1111);
            } while (this.field619 >= 0 && this.field619 < this.field613.field1134.field1111);
            this.field619 = 0;
            this.field621 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        Model var2 = this.field613.method388();
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = this.field613.field1134.field1112[this.field619];
            Model var4 = new Model(23727, AnimFrame.method62(0, var3), true, var2, false);
            if (!this.field621) {
                var4.method146(true);
                var4.method147(var3, false);
                var4.field576 = null;
                var4.field575 = null;
            }
            if (this.field613.field1137 != 128 || this.field613.field1138 != 128) {
                var4.method155(this.field613.field1137, (byte) 2, this.field613.field1138, this.field613.field1137);
            }
            if (this.field613.field1139 != 0) {
                if (this.field613.field1139 == 90) {
                    var4.method150((byte) 4);
                }
                if (this.field613.field1139 == 180) {
                    var4.method150((byte) 4);
                    var4.method150((byte) 4);
                }
                if (this.field613.field1139 == 270) {
                    var4.method150((byte) 4);
                    var4.method150((byte) 4);
                    var4.method150((byte) 4);
                }
            }
            var4.method156(this.field613.field1140 + 64, this.field613.field1141 + 850, -30, -50, -30, true);
            return var4;
        }
    }
}
