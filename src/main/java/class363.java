import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class363 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[Lwa;")
    private class434[] field5032 = new class434[10];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    private int field5030;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private int field5031;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lvh;II)Lum;")
    public static final class363 method2044(class240 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1411(true, arg2, arg1);
        return var3 == null ? null : new class363(new class365(var3));
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()[B")
    private final byte[] method2045() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5032[var2] != null && this.field5032[var2].field6326 + this.field5032[var2].field6323 > var1) {
                var1 = this.field5032[var2].field6326 + this.field5032[var2].field6323;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5032[var5] != null) {
                int var6 = this.field5032[var5].field6326 * 22050 / 1000;
                int var7 = this.field5032[var5].field6323 * 22050 / 1000;
                int[] var8 = this.field5032[var5].method2589(var6, this.field5032[var5].field6326);
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

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()I")
    public final int method2046() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5032[var2] != null && this.field5032[var2].field6323 / 20 < var1) {
                var1 = this.field5032[var2].field6323 / 20;
            }
        }
        if (this.field5030 < this.field5031 && this.field5030 / 20 < var1) {
            var1 = this.field5030 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5032[var3] != null) {
                this.field5032[var3].field6323 -= var1 * 20;
            }
        }
        if (this.field5030 < this.field5031) {
            this.field5030 -= var1 * 20;
            this.field5031 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()Lnv;")
    public final class286 method2047() {
        byte[] var1 = this.method2045();
        return new class286(22050, var1, this.field5030 * 22050 / 1000, this.field5031 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Llh;)V")
    private class363(class365 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2099(255);
            if (var3 != 0) {
                arg0.field5069--;
                this.field5032[var2] = new class434();
                this.field5032[var2].method2591(arg0);
            }
        }
        this.field5030 = arg0.method2062((byte) 14);
        this.field5031 = arg0.method2062((byte) 14);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
    private class363() {
    }
}
