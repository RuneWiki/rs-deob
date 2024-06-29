import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class215 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "[Lvb;")
    private class182[] field3079 = new class182[10];

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lkm;II)Lve;", line = 5)
    public static final class215 method1490(class133 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method955(arg1, arg2, -21853);
        return var3 == null ? null : new class215(new class316(var3));
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "()Lcc;", line = 15)
    public final class87 method1491() {
        byte[] var1 = this.method1492();
        return new class87(22050, var1, this.field3081 * 22050 / 1000, this.field3080 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "()[B", line = 21)
    private final byte[] method1492() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3079[var2] != null && this.field3079[var2].field2505 + this.field3079[var2].field2495 > var1) {
                var1 = this.field3079[var2].field2505 + this.field3079[var2].field2495;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3079[var5] != null) {
                int var6 = this.field3079[var5].field2495 * 22050 / 1000;
                int var7 = this.field3079[var5].field2505 * 22050 / 1000;
                int[] var8 = this.field3079[var5].method1269(var6, this.field3079[var5].field2495);
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

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lcg;)V", line = 86)
    private class215(class316 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2219(16448);
            if (var3 != 0) {
                arg0.field4777--;
                this.field3079[var2] = new class182();
                this.field3079[var2].method1270(arg0);
            }
        }
        this.field3081 = arg0.method2220((byte) 103);
        this.field3080 = arg0.method2220((byte) 63);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 106)
    private class215() {
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "()I", line = 110)
    public final int method1493() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3079[var2] != null && this.field3079[var2].field2505 / 20 < var1) {
                var1 = this.field3079[var2].field2505 / 20;
            }
        }
        if (this.field3081 < this.field3080 && this.field3081 / 20 < var1) {
            var1 = this.field3081 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3079[var3] != null) {
                this.field3079[var3].field2505 -= var1 * 20;
            }
        }
        if (this.field3081 < this.field3080) {
            this.field3081 -= var1 * 20;
            this.field3080 -= var1 * 20;
        }
        return var1;
    }
}
