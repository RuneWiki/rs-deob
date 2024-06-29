import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class630 {

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[Lfg;")
    private static class108[] field9042 = new class108[50];

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    private static int field9045 = 0;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    private static int[] field9041 = new int[5];

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    private static int[] field9048 = new int[1000];

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[[I")
    private static int[][] field9053 = new int[5][5000];

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    private static int field9056 = 0;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    private static int field9057 = 0;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field9058 = new String[1000];

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Ljava/util/Calendar;")
    private static Calendar field9047 = Calendar.getInstance();

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
    private static int[] field9060 = new int[3];

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field9061 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Lsw;")
    public static class641 field9059 = new class641(4);

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    private static int field9062 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lgk;")
    private static class402 field9054;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Let;")
    private static class509 field9052;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Let;")
    private static class509 field9055;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
    private static int[] field9037;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field9038;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method3607(int arg0) {
        if (arg0 == -1 || !class640.method3678(false, arg0)) {
            return;
        }
        class509[] var1 = class459.field6326[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class509 var3 = var1[var2];
            if (var3.field7128 != null) {
                class503 var4 = new class503();
                var4.field6973 = var3;
                var4.field6975 = var3.field7128;
                method3609(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Leba;)V")
    public static final void method3608(class503 arg0) {
        method3609(arg0, 200000);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Leba;I)V")
    private static final void method3609(class503 arg0, int arg1) {
        Object[] var2 = arg0.field6975;
        int var3 = (Integer) var2[0];
        class126 var4 = class125.method714(var3, (byte) 124);
        if (var4 == null) {
            return;
        }
        field9037 = new int[var4.field1545];
        int var5 = 0;
        field9038 = new String[var4.field1543];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field6976;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field6981;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field6973 == null ? -1 : arg0.field6973.field7045;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field6972;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field6973 == null ? -1 : arg0.field6973.field7086;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field6983 == null ? -1 : arg0.field6983.field7045;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field6983 == null ? -1 : arg0.field6983.field7086;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field6984;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field6982;
                }
                field9037[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field6977;
                }
                field9038[var6++] = var9;
            }
        }
        field9062 = arg0.field6969;
        method3618(var4, arg1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public static void method3610() {
        field9037 = null;
        field9038 = null;
        field9041 = null;
        field9053 = null;
        field9048 = null;
        field9058 = null;
        field9042 = null;
        field9055 = null;
        field9052 = null;
        field9054 = null;
        field9047 = null;
        field9061 = null;
        field9060 = null;
        field9059 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    private static final void method3611(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field9056 -= 3;
                int var2 = field9048[field9056];
                int var3 = field9048[field9056 + 1];
                int var4 = field9048[field9056 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class509 var5 = class61.method348(var2, true);
                if (var5.field7101 == null) {
                    var5.field7101 = new class509[var4 + 1];
                }
                if (var5.field7101.length <= var4) {
                    class509[] var6 = new class509[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7101.length; var7++) {
                        var6[var7] = var5.field7101[var7];
                    }
                    var5.field7101 = var6;
                }
                if (var4 > 0 && var5.field7101[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class509 var8 = new class509();
                var8.field7197 = var3;
                var8.field7054 = var8.field7045 = var5.field7045;
                var8.field7086 = var4;
                var5.field7101[var4] = var8;
                if (arg1) {
                    field9052 = var8;
                } else {
                    field9055 = var8;
                }
                class87.method508(127, var5);
                return;
            }
            if (arg0 == 101) {
                class509 var9 = arg1 ? field9052 : field9055;
                if (var9.field7086 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class509 var10 = class61.method348(var9.field7045, true);
                var10.field7101[var9.field7086] = null;
                class87.method508(125, var10);
                return;
            }
            if (arg0 == 102) {
                class509 var11 = class61.method348(field9048[--field9056], true);
                var11.field7101 = null;
                class87.method508(125, var11);
                return;
            }
            if (arg0 == 200) {
                field9056 -= 2;
                int var12 = field9048[field9056];
                int var13 = field9048[field9056 + 1];
                class509 var14 = class369.method2071(var12, var13, -20190);
                if (var14 != null && var13 != -1) {
                    field9048[field9056++] = 1;
                    if (arg1) {
                        field9052 = var14;
                        return;
                    }
                    field9055 = var14;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9048[--field9056];
                class509 var16 = class61.method348(var15, true);
                if (var16 != null) {
                    field9048[field9056++] = 1;
                    if (arg1) {
                        field9052 = var16;
                        return;
                    }
                    field9055 = var16;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9048[--field9056];
                method3615(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9048[--field9056];
                method3612(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9056 -= 2;
                int var19 = field9048[field9056];
                int var20 = field9048[field9056 + 1];
                for (int var21 = 0; var21 < class459.field6337.length; var21++) {
                    if (class459.field6337[var21] == var19) {
                        class103.field1265.field8002.method2874(var21, class368.field4857, var20, 1242619568);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class374.field4925.length; var22++) {
                    if (class374.field4925[var22] == var19) {
                        class103.field1265.field8002.method2874(var22, class368.field4857, var20, 1242619568);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9056 -= 2;
                int var23 = field9048[field9056];
                int var24 = field9048[field9056 + 1];
                class103.field1265.field8002.method2880(-181, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9048[--field9056] != 0;
                class103.field1265.field8002.method2877(var25, 93);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class509 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class61.method348(field9048[--field9056], true);
            } else {
                var26 = arg1 ? field9052 : field9055;
            }
            if (arg0 == 1000) {
                field9056 -= 4;
                var26.field7071 = field9048[field9056];
                var26.field7051 = field9048[field9056 + 1];
                int var27 = field9048[field9056 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field9048[field9056 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field7200 = (byte) var27;
                var26.field7077 = (byte) var28;
                class87.method508(125, var26);
                class217.method1246(var26, 6);
                if (var26.field7086 == -1) {
                    class295.method1646(var26.field7045, (byte) -98);
                }
                return;
            }
            if (arg0 == 1001) {
                field9056 -= 4;
                var26.field7095 = field9048[field9056];
                var26.field7090 = field9048[field9056 + 1];
                var26.field7123 = 0;
                var26.field7201 = 0;
                int var29 = field9048[field9056 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field9048[field9056 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field7126 = (byte) var29;
                var26.field7096 = (byte) var30;
                class87.method508(124, var26);
                class217.method1246(var26, 6);
                if (var26.field7197 == 0) {
                    class619.method3556(10438, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field9048[--field9056] == 1;
                if (var26.field7125 != var31) {
                    var26.field7125 = var31;
                    class87.method508(125, var26);
                }
                if (var26.field7086 == -1) {
                    class613.method3523(var26.field7045, (byte) 8);
                }
                return;
            }
            if (arg0 == 1004) {
                field9056 -= 2;
                var26.field7137 = field9048[field9056];
                var26.field7083 = field9048[field9056 + 1];
                class87.method508(127, var26);
                class217.method1246(var26, 6);
                if (var26.field7197 == 0) {
                    class619.method3556(10438, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field7105 = field9048[--field9056] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class509 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class61.method348(field9048[--field9056], true);
            } else {
                var32 = arg1 ? field9052 : field9055;
            }
            if (arg0 == 1100) {
                field9056 -= 2;
                var32.field7190 = field9048[field9056];
                if (var32.field7190 > var32.field7185 - var32.field7094) {
                    var32.field7190 = var32.field7185 - var32.field7094;
                }
                if (var32.field7190 < 0) {
                    var32.field7190 = 0;
                }
                var32.field7104 = field9048[field9056 + 1];
                if (var32.field7104 > var32.field7180 - var32.field7059) {
                    var32.field7104 = var32.field7180 - var32.field7059;
                }
                if (var32.field7104 < 0) {
                    var32.field7104 = 0;
                }
                class87.method508(125, var32);
                if (var32.field7086 == -1) {
                    class236.method1338(var32.field7045, (byte) 126);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field7085 = field9048[--field9056];
                class87.method508(126, var32);
                if (var32.field7086 == -1) {
                    class219.method1262((byte) -106, var32.field7045);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field7119 = field9048[--field9056] == 1;
                class87.method508(125, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field7173 = field9048[--field9056];
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field7049 = field9048[--field9056];
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field9048[--field9056];
                if (var32.field7065 != var33) {
                    var32.field7065 = var33;
                    class87.method508(126, var32);
                }
                if (var32.field7086 == -1) {
                    class203.method1090((byte) -124, var32.field7045);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field7169 = field9048[--field9056];
                class87.method508(127, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field7079 = field9048[--field9056] == 1;
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field7102 = 1;
                var32.field7097 = field9048[--field9056];
                class87.method508(127, var32);
                if (var32.field7086 == -1) {
                    class548.method3216(var32.field7045, 25253);
                }
                return;
            }
            if (arg0 == 1109) {
                field9056 -= 6;
                var32.field7117 = field9048[field9056];
                var32.field7062 = field9048[field9056 + 1];
                var32.field7189 = field9048[field9056 + 2];
                var32.field7042 = field9048[field9056 + 3];
                var32.field7156 = field9048[field9056 + 4];
                var32.field7144 = field9048[field9056 + 5];
                class87.method508(127, var32);
                if (var32.field7086 == -1) {
                    class7.method40(8, var32.field7045);
                    class561.method3274(var32.field7045, 10);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field9048[--field9056];
                if (var32.field7141 != var34) {
                    var32.field7141 = var34;
                    var32.field7047 = 0;
                    var32.field7063 = 1;
                    var32.field7084 = 0;
                    class87.method508(126, var32);
                }
                if (var32.field7086 == -1) {
                    class288.method1622(var32.field7045, 5);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field7138 = field9048[--field9056] == 1;
                class87.method508(124, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field9058[--field9045];
                if (!var35.equals(var32.field7078)) {
                    var32.field7078 = var35;
                    class87.method508(124, var32);
                }
                if (var32.field7086 == -1) {
                    class57.method327(var32.field7045, false);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field7179 = field9048[--field9056];
                class87.method508(125, var32);
                if (var32.field7086 == -1) {
                    class618.method3549(var32.field7045, false);
                }
                return;
            }
            if (arg0 == 1114) {
                field9056 -= 3;
                var32.field7188 = field9048[field9056];
                var32.field7068 = field9048[field9056 + 1];
                var32.field7098 = field9048[field9056 + 2];
                class87.method508(125, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field7113 = field9048[--field9056] == 1;
                class87.method508(125, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field7107 = field9048[--field9056];
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field7153 = field9048[--field9056];
                class87.method508(127, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field7166 = field9048[--field9056] == 1;
                class87.method508(125, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field7043 = field9048[--field9056] == 1;
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1120) {
                field9056 -= 2;
                var32.field7185 = field9048[field9056];
                var32.field7180 = field9048[field9056 + 1];
                class87.method508(124, var32);
                if (var32.field7197 == 0) {
                    class619.method3556(10438, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field9056 -= 2;
                var32.field7100 = (short) field9048[field9056];
                var32.field7171 = (short) field9048[field9056 + 1];
                class87.method508(125, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field7147 = field9048[--field9056] == 1;
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field7144 = field9048[--field9056];
                class87.method508(126, var32);
                if (var32.field7086 == -1) {
                    class7.method40(8, var32.field7045);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field9048[--field9056];
                var32.field7133 = var36 == 1;
                class87.method508(126, var32);
                return;
            }
            if (arg0 == 1125) {
                field9056 -= 2;
                var32.field7118 = field9048[field9056];
                var32.field7178 = field9048[field9056 + 1];
                class87.method508(124, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field7040 = field9048[--field9056];
                class87.method508(125, var32);
                return;
            }
            if (arg0 == 1127) {
                field9056 -= 2;
                int var37 = field9048[field9056];
                int var38 = field9048[field9056 + 1];
                class395 var39 = class290.field3771.method2793(11, var37);
                if (var39.field5211 != var38) {
                    var32.method2918(var38, (byte) -9, var37);
                    return;
                }
                var32.method2926(var37, 0);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field9048[--field9056];
                String var41 = field9058[--field9045];
                class395 var42 = class290.field3771.method2793(11, var40);
                if (!var42.field5217.equals(var41)) {
                    var32.method2929(var41, var40, (byte) 55);
                    return;
                }
                var32.method2926(var40, 0);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class509 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class61.method348(field9048[--field9056], true);
            } else {
                var43 = arg1 ? field9052 : field9055;
            }
            class87.method508(124, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9056 -= 2;
                int var44 = field9048[field9056];
                int var45 = field9048[field9056 + 1];
                if (var43.field7086 == -1) {
                    class127.method722(var43.field7045, -100);
                    class7.method40(8, var43.field7045);
                    class561.method3274(var43.field7045, 10);
                }
                if (var44 == -1) {
                    var43.field7102 = 1;
                    var43.field7097 = -1;
                    var43.field7082 = -1;
                    return;
                }
                var43.field7082 = var44;
                var43.field7163 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field7067 = true;
                } else {
                    var43.field7067 = false;
                }
                class607 var46 = class449.field6217.method2026((byte) -85, var44);
                var43.field7189 = var46.field8799;
                var43.field7042 = var46.field8786;
                var43.field7156 = var46.field8813;
                var43.field7117 = var46.field8759;
                var43.field7062 = var46.field8815;
                var43.field7144 = var46.field8783;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field7192 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field7192 = 1;
                } else {
                    var43.field7192 = 2;
                }
                if (var43.field7123 > 0) {
                    var43.field7144 = var43.field7144 * 32 / var43.field7123;
                    return;
                }
                if (var43.field7095 > 0) {
                    var43.field7144 = var43.field7144 * 32 / var43.field7095;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field7102 = 2;
                var43.field7097 = field9048[--field9056];
                if (var43.field7086 == -1) {
                    class548.method3216(var43.field7045, 25253);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field7102 = 3;
                var43.field7097 = -1;
                if (var43.field7086 == -1) {
                    class548.method3216(var43.field7045, 25253);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field7102 = 6;
                var43.field7097 = field9048[--field9056];
                if (var43.field7086 == -1) {
                    class548.method3216(var43.field7045, 25253);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field7102 = 5;
                var43.field7097 = field9048[--field9056];
                if (var43.field7086 == -1) {
                    class548.method3216(var43.field7045, 25253);
                }
                return;
            }
            if (arg0 == 1206) {
                field9056 -= 4;
                var43.field7127 = field9048[field9056];
                var43.field7041 = field9048[field9056 + 1];
                var43.field7191 = field9048[field9056 + 2];
                var43.field7121 = field9048[field9056 + 3];
                class87.method508(127, var43);
                return;
            }
            if (arg0 == 1207) {
                field9056 -= 2;
                var43.field7073 = field9048[field9056];
                var43.field7074 = field9048[field9056 + 1];
                class87.method508(125, var43);
                return;
            }
            if (arg0 == 1210) {
                field9056 -= 4;
                var43.field7097 = field9048[field9056];
                var43.field7202 = field9048[field9056 + 1];
                if (field9048[field9056 + 2] == 1) {
                    var43.field7102 = 9;
                } else {
                    var43.field7102 = 8;
                }
                if (field9048[field9056 + 3] == 1) {
                    var43.field7067 = true;
                } else {
                    var43.field7067 = false;
                }
                if (var43.field7086 == -1) {
                    class548.method3216(var43.field7045, 25253);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field7102 = 5;
                var43.field7097 = class82.field1003;
                var43.field7202 = 0;
                if (var43.field7086 == -1) {
                    class548.method3216(var43.field7045, 25253);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class509 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class61.method348(field9048[--field9056], true);
                } else {
                    var58 = arg1 ? field9052 : field9055;
                }
                String var59 = field9058[--field9045];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field9048[--field9056];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field9048[--field9056];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field9058[--field9045];
                    } else {
                        var62[var63] = Integer.valueOf(field9048[--field9056]);
                    }
                }
                int var64 = field9048[--field9056];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field7146 = var62;
                } else if (arg0 == 1401) {
                    var58.field7170 = var62;
                } else if (arg0 == 1402) {
                    var58.field7203 = var62;
                } else if (arg0 == 1403) {
                    var58.field7075 = var62;
                } else if (arg0 == 1404) {
                    var58.field7182 = var62;
                } else if (arg0 == 1405) {
                    var58.field7187 = var62;
                } else if (arg0 == 1406) {
                    var58.field7134 = var62;
                } else if (arg0 == 1407) {
                    var58.field7050 = var62;
                    var58.field7039 = var60;
                } else if (arg0 == 1408) {
                    var58.field7145 = var62;
                } else if (arg0 == 1409) {
                    var58.field7176 = var62;
                } else if (arg0 == 1410) {
                    var58.field7087 = var62;
                } else if (arg0 == 1411) {
                    var58.field7056 = var62;
                } else if (arg0 == 1412) {
                    var58.field7159 = var62;
                } else if (arg0 == 1414) {
                    var58.field7135 = var62;
                    var58.field7193 = var60;
                } else if (arg0 == 1415) {
                    var58.field7196 = var62;
                    var58.field7072 = var60;
                } else if (arg0 == 1416) {
                    var58.field7081 = var62;
                } else if (arg0 == 1417) {
                    var58.field7172 = var62;
                } else if (arg0 == 1418) {
                    var58.field7129 = var62;
                } else if (arg0 == 1419) {
                    var58.field7148 = var62;
                } else if (arg0 == 1420) {
                    var58.field7142 = var62;
                } else if (arg0 == 1421) {
                    var58.field7194 = var62;
                } else if (arg0 == 1422) {
                    var58.field7149 = var62;
                } else if (arg0 == 1423) {
                    var58.field7116 = var62;
                } else if (arg0 == 1424) {
                    var58.field7155 = var62;
                } else if (arg0 == 1425) {
                    var58.field7060 = var62;
                } else if (arg0 == 1426) {
                    var58.field7088 = var62;
                } else if (arg0 == 1427) {
                    var58.field7069 = var62;
                } else if (arg0 == 1428) {
                    var58.field7038 = var62;
                    var58.field7114 = var60;
                } else if (arg0 == 1429) {
                    var58.field7140 = var62;
                    var58.field7108 = var60;
                } else if (arg0 == 1430) {
                    var58.field7109 = var62;
                }
                var58.field7122 = true;
                return;
            }
            if (arg0 < 1600) {
                class509 var65 = arg1 ? field9052 : field9055;
                if (arg0 == 1500) {
                    field9048[field9056++] = var65.field7139;
                    return;
                }
                if (arg0 == 1501) {
                    field9048[field9056++] = var65.field7110;
                    return;
                }
                if (arg0 == 1502) {
                    field9048[field9056++] = var65.field7094;
                    return;
                }
                if (arg0 == 1503) {
                    field9048[field9056++] = var65.field7059;
                    return;
                }
                if (arg0 == 1504) {
                    field9048[field9056++] = var65.field7125 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field9048[field9056++] = var65.field7054;
                    return;
                }
                if (arg0 == 1506) {
                    class509 var66 = class285.method1606(true, var65);
                    field9048[field9056++] = var66 == null ? -1 : var66.field7045;
                    return;
                }
            } else if (arg0 < 1700) {
                class509 var67 = arg1 ? field9052 : field9055;
                if (arg0 == 1600) {
                    field9048[field9056++] = var67.field7190;
                    return;
                }
                if (arg0 == 1601) {
                    field9048[field9056++] = var67.field7104;
                    return;
                }
                if (arg0 == 1602) {
                    field9058[field9045++] = var67.field7078;
                    return;
                }
                if (arg0 == 1603) {
                    field9048[field9056++] = var67.field7185;
                    return;
                }
                if (arg0 == 1604) {
                    field9048[field9056++] = var67.field7180;
                    return;
                }
                if (arg0 == 1605) {
                    field9048[field9056++] = var67.field7144;
                    return;
                }
                if (arg0 == 1606) {
                    field9048[field9056++] = var67.field7189;
                    return;
                }
                if (arg0 == 1607) {
                    field9048[field9056++] = var67.field7156;
                    return;
                }
                if (arg0 == 1608) {
                    field9048[field9056++] = var67.field7042;
                    return;
                }
                if (arg0 == 1609) {
                    field9048[field9056++] = var67.field7173;
                    return;
                }
                if (arg0 == 1610) {
                    field9048[field9056++] = var67.field7117;
                    return;
                }
                if (arg0 == 1611) {
                    field9048[field9056++] = var67.field7062;
                    return;
                }
                if (arg0 == 1612) {
                    field9048[field9056++] = var67.field7065;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field9048[--field9056];
                    class395 var69 = class290.field3771.method2793(11, var68);
                    if (var69.method2273((byte) 43)) {
                        field9058[field9045++] = var67.method2927(var68, 2, var69.field5217);
                        return;
                    }
                    field9048[field9056++] = var67.method2924(var68, 94, var69.field5211);
                    return;
                }
            } else if (arg0 < 1800) {
                class509 var70 = arg1 ? field9052 : field9055;
                if (arg0 == 1700) {
                    field9048[field9056++] = var70.field7082;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field7082 != -1) {
                        field9048[field9056++] = var70.field7163;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field9048[field9056++] = var70.field7086;
                    return;
                }
            } else if (arg0 < 1900) {
                class509 var71 = arg1 ? field9052 : field9055;
                if (arg0 == 1800) {
                    field9048[field9056++] = client.method1412(var71).method1499(0);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field9048[--field9056];
                    int var334 = var72 - 1;
                    if (var71.field7132 != null && var334 < var71.field7132.length && var71.field7132[var334] != null) {
                        field9058[field9045++] = var71.field7132[var334];
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field7184 == null) {
                        field9058[field9045++] = "";
                        return;
                    }
                    field9058[field9045++] = var71.field7184;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class509 var332;
                if (arg0 >= 2000) {
                    var332 = class61.method348(field9048[--field9056], true);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field9052 : field9055;
                }
                if (field9062 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field7069 == null) {
                        return;
                    }
                    class503 var333 = new class503();
                    var333.field6973 = var332;
                    var333.field6975 = var332.field7069;
                    var333.field6969 = field9062 + 1;
                    class119.field1503.method1040(var333, -101);
                    return;
                }
            } else if (arg0 < 2600) {
                class509 var73 = class61.method348(field9048[--field9056], true);
                if (arg0 == 2500) {
                    field9048[field9056++] = var73.field7139;
                    return;
                }
                if (arg0 == 2501) {
                    field9048[field9056++] = var73.field7110;
                    return;
                }
                if (arg0 == 2502) {
                    field9048[field9056++] = var73.field7094;
                    return;
                }
                if (arg0 == 2503) {
                    field9048[field9056++] = var73.field7059;
                    return;
                }
                if (arg0 == 2504) {
                    field9048[field9056++] = var73.field7125 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field9048[field9056++] = var73.field7054;
                    return;
                }
                if (arg0 == 1506) {
                    class509 var74 = class285.method1606(true, var73);
                    field9048[field9056++] = var74 == null ? -1 : var74.field7045;
                    return;
                }
            } else if (arg0 < 2700) {
                class509 var75 = class61.method348(field9048[--field9056], true);
                if (arg0 == 2600) {
                    field9048[field9056++] = var75.field7190;
                    return;
                }
                if (arg0 == 2601) {
                    field9048[field9056++] = var75.field7104;
                    return;
                }
                if (arg0 == 2602) {
                    field9058[field9045++] = var75.field7078;
                    return;
                }
                if (arg0 == 2603) {
                    field9048[field9056++] = var75.field7185;
                    return;
                }
                if (arg0 == 2604) {
                    field9048[field9056++] = var75.field7180;
                    return;
                }
                if (arg0 == 2605) {
                    field9048[field9056++] = var75.field7144;
                    return;
                }
                if (arg0 == 2606) {
                    field9048[field9056++] = var75.field7189;
                    return;
                }
                if (arg0 == 2607) {
                    field9048[field9056++] = var75.field7156;
                    return;
                }
                if (arg0 == 2608) {
                    field9048[field9056++] = var75.field7042;
                    return;
                }
                if (arg0 == 2609) {
                    field9048[field9056++] = var75.field7173;
                    return;
                }
                if (arg0 == 2610) {
                    field9048[field9056++] = var75.field7117;
                    return;
                }
                if (arg0 == 2611) {
                    field9048[field9056++] = var75.field7062;
                    return;
                }
                if (arg0 == 2612) {
                    field9048[field9056++] = var75.field7065;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class509 var76 = class61.method348(field9048[--field9056], true);
                    field9048[field9056++] = var76.field7082;
                    return;
                }
                if (arg0 == 2701) {
                    class509 var77 = class61.method348(field9048[--field9056], true);
                    if (var77.field7082 != -1) {
                        field9048[field9056++] = var77.field7163;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field9048[--field9056];
                    class565 var79 = (class565) class309.field3937.method2645((long) var78, (byte) -106);
                    if (var79 != null) {
                        field9048[field9056++] = 1;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class509 var80 = class61.method348(field9048[--field9056], true);
                    if (var80.field7101 == null) {
                        field9048[field9056++] = 0;
                        return;
                    }
                    int var81 = var80.field7101.length;
                    for (int var82 = 0; var82 < var80.field7101.length; var82++) {
                        if (var80.field7101[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field9048[field9056++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field9056 -= 2;
                    int var83 = field9048[field9056];
                    int var84 = field9048[field9056 + 1];
                    class565 var85 = (class565) class309.field3937.method2645((long) var83, (byte) -121);
                    if (var85 != null && var85.field8297 == var84) {
                        field9048[field9056++] = 1;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class509 var86 = class61.method348(field9048[--field9056], true);
                if (arg0 == 2800) {
                    field9048[field9056++] = client.method1412(var86).method1499(0);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field9048[--field9056];
                    int var335 = var87 - 1;
                    if (var86.field7132 != null && var335 < var86.field7132.length && var86.field7132[var335] != null) {
                        field9058[field9045++] = var86.field7132[var335];
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field7184 == null) {
                        field9058[field9045++] = "";
                        return;
                    }
                    field9058[field9045++] = var86.field7184;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field9058[--field9045];
                    class435.method2514(var88, true);
                    return;
                }
                if (arg0 == 3101) {
                    field9056 -= 2;
                    class625.method3584(class103.field1265, true, field9048[field9056 + 1], field9048[field9056]);
                    return;
                }
                if (arg0 == 3103) {
                    class482.method2799(0, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field9058[--field9045];
                    int var90 = 0;
                    if (class398.method2284((byte) 80, var89)) {
                        var90 = class232.method1325(var89, 0);
                    }
                    field9040++;
                    class418.method2378(17984, class473.field6612);
                    class136.field1663.method2131(var90, -1495157560);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field9058[--field9045];
                    field9050++;
                    class418.method2378(17984, class587.field8510);
                    class136.field1663.method2093(var91.length() + 1, -102);
                    class136.field1663.method2106(-79, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field9058[--field9045];
                    field9039++;
                    class418.method2378(17984, class472.field6606);
                    class136.field1663.method2093(var92.length() + 1, -117);
                    class136.field1663.method2106(-59, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field9048[--field9056];
                    String var94 = field9058[--field9045];
                    class263.method1473(var94, var93, 8191);
                    return;
                }
                if (arg0 == 3108) {
                    field9056 -= 3;
                    int var95 = field9048[field9056];
                    int var96 = field9048[field9056 + 1];
                    int var97 = field9048[field9056 + 2];
                    class509 var98 = class61.method348(var97, true);
                    class108.method630(var96, 0, var95, var98);
                    return;
                }
                if (arg0 == 3109) {
                    field9056 -= 2;
                    int var99 = field9048[field9056];
                    int var100 = field9048[field9056 + 1];
                    class509 var101 = arg1 ? field9052 : field9055;
                    class108.method630(var100, 0, var99, var101);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field9048[--field9056];
                    field9036++;
                    class418.method2378(17984, class74.field857);
                    class136.field1663.method2115(var102, 3324);
                    return;
                }
                if (arg0 == 3111) {
                    field9056 -= 2;
                    int var103 = field9048[field9056];
                    int var104 = field9048[field9056 + 1];
                    class565 var105 = (class565) class309.field3937.method2645((long) var103, (byte) -104);
                    if (var105 != null) {
                        class615.method3541(var105, (byte) 119, true, var105.field8297 != var104);
                    }
                    class6.method36(var104, var103, true, 3, true);
                    return;
                }
                if (arg0 == 3112) {
                    field9056--;
                    int var106 = field9048[field9056];
                    class565 var107 = (class565) class309.field3937.method2645((long) var106, (byte) -116);
                    if (var107 != null && var107.field8293 == 3) {
                        class615.method3541(var107, (byte) 106, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class315.method1745(field9058[--field9045], 0);
                    return;
                }
                if (arg0 == 3114) {
                    field9056 -= 2;
                    int var108 = field9048[field9056];
                    int var109 = field9048[field9056 + 1];
                    String var110 = field9058[--field9045];
                    class589.method3415(var110, var108, "", var109, false, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field9056 -= 3;
                    class582.method3384(false, field9048[field9056], 255, field9048[field9056 + 1], field9048[field9056 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class641.method3693(-123, 255, 50, field9048[--field9056]);
                    return;
                }
                if (arg0 == 3202) {
                    field9056 -= 2;
                    class612.method3518(field9048[field9056 + 1], field9048[field9056], 1609725896, 255);
                    return;
                }
                if (arg0 == 3203) {
                    field9056 -= 4;
                    class582.method3384(false, field9048[field9056], field9048[field9056 + 3], field9048[field9056 + 1], field9048[field9056 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field9056 -= 3;
                    class641.method3693(10, field9048[field9056 + 1], field9048[field9056 + 2], field9048[field9056]);
                    return;
                }
                if (arg0 == 3205) {
                    field9056 -= 3;
                    class612.method3518(field9048[field9056 + 1], field9048[field9056], 1609725896, field9048[field9056 + 2]);
                    return;
                }
                if (arg0 == 3206) {
                    field9056 -= 4;
                    class530.method3018(field9048[field9056 + 2], field9048[field9056 + 1], (byte) -110, field9048[field9056 + 3], field9048[field9056]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field9048[field9056++] = class335.field4358;
                    return;
                }
                if (arg0 == 3301) {
                    field9056 -= 2;
                    int var111 = field9048[field9056];
                    int var112 = field9048[field9056 + 1];
                    field9048[field9056++] = class196.method1063(false, var112, -1, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field9056 -= 2;
                    int var113 = field9048[field9056];
                    int var114 = field9048[field9056 + 1];
                    field9048[field9056++] = class631.method3628(-1, var114, var113, false);
                    return;
                }
                if (arg0 == 3303) {
                    field9056 -= 2;
                    int var115 = field9048[field9056];
                    int var116 = field9048[field9056 + 1];
                    field9048[field9056++] = class563.method3289(var115, false, var116, 0);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field9048[--field9056];
                    field9048[field9056++] = class66.field638.method1284(123, var117).field7496;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field9048[--field9056];
                    field9048[field9056++] = class63.field627[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field9048[--field9056];
                    field9048[field9056++] = class11.field83[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field9048[--field9056];
                    field9048[field9056++] = class236.field2886[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class103.field1265.field8660;
                    int var122 = (class103.field1265.field8661 >> 7) + class632.field9113;
                    int var123 = (class103.field1265.field8652 >> 7) + class119.field1504;
                    field9048[field9056++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field9048[--field9056];
                    field9048[field9056++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field9048[--field9056];
                    field9048[field9056++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field9048[--field9056];
                    field9048[field9056++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field9048[field9056++] = class170.field2073 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field9056 -= 2;
                    int var127 = field9048[field9056];
                    int var128 = field9048[field9056 + 1];
                    field9048[field9056++] = class196.method1063(true, var128, -1, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field9056 -= 2;
                    int var129 = field9048[field9056];
                    int var130 = field9048[field9056 + 1];
                    field9048[field9056++] = class631.method3628(-1, var130, var129, true);
                    return;
                }
                if (arg0 == 3315) {
                    field9056 -= 2;
                    int var131 = field9048[field9056];
                    int var132 = field9048[field9056 + 1];
                    field9048[field9056++] = class563.method3289(var131, true, var132, 0);
                    return;
                }
                if (arg0 == 3316) {
                    if (class633.field9120 >= 2) {
                        field9048[field9056++] = class633.field9120;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field9048[field9056++] = class59.field577;
                    return;
                }
                if (arg0 == 3318) {
                    field9048[field9056++] = class237.field2960.field2715;
                    return;
                }
                if (arg0 == 3321) {
                    field9048[field9056++] = class334.field4327;
                    return;
                }
                if (arg0 == 3322) {
                    field9048[field9056++] = class33.field256;
                    return;
                }
                if (arg0 == 3323) {
                    if (class259.field3348 >= 5 && class259.field3348 <= 9) {
                        field9048[field9056++] = 1;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class259.field3348 >= 5 && class259.field3348 <= 9) {
                        field9048[field9056++] = class259.field3348;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field9048[field9056++] = class556.field8169 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field9048[field9056++] = class103.field1265.field8000;
                    return;
                }
                if (arg0 == 3327) {
                    field9048[field9056++] = class103.field1265.field8002.field6922 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field9048[field9056++] = class582.field8467 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field9048[--field9056];
                    field9048[field9056++] = class183.method1005(true, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field9056 -= 2;
                    int var134 = field9048[field9056];
                    int var135 = field9048[field9056 + 1];
                    field9048[field9056++] = class91.method553(false, (byte) -101, var134, false, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field9056 -= 2;
                    int var136 = field9048[field9056];
                    int var137 = field9048[field9056 + 1];
                    field9048[field9056++] = class91.method553(false, (byte) -122, var136, true, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field9048[field9056++] = class184.field2230;
                    return;
                }
                if (arg0 == 3335) {
                    field9048[field9056++] = class31.field247;
                    return;
                }
                if (arg0 == 3336) {
                    field9056 -= 4;
                    int var138 = field9048[field9056];
                    int var139 = field9048[field9056 + 1];
                    int var140 = field9048[field9056 + 2];
                    int var141 = field9048[field9056 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field9048[field9056++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field9048[field9056++] = class95.field1177;
                    return;
                }
                if (arg0 == 3338) {
                    field9048[field9056++] = class161.method884(1);
                    return;
                }
                if (arg0 == 3339) {
                    field9048[field9056++] = class289.field3754 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field9048[field9056++] = class55.field481 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field9048[field9056++] = class351.field4536 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field9048[field9056++] = class368.field4859.method167(64);
                    return;
                }
                if (arg0 == 3343) {
                    field9048[field9056++] = class368.field4859.method169(25);
                    return;
                }
                if (arg0 == 3344) {
                    field9058[field9045++] = class31.method179((byte) -68);
                    return;
                }
                if (arg0 == 3345) {
                    field9058[field9045++] = class155.method857(-1);
                    return;
                }
                if (arg0 == 3346) {
                    field9048[field9056++] = class56.method316((byte) -31);
                    return;
                }
                if (arg0 == 3347) {
                    field9048[field9056++] = class387.field5113;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field9056 -= 2;
                    int var145 = field9048[field9056];
                    int var146 = field9048[field9056 + 1];
                    class279 var147 = class565.field8298.method2218(0, var145);
                    field9058[field9045++] = var147.method1581(var146, -99);
                    return;
                }
                if (arg0 == 3408) {
                    field9056 -= 4;
                    int var148 = field9048[field9056];
                    int var149 = field9048[field9056 + 1];
                    int var150 = field9048[field9056 + 2];
                    int var151 = field9048[field9056 + 3];
                    class279 var152 = class565.field8298.method2218(0, var150);
                    if (var152.field3665 == var148 && var152.field3674 == var149) {
                        if (var149 == 115) {
                            field9058[field9045++] = var152.method1581(var151, -111);
                            return;
                        }
                        field9048[field9056++] = var152.method1587(true, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field9056 -= 3;
                    int var153 = field9048[field9056];
                    int var154 = field9048[field9056 + 1];
                    int var155 = field9048[field9056 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class279 var156 = class565.field8298.method2218(0, var154);
                    if (var156.field3674 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field9048[field9056++] = var156.method1582(7786, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field9048[--field9056];
                    String var158 = field9058[--field9045];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class279 var159 = class565.field8298.method2218(0, var157);
                    if (var159.field3674 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field9048[field9056++] = var159.method1585(var158, 1) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field9048[--field9056];
                    class279 var161 = class565.field8298.method2218(0, var160);
                    field9048[field9056++] = var161.field3662.method2639(123);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class449.field6222 == 0) {
                        field9048[field9056++] = -2;
                        return;
                    }
                    if (class449.field6222 == 1) {
                        field9048[field9056++] = -1;
                        return;
                    }
                    field9048[field9056++] = class389.field5147;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field9048[--field9056];
                    if (class449.field6222 == 2 && var162 < class389.field5147) {
                        field9058[field9045++] = class436.field5911[var162];
                        if (class283.field3716[var162] != null) {
                            field9058[field9045++] = class283.field3716[var162];
                            return;
                        }
                        field9058[field9045++] = "";
                        return;
                    }
                    field9058[field9045++] = "";
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field9048[--field9056];
                    if (class449.field6222 == 2 && var163 < class389.field5147) {
                        field9048[field9056++] = class141.field1706[var163];
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field9048[--field9056];
                    if (class449.field6222 == 2 && var164 < class389.field5147) {
                        field9048[field9056++] = class128.field1581[var164];
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field9058[--field9045];
                    int var166 = field9048[--field9056];
                    class5.method33(var165, var166, (byte) 84);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field9058[--field9045];
                    class566.method3303(var167, 38);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field9058[--field9045];
                    class598.method3459(var168, (byte) 117);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field9058[--field9045];
                    class172.method958(-28408, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field9058[--field9045];
                    class242.method1371(-2147483647, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field9058[--field9045];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field9048[field9056++] = class367.method2050(var171, (byte) -123) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field9048[--field9056];
                    if (class449.field6222 == 2 && var172 < class389.field5147) {
                        field9058[field9045++] = class195.field2370[var172];
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class204.field2444 != null) {
                        field9058[field9045++] = class252.method1429(class204.field2444, false);
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class204.field2444 != null) {
                        field9048[field9056++] = class326.field4165;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field9048[--field9056];
                    if (class204.field2444 != null && var173 < class326.field4165) {
                        field9058[field9045++] = class533.field7498[var173].field4647;
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field9048[--field9056];
                    if (class204.field2444 != null && var174 < class326.field4165) {
                        field9048[field9056++] = class533.field7498[var174].field4644;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field9048[--field9056];
                    if (class204.field2444 != null && var175 < class326.field4165) {
                        field9048[field9056++] = class533.field7498[var175].field4654;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field9048[field9056++] = class166.field2037;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field9058[--field9045];
                    class474.method2758(var176, -77);
                    return;
                }
                if (arg0 == 3618) {
                    field9048[field9056++] = class412.field5357;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field9058[--field9045];
                    class92.method558(var177, false);
                    return;
                }
                if (arg0 == 3620) {
                    class171.method956((byte) 47);
                    return;
                }
                if (arg0 == 3621) {
                    if (class449.field6222 == 0) {
                        field9048[field9056++] = -1;
                        return;
                    }
                    field9048[field9056++] = class426.field5481;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field9048[--field9056];
                    if (class449.field6222 != 0 && var178 < class426.field5481) {
                        field9058[field9045++] = class615.field8914[var178];
                        if (class586.field8506[var178] != null) {
                            field9058[field9045++] = class586.field8506[var178];
                            return;
                        }
                        field9058[field9045++] = "";
                        return;
                    }
                    field9058[field9045++] = "";
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field9058[--field9045];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field9048[field9056++] = class263.method1472((byte) 127, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field9048[--field9056];
                    if (class533.field7498 != null && var180 < class326.field4165 && class533.field7498[var180].field4651.equalsIgnoreCase(class103.field1265.field8023)) {
                        field9048[field9056++] = 1;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class414.field5378 != null) {
                        field9058[field9045++] = class414.field5378;
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field9048[--field9056];
                    if (class204.field2444 != null && var181 < class326.field4165) {
                        field9058[field9045++] = class533.field7498[var181].field4645;
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field9048[--field9056];
                    if (class449.field6222 == 2 && var182 >= 0 && var182 < class389.field5147) {
                        field9048[field9056++] = class297.field3824[var182] ? 1 : 0;
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field9058[--field9045];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field9048[field9056++] = class594.method3447(var183, -1);
                    return;
                }
                if (arg0 == 3629) {
                    field9048[field9056++] = class562.field8277;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field9058[--field9045];
                    class172.method958(-28408, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field9048[--field9056];
                    field9048[field9056++] = class461.field6368[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field9048[--field9056];
                    if (class204.field2444 != null && var186 < class326.field4165) {
                        field9058[field9045++] = class533.field7498[var186].field4651;
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field9048[--field9056];
                    if (class449.field6222 != 0 && var187 < class426.field5481) {
                        field9058[field9045++] = class442.field6105[var187];
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field9048[--field9056];
                    field9048[field9056++] = class632.field9111[var188].method2587((byte) -116);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field9048[--field9056];
                    field9048[field9056++] = class632.field9111[var189].field6086;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field9048[--field9056];
                    field9048[field9056++] = class632.field9111[var190].field6088;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field9048[--field9056];
                    field9048[field9056++] = class632.field9111[var191].field6092;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field9048[--field9056];
                    field9048[field9056++] = class632.field9111[var192].field6083;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field9048[--field9056];
                    field9048[field9056++] = class632.field9111[var193].field6090;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field9048[--field9056];
                    int var195 = class632.field9111[var194].method2588(1);
                    field9048[field9056++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field9048[--field9056];
                    int var197 = class632.field9111[var196].method2588(1);
                    field9048[field9056++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field9048[--field9056];
                    int var199 = class632.field9111[var198].method2588(1);
                    field9048[field9056++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field9048[--field9056];
                    int var201 = class632.field9111[var200].method2588(1);
                    field9048[field9056++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field9056 -= 2;
                    int var202 = field9048[field9056];
                    int var203 = field9048[field9056 + 1];
                    field9048[field9056++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field9056 -= 2;
                    int var204 = field9048[field9056];
                    int var205 = field9048[field9056 + 1];
                    field9048[field9056++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field9056 -= 2;
                    int var206 = field9048[field9056];
                    int var207 = field9048[field9056 + 1];
                    field9048[field9056++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field9056 -= 2;
                    int var208 = field9048[field9056];
                    int var209 = field9048[field9056 + 1];
                    field9048[field9056++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field9048[--field9056];
                    field9048[field9056++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field9048[--field9056];
                    field9048[field9056++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field9056 -= 5;
                    int var212 = field9048[field9056];
                    int var213 = field9048[field9056 + 1];
                    int var214 = field9048[field9056 + 2];
                    int var215 = field9048[field9056 + 3];
                    int var216 = field9048[field9056 + 4];
                    field9048[field9056++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field9056 -= 2;
                    long var217 = (long) field9048[field9056];
                    long var219 = (long) field9048[field9056 + 1];
                    field9048[field9056++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field9056 -= 2;
                    int var221 = field9048[field9056];
                    int var222 = field9048[field9056 + 1];
                    field9048[field9056++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field9056 -= 2;
                    int var223 = field9048[field9056];
                    int var224 = field9048[field9056 + 1];
                    field9048[field9056++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field9056 -= 2;
                    int var225 = field9048[field9056];
                    int var226 = field9048[field9056 + 1];
                    field9048[field9056++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field9056 -= 2;
                    int var227 = field9048[field9056];
                    int var228 = field9048[field9056 + 1];
                    field9048[field9056++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field9056 -= 2;
                    int var229 = field9048[field9056];
                    int var230 = field9048[field9056 + 1];
                    if (var229 == 0) {
                        field9048[field9056++] = 0;
                        return;
                    }
                    field9048[field9056++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field9056 -= 2;
                    int var231 = field9048[field9056];
                    int var232 = field9048[field9056 + 1];
                    if (var231 == 0) {
                        field9048[field9056++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field9048[field9056++] = Integer.MAX_VALUE;
                        return;
                    }
                    field9048[field9056++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field9056 -= 2;
                    int var233 = field9048[field9056];
                    int var234 = field9048[field9056 + 1];
                    field9048[field9056++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field9056 -= 2;
                    int var235 = field9048[field9056];
                    int var236 = field9048[field9056 + 1];
                    field9048[field9056++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field9056 -= 2;
                    int var237 = field9048[field9056];
                    int var238 = field9048[field9056 + 1];
                    field9048[field9056++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field9056 -= 2;
                    int var239 = field9048[field9056];
                    int var240 = field9048[field9056 + 1];
                    field9048[field9056++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field9056 -= 3;
                    long var241 = (long) field9048[field9056];
                    long var243 = (long) field9048[field9056 + 1];
                    long var245 = (long) field9048[field9056 + 2];
                    field9048[field9056++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field9058[--field9045];
                    int var248 = field9048[--field9056];
                    field9058[field9045++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field9045 -= 2;
                    String var249 = field9058[field9045];
                    String var250 = field9058[field9045 + 1];
                    field9058[field9045++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field9058[--field9045];
                    int var252 = field9048[--field9056];
                    field9058[field9045++] = var251 + class230.method1318(true, var252, (byte) 92);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field9058[--field9045];
                    field9058[field9045++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field9058[field9045++] = method3616(field9048[--field9056]);
                    return;
                }
                if (arg0 == 4105) {
                    field9045 -= 2;
                    String var254 = field9058[field9045];
                    String var255 = field9058[field9045 + 1];
                    if (class103.field1265.field8002 != null && class103.field1265.field8002.field6922) {
                        field9058[field9045++] = var255;
                        return;
                    }
                    field9058[field9045++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field9048[--field9056];
                    field9058[field9045++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field9045 -= 2;
                    field9048[field9056++] = class114.method680(true, field9058[field9045], field9058[field9045 + 1], class31.field247);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field9058[--field9045];
                    field9056 -= 2;
                    int var258 = field9048[field9056];
                    int var259 = field9048[field9056 + 1];
                    class216 var260 = class530.method3021(false, 0, var259, class593.field8621);
                    field9048[field9056++] = var260.method1245(var257, false, class547.field8049, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field9058[--field9045];
                    field9056 -= 2;
                    int var262 = field9048[field9056];
                    int var263 = field9048[field9056 + 1];
                    class216 var264 = class530.method3021(false, 0, var263, class593.field8621);
                    field9048[field9056++] = var264.method1238(var262, class547.field8049, 19635, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field9045 -= 2;
                    String var265 = field9058[field9045];
                    String var266 = field9058[field9045 + 1];
                    if (field9048[--field9056] == 1) {
                        field9058[field9045++] = var265;
                        return;
                    }
                    field9058[field9045++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field9058[--field9045];
                    field9058[field9045++] = class316.method1756(var267, 0);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field9058[--field9045];
                    int var269 = field9048[--field9056];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field9058[field9045++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field9048[--field9056];
                    field9048[field9056++] = class633.method3639(338, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field9048[--field9056];
                    field9048[field9056++] = class474.method2761((byte) -17, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field9048[--field9056];
                    field9048[field9056++] = class204.method1093(90, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field9048[--field9056];
                    field9048[field9056++] = class449.method2625(101, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field9058[--field9045];
                    if (var274 != null) {
                        field9048[field9056++] = var274.length();
                        return;
                    }
                    field9048[field9056++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field9058[--field9045];
                    field9056 -= 2;
                    int var276 = field9048[field9056];
                    int var277 = field9048[field9056 + 1];
                    field9058[field9045++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field9058[--field9045];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field9058[field9045++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field9058[--field9045];
                    field9056 -= 2;
                    int var284 = field9048[field9056];
                    int var285 = field9048[field9056 + 1];
                    field9048[field9056++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field9045 -= 2;
                    String var286 = field9058[field9045];
                    String var287 = field9058[field9045 + 1];
                    int var288 = field9048[--field9056];
                    field9048[field9056++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field9048[--field9056];
                    field9048[field9056++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field9048[--field9056];
                    field9048[field9056++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field9048[--field9056] != 0;
                    int var292 = field9048[--field9056];
                    field9058[field9045++] = class516.method2959((long) var292, var291, class31.field247, 44, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field9058[--field9045];
                    int var294 = field9048[--field9056];
                    class216 var295 = class530.method3021(false, 0, var294, class593.field8621);
                    field9048[field9056++] = var295.method1244(var293, class547.field8049, true);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field9048[--field9056];
                    field9058[field9045++] = class449.field6217.method2026((byte) -64, var296).field8805;
                    return;
                }
                if (arg0 == 4201) {
                    field9056 -= 2;
                    int var297 = field9048[field9056];
                    int var298 = field9048[field9056 + 1];
                    class607 var299 = class449.field6217.method2026((byte) -128, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field8758[var298 - 1] != null) {
                        field9058[field9045++] = var299.field8758[var298 - 1];
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field9056 -= 2;
                    int var300 = field9048[field9056];
                    int var301 = field9048[field9056 + 1];
                    class607 var302 = class449.field6217.method2026((byte) -120, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field8804[var301 - 1] != null) {
                        field9058[field9045++] = var302.field8804[var301 - 1];
                        return;
                    }
                    field9058[field9045++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field9048[--field9056];
                    field9048[field9056++] = class449.field6217.method2026((byte) -81, var303).field8745;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field9048[--field9056];
                    field9048[field9056++] = class449.field6217.method2026((byte) -80, var304).field8796 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field9048[--field9056];
                    class607 var306 = class449.field6217.method2026((byte) -69, var305);
                    if (var306.field8820 == -1 && var306.field8757 >= 0) {
                        field9048[field9056++] = var306.field8757;
                        return;
                    }
                    field9048[field9056++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field9048[--field9056];
                    class607 var308 = class449.field6217.method2026((byte) -87, var307);
                    if (var308.field8820 >= 0 && var308.field8757 >= 0) {
                        field9048[field9056++] = var308.field8757;
                        return;
                    }
                    field9048[field9056++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field9048[--field9056];
                    field9048[field9056++] = class449.field6217.method2026((byte) -99, var309).field8816 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field9056 -= 2;
                    int var310 = field9048[field9056];
                    int var311 = field9048[field9056 + 1];
                    class395 var312 = class290.field3771.method2793(11, var311);
                    if (var312.method2273((byte) 43)) {
                        field9058[field9045++] = class449.field6217.method2026((byte) -88, var310).method3487(var312.field5217, var311, (byte) -112);
                        return;
                    }
                    field9048[field9056++] = class449.field6217.method2026((byte) -90, var310).method3486(true, var312.field5211, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field9056 -= 2;
                    int var313 = field9048[field9056];
                    int var314 = field9048[field9056 + 1] - 1;
                    class607 var315 = class449.field6217.method2026((byte) -125, var313);
                    if (var315.field8822 == var314) {
                        field9048[field9056++] = var315.field8794;
                        return;
                    }
                    if (var315.field8771 == var314) {
                        field9048[field9056++] = var315.field8760;
                        return;
                    }
                    field9048[field9056++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field9058[--field9045];
                    int var317 = field9048[--field9056];
                    class19.method127(var317 == 1, var316, 38);
                    field9048[field9056++] = class585.field8497;
                    return;
                }
                if (arg0 == 4211) {
                    if (class160.field1941 != null && class247.field3162 < class585.field8497) {
                        field9048[field9056++] = class160.field1941[class247.field3162++] & 0xFFFF;
                        return;
                    }
                    field9048[field9056++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class247.field3162 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field9056 -= 2;
                    int var318 = field9048[field9056];
                    int var319 = field9048[field9056 + 1];
                    class395 var320 = class290.field3771.method2793(11, var319);
                    if (var320.method2273((byte) 43)) {
                        field9058[field9045++] = class518.field7296.method150(true, var318).method425(var320.field5217, 1, var319);
                        return;
                    }
                    field9048[field9056++] = class518.field7296.method150(true, var318).method430(var320.field5211, var319, false);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field9056 -= 2;
                    int var321 = field9048[field9056];
                    int var322 = field9048[field9056 + 1];
                    class395 var323 = class290.field3771.method2793(11, var322);
                    if (var323.method2273((byte) 43)) {
                        field9058[field9045++] = class16.field126.method1759(false, var321).method2535(-60, var322, var323.field5217);
                        return;
                    }
                    field9048[field9056++] = class16.field126.method1759(false, var321).method2548((byte) -30, var322, var323.field5211);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field9056 -= 2;
                    int var324 = field9048[field9056];
                    int var325 = field9048[field9056 + 1];
                    class395 var326 = class290.field3771.method2793(11, var325);
                    if (var326.method2273((byte) 43)) {
                        field9058[field9045++] = class503.field6971.method3474(102, var324).method2633(var326.field5217, -79, var325);
                        return;
                    }
                    field9048[field9056++] = class503.field6971.method3474(123, var324).method2630(20349, var325, var326.field5211);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field9048[--field9056];
                class352 var328 = class16.field125.method3605(var327, 0);
                if (var328.field4580 != null && var328.field4580.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field4551[0];
                    for (int var331 = 1; var331 < var328.field4580.length; var331++) {
                        if (var328.field4551[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field4551[var331];
                        }
                    }
                    field9048[field9056++] = var328.field4580[var329];
                    return;
                }
                field9048[field9056++] = var328.field4564;
                return;
            }
        } else {
            class509 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class61.method348(field9048[--field9056], true);
            } else {
                var47 = arg1 ? field9052 : field9055;
            }
            if (arg0 == 1300) {
                int var48 = field9048[--field9056] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2925(var48, field9058[--field9045], 0);
                    return;
                }
                field9045--;
                return;
            }
            if (arg0 == 1301) {
                field9056 -= 2;
                int var49 = field9048[field9056];
                int var50 = field9048[field9056 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field7199 = null;
                    return;
                }
                var47.field7199 = class369.method2071(var49, var50, -20190);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field9048[--field9056];
                if (class437.field5975 != var51 && class162.field1978 != var51 && class428.field5532 != var51) {
                    return;
                }
                var47.field7076 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field7164 = field9048[--field9056];
                return;
            }
            if (arg0 == 1304) {
                var47.field7174 = field9048[--field9056];
                return;
            }
            if (arg0 == 1305) {
                var47.field7184 = field9058[--field9045];
                return;
            }
            if (arg0 == 1306) {
                var47.field7112 = field9058[--field9045];
                return;
            }
            if (arg0 == 1307) {
                var47.field7132 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field7124 = field9048[--field9056];
                var47.field7157 = field9048[--field9056];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field9048[--field9056];
                int var53 = field9048[--field9056];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2928(0, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field7167 = field9058[--field9045];
                return;
            }
            if (arg0 == 1311) {
                var47.field7136 = field9048[--field9056];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field9056 -= 3;
                    var54 = field9048[field9056] - 1;
                    var55 = field9048[field9056 + 1];
                    var56 = field9048[field9056 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9056 -= 2;
                    var54 = 10;
                    var55 = field9048[field9056];
                    var56 = field9048[field9056 + 1];
                }
                if (var47.field7152 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field7152 = new byte[11];
                    var47.field7165 = new byte[11];
                    var47.field7057 = new int[11];
                }
                var47.field7152[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field7183 = false;
                    for (int var57 = 0; var57 < var47.field7152.length; var57++) {
                        if (var47.field7152[var57] != 0) {
                            var47.field7183 = true;
                            break;
                        }
                    }
                } else {
                    var47.field7183 = true;
                }
                var47.field7165[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field7131 = field9048[--field9056];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    private static final void method3612(int arg0) {
        class509 var1 = class61.method348(arg0, true);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class509[] var3 = class543.field7960[var2];
        if (var3 == null) {
            class509[] var4 = class459.field6326[var2];
            int var5 = var4.length;
            var3 = class543.field7960[var2] = new class509[var5];
            class345.method1929(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class345.method1929(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IZ)V")
    public static final void method3613(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3614(String arg0, int arg1) {
        if (class633.field9120 == 0 && !(!class140.field1703 || class161.field1948) || class582.field8467) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class180.field2163.method987(0, 22))) {
            var3 = 0;
            arg0 = arg0.substring(class180.field2163.method987(0, 22).length());
        } else if (var2.startsWith(class404.field5308.method987(0, 22))) {
            var3 = 1;
            arg0 = arg0.substring(class404.field5308.method987(0, 22).length());
        } else if (var2.startsWith(class607.field8824.method987(0, 22))) {
            var3 = 2;
            arg0 = arg0.substring(class607.field8824.method987(0, 22).length());
        } else if (var2.startsWith(class194.field2350.method987(0, 22))) {
            var3 = 3;
            arg0 = arg0.substring(class194.field2350.method987(0, 22).length());
        } else if (var2.startsWith(class320.field4074.method987(0, 22))) {
            var3 = 4;
            arg0 = arg0.substring(class320.field4074.method987(0, 22).length());
        } else if (var2.startsWith(class373.field4896.method987(0, 22))) {
            var3 = 5;
            arg0 = arg0.substring(class373.field4896.method987(0, 22).length());
        } else if (var2.startsWith(class151.field1806.method987(0, 22))) {
            var3 = 6;
            arg0 = arg0.substring(class151.field1806.method987(0, 22).length());
        } else if (var2.startsWith(class356.field4675.method987(0, 22))) {
            var3 = 7;
            arg0 = arg0.substring(class356.field4675.method987(0, 22).length());
        } else if (var2.startsWith(class383.field5069.method987(0, 22))) {
            var3 = 8;
            arg0 = arg0.substring(class383.field5069.method987(0, 22).length());
        } else if (var2.startsWith(class274.field3563.method987(0, 22))) {
            var3 = 9;
            arg0 = arg0.substring(class274.field3563.method987(0, 22).length());
        } else if (var2.startsWith(class435.field5905.method987(0, 22))) {
            var3 = 10;
            arg0 = arg0.substring(class435.field5905.method987(0, 22).length());
        } else if (var2.startsWith(class316.field4046.method987(0, 22))) {
            var3 = 11;
            arg0 = arg0.substring(class316.field4046.method987(0, 22).length());
        } else if (class31.field247 != 0) {
            if (var2.startsWith(class180.field2163.method987(class31.field247, 22))) {
                var3 = 0;
                arg0 = arg0.substring(class180.field2163.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class404.field5308.method987(class31.field247, 22))) {
                var3 = 1;
                arg0 = arg0.substring(class404.field5308.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class607.field8824.method987(class31.field247, 22))) {
                var3 = 2;
                arg0 = arg0.substring(class607.field8824.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class194.field2350.method987(class31.field247, 22))) {
                var3 = 3;
                arg0 = arg0.substring(class194.field2350.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class320.field4074.method987(class31.field247, 22))) {
                var3 = 4;
                arg0 = arg0.substring(class320.field4074.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class373.field4896.method987(class31.field247, 22))) {
                var3 = 5;
                arg0 = arg0.substring(class373.field4896.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class151.field1806.method987(class31.field247, 22))) {
                var3 = 6;
                arg0 = arg0.substring(class151.field1806.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class356.field4675.method987(class31.field247, 22))) {
                var3 = 7;
                arg0 = arg0.substring(class356.field4675.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class383.field5069.method987(class31.field247, 22))) {
                var3 = 8;
                arg0 = arg0.substring(class383.field5069.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class274.field3563.method987(class31.field247, 22))) {
                var3 = 9;
                arg0 = arg0.substring(class274.field3563.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class435.field5905.method987(class31.field247, 22))) {
                var3 = 10;
                arg0 = arg0.substring(class435.field5905.method987(class31.field247, 22).length());
            } else if (var2.startsWith(class316.field4046.method987(class31.field247, 22))) {
                var3 = 11;
                arg0 = arg0.substring(class316.field4046.method987(class31.field247, 22).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class468.field6539.method987(0, 22))) {
            var5 = 1;
            arg0 = arg0.substring(class468.field6539.method987(0, 22).length());
        } else if (var4.startsWith(class314.field4005.method987(0, 22))) {
            var5 = 2;
            arg0 = arg0.substring(class314.field4005.method987(0, 22).length());
        } else if (var4.startsWith(class271.field3523.method987(0, 22))) {
            var5 = 3;
            arg0 = arg0.substring(class271.field3523.method987(0, 22).length());
        } else if (var4.startsWith(class83.field1019.method987(0, 22))) {
            var5 = 4;
            arg0 = arg0.substring(class83.field1019.method987(0, 22).length());
        } else if (var4.startsWith(class381.field5049.method987(0, 22))) {
            var5 = 5;
            arg0 = arg0.substring(class381.field5049.method987(0, 22).length());
        } else if (class31.field247 != 0) {
            if (var4.startsWith(class468.field6539.method987(class31.field247, 22))) {
                var5 = 1;
                arg0 = arg0.substring(class468.field6539.method987(class31.field247, 22).length());
            } else if (var4.startsWith(class314.field4005.method987(class31.field247, 22))) {
                var5 = 2;
                arg0 = arg0.substring(class314.field4005.method987(class31.field247, 22).length());
            } else if (var4.startsWith(class271.field3523.method987(class31.field247, 22))) {
                var5 = 3;
                arg0 = arg0.substring(class271.field3523.method987(class31.field247, 22).length());
            } else if (var4.startsWith(class83.field1019.method987(class31.field247, 22))) {
                var5 = 4;
                arg0 = arg0.substring(class83.field1019.method987(class31.field247, 22).length());
            } else if (var4.startsWith(class381.field5049.method987(class31.field247, 22))) {
                var5 = 5;
                arg0 = arg0.substring(class381.field5049.method987(class31.field247, 22).length());
            }
        }
        field9035++;
        class418.method2378(17984, class539.field7892);
        class136.field1663.method2093(0, -113);
        int var6 = class136.field1663.field4966;
        if (arg1 == 5021) {
            class136.field1663.method2093(1, -120);
        } else {
            class136.field1663.method2093(0, -121);
        }
        class136.field1663.method2093(var3, -115);
        class136.field1663.method2093(var5, -108);
        class168.method945(-1, arg0, class136.field1663);
        class136.field1663.method2083((byte) 95, class136.field1663.field4966 - var6);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    private static final void method3615(int arg0) {
        class509 var1 = class61.method348(arg0, true);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class509[] var3 = class543.field7960[var2];
        if (var3 == null) {
            class509[] var4 = class459.field6326[var2];
            int var5 = var4.length;
            var3 = class543.field7960[var2] = new class509[var5];
            class345.method1929(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class345.method1929(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method3616(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field9047.setTime(new Date(var1));
        int var3 = field9047.get(5);
        int var4 = field9047.get(2);
        int var5 = field9047.get(1);
        return var3 + "-" + field9061[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljr;II)V")
    public static final void method3617(class92 arg0, int arg1, int arg2) {
        class126 var3 = class116.method685(arg0, arg1, (byte) 127, arg2);
        if (var3 == null) {
            return;
        }
        field9037 = new int[var3.field1545];
        field9038 = new String[var3.field1543];
        if (class612.field8882 == var3.field1546 || class117.field1475 == var3.field1546 || class157.field1914 == var3.field1546) {
            int var4 = 0;
            int var5 = 0;
            if (class552.field8122 != null) {
                var4 = class552.field8122.field7139;
                var5 = class552.field8122.field7110;
            }
            field9037[0] = class368.field4859.method167(64) - var4;
            field9037[1] = class368.field4859.method169(-87) - var5;
        }
        method3618(var3, 200000);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lpj;I)V")
    private static final void method3618(class126 arg0, int arg1) {
        field9056 = 0;
        field9045 = 0;
        int var2 = -1;
        int[] var3 = arg0.field1539;
        int[] var4 = arg0.field1547;
        byte var5 = -1;
        field9057 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method3611(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3619(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field9048[field9056++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field9048[field9056++] = class281.field3700.field3783[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class281.field3700.method1634(field9048[--field9056], 112, var8);
                } else if (var43 == 3) {
                    field9058[field9045++] = arg0.field1551[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field9056 -= 2;
                    if (field9048[field9056 + 1] != field9048[field9056]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field9056 -= 2;
                    if (field9048[field9056 + 1] == field9048[field9056]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field9056 -= 2;
                    if (field9048[field9056] < field9048[field9056 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field9056 -= 2;
                    if (field9048[field9056] > field9048[field9056 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field9057 == 0) {
                        return;
                    }
                    class108 var9 = field9042[--field9057];
                    arg0 = var9.field1350;
                    var3 = arg0.field1539;
                    var4 = arg0.field1547;
                    var2 = var9.field1347;
                    field9037 = var9.field1345;
                    field9038 = var9.field1349;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field9048[field9056++] = class281.field3700.method1630(var10, 120);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class281.field3700.method1638((byte) 46, var11, field9048[--field9056]);
                } else if (var43 == 31) {
                    field9056 -= 2;
                    if (field9048[field9056] <= field9048[field9056 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field9056 -= 2;
                    if (field9048[field9056] >= field9048[field9056 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field9048[field9056++] = field9037[var4[var2]];
                } else if (var43 == 34) {
                    field9037[var4[var2]] = field9048[--field9056];
                } else if (var43 == 35) {
                    field9058[field9045++] = field9038[var4[var2]];
                } else if (var43 == 36) {
                    field9038[var4[var2]] = field9058[--field9045];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field9045 -= var12;
                    String var13 = class82.method486(var12, field9045, -2, field9058);
                    field9058[field9045++] = var13;
                } else if (var43 == 38) {
                    field9056--;
                } else if (var43 == 39) {
                    field9045--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class126 var15 = class125.method714(var14, (byte) 123);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field1545];
                    String[] var17 = new String[var15.field1543];
                    for (int var18 = 0; var18 < var15.field1540; var18++) {
                        var16[var18] = field9048[field9056 + var18 - var15.field1540];
                    }
                    for (int var19 = 0; var19 < var15.field1542; var19++) {
                        var17[var19] = field9058[field9045 + var19 - var15.field1542];
                    }
                    field9056 -= var15.field1540;
                    field9045 -= var15.field1542;
                    class108 var20 = new class108();
                    var20.field1350 = arg0;
                    var20.field1347 = var2;
                    var20.field1345 = field9037;
                    var20.field1349 = field9038;
                    if (field9057 >= field9042.length) {
                        throw new RuntimeException();
                    }
                    field9042[field9057++] = var20;
                    arg0 = var15;
                    var3 = var15.field1539;
                    var4 = var15.field1547;
                    var2 = -1;
                    field9037 = var16;
                    field9038 = var17;
                } else if (var43 == 42) {
                    field9048[field9056++] = class386.field5085[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class386.field5085[var21] = field9048[--field9056];
                    class37.method203(var21, (byte) -92);
                    class352.field4542 |= class118.field1486[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field9048[--field9056];
                    if (var24 >= 0 && var24 <= 5000) {
                        field9041[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field9053[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field9048[--field9056];
                    if (var28 < 0 || var28 >= field9041[var27]) {
                        throw new RuntimeException();
                    }
                    field9048[field9056++] = field9053[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field9056 -= 2;
                    int var30 = field9048[field9056];
                    if (var30 < 0 || var30 >= field9041[var29]) {
                        throw new RuntimeException();
                    }
                    field9053[var29][var30] = field9048[field9056 + 1];
                } else if (var43 == 47) {
                    String var31 = class267.field3471[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field9058[field9045++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class267.field3471[var32] = field9058[--field9045];
                    class571.method3324(var32, 2);
                } else if (var43 == 51) {
                    class451 var33 = arg0.field1541[var4[var2]];
                    class171 var34 = (class171) var33.method2645((long) field9048[--field9056], (byte) -80);
                    if (var34 != null) {
                        var2 += var34.field2081;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field1544 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7967).append(" ");
                for (int var41 = field9057 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field9042[var41].field1350.field7967).append(" ");
                }
                var40.append("op: ").append(var5);
                class443.method2597(var42, var40.toString(), (byte) 125);
            } else {
                class435.method2514("Clientscript error in: " + arg0.field1544, true);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field1544).append("\n");
                for (int var38 = field9057 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field9042[var38].field1350.field1544).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class443.method2597(var42, var37.toString(), (byte) 95);
                class543.method3175(var37.toString(), true);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IZ)V")
    private static final void method3619(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9048[field9056++] = class151.field1809;
                return;
            }
            if (arg0 == 5001) {
                field9056 -= 3;
                class151.field1809 = field9048[field9056];
                class85.field1038 = class207.method1198(-128, field9048[field9056 + 1]);
                if (class85.field1038 == null) {
                    class85.field1038 = class497.field6904;
                }
                class82.field981 = field9048[field9056 + 2];
                field9043++;
                class418.method2378(17984, class513.field7247);
                class136.field1663.method2093(class151.field1809, -108);
                class136.field1663.method2093(class85.field1038.field78, -114);
                class136.field1663.method2093(class82.field981, -120);
                return;
            }
            if (arg0 == 5002) {
                field9045 -= 2;
                String var2 = field9058[field9045];
                String var3 = field9058[field9045 + 1];
                field9056 -= 2;
                int var4 = field9048[field9056];
                int var5 = field9048[field9056 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field9044++;
                class418.method2378(17984, class2.field5);
                class136.field1663.method2093(class88.method528((byte) -30, var2) + class88.method528((byte) -33, var3) + 2, -114);
                class136.field1663.method2106(-78, var2);
                class136.field1663.method2093(var4 - 1, -111);
                class136.field1663.method2093(var5, -114);
                class136.field1663.method2106(-59, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field9048[--field9056];
                class115 var7 = class340.method1904(var6, false);
                String var8 = "";
                if (var7 != null && var7.field1450 != null) {
                    var8 = var7.field1450;
                }
                field9058[field9045++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field9048[--field9056];
                class115 var10 = class340.method1904(var9, false);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field1449;
                }
                field9048[field9056++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class85.field1038 == null) {
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = class85.field1038.field78;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var12 = field9058[--field9045];
                method3614(var12, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9045 -= 2;
                String var13 = field9058[field9045];
                String var14 = field9058[field9045 + 1];
                if (class633.field9120 != 0 || (!class140.field1703 || class161.field1948) && !class582.field8467) {
                    field9051++;
                    class418.method2378(17984, class5.field34);
                    class136.field1663.method2093(0, -120);
                    int var15 = class136.field1663.field4966;
                    class136.field1663.method2106(-103, var13);
                    class168.method945(-1, var14, class136.field1663);
                    class136.field1663.method2083((byte) 80, class136.field1663.field4966 - var15);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var16 = field9048[--field9056];
                class115 var17 = class340.method1904(var16, false);
                String var18 = "";
                if (var17 != null && var17.field1436 != null) {
                    var18 = var17.field1436;
                }
                field9058[field9045++] = var18;
                return;
            }
            if (arg0 == 5011) {
                int var19 = field9048[--field9056];
                class115 var20 = class340.method1904(var19, false);
                String var21 = "";
                if (var20 != null && var20.field1451 != null) {
                    var21 = var20.field1451;
                }
                field9058[field9045++] = var21;
                return;
            }
            if (arg0 == 5012) {
                int var22 = field9048[--field9056];
                class115 var23 = class340.method1904(var22, false);
                int var24 = -1;
                if (var23 != null) {
                    var24 = var23.field1433;
                }
                field9048[field9056++] = var24;
                return;
            }
            if (arg0 == 5015) {
                String var25;
                if (class103.field1265 == null || class103.field1265.field8016 == null) {
                    var25 = class249.field3184;
                } else {
                    var25 = class103.field1265.method3193(true, 93);
                }
                field9058[field9045++] = var25;
                return;
            }
            if (arg0 == 5016) {
                field9048[field9056++] = class82.field981;
                return;
            }
            if (arg0 == 5017) {
                field9048[field9056++] = class267.method1494((byte) -78);
                return;
            }
            if (arg0 == 5018) {
                int var26 = field9048[--field9056];
                class115 var27 = class340.method1904(var26, false);
                int var28 = 0;
                if (var27 != null) {
                    var28 = var27.field1440;
                }
                field9048[field9056++] = var28;
                return;
            }
            if (arg0 == 5019) {
                int var29 = field9048[--field9056];
                class115 var30 = class340.method1904(var29, false);
                String var31 = "";
                if (var30 != null && var30.field1435 != null) {
                    var31 = var30.field1435;
                }
                field9058[field9045++] = var31;
                return;
            }
            if (arg0 == 5020) {
                String var32;
                if (class103.field1265 == null || class103.field1265.field8016 == null) {
                    var32 = class249.field3184;
                } else {
                    var32 = class103.field1265.method3194(false, (byte) 122);
                }
                field9058[field9045++] = var32;
                return;
            }
            if (arg0 == 5023) {
                int var33 = field9048[--field9056];
                class115 var34 = class340.method1904(var33, false);
                int var35 = -1;
                if (var34 != null) {
                    var35 = var34.field1439;
                }
                field9048[field9056++] = var35;
                return;
            }
            if (arg0 == 5024) {
                int var36 = field9048[--field9056];
                class115 var37 = class340.method1904(var36, false);
                int var38 = -1;
                if (var37 != null) {
                    var38 = var37.field1452;
                }
                field9048[field9056++] = var38;
                return;
            }
            if (arg0 == 5050) {
                int var39 = field9048[--field9056];
                field9058[field9045++] = class369.field4864.method3555(var39, -16831).field386;
                return;
            }
            if (arg0 == 5051) {
                int var40 = field9048[--field9056];
                class45 var41 = class369.field4864.method3555(var40, -16831);
                if (var41.field380 == null) {
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = var41.field380.length;
                return;
            }
            if (arg0 == 5052) {
                field9056 -= 2;
                int var42 = field9048[field9056];
                int var43 = field9048[field9056 + 1];
                class45 var44 = class369.field4864.method3555(var42, -16831);
                int var45 = var44.field380[var43];
                field9048[field9056++] = var45;
                return;
            }
            if (arg0 == 5053) {
                int var46 = field9048[--field9056];
                class45 var47 = class369.field4864.method3555(var46, -16831);
                if (var47.field381 == null) {
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = var47.field381.length;
                return;
            }
            if (arg0 == 5054) {
                field9056 -= 2;
                int var48 = field9048[field9056];
                int var49 = field9048[field9056 + 1];
                field9048[field9056++] = class369.field4864.method3555(var48, -16831).field381[var49];
                return;
            }
            if (arg0 == 5055) {
                int var50 = field9048[--field9056];
                field9058[field9045++] = class191.field2300.method1427(var50, 24845).method364(99);
                return;
            }
            if (arg0 == 5056) {
                int var51 = field9048[--field9056];
                class62 var52 = class191.field2300.method1427(var51, 24845);
                if (var52.field598 == null) {
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = var52.field598.length;
                return;
            }
            if (arg0 == 5057) {
                field9056 -= 2;
                int var53 = field9048[field9056];
                int var54 = field9048[field9056 + 1];
                field9048[field9056++] = class191.field2300.method1427(var53, 24845).field598[var54];
                return;
            }
            if (arg0 == 5058) {
                field9054 = new class402();
                field9054.field5284 = field9048[--field9056];
                field9054.field5283 = class191.field2300.method1427(field9054.field5284, 24845);
                field9054.field5282 = new int[field9054.field5283.method358(95)];
                return;
            }
            if (arg0 == 5059) {
                field9046++;
                class418.method2378(17984, class185.field2236);
                class136.field1663.method2093(0, -123);
                int var55 = class136.field1663.field4966;
                class136.field1663.method2093(0, -110);
                class136.field1663.method2115(field9054.field5284, 3324);
                field9054.field5283.method354(class136.field1663, field9054.field5282, 0);
                class136.field1663.method2083((byte) -106, class136.field1663.field4966 - var55);
                return;
            }
            if (arg0 == 5060) {
                String var56 = field9058[--field9045];
                field9049++;
                class418.method2378(17984, class224.field2754);
                class136.field1663.method2093(0, -118);
                int var57 = class136.field1663.field4966;
                class136.field1663.method2106(-71, var56);
                class136.field1663.method2115(field9054.field5284, 3324);
                field9054.field5283.method354(class136.field1663, field9054.field5282, 0);
                class136.field1663.method2083((byte) 81, class136.field1663.field4966 - var57);
                return;
            }
            if (arg0 == 5061) {
                field9046++;
                class418.method2378(17984, class185.field2236);
                class136.field1663.method2093(0, -107);
                int var58 = class136.field1663.field4966;
                class136.field1663.method2093(1, -128);
                class136.field1663.method2115(field9054.field5284, 3324);
                field9054.field5283.method354(class136.field1663, field9054.field5282, 0);
                class136.field1663.method2083((byte) -98, class136.field1663.field4966 - var58);
                return;
            }
            if (arg0 == 5062) {
                field9056 -= 2;
                int var59 = field9048[field9056];
                int var60 = field9048[field9056 + 1];
                field9048[field9056++] = class369.field4864.method3555(var59, -16831).field379[var60];
                return;
            }
            if (arg0 == 5063) {
                field9056 -= 2;
                int var61 = field9048[field9056];
                int var62 = field9048[field9056 + 1];
                field9048[field9056++] = class369.field4864.method3555(var61, -16831).field387[var62];
                return;
            }
            if (arg0 == 5064) {
                field9056 -= 2;
                int var63 = field9048[field9056];
                int var64 = field9048[field9056 + 1];
                if (var64 == -1) {
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = class369.field4864.method3555(var63, -16831).method236(-127, (char) var64);
                return;
            }
            if (arg0 == 5065) {
                field9056 -= 2;
                int var65 = field9048[field9056];
                int var66 = field9048[field9056 + 1];
                if (var66 == -1) {
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = class369.field4864.method3555(var65, -16831).method240((char) var66, (byte) 123);
                return;
            }
            if (arg0 == 5066) {
                int var67 = field9048[--field9056];
                field9048[field9056++] = class191.field2300.method1427(var67, 24845).method358(115);
                return;
            }
            if (arg0 == 5067) {
                field9056 -= 2;
                int var68 = field9048[field9056];
                int var69 = field9048[field9056 + 1];
                int var70 = class191.field2300.method1427(var68, 24845).method352(-31, var69).field3623;
                field9048[field9056++] = var70;
                return;
            }
            if (arg0 == 5068) {
                field9056 -= 2;
                int var71 = field9048[field9056];
                int var72 = field9048[field9056 + 1];
                field9054.field5282[var71] = var72;
                return;
            }
            if (arg0 == 5069) {
                field9056 -= 2;
                int var73 = field9048[field9056];
                int var74 = field9048[field9056 + 1];
                field9054.field5282[var73] = var74;
                return;
            }
            if (arg0 == 5070) {
                field9056 -= 3;
                int var75 = field9048[field9056];
                int var76 = field9048[field9056 + 1];
                int var77 = field9048[field9056 + 2];
                class62 var78 = class191.field2300.method1427(var75, 24845);
                if (var78.method352(120, var76).field3623 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9048[field9056++] = var78.method356(260514, var76, var77);
                return;
            }
            if (arg0 == 5071) {
                String var79 = field9058[--field9045];
                boolean var80 = field9048[--field9056] == 1;
                class458.method2670(var80, false, var79);
                field9048[field9056++] = class585.field8497;
                return;
            }
            if (arg0 == 5072) {
                if (class160.field1941 != null && class247.field3162 < class585.field8497) {
                    field9048[field9056++] = class160.field1941[class247.field3162++] & 0xFFFF;
                    return;
                }
                field9048[field9056++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class247.field3162 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class443.field6109.method185(53, 86)) {
                    field9048[field9056++] = 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class443.field6109.method185(53, 82)) {
                    field9048[field9056++] = 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class443.field6109.method185(53, 81)) {
                    field9048[field9056++] = 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class79.method458(field9048[--field9056], (byte) -127);
                return;
            }
            if (arg0 == 5201) {
                field9048[field9056++] = class177.method983(false);
                return;
            }
            if (arg0 == 5205) {
                class318.method1762(false, 0, field9048[--field9056], -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var81 = field9048[--field9056];
                class98 var82 = class353.method1965(var81 >> 14 & 0x3FFF, var81 & 0x3FFF);
                if (var82 == null) {
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = var82.field1219;
                return;
            }
            if (arg0 == 5207) {
                class98 var83 = class353.method1976(field9048[--field9056]);
                if (var83 != null && var83.field1218 != null) {
                    field9058[field9045++] = var83.field1218;
                    return;
                }
                field9058[field9045++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9048[field9056++] = class259.field3349;
                field9048[field9056++] = class206.field2482;
                return;
            }
            if (arg0 == 5209) {
                field9048[field9056++] = class619.field8945 + class353.field4621;
                field9048[field9056++] = class353.field4607 + class34.field273;
                return;
            }
            if (arg0 == 5210) {
                int var84 = field9048[--field9056];
                class98 var85 = class353.method1976(var84);
                if (var85 == null) {
                    field9048[field9056++] = 0;
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = var85.field1198 >> 14 & 0x3FFF;
                field9048[field9056++] = var85.field1198 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var86 = field9048[--field9056];
                class98 var87 = class353.method1976(var86);
                if (var87 == null) {
                    field9048[field9056++] = 0;
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = var87.field1201 - var87.field1200;
                field9048[field9056++] = var87.field1203 - var87.field1205;
                return;
            }
            if (arg0 == 5212) {
                class258 var88 = class156.method858(-27314);
                if (var88 == null) {
                    field9048[field9056++] = -1;
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = var88.field3313;
                int var89 = var88.field3315 << 28 | class353.field4621 + var88.field3320 << 14 | class353.field4607 + var88.field3317;
                field9048[field9056++] = var89;
                return;
            }
            if (arg0 == 5213) {
                class258 var90 = class129.method733(3);
                if (var90 == null) {
                    field9048[field9056++] = -1;
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = var90.field3313;
                int var91 = var90.field3315 << 28 | class353.field4621 + var90.field3320 << 14 | class353.field4607 + var90.field3317;
                field9048[field9056++] = var91;
                return;
            }
            if (arg0 == 5214) {
                int var92 = field9048[--field9056];
                class98 var93 = class95.method593((byte) 34);
                if (var93 != null) {
                    boolean var94 = var93.method603(true, field9060, var92 >> 14 & 0x3FFF, var92 & 0x3FFF, var92 >> 28 & 0x3);
                    if (var94) {
                        class450.method2631(field9060[1], field9060[2], true);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9056 -= 2;
                int var95 = field9048[field9056];
                int var96 = field9048[field9056 + 1];
                class369 var97 = class353.method1964(var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                boolean var98 = false;
                for (class98 var99 = (class98) var97.method2066((byte) -82); var99 != null; var99 = (class98) var97.method2068(true)) {
                    if (var99.field1219 == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var98) {
                    field9048[field9056++] = 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var100 = field9048[--field9056];
                class98 var101 = class353.method1976(var100);
                if (var101 == null) {
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = var101.field1210;
                return;
            }
            if (arg0 == 5220) {
                field9048[field9056++] = class138.field1682 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var102 = field9048[--field9056];
                class450.method2631(var102 >> 14 & 0x3FFF, var102 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5222) {
                class98 var103 = class95.method593((byte) 34);
                if (var103 != null) {
                    boolean var104 = var103.method599(field9060, 6378, class619.field8945 + class353.field4621, class353.field4607 + class34.field273);
                    if (var104) {
                        field9048[field9056++] = field9060[1];
                        field9048[field9056++] = field9060[2];
                        return;
                    }
                    field9048[field9056++] = -1;
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = -1;
                field9048[field9056++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9056 -= 2;
                int var105 = field9048[field9056];
                int var106 = field9048[field9056 + 1];
                class318.method1762(false, 0, var105, var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var107 = field9048[--field9056];
                class98 var108 = class95.method593((byte) 34);
                if (var108 != null) {
                    boolean var109 = var108.method603(true, field9060, var107 >> 14 & 0x3FFF, var107 & 0x3FFF, var107 >> 28 & 0x3);
                    if (var109) {
                        field9048[field9056++] = field9060[1];
                        field9048[field9056++] = field9060[2];
                        return;
                    }
                    field9048[field9056++] = -1;
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = -1;
                field9048[field9056++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var110 = field9048[--field9056];
                class98 var111 = class95.method593((byte) 34);
                if (var111 != null) {
                    boolean var112 = var111.method599(field9060, 6378, var110 >> 14 & 0x3FFF, var110 & 0x3FFF);
                    if (var112) {
                        field9048[field9056++] = field9060[1];
                        field9048[field9056++] = field9060[2];
                        return;
                    }
                    field9048[field9056++] = -1;
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = -1;
                field9048[field9056++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class237.method1347(field9048[--field9056], (byte) 78);
                return;
            }
            if (arg0 == 5227) {
                field9056 -= 2;
                int var113 = field9048[field9056];
                int var114 = field9048[field9056 + 1];
                class318.method1762(true, 0, var113, var114 >> 14 & 0x3FFF, var114 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class213.field2595 = field9048[--field9056] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9048[field9056++] = class213.field2595 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var115 = field9048[--field9056];
                class329.method1854((byte) -96, var115);
                return;
            }
            if (arg0 == 5231) {
                field9056 -= 2;
                int var116 = field9048[field9056];
                boolean var117 = field9048[field9056 + 1] == 1;
                if (class69.field660 != null) {
                    class544 var118 = class69.field660.method2645((long) var116, (byte) -104);
                    if (var118 != null && !var117) {
                        var118.method3187(true);
                        return;
                    }
                    if (var118 == null && var117) {
                        class544 var119 = new class544();
                        class69.field660.method2640(1, (long) var116, var119);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var120 = field9048[--field9056];
                if (class69.field660 != null) {
                    class544 var121 = class69.field660.method2645((long) var120, (byte) -99);
                    field9048[field9056++] = var121 == null ? 0 : 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9056 -= 2;
                int var122 = field9048[field9056];
                boolean var123 = field9048[field9056 + 1] == 1;
                if (class528.field7394 != null) {
                    class544 var124 = class528.field7394.method2645((long) var122, (byte) -81);
                    if (var124 != null && !var123) {
                        var124.method3187(true);
                        return;
                    }
                    if (var124 == null && var123) {
                        class544 var125 = new class544();
                        class528.field7394.method2640(1, (long) var122, var125);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var126 = field9048[--field9056];
                if (class528.field7394 != null) {
                    class544 var127 = class528.field7394.method2645((long) var126, (byte) -99);
                    field9048[field9056++] = var127 == null ? 0 : 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9048[field9056++] = class353.field4591 == null ? -1 : class353.field4591.field1219;
                return;
            }
            if (arg0 == 5236) {
                field9056 -= 2;
                int var128 = field9048[field9056];
                int var129 = field9048[field9056 + 1];
                int var130 = var129 >> 14 & 0x3FFF;
                int var131 = var129 & 0x3FFF;
                int var132 = class415.method2368(var131, var128, false, var130);
                if (var132 < 0) {
                    field9048[field9056++] = -1;
                    return;
                }
                field9048[field9056++] = var132;
                return;
            }
            if (arg0 == 5237) {
                class428.method2438(true);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9056 -= 2;
                int var133 = field9048[field9056];
                int var134 = field9048[field9056 + 1];
                class196.method1066(3, (byte) 83, var134, var133, false);
                field9048[field9056++] = class110.field1367 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class110.field1367 != null) {
                    class196.method1066(class565.field8299.field2168, (byte) 83, -1, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class536[] var135 = class355.method1998((byte) 35);
                field9048[field9056++] = var135.length;
                return;
            }
            if (arg0 == 5303) {
                int var136 = field9048[--field9056];
                class536[] var137 = class355.method1998((byte) 13);
                field9048[field9056++] = var137[var136].field7519;
                field9048[field9056++] = var137[var136].field7514;
                return;
            }
            if (arg0 == 5305) {
                int var138 = class565.field8299.field2174;
                int var139 = class565.field8299.field2179;
                int var140 = -1;
                class536[] var141 = class355.method1998((byte) 54);
                for (int var142 = 0; var142 < var141.length; var142++) {
                    class536 var143 = var141[var142];
                    if (var143.field7519 == var138 && var143.field7514 == var139) {
                        var140 = var142;
                        break;
                    }
                }
                field9048[field9056++] = var140;
                return;
            }
            if (arg0 == 5306) {
                field9048[field9056++] = class99.method608(false);
                return;
            }
            if (arg0 == 5307) {
                int var144 = field9048[--field9056];
                if (var144 >= 1 && var144 <= 2) {
                    class196.method1066(var144, (byte) 83, -1, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9048[field9056++] = class565.field8299.field2168;
                return;
            }
            if (arg0 == 5309) {
                int var145 = field9048[--field9056];
                if (var145 >= 1 && var145 <= 2) {
                    class565.field8299.field2168 = var145;
                    class565.field8299.method3585(true, class74.field873);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9045 -= 2;
                String var146 = field9058[field9045];
                String var147 = field9058[field9045 + 1];
                int var148 = field9048[--field9056];
                field9034++;
                class418.method2378(17984, class484.field6762);
                class136.field1663.method2093(class88.method528((byte) -27, var146) + class88.method528((byte) -95, var147) + 1, -108);
                class136.field1663.method2106(-115, var146);
                class136.field1663.method2106(-86, var147);
                class136.field1663.method2093(var148, -123);
                return;
            }
            if (arg0 == 5401) {
                field9056 -= 2;
                class450.field6230[field9048[field9056]] = (short) class101.method609(-407448383, field9048[field9056 + 1]);
                class449.field6217.method2029(-29444);
                class449.field6217.method2024((byte) -120);
                class518.field7296.method151(-21071);
                class562.method3279((byte) -117);
                return;
            }
            if (arg0 == 5405) {
                field9056 -= 2;
                int var149 = field9048[field9056];
                int var150 = field9048[field9056 + 1];
                if (var149 >= 0 && var149 < 2) {
                    class277.field3652[var149] = new int[var150 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9056 -= 7;
                int var151 = field9048[field9056];
                int var152 = field9048[field9056 + 1] << 1;
                int var153 = field9048[field9056 + 2];
                int var154 = field9048[field9056 + 3];
                int var155 = field9048[field9056 + 4];
                int var156 = field9048[field9056 + 5];
                int var157 = field9048[field9056 + 6];
                if (var151 >= 0 && var151 < 2 && class277.field3652[var151] != null && var152 >= 0 && var152 < class277.field3652[var151].length) {
                    class277.field3652[var151][var152] = new int[] { (var153 >> 14 & 0x3FFF) << 7, var154, (var153 & 0x3FFF) << 7, var157 };
                    class277.field3652[var151][var152 + 1] = new int[] { (var155 >> 14 & 0x3FFF) << 7, var156, (var155 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var158 = class277.field3652[field9048[--field9056]].length >> 1;
                field9048[field9056++] = var158;
                return;
            }
            if (arg0 == 5411) {
                if (class110.field1367 != null) {
                    class196.method1066(class565.field8299.field2168, (byte) 83, -1, -1, false);
                }
                if (class431.field5843 != null) {
                    class474.method2759((byte) -120);
                    System.exit(0);
                    return;
                }
                String var159 = class355.field4650 == null ? class335.method1888(-81) : class355.field4650;
                class224.method1285((byte) -86, class529.field7429 == 1, class74.field873, var159, false);
                return;
            }
            if (arg0 == 5419) {
                String var160 = "";
                if (class625.field8991 != null) {
                    if (class625.field8991.field7030 == null) {
                        var160 = class429.method2488(class625.field8991.field7029, 11147);
                    } else {
                        var160 = (String) class625.field8991.field7030;
                    }
                }
                field9058[field9045++] = var160;
                return;
            }
            if (arg0 == 5420) {
                field9048[field9056++] = class165.field2028 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class110.field1367 != null) {
                    class196.method1066(class565.field8299.field2168, (byte) 83, -1, -1, false);
                }
                String var161 = field9058[--field9045];
                boolean var162 = field9048[--field9056] == 1;
                String var163 = class335.method1888(-90) + var161;
                class224.method1285((byte) 98, class529.field7429 == 1, class74.field873, var163, var162);
                return;
            }
            if (arg0 == 5422) {
                field9045 -= 2;
                String var164 = field9058[field9045];
                String var165 = field9058[field9045 + 1];
                int var166 = field9048[--field9056];
                if (var164.length() > 0) {
                    if (class252.field3243 == null) {
                        class252.field3243 = new String[class238.field2987[class341.field4399.field7268]];
                    }
                    class252.field3243[var166] = var164;
                }
                if (var165.length() > 0) {
                    if (class382.field5055 == null) {
                        class382.field5055 = new String[class238.field2987[class341.field4399.field7268]];
                    }
                    class382.field5055[var166] = var165;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9058[--field9045]);
                return;
            }
            if (arg0 == 5424) {
                field9056 -= 11;
                class503.field6970 = field9048[field9056];
                class147.field1761 = field9048[field9056 + 1];
                class367.field4824 = field9048[field9056 + 2];
                class163.field1997 = field9048[field9056 + 3];
                class191.field2305 = field9048[field9056 + 4];
                class329.field4295 = field9048[field9056 + 5];
                class40.field316 = field9048[field9056 + 6];
                class206.field2480 = field9048[field9056 + 7];
                class391.field5186 = field9048[field9056 + 8];
                class89.field1098 = field9048[field9056 + 9];
                class445.field6132 = field9048[field9056 + 10];
                class39.field299.method2566(82, class191.field2305);
                class39.field299.method2566(70, class329.field4295);
                class39.field299.method2566(105, class40.field316);
                class39.field299.method2566(103, class206.field2480);
                class39.field299.method2566(81, class391.field5186);
                class636.field9145 = null;
                class175.field2139 = null;
                class128.field1576 = null;
                class426.field5484 = null;
                class388.field5126 = null;
                class6.field49 = null;
                client.field3215 = null;
                class258.field3324 = null;
                class590.field8552 = true;
                return;
            }
            if (arg0 == 5425) {
                class292.method1635(true);
                class590.field8552 = false;
                return;
            }
            if (arg0 == 5426) {
                field9056 -= 2;
                class529.field7434 = field9048[field9056];
                class14.field112 = field9048[field9056 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9056 -= 2;
                class45.field388 = field9048[field9056 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9056 -= 2;
                int var167 = field9048[field9056];
                int var168 = field9048[field9056 + 1];
                field9048[field9056++] = class70.method385(var168, 8448, var167) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class474.method2757(1, false, field9058[--field9045], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class47.method249("accountcreated", class74.field873.field2014, (byte) 120);
                    return;
                } catch (Throwable var291) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class47.method249("accountcreatestarted", class74.field873.field2014, (byte) 98);
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9056 -= 4;
                int var169 = field9048[field9056];
                int var170 = field9048[field9056 + 1];
                int var171 = field9048[field9056 + 2];
                int var172 = field9048[field9056 + 3];
                class272.method1523((var169 & 0x3FFF) - class119.field1504, var171, (var169 >> 14 & 0x3FFF) - class632.field9113, (byte) 88, false, var170, var172);
                return;
            }
            if (arg0 == 5501) {
                field9056 -= 4;
                int var173 = field9048[field9056];
                int var174 = field9048[field9056 + 1];
                int var175 = field9048[field9056 + 2];
                int var176 = field9048[field9056 + 3];
                class60.method346(16383, var175, (var173 >> 14 & 0x3FFF) - class632.field9113, var176, var174, (var173 & 0x3FFF) - class119.field1504);
                return;
            }
            if (arg0 == 5502) {
                field9056 -= 6;
                int var177 = field9048[field9056];
                if (var177 >= 2) {
                    throw new RuntimeException();
                }
                class225.field2767 = var177;
                int var178 = field9048[field9056 + 1];
                if (var178 + 1 >= class277.field3652[class225.field2767].length >> 1) {
                    throw new RuntimeException();
                }
                class523.field7335 = var178;
                class187.field2252 = 0;
                class311.field3979 = field9048[field9056 + 2];
                class169.field2065 = field9048[field9056 + 3];
                int var179 = field9048[field9056 + 4];
                if (var179 >= 2) {
                    throw new RuntimeException();
                }
                class268.field3503 = var179;
                int var180 = field9048[field9056 + 5];
                if (var180 + 1 >= class277.field3652[class268.field3503].length >> 1) {
                    throw new RuntimeException();
                }
                class571.field8381 = var180;
                class617.field8931 = 3;
                return;
            }
            if (arg0 == 5503) {
                class243.method1381(9407);
                return;
            }
            if (arg0 == 5504) {
                field9056 -= 2;
                class232.method1334(field9048[field9056 + 1], 53, 0, field9048[field9056]);
                return;
            }
            if (arg0 == 5505) {
                field9048[field9056++] = (int) class588.field8527 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9048[field9056++] = (int) class558.field8223 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class51.method280(47);
                return;
            }
            if (arg0 == 5508) {
                class639.method3665(true);
                return;
            }
            if (arg0 == 5509) {
                class504.method2910(102);
                return;
            }
            if (arg0 == 5510) {
                class515.method2954(-65);
                return;
            }
            if (arg0 == 5511) {
                int var181 = field9048[--field9056];
                int var182 = var181 >> 14 & 0x3FFF;
                int var183 = var181 & 0x3FFF;
                int var184 = var182 - class632.field9113;
                if (var184 < 0) {
                    var184 = 0;
                } else if (var184 >= class106.field1289) {
                    var184 = class106.field1289;
                }
                int var185 = var183 - class119.field1504;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class422.field5452) {
                    var185 = class422.field5452;
                }
                class429.field5826 = (var184 << 7) + 64;
                class449.field6219 = (var185 << 7) + 64;
                class617.field8931 = 4;
                return;
            }
            if (arg0 == 5512) {
                class40.method216(true);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9045 -= 2;
                String var186 = field9058[field9045];
                String var187 = field9058[field9045 + 1];
                int var188 = field9048[--field9056];
                if (class137.field1671 != 2) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    class249.field3184 = var186;
                    class571.field8376 = var187;
                    class184.field2230 = var188;
                    class35.method200(5, 2);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class312.method1733(41);
                return;
            }
            if (arg0 == 5602) {
                if (class197.field2381 == 0) {
                    class491.field6854 = -2;
                    class518.field7295 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field9056 -= 4;
                if (class137.field1671 != 2) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    class268.method1505(field9048[field9056], field9048[field9056 + 3], field9048[field9056 + 1], (byte) -63, field9048[field9056 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field9045--;
                if (class137.field1671 != 2) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    class532.method3041(-122, class348.method1943(97, field9058[field9045]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9045 -= 2;
                if (class137.field1671 != 2) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    class344.method1925(false, class348.method1943(97, field9058[field9045]), field9058[field9045 + 1], (byte) 62);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class137.field1672 == 0) {
                    class197.field2379 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9048[field9056++] = class518.field7295;
                return;
            }
            if (arg0 == 5608) {
                field9048[field9056++] = class64.field635;
                return;
            }
            if (arg0 == 5609) {
                field9048[field9056++] = class197.field2379;
                return;
            }
            if (arg0 == 5610) {
                for (int var189 = 0; var189 < 5; var189++) {
                    field9058[field9045++] = class133.field1637.length > var189 ? class252.method1429(class133.field1637[var189], false) : "";
                }
                class133.field1637 = null;
                return;
            }
            if (arg0 == 5611) {
                field9048[field9056++] = class164.field2008;
                return;
            }
            if (arg0 == 5612) {
                int var190 = field9048[--field9056];
                if (class137.field1671 != 6) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    if (class597.field8642 != null) {
                        class597.field8642.method2266((byte) -122);
                        class597.field8642 = null;
                    }
                    class184.field2230 = var190;
                    class35.method200(8, 2);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9048[field9056++] = class518.field7295;
                return;
            }
            if (arg0 == 5615) {
                field9045 -= 2;
                String var191 = field9058[field9045];
                String var192 = field9058[field9045 + 1];
                if (class137.field1671 != 2) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    if (class597.field8642 != null) {
                        class597.field8642.method2266((byte) -109);
                        class597.field8642 = null;
                    }
                    class249.field3184 = var191;
                    class571.field8376 = var192;
                    class35.method200(4, 2);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class542.method3152(false, -14485);
                return;
            }
            if (arg0 == 5617) {
                field9048[field9056++] = class491.field6854;
                return;
            }
            if (arg0 == 5618) {
                int var193 = field9048[--field9056];
                class377.method2195(-93, false, var193);
                return;
            }
            if (arg0 == 5619) {
                int var194 = field9048[--field9056];
                class377.method2195(-100, true, var194);
                return;
            }
            if (arg0 == 5620) {
                class398.method2285(1);
                if (class315.field4025 != "" && class315.field4025 != "") {
                    field9048[field9056++] = 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9045 -= 2;
                if (class137.field1671 != 2) {
                    return;
                }
                if (class197.field2381 == 0 && class137.field1672 == 0) {
                    class344.method1925(true, class348.method1943(97, field9058[field9045]), field9058[field9045 + 1], (byte) 62);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class506 var195 = class74.field873.method912("3", -4588, false);
                while (var195.field7031 == 0) {
                    class462.method2688(1L, (byte) 110);
                }
                if (var195.field7031 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class627 var196 = (class627) var195.field7030;
                if (var196.method3592(true).exists()) {
                    class374 var197 = new class374(50);
                    try {
                        var196.method3593(0, var197.field4929, 50, (byte) 99);
                    } catch (IOException var294) {
                    }
                }
                try {
                    var196.method3596((byte) -95);
                    return;
                } catch (Exception var293) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class59.field562 != null) {
                    field9048[field9056++] = 1;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var198 = field9048[--field9056];
                if (var198 < 1) {
                    var198 = 1;
                }
                if (var198 > 4) {
                    var198 = 4;
                }
                class565.field8299.field2201 = var198;
                class74.method422((byte) -126);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6002) {
                class565.field8299.method3589(field9048[--field9056] == 1, 73);
                class74.method422((byte) -14);
                class40.method210(68);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6003) {
                class565.field8299.field2198 = field9048[--field9056] == 1;
                class40.method210(26);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6005) {
                class565.field8299.field2187 = field9048[--field9056] == 1;
                class74.method422((byte) -26);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6006) {
                class565.field8299.field2193 = field9048[--field9056] == 1;
                class210.field2560.method1116(!class565.field8299.field2193);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6007) {
                class565.field8299.field2173 = field9048[--field9056];
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6008) {
                class565.field8299.field2197 = field9048[--field9056] == 1;
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6009) {
                class565.field8299.field2181 = field9048[--field9056] == 1;
                class74.method422((byte) -109);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6010) {
                class565.field8299.field2186 = field9048[--field9056] == 1;
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6011) {
                int var199 = field9048[--field9056];
                if (var199 < 0 || var199 > 2) {
                    var199 = 0;
                }
                class565.field8299.method992(var199, class529.field7429, 2);
                class74.method422((byte) -38);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6012) {
                class565.field8299.method995(class529.field7429, field9048[--field9056] == 1, (byte) 7);
                class529.method3013(4);
                class316.method1751(-113);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6014) {
                class565.field8299.field2189 = field9048[--field9056] == 1;
                class74.method422((byte) -107);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6015) {
                class565.field8299.field2178 = field9048[--field9056] == 1;
                class74.method422((byte) -58);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6016) {
                int var200 = field9048[--field9056];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class565.field8299.field2170 = var200;
                class24.method144(-2, class529.field7429);
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6017) {
                class565.field8299.field2171 = field9048[--field9056] == 1;
                class44.method234((byte) -12);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6018) {
                int var201 = field9048[--field9056];
                if (var201 < 0) {
                    var201 = 0;
                }
                if (var201 > 127) {
                    var201 = 127;
                }
                class565.field8299.field2167 = var201;
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6019) {
                int var202 = field9048[--field9056];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 255) {
                    var202 = 255;
                }
                if (class565.field8299.field2192 != var202) {
                    if (class565.field8299.field2192 == 0 && class225.field2766 != -1) {
                        class448.method2621(var202, 0, false, true, class225.field2766, class282.field3709);
                        class157.field1921 = false;
                    } else if (var202 == 0) {
                        class185.method1012((byte) 112);
                        class157.field1921 = false;
                    } else {
                        class125.method717(var202, -1150);
                    }
                    class565.field8299.field2192 = var202;
                }
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6020) {
                int var203 = field9048[--field9056];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 127) {
                    var203 = 127;
                }
                class565.field8299.field2177 = var203;
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6021) {
                class565.field8299.field8997 = field9048[--field9056] == 1;
                class40.method210(-113);
                return;
            }
            if (arg0 == 6023) {
                int var204 = field9048[--field9056];
                boolean var205 = false;
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 2) {
                    var204 = 2;
                }
                if (class252.field3258 < 96) {
                    var204 = 0;
                    var205 = true;
                }
                class459.method2677(var204, 2);
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                field9048[field9056++] = var205 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var206 = field9048[--field9056];
                if (var206 < 0 || var206 > 2) {
                    var206 = 0;
                }
                class565.field8299.field2166 = var206;
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6025) {
                int var207 = field9048[--field9056];
                if (var207 < 0 || var207 > class224.method1288(class252.field3258, 59)) {
                    var207 = 0;
                }
                class565.field8299.field2175 = var207;
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6027) {
                int var208 = field9048[--field9056];
                if (var208 < 0 || var208 > 1) {
                    var208 = 0;
                }
                class367.method2059(var208 == 1, (byte) 15);
                return;
            }
            if (arg0 == 6028) {
                class565.field8299.field2196 = field9048[--field9056] != 0;
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6029) {
                class565.field8299.field2173 = field9048[--field9056];
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6030) {
                class565.field8299.field2194 = field9048[--field9056] != 0;
                class565.field8299.method3585(true, class74.field873);
                class74.method422((byte) -26);
                return;
            }
            if (arg0 == 6031) {
                int var209 = field9048[--field9056];
                if (var209 < 0 || var209 > 5) {
                    var209 = 2;
                }
                class24.method144(-2, var209);
                return;
            }
            if (arg0 == 6032) {
                int var210 = field9048[--field9056];
                if (var210 < 0 || var210 > 5) {
                    var210 = 2;
                }
                class565.field8299.field2188 = var210;
                class565.field8299.method3585(true, class74.field873);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6033) {
                int var211 = field9048[--field9056];
                if (var211 < 0 || var211 > 4) {
                    var211 = 2;
                }
                class565.field8299.field2207 = var211;
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6034) {
                class565.field8299.field2183 = field9048[--field9056] == 1;
                class565.field8299.method3585(true, class74.field873);
                class529.method3013(4);
                class74.field865 = false;
                return;
            }
            if (arg0 == 6035) {
                class565.field8299.field9010 = field9048[--field9056] == 1;
                class74.method422((byte) -61);
                class40.method210(14);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9048[field9056++] = class565.field8299.field2201;
                return;
            }
            if (arg0 == 6102) {
                field9048[field9056++] = class565.field8299.method3580(class529.field7429, -60) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9048[field9056++] = class565.field8299.field2198 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9048[field9056++] = class565.field8299.field2187 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field9048[field9056++] = class565.field8299.field2193 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9048[field9056++] = class565.field8299.field2173;
                return;
            }
            if (arg0 == 6108) {
                field9048[field9056++] = class565.field8299.field2197 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field9048[field9056++] = class565.field8299.field2181 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9048[field9056++] = class565.field8299.field2186 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9048[field9056++] = class565.field8299.method990(class529.field7429, -1);
                return;
            }
            if (arg0 == 6112) {
                field9048[field9056++] = class565.field8299.method993(class529.field7429, -98) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9048[field9056++] = class565.field8299.field2189 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9048[field9056++] = class565.field8299.field2178 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9048[field9056++] = class565.field8299.field2170;
                return;
            }
            if (arg0 == 6117) {
                field9048[field9056++] = class565.field8299.field2171 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9048[field9056++] = class565.field8299.field2167;
                return;
            }
            if (arg0 == 6119) {
                field9048[field9056++] = class565.field8299.field2192;
                return;
            }
            if (arg0 == 6120) {
                field9048[field9056++] = class565.field8299.field2177;
                return;
            }
            if (arg0 == 6121) {
                field9048[field9056++] = class210.field2560.method1144() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field9048[field9056++] = class222.method1281((byte) -17);
                return;
            }
            if (arg0 == 6124) {
                field9048[field9056++] = class565.field8299.field2166;
                return;
            }
            if (arg0 == 6125) {
                field9048[field9056++] = class565.field8299.field2175;
                return;
            }
            if (arg0 == 6126) {
                field9048[field9056++] = class210.field2560.method1174() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field9048[field9056++] = class565.field8299.field2169 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9048[field9056++] = class565.field8299.field2196 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9048[field9056++] = class565.field8299.field2173;
                return;
            }
            if (arg0 == 6130) {
                field9048[field9056++] = class565.field8299.field2194 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9048[field9056++] = class529.field7429;
                return;
            }
            if (arg0 == 6132) {
                field9048[field9056++] = class565.field8299.field2188;
                return;
            }
            if (arg0 == 6133) {
                field9048[field9056++] = class165.field2028 == 1 || class165.field2028 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field9048[field9056++] = class224.method1288(class252.field3258, 59);
                return;
            }
            if (arg0 == 6135) {
                field9048[field9056++] = class565.field8299.field2207;
                return;
            }
            if (arg0 == 6136) {
                field9048[field9056++] = class565.field8299.field2183 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var212 = true;
                try {
                    var212 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var295) {
                }
                field9048[field9056++] = var212 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9056 -= 2;
                class537.field7645 = (short) field9048[field9056];
                if (class537.field7645 <= 0) {
                    class537.field7645 = 256;
                }
                class64.field636 = (short) field9048[field9056 + 1];
                if (class64.field636 <= 0) {
                    class64.field636 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9056 -= 2;
                class515.field7271 = (short) field9048[field9056];
                if (class515.field7271 <= 0) {
                    class515.field7271 = 256;
                }
                class562.field8275 = (short) field9048[field9056 + 1];
                if (class562.field8275 <= 0) {
                    class562.field8275 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9056 -= 4;
                class207.field2488 = (short) field9048[field9056];
                if (class207.field2488 <= 0) {
                    class207.field2488 = 1;
                }
                class103.field1262 = (short) field9048[field9056 + 1];
                if (class103.field1262 <= 0) {
                    class103.field1262 = 32767;
                } else if (class103.field1262 < class207.field2488) {
                    class103.field1262 = class207.field2488;
                }
                class360.field4736 = (short) field9048[field9056 + 2];
                if (class360.field4736 <= 0) {
                    class360.field4736 = 1;
                }
                class311.field3976 = (short) field9048[field9056 + 3];
                if (class311.field3976 <= 0) {
                    class311.field3976 = 32767;
                    return;
                }
                if (class311.field3976 < class360.field4736) {
                    class311.field3976 = class360.field4736;
                }
                return;
            }
            if (arg0 == 6203) {
                class493.method2847(class124.field1530.field7059, false, 0, class124.field1530.field7094, 121, 0);
                field9048[field9056++] = class116.field1459;
                field9048[field9056++] = class535.field7503;
                return;
            }
            if (arg0 == 6204) {
                field9048[field9056++] = class515.field7271;
                field9048[field9056++] = class562.field8275;
                return;
            }
            if (arg0 == 6205) {
                field9048[field9056++] = class537.field7645;
                field9048[field9056++] = class64.field636;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9048[field9056++] = (int) (class190.method1030(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9048[field9056++] = (int) (class190.method1030(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9056 -= 3;
                int var213 = field9048[field9056];
                int var214 = field9048[field9056 + 1];
                int var215 = field9048[field9056 + 2];
                field9047.clear();
                field9047.set(11, 12);
                field9047.set(var215, var214, var213);
                int var216 = (int) (field9047.getTime().getTime() / 86400000L) - 11745;
                if (var215 < 1970) {
                    var216--;
                }
                field9048[field9056++] = var216;
                return;
            }
            if (arg0 == 6303) {
                field9047.clear();
                field9047.setTime(new Date(class190.method1030(false)));
                field9048[field9056++] = field9047.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var217 = field9048[--field9056];
                boolean var218 = true;
                if (var217 < 0) {
                    var218 = (var217 + 1) % 4 == 0;
                } else if (var217 < 1582) {
                    var218 = var217 % 4 == 0;
                } else if (var217 % 4 != 0) {
                    var218 = false;
                } else if (var217 % 100 != 0) {
                    var218 = true;
                } else if (var217 % 400 != 0) {
                    var218 = false;
                }
                field9048[field9056++] = var218 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9048[field9056++] = class310.method1716(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9048[field9056++] = class618.method3552(111) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class137.field1671 == 6 && class197.field2381 == 0 && class137.field1672 == 0) {
                    if (class620.field8959) {
                        field9048[field9056++] = 0;
                        return;
                    }
                    if (class547.field8050 > class190.method1030(false) - 1000L) {
                        field9048[field9056++] = 1;
                        return;
                    }
                    class620.field8959 = true;
                    class418.method2378(17984, class294.field3791);
                    class136.field1663.method2131(class11.field86, -1495157560);
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class29 var219 = class599.method3460(0);
                if (var219 != null) {
                    field9048[field9056++] = var219.field196;
                    field9048[field9056++] = var219.field137;
                    field9058[field9045++] = var219.field197;
                    class429 var220 = var219.method162(-19323);
                    field9048[field9056++] = var220.field5822;
                    field9058[field9045++] = var220.field5823;
                    field9048[field9056++] = var219.field134;
                    field9048[field9056++] = var219.field198;
                    field9058[field9045++] = var219.field194;
                    return;
                }
                field9048[field9056++] = -1;
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                field9048[field9056++] = 0;
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                return;
            }
            if (arg0 == 6502) {
                class29 var221 = class178.method985(2);
                if (var221 != null) {
                    field9048[field9056++] = var221.field196;
                    field9048[field9056++] = var221.field137;
                    field9058[field9045++] = var221.field197;
                    class429 var222 = var221.method162(-19323);
                    field9048[field9056++] = var222.field5822;
                    field9058[field9045++] = var222.field5823;
                    field9048[field9056++] = var221.field134;
                    field9048[field9056++] = var221.field198;
                    field9058[field9045++] = var221.field194;
                    return;
                }
                field9048[field9056++] = -1;
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                field9048[field9056++] = 0;
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var223 = field9048[--field9056];
                String var224 = field9058[--field9045];
                if (class137.field1671 == 6 && class197.field2381 == 0 && class137.field1672 == 0) {
                    field9048[field9056++] = class289.method1626(var224, var223, 57) ? 1 : 0;
                    return;
                }
                field9048[field9056++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class565.field8299.field2172 = field9048[--field9056];
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6505) {
                field9048[field9056++] = class565.field8299.field2172;
                return;
            }
            if (arg0 == 6506) {
                int var225 = field9048[--field9056];
                class29 var226 = class303.method1675((byte) 38, var225);
                if (var226 != null) {
                    field9048[field9056++] = var226.field137;
                    field9058[field9045++] = var226.field197;
                    class429 var227 = var226.method162(-19323);
                    field9048[field9056++] = var227.field5822;
                    field9058[field9045++] = var227.field5823;
                    field9048[field9056++] = var226.field134;
                    field9048[field9056++] = var226.field198;
                    field9058[field9045++] = var226.field194;
                    return;
                }
                field9048[field9056++] = -1;
                field9058[field9045++] = "";
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                field9048[field9056++] = 0;
                field9048[field9056++] = 0;
                field9058[field9045++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9056 -= 4;
                int var228 = field9048[field9056];
                boolean var229 = field9048[field9056 + 1] == 1;
                int var230 = field9048[field9056 + 2];
                boolean var231 = field9048[field9056 + 3] == 1;
                class232.method1328(var228, var231, (byte) 127, var229, var230);
                return;
            }
            if (arg0 == 6508) {
                class11.method55(3);
                return;
            }
            if (arg0 == 6509) {
                if (class137.field1671 != 6) {
                    return;
                }
                class404.field5312 = field9048[--field9056] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9048[field9056++] = class641.field9242;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class565.field8299.field2184 = field9048[--field9056] == 1;
                class565.field8299.method3585(true, class74.field873);
                return;
            }
            if (arg0 == 6601) {
                field9048[field9056++] = class565.field8299.field2184 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class97.field1195 == class309.field3940) {
            if (arg0 == 6700) {
                int var232 = class309.field3937.method2639(121);
                if (class599.field8668 != -1) {
                    var232++;
                }
                field9048[field9056++] = var232;
                return;
            }
            if (arg0 == 6701) {
                int var233 = field9048[--field9056];
                if (class599.field8668 != -1) {
                    if (var233 == 0) {
                        field9048[field9056++] = class599.field8668;
                        return;
                    }
                    var233--;
                }
                class565 var234 = (class565) class309.field3937.method2638(false);
                while (var233-- > 0) {
                    var234 = (class565) class309.field3937.method2641(12089);
                }
                field9048[field9056++] = var234.field8297;
                return;
            }
            if (arg0 == 6702) {
                int var235 = field9048[--field9056];
                if (class459.field6326[var235] == null) {
                    field9058[field9045++] = "";
                    return;
                }
                String var236 = class459.field6326[var235][0].field7046;
                if (var236 == null) {
                    field9058[field9045++] = "";
                    return;
                }
                field9058[field9045++] = var236.substring(0, var236.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var237 = field9048[--field9056];
                if (class459.field6326[var237] == null) {
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = class459.field6326[var237].length;
                return;
            }
            if (arg0 == 6704) {
                field9056 -= 2;
                int var238 = field9048[field9056];
                int var239 = field9048[field9056 + 1];
                if (class459.field6326[var238] == null) {
                    field9058[field9045++] = "";
                    return;
                }
                String var240 = class459.field6326[var238][var239].field7046;
                if (var240 == null) {
                    field9058[field9045++] = "";
                    return;
                }
                field9058[field9045++] = var240;
                return;
            }
            if (arg0 == 6705) {
                field9056 -= 2;
                int var241 = field9048[field9056];
                int var242 = field9048[field9056 + 1];
                if (class459.field6326[var241] == null) {
                    field9048[field9056++] = 0;
                    return;
                }
                field9048[field9056++] = class459.field6326[var241][var242].field7111;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field9056 -= 3;
                int var243 = field9048[field9056];
                int var244 = field9048[field9056 + 1];
                int var245 = field9048[field9056 + 2];
                class543.method3180(1, "", var243 << 16 | var244, var245, true);
                return;
            }
            if (arg0 == 6708) {
                field9056 -= 3;
                int var246 = field9048[field9056];
                int var247 = field9048[field9056 + 1];
                int var248 = field9048[field9056 + 2];
                class543.method3180(2, "", var246 << 16 | var247, var248, true);
                return;
            }
            if (arg0 == 6709) {
                field9056 -= 3;
                int var249 = field9048[field9056];
                int var250 = field9048[field9056 + 1];
                int var251 = field9048[field9056 + 2];
                class543.method3180(3, "", var249 << 16 | var250, var251, true);
                return;
            }
            if (arg0 == 6710) {
                field9056 -= 3;
                int var252 = field9048[field9056];
                int var253 = field9048[field9056 + 1];
                int var254 = field9048[field9056 + 2];
                class543.method3180(4, "", var252 << 16 | var253, var254, true);
                return;
            }
            if (arg0 == 6711) {
                field9056 -= 3;
                int var255 = field9048[field9056];
                int var256 = field9048[field9056 + 1];
                int var257 = field9048[field9056 + 2];
                class543.method3180(5, "", var255 << 16 | var256, var257, true);
                return;
            }
            if (arg0 == 6712) {
                field9056 -= 3;
                int var258 = field9048[field9056];
                int var259 = field9048[field9056 + 1];
                int var260 = field9048[field9056 + 2];
                class543.method3180(6, "", var258 << 16 | var259, var260, true);
                return;
            }
            if (arg0 == 6713) {
                field9056 -= 3;
                int var261 = field9048[field9056];
                int var262 = field9048[field9056 + 1];
                int var263 = field9048[field9056 + 2];
                class543.method3180(7, "", var261 << 16 | var262, var263, true);
                return;
            }
            if (arg0 == 6714) {
                field9056 -= 3;
                int var264 = field9048[field9056];
                int var265 = field9048[field9056 + 1];
                int var266 = field9048[field9056 + 2];
                class543.method3180(8, "", var264 << 16 | var265, var266, true);
                return;
            }
            if (arg0 == 6715) {
                field9056 -= 3;
                int var267 = field9048[field9056];
                int var268 = field9048[field9056 + 1];
                int var269 = field9048[field9056 + 2];
                class543.method3180(9, "", var267 << 16 | var268, var269, true);
                return;
            }
            if (arg0 == 6716) {
                field9056 -= 3;
                int var270 = field9048[field9056];
                int var271 = field9048[field9056 + 1];
                int var272 = field9048[field9056 + 2];
                class543.method3180(10, "", var270 << 16 | var271, var272, true);
                return;
            }
            if (arg0 == 6717) {
                field9056 -= 3;
                int var273 = field9048[field9056];
                int var274 = field9048[field9056 + 1];
                int var275 = field9048[field9056 + 2];
                class509 var276 = class369.method2071(var273 << 16 | var274, var275, -20190);
                class281.method1595(25098);
                class268 var277 = client.method1412(var276);
                class406.method2314(var277.method1499(0), -97, var277.field3500, var276);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var278 = field9048[--field9056];
                class107 var279 = class450.field6233.method3245((byte) -119, var278);
                if (var279.field1335 == null) {
                    field9058[field9045++] = "";
                    return;
                }
                field9058[field9045++] = var279.field1335;
                return;
            }
            if (arg0 == 6801) {
                int var280 = field9048[--field9056];
                class107 var281 = class450.field6233.method3245((byte) -119, var280);
                field9048[field9056++] = var281.field1317;
                return;
            }
            if (arg0 == 6802) {
                int var282 = field9048[--field9056];
                class107 var283 = class450.field6233.method3245((byte) -119, var282);
                field9048[field9056++] = var283.field1340;
                return;
            }
            if (arg0 == 6803) {
                int var284 = field9048[--field9056];
                class107 var285 = class450.field6233.method3245((byte) -119, var284);
                field9048[field9056++] = var285.field1333;
                return;
            }
            if (arg0 == 6804) {
                field9056 -= 2;
                int var286 = field9048[field9056];
                int var287 = field9048[field9056 + 1];
                class395 var288 = class290.field3771.method2793(11, var287);
                if (var288.method2273((byte) 43)) {
                    field9058[field9045++] = class450.field6233.method3245((byte) -119, var286).method623(var287, 0, var288.field5217);
                    return;
                }
                field9048[field9056++] = class450.field6233.method3245((byte) -119, var286).method627((byte) -105, var288.field5211, var287);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field9048[field9056++] = class140.field1703 && !class161.field1948 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field9048[field9056++] = class632.field9102;
                return;
            }
            if (arg0 == 6902) {
                field9048[field9056++] = class327.field4236;
                return;
            }
            if (arg0 == 6903) {
                field9048[field9056++] = class425.field5479;
                return;
            }
            if (arg0 == 6904) {
                field9048[field9056++] = class115.field1443;
                return;
            }
            if (arg0 == 6905) {
                String var289 = "";
                if (class625.field8991 != null) {
                    if (class625.field8991.field7030 == null) {
                        var289 = class429.method2488(class625.field8991.field7029, 11147);
                    } else {
                        var289 = (String) class625.field8991.field7030;
                    }
                }
                field9058[field9045++] = var289;
                return;
            }
            if (arg0 == 6906) {
                field9048[field9056++] = class222.field2730;
                return;
            }
            if (arg0 == 6907) {
                field9048[field9056++] = class601.field8673;
                return;
            }
            if (arg0 == 6908) {
                field9048[field9056++] = class99.field1233;
                return;
            }
            if (arg0 == 6909) {
                field9048[field9056++] = class605.field8729 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field9048[field9056++] = class414.field5385;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var290 = class565.field8299.method3573(-26);
                field9048[field9056++] = class565.field8299.field9009 = class529.field7429;
                field9048[field9056++] = var290;
                class74.method422((byte) -93);
                return;
            }
            if (arg0 == 7001) {
                class565.field8299.method3591((byte) 118);
                class74.method422((byte) -28);
                return;
            }
            if (arg0 == 7002) {
                class565.field8299.method3577((byte) 61);
                class74.method422((byte) -90);
                return;
            }
            if (arg0 == 7003) {
                class565.field8299.method3583(2523);
                class74.method422((byte) -51);
                return;
            }
            if (arg0 == 7004) {
                class565.field8299.method3574(0);
                class74.method422((byte) -118);
                return;
            }
            if (arg0 == 7005) {
                class565.field8299.field2204 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class565.field8299.field9009 == 2) {
                    class565.field8299.field9003 = true;
                    return;
                }
                if (class565.field8299.field9009 == 1) {
                    class565.field8299.field9002 = true;
                    return;
                }
                if (class565.field8299.field9009 == 3) {
                    class565.field8299.field8992 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field9048[field9056++] = class565.field8299.field2204;
                return;
            }
            if (arg0 == 7008) {
                if (class529.field7429 == 0 && class252.field3258 < 96) {
                    field9048[field9056++] = 2;
                    return;
                }
                field9048[field9056++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
    public static final void method3620() {
    }
}
