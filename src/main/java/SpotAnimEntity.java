import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fb")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "fb", name = "m", descriptor = "Z")
    private boolean field620 = true;

    @OriginalMember(owner = "fb", name = "n", descriptor = "Z")
    private boolean field621 = false;

    @OriginalMember(owner = "fb", name = "o", descriptor = "I")
    private int field622 = 1727;

    @OriginalMember(owner = "fb", name = "p", descriptor = "Z")
    private boolean field623 = true;

    @OriginalMember(owner = "fb", name = "q", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "fb", name = "z", descriptor = "Z")
    public boolean field633 = false;

    @OriginalMember(owner = "fb", name = "r", descriptor = "Lpc;")
    private SpotAnimType field625;

    @OriginalMember(owner = "fb", name = "t", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "fb", name = "u", descriptor = "I")
    public int field628;

    @OriginalMember(owner = "fb", name = "v", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "fb", name = "w", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "fb", name = "s", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "fb", name = "x", descriptor = "I")
    private int field631;

    @OriginalMember(owner = "fb", name = "y", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "fb", name = "<init>", descriptor = "(BIIIIIII)V")
    public SpotAnimEntity(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field625 = SpotAnimType.field1166[arg5];
        this.field627 = arg4;
        if (arg0 != -99) {
            this.field622 = 377;
        }
        this.field628 = arg3;
        this.field629 = arg7;
        this.field630 = arg2;
        this.field626 = arg1 + arg6;
        this.field633 = false;
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(IZ)V")
    public final void method151(int arg0, boolean arg1) {
        if (!arg1) {
            this.field624 = !this.field624;
        }
        this.field632 += arg0;
        while (true) {
            do {
                do {
                    if (this.field632 <= this.field625.field1170.method382(this.field631, this.field623)) {
                        return;
                    }
                    this.field632 -= this.field625.field1170.method382(this.field631, this.field623) + 1;
                    this.field631++;
                } while (this.field631 < this.field625.field1170.field1146);
            } while (this.field631 >= 0 && this.field631 < this.field625.field1170.field1146);
            this.field631 = 0;
            this.field633 = true;
        }
    }

    @OriginalMember(owner = "fb", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        Model var2 = this.field625.method386();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field625.field1170.field1147[this.field631];
        Model var4 = new Model(false, -16051, var2, AnimFrame.method48(var3, this.field620), true);
        if (!this.field633) {
            var4.method133(true);
            var4.method134(true, var3);
            var4.field585 = null;
            var4.field584 = null;
        }
        if (this.field625.field1173 != 128 || this.field625.field1174 != 128) {
            var4.method142(19411, this.field625.field1173, this.field625.field1173, this.field625.field1174);
        }
        if (this.field625.field1175 != 0) {
            if (this.field625.field1175 == 90) {
                var4.method137(34109);
            }
            if (this.field625.field1175 == 180) {
                var4.method137(34109);
                var4.method137(34109);
            }
            if (this.field625.field1175 == 270) {
                var4.method137(34109);
                var4.method137(34109);
                var4.method137(34109);
            }
        }
        var4.method143(this.field625.field1176 + 64, this.field625.field1177 + 850, -30, -50, -30, true);
        if (arg0 != -47094) {
            this.field621 = !this.field621;
        }
        return var4;
    }
}
