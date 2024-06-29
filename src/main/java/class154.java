import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class154 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[Lnda;")
    private class478[] field2310 = new class478[10];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()Lqk;", line = 11)
    public final class16 method1119() {
        byte[] var1 = this.method1122();
        return new class16(22050, var1, this.field2311 * 22050 / 1000, this.field2312 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lkda;II)Lei;", line = 17)
    public static final class154 method1120(class328 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1966(arg2, arg1, true);
        return var3 == null ? null : new class154(new class148(var3));
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lgw;)V", line = 70)
    private class154(class148 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 != 0) {
                arg0.field2177--;
                this.field2310[var2] = new class478();
                this.field2310[var2].method2879(arg0);
            }
        }
        this.field2311 = arg0.method1045(true);
        this.field2312 = arg0.method1045(true);
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 90)
    private class154() {
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()I", line = 29)
    public final int method1121() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2310[var2] != null && this.field2310[var2].field6782 / 20 < var1) {
                var1 = this.field2310[var2].field6782 / 20;
            }
        }
        if (this.field2311 < this.field2312 && this.field2311 / 20 < var1) {
            var1 = this.field2311 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2310[var3] != null) {
                this.field2310[var3].field6782 -= var1 * 20;
            }
        }
        if (this.field2311 < this.field2312) {
            this.field2311 -= var1 * 20;
            this.field2312 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method1122() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2310[var2] != null && this.field2310[var2].field6783 + this.field2310[var2].field6782 > var1) {
                var1 = this.field2310[var2].field6783 + this.field2310[var2].field6782;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2310[var5] != null) {
                int var6 = this.field2310[var5].field6783 * 22050 / 1000;
                int var7 = this.field2310[var5].field6782 * 22050 / 1000;
                int[] var8 = this.field2310[var5].method2881(var6, this.field2310[var5].field6783);
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
