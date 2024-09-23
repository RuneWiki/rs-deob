import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "cb", name = "t", descriptor = "Lnc;")
    private SeqType field498;

    @OriginalMember(owner = "cb", name = "u", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIIIIIIZII)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field491 = arg3;
        this.field492 = arg0;
        this.field493 = arg1;
        this.field494 = arg2;
        this.field495 = arg9;
        this.field496 = arg5;
        this.field497 = arg6;
        this.field498 = SeqType.field1112[arg8];
        this.field499 = 0;
        if (arg4 != 10550) {
            throw new NullPointerException();
        }
        this.field500 = client.field1591;
        if (arg7 && this.field498.field1117 != -1) {
            this.field499 = (int) (Math.random() * (double) this.field498.field1113);
            this.field500 -= (int) (Math.random() * (double) this.field498.method384((byte) -103, this.field499));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (this.field498 != null) {
            int var2 = client.field1591 - this.field500;
            if (var2 > 100 && this.field498.field1117 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field498.method384((byte) -103, this.field499)) {
                            break label38;
                        }
                        var2 -= this.field498.method384((byte) -103, this.field499);
                        this.field499++;
                    } while (this.field499 < this.field498.field1113);
                    this.field499 -= this.field498.field1117;
                } while (this.field499 >= 0 && this.field499 < this.field498.field1113);
                this.field498 = null;
            }
            this.field500 = client.field1591 - var2;
        }
        int var3 = -1;
        if (this.field498 != null) {
            var3 = this.field498.field1114[this.field499];
        }
        LocType var4 = LocType.method334(this.field491);
        Model var5 = var4.method340(this.field492, this.field493, this.field494, this.field495, this.field496, this.field497, var3);
        if (arg0 != 45160) {
            throw new NullPointerException();
        }
        return var5;
    }
}
