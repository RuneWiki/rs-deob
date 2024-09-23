import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "cb", name = "s", descriptor = "Lnc;")
    private SeqType field517;

    @OriginalMember(owner = "cb", name = "t", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "cb", name = "u", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIIBIIIZII)V")
    public LocEntity(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg3 != -61) {
            throw new NullPointerException();
        }
        this.field510 = arg2;
        this.field511 = arg6;
        this.field512 = arg1;
        this.field513 = arg5;
        this.field514 = arg4;
        this.field515 = arg0;
        this.field516 = arg8;
        this.field517 = SeqType.field1149[arg9];
        this.field518 = 0;
        this.field519 = client.field1247;
        if (arg7 && this.field517.field1154 != -1) {
            this.field518 = (int) (Math.random() * (double) this.field517.field1150);
            this.field519 -= (int) (Math.random() * (double) this.field517.method384(0, this.field518));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(B)Lfb;")
    public final Model method123(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        if (this.field517 != null) {
            int var2 = client.field1247 - this.field519;
            if (var2 > 100 && this.field517.field1154 > 0) {
                var2 = 100;
            }
            label37: {
                do {
                    do {
                        if (var2 <= this.field517.method384(0, this.field518)) {
                            break label37;
                        }
                        var2 -= this.field517.method384(0, this.field518);
                        this.field518++;
                    } while (this.field518 < this.field517.field1150);
                    this.field518 -= this.field517.field1154;
                } while (this.field518 >= 0 && this.field518 < this.field517.field1150);
                this.field517 = null;
            }
            this.field519 = client.field1247 - var2;
        }
        int var3 = -1;
        if (this.field517 != null) {
            var3 = this.field517.field1151[this.field518];
        }
        LocType var4 = LocType.method334(this.field510);
        return var4.method340(this.field511, this.field512, this.field513, this.field514, this.field515, this.field516, var3);
    }
}
