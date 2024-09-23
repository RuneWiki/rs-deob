import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "n", descriptor = "Z")
    private boolean field482 = false;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "bb", name = "u", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "bb", name = "v", descriptor = "Lnc;")
    private SeqType field490;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIZIII)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field483 = arg3;
        this.field484 = arg0;
        this.field485 = arg1;
        this.field486 = arg9;
        this.field487 = arg7;
        this.field488 = arg4;
        this.field489 = arg8;
        this.field490 = SeqType.field1133[arg2];
        this.field491 = 0;
        this.field492 = client.field1218;
        if (arg5 != 0) {
            this.field481 = 429;
        }
        if (arg6 && this.field490.field1138 != -1) {
            this.field491 = (int) (Math.random() * (double) this.field490.field1134);
            this.field492 -= (int) (Math.random() * (double) this.field490.method375(this.field491, 41645));
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (this.field490 != null) {
            int var2 = client.field1218 - this.field492;
            if (var2 > 100 && this.field490.field1138 > 0) {
                var2 = 100;
            }
            label43: {
                do {
                    do {
                        if (var2 <= this.field490.method375(this.field491, 41645)) {
                            break label43;
                        }
                        var2 -= this.field490.method375(this.field491, 41645);
                        this.field491++;
                    } while (this.field491 < this.field490.field1134);
                    this.field491 -= this.field490.field1138;
                } while (this.field491 >= 0 && this.field491 < this.field490.field1134);
                this.field490 = null;
            }
            this.field492 = client.field1218 - var2;
        }
        int var3 = -1;
        if (arg0) {
            this.field482 = !this.field482;
        }
        if (this.field490 != null) {
            var3 = this.field490.field1135[this.field491];
        }
        LocType var4 = LocType.method325(this.field483);
        return var4.method331(this.field484, this.field485, this.field486, this.field487, this.field488, this.field489, var3);
    }
}
