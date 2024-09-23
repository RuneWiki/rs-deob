import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "x", descriptor = "Z")
    public boolean field614 = false;

    @OriginalMember(owner = "fb", name = "p", descriptor = "Lpc;")
    private SpotAnimType field606;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "fb", name = "w", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field606 = SpotAnimType.field1157[arg1];
        this.field608 = arg6;
        this.field609 = arg3;
        if (!arg7) {
            throw new NullPointerException();
        }
        this.field610 = arg4;
        this.field611 = arg5;
        this.field607 = arg0 + arg2;
        this.field614 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method151(int arg0, int arg1) {
        this.field613 += arg0;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field613 <= this.field606.field1161.method382(36967, this.field612)) {
                        return;
                    }
                    this.field613 -= this.field606.field1161.method382(36967, this.field612) + 1;
                    this.field612++;
                } while (this.field612 < this.field606.field1161.field1135);
            } while (this.field612 >= 0 && this.field612 < this.field606.field1161.field1135);
            this.field612 = 0;
            this.field614 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field606.method386();
        if (arg0 != 0) {
            this.field605 = -197;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = this.field606.field1161.field1136[this.field612];
        Model var4 = new Model(var2, true, false, AnimFrame.method48(var3, -47594), 0);
        if (!this.field614) {
            var4.method133(0);
            var4.method134(428, var3);
            var4.field570 = null;
            var4.field569 = null;
        }
        if (this.field606.field1164 != 128 || this.field606.field1165 != 128) {
            var4.method142((byte) 4, this.field606.field1165, this.field606.field1164, this.field606.field1164);
        }
        if (this.field606.field1166 != 0) {
            if (this.field606.field1166 == 90) {
                var4.method137(0);
            }
            if (this.field606.field1166 == 180) {
                var4.method137(0);
                var4.method137(0);
            }
            if (this.field606.field1166 == 270) {
                var4.method137(0);
                var4.method137(0);
                var4.method137(0);
            }
        }
        var4.method143(this.field606.field1167 + 64, this.field606.field1168 + 850, -30, -50, -30, true);
        return var4;
    }
}
