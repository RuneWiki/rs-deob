import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class196 extends class144 {

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2787 = "flash1:";

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field2790 = 0;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field2796 = 1;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "[I")
    public static int[] field2791 = new int[128];

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "[Lwb;")
    private class76[] field2795;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field2786;
        if (arg0 != 5) {
            field2796 = -13;
        }
        int[][] var3 = super.field2053.method1542(108, arg1);
        if (super.field2053.field3408) {
            int var4 = class104.field1411;
            int var5 = class257.field3727;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2053.method1540(0);
            this.method1268(false, var6);
            for (int var8 = 0; var8 < class257.field3727; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; ~class104.field1411 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class5.method26(var15, 255) << 4;
                    var13[var14] = class5.method26(4080, var15 >> 4);
                    var11[var14] = class5.method26(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method1268(false, (int[][]) null);
        }
        ++field2797;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            this.method1268(false, super.field2069.method424(arg1 + 13538));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)Lfk;")
    public static final class50 method1266(int arg0, int arg1, int arg2) {
        class133 var3 = class6.field94[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class50 var4 = var3.field1917;
            var3.field1917 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(B)V")
    public static void method1267(byte arg0) {
        field2791 = null;
        field2787 = null;
        int var1 = -55 % ((83 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z[[I)V")
    private final void method1268(boolean arg0, int[][] arg1) {
        ++field2789;
        int var3 = class104.field1411;
        if (arg0) {
            this.method1268(false, (int[][]) null);
        }
        int var4 = class257.field3727;
        class204.method1317(arg1, -1);
        class227.method1470(0, class166.field2391, -119, class112.field1487, 0);
        if (this.field2795 != null) {
            for (int var5 = 0; var5 < this.field2795.length; ++var5) {
                class76 var6 = this.field2795[var5];
                int var7 = var6.field906;
                int var8 = var6.field910;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method167(var3, var4, (byte) -72);
                    } else {
                        var6.method166(var3, 75, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method168(-31341, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field2788;
        if (arg2 == 20630) {
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field2059 = ~arg1.method1407(arg2 + -20507) == -2;
                    return;
                }
            } else {
                this.field2795 = new class76[arg1.method1407(arg2 ^ 20735)];
                for (int var4 = 0; this.field2795.length > var4; ++var4) {
                    int var5 = arg1.method1407(arg2 ^ 20704);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field2795[var4] = class98.method593(arg1, (byte) 99);
                                }
                            } else {
                                this.field2795[var4] = class171.method1119(31962, arg1);
                            }
                        } else {
                            this.field2795[var4] = class228.method1475(-5, arg1);
                        }
                    } else {
                        this.field2795[var4] = class159.method1061(arg1, 56);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1269(int arg0, boolean arg1) {
        class259.field3770 = arg1;
        class7.field97 = arg0 + 1 & 65535;
        ++field2792;
        return true;
    }
}
