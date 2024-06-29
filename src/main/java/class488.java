import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class488 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[Lil;")
    private class7[] field7209 = new class7[10];

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    private int field7211;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    private int field7210;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Ldh;)V", line = 129)
    private class488(class209 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1428(32122);
            if (var3 != 0) {
                arg0.field3037--;
                this.field7209[var2] = new class7();
                this.field7209[var2].method41(arg0);
            }
        }
        this.field7211 = arg0.method1450((byte) 92);
        this.field7210 = arg0.method1450((byte) 32);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 149)
    private class488() {
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()[B", line = 13)
    private final byte[] method2895() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7209[var2] != null && this.field7209[var2].field99 + this.field7209[var2].field102 > var1) {
                var1 = this.field7209[var2].field99 + this.field7209[var2].field102;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field7209[var5] != null) {
                int var6 = this.field7209[var5].field99 * 22050 / 1000;
                int var7 = this.field7209[var5].field102 * 22050 / 1000;
                int[] var8 = this.field7209[var5].method44(var6, this.field7209[var5].field99);
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

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lic;II)Lcj;", line = 73)
    public static final class488 method2896(class491 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2945(arg1, arg2, true);
        return var3 == null ? null : new class488(new class209(var3));
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()I", line = 82)
    public final int method2897() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7209[var2] != null && this.field7209[var2].field102 / 20 < var1) {
                var1 = this.field7209[var2].field102 / 20;
            }
        }
        if (this.field7211 < this.field7210 && this.field7211 / 20 < var1) {
            var1 = this.field7211 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field7209[var3] != null) {
                this.field7209[var3].field102 -= var1 * 20;
            }
        }
        if (this.field7211 < this.field7210) {
            this.field7211 -= var1 * 20;
            this.field7210 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()Lnq;", line = 125)
    public final class319 method2898() {
        byte[] var1 = this.method2895();
        return new class319(22050, var1, this.field7211 * 22050 / 1000, this.field7210 * 22050 / 1000);
    }
}
