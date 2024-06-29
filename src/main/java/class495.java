import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class495 {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    private static int field6997 = 0;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    private static int field7007 = 0;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "[[I")
    private static int[][] field6996 = new int[5][5000];

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field7002 = new String[1000];

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    private static int field7014 = 0;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "[Lhn;")
    private static class516[] field7016 = new class516[50];

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "[I")
    private static int[] field7017 = new int[5];

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
    private static int[] field7004 = new int[1000];

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7000 = Calendar.getInstance();

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
    private static int[] field7020 = new int[3];

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field7018 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Lfc;")
    public static class174 field7021 = new class174(4);

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    private static int field7022 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Lhm;")
    private static class150 field7008;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Lhm;")
    private static class150 field7013;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "Llq;")
    private static class393 field7001;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[I")
    private static int[] field6994;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field6998;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lea;I)V")
    private static final void method2865(class389 arg0, int arg1) {
        Object[] var2 = arg0.field5466;
        int var3 = (Integer) var2[0];
        class106 var4 = class95.method668((byte) 96, var3);
        if (var4 == null) {
            return;
        }
        field6994 = new int[var4.field1410];
        int var5 = 0;
        field6998 = new String[var4.field1399];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5468;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5465;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5457 == null ? -1 : arg0.field5457.field2134;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5459;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5457 == null ? -1 : arg0.field5457.field2105;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5473 == null ? -1 : arg0.field5473.field2134;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5473 == null ? -1 : arg0.field5473.field2105;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5461;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5471;
                }
                field6994[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5469;
                }
                field6998[var6++] = var9;
            }
        }
        field7022 = arg0.field5456;
        method2871(var4, arg1);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lea;)V")
    public static final void method2866(class389 arg0) {
        method2865(arg0, 200000);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static final void method2867(int arg0) {
        if (arg0 == -1 || !class120.method807(-8810, arg0)) {
            return;
        }
        class150[] var1 = class494.field6988[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class150 var3 = var1[var2];
            if (var3.field2004 != null) {
                class389 var4 = new class389();
                var4.field5457 = var3;
                var4.field5466 = var3.field2004;
                method2865(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method2868(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7000.setTime(new Date(var1));
        int var3 = field7000.get(5);
        int var4 = field7000.get(2);
        int var5 = field7000.get(1);
        return var3 + "-" + field7018[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
    private static final void method2869(int arg0) {
        class150 var1 = client.method1276(116, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class150[] var3 = class88.field1105[var2];
        if (var3 == null) {
            class150[] var4 = class494.field6988[var2];
            int var5 = var4.length;
            var3 = class88.field1105[var2] = new class150[var5];
            class182.method1140(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class182.method1140(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()V")
    public static void method2870() {
        field6994 = null;
        field6998 = null;
        field7017 = null;
        field6996 = null;
        field7004 = null;
        field7002 = null;
        field7016 = null;
        field7013 = null;
        field7008 = null;
        field7001 = null;
        field7000 = null;
        field7018 = null;
        field7020 = null;
        field7021 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lvf;I)V")
    private static final void method2871(class106 arg0, int arg1) {
        field6997 = 0;
        field7014 = 0;
        int var2 = -1;
        int[] var3 = arg0.field1405;
        int[] var4 = arg0.field1407;
        byte var5 = -1;
        field7007 = 0;
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
                        method2874(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2876(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7004[field6997++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7004[field6997++] = class163.field2413.field5408[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class163.field2413.method2233((byte) -71, var8, field7004[--field6997]);
                } else if (var43 == 3) {
                    field7002[field7014++] = arg0.field1394[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6997 -= 2;
                    if (field7004[field6997 + 1] != field7004[field6997]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6997 -= 2;
                    if (field7004[field6997 + 1] == field7004[field6997]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6997 -= 2;
                    if (field7004[field6997] < field7004[field6997 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6997 -= 2;
                    if (field7004[field6997] > field7004[field6997 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7007 == 0) {
                        return;
                    }
                    class516 var9 = field7016[--field7007];
                    arg0 = var9.field7600;
                    var3 = arg0.field1405;
                    var4 = arg0.field1407;
                    var2 = var9.field7597;
                    field6994 = var9.field7599;
                    field6998 = var9.field7604;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7004[field6997++] = class163.field2413.method1638(12367, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class163.field2413.method2229(var11, true, field7004[--field6997]);
                } else if (var43 == 31) {
                    field6997 -= 2;
                    if (field7004[field6997] <= field7004[field6997 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6997 -= 2;
                    if (field7004[field6997] >= field7004[field6997 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7004[field6997++] = field6994[var4[var2]];
                } else if (var43 == 34) {
                    field6994[var4[var2]] = field7004[--field6997];
                } else if (var43 == 35) {
                    field7002[field7014++] = field6998[var4[var2]];
                } else if (var43 == 36) {
                    field6998[var4[var2]] = field7002[--field7014];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7014 -= var12;
                    String var13 = class295.method1816(-42, field7014, var12, field7002);
                    field7002[field7014++] = var13;
                } else if (var43 == 38) {
                    field6997--;
                } else if (var43 == 39) {
                    field7014--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class106 var15 = class95.method668((byte) -119, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field1410];
                    String[] var17 = new String[var15.field1399];
                    for (int var18 = 0; var18 < var15.field1395; var18++) {
                        var16[var18] = field7004[field6997 + var18 - var15.field1395];
                    }
                    for (int var19 = 0; var19 < var15.field1406; var19++) {
                        var17[var19] = field7002[field7014 + var19 - var15.field1406];
                    }
                    field6997 -= var15.field1395;
                    field7014 -= var15.field1406;
                    class516 var20 = new class516();
                    var20.field7600 = arg0;
                    var20.field7597 = var2;
                    var20.field7599 = field6994;
                    var20.field7604 = field6998;
                    if (field7007 >= field7016.length) {
                        throw new RuntimeException();
                    }
                    field7016[field7007++] = var20;
                    arg0 = var15;
                    var3 = var15.field1405;
                    var4 = var15.field1407;
                    var2 = -1;
                    field6994 = var16;
                    field6998 = var17;
                } else if (var43 == 42) {
                    field7004[field6997++] = class336.field4863[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class336.field4863[var21] = field7004[--field6997];
                    class275.method1727((byte) 96, var21);
                    class363.field5189 |= class421.field5943[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7004[--field6997];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7017[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field6996[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7004[--field6997];
                    if (var28 < 0 || var28 >= field7017[var27]) {
                        throw new RuntimeException();
                    }
                    field7004[field6997++] = field6996[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6997 -= 2;
                    int var30 = field7004[field6997];
                    if (var30 < 0 || var30 >= field7017[var29]) {
                        throw new RuntimeException();
                    }
                    field6996[var29][var30] = field7004[field6997 + 1];
                } else if (var43 == 47) {
                    String var31 = class538.field7867[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7002[field7014++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class538.field7867[var32] = field7002[--field7014];
                    class136.method855(var32, (byte) -91);
                } else if (var43 == 51) {
                    class406 var33 = arg0.field1397[var4[var2]];
                    class254 var34 = (class254) var33.method2405((long) field7004[--field6997], -79);
                    if (var34 != null) {
                        var2 += var34.field3757;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field1398 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7060).append(" ");
                for (int var41 = field7007 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7016[var41].field7600.field7060).append(" ");
                }
                var40.append("op: ").append(var5);
                class406.method2409(3896, var42, var40.toString());
            } else {
                class486.method2802("Clientscript error in: " + arg0.field1398, (byte) 45);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field1398).append("\n");
                for (int var38 = field7007 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7016[var38].field7600.field1398).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class406.method2409(3896, var42, var37.toString());
                class486.method2805(62, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
    public static final void method2872(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lvo;II)V")
    public static final void method2873(class32 arg0, int arg1, int arg2) {
        class106 var3 = class437.method2564((byte) -119, arg1, arg0, arg2);
        if (var3 == null) {
            return;
        }
        field6994 = new int[var3.field1410];
        field6998 = new String[var3.field1399];
        if (class436.field6120 == var3.field1404 || class269.field3923 == var3.field1404 || class236.field3439 == var3.field1404) {
            int var4 = 0;
            int var5 = 0;
            if (class378.field5357 != null) {
                var4 = class378.field5357.field2015;
                var5 = class378.field5357.field2058;
            }
            field6994[0] = class22.field277.method1192(true) - var4;
            field6994[1] = class22.field277.method1194(36) - var5;
        }
        method2871(var3, 200000);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IZ)V")
    private static final void method2874(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6997 -= 3;
                int var2 = field7004[field6997];
                int var3 = field7004[field6997 + 1];
                int var4 = field7004[field6997 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class150 var5 = client.method1276(80, var2);
                if (var5.field2110 == null) {
                    var5.field2110 = new class150[var4 + 1];
                }
                if (var5.field2110.length <= var4) {
                    class150[] var6 = new class150[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2110.length; var7++) {
                        var6[var7] = var5.field2110[var7];
                    }
                    var5.field2110 = var6;
                }
                if (var4 > 0 && var5.field2110[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class150 var8 = new class150();
                var8.field2022 = var3;
                var8.field2071 = var8.field2134 = var5.field2134;
                var8.field2105 = var4;
                var5.field2110[var4] = var8;
                if (arg1) {
                    field7008 = var8;
                } else {
                    field7013 = var8;
                }
                class187.method1190(var5, 109);
                return;
            }
            if (arg0 == 101) {
                class150 var9 = arg1 ? field7008 : field7013;
                if (var9.field2105 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class150 var10 = client.method1276(79, var9.field2134);
                var10.field2110[var9.field2105] = null;
                class187.method1190(var10, 100);
                return;
            }
            if (arg0 == 102) {
                class150 var11 = client.method1276(96, field7004[--field6997]);
                var11.field2110 = null;
                class187.method1190(var11, 106);
                return;
            }
            if (arg0 == 200) {
                field6997 -= 2;
                int var12 = field7004[field6997];
                int var13 = field7004[field6997 + 1];
                class150 var14 = class343.method2046(var13, 0, var12);
                if (var14 != null && var13 != -1) {
                    field7004[field6997++] = 1;
                    if (arg1) {
                        field7008 = var14;
                        return;
                    }
                    field7013 = var14;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7004[--field6997];
                class150 var16 = client.method1276(89, var15);
                if (var16 != null) {
                    field7004[field6997++] = 1;
                    if (arg1) {
                        field7008 = var16;
                        return;
                    }
                    field7013 = var16;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7004[--field6997];
                method2877(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7004[--field6997];
                method2869(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6997 -= 2;
                int var19 = field7004[field6997];
                int var20 = field7004[field6997 + 1];
                for (int var21 = 0; var21 < class539.field7886.length; var21++) {
                    if (class539.field7886[var21] == var19) {
                        class246.field3587.field288.method1134(class539.field7885, var20, var21, 9604);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class75.field965.length; var22++) {
                    if (class75.field965[var22] == var19) {
                        class246.field3587.field288.method1134(class539.field7885, var20, var22, 9604);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6997 -= 2;
                int var23 = field7004[field6997];
                int var24 = field7004[field6997 + 1];
                class246.field3587.field288.method1126(var24, 22242, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7004[--field6997] != 0;
                class246.field3587.field288.method1129(-598237024, var25);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class150 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = client.method1276(120, field7004[--field6997]);
            } else {
                var26 = arg1 ? field7008 : field7013;
            }
            if (arg0 == 1000) {
                field6997 -= 4;
                var26.field2045 = field7004[field6997];
                var26.field1989 = field7004[field6997 + 1];
                int var27 = field7004[field6997 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field7004[field6997 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field1994 = (byte) var27;
                var26.field2073 = (byte) var28;
                class187.method1190(var26, 124);
                class482.method2780(var26, (byte) 37);
                if (var26.field2105 == -1) {
                    class364.method2152(var26.field2134, (byte) -125);
                }
                return;
            }
            if (arg0 == 1001) {
                field6997 -= 4;
                var26.field2086 = field7004[field6997];
                var26.field2102 = field7004[field6997 + 1];
                var26.field2027 = 0;
                var26.field2054 = 0;
                int var29 = field7004[field6997 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field7004[field6997 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2136 = (byte) var29;
                var26.field2087 = (byte) var30;
                class187.method1190(var26, 120);
                class482.method2780(var26, (byte) 95);
                if (var26.field2022 == 0) {
                    class509.method3040(false, (byte) 73, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field7004[--field6997] == 1;
                if (var26.field2125 != var31) {
                    var26.field2125 = var31;
                    class187.method1190(var26, 101);
                }
                if (var26.field2105 == -1) {
                    class267.method1687(-108, var26.field2134);
                }
                return;
            }
            if (arg0 == 1004) {
                field6997 -= 2;
                var26.field2144 = field7004[field6997];
                var26.field2097 = field7004[field6997 + 1];
                class187.method1190(var26, 116);
                class482.method2780(var26, (byte) 41);
                if (var26.field2022 == 0) {
                    class509.method3040(false, (byte) 73, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2057 = field7004[--field6997] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class150 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = client.method1276(125, field7004[--field6997]);
            } else {
                var32 = arg1 ? field7008 : field7013;
            }
            if (arg0 == 1100) {
                field6997 -= 2;
                var32.field2141 = field7004[field6997];
                if (var32.field2141 > var32.field2049 - var32.field2113) {
                    var32.field2141 = var32.field2049 - var32.field2113;
                }
                if (var32.field2141 < 0) {
                    var32.field2141 = 0;
                }
                var32.field2111 = field7004[field6997 + 1];
                if (var32.field2111 > var32.field2019 - var32.field2033) {
                    var32.field2111 = var32.field2019 - var32.field2033;
                }
                if (var32.field2111 < 0) {
                    var32.field2111 = 0;
                }
                class187.method1190(var32, 96);
                if (var32.field2105 == -1) {
                    class100.method698(0, var32.field2134);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field1992 = field7004[--field6997];
                class187.method1190(var32, 105);
                if (var32.field2105 == -1) {
                    class522.method3085(var32.field2134, 0);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2074 = field7004[--field6997] == 1;
                class187.method1190(var32, 96);
                return;
            }
            if (arg0 == 1103) {
                var32.field2129 = field7004[--field6997];
                class187.method1190(var32, 121);
                return;
            }
            if (arg0 == 1104) {
                var32.field2091 = field7004[--field6997];
                class187.method1190(var32, 116);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field7004[--field6997];
                if (var32.field2130 != var33) {
                    var32.field2130 = var33;
                    class187.method1190(var32, 108);
                }
                if (var32.field2105 == -1) {
                    class187.method1189(103, var32.field2134);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field2099 = field7004[--field6997];
                class187.method1190(var32, 120);
                return;
            }
            if (arg0 == 1107) {
                var32.field2034 = field7004[--field6997] == 1;
                class187.method1190(var32, 107);
                return;
            }
            if (arg0 == 1108) {
                var32.field2053 = 1;
                var32.field2018 = field7004[--field6997];
                class187.method1190(var32, 127);
                if (var32.field2105 == -1) {
                    class344.method2051((byte) 92, var32.field2134);
                }
                return;
            }
            if (arg0 == 1109) {
                field6997 -= 6;
                var32.field2042 = field7004[field6997];
                var32.field2082 = field7004[field6997 + 1];
                var32.field2023 = field7004[field6997 + 2];
                var32.field2133 = field7004[field6997 + 3];
                var32.field2108 = field7004[field6997 + 4];
                var32.field2011 = field7004[field6997 + 5];
                class187.method1190(var32, 124);
                if (var32.field2105 == -1) {
                    class525.method3098((byte) -71, var32.field2134);
                    class525.method3105((byte) 121, var32.field2134);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field7004[--field6997];
                if (var32.field2112 != var34) {
                    var32.field2112 = var34;
                    var32.field2009 = 0;
                    var32.field2140 = 1;
                    var32.field2060 = 0;
                    class187.method1190(var32, 107);
                }
                if (var32.field2105 == -1) {
                    class1.method14(var32.field2134, 12);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2065 = field7004[--field6997] == 1;
                class187.method1190(var32, 100);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field7002[--field7014];
                if (!var35.equals(var32.field2150)) {
                    var32.field2150 = var35;
                    class187.method1190(var32, 110);
                }
                if (var32.field2105 == -1) {
                    class217.method1349(var32.field2134, 3);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field2147 = field7004[--field6997];
                class187.method1190(var32, 116);
                if (var32.field2105 == -1) {
                    class242.method1526(var32.field2134, -18436);
                }
                return;
            }
            if (arg0 == 1114) {
                field6997 -= 3;
                var32.field2132 = field7004[field6997];
                var32.field2148 = field7004[field6997 + 1];
                var32.field2013 = field7004[field6997 + 2];
                class187.method1190(var32, 114);
                return;
            }
            if (arg0 == 1115) {
                var32.field1999 = field7004[--field6997] == 1;
                class187.method1190(var32, 118);
                return;
            }
            if (arg0 == 1116) {
                var32.field2109 = field7004[--field6997];
                class187.method1190(var32, 122);
                return;
            }
            if (arg0 == 1117) {
                var32.field2103 = field7004[--field6997];
                class187.method1190(var32, 110);
                return;
            }
            if (arg0 == 1118) {
                var32.field2117 = field7004[--field6997] == 1;
                class187.method1190(var32, 119);
                return;
            }
            if (arg0 == 1119) {
                var32.field2005 = field7004[--field6997] == 1;
                class187.method1190(var32, 119);
                return;
            }
            if (arg0 == 1120) {
                field6997 -= 2;
                var32.field2049 = field7004[field6997];
                var32.field2019 = field7004[field6997 + 1];
                class187.method1190(var32, 120);
                if (var32.field2022 == 0) {
                    class509.method3040(false, (byte) 73, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field6997 -= 2;
                var32.field2031 = (short) field7004[field6997];
                var32.field2092 = (short) field7004[field6997 + 1];
                class187.method1190(var32, 121);
                return;
            }
            if (arg0 == 1122) {
                var32.field2008 = field7004[--field6997] == 1;
                class187.method1190(var32, 107);
                return;
            }
            if (arg0 == 1123) {
                var32.field2011 = field7004[--field6997];
                class187.method1190(var32, 96);
                if (var32.field2105 == -1) {
                    class525.method3098((byte) -71, var32.field2134);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field7004[--field6997];
                var32.field2127 = var36 == 1;
                class187.method1190(var32, 116);
                return;
            }
            if (arg0 == 1125) {
                field6997 -= 2;
                var32.field2079 = field7004[field6997];
                var32.field2047 = field7004[field6997 + 1];
                class187.method1190(var32, 105);
                return;
            }
            if (arg0 == 1126) {
                var32.field2056 = field7004[--field6997];
                class187.method1190(var32, 97);
                return;
            }
            if (arg0 == 1127) {
                field6997 -= 2;
                int var37 = field7004[field6997];
                int var38 = field7004[field6997 + 1];
                class412 var39 = class454.field6365.method1995(12, var37);
                if (var39.field5823 != var38) {
                    var32.method937(16735, var37, var38);
                    return;
                }
                var32.method940(2282, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field7004[--field6997];
                String var41 = field7002[--field7014];
                class412 var42 = class454.field6365.method1995(12, var40);
                if (!var42.field5821.equals(var41)) {
                    var32.method945(var40, 16, var41);
                    return;
                }
                var32.method940(2282, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class150 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = client.method1276(108, field7004[--field6997]);
            } else {
                var43 = arg1 ? field7008 : field7013;
            }
            class187.method1190(var43, 97);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6997 -= 2;
                int var44 = field7004[field6997];
                int var45 = field7004[field6997 + 1];
                if (var43.field2105 == -1) {
                    class177.method1101(var43.field2134, 9);
                    class525.method3098((byte) -71, var43.field2134);
                    class525.method3105((byte) 121, var43.field2134);
                }
                if (var44 == -1) {
                    var43.field2053 = 1;
                    var43.field2018 = -1;
                    var43.field2089 = -1;
                    return;
                }
                var43.field2089 = var44;
                var43.field1995 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2067 = true;
                } else {
                    var43.field2067 = false;
                }
                class395 var46 = class344.field5000.method993(var44, true);
                var43.field2023 = var46.field5543;
                var43.field2133 = var46.field5570;
                var43.field2108 = var46.field5606;
                var43.field2042 = var46.field5591;
                var43.field2082 = var46.field5601;
                var43.field2011 = var46.field5563;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field1996 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field1996 = 1;
                } else {
                    var43.field1996 = 2;
                }
                if (var43.field2027 > 0) {
                    var43.field2011 = var43.field2011 * 32 / var43.field2027;
                    return;
                }
                if (var43.field2086 > 0) {
                    var43.field2011 = var43.field2011 * 32 / var43.field2086;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2053 = 2;
                var43.field2018 = field7004[--field6997];
                if (var43.field2105 == -1) {
                    class344.method2051((byte) -26, var43.field2134);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2053 = 3;
                var43.field2018 = -1;
                if (var43.field2105 == -1) {
                    class344.method2051((byte) -56, var43.field2134);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2053 = 6;
                var43.field2018 = field7004[--field6997];
                if (var43.field2105 == -1) {
                    class344.method2051((byte) 122, var43.field2134);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2053 = 5;
                var43.field2018 = field7004[--field6997];
                if (var43.field2105 == -1) {
                    class344.method2051((byte) 89, var43.field2134);
                }
                return;
            }
            if (arg0 == 1206) {
                field6997 -= 4;
                var43.field2090 = field7004[field6997];
                var43.field2104 = field7004[field6997 + 1];
                var43.field2046 = field7004[field6997 + 2];
                var43.field2139 = field7004[field6997 + 3];
                class187.method1190(var43, 100);
                return;
            }
            if (arg0 == 1207) {
                field6997 -= 2;
                var43.field2044 = field7004[field6997];
                var43.field2010 = field7004[field6997 + 1];
                class187.method1190(var43, 119);
                return;
            }
            if (arg0 == 1210) {
                field6997 -= 4;
                var43.field2018 = field7004[field6997];
                var43.field2120 = field7004[field6997 + 1];
                if (field7004[field6997 + 2] == 1) {
                    var43.field2053 = 9;
                } else {
                    var43.field2053 = 8;
                }
                if (field7004[field6997 + 3] == 1) {
                    var43.field2067 = true;
                } else {
                    var43.field2067 = false;
                }
                if (var43.field2105 == -1) {
                    class344.method2051((byte) -94, var43.field2134);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2053 = 5;
                var43.field2018 = class343.field4982;
                var43.field2120 = 0;
                if (var43.field2105 == -1) {
                    class344.method2051((byte) 115, var43.field2134);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class150 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = client.method1276(127, field7004[--field6997]);
                } else {
                    var58 = arg1 ? field7008 : field7013;
                }
                String var59 = field7002[--field7014];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field7004[--field6997];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field7004[--field6997];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field7002[--field7014];
                    } else {
                        var62[var63] = Integer.valueOf(field7004[--field6997]);
                    }
                }
                int var64 = field7004[--field6997];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field2052 = var62;
                } else if (arg0 == 1401) {
                    var58.field2106 = var62;
                } else if (arg0 == 1402) {
                    var58.field2000 = var62;
                } else if (arg0 == 1403) {
                    var58.field2100 = var62;
                } else if (arg0 == 1404) {
                    var58.field2126 = var62;
                } else if (arg0 == 1405) {
                    var58.field2021 = var62;
                } else if (arg0 == 1406) {
                    var58.field2076 = var62;
                } else if (arg0 == 1407) {
                    var58.field2122 = var62;
                    var58.field2149 = var60;
                } else if (arg0 == 1408) {
                    var58.field1991 = var62;
                } else if (arg0 == 1409) {
                    var58.field2039 = var62;
                } else if (arg0 == 1410) {
                    var58.field2012 = var62;
                } else if (arg0 == 1411) {
                    var58.field2146 = var62;
                } else if (arg0 == 1412) {
                    var58.field2114 = var62;
                } else if (arg0 == 1414) {
                    var58.field2116 = var62;
                    var58.field2059 = var60;
                } else if (arg0 == 1415) {
                    var58.field2143 = var62;
                    var58.field2051 = var60;
                } else if (arg0 == 1416) {
                    var58.field2016 = var62;
                } else if (arg0 == 1417) {
                    var58.field2138 = var62;
                } else if (arg0 == 1418) {
                    var58.field2037 = var62;
                } else if (arg0 == 1419) {
                    var58.field1997 = var62;
                } else if (arg0 == 1420) {
                    var58.field2002 = var62;
                } else if (arg0 == 1421) {
                    var58.field2088 = var62;
                } else if (arg0 == 1422) {
                    var58.field2123 = var62;
                } else if (arg0 == 1423) {
                    var58.field2063 = var62;
                } else if (arg0 == 1424) {
                    var58.field2050 = var62;
                } else if (arg0 == 1425) {
                    var58.field2014 = var62;
                } else if (arg0 == 1426) {
                    var58.field2121 = var62;
                } else if (arg0 == 1427) {
                    var58.field2077 = var62;
                } else if (arg0 == 1428) {
                    var58.field2055 = var62;
                    var58.field2078 = var60;
                } else if (arg0 == 1429) {
                    var58.field2036 = var62;
                    var58.field2028 = var60;
                } else if (arg0 == 1430) {
                    var58.field2107 = var62;
                }
                var58.field2098 = true;
                return;
            }
            if (arg0 < 1600) {
                class150 var65 = arg1 ? field7008 : field7013;
                if (arg0 == 1500) {
                    field7004[field6997++] = var65.field2015;
                    return;
                }
                if (arg0 == 1501) {
                    field7004[field6997++] = var65.field2058;
                    return;
                }
                if (arg0 == 1502) {
                    field7004[field6997++] = var65.field2113;
                    return;
                }
                if (arg0 == 1503) {
                    field7004[field6997++] = var65.field2033;
                    return;
                }
                if (arg0 == 1504) {
                    field7004[field6997++] = var65.field2125 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field7004[field6997++] = var65.field2071;
                    return;
                }
                if (arg0 == 1506) {
                    class150 var66 = class146.method904(var65, 124);
                    field7004[field6997++] = var66 == null ? -1 : var66.field2134;
                    return;
                }
            } else if (arg0 < 1700) {
                class150 var67 = arg1 ? field7008 : field7013;
                if (arg0 == 1600) {
                    field7004[field6997++] = var67.field2141;
                    return;
                }
                if (arg0 == 1601) {
                    field7004[field6997++] = var67.field2111;
                    return;
                }
                if (arg0 == 1602) {
                    field7002[field7014++] = var67.field2150;
                    return;
                }
                if (arg0 == 1603) {
                    field7004[field6997++] = var67.field2049;
                    return;
                }
                if (arg0 == 1604) {
                    field7004[field6997++] = var67.field2019;
                    return;
                }
                if (arg0 == 1605) {
                    field7004[field6997++] = var67.field2011;
                    return;
                }
                if (arg0 == 1606) {
                    field7004[field6997++] = var67.field2023;
                    return;
                }
                if (arg0 == 1607) {
                    field7004[field6997++] = var67.field2108;
                    return;
                }
                if (arg0 == 1608) {
                    field7004[field6997++] = var67.field2133;
                    return;
                }
                if (arg0 == 1609) {
                    field7004[field6997++] = var67.field2129;
                    return;
                }
                if (arg0 == 1610) {
                    field7004[field6997++] = var67.field2042;
                    return;
                }
                if (arg0 == 1611) {
                    field7004[field6997++] = var67.field2082;
                    return;
                }
                if (arg0 == 1612) {
                    field7004[field6997++] = var67.field2130;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field7004[--field6997];
                    class412 var69 = class454.field6365.method1995(12, var68);
                    if (var69.method2443(115)) {
                        field7002[field7014++] = var67.method935(var68, false, var69.field5821);
                        return;
                    }
                    field7004[field6997++] = var67.method942(var68, -98, var69.field5823);
                    return;
                }
            } else if (arg0 < 1800) {
                class150 var70 = arg1 ? field7008 : field7013;
                if (arg0 == 1700) {
                    field7004[field6997++] = var70.field2089;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field2089 != -1) {
                        field7004[field6997++] = var70.field1995;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field7004[field6997++] = var70.field2105;
                    return;
                }
            } else if (arg0 < 1900) {
                class150 var71 = arg1 ? field7008 : field7013;
                if (arg0 == 1800) {
                    field7004[field6997++] = client.method1291(var71).method2886((byte) 118);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field7004[--field6997];
                    int var334 = var72 - 1;
                    if (var71.field2070 != null && var334 < var71.field2070.length && var71.field2070[var334] != null) {
                        field7002[field7014++] = var71.field2070[var334];
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field2075 == null) {
                        field7002[field7014++] = "";
                        return;
                    }
                    field7002[field7014++] = var71.field2075;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class150 var332;
                if (arg0 >= 2000) {
                    var332 = client.method1276(96, field7004[--field6997]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field7008 : field7013;
                }
                if (field7022 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field2077 == null) {
                        return;
                    }
                    class389 var333 = new class389();
                    var333.field5457 = var332;
                    var333.field5466 = var332.field2077;
                    var333.field5456 = field7022 + 1;
                    class64.field817.method2657(8492, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class150 var73 = client.method1276(107, field7004[--field6997]);
                if (arg0 == 2500) {
                    field7004[field6997++] = var73.field2015;
                    return;
                }
                if (arg0 == 2501) {
                    field7004[field6997++] = var73.field2058;
                    return;
                }
                if (arg0 == 2502) {
                    field7004[field6997++] = var73.field2113;
                    return;
                }
                if (arg0 == 2503) {
                    field7004[field6997++] = var73.field2033;
                    return;
                }
                if (arg0 == 2504) {
                    field7004[field6997++] = var73.field2125 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field7004[field6997++] = var73.field2071;
                    return;
                }
                if (arg0 == 1506) {
                    class150 var74 = class146.method904(var73, -29);
                    field7004[field6997++] = var74 == null ? -1 : var74.field2134;
                    return;
                }
            } else if (arg0 < 2700) {
                class150 var75 = client.method1276(85, field7004[--field6997]);
                if (arg0 == 2600) {
                    field7004[field6997++] = var75.field2141;
                    return;
                }
                if (arg0 == 2601) {
                    field7004[field6997++] = var75.field2111;
                    return;
                }
                if (arg0 == 2602) {
                    field7002[field7014++] = var75.field2150;
                    return;
                }
                if (arg0 == 2603) {
                    field7004[field6997++] = var75.field2049;
                    return;
                }
                if (arg0 == 2604) {
                    field7004[field6997++] = var75.field2019;
                    return;
                }
                if (arg0 == 2605) {
                    field7004[field6997++] = var75.field2011;
                    return;
                }
                if (arg0 == 2606) {
                    field7004[field6997++] = var75.field2023;
                    return;
                }
                if (arg0 == 2607) {
                    field7004[field6997++] = var75.field2108;
                    return;
                }
                if (arg0 == 2608) {
                    field7004[field6997++] = var75.field2133;
                    return;
                }
                if (arg0 == 2609) {
                    field7004[field6997++] = var75.field2129;
                    return;
                }
                if (arg0 == 2610) {
                    field7004[field6997++] = var75.field2042;
                    return;
                }
                if (arg0 == 2611) {
                    field7004[field6997++] = var75.field2082;
                    return;
                }
                if (arg0 == 2612) {
                    field7004[field6997++] = var75.field2130;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class150 var76 = client.method1276(103, field7004[--field6997]);
                    field7004[field6997++] = var76.field2089;
                    return;
                }
                if (arg0 == 2701) {
                    class150 var77 = client.method1276(118, field7004[--field6997]);
                    if (var77.field2089 != -1) {
                        field7004[field6997++] = var77.field1995;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field7004[--field6997];
                    class489 var79 = (class489) class255.field3763.method2405((long) var78, -85);
                    if (var79 != null) {
                        field7004[field6997++] = 1;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class150 var80 = client.method1276(97, field7004[--field6997]);
                    if (var80.field2110 == null) {
                        field7004[field6997++] = 0;
                        return;
                    }
                    int var81 = var80.field2110.length;
                    for (int var82 = 0; var82 < var80.field2110.length; var82++) {
                        if (var80.field2110[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field7004[field6997++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6997 -= 2;
                    int var83 = field7004[field6997];
                    int var84 = field7004[field6997 + 1];
                    class489 var85 = (class489) class255.field3763.method2405((long) var83, -89);
                    if (var85 != null && var85.field6840 == var84) {
                        field7004[field6997++] = 1;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class150 var86 = client.method1276(85, field7004[--field6997]);
                if (arg0 == 2800) {
                    field7004[field6997++] = client.method1291(var86).method2886((byte) 92);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field7004[--field6997];
                    int var335 = var87 - 1;
                    if (var86.field2070 != null && var335 < var86.field2070.length && var86.field2070[var335] != null) {
                        field7002[field7014++] = var86.field2070[var335];
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field2075 == null) {
                        field7002[field7014++] = "";
                        return;
                    }
                    field7002[field7014++] = var86.field2075;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field7002[--field7014];
                    class486.method2802(var88, (byte) 101);
                    return;
                }
                if (arg0 == 3101) {
                    field6997 -= 2;
                    class197.method1249(field7004[field6997], -124, field7004[field6997 + 1], class246.field3587);
                    return;
                }
                if (arg0 == 3103) {
                    class295.method1818(-10942, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field7002[--field7014];
                    int var90 = 0;
                    if (class165.method1047(var89, 146800640)) {
                        var90 = class387.method2244(var89, 10);
                    }
                    field7006++;
                    class61.method498(class47.field540, 1);
                    class30.field357.method2354(var90, false);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field7002[--field7014];
                    field7010++;
                    class61.method498(class165.field2424, 1);
                    class30.field357.method2376((byte) 122, var91.length() + 1);
                    class30.field357.method2377((byte) -53, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field7002[--field7014];
                    field7019++;
                    class61.method498(class133.field1751, 1);
                    class30.field357.method2376((byte) 122, var92.length() + 1);
                    class30.field357.method2377((byte) -53, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field7004[--field6997];
                    String var94 = field7002[--field7014];
                    class450.method2638(var93, var94, -105);
                    return;
                }
                if (arg0 == 3108) {
                    field6997 -= 3;
                    int var95 = field7004[field6997];
                    int var96 = field7004[field6997 + 1];
                    int var97 = field7004[field6997 + 2];
                    class150 var98 = client.method1276(123, var97);
                    class373.method2186(var96, var95, var98, (byte) -109);
                    return;
                }
                if (arg0 == 3109) {
                    field6997 -= 2;
                    int var99 = field7004[field6997];
                    int var100 = field7004[field6997 + 1];
                    class150 var101 = arg1 ? field7008 : field7013;
                    class373.method2186(var100, var99, var101, (byte) -122);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field7004[--field6997];
                    field7005++;
                    class61.method498(class23.field303, 1);
                    class30.field357.method2372(var102, -126);
                    return;
                }
                if (arg0 == 3111) {
                    field6997 -= 2;
                    int var103 = field7004[field6997];
                    int var104 = field7004[field6997 + 1];
                    class489 var105 = (class489) class255.field3763.method2405((long) var103, -107);
                    if (var105 != null) {
                        class309.method1870(var105, -26349, var105.field6840 != var104, true);
                    }
                    class371.method2177(var104, true, 19089, var103, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field6997--;
                    int var106 = field7004[field6997];
                    class489 var107 = (class489) class255.field3763.method2405((long) var106, -31);
                    if (var107 != null && var107.field6835 == 3) {
                        class309.method1870(var107, -26349, true, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class535.method3144((byte) 119, field7002[--field7014]);
                    return;
                }
                if (arg0 == 3114) {
                    field6997 -= 2;
                    int var108 = field7004[field6997];
                    int var109 = field7004[field6997 + 1];
                    String var110 = field7002[--field7014];
                    class92.method661(var110, -1, "", "", var108, var109);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6997 -= 3;
                    class464.method2695((byte) 114, field7004[field6997 + 2], field7004[field6997], field7004[field6997 + 1], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class48.method278(50, field7004[--field6997], 255, -1);
                    return;
                }
                if (arg0 == 3202) {
                    field6997 -= 2;
                    class29.method184(field7004[field6997], 255, field7004[field6997 + 1], 87);
                    return;
                }
                if (arg0 == 3203) {
                    field6997 -= 4;
                    class464.method2695((byte) 122, field7004[field6997 + 2], field7004[field6997], field7004[field6997 + 1], field7004[field6997 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field6997 -= 3;
                    class48.method278(field7004[field6997 + 2], field7004[field6997], field7004[field6997 + 1], -1);
                    return;
                }
                if (arg0 == 3205) {
                    field6997 -= 3;
                    class29.method184(field7004[field6997], field7004[field6997 + 2], field7004[field6997 + 1], -68);
                    return;
                }
                if (arg0 == 3206) {
                    field6997 -= 4;
                    class251.method1634(-692, field7004[field6997 + 1], field7004[field6997], field7004[field6997 + 3], field7004[field6997 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field7004[field6997++] = class390.field5481;
                    return;
                }
                if (arg0 == 3301) {
                    field6997 -= 2;
                    int var111 = field7004[field6997];
                    int var112 = field7004[field6997 + 1];
                    field7004[field6997++] = class220.method1363(var111, var112, 123, false);
                    return;
                }
                if (arg0 == 3302) {
                    field6997 -= 2;
                    int var113 = field7004[field6997];
                    int var114 = field7004[field6997 + 1];
                    field7004[field6997++] = class33.method196(var114, false, var113, false);
                    return;
                }
                if (arg0 == 3303) {
                    field6997 -= 2;
                    int var115 = field7004[field6997];
                    int var116 = field7004[field6997 + 1];
                    field7004[field6997++] = class296.method1821(false, -7917, var115, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field7004[--field6997];
                    field7004[field6997++] = class146.field1952.method1676(var117, 3312).field5336;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field7004[--field6997];
                    field7004[field6997++] = class324.field4725[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field7004[--field6997];
                    field7004[field6997++] = class30.field358[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field7004[--field6997];
                    field7004[field6997++] = class62.field780[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class246.field3587.field1904;
                    int var122 = (class246.field3587.field1896 >> 7) + class441.field6171;
                    int var123 = (class246.field3587.field1899 >> 7) + class367.field5241;
                    field7004[field6997++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field7004[--field6997];
                    field7004[field6997++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field7004[--field6997];
                    field7004[field6997++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field7004[--field6997];
                    field7004[field6997++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field7004[field6997++] = class192.field2735 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6997 -= 2;
                    int var127 = field7004[field6997];
                    int var128 = field7004[field6997 + 1];
                    field7004[field6997++] = class220.method1363(var127, var128, 123, true);
                    return;
                }
                if (arg0 == 3314) {
                    field6997 -= 2;
                    int var129 = field7004[field6997];
                    int var130 = field7004[field6997 + 1];
                    field7004[field6997++] = class33.method196(var130, true, var129, false);
                    return;
                }
                if (arg0 == 3315) {
                    field6997 -= 2;
                    int var131 = field7004[field6997];
                    int var132 = field7004[field6997 + 1];
                    field7004[field6997++] = class296.method1821(true, -7917, var131, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class208.field3009 >= 2) {
                        field7004[field6997++] = class208.field3009;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field7004[field6997++] = class503.field7252;
                    return;
                }
                if (arg0 == 3318) {
                    field7004[field6997++] = class426.field5989.field5885;
                    return;
                }
                if (arg0 == 3321) {
                    field7004[field6997++] = class213.field3082;
                    return;
                }
                if (arg0 == 3322) {
                    field7004[field6997++] = class6.field99;
                    return;
                }
                if (arg0 == 3323) {
                    if (class305.field4440 >= 5 && class305.field4440 <= 9) {
                        field7004[field6997++] = 1;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class305.field4440 >= 5 && class305.field4440 <= 9) {
                        field7004[field6997++] = class305.field4440;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field7004[field6997++] = class269.field3918 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field7004[field6997++] = class246.field3587.field268;
                    return;
                }
                if (arg0 == 3327) {
                    field7004[field6997++] = class246.field3587.field288.field2594 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field7004[field6997++] = class467.field6528 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field7004[--field6997];
                    field7004[field6997++] = class290.method1802(23138, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field6997 -= 2;
                    int var134 = field7004[field6997];
                    int var135 = field7004[field6997 + 1];
                    field7004[field6997++] = class459.method2677(false, var135, -1, false, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field6997 -= 2;
                    int var136 = field7004[field6997];
                    int var137 = field7004[field6997 + 1];
                    field7004[field6997++] = class459.method2677(false, var137, -1, true, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field7004[field6997++] = class170.field2476;
                    return;
                }
                if (arg0 == 3335) {
                    field7004[field6997++] = class149.field1979;
                    return;
                }
                if (arg0 == 3336) {
                    field6997 -= 4;
                    int var138 = field7004[field6997];
                    int var139 = field7004[field6997 + 1];
                    int var140 = field7004[field6997 + 2];
                    int var141 = field7004[field6997 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field7004[field6997++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field7004[field6997++] = class496.field7034;
                    return;
                }
                if (arg0 == 3338) {
                    field7004[field6997++] = class513.method3059(-65536);
                    return;
                }
                if (arg0 == 3339) {
                    field7004[field6997++] = class464.field6490 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field7004[field6997++] = class60.field745 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field7004[field6997++] = class503.field7304 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6997 -= 2;
                    int var145 = field7004[field6997];
                    int var146 = field7004[field6997 + 1];
                    class500 var147 = class472.field6579.method169(var145, 21830);
                    field7002[field7014++] = var147.method2900(15361, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field6997 -= 4;
                    int var148 = field7004[field6997];
                    int var149 = field7004[field6997 + 1];
                    int var150 = field7004[field6997 + 2];
                    int var151 = field7004[field6997 + 3];
                    class500 var152 = class472.field6579.method169(var150, 21830);
                    if (var152.field7079 == var148 && var152.field7067 == var149) {
                        if (var149 == 115) {
                            field7002[field7014++] = var152.method2900(15361, var151);
                            return;
                        }
                        field7004[field6997++] = var152.method2903(var151, false);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field6997 -= 3;
                    int var153 = field7004[field6997];
                    int var154 = field7004[field6997 + 1];
                    int var155 = field7004[field6997 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class500 var156 = class472.field6579.method169(var154, 21830);
                    if (var156.field7067 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field7004[field6997++] = var156.method2901(var155, -6) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field7004[--field6997];
                    String var158 = field7002[--field7014];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class500 var159 = class472.field6579.method169(var157, 21830);
                    if (var159.field7067 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field7004[field6997++] = var159.method2897((byte) 95, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field7004[--field6997];
                    class500 var161 = class472.field6579.method169(var160, 21830);
                    field7004[field6997++] = var161.field7070.method2406(true);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class246.field3589 == 0) {
                        field7004[field6997++] = -2;
                        return;
                    }
                    if (class246.field3589 == 1) {
                        field7004[field6997++] = -1;
                        return;
                    }
                    field7004[field6997++] = class520.field7656;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field7004[--field6997];
                    if (class246.field3589 == 2 && var162 < class520.field7656) {
                        field7002[field7014++] = class540.field7902[var162];
                        if (class474.field6600[var162] != null) {
                            field7002[field7014++] = class474.field6600[var162];
                            return;
                        }
                        field7002[field7014++] = "";
                        return;
                    }
                    field7002[field7014++] = "";
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field7004[--field6997];
                    if (class246.field3589 == 2 && var163 < class520.field7656) {
                        field7004[field6997++] = class505.field7488[var163];
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field7004[--field6997];
                    if (class246.field3589 == 2 && var164 < class520.field7656) {
                        field7004[field6997++] = class62.field775[var164];
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field7002[--field7014];
                    int var166 = field7004[--field6997];
                    class146.method917(var165, var166, true);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field7002[--field7014];
                    class183.method1145(var167, 21120);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field7002[--field7014];
                    class501.method2908(var168, 20605);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field7002[--field7014];
                    class466.method2701(false, (byte) -109, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field7002[--field7014];
                    class502.method2915(var170, (byte) -125);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field7002[--field7014];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field7004[field6997++] = class520.method3077(var171, (byte) 83) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field7004[--field6997];
                    if (class246.field3589 == 2 && var172 < class520.field7656) {
                        field7002[field7014++] = class363.field5200[var172];
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class77.field1009 != null) {
                        field7002[field7014++] = class22.method124(class77.field1009, -1);
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class77.field1009 != null) {
                        field7004[field6997++] = class305.field4435;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field7004[--field6997];
                    if (class77.field1009 != null && var173 < class305.field4435) {
                        field7002[field7014++] = class4.field80[var173].field7755;
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field7004[--field6997];
                    if (class77.field1009 != null && var174 < class305.field4435) {
                        field7004[field6997++] = class4.field80[var174].field7753;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field7004[--field6997];
                    if (class77.field1009 != null && var175 < class305.field4435) {
                        field7004[field6997++] = class4.field80[var175].field7756;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field7004[field6997++] = class360.field5146;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field7002[--field7014];
                    class406.method2411(0, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field7004[field6997++] = class338.field4879;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field7002[--field7014];
                    class376.method2194(var177, (byte) -122);
                    return;
                }
                if (arg0 == 3620) {
                    class144.method898(false);
                    return;
                }
                if (arg0 == 3621) {
                    if (class246.field3589 == 0) {
                        field7004[field6997++] = -1;
                        return;
                    }
                    field7004[field6997++] = class419.field5909;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field7004[--field6997];
                    if (class246.field3589 != 0 && var178 < class419.field5909) {
                        field7002[field7014++] = class366.field5229[var178];
                        if (class213.field3081[var178] != null) {
                            field7002[field7014++] = class213.field3081[var178];
                            return;
                        }
                        field7002[field7014++] = "";
                        return;
                    }
                    field7002[field7014++] = "";
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field7002[--field7014];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field7004[field6997++] = class167.method1051(var179, (byte) -102) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field7004[--field6997];
                    if (class4.field80 != null && var180 < class305.field4435 && class4.field80[var180].field7749.equalsIgnoreCase(class246.field3587.field256)) {
                        field7004[field6997++] = 1;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class371.field5293 != null) {
                        field7002[field7014++] = class371.field5293;
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field7004[--field6997];
                    if (class77.field1009 != null && var181 < class305.field4435) {
                        field7002[field7014++] = class4.field80[var181].field7750;
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field7004[--field6997];
                    if (class246.field3589 == 2 && var182 >= 0 && var182 < class520.field7656) {
                        field7004[field6997++] = class215.field3103[var182] ? 1 : 0;
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field7002[--field7014];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field7004[field6997++] = class134.method848(101, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field7004[field6997++] = class390.field5483;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field7002[--field7014];
                    class466.method2701(true, (byte) -94, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field7004[--field6997];
                    field7004[field6997++] = class66.field845[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field7004[--field6997];
                    if (class77.field1009 != null && var186 < class305.field4435) {
                        field7002[field7014++] = class4.field80[var186].field7749;
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field7004[--field6997];
                    if (class246.field3589 != 0 && var187 < class419.field5909) {
                        field7002[field7014++] = class388.field5452[var187];
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field7004[--field6997];
                    field7004[field6997++] = class345.field5011[var188].method502(15399);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field7004[--field6997];
                    field7004[field6997++] = class345.field5011[var189].field778;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field7004[--field6997];
                    field7004[field6997++] = class345.field5011[var190].field777;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field7004[--field6997];
                    field7004[field6997++] = class345.field5011[var191].field776;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field7004[--field6997];
                    field7004[field6997++] = class345.field5011[var192].field779;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field7004[--field6997];
                    field7004[field6997++] = class345.field5011[var193].field774;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field7004[--field6997];
                    int var195 = class345.field5011[var194].method501(1769);
                    field7004[field6997++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field7004[--field6997];
                    int var197 = class345.field5011[var196].method501(1769);
                    field7004[field6997++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field7004[--field6997];
                    int var199 = class345.field5011[var198].method501(1769);
                    field7004[field6997++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field7004[--field6997];
                    int var201 = class345.field5011[var200].method501(1769);
                    field7004[field6997++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6997 -= 2;
                    int var202 = field7004[field6997];
                    int var203 = field7004[field6997 + 1];
                    field7004[field6997++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field6997 -= 2;
                    int var204 = field7004[field6997];
                    int var205 = field7004[field6997 + 1];
                    field7004[field6997++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field6997 -= 2;
                    int var206 = field7004[field6997];
                    int var207 = field7004[field6997 + 1];
                    field7004[field6997++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field6997 -= 2;
                    int var208 = field7004[field6997];
                    int var209 = field7004[field6997 + 1];
                    field7004[field6997++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field7004[--field6997];
                    field7004[field6997++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field7004[--field6997];
                    field7004[field6997++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6997 -= 5;
                    int var212 = field7004[field6997];
                    int var213 = field7004[field6997 + 1];
                    int var214 = field7004[field6997 + 2];
                    int var215 = field7004[field6997 + 3];
                    int var216 = field7004[field6997 + 4];
                    field7004[field6997++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field6997 -= 2;
                    long var217 = (long) field7004[field6997];
                    long var219 = (long) field7004[field6997 + 1];
                    field7004[field6997++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field6997 -= 2;
                    int var221 = field7004[field6997];
                    int var222 = field7004[field6997 + 1];
                    field7004[field6997++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field6997 -= 2;
                    int var223 = field7004[field6997];
                    int var224 = field7004[field6997 + 1];
                    field7004[field6997++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6997 -= 2;
                    int var225 = field7004[field6997];
                    int var226 = field7004[field6997 + 1];
                    field7004[field6997++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6997 -= 2;
                    int var227 = field7004[field6997];
                    int var228 = field7004[field6997 + 1];
                    field7004[field6997++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field6997 -= 2;
                    int var229 = field7004[field6997];
                    int var230 = field7004[field6997 + 1];
                    if (var229 == 0) {
                        field7004[field6997++] = 0;
                        return;
                    }
                    field7004[field6997++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field6997 -= 2;
                    int var231 = field7004[field6997];
                    int var232 = field7004[field6997 + 1];
                    if (var231 == 0) {
                        field7004[field6997++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field7004[field6997++] = Integer.MAX_VALUE;
                        return;
                    }
                    field7004[field6997++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field6997 -= 2;
                    int var233 = field7004[field6997];
                    int var234 = field7004[field6997 + 1];
                    field7004[field6997++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field6997 -= 2;
                    int var235 = field7004[field6997];
                    int var236 = field7004[field6997 + 1];
                    field7004[field6997++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field6997 -= 2;
                    int var237 = field7004[field6997];
                    int var238 = field7004[field6997 + 1];
                    field7004[field6997++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field6997 -= 2;
                    int var239 = field7004[field6997];
                    int var240 = field7004[field6997 + 1];
                    field7004[field6997++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field6997 -= 3;
                    long var241 = (long) field7004[field6997];
                    long var243 = (long) field7004[field6997 + 1];
                    long var245 = (long) field7004[field6997 + 2];
                    field7004[field6997++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field7002[--field7014];
                    int var248 = field7004[--field6997];
                    field7002[field7014++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field7014 -= 2;
                    String var249 = field7002[field7014];
                    String var250 = field7002[field7014 + 1];
                    field7002[field7014++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field7002[--field7014];
                    int var252 = field7004[--field6997];
                    field7002[field7014++] = var251 + class227.method1396(0, var252, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field7002[--field7014];
                    field7002[field7014++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field7002[field7014++] = method2868(field7004[--field6997]);
                    return;
                }
                if (arg0 == 4105) {
                    field7014 -= 2;
                    String var254 = field7002[field7014];
                    String var255 = field7002[field7014 + 1];
                    if (class246.field3587.field288 != null && class246.field3587.field288.field2594) {
                        field7002[field7014++] = var255;
                        return;
                    }
                    field7002[field7014++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field7004[--field6997];
                    field7002[field7014++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field7014 -= 2;
                    field7004[field6997++] = class48.method280(-16282, class149.field1979, field7002[field7014 + 1], field7002[field7014]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field7002[--field7014];
                    field6997 -= 2;
                    int var258 = field7004[field6997];
                    int var259 = field7004[field6997 + 1];
                    class411 var260 = class275.method1731(true, 0, class478.field6666, var259);
                    field7004[field6997++] = var260.method2431(var258, var257, (byte) 14, class90.field1122);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field7002[--field7014];
                    field6997 -= 2;
                    int var262 = field7004[field6997];
                    int var263 = field7004[field6997 + 1];
                    class411 var264 = class275.method1731(true, 0, class478.field6666, var263);
                    field7004[field6997++] = var264.method2435((byte) 114, var262, var261, class90.field1122);
                    return;
                }
                if (arg0 == 4110) {
                    field7014 -= 2;
                    String var265 = field7002[field7014];
                    String var266 = field7002[field7014 + 1];
                    if (field7004[--field6997] == 1) {
                        field7002[field7014++] = var265;
                        return;
                    }
                    field7002[field7014++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field7002[--field7014];
                    field7002[field7014++] = class31.method187((byte) 98, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field7002[--field7014];
                    int var269 = field7004[--field6997];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field7002[field7014++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field7004[--field6997];
                    field7004[field6997++] = class363.method2140((char) var270, 122) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field7004[--field6997];
                    field7004[field6997++] = class64.method513(false, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field7004[--field6997];
                    field7004[field6997++] = client.method1293((char) var272, (byte) -46) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field7004[--field6997];
                    field7004[field6997++] = class477.method2749(-120, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field7002[--field7014];
                    if (var274 != null) {
                        field7004[field6997++] = var274.length();
                        return;
                    }
                    field7004[field6997++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field7002[--field7014];
                    field6997 -= 2;
                    int var276 = field7004[field6997];
                    int var277 = field7004[field6997 + 1];
                    field7002[field7014++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field7002[--field7014];
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
                    field7002[field7014++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field7002[--field7014];
                    field6997 -= 2;
                    int var284 = field7004[field6997];
                    int var285 = field7004[field6997 + 1];
                    field7004[field6997++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field7014 -= 2;
                    String var286 = field7002[field7014];
                    String var287 = field7002[field7014 + 1];
                    int var288 = field7004[--field6997];
                    field7004[field6997++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field7004[--field6997];
                    field7004[field6997++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field7004[--field6997];
                    field7004[field6997++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field7004[--field6997] != 0;
                    int var292 = field7004[--field6997];
                    field7002[field7014++] = class52.method413(false, 0, class149.field1979, var291, (long) var292);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field7002[--field7014];
                    int var294 = field7004[--field6997];
                    class411 var295 = class275.method1731(true, 0, class478.field6666, var294);
                    field7004[field6997++] = var295.method2434(true, var293, class90.field1122);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field7004[--field6997];
                    field7002[field7014++] = class344.field5000.method993(var296, true).field5587;
                    return;
                }
                if (arg0 == 4201) {
                    field6997 -= 2;
                    int var297 = field7004[field6997];
                    int var298 = field7004[field6997 + 1];
                    class395 var299 = class344.field5000.method993(var297, true);
                    if (var298 >= 1 && var298 <= 5 && var299.field5594[var298 - 1] != null) {
                        field7002[field7014++] = var299.field5594[var298 - 1];
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6997 -= 2;
                    int var300 = field7004[field6997];
                    int var301 = field7004[field6997 + 1];
                    class395 var302 = class344.field5000.method993(var300, true);
                    if (var301 >= 1 && var301 <= 5 && var302.field5592[var301 - 1] != null) {
                        field7002[field7014++] = var302.field5592[var301 - 1];
                        return;
                    }
                    field7002[field7014++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field7004[--field6997];
                    field7004[field6997++] = class344.field5000.method993(var303, true).field5555;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field7004[--field6997];
                    field7004[field6997++] = class344.field5000.method993(var304, true).field5554 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field7004[--field6997];
                    class395 var306 = class344.field5000.method993(var305, true);
                    if (var306.field5602 == -1 && var306.field5578 >= 0) {
                        field7004[field6997++] = var306.field5578;
                        return;
                    }
                    field7004[field6997++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field7004[--field6997];
                    class395 var308 = class344.field5000.method993(var307, true);
                    if (var308.field5602 >= 0 && var308.field5578 >= 0) {
                        field7004[field6997++] = var308.field5578;
                        return;
                    }
                    field7004[field6997++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field7004[--field6997];
                    field7004[field6997++] = class344.field5000.method993(var309, true).field5583 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6997 -= 2;
                    int var310 = field7004[field6997];
                    int var311 = field7004[field6997 + 1];
                    class412 var312 = class454.field6365.method1995(12, var311);
                    if (var312.method2443(115)) {
                        field7002[field7014++] = class344.field5000.method993(var310, true).method2286(var312.field5821, var311, 96);
                        return;
                    }
                    field7004[field6997++] = class344.field5000.method993(var310, true).method2285((byte) -68, var312.field5823, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field6997 -= 2;
                    int var313 = field7004[field6997];
                    int var314 = field7004[field6997 + 1] - 1;
                    class395 var315 = class344.field5000.method993(var313, true);
                    if (var315.field5544 == var314) {
                        field7004[field6997++] = var315.field5597;
                        return;
                    }
                    if (var315.field5537 == var314) {
                        field7004[field6997++] = var315.field5566;
                        return;
                    }
                    field7004[field6997++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field7002[--field7014];
                    int var317 = field7004[--field6997];
                    class48.method276((byte) 34, var316, var317 == 1);
                    field7004[field6997++] = class377.field5352;
                    return;
                }
                if (arg0 == 4211) {
                    if (class399.field5627 != null && class473.field6584 < class377.field5352) {
                        field7004[field6997++] = class399.field5627[class473.field6584++] & 0xFFFF;
                        return;
                    }
                    field7004[field6997++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class473.field6584 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6997 -= 2;
                    int var318 = field7004[field6997];
                    int var319 = field7004[field6997 + 1];
                    class412 var320 = class454.field6365.method1995(12, var319);
                    if (var320.method2443(115)) {
                        field7002[field7014++] = class106.field1400.method2580(var318, -119).method1944(-1, var320.field5821, var319);
                        return;
                    }
                    field7004[field6997++] = class106.field1400.method2580(var318, -123).method1946(var319, -28819, var320.field5823);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6997 -= 2;
                    int var321 = field7004[field6997];
                    int var322 = field7004[field6997 + 1];
                    class412 var323 = class454.field6365.method1995(12, var322);
                    if (var323.method2443(115)) {
                        field7002[field7014++] = class377.field5338.method1901(50, var321).method1712(var322, var323.field5821, (byte) 60);
                        return;
                    }
                    field7004[field6997++] = class377.field5338.method1901(50, var321).method1706(var323.field5823, (byte) -109, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6997 -= 2;
                    int var324 = field7004[field6997];
                    int var325 = field7004[field6997 + 1];
                    class412 var326 = class454.field6365.method1995(12, var325);
                    if (var326.method2443(115)) {
                        field7002[field7014++] = class473.field6588.method2764(111, var324).method1934(var325, (byte) -27, var326.field5821);
                        return;
                    }
                    field7004[field6997++] = class473.field6588.method2764(49, var324).method1935(var326.field5823, var325, true);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field7004[--field6997];
                class98 var328 = class498.field7049.method2069((byte) -9, var327);
                if (var328.field1298 != null && var328.field1298.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field1320[0];
                    for (int var331 = 1; var331 < var328.field1298.length; var331++) {
                        if (var328.field1320[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field1320[var331];
                        }
                    }
                    field7004[field6997++] = var328.field1298[var329];
                    return;
                }
                field7004[field6997++] = var328.field1280;
                return;
            }
        } else {
            class150 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = client.method1276(78, field7004[--field6997]);
            } else {
                var47 = arg1 ? field7008 : field7013;
            }
            if (arg0 == 1300) {
                int var48 = field7004[--field6997] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method936(var48, (byte) 55, field7002[--field7014]);
                    return;
                } else {
                    field7014--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field6997 -= 2;
                int var49 = field7004[field6997];
                int var50 = field7004[field6997 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2040 = null;
                    return;
                }
                var47.field2040 = class343.method2046(var50, 0, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field7004[--field6997];
                if (class212.field3064 != var51 && class92.field1179 != var51 && class214.field3090 != var51) {
                    return;
                }
                var47.field2119 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2041 = field7004[--field6997];
                return;
            }
            if (arg0 == 1304) {
                var47.field2081 = field7004[--field6997];
                return;
            }
            if (arg0 == 1305) {
                var47.field2075 = field7002[--field7014];
                return;
            }
            if (arg0 == 1306) {
                var47.field2142 = field7002[--field7014];
                return;
            }
            if (arg0 == 1307) {
                var47.field2070 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field2096 = field7004[--field6997];
                var47.field2007 = field7004[--field6997];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field7004[--field6997];
                int var53 = field7004[--field6997];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method933((byte) 103, var52, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field2038 = field7002[--field7014];
                return;
            }
            if (arg0 == 1311) {
                var47.field2069 = field7004[--field6997];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field6997 -= 3;
                    var54 = field7004[field6997] - 1;
                    var55 = field7004[field6997 + 1];
                    var56 = field7004[field6997 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6997 -= 2;
                    var54 = 10;
                    var55 = field7004[field6997];
                    var56 = field7004[field6997 + 1];
                }
                if (var47.field2001 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2001 = new byte[11];
                    var47.field2062 = new byte[11];
                    var47.field2020 = new int[11];
                }
                var47.field2001[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2003 = false;
                    for (int var57 = 0; var57 < var47.field2001.length; var57++) {
                        if (var47.field2001[var57] != 0) {
                            var47.field2003 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2003 = true;
                }
                var47.field2062[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2128 = field7004[--field6997];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2875(String arg0, int arg1) {
        if (class208.field3009 == 0 && !(!class236.field3442 || class215.field3120) || class467.field6528) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class503.field7308.method3116(0, (byte) 106))) {
            var3 = 0;
            arg0 = arg0.substring(class503.field7308.method3116(0, (byte) 117).length());
        } else if (var2.startsWith(class372.field5295.method3116(0, (byte) 98))) {
            var3 = 1;
            arg0 = arg0.substring(class372.field5295.method3116(0, (byte) 126).length());
        } else if (var2.startsWith(class514.field7588.method3116(0, (byte) 107))) {
            var3 = 2;
            arg0 = arg0.substring(class514.field7588.method3116(0, (byte) 98).length());
        } else if (var2.startsWith(class80.field1037.method3116(0, (byte) 109))) {
            var3 = 3;
            arg0 = arg0.substring(class80.field1037.method3116(0, (byte) 109).length());
        } else if (var2.startsWith(class242.field3520.method3116(0, (byte) 102))) {
            var3 = 4;
            arg0 = arg0.substring(class242.field3520.method3116(0, (byte) 96).length());
        } else if (var2.startsWith(class54.field688.method3116(0, (byte) 100))) {
            var3 = 5;
            arg0 = arg0.substring(class54.field688.method3116(0, (byte) 120).length());
        } else if (var2.startsWith(class443.field6210.method3116(0, (byte) 101))) {
            var3 = 6;
            arg0 = arg0.substring(class443.field6210.method3116(0, (byte) 125).length());
        } else if (var2.startsWith(class305.field4437.method3116(0, (byte) 127))) {
            var3 = 7;
            arg0 = arg0.substring(class305.field4437.method3116(0, (byte) 110).length());
        } else if (var2.startsWith(class74.field897.method3116(0, (byte) 99))) {
            var3 = 8;
            arg0 = arg0.substring(class74.field897.method3116(0, (byte) 109).length());
        } else if (var2.startsWith(class198.field2812.method3116(0, (byte) 116))) {
            var3 = 9;
            arg0 = arg0.substring(class198.field2812.method3116(0, (byte) 112).length());
        } else if (var2.startsWith(class340.field4924.method3116(0, (byte) 114))) {
            var3 = 10;
            arg0 = arg0.substring(class340.field4924.method3116(0, (byte) 110).length());
        } else if (var2.startsWith(class464.field6479.method3116(0, (byte) 127))) {
            var3 = 11;
            arg0 = arg0.substring(class464.field6479.method3116(0, (byte) 105).length());
        } else if (class149.field1979 != 0) {
            if (var2.startsWith(class503.field7308.method3116(class149.field1979, (byte) 101))) {
                var3 = 0;
                arg0 = arg0.substring(class503.field7308.method3116(class149.field1979, (byte) 125).length());
            } else if (var2.startsWith(class372.field5295.method3116(class149.field1979, (byte) 122))) {
                var3 = 1;
                arg0 = arg0.substring(class372.field5295.method3116(class149.field1979, (byte) 95).length());
            } else if (var2.startsWith(class514.field7588.method3116(class149.field1979, (byte) 117))) {
                var3 = 2;
                arg0 = arg0.substring(class514.field7588.method3116(class149.field1979, (byte) 111).length());
            } else if (var2.startsWith(class80.field1037.method3116(class149.field1979, (byte) 109))) {
                var3 = 3;
                arg0 = arg0.substring(class80.field1037.method3116(class149.field1979, (byte) 101).length());
            } else if (var2.startsWith(class242.field3520.method3116(class149.field1979, (byte) 102))) {
                var3 = 4;
                arg0 = arg0.substring(class242.field3520.method3116(class149.field1979, (byte) 107).length());
            } else if (var2.startsWith(class54.field688.method3116(class149.field1979, (byte) 117))) {
                var3 = 5;
                arg0 = arg0.substring(class54.field688.method3116(class149.field1979, (byte) 100).length());
            } else if (var2.startsWith(class443.field6210.method3116(class149.field1979, (byte) 109))) {
                var3 = 6;
                arg0 = arg0.substring(class443.field6210.method3116(class149.field1979, (byte) 108).length());
            } else if (var2.startsWith(class305.field4437.method3116(class149.field1979, (byte) 115))) {
                var3 = 7;
                arg0 = arg0.substring(class305.field4437.method3116(class149.field1979, (byte) 111).length());
            } else if (var2.startsWith(class74.field897.method3116(class149.field1979, (byte) 121))) {
                var3 = 8;
                arg0 = arg0.substring(class74.field897.method3116(class149.field1979, (byte) 111).length());
            } else if (var2.startsWith(class198.field2812.method3116(class149.field1979, (byte) 124))) {
                var3 = 9;
                arg0 = arg0.substring(class198.field2812.method3116(class149.field1979, (byte) 118).length());
            } else if (var2.startsWith(class340.field4924.method3116(class149.field1979, (byte) 98))) {
                var3 = 10;
                arg0 = arg0.substring(class340.field4924.method3116(class149.field1979, (byte) 122).length());
            } else if (var2.startsWith(class464.field6479.method3116(class149.field1979, (byte) 106))) {
                var3 = 11;
                arg0 = arg0.substring(class464.field6479.method3116(class149.field1979, (byte) 101).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class479.field6671.method3116(0, (byte) 119))) {
            var5 = 1;
            arg0 = arg0.substring(class479.field6671.method3116(0, (byte) 100).length());
        } else if (var4.startsWith(class413.field5845.method3116(0, (byte) 120))) {
            var5 = 2;
            arg0 = arg0.substring(class413.field5845.method3116(0, (byte) 127).length());
        } else if (var4.startsWith(class27.field325.method3116(0, (byte) 114))) {
            var5 = 3;
            arg0 = arg0.substring(class27.field325.method3116(0, (byte) 97).length());
        } else if (var4.startsWith(class344.field4997.method3116(0, (byte) 101))) {
            var5 = 4;
            arg0 = arg0.substring(class344.field4997.method3116(0, (byte) 109).length());
        } else if (var4.startsWith(class356.field5116.method3116(0, (byte) 114))) {
            var5 = 5;
            arg0 = arg0.substring(class356.field5116.method3116(0, (byte) 98).length());
        } else if (class149.field1979 != 0) {
            if (var4.startsWith(class479.field6671.method3116(class149.field1979, (byte) 124))) {
                var5 = 1;
                arg0 = arg0.substring(class479.field6671.method3116(class149.field1979, (byte) 102).length());
            } else if (var4.startsWith(class413.field5845.method3116(class149.field1979, (byte) 116))) {
                var5 = 2;
                arg0 = arg0.substring(class413.field5845.method3116(class149.field1979, (byte) 125).length());
            } else if (var4.startsWith(class27.field325.method3116(class149.field1979, (byte) 110))) {
                var5 = 3;
                arg0 = arg0.substring(class27.field325.method3116(class149.field1979, (byte) 98).length());
            } else if (var4.startsWith(class344.field4997.method3116(class149.field1979, (byte) 112))) {
                var5 = 4;
                arg0 = arg0.substring(class344.field4997.method3116(class149.field1979, (byte) 112).length());
            } else if (var4.startsWith(class356.field5116.method3116(class149.field1979, (byte) 95))) {
                var5 = 5;
                arg0 = arg0.substring(class356.field5116.method3116(class149.field1979, (byte) 127).length());
            }
        }
        field6999++;
        class61.method498(class361.field5161, 1);
        class30.field357.method2376((byte) 122, 0);
        int var6 = class30.field357.field5665;
        if (arg1 == 5021) {
            class30.field357.method2376((byte) 122, 1);
        } else if (arg1 == 5022) {
            class30.field357.method2376((byte) 122, 2);
        } else {
            class30.field357.method2376((byte) 122, 0);
        }
        class30.field357.method2376((byte) 122, var3);
        class30.field357.method2376((byte) 122, var5);
        class505.method3007(class30.field357, (byte) 31, arg0);
        class30.field357.method2349((byte) -80, class30.field357.field5665 - var6);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(IZ)V")
    private static final void method2876(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7004[field6997++] = class254.field3754;
                return;
            }
            if (arg0 == 5001) {
                field6997 -= 3;
                class254.field3754 = field7004[field6997];
                class335.field4857 = class524.method3097(12419, field7004[field6997 + 1]);
                if (class335.field4857 == null) {
                    class335.field4857 = class267.field3902;
                }
                class380.field5370 = field7004[field6997 + 2];
                field7012++;
                class61.method498(class100.field1330, 1);
                class30.field357.method2376((byte) 122, class254.field3754);
                class30.field357.method2376((byte) 122, class335.field4857.field895);
                class30.field357.method2376((byte) 122, class380.field5370);
                return;
            }
            if (arg0 == 5002) {
                field7014 -= 2;
                String var2 = field7002[field7014];
                String var3 = field7002[field7014 + 1];
                field6997 -= 2;
                int var4 = field7004[field6997];
                int var5 = field7004[field6997 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field7011++;
                class61.method498(class474.field6596, 1);
                class30.field357.method2376((byte) 122, class540.method3175(var2, 1) + class540.method3175(var3, 1) + 2);
                class30.field357.method2377((byte) -53, var2);
                class30.field357.method2376((byte) 122, var4 - 1);
                class30.field357.method2376((byte) 122, var5);
                class30.field357.method2377((byte) -53, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field7004[--field6997];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class308.field4479[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field7002[field7014++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field7004[--field6997];
                int var9 = -1;
                if (var8 < 100 && class308.field4479[var8] != null) {
                    var9 = class179.field2569[var8];
                }
                field7004[field6997++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class335.field4857 == null) {
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = class335.field4857.field895;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field7002[--field7014];
                method2875(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7014 -= 2;
                String var11 = field7002[field7014];
                String var12 = field7002[field7014 + 1];
                if (class208.field3009 != 0 || (!class236.field3442 || class215.field3120) && !class467.field6528) {
                    field6995++;
                    class61.method498(class188.field2700, 1);
                    class30.field357.method2376((byte) 122, 0);
                    int var13 = class30.field357.field5665;
                    class30.field357.method2377((byte) -53, var11);
                    class505.method3007(class30.field357, (byte) 47, var12);
                    class30.field357.method2349((byte) -102, class30.field357.field5665 - var13);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field7004[--field6997];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class254.field3759[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field7002[field7014++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field7004[--field6997];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class189.field2709[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field7002[field7014++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field7004[--field6997];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class509.field7535[var18];
                }
                field7004[field6997++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class246.field3587 == null || class246.field3587.field282 == null) {
                    var20 = class153.field2198;
                } else {
                    var20 = class246.field3587.method137(true, -20951);
                }
                field7002[field7014++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field7004[field6997++] = class380.field5370;
                return;
            }
            if (arg0 == 5017) {
                field7004[field6997++] = class341.field4943;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field7004[--field6997];
                int var22 = 0;
                if (var21 < 100 && class308.field4479[var21] != null) {
                    var22 = class268.field3917[var21];
                }
                field7004[field6997++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field7004[--field6997];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class315.field4557[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field7002[field7014++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class246.field3587 == null || class246.field3587.field282 == null) {
                    var25 = class153.field2198;
                } else {
                    var25 = class246.field3587.method132(false, false);
                }
                field7002[field7014++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field7004[--field6997];
                field7002[field7014++] = class489.field6838.method237(var26, (byte) 77).field2389;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field7004[--field6997];
                class162 var28 = class489.field6838.method237(var27, (byte) 105);
                if (var28.field2386 == null) {
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = var28.field2386.length;
                return;
            }
            if (arg0 == 5052) {
                field6997 -= 2;
                int var29 = field7004[field6997];
                int var30 = field7004[field6997 + 1];
                class162 var31 = class489.field6838.method237(var29, (byte) 113);
                int var32 = var31.field2386[var30];
                field7004[field6997++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field7004[--field6997];
                class162 var34 = class489.field6838.method237(var33, (byte) 73);
                if (var34.field2394 == null) {
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = var34.field2394.length;
                return;
            }
            if (arg0 == 5054) {
                field6997 -= 2;
                int var35 = field7004[field6997];
                int var36 = field7004[field6997 + 1];
                field7004[field6997++] = class489.field6838.method237(var35, (byte) 93).field2394[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field7004[--field6997];
                field7002[field7014++] = class186.field2679.method526(var37, 5364).method638((byte) -113);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field7004[--field6997];
                class88 var39 = class186.field2679.method526(var38, 5364);
                if (var39.field1097 == null) {
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = var39.field1097.length;
                return;
            }
            if (arg0 == 5057) {
                field6997 -= 2;
                int var40 = field7004[field6997];
                int var41 = field7004[field6997 + 1];
                field7004[field6997++] = class186.field2679.method526(var40, 5364).field1097[var41];
                return;
            }
            if (arg0 == 5058) {
                field7001 = new class393();
                field7001.field5519 = field7004[--field6997];
                field7001.field5523 = class186.field2679.method526(field7001.field5519, 5364);
                field7001.field5524 = new int[field7001.field5523.method639((byte) -121)];
                return;
            }
            if (arg0 == 5059) {
                field7003++;
                class61.method498(class275.field4074, 1);
                class30.field357.method2376((byte) 122, 0);
                int var42 = class30.field357.field5665;
                class30.field357.method2376((byte) 122, 0);
                class30.field357.method2372(field7001.field5519, -126);
                field7001.field5523.method634(field7001.field5524, class30.field357, (byte) -123);
                class30.field357.method2349((byte) -115, class30.field357.field5665 - var42);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field7002[--field7014];
                field7015++;
                class61.method498(class318.field4599, 1);
                class30.field357.method2376((byte) 122, 0);
                int var44 = class30.field357.field5665;
                class30.field357.method2377((byte) -53, var43);
                class30.field357.method2372(field7001.field5519, -125);
                field7001.field5523.method634(field7001.field5524, class30.field357, (byte) -84);
                class30.field357.method2349((byte) -97, class30.field357.field5665 - var44);
                return;
            }
            if (arg0 == 5061) {
                field7003++;
                class61.method498(class275.field4074, 1);
                class30.field357.method2376((byte) 122, 0);
                int var45 = class30.field357.field5665;
                class30.field357.method2376((byte) 122, 1);
                class30.field357.method2372(field7001.field5519, -127);
                field7001.field5523.method634(field7001.field5524, class30.field357, (byte) -119);
                class30.field357.method2349((byte) -57, class30.field357.field5665 - var45);
                return;
            }
            if (arg0 == 5062) {
                field6997 -= 2;
                int var46 = field7004[field6997];
                int var47 = field7004[field6997 + 1];
                field7004[field6997++] = class489.field6838.method237(var46, (byte) 96).field2388[var47];
                return;
            }
            if (arg0 == 5063) {
                field6997 -= 2;
                int var48 = field7004[field6997];
                int var49 = field7004[field6997 + 1];
                field7004[field6997++] = class489.field6838.method237(var48, (byte) 123).field2399[var49];
                return;
            }
            if (arg0 == 5064) {
                field6997 -= 2;
                int var50 = field7004[field6997];
                int var51 = field7004[field6997 + 1];
                if (var51 == -1) {
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = class489.field6838.method237(var50, (byte) 67).method1036((char) var51, 0);
                return;
            }
            if (arg0 == 5065) {
                field6997 -= 2;
                int var52 = field7004[field6997];
                int var53 = field7004[field6997 + 1];
                if (var53 == -1) {
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = class489.field6838.method237(var52, (byte) 103).method1035((byte) 59, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field7004[--field6997];
                field7004[field6997++] = class186.field2679.method526(var54, 5364).method639((byte) -121);
                return;
            }
            if (arg0 == 5067) {
                field6997 -= 2;
                int var55 = field7004[field6997];
                int var56 = field7004[field6997 + 1];
                int var57 = class186.field2679.method526(var55, 5364).method637(0, var56).field4104;
                field7004[field6997++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field6997 -= 2;
                int var58 = field7004[field6997];
                int var59 = field7004[field6997 + 1];
                field7001.field5524[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field6997 -= 2;
                int var60 = field7004[field6997];
                int var61 = field7004[field6997 + 1];
                field7001.field5524[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field6997 -= 3;
                int var62 = field7004[field6997];
                int var63 = field7004[field6997 + 1];
                int var64 = field7004[field6997 + 2];
                class88 var65 = class186.field2679.method526(var62, 5364);
                if (var65.method637(0, var63).field4104 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7004[field6997++] = var65.method632(var63, (byte) -72, var64);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field7002[--field7014];
                boolean var67 = field7004[--field6997] == 1;
                class305.method1855(var67, var66, true);
                field7004[field6997++] = class377.field5352;
                return;
            }
            if (arg0 == 5072) {
                if (class399.field5627 != null && class473.field6584 < class377.field5352) {
                    field7004[field6997++] = class399.field5627[class473.field6584++] & 0xFFFF;
                    return;
                }
                field7004[field6997++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class473.field6584 = 0;
                return;
            }
            if (arg0 == 5074) {
                field7003++;
                class61.method498(class275.field4074, 1);
                class30.field357.method2376((byte) 122, 0);
                int var68 = class30.field357.field5665;
                class30.field357.method2376((byte) 122, 2);
                class30.field357.method2372(field7001.field5519, 97);
                field7001.field5523.method634(field7001.field5524, class30.field357, (byte) -105);
                class30.field357.method2349((byte) -121, class30.field357.field5665 - var68);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class345.field5009.method870(86, -115)) {
                    field7004[field6997++] = 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class345.field5009.method870(82, -113)) {
                    field7004[field6997++] = 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class345.field5009.method870(81, -114)) {
                    field7004[field6997++] = 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class154.method990(-72, field7004[--field6997]);
                return;
            }
            if (arg0 == 5201) {
                field7004[field6997++] = class393.method2277(21913);
                return;
            }
            if (arg0 == 5205) {
                class442.method2593(field7004[--field6997], false, (byte) -32, -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field7004[--field6997];
                class309 var70 = class245.method1536(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = var70.field4512;
                return;
            }
            if (arg0 == 5207) {
                class309 var71 = class245.method1540(field7004[--field6997]);
                if (var71 != null && var71.field4507 != null) {
                    field7002[field7014++] = var71.field4507;
                    return;
                }
                field7002[field7014++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7004[field6997++] = class476.field6634;
                field7004[field6997++] = class97.field1276;
                return;
            }
            if (arg0 == 5209) {
                field7004[field6997++] = class307.field4455 + class245.field3574;
                field7004[field6997++] = class421.field5935 + class245.field3586;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field7004[--field6997];
                class309 var73 = class245.method1540(var72);
                if (var73 == null) {
                    field7004[field6997++] = 0;
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = var73.field4498 >> 14 & 0x3FFF;
                field7004[field6997++] = var73.field4498 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field7004[--field6997];
                class309 var75 = class245.method1540(var74);
                if (var75 == null) {
                    field7004[field6997++] = 0;
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = var75.field4499 - var75.field4505;
                field7004[field6997++] = var75.field4508 - var75.field4500;
                return;
            }
            if (arg0 == 5212) {
                class216 var76 = class524.method3093((byte) 13);
                if (var76 == null) {
                    field7004[field6997++] = -1;
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = var76.field3126;
                int var77 = var76.field3125 << 28 | class245.field3574 + var76.field3122 << 14 | class245.field3586 + var76.field3121;
                field7004[field6997++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class216 var78 = class31.method190((byte) -110);
                if (var78 == null) {
                    field7004[field6997++] = -1;
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = var78.field3126;
                int var79 = var78.field3125 << 28 | class245.field3574 + var78.field3122 << 14 | class245.field3586 + var78.field3121;
                field7004[field6997++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field7004[--field6997];
                class309 var81 = class412.method2441(false);
                if (var81 != null) {
                    boolean var82 = var81.method1872(var80 & 0x3FFF, var80 >> 28 & 0x3, field7020, 0, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class361.method2131(field7020[1], field7020[2], 99);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6997 -= 2;
                int var83 = field7004[field6997];
                int var84 = field7004[field6997 + 1];
                class358 var85 = class245.method1537(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class309 var87 = (class309) var85.method2119(0); var87 != null; var87 = (class309) var85.method2116((byte) 44)) {
                    if (var87.field4512 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field7004[field6997++] = 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field7004[--field6997];
                class309 var89 = class245.method1540(var88);
                if (var89 == null) {
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = var89.field4502;
                return;
            }
            if (arg0 == 5220) {
                field7004[field6997++] = class433.field6100 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field7004[--field6997];
                class361.method2131(var90 >> 14 & 0x3FFF, var90 & 0x3FFF, 114);
                return;
            }
            if (arg0 == 5222) {
                class309 var91 = class412.method2441(false);
                if (var91 != null) {
                    boolean var92 = var91.method1877(class421.field5935 + class245.field3586, field7020, 2048, class307.field4455 + class245.field3574);
                    if (var92) {
                        field7004[field6997++] = field7020[1];
                        field7004[field6997++] = field7020[2];
                        return;
                    }
                    field7004[field6997++] = -1;
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = -1;
                field7004[field6997++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6997 -= 2;
                int var93 = field7004[field6997];
                int var94 = field7004[field6997 + 1];
                class442.method2593(var93, false, (byte) -35, var94 >> 14 & 0x3FFF, var94 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field7004[--field6997];
                class309 var96 = class412.method2441(false);
                if (var96 != null) {
                    boolean var97 = var96.method1872(var95 & 0x3FFF, var95 >> 28 & 0x3, field7020, 0, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field7004[field6997++] = field7020[1];
                        field7004[field6997++] = field7020[2];
                        return;
                    }
                    field7004[field6997++] = -1;
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = -1;
                field7004[field6997++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field7004[--field6997];
                class309 var99 = class412.method2441(false);
                if (var99 != null) {
                    boolean var100 = var99.method1877(var98 & 0x3FFF, field7020, 2048, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field7004[field6997++] = field7020[1];
                        field7004[field6997++] = field7020[2];
                        return;
                    }
                    field7004[field6997++] = -1;
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = -1;
                field7004[field6997++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class162.method1031(field7004[--field6997], -97);
                return;
            }
            if (arg0 == 5227) {
                field6997 -= 2;
                int var101 = field7004[field6997];
                int var102 = field7004[field6997 + 1];
                class442.method2593(var101, true, (byte) -89, var102 >> 14 & 0x3FFF, var102 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class282.field4159 = field7004[--field6997] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7004[field6997++] = class282.field4159 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field7004[--field6997];
                class85.method614(-16777216, var103);
                return;
            }
            if (arg0 == 5231) {
                field6997 -= 2;
                int var104 = field7004[field6997];
                boolean var105 = field7004[field6997 + 1] == 1;
                if (class135.field1766 != null) {
                    class498 var106 = class135.field1766.method2405((long) var104, -110);
                    if (var106 != null && !var105) {
                        var106.method2891(-126);
                        return;
                    }
                    if (var106 == null && var105) {
                        class498 var107 = new class498();
                        class135.field1766.method2413((long) var104, var107, -1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field7004[--field6997];
                if (class135.field1766 != null) {
                    class498 var109 = class135.field1766.method2405((long) var108, -65);
                    field7004[field6997++] = var109 == null ? 0 : 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6997 -= 2;
                int var110 = field7004[field6997];
                boolean var111 = field7004[field6997 + 1] == 1;
                if (class403.field5681 != null) {
                    class498 var112 = class403.field5681.method2405((long) var110, -119);
                    if (var112 != null && !var111) {
                        var112.method2891(-124);
                        return;
                    }
                    if (var112 == null && var111) {
                        class498 var113 = new class498();
                        class403.field5681.method2413((long) var110, var113, -1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field7004[--field6997];
                if (class403.field5681 != null) {
                    class498 var115 = class403.field5681.method2405((long) var114, -108);
                    field7004[field6997++] = var115 == null ? 0 : 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7004[field6997++] = class245.field3547 == null ? -1 : class245.field3547.field4512;
                return;
            }
            if (arg0 == 5236) {
                field6997 -= 2;
                int var116 = field7004[field6997];
                int var117 = field7004[field6997 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class482.method2777(var118, var119, var116, (byte) -86);
                if (var120 < 0) {
                    field7004[field6997++] = -1;
                    return;
                }
                field7004[field6997++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class368.method2172((byte) 98);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6997 -= 2;
                int var121 = field7004[field6997];
                int var122 = field7004[field6997 + 1];
                class207.method1322(var122, false, -118, var121, 3);
                field7004[field6997++] = class258.field3835 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class258.field3835 != null) {
                    class207.method1322(-1, false, -128, -1, class4.field81.field1415);
                }
                return;
            }
            if (arg0 == 5302) {
                class392[] var123 = class354.method2095(15343);
                field7004[field6997++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field7004[--field6997];
                class392[] var125 = class354.method2095(15343);
                field7004[field6997++] = var125[var124].field5509;
                field7004[field6997++] = var125[var124].field5510;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class4.field81.field1455;
                int var127 = class4.field81.field1429;
                int var128 = -1;
                class392[] var129 = class354.method2095(15343);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class392 var131 = var129[var130];
                    if (var131.field5509 == var126 && var131.field5510 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field7004[field6997++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field7004[field6997++] = class334.method1996((byte) 76);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field7004[--field6997];
                if (var132 >= 1 && var132 <= 2) {
                    class207.method1322(-1, false, -121, -1, var132);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7004[field6997++] = class4.field81.field1415;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field7004[--field6997];
                if (var133 >= 1 && var133 <= 2) {
                    class4.field81.field1415 = var133;
                    class4.field81.method1784((byte) 124, class268.field3914);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7014 -= 2;
                String var134 = field7002[field7014];
                String var135 = field7002[field7014 + 1];
                int var136 = field7004[--field6997];
                field7009++;
                class61.method498(class300.field4385, 1);
                class30.field357.method2376((byte) 122, class540.method3175(var134, 1) + class540.method3175(var135, 1) + 1);
                class30.field357.method2377((byte) -53, var134);
                class30.field357.method2377((byte) -53, var135);
                class30.field357.method2376((byte) 122, var136);
                return;
            }
            if (arg0 == 5401) {
                field6997 -= 2;
                class266.field3895[field7004[field6997]] = (short) class329.method1978(-7816, field7004[field6997 + 1]);
                class344.field5000.method997((byte) -95);
                class344.field5000.method987((byte) 85);
                class106.field1400.method2583((byte) -93);
                class385.method2235((byte) 48);
                return;
            }
            if (arg0 == 5405) {
                field6997 -= 2;
                int var137 = field7004[field6997];
                int var138 = field7004[field6997 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class355.field5087[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6997 -= 7;
                int var139 = field7004[field6997];
                int var140 = field7004[field6997 + 1] << 1;
                int var141 = field7004[field6997 + 2];
                int var142 = field7004[field6997 + 3];
                int var143 = field7004[field6997 + 4];
                int var144 = field7004[field6997 + 5];
                int var145 = field7004[field6997 + 6];
                if (var139 >= 0 && var139 < 2 && class355.field5087[var139] != null && var140 >= 0 && var140 < class355.field5087[var139].length) {
                    class355.field5087[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class355.field5087[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class355.field5087[field7004[--field6997]].length >> 1;
                field7004[field6997++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class258.field3835 != null) {
                    class207.method1322(-1, false, -100, -1, class4.field81.field1415);
                }
                if (class81.field1052 != null) {
                    class524.method3096((byte) 98);
                    System.exit(0);
                    return;
                }
                String var147 = class279.field4125 == null ? class12.method70(-20097) : class279.field4125;
                class443.method2602(class268.field3914, var147, false, 0, class405.field5737 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class507.field7500 != null) {
                    if (class507.field7500.field5274 == null) {
                        var148 = class124.method815(class507.field7500.field5275, 255);
                    } else {
                        var148 = (String) class507.field7500.field5274;
                    }
                }
                field7002[field7014++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field7004[field6997++] = class151.field2158 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class258.field3835 != null) {
                    class207.method1322(-1, false, -99, -1, class4.field81.field1415);
                }
                String var149 = field7002[--field7014];
                boolean var150 = field7004[--field6997] == 1;
                String var151 = class12.method70(-20097) + var149;
                class443.method2602(class268.field3914, var151, var150, 0, class405.field5737 == 1);
                return;
            }
            if (arg0 == 5422) {
                field7014 -= 2;
                String var152 = field7002[field7014];
                String var153 = field7002[field7014 + 1];
                int var154 = field7004[--field6997];
                if (var152.length() > 0) {
                    if (class410.field5797 == null) {
                        class410.field5797 = new String[class535.field7845[class246.field3594.field2962]];
                    }
                    class410.field5797[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class84.field1060 == null) {
                        class84.field1060 = new String[class535.field7845[class246.field3594.field2962]];
                    }
                    class84.field1060[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7002[--field7014]);
                return;
            }
            if (arg0 == 5424) {
                field6997 -= 11;
                class214.field3097 = field7004[field6997];
                class147.field1957 = field7004[field6997 + 1];
                class220.field3176 = field7004[field6997 + 2];
                class434.field6106 = field7004[field6997 + 3];
                class392.field5516 = field7004[field6997 + 4];
                class217.field3131 = field7004[field6997 + 5];
                class191.field2729 = field7004[field6997 + 6];
                class511.field7560 = field7004[field6997 + 7];
                class26.field324 = field7004[field6997 + 8];
                class198.field2817 = field7004[field6997 + 9];
                class300.field4387 = field7004[field6997 + 10];
                class61.field761.method424(0, class392.field5516);
                class61.field761.method424(0, class217.field3131);
                class61.field761.method424(0, class191.field2729);
                class61.field761.method424(0, class511.field7560);
                class61.field761.method424(0, class26.field324);
                class68.field862 = null;
                class102.field1357 = null;
                class431.field6091 = null;
                class215.field3119 = null;
                class186.field2682 = null;
                class411.field5805 = null;
                class138.field1809 = null;
                class422.field5952 = null;
                class328.field4784 = true;
                return;
            }
            if (arg0 == 5425) {
                class267.method1689(false);
                class328.field4784 = false;
                return;
            }
            if (arg0 == 5426) {
                field6997 -= 2;
                class190.field2719 = field7004[field6997];
                class71.field885 = field7004[field6997 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6997 -= 2;
                class318.field4601 = field7004[field6997 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6997 -= 2;
                int var155 = field7004[field6997];
                int var156 = field7004[field6997 + 1];
                field7004[field6997++] = class434.method2560(-1005, var155, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class521.method3081(false, (byte) -16, field7002[--field7014], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class297.method1826("accountcreated", -14648, class268.field3914.field2165);
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6997 -= 4;
                int var157 = field7004[field6997];
                int var158 = field7004[field6997 + 1];
                int var159 = field7004[field6997 + 2];
                int var160 = field7004[field6997 + 3];
                class338.method2017((var157 >> 14 & 0x3FFF) - class441.field6171, (var157 & 0x3FFF) - class367.field5241, false, var158, -20073, var159, var160);
                return;
            }
            if (arg0 == 5501) {
                field6997 -= 4;
                int var161 = field7004[field6997];
                int var162 = field7004[field6997 + 1];
                int var163 = field7004[field6997 + 2];
                int var164 = field7004[field6997 + 3];
                class415.method2460(8, (var161 & 0x3FFF) - class367.field5241, var163, var162, (var161 >> 14 & 0x3FFF) - class441.field6171, var164);
                return;
            }
            if (arg0 == 5502) {
                field6997 -= 6;
                int var165 = field7004[field6997];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class131.field1729 = var165;
                int var166 = field7004[field6997 + 1];
                if (var166 + 1 >= class355.field5087[class131.field1729].length >> 1) {
                    throw new RuntimeException();
                }
                class383.field5388 = var166;
                class216.field3123 = 0;
                class155.field2239 = field7004[field6997 + 2];
                class207.field3004 = field7004[field6997 + 3];
                int var167 = field7004[field6997 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class101.field1343 = var167;
                int var168 = field7004[field6997 + 5];
                if (var168 + 1 >= class355.field5087[class101.field1343].length >> 1) {
                    throw new RuntimeException();
                }
                class53.field675 = var168;
                class504.field7461 = 3;
                return;
            }
            if (arg0 == 5503) {
                class522.method3086((byte) 34);
                return;
            }
            if (arg0 == 5504) {
                field6997 -= 2;
                class481.method2772(field7004[field6997 + 1], 0, field7004[field6997], 3);
                return;
            }
            if (arg0 == 5505) {
                field7004[field6997++] = (int) class327.field4768 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7004[field6997++] = (int) class153.field2204 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class235.method1443((byte) 90);
                return;
            }
            if (arg0 == 5508) {
                class460.method2679((byte) 43);
                return;
            }
            if (arg0 == 5509) {
                class522.method3087(836);
                return;
            }
            if (arg0 == 5510) {
                class340.method2023((byte) -128);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field7004[--field6997];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class441.field6171;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class43.field494) {
                    var172 = class43.field494;
                }
                int var173 = var171 - class367.field5241;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class500.field7068) {
                    var173 = class500.field7068;
                }
                class360.field5147 = (var172 << 7) + 64;
                class168.field2451 = (var173 << 7) + 64;
                class504.field7461 = 4;
                return;
            }
            if (arg0 == 5512) {
                class61.method493(22991);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7014 -= 2;
                String var174 = field7002[field7014];
                String var175 = field7002[field7014 + 1];
                int var176 = field7004[--field6997];
                if (class488.field6832 != 2) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    class153.field2198 = var174;
                    class449.field6287 = var175;
                    class170.field2476 = var176;
                    class86.method623(5, (byte) -46);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class496.method2881((byte) 63);
                return;
            }
            if (arg0 == 5602) {
                if (class63.field786 == 0) {
                    class87.field1087 = -2;
                    class53.field683 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field6997 -= 4;
                if (class488.field6832 != 2) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    class468.method2718(field7004[field6997 + 2], field7004[field6997 + 3], (byte) -66, field7004[field6997 + 1], field7004[field6997]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7014--;
                if (class488.field6832 != 2) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    class103.method708(0, class85.method617(-58, field7002[field7014]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7014 -= 2;
                if (class488.field6832 != 2) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    class373.method2183((byte) -55, class85.method617(-58, field7002[field7014]), false, field7002[field7014 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class170.field2473 == 0) {
                    class319.field4622 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7004[field6997++] = class53.field683;
                return;
            }
            if (arg0 == 5608) {
                field7004[field6997++] = class384.field5400;
                return;
            }
            if (arg0 == 5609) {
                field7004[field6997++] = class319.field4622;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field7002[field7014++] = class431.field6075.length > var177 ? class22.method124(class431.field6075[var177], -1) : "";
                }
                class431.field6075 = null;
                return;
            }
            if (arg0 == 5611) {
                field7004[field6997++] = class347.field5023;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field7004[--field6997];
                if (class488.field6832 != 6) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    if (class50.field608 != null) {
                        class50.field608.method1360((byte) 51);
                        class50.field608 = null;
                    }
                    class170.field2476 = var178;
                    class86.method623(8, (byte) -74);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7004[field6997++] = class53.field683;
                return;
            }
            if (arg0 == 5615) {
                field7014 -= 2;
                String var179 = field7002[field7014];
                String var180 = field7002[field7014 + 1];
                if (class488.field6832 != 2) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    if (class50.field608 != null) {
                        class50.field608.method1360((byte) -108);
                        class50.field608 = null;
                    }
                    class153.field2198 = var179;
                    class449.field6287 = var180;
                    class86.method623(4, (byte) -122);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class287.method1771(false, -2049);
                return;
            }
            if (arg0 == 5617) {
                field7004[field6997++] = class87.field1087;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field7004[--field6997];
                class40.method221(false, var181, 112);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field7004[--field6997];
                class40.method221(true, var182, 107);
                return;
            }
            if (arg0 == 5620) {
                class124.method816(-1);
                if (class427.field6018 != "" && class427.field6018 != "") {
                    field7004[field6997++] = 1;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7014 -= 2;
                if (class488.field6832 != 2) {
                    return;
                }
                if (class63.field786 == 0 && class170.field2473 == 0) {
                    class373.method2183((byte) -55, class85.method617(-58, field7002[field7014]), true, field7002[field7014 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class370 var183 = class268.field3914.method950(false, "3", 0);
                while (var183.field5277 == 0) {
                    class52.method411(1L, (byte) 107);
                }
                if (var183.field5277 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class302 var184 = (class302) var183.field5274;
                if (var184.method1846((byte) 41).exists()) {
                    class403 var185 = new class403(50);
                    try {
                        var184.method1845((byte) -128, 0, 50, var185.field5663);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method1844((byte) 93);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field7004[--field6997];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class4.field81.field1453 = var186;
                class224.method1381((byte) -106);
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6002) {
                class4.field81.method1788(field7004[--field6997] == 1, false);
                class224.method1381((byte) -110);
                class75.method559(-102);
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6003) {
                class4.field81.field1446 = field7004[--field6997] == 1;
                class75.method559(-117);
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6005) {
                class4.field81.field1444 = field7004[--field6997] == 1;
                class224.method1381((byte) -109);
                class4.field81.method1784((byte) 127, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6006) {
                class4.field81.field1427 = field7004[--field6997] == 1;
                class385.field5414.method349(!class4.field81.field1427);
                class4.field81.method1784((byte) -72, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6007) {
                class4.field81.field1451 = field7004[--field6997];
                class4.field81.method1784((byte) 125, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6008) {
                class4.field81.field1447 = field7004[--field6997] == 1;
                class4.field81.method1784((byte) -125, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6009) {
                class4.field81.field1450 = field7004[--field6997] == 1;
                class224.method1381((byte) -25);
                class4.field81.method1784((byte) 125, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6010) {
                class4.field81.field1434 = field7004[--field6997] == 1;
                class4.field81.method1784((byte) -116, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field7004[--field6997];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class4.field81.method731(var187, 3, class405.field5737);
                class224.method1381((byte) -75);
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6012) {
                class4.field81.method727(class405.field5737, field7004[--field6997] == 1, 12938);
                class217.method1351(-78);
                class373.method2185(true);
                class4.field81.method1784((byte) -61, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6014) {
                class4.field81.field1428 = field7004[--field6997] == 1;
                class224.method1381((byte) -113);
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6015) {
                class4.field81.field1438 = field7004[--field6997] == 1;
                class224.method1381((byte) -76);
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field7004[--field6997];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class4.field81.field1413 = var188;
                class192.method1221((byte) -87, class405.field5737);
                class4.field81.method1784((byte) -60, class268.field3914);
                return;
            }
            if (arg0 == 6017) {
                class4.field81.field1433 = field7004[--field6997] == 1;
                class248.method1620(true);
                class4.field81.method1784((byte) 127, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field7004[--field6997];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class4.field81.field1423 = var189;
                class4.field81.method1784((byte) 124, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field7004[--field6997];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class4.field81.field1422 != var190) {
                    if (class4.field81.field1422 == 0 && class467.field6521 != -1) {
                        class503.method2976(var190, true, class75.field927, false, class467.field6521, 0);
                        class207.field3003 = false;
                    } else if (var190 == 0) {
                        class178.method1114(1);
                        class207.field3003 = false;
                    } else {
                        class190.method1209(true, var190);
                    }
                    class4.field81.field1422 = var190;
                }
                class4.field81.method1784((byte) -71, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field7004[--field6997];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class4.field81.field1418 = var191;
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6021) {
                class4.field81.field4220 = field7004[--field6997] == 1;
                class75.method559(-107);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field7004[--field6997];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class494.field6991 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class254.method1640(var192, 0);
                class4.field81.method1784((byte) -39, class268.field3914);
                class75.field946 = false;
                field7004[field6997++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field7004[--field6997];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class4.field81.field1426 = var194;
                class4.field81.method1784((byte) -98, class268.field3914);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field7004[--field6997];
                if (var195 < 0 || var195 > class434.method2559(class494.field6991, (byte) -119)) {
                    var195 = 0;
                }
                class4.field81.field1435 = var195;
                class4.field81.method1784((byte) 126, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field7004[--field6997];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class443.method2599((byte) -119, var196 == 1);
                return;
            }
            if (arg0 == 6028) {
                class4.field81.field1448 = field7004[--field6997] != 0;
                class4.field81.method1784((byte) -89, class268.field3914);
                return;
            }
            if (arg0 == 6029) {
                class4.field81.field1451 = field7004[--field6997];
                class4.field81.method1784((byte) 125, class268.field3914);
                return;
            }
            if (arg0 == 6030) {
                class4.field81.field1439 = field7004[--field6997] != 0;
                class4.field81.method1784((byte) 127, class268.field3914);
                class224.method1381((byte) -39);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field7004[--field6997];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class192.method1221((byte) -87, var197);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field7004[--field6997];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class4.field81.field1414 = var198;
                class4.field81.method1784((byte) 125, class268.field3914);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field7004[--field6997];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class4.field81.field1424 = var199;
                class4.field81.method1784((byte) 125, class268.field3914);
                return;
            }
            if (arg0 == 6034) {
                class4.field81.field1412 = field7004[--field6997] == 1;
                class4.field81.method1784((byte) 126, class268.field3914);
                class217.method1351(-102);
                class75.field946 = false;
                return;
            }
            if (arg0 == 6035) {
                class4.field81.field4222 = field7004[--field6997] == 1;
                class224.method1381((byte) -112);
                class75.method559(-96);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7004[field6997++] = class4.field81.field1453;
                return;
            }
            if (arg0 == 6102) {
                field7004[field6997++] = class4.field81.method1782(false, class405.field5737) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7004[field6997++] = class4.field81.field1446 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7004[field6997++] = class4.field81.field1444 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7004[field6997++] = class4.field81.field1427 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7004[field6997++] = class4.field81.field1451;
                return;
            }
            if (arg0 == 6108) {
                field7004[field6997++] = class4.field81.field1447 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7004[field6997++] = class4.field81.field1450 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7004[field6997++] = class4.field81.field1434 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7004[field6997++] = class4.field81.method726(class405.field5737, 123);
                return;
            }
            if (arg0 == 6112) {
                field7004[field6997++] = class4.field81.method728(false, class405.field5737) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7004[field6997++] = class4.field81.field1428 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7004[field6997++] = class4.field81.field1438 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7004[field6997++] = class4.field81.field1413;
                return;
            }
            if (arg0 == 6117) {
                field7004[field6997++] = class4.field81.field1433 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7004[field6997++] = class4.field81.field1423;
                return;
            }
            if (arg0 == 6119) {
                field7004[field6997++] = class4.field81.field1422;
                return;
            }
            if (arg0 == 6120) {
                field7004[field6997++] = class4.field81.field1418;
                return;
            }
            if (arg0 == 6121) {
                field7004[field6997++] = class385.field5414.method323() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7004[field6997++] = class412.method2439(true);
                return;
            }
            if (arg0 == 6124) {
                field7004[field6997++] = class4.field81.field1426;
                return;
            }
            if (arg0 == 6125) {
                field7004[field6997++] = class4.field81.field1435;
                return;
            }
            if (arg0 == 6126) {
                field7004[field6997++] = class385.field5414.method337() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7004[field6997++] = class4.field81.field1416 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7004[field6997++] = class4.field81.field1448 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7004[field6997++] = class4.field81.field1451;
                return;
            }
            if (arg0 == 6130) {
                field7004[field6997++] = class4.field81.field1439 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7004[field6997++] = class405.field5737;
                return;
            }
            if (arg0 == 6132) {
                field7004[field6997++] = class4.field81.field1414;
                return;
            }
            if (arg0 == 6133) {
                field7004[field6997++] = class151.field2158 == 1 || class151.field2158 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7004[field6997++] = class434.method2559(class494.field6991, (byte) -98);
                return;
            }
            if (arg0 == 6135) {
                field7004[field6997++] = class4.field81.field1424;
                return;
            }
            if (arg0 == 6136) {
                field7004[field6997++] = class4.field81.field1412 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field7004[field6997++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6997 -= 2;
                class242.field3523 = (short) field7004[field6997];
                if (class242.field3523 <= 0) {
                    class242.field3523 = 256;
                }
                class26.field313 = (short) field7004[field6997 + 1];
                if (class26.field313 <= 0) {
                    class26.field313 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6997 -= 2;
                class221.field3182 = (short) field7004[field6997];
                if (class221.field3182 <= 0) {
                    class221.field3182 = 256;
                }
                class105.field1391 = (short) field7004[field6997 + 1];
                if (class105.field1391 <= 0) {
                    class105.field1391 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6997 -= 4;
                class228.field3285 = (short) field7004[field6997];
                if (class228.field3285 <= 0) {
                    class228.field3285 = 1;
                }
                class189.field2703 = (short) field7004[field6997 + 1];
                if (class189.field2703 <= 0) {
                    class189.field2703 = 32767;
                } else if (class189.field2703 < class228.field3285) {
                    class189.field2703 = class228.field3285;
                }
                class140.field1835 = (short) field7004[field6997 + 2];
                if (class140.field1835 <= 0) {
                    class140.field1835 = 1;
                }
                class453.field6344 = (short) field7004[field6997 + 3];
                if (class453.field6344 <= 0) {
                    class453.field6344 = 32767;
                    return;
                }
                if (class453.field6344 < class140.field1835) {
                    class453.field6344 = class140.field1835;
                }
                return;
            }
            if (arg0 == 6203) {
                class307.method1862(class426.field5992.field2033, class426.field5992.field2113, false, false, 0, 0);
                field7004[field6997++] = class211.field3056;
                field7004[field6997++] = class325.field4748;
                return;
            }
            if (arg0 == 6204) {
                field7004[field6997++] = class221.field3182;
                field7004[field6997++] = class105.field1391;
                return;
            }
            if (arg0 == 6205) {
                field7004[field6997++] = class242.field3523;
                field7004[field6997++] = class26.field313;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7004[field6997++] = (int) (class465.method2699((byte) 14) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7004[field6997++] = (int) (class465.method2699((byte) 14) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6997 -= 3;
                int var201 = field7004[field6997];
                int var202 = field7004[field6997 + 1];
                int var203 = field7004[field6997 + 2];
                field7000.clear();
                field7000.set(11, 12);
                field7000.set(var203, var202, var201);
                int var204 = (int) (field7000.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field7004[field6997++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field7000.clear();
                field7000.setTime(new Date(class465.method2699((byte) 14)));
                field7004[field6997++] = field7000.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field7004[--field6997];
                boolean var206 = true;
                if (var205 < 0) {
                    var206 = (var205 + 1) % 4 == 0;
                } else if (var205 < 1582) {
                    var206 = var205 % 4 == 0;
                } else if (var205 % 4 != 0) {
                    var206 = false;
                } else if (var205 % 100 != 0) {
                    var206 = true;
                } else if (var205 % 400 != 0) {
                    var206 = false;
                }
                field7004[field6997++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7004[field6997++] = class371.method2176(-38) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7004[field6997++] = class60.method488(-36) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class488.field6832 == 6 && class63.field786 == 0 && class170.field2473 == 0) {
                    if (class2.field57) {
                        field7004[field6997++] = 0;
                        return;
                    }
                    if (class40.field441 > class465.method2699((byte) 14) - 1000L) {
                        field7004[field6997++] = 1;
                        return;
                    }
                    class2.field57 = true;
                    class61.method498(class391.field5499, 1);
                    class30.field357.method2354(class28.field341, false);
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class135 var207 = class90.method647(68);
                if (var207 != null) {
                    field7004[field6997++] = var207.field1770;
                    field7004[field6997++] = var207.field3426;
                    field7002[field7014++] = var207.field1765;
                    class520 var208 = var207.method854(8);
                    field7004[field6997++] = var208.field7655;
                    field7002[field7014++] = var208.field7649;
                    field7004[field6997++] = var207.field3417;
                    field7004[field6997++] = var207.field1767;
                    field7002[field7014++] = var207.field1764;
                    return;
                }
                field7004[field6997++] = -1;
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                field7004[field6997++] = 0;
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                return;
            }
            if (arg0 == 6502) {
                class135 var209 = class107.method725(126);
                if (var209 != null) {
                    field7004[field6997++] = var209.field1770;
                    field7004[field6997++] = var209.field3426;
                    field7002[field7014++] = var209.field1765;
                    class520 var210 = var209.method854(8);
                    field7004[field6997++] = var210.field7655;
                    field7002[field7014++] = var210.field7649;
                    field7004[field6997++] = var209.field3417;
                    field7004[field6997++] = var209.field1767;
                    field7002[field7014++] = var209.field1764;
                    return;
                }
                field7004[field6997++] = -1;
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                field7004[field6997++] = 0;
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field7004[--field6997];
                String var212 = field7002[--field7014];
                if (class488.field6832 == 6 && class63.field786 == 0 && class170.field2473 == 0) {
                    field7004[field6997++] = class231.method1429(var211, (byte) -117, var212) ? 1 : 0;
                    return;
                }
                field7004[field6997++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class4.field81.field1430 = field7004[--field6997];
                class4.field81.method1784((byte) 124, class268.field3914);
                return;
            }
            if (arg0 == 6505) {
                field7004[field6997++] = class4.field81.field1430;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field7004[--field6997];
                class135 var214 = class167.method1050(-83, var213);
                if (var214 != null) {
                    field7004[field6997++] = var214.field3426;
                    field7002[field7014++] = var214.field1765;
                    class520 var215 = var214.method854(8);
                    field7004[field6997++] = var215.field7655;
                    field7002[field7014++] = var215.field7649;
                    field7004[field6997++] = var214.field3417;
                    field7004[field6997++] = var214.field1767;
                    field7002[field7014++] = var214.field1764;
                    return;
                }
                field7004[field6997++] = -1;
                field7002[field7014++] = "";
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                field7004[field6997++] = 0;
                field7004[field6997++] = 0;
                field7002[field7014++] = "";
                return;
            }
            if (arg0 == 6507) {
                field6997 -= 4;
                int var216 = field7004[field6997];
                boolean var217 = field7004[field6997 + 1] == 1;
                int var218 = field7004[field6997 + 2];
                boolean var219 = field7004[field6997 + 3] == 1;
                class540.method3178(var216, var217, var219, (byte) -80, var218);
                return;
            }
            if (arg0 == 6508) {
                class87.method627(-108);
                return;
            }
            if (arg0 == 6509) {
                if (class488.field6832 != 6) {
                    return;
                }
                class409.field5788 = field7004[--field6997] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class4.field81.field1437 = field7004[--field6997] == 1;
                class4.field81.method1784((byte) 124, class268.field3914);
                return;
            }
            if (arg0 == 6601) {
                field7004[field6997++] = class4.field81.field1437 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class437.field6135 == class174.field2519) {
            if (arg0 == 6700) {
                int var220 = class255.field3763.method2406(true);
                if (class472.field6578 != -1) {
                    var220++;
                }
                field7004[field6997++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field7004[--field6997];
                if (class472.field6578 != -1) {
                    if (var221 == 0) {
                        field7004[field6997++] = class472.field6578;
                        return;
                    }
                    var221--;
                }
                class489 var222 = (class489) class255.field3763.method2414((byte) -127);
                while (var221-- > 0) {
                    var222 = (class489) class255.field3763.method2410((byte) 103);
                }
                field7004[field6997++] = var222.field6840;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field7004[--field6997];
                if (class494.field6988[var223] == null) {
                    field7002[field7014++] = "";
                    return;
                }
                String var224 = class494.field6988[var223][0].field2083;
                if (var224 == null) {
                    field7002[field7014++] = "";
                    return;
                }
                field7002[field7014++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field7004[--field6997];
                if (class494.field6988[var225] == null) {
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = class494.field6988[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field6997 -= 2;
                int var226 = field7004[field6997];
                int var227 = field7004[field6997 + 1];
                if (class494.field6988[var226] == null) {
                    field7002[field7014++] = "";
                    return;
                }
                String var228 = class494.field6988[var226][var227].field2083;
                if (var228 == null) {
                    field7002[field7014++] = "";
                    return;
                }
                field7002[field7014++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field6997 -= 2;
                int var229 = field7004[field6997];
                int var230 = field7004[field6997 + 1];
                if (class494.field6988[var229] == null) {
                    field7004[field6997++] = 0;
                    return;
                }
                field7004[field6997++] = class494.field6988[var229][var230].field2131;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field6997 -= 3;
                int var231 = field7004[field6997];
                int var232 = field7004[field6997 + 1];
                int var233 = field7004[field6997 + 2];
                class98.method692(true, "", 1, var231 << 16 | var232, var233);
                return;
            }
            if (arg0 == 6708) {
                field6997 -= 3;
                int var234 = field7004[field6997];
                int var235 = field7004[field6997 + 1];
                int var236 = field7004[field6997 + 2];
                class98.method692(true, "", 2, var234 << 16 | var235, var236);
                return;
            }
            if (arg0 == 6709) {
                field6997 -= 3;
                int var237 = field7004[field6997];
                int var238 = field7004[field6997 + 1];
                int var239 = field7004[field6997 + 2];
                class98.method692(true, "", 3, var237 << 16 | var238, var239);
                return;
            }
            if (arg0 == 6710) {
                field6997 -= 3;
                int var240 = field7004[field6997];
                int var241 = field7004[field6997 + 1];
                int var242 = field7004[field6997 + 2];
                class98.method692(true, "", 4, var240 << 16 | var241, var242);
                return;
            }
            if (arg0 == 6711) {
                field6997 -= 3;
                int var243 = field7004[field6997];
                int var244 = field7004[field6997 + 1];
                int var245 = field7004[field6997 + 2];
                class98.method692(true, "", 5, var243 << 16 | var244, var245);
                return;
            }
            if (arg0 == 6712) {
                field6997 -= 3;
                int var246 = field7004[field6997];
                int var247 = field7004[field6997 + 1];
                int var248 = field7004[field6997 + 2];
                class98.method692(true, "", 6, var246 << 16 | var247, var248);
                return;
            }
            if (arg0 == 6713) {
                field6997 -= 3;
                int var249 = field7004[field6997];
                int var250 = field7004[field6997 + 1];
                int var251 = field7004[field6997 + 2];
                class98.method692(true, "", 7, var249 << 16 | var250, var251);
                return;
            }
            if (arg0 == 6714) {
                field6997 -= 3;
                int var252 = field7004[field6997];
                int var253 = field7004[field6997 + 1];
                int var254 = field7004[field6997 + 2];
                class98.method692(true, "", 8, var252 << 16 | var253, var254);
                return;
            }
            if (arg0 == 6715) {
                field6997 -= 3;
                int var255 = field7004[field6997];
                int var256 = field7004[field6997 + 1];
                int var257 = field7004[field6997 + 2];
                class98.method692(true, "", 9, var255 << 16 | var256, var257);
                return;
            }
            if (arg0 == 6716) {
                field6997 -= 3;
                int var258 = field7004[field6997];
                int var259 = field7004[field6997 + 1];
                int var260 = field7004[field6997 + 2];
                class98.method692(true, "", 10, var258 << 16 | var259, var260);
                return;
            }
            if (arg0 == 6717) {
                field6997 -= 3;
                int var261 = field7004[field6997];
                int var262 = field7004[field6997 + 1];
                int var263 = field7004[field6997 + 2];
                class150 var264 = class343.method2046(var263, 0, var261 << 16 | var262);
                class235.method1439(-125);
                class496 var265 = client.method1291(var264);
                class225.method1387(var264, var265.field7026, var265.method2886((byte) -88), 34165);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field7004[--field6997];
                class156 var267 = class69.field876.method1316((byte) -68, var266);
                if (var267.field2308 == null) {
                    field7002[field7014++] = "";
                    return;
                }
                field7002[field7014++] = var267.field2308;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field7004[--field6997];
                class156 var269 = class69.field876.method1316((byte) -68, var268);
                field7004[field6997++] = var269.field2334;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field7004[--field6997];
                class156 var271 = class69.field876.method1316((byte) -68, var270);
                field7004[field6997++] = var271.field2343;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field7004[--field6997];
                class156 var273 = class69.field876.method1316((byte) -68, var272);
                field7004[field6997++] = var273.field2332;
                return;
            }
            if (arg0 == 6804) {
                field6997 -= 2;
                int var274 = field7004[field6997];
                int var275 = field7004[field6997 + 1];
                class412 var276 = class454.field6365.method1995(12, var275);
                if (var276.method2443(115)) {
                    field7002[field7014++] = class69.field876.method1316((byte) -68, var274).method1003(var276.field5821, var275, 3873);
                    return;
                }
                field7004[field6997++] = class69.field876.method1316((byte) -68, var274).method1009(var275, var276.field5823, 41);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field7004[field6997++] = class236.field3442 && !class215.field3120 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field7004[field6997++] = class100.field1335;
                return;
            }
            if (arg0 == 6902) {
                field7004[field6997++] = class242.field3521;
                return;
            }
            if (arg0 == 6903) {
                field7004[field6997++] = class275.field4089;
                return;
            }
            if (arg0 == 6904) {
                field7004[field6997++] = class63.field789;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class507.field7500 != null) {
                    if (class507.field7500.field5274 == null) {
                        var277 = class124.method815(class507.field7500.field5275, 255);
                    } else {
                        var277 = (String) class507.field7500.field5274;
                    }
                }
                field7002[field7014++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field7004[field6997++] = class248.field3716;
                return;
            }
            if (arg0 == 6907) {
                field7004[field6997++] = class196.field2781;
                return;
            }
            if (arg0 == 6908) {
                field7004[field6997++] = class255.field3764;
                return;
            }
            if (arg0 == 6909) {
                field7004[field6997++] = class316.field4590 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field7004[field6997++] = class486.field6784;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
    private static final void method2877(int arg0) {
        class150 var1 = client.method1276(74, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class150[] var3 = class88.field1105[var2];
        if (var3 == null) {
            class150[] var4 = class494.field6988[var2];
            int var5 = var4.length;
            var3 = class88.field1105[var2] = new class150[var5];
            class182.method1140(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class182.method1140(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()V")
    public static final void method2878() {
    }
}
