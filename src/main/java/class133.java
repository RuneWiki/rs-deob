import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class133 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "[Lub;")
    private class18[] field2083 = new class18[10];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "()I", line = 4)
    public final int method987() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2083[var2] != null && this.field2083[var2].field287 / 20 < var1) {
                var1 = this.field2083[var2].field287 / 20;
            }
        }
        if (this.field2084 < this.field2085 && this.field2084 / 20 < var1) {
            var1 = this.field2084 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2083[var3] != null) {
                this.field2083[var3].field287 -= var1 * 20;
            }
        }
        if (this.field2084 < this.field2085) {
            this.field2084 -= var1 * 20;
            this.field2085 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "()[B", line = 49)
    private final byte[] method988() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2083[var2] != null && this.field2083[var2].field287 + this.field2083[var2].field286 > var1) {
                var1 = this.field2083[var2].field287 + this.field2083[var2].field286;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2083[var5] != null) {
                int var6 = this.field2083[var5].field286 * 22050 / 1000;
                int var7 = this.field2083[var5].field287 * 22050 / 1000;
                int[] var8 = this.field2083[var5].method147(var6, this.field2083[var5].field286);
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

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "()Lbq;", line = 108)
    public final class189 method989() {
        byte[] var1 = this.method988();
        return new class189(22050, var1, this.field2084 * 22050 / 1000, this.field2085 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lbu;II)Loe;", line = 117)
    public static final class133 method990(class17 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method114(arg2, arg1, -17);
        return var3 == null ? null : new class133(new class145(var3));
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lcu;)V", line = 129)
    private class133(class145 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1063((byte) 122);
            if (var3 != 0) {
                arg0.field2289--;
                this.field2083[var2] = new class18();
                this.field2083[var2].method144(arg0);
            }
        }
        this.field2084 = arg0.method1069((byte) -110);
        this.field2085 = arg0.method1069((byte) -69);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 149)
    private class133() {
    }
}
