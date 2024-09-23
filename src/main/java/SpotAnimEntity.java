import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "e", descriptor = "Z")
    private boolean field397 = false;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Z")
    public boolean field406 = false;

    @OriginalMember(owner = "bb", name = "f", descriptor = "Lhc;")
    private SpotAnimType field398;

    @OriginalMember(owner = "bb", name = "h", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "bb", name = "i", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "bb", name = "g", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IZIIIIII)V")
    public SpotAnimEntity(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            this.field397 = !this.field397;
        }
        this.field398 = SpotAnimType.field952[arg5];
        this.field400 = arg7;
        this.field401 = arg3;
        this.field402 = arg0;
        this.field403 = arg2;
        this.field399 = arg4 + arg6;
        this.field406 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(IZ)V")
    public final void method115(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        this.field405 += arg0;
        while (this.field405 > this.field398.field955.field942[this.field404]) {
            this.field405 -= this.field398.field955.field942[this.field404] + 1;
            this.field404++;
            if (this.field404 >= this.field398.field955.field939) {
                this.field404 = 0;
                this.field406 = true;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method105(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field398.method299();
        Model var4 = new Model(-428, true, var3, true, false, !this.field398.field956);
        if (!this.field406) {
            var4.method122((byte) 3);
            var4.method123(7, this.field398.field955.field940[this.field404]);
            var4.field469 = null;
            var4.field468 = null;
        }
        var4.method132(64, 850, -30, -50, -30, true);
        return var4;
    }
}
