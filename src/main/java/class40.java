import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[Lfaa;")
    private class166[] field659 = new class166[10];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    private int field658;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()I")
    public final int method242() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field659[var2] != null && this.field659[var2].field2663 / 20 < var1) {
                var1 = this.field659[var2].field2663 / 20;
            }
        }
        if (this.field657 < this.field658 && this.field657 / 20 < var1) {
            var1 = this.field657 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field659[var3] != null) {
                this.field659[var3].field2663 -= var1 * 20;
            }
        }
        if (this.field657 < this.field658) {
            this.field657 -= var1 * 20;
            this.field658 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()Lrea;")
    public final class221 method243() {
        byte[] var1 = this.method244();
        return new class221(22050, var1, this.field657 * 22050 / 1000, this.field658 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()[B")
    private final byte[] method244() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field659[var2] != null && this.field659[var2].field2669 + this.field659[var2].field2663 > var1) {
                var1 = this.field659[var2].field2669 + this.field659[var2].field2663;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field659[var5] != null) {
                int var6 = this.field659[var5].field2669 * 22050 / 1000;
                int var7 = this.field659[var5].field2663 * 22050 / 1000;
                int[] var8 = this.field659[var5].method1296(var6, this.field659[var5].field2669);
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

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgj;II)Lbh;")
    public static final class40 method245(class662 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3732(arg2, 8906, arg1);
        return var3 == null ? null : new class40(new class93(var3));
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lfca;)V")
    private class40(class93 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method793((byte) 97);
            if (var3 != 0) {
                arg0.field1442--;
                this.field659[var2] = new class166();
                this.field659[var2].method1295(arg0);
            }
        }
        this.field657 = arg0.method763(96);
        this.field658 = arg0.method763(115);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    private class40() {
    }
}
