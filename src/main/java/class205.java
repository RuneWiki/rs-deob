import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class205 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[Ltn;")
    private class76[] field2759 = new class76[10];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    private int field2758;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method1314() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2759[var2] != null && this.field2759[var2].field828 + this.field2759[var2].field818 > var1) {
                var1 = this.field2759[var2].field828 + this.field2759[var2].field818;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2759[var5] != null) {
                int var6 = this.field2759[var5].field818 * 22050 / 1000;
                int var7 = this.field2759[var5].field828 * 22050 / 1000;
                int[] var8 = this.field2759[var5].method498(var6, this.field2759[var5].field818);
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

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "()I", line = 66)
    public final int method1315() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2759[var2] != null && this.field2759[var2].field828 / 20 < var1) {
                var1 = this.field2759[var2].field828 / 20;
            }
        }
        if (this.field2758 < this.field2757 && this.field2758 / 20 < var1) {
            var1 = this.field2758 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2759[var3] != null) {
                this.field2759[var3].field828 -= var1 * 20;
            }
        }
        if (this.field2758 < this.field2757) {
            this.field2758 -= var1 * 20;
            this.field2757 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "()Lte;", line = 109)
    public final class534 method1316() {
        byte[] var1 = this.method1314();
        return new class534(22050, var1, this.field2758 * 22050 / 1000, this.field2757 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lkea;II)Lbj;", line = 115)
    public static final class205 method1317(class203 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1286(arg2, arg1, (byte) -49);
        return var3 == null ? null : new class205(new class194(var3));
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lrt;)V", line = 128)
    private class205(class194 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1177(255);
            if (var3 != 0) {
                arg0.field2610--;
                this.field2759[var2] = new class76();
                this.field2759[var2].method496(arg0);
            }
        }
        this.field2758 = arg0.method1220(122);
        this.field2757 = arg0.method1220(-113);
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V", line = 148)
    private class205() {
    }
}
