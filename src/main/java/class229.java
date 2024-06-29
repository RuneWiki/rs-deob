import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class229 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "[Lqk;")
    private class61[] field3542 = new class61[10];

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    private int field3544;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()Lik;", line = 4)
    public final class259 method1624() {
        byte[] var1 = this.method1626();
        return new class259(22050, var1, this.field3544 * 22050 / 1000, this.field3543 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "()I", line = 10)
    public final int method1625() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3542[var2] != null && this.field3542[var2].field920 / 20 < var1) {
                var1 = this.field3542[var2].field920 / 20;
            }
        }
        if (this.field3544 < this.field3543 && this.field3544 / 20 < var1) {
            var1 = this.field3544 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3542[var3] != null) {
                this.field3542[var3].field920 -= var1 * 20;
            }
        }
        if (this.field3544 < this.field3543) {
            this.field3544 -= var1 * 20;
            this.field3543 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "()[B", line = 54)
    private final byte[] method1626() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3542[var2] != null && this.field3542[var2].field932 + this.field3542[var2].field920 > var1) {
                var1 = this.field3542[var2].field932 + this.field3542[var2].field920;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3542[var5] != null) {
                int var6 = this.field3542[var5].field932 * 22050 / 1000;
                int var7 = this.field3542[var5].field920 * 22050 / 1000;
                int[] var8 = this.field3542[var5].method544(var6, this.field3542[var5].field932);
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

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Llb;II)Ldn;", line = 115)
    public static final class229 method1627(class211 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1507(arg2, (byte) -128, arg1);
        return var3 == null ? null : new class229(new class35(var3));
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lhb;)V", line = 127)
    private class229(class35 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method273(65280);
            if (var3 != 0) {
                arg0.field455--;
                this.field3542[var2] = new class61();
                this.field3542[var2].method542(arg0);
            }
        }
        this.field3544 = arg0.method300(-1394191632);
        this.field3543 = arg0.method300(-1394191632);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 147)
    private class229() {
    }
}
