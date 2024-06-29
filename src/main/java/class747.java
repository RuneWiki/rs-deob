import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class747 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "[Lofa;")
    private class330[] field10456 = new class330[10];

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    private int field10455;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    private int field10457;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()[B")
    private final byte[] method4172() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field10456[var2] != null && this.field10456[var2].field4717 + this.field10456[var2].field4706 > var1) {
                var1 = this.field10456[var2].field4717 + this.field10456[var2].field4706;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field10456[var5] != null) {
                int var6 = this.field10456[var5].field4706 * 22050 / 1000;
                int var7 = this.field10456[var5].field4717 * 22050 / 1000;
                int[] var8 = this.field10456[var5].method2090(var6, this.field10456[var5].field4706);
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

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "()I")
    public final int method4173() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field10456[var2] != null && this.field10456[var2].field4717 / 20 < var1) {
                var1 = this.field10456[var2].field4717 / 20;
            }
        }
        if (this.field10455 < this.field10457 && this.field10455 / 20 < var1) {
            var1 = this.field10455 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field10456[var3] != null) {
                this.field10456[var3].field4717 -= var1 * 20;
            }
        }
        if (this.field10455 < this.field10457) {
            this.field10455 -= var1 * 20;
            this.field10457 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lvd;II)Lpn;")
    public static final class747 method4174(class39 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method211(true, arg1, arg2);
        return var3 == null ? null : new class747(new class645(var3));
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "()Lut;")
    public final class125 method4175() {
        byte[] var1 = this.method4172();
        return new class125(22050, var1, this.field10455 * 22050 / 1000, this.field10457 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lrg;)V")
    private class747(class645 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3745(-6314);
            if (var3 != 0) {
                arg0.field9084--;
                this.field10456[var2] = new class330();
                this.field10456[var2].method2089(arg0);
            }
        }
        this.field10455 = arg0.method3712((byte) 58);
        this.field10457 = arg0.method3712((byte) -107);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    private class747() {
    }
}
