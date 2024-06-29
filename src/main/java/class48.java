import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class48 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[Lb;")
    private class11[] field780 = new class11[10];

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljg;II)Lf;")
    public static final class48 method257(class89 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method461(arg1, (byte) 100, arg2);
        return var3 == null ? null : new class48(new class158(var3));
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public final int method258() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field780[var2] != null && this.field780[var2].field183 / 20 < var1) {
                var1 = this.field780[var2].field183 / 20;
            }
        }
        if (this.field781 < this.field779 && this.field781 / 20 < var1) {
            var1 = this.field781 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field780[var3] != null) {
                this.field780[var3].field183 -= var1 * 20;
            }
        }
        if (this.field781 < this.field779) {
            this.field781 -= var1 * 20;
            this.field779 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()[B")
    private final byte[] method259() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field780[var2] != null && this.field780[var2].field183 + this.field780[var2].field171 > var1) {
                var1 = this.field780[var2].field183 + this.field780[var2].field171;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field780[var5] != null) {
                int var6 = this.field780[var5].field171 * 22050 / 1000;
                int var7 = this.field780[var5].field183 * 22050 / 1000;
                int[] var8 = this.field780[var5].method59(var6, this.field780[var5].field171);
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

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lrd;)V")
    private class48(class158 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1054(128);
            if (var3 != 0) {
                arg0.field3153--;
                this.field780[var2] = new class11();
                this.field780[var2].method56(arg0);
            }
        }
        this.field781 = arg0.method1071(28101);
        this.field779 = arg0.method1071(28101);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    private class48() {
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()Lwc;")
    public final class202 method260() {
        byte[] var1 = this.method259();
        return new class202(22050, var1, this.field781 * 22050 / 1000, this.field779 * 22050 / 1000);
    }
}
