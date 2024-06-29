import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class218 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[Lf;")
    private class226[] field3666 = new class226[10];

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    private int field3667;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()[B")
    private final byte[] method1445() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3666[var2] != null && this.field3666[var2].field3802 + this.field3666[var2].field3791 > var1) {
                var1 = this.field3666[var2].field3802 + this.field3666[var2].field3791;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3666[var5] != null) {
                int var6 = this.field3666[var5].field3791 * 22050 / 1000;
                int var7 = this.field3666[var5].field3802 * 22050 / 1000;
                int[] var8 = this.field3666[var5].method1520(var6, this.field3666[var5].field3791);
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

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lvh;II)Lii;")
    public static final class218 method1446(class108 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method746(arg2, (byte) -128, arg1);
        return var3 == null ? null : new class218(new class101(var3));
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Leh;)V")
    private class218(class101 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method669((byte) 36);
            if (var3 != 0) {
                arg0.field1762--;
                this.field3666[var2] = new class226();
                this.field3666[var2].method1521(arg0);
            }
        }
        this.field3667 = arg0.method677(false);
        this.field3668 = arg0.method677(false);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()I")
    public final int method1447() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3666[var2] != null && this.field3666[var2].field3802 / 20 < var1) {
                var1 = this.field3666[var2].field3802 / 20;
            }
        }
        if (this.field3667 < this.field3668 && this.field3667 / 20 < var1) {
            var1 = this.field3667 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3666[var3] != null) {
                this.field3666[var3].field3802 -= var1 * 20;
            }
        }
        if (this.field3667 < this.field3668) {
            this.field3667 -= var1 * 20;
            this.field3668 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()Lph;")
    public final class202 method1448() {
        byte[] var1 = this.method1445();
        return new class202(22050, var1, this.field3667 * 22050 / 1000, this.field3668 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    private class218() {
    }
}
