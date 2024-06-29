import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class44 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[Lcl;")
    private class27[] field742 = new class27[10];

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lpi;II)Lie;")
    public static final class44 method295(class181 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1293(arg2, arg1, (byte) -115);
        return var3 == null ? null : new class44(new class75(var3));
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()Ldk;")
    public final class224 method296() {
        byte[] var1 = this.method297();
        return new class224(22050, var1, this.field743 * 22050 / 1000, this.field744 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()[B")
    private final byte[] method297() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field742[var2] != null && this.field742[var2].field547 + this.field742[var2].field544 > var1) {
                var1 = this.field742[var2].field547 + this.field742[var2].field544;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field742[var5] != null) {
                int var6 = this.field742[var5].field544 * 22050 / 1000;
                int var7 = this.field742[var5].field547 * 22050 / 1000;
                int[] var8 = this.field742[var5].method193(var6, this.field742[var5].field544);
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

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()I")
    public final int method298() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field742[var2] != null && this.field742[var2].field547 / 20 < var1) {
                var1 = this.field742[var2].field547 / 20;
            }
        }
        if (this.field743 < this.field744 && this.field743 / 20 < var1) {
            var1 = this.field743 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field742[var3] != null) {
                this.field742[var3].field547 -= var1 * 20;
            }
        }
        if (this.field743 < this.field744) {
            this.field743 -= var1 * 20;
            this.field744 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lwe;)V")
    private class44(class75 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method558(1);
            if (var3 != 0) {
                arg0.field1380--;
                this.field742[var2] = new class27();
                this.field742[var2].method194(arg0);
            }
        }
        this.field743 = arg0.method545((byte) 36);
        this.field744 = arg0.method545((byte) -120);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    private class44() {
    }
}
