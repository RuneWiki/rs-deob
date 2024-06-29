import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Laq;")
    private class645[] field560 = new class645[10];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()I")
    public final int method245() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field560[var2] != null && this.field560[var2].field9359 / 20 < var1) {
                var1 = this.field560[var2].field9359 / 20;
            }
        }
        if (this.field559 < this.field561 && this.field559 / 20 < var1) {
            var1 = this.field559 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field560[var3] != null) {
                this.field560[var3].field9359 -= var1 * 20;
            }
        }
        if (this.field559 < this.field561) {
            this.field559 -= var1 * 20;
            this.field561 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()Lmca;")
    public final class5 method246() {
        byte[] var1 = this.method247();
        return new class5(22050, var1, this.field559 * 22050 / 1000, this.field561 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()[B")
    private final byte[] method247() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field560[var2] != null && this.field560[var2].field9359 + this.field560[var2].field9354 > var1) {
                var1 = this.field560[var2].field9359 + this.field560[var2].field9354;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field560[var5] != null) {
                int var6 = this.field560[var5].field9354 * 22050 / 1000;
                int var7 = this.field560[var5].field9359 * 22050 / 1000;
                int[] var8 = this.field560[var5].method3728(var6, this.field560[var5].field9354);
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

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ldda;II)Leg;")
    public static final class48 method248(class597 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3486((byte) -89, arg2, arg1);
        return var3 == null ? null : new class48(new class428(var3));
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lps;)V")
    private class48(class428 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2561((byte) 107);
            if (var3 != 0) {
                arg0.field6221--;
                this.field560[var2] = new class645();
                this.field560[var2].method3729(arg0);
            }
        }
        this.field559 = arg0.method2620(100);
        this.field561 = arg0.method2620(75);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    private class48() {
    }
}
