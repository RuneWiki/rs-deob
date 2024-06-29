import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class71 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "[Lji;")
    private class431[] field1199 = new class431[10];

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "()I")
    public final int method600() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1199[var2] != null && this.field1199[var2].field6284 / 20 < var1) {
                var1 = this.field1199[var2].field6284 / 20;
            }
        }
        if (this.field1201 < this.field1200 && this.field1201 / 20 < var1) {
            var1 = this.field1201 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1199[var3] != null) {
                this.field1199[var3].field6284 -= var1 * 20;
            }
        }
        if (this.field1201 < this.field1200) {
            this.field1201 -= var1 * 20;
            this.field1200 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "()[B")
    private final byte[] method601() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1199[var2] != null && this.field1199[var2].field6284 + this.field1199[var2].field6280 > var1) {
                var1 = this.field1199[var2].field6284 + this.field1199[var2].field6280;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1199[var5] != null) {
                int var6 = this.field1199[var5].field6280 * 22050 / 1000;
                int var7 = this.field1199[var5].field6284 * 22050 / 1000;
                int[] var8 = this.field1199[var5].method2618(var6, this.field1199[var5].field6280);
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

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "()Lbv;")
    public final class199 method602() {
        byte[] var1 = this.method601();
        return new class199(22050, var1, this.field1201 * 22050 / 1000, this.field1200 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lhh;II)Lrv;")
    public static final class71 method603(class84 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method683(arg1, arg2, 5);
        return var3 == null ? null : new class71(new class303(var3));
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lti;)V")
    private class71(class303 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1918((byte) -40);
            if (var3 != 0) {
                arg0.field4333--;
                this.field1199[var2] = new class431();
                this.field1199[var2].method2617(arg0);
            }
        }
        this.field1201 = arg0.method1868(0);
        this.field1200 = arg0.method1868(0);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
    private class71() {
    }
}
