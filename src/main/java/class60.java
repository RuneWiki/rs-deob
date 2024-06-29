import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class60 {

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "[Lbba;")
    private class379[] field844 = new class379[10];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "()Lar;", line = 4)
    public final class4 method481() {
        byte[] var1 = this.method484();
        return new class4(22050, var1, this.field843 * 22050 / 1000, this.field845 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "()I", line = 9)
    public final int method482() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field844[var2] != null && this.field844[var2].field5567 / 20 < var1) {
                var1 = this.field844[var2].field5567 / 20;
            }
        }
        if (this.field843 < this.field845 && this.field843 / 20 < var1) {
            var1 = this.field843 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field844[var3] != null) {
                this.field844[var3].field5567 -= var1 * 20;
            }
        }
        if (this.field843 < this.field845) {
            this.field843 -= var1 * 20;
            this.field845 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lco;)V", line = 69)
    private class60(class268 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1738(255);
            if (var3 != 0) {
                arg0.field3913--;
                this.field844[var2] = new class379();
                this.field844[var2].method2301(arg0);
            }
        }
        this.field843 = arg0.method1745(32132);
        this.field845 = arg0.method1745(32132);
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 90)
    private class60() {
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lgp;II)Lmn;", line = 59)
    public static final class60 method483(class561 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3175(arg2, (byte) -53, arg1);
        return var3 == null ? null : new class60(new class268(var3));
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "()[B", line = 94)
    private final byte[] method484() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field844[var2] != null && this.field844[var2].field5580 + this.field844[var2].field5567 > var1) {
                var1 = this.field844[var2].field5580 + this.field844[var2].field5567;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field844[var5] != null) {
                int var6 = this.field844[var5].field5580 * 22050 / 1000;
                int var7 = this.field844[var5].field5567 * 22050 / 1000;
                int[] var8 = this.field844[var5].method2300(var6, this.field844[var5].field5580);
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
}
