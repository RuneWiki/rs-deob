import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class306 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "[Lgl;")
    private class258[] field5280 = new class258[10];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    private int field5282;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field5281;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()I", line = 5)
    public final int method2130() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5280[var2] != null && this.field5280[var2].field4466 / 20 < var1) {
                var1 = this.field5280[var2].field4466 / 20;
            }
        }
        if (this.field5282 < this.field5281 && this.field5282 / 20 < var1) {
            var1 = this.field5282 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5280[var3] != null) {
                this.field5280[var3].field4466 -= var1 * 20;
            }
        }
        if (this.field5282 < this.field5281) {
            this.field5282 -= var1 * 20;
            this.field5281 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lng;II)Led;", line = 50)
    public static final class306 method2131(class138 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1016(arg1, 100, arg2);
        return var3 == null ? null : new class306(new class41(var3));
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lra;)V", line = 65)
    private class306(class41 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method357(false);
            if (var3 != 0) {
                arg0.field738--;
                this.field5280[var2] = new class258();
                this.field5280[var2].method1815(arg0);
            }
        }
        this.field5282 = arg0.method346(-16);
        this.field5281 = arg0.method346(-16);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 90)
    private class306() {
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()Lof;", line = 87)
    public final class268 method2132() {
        byte[] var1 = this.method2133();
        return new class268(22050, var1, this.field5282 * 22050 / 1000, this.field5281 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method2133() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5280[var2] != null && this.field5280[var2].field4468 + this.field5280[var2].field4466 > var1) {
                var1 = this.field5280[var2].field4468 + this.field5280[var2].field4466;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5280[var5] != null) {
                int var6 = this.field5280[var5].field4468 * 22050 / 1000;
                int var7 = this.field5280[var5].field4466 * 22050 / 1000;
                int[] var8 = this.field5280[var5].method1818(var6, this.field5280[var5].field4468);
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
