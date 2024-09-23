import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "Z")
    private boolean field475 = true;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field476 = 705;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "cb", name = "t", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "cb", name = "u", descriptor = "Lmc;")
    private SeqType field484;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "cb", name = "w", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIIIIIIZII)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field477 = arg4;
        this.field478 = arg8;
        this.field479 = arg1;
        this.field480 = arg0;
        this.field481 = arg3;
        this.field482 = arg5;
        this.field483 = arg9;
        this.field484 = SeqType.field1069[arg6];
        this.field485 = 0;
        if (arg2 <= 0) {
            this.field475 = !this.field475;
        }
        this.field486 = client.field1288;
        if (arg7 && this.field484.field1074 != -1) {
            this.field485 = (int) (Math.random() * (double) this.field484.field1070);
            this.field486 -= (int) (Math.random() * (double) this.field484.method369(7, this.field485));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Lfb;")
    public final Model method121(int arg0) {
        if (this.field484 != null) {
            int var2 = client.field1288 - this.field486;
            if (var2 > 100 && this.field484.field1074 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field484.method369(7, this.field485)) {
                            break label38;
                        }
                        var2 -= this.field484.method369(7, this.field485);
                        this.field485++;
                    } while (this.field485 < this.field484.field1070);
                    this.field485 -= this.field484.field1074;
                } while (this.field485 >= 0 && this.field485 < this.field484.field1070);
                this.field484 = null;
            }
            this.field486 = client.field1288 - var2;
        }
        int var3 = -1;
        if (this.field484 != null) {
            var3 = this.field484.field1071[this.field485];
        }
        LocType var4 = LocType.method320(this.field477);
        Model var5 = var4.method326(this.field478, this.field479, this.field480, this.field481, this.field482, this.field483, var3);
        if (arg0 != 0) {
            this.field476 = -78;
        }
        return var5;
    }
}
