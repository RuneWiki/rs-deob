import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field496 = 942;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Z")
    private boolean field497 = true;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "bb", name = "u", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "bb", name = "w", descriptor = "Lnc;")
    private SeqType field506;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "bb", name = "z", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "bb", name = "A", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "bb", name = "B", descriptor = "[I")
    public int[] field511;

    @OriginalMember(owner = "bb", name = "o", descriptor = "Lclient;")
    public static client field498;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIZIIB)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, byte arg9) {
        if (arg9 != 87) {
            this.field496 = -80;
        }
        this.field499 = arg1;
        this.field500 = arg0;
        this.field501 = arg4;
        this.field502 = arg2;
        this.field503 = arg7;
        this.field504 = arg8;
        this.field505 = arg3;
        if (arg5 != -1) {
            this.field506 = SeqType.field1145[arg5];
            this.field507 = 0;
            this.field508 = client.field1311;
            if (arg6 && this.field506.field1150 != -1) {
                this.field507 = (int) (Math.random() * (double) this.field506.field1146);
                this.field508 -= (int) (Math.random() * (double) this.field506.method382(this.field507, this.field497));
            }
        }
        LocType var11 = LocType.method330(this.field499);
        this.field509 = var11.field995;
        this.field510 = var11.field996;
        this.field511 = var11.field994;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        int var2 = -1;
        if (this.field506 != null) {
            int var3 = client.field1311 - this.field508;
            if (var3 > 100 && this.field506.field1150 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field506.method382(this.field507, this.field497)) {
                            break label45;
                        }
                        var3 -= this.field506.method382(this.field507, this.field497);
                        this.field507++;
                    } while (this.field507 < this.field506.field1146);
                    this.field507 -= this.field506.field1150;
                } while (this.field507 >= 0 && this.field507 < this.field506.field1146);
                this.field506 = null;
            }
            this.field508 = client.field1311 - var3;
            if (this.field506 != null) {
                var2 = this.field506.field1147[this.field507];
            }
        }
        if (arg0 != -47094) {
            throw new NullPointerException();
        }
        LocType var4;
        if (this.field511 == null) {
            var4 = LocType.method330(this.field499);
        } else {
            var4 = this.method119(0);
        }
        return var4 == null ? null : var4.method336(this.field500, this.field501, this.field502, this.field503, this.field504, this.field505, var2);
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(I)Lec;")
    public final LocType method119(int arg0) {
        int var2 = -1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field509 != -1) {
            VarbitType var4 = VarbitType.field1182[this.field509];
            int var5 = var4.field1184;
            int var6 = var4.field1185;
            int var7 = var4.field1186;
            int var8 = client.field1671[var7 - var6];
            var2 = field498.field1593[var5] >> var6 & var8;
        } else if (this.field510 != -1) {
            var2 = field498.field1593[this.field510];
        }
        return var2 < 0 || var2 >= this.field511.length || this.field511[var2] == -1 ? null : LocType.method330(this.field511[var2]);
    }
}
