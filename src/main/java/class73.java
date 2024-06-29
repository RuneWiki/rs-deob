import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class73 extends class194 {

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1338 = 0;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field1350 = -1;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Lqk;")
    private static class207 field1351 = class24.method212(255, " from your friend list first)3");

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lqk;")
    private static class207 field1340 = class24.method212(255, " from your ignore list first)3");

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "[I")
    public static int[] field1344 = new int[50];

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lqk;")
    public static class207 field1341 = field1351;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lqk;")
    public static class207 field1345 = field1340;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public int field1352;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method527(int arg0) {
        field1344 = null;
        field1340 = null;
        field1345 = null;
        field1351 = null;
        if (arg0 != -80) {
            field1350 = -36;
        }
        field1341 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static final void method528(int arg0) {
        if (arg0 != 0) {
            method529(57, 77, (byte[]) null);
        }
        field1347++;
        while (true) {
            class120 var1;
            class286 var3;
            do {
                var1 = (class120) class154.field2667.method927(false);
                if (var1 == null) {
                    return;
                }
                if (var1.field2072 >= 0) {
                    int var2 = var1.field2072 - 1;
                    var3 = class79.field1449[var2];
                } else {
                    int var4 = -var1.field2072 - 1;
                    if (class19.field313 == var4) {
                        var3 = class202.field3565;
                    } else {
                        var3 = class169.field2953[var4];
                    }
                }
            } while (var3 == null);
            class22 var5 = class33.method251(0, var1.field2080);
            int var6;
            int var7;
            if (var1.field2077 == 1 || var1.field2077 == 3) {
                var7 = var5.field392;
                var6 = var5.field414;
            } else {
                var6 = var5.field392;
                var7 = var5.field414;
            }
            int var8 = (var6 >> 1) + var1.field2075;
            int var9 = (var6 + 1 >> 1) + var1.field2075;
            int[][] var10 = class163.field2881[class93.field1645];
            int var11 = (var7 >> 1) + var1.field2070;
            int var12 = (var7 + 1 >> 1) + var1.field2070;
            int var13 = var10[var8][var11] + var10[var9][var11] + var10[var8][var12] + var10[var9][var12] >> 2;
            int var14 = class18.field280[var1.field2073];
            class235 var15 = null;
            if (var14 == 0) {
                var15 = class280.method1903(class93.field1645, var1.field2075, var1.field2070).field3704;
            } else if (var14 == 1) {
                var15 = class206.method1420(class93.field1645, var1.field2075, var1.field2070).field564;
            } else if (var14 == 2) {
                var15 = class286.method1955(class93.field1645, var1.field2075, var1.field2070).field5136;
            } else if (var14 == 3) {
                var15 = class74.method537(class93.field1645, var1.field2075, var1.field2070).field4465;
            }
            if (var15 != null) {
                class79.method600(class93.field1645, 0, var14, var1.field2074 + 1, var1.field2075, (byte) -99, -1, var1.field2068 + 1, 0, var1.field2070);
                var3.field5036 = var1.field2070 * 128 + (var7 * 64);
                var3.field5010 = var1.field2068 + class160.field2844;
                var3.field5094 = var13;
                int var16 = var1.field2079;
                var3.field5068 = var15;
                var3.field5021 = class160.field2844 + var1.field2074;
                int var17 = var1.field2078;
                var3.field5031 = var1.field2075 * 128 + (var6 * 64);
                int var18 = var1.field2083;
                int var19 = var1.field2082;
                if (var17 < var16) {
                    int var20 = var16;
                    var16 = var17;
                    var17 = var20;
                }
                if (var19 > var18) {
                    int var21 = var19;
                    var19 = var18;
                    var18 = var21;
                }
                var3.field5057 = var1.field2070 + var19;
                var3.field5102 = var1.field2070 + var18;
                var3.field5051 = var1.field2075 + var17;
                var3.field5013 = var1.field2075 + var16;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[B)I")
    public static final int method529(int arg0, int arg1, byte[] arg2) {
        if (arg1 != -1) {
            field1351 = null;
        }
        field1349++;
        return class215.method1535(arg0, (byte) -96, 0, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLba;IIIII)Lba;")
    public static final class166 method530(boolean arg0, class166 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1342++;
        long var7 = (long) arg5;
        class166 var9 = (class166) class232.field4264.method1387(var7, 125);
        if (var9 == null) {
            class210 var10 = class210.method1488(class85.field1549, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1498(64, 768, -50, -10, -50);
            class232.field4264.method1385(var7, var9, (byte) -125);
        }
        int var11 = arg1.method283();
        int var12 = arg1.method279();
        int var13 = arg1.method272();
        int var14 = arg1.method284();
        class166 var15 = var9.method286(true, arg0, true);
        if (arg2 != 0) {
            var15.method289(arg2);
        }
        class37 var16 = (class37) var15;
        if (class22.method139(arg6 + var11, arg4 + var13, 23979, class93.field1645) != arg3 || class22.method139(arg6 + var12, arg4 + var14, 23979, class93.field1645) != arg3) {
            for (int var17 = 0; var17 < var16.field717; var17++) {
                var16.field719[var17] += class22.method139(var16.field714[var17] + arg6, var16.field709[var17] + arg4, 23979, class93.field1645) - arg3;
            }
            var16.field732 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1353++;
        if (class98.method697(arg5, 4401)) {
            if (arg7 != 30442) {
                field1338 = -13;
            }
            class79.method598(class227.field4162[arg5], arg3, arg2, -1, arg8, arg6, (byte) -39, arg4, arg0, arg1);
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class140.field2431[var9] = true;
            }
        } else {
            class140.field2431[arg1] = true;
        }
    }
}
