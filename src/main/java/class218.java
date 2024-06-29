import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class218 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "[Lob;")
    private class257[] field3651 = new class257[10];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    private int field3650;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lda;II)Lhh;")
    public static final class218 method1496(class22 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method190((byte) -91, arg2, arg1);
        return var3 == null ? null : new class218(new class217(var3));
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "()I")
    public final int method1497() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3651[var2] != null && this.field3651[var2].field4465 / 20 < var1) {
                var1 = this.field3651[var2].field4465 / 20;
            }
        }
        if (this.field3650 < this.field3652 && this.field3650 / 20 < var1) {
            var1 = this.field3650 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3651[var3] != null) {
                this.field3651[var3].field4465 -= var1 * 20;
            }
        }
        if (this.field3650 < this.field3652) {
            this.field3650 -= var1 * 20;
            this.field3652 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "()[B")
    private final byte[] method1498() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3651[var2] != null && this.field3651[var2].field4470 + this.field3651[var2].field4465 > var1) {
                var1 = this.field3651[var2].field4470 + this.field3651[var2].field4465;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3651[var5] != null) {
                int var6 = this.field3651[var5].field4470 * 22050 / 1000;
                int var7 = this.field3651[var5].field4465 * 22050 / 1000;
                int[] var8 = this.field3651[var5].method1733(var6, this.field3651[var5].field4470);
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

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "()Lbj;")
    public final class107 method1499() {
        byte[] var1 = this.method1498();
        return new class107(22050, var1, this.field3650 * 22050 / 1000, this.field3652 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lwd;)V")
    private class218(class217 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1487(255);
            if (var3 != 0) {
                arg0.field3581--;
                this.field3651[var2] = new class257();
                this.field3651[var2].method1734(arg0);
            }
        }
        this.field3650 = arg0.method1441(-51);
        this.field3652 = arg0.method1441(102);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    private class218() {
    }
}
