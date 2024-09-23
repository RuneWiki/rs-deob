import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "m", descriptor = "B")
    private byte field606 = 8;

    @OriginalMember(owner = "gb", name = "n", descriptor = "Z")
    private boolean field607 = false;

    @OriginalMember(owner = "gb", name = "w", descriptor = "Z")
    public boolean field616 = false;

    @OriginalMember(owner = "gb", name = "o", descriptor = "Lpc;")
    private SpotAnimType field608;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field608 = SpotAnimType.field1132[arg5];
        this.field610 = arg3;
        this.field611 = arg4;
        this.field612 = arg2;
        this.field613 = arg0;
        int var9 = 34 / arg6;
        this.field609 = arg1 + arg7;
        this.field616 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II)V")
    public final void method164(int arg0, int arg1) {
        this.field615 += arg0;
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            do {
                do {
                    if (this.field615 <= this.field608.field1136.method384((byte) -103, this.field614)) {
                        return;
                    }
                    this.field615 -= this.field608.field1136.method384((byte) -103, this.field614) + 1;
                    this.field614++;
                } while (this.field614 < this.field608.field1136.field1113);
            } while (this.field614 >= 0 && this.field614 < this.field608.field1136.field1113);
            this.field614 = 0;
            this.field616 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        Model var2 = this.field608.method388();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field608.field1136.field1114[this.field614];
        Model var4 = new Model(AnimFrame.method62((byte) 8, var3), 992, false, true, var2);
        if (arg0 != 45160) {
            this.field607 = !this.field607;
        }
        if (!this.field616) {
            var4.method146((byte) 112);
            var4.method147(true, var3);
            var4.field571 = null;
            var4.field570 = null;
        }
        if (this.field608.field1139 != 128 || this.field608.field1140 != 128) {
            var4.method155(792, this.field608.field1139, this.field608.field1139, this.field608.field1140);
        }
        if (this.field608.field1141 != 0) {
            if (this.field608.field1141 == 90) {
                var4.method150(this.field606);
            }
            if (this.field608.field1141 == 180) {
                var4.method150(this.field606);
                var4.method150(this.field606);
            }
            if (this.field608.field1141 == 270) {
                var4.method150(this.field606);
                var4.method150(this.field606);
                var4.method150(this.field606);
            }
        }
        var4.method156(this.field608.field1142 + 64, this.field608.field1143 + 850, -30, -50, -30, true);
        return var4;
    }
}
