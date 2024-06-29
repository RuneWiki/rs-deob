import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class420 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[Lsp;")
    private class663[] field5491 = new class663[10];

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private int field5492;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lbt;II)Ltb;")
    public static final class420 method2506(class48 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method437(arg1, (byte) -117, arg2);
        return var3 == null ? null : new class420(new class403(var3));
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
    public final int method2507() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5491[var2] != null && this.field5491[var2].field9101 / 20 < var1) {
                var1 = this.field5491[var2].field9101 / 20;
            }
        }
        if (this.field5492 < this.field5490 && this.field5492 / 20 < var1) {
            var1 = this.field5492 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5491[var3] != null) {
                this.field5491[var3].field9101 -= var1 * 20;
            }
        }
        if (this.field5492 < this.field5490) {
            this.field5492 -= var1 * 20;
            this.field5490 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()[B")
    private final byte[] method2508() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5491[var2] != null && this.field5491[var2].field9101 + this.field5491[var2].field9097 > var1) {
                var1 = this.field5491[var2].field9101 + this.field5491[var2].field9097;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5491[var5] != null) {
                int var6 = this.field5491[var5].field9097 * 22050 / 1000;
                int var7 = this.field5491[var5].field9101 * 22050 / 1000;
                int[] var8 = this.field5491[var5].method3724(var6, this.field5491[var5].field9097);
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

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Les;)V")
    private class420(class403 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2396((byte) 107);
            if (var3 != 0) {
                arg0.field5262--;
                this.field5491[var2] = new class663();
                this.field5491[var2].method3726(arg0);
            }
        }
        this.field5492 = arg0.method2390((byte) 62);
        this.field5490 = arg0.method2390((byte) -112);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    private class420() {
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()Laia;")
    public final class242 method2509() {
        byte[] var1 = this.method2508();
        return new class242(22050, var1, this.field5492 * 22050 / 1000, this.field5490 * 22050 / 1000);
    }
}
