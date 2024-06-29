import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class269 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "[Luh;")
    private class243[] field3868 = new class243[10];

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    private int field3866;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()[B", line = 6)
    private final byte[] method1836() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3868[var2] != null && this.field3868[var2].field3524 + this.field3868[var2].field3518 > var1) {
                var1 = this.field3868[var2].field3524 + this.field3868[var2].field3518;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3868[var5] != null) {
                int var6 = this.field3868[var5].field3518 * 22050 / 1000;
                int var7 = this.field3868[var5].field3524 * 22050 / 1000;
                int[] var8 = this.field3868[var5].method1721(var6, this.field3868[var5].field3518);
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

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()I", line = 67)
    public final int method1837() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3868[var2] != null && this.field3868[var2].field3524 / 20 < var1) {
                var1 = this.field3868[var2].field3524 / 20;
            }
        }
        if (this.field3867 < this.field3866 && this.field3867 / 20 < var1) {
            var1 = this.field3867 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3868[var3] != null) {
                this.field3868[var3].field3524 -= var1 * 20;
            }
        }
        if (this.field3867 < this.field3866) {
            this.field3867 -= var1 * 20;
            this.field3866 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lfh;II)Lag;", line = 112)
    public static final class269 method1838(class140 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1089(arg1, (byte) 119, arg2);
        return var3 == null ? null : new class269(new class299(var3));
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()Lpb;", line = 120)
    public final class168 method1839() {
        byte[] var1 = this.method1836();
        return new class168(22050, var1, this.field3867 * 22050 / 1000, this.field3866 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lfd;)V", line = 129)
    private class269(class299 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 != 0) {
                arg0.field4351--;
                this.field3868[var2] = new class243();
                this.field3868[var2].method1719(arg0);
            }
        }
        this.field3867 = arg0.method2083((byte) -60);
        this.field3866 = arg0.method2083((byte) -110);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 149)
    private class269() {
    }
}
