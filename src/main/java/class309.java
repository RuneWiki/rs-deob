import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class309 {

    @OriginalMember(owner = "client!im", name = "a", descriptor = "[Lsk;")
    private class204[] field4981 = new class204[10];

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    private int field4983;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    private int field4982;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Laj;II)Lim;")
    public static final class309 method2080(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1149(arg1, (byte) 26, arg2);
        return var3 == null ? null : new class309(new class249(var3));
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()I")
    public final int method2081() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4981[var2] != null && this.field4981[var2].field3272 / 20 < var1) {
                var1 = this.field4981[var2].field3272 / 20;
            }
        }
        if (this.field4983 < this.field4982 && this.field4983 / 20 < var1) {
            var1 = this.field4983 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4981[var3] != null) {
                this.field4981[var3].field3272 -= var1 * 20;
            }
        }
        if (this.field4983 < this.field4982) {
            this.field4983 -= var1 * 20;
            this.field4982 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()Lti;")
    public final class178 method2082() {
        byte[] var1 = this.method2083();
        return new class178(22050, var1, this.field4983 * 22050 / 1000, this.field4982 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "()[B")
    private final byte[] method2083() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4981[var2] != null && this.field4981[var2].field3272 + this.field4981[var2].field3262 > var1) {
                var1 = this.field4981[var2].field3272 + this.field4981[var2].field3262;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4981[var5] != null) {
                int var6 = this.field4981[var5].field3262 * 22050 / 1000;
                int var7 = this.field4981[var5].field3272 * 22050 / 1000;
                int[] var8 = this.field4981[var5].method1424(var6, this.field4981[var5].field3262);
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

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lab;)V")
    private class309(class249 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1802((byte) -107);
            if (var3 != 0) {
                arg0.field4160--;
                this.field4981[var2] = new class204();
                this.field4981[var2].method1423(arg0);
            }
        }
        this.field4983 = arg0.method1821((byte) 51);
        this.field4982 = arg0.method1821((byte) 51);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
    private class309() {
    }
}
