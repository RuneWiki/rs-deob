import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class199 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[Lkk;")
    private class223[] field3532 = new class223[10];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()[B")
    private final byte[] method1370() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3532[var2] != null && this.field3532[var2].field4006 + this.field3532[var2].field3996 > var1) {
                var1 = this.field3532[var2].field4006 + this.field3532[var2].field3996;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3532[var5] != null) {
                int var6 = this.field3532[var5].field4006 * 22050 / 1000;
                int var7 = this.field3532[var5].field3996 * 22050 / 1000;
                int[] var8 = this.field3532[var5].method1567(var6, this.field3532[var5].field4006);
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

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()I")
    public final int method1371() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3532[var2] != null && this.field3532[var2].field3996 / 20 < var1) {
                var1 = this.field3532[var2].field3996 / 20;
            }
        }
        if (this.field3533 < this.field3534 && this.field3533 / 20 < var1) {
            var1 = this.field3533 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3532[var3] != null) {
                this.field3532[var3].field3996 -= var1 * 20;
            }
        }
        if (this.field3533 < this.field3534) {
            this.field3533 -= var1 * 20;
            this.field3534 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()Lhe;")
    public final class19 method1372() {
        byte[] var1 = this.method1370();
        return new class19(22050, var1, this.field3533 * 22050 / 1000, this.field3534 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lqk;)V")
    private class199(class200 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1408((byte) -80);
            if (var3 != 0) {
                arg0.field3565--;
                this.field3532[var2] = new class223();
                this.field3532[var2].method1564(arg0);
            }
        }
        this.field3533 = arg0.method1410(-113);
        this.field3534 = arg0.method1410(-80);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    private class199() {
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lbj;II)Lnb;")
    public static final class199 method1373(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1084((byte) -126, arg1, arg2);
        return var3 == null ? null : new class199(new class200(var3));
    }
}
