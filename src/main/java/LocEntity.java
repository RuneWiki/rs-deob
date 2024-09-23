import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "l", descriptor = "Z")
    private boolean field487 = true;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field488 = -7033;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "bb", name = "u", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "bb", name = "v", descriptor = "Lnc;")
    private SeqType field497;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "bb", name = "z", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "bb", name = "A", descriptor = "[I")
    public int[] field502;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Lclient;")
    public static client field489;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIZIIIIII)V")
    public LocEntity(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field488 != arg0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field490 = arg1;
        this.field491 = arg6;
        this.field492 = arg8;
        this.field493 = arg2;
        this.field494 = arg9;
        this.field495 = arg7;
        this.field496 = arg4;
        if (arg5 != -1) {
            this.field497 = SeqType.field1144[arg5];
            this.field498 = 0;
            this.field499 = client.field1300;
            if (arg3 && this.field497.field1149 != -1) {
                this.field498 = (int) (Math.random() * (double) this.field497.field1145);
                this.field499 -= (int) (Math.random() * (double) this.field497.method382(this.field498, -86));
            }
        }
        LocType var12 = LocType.method330(this.field490);
        this.field500 = var12.field993;
        this.field501 = var12.field994;
        this.field502 = var12.field992;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field497 != null) {
            int var4 = client.field1300 - this.field499;
            if (var4 > 100 && this.field497.field1149 > 0) {
                var4 = 100;
            }
            label46: {
                do {
                    do {
                        if (var4 <= this.field497.method382(this.field498, -86)) {
                            break label46;
                        }
                        var4 -= this.field497.method382(this.field498, -86);
                        this.field498++;
                    } while (this.field498 < this.field497.field1145);
                    this.field498 -= this.field497.field1149;
                } while (this.field498 >= 0 && this.field498 < this.field497.field1145);
                this.field497 = null;
            }
            this.field499 = client.field1300 - var4;
            if (this.field497 != null) {
                var2 = this.field497.field1146[this.field498];
            }
        }
        LocType var5;
        if (this.field502 == null) {
            var5 = LocType.method330(this.field490);
        } else {
            var5 = this.method119((byte) -115);
        }
        return var5 == null ? null : var5.method336(this.field491, this.field492, this.field493, this.field494, this.field495, this.field496, var2);
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Lec;")
    public final LocType method119(byte arg0) {
        int var2 = -1;
        if (arg0 != -115) {
            this.field487 = !this.field487;
        }
        if (this.field500 != -1) {
            VarbitType var3 = VarbitType.field1182[this.field500];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field1673[var6 - var5];
            var2 = field489.field1556[var4] >> var5 & var7;
        } else if (this.field501 != -1) {
            var2 = field489.field1556[this.field501];
        }
        return var2 < 0 || var2 >= this.field502.length || this.field502[var2] == -1 ? null : LocType.method330(this.field502[var2]);
    }
}
