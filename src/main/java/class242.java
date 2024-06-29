import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class242 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "[Ltf;")
    private class152[] field3522 = new class152[10];

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    private int field3524;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()I", line = 4)
    public final int method1680() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3522[var2] != null && this.field3522[var2].field2106 / 20 < var1) {
                var1 = this.field3522[var2].field2106 / 20;
            }
        }
        if (this.field3524 < this.field3523 && this.field3524 / 20 < var1) {
            var1 = this.field3524 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3522[var3] != null) {
                this.field3522[var3].field2106 -= var1 * 20;
            }
        }
        if (this.field3524 < this.field3523) {
            this.field3524 -= var1 * 20;
            this.field3523 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()Lqq;", line = 47)
    public final class44 method1681() {
        byte[] var1 = this.method1683();
        return new class44(22050, var1, this.field3524 * 22050 / 1000, this.field3523 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lnl;II)Lju;", line = 53)
    public static final class242 method1682(class435 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2633(arg1, arg2, -28);
        return var3 == null ? null : new class242(new class161(var3));
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lkk;)V", line = 128)
    private class242(class161 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1172((byte) -127);
            if (var3 != 0) {
                arg0.field2298--;
                this.field3522[var2] = new class152();
                this.field3522[var2].method1083(arg0);
            }
        }
        this.field3524 = arg0.method1134(-16848);
        this.field3523 = arg0.method1134(-16848);
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V", line = 148)
    private class242() {
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "()[B", line = 70)
    private final byte[] method1683() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3522[var2] != null && this.field3522[var2].field2106 + this.field3522[var2].field2104 > var1) {
                var1 = this.field3522[var2].field2106 + this.field3522[var2].field2104;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3522[var5] != null) {
                int var6 = this.field3522[var5].field2104 * 22050 / 1000;
                int var7 = this.field3522[var5].field2106 * 22050 / 1000;
                int[] var8 = this.field3522[var5].method1085(var6, this.field3522[var5].field2104);
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
