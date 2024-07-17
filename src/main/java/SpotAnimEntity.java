import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "o", descriptor = "Z")
    public boolean field414 = false;

    @OriginalMember(owner = "bb", name = "g", descriptor = "Lkc;")
    private SpotAnimType field406;

    @OriginalMember(owner = "bb", name = "i", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "bb", name = "f", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "bb", name = "h", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "bb", name = "e", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIZIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field406 = SpotAnimType.field1043[arg1];
        this.field408 = arg6;
        if (arg2) {
            this.field405 = -147;
        }
        this.field409 = arg0;
        this.field410 = arg3;
        this.field411 = arg5;
        this.field407 = arg4 + arg7;
        this.field414 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(II)V")
    public final void method119(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field405 = -255;
        }
        this.field413 += arg0;
        while (true) {
            do {
                do {
                    if (this.field413 <= this.field406.field1047.field1032[this.field412]) {
                        return;
                    }
                    this.field413 -= this.field406.field1047.field1032[this.field412] + 1;
                    this.field412++;
                } while (this.field412 < this.field406.field1047.field1029);
            } while (this.field412 >= 0 && this.field412 < this.field406.field1047.field1029);
            this.field412 = 0;
            this.field414 = true;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        Model var2 = this.field406.method330();
        Model var3 = new Model(var2, true, !this.field406.field1048, this.field404, false);
        if (!arg0) {
            throw new NullPointerException();
        }
        if (!this.field414) {
            var3.method127(4);
            var3.method128(-16599, this.field406.field1047.field1030[this.field412]);
            var3.field480 = null;
            var3.field479 = null;
        }
        if (this.field406.field1051 != 128 || this.field406.field1052 != 128) {
            var3.method136(this.field406.field1051, 2, this.field406.field1052, this.field406.field1051);
        }
        if (this.field406.field1053 != 0) {
            if (this.field406.field1053 == 90) {
                var3.method131(0);
            }
            if (this.field406.field1053 == 180) {
                var3.method131(0);
                var3.method131(0);
            }
            if (this.field406.field1053 == 270) {
                var3.method131(0);
                var3.method131(0);
                var3.method131(0);
            }
        }
        var3.method137(this.field406.field1054 + 64, this.field406.field1055 + 850, -30, -50, -30, true);
        return var3;
    }
}
