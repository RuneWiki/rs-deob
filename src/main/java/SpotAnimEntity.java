import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "m", descriptor = "Z")
    private boolean field608 = false;

    @OriginalMember(owner = "fb", name = "v", descriptor = "Z")
    public boolean field617 = false;

    @OriginalMember(owner = "fb", name = "n", descriptor = "Lqc;")
    private SpotAnimType field609;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(ZIIIIIII)V")
    public SpotAnimEntity(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field609 = SpotAnimType.field1158[arg2];
        this.field611 = arg5;
        this.field612 = arg7;
        this.field613 = arg3;
        this.field614 = arg6;
        this.field610 = arg1 + arg4;
        this.field617 = false;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        this.field616 += arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            do {
                do {
                    if (this.field616 <= this.field609.field1162.method379(1, this.field615)) {
                        return;
                    }
                    this.field616 -= this.field609.field1162.method379(1, this.field615) + 1;
                    this.field615++;
                } while (this.field615 < this.field609.field1162.field1137);
            } while (this.field615 >= 0 && this.field615 < this.field609.field1162.field1137);
            this.field615 = 0;
            this.field617 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != -21173) {
            throw new NullPointerException();
        }
        Model var2 = this.field609.method383();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field609.field1162.field1138[this.field615];
        Model var4 = new Model(false, -164, var2, true, AnimFrame.method48(var3, 62));
        if (!this.field617) {
            var4.method132(this.field607);
            var4.method133(-278, var3);
            var4.field572 = null;
            var4.field571 = null;
        }
        if (this.field609.field1165 != 128 || this.field609.field1166 != 128) {
            var4.method141(this.field609.field1165, false, this.field609.field1165, this.field609.field1166);
        }
        if (this.field609.field1167 != 0) {
            if (this.field609.field1167 == 90) {
                var4.method136(-66);
            }
            if (this.field609.field1167 == 180) {
                var4.method136(-66);
                var4.method136(-66);
            }
            if (this.field609.field1167 == 270) {
                var4.method136(-66);
                var4.method136(-66);
                var4.method136(-66);
            }
        }
        var4.method142(this.field609.field1168 + 64, this.field609.field1169 + 850, -30, -50, -30, true);
        return var4;
    }
}
