import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class LocEntity extends Entity {

    @OriginalMember(owner = "bb", name = "l", descriptor = "I")
    private int field485 = 9;

    @OriginalMember(owner = "bb", name = "m", descriptor = "B")
    private byte field486 = 69;

    @OriginalMember(owner = "bb", name = "n", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "bb", name = "o", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "bb", name = "p", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "bb", name = "q", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "bb", name = "r", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "bb", name = "s", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "bb", name = "t", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "bb", name = "u", descriptor = "Loc;")
    private SeqType field494;

    @OriginalMember(owner = "bb", name = "v", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "bb", name = "w", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "(IIBZIIIIII)V")
    public LocEntity(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field487 = arg6;
        this.field488 = arg8;
        if (this.field486 != arg2) {
            throw new NullPointerException();
        }
        this.field489 = arg1;
        this.field490 = arg5;
        this.field491 = arg4;
        this.field492 = arg9;
        this.field493 = arg7;
        this.field494 = SeqType.field1136[arg0];
        this.field495 = 0;
        this.field496 = client.field1223;
        if (arg3 && this.field494.field1141 != -1) {
            this.field495 = (int) (Math.random() * (double) this.field494.field1137);
            this.field496 -= (int) (Math.random() * (double) this.field494.method379(1, this.field495));
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (this.field494 != null) {
            int var2 = client.field1223 - this.field496;
            if (var2 > 100 && this.field494.field1141 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field494.method379(1, this.field495)) {
                            break label38;
                        }
                        var2 -= this.field494.method379(1, this.field495);
                        this.field495++;
                    } while (this.field495 < this.field494.field1137);
                    this.field495 -= this.field494.field1141;
                } while (this.field495 >= 0 && this.field495 < this.field494.field1137);
                this.field494 = null;
            }
            this.field496 = client.field1223 - var2;
        }
        int var3 = -1;
        if (this.field494 != null) {
            var3 = this.field494.field1138[this.field495];
        }
        LocType var4 = LocType.method329(this.field487);
        Model var5 = var4.method335(this.field488, this.field489, this.field490, this.field491, this.field492, this.field493, var3);
        if (arg0 != -21173) {
            this.field485 = 323;
        }
        return var5;
    }
}
