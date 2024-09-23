import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "l", descriptor = "I")
    private int field630 = 724;

    @OriginalMember(owner = "gb", name = "m", descriptor = "B")
    private byte field631 = 0;

    @OriginalMember(owner = "gb", name = "v", descriptor = "Z")
    public boolean field640 = false;

    @OriginalMember(owner = "gb", name = "n", descriptor = "Lpc;")
    private SpotAnimType field632;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 0) {
            this.field630 = -117;
        }
        this.field632 = SpotAnimType.field1169[arg1];
        this.field634 = arg0;
        this.field635 = arg5;
        this.field636 = arg6;
        this.field637 = arg4;
        this.field633 = arg2 + arg7;
        this.field640 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(II)V")
    public final void method164(int arg0, int arg1) {
        this.field639 += arg0;
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            do {
                do {
                    if (this.field639 <= this.field632.field1173.method384(0, this.field638)) {
                        return;
                    }
                    this.field639 -= this.field632.field1173.method384(0, this.field638) + 1;
                    this.field638++;
                } while (this.field638 < this.field632.field1173.field1150);
            } while (this.field638 >= 0 && this.field638 < this.field632.field1173.field1150);
            this.field638 = 0;
            this.field640 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(B)Lfb;")
    public final Model method123(byte arg0) {
        Model var2 = this.field632.method388();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field632.field1173.field1151[this.field638];
        if (arg0 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        Model var5 = new Model(AnimFrame.method62((byte) 7, var3), false, true, true, var2);
        if (!this.field640) {
            var5.method146((byte) 107);
            var5.method147(this.field631, var3);
            var5.field595 = null;
            var5.field594 = null;
        }
        if (this.field632.field1176 != 128 || this.field632.field1177 != 128) {
            var5.method155(this.field632.field1176, this.field632.field1177, (byte) -121, this.field632.field1176);
        }
        if (this.field632.field1178 != 0) {
            if (this.field632.field1178 == 90) {
                var5.method150(880);
            }
            if (this.field632.field1178 == 180) {
                var5.method150(880);
                var5.method150(880);
            }
            if (this.field632.field1178 == 270) {
                var5.method150(880);
                var5.method150(880);
                var5.method150(880);
            }
        }
        var5.method156(this.field632.field1179 + 64, this.field632.field1180 + 850, -30, -50, -30, true);
        return var5;
    }
}
