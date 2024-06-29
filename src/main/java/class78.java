import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class78 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[Lo;")
    private class180[] field1424 = new class180[10];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()[B")
    private final byte[] method443() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1424[var2] != null && this.field1424[var2].field3230 + this.field1424[var2].field3226 > var1) {
                var1 = this.field1424[var2].field3230 + this.field1424[var2].field3226;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1424[var5] != null) {
                int var6 = this.field1424[var5].field3226 * 22050 / 1000;
                int var7 = this.field1424[var5].field3230 * 22050 / 1000;
                int[] var8 = this.field1424[var5].method1181(var6, this.field1424[var5].field3226);
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

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
    public final int method444() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1424[var2] != null && this.field1424[var2].field3230 / 20 < var1) {
                var1 = this.field1424[var2].field3230 / 20;
            }
        }
        if (this.field1425 < this.field1423 && this.field1425 / 20 < var1) {
            var1 = this.field1425 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1424[var3] != null) {
                this.field1424[var3].field3230 -= var1 * 20;
            }
        }
        if (this.field1425 < this.field1423) {
            this.field1425 -= var1 * 20;
            this.field1423 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lgf;II)Lhe;")
    public static final class78 method445(class7 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method41(-18328, arg1, arg2);
        return var3 == null ? null : new class78(new class190(var3));
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()Lce;")
    public final class216 method446() {
        byte[] var1 = this.method443();
        return new class216(22050, var1, this.field1425 * 22050 / 1000, this.field1423 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lh;)V")
    private class78(class190 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1265(124);
            if (var3 != 0) {
                arg0.field3487--;
                this.field1424[var2] = new class180();
                this.field1424[var2].method1183(arg0);
            }
        }
        this.field1425 = arg0.method1275(128);
        this.field1423 = arg0.method1275(128);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    private class78() {
    }
}
