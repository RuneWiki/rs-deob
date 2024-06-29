import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[Lfb;")
    private class33[] field61 = new class33[10];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lme;", line = 4)
    public final class77 method20() {
        byte[] var1 = this.method22();
        return new class77(22050, var1, this.field62 * 22050 / 1000, this.field63 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lja;II)Lac;", line = 11)
    public static final class4 method21(class55 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method436(arg2, 5, arg1);
        return var3 == null ? null : new class4(new class61(var3));
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()[B", line = 21)
    private final byte[] method22() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field61[var2] != null && this.field61[var2].field744 + this.field61[var2].field742 > var1) {
                var1 = this.field61[var2].field744 + this.field61[var2].field742;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field61[var5] != null) {
                int var6 = this.field61[var5].field744 * 22050 / 1000;
                int var7 = this.field61[var5].field742 * 22050 / 1000;
                int[] var8 = this.field61[var5].method258(var6, this.field61[var5].field744);
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

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lka;)V", line = 127)
    private class4(class61 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method494(20471);
            if (var3 != 0) {
                arg0.field1556--;
                this.field61[var2] = new class33();
                this.field61[var2].method259(arg0);
            }
        }
        this.field62 = arg0.method507((byte) -19);
        this.field63 = arg0.method507((byte) -51);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 147)
    private class4() {
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I", line = 84)
    public final int method23() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field61[var2] != null && this.field61[var2].field742 / 20 < var1) {
                var1 = this.field61[var2].field742 / 20;
            }
        }
        if (this.field62 < this.field63 && this.field62 / 20 < var1) {
            var1 = this.field62 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field61[var3] != null) {
                this.field61[var3].field742 -= var1 * 20;
            }
        }
        if (this.field62 < this.field63) {
            this.field62 -= var1 * 20;
            this.field63 -= var1 * 20;
        }
        return var1;
    }
}
