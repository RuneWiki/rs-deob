import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class89 {

    @OriginalMember(owner = "client!od", name = "b", descriptor = "[Loe;")
    private class139[] field1657 = new class139[10];

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()Llb;")
    public final class126 method657() {
        byte[] var1 = this.method659();
        return new class126(22050, var1, this.field1658 * 22050 / 1000, this.field1656 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
    public final int method658() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1657[var2] != null && this.field1657[var2].field2390 / 20 < var1) {
                var1 = this.field1657[var2].field2390 / 20;
            }
        }
        if (this.field1658 < this.field1656 && this.field1658 / 20 < var1) {
            var1 = this.field1658 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1657[var3] != null) {
                this.field1657[var3].field2390 -= var1 * 20;
            }
        }
        if (this.field1658 < this.field1656) {
            this.field1658 -= var1 * 20;
            this.field1656 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()[B")
    private final byte[] method659() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1657[var2] != null && this.field1657[var2].field2400 + this.field1657[var2].field2390 > var1) {
                var1 = this.field1657[var2].field2400 + this.field1657[var2].field2390;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1657[var5] != null) {
                int var6 = this.field1657[var5].field2400 * 22050 / 1000;
                int var7 = this.field1657[var5].field2390 * 22050 / 1000;
                int[] var8 = this.field1657[var5].method915(var6, this.field1657[var5].field2400);
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

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lik;)V")
    private class89(class247 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1711((byte) -67);
            if (var3 != 0) {
                arg0.field4224--;
                this.field1657[var2] = new class139();
                this.field1657[var2].method914(arg0);
            }
        }
        this.field1658 = arg0.method1694((byte) -100);
        this.field1656 = arg0.method1694((byte) -100);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lge;II)Lod;")
    public static final class89 method660(class68 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method464(-1, arg1, arg2);
        return var3 == null ? null : new class89(new class247(var3));
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    private class89() {
    }
}
