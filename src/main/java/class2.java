import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AMMGDAXD")
public class class2 extends class11 {

    @OriginalMember(owner = "client!AMMGDAXD", name = "l", descriptor = "Z")
    public boolean field10 = false;

    @OriginalMember(owner = "client!AMMGDAXD", name = "r", descriptor = "Z")
    private boolean field16 = false;

    @OriginalMember(owner = "client!AMMGDAXD", name = "t", descriptor = "LHTOEUNMD;")
    private class24 field17;

    @OriginalMember(owner = "client!AMMGDAXD", name = "m", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!AMMGDAXD", name = "n", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!AMMGDAXD", name = "o", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!AMMGDAXD", name = "p", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!AMMGDAXD", name = "q", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!AMMGDAXD", name = "u", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!AMMGDAXD", name = "v", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!AMMGDAXD", name = "<init>", descriptor = "(IIIIIIII)V")
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field17 = class24.field864[arg2];
        this.field11 = arg4;
        this.field12 = arg7;
        this.field13 = arg3;
        this.field14 = arg0;
        this.field15 = arg1 + arg6;
        this.field10 = false;
        if (arg5 != -17889) {
            this.field16 = !this.field16;
        }
    }

    @OriginalMember(owner = "client!AMMGDAXD", name = "a", descriptor = "(II)V")
    public final void method4(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field19 += arg1;
        while (true) {
            do {
                do {
                    if (this.field19 <= this.field17.field868.method375((byte) -37, this.field18)) {
                        return;
                    }
                    this.field19 -= this.field17.field868.method375((byte) -37, this.field18) + 1;
                    this.field18++;
                } while (this.field18 < this.field17.field868.field1141);
            } while (this.field18 >= 0 && this.field18 < this.field17.field868.field1141);
            this.field18 = 0;
            this.field10 = true;
        }
    }

    @OriginalMember(owner = "client!AMMGDAXD", name = "a", descriptor = "(I)LOGORHYVW;")
    public final class45 method5(int arg0) {
        class45 var2 = this.field17.method245();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field17.field868.field1142[this.field18];
        class45 var4 = new class45(-18434, true, var2, class47.method467((byte) -39, var3), false);
        if (arg0 != 0) {
            this.field16 = !this.field16;
        }
        if (!this.field10) {
            var4.method440(474);
            var4.method441((byte) 9, var3);
            var4.field1308 = null;
            var4.field1307 = null;
        }
        if (this.field17.field871 != 128 || this.field17.field872 != 128) {
            var4.method449(this.field17.field871, 23590, this.field17.field871, this.field17.field872);
        }
        if (this.field17.field873 != 0) {
            if (this.field17.field873 == 90) {
                var4.method444(6);
            }
            if (this.field17.field873 == 180) {
                var4.method444(6);
                var4.method444(6);
            }
            if (this.field17.field873 == 270) {
                var4.method444(6);
                var4.method444(6);
                var4.method444(6);
            }
        }
        var4.method450(this.field17.field874 + 64, this.field17.field875 + 850, -30, -50, -30, true);
        return var4;
    }
}
