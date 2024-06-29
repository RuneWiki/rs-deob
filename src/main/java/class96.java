import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[Lpc;")
    private class107[] field2258 = new class107[10];

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    private int field2257;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
    public final int method751() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2258[var2] != null && this.field2258[var2].field2493 / 20 < var1) {
                var1 = this.field2258[var2].field2493 / 20;
            }
        }
        if (this.field2257 < this.field2259 && this.field2257 / 20 < var1) {
            var1 = this.field2257 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2258[var3] != null) {
                this.field2258[var3].field2493 -= var1 * 20;
            }
        }
        if (this.field2257 < this.field2259) {
            this.field2257 -= var1 * 20;
            this.field2259 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lff;II)Lnf;")
    public static final class96 method752(class42 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method350(arg1, -103, arg2);
        return var3 == null ? null : new class96(new class105(var3));
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "()Lqf;")
    public final class117 method753() {
        byte[] var1 = this.method754();
        return new class117(22050, var1, this.field2257 * 22050 / 1000, this.field2259 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lpa;)V")
    private class96(class105 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method831((byte) 76);
            if (var3 != 0) {
                arg0.field2404--;
                this.field2258[var2] = new class107();
                this.field2258[var2].method856(arg0);
            }
        }
        this.field2257 = arg0.method838((byte) 5);
        this.field2259 = arg0.method838((byte) 5);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "()[B")
    private final byte[] method754() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2258[var2] != null && this.field2258[var2].field2493 + this.field2258[var2].field2480 > var1) {
                var1 = this.field2258[var2].field2493 + this.field2258[var2].field2480;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2258[var5] != null) {
                int var6 = this.field2258[var5].field2480 * 22050 / 1000;
                int var7 = this.field2258[var5].field2493 * 22050 / 1000;
                int[] var8 = this.field2258[var5].method854(var6, this.field2258[var5].field2480);
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

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    private class96() {
    }
}
