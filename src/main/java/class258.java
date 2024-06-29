import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class258 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[Lms;")
    private class402[] field3521 = new class402[10];

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    private int field3522;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lwu;II)Leh;")
    public static final class258 method1605(class557 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3322(arg1, arg2, (byte) 97);
        return var3 == null ? null : new class258(new class26(var3));
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()[B")
    private final byte[] method1606() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3521[var2] != null && this.field3521[var2].field5577 + this.field3521[var2].field5572 > var1) {
                var1 = this.field3521[var2].field5577 + this.field3521[var2].field5572;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3521[var5] != null) {
                int var6 = this.field3521[var5].field5572 * 22050 / 1000;
                int var7 = this.field3521[var5].field5577 * 22050 / 1000;
                int[] var8 = this.field3521[var5].method2444(var6, this.field3521[var5].field5572);
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

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()I")
    public final int method1607() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3521[var2] != null && this.field3521[var2].field5577 / 20 < var1) {
                var1 = this.field3521[var2].field5577 / 20;
            }
        }
        if (this.field3523 < this.field3522 && this.field3523 / 20 < var1) {
            var1 = this.field3523 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3521[var3] != null) {
                this.field3521[var3].field5577 -= var1 * 20;
            }
        }
        if (this.field3523 < this.field3522) {
            this.field3523 -= var1 * 20;
            this.field3522 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "()Laaa;")
    public final class25 method1608() {
        byte[] var1 = this.method1606();
        return new class25(22050, var1, this.field3523 * 22050 / 1000, this.field3522 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lvj;)V")
    private class258(class26 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method194((byte) 119);
            if (var3 != 0) {
                arg0.field330--;
                this.field3521[var2] = new class402();
                this.field3521[var2].method2442(arg0);
            }
        }
        this.field3523 = arg0.method193(2);
        this.field3522 = arg0.method193(2);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    private class258() {
    }
}
