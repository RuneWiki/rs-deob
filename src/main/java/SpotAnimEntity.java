import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "g", descriptor = "I")
    private int field405 = -898;

    @OriginalMember(owner = "bb", name = "h", descriptor = "Z")
    private boolean field406 = true;

    @OriginalMember(owner = "bb", name = "q", descriptor = "Z")
    public boolean field415 = false;

    @OriginalMember(owner = "bb", name = "i", descriptor = "Lkc;")
    private SpotAnimType field407;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IBIIIIII)V")
    public SpotAnimEntity(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field407 = SpotAnimType.field1043[arg3];
        if (arg1 != -108) {
            this.field406 = !this.field406;
        }
        this.field409 = arg7;
        this.field410 = arg5;
        this.field411 = arg4;
        this.field412 = arg2;
        this.field408 = arg0 + arg6;
        this.field415 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(BI)V")
    public final void method117(byte arg0, int arg1) {
        if (arg0 != 7) {
            this.field405 = -83;
        }
        this.field414 += arg1;
        while (true) {
            do {
                do {
                    if (this.field414 <= this.field407.field1046.field1030[this.field413]) {
                        return;
                    }
                    this.field414 -= this.field407.field1046.field1030[this.field413] + 1;
                    this.field413++;
                } while (this.field413 < this.field407.field1046.field1027);
            } while (this.field413 >= 0 && this.field413 < this.field407.field1046.field1027);
            this.field413 = 0;
            this.field415 = true;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method107(int arg0) {
        Model var2 = this.field407.method321();
        Model var3 = new Model(false, (byte) 8, true, !this.field407.field1047, var2);
        if (!this.field415) {
            var3.method125((byte) -17);
            var3.method126(this.field407.field1046.field1028[this.field413], (byte) 1);
            var3.field480 = null;
            var3.field479 = null;
        }
        if (this.field407.field1050 != 128 || this.field407.field1051 != 128) {
            var3.method134(this.field407.field1051, 28022, this.field407.field1050, this.field407.field1050);
        }
        if (this.field407.field1052 != 0) {
            if (this.field407.field1052 == 90) {
                var3.method129((byte) 4);
            }
            if (this.field407.field1052 == 180) {
                var3.method129((byte) 4);
                var3.method129((byte) 4);
            }
            if (this.field407.field1052 == 270) {
                var3.method129((byte) 4);
                var3.method129((byte) 4);
                var3.method129((byte) 4);
            }
        }
        var3.method135(this.field407.field1053 + 64, this.field407.field1054 + 850, -30, -50, -30, true);
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return var3;
    }
}
