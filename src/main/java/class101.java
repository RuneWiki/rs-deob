import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "[Llb;")
    private class78[] field2480 = new class78[10];

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    private int field2482;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ldd;II)Lod;")
    public static final class101 method809(class26 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method193(false, arg2, arg1);
        return var3 == null ? null : new class101(new class157(var3));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()Lp;")
    public final class104 method810() {
        byte[] var1 = this.method811();
        return new class104(22050, var1, this.field2481 * 22050 / 1000, this.field2482 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()[B")
    private final byte[] method811() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2480[var2] != null && this.field2480[var2].field1912 + this.field2480[var2].field1902 > var1) {
                var1 = this.field2480[var2].field1912 + this.field2480[var2].field1902;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2480[var5] != null) {
                int var6 = this.field2480[var5].field1902 * 22050 / 1000;
                int var7 = this.field2480[var5].field1912 * 22050 / 1000;
                int[] var8 = this.field2480[var5].method641(var6, this.field2480[var5].field1902);
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

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lwd;)V")
    private class101(class157 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1194(false);
            if (var3 != 0) {
                arg0.field3457--;
                this.field2480[var2] = new class78();
                this.field2480[var2].method638(arg0);
            }
        }
        this.field2481 = arg0.method1161((byte) 60);
        this.field2482 = arg0.method1161((byte) 60);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()I")
    public final int method812() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2480[var2] != null && this.field2480[var2].field1912 / 20 < var1) {
                var1 = this.field2480[var2].field1912 / 20;
            }
        }
        if (this.field2481 < this.field2482 && this.field2481 / 20 < var1) {
            var1 = this.field2481 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2480[var3] != null) {
                this.field2480[var3].field1912 -= var1 * 20;
            }
        }
        if (this.field2481 < this.field2482) {
            this.field2481 -= var1 * 20;
            this.field2482 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    private class101() {
    }
}
