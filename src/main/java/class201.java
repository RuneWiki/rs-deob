import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class201 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[Lgj;")
    private class374[] field2884 = new class374[10];

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field2883;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()I", line = 4)
    public final int method1382() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2884[var2] != null && this.field2884[var2].field5182 / 20 < var1) {
                var1 = this.field2884[var2].field5182 / 20;
            }
        }
        if (this.field2885 < this.field2883 && this.field2885 / 20 < var1) {
            var1 = this.field2885 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2884[var3] != null) {
                this.field2884[var3].field5182 -= var1 * 20;
            }
        }
        if (this.field2885 < this.field2883) {
            this.field2885 -= var1 * 20;
            this.field2883 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()Ldg;", line = 49)
    public final class224 method1383() {
        byte[] var1 = this.method1385();
        return new class224(22050, var1, this.field2885 * 22050 / 1000, this.field2883 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lij;II)Ldl;", line = 55)
    public static final class201 method1384(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1926(0, arg2, arg1);
        return var3 == null ? null : new class201(new class366(var3));
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lrg;)V", line = 129)
    private class201(class366 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2306((byte) 125);
            if (var3 != 0) {
                arg0.field5048--;
                this.field2884[var2] = new class374();
                this.field2884[var2].method2342(arg0);
            }
        }
        this.field2885 = arg0.method2297(13352);
        this.field2883 = arg0.method2297(13352);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 149)
    private class201() {
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()[B", line = 70)
    private final byte[] method1385() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2884[var2] != null && this.field2884[var2].field5185 + this.field2884[var2].field5182 > var1) {
                var1 = this.field2884[var2].field5185 + this.field2884[var2].field5182;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2884[var5] != null) {
                int var6 = this.field2884[var5].field5185 * 22050 / 1000;
                int var7 = this.field2884[var5].field5182 * 22050 / 1000;
                int[] var8 = this.field2884[var5].method2340(var6, this.field2884[var5].field5185);
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
