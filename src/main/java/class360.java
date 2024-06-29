import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class360 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "[Lsk;")
    private class176[] field5229 = new class176[10];

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    private int field5227;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    private int field5228;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "()I")
    public final int method2287() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5229[var2] != null && this.field5229[var2].field2439 / 20 < var1) {
                var1 = this.field5229[var2].field2439 / 20;
            }
        }
        if (this.field5227 < this.field5228 && this.field5227 / 20 < var1) {
            var1 = this.field5227 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5229[var3] != null) {
                this.field5229[var3].field2439 -= var1 * 20;
            }
        }
        if (this.field5227 < this.field5228) {
            this.field5227 -= var1 * 20;
            this.field5228 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "()Lua;")
    public final class179 method2288() {
        byte[] var1 = this.method2289();
        return new class179(22050, var1, this.field5227 * 22050 / 1000, this.field5228 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "()[B")
    private final byte[] method2289() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5229[var2] != null && this.field5229[var2].field2439 + this.field5229[var2].field2433 > var1) {
                var1 = this.field5229[var2].field2439 + this.field5229[var2].field2433;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5229[var5] != null) {
                int var6 = this.field5229[var5].field2433 * 22050 / 1000;
                int var7 = this.field5229[var5].field2439 * 22050 / 1000;
                int[] var8 = this.field5229[var5].method1225(var6, this.field5229[var5].field2433);
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

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lct;II)Lfs;")
    public static final class360 method2290(class104 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method715(arg2, (byte) 68, arg1);
        return var3 == null ? null : new class360(new class256(var3));
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lat;)V")
    private class360(class256 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1738((byte) 114);
            if (var3 != 0) {
                arg0.field3762--;
                this.field5229[var2] = new class176();
                this.field5229[var2].method1226(arg0);
            }
        }
        this.field5227 = arg0.method1767(1930493576);
        this.field5228 = arg0.method1767(1930493576);
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    private class360() {
    }
}
