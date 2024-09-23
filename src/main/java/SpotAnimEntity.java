import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "m", descriptor = "I")
    private int field615 = 977;

    @OriginalMember(owner = "fb", name = "n", descriptor = "Z")
    private boolean field616 = false;

    @OriginalMember(owner = "fb", name = "o", descriptor = "Z")
    private boolean field617 = true;

    @OriginalMember(owner = "fb", name = "x", descriptor = "Z")
    public boolean field626 = false;

    @OriginalMember(owner = "fb", name = "p", descriptor = "Lpc;")
    private SpotAnimType field618;

    @OriginalMember(owner = "fb", name = "r", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "fb", name = "q", descriptor = "I")
    public int field619;

    @OriginalMember(owner = "fb", name = "l", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "fb", name = "w", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field618 = SpotAnimType.field1177[arg1];
        this.field620 = arg3;
        this.field621 = arg7;
        this.field622 = arg4;
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
        this.field623 = arg6;
        this.field619 = arg2 + arg5;
        this.field626 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(II)V")
    public final void method151(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field617 = !this.field617;
        }
        this.field625 += arg1;
        while (true) {
            do {
                do {
                    if (this.field625 <= this.field618.field1181.method382(this.field624, this.field615)) {
                        return;
                    }
                    this.field625 -= this.field618.field1181.method382(this.field624, this.field615) + 1;
                    this.field624++;
                } while (this.field624 < this.field618.field1181.field1156);
            } while (this.field624 >= 0 && this.field624 < this.field618.field1181.field1156);
            this.field624 = 0;
            this.field626 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        Model var2 = this.field618.method386();
        if (arg0 != -59) {
            this.field616 = !this.field616;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = this.field618.field1181.field1157[this.field624];
        Model var4 = new Model(AnimFrame.method48(var3, 0), false, 0, true, var2);
        if (!this.field626) {
            var4.method133(this.field614);
            var4.method134(-37879, var3);
            var4.field579 = null;
            var4.field578 = null;
        }
        if (this.field618.field1184 != 128 || this.field618.field1185 != 128) {
            var4.method142(this.field618.field1185, this.field618.field1184, false, this.field618.field1184);
        }
        if (this.field618.field1186 != 0) {
            if (this.field618.field1186 == 90) {
                var4.method137(true);
            }
            if (this.field618.field1186 == 180) {
                var4.method137(true);
                var4.method137(true);
            }
            if (this.field618.field1186 == 270) {
                var4.method137(true);
                var4.method137(true);
                var4.method137(true);
            }
        }
        var4.method143(this.field618.field1187 + 64, this.field618.field1188 + 850, -30, -50, -30, true);
        return var4;
    }
}
