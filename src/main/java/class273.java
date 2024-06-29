import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class273 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "[Lia;")
    private class587[] field3363 = new class587[10];

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    private int field3361;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
    private int field3362;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "()Lcba;")
    public final class548 method1618() {
        byte[] var1 = this.method1621();
        return new class548(22050, var1, this.field3361 * 22050 / 1000, this.field3362 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Loh;II)Lvea;")
    public static final class273 method1619(class404 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2481(arg1, arg2, (byte) 120);
        return var3 == null ? null : new class273(new class244(var3));
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "()I")
    public final int method1620() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3363[var2] != null && this.field3363[var2].field8273 / 20 < var1) {
                var1 = this.field3363[var2].field8273 / 20;
            }
        }
        if (this.field3361 < this.field3362 && this.field3361 / 20 < var1) {
            var1 = this.field3361 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3363[var3] != null) {
                this.field3363[var3].field8273 -= var1 * 20;
            }
        }
        if (this.field3361 < this.field3362) {
            this.field3361 -= var1 * 20;
            this.field3362 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "()[B")
    private final byte[] method1621() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3363[var2] != null && this.field3363[var2].field8273 + this.field3363[var2].field8272 > var1) {
                var1 = this.field3363[var2].field8273 + this.field3363[var2].field8272;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3363[var5] != null) {
                int var6 = this.field3363[var5].field8272 * 22050 / 1000;
                int var7 = this.field3363[var5].field8273 * 22050 / 1000;
                int[] var8 = this.field3363[var5].method3367(var6, this.field3363[var5].field8272);
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

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lig;)V")
    private class273(class244 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1423(-53);
            if (var3 != 0) {
                arg0.field2903--;
                this.field3363[var2] = new class587();
                this.field3363[var2].method3366(arg0);
            }
        }
        this.field3361 = arg0.method1476(-119);
        this.field3362 = arg0.method1476(79);
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
    private class273() {
    }
}
