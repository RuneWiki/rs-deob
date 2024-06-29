import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class102 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[Lro;")
    private class126[] field1585 = new class126[10];

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    private int field1584;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()Lrm;")
    public final class79 method825() {
        byte[] var1 = this.method826();
        return new class79(22050, var1, this.field1584 * 22050 / 1000, this.field1586 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()[B")
    private final byte[] method826() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1585[var2] != null && this.field1585[var2].field1892 + this.field1585[var2].field1891 > var1) {
                var1 = this.field1585[var2].field1892 + this.field1585[var2].field1891;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1585[var5] != null) {
                int var6 = this.field1585[var5].field1891 * 22050 / 1000;
                int var7 = this.field1585[var5].field1892 * 22050 / 1000;
                int[] var8 = this.field1585[var5].method934(var6, this.field1585[var5].field1891);
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

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()I")
    public final int method827() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1585[var2] != null && this.field1585[var2].field1892 / 20 < var1) {
                var1 = this.field1585[var2].field1892 / 20;
            }
        }
        if (this.field1584 < this.field1586 && this.field1584 / 20 < var1) {
            var1 = this.field1584 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1585[var3] != null) {
                this.field1585[var3].field1892 -= var1 * 20;
            }
        }
        if (this.field1584 < this.field1586) {
            this.field1584 -= var1 * 20;
            this.field1586 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lum;II)Lgm;")
    public static final class102 method828(class83 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method731(0, arg2, arg1);
        return var3 == null ? null : new class102(new class194(var3));
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lfh;)V")
    private class102(class194 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1337((byte) -128);
            if (var3 != 0) {
                arg0.field2982--;
                this.field1585[var2] = new class126();
                this.field1585[var2].method932(arg0);
            }
        }
        this.field1584 = arg0.method1396(-116);
        this.field1586 = arg0.method1396(127);
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
    private class102() {
    }
}
