import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class140 {

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[Lqd;")
    private class39[] field2336 = new class39[10];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    private int field2337;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lrg;II)Ljj;", line = 6)
    public static final class140 method1045(class88 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method636(arg1, (byte) 114, arg2);
        return var3 == null ? null : new class140(new class70(var3));
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()Lmi;", line = 15)
    public final class257 method1046() {
        byte[] var1 = this.method1047();
        return new class257(22050, var1, this.field2335 * 22050 / 1000, this.field2337 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()[B", line = 24)
    private final byte[] method1047() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2336[var2] != null && this.field2336[var2].field595 + this.field2336[var2].field593 > var1) {
                var1 = this.field2336[var2].field595 + this.field2336[var2].field593;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2336[var5] != null) {
                int var6 = this.field2336[var5].field593 * 22050 / 1000;
                int var7 = this.field2336[var5].field595 * 22050 / 1000;
                int[] var8 = this.field2336[var5].method232(var6, this.field2336[var5].field593);
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

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lpb;)V", line = 129)
    private class140(class70 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method481(0);
            if (var3 != 0) {
                arg0.field1068--;
                this.field2336[var2] = new class39();
                this.field2336[var2].method231(arg0);
            }
        }
        this.field2335 = arg0.method423(255);
        this.field2337 = arg0.method423(255);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 149)
    private class140() {
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()I", line = 87)
    public final int method1048() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2336[var2] != null && this.field2336[var2].field595 / 20 < var1) {
                var1 = this.field2336[var2].field595 / 20;
            }
        }
        if (this.field2335 < this.field2337 && this.field2335 / 20 < var1) {
            var1 = this.field2335 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2336[var3] != null) {
                this.field2336[var3].field595 -= var1 * 20;
            }
        }
        if (this.field2335 < this.field2337) {
            this.field2335 -= var1 * 20;
            this.field2337 -= var1 * 20;
        }
        return var1;
    }
}
