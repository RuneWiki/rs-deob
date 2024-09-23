import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "bb", name = "u", descriptor = "Lnc;")
    private SeqType field490;

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "bb", name = "y", descriptor = "[I")
    public int[] field494;

    @OriginalMember(owner = "bb", name = "m", descriptor = "Lclient;")
    public static client field482;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIZIIZI)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field483 = arg1;
        this.field484 = arg2;
        this.field485 = arg0;
        this.field486 = arg6;
        this.field487 = arg9;
        this.field488 = arg4;
        this.field489 = arg3;
        if (arg5) {
            throw new NullPointerException();
        }
        if (arg7 != -1) {
            this.field490 = SeqType.field1150[arg7];
            this.field491 = 0;
            this.field492 = client.field1661;
            if (arg8 && this.field490.field1155 != -1) {
                this.field491 = (int) (Math.random() * (double) this.field490.field1151);
                this.field492 -= (int) (Math.random() * (double) this.field490.method378(this.field491, 24425));
            }
        }
        LocType var11 = LocType.method328(this.field483);
        this.field493 = var11.field992;
        this.field494 = var11.field993;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 != -37770) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field490 != null) {
            int var4 = client.field1661 - this.field492;
            if (var4 > 100 && this.field490.field1155 > 0) {
                var4 = 100;
            }
            label54: {
                do {
                    do {
                        if (var4 <= this.field490.method378(this.field491, 24425)) {
                            break label54;
                        }
                        var4 -= this.field490.method378(this.field491, 24425);
                        this.field491++;
                    } while (this.field491 < this.field490.field1151);
                    this.field491 -= this.field490.field1155;
                } while (this.field491 >= 0 && this.field491 < this.field490.field1151);
                this.field490 = null;
            }
            this.field492 = client.field1661 - var4;
            var3 = this.field490.field1152[this.field491];
        }
        LocType var11;
        if (this.field494 == null) {
            var11 = LocType.method328(this.field483);
        } else {
            VarbitType var5 = VarbitType.field1188[this.field493];
            int var6 = var5.field1190;
            int var7 = var5.field1191;
            int var8 = var5.field1192;
            int var9 = client.field1509[var8 - var7];
            int var10 = field482.field1635[var6] >> var7 & var9;
            if (var10 < 0 || var10 >= this.field494.length || this.field494[var10] == -1) {
                return null;
            }
            var11 = LocType.method328(this.field494[var10]);
        }
        return var11.method334(this.field484, this.field485, this.field486, this.field487, this.field488, this.field489, var3);
    }
}
