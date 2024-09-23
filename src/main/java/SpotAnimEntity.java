import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "l", descriptor = "Z")
    private boolean field607 = true;

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

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIZIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        this.field608 = SpotAnimType.field1172[arg3];
        this.field610 = arg2;
        this.field611 = arg6;
        this.field612 = arg0;
        this.field613 = arg5;
        if (!arg4) {
            throw new NullPointerException();
        }
        this.field609 = arg1 + arg7;
        this.field616 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IZ)V")
    public final void method151(int arg0, boolean arg1) {
        this.field615 += arg0;
        if (arg1) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field615 <= this.field608.field1176.method382(-574, this.field614)) {
                        return;
                    }
                    this.field615 -= this.field608.field1176.method382(-574, this.field614) + 1;
                    this.field614++;
                } while (this.field614 < this.field608.field1176.field1150);
            } while (this.field614 >= 0 && this.field614 < this.field608.field1176.field1150);
            this.field614 = 0;
            this.field616 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field608.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field608.field1176.field1151[this.field614];
        if (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        Model var5 = new Model(AnimFrame.method48(var3, 45733), false, true, var2, 0);
        if (!this.field616) {
            var5.method133(true);
            var5.method134(true, var3);
            var5.field572 = null;
            var5.field571 = null;
        }
        if (this.field608.field1179 != 128 || this.field608.field1180 != 128) {
            var5.method142(this.field608.field1179, this.field608.field1179, -34245, this.field608.field1180);
        }
        if (this.field608.field1181 != 0) {
            if (this.field608.field1181 == 90) {
                var5.method137((byte) -125);
            }
            if (this.field608.field1181 == 180) {
                var5.method137((byte) -125);
                var5.method137((byte) -125);
            }
            if (this.field608.field1181 == 270) {
                var5.method137((byte) -125);
                var5.method137((byte) -125);
                var5.method137((byte) -125);
            }
        }
        var5.method143(this.field608.field1182 + 64, this.field608.field1183 + 850, -30, -50, -30, true);
        return var5;
    }
}
