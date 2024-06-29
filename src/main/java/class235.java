import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class235 extends class634 {

    @OriginalMember(owner = "client!ida", name = "F", descriptor = "I")
    private int field2798 = 1;

    @OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
    private int field2804 = 204;

    @OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
    private int field2803 = 1;

    @OriginalMember(owner = "client!ida", name = "G", descriptor = "Lmk;")
    public static class54 field2799 = new class54();

    @OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ida", name = "J", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ida", name = "K", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ida", name = "N", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2804 = arg1.method1476(-85);
                }
            } else {
                this.field2798 = arg1.method1423(-113);
            }
        } else {
            this.field2803 = arg1.method1423(-70);
        }
        ++field2802;
        if (arg2) {
            field2799 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lig;Z)Lvv;")
    public static final class324 method1391(class244 arg0, boolean arg1) {
        if (!arg1) {
            field2799 = null;
        }
        ++field2801;
        class120 var2 = class486.method2935(arg0, 1);
        int var3 = arg0.method1438(96);
        int var4 = arg0.method1438(110);
        int var5 = arg0.method1476(56);
        return new class324(var2.field1253, var2.field1245, var2.field1244, var2.field1247, var2.field1249, var2.field1250, var2.field1255, var2.field1258, var2.field1252, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "(I)V")
    public static void method1392(int arg0) {
        int var1 = -37 % ((-13 - arg0) / 52);
        field2799 = null;
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field2805;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 >= -55) {
            field2799 = null;
        }
        if (super.field9114.field3897) {
            for (int var4 = 0; var4 < class635.field9139; ++var4) {
                int var5 = class246.field2980[var4];
                int var6 = class164.field1840[arg1];
                int var7 = this.field2803 * var5 >> 12;
                int var8 = this.field2798 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2803) * this.field2803;
                int var10 = var6 % (4096 / this.field2798) * this.field2798;
                if (~this.field2804 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field2804) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field2804) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
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

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLtp;)Ltp;")
    public static final class532 method1393(byte arg0, class532 arg1) {
        if (arg0 > -74) {
            return null;
        } else {
            ++field2800;
            if (~arg1.field7580 != 0) {
                return class269.method1608((byte) -72, arg1.field7580);
            } else {
                int var2 = arg1.field7704 >>> 16;
                class215 var3 = new class215(class153.field1688);
                for (class424 var4 = (class424) var3.method1262(0); var4 != null; var4 = (class424) var3.method1264(98)) {
                    if (~var4.field6159 == ~var2) {
                        return class269.method1608((byte) -72, (int) var4.field1522);
                    }
                }
                return null;
            }
        }
    }
}
