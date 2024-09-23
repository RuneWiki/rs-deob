import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "l", descriptor = "Z")
    private boolean field613 = false;

    @OriginalMember(owner = "fb", name = "u", descriptor = "Z")
    public boolean field622 = false;

    @OriginalMember(owner = "fb", name = "m", descriptor = "Lpc;")
    private SpotAnimType field614;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public int field616;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 0) {
            this.field613 = !this.field613;
        }
        this.field614 = SpotAnimType.field1166[arg7];
        this.field616 = arg5;
        this.field617 = arg6;
        this.field618 = arg1;
        this.field619 = arg0;
        this.field615 = arg2 + arg4;
        this.field622 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(BI)V")
    public final void method151(byte arg0, int arg1) {
        if (arg0 != -24) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field621 += arg1;
        while (true) {
            do {
                do {
                    if (this.field621 <= this.field614.field1170.method382(this.field620, -86)) {
                        return;
                    }
                    this.field621 -= this.field614.field1170.method382(this.field620, -86) + 1;
                    this.field620++;
                } while (this.field620 < this.field614.field1170.field1145);
            } while (this.field620 >= 0 && this.field620 < this.field614.field1170.field1145);
            this.field620 = 0;
            this.field622 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field614.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field614.field1170.field1146[this.field620];
        Model var4 = new Model(false, var2, true, (byte) 119, AnimFrame.method48(var3, (byte) 7));
        if (!arg0) {
            throw new NullPointerException();
        }
        if (!this.field622) {
            var4.method133(861);
            var4.method134((byte) -54, var3);
            var4.field578 = null;
            var4.field577 = null;
        }
        if (this.field614.field1173 != 128 || this.field614.field1174 != 128) {
            var4.method142(this.field614.field1173, true, this.field614.field1173, this.field614.field1174);
        }
        if (this.field614.field1175 != 0) {
            if (this.field614.field1175 == 90) {
                var4.method137(-126);
            }
            if (this.field614.field1175 == 180) {
                var4.method137(-126);
                var4.method137(-126);
            }
            if (this.field614.field1175 == 270) {
                var4.method137(-126);
                var4.method137(-126);
                var4.method137(-126);
            }
        }
        var4.method143(this.field614.field1176 + 64, this.field614.field1177 + 850, -30, -50, -30, true);
        return var4;
    }
}
