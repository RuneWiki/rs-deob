import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FNTVIFXL")
public class class17 extends class56 {

    @OriginalMember(owner = "client!FNTVIFXL", name = "r", descriptor = "Z")
    public boolean field737 = false;

    @OriginalMember(owner = "client!FNTVIFXL", name = "t", descriptor = "LEBBSHPSJ;")
    private class12 field738;

    @OriginalMember(owner = "client!FNTVIFXL", name = "n", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!FNTVIFXL", name = "o", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!FNTVIFXL", name = "p", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!FNTVIFXL", name = "q", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!FNTVIFXL", name = "m", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "client!FNTVIFXL", name = "u", descriptor = "I")
    private int field739;

    @OriginalMember(owner = "client!FNTVIFXL", name = "v", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!FNTVIFXL", name = "a", descriptor = "(II)V")
    public final void method213(int arg0, int arg1) {
        if (arg0 != 43006) {
            return;
        }
        this.field740 += arg1;
        while (true) {
            do {
                do {
                    if (this.field740 <= this.field738.field687.method532(this.field739, (byte) 6)) {
                        return;
                    }
                    this.field740 -= this.field738.field687.method532(this.field739, (byte) 6);
                    this.field739++;
                } while (this.field739 < this.field738.field687.field1629);
            } while (this.field739 >= 0 && this.field739 < this.field738.field687.field1629);
            this.field739 = 0;
            this.field737 = true;
        }
    }

    @OriginalMember(owner = "client!FNTVIFXL", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public final class29 method214(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class29 var4 = this.field738.method210();
        if (var4 == null) {
            return null;
        }
        int var5 = this.field738.field687.field1630[this.field739];
        class29 var6 = new class29(true, class42.method382(var5, 4), false, 9, var4);
        if (!this.field737) {
            var6.method307(979);
            var6.method308(var5, 771);
            var6.field953 = null;
            var6.field952 = null;
        }
        if (this.field738.field690 != 128 || this.field738.field691 != 128) {
            var6.method316(this.field738.field691, this.field738.field690, this.field738.field690, true);
        }
        if (this.field738.field692 != 0) {
            if (this.field738.field692 == 90) {
                var6.method311((byte) 3);
            }
            if (this.field738.field692 == 180) {
                var6.method311((byte) 3);
                var6.method311((byte) 3);
            }
            if (this.field738.field692 == 270) {
                var6.method311((byte) 3);
                var6.method311((byte) 3);
                var6.method311((byte) 3);
            }
        }
        var6.method317(this.field738.field693 + 64, this.field738.field694 + 850, -30, -50, -30, true);
        return var6;
    }

    @OriginalMember(owner = "client!FNTVIFXL", name = "<init>", descriptor = "(IIIIIIII)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field738 = class12.field683[arg2];
        this.field733 = arg3;
        this.field734 = arg6;
        this.field735 = arg4;
        this.field736 = arg1;
        int var9 = 31 / arg0;
        this.field732 = arg5 + arg7;
        this.field737 = false;
    }
}
