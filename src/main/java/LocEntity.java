import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "cb", name = "t", descriptor = "Lmc;")
    private SeqType field490;

    @OriginalMember(owner = "cb", name = "u", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIIIIIZIII)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field483 = arg1;
        if (arg5 != 0) {
            this.field482 = -84;
        }
        this.field484 = arg0;
        this.field485 = arg4;
        this.field486 = arg9;
        this.field487 = arg7;
        this.field488 = arg2;
        this.field489 = arg8;
        this.field490 = SeqType.field1081[arg3];
        this.field491 = 0;
        this.field492 = client.field1433;
        if (arg6 && this.field490.field1086 != -1) {
            this.field491 = (int) (Math.random() * (double) this.field490.field1082);
            this.field492 -= (int) (Math.random() * (double) this.field490.method373(true, this.field491));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(Z)Lfb;")
    public final Model method121(boolean arg0) {
        if (this.field490 != null) {
            int var2 = client.field1433 - this.field492;
            if (var2 > 100 && this.field490.field1086 > 0) {
                var2 = 100;
            }
            label46: {
                do {
                    do {
                        if (var2 <= this.field490.method373(true, this.field491)) {
                            break label46;
                        }
                        var2 -= this.field490.method373(true, this.field491);
                        this.field491++;
                    } while (this.field491 < this.field490.field1082);
                    this.field491 -= this.field490.field1086;
                } while (this.field491 >= 0 && this.field491 < this.field490.field1082);
                this.field490 = null;
            }
            this.field492 = client.field1433 - var2;
        }
        int var3 = -1;
        if (this.field490 != null) {
            var3 = this.field490.field1083[this.field491];
        }
        LocType var4 = LocType.method324(this.field483);
        Model var5 = var4.method330(this.field484, this.field485, this.field486, this.field487, this.field488, this.field489, var3);
        if (arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5;
    }
}
