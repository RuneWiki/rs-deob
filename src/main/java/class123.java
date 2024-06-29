import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[Ldb;")
    private class24[] field2883 = new class24[10];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
    public final int method971() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2883[var2] != null && this.field2883[var2].field434 / 20 < var1) {
                var1 = this.field2883[var2].field434 / 20;
            }
        }
        if (this.field2881 < this.field2882 && this.field2881 / 20 < var1) {
            var1 = this.field2881 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2883[var3] != null) {
                this.field2883[var3].field434 -= var1 * 20;
            }
        }
        if (this.field2881 < this.field2882) {
            this.field2881 -= var1 * 20;
            this.field2882 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()[B")
    private final byte[] method972() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2883[var2] != null && this.field2883[var2].field447 + this.field2883[var2].field434 > var1) {
                var1 = this.field2883[var2].field447 + this.field2883[var2].field434;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2883[var5] != null) {
                int var6 = this.field2883[var5].field447 * 22050 / 1000;
                int var7 = this.field2883[var5].field434 * 22050 / 1000;
                int[] var8 = this.field2883[var5].method170(var6, this.field2883[var5].field447);
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

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()Lib;")
    public final class58 method973() {
        byte[] var1 = this.method972();
        return new class58(22050, var1, this.field2881 * 22050 / 1000, this.field2882 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lea;II)Lre;")
    public static final class123 method974(class30 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method206(arg1, arg2, -69);
        return var3 == null ? null : new class123(new class66(var3));
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljd;)V")
    private class123(class66 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method533(255);
            if (var3 != 0) {
                arg0.field1569--;
                this.field2883[var2] = new class24();
                this.field2883[var2].method169(arg0);
            }
        }
        this.field2881 = arg0.method532(0);
        this.field2882 = arg0.method532(0);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    private class123() {
    }
}
