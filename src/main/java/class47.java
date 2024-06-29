import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class47 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[Lwc;")
    private class135[] field1042 = new class135[10];

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field1041;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()I", line = 4)
    public final int method388() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1042[var2] != null && this.field1042[var2].field3317 / 20 < var1) {
                var1 = this.field1042[var2].field3317 / 20;
            }
        }
        if (this.field1041 < this.field1040 && this.field1041 / 20 < var1) {
            var1 = this.field1041 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1042[var3] != null) {
                this.field1042[var3].field3317 -= var1 * 20;
            }
        }
        if (this.field1041 < this.field1040) {
            this.field1041 -= var1 * 20;
            this.field1040 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()Lda;", line = 48)
    public final class20 method389() {
        byte[] var1 = this.method391();
        return new class20(22050, var1, this.field1041 * 22050 / 1000, this.field1040 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lpb;II)Lhe;", line = 54)
    public static final class47 method390(class92 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method766(arg2, (byte) -45, arg1);
        return var3 == null ? null : new class47(new class7(var3));
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lb;)V", line = 128)
    private class47(class7 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method96(27023);
            if (var3 != 0) {
                arg0.field143--;
                this.field1042[var2] = new class135();
                this.field1042[var2].method1063(arg0);
            }
        }
        this.field1041 = arg0.method101(2);
        this.field1040 = arg0.method101(2);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 148)
    private class47() {
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()[B", line = 71)
    private final byte[] method391() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1042[var2] != null && this.field1042[var2].field3317 + this.field1042[var2].field3309 > var1) {
                var1 = this.field1042[var2].field3317 + this.field1042[var2].field3309;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1042[var5] != null) {
                int var6 = this.field1042[var5].field3309 * 22050 / 1000;
                int var7 = this.field1042[var5].field3317 * 22050 / 1000;
                int[] var8 = this.field1042[var5].method1066(var6, this.field1042[var5].field3309);
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
