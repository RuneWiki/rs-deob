import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class33 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[Lpa;")
    private class2[] field409 = new class2[10];

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()I", line = 4)
    public final int method197() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field409[var2] != null && this.field409[var2].field30 / 20 < var1) {
                var1 = this.field409[var2].field30 / 20;
            }
        }
        if (this.field410 < this.field411 && this.field410 / 20 < var1) {
            var1 = this.field410 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field409[var3] != null) {
                this.field409[var3].field30 -= var1 * 20;
            }
        }
        if (this.field410 < this.field411) {
            this.field410 -= var1 * 20;
            this.field411 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()Lgl;", line = 51)
    public final class203 method198() {
        byte[] var1 = this.method200();
        return new class203(22050, var1, this.field410 * 22050 / 1000, this.field411 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Llc;II)Lhj;", line = 59)
    public static final class33 method199(class175 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1199(28815, arg2, arg1);
        return var3 == null ? null : new class33(new class107(var3));
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lp;)V", line = 70)
    private class33(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method661(-1);
            if (var3 != 0) {
                arg0.field1400--;
                this.field409[var2] = new class2();
                this.field409[var2].method7(arg0);
            }
        }
        this.field410 = arg0.method624(14612);
        this.field411 = arg0.method624(14612);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 90)
    private class33() {
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method200() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field409[var2] != null && this.field409[var2].field30 + this.field409[var2].field21 > var1) {
                var1 = this.field409[var2].field30 + this.field409[var2].field21;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field409[var5] != null) {
                int var6 = this.field409[var5].field21 * 22050 / 1000;
                int var7 = this.field409[var5].field30 * 22050 / 1000;
                int[] var8 = this.field409[var5].method6(var6, this.field409[var5].field21);
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
