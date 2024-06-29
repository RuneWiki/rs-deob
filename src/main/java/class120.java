import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class120 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[Lfca;")
    private class76[] field1932 = new class76[10];

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    private int field1933;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
    public final int method1070() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1932[var2] != null && this.field1932[var2].field959 / 20 < var1) {
                var1 = this.field1932[var2].field959 / 20;
            }
        }
        if (this.field1933 < this.field1931 && this.field1933 / 20 < var1) {
            var1 = this.field1933 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1932[var3] != null) {
                this.field1932[var3].field959 -= var1 * 20;
            }
        }
        if (this.field1933 < this.field1931) {
            this.field1933 -= var1 * 20;
            this.field1931 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()Lqr;")
    public final class59 method1071() {
        byte[] var1 = this.method1072();
        return new class59(22050, var1, this.field1933 * 22050 / 1000, this.field1931 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()[B")
    private final byte[] method1072() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1932[var2] != null && this.field1932[var2].field959 + this.field1932[var2].field947 > var1) {
                var1 = this.field1932[var2].field959 + this.field1932[var2].field947;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1932[var5] != null) {
                int var6 = this.field1932[var5].field947 * 22050 / 1000;
                int var7 = this.field1932[var5].field959 * 22050 / 1000;
                int[] var8 = this.field1932[var5].method756(var6, this.field1932[var5].field947);
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

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lri;II)Lmc;")
    public static final class120 method1073(class97 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method926(arg1, -127, arg2);
        return var3 == null ? null : new class120(new class6(var3));
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lie;)V")
    private class120(class6 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method70(-9059);
            if (var3 != 0) {
                arg0.field57--;
                this.field1932[var2] = new class76();
                this.field1932[var2].method755(arg0);
            }
        }
        this.field1933 = arg0.method67(12021);
        this.field1931 = arg0.method67(12021);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    private class120() {
    }
}
