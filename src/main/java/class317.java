import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class317 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[Ldg;")
    private class185[] field4908 = new class185[10];

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    private int field4910;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field4909;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()[B", line = 6)
    private final byte[] method2205() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4908[var2] != null && this.field4908[var2].field2931 + this.field4908[var2].field2930 > var1) {
                var1 = this.field4908[var2].field2931 + this.field4908[var2].field2930;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4908[var5] != null) {
                int var6 = this.field4908[var5].field2931 * 22050 / 1000;
                int var7 = this.field4908[var5].field2930 * 22050 / 1000;
                int[] var8 = this.field4908[var5].method1371(var6, this.field4908[var5].field2931);
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

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()Lid;", line = 67)
    public final class266 method2206() {
        byte[] var1 = this.method2205();
        return new class266(22050, var1, this.field4910 * 22050 / 1000, this.field4909 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljd;II)Lcj;", line = 74)
    public static final class317 method2207(class95 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method696(arg2, (byte) 108, arg1);
        return var3 == null ? null : new class317(new class254(var3));
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()I", line = 83)
    public final int method2208() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4908[var2] != null && this.field4908[var2].field2930 / 20 < var1) {
                var1 = this.field4908[var2].field2930 / 20;
            }
        }
        if (this.field4910 < this.field4909 && this.field4910 / 20 < var1) {
            var1 = this.field4910 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4908[var3] != null) {
                this.field4908[var3].field2930 -= var1 * 20;
            }
        }
        if (this.field4910 < this.field4909) {
            this.field4910 -= var1 * 20;
            this.field4909 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lwm;)V", line = 129)
    private class317(class254 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1774((byte) -126);
            if (var3 != 0) {
                arg0.field3866--;
                this.field4908[var2] = new class185();
                this.field4908[var2].method1369(arg0);
            }
        }
        this.field4910 = arg0.method1755(false);
        this.field4909 = arg0.method1755(false);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 149)
    private class317() {
    }
}
