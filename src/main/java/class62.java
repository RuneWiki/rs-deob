import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class62 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[Lc;")
    private class13[] field1592 = new class13[10];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method518() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1592[var2] != null && this.field1592[var2].field374 + this.field1592[var2].field373 > var1) {
                var1 = this.field1592[var2].field374 + this.field1592[var2].field373;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1592[var5] != null) {
                int var6 = this.field1592[var5].field374 * 22050 / 1000;
                int var7 = this.field1592[var5].field373 * 22050 / 1000;
                int[] var8 = this.field1592[var5].method104(var6, this.field1592[var5].field374);
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

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lk;II)Lkb;", line = 64)
    public static final class62 method519(class60 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method508(arg2, 0, arg1);
        return var3 == null ? null : new class62(new class36(var3));
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lfe;)V", line = 84)
    private class62(class36 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method365((byte) -123);
            if (var3 != 0) {
                arg0.field1057--;
                this.field1592[var2] = new class13();
                this.field1592[var2].method103(arg0);
            }
        }
        this.field1591 = arg0.method351((byte) -106);
        this.field1593 = arg0.method351((byte) -100);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 147)
    private class62() {
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lnd;", line = 78)
    public final class82 method520() {
        byte[] var1 = this.method518();
        return new class82(22050, var1, this.field1591 * 22050 / 1000, this.field1593 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "()I", line = 106)
    public final int method521() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1592[var2] != null && this.field1592[var2].field373 / 20 < var1) {
                var1 = this.field1592[var2].field373 / 20;
            }
        }
        if (this.field1591 < this.field1593 && this.field1591 / 20 < var1) {
            var1 = this.field1591 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1592[var3] != null) {
                this.field1592[var3].field373 -= var1 * 20;
            }
        }
        if (this.field1591 < this.field1593) {
            this.field1591 -= var1 * 20;
            this.field1593 -= var1 * 20;
        }
        return var1;
    }
}
