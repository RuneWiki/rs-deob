import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class103 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "[Lgb;")
    private class251[] field1713 = new class251[10];

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    private int field1712;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()Lee;")
    public final class150 method692() {
        byte[] var1 = this.method694();
        return new class150(22050, var1, this.field1711 * 22050 / 1000, this.field1712 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "()I")
    public final int method693() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1713[var2] != null && this.field1713[var2].field4395 / 20 < var1) {
                var1 = this.field1713[var2].field4395 / 20;
            }
        }
        if (this.field1711 < this.field1712 && this.field1711 / 20 < var1) {
            var1 = this.field1711 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1713[var3] != null) {
                this.field1713[var3].field4395 -= var1 * 20;
            }
        }
        if (this.field1711 < this.field1712) {
            this.field1711 -= var1 * 20;
            this.field1712 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "()[B")
    private final byte[] method694() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1713[var2] != null && this.field1713[var2].field4395 + this.field1713[var2].field4386 > var1) {
                var1 = this.field1713[var2].field4395 + this.field1713[var2].field4386;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1713[var5] != null) {
                int var6 = this.field1713[var5].field4386 * 22050 / 1000;
                int var7 = this.field1713[var5].field4395 * 22050 / 1000;
                int[] var8 = this.field1713[var5].method1714(var6, this.field1713[var5].field4386);
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

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljb;II)Lgf;")
    public static final class103 method695(class11 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method89(arg2, arg1, 110);
        return var3 == null ? null : new class103(new class230(var3));
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lvf;)V")
    private class103(class230 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1516((byte) 82);
            if (var3 != 0) {
                arg0.field3933--;
                this.field1713[var2] = new class251();
                this.field1713[var2].method1712(arg0);
            }
        }
        this.field1711 = arg0.method1535(2);
        this.field1712 = arg0.method1535(2);
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    private class103() {
    }
}
