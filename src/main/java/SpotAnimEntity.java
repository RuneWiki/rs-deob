import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "ab", name = "o", descriptor = "Z")
    public boolean field391 = false;

    @OriginalMember(owner = "ab", name = "g", descriptor = "Lgc;")
    private SpotAnimType field383;

    @OriginalMember(owner = "ab", name = "i", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "ab", name = "j", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "ab", name = "k", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "ab", name = "l", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "ab", name = "h", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "ab", name = "f", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "ab", name = "m", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field383 = SpotAnimType.field944[arg3];
        this.field385 = arg4;
        this.field386 = arg5;
        this.field387 = arg6;
        this.field388 = arg0;
        this.field384 = arg2 + arg7;
        if (arg1 != 0) {
            this.field382 = 47;
        }
        this.field391 = false;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(II)V")
    public final void method101(int arg0, int arg1) {
        if (arg1 != 30001) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field390 += arg0;
        while (this.field390 > this.field383.field947.field931[this.field389]) {
            this.field390 -= this.field383.field947.field931[this.field389] + 1;
            this.field389++;
            if (this.field389 >= this.field383.field947.field928) {
                this.field389 = 0;
                this.field391 = true;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Ldb;")
    public final Model method90(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        Model var2 = this.field383.method283();
        Model var3 = new Model(true, !this.field383.field948, var2, 440, true, false);
        if (!this.field391) {
            var3.method108(0);
            var3.method109(false, this.field383.field947.field929[this.field389]);
            var3.field455 = null;
            var3.field454 = null;
        }
        var3.method118(64, 850, -30, -50, -30, true);
        return var3;
    }
}
