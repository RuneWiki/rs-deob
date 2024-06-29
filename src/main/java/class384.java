import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class384 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[Ldj;")
    private class145[] field5060 = new class145[10];

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    private int field5061;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    private int field5062;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()[B")
    private final byte[] method2297() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5060[var2] != null && this.field5060[var2].field1927 + this.field5060[var2].field1921 > var1) {
                var1 = this.field5060[var2].field1927 + this.field5060[var2].field1921;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5060[var5] != null) {
                int var6 = this.field5060[var5].field1927 * 22050 / 1000;
                int var7 = this.field5060[var5].field1921 * 22050 / 1000;
                int[] var8 = this.field5060[var5].method1010(var6, this.field5060[var5].field1927);
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

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
    public final int method2298() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5060[var2] != null && this.field5060[var2].field1921 / 20 < var1) {
                var1 = this.field5060[var2].field1921 / 20;
            }
        }
        if (this.field5061 < this.field5062 && this.field5061 / 20 < var1) {
            var1 = this.field5061 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5060[var3] != null) {
                this.field5060[var3].field1921 -= var1 * 20;
            }
        }
        if (this.field5061 < this.field5062) {
            this.field5061 -= var1 * 20;
            this.field5062 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ldn;II)Lkl;")
    public static final class384 method2299(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1313((byte) -112, arg1, arg2);
        return var3 == null ? null : new class384(new class88(var3));
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()Leb;")
    public final class59 method2300() {
        byte[] var1 = this.method2297();
        return new class59(22050, var1, this.field5061 * 22050 / 1000, this.field5062 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lbt;)V")
    private class384(class88 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method617(2);
            if (var3 != 0) {
                arg0.field1176--;
                this.field5060[var2] = new class145();
                this.field5060[var2].method1011(arg0);
            }
        }
        this.field5061 = arg0.method568((byte) 110);
        this.field5062 = arg0.method568((byte) 110);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    private class384() {
    }
}
