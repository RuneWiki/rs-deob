import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lcf;")
    private class21[] field288 = new class21[10];

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
    public final int method97() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field288[var2] != null && this.field288[var2].field463 / 20 < var1) {
                var1 = this.field288[var2].field463 / 20;
            }
        }
        if (this.field289 < this.field290 && this.field289 / 20 < var1) {
            var1 = this.field289 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field288[var3] != null) {
                this.field288[var3].field463 -= var1 * 20;
            }
        }
        if (this.field289 < this.field290) {
            this.field289 -= var1 * 20;
            this.field290 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()[B")
    private final byte[] method98() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field288[var2] != null && this.field288[var2].field463 + this.field288[var2].field455 > var1) {
                var1 = this.field288[var2].field463 + this.field288[var2].field455;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field288[var5] != null) {
                int var6 = this.field288[var5].field455 * 22050 / 1000;
                int var7 = this.field288[var5].field463 * 22050 / 1000;
                int[] var8 = this.field288[var5].method161(var6, this.field288[var5].field455);
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lc;II)Lbf;")
    public static final class14 method99(class15 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method114((byte) -55, arg1, arg2);
        return var3 == null ? null : new class14(new class138(var3));
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ltf;)V")
    private class14(class138 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1055(124);
            if (var3 != 0) {
                arg0.field3175--;
                this.field288[var2] = new class21();
                this.field288[var2].method160(arg0);
            }
        }
        this.field289 = arg0.method1098(true);
        this.field290 = arg0.method1098(true);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    private class14() {
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lre;")
    public final class123 method100() {
        byte[] var1 = this.method98();
        return new class123(22050, var1, this.field289 * 22050 / 1000, this.field290 * 22050 / 1000);
    }
}
