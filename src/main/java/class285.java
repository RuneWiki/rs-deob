import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class285 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[Ldg;")
    private class222[] field4137 = new class222[10];

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    private int field4139;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    private int field4138;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()Lig;", line = 5)
    public final class13 method1958() {
        byte[] var1 = this.method1960();
        return new class13(22050, var1, this.field4139 * 22050 / 1000, this.field4138 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Llm;II)Lio;", line = 12)
    public static final class285 method1959(class347 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2261(arg2, arg1, 115);
        return var3 == null ? null : new class285(new class228(var3));
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()[B", line = 22)
    private final byte[] method1960() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4137[var2] != null && this.field4137[var2].field2919 + this.field4137[var2].field2917 > var1) {
                var1 = this.field4137[var2].field2919 + this.field4137[var2].field2917;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4137[var5] != null) {
                int var6 = this.field4137[var5].field2919 * 22050 / 1000;
                int var7 = this.field4137[var5].field2917 * 22050 / 1000;
                int[] var8 = this.field4137[var5].method1293(var6, this.field4137[var5].field2919);
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

    @OriginalMember(owner = "client!io", name = "c", descriptor = "()I", line = 82)
    public final int method1961() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4137[var2] != null && this.field4137[var2].field2917 / 20 < var1) {
                var1 = this.field4137[var2].field2917 / 20;
            }
        }
        if (this.field4139 < this.field4138 && this.field4139 / 20 < var1) {
            var1 = this.field4139 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4137[var3] != null) {
                this.field4137[var3].field2917 -= var1 * 20;
            }
        }
        if (this.field4139 < this.field4138) {
            this.field4139 -= var1 * 20;
            this.field4138 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lnj;)V", line = 129)
    private class285(class228 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1348(-123);
            if (var3 != 0) {
                arg0.field3029--;
                this.field4137[var2] = new class222();
                this.field4137[var2].method1292(arg0);
            }
        }
        this.field4139 = arg0.method1343(255);
        this.field4138 = arg0.method1343(255);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 149)
    private class285() {
    }
}
