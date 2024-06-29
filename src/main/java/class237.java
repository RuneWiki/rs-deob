import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class237 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[Lpc;")
    private class72[] field4231 = new class72[10];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    private int field4230;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    private int field4229;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()[B")
    private final byte[] method1685() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4231[var2] != null && this.field4231[var2].field1631 + this.field4231[var2].field1616 > var1) {
                var1 = this.field4231[var2].field1631 + this.field4231[var2].field1616;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4231[var5] != null) {
                int var6 = this.field4231[var5].field1631 * 22050 / 1000;
                int var7 = this.field4231[var5].field1616 * 22050 / 1000;
                int[] var8 = this.field4231[var5].method665(var6, this.field4231[var5].field1631);
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

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Lbd;")
    public final class258 method1686() {
        byte[] var1 = this.method1685();
        return new class258(22050, var1, this.field4230 * 22050 / 1000, this.field4229 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lmc;II)Ln;")
    public static final class237 method1687(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1115(arg2, (byte) -68, arg1);
        return var3 == null ? null : new class237(new class8(var3));
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()I")
    public final int method1688() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4231[var2] != null && this.field4231[var2].field1616 / 20 < var1) {
                var1 = this.field4231[var2].field1616 / 20;
            }
        }
        if (this.field4230 < this.field4229 && this.field4230 / 20 < var1) {
            var1 = this.field4230 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4231[var3] != null) {
                this.field4231[var3].field1616 -= var1 * 20;
            }
        }
        if (this.field4230 < this.field4229) {
            this.field4230 -= var1 * 20;
            this.field4229 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Laa;)V")
    private class237(class8 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method63((byte) 111);
            if (var3 != 0) {
                arg0.field146--;
                this.field4231[var2] = new class72();
                this.field4231[var2].method667(arg0);
            }
        }
        this.field4230 = arg0.method65((byte) 120);
        this.field4229 = arg0.method65((byte) 108);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    private class237() {
    }
}
