import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class39 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[Lqi;")
    private class6[] field645 = new class6[10];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()I")
    public final int method205() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field645[var2] != null && this.field645[var2].field130 / 20 < var1) {
                var1 = this.field645[var2].field130 / 20;
            }
        }
        if (this.field646 < this.field647 && this.field646 / 20 < var1) {
            var1 = this.field646 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field645[var3] != null) {
                this.field645[var3].field130 -= var1 * 20;
            }
        }
        if (this.field646 < this.field647) {
            this.field646 -= var1 * 20;
            this.field647 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()[B")
    private final byte[] method206() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field645[var2] != null && this.field645[var2].field130 + this.field645[var2].field126 > var1) {
                var1 = this.field645[var2].field130 + this.field645[var2].field126;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field645[var5] != null) {
                int var6 = this.field645[var5].field126 * 22050 / 1000;
                int var7 = this.field645[var5].field130 * 22050 / 1000;
                int[] var8 = this.field645[var5].method23(var6, this.field645[var5].field126);
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

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()Lw;")
    public final class150 method207() {
        byte[] var1 = this.method206();
        return new class150(22050, var1, this.field646 * 22050 / 1000, this.field647 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ln;II)Laf;")
    public static final class39 method208(class138 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method884(arg2, -43, arg1);
        return var3 == null ? null : new class39(new class226(var3));
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lnj;)V")
    private class39(class226 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1471(255);
            if (var3 != 0) {
                arg0.field3879--;
                this.field645[var2] = new class6();
                this.field645[var2].method24(arg0);
            }
        }
        this.field646 = arg0.method1447(0);
        this.field647 = arg0.method1447(0);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    private class39() {
    }
}
