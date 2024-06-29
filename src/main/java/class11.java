import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lte;")
    private class119[] field343 = new class119[10];

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method106() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field343[var2] != null && this.field343[var2].field2953 + this.field343[var2].field2948 > var1) {
                var1 = this.field343[var2].field2953 + this.field343[var2].field2948;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field343[var5] != null) {
                int var6 = this.field343[var5].field2953 * 22050 / 1000;
                int var7 = this.field343[var5].field2948 * 22050 / 1000;
                int[] var8 = this.field343[var5].method946(var6, this.field343[var5].field2953);
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

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()Lta;", line = 66)
    public final class115 method107() {
        byte[] var1 = this.method106();
        return new class115(22050, var1, this.field345 * 22050 / 1000, this.field344 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lgb;)V", line = 127)
    private class11(class39 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method330(-30864);
            if (var3 != 0) {
                arg0.field957--;
                this.field343[var2] = new class119();
                this.field343[var2].method943(arg0);
            }
        }
        this.field345 = arg0.method343((byte) -6);
        this.field344 = arg0.method343((byte) -6);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 147)
    private class11() {
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lrd;II)Lbd;", line = 77)
    public static final class11 method108(class106 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method857(30580, arg1, arg2);
        return var3 == null ? null : new class11(new class39(var3));
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()I", line = 85)
    public final int method109() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field343[var2] != null && this.field343[var2].field2948 / 20 < var1) {
                var1 = this.field343[var2].field2948 / 20;
            }
        }
        if (this.field345 < this.field344 && this.field345 / 20 < var1) {
            var1 = this.field345 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field343[var3] != null) {
                this.field343[var3].field2948 -= var1 * 20;
            }
        }
        if (this.field345 < this.field344) {
            this.field345 -= var1 * 20;
            this.field344 -= var1 * 20;
        }
        return var1;
    }
}
