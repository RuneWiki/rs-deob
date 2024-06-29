import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class103 extends class398 {

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    private int field1431 = 4;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    private int field1432 = 4;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "[I")
    public static int[] field1418 = new int[128];

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "J")
    public static long field1419 = 0L;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field1424 = -11713997;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "S")
    public static short field1420 = 256;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "Ljava/awt/Frame;")
    public static Frame field1428;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "[[[B")
    public static byte[][][] field1430;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 5)
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnj;II)V", line = 17)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field1432 = arg0.method1348(-87);
            }
        } else {
            this.field1431 = arg0.method1348(-110);
        }
        if (arg2 != -13132) {
            this.field1432 = -67;
        }
        ++field1422;
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V", line = 52)
    public static final void method688(int arg0) {
        ++field1429;
        class365.field5292 = new class394[class300.field4408.method2268((byte) 67)][];
        int var1 = -28 % ((58 - arg0) / 42);
        class339.field4887 = new boolean[class300.field4408.method2268((byte) 67)];
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V", line = 74)
    public static void method689(int arg0) {
        if (arg0 > 26) {
            field1430 = null;
            field1418 = null;
            field1428 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)I", line = 98)
    public static final int method690(byte arg0, int arg1, int arg2) {
        ++field1426;
        if (arg0 > -73) {
            field1423 = 55;
        }
        return ~arg1 != -5 && arg1 != 5 ? 256 : class152.field2059[3 & arg2];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I", line = 113)
    public final int[] method95(int arg0, int arg1) {
        ++field1427;
        int[] var3 = super.field5927.method305(arg0, (byte) 100);
        if (super.field5927.field591) {
            int var4 = class140.field1922 / this.field1431;
            int var5 = class329.field4798 / this.field1432;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method2558(0, arg1 ^ 29295, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2558(0, arg1 + 29295, class329.field4798 * var7 / var5);
            }
            for (int var8 = 0; var8 < class140.field1922; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class140.field1922 * var9 / var4];
                }
            }
        }
        if (arg1 != 0) {
            method690((byte) 42, 99, -17);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)[[I", line = 168)
    public final int[][] method99(int arg0, int arg1) {
        ++field1425;
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (arg1 != 2) {
            field1419 = 33L;
        }
        if (super.field5933.field4847) {
            int var4 = class140.field1922 / this.field1431;
            int var5 = class329.field4798 / this.field1432;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method2561(0, (byte) -127, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method2561(class329.field4798 * var7 / var5, (byte) -116, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class140.field1922 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class140.field1922 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V", line = 240)
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 == 256) {
            ++field1421;
            if (class395.method2537((byte) 59, arg4)) {
                client.method1531(class365.field5292[arg4], -1, arg1, arg3, arg5, arg6, arg2, arg7);
            }
        }
    }
}
