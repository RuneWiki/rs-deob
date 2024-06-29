import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class395 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[Lkf;")
    private class266[] field5914 = new class266[10];

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    private int field5913;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    private int field5915;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "()I", line = 6)
    public final int method3124() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5914[var2] != null && this.field5914[var2].field4069 / 20 < var1) {
                var1 = this.field5914[var2].field4069 / 20;
            }
        }
        if (this.field5913 < this.field5915 && this.field5913 / 20 < var1) {
            var1 = this.field5913 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5914[var3] != null) {
                this.field5914[var3].field4069 -= var1 * 20;
            }
        }
        if (this.field5913 < this.field5915) {
            this.field5913 -= var1 * 20;
            this.field5915 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lla;II)Lku;", line = 52)
    public static final class395 method3125(class476 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3632(arg1, arg2, -120);
        return var3 == null ? null : new class395(new class163(var3));
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "()[B", line = 62)
    private final byte[] method3126() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5914[var2] != null && this.field5914[var2].field4069 + this.field5914[var2].field4061 > var1) {
                var1 = this.field5914[var2].field4069 + this.field5914[var2].field4061;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5914[var5] != null) {
                int var6 = this.field5914[var5].field4061 * 22050 / 1000;
                int var7 = this.field5914[var5].field4069 * 22050 / 1000;
                int[] var8 = this.field5914[var5].method2220(var6, this.field5914[var5].field4061);
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

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lib;)V", line = 123)
    private class395(class163 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1455((byte) 62);
            if (var3 != 0) {
                arg0.field2201--;
                this.field5914[var2] = new class266();
                this.field5914[var2].method2218(arg0);
            }
        }
        this.field5913 = arg0.method1445((byte) 102);
        this.field5915 = arg0.method1445((byte) 122);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V", line = 143)
    private class395() {
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "()Lps;", line = 147)
    public final class105 method3127() {
        byte[] var1 = this.method3126();
        return new class105(22050, var1, this.field5913 * 22050 / 1000, this.field5915 * 22050 / 1000);
    }
}
