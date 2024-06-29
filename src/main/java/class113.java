import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[Lfk;")
    private class14[] field2032 = new class14[10];

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    private int field2033;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
    public final int method771() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2032[var2] != null && this.field2032[var2].field144 / 20 < var1) {
                var1 = this.field2032[var2].field144 / 20;
            }
        }
        if (this.field2033 < this.field2031 && this.field2033 / 20 < var1) {
            var1 = this.field2033 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2032[var3] != null) {
                this.field2032[var3].field144 -= var1 * 20;
            }
        }
        if (this.field2033 < this.field2031) {
            this.field2033 -= var1 * 20;
            this.field2031 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ltg;II)Lmj;")
    public static final class113 method772(class182 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1242(arg2, arg1, 6801);
        return var3 == null ? null : new class113(new class261(var3));
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()Ltd;")
    public final class72 method773() {
        byte[] var1 = this.method774();
        return new class72(22050, var1, this.field2033 * 22050 / 1000, this.field2031 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lik;)V")
    private class113(class261 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1693((byte) 83);
            if (var3 != 0) {
                arg0.field4587--;
                this.field2032[var2] = new class14();
                this.field2032[var2].method94(arg0);
            }
        }
        this.field2033 = arg0.method1740((byte) 55);
        this.field2031 = arg0.method1740((byte) 120);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    private class113() {
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()[B")
    private final byte[] method774() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2032[var2] != null && this.field2032[var2].field144 + this.field2032[var2].field132 > var1) {
                var1 = this.field2032[var2].field144 + this.field2032[var2].field132;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2032[var5] != null) {
                int var6 = this.field2032[var5].field132 * 22050 / 1000;
                int var7 = this.field2032[var5].field144 * 22050 / 1000;
                int[] var8 = this.field2032[var5].method92(var6, this.field2032[var5].field132);
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
