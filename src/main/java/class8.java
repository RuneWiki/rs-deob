import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[Lvg;")
    private class197[] field156 = new class197[10];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()[B")
    private final byte[] method43() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field156[var2] != null && this.field156[var2].field3887 + this.field156[var2].field3877 > var1) {
                var1 = this.field156[var2].field3887 + this.field156[var2].field3877;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field156[var5] != null) {
                int var6 = this.field156[var5].field3877 * 22050 / 1000;
                int var7 = this.field156[var5].field3887 * 22050 / 1000;
                int[] var8 = this.field156[var5].method1293(var6, this.field156[var5].field3877);
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

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()Lgf;")
    public final class62 method44() {
        byte[] var1 = this.method43();
        return new class62(22050, var1, this.field155 * 22050 / 1000, this.field157 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()I")
    public final int method45() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field156[var2] != null && this.field156[var2].field3887 / 20 < var1) {
                var1 = this.field156[var2].field3887 / 20;
            }
        }
        if (this.field155 < this.field157 && this.field155 / 20 < var1) {
            var1 = this.field155 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field156[var3] != null) {
                this.field156[var3].field3887 -= var1 * 20;
            }
        }
        if (this.field155 < this.field157) {
            this.field155 -= var1 * 20;
            this.field157 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lga;II)Lag;")
    public static final class8 method46(class58 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method367(arg1, arg2, (byte) -34);
        return var3 == null ? null : new class8(new class89(var3));
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljg;)V")
    private class8(class89 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method538((byte) 93);
            if (var3 != 0) {
                arg0.field1727--;
                this.field156[var2] = new class197();
                this.field156[var2].method1290(arg0);
            }
        }
        this.field155 = arg0.method555(-1113627096);
        this.field157 = arg0.method555(-1113627096);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    private class8() {
    }
}
