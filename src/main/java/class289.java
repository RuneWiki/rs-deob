import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class289 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[Lfi;")
    private class255[] field4947 = new class255[10];

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field4946;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "()I", line = 8)
    public final int method2080() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4947[var2] != null && this.field4947[var2].field4252 / 20 < var1) {
                var1 = this.field4947[var2].field4252 / 20;
            }
        }
        if (this.field4946 < this.field4945 && this.field4946 / 20 < var1) {
            var1 = this.field4946 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4947[var3] != null) {
                this.field4947[var3].field4252 -= var1 * 20;
            }
        }
        if (this.field4946 < this.field4945) {
            this.field4946 -= var1 * 20;
            this.field4945 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "()[B", line = 55)
    private final byte[] method2081() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4947[var2] != null && this.field4947[var2].field4252 + this.field4947[var2].field4248 > var1) {
                var1 = this.field4947[var2].field4252 + this.field4947[var2].field4248;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4947[var5] != null) {
                int var6 = this.field4947[var5].field4248 * 22050 / 1000;
                int var7 = this.field4947[var5].field4252 * 22050 / 1000;
                int[] var8 = this.field4947[var5].method1853(var6, this.field4947[var5].field4248);
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

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lwe;)V", line = 116)
    private class289(class47 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method368(-124);
            if (var3 != 0) {
                arg0.field857--;
                this.field4947[var2] = new class255();
                this.field4947[var2].method1851(arg0);
            }
        }
        this.field4946 = arg0.method379(-2);
        this.field4945 = arg0.method379(-2);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 149)
    private class289() {
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "()Lid;", line = 138)
    public final class253 method2082() {
        byte[] var1 = this.method2081();
        return new class253(22050, var1, this.field4946 * 22050 / 1000, this.field4945 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Loh;II)Led;", line = 143)
    public static final class289 method2083(class15 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method92(arg1, 0, arg2);
        return var3 == null ? null : new class289(new class47(var3));
    }
}
