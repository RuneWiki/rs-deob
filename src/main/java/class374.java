import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class374 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "[Ljb;")
    private class224[] field5508 = new class224[10];

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    private int field5507;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    private int field5509;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lir;II)Lnh;")
    public static final class374 method2455(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1235(arg1, false, arg2);
        return var3 == null ? null : new class374(new class341(var3));
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()[B")
    private final byte[] method2456() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5508[var2] != null && this.field5508[var2].field3083 + this.field5508[var2].field3077 > var1) {
                var1 = this.field5508[var2].field3083 + this.field5508[var2].field3077;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5508[var5] != null) {
                int var6 = this.field5508[var5].field3083 * 22050 / 1000;
                int var7 = this.field5508[var5].field3077 * 22050 / 1000;
                int[] var8 = this.field5508[var5].method1461(var6, this.field5508[var5].field3083);
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

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()Lhh;")
    public final class151 method2457() {
        byte[] var1 = this.method2456();
        return new class151(22050, var1, this.field5507 * 22050 / 1000, this.field5509 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "()I")
    public final int method2458() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5508[var2] != null && this.field5508[var2].field3077 / 20 < var1) {
                var1 = this.field5508[var2].field3077 / 20;
            }
        }
        if (this.field5507 < this.field5509 && this.field5507 / 20 < var1) {
            var1 = this.field5507 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5508[var3] != null) {
                this.field5508[var3].field3077 -= var1 * 20;
            }
        }
        if (this.field5507 < this.field5509) {
            this.field5507 -= var1 * 20;
            this.field5509 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lfb;)V")
    private class374(class341 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 != 0) {
                arg0.field5049--;
                this.field5508[var2] = new class224();
                this.field5508[var2].method1460(arg0);
            }
        }
        this.field5507 = arg0.method2239(-1076227960);
        this.field5509 = arg0.method2239(-1076227960);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    private class374() {
    }
}
