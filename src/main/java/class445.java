import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class445 {

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field6261 = new String[1000];

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "[I")
    private static int[] field6262 = new int[1000];

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "[Lbo;")
    private static class33[] field6252 = new class33[50];

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "[[I")
    private static int[][] field6259 = new int[5][5000];

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    private static int field6265 = 0;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    private static int field6268 = 0;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    private static int field6257 = 0;

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "[I")
    private static int[] field6273 = new int[5];

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6260 = Calendar.getInstance();

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "[I")
    private static int[] field6275 = new int[3];

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field6277 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dba", name = "A", descriptor = "Lgg;")
    public static class114 field6276 = new class114(4);

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
    private static int field6278 = 0;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "Lgaa;")
    private static class460 field6254;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "Lgaa;")
    private static class460 field6266;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Ljh;")
    private static class533 field6255;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "[I")
    private static int[] field6258;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "[Ljava/lang/String;")
    private static String[] field6272;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljea;I)V", line = 11)
    private static final void method2620(class236 arg0, int arg1) {
        field6265 = 0;
        field6257 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3048;
        int[] var4 = arg0.field3052;
        byte var5 = -1;
        field6268 = 0;
        try {
            int var6 = 0;
            label270: while (true) {
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
                        method2623(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2631(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6262[field6265++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6262[field6265++] = class461.field6637.field3563[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class461.field6637.method1686(0, field6262[--field6265], var8);
                } else if (var43 == 3) {
                    field6261[field6257++] = arg0.field3043[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6265 -= 2;
                    if (field6262[field6265 + 1] != field6262[field6265]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6265 -= 2;
                    if (field6262[field6265 + 1] == field6262[field6265]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6265 -= 2;
                    if (field6262[field6265] < field6262[field6265 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6265 -= 2;
                    if (field6262[field6265] > field6262[field6265 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6268 == 0) {
                        return;
                    }
                    class33 var9 = field6252[--field6268];
                    arg0 = var9.field510;
                    var3 = arg0.field3048;
                    var4 = arg0.field3052;
                    var2 = var9.field507;
                    field6258 = var9.field511;
                    field6272 = var9.field509;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6262[field6265++] = class461.field6637.method1681(0, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class461.field6637.method1683(true, field6262[--field6265], var11);
                } else if (var43 == 31) {
                    field6265 -= 2;
                    if (field6262[field6265] <= field6262[field6265 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6265 -= 2;
                    if (field6262[field6265] >= field6262[field6265 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6262[field6265++] = field6258[var4[var2]];
                } else if (var43 == 34) {
                    field6258[var4[var2]] = field6262[--field6265];
                } else if (var43 == 35) {
                    field6261[field6257++] = field6272[var4[var2]];
                } else if (var43 == 36) {
                    field6272[var4[var2]] = field6261[--field6257];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6257 -= var12;
                    String var13 = class267.method1605(field6261, var12, true, field6257);
                    field6261[field6257++] = var13;
                } else if (var43 == 38) {
                    field6265--;
                } else if (var43 == 39) {
                    field6257--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class236 var15 = class293.method1757(1, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3045];
                    String[] var17 = new String[var15.field3047];
                    for (int var18 = 0; var18 < var15.field3041; var18++) {
                        var16[var18] = field6262[field6265 + var18 - var15.field3041];
                    }
                    for (int var19 = 0; var19 < var15.field3054; var19++) {
                        var17[var19] = field6261[field6257 + var19 - var15.field3054];
                    }
                    field6265 -= var15.field3041;
                    field6257 -= var15.field3054;
                    class33 var20 = new class33();
                    var20.field510 = arg0;
                    var20.field507 = var2;
                    var20.field511 = field6258;
                    var20.field509 = field6272;
                    if (field6268 >= field6252.length) {
                        throw new RuntimeException();
                    }
                    field6252[field6268++] = var20;
                    arg0 = var15;
                    var3 = var15.field3048;
                    var4 = var15.field3052;
                    var2 = -1;
                    field6258 = var16;
                    field6272 = var17;
                } else if (var43 == 42) {
                    field6262[field6265++] = class173.field2267[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class173.field2267[var21] = field6262[--field6265];
                    class491.method2864(1, var21);
                    class125.field1497 |= class665.field9111[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6262[--field6265];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6273[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field6259[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6262[--field6265];
                    if (var28 < 0 || var28 >= field6273[var27]) {
                        throw new RuntimeException();
                    }
                    field6262[field6265++] = field6259[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6265 -= 2;
                    int var30 = field6262[field6265];
                    if (var30 < 0 || var30 >= field6273[var29]) {
                        throw new RuntimeException();
                    }
                    field6259[var29][var30] = field6262[field6265 + 1];
                } else if (var43 == 47) {
                    String var31 = class702.field9903[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6261[field6257++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class702.field9903[var32] = field6261[--field6257];
                    class367.method2251(var32, -105);
                } else if (var43 == 51) {
                    class583 var33 = arg0.field3053[var4[var2]];
                    class394 var34 = (class394) var33.method3248((long) field6262[--field6265], 0);
                    if (var34 != null) {
                        var2 += var34.field5494;
                    }
                } else if (var43 == 86) {
                    if (field6262[--field6265] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field6262[--field6265] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field3042 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field8746).append(" ");
                for (int var41 = field6268 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6252[var41].field510.field8746).append(" ");
                }
                var40.append("op: ").append(var5);
                class486.method2844((byte) -1, var40.toString(), var42);
            } else {
                class395.method2352("Clientscript error in: " + arg0.field3042, 4, -128);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3042).append("\n");
                for (int var38 = field6268 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6252[var38].field510.field3042).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class486.method2844((byte) -1, var37.toString(), var42);
                class192.method1210(-128, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lnha;II)V", line = 456)
    public static final void method2621(class501 arg0, int arg1, int arg2) {
        class236 var3 = class471.method2773(arg0, (byte) 123, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field6258 = new int[var3.field3045];
        field6272 = new String[var3.field3047];
        if (class68.field927 == var3.field3046 || class734.field10269 == var3.field3046 || class7.field76 == var3.field3046) {
            int var4 = 0;
            int var5 = 0;
            if (class412.field5821 != null) {
                var4 = class412.field5821.field6572;
                var5 = class412.field5821.field6543;
            }
            field6258[0] = class402.field5566.method2337(-114) - var4;
            field6258[1] = class402.field5566.method2336((byte) 9) - var5;
        }
        method2620(var3, 200000);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V", line = 481)
    public static final void method2622(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(IZ)V", line = 486)
    private static final void method2623(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6265 -= 3;
                int var2 = field6262[field6265];
                int var3 = field6262[field6265 + 1];
                int var4 = field6262[field6265 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class460 var5 = class102.method684(5025, var2);
                if (var5.field6567 == null) {
                    var5.field6567 = new class460[var4 + 1];
                }
                if (var5.field6567.length <= var4) {
                    class460[] var6 = new class460[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6567.length; var7++) {
                        var6[var7] = var5.field6567[var7];
                    }
                    var5.field6567 = var6;
                }
                if (var4 > 0 && var5.field6567[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class460 var8 = new class460();
                var8.field6483 = var3;
                var8.field6528 = var8.field6524 = var5.field6524;
                var8.field6601 = var4;
                var5.field6567[var4] = var8;
                if (arg1) {
                    field6266 = var8;
                } else {
                    field6254 = var8;
                }
                class663.method3591(16886, var5);
                return;
            }
            if (arg0 == 101) {
                class460 var9 = arg1 ? field6266 : field6254;
                if (var9.field6601 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class460 var10 = class102.method684(5025, var9.field6524);
                var10.field6567[var9.field6601] = null;
                class663.method3591(16886, var10);
                return;
            }
            if (arg0 == 102) {
                class460 var11 = class102.method684(5025, field6262[--field6265]);
                var11.field6567 = null;
                class663.method3591(16886, var11);
                return;
            }
            if (arg0 == 200) {
                field6265 -= 2;
                int var12 = field6262[field6265];
                int var13 = field6262[field6265 + 1];
                class460 var14 = class611.method3340(var13, var12, -89);
                if (var14 != null && var13 != -1) {
                    field6262[field6265++] = 1;
                    if (arg1) {
                        field6266 = var14;
                        return;
                    }
                    field6254 = var14;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6262[--field6265];
                class460 var16 = class102.method684(5025, var15);
                if (var16 != null) {
                    field6262[field6265++] = 1;
                    if (arg1) {
                        field6266 = var16;
                        return;
                    }
                    field6254 = var16;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6262[--field6265];
                method2632(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6262[--field6265];
                method2626(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6265 -= 2;
                int var19 = field6262[field6265];
                int var20 = field6262[field6265 + 1];
                if (class339.field4374.field7665 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class568.field7928.length; var21++) {
                    if (class568.field7928[var21] == var19) {
                        class339.field4374.field7665.method1923(class5.field52, 14651, var20, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class476.field6803.length; var22++) {
                    if (class476.field6803[var22] == var19) {
                        class339.field4374.field7665.method1923(class5.field52, 14651, var20, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6265 -= 2;
                int var23 = field6262[field6265];
                int var24 = field6262[field6265 + 1];
                if (class339.field4374.field7665 == null) {
                    return;
                }
                class339.field4374.field7665.method1933(var24, 128, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6262[--field6265] != 0;
                if (class339.field4374.field7665 == null) {
                    return;
                }
                class339.field4374.field7665.method1921(var25, (byte) -118);
                return;
            }
            if (arg0 == 411) {
                field6265 -= 2;
                int var26 = field6262[field6265];
                int var27 = field6262[field6265 + 1];
                if (class339.field4374.field7665 == null) {
                    return;
                }
                class339.field4374.field7665.method1930(var27, class190.field2488, var26, (byte) 25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class460 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class102.method684(5025, field6262[--field6265]);
            } else {
                var28 = arg1 ? field6266 : field6254;
            }
            if (arg0 == 1000) {
                field6265 -= 4;
                var28.field6624 = field6262[field6265];
                var28.field6502 = field6262[field6265 + 1];
                int var29 = field6262[field6265 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field6262[field6265 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field6591 = (byte) var29;
                var28.field6577 = (byte) var30;
                class663.method3591(16886, var28);
                class582.method3241(var28, 3);
                if (var28.field6601 == -1) {
                    class550.method3132((byte) 79, var28.field6524);
                }
                return;
            }
            if (arg0 == 1001) {
                field6265 -= 4;
                var28.field6610 = field6262[field6265];
                var28.field6504 = field6262[field6265 + 1];
                var28.field6613 = 0;
                var28.field6628 = 0;
                int var31 = field6262[field6265 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field6262[field6265 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field6612 = (byte) var31;
                var28.field6523 = (byte) var32;
                class663.method3591(16886, var28);
                class582.method3241(var28, 3);
                if (var28.field6483 == 0) {
                    class146.method908(false, 256, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field6262[--field6265] == 1;
                if (var28.field6611 != var33) {
                    var28.field6611 = var33;
                    class663.method3591(16886, var28);
                }
                if (var28.field6601 == -1) {
                    class524.method3011(-116, var28.field6524);
                }
                return;
            }
            if (arg0 == 1004) {
                field6265 -= 2;
                var28.field6510 = field6262[field6265];
                var28.field6608 = field6262[field6265 + 1];
                class663.method3591(16886, var28);
                class582.method3241(var28, 3);
                if (var28.field6483 == 0) {
                    class146.method908(false, 256, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field6570 = field6262[--field6265] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class460 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class102.method684(5025, field6262[--field6265]);
            } else {
                var34 = arg1 ? field6266 : field6254;
            }
            if (arg0 == 1100) {
                field6265 -= 2;
                var34.field6549 = field6262[field6265];
                if (var34.field6549 > var34.field6604 - var34.field6566) {
                    var34.field6549 = var34.field6604 - var34.field6566;
                }
                if (var34.field6549 < 0) {
                    var34.field6549 = 0;
                }
                var34.field6466 = field6262[field6265 + 1];
                if (var34.field6466 > var34.field6512 - var34.field6514) {
                    var34.field6466 = var34.field6512 - var34.field6514;
                }
                if (var34.field6466 < 0) {
                    var34.field6466 = 0;
                }
                class663.method3591(16886, var34);
                if (var34.field6601 == -1) {
                    class614.method3371((byte) -48, var34.field6524);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field6569 = field6262[--field6265];
                class663.method3591(16886, var34);
                if (var34.field6601 == -1) {
                    class462.method2731(var34.field6524, (byte) -69);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field6537 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field6494 = field6262[--field6265];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field6535 = field6262[--field6265];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field6262[--field6265];
                if (var34.field6491 != var35) {
                    var34.field6491 = var35;
                    class663.method3591(16886, var34);
                }
                if (var34.field6601 == -1) {
                    class92.method631(true, var34.field6524);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field6619 = field6262[--field6265];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field6544 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field6525 = 1;
                var34.field6625 = field6262[--field6265];
                class663.method3591(16886, var34);
                if (var34.field6601 == -1) {
                    class748.method4183(var34.field6524, 4);
                }
                return;
            }
            if (arg0 == 1109) {
                field6265 -= 6;
                var34.field6508 = field6262[field6265];
                var34.field6469 = field6262[field6265 + 1];
                var34.field6561 = field6262[field6265 + 2];
                var34.field6606 = field6262[field6265 + 3];
                var34.field6563 = field6262[field6265 + 4];
                var34.field6573 = field6262[field6265 + 5];
                class663.method3591(16886, var34);
                if (var34.field6601 == -1) {
                    class58.method457(true, var34.field6524);
                    class11.method56(39, var34.field6524);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field6262[--field6265];
                if (var34.field6477 != var36) {
                    var34.field6477 = var36;
                    var34.field6498 = 0;
                    var34.field6622 = 1;
                    var34.field6564 = 0;
                    class747 var37 = var34.field6477 == -1 ? null : class646.field8903.method643(var34.field6477, -101);
                    if (var37 != null) {
                        class713.method3942((byte) -35, var34.field6498, var37);
                    }
                    class663.method3591(16886, var34);
                }
                if (var34.field6601 == -1) {
                    class365.method2250(false, var34.field6524);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field6464 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field6261[--field6257];
                if (!var38.equals(var34.field6609)) {
                    var34.field6609 = var38;
                    class663.method3591(16886, var34);
                }
                if (var34.field6601 == -1) {
                    class385.method2312(var34.field6524, (byte) 83);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field6633 = field6262[--field6265];
                class663.method3591(16886, var34);
                if (var34.field6601 == -1) {
                    class507.method2929(var34.field6524, (byte) -127);
                }
                return;
            }
            if (arg0 == 1114) {
                field6265 -= 3;
                var34.field6621 = field6262[field6265];
                var34.field6527 = field6262[field6265 + 1];
                var34.field6472 = field6262[field6265 + 2];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field6590 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field6568 = field6262[--field6265];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field6499 = field6262[--field6265];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field6588 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field6490 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1120) {
                field6265 -= 2;
                var34.field6604 = field6262[field6265];
                var34.field6512 = field6262[field6265 + 1];
                class663.method3591(16886, var34);
                if (var34.field6483 == 0) {
                    class146.method908(false, 256, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field6632 = field6262[--field6265] == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field6573 = field6262[--field6265];
                class663.method3591(16886, var34);
                if (var34.field6601 == -1) {
                    class58.method457(true, var34.field6524);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field6262[--field6265];
                var34.field6531 = var39 == 1;
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1125) {
                field6265 -= 2;
                var34.field6513 = field6262[field6265];
                var34.field6592 = field6262[field6265 + 1];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field6579 = field6262[--field6265];
                class663.method3591(16886, var34);
                return;
            }
            if (arg0 == 1127) {
                field6265 -= 2;
                int var40 = field6262[field6265];
                int var41 = field6262[field6265 + 1];
                class49 var42 = class188.field2466.method3449(2529, var40);
                if (var42.field720 != var41) {
                    var34.method2705(120, var40, var41);
                    return;
                }
                var34.method2693(2, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field6262[--field6265];
                String var44 = field6261[--field6257];
                class49 var45 = class188.field2466.method3449(2529, var43);
                if (!var45.field715.equals(var44)) {
                    var34.method2706(var43, var44, -6231);
                    return;
                }
                var34.method2693(2, var43);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field6262[--field6265];
                if (var34.field6483 != 5 && arg0 == 1129 || var34.field6483 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field6519 != var46) {
                    var34.field6519 = var46;
                    class663.method3591(16886, var34);
                }
                if (var34.field6601 == -1) {
                    class185.method1185(124, var34.field6524);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class460 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class102.method684(5025, field6262[--field6265]);
            } else {
                var47 = arg1 ? field6266 : field6254;
            }
            class663.method3591(16886, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6265 -= 2;
                int var48 = field6262[field6265];
                int var49 = field6262[field6265 + 1];
                if (var47.field6601 == -1) {
                    class664.method3598((byte) 104, var47.field6524);
                    class58.method457(true, var47.field6524);
                    class11.method56(39, var47.field6524);
                }
                if (var48 == -1) {
                    var47.field6525 = 1;
                    var47.field6625 = -1;
                    var47.field6556 = -1;
                    return;
                }
                var47.field6556 = var48;
                var47.field6470 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field6598 = true;
                } else {
                    var47.field6598 = false;
                }
                class167 var50 = class190.field2488.method3944(256, var48);
                var47.field6561 = var50.field2181;
                var47.field6606 = var50.field2135;
                var47.field6563 = var50.field2193;
                var47.field6508 = var50.field2184;
                var47.field6469 = var50.field2183;
                var47.field6573 = var50.field2156;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field6616 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field6616 = 1;
                } else {
                    var47.field6616 = 2;
                }
                if (var47.field6613 > 0) {
                    var47.field6573 = var47.field6573 * 32 / var47.field6613;
                    return;
                }
                if (var47.field6610 > 0) {
                    var47.field6573 = var47.field6573 * 32 / var47.field6610;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field6525 = 2;
                var47.field6625 = field6262[--field6265];
                if (var47.field6601 == -1) {
                    class748.method4183(var47.field6524, 4);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field6525 = 3;
                var47.field6625 = -1;
                if (var47.field6601 == -1) {
                    class748.method4183(var47.field6524, 4);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field6525 = 6;
                var47.field6625 = field6262[--field6265];
                if (var47.field6601 == -1) {
                    class748.method4183(var47.field6524, 4);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field6525 = 5;
                var47.field6625 = field6262[--field6265];
                if (var47.field6601 == -1) {
                    class748.method4183(var47.field6524, 4);
                }
                return;
            }
            if (arg0 == 1206) {
                field6265 -= 4;
                var47.field6559 = field6262[field6265];
                var47.field6522 = field6262[field6265 + 1];
                var47.field6551 = field6262[field6265 + 2];
                var47.field6558 = field6262[field6265 + 3];
                class663.method3591(16886, var47);
                return;
            }
            if (arg0 == 1207) {
                field6265 -= 2;
                var47.field6600 = field6262[field6265];
                var47.field6629 = field6262[field6265 + 1];
                class663.method3591(16886, var47);
                return;
            }
            if (arg0 == 1210) {
                field6265 -= 4;
                var47.field6625 = field6262[field6265];
                var47.field6479 = field6262[field6265 + 1];
                if (field6262[field6265 + 2] == 1) {
                    var47.field6525 = 9;
                } else {
                    var47.field6525 = 8;
                }
                if (field6262[field6265 + 3] == 1) {
                    var47.field6598 = true;
                } else {
                    var47.field6598 = false;
                }
                if (var47.field6601 == -1) {
                    class748.method4183(var47.field6524, 4);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field6525 = 5;
                var47.field6625 = class456.field6387;
                var47.field6479 = 0;
                if (var47.field6601 == -1) {
                    class748.method4183(var47.field6524, 4);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class460 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class102.method684(5025, field6262[--field6265]);
                } else {
                    var62 = arg1 ? field6266 : field6254;
                }
                if (arg0 == 1499) {
                    var62.method2710(30713);
                    return;
                }
                String var63 = field6261[--field6257];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field6262[--field6265];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field6262[--field6265];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field6261[--field6257];
                    } else {
                        var66[var67] = Integer.valueOf(field6262[--field6265]);
                    }
                }
                int var68 = field6262[--field6265];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field6607 = var66;
                } else if (arg0 == 1401) {
                    var62.field6478 = var66;
                } else if (arg0 == 1402) {
                    var62.field6614 = var66;
                } else if (arg0 == 1403) {
                    var62.field6467 = var66;
                } else if (arg0 == 1404) {
                    var62.field6486 = var66;
                } else if (arg0 == 1405) {
                    var62.field6562 = var66;
                } else if (arg0 == 1406) {
                    var62.field6603 = var66;
                } else if (arg0 == 1407) {
                    var62.field6476 = var66;
                    var62.field6571 = var64;
                } else if (arg0 == 1408) {
                    var62.field6634 = var66;
                } else if (arg0 == 1409) {
                    var62.field6580 = var66;
                } else if (arg0 == 1410) {
                    var62.field6480 = var66;
                } else if (arg0 == 1411) {
                    var62.field6595 = var66;
                } else if (arg0 == 1412) {
                    var62.field6517 = var66;
                } else if (arg0 == 1414) {
                    var62.field6626 = var66;
                    var62.field6497 = var64;
                } else if (arg0 == 1415) {
                    var62.field6552 = var66;
                    var62.field6489 = var64;
                } else if (arg0 == 1416) {
                    var62.field6487 = var66;
                } else if (arg0 == 1417) {
                    var62.field6505 = var66;
                } else if (arg0 == 1418) {
                    var62.field6548 = var66;
                } else if (arg0 == 1419) {
                    var62.field6553 = var66;
                } else if (arg0 == 1420) {
                    var62.field6631 = var66;
                } else if (arg0 == 1421) {
                    var62.field6488 = var66;
                } else if (arg0 == 1422) {
                    var62.field6574 = var66;
                } else if (arg0 == 1423) {
                    var62.field6507 = var66;
                } else if (arg0 == 1424) {
                    var62.field6532 = var66;
                } else if (arg0 == 1425) {
                    var62.field6594 = var66;
                } else if (arg0 == 1426) {
                    var62.field6473 = var66;
                } else if (arg0 == 1427) {
                    var62.field6538 = var66;
                } else if (arg0 == 1428) {
                    var62.field6599 = var66;
                    var62.field6578 = var64;
                } else if (arg0 == 1429) {
                    var62.field6465 = var66;
                    var62.field6533 = var64;
                } else if (arg0 == 1430) {
                    var62.field6554 = var66;
                }
                var62.field6596 = true;
                return;
            }
            if (arg0 < 1600) {
                class460 var69 = arg1 ? field6266 : field6254;
                if (arg0 == 1500) {
                    field6262[field6265++] = var69.field6572;
                    return;
                }
                if (arg0 == 1501) {
                    field6262[field6265++] = var69.field6543;
                    return;
                }
                if (arg0 == 1502) {
                    field6262[field6265++] = var69.field6566;
                    return;
                }
                if (arg0 == 1503) {
                    field6262[field6265++] = var69.field6514;
                    return;
                }
                if (arg0 == 1504) {
                    field6262[field6265++] = var69.field6611 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6262[field6265++] = var69.field6528;
                    return;
                }
                if (arg0 == 1506) {
                    class460 var70 = class389.method2323(var69, 124);
                    field6262[field6265++] = var70 == null ? -1 : var70.field6524;
                    return;
                }
            } else if (arg0 < 1700) {
                class460 var71 = arg1 ? field6266 : field6254;
                if (arg0 == 1600) {
                    field6262[field6265++] = var71.field6549;
                    return;
                }
                if (arg0 == 1601) {
                    field6262[field6265++] = var71.field6466;
                    return;
                }
                if (arg0 == 1602) {
                    field6261[field6257++] = var71.field6609;
                    return;
                }
                if (arg0 == 1603) {
                    field6262[field6265++] = var71.field6604;
                    return;
                }
                if (arg0 == 1604) {
                    field6262[field6265++] = var71.field6512;
                    return;
                }
                if (arg0 == 1605) {
                    field6262[field6265++] = var71.field6573;
                    return;
                }
                if (arg0 == 1606) {
                    field6262[field6265++] = var71.field6561;
                    return;
                }
                if (arg0 == 1607) {
                    field6262[field6265++] = var71.field6563;
                    return;
                }
                if (arg0 == 1608) {
                    field6262[field6265++] = var71.field6606;
                    return;
                }
                if (arg0 == 1609) {
                    field6262[field6265++] = var71.field6494;
                    return;
                }
                if (arg0 == 1610) {
                    field6262[field6265++] = var71.field6508;
                    return;
                }
                if (arg0 == 1611) {
                    field6262[field6265++] = var71.field6469;
                    return;
                }
                if (arg0 == 1612) {
                    field6262[field6265++] = var71.field6491;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field6262[--field6265];
                    class49 var73 = class188.field2466.method3449(2529, var72);
                    if (var73.method399(16709)) {
                        field6261[field6257++] = var71.method2698(-104, var73.field715, var72);
                        return;
                    }
                    field6262[field6265++] = var71.method2703(var73.field720, var72, (byte) -119);
                    return;
                }
                if (arg0 == 1614) {
                    field6262[field6265++] = var71.field6619;
                    return;
                }
                if (arg0 == 2614) {
                    field6262[field6265++] = var71.field6525 == 1 ? var71.field6625 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class460 var74 = arg1 ? field6266 : field6254;
                if (arg0 == 1700) {
                    field6262[field6265++] = var74.field6556;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field6556 != -1) {
                        field6262[field6265++] = var74.field6470;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6262[field6265++] = var74.field6601;
                    return;
                }
            } else if (arg0 < 1900) {
                class460 var75 = arg1 ? field6266 : field6254;
                if (arg0 == 1800) {
                    field6262[field6265++] = client.method715(var75).method291(92);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field6262[--field6265];
                    int var357 = var76 - 1;
                    if (var75.field6623 != null && var357 < var75.field6623.length && var75.field6623[var357] != null) {
                        field6261[field6257++] = var75.field6623[var357];
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field6576 == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = var75.field6576;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class460 var355;
                if (arg0 >= 2000) {
                    var355 = class102.method684(5025, field6262[--field6265]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field6266 : field6254;
                }
                if (field6278 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field6538 == null) {
                        return;
                    }
                    class575 var356 = new class575();
                    var356.field8028 = var355;
                    var356.field8027 = var355.field6538;
                    var356.field8019 = field6278 + 1;
                    class278.field3517.method3110(var356, 1);
                    return;
                }
            } else if (arg0 < 2600) {
                class460 var77 = class102.method684(5025, field6262[--field6265]);
                if (arg0 == 2500) {
                    field6262[field6265++] = var77.field6572;
                    return;
                }
                if (arg0 == 2501) {
                    field6262[field6265++] = var77.field6543;
                    return;
                }
                if (arg0 == 2502) {
                    field6262[field6265++] = var77.field6566;
                    return;
                }
                if (arg0 == 2503) {
                    field6262[field6265++] = var77.field6514;
                    return;
                }
                if (arg0 == 2504) {
                    field6262[field6265++] = var77.field6611 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6262[field6265++] = var77.field6528;
                    return;
                }
                if (arg0 == 1506) {
                    class460 var78 = class389.method2323(var77, 50);
                    field6262[field6265++] = var78 == null ? -1 : var78.field6524;
                    return;
                }
            } else if (arg0 < 2700) {
                class460 var79 = class102.method684(5025, field6262[--field6265]);
                if (arg0 == 2600) {
                    field6262[field6265++] = var79.field6549;
                    return;
                }
                if (arg0 == 2601) {
                    field6262[field6265++] = var79.field6466;
                    return;
                }
                if (arg0 == 2602) {
                    field6261[field6257++] = var79.field6609;
                    return;
                }
                if (arg0 == 2603) {
                    field6262[field6265++] = var79.field6604;
                    return;
                }
                if (arg0 == 2604) {
                    field6262[field6265++] = var79.field6512;
                    return;
                }
                if (arg0 == 2605) {
                    field6262[field6265++] = var79.field6573;
                    return;
                }
                if (arg0 == 2606) {
                    field6262[field6265++] = var79.field6561;
                    return;
                }
                if (arg0 == 2607) {
                    field6262[field6265++] = var79.field6563;
                    return;
                }
                if (arg0 == 2608) {
                    field6262[field6265++] = var79.field6606;
                    return;
                }
                if (arg0 == 2609) {
                    field6262[field6265++] = var79.field6494;
                    return;
                }
                if (arg0 == 2610) {
                    field6262[field6265++] = var79.field6508;
                    return;
                }
                if (arg0 == 2611) {
                    field6262[field6265++] = var79.field6469;
                    return;
                }
                if (arg0 == 2612) {
                    field6262[field6265++] = var79.field6491;
                    return;
                }
                if (arg0 == 2613) {
                    field6262[field6265++] = var79.field6619;
                    return;
                }
                if (arg0 == 2614) {
                    field6262[field6265++] = var79.field6525 == 1 ? var79.field6625 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class460 var80 = class102.method684(5025, field6262[--field6265]);
                    field6262[field6265++] = var80.field6556;
                    return;
                }
                if (arg0 == 2701) {
                    class460 var81 = class102.method684(5025, field6262[--field6265]);
                    if (var81.field6556 != -1) {
                        field6262[field6265++] = var81.field6470;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field6262[--field6265];
                    class157 var83 = (class157) class148.field1802.method3248((long) var82, 0);
                    if (var83 != null) {
                        field6262[field6265++] = 1;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class460 var84 = class102.method684(5025, field6262[--field6265]);
                    if (var84.field6567 == null) {
                        field6262[field6265++] = 0;
                        return;
                    }
                    int var85 = var84.field6567.length;
                    for (int var86 = 0; var86 < var84.field6567.length; var86++) {
                        if (var84.field6567[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field6262[field6265++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6265 -= 2;
                    int var87 = field6262[field6265];
                    int var88 = field6262[field6265 + 1];
                    class157 var89 = (class157) class148.field1802.method3248((long) var87, 0);
                    if (var89 != null && var89.field2028 == var88) {
                        field6262[field6265++] = 1;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class460 var90 = class102.method684(5025, field6262[--field6265]);
                if (arg0 == 2800) {
                    field6262[field6265++] = client.method715(var90).method291(95);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field6262[--field6265];
                    int var358 = var91 - 1;
                    if (var90.field6623 != null && var358 < var90.field6623.length && var90.field6623[var358] != null) {
                        field6261[field6257++] = var90.field6623[var358];
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field6576 == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = var90.field6576;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field6261[--field6257];
                    class491.method2863(var92, (byte) 4);
                    return;
                }
                if (arg0 == 3101) {
                    field6265 -= 2;
                    class279.method1668(class339.field4374, field6262[field6265 + 1], field6262[field6265], 1);
                    return;
                }
                if (arg0 == 3103) {
                    class2.method3(true, 0);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field6261[--field6257];
                    int var94 = 0;
                    if (class575.method3223(var93, 32145)) {
                        var94 = class337.method1980(-27187, var93);
                    }
                    field6251++;
                    class650 var95 = class314.method1837(class703.field9920, true, class625.field8727);
                    var95.field8928.method1112(var94, -123);
                    class108.method745(var95, -58);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field6261[--field6257];
                    field6256++;
                    class650 var97 = class314.method1837(class552.field7759, true, class625.field8727);
                    var97.field8928.method1141(var96.length() + 1, -117);
                    var97.field8928.method1110(var96, -30452);
                    class108.method745(var97, -71);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field6261[--field6257];
                    field6250++;
                    class650 var99 = class314.method1837(class106.field1293, true, class625.field8727);
                    var99.field8928.method1141(var98.length() + 1, 24);
                    var99.field8928.method1110(var98, -30452);
                    class108.method745(var99, -42);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field6262[--field6265];
                    String var101 = field6261[--field6257];
                    class713.method3941((byte) 121, var101, var100);
                    return;
                }
                if (arg0 == 3108) {
                    field6265 -= 3;
                    int var102 = field6262[field6265];
                    int var103 = field6262[field6265 + 1];
                    int var104 = field6262[field6265 + 2];
                    class460 var105 = class102.method684(5025, var104);
                    class135.method847(var102, var103, var105, 0);
                    return;
                }
                if (arg0 == 3109) {
                    field6265 -= 2;
                    int var106 = field6262[field6265];
                    int var107 = field6262[field6265 + 1];
                    class460 var108 = arg1 ? field6266 : field6254;
                    class135.method847(var106, var107, var108, 0);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field6262[--field6265];
                    field6269++;
                    class650 var110 = class314.method1837(class331.field4199, true, class625.field8727);
                    var110.field8928.method1157(var109, (byte) 114);
                    class108.method745(var110, -60);
                    return;
                }
                if (arg0 == 3111) {
                    field6265 -= 2;
                    int var111 = field6262[field6265];
                    int var112 = field6262[field6265 + 1];
                    class157 var113 = (class157) class148.field1802.method3248((long) var111, 0);
                    if (var113 != null) {
                        class22.method239(var113.field2028 != var112, true, var113, 7799);
                    }
                    class702.method3895(3, true, var111, (byte) 123, var112);
                    return;
                }
                if (arg0 == 3112) {
                    field6265--;
                    int var114 = field6262[field6265];
                    class157 var115 = (class157) class148.field1802.method3248((long) var114, 0);
                    if (var115 != null && var115.field2027 == 3) {
                        class22.method239(true, true, var115, 7799);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class250.method1524(24, field6261[--field6257]);
                    return;
                }
                if (arg0 == 3114) {
                    field6265 -= 2;
                    int var116 = field6262[field6265];
                    int var117 = field6262[field6265 + 1];
                    String var118 = field6261[--field6257];
                    class673.method3627((byte) -126, "", "", var116, "", var117, var118);
                    return;
                }
                if (arg0 == 3115) {
                    field6265 -= 11;
                    class761[] var119 = class412.method2441(-39);
                    class407[] var120 = class237.method1481(118);
                    class170.method1065(field6262[field6265 + 5], field6262[field6265 + 6], field6262[field6265 + 8], field6262[field6265 + 7], field6262[field6265 + 10], field6262[field6265 + 4], field6262[field6265 + 9], field6262[field6265 + 3], (byte) 47, field6262[field6265 + 2], var120[field6262[field6265 + 1]], var119[field6262[field6265]]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6265 -= 3;
                    class140.method869(255, field6262[field6265], 256, field6262[field6265 + 1], (byte) 42, field6262[field6265 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class323.method1909(255, (byte) -25, 50, field6262[--field6265]);
                    return;
                }
                if (arg0 == 3202) {
                    field6265 -= 2;
                    class395.method2354(field6262[field6265], 255, 0, field6262[field6265 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field6265 -= 4;
                    class140.method869(field6262[field6265 + 3], field6262[field6265], 256, field6262[field6265 + 1], (byte) 42, field6262[field6265 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field6265 -= 3;
                    class323.method1909(field6262[field6265 + 1], (byte) -25, field6262[field6265 + 2], field6262[field6265]);
                    return;
                }
                if (arg0 == 3205) {
                    field6265 -= 3;
                    class395.method2354(field6262[field6265], field6262[field6265 + 2], 0, field6262[field6265 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field6265 -= 4;
                    class487.method2846(field6262[field6265 + 2], field6262[field6265 + 3], (byte) 59, field6262[field6265], 256, false, field6262[field6265 + 1]);
                    return;
                }
                if (arg0 == 3207) {
                    field6265 -= 4;
                    class487.method2846(field6262[field6265 + 2], field6262[field6265 + 3], (byte) -63, field6262[field6265], 256, true, field6262[field6265 + 1]);
                    return;
                }
                if (arg0 == 3208) {
                    field6265 -= 5;
                    class140.method869(field6262[field6265 + 3], field6262[field6265], field6262[field6265 + 4], field6262[field6265 + 1], (byte) 42, field6262[field6265 + 2]);
                    return;
                }
                if (arg0 == 3209) {
                    field6265 -= 5;
                    class487.method2846(field6262[field6265 + 2], field6262[field6265 + 3], (byte) -35, field6262[field6265], field6262[field6265 + 4], false, field6262[field6265 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6262[field6265++] = class266.field3368;
                    return;
                }
                if (arg0 == 3301) {
                    field6265 -= 2;
                    int var121 = field6262[field6265];
                    int var122 = field6262[field6265 + 1];
                    field6262[field6265++] = class467.method2758(var121, -1, var122, false);
                    return;
                }
                if (arg0 == 3302) {
                    field6265 -= 2;
                    int var123 = field6262[field6265];
                    int var124 = field6262[field6265 + 1];
                    field6262[field6265++] = class405.method2403(false, (byte) 113, var123, var124);
                    return;
                }
                if (arg0 == 3303) {
                    field6265 -= 2;
                    int var125 = field6262[field6265];
                    int var126 = field6262[field6265 + 1];
                    field6262[field6265++] = class701.method3880(var126, var125, (byte) -102, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field6262[--field6265];
                    field6262[field6265++] = class492.field6975.method3134(5, var127).field7931;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field6262[--field6265];
                    field6262[field6265++] = class615.field8612[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field6262[--field6265];
                    field6262[field6265++] = class524.field7405[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field6262[--field6265];
                    field6262[field6265++] = class121.field1453[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class339.field4374.field5779;
                    int var132 = (class339.field4374.field5790 >> 9) + class63.field851;
                    int var133 = (class339.field4374.field5784 >> 9) + class753.field10509;
                    field6262[field6265++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field6262[--field6265];
                    field6262[field6265++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field6262[--field6265];
                    field6262[field6265++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field6262[--field6265];
                    field6262[field6265++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6262[field6265++] = class680.field9235 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6265 -= 2;
                    int var137 = field6262[field6265];
                    int var138 = field6262[field6265 + 1];
                    field6262[field6265++] = class467.method2758(var137, -1, var138, true);
                    return;
                }
                if (arg0 == 3314) {
                    field6265 -= 2;
                    int var139 = field6262[field6265];
                    int var140 = field6262[field6265 + 1];
                    field6262[field6265++] = class405.method2403(true, (byte) -113, var139, var140);
                    return;
                }
                if (arg0 == 3315) {
                    field6265 -= 2;
                    int var141 = field6262[field6265];
                    int var142 = field6262[field6265 + 1];
                    field6262[field6265++] = class701.method3880(var142, var141, (byte) -43, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class408.field5753 >= 2) {
                        field6262[field6265++] = class408.field5753;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6262[field6265++] = class471.field6763;
                    return;
                }
                if (arg0 == 3318) {
                    field6262[field6265++] = class575.field8035.field2454;
                    return;
                }
                if (arg0 == 3321) {
                    field6262[field6265++] = class517.field7279;
                    return;
                }
                if (arg0 == 3322) {
                    field6262[field6265++] = class145.field1725;
                    return;
                }
                if (arg0 == 3323) {
                    if (class637.field8816 >= 5 && class637.field8816 <= 9) {
                        field6262[field6265++] = 1;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class637.field8816 >= 5 && class637.field8816 <= 9) {
                        field6262[field6265++] = class637.field8816;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6262[field6265++] = class737.field10330 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6262[field6265++] = class339.field4374.field7702;
                    return;
                }
                if (arg0 == 3327) {
                    field6262[field6265++] = class339.field4374.field7665 != null && class339.field4374.field7665.field4151 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6262[field6265++] = class525.field7422 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field6262[--field6265];
                    field6262[field6265++] = class322.method1900(0, var143, false);
                    return;
                }
                if (arg0 == 3331) {
                    field6265 -= 2;
                    int var144 = field6262[field6265];
                    int var145 = field6262[field6265 + 1];
                    field6262[field6265++] = class563.method3180(10699, false, var144, false, var145);
                    return;
                }
                if (arg0 == 3332) {
                    field6265 -= 2;
                    int var146 = field6262[field6265];
                    int var147 = field6262[field6265 + 1];
                    field6262[field6265++] = class563.method3180(10699, true, var146, false, var147);
                    return;
                }
                if (arg0 == 3333) {
                    field6262[field6265++] = class643.field8880;
                    return;
                }
                if (arg0 == 3335) {
                    field6262[field6265++] = class416.field5920;
                    return;
                }
                if (arg0 == 3336) {
                    field6265 -= 4;
                    int var148 = field6262[field6265];
                    int var149 = field6262[field6265 + 1];
                    int var150 = field6262[field6265 + 2];
                    int var151 = field6262[field6265 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field6262[field6265++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field6262[field6265++] = class718.field10135;
                    return;
                }
                if (arg0 == 3338) {
                    field6262[field6265++] = class383.method2306(-7304);
                    return;
                }
                if (arg0 == 3339) {
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field6262[field6265++] = class758.field10550 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field6262[field6265++] = class546.field7682 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field6262[field6265++] = class402.field5566.method2337(-110);
                    return;
                }
                if (arg0 == 3343) {
                    field6262[field6265++] = class402.field5566.method2336((byte) 112);
                    return;
                }
                if (arg0 == 3344) {
                    field6261[field6257++] = class44.method367((byte) 7);
                    return;
                }
                if (arg0 == 3345) {
                    field6261[field6257++] = class165.method1024(false);
                    return;
                }
                if (arg0 == 3346) {
                    field6262[field6265++] = class710.method3923(-100);
                    return;
                }
                if (arg0 == 3347) {
                    field6262[field6265++] = class659.field9051;
                    return;
                }
                if (arg0 == 3349) {
                    field6262[field6265++] = class339.field4374.field336.method2948(25160) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6265 -= 2;
                    int var155 = field6262[field6265];
                    int var156 = field6262[field6265 + 1];
                    class258 var157 = class186.field2453.method726(var155, -4);
                    field6261[field6257++] = var157.method1572((byte) -55, var156);
                    return;
                }
                if (arg0 == 3408) {
                    field6265 -= 4;
                    int var158 = field6262[field6265];
                    int var159 = field6262[field6265 + 1];
                    int var160 = field6262[field6265 + 2];
                    int var161 = field6262[field6265 + 3];
                    class258 var162 = class186.field2453.method726(var160, -4);
                    if (var162.field3282 == var158 && var162.field3283 == var159) {
                        if (var159 == 115) {
                            field6261[field6257++] = var162.method1572((byte) -72, var161);
                            return;
                        }
                        field6262[field6265++] = var162.method1568(var161, 117);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field6265 -= 3;
                    int var163 = field6262[field6265];
                    int var164 = field6262[field6265 + 1];
                    int var165 = field6262[field6265 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class258 var166 = class186.field2453.method726(var164, -4);
                    if (var166.field3283 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6262[field6265++] = var166.method1575(var165, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field6262[--field6265];
                    String var168 = field6261[--field6257];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class258 var169 = class186.field2453.method726(var167, -4);
                    if (var169.field3283 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6262[field6265++] = var169.method1569(false, var168) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field6262[--field6265];
                    class258 var171 = class186.field2453.method726(var170, -4);
                    field6262[field6265++] = var171.field3285.method3244((byte) 127);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class17.field235 == 0) {
                        field6262[field6265++] = -2;
                        return;
                    }
                    if (class17.field235 == 1) {
                        field6262[field6265++] = -1;
                        return;
                    }
                    field6262[field6265++] = class727.field10184;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field6262[--field6265];
                    if (class17.field235 == 2 && var172 < class727.field10184) {
                        field6261[field6257++] = class4.field34[var172];
                        if (class17.field238[var172] != null) {
                            field6261[field6257++] = class17.field238[var172];
                            return;
                        }
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = "";
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field6262[--field6265];
                    if (class17.field235 == 2 && var173 < class727.field10184) {
                        field6262[field6265++] = class323.field4122[var173];
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field6262[--field6265];
                    if (class17.field235 == 2 && var174 < class727.field10184) {
                        field6262[field6265++] = class292.field3779[var174];
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field6261[--field6257];
                    int var176 = field6262[--field6265];
                    class242.method1505(var175, var176, -88);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field6261[--field6257];
                    class689.method3852(var177, (byte) -125);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field6261[--field6257];
                    class162.method1001(var178, (byte) 89);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field6261[--field6257];
                    class508.method2934(var179, false, 4);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field6261[--field6257];
                    class426.method2531(17073, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field6261[--field6257];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field6262[field6265++] = class398.method2363(var181, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field6262[--field6265];
                    if (class17.field235 == 2 && var182 < class727.field10184) {
                        field6261[field6257++] = class536.field7518[var182];
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class110.field1357 != null) {
                        field6261[field6257++] = class376.method2284((byte) -10, class110.field1357);
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class110.field1357 != null) {
                        field6262[field6265++] = class492.field6976;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field6262[--field6265];
                    if (class110.field1357 != null && var183 < class492.field6976) {
                        field6261[field6257++] = class760.field10595[var183].field1496;
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field6262[--field6265];
                    if (class110.field1357 != null && var184 < class492.field6976) {
                        field6262[field6265++] = class760.field10595[var184].field1503;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field6262[--field6265];
                    if (class110.field1357 != null && var185 < class492.field6976) {
                        field6262[field6265++] = class760.field10595[var185].field1504;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6262[field6265++] = class34.field525;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field6261[--field6257];
                    class502.method2897(var186, 0);
                    return;
                }
                if (arg0 == 3618) {
                    field6262[field6265++] = class274.field3471;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field6261[--field6257];
                    class269.method1612(var187, (byte) -52);
                    return;
                }
                if (arg0 == 3620) {
                    class177.method1083(true);
                    return;
                }
                if (arg0 == 3621) {
                    if (class17.field235 == 0) {
                        field6262[field6265++] = -1;
                        return;
                    }
                    field6262[field6265++] = class497.field7034;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field6262[--field6265];
                    if (class17.field235 != 0 && var188 < class497.field7034) {
                        field6261[field6257++] = class736.field10317[var188];
                        if (class415.field5866[var188] != null) {
                            field6261[field6257++] = class415.field5866[var188];
                            return;
                        }
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = "";
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field6261[--field6257];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field6262[field6265++] = class696.method3870(-114, var189) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field6262[--field6265];
                    if (class760.field10595 != null && var190 < class492.field6976 && class760.field10595[var190].field1500.equalsIgnoreCase(class339.field4374.field7690)) {
                        field6262[field6265++] = 1;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class414.field5841 != null) {
                        field6261[field6257++] = class414.field5841;
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field6262[--field6265];
                    if (class110.field1357 != null && var191 < class492.field6976) {
                        field6261[field6257++] = class760.field10595[var191].field1505;
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field6262[--field6265];
                    if (class17.field235 == 2 && var192 >= 0 && var192 < class727.field10184) {
                        field6262[field6265++] = class315.field4044[var192] ? 1 : 0;
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field6261[--field6257];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field6262[field6265++] = class10.method47(-11482, var193);
                    return;
                }
                if (arg0 == 3629) {
                    field6262[field6265++] = class486.field6908;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field6261[--field6257];
                    class508.method2934(var194, true, 4);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field6262[--field6265];
                    field6262[field6265++] = class425.field6051[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field6262[--field6265];
                    if (class110.field1357 != null && var196 < class492.field6976) {
                        field6261[field6257++] = class760.field10595[var196].field1500;
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field6262[--field6265];
                    if (class17.field235 != 0 && var197 < class497.field7034) {
                        field6261[field6257++] = class223.field2934[var197];
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field6262[--field6265];
                    field6262[field6265++] = class584.field8107[var198].method2442(1);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field6262[--field6265];
                    field6262[field6265++] = class584.field8107[var199].field5824;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field6262[--field6265];
                    field6262[field6265++] = class584.field8107[var200].field5825;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field6262[--field6265];
                    field6262[field6265++] = class584.field8107[var201].field5826;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field6262[--field6265];
                    field6262[field6265++] = class584.field8107[var202].field5817;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field6262[--field6265];
                    field6262[field6265++] = class584.field8107[var203].field5822;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field6262[--field6265];
                    int var205 = class584.field8107[var204].method2445(false);
                    field6262[field6265++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field6262[--field6265];
                    int var207 = class584.field8107[var206].method2445(false);
                    field6262[field6265++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field6262[--field6265];
                    int var209 = class584.field8107[var208].method2445(false);
                    field6262[field6265++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field6262[--field6265];
                    int var211 = class584.field8107[var210].method2445(false);
                    field6262[field6265++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6265 -= 2;
                    int var212 = field6262[field6265];
                    int var213 = field6262[field6265 + 1];
                    field6262[field6265++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field6265 -= 2;
                    int var214 = field6262[field6265];
                    int var215 = field6262[field6265 + 1];
                    field6262[field6265++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field6265 -= 2;
                    int var216 = field6262[field6265];
                    int var217 = field6262[field6265 + 1];
                    field6262[field6265++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field6265 -= 2;
                    int var218 = field6262[field6265];
                    int var219 = field6262[field6265 + 1];
                    field6262[field6265++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field6262[--field6265];
                    field6262[field6265++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field6262[--field6265];
                    field6262[field6265++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6265 -= 5;
                    int var222 = field6262[field6265];
                    int var223 = field6262[field6265 + 1];
                    int var224 = field6262[field6265 + 2];
                    int var225 = field6262[field6265 + 3];
                    int var226 = field6262[field6265 + 4];
                    field6262[field6265++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field6265 -= 2;
                    long var227 = (long) field6262[field6265];
                    long var229 = (long) field6262[field6265 + 1];
                    field6262[field6265++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field6265 -= 2;
                    int var231 = field6262[field6265];
                    int var232 = field6262[field6265 + 1];
                    field6262[field6265++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field6265 -= 2;
                    int var233 = field6262[field6265];
                    int var234 = field6262[field6265 + 1];
                    field6262[field6265++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6265 -= 2;
                    int var235 = field6262[field6265];
                    int var236 = field6262[field6265 + 1];
                    field6262[field6265++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6265 -= 2;
                    int var237 = field6262[field6265];
                    int var238 = field6262[field6265 + 1];
                    field6262[field6265++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field6265 -= 2;
                    int var239 = field6262[field6265];
                    int var240 = field6262[field6265 + 1];
                    if (var239 == 0) {
                        field6262[field6265++] = 0;
                        return;
                    }
                    field6262[field6265++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field6265 -= 2;
                    int var241 = field6262[field6265];
                    int var242 = field6262[field6265 + 1];
                    if (var241 == 0) {
                        field6262[field6265++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field6262[field6265++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6262[field6265++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field6265 -= 2;
                    int var243 = field6262[field6265];
                    int var244 = field6262[field6265 + 1];
                    field6262[field6265++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field6265 -= 2;
                    int var245 = field6262[field6265];
                    int var246 = field6262[field6265 + 1];
                    field6262[field6265++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field6265 -= 2;
                    int var247 = field6262[field6265];
                    int var248 = field6262[field6265 + 1];
                    field6262[field6265++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field6265 -= 2;
                    int var249 = field6262[field6265];
                    int var250 = field6262[field6265 + 1];
                    field6262[field6265++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field6265 -= 3;
                    long var251 = (long) field6262[field6265];
                    long var253 = (long) field6262[field6265 + 1];
                    long var255 = (long) field6262[field6265 + 2];
                    field6262[field6265++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field6265 -= 2;
                    int var257 = field6262[field6265];
                    int var258 = field6262[field6265 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field6262[field6265++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field6262[field6265++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field6261[--field6257];
                    int var262 = field6262[--field6265];
                    field6261[field6257++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field6257 -= 2;
                    String var263 = field6261[field6257];
                    String var264 = field6261[field6257 + 1];
                    field6261[field6257++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field6261[--field6257];
                    int var266 = field6262[--field6265];
                    field6261[field6257++] = var265 + class73.method538(var266, true, (byte) 14);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field6261[--field6257];
                    field6261[field6257++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6261[field6257++] = method2634(field6262[--field6265]);
                    return;
                }
                if (arg0 == 4105) {
                    field6257 -= 2;
                    String var268 = field6261[field6257];
                    String var269 = field6261[field6257 + 1];
                    if (class339.field4374.field7665 != null && class339.field4374.field7665.field4151) {
                        field6261[field6257++] = var269;
                        return;
                    }
                    field6261[field6257++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field6262[--field6265];
                    field6261[field6257++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field6257 -= 2;
                    field6262[field6265++] = class327.method1936((byte) -53, field6261[field6257 + 1], class416.field5920, field6261[field6257]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field6261[--field6257];
                    field6265 -= 2;
                    int var272 = field6262[field6265];
                    int var273 = field6262[field6265 + 1];
                    class56 var274 = class84.method595(-24181, var273, class378.field5293, 0);
                    field6262[field6265++] = var274.method449(var272, var271, 97, class328.field4189);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field6261[--field6257];
                    field6265 -= 2;
                    int var276 = field6262[field6265];
                    int var277 = field6262[field6265 + 1];
                    class56 var278 = class84.method595(-24181, var277, class378.field5293, 0);
                    field6262[field6265++] = var278.method447(class328.field4189, (byte) 40, var276, var275);
                    return;
                }
                if (arg0 == 4110) {
                    field6257 -= 2;
                    String var279 = field6261[field6257];
                    String var280 = field6261[field6257 + 1];
                    if (field6262[--field6265] == 1) {
                        field6261[field6257++] = var279;
                        return;
                    }
                    field6261[field6257++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field6261[--field6257];
                    field6261[field6257++] = class7.method32(28497, var281);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field6261[--field6257];
                    int var283 = field6262[--field6265];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6261[field6257++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field6262[--field6265];
                    field6262[field6265++] = method2630((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field6262[--field6265];
                    field6262[field6265++] = class3.method13((char) var285, 248) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field6262[--field6265];
                    field6262[field6265++] = class457.method2679((char) var286, 69) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field6262[--field6265];
                    field6262[field6265++] = class66.method499((char) var287, -112) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field6261[--field6257];
                    if (var288 != null) {
                        field6262[field6265++] = var288.length();
                        return;
                    }
                    field6262[field6265++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field6261[--field6257];
                    field6265 -= 2;
                    int var290 = field6262[field6265];
                    int var291 = field6262[field6265 + 1];
                    field6261[field6257++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field6261[--field6257];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field6261[field6257++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field6261[--field6257];
                    field6265 -= 2;
                    int var298 = field6262[field6265];
                    int var299 = field6262[field6265 + 1];
                    field6262[field6265++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field6257 -= 2;
                    String var300 = field6261[field6257];
                    String var301 = field6261[field6257 + 1];
                    int var302 = field6262[--field6265];
                    field6262[field6265++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field6262[--field6265];
                    field6262[field6265++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field6262[--field6265];
                    field6262[field6265++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field6262[--field6265] != 0;
                    int var306 = field6262[--field6265];
                    field6261[field6257++] = class310.method1812(0, (byte) -101, class416.field5920, var305, (long) var306);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field6261[--field6257];
                    int var308 = field6262[--field6265];
                    class56 var309 = class84.method595(-24181, var308, class378.field5293, 0);
                    field6262[field6265++] = var309.method445((byte) 92, class328.field4189, var307);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field6262[--field6265];
                    field6261[field6257++] = class190.field2488.method3944(256, var310).field2149;
                    return;
                }
                if (arg0 == 4201) {
                    field6265 -= 2;
                    int var311 = field6262[field6265];
                    int var312 = field6262[field6265 + 1];
                    class167 var313 = class190.field2488.method3944(256, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field2197[var312 - 1] != null) {
                        field6261[field6257++] = var313.field2197[var312 - 1];
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6265 -= 2;
                    int var314 = field6262[field6265];
                    int var315 = field6262[field6265 + 1];
                    class167 var316 = class190.field2488.method3944(256, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field2187[var315 - 1] != null) {
                        field6261[field6257++] = var316.field2187[var315 - 1];
                        return;
                    }
                    field6261[field6257++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field6262[--field6265];
                    field6262[field6265++] = class190.field2488.method3944(256, var317).field2186;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field6262[--field6265];
                    field6262[field6265++] = class190.field2488.method3944(256, var318).field2169 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field6262[--field6265];
                    class167 var320 = class190.field2488.method3944(256, var319);
                    if (var320.field2190 == -1 && var320.field2211 >= 0) {
                        field6262[field6265++] = var320.field2211;
                        return;
                    }
                    field6262[field6265++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field6262[--field6265];
                    class167 var322 = class190.field2488.method3944(256, var321);
                    if (var322.field2190 >= 0 && var322.field2211 >= 0) {
                        field6262[field6265++] = var322.field2211;
                        return;
                    }
                    field6262[field6265++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field6262[--field6265];
                    field6262[field6265++] = class190.field2488.method3944(256, var323).field2175 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6265 -= 2;
                    int var324 = field6262[field6265];
                    int var325 = field6262[field6265 + 1];
                    class49 var326 = class188.field2466.method3449(2529, var325);
                    if (var326.method399(16709)) {
                        field6261[field6257++] = class190.field2488.method3944(256, var324).method1047(false, var326.field715, var325);
                        return;
                    }
                    field6262[field6265++] = class190.field2488.method3944(256, var324).method1048(false, var325, var326.field720);
                    return;
                }
                if (arg0 == 4209) {
                    field6265 -= 2;
                    int var327 = field6262[field6265];
                    int var328 = field6262[field6265 + 1] - 1;
                    class167 var329 = class190.field2488.method3944(256, var327);
                    if (var329.field2131 == var328) {
                        field6262[field6265++] = var329.field2201;
                        return;
                    }
                    if (var329.field2178 == var328) {
                        field6262[field6265++] = var329.field2145;
                        return;
                    }
                    field6262[field6265++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field6261[--field6257];
                    int var331 = field6262[--field6265];
                    class243.method1508(var330, var331 == 1, (byte) 10);
                    field6262[field6265++] = class721.field10154;
                    return;
                }
                if (arg0 == 4211) {
                    if (class114.field1405 != null && class627.field8739 < class721.field10154) {
                        field6262[field6265++] = class114.field1405[class627.field8739++] & 0xFFFF;
                        return;
                    }
                    field6262[field6265++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class627.field8739 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field6262[--field6265];
                    field6262[field6265++] = class190.field2488.method3944(256, var332).field2166;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field6261[--field6257];
                    field6265 -= 3;
                    int var334 = field6262[field6265];
                    int var335 = field6262[field6265 + 1];
                    int var336 = field6262[field6265 + 2];
                    class636.method3452(var334 == 1, var333, var335, var336, 24296);
                    field6262[field6265++] = class721.field10154;
                    return;
                }
                if (arg0 == 4215) {
                    field6257 -= 2;
                    field6265 -= 2;
                    String var337 = field6261[field6257];
                    int var338 = field6262[field6265];
                    int var339 = field6262[field6265 + 1];
                    String var340 = field6261[field6257 + 1];
                    class384.method2309(var340, var337, var339, 6, var338 == 1);
                    field6262[field6265++] = class721.field10154;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6265 -= 2;
                    int var341 = field6262[field6265];
                    int var342 = field6262[field6265 + 1];
                    class49 var343 = class188.field2466.method3449(2529, var342);
                    if (var343.method399(16709)) {
                        field6261[field6257++] = class598.field8304.method1452(var341, 64).method972(9897, var342, var343.field715);
                        return;
                    }
                    field6262[field6265++] = class598.field8304.method1452(var341, 64).method973(-89, var342, var343.field720);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6265 -= 2;
                    int var344 = field6262[field6265];
                    int var345 = field6262[field6265 + 1];
                    class49 var346 = class188.field2466.method3449(2529, var345);
                    if (var346.method399(16709)) {
                        field6261[field6257++] = class358.field5112.method890(var344, false).method1736(var345, var346.field715, -1);
                        return;
                    }
                    field6262[field6265++] = class358.field5112.method890(var344, false).method1742(var346.field720, 124, var345);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6265 -= 2;
                    int var347 = field6262[field6265];
                    int var348 = field6262[field6265 + 1];
                    class49 var349 = class188.field2466.method3449(2529, var348);
                    if (var349.method399(16709)) {
                        field6261[field6257++] = class580.field8064.method1033(var347, 26).method491(var348, (byte) 121, var349.field715);
                        return;
                    }
                    field6262[field6265++] = class580.field8064.method1033(var347, 26).method495(13522, var348, var349.field720);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field6262[--field6265];
                class459 var351 = class190.field2501.method2848(122, var350);
                if (var351.field6428 != null && var351.field6428.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field6452[0];
                    for (int var354 = 1; var354 < var351.field6428.length; var354++) {
                        if (var351.field6452[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field6452[var354];
                        }
                    }
                    field6262[field6265++] = var351.field6428[var352];
                    return;
                }
                field6262[field6265++] = var351.field6433;
                return;
            }
        } else {
            class460 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class102.method684(5025, field6262[--field6265]);
            } else {
                var51 = arg1 ? field6266 : field6254;
            }
            if (arg0 == 1300) {
                int var52 = field6262[--field6265] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method2699(field6261[--field6257], var52, -72);
                    return;
                }
                field6257--;
                return;
            }
            if (arg0 == 1301) {
                field6265 -= 2;
                int var53 = field6262[field6265];
                int var54 = field6262[field6265 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field6493 = null;
                    return;
                }
                var51.field6493 = class611.method3340(var54, var53, -128);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field6262[--field6265];
                if (class597.field8283 != var55 && class492.field6970 != var55 && class260.field3299 != var55) {
                    return;
                }
                var51.field6526 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field6586 = field6262[--field6265];
                return;
            }
            if (arg0 == 1304) {
                var51.field6583 = field6262[--field6265];
                return;
            }
            if (arg0 == 1305) {
                var51.field6576 = field6261[--field6257];
                return;
            }
            if (arg0 == 1306) {
                var51.field6542 = field6261[--field6257];
                return;
            }
            if (arg0 == 1307) {
                var51.field6623 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field6501 = field6262[--field6265];
                var51.field6615 = field6262[--field6265];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field6262[--field6265];
                int var57 = field6262[--field6265];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method2708(0, var56, var57 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field6560 = field6261[--field6257];
                return;
            }
            if (arg0 == 1311) {
                var51.field6530 = field6262[--field6265];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field6265 -= 3;
                    var58 = field6262[field6265] - 1;
                    var59 = field6262[field6265 + 1];
                    var60 = field6262[field6265 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6265 -= 2;
                    var58 = 10;
                    var59 = field6262[field6265];
                    var60 = field6262[field6265 + 1];
                }
                if (var51.field6471 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field6471 = new byte[11];
                    var51.field6555 = new byte[11];
                    var51.field6529 = new int[11];
                }
                var51.field6471[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field6485 = false;
                    for (int var61 = 0; var61 < var51.field6471.length; var61++) {
                        if (var51.field6471[var61] != 0) {
                            var51.field6485 = true;
                            break;
                        }
                    }
                } else {
                    var51.field6485 = true;
                }
                var51.field6555[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field6627 = field6262[--field6265];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "()V", line = 4299)
    public static void method2624() {
        field6258 = null;
        field6272 = null;
        field6273 = null;
        field6259 = null;
        field6262 = null;
        field6261 = null;
        field6252 = null;
        field6254 = null;
        field6266 = null;
        field6255 = null;
        field6260 = null;
        field6277 = null;
        field6275 = null;
        field6276 = null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lwba;)V", line = 4325)
    public static final void method2625(class575 arg0) {
        method2633(arg0, 200000);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 4335)
    private static final void method2626(int arg0) {
        class460 var1 = class102.method684(5025, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class460[] var3 = class238.field3072[var2];
        if (var3 == null) {
            class460[] var4 = class323.field4125[var2];
            int var5 = var4.length;
            var3 = class238.field3072[var2] = new class460[var5];
            class617.method3390(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class617.method3390(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "()V", line = 4377)
    public static final void method2627() {
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V", line = 4385)
    public static final void method2628(int arg0) {
        if (arg0 == -1 || !class666.method3606(-128, arg0)) {
            return;
        }
        class460[] var1 = class323.field4125[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class460 var3 = var1[var2];
            if (var3.field6605 != null) {
                class575 var4 = new class575();
                var4.field8028 = var3;
                var4.field8027 = var3.field6605;
                method2633(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4416)
    private static final void method2629(String arg0, int arg1) {
        if (class408.field5753 == 0 && !(!class58.field824 || class332.field4245) || class525.field7422) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class586.field8172.method3261(0, (byte) 82))) {
            var3 = 0;
            arg0 = arg0.substring(class586.field8172.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8173.method3261(0, (byte) 82))) {
            var3 = 1;
            arg0 = arg0.substring(class586.field8173.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8174.method3261(0, (byte) 82))) {
            var3 = 2;
            arg0 = arg0.substring(class586.field8174.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8175.method3261(0, (byte) 82))) {
            var3 = 3;
            arg0 = arg0.substring(class586.field8175.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8176.method3261(0, (byte) 82))) {
            var3 = 4;
            arg0 = arg0.substring(class586.field8176.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8177.method3261(0, (byte) 82))) {
            var3 = 5;
            arg0 = arg0.substring(class586.field8177.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8178.method3261(0, (byte) 82))) {
            var3 = 6;
            arg0 = arg0.substring(class586.field8178.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8179.method3261(0, (byte) 82))) {
            var3 = 7;
            arg0 = arg0.substring(class586.field8179.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8180.method3261(0, (byte) 82))) {
            var3 = 8;
            arg0 = arg0.substring(class586.field8180.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8181.method3261(0, (byte) 82))) {
            var3 = 9;
            arg0 = arg0.substring(class586.field8181.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8182.method3261(0, (byte) 82))) {
            var3 = 10;
            arg0 = arg0.substring(class586.field8182.method3261(0, (byte) 82).length());
        } else if (var2.startsWith(class586.field8183.method3261(0, (byte) 82))) {
            var3 = 11;
            arg0 = arg0.substring(class586.field8183.method3261(0, (byte) 82).length());
        } else if (class416.field5920 != 0) {
            if (var2.startsWith(class586.field8172.method3261(class416.field5920, (byte) 82))) {
                var3 = 0;
                arg0 = arg0.substring(class586.field8172.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8173.method3261(class416.field5920, (byte) 82))) {
                var3 = 1;
                arg0 = arg0.substring(class586.field8173.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8174.method3261(class416.field5920, (byte) 82))) {
                var3 = 2;
                arg0 = arg0.substring(class586.field8174.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8175.method3261(class416.field5920, (byte) 82))) {
                var3 = 3;
                arg0 = arg0.substring(class586.field8175.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8176.method3261(class416.field5920, (byte) 82))) {
                var3 = 4;
                arg0 = arg0.substring(class586.field8176.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8177.method3261(class416.field5920, (byte) 82))) {
                var3 = 5;
                arg0 = arg0.substring(class586.field8177.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8178.method3261(class416.field5920, (byte) 82))) {
                var3 = 6;
                arg0 = arg0.substring(class586.field8178.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8179.method3261(class416.field5920, (byte) 82))) {
                var3 = 7;
                arg0 = arg0.substring(class586.field8179.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8180.method3261(class416.field5920, (byte) 82))) {
                var3 = 8;
                arg0 = arg0.substring(class586.field8180.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8181.method3261(class416.field5920, (byte) 82))) {
                var3 = 9;
                arg0 = arg0.substring(class586.field8181.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8182.method3261(class416.field5920, (byte) 82))) {
                var3 = 10;
                arg0 = arg0.substring(class586.field8182.method3261(class416.field5920, (byte) 82).length());
            } else if (var2.startsWith(class586.field8183.method3261(class416.field5920, (byte) 82))) {
                var3 = 11;
                arg0 = arg0.substring(class586.field8183.method3261(class416.field5920, (byte) 82).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class586.field8184.method3261(0, (byte) 82))) {
            var5 = 1;
            arg0 = arg0.substring(class586.field8184.method3261(0, (byte) 82).length());
        } else if (var4.startsWith(class586.field8185.method3261(0, (byte) 82))) {
            var5 = 2;
            arg0 = arg0.substring(class586.field8185.method3261(0, (byte) 82).length());
        } else if (var4.startsWith(class586.field8186.method3261(0, (byte) 82))) {
            var5 = 3;
            arg0 = arg0.substring(class586.field8186.method3261(0, (byte) 82).length());
        } else if (var4.startsWith(class586.field8187.method3261(0, (byte) 82))) {
            var5 = 4;
            arg0 = arg0.substring(class586.field8187.method3261(0, (byte) 82).length());
        } else if (var4.startsWith(class586.field8188.method3261(0, (byte) 82))) {
            var5 = 5;
            arg0 = arg0.substring(class586.field8188.method3261(0, (byte) 82).length());
        } else if (class416.field5920 != 0) {
            if (var4.startsWith(class586.field8184.method3261(class416.field5920, (byte) 82))) {
                var5 = 1;
                arg0 = arg0.substring(class586.field8184.method3261(class416.field5920, (byte) 82).length());
            } else if (var4.startsWith(class586.field8185.method3261(class416.field5920, (byte) 82))) {
                var5 = 2;
                arg0 = arg0.substring(class586.field8185.method3261(class416.field5920, (byte) 82).length());
            } else if (var4.startsWith(class586.field8186.method3261(class416.field5920, (byte) 82))) {
                var5 = 3;
                arg0 = arg0.substring(class586.field8186.method3261(class416.field5920, (byte) 82).length());
            } else if (var4.startsWith(class586.field8187.method3261(class416.field5920, (byte) 82))) {
                var5 = 4;
                arg0 = arg0.substring(class586.field8187.method3261(class416.field5920, (byte) 82).length());
            } else if (var4.startsWith(class586.field8188.method3261(class416.field5920, (byte) 82))) {
                var5 = 5;
                arg0 = arg0.substring(class586.field8188.method3261(class416.field5920, (byte) 82).length());
            }
        }
        field6267++;
        class650 var6 = class314.method1837(class469.field6744, true, class625.field8727);
        var6.field8928.method1141(0, 55);
        int var7 = var6.field8928.field2354;
        var6.field8928.method1141(var3, 88);
        var6.field8928.method1141(var5, -51);
        class665.method3600(arg0, var6.field8928, 0);
        var6.field8928.method1126(-1, var6.field8928.field2354 - var7);
        class108.method745(var6, -32);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(C)I", line = 4686)
    private static final int method2630(char arg0) {
        return class689.method3854(arg0, true) ? 1 : 0;
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(IZ)V", line = 4693)
    private static final void method2631(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6262[field6265++] = class463.field6710;
                return;
            }
            if (arg0 == 5001) {
                field6265 -= 3;
                class463.field6710 = field6262[field6265];
                class131.field1568 = class750.method4189((byte) -61, field6262[field6265 + 1]);
                if (class131.field1568 == null) {
                    class131.field1568 = class63.field860;
                }
                class82.field1070 = field6262[field6265 + 2];
                field6274++;
                class650 var2 = class314.method1837(class62.field842, true, class625.field8727);
                var2.field8928.method1141(class463.field6710, 91);
                var2.field8928.method1141(class131.field1568.field8797, 74);
                var2.field8928.method1141(class82.field1070, 28);
                class108.method745(var2, -96);
                return;
            }
            if (arg0 == 5002) {
                field6257 -= 2;
                String var3 = field6261[field6257];
                String var4 = field6261[field6257 + 1];
                field6265 -= 2;
                int var5 = field6262[field6265];
                int var6 = field6262[field6265 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field6253++;
                class650 var7 = class314.method1837(class364.field5170, true, class625.field8727);
                var7.field8928.method1141(class663.method3588(0, var3) + class663.method3588(0, var4) + 2, 95);
                var7.field8928.method1110(var3, -30452);
                var7.field8928.method1141(var5 - 1, 85);
                var7.field8928.method1141(var6, 123);
                var7.field8928.method1110(var4, -30452);
                class108.method745(var7, -61);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field6262[--field6265];
                class421 var9 = class36.method320(-1, var8);
                String var10 = "";
                if (var9 != null && var9.field5985 != null) {
                    var10 = var9.field5985;
                }
                field6261[field6257++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field6262[--field6265];
                class421 var12 = class36.method320(-1, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field5989;
                }
                field6262[field6265++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class131.field1568 == null) {
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = class131.field1568.field8797;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field6262[--field6265];
                class650 var15 = class314.method1837(class210.field2687, true, class625.field8727);
                var15.field8928.method1141(var14, -103);
                class108.method745(var15, -57);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field6261[--field6257];
                method2629(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6257 -= 2;
                String var17 = field6261[field6257];
                String var18 = field6261[field6257 + 1];
                if (class408.field5753 != 0 || (!class58.field824 || class332.field4245) && !class525.field7422) {
                    field6263++;
                    class650 var19 = class314.method1837(class210.field2692, true, class625.field8727);
                    var19.field8928.method1141(0, 49);
                    int var20 = var19.field8928.field2354;
                    var19.field8928.method1110(var17, -30452);
                    class665.method3600(var18, var19.field8928, 0);
                    var19.field8928.method1126(-1, var19.field8928.field2354 - var20);
                    class108.method745(var19, -24);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field6262[--field6265];
                class421 var22 = class36.method320(-1, var21);
                String var23 = "";
                if (var22 != null && var22.field5988 != null) {
                    var23 = var22.field5988;
                }
                field6261[field6257++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field6262[--field6265];
                class421 var25 = class36.method320(-1, var24);
                String var26 = "";
                if (var25 != null && var25.field5986 != null) {
                    var26 = var25.field5986;
                }
                field6261[field6257++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field6262[--field6265];
                class421 var28 = class36.method320(-1, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field5983;
                }
                field6262[field6265++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class339.field4374 == null || class339.field4374.field7656 == null) {
                    var30 = "";
                } else {
                    var30 = class339.field4374.method3101(89, true);
                }
                field6261[field6257++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field6262[field6265++] = class82.field1070;
                return;
            }
            if (arg0 == 5017) {
                field6262[field6265++] = class346.method2029(-127);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field6262[--field6265];
                class421 var32 = class36.method320(-1, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field5981;
                }
                field6262[field6265++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field6262[--field6265];
                class421 var35 = class36.method320(-1, var34);
                String var36 = "";
                if (var35 != null && var35.field5990 != null) {
                    var36 = var35.field5990;
                }
                field6261[field6257++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class339.field4374 == null || class339.field4374.field7656 == null) {
                    var37 = "";
                } else {
                    var37 = class339.field4374.method3105((byte) 93, false);
                }
                field6261[field6257++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field6262[--field6265];
                class421 var39 = class36.method320(-1, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field5980;
                }
                field6262[field6265++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field6262[--field6265];
                class421 var42 = class36.method320(-1, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field5995;
                }
                field6262[field6265++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field6262[--field6265];
                class421 var45 = class36.method320(-1, var44);
                String var46 = "";
                if (var45 != null && var45.field5984 != null) {
                    var46 = var45.field5984;
                }
                field6261[field6257++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field6262[--field6265];
                field6261[field6257++] = class541.field7620.method2039(3, var47).field1651;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field6262[--field6265];
                class138 var49 = class541.field7620.method2039(3, var48);
                if (var49.field1643 == null) {
                    field6262[field6265++] = 0;
                    return;
                }
                field6262[field6265++] = var49.field1643.length;
                return;
            }
            if (arg0 == 5052) {
                field6265 -= 2;
                int var50 = field6262[field6265];
                int var51 = field6262[field6265 + 1];
                class138 var52 = class541.field7620.method2039(3, var50);
                int var53 = var52.field1643[var51];
                field6262[field6265++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field6262[--field6265];
                class138 var55 = class541.field7620.method2039(3, var54);
                if (var55.field1654 == null) {
                    field6262[field6265++] = 0;
                    return;
                }
                field6262[field6265++] = var55.field1654.length;
                return;
            }
            if (arg0 == 5054) {
                field6265 -= 2;
                int var56 = field6262[field6265];
                int var57 = field6262[field6265 + 1];
                field6262[field6265++] = class541.field7620.method2039(3, var56).field1654[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field6262[--field6265];
                field6261[field6257++] = class674.field9178.method1302(var58, 1).method1663((byte) -115);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field6262[--field6265];
                class277 var60 = class674.field9178.method1302(var59, 1);
                if (var60.field3499 == null) {
                    field6262[field6265++] = 0;
                    return;
                }
                field6262[field6265++] = var60.field3499.length;
                return;
            }
            if (arg0 == 5057) {
                field6265 -= 2;
                int var61 = field6262[field6265];
                int var62 = field6262[field6265 + 1];
                field6262[field6265++] = class674.field9178.method1302(var61, 1).field3499[var62];
                return;
            }
            if (arg0 == 5058) {
                field6255 = new class533();
                field6255.field7488 = field6262[--field6265];
                field6255.field7491 = class674.field9178.method1302(field6255.field7488, 1);
                field6255.field7492 = new int[field6255.field7491.method1662(true)];
                return;
            }
            if (arg0 == 5059) {
                field6271++;
                class650 var63 = class314.method1837(class436.field6131, true, class625.field8727);
                var63.field8928.method1141(0, 72);
                int var64 = var63.field8928.field2354;
                var63.field8928.method1141(0, 45);
                var63.field8928.method1157(field6255.field7488, (byte) 115);
                field6255.field7491.method1659(field6255.field7492, 0, var63.field8928);
                var63.field8928.method1126(-1, var63.field8928.field2354 - var64);
                class108.method745(var63, -88);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field6261[--field6257];
                field6264++;
                class650 var66 = class314.method1837(class607.field8419, true, class625.field8727);
                var66.field8928.method1141(0, 29);
                int var67 = var66.field8928.field2354;
                var66.field8928.method1110(var65, -30452);
                var66.field8928.method1157(field6255.field7488, (byte) 116);
                field6255.field7491.method1659(field6255.field7492, 0, var66.field8928);
                var66.field8928.method1126(-1, var66.field8928.field2354 - var67);
                class108.method745(var66, -11);
                return;
            }
            if (arg0 == 5061) {
                field6271++;
                class650 var68 = class314.method1837(class436.field6131, true, class625.field8727);
                var68.field8928.method1141(0, -93);
                int var69 = var68.field8928.field2354;
                var68.field8928.method1141(1, -69);
                var68.field8928.method1157(field6255.field7488, (byte) 114);
                field6255.field7491.method1659(field6255.field7492, 0, var68.field8928);
                var68.field8928.method1126(-1, var68.field8928.field2354 - var69);
                class108.method745(var68, -17);
                return;
            }
            if (arg0 == 5062) {
                field6265 -= 2;
                int var70 = field6262[field6265];
                int var71 = field6262[field6265 + 1];
                field6262[field6265++] = class541.field7620.method2039(3, var70).field1647[var71];
                return;
            }
            if (arg0 == 5063) {
                field6265 -= 2;
                int var72 = field6262[field6265];
                int var73 = field6262[field6265 + 1];
                field6262[field6265++] = class541.field7620.method2039(3, var72).field1650[var73];
                return;
            }
            if (arg0 == 5064) {
                field6265 -= 2;
                int var74 = field6262[field6265];
                int var75 = field6262[field6265 + 1];
                if (var75 == -1) {
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = class541.field7620.method2039(3, var74).method860((char) var75, (byte) -62);
                return;
            }
            if (arg0 == 5065) {
                field6265 -= 2;
                int var76 = field6262[field6265];
                int var77 = field6262[field6265 + 1];
                if (var77 == -1) {
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = class541.field7620.method2039(3, var76).method858((char) var77, -15460);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field6262[--field6265];
                field6262[field6265++] = class674.field9178.method1302(var78, 1).method1662(true);
                return;
            }
            if (arg0 == 5067) {
                field6265 -= 2;
                int var79 = field6262[field6265];
                int var80 = field6262[field6265 + 1];
                int var81 = class674.field9178.method1302(var79, 1).method1656(31102, var80).field1680;
                field6262[field6265++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field6265 -= 2;
                int var82 = field6262[field6265];
                int var83 = field6262[field6265 + 1];
                field6255.field7492[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field6265 -= 2;
                int var84 = field6262[field6265];
                int var85 = field6262[field6265 + 1];
                field6255.field7492[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field6265 -= 3;
                int var86 = field6262[field6265];
                int var87 = field6262[field6265 + 1];
                int var88 = field6262[field6265 + 2];
                class277 var89 = class674.field9178.method1302(var86, 1);
                if (var89.method1656(31102, var87).field1680 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6262[field6265++] = var89.method1657(var88, false, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field6261[--field6257];
                boolean var91 = field6262[--field6265] == 1;
                class302.method1780(-86, var91, var90);
                field6262[field6265++] = class721.field10154;
                return;
            }
            if (arg0 == 5072) {
                if (class114.field1405 != null && class627.field8739 < class721.field10154) {
                    field6262[field6265++] = class114.field1405[class627.field8739++] & 0xFFFF;
                    return;
                }
                field6262[field6265++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class627.field8739 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class333.field4297.method2924(-30303, 86)) {
                    field6262[field6265++] = 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class333.field4297.method2924(-30303, 82)) {
                    field6262[field6265++] = 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class333.field4297.method2924(-30303, 81)) {
                    field6262[field6265++] = 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class261.method1581(field6262[--field6265], -101);
                return;
            }
            if (arg0 == 5201) {
                field6262[field6265++] = class505.method2926(-129);
                return;
            }
            if (arg0 == 5205) {
                class157.method982(false, field6262[--field6265], -1, -1, (byte) -123);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field6262[--field6265];
                class377 var93 = class341.method2009(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = var93.field5285;
                return;
            }
            if (arg0 == 5207) {
                class377 var94 = class341.method1998(field6262[--field6265]);
                if (var94 != null && var94.field5286 != null) {
                    field6261[field6257++] = var94.field5286;
                    return;
                }
                field6261[field6257++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6262[field6265++] = class430.field6096;
                field6262[field6265++] = class33.field508;
                return;
            }
            if (arg0 == 5209) {
                field6262[field6265++] = class513.field7232 + class341.field4441;
                field6262[field6265++] = class758.field10552 + class341.field4442;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field6262[--field6265];
                class377 var96 = class341.method1998(var95);
                if (var96 == null) {
                    field6262[field6265++] = 0;
                    field6262[field6265++] = 0;
                    return;
                }
                field6262[field6265++] = var96.field5279 >> 14 & 0x3FFF;
                field6262[field6265++] = var96.field5279 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field6262[--field6265];
                class377 var98 = class341.method1998(var97);
                if (var98 == null) {
                    field6262[field6265++] = 0;
                    field6262[field6265++] = 0;
                    return;
                }
                field6262[field6265++] = var98.field5283 - var98.field5288;
                field6262[field6265++] = var98.field5287 - var98.field5278;
                return;
            }
            if (arg0 == 5212) {
                class499 var99 = class349.method2043(118);
                if (var99 == null) {
                    field6262[field6265++] = -1;
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = var99.field7056;
                int var100 = var99.field7053 << 28 | class341.field4441 + var99.field7059 << 14 | class341.field4442 + var99.field7047;
                field6262[field6265++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class499 var101 = class720.method3989(-105);
                if (var101 == null) {
                    field6262[field6265++] = -1;
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = var101.field7056;
                int var102 = var101.field7053 << 28 | class341.field4441 + var101.field7059 << 14 | class341.field4442 + var101.field7047;
                field6262[field6265++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field6262[--field6265];
                class377 var104 = class108.method744((byte) -116);
                if (var104 != null) {
                    boolean var105 = var104.method2290(field6275, var103 >> 28 & 0x3, var103 & 0x3FFF, var103 >> 14 & 0x3FFF, 28512);
                    if (var105) {
                        class475.method2785(field6275[2], (byte) -126, field6275[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6265 -= 2;
                int var106 = field6262[field6265];
                int var107 = field6262[field6265 + 1];
                class430 var108 = class341.method2018(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class377 var110 = (class377) var108.method2565((byte) 109); var110 != null; var110 = (class377) var108.method2568(-31355)) {
                    if (var110.field5285 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field6262[field6265++] = 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field6262[--field6265];
                class377 var112 = class341.method1998(var111);
                if (var112 == null) {
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = var112.field5282;
                return;
            }
            if (arg0 == 5220) {
                field6262[field6265++] = class551.field7754 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field6262[--field6265];
                class475.method2785(var113 & 0x3FFF, (byte) -116, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class377 var114 = class108.method744((byte) -128);
                if (var114 != null) {
                    boolean var115 = var114.method2287(class513.field7232 + class341.field4441, class758.field10552 + class341.field4442, field6275, (byte) -60);
                    if (var115) {
                        field6262[field6265++] = field6275[1];
                        field6262[field6265++] = field6275[2];
                        return;
                    }
                    field6262[field6265++] = -1;
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = -1;
                field6262[field6265++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6265 -= 2;
                int var116 = field6262[field6265];
                int var117 = field6262[field6265 + 1];
                class157.method982(false, var116, var117 & 0x3FFF, var117 >> 14 & 0x3FFF, (byte) -125);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field6262[--field6265];
                class377 var119 = class108.method744((byte) -112);
                if (var119 != null) {
                    boolean var120 = var119.method2290(field6275, var118 >> 28 & 0x3, var118 & 0x3FFF, var118 >> 14 & 0x3FFF, 28512);
                    if (var120) {
                        field6262[field6265++] = field6275[1];
                        field6262[field6265++] = field6275[2];
                        return;
                    }
                    field6262[field6265++] = -1;
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = -1;
                field6262[field6265++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field6262[--field6265];
                class377 var122 = class108.method744((byte) -119);
                if (var122 != null) {
                    boolean var123 = var122.method2287(var121 >> 14 & 0x3FFF, var121 & 0x3FFF, field6275, (byte) -60);
                    if (var123) {
                        field6262[field6265++] = field6275[1];
                        field6262[field6265++] = field6275[2];
                        return;
                    }
                    field6262[field6265++] = -1;
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = -1;
                field6262[field6265++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class504.method2907(field6262[--field6265], 3);
                return;
            }
            if (arg0 == 5227) {
                field6265 -= 2;
                int var124 = field6262[field6265];
                int var125 = field6262[field6265 + 1];
                class157.method982(true, var124, var125 & 0x3FFF, var125 >> 14 & 0x3FFF, (byte) -121);
                return;
            }
            if (arg0 == 5228) {
                class459.field6422 = field6262[--field6265] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6262[field6265++] = class459.field6422 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field6262[--field6265];
                class181.method1159(var126, (byte) -72);
                return;
            }
            if (arg0 == 5231) {
                field6265 -= 2;
                int var127 = field6262[field6265];
                boolean var128 = field6262[field6265 + 1] == 1;
                if (class489.field6951 != null) {
                    class627 var129 = class489.field6951.method3248((long) var127, 0);
                    if (var129 != null && !var128) {
                        var129.method3426((byte) -127);
                        return;
                    }
                    if (var129 == null && var128) {
                        class627 var130 = new class627();
                        class489.field6951.method3249((long) var127, var130, (byte) 116);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field6262[--field6265];
                if (class489.field6951 != null) {
                    class627 var132 = class489.field6951.method3248((long) var131, 0);
                    field6262[field6265++] = var132 == null ? 0 : 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6265 -= 2;
                int var133 = field6262[field6265];
                boolean var134 = field6262[field6265 + 1] == 1;
                if (class441.field6194 != null) {
                    class627 var135 = class441.field6194.method3248((long) var133, 0);
                    if (var135 != null && !var134) {
                        var135.method3426((byte) -58);
                        return;
                    }
                    if (var135 == null && var134) {
                        class627 var136 = new class627();
                        class441.field6194.method3249((long) var133, var136, (byte) 65);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field6262[--field6265];
                if (class441.field6194 != null) {
                    class627 var138 = class441.field6194.method3248((long) var137, 0);
                    field6262[field6265++] = var138 == null ? 0 : 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6262[field6265++] = class341.field4407 == null ? -1 : class341.field4407.field5285;
                return;
            }
            if (arg0 == 5236) {
                field6265 -= 2;
                int var139 = field6262[field6265];
                int var140 = field6262[field6265 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class556.method3159(var141, var142, (byte) -33, var139);
                if (var143 < 0) {
                    field6262[field6265++] = -1;
                    return;
                }
                field6262[field6265++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class97.method651((byte) -58);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6265 -= 2;
                int var144 = field6262[field6265];
                int var145 = field6262[field6265 + 1];
                class653.method3523(var145, 3, -1, var144, false);
                field6262[field6265++] = class627.field8740 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class627.field8740 != null) {
                    class653.method3523(-1, class223.field2944.field617.method3243((byte) -128), -1, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class434[] var146 = class444.method2615(-121);
                field6262[field6265++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field6262[--field6265];
                class434[] var148 = class444.method2615(-101);
                field6262[field6265++] = var148[var147].field6121;
                field6262[field6265++] = var148[var147].field6117;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class667.field9127;
                int var150 = class169.field2233;
                int var151 = -1;
                class434[] var152 = class444.method2615(-38);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class434 var154 = var152[var153];
                    if (var154.field6121 == var149 && var154.field6117 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field6262[field6265++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field6262[field6265++] = class126.method814((byte) 23);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field6262[--field6265];
                if (var155 >= 1 && var155 <= 2) {
                    class653.method3523(-1, var155, -1, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6262[field6265++] = class223.field2944.field617.method3243((byte) -122);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field6262[--field6265];
                if (var156 >= 1 && var156 <= 2) {
                    class223.field2944.method346(class223.field2944.field617, var156, false);
                    class223.field2944.method346(class223.field2944.field603, var156, false);
                    class252.method1530((byte) 66);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6257 -= 2;
                String var157 = field6261[field6257];
                String var158 = field6261[field6257 + 1];
                int var159 = field6262[--field6265];
                field6270++;
                class650 var160 = class314.method1837(class173.field2261, true, class625.field8727);
                var160.field8928.method1141(class663.method3588(0, var157) + class663.method3588(0, var158) + 1, -79);
                var160.field8928.method1110(var157, -30452);
                var160.field8928.method1110(var158, -30452);
                var160.field8928.method1141(var159, 82);
                class108.method745(var160, -52);
                return;
            }
            if (arg0 == 5401) {
                field6265 -= 2;
                class241.field3110[field6262[field6265]] = (short) class257.method1567(-1597404048, field6262[field6265 + 1]);
                class190.field2488.method3945(36);
                class190.field2488.method3940(0);
                class598.field8304.method1446((byte) 69);
                class728.method4033(-45);
                return;
            }
            if (arg0 == 5405) {
                field6265 -= 2;
                int var161 = field6262[field6265];
                int var162 = field6262[field6265 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class93.field1189[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6265 -= 7;
                int var163 = field6262[field6265];
                int var164 = field6262[field6265 + 1] << 1;
                int var165 = field6262[field6265 + 2];
                int var166 = field6262[field6265 + 3];
                int var167 = field6262[field6265 + 4];
                int var168 = field6262[field6265 + 5];
                int var169 = field6262[field6265 + 6];
                if (var163 >= 0 && var163 < 2 && class93.field1189[var163] != null && var164 >= 0 && var164 < class93.field1189[var163].length) {
                    class93.field1189[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class93.field1189[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class93.field1189[field6262[--field6265]].length >> 1;
                field6262[field6265++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class627.field8740 != null) {
                    class653.method3523(-1, class223.field2944.field617.method3243((byte) -121), -1, -1, false);
                }
                if (class95.field1205 != null) {
                    class61.method477(false);
                    System.exit(0);
                    return;
                }
                String var171 = class512.field7224 == null ? class495.method2879((byte) 74) : class512.field7224;
                class616.method3383(class223.field2944.field633.method4191((byte) -121) == 1, var171, false, class681.field9312, 117);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class398.field5520 != null) {
                    if (class398.field5520.field6123 == null) {
                        var172 = class689.method3856(256, class398.field5520.field6127);
                    } else {
                        var172 = (String) class398.field5520.field6123;
                    }
                }
                field6261[field6257++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field6262[field6265++] = class681.field9312.field3251 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class627.field8740 != null) {
                    class653.method3523(-1, class223.field2944.field617.method3243((byte) -122), -1, -1, false);
                }
                String var173 = field6261[--field6257];
                boolean var174 = field6262[--field6265] == 1;
                String var175 = class495.method2879((byte) 74) + var173;
                class616.method3383(class223.field2944.field633.method4191((byte) -125) == 1, var175, var174, class681.field9312, 100);
                return;
            }
            if (arg0 == 5422) {
                field6257 -= 2;
                String var176 = field6261[field6257];
                String var177 = field6261[field6257 + 1];
                int var178 = field6262[--field6265];
                if (var176.length() > 0) {
                    if (class518.field7296 == null) {
                        class518.field7296 = new String[class524.field7410[class702.field9902.field3627]];
                    }
                    class518.field7296[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class286.field3626 == null) {
                        class286.field3626 = new String[class524.field7410[class702.field9902.field3627]];
                    }
                    class286.field3626[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6261[--field6257]);
                return;
            }
            if (arg0 == 5424) {
                field6265 -= 11;
                class276.field3494 = field6262[field6265];
                class28.field458 = field6262[field6265 + 1];
                class494.field6990 = field6262[field6265 + 2];
                class595.field8267 = field6262[field6265 + 3];
                class572.field7991 = field6262[field6265 + 4];
                class477.field6806 = field6262[field6265 + 5];
                class414.field5847 = field6262[field6265 + 6];
                class16.field224 = field6262[field6265 + 7];
                class516.field7274 = field6262[field6265 + 8];
                class210.field2694 = field6262[field6265 + 9];
                class204.field2594 = field6262[field6265 + 10];
                class645.field8897.method3827(class572.field7991, (byte) 80);
                class645.field8897.method3827(class477.field6806, (byte) 50);
                class645.field8897.method3827(class414.field5847, (byte) 89);
                class645.field8897.method3827(class16.field224, (byte) 84);
                class645.field8897.method3827(class516.field7274, (byte) 108);
                class688.field9783 = null;
                class618.field8656 = null;
                class440.field6182 = null;
                class499.field7048 = null;
                class1.field5 = null;
                class572.field7983 = null;
                class105.field1287 = null;
                class497.field7033 = null;
                class95.field1206 = true;
                return;
            }
            if (arg0 == 5425) {
                class154.method959(-103);
                class95.field1206 = false;
                return;
            }
            if (arg0 == 5426) {
                field6265 -= 2;
                class137.field1636 = field6262[field6265];
                class423.field6015 = field6262[field6265 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6265 -= 2;
                class464.field6716 = field6262[field6265 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6265 -= 2;
                int var179 = field6262[field6265];
                int var180 = field6262[field6265 + 1];
                field6262[field6265++] = class35.method317(-127, var180, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class417.method2482(false, field6261[--field6257], false, (byte) 77);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class193.method1213(-13481, "accountcreated", class745.field10393);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class193.method1213(-13481, "accountcreatestarted", class745.field10393);
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class149.field1807 != null) {
                    Transferable var182 = class149.field1807.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var326) {
                        }
                    }
                }
                field6261[field6257++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class653.field8993 = field6262[--field6265];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6265 -= 4;
                int var183 = field6262[field6265];
                int var184 = field6262[field6265 + 1];
                int var185 = field6262[field6265 + 2];
                int var186 = field6262[field6265 + 3];
                class7.method31(false, 256, (var183 >> 14 & 0x3FFF) - class63.field851, var184 << 2, var186, var185, (var183 & 0x3FFF) - class753.field10509);
                return;
            }
            if (arg0 == 5501) {
                field6265 -= 4;
                int var187 = field6262[field6265];
                int var188 = field6262[field6265 + 1];
                int var189 = field6262[field6265 + 2];
                int var190 = field6262[field6265 + 3];
                class527.method3022((var187 & 0x3FFF) - class753.field10509, var190, (var187 >> 14 & 0x3FFF) - class63.field851, -79, var188 << 2, var189);
                return;
            }
            if (arg0 == 5502) {
                field6265 -= 6;
                int var191 = field6262[field6265];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class522.field7390 = var191;
                int var192 = field6262[field6265 + 1];
                if (var192 + 1 >= class93.field1189[class522.field7390].length >> 1) {
                    throw new RuntimeException();
                }
                class448.field6295 = var192;
                class261.field3317 = 0;
                class374.field5256 = field6262[field6265 + 2];
                class130.field1564 = field6262[field6265 + 3];
                int var193 = field6262[field6265 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class737.field10329 = var193;
                int var194 = field6262[field6265 + 5];
                if (var194 + 1 >= class93.field1189[class737.field10329].length >> 1) {
                    throw new RuntimeException();
                }
                class151.field1828 = var194;
                class276.field3497 = 3;
                class335.field4311 = -1;
                class147.field1783 = -1;
                return;
            }
            if (arg0 == 5503) {
                class241.method1503(4589);
                return;
            }
            if (arg0 == 5504) {
                field6265 -= 2;
                class416.method2475(-103, field6262[field6265], field6262[field6265 + 1], 0);
                return;
            }
            if (arg0 == 5505) {
                field6262[field6265++] = (int) class602.field8360 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6262[field6265++] = (int) class748.field10471 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class684.method3764((byte) 35);
                return;
            }
            if (arg0 == 5508) {
                class165.method1026((byte) -128);
                return;
            }
            if (arg0 == 5509) {
                class387.method2318(-3699);
                return;
            }
            if (arg0 == 5510) {
                class645.method3496((byte) -104);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field6262[--field6265];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class63.field851;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class613.field8591) {
                    var198 = class613.field8591;
                }
                int var199 = var197 - class753.field10509;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class1.field3) {
                    var199 = class1.field3;
                }
                class324.field4135 = (var198 << 9) + 256;
                class418.field5941 = (var199 << 9) + 256;
                class276.field3497 = 4;
                class335.field4311 = -1;
                class147.field1783 = -1;
                return;
            }
            if (arg0 == 5512) {
                class682.method3700(-696);
                return;
            }
            if (arg0 == 5514) {
                class468.field6736 = field6262[--field6265];
                return;
            }
            if (arg0 == 5516) {
                field6262[field6265++] = class468.field6736;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field6262[--field6265];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class63.field851;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class613.field8591) {
                        var203 = class613.field8591;
                    }
                    int var204 = var202 - class753.field10509;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class1.field3) {
                        var204 = class1.field3;
                    }
                    class147.field1783 = (var203 << 9) + 256;
                    class335.field4311 = (var204 << 9) + 256;
                    return;
                }
                class147.field1783 = -1;
                class335.field4311 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6257 -= 2;
                String var205 = field6261[field6257];
                String var206 = field6261[field6257 + 1];
                int var207 = field6262[--field6265];
                if (var205.length() > 320) {
                    return;
                }
                if (class668.field9150 != 3) {
                    return;
                }
                if (class575.field8031 == 0 && class272.field3446 == 0) {
                    class516.field7276 = var205;
                    class432.field6111 = var206;
                    class643.field8880 = var207;
                    class614.method3369(6, (byte) -72);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class42.method355(false);
                return;
            }
            if (arg0 == 5602) {
                if (class575.field8031 == 0) {
                    class397.field5515 = -2;
                    class10.field107 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field6257--;
                if (class668.field9150 != 3) {
                    return;
                }
                if (class575.field8031 == 0 && class272.field3446 == 0) {
                    class296.method1766(49, field6261[field6257]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6257 -= 2;
                field6265 -= 2;
                if (class668.field9150 != 3) {
                    return;
                }
                if (class575.field8031 == 0 && class272.field3446 == 0) {
                    class322.method1898(field6262[field6265], field6262[field6265 + 1] == 1, field6261[field6257 + 1], field6261[field6257], (byte) 67);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class272.field3446 == 0) {
                    class219.field2784 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6262[field6265++] = class10.field107;
                return;
            }
            if (arg0 == 5608) {
                field6262[field6265++] = class197.field2533;
                return;
            }
            if (arg0 == 5609) {
                field6262[field6265++] = class219.field2784;
                return;
            }
            if (arg0 == 5611) {
                field6262[field6265++] = class492.field6972;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field6262[--field6265];
                if (class668.field9150 != 7) {
                    return;
                }
                if (class575.field8031 == 0 && class272.field3446 == 0) {
                    if (class426.field6057 != null) {
                        class426.field6057.method872(-1);
                        class426.field6057 = null;
                    }
                    class643.field8880 = var208;
                    class614.method3369(9, (byte) -99);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field6262[field6265++] = class10.field107;
                return;
            }
            if (arg0 == 5615) {
                field6257 -= 2;
                String var209 = field6261[field6257];
                String var210 = field6261[field6257 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class668.field9150 != 3) {
                    return;
                }
                if (class575.field8031 == 0 && class272.field3446 == 0) {
                    if (class426.field6057 != null) {
                        class426.field6057.method872(-1);
                        class426.field6057 = null;
                    }
                    class516.field7276 = var209;
                    class432.field6111 = var210;
                    class614.method3369(5, (byte) -80);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class650.method3509(false, (byte) -74);
                return;
            }
            if (arg0 == 5617) {
                field6262[field6265++] = class397.field5515;
                return;
            }
            if (arg0 == 5618) {
                field6265--;
                return;
            }
            if (arg0 == 5619) {
                field6265--;
                return;
            }
            if (arg0 == 5620) {
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field6257 -= 2;
                field6265 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class224.field2948 != null) {
                    field6262[field6265++] = 1;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field6262[field6265++] = (int) (class584.field8114 >> 32);
                field6262[field6265++] = (int) (class584.field8114 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field6262[field6265++] = class181.field2382 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class181.field2382 = true;
                class574.method3221(-75);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field6262[--field6265];
                class223.field2944.method346(class223.field2944.field598, var211, false);
                class480.method2810((byte) -88);
                class252.method1530((byte) 103);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field6262[--field6265] == 1;
                class223.field2944.method346(class223.field2944.field637, var212 ? 1 : 0, false);
                class223.field2944.method346(class223.field2944.field619, var212 ? 1 : 0, false);
                class480.method2810((byte) -90);
                class652.method3516(-114);
                class252.method1530((byte) 99);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field6262[--field6265] == 1;
                class223.field2944.method346(class223.field2944.field596, var213 ? 2 : 1, false);
                class223.field2944.method346(class223.field2944.field588, var213 ? 2 : 1, false);
                class652.method3516(-95);
                class252.method1530((byte) 125);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6005) {
                class223.field2944.method346(class223.field2944.field610, field6262[--field6265] == 1 ? 1 : 0, false);
                class480.method2810((byte) -122);
                class252.method1530((byte) 115);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6007) {
                class223.field2944.method346(class223.field2944.field620, field6262[--field6265], false);
                class252.method1530((byte) 65);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6008) {
                class223.field2944.method346(class223.field2944.field622, field6262[--field6265] == 1 ? 1 : 0, false);
                class252.method1530((byte) 118);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6010) {
                class223.field2944.method346(class223.field2944.field611, field6262[--field6265] == 1 ? 1 : 0, false);
                class252.method1530((byte) 63);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6011) {
                class223.field2944.method346(class223.field2944.field628, field6262[--field6265], false);
                class480.method2810((byte) -88);
                class252.method1530((byte) 83);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6012) {
                class223.field2944.method346(class223.field2944.field602, field6262[--field6265] == 1 ? 1 : 0, false);
                class681.method3687((byte) 91);
                class37.method328((byte) -45);
                class252.method1530((byte) 120);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6014) {
                class223.field2944.method346(class223.field2944.field604, field6262[--field6265] == 1 ? 2 : 0, false);
                class480.method2810((byte) -107);
                class252.method1530((byte) 79);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6015) {
                class223.field2944.method346(class223.field2944.field585, field6262[--field6265] == 1 ? 1 : 0, false);
                class480.method2810((byte) -95);
                class252.method1530((byte) 95);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6016) {
                class223.field2944.method346(class223.field2944.field631, field6262[--field6265], false);
                class462.method2730(1, false, class223.field2944.field633.method4191((byte) -123));
                class252.method1530((byte) 80);
                return;
            }
            if (arg0 == 6017) {
                class223.field2944.method346(class223.field2944.field613, field6262[--field6265] == 1 ? 1 : 0, false);
                class182.method1167(2048);
                class252.method1530((byte) 83);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6018) {
                class223.field2944.method346(class223.field2944.field600, field6262[--field6265], false);
                class252.method1530((byte) 97);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field6262[--field6265];
                int var215 = class223.field2944.field593.method3601((byte) -122);
                if (var214 != var215) {
                    if (class64.method489((byte) 124, class668.field9150)) {
                        if (var215 == 0 && class601.field8357 != -1) {
                            class454.method2665(class456.field6388, false, var214, false, 0, class601.field8357);
                            class519.method2979((byte) -91);
                            class537.field7549 = false;
                        } else if (var214 == 0) {
                            class667.method3608(true);
                            class537.field7549 = false;
                        } else {
                            class737.method4134(var214, false);
                        }
                    }
                    class223.field2944.method346(class223.field2944.field593, var214, false);
                    class252.method1530((byte) 88);
                    class78.field1035 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class223.field2944.method346(class223.field2944.field605, field6262[--field6265], false);
                class252.method1530((byte) 87);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class223.field2944.field596.method329((byte) -126);
                class223.field2944.method346(class223.field2944.field588, field6262[--field6265] == 1 ? 0 : var216, false);
                class652.method3516(-115);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field6262[--field6265];
                class223.field2944.method346(class223.field2944.field615, var217, false);
                class252.method1530((byte) 124);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6024) {
                class223.field2944.method346(class223.field2944.field618, field6262[--field6265], false);
                class252.method1530((byte) 111);
                return;
            }
            if (arg0 == 6025) {
                class223.field2944.method346(class223.field2944.field612, field6262[--field6265], false);
                class252.method1530((byte) 91);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field6262[--field6265];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class219.method1364(var218 == 1, -1150);
                return;
            }
            if (arg0 == 6028) {
                class223.field2944.method346(class223.field2944.field597, field6262[--field6265] == 0 ? 0 : 1, false);
                class252.method1530((byte) 113);
                return;
            }
            if (arg0 == 6029) {
                class223.field2944.method346(class223.field2944.field620, field6262[--field6265], false);
                class252.method1530((byte) 63);
                return;
            }
            if (arg0 == 6030) {
                class223.field2944.method346(class223.field2944.field591, field6262[--field6265] == 0 ? 0 : 1, false);
                class252.method1530((byte) 67);
                class480.method2810((byte) -96);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field6262[--field6265];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class462.method2730(1, false, var219);
                return;
            }
            if (arg0 == 6032) {
                field6265 -= 2;
                int var220 = field6262[field6265];
                boolean var221 = field6262[field6265 + 1] == 1;
                class223.field2944.method346(class223.field2944.field601, var220, false);
                if (!var221) {
                    class223.field2944.method346(class223.field2944.field609, 0, false);
                }
                class252.method1530((byte) 58);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6033) {
                class223.field2944.method346(class223.field2944.field606, field6262[--field6265], false);
                class252.method1530((byte) 64);
                return;
            }
            if (arg0 == 6034) {
                class223.field2944.method346(class223.field2944.field621, field6262[--field6265] == 1 ? 1 : 0, false);
                class252.method1530((byte) 84);
                class681.method3687((byte) 56);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class223.field2944.field637.method444((byte) -128);
                class223.field2944.method346(class223.field2944.field619, field6262[--field6265] == 1 ? 1 : var222, false);
                class480.method2810((byte) -82);
                class652.method3516(-118);
                return;
            }
            if (arg0 == 6036) {
                class223.field2944.method346(class223.field2944.field626, field6262[--field6265], false);
                class252.method1530((byte) 78);
                class315.field4051 = true;
                return;
            }
            if (arg0 == 6037) {
                class223.field2944.method346(class223.field2944.field632, field6262[--field6265], false);
                class252.method1530((byte) 92);
                class78.field1035 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field6262[--field6265];
                int var224 = class223.field2944.field624.method3601((byte) -128);
                if (var223 != var224 && class601.field8357 == class182.field2386) {
                    if (!class64.method489((byte) 127, class668.field9150)) {
                        if (var224 == 0) {
                            class454.method2665(class456.field6388, false, var223, false, 0, class601.field8357);
                            class519.method2979((byte) -112);
                            class537.field7549 = false;
                        } else if (var223 == 0) {
                            class667.method3608(true);
                            class537.field7549 = false;
                        } else {
                            class737.method4134(var223, false);
                        }
                    }
                    class223.field2944.method346(class223.field2944.field624, var223, false);
                    class252.method1530((byte) 59);
                    class78.field1035 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field6262[--field6265];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class223.field2944.field614.method1525((byte) -121)) {
                    class223.field2944.method346(class223.field2944.field614, var225, false);
                    class252.method1530((byte) 123);
                    class78.field1035 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field6262[--field6265];
                if (var226 != class223.field2944.field634.method2971((byte) -120)) {
                    class223.field2944.method346(class223.field2944.field634, var226, false);
                    class252.method1530((byte) 89);
                    class78.field1035 = false;
                    class619.method3397((byte) 114);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6262[field6265++] = class223.field2944.field598.method992((byte) -123);
                return;
            }
            if (arg0 == 6102) {
                field6262[field6265++] = class223.field2944.field637.method444((byte) -126) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6262[field6265++] = class223.field2944.field596.method329((byte) -121) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6262[field6265++] = class223.field2944.field610.method3087((byte) -122) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6262[field6265++] = class223.field2944.field620.method225((byte) -123);
                return;
            }
            if (arg0 == 6108) {
                field6262[field6265++] = class223.field2944.field622.method4203((byte) -125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6262[field6265++] = class223.field2944.field611.method3531((byte) -125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6262[field6265++] = class223.field2944.field628.method1256((byte) -122);
                return;
            }
            if (arg0 == 6112) {
                field6262[field6265++] = class223.field2944.field602.method1676((byte) -125) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6262[field6265++] = class223.field2944.field604.method1060((byte) -121) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6262[field6265++] = class223.field2944.field585.method3565((byte) -120) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6262[field6265++] = class223.field2944.field631.method1463((byte) -127);
                return;
            }
            if (arg0 == 6117) {
                field6262[field6265++] = class223.field2944.field613.method1611((byte) -123) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6262[field6265++] = class223.field2944.field600.method3601((byte) -121);
                return;
            }
            if (arg0 == 6119) {
                field6262[field6265++] = class223.field2944.field593.method3601((byte) -121);
                return;
            }
            if (arg0 == 6120) {
                field6262[field6265++] = class223.field2944.field605.method3601((byte) -122);
                return;
            }
            if (arg0 == 6123) {
                field6262[field6265++] = class434.method2574(false);
                return;
            }
            if (arg0 == 6124) {
                field6262[field6265++] = class223.field2944.field618.method1463((byte) -124);
                return;
            }
            if (arg0 == 6125) {
                field6262[field6265++] = class223.field2944.field612.method2953((byte) -124);
                return;
            }
            if (arg0 == 6127) {
                field6262[field6265++] = class223.field2944.field594.method436((byte) -128) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6262[field6265++] = class223.field2944.field597.method1472((byte) -126) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6262[field6265++] = class223.field2944.field620.method225((byte) -125);
                return;
            }
            if (arg0 == 6130) {
                field6262[field6265++] = class223.field2944.field591.method3604((byte) -123) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6262[field6265++] = class223.field2944.field633.method4191((byte) -121);
                return;
            }
            if (arg0 == 6132) {
                field6262[field6265++] = class223.field2944.field601.method4191((byte) -123);
                return;
            }
            if (arg0 == 6133) {
                field6262[field6265++] = class681.field9312.field3251 && !class681.field9312.field3240 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field6262[field6265++] = class223.field2944.field606.method3919((byte) -123);
                return;
            }
            if (arg0 == 6136) {
                field6262[field6265++] = class223.field2944.field621.method2399((byte) -121) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field6262[field6265++] = class442.method2604(class223.field2944.field633.method4191((byte) -121), (byte) -74, 200);
                return;
            }
            if (arg0 == 6139) {
                field6262[field6265++] = class223.field2944.field626.method1211((byte) -124);
                return;
            }
            if (arg0 == 6142) {
                field6262[field6265++] = class223.field2944.field632.method3601((byte) -125);
                return;
            }
            if (arg0 == 6143) {
                field6262[field6265++] = class223.field2944.field624.method3601((byte) -128);
                return;
            }
            if (arg0 == 6144) {
                field6262[field6265++] = class717.field10117 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field6262[field6265++] = class223.field2944.field614.method1525((byte) -127);
                return;
            }
            if (arg0 == 6146) {
                field6262[field6265++] = class223.field2944.field634.method2971((byte) -127);
                return;
            }
            if (arg0 == 6147) {
                field6262[field6265++] = class241.field3102.field8654 < 512 || class717.field10117 || class9.field96 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field6262[field6265++] = class129.field1557 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6265 -= 2;
                class121.field1458 = (short) field6262[field6265];
                if (class121.field1458 <= 0) {
                    class121.field1458 = 256;
                }
                class602.field8359 = (short) field6262[field6265 + 1];
                if (class602.field8359 <= 0) {
                    class602.field8359 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6265 -= 2;
                class658.field9040 = (short) field6262[field6265];
                if (class658.field9040 <= 0) {
                    class658.field9040 = 256;
                }
                class598.field8311 = (short) field6262[field6265 + 1];
                if (class598.field8311 <= 0) {
                    class598.field8311 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6265 -= 4;
                class298.field3865 = (short) field6262[field6265];
                if (class298.field3865 <= 0) {
                    class298.field3865 = 1;
                }
                class567.field7921 = (short) field6262[field6265 + 1];
                if (class567.field7921 <= 0) {
                    class567.field7921 = 32767;
                } else if (class567.field7921 < class298.field3865) {
                    class567.field7921 = class298.field3865;
                }
                class138.field1657 = (short) field6262[field6265 + 2];
                if (class138.field1657 <= 0) {
                    class138.field1657 = 1;
                }
                class527.field7439 = (short) field6262[field6265 + 3];
                if (class527.field7439 <= 0) {
                    class527.field7439 = 32767;
                    return;
                }
                if (class527.field7439 < class138.field1657) {
                    class527.field7439 = class138.field1657;
                }
                return;
            }
            if (arg0 == 6203) {
                class24.method259(0, false, 31356, class14.field200.field6566, 0, class14.field200.field6514);
                field6262[field6265++] = class233.field3019;
                field6262[field6265++] = class554.field7778;
                return;
            }
            if (arg0 == 6204) {
                field6262[field6265++] = class658.field9040;
                field6262[field6265++] = class598.field8311;
                return;
            }
            if (arg0 == 6205) {
                field6262[field6265++] = class121.field1458;
                field6262[field6265++] = class602.field8359;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6262[field6265++] = (int) (class97.method654((byte) 59) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6262[field6265++] = (int) (class97.method654((byte) 79) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6265 -= 3;
                int var227 = field6262[field6265];
                int var228 = field6262[field6265 + 1];
                int var229 = field6262[field6265 + 2];
                field6260.clear();
                field6260.set(11, 12);
                field6260.set(var229, var228, var227);
                int var230 = (int) (field6260.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field6262[field6265++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field6260.clear();
                field6260.setTime(new Date(class97.method654((byte) 119)));
                field6262[field6265++] = field6260.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field6262[--field6265];
                boolean var232 = true;
                if (var231 < 0) {
                    var232 = (var231 + 1) % 4 == 0;
                } else if (var231 < 1582) {
                    var232 = var231 % 4 == 0;
                } else if (var231 % 4 != 0) {
                    var232 = false;
                } else if (var231 % 100 != 0) {
                    var232 = true;
                } else if (var231 % 400 != 0) {
                    var232 = false;
                }
                field6262[field6265++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6262[field6265++] = class659.method3580(-123) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6262[field6265++] = class629.method3429(0) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class668.field9150 == 7 && class575.field8031 == 0 && class272.field3446 == 0) {
                    if (class372.field5233) {
                        field6262[field6265++] = 0;
                        return;
                    }
                    if (class750.field10503 > class97.method654((byte) 81) - 1000L) {
                        field6262[field6265++] = 1;
                        return;
                    }
                    class372.field5233 = true;
                    class650 var233 = class314.method1837(class383.field5333, true, class625.field8727);
                    var233.field8928.method1112(class457.field6395, -126);
                    class108.method745(var233, -114);
                    field6262[field6265++] = 0;
                    return;
                }
                field6262[field6265++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class266 var234 = class331.method1944((byte) -46);
                if (var234 != null) {
                    field6262[field6265++] = var234.field3375;
                    field6262[field6265++] = var234.field8458;
                    field6261[field6257++] = var234.field3362;
                    class673 var235 = var234.method1604(-30874);
                    field6262[field6265++] = var235.field9166;
                    field6261[field6257++] = var235.field9165;
                    field6262[field6265++] = var234.field8464;
                    field6262[field6265++] = var234.field3374;
                    field6261[field6257++] = var234.field3367;
                    return;
                }
                field6262[field6265++] = -1;
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                field6262[field6265++] = 0;
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                return;
            }
            if (arg0 == 6502) {
                class266 var236 = class373.method2273(-64);
                if (var236 != null) {
                    field6262[field6265++] = var236.field3375;
                    field6262[field6265++] = var236.field8458;
                    field6261[field6257++] = var236.field3362;
                    class673 var237 = var236.method1604(-30874);
                    field6262[field6265++] = var237.field9166;
                    field6261[field6257++] = var237.field9165;
                    field6262[field6265++] = var236.field8464;
                    field6262[field6265++] = var236.field3374;
                    field6261[field6257++] = var236.field3367;
                    return;
                }
                field6262[field6265++] = -1;
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                field6262[field6265++] = 0;
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field6262[--field6265];
                String var239 = field6261[--field6257];
                if (class668.field9150 == 7 && class575.field8031 == 0 && class272.field3446 == 0) {
                    field6262[field6265++] = class581.method3240(var238, 40000, var239) ? 1 : 0;
                    return;
                }
                field6262[field6265++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field6262[--field6265];
                class266 var241 = class531.method3032(var240, (byte) -116);
                if (var241 != null) {
                    field6262[field6265++] = var241.field8458;
                    field6261[field6257++] = var241.field3362;
                    class673 var242 = var241.method1604(-30874);
                    field6262[field6265++] = var242.field9166;
                    field6261[field6257++] = var242.field9165;
                    field6262[field6265++] = var241.field8464;
                    field6262[field6265++] = var241.field3374;
                    field6261[field6257++] = var241.field3367;
                    return;
                }
                field6262[field6265++] = -1;
                field6261[field6257++] = "";
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                field6262[field6265++] = 0;
                field6262[field6265++] = 0;
                field6261[field6257++] = "";
                return;
            }
            if (arg0 == 6507) {
                field6265 -= 4;
                int var243 = field6262[field6265];
                boolean var244 = field6262[field6265 + 1] == 1;
                int var245 = field6262[field6265 + 2];
                boolean var246 = field6262[field6265 + 3] == 1;
                class77.method559(var245, var246, var244, 0, var243);
                return;
            }
            if (arg0 == 6508) {
                class667.method3610((byte) 112);
                return;
            }
            if (arg0 == 6509) {
                if (class668.field9150 != 7) {
                    return;
                }
                class730.field10222 = field6262[--field6265] == 1;
                return;
            }
            if (arg0 == 6510) {
                field6262[field6265++] = class52.field764;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class42.field642 == class393.field5487) {
                if (arg0 == 6700) {
                    int var247 = class148.field1802.method3244((byte) 127);
                    if (class638.field8834 != -1) {
                        var247++;
                    }
                    field6262[field6265++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field6262[--field6265];
                    if (class638.field8834 != -1) {
                        if (var248 == 0) {
                            field6262[field6265++] = class638.field8834;
                            return;
                        }
                        var248--;
                    }
                    class157 var249 = (class157) class148.field1802.method3245(false);
                    while (var248-- > 0) {
                        var249 = (class157) class148.field1802.method3252(12938);
                    }
                    field6262[field6265++] = var249.field2028;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field6262[--field6265];
                    if (class323.field4125[var250] == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    String var251 = class323.field4125[var250][0].field6589;
                    if (var251 == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field6262[--field6265];
                    if (class323.field4125[var252] == null) {
                        field6262[field6265++] = 0;
                        return;
                    }
                    field6262[field6265++] = class323.field4125[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field6265 -= 2;
                    int var253 = field6262[field6265];
                    int var254 = field6262[field6265 + 1];
                    if (class323.field4125[var253] == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    String var255 = class323.field4125[var253][var254].field6589;
                    if (var255 == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field6265 -= 2;
                    int var256 = field6262[field6265];
                    int var257 = field6262[field6265 + 1];
                    if (class323.field4125[var256] == null) {
                        field6262[field6265++] = 0;
                        return;
                    }
                    field6262[field6265++] = class323.field4125[var256][var257].field6496;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field6265 -= 3;
                    int var258 = field6262[field6265];
                    int var259 = field6262[field6265 + 1];
                    int var260 = field6262[field6265 + 2];
                    class107.method738(var258 << 16 | var259, 1, -26, "", var260);
                    return;
                }
                if (arg0 == 6708) {
                    field6265 -= 3;
                    int var261 = field6262[field6265];
                    int var262 = field6262[field6265 + 1];
                    int var263 = field6262[field6265 + 2];
                    class107.method738(var261 << 16 | var262, 2, 119, "", var263);
                    return;
                }
                if (arg0 == 6709) {
                    field6265 -= 3;
                    int var264 = field6262[field6265];
                    int var265 = field6262[field6265 + 1];
                    int var266 = field6262[field6265 + 2];
                    class107.method738(var264 << 16 | var265, 3, -59, "", var266);
                    return;
                }
                if (arg0 == 6710) {
                    field6265 -= 3;
                    int var267 = field6262[field6265];
                    int var268 = field6262[field6265 + 1];
                    int var269 = field6262[field6265 + 2];
                    class107.method738(var267 << 16 | var268, 4, 124, "", var269);
                    return;
                }
                if (arg0 == 6711) {
                    field6265 -= 3;
                    int var270 = field6262[field6265];
                    int var271 = field6262[field6265 + 1];
                    int var272 = field6262[field6265 + 2];
                    class107.method738(var270 << 16 | var271, 5, -61, "", var272);
                    return;
                }
                if (arg0 == 6712) {
                    field6265 -= 3;
                    int var273 = field6262[field6265];
                    int var274 = field6262[field6265 + 1];
                    int var275 = field6262[field6265 + 2];
                    class107.method738(var273 << 16 | var274, 6, 126, "", var275);
                    return;
                }
                if (arg0 == 6713) {
                    field6265 -= 3;
                    int var276 = field6262[field6265];
                    int var277 = field6262[field6265 + 1];
                    int var278 = field6262[field6265 + 2];
                    class107.method738(var276 << 16 | var277, 7, -34, "", var278);
                    return;
                }
                if (arg0 == 6714) {
                    field6265 -= 3;
                    int var279 = field6262[field6265];
                    int var280 = field6262[field6265 + 1];
                    int var281 = field6262[field6265 + 2];
                    class107.method738(var279 << 16 | var280, 8, 119, "", var281);
                    return;
                }
                if (arg0 == 6715) {
                    field6265 -= 3;
                    int var282 = field6262[field6265];
                    int var283 = field6262[field6265 + 1];
                    int var284 = field6262[field6265 + 2];
                    class107.method738(var282 << 16 | var283, 9, 122, "", var284);
                    return;
                }
                if (arg0 == 6716) {
                    field6265 -= 3;
                    int var285 = field6262[field6265];
                    int var286 = field6262[field6265 + 1];
                    int var287 = field6262[field6265 + 2];
                    class107.method738(var285 << 16 | var286, 10, 124, "", var287);
                    return;
                }
                if (arg0 == 6717) {
                    field6265 -= 3;
                    int var288 = field6262[field6265];
                    int var289 = field6262[field6265 + 1];
                    int var290 = field6262[field6265 + 2];
                    class460 var291 = class611.method3340(var290, var288 << 16 | var289, -128);
                    class463.method2742((byte) 88);
                    class28 var292 = client.method715(var291);
                    class758.method4216(var292.field466, -11302, var291, var292.method291(55));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field6262[--field6265];
                    class351 var294 = class37.field551.method2765(36, var293);
                    if (var294.field4599 == null) {
                        field6261[field6257++] = "";
                        return;
                    }
                    field6261[field6257++] = var294.field4599;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field6262[--field6265];
                    class351 var296 = class37.field551.method2765(36, var295);
                    field6262[field6265++] = var296.field4593;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field6262[--field6265];
                    class351 var298 = class37.field551.method2765(36, var297);
                    field6262[field6265++] = var298.field4590;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field6262[--field6265];
                    class351 var300 = class37.field551.method2765(36, var299);
                    field6262[field6265++] = var300.field4608;
                    return;
                }
                if (arg0 == 6804) {
                    field6265 -= 2;
                    int var301 = field6262[field6265];
                    int var302 = field6262[field6265 + 1];
                    class49 var303 = class188.field2466.method3449(2529, var302);
                    if (var303.method399(16709)) {
                        field6261[field6257++] = class37.field551.method2765(36, var301).method2063(var302, var303.field715, 23857);
                        return;
                    }
                    field6262[field6265++] = class37.field551.method2765(36, var301).method2068(var303.field720, var302, -72);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field6262[field6265++] = class58.field824 && !class332.field4245 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field6262[field6265++] = class107.field1328;
                    return;
                }
                if (arg0 == 6902) {
                    field6262[field6265++] = class144.field1711;
                    return;
                }
                if (arg0 == 6903) {
                    field6262[field6265++] = class167.field2200;
                    return;
                }
                if (arg0 == 6904) {
                    field6262[field6265++] = class354.field4738;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class398.field5520 != null) {
                        if (class398.field5520.field6123 == null) {
                            var304 = class689.method3856(256, class398.field5520.field6127);
                        } else {
                            var304 = (String) class398.field5520.field6123;
                        }
                    }
                    field6261[field6257++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field6262[field6265++] = class446.field6282;
                    return;
                }
                if (arg0 == 6907) {
                    field6262[field6265++] = class661.field9074;
                    return;
                }
                if (arg0 == 6908) {
                    field6262[field6265++] = class443.field6202;
                    return;
                }
                if (arg0 == 6909) {
                    field6262[field6265++] = class458.field6399 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field6262[field6265++] = class661.field9057;
                    return;
                }
                if (arg0 == 6911) {
                    field6262[field6265++] = class496.field7026;
                    return;
                }
                if (arg0 == 6912) {
                    field6262[field6265++] = class713.field10024;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class400.method2368(-21867);
                    field6262[field6265++] = class36.field539 = class223.field2944.field633.method4191((byte) -127);
                    field6262[field6265++] = var305;
                    class480.method2810((byte) -79);
                    class252.method1530((byte) 66);
                    class78.field1035 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class58.method459((byte) 90);
                    class480.method2810((byte) -100);
                    class252.method1530((byte) 75);
                    class78.field1035 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class511.method2941(true);
                    class480.method2810((byte) -109);
                    class252.method1530((byte) 74);
                    class78.field1035 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class368.method2259(48);
                    class480.method2810((byte) -104);
                    class252.method1530((byte) 124);
                    class78.field1035 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class585.method3260(true, (byte) -103);
                    class480.method2810((byte) -116);
                    class252.method1530((byte) 110);
                    class78.field1035 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class223.field2944.method346(class223.field2944.field609, 0, false);
                    class252.method1530((byte) 114);
                    class78.field1035 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class36.field539 == 2) {
                        class199.field2552 = true;
                        return;
                    }
                    if (class36.field539 == 1) {
                        class597.field8275 = true;
                        return;
                    }
                    if (class36.field539 == 3) {
                        class446.field6285 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field6262[field6265++] = class223.field2944.field609.method2102((byte) -123);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field6265 -= 2;
                    int var306 = field6262[field6265];
                    int var307 = field6262[field6265 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class272.method1630(var306, var307, 24575, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field6262[--field6265];
                    if (var308 != -1) {
                        class623.method3410(var308, -127);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field6262[--field6265];
                    if (var309 != -1) {
                        class463.method2743(var309, -2);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field6262[field6265++] = class274.method1640((byte) -112, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field6262[field6265++] = class223.field2944.field610.method3085((byte) 110) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field6262[field6265++] = class223.field2944.field611.method3533((byte) 125) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field6262[field6265++] = class223.field2944.field628.method1254((byte) 127) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field6262[field6265++] = class223.field2944.field604.method1056((byte) 127) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field6262[field6265++] = class223.field2944.field618.method1461((byte) 117) && class458.field6407.method66() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field6262[field6265++] = class223.field2944.field615.method295((byte) 120) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field6262[field6265++] = class223.field2944.field612.method2952((byte) 109) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field6262[field6265++] = class223.field2944.field594.method439((byte) 127) && class458.field6407.method171() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field6262[field6265++] = class223.field2944.field591.method3605((byte) 110) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field6262[field6265++] = class223.field2944.field621.method2400((byte) 118) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field6262[field6265++] = class223.field2944.field626.method1208((byte) 123) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field6262[field6265++] = class223.field2944.field585.method3566((byte) 105) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field6262[field6265++] = class223.field2944.field634.method2973((byte) 126) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field6262[field6265++] = class223.field2944.field601.method4187((byte) 119) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field610.method222(var310, 1);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field611.method222(var311, 1);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field628.method222(var312, 1);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field604.method222(var313, 1);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field6262[--field6265];
                    if (!class458.field6407.method66()) {
                        field6262[field6265++] = 3;
                        return;
                    }
                    field6262[field6265++] = class223.field2944.field618.method222(var314, 1);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field615.method222(var315, 1);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field612.method222(var316, 1);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field6262[--field6265];
                    if (!class458.field6407.method171()) {
                        field6262[field6265++] = 3;
                        return;
                    }
                    field6262[field6265++] = class223.field2944.field594.method222(var317, 1);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field591.method222(var318, 1);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field621.method222(var319, 1);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field626.method222(var320, 1);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field585.method222(var321, 1);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field634.method222(var322, 1);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field6262[--field6265];
                    field6262[field6265++] = class223.field2944.field601.method222(var323, 1);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V")
    private static final void method2632(int arg0) {
        class460 var1 = class102.method684(5025, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class460[] var3 = class238.field3072[var2];
        if (var3 == null) {
            class460[] var4 = class323.field4125[var2];
            int var5 = var4.length;
            var3 = class238.field3072[var2] = new class460[var5];
            class617.method3390(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class617.method3390(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lwba;I)V")
    private static final void method2633(class575 arg0, int arg1) {
        Object[] var2 = arg0.field8027;
        int var3 = (Integer) var2[0];
        class236 var4 = class293.method1757(1, var3);
        if (var4 == null) {
            return;
        }
        field6258 = new int[var4.field3045];
        int var5 = 0;
        field6272 = new String[var4.field3047];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field8021;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field8022;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field8028 == null ? -1 : arg0.field8028.field6524;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field8025;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field8028 == null ? -1 : arg0.field8028.field6601;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field8032 == null ? -1 : arg0.field8032.field6524;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field8032 == null ? -1 : arg0.field8032.field6601;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field8029;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field8030;
                }
                field6258[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field8024;
                }
                field6272[var6++] = var9;
            }
        }
        field6278 = arg0.field8019;
        method2620(var4, arg1);
    }

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method2634(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6260.setTime(new Date(var1));
        int var3 = field6260.get(5);
        int var4 = field6260.get(2);
        int var5 = field6260.get(1);
        return var3 + "-" + field6277[var4] + "-" + var5;
    }
}
