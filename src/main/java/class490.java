import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class490 {

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field7147 = new String[1000];

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "[I")
    private static int[] field7143 = new int[5];

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    private static int field7141 = 0;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "[Lir;")
    private static class19[] field7151 = new class19[50];

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    private static int field7142 = 0;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "[I")
    private static int[] field7140 = new int[1000];

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    private static int field7158 = 0;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "[[I")
    private static int[][] field7152 = new int[5][5000];

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7161 = Calendar.getInstance();

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field7164 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "[I")
    private static int[] field7166 = new int[3];

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Lad;")
    public static class11 field7165 = new class11(4);

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    private static int field7167 = 0;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "Lrs;")
    private static class216 field7148;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Leo;")
    private static class423 field7146;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "Leo;")
    private static class423 field7156;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "[I")
    private static int[] field7145;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "[Ljava/lang/String;")
    private static String[] field7139;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "()V")
    public static void method2922() {
        field7145 = null;
        field7139 = null;
        field7143 = null;
        field7152 = null;
        field7140 = null;
        field7147 = null;
        field7151 = null;
        field7146 = null;
        field7156 = null;
        field7148 = null;
        field7161 = null;
        field7164 = null;
        field7166 = null;
        field7165 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V")
    public static final void method2923(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lpl;I)V")
    private static final void method2924(class457 arg0, int arg1) {
        field7158 = 0;
        field7142 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6375;
        int[] var4 = arg0.field6370;
        byte var5 = -1;
        field7141 = 0;
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
                        method2925(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2926(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7140[field7158++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7140[field7158++] = class198.field2555.field2396[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class198.field2555.method1213(field7140[--field7158], true, var8);
                } else if (var43 == 3) {
                    field7147[field7142++] = arg0.field6381[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7158 -= 2;
                    if (field7140[field7158 + 1] != field7140[field7158]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7158 -= 2;
                    if (field7140[field7158 + 1] == field7140[field7158]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7158 -= 2;
                    if (field7140[field7158] < field7140[field7158 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7158 -= 2;
                    if (field7140[field7158] > field7140[field7158 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7141 == 0) {
                        return;
                    }
                    class19 var9 = field7151[--field7141];
                    arg0 = var9.field330;
                    var3 = arg0.field6375;
                    var4 = arg0.field6370;
                    var2 = var9.field334;
                    field7145 = var9.field332;
                    field7139 = var9.field327;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7140[field7158++] = class198.field2555.method1049(var10, (byte) 72);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class198.field2555.method1214(var11, field7140[--field7158], (byte) 84);
                } else if (var43 == 31) {
                    field7158 -= 2;
                    if (field7140[field7158] <= field7140[field7158 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7158 -= 2;
                    if (field7140[field7158] >= field7140[field7158 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7140[field7158++] = field7145[var4[var2]];
                } else if (var43 == 34) {
                    field7145[var4[var2]] = field7140[--field7158];
                } else if (var43 == 35) {
                    field7147[field7142++] = field7139[var4[var2]];
                } else if (var43 == 36) {
                    field7139[var4[var2]] = field7147[--field7142];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7142 -= var12;
                    String var13 = class437.method2578(var12, field7147, false, field7142);
                    field7147[field7142++] = var13;
                } else if (var43 == 38) {
                    field7158--;
                } else if (var43 == 39) {
                    field7142--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class457 var15 = class326.method1938(0, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6379];
                    String[] var17 = new String[var15.field6372];
                    for (int var18 = 0; var18 < var15.field6369; var18++) {
                        var16[var18] = field7140[field7158 + var18 - var15.field6369];
                    }
                    for (int var19 = 0; var19 < var15.field6374; var19++) {
                        var17[var19] = field7147[field7142 + var19 - var15.field6374];
                    }
                    field7158 -= var15.field6369;
                    field7142 -= var15.field6374;
                    class19 var20 = new class19();
                    var20.field330 = arg0;
                    var20.field334 = var2;
                    var20.field332 = field7145;
                    var20.field327 = field7139;
                    if (field7141 >= field7151.length) {
                        throw new RuntimeException();
                    }
                    field7151[field7141++] = var20;
                    arg0 = var15;
                    var3 = var15.field6375;
                    var4 = var15.field6370;
                    var2 = -1;
                    field7145 = var16;
                    field7139 = var17;
                } else if (var43 == 42) {
                    field7140[field7158++] = class276.field3537[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class276.field3537[var21] = field7140[--field7158];
                    class74.method425(var21, (byte) -112);
                    class374.field4865 |= class346.field4415[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7140[--field7158];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7143[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7152[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7140[--field7158];
                    if (var28 < 0 || var28 >= field7143[var27]) {
                        throw new RuntimeException();
                    }
                    field7140[field7158++] = field7152[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7158 -= 2;
                    int var30 = field7140[field7158];
                    if (var30 < 0 || var30 >= field7143[var29]) {
                        throw new RuntimeException();
                    }
                    field7152[var29][var30] = field7140[field7158 + 1];
                } else if (var43 == 47) {
                    String var31 = class340.field4341[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7147[field7142++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class340.field4341[var32] = field7147[--field7142];
                    class7.method51(var32, (byte) -1);
                } else if (var43 == 51) {
                    class357 var33 = arg0.field6382[var4[var2]];
                    class206 var34 = (class206) var33.method2085((long) field7140[--field7158], -5423);
                    if (var34 != null) {
                        var2 += var34.field2681;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6368 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7456).append(" ");
                for (int var41 = field7141 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7151[var41].field330.field7456).append(" ");
                }
                var40.append("op: ").append(var5);
                class375.method2192((byte) 116, var42, var40.toString());
            } else {
                class360.method2120("Clientscript error in: " + arg0.field6368, 111);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6368).append("\n");
                for (int var38 = field7141 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7151[var38].field330.field6368).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class375.method2192((byte) -21, var42, var37.toString());
                class258.method1617(var37.toString(), 96);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IZ)V")
    private static final void method2925(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7158 -= 3;
                int var2 = field7140[field7158];
                int var3 = field7140[field7158 + 1];
                int var4 = field7140[field7158 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class423 var5 = class497.method2965(0, var2);
                if (var5.field5679 == null) {
                    var5.field5679 = new class423[var4 + 1];
                }
                if (var5.field5679.length <= var4) {
                    class423[] var6 = new class423[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5679.length; var7++) {
                        var6[var7] = var5.field5679[var7];
                    }
                    var5.field5679 = var6;
                }
                if (var4 > 0 && var5.field5679[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class423 var8 = new class423();
                var8.field5741 = var3;
                var8.field5823 = var8.field5734 = var5.field5734;
                var8.field5756 = var4;
                var5.field5679[var4] = var8;
                if (arg1) {
                    field7156 = var8;
                } else {
                    field7146 = var8;
                }
                class415.method2440(10, var5);
                return;
            }
            if (arg0 == 101) {
                class423 var9 = arg1 ? field7156 : field7146;
                if (var9.field5756 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class423 var10 = class497.method2965(0, var9.field5734);
                var10.field5679[var9.field5756] = null;
                class415.method2440(10, var10);
                return;
            }
            if (arg0 == 102) {
                class423 var11 = class497.method2965(0, field7140[--field7158]);
                var11.field5679 = null;
                class415.method2440(10, var11);
                return;
            }
            if (arg0 == 200) {
                field7158 -= 2;
                int var12 = field7140[field7158];
                int var13 = field7140[field7158 + 1];
                class423 var14 = class520.method3091(var12, (byte) 126, var13);
                if (var14 != null && var13 != -1) {
                    field7140[field7158++] = 1;
                    if (arg1) {
                        field7156 = var14;
                        return;
                    }
                    field7146 = var14;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7140[--field7158];
                class423 var16 = class497.method2965(0, var15);
                if (var16 != null) {
                    field7140[field7158++] = 1;
                    if (arg1) {
                        field7156 = var16;
                        return;
                    }
                    field7146 = var16;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7140[--field7158];
                method2929(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7140[--field7158];
                method2930(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7158 -= 2;
                int var19 = field7140[field7158];
                int var20 = field7140[field7158 + 1];
                for (int var21 = 0; var21 < class417.field5550.length; var21++) {
                    if (class417.field5550[var21] == var19) {
                        class37.field573.field7655.method2032(var20, class167.field2161, 67, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class514.field7568.length; var22++) {
                    if (class514.field7568[var22] == var19) {
                        class37.field573.field7655.method2032(var20, class167.field2161, -100, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7158 -= 2;
                int var23 = field7140[field7158];
                int var24 = field7140[field7158 + 1];
                class37.field573.field7655.method2030(var23, -52, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7140[--field7158] != 0;
                class37.field573.field7655.method2021((byte) 112, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class423 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class497.method2965(0, field7140[--field7158]);
            } else {
                var26 = arg1 ? field7156 : field7146;
            }
            if (arg0 == 1000) {
                field7158 -= 4;
                var26.field5757 = field7140[field7158];
                var26.field5752 = field7140[field7158 + 1];
                int var27 = field7140[field7158 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field7140[field7158 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field5788 = (byte) var27;
                var26.field5751 = (byte) var28;
                class415.method2440(10, var26);
                class326.method1940(2574, var26);
                if (var26.field5756 == -1) {
                    class232.method1476(9880, var26.field5734);
                }
                return;
            }
            if (arg0 == 1001) {
                field7158 -= 4;
                var26.field5700 = field7140[field7158];
                var26.field5776 = field7140[field7158 + 1];
                var26.field5796 = 0;
                var26.field5742 = 0;
                int var29 = field7140[field7158 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field7140[field7158 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field5747 = (byte) var29;
                var26.field5789 = (byte) var30;
                class415.method2440(10, var26);
                class326.method1940(2574, var26);
                if (var26.field5741 == 0) {
                    class474.method2838(false, var26, 23311);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field7140[--field7158] == 1;
                if (var26.field5672 != var31) {
                    var26.field5672 = var31;
                    class415.method2440(10, var26);
                }
                if (var26.field5756 == -1) {
                    class272.method1675(var26.field5734, 102);
                }
                return;
            }
            if (arg0 == 1004) {
                field7158 -= 2;
                var26.field5785 = field7140[field7158];
                var26.field5774 = field7140[field7158 + 1];
                class415.method2440(10, var26);
                class326.method1940(2574, var26);
                if (var26.field5741 == 0) {
                    class474.method2838(false, var26, 23311);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field5818 = field7140[--field7158] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class423 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class497.method2965(0, field7140[--field7158]);
            } else {
                var32 = arg1 ? field7156 : field7146;
            }
            if (arg0 == 1100) {
                field7158 -= 2;
                var32.field5678 = field7140[field7158];
                if (var32.field5678 > var32.field5797 - var32.field5735) {
                    var32.field5678 = var32.field5797 - var32.field5735;
                }
                if (var32.field5678 < 0) {
                    var32.field5678 = 0;
                }
                var32.field5686 = field7140[field7158 + 1];
                if (var32.field5686 > var32.field5768 - var32.field5726) {
                    var32.field5686 = var32.field5768 - var32.field5726;
                }
                if (var32.field5686 < 0) {
                    var32.field5686 = 0;
                }
                class415.method2440(10, var32);
                if (var32.field5756 == -1) {
                    class514.method3062(13665, var32.field5734);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field5728 = field7140[--field7158];
                class415.method2440(10, var32);
                if (var32.field5756 == -1) {
                    class104.method695((byte) -107, var32.field5734);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field5739 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field5814 = field7140[--field7158];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field5674 = field7140[--field7158];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field7140[--field7158];
                if (var32.field5703 != var33) {
                    var32.field5703 = var33;
                    class415.method2440(10, var32);
                }
                if (var32.field5756 == -1) {
                    class290.method1753(14, var32.field5734);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field5793 = field7140[--field7158];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field5713 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field5727 = 1;
                var32.field5677 = field7140[--field7158];
                class415.method2440(10, var32);
                if (var32.field5756 == -1) {
                    class30.method208(var32.field5734, -1);
                }
                return;
            }
            if (arg0 == 1109) {
                field7158 -= 6;
                var32.field5795 = field7140[field7158];
                var32.field5670 = field7140[field7158 + 1];
                var32.field5669 = field7140[field7158 + 2];
                var32.field5766 = field7140[field7158 + 3];
                var32.field5773 = field7140[field7158 + 4];
                var32.field5762 = field7140[field7158 + 5];
                class415.method2440(10, var32);
                if (var32.field5756 == -1) {
                    class290.method1752(var32.field5734, true);
                    class256.method1607(var32.field5734, 11613);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field7140[--field7158];
                if (var32.field5792 != var34) {
                    var32.field5792 = var34;
                    var32.field5667 = 0;
                    var32.field5807 = 1;
                    var32.field5691 = 0;
                    class415.method2440(10, var32);
                }
                if (var32.field5756 == -1) {
                    class215.method1365(var32.field5734, -86);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field5675 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field7147[--field7142];
                if (!var35.equals(var32.field5758)) {
                    var32.field5758 = var35;
                    class415.method2440(10, var32);
                }
                if (var32.field5756 == -1) {
                    class22.method157(var32.field5734, 31898);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field5821 = field7140[--field7158];
                class415.method2440(10, var32);
                if (var32.field5756 == -1) {
                    class2.method8(-117, var32.field5734);
                }
                return;
            }
            if (arg0 == 1114) {
                field7158 -= 3;
                var32.field5671 = field7140[field7158];
                var32.field5663 = field7140[field7158 + 1];
                var32.field5715 = field7140[field7158 + 2];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field5705 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field5673 = field7140[--field7158];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field5736 = field7140[--field7158];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field5744 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field5738 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1120) {
                field7158 -= 2;
                var32.field5797 = field7140[field7158];
                var32.field5768 = field7140[field7158 + 1];
                class415.method2440(10, var32);
                if (var32.field5741 == 0) {
                    class474.method2838(false, var32, 23311);
                }
                return;
            }
            if (arg0 == 1121) {
                field7158 -= 2;
                var32.field5777 = (short) field7140[field7158];
                var32.field5731 = (short) field7140[field7158 + 1];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field5761 = field7140[--field7158] == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field5762 = field7140[--field7158];
                class415.method2440(10, var32);
                if (var32.field5756 == -1) {
                    class290.method1752(var32.field5734, true);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field7140[--field7158];
                var32.field5729 = var36 == 1;
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1125) {
                field7158 -= 2;
                var32.field5825 = field7140[field7158];
                var32.field5794 = field7140[field7158 + 1];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field5759 = field7140[--field7158];
                class415.method2440(10, var32);
                return;
            }
            if (arg0 == 1127) {
                field7158 -= 2;
                int var37 = field7140[field7158];
                int var38 = field7140[field7158 + 1];
                class483 var39 = class495.field7242.method1837(11, var37);
                if (var39.field7035 != var38) {
                    var32.method2501(var38, 1, var37);
                    return;
                }
                var32.method2504(var37, (byte) 111);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field7140[--field7158];
                String var41 = field7147[--field7142];
                class483 var42 = class495.field7242.method1837(11, var40);
                if (!var42.field7033.equals(var41)) {
                    var32.method2495(var40, var41, (byte) 125);
                    return;
                }
                var32.method2504(var40, (byte) 83);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class423 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class497.method2965(0, field7140[--field7158]);
            } else {
                var43 = arg1 ? field7156 : field7146;
            }
            class415.method2440(10, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7158 -= 2;
                int var44 = field7140[field7158];
                int var45 = field7140[field7158 + 1];
                if (var43.field5756 == -1) {
                    class120.method764(5888, var43.field5734);
                    class290.method1752(var43.field5734, true);
                    class256.method1607(var43.field5734, 11613);
                }
                if (var44 == -1) {
                    var43.field5727 = 1;
                    var43.field5677 = -1;
                    var43.field5763 = -1;
                    return;
                }
                var43.field5763 = var44;
                var43.field5753 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field5690 = true;
                } else {
                    var43.field5690 = false;
                }
                class497 var46 = class89.field1238.method111(var44, -93);
                var43.field5669 = var46.field7275;
                var43.field5766 = var46.field7278;
                var43.field5773 = var46.field7293;
                var43.field5795 = var46.field7269;
                var43.field5670 = var46.field7249;
                var43.field5762 = var46.field7311;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field5683 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field5683 = 1;
                } else {
                    var43.field5683 = 2;
                }
                if (var43.field5796 > 0) {
                    var43.field5762 = var43.field5762 * 32 / var43.field5796;
                    return;
                }
                if (var43.field5700 > 0) {
                    var43.field5762 = var43.field5762 * 32 / var43.field5700;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field5727 = 2;
                var43.field5677 = field7140[--field7158];
                if (var43.field5756 == -1) {
                    class30.method208(var43.field5734, -1);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field5727 = 3;
                var43.field5677 = -1;
                if (var43.field5756 == -1) {
                    class30.method208(var43.field5734, -1);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field5727 = 6;
                var43.field5677 = field7140[--field7158];
                if (var43.field5756 == -1) {
                    class30.method208(var43.field5734, -1);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field5727 = 5;
                var43.field5677 = field7140[--field7158];
                if (var43.field5756 == -1) {
                    class30.method208(var43.field5734, -1);
                }
                return;
            }
            if (arg0 == 1206) {
                field7158 -= 4;
                var43.field5694 = field7140[field7158];
                var43.field5750 = field7140[field7158 + 1];
                var43.field5716 = field7140[field7158 + 2];
                var43.field5710 = field7140[field7158 + 3];
                class415.method2440(10, var43);
                return;
            }
            if (arg0 == 1207) {
                field7158 -= 2;
                var43.field5787 = field7140[field7158];
                var43.field5782 = field7140[field7158 + 1];
                class415.method2440(10, var43);
                return;
            }
            if (arg0 == 1210) {
                field7158 -= 4;
                var43.field5677 = field7140[field7158];
                var43.field5760 = field7140[field7158 + 1];
                if (field7140[field7158 + 2] == 1) {
                    var43.field5727 = 9;
                } else {
                    var43.field5727 = 8;
                }
                if (field7140[field7158 + 3] == 1) {
                    var43.field5690 = true;
                } else {
                    var43.field5690 = false;
                }
                if (var43.field5756 == -1) {
                    class30.method208(var43.field5734, -1);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field5727 = 5;
                var43.field5677 = class166.field2149;
                var43.field5760 = 0;
                if (var43.field5756 == -1) {
                    class30.method208(var43.field5734, -1);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class423 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class497.method2965(0, field7140[--field7158]);
                } else {
                    var58 = arg1 ? field7156 : field7146;
                }
                String var59 = field7147[--field7142];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field7140[--field7158];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field7140[--field7158];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field7147[--field7142];
                    } else {
                        var62[var63] = Integer.valueOf(field7140[--field7158]);
                    }
                }
                int var64 = field7140[--field7158];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field5681 = var62;
                } else if (arg0 == 1401) {
                    var58.field5687 = var62;
                } else if (arg0 == 1402) {
                    var58.field5810 = var62;
                } else if (arg0 == 1403) {
                    var58.field5721 = var62;
                } else if (arg0 == 1404) {
                    var58.field5708 = var62;
                } else if (arg0 == 1405) {
                    var58.field5725 = var62;
                } else if (arg0 == 1406) {
                    var58.field5771 = var62;
                } else if (arg0 == 1407) {
                    var58.field5688 = var62;
                    var58.field5689 = var60;
                } else if (arg0 == 1408) {
                    var58.field5695 = var62;
                } else if (arg0 == 1409) {
                    var58.field5779 = var62;
                } else if (arg0 == 1410) {
                    var58.field5692 = var62;
                } else if (arg0 == 1411) {
                    var58.field5826 = var62;
                } else if (arg0 == 1412) {
                    var58.field5748 = var62;
                } else if (arg0 == 1414) {
                    var58.field5812 = var62;
                    var58.field5684 = var60;
                } else if (arg0 == 1415) {
                    var58.field5780 = var62;
                    var58.field5790 = var60;
                } else if (arg0 == 1416) {
                    var58.field5801 = var62;
                } else if (arg0 == 1417) {
                    var58.field5743 = var62;
                } else if (arg0 == 1418) {
                    var58.field5717 = var62;
                } else if (arg0 == 1419) {
                    var58.field5733 = var62;
                } else if (arg0 == 1420) {
                    var58.field5712 = var62;
                } else if (arg0 == 1421) {
                    var58.field5781 = var62;
                } else if (arg0 == 1422) {
                    var58.field5813 = var62;
                } else if (arg0 == 1423) {
                    var58.field5798 = var62;
                } else if (arg0 == 1424) {
                    var58.field5806 = var62;
                } else if (arg0 == 1425) {
                    var58.field5754 = var62;
                } else if (arg0 == 1426) {
                    var58.field5722 = var62;
                } else if (arg0 == 1427) {
                    var58.field5719 = var62;
                } else if (arg0 == 1428) {
                    var58.field5732 = var62;
                    var58.field5769 = var60;
                } else if (arg0 == 1429) {
                    var58.field5665 = var62;
                    var58.field5772 = var60;
                } else if (arg0 == 1430) {
                    var58.field5755 = var62;
                }
                var58.field5809 = true;
                return;
            }
            if (arg0 < 1600) {
                class423 var65 = arg1 ? field7156 : field7146;
                if (arg0 == 1500) {
                    field7140[field7158++] = var65.field5808;
                    return;
                }
                if (arg0 == 1501) {
                    field7140[field7158++] = var65.field5802;
                    return;
                }
                if (arg0 == 1502) {
                    field7140[field7158++] = var65.field5735;
                    return;
                }
                if (arg0 == 1503) {
                    field7140[field7158++] = var65.field5726;
                    return;
                }
                if (arg0 == 1504) {
                    field7140[field7158++] = var65.field5672 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field7140[field7158++] = var65.field5823;
                    return;
                }
                if (arg0 == 1506) {
                    class423 var66 = class426.method2520((byte) -34, var65);
                    field7140[field7158++] = var66 == null ? -1 : var66.field5734;
                    return;
                }
            } else if (arg0 < 1700) {
                class423 var67 = arg1 ? field7156 : field7146;
                if (arg0 == 1600) {
                    field7140[field7158++] = var67.field5678;
                    return;
                }
                if (arg0 == 1601) {
                    field7140[field7158++] = var67.field5686;
                    return;
                }
                if (arg0 == 1602) {
                    field7147[field7142++] = var67.field5758;
                    return;
                }
                if (arg0 == 1603) {
                    field7140[field7158++] = var67.field5797;
                    return;
                }
                if (arg0 == 1604) {
                    field7140[field7158++] = var67.field5768;
                    return;
                }
                if (arg0 == 1605) {
                    field7140[field7158++] = var67.field5762;
                    return;
                }
                if (arg0 == 1606) {
                    field7140[field7158++] = var67.field5669;
                    return;
                }
                if (arg0 == 1607) {
                    field7140[field7158++] = var67.field5773;
                    return;
                }
                if (arg0 == 1608) {
                    field7140[field7158++] = var67.field5766;
                    return;
                }
                if (arg0 == 1609) {
                    field7140[field7158++] = var67.field5814;
                    return;
                }
                if (arg0 == 1610) {
                    field7140[field7158++] = var67.field5795;
                    return;
                }
                if (arg0 == 1611) {
                    field7140[field7158++] = var67.field5670;
                    return;
                }
                if (arg0 == 1612) {
                    field7140[field7158++] = var67.field5703;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field7140[--field7158];
                    class483 var69 = class495.field7242.method1837(11, var68);
                    if (var69.method2896((byte) 45)) {
                        field7147[field7142++] = var67.method2496(var69.field7033, var68, -8371);
                    } else {
                        field7140[field7158++] = var67.method2507(15967, var69.field7035, var68);
                    }
                }
            } else if (arg0 < 1800) {
                class423 var70 = arg1 ? field7156 : field7146;
                if (arg0 == 1700) {
                    field7140[field7158++] = var70.field5763;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field5763 != -1) {
                        field7140[field7158++] = var70.field5753;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field7140[field7158++] = var70.field5756;
                    return;
                }
            } else if (arg0 < 1900) {
                class423 var71 = arg1 ? field7156 : field7146;
                if (arg0 == 1800) {
                    field7140[field7158++] = client.method3037(var71).method1628((byte) -120);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field7140[--field7158];
                    int var334 = var72 - 1;
                    if (var71.field5701 != null && var334 < var71.field5701.length && var71.field5701[var334] != null) {
                        field7147[field7142++] = var71.field5701[var334];
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field5799 == null) {
                        field7147[field7142++] = "";
                        return;
                    }
                    field7147[field7142++] = var71.field5799;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class423 var332;
                if (arg0 >= 2000) {
                    var332 = class497.method2965(0, field7140[--field7158]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field7156 : field7146;
                }
                if (field7167 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field5719 == null) {
                        return;
                    }
                    class195 var333 = new class195();
                    var333.field2516 = var332;
                    var333.field2523 = var332.field5719;
                    var333.field2529 = field7167 + 1;
                    class243.field3114.method42(var333, 0);
                    return;
                }
            } else if (arg0 < 2600) {
                class423 var73 = class497.method2965(0, field7140[--field7158]);
                if (arg0 == 2500) {
                    field7140[field7158++] = var73.field5808;
                    return;
                }
                if (arg0 == 2501) {
                    field7140[field7158++] = var73.field5802;
                    return;
                }
                if (arg0 == 2502) {
                    field7140[field7158++] = var73.field5735;
                    return;
                }
                if (arg0 == 2503) {
                    field7140[field7158++] = var73.field5726;
                    return;
                }
                if (arg0 == 2504) {
                    field7140[field7158++] = var73.field5672 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field7140[field7158++] = var73.field5823;
                    return;
                }
                if (arg0 == 1506) {
                    class423 var74 = class426.method2520((byte) -32, var73);
                    field7140[field7158++] = var74 == null ? -1 : var74.field5734;
                    return;
                }
            } else if (arg0 < 2700) {
                class423 var75 = class497.method2965(0, field7140[--field7158]);
                if (arg0 == 2600) {
                    field7140[field7158++] = var75.field5678;
                    return;
                }
                if (arg0 == 2601) {
                    field7140[field7158++] = var75.field5686;
                    return;
                }
                if (arg0 == 2602) {
                    field7147[field7142++] = var75.field5758;
                    return;
                }
                if (arg0 == 2603) {
                    field7140[field7158++] = var75.field5797;
                    return;
                }
                if (arg0 == 2604) {
                    field7140[field7158++] = var75.field5768;
                    return;
                }
                if (arg0 == 2605) {
                    field7140[field7158++] = var75.field5762;
                    return;
                }
                if (arg0 == 2606) {
                    field7140[field7158++] = var75.field5669;
                    return;
                }
                if (arg0 == 2607) {
                    field7140[field7158++] = var75.field5773;
                    return;
                }
                if (arg0 == 2608) {
                    field7140[field7158++] = var75.field5766;
                    return;
                }
                if (arg0 == 2609) {
                    field7140[field7158++] = var75.field5814;
                    return;
                }
                if (arg0 == 2610) {
                    field7140[field7158++] = var75.field5795;
                    return;
                }
                if (arg0 == 2611) {
                    field7140[field7158++] = var75.field5670;
                    return;
                }
                if (arg0 == 2612) {
                    field7140[field7158++] = var75.field5703;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class423 var76 = class497.method2965(0, field7140[--field7158]);
                    field7140[field7158++] = var76.field5763;
                    return;
                }
                if (arg0 == 2701) {
                    class423 var77 = class497.method2965(0, field7140[--field7158]);
                    if (var77.field5763 == -1) {
                        field7140[field7158++] = 0;
                        return;
                    } else {
                        field7140[field7158++] = var77.field5753;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field7140[--field7158];
                    class367 var79 = (class367) class381.field4963.method2085((long) var78, -5423);
                    if (var79 != null) {
                        field7140[field7158++] = 1;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class423 var80 = class497.method2965(0, field7140[--field7158]);
                    if (var80.field5679 == null) {
                        field7140[field7158++] = 0;
                        return;
                    }
                    int var81 = var80.field5679.length;
                    for (int var82 = 0; var82 < var80.field5679.length; var82++) {
                        if (var80.field5679[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field7140[field7158++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field7158 -= 2;
                    int var83 = field7140[field7158];
                    int var84 = field7140[field7158 + 1];
                    class367 var85 = (class367) class381.field4963.method2085((long) var83, -5423);
                    if (var85 != null && var85.field4719 == var84) {
                        field7140[field7158++] = 1;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class423 var86 = class497.method2965(0, field7140[--field7158]);
                if (arg0 == 2800) {
                    field7140[field7158++] = client.method3037(var86).method1628((byte) -118);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field7140[--field7158];
                    int var335 = var87 - 1;
                    if (var86.field5701 != null && var335 < var86.field5701.length && var86.field5701[var335] != null) {
                        field7147[field7142++] = var86.field5701[var335];
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field5799 == null) {
                        field7147[field7142++] = "";
                        return;
                    }
                    field7147[field7142++] = var86.field5799;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field7147[--field7142];
                    class360.method2120(var88, 127);
                    return;
                }
                if (arg0 == 3101) {
                    field7158 -= 2;
                    class161.method1074(field7140[field7158 + 1], (byte) 86, field7140[field7158], class37.field573);
                    return;
                }
                if (arg0 == 3103) {
                    class483.method2899((byte) 27, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field7147[--field7142];
                    int var90 = 0;
                    if (class19.method126(var89, (byte) 74)) {
                        var90 = class109.method716(var89, 10);
                    }
                    field7160++;
                    class420.method2472((byte) -101, class55.field747);
                    class319.field4112.method572(-111, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field7147[--field7142];
                    field7150++;
                    class420.method2472((byte) -101, class238.field3093);
                    class319.field4112.method565(-73, var91.length() + 1);
                    class319.field4112.method597(-128, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field7147[--field7142];
                    field7163++;
                    class420.method2472((byte) -101, class459.field6414);
                    class319.field4112.method565(72, var92.length() + 1);
                    class319.field4112.method597(-128, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field7140[--field7158];
                    String var94 = field7147[--field7142];
                    class242.method1519(var93, var94, 0);
                    return;
                }
                if (arg0 == 3108) {
                    field7158 -= 3;
                    int var95 = field7140[field7158];
                    int var96 = field7140[field7158 + 1];
                    int var97 = field7140[field7158 + 2];
                    class423 var98 = class497.method2965(0, var97);
                    class236.method1503((byte) -85, var98, var95, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field7158 -= 2;
                    int var99 = field7140[field7158];
                    int var100 = field7140[field7158 + 1];
                    class423 var101 = arg1 ? field7156 : field7146;
                    class236.method1503((byte) -29, var101, var99, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field7140[--field7158];
                    field7159++;
                    class420.method2472((byte) -101, class466.field6862);
                    class319.field4112.method609(var102, -118);
                    return;
                }
                if (arg0 == 3111) {
                    field7158 -= 2;
                    int var103 = field7140[field7158];
                    int var104 = field7140[field7158 + 1];
                    class367 var105 = (class367) class381.field4963.method2085((long) var103, -5423);
                    if (var105 != null) {
                        class176.method1142(true, (byte) -125, var105.field4719 != var104, var105);
                    }
                    class278.method1705((byte) 82, true, var104, 3, var103);
                    return;
                }
                if (arg0 == 3112) {
                    field7158--;
                    int var106 = field7140[field7158];
                    class367 var107 = (class367) class381.field4963.method2085((long) var106, -5423);
                    if (var107 != null && var107.field4721 == 3) {
                        class176.method1142(true, (byte) 126, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class335.method1989(field7147[--field7142], 27184);
                    return;
                }
                if (arg0 == 3114) {
                    field7158 -= 2;
                    int var108 = field7140[field7158];
                    int var109 = field7140[field7158 + 1];
                    String var110 = field7147[--field7142];
                    class482.method2888("", 0, "", var109, var108, var110);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field7158 -= 3;
                    class157.method1058(field7140[field7158], 255, -2, field7140[field7158 + 1], field7140[field7158 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class181.method1191(field7140[--field7158], 255, 50, -125);
                    return;
                }
                if (arg0 == 3202) {
                    field7158 -= 2;
                    class169.method1128(field7140[field7158 + 1], 255, (byte) 96, field7140[field7158]);
                    return;
                }
                if (arg0 == 3203) {
                    field7158 -= 4;
                    class157.method1058(field7140[field7158], field7140[field7158 + 3], -2, field7140[field7158 + 1], field7140[field7158 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field7158 -= 3;
                    class181.method1191(field7140[field7158], field7140[field7158 + 1], field7140[field7158 + 2], 36);
                    return;
                }
                if (arg0 == 3205) {
                    field7158 -= 3;
                    class169.method1128(field7140[field7158 + 1], field7140[field7158 + 2], (byte) 59, field7140[field7158]);
                    return;
                }
                if (arg0 == 3206) {
                    field7158 -= 4;
                    class122.method781((byte) 76, field7140[field7158], field7140[field7158 + 2], field7140[field7158 + 3], field7140[field7158 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field7140[field7158++] = class264.field3353;
                    return;
                }
                if (arg0 == 3301) {
                    field7158 -= 2;
                    int var111 = field7140[field7158];
                    int var112 = field7140[field7158 + 1];
                    field7140[field7158++] = class337.method1991(var111, -57, false, var112);
                    return;
                }
                if (arg0 == 3302) {
                    field7158 -= 2;
                    int var113 = field7140[field7158];
                    int var114 = field7140[field7158 + 1];
                    field7140[field7158++] = class36.method233(0, false, var113, var114);
                    return;
                }
                if (arg0 == 3303) {
                    field7158 -= 2;
                    int var115 = field7140[field7158];
                    int var116 = field7140[field7158 + 1];
                    field7140[field7158++] = class351.method2063(var116, false, var115, -123);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field7140[--field7158];
                    field7140[field7158++] = class31.field516.method3108(var117, -124).field1539;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field7140[--field7158];
                    field7140[field7158++] = class5.field46[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field7140[--field7158];
                    field7140[field7158++] = class382.field5004[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field7140[--field7158];
                    field7140[field7158++] = class379.field4917[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class37.field573.field6220;
                    int var122 = (class37.field573.field6239 >> 7) + class35.field545;
                    int var123 = (class37.field573.field6241 >> 7) + class336.field4299;
                    field7140[field7158++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field7140[--field7158];
                    field7140[field7158++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field7140[--field7158];
                    field7140[field7158++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field7140[--field7158];
                    field7140[field7158++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field7140[field7158++] = class459.field6421 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field7158 -= 2;
                    int var127 = field7140[field7158];
                    int var128 = field7140[field7158 + 1];
                    field7140[field7158++] = class337.method1991(var127, -66, true, var128);
                    return;
                }
                if (arg0 == 3314) {
                    field7158 -= 2;
                    int var129 = field7140[field7158];
                    int var130 = field7140[field7158 + 1];
                    field7140[field7158++] = class36.method233(0, true, var129, var130);
                    return;
                }
                if (arg0 == 3315) {
                    field7158 -= 2;
                    int var131 = field7140[field7158];
                    int var132 = field7140[field7158 + 1];
                    field7140[field7158++] = class351.method2063(var132, true, var131, -95);
                    return;
                }
                if (arg0 == 3316) {
                    if (class363.field4685 >= 2) {
                        field7140[field7158++] = class363.field4685;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field7140[field7158++] = class285.field3634;
                    return;
                }
                if (arg0 == 3318) {
                    field7140[field7158++] = class375.field4875;
                    return;
                }
                if (arg0 == 3321) {
                    field7140[field7158++] = class94.field1313;
                    return;
                }
                if (arg0 == 3322) {
                    field7140[field7158++] = class477.field6972;
                    return;
                }
                if (arg0 == 3323) {
                    if (class235.field3067 >= 5 && class235.field3067 <= 9) {
                        field7140[field7158++] = 1;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class235.field3067 >= 5 && class235.field3067 <= 9) {
                        field7140[field7158++] = class235.field3067;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field7140[field7158++] = class28.field478 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field7140[field7158++] = class37.field573.field7633;
                    return;
                }
                if (arg0 == 3327) {
                    field7140[field7158++] = class37.field573.field7655.field4386 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field7140[field7158++] = class437.field5998 && !class306.field3943 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field7140[field7158++] = class428.field5874 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field7140[--field7158];
                    field7140[field7158++] = class74.method424(false, 0, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field7158 -= 2;
                    int var134 = field7140[field7158];
                    int var135 = field7140[field7158 + 1];
                    field7140[field7158++] = class527.method3118(var135, 0, false, var134, false);
                    return;
                }
                if (arg0 == 3332) {
                    field7158 -= 2;
                    int var136 = field7140[field7158];
                    int var137 = field7140[field7158 + 1];
                    field7140[field7158++] = class527.method3118(var137, 0, false, var136, true);
                    return;
                }
                if (arg0 == 3333) {
                    field7140[field7158++] = class166.field2156;
                    return;
                }
                if (arg0 == 3335) {
                    field7140[field7158++] = class379.field4920;
                    return;
                }
                if (arg0 == 3336) {
                    field7158 -= 4;
                    int var138 = field7140[field7158];
                    int var139 = field7140[field7158 + 1];
                    int var140 = field7140[field7158 + 2];
                    int var141 = field7140[field7158 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field7140[field7158++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field7140[field7158++] = class326.field4189;
                    return;
                }
                if (arg0 == 3338) {
                    field7140[field7158++] = class439.method2597((byte) -22);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field7158 -= 2;
                    int var145 = field7140[field7158];
                    int var146 = field7140[field7158 + 1];
                    class127 var147 = class212.field2724.method1069(1, var145);
                    field7147[field7142++] = var147.method816(0, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field7158 -= 4;
                    int var148 = field7140[field7158];
                    int var149 = field7140[field7158 + 1];
                    int var150 = field7140[field7158 + 2];
                    int var151 = field7140[field7158 + 3];
                    class127 var152 = class212.field2724.method1069(1, var150);
                    if (var152.field1737 == var148 && var152.field1751 == var149) {
                        if (var149 == 115) {
                            field7147[field7142++] = var152.method816(0, var151);
                            return;
                        }
                        field7140[field7158++] = var152.method811(var151, -7493);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field7158 -= 3;
                    int var153 = field7140[field7158];
                    int var154 = field7140[field7158 + 1];
                    int var155 = field7140[field7158 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class127 var156 = class212.field2724.method1069(1, var154);
                    if (var156.field1751 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field7140[field7158++] = var156.method812(var155, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field7140[--field7158];
                    String var158 = field7147[--field7142];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class127 var159 = class212.field2724.method1069(1, var157);
                    if (var159.field1751 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field7140[field7158++] = var159.method805(false, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field7140[--field7158];
                    class127 var161 = class212.field2724.method1069(1, var160);
                    field7140[field7158++] = var161.field1750.method2095(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class250.field3189 == 0) {
                        field7140[field7158++] = -2;
                        return;
                    }
                    if (class250.field3189 == 1) {
                        field7140[field7158++] = -1;
                        return;
                    }
                    field7140[field7158++] = class364.field4692;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field7140[--field7158];
                    if (class250.field3189 == 2 && var162 < class364.field4692) {
                        field7147[field7142++] = class231.field2996[var162];
                        if (class276.field3538[var162] != null) {
                            field7147[field7142++] = class276.field3538[var162];
                            return;
                        }
                        field7147[field7142++] = "";
                        return;
                    }
                    field7147[field7142++] = "";
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field7140[--field7158];
                    if (class250.field3189 == 2 && var163 < class364.field4692) {
                        field7140[field7158++] = class208.field2705[var163];
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field7140[--field7158];
                    if (class250.field3189 == 2 && var164 < class364.field4692) {
                        field7140[field7158++] = class511.field7529[var164];
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field7147[--field7142];
                    int var166 = field7140[--field7158];
                    class177.method1145(var166, -543, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field7147[--field7142];
                    class218.method1394(false, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field7147[--field7142];
                    class302.method1811(var168, (byte) -87);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field7147[--field7142];
                    class200.method1283((byte) 45, var169, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field7147[--field7142];
                    class53.method315(2, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field7147[--field7142];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field7140[field7158++] = class212.method1358(var171, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field7140[--field7158];
                    if (class250.field3189 == 2 && var172 < class364.field4692) {
                        field7147[field7142++] = class167.field2174[var172];
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class194.field2511 != null) {
                        field7147[field7142++] = class483.method2893(4634, class194.field2511);
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class194.field2511 != null) {
                        field7140[field7158++] = class192.field2492;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field7140[--field7158];
                    if (class194.field2511 != null && var173 < class192.field2492) {
                        field7147[field7142++] = class238.field3092[var173].field4304;
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field7140[--field7158];
                    if (class194.field2511 != null && var174 < class192.field2492) {
                        field7140[field7158++] = class238.field3092[var174].field4300;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field7140[--field7158];
                    if (class194.field2511 != null && var175 < class192.field2492) {
                        field7140[field7158++] = class238.field3092[var175].field4308;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field7140[field7158++] = class255.field3230;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field7147[--field7142];
                    class221.method1406(var176, -109);
                    return;
                }
                if (arg0 == 3618) {
                    field7140[field7158++] = class521.field7737;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field7147[--field7142];
                    class9.method59(-127, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class114.method745(-1);
                    return;
                }
                if (arg0 == 3621) {
                    if (class250.field3189 == 0) {
                        field7140[field7158++] = -1;
                        return;
                    }
                    field7140[field7158++] = class104.field1424;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field7140[--field7158];
                    if (class250.field3189 != 0 && var178 < class104.field1424) {
                        field7147[field7142++] = class271.field3444[var178];
                        if (class303.field3925[var178] != null) {
                            field7147[field7142++] = class303.field3925[var178];
                            return;
                        }
                        field7147[field7142++] = "";
                        return;
                    }
                    field7147[field7142++] = "";
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field7147[--field7142];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field7140[field7158++] = class52.method313(var179, 71) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field7140[--field7158];
                    if (class238.field3092 != null && var180 < class192.field2492 && class238.field3092[var180].field4307.equalsIgnoreCase(class37.field573.field7630)) {
                        field7140[field7158++] = 1;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class118.field1650 != null) {
                        field7147[field7142++] = class118.field1650;
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field7140[--field7158];
                    if (class194.field2511 != null && var181 < class192.field2492) {
                        field7147[field7142++] = class238.field3092[var181].field4309;
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field7140[--field7158];
                    if (class250.field3189 == 2 && var182 >= 0 && var182 < class364.field4692) {
                        field7140[field7158++] = class261.field3320[var182] ? 1 : 0;
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field7147[--field7142];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field7140[field7158++] = class502.method2998(var183, false);
                    return;
                }
                if (arg0 == 3629) {
                    field7140[field7158++] = class204.field2670;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field7147[--field7142];
                    class200.method1283((byte) 45, var184, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field7140[--field7158];
                    field7140[field7158++] = class93.field1305[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field7140[--field7158];
                    if (class194.field2511 != null && var186 < class192.field2492) {
                        field7147[field7142++] = class238.field3092[var186].field4307;
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field7140[--field7158];
                    if (class250.field3189 != 0 && var187 < class104.field1424) {
                        field7147[field7142++] = class53.field718[var187];
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field7140[--field7158];
                    field7140[field7158++] = class213.field2729[var188].method1919(-14119);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field7140[--field7158];
                    field7140[field7158++] = class213.field2729[var189].field4137;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field7140[--field7158];
                    field7140[field7158++] = class213.field2729[var190].field4128;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field7140[--field7158];
                    field7140[field7158++] = class213.field2729[var191].field4133;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field7140[--field7158];
                    field7140[field7158++] = class213.field2729[var192].field4136;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field7140[--field7158];
                    field7140[field7158++] = class213.field2729[var193].field4132;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field7140[--field7158];
                    int var195 = class213.field2729[var194].method1918((byte) 48);
                    field7140[field7158++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field7140[--field7158];
                    int var197 = class213.field2729[var196].method1918((byte) 48);
                    field7140[field7158++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field7140[--field7158];
                    int var199 = class213.field2729[var198].method1918((byte) 48);
                    field7140[field7158++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field7140[--field7158];
                    int var201 = class213.field2729[var200].method1918((byte) 48);
                    field7140[field7158++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field7158 -= 2;
                    int var202 = field7140[field7158];
                    int var203 = field7140[field7158 + 1];
                    field7140[field7158++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field7158 -= 2;
                    int var204 = field7140[field7158];
                    int var205 = field7140[field7158 + 1];
                    field7140[field7158++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field7158 -= 2;
                    int var206 = field7140[field7158];
                    int var207 = field7140[field7158 + 1];
                    field7140[field7158++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field7158 -= 2;
                    int var208 = field7140[field7158];
                    int var209 = field7140[field7158 + 1];
                    field7140[field7158++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field7140[--field7158];
                    field7140[field7158++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field7140[--field7158];
                    field7140[field7158++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field7158 -= 5;
                    int var212 = field7140[field7158];
                    int var213 = field7140[field7158 + 1];
                    int var214 = field7140[field7158 + 2];
                    int var215 = field7140[field7158 + 3];
                    int var216 = field7140[field7158 + 4];
                    field7140[field7158++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field7158 -= 2;
                    long var217 = (long) field7140[field7158];
                    long var219 = (long) field7140[field7158 + 1];
                    field7140[field7158++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field7158 -= 2;
                    int var221 = field7140[field7158];
                    int var222 = field7140[field7158 + 1];
                    field7140[field7158++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field7158 -= 2;
                    int var223 = field7140[field7158];
                    int var224 = field7140[field7158 + 1];
                    field7140[field7158++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field7158 -= 2;
                    int var225 = field7140[field7158];
                    int var226 = field7140[field7158 + 1];
                    field7140[field7158++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field7158 -= 2;
                    int var227 = field7140[field7158];
                    int var228 = field7140[field7158 + 1];
                    field7140[field7158++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field7158 -= 2;
                    int var229 = field7140[field7158];
                    int var230 = field7140[field7158 + 1];
                    if (var229 == 0) {
                        field7140[field7158++] = 0;
                        return;
                    }
                    field7140[field7158++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field7158 -= 2;
                    int var231 = field7140[field7158];
                    int var232 = field7140[field7158 + 1];
                    if (var231 == 0) {
                        field7140[field7158++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field7140[field7158++] = Integer.MAX_VALUE;
                        return;
                    }
                    field7140[field7158++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field7158 -= 2;
                    int var233 = field7140[field7158];
                    int var234 = field7140[field7158 + 1];
                    field7140[field7158++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field7158 -= 2;
                    int var235 = field7140[field7158];
                    int var236 = field7140[field7158 + 1];
                    field7140[field7158++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field7158 -= 2;
                    int var237 = field7140[field7158];
                    int var238 = field7140[field7158 + 1];
                    field7140[field7158++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field7158 -= 2;
                    int var239 = field7140[field7158];
                    int var240 = field7140[field7158 + 1];
                    field7140[field7158++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field7158 -= 3;
                    long var241 = (long) field7140[field7158];
                    long var243 = (long) field7140[field7158 + 1];
                    long var245 = (long) field7140[field7158 + 2];
                    field7140[field7158++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field7147[--field7142];
                    int var248 = field7140[--field7158];
                    field7147[field7142++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field7142 -= 2;
                    String var249 = field7147[field7142];
                    String var250 = field7147[field7142 + 1];
                    field7147[field7142++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field7147[--field7142];
                    int var252 = field7140[--field7158];
                    field7147[field7142++] = var251 + class347.method2043((byte) 17, var252, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field7147[--field7142];
                    field7147[field7142++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field7147[field7142++] = method2934(field7140[--field7158]);
                    return;
                }
                if (arg0 == 4105) {
                    field7142 -= 2;
                    String var254 = field7147[field7142];
                    String var255 = field7147[field7142 + 1];
                    if (class37.field573.field7655 != null && class37.field573.field7655.field4386) {
                        field7147[field7142++] = var255;
                        return;
                    }
                    field7147[field7142++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field7140[--field7158];
                    field7147[field7142++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field7142 -= 2;
                    field7140[field7158++] = class40.method250(field7147[field7142 + 1], class379.field4920, 122, field7147[field7142]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field7147[--field7142];
                    field7158 -= 2;
                    int var258 = field7140[field7158];
                    int var259 = field7140[field7158 + 1];
                    class278 var260 = class293.method1763(32516, class256.field3245, 0, var259);
                    field7140[field7158++] = var260.method1708(var257, (byte) -84, class334.field4280, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field7147[--field7142];
                    field7158 -= 2;
                    int var262 = field7140[field7158];
                    int var263 = field7140[field7158 + 1];
                    class278 var264 = class293.method1763(32516, class256.field3245, 0, var263);
                    field7140[field7158++] = var264.method1711(var262, var261, 124, class334.field4280);
                    return;
                }
                if (arg0 == 4110) {
                    field7142 -= 2;
                    String var265 = field7147[field7142];
                    String var266 = field7147[field7142 + 1];
                    if (field7140[--field7158] == 1) {
                        field7147[field7142++] = var265;
                        return;
                    }
                    field7147[field7142++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field7147[--field7142];
                    field7147[field7142++] = class291.method1758(7638, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field7147[--field7142];
                    int var269 = field7140[--field7158];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field7147[field7142++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field7140[--field7158];
                    field7140[field7158++] = class196.method1265((byte) -124, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field7140[--field7158];
                    field7140[field7158++] = class216.method1389((char) var271, 10291) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field7140[--field7158];
                    field7140[field7158++] = class299.method1795((byte) -109, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field7140[--field7158];
                    field7140[field7158++] = class504.method3003((char) var273, (byte) 3) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field7147[--field7142];
                    if (var274 != null) {
                        field7140[field7158++] = var274.length();
                        return;
                    }
                    field7140[field7158++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field7147[--field7142];
                    field7158 -= 2;
                    int var276 = field7140[field7158];
                    int var277 = field7140[field7158 + 1];
                    field7147[field7142++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field7147[--field7142];
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
                    field7147[field7142++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field7147[--field7142];
                    field7158 -= 2;
                    int var284 = field7140[field7158];
                    int var285 = field7140[field7158 + 1];
                    field7140[field7158++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field7142 -= 2;
                    String var286 = field7147[field7142];
                    String var287 = field7147[field7142 + 1];
                    int var288 = field7140[--field7158];
                    field7140[field7158++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field7140[--field7158];
                    field7140[field7158++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field7140[--field7158];
                    field7140[field7158++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field7140[--field7158] != 0;
                    int var292 = field7140[--field7158];
                    field7147[field7142++] = class275.method1691((long) var292, 0, -115, var291, class379.field4920);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field7147[--field7142];
                    int var294 = field7140[--field7158];
                    class278 var295 = class293.method1763(32516, class256.field3245, 0, var294);
                    field7140[field7158++] = var295.method1709((byte) 64, class334.field4280, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field7140[--field7158];
                    field7147[field7142++] = class89.field1238.method111(var296, 101).field7262;
                    return;
                }
                if (arg0 == 4201) {
                    field7158 -= 2;
                    int var297 = field7140[field7158];
                    int var298 = field7140[field7158 + 1];
                    class497 var299 = class89.field1238.method111(var297, -98);
                    if (var298 >= 1 && var298 <= 5 && var299.field7251[var298 - 1] != null) {
                        field7147[field7142++] = var299.field7251[var298 - 1];
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field7158 -= 2;
                    int var300 = field7140[field7158];
                    int var301 = field7140[field7158 + 1];
                    class497 var302 = class89.field1238.method111(var300, 102);
                    if (var301 >= 1 && var301 <= 5 && var302.field7272[var301 - 1] != null) {
                        field7147[field7142++] = var302.field7272[var301 - 1];
                        return;
                    }
                    field7147[field7142++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field7140[--field7158];
                    field7140[field7158++] = class89.field1238.method111(var303, -89).field7254;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field7140[--field7158];
                    field7140[field7158++] = class89.field1238.method111(var304, 91).field7298 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field7140[--field7158];
                    class497 var306 = class89.field1238.method111(var305, 114);
                    if (var306.field7291 == -1 && var306.field7270 >= 0) {
                        field7140[field7158++] = var306.field7270;
                        return;
                    }
                    field7140[field7158++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field7140[--field7158];
                    class497 var308 = class89.field1238.method111(var307, 119);
                    if (var308.field7291 >= 0 && var308.field7270 >= 0) {
                        field7140[field7158++] = var308.field7270;
                        return;
                    }
                    field7140[field7158++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field7140[--field7158];
                    field7140[field7158++] = class89.field1238.method111(var309, 113).field7260 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field7158 -= 2;
                    int var310 = field7140[field7158];
                    int var311 = field7140[field7158 + 1];
                    class483 var312 = class495.field7242.method1837(11, var311);
                    if (var312.method2896((byte) -102)) {
                        field7147[field7142++] = class89.field1238.method111(var310, 51).method2977(24649, var311, var312.field7033);
                        return;
                    }
                    field7140[field7158++] = class89.field1238.method111(var310, 115).method2966(var312.field7035, true, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field7158 -= 2;
                    int var313 = field7140[field7158];
                    int var314 = field7140[field7158 + 1] - 1;
                    class497 var315 = class89.field1238.method111(var313, 99);
                    if (var315.field7317 == var314) {
                        field7140[field7158++] = var315.field7320;
                        return;
                    }
                    if (var315.field7316 == var314) {
                        field7140[field7158++] = var315.field7321;
                        return;
                    }
                    field7140[field7158++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field7147[--field7142];
                    int var317 = field7140[--field7158];
                    class183.method1216(var317 == 1, var316, 8);
                    field7140[field7158++] = class25.field439;
                    return;
                }
                if (arg0 == 4211) {
                    if (class252.field3200 != null && class476.field6953 < class25.field439) {
                        field7140[field7158++] = class252.field3200[class476.field6953++] & 0xFFFF;
                        return;
                    }
                    field7140[field7158++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class476.field6953 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field7158 -= 2;
                    int var318 = field7140[field7158];
                    int var319 = field7140[field7158 + 1];
                    class483 var320 = class495.field7242.method1837(11, var319);
                    if (var320.method2896((byte) -111)) {
                        field7147[field7142++] = class192.field2495.method1869(var318, false).method68(var319, 119, var320.field7033);
                        return;
                    }
                    field7140[field7158++] = class192.field2495.method1869(var318, false).method66(-21721, var320.field7035, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field7158 -= 2;
                    int var321 = field7140[field7158];
                    int var322 = field7140[field7158 + 1];
                    class483 var323 = class495.field7242.method1837(11, var322);
                    if (var323.method2896((byte) 50)) {
                        field7147[field7142++] = class52.field715.method1164(var321, 0).method2392((byte) 126, var323.field7033, var322);
                        return;
                    }
                    field7140[field7158++] = class52.field715.method1164(var321, 0).method2398(false, var322, var323.field7035);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field7158 -= 2;
                    int var324 = field7140[field7158];
                    int var325 = field7140[field7158 + 1];
                    class483 var326 = class495.field7242.method1837(11, var325);
                    if (var326.method2896((byte) 97)) {
                        field7147[field7142++] = class381.field4967.method2055(var324, 0).method777(99, var326.field7033, var325);
                        return;
                    }
                    field7140[field7158++] = class381.field4967.method2055(var324, 0).method778(-25, var325, var326.field7035);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field7140[--field7158];
                class371 var328 = class331.field4255.method1881(var327, (byte) 54);
                if (var328.field4787 != null && var328.field4787.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field4784[0];
                    for (int var331 = 1; var331 < var328.field4787.length; var331++) {
                        if (var328.field4784[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field4784[var331];
                        }
                    }
                    field7140[field7158++] = var328.field4787[var329];
                    return;
                }
                field7140[field7158++] = var328.field4824;
                return;
            }
        } else {
            class423 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class497.method2965(0, field7140[--field7158]);
            } else {
                var47 = arg1 ? field7156 : field7146;
            }
            if (arg0 == 1300) {
                int var48 = field7140[--field7158] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2493(var48, -122, field7147[--field7142]);
                    return;
                }
                field7142--;
                return;
            }
            if (arg0 == 1301) {
                field7158 -= 2;
                int var49 = field7140[field7158];
                int var50 = field7140[field7158 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field5770 = null;
                    return;
                }
                var47.field5770 = class520.method3091(var49, (byte) 126, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field7140[--field7158];
                if (class333.field4259 != var51 && class243.field3125 != var51 && class51.field692 != var51) {
                    return;
                }
                var47.field5730 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field5702 = field7140[--field7158];
                return;
            }
            if (arg0 == 1304) {
                var47.field5714 = field7140[--field7158];
                return;
            }
            if (arg0 == 1305) {
                var47.field5799 = field7147[--field7142];
                return;
            }
            if (arg0 == 1306) {
                var47.field5696 = field7147[--field7142];
                return;
            }
            if (arg0 == 1307) {
                var47.field5701 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field5820 = field7140[--field7158];
                var47.field5767 = field7140[--field7158];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field7140[--field7158];
                int var53 = field7140[--field7158];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2508(var52, var53 - 1, (byte) -128);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field5698 = field7147[--field7142];
                return;
            }
            if (arg0 == 1311) {
                var47.field5723 = field7140[--field7158];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field7158 -= 3;
                    var54 = field7140[field7158] - 1;
                    var55 = field7140[field7158 + 1];
                    var56 = field7140[field7158 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7158 -= 2;
                    var54 = 10;
                    var55 = field7140[field7158];
                    var56 = field7140[field7158 + 1];
                }
                if (var47.field5816 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field5816 = new byte[11];
                    var47.field5775 = new byte[11];
                    var47.field5676 = new int[11];
                }
                var47.field5816[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field5682 = false;
                    for (int var57 = 0; var57 < var47.field5816.length; var57++) {
                        if (var47.field5816[var57] != 0) {
                            var47.field5682 = true;
                            break;
                        }
                    }
                } else {
                    var47.field5682 = true;
                }
                var47.field5775[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field5709 = field7140[--field7158];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(IZ)V")
    private static final void method2926(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7140[field7158++] = class467.field6867;
                return;
            }
            if (arg0 == 5001) {
                field7158 -= 3;
                class467.field6867 = field7140[field7158];
                class44.field639 = class436.method2570((byte) 15, field7140[field7158 + 1]);
                if (class44.field639 == null) {
                    class44.field639 = class198.field2553;
                }
                class265.field3368 = field7140[field7158 + 2];
                field7144++;
                class420.method2472((byte) -101, class81.field1015);
                class319.field4112.method565(28, class467.field6867);
                class319.field4112.method565(39, class44.field639.field1531);
                class319.field4112.method565(-128, class265.field3368);
                return;
            }
            if (arg0 == 5002) {
                field7142 -= 2;
                String var2 = field7147[field7142];
                String var3 = field7147[field7142 + 1];
                field7158 -= 2;
                int var4 = field7140[field7158];
                int var5 = field7140[field7158 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field7153++;
                class420.method2472((byte) -101, class426.field5846);
                class319.field4112.method565(-61, class415.method2442(-118, var2) + class415.method2442(63, var3) + 2);
                class319.field4112.method597(-128, var2);
                class319.field4112.method565(126, var4 - 1);
                class319.field4112.method565(-71, var5);
                class319.field4112.method597(-128, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field7140[--field7158];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class205.field2676[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field7147[field7142++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field7140[--field7158];
                int var9 = -1;
                if (var8 < 100 && class205.field2676[var8] != null) {
                    var9 = class129.field1770[var8];
                }
                field7140[field7158++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class44.field639 == null) {
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = class44.field639.field1531;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field7147[--field7142];
                method2935(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7142 -= 2;
                String var11 = field7147[field7142];
                String var12 = field7147[field7142 + 1];
                if (class363.field4685 != 0 || (!class437.field5998 || class306.field3943) && !class428.field5874) {
                    field7162++;
                    class420.method2472((byte) -101, class120.field1674);
                    class319.field4112.method565(44, 0);
                    int var13 = class319.field4112.field1176;
                    class319.field4112.method597(-128, var11);
                    class358.method2108(-53, var12, class319.field4112);
                    class319.field4112.method557(class319.field4112.field1176 - var13, false);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field7140[--field7158];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class438.field6058[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field7147[field7142++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field7140[--field7158];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class240.field3101[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field7147[field7142++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field7140[--field7158];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class36.field561[var18];
                }
                field7140[field7158++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class37.field573 == null || class37.field573.field7634 == null) {
                    var20 = class99.field1388;
                } else {
                    var20 = class37.field573.method3080(255, true);
                }
                field7147[field7142++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field7140[field7158++] = class265.field3368;
                return;
            }
            if (arg0 == 5017) {
                field7140[field7158++] = class112.field1540;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field7140[--field7158];
                int var22 = 0;
                if (var21 < 100 && class205.field2676[var21] != null) {
                    var22 = class129.field1770[var21];
                }
                field7140[field7158++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field7140[--field7158];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class12.field199[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field7147[field7142++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class37.field573 == null || class37.field573.field7634 == null) {
                    var25 = class99.field1388;
                } else {
                    var25 = class37.field573.method3085(255, false);
                }
                field7147[field7142++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field7140[--field7158];
                field7147[field7142++] = class261.field3314.method1757(var26, (byte) -29).field3939;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field7140[--field7158];
                class306 var28 = class261.field3314.method1757(var27, (byte) -124);
                if (var28.field3942 == null) {
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = var28.field3942.length;
                return;
            }
            if (arg0 == 5052) {
                field7158 -= 2;
                int var29 = field7140[field7158];
                int var30 = field7140[field7158 + 1];
                class306 var31 = class261.field3314.method1757(var29, (byte) 115);
                int var32 = var31.field3942[var30];
                field7140[field7158++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field7140[--field7158];
                class306 var34 = class261.field3314.method1757(var33, (byte) 94);
                if (var34.field3946 == null) {
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = var34.field3946.length;
                return;
            }
            if (arg0 == 5054) {
                field7158 -= 2;
                int var35 = field7140[field7158];
                int var36 = field7140[field7158 + 1];
                field7140[field7158++] = class261.field3314.method1757(var35, (byte) -118).field3946[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field7140[--field7158];
                field7147[field7142++] = class95.field1325.method972(-31926, var37).method1595((byte) 66);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field7140[--field7158];
                class255 var39 = class95.field1325.method972(-31926, var38);
                if (var39.field3216 == null) {
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = var39.field3216.length;
                return;
            }
            if (arg0 == 5057) {
                field7158 -= 2;
                int var40 = field7140[field7158];
                int var41 = field7140[field7158 + 1];
                field7140[field7158++] = class95.field1325.method972(-31926, var40).field3216[var41];
                return;
            }
            if (arg0 == 5058) {
                field7148 = new class216();
                field7148.field2772 = field7140[--field7158];
                field7148.field2775 = class95.field1325.method972(-31926, field7148.field2772);
                field7148.field2776 = new int[field7148.field2775.method1596(0)];
                return;
            }
            if (arg0 == 5059) {
                field7155++;
                class420.method2472((byte) -101, class527.field7790);
                class319.field4112.method565(-98, 0);
                int var42 = class319.field4112.field1176;
                class319.field4112.method565(-65, 0);
                class319.field4112.method609(field7148.field2772, -116);
                field7148.field2775.method1590(true, class319.field4112, field7148.field2776);
                class319.field4112.method557(class319.field4112.field1176 - var42, false);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field7147[--field7142];
                field7154++;
                class420.method2472((byte) -101, class222.field2861);
                class319.field4112.method565(-104, 0);
                int var44 = class319.field4112.field1176;
                class319.field4112.method597(-127, var43);
                class319.field4112.method609(field7148.field2772, -79);
                field7148.field2775.method1590(true, class319.field4112, field7148.field2776);
                class319.field4112.method557(class319.field4112.field1176 - var44, false);
                return;
            }
            if (arg0 == 5061) {
                field7155++;
                class420.method2472((byte) -101, class527.field7790);
                class319.field4112.method565(31, 0);
                int var45 = class319.field4112.field1176;
                class319.field4112.method565(-81, 1);
                class319.field4112.method609(field7148.field2772, -88);
                field7148.field2775.method1590(true, class319.field4112, field7148.field2776);
                class319.field4112.method557(class319.field4112.field1176 - var45, false);
                return;
            }
            if (arg0 == 5062) {
                field7158 -= 2;
                int var46 = field7140[field7158];
                int var47 = field7140[field7158 + 1];
                field7140[field7158++] = class261.field3314.method1757(var46, (byte) -85).field3936[var47];
                return;
            }
            if (arg0 == 5063) {
                field7158 -= 2;
                int var48 = field7140[field7158];
                int var49 = field7140[field7158 + 1];
                field7140[field7158++] = class261.field3314.method1757(var48, (byte) -126).field3940[var49];
                return;
            }
            if (arg0 == 5064) {
                field7158 -= 2;
                int var50 = field7140[field7158];
                int var51 = field7140[field7158 + 1];
                if (var51 == -1) {
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = class261.field3314.method1757(var50, (byte) 92).method1828((char) var51, (byte) -51);
                return;
            }
            if (arg0 == 5065) {
                field7158 -= 2;
                int var52 = field7140[field7158];
                int var53 = field7140[field7158 + 1];
                if (var53 == -1) {
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = class261.field3314.method1757(var52, (byte) 120).method1825(false, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field7140[--field7158];
                field7140[field7158++] = class95.field1325.method972(-31926, var54).method1596(0);
                return;
            }
            if (arg0 == 5067) {
                field7158 -= 2;
                int var55 = field7140[field7158];
                int var56 = field7140[field7158 + 1];
                int var57 = class95.field1325.method972(-31926, var55).method1594((byte) 106, var56).field5468;
                field7140[field7158++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field7158 -= 2;
                int var58 = field7140[field7158];
                int var59 = field7140[field7158 + 1];
                field7148.field2776[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field7158 -= 2;
                int var60 = field7140[field7158];
                int var61 = field7140[field7158 + 1];
                field7148.field2776[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field7158 -= 3;
                int var62 = field7140[field7158];
                int var63 = field7140[field7158 + 1];
                int var64 = field7140[field7158 + 2];
                class255 var65 = class95.field1325.method972(-31926, var62);
                if (var65.method1594((byte) 97, var63).field5468 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7140[field7158++] = var65.method1589(var64, var63, -1);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field7147[--field7142];
                boolean var67 = field7140[--field7158] == 1;
                class515.method3064(0, var67, var66);
                field7140[field7158++] = class25.field439;
                return;
            }
            if (arg0 == 5072) {
                if (class252.field3200 != null && class476.field6953 < class25.field439) {
                    field7140[field7158++] = class252.field3200[class476.field6953++] & 0xFFFF;
                    return;
                }
                field7140[field7158++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class476.field6953 = 0;
                return;
            }
            if (arg0 == 5074) {
                field7155++;
                class420.method2472((byte) -101, class527.field7790);
                class319.field4112.method565(40, 0);
                int var68 = class319.field4112.field1176;
                class319.field4112.method565(-111, 2);
                class319.field4112.method609(field7148.field2772, -74);
                field7148.field2775.method1590(true, class319.field4112, field7148.field2776);
                class319.field4112.method557(class319.field4112.field1176 - var68, false);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class439.field6113.method1488((byte) 63, 86)) {
                    field7140[field7158++] = 1;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class439.field6113.method1488((byte) 109, 82)) {
                    field7140[field7158++] = 1;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class439.field6113.method1488((byte) 82, 81)) {
                    field7140[field7158++] = 1;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class29.method193(false, field7140[--field7158]);
                return;
            }
            if (arg0 == 5201) {
                field7140[field7158++] = class172.method1133((byte) 87);
                return;
            }
            if (arg0 == 5205) {
                class487.method2907(field7140[--field7158], false, (byte) -79, -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field7140[--field7158];
                class325 var70 = class230.method1454(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = var70.field4164;
                return;
            }
            if (arg0 == 5207) {
                class325 var71 = class230.method1453(field7140[--field7158]);
                if (var71 != null && var71.field4166 != null) {
                    field7147[field7142++] = var71.field4166;
                    return;
                }
                field7147[field7142++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7140[field7158++] = class529.field7801;
                field7140[field7158++] = class302.field3917;
                return;
            }
            if (arg0 == 5209) {
                field7140[field7158++] = class267.field3389 + class230.field2983;
                field7140[field7158++] = class346.field4413 + class230.field2971;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field7140[--field7158];
                class325 var73 = class230.method1453(var72);
                if (var73 == null) {
                    field7140[field7158++] = 0;
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = var73.field4175 >> 14 & 0x3FFF;
                field7140[field7158++] = var73.field4175 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field7140[--field7158];
                class325 var75 = class230.method1453(var74);
                if (var75 == null) {
                    field7140[field7158++] = 0;
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = var75.field4165 - var75.field4177;
                field7140[field7158++] = var75.field4171 - var75.field4169;
                return;
            }
            if (arg0 == 5212) {
                class343 var76 = class415.method2443(true);
                if (var76 == null) {
                    field7140[field7158++] = -1;
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = var76.field4371;
                int var77 = var76.field4366 << 28 | class230.field2983 + var76.field4367 << 14 | class230.field2971 + var76.field4368;
                field7140[field7158++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class343 var78 = class509.method3024(125);
                if (var78 == null) {
                    field7140[field7158++] = -1;
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = var78.field4371;
                int var79 = var78.field4366 << 28 | class230.field2983 + var78.field4367 << 14 | class230.field2971 + var78.field4368;
                field7140[field7158++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field7140[--field7158];
                class325 var81 = class8.method57((byte) 120);
                if (var81 != null) {
                    boolean var82 = var81.method1934(var80 >> 14 & 0x3FFF, var80 >> 28 & 0x3, field7166, var80 & 0x3FFF, (byte) -91);
                    if (var82) {
                        class206.method1347(field7166[2], field7166[1], -115);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7158 -= 2;
                int var83 = field7140[field7158];
                int var84 = field7140[field7158 + 1];
                class476 var85 = class230.method1451(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class325 var87 = (class325) var85.method2860(0); var87 != null; var87 = (class325) var85.method2856(false)) {
                    if (var87.field4164 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field7140[field7158++] = 1;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field7140[--field7158];
                class325 var89 = class230.method1453(var88);
                if (var89 == null) {
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = var89.field4173;
                return;
            }
            if (arg0 == 5220) {
                field7140[field7158++] = class412.field5499 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field7140[--field7158];
                class206.method1347(var90 & 0x3FFF, var90 >> 14 & 0x3FFF, -123);
                return;
            }
            if (arg0 == 5222) {
                class325 var91 = class8.method57((byte) 60);
                if (var91 != null) {
                    boolean var92 = var91.method1933(class346.field4413 + class230.field2971, field7166, (byte) 0, class267.field3389 + class230.field2983);
                    if (var92) {
                        field7140[field7158++] = field7166[1];
                        field7140[field7158++] = field7166[2];
                        return;
                    }
                    field7140[field7158++] = -1;
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = -1;
                field7140[field7158++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7158 -= 2;
                int var93 = field7140[field7158];
                int var94 = field7140[field7158 + 1];
                class487.method2907(var93, false, (byte) -33, var94 & 0x3FFF, var94 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field7140[--field7158];
                class325 var96 = class8.method57((byte) 57);
                if (var96 != null) {
                    boolean var97 = var96.method1934(var95 >> 14 & 0x3FFF, var95 >> 28 & 0x3, field7166, var95 & 0x3FFF, (byte) -91);
                    if (var97) {
                        field7140[field7158++] = field7166[1];
                        field7140[field7158++] = field7166[2];
                        return;
                    }
                    field7140[field7158++] = -1;
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = -1;
                field7140[field7158++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field7140[--field7158];
                class325 var99 = class8.method57((byte) 100);
                if (var99 != null) {
                    boolean var100 = var99.method1933(var98 & 0x3FFF, field7166, (byte) 0, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field7140[field7158++] = field7166[1];
                        field7140[field7158++] = field7166[2];
                        return;
                    }
                    field7140[field7158++] = -1;
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = -1;
                field7140[field7158++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class5.method29(field7140[--field7158], (byte) 100);
                return;
            }
            if (arg0 == 5227) {
                field7158 -= 2;
                int var101 = field7140[field7158];
                int var102 = field7140[field7158 + 1];
                class487.method2907(var101, true, (byte) -110, var102 & 0x3FFF, var102 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class233.field3015 = field7140[--field7158] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7140[field7158++] = class233.field3015 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field7140[--field7158];
                class56.method321(var103, true);
                return;
            }
            if (arg0 == 5231) {
                field7158 -= 2;
                int var104 = field7140[field7158];
                boolean var105 = field7140[field7158 + 1] == 1;
                if (class19.field328 != null) {
                    class508 var106 = class19.field328.method2085((long) var104, -5423);
                    if (var106 != null && !var105) {
                        var106.method3021(77);
                        return;
                    }
                    if (var106 == null && var105) {
                        class508 var107 = new class508();
                        class19.field328.method2096((long) var104, var107, (byte) 76);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field7140[--field7158];
                if (class19.field328 != null) {
                    class508 var109 = class19.field328.method2085((long) var108, -5423);
                    field7140[field7158++] = var109 == null ? 0 : 1;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7158 -= 2;
                int var110 = field7140[field7158];
                boolean var111 = field7140[field7158 + 1] == 1;
                if (class359.field4648 != null) {
                    class508 var112 = class359.field4648.method2085((long) var110, -5423);
                    if (var112 != null && !var111) {
                        var112.method3021(-115);
                        return;
                    }
                    if (var112 == null && var111) {
                        class508 var113 = new class508();
                        class359.field4648.method2096((long) var110, var113, (byte) 76);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field7140[--field7158];
                if (class359.field4648 != null) {
                    class508 var115 = class359.field4648.method2085((long) var114, -5423);
                    field7140[field7158++] = var115 == null ? 0 : 1;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7140[field7158++] = class230.field2945 == null ? -1 : class230.field2945.field4164;
                return;
            }
            if (arg0 == 5236) {
                field7158 -= 2;
                int var116 = field7140[field7158];
                int var117 = field7140[field7158 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class232.method1474(var116, (byte) 91, var118, var119);
                if (var120 < 0) {
                    field7140[field7158++] = -1;
                    return;
                }
                field7140[field7158++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7158 -= 2;
                int var121 = field7140[field7158];
                int var122 = field7140[field7158 + 1];
                class207.method1348(var121, 3, false, var122, 6271);
                field7140[field7158++] = class460.field6432 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class460.field6432 != null) {
                    class207.method1348(-1, class421.field5647.field7727, false, -1, 6271);
                }
                return;
            }
            if (arg0 == 5302) {
                class268[] var123 = class42.method268((byte) 26);
                field7140[field7158++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field7140[--field7158];
                class268[] var125 = class42.method268((byte) 26);
                field7140[field7158++] = var125[var124].field3395;
                field7140[field7158++] = var125[var124].field3393;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class421.field5647.field7718;
                int var127 = class421.field5647.field7731;
                int var128 = -1;
                class268[] var129 = class42.method268((byte) 26);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class268 var131 = var129[var130];
                    if (var131.field3395 == var126 && var131.field3393 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field7140[field7158++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field7140[field7158++] = class144.method1008((byte) 109);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field7140[--field7158];
                if (var132 >= 1 && var132 <= 2) {
                    class207.method1348(-1, var132, false, -1, 6271);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7140[field7158++] = class421.field5647.field7727;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field7140[--field7158];
                if (var133 >= 1 && var133 <= 2) {
                    class421.field5647.field7727 = var133;
                    class421.field5647.method643(true, class172.field2221);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7142 -= 2;
                String var134 = field7147[field7142];
                String var135 = field7147[field7142 + 1];
                int var136 = field7140[--field7158];
                field7149++;
                class420.method2472((byte) -101, class37.field571);
                class319.field4112.method565(113, class415.method2442(106, var134) + class415.method2442(-80, var135) + 1);
                class319.field4112.method597(-127, var134);
                class319.field4112.method597(-127, var135);
                class319.field4112.method565(40, var136);
                return;
            }
            if (arg0 == 5401) {
                field7158 -= 2;
                class204.field2668[field7140[field7158]] = (short) class203.method1330((byte) -114, field7140[field7158 + 1]);
                class89.field1238.method123(false);
                class89.field1238.method122((byte) -102);
                class192.field2495.method1872((byte) 51);
                class218.method1396((byte) 110);
                return;
            }
            if (arg0 == 5405) {
                field7158 -= 2;
                int var137 = field7140[field7158];
                int var138 = field7140[field7158 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class63.field811[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7158 -= 7;
                int var139 = field7140[field7158];
                int var140 = field7140[field7158 + 1] << 1;
                int var141 = field7140[field7158 + 2];
                int var142 = field7140[field7158 + 3];
                int var143 = field7140[field7158 + 4];
                int var144 = field7140[field7158 + 5];
                int var145 = field7140[field7158 + 6];
                if (var139 >= 0 && var139 < 2 && class63.field811[var139] != null && var140 >= 0 && var140 < class63.field811[var139].length) {
                    class63.field811[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class63.field811[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class63.field811[field7140[--field7158]].length >> 1;
                field7140[field7158++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class460.field6432 != null) {
                    class207.method1348(-1, class421.field5647.field7727, false, -1, 6271);
                }
                if (class516.field7590 != null) {
                    class502.method2997((byte) -24);
                    System.exit(0);
                    return;
                }
                String var147 = class523.field7754 == null ? class276.method1698((byte) -85) : class523.field7754;
                class274.method1685(class520.field7690 == 1, false, 50, class172.field2221, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class386.field5076 != null) {
                    if (class386.field5076.field3541 == null) {
                        var148 = class32.method221(-1768728824, class386.field5076.field3544);
                    } else {
                        var148 = (String) class386.field5076.field3541;
                    }
                }
                field7147[field7142++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field7140[field7158++] = class441.field6150 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class460.field6432 != null) {
                    class207.method1348(-1, class421.field5647.field7727, false, -1, 6271);
                }
                String var149 = field7147[--field7142];
                boolean var150 = field7140[--field7158] == 1;
                String var151 = class276.method1698((byte) -85) + var149;
                class274.method1685(class520.field7690 == 1, var150, 81, class172.field2221, var151);
                return;
            }
            if (arg0 == 5422) {
                field7142 -= 2;
                String var152 = field7147[field7142];
                String var153 = field7147[field7142 + 1];
                int var154 = field7140[--field7158];
                if (var152.length() > 0) {
                    if (class287.field3666 == null) {
                        class287.field3666 = new String[class135.field1828[class494.field7234.field828]];
                    }
                    class287.field3666[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class388.field5105 == null) {
                        class388.field5105 = new String[class135.field1828[class494.field7234.field828]];
                    }
                    class388.field5105[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7147[--field7142]);
                return;
            }
            if (arg0 == 5424) {
                field7158 -= 11;
                class210.field2710 = field7140[field7158];
                class99.field1382 = field7140[field7158 + 1];
                class393.field5142 = field7140[field7158 + 2];
                class216.field2773 = field7140[field7158 + 3];
                class122.field1703 = field7140[field7158 + 4];
                class477.field6970 = field7140[field7158 + 5];
                class99.field1385 = field7140[field7158 + 6];
                class484.field7045 = field7140[field7158 + 7];
                class381.field4966 = field7140[field7158 + 8];
                class26.field445 = field7140[field7158 + 9];
                class81.field1018 = field7140[field7158 + 10];
                class391.field5121.method1294(class122.field1703, (byte) -121);
                class391.field5121.method1294(class477.field6970, (byte) -127);
                class391.field5121.method1294(class99.field1385, (byte) -123);
                class391.field5121.method1294(class484.field7045, (byte) -123);
                class391.field5121.method1294(class381.field4966, (byte) -116);
                class42.field615 = null;
                class499.field7336 = null;
                class302.field3913 = null;
                class349.field4462 = null;
                class269.field3417 = null;
                class457.field6377 = null;
                class311.field4017 = null;
                class302.field3915 = null;
                class419.field5575 = true;
                return;
            }
            if (arg0 == 5425) {
                class222.method1422(-2);
                class419.field5575 = false;
                return;
            }
            if (arg0 == 5426) {
                field7158 -= 2;
                class169.field2205 = field7140[field7158];
                class395.field5239 = field7140[field7158 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7158 -= 2;
                class291.field3721 = field7140[field7158 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7158 -= 2;
                int var155 = field7140[field7158];
                int var156 = field7140[field7158 + 1];
                field7140[field7158++] = class529.method3137(-124, var155, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class418.method2457(-57, false, field7147[--field7142]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class425.method2515(class172.field2221.field6139, "accountcreated", -27401);
                    return;
                } catch (Throwable var266) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7158 -= 4;
                int var157 = field7140[field7158];
                int var158 = field7140[field7158 + 1];
                int var159 = field7140[field7158 + 2];
                int var160 = field7140[field7158 + 3];
                class353.method2074(var159, (var157 & 0x3FFF) - class336.field4299, -112, false, (var157 >> 14 & 0x3FFF) - class35.field545, var160, var158);
                return;
            }
            if (arg0 == 5501) {
                field7158 -= 4;
                int var161 = field7140[field7158];
                int var162 = field7140[field7158 + 1];
                int var163 = field7140[field7158 + 2];
                int var164 = field7140[field7158 + 3];
                class368.method2152(var162, (byte) -98, var164, var163, (var161 & 0x3FFF) - class336.field4299, (var161 >> 14 & 0x3FFF) - class35.field545);
                return;
            }
            if (arg0 == 5502) {
                field7158 -= 6;
                int var165 = field7140[field7158];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class445.field6190 = var165;
                int var166 = field7140[field7158 + 1];
                if (var166 + 1 >= class63.field811[class445.field6190].length >> 1) {
                    throw new RuntimeException();
                }
                class406.field5439 = var166;
                class217.field2782 = 0;
                class195.field2520 = field7140[field7158 + 2];
                class254.field3212 = field7140[field7158 + 3];
                int var167 = field7140[field7158 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class174.field2245 = var167;
                int var168 = field7140[field7158 + 5];
                if (var168 + 1 >= class63.field811[class174.field2245].length >> 1) {
                    throw new RuntimeException();
                }
                class61.field802 = var168;
                class396.field5271 = 3;
                return;
            }
            if (arg0 == 5503) {
                class478.method2867(-27396);
                return;
            }
            if (arg0 == 5504) {
                field7158 -= 2;
                class69.method393((byte) 69, field7140[field7158 + 1], field7140[field7158], 0);
                return;
            }
            if (arg0 == 5505) {
                field7140[field7158++] = (int) class163.field2110 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7140[field7158++] = (int) class244.field3138 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class40.method252(-16);
                return;
            }
            if (arg0 == 5508) {
                class482.method2892(110);
                return;
            }
            if (arg0 == 5509) {
                class529.method3141(19078);
                return;
            }
            if (arg0 == 5510) {
                class234.method1486(-121);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field7140[--field7158];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class35.field545;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class200.field2594) {
                    var172 = class200.field2594;
                }
                int var173 = var171 - class336.field4299;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class118.field1647) {
                    var173 = class118.field1647;
                }
                class157.field2069 = (var172 << 7) + 64;
                class265.field3369 = (var173 << 7) + 64;
                class396.field5271 = 4;
                return;
            }
            if (arg0 == 5512) {
                class520.method3090(true);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7142 -= 2;
                String var174 = field7147[field7142];
                String var175 = field7147[field7142 + 1];
                int var176 = field7140[--field7158];
                if (class65.field821 != 10) {
                    return;
                }
                if (class470.field6876 == 0 && class35.field542 == 0 && class407.field5455 == 0 && class504.field7406 == 0) {
                    class111.method730(var175, var174, var176, false);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class227.method1437(32520);
                return;
            }
            if (arg0 == 5602) {
                if (class35.field542 == 0) {
                    class169.field2211 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field7158 -= 4;
                if (class65.field821 != 10) {
                    return;
                }
                if (class470.field6876 == 0 && class35.field542 == 0 && class407.field5455 == 0 && class504.field7406 == 0) {
                    class314.method1864(field7140[field7158 + 2], field7140[field7158 + 1], 0, field7140[field7158 + 3], field7140[field7158]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7142--;
                if (class65.field821 != 10) {
                    return;
                }
                if (class470.field6876 == 0 && class35.field542 == 0 && class407.field5455 == 0 && class504.field7406 == 0) {
                    class518.method3073(class216.method1386(-30907, field7147[field7142]), -125);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7142 -= 3;
                field7158 -= 7;
                if (class65.field821 != 10) {
                    return;
                }
                if (class470.field6876 == 0 && class35.field542 == 0 && class407.field5455 == 0 && class504.field7406 == 0) {
                    class491.method2939(field7140[field7158 + 3], field7140[field7158], field7147[field7142 + 1], -61, field7140[field7158 + 5] == 1, field7140[field7158 + 1], field7140[field7158 + 6] == 1, class216.method1386(-30907, field7147[field7142]), field7140[field7158 + 2], field7147[field7142 + 2], field7140[field7158 + 4] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class407.field5455 == 0) {
                    class82.field1020 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7140[field7158++] = class169.field2211;
                return;
            }
            if (arg0 == 5608) {
                field7140[field7158++] = class60.field787;
                return;
            }
            if (arg0 == 5609) {
                field7140[field7158++] = class82.field1020;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field7147[field7142++] = class208.field2698.length > var177 ? class483.method2893(4634, class208.field2698[var177]) : "";
                }
                class208.field2698 = null;
                return;
            }
            if (arg0 == 5611) {
                field7140[field7158++] = class112.field1544;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field7140[--field7158];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class421.field5647.field7698 = var178;
                class365.method2142(-26);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6002) {
                class421.field5647.method645(field7140[--field7158] == 1, -3);
                class365.method2142(-37);
                class466.method2813((byte) 0);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6003) {
                class421.field5647.field7699 = field7140[--field7158] == 1;
                class466.method2813((byte) 0);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6005) {
                class421.field5647.field7694 = field7140[--field7158] == 1;
                class365.method2142(121);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6006) {
                class421.field5647.field7705 = field7140[--field7158] == 1;
                class512.field7538.method853(!class421.field5647.field7705);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6007) {
                class421.field5647.field7725 = field7140[--field7158];
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6008) {
                class421.field5647.field7720 = field7140[--field7158] == 1;
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6009) {
                class421.field5647.field7696 = field7140[--field7158] == 1;
                class365.method2142(-112);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6010) {
                class421.field5647.field7719 = field7140[--field7158] == 1;
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field7140[--field7158];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class421.field5647.method3100(class520.field7690, var179, (byte) 123);
                class365.method2142(-25);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6012) {
                class421.field5647.method3101((byte) 120, class520.field7690, field7140[--field7158] == 1);
                class282.method1724(false);
                class322.method1922((byte) -32);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6014) {
                class421.field5647.field7708 = field7140[--field7158] == 1;
                class365.method2142(120);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6015) {
                class421.field5647.field7714 = field7140[--field7158] == 1;
                class365.method2142(124);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field7140[--field7158];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class421.field5647.field7728 = var180;
                class10.method69(class520.field7690, 5537);
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6017) {
                class421.field5647.field7723 = field7140[--field7158] == 1;
                class91.method626(22050);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field7140[--field7158];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class421.field5647.field7704 = var181;
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field7140[--field7158];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class421.field5647.field7712 != var182) {
                    if (class421.field5647.field7712 == 0 && class513.field7546 != -1) {
                        class362.method2121(var182, (byte) -63, 0, false, class288.field3685, class513.field7546);
                        class265.field3366 = false;
                    } else if (var182 == 0) {
                        class179.method1162((byte) -7);
                        class265.field3366 = false;
                    } else {
                        class140.method968(var182, (byte) -77);
                    }
                    class421.field5647.field7712 = var182;
                }
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field7140[--field7158];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class421.field5647.field7695 = var183;
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6021) {
                class421.field5647.field1322 = field7140[--field7158] == 1;
                class466.method2813((byte) 0);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field7140[--field7158];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class472.field6899 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class148.method1022(-15306, var184);
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                field7140[field7158++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field7140[--field7158];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class421.field5647.field7709 = var186;
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field7140[--field7158];
                if (var187 < 0 || var187 > class240.method1516(class472.field6899, -122)) {
                    var187 = 0;
                }
                class421.field5647.field7701 = var187;
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field7140[--field7158];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class91.method628((byte) 68, var188 == 1);
                return;
            }
            if (arg0 == 6028) {
                class421.field5647.field7715 = field7140[--field7158] != 0;
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6029) {
                class421.field5647.field7725 = field7140[--field7158];
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6030) {
                class421.field5647.field7722 = field7140[--field7158] != 0;
                class421.field5647.method643(true, class172.field2221);
                class365.method2142(-1);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field7140[--field7158];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class10.method69(var189, 5537);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field7140[--field7158];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class421.field5647.field7702 = var190;
                class421.field5647.method643(true, class172.field2221);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field7140[--field7158];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class421.field5647.field7730 = var191;
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6034) {
                class421.field5647.field7697 = field7140[--field7158] == 1;
                class421.field5647.method643(true, class172.field2221);
                class282.method1724(false);
                class461.field6449 = false;
                return;
            }
            if (arg0 == 6035) {
                class421.field5647.field1316 = field7140[--field7158] == 1;
                class365.method2142(2);
                class466.method2813((byte) 0);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7140[field7158++] = class421.field5647.field7698;
                return;
            }
            if (arg0 == 6102) {
                field7140[field7158++] = class421.field5647.method652(4, class520.field7690) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7140[field7158++] = class421.field5647.field7699 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7140[field7158++] = class421.field5647.field7694 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7140[field7158++] = class421.field5647.field7705 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7140[field7158++] = class421.field5647.field7725;
                return;
            }
            if (arg0 == 6108) {
                field7140[field7158++] = class421.field5647.field7720 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7140[field7158++] = class421.field5647.field7696 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7140[field7158++] = class421.field5647.field7719 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7140[field7158++] = class421.field5647.method3097((byte) 113, class520.field7690);
                return;
            }
            if (arg0 == 6112) {
                field7140[field7158++] = class421.field5647.method3102(class520.field7690, (byte) 48) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7140[field7158++] = class421.field5647.field7708 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7140[field7158++] = class421.field5647.field7714 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7140[field7158++] = class421.field5647.field7728;
                return;
            }
            if (arg0 == 6117) {
                field7140[field7158++] = class421.field5647.field7723 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7140[field7158++] = class421.field5647.field7704;
                return;
            }
            if (arg0 == 6119) {
                field7140[field7158++] = class421.field5647.field7712;
                return;
            }
            if (arg0 == 6120) {
                field7140[field7158++] = class421.field5647.field7695;
                return;
            }
            if (arg0 == 6121) {
                field7140[field7158++] = class512.field7538.method886() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7140[field7158++] = class258.method1615(10);
                return;
            }
            if (arg0 == 6124) {
                field7140[field7158++] = class421.field5647.field7709;
                return;
            }
            if (arg0 == 6125) {
                field7140[field7158++] = class421.field5647.field7701;
                return;
            }
            if (arg0 == 6126) {
                field7140[field7158++] = class512.field7538.method854() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7140[field7158++] = class421.field5647.field7726 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7140[field7158++] = class421.field5647.field7715 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7140[field7158++] = class421.field5647.field7725;
                return;
            }
            if (arg0 == 6130) {
                field7140[field7158++] = class421.field5647.field7722 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7140[field7158++] = class520.field7690;
                return;
            }
            if (arg0 == 6132) {
                field7140[field7158++] = class421.field5647.field7702;
                return;
            }
            if (arg0 == 6133) {
                field7140[field7158++] = class441.field6150 == 1 || class441.field6150 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7140[field7158++] = class240.method1516(class472.field6899, -121);
                return;
            }
            if (arg0 == 6135) {
                field7140[field7158++] = class421.field5647.field7730;
                return;
            }
            if (arg0 == 6136) {
                field7140[field7158++] = class421.field5647.field7697 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7158 -= 2;
                class200.field2582 = (short) field7140[field7158];
                if (class200.field2582 <= 0) {
                    class200.field2582 = 256;
                }
                class475.field6951 = (short) field7140[field7158 + 1];
                if (class475.field6951 <= 0) {
                    class475.field6951 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7158 -= 2;
                class471.field6891 = (short) field7140[field7158];
                if (class471.field6891 <= 0) {
                    class471.field6891 = 256;
                }
                class459.field6419 = (short) field7140[field7158 + 1];
                if (class459.field6419 <= 0) {
                    class459.field6419 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7158 -= 4;
                class196.field2538 = (short) field7140[field7158];
                if (class196.field2538 <= 0) {
                    class196.field2538 = 1;
                }
                class529.field7802 = (short) field7140[field7158 + 1];
                if (class529.field7802 <= 0) {
                    class529.field7802 = 32767;
                } else if (class529.field7802 < class196.field2538) {
                    class529.field7802 = class196.field2538;
                }
                class508.field7459 = (short) field7140[field7158 + 2];
                if (class508.field7459 <= 0) {
                    class508.field7459 = 1;
                }
                class76.field978 = (short) field7140[field7158 + 3];
                if (class76.field978 <= 0) {
                    class76.field978 = 32767;
                    return;
                }
                if (class76.field978 < class508.field7459) {
                    class76.field978 = class508.field7459;
                }
                return;
            }
            if (arg0 == 6203) {
                class340.method2001(class495.field7238.field5726, false, class495.field7238.field5735, 0, 0, 1);
                field7140[field7158++] = class139.field1856;
                field7140[field7158++] = class225.field2917;
                return;
            }
            if (arg0 == 6204) {
                field7140[field7158++] = class471.field6891;
                field7140[field7158++] = class459.field6419;
                return;
            }
            if (arg0 == 6205) {
                field7140[field7158++] = class200.field2582;
                field7140[field7158++] = class475.field6951;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7140[field7158++] = (int) (class173.method1134(true) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7140[field7158++] = (int) (class173.method1134(true) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7158 -= 3;
                int var192 = field7140[field7158];
                int var193 = field7140[field7158 + 1];
                int var194 = field7140[field7158 + 2];
                field7161.clear();
                field7161.set(11, 12);
                field7161.set(var194, var193, var192);
                field7140[field7158++] = (int) (field7161.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field7161.clear();
                field7161.setTime(new Date(class173.method1134(true)));
                field7140[field7158++] = field7161.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field7140[--field7158];
                boolean var196 = true;
                if (var195 < 0) {
                    var196 = (var195 + 1) % 4 == 0;
                } else if (var195 < 1582) {
                    var196 = var195 % 4 == 0;
                } else if (var195 % 4 != 0) {
                    var196 = false;
                } else if (var195 % 100 != 0) {
                    var196 = true;
                } else if (var195 % 400 != 0) {
                    var196 = false;
                }
                field7140[field7158++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7140[field7158++] = class196.method1268(1) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7140[field7158++] = class23.method159(10) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class65.field821 == 10 && class470.field6876 == 0 && class35.field542 == 0 && class407.field5455 == 0) {
                    field7140[field7158++] = class449.method2661(2) == -1 ? 0 : 1;
                    return;
                }
                field7140[field7158++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class311 var197 = class481.method2886(-112);
                if (var197 != null) {
                    field7140[field7158++] = var197.field4008;
                    field7140[field7158++] = var197.field634;
                    field7147[field7142++] = var197.field4009;
                    class174 var198 = var197.method1856(-1);
                    field7140[field7158++] = var198.field2243;
                    field7147[field7142++] = var198.field2241;
                    field7140[field7158++] = var197.field626;
                    field7140[field7158++] = var197.field4010;
                    return;
                }
                field7140[field7158++] = -1;
                field7140[field7158++] = 0;
                field7147[field7142++] = "";
                field7140[field7158++] = 0;
                field7147[field7142++] = "";
                field7140[field7158++] = 0;
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class311 var199 = class120.method765(1);
                if (var199 != null) {
                    field7140[field7158++] = var199.field4008;
                    field7140[field7158++] = var199.field634;
                    field7147[field7142++] = var199.field4009;
                    class174 var200 = var199.method1856(-1);
                    field7140[field7158++] = var200.field2243;
                    field7147[field7142++] = var200.field2241;
                    field7140[field7158++] = var199.field626;
                    field7140[field7158++] = var199.field4010;
                    return;
                }
                field7140[field7158++] = -1;
                field7140[field7158++] = 0;
                field7147[field7142++] = "";
                field7140[field7158++] = 0;
                field7147[field7142++] = "";
                field7140[field7158++] = 0;
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field7140[--field7158];
                if (class65.field821 == 10 && class470.field6876 == 0 && class35.field542 == 0 && class407.field5455 == 0) {
                    field7140[field7158++] = class18.method119((byte) -80, var201) ? 1 : 0;
                    return;
                }
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class421.field5647.field7693 = field7140[--field7158];
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6505) {
                field7140[field7158++] = class421.field5647.field7693;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field7140[--field7158];
                class311 var203 = class129.method819(-86, var202);
                if (var203 != null) {
                    field7140[field7158++] = var203.field634;
                    field7147[field7142++] = var203.field4009;
                    class174 var204 = var203.method1856(-1);
                    field7140[field7158++] = var204.field2243;
                    field7147[field7142++] = var204.field2241;
                    field7140[field7158++] = var203.field626;
                    field7140[field7158++] = var203.field4010;
                    return;
                }
                field7140[field7158++] = -1;
                field7147[field7142++] = "";
                field7140[field7158++] = 0;
                field7147[field7142++] = "";
                field7140[field7158++] = 0;
                field7140[field7158++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field7158 -= 4;
                int var205 = field7140[field7158];
                boolean var206 = field7140[field7158 + 1] == 1;
                int var207 = field7140[field7158 + 2];
                boolean var208 = field7140[field7158 + 3] == 1;
                class357.method2092(var207, var208, 29927, var205, var206);
                return;
            }
            if (arg0 == 6508) {
                class90.method624((byte) 104);
                return;
            }
            if (arg0 == 6509) {
                if (class65.field821 != 10) {
                    return;
                }
                class422.field5662 = field7140[--field7158] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class421.field5647.field7707 = field7140[--field7158] == 1;
                class421.field5647.method643(true, class172.field2221);
                return;
            }
            if (arg0 == 6601) {
                field7140[field7158++] = class421.field5647.field7707 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class463.field6568 == class287.field3664) {
            if (arg0 == 6700) {
                int var209 = class381.field4963.method2095(0);
                if (class282.field3610 != -1) {
                    var209++;
                }
                field7140[field7158++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field7140[--field7158];
                if (class282.field3610 != -1) {
                    if (var210 == 0) {
                        field7140[field7158++] = class282.field3610;
                        return;
                    }
                    var210--;
                }
                class367 var211 = (class367) class381.field4963.method2087(0);
                while (var210-- > 0) {
                    var211 = (class367) class381.field4963.method2091(-126);
                }
                field7140[field7158++] = var211.field4719;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field7140[--field7158];
                if (class296.field3842[var212] == null) {
                    field7147[field7142++] = "";
                    return;
                }
                String var213 = class296.field3842[var212][0].field5666;
                if (var213 == null) {
                    field7147[field7142++] = "";
                    return;
                }
                field7147[field7142++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field7140[--field7158];
                if (class296.field3842[var214] == null) {
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = class296.field3842[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field7158 -= 2;
                int var215 = field7140[field7158];
                int var216 = field7140[field7158 + 1];
                if (class296.field3842[var215] == null) {
                    field7147[field7142++] = "";
                    return;
                }
                String var217 = class296.field3842[var215][var216].field5666;
                if (var217 == null) {
                    field7147[field7142++] = "";
                    return;
                }
                field7147[field7142++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field7158 -= 2;
                int var218 = field7140[field7158];
                int var219 = field7140[field7158 + 1];
                if (class296.field3842[var218] == null) {
                    field7140[field7158++] = 0;
                    return;
                }
                field7140[field7158++] = class296.field3842[var218][var219].field5765;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field7158 -= 3;
                int var220 = field7140[field7158];
                int var221 = field7140[field7158 + 1];
                int var222 = field7140[field7158 + 2];
                class449.method2663("", var220 << 16 | var221, var222, 2, 1);
                return;
            }
            if (arg0 == 6708) {
                field7158 -= 3;
                int var223 = field7140[field7158];
                int var224 = field7140[field7158 + 1];
                int var225 = field7140[field7158 + 2];
                class449.method2663("", var223 << 16 | var224, var225, 2, 2);
                return;
            }
            if (arg0 == 6709) {
                field7158 -= 3;
                int var226 = field7140[field7158];
                int var227 = field7140[field7158 + 1];
                int var228 = field7140[field7158 + 2];
                class449.method2663("", var226 << 16 | var227, var228, 2, 3);
                return;
            }
            if (arg0 == 6710) {
                field7158 -= 3;
                int var229 = field7140[field7158];
                int var230 = field7140[field7158 + 1];
                int var231 = field7140[field7158 + 2];
                class449.method2663("", var229 << 16 | var230, var231, 2, 4);
                return;
            }
            if (arg0 == 6711) {
                field7158 -= 3;
                int var232 = field7140[field7158];
                int var233 = field7140[field7158 + 1];
                int var234 = field7140[field7158 + 2];
                class449.method2663("", var232 << 16 | var233, var234, 2, 5);
                return;
            }
            if (arg0 == 6712) {
                field7158 -= 3;
                int var235 = field7140[field7158];
                int var236 = field7140[field7158 + 1];
                int var237 = field7140[field7158 + 2];
                class449.method2663("", var235 << 16 | var236, var237, 2, 6);
                return;
            }
            if (arg0 == 6713) {
                field7158 -= 3;
                int var238 = field7140[field7158];
                int var239 = field7140[field7158 + 1];
                int var240 = field7140[field7158 + 2];
                class449.method2663("", var238 << 16 | var239, var240, 2, 7);
                return;
            }
            if (arg0 == 6714) {
                field7158 -= 3;
                int var241 = field7140[field7158];
                int var242 = field7140[field7158 + 1];
                int var243 = field7140[field7158 + 2];
                class449.method2663("", var241 << 16 | var242, var243, 2, 8);
                return;
            }
            if (arg0 == 6715) {
                field7158 -= 3;
                int var244 = field7140[field7158];
                int var245 = field7140[field7158 + 1];
                int var246 = field7140[field7158 + 2];
                class449.method2663("", var244 << 16 | var245, var246, 2, 9);
                return;
            }
            if (arg0 == 6716) {
                field7158 -= 3;
                int var247 = field7140[field7158];
                int var248 = field7140[field7158 + 1];
                int var249 = field7140[field7158 + 2];
                class449.method2663("", var247 << 16 | var248, var249, 2, 10);
                return;
            }
            if (arg0 == 6717) {
                field7158 -= 3;
                int var250 = field7140[field7158];
                int var251 = field7140[field7158 + 1];
                int var252 = field7140[field7158 + 2];
                class423 var253 = class520.method3091(var250 << 16 | var251, (byte) 126, var252);
                class356.method2082(-1);
                class260 var254 = client.method3037(var253);
                class271.method1667(var254.method1628((byte) -113), var254.field3302, var253, (byte) 68);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field7140[--field7158];
                class429 var256 = class117.field1643.method1093(var255, 92);
                if (var256.field5916 == null) {
                    field7147[field7142++] = "";
                    return;
                }
                field7147[field7142++] = var256.field5916;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field7140[--field7158];
                class429 var258 = class117.field1643.method1093(var257, -37);
                field7140[field7158++] = var258.field5875;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field7140[--field7158];
                class429 var260 = class117.field1643.method1093(var259, 90);
                field7140[field7158++] = var260.field5899;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field7140[--field7158];
                class429 var262 = class117.field1643.method1093(var261, 110);
                field7140[field7158++] = var262.field5912;
                return;
            }
            if (arg0 == 6804) {
                field7158 -= 2;
                int var263 = field7140[field7158];
                int var264 = field7140[field7158 + 1];
                class483 var265 = class495.field7242.method1837(11, var264);
                if (var265.method2896((byte) 121)) {
                    field7147[field7142++] = class117.field1643.method1093(var263, 79).method2542(var265.field7033, (byte) 78, var264);
                    return;
                }
                field7140[field7158++] = class117.field1643.method1093(var263, 116).method2543(var265.field7035, var264, (byte) 58);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static final void method2927(int arg0) {
        if (arg0 == -1 || !class495.method2961(arg0, 85)) {
            return;
        }
        class423[] var1 = class296.field3842[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class423 var3 = var1[var2];
            if (var3.field5745 != null) {
                class195 var4 = new class195();
                var4.field2516 = var3;
                var4.field2523 = var3.field5745;
                method2932(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lgd;)V")
    public static final void method2928(class195 arg0) {
        method2932(arg0, 200000);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    private static final void method2929(int arg0) {
        class423 var1 = class497.method2965(0, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class423[] var3 = class221.field2855[var2];
        if (var3 == null) {
            class423[] var4 = class296.field3842[var2];
            int var5 = var4.length;
            var3 = class221.field2855[var2] = new class423[var5];
            class526.method3115(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class526.method3115(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    private static final void method2930(int arg0) {
        class423 var1 = class497.method2965(0, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class423[] var3 = class221.field2855[var2];
        if (var3 == null) {
            class423[] var4 = class296.field3842[var2];
            int var5 = var4.length;
            var3 = class221.field2855[var2] = new class423[var5];
            class526.method3115(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class526.method3115(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "()V")
    public static final void method2931() {
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lgd;I)V")
    private static final void method2932(class195 arg0, int arg1) {
        Object[] var2 = arg0.field2523;
        int var3 = (Integer) var2[0];
        class457 var4 = class326.method1938(0, var3);
        if (var4 == null) {
            return;
        }
        field7145 = new int[var4.field6379];
        int var5 = 0;
        field7139 = new String[var4.field6372];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2521;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2530;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2516 == null ? -1 : arg0.field2516.field5734;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2528;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2516 == null ? -1 : arg0.field2516.field5756;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2518 == null ? -1 : arg0.field2518.field5734;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2518 == null ? -1 : arg0.field2518.field5756;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2517;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2522;
                }
                field7145[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2533;
                }
                field7139[var6++] = var9;
            }
        }
        field7167 = arg0.field2529;
        method2924(var4, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lpb;II)V")
    public static final void method2933(class296 arg0, int arg1, int arg2) {
        class457 var3 = class415.method2444(arg2, 114, arg0, arg1);
        if (var3 == null) {
            return;
        }
        field7145 = new int[var3.field6379];
        field7139 = new String[var3.field6372];
        if (class228.field2935 == var3.field6378 || class187.field2442 == var3.field6378 || class51.field694 == var3.field6378) {
            int var4 = 0;
            int var5 = 0;
            if (class14.field240 != null) {
                var4 = class14.field240.field5808;
                var5 = class14.field240.field5802;
            }
            field7145[0] = class268.field3397.method717((byte) 82) - var4;
            field7145[1] = class268.field3397.method721((byte) 74) - var5;
        }
        method2924(var3, 200000);
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method2934(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7161.setTime(new Date(var1));
        int var3 = field7161.get(5);
        int var4 = field7161.get(2);
        int var5 = field7161.get(1);
        return var3 + "-" + field7164[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2935(String arg0, int arg1) {
        if (class363.field4685 == 0 && !(!class437.field5998 || class306.field3943) || class428.field5874) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class65.field820.method1127(0, false))) {
            var3 = 0;
            arg0 = arg0.substring(class65.field820.method1127(0, false).length());
        } else if (var2.startsWith(class362.field4677.method1127(0, false))) {
            var3 = 1;
            arg0 = arg0.substring(class362.field4677.method1127(0, false).length());
        } else if (var2.startsWith(class104.field1429.method1127(0, false))) {
            var3 = 2;
            arg0 = arg0.substring(class104.field1429.method1127(0, false).length());
        } else if (var2.startsWith(class231.field2995.method1127(0, false))) {
            var3 = 3;
            arg0 = arg0.substring(class231.field2995.method1127(0, false).length());
        } else if (var2.startsWith(class115.field1611.method1127(0, false))) {
            var3 = 4;
            arg0 = arg0.substring(class115.field1611.method1127(0, false).length());
        } else if (var2.startsWith(class351.field4492.method1127(0, false))) {
            var3 = 5;
            arg0 = arg0.substring(class351.field4492.method1127(0, false).length());
        } else if (var2.startsWith(class421.field5645.method1127(0, false))) {
            var3 = 6;
            arg0 = arg0.substring(class421.field5645.method1127(0, false).length());
        } else if (var2.startsWith(class25.field438.method1127(0, false))) {
            var3 = 7;
            arg0 = arg0.substring(class25.field438.method1127(0, false).length());
        } else if (var2.startsWith(class382.field5031.method1127(0, false))) {
            var3 = 8;
            arg0 = arg0.substring(class382.field5031.method1127(0, false).length());
        } else if (var2.startsWith(class81.field1016.method1127(0, false))) {
            var3 = 9;
            arg0 = arg0.substring(class81.field1016.method1127(0, false).length());
        } else if (var2.startsWith(class118.field1649.method1127(0, false))) {
            var3 = 10;
            arg0 = arg0.substring(class118.field1649.method1127(0, false).length());
        } else if (var2.startsWith(class78.field1000.method1127(0, false))) {
            var3 = 11;
            arg0 = arg0.substring(class78.field1000.method1127(0, false).length());
        } else if (class379.field4920 != 0) {
            if (var2.startsWith(class65.field820.method1127(class379.field4920, false))) {
                var3 = 0;
                arg0 = arg0.substring(class65.field820.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class362.field4677.method1127(class379.field4920, false))) {
                var3 = 1;
                arg0 = arg0.substring(class362.field4677.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class104.field1429.method1127(class379.field4920, false))) {
                var3 = 2;
                arg0 = arg0.substring(class104.field1429.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class231.field2995.method1127(class379.field4920, false))) {
                var3 = 3;
                arg0 = arg0.substring(class231.field2995.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class115.field1611.method1127(class379.field4920, false))) {
                var3 = 4;
                arg0 = arg0.substring(class115.field1611.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class351.field4492.method1127(class379.field4920, false))) {
                var3 = 5;
                arg0 = arg0.substring(class351.field4492.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class421.field5645.method1127(class379.field4920, false))) {
                var3 = 6;
                arg0 = arg0.substring(class421.field5645.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class25.field438.method1127(class379.field4920, false))) {
                var3 = 7;
                arg0 = arg0.substring(class25.field438.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class382.field5031.method1127(class379.field4920, false))) {
                var3 = 8;
                arg0 = arg0.substring(class382.field5031.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class81.field1016.method1127(class379.field4920, false))) {
                var3 = 9;
                arg0 = arg0.substring(class81.field1016.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class118.field1649.method1127(class379.field4920, false))) {
                var3 = 10;
                arg0 = arg0.substring(class118.field1649.method1127(class379.field4920, false).length());
            } else if (var2.startsWith(class78.field1000.method1127(class379.field4920, false))) {
                var3 = 11;
                arg0 = arg0.substring(class78.field1000.method1127(class379.field4920, false).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class143.field1891.method1127(0, false))) {
            var5 = 1;
            arg0 = arg0.substring(class143.field1891.method1127(0, false).length());
        } else if (var4.startsWith(class517.field7616.method1127(0, false))) {
            var5 = 2;
            arg0 = arg0.substring(class517.field7616.method1127(0, false).length());
        } else if (var4.startsWith(class83.field1032.method1127(0, false))) {
            var5 = 3;
            arg0 = arg0.substring(class83.field1032.method1127(0, false).length());
        } else if (var4.startsWith(class189.field2481.method1127(0, false))) {
            var5 = 4;
            arg0 = arg0.substring(class189.field2481.method1127(0, false).length());
        } else if (var4.startsWith(class287.field3671.method1127(0, false))) {
            var5 = 5;
            arg0 = arg0.substring(class287.field3671.method1127(0, false).length());
        } else if (class379.field4920 != 0) {
            if (var4.startsWith(class143.field1891.method1127(class379.field4920, false))) {
                var5 = 1;
                arg0 = arg0.substring(class143.field1891.method1127(class379.field4920, false).length());
            } else if (var4.startsWith(class517.field7616.method1127(class379.field4920, false))) {
                var5 = 2;
                arg0 = arg0.substring(class517.field7616.method1127(class379.field4920, false).length());
            } else if (var4.startsWith(class83.field1032.method1127(class379.field4920, false))) {
                var5 = 3;
                arg0 = arg0.substring(class83.field1032.method1127(class379.field4920, false).length());
            } else if (var4.startsWith(class189.field2481.method1127(class379.field4920, false))) {
                var5 = 4;
                arg0 = arg0.substring(class189.field2481.method1127(class379.field4920, false).length());
            } else if (var4.startsWith(class287.field3671.method1127(class379.field4920, false))) {
                var5 = 5;
                arg0 = arg0.substring(class287.field3671.method1127(class379.field4920, false).length());
            }
        }
        field7157++;
        class420.method2472((byte) -101, class67.field838);
        class319.field4112.method565(-90, 0);
        int var6 = class319.field4112.field1176;
        if (arg1 == 5021) {
            class319.field4112.method565(61, 1);
        } else if (arg1 == 5022) {
            class319.field4112.method565(116, 2);
        } else {
            class319.field4112.method565(-119, 0);
        }
        class319.field4112.method565(-60, var3);
        class319.field4112.method565(74, var5);
        class358.method2108(-54, arg0, class319.field4112);
        class319.field4112.method557(class319.field4112.field1176 - var6, false);
    }
}
