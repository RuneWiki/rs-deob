import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lpb;")
    private class106[] field545 = new class106[10];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lpa;", line = 4)
    public final class105 method224() {
        byte[] var1 = this.method226();
        return new class105(22050, var1, this.field544 * 22050 / 1000, this.field546 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()I", line = 12)
    public final int method225() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field545[var2] != null && this.field545[var2].field2655 / 20 < var1) {
                var1 = this.field545[var2].field2655 / 20;
            }
        }
        if (this.field544 < this.field546 && this.field544 / 20 < var1) {
            var1 = this.field544 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field545[var3] != null) {
                this.field545[var3].field2655 -= var1 * 20;
            }
        }
        if (this.field544 < this.field546) {
            this.field544 -= var1 * 20;
            this.field546 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()[B", line = 58)
    private final byte[] method226() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field545[var2] != null && this.field545[var2].field2655 + this.field545[var2].field2652 > var1) {
                var1 = this.field545[var2].field2655 + this.field545[var2].field2652;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field545[var5] != null) {
                int var6 = this.field545[var5].field2652 * 22050 / 1000;
                int var7 = this.field545[var5].field2655 * 22050 / 1000;
                int[] var8 = this.field545[var5].method939(var6, this.field545[var5].field2652);
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

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Loc;II)Lcf;", line = 119)
    public static final class21 method227(class100 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method839(5, arg1, arg2);
        return var3 == null ? null : new class21(new class25(var3));
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ldc;)V", line = 129)
    private class21(class25 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method322((byte) -50);
            if (var3 != 0) {
                arg0.field710--;
                this.field545[var2] = new class106();
                this.field545[var2].method942(arg0);
            }
        }
        this.field544 = arg0.method301(-4853);
        this.field546 = arg0.method301(-4853);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 149)
    private class21() {
    }
}
