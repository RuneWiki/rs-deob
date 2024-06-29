import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class174 {

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "[Lme;")
    private class196[] field2639 = new class196[10];

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    private int field2638;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lwu;II)Ltca;")
    public static final class174 method1219(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2218((byte) 125, arg1, arg2);
        return var3 == null ? null : new class174(new class677(var3));
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "()Lct;")
    public final class147 method1220() {
        byte[] var1 = this.method1222();
        return new class147(22050, var1, this.field2640 * 22050 / 1000, this.field2638 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "()I")
    public final int method1221() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2639[var2] != null && this.field2639[var2].field2952 / 20 < var1) {
                var1 = this.field2639[var2].field2952 / 20;
            }
        }
        if (this.field2640 < this.field2638 && this.field2640 / 20 < var1) {
            var1 = this.field2640 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2639[var3] != null) {
                this.field2639[var3].field2952 -= var1 * 20;
            }
        }
        if (this.field2640 < this.field2638) {
            this.field2640 -= var1 * 20;
            this.field2638 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "()[B")
    private final byte[] method1222() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2639[var2] != null && this.field2639[var2].field2952 + this.field2639[var2].field2950 > var1) {
                var1 = this.field2639[var2].field2952 + this.field2639[var2].field2950;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2639[var5] != null) {
                int var6 = this.field2639[var5].field2950 * 22050 / 1000;
                int var7 = this.field2639[var5].field2952 * 22050 / 1000;
                int[] var8 = this.field2639[var5].method1335(var6, this.field2639[var5].field2950);
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

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lee;)V")
    private class174(class677 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3821((byte) 80);
            if (var3 != 0) {
                arg0.field9419--;
                this.field2639[var2] = new class196();
                this.field2639[var2].method1334(arg0);
            }
        }
        this.field2640 = arg0.method3807(-1);
        this.field2638 = arg0.method3807(-1);
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
    private class174() {
    }
}
