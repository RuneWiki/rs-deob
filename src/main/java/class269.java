import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class269 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "[Lut;")
    private class126[] field3560 = new class126[10];

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    private int field3562;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lni;II)Lcl;")
    public static final class269 method1609(class522 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2885(arg2, arg1, false);
        return var3 == null ? null : new class269(new class611(var3));
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lji;)V")
    private class269(class611 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3428((byte) 104);
            if (var3 != 0) {
                arg0.field8520--;
                this.field3560[var2] = new class126();
                this.field3560[var2].method807(arg0);
            }
        }
        this.field3561 = arg0.method3402((byte) 127);
        this.field3562 = arg0.method3402((byte) 127);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
    public final int method1610() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3560[var2] != null && this.field3560[var2].field1640 / 20 < var1) {
                var1 = this.field3560[var2].field1640 / 20;
            }
        }
        if (this.field3561 < this.field3562 && this.field3561 / 20 < var1) {
            var1 = this.field3561 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3560[var3] != null) {
                this.field3560[var3].field1640 -= var1 * 20;
            }
        }
        if (this.field3561 < this.field3562) {
            this.field3561 -= var1 * 20;
            this.field3562 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()Lib;")
    public final class155 method1611() {
        byte[] var1 = this.method1612();
        return new class155(22050, var1, this.field3561 * 22050 / 1000, this.field3562 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    private class269() {
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()[B")
    private final byte[] method1612() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3560[var2] != null && this.field3560[var2].field1643 + this.field3560[var2].field1640 > var1) {
                var1 = this.field3560[var2].field1643 + this.field3560[var2].field1640;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3560[var5] != null) {
                int var6 = this.field3560[var5].field1643 * 22050 / 1000;
                int var7 = this.field3560[var5].field1640 * 22050 / 1000;
                int[] var8 = this.field3560[var5].method809(var6, this.field3560[var5].field1643);
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
