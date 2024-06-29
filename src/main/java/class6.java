import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class6 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[Laj;")
    private class121[] field101 = new class121[10];

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()Lda;", line = 6)
    public final class26 method81() {
        byte[] var1 = this.method82();
        return new class26(22050, var1, this.field102 * 22050 / 1000, this.field100 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()[B", line = 15)
    private final byte[] method82() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field101[var2] != null && this.field101[var2].field1828 + this.field101[var2].field1825 > var1) {
                var1 = this.field101[var2].field1828 + this.field101[var2].field1825;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field101[var5] != null) {
                int var6 = this.field101[var5].field1828 * 22050 / 1000;
                int var7 = this.field101[var5].field1825 * 22050 / 1000;
                int[] var8 = this.field101[var5].method801(var6, this.field101[var5].field1828);
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

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lni;II)Lvl;", line = 74)
    public static final class6 method83(class202 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1342(-85, arg1, arg2);
        return var3 == null ? null : new class6(new class221(var3));
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()I", line = 82)
    public final int method84() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field101[var2] != null && this.field101[var2].field1825 / 20 < var1) {
                var1 = this.field101[var2].field1825 / 20;
            }
        }
        if (this.field102 < this.field100 && this.field102 / 20 < var1) {
            var1 = this.field102 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field101[var3] != null) {
                this.field101[var3].field1825 -= var1 * 20;
            }
        }
        if (this.field102 < this.field100) {
            this.field102 -= var1 * 20;
            this.field100 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lii;)V", line = 129)
    private class6(class221 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1509(true);
            if (var3 != 0) {
                arg0.field3610--;
                this.field101[var2] = new class121();
                this.field101[var2].method802(arg0);
            }
        }
        this.field102 = arg0.method1524((byte) 100);
        this.field100 = arg0.method1524((byte) 87);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 149)
    private class6() {
    }
}
