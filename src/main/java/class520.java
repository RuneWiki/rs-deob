import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class520 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[Liha;")
    private class704[] field7300 = new class704[10];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field7301;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    private int field7302;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()[B")
    private final byte[] method3055() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7300[var2] != null && this.field7300[var2].field9868 + this.field7300[var2].field9863 > var1) {
                var1 = this.field7300[var2].field9868 + this.field7300[var2].field9863;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field7300[var5] != null) {
                int var6 = this.field7300[var5].field9863 * 22050 / 1000;
                int var7 = this.field7300[var5].field9868 * 22050 / 1000;
                int[] var8 = this.field7300[var5].method3940(var6, this.field7300[var5].field9863);
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

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()Lud;")
    public final class101 method3056() {
        byte[] var1 = this.method3055();
        return new class101(22050, var1, this.field7301 * 22050 / 1000, this.field7302 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lgga;II)Lgb;")
    public static final class520 method3057(class513 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3019(arg1, arg2, 105);
        return var3 == null ? null : new class520(new class431(var3));
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()I")
    public final int method3058() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7300[var2] != null && this.field7300[var2].field9868 / 20 < var1) {
                var1 = this.field7300[var2].field9868 / 20;
            }
        }
        if (this.field7301 < this.field7302 && this.field7301 / 20 < var1) {
            var1 = this.field7301 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field7300[var3] != null) {
                this.field7300[var3].field9868 -= var1 * 20;
            }
        }
        if (this.field7301 < this.field7302) {
            this.field7301 -= var1 * 20;
            this.field7302 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lol;)V")
    private class520(class431 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2557(14929);
            if (var3 != 0) {
                arg0.field5983--;
                this.field7300[var2] = new class704();
                this.field7300[var2].method3939(arg0);
            }
        }
        this.field7301 = arg0.method2565((byte) -126);
        this.field7302 = arg0.method2565((byte) -89);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    private class520() {
    }
}
