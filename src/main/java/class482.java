import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class482 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[Laga;")
    private class599[] field6889 = new class599[10];

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    private int field6890;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    private int field6888;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method2759() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6889[var2] != null && this.field6889[var2].field8671 + this.field6889[var2].field8665 > var1) {
                var1 = this.field6889[var2].field8671 + this.field6889[var2].field8665;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6889[var5] != null) {
                int var6 = this.field6889[var5].field8671 * 22050 / 1000;
                int var7 = this.field6889[var5].field8665 * 22050 / 1000;
                int[] var8 = this.field6889[var5].method3409(var6, this.field6889[var5].field8671);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lgk;)V", line = 68)
    private class482(class540 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3115(29871);
            if (var3 != 0) {
                arg0.field7956--;
                this.field6889[var2] = new class599();
                this.field6889[var2].method3408(arg0);
            }
        }
        this.field6890 = arg0.method3169(26488);
        this.field6888 = arg0.method3169(26488);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V", line = 149)
    private class482() {
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()I", line = 92)
    public final int method2760() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6889[var2] != null && this.field6889[var2].field8665 / 20 < var1) {
                var1 = this.field6889[var2].field8665 / 20;
            }
        }
        if (this.field6890 < this.field6888 && this.field6890 / 20 < var1) {
            var1 = this.field6890 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6889[var3] != null) {
                this.field6889[var3].field8665 -= var1 * 20;
            }
        }
        if (this.field6890 < this.field6888) {
            this.field6890 -= var1 * 20;
            this.field6888 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()Lwm;", line = 136)
    public final class396 method2761() {
        byte[] var1 = this.method2759();
        return new class396(22050, var1, this.field6890 * 22050 / 1000, this.field6888 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lmv;II)Lfb;", line = 141)
    public static final class482 method2762(class295 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1844(arg1, 31330, arg2);
        return var3 == null ? null : new class482(new class540(var3));
    }
}
