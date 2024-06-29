import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class44 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[Luo;")
    private class385[] field662 = new class385[10];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    private int field664;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()[B", line = 9)
    private final byte[] method325() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field662[var2] != null && this.field662[var2].field5778 + this.field662[var2].field5766 > var1) {
                var1 = this.field662[var2].field5778 + this.field662[var2].field5766;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field662[var5] != null) {
                int var6 = this.field662[var5].field5778 * 22050 / 1000;
                int var7 = this.field662[var5].field5766 * 22050 / 1000;
                int[] var8 = this.field662[var5].method2524(var6, this.field662[var5].field5778);
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

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I", line = 68)
    public final int method326() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field662[var2] != null && this.field662[var2].field5766 / 20 < var1) {
                var1 = this.field662[var2].field5766 / 20;
            }
        }
        if (this.field663 < this.field664 && this.field663 / 20 < var1) {
            var1 = this.field663 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field662[var3] != null) {
                this.field662[var3].field5766 -= var1 * 20;
            }
        }
        if (this.field663 < this.field664) {
            this.field663 -= var1 * 20;
            this.field664 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()Lok;", line = 114)
    public final class61 method327() {
        byte[] var1 = this.method325();
        return new class61(22050, var1, this.field663 * 22050 / 1000, this.field664 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lil;)V", line = 120)
    private class44(class265 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1697(-82);
            if (var3 != 0) {
                arg0.field3915--;
                this.field662[var2] = new class385();
                this.field662[var2].method2523(arg0);
            }
        }
        this.field663 = arg0.method1685(8104);
        this.field664 = arg0.method1685(8104);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 148)
    private class44() {
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lqj;II)Lbe;", line = 142)
    public static final class44 method328(class238 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1472(arg2, arg1, 0);
        return var3 == null ? null : new class44(new class265(var3));
    }
}
