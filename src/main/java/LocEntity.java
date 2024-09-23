import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "l", descriptor = "Z")
    private boolean field485 = false;

    @OriginalMember(owner = "bb", name = "m", descriptor = "B")
    private byte field486 = -70;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "u", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "bb", name = "v", descriptor = "Lnc;")
    private SeqType field495;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "bb", name = "x", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "bb", name = "y", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "bb", name = "z", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "bb", name = "A", descriptor = "[I")
    public int[] field500;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Lclient;")
    public static client field487;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IZIIIIIIII)V")
    public LocEntity(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field488 = arg8;
        this.field489 = arg2;
        this.field490 = arg7;
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        this.field491 = arg4;
        this.field492 = arg5;
        this.field493 = arg6;
        this.field494 = arg0;
        if (arg9 != -1) {
            this.field495 = SeqType.field1149[arg9];
            this.field496 = 0;
            this.field497 = client.field1401;
            if (arg1 && this.field495.field1154 != -1) {
                this.field496 = (int) (Math.random() * (double) this.field495.field1150);
                this.field497 -= (int) (Math.random() * (double) this.field495.method382(-574, this.field496));
            }
        }
        LocType var11 = LocType.method330(this.field488);
        this.field498 = var11.field1000;
        this.field499 = var11.field1001;
        this.field500 = var11.field999;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        int var2 = -1;
        if (this.field495 != null) {
            int var3 = client.field1401 - this.field497;
            if (var3 > 100 && this.field495.field1154 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field495.method382(-574, this.field496)) {
                            break label45;
                        }
                        var3 -= this.field495.method382(-574, this.field496);
                        this.field496++;
                    } while (this.field496 < this.field495.field1150);
                    this.field496 -= this.field495.field1154;
                } while (this.field496 >= 0 && this.field496 < this.field495.field1150);
                this.field495 = null;
            }
            this.field497 = client.field1401 - var3;
            if (this.field495 != null) {
                var2 = this.field495.field1151[this.field496];
            }
        }
        LocType var4;
        if (this.field500 == null) {
            var4 = LocType.method330(this.field488);
        } else {
            var4 = this.method119(this.field486);
        }
        if (var4 == null) {
            return null;
        }
        Model var5 = var4.method336(this.field489, this.field490, this.field491, this.field492, this.field493, this.field494, var2);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var5;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Lec;")
    public final LocType method119(byte arg0) {
        int var2 = -1;
        if (this.field486 != arg0) {
            this.field485 = !this.field485;
        }
        if (this.field498 != -1) {
            VarbitType var3 = VarbitType.field1186[this.field498];
            int var4 = var3.field1188;
            int var5 = var3.field1189;
            int var6 = var3.field1190;
            int var7 = client.field1344[var6 - var5];
            var2 = field487.field1384[var4] >> var5 & var7;
        } else if (this.field499 != -1) {
            var2 = field487.field1384[this.field499];
        }
        return var2 < 0 || var2 >= this.field500.length || this.field500[var2] == -1 ? null : LocType.method330(this.field500[var2]);
    }
}
