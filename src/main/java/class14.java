import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[Lrf;")
    private class91[] field217 = new class91[10];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Laj;II)Lma;")
    public static final class14 method102(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2095(arg2, arg1, 1);
        return var3 == null ? null : new class14(new class376(var3));
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()I")
    public final int method103() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field217[var2] != null && this.field217[var2].field1247 / 20 < var1) {
                var1 = this.field217[var2].field1247 / 20;
            }
        }
        if (this.field218 < this.field219 && this.field218 / 20 < var1) {
            var1 = this.field218 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field217[var3] != null) {
                this.field217[var3].field1247 -= var1 * 20;
            }
        }
        if (this.field218 < this.field219) {
            this.field218 -= var1 * 20;
            this.field219 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()[B")
    private final byte[] method104() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field217[var2] != null && this.field217[var2].field1247 + this.field217[var2].field1246 > var1) {
                var1 = this.field217[var2].field1247 + this.field217[var2].field1246;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field217[var5] != null) {
                int var6 = this.field217[var5].field1246 * 22050 / 1000;
                int var7 = this.field217[var5].field1247 * 22050 / 1000;
                int[] var8 = this.field217[var5].method730(var6, this.field217[var5].field1246);
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

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()Lks;")
    public final class465 method105() {
        byte[] var1 = this.method104();
        return new class465(22050, var1, this.field218 * 22050 / 1000, this.field219 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljp;)V")
    private class14(class376 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 != 0) {
                arg0.field5459--;
                this.field217[var2] = new class91();
                this.field217[var2].method732(arg0);
            }
        }
        this.field218 = arg0.method2359(-1);
        this.field219 = arg0.method2359(-1);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    private class14() {
    }
}
