import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class213 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[Ll;")
    private class7[] field3635 = new class7[10];

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field3636;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ltg;II)Lai;")
    public static final class213 method1423(class75 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method571(arg1, arg2, 125);
        return var3 == null ? null : new class213(new class216(var3));
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()I")
    public final int method1424() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3635[var2] != null && this.field3635[var2].field101 / 20 < var1) {
                var1 = this.field3635[var2].field101 / 20;
            }
        }
        if (this.field3637 < this.field3636 && this.field3637 / 20 < var1) {
            var1 = this.field3637 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3635[var3] != null) {
                this.field3635[var3].field101 -= var1 * 20;
            }
        }
        if (this.field3637 < this.field3636) {
            this.field3637 -= var1 * 20;
            this.field3636 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()[B")
    private final byte[] method1425() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3635[var2] != null && this.field3635[var2].field101 + this.field3635[var2].field100 > var1) {
                var1 = this.field3635[var2].field101 + this.field3635[var2].field100;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3635[var5] != null) {
                int var6 = this.field3635[var5].field100 * 22050 / 1000;
                int var7 = this.field3635[var5].field101 * 22050 / 1000;
                int[] var8 = this.field3635[var5].method43(var6, this.field3635[var5].field100);
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

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()Lfc;")
    public final class89 method1426() {
        byte[] var1 = this.method1425();
        return new class89(22050, var1, this.field3637 * 22050 / 1000, this.field3636 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Llj;)V")
    private class213(class216 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1446(5350);
            if (var3 != 0) {
                arg0.field3728--;
                this.field3635[var2] = new class7();
                this.field3635[var2].method42(arg0);
            }
        }
        this.field3637 = arg0.method1487(62);
        this.field3636 = arg0.method1487(17);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    private class213() {
    }
}
