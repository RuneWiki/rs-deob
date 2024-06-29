import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class49 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[Lah;")
    private class388[] field689 = new class388[10];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    private int field690;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lnd;II)Lgp;", line = 6)
    public static final class49 method371(class547 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3153(arg2, 0, arg1);
        return var3 == null ? null : new class49(new class461(var3));
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()Lct;", line = 14)
    public final class148 method372() {
        byte[] var1 = this.method374();
        return new class148(22050, var1, this.field688 * 22050 / 1000, this.field690 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lsl;)V", line = 70)
    private class49(class461 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2600((byte) -125);
            if (var3 != 0) {
                arg0.field6193--;
                this.field689[var2] = new class388();
                this.field689[var2].method2210(arg0);
            }
        }
        this.field688 = arg0.method2566(-2);
        this.field690 = arg0.method2566(-2);
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V", line = 90)
    private class49() {
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()I", line = 26)
    public final int method373() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field689[var2] != null && this.field689[var2].field4958 / 20 < var1) {
                var1 = this.field689[var2].field4958 / 20;
            }
        }
        if (this.field688 < this.field690 && this.field688 / 20 < var1) {
            var1 = this.field688 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field689[var3] != null) {
                this.field689[var3].field4958 -= var1 * 20;
            }
        }
        if (this.field688 < this.field690) {
            this.field688 -= var1 * 20;
            this.field690 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method374() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field689[var2] != null && this.field689[var2].field4971 + this.field689[var2].field4958 > var1) {
                var1 = this.field689[var2].field4971 + this.field689[var2].field4958;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field689[var5] != null) {
                int var6 = this.field689[var5].field4971 * 22050 / 1000;
                int var7 = this.field689[var5].field4958 * 22050 / 1000;
                int[] var8 = this.field689[var5].method2207(var6, this.field689[var5].field4971);
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
}
