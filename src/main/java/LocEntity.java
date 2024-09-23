import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    private int field479 = 584;

    @OriginalMember(owner = "bb", name = "m", descriptor = "Z")
    private boolean field480 = true;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "bb", name = "u", descriptor = "Lnc;")
    private SeqType field488;

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIBIIZIII)V")
    public LocEntity(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field481 = arg0;
        this.field482 = arg1;
        if (arg3 != 3) {
            this.field480 = !this.field480;
        }
        this.field483 = arg7;
        this.field484 = arg5;
        this.field485 = arg2;
        this.field486 = arg9;
        this.field487 = arg8;
        this.field488 = SeqType.field1131[arg4];
        this.field489 = 0;
        this.field490 = client.field1610;
        if (arg6 && this.field488.field1136 != -1) {
            this.field489 = (int) (Math.random() * (double) this.field488.field1132);
            this.field490 -= (int) (Math.random() * (double) this.field488.method375(0, this.field489));
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field488 != null) {
            int var2 = client.field1610 - this.field490;
            if (var2 > 100 && this.field488.field1136 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field488.method375(0, this.field489)) {
                            break label38;
                        }
                        var2 -= this.field488.method375(0, this.field489);
                        this.field489++;
                    } while (this.field489 < this.field488.field1132);
                    this.field489 -= this.field488.field1136;
                } while (this.field489 >= 0 && this.field489 < this.field488.field1132);
                this.field488 = null;
            }
            this.field490 = client.field1610 - var2;
        }
        int var3 = -1;
        if (this.field488 != null) {
            var3 = this.field488.field1133[this.field489];
        }
        LocType var4 = LocType.method325(this.field481);
        Model var5 = var4.method331(this.field482, this.field483, this.field484, this.field485, this.field486, this.field487, var3);
        if (arg0 != 0) {
            this.field479 = 7;
        }
        return var5;
    }
}
