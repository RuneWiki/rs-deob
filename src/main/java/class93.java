import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[Laf;")
    private class7[] field2387 = new class7[10];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    private int field2386;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    private int field2385;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()[B")
    private final byte[] method774() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2387[var2] != null && this.field2387[var2].field213 + this.field2387[var2].field206 > var1) {
                var1 = this.field2387[var2].field213 + this.field2387[var2].field206;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2387[var5] != null) {
                int var6 = this.field2387[var5].field213 * 22050 / 1000;
                int var7 = this.field2387[var5].field206 * 22050 / 1000;
                int[] var8 = this.field2387[var5].method31(var6, this.field2387[var5].field213);
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

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()I")
    public final int method775() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2387[var2] != null && this.field2387[var2].field206 / 20 < var1) {
                var1 = this.field2387[var2].field206 / 20;
            }
        }
        if (this.field2386 < this.field2385 && this.field2386 / 20 < var1) {
            var1 = this.field2386 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2387[var3] != null) {
                this.field2387[var3].field206 -= var1 * 20;
            }
        }
        if (this.field2386 < this.field2385) {
            this.field2386 -= var1 * 20;
            this.field2385 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()Lpd;")
    public final class108 method776() {
        byte[] var1 = this.method774();
        return new class108(22050, var1, this.field2386 * 22050 / 1000, this.field2385 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lq;II)Lnc;")
    public static final class93 method777(class111 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method898((byte) -43, arg2, arg1);
        return var3 == null ? null : new class93(new class114(var3));
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lqc;)V")
    private class93(class114 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method957((byte) 45);
            if (var3 != 0) {
                arg0.field2816--;
                this.field2387[var2] = new class7();
                this.field2387[var2].method32(arg0);
            }
        }
        this.field2386 = arg0.method944((byte) 124);
        this.field2385 = arg0.method944((byte) 111);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    private class93() {
    }
}
