import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class189 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lsa;")
    private class171[] field3824 = new class171[10];

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    private int field3825;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()[B")
    private final byte[] method1246() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3824[var2] != null && this.field3824[var2].field3430 + this.field3824[var2].field3417 > var1) {
                var1 = this.field3824[var2].field3430 + this.field3824[var2].field3417;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3824[var5] != null) {
                int var6 = this.field3824[var5].field3417 * 22050 / 1000;
                int var7 = this.field3824[var5].field3430 * 22050 / 1000;
                int[] var8 = this.field3824[var5].method1116(var6, this.field3824[var5].field3417);
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

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lag;II)Lua;")
    public static final class189 method1247(class8 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method39(arg1, -1, arg2);
        return var3 == null ? null : new class189(new class26(var3));
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()I")
    public final int method1248() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3824[var2] != null && this.field3824[var2].field3430 / 20 < var1) {
                var1 = this.field3824[var2].field3430 / 20;
            }
        }
        if (this.field3825 < this.field3826 && this.field3825 / 20 < var1) {
            var1 = this.field3825 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3824[var3] != null) {
                this.field3824[var3].field3430 -= var1 * 20;
            }
        }
        if (this.field3825 < this.field3826) {
            this.field3825 -= var1 * 20;
            this.field3826 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lce;)V")
    private class189(class26 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method221(-93);
            if (var3 != 0) {
                arg0.field527--;
                this.field3824[var2] = new class171();
                this.field3824[var2].method1114(arg0);
            }
        }
        this.field3825 = arg0.method256((byte) -78);
        this.field3826 = arg0.method256((byte) -78);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()Lai;")
    public final class10 method1249() {
        byte[] var1 = this.method1246();
        return new class10(22050, var1, this.field3825 * 22050 / 1000, this.field3826 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    private class189() {
    }
}
