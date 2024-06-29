import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Lmi;")
    private class258[] field566 = new class258[10];

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()Lck;", line = 9)
    public final class227 method162() {
        byte[] var1 = this.method163();
        return new class227(22050, var1, this.field568 * 22050 / 1000, this.field567 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()[B", line = 15)
    private final byte[] method163() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field566[var2] != null && this.field566[var2].field4445 + this.field566[var2].field4440 > var1) {
                var1 = this.field566[var2].field4445 + this.field566[var2].field4440;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field566[var5] != null) {
                int var6 = this.field566[var5].field4445 * 22050 / 1000;
                int var7 = this.field566[var5].field4440 * 22050 / 1000;
                int[] var8 = this.field566[var5].method1816(var6, this.field566[var5].field4445);
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

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldj;II)Lna;", line = 75)
    public static final class25 method164(class314 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2155(arg2, arg1, (byte) 70);
        return var3 == null ? null : new class25(new class194(var3));
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()I", line = 83)
    public final int method165() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field566[var2] != null && this.field566[var2].field4440 / 20 < var1) {
                var1 = this.field566[var2].field4440 / 20;
            }
        }
        if (this.field568 < this.field567 && this.field568 / 20 < var1) {
            var1 = this.field568 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field566[var3] != null) {
                this.field566[var3].field4440 -= var1 * 20;
            }
        }
        if (this.field568 < this.field567) {
            this.field568 -= var1 * 20;
            this.field567 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lbg;)V", line = 129)
    private class25(class194 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1325(7627);
            if (var3 != 0) {
                arg0.field3380--;
                this.field566[var2] = new class258();
                this.field566[var2].method1817(arg0);
            }
        }
        this.field568 = arg0.method1308(-39);
        this.field567 = arg0.method1308(-127);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 149)
    private class25() {
    }
}
