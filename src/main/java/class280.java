import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class280 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "[Laa;")
    private class172[] field4194 = new class172[10];

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()[B")
    private final byte[] method1848() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4194[var2] != null && this.field4194[var2].field2611 + this.field4194[var2].field2600 > var1) {
                var1 = this.field4194[var2].field2611 + this.field4194[var2].field2600;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4194[var5] != null) {
                int var6 = this.field4194[var5].field2600 * 22050 / 1000;
                int var7 = this.field4194[var5].field2611 * 22050 / 1000;
                int[] var8 = this.field4194[var5].method1063(var6, this.field4194[var5].field2600);
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

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()I")
    public final int method1849() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4194[var2] != null && this.field4194[var2].field2611 / 20 < var1) {
                var1 = this.field4194[var2].field2611 / 20;
            }
        }
        if (this.field4196 < this.field4195 && this.field4196 / 20 < var1) {
            var1 = this.field4196 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4194[var3] != null) {
                this.field4194[var3].field2611 -= var1 * 20;
            }
        }
        if (this.field4196 < this.field4195) {
            this.field4196 -= var1 * 20;
            this.field4195 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lpf;II)Ltj;")
    public static final class280 method1850(class294 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1973(1, arg1, arg2);
        return var3 == null ? null : new class280(new class248(var3));
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "()Ljk;")
    public final class260 method1851() {
        byte[] var1 = this.method1848();
        return new class260(22050, var1, this.field4196 * 22050 / 1000, this.field4195 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lfl;)V")
    private class280(class248 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1593((byte) 27);
            if (var3 != 0) {
                arg0.field3748--;
                this.field4194[var2] = new class172();
                this.field4194[var2].method1061(arg0);
            }
        }
        this.field4196 = arg0.method1575(false);
        this.field4195 = arg0.method1575(false);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    private class280() {
    }
}
