import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[Lq;")
    private class111[] field1481 = new class111[10];

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lna;II)Lkd;")
    public static final class73 method583(class91 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method742(arg2, -124, arg1);
        return var3 == null ? null : new class73(new class13(var3));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
    public final int method584() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1481[var2] != null && this.field1481[var2].field2358 / 20 < var1) {
                var1 = this.field1481[var2].field2358 / 20;
            }
        }
        if (this.field1483 < this.field1482 && this.field1483 / 20 < var1) {
            var1 = this.field1483 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1481[var3] != null) {
                this.field1481[var3].field2358 -= var1 * 20;
            }
        }
        if (this.field1483 < this.field1482) {
            this.field1483 -= var1 * 20;
            this.field1482 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()[B")
    private final byte[] method585() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1481[var2] != null && this.field1481[var2].field2363 + this.field1481[var2].field2358 > var1) {
                var1 = this.field1481[var2].field2363 + this.field1481[var2].field2358;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1481[var5] != null) {
                int var6 = this.field1481[var5].field2363 * 22050 / 1000;
                int var7 = this.field1481[var5].field2358 * 22050 / 1000;
                int[] var8 = this.field1481[var5].method915(var6, this.field1481[var5].field2363);
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

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lhb;")
    public final class51 method586() {
        byte[] var1 = this.method585();
        return new class51(22050, var1, this.field1483 * 22050 / 1000, this.field1482 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lbe;)V")
    private class73(class13 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method142(27467);
            if (var3 != 0) {
                arg0.field309--;
                this.field1481[var2] = new class111();
                this.field1481[var2].method914(arg0);
            }
        }
        this.field1483 = arg0.method105(1375221240);
        this.field1482 = arg0.method105(1375221240);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    private class73() {
    }
}
