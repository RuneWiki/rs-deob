import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class211 {

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "[Lwn;")
    private class234[] field2644 = new class234[10];

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    private int field2645;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    private int field2643;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "()[B", line = 7)
    private final byte[] method1257() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2644[var2] != null && this.field2644[var2].field2929 + this.field2644[var2].field2917 > var1) {
                var1 = this.field2644[var2].field2929 + this.field2644[var2].field2917;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2644[var5] != null) {
                int var6 = this.field2644[var5].field2929 * 22050 / 1000;
                int var7 = this.field2644[var5].field2917 * 22050 / 1000;
                int[] var8 = this.field2644[var5].method1411(var6, this.field2644[var5].field2929);
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

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lpl;II)Luea;", line = 69)
    public static final class211 method1258(class612 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3365(arg2, 100, arg1);
        return var3 == null ? null : new class211(new class630(var3));
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Les;)V", line = 123)
    private class211(class630 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3501(-9268);
            if (var3 != 0) {
                arg0.field8812--;
                this.field2644[var2] = new class234();
                this.field2644[var2].method1408(arg0);
            }
        }
        this.field2645 = arg0.method3470(13111);
        this.field2643 = arg0.method3470(13111);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V", line = 149)
    private class211() {
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "()I", line = 81)
    public final int method1259() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2644[var2] != null && this.field2644[var2].field2917 / 20 < var1) {
                var1 = this.field2644[var2].field2917 / 20;
            }
        }
        if (this.field2645 < this.field2643 && this.field2645 / 20 < var1) {
            var1 = this.field2645 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2644[var3] != null) {
                this.field2644[var3].field2917 -= var1 * 20;
            }
        }
        if (this.field2645 < this.field2643) {
            this.field2645 -= var1 * 20;
            this.field2643 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "()Loaa;", line = 145)
    public final class555 method1260() {
        byte[] var1 = this.method1257();
        return new class555(22050, var1, this.field2645 * 22050 / 1000, this.field2643 * 22050 / 1000);
    }
}
