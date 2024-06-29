import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class362 {

    @OriginalMember(owner = "client!um", name = "c", descriptor = "[Lpl;")
    private class459[] field5038 = new class459[10];

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    private int field5036;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()[B", line = 6)
    private final byte[] method2164() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5038[var2] != null && this.field5038[var2].field6731 + this.field5038[var2].field6722 > var1) {
                var1 = this.field5038[var2].field6731 + this.field5038[var2].field6722;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5038[var5] != null) {
                int var6 = this.field5038[var5].field6722 * 22050 / 1000;
                int var7 = this.field5038[var5].field6731 * 22050 / 1000;
                int[] var8 = this.field5038[var5].method2759(var6, this.field5038[var5].field6722);
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

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Liv;)V", line = 129)
    private class362(class65 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method577(255);
            if (var3 != 0) {
                arg0.field827--;
                this.field5038[var2] = new class459();
                this.field5038[var2].method2757(arg0);
            }
        }
        this.field5036 = arg0.method623((byte) -29);
        this.field5037 = arg0.method623((byte) 121);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 149)
    private class362() {
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lfs;II)Lum;", line = 71)
    public static final class362 method2165(class387 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2363(arg2, arg1, 111);
        return var3 == null ? null : new class362(new class65(var3));
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()Ljs;", line = 82)
    public final class217 method2166() {
        byte[] var1 = this.method2164();
        return new class217(22050, var1, this.field5036 * 22050 / 1000, this.field5037 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "()I", line = 88)
    public final int method2167() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5038[var2] != null && this.field5038[var2].field6731 / 20 < var1) {
                var1 = this.field5038[var2].field6731 / 20;
            }
        }
        if (this.field5036 < this.field5037 && this.field5036 / 20 < var1) {
            var1 = this.field5036 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5038[var3] != null) {
                this.field5038[var3].field6731 -= var1 * 20;
            }
        }
        if (this.field5036 < this.field5037) {
            this.field5036 -= var1 * 20;
            this.field5037 -= var1 * 20;
        }
        return var1;
    }
}
