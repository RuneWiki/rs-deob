import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "o", descriptor = "Z")
    private boolean field483 = true;

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

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "w", descriptor = "Lnc;")
    private SeqType field491;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IZIIIIIZII)V")
    public LocEntity(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field484 = arg9;
        this.field485 = arg0;
        this.field486 = arg8;
        this.field487 = arg2;
        if (arg1) {
            throw new NullPointerException();
        }
        this.field488 = arg5;
        this.field489 = arg4;
        this.field490 = arg3;
        this.field491 = SeqType.field1126[arg6];
        this.field492 = 0;
        this.field493 = client.field1330;
        if (arg7 && this.field491.field1131 != -1) {
            this.field492 = (int) (Math.random() * (double) this.field491.field1127);
            this.field493 -= (int) (Math.random() * (double) this.field491.method376(-346, this.field492));
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (this.field491 != null) {
            int var2 = client.field1330 - this.field493;
            if (var2 > 100 && this.field491.field1131 > 0) {
                var2 = 100;
            }
            label46: {
                do {
                    do {
                        if (var2 <= this.field491.method376(-346, this.field492)) {
                            break label46;
                        }
                        var2 -= this.field491.method376(-346, this.field492);
                        this.field492++;
                    } while (this.field492 < this.field491.field1127);
                    this.field492 -= this.field491.field1131;
                } while (this.field492 >= 0 && this.field492 < this.field491.field1127);
                this.field491 = null;
            }
            this.field493 = client.field1330 - var2;
        }
        int var3 = -1;
        if (this.field491 != null) {
            var3 = this.field491.field1128[this.field492];
        }
        LocType var4 = LocType.method326(this.field484);
        Model var5 = var4.method332(this.field485, this.field486, this.field487, this.field488, this.field489, this.field490, var3);
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var5;
    }
}
