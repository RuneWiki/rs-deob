import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class328 {

    @OriginalMember(owner = "client!on", name = "c", descriptor = "[Lcg;")
    private class8[] field5098 = new class8[10];

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    private int field5096;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "()I", line = 5)
    public final int method2224() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5098[var2] != null && this.field5098[var2].field119 / 20 < var1) {
                var1 = this.field5098[var2].field119 / 20;
            }
        }
        if (this.field5096 < this.field5097 && this.field5096 / 20 < var1) {
            var1 = this.field5096 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5098[var3] != null) {
                this.field5098[var3].field119 -= var1 * 20;
            }
        }
        if (this.field5096 < this.field5097) {
            this.field5096 -= var1 * 20;
            this.field5097 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "()Ljf;", line = 48)
    public final class340 method2225() {
        byte[] var1 = this.method2227();
        return new class340(22050, var1, this.field5096 * 22050 / 1000, this.field5097 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Ll;II)Lon;", line = 54)
    public static final class328 method2226(class133 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method980(arg1, arg2, 5);
        return var3 == null ? null : new class328(new class166(var3));
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lkh;)V", line = 129)
    private class328(class166 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1178(0);
            if (var3 != 0) {
                arg0.field2532--;
                this.field5098[var2] = new class8();
                this.field5098[var2].method64(arg0);
            }
        }
        this.field5096 = arg0.method1151(-104);
        this.field5097 = arg0.method1151(-62);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 149)
    private class328() {
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "()[B", line = 72)
    private final byte[] method2227() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5098[var2] != null && this.field5098[var2].field119 + this.field5098[var2].field106 > var1) {
                var1 = this.field5098[var2].field119 + this.field5098[var2].field106;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5098[var5] != null) {
                int var6 = this.field5098[var5].field106 * 22050 / 1000;
                int var7 = this.field5098[var5].field119 * 22050 / 1000;
                int[] var8 = this.field5098[var5].method67(var6, this.field5098[var5].field106);
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
