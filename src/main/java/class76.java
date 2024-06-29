import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class76 {

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    private static int field1079 = 0;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field1078 = new String[1000];

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "[I")
    private static int[] field1083 = new int[3];

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    private static int field1073 = 0;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    private static int field1080 = 0;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "[[I")
    private static int[][] field1087 = new int[5][5000];

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "[I")
    private static int[] field1082 = new int[1000];

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "I")
    private static int field1090 = 0;

    @OriginalMember(owner = "client!sga", name = "v", descriptor = "[Lli;")
    private static class453[] field1094 = new class453[50];

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "[I")
    private static int[] field1098 = new int[5];

    @OriginalMember(owner = "client!sga", name = "w", descriptor = "[J")
    private static long[] field1095 = new long[1000];

    @OriginalMember(owner = "client!sga", name = "t", descriptor = "Lpja;")
    public static class43 field1092 = new class43(4);

    @OriginalMember(owner = "client!sga", name = "F", descriptor = "I")
    private static int field1104 = 0;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!sga", name = "s", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!sga", name = "u", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!sga", name = "x", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!sga", name = "A", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!sga", name = "B", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!sga", name = "C", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "Lkh;")
    private static class17 field1084;

    @OriginalMember(owner = "client!sga", name = "y", descriptor = "Lkh;")
    private static class17 field1097;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "Lgca;")
    private static class265 field1077;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "Lrh;")
    private static class280 field1076;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "Ljb;")
    private static class521 field1086;

    @OriginalMember(owner = "client!sga", name = "D", descriptor = "[I")
    private static int[] field1102;

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "[J")
    private static long[] field1089;

    @OriginalMember(owner = "client!sga", name = "E", descriptor = "[Ljava/lang/String;")
    private static String[] field1103;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    private static final void method643(int arg0) {
        class17 var1 = class379.method2309(arg0, 192);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class17[] var3 = class79.field1113[var2];
        if (var3 == null) {
            class17[] var4 = class431.field5870[var2];
            int var5 = var4.length;
            var3 = class79.field1113[var2] = new class17[var5];
            class275.method1769(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class275.method1769(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ldt;)V")
    public static final void method644(class255 arg0) {
        method653(arg0, 200000);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method645(int arg0) {
        String var1 = field1076.method1805(class177.field2797.field8378 << 16 | arg0, 0);
        return var1 == null ? "" : var1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "()V")
    public static void method646() {
        field1102 = null;
        field1103 = null;
        field1089 = null;
        field1098 = null;
        field1087 = null;
        field1082 = null;
        field1078 = null;
        field1095 = null;
        field1094 = null;
        field1084 = null;
        field1097 = null;
        field1086 = null;
        field1076 = null;
        field1077 = null;
        field1083 = null;
        field1092 = null;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lfp;I)V")
    private static final void method647(class344 arg0, int arg1) {
        field1090 = 0;
        field1079 = 0;
        int var2 = -1;
        int[] var3 = arg0.field4627;
        int[] var4 = arg0.field4625;
        byte var5 = -1;
        field1080 = 0;
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
                        method654(var45, var37);
                    } else if (var45 >= 5000 && var45 < 10000) {
                        method657(var45, var37);
                    } else {
                        throw new IllegalStateException("Command: " + var45);
                    }
                } else if (var45 == 0) {
                    field1082[field1090++] = var4[var2];
                } else if (var45 == 1) {
                    int var7 = var4[var2];
                    field1082[field1090++] = class694.field9613.field447[var7];
                } else if (var45 == 2) {
                    int var8 = var4[var2];
                    class694.field9613.method145(25856, field1082[--field1090], var8);
                } else if (var45 == 3) {
                    field1078[field1079++] = arg0.field4634[var2];
                } else if (var45 == 6) {
                    var2 += var4[var2];
                } else if (var45 == 7) {
                    field1090 -= 2;
                    if (field1082[field1090 + 1] != field1082[field1090]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 8) {
                    field1090 -= 2;
                    if (field1082[field1090 + 1] == field1082[field1090]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 9) {
                    field1090 -= 2;
                    if (field1082[field1090] < field1082[field1090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 10) {
                    field1090 -= 2;
                    if (field1082[field1090] > field1082[field1090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 21) {
                    if (field1080 == 0) {
                        return;
                    }
                    class453 var9 = field1094[--field1080];
                    arg0 = var9.field6189;
                    var3 = arg0.field4627;
                    var4 = arg0.field4625;
                    var2 = var9.field6191;
                    field1102 = var9.field6187;
                    field1103 = var9.field6195;
                    field1089 = var9.field6194;
                } else if (var45 == 25) {
                    int var10 = var4[var2];
                    field1082[field1090++] = class694.field9613.method138(19129, var10);
                } else if (var45 == 27) {
                    int var11 = var4[var2];
                    class694.field9613.method142(var11, field1082[--field1090], 0);
                } else if (var45 == 31) {
                    field1090 -= 2;
                    if (field1082[field1090] <= field1082[field1090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 32) {
                    field1090 -= 2;
                    if (field1082[field1090] >= field1082[field1090 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 33) {
                    field1082[field1090++] = field1102[var4[var2]];
                } else if (var45 == 34) {
                    field1102[var4[var2]] = field1082[--field1090];
                } else if (var45 == 35) {
                    field1078[field1079++] = field1103[var4[var2]];
                } else if (var45 == 36) {
                    field1103[var4[var2]] = field1078[--field1079];
                } else if (var45 == 37) {
                    int var12 = var4[var2];
                    field1079 -= var12;
                    String var13 = class461.method2651(var12, field1079, -1, field1078);
                    field1078[field1079++] = var13;
                } else if (var45 == 38) {
                    field1090--;
                } else if (var45 == 39) {
                    field1079--;
                } else if (var45 == 40) {
                    int var14 = var4[var2];
                    class344 var15 = class127.method1085(var14, (byte) 39);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field4637];
                    String[] var17 = new String[var15.field4622];
                    long[] var18 = new long[var15.field4624];
                    for (int var19 = 0; var19 < var15.field4632; var19++) {
                        var16[var19] = field1082[field1090 + var19 - var15.field4632];
                    }
                    for (int var20 = 0; var20 < var15.field4636; var20++) {
                        var17[var20] = field1078[field1079 + var20 - var15.field4636];
                    }
                    for (int var21 = 0; var21 < var15.field4635; var21++) {
                        var18[var21] = field1095[field1073 + var21 - var15.field4635];
                    }
                    field1090 -= var15.field4632;
                    field1079 -= var15.field4636;
                    field1073 -= var15.field4635;
                    class453 var22 = new class453();
                    var22.field6189 = arg0;
                    var22.field6191 = var2;
                    var22.field6187 = field1102;
                    var22.field6195 = field1103;
                    var22.field6194 = field1089;
                    if (field1080 >= field1094.length) {
                        throw new RuntimeException();
                    }
                    field1094[field1080++] = var22;
                    arg0 = var15;
                    var3 = var15.field4627;
                    var4 = var15.field4625;
                    var2 = -1;
                    field1102 = var16;
                    field1103 = var17;
                    field1089 = var18;
                } else if (var45 == 42) {
                    field1082[field1090++] = class46.field724[var4[var2]];
                } else if (var45 == 43) {
                    int var23 = var4[var2];
                    class46.field724[var23] = field1082[--field1090];
                    class373.method2266(true, var23);
                    class271.field3792 |= class617.field8593[var23];
                } else if (var45 == 44) {
                    int var24 = var4[var2] >> 16;
                    int var25 = var4[var2] & 0xFFFF;
                    int var26 = field1082[--field1090];
                    if (var26 >= 0 && var26 <= 5000) {
                        field1098[var24] = var26;
                        byte var27 = -1;
                        if (var25 == 105) {
                            var27 = 0;
                        }
                        int var28 = 0;
                        while (true) {
                            if (var28 >= var26) {
                                continue label333;
                            }
                            field1087[var24][var28] = var27;
                            var28++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var45 == 45) {
                    int var29 = var4[var2];
                    int var30 = field1082[--field1090];
                    if (var30 < 0 || var30 >= field1098[var29]) {
                        throw new RuntimeException();
                    }
                    field1082[field1090++] = field1087[var29][var30];
                } else if (var45 == 46) {
                    int var31 = var4[var2];
                    field1090 -= 2;
                    int var32 = field1082[field1090];
                    if (var32 < 0 || var32 >= field1098[var31]) {
                        throw new RuntimeException();
                    }
                    field1087[var31][var32] = field1082[field1090 + 1];
                } else if (var45 == 47) {
                    String var33 = class74.field1071[var4[var2]];
                    if (var33 == null) {
                        var33 = "null";
                    }
                    field1078[field1079++] = var33;
                } else if (var45 == 48) {
                    int var34 = var4[var2];
                    class74.field1071[var34] = field1078[--field1079];
                    class517.method2948(var34, (byte) 81);
                } else if (var45 == 51) {
                    class46 var35 = arg0.field4628[var4[var2]];
                    class345 var36 = (class345) var35.method337((long) field1082[--field1090], 1);
                    if (var36 != null) {
                        var2 += var36.field4640;
                    }
                } else if (var45 == 54) {
                    field1095[field1073++] = arg0.field4626[var2];
                } else if (var45 == 55) {
                    field1073--;
                } else if (var45 == 66) {
                    field1095[field1073++] = field1089[var4[var2]];
                } else if (var45 == 67) {
                    field1089[var4[var2]] = field1095[--field1073];
                } else if (var45 == 68) {
                    field1073 -= 2;
                    if (field1095[field1073 + 1] != field1095[field1073]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 69) {
                    field1073 -= 2;
                    if (field1095[field1073 + 1] == field1095[field1073]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 70) {
                    field1073 -= 2;
                    if (field1095[field1073] < field1095[field1073 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 71) {
                    field1073 -= 2;
                    if (field1095[field1073] > field1095[field1073 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 72) {
                    field1073 -= 2;
                    if (field1095[field1073] <= field1095[field1073 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 73) {
                    field1073 -= 2;
                    if (field1095[field1073] >= field1095[field1073 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 86) {
                    if (field1082[--field1090] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 87) {
                    if (field1082[--field1090] == 0) {
                        var2 += var4[var2];
                    }
                } else if (var45 == 112) {
                    field1082[field1090++] = method658(var4[var2]);
                } else if (var45 == 113) {
                    field1082[field1090++] = method652(var4[var2]);
                } else if (var45 == 114) {
                    field1095[field1073++] = method650(var4[var2]);
                } else if (var45 == 115) {
                    field1078[field1079++] = method645(var4[var2]);
                }
            }
        } catch (Exception var44) {
            if (arg0.field4629 == null) {
                StringBuffer var42 = new StringBuffer(30);
                var42.append("CS2: ").append(arg0.field2528).append(" ");
                for (int var43 = field1080 - 1; var43 >= 0; var43--) {
                    var42.append("v: ").append(field1094[var43].field6189.field2528).append(" ");
                }
                var42.append("op: ").append(var5);
                class281.method1820(var42.toString(), 28395, var44);
            } else {
                class629.method3535("Clientscript error in: " + arg0.field4629, 4, -2309);
                StringBuffer var39 = new StringBuffer(30);
                var39.append("Clientscript error in: ").append(arg0.field4629).append("\n");
                for (int var40 = field1080 - 1; var40 >= 0; var40--) {
                    var39.append("via: ").append(field1094[var40].field6189.field4629).append("\n");
                }
                var39.append("Op: ").append(var5).append("\n");
                String var41 = var44.getMessage();
                if (var41 != null && var41.length() > 0) {
                    var39.append("Message: ").append(var41).append("\n");
                }
                class281.method1820(var39.toString(), 28395, var44);
                class652.method3663(115, var39.toString());
            }
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(C)I")
    private static final int method648(char arg0) {
        return class661.method3716(arg0, 66) ? 1 : 0;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "()V")
    public static final void method649() {
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)J")
    private static final long method650(int arg0) {
        Long var1 = field1076.method1806(class177.field2797.field8378 << 16 | arg0, 104);
        return var1 == null ? -1L : var1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method651(String arg0, int arg1) {
        if (class407.field5593 == 0 && !(!class686.field9536 || class282.field3916) || class88.field1208) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class641.field8865.method3566((byte) -83, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class641.field8865.method3566((byte) -64, 0).length());
        } else if (var2.startsWith(class641.field8866.method3566((byte) 103, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class641.field8866.method3566((byte) 106, 0).length());
        } else if (var2.startsWith(class641.field8867.method3566((byte) -35, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class641.field8867.method3566((byte) -111, 0).length());
        } else if (var2.startsWith(class641.field8868.method3566((byte) 100, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class641.field8868.method3566((byte) 110, 0).length());
        } else if (var2.startsWith(class641.field8869.method3566((byte) -47, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class641.field8869.method3566((byte) 102, 0).length());
        } else if (var2.startsWith(class641.field8870.method3566((byte) 94, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class641.field8870.method3566((byte) 119, 0).length());
        } else if (var2.startsWith(class641.field8871.method3566((byte) -33, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class641.field8871.method3566((byte) 95, 0).length());
        } else if (var2.startsWith(class641.field8872.method3566((byte) -41, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class641.field8872.method3566((byte) -88, 0).length());
        } else if (var2.startsWith(class641.field8873.method3566((byte) -61, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class641.field8873.method3566((byte) -85, 0).length());
        } else if (var2.startsWith(class641.field8874.method3566((byte) -36, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class641.field8874.method3566((byte) -99, 0).length());
        } else if (var2.startsWith(class641.field8875.method3566((byte) 95, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class641.field8875.method3566((byte) 123, 0).length());
        } else if (var2.startsWith(class641.field8876.method3566((byte) -78, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class641.field8876.method3566((byte) 94, 0).length());
        } else if (class464.field6309 != 0) {
            if (var2.startsWith(class641.field8865.method3566((byte) 108, class464.field6309))) {
                var3 = 0;
                arg0 = arg0.substring(class641.field8865.method3566((byte) 102, class464.field6309).length());
            } else if (var2.startsWith(class641.field8866.method3566((byte) 116, class464.field6309))) {
                var3 = 1;
                arg0 = arg0.substring(class641.field8866.method3566((byte) 111, class464.field6309).length());
            } else if (var2.startsWith(class641.field8867.method3566((byte) 105, class464.field6309))) {
                var3 = 2;
                arg0 = arg0.substring(class641.field8867.method3566((byte) 122, class464.field6309).length());
            } else if (var2.startsWith(class641.field8868.method3566((byte) 102, class464.field6309))) {
                var3 = 3;
                arg0 = arg0.substring(class641.field8868.method3566((byte) -55, class464.field6309).length());
            } else if (var2.startsWith(class641.field8869.method3566((byte) -111, class464.field6309))) {
                var3 = 4;
                arg0 = arg0.substring(class641.field8869.method3566((byte) 112, class464.field6309).length());
            } else if (var2.startsWith(class641.field8870.method3566((byte) -61, class464.field6309))) {
                var3 = 5;
                arg0 = arg0.substring(class641.field8870.method3566((byte) -91, class464.field6309).length());
            } else if (var2.startsWith(class641.field8871.method3566((byte) 109, class464.field6309))) {
                var3 = 6;
                arg0 = arg0.substring(class641.field8871.method3566((byte) 99, class464.field6309).length());
            } else if (var2.startsWith(class641.field8872.method3566((byte) -104, class464.field6309))) {
                var3 = 7;
                arg0 = arg0.substring(class641.field8872.method3566((byte) -106, class464.field6309).length());
            } else if (var2.startsWith(class641.field8873.method3566((byte) -119, class464.field6309))) {
                var3 = 8;
                arg0 = arg0.substring(class641.field8873.method3566((byte) 93, class464.field6309).length());
            } else if (var2.startsWith(class641.field8874.method3566((byte) 124, class464.field6309))) {
                var3 = 9;
                arg0 = arg0.substring(class641.field8874.method3566((byte) -89, class464.field6309).length());
            } else if (var2.startsWith(class641.field8875.method3566((byte) 95, class464.field6309))) {
                var3 = 10;
                arg0 = arg0.substring(class641.field8875.method3566((byte) 103, class464.field6309).length());
            } else if (var2.startsWith(class641.field8876.method3566((byte) 111, class464.field6309))) {
                var3 = 11;
                arg0 = arg0.substring(class641.field8876.method3566((byte) 126, class464.field6309).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class641.field8877.method3566((byte) -88, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class641.field8877.method3566((byte) 100, 0).length());
        } else if (var4.startsWith(class641.field8878.method3566((byte) 103, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class641.field8878.method3566((byte) -95, 0).length());
        } else if (var4.startsWith(class641.field8879.method3566((byte) -96, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class641.field8879.method3566((byte) -64, 0).length());
        } else if (var4.startsWith(class641.field8880.method3566((byte) -53, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class641.field8880.method3566((byte) 115, 0).length());
        } else if (var4.startsWith(class641.field8881.method3566((byte) 125, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class641.field8881.method3566((byte) 112, 0).length());
        } else if (class464.field6309 != 0) {
            if (var4.startsWith(class641.field8877.method3566((byte) -50, class464.field6309))) {
                var5 = 1;
                arg0 = arg0.substring(class641.field8877.method3566((byte) 114, class464.field6309).length());
            } else if (var4.startsWith(class641.field8878.method3566((byte) -73, class464.field6309))) {
                var5 = 2;
                arg0 = arg0.substring(class641.field8878.method3566((byte) 120, class464.field6309).length());
            } else if (var4.startsWith(class641.field8879.method3566((byte) -34, class464.field6309))) {
                var5 = 3;
                arg0 = arg0.substring(class641.field8879.method3566((byte) -99, class464.field6309).length());
            } else if (var4.startsWith(class641.field8880.method3566((byte) 123, class464.field6309))) {
                var5 = 4;
                arg0 = arg0.substring(class641.field8880.method3566((byte) 114, class464.field6309).length());
            } else if (var4.startsWith(class641.field8881.method3566((byte) 110, class464.field6309))) {
                var5 = 5;
                arg0 = arg0.substring(class641.field8881.method3566((byte) -110, class464.field6309).length());
            }
        }
        field1074++;
        class537 var6 = class476.method2729(class678.field9438, (byte) -46, class551.field7498);
        var6.field7295.method754(0, 29);
        int var7 = var6.field7295.field1442;
        var6.field7295.method754(var3, 89);
        var6.field7295.method754(var5, 64);
        class200.method1445(var6.field7295, arg0, -88);
        var6.field7295.method778(var6.field7295.field1442 - var7, -1123171672);
        class173.method1314(false, var6);
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I")
    private static final int method652(int arg0) {
        class126 var1 = class624.field8698.method4265(-46, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c113");
        }
        System.out.println("activeClanSettings:" + field1076);
        Integer var2 = field1076.method1808(var1.field2223, -57, class177.field2797.field8378 << 16 | var1.field2225, var1.field2222);
        return var2 == null ? 0 : var2;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ldt;I)V")
    private static final void method653(class255 arg0, int arg1) {
        Object[] var2 = arg0.field3586;
        int var3 = (Integer) var2[0];
        class344 var4 = class127.method1085(var3, (byte) 39);
        if (var4 == null) {
            return;
        }
        field1102 = new int[var4.field4637];
        int var5 = 0;
        field1103 = new String[var4.field4622];
        int var6 = 0;
        field1089 = new long[var4.field4624];
        int var7 = 0;
        for (int var8 = 1; var8 < var2.length; var8++) {
            if (var2[var8] instanceof Integer) {
                int var9 = (Integer) var2[var8];
                if (var9 == -2147483647) {
                    var9 = arg0.field3595;
                }
                if (var9 == -2147483646) {
                    var9 = arg0.field3591;
                }
                if (var9 == -2147483645) {
                    var9 = arg0.field3583 == null ? -1 : arg0.field3583.field372;
                }
                if (var9 == -2147483644) {
                    var9 = arg0.field3588;
                }
                if (var9 == -2147483643) {
                    var9 = arg0.field3583 == null ? -1 : arg0.field3583.field282;
                }
                if (var9 == -2147483642) {
                    var9 = arg0.field3582 == null ? -1 : arg0.field3582.field372;
                }
                if (var9 == -2147483641) {
                    var9 = arg0.field3582 == null ? -1 : arg0.field3582.field282;
                }
                if (var9 == -2147483640) {
                    var9 = arg0.field3587;
                }
                if (var9 == -2147483639) {
                    var9 = arg0.field3584;
                }
                field1102[var5++] = var9;
            } else if (var2[var8] instanceof String) {
                String var10 = (String) var2[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg0.field3592;
                }
                field1103[var6++] = var10;
            } else if (var2[var8] instanceof Long) {
                long var11 = (Long) var2[var8];
                field1089[var7++] = var11;
            }
        }
        field1104 = arg0.field3593;
        method647(var4, arg1);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
    private static final void method654(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 150) {
                field1090 -= 3;
                int var2 = field1082[field1090];
                int var3 = field1082[field1090 + 1];
                int var4 = field1082[field1090 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class17 var5 = class379.method2309(var2, 192);
                if (var5.field320 == null) {
                    var5.field320 = new class17[var4 + 1];
                }
                if (var5.field320.length <= var4) {
                    class17[] var6 = new class17[var4 + 1];
                    for (int var7 = 0; var7 < var5.field320.length; var7++) {
                        var6[var7] = var5.field320[var7];
                    }
                    var5.field320 = var6;
                }
                if (var4 > 0 && var5.field320[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class17 var8 = new class17();
                var8.field352 = var3;
                var8.field336 = var8.field372 = var5.field372;
                var8.field282 = var4;
                var5.field320[var4] = var8;
                if (arg1) {
                    field1097 = var8;
                } else {
                    field1084 = var8;
                }
                class410.method2433(var5, 14049);
                return;
            }
            if (arg0 == 151) {
                class17 var9 = arg1 ? field1097 : field1084;
                if (var9.field282 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class17 var10 = class379.method2309(var9.field372, 192);
                var10.field320[var9.field282] = null;
                class410.method2433(var10, 14049);
                return;
            }
            if (arg0 == 152) {
                class17 var11 = class379.method2309(field1082[--field1090], 192);
                var11.field320 = null;
                class410.method2433(var11, 14049);
                return;
            }
            if (arg0 == 200) {
                field1090 -= 2;
                int var12 = field1082[field1090];
                int var13 = field1082[field1090 + 1];
                class17 var14 = class326.method2066(var13, var12, 121);
                if (var14 != null && var13 != -1) {
                    field1082[field1090++] = 1;
                    if (arg1) {
                        field1097 = var14;
                        return;
                    }
                    field1084 = var14;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1082[--field1090];
                class17 var16 = class379.method2309(var15, 192);
                if (var16 != null) {
                    field1082[field1090++] = 1;
                    if (arg1) {
                        field1097 = var16;
                        return;
                    }
                    field1084 = var16;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1082[--field1090];
                method659(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1082[--field1090];
                method643(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1090 -= 2;
                int var19 = field1082[field1090];
                int var20 = field1082[field1090 + 1];
                if (class235.field3379.field10630 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class663.field9210.length; var21++) {
                    if (class663.field9210[var21] == var19) {
                        class235.field3379.field10630.method1025(class178.field2808, var21, (byte) 110, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class767.field10582.length; var22++) {
                    if (class767.field10582[var22] == var19) {
                        class235.field3379.field10630.method1025(class178.field2808, var22, (byte) 110, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1090 -= 2;
                int var23 = field1082[field1090];
                int var24 = field1082[field1090 + 1];
                if (class235.field3379.field10630 == null) {
                    return;
                }
                class235.field3379.field10630.method1019(var23, (byte) -126, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1082[--field1090] != 0;
                if (class235.field3379.field10630 == null) {
                    return;
                }
                class235.field3379.field10630.method1017(var25, 112);
                return;
            }
            if (arg0 == 411) {
                field1090 -= 2;
                int var26 = field1082[field1090];
                int var27 = field1082[field1090 + 1];
                if (class235.field3379.field10630 == null) {
                    return;
                }
                class235.field3379.field10630.method1021(var26, var27, 0, class143.field2427);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class17 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class379.method2309(field1082[--field1090], 192);
            } else {
                var28 = arg1 ? field1097 : field1084;
            }
            if (arg0 == 1000) {
                field1090 -= 4;
                var28.field274 = field1082[field1090];
                var28.field244 = field1082[field1090 + 1];
                int var29 = field1082[field1090 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field1082[field1090 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field315 = (byte) var29;
                var28.field394 = (byte) var30;
                class410.method2433(var28, 14049);
                class509.method2904(var28, -27082);
                if (var28.field282 == -1) {
                    class347.method2148(var28.field372, (byte) -78);
                }
                return;
            }
            if (arg0 == 1001) {
                field1090 -= 4;
                var28.field376 = field1082[field1090];
                var28.field335 = field1082[field1090 + 1];
                var28.field381 = 0;
                var28.field392 = 0;
                int var31 = field1082[field1090 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field1082[field1090 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field388 = (byte) var31;
                var28.field266 = (byte) var32;
                class410.method2433(var28, 14049);
                class509.method2904(var28, -27082);
                if (var28.field352 == 0) {
                    class358.method2206(var28, 126, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field1082[--field1090] == 1;
                if (var28.field404 != var33) {
                    var28.field404 = var33;
                    class410.method2433(var28, 14049);
                }
                if (var28.field282 == -1) {
                    class608.method3453(var28.field372, -27019);
                }
                return;
            }
            if (arg0 == 1004) {
                field1090 -= 2;
                var28.field299 = field1082[field1090];
                var28.field243 = field1082[field1090 + 1];
                class410.method2433(var28, 14049);
                class509.method2904(var28, -27082);
                if (var28.field352 == 0) {
                    class358.method2206(var28, 68, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field267 = field1082[--field1090] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class17 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class379.method2309(field1082[--field1090], 192);
            } else {
                var34 = arg1 ? field1097 : field1084;
            }
            if (arg0 == 1100) {
                field1090 -= 2;
                var34.field252 = field1082[field1090];
                if (var34.field252 > var34.field277 - var34.field347) {
                    var34.field252 = var34.field277 - var34.field347;
                }
                if (var34.field252 < 0) {
                    var34.field252 = 0;
                }
                var34.field362 = field1082[field1090 + 1];
                if (var34.field362 > var34.field364 - var34.field330) {
                    var34.field362 = var34.field364 - var34.field330;
                }
                if (var34.field362 < 0) {
                    var34.field362 = 0;
                }
                class410.method2433(var34, 14049);
                if (var34.field282 == -1) {
                    class228.method1555((byte) -71, var34.field372);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field273 = field1082[--field1090];
                class410.method2433(var34, 14049);
                if (var34.field282 == -1) {
                    class619.method3489(-1, var34.field372);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field415 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1103) {
                var34.field245 = field1082[--field1090];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1104) {
                var34.field325 = field1082[--field1090];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field1082[--field1090];
                if (var34.field303 != var35) {
                    var34.field303 = var35;
                    class410.method2433(var34, 14049);
                }
                if (var34.field282 == -1) {
                    class272.method1761((byte) -125, var34.field372);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field298 = field1082[--field1090];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1107) {
                var34.field344 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1108) {
                var34.field272 = 1;
                var34.field339 = field1082[--field1090];
                class410.method2433(var34, 14049);
                if (var34.field282 == -1) {
                    class20.method136(4, var34.field372);
                }
                return;
            }
            if (arg0 == 1109) {
                field1090 -= 6;
                var34.field326 = field1082[field1090];
                var34.field313 = field1082[field1090 + 1];
                var34.field295 = field1082[field1090 + 2];
                var34.field414 = field1082[field1090 + 3];
                var34.field399 = field1082[field1090 + 4];
                var34.field412 = field1082[field1090 + 5];
                class410.method2433(var34, 14049);
                if (var34.field282 == -1) {
                    class135.method1114(8, var34.field372);
                    class142.method1156(var34.field372, (byte) 0);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field1082[--field1090];
                if (var34.field259 != var36) {
                    var34.field259 = var36;
                    var34.field375 = 0;
                    var34.field247 = 1;
                    var34.field374 = 0;
                    class200 var37 = var34.field259 == -1 ? null : class108.field1696.method1279((byte) 92, var34.field259);
                    if (var37 != null) {
                        class189.method1391(var37, 34, var34.field375);
                    }
                    class410.method2433(var34, 14049);
                }
                if (var34.field282 == -1) {
                    class39.method240(var34.field372, -90);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field411 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field1078[--field1079];
                if (!var38.equals(var34.field316)) {
                    var34.field316 = var38;
                    class410.method2433(var34, 14049);
                }
                if (var34.field282 == -1) {
                    class643.method3574(var34.field372, (byte) -63);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field350 = field1082[--field1090];
                class410.method2433(var34, 14049);
                if (var34.field282 == -1) {
                    class28.method180(var34.field372, 53);
                }
                return;
            }
            if (arg0 == 1114) {
                field1090 -= 3;
                var34.field342 = field1082[field1090];
                var34.field285 = field1082[field1090 + 1];
                var34.field407 = field1082[field1090 + 2];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1115) {
                var34.field377 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1116) {
                var34.field293 = field1082[--field1090];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1117) {
                var34.field389 = field1082[--field1090];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1118) {
                var34.field400 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1119) {
                var34.field366 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1120) {
                field1090 -= 2;
                var34.field277 = field1082[field1090];
                var34.field364 = field1082[field1090 + 1];
                class410.method2433(var34, 14049);
                if (var34.field352 == 0) {
                    class358.method2206(var34, 55, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field269 = field1082[--field1090] == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1123) {
                var34.field412 = field1082[--field1090];
                class410.method2433(var34, 14049);
                if (var34.field282 == -1) {
                    class135.method1114(8, var34.field372);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field1082[--field1090];
                var34.field286 = var39 == 1;
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1125) {
                field1090 -= 2;
                var34.field271 = field1082[field1090];
                var34.field383 = field1082[field1090 + 1];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1126) {
                var34.field304 = field1082[--field1090];
                class410.method2433(var34, 14049);
                return;
            }
            if (arg0 == 1127) {
                field1090 -= 2;
                int var40 = field1082[field1090];
                int var41 = field1082[field1090 + 1];
                class485 var42 = class117.field2153.method1159((byte) -53, var40);
                if (var42.field6560 != var41) {
                    var34.method103(var41, var40, (byte) 127);
                    return;
                }
                var34.method116((byte) -89, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field1082[--field1090];
                String var44 = field1078[--field1079];
                class485 var45 = class117.field2153.method1159((byte) -90, var43);
                if (!var45.field6554.equals(var44)) {
                    var34.method115(var43, var44, -57);
                    return;
                }
                var34.method116((byte) 106, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var52 = field1082[--field1090];
                if (var34.field352 != 5 && arg0 == 1129 || var34.field352 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field317 != var52) {
                    var34.field317 = var52;
                    class410.method2433(var34, 14049);
                }
                if (var34.field282 == -1) {
                    class770.method4233(4096, var34.field372);
                }
                return;
            }
            if (arg0 == 1131) {
                field1090 -= 3;
                int var46 = field1082[field1090];
                short var47 = (short) field1082[field1090 + 1];
                short var48 = (short) field1082[field1090 + 2];
                if (var46 >= 0 && var46 < 5) {
                    var34.method104(var46, var47, (byte) 97, var48);
                    class410.method2433(var34, 14049);
                    if (var34.field282 == -1) {
                        class65.method471((byte) -91, var34.field372, var46);
                    }
                    return;
                }
                return;
            }
            if (arg0 == 1132) {
                field1090 -= 3;
                int var49 = field1082[field1090];
                short var50 = (short) field1082[field1090 + 1];
                short var51 = (short) field1082[field1090 + 2];
                if (var49 >= 0 && var49 < 5) {
                    var34.method99(var51, var50, var49, -8);
                    class410.method2433(var34, 14049);
                    if (var34.field282 == -1) {
                        class252.method1658(var34.field372, 21, var49);
                    }
                    return;
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class17 var53;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var53 = class379.method2309(field1082[--field1090], 192);
            } else {
                var53 = arg1 ? field1097 : field1084;
            }
            class410.method2433(var53, 14049);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1090 -= 2;
                int var54 = field1082[field1090];
                int var55 = field1082[field1090 + 1];
                if (var53.field282 == -1) {
                    class596.method3395(var53.field372, (byte) 95);
                    class135.method1114(8, var53.field372);
                    class142.method1156(var53.field372, (byte) 0);
                }
                if (var54 == -1) {
                    var53.field272 = 1;
                    var53.field339 = -1;
                    var53.field355 = -1;
                    return;
                }
                var53.field355 = var54;
                var53.field279 = var55;
                if (arg0 == 1208 || arg0 == 1209) {
                    var53.field257 = true;
                } else {
                    var53.field257 = false;
                }
                class730 var56 = class143.field2427.method1410((byte) 74, var54);
                var53.field295 = var56.field10051;
                var53.field414 = var56.field10026;
                var53.field399 = var56.field10049;
                var53.field326 = var56.field10021;
                var53.field313 = var56.field10057;
                var53.field412 = var56.field10075;
                if (arg0 == 1205 || arg0 == 1209) {
                    var53.field280 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var53.field280 = 1;
                } else {
                    var53.field280 = 2;
                }
                if (var53.field381 > 0) {
                    var53.field412 = var53.field412 * 32 / var53.field381;
                    return;
                }
                if (var53.field376 > 0) {
                    var53.field412 = var53.field412 * 32 / var53.field376;
                }
                return;
            }
            if (arg0 == 1201) {
                var53.field272 = 2;
                var53.field339 = field1082[--field1090];
                if (var53.field282 == -1) {
                    class20.method136(4, var53.field372);
                }
                return;
            }
            if (arg0 == 1202) {
                var53.field272 = 3;
                var53.field339 = -1;
                if (var53.field282 == -1) {
                    class20.method136(4, var53.field372);
                }
                return;
            }
            if (arg0 == 1203) {
                var53.field272 = 6;
                var53.field339 = field1082[--field1090];
                if (var53.field282 == -1) {
                    class20.method136(4, var53.field372);
                }
                return;
            }
            if (arg0 == 1204) {
                var53.field272 = 5;
                var53.field339 = field1082[--field1090];
                if (var53.field282 == -1) {
                    class20.method136(4, var53.field372);
                }
                return;
            }
            if (arg0 == 1206) {
                field1090 -= 4;
                var53.field354 = field1082[field1090];
                var53.field390 = field1082[field1090 + 1];
                var53.field251 = field1082[field1090 + 2];
                var53.field385 = field1082[field1090 + 3];
                class410.method2433(var53, 14049);
                return;
            }
            if (arg0 == 1207) {
                field1090 -= 2;
                var53.field308 = field1082[field1090];
                var53.field378 = field1082[field1090 + 1];
                class410.method2433(var53, 14049);
                return;
            }
            if (arg0 == 1210) {
                field1090 -= 4;
                var53.field339 = field1082[field1090];
                var53.field276 = field1082[field1090 + 1];
                if (field1082[field1090 + 2] == 1) {
                    var53.field272 = 9;
                } else {
                    var53.field272 = 8;
                }
                if (field1082[field1090 + 3] == 1) {
                    var53.field257 = true;
                } else {
                    var53.field257 = false;
                }
                if (var53.field282 == -1) {
                    class20.method136(4, var53.field372);
                }
                return;
            }
            if (arg0 == 1211) {
                var53.field272 = 5;
                var53.field339 = class483.field6533;
                var53.field276 = 0;
                if (var53.field282 == -1) {
                    class20.method136(4, var53.field372);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class17 var57;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var57 = class379.method2309(field1082[--field1090], 192);
            } else {
                var57 = arg1 ? field1097 : field1084;
            }
            if (arg0 == 1300) {
                int var58 = field1082[--field1090] - 1;
                if (var58 >= 0 && var58 <= 9) {
                    var57.method100(field1078[--field1079], -1034, var58);
                    return;
                }
                field1079--;
                return;
            }
            if (arg0 == 1301) {
                field1090 -= 2;
                int var59 = field1082[field1090];
                int var60 = field1082[field1090 + 1];
                if (var59 == -1 && var60 == -1) {
                    var57.field331 = null;
                    return;
                }
                var57.field331 = class326.method2066(var60, var59, 101);
                return;
            }
            if (arg0 == 1302) {
                int var61 = field1082[--field1090];
                if (class172.field2739 != var61 && class625.field8713 != var61 && class715.field9844 != var61) {
                    return;
                }
                var57.field406 = var61;
                return;
            }
            if (arg0 == 1303) {
                var57.field307 = field1082[--field1090];
                return;
            }
            if (arg0 == 1304) {
                var57.field373 = field1082[--field1090];
                return;
            }
            if (arg0 == 1305) {
                var57.field328 = field1078[--field1079];
                return;
            }
            if (arg0 == 1306) {
                var57.field291 = field1078[--field1079];
                return;
            }
            if (arg0 == 1307) {
                var57.field324 = null;
                return;
            }
            if (arg0 == 1308) {
                var57.field348 = field1082[--field1090];
                var57.field357 = field1082[--field1090];
                return;
            }
            if (arg0 == 1309) {
                int var62 = field1082[--field1090];
                int var63 = field1082[--field1090];
                if (var63 >= 1 && var63 <= 10) {
                    var57.method112(var63 - 1, var62, -63);
                }
                return;
            }
            if (arg0 == 1310) {
                var57.field284 = field1078[--field1079];
                return;
            }
            if (arg0 == 1311) {
                var57.field391 = field1082[--field1090];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var64;
                int var65;
                int var66;
                if (arg0 == 1312) {
                    field1090 -= 3;
                    var64 = field1082[field1090] - 1;
                    var65 = field1082[field1090 + 1];
                    var66 = field1082[field1090 + 2];
                    if (var64 < 0 || var64 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1090 -= 2;
                    var64 = 10;
                    var65 = field1082[field1090];
                    var66 = field1082[field1090 + 1];
                }
                if (var57.field397 == null) {
                    if (var65 == 0) {
                        return;
                    }
                    var57.field397 = new byte[11];
                    var57.field283 = new byte[11];
                    var57.field409 = new int[11];
                }
                var57.field397[var64] = (byte) var65;
                if (var65 == 0) {
                    var57.field323 = false;
                    for (int var67 = 0; var67 < var57.field397.length; var67++) {
                        if (var57.field397[var67] != 0) {
                            var57.field323 = true;
                            break;
                        }
                    }
                } else {
                    var57.field323 = true;
                }
                var57.field283[var64] = (byte) var66;
                return;
            }
            if (arg0 == 1314) {
                var57.field327 = field1082[--field1090];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class17 var68;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var68 = class379.method2309(field1082[--field1090], 192);
            } else {
                var68 = arg1 ? field1097 : field1084;
            }
            if (arg0 == 1499) {
                var68.method117(false);
                return;
            }
            String var69 = field1078[--field1079];
            int[] var70 = null;
            if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                int var71 = field1082[--field1090];
                if (var71 > 0) {
                    var70 = new int[var71];
                    while (var71-- > 0) {
                        var70[var71] = field1082[--field1090];
                    }
                }
                var69 = var69.substring(0, var69.length() - 1);
            }
            Object[] var72 = new Object[var69.length() + 1];
            for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                if (var69.charAt(var73 - 1) == 's') {
                    var72[var73] = field1078[--field1079];
                } else if (var69.charAt(var73 - 1) == '§') {
                    var72[var73] = Long.valueOf(field1095[--field1073]);
                } else {
                    var72[var73] = Integer.valueOf(field1082[--field1090]);
                }
            }
            int var74 = field1082[--field1090];
            if (var74 == -1) {
                var72 = null;
            } else {
                var72[0] = Integer.valueOf(var74);
            }
            if (arg0 == 1400) {
                var68.field289 = var72;
            } else if (arg0 == 1401) {
                var68.field401 = var72;
            } else if (arg0 == 1402) {
                var68.field270 = var72;
            } else if (arg0 == 1403) {
                var68.field309 = var72;
            } else if (arg0 == 1404) {
                var68.field311 = var72;
            } else if (arg0 == 1405) {
                var68.field287 = var72;
            } else if (arg0 == 1406) {
                var68.field363 = var72;
            } else if (arg0 == 1407) {
                var68.field255 = var72;
                var68.field382 = var70;
            } else if (arg0 == 1408) {
                var68.field353 = var72;
            } else if (arg0 == 1409) {
                var68.field246 = var72;
            } else if (arg0 == 1410) {
                var68.field262 = var72;
            } else if (arg0 == 1411) {
                var68.field268 = var72;
            } else if (arg0 == 1412) {
                var68.field333 = var72;
            } else if (arg0 == 1414) {
                var68.field403 = var72;
                var68.field343 = var70;
            } else if (arg0 == 1415) {
                var68.field371 = var72;
                var68.field305 = var70;
            } else if (arg0 == 1416) {
                var68.field329 = var72;
            } else if (arg0 == 1417) {
                var68.field360 = var72;
            } else if (arg0 == 1418) {
                var68.field358 = var72;
            } else if (arg0 == 1419) {
                var68.field300 = var72;
            } else if (arg0 == 1420) {
                var68.field250 = var72;
            } else if (arg0 == 1421) {
                var68.field369 = var72;
            } else if (arg0 == 1422) {
                var68.field346 = var72;
            } else if (arg0 == 1423) {
                var68.field322 = var72;
            } else if (arg0 == 1424) {
                var68.field340 = var72;
            } else if (arg0 == 1425) {
                var68.field349 = var72;
            } else if (arg0 == 1426) {
                var68.field296 = var72;
            } else if (arg0 == 1427) {
                var68.field380 = var72;
            } else if (arg0 == 1428) {
                var68.field258 = var72;
                var68.field345 = var70;
            } else if (arg0 == 1429) {
                var68.field361 = var72;
                var68.field367 = var70;
            } else if (arg0 == 1430) {
                var68.field306 = var72;
            } else if (arg0 == 1431) {
                var68.field319 = var72;
            } else if (arg0 == 1432) {
                var68.field393 = var72;
            }
            var68.field256 = true;
            return;
        } else if (arg0 < 1600) {
            class17 var75 = arg1 ? field1097 : field1084;
            if (arg0 == 1500) {
                field1082[field1090++] = var75.field248;
                return;
            }
            if (arg0 == 1501) {
                field1082[field1090++] = var75.field416;
                return;
            }
            if (arg0 == 1502) {
                field1082[field1090++] = var75.field347;
                return;
            }
            if (arg0 == 1503) {
                field1082[field1090++] = var75.field330;
                return;
            }
            if (arg0 == 1504) {
                field1082[field1090++] = var75.field404 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field1082[field1090++] = var75.field336;
                return;
            }
            if (arg0 == 1506) {
                class17 var76 = class533.method3020(var75, (byte) -50);
                field1082[field1090++] = var76 == null ? -1 : var76.field372;
                return;
            }
        } else if (arg0 < 1700) {
            class17 var77 = arg1 ? field1097 : field1084;
            if (arg0 == 1600) {
                field1082[field1090++] = var77.field252;
                return;
            }
            if (arg0 == 1601) {
                field1082[field1090++] = var77.field362;
                return;
            }
            if (arg0 == 1602) {
                field1078[field1079++] = var77.field316;
                return;
            }
            if (arg0 == 1603) {
                field1082[field1090++] = var77.field277;
                return;
            }
            if (arg0 == 1604) {
                field1082[field1090++] = var77.field364;
                return;
            }
            if (arg0 == 1605) {
                field1082[field1090++] = var77.field412;
                return;
            }
            if (arg0 == 1606) {
                field1082[field1090++] = var77.field295;
                return;
            }
            if (arg0 == 1607) {
                field1082[field1090++] = var77.field399;
                return;
            }
            if (arg0 == 1608) {
                field1082[field1090++] = var77.field414;
                return;
            }
            if (arg0 == 1609) {
                field1082[field1090++] = var77.field245;
                return;
            }
            if (arg0 == 1610) {
                field1082[field1090++] = var77.field326;
                return;
            }
            if (arg0 == 1611) {
                field1082[field1090++] = var77.field313;
                return;
            }
            if (arg0 == 1612) {
                field1082[field1090++] = var77.field303;
                return;
            }
            if (arg0 == 1613) {
                int var78 = field1082[--field1090];
                class485 var79 = class117.field2153.method1159((byte) -57, var78);
                if (var79.method2776((byte) 114)) {
                    field1078[field1079++] = var77.method111(var78, -1, var79.field6554);
                    return;
                }
                field1082[field1090++] = var77.method114(var78, 6, var79.field6560);
                return;
            }
            if (arg0 == 1614) {
                field1082[field1090++] = var77.field298;
                return;
            }
            if (arg0 == 2614) {
                field1082[field1090++] = var77.field272 == 1 ? var77.field339 : -1;
                return;
            }
        } else if (arg0 < 1800) {
            class17 var80 = arg1 ? field1097 : field1084;
            if (arg0 == 1700) {
                field1082[field1090++] = var80.field355;
                return;
            }
            if (arg0 == 1701) {
                if (var80.field355 != -1) {
                    field1082[field1090++] = var80.field279;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field1082[field1090++] = var80.field282;
                return;
            }
        } else if (arg0 < 1900) {
            class17 var81 = arg1 ? field1097 : field1084;
            if (arg0 == 1800) {
                field1082[field1090++] = client.method2010(var81).method3889(true);
                return;
            }
            if (arg0 == 1801) {
                int var82 = field1082[--field1090];
                int var383 = var82 - 1;
                if (var81.field324 != null && var383 < var81.field324.length && var81.field324[var383] != null) {
                    field1078[field1079++] = var81.field324[var383];
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var81.field328 == null) {
                    field1078[field1079++] = "";
                    return;
                }
                field1078[field1079++] = var81.field328;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class17 var381;
            if (arg0 >= 2000) {
                var381 = class379.method2309(field1082[--field1090], 192);
                arg0 -= 1000;
            } else {
                var381 = arg1 ? field1097 : field1084;
            }
            if (field1104 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var381.field380 == null) {
                    return;
                }
                class255 var382 = new class255();
                var382.field3583 = var381;
                var382.field3586 = var381.field380;
                var382.field3593 = field1104 + 1;
                class7.field124.method3594((byte) 103, var382);
                return;
            }
        } else if (arg0 < 2600) {
            class17 var83 = class379.method2309(field1082[--field1090], 192);
            if (arg0 == 2500) {
                field1082[field1090++] = var83.field248;
                return;
            }
            if (arg0 == 2501) {
                field1082[field1090++] = var83.field416;
                return;
            }
            if (arg0 == 2502) {
                field1082[field1090++] = var83.field347;
                return;
            }
            if (arg0 == 2503) {
                field1082[field1090++] = var83.field330;
                return;
            }
            if (arg0 == 2504) {
                field1082[field1090++] = var83.field404 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field1082[field1090++] = var83.field336;
                return;
            }
            if (arg0 == 1506) {
                class17 var84 = class533.method3020(var83, (byte) -50);
                field1082[field1090++] = var84 == null ? -1 : var84.field372;
                return;
            }
        } else if (arg0 < 2700) {
            class17 var85 = class379.method2309(field1082[--field1090], 192);
            if (arg0 == 2600) {
                field1082[field1090++] = var85.field252;
                return;
            }
            if (arg0 == 2601) {
                field1082[field1090++] = var85.field362;
                return;
            }
            if (arg0 == 2602) {
                field1078[field1079++] = var85.field316;
                return;
            }
            if (arg0 == 2603) {
                field1082[field1090++] = var85.field277;
                return;
            }
            if (arg0 == 2604) {
                field1082[field1090++] = var85.field364;
                return;
            }
            if (arg0 == 2605) {
                field1082[field1090++] = var85.field412;
                return;
            }
            if (arg0 == 2606) {
                field1082[field1090++] = var85.field295;
                return;
            }
            if (arg0 == 2607) {
                field1082[field1090++] = var85.field399;
                return;
            }
            if (arg0 == 2608) {
                field1082[field1090++] = var85.field414;
                return;
            }
            if (arg0 == 2609) {
                field1082[field1090++] = var85.field245;
                return;
            }
            if (arg0 == 2610) {
                field1082[field1090++] = var85.field326;
                return;
            }
            if (arg0 == 2611) {
                field1082[field1090++] = var85.field313;
                return;
            }
            if (arg0 == 2612) {
                field1082[field1090++] = var85.field303;
                return;
            }
            if (arg0 == 2613) {
                field1082[field1090++] = var85.field298;
                return;
            }
            if (arg0 == 2614) {
                field1082[field1090++] = var85.field272 == 1 ? var85.field339 : -1;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class17 var86 = class379.method2309(field1082[--field1090], 192);
                field1082[field1090++] = var86.field355;
                return;
            }
            if (arg0 == 2701) {
                class17 var87 = class379.method2309(field1082[--field1090], 192);
                if (var87.field355 != -1) {
                    field1082[field1090++] = var87.field279;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var88 = field1082[--field1090];
                class637 var89 = (class637) class186.field2881.method337((long) var88, 1);
                if (var89 != null) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class17 var90 = class379.method2309(field1082[--field1090], 192);
                if (var90.field320 == null) {
                    field1082[field1090++] = 0;
                    return;
                }
                int var91 = var90.field320.length;
                for (int var92 = 0; var92 < var90.field320.length; var92++) {
                    if (var90.field320[var92] == null) {
                        var91 = var92;
                        break;
                    }
                }
                field1082[field1090++] = var91;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field1090 -= 2;
                int var93 = field1082[field1090];
                int var94 = field1082[field1090 + 1];
                class637 var95 = (class637) class186.field2881.method337((long) var93, 1);
                if (var95 != null && var95.field8789 == var94) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class17 var96 = class379.method2309(field1082[--field1090], 192);
            if (arg0 == 2800) {
                field1082[field1090++] = client.method2010(var96).method3889(true);
                return;
            }
            if (arg0 == 2801) {
                int var97 = field1082[--field1090];
                int var384 = var97 - 1;
                if (var96.field324 != null && var384 < var96.field324.length && var96.field324[var384] != null) {
                    field1078[field1079++] = var96.field324[var384];
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var96.field328 == null) {
                    field1078[field1079++] = "";
                    return;
                }
                field1078[field1079++] = var96.field328;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var98 = field1078[--field1079];
                class478.method2736(var98, 0);
                return;
            }
            if (arg0 == 3101) {
                field1090 -= 2;
                class395.method2389(field1082[field1090], field1082[field1090 + 1], class235.field3379, false);
                return;
            }
            if (arg0 == 3103) {
                class650.method3642(true, 27373);
                return;
            }
            if (arg0 == 3104) {
                String var99 = field1078[--field1079];
                int var100 = 0;
                if (class454.method2625(10, var99)) {
                    var100 = class287.method1832(-111, var99);
                }
                field1099++;
                class537 var101 = class476.method2729(class657.field9098, (byte) -46, class551.field7498);
                var101.field7295.method759(var100, -109);
                class173.method1314(false, var101);
                return;
            }
            if (arg0 == 3105) {
                String var102 = field1078[--field1079];
                field1096++;
                class537 var103 = class476.method2729(class320.field4371, (byte) -46, class551.field7498);
                var103.field7295.method754(var102.length() + 1, 106);
                var103.field7295.method783((byte) 8, var102);
                class173.method1314(false, var103);
                return;
            }
            if (arg0 == 3106) {
                String var104 = field1078[--field1079];
                field1081++;
                class537 var105 = class476.method2729(class118.field2175, (byte) -46, class551.field7498);
                var105.field7295.method754(var104.length() + 1, 124);
                var105.field7295.method783((byte) 109, var104);
                class173.method1314(false, var105);
                return;
            }
            if (arg0 == 3107) {
                int var106 = field1082[--field1090];
                String var107 = field1078[--field1079];
                class622.method3512(var106, -9, var107);
                return;
            }
            if (arg0 == 3108) {
                field1090 -= 3;
                int var108 = field1082[field1090];
                int var109 = field1082[field1090 + 1];
                int var110 = field1082[field1090 + 2];
                class17 var111 = class379.method2309(var110, 192);
                class330.method2082(var109, (byte) 48, var108, var111);
                return;
            }
            if (arg0 == 3109) {
                field1090 -= 2;
                int var112 = field1082[field1090];
                int var113 = field1082[field1090 + 1];
                class17 var114 = arg1 ? field1097 : field1084;
                class330.method2082(var113, (byte) 48, var112, var114);
                return;
            }
            if (arg0 == 3110) {
                int var115 = field1082[--field1090];
                field1075++;
                class537 var116 = class476.method2729(class234.field3370, (byte) -46, class551.field7498);
                var116.field7295.method781(29, var115);
                class173.method1314(false, var116);
                return;
            }
            if (arg0 == 3111) {
                field1090 -= 2;
                int var117 = field1082[field1090];
                int var118 = field1082[field1090 + 1];
                class637 var119 = (class637) class186.field2881.method337((long) var117, 1);
                if (var119 != null) {
                    class305.method1954(var119.field8789 != var118, var119, true, (byte) -24);
                }
                class496.method2844(var118, true, 3, var117, (byte) 118);
                return;
            }
            if (arg0 == 3112) {
                field1090--;
                int var120 = field1082[field1090];
                class637 var121 = (class637) class186.field2881.method337((long) var120, 1);
                if (var121 != null && var121.field8790 == 3) {
                    class305.method1954(true, var121, true, (byte) -24);
                }
                return;
            }
            if (arg0 == 3113) {
                class724.method4020(67, field1078[--field1079]);
                return;
            }
            if (arg0 == 3114) {
                field1090 -= 2;
                int var122 = field1082[field1090];
                int var123 = field1082[field1090 + 1];
                String var124 = field1078[--field1079];
                class648.method3634(var122, var124, (byte) -13, "", "", var123, "");
                return;
            }
            if (arg0 == 3115) {
                field1090 -= 11;
                class528[] var125 = class405.method2421((byte) -115);
                class494[] var126 = class74.method638(-67);
                class563.method3258(var125[field1082[field1090]], field1082[field1090 + 7], field1082[field1090 + 6], field1082[field1090 + 10], var126[field1082[field1090 + 1]], field1082[field1090 + 4], field1082[field1090 + 3], 20305, field1082[field1090 + 9], field1082[field1090 + 8], field1082[field1090 + 2], field1082[field1090 + 5]);
                return;
            }
            if (arg0 == 3116) {
                int var127 = field1082[--field1090];
                field1099++;
                class537 var128 = class476.method2729(class138.field2362, (byte) -46, class551.field7498);
                var128.field7295.method781(122, var127);
                class173.method1314(false, var128);
                return;
            }
            if (arg0 == 3117) {
                String var129 = field1078[--field1079];
                class537 var130 = class476.method2729(class100.field1621, (byte) -46, class551.field7498);
                var130.field7295.method754(var129.length() + 1, 100);
                var130.field7295.method783((byte) 121, var129);
                class173.method1314(false, var130);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field1090 -= 3;
                class16.method95(true, field1082[field1090 + 1], field1082[field1090], field1082[field1090 + 2], 255, 256);
                return;
            }
            if (arg0 == 3201) {
                class129.method1097(255, -9274, field1082[--field1090], 50);
                return;
            }
            if (arg0 == 3202) {
                field1090 -= 2;
                class648.method3637(field1082[field1090 + 1], 6862, 255, field1082[field1090]);
                return;
            }
            if (arg0 == 3203) {
                field1090 -= 4;
                class16.method95(true, field1082[field1090 + 1], field1082[field1090], field1082[field1090 + 2], field1082[field1090 + 3], 256);
                return;
            }
            if (arg0 == 3204) {
                field1090 -= 3;
                class129.method1097(field1082[field1090 + 1], -9274, field1082[field1090], field1082[field1090 + 2]);
                return;
            }
            if (arg0 == 3205) {
                field1090 -= 3;
                class648.method3637(field1082[field1090 + 1], 6862, field1082[field1090 + 2], field1082[field1090]);
                return;
            }
            if (arg0 == 3206) {
                field1090 -= 4;
                class47.method345(field1082[field1090 + 3], field1082[field1090 + 1], field1082[field1090], field1082[field1090 + 2], -123, 256, false);
                return;
            }
            if (arg0 == 3207) {
                field1090 -= 4;
                class47.method345(field1082[field1090 + 3], field1082[field1090 + 1], field1082[field1090], field1082[field1090 + 2], -113, 256, true);
                return;
            }
            if (arg0 == 3208) {
                field1090 -= 5;
                class16.method95(true, field1082[field1090 + 1], field1082[field1090], field1082[field1090 + 2], field1082[field1090 + 3], field1082[field1090 + 4]);
                return;
            }
            if (arg0 == 3209) {
                field1090 -= 5;
                class47.method345(field1082[field1090 + 3], field1082[field1090 + 1], field1082[field1090], field1082[field1090 + 2], -90, field1082[field1090 + 4], false);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field1082[field1090++] = class440.field5977;
                return;
            }
            if (arg0 == 3301) {
                field1090 -= 2;
                int var131 = field1082[field1090];
                int var132 = field1082[field1090 + 1];
                field1082[field1090++] = class29.method190(false, var131, 65, var132);
                return;
            }
            if (arg0 == 3302) {
                field1090 -= 2;
                int var133 = field1082[field1090];
                int var134 = field1082[field1090 + 1];
                field1082[field1090++] = class340.method2117(var133, 87, var134, false);
                return;
            }
            if (arg0 == 3303) {
                field1090 -= 2;
                int var135 = field1082[field1090];
                int var136 = field1082[field1090 + 1];
                field1082[field1090++] = class606.method3441(var136, false, var135, 32528);
                return;
            }
            if (arg0 == 3304) {
                int var137 = field1082[--field1090];
                field1082[field1090++] = class108.field1698.method3631(false, var137).field9537;
                return;
            }
            if (arg0 == 3305) {
                int var138 = field1082[--field1090];
                field1082[field1090++] = class315.field4315[var138];
                return;
            }
            if (arg0 == 3306) {
                int var139 = field1082[--field1090];
                field1082[field1090++] = class249.field3507[var139];
                return;
            }
            if (arg0 == 3307) {
                int var140 = field1082[--field1090];
                field1082[field1090++] = class109.field1708[var140];
                return;
            }
            if (arg0 == 3308) {
                byte var141 = class235.field3379.field7391;
                int var142 = (class235.field3379.field7396 >> 9) + class217.field3198;
                int var143 = (class235.field3379.field7398 >> 9) + class400.field5510;
                field1082[field1090++] = (var141 << 28) + (var142 << 14) + var143;
                return;
            }
            if (arg0 == 3309) {
                int var144 = field1082[--field1090];
                field1082[field1090++] = var144 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var145 = field1082[--field1090];
                field1082[field1090++] = var145 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var146 = field1082[--field1090];
                field1082[field1090++] = var146 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field1082[field1090++] = class295.field4033 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field1090 -= 2;
                int var147 = field1082[field1090];
                int var148 = field1082[field1090 + 1];
                field1082[field1090++] = class29.method190(true, var147, -37, var148);
                return;
            }
            if (arg0 == 3314) {
                field1090 -= 2;
                int var149 = field1082[field1090];
                int var150 = field1082[field1090 + 1];
                field1082[field1090++] = class340.method2117(var149, 105, var150, true);
                return;
            }
            if (arg0 == 3315) {
                field1090 -= 2;
                int var151 = field1082[field1090];
                int var152 = field1082[field1090 + 1];
                field1082[field1090++] = class606.method3441(var152, true, var151, 32528);
                return;
            }
            if (arg0 == 3316) {
                if (class407.field5593 >= 2) {
                    field1082[field1090++] = class407.field5593;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field1082[field1090++] = class445.field6088;
                return;
            }
            if (arg0 == 3318) {
                field1082[field1090++] = class178.field2812.field10374;
                return;
            }
            if (arg0 == 3321) {
                field1082[field1090++] = class21.field450;
                return;
            }
            if (arg0 == 3322) {
                field1082[field1090++] = class652.field9034;
                return;
            }
            if (arg0 == 3323) {
                if (class87.field1190 >= 5 && class87.field1190 <= 9) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class87.field1190 >= 5 && class87.field1190 <= 9) {
                    field1082[field1090++] = class87.field1190;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field1082[field1090++] = class790.field10829 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field1082[field1090++] = class235.field3379.field10647;
                return;
            }
            if (arg0 == 3327) {
                field1082[field1090++] = class235.field3379.field10630 != null && class235.field3379.field10630.field2095 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field1082[field1090++] = class88.field1208 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var153 = field1082[--field1090];
                field1082[field1090++] = class504.method2882(var153, false, false);
                return;
            }
            if (arg0 == 3331) {
                field1090 -= 2;
                int var154 = field1082[field1090];
                int var155 = field1082[field1090 + 1];
                field1082[field1090++] = class734.method4076(false, -65, var155, false, var154);
                return;
            }
            if (arg0 == 3332) {
                field1090 -= 2;
                int var156 = field1082[field1090];
                int var157 = field1082[field1090 + 1];
                field1082[field1090++] = class734.method4076(true, -57, var157, false, var156);
                return;
            }
            if (arg0 == 3333) {
                field1082[field1090++] = class459.field6232;
                return;
            }
            if (arg0 == 3335) {
                field1082[field1090++] = class464.field6309;
                return;
            }
            if (arg0 == 3336) {
                field1090 -= 4;
                int var158 = field1082[field1090];
                int var159 = field1082[field1090 + 1];
                int var160 = field1082[field1090 + 2];
                int var161 = field1082[field1090 + 3];
                int var162 = (var159 << 14) + var158;
                int var163 = (var160 << 28) + var162;
                int var164 = var161 + var163;
                field1082[field1090++] = var164;
                return;
            }
            if (arg0 == 3337) {
                field1082[field1090++] = class361.field4919;
                return;
            }
            if (arg0 == 3338) {
                field1082[field1090++] = class676.method3817(10000);
                return;
            }
            if (arg0 == 3339) {
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3340) {
                field1082[field1090++] = class29.field539 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field1082[field1090++] = class258.field3619 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field1082[field1090++] = class420.field5727.method1326((byte) 100);
                return;
            }
            if (arg0 == 3343) {
                field1082[field1090++] = class420.field5727.method1319((byte) 126);
                return;
            }
            if (arg0 == 3344) {
                field1078[field1079++] = class564.method3261(-1);
                return;
            }
            if (arg0 == 3345) {
                field1078[field1079++] = class202.method1448(-88);
                return;
            }
            if (arg0 == 3346) {
                field1082[field1090++] = class758.method4196(true);
                return;
            }
            if (arg0 == 3347) {
                field1082[field1090++] = class110.field1715;
                return;
            }
            if (arg0 == 3349) {
                field1082[field1090++] = class235.field3379.field5246.method1062(false) >> 3;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field1090 -= 2;
                int var165 = field1082[field1090];
                int var166 = field1082[field1090 + 1];
                class84 var167 = class415.field5687.method2058(var165, 102);
                field1078[field1079++] = var167.method677(var166, -6);
                return;
            }
            if (arg0 == 3408) {
                field1090 -= 4;
                int var168 = field1082[field1090];
                int var169 = field1082[field1090 + 1];
                int var170 = field1082[field1090 + 2];
                int var171 = field1082[field1090 + 3];
                class84 var172 = class415.field5687.method2058(var170, 108);
                if (var172.field1141 == var168 && var172.field1145 == var169) {
                    if (var169 == 115) {
                        field1078[field1079++] = var172.method677(var171, -6);
                        return;
                    }
                    field1082[field1090++] = var172.method675((byte) -34, var171);
                    return;
                }
                throw new RuntimeException("C3408-1 " + var170 + "-" + var171);
            }
            if (arg0 == 3409) {
                field1090 -= 3;
                int var173 = field1082[field1090];
                int var174 = field1082[field1090 + 1];
                int var175 = field1082[field1090 + 2];
                if (var174 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class84 var176 = class415.field5687.method2058(var174, 90);
                if (var176.field1145 != var173) {
                    throw new RuntimeException("C3409-1");
                }
                field1082[field1090++] = var176.method680(var175, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var177 = field1082[--field1090];
                String var178 = field1078[--field1079];
                if (var177 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class84 var179 = class415.field5687.method2058(var177, 122);
                if (var179.field1145 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field1082[field1090++] = var179.method678((byte) 92, var178) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var180 = field1082[--field1090];
                class84 var181 = class415.field5687.method2058(var180, 73);
                field1082[field1090++] = var181.field1153.method343(49);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class724.field9958 == 0) {
                    field1082[field1090++] = -2;
                    return;
                }
                if (class724.field9958 == 1) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = class749.field10345;
                return;
            }
            if (arg0 == 3601) {
                int var182 = field1082[--field1090];
                if (class724.field9958 == 2 && var182 < class749.field10345) {
                    field1078[field1079++] = class463.field6303[var182];
                    if (class392.field5378[var182] != null) {
                        field1078[field1079++] = class392.field5378[var182];
                        return;
                    }
                    field1078[field1079++] = "";
                    return;
                }
                field1078[field1079++] = "";
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var183 = field1082[--field1090];
                if (class724.field9958 == 2 && var183 < class749.field10345) {
                    field1082[field1090++] = class759.field10458[var183];
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var184 = field1082[--field1090];
                if (class724.field9958 == 2 && var184 < class749.field10345) {
                    field1082[field1090++] = class164.field2650[var184];
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var185 = field1078[--field1079];
                int var186 = field1082[--field1090];
                class538.method3043(var186, var185, (byte) 95);
                return;
            }
            if (arg0 == 3605) {
                String var187 = field1078[--field1079];
                class656.method3690((byte) -124, var187);
                return;
            }
            if (arg0 == 3606) {
                String var188 = field1078[--field1079];
                class58.method409((byte) -78, var188);
                return;
            }
            if (arg0 == 3607) {
                String var189 = field1078[--field1079];
                class600.method3405(false, true, var189);
                return;
            }
            if (arg0 == 3608) {
                String var190 = field1078[--field1079];
                class12.method70(116, var190);
                return;
            }
            if (arg0 == 3609) {
                String var191 = field1078[--field1079];
                if (var191.startsWith("<img=0>") || var191.startsWith("<img=1>")) {
                    var191 = var191.substring(7);
                }
                field1082[field1090++] = class626.method3527((byte) -124, var191) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var192 = field1082[--field1090];
                if (class724.field9958 == 2 && var192 < class749.field10345) {
                    field1078[field1079++] = class389.field5347[var192];
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class21.field458 != null) {
                    field1078[field1079++] = class16.method93((byte) 117, class21.field458);
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class21.field458 != null) {
                    field1082[field1090++] = class683.field9510;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var193 = field1082[--field1090];
                if (class21.field458 != null && var193 < class683.field9510) {
                    field1078[field1079++] = class502.field6862[var193].field3523;
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var194 = field1082[--field1090];
                if (class21.field458 != null && var194 < class683.field9510) {
                    field1082[field1090++] = class502.field6862[var194].field3525;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var195 = field1082[--field1090];
                if (class21.field458 != null && var195 < class683.field9510) {
                    field1082[field1090++] = class502.field6862[var195].field3522;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field1082[field1090++] = class709.field9743;
                return;
            }
            if (arg0 == 3617) {
                String var196 = field1078[--field1079];
                class202.method1449(var196, (byte) 58);
                return;
            }
            if (arg0 == 3618) {
                field1082[field1090++] = class228.field3328;
                return;
            }
            if (arg0 == 3619) {
                String var197 = field1078[--field1079];
                class415.method2450(var197, -2015);
                return;
            }
            if (arg0 == 3620) {
                class195.method1416((byte) -100);
                return;
            }
            if (arg0 == 3621) {
                if (class724.field9958 == 0) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = class766.field10564;
                return;
            }
            if (arg0 == 3622) {
                int var198 = field1082[--field1090];
                if (class724.field9958 != 0 && var198 < class766.field10564) {
                    field1078[field1079++] = class174.field2766[var198];
                    if (class707.field9726[var198] != null) {
                        field1078[field1079++] = class707.field9726[var198];
                        return;
                    }
                    field1078[field1079++] = "";
                    return;
                }
                field1078[field1079++] = "";
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var199 = field1078[--field1079];
                if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                    var199 = var199.substring(7);
                }
                field1082[field1090++] = class441.method2569(var199, false) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var200 = field1082[--field1090];
                if (class502.field6862 != null && var200 < class683.field9510 && class502.field6862[var200].field3520.equalsIgnoreCase(class235.field3379.field10641)) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class476.field6435 != null) {
                    field1078[field1079++] = class476.field6435;
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var201 = field1082[--field1090];
                if (class21.field458 != null && var201 < class683.field9510) {
                    field1078[field1079++] = class502.field6862[var201].field3521;
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var202 = field1082[--field1090];
                if (class724.field9958 == 2 && var202 >= 0 && var202 < class749.field10345) {
                    field1082[field1090++] = class548.field7453[var202] ? 1 : 0;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var203 = field1078[--field1079];
                if (var203.startsWith("<img=0>") || var203.startsWith("<img=1>")) {
                    var203 = var203.substring(7);
                }
                field1082[field1090++] = class711.method3957(-18884, var203);
                return;
            }
            if (arg0 == 3629) {
                field1082[field1090++] = class520.field7057;
                return;
            }
            if (arg0 == 3630) {
                String var204 = field1078[--field1079];
                class600.method3405(true, true, var204);
                return;
            }
            if (arg0 == 3631) {
                int var205 = field1082[--field1090];
                field1082[field1090++] = class766.field10567[var205] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var206 = field1082[--field1090];
                if (class21.field458 != null && var206 < class683.field9510) {
                    field1078[field1079++] = class502.field6862[var206].field3520;
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var207 = field1082[--field1090];
                if (class724.field9958 != 0 && var207 < class766.field10564) {
                    field1078[field1079++] = class603.field8439[var207];
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
        } else if (arg0 < 3800) {
            if (arg0 == 3700) {
                if (class554.field7831 != null) {
                    field1082[field1090++] = 1;
                    field1076 = class554.field7831;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3701) {
                if (class601.field8410 != null) {
                    field1082[field1090++] = 1;
                    field1076 = class601.field8410;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3702) {
                field1078[field1079++] = field1076.field3891;
                return;
            }
            if (arg0 == 3703) {
                field1082[field1090++] = field1076.field3894 ? 1 : 0;
                return;
            }
            if (arg0 == 3704) {
                field1082[field1090++] = field1076.field3897;
                return;
            }
            if (arg0 == 3705) {
                field1082[field1090++] = field1076.field3864;
                return;
            }
            if (arg0 == 3706) {
                field1082[field1090++] = field1076.field3866;
                return;
            }
            if (arg0 == 3707) {
                field1082[field1090++] = field1076.field3870;
                return;
            }
            if (arg0 == 3709) {
                field1082[field1090++] = field1076.field3895;
                return;
            }
            if (arg0 == 3710) {
                int var208 = field1082[--field1090];
                field1078[field1079++] = field1076.field3884[var208];
                return;
            }
            if (arg0 == 3711) {
                int var209 = field1082[--field1090];
                field1082[field1090++] = field1076.field3875[var209];
                return;
            }
            if (arg0 == 3712) {
                field1082[field1090++] = field1076.field3890;
                return;
            }
            if (arg0 == 3713) {
                int var210 = field1082[--field1090];
                field1078[field1079++] = field1076.field3861[var210];
                return;
            }
            if (arg0 == 3714) {
                field1090 -= 3;
                int var211 = field1082[field1090];
                int var212 = field1082[field1090 + 1];
                int var213 = field1082[field1090 + 2];
                field1082[field1090++] = field1076.method1807(var213, -108, var211, var212);
                return;
            }
            if (arg0 == 3715) {
                field1082[field1090++] = field1076.field3869;
                return;
            }
            if (arg0 == 3716) {
                field1082[field1090++] = field1076.field3872;
                return;
            }
            if (arg0 == 3750) {
                if (class55.field784 != null) {
                    field1082[field1090++] = 1;
                    field1077 = class55.field784;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3751) {
                if (class402.field5525 != null) {
                    field1082[field1090++] = 1;
                    field1077 = class402.field5525;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 3752) {
                field1078[field1079++] = field1077.field3728;
                return;
            }
            if (arg0 == 3753) {
                field1082[field1090++] = field1077.field3727;
                return;
            }
            if (arg0 == 3754) {
                field1082[field1090++] = field1077.field3741;
                return;
            }
            if (arg0 == 3755) {
                field1082[field1090++] = field1077.field3732;
                return;
            }
            if (arg0 == 3756) {
                int var214 = field1082[--field1090];
                field1078[field1079++] = field1077.field3737[var214].field9601;
                return;
            }
            if (arg0 == 3757) {
                int var215 = field1082[--field1090];
                field1082[field1090++] = field1077.field3737[var215].field9610;
                return;
            }
            if (arg0 == 3758) {
                int var216 = field1082[--field1090];
                field1082[field1090++] = field1077.field3737[var216].field9599;
                return;
            }
            if (arg0 == 3759) {
                int var217 = field1082[--field1090];
                class533.method3023(field1077 == class402.field5525, var217, (byte) -34);
                return;
            }
            if (arg0 == 3760) {
                field1082[field1090++] = field1077.method1730(field1078[--field1079], 20);
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var218 = field1082[--field1090];
                field1082[field1090++] = class761.field10484[var218].method1045((byte) 42);
                return;
            }
            if (arg0 == 3904) {
                int var219 = field1082[--field1090];
                field1082[field1090++] = class761.field10484[var219].field2164;
                return;
            }
            if (arg0 == 3905) {
                int var220 = field1082[--field1090];
                field1082[field1090++] = class761.field10484[var220].field2168;
                return;
            }
            if (arg0 == 3906) {
                int var221 = field1082[--field1090];
                field1082[field1090++] = class761.field10484[var221].field2165;
                return;
            }
            if (arg0 == 3907) {
                int var222 = field1082[--field1090];
                field1082[field1090++] = class761.field10484[var222].field2174;
                return;
            }
            if (arg0 == 3908) {
                int var223 = field1082[--field1090];
                field1082[field1090++] = class761.field10484[var223].field2163;
                return;
            }
            if (arg0 == 3910) {
                int var224 = field1082[--field1090];
                int var225 = class761.field10484[var224].method1046(0);
                field1082[field1090++] = var225 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var226 = field1082[--field1090];
                int var227 = class761.field10484[var226].method1046(0);
                field1082[field1090++] = var227 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var228 = field1082[--field1090];
                int var229 = class761.field10484[var228].method1046(0);
                field1082[field1090++] = var229 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var230 = field1082[--field1090];
                int var231 = class761.field10484[var230].method1046(0);
                field1082[field1090++] = var231 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field1090 -= 2;
                int var232 = field1082[field1090];
                int var233 = field1082[field1090 + 1];
                field1082[field1090++] = var232 + var233;
                return;
            }
            if (arg0 == 4001) {
                field1090 -= 2;
                int var234 = field1082[field1090];
                int var235 = field1082[field1090 + 1];
                field1082[field1090++] = var234 - var235;
                return;
            }
            if (arg0 == 4002) {
                field1090 -= 2;
                int var236 = field1082[field1090];
                int var237 = field1082[field1090 + 1];
                field1082[field1090++] = var236 * var237;
                return;
            }
            if (arg0 == 4003) {
                field1090 -= 2;
                int var238 = field1082[field1090];
                int var239 = field1082[field1090 + 1];
                field1082[field1090++] = var238 / var239;
                return;
            }
            if (arg0 == 4004) {
                int var240 = field1082[--field1090];
                field1082[field1090++] = (int) (Math.random() * (double) var240);
                return;
            }
            if (arg0 == 4005) {
                int var241 = field1082[--field1090];
                field1082[field1090++] = (int) (Math.random() * (double) (var241 + 1));
                return;
            }
            if (arg0 == 4006) {
                field1090 -= 5;
                int var242 = field1082[field1090];
                int var243 = field1082[field1090 + 1];
                int var244 = field1082[field1090 + 2];
                int var245 = field1082[field1090 + 3];
                int var246 = field1082[field1090 + 4];
                field1082[field1090++] = (var243 - var242) * (var246 - var244) / (var245 - var244) + var242;
                return;
            }
            if (arg0 == 4007) {
                field1090 -= 2;
                long var247 = (long) field1082[field1090];
                long var249 = (long) field1082[field1090 + 1];
                field1082[field1090++] = (int) (var247 * var249 / 100L + var247);
                return;
            }
            if (arg0 == 4008) {
                field1090 -= 2;
                int var251 = field1082[field1090];
                int var252 = field1082[field1090 + 1];
                field1082[field1090++] = var251 | 0x1 << var252;
                return;
            }
            if (arg0 == 4009) {
                field1090 -= 2;
                int var253 = field1082[field1090];
                int var254 = field1082[field1090 + 1];
                field1082[field1090++] = var253 & -(0x1 << var254) - 1;
                return;
            }
            if (arg0 == 4010) {
                field1090 -= 2;
                int var255 = field1082[field1090];
                int var256 = field1082[field1090 + 1];
                field1082[field1090++] = (var255 & 0x1 << var256) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field1090 -= 2;
                int var257 = field1082[field1090];
                int var258 = field1082[field1090 + 1];
                field1082[field1090++] = var257 % var258;
                return;
            }
            if (arg0 == 4012) {
                field1090 -= 2;
                int var259 = field1082[field1090];
                int var260 = field1082[field1090 + 1];
                if (var259 == 0) {
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = (int) Math.pow((double) var259, (double) var260);
                return;
            }
            if (arg0 == 4013) {
                field1090 -= 2;
                int var261 = field1082[field1090];
                int var262 = field1082[field1090 + 1];
                if (var261 == 0) {
                    field1082[field1090++] = 0;
                    return;
                }
                if (var262 == 0) {
                    field1082[field1090++] = Integer.MAX_VALUE;
                    return;
                }
                field1082[field1090++] = (int) Math.pow((double) var261, 1.0D / (double) var262);
                return;
            }
            if (arg0 == 4014) {
                field1090 -= 2;
                int var263 = field1082[field1090];
                int var264 = field1082[field1090 + 1];
                field1082[field1090++] = var263 & var264;
                return;
            }
            if (arg0 == 4015) {
                field1090 -= 2;
                int var265 = field1082[field1090];
                int var266 = field1082[field1090 + 1];
                field1082[field1090++] = var265 | var266;
                return;
            }
            if (arg0 == 4016) {
                field1090 -= 2;
                int var267 = field1082[field1090];
                int var268 = field1082[field1090 + 1];
                field1082[field1090++] = var267 < var268 ? var267 : var268;
                return;
            }
            if (arg0 == 4017) {
                field1090 -= 2;
                int var269 = field1082[field1090];
                int var270 = field1082[field1090 + 1];
                field1082[field1090++] = var269 > var270 ? var269 : var270;
                return;
            }
            if (arg0 == 4018) {
                field1090 -= 3;
                long var271 = (long) field1082[field1090];
                long var273 = (long) field1082[field1090 + 1];
                long var275 = (long) field1082[field1090 + 2];
                field1082[field1090++] = (int) (var271 * var275 / var273);
                return;
            }
            if (arg0 == 4019) {
                field1090 -= 2;
                int var277 = field1082[field1090];
                int var278 = field1082[field1090 + 1];
                if (var277 > 700 || var278 > 700) {
                    field1082[field1090++] = 256;
                }
                double var279 = (Math.random() * (double) (var277 + var278) + 800.0D - (double) var277) / 100.0D;
                field1082[field1090++] = (int) (Math.pow(2.0D, var279) + 0.5D);
                return;
            }
            if (arg0 == 4020) {
                int var281 = field1082[--field1090];
                field1082[field1090++] = class624.field8692[class752.method4172(var281, 1474149255) & 0xFFFF];
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var282 = field1078[--field1079];
                int var283 = field1082[--field1090];
                field1078[field1079++] = var282 + var283;
                return;
            }
            if (arg0 == 4101) {
                field1079 -= 2;
                String var284 = field1078[field1079];
                String var285 = field1078[field1079 + 1];
                field1078[field1079++] = var284 + var285;
                return;
            }
            if (arg0 == 4102) {
                String var286 = field1078[--field1079];
                int var287 = field1082[--field1090];
                field1078[field1079++] = var286 + class642.method3569(var287, -118, true);
                return;
            }
            if (arg0 == 4103) {
                String var288 = field1078[--field1079];
                field1078[field1079++] = var288.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field1078[field1079++] = class517.method2947(class258.method1685(field1082[--field1090], (byte) -93), (byte) 126, class464.field6309);
                return;
            }
            if (arg0 == 4105) {
                field1079 -= 2;
                String var289 = field1078[field1079];
                String var290 = field1078[field1079 + 1];
                if (class235.field3379.field10630 != null && class235.field3379.field10630.field2095) {
                    field1078[field1079++] = var290;
                    return;
                }
                field1078[field1079++] = var289;
                return;
            }
            if (arg0 == 4106) {
                int var291 = field1082[--field1090];
                field1078[field1079++] = Integer.toString(var291);
                return;
            }
            if (arg0 == 4107) {
                field1079 -= 2;
                field1082[field1090++] = class630.method3539(false, field1078[field1079], field1078[field1079 + 1], class464.field6309);
                return;
            }
            if (arg0 == 4108) {
                String var292 = field1078[--field1079];
                field1090 -= 2;
                int var293 = field1082[field1090];
                int var294 = field1082[field1090 + 1];
                class145 var295 = class177.method1340(var294, 0, true, class564.field7989);
                field1082[field1090++] = var295.method1173(var292, var293, 174, class70.field1037);
                return;
            }
            if (arg0 == 4109) {
                String var296 = field1078[--field1079];
                field1090 -= 2;
                int var297 = field1082[field1090];
                int var298 = field1082[field1090 + 1];
                class145 var299 = class177.method1340(var298, 0, true, class564.field7989);
                field1082[field1090++] = var299.method1166((byte) 107, var297, class70.field1037, var296);
                return;
            }
            if (arg0 == 4110) {
                field1079 -= 2;
                String var300 = field1078[field1079];
                String var301 = field1078[field1079 + 1];
                if (field1082[--field1090] == 1) {
                    field1078[field1079++] = var300;
                    return;
                }
                field1078[field1079++] = var301;
                return;
            }
            if (arg0 == 4111) {
                String var302 = field1078[--field1079];
                field1078[field1079++] = class148.method1184(-128, var302);
                return;
            }
            if (arg0 == 4112) {
                String var303 = field1078[--field1079];
                int var304 = field1082[--field1090];
                if (var304 == -1) {
                    throw new RuntimeException("null char");
                }
                field1078[field1079++] = var303 + (char) var304;
                return;
            }
            if (arg0 == 4113) {
                int var305 = field1082[--field1090];
                field1082[field1090++] = method648((char) var305);
                return;
            }
            if (arg0 == 4114) {
                int var306 = field1082[--field1090];
                field1082[field1090++] = class684.method3855(-105, (char) var306) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var307 = field1082[--field1090];
                field1082[field1090++] = class111.method945((char) var307, -21584) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var308 = field1082[--field1090];
                field1082[field1090++] = class653.method3672((char) var308, 48) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var309 = field1078[--field1079];
                if (var309 != null) {
                    field1082[field1090++] = var309.length();
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var310 = field1078[--field1079];
                field1090 -= 2;
                int var311 = field1082[field1090];
                int var312 = field1082[field1090 + 1];
                field1078[field1079++] = var310.substring(var311, var312);
                return;
            }
            if (arg0 == 4119) {
                String var313 = field1078[--field1079];
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
                field1078[field1079++] = var314.toString();
                return;
            }
            if (arg0 == 4120) {
                String var318 = field1078[--field1079];
                field1090 -= 2;
                int var319 = field1082[field1090];
                int var320 = field1082[field1090 + 1];
                field1082[field1090++] = var318.indexOf(var319, var320);
                return;
            }
            if (arg0 == 4121) {
                field1079 -= 2;
                String var321 = field1078[field1079];
                String var322 = field1078[field1079 + 1];
                int var323 = field1082[--field1090];
                field1082[field1090++] = var321.indexOf(var322, var323);
                return;
            }
            if (arg0 == 4122) {
                int var324 = field1082[--field1090];
                field1082[field1090++] = Character.toLowerCase((char) var324);
                return;
            }
            if (arg0 == 4123) {
                int var325 = field1082[--field1090];
                field1082[field1090++] = Character.toUpperCase((char) var325);
                return;
            }
            if (arg0 == 4124) {
                boolean var326 = field1082[--field1090] != 0;
                int var327 = field1082[--field1090];
                field1078[field1079++] = class121.method1057(-20746, (long) var327, var326, 0, class464.field6309);
                return;
            }
            if (arg0 == 4125) {
                String var328 = field1078[--field1079];
                int var329 = field1082[--field1090];
                class145 var330 = class177.method1340(var329, 0, true, class564.field7989);
                field1082[field1090++] = var330.method1164(var328, 455, class70.field1037);
                return;
            }
            if (arg0 == 4126) {
                field1078[field1079++] = class235.method1581(1, (long) field1082[--field1090] * 60000L, class464.field6309);
                return;
            }
            if (arg0 == 4127) {
                long var331 = field1095[--field1073];
                field1078[field1079++] = var331 == -1L ? "" : Long.toString(var331, 36).toUpperCase();
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var333 = field1082[--field1090];
                field1078[field1079++] = class143.field2427.method1410((byte) 45, var333).field10079;
                return;
            }
            if (arg0 == 4201) {
                field1090 -= 2;
                int var334 = field1082[field1090];
                int var335 = field1082[field1090 + 1];
                class730 var336 = class143.field2427.method1410((byte) 54, var334);
                if (var335 >= 1 && var335 <= 5 && var336.field10017[var335 - 1] != null) {
                    field1078[field1079++] = var336.field10017[var335 - 1];
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 4202) {
                field1090 -= 2;
                int var337 = field1082[field1090];
                int var338 = field1082[field1090 + 1];
                class730 var339 = class143.field2427.method1410((byte) 76, var337);
                if (var338 >= 1 && var338 <= 5 && var339.field10009[var338 - 1] != null) {
                    field1078[field1079++] = var339.field10009[var338 - 1];
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var340 = field1082[--field1090];
                field1082[field1090++] = class143.field2427.method1410((byte) 118, var340).field10024;
                return;
            }
            if (arg0 == 4204) {
                int var341 = field1082[--field1090];
                field1082[field1090++] = class143.field2427.method1410((byte) 103, var341).field10042 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var342 = field1082[--field1090];
                class730 var343 = class143.field2427.method1410((byte) 112, var342);
                if (var343.field10011 == -1 && var343.field10056 >= 0) {
                    field1082[field1090++] = var343.field10056;
                    return;
                }
                field1082[field1090++] = var342;
                return;
            }
            if (arg0 == 4206) {
                int var344 = field1082[--field1090];
                class730 var345 = class143.field2427.method1410((byte) 37, var344);
                if (var345.field10011 >= 0 && var345.field10056 >= 0) {
                    field1082[field1090++] = var345.field10056;
                    return;
                }
                field1082[field1090++] = var344;
                return;
            }
            if (arg0 == 4207) {
                int var346 = field1082[--field1090];
                field1082[field1090++] = class143.field2427.method1410((byte) 19, var346).field10080 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field1090 -= 2;
                int var347 = field1082[field1090];
                int var348 = field1082[field1090 + 1];
                class485 var349 = class117.field2153.method1159((byte) -74, var348);
                if (var349.method2776((byte) 62)) {
                    field1078[field1079++] = class143.field2427.method1410((byte) 61, var347).method4048(var348, true, var349.field6554);
                    return;
                }
                field1082[field1090++] = class143.field2427.method1410((byte) 125, var347).method4061(var349.field6560, (byte) 63, var348);
                return;
            }
            if (arg0 == 4209) {
                field1090 -= 2;
                int var350 = field1082[field1090];
                int var351 = field1082[field1090 + 1] - 1;
                class730 var352 = class143.field2427.method1410((byte) 72, var350);
                if (var352.field10006 == var351) {
                    field1082[field1090++] = var352.field10053;
                    return;
                }
                if (var352.field10015 == var351) {
                    field1082[field1090++] = var352.field9999;
                    return;
                }
                field1082[field1090++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var353 = field1078[--field1079];
                int var354 = field1082[--field1090];
                class311.method1976(var354 == 1, var353, -76);
                field1082[field1090++] = class792.field10853;
                return;
            }
            if (arg0 == 4211) {
                if (class119.field2182 != null && class505.field6889 < class792.field10853) {
                    field1082[field1090++] = class119.field2182[class505.field6889++] & 0xFFFF;
                    return;
                }
                field1082[field1090++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class505.field6889 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var355 = field1082[--field1090];
                field1082[field1090++] = class143.field2427.method1410((byte) 72, var355).field10047;
                return;
            }
            if (arg0 == 4214) {
                String var356 = field1078[--field1079];
                field1090 -= 3;
                int var357 = field1082[field1090];
                int var358 = field1082[field1090 + 1];
                int var359 = field1082[field1090 + 2];
                class547.method3073(var358, var357 == 1, (byte) 105, var356, var359);
                field1082[field1090++] = class792.field10853;
                return;
            }
            if (arg0 == 4215) {
                field1079 -= 2;
                field1090 -= 2;
                String var360 = field1078[field1079];
                int var361 = field1082[field1090];
                int var362 = field1082[field1090 + 1];
                String var363 = field1078[field1079 + 1];
                class459.method2639(var363, var361 == 1, (byte) -56, var360, var362);
                field1082[field1090++] = class792.field10853;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field1090 -= 2;
                int var364 = field1082[field1090];
                int var365 = field1082[field1090 + 1];
                class485 var366 = class117.field2153.method1159((byte) -17, var365);
                if (var366.method2776((byte) 101)) {
                    field1078[field1079++] = class495.field6783.method2005(6, var364).method3280(var365, var366.field6554, true);
                    return;
                }
                field1082[field1090++] = class495.field6783.method2005(6, var364).method3284(127, var365, var366.field6560);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field1090 -= 2;
                int var367 = field1082[field1090];
                int var368 = field1082[field1090 + 1];
                class485 var369 = class117.field2153.method1159((byte) -18, var368);
                if (var369.method2776((byte) 72)) {
                    field1078[field1079++] = class414.field5670.method2319(var367, false).method2589(var369.field6554, var368, true);
                    return;
                }
                field1082[field1090++] = class414.field5670.method2319(var367, false).method2583(var369.field6560, var368, -1);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field1090 -= 2;
                int var370 = field1082[field1090];
                int var371 = field1082[field1090 + 1];
                class485 var372 = class117.field2153.method1159((byte) -102, var371);
                if (var372.method2776((byte) 120)) {
                    field1078[field1079++] = class770.field10616.method63(var370, -28457).method1190(var371, 0, var372.field6554);
                    return;
                }
                field1082[field1090++] = class770.field10616.method63(var370, -28457).method1189(-10415, var371, var372.field6560);
                return;
            }
        } else if (arg0 < 4700) {
            if (arg0 == 4600) {
                int var373 = field1082[--field1090];
                class540 var374 = class706.field9695.method92(var373, (byte) 6);
                if (var374.field7347 != null && var374.field7347.length > 0) {
                    int var375 = 0;
                    int var376 = var374.field7330[0];
                    for (int var377 = 1; var377 < var374.field7347.length; var377++) {
                        if (var374.field7330[var377] > var376) {
                            var375 = var377;
                            var376 = var374.field7330[var377];
                        }
                    }
                    field1082[field1090++] = var374.field7347[var375];
                    return;
                }
                field1082[field1090++] = var374.field7338;
                return;
            }
        } else if (arg0 < 4800) {
            if (arg0 == 4700) {
                field1082[field1090++] = class442.field5991 ? 1 : 0;
                return;
            }
            if (arg0 == 4701) {
                String var378 = field1078[--field1079];
                if (class753.field10398 == 7 && class517.field7034 == 0) {
                    if (var378.length() > 20) {
                        class709.field9746 = -4;
                        return;
                    }
                    class709.field9746 = -1;
                    class537 var379 = class476.method2729(class128.field2247, (byte) -46, class551.field7498);
                    var379.field7295.method754(0, 73);
                    int var380 = var379.field7295.field1442;
                    var379.field7295.method783((byte) 11, var378);
                    var379.field7295.method778(var379.field7295.field1442 - var380, -1123171672);
                    class173.method1314(false, var379);
                    return;
                }
                class709.field9746 = -5;
                return;
            }
            if (arg0 == 4702) {
                field1082[field1090++] = class709.field9746;
                if (class709.field9746 != -1) {
                    class709.field9746 = -6;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(IZ)V")
    public static final void method655(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(I)V")
    public static final void method656(int arg0) {
        if (arg0 == -1 || !class659.method3706(104, arg0)) {
            return;
        }
        class17[] var1 = class431.field5870[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class17 var3 = var1[var2];
            if (var3.field260 != null) {
                class255 var4 = new class255();
                var4.field3583 = var3;
                var4.field3586 = var3.field260;
                method653(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(IZ)V")
    private static final void method657(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1082[field1090++] = class364.field4952;
                return;
            }
            if (arg0 == 5001) {
                field1090 -= 3;
                class364.field4952 = field1082[field1090];
                class712.field9802 = class478.method2737((byte) 12, field1082[field1090 + 1]);
                if (class712.field9802 == null) {
                    class712.field9802 = class33.field562;
                }
                class160.field2571 = field1082[field1090 + 2];
                field1100++;
                class537 var2 = class476.method2729(class190.field2925, (byte) -46, class551.field7498);
                var2.field7295.method754(class364.field4952, 56);
                var2.field7295.method754(class712.field9802.field8591, 73);
                var2.field7295.method754(class160.field2571, 72);
                class173.method1314(false, var2);
                return;
            }
            if (arg0 == 5002) {
                field1079 -= 2;
                String var3 = field1078[field1079];
                String var4 = field1078[field1079 + 1];
                field1090 -= 2;
                int var5 = field1082[field1090];
                int var6 = field1082[field1090 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field1093++;
                class537 var7 = class476.method2729(class148.field2464, (byte) -46, class551.field7498);
                var7.field7295.method754(class703.method3926(120, var3) + class703.method3926(120, var4) + 2, 20);
                var7.field7295.method783((byte) -99, var3);
                var7.field7295.method754(var5 - 1, 96);
                var7.field7295.method754(var6, 97);
                var7.field7295.method783((byte) 74, var4);
                class173.method1314(false, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field1082[--field1090];
                class434 var9 = class307.method1959((byte) -34, var8);
                String var10 = "";
                if (var9 != null && var9.field5908 != null) {
                    var10 = var9.field5908;
                }
                field1078[field1079++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field1082[--field1090];
                class434 var12 = class307.method1959((byte) -125, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5898;
                }
                field1082[field1090++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class712.field9802 == null) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = class712.field9802.field8591;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field1082[--field1090];
                class537 var15 = class476.method2729(class607.field8483, (byte) -46, class551.field7498);
                var15.field7295.method754(var14, 110);
                class173.method1314(false, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field1078[--field1079];
                method651(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1079 -= 2;
                String var17 = field1078[field1079];
                String var18 = field1078[field1079 + 1];
                if (class407.field5593 != 0 || (!class686.field9536 || class282.field3916) && !class88.field1208) {
                    field1101++;
                    class537 var19 = class476.method2729(class357.field4896, (byte) -46, class551.field7498);
                    var19.field7295.method754(0, 46);
                    int var20 = var19.field7295.field1442;
                    var19.field7295.method783((byte) 77, var17);
                    class200.method1445(var19.field7295, var18, -106);
                    var19.field7295.method778(var19.field7295.field1442 - var20, -1123171672);
                    class173.method1314(false, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field1082[--field1090];
                class434 var22 = class307.method1959((byte) -73, var21);
                String var23 = "";
                if (var22 != null && var22.field5901 != null) {
                    var23 = var22.field5901;
                }
                field1078[field1079++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field1082[--field1090];
                class434 var25 = class307.method1959((byte) -116, var24);
                String var26 = "";
                if (var25 != null && var25.field5911 != null) {
                    var26 = var25.field5911;
                }
                field1078[field1079++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field1082[--field1090];
                class434 var28 = class307.method1959((byte) -20, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5906;
                }
                field1082[field1090++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class235.field3379 == null || class235.field3379.field10625 == null) {
                    var30 = "";
                } else {
                    var30 = class235.field3379.method4235(true, true);
                }
                field1078[field1079++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field1082[field1090++] = class160.field2571;
                return;
            }
            if (arg0 == 5017) {
                field1082[field1090++] = class16.method88(6148);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field1082[--field1090];
                class434 var32 = class307.method1959((byte) -124, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5899;
                }
                field1082[field1090++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field1082[--field1090];
                class434 var35 = class307.method1959((byte) -57, var34);
                String var36 = "";
                if (var35 != null && var35.field5907 != null) {
                    var36 = var35.field5907;
                }
                field1078[field1079++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class235.field3379 == null || class235.field3379.field10625 == null) {
                    var37 = "";
                } else {
                    var37 = class235.field3379.method4234(false, true);
                }
                field1078[field1079++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field1082[--field1090];
                class434 var39 = class307.method1959((byte) -106, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5909;
                }
                field1082[field1090++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field1082[--field1090];
                class434 var42 = class307.method1959((byte) -81, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5904;
                }
                field1082[field1090++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field1082[--field1090];
                class434 var45 = class307.method1959((byte) -104, var44);
                String var46 = "";
                if (var45 != null && var45.field5910 != null) {
                    var46 = var45.field5910;
                }
                field1078[field1079++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field1082[--field1090];
                field1078[field1079++] = class465.field6312.method2124(-117, var47).field3138;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field1082[--field1090];
                class210 var49 = class465.field6312.method2124(79, var48);
                if (var49.field3135 == null) {
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = var49.field3135.length;
                return;
            }
            if (arg0 == 5052) {
                field1090 -= 2;
                int var50 = field1082[field1090];
                int var51 = field1082[field1090 + 1];
                class210 var52 = class465.field6312.method2124(59, var50);
                int var53 = var52.field3135[var51];
                field1082[field1090++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field1082[--field1090];
                class210 var55 = class465.field6312.method2124(-109, var54);
                if (var55.field3140 == null) {
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = var55.field3140.length;
                return;
            }
            if (arg0 == 5054) {
                field1090 -= 2;
                int var56 = field1082[field1090];
                int var57 = field1082[field1090 + 1];
                field1082[field1090++] = class465.field6312.method2124(-127, var56).field3140[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field1082[--field1090];
                field1078[field1079++] = class530.field7179.method1747(1, var58).method3026(false);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field1082[--field1090];
                class533 var60 = class530.field7179.method1747(1, var59);
                if (var60.field7204 == null) {
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = var60.field7204.length;
                return;
            }
            if (arg0 == 5057) {
                field1090 -= 2;
                int var61 = field1082[field1090];
                int var62 = field1082[field1090 + 1];
                field1082[field1090++] = class530.field7179.method1747(1, var61).field7204[var62];
                return;
            }
            if (arg0 == 5058) {
                field1086 = new class521();
                field1086.field7061 = field1082[--field1090];
                field1086.field7063 = class530.field7179.method1747(1, field1086.field7061);
                field1086.field7067 = new int[field1086.field7063.method3022(0)];
                return;
            }
            if (arg0 == 5059) {
                field1085++;
                class537 var63 = class476.method2729(class385.field5250, (byte) -46, class551.field7498);
                var63.field7295.method754(0, 39);
                int var64 = var63.field7295.field1442;
                var63.field7295.method754(0, 82);
                var63.field7295.method781(108, field1086.field7061);
                field1086.field7063.method3024(var63.field7295, (byte) 125, field1086.field7067);
                var63.field7295.method778(var63.field7295.field1442 - var64, -1123171672);
                class173.method1314(false, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field1078[--field1079];
                field1091++;
                class537 var66 = class476.method2729(class505.field6884, (byte) -46, class551.field7498);
                var66.field7295.method754(0, 119);
                int var67 = var66.field7295.field1442;
                var66.field7295.method783((byte) -118, var65);
                var66.field7295.method781(46, field1086.field7061);
                field1086.field7063.method3024(var66.field7295, (byte) 109, field1086.field7067);
                var66.field7295.method778(var66.field7295.field1442 - var67, -1123171672);
                class173.method1314(false, var66);
                return;
            }
            if (arg0 == 5061) {
                field1085++;
                class537 var68 = class476.method2729(class385.field5250, (byte) -46, class551.field7498);
                var68.field7295.method754(0, 114);
                int var69 = var68.field7295.field1442;
                var68.field7295.method754(1, 25);
                var68.field7295.method781(82, field1086.field7061);
                field1086.field7063.method3024(var68.field7295, (byte) 108, field1086.field7067);
                var68.field7295.method778(var68.field7295.field1442 - var69, -1123171672);
                class173.method1314(false, var68);
                return;
            }
            if (arg0 == 5062) {
                field1090 -= 2;
                int var70 = field1082[field1090];
                int var71 = field1082[field1090 + 1];
                field1082[field1090++] = class465.field6312.method2124(89, var70).field3147[var71];
                return;
            }
            if (arg0 == 5063) {
                field1090 -= 2;
                int var72 = field1082[field1090];
                int var73 = field1082[field1090 + 1];
                field1082[field1090++] = class465.field6312.method2124(100, var72).field3136[var73];
                return;
            }
            if (arg0 == 5064) {
                field1090 -= 2;
                int var74 = field1082[field1090];
                int var75 = field1082[field1090 + 1];
                if (var75 == -1) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = class465.field6312.method2124(-128, var74).method1474((char) var75, -83);
                return;
            }
            if (arg0 == 5065) {
                field1090 -= 2;
                int var76 = field1082[field1090];
                int var77 = field1082[field1090 + 1];
                if (var77 == -1) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = class465.field6312.method2124(72, var76).method1478((char) var77, -1);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field1082[--field1090];
                field1082[field1090++] = class530.field7179.method1747(1, var78).method3022(0);
                return;
            }
            if (arg0 == 5067) {
                field1090 -= 2;
                int var79 = field1082[field1090];
                int var80 = field1082[field1090 + 1];
                int var81 = class530.field7179.method1747(1, var79).method3018(var80, -1).field6169;
                field1082[field1090++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field1090 -= 2;
                int var82 = field1082[field1090];
                int var83 = field1082[field1090 + 1];
                field1086.field7067[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field1090 -= 2;
                int var84 = field1082[field1090];
                int var85 = field1082[field1090 + 1];
                field1086.field7067[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field1090 -= 3;
                int var86 = field1082[field1090];
                int var87 = field1082[field1090 + 1];
                int var88 = field1082[field1090 + 2];
                class533 var89 = class530.field7179.method1747(1, var86);
                if (var89.method3018(var87, -1).field6169 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1082[field1090++] = var89.method3019(var87, (byte) -55, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field1078[--field1079];
                boolean var91 = field1082[--field1090] == 1;
                class699.method3892(false, var90, var91);
                field1082[field1090++] = class792.field10853;
                return;
            }
            if (arg0 == 5072) {
                if (class119.field2182 != null && class505.field6889 < class792.field10853) {
                    field1082[field1090++] = class119.field2182[class505.field6889++] & 0xFFFF;
                    return;
                }
                field1082[field1090++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class505.field6889 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class789.field10821.method1531(73, 86)) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class789.field10821.method1531(78, 82)) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class789.field10821.method1531(108, 81)) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class440.method2566(field1082[--field1090], (byte) -110);
                return;
            }
            if (arg0 == 5201) {
                field1082[field1090++] = class353.method2161(57);
                return;
            }
            if (arg0 == 5205) {
                class270.method1752(field1082[--field1090], -1, 117, false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field1082[--field1090];
                class229 var93 = class64.method460(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = var93.field3330;
                return;
            }
            if (arg0 == 5207) {
                class229 var94 = class64.method444(field1082[--field1090]);
                if (var94 != null && var94.field3338 != null) {
                    field1078[field1079++] = var94.field3338;
                    return;
                }
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1082[field1090++] = class474.field6419;
                field1082[field1090++] = class220.field3223;
                return;
            }
            if (arg0 == 5209) {
                field1082[field1090++] = class64.field907 + class215.field3194;
                field1082[field1090++] = class64.field914 + class211.field3161;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field1082[--field1090];
                class229 var96 = class64.method444(var95);
                if (var96 == null) {
                    field1082[field1090++] = 0;
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = var96.field3336 >> 14 & 0x3FFF;
                field1082[field1090++] = var96.field3336 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field1082[--field1090];
                class229 var98 = class64.method444(var97);
                if (var98 == null) {
                    field1082[field1090++] = 0;
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = var98.field3345 - var98.field3349;
                field1082[field1090++] = var98.field3340 - var98.field3331;
                return;
            }
            if (arg0 == 5212) {
                class508 var99 = class550.method3087(30929);
                if (var99 == null) {
                    field1082[field1090++] = -1;
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = var99.field6973;
                int var100 = var99.field6982 << 28 | class64.field907 + var99.field6978 << 14 | class64.field914 + var99.field6984;
                field1082[field1090++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class508 var101 = class791.method4314((byte) -98);
                if (var101 == null) {
                    field1082[field1090++] = -1;
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = var101.field6973;
                int var102 = var101.field6982 << 28 | class64.field907 + var101.field6978 << 14 | class64.field914 + var101.field6984;
                field1082[field1090++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field1082[--field1090];
                class229 var104 = class38.method233(0);
                if (var104 != null) {
                    boolean var105 = var104.method1561(107, var103 & 0x3FFF, var103 >> 14 & 0x3FFF, var103 >> 28 & 0x3, field1083);
                    if (var105) {
                        class169.method1302(field1083[1], field1083[2], (byte) -98);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1090 -= 2;
                int var106 = field1082[field1090];
                int var107 = field1082[field1090 + 1];
                class305 var108 = class64.method458(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class229 var110 = (class229) var108.method1951(-723780560); var110 != null; var110 = (class229) var108.method1946(-6974)) {
                    if (var110.field3330 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field1082[--field1090];
                class229 var112 = class64.method444(var111);
                if (var112 == null) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = var112.field3335;
                return;
            }
            if (arg0 == 5220) {
                field1082[field1090++] = class394.field5442 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field1082[--field1090];
                class169.method1302(var113 >> 14 & 0x3FFF, var113 & 0x3FFF, (byte) -104);
                return;
            }
            if (arg0 == 5222) {
                class229 var114 = class38.method233(0);
                if (var114 != null) {
                    boolean var115 = var114.method1560(class64.field907 + class215.field3194, 30156, field1083, class64.field914 + class211.field3161);
                    if (var115) {
                        field1082[field1090++] = field1083[1];
                        field1082[field1090++] = field1083[2];
                        return;
                    }
                    field1082[field1090++] = -1;
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = -1;
                field1082[field1090++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1090 -= 2;
                int var116 = field1082[field1090];
                int var117 = field1082[field1090 + 1];
                class270.method1752(var116, var117 >> 14 & 0x3FFF, 118, false, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field1082[--field1090];
                class229 var119 = class38.method233(0);
                if (var119 != null) {
                    boolean var120 = var119.method1561(-112, var118 & 0x3FFF, var118 >> 14 & 0x3FFF, var118 >> 28 & 0x3, field1083);
                    if (var120) {
                        field1082[field1090++] = field1083[1];
                        field1082[field1090++] = field1083[2];
                        return;
                    }
                    field1082[field1090++] = -1;
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = -1;
                field1082[field1090++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field1082[--field1090];
                class229 var122 = class38.method233(0);
                if (var122 != null) {
                    boolean var123 = var122.method1560(var121 >> 14 & 0x3FFF, 30156, field1083, var121 & 0x3FFF);
                    if (var123) {
                        field1082[field1090++] = field1083[1];
                        field1082[field1090++] = field1083[2];
                        return;
                    }
                    field1082[field1090++] = -1;
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = -1;
                field1082[field1090++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class13.method73(field1082[--field1090], (byte) 110);
                return;
            }
            if (arg0 == 5227) {
                field1090 -= 2;
                int var124 = field1082[field1090];
                int var125 = field1082[field1090 + 1];
                class270.method1752(var124, var125 >> 14 & 0x3FFF, 126, true, var125 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class355.field4845 = field1082[--field1090] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1082[field1090++] = class355.field4845 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field1082[--field1090];
                class557.method3202(3, var126);
                return;
            }
            if (arg0 == 5231) {
                field1090 -= 2;
                int var127 = field1082[field1090];
                boolean var128 = field1082[field1090 + 1] == 1;
                if (class307.field4201 != null) {
                    class154 var129 = class307.field4201.method337((long) var127, 1);
                    if (var129 != null && !var128) {
                        var129.method1207(114);
                        return;
                    }
                    if (var129 == null && var128) {
                        class154 var130 = new class154();
                        class307.field4201.method341((long) var127, var130, (byte) 91);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field1082[--field1090];
                if (class307.field4201 != null) {
                    class154 var132 = class307.field4201.method337((long) var131, 1);
                    field1082[field1090++] = var132 == null ? 0 : 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1090 -= 2;
                int var133 = field1082[field1090];
                boolean var134 = field1082[field1090 + 1] == 1;
                if (class290.field4000 != null) {
                    class154 var135 = class290.field4000.method337((long) var133, 1);
                    if (var135 != null && !var134) {
                        var135.method1207(121);
                        return;
                    }
                    if (var135 == null && var134) {
                        class154 var136 = new class154();
                        class290.field4000.method341((long) var133, var136, (byte) 33);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field1082[--field1090];
                if (class290.field4000 != null) {
                    class154 var138 = class290.field4000.method337((long) var137, 1);
                    field1082[field1090++] = var138 == null ? 0 : 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1082[field1090++] = class64.field875 == null ? -1 : class64.field875.field3330;
                return;
            }
            if (arg0 == 5236) {
                field1090 -= 2;
                int var139 = field1082[field1090];
                int var140 = field1082[field1090 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class642.method3571(var142, var139, (byte) 121, var141);
                if (var143 < 0) {
                    field1082[field1090++] = -1;
                    return;
                }
                field1082[field1090++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class509.method2900(-128);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1090 -= 2;
                int var144 = field1082[field1090];
                int var145 = field1082[field1090 + 1];
                class66.method513(var145, 122, 3, var144, false);
                field1082[field1090++] = class703.field9674 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class703.field9674 != null) {
                    class66.method513(-1, 124, class111.field1911.field6714.method2951((byte) 91), -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class277[] var146 = class89.method713(4939);
                field1082[field1090++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field1082[--field1090];
                class277[] var148 = class89.method713(4939);
                field1082[field1090++] = var148[var147].field3832;
                field1082[field1090++] = var148[var147].field3831;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class435.field5920;
                int var150 = class792.field10847;
                int var151 = -1;
                class277[] var152 = class89.method713(4939);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class277 var154 = var152[var153];
                    if (var154.field3832 == var149 && var154.field3831 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field1082[field1090++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field1082[field1090++] = class586.method3369(2);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field1082[--field1090];
                if (var155 >= 1 && var155 <= 2) {
                    class66.method513(-1, 121, var155, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1082[field1090++] = class111.field1911.field6714.method2951((byte) 106);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field1082[--field1090];
                if (var156 >= 1 && var156 <= 2) {
                    class111.field1911.method2823(true, class111.field1911.field6714, var156);
                    class111.field1911.method2823(true, class111.field1911.field6768, var156);
                    class307.method1957(0);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1079 -= 2;
                String var157 = field1078[field1079];
                String var158 = field1078[field1079 + 1];
                int var159 = field1082[--field1090];
                field1088++;
                class537 var160 = class476.method2729(class571.field8133, (byte) -46, class551.field7498);
                var160.field7295.method754(class703.method3926(120, var157) + class703.method3926(120, var158) + 1, 63);
                var160.field7295.method783((byte) -115, var157);
                var160.field7295.method783((byte) 13, var158);
                var160.field7295.method754(var159, 121);
                class173.method1314(false, var160);
                return;
            }
            if (arg0 == 5401) {
                field1090 -= 2;
                class377.field5130[field1082[field1090]] = (short) class2.method17(-8201, field1082[field1090 + 1]);
                class143.field2427.method1414(117);
                class143.field2427.method1415((byte) 84);
                class495.field6783.method2002(4);
                class622.method3506(103);
                return;
            }
            if (arg0 == 5405) {
                field1090 -= 2;
                int var161 = field1082[field1090];
                int var162 = field1082[field1090 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class747.field10322[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1090 -= 7;
                int var163 = field1082[field1090];
                int var164 = field1082[field1090 + 1] << 1;
                int var165 = field1082[field1090 + 2];
                int var166 = field1082[field1090 + 3];
                int var167 = field1082[field1090 + 4];
                int var168 = field1082[field1090 + 5];
                int var169 = field1082[field1090 + 6];
                if (var163 >= 0 && var163 < 2 && class747.field10322[var163] != null && var164 >= 0 && var164 < class747.field10322[var163].length) {
                    class747.field10322[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class747.field10322[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class747.field10322[field1082[--field1090]].length >> 1;
                field1082[field1090++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class703.field9674 != null) {
                    class66.method513(-1, 126, class111.field1911.field6714.method2951((byte) 73), -1, false);
                }
                if (class194.field2956 != null) {
                    class551.method3138((byte) -104);
                    System.exit(0);
                    return;
                }
                String var171 = class207.field3115 == null ? class567.method3275(0) : class207.field3115;
                class714.method3973(class630.field8751, (byte) -86, false, class111.field1911.field6725.method3784((byte) 74) == 1, var171);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class517.field7033 != null) {
                    if (class517.field7033.field7416 == null) {
                        var172 = class230.method1564(class517.field7033.field7414, -25142);
                    } else {
                        var172 = (String) class517.field7033.field7416;
                    }
                }
                field1078[field1079++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field1082[field1090++] = class630.field8751.field10241 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class703.field9674 != null) {
                    class66.method513(-1, 124, class111.field1911.field6714.method2951((byte) 80), -1, false);
                }
                String var173 = field1078[--field1079];
                boolean var174 = field1082[--field1090] == 1;
                String var175 = class567.method3275(0) + var173;
                class714.method3973(class630.field8751, (byte) -86, var174, class111.field1911.field6725.method3784((byte) 84) == 1, var175);
                return;
            }
            if (arg0 == 5422) {
                field1079 -= 2;
                String var176 = field1078[field1079];
                String var177 = field1078[field1079 + 1];
                int var178 = field1082[--field1090];
                if (var176.length() > 0) {
                    if (class653.field9049 == null) {
                        class653.field9049 = new String[class481.field6494[class177.field2797.field8378]];
                    }
                    class653.field9049[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class302.field4148 == null) {
                        class302.field4148 = new String[class481.field6494[class177.field2797.field8378]];
                    }
                    class302.field4148[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1078[--field1079]);
                return;
            }
            if (arg0 == 5424) {
                field1090 -= 11;
                class533.field7210 = field1082[field1090];
                class557.field7858 = field1082[field1090 + 1];
                class707.field9729 = field1082[field1090 + 2];
                class446.field6127 = field1082[field1090 + 3];
                class150.field2488 = field1082[field1090 + 4];
                class737.field10181 = field1082[field1090 + 5];
                class727.field9990 = field1082[field1090 + 6];
                class491.field6699 = field1082[field1090 + 7];
                class320.field4372 = field1082[field1090 + 8];
                class534.field7221 = field1082[field1090 + 9];
                class217.field3197 = field1082[field1090 + 10];
                class346.field4664.method3737(class150.field2488, false);
                class346.field4664.method3737(class737.field10181, false);
                class346.field4664.method3737(class727.field9990, false);
                class346.field4664.method3737(class491.field6699, false);
                class346.field4664.method3737(class320.field4372, false);
                class753.field10387 = null;
                class681.field9485 = null;
                class119.field2181 = null;
                class487.field6578 = null;
                class258.field3623 = null;
                class381.field5185 = null;
                class523.field7115 = null;
                class609.field8504 = null;
                class608.field8486 = true;
                return;
            }
            if (arg0 == 5425) {
                class506.method2887(0);
                class608.field8486 = false;
                return;
            }
            if (arg0 == 5426) {
                field1090 -= 2;
                class84.field1154 = field1082[field1090];
                class412.field5655 = field1082[field1090 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1090 -= 2;
                class180.field2826 = field1082[field1090 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1090 -= 2;
                int var179 = field1082[field1090];
                int var180 = field1082[field1090 + 1];
                field1082[field1090++] = class300.method1929(-9, var179, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class117.method1035((byte) -122, field1078[--field1079], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class729.method4044(class286.field3936, 26693, "accountcreated");
                    return;
                } catch (Throwable var328) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class729.method4044(class286.field3936, 26693, "accountcreatestarted");
                    return;
                } catch (Throwable var329) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class717.field9868 != null) {
                    Transferable var182 = class717.field9868.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var330) {
                        }
                    }
                }
                field1078[field1079++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class610.field8521 = field1082[--field1090];
                return;
            }
            if (arg0 == 5435) {
                field1082[field1090++] = class740.field10206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1090 -= 4;
                int var183 = field1082[field1090];
                int var184 = field1082[field1090 + 1];
                int var185 = field1082[field1090 + 2];
                int var186 = field1082[field1090 + 3];
                class523.method2974(var185, var186, (var183 & 0x3FFF) - class400.field5510, var184 << 2, 18202, (var183 >> 14 & 0x3FFF) - class217.field3198, false);
                return;
            }
            if (arg0 == 5501) {
                field1090 -= 4;
                int var187 = field1082[field1090];
                int var188 = field1082[field1090 + 1];
                int var189 = field1082[field1090 + 2];
                int var190 = field1082[field1090 + 3];
                class199.method1433(92, var190, (var187 >> 14 & 0x3FFF) - class217.field3198, (var187 & 0x3FFF) - class400.field5510, var189, var188 << 2);
                return;
            }
            if (arg0 == 5502) {
                field1090 -= 6;
                int var191 = field1082[field1090];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class289.field3991 = var191;
                int var192 = field1082[field1090 + 1];
                if (var192 + 1 >= class747.field10322[class289.field3991].length >> 1) {
                    throw new RuntimeException();
                }
                class254.field3581 = var192;
                class118.field2161 = 0;
                class56.field796 = field1082[field1090 + 2];
                class615.field8572 = field1082[field1090 + 3];
                int var193 = field1082[field1090 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class281.field3906 = var193;
                int var194 = field1082[field1090 + 5];
                if (var194 + 1 >= class747.field10322[class281.field3906].length >> 1) {
                    throw new RuntimeException();
                }
                class137.field2344 = var194;
                class536.field7291 = 3;
                class100.field1626 = -1;
                class577.field8185 = -1;
                return;
            }
            if (arg0 == 5503) {
                class113.method1026(-21651);
                return;
            }
            if (arg0 == 5504) {
                field1090 -= 2;
                class365.method2228(field1082[field1090], 1, 0, field1082[field1090 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field1082[field1090++] = (int) class43.field682 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1082[field1090++] = (int) class53.field763 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class273.method1765((byte) -115);
                return;
            }
            if (arg0 == 5508) {
                class584.method3359(117);
                return;
            }
            if (arg0 == 5509) {
                class130.method1103((byte) -125);
                return;
            }
            if (arg0 == 5510) {
                class365.method2226(false);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field1082[--field1090];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class217.field3198;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class483.field6515) {
                    var198 = class483.field6515;
                }
                int var199 = var197 - class400.field5510;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class65.field926) {
                    var199 = class65.field926;
                }
                class492.field6736 = (var198 << 9) + 256;
                class229.field3347 = (var199 << 9) + 256;
                class536.field7291 = 4;
                class100.field1626 = -1;
                class577.field8185 = -1;
                return;
            }
            if (arg0 == 5512) {
                class34.method201((byte) -85);
                return;
            }
            if (arg0 == 5514) {
                class90.field1367 = field1082[--field1090];
                return;
            }
            if (arg0 == 5516) {
                field1082[field1090++] = class90.field1367;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field1082[--field1090];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class217.field3198;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class483.field6515) {
                        var203 = class483.field6515;
                    }
                    int var204 = var202 - class400.field5510;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class65.field926) {
                        var204 = class65.field926;
                    }
                    class577.field8185 = (var203 << 9) + 256;
                    class100.field1626 = (var204 << 9) + 256;
                    return;
                }
                class577.field8185 = -1;
                class100.field1626 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1079 -= 2;
                String var205 = field1078[field1079];
                String var206 = field1078[field1079 + 1];
                int var207 = field1082[--field1090];
                if (var205.length() > 320) {
                    return;
                }
                if (class753.field10398 != 3) {
                    return;
                }
                if (class517.field7034 == 0 && class70.field1043 == 0) {
                    class184.field2862 = var205;
                    class550.field7473 = var206;
                    class459.field6232 = var207;
                    class139.method1142(2, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class528.method3005(6);
                return;
            }
            if (arg0 == 5602) {
                if (class517.field7034 == 0) {
                    class315.field4312 = -2;
                    class533.field7216 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field1079--;
                if (class753.field10398 != 3) {
                    return;
                }
                if (class517.field7034 == 0 && class70.field1043 == 0) {
                    class410.method2431(field1078[field1079], (byte) -50);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1079 -= 2;
                field1090 -= 2;
                if (class753.field10398 != 3) {
                    return;
                }
                if (class517.field7034 == 0 && class70.field1043 == 0) {
                    class214.method1498(field1078[field1079], field1078[field1079 + 1], false, field1082[field1090 + 1] == 1, field1082[field1090]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class70.field1043 == 0) {
                    class204.field3082 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1082[field1090++] = class533.field7216;
                return;
            }
            if (arg0 == 5608) {
                field1082[field1090++] = class665.field9233;
                return;
            }
            if (arg0 == 5609) {
                field1082[field1090++] = class204.field3082;
                return;
            }
            if (arg0 == 5611) {
                field1082[field1090++] = class437.field5942;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field1082[--field1090];
                if (class753.field10398 != 7) {
                    return;
                }
                if (class517.field7034 == 0 && class70.field1043 == 0) {
                    if (class193.field2948 != null) {
                        class193.field2948.method917(4);
                        class193.field2948 = null;
                    }
                    class459.field6232 = var208;
                    class139.method1142(2, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field1082[field1090++] = class533.field7216;
                return;
            }
            if (arg0 == 5615) {
                field1079 -= 2;
                String var209 = field1078[field1079];
                String var210 = field1078[field1079 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class753.field10398 != 3) {
                    return;
                }
                if (class517.field7034 == 0 && class70.field1043 == 0) {
                    if (class193.field2948 != null) {
                        class193.field2948.method917(123);
                        class193.field2948 = null;
                    }
                    class184.field2862 = var209;
                    class550.field7473 = var210;
                    class139.method1142(2, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class479.method2746(false, false);
                return;
            }
            if (arg0 == 5617) {
                field1082[field1090++] = class315.field4312;
                return;
            }
            if (arg0 == 5618) {
                field1090--;
                return;
            }
            if (arg0 == 5619) {
                field1090--;
                return;
            }
            if (arg0 == 5620) {
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field1079 -= 2;
                field1090 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class245.field3476 != null) {
                    field1082[field1090++] = 1;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field1082[field1090++] = (int) (class746.field10302 >> 32);
                field1082[field1090++] = (int) (class746.field10302 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field1082[field1090++] = class235.field3381 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class235.field3381 = true;
                class37.method232((byte) -125);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field1082[--field1090];
                class111.field1911.method2823(true, class111.field1911.field6726, var211);
                class234.method1579(-97);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field1082[--field1090] == 1;
                class111.field1911.method2823(true, class111.field1911.field6756, var212 ? 1 : 0);
                class111.field1911.method2823(true, class111.field1911.field6734, var212 ? 1 : 0);
                class234.method1579(-97);
                class725.method4023(-81);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field1082[--field1090] == 1;
                class111.field1911.method2823(true, class111.field1911.field6728, var213 ? 2 : 1);
                class111.field1911.method2823(true, class111.field1911.field6722, var213 ? 2 : 1);
                class725.method4023(108);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6005) {
                class111.field1911.method2823(true, class111.field1911.field6716, field1082[--field1090] == 1 ? 1 : 0);
                class234.method1579(-97);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6007) {
                class111.field1911.method2823(true, class111.field1911.field6739, field1082[--field1090]);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6008) {
                class111.field1911.method2823(true, class111.field1911.field6718, field1082[--field1090] == 1 ? 1 : 0);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6010) {
                class111.field1911.method2823(true, class111.field1911.field6742, field1082[--field1090] == 1 ? 1 : 0);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6011) {
                class111.field1911.method2823(true, class111.field1911.field6717, field1082[--field1090]);
                class234.method1579(-97);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6012) {
                class111.field1911.method2823(true, class111.field1911.field6749, field1082[--field1090] == 1 ? 1 : 0);
                class463.method2677(-29);
                class596.method3394(9);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6014) {
                class111.field1911.method2823(true, class111.field1911.field6735, field1082[--field1090] == 1 ? 2 : 0);
                class234.method1579(-97);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6015) {
                class111.field1911.method2823(true, class111.field1911.field6765, field1082[--field1090] == 1 ? 1 : 0);
                class234.method1579(-97);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6016) {
                class111.field1911.method2823(true, class111.field1911.field6744, field1082[--field1090]);
                class624.method3517(false, 0, class111.field1911.field6725.method3784((byte) 82));
                class307.method1957(0);
                return;
            }
            if (arg0 == 6017) {
                class111.field1911.method2823(true, class111.field1911.field6751, field1082[--field1090] == 1 ? 1 : 0);
                class179.method1351(30812);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6018) {
                class111.field1911.method2823(true, class111.field1911.field6762, field1082[--field1090]);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field1082[--field1090];
                int var215 = class111.field1911.field6752.method925((byte) 76);
                if (var214 != var215) {
                    if (class787.method4288(class753.field10398, (byte) 91)) {
                        if (var215 == 0 && class520.field7058 != -1) {
                            class374.method2270(class520.field7058, 0, class357.field4898, 0, var214, false);
                            class279.method1787(true);
                            class299.field4117 = false;
                        } else if (var214 == 0) {
                            class643.method3575((byte) -30);
                            class299.field4117 = false;
                        } else {
                            class607.method3447(var214, -95);
                        }
                    }
                    class111.field1911.method2823(true, class111.field1911.field6752, var214);
                    class307.method1957(0);
                    class613.field8533 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class111.field1911.method2823(true, class111.field1911.field6766, field1082[--field1090]);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class111.field1911.field6728.method3987((byte) 56);
                class111.field1911.method2823(true, class111.field1911.field6722, field1082[--field1090] == 1 ? 0 : var216);
                class725.method4023(110);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field1082[--field1090];
                class111.field1911.method2823(true, class111.field1911.field6733, var217);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6024) {
                class111.field1911.method2823(true, class111.field1911.field6715, field1082[--field1090]);
                class307.method1957(0);
                return;
            }
            if (arg0 == 6025) {
                class111.field1911.method2823(true, class111.field1911.field6764, field1082[--field1090]);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field1082[--field1090];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class313.method1986(var218 == 1, (byte) -92);
                return;
            }
            if (arg0 == 6028) {
                class111.field1911.method2823(true, class111.field1911.field6720, field1082[--field1090] == 0 ? 0 : 1);
                class307.method1957(0);
                return;
            }
            if (arg0 == 6029) {
                class111.field1911.method2823(true, class111.field1911.field6739, field1082[--field1090]);
                class307.method1957(0);
                return;
            }
            if (arg0 == 6030) {
                class111.field1911.method2823(true, class111.field1911.field6754, field1082[--field1090] == 0 ? 0 : 1);
                class307.method1957(0);
                class234.method1579(-97);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field1082[--field1090];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class624.method3517(false, 0, var219);
                return;
            }
            if (arg0 == 6032) {
                field1090 -= 2;
                int var220 = field1082[field1090];
                boolean var221 = field1082[field1090 + 1] == 1;
                class111.field1911.method2823(true, class111.field1911.field6753, var220);
                if (!var221) {
                    class111.field1911.method2823(true, class111.field1911.field6750, 0);
                }
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6033) {
                class111.field1911.method2823(true, class111.field1911.field6729, field1082[--field1090]);
                class307.method1957(0);
                return;
            }
            if (arg0 == 6034) {
                class111.field1911.method2823(true, class111.field1911.field6743, field1082[--field1090] == 1 ? 1 : 0);
                class307.method1957(0);
                class463.method2677(125);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class111.field1911.field6756.method3639((byte) 107);
                class111.field1911.method2823(true, class111.field1911.field6734, field1082[--field1090] == 1 ? 1 : var222);
                class234.method1579(-97);
                class725.method4023(-120);
                return;
            }
            if (arg0 == 6036) {
                class111.field1911.method2823(true, class111.field1911.field6758, field1082[--field1090]);
                class307.method1957(0);
                class235.field3375 = true;
                return;
            }
            if (arg0 == 6037) {
                class111.field1911.method2823(true, class111.field1911.field6724, field1082[--field1090]);
                class307.method1957(0);
                class613.field8533 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field1082[--field1090];
                int var224 = class111.field1911.field6761.method925((byte) 107);
                if (var223 != var224 && class520.field7058 == class483.field6535) {
                    if (!class787.method4288(class753.field10398, (byte) 94)) {
                        if (var224 == 0) {
                            class374.method2270(class520.field7058, 0, class357.field4898, 0, var223, false);
                            class279.method1787(true);
                            class299.field4117 = false;
                        } else if (var223 == 0) {
                            class643.method3575((byte) -30);
                            class299.field4117 = false;
                        } else {
                            class607.method3447(var223, -106);
                        }
                    }
                    class111.field1911.method2823(true, class111.field1911.field6761, var223);
                    class307.method1957(0);
                    class613.field8533 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field1082[--field1090];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class111.field1911.field6727.method1779((byte) 55)) {
                    class111.field1911.method2823(true, class111.field1911.field6727, var225);
                    class307.method1957(0);
                    class613.field8533 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field1082[--field1090];
                if (var226 != class111.field1911.field6741.method4322((byte) 94)) {
                    class111.field1911.method2823(true, class111.field1911.field6741, var226);
                    class307.method1957(0);
                    class613.field8533 = false;
                    class185.method1374(111);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1082[field1090++] = class111.field1911.field6726.method53((byte) 77);
                return;
            }
            if (arg0 == 6102) {
                field1082[field1090++] = class111.field1911.field6756.method3639((byte) 99) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1082[field1090++] = class111.field1911.field6728.method3987((byte) 87) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1082[field1090++] = class111.field1911.field6716.method3547((byte) 111) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1082[field1090++] = class111.field1911.field6739.method1463((byte) 114);
                return;
            }
            if (arg0 == 6108) {
                field1082[field1090++] = class111.field1911.field6718.method2964((byte) 99) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1082[field1090++] = class111.field1911.field6742.method2083((byte) 54) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1082[field1090++] = class111.field1911.field6717.method3695((byte) 57);
                return;
            }
            if (arg0 == 6112) {
                field1082[field1090++] = class111.field1911.field6749.method2258((byte) 111) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1082[field1090++] = class111.field1911.field6735.method1135((byte) 70) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1082[field1090++] = class111.field1911.field6765.method330((byte) 122) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1082[field1090++] = class111.field1911.field6744.method2511((byte) 70);
                return;
            }
            if (arg0 == 6117) {
                field1082[field1090++] = class111.field1911.field6751.method2574((byte) 70) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1082[field1090++] = class111.field1911.field6762.method925((byte) 113);
                return;
            }
            if (arg0 == 6119) {
                field1082[field1090++] = class111.field1911.field6752.method925((byte) 114);
                return;
            }
            if (arg0 == 6120) {
                field1082[field1090++] = class111.field1911.field6766.method925((byte) 90);
                return;
            }
            if (arg0 == 6123) {
                field1082[field1090++] = class761.method4212(false);
                return;
            }
            if (arg0 == 6124) {
                field1082[field1090++] = class111.field1911.field6715.method2511((byte) 96);
                return;
            }
            if (arg0 == 6125) {
                field1082[field1090++] = class111.field1911.field6764.method2439((byte) 64);
                return;
            }
            if (arg0 == 6127) {
                field1082[field1090++] = class111.field1911.field6760.method1226((byte) 78) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1082[field1090++] = class111.field1911.field6720.method3404((byte) 122) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1082[field1090++] = class111.field1911.field6739.method1463((byte) 110);
                return;
            }
            if (arg0 == 6130) {
                field1082[field1090++] = class111.field1911.field6754.method3467((byte) 119) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1082[field1090++] = class111.field1911.field6725.method3784((byte) 60);
                return;
            }
            if (arg0 == 6132) {
                field1082[field1090++] = class111.field1911.field6753.method3784((byte) 63);
                return;
            }
            if (arg0 == 6133) {
                field1082[field1090++] = class630.field8751.field10241 && !class630.field8751.field10253 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field1082[field1090++] = class111.field1911.field6729.method1648((byte) 91);
                return;
            }
            if (arg0 == 6136) {
                field1082[field1090++] = class111.field1911.field6743.method3385((byte) 93) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field1082[field1090++] = class591.method3384(class111.field1911.field6725.method3784((byte) 71), 200, 7762);
                return;
            }
            if (arg0 == 6139) {
                field1082[field1090++] = class111.field1911.field6758.method1364((byte) 89);
                return;
            }
            if (arg0 == 6142) {
                field1082[field1090++] = class111.field1911.field6724.method925((byte) 90);
                return;
            }
            if (arg0 == 6143) {
                field1082[field1090++] = class111.field1911.field6761.method925((byte) 83);
                return;
            }
            if (arg0 == 6144) {
                field1082[field1090++] = class714.field9824 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field1082[field1090++] = class111.field1911.field6727.method1779((byte) 119);
                return;
            }
            if (arg0 == 6146) {
                field1082[field1090++] = class111.field1911.field6741.method4322((byte) 72);
                return;
            }
            if (arg0 == 6147) {
                field1082[field1090++] = class682.field9503.field9139 < 512 || class714.field9824 || class398.field5488 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field1082[field1090++] = class464.field6311 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1090 -= 2;
                class195.field2982 = (short) field1082[field1090];
                if (class195.field2982 <= 0) {
                    class195.field2982 = 256;
                }
                class584.field8263 = (short) field1082[field1090 + 1];
                if (class584.field8263 <= 0) {
                    class584.field8263 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1090 -= 2;
                class56.field797 = (short) field1082[field1090];
                if (class56.field797 <= 0) {
                    class56.field797 = 256;
                }
                class274.field3817 = (short) field1082[field1090 + 1];
                if (class274.field3817 <= 0) {
                    class274.field3817 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1090 -= 4;
                class443.field6015 = (short) field1082[field1090];
                if (class443.field6015 <= 0) {
                    class443.field6015 = 1;
                }
                class304.field4180 = (short) field1082[field1090 + 1];
                if (class304.field4180 <= 0) {
                    class304.field4180 = 32767;
                } else if (class304.field4180 < class443.field6015) {
                    class304.field4180 = class443.field6015;
                }
                class97.field1569 = (short) field1082[field1090 + 2];
                if (class97.field1569 <= 0) {
                    class97.field1569 = 1;
                }
                class199.field3012 = (short) field1082[field1090 + 3];
                if (class199.field3012 <= 0) {
                    class199.field3012 = 32767;
                    return;
                }
                if (class199.field3012 < class97.field1569) {
                    class199.field3012 = class97.field1569;
                }
                return;
            }
            if (arg0 == 6203) {
                class491.method2816(0, 36, class450.field6174.field347, class450.field6174.field330, false, 0);
                field1082[field1090++] = class552.field7815;
                field1082[field1090++] = class341.field4604;
                return;
            }
            if (arg0 == 6204) {
                field1082[field1090++] = class56.field797;
                field1082[field1090++] = class274.field3817;
                return;
            }
            if (arg0 == 6205) {
                field1082[field1090++] = class195.field2982;
                field1082[field1090++] = class584.field8263;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1082[field1090++] = (int) (class197.method1423(1) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1082[field1090++] = (int) (class197.method1423(1) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1090 -= 3;
                int var227 = field1082[field1090];
                int var228 = field1082[field1090 + 1];
                int var229 = field1082[field1090 + 2];
                long var230 = class499.method2855(true, var229, 0, var228, 12, 0, var227);
                int var232 = class593.method3390((byte) -71, var230);
                if (var229 < 1970) {
                    var232--;
                }
                field1082[field1090++] = var232;
                return;
            }
            if (arg0 == 6303) {
                field1082[field1090++] = class183.method1368(class197.method1423(1), 110);
                return;
            }
            if (arg0 == 6304) {
                int var233 = field1082[--field1090];
                boolean var234 = true;
                if (var233 < 0) {
                    var234 = (var233 + 1) % 4 == 0;
                } else if (var233 < 1582) {
                    var234 = var233 % 4 == 0;
                } else if (var233 % 4 != 0) {
                    var234 = false;
                } else if (var233 % 100 != 0) {
                    var234 = true;
                } else if (var233 % 400 != 0) {
                    var234 = false;
                }
                field1082[field1090++] = var234 ? 1 : 0;
                return;
            }
            if (arg0 == 6305) {
                int var235 = field1082[--field1090];
                int[] var236 = class224.method1534((byte) 75, var235);
                class275.method1770(var236, 0, field1082, field1090, 3);
                field1090 += 3;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1082[field1090++] = class676.method3811(78) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1082[field1090++] = class119.method1051(46) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class753.field10398 == 7 && class517.field7034 == 0 && class70.field1043 == 0) {
                    if (class492.field6747) {
                        field1082[field1090++] = 0;
                        return;
                    }
                    if (class102.field1648 > class197.method1423(1) - 1000L) {
                        field1082[field1090++] = 1;
                        return;
                    }
                    class492.field6747 = true;
                    class537 var237 = class476.method2729(class436.field5939, (byte) -46, class551.field7498);
                    var237.field7295.method759(class766.field10572, 120);
                    class173.method1314(false, var237);
                    field1082[field1090++] = 0;
                    return;
                }
                field1082[field1090++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class732 var238 = class652.method3658((byte) -50);
                if (var238 != null) {
                    field1082[field1090++] = var238.field10096;
                    field1082[field1090++] = var238.field5323;
                    field1078[field1079++] = var238.field10095;
                    class787 var239 = var238.method4066(-126);
                    field1082[field1090++] = var239.field10802;
                    field1078[field1079++] = var239.field10800;
                    field1082[field1090++] = var238.field5326;
                    field1082[field1090++] = var238.field10097;
                    field1078[field1079++] = var238.field10099;
                    return;
                }
                field1082[field1090++] = -1;
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                field1082[field1090++] = 0;
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 6502) {
                class732 var240 = class210.method1473(-106);
                if (var240 != null) {
                    field1082[field1090++] = var240.field10096;
                    field1082[field1090++] = var240.field5323;
                    field1078[field1079++] = var240.field10095;
                    class787 var241 = var240.method4066(-123);
                    field1082[field1090++] = var241.field10802;
                    field1078[field1079++] = var241.field10800;
                    field1082[field1090++] = var240.field5326;
                    field1082[field1090++] = var240.field10097;
                    field1078[field1079++] = var240.field10099;
                    return;
                }
                field1082[field1090++] = -1;
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                field1082[field1090++] = 0;
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var242 = field1082[--field1090];
                String var243 = field1078[--field1079];
                if (class753.field10398 == 7 && class517.field7034 == 0 && class70.field1043 == 0) {
                    field1082[field1090++] = class682.method3844(-67, var243, var242) ? 1 : 0;
                    return;
                }
                field1082[field1090++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var244 = field1082[--field1090];
                class732 var245 = class324.method2062(var244, (byte) -125);
                if (var245 != null) {
                    field1082[field1090++] = var245.field5323;
                    field1078[field1079++] = var245.field10095;
                    class787 var246 = var245.method4066(-122);
                    field1082[field1090++] = var246.field10802;
                    field1078[field1079++] = var246.field10800;
                    field1082[field1090++] = var245.field5326;
                    field1082[field1090++] = var245.field10097;
                    field1078[field1079++] = var245.field10099;
                    return;
                }
                field1082[field1090++] = -1;
                field1078[field1079++] = "";
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                field1082[field1090++] = 0;
                field1082[field1090++] = 0;
                field1078[field1079++] = "";
                return;
            }
            if (arg0 == 6507) {
                field1090 -= 4;
                int var247 = field1082[field1090];
                boolean var248 = field1082[field1090 + 1] == 1;
                int var249 = field1082[field1090 + 2];
                boolean var250 = field1082[field1090 + 3] == 1;
                class418.method2461(107, var250, var248, var249, var247);
                return;
            }
            if (arg0 == 6508) {
                class404.method2415((byte) -120);
                return;
            }
            if (arg0 == 6509) {
                if (class753.field10398 != 7) {
                    return;
                }
                class41.field664 = field1082[--field1090] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1082[field1090++] = class655.field9070;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class643.field8897 == class563.field7973) {
                if (arg0 == 6700) {
                    int var251 = class186.field2881.method343(-120);
                    if (class359.field4911 != -1) {
                        var251++;
                    }
                    field1082[field1090++] = var251;
                    return;
                }
                if (arg0 == 6701) {
                    int var252 = field1082[--field1090];
                    if (class359.field4911 != -1) {
                        if (var252 == 0) {
                            field1082[field1090++] = class359.field4911;
                            return;
                        }
                        var252--;
                    }
                    class637 var253 = (class637) class186.field2881.method335(-29067);
                    while (var252-- > 0) {
                        var253 = (class637) class186.field2881.method336(119);
                    }
                    field1082[field1090++] = var253.field8789;
                    return;
                }
                if (arg0 == 6702) {
                    int var254 = field1082[--field1090];
                    if (class431.field5870[var254] == null) {
                        field1078[field1079++] = "";
                        return;
                    }
                    String var255 = class431.field5870[var254][0].field408;
                    if (var255 == null) {
                        field1078[field1079++] = "";
                        return;
                    }
                    field1078[field1079++] = var255.substring(0, var255.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var256 = field1082[--field1090];
                    if (class431.field5870[var256] == null) {
                        field1082[field1090++] = 0;
                        return;
                    }
                    field1082[field1090++] = class431.field5870[var256].length;
                    return;
                }
                if (arg0 == 6704) {
                    field1090 -= 2;
                    int var257 = field1082[field1090];
                    int var258 = field1082[field1090 + 1];
                    if (class431.field5870[var257] == null) {
                        field1078[field1079++] = "";
                        return;
                    }
                    String var259 = class431.field5870[var257][var258].field408;
                    if (var259 == null) {
                        field1078[field1079++] = "";
                        return;
                    }
                    field1078[field1079++] = var259;
                    return;
                }
                if (arg0 == 6705) {
                    field1090 -= 2;
                    int var260 = field1082[field1090];
                    int var261 = field1082[field1090 + 1];
                    if (class431.field5870[var260] == null) {
                        field1082[field1090++] = 0;
                        return;
                    }
                    field1082[field1090++] = class431.field5870[var260][var261].field294;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field1090 -= 3;
                    int var262 = field1082[field1090];
                    int var263 = field1082[field1090 + 1];
                    int var264 = field1082[field1090 + 2];
                    class736.method4083(var262 << 16 | var263, -26207, var264, "", 1);
                    return;
                }
                if (arg0 == 6708) {
                    field1090 -= 3;
                    int var265 = field1082[field1090];
                    int var266 = field1082[field1090 + 1];
                    int var267 = field1082[field1090 + 2];
                    class736.method4083(var265 << 16 | var266, -26207, var267, "", 2);
                    return;
                }
                if (arg0 == 6709) {
                    field1090 -= 3;
                    int var268 = field1082[field1090];
                    int var269 = field1082[field1090 + 1];
                    int var270 = field1082[field1090 + 2];
                    class736.method4083(var268 << 16 | var269, -26207, var270, "", 3);
                    return;
                }
                if (arg0 == 6710) {
                    field1090 -= 3;
                    int var271 = field1082[field1090];
                    int var272 = field1082[field1090 + 1];
                    int var273 = field1082[field1090 + 2];
                    class736.method4083(var271 << 16 | var272, -26207, var273, "", 4);
                    return;
                }
                if (arg0 == 6711) {
                    field1090 -= 3;
                    int var274 = field1082[field1090];
                    int var275 = field1082[field1090 + 1];
                    int var276 = field1082[field1090 + 2];
                    class736.method4083(var274 << 16 | var275, -26207, var276, "", 5);
                    return;
                }
                if (arg0 == 6712) {
                    field1090 -= 3;
                    int var277 = field1082[field1090];
                    int var278 = field1082[field1090 + 1];
                    int var279 = field1082[field1090 + 2];
                    class736.method4083(var277 << 16 | var278, -26207, var279, "", 6);
                    return;
                }
                if (arg0 == 6713) {
                    field1090 -= 3;
                    int var280 = field1082[field1090];
                    int var281 = field1082[field1090 + 1];
                    int var282 = field1082[field1090 + 2];
                    class736.method4083(var280 << 16 | var281, -26207, var282, "", 7);
                    return;
                }
                if (arg0 == 6714) {
                    field1090 -= 3;
                    int var283 = field1082[field1090];
                    int var284 = field1082[field1090 + 1];
                    int var285 = field1082[field1090 + 2];
                    class736.method4083(var283 << 16 | var284, -26207, var285, "", 8);
                    return;
                }
                if (arg0 == 6715) {
                    field1090 -= 3;
                    int var286 = field1082[field1090];
                    int var287 = field1082[field1090 + 1];
                    int var288 = field1082[field1090 + 2];
                    class736.method4083(var286 << 16 | var287, -26207, var288, "", 9);
                    return;
                }
                if (arg0 == 6716) {
                    field1090 -= 3;
                    int var289 = field1082[field1090];
                    int var290 = field1082[field1090 + 1];
                    int var291 = field1082[field1090 + 2];
                    class736.method4083(var289 << 16 | var290, -26207, var291, "", 10);
                    return;
                }
                if (arg0 == 6717) {
                    field1090 -= 3;
                    int var292 = field1082[field1090];
                    int var293 = field1082[field1090 + 1];
                    int var294 = field1082[field1090 + 2];
                    class17 var295 = class326.method2066(var294, var292 << 16 | var293, 72);
                    class200.method1443(false);
                    class698 var296 = client.method2010(var295);
                    class301.method1932(var296.field9641, (byte) -114, var296.method3889(true), var295);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var297 = field1082[--field1090];
                    class393 var298 = class430.field5863.method4031(36, var297);
                    if (var298.field5395 == null) {
                        field1078[field1079++] = "";
                        return;
                    }
                    field1078[field1079++] = var298.field5395;
                    return;
                }
                if (arg0 == 6801) {
                    int var299 = field1082[--field1090];
                    class393 var300 = class430.field5863.method4031(36, var299);
                    field1082[field1090++] = var300.field5401;
                    return;
                }
                if (arg0 == 6802) {
                    int var301 = field1082[--field1090];
                    class393 var302 = class430.field5863.method4031(36, var301);
                    field1082[field1090++] = var302.field5408;
                    return;
                }
                if (arg0 == 6803) {
                    int var303 = field1082[--field1090];
                    class393 var304 = class430.field5863.method4031(36, var303);
                    field1082[field1090++] = var304.field5430;
                    return;
                }
                if (arg0 == 6804) {
                    field1090 -= 2;
                    int var305 = field1082[field1090];
                    int var306 = field1082[field1090 + 1];
                    class485 var307 = class117.field2153.method1159((byte) -127, var306);
                    if (var307.method2776((byte) 79)) {
                        field1078[field1079++] = class430.field5863.method4031(36, var305).method2376(9772, var307.field6554, var306);
                        return;
                    }
                    field1082[field1090++] = class430.field5863.method4031(36, var305).method2379((byte) 33, var307.field6560, var306);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field1082[field1090++] = class686.field9536 && !class282.field3916 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field1082[field1090++] = (int) (class129.field2252 / 60000L);
                    field1082[field1090++] = class724.field9962 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field1082[field1090++] = class63.field867;
                    return;
                }
                if (arg0 == 6903) {
                    field1082[field1090++] = class46.field716;
                    return;
                }
                if (arg0 == 6904) {
                    field1082[field1090++] = class561.field7962;
                    return;
                }
                if (arg0 == 6905) {
                    String var308 = "";
                    if (class517.field7033 != null) {
                        if (class517.field7033.field7416 == null) {
                            var308 = class230.method1564(class517.field7033.field7414, -25142);
                        } else {
                            var308 = (String) class517.field7033.field7416;
                        }
                    }
                    field1078[field1079++] = var308;
                    return;
                }
                if (arg0 == 6906) {
                    field1082[field1090++] = class4.field41;
                    return;
                }
                if (arg0 == 6907) {
                    field1082[field1090++] = class706.field9707;
                    return;
                }
                if (arg0 == 6908) {
                    field1082[field1090++] = class185.field2876;
                    return;
                }
                if (arg0 == 6909) {
                    field1082[field1090++] = class749.field10333 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field1082[field1090++] = class740.field10213;
                    return;
                }
                if (arg0 == 6911) {
                    field1082[field1090++] = class70.field1044;
                    return;
                }
                if (arg0 == 6912) {
                    field1082[field1090++] = class220.field3230;
                    return;
                }
                if (arg0 == 6913) {
                    field1082[field1090++] = class530.field7180;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var309 = class263.method1718(-24290);
                    field1082[field1090++] = class644.field8906 = class111.field1911.field6725.method3784((byte) 103);
                    field1082[field1090++] = var309;
                    class234.method1579(-97);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class358.method2208(-120);
                    class234.method1579(-97);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class337.method2110((byte) -85);
                    class234.method1579(-97);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class567.method3272(true);
                    class234.method1579(-97);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class124.method1072(true, -121);
                    class234.method1579(-97);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class111.field1911.method2823(true, class111.field1911.field6750, 0);
                    class307.method1957(0);
                    class613.field8533 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class644.field8906 == 2) {
                        class776.field10710 = true;
                        return;
                    }
                    if (class644.field8906 == 1) {
                        class500.field6846 = true;
                        return;
                    }
                    if (class644.field8906 == 3) {
                        class382.field5195 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field1082[field1090++] = class111.field1911.field6750.method3991((byte) 119);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field1090 -= 2;
                    int var310 = field1082[field1090];
                    int var311 = field1082[field1090 + 1];
                    if (var310 != -1) {
                        if (var311 > 255) {
                            var311 = 255;
                        } else if (var311 < 0) {
                            var311 = 0;
                        }
                        class152.method1198(var311, false, (byte) -98, var310);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var312 = field1082[--field1090];
                    if (var312 != -1) {
                        class768.method4227(-18974, var312);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var313 = field1082[--field1090];
                    if (var313 != -1) {
                        class87.method691(-80, var313);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field1082[field1090++] = class444.method2576("jagtheora", (byte) 105) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field1082[field1090++] = class111.field1911.field6716.method3548(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field1082[field1090++] = class111.field1911.field6742.method2086(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field1082[field1090++] = class111.field1911.field6717.method3692(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field1082[field1090++] = class111.field1911.field6735.method1137(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field1082[field1090++] = class111.field1911.field6715.method2509(0) && class95.field1472.method524() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field1082[field1090++] = class111.field1911.field6733.method2092(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field1082[field1090++] = class111.field1911.field6764.method2437(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field1082[field1090++] = class111.field1911.field6760.method1227(0) && class95.field1472.method485() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field1082[field1090++] = class111.field1911.field6754.method3465(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field1082[field1090++] = class111.field1911.field6743.method3386(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field1082[field1090++] = class111.field1911.field6758.method1366(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field1082[field1090++] = class111.field1911.field6765.method329(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field1082[field1090++] = class111.field1911.field6741.method4323(0) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field1082[field1090++] = class111.field1911.field6753.method3780(0) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var314 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6716.method57(var314, 0);
                    return;
                }
                if (arg0 == 7302) {
                    int var315 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6742.method57(var315, 0);
                    return;
                }
                if (arg0 == 7303) {
                    int var316 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6717.method57(var316, 0);
                    return;
                }
                if (arg0 == 7304) {
                    int var317 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6735.method57(var317, 0);
                    return;
                }
                if (arg0 == 7305) {
                    int var318 = field1082[--field1090];
                    if (!class95.field1472.method524()) {
                        field1082[field1090++] = 3;
                        return;
                    }
                    field1082[field1090++] = class111.field1911.field6715.method57(var318, 0);
                    return;
                }
                if (arg0 == 7306) {
                    int var319 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6733.method57(var319, 0);
                    return;
                }
                if (arg0 == 7307) {
                    int var320 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6764.method57(var320, 0);
                    return;
                }
                if (arg0 == 7308) {
                    int var321 = field1082[--field1090];
                    if (!class95.field1472.method485()) {
                        field1082[field1090++] = 3;
                        return;
                    }
                    field1082[field1090++] = class111.field1911.field6760.method57(var321, 0);
                    return;
                }
                if (arg0 == 7309) {
                    int var322 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6754.method57(var322, 0);
                    return;
                }
                if (arg0 == 7310) {
                    int var323 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6743.method57(var323, 0);
                    return;
                }
                if (arg0 == 7311) {
                    int var324 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6758.method57(var324, 0);
                    return;
                }
                if (arg0 == 7312) {
                    int var325 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6765.method57(var325, 0);
                    return;
                }
                if (arg0 == 7313) {
                    int var326 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6741.method57(var326, 0);
                    return;
                }
                if (arg0 == 7314) {
                    int var327 = field1082[--field1090];
                    field1082[field1090++] = class111.field1911.field6753.method57(var327, 0);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "(I)I")
    private static final int method658(int arg0) {
        class126 var1 = class624.field8698.method4265(-114, arg0);
        if (var1 == null) {
            throw new RuntimeException("sr-c112");
        }
        Integer var2 = field1076.method1811((byte) 121, class177.field2797.field8378 << 16 | arg0);
        if (var2 == null) {
            return var1.field2221 == 'i' || var1.field2221 == '1' ? 0 : -1;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "(I)V")
    private static final void method659(int arg0) {
        class17 var1 = class379.method2309(arg0, 192);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class17[] var3 = class79.field1113[var2];
        if (var3 == null) {
            class17[] var4 = class431.field5870[var2];
            int var5 = var4.length;
            var3 = class79.field1113[var2] = new class17[var5];
            class275.method1769(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class275.method1769(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lmo;II)V")
    public static final void method660(class780 arg0, int arg1, int arg2) {
        class344 var3 = class600.method3406(arg0, arg1, arg2, 3075);
        if (var3 == null) {
            return;
        }
        field1102 = new int[var3.field4637];
        field1103 = new String[var3.field4622];
        if (class661.field9159 == var3.field4623 || class666.field9270 == var3.field4623 || class240.field3418 == var3.field4623) {
            int var4 = 0;
            int var5 = 0;
            if (class488.field6583 != null) {
                var4 = class488.field6583.field248;
                var5 = class488.field6583.field416;
            }
            field1102[0] = class420.field5727.method1326((byte) -76) - var4;
            field1102[1] = class420.field5727.method1319((byte) 126) - var5;
        }
        method647(var3, 200000);
    }
}
