import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class633 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[Lrw;")
    private class788[] field8555 = new class788[10];

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    private int field8554;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    private int field8553;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Luq;II)Llj;")
    public static final class633 method3490(class172 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1188(arg1, -18047, arg2);
        return var3 == null ? null : new class633(new class254(var3));
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()[B")
    private final byte[] method3491() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8555[var2] != null && this.field8555[var2].field10829 + this.field8555[var2].field10816 > var1) {
                var1 = this.field8555[var2].field10829 + this.field8555[var2].field10816;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field8555[var5] != null) {
                int var6 = this.field8555[var5].field10829 * 22050 / 1000;
                int var7 = this.field8555[var5].field10816 * 22050 / 1000;
                int[] var8 = this.field8555[var5].method4314(var6, this.field8555[var5].field10829);
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

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()Lpv;")
    public final class78 method3492() {
        byte[] var1 = this.method3491();
        return new class78(22050, var1, this.field8554 * 22050 / 1000, this.field8553 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()I")
    public final int method3493() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8555[var2] != null && this.field8555[var2].field10816 / 20 < var1) {
                var1 = this.field8555[var2].field10816 / 20;
            }
        }
        if (this.field8554 < this.field8553 && this.field8554 / 20 < var1) {
            var1 = this.field8554 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field8555[var3] != null) {
                this.field8555[var3].field10816 -= var1 * 20;
            }
        }
        if (this.field8554 < this.field8553) {
            this.field8554 -= var1 * 20;
            this.field8553 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ldt;)V")
    private class633(class254 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 != 0) {
                arg0.field3725--;
                this.field8555[var2] = new class788();
                this.field8555[var2].method4313(arg0);
            }
        }
        this.field8554 = arg0.method1728((byte) 63);
        this.field8553 = arg0.method1728((byte) 41);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    private class633() {
    }
}
