import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class67 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[Lfi;")
    private class107[] field1282 = new class107[10];

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()I")
    public final int method429() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1282[var2] != null && this.field1282[var2].field2020 / 20 < var1) {
                var1 = this.field1282[var2].field2020 / 20;
            }
        }
        if (this.field1283 < this.field1284 && this.field1283 / 20 < var1) {
            var1 = this.field1283 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1282[var3] != null) {
                this.field1282[var3].field2020 -= var1 * 20;
            }
        }
        if (this.field1283 < this.field1284) {
            this.field1283 -= var1 * 20;
            this.field1284 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnc;II)Ltb;")
    public static final class67 method430(class83 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method590(arg2, arg1, 0);
        return var3 == null ? null : new class67(new class128(var3));
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "()Lk;")
    public final class174 method431() {
        byte[] var1 = this.method432();
        return new class174(22050, var1, this.field1283 * 22050 / 1000, this.field1284 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lfh;)V")
    private class67(class128 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method937(false);
            if (var3 != 0) {
                arg0.field2379--;
                this.field1282[var2] = new class107();
                this.field1282[var2].method803(arg0);
            }
        }
        this.field1283 = arg0.method912(-110);
        this.field1284 = arg0.method912(-77);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
    private class67() {
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "()[B")
    private final byte[] method432() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1282[var2] != null && this.field1282[var2].field2020 + this.field1282[var2].field2016 > var1) {
                var1 = this.field1282[var2].field2020 + this.field1282[var2].field2016;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1282[var5] != null) {
                int var6 = this.field1282[var5].field2016 * 22050 / 1000;
                int var7 = this.field1282[var5].field2020 * 22050 / 1000;
                int[] var8 = this.field1282[var5].method805(var6, this.field1282[var5].field2016);
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
