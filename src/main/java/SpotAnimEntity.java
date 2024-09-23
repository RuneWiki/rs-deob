import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "gb", name = "l", descriptor = "B")
    private byte field617 = 86;

    @OriginalMember(owner = "gb", name = "u", descriptor = "Z")
    public boolean field626 = false;

    @OriginalMember(owner = "gb", name = "m", descriptor = "Loc;")
    private SpotAnimType field618;

    @OriginalMember(owner = "gb", name = "o", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "gb", name = "p", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "gb", name = "q", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "gb", name = "r", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "gb", name = "n", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "gb", name = "s", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "gb", name = "t", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(IIBIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 9) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field618 = SpotAnimType.field1142[arg5];
        this.field620 = arg0;
        this.field621 = arg6;
        this.field622 = arg3;
        this.field623 = arg4;
        this.field619 = arg1 + arg7;
        this.field626 = false;
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IZ)V")
    public final void method163(int arg0, boolean arg1) {
        this.field625 += arg0;
        if (arg1) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field625 <= this.field618.field1146.method382(this.field624, 0)) {
                        return;
                    }
                    this.field625 -= this.field618.field1146.method382(this.field624, 0) + 1;
                    this.field624++;
                } while (this.field624 < this.field618.field1146.field1126);
            } while (this.field624 >= 0 && this.field624 < this.field618.field1146.field1126);
            this.field624 = 0;
            this.field626 = true;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (arg0 != -13634) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field618.method386();
        if (var3 == null) {
            return null;
        }
        Model var4 = new Model(true, var3, false, true, !this.field618.field1147);
        if (!this.field626) {
            var4.method145(this.field617);
            var4.method146(true, this.field618.field1146.field1127[this.field624]);
            var4.field582 = null;
            var4.field581 = null;
        }
        if (this.field618.field1150 != 128 || this.field618.field1151 != 128) {
            var4.method154(this.field618.field1150, this.field618.field1150, this.field618.field1151, 7);
        }
        if (this.field618.field1152 != 0) {
            if (this.field618.field1152 == 90) {
                var4.method149((byte) 53);
            }
            if (this.field618.field1152 == 180) {
                var4.method149((byte) 53);
                var4.method149((byte) 53);
            }
            if (this.field618.field1152 == 270) {
                var4.method149((byte) 53);
                var4.method149((byte) 53);
                var4.method149((byte) 53);
            }
        }
        var4.method155(this.field618.field1153 + 64, this.field618.field1154 + 850, -30, -50, -30, true);
        return var4;
    }
}
