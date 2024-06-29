import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "[Lnd;")
    private class270[] field1580 = new class270[10];

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
    public final int method697() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1580[var2] != null && this.field1580[var2].field4333 / 20 < var1) {
                var1 = this.field1580[var2].field4333 / 20;
            }
        }
        if (this.field1581 < this.field1582 && this.field1581 / 20 < var1) {
            var1 = this.field1581 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1580[var3] != null) {
                this.field1580[var3].field4333 -= var1 * 20;
            }
        }
        if (this.field1581 < this.field1582) {
            this.field1581 -= var1 * 20;
            this.field1582 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Lah;")
    public final class285 method698() {
        byte[] var1 = this.method700();
        return new class285(22050, var1, this.field1581 * 22050 / 1000, this.field1582 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lhc;II)Lbb;")
    public static final class92 method699(class235 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1590(arg2, (byte) -25, arg1);
        return var3 == null ? null : new class92(new class88(var3));
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lai;)V")
    private class92(class88 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method633(82);
            if (var3 != 0) {
                arg0.field1535--;
                this.field1580[var2] = new class270();
                this.field1580[var2].method1821(arg0);
            }
        }
        this.field1581 = arg0.method645(11596);
        this.field1582 = arg0.method645(11596);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    private class92() {
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()[B")
    private final byte[] method700() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1580[var2] != null && this.field1580[var2].field4333 + this.field1580[var2].field4331 > var1) {
                var1 = this.field1580[var2].field4333 + this.field1580[var2].field4331;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1580[var5] != null) {
                int var6 = this.field1580[var5].field4331 * 22050 / 1000;
                int var7 = this.field1580[var5].field4333 * 22050 / 1000;
                int[] var8 = this.field1580[var5].method1820(var6, this.field1580[var5].field4331);
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
