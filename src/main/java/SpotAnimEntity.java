import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "o", descriptor = "Z")
    private boolean field605 = true;

    @OriginalMember(owner = "fb", name = "q", descriptor = "Z")
    private boolean field607 = true;

    @OriginalMember(owner = "fb", name = "A", descriptor = "Z")
    public boolean field617 = false;

    @OriginalMember(owner = "fb", name = "s", descriptor = "Lpc;")
    private SpotAnimType field609;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "fb", name = "w", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "fb", name = "x", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "fb", name = "y", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "fb", name = "z", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field609 = SpotAnimType.field1148[arg1];
        this.field611 = arg2;
        if (arg0 != 0) {
            this.field605 = !this.field605;
        }
        this.field612 = arg6;
        this.field613 = arg3;
        this.field614 = arg4;
        this.field610 = arg5 + arg7;
        this.field617 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        this.field616 += arg1;
        if (arg0 != 0) {
            this.field608 = 140;
        }
        while (true) {
            do {
                do {
                    if (this.field616 <= this.field609.field1152.method376(-346, this.field615)) {
                        return;
                    }
                    this.field616 -= this.field609.field1152.method376(-346, this.field615) + 1;
                    this.field615++;
                } while (this.field615 < this.field609.field1152.field1127);
            } while (this.field615 >= 0 && this.field615 < this.field609.field1152.field1127);
            this.field615 = 0;
            this.field617 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field609.method380();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 == null) {
            return null;
        }
        int var4 = this.field609.field1152.field1128[this.field615];
        Model var5 = new Model(9, false, AnimFrame.method48(this.field606, var4), true, var2);
        if (!this.field617) {
            var5.method132(45941);
            var5.method133(3, var4);
            var5.field570 = null;
            var5.field569 = null;
        }
        if (this.field609.field1155 != 128 || this.field609.field1156 != 128) {
            var5.method141(this.field609.field1155, this.field609.field1155, (byte) 62, this.field609.field1156);
        }
        if (this.field609.field1157 != 0) {
            if (this.field609.field1157 == 90) {
                var5.method136(false);
            }
            if (this.field609.field1157 == 180) {
                var5.method136(false);
                var5.method136(false);
            }
            if (this.field609.field1157 == 270) {
                var5.method136(false);
                var5.method136(false);
                var5.method136(false);
            }
        }
        var5.method142(this.field609.field1158 + 64, this.field609.field1159 + 850, -30, -50, -30, true);
        return var5;
    }
}
