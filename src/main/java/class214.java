import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class214 {

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "[Lsm;")
    private class282[] field2817 = new class282[10];

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    private int field2815;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "()Lnp;")
    public final class490 method1312() {
        byte[] var1 = this.method1313();
        return new class490(22050, var1, this.field2816 * 22050 / 1000, this.field2815 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "()[B")
    private final byte[] method1313() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2817[var2] != null && this.field2817[var2].field4007 + this.field2817[var2].field4005 > var1) {
                var1 = this.field2817[var2].field4007 + this.field2817[var2].field4005;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2817[var5] != null) {
                int var6 = this.field2817[var5].field4005 * 22050 / 1000;
                int var7 = this.field2817[var5].field4007 * 22050 / 1000;
                int[] var8 = this.field2817[var5].method1852(var6, this.field2817[var5].field4005);
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

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lfp;II)Lsba;")
    public static final class214 method1314(class323 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2100(arg2, (byte) 112, arg1);
        return var3 == null ? null : new class214(new class675(var3));
    }

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "()I")
    public final int method1315() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2817[var2] != null && this.field2817[var2].field4007 / 20 < var1) {
                var1 = this.field2817[var2].field4007 / 20;
            }
        }
        if (this.field2816 < this.field2815 && this.field2816 / 20 < var1) {
            var1 = this.field2816 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2817[var3] != null) {
                this.field2817[var3].field4007 -= var1 * 20;
            }
        }
        if (this.field2816 < this.field2815) {
            this.field2816 -= var1 * 20;
            this.field2815 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lee;)V")
    private class214(class675 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 != 0) {
                arg0.field9146--;
                this.field2817[var2] = new class282();
                this.field2817[var2].method1854(arg0);
            }
        }
        this.field2816 = arg0.method3757((byte) -65);
        this.field2815 = arg0.method3757((byte) -65);
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V")
    private class214() {
    }
}
