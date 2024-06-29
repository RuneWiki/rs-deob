import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class26 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[Lbe;")
    private class15[] field519 = new class15[10];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "()Lih;")
    public final class79 method148() {
        byte[] var1 = this.method149();
        return new class79(22050, var1, this.field517 * 22050 / 1000, this.field518 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "()[B")
    private final byte[] method149() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field519[var2] != null && this.field519[var2].field307 + this.field519[var2].field306 > var1) {
                var1 = this.field519[var2].field307 + this.field519[var2].field306;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field519[var5] != null) {
                int var6 = this.field519[var5].field306 * 22050 / 1000;
                int var7 = this.field519[var5].field307 * 22050 / 1000;
                int[] var8 = this.field519[var5].method90(var6, this.field519[var5].field306);
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

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lhc;)V")
    private class26(class66 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method509(120);
            if (var3 != 0) {
                arg0.field1620--;
                this.field519[var2] = new class15();
                this.field519[var2].method91(arg0);
            }
        }
        this.field517 = arg0.method511(-19);
        this.field518 = arg0.method511(105);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ldd;II)Lcg;")
    public static final class26 method150(class32 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method215(arg2, arg1, 1);
        return var3 == null ? null : new class26(new class66(var3));
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "()I")
    public final int method151() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field519[var2] != null && this.field519[var2].field307 / 20 < var1) {
                var1 = this.field519[var2].field307 / 20;
            }
        }
        if (this.field517 < this.field518 && this.field517 / 20 < var1) {
            var1 = this.field517 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field519[var3] != null) {
                this.field519[var3].field307 -= var1 * 20;
            }
        }
        if (this.field517 < this.field518) {
            this.field517 -= var1 * 20;
            this.field518 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    private class26() {
    }
}
