import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class383 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "[Ljo;")
    private class184[] field5432 = new class184[10];

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    private int field5431;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ltj;II)Lor;")
    public static final class383 method2436(class108 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method643(arg1, arg2, true);
        return var3 == null ? null : new class383(new class130(var3));
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "()[B")
    private final byte[] method2437() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5432[var2] != null && this.field5432[var2].field2629 + this.field5432[var2].field2624 > var1) {
                var1 = this.field5432[var2].field2629 + this.field5432[var2].field2624;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5432[var5] != null) {
                int var6 = this.field5432[var5].field2629 * 22050 / 1000;
                int var7 = this.field5432[var5].field2624 * 22050 / 1000;
                int[] var8 = this.field5432[var5].method1322(var6, this.field5432[var5].field2629);
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

    @OriginalMember(owner = "client!or", name = "b", descriptor = "()Lbg;")
    public final class272 method2438() {
        byte[] var1 = this.method2437();
        return new class272(22050, var1, this.field5431 * 22050 / 1000, this.field5433 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "()I")
    public final int method2439() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5432[var2] != null && this.field5432[var2].field2624 / 20 < var1) {
                var1 = this.field5432[var2].field2624 / 20;
            }
        }
        if (this.field5431 < this.field5433 && this.field5431 / 20 < var1) {
            var1 = this.field5431 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5432[var3] != null) {
                this.field5432[var3].field2624 -= var1 * 20;
            }
        }
        if (this.field5431 < this.field5433) {
            this.field5431 -= var1 * 20;
            this.field5433 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Llf;)V")
    private class383(class130 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method837(true);
            if (var3 != 0) {
                arg0.field1880--;
                this.field5432[var2] = new class184();
                this.field5432[var2].method1321(arg0);
            }
        }
        this.field5431 = arg0.method798(false);
        this.field5433 = arg0.method798(false);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
    private class383() {
    }
}
