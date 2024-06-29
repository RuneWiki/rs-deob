import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class81 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "[Lac;")
    private class3[] field1842 = new class3[10];

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    private int field1844;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    private int field1843;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()I", line = 5)
    public final int method538() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1842[var2] != null && this.field1842[var2].field53 / 20 < var1) {
                var1 = this.field1842[var2].field53 / 20;
            }
        }
        if (this.field1844 < this.field1843 && this.field1844 / 20 < var1) {
            var1 = this.field1844 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1842[var3] != null) {
                this.field1842[var3].field53 -= var1 * 20;
            }
        }
        if (this.field1844 < this.field1843) {
            this.field1844 -= var1 * 20;
            this.field1843 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()Lte;", line = 48)
    public final class119 method539() {
        byte[] var1 = this.method541();
        return new class119(22050, var1, this.field1844 * 22050 / 1000, this.field1843 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lrb;II)Ln;", line = 54)
    public static final class81 method540(class103 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method731(arg2, arg1, (byte) -127);
        return var3 == null ? null : new class81(new class104(var3));
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lrc;)V", line = 127)
    private class81(class104 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method798((byte) -77);
            if (var3 != 0) {
                arg0.field2563--;
                this.field1842[var2] = new class3();
                this.field1842[var2].method10(arg0);
            }
        }
        this.field1844 = arg0.method797(-7916);
        this.field1843 = arg0.method797(-7916);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 147)
    private class81() {
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()[B", line = 68)
    private final byte[] method541() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1842[var2] != null && this.field1842[var2].field72 + this.field1842[var2].field53 > var1) {
                var1 = this.field1842[var2].field72 + this.field1842[var2].field53;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1842[var5] != null) {
                int var6 = this.field1842[var5].field72 * 22050 / 1000;
                int var7 = this.field1842[var5].field53 * 22050 / 1000;
                int[] var8 = this.field1842[var5].method12(var6, this.field1842[var5].field72);
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
