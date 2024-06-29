import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class97 {

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "[Laea;")
    private class56[] field1248 = new class56[10];

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "()I", line = 4)
    public final int method682() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1248[var2] != null && this.field1248[var2].field789 / 20 < var1) {
                var1 = this.field1248[var2].field789 / 20;
            }
        }
        if (this.field1250 < this.field1249 && this.field1250 / 20 < var1) {
            var1 = this.field1250 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1248[var3] != null) {
                this.field1248[var3].field789 -= var1 * 20;
            }
        }
        if (this.field1250 < this.field1249) {
            this.field1250 -= var1 * 20;
            this.field1249 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lcb;II)Loia;", line = 49)
    public static final class97 method683(class544 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3150(arg2, -127, arg1);
        return var3 == null ? null : new class97(new class120(var3));
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(Lrv;)V", line = 127)
    private class97(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method842(2384);
            if (var3 != 0) {
                arg0.field1521--;
                this.field1248[var2] = new class56();
                this.field1248[var2].method359(arg0);
            }
        }
        this.field1250 = arg0.method898((byte) -94);
        this.field1249 = arg0.method898((byte) -88);
    }

    @OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V", line = 149)
    private class97() {
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "()[B", line = 63)
    private final byte[] method684() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1248[var2] != null && this.field1248[var2].field794 + this.field1248[var2].field789 > var1) {
                var1 = this.field1248[var2].field794 + this.field1248[var2].field789;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1248[var5] != null) {
                int var6 = this.field1248[var5].field794 * 22050 / 1000;
                int var7 = this.field1248[var5].field789 * 22050 / 1000;
                int[] var8 = this.field1248[var5].method360(var6, this.field1248[var5].field794);
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

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "()Lbc;", line = 122)
    public final class383 method685() {
        byte[] var1 = this.method684();
        return new class383(22050, var1, this.field1250 * 22050 / 1000, this.field1249 * 22050 / 1000);
    }
}
