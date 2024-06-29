import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class2 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[Lmi;")
    private class7[] field17 = new class7[10];

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    private int field18;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lgj;")
    public final class128 method5() {
        byte[] var1 = this.method7();
        return new class128(22050, var1, this.field18 * 22050 / 1000, this.field16 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()I")
    public final int method6() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field17[var2] != null && this.field17[var2].field94 / 20 < var1) {
                var1 = this.field17[var2].field94 / 20;
            }
        }
        if (this.field18 < this.field16 && this.field18 / 20 < var1) {
            var1 = this.field18 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field17[var3] != null) {
                this.field17[var3].field94 -= var1 * 20;
            }
        }
        if (this.field18 < this.field16) {
            this.field18 -= var1 * 20;
            this.field16 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()[B")
    private final byte[] method7() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field17[var2] != null && this.field17[var2].field95 + this.field17[var2].field94 > var1) {
                var1 = this.field17[var2].field95 + this.field17[var2].field94;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field17[var5] != null) {
                int var6 = this.field17[var5].field95 * 22050 / 1000;
                int var7 = this.field17[var5].field94 * 22050 / 1000;
                int[] var8 = this.field17[var5].method29(var6, this.field17[var5].field95);
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

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lma;II)Lkc;")
    public static final class2 method8(class105 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method775(arg1, arg2, -24799);
        return var3 == null ? null : new class2(new class85(var3));
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lij;)V")
    private class2(class85 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method564((byte) 107);
            if (var3 != 0) {
                arg0.field1392--;
                this.field17[var2] = new class7();
                this.field17[var2].method30(arg0);
            }
        }
        this.field18 = arg0.method608(44);
        this.field16 = arg0.method608(84);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    private class2() {
    }
}
