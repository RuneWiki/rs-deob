import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[Lue;")
    private class125[] field1907 = new class125[10];

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()[B", line = 4)
    private final byte[] method711() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1907[var2] != null && this.field1907[var2].field3103 + this.field1907[var2].field3085 > var1) {
                var1 = this.field1907[var2].field3103 + this.field1907[var2].field3085;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1907[var5] != null) {
                int var6 = this.field1907[var5].field3103 * 22050 / 1000;
                int var7 = this.field1907[var5].field3085 * 22050 / 1000;
                int[] var8 = this.field1907[var5].method1009(var6, this.field1907[var5].field3103);
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

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()I", line = 64)
    public final int method712() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1907[var2] != null && this.field1907[var2].field3085 / 20 < var1) {
                var1 = this.field1907[var2].field3085 / 20;
            }
        }
        if (this.field1908 < this.field1909 && this.field1908 / 20 < var1) {
            var1 = this.field1908 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1907[var3] != null) {
                this.field1907[var3].field3085 -= var1 * 20;
            }
        }
        if (this.field1908 < this.field1909) {
            this.field1908 -= var1 * 20;
            this.field1909 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()Lwd;", line = 108)
    public final class135 method713() {
        byte[] var1 = this.method711();
        return new class135(22050, var1, this.field1908 * 22050 / 1000, this.field1909 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lba;)V", line = 118)
    private class77(class8 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method145(false);
            if (var3 != 0) {
                arg0.field268--;
                this.field1907[var2] = new class125();
                this.field1907[var2].method1006(arg0);
            }
        }
        this.field1908 = arg0.method146(65280);
        this.field1909 = arg0.method146(65280);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 139)
    private class77() {
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lbd;II)Lme;", line = 143)
    public static final class77 method714(class11 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method218(arg2, 123, arg1);
        return var3 == null ? null : new class77(new class8(var3));
    }
}
