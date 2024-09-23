import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "u", descriptor = "Z")
    public boolean field611 = false;

    @OriginalMember(owner = "fb", name = "m", descriptor = "Lpc;")
    private SpotAnimType field603;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field603 = SpotAnimType.field1154[arg6];
        if (arg4 != 0) {
            throw new NullPointerException();
        }
        this.field605 = arg3;
        this.field606 = arg2;
        this.field607 = arg1;
        this.field608 = arg5;
        this.field604 = arg0 + arg7;
        this.field611 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        this.field610 += arg1;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field610 <= this.field603.field1158.method375(this.field609, 41645)) {
                        return;
                    }
                    this.field610 -= this.field603.field1158.method375(this.field609, 41645) + 1;
                    this.field609++;
                } while (this.field609 < this.field603.field1158.field1134);
            } while (this.field609 >= 0 && this.field609 < this.field603.field1158.field1134);
            this.field609 = 0;
            this.field611 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field603.method379();
        if (arg0) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = this.field603.field1158.field1135[this.field609];
            Model var4 = new Model(true, AnimFrame.method48(var3, 0), var2, true, false);
            if (!this.field611) {
                var4.method132(9);
                var4.method133(var3, -284);
                var4.field568 = null;
                var4.field567 = null;
            }
            if (this.field603.field1161 != 128 || this.field603.field1162 != 128) {
                var4.method141(9, this.field603.field1161, this.field603.field1161, this.field603.field1162);
            }
            if (this.field603.field1163 != 0) {
                if (this.field603.field1163 == 90) {
                    var4.method136((byte) 89);
                }
                if (this.field603.field1163 == 180) {
                    var4.method136((byte) 89);
                    var4.method136((byte) 89);
                }
                if (this.field603.field1163 == 270) {
                    var4.method136((byte) 89);
                    var4.method136((byte) 89);
                    var4.method136((byte) 89);
                }
            }
            var4.method142(this.field603.field1164 + 64, this.field603.field1165 + 850, -30, -50, -30, true);
            return var4;
        }
    }
}
