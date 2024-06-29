import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class667 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[Lrha;")
    private class588[] field9466 = new class588[10];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    private int field9465;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    private int field9467;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()Lso;", line = 9)
    public final class538 method3737() {
        byte[] var1 = this.method3740();
        return new class538(22050, var1, this.field9465 * 22050 / 1000, this.field9467 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lla;II)Lgd;", line = 15)
    public static final class667 method3738(class422 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2624(0, arg1, arg2);
        return var3 == null ? null : new class667(new class301(var3));
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lofa;)V", line = 69)
    private class667(class301 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1987(-120);
            if (var3 != 0) {
                arg0.field4534--;
                this.field9466[var2] = new class588();
                this.field9466[var2].method3384(arg0);
            }
        }
        this.field9465 = arg0.method1989((byte) -50);
        this.field9467 = arg0.method1989((byte) -49);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 89)
    private class667() {
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()I", line = 27)
    public final int method3739() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field9466[var2] != null && this.field9466[var2].field8296 / 20 < var1) {
                var1 = this.field9466[var2].field8296 / 20;
            }
        }
        if (this.field9465 < this.field9467 && this.field9465 / 20 < var1) {
            var1 = this.field9465 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field9466[var3] != null) {
                this.field9466[var3].field8296 -= var1 * 20;
            }
        }
        if (this.field9465 < this.field9467) {
            this.field9465 -= var1 * 20;
            this.field9467 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()[B", line = 93)
    private final byte[] method3740() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field9466[var2] != null && this.field9466[var2].field8296 + this.field9466[var2].field8295 > var1) {
                var1 = this.field9466[var2].field8296 + this.field9466[var2].field8295;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field9466[var5] != null) {
                int var6 = this.field9466[var5].field8295 * 22050 / 1000;
                int var7 = this.field9466[var5].field8296 * 22050 / 1000;
                int[] var8 = this.field9466[var5].method3383(var6, this.field9466[var5].field8295);
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
}
