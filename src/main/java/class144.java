import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class144 {

    @OriginalMember(owner = "client!um", name = "a", descriptor = "[Lsl;")
    private class99[] field2220 = new class99[10];

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    private int field2222;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private int field2221;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lah;II)Lum;", line = 5)
    public static final class144 method905(class205 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1381(arg1, arg2, 0);
        return var3 == null ? null : new class144(new class291(var3));
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()Lgm;", line = 16)
    public final class292 method906() {
        byte[] var1 = this.method908();
        return new class292(22050, var1, this.field2222 * 22050 / 1000, this.field2221 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lhi;)V", line = 70)
    private class144(class291 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2011(-34);
            if (var3 != 0) {
                arg0.field4946--;
                this.field2220[var2] = new class99();
                this.field2220[var2].method670(arg0);
            }
        }
        this.field2222 = arg0.method2021((byte) 74);
        this.field2221 = arg0.method2021((byte) 74);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 90)
    private class144() {
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()I", line = 29)
    public final int method907() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2220[var2] != null && this.field2220[var2].field1431 / 20 < var1) {
                var1 = this.field2220[var2].field1431 / 20;
            }
        }
        if (this.field2222 < this.field2221 && this.field2222 / 20 < var1) {
            var1 = this.field2222 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2220[var3] != null) {
                this.field2220[var3].field1431 -= var1 * 20;
            }
        }
        if (this.field2222 < this.field2221) {
            this.field2222 -= var1 * 20;
            this.field2221 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method908() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2220[var2] != null && this.field2220[var2].field1435 + this.field2220[var2].field1431 > var1) {
                var1 = this.field2220[var2].field1435 + this.field2220[var2].field1431;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2220[var5] != null) {
                int var6 = this.field2220[var5].field1435 * 22050 / 1000;
                int var7 = this.field2220[var5].field1431 * 22050 / 1000;
                int[] var8 = this.field2220[var5].method668(var6, this.field2220[var5].field1435);
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
