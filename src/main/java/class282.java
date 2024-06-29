import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class282 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "[Ltf;")
    private class231[] field4506 = new class231[10];

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljj;II)Lbl;")
    public static final class282 method1889(class134 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method940((byte) 86, arg2, arg1);
        return var3 == null ? null : new class282(new class264(var3));
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
    public final int method1890() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4506[var2] != null && this.field4506[var2].field3682 / 20 < var1) {
                var1 = this.field4506[var2].field3682 / 20;
            }
        }
        if (this.field4505 < this.field4507 && this.field4505 / 20 < var1) {
            var1 = this.field4505 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4506[var3] != null) {
                this.field4506[var3].field3682 -= var1 * 20;
            }
        }
        if (this.field4505 < this.field4507) {
            this.field4505 -= var1 * 20;
            this.field4507 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()Lwc;")
    public final class91 method1891() {
        byte[] var1 = this.method1892();
        return new class91(22050, var1, this.field4505 * 22050 / 1000, this.field4507 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()[B")
    private final byte[] method1892() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4506[var2] != null && this.field4506[var2].field3682 + this.field4506[var2].field3680 > var1) {
                var1 = this.field4506[var2].field3682 + this.field4506[var2].field3680;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4506[var5] != null) {
                int var6 = this.field4506[var5].field3680 * 22050 / 1000;
                int var7 = this.field4506[var5].field3682 * 22050 / 1000;
                int[] var8 = this.field4506[var5].method1532(var6, this.field4506[var5].field3680);
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

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lhi;)V")
    private class282(class264 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1779(-84);
            if (var3 != 0) {
                arg0.field4195--;
                this.field4506[var2] = new class231();
                this.field4506[var2].method1531(arg0);
            }
        }
        this.field4505 = arg0.method1777(-128);
        this.field4507 = arg0.method1777(-64);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    private class282() {
    }
}
