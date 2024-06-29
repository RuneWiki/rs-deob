import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class117 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[Le;")
    private class61[] field1971 = new class61[10];

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    private int field1972;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()[B")
    private final byte[] method851() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1971[var2] != null && this.field1971[var2].field993 + this.field1971[var2].field992 > var1) {
                var1 = this.field1971[var2].field993 + this.field1971[var2].field992;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1971[var5] != null) {
                int var6 = this.field1971[var5].field992 * 22050 / 1000;
                int var7 = this.field1971[var5].field993 * 22050 / 1000;
                int[] var8 = this.field1971[var5].method407(var6, this.field1971[var5].field992);
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

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lu;II)Lq;")
    public static final class117 method852(class111 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method828(arg1, (byte) 119, arg2);
        return var3 == null ? null : new class117(new class121(var3));
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()Lci;")
    public final class224 method853() {
        byte[] var1 = this.method851();
        return new class224(22050, var1, this.field1972 * 22050 / 1000, this.field1973 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Llb;)V")
    private class117(class121 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method897(106);
            if (var3 != 0) {
                arg0.field2026--;
                this.field1971[var2] = new class61();
                this.field1971[var2].method406(arg0);
            }
        }
        this.field1972 = arg0.method876(false);
        this.field1973 = arg0.method876(false);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    private class117() {
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()I")
    public final int method854() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1971[var2] != null && this.field1971[var2].field993 / 20 < var1) {
                var1 = this.field1971[var2].field993 / 20;
            }
        }
        if (this.field1972 < this.field1973 && this.field1972 / 20 < var1) {
            var1 = this.field1972 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1971[var3] != null) {
                this.field1971[var3].field993 -= var1 * 20;
            }
        }
        if (this.field1972 < this.field1973) {
            this.field1972 -= var1 * 20;
            this.field1973 -= var1 * 20;
        }
        return var1;
    }
}
