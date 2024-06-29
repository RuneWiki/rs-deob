import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class61 {

    @OriginalMember(owner = "client!in", name = "c", descriptor = "[Lkq;")
    private class428[] field1083 = new class428[10];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()[B", line = 9)
    private final byte[] method511() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1083[var2] != null && this.field1083[var2].field6151 + this.field1083[var2].field6142 > var1) {
                var1 = this.field1083[var2].field6151 + this.field1083[var2].field6142;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1083[var5] != null) {
                int var6 = this.field1083[var5].field6151 * 22050 / 1000;
                int var7 = this.field1083[var5].field6142 * 22050 / 1000;
                int[] var8 = this.field1083[var5].method2544(var6, this.field1083[var5].field6151);
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

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()Lcv;", line = 69)
    public final class407 method512() {
        byte[] var1 = this.method511();
        return new class407(22050, var1, this.field1081 * 22050 / 1000, this.field1082 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "()I", line = 74)
    public final int method513() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1083[var2] != null && this.field1083[var2].field6142 / 20 < var1) {
                var1 = this.field1083[var2].field6142 / 20;
            }
        }
        if (this.field1081 < this.field1082 && this.field1081 / 20 < var1) {
            var1 = this.field1081 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1083[var3] != null) {
                this.field1083[var3].field6142 -= var1 * 20;
            }
        }
        if (this.field1081 < this.field1082) {
            this.field1081 -= var1 * 20;
            this.field1082 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lci;II)Lin;", line = 119)
    public static final class61 method514(class320 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2037(arg2, (byte) 83, arg1);
        return var3 == null ? null : new class61(new class519(var3));
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lwn;)V", line = 129)
    private class61(class519 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3072((byte) -120);
            if (var3 != 0) {
                arg0.field7558--;
                this.field1083[var2] = new class428();
                this.field1083[var2].method2543(arg0);
            }
        }
        this.field1081 = arg0.method3018(566990904);
        this.field1082 = arg0.method3018(566990904);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 149)
    private class61() {
    }
}
