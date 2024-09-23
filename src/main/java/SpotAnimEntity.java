import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    private int field604 = 393;

    @OriginalMember(owner = "fb", name = "w", descriptor = "Z")
    public boolean field613 = false;

    @OriginalMember(owner = "fb", name = "o", descriptor = "Lpc;")
    private SpotAnimType field605;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "fb", name = "m", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIZIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        this.field605 = SpotAnimType.field1173[arg6];
        if (!arg4) {
            this.field604 = 385;
        }
        this.field607 = arg1;
        this.field608 = arg0;
        this.field609 = arg5;
        this.field610 = arg2;
        this.field606 = arg3 + arg7;
        this.field613 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        if (arg0 <= 0) {
            return;
        }
        this.field612 += arg1;
        while (true) {
            do {
                do {
                    if (this.field612 <= this.field605.field1177.method378(this.field611, 24425)) {
                        return;
                    }
                    this.field612 -= this.field605.field1177.method378(this.field611, 24425) + 1;
                    this.field611++;
                } while (this.field611 < this.field605.field1177.field1151);
            } while (this.field611 >= 0 && this.field611 < this.field605.field1177.field1151);
            this.field611 = 0;
            this.field613 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != -37770) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field605.method382();
        if (var3 == null) {
            return null;
        }
        int var4 = this.field605.field1177.field1152[this.field611];
        Model var5 = new Model(var3, AnimFrame.method48(var4, 0), false, this.field603, true);
        if (!this.field613) {
            var5.method132((byte) 3);
            var5.method133(var4, 188);
            var5.field568 = null;
            var5.field567 = null;
        }
        if (this.field605.field1180 != 128 || this.field605.field1181 != 128) {
            var5.method141(this.field605.field1180, this.field605.field1180, this.field605.field1181, (byte) 31);
        }
        if (this.field605.field1182 != 0) {
            if (this.field605.field1182 == 90) {
                var5.method136(0);
            }
            if (this.field605.field1182 == 180) {
                var5.method136(0);
                var5.method136(0);
            }
            if (this.field605.field1182 == 270) {
                var5.method136(0);
                var5.method136(0);
                var5.method136(0);
            }
        }
        var5.method142(this.field605.field1183 + 64, this.field605.field1184 + 850, -30, -50, -30, true);
        return var5;
    }
}
