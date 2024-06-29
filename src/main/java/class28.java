import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class28 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[Lth;")
    private class48[] field345 = new class48[10];

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()[B")
    private final byte[] method185() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field345[var2] != null && this.field345[var2].field649 + this.field345[var2].field641 > var1) {
                var1 = this.field345[var2].field649 + this.field345[var2].field641;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field345[var5] != null) {
                int var6 = this.field345[var5].field641 * 22050 / 1000;
                int var7 = this.field345[var5].field649 * 22050 / 1000;
                int[] var8 = this.field345[var5].method328(var6, this.field345[var5].field641);
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

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()Lkh;")
    public final class220 method186() {
        byte[] var1 = this.method185();
        return new class220(22050, var1, this.field343 * 22050 / 1000, this.field344 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()I")
    public final int method187() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field345[var2] != null && this.field345[var2].field649 / 20 < var1) {
                var1 = this.field345[var2].field649 / 20;
            }
        }
        if (this.field343 < this.field344 && this.field343 / 20 < var1) {
            var1 = this.field343 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field345[var3] != null) {
                this.field345[var3].field649 -= var1 * 20;
            }
        }
        if (this.field343 < this.field344) {
            this.field343 -= var1 * 20;
            this.field344 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Loe;II)Lnb;")
    public static final class28 method188(class256 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1712(arg2, arg1, -1);
        return var3 == null ? null : new class28(new class112(var3));
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lnh;)V")
    private class28(class112 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method758(true);
            if (var3 != 0) {
                arg0.field1821--;
                this.field345[var2] = new class48();
                this.field345[var2].method327(arg0);
            }
        }
        this.field343 = arg0.method731(false);
        this.field344 = arg0.method731(false);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    private class28() {
    }
}
