import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class642 {

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[Llaa;")
    private class122[] field8832 = new class122[10];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    private int field8830;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    private int field8831;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()Lob;")
    public final class735 method3640() {
        byte[] var1 = this.method3642();
        return new class735(22050, var1, this.field8830 * 22050 / 1000, this.field8831 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()I")
    public final int method3641() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8832[var2] != null && this.field8832[var2].field2088 / 20 < var1) {
                var1 = this.field8832[var2].field2088 / 20;
            }
        }
        if (this.field8830 < this.field8831 && this.field8830 / 20 < var1) {
            var1 = this.field8830 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field8832[var3] != null) {
                this.field8832[var3].field2088 -= var1 * 20;
            }
        }
        if (this.field8830 < this.field8831) {
            this.field8830 -= var1 * 20;
            this.field8831 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()[B")
    private final byte[] method3642() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8832[var2] != null && this.field8832[var2].field2102 + this.field8832[var2].field2088 > var1) {
                var1 = this.field8832[var2].field2102 + this.field8832[var2].field2088;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field8832[var5] != null) {
                int var6 = this.field8832[var5].field2102 * 22050 / 1000;
                int var7 = this.field8832[var5].field2088 * 22050 / 1000;
                int[] var8 = this.field8832[var5].method1053(var6, this.field8832[var5].field2102);
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

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lcea;)V")
    private class642(class215 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1535(255);
            if (var3 != 0) {
                arg0.field3109--;
                this.field8832[var2] = new class122();
                this.field8832[var2].method1051(arg0);
            }
        }
        this.field8830 = arg0.method1478(842397944);
        this.field8831 = arg0.method1478(842397944);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    private class642() {
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lin;II)Lck;")
    public static final class642 method3643(class91 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method863(-1860, arg1, arg2);
        return var3 == null ? null : new class642(new class215(var3));
    }
}
