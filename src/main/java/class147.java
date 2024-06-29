import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class147 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[Lsc;")
    private class160[] field2276 = new class160[10];

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    private int field2277;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    private int field2278;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "()I", line = 4)
    public final int method1012() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2276[var2] != null && this.field2276[var2].field2545 / 20 < var1) {
                var1 = this.field2276[var2].field2545 / 20;
            }
        }
        if (this.field2277 < this.field2278 && this.field2277 / 20 < var1) {
            var1 = this.field2277 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2276[var3] != null) {
                this.field2276[var3].field2545 -= var1 * 20;
            }
        }
        if (this.field2277 < this.field2278) {
            this.field2277 -= var1 * 20;
            this.field2278 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "()[B", line = 47)
    private final byte[] method1013() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2276[var2] != null && this.field2276[var2].field2545 + this.field2276[var2].field2525 > var1) {
                var1 = this.field2276[var2].field2545 + this.field2276[var2].field2525;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2276[var5] != null) {
                int var6 = this.field2276[var5].field2525 * 22050 / 1000;
                int var7 = this.field2276[var5].field2545 * 22050 / 1000;
                int[] var8 = this.field2276[var5].method1122(var6, this.field2276[var5].field2525);
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

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ldk;II)Lmj;", line = 108)
    public static final class147 method1014(class241 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1647(arg1, (byte) 121, arg2);
        return var3 == null ? null : new class147(new class153(var3));
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lj;)V", line = 127)
    private class147(class153 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1042((byte) -48);
            if (var3 != 0) {
                arg0.field2367--;
                this.field2276[var2] = new class160();
                this.field2276[var2].method1124(arg0);
            }
        }
        this.field2277 = arg0.method1069(86);
        this.field2278 = arg0.method1069(81);
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 148)
    private class147() {
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "()Llg;", line = 122)
    public final class11 method1015() {
        byte[] var1 = this.method1013();
        return new class11(22050, var1, this.field2277 * 22050 / 1000, this.field2278 * 22050 / 1000);
    }
}
