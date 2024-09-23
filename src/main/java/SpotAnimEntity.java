import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "bb", name = "e", descriptor = "Z")
    private boolean field407 = false;

    @OriginalMember(owner = "bb", name = "n", descriptor = "Z")
    public boolean field416 = false;

    @OriginalMember(owner = "bb", name = "f", descriptor = "Lkc;")
    private SpotAnimType field408;

    @OriginalMember(owner = "bb", name = "h", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "bb", name = "i", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "bb", name = "j", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "bb", name = "k", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "bb", name = "g", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "bb", name = "m", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 < 7 || arg5 > 7) {
            this.field407 = !this.field407;
        }
        this.field408 = SpotAnimType.field1039[arg0];
        this.field410 = arg2;
        this.field411 = arg4;
        this.field412 = arg3;
        this.field413 = arg7;
        this.field409 = arg1 + arg6;
        this.field416 = false;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        this.field415 += arg1;
        if (arg0 >= 0) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field415 <= this.field408.field1042.field1027[this.field414]) {
                        return;
                    }
                    this.field415 -= this.field408.field1042.field1027[this.field414] + 1;
                    this.field414++;
                } while (this.field414 < this.field408.field1042.field1024);
            } while (this.field414 >= 0 && this.field414 < this.field408.field1042.field1024);
            this.field414 = 0;
            this.field416 = true;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model var3 = this.field408.method322();
        Model var4 = new Model(!this.field408.field1043, false, false, var3, true);
        if (!this.field416) {
            var4.method126(-36895);
            var4.method127(1, this.field408.field1042.field1025[this.field414]);
            var4.field479 = null;
            var4.field478 = null;
        }
        if (this.field408.field1046 != 128 || this.field408.field1047 != 128) {
            var4.method135(this.field408.field1046, this.field408.field1046, true, this.field408.field1047);
        }
        if (this.field408.field1048 != 0) {
            if (this.field408.field1048 == 90) {
                var4.method130(855);
            }
            if (this.field408.field1048 == 180) {
                var4.method130(855);
                var4.method130(855);
            }
            if (this.field408.field1048 == 270) {
                var4.method130(855);
                var4.method130(855);
                var4.method130(855);
            }
        }
        var4.method136(this.field408.field1049 + 64, this.field408.field1050 + 850, -30, -50, -30, true);
        return var4;
    }
}
