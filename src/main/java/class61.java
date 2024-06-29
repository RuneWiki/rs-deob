import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lef;")
    private class35[] field1403 = new class35[10];

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lkb;II)Lie;")
    public static final class61 method515(class71 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method572(arg1, false, arg2);
        return var3 == null ? null : new class61(new class122(var3));
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "()[B")
    private final byte[] method516() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1403[var2] != null && this.field1403[var2].field872 + this.field1403[var2].field869 > var1) {
                var1 = this.field1403[var2].field872 + this.field1403[var2].field869;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1403[var5] != null) {
                int var6 = this.field1403[var5].field869 * 22050 / 1000;
                int var7 = this.field1403[var5].field872 * 22050 / 1000;
                int[] var8 = this.field1403[var5].method312(var6, this.field1403[var5].field869);
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

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()Lvb;")
    public final class146 method517() {
        byte[] var1 = this.method516();
        return new class146(22050, var1, this.field1402 * 22050 / 1000, this.field1401 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()I")
    public final int method518() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1403[var2] != null && this.field1403[var2].field872 / 20 < var1) {
                var1 = this.field1403[var2].field872 / 20;
            }
        }
        if (this.field1402 < this.field1401 && this.field1402 / 20 < var1) {
            var1 = this.field1402 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1403[var3] != null) {
                this.field1403[var3].field872 -= var1 * 20;
            }
        }
        if (this.field1402 < this.field1401) {
            this.field1402 -= var1 * 20;
            this.field1401 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lrd;)V")
    private class61(class122 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method931((byte) 124);
            if (var3 != 0) {
                arg0.field2903--;
                this.field1403[var2] = new class35();
                this.field1403[var2].method315(arg0);
            }
        }
        this.field1402 = arg0.method965(false);
        this.field1401 = arg0.method965(false);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    private class61() {
    }
}
