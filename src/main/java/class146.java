import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class146 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[Lbt;")
    private class469[] field2495 = new class469[10];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    private int field2494;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    private int field2493;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()I", line = 9)
    public final int method1118() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2495[var2] != null && this.field2495[var2].field6759 / 20 < var1) {
                var1 = this.field2495[var2].field6759 / 20;
            }
        }
        if (this.field2494 < this.field2493 && this.field2494 / 20 < var1) {
            var1 = this.field2494 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2495[var3] != null) {
                this.field2495[var3].field6759 -= var1 * 20;
            }
        }
        if (this.field2494 < this.field2493) {
            this.field2494 -= var1 * 20;
            this.field2493 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()[B", line = 54)
    private final byte[] method1119() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2495[var2] != null && this.field2495[var2].field6780 + this.field2495[var2].field6759 > var1) {
                var1 = this.field2495[var2].field6780 + this.field2495[var2].field6759;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2495[var5] != null) {
                int var6 = this.field2495[var5].field6780 * 22050 / 1000;
                int var7 = this.field2495[var5].field6759 * 22050 / 1000;
                int[] var8 = this.field2495[var5].method2771(var6, this.field2495[var5].field6780);
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

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()Ltk;", line = 114)
    public final class95 method1120() {
        byte[] var1 = this.method1119();
        return new class95(22050, var1, this.field2494 * 22050 / 1000, this.field2493 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvo;II)Lub;", line = 119)
    public static final class146 method1121(class345 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2081(-127, arg2, arg1);
        return var3 == null ? null : new class146(new class465(var3));
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lek;)V", line = 129)
    private class146(class465 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2705(-85);
            if (var3 != 0) {
                arg0.field6710--;
                this.field2495[var2] = new class469();
                this.field2495[var2].method2769(arg0);
            }
        }
        this.field2494 = arg0.method2755((byte) -83);
        this.field2493 = arg0.method2755((byte) -51);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 149)
    private class146() {
    }
}
