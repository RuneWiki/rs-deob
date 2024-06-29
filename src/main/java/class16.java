import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class16 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "[Lp;")
    private class161[] field297 = new class161[10];

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lti;")
    public final class209 method139() {
        byte[] var1 = this.method140();
        return new class209(22050, var1, this.field299 * 22050 / 1000, this.field298 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()[B")
    private final byte[] method140() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field297[var2] != null && this.field297[var2].field2787 + this.field297[var2].field2783 > var1) {
                var1 = this.field297[var2].field2787 + this.field297[var2].field2783;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field297[var5] != null) {
                int var6 = this.field297[var5].field2787 * 22050 / 1000;
                int var7 = this.field297[var5].field2783 * 22050 / 1000;
                int[] var8 = this.field297[var5].method1042(var6, this.field297[var5].field2787);
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

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()I")
    public final int method141() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field297[var2] != null && this.field297[var2].field2783 / 20 < var1) {
                var1 = this.field297[var2].field2783 / 20;
            }
        }
        if (this.field299 < this.field298 && this.field299 / 20 < var1) {
            var1 = this.field299 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field297[var3] != null) {
                this.field297[var3].field2783 -= var1 * 20;
            }
        }
        if (this.field299 < this.field298) {
            this.field299 -= var1 * 20;
            this.field298 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lve;II)Lbd;")
    public static final class16 method142(class225 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1466(arg1, arg2, (byte) -119);
        return var3 == null ? null : new class16(new class66(var3));
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lfj;)V")
    private class16(class66 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method506(255);
            if (var3 != 0) {
                arg0.field1195--;
                this.field297[var2] = new class161();
                this.field297[var2].method1043(arg0);
            }
        }
        this.field299 = arg0.method500(42);
        this.field298 = arg0.method500(41);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    private class16() {
    }
}
