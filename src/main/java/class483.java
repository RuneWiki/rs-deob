import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class483 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "[Ldp;")
    private class474[] field6872 = new class474[10];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    private int field6870;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    private int field6871;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()Lma;", line = 9)
    public final class639 method2812() {
        byte[] var1 = this.method2813();
        return new class639(22050, var1, this.field6870 * 22050 / 1000, this.field6871 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()[B", line = 14)
    private final byte[] method2813() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6872[var2] != null && this.field6872[var2].field6787 + this.field6872[var2].field6786 > var1) {
                var1 = this.field6872[var2].field6787 + this.field6872[var2].field6786;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6872[var5] != null) {
                int var6 = this.field6872[var5].field6786 * 22050 / 1000;
                int var7 = this.field6872[var5].field6787 * 22050 / 1000;
                int[] var8 = this.field6872[var5].method2783(var6, this.field6872[var5].field6786);
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

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "()I", line = 74)
    public final int method2814() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6872[var2] != null && this.field6872[var2].field6787 / 20 < var1) {
                var1 = this.field6872[var2].field6787 / 20;
            }
        }
        if (this.field6870 < this.field6871 && this.field6870 / 20 < var1) {
            var1 = this.field6870 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6872[var3] != null) {
                this.field6872[var3].field6787 -= var1 * 20;
            }
        }
        if (this.field6870 < this.field6871) {
            this.field6870 -= var1 * 20;
            this.field6871 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lkha;II)Ldj;", line = 120)
    public static final class483 method2815(class687 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3810(arg1, -23360, arg2);
        return var3 == null ? null : new class483(new class179(var3));
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ltn;)V", line = 129)
    private class483(class179 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1094(255);
            if (var3 != 0) {
                arg0.field2354--;
                this.field6872[var2] = new class474();
                this.field6872[var2].method2780(arg0);
            }
        }
        this.field6870 = arg0.method1107(false);
        this.field6871 = arg0.method1107(false);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 149)
    private class483() {
    }
}
