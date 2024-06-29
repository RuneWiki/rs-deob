import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class411 extends class371 {

    @OriginalMember(owner = "client!bw", name = "O", descriptor = "I")
    private int field5862 = 1;

    @OriginalMember(owner = "client!bw", name = "L", descriptor = "I")
    private int field5859 = 204;

    @OriginalMember(owner = "client!bw", name = "N", descriptor = "I")
    private int field5861 = 1;

    @OriginalMember(owner = "client!bw", name = "I", descriptor = "Ljt;")
    public static class489 field5856 = new class489(4);

    @OriginalMember(owner = "client!bw", name = "J", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!bw", name = "K", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!bw", name = "M", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!bw", name = "P", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(BI)[I", line = 6)
    public final int[] method79(byte arg0, int arg1) {
        ++field5857;
        int[] var3 = super.field5378.method1451(78, arg1);
        if (arg0 >= -80) {
            method2443(-49, 96, 11, 115, (class520) null);
        }
        if (super.field5378.field3254) {
            for (int var4 = 0; class41.field455 > var4; ++var4) {
                int var5 = class287.field4215[var4];
                int var6 = class614.field9004[arg1];
                int var7 = this.field5861 * var5 >> 12;
                int var8 = this.field5862 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5861) * this.field5861;
                int var10 = var6 % (4096 / this.field5862) * this.field5862;
                if (var10 < this.field5859) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field5859 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field5859) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "(I)V", line = 92)
    public static void method2442(int arg0) {
        if (arg0 != 3) {
            field5858 = 44;
        }
        field5856 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IBLps;)V", line = 104)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field5863;
        int var4 = -27 % ((-15 - arg1) / 39);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field5859 = arg2.method2620(75);
                }
            } else {
                this.field5862 = arg2.method2561((byte) -50);
            }
        } else {
            this.field5861 = arg2.method2561((byte) 111);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIILr;)Led;", line = 148)
    public static final class115 method2443(int arg0, int arg1, int arg2, int arg3, class520 arg4) {
        ++field5860;
        if (arg4 == null) {
            return null;
        } else {
            return arg0 != -27621 ? null : new class115(arg2, arg1, arg3, arg4.method1958(), arg4.method1982(), arg4.method1968(), arg4.method1954(), arg4.method1986(), arg4.method1981(), arg4.method1971());
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "()V", line = 164)
    public class411() {
        super(0, true);
    }
}
