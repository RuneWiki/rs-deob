import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "f", descriptor = "I")
    private int field404 = -31746;

    @OriginalMember(owner = "bb", name = "o", descriptor = "Z")
    public boolean field413 = false;

    @OriginalMember(owner = "bb", name = "g", descriptor = "Lkc;")
    private SpotAnimType field405;

    @OriginalMember(owner = "bb", name = "i", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "bb", name = "h", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field405 = SpotAnimType.field1015[arg4];
        this.field407 = arg3;
        this.field408 = arg6;
        this.field409 = arg0;
        if (arg7 < 2 || arg7 > 2) {
            this.field404 = -121;
        }
        this.field410 = arg5;
        this.field406 = arg1 + arg2;
        this.field413 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        this.field412 += arg1;
        while (true) {
            do {
                do {
                    if (this.field412 <= this.field405.field1018.field1003[this.field411]) {
                        return;
                    }
                    this.field412 -= this.field405.field1018.field1003[this.field411] + 1;
                    this.field411++;
                } while (this.field411 < this.field405.field1018.field1000);
            } while (this.field411 >= 0 && this.field411 < this.field405.field1018.field1000);
            this.field411 = 0;
            this.field413 = true;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Leb;")
    public final Model method108(boolean arg0) {
        Model var2 = this.field405.method322();
        Model var3 = new Model(var2, !this.field405.field1019, 868, false, true);
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (!this.field413) {
            var3.method126(true);
            var3.method127(this.field405.field1018.field1001[this.field411], -227);
            var3.field480 = null;
            var3.field479 = null;
        }
        if (this.field405.field1022 != 128 || this.field405.field1023 != 128) {
            var3.method135(this.field405.field1022, this.field405.field1022, this.field405.field1023, -27239);
        }
        if (this.field405.field1024 != 0) {
            if (this.field405.field1024 == 90) {
                var3.method130(7);
            }
            if (this.field405.field1024 == 180) {
                var3.method130(7);
                var3.method130(7);
            }
            if (this.field405.field1024 == 270) {
                var3.method130(7);
                var3.method130(7);
                var3.method130(7);
            }
        }
        var3.method136(this.field405.field1025 + 64, this.field405.field1026 + 850, -30, -50, -30, true);
        return var3;
    }
}
