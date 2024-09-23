import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "u", descriptor = "Z")
    public boolean field616 = false;

    @OriginalMember(owner = "fb", name = "m", descriptor = "Lpc;")
    private SpotAnimType field608;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field608 = SpotAnimType.field1157[arg1];
        this.field610 = arg3;
        this.field611 = arg0;
        this.field612 = arg5;
        this.field613 = arg2;
        this.field609 = arg4 + arg6;
        this.field616 = false;
        if (arg7 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(BI)V")
    public final void method151(byte arg0, int arg1) {
        if (arg0 != 1) {
            return;
        }
        this.field615 += arg1;
        while (true) {
            do {
                do {
                    if (this.field615 <= this.field608.field1161.method382(this.field614, 0)) {
                        return;
                    }
                    this.field615 -= this.field608.field1161.method382(this.field614, 0) + 1;
                    this.field614++;
                } while (this.field614 < this.field608.field1161.field1136);
            } while (this.field614 >= 0 && this.field614 < this.field608.field1161.field1136);
            this.field614 = 0;
            this.field616 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (arg0 != -67) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field608.method386();
        if (var3 == null) {
            return null;
        }
        int var4 = this.field608.field1161.field1137[this.field614];
        Model var5 = new Model(false, true, AnimFrame.method48(4, var4), var3, 396);
        if (!this.field616) {
            var5.method133(false);
            var5.method134(2, var4);
            var5.field573 = null;
            var5.field572 = null;
        }
        if (this.field608.field1164 != 128 || this.field608.field1165 != 128) {
            var5.method142(this.field608.field1164, this.field608.field1164, this.field608.field1165, 0);
        }
        if (this.field608.field1166 != 0) {
            if (this.field608.field1166 == 90) {
                var5.method137((byte) -37);
            }
            if (this.field608.field1166 == 180) {
                var5.method137((byte) -37);
                var5.method137((byte) -37);
            }
            if (this.field608.field1166 == 270) {
                var5.method137((byte) -37);
                var5.method137((byte) -37);
                var5.method137((byte) -37);
            }
        }
        var5.method143(this.field608.field1167 + 64, this.field608.field1168 + 850, -30, -50, -30, true);
        return var5;
    }
}
