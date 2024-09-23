import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HYUBDXHD")
public class class28 extends class63 {

    @OriginalMember(owner = "HYUBDXHD", name = "p", descriptor = "Z")
    public boolean field933 = false;

    @OriginalMember(owner = "HYUBDXHD", name = "q", descriptor = "Z")
    private boolean field934 = false;

    @OriginalMember(owner = "HYUBDXHD", name = "l", descriptor = "LFULHVSIU;")
    private class21 field929;

    @OriginalMember(owner = "HYUBDXHD", name = "r", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "HYUBDXHD", name = "s", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "HYUBDXHD", name = "t", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "HYUBDXHD", name = "u", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "HYUBDXHD", name = "m", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "HYUBDXHD", name = "n", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "HYUBDXHD", name = "o", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "HYUBDXHD", name = "a", descriptor = "(BI)V")
    public final void method316(byte arg0, int arg1) {
        this.field932 += arg1;
        if (arg0 != 101) {
            this.field934 = !this.field934;
        }
        while (true) {
            do {
                do {
                    if (this.field932 <= this.field929.field707.method415(this.field931, (byte) 6)) {
                        return;
                    }
                    this.field932 -= this.field929.field707.method415(this.field931, (byte) 6) + 1;
                    this.field931++;
                } while (this.field931 < this.field929.field707.field1159);
            } while (this.field931 >= 0 && this.field931 < this.field929.field707.field1159);
            this.field931 = 0;
            this.field933 = true;
        }
    }

    @OriginalMember(owner = "HYUBDXHD", name = "a", descriptor = "(I)LKPUOCBCE;")
    public final class35 method11(int arg0) {
        class35 var2 = this.field929.method231();
        if (arg0 != 8) {
            this.field934 = !this.field934;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = this.field929.field707.field1160[this.field931];
        class35 var4 = new class35(class71.method585(var3, 2), false, var2, true, 271);
        if (!this.field933) {
            var4.method386(9);
            var4.method387(var3, -599);
            var4.field1042 = null;
            var4.field1041 = null;
        }
        if (this.field929.field710 != 128 || this.field929.field711 != 128) {
            var4.method395(-49478, this.field929.field710, this.field929.field711, this.field929.field710);
        }
        if (this.field929.field712 != 0) {
            if (this.field929.field712 == 90) {
                var4.method390((byte) 4);
            }
            if (this.field929.field712 == 180) {
                var4.method390((byte) 4);
                var4.method390((byte) 4);
            }
            if (this.field929.field712 == 270) {
                var4.method390((byte) 4);
                var4.method390((byte) 4);
                var4.method390((byte) 4);
            }
        }
        var4.method396(this.field929.field713 + 64, this.field929.field714 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "HYUBDXHD", name = "<init>", descriptor = "(IIIIIIII)V")
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field929 = class21.field703[arg1];
        this.field935 = arg6;
        this.field936 = arg0;
        this.field937 = arg2;
        this.field938 = arg3;
        int var9 = 39 / arg7;
        this.field930 = arg4 + arg5;
        this.field933 = false;
    }
}
