import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "cb", name = "l", descriptor = "Z")
    private boolean field498 = true;

    @OriginalMember(owner = "cb", name = "m", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "cb", name = "n", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "cb", name = "o", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "cb", name = "p", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "cb", name = "q", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "cb", name = "r", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "cb", name = "s", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "cb", name = "t", descriptor = "Lnc;")
    private SeqType field506;

    @OriginalMember(owner = "cb", name = "u", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "cb", name = "v", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "cb", name = "<init>", descriptor = "(IIBZIIIIII)V")
    public LocEntity(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field499 = arg1;
        this.field500 = arg6;
        this.field501 = arg7;
        this.field502 = arg4;
        this.field503 = arg8;
        this.field504 = arg0;
        this.field505 = arg5;
        this.field506 = SeqType.field1125[arg9];
        if (arg2 != 2) {
            throw new NullPointerException();
        }
        this.field507 = 0;
        this.field508 = client.field1444;
        if (arg3 && this.field506.field1130 != -1) {
            this.field507 = (int) (Math.random() * (double) this.field506.field1126);
            this.field508 -= (int) (Math.random() * (double) this.field506.method382(this.field507, 0));
        }
    }

    @OriginalMember(owner = "cb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (arg0 != -13634) {
            this.field498 = !this.field498;
        }
        if (this.field506 != null) {
            int var2 = client.field1444 - this.field508;
            if (var2 > 100 && this.field506.field1130 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field506.method382(this.field507, 0)) {
                            break label42;
                        }
                        var2 -= this.field506.method382(this.field507, 0);
                        this.field507++;
                    } while (this.field507 < this.field506.field1126);
                    this.field507 -= this.field506.field1130;
                } while (this.field507 >= 0 && this.field507 < this.field506.field1126);
                this.field506 = null;
            }
            this.field508 = client.field1444 - var2;
        }
        int var3 = -1;
        if (this.field506 != null) {
            var3 = this.field506.field1127[this.field507];
        }
        LocType var4 = LocType.method333(this.field499);
        return var4.method339(this.field500, this.field501, this.field502, this.field503, this.field504, this.field505, var3);
    }
}
