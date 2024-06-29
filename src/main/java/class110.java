import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class110 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "[Lse;")
    private class171[] field2334 = new class171[10];

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    private int field2333;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lu;II)Llf;")
    public static final class110 method767(class184 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1235(arg2, (byte) -64, arg1);
        return var3 == null ? null : new class110(new class52(var3));
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()[B")
    private final byte[] method768() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2334[var2] != null && this.field2334[var2].field3478 + this.field2334[var2].field3477 > var1) {
                var1 = this.field2334[var2].field3478 + this.field2334[var2].field3477;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2334[var5] != null) {
                int var6 = this.field2334[var5].field3478 * 22050 / 1000;
                int var7 = this.field2334[var5].field3477 * 22050 / 1000;
                int[] var8 = this.field2334[var5].method1153(var6, this.field2334[var5].field3478);
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

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()Lqe;")
    public final class153 method769() {
        byte[] var1 = this.method768();
        return new class153(22050, var1, this.field2335 * 22050 / 1000, this.field2333 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "()I")
    public final int method770() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2334[var2] != null && this.field2334[var2].field3477 / 20 < var1) {
                var1 = this.field2334[var2].field3477 / 20;
            }
        }
        if (this.field2335 < this.field2333 && this.field2335 / 20 < var1) {
            var1 = this.field2335 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2334[var3] != null) {
                this.field2334[var3].field3477 -= var1 * 20;
            }
        }
        if (this.field2335 < this.field2333) {
            this.field2335 -= var1 * 20;
            this.field2333 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lfa;)V")
    private class110(class52 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method344(255);
            if (var3 != 0) {
                arg0.field1033--;
                this.field2334[var2] = new class171();
                this.field2334[var2].method1151(arg0);
            }
        }
        this.field2335 = arg0.method390((byte) 90);
        this.field2333 = arg0.method390((byte) 91);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    private class110() {
    }
}
