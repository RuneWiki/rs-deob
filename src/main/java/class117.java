import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 {

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lgb;")
    private class45[] field2679 = new class45[10];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    private int field2678;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
    public final int method923() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2679[var2] != null && this.field2679[var2].field1027 / 20 < var1) {
                var1 = this.field2679[var2].field1027 / 20;
            }
        }
        if (this.field2678 < this.field2677 && this.field2678 / 20 < var1) {
            var1 = this.field2678 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2679[var3] != null) {
                this.field2679[var3].field1027 -= var1 * 20;
            }
        }
        if (this.field2678 < this.field2677) {
            this.field2678 -= var1 * 20;
            this.field2677 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "()[B")
    private final byte[] method924() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2679[var2] != null && this.field2679[var2].field1043 + this.field2679[var2].field1027 > var1) {
                var1 = this.field2679[var2].field1043 + this.field2679[var2].field1027;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2679[var5] != null) {
                int var6 = this.field2679[var5].field1043 * 22050 / 1000;
                int var7 = this.field2679[var5].field1027 * 22050 / 1000;
                int[] var8 = this.field2679[var5].method360(var6, this.field2679[var5].field1043);
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

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lmd;II)Lqf;")
    public static final class117 method925(class87 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method669(arg2, arg1, -111);
        return var3 == null ? null : new class117(new class127(var3));
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "()Lgf;")
    public final class48 method926() {
        byte[] var1 = this.method924();
        return new class48(22050, var1, this.field2678 * 22050 / 1000, this.field2677 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lsb;)V")
    private class117(class127 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1011(30);
            if (var3 != 0) {
                arg0.field2995--;
                this.field2679[var2] = new class45();
                this.field2679[var2].method362(arg0);
            }
        }
        this.field2678 = arg0.method1020(false);
        this.field2677 = arg0.method1020(false);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    private class117() {
    }
}
