import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class38 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "[Llc;")
    private class123[] field673 = new class123[10];

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
    public final int method251() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field673[var2] != null && this.field673[var2].field2238 / 20 < var1) {
                var1 = this.field673[var2].field2238 / 20;
            }
        }
        if (this.field674 < this.field675 && this.field674 / 20 < var1) {
            var1 = this.field674 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field673[var3] != null) {
                this.field673[var3].field2238 -= var1 * 20;
            }
        }
        if (this.field674 < this.field675) {
            this.field674 -= var1 * 20;
            this.field675 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lnb;II)Ldd;")
    public static final class38 method252(class144 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method941((byte) 56, arg2, arg1);
        return var3 == null ? null : new class38(new class46(var3));
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()Ltf;")
    public final class213 method253() {
        byte[] var1 = this.method254();
        return new class213(22050, var1, this.field674 * 22050 / 1000, this.field675 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()[B")
    private final byte[] method254() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field673[var2] != null && this.field673[var2].field2243 + this.field673[var2].field2238 > var1) {
                var1 = this.field673[var2].field2243 + this.field673[var2].field2238;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field673[var5] != null) {
                int var6 = this.field673[var5].field2243 * 22050 / 1000;
                int var7 = this.field673[var5].field2238 * 22050 / 1000;
                int[] var8 = this.field673[var5].method835(var6, this.field673[var5].field2243);
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

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lea;)V")
    private class38(class46 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method347(26119);
            if (var3 != 0) {
                arg0.field831--;
                this.field673[var2] = new class123();
                this.field673[var2].method836(arg0);
            }
        }
        this.field674 = arg0.method301(98);
        this.field675 = arg0.method301(45);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    private class38() {
    }
}
