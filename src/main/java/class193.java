import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class193 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[Lmf;")
    private class10[] field3443 = new class10[10];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field3444;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lue;II)Lt;")
    public static final class193 method1261(class86 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method596(29, arg1, arg2);
        return var3 == null ? null : new class193(new class194(var3));
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()I")
    public final int method1262() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3443[var2] != null && this.field3443[var2].field221 / 20 < var1) {
                var1 = this.field3443[var2].field221 / 20;
            }
        }
        if (this.field3442 < this.field3444 && this.field3442 / 20 < var1) {
            var1 = this.field3442 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3443[var3] != null) {
                this.field3443[var3].field221 -= var1 * 20;
            }
        }
        if (this.field3442 < this.field3444) {
            this.field3442 -= var1 * 20;
            this.field3444 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Lik;")
    public final class250 method1263() {
        byte[] var1 = this.method1264();
        return new class250(22050, var1, this.field3442 * 22050 / 1000, this.field3444 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()[B")
    private final byte[] method1264() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3443[var2] != null && this.field3443[var2].field229 + this.field3443[var2].field221 > var1) {
                var1 = this.field3443[var2].field229 + this.field3443[var2].field221;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3443[var5] != null) {
                int var6 = this.field3443[var5].field229 * 22050 / 1000;
                int var7 = this.field3443[var5].field221 * 22050 / 1000;
                int[] var8 = this.field3443[var5].method80(var6, this.field3443[var5].field229);
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

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lsi;)V")
    private class193(class194 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1301(-8317);
            if (var3 != 0) {
                arg0.field3497--;
                this.field3443[var2] = new class10();
                this.field3443[var2].method83(arg0);
            }
        }
        this.field3442 = arg0.method1294((byte) 3);
        this.field3444 = arg0.method1294((byte) 3);
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    private class193() {
    }
}
