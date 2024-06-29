import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[Lce;")
    private class18[] field934 = new class18[10];

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method279() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field934[var2] != null && this.field934[var2].field467 + this.field934[var2].field455 > var1) {
                var1 = this.field934[var2].field467 + this.field934[var2].field455;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field934[var5] != null) {
                int var6 = this.field934[var5].field467 * 22050 / 1000;
                int var7 = this.field934[var5].field455 * 22050 / 1000;
                int[] var8 = this.field934[var5].method132(var6, this.field934[var5].field467);
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

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()I", line = 64)
    public final int method280() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field934[var2] != null && this.field934[var2].field455 / 20 < var1) {
                var1 = this.field934[var2].field455 / 20;
            }
        }
        if (this.field932 < this.field933 && this.field932 / 20 < var1) {
            var1 = this.field932 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field934[var3] != null) {
                this.field934[var3].field455 -= var1 * 20;
            }
        }
        if (this.field932 < this.field933) {
            this.field932 -= var1 * 20;
            this.field933 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()Lka;", line = 112)
    public final class60 method281() {
        byte[] var1 = this.method279();
        return new class60(22050, var1, this.field932 * 22050 / 1000, this.field933 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Luc;)V", line = 119)
    private class35(class122 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method943(-1025);
            if (var3 != 0) {
                arg0.field3047--;
                this.field934[var2] = new class18();
                this.field934[var2].method133(arg0);
            }
        }
        this.field932 = arg0.method938((byte) -92);
        this.field933 = arg0.method938((byte) 34);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 140)
    private class35() {
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ls;II)Lfd;", line = 144)
    public static final class35 method282(class111 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method808((byte) -117, arg1, arg2);
        return var3 == null ? null : new class35(new class122(var3));
    }
}
