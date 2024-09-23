import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field485 = -533;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "u", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "v", descriptor = "Lnc;")
    private SeqType field494;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "bb", name = "z", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "bb", name = "A", descriptor = "[I")
    public int[] field499;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Lclient;")
    public static client field486;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIZIIIII)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field487 = arg9;
        this.field488 = arg7;
        this.field489 = arg5;
        if (arg2 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field490 = arg3;
        this.field491 = arg6;
        this.field492 = arg1;
        this.field493 = arg8;
        if (arg0 != -1) {
            this.field494 = SeqType.field1135[arg0];
            this.field495 = 0;
            this.field496 = client.field1275;
            if (arg4 && this.field494.field1140 != -1) {
                this.field495 = (int) (Math.random() * (double) this.field494.field1136);
                this.field496 -= (int) (Math.random() * (double) this.field494.method382(this.field495, 0));
            }
        }
        LocType var12 = LocType.method330(this.field487);
        this.field497 = var12.field987;
        this.field498 = var12.field988;
        this.field499 = var12.field986;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        int var2 = -1;
        if (this.field494 != null) {
            int var3 = client.field1275 - this.field496;
            if (var3 > 100 && this.field494.field1140 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field494.method382(this.field495, 0)) {
                            break label45;
                        }
                        var3 -= this.field494.method382(this.field495, 0);
                        this.field495++;
                    } while (this.field495 < this.field494.field1136);
                    this.field495 -= this.field494.field1140;
                } while (this.field495 >= 0 && this.field495 < this.field494.field1136);
                this.field494 = null;
            }
            this.field496 = client.field1275 - var3;
            if (this.field494 != null) {
                var2 = this.field494.field1137[this.field495];
            }
        }
        LocType var4;
        if (this.field499 == null) {
            var4 = LocType.method330(this.field487);
        } else {
            var4 = this.method119(this.field485);
        }
        if (var4 == null) {
            return null;
        }
        Model var5 = var4.method336(this.field488, this.field489, this.field490, this.field491, this.field492, this.field493, var2);
        if (arg0 != -67) {
            throw new NullPointerException();
        }
        return var5;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lec;")
    public final LocType method119(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field497 != -1) {
            VarbitType var4 = VarbitType.field1172[this.field497];
            int var5 = var4.field1174;
            int var6 = var4.field1175;
            int var7 = var4.field1176;
            int var8 = client.field1520[var7 - var6];
            var2 = field486.field1227[var5] >> var6 & var8;
        } else if (this.field498 != -1) {
            var2 = field486.field1227[this.field498];
        }
        return var2 < 0 || var2 >= this.field499.length || this.field499[var2] == -1 ? null : LocType.method330(this.field499[var2]);
    }
}
