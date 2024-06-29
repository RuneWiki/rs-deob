import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class544 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[Lqs;")
    private class518[] field7555 = new class518[10];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    private int field7557;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    private int field7556;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lke;")
    public final class514 method3108() {
        byte[] var1 = this.method3110();
        return new class514(22050, var1, this.field7557 * 22050 / 1000, this.field7556 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lan;II)Lgj;")
    public static final class544 method3109(class21 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method240(arg1, arg2, (byte) -124);
        return var3 == null ? null : new class544(new class11(var3));
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()[B")
    private final byte[] method3110() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7555[var2] != null && this.field7555[var2].field7278 + this.field7555[var2].field7272 > var1) {
                var1 = this.field7555[var2].field7278 + this.field7555[var2].field7272;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field7555[var5] != null) {
                int var6 = this.field7555[var5].field7278 * 22050 / 1000;
                int var7 = this.field7555[var5].field7272 * 22050 / 1000;
                int[] var8 = this.field7555[var5].method2988(var6, this.field7555[var5].field7278);
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

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()I")
    public final int method3111() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field7555[var2] != null && this.field7555[var2].field7272 / 20 < var1) {
                var1 = this.field7555[var2].field7272 / 20;
            }
        }
        if (this.field7557 < this.field7556 && this.field7557 / 20 < var1) {
            var1 = this.field7557 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field7555[var3] != null) {
                this.field7555[var3].field7272 -= var1 * 20;
            }
        }
        if (this.field7557 < this.field7556) {
            this.field7557 -= var1 * 20;
            this.field7556 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Ldaa;)V")
    private class544(class11 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method110((byte) 26);
            if (var3 != 0) {
                arg0.field165--;
                this.field7555[var2] = new class518();
                this.field7555[var2].method2986(arg0);
            }
        }
        this.field7557 = arg0.method93((byte) 126);
        this.field7556 = arg0.method93((byte) 76);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    private class544() {
    }
}
