import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class233 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[Lpf;")
    private class287[] field4204 = new class287[10];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()I")
    public final int method1621() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4204[var2] != null && this.field4204[var2].field5058 / 20 < var1) {
                var1 = this.field4204[var2].field5058 / 20;
            }
        }
        if (this.field4203 < this.field4205 && this.field4203 / 20 < var1) {
            var1 = this.field4203 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4204[var3] != null) {
                this.field4204[var3].field5058 -= var1 * 20;
            }
        }
        if (this.field4203 < this.field4205) {
            this.field4203 -= var1 * 20;
            this.field4205 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lsj;II)Lkk;")
    public static final class233 method1622(class49 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method353(arg2, -106, arg1);
        return var3 == null ? null : new class233(new class106(var3));
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()Lsh;")
    public final class212 method1623() {
        byte[] var1 = this.method1624();
        return new class212(22050, var1, this.field4203 * 22050 / 1000, this.field4205 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()[B")
    private final byte[] method1624() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4204[var2] != null && this.field4204[var2].field5058 + this.field4204[var2].field5051 > var1) {
                var1 = this.field4204[var2].field5058 + this.field4204[var2].field5051;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4204[var5] != null) {
                int var6 = this.field4204[var5].field5051 * 22050 / 1000;
                int var7 = this.field4204[var5].field5058 * 22050 / 1000;
                int[] var8 = this.field4204[var5].method1928(var6, this.field4204[var5].field5051);
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

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ltf;)V")
    private class233(class106 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method774((byte) 112);
            if (var3 != 0) {
                arg0.field2085--;
                this.field4204[var2] = new class287();
                this.field4204[var2].method1931(arg0);
            }
        }
        this.field4203 = arg0.method736(127);
        this.field4205 = arg0.method736(123);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    private class233() {
    }
}
