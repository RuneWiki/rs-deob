import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class472 extends class80 {

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!dv", name = "K", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!dv", name = "P", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6997;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "[Lo;")
    public static class24[] field6994;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "[Llk;")
    private class418[] field6996;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = -124 % ((arg1 - 28) / 53);
        if (~arg0 == -1) {
            this.field6996 = new class418[arg2.method1858(-3256)];
            for (int var5 = 0; this.field6996.length > var5; ++var5) {
                int var6 = arg2.method1858(-3256);
                if (var6 != 0) {
                    if (var6 != 1) {
                        if (~var6 != -3) {
                            if (var6 == 3) {
                                this.field6996[var5] = class45.method453((byte) 87, arg2);
                            }
                        } else {
                            this.field6996[var5] = class163.method1161(arg2, (byte) -127);
                        }
                    } else {
                        this.field6996[var5] = class185.method1257((byte) -77, arg2);
                    }
                } else {
                    this.field6996[var5] = class476.method2846(22145, arg2);
                }
            }
        } else if (arg0 == 1) {
            super.field1591 = arg2.method1858(-3256) == 1;
        }
        ++field6993;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field6998;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            this.method2819(super.field1601.method47(-99), 98);
        }
        if (arg1 != -16828) {
            field6994 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field6995;
        int[][] var3 = super.field1589.method859(arg1, 126);
        if (super.field1589.field1884) {
            int var4 = class137.field2308;
            int var5 = class278.field4199;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1589.method858((byte) -124);
            this.method2819(var6, 103);
            for (int var8 = 0; var8 < class278.field4199; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class137.field2308; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class490.method2960(4080, var15 << 4);
                    var12[var14] = class490.method2960(var15, 65280) >> 4;
                    var11[var14] = class490.method2960(16711680, var15) >> 12;
                }
            }
        }
        if (arg0 != 255) {
            this.method29(18, 52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([[II)V")
    private final void method2819(int[][] arg0, int arg1) {
        ++field6999;
        int var3 = class137.field2308;
        int var4 = class278.field4199;
        class248.method1606(arg0, -27678);
        class255.method1643(0, class308.field4672, 0, class359.field5269, 0);
        if (this.field6996 != null) {
            for (int var5 = 0; this.field6996.length > var5; ++var5) {
                class418 var6 = this.field6996[var5];
                int var7 = var6.field6294;
                int var8 = var6.field6297;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method1300((byte) 105, var3, var4);
                    } else {
                        var6.method1301(-125, var3, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method1302(var3, false, var4);
                }
            }
        }
        if (arg1 <= 40) {
            field6997 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(B)V")
    public static final void method2820(byte arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class122.field2128[var1] = false;
        }
        int var2 = 62 / ((-5 - arg0) / 54);
        ++field7000;
        class526.field7653 = class509.field7427;
        class505.field7374 = class62.field1268;
        class192.field3102 = class41.field577;
        class449.field6677 = -1;
        class311.field4699 = class428.field6406;
        class417.field6288 = 0;
        class326.field4942 = class432.field6435;
        class67.field1366 = class139.field2325;
        class471.field6992 = 0;
        class507.field7396 = -1;
        class510.field7435 = 5;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V")
    public class472() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(Z)V")
    public static void method2821(boolean arg0) {
        field6994 = null;
        if (!arg0) {
            field6997 = null;
        }
        field6997 = null;
    }
}
