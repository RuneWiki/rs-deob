import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class396 extends class335 {

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
    private int field5267 = 204;

    @OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
    private int field5271 = 1;

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "I")
    private int field5269 = 1;

    @OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!pca", name = "E", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!pca", name = "H", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V", line = 5)
    public class396() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V", line = 13)
    public static final void method2272(int arg0) {
        class153.field2098.method1391(1);
        if (arg0 < -125) {
            ++field5268;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZI)[I", line = 26)
    public final int[] method3(boolean arg0, int arg1) {
        ++field5272;
        if (!arg0) {
            method2272(-10);
        }
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            for (int var4 = 0; class649.field8968 > var4; ++var4) {
                int var5 = class376.field4981[var4];
                int var6 = class686.field9697[arg1];
                int var7 = this.field5269 * var5 >> 12;
                int var8 = this.field5271 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5269) * this.field5269;
                int var10 = var6 % (4096 / this.field5271) * this.field5271;
                if (~this.field5267 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field5267) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field5267 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILio;I)V", line = 118)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field5270;
        if (arg2 != -66) {
            this.field5267 = 32;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field5267 = arg1.method963(-126);
                }
            } else {
                this.field5271 = arg1.method930(arg2 ^ -191);
            }
        } else {
            this.field5269 = arg1.method930(255);
        }
    }
}
