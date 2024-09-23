import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "cb", name = "t", descriptor = "Lnc;")
    private SeqType field497;

    @OriginalMember(owner = "cb", name = "u", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field490 = arg3;
        this.field491 = arg4;
        this.field492 = arg5;
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
        this.field493 = arg2;
        this.field494 = arg9;
        this.field495 = arg1;
        this.field496 = arg6;
        this.field497 = SeqType.field1121[arg7];
        this.field498 = 0;
        this.field499 = client.field1618;
        if (arg8 && this.field497.field1126 != -1) {
            this.field498 = (int) (Math.random() * (double) this.field497.field1122);
            this.field499 -= (int) (Math.random() * (double) this.field497.method384(this.field498, (byte) 2));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (this.field497 != null) {
            int var2 = client.field1618 - this.field499;
            if (var2 > 100 && this.field497.field1126 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field497.method384(this.field498, (byte) 2)) {
                            break label38;
                        }
                        var2 -= this.field497.method384(this.field498, (byte) 2);
                        this.field498++;
                    } while (this.field498 < this.field497.field1122);
                    this.field498 -= this.field497.field1126;
                } while (this.field498 >= 0 && this.field498 < this.field497.field1122);
                this.field497 = null;
            }
            this.field499 = client.field1618 - var2;
        }
        int var3 = -1;
        if (this.field497 != null) {
            var3 = this.field497.field1123[this.field498];
        }
        LocType var4 = LocType.method334(this.field490);
        Model var5 = var4.method340(this.field491, this.field492, this.field493, this.field494, this.field495, this.field496, var3);
        if (arg0 != -28205) {
            throw new NullPointerException();
        }
        return var5;
    }
}
