import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class353 {

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    private static int field5132 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private static int field5131 = 0;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private static int field5127 = 0;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    private static int field5134 = 0;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[I")
    private static int[] field5137 = new int[3];

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
    private static int[] field5128 = new int[5];

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[J")
    private static long[] field5139 = new long[1000];

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field5150 = new String[1000];

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[I")
    private static int[] field5140 = new int[1000];

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "[Lvda;")
    private static class191[] field5148 = new class191[50];

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "[[I")
    private static int[][] field5138 = new int[5][5000];

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "Lpa;")
    public static class387 field5145 = new class387(4);

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    private static int field5155 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lwq;")
    private static class176 field5135;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lwq;")
    private static class176 field5149;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lrg;")
    private static class667 field5152;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "Lua;")
    private static class692 field5154;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lmia;")
    private static class69 field5124;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
    private static int[] field5141;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "[J")
    private static long[] field5151;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[Ljava/lang/String;")
    private static String[] field5153;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method2215(int arg0) {
        String var1 = field5124.method556(class536.field7555.field1305 << 16 | arg0, -1);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(C)I")
    private static final int method2216(char arg0) {
        return class130.method942(-97, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    private static final void method2217(int arg0) {
        class176 var1 = class518.method3014(arg0, -28);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class176[] var3 = class222.field3192[var2];
        if (var3 == null) {
            class176[] var4 = class110.field1382[var2];
            int var5 = var4.length;
            var3 = class222.field3192[var2] = new class176[var5];
            class42.method291(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class42.method291(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lmha;I)V")
    private static final void method2218(class433 arg0, int arg1) {
        field5132 = 0;
        field5134 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6168;
        int[] var4 = arg0.field6165;
        byte var5 = -1;
        field5127 = 0;
        try {
            int var6 = 0;
            label333: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var45 = var3[var2];
                if (var45 >= 150) {
                    boolean var37;
                    if (var4[var2] == 1) {
                        var37 = true;
                    } else {
                        var37 = false;
                    }
                    if (var45 >= 150 && var45 < 5000) {
                        method2221(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method2228(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field5140[field5132++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field5140[field5132++] = class271.field3796.field3840[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class271.field3796.method1786(-28107, var8, field5140[--field5132]);
                } else if (var45 == 3) {
                    field5150[field5134++] = arg0.field6162[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field5132 -= 2;
                    if (field5140[field5132 + 1] != field5140[field5132]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field5132 -= 2;
                    if (field5140[field5132 + 1] == field5140[field5132]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field5132 -= 2;
                    if (field5140[field5132] < field5140[field5132 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field5132 -= 2;
                    if (field5140[field5132] > field5140[field5132 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field5127 == 0) {
                        return;
                    }
                    class191 var9 = field5148[--field5127];
                    arg0 = var9.field2850;
                    var3 = arg0.field6168;
                    var4 = arg0.field6165;
                    var2 = var9.field2847;
                    field5141 = var9.field2848;
                    field5153 = var9.field2845;
                    field5151 = var9.field2842;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field5140[field5132++] = class271.field3796.method1781((byte) -108, var10);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class271.field3796.method1789(var11, field5140[--field5132], true);
                } else if (var45 == 31) {
                    field5132 -= 2;
                    if (field5140[field5132] <= field5140[field5132 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field5132 -= 2;
                    if (field5140[field5132] >= field5140[field5132 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field5140[field5132++] = field5141[var4[var2]];
                } else if (var45 == 34) {
                    field5141[var4[var2]] = field5140[--field5132];
                } else if (var45 == 35) {
                    field5150[field5134++] = field5153[var4[var2]];
                } else if (var45 == 36) {
                    field5153[var4[var2]] = field5150[--field5134];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field5134 -= var12;
                    String var13 = class445.method2681(var12, field5150, field5134, true);
                    field5150[field5134++] = var13;
                } else if (var45 == 38) {
                    field5132--;
                } else if (var45 == 39) {
                    field5134--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class433 var15 = class212.method1490(var14, 121);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6167];
                    String[] var17 = new String[var15.field6171];
                    long[] var18 = new long[var15.field6169];
                    for (int var19 = 0; var19 < var15.field6156; var19++) {
                        var16[var19] = field5140[field5132 + var19 - var15.field6156];
                    }
                    for (int var20 = 0; var20 < var15.field6164; var20++) {
                        var17[var20] = field5150[field5134 + var20 - var15.field6164];
                    }
                    for (int var21 = 0; var21 < var15.field6157; var21++) {
                        var18[var21] = field5139[field5131 + var21 - var15.field6157];
                    }
                    field5132 -= var15.field6156;
                    field5134 -= var15.field6164;
                    field5131 -= var15.field6157;
                    class191 var22 = new class191();
                    var22.field2850 = arg0;
                    var22.field2847 = var2;
                    var22.field2848 = field5141;
                    var22.field2845 = field5153;
                    var22.field2842 = field5151;
                    if (field5127 >= field5148.length) {
                        throw new RuntimeException();
                    }
                    field5148[field5127++] = var22;
                    arg0 = var15;
                    var3 = var15.field6168;
                    var4 = var15.field6165;
                    var2 = -1;
                    field5141 = var16;
                    field5153 = var17;
                    field5151 = var18;
                } else if (var45 == 42) {
                    field5140[field5132++] = class604.field8499[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class604.field8499[var23] = field5140[--field5132];
                    class445.method2678(var23, 120);
                    class387.field5502 |= class9.field127[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field5140[--field5132];
                    if (var26 >= 0 && var26 <= 5000) {
                        field5128[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field5138[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field5140[--field5132];
                    if (var30 < 0 || var30 >= field5128[var29]) {
                        throw new RuntimeException();
                    }
                    field5140[field5132++] = field5138[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field5132 -= 2;
                    int var32 = field5140[field5132];
                    if (var32 < 0 || var32 >= field5128[var31]) {
                        throw new RuntimeException();
                    }
                    field5138[var31][var32] = field5140[field5132 + 1];
                } else if (var45 == 47) {
                    String var33 = class434.field6173[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field5150[field5134++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class434.field6173[var34] = field5150[--field5134];
                    class246.method1655(var34, 16711935);
                } else if (var45 == 51) {
                    class64 var35 = arg0.field6158[var4[var2]];
                    class633 var36 = (class633) var35.method380((byte) -3, (long) field5140[--field5132]);
                    if (var36 != null) {
                        var2 += var36.field8932;
                    }
                } else if (var45 == 54) {
                    field5139[field5131++] = arg0.field6166[var2];
                } else if (var45 == 55) {
                    field5131--;
                } else if (var45 == 66) {
                    field5139[field5131++] = field5151[var4[var2]];
                } else if (var45 == 67) {
                    field5151[var4[var2]] = field5139[--field5131];
                } else if (var45 == 68) {
                    field5131 -= 2;
                    if (field5139[field5131 + 1] != field5139[field5131]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field5131 -= 2;
                    if (field5139[field5131 + 1] == field5139[field5131]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field5131 -= 2;
                    if (field5139[field5131] < field5139[field5131 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field5131 -= 2;
                    if (field5139[field5131] > field5139[field5131 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field5131 -= 2;
                    if (field5139[field5131] <= field5139[field5131 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field5131 -= 2;
                    if (field5139[field5131] >= field5139[field5131 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field5140[--field5132] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field5140[--field5132] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field5140[field5132++] = method2231(var4[var2]);
                } else if (var45 == 113) {
                    field5140[field5132++] = method2225(var4[var2]);
                } else if (var45 == 114) {
                    field5139[field5131++] = method2227(var4[var2]);
                } else if (var45 == 115) {
                    field5150[field5134++] = method2215(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field6160 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field7577).append(" ");
                for (int var43 = field5127 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field5148[var43].field2850.field7577).append(" ");
                }
                var42.append("op: ").append(var5);
                class329.method2129(var42.toString(), false, var44);
            } else {
                class64.method386("Clientscript error in: " + arg0.field6160, 4, false);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field6160).append("\n");
                for (int var40 = field5127 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field5148[var40].field2850.field6160).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class329.method2129(var39.toString(), false, var44);
                class561.method3260(var39.toString(), 80);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhw;)V")
    public static final void method2219(class140 arg0) {
        method2224(arg0, 200000);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public static void method2220() {
        field5141 = null;
        field5153 = null;
        field5151 = null;
        field5128 = null;
        field5138 = null;
        field5140 = null;
        field5150 = null;
        field5139 = null;
        field5148 = null;
        field5149 = null;
        field5135 = null;
        field5152 = null;
        field5124 = null;
        field5154 = null;
        field5137 = null;
        field5145 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
    private static final void method2221(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field5132 -= 3;
                int var2 = field5140[field5132];
                int var3 = field5140[field5132 + 1];
                int var4 = field5140[field5132 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class176 var5 = class518.method3014(var2, -84);
                if (var5.field2543 == null) {
                    var5.field2543 = new class176[var4 + 1];
                }
                if (var5.field2543.length <= var4) {
                    class176[] var6 = new class176[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2543.length; var7++) {
                        var6[var7] = var5.field2543[var7];
                    }
                    var5.field2543 = var6;
                }
                if (var4 > 0 && var5.field2543[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class176 var8 = new class176();
                var8.field2560 = var3;
                var8.field2661 = var8.field2588 = var5.field2588;
                var8.field2612 = var4;
                var5.field2543[var4] = var8;
                if (arg1) {
                    field5135 = var8;
                } else {
                    field5149 = var8;
                }
                class288.method1923((byte) -19, var5);
                return;
            }
            if (arg0 == 151) {
                class176 var9 = arg1 ? field5135 : field5149;
                if (var9.field2612 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class176 var10 = class518.method3014(var9.field2588, -124);
                var10.field2543[var9.field2612] = null;
                class288.method1923((byte) -19, var10);
                return;
            }
            if (arg0 == 152) {
                class176 var11 = class518.method3014(field5140[--field5132], 126);
                var11.field2543 = null;
                class288.method1923((byte) -19, var11);
                return;
            }
            if (arg0 == 200) {
                field5132 -= 2;
                int var12 = field5140[field5132];
                int var13 = field5140[field5132 + 1];
                class176 var14 = class333.method2152(false, var13, var12);
                if (var14 != null && var13 != -1) {
                    field5140[field5132++] = 1;
                    if (arg1) {
                        field5135 = var14;
                        return;
                    }
                    field5149 = var14;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5140[--field5132];
                class176 var16 = class518.method3014(var15, -126);
                if (var16 != null) {
                    field5140[field5132++] = 1;
                    if (arg1) {
                        field5135 = var16;
                        return;
                    }
                    field5149 = var16;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5140[--field5132];
                method2217(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5140[--field5132];
                method2230(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5132 -= 2;
                int var19 = field5140[field5132];
                int var20 = field5140[field5132 + 1];
                if (class251.field3549.field7933 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class624.field8789.length; var21++) {
                    if (class624.field8789[var21] == var19) {
                        class251.field3549.field7933.method3002(class176.field2677, var20, var21, -31);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class393.field5573.length; var22++) {
                    if (class393.field5573[var22] == var19) {
                        class251.field3549.field7933.method3002(class176.field2677, var20, var22, -70);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5132 -= 2;
                int var23 = field5140[field5132];
                int var24 = field5140[field5132 + 1];
                if (class251.field3549.field7933 == null) {
                    return;
                }
                class251.field3549.field7933.method3006(true, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5140[--field5132] != 0;
                if (class251.field3549.field7933 == null) {
                    return;
                }
                class251.field3549.field7933.method3003(var25, false);
                return;
            }
            if (arg0 == 411) {
                field5132 -= 2;
                int var26 = field5140[field5132];
                int var27 = field5140[field5132 + 1];
                if (class251.field3549.field7933 == null) {
                    return;
                }
                class251.field3549.field7933.method3005(var27, (byte) -27, var26, class526.field7490);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class176 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class518.method3014(field5140[--field5132], 127);
            } else {
                var28 = arg1 ? field5135 : field5149;
            }
            if (arg0 == 1000) {
                field5132 -= 4;
                var28.field2602 = field5140[field5132];
                var28.field2589 = field5140[field5132 + 1];
                int var29 = field5140[field5132 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field5140[field5132 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field2581 = (byte) var29;
                var28.field2634 = (byte) var30;
                class288.method1923((byte) -19, var28);
                class14.method131(var28, (byte) -110);
                if (var28.field2612 == -1) {
                    class766.method4227(var28.field2588, -513);
                }
                return;
            }
            if (arg0 == 1001) {
                field5132 -= 4;
                var28.field2530 = field5140[field5132];
                var28.field2498 = field5140[field5132 + 1];
                var28.field2514 = 0;
                var28.field2623 = 0;
                int var31 = field5140[field5132 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field5140[field5132 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field2655 = (byte) var31;
                var28.field2616 = (byte) var32;
                class288.method1923((byte) -19, var28);
                class14.method131(var28, (byte) -110);
                if (var28.field2560 == 0) {
                    class493.method2885(false, var28, (byte) -70);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field5140[--field5132] == 1;
                if (var28.field2591 != var33) {
                    var28.field2591 = var33;
                    class288.method1923((byte) -19, var28);
                }
                if (var28.field2612 == -1) {
                    class90.method640((byte) 125, var28.field2588);
                }
                return;
            }
            if (arg0 == 1004) {
                field5132 -= 2;
                var28.field2519 = field5140[field5132];
                var28.field2546 = field5140[field5132 + 1];
                class288.method1923((byte) -19, var28);
                class14.method131(var28, (byte) -110);
                if (var28.field2560 == 0) {
                    class493.method2885(false, var28, (byte) -42);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field2665 = field5140[--field5132] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class176 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class518.method3014(field5140[--field5132], 90);
            } else {
                var34 = arg1 ? field5135 : field5149;
            }
            if (arg0 == 1100) {
                field5132 -= 2;
                var34.field2620 = field5140[field5132];
                if (var34.field2620 > var34.field2629 - var34.field2673) {
                    var34.field2620 = var34.field2629 - var34.field2673;
                }
                if (var34.field2620 < 0) {
                    var34.field2620 = 0;
                }
                var34.field2508 = field5140[field5132 + 1];
                if (var34.field2508 > var34.field2542 - var34.field2664) {
                    var34.field2508 = var34.field2542 - var34.field2664;
                }
                if (var34.field2508 < 0) {
                    var34.field2508 = 0;
                }
                class288.method1923((byte) -19, var34);
                if (var34.field2612 == -1) {
                    class216.method1498((byte) 109, var34.field2588);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field2573 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                if (var34.field2612 == -1) {
                    class187.method1390(var34.field2588, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field2511 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field2538 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field2667 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field5140[--field5132];
                if (var34.field2638 != var35) {
                    var34.field2638 = var35;
                    class288.method1923((byte) -19, var34);
                }
                if (var34.field2612 == -1) {
                    class558.method3237(73, var34.field2588);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field2652 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field2518 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field2569 = 1;
                var34.field2656 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                if (var34.field2612 == -1) {
                    class187.method1389(var34.field2588, 121);
                }
                return;
            }
            if (arg0 == 1109) {
                field5132 -= 6;
                var34.field2548 = field5140[field5132];
                var34.field2547 = field5140[field5132 + 1];
                var34.field2597 = field5140[field5132 + 2];
                var34.field2520 = field5140[field5132 + 3];
                var34.field2632 = field5140[field5132 + 4];
                var34.field2636 = field5140[field5132 + 5];
                class288.method1923((byte) -19, var34);
                if (var34.field2612 == -1) {
                    class378.method2336((byte) 73, var34.field2588);
                    class267.method1752(10, var34.field2588);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field5140[--field5132];
                if (var34.field2609 != var36) {
                    var34.field2609 = var36;
                    var34.field2506 = 0;
                    var34.field2670 = 1;
                    var34.field2668 = 0;
                    class129 var37 = var34.field2609 == -1 ? null : class203.field2975.method1931((byte) -81, var34.field2609);
                    if (var37 != null) {
                        class384.method2350(var37, (byte) 117, var34.field2506);
                    }
                    class288.method1923((byte) -19, var34);
                }
                if (var34.field2612 == -1) {
                    class430.method2590(var34.field2588, 5);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field2557 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field5150[--field5134];
                if (!var38.equals(var34.field2672)) {
                    var34.field2672 = var38;
                    class288.method1923((byte) -19, var34);
                }
                if (var34.field2612 == -1) {
                    class693.method3908(122, var34.field2588);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field2654 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                if (var34.field2612 == -1) {
                    class647.method3697(0, var34.field2588);
                }
                return;
            }
            if (arg0 == 1114) {
                field5132 -= 3;
                var34.field2603 = field5140[field5132];
                var34.field2639 = field5140[field5132 + 1];
                var34.field2619 = field5140[field5132 + 2];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field2575 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field2501 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field2515 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field2505 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field2595 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1120) {
                field5132 -= 2;
                var34.field2629 = field5140[field5132];
                var34.field2542 = field5140[field5132 + 1];
                class288.method1923((byte) -19, var34);
                if (var34.field2560 == 0) {
                    class493.method2885(false, var34, (byte) -103);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field2558 = field5140[--field5132] == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field2636 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                if (var34.field2612 == -1) {
                    class378.method2336((byte) 125, var34.field2588);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field5140[--field5132];
                var34.field2564 = var39 == 1;
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1125) {
                field5132 -= 2;
                var34.field2523 = field5140[field5132];
                var34.field2539 = field5140[field5132 + 1];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field2566 = field5140[--field5132];
                class288.method1923((byte) -19, var34);
                return;
            }
            if (arg0 == 1127) {
                field5132 -= 2;
                int var40 = field5140[field5132];
                int var41 = field5140[field5132 + 1];
                class330 var42 = class788.field10824.method1609(var40, -128);
                if (var42.field4920 != var41) {
                    var34.method1329(var40, (byte) 124, var41);
                    return;
                }
                var34.method1317(var40, true);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field5140[--field5132];
                String var44 = field5150[--field5134];
                class330 var45 = class788.field10824.method1609(var43, -112);
                if (!var45.field4921.equals(var44)) {
                    var34.method1318(var43, var44, (byte) 82);
                    return;
                }
                var34.method1317(var43, true);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field5140[--field5132];
                if ((var34.field2560 == 5 || arg0 != 1129) && (var34.field2560 == 4 || arg0 != 1130)) {
                    if (var34.field2592 != var52) {
                        var34.field2592 = var52;
                        class288.method1923((byte) -19, var34);
                    }
                    if (var34.field2612 == -1) {
                        class408.method2459(var34.field2588, 0);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1131) {
                field5132 -= 3;
                int var46 = field5140[field5132];
                short var47 = (short) field5140[field5132 + 1];
                short var48 = (short) field5140[field5132 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method1322(5527, var47, var48, var46);
                    class288.method1923((byte) -19, var34);
                    if (var34.field2612 == -1) {
                        class649.method3710(var46, (byte) 63, var34.field2588);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field5132 -= 3;
                int var49 = field5140[field5132];
                short var50 = (short) field5140[field5132 + 1];
                short var51 = (short) field5140[field5132 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method1315(var50, var51, (byte) -79, var49);
                    class288.method1923((byte) -19, var34);
                    if (var34.field2612 == -1) {
                        class609.method3512(var49, 128, var34.field2588);
                    }
                    return;
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class176 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class518.method3014(field5140[--field5132], -38);
            } else {
                var53 = arg1 ? field5135 : field5149;
            }
            class288.method1923((byte) -19, var53);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5132 -= 2;
                int var54 = field5140[field5132];
                int var55 = field5140[field5132 + 1];
                if (var53.field2612 == -1) {
                    class255.method1682(9, var53.field2588);
                    class378.method2336((byte) 81, var53.field2588);
                    class267.method1752(10, var53.field2588);
                }
                if (var54 == -1) {
                    var53.field2569 = 1;
                    var53.field2656 = -1;
                    var53.field2540 = -1;
                    return;
                }
                var53.field2540 = var54;
                var53.field2648 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field2640 = true;
                } else {
                    var53.field2640 = false;
                }
                class501 var56 = class526.field7490.method3567(var54, true);
                var53.field2597 = var56.field7133;
                var53.field2520 = var56.field7128;
                var53.field2632 = var56.field7121;
                var53.field2548 = var56.field7143;
                var53.field2547 = var56.field7148;
                var53.field2636 = var56.field7147;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field2615 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field2615 = 1;
                } else {
                    var53.field2615 = 2;
                }
                if (var53.field2514 > 0) {
                    var53.field2636 = var53.field2636 * 32 / var53.field2514;
                    return;
                }
                if (var53.field2530 > 0) {
                    var53.field2636 = var53.field2636 * 32 / var53.field2530;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field2569 = 2;
                var53.field2656 = field5140[--field5132];
                if (var53.field2612 == -1) {
                    class187.method1389(var53.field2588, 115);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field2569 = 3;
                var53.field2656 = -1;
                if (var53.field2612 == -1) {
                    class187.method1389(var53.field2588, 113);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field2569 = 6;
                var53.field2656 = field5140[--field5132];
                if (var53.field2612 == -1) {
                    class187.method1389(var53.field2588, 110);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field2569 = 5;
                var53.field2656 = field5140[--field5132];
                if (var53.field2612 == -1) {
                    class187.method1389(var53.field2588, 109);
                }
                return;
            }
            if (arg0 == 1206) {
                field5132 -= 4;
                var53.field2585 = field5140[field5132];
                var53.field2577 = field5140[field5132 + 1];
                var53.field2532 = field5140[field5132 + 2];
                var53.field2628 = field5140[field5132 + 3];
                class288.method1923((byte) -19, var53);
                return;
            }
            if (arg0 == 1207) {
                field5132 -= 2;
                var53.field2550 = field5140[field5132];
                var53.field2549 = field5140[field5132 + 1];
                class288.method1923((byte) -19, var53);
                return;
            }
            if (arg0 == 1210) {
                field5132 -= 4;
                var53.field2656 = field5140[field5132];
                var53.field2525 = field5140[field5132 + 1];
                if (field5140[field5132 + 2] == 1) {
                    var53.field2569 = 9;
                } else {
                    var53.field2569 = 8;
                }
                if (field5140[field5132 + 3] == 1) {
                    var53.field2640 = true;
                } else {
                    var53.field2640 = false;
                }
                if (var53.field2612 == -1) {
                    class187.method1389(var53.field2588, 114);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field2569 = 5;
                var53.field2656 = class223.field3199;
                var53.field2525 = 0;
                if (var53.field2612 == -1) {
                    class187.method1389(var53.field2588, 125);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class176 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class518.method3014(field5140[--field5132], -97);
            } else {
                var57 = arg1 ? field5135 : field5149;
            }
            if (arg0 == 1300) {
                int var58 = field5140[--field5132] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method1327((byte) 0, var58, field5150[--field5134]);
                    return;
                }
                field5134--;
                return;
            }
            if (arg0 == 1301) {
                field5132 -= 2;
                int var59 = field5140[field5132];
                int var60 = field5140[field5132 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field2631 = null;
                    return;
                }
                var57.field2631 = class333.method2152(false, var60, var59);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field5140[--field5132];
                if (class31.field421 != var61 && class403.field5698 != var61 && class157.field2308 != var61) {
                    return;
                }
                var57.field2626 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field2642 = field5140[--field5132];
                return;
            }
            if (arg0 == 1304) {
                var57.field2674 = field5140[--field5132];
                return;
            }
            if (arg0 == 1305) {
                var57.field2662 = field5150[--field5134];
                return;
            }
            if (arg0 == 1306) {
                var57.field2598 = field5150[--field5134];
                return;
            }
            if (arg0 == 1307) {
                var57.field2618 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field2576 = field5140[--field5132];
                var57.field2556 = field5140[--field5132];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field5140[--field5132];
                int var63 = field5140[--field5132];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method1326(-1289, var63 - 1, var62);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field2503 = field5150[--field5134];
                return;
            }
            if (arg0 == 1311) {
                var57.field2651 = field5140[--field5132];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field5132 -= 3;
                    var64 = field5140[field5132] - 1;
                    var65 = field5140[field5132 + 1];
                    var66 = field5140[field5132 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field5132 -= 2;
                    var64 = 10;
                    var65 = field5140[field5132];
                    var66 = field5140[field5132 + 1];
                }
                if (var57.field2601 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field2601 = new byte[11];
                    var57.field2641 = new byte[11];
                    var57.field2590 = new int[11];
                }
                var57.field2601[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field2622 = false;
                    for (int var67 = 0; var67 < var57.field2601.length; var67++) {
                        if (var57.field2601[var67] != 0) {
                            var57.field2622 = true;
                            break;
                        }
                    }
                } else {
                    var57.field2622 = true;
                }
                var57.field2641[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field2587 = field5140[--field5132];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class176 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class518.method3014(field5140[--field5132], -58);
            } else {
                var68 = arg1 ? field5135 : field5149;
            }
            if (arg0 == 1499) {
                var68.method1314((byte) -59);
                return;
            }
            String var69 = field5150[--field5134];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field5140[--field5132];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field5140[--field5132];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field5150[--field5134];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field5139[--field5131]);
                } else {
                    var72[var73] = Integer.valueOf(field5140[--field5132]);
                }
            }
            int var74 = field5140[--field5132];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field2531 = var72;
            } else if (arg0 == 1401) {
                var68.field2522 = var72;
            } else if (arg0 == 1402) {
                var68.field2561 = var72;
            } else if (arg0 == 1403) {
                var68.field2586 = var72;
            } else if (arg0 == 1404) {
                var68.field2552 = var72;
            } else if (arg0 == 1405) {
                var68.field2604 = var72;
            } else if (arg0 == 1406) {
                var68.field2633 = var72;
            } else if (arg0 == 1407) {
                var68.field2583 = var72;
                var68.field2555 = var70;
            } else if (arg0 == 1408) {
                var68.field2596 = var72;
            } else if (arg0 == 1409) {
                var68.field2529 = var72;
            } else if (arg0 == 1410) {
                var68.field2579 = var72;
            } else if (arg0 == 1411) {
                var68.field2535 = var72;
            } else if (arg0 == 1412) {
                var68.field2572 = var72;
            } else if (arg0 == 1414) {
                var68.field2617 = var72;
                var68.field2559 = var70;
            } else if (arg0 == 1415) {
                var68.field2606 = var72;
                var68.field2650 = var70;
            } else if (arg0 == 1416) {
                var68.field2643 = var72;
            } else if (arg0 == 1417) {
                var68.field2533 = var72;
            } else if (arg0 == 1418) {
                var68.field2507 = var72;
            } else if (arg0 == 1419) {
                var68.field2607 = var72;
            } else if (arg0 == 1420) {
                var68.field2600 = var72;
            } else if (arg0 == 1421) {
                var68.field2570 = var72;
            } else if (arg0 == 1422) {
                var68.field2562 = var72;
            } else if (arg0 == 1423) {
                var68.field2553 = var72;
            } else if (arg0 == 1424) {
                var68.field2658 = var72;
            } else if (arg0 == 1425) {
                var68.field2630 = var72;
            } else if (arg0 == 1426) {
                var68.field2660 = var72;
            } else if (arg0 == 1427) {
                var68.field2584 = var72;
            } else if (arg0 == 1428) {
                var68.field2657 = var72;
                var68.field2594 = var70;
            } else if (arg0 == 1429) {
                var68.field2644 = var72;
                var68.field2545 = var70;
            } else if (arg0 == 1430) {
                var68.field2568 = var72;
            } else if (arg0 == 1431) {
                var68.field2567 = var72;
            } else if (arg0 == 1432) {
                var68.field2582 = var72;
            }
            var68.field2571 = true;
            return;
        } else if (arg0 < 1600) {
            class176 var75 = arg1 ? field5135 : field5149;
            if (arg0 == 1500) {
                field5140[field5132++] = var75.field2599;
                return;
            }
            if (arg0 == 1501) {
                field5140[field5132++] = var75.field2578;
                return;
            }
            if (arg0 == 1502) {
                field5140[field5132++] = var75.field2673;
                return;
            }
            if (arg0 == 1503) {
                field5140[field5132++] = var75.field2664;
                return;
            }
            if (arg0 == 1504) {
                field5140[field5132++] = var75.field2591 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field5140[field5132++] = var75.field2661;
                return;
            }
            if (arg0 == 1506) {
                class176 var76 = class686.method3875(3, var75);
                field5140[field5132++] = var76 == null ? -1 : var76.field2588;
                return;
            }
        } else if (arg0 < 1700) {
            class176 var77 = arg1 ? field5135 : field5149;
            if (arg0 == 1600) {
                field5140[field5132++] = var77.field2620;
                return;
            }
            if (arg0 == 1601) {
                field5140[field5132++] = var77.field2508;
                return;
            }
            if (arg0 == 1602) {
                field5150[field5134++] = var77.field2672;
                return;
            }
            if (arg0 == 1603) {
                field5140[field5132++] = var77.field2629;
                return;
            }
            if (arg0 == 1604) {
                field5140[field5132++] = var77.field2542;
                return;
            }
            if (arg0 == 1605) {
                field5140[field5132++] = var77.field2636;
                return;
            }
            if (arg0 == 1606) {
                field5140[field5132++] = var77.field2597;
                return;
            }
            if (arg0 == 1607) {
                field5140[field5132++] = var77.field2632;
                return;
            }
            if (arg0 == 1608) {
                field5140[field5132++] = var77.field2520;
                return;
            }
            if (arg0 == 1609) {
                field5140[field5132++] = var77.field2538;
                return;
            }
            if (arg0 == 1610) {
                field5140[field5132++] = var77.field2548;
                return;
            }
            if (arg0 == 1611) {
                field5140[field5132++] = var77.field2547;
                return;
            }
            if (arg0 == 1612) {
                field5140[field5132++] = var77.field2638;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field5140[--field5132];
                class330 var79 = class788.field10824.method1609(var78, -96);
                if (var79.method2134(-19881)) {
                    field5150[field5134++] = var77.method1332(var79.field4921, (byte) -9, var78);
                    return;
                }
                field5140[field5132++] = var77.method1316((byte) 118, var79.field4920, var78);
                return;
            }
            if (arg0 == 1614) {
                field5140[field5132++] = var77.field2652;
                return;
            }
            if (arg0 == 2614) {
                field5140[field5132++] = var77.field2569 == 1 ? var77.field2656 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class176 var80 = arg1 ? field5135 : field5149;
            if (arg0 == 1700) {
                field5140[field5132++] = var80.field2540;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field2540 != -1) {
                    field5140[field5132++] = var80.field2648;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field5140[field5132++] = var80.field2612;
                return;
            }
        } else if (arg0 < 1900) {
            class176 var81 = arg1 ? field5135 : field5149;
            if (arg0 == 1800) {
                field5140[field5132++] = client.method2049(var81).method3748(91);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field5140[--field5132];
                int var383 = var82 - 1;
                if (var81.field2618 != null && var383 < var81.field2618.length && var81.field2618[var383] != null) {
                    field5150[field5134++] = var81.field2618[var383];
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field2662 == null) {
                    field5150[field5134++] = "";
                    return;
                }
                field5150[field5134++] = var81.field2662;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class176 var381;
            if (arg0 >= 2000) {
                var381 = class518.method3014(field5140[--field5132], 80);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field5135 : field5149;
            }
            if (field5155 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field2584 == null) {
                    return;
                }
                class140 var382 = new class140();
                var382.field1802 = var381;
                var382.field1808 = var381.field2584;
                var382.field1806 = field5155 + 1;
                class526.field7486.method2510(var382, false);
                return;
            }
        } else if (arg0 < 2600) {
            class176 var83 = class518.method3014(field5140[--field5132], 97);
            if (arg0 == 2500) {
                field5140[field5132++] = var83.field2599;
                return;
            }
            if (arg0 == 2501) {
                field5140[field5132++] = var83.field2578;
                return;
            }
            if (arg0 == 2502) {
                field5140[field5132++] = var83.field2673;
                return;
            }
            if (arg0 == 2503) {
                field5140[field5132++] = var83.field2664;
                return;
            }
            if (arg0 == 2504) {
                field5140[field5132++] = var83.field2591 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field5140[field5132++] = var83.field2661;
                return;
            }
            if (arg0 == 1506) {
                class176 var84 = class686.method3875(3, var83);
                field5140[field5132++] = var84 == null ? -1 : var84.field2588;
                return;
            }
        } else if (arg0 < 2700) {
            class176 var85 = class518.method3014(field5140[--field5132], 117);
            if (arg0 == 2600) {
                field5140[field5132++] = var85.field2620;
                return;
            }
            if (arg0 == 2601) {
                field5140[field5132++] = var85.field2508;
                return;
            }
            if (arg0 == 2602) {
                field5150[field5134++] = var85.field2672;
                return;
            }
            if (arg0 == 2603) {
                field5140[field5132++] = var85.field2629;
                return;
            }
            if (arg0 == 2604) {
                field5140[field5132++] = var85.field2542;
                return;
            }
            if (arg0 == 2605) {
                field5140[field5132++] = var85.field2636;
                return;
            }
            if (arg0 == 2606) {
                field5140[field5132++] = var85.field2597;
                return;
            }
            if (arg0 == 2607) {
                field5140[field5132++] = var85.field2632;
                return;
            }
            if (arg0 == 2608) {
                field5140[field5132++] = var85.field2520;
                return;
            }
            if (arg0 == 2609) {
                field5140[field5132++] = var85.field2538;
                return;
            }
            if (arg0 == 2610) {
                field5140[field5132++] = var85.field2548;
                return;
            }
            if (arg0 == 2611) {
                field5140[field5132++] = var85.field2547;
                return;
            }
            if (arg0 == 2612) {
                field5140[field5132++] = var85.field2638;
                return;
            }
            if (arg0 == 2613) {
                field5140[field5132++] = var85.field2652;
                return;
            }
            if (arg0 == 2614) {
                field5140[field5132++] = var85.field2569 == 1 ? var85.field2656 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class176 var86 = class518.method3014(field5140[--field5132], -41);
                field5140[field5132++] = var86.field2540;
                return;
            }
            if (arg0 == 2701) {
                class176 var87 = class518.method3014(field5140[--field5132], 112);
                if (var87.field2540 != -1) {
                    field5140[field5132++] = var87.field2648;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field5140[--field5132];
                class329 var89 = (class329) class251.field3547.method380((byte) -3, (long) var88);
                if (var89 != null) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class176 var90 = class518.method3014(field5140[--field5132], 124);
                if (var90.field2543 == null) {
                    field5140[field5132++] = 0;
                    return;
                }
                int var91 = var90.field2543.length;
                for (int var92 = 0; var92 < var90.field2543.length; var92++) {
                    if (var90.field2543[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field5140[field5132++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field5132 -= 2;
                int var93 = field5140[field5132];
                int var94 = field5140[field5132 + 1];
                class329 var95 = (class329) class251.field3547.method380((byte) -3, (long) var93);
                if (var95 != null && var95.field4912 == var94) {
                    field5140[field5132++] = 1;
                    return;
                } else {
                    field5140[field5132++] = 0;
                    return;
                }
            }
        } else if (arg0 < 2900) {
            class176 var96 = class518.method3014(field5140[--field5132], -126);
            if (arg0 == 2800) {
                field5140[field5132++] = client.method2049(var96).method3748(58);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field5140[--field5132];
                int var384 = var97 - 1;
                if (var96.field2618 != null && var384 < var96.field2618.length && var96.field2618[var384] != null) {
                    field5150[field5134++] = var96.field2618[var384];
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field2662 == null) {
                    field5150[field5134++] = "";
                    return;
                }
                field5150[field5134++] = var96.field2662;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field5150[--field5134];
                class48.method314(var98, 0);
                return;
            }
            if (arg0 == 3101) {
                field5132 -= 2;
                class96.method679(class251.field3549, field5140[field5132 + 1], field5140[field5132], true);
                return;
            }
            if (arg0 == 3103) {
                class572.method3321(true, 7713);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field5150[--field5134];
                int var100 = 0;
                if (class55.method358(var99, 10)) {
                    var100 = class4.method25(0, var99);
                }
                field5144++;
                class731 var101 = class155.method1222(260, class296.field4457, class237.field3417);
                var101.field10211.method879((byte) -122, var100);
                class533.method3088(var101, 0);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field5150[--field5134];
                field5129++;
                class731 var103 = class155.method1222(260, class578.field8168, class237.field3417);
                var103.field10211.method851((byte) -2, var102.length() + 1);
                var103.field10211.method880(true, var102);
                class533.method3088(var103, 0);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field5150[--field5134];
                field5125++;
                class731 var105 = class155.method1222(260, class772.field10649, class237.field3417);
                var105.field10211.method851((byte) -2, var104.length() + 1);
                var105.field10211.method880(true, var104);
                class533.method3088(var105, 0);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field5140[--field5132];
                String var107 = field5150[--field5134];
                class662.method3773(0, var106, var107);
                return;
            }
            if (arg0 == 3108) {
                field5132 -= 3;
                int var108 = field5140[field5132];
                int var109 = field5140[field5132 + 1];
                int var110 = field5140[field5132 + 2];
                class176 var111 = class518.method3014(var110, -42);
                class423.method2526(var108, true, var111, var109);
                return;
            }
            if (arg0 == 3109) {
                field5132 -= 2;
                int var112 = field5140[field5132];
                int var113 = field5140[field5132 + 1];
                class176 var114 = arg1 ? field5135 : field5149;
                class423.method2526(var112, true, var114, var113);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field5140[--field5132];
                field5126++;
                class731 var116 = class155.method1222(260, class655.field9238, class237.field3417);
                var116.field10211.method860(var115, (byte) 126);
                class533.method3088(var116, 0);
                return;
            }
            if (arg0 == 3111) {
                field5132 -= 2;
                int var117 = field5140[field5132];
                int var118 = field5140[field5132 + 1];
                class329 var119 = (class329) class251.field3547.method380((byte) -3, (long) var117);
                if (var119 != null) {
                    class224.method1551((byte) 26, var119, true, var119.field4912 != var118);
                }
                class664.method3783(var118, var117, 6, 3, true);
                return;
            }
            if (arg0 == 3112) {
                field5132--;
                int var120 = field5140[field5132];
                class329 var121 = (class329) class251.field3547.method380((byte) -3, (long) var120);
                if (var121 != null && var121.field4914 == 3) {
                    class224.method1551((byte) 26, var121, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class599.method3466(-1, field5150[--field5134]);
                return;
            }
            if (arg0 == 3114) {
                field5132 -= 2;
                int var122 = field5140[field5132];
                int var123 = field5140[field5132 + 1];
                String var124 = field5150[--field5134];
                class422.method2520(var122, var123, var124, "", "", -87, "");
                return;
            }
            if (arg0 == 3115) {
                field5132 -= 11;
                class336[] var125 = class329.method2126(true);
                class185[] var126 = class674.method3822(true);
                class368.method2285(field5140[field5132 + 3], (byte) 49, var126[field5140[field5132 + 1]], field5140[field5132 + 7], var125[field5140[field5132]], field5140[field5132 + 4], field5140[field5132 + 8], field5140[field5132 + 6], field5140[field5132 + 2], field5140[field5132 + 9], field5140[field5132 + 10], field5140[field5132 + 5]);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field5140[--field5132];
                field5144++;
                class731 var128 = class155.method1222(260, class298.field4486, class237.field3417);
                var128.field10211.method860(var127, (byte) 118);
                class533.method3088(var128, 0);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field5150[--field5134];
                class731 var130 = class155.method1222(260, class777.field10717, class237.field3417);
                var130.field10211.method851((byte) -2, var129.length() + 1);
                var130.field10211.method880(true, var129);
                class533.method3088(var130, 0);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field5132 -= 3;
                class490.method2864(field5140[field5132], field5140[field5132 + 2], true, field5140[field5132 + 1], 256, 255);
                return;
            }
            if (arg0 == 3201) {
                class534.method3091(255, 50, (byte) 100, field5140[--field5132]);
                return;
            }
            if (arg0 == 3202) {
                field5132 -= 2;
                class659.method3766(field5140[field5132 + 1], field5140[field5132], 0, 255);
                return;
            }
            if (arg0 == 3203) {
                field5132 -= 4;
                class490.method2864(field5140[field5132], field5140[field5132 + 2], true, field5140[field5132 + 1], 256, field5140[field5132 + 3]);
                return;
            }
            if (arg0 == 3204) {
                field5132 -= 3;
                class534.method3091(field5140[field5132 + 1], field5140[field5132 + 2], (byte) 100, field5140[field5132]);
                return;
            }
            if (arg0 == 3205) {
                field5132 -= 3;
                class659.method3766(field5140[field5132 + 1], field5140[field5132], 0, field5140[field5132 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field5132 -= 4;
                class256.method1686(256, field5140[field5132 + 2], (byte) 118, field5140[field5132], false, field5140[field5132 + 1], field5140[field5132 + 3]);
                return;
            }
            if (arg0 == 3207) {
                field5132 -= 4;
                class256.method1686(256, field5140[field5132 + 2], (byte) 98, field5140[field5132], true, field5140[field5132 + 1], field5140[field5132 + 3]);
                return;
            }
            if (arg0 == 3208) {
                field5132 -= 5;
                class490.method2864(field5140[field5132], field5140[field5132 + 2], true, field5140[field5132 + 1], field5140[field5132 + 4], field5140[field5132 + 3]);
                return;
            }
            if (arg0 == 3209) {
                field5132 -= 5;
                class256.method1686(field5140[field5132 + 4], field5140[field5132 + 2], (byte) 88, field5140[field5132], false, field5140[field5132 + 1], field5140[field5132 + 3]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field5140[field5132++] = class673.field9441;
                return;
            }
            if (arg0 == 3301) {
                field5132 -= 2;
                int var131 = field5140[field5132];
                int var132 = field5140[field5132 + 1];
                field5140[field5132++] = class327.method2121(false, var132, -28980, var131);
                return;
            }
            if (arg0 == 3302) {
                field5132 -= 2;
                int var133 = field5140[field5132];
                int var134 = field5140[field5132 + 1];
                field5140[field5132++] = class662.method3774(var134, false, (byte) -41, var133);
                return;
            }
            if (arg0 == 3303) {
                field5132 -= 2;
                int var135 = field5140[field5132];
                int var136 = field5140[field5132 + 1];
                field5140[field5132++] = class378.method2337(var136, var135, false, true);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field5140[--field5132];
                field5140[field5132++] = class783.field10778.method3934(true, var137).field9730;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field5140[--field5132];
                field5140[field5132++] = class575.field8138[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field5140[--field5132];
                field5140[field5132++] = class288.field4398[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field5140[--field5132];
                field5140[field5132++] = class478.field6788[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class251.field3549.field7710;
                int var142 = (class251.field3549.field7718 >> 9) + class103.field1295;
                int var143 = (class251.field3549.field7719 >> 9) + class175.field2496;
                field5140[field5132++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field5140[--field5132];
                field5140[field5132++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field5140[--field5132];
                field5140[field5132++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field5140[--field5132];
                field5140[field5132++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field5140[field5132++] = class100.field1266 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field5132 -= 2;
                int var147 = field5140[field5132];
                int var148 = field5140[field5132 + 1];
                field5140[field5132++] = class327.method2121(true, var148, -28980, var147);
                return;
            }
            if (arg0 == 3314) {
                field5132 -= 2;
                int var149 = field5140[field5132];
                int var150 = field5140[field5132 + 1];
                field5140[field5132++] = class662.method3774(var150, true, (byte) -41, var149);
                return;
            }
            if (arg0 == 3315) {
                field5132 -= 2;
                int var151 = field5140[field5132];
                int var152 = field5140[field5132 + 1];
                field5140[field5132++] = class378.method2337(var152, var151, true, true);
                return;
            }
            if (arg0 == 3316) {
                if (class282.field4334 >= 2) {
                    field5140[field5132++] = class282.field4334;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field5140[field5132++] = class638.field8975;
                return;
            }
            if (arg0 == 3318) {
                field5140[field5132++] = class444.field6319.field6989;
                return;
            }
            if (arg0 == 3321) {
                field5140[field5132++] = class604.field8500;
                return;
            }
            if (arg0 == 3322) {
                field5140[field5132++] = class181.field2756;
                return;
            }
            if (arg0 == 3323) {
                if (class244.field3505 >= 5 && class244.field3505 <= 9) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class244.field3505 >= 5 && class244.field3505 <= 9) {
                    field5140[field5132++] = class244.field3505;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field5140[field5132++] = class279.field3936 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field5140[field5132++] = class251.field3549.field7975;
                return;
            }
            if (arg0 == 3327) {
                field5140[field5132++] = class251.field3549.field7933 != null && class251.field3549.field7933.field7347 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field5140[field5132++] = class365.field5272 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field5140[--field5132];
                field5140[field5132++] = class539.method3112(0, var153, false);
                return;
            }
            if (arg0 == 3331) {
                field5132 -= 2;
                int var154 = field5140[field5132];
                int var155 = field5140[field5132 + 1];
                field5140[field5132++] = class213.method1492(false, 0, false, var155, var154);
                return;
            }
            if (arg0 == 3332) {
                field5132 -= 2;
                int var156 = field5140[field5132];
                int var157 = field5140[field5132 + 1];
                field5140[field5132++] = class213.method1492(false, 0, true, var157, var156);
                return;
            }
            if (arg0 == 3333) {
                field5140[field5132++] = class222.field3160;
                return;
            }
            if (arg0 == 3335) {
                field5140[field5132++] = class526.field7494;
                return;
            }
            if (arg0 == 3336) {
                field5132 -= 4;
                int var158 = field5140[field5132];
                int var159 = field5140[field5132 + 1];
                int var160 = field5140[field5132 + 2];
                int var161 = field5140[field5132 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field5140[field5132++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field5140[field5132++] = class87.field1139;
                return;
            }
            if (arg0 == 3338) {
                field5140[field5132++] = class183.method1367(100);
                return;
            }
            if (arg0 == 3339) {
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field5140[field5132++] = class130.field1709 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field5140[field5132++] = class82.field1092 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field5140[field5132++] = class694.field9812.method3201((byte) 116);
                return;
            }
            if (arg0 == 3343) {
                field5140[field5132++] = class694.field9812.method3197((byte) -127);
                return;
            }
            if (arg0 == 3344) {
                field5150[field5134++] = class293.method1979(16307);
                return;
            }
            if (arg0 == 3345) {
                field5150[field5134++] = class177.method1341((byte) 101);
                return;
            }
            if (arg0 == 3346) {
                field5140[field5132++] = class318.method2079((byte) -37);
                return;
            }
            if (arg0 == 3347) {
                field5140[field5132++] = class776.field10708;
                return;
            }
            if (arg0 == 3349) {
                field5140[field5132++] = class251.field3549.field6420.method224((byte) -82) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field5132 -= 2;
                int var165 = field5140[field5132];
                int var166 = field5140[field5132 + 1];
                class3 var167 = class391.field5554.method237(var165, 127);
                field5150[field5134++] = var167.method13(var166, (byte) 89);
                return;
            }
            if (arg0 == 3408) {
                field5132 -= 4;
                int var168 = field5140[field5132];
                int var169 = field5140[field5132 + 1];
                int var170 = field5140[field5132 + 2];
                int var171 = field5140[field5132 + 3];
                class3 var172 = class391.field5554.method237(var170, 127);
                if (var172.field25 == var168 && var172.field36 == var169) {
                    if (var169 == 115) {
                        field5150[field5134++] = var172.method13(var171, (byte) 43);
                        return;
                    }
                    field5140[field5132++] = var172.method17((byte) -87, var171);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field5132 -= 3;
                int var173 = field5140[field5132];
                int var174 = field5140[field5132 + 1];
                int var175 = field5140[field5132 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class3 var176 = class391.field5554.method237(var174, 127);
                if (var176.field36 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field5140[field5132++] = var176.method23(var175, true) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field5140[--field5132];
                String var178 = field5150[--field5134];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class3 var179 = class391.field5554.method237(var177, 127);
                if (var179.field36 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field5140[field5132++] = var179.method18(true, var178) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field5140[--field5132];
                class3 var181 = class391.field5554.method237(var180, 127);
                field5140[field5132++] = var181.field35.method381(65);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class736.field10279 == 0) {
                    field5140[field5132++] = -2;
                    return;
                }
                if (class736.field10279 == 1) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = class50.field719;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field5140[--field5132];
                if (class736.field10279 == 2 && var182 < class50.field719) {
                    field5150[field5134++] = class662.field9293[var182];
                    if (class738.field10303[var182] != null) {
                        field5150[field5134++] = class738.field10303[var182];
                        return;
                    }
                    field5150[field5134++] = "";
                    return;
                }
                field5150[field5134++] = "";
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field5140[--field5132];
                if (class736.field10279 == 2 && var183 < class50.field719) {
                    field5140[field5132++] = class146.field1861[var183];
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field5140[--field5132];
                if (class736.field10279 == 2 && var184 < class50.field719) {
                    field5140[field5132++] = class291.field4414[var184];
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field5150[--field5134];
                int var186 = field5140[--field5132];
                class533.method3089(1, var185, var186);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field5150[--field5134];
                class155.method1224(0, var187);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field5150[--field5134];
                class244.method1654(1, var188);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field5150[--field5134];
                class263.method1730(false, var189, (byte) -113);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field5150[--field5134];
                class155.method1228(1, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field5150[--field5134];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field5140[field5132++] = class29.method211(1, var191) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field5140[--field5132];
                if (class736.field10279 == 2 && var192 < class50.field719) {
                    field5150[field5134++] = class792.field10868[var192];
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class438.field6283 != null) {
                    field5150[field5134++] = class577.method3352(class438.field6283, 103);
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class438.field6283 != null) {
                    field5140[field5132++] = class75.field1011;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field5140[--field5132];
                if (class438.field6283 != null && var193 < class75.field1011) {
                    field5150[field5134++] = class269.field3772[var193].field1294;
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field5140[--field5132];
                if (class438.field6283 != null && var194 < class75.field1011) {
                    field5140[field5132++] = class269.field3772[var194].field1288;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field5140[--field5132];
                if (class438.field6283 != null && var195 < class75.field1011) {
                    field5140[field5132++] = class269.field3772[var195].field1287;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field5140[field5132++] = class275.field3821;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field5150[--field5134];
                class673.method3812(3, var196);
                return;
            }
            if (arg0 == 3618) {
                field5140[field5132++] = class465.field6626;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field5150[--field5134];
                class259.method1701(46, var197);
                return;
            }
            if (arg0 == 3620) {
                class339.method2176((byte) -40);
                return;
            }
            if (arg0 == 3621) {
                if (class736.field10279 == 0) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = class155.field2304;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field5140[--field5132];
                if (class736.field10279 != 0 && var198 < class155.field2304) {
                    field5150[field5134++] = class127.field1657[var198];
                    if (class241.field3456[var198] != null) {
                        field5150[field5134++] = class241.field3456[var198];
                        return;
                    }
                    field5150[field5134++] = "";
                    return;
                }
                field5150[field5134++] = "";
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field5150[--field5134];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field5140[field5132++] = class250.method1669((byte) 116, var199) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field5140[--field5132];
                if (class269.field3772 != null && var200 < class75.field1011 && class269.field3772[var200].field1292.equalsIgnoreCase(class251.field3549.field7955)) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class649.field9136 != null) {
                    field5150[field5134++] = class649.field9136;
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field5140[--field5132];
                if (class438.field6283 != null && var201 < class75.field1011) {
                    field5150[field5134++] = class269.field3772[var201].field1290;
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field5140[--field5132];
                if (class736.field10279 == 2 && var202 >= 0 && var202 < class50.field719) {
                    field5140[field5132++] = class10.field223[var202] ? 1 : 0;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field5150[--field5134];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field5140[field5132++] = class535.method3098(false, var203);
                return;
            }
            if (arg0 == 3629) {
                field5140[field5132++] = class139.field1795;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field5150[--field5134];
                class263.method1730(true, var204, (byte) -50);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field5140[--field5132];
                field5140[field5132++] = class423.field5972[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field5140[--field5132];
                if (class438.field6283 != null && var206 < class75.field1011) {
                    field5150[field5134++] = class269.field3772[var206].field1292;
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field5140[--field5132];
                if (class736.field10279 != 0 && var207 < class155.field2304) {
                    field5150[field5134++] = class745.field10367[var207];
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class492.field6992 != null) {
                    field5140[field5132++] = 1;
                    field5124 = class492.field6992;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class584.field8265 != null) {
                    field5140[field5132++] = 1;
                    field5124 = class584.field8265;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field5150[field5134++] = field5124.field930;
                return;
            }
            if (arg0 == 3703) {
                field5140[field5132++] = field5124.field937 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field5140[field5132++] = field5124.field934;
                return;
            }
            if (arg0 == 3705) {
                field5140[field5132++] = field5124.field911;
                return;
            }
            if (arg0 == 3706) {
                field5140[field5132++] = field5124.field910;
                return;
            }
            if (arg0 == 3707) {
                field5140[field5132++] = field5124.field946;
                return;
            }
            if (arg0 == 3709) {
                field5140[field5132++] = field5124.field955;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field5140[--field5132];
                field5150[field5134++] = field5124.field948[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field5140[--field5132];
                field5140[field5132++] = field5124.field953[var209];
                return;
            }
            if (arg0 == 3712) {
                field5140[field5132++] = field5124.field917;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field5140[--field5132];
                field5150[field5134++] = field5124.field923[var210];
                return;
            }
            if (arg0 == 3714) {
                field5132 -= 3;
                int var211 = field5140[field5132];
                int var212 = field5140[field5132 + 1];
                int var213 = field5140[field5132 + 2];
                field5140[field5132++] = field5124.method543(-29318, var213, var211, var212);
                return;
            }
            if (arg0 == 3715) {
                field5140[field5132++] = field5124.field941;
                return;
            }
            if (arg0 == 3716) {
                field5140[field5132++] = field5124.field926;
                return;
            }
            if (arg0 == 3717) {
                field5140[field5132++] = field5124.method534(-3296, field5150[--field5134]);
                return;
            }
            if (arg0 == 3718) {
                field5140[field5132 - 1] = field5124.method552((byte) -110)[field5140[field5132 - 1]];
                return;
            }
            if (arg0 == 3750) {
                if (class48.field689 != null) {
                    field5140[field5132++] = 1;
                    field5154 = class48.field689;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class777.field10725 != null) {
                    field5140[field5132++] = 1;
                    field5154 = class777.field10725;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field5150[field5134++] = field5154.field9771;
                return;
            }
            if (arg0 == 3753) {
                field5140[field5132++] = field5154.field9772;
                return;
            }
            if (arg0 == 3754) {
                field5140[field5132++] = field5154.field9785;
                return;
            }
            if (arg0 == 3755) {
                field5140[field5132++] = field5154.field9770;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field5140[--field5132];
                field5150[field5134++] = field5154.field9778[var214].field1148;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field5140[--field5132];
                field5140[field5132++] = field5154.field9778[var215].field1147;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field5140[--field5132];
                field5140[field5132++] = field5154.field9778[var216].field1145;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field5140[--field5132];
                class143.method988(var217, (byte) -83, class777.field10725 == field5154);
                return;
            }
            if (arg0 == 3760) {
                field5140[field5132++] = field5154.method3892(field5150[--field5134], 1);
                return;
            }
            if (arg0 == 3761) {
                field5140[field5132 - 1] = field5154.method3894(520)[field5140[field5132 - 1]];
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field5140[--field5132];
                field5140[field5132++] = class318.field4730[var218].method3225(-1);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field5140[--field5132];
                field5140[field5132++] = class318.field4730[var219].field7891;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field5140[--field5132];
                field5140[field5132++] = class318.field4730[var220].field7894;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field5140[--field5132];
                field5140[field5132++] = class318.field4730[var221].field7882;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field5140[--field5132];
                field5140[field5132++] = class318.field4730[var222].field7893;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field5140[--field5132];
                field5140[field5132++] = class318.field4730[var223].field7888;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field5140[--field5132];
                int var225 = class318.field4730[var224].method3227(122);
                field5140[field5132++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field5140[--field5132];
                int var227 = class318.field4730[var226].method3227(89);
                field5140[field5132++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field5140[--field5132];
                int var229 = class318.field4730[var228].method3227(113);
                field5140[field5132++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field5140[--field5132];
                int var231 = class318.field4730[var230].method3227(-96);
                field5140[field5132++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field5132 -= 2;
                int var232 = field5140[field5132];
                int var233 = field5140[field5132 + 1];
                field5140[field5132++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field5132 -= 2;
                int var234 = field5140[field5132];
                int var235 = field5140[field5132 + 1];
                field5140[field5132++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field5132 -= 2;
                int var236 = field5140[field5132];
                int var237 = field5140[field5132 + 1];
                field5140[field5132++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field5132 -= 2;
                int var238 = field5140[field5132];
                int var239 = field5140[field5132 + 1];
                field5140[field5132++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field5140[--field5132];
                field5140[field5132++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field5140[--field5132];
                field5140[field5132++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field5132 -= 5;
                int var242 = field5140[field5132];
                int var243 = field5140[field5132 + 1];
                int var244 = field5140[field5132 + 2];
                int var245 = field5140[field5132 + 3];
                int var246 = field5140[field5132 + 4];
                field5140[field5132++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field5132 -= 2;
                long var247 = (long) field5140[field5132];
                long var249 = (long) field5140[field5132 + 1];
                field5140[field5132++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field5132 -= 2;
                int var251 = field5140[field5132];
                int var252 = field5140[field5132 + 1];
                field5140[field5132++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field5132 -= 2;
                int var253 = field5140[field5132];
                int var254 = field5140[field5132 + 1];
                field5140[field5132++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field5132 -= 2;
                int var255 = field5140[field5132];
                int var256 = field5140[field5132 + 1];
                field5140[field5132++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field5132 -= 2;
                int var257 = field5140[field5132];
                int var258 = field5140[field5132 + 1];
                field5140[field5132++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field5132 -= 2;
                int var259 = field5140[field5132];
                int var260 = field5140[field5132 + 1];
                if (var259 == 0) {
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field5132 -= 2;
                int var261 = field5140[field5132];
                int var262 = field5140[field5132 + 1];
                if (var261 == 0) {
                    field5140[field5132++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field5140[field5132++] = Integer.MAX_VALUE;
                    return;
                }
                field5140[field5132++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field5132 -= 2;
                int var263 = field5140[field5132];
                int var264 = field5140[field5132 + 1];
                field5140[field5132++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field5132 -= 2;
                int var265 = field5140[field5132];
                int var266 = field5140[field5132 + 1];
                field5140[field5132++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field5132 -= 2;
                int var267 = field5140[field5132];
                int var268 = field5140[field5132 + 1];
                field5140[field5132++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field5132 -= 2;
                int var269 = field5140[field5132];
                int var270 = field5140[field5132 + 1];
                field5140[field5132++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field5132 -= 3;
                long var271 = (long) field5140[field5132];
                long var273 = (long) field5140[field5132 + 1];
                long var275 = (long) field5140[field5132 + 2];
                field5140[field5132++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field5132 -= 2;
                int var277 = field5140[field5132];
                int var278 = field5140[field5132 + 1];
                if (var277 > 700 || var278 > 700) {
                    field5140[field5132++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field5140[field5132++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field5140[--field5132];
                field5140[field5132++] = class595.field8378[class162.method1275(16287, var281) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field5150[--field5134];
                int var283 = field5140[--field5132];
                field5150[field5134++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field5134 -= 2;
                String var284 = field5150[field5134];
                String var285 = field5150[field5134 + 1];
                field5150[field5134++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field5150[--field5134];
                int var287 = field5140[--field5132];
                field5150[field5134++] = var286 + class197.method1426(true, var287, 3272);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field5150[--field5134];
                field5150[field5134++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field5150[field5134++] = class338.method2172(class99.method693((byte) 111, field5140[--field5132]), (byte) -69, class526.field7494);
                return;
            }
            if (arg0 == 4105) {
                field5134 -= 2;
                String var289 = field5150[field5134];
                String var290 = field5150[field5134 + 1];
                if (class251.field3549.field7933 != null && class251.field3549.field7933.field7347) {
                    field5150[field5134++] = var290;
                    return;
                }
                field5150[field5134++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field5140[--field5132];
                field5150[field5134++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field5134 -= 2;
                field5140[field5132++] = class466.method2754((byte) 50, field5150[field5134], class526.field7494, field5150[field5134 + 1]);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field5150[--field5134];
                field5132 -= 2;
                int var293 = field5140[field5132];
                int var294 = field5140[field5132 + 1];
                class263 var295 = class7.method45(0, 18925, class7.field79, var294);
                field5140[field5132++] = var295.method1733(var292, class541.field7591, var293, -117);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field5150[--field5134];
                field5132 -= 2;
                int var297 = field5140[field5132];
                int var298 = field5140[field5132 + 1];
                class263 var299 = class7.method45(0, 18925, class7.field79, var298);
                field5140[field5132++] = var299.method1736(var297, class541.field7591, var296, 0);
                return;
            }
            if (arg0 == 4110) {
                field5134 -= 2;
                String var300 = field5150[field5134];
                String var301 = field5150[field5134 + 1];
                if (field5140[--field5132] == 1) {
                    field5150[field5134++] = var300;
                    return;
                }
                field5150[field5134++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field5150[--field5134];
                field5150[field5134++] = class62.method377(32732, var302);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field5150[--field5134];
                int var304 = field5140[--field5132];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field5150[field5134++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field5140[--field5132];
                field5140[field5132++] = method2216((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field5140[--field5132];
                field5140[field5132++] = class385.method2353(85, (char) var306) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field5140[--field5132];
                field5140[field5132++] = class126.method923((char) var307, 122) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field5140[--field5132];
                field5140[field5132++] = class317.method2076((byte) 70, (char) var308) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field5150[--field5134];
                if (var309 != null) {
                    field5140[field5132++] = var309.length();
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field5150[--field5134];
                field5132 -= 2;
                int var311 = field5140[field5132];
                int var312 = field5140[field5132 + 1];
                field5150[field5134++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field5150[--field5134];
                StringBuffer var314 = new StringBuffer(var313.length());
                boolean var315 = false;
                for (int var316 = 0; var316 < var313.length(); var316++) {
                    char var317 = var313.charAt(var316);
                    if (var317 == '<') {
                        var315 = true;
                    } else if (var317 == '>') {
                        var315 = false;
                    } else if (!var315) {
                        var314.append(var317);
                    }
                }
                field5150[field5134++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field5150[--field5134];
                field5132 -= 2;
                int var319 = field5140[field5132];
                int var320 = field5140[field5132 + 1];
                field5140[field5132++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field5134 -= 2;
                String var321 = field5150[field5134];
                String var322 = field5150[field5134 + 1];
                int var323 = field5140[--field5132];
                field5140[field5132++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field5140[--field5132];
                field5140[field5132++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field5140[--field5132];
                field5140[field5132++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field5140[--field5132] != 0;
                int var327 = field5140[--field5132];
                field5150[field5134++] = class241.method1643(0, 0, var326, (long) var327, class526.field7494);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field5150[--field5134];
                int var329 = field5140[--field5132];
                class263 var330 = class7.method45(0, 18925, class7.field79, var329);
                field5140[field5132++] = var330.method1735((byte) -12, class541.field7591, var328);
                return;
            }
            if (arg0 == 4126) {
                field5150[field5134++] = class280.method1885(class526.field7494, (long) field5140[--field5132] * 60000L, -16687, true) + " UTC";
                return;
            }
            if (arg0 == 4127) {
                long var331 = field5139[--field5131];
                field5150[field5134++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field5140[--field5132];
                field5150[field5134++] = class526.field7490.method3567(var333, true).field7108;
                return;
            }
            if (arg0 == 4201) {
                field5132 -= 2;
                int var334 = field5140[field5132];
                int var335 = field5140[field5132 + 1];
                class501 var336 = class526.field7490.method3567(var334, true);
                if (var335 >= 1 && var335 <= 5 && var336.field7172[var335 - 1] != null) {
                    field5150[field5134++] = var336.field7172[var335 - 1];
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 4202) {
                field5132 -= 2;
                int var337 = field5140[field5132];
                int var338 = field5140[field5132 + 1];
                class501 var339 = class526.field7490.method3567(var337, true);
                if (var338 >= 1 && var338 <= 5 && var339.field7098[var338 - 1] != null) {
                    field5150[field5134++] = var339.field7098[var338 - 1];
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field5140[--field5132];
                field5140[field5132++] = class526.field7490.method3567(var340, true).field7166;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field5140[--field5132];
                field5140[field5132++] = class526.field7490.method3567(var341, true).field7176 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field5140[--field5132];
                class501 var343 = class526.field7490.method3567(var342, true);
                if (var343.field7096 == -1 && var343.field7144 >= 0) {
                    field5140[field5132++] = var343.field7144;
                    return;
                }
                field5140[field5132++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field5140[--field5132];
                class501 var345 = class526.field7490.method3567(var344, true);
                if (var345.field7096 >= 0 && var345.field7144 >= 0) {
                    field5140[field5132++] = var345.field7144;
                    return;
                }
                field5140[field5132++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field5140[--field5132];
                field5140[field5132++] = class526.field7490.method3567(var346, true).field7154 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field5132 -= 2;
                int var347 = field5140[field5132];
                int var348 = field5140[field5132 + 1];
                class330 var349 = class788.field10824.method1609(var348, -83);
                if (var349.method2134(-19881)) {
                    field5150[field5134++] = class526.field7490.method3567(var347, true).method2927(var348, var349.field4921, (byte) -69);
                    return;
                }
                field5140[field5132++] = class526.field7490.method3567(var347, true).method2914(0, var349.field4920, var348);
                return;
            }
            if (arg0 == 4209) {
                field5132 -= 2;
                int var350 = field5140[field5132];
                int var351 = field5140[field5132 + 1] - 1;
                class501 var352 = class526.field7490.method3567(var350, true);
                if (var352.field7097 == var351) {
                    field5140[field5132++] = var352.field7151;
                    return;
                }
                if (var352.field7155 == var351) {
                    field5140[field5132++] = var352.field7161;
                    return;
                }
                field5140[field5132++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field5150[--field5134];
                int var354 = field5140[--field5132];
                class333.method2155(-1, var354 == 1, var353);
                field5140[field5132++] = class92.field1200;
                return;
            }
            if (arg0 == 4211) {
                if (class327.field4891 != null && class493.field7009 < class92.field1200) {
                    field5140[field5132++] = class327.field4891[class493.field7009++] & 0xFFFF;
                    return;
                }
                field5140[field5132++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class493.field7009 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field5140[--field5132];
                field5140[field5132++] = class526.field7490.method3567(var355, true).field7115;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field5150[--field5134];
                field5132 -= 3;
                int var357 = field5140[field5132];
                int var358 = field5140[field5132 + 1];
                int var359 = field5140[field5132 + 2];
                class524.method3052(var356, var357 == 1, var359, var358, -104);
                field5140[field5132++] = class92.field1200;
                return;
            }
            if (arg0 == 4215) {
                field5134 -= 2;
                field5132 -= 2;
                String var360 = field5150[field5134];
                int var361 = field5140[field5132];
                int var362 = field5140[field5132 + 1];
                String var363 = field5150[field5134 + 1];
                class371.method2296(false, var360, var363, var361 == 1, var362);
                field5140[field5132++] = class92.field1200;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field5132 -= 2;
                int var364 = field5140[field5132];
                int var365 = field5140[field5132 + 1];
                class330 var366 = class788.field10824.method1609(var365, -75);
                if (var366.method2134(-19881)) {
                    field5150[field5134++] = class21.field322.method1466((byte) 95, var364).method1811(var366.field4921, 32, var365);
                    return;
                }
                field5140[field5132++] = class21.field322.method1466((byte) -97, var364).method1809(-1, var366.field4920, var365);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field5132 -= 2;
                int var367 = field5140[field5132];
                int var368 = field5140[field5132 + 1];
                class330 var369 = class788.field10824.method1609(var368, -90);
                if (var369.method2134(-19881)) {
                    field5150[field5134++] = class496.field7061.method319(-122, var367).method2094(-2536, var368, var369.field4921);
                    return;
                }
                field5140[field5132++] = class496.field7061.method319(103, var367).method2095((byte) 91, var369.field4920, var368);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field5132 -= 2;
                int var370 = field5140[field5132];
                int var371 = field5140[field5132 + 1];
                class330 var372 = class788.field10824.method1609(var371, -81);
                if (var372.method2134(-19881)) {
                    field5150[field5134++] = class729.field10195.method559(var370, (byte) -71).method582(var371, true, var372.field4921);
                    return;
                }
                field5140[field5132++] = class729.field10195.method559(var370, (byte) 80).method579(var371, true, var372.field4920);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field5140[--field5132];
                class607 var374 = class549.field7742.method3800(false, var373);
                if (var374.field8538 != null && var374.field8538.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field8582[0];
                    for (int var377 = 1; var377 < var374.field8538.length; var377++) {
                        if (var374.field8582[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field8582[var377];
                        }
                    }
                    field5140[field5132++] = var374.field8538[var375];
                    return;
                }
                field5140[field5132++] = var374.field8549;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field5140[field5132++] = class747.field10382 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field5150[--field5134];
                if (class757.field10456 == 7 && class237.field3423 == 0) {
                    if (var378.length() > 20) {
                        class238.field3436 = -4;
                        return;
                    }
                    class238.field3436 = -1;
                    class731 var379 = class155.method1222(260, class487.field6895, class237.field3417);
                    var379.field10211.method851((byte) -2, 0);
                    int var380 = var379.field10211.field1521;
                    var379.field10211.method880(true, var378);
                    var379.field10211.method849(-106, var379.field10211.field1521 - var380);
                    class533.method3088(var379, 0);
                    return;
                }
                class238.field3436 = -5;
                return;
            }
            if (arg0 == 4702) {
                field5140[field5132++] = class238.field3436;
                if (class238.field3436 != -1) {
                    class238.field3436 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
    public static final void method2222() {
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static final void method2223(int arg0) {
        if (arg0 == -1 || !class420.method2512((byte) 43, arg0)) {
            return;
        }
        class176[] var1 = class110.field1382[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class176 var3 = var1[var2];
            if (var3.field2565 != null) {
                class140 var4 = new class140();
                var4.field1802 = var3;
                var4.field1808 = var3.field2565;
                method2224(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhw;I)V")
    private static final void method2224(class140 arg0, int arg1) {
        Object[] var2 = arg0.field1808;
        int var3 = (Integer) var2[0];
        class433 var4 = class212.method1490(var3, 121);
        if (var4 == null) {
            return;
        }
        field5141 = new int[var4.field6167];
        int var5 = 0;
        field5153 = new String[var4.field6171];
        int var6 = 0;
        field5151 = new long[var4.field6169];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field1807;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field1809;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field1802 == null ? -1 : arg0.field1802.field2588;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field1800;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field1802 == null ? -1 : arg0.field1802.field2612;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field1804 == null ? -1 : arg0.field1804.field2588;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field1804 == null ? -1 : arg0.field1804.field2612;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field1801;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field1797;
                }
                field5141[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field1811;
                }
                field5153[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field5151[var7++] = var11;
            }
        }
        field5155 = arg0.field1806;
        method2218(var4, arg1);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
    private static final int method2225(int arg0) {
        class632 var1 = class511.field7304.method994(arg0, 54);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        Integer var2 = field5124.method540(var1.field8925, true, var1.field8929, class536.field7555.field1305 << 16 | var1.field8930);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lks;II)V")
    public static final void method2226(class460 arg0, int arg1, int arg2) {
        class433 var3 = class191.method1405(arg1, -103, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field5141 = new int[var3.field6167];
        field5153 = new String[var3.field6171];
        if (class617.field8707 == var3.field6159 || class733.field10223 == var3.field6159 || class137.field1786 == var3.field6159) {
            int var4 = 0;
            int var5 = 0;
            if (class271.field3793 != null) {
                var4 = class271.field3793.field2599;
                var5 = class271.field3793.field2578;
            }
            field5141[0] = class694.field9812.method3201((byte) 124) - var4;
            field5141[1] = class694.field9812.method3197((byte) -127) - var5;
        }
        method2218(var3, 200000);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)J")
    private static final long method2227(int arg0) {
        Long var1 = field5124.method547((byte) -112, class536.field7555.field1305 << 16 | arg0);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)V")
    private static final void method2228(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5140[field5132++] = class417.field5880;
                return;
            }
            if (arg0 == 5001) {
                field5132 -= 3;
                class417.field5880 = field5140[field5132];
                class64.field862 = class504.method2937(6750, field5140[field5132 + 1]);
                if (class64.field862 == null) {
                    class64.field862 = class388.field5523;
                }
                class273.field3813 = field5140[field5132 + 2];
                field5143++;
                class731 var2 = class155.method1222(260, class767.field10578, class237.field3417);
                var2.field10211.method851((byte) -2, class417.field5880);
                var2.field10211.method851((byte) -2, class64.field862.field7565);
                var2.field10211.method851((byte) -2, class273.field3813);
                class533.method3088(var2, 0);
                return;
            }
            if (arg0 == 5002) {
                field5134 -= 2;
                String var3 = field5150[field5134];
                String var4 = field5150[field5134 + 1];
                field5132 -= 2;
                int var5 = field5140[field5132];
                int var6 = field5140[field5132 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field5133++;
                class731 var7 = class155.method1222(260, class463.field6615, class237.field3417);
                var7.field10211.method851((byte) -2, class233.method1612(1, var3) + class233.method1612(1, var4) + 2);
                var7.field10211.method880(true, var3);
                var7.field10211.method851((byte) -2, var5 - 1);
                var7.field10211.method851((byte) -2, var6);
                var7.field10211.method880(true, var4);
                class533.method3088(var7, 0);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field5140[--field5132];
                class118 var9 = class324.method2106((byte) 58, var8);
                String var10 = "";
                if (var9 != null && var9.field1468 != null) {
                    var10 = var9.field1468;
                }
                field5150[field5134++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field5140[--field5132];
                class118 var12 = class324.method2106((byte) 58, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field1467;
                }
                field5140[field5132++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class64.field862 == null) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = class64.field862.field7565;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field5140[--field5132];
                class731 var15 = class155.method1222(260, class463.field6609, class237.field3417);
                var15.field10211.method851((byte) -2, var14);
                class533.method3088(var15, 0);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field5150[--field5134];
                method2232(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5134 -= 2;
                String var17 = field5150[field5134];
                String var18 = field5150[field5134 + 1];
                if (class282.field4334 != 0 || (!class724.field10150 || class542.field7600) && !class365.field5272) {
                    field5136++;
                    class731 var19 = class155.method1222(260, class704.field9916, class237.field3417);
                    var19.field10211.method851((byte) -2, 0);
                    int var20 = var19.field10211.field1521;
                    var19.field10211.method880(true, var17);
                    class196.method1423(true, var18, var19.field10211);
                    var19.field10211.method849(-100, var19.field10211.field1521 - var20);
                    class533.method3088(var19, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field5140[--field5132];
                class118 var22 = class324.method2106((byte) 58, var21);
                String var23 = "";
                if (var22 != null && var22.field1479 != null) {
                    var23 = var22.field1479;
                }
                field5150[field5134++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field5140[--field5132];
                class118 var25 = class324.method2106((byte) 58, var24);
                String var26 = "";
                if (var25 != null && var25.field1474 != null) {
                    var26 = var25.field1474;
                }
                field5150[field5134++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field5140[--field5132];
                class118 var28 = class324.method2106((byte) 58, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field1476;
                }
                field5140[field5132++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class251.field3549 == null || class251.field3549.field7958 == null) {
                    var30 = "";
                } else {
                    var30 = class251.field3549.method3239(true, -69);
                }
                field5150[field5134++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field5140[field5132++] = class273.field3813;
                return;
            }
            if (arg0 == 5017) {
                field5140[field5132++] = class435.method2602(11544);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field5140[--field5132];
                class118 var32 = class324.method2106((byte) 58, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field1463;
                }
                field5140[field5132++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field5140[--field5132];
                class118 var35 = class324.method2106((byte) 58, var34);
                String var36 = "";
                if (var35 != null && var35.field1472 != null) {
                    var36 = var35.field1472;
                }
                field5150[field5134++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class251.field3549 == null || class251.field3549.field7958 == null) {
                    var37 = "";
                } else {
                    var37 = class251.field3549.method3240(false, (byte) -49);
                }
                field5150[field5134++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field5140[--field5132];
                class118 var39 = class324.method2106((byte) 58, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field1465;
                }
                field5140[field5132++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field5140[--field5132];
                class118 var42 = class324.method2106((byte) 58, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field1473;
                }
                field5140[field5132++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field5140[--field5132];
                class118 var45 = class324.method2106((byte) 58, var44);
                String var46 = "";
                if (var45 != null && var45.field1470 != null) {
                    var46 = var45.field1470;
                }
                field5150[field5134++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field5140[--field5132];
                field5150[field5134++] = class101.field1275.method4280(var47, (byte) -99).field8952;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field5140[--field5132];
                class636 var49 = class101.field1275.method4280(var48, (byte) 80);
                if (var49.field8950 == null) {
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = var49.field8950.length;
                return;
            }
            if (arg0 == 5052) {
                field5132 -= 2;
                int var50 = field5140[field5132];
                int var51 = field5140[field5132 + 1];
                class636 var52 = class101.field1275.method4280(var50, (byte) -41);
                int var53 = var52.field8950[var51];
                field5140[field5132++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field5140[--field5132];
                class636 var55 = class101.field1275.method4280(var54, (byte) 93);
                if (var55.field8957 == null) {
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = var55.field8957.length;
                return;
            }
            if (arg0 == 5054) {
                field5132 -= 2;
                int var56 = field5140[field5132];
                int var57 = field5140[field5132 + 1];
                field5140[field5132++] = class101.field1275.method4280(var56, (byte) -41).field8957[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field5140[--field5132];
                field5150[field5134++] = class544.field7646.method1614(var58, (byte) 72).method3903(false);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field5140[--field5132];
                class693 var60 = class544.field7646.method1614(var59, (byte) 72);
                if (var60.field9802 == null) {
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = var60.field9802.length;
                return;
            }
            if (arg0 == 5057) {
                field5132 -= 2;
                int var61 = field5140[field5132];
                int var62 = field5140[field5132 + 1];
                field5140[field5132++] = class544.field7646.method1614(var61, (byte) 72).field9802[var62];
                return;
            }
            if (arg0 == 5058) {
                field5152 = new class667();
                field5152.field9387 = field5140[--field5132];
                field5152.field9386 = class544.field7646.method1614(field5152.field9387, (byte) 72);
                field5152.field9384 = new int[field5152.field9386.method3905((byte) 92)];
                return;
            }
            if (arg0 == 5059) {
                field5130++;
                class731 var63 = class155.method1222(260, class180.field2722, class237.field3417);
                var63.field10211.method851((byte) -2, 0);
                int var64 = var63.field10211.field1521;
                var63.field10211.method851((byte) -2, 0);
                var63.field10211.method860(field5152.field9387, (byte) 122);
                field5152.field9386.method3900(var63.field10211, -97, field5152.field9384);
                var63.field10211.method849(-62, var63.field10211.field1521 - var64);
                class533.method3088(var63, 0);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field5150[--field5134];
                field5147++;
                class731 var66 = class155.method1222(260, class124.field1618, class237.field3417);
                var66.field10211.method851((byte) -2, 0);
                int var67 = var66.field10211.field1521;
                var66.field10211.method880(true, var65);
                var66.field10211.method860(field5152.field9387, (byte) 119);
                field5152.field9386.method3900(var66.field10211, -125, field5152.field9384);
                var66.field10211.method849(-95, var66.field10211.field1521 - var67);
                class533.method3088(var66, 0);
                return;
            }
            if (arg0 == 5061) {
                field5130++;
                class731 var68 = class155.method1222(260, class180.field2722, class237.field3417);
                var68.field10211.method851((byte) -2, 0);
                int var69 = var68.field10211.field1521;
                var68.field10211.method851((byte) -2, 1);
                var68.field10211.method860(field5152.field9387, (byte) 118);
                field5152.field9386.method3900(var68.field10211, -124, field5152.field9384);
                var68.field10211.method849(-49, var68.field10211.field1521 - var69);
                class533.method3088(var68, 0);
                return;
            }
            if (arg0 == 5062) {
                field5132 -= 2;
                int var70 = field5140[field5132];
                int var71 = field5140[field5132 + 1];
                field5140[field5132++] = class101.field1275.method4280(var70, (byte) 73).field8955[var71];
                return;
            }
            if (arg0 == 5063) {
                field5132 -= 2;
                int var72 = field5140[field5132];
                int var73 = field5140[field5132 + 1];
                field5140[field5132++] = class101.field1275.method4280(var72, (byte) -99).field8958[var73];
                return;
            }
            if (arg0 == 5064) {
                field5132 -= 2;
                int var74 = field5140[field5132];
                int var75 = field5140[field5132 + 1];
                if (var75 == -1) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = class101.field1275.method4280(var74, (byte) -120).method3619(false, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field5132 -= 2;
                int var76 = field5140[field5132];
                int var77 = field5140[field5132 + 1];
                if (var77 == -1) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = class101.field1275.method4280(var76, (byte) 71).method3621((char) var77, (byte) 99);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field5140[--field5132];
                field5140[field5132++] = class544.field7646.method1614(var78, (byte) 72).method3905((byte) 92);
                return;
            }
            if (arg0 == 5067) {
                field5132 -= 2;
                int var79 = field5140[field5132];
                int var80 = field5140[field5132 + 1];
                int var81 = class544.field7646.method1614(var79, (byte) 72).method3901(-60, var80).field3818;
                field5140[field5132++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field5132 -= 2;
                int var82 = field5140[field5132];
                int var83 = field5140[field5132 + 1];
                field5152.field9384[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field5132 -= 2;
                int var84 = field5140[field5132];
                int var85 = field5140[field5132 + 1];
                field5152.field9384[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field5132 -= 3;
                int var86 = field5140[field5132];
                int var87 = field5140[field5132 + 1];
                int var88 = field5140[field5132 + 2];
                class693 var89 = class544.field7646.method1614(var86, (byte) 72);
                if (var89.method3901(-99, var87).field3818 != 0) {
                    throw new RuntimeException("bad command");
                }
                field5140[field5132++] = var89.method3907(var88, var87, 81);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field5150[--field5134];
                boolean var91 = field5140[--field5132] == 1;
                class305.method2010(var90, (byte) -24, var91);
                field5140[field5132++] = class92.field1200;
                return;
            }
            if (arg0 == 5072) {
                if (class327.field4891 != null && class493.field7009 < class92.field1200) {
                    field5140[field5132++] = class327.field4891[class493.field7009++] & 0xFFFF;
                    return;
                }
                field5140[field5132++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class493.field7009 = 0;
                return;
            }
            if (arg0 == 5074) {
                class731 var92 = class155.method1222(260, class180.field2722, class237.field3417);
                var92.field10211.method851((byte) -2, 0);
                int var93 = var92.field10211.field1521;
                var92.field10211.method851((byte) -2, 2);
                var92.field10211.method860(field5152.field9387, (byte) 121);
                field5152.field9386.method3900(var92.field10211, -101, field5152.field9384);
                var92.field10211.method849(-121, var92.field10211.field1521 - var93);
                class533.method3088(var92, 0);
                return;
            }
            if (arg0 == 5075) {
                class731 var94 = class155.method1222(260, class180.field2722, class237.field3417);
                var94.field10211.method851((byte) -2, 0);
                int var95 = var94.field10211.field1521;
                var94.field10211.method851((byte) -2, 3);
                var94.field10211.method860(field5152.field9387, (byte) 124);
                field5152.field9386.method3900(var94.field10211, -125, field5152.field9384);
                var94.field10211.method849(-46, var94.field10211.field1521 - var95);
                class533.method3088(var94, 0);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class311.field4630.method2733(90, 86)) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class311.field4630.method2733(87, 82)) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class311.field4630.method2733(84, 81)) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class373.method2322(-110, field5140[--field5132]);
                return;
            }
            if (arg0 == 5201) {
                field5140[field5132++] = class350.method2210(46);
                return;
            }
            if (arg0 == 5205) {
                class789.method4318(false, field5140[--field5132], -1, true, -1);
                return;
            }
            if (arg0 == 5206) {
                int var96 = field5140[--field5132];
                class614 var97 = class436.method2628(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                if (var97 == null) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = var97.field8669;
                return;
            }
            if (arg0 == 5207) {
                class614 var98 = class436.method2630(field5140[--field5132]);
                if (var98 != null && var98.field8667 != null) {
                    field5150[field5134++] = var98.field8667;
                    return;
                }
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5140[field5132++] = class779.field10741;
                field5140[field5132++] = class360.field5233;
                return;
            }
            if (arg0 == 5209) {
                field5140[field5132++] = class459.field6580 + class436.field6239;
                field5140[field5132++] = class450.field6465 + class436.field6233;
                return;
            }
            if (arg0 == 5210) {
                int var99 = field5140[--field5132];
                class614 var100 = class436.method2630(var99);
                if (var100 == null) {
                    field5140[field5132++] = 0;
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = var100.field8670 >> 14 & 0x3FFF;
                field5140[field5132++] = var100.field8670 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var101 = field5140[--field5132];
                class614 var102 = class436.method2630(var101);
                if (var102 == null) {
                    field5140[field5132++] = 0;
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = var102.field8661 - var102.field8662;
                field5140[field5132++] = var102.field8675 - var102.field8663;
                return;
            }
            if (arg0 == 5212) {
                class497 var103 = class697.method3929((byte) -121);
                if (var103 == null) {
                    field5140[field5132++] = -1;
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = var103.field7063;
                int var104 = var103.field7069 << 28 | class436.field6239 + var103.field7070 << 14 | class436.field6233 + var103.field7064;
                field5140[field5132++] = var104;
                return;
            }
            if (arg0 == 5213) {
                class497 var105 = class307.method2017((byte) 117);
                if (var105 == null) {
                    field5140[field5132++] = -1;
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = var105.field7063;
                int var106 = var105.field7069 << 28 | class436.field6239 + var105.field7070 << 14 | class436.field6233 + var105.field7064;
                field5140[field5132++] = var106;
                return;
            }
            if (arg0 == 5214) {
                int var107 = field5140[--field5132];
                class614 var108 = class652.method3735(true);
                if (var108 != null) {
                    boolean var109 = var108.method3529(var107 & 0x3FFF, var107 >> 28 & 0x3, field5137, var107 >> 14 & 0x3FFF, false);
                    if (var109) {
                        class260.method1712(field5137[2], (byte) 73, field5137[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5132 -= 2;
                int var110 = field5140[field5132];
                int var111 = field5140[field5132 + 1];
                class413 var112 = class436.method2623(var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                boolean var113 = false;
                for (class614 var114 = (class614) var112.method2480(381); var114 != null; var114 = (class614) var112.method2476((byte) 18)) {
                    if (var114.field8669 == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var113) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var115 = field5140[--field5132];
                class614 var116 = class436.method2630(var115);
                if (var116 == null) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = var116.field8666;
                return;
            }
            if (arg0 == 5220) {
                field5140[field5132++] = class261.field3682 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var117 = field5140[--field5132];
                class260.method1712(var117 & 0x3FFF, (byte) 73, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class614 var118 = class652.method3735(true);
                if (var118 != null) {
                    boolean var119 = var118.method3527(field5137, 100, class459.field6580 + class436.field6239, class450.field6465 + class436.field6233);
                    if (var119) {
                        field5140[field5132++] = field5137[1];
                        field5140[field5132++] = field5137[2];
                        return;
                    }
                    field5140[field5132++] = -1;
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = -1;
                field5140[field5132++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5132 -= 2;
                int var120 = field5140[field5132];
                int var121 = field5140[field5132 + 1];
                class789.method4318(false, var120, var121 >> 14 & 0x3FFF, true, var121 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var122 = field5140[--field5132];
                class614 var123 = class652.method3735(true);
                if (var123 != null) {
                    boolean var124 = var123.method3529(var122 & 0x3FFF, var122 >> 28 & 0x3, field5137, var122 >> 14 & 0x3FFF, false);
                    if (var124) {
                        field5140[field5132++] = field5137[1];
                        field5140[field5132++] = field5137[2];
                        return;
                    }
                    field5140[field5132++] = -1;
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = -1;
                field5140[field5132++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var125 = field5140[--field5132];
                class614 var126 = class652.method3735(true);
                if (var126 != null) {
                    boolean var127 = var126.method3527(field5137, 96, var125 >> 14 & 0x3FFF, var125 & 0x3FFF);
                    if (var127) {
                        field5140[field5132++] = field5137[1];
                        field5140[field5132++] = field5137[2];
                        return;
                    }
                    field5140[field5132++] = -1;
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = -1;
                field5140[field5132++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class122.method904(false, field5140[--field5132]);
                return;
            }
            if (arg0 == 5227) {
                field5132 -= 2;
                int var128 = field5140[field5132];
                int var129 = field5140[field5132 + 1];
                class789.method4318(true, var128, var129 >> 14 & 0x3FFF, true, var129 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class66.field876 = field5140[--field5132] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5140[field5132++] = class66.field876 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var130 = field5140[--field5132];
                class603.method3484(var130, false);
                return;
            }
            if (arg0 == 5231) {
                field5132 -= 2;
                int var131 = field5140[field5132];
                boolean var132 = field5140[field5132 + 1] == 1;
                if (class217.field3108 != null) {
                    class540 var133 = class217.field3108.method380((byte) -3, (long) var131);
                    if (var133 != null && !var132) {
                        var133.method3117((byte) 20);
                        return;
                    }
                    if (var133 == null && var132) {
                        class540 var134 = new class540();
                        class217.field3108.method384((long) var131, var134, false);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var135 = field5140[--field5132];
                if (class217.field3108 != null) {
                    class540 var136 = class217.field3108.method380((byte) -3, (long) var135);
                    field5140[field5132++] = var136 == null ? 0 : 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5132 -= 2;
                int var137 = field5140[field5132];
                boolean var138 = field5140[field5132 + 1] == 1;
                if (class498.field7078 != null) {
                    class540 var139 = class498.field7078.method380((byte) -3, (long) var137);
                    if (var139 != null && !var138) {
                        var139.method3117((byte) -120);
                        return;
                    }
                    if (var139 == null && var138) {
                        class540 var140 = new class540();
                        class498.field7078.method384((long) var137, var140, false);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var141 = field5140[--field5132];
                if (class498.field7078 != null) {
                    class540 var142 = class498.field7078.method380((byte) -3, (long) var141);
                    field5140[field5132++] = var142 == null ? 0 : 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5140[field5132++] = class436.field6206 == null ? -1 : class436.field6206.field8669;
                return;
            }
            if (arg0 == 5236) {
                field5132 -= 2;
                int var143 = field5140[field5132];
                int var144 = field5140[field5132 + 1];
                int var145 = var144 >> 14 & 0x3FFF;
                int var146 = var144 & 0x3FFF;
                int var147 = class534.method3095(var146, var145, -107, var143);
                if (var147 < 0) {
                    field5140[field5132++] = -1;
                    return;
                }
                field5140[field5132++] = var147;
                return;
            }
            if (arg0 == 5237) {
                class379.method2340(104);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5132 -= 2;
                int var148 = field5140[field5132];
                int var149 = field5140[field5132 + 1];
                class725.method4080(var148, 3, var149, false, 0);
                field5140[field5132++] = class677.field9637 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class677.field9637 != null) {
                    class725.method4080(-1, class145.field1852.field8987.method2724((byte) -82), -1, false, 0);
                }
                return;
            }
            if (arg0 == 5302) {
                class251[] var150 = class674.method3824(0);
                field5140[field5132++] = var150.length;
                return;
            }
            if (arg0 == 5303) {
                int var151 = field5140[--field5132];
                class251[] var152 = class674.method3824(0);
                field5140[field5132++] = var152[var151].field3551;
                field5140[field5132++] = var152[var151].field3550;
                return;
            }
            if (arg0 == 5305) {
                int var153 = class717.field10090;
                int var154 = class271.field3795;
                int var155 = -1;
                class251[] var156 = class674.method3824(0);
                for (int var157 = 0; var157 < var156.length; var157++) {
                    class251 var158 = var156[var157];
                    if (var158.field3551 == var153 && var158.field3550 == var154) {
                        var155 = var157;
                        break;
                    }
                }
                field5140[field5132++] = var155;
                return;
            }
            if (arg0 == 5306) {
                field5140[field5132++] = class100.method704(0);
                return;
            }
            if (arg0 == 5307) {
                int var159 = field5140[--field5132];
                if (var159 >= 1 && var159 <= 2) {
                    class725.method4080(-1, var159, -1, false, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5140[field5132++] = class145.field1852.field8987.method2724((byte) -99);
                return;
            }
            if (arg0 == 5309) {
                int var160 = field5140[--field5132];
                if (var160 >= 1 && var160 <= 2) {
                    class145.field1852.method3632(class145.field1852.field8987, true, var160);
                    class145.field1852.method3632(class145.field1852.field8985, true, var160);
                    class781.method4285(3);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5134 -= 2;
                String var161 = field5150[field5134];
                String var162 = field5150[field5134 + 1];
                int var163 = field5140[--field5132];
                field5146++;
                class731 var164 = class155.method1222(260, class470.field6713, class237.field3417);
                var164.field10211.method851((byte) -2, class233.method1612(1, var161) + class233.method1612(1, var162) + 1);
                var164.field10211.method880(true, var161);
                var164.field10211.method880(true, var162);
                var164.field10211.method851((byte) -2, var163);
                class533.method3088(var164, 0);
                return;
            }
            if (arg0 == 5401) {
                field5132 -= 2;
                class500.field7092[field5140[field5132]] = (short) class226.method1560(field5140[field5132 + 1], true);
                class526.field7490.method3568((byte) 127);
                class526.field7490.method3572(true);
                class21.field322.method1461(1);
                class149.method1028(-19376);
                return;
            }
            if (arg0 == 5405) {
                field5132 -= 2;
                int var165 = field5140[field5132];
                int var166 = field5140[field5132 + 1];
                if (var165 >= 0 && var165 < 2) {
                    class772.field10648[var165] = new int[var166 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5132 -= 7;
                int var167 = field5140[field5132];
                int var168 = field5140[field5132 + 1] << 1;
                int var169 = field5140[field5132 + 2];
                int var170 = field5140[field5132 + 3];
                int var171 = field5140[field5132 + 4];
                int var172 = field5140[field5132 + 5];
                int var173 = field5140[field5132 + 6];
                if (var167 >= 0 && var167 < 2 && class772.field10648[var167] != null && var168 >= 0 && var168 < class772.field10648[var167].length) {
                    class772.field10648[var167][var168] = new int[] { (var169 >> 14 & 0x3FFF) << 9, var170 << 2, (var169 & 0x3FFF) << 9, var173 };
                    class772.field10648[var167][var168 + 1] = new int[] { (var171 >> 14 & 0x3FFF) << 9, var172 << 2, (var171 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var174 = class772.field10648[field5140[--field5132]].length >> 1;
                field5140[field5132++] = var174;
                return;
            }
            if (arg0 == 5411) {
                if (class677.field9637 != null) {
                    class725.method4080(-1, class145.field1852.field8987.method2724((byte) -105), -1, false, 0);
                }
                if (class463.field6617 != null) {
                    class711.method4025(-20081);
                    System.exit(0);
                    return;
                }
                String var175 = class648.field9118 == null ? class617.method3533(-42) : class648.field9118;
                class610.method3518(false, class27.field395, class145.field1852.field9002.method2258((byte) -53) == 1, var175, -110);
                return;
            }
            if (arg0 == 5419) {
                String var176 = "";
                if (class125.field1645 != null) {
                    if (class125.field1645.field5317 == null) {
                        var176 = class390.method2388(101, class125.field1645.field5313);
                    } else {
                        var176 = (String) class125.field1645.field5317;
                    }
                }
                field5150[field5134++] = var176;
                return;
            }
            if (arg0 == 5420) {
                field5140[field5132++] = class27.field395.field8334 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class677.field9637 != null) {
                    class725.method4080(-1, class145.field1852.field8987.method2724((byte) -122), -1, false, 0);
                }
                String var177 = field5150[--field5134];
                boolean var178 = field5140[--field5132] == 1;
                String var179 = class617.method3533(-104) + var177;
                class610.method3518(var178, class27.field395, class145.field1852.field9002.method2258((byte) -109) == 1, var179, -84);
                return;
            }
            if (arg0 == 5422) {
                field5134 -= 2;
                String var180 = field5150[field5134];
                String var181 = field5150[field5134 + 1];
                int var182 = field5140[--field5132];
                if (var180.length() > 0) {
                    if (class733.field10222 == null) {
                        class733.field10222 = new String[class457.field6549[class536.field7555.field1305]];
                    }
                    class733.field10222[var182] = var180;
                }
                if (var181.length() > 0) {
                    if (class306.field4570 == null) {
                        class306.field4570 = new String[class457.field6549[class536.field7555.field1305]];
                    }
                    class306.field4570[var182] = var181;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5150[--field5134]);
                return;
            }
            if (arg0 == 5424) {
                field5132 -= 11;
                class161.field2377 = field5140[field5132];
                class231.field3358 = field5140[field5132 + 1];
                class324.field4858 = field5140[field5132 + 2];
                class580.field8207 = field5140[field5132 + 3];
                class690.field9766 = field5140[field5132 + 4];
                class123.field1607 = field5140[field5132 + 5];
                class203.field2974 = field5140[field5132 + 6];
                class367.field5283 = field5140[field5132 + 7];
                class666.field9381 = field5140[field5132 + 8];
                class229.field3331 = field5140[field5132 + 9];
                class3.field44 = field5140[field5132 + 10];
                class491.field6972.method3131(-68, class690.field9766);
                class491.field6972.method3131(97, class123.field1607);
                class491.field6972.method3131(94, class203.field2974);
                class491.field6972.method3131(-64, class367.field5283);
                class491.field6972.method3131(100, class666.field9381);
                class296.field4462 = null;
                class569.field8062 = null;
                class161.field2373 = null;
                class725.field10177 = null;
                class516.field7384 = null;
                class651.field9158 = null;
                class297.field4483 = null;
                class491.field6977 = null;
                class102.field1283 = true;
                return;
            }
            if (arg0 == 5425) {
                class228.method1578(-7);
                class102.field1283 = false;
                return;
            }
            if (arg0 == 5426) {
                field5132 -= 2;
                class733.field10240 = field5140[field5132];
                class23.field347 = field5140[field5132 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5132 -= 2;
                class788.field10830 = field5140[field5132 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5132 -= 2;
                int var183 = field5140[field5132];
                int var184 = field5140[field5132 + 1];
                field5140[field5132++] = class595.method3444(var184, var183, 21142) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class237.method1628((byte) 70, false, field5150[--field5134], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class150.method1035(-19253, "accountcreated", class535.field7544);
                    return;
                } catch (Throwable var332) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class150.method1035(-19253, "accountcreatestarted", class535.field7544);
                    return;
                } catch (Throwable var333) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var185 = "";
                if (class53.field745 != null) {
                    Transferable var186 = class53.field745.getContents(null);
                    if (var186 != null) {
                        try {
                            var185 = (String) var186.getTransferData(DataFlavor.stringFlavor);
                            if (var185 == null) {
                                var185 = "";
                            }
                        } catch (Exception var334) {
                        }
                    }
                }
                field5150[field5134++] = var185;
                return;
            }
            if (arg0 == 5433) {
                class17.field274 = field5140[--field5132];
                return;
            }
            if (arg0 == 5435) {
                field5140[field5132++] = class777.field10722 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5132 -= 4;
                int var187 = field5140[field5132];
                int var188 = field5140[field5132 + 1];
                int var189 = field5140[field5132 + 2];
                int var190 = field5140[field5132 + 3];
                class443.method2672((var187 & 0x3FFF) - class175.field2496, var190, var188 << 2, (byte) -128, (var187 >> 14 & 0x3FFF) - class103.field1295, false, var189);
                return;
            }
            if (arg0 == 5501) {
                field5132 -= 4;
                int var191 = field5140[field5132];
                int var192 = field5140[field5132 + 1];
                int var193 = field5140[field5132 + 2];
                int var194 = field5140[field5132 + 3];
                class588.method3408(var192 << 2, false, var194, var193, (var191 >> 14 & 0x3FFF) - class103.field1295, (var191 & 0x3FFF) - class175.field2496);
                return;
            }
            if (arg0 == 5502) {
                field5132 -= 6;
                int var195 = field5140[field5132];
                if (var195 >= 2) {
                    throw new RuntimeException();
                }
                class645.field9087 = var195;
                int var196 = field5140[field5132 + 1];
                if (var196 + 1 >= class772.field10648[class645.field9087].length >> 1) {
                    throw new RuntimeException();
                }
                class599.field8448 = var196;
                class430.field6113 = 0;
                class770.field10622 = field5140[field5132 + 2];
                class713.field10066 = field5140[field5132 + 3];
                int var197 = field5140[field5132 + 4];
                if (var197 >= 2) {
                    throw new RuntimeException();
                }
                class141.field1822 = var197;
                int var198 = field5140[field5132 + 5];
                if (var198 + 1 >= class772.field10648[class141.field1822].length >> 1) {
                    throw new RuntimeException();
                }
                class113.field1423 = var198;
                class763.field10510 = 3;
                class180.field2732 = -1;
                class406.field5746 = -1;
                return;
            }
            if (arg0 == 5503) {
                class14.method130((byte) -15);
                return;
            }
            if (arg0 == 5504) {
                field5132 -= 2;
                class71.method560(field5140[field5132 + 1], (byte) -31, field5140[field5132], 0);
                return;
            }
            if (arg0 == 5505) {
                field5140[field5132++] = (int) class509.field7256 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5140[field5132++] = (int) class562.field8001 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class672.method3806(-6);
                return;
            }
            if (arg0 == 5508) {
                class79.method602(-1);
                return;
            }
            if (arg0 == 5509) {
                class238.method1632(22961);
                return;
            }
            if (arg0 == 5510) {
                class1.method4(0);
                return;
            }
            if (arg0 == 5511) {
                int var199 = field5140[--field5132];
                int var200 = var199 >> 14 & 0x3FFF;
                int var201 = var199 & 0x3FFF;
                int var202 = var200 - class103.field1295;
                if (var202 < 0) {
                    var202 = 0;
                } else if (var202 >= class109.field1314) {
                    var202 = class109.field1314;
                }
                int var203 = var201 - class175.field2496;
                if (var203 < 0) {
                    var203 = 0;
                } else if (var203 >= class760.field10479) {
                    var203 = class760.field10479;
                }
                class75.field1009 = (var202 << 9) + 256;
                class579.field8185 = (var203 << 9) + 256;
                class763.field10510 = 4;
                class180.field2732 = -1;
                class406.field5746 = -1;
                return;
            }
            if (arg0 == 5512) {
                class391.method2389(-115);
                return;
            }
            if (arg0 == 5514) {
                class412.field5823 = field5140[--field5132];
                return;
            }
            if (arg0 == 5516) {
                field5140[field5132++] = class412.field5823;
                return;
            }
            if (arg0 == 5517) {
                int var204 = field5140[--field5132];
                if (var204 == -1) {
                    int var205 = var204 >> 14 & 0x3FFF;
                    int var206 = var204 & 0x3FFF;
                    int var207 = var205 - class103.field1295;
                    if (var207 < 0) {
                        var207 = 0;
                    } else if (var207 >= class109.field1314) {
                        var207 = class109.field1314;
                    }
                    int var208 = var206 - class175.field2496;
                    if (var208 < 0) {
                        var208 = 0;
                    } else if (var208 >= class760.field10479) {
                        var208 = class760.field10479;
                    }
                    class406.field5746 = (var207 << 9) + 256;
                    class180.field2732 = (var208 << 9) + 256;
                    return;
                }
                class406.field5746 = -1;
                class180.field2732 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5134 -= 2;
                String var209 = field5150[field5134];
                String var210 = field5150[field5134 + 1];
                int var211 = field5140[--field5132];
                if (var209.length() > 320) {
                    return;
                }
                if (class757.field10456 != 3) {
                    return;
                }
                if (class237.field3423 == 0 && class284.field4365 == 0) {
                    class336.field4992 = var209;
                    class676.field9624 = var210;
                    class222.field3160 = var211;
                    class374.method2323(6, (byte) -13);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class364.method2271(1);
                return;
            }
            if (arg0 == 5602) {
                if (class237.field3423 == 0) {
                    class322.field4756 = -2;
                    class661.field9289 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field5134--;
                if (class757.field10456 != 3) {
                    return;
                }
                if (class237.field3423 == 0 && class284.field4365 == 0) {
                    class551.method3206(field5150[field5134], 7);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5134 -= 2;
                field5132 -= 2;
                if (class757.field10456 != 3) {
                    return;
                }
                if (class237.field3423 == 0 && class284.field4365 == 0) {
                    class341.method2186(field5140[field5132], 102, field5140[field5132 + 1] == 1, field5150[field5134 + 1], field5150[field5134]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class284.field4365 == 0) {
                    class715.field10078 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5140[field5132++] = class661.field9289;
                return;
            }
            if (arg0 == 5608) {
                field5140[field5132++] = class388.field5533;
                return;
            }
            if (arg0 == 5609) {
                field5140[field5132++] = class715.field10078;
                return;
            }
            if (arg0 == 5611) {
                field5140[field5132++] = class9.field152;
                return;
            }
            if (arg0 == 5612) {
                int var212 = field5140[--field5132];
                if (class757.field10456 != 7) {
                    return;
                }
                if (class237.field3423 == 0 && class284.field4365 == 0) {
                    if (class76.field1025 != null) {
                        class76.field1025.method201(-117);
                        class76.field1025 = null;
                    }
                    class222.field3160 = var212;
                    class374.method2323(9, (byte) -16);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field5140[field5132++] = class661.field9289;
                return;
            }
            if (arg0 == 5615) {
                field5134 -= 2;
                String var213 = field5150[field5134];
                String var214 = field5150[field5134 + 1];
                if (var213.length() > 320) {
                    return;
                }
                if (class757.field10456 != 3) {
                    return;
                }
                if (class237.field3423 == 0 && class284.field4365 == 0) {
                    if (class76.field1025 != null) {
                        class76.field1025.method201(-95);
                        class76.field1025 = null;
                    }
                    class336.field4992 = var213;
                    class676.field9624 = var214;
                    class374.method2323(5, (byte) 19);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class599.method3460(true, false);
                return;
            }
            if (arg0 == 5617) {
                field5140[field5132++] = class322.field4756;
                return;
            }
            if (arg0 == 5618) {
                field5132--;
                return;
            }
            if (arg0 == 5619) {
                field5132--;
                return;
            }
            if (arg0 == 5620) {
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field5134 -= 2;
                field5132 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class669.field9400 != null) {
                    field5140[field5132++] = 1;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field5140[field5132++] = (int) (class411.field5802 >> 32);
                field5140[field5132++] = (int) (class411.field5802 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field5140[field5132++] = class621.field8760 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class621.field8760 = true;
                class118.method826(29693);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var215 = field5140[--field5132];
                class145.field1852.method3632(class145.field1852.field9019, true, var215);
                class710.method4020(true);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var216 = field5140[--field5132] == 1;
                class145.field1852.method3632(class145.field1852.field9026, true, var216 ? 1 : 0);
                class145.field1852.method3632(class145.field1852.field9018, true, var216 ? 1 : 0);
                class710.method4020(true);
                class631.method3607(512);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var217 = field5140[--field5132] == 1;
                class145.field1852.method3632(class145.field1852.field9015, true, var217 ? 2 : 1);
                class145.field1852.method3632(class145.field1852.field8994, true, var217 ? 2 : 1);
                class631.method3607(512);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6005) {
                class145.field1852.method3632(class145.field1852.field8993, true, field5140[--field5132] == 1 ? 1 : 0);
                class710.method4020(true);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6007) {
                class145.field1852.method3632(class145.field1852.field9033, true, field5140[--field5132]);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6008) {
                class145.field1852.method3632(class145.field1852.field8998, true, field5140[--field5132] == 1 ? 1 : 0);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6010) {
                class145.field1852.method3632(class145.field1852.field9008, true, field5140[--field5132] == 1 ? 1 : 0);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6011) {
                class145.field1852.method3632(class145.field1852.field9017, true, field5140[--field5132]);
                class710.method4020(true);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6012) {
                class145.field1852.method3632(class145.field1852.field8986, true, field5140[--field5132] == 1 ? 1 : 0);
                class292.method1978(true);
                class696.method3921((byte) -21);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6014) {
                class145.field1852.method3632(class145.field1852.field9011, true, field5140[--field5132] == 1 ? 2 : 0);
                class710.method4020(true);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6015) {
                class145.field1852.method3632(class145.field1852.field8996, true, field5140[--field5132] == 1 ? 1 : 0);
                class710.method4020(true);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6016) {
                class145.field1852.method3632(class145.field1852.field8991, true, field5140[--field5132]);
                class226.method1559((byte) 43, false, class145.field1852.field9002.method2258((byte) -120));
                class781.method4285(3);
                return;
            }
            if (arg0 == 6017) {
                class145.field1852.method3632(class145.field1852.field9013, true, field5140[--field5132] == 1 ? 1 : 0);
                class182.method1361(-128);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6018) {
                class145.field1852.method3632(class145.field1852.field9029, true, field5140[--field5132]);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6019) {
                int var218 = field5140[--field5132];
                int var219 = class145.field1852.field9012.method978((byte) -116);
                if (var218 != var219) {
                    if (class264.method1739(class757.field10456, 3580)) {
                        if (var219 == 0 && class433.field6161 != -1) {
                            class452.method2719(class606.field8526, 0, false, 0, var218, class433.field6161);
                            class368.method2288(120);
                            class709.field9995 = false;
                        } else if (var218 == 0) {
                            class281.method1903((byte) 87);
                            class709.field9995 = false;
                        } else {
                            class484.method2831(var218, (byte) 115);
                        }
                    }
                    class145.field1852.method3632(class145.field1852.field9012, true, var218);
                    class781.method4285(3);
                    class399.field5669 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class145.field1852.method3632(class145.field1852.field9003, true, field5140[--field5132]);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6021) {
                int var220 = class145.field1852.field9015.method2826((byte) -107);
                class145.field1852.method3632(class145.field1852.field8994, true, field5140[--field5132] == 1 ? 0 : var220);
                class631.method3607(512);
                return;
            }
            if (arg0 == 6023) {
                int var221 = field5140[--field5132];
                class145.field1852.method3632(class145.field1852.field9021, true, var221);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6024) {
                class145.field1852.method3632(class145.field1852.field9023, true, field5140[--field5132]);
                class781.method4285(3);
                return;
            }
            if (arg0 == 6025) {
                class145.field1852.method3632(class145.field1852.field8999, true, field5140[--field5132]);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6027) {
                int var222 = field5140[--field5132];
                if (var222 < 0 || var222 > 1) {
                    var222 = 0;
                }
                class694.method3915(var222 == 1, (byte) 83);
                return;
            }
            if (arg0 == 6028) {
                class145.field1852.method3632(class145.field1852.field9024, true, field5140[--field5132] == 0 ? 0 : 1);
                class781.method4285(3);
                return;
            }
            if (arg0 == 6029) {
                class145.field1852.method3632(class145.field1852.field9033, true, field5140[--field5132]);
                class781.method4285(3);
                return;
            }
            if (arg0 == 6030) {
                class145.field1852.method3632(class145.field1852.field9030, true, field5140[--field5132] == 0 ? 0 : 1);
                class781.method4285(3);
                class710.method4020(true);
                return;
            }
            if (arg0 == 6031) {
                int var223 = field5140[--field5132];
                if (var223 < 0 || var223 > 5) {
                    var223 = 2;
                }
                class226.method1559((byte) 127, false, var223);
                return;
            }
            if (arg0 == 6032) {
                field5132 -= 2;
                int var224 = field5140[field5132];
                boolean var225 = field5140[field5132 + 1] == 1;
                class145.field1852.method3632(class145.field1852.field9016, true, var224);
                if (!var225) {
                    class145.field1852.method3632(class145.field1852.field8995, true, 0);
                }
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6033) {
                class145.field1852.method3632(class145.field1852.field9006, true, field5140[--field5132]);
                class781.method4285(3);
                return;
            }
            if (arg0 == 6034) {
                class145.field1852.method3632(class145.field1852.field9031, true, field5140[--field5132] == 1 ? 1 : 0);
                class781.method4285(3);
                class292.method1978(true);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6035) {
                int var226 = class145.field1852.field9026.method2757((byte) -70);
                class145.field1852.method3632(class145.field1852.field9018, true, field5140[--field5132] == 1 ? 1 : var226);
                class710.method4020(true);
                class631.method3607(512);
                return;
            }
            if (arg0 == 6036) {
                class145.field1852.method3632(class145.field1852.field9010, true, field5140[--field5132]);
                class781.method4285(3);
                class654.field9234 = true;
                return;
            }
            if (arg0 == 6037) {
                class145.field1852.method3632(class145.field1852.field9009, true, field5140[--field5132]);
                class781.method4285(3);
                class399.field5669 = false;
                return;
            }
            if (arg0 == 6038) {
                int var227 = field5140[--field5132];
                int var228 = class145.field1852.field9025.method978((byte) -85);
                if (var227 != var228 && class792.field10870 == class433.field6161) {
                    if (!class264.method1739(class757.field10456, 3580)) {
                        if (var228 == 0) {
                            class452.method2719(class606.field8526, 0, false, 0, var227, class433.field6161);
                            class368.method2288(124);
                            class709.field9995 = false;
                        } else if (var227 == 0) {
                            class281.method1903((byte) 104);
                            class709.field9995 = false;
                        } else {
                            class484.method2831(var227, (byte) 109);
                        }
                    }
                    class145.field1852.method3632(class145.field1852.field9025, true, var227);
                    class781.method4285(3);
                    class399.field5669 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var229 = field5140[--field5132];
                if (var229 > 255 || var229 < 0) {
                    var229 = 0;
                }
                if (var229 != class145.field1852.field9014.method2326((byte) -123)) {
                    class145.field1852.method3632(class145.field1852.field9014, true, var229);
                    class781.method4285(3);
                    class399.field5669 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var230 = field5140[--field5132];
                if (var230 != class145.field1852.field9032.method1723((byte) -84)) {
                    class145.field1852.method3632(class145.field1852.field9032, true, var230);
                    class781.method4285(3);
                    class399.field5669 = false;
                    class190.method1401((byte) 100);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5140[field5132++] = class145.field1852.field9019.method2930((byte) -100);
                return;
            }
            if (arg0 == 6102) {
                field5140[field5132++] = class145.field1852.field9026.method2757((byte) -71) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5140[field5132++] = class145.field1852.field9015.method2826((byte) -76) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5140[field5132++] = class145.field1852.field8993.method1387((byte) -100) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5140[field5132++] = class145.field1852.field9033.method4094((byte) -52);
                return;
            }
            if (arg0 == 6108) {
                field5140[field5132++] = class145.field1852.field8998.method4317((byte) -61) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5140[field5132++] = class145.field1852.field9008.method1696((byte) -99) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5140[field5132++] = class145.field1852.field9017.method3212((byte) -63);
                return;
            }
            if (arg0 == 6112) {
                field5140[field5132++] = class145.field1852.field8986.method968((byte) -46) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5140[field5132++] = class145.field1852.field9011.method2495((byte) -43) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5140[field5132++] = class145.field1852.field8996.method1488((byte) -70) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5140[field5132++] = class145.field1852.field8991.method1399((byte) -108);
                return;
            }
            if (arg0 == 6117) {
                field5140[field5132++] = class145.field1852.field9013.method2104((byte) -70) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5140[field5132++] = class145.field1852.field9029.method978((byte) -47);
                return;
            }
            if (arg0 == 6119) {
                field5140[field5132++] = class145.field1852.field9012.method978((byte) -113);
                return;
            }
            if (arg0 == 6120) {
                field5140[field5132++] = class145.field1852.field9003.method978((byte) -36);
                return;
            }
            if (arg0 == 6123) {
                field5140[field5132++] = class531.method3082(0);
                return;
            }
            if (arg0 == 6124) {
                field5140[field5132++] = class145.field1852.field9023.method1399((byte) -32);
                return;
            }
            if (arg0 == 6125) {
                field5140[field5132++] = class145.field1852.field8999.method1703((byte) -34);
                return;
            }
            if (arg0 == 6127) {
                field5140[field5132++] = class145.field1852.field8981.method3235((byte) -112) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5140[field5132++] = class145.field1852.field9024.method3770((byte) -37) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5140[field5132++] = class145.field1852.field9033.method4094((byte) -65);
                return;
            }
            if (arg0 == 6130) {
                field5140[field5132++] = class145.field1852.field9030.method661((byte) -68) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5140[field5132++] = class145.field1852.field9002.method2258((byte) -67);
                return;
            }
            if (arg0 == 6132) {
                field5140[field5132++] = class145.field1852.field9016.method2258((byte) -32);
                return;
            }
            if (arg0 == 6133) {
                field5140[field5132++] = class27.field395.field8334 && !class27.field395.field8345 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field5140[field5132++] = class145.field1852.field9006.method3645((byte) -69);
                return;
            }
            if (arg0 == 6136) {
                field5140[field5132++] = class145.field1852.field9031.method2235((byte) -103) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field5140[field5132++] = class332.method2151(class145.field1852.field9002.method2258((byte) -110), 200, -81);
                return;
            }
            if (arg0 == 6139) {
                field5140[field5132++] = class145.field1852.field9010.method712((byte) -125);
                return;
            }
            if (arg0 == 6142) {
                field5140[field5132++] = class145.field1852.field9009.method978((byte) -94);
                return;
            }
            if (arg0 == 6143) {
                field5140[field5132++] = class145.field1852.field9025.method978((byte) -119);
                return;
            }
            if (arg0 == 6144) {
                field5140[field5132++] = class267.field3757 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field5140[field5132++] = class145.field1852.field9014.method2326((byte) -34);
                return;
            }
            if (arg0 == 6146) {
                field5140[field5132++] = class145.field1852.field9032.method1723((byte) -50);
                return;
            }
            if (arg0 == 6147) {
                field5140[field5132++] = class357.field5197.field1506 < 512 || class267.field3757 || class162.field2385 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field5140[field5132++] = class522.field7454 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5132 -= 2;
                class375.field5410 = (short) field5140[field5132];
                if (class375.field5410 <= 0) {
                    class375.field5410 = 256;
                }
                class228.field3252 = (short) field5140[field5132 + 1];
                if (class228.field3252 <= 0) {
                    class228.field3252 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5132 -= 2;
                class576.field8142 = (short) field5140[field5132];
                if (class576.field8142 <= 0) {
                    class576.field8142 = 256;
                }
                class609.field8600 = (short) field5140[field5132 + 1];
                if (class609.field8600 <= 0) {
                    class609.field8600 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5132 -= 4;
                class607.field8583 = (short) field5140[field5132];
                if (class607.field8583 <= 0) {
                    class607.field8583 = 1;
                }
                class32.field432 = (short) field5140[field5132 + 1];
                if (class32.field432 <= 0) {
                    class32.field432 = 32767;
                } else if (class32.field432 < class607.field8583) {
                    class32.field432 = class607.field8583;
                }
                class372.field5360 = (short) field5140[field5132 + 2];
                if (class372.field5360 <= 0) {
                    class372.field5360 = 1;
                }
                class617.field8705 = (short) field5140[field5132 + 3];
                if (class617.field8705 <= 0) {
                    class617.field8705 = 32767;
                    return;
                }
                if (class617.field8705 < class372.field5360) {
                    class617.field8705 = class372.field5360;
                }
                return;
            }
            if (arg0 == 6203) {
                class733.method4099(class586.field8296.field2664, 0, 0, class586.field8296.field2673, false, (byte) -110);
                field5140[field5132++] = class668.field9397;
                field5140[field5132++] = class746.field10376;
                return;
            }
            if (arg0 == 6204) {
                field5140[field5132++] = class576.field8142;
                field5140[field5132++] = class609.field8600;
                return;
            }
            if (arg0 == 6205) {
                field5140[field5132++] = class375.field5410;
                field5140[field5132++] = class228.field3252;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5140[field5132++] = (int) (class109.method731(81) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5140[field5132++] = (int) (class109.method731(108) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5132 -= 3;
                int var231 = field5140[field5132];
                int var232 = field5140[field5132 + 1];
                int var233 = field5140[field5132 + 2];
                long var234 = class188.method1393(0, var233, var231, (byte) 55, var232, 12, 0);
                int var236 = class254.method1678((byte) 102, var234);
                if (var233 < 1970) {
                    var236--;
                }
                field5140[field5132++] = var236;
                return;
            }
            if (arg0 == 6303) {
                field5140[field5132++] = class512.method2989(11, class109.method731(94));
                return;
            }
            if (arg0 == 6304) {
                int var237 = field5140[--field5132];
                boolean var238 = true;
                if (var237 < 0) {
                    var238 = (var237 + 1) % 4 == 0;
                } else if (var237 < 1582) {
                    var238 = var237 % 4 == 0;
                } else if (var237 % 4 != 0) {
                    var238 = false;
                } else if (var237 % 100 != 0) {
                    var238 = true;
                } else if (var237 % 400 != 0) {
                    var238 = false;
                }
                field5140[field5132++] = var238 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var239 = field5140[--field5132];
                int[] var240 = class503.method2934(var239, (byte) 124);
                class42.method289(var240, 0, field5140, field5132, 3);
                field5132 += 3;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5140[field5132++] = class308.method2019(11473) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5140[field5132++] = class788.method4316(false) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class757.field10456 == 7 && class237.field3423 == 0 && class284.field4365 == 0) {
                    if (class195.field2874) {
                        field5140[field5132++] = 0;
                        return;
                    }
                    if (class422.field5968 > class109.method731(18) - 1000L) {
                        field5140[field5132++] = 1;
                        return;
                    }
                    class195.field2874 = true;
                    class731 var241 = class155.method1222(260, class477.field6779, class237.field3417);
                    var241.field10211.method879((byte) -126, class533.field7527);
                    class533.method3088(var241, 0);
                    field5140[field5132++] = 0;
                    return;
                }
                field5140[field5132++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class162 var242 = class140.method975((byte) -116);
                if (var242 != null) {
                    field5140[field5132++] = var242.field2380;
                    field5140[field5132++] = var242.field10809;
                    field5150[field5134++] = var242.field2386;
                    class367 var243 = var242.method1274((byte) -120);
                    field5140[field5132++] = var243.field5284;
                    field5150[field5134++] = var243.field5285;
                    field5140[field5132++] = var242.field10799;
                    field5140[field5132++] = var242.field2382;
                    field5150[field5134++] = var242.field2387;
                    return;
                }
                field5140[field5132++] = -1;
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                field5140[field5132++] = 0;
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 6502) {
                class162 var244 = class220.method1519(1);
                if (var244 != null) {
                    field5140[field5132++] = var244.field2380;
                    field5140[field5132++] = var244.field10809;
                    field5150[field5134++] = var244.field2386;
                    class367 var245 = var244.method1274((byte) -120);
                    field5140[field5132++] = var245.field5284;
                    field5150[field5134++] = var245.field5285;
                    field5140[field5132++] = var244.field10799;
                    field5140[field5132++] = var244.field2382;
                    field5150[field5134++] = var244.field2387;
                    return;
                }
                field5140[field5132++] = -1;
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                field5140[field5132++] = 0;
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var246 = field5140[--field5132];
                String var247 = field5150[--field5134];
                if (class757.field10456 == 7 && class237.field3423 == 0 && class284.field4365 == 0) {
                    field5140[field5132++] = class330.method2131((byte) -14, var246, var247) ? 1 : 0;
                    return;
                }
                field5140[field5132++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var248 = field5140[--field5132];
                class162 var249 = class434.method2599(var248, false);
                if (var249 != null) {
                    field5140[field5132++] = var249.field10809;
                    field5150[field5134++] = var249.field2386;
                    class367 var250 = var249.method1274((byte) -120);
                    field5140[field5132++] = var250.field5284;
                    field5150[field5134++] = var250.field5285;
                    field5140[field5132++] = var249.field10799;
                    field5140[field5132++] = var249.field2382;
                    field5150[field5134++] = var249.field2387;
                    return;
                }
                field5140[field5132++] = -1;
                field5150[field5134++] = "";
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                field5140[field5132++] = 0;
                field5140[field5132++] = 0;
                field5150[field5134++] = "";
                return;
            }
            if (arg0 == 6507) {
                field5132 -= 4;
                int var251 = field5140[field5132];
                boolean var252 = field5140[field5132 + 1] == 1;
                int var253 = field5140[field5132 + 2];
                boolean var254 = field5140[field5132 + 3] == 1;
                class199.method1440(var253, (byte) 59, var252, var251, var254);
                return;
            }
            if (arg0 == 6508) {
                class587.method3406((byte) -43);
                return;
            }
            if (arg0 == 6509) {
                if (class757.field10456 != 7) {
                    return;
                }
                class640.field9022 = field5140[--field5132] == 1;
                return;
            }
            if (arg0 == 6510) {
                field5140[field5132++] = class722.field10136;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class624.field8798 == class482.field6854) {
                if (arg0 == 6700) {
                    int var255 = class251.field3547.method381(65);
                    if (class251.field3546 != -1) {
                        var255++;
                    }
                    field5140[field5132++] = var255;
                    return;
                }
                if (arg0 == 6701) {
                    int var256 = field5140[--field5132];
                    if (class251.field3546 != -1) {
                        if (var256 == 0) {
                            field5140[field5132++] = class251.field3546;
                            return;
                        }
                        var256--;
                    }
                    class329 var257 = (class329) class251.field3547.method382(0);
                    while (var256-- > 0) {
                        var257 = (class329) class251.field3547.method391(37);
                    }
                    field5140[field5132++] = var257.field4912;
                    return;
                }
                if (arg0 == 6702) {
                    int var258 = field5140[--field5132];
                    if (class110.field1382[var258] == null) {
                        field5150[field5134++] = "";
                        return;
                    }
                    String var259 = class110.field1382[var258][0].field2666;
                    if (var259 == null) {
                        field5150[field5134++] = "";
                        return;
                    }
                    field5150[field5134++] = var259.substring(0, var259.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var260 = field5140[--field5132];
                    if (class110.field1382[var260] == null) {
                        field5140[field5132++] = 0;
                        return;
                    }
                    field5140[field5132++] = class110.field1382[var260].length;
                    return;
                }
                if (arg0 == 6704) {
                    field5132 -= 2;
                    int var261 = field5140[field5132];
                    int var262 = field5140[field5132 + 1];
                    if (class110.field1382[var261] == null) {
                        field5150[field5134++] = "";
                        return;
                    }
                    String var263 = class110.field1382[var261][var262].field2666;
                    if (var263 == null) {
                        field5150[field5134++] = "";
                        return;
                    }
                    field5150[field5134++] = var263;
                    return;
                }
                if (arg0 == 6705) {
                    field5132 -= 2;
                    int var264 = field5140[field5132];
                    int var265 = field5140[field5132 + 1];
                    if (class110.field1382[var264] == null) {
                        field5140[field5132++] = 0;
                        return;
                    }
                    field5140[field5132++] = class110.field1382[var264][var265].field2611;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field5132 -= 3;
                    int var266 = field5140[field5132];
                    int var267 = field5140[field5132 + 1];
                    int var268 = field5140[field5132 + 2];
                    class587.method3405(var268, 1, true, "", var266 << 16 | var267);
                    return;
                }
                if (arg0 == 6708) {
                    field5132 -= 3;
                    int var269 = field5140[field5132];
                    int var270 = field5140[field5132 + 1];
                    int var271 = field5140[field5132 + 2];
                    class587.method3405(var271, 2, true, "", var269 << 16 | var270);
                    return;
                }
                if (arg0 == 6709) {
                    field5132 -= 3;
                    int var272 = field5140[field5132];
                    int var273 = field5140[field5132 + 1];
                    int var274 = field5140[field5132 + 2];
                    class587.method3405(var274, 3, true, "", var272 << 16 | var273);
                    return;
                }
                if (arg0 == 6710) {
                    field5132 -= 3;
                    int var275 = field5140[field5132];
                    int var276 = field5140[field5132 + 1];
                    int var277 = field5140[field5132 + 2];
                    class587.method3405(var277, 4, true, "", var275 << 16 | var276);
                    return;
                }
                if (arg0 == 6711) {
                    field5132 -= 3;
                    int var278 = field5140[field5132];
                    int var279 = field5140[field5132 + 1];
                    int var280 = field5140[field5132 + 2];
                    class587.method3405(var280, 5, true, "", var278 << 16 | var279);
                    return;
                }
                if (arg0 == 6712) {
                    field5132 -= 3;
                    int var281 = field5140[field5132];
                    int var282 = field5140[field5132 + 1];
                    int var283 = field5140[field5132 + 2];
                    class587.method3405(var283, 6, true, "", var281 << 16 | var282);
                    return;
                }
                if (arg0 == 6713) {
                    field5132 -= 3;
                    int var284 = field5140[field5132];
                    int var285 = field5140[field5132 + 1];
                    int var286 = field5140[field5132 + 2];
                    class587.method3405(var286, 7, true, "", var284 << 16 | var285);
                    return;
                }
                if (arg0 == 6714) {
                    field5132 -= 3;
                    int var287 = field5140[field5132];
                    int var288 = field5140[field5132 + 1];
                    int var289 = field5140[field5132 + 2];
                    class587.method3405(var289, 8, true, "", var287 << 16 | var288);
                    return;
                }
                if (arg0 == 6715) {
                    field5132 -= 3;
                    int var290 = field5140[field5132];
                    int var291 = field5140[field5132 + 1];
                    int var292 = field5140[field5132 + 2];
                    class587.method3405(var292, 9, true, "", var290 << 16 | var291);
                    return;
                }
                if (arg0 == 6716) {
                    field5132 -= 3;
                    int var293 = field5140[field5132];
                    int var294 = field5140[field5132 + 1];
                    int var295 = field5140[field5132 + 2];
                    class587.method3405(var295, 10, true, "", var293 << 16 | var294);
                    return;
                }
                if (arg0 == 6717) {
                    field5132 -= 3;
                    int var296 = field5140[field5132];
                    int var297 = field5140[field5132 + 1];
                    int var298 = field5140[field5132 + 2];
                    class176 var299 = class333.method2152(false, var298, var296 << 16 | var297);
                    class272.method1770(-1);
                    class654 var300 = client.method2049(var299);
                    class574.method3337((byte) -89, var299, var300.field9230, var300.method3748(121));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var301 = field5140[--field5132];
                    class665 var302 = class247.field3521.method3711((byte) 116, var301);
                    if (var302.field9326 == null) {
                        field5150[field5134++] = "";
                        return;
                    }
                    field5150[field5134++] = var302.field9326;
                    return;
                }
                if (arg0 == 6801) {
                    int var303 = field5140[--field5132];
                    class665 var304 = class247.field3521.method3711((byte) 70, var303);
                    field5140[field5132++] = var304.field9354;
                    return;
                }
                if (arg0 == 6802) {
                    int var305 = field5140[--field5132];
                    class665 var306 = class247.field3521.method3711((byte) 122, var305);
                    field5140[field5132++] = var306.field9347;
                    return;
                }
                if (arg0 == 6803) {
                    int var307 = field5140[--field5132];
                    class665 var308 = class247.field3521.method3711((byte) 57, var307);
                    field5140[field5132++] = var308.field9335;
                    return;
                }
                if (arg0 == 6804) {
                    field5132 -= 2;
                    int var309 = field5140[field5132];
                    int var310 = field5140[field5132 + 1];
                    class330 var311 = class788.field10824.method1609(var310, -86);
                    if (var311.method2134(-19881)) {
                        field5150[field5134++] = class247.field3521.method3711((byte) 91, var309).method3785(var311.field4921, var310, (byte) -117);
                        return;
                    }
                    field5140[field5132++] = class247.field3521.method3711((byte) 127, var309).method3790(var311.field4920, var310, -1);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field5140[field5132++] = class724.field10150 && !class542.field7600 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field5140[field5132++] = (int) (class581.field8251 / 60000L);
                    field5140[field5132++] = (int) ((class581.field8251 - class109.method731(25) - class208.field3033) / 60000L);
                    field5140[field5132++] = class752.field10425 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field5140[field5132++] = class410.field5794;
                    return;
                }
                if (arg0 == 6903) {
                    field5140[field5132++] = class493.field7008;
                    return;
                }
                if (arg0 == 6904) {
                    field5140[field5132++] = class571.field8096;
                    return;
                }
                if (arg0 == 6905) {
                    String var312 = "";
                    if (class125.field1645 != null) {
                        if (class125.field1645.field5317 == null) {
                            var312 = class390.method2388(76, class125.field1645.field5313);
                        } else {
                            var312 = (String) class125.field1645.field5317;
                        }
                    }
                    field5150[field5134++] = var312;
                    return;
                }
                if (arg0 == 6906) {
                    field5140[field5132++] = class549.field7738;
                    return;
                }
                if (arg0 == 6907) {
                    field5140[field5132++] = class273.field3804;
                    return;
                }
                if (arg0 == 6908) {
                    field5140[field5132++] = class575.field8134;
                    return;
                }
                if (arg0 == 6909) {
                    field5140[field5132++] = class617.field8710 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field5140[field5132++] = class377.field5417;
                    return;
                }
                if (arg0 == 6911) {
                    field5140[field5132++] = class512.field7326;
                    return;
                }
                if (arg0 == 6912) {
                    field5140[field5132++] = class299.field4500;
                    return;
                }
                if (arg0 == 6913) {
                    field5140[field5132++] = class478.field6786;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var313 = class754.method4177(98);
                    field5140[field5132++] = class164.field2410 = class145.field1852.field9002.method2258((byte) -57);
                    field5140[field5132++] = var313;
                    class710.method4020(true);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class481.method2822(0);
                    class710.method4020(true);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class566.method3293(true);
                    class710.method4020(true);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class478.method2814(0);
                    class710.method4020(true);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class34.method232((byte) -65, true);
                    class710.method4020(true);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class145.field1852.method3632(class145.field1852.field8995, true, 0);
                    class781.method4285(3);
                    class399.field5669 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class164.field2410 == 2) {
                        class489.field6924 = true;
                        return;
                    }
                    if (class164.field2410 == 1) {
                        class261.field3672 = true;
                        return;
                    }
                    if (class164.field2410 == 3) {
                        class135.field1753 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field5140[field5132++] = class145.field1852.field8995.method3987((byte) -36);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field5132 -= 2;
                    int var314 = field5140[field5132];
                    int var315 = field5140[field5132 + 1];
                    if (var314 != -1) {
                        if (var315 > 255) {
                            var315 = 255;
                        } else if (var315 < 0) {
                            var315 = 0;
                        }
                        class186.method1380(false, var314, (byte) 99, var315);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var316 = field5140[--field5132];
                    if (var316 != -1) {
                        class770.method4236(var316, 1);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var317 = field5140[--field5132];
                    if (var317 != -1) {
                        class332.method2150(var317, 113);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field5140[field5132++] = class438.method2647((byte) 67, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field5140[field5132++] = class145.field1852.field8993.method1385(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field5140[field5132++] = class145.field1852.field9008.method1697(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field5140[field5132++] = class145.field1852.field9017.method3213(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field5140[field5132++] = class145.field1852.field9011.method2492(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field5140[field5132++] = class145.field1852.field9023.method1397(14996) && class638.field8979.method461() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field5140[field5132++] = class145.field1852.field9021.method1412(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field5140[field5132++] = class145.field1852.field8999.method1704(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field5140[field5132++] = class145.field1852.field8981.method3236(14996) && class638.field8979.method497() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field5140[field5132++] = class145.field1852.field9030.method665(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field5140[field5132++] = class145.field1852.field9031.method2234(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field5140[field5132++] = class145.field1852.field9010.method710(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field5140[field5132++] = class145.field1852.field8996.method1491(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field5140[field5132++] = class145.field1852.field9032.method1722(14996) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field5140[field5132++] = class145.field1852.field9016.method2257(14996) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var318 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field8993.method666((byte) 112, var318);
                    return;
                }
                if (arg0 == 7302) {
                    int var319 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9008.method666((byte) 112, var319);
                    return;
                }
                if (arg0 == 7303) {
                    int var320 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9017.method666((byte) 112, var320);
                    return;
                }
                if (arg0 == 7304) {
                    int var321 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9011.method666((byte) 112, var321);
                    return;
                }
                if (arg0 == 7305) {
                    int var322 = field5140[--field5132];
                    if (!class638.field8979.method461()) {
                        field5140[field5132++] = 3;
                        return;
                    }
                    field5140[field5132++] = class145.field1852.field9023.method666((byte) 112, var322);
                    return;
                }
                if (arg0 == 7306) {
                    int var323 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9021.method666((byte) 112, var323);
                    return;
                }
                if (arg0 == 7307) {
                    int var324 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field8999.method666((byte) 112, var324);
                    return;
                }
                if (arg0 == 7308) {
                    int var325 = field5140[--field5132];
                    if (!class638.field8979.method497()) {
                        field5140[field5132++] = 3;
                        return;
                    }
                    field5140[field5132++] = class145.field1852.field8981.method666((byte) 112, var325);
                    return;
                }
                if (arg0 == 7309) {
                    int var326 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9030.method666((byte) 112, var326);
                    return;
                }
                if (arg0 == 7310) {
                    int var327 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9031.method666((byte) 112, var327);
                    return;
                }
                if (arg0 == 7311) {
                    int var328 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9010.method666((byte) 112, var328);
                    return;
                }
                if (arg0 == 7312) {
                    int var329 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field8996.method666((byte) 112, var329);
                    return;
                }
                if (arg0 == 7313) {
                    int var330 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9032.method666((byte) 112, var330);
                    return;
                }
                if (arg0 == 7314) {
                    int var331 = field5140[--field5132];
                    field5140[field5132++] = class145.field1852.field9016.method666((byte) 112, var331);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
    public static final void method2229(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    private static final void method2230(int arg0) {
        class176 var1 = class518.method3014(arg0, -115);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class176[] var3 = class222.field3192[var2];
        if (var3 == null) {
            class176[] var4 = class110.field1382[var2];
            int var5 = var4.length;
            var3 = class222.field3192[var2] = new class176[var5];
            class42.method291(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class42.method291(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
    private static final int method2231(int arg0) {
        class632 var1 = class511.field7304.method994(arg0, 54);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field5124.method555(class536.field7555.field1305 << 16 | arg0, (byte) -71);
        if (var2 == null) {
            return var1.field8928 == 'i' || var1.field8928 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2232(String arg0, int arg1) {
        if (class282.field4334 == 0 && !(!class724.field10150 || class542.field7600) || class365.field5272) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class674.field9598.method3825((byte) -10, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class674.field9598.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9599.method3825((byte) -10, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class674.field9599.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9600.method3825((byte) -10, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class674.field9600.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9601.method3825((byte) -10, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class674.field9601.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9602.method3825((byte) -10, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class674.field9602.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9603.method3825((byte) -10, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class674.field9603.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9604.method3825((byte) -10, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class674.field9604.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9605.method3825((byte) -10, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class674.field9605.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9606.method3825((byte) -10, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class674.field9606.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9607.method3825((byte) -10, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class674.field9607.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9608.method3825((byte) -10, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class674.field9608.method3825((byte) -10, 0).length());
        } else if (var2.startsWith(class674.field9609.method3825((byte) -10, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class674.field9609.method3825((byte) -10, 0).length());
        } else if (class526.field7494 != 0) {
            if (var2.startsWith(class674.field9598.method3825((byte) -10, class526.field7494))) {
                var3 = 0;
                arg0 = arg0.substring(class674.field9598.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9599.method3825((byte) -10, class526.field7494))) {
                var3 = 1;
                arg0 = arg0.substring(class674.field9599.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9600.method3825((byte) -10, class526.field7494))) {
                var3 = 2;
                arg0 = arg0.substring(class674.field9600.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9601.method3825((byte) -10, class526.field7494))) {
                var3 = 3;
                arg0 = arg0.substring(class674.field9601.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9602.method3825((byte) -10, class526.field7494))) {
                var3 = 4;
                arg0 = arg0.substring(class674.field9602.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9603.method3825((byte) -10, class526.field7494))) {
                var3 = 5;
                arg0 = arg0.substring(class674.field9603.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9604.method3825((byte) -10, class526.field7494))) {
                var3 = 6;
                arg0 = arg0.substring(class674.field9604.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9605.method3825((byte) -10, class526.field7494))) {
                var3 = 7;
                arg0 = arg0.substring(class674.field9605.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9606.method3825((byte) -10, class526.field7494))) {
                var3 = 8;
                arg0 = arg0.substring(class674.field9606.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9607.method3825((byte) -10, class526.field7494))) {
                var3 = 9;
                arg0 = arg0.substring(class674.field9607.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9608.method3825((byte) -10, class526.field7494))) {
                var3 = 10;
                arg0 = arg0.substring(class674.field9608.method3825((byte) -10, class526.field7494).length());
            } else if (var2.startsWith(class674.field9609.method3825((byte) -10, class526.field7494))) {
                var3 = 11;
                arg0 = arg0.substring(class674.field9609.method3825((byte) -10, class526.field7494).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class674.field9610.method3825((byte) -10, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class674.field9610.method3825((byte) -10, 0).length());
        } else if (var4.startsWith(class674.field9611.method3825((byte) -10, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class674.field9611.method3825((byte) -10, 0).length());
        } else if (var4.startsWith(class674.field9612.method3825((byte) -10, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class674.field9612.method3825((byte) -10, 0).length());
        } else if (var4.startsWith(class674.field9613.method3825((byte) -10, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class674.field9613.method3825((byte) -10, 0).length());
        } else if (var4.startsWith(class674.field9614.method3825((byte) -10, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class674.field9614.method3825((byte) -10, 0).length());
        } else if (class526.field7494 != 0) {
            if (var4.startsWith(class674.field9610.method3825((byte) -10, class526.field7494))) {
                var5 = 1;
                arg0 = arg0.substring(class674.field9610.method3825((byte) -10, class526.field7494).length());
            } else if (var4.startsWith(class674.field9611.method3825((byte) -10, class526.field7494))) {
                var5 = 2;
                arg0 = arg0.substring(class674.field9611.method3825((byte) -10, class526.field7494).length());
            } else if (var4.startsWith(class674.field9612.method3825((byte) -10, class526.field7494))) {
                var5 = 3;
                arg0 = arg0.substring(class674.field9612.method3825((byte) -10, class526.field7494).length());
            } else if (var4.startsWith(class674.field9613.method3825((byte) -10, class526.field7494))) {
                var5 = 4;
                arg0 = arg0.substring(class674.field9613.method3825((byte) -10, class526.field7494).length());
            } else if (var4.startsWith(class674.field9614.method3825((byte) -10, class526.field7494))) {
                var5 = 5;
                arg0 = arg0.substring(class674.field9614.method3825((byte) -10, class526.field7494).length());
            }
        }
        field5142++;
        class731 var6 = class155.method1222(260, class655.field9239, class237.field3417);
        var6.field10211.method851((byte) -2, 0);
        int var7 = var6.field10211.field1521;
        var6.field10211.method851((byte) -2, var3);
        var6.field10211.method851((byte) -2, var5);
        class196.method1423(true, arg0, var6.field10211);
        var6.field10211.method849(-92, var6.field10211.field1521 - var7);
        class533.method3088(var6, 0);
    }
}
