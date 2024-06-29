import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class602 {

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "[Laj;")
    private class331[] field8705 = new class331[10];

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    private int field8707;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    private int field8706;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "()[B", line = 4)
    private final byte[] method4409() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8705[var2] != null && this.field8705[var2].field5413 + this.field8705[var2].field5410 > var1) {
                var1 = this.field8705[var2].field5413 + this.field8705[var2].field5410;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field8705[var5] != null) {
                int var6 = this.field8705[var5].field5413 * 22050 / 1000;
                int var7 = this.field8705[var5].field5410 * 22050 / 1000;
                int[] var8 = this.field8705[var5].method2801(var6, this.field8705[var5].field5413);
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

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "()Ljg;", line = 71)
    public final class357 method4410() {
        byte[] var1 = this.method4409();
        return new class357(22050, var1, this.field8707 * 22050 / 1000, this.field8706 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lgda;II)Lfia;", line = 76)
    public static final class602 method4411(class58 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method604((byte) 84, arg2, arg1);
        return var3 == null ? null : new class602(new class176(var3));
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "()I", line = 84)
    public final int method4412() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8705[var2] != null && this.field8705[var2].field5410 / 20 < var1) {
                var1 = this.field8705[var2].field5410 / 20;
            }
        }
        if (this.field8707 < this.field8706 && this.field8707 / 20 < var1) {
            var1 = this.field8707 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field8705[var3] != null) {
                this.field8705[var3].field5410 -= var1 * 20;
            }
        }
        if (this.field8707 < this.field8706) {
            this.field8707 -= var1 * 20;
            this.field8706 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lwq;)V", line = 129)
    private class602(class176 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1645((byte) -86);
            if (var3 != 0) {
                arg0.field2799--;
                this.field8705[var2] = new class331();
                this.field8705[var2].method2802(arg0);
            }
        }
        this.field8707 = arg0.method1687((byte) -121);
        this.field8706 = arg0.method1687((byte) -122);
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "()V", line = 149)
    private class602() {
    }
}
