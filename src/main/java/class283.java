import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class283 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "[Lwe;")
    private class60[] field4629 = new class60[10];

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field4628;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field4627;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()I", line = 6)
    public final int method2009() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4629[var2] != null && this.field4629[var2].field1186 / 20 < var1) {
                var1 = this.field4629[var2].field1186 / 20;
            }
        }
        if (this.field4628 < this.field4627 && this.field4628 / 20 < var1) {
            var1 = this.field4628 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4629[var3] != null) {
                this.field4629[var3].field1186 -= var1 * 20;
            }
        }
        if (this.field4628 < this.field4627) {
            this.field4628 -= var1 * 20;
            this.field4627 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()[B", line = 49)
    private final byte[] method2010() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4629[var2] != null && this.field4629[var2].field1186 + this.field4629[var2].field1169 > var1) {
                var1 = this.field4629[var2].field1186 + this.field4629[var2].field1169;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4629[var5] != null) {
                int var6 = this.field4629[var5].field1169 * 22050 / 1000;
                int var7 = this.field4629[var5].field1186 * 22050 / 1000;
                int[] var8 = this.field4629[var5].method494(var6, this.field4629[var5].field1169);
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

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lek;II)Lu;", line = 108)
    public static final class283 method2011(class206 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1404(arg1, arg2, (byte) -113);
        return var3 == null ? null : new class283(new class146(var3));
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()Llb;", line = 117)
    public final class236 method2012() {
        byte[] var1 = this.method2010();
        return new class236(22050, var1, this.field4628 * 22050 / 1000, this.field4627 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Loe;)V", line = 128)
    private class283(class146 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 != 0) {
                arg0.field2435--;
                this.field4629[var2] = new class60();
                this.field4629[var2].method493(arg0);
            }
        }
        this.field4628 = arg0.method989(91);
        this.field4627 = arg0.method989(83);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 148)
    private class283() {
    }
}
