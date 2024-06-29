import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class186 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[Lek;")
    private class239[] field2688 = new class239[10];

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lbc;II)Lug;")
    public static final class186 method1212(class282 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1861(arg2, arg1, 1);
        return var3 == null ? null : new class186(new class216(var3));
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()Lik;")
    public final class295 method1213() {
        byte[] var1 = this.method1215();
        return new class295(22050, var1, this.field2690 * 22050 / 1000, this.field2689 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()I")
    public final int method1214() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2688[var2] != null && this.field2688[var2].field3458 / 20 < var1) {
                var1 = this.field2688[var2].field3458 / 20;
            }
        }
        if (this.field2690 < this.field2689 && this.field2690 / 20 < var1) {
            var1 = this.field2690 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2688[var3] != null) {
                this.field2688[var3].field3458 -= var1 * 20;
            }
        }
        if (this.field2690 < this.field2689) {
            this.field2690 -= var1 * 20;
            this.field2689 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()[B")
    private final byte[] method1215() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2688[var2] != null && this.field2688[var2].field3458 + this.field2688[var2].field3445 > var1) {
                var1 = this.field2688[var2].field3458 + this.field2688[var2].field3445;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2688[var5] != null) {
                int var6 = this.field2688[var5].field3445 * 22050 / 1000;
                int var7 = this.field2688[var5].field3458 * 22050 / 1000;
                int[] var8 = this.field2688[var5].method1553(var6, this.field2688[var5].field3445);
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

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lqi;)V")
    private class186(class216 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1407(115);
            if (var3 != 0) {
                arg0.field3021--;
                this.field2688[var2] = new class239();
                this.field2688[var2].method1552(arg0);
            }
        }
        this.field2690 = arg0.method1380(true);
        this.field2689 = arg0.method1380(true);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    private class186() {
    }
}
