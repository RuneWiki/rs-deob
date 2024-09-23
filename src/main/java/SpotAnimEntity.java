import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "f", descriptor = "I")
    private int field414 = 19303;

    @OriginalMember(owner = "bb", name = "h", descriptor = "Z")
    private boolean field416 = false;

    @OriginalMember(owner = "bb", name = "q", descriptor = "Z")
    public boolean field425 = false;

    @OriginalMember(owner = "bb", name = "i", descriptor = "Lkc;")
    private SpotAnimType field417;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "bb", name = "g", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field417 = SpotAnimType.field1033[arg3];
        this.field419 = arg0;
        if (arg4 < 6 || arg4 > 6) {
            throw new NullPointerException();
        }
        this.field420 = arg6;
        this.field421 = arg1;
        this.field422 = arg7;
        this.field418 = arg2 + arg5;
        this.field425 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(II)V")
    public final void method119(int arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            this.field416 = !this.field416;
        }
        this.field424 += arg0;
        while (true) {
            do {
                do {
                    if (this.field424 <= this.field417.field1037.field1022[this.field423]) {
                        return;
                    }
                    this.field424 -= this.field417.field1037.field1022[this.field423] + 1;
                    this.field423++;
                } while (this.field423 < this.field417.field1037.field1019);
            } while (this.field423 >= 0 && this.field423 < this.field417.field1037.field1019);
            this.field423 = 0;
            this.field425 = true;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 < this.field415 || arg0 > this.field415) {
            this.field416 = !this.field416;
        }
        Model var2 = this.field417.method330();
        Model var3 = new Model(!this.field417.field1038, (byte) 70, true, var2, false);
        if (!this.field425) {
            var3.method127(false);
            var3.method128(this.field417.field1037.field1020[this.field423], 5565);
            var3.field489 = null;
            var3.field488 = null;
        }
        if (this.field417.field1041 != 128 || this.field417.field1042 != 128) {
            var3.method136(this.field417.field1042, this.field417.field1041, false, this.field417.field1041);
        }
        if (this.field417.field1043 != 0) {
            if (this.field417.field1043 == 90) {
                var3.method131(this.field414);
            }
            if (this.field417.field1043 == 180) {
                var3.method131(this.field414);
                var3.method131(this.field414);
            }
            if (this.field417.field1043 == 270) {
                var3.method131(this.field414);
                var3.method131(this.field414);
                var3.method131(this.field414);
            }
        }
        var3.method137(this.field417.field1044 + 64, this.field417.field1045 + 850, -30, -50, -30, true);
        return var3;
    }
}
