import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class80 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[Lpf;")
    private class277[] field1180 = new class277[10];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()I", line = 6)
    public final int method540() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1180[var2] != null && this.field1180[var2].field4562 / 20 < var1) {
                var1 = this.field1180[var2].field4562 / 20;
            }
        }
        if (this.field1179 < this.field1181 && this.field1179 / 20 < var1) {
            var1 = this.field1179 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1180[var3] != null) {
                this.field1180[var3].field4562 -= var1 * 20;
            }
        }
        if (this.field1179 < this.field1181) {
            this.field1179 -= var1 * 20;
            this.field1181 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()[B", line = 52)
    private final byte[] method541() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1180[var2] != null && this.field1180[var2].field4562 + this.field1180[var2].field4556 > var1) {
                var1 = this.field1180[var2].field4562 + this.field1180[var2].field4556;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1180[var5] != null) {
                int var6 = this.field1180[var5].field4556 * 22050 / 1000;
                int var7 = this.field1180[var5].field4562 * 22050 / 1000;
                int[] var8 = this.field1180[var5].method1974(var6, this.field1180[var5].field4556);
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

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lfh;)V", line = 123)
    private class80(class313 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2224(-121);
            if (var3 != 0) {
                arg0.field5137--;
                this.field1180[var2] = new class277();
                this.field1180[var2].method1972(arg0);
            }
        }
        this.field1179 = arg0.method2250(-1613178296);
        this.field1181 = arg0.method2250(-1613178296);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 143)
    private class80() {
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lnm;II)Lkk;", line = 115)
    public static final class80 method542(class221 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1504(arg2, true, arg1);
        return var3 == null ? null : new class80(new class313(var3));
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()Lpc;", line = 148)
    public final class321 method543() {
        byte[] var1 = this.method541();
        return new class321(22050, var1, this.field1179 * 22050 / 1000, this.field1181 * 22050 / 1000);
    }
}
