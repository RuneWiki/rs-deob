import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    private int field488 = 977;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "bb", name = "u", descriptor = "Lnc;")
    private SeqType field497;

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "bb", name = "z", descriptor = "[I")
    public int[] field502;

    @OriginalMember(owner = "bb", name = "m", descriptor = "Lclient;")
    public static client field489;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field490 = arg0;
        this.field491 = arg1;
        this.field492 = arg5;
        this.field493 = arg6;
        this.field494 = arg3;
        this.field495 = arg7;
        this.field496 = arg2;
        if (arg4 != -1) {
            this.field497 = SeqType.field1155[arg4];
            this.field498 = 0;
            this.field499 = client.field1403;
            if (arg8 && this.field497.field1160 != -1) {
                this.field498 = (int) (Math.random() * (double) this.field497.field1156);
                this.field499 -= (int) (Math.random() * (double) this.field497.method382(this.field498, this.field488));
            }
        }
        LocType var11 = LocType.method330(this.field490);
        this.field500 = var11.field993;
        this.field501 = var11.field994;
        int var12 = 80 / arg9;
        this.field502 = var11.field992;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        int var2 = -1;
        if (this.field497 != null) {
            int var3 = client.field1403 - this.field499;
            if (var3 > 100 && this.field497.field1160 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field497.method382(this.field498, this.field488)) {
                            break label45;
                        }
                        var3 -= this.field497.method382(this.field498, this.field488);
                        this.field498++;
                    } while (this.field498 < this.field497.field1156);
                    this.field498 -= this.field497.field1160;
                } while (this.field498 >= 0 && this.field498 < this.field497.field1156);
                this.field497 = null;
            }
            this.field499 = client.field1403 - var3;
            if (this.field497 != null) {
                var2 = this.field497.field1157[this.field498];
            }
        }
        LocType var4;
        if (this.field502 == null) {
            var4 = LocType.method330(this.field490);
        } else {
            var4 = this.method119((byte) 4);
        }
        if (var4 == null) {
            return null;
        }
        Model var5 = var4.method336(this.field491, this.field492, this.field493, this.field494, this.field495, this.field496, var2);
        if (arg0 != -59) {
            throw new NullPointerException();
        }
        return var5;
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(B)Lec;")
    public final LocType method119(byte arg0) {
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field500 != -1) {
            VarbitType var3 = VarbitType.field1192[this.field500];
            int var4 = var3.field1194;
            int var5 = var3.field1195;
            int var6 = var3.field1196;
            int var7 = client.field1379[var6 - var5];
            var2 = field489.field1249[var4] >> var5 & var7;
        } else if (this.field501 != -1) {
            var2 = field489.field1249[this.field501];
        }
        return var2 < 0 || var2 >= this.field502.length || this.field502[var2] == -1 ? null : LocType.method330(this.field502[var2]);
    }
}
