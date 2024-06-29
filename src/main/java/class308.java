import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class308 {

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[Lsi;")
    private class213[] field5002 = new class213[10];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    private int field5000;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    private int field5001;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()[B")
    private final byte[] method2102() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5002[var2] != null && this.field5002[var2].field3414 + this.field5002[var2].field3411 > var1) {
                var1 = this.field5002[var2].field3414 + this.field5002[var2].field3411;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5002[var5] != null) {
                int var6 = this.field5002[var5].field3411 * 22050 / 1000;
                int var7 = this.field5002[var5].field3414 * 22050 / 1000;
                int[] var8 = this.field5002[var5].method1496(var6, this.field5002[var5].field3411);
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

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "()Luc;")
    public final class39 method2103() {
        byte[] var1 = this.method2102();
        return new class39(22050, var1, this.field5000 * 22050 / 1000, this.field5001 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "()I")
    public final int method2104() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5002[var2] != null && this.field5002[var2].field3414 / 20 < var1) {
                var1 = this.field5002[var2].field3414 / 20;
            }
        }
        if (this.field5000 < this.field5001 && this.field5000 / 20 < var1) {
            var1 = this.field5000 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5002[var3] != null) {
                this.field5002[var3].field3414 -= var1 * 20;
            }
        }
        if (this.field5000 < this.field5001) {
            this.field5000 -= var1 * 20;
            this.field5001 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lfa;II)Ljh;")
    public static final class308 method2105(class273 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1877(arg2, arg1, (byte) 97);
        return var3 == null ? null : new class308(new class202(var3));
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lma;)V")
    private class308(class202 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 != 0) {
                arg0.field3272--;
                this.field5002[var2] = new class213();
                this.field5002[var2].method1499(arg0);
            }
        }
        this.field5000 = arg0.method1419(85);
        this.field5001 = arg0.method1419(76);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    private class308() {
    }
}
