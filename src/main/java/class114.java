import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class114 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[Lwj;")
    private class138[] field1775 = new class138[10];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    private int field1777;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ldk;II)Lfh;")
    public static final class114 method798(class251 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1680(arg2, arg1, -66);
        return var3 == null ? null : new class114(new class162(var3));
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()[B")
    private final byte[] method799() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1775[var2] != null && this.field1775[var2].field2191 + this.field1775[var2].field2186 > var1) {
                var1 = this.field1775[var2].field2191 + this.field1775[var2].field2186;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1775[var5] != null) {
                int var6 = this.field1775[var5].field2191 * 22050 / 1000;
                int var7 = this.field1775[var5].field2186 * 22050 / 1000;
                int[] var8 = this.field1775[var5].method965(var6, this.field1775[var5].field2191);
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

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()Lqj;")
    public final class248 method800() {
        byte[] var1 = this.method799();
        return new class248(22050, var1, this.field1777 * 22050 / 1000, this.field1776 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()I")
    public final int method801() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1775[var2] != null && this.field1775[var2].field2186 / 20 < var1) {
                var1 = this.field1775[var2].field2186 / 20;
            }
        }
        if (this.field1777 < this.field1776 && this.field1777 / 20 < var1) {
            var1 = this.field1777 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1775[var3] != null) {
                this.field1775[var3].field2186 -= var1 * 20;
            }
        }
        if (this.field1777 < this.field1776) {
            this.field1777 -= var1 * 20;
            this.field1776 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lwd;)V")
    private class114(class162 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 != 0) {
                arg0.field2568--;
                this.field1775[var2] = new class138();
                this.field1775[var2].method967(arg0);
            }
        }
        this.field1777 = arg0.method1142(-18970);
        this.field1776 = arg0.method1142(-18970);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    private class114() {
    }
}
