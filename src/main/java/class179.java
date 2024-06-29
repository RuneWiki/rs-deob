import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class179 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[Lrc;")
    private class309[] field3015 = new class309[10];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lcb;II)Lvc;", line = 5)
    public static final class179 method1317(class267 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1911(arg1, arg2, -66);
        return var3 == null ? null : new class179(new class60(var3));
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I", line = 13)
    public final int method1318() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3015[var2] != null && this.field3015[var2].field5255 / 20 < var1) {
                var1 = this.field3015[var2].field5255 / 20;
            }
        }
        if (this.field3016 < this.field3014 && this.field3016 / 20 < var1) {
            var1 = this.field3016 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3015[var3] != null) {
                this.field3015[var3].field5255 -= var1 * 20;
            }
        }
        if (this.field3016 < this.field3014) {
            this.field3016 -= var1 * 20;
            this.field3014 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()Ltd;", line = 56)
    public final class227 method1319() {
        byte[] var1 = this.method1320();
        return new class227(22050, var1, this.field3016 * 22050 / 1000, this.field3014 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()[B", line = 61)
    private final byte[] method1320() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3015[var2] != null && this.field3015[var2].field5255 + this.field3015[var2].field5248 > var1) {
                var1 = this.field3015[var2].field5255 + this.field3015[var2].field5248;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3015[var5] != null) {
                int var6 = this.field3015[var5].field5248 * 22050 / 1000;
                int var7 = this.field3015[var5].field5255 * 22050 / 1000;
                int[] var8 = this.field3015[var5].method2106(var6, this.field3015[var5].field5248);
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

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lja;)V", line = 129)
    private class179(class60 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method501(0);
            if (var3 != 0) {
                arg0.field1012--;
                this.field3015[var2] = new class309();
                this.field3015[var2].method2105(arg0);
            }
        }
        this.field3016 = arg0.method485((byte) -2);
        this.field3014 = arg0.method485((byte) -2);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 149)
    private class179() {
    }
}
