import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class237 {

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "[Lww;")
    private class682[] field3256 = new class682[10];

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    private int field3257;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "()[B")
    private final byte[] method1483() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3256[var2] != null && this.field3256[var2].field9735 + this.field3256[var2].field9733 > var1) {
                var1 = this.field3256[var2].field9735 + this.field3256[var2].field9733;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3256[var5] != null) {
                int var6 = this.field3256[var5].field9735 * 22050 / 1000;
                int var7 = this.field3256[var5].field9733 * 22050 / 1000;
                int[] var8 = this.field3256[var5].method3864(var6, this.field3256[var5].field9735);
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

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lsea;II)Loba;")
    public static final class237 method1484(class648 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3654(-15615, arg1, arg2);
        return var3 == null ? null : new class237(new class501(var3));
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lac;)V")
    private class237(class501 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 != 0) {
                arg0.field6892--;
                this.field3256[var2] = new class682();
                this.field3256[var2].method3865(arg0);
            }
        }
        this.field3257 = arg0.method2845(-1);
        this.field3255 = arg0.method2845(-1);
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "()Lbu;")
    public final class19 method1485() {
        byte[] var1 = this.method1483();
        return new class19(22050, var1, this.field3257 * 22050 / 1000, this.field3255 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "()I")
    public final int method1486() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3256[var2] != null && this.field3256[var2].field9733 / 20 < var1) {
                var1 = this.field3256[var2].field9733 / 20;
            }
        }
        if (this.field3257 < this.field3255 && this.field3257 / 20 < var1) {
            var1 = this.field3257 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3256[var3] != null) {
                this.field3256[var3].field9733 -= var1 * 20;
            }
        }
        if (this.field3257 < this.field3255) {
            this.field3257 -= var1 * 20;
            this.field3255 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
    private class237() {
    }
}
