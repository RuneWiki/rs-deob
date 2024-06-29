import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class85 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "[Lph;")
    private class421[] field1109 = new class421[10];

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()[B", line = 8)
    private final byte[] method532() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1109[var2] != null && this.field1109[var2].field5714 + this.field1109[var2].field5706 > var1) {
                var1 = this.field1109[var2].field5714 + this.field1109[var2].field5706;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1109[var5] != null) {
                int var6 = this.field1109[var5].field5706 * 22050 / 1000;
                int var7 = this.field1109[var5].field5714 * 22050 / 1000;
                int[] var8 = this.field1109[var5].method2495(var6, this.field1109[var5].field5706);
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

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lbt;)V", line = 74)
    private class85(class32 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method201((byte) -112);
            if (var3 != 0) {
                arg0.field456--;
                this.field1109[var2] = new class421();
                this.field1109[var2].method2497(arg0);
            }
        }
        this.field1110 = arg0.method215((byte) 119);
        this.field1108 = arg0.method215((byte) 124);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 104)
    private class85() {
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()Ljn;", line = 70)
    public final class465 method533() {
        byte[] var1 = this.method532();
        return new class465(22050, var1, this.field1110 * 22050 / 1000, this.field1108 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lr;II)Lwk;", line = 96)
    public static final class85 method534(class110 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method702((byte) -106, arg2, arg1);
        return var3 == null ? null : new class85(new class32(var3));
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()I", line = 109)
    public final int method535() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1109[var2] != null && this.field1109[var2].field5714 / 20 < var1) {
                var1 = this.field1109[var2].field5714 / 20;
            }
        }
        if (this.field1110 < this.field1108 && this.field1110 / 20 < var1) {
            var1 = this.field1110 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1109[var3] != null) {
                this.field1109[var3].field5714 -= var1 * 20;
            }
        }
        if (this.field1110 < this.field1108) {
            this.field1110 -= var1 * 20;
            this.field1108 -= var1 * 20;
        }
        return var1;
    }
}
