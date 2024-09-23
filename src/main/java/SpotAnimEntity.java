import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "f", descriptor = "Z")
    private boolean field412 = true;

    @OriginalMember(owner = "bb", name = "o", descriptor = "Z")
    public boolean field421 = false;

    @OriginalMember(owner = "bb", name = "g", descriptor = "Lkc;")
    private SpotAnimType field413;

    @OriginalMember(owner = "bb", name = "i", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "bb", name = "h", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field413 = SpotAnimType.field1061[arg4];
        this.field415 = arg2;
        this.field416 = arg5;
        this.field417 = arg1;
        this.field418 = arg3;
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        this.field414 = arg6 + arg7;
        this.field421 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        if (arg0 != -17320) {
            this.field412 = !this.field412;
        }
        this.field420 += arg1;
        while (true) {
            do {
                do {
                    if (this.field420 <= this.field413.field1064.field1047[this.field419]) {
                        return;
                    }
                    this.field420 -= this.field413.field1064.field1047[this.field419] + 1;
                    this.field419++;
                } while (this.field419 < this.field413.field1064.field1044);
            } while (this.field419 >= 0 && this.field419 < this.field413.field1064.field1044);
            this.field419 = 0;
            this.field421 = true;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        Model var2 = this.field413.method322();
        Model var3 = new Model(364, var2, !this.field413.field1065, false, true);
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        if (!this.field421) {
            var3.method126(797);
            var3.method127(this.field413.field1064.field1045[this.field419], (byte) -89);
            var3.field486 = null;
            var3.field485 = null;
        }
        if (this.field413.field1068 != 128 || this.field413.field1069 != 128) {
            var3.method135(this.field413.field1069, -221, this.field413.field1068, this.field413.field1068);
        }
        if (this.field413.field1070 != 0) {
            if (this.field413.field1070 == 90) {
                var3.method130(-5944);
            }
            if (this.field413.field1070 == 180) {
                var3.method130(-5944);
                var3.method130(-5944);
            }
            if (this.field413.field1070 == 270) {
                var3.method130(-5944);
                var3.method130(-5944);
                var3.method130(-5944);
            }
        }
        var3.method136(this.field413.field1071 + 64, this.field413.field1072 + 850, -30, -50, -30, true);
        return var3;
    }
}
