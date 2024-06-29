import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class112 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[Ljb;")
    private class121[] field2112 = new class121[10];

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()[B")
    private final byte[] method890() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2112[var2] != null && this.field2112[var2].field2284 + this.field2112[var2].field2274 > var1) {
                var1 = this.field2112[var2].field2284 + this.field2112[var2].field2274;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2112[var5] != null) {
                int var6 = this.field2112[var5].field2274 * 22050 / 1000;
                int var7 = this.field2112[var5].field2284 * 22050 / 1000;
                int[] var8 = this.field2112[var5].method949(var6, this.field2112[var5].field2274);
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

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lpa;II)Llk;")
    public static final class112 method891(class123 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method973(arg1, true, arg2);
        return var3 == null ? null : new class112(new class81(var3));
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lpg;)V")
    private class112(class81 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method622(true);
            if (var3 != 0) {
                arg0.field1541--;
                this.field2112[var2] = new class121();
                this.field2112[var2].method947(arg0);
            }
        }
        this.field2113 = arg0.method658(118);
        this.field2111 = arg0.method658(-66);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()I")
    public final int method892() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2112[var2] != null && this.field2112[var2].field2284 / 20 < var1) {
                var1 = this.field2112[var2].field2284 / 20;
            }
        }
        if (this.field2113 < this.field2111 && this.field2113 / 20 < var1) {
            var1 = this.field2113 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2112[var3] != null) {
                this.field2112[var3].field2284 -= var1 * 20;
            }
        }
        if (this.field2113 < this.field2111) {
            this.field2113 -= var1 * 20;
            this.field2111 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    private class112() {
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "()Lqa;")
    public final class167 method893() {
        byte[] var1 = this.method890();
        return new class167(22050, var1, this.field2113 * 22050 / 1000, this.field2111 * 22050 / 1000);
    }
}
