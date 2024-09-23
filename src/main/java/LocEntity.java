import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "o", descriptor = "Z")
    private boolean field483 = false;

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

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "x", descriptor = "Lnc;")
    private SeqType field492;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "z", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "bb", name = "A", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "bb", name = "B", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "bb", name = "C", descriptor = "[I")
    public int[] field497;

    @OriginalMember(owner = "bb", name = "p", descriptor = "Lclient;")
    public static client field484;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IZIIIIIIII)V")
    public LocEntity(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field485 = arg0;
        this.field486 = arg4;
        this.field487 = arg9;
        this.field488 = arg3;
        this.field489 = arg7;
        while (arg8 >= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        this.field490 = arg6;
        this.field491 = arg2;
        if (arg5 != -1) {
            this.field492 = SeqType.field1134[arg5];
            this.field493 = 0;
            this.field494 = client.field1279;
            if (arg1 && this.field492.field1139 != -1) {
                this.field493 = (int) (Math.random() * (double) this.field492.field1135);
                this.field494 -= (int) (Math.random() * (double) this.field492.method382(36967, this.field493));
            }
        }
        LocType var11 = LocType.method330(this.field485);
        this.field495 = var11.field979;
        this.field496 = var11.field980;
        this.field497 = var11.field978;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        int var2 = -1;
        if (this.field492 != null) {
            int var3 = client.field1279 - this.field494;
            if (var3 > 100 && this.field492.field1139 > 0) {
                var3 = 100;
            }
            label50: {
                do {
                    do {
                        if (var3 <= this.field492.method382(36967, this.field493)) {
                            break label50;
                        }
                        var3 -= this.field492.method382(36967, this.field493);
                        this.field493++;
                    } while (this.field493 < this.field492.field1135);
                    this.field493 -= this.field492.field1139;
                } while (this.field493 >= 0 && this.field493 < this.field492.field1135);
                this.field492 = null;
            }
            this.field494 = client.field1279 - var3;
            if (this.field492 != null) {
                var2 = this.field492.field1136[this.field493];
            }
        }
        if (arg0 != 0) {
            this.field483 = !this.field483;
        }
        LocType var4;
        if (this.field497 == null) {
            var4 = LocType.method330(this.field485);
        } else {
            var4 = this.method119((byte) 1);
        }
        return var4 == null ? null : var4.method336(this.field486, this.field487, this.field488, this.field489, this.field490, this.field491, var2);
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Lec;")
    public final LocType method119(byte arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field495 != -1) {
            VarbitType var4 = VarbitType.field1172[this.field495];
            int var5 = var4.field1174;
            int var6 = var4.field1175;
            int var7 = var4.field1176;
            int var8 = client.field1349[var7 - var6];
            var3 = field484.field1359[var5] >> var6 & var8;
        } else if (this.field496 != -1) {
            var3 = field484.field1359[this.field496];
        }
        return var3 < 0 || var3 >= this.field497.length || this.field497[var3] == -1 ? null : LocType.method330(this.field497[var3]);
    }
}
