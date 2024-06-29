import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class307 {

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "[Lsfa;")
    private class198[] field4447 = new class198[10];

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "I")
    private int field4448;

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "()Lfk;", line = 7)
    public final class348 method1995() {
        byte[] var1 = this.method1997();
        return new class348(22050, var1, this.field4448 * 22050 / 1000, this.field4449 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "()I", line = 14)
    public final int method1996() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4447[var2] != null && this.field4447[var2].field2803 / 20 < var1) {
                var1 = this.field4447[var2].field2803 / 20;
            }
        }
        if (this.field4448 < this.field4449 && this.field4448 / 20 < var1) {
            var1 = this.field4448 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4447[var3] != null) {
                this.field4447[var3].field2803 -= var1 * 20;
            }
        }
        if (this.field4448 < this.field4449) {
            this.field4448 -= var1 * 20;
            this.field4449 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "()[B", line = 57)
    private final byte[] method1997() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4447[var2] != null && this.field4447[var2].field2803 + this.field4447[var2].field2792 > var1) {
                var1 = this.field4447[var2].field2803 + this.field4447[var2].field2792;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4447[var5] != null) {
                int var6 = this.field4447[var5].field2792 * 22050 / 1000;
                int var7 = this.field4447[var5].field2803 * 22050 / 1000;
                int[] var8 = this.field4447[var5].method1288(var6, this.field4447[var5].field2792);
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

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lgga;)V", line = 128)
    private class307(class511 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3013(127);
            if (var3 != 0) {
                arg0.field6962--;
                this.field4447[var2] = new class198();
                this.field4447[var2].method1287(arg0);
            }
        }
        this.field4448 = arg0.method3002(-1);
        this.field4449 = arg0.method3002(-1);
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V", line = 148)
    private class307() {
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lae;II)Lhaa;", line = 122)
    public static final class307 method1998(class283 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1849(arg2, (byte) -88, arg1);
        return var3 == null ? null : new class307(new class511(var3));
    }
}
