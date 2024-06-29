import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class448 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lwc;")
    private class727[] field6204 = new class727[10];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field6205;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field6206;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()I")
    public final int method2728() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6204[var2] != null && this.field6204[var2].field10103 / 20 < var1) {
                var1 = this.field6204[var2].field10103 / 20;
            }
        }
        if (this.field6205 < this.field6206 && this.field6205 / 20 < var1) {
            var1 = this.field6205 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6204[var3] != null) {
                this.field6204[var3].field10103 -= var1 * 20;
            }
        }
        if (this.field6205 < this.field6206) {
            this.field6205 -= var1 * 20;
            this.field6206 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()[B")
    private final byte[] method2729() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6204[var2] != null && this.field6204[var2].field10103 + this.field6204[var2].field10085 > var1) {
                var1 = this.field6204[var2].field10103 + this.field6204[var2].field10085;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6204[var5] != null) {
                int var6 = this.field6204[var5].field10085 * 22050 / 1000;
                int var7 = this.field6204[var5].field10103 * 22050 / 1000;
                int[] var8 = this.field6204[var5].method4060(var6, this.field6204[var5].field10085);
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

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Luu;II)Lgb;")
    public static final class448 method2730(class237 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1572(arg1, 0, arg2);
        return var3 == null ? null : new class448(new class63(var3));
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()Lwo;")
    public final class695 method2731() {
        byte[] var1 = this.method2729();
        return new class695(22050, var1, this.field6205 * 22050 / 1000, this.field6206 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ldc;)V")
    private class448(class63 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method505((byte) -119);
            if (var3 != 0) {
                arg0.field956--;
                this.field6204[var2] = new class727();
                this.field6204[var2].method4058(arg0);
            }
        }
        this.field6205 = arg0.method482(-772591672);
        this.field6206 = arg0.method482(-772591672);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    private class448() {
    }
}
