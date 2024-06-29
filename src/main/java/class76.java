import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class76 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "[Lrl;")
    private class308[] field1531 = new class308[10];

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lag;)V", line = 78)
    private class76(class202 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1317((byte) -76);
            if (var3 != 0) {
                arg0.field3249--;
                this.field1531[var2] = new class308();
                this.field1531[var2].method2063(arg0);
            }
        }
        this.field1533 = arg0.method1315(14289);
        this.field1532 = arg0.method1315(14289);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 149)
    private class76() {
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()[B", line = 11)
    private final byte[] method565() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1531[var2] != null && this.field1531[var2].field4695 + this.field1531[var2].field4693 > var1) {
                var1 = this.field1531[var2].field4695 + this.field1531[var2].field4693;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1531[var5] != null) {
                int var6 = this.field1531[var5].field4695 * 22050 / 1000;
                int var7 = this.field1531[var5].field4693 * 22050 / 1000;
                int[] var8 = this.field1531[var5].method2061(var6, this.field1531[var5].field4695);
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

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()Llj;", line = 73)
    public final class5 method566() {
        byte[] var1 = this.method565();
        return new class5(22050, var1, this.field1533 * 22050 / 1000, this.field1532 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "()I", line = 100)
    public final int method567() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1531[var2] != null && this.field1531[var2].field4693 / 20 < var1) {
                var1 = this.field1531[var2].field4693 / 20;
            }
        }
        if (this.field1533 < this.field1532 && this.field1533 / 20 < var1) {
            var1 = this.field1533 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1531[var3] != null) {
                this.field1531[var3].field4693 -= var1 * 20;
            }
        }
        if (this.field1533 < this.field1532) {
            this.field1533 -= var1 * 20;
            this.field1532 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lbm;II)Lhj;", line = 143)
    public static final class76 method568(class307 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2036(arg1, arg2, (byte) 124);
        return var3 == null ? null : new class76(new class202(var3));
    }
}
