import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "m", descriptor = "Z")
    private boolean field612 = true;

    @OriginalMember(owner = "gb", name = "n", descriptor = "Z")
    private boolean field613 = true;

    @OriginalMember(owner = "gb", name = "w", descriptor = "Z")
    public boolean field622 = false;

    @OriginalMember(owner = "gb", name = "o", descriptor = "Lpc;")
    private SpotAnimType field614;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "gb", name = "v", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field614 = SpotAnimType.field1143[arg1];
        this.field616 = arg2;
        this.field617 = arg6;
        this.field618 = arg7;
        if (arg4 <= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field619 = arg3;
        this.field615 = arg0 + arg5;
        this.field622 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IZ)V")
    public final void method164(int arg0, boolean arg1) {
        this.field621 += arg0;
        if (arg1) {
            this.field613 = !this.field613;
        }
        while (true) {
            do {
                do {
                    if (this.field621 <= this.field614.field1147.method384(this.field620, (byte) 2)) {
                        return;
                    }
                    this.field621 -= this.field614.field1147.method384(this.field620, (byte) 2) + 1;
                    this.field620++;
                } while (this.field620 < this.field614.field1147.field1122);
            } while (this.field620 >= 0 && this.field620 < this.field614.field1147.field1122);
            this.field620 = 0;
            this.field622 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        Model var2 = this.field614.method388();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field614.field1147.field1123[this.field620];
        if (arg0 != -28205) {
            this.field612 = !this.field612;
        }
        Model var4 = new Model(AnimFrame.method62((byte) 17, var3), var2, true, 0, false);
        if (!this.field622) {
            var4.method146(0);
            var4.method147((byte) 2, var3);
            var4.field577 = null;
            var4.field576 = null;
        }
        if (this.field614.field1150 != 128 || this.field614.field1151 != 128) {
            var4.method155(this.field614.field1150, (byte) 9, this.field614.field1150, this.field614.field1151);
        }
        if (this.field614.field1152 != 0) {
            if (this.field614.field1152 == 90) {
                var4.method150(28280);
            }
            if (this.field614.field1152 == 180) {
                var4.method150(28280);
                var4.method150(28280);
            }
            if (this.field614.field1152 == 270) {
                var4.method150(28280);
                var4.method150(28280);
                var4.method150(28280);
            }
        }
        var4.method156(this.field614.field1153 + 64, this.field614.field1154 + 850, -30, -50, -30, true);
        return var4;
    }
}
