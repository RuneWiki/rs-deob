import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class376 extends class499 {

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Lsu;")
    public class139 field5099;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Lff;")
    public static class9 field5100 = new class9(76, -2);

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lvj;")
    public static class304 field5101 = new class304("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "Lkl;")
    public static class54 field5097;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "[[[Lht;")
    public static class409[][][] field5102;

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lsu;)V", line = 7)
    public class376(class139 arg0) {
        this.field5099 = arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Ljv;", line = 18)
    public static final class55 method2177(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class55 var4 = var3.field5624;
            var3.field5624 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILtk;Lqa;Lfh;I)Z", line = 28)
    public static final boolean method2178(boolean arg0, int arg1, class228 arg2, class162 arg3, class460 arg4, int arg5) {
        field5098++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        if (arg0) {
            method2179(90);
        }
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field6330 != null) {
            var7 = class6.field184 + ((arg4.field6357 + arg2.field3073 - class6.field181) * (class6.field183 - class6.field184) / (class6.field190 - class6.field181));
            var8 = class6.field178 - ((arg2.field3065 + arg4.field6335 - class6.field185) * (class6.field178 - class6.field192) / (class6.field176 - class6.field185));
            var6 = (class6.field183 - class6.field184) * (arg4.field6320 + arg2.field3073 - class6.field181) / (class6.field190 - class6.field181) + class6.field184;
            var9 = class6.field178 - ((arg4.field6323 - (class6.field185 - arg2.field3065)) * (class6.field178 - class6.field192) / (class6.field176 - class6.field185));
        }
        class529 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field6364 != -1) {
            if (arg2.field3071 && arg4.field6338 != -1) {
                var10 = arg4.method2614(49783229, arg3, true);
            } else {
                var10 = arg4.method2614(49783229, arg3, false);
            }
            if (var10 != null) {
                var11 = arg2.field3072 - (var10.method151() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg2.field3072 + (var10.method151() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg2.field3077 - (var10.method149() + 1 >> 1);
                var14 = arg2.field3077 + (var10.method149() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class274 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field6352 != null) {
            var15 = class354.method2068(false, arg4.field6327);
            if (var15 != null) {
                var16 = class433.field5928.method2453(class129.field1879, arg4.field6352, null, (byte) -126, null);
                int var23 = arg2.field3077;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1640() / 2;
                } else {
                    var17 = var23 - ((var10.method149() >> 1) + (var15.method1638() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class129.field1879[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1637(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg1 + arg2.field3072 - (var18 / 2);
                var20 = var18 / 2 + (arg2.field3072 + arg1);
                if (var6 > var19) {
                    var6 = var19;
                }
                var21 = arg5 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                var22 = arg5 + (var17 + (var15.method1638() * var16));
                if (var21 < var8) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class6.field184 || var6 > class6.field183 || class6.field192 > var9 || class6.field178 < var8) {
            return true;
        }
        if (arg4.field6330 != null) {
            int[] var27 = new int[arg4.field6330.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg4.field6330[var28 * 2] + arg2.field3073;
                int var31 = arg4.field6330[var28 * 2 + 1] + arg2.field3065;
                var27[var28 * 2] = (class6.field183 - class6.field184) * (var30 - class6.field181) / (class6.field190 - class6.field181) + class6.field184;
                var27[var28 * 2 + 1] = class6.field178 - ((class6.field178 - class6.field192) * (var31 - class6.field185) / (class6.field176 - class6.field185));
            }
            class531.method3125(arg3, var27, arg4.field6324);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg3.method1096(var27[var29 * 2 + 1], arg4.field6356, (byte) 51, var27[var29 * 2], var27[var29 * 2 + 3], var27[(var29 + 1) * 2]);
            }
            arg3.method1096(var27[var27.length - 1], arg4.field6356, (byte) 127, var27[var27.length - 2], var27[1], var27[0]);
        }
        if (var10 != null) {
            if (class497.field6891 > 0 && (class392.field5309 != -1 && class392.field5309 == arg2.field3078 || class491.field6838 != -1 && class491.field6838 == arg4.field6329)) {
                int var32;
                if (class389.field5277 > 50) {
                    var32 = (100 - class389.field5277) * 2;
                } else {
                    var32 = class389.field5277 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method1091(arg2.field3077, (byte) -26, var10.method154() / 2 + 7, arg2.field3072, var33);
                arg3.method1091(arg2.field3077, (byte) -26, var10.method154() / 2 + 5, arg2.field3072, var33);
                arg3.method1091(arg2.field3077, (byte) -26, var10.method154() / 2 + 3, arg2.field3072, var33);
                arg3.method1091(arg2.field3077, (byte) -26, var10.method154() / 2 + 1, arg2.field3072, var33);
                arg3.method1091(arg2.field3077, (byte) -26, var10.method154() / 2, arg2.field3072, var33);
            }
            var10.method3109(arg2.field3072 - (var10.method151() >> 1), arg2.field3077 - (var10.method149() >> 1));
        }
        if (arg4.field6352 != null && var15 != null) {
            class310.method1805(-4, var16, arg2, var18, var17, arg3, arg4, var15);
        }
        if (arg4.field6364 != -1 || arg4.field6352 != null) {
            class203 var34 = new class203(arg2);
            var34.field2807 = var20;
            var34.field2814 = var22;
            var34.field2811 = var19;
            var34.field2813 = var11;
            var34.field2806 = var21;
            var34.field2809 = var13;
            var34.field2808 = var12;
            var34.field2819 = var14;
            class224.field3022.method1666((byte) -50, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 250)
    public static void method2179(int arg0) {
        field5100 = null;
        field5097 = null;
        field5102 = null;
        if (arg0 >= -21) {
            field5100 = null;
        }
        field5101 = null;
    }
}
