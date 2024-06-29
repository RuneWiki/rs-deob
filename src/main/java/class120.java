import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class120 extends class214 {

    @OriginalMember(owner = "client!go", name = "M", descriptor = "Lbd;")
    public static class464 field1680 = new class464(14, 2);

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "Z")
    public static boolean field1684 = false;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Lfc;")
    public static class343 field1685;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "[Lhr;")
    private class432[] field1682;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V")
    public static final void method750(int arg0) {
        int var1 = -23 / ((70 - arg0) / 51);
        class235.field3326.method654(false);
        ++field1683;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field1677;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            this.method752((byte) -26, super.field3024.method2582(true));
        }
        return arg0 != 123 ? null : var3;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
    public static void method751(byte arg0) {
        field1680 = null;
        field1685 = null;
        if (arg0 != -128) {
            method750(65);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field1681;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                super.field3032 = arg0.method2503(true) == 1;
            }
        } else {
            this.field1682 = new class432[arg0.method2503(true)];
            for (int var4 = 0; ~this.field1682.length < ~var4; ++var4) {
                int var5 = arg0.method2503(true);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field1682[var4] = class20.method167(arg0, 227);
                            }
                        } else {
                            this.field1682[var4] = class355.method2138(arg0, (byte) 71);
                        }
                    } else {
                        this.field1682[var4] = class284.method1759(arg0, false);
                    }
                } else {
                    this.field1682[var4] = class136.method830(arg0, 0);
                }
            }
        }
        if (arg1 > -114) {
            this.method11(-40, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field1678;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            return null;
        } else {
            if (super.field3030.field6644) {
                int var4 = class399.field5585;
                int var5 = class490.field6924;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field3030.method2779((byte) 104);
                this.method752((byte) -26, var6);
                for (int var8 = 0; ~class490.field6924 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~class399.field5585 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class347.method2074(var15 << 4, 4080);
                        var12[var14] = class347.method2074(65280, var15) >> 4;
                        var11[var14] = class347.method2074(var15 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B[[I)V")
    private final void method752(byte arg0, int[][] arg1) {
        ++field1679;
        int var3 = class399.field5585;
        int var4 = class490.field6924;
        class245.method1530((byte) 40, arg1);
        class51.method408(0, (byte) -118, class183.field2659, class467.field6551, 0);
        if (arg0 == -26) {
            if (this.field1682 != null) {
                for (int var5 = 0; var5 < this.field1682.length; ++var5) {
                    class432 var6 = this.field1682[var5];
                    int var7 = var6.field5951;
                    int var8 = var6.field5950;
                    if (~var7 > -1) {
                        if (~var8 <= -1) {
                            var6.method1601((byte) -120, var4, var3);
                        }
                    } else if (~var8 <= -1) {
                        var6.method1597(var4, var3, -20714);
                    } else {
                        var6.method1598(true, var3, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class120() {
        super(0, true);
    }
}
