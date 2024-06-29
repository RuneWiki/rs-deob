import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class178 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[Lbj;")
    private class95[] field2668 = new class95[10];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    private int field2667;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    private int field2669;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()Luk;")
    public final class105 method1264() {
        byte[] var1 = this.method1267();
        return new class105(22050, var1, this.field2667 * 22050 / 1000, this.field2669 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()I")
    public final int method1265() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2668[var2] != null && this.field2668[var2].field1595 / 20 < var1) {
                var1 = this.field2668[var2].field1595 / 20;
            }
        }
        if (this.field2667 < this.field2669 && this.field2667 / 20 < var1) {
            var1 = this.field2667 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2668[var3] != null) {
                this.field2668[var3].field1595 -= var1 * 20;
            }
        }
        if (this.field2667 < this.field2669) {
            this.field2667 -= var1 * 20;
            this.field2669 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Llc;II)Lti;")
    public static final class178 method1266(class270 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1868(arg2, arg1, 1);
        return var3 == null ? null : new class178(new class53(var3));
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()[B")
    private final byte[] method1267() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2668[var2] != null && this.field2668[var2].field1609 + this.field2668[var2].field1595 > var1) {
                var1 = this.field2668[var2].field1609 + this.field2668[var2].field1595;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2668[var5] != null) {
                int var6 = this.field2668[var5].field1609 * 22050 / 1000;
                int var7 = this.field2668[var5].field1595 * 22050 / 1000;
                int[] var8 = this.field2668[var5].method732(var6, this.field2668[var5].field1609);
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

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lhc;)V")
    private class178(class53 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method366(-16505);
            if (var3 != 0) {
                arg0.field735--;
                this.field2668[var2] = new class95();
                this.field2668[var2].method733(arg0);
            }
        }
        this.field2667 = arg0.method331(-79);
        this.field2669 = arg0.method331(-113);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    private class178() {
    }
}
