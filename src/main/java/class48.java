import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class48 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[Log;")
    private class139[] field900 = new class139[10];

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()I")
    public final int method272() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field900[var2] != null && this.field900[var2].field2526 / 20 < var1) {
                var1 = this.field900[var2].field2526 / 20;
            }
        }
        if (this.field901 < this.field899 && this.field901 / 20 < var1) {
            var1 = this.field901 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field900[var3] != null) {
                this.field900[var3].field2526 -= var1 * 20;
            }
        }
        if (this.field901 < this.field899) {
            this.field901 -= var1 * 20;
            this.field899 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()[B")
    private final byte[] method273() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field900[var2] != null && this.field900[var2].field2527 + this.field900[var2].field2526 > var1) {
                var1 = this.field900[var2].field2527 + this.field900[var2].field2526;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field900[var5] != null) {
                int var6 = this.field900[var5].field2527 * 22050 / 1000;
                int var7 = this.field900[var5].field2526 * 22050 / 1000;
                int[] var8 = this.field900[var5].method861(var6, this.field900[var5].field2527);
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

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lvb;II)Leh;")
    public static final class48 method274(class197 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1249((byte) -119, arg2, arg1);
        return var3 == null ? null : new class48(new class97(var3));
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lka;)V")
    private class48(class97 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method588((byte) -30);
            if (var3 != 0) {
                arg0.field1834--;
                this.field900[var2] = new class139();
                this.field900[var2].method858(arg0);
            }
        }
        this.field901 = arg0.method611(false);
        this.field899 = arg0.method611(false);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    private class48() {
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "()Ldc;")
    public final class33 method275() {
        byte[] var1 = this.method273();
        return new class33(22050, var1, this.field901 * 22050 / 1000, this.field899 * 22050 / 1000);
    }
}
