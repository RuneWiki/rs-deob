import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "Z")
    private boolean field487 = false;

    @OriginalMember(owner = "cb", name = "m", descriptor = "Z")
    private boolean field488 = false;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "cb", name = "t", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Lnc;")
    private SeqType field496;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "cb", name = "w", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIIZIIZIII)V")
    public LocEntity(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field489 = arg8;
        this.field490 = arg4;
        if (!arg3) {
            this.field487 = !this.field487;
        }
        this.field491 = arg5;
        this.field492 = arg2;
        this.field493 = arg7;
        this.field494 = arg1;
        this.field495 = arg0;
        this.field496 = SeqType.field1120[arg9];
        this.field497 = 0;
        this.field498 = client.field1588;
        if (arg6 && this.field496.field1125 != -1) {
            this.field497 = (int) (Math.random() * (double) this.field496.field1121);
            this.field498 -= (int) (Math.random() * (double) this.field496.method382(0, this.field497));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (arg0 != 5560) {
            this.field488 = !this.field488;
        }
        if (this.field496 != null) {
            int var2 = client.field1588 - this.field498;
            if (var2 > 100 && this.field496.field1125 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field496.method382(0, this.field497)) {
                            break label42;
                        }
                        var2 -= this.field496.method382(0, this.field497);
                        this.field497++;
                    } while (this.field497 < this.field496.field1121);
                    this.field497 -= this.field496.field1125;
                } while (this.field497 >= 0 && this.field497 < this.field496.field1121);
                this.field496 = null;
            }
            this.field498 = client.field1588 - var2;
        }
        int var3 = -1;
        if (this.field496 != null) {
            var3 = this.field496.field1122[this.field497];
        }
        LocType var4 = LocType.method333(this.field489);
        return var4.method339(this.field490, this.field491, this.field492, this.field493, this.field494, this.field495, var3);
    }
}
