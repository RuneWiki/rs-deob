import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "l", descriptor = "Z")
    private boolean field599 = false;

    @OriginalMember(owner = "fb", name = "u", descriptor = "Z")
    public boolean field608 = false;

    @OriginalMember(owner = "fb", name = "m", descriptor = "Lpc;")
    private SpotAnimType field600;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field605;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field600 = SpotAnimType.field1153[arg5];
        this.field602 = arg3;
        this.field603 = arg1;
        this.field604 = arg7;
        this.field605 = arg2;
        if (arg6 >= 0) {
            throw new NullPointerException();
        }
        this.field601 = arg0 + arg4;
        this.field608 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        if (arg0 != 8) {
            return;
        }
        this.field607 += arg1;
        while (true) {
            do {
                do {
                    if (this.field607 <= this.field600.field1157.method375(0, this.field606)) {
                        return;
                    }
                    this.field607 -= this.field600.field1157.method375(0, this.field606) + 1;
                    this.field606++;
                } while (this.field606 < this.field600.field1157.field1132);
            } while (this.field606 >= 0 && this.field606 < this.field600.field1157.field1132);
            this.field606 = 0;
            this.field608 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field600.method379();
        if (arg0 != 0) {
            this.field599 = !this.field599;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = this.field600.field1157.field1133[this.field606];
        Model var4 = new Model(false, true, var2, AnimFrame.method48(var3, 681), 9);
        if (!this.field608) {
            var4.method132(1);
            var4.method133(var3, false);
            var4.field564 = null;
            var4.field563 = null;
        }
        if (this.field600.field1160 != 128 || this.field600.field1161 != 128) {
            var4.method141(this.field600.field1160, this.field600.field1161, 9, this.field600.field1160);
        }
        if (this.field600.field1162 != 0) {
            if (this.field600.field1162 == 90) {
                var4.method136((byte) 4);
            }
            if (this.field600.field1162 == 180) {
                var4.method136((byte) 4);
                var4.method136((byte) 4);
            }
            if (this.field600.field1162 == 270) {
                var4.method136((byte) 4);
                var4.method136((byte) 4);
                var4.method136((byte) 4);
            }
        }
        var4.method142(this.field600.field1163 + 64, this.field600.field1164 + 850, -30, -50, -30, true);
        return var4;
    }
}
