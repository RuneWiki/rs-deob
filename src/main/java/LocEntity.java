import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "Z")
    private boolean field489 = false;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field490 = 650;

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

    @OriginalMember(owner = "cb", name = "t", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Lnc;")
    private SeqType field498;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "cb", name = "w", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IZIIIIIIII)V")
    public LocEntity(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        while (arg5 >= 0) {
            this.field489 = !this.field489;
        }
        this.field491 = arg8;
        this.field492 = arg9;
        this.field493 = arg7;
        this.field494 = arg0;
        this.field495 = arg4;
        this.field496 = arg6;
        this.field497 = arg2;
        this.field498 = SeqType.field1110[arg3];
        this.field499 = 0;
        this.field500 = client.field1633;
        if (arg1 && this.field498.field1115 != -1) {
            this.field499 = (int) (Math.random() * (double) this.field498.field1111);
            this.field500 -= (int) (Math.random() * (double) this.field498.method384(this.field499, true));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        int var2 = 79 / arg0;
        if (this.field498 != null) {
            int var3 = client.field1633 - this.field500;
            if (var3 > 100 && this.field498.field1115 > 0) {
                var3 = 100;
            }
            label34: {
                do {
                    do {
                        if (var3 <= this.field498.method384(this.field499, true)) {
                            break label34;
                        }
                        var3 -= this.field498.method384(this.field499, true);
                        this.field499++;
                    } while (this.field499 < this.field498.field1111);
                    this.field499 -= this.field498.field1115;
                } while (this.field499 >= 0 && this.field499 < this.field498.field1111);
                this.field498 = null;
            }
            this.field500 = client.field1633 - var3;
        }
        int var4 = -1;
        if (this.field498 != null) {
            var4 = this.field498.field1112[this.field499];
        }
        LocType var5 = LocType.method334(this.field491);
        return var5.method340(this.field492, this.field493, this.field494, this.field495, this.field496, this.field497, var4);
    }
}
