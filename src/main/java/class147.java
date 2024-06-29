import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class147 {

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[Lqj;")
    private class238[] field2408 = new class238[10];

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    private int field2409;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()I", line = 4)
    public final int method913() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2408[var2] != null && this.field2408[var2].field3987 / 20 < var1) {
                var1 = this.field2408[var2].field3987 / 20;
            }
        }
        if (this.field2410 < this.field2409 && this.field2410 / 20 < var1) {
            var1 = this.field2410 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2408[var3] != null) {
                this.field2408[var3].field3987 -= var1 * 20;
            }
        }
        if (this.field2410 < this.field2409) {
            this.field2410 -= var1 * 20;
            this.field2409 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()[B", line = 47)
    private final byte[] method914() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2408[var2] != null && this.field2408[var2].field3994 + this.field2408[var2].field3987 > var1) {
                var1 = this.field2408[var2].field3994 + this.field2408[var2].field3987;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2408[var5] != null) {
                int var6 = this.field2408[var5].field3994 * 22050 / 1000;
                int var7 = this.field2408[var5].field3987 * 22050 / 1000;
                int[] var8 = this.field2408[var5].method1589(var6, this.field2408[var5].field3994);
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

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lek;II)Lej;", line = 108)
    public static final class147 method915(class172 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1107(arg1, arg2, 127);
        return var3 == null ? null : new class147(new class229(var3));
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()Lhb;", line = 119)
    public final class32 method916() {
        byte[] var1 = this.method914();
        return new class32(22050, var1, this.field2410 * 22050 / 1000, this.field2409 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lfe;)V", line = 129)
    private class147(class229 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1535((byte) 122);
            if (var3 != 0) {
                arg0.field3905--;
                this.field2408[var2] = new class238();
                this.field2408[var2].method1587(arg0);
            }
        }
        this.field2410 = arg0.method1496(true);
        this.field2409 = arg0.method1496(true);
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 149)
    private class147() {
    }
}
