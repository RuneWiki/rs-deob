import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class199 {

    @OriginalMember(owner = "client!w", name = "b", descriptor = "[Lfc;")
    private class51[] field3759 = new class51[10];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    private int field3760;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()Lqe;")
    public final class150 method1285() {
        byte[] var1 = this.method1287();
        return new class150(22050, var1, this.field3758 * 22050 / 1000, this.field3760 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
    public final int method1286() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3759[var2] != null && this.field3759[var2].field909 / 20 < var1) {
                var1 = this.field3759[var2].field909 / 20;
            }
        }
        if (this.field3758 < this.field3760 && this.field3758 / 20 < var1) {
            var1 = this.field3758 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3759[var3] != null) {
                this.field3759[var3].field909 -= var1 * 20;
            }
        }
        if (this.field3758 < this.field3760) {
            this.field3758 -= var1 * 20;
            this.field3760 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "()[B")
    private final byte[] method1287() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3759[var2] != null && this.field3759[var2].field909 + this.field3759[var2].field903 > var1) {
                var1 = this.field3759[var2].field909 + this.field3759[var2].field903;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3759[var5] != null) {
                int var6 = this.field3759[var5].field903 * 22050 / 1000;
                int var7 = this.field3759[var5].field909 * 22050 / 1000;
                int[] var8 = this.field3759[var5].method360(var6, this.field3759[var5].field903);
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

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lc;II)Lw;")
    public static final class199 method1288(class21 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method159((byte) -89, arg2, arg1);
        return var3 == null ? null : new class199(new class114(var3));
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lme;)V")
    private class199(class114 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method767(true);
            if (var3 != 0) {
                arg0.field2170--;
                this.field3759[var2] = new class51();
                this.field3759[var2].method361(arg0);
            }
        }
        this.field3758 = arg0.method762((byte) 115);
        this.field3760 = arg0.method762((byte) 109);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    private class199() {
    }
}
