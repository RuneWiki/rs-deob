import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class664 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[Llq;")
    private class293[] field9220 = new class293[10];

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    private int field9219;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    private int field9218;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lpe;II)Lqr;", line = 6)
    public static final class664 method3633(class615 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3346(-1, arg1, arg2);
        return var3 == null ? null : new class664(new class418(var3));
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "()I", line = 15)
    public final int method3634() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field9220[var2] != null && this.field9220[var2].field3802 / 20 < var1) {
                var1 = this.field9220[var2].field3802 / 20;
            }
        }
        if (this.field9219 < this.field9218 && this.field9219 / 20 < var1) {
            var1 = this.field9219 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field9220[var3] != null) {
                this.field9220[var3].field3802 -= var1 * 20;
            }
        }
        if (this.field9219 < this.field9218) {
            this.field9219 -= var1 * 20;
            this.field9218 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "()Lbp;", line = 58)
    public final class430 method3635() {
        byte[] var1 = this.method3636();
        return new class430(22050, var1, this.field9219 * 22050 / 1000, this.field9218 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "()[B", line = 66)
    private final byte[] method3636() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field9220[var2] != null && this.field9220[var2].field3802 + this.field9220[var2].field3784 > var1) {
                var1 = this.field9220[var2].field3802 + this.field9220[var2].field3784;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field9220[var5] != null) {
                int var6 = this.field9220[var5].field3784 * 22050 / 1000;
                int var7 = this.field9220[var5].field3802 * 22050 / 1000;
                int[] var8 = this.field9220[var5].method1736(var6, this.field9220[var5].field3784);
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

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lfd;)V", line = 129)
    private class664(class418 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2396(-12);
            if (var3 != 0) {
                arg0.field5367--;
                this.field9220[var2] = new class293();
                this.field9220[var2].method1733(arg0);
            }
        }
        this.field9219 = arg0.method2393(-30727);
        this.field9218 = arg0.method2393(-30727);
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V", line = 149)
    private class664() {
    }
}
