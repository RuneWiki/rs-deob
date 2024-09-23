import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field482;

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

    @OriginalMember(owner = "bb", name = "t", descriptor = "Lnc;")
    private SeqType field489;

    @OriginalMember(owner = "bb", name = "u", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "bb", name = "y", descriptor = "[I")
    public int[] field494;

    @OriginalMember(owner = "bb", name = "l", descriptor = "Lclient;")
    public static client field481;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IZIIIBIIII)V")
    public LocEntity(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field482 = arg6;
        if (arg5 != 86) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field483 = arg2;
        this.field484 = arg3;
        this.field485 = arg8;
        this.field486 = arg4;
        this.field487 = arg7;
        this.field488 = arg9;
        if (arg0 != -1) {
            this.field489 = SeqType.field1143[arg0];
            this.field490 = 0;
            this.field491 = client.field1314;
            if (arg1 && this.field489.field1148 != -1) {
                this.field490 = (int) (Math.random() * (double) this.field489.field1144);
                this.field491 -= (int) (Math.random() * (double) this.field489.method382((byte) -97, this.field490));
            }
        }
        LocType var12 = LocType.method330(this.field482);
        this.field492 = var12.field992;
        this.field493 = var12.field993;
        this.field494 = var12.field991;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field489 != null) {
            int var4 = client.field1314 - this.field491;
            if (var4 > 100 && this.field489.field1148 > 0) {
                var4 = 100;
            }
            label46: {
                do {
                    do {
                        if (var4 <= this.field489.method382((byte) -97, this.field490)) {
                            break label46;
                        }
                        var4 -= this.field489.method382((byte) -97, this.field490);
                        this.field490++;
                    } while (this.field490 < this.field489.field1144);
                    this.field490 -= this.field489.field1148;
                } while (this.field490 >= 0 && this.field490 < this.field489.field1144);
                this.field489 = null;
            }
            this.field491 = client.field1314 - var4;
            if (this.field489 != null) {
                var2 = this.field489.field1145[this.field490];
            }
        }
        LocType var5;
        if (this.field494 == null) {
            var5 = LocType.method330(this.field482);
        } else {
            var5 = this.method119(33093);
        }
        return var5 == null ? null : var5.method336(this.field483, this.field484, this.field485, this.field486, this.field487, this.field488, var2);
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lec;")
    public final LocType method119(int arg0) {
        int var2 = -1;
        if (arg0 != 33093) {
            throw new NullPointerException();
        }
        if (this.field492 != -1) {
            VarbitType var3 = VarbitType.field1180[this.field492];
            int var4 = var3.field1182;
            int var5 = var3.field1183;
            int var6 = var3.field1184;
            int var7 = client.field1425[var6 - var5];
            var2 = field481.field1416[var4] >> var5 & var7;
        } else if (this.field493 != -1) {
            var2 = field481.field1416[this.field493];
        }
        return var2 < 0 || var2 >= this.field494.length || this.field494[var2] == -1 ? null : LocType.method330(this.field494[var2]);
    }
}
