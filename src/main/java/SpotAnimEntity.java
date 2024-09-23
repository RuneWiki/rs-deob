import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    private int field604 = 9;

    @OriginalMember(owner = "fb", name = "u", descriptor = "Z")
    public boolean field613 = false;

    @OriginalMember(owner = "fb", name = "m", descriptor = "Lpc;")
    private SpotAnimType field605;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "fb", name = "p", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "fb", name = "n", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field605 = SpotAnimType.field1165[arg3];
        this.field607 = arg1;
        this.field608 = arg2;
        this.field609 = arg7;
        this.field610 = arg5;
        this.field606 = arg0 + arg6;
        this.field613 = false;
        if (arg4 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method151(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field604 = -286;
        }
        this.field612 += arg0;
        while (true) {
            do {
                do {
                    if (this.field612 <= this.field605.field1169.method382((byte) -97, this.field611)) {
                        return;
                    }
                    this.field612 -= this.field605.field1169.method382((byte) -97, this.field611) + 1;
                    this.field611++;
                } while (this.field611 < this.field605.field1169.field1144);
            } while (this.field611 >= 0 && this.field611 < this.field605.field1169.field1144);
            this.field611 = 0;
            this.field613 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field605.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field605.field1169.field1145[this.field611];
        Model var4 = new Model(false, 201, var2, AnimFrame.method48(577, var3), true);
        if (!arg0) {
            throw new NullPointerException();
        }
        if (!this.field613) {
            var4.method133(5);
            var4.method134(0, var3);
            var4.field569 = null;
            var4.field568 = null;
        }
        if (this.field605.field1172 != 128 || this.field605.field1173 != 128) {
            var4.method142(this.field605.field1172, this.field605.field1173, this.field605.field1172, (byte) -119);
        }
        if (this.field605.field1174 != 0) {
            if (this.field605.field1174 == 90) {
                var4.method137((byte) -57);
            }
            if (this.field605.field1174 == 180) {
                var4.method137((byte) -57);
                var4.method137((byte) -57);
            }
            if (this.field605.field1174 == 270) {
                var4.method137((byte) -57);
                var4.method137((byte) -57);
                var4.method137((byte) -57);
            }
        }
        var4.method143(this.field605.field1175 + 64, this.field605.field1176 + 850, -30, -50, -30, true);
        return var4;
    }
}
