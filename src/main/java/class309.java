import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class309 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[Lua;")
    private class262[] field5244 = new class262[10];

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    private int field5242;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()Lbd;", line = 5)
    public final class198 method2149() {
        byte[] var1 = this.method2151();
        return new class198(22050, var1, this.field5242 * 22050 / 1000, this.field5243 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lva;)V", line = 61)
    private class309(class235 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1589(124);
            if (var3 != 0) {
                arg0.field4051--;
                this.field5244[var2] = new class262();
                this.field5244[var2].method1838(arg0);
            }
        }
        this.field5242 = arg0.method1615(-125);
        this.field5243 = arg0.method1615(-122);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 141)
    private class309() {
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()I", line = 20)
    public final int method2150() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5244[var2] != null && this.field5244[var2].field4551 / 20 < var1) {
                var1 = this.field5244[var2].field4551 / 20;
            }
        }
        if (this.field5242 < this.field5243 && this.field5242 / 20 < var1) {
            var1 = this.field5242 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5244[var3] != null) {
                this.field5244[var3].field4551 -= var1 * 20;
            }
        }
        if (this.field5242 < this.field5243) {
            this.field5242 -= var1 * 20;
            this.field5243 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()[B", line = 83)
    private final byte[] method2151() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5244[var2] != null && this.field5244[var2].field4552 + this.field5244[var2].field4551 > var1) {
                var1 = this.field5244[var2].field4552 + this.field5244[var2].field4551;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5244[var5] != null) {
                int var6 = this.field5244[var5].field4552 * 22050 / 1000;
                int var7 = this.field5244[var5].field4551 * 22050 / 1000;
                int[] var8 = this.field5244[var5].method1837(var6, this.field5244[var5].field4552);
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

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lgb;II)Lwh;", line = 145)
    public static final class309 method2152(class213 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1453(arg1, (byte) -79, arg2);
        return var3 == null ? null : new class309(new class235(var3));
    }
}
