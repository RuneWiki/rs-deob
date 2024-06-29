import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class324 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[Lag;")
    private class312[] field5088 = new class312[10];

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field5090;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lug;II)Lki;", line = 7)
    public static final class324 method2279(class253 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1813(arg2, arg1, true);
        return var3 == null ? null : new class324(new class6(var3));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()I", line = 16)
    public final int method2280() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5088[var2] != null && this.field5088[var2].field4874 / 20 < var1) {
                var1 = this.field5088[var2].field4874 / 20;
            }
        }
        if (this.field5090 < this.field5089 && this.field5090 / 20 < var1) {
            var1 = this.field5090 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5088[var3] != null) {
                this.field5088[var3].field4874 -= var1 * 20;
            }
        }
        if (this.field5090 < this.field5089) {
            this.field5090 -= var1 * 20;
            this.field5089 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()[B", line = 63)
    private final byte[] method2281() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5088[var2] != null && this.field5088[var2].field4884 + this.field5088[var2].field4874 > var1) {
                var1 = this.field5088[var2].field4884 + this.field5088[var2].field4874;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5088[var5] != null) {
                int var6 = this.field5088[var5].field4884 * 22050 / 1000;
                int var7 = this.field5088[var5].field4874 * 22050 / 1000;
                int[] var8 = this.field5088[var5].method2175(var6, this.field5088[var5].field4884);
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

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lvl;)V", line = 129)
    private class324(class6 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method58(-288140008);
            if (var3 != 0) {
                arg0.field111--;
                this.field5088[var2] = new class312();
                this.field5088[var2].method2177(arg0);
            }
        }
        this.field5090 = arg0.method39((byte) 68);
        this.field5089 = arg0.method39((byte) 46);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 149)
    private class324() {
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()Lid;", line = 126)
    public final class266 method2282() {
        byte[] var1 = this.method2281();
        return new class266(22050, var1, this.field5090 * 22050 / 1000, this.field5089 * 22050 / 1000);
    }
}
