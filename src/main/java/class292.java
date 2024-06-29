import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class292 extends class34 {

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4434 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "[Lwd;")
    private class73[] field4428;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 < 75) {
            return null;
        } else {
            ++field4431;
            int[] var3 = super.field610.method228(24856, arg1);
            if (super.field610.field597) {
                this.method1930(super.field610.method224(2652), true);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V")
    public static void method1929(byte arg0) {
        if (arg0 == 55) {
            field4434 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([[IZ)V")
    private final void method1930(int[][] arg0, boolean arg1) {
        ++field4438;
        int var3 = class226.field3527;
        int var4 = class259.field3965;
        method1932(arg0, (byte) -117);
        class128.method887(0, 0, -66, class167.field2457, class201.field3014);
        if (this.field4428 != null) {
            for (int var5 = 0; ~this.field4428.length < ~var5; ++var5) {
                class73 var6 = this.field4428[var5];
                int var7 = var6.field1181;
                int var8 = var6.field1182;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method584(var4, 119, var3);
                    }
                } else if (var8 < 0) {
                    var6.method588(var4, var3, 119);
                } else {
                    var6.method587(var3, var4, -10);
                }
            }
        }
        if (!arg1) {
            this.method1930((int[][]) null, true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
    public static final void method1931(int arg0, byte arg1) {
        ++field4432;
        if (!class23.field376) {
            arg0 = -1;
        }
        if (~class214.field3294 != ~arg0) {
            if (arg0 != -1) {
                class129 var2 = class142.method954(arg0, 12192);
                class289 var3 = var2.method889((byte) -112);
                if (var3 == null) {
                    arg0 = -1;
                } else {
                    class217.field3338.method191(true, var3.field3941, var3.field3943, class297.field4569, new Point(var2.field1898, var2.field1896), var3.method1919());
                    class214.field3294 = arg0;
                }
            }
            if (~arg0 == 0 && ~class214.field3294 != 0) {
                class217.field3338.method191(true, -1, -1, class297.field4569, new Point(), (int[]) null);
                class214.field3294 = -1;
            }
            if (arg1 != -16) {
                method1931(55, (byte) -64);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([[IB)V")
    private static final void method1932(int[][] arg0, byte arg1) {
        class241.field3751 = arg0;
        if (arg1 >= -66) {
            method1929((byte) -128);
        }
        ++field4437;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = -23 % ((-54 - arg0) / 44);
        ++field4436;
        int[][] var4 = super.field618.method91(-108, arg1);
        if (super.field618.field211) {
            int var5 = class259.field3965;
            int var6 = class226.field3527;
            int[][] var7 = new int[var5][var6];
            int[][][] var8 = super.field618.method93(0);
            this.method1930(var7, true);
            for (int var9 = 0; var9 < class259.field3965; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; class226.field3527 > var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class131.method904(255, var16) << 4;
                    var13[var15] = class131.method904(var16, 65280) >> 4;
                    var12[var15] = class131.method904(4080, var16 >> 12);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class292() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            field4434 = null;
        }
        if (arg1 == 0) {
            this.field4428 = new class73[arg2.method407(255)];
            for (int var4 = 0; ~this.field4428.length < ~var4; ++var4) {
                int var5 = arg2.method407(arg0 + 249);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field4428[var4] = class60.method492((byte) -71, arg2);
                            }
                        } else {
                            this.field4428[var4] = class217.method1458(4096, arg2);
                        }
                    } else {
                        this.field4428[var4] = class179.method1181(arg2, 105);
                    }
                } else {
                    this.field4428[var4] = class167.method1132(arg2, class226.method1551(arg0, 6));
                }
            }
        } else if (arg1 == 1) {
            super.field604 = ~arg2.method407(255) == -2;
        }
        ++field4433;
    }
}
