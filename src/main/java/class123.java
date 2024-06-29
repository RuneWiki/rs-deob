import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[Lsb;")
    private class127[] field2912 = new class127[10];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()[B")
    private final byte[] method978() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2912[var2] != null && this.field2912[var2].field3012 + this.field2912[var2].field3004 > var1) {
                var1 = this.field2912[var2].field3012 + this.field2912[var2].field3004;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2912[var5] != null) {
                int var6 = this.field2912[var5].field3012 * 22050 / 1000;
                int var7 = this.field2912[var5].field3004 * 22050 / 1000;
                int[] var8 = this.field2912[var5].method997(var6, this.field2912[var5].field3012);
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

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()Lfc;")
    public final class39 method979() {
        byte[] var1 = this.method978();
        return new class39(22050, var1, this.field2911 * 22050 / 1000, this.field2913 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
    public final int method980() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2912[var2] != null && this.field2912[var2].field3004 / 20 < var1) {
                var1 = this.field2912[var2].field3004 / 20;
            }
        }
        if (this.field2911 < this.field2913 && this.field2911 / 20 < var1) {
            var1 = this.field2911 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2912[var3] != null) {
                this.field2912[var3].field3004 -= var1 * 20;
            }
        }
        if (this.field2911 < this.field2913) {
            this.field2911 -= var1 * 20;
            this.field2913 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljb;II)Lre;")
    public static final class123 method981(class64 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method458(false, arg2, arg1);
        return var3 == null ? null : new class123(new class77(var3));
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lla;)V")
    private class123(class77 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method570((byte) 123);
            if (var3 != 0) {
                arg0.field1691--;
                this.field2912[var2] = new class127();
                this.field2912[var2].method998(arg0);
            }
        }
        this.field2911 = arg0.method597(31);
        this.field2913 = arg0.method597(109);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    private class123() {
    }
}
