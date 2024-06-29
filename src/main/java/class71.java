import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class71 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[Lgi;")
    private class191[] field1415 = new class191[10];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()Lk;")
    public final class177 method511() {
        byte[] var1 = this.method514();
        return new class177(22050, var1, this.field1416 * 22050 / 1000, this.field1417 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lcj;II)Lhb;")
    public static final class71 method512(class28 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method135(arg2, 0, arg1);
        return var3 == null ? null : new class71(new class249(var3));
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()I")
    public final int method513() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1415[var2] != null && this.field1415[var2].field3299 / 20 < var1) {
                var1 = this.field1415[var2].field3299 / 20;
            }
        }
        if (this.field1416 < this.field1417 && this.field1416 / 20 < var1) {
            var1 = this.field1416 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1415[var3] != null) {
                this.field1415[var3].field3299 -= var1 * 20;
            }
        }
        if (this.field1416 < this.field1417) {
            this.field1416 -= var1 * 20;
            this.field1417 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()[B")
    private final byte[] method514() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1415[var2] != null && this.field1415[var2].field3300 + this.field1415[var2].field3299 > var1) {
                var1 = this.field1415[var2].field3300 + this.field1415[var2].field3299;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1415[var5] != null) {
                int var6 = this.field1415[var5].field3300 * 22050 / 1000;
                int var7 = this.field1415[var5].field3299 * 22050 / 1000;
                int[] var8 = this.field1415[var5].method1255(var6, this.field1415[var5].field3300);
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

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Llh;)V")
    private class71(class249 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1677(-6677);
            if (var3 != 0) {
                arg0.field4335--;
                this.field1415[var2] = new class191();
                this.field1415[var2].method1257(arg0);
            }
        }
        this.field1416 = arg0.method1674(1355769544);
        this.field1417 = arg0.method1674(1355769544);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    private class71() {
    }
}
