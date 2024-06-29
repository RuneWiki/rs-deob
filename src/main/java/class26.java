import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "[Las;")
    private class132[] field187 = new class132[10];

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "()[B")
    private final byte[] method157() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field187[var2] != null && this.field187[var2].field1610 + this.field187[var2].field1608 > var1) {
                var1 = this.field187[var2].field1610 + this.field187[var2].field1608;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field187[var5] != null) {
                int var6 = this.field187[var5].field1610 * 22050 / 1000;
                int var7 = this.field187[var5].field1608 * 22050 / 1000;
                int[] var8 = this.field187[var5].method743(var6, this.field187[var5].field1610);
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

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "()Lmr;")
    public final class123 method158() {
        byte[] var1 = this.method157();
        return new class123(22050, var1, this.field189 * 22050 / 1000, this.field188 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ldn;II)Lqaa;")
    public static final class26 method159(class438 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2558(100, arg2, arg1);
        return var3 == null ? null : new class26(new class374(var3));
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "()I")
    public final int method160() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field187[var2] != null && this.field187[var2].field1608 / 20 < var1) {
                var1 = this.field187[var2].field1608 / 20;
            }
        }
        if (this.field189 < this.field188 && this.field189 / 20 < var1) {
            var1 = this.field189 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field187[var3] != null) {
                this.field187[var3].field1608 -= var1 * 20;
            }
        }
        if (this.field189 < this.field188) {
            this.field189 -= var1 * 20;
            this.field188 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Los;)V")
    private class26(class374 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2129(-77);
            if (var3 != 0) {
                arg0.field4966--;
                this.field187[var2] = new class132();
                this.field187[var2].method744(arg0);
            }
        }
        this.field189 = arg0.method2136(false);
        this.field188 = arg0.method2136(false);
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
    private class26() {
    }
}
