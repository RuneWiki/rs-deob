import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class115 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[Lla;")
    private class128[] field1668 = new class128[10];

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    private int field1670;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    private int field1669;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()[B")
    private final byte[] method700() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1668[var2] != null && this.field1668[var2].field1828 + this.field1668[var2].field1825 > var1) {
                var1 = this.field1668[var2].field1828 + this.field1668[var2].field1825;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1668[var5] != null) {
                int var6 = this.field1668[var5].field1828 * 22050 / 1000;
                int var7 = this.field1668[var5].field1825 * 22050 / 1000;
                int[] var8 = this.field1668[var5].method784(var6, this.field1668[var5].field1828);
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

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lbk;II)Lrf;")
    public static final class115 method701(class136 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method842(arg1, (byte) 44, arg2);
        return var3 == null ? null : new class115(new class56(var3));
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()Lfj;")
    public final class89 method702() {
        byte[] var1 = this.method700();
        return new class89(22050, var1, this.field1670 * 22050 / 1000, this.field1669 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()I")
    public final int method703() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1668[var2] != null && this.field1668[var2].field1825 / 20 < var1) {
                var1 = this.field1668[var2].field1825 / 20;
            }
        }
        if (this.field1670 < this.field1669 && this.field1670 / 20 < var1) {
            var1 = this.field1670 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1668[var3] != null) {
                this.field1668[var3].field1825 -= var1 * 20;
            }
        }
        if (this.field1670 < this.field1669) {
            this.field1670 -= var1 * 20;
            this.field1669 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lp;)V")
    private class115(class56 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method367(1);
            if (var3 != 0) {
                arg0.field699--;
                this.field1668[var2] = new class128();
                this.field1668[var2].method786(arg0);
            }
        }
        this.field1670 = arg0.method318(true);
        this.field1669 = arg0.method318(true);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    private class115() {
    }
}
