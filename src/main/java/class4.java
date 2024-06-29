import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[Lfj;")
    private class250[] field48 = new class250[10];

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()I")
    public final int method18() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field48[var2] != null && this.field48[var2].field4387 / 20 < var1) {
                var1 = this.field48[var2].field4387 / 20;
            }
        }
        if (this.field47 < this.field49 && this.field47 / 20 < var1) {
            var1 = this.field47 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field48[var3] != null) {
                this.field48[var3].field4387 -= var1 * 20;
            }
        }
        if (this.field47 < this.field49) {
            this.field47 -= var1 * 20;
            this.field49 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()Lji;")
    public final class42 method19() {
        byte[] var1 = this.method20();
        return new class42(22050, var1, this.field47 * 22050 / 1000, this.field49 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()[B")
    private final byte[] method20() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field48[var2] != null && this.field48[var2].field4387 + this.field48[var2].field4381 > var1) {
                var1 = this.field48[var2].field4387 + this.field48[var2].field4381;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field48[var5] != null) {
                int var6 = this.field48[var5].field4381 * 22050 / 1000;
                int var7 = this.field48[var5].field4387 * 22050 / 1000;
                int[] var8 = this.field48[var5].method1738(var6, this.field48[var5].field4381);
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

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lgd;)V")
    private class4(class74 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method489((byte) -31);
            if (var3 != 0) {
                arg0.field1340--;
                this.field48[var2] = new class250();
                this.field48[var2].method1739(arg0);
            }
        }
        this.field47 = arg0.method485(-2386);
        this.field49 = arg0.method485(-2386);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    private class4() {
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lal;II)Lvd;")
    public static final class4 method21(class230 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1562(-809612665, arg2, arg1);
        return var3 == null ? null : new class4(new class74(var3));
    }
}
