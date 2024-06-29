import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class97 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lji;")
    private static class567[] field1349 = new class567[50];

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
    private static int[] field1351 = new int[5];

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[Ljava/lang/String;")
    private static String[] field1354 = new String[1000];

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private static int field1364 = 0;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    private static int field1358 = 0;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    private static int field1366 = 0;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "[I")
    private static int[] field1361 = new int[1000];

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "[[I")
    private static int[][] field1356 = new int[5][5000];

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1365 = Calendar.getInstance();

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field1370 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[I")
    private static int[] field1372 = new int[3];

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "Llga;")
    public static class663 field1371 = new class663(4);

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    private static int field1373 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ldv;")
    private static class611 field1345;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Lin;")
    private static class78 field1353;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Lin;")
    private static class78 field1368;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    private static int[] field1348;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field1362;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Len;II)V", line = 4)
    public static final void method701(class290 arg0, int arg1, int arg2) {
        class25 var3 = class598.method3375(arg1, arg2, arg0, 389873232);
        if (var3 == null) {
            return;
        }
        field1348 = new int[var3.field310];
        field1362 = new String[var3.field316];
        if (class266.field3609 == var3.field311 || class426.field5966 == var3.field311 || class16.field163 == var3.field311) {
            int var4 = 0;
            int var5 = 0;
            if (class289.field3960 != null) {
                var4 = class289.field3960.field1078;
                var5 = class289.field3960.field1081;
            }
            field1348[0] = class214.field2991.method1499(8) - var4;
            field1348[1] = class214.field2991.method1491((byte) 106) - var5;
        }
        method707(var3, 200000);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()V", line = 28)
    public static final void method702() {
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 36)
    private static final void method703(int arg0) {
        class78 var1 = class582.method3319((byte) -48, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class78[] var3 = class165.field2412[var2];
        if (var3 == null) {
            class78[] var4 = class167.field2439[var2];
            int var5 = var4.length;
            var3 = class165.field2412[var2] = new class78[var5];
            class359.method2052(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class359.method2052(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 72)
    public static final void method704(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 93)
    public static final void method705(int arg0) {
        if (arg0 == -1 || !client.method1683(arg0, (byte) 103)) {
            return;
        }
        class78[] var1 = class167.field2439[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class78 var3 = var1[var2];
            if (var3.field1144 != null) {
                class368 var4 = new class368();
                var4.field4957 = var3;
                var4.field4962 = var3.field1144;
                method706(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lga;I)V", line = 125)
    private static final void method706(class368 arg0, int arg1) {
        Object[] var2 = arg0.field4962;
        int var3 = (Integer) var2[0];
        class25 var4 = class75.method586(var3, 127);
        if (var4 == null) {
            return;
        }
        field1348 = new int[var4.field310];
        int var5 = 0;
        field1362 = new String[var4.field316];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4961;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4954;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4957 == null ? -1 : arg0.field4957.field1129;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4960;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4957 == null ? -1 : arg0.field4957.field1034;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4952 == null ? -1 : arg0.field4952.field1129;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4952 == null ? -1 : arg0.field4952.field1034;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4953;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4959;
                }
                field1348[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4955;
                }
                field1362[var6++] = var9;
            }
        }
        field1373 = arg0.field4956;
        method707(var4, arg1);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lir;I)V", line = 203)
    private static final void method707(class25 arg0, int arg1) {
        field1364 = 0;
        field1358 = 0;
        int var2 = -1;
        int[] var3 = arg0.field308;
        int[] var4 = arg0.field306;
        byte var5 = -1;
        field1366 = 0;
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
                        method711(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method712(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1361[field1364++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1361[field1364++] = class578.field8156.field1671[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class578.field8156.method865((byte) -123, field1361[--field1364], var8);
                } else if (var43 == 3) {
                    field1354[field1358++] = arg0.field312[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field1364 -= 2;
                    if (field1361[field1364 + 1] != field1361[field1364]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field1364 -= 2;
                    if (field1361[field1364 + 1] == field1361[field1364]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field1364 -= 2;
                    if (field1361[field1364] < field1361[field1364 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field1364 -= 2;
                    if (field1361[field1364] > field1361[field1364 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field1366 == 0) {
                        return;
                    }
                    class567 var9 = field1349[--field1366];
                    arg0 = var9.field7995;
                    var3 = arg0.field308;
                    var4 = arg0.field306;
                    var2 = var9.field7996;
                    field1348 = var9.field8001;
                    field1362 = var9.field7999;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1361[field1364++] = class578.field8156.method870((byte) 116, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class578.field8156.method868((byte) 98, field1361[--field1364], var11);
                } else if (var43 == 31) {
                    field1364 -= 2;
                    if (field1361[field1364] <= field1361[field1364 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field1364 -= 2;
                    if (field1361[field1364] >= field1361[field1364 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1361[field1364++] = field1348[var4[var2]];
                } else if (var43 == 34) {
                    field1348[var4[var2]] = field1361[--field1364];
                } else if (var43 == 35) {
                    field1354[field1358++] = field1362[var4[var2]];
                } else if (var43 == 36) {
                    field1362[var4[var2]] = field1354[--field1358];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field1358 -= var12;
                    String var13 = class233.method1470(field1358, 64, field1354, var12);
                    field1354[field1358++] = var13;
                } else if (var43 == 38) {
                    field1364--;
                } else if (var43 == 39) {
                    field1358--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class25 var15 = class75.method586(var14, -123);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field310];
                    String[] var17 = new String[var15.field316];
                    for (int var18 = 0; var18 < var15.field307; var18++) {
                        var16[var18] = field1361[field1364 + var18 - var15.field307];
                    }
                    for (int var19 = 0; var19 < var15.field313; var19++) {
                        var17[var19] = field1354[field1358 + var19 - var15.field313];
                    }
                    field1364 -= var15.field307;
                    field1358 -= var15.field313;
                    class567 var20 = new class567();
                    var20.field7995 = arg0;
                    var20.field7996 = var2;
                    var20.field8001 = field1348;
                    var20.field7999 = field1362;
                    if (field1366 >= field1349.length) {
                        throw new RuntimeException();
                    }
                    field1349[field1366++] = var20;
                    arg0 = var15;
                    var3 = var15.field308;
                    var4 = var15.field306;
                    var2 = -1;
                    field1348 = var16;
                    field1362 = var17;
                } else if (var43 == 42) {
                    field1361[field1364++] = class324.field4421[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class324.field4421[var21] = field1361[--field1364];
                    class688.method3879((byte) -106, var21);
                    class9.field90 |= class588.field8266[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1361[--field1364];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1351[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1356[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1361[--field1364];
                    if (var28 < 0 || var28 >= field1351[var27]) {
                        throw new RuntimeException();
                    }
                    field1361[field1364++] = field1356[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field1364 -= 2;
                    int var30 = field1361[field1364];
                    if (var30 < 0 || var30 >= field1351[var29]) {
                        throw new RuntimeException();
                    }
                    field1356[var29][var30] = field1361[field1364 + 1];
                } else if (var43 == 47) {
                    String var31 = class675.field9526[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field1354[field1358++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class675.field9526[var32] = field1354[--field1358];
                    class506.method2893(-10919, var32);
                } else if (var43 == 51) {
                    class139 var33 = arg0.field318[var4[var2]];
                    class72 var34 = (class72) var33.method970((byte) 89, (long) field1361[--field1364]);
                    if (var34 != null) {
                        var2 += var34.field956;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field314 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field5623).append(" ");
                for (int var41 = field1366 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1349[var41].field7995.field5623).append(" ");
                }
                var40.append("op: ").append(var5);
                class413.method2400(var40.toString(), var42, (byte) -68);
            } else {
                class114.method819((byte) -75, 4, "Clientscript error in: " + arg0.field314);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field314).append("\n");
                for (int var38 = field1366 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1349[var38].field7995.field314).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class413.method2400(var37.toString(), var42, (byte) -117);
                class26.method251(var37.toString(), (byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lga;)V", line = 638)
    public static final void method708(class368 arg0) {
        method706(arg0, 200000);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 645)
    private static final void method709(int arg0) {
        class78 var1 = class582.method3319((byte) -112, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class78[] var3 = class165.field2412[var2];
        if (var3 == null) {
            class78[] var4 = class167.field2439[var2];
            int var5 = var4.length;
            var3 = class165.field2412[var2] = new class78[var5];
            class359.method2052(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class359.method2052(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 692)
    public static void method710() {
        field1348 = null;
        field1362 = null;
        field1351 = null;
        field1356 = null;
        field1361 = null;
        field1354 = null;
        field1349 = null;
        field1368 = null;
        field1353 = null;
        field1345 = null;
        field1365 = null;
        field1370 = null;
        field1372 = null;
        field1371 = null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(IZ)V", line = 719)
    private static final void method711(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field1364 -= 3;
                int var2 = field1361[field1364];
                int var3 = field1361[field1364 + 1];
                int var4 = field1361[field1364 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class78 var5 = class582.method3319((byte) -78, var2);
                if (var5.field1046 == null) {
                    var5.field1046 = new class78[var4 + 1];
                }
                if (var5.field1046.length <= var4) {
                    class78[] var6 = new class78[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1046.length; var7++) {
                        var6[var7] = var5.field1046[var7];
                    }
                    var5.field1046 = var6;
                }
                if (var4 > 0 && var5.field1046[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class78 var8 = new class78();
                var8.field1075 = var3;
                var8.field1178 = var8.field1129 = var5.field1129;
                var8.field1034 = var4;
                var5.field1046[var4] = var8;
                if (arg1) {
                    field1353 = var8;
                } else {
                    field1368 = var8;
                }
                class26.method255(var5, -20229);
                return;
            }
            if (arg0 == 101) {
                class78 var9 = arg1 ? field1353 : field1368;
                if (var9.field1034 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class78 var10 = class582.method3319((byte) -80, var9.field1129);
                var10.field1046[var9.field1034] = null;
                class26.method255(var10, -20229);
                return;
            }
            if (arg0 == 102) {
                class78 var11 = class582.method3319((byte) -71, field1361[--field1364]);
                var11.field1046 = null;
                class26.method255(var11, -20229);
                return;
            }
            if (arg0 == 200) {
                field1364 -= 2;
                int var12 = field1361[field1364];
                int var13 = field1361[field1364 + 1];
                class78 var14 = class89.method650(124, var12, var13);
                if (var14 != null && var13 != -1) {
                    field1361[field1364++] = 1;
                    if (arg1) {
                        field1353 = var14;
                        return;
                    }
                    field1368 = var14;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1361[--field1364];
                class78 var16 = class582.method3319((byte) -97, var15);
                if (var16 != null) {
                    field1361[field1364++] = 1;
                    if (arg1) {
                        field1353 = var16;
                        return;
                    }
                    field1368 = var16;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1361[--field1364];
                method709(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1361[--field1364];
                method703(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1364 -= 2;
                int var19 = field1361[field1364];
                int var20 = field1361[field1364 + 1];
                for (int var21 = 0; var21 < class209.field2943.length; var21++) {
                    if (class209.field2943[var21] == var19) {
                        class143.field2063.field9689.method2999(21345, class85.field1251, var20, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class633.field8766.length; var22++) {
                    if (class633.field8766[var22] == var19) {
                        class143.field2063.field9689.method2999(21345, class85.field1251, var20, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1364 -= 2;
                int var23 = field1361[field1364];
                int var24 = field1361[field1364 + 1];
                class143.field2063.field9689.method3006(var24, var23, 117);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1361[--field1364] != 0;
                class143.field2063.field9689.method3003(-1186089456, var25);
                return;
            }
            if (arg0 == 411) {
                field1364 -= 2;
                int var26 = field1361[field1364];
                int var27 = field1361[field1364 + 1];
                class143.field2063.field9689.method3009((byte) 33, var27, var26, class599.field8366);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class78 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class582.method3319((byte) -82, field1361[--field1364]);
            } else {
                var28 = arg1 ? field1353 : field1368;
            }
            if (arg0 == 1000) {
                field1364 -= 4;
                var28.field1018 = field1361[field1364];
                var28.field1135 = field1361[field1364 + 1];
                int var29 = field1361[field1364 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field1361[field1364 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field1029 = (byte) var29;
                var28.field1169 = (byte) var30;
                class26.method255(var28, -20229);
                class688.method3880(12304, var28);
                if (var28.field1034 == -1) {
                    class83.method635(var28.field1129, (byte) -10);
                }
                return;
            }
            if (arg0 == 1001) {
                field1364 -= 4;
                var28.field1085 = field1361[field1364];
                var28.field1093 = field1361[field1364 + 1];
                var28.field1039 = 0;
                var28.field1184 = 0;
                int var31 = field1361[field1364 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field1361[field1364 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field1138 = (byte) var31;
                var28.field1019 = (byte) var32;
                class26.method255(var28, -20229);
                class688.method3880(12304, var28);
                if (var28.field1075 == 0) {
                    class543.method3063(var28, (byte) 95, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field1361[--field1364] == 1;
                if (var28.field1059 != var33) {
                    var28.field1059 = var33;
                    class26.method255(var28, -20229);
                }
                if (var28.field1034 == -1) {
                    class599.method3380(var28.field1129, (byte) -117);
                }
                return;
            }
            if (arg0 == 1004) {
                field1364 -= 2;
                var28.field1024 = field1361[field1364];
                var28.field1174 = field1361[field1364 + 1];
                class26.method255(var28, -20229);
                class688.method3880(12304, var28);
                if (var28.field1075 == 0) {
                    class543.method3063(var28, (byte) 127, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field1147 = field1361[--field1364] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class78 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class582.method3319((byte) -29, field1361[--field1364]);
            } else {
                var34 = arg1 ? field1353 : field1368;
            }
            if (arg0 == 1100) {
                field1364 -= 2;
                var34.field1158 = field1361[field1364];
                if (var34.field1158 > var34.field1106 - var34.field1104) {
                    var34.field1158 = var34.field1106 - var34.field1104;
                }
                if (var34.field1158 < 0) {
                    var34.field1158 = 0;
                }
                var34.field1170 = field1361[field1364 + 1];
                if (var34.field1170 > var34.field1128 - var34.field1050) {
                    var34.field1170 = var34.field1128 - var34.field1050;
                }
                if (var34.field1170 < 0) {
                    var34.field1170 = 0;
                }
                class26.method255(var34, -20229);
                if (var34.field1034 == -1) {
                    class507.method2896(-88, var34.field1129);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field1180 = field1361[--field1364];
                class26.method255(var34, -20229);
                if (var34.field1034 == -1) {
                    class519.method2961(var34.field1129, (byte) 59);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field1098 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1103) {
                var34.field1102 = field1361[--field1364];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1104) {
                var34.field1061 = field1361[--field1364];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field1361[--field1364];
                if (var34.field1136 != var35) {
                    var34.field1136 = var35;
                    class26.method255(var34, -20229);
                }
                if (var34.field1034 == -1) {
                    class222.method1405(14, var34.field1129);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field1152 = field1361[--field1364];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1107) {
                var34.field1181 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1108) {
                var34.field1084 = 1;
                var34.field1114 = field1361[--field1364];
                class26.method255(var34, -20229);
                if (var34.field1034 == -1) {
                    class108.method781(var34.field1129, (byte) -107);
                }
                return;
            }
            if (arg0 == 1109) {
                field1364 -= 6;
                var34.field1160 = field1361[field1364];
                var34.field1016 = field1361[field1364 + 1];
                var34.field1097 = field1361[field1364 + 2];
                var34.field1163 = field1361[field1364 + 3];
                var34.field1092 = field1361[field1364 + 4];
                var34.field1155 = field1361[field1364 + 5];
                class26.method255(var34, -20229);
                if (var34.field1034 == -1) {
                    class422.method2443(-7, var34.field1129);
                    class686.method3875(false, var34.field1129);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field1361[--field1364];
                if (var34.field1028 != var36) {
                    var34.field1028 = var36;
                    var34.field1037 = 0;
                    var34.field1045 = 1;
                    var34.field1176 = 0;
                    class403 var37 = var34.field1028 == -1 ? null : class192.field2727.method3090(-116, var34.field1028);
                    if (var37 != null) {
                        class623.method3463(var37, var34.field1037, (byte) 36);
                    }
                    class26.method255(var34, -20229);
                }
                if (var34.field1034 == -1) {
                    class406.method2361(var34.field1129, 5);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field1053 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field1354[--field1358];
                if (!var38.equals(var34.field1083)) {
                    var34.field1083 = var38;
                    class26.method255(var34, -20229);
                }
                if (var34.field1034 == -1) {
                    class570.method3268(var34.field1129, (byte) 51);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field1033 = field1361[--field1364];
                class26.method255(var34, -20229);
                if (var34.field1034 == -1) {
                    class322.method1932(var34.field1129, 472256856);
                }
                return;
            }
            if (arg0 == 1114) {
                field1364 -= 3;
                var34.field1038 = field1361[field1364];
                var34.field1142 = field1361[field1364 + 1];
                var34.field1168 = field1361[field1364 + 2];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1115) {
                var34.field1054 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1116) {
                var34.field1076 = field1361[--field1364];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1117) {
                var34.field1154 = field1361[--field1364];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1118) {
                var34.field1048 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1119) {
                var34.field1151 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1120) {
                field1364 -= 2;
                var34.field1106 = field1361[field1364];
                var34.field1128 = field1361[field1364 + 1];
                class26.method255(var34, -20229);
                if (var34.field1075 == 0) {
                    class543.method3063(var34, (byte) 116, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field1141 = field1361[--field1364] == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1123) {
                var34.field1155 = field1361[--field1364];
                class26.method255(var34, -20229);
                if (var34.field1034 == -1) {
                    class422.method2443(-7, var34.field1129);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field1361[--field1364];
                var34.field1137 = var39 == 1;
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1125) {
                field1364 -= 2;
                var34.field1021 = field1361[field1364];
                var34.field1020 = field1361[field1364 + 1];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1126) {
                var34.field1120 = field1361[--field1364];
                class26.method255(var34, -20229);
                return;
            }
            if (arg0 == 1127) {
                field1364 -= 2;
                int var40 = field1361[field1364];
                int var41 = field1361[field1364 + 1];
                class488 var42 = class71.field952.method1977((byte) 58, var40);
                if (var42.field6697 != var41) {
                    var34.method609(var41, var40, -102);
                    return;
                }
                var34.method598(var40, -1);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field1361[--field1364];
                String var44 = field1354[--field1358];
                class488 var45 = class71.field952.method1977((byte) 58, var43);
                if (!var45.field6701.equals(var44)) {
                    var34.method603(var43, var44, 109);
                    return;
                }
                var34.method598(var43, -1);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class78 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class582.method3319((byte) -107, field1361[--field1364]);
            } else {
                var46 = arg1 ? field1353 : field1368;
            }
            class26.method255(var46, -20229);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1364 -= 2;
                int var47 = field1361[field1364];
                int var48 = field1361[field1364 + 1];
                if (var46.field1034 == -1) {
                    class344.method2007(65536, var46.field1129);
                    class422.method2443(-7, var46.field1129);
                    class686.method3875(false, var46.field1129);
                }
                if (var47 == -1) {
                    var46.field1084 = 1;
                    var46.field1114 = -1;
                    var46.field1145 = -1;
                    return;
                }
                var46.field1145 = var47;
                var46.field1095 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field1113 = true;
                } else {
                    var46.field1113 = false;
                }
                class661 var49 = class599.field8366.method3949(0, var47);
                var46.field1097 = var49.field9235;
                var46.field1163 = var49.field9260;
                var46.field1092 = var49.field9250;
                var46.field1160 = var49.field9263;
                var46.field1016 = var49.field9226;
                var46.field1155 = var49.field9192;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field1052 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field1052 = 1;
                } else {
                    var46.field1052 = 2;
                }
                if (var46.field1039 > 0) {
                    var46.field1155 = var46.field1155 * 32 / var46.field1039;
                    return;
                }
                if (var46.field1085 > 0) {
                    var46.field1155 = var46.field1155 * 32 / var46.field1085;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field1084 = 2;
                var46.field1114 = field1361[--field1364];
                if (var46.field1034 == -1) {
                    class108.method781(var46.field1129, (byte) -107);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field1084 = 3;
                var46.field1114 = -1;
                if (var46.field1034 == -1) {
                    class108.method781(var46.field1129, (byte) -107);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field1084 = 6;
                var46.field1114 = field1361[--field1364];
                if (var46.field1034 == -1) {
                    class108.method781(var46.field1129, (byte) -107);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field1084 = 5;
                var46.field1114 = field1361[--field1364];
                if (var46.field1034 == -1) {
                    class108.method781(var46.field1129, (byte) -107);
                }
                return;
            }
            if (arg0 == 1206) {
                field1364 -= 4;
                var46.field1099 = field1361[field1364];
                var46.field1077 = field1361[field1364 + 1];
                var46.field1122 = field1361[field1364 + 2];
                var46.field1069 = field1361[field1364 + 3];
                class26.method255(var46, -20229);
                return;
            }
            if (arg0 == 1207) {
                field1364 -= 2;
                var46.field1055 = field1361[field1364];
                var46.field1126 = field1361[field1364 + 1];
                class26.method255(var46, -20229);
                return;
            }
            if (arg0 == 1210) {
                field1364 -= 4;
                var46.field1114 = field1361[field1364];
                var46.field1127 = field1361[field1364 + 1];
                if (field1361[field1364 + 2] == 1) {
                    var46.field1084 = 9;
                } else {
                    var46.field1084 = 8;
                }
                if (field1361[field1364 + 3] == 1) {
                    var46.field1113 = true;
                } else {
                    var46.field1113 = false;
                }
                if (var46.field1034 == -1) {
                    class108.method781(var46.field1129, (byte) -107);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field1084 = 5;
                var46.field1114 = class409.field5813;
                var46.field1127 = 0;
                if (var46.field1034 == -1) {
                    class108.method781(var46.field1129, (byte) -107);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class78 var61;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var61 = class582.method3319((byte) -26, field1361[--field1364]);
                } else {
                    var61 = arg1 ? field1353 : field1368;
                }
                if (arg0 == 1499) {
                    var61.method611(-26724);
                    return;
                }
                String var62 = field1354[--field1358];
                int[] var63 = null;
                if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                    int var64 = field1361[--field1364];
                    if (var64 > 0) {
                        var63 = new int[var64];
                        while (var64-- > 0) {
                            var63[var64] = field1361[--field1364];
                        }
                    }
                    var62 = var62.substring(0, var62.length() - 1);
                }
                Object[] var65 = new Object[var62.length() + 1];
                for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                    if (var62.charAt(var66 - 1) == 's') {
                        var65[var66] = field1354[--field1358];
                    } else {
                        var65[var66] = Integer.valueOf(field1361[--field1364]);
                    }
                }
                int var67 = field1361[--field1364];
                if (var67 == -1) {
                    var65 = null;
                } else {
                    var65[0] = Integer.valueOf(var67);
                }
                if (arg0 == 1400) {
                    var61.field1058 = var65;
                } else if (arg0 == 1401) {
                    var61.field1156 = var65;
                } else if (arg0 == 1402) {
                    var61.field1171 = var65;
                } else if (arg0 == 1403) {
                    var61.field1134 = var65;
                } else if (arg0 == 1404) {
                    var61.field1146 = var65;
                } else if (arg0 == 1405) {
                    var61.field1153 = var65;
                } else if (arg0 == 1406) {
                    var61.field1064 = var65;
                } else if (arg0 == 1407) {
                    var61.field1133 = var65;
                    var61.field1088 = var63;
                } else if (arg0 == 1408) {
                    var61.field1139 = var65;
                } else if (arg0 == 1409) {
                    var61.field1079 = var65;
                } else if (arg0 == 1410) {
                    var61.field1056 = var65;
                } else if (arg0 == 1411) {
                    var61.field1115 = var65;
                } else if (arg0 == 1412) {
                    var61.field1162 = var65;
                } else if (arg0 == 1414) {
                    var61.field1035 = var65;
                    var61.field1073 = var63;
                } else if (arg0 == 1415) {
                    var61.field1072 = var65;
                    var61.field1096 = var63;
                } else if (arg0 == 1416) {
                    var61.field1062 = var65;
                } else if (arg0 == 1417) {
                    var61.field1043 = var65;
                } else if (arg0 == 1418) {
                    var61.field1026 = var65;
                } else if (arg0 == 1419) {
                    var61.field1022 = var65;
                } else if (arg0 == 1420) {
                    var61.field1165 = var65;
                } else if (arg0 == 1421) {
                    var61.field1150 = var65;
                } else if (arg0 == 1422) {
                    var61.field1112 = var65;
                } else if (arg0 == 1423) {
                    var61.field1089 = var65;
                } else if (arg0 == 1424) {
                    var61.field1030 = var65;
                } else if (arg0 == 1425) {
                    var61.field1103 = var65;
                } else if (arg0 == 1426) {
                    var61.field1125 = var65;
                } else if (arg0 == 1427) {
                    var61.field1082 = var65;
                } else if (arg0 == 1428) {
                    var61.field1159 = var65;
                    var61.field1027 = var63;
                } else if (arg0 == 1429) {
                    var61.field1107 = var65;
                    var61.field1066 = var63;
                } else if (arg0 == 1430) {
                    var61.field1070 = var65;
                }
                var61.field1091 = true;
                return;
            }
            if (arg0 < 1600) {
                class78 var68 = arg1 ? field1353 : field1368;
                if (arg0 == 1500) {
                    field1361[field1364++] = var68.field1078;
                    return;
                }
                if (arg0 == 1501) {
                    field1361[field1364++] = var68.field1081;
                    return;
                }
                if (arg0 == 1502) {
                    field1361[field1364++] = var68.field1104;
                    return;
                }
                if (arg0 == 1503) {
                    field1361[field1364++] = var68.field1050;
                    return;
                }
                if (arg0 == 1504) {
                    field1361[field1364++] = var68.field1059 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1361[field1364++] = var68.field1178;
                    return;
                }
                if (arg0 == 1506) {
                    class78 var69 = class474.method2673((byte) -64, var68);
                    field1361[field1364++] = var69 == null ? -1 : var69.field1129;
                    return;
                }
            } else if (arg0 < 1700) {
                class78 var70 = arg1 ? field1353 : field1368;
                if (arg0 == 1600) {
                    field1361[field1364++] = var70.field1158;
                    return;
                }
                if (arg0 == 1601) {
                    field1361[field1364++] = var70.field1170;
                    return;
                }
                if (arg0 == 1602) {
                    field1354[field1358++] = var70.field1083;
                    return;
                }
                if (arg0 == 1603) {
                    field1361[field1364++] = var70.field1106;
                    return;
                }
                if (arg0 == 1604) {
                    field1361[field1364++] = var70.field1128;
                    return;
                }
                if (arg0 == 1605) {
                    field1361[field1364++] = var70.field1155;
                    return;
                }
                if (arg0 == 1606) {
                    field1361[field1364++] = var70.field1097;
                    return;
                }
                if (arg0 == 1607) {
                    field1361[field1364++] = var70.field1092;
                    return;
                }
                if (arg0 == 1608) {
                    field1361[field1364++] = var70.field1163;
                    return;
                }
                if (arg0 == 1609) {
                    field1361[field1364++] = var70.field1102;
                    return;
                }
                if (arg0 == 1610) {
                    field1361[field1364++] = var70.field1160;
                    return;
                }
                if (arg0 == 1611) {
                    field1361[field1364++] = var70.field1016;
                    return;
                }
                if (arg0 == 1612) {
                    field1361[field1364++] = var70.field1136;
                    return;
                }
                if (arg0 == 1613) {
                    int var71 = field1361[--field1364];
                    class488 var72 = class71.field952.method1977((byte) 58, var71);
                    if (var72.method2772(122)) {
                        field1354[field1358++] = var70.method600((byte) 97, var71, var72.field6701);
                        return;
                    }
                    field1361[field1364++] = var70.method610(var71, -21048, var72.field6697);
                    return;
                }
                if (arg0 == 1614) {
                    field1361[field1364++] = var70.field1152;
                    return;
                }
                if (arg0 == 2614) {
                    field1361[field1364++] = var70.field1084 == 1 ? var70.field1114 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class78 var73 = arg1 ? field1353 : field1368;
                if (arg0 == 1700) {
                    field1361[field1364++] = var73.field1145;
                    return;
                }
                if (arg0 == 1701) {
                    if (var73.field1145 != -1) {
                        field1361[field1364++] = var73.field1095;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1361[field1364++] = var73.field1034;
                    return;
                }
            } else if (arg0 < 1900) {
                class78 var74 = arg1 ? field1353 : field1368;
                if (arg0 == 1800) {
                    field1361[field1364++] = client.method1679(var74).method1849((byte) 66);
                    return;
                }
                if (arg0 == 1801) {
                    int var75 = field1361[--field1364];
                    int var356 = var75 - 1;
                    if (var74.field1175 != null && var356 < var74.field1175.length && var74.field1175[var356] != null) {
                        field1354[field1358++] = var74.field1175[var356];
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var74.field1101 == null) {
                        field1354[field1358++] = "";
                        return;
                    }
                    field1354[field1358++] = var74.field1101;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class78 var354;
                if (arg0 >= 2000) {
                    var354 = class582.method3319((byte) -17, field1361[--field1364]);
                    arg0 -= 1000;
                } else {
                    var354 = arg1 ? field1353 : field1368;
                }
                if (field1373 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var354.field1082 == null) {
                        return;
                    }
                    class368 var355 = new class368();
                    var355.field4957 = var354;
                    var355.field4962 = var354.field1082;
                    var355.field4956 = field1373 + 1;
                    class69.field940.method1441(var355, 0);
                    return;
                }
            } else if (arg0 < 2600) {
                class78 var76 = class582.method3319((byte) -52, field1361[--field1364]);
                if (arg0 == 2500) {
                    field1361[field1364++] = var76.field1078;
                    return;
                }
                if (arg0 == 2501) {
                    field1361[field1364++] = var76.field1081;
                    return;
                }
                if (arg0 == 2502) {
                    field1361[field1364++] = var76.field1104;
                    return;
                }
                if (arg0 == 2503) {
                    field1361[field1364++] = var76.field1050;
                    return;
                }
                if (arg0 == 2504) {
                    field1361[field1364++] = var76.field1059 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1361[field1364++] = var76.field1178;
                    return;
                }
                if (arg0 == 1506) {
                    class78 var77 = class474.method2673((byte) -121, var76);
                    field1361[field1364++] = var77 == null ? -1 : var77.field1129;
                    return;
                }
            } else if (arg0 < 2700) {
                class78 var78 = class582.method3319((byte) -58, field1361[--field1364]);
                if (arg0 == 2600) {
                    field1361[field1364++] = var78.field1158;
                    return;
                }
                if (arg0 == 2601) {
                    field1361[field1364++] = var78.field1170;
                    return;
                }
                if (arg0 == 2602) {
                    field1354[field1358++] = var78.field1083;
                    return;
                }
                if (arg0 == 2603) {
                    field1361[field1364++] = var78.field1106;
                    return;
                }
                if (arg0 == 2604) {
                    field1361[field1364++] = var78.field1128;
                    return;
                }
                if (arg0 == 2605) {
                    field1361[field1364++] = var78.field1155;
                    return;
                }
                if (arg0 == 2606) {
                    field1361[field1364++] = var78.field1097;
                    return;
                }
                if (arg0 == 2607) {
                    field1361[field1364++] = var78.field1092;
                    return;
                }
                if (arg0 == 2608) {
                    field1361[field1364++] = var78.field1163;
                    return;
                }
                if (arg0 == 2609) {
                    field1361[field1364++] = var78.field1102;
                    return;
                }
                if (arg0 == 2610) {
                    field1361[field1364++] = var78.field1160;
                    return;
                }
                if (arg0 == 2611) {
                    field1361[field1364++] = var78.field1016;
                    return;
                }
                if (arg0 == 2612) {
                    field1361[field1364++] = var78.field1136;
                    return;
                }
                if (arg0 == 2613) {
                    field1361[field1364++] = var78.field1152;
                    return;
                }
                if (arg0 == 2614) {
                    field1361[field1364++] = var78.field1084 == 1 ? var78.field1114 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class78 var79 = class582.method3319((byte) -51, field1361[--field1364]);
                    field1361[field1364++] = var79.field1145;
                    return;
                }
                if (arg0 == 2701) {
                    class78 var80 = class582.method3319((byte) -38, field1361[--field1364]);
                    if (var80.field1145 != -1) {
                        field1361[field1364++] = var80.field1095;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var81 = field1361[--field1364];
                    class685 var82 = (class685) class4.field26.method970((byte) 89, (long) var81);
                    if (var82 != null) {
                        field1361[field1364++] = 1;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class78 var83 = class582.method3319((byte) -42, field1361[--field1364]);
                    if (var83.field1046 == null) {
                        field1361[field1364++] = 0;
                        return;
                    }
                    int var84 = var83.field1046.length;
                    for (int var85 = 0; var85 < var83.field1046.length; var85++) {
                        if (var83.field1046[var85] == null) {
                            var84 = var85;
                            break;
                        }
                    }
                    field1361[field1364++] = var84;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field1364 -= 2;
                    int var86 = field1361[field1364];
                    int var87 = field1361[field1364 + 1];
                    class685 var88 = (class685) class4.field26.method970((byte) 89, (long) var86);
                    if (var88 != null && var88.field9776 == var87) {
                        field1361[field1364++] = 1;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class78 var89 = class582.method3319((byte) -43, field1361[--field1364]);
                if (arg0 == 2800) {
                    field1361[field1364++] = client.method1679(var89).method1849((byte) 66);
                    return;
                }
                if (arg0 == 2801) {
                    int var90 = field1361[--field1364];
                    int var357 = var90 - 1;
                    if (var89.field1175 != null && var357 < var89.field1175.length && var89.field1175[var357] != null) {
                        field1354[field1358++] = var89.field1175[var357];
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var89.field1101 == null) {
                        field1354[field1358++] = "";
                        return;
                    }
                    field1354[field1358++] = var89.field1101;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var91 = field1354[--field1358];
                    class62.method515(-89, var91);
                    return;
                }
                if (arg0 == 3101) {
                    field1364 -= 2;
                    class633.method3542(field1361[field1364 + 1], 10, class143.field2063, field1361[field1364]);
                    return;
                }
                if (arg0 == 3103) {
                    class351.method2022(true, -92);
                    return;
                }
                if (arg0 == 3104) {
                    String var92 = field1354[--field1358];
                    int var93 = 0;
                    if (class568.method3250(var92, 10)) {
                        var93 = class214.method1376(0, var92);
                    }
                    field1352++;
                    class352 var94 = class290.method1786(98, class199.field2836, class67.field898);
                    var94.field4686.method2836(var93, -22164);
                    class602.method3388(var94, (byte) 28);
                    return;
                }
                if (arg0 == 3105) {
                    String var95 = field1354[--field1358];
                    field1369++;
                    class352 var96 = class290.method1786(98, class199.field2836, class552.field7453);
                    var96.field4686.method2817(var95.length() + 1, true);
                    var96.field4686.method2820(106, var95);
                    class602.method3388(var96, (byte) 28);
                    return;
                }
                if (arg0 == 3106) {
                    String var97 = field1354[--field1358];
                    field1350++;
                    class352 var98 = class290.method1786(98, class199.field2836, class475.field6542);
                    var98.field4686.method2817(var97.length() + 1, true);
                    var98.field4686.method2820(99, var97);
                    class602.method3388(var98, (byte) 28);
                    return;
                }
                if (arg0 == 3107) {
                    int var99 = field1361[--field1364];
                    String var100 = field1354[--field1358];
                    class666.method3763(var99, 100, var100);
                    return;
                }
                if (arg0 == 3108) {
                    field1364 -= 3;
                    int var101 = field1361[field1364];
                    int var102 = field1361[field1364 + 1];
                    int var103 = field1361[field1364 + 2];
                    class78 var104 = class582.method3319((byte) -71, var103);
                    class119.method856(var104, (byte) -128, var101, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field1364 -= 2;
                    int var105 = field1361[field1364];
                    int var106 = field1361[field1364 + 1];
                    class78 var107 = arg1 ? field1353 : field1368;
                    class119.method856(var107, (byte) -128, var105, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var108 = field1361[--field1364];
                    field1367++;
                    class352 var109 = class290.method1786(98, class199.field2836, class274.field3797);
                    var109.field4686.method2837(var108, -2);
                    class602.method3388(var109, (byte) 28);
                    return;
                }
                if (arg0 == 3111) {
                    field1364 -= 2;
                    int var110 = field1361[field1364];
                    int var111 = field1361[field1364 + 1];
                    class685 var112 = (class685) class4.field26.method970((byte) 89, (long) var110);
                    if (var112 != null) {
                        class17.method83(var112.field9776 != var111, var112, -8501, true);
                    }
                    class381.method2192(var110, var111, 3, 1, true);
                    return;
                }
                if (arg0 == 3112) {
                    field1364--;
                    int var113 = field1361[field1364];
                    class685 var114 = (class685) class4.field26.method970((byte) 89, (long) var113);
                    if (var114 != null && var114.field9774 == 3) {
                        class17.method83(true, var114, -8501, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class648.method3635(field1354[--field1358], (byte) 103);
                    return;
                }
                if (arg0 == 3114) {
                    field1364 -= 2;
                    int var115 = field1361[field1364];
                    int var116 = field1361[field1364 + 1];
                    String var117 = field1354[--field1358];
                    class628.method3510("", -1, var116, var115, "", var117, "");
                    return;
                }
                if (arg0 == 3115) {
                    field1364 -= 11;
                    class594[] var118 = class154.method1103((byte) -93);
                    class12[] var119 = class568.method3248(-1);
                    class505.method2887(var118[field1361[field1364]], field1361[field1364 + 7], field1361[field1364 + 5], -95, field1361[field1364 + 10], field1361[field1364 + 6], field1361[field1364 + 4], field1361[field1364 + 8], field1361[field1364 + 2], field1361[field1364 + 3], field1361[field1364 + 9], var119[field1361[field1364 + 1]]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field1364 -= 3;
                    class589.method3348(field1361[field1364 + 2], 255, field1361[field1364 + 1], true, 256, field1361[field1364]);
                    return;
                }
                if (arg0 == 3201) {
                    class653.method3684(field1361[--field1364], (byte) 127, 50, 255);
                    return;
                }
                if (arg0 == 3202) {
                    field1364 -= 2;
                    class489.method2776(255, field1361[field1364 + 1], 0, field1361[field1364]);
                    return;
                }
                if (arg0 == 3203) {
                    field1364 -= 4;
                    class589.method3348(field1361[field1364 + 2], field1361[field1364 + 3], field1361[field1364 + 1], true, 256, field1361[field1364]);
                    return;
                }
                if (arg0 == 3204) {
                    field1364 -= 3;
                    class653.method3684(field1361[field1364], (byte) 94, field1361[field1364 + 2], field1361[field1364 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field1364 -= 3;
                    class489.method2776(field1361[field1364 + 2], field1361[field1364 + 1], 0, field1361[field1364]);
                    return;
                }
                if (arg0 == 3206) {
                    field1364 -= 4;
                    class586.method3335(256, field1361[field1364 + 1], 0, false, field1361[field1364], field1361[field1364 + 3], field1361[field1364 + 2]);
                    return;
                }
                if (arg0 == 3207) {
                    field1364 -= 4;
                    class586.method3335(256, field1361[field1364 + 1], 0, true, field1361[field1364], field1361[field1364 + 3], field1361[field1364 + 2]);
                    return;
                }
                if (arg0 == 3208) {
                    field1364 -= 5;
                    class589.method3348(field1361[field1364 + 2], field1361[field1364 + 3], field1361[field1364 + 1], true, field1361[field1364 + 4], field1361[field1364]);
                    return;
                }
                if (arg0 == 3209) {
                    field1364 -= 5;
                    class586.method3335(field1361[field1364 + 4], field1361[field1364 + 1], 0, false, field1361[field1364], field1361[field1364 + 3], field1361[field1364 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1361[field1364++] = class186.field2697;
                    return;
                }
                if (arg0 == 3301) {
                    field1364 -= 2;
                    int var120 = field1361[field1364];
                    int var121 = field1361[field1364 + 1];
                    field1361[field1364++] = class700.method3920(true, false, var120, var121);
                    return;
                }
                if (arg0 == 3302) {
                    field1364 -= 2;
                    int var122 = field1361[field1364];
                    int var123 = field1361[field1364 + 1];
                    field1361[field1364++] = class508.method2903(false, var123, (byte) 106, var122);
                    return;
                }
                if (arg0 == 3303) {
                    field1364 -= 2;
                    int var124 = field1361[field1364];
                    int var125 = field1361[field1364 + 1];
                    field1361[field1364++] = class8.method32(0, var124, false, var125);
                    return;
                }
                if (arg0 == 3304) {
                    int var126 = field1361[--field1364];
                    field1361[field1364++] = class557.field7504.method303(var126, 16264).field7543;
                    return;
                }
                if (arg0 == 3305) {
                    int var127 = field1361[--field1364];
                    field1361[field1364++] = class524.field7113[var127];
                    return;
                }
                if (arg0 == 3306) {
                    int var128 = field1361[--field1364];
                    field1361[field1364++] = class264.field3579[var128];
                    return;
                }
                if (arg0 == 3307) {
                    int var129 = field1361[--field1364];
                    field1361[field1364++] = class405.field5676[var129];
                    return;
                }
                if (arg0 == 3308) {
                    byte var130 = class143.field2063.field4053;
                    int var131 = (class143.field2063.field4042 >> 9) + class498.field6774;
                    int var132 = (class143.field2063.field4047 >> 9) + class613.field8555;
                    field1361[field1364++] = (var130 << 28) + (var131 << 14) + var132;
                    return;
                }
                if (arg0 == 3309) {
                    int var133 = field1361[--field1364];
                    field1361[field1364++] = var133 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var134 = field1361[--field1364];
                    field1361[field1364++] = var134 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var135 = field1361[--field1364];
                    field1361[field1364++] = var135 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1361[field1364++] = class21.field239 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field1364 -= 2;
                    int var136 = field1361[field1364];
                    int var137 = field1361[field1364 + 1];
                    field1361[field1364++] = class700.method3920(true, true, var136, var137);
                    return;
                }
                if (arg0 == 3314) {
                    field1364 -= 2;
                    int var138 = field1361[field1364];
                    int var139 = field1361[field1364 + 1];
                    field1361[field1364++] = class508.method2903(true, var139, (byte) 100, var138);
                    return;
                }
                if (arg0 == 3315) {
                    field1364 -= 2;
                    int var140 = field1361[field1364];
                    int var141 = field1361[field1364 + 1];
                    field1361[field1364++] = class8.method32(0, var140, true, var141);
                    return;
                }
                if (arg0 == 3316) {
                    if (class296.field4060 >= 2) {
                        field1361[field1364++] = class296.field4060;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1361[field1364++] = class37.field444;
                    return;
                }
                if (arg0 == 3318) {
                    field1361[field1364++] = class651.field9040.field2475;
                    return;
                }
                if (arg0 == 3321) {
                    field1361[field1364++] = class25.field320;
                    return;
                }
                if (arg0 == 3322) {
                    field1361[field1364++] = class2.field5;
                    return;
                }
                if (arg0 == 3323) {
                    if (class455.field6311 >= 5 && class455.field6311 <= 9) {
                        field1361[field1364++] = 1;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class455.field6311 >= 5 && class455.field6311 <= 9) {
                        field1361[field1364++] = class455.field6311;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1361[field1364++] = class656.field9121 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1361[field1364++] = class143.field2063.field9663;
                    return;
                }
                if (arg0 == 3327) {
                    field1361[field1364++] = class143.field2063.field9689.field7135 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1361[field1364++] = class511.field7018 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var142 = field1361[--field1364];
                    field1361[field1364++] = class431.method2477(false, -899225085, var142);
                    return;
                }
                if (arg0 == 3331) {
                    field1364 -= 2;
                    int var143 = field1361[field1364];
                    int var144 = field1361[field1364 + 1];
                    field1361[field1364++] = class98.method716(var143, (byte) 26, false, false, var144);
                    return;
                }
                if (arg0 == 3332) {
                    field1364 -= 2;
                    int var145 = field1361[field1364];
                    int var146 = field1361[field1364 + 1];
                    field1361[field1364++] = class98.method716(var145, (byte) 102, true, false, var146);
                    return;
                }
                if (arg0 == 3333) {
                    field1361[field1364++] = class124.field1793;
                    return;
                }
                if (arg0 == 3335) {
                    field1361[field1364++] = class697.field9900;
                    return;
                }
                if (arg0 == 3336) {
                    field1364 -= 4;
                    int var147 = field1361[field1364];
                    int var148 = field1361[field1364 + 1];
                    int var149 = field1361[field1364 + 2];
                    int var150 = field1361[field1364 + 3];
                    int var151 = (var148 << 14) + var147;
                    int var152 = (var149 << 28) + var151;
                    int var153 = var150 + var152;
                    field1361[field1364++] = var153;
                    return;
                }
                if (arg0 == 3337) {
                    field1361[field1364++] = class254.field3462;
                    return;
                }
                if (arg0 == 3338) {
                    field1361[field1364++] = class563.method3153(3439);
                    return;
                }
                if (arg0 == 3339) {
                    field1361[field1364++] = class410.field5834 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field1361[field1364++] = class556.field7487 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field1361[field1364++] = class652.field9070 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field1361[field1364++] = class214.field2991.method1499(8);
                    return;
                }
                if (arg0 == 3343) {
                    field1361[field1364++] = class214.field2991.method1491((byte) 116);
                    return;
                }
                if (arg0 == 3344) {
                    field1354[field1358++] = class151.method1094(-124);
                    return;
                }
                if (arg0 == 3345) {
                    field1354[field1358++] = class96.method699((byte) 34);
                    return;
                }
                if (arg0 == 3346) {
                    field1361[field1364++] = class10.method47((byte) 70);
                    return;
                }
                if (arg0 == 3347) {
                    field1361[field1364++] = class338.field4538;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field1364 -= 2;
                    int var154 = field1361[field1364];
                    int var155 = field1361[field1364 + 1];
                    class563 var156 = class545.field7395.method815(true, var154);
                    field1354[field1358++] = var156.method3155(0, var155);
                    return;
                }
                if (arg0 == 3408) {
                    field1364 -= 4;
                    int var157 = field1361[field1364];
                    int var158 = field1361[field1364 + 1];
                    int var159 = field1361[field1364 + 2];
                    int var160 = field1361[field1364 + 3];
                    class563 var161 = class545.field7395.method815(true, var159);
                    if (var161.field7607 == var157 && var161.field7608 == var158) {
                        if (var158 == 115) {
                            field1354[field1358++] = var161.method3155(0, var160);
                            return;
                        }
                        field1361[field1364++] = var161.method3147(var160, -31500);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field1364 -= 3;
                    int var162 = field1361[field1364];
                    int var163 = field1361[field1364 + 1];
                    int var164 = field1361[field1364 + 2];
                    if (var163 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class563 var165 = class545.field7395.method815(true, var163);
                    if (var165.field7608 != var162) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1361[field1364++] = var165.method3154(var164, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var166 = field1361[--field1364];
                    String var167 = field1354[--field1358];
                    if (var166 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class563 var168 = class545.field7395.method815(true, var166);
                    if (var168.field7608 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1361[field1364++] = var168.method3156((byte) 126, var167) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var169 = field1361[--field1364];
                    class563 var170 = class545.field7395.method815(true, var169);
                    field1361[field1364++] = var170.field7616.method972(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class533.field7204 == 0) {
                        field1361[field1364++] = -2;
                        return;
                    }
                    if (class533.field7204 == 1) {
                        field1361[field1364++] = -1;
                        return;
                    }
                    field1361[field1364++] = class671.field9419;
                    return;
                }
                if (arg0 == 3601) {
                    int var171 = field1361[--field1364];
                    if (class533.field7204 == 2 && var171 < class671.field9419) {
                        field1354[field1358++] = class696.field9891[var171];
                        if (class287.field3952[var171] != null) {
                            field1354[field1358++] = class287.field3952[var171];
                            return;
                        }
                        field1354[field1358++] = "";
                        return;
                    }
                    field1354[field1358++] = "";
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var172 = field1361[--field1364];
                    if (class533.field7204 == 2 && var172 < class671.field9419) {
                        field1361[field1364++] = class531.field7187[var172];
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var173 = field1361[--field1364];
                    if (class533.field7204 == 2 && var173 < class671.field9419) {
                        field1361[field1364++] = class389.field5497[var173];
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var174 = field1354[--field1358];
                    int var175 = field1361[--field1364];
                    class407.method2379(-4, var174, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var176 = field1354[--field1358];
                    class420.method2435(var176, -18716);
                    return;
                }
                if (arg0 == 3606) {
                    String var177 = field1354[--field1358];
                    class167.method1180(var177, 1);
                    return;
                }
                if (arg0 == 3607) {
                    String var178 = field1354[--field1358];
                    class660.method3706(false, var178, 117);
                    return;
                }
                if (arg0 == 3608) {
                    String var179 = field1354[--field1358];
                    class185.method1274(var179, -10990);
                    return;
                }
                if (arg0 == 3609) {
                    String var180 = field1354[--field1358];
                    if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                        var180 = var180.substring(7);
                    }
                    field1361[field1364++] = class549.method3086(var180, (byte) -63) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var181 = field1361[--field1364];
                    if (class533.field7204 == 2 && var181 < class671.field9419) {
                        field1354[field1358++] = class423.field5950[var181];
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class347.field4641 != null) {
                        field1354[field1358++] = class437.method2504(class347.field4641, (byte) -1);
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class347.field4641 != null) {
                        field1361[field1364++] = class56.field633;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var182 = field1361[--field1364];
                    if (class347.field4641 != null && var182 < class56.field633) {
                        field1354[field1358++] = class174.field2525[var182].field3180;
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var183 = field1361[--field1364];
                    if (class347.field4641 != null && var183 < class56.field633) {
                        field1361[field1364++] = class174.field2525[var183].field3184;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var184 = field1361[--field1364];
                    if (class347.field4641 != null && var184 < class56.field633) {
                        field1361[field1364++] = class174.field2525[var184].field3185;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1361[field1364++] = class538.field7272;
                    return;
                }
                if (arg0 == 3617) {
                    String var185 = field1354[--field1358];
                    class347.method2015(var185, 89);
                    return;
                }
                if (arg0 == 3618) {
                    field1361[field1364++] = class422.field5935;
                    return;
                }
                if (arg0 == 3619) {
                    String var186 = field1354[--field1358];
                    class704.method3944(var186, -16531);
                    return;
                }
                if (arg0 == 3620) {
                    class377.method2160(78);
                    return;
                }
                if (arg0 == 3621) {
                    if (class533.field7204 == 0) {
                        field1361[field1364++] = -1;
                        return;
                    }
                    field1361[field1364++] = class165.field2390;
                    return;
                }
                if (arg0 == 3622) {
                    int var187 = field1361[--field1364];
                    if (class533.field7204 != 0 && var187 < class165.field2390) {
                        field1354[field1358++] = class356.field4722[var187];
                        if (class238.field3258[var187] != null) {
                            field1354[field1358++] = class238.field3258[var187];
                            return;
                        }
                        field1354[field1358++] = "";
                        return;
                    }
                    field1354[field1358++] = "";
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var188 = field1354[--field1358];
                    if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                        var188 = var188.substring(7);
                    }
                    field1361[field1364++] = class251.method1543(var188, -92) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var189 = field1361[--field1364];
                    if (class174.field2525 != null && var189 < class56.field633 && class174.field2525[var189].field3181.equalsIgnoreCase(class143.field2063.field9693)) {
                        field1361[field1364++] = 1;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class389.field5508 != null) {
                        field1354[field1358++] = class389.field5508;
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var190 = field1361[--field1364];
                    if (class347.field4641 != null && var190 < class56.field633) {
                        field1354[field1358++] = class174.field2525[var190].field3182;
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var191 = field1361[--field1364];
                    if (class533.field7204 == 2 && var191 >= 0 && var191 < class671.field9419) {
                        field1361[field1364++] = class29.field366[var191] ? 1 : 0;
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var192 = field1354[--field1358];
                    if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                        var192 = var192.substring(7);
                    }
                    field1361[field1364++] = class557.method3121(var192, -119);
                    return;
                }
                if (arg0 == 3629) {
                    field1361[field1364++] = class389.field5491;
                    return;
                }
                if (arg0 == 3630) {
                    String var193 = field1354[--field1358];
                    class660.method3706(true, var193, 26);
                    return;
                }
                if (arg0 == 3631) {
                    int var194 = field1361[--field1364];
                    field1361[field1364++] = class355.field4707[var194] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var195 = field1361[--field1364];
                    if (class347.field4641 != null && var195 < class56.field633) {
                        field1354[field1358++] = class174.field2525[var195].field3181;
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var196 = field1361[--field1364];
                    if (class533.field7204 != 0 && var196 < class165.field2390) {
                        field1354[field1358++] = class59.field663[var196];
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var197 = field1361[--field1364];
                    field1361[field1364++] = class598.field8359[var197].method2338((byte) 24);
                    return;
                }
                if (arg0 == 3904) {
                    int var198 = field1361[--field1364];
                    field1361[field1364++] = class598.field8359[var198].field5615;
                    return;
                }
                if (arg0 == 3905) {
                    int var199 = field1361[--field1364];
                    field1361[field1364++] = class598.field8359[var199].field5607;
                    return;
                }
                if (arg0 == 3906) {
                    int var200 = field1361[--field1364];
                    field1361[field1364++] = class598.field8359[var200].field5617;
                    return;
                }
                if (arg0 == 3907) {
                    int var201 = field1361[--field1364];
                    field1361[field1364++] = class598.field8359[var201].field5610;
                    return;
                }
                if (arg0 == 3908) {
                    int var202 = field1361[--field1364];
                    field1361[field1364++] = class598.field8359[var202].field5611;
                    return;
                }
                if (arg0 == 3910) {
                    int var203 = field1361[--field1364];
                    int var204 = class598.field8359[var203].method2336(92);
                    field1361[field1364++] = var204 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var205 = field1361[--field1364];
                    int var206 = class598.field8359[var205].method2336(91);
                    field1361[field1364++] = var206 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var207 = field1361[--field1364];
                    int var208 = class598.field8359[var207].method2336(-115);
                    field1361[field1364++] = var208 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var209 = field1361[--field1364];
                    int var210 = class598.field8359[var209].method2336(-37);
                    field1361[field1364++] = var210 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field1364 -= 2;
                    int var211 = field1361[field1364];
                    int var212 = field1361[field1364 + 1];
                    field1361[field1364++] = var211 + var212;
                    return;
                }
                if (arg0 == 4001) {
                    field1364 -= 2;
                    int var213 = field1361[field1364];
                    int var214 = field1361[field1364 + 1];
                    field1361[field1364++] = var213 - var214;
                    return;
                }
                if (arg0 == 4002) {
                    field1364 -= 2;
                    int var215 = field1361[field1364];
                    int var216 = field1361[field1364 + 1];
                    field1361[field1364++] = var215 * var216;
                    return;
                }
                if (arg0 == 4003) {
                    field1364 -= 2;
                    int var217 = field1361[field1364];
                    int var218 = field1361[field1364 + 1];
                    field1361[field1364++] = var217 / var218;
                    return;
                }
                if (arg0 == 4004) {
                    int var219 = field1361[--field1364];
                    field1361[field1364++] = (int) (Math.random() * (double) var219);
                    return;
                }
                if (arg0 == 4005) {
                    int var220 = field1361[--field1364];
                    field1361[field1364++] = (int) (Math.random() * (double) (var220 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field1364 -= 5;
                    int var221 = field1361[field1364];
                    int var222 = field1361[field1364 + 1];
                    int var223 = field1361[field1364 + 2];
                    int var224 = field1361[field1364 + 3];
                    int var225 = field1361[field1364 + 4];
                    field1361[field1364++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                    return;
                }
                if (arg0 == 4007) {
                    field1364 -= 2;
                    long var226 = (long) field1361[field1364];
                    long var228 = (long) field1361[field1364 + 1];
                    field1361[field1364++] = (int) (var226 * var228 / 100L + var226);
                    return;
                }
                if (arg0 == 4008) {
                    field1364 -= 2;
                    int var230 = field1361[field1364];
                    int var231 = field1361[field1364 + 1];
                    field1361[field1364++] = var230 | 0x1 << var231;
                    return;
                }
                if (arg0 == 4009) {
                    field1364 -= 2;
                    int var232 = field1361[field1364];
                    int var233 = field1361[field1364 + 1];
                    field1361[field1364++] = var232 & -(0x1 << var233) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field1364 -= 2;
                    int var234 = field1361[field1364];
                    int var235 = field1361[field1364 + 1];
                    field1361[field1364++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field1364 -= 2;
                    int var236 = field1361[field1364];
                    int var237 = field1361[field1364 + 1];
                    field1361[field1364++] = var236 % var237;
                    return;
                }
                if (arg0 == 4012) {
                    field1364 -= 2;
                    int var238 = field1361[field1364];
                    int var239 = field1361[field1364 + 1];
                    if (var238 == 0) {
                        field1361[field1364++] = 0;
                        return;
                    }
                    field1361[field1364++] = (int) Math.pow((double) var238, (double) var239);
                    return;
                }
                if (arg0 == 4013) {
                    field1364 -= 2;
                    int var240 = field1361[field1364];
                    int var241 = field1361[field1364 + 1];
                    if (var240 == 0) {
                        field1361[field1364++] = 0;
                        return;
                    }
                    if (var241 == 0) {
                        field1361[field1364++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1361[field1364++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                    return;
                }
                if (arg0 == 4014) {
                    field1364 -= 2;
                    int var242 = field1361[field1364];
                    int var243 = field1361[field1364 + 1];
                    field1361[field1364++] = var242 & var243;
                    return;
                }
                if (arg0 == 4015) {
                    field1364 -= 2;
                    int var244 = field1361[field1364];
                    int var245 = field1361[field1364 + 1];
                    field1361[field1364++] = var244 | var245;
                    return;
                }
                if (arg0 == 4016) {
                    field1364 -= 2;
                    int var246 = field1361[field1364];
                    int var247 = field1361[field1364 + 1];
                    field1361[field1364++] = var246 < var247 ? var246 : var247;
                    return;
                }
                if (arg0 == 4017) {
                    field1364 -= 2;
                    int var248 = field1361[field1364];
                    int var249 = field1361[field1364 + 1];
                    field1361[field1364++] = var248 > var249 ? var248 : var249;
                    return;
                }
                if (arg0 == 4018) {
                    field1364 -= 3;
                    long var250 = (long) field1361[field1364];
                    long var252 = (long) field1361[field1364 + 1];
                    long var254 = (long) field1361[field1364 + 2];
                    field1361[field1364++] = (int) (var250 * var254 / var252);
                    return;
                }
                if (arg0 == 4019) {
                    field1364 -= 2;
                    int var256 = field1361[field1364];
                    int var257 = field1361[field1364 + 1];
                    if (var256 > 700 || var257 > 700) {
                        field1361[field1364++] = 256;
                    }
                    double var258 = (Math.random() * (double) (var256 + var257) + 800.0D - (double) var256) / 100.0D;
                    field1361[field1364++] = (int) (Math.pow(2.0D, var258) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var260 = field1354[--field1358];
                    int var261 = field1361[--field1364];
                    field1354[field1358++] = var260 + var261;
                    return;
                }
                if (arg0 == 4101) {
                    field1358 -= 2;
                    String var262 = field1354[field1358];
                    String var263 = field1354[field1358 + 1];
                    field1354[field1358++] = var262 + var263;
                    return;
                }
                if (arg0 == 4102) {
                    String var264 = field1354[--field1358];
                    int var265 = field1361[--field1364];
                    field1354[field1358++] = var264 + class555.method3112(var265, 1024, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var266 = field1354[--field1358];
                    field1354[field1358++] = var266.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field1354[field1358++] = method713(field1361[--field1364]);
                    return;
                }
                if (arg0 == 4105) {
                    field1358 -= 2;
                    String var267 = field1354[field1358];
                    String var268 = field1354[field1358 + 1];
                    if (class143.field2063.field9689 != null && class143.field2063.field9689.field7135) {
                        field1354[field1358++] = var268;
                        return;
                    }
                    field1354[field1358++] = var267;
                    return;
                }
                if (arg0 == 4106) {
                    int var269 = field1361[--field1364];
                    field1354[field1358++] = Integer.toString(var269);
                    return;
                }
                if (arg0 == 4107) {
                    field1358 -= 2;
                    field1361[field1364++] = class365.method2110(field1354[field1358], -12017, class697.field9900, field1354[field1358 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var270 = field1354[--field1358];
                    field1364 -= 2;
                    int var271 = field1361[field1364];
                    int var272 = field1361[field1364 + 1];
                    class283 var273 = class43.method368(0, -34, var272, class55.field627);
                    field1361[field1364++] = var273.method1745(class382.field5248, var270, var271, 46);
                    return;
                }
                if (arg0 == 4109) {
                    String var274 = field1354[--field1358];
                    field1364 -= 2;
                    int var275 = field1361[field1364];
                    int var276 = field1361[field1364 + 1];
                    class283 var277 = class43.method368(0, -119, var276, class55.field627);
                    field1361[field1364++] = var277.method1738((byte) 99, var275, var274, class382.field5248);
                    return;
                }
                if (arg0 == 4110) {
                    field1358 -= 2;
                    String var278 = field1354[field1358];
                    String var279 = field1354[field1358 + 1];
                    if (field1361[--field1364] == 1) {
                        field1354[field1358++] = var278;
                        return;
                    }
                    field1354[field1358++] = var279;
                    return;
                }
                if (arg0 == 4111) {
                    String var280 = field1354[--field1358];
                    field1354[field1358++] = class378.method2167(1, var280);
                    return;
                }
                if (arg0 == 4112) {
                    String var281 = field1354[--field1358];
                    int var282 = field1361[--field1364];
                    if (var282 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field1354[field1358++] = var281 + (char) var282;
                    return;
                }
                if (arg0 == 4113) {
                    int var283 = field1361[--field1364];
                    field1361[field1364++] = class663.method3751((char) var283, 1) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var284 = field1361[--field1364];
                    field1361[field1364++] = class73.method579((char) var284, (byte) 65) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var285 = field1361[--field1364];
                    field1361[field1364++] = class428.method2461(-56, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var286 = field1361[--field1364];
                    field1361[field1364++] = class41.method363((byte) -100, (char) var286) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var287 = field1354[--field1358];
                    if (var287 != null) {
                        field1361[field1364++] = var287.length();
                        return;
                    }
                    field1361[field1364++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var288 = field1354[--field1358];
                    field1364 -= 2;
                    int var289 = field1361[field1364];
                    int var290 = field1361[field1364 + 1];
                    field1354[field1358++] = var288.substring(var289, var290);
                    return;
                }
                if (arg0 == 4119) {
                    String var291 = field1354[--field1358];
                    StringBuffer var292 = new StringBuffer(var291.length());
                    boolean var293 = false;
                    for (int var294 = 0; var294 < var291.length(); var294++) {
                        char var295 = var291.charAt(var294);
                        if (var295 == '<') {
                            var293 = true;
                        } else if (var295 == '>') {
                            var293 = false;
                        } else if (!var293) {
                            var292.append(var295);
                        }
                    }
                    field1354[field1358++] = var292.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var296 = field1354[--field1358];
                    field1364 -= 2;
                    int var297 = field1361[field1364];
                    int var298 = field1361[field1364 + 1];
                    field1361[field1364++] = var296.indexOf(var297, var298);
                    return;
                }
                if (arg0 == 4121) {
                    field1358 -= 2;
                    String var299 = field1354[field1358];
                    String var300 = field1354[field1358 + 1];
                    int var301 = field1361[--field1364];
                    field1361[field1364++] = var299.indexOf(var300, var301);
                    return;
                }
                if (arg0 == 4122) {
                    int var302 = field1361[--field1364];
                    field1361[field1364++] = Character.toLowerCase((char) var302);
                    return;
                }
                if (arg0 == 4123) {
                    int var303 = field1361[--field1364];
                    field1361[field1364++] = Character.toUpperCase((char) var303);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var304 = field1361[--field1364] != 0;
                    int var305 = field1361[--field1364];
                    field1354[field1358++] = class554.method3108(0, class697.field9900, (long) var305, var304, (byte) -93);
                    return;
                }
                if (arg0 == 4125) {
                    String var306 = field1354[--field1358];
                    int var307 = field1361[--field1364];
                    class283 var308 = class43.method368(0, -32, var307, class55.field627);
                    field1361[field1364++] = var308.method1741(var306, class382.field5248, 1);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var309 = field1361[--field1364];
                    field1354[field1358++] = class599.field8366.method3949(0, var309).field9222;
                    return;
                }
                if (arg0 == 4201) {
                    field1364 -= 2;
                    int var310 = field1361[field1364];
                    int var311 = field1361[field1364 + 1];
                    class661 var312 = class599.field8366.method3949(0, var310);
                    if (var311 >= 1 && var311 <= 5 && var312.field9220[var311 - 1] != null) {
                        field1354[field1358++] = var312.field9220[var311 - 1];
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field1364 -= 2;
                    int var313 = field1361[field1364];
                    int var314 = field1361[field1364 + 1];
                    class661 var315 = class599.field8366.method3949(0, var313);
                    if (var314 >= 1 && var314 <= 5 && var315.field9193[var314 - 1] != null) {
                        field1354[field1358++] = var315.field9193[var314 - 1];
                        return;
                    }
                    field1354[field1358++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var316 = field1361[--field1364];
                    field1361[field1364++] = class599.field8366.method3949(0, var316).field9253;
                    return;
                }
                if (arg0 == 4204) {
                    int var317 = field1361[--field1364];
                    field1361[field1364++] = class599.field8366.method3949(0, var317).field9254 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var318 = field1361[--field1364];
                    class661 var319 = class599.field8366.method3949(0, var318);
                    if (var319.field9190 == -1 && var319.field9197 >= 0) {
                        field1361[field1364++] = var319.field9197;
                        return;
                    }
                    field1361[field1364++] = var318;
                    return;
                }
                if (arg0 == 4206) {
                    int var320 = field1361[--field1364];
                    class661 var321 = class599.field8366.method3949(0, var320);
                    if (var321.field9190 >= 0 && var321.field9197 >= 0) {
                        field1361[field1364++] = var321.field9197;
                        return;
                    }
                    field1361[field1364++] = var320;
                    return;
                }
                if (arg0 == 4207) {
                    int var322 = field1361[--field1364];
                    field1361[field1364++] = class599.field8366.method3949(0, var322).field9265 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field1364 -= 2;
                    int var323 = field1361[field1364];
                    int var324 = field1361[field1364 + 1];
                    class488 var325 = class71.field952.method1977((byte) 58, var324);
                    if (var325.method2772(118)) {
                        field1354[field1358++] = class599.field8366.method3949(0, var323).method3726(var324, -1, var325.field6701);
                        return;
                    }
                    field1361[field1364++] = class599.field8366.method3949(0, var323).method3729(-127, var325.field6697, var324);
                    return;
                }
                if (arg0 == 4209) {
                    field1364 -= 2;
                    int var326 = field1361[field1364];
                    int var327 = field1361[field1364 + 1] - 1;
                    class661 var328 = class599.field8366.method3949(0, var326);
                    if (var328.field9239 == var327) {
                        field1361[field1364++] = var328.field9206;
                        return;
                    }
                    if (var328.field9216 == var327) {
                        field1361[field1364++] = var328.field9251;
                        return;
                    }
                    field1361[field1364++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var329 = field1354[--field1358];
                    int var330 = field1361[--field1364];
                    class360.method2059(var330 == 1, false, var329);
                    field1361[field1364++] = class495.field6745;
                    return;
                }
                if (arg0 == 4211) {
                    if (class657.field9135 != null && class592.field8294 < class495.field6745) {
                        field1361[field1364++] = class657.field9135[class592.field8294++] & 0xFFFF;
                        return;
                    }
                    field1361[field1364++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class592.field8294 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var331 = field1361[--field1364];
                    field1361[field1364++] = class599.field8366.method3949(0, var331).field9218;
                    return;
                }
                if (arg0 == 4214) {
                    String var332 = field1354[--field1358];
                    field1364 -= 3;
                    int var333 = field1361[field1364];
                    int var334 = field1361[field1364 + 1];
                    int var335 = field1361[field1364 + 2];
                    class623.method3465(127, var333 == 1, var332, var334, var335);
                    field1361[field1364++] = class495.field6745;
                    return;
                }
                if (arg0 == 4215) {
                    field1358 -= 2;
                    field1364 -= 2;
                    String var336 = field1354[field1358];
                    int var337 = field1361[field1364];
                    int var338 = field1361[field1364 + 1];
                    String var339 = field1354[field1358 + 1];
                    class705.method3945(var337 == 1, var339, var336, var338, -1);
                    field1361[field1364++] = class495.field6745;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field1364 -= 2;
                    int var340 = field1361[field1364];
                    int var341 = field1361[field1364 + 1];
                    class488 var342 = class71.field952.method1977((byte) 58, var341);
                    if (var342.method2772(124)) {
                        field1354[field1358++] = class347.field4640.method2584(var340, 1).method3258(var341, var342.field6701, 117);
                        return;
                    }
                    field1361[field1364++] = class347.field4640.method2584(var340, 1).method3261(-97, var341, var342.field6697);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field1364 -= 2;
                    int var343 = field1361[field1364];
                    int var344 = field1361[field1364 + 1];
                    class488 var345 = class71.field952.method1977((byte) 58, var344);
                    if (var345.method2772(118)) {
                        field1354[field1358++] = class475.field6543.method2685(var343, -95).method1820(var345.field6701, -170, var344);
                        return;
                    }
                    field1361[field1364++] = class475.field6543.method2685(var343, -122).method1830(var344, 121, var345.field6697);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field1364 -= 2;
                    int var346 = field1361[field1364];
                    int var347 = field1361[field1364 + 1];
                    class488 var348 = class71.field952.method1977((byte) 58, var347);
                    if (var348.method2772(113)) {
                        field1354[field1358++] = class173.field2514.method1250(var346, -109).method253((byte) 52, var348.field6701, var347);
                        return;
                    }
                    field1361[field1364++] = class173.field2514.method1250(var346, -119).method254(10, var347, var348.field6697);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var349 = field1361[--field1364];
                class67 var350 = class198.field2828.method2482(var349, 127);
                if (var350.field880 != null && var350.field880.length > 0) {
                    int var351 = 0;
                    int var352 = var350.field894[0];
                    for (int var353 = 1; var353 < var350.field880.length; var353++) {
                        if (var350.field894[var353] > var352) {
                            var351 = var353;
                            var352 = var350.field894[var353];
                        }
                    }
                    field1361[field1364++] = var350.field880[var351];
                    return;
                }
                field1361[field1364++] = var350.field872;
                return;
            }
        } else {
            class78 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class582.method3319((byte) -103, field1361[--field1364]);
            } else {
                var50 = arg1 ? field1353 : field1368;
            }
            if (arg0 == 1300) {
                int var51 = field1361[--field1364] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method605(var51, 0, field1354[--field1358]);
                    return;
                }
                field1358--;
                return;
            }
            if (arg0 == 1301) {
                field1364 -= 2;
                int var52 = field1361[field1364];
                int var53 = field1361[field1364 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field1074 = null;
                    return;
                }
                var50.field1074 = class89.method650(111, var52, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field1361[--field1364];
                if (class262.field3552 != var54 && class546.field7403 != var54 && class487.field6685 != var54) {
                    return;
                }
                var50.field1117 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field1173 = field1361[--field1364];
                return;
            }
            if (arg0 == 1304) {
                var50.field1065 = field1361[--field1364];
                return;
            }
            if (arg0 == 1305) {
                var50.field1101 = field1354[--field1358];
                return;
            }
            if (arg0 == 1306) {
                var50.field1057 = field1354[--field1358];
                return;
            }
            if (arg0 == 1307) {
                var50.field1175 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field1067 = field1361[--field1364];
                var50.field1157 = field1361[--field1364];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field1361[--field1364];
                int var56 = field1361[--field1364];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method599(var56 - 1, 1, var55);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field1140 = field1354[--field1358];
                return;
            }
            if (arg0 == 1311) {
                var50.field1041 = field1361[--field1364];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field1364 -= 3;
                    var57 = field1361[field1364] - 1;
                    var58 = field1361[field1364 + 1];
                    var59 = field1361[field1364 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1364 -= 2;
                    var57 = 10;
                    var58 = field1361[field1364];
                    var59 = field1361[field1364 + 1];
                }
                if (var50.field1164 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field1164 = new byte[11];
                    var50.field1051 = new byte[11];
                    var50.field1087 = new int[11];
                }
                var50.field1164[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field1132 = false;
                    for (int var60 = 0; var60 < var50.field1164.length; var60++) {
                        if (var50.field1164[var60] != 0) {
                            var50.field1132 = true;
                            break;
                        }
                    }
                } else {
                    var50.field1132 = true;
                }
                var50.field1051[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field1080 = field1361[--field1364];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(IZ)V", line = 4495)
    private static final void method712(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1361[field1364++] = class152.field2221;
                return;
            }
            if (arg0 == 5001) {
                field1364 -= 3;
                class152.field2221 = field1361[field1364];
                class586.field8253 = class574.method3277(field1361[field1364 + 1], -2604);
                if (class586.field8253 == null) {
                    class586.field8253 = class193.field2745;
                }
                class332.field4478 = field1361[field1364 + 2];
                field1357++;
                class352 var2 = class290.method1786(98, class199.field2836, class613.field8531);
                var2.field4686.method2817(class152.field2221, true);
                var2.field4686.method2817(class586.field8253.field5979, true);
                var2.field4686.method2817(class332.field4478, true);
                class602.method3388(var2, (byte) 28);
                return;
            }
            if (arg0 == 5002) {
                field1358 -= 2;
                String var3 = field1354[field1358];
                String var4 = field1354[field1358 + 1];
                field1364 -= 2;
                int var5 = field1361[field1364];
                int var6 = field1361[field1364 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field1355++;
                class352 var7 = class290.method1786(98, class199.field2836, class296.field4058);
                var7.field4686.method2817(class705.method3947((byte) -47, var3) + class705.method3947((byte) -47, var4) + 2, true);
                var7.field4686.method2820(-19, var3);
                var7.field4686.method2817(var5 - 1, true);
                var7.field4686.method2817(var6, true);
                var7.field4686.method2820(91, var4);
                class602.method3388(var7, (byte) 28);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field1361[--field1364];
                class492 var9 = class402.method2347((byte) -111, var8);
                String var10 = "";
                if (var9 != null && var9.field6716 != null) {
                    var10 = var9.field6716;
                }
                field1354[field1358++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field1361[--field1364];
                class492 var12 = class402.method2347((byte) -114, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field6719;
                }
                field1361[field1364++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class586.field8253 == null) {
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = class586.field8253.field5979;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field1361[--field1364];
                class352 var15 = class290.method1786(98, class199.field2836, class103.field1452);
                var15.field4686.method2817(var14, true);
                class602.method3388(var15, (byte) 28);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field1354[--field1358];
                method714(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1358 -= 2;
                String var17 = field1354[field1358];
                String var18 = field1354[field1358 + 1];
                if (class296.field4060 != 0 || (!class173.field2517 || class5.field37) && !class511.field7018) {
                    field1360++;
                    class352 var19 = class290.method1786(98, class199.field2836, class115.field1584);
                    var19.field4686.method2817(0, true);
                    int var20 = var19.field4686.field6892;
                    var19.field4686.method2820(-125, var17);
                    class563.method3149(var18, var19.field4686, (byte) -82);
                    var19.field4686.method2847(-8, var19.field4686.field6892 - var20);
                    class602.method3388(var19, (byte) 28);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field1361[--field1364];
                class492 var22 = class402.method2347((byte) -105, var21);
                String var23 = "";
                if (var22 != null && var22.field6724 != null) {
                    var23 = var22.field6724;
                }
                field1354[field1358++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field1361[--field1364];
                class492 var25 = class402.method2347((byte) -98, var24);
                String var26 = "";
                if (var25 != null && var25.field6727 != null) {
                    var26 = var25.field6727;
                }
                field1354[field1358++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field1361[--field1364];
                class492 var28 = class402.method2347((byte) -104, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field6718;
                }
                field1361[field1364++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class143.field2063 == null || class143.field2063.field9682 == null) {
                    var30 = class473.field6503;
                } else {
                    var30 = class143.field2063.method3846(true, (byte) -54);
                }
                field1354[field1358++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field1361[field1364++] = class332.field4478;
                return;
            }
            if (arg0 == 5017) {
                field1361[field1364++] = class100.method728((byte) -75);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field1361[--field1364];
                class492 var32 = class402.method2347((byte) -119, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field6725;
                }
                field1361[field1364++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field1361[--field1364];
                class492 var35 = class402.method2347((byte) -114, var34);
                String var36 = "";
                if (var35 != null && var35.field6721 != null) {
                    var36 = var35.field6721;
                }
                field1354[field1358++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class143.field2063 == null || class143.field2063.field9682 == null) {
                    var37 = class473.field6503;
                } else {
                    var37 = class143.field2063.method3849(false, (byte) -66);
                }
                field1354[field1358++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field1361[--field1364];
                class492 var39 = class402.method2347((byte) -106, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field6728;
                }
                field1361[field1364++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field1361[--field1364];
                class492 var42 = class402.method2347((byte) -101, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field6714;
                }
                field1361[field1364++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field1361[--field1364];
                class492 var45 = class402.method2347((byte) -109, var44);
                String var46 = "";
                if (var45 != null && var45.field6722 != null) {
                    var46 = var45.field6722;
                }
                field1354[field1358++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field1361[--field1364];
                field1354[field1358++] = class292.field4019.method899(var47, 0).field106;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field1361[--field1364];
                class11 var49 = class292.field4019.method899(var48, 0);
                if (var49.field104 == null) {
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = var49.field104.length;
                return;
            }
            if (arg0 == 5052) {
                field1364 -= 2;
                int var50 = field1361[field1364];
                int var51 = field1361[field1364 + 1];
                class11 var52 = class292.field4019.method899(var50, 0);
                int var53 = var52.field104[var51];
                field1361[field1364++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field1361[--field1364];
                class11 var55 = class292.field4019.method899(var54, 0);
                if (var55.field100 == null) {
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = var55.field100.length;
                return;
            }
            if (arg0 == 5054) {
                field1364 -= 2;
                int var56 = field1361[field1364];
                int var57 = field1361[field1364 + 1];
                field1361[field1364++] = class292.field4019.method899(var56, 0).field100[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field1361[--field1364];
                field1354[field1358++] = class213.field2984.method3922(var58, false).method3287(0);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field1361[--field1364];
                class575 var60 = class213.field2984.method3922(var59, false);
                if (var60.field8134 == null) {
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = var60.field8134.length;
                return;
            }
            if (arg0 == 5057) {
                field1364 -= 2;
                int var61 = field1361[field1364];
                int var62 = field1361[field1364 + 1];
                field1361[field1364++] = class213.field2984.method3922(var61, false).field8134[var62];
                return;
            }
            if (arg0 == 5058) {
                field1345 = new class611();
                field1345.field8475 = field1361[--field1364];
                field1345.field8477 = class213.field2984.method3922(field1345.field8475, false);
                field1345.field8471 = new int[field1345.field8477.method3283(false)];
                return;
            }
            if (arg0 == 5059) {
                field1363++;
                class352 var63 = class290.method1786(98, class199.field2836, class648.field8950);
                var63.field4686.method2817(0, true);
                int var64 = var63.field4686.field6892;
                var63.field4686.method2817(0, true);
                var63.field4686.method2837(field1345.field8475, -2);
                field1345.field8477.method3279(field1345.field8471, var63.field4686, 0);
                var63.field4686.method2847(-8, var63.field4686.field6892 - var64);
                class602.method3388(var63, (byte) 28);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field1354[--field1358];
                field1346++;
                class352 var66 = class290.method1786(98, class199.field2836, class68.field925);
                var66.field4686.method2817(0, true);
                int var67 = var66.field4686.field6892;
                var66.field4686.method2820(-17, var65);
                var66.field4686.method2837(field1345.field8475, -2);
                field1345.field8477.method3279(field1345.field8471, var66.field4686, 0);
                var66.field4686.method2847(-8, var66.field4686.field6892 - var67);
                class602.method3388(var66, (byte) 28);
                return;
            }
            if (arg0 == 5061) {
                field1363++;
                class352 var68 = class290.method1786(98, class199.field2836, class648.field8950);
                var68.field4686.method2817(0, true);
                int var69 = var68.field4686.field6892;
                var68.field4686.method2817(1, true);
                var68.field4686.method2837(field1345.field8475, -2);
                field1345.field8477.method3279(field1345.field8471, var68.field4686, 0);
                var68.field4686.method2847(-8, var68.field4686.field6892 - var69);
                class602.method3388(var68, (byte) 28);
                return;
            }
            if (arg0 == 5062) {
                field1364 -= 2;
                int var70 = field1361[field1364];
                int var71 = field1361[field1364 + 1];
                field1361[field1364++] = class292.field4019.method899(var70, 0).field111[var71];
                return;
            }
            if (arg0 == 5063) {
                field1364 -= 2;
                int var72 = field1361[field1364];
                int var73 = field1361[field1364 + 1];
                field1361[field1364++] = class292.field4019.method899(var72, 0).field103[var73];
                return;
            }
            if (arg0 == 5064) {
                field1364 -= 2;
                int var74 = field1361[field1364];
                int var75 = field1361[field1364 + 1];
                if (var75 == -1) {
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = class292.field4019.method899(var74, 0).method52(-1, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field1364 -= 2;
                int var76 = field1361[field1364];
                int var77 = field1361[field1364 + 1];
                if (var77 == -1) {
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = class292.field4019.method899(var76, 0).method55((char) var77, (byte) 126);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field1361[--field1364];
                field1361[field1364++] = class213.field2984.method3922(var78, false).method3283(false);
                return;
            }
            if (arg0 == 5067) {
                field1364 -= 2;
                int var79 = field1361[field1364];
                int var80 = field1361[field1364 + 1];
                int var81 = class213.field2984.method3922(var79, false).method3286(0, var80).field8184;
                field1361[field1364++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field1364 -= 2;
                int var82 = field1361[field1364];
                int var83 = field1361[field1364 + 1];
                field1345.field8471[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field1364 -= 2;
                int var84 = field1361[field1364];
                int var85 = field1361[field1364 + 1];
                field1345.field8471[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field1364 -= 3;
                int var86 = field1361[field1364];
                int var87 = field1361[field1364 + 1];
                int var88 = field1361[field1364 + 2];
                class575 var89 = class213.field2984.method3922(var86, false);
                if (var89.method3286(0, var87).field8184 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1361[field1364++] = var89.method3284(var87, var88, 80);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field1354[--field1358];
                boolean var91 = field1361[--field1364] == 1;
                class515.method2943(var90, var91, 20803);
                field1361[field1364++] = class495.field6745;
                return;
            }
            if (arg0 == 5072) {
                if (class657.field9135 != null && class592.field8294 < class495.field6745) {
                    field1361[field1364++] = class657.field9135[class592.field8294++] & 0xFFFF;
                    return;
                }
                field1361[field1364++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class592.field8294 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class353.field4698.method34(86, -16215)) {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class353.field4698.method34(82, -16215)) {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class353.field4698.method34(81, -16215)) {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class507.method2900(-123, field1361[--field1364]);
                return;
            }
            if (arg0 == 5201) {
                field1361[field1364++] = class295.method1800(16);
                return;
            }
            if (arg0 == 5205) {
                class163.method1145(118, field1361[--field1364], -1, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field1361[--field1364];
                class112 var93 = class510.method2912(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = var93.field1550;
                return;
            }
            if (arg0 == 5207) {
                class112 var94 = class510.method2931(field1361[--field1364]);
                if (var94 != null && var94.field1560 != null) {
                    field1354[field1358++] = var94.field1560;
                    return;
                }
                field1354[field1358++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1361[field1364++] = class609.field8460;
                field1361[field1364++] = class495.field6743;
                return;
            }
            if (arg0 == 5209) {
                field1361[field1364++] = class510.field7003 + class266.field3598;
                field1361[field1364++] = class670.field9403 + class510.field7012;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field1361[--field1364];
                class112 var96 = class510.method2931(var95);
                if (var96 == null) {
                    field1361[field1364++] = 0;
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = var96.field1558 >> 14 & 0x3FFF;
                field1361[field1364++] = var96.field1558 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field1361[--field1364];
                class112 var98 = class510.method2931(var97);
                if (var98 == null) {
                    field1361[field1364++] = 0;
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = var98.field1545 - var98.field1562;
                field1361[field1364++] = var98.field1554 - var98.field1547;
                return;
            }
            if (arg0 == 5212) {
                class163 var99 = class480.method2699((byte) -25);
                if (var99 == null) {
                    field1361[field1364++] = -1;
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = var99.field2338;
                int var100 = var99.field2342 << 28 | class510.field7003 + var99.field2344 << 14 | class510.field7012 + var99.field2343;
                field1361[field1364++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class163 var101 = class485.method2758((byte) -55);
                if (var101 == null) {
                    field1361[field1364++] = -1;
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = var101.field2338;
                int var102 = var101.field2342 << 28 | class510.field7003 + var101.field2344 << 14 | class510.field7012 + var101.field2343;
                field1361[field1364++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field1361[--field1364];
                class112 var104 = class73.method581((byte) 90);
                if (var104 != null) {
                    boolean var105 = var104.method814(var103 & 0x3FFF, var103 >> 28 & 0x3, field1372, var103 >> 14 & 0x3FFF, -1);
                    if (var105) {
                        class314.method1904(108, field1372[2], field1372[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1364 -= 2;
                int var106 = field1361[field1364];
                int var107 = field1361[field1364 + 1];
                class367 var108 = class510.method2928(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class112 var110 = (class112) var108.method2126(-1); var110 != null; var110 = (class112) var108.method2117(100)) {
                    if (var110.field1550 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field1361[--field1364];
                class112 var112 = class510.method2931(var111);
                if (var112 == null) {
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = var112.field1553;
                return;
            }
            if (arg0 == 5220) {
                field1361[field1364++] = class606.field8432 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field1361[--field1364];
                class314.method1904(119, var113 & 0x3FFF, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class112 var114 = class73.method581((byte) 91);
                if (var114 != null) {
                    boolean var115 = var114.method810(field1372, class510.field7003 + class266.field3598, -1, class670.field9403 + class510.field7012);
                    if (var115) {
                        field1361[field1364++] = field1372[1];
                        field1361[field1364++] = field1372[2];
                        return;
                    }
                    field1361[field1364++] = -1;
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = -1;
                field1361[field1364++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1364 -= 2;
                int var116 = field1361[field1364];
                int var117 = field1361[field1364 + 1];
                class163.method1145(-8, var116, var117 & 0x3FFF, var117 >> 14 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field1361[--field1364];
                class112 var119 = class73.method581((byte) 89);
                if (var119 != null) {
                    boolean var120 = var119.method814(var118 & 0x3FFF, var118 >> 28 & 0x3, field1372, var118 >> 14 & 0x3FFF, -1);
                    if (var120) {
                        field1361[field1364++] = field1372[1];
                        field1361[field1364++] = field1372[2];
                        return;
                    }
                    field1361[field1364++] = -1;
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = -1;
                field1361[field1364++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field1361[--field1364];
                class112 var122 = class73.method581((byte) 108);
                if (var122 != null) {
                    boolean var123 = var122.method810(field1372, var121 >> 14 & 0x3FFF, -1, var121 & 0x3FFF);
                    if (var123) {
                        field1361[field1364++] = field1372[1];
                        field1361[field1364++] = field1372[2];
                        return;
                    }
                    field1361[field1364++] = -1;
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = -1;
                field1361[field1364++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class390.method2291(field1361[--field1364], 100);
                return;
            }
            if (arg0 == 5227) {
                field1364 -= 2;
                int var124 = field1361[field1364];
                int var125 = field1361[field1364 + 1];
                class163.method1145(120, var124, var125 & 0x3FFF, var125 >> 14 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class34.field421 = field1361[--field1364] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1361[field1364++] = class34.field421 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field1361[--field1364];
                class260.method1594((byte) -115, var126);
                return;
            }
            if (arg0 == 5231) {
                field1364 -= 2;
                int var127 = field1361[field1364];
                boolean var128 = field1361[field1364 + 1] == 1;
                if (class207.field2905 != null) {
                    class401 var129 = class207.field2905.method970((byte) 89, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method2340(102);
                        return;
                    }
                    if (var129 == null && var128) {
                        class401 var130 = new class401();
                        class207.field2905.method968((long) var127, var130, -1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field1361[--field1364];
                if (class207.field2905 != null) {
                    class401 var132 = class207.field2905.method970((byte) 89, (long) var131);
                    field1361[field1364++] = var132 == null ? 0 : 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1364 -= 2;
                int var133 = field1361[field1364];
                boolean var134 = field1361[field1364 + 1] == 1;
                if (class109.field1504 != null) {
                    class401 var135 = class109.field1504.method970((byte) 89, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method2340(96);
                        return;
                    }
                    if (var135 == null && var134) {
                        class401 var136 = new class401();
                        class109.field1504.method968((long) var133, var136, -1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field1361[--field1364];
                if (class109.field1504 != null) {
                    class401 var138 = class109.field1504.method970((byte) 89, (long) var137);
                    field1361[field1364++] = var138 == null ? 0 : 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1361[field1364++] = class510.field6979 == null ? -1 : class510.field6979.field1550;
                return;
            }
            if (arg0 == 5236) {
                field1364 -= 2;
                int var139 = field1361[field1364];
                int var140 = field1361[field1364 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class472.method2661(var141, var142, var139, (byte) -99);
                if (var143 < 0) {
                    field1361[field1364++] = -1;
                    return;
                }
                field1361[field1364++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class328.method1952(-23176);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1364 -= 2;
                int var144 = field1361[field1364];
                int var145 = field1361[field1364 + 1];
                class75.method584(var145, false, 3, var144, (byte) 107);
                field1361[field1364++] = class54.field613 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class54.field613 != null) {
                    class75.method584(-1, false, class366.field4875.field9370, -1, (byte) -105);
                }
                return;
            }
            if (arg0 == 5302) {
                class483[] var146 = class185.method1277((byte) -127);
                field1361[field1364++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field1361[--field1364];
                class483[] var148 = class185.method1277((byte) -83);
                field1361[field1364++] = var148[var147].field6634;
                field1361[field1364++] = var148[var147].field6642;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class366.field4875.field9355;
                int var150 = class366.field4875.field9374;
                int var151 = -1;
                class483[] var152 = class185.method1277((byte) -108);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class483 var154 = var152[var153];
                    if (var154.field6634 == var149 && var154.field6642 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field1361[field1364++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field1361[field1364++] = class317.method1913(1);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field1361[--field1364];
                if (var155 >= 1 && var155 <= 2) {
                    class75.method584(-1, false, var155, -1, (byte) 62);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1361[field1364++] = class366.field4875.field9370;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field1361[--field1364];
                if (var156 >= 1 && var156 <= 2) {
                    class366.field4875.field9370 = var156;
                    class366.field4875.method543(class543.field7374, (byte) 39);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1358 -= 2;
                String var157 = field1354[field1358];
                String var158 = field1354[field1358 + 1];
                int var159 = field1361[--field1364];
                field1347++;
                class352 var160 = class290.method1786(98, class199.field2836, class238.field3279);
                var160.field4686.method2817(class705.method3947((byte) -47, var157) + class705.method3947((byte) -47, var158) + 1, true);
                var160.field4686.method2820(127, var157);
                var160.field4686.method2820(92, var158);
                var160.field4686.method2817(var159, true);
                class602.method3388(var160, (byte) 28);
                return;
            }
            if (arg0 == 5401) {
                field1364 -= 2;
                class43.field517[field1361[field1364]] = (short) class622.method3457(false, field1361[field1364 + 1]);
                class599.field8366.method3950(-82);
                class599.field8366.method3953(-20688);
                class347.field4640.method2577((byte) 111);
                class314.method1905(-101);
                return;
            }
            if (arg0 == 5405) {
                field1364 -= 2;
                int var161 = field1361[field1364];
                int var162 = field1361[field1364 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class44.field536[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1364 -= 7;
                int var163 = field1361[field1364];
                int var164 = field1361[field1364 + 1] << 1;
                int var165 = field1361[field1364 + 2];
                int var166 = field1361[field1364 + 3];
                int var167 = field1361[field1364 + 4];
                int var168 = field1361[field1364 + 5];
                int var169 = field1361[field1364 + 6];
                if (var163 >= 0 && var163 < 2 && class44.field536[var163] != null && var164 >= 0 && var164 < class44.field536[var163].length) {
                    class44.field536[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class44.field536[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class44.field536[field1361[--field1364]].length >> 1;
                field1361[field1364++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class54.field613 != null) {
                    class75.method584(-1, false, class366.field4875.field9370, -1, (byte) -59);
                }
                if (class130.field1868 != null) {
                    class235.method1477(-28971);
                    System.exit(0);
                    return;
                }
                String var171 = class623.field8647 == null ? class503.method2882(-1) : class623.field8647;
                class556.method3116(false, var171, false, class503.field6917 == 1, class543.field7374);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class166.field2421 != null) {
                    if (class166.field2421.field946 == null) {
                        var172 = class263.method1608(class166.field2421.field942, (byte) 35);
                    } else {
                        var172 = (String) class166.field2421.field946;
                    }
                }
                field1354[field1358++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field1361[field1364++] = class543.field7374.field1456 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class54.field613 != null) {
                    class75.method584(-1, false, class366.field4875.field9370, -1, (byte) -88);
                }
                String var173 = field1354[--field1358];
                boolean var174 = field1361[--field1364] == 1;
                String var175 = class503.method2882(-1) + var173;
                class556.method3116(var174, var175, false, class503.field6917 == 1, class543.field7374);
                return;
            }
            if (arg0 == 5422) {
                field1358 -= 2;
                String var176 = field1354[field1358];
                String var177 = field1354[field1358 + 1];
                int var178 = field1361[--field1364];
                if (var176.length() > 0) {
                    if (class293.field4025 == null) {
                        class293.field4025 = new String[class313.field4333[class219.field3065.field5857]];
                    }
                    class293.field4025[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class653.field9089 == null) {
                        class653.field9089 = new String[class313.field4333[class219.field3065.field5857]];
                    }
                    class653.field9089[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1354[--field1358]);
                return;
            }
            if (arg0 == 5424) {
                field1364 -= 11;
                class281.field3836 = field1361[field1364];
                class113.field1566 = field1361[field1364 + 1];
                class657.field9138 = field1361[field1364 + 2];
                class202.field2858 = field1361[field1364 + 3];
                class266.field3607 = field1361[field1364 + 4];
                class651.field9034 = field1361[field1364 + 5];
                class158.field2310 = field1361[field1364 + 6];
                class164.field2345 = field1361[field1364 + 7];
                class615.field8590 = field1361[field1364 + 8];
                class698.field9904 = field1361[field1364 + 9];
                class285.field3919 = field1361[field1364 + 10];
                class508.field6961.method3623(-84, class266.field3607);
                class508.field6961.method3623(-106, class651.field9034);
                class508.field6961.method3623(-110, class158.field2310);
                class508.field6961.method3623(-93, class164.field2345);
                class508.field6961.method3623(-78, class615.field8590);
                class263.field3568 = null;
                class474.field6516 = null;
                class655.field9114 = null;
                class584.field8234 = null;
                class564.field7623 = null;
                class308.field4265 = null;
                class474.field6524 = null;
                class390.field5520 = null;
                class287.field3951 = true;
                return;
            }
            if (arg0 == 5425) {
                class187.method1286(-2);
                class287.field3951 = false;
                return;
            }
            if (arg0 == 5426) {
                field1364 -= 2;
                class236.field3252 = field1361[field1364];
                class76.field1005 = field1361[field1364 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1364 -= 2;
                class180.field2610 = field1361[field1364 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1364 -= 2;
                int var179 = field1361[field1364];
                int var180 = field1361[field1364 + 1];
                field1361[field1364++] = class68.method571(var180, 5, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class453.method2573(field1354[--field1358], false, false, true);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class204.method1329((byte) -57, class59.field668, "accountcreated");
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class204.method1329((byte) -57, class59.field668, "accountcreatestarted");
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class65.field852 != null) {
                    Transferable var182 = class65.field852.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var318) {
                        }
                    }
                }
                field1354[field1358++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1364 -= 4;
                int var183 = field1361[field1364];
                int var184 = field1361[field1364 + 1];
                int var185 = field1361[field1364 + 2];
                int var186 = field1361[field1364 + 3];
                class88.method644(100, (var183 >> 14 & 0x3FFF) - class498.field6774, false, var186, var185, var184 << 2, (var183 & 0x3FFF) - class613.field8555);
                return;
            }
            if (arg0 == 5501) {
                field1364 -= 4;
                int var187 = field1361[field1364];
                int var188 = field1361[field1364 + 1];
                int var189 = field1361[field1364 + 2];
                int var190 = field1361[field1364 + 3];
                class361.method2062((var187 & 0x3FFF) - class613.field8555, false, var189, var190, (var187 >> 14 & 0x3FFF) - class498.field6774, var188 << 2);
                return;
            }
            if (arg0 == 5502) {
                field1364 -= 6;
                int var191 = field1361[field1364];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class552.field7454 = var191;
                int var192 = field1361[field1364 + 1];
                if (var192 + 1 >= class44.field536[class552.field7454].length >> 1) {
                    throw new RuntimeException();
                }
                class4.field31 = var192;
                class308.field4251 = 0;
                class426.field5964 = field1361[field1364 + 2];
                class378.field5038 = field1361[field1364 + 3];
                int var193 = field1361[field1364 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class412.field5849 = var193;
                int var194 = field1361[field1364 + 5];
                if (var194 + 1 >= class44.field536[class412.field5849].length >> 1) {
                    throw new RuntimeException();
                }
                class112.field1549 = var194;
                class203.field2863 = 3;
                class560.field7547 = -1;
                class199.field2832 = -1;
                return;
            }
            if (arg0 == 5503) {
                class377.method2159(false);
                return;
            }
            if (arg0 == 5504) {
                field1364 -= 2;
                class615.method3438(field1361[field1364 + 1], field1361[field1364], (byte) 106, 0);
                return;
            }
            if (arg0 == 5505) {
                field1361[field1364++] = (int) class228.field3168 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1361[field1364++] = (int) class705.field9964 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class185.method1276(-124);
                return;
            }
            if (arg0 == 5508) {
                class247.method1530(-117);
                return;
            }
            if (arg0 == 5509) {
                class496.method2793(-112);
                return;
            }
            if (arg0 == 5510) {
                class544.method3068(25298);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field1361[--field1364];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class498.field6774;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class401.field5620) {
                    var198 = class401.field5620;
                }
                int var199 = var197 - class613.field8555;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class257.field3508) {
                    var199 = class257.field3508;
                }
                class247.field3386 = (var198 << 9) + 256;
                class323.field4403 = (var199 << 9) + 256;
                class203.field2863 = 4;
                class560.field7547 = -1;
                class199.field2832 = -1;
                return;
            }
            if (arg0 == 5512) {
                class637.method3561(-1);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field1361[--field1364];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class498.field6774;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class401.field5620) {
                        var203 = class401.field5620;
                    }
                    int var204 = var202 - class613.field8555;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class257.field3508) {
                        var204 = class257.field3508;
                    }
                    class199.field2832 = (var203 << 9) + 256;
                    class560.field7547 = (var204 << 9) + 256;
                    return;
                }
                class199.field2832 = -1;
                class560.field7547 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1358 -= 2;
                String var205 = field1354[field1358];
                String var206 = field1354[field1358 + 1];
                int var207 = field1361[--field1364];
                if (class285.field3921 != 3) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    class473.field6503 = var205;
                    class627.field8691 = var206;
                    class124.field1793 = var207;
                    class178.method1232(6, (byte) 123);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class648.method3645((byte) -116);
                return;
            }
            if (arg0 == 5602) {
                if (class521.field7090 == 0) {
                    class36.field430 = -2;
                    class422.field5942 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field1364 -= 4;
                if (class285.field3921 != 3) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    class9.method45(field1361[field1364 + 1], (byte) 110, field1361[field1364 + 3], field1361[field1364 + 2], field1361[field1364]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field1358--;
                if (class285.field3921 != 3) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    class609.method3417((byte) 13, class664.method3757(-117, field1354[field1358]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1358 -= 2;
                if (class285.field3921 != 3) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    class95.method695(false, class664.method3757(-119, field1354[field1358]), field1354[field1358 + 1], 81);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class263.field3571 == 0) {
                    class610.field8467 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1361[field1364++] = class422.field5942;
                return;
            }
            if (arg0 == 5608) {
                field1361[field1364++] = class655.field9112;
                return;
            }
            if (arg0 == 5609) {
                field1361[field1364++] = class610.field8467;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field1354[field1358++] = class61.field691 == null || class61.field691.length <= var208 ? "" : class437.method2504(class61.field691[var208], (byte) -1);
                }
                class61.field691 = null;
                return;
            }
            if (arg0 == 5611) {
                field1361[field1364++] = class676.field9655;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field1361[--field1364];
                if (class285.field3921 != 7) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    if (class589.field8272 != null) {
                        class589.field8272.method1935(0);
                        class589.field8272 = null;
                    }
                    class124.field1793 = var209;
                    class178.method1232(9, (byte) 81);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field1361[field1364++] = class422.field5942;
                return;
            }
            if (arg0 == 5615) {
                field1358 -= 2;
                String var210 = field1354[field1358];
                String var211 = field1354[field1358 + 1];
                if (class285.field3921 != 3) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    if (class589.field8272 != null) {
                        class589.field8272.method1935(0);
                        class589.field8272 = null;
                    }
                    class473.field6503 = var210;
                    class627.field8691 = var211;
                    class178.method1232(5, (byte) 86);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class9.method35((byte) 119, false);
                return;
            }
            if (arg0 == 5617) {
                field1361[field1364++] = class36.field430;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field1361[--field1364];
                class339.method1985(false, true, var212);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field1361[--field1364];
                class339.method1985(true, true, var213);
                return;
            }
            if (arg0 == 5620) {
                class467.method2639((byte) -95);
                if (class659.field9152 != "" && class659.field9152 != "") {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field1358 -= 2;
                if (class285.field3921 != 3) {
                    return;
                }
                if (class521.field7090 == 0 && class263.field3571 == 0) {
                    class95.method695(true, class664.method3757(-49, field1354[field1358]), field1354[field1358 + 1], 127);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class70 var214 = class543.field7374.method763(false, (byte) 123, "3");
                while (var214.field948 == 0) {
                    class519.method2960(-72, 1L);
                }
                if (var214.field948 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class181 var215 = (class181) var214.field946;
                if (var215.method1249(-6111).exists()) {
                    class501 var216 = new class501(50);
                    try {
                        var215.method1242(22, var216.field6855, 50, 0);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method1248(0);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class650.field9030 != null) {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field1361[field1364++] = (int) (class365.field4859 >> 32);
                field1361[field1364++] = (int) (class365.field4859 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field1361[--field1364];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class366.field4875.field9345 = var217;
                class115.method822(-105);
                class366.field4875.method543(class543.field7374, (byte) 32);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6002) {
                class366.field4875.method544(-104, field1361[--field1364] == 1);
                class115.method822(-105);
                class603.method3394(-4);
                class366.field4875.method543(class543.field7374, (byte) 56);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6003) {
                class366.field4875.field9365 = field1361[--field1364] == 1;
                class603.method3394(-4);
                class366.field4875.method543(class543.field7374, (byte) 88);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6005) {
                class366.field4875.field9373 = field1361[--field1364] == 1;
                class115.method822(-117);
                class366.field4875.method543(class543.field7374, (byte) 79);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6006) {
                class366.field4875.field9371 = field1361[--field1364] == 1;
                class334.field4506.method99(!class366.field4875.field9371);
                class366.field4875.method543(class543.field7374, (byte) 108);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6007) {
                class366.field4875.field9360 = field1361[--field1364];
                class366.field4875.method543(class543.field7374, (byte) 93);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6008) {
                class366.field4875.field9375 = field1361[--field1364] == 1;
                class366.field4875.method543(class543.field7374, (byte) 58);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6009) {
                class366.field4875.field9366 = field1361[--field1364] == 1;
                class115.method822(-58);
                class366.field4875.method543(class543.field7374, (byte) 74);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6010) {
                class366.field4875.field9351 = field1361[--field1364] == 1;
                class366.field4875.method543(class543.field7374, (byte) 37);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field1361[--field1364];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class366.field4875.method3769(var218, true, class503.field6917);
                class115.method822(-85);
                class366.field4875.method543(class543.field7374, (byte) 122);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6012) {
                class366.field4875.method3771(127, field1361[--field1364] == 1, class503.field6917);
                class628.method3511((byte) -108);
                class127.method906(4096);
                class366.field4875.method543(class543.field7374, (byte) 51);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6014) {
                class366.field4875.field9353 = field1361[--field1364] == 1;
                class115.method822(-39);
                class366.field4875.method543(class543.field7374, (byte) 77);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6015) {
                class366.field4875.field9348 = field1361[--field1364] == 1;
                class115.method822(-61);
                class366.field4875.method543(class543.field7374, (byte) 35);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field1361[--field1364];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class366.field4875.field9347 = var219;
                class203.method1327((byte) 63, class503.field6917);
                class366.field4875.method543(class543.field7374, (byte) 119);
                return;
            }
            if (arg0 == 6017) {
                class366.field4875.field9354 = field1361[--field1364] == 1;
                class173.method1223(1);
                class366.field4875.method543(class543.field7374, (byte) 69);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field1361[--field1364];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class366.field4875.field9346 = var220;
                class366.field4875.method543(class543.field7374, (byte) 102);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field1361[--field1364];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class366.field4875.field9352 != var221) {
                    if (class366.field4875.field9352 == 0 && class507.field6950 != -1) {
                        class56.method471(class507.field6950, var221, 0, false, -1, class481.field6621);
                        class167.method1179((byte) -110);
                        class636.field8795 = false;
                    } else if (var221 == 0) {
                        class270.method1638((byte) -89);
                        class636.field8795 = false;
                    } else {
                        class345.method2010((byte) -121, var221);
                    }
                    class366.field4875.field9352 = var221;
                }
                class366.field4875.method543(class543.field7374, (byte) 99);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field1361[--field1364];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class366.field4875.field9364 = var222;
                class366.field4875.method543(class543.field7374, (byte) 120);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6021) {
                class366.field4875.field771 = field1361[--field1364] == 1;
                class603.method3394(-4);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field1361[--field1364];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class651.field9037 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class562.method3143(var223, 10023);
                class366.field4875.method543(class543.field7374, (byte) 45);
                class186.field2709 = false;
                field1361[field1364++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field1361[--field1364];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class366.field4875.field9377 = var225;
                class366.field4875.method543(class543.field7374, (byte) 125);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field1361[--field1364];
                if (var226 < 0 || var226 > class27.method262(-97, class651.field9037)) {
                    var226 = 0;
                }
                class366.field4875.field9368 = var226;
                class366.field4875.method543(class543.field7374, (byte) 98);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field1361[--field1364];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class631.method3537(var227 == 1, 102);
                return;
            }
            if (arg0 == 6028) {
                class366.field4875.field9357 = field1361[--field1364] != 0;
                class366.field4875.method543(class543.field7374, (byte) 108);
                return;
            }
            if (arg0 == 6029) {
                class366.field4875.field9360 = field1361[--field1364];
                class366.field4875.method543(class543.field7374, (byte) 117);
                return;
            }
            if (arg0 == 6030) {
                class366.field4875.field9356 = field1361[--field1364] != 0;
                class366.field4875.method543(class543.field7374, (byte) 114);
                class115.method822(-76);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field1361[--field1364];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class203.method1327((byte) 63, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field1361[--field1364];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class366.field4875.field9372 = var229;
                class366.field4875.method543(class543.field7374, (byte) 57);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field1361[--field1364];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class366.field4875.field9380 = var230;
                class366.field4875.method543(class543.field7374, (byte) 76);
                return;
            }
            if (arg0 == 6034) {
                class366.field4875.field9344 = field1361[--field1364] == 1;
                class366.field4875.method543(class543.field7374, (byte) 62);
                class628.method3511((byte) -108);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6035) {
                class366.field4875.field764 = field1361[--field1364] == 1;
                class115.method822(-57);
                class603.method3394(-4);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field1361[--field1364];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class366.field4875.method550(var231, -102);
                class366.field4875.method543(class543.field7374, (byte) 97);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field1361[--field1364];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class366.field4875.field9381 = var232;
                class366.field4875.method543(class543.field7374, (byte) 31);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field1361[--field1364];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class366.field4875.field9359 != var233 && class507.field6950 == class176.field2533) {
                    if (class366.field4875.field9359 == 0) {
                        class56.method471(class507.field6950, var233, 0, false, -1, class481.field6621);
                        class167.method1179((byte) -127);
                        class636.field8795 = false;
                    } else if (var233 == 0) {
                        class270.method1638((byte) 124);
                        class636.field8795 = false;
                    } else {
                        class345.method2010((byte) 85, var233);
                    }
                }
                class366.field4875.field9359 = var233;
                class366.field4875.method543(class543.field7374, (byte) 92);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field1361[--field1364];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class366.field4875.field9336 != var234) {
                    class366.field4875.field9336 = var234;
                    class366.field4875.method543(class543.field7374, (byte) 124);
                    class186.field2709 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1361[field1364++] = class366.field4875.field9345;
                return;
            }
            if (arg0 == 6102) {
                field1361[field1364++] = class366.field4875.method540(class503.field6917, (byte) -103) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1361[field1364++] = class366.field4875.field9365 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1361[field1364++] = class366.field4875.field9373 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field1361[field1364++] = class366.field4875.field9371 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1361[field1364++] = class366.field4875.field9360;
                return;
            }
            if (arg0 == 6108) {
                field1361[field1364++] = class366.field4875.field9375 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field1361[field1364++] = class366.field4875.field9366 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1361[field1364++] = class366.field4875.field9351 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1361[field1364++] = class366.field4875.method3770(class503.field6917, true);
                return;
            }
            if (arg0 == 6112) {
                field1361[field1364++] = class366.field4875.method3766(class503.field6917, (byte) -115) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1361[field1364++] = class366.field4875.field9353 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1361[field1364++] = class366.field4875.field9348 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1361[field1364++] = class366.field4875.field9347;
                return;
            }
            if (arg0 == 6117) {
                field1361[field1364++] = class366.field4875.field9354 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1361[field1364++] = class366.field4875.field9346;
                return;
            }
            if (arg0 == 6119) {
                field1361[field1364++] = class366.field4875.field9352;
                return;
            }
            if (arg0 == 6120) {
                field1361[field1364++] = class366.field4875.field9364;
                return;
            }
            if (arg0 == 6121) {
                field1361[field1364++] = class334.field4506.method130() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field1361[field1364++] = class546.method3073(2);
                return;
            }
            if (arg0 == 6124) {
                field1361[field1364++] = class366.field4875.field9377;
                return;
            }
            if (arg0 == 6125) {
                field1361[field1364++] = class366.field4875.field9368;
                return;
            }
            if (arg0 == 6126) {
                field1361[field1364++] = class334.field4506.method189() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field1361[field1364++] = class366.field4875.field9340 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1361[field1364++] = class366.field4875.field9357 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1361[field1364++] = class366.field4875.field9360;
                return;
            }
            if (arg0 == 6130) {
                field1361[field1364++] = class366.field4875.field9356 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1361[field1364++] = class503.field6917;
                return;
            }
            if (arg0 == 6132) {
                field1361[field1364++] = class366.field4875.field9372;
                return;
            }
            if (arg0 == 6133) {
                field1361[field1364++] = class543.field7374.field1456 && !class543.field7374.field1460 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field1361[field1364++] = class27.method262(-97, class651.field9037);
                return;
            }
            if (arg0 == 6135) {
                field1361[field1364++] = class366.field4875.field9380;
                return;
            }
            if (arg0 == 6136) {
                field1361[field1364++] = class366.field4875.field9344 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field1361[field1364++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field1361[field1364++] = class659.method3699(200, 500, class503.field6917);
                return;
            }
            if (arg0 == 6139) {
                field1361[field1364++] = class366.field4875.method534(1, class503.field6917);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class539.method3047(class503.field6917, true) && class651.field9037 < 96) {
                    var236 = 1;
                }
                field1361[field1364++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class651.field9037 < 96) {
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field1361[field1364++] = class366.field4875.field9381;
                return;
            }
            if (arg0 == 6143) {
                field1361[field1364++] = class366.field4875.field9359;
                return;
            }
            if (arg0 == 6144) {
                field1361[field1364++] = class214.field3017 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field1361[field1364++] = class366.field4875.field9336;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1364 -= 2;
                class519.field7062 = (short) field1361[field1364];
                if (class519.field7062 <= 0) {
                    class519.field7062 = 256;
                }
                class31.field396 = (short) field1361[field1364 + 1];
                if (class31.field396 <= 0) {
                    class31.field396 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1364 -= 2;
                class273.field3745 = (short) field1361[field1364];
                if (class273.field3745 <= 0) {
                    class273.field3745 = 256;
                }
                class280.field3833 = (short) field1361[field1364 + 1];
                if (class280.field3833 <= 0) {
                    class280.field3833 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1364 -= 4;
                class230.field3186 = (short) field1361[field1364];
                if (class230.field3186 <= 0) {
                    class230.field3186 = 1;
                }
                class272.field3705 = (short) field1361[field1364 + 1];
                if (class272.field3705 <= 0) {
                    class272.field3705 = 32767;
                } else if (class272.field3705 < class230.field3186) {
                    class272.field3705 = class230.field3186;
                }
                class119.field1614 = (short) field1361[field1364 + 2];
                if (class119.field1614 <= 0) {
                    class119.field1614 = 1;
                }
                class518.field7051 = (short) field1361[field1364 + 3];
                if (class518.field7051 <= 0) {
                    class518.field7051 = 32767;
                    return;
                }
                if (class518.field7051 < class119.field1614) {
                    class518.field7051 = class119.field1614;
                }
                return;
            }
            if (arg0 == 6203) {
                class613.method3428(0, class685.field9775.field1050, false, false, class685.field9775.field1104, 0);
                field1361[field1364++] = class369.field4967;
                field1361[field1364++] = class689.field9824;
                return;
            }
            if (arg0 == 6204) {
                field1361[field1364++] = class273.field3745;
                field1361[field1364++] = class280.field3833;
                return;
            }
            if (arg0 == 6205) {
                field1361[field1364++] = class519.field7062;
                field1361[field1364++] = class31.field396;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1361[field1364++] = (int) (class577.method3295((byte) 15) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1361[field1364++] = (int) (class577.method3295((byte) 15) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1364 -= 3;
                int var237 = field1361[field1364];
                int var238 = field1361[field1364 + 1];
                int var239 = field1361[field1364 + 2];
                field1365.clear();
                field1365.set(11, 12);
                field1365.set(var239, var238, var237);
                int var240 = (int) (field1365.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field1361[field1364++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field1365.clear();
                field1365.setTime(new Date(class577.method3295((byte) 15)));
                field1361[field1364++] = field1365.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field1361[--field1364];
                boolean var242 = true;
                if (var241 < 0) {
                    var242 = (var241 + 1) % 4 == 0;
                } else if (var241 < 1582) {
                    var242 = var241 % 4 == 0;
                } else if (var241 % 4 != 0) {
                    var242 = false;
                } else if (var241 % 100 != 0) {
                    var242 = true;
                } else if (var241 % 400 != 0) {
                    var242 = false;
                }
                field1361[field1364++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1361[field1364++] = class186.method1278(-1) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1361[field1364++] = class692.method3895((byte) 74) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class285.field3921 == 7 && class521.field7090 == 0 && class263.field3571 == 0) {
                    if (class330.field4462) {
                        field1361[field1364++] = 0;
                        return;
                    }
                    if (class311.field4309 > class577.method3295((byte) 15) - 1000L) {
                        field1361[field1364++] = 1;
                        return;
                    }
                    class330.field4462 = true;
                    class352 var243 = class290.method1786(98, class199.field2836, class3.field21);
                    var243.field4686.method2836(class58.field659, -22164);
                    class602.method3388(var243, (byte) 28);
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class228 var244 = class373.method2144((byte) 44);
                if (var244 != null) {
                    field1361[field1364++] = var244.field3173;
                    field1361[field1364++] = var244.field3535;
                    field1354[field1358++] = var244.field3171;
                    class555 var245 = var244.method1446((byte) -116);
                    field1361[field1364++] = var245.field7480;
                    field1354[field1358++] = var245.field7479;
                    field1361[field1364++] = var244.field3532;
                    field1361[field1364++] = var244.field3172;
                    field1354[field1358++] = var244.field3167;
                    return;
                }
                field1361[field1364++] = -1;
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                field1361[field1364++] = 0;
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                return;
            }
            if (arg0 == 6502) {
                class228 var246 = class364.method2071(65280);
                if (var246 != null) {
                    field1361[field1364++] = var246.field3173;
                    field1361[field1364++] = var246.field3535;
                    field1354[field1358++] = var246.field3171;
                    class555 var247 = var246.method1446((byte) -100);
                    field1361[field1364++] = var247.field7480;
                    field1354[field1358++] = var247.field7479;
                    field1361[field1364++] = var246.field3532;
                    field1361[field1364++] = var246.field3172;
                    field1354[field1358++] = var246.field3167;
                    return;
                }
                field1361[field1364++] = -1;
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                field1361[field1364++] = 0;
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field1361[--field1364];
                String var249 = field1354[--field1358];
                if (class285.field3921 == 7 && class521.field7090 == 0 && class263.field3571 == 0) {
                    field1361[field1364++] = class587.method3337(var249, 50000, var248) ? 1 : 0;
                    return;
                }
                field1361[field1364++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class366.field4875.field9361 = field1361[--field1364];
                class366.field4875.method543(class543.field7374, (byte) 92);
                return;
            }
            if (arg0 == 6505) {
                field1361[field1364++] = class366.field4875.field9361;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field1361[--field1364];
                class228 var251 = class250.method1540(24510, var250);
                if (var251 != null) {
                    field1361[field1364++] = var251.field3535;
                    field1354[field1358++] = var251.field3171;
                    class555 var252 = var251.method1446((byte) -125);
                    field1361[field1364++] = var252.field7480;
                    field1354[field1358++] = var252.field7479;
                    field1361[field1364++] = var251.field3532;
                    field1361[field1364++] = var251.field3172;
                    field1354[field1358++] = var251.field3167;
                    return;
                }
                field1361[field1364++] = -1;
                field1354[field1358++] = "";
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                field1361[field1364++] = 0;
                field1361[field1364++] = 0;
                field1354[field1358++] = "";
                return;
            }
            if (arg0 == 6507) {
                field1364 -= 4;
                int var253 = field1361[field1364];
                boolean var254 = field1361[field1364 + 1] == 1;
                int var255 = field1361[field1364 + 2];
                boolean var256 = field1361[field1364 + 3] == 1;
                class201.method1321(var255, 0, var253, var256, var254);
                return;
            }
            if (arg0 == 6508) {
                class64.method545((byte) 93);
                return;
            }
            if (arg0 == 6509) {
                if (class285.field3921 != 7) {
                    return;
                }
                class80.field1206 = field1361[--field1364] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1361[field1364++] = class603.field8399;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class366.field4875.field9367 = field1361[--field1364] == 1;
                class366.field4875.method543(class543.field7374, (byte) 119);
                return;
            }
            if (arg0 == 6601) {
                field1361[field1364++] = class366.field4875.field9367 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class56.field634 == class492.field6730) {
            if (arg0 == 6700) {
                int var257 = class4.field26.method972(0);
                if (class631.field8758 != -1) {
                    var257++;
                }
                field1361[field1364++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field1361[--field1364];
                if (class631.field8758 != -1) {
                    if (var258 == 0) {
                        field1361[field1364++] = class631.field8758;
                        return;
                    }
                    var258--;
                }
                class685 var259 = (class685) class4.field26.method977(0);
                while (var258-- > 0) {
                    var259 = (class685) class4.field26.method975(-1);
                }
                field1361[field1364++] = var259.field9776;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field1361[--field1364];
                if (class167.field2439[var260] == null) {
                    field1354[field1358++] = "";
                    return;
                }
                String var261 = class167.field2439[var260][0].field1121;
                if (var261 == null) {
                    field1354[field1358++] = "";
                    return;
                }
                field1354[field1358++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field1361[--field1364];
                if (class167.field2439[var262] == null) {
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = class167.field2439[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field1364 -= 2;
                int var263 = field1361[field1364];
                int var264 = field1361[field1364 + 1];
                if (class167.field2439[var263] == null) {
                    field1354[field1358++] = "";
                    return;
                }
                String var265 = class167.field2439[var263][var264].field1121;
                if (var265 == null) {
                    field1354[field1358++] = "";
                    return;
                }
                field1354[field1358++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field1364 -= 2;
                int var266 = field1361[field1364];
                int var267 = field1361[field1364 + 1];
                if (class167.field2439[var266] == null) {
                    field1361[field1364++] = 0;
                    return;
                }
                field1361[field1364++] = class167.field2439[var266][var267].field1094;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field1364 -= 3;
                int var268 = field1361[field1364];
                int var269 = field1361[field1364 + 1];
                int var270 = field1361[field1364 + 2];
                class99.method719(1, var268 << 16 | var269, -7, var270, "");
                return;
            }
            if (arg0 == 6708) {
                field1364 -= 3;
                int var271 = field1361[field1364];
                int var272 = field1361[field1364 + 1];
                int var273 = field1361[field1364 + 2];
                class99.method719(2, var271 << 16 | var272, -7, var273, "");
                return;
            }
            if (arg0 == 6709) {
                field1364 -= 3;
                int var274 = field1361[field1364];
                int var275 = field1361[field1364 + 1];
                int var276 = field1361[field1364 + 2];
                class99.method719(3, var274 << 16 | var275, -7, var276, "");
                return;
            }
            if (arg0 == 6710) {
                field1364 -= 3;
                int var277 = field1361[field1364];
                int var278 = field1361[field1364 + 1];
                int var279 = field1361[field1364 + 2];
                class99.method719(4, var277 << 16 | var278, -7, var279, "");
                return;
            }
            if (arg0 == 6711) {
                field1364 -= 3;
                int var280 = field1361[field1364];
                int var281 = field1361[field1364 + 1];
                int var282 = field1361[field1364 + 2];
                class99.method719(5, var280 << 16 | var281, -7, var282, "");
                return;
            }
            if (arg0 == 6712) {
                field1364 -= 3;
                int var283 = field1361[field1364];
                int var284 = field1361[field1364 + 1];
                int var285 = field1361[field1364 + 2];
                class99.method719(6, var283 << 16 | var284, -7, var285, "");
                return;
            }
            if (arg0 == 6713) {
                field1364 -= 3;
                int var286 = field1361[field1364];
                int var287 = field1361[field1364 + 1];
                int var288 = field1361[field1364 + 2];
                class99.method719(7, var286 << 16 | var287, -7, var288, "");
                return;
            }
            if (arg0 == 6714) {
                field1364 -= 3;
                int var289 = field1361[field1364];
                int var290 = field1361[field1364 + 1];
                int var291 = field1361[field1364 + 2];
                class99.method719(8, var289 << 16 | var290, -7, var291, "");
                return;
            }
            if (arg0 == 6715) {
                field1364 -= 3;
                int var292 = field1361[field1364];
                int var293 = field1361[field1364 + 1];
                int var294 = field1361[field1364 + 2];
                class99.method719(9, var292 << 16 | var293, -7, var294, "");
                return;
            }
            if (arg0 == 6716) {
                field1364 -= 3;
                int var295 = field1361[field1364];
                int var296 = field1361[field1364 + 1];
                int var297 = field1361[field1364 + 2];
                class99.method719(10, var295 << 16 | var296, -7, var297, "");
                return;
            }
            if (arg0 == 6717) {
                field1364 -= 3;
                int var298 = field1361[field1364];
                int var299 = field1361[field1364 + 1];
                int var300 = field1361[field1364 + 2];
                class78 var301 = class89.method650(77, var298 << 16 | var299, var300);
                class114.method820((byte) -92);
                class303 var302 = client.method1679(var301);
                class128.method914(var302.field4207, var301, var302.method1849((byte) 66), -122);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field1361[--field1364];
                class165 var304 = class123.field1685.method3709((byte) 87, var303);
                if (var304.field2406 == null) {
                    field1354[field1358++] = "";
                    return;
                }
                field1354[field1358++] = var304.field2406;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field1361[--field1364];
                class165 var306 = class123.field1685.method3709((byte) 75, var305);
                field1361[field1364++] = var306.field2405;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field1361[--field1364];
                class165 var308 = class123.field1685.method3709((byte) 89, var307);
                field1361[field1364++] = var308.field2379;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field1361[--field1364];
                class165 var310 = class123.field1685.method3709((byte) 106, var309);
                field1361[field1364++] = var310.field2409;
                return;
            }
            if (arg0 == 6804) {
                field1364 -= 2;
                int var311 = field1361[field1364];
                int var312 = field1361[field1364 + 1];
                class488 var313 = class71.field952.method1977((byte) 58, var312);
                if (var313.method2772(114)) {
                    field1354[field1358++] = class123.field1685.method3709((byte) 57, var311).method1157(0, var312, var313.field6701);
                    return;
                }
                field1361[field1364++] = class123.field1685.method3709((byte) 58, var311).method1163(var312, var313.field6697, (byte) 28);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field1361[field1364++] = class173.field2517 && !class5.field37 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field1361[field1364++] = class88.field1264;
                return;
            }
            if (arg0 == 6902) {
                field1361[field1364++] = class675.field9531;
                return;
            }
            if (arg0 == 6903) {
                field1361[field1364++] = class91.field1315;
                return;
            }
            if (arg0 == 6904) {
                field1361[field1364++] = class129.field1843;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class166.field2421 != null) {
                    if (class166.field2421.field946 == null) {
                        var314 = class263.method1608(class166.field2421.field942, (byte) 35);
                    } else {
                        var314 = (String) class166.field2421.field946;
                    }
                }
                field1354[field1358++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field1361[field1364++] = class631.field8757;
                return;
            }
            if (arg0 == 6907) {
                field1361[field1364++] = class198.field2827;
                return;
            }
            if (arg0 == 6908) {
                field1361[field1364++] = class23.field287;
                return;
            }
            if (arg0 == 6909) {
                field1361[field1364++] = class479.field6590 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field1361[field1364++] = class164.field2360;
                return;
            }
            if (arg0 == 6911) {
                field1361[field1364++] = class365.field4860;
                return;
            }
            if (arg0 == 6912) {
                field1361[field1364++] = class590.field8284;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class366.field4875.method533(109);
                field1361[field1364++] = class366.field4875.field752 = class503.field6917;
                field1361[field1364++] = var315;
                class115.method822(-60);
                class366.field4875.method543(class543.field7374, (byte) 125);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 7001) {
                class366.field4875.method552((byte) -84);
                class115.method822(-102);
                class366.field4875.method543(class543.field7374, (byte) 92);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 7002) {
                class366.field4875.method536(-24170);
                class115.method822(-82);
                class366.field4875.method543(class543.field7374, (byte) 31);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 7003) {
                class366.field4875.method538(0);
                class115.method822(-50);
                class366.field4875.method543(class543.field7374, (byte) 93);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 7004) {
                class366.field4875.method551(true, (byte) 20);
                class115.method822(-61);
                class366.field4875.method543(class543.field7374, (byte) 93);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 7005) {
                class366.field4875.field9363 = 0;
                class366.field4875.method543(class543.field7374, (byte) 48);
                class186.field2709 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class366.field4875.field752 == 2) {
                    class366.field4875.field765 = true;
                    return;
                }
                if (class366.field4875.field752 == 1) {
                    class366.field4875.field774 = true;
                    return;
                }
                if (class366.field4875.field752 == 3) {
                    class366.field4875.field775 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field1361[field1364++] = class366.field4875.field9363;
                return;
            }
            if (arg0 == 7008) {
                if (class503.field6917 == 0 && class651.field9037 < 96) {
                    field1361[field1364++] = 1;
                    return;
                }
                field1361[field1364++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)Ljava/lang/String;", line = 8128)
    private static final String method713(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field1365.setTime(new Date(var1));
        int var3 = field1365.get(5);
        int var4 = field1365.get(2);
        int var5 = field1365.get(1);
        return var3 + "-" + field1370[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 8142)
    private static final void method714(String arg0, int arg1) {
        if (class296.field4060 == 0 && !(!class173.field2517 || class5.field37) || class511.field7018) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class65.field835.method555(0, true))) {
            var3 = 0;
            arg0 = arg0.substring(class65.field835.method555(0, true).length());
        } else if (var2.startsWith(class65.field836.method555(0, true))) {
            var3 = 1;
            arg0 = arg0.substring(class65.field836.method555(0, true).length());
        } else if (var2.startsWith(class65.field837.method555(0, true))) {
            var3 = 2;
            arg0 = arg0.substring(class65.field837.method555(0, true).length());
        } else if (var2.startsWith(class65.field838.method555(0, true))) {
            var3 = 3;
            arg0 = arg0.substring(class65.field838.method555(0, true).length());
        } else if (var2.startsWith(class65.field839.method555(0, true))) {
            var3 = 4;
            arg0 = arg0.substring(class65.field839.method555(0, true).length());
        } else if (var2.startsWith(class65.field840.method555(0, true))) {
            var3 = 5;
            arg0 = arg0.substring(class65.field840.method555(0, true).length());
        } else if (var2.startsWith(class65.field841.method555(0, true))) {
            var3 = 6;
            arg0 = arg0.substring(class65.field841.method555(0, true).length());
        } else if (var2.startsWith(class65.field842.method555(0, true))) {
            var3 = 7;
            arg0 = arg0.substring(class65.field842.method555(0, true).length());
        } else if (var2.startsWith(class65.field843.method555(0, true))) {
            var3 = 8;
            arg0 = arg0.substring(class65.field843.method555(0, true).length());
        } else if (var2.startsWith(class65.field844.method555(0, true))) {
            var3 = 9;
            arg0 = arg0.substring(class65.field844.method555(0, true).length());
        } else if (var2.startsWith(class65.field845.method555(0, true))) {
            var3 = 10;
            arg0 = arg0.substring(class65.field845.method555(0, true).length());
        } else if (var2.startsWith(class65.field846.method555(0, true))) {
            var3 = 11;
            arg0 = arg0.substring(class65.field846.method555(0, true).length());
        } else if (class697.field9900 != 0) {
            if (var2.startsWith(class65.field835.method555(class697.field9900, true))) {
                var3 = 0;
                arg0 = arg0.substring(class65.field835.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field836.method555(class697.field9900, true))) {
                var3 = 1;
                arg0 = arg0.substring(class65.field836.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field837.method555(class697.field9900, true))) {
                var3 = 2;
                arg0 = arg0.substring(class65.field837.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field838.method555(class697.field9900, true))) {
                var3 = 3;
                arg0 = arg0.substring(class65.field838.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field839.method555(class697.field9900, true))) {
                var3 = 4;
                arg0 = arg0.substring(class65.field839.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field840.method555(class697.field9900, true))) {
                var3 = 5;
                arg0 = arg0.substring(class65.field840.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field841.method555(class697.field9900, true))) {
                var3 = 6;
                arg0 = arg0.substring(class65.field841.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field842.method555(class697.field9900, true))) {
                var3 = 7;
                arg0 = arg0.substring(class65.field842.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field843.method555(class697.field9900, true))) {
                var3 = 8;
                arg0 = arg0.substring(class65.field843.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field844.method555(class697.field9900, true))) {
                var3 = 9;
                arg0 = arg0.substring(class65.field844.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field845.method555(class697.field9900, true))) {
                var3 = 10;
                arg0 = arg0.substring(class65.field845.method555(class697.field9900, true).length());
            } else if (var2.startsWith(class65.field846.method555(class697.field9900, true))) {
                var3 = 11;
                arg0 = arg0.substring(class65.field846.method555(class697.field9900, true).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class65.field847.method555(0, true))) {
            var5 = 1;
            arg0 = arg0.substring(class65.field847.method555(0, true).length());
        } else if (var4.startsWith(class65.field848.method555(0, true))) {
            var5 = 2;
            arg0 = arg0.substring(class65.field848.method555(0, true).length());
        } else if (var4.startsWith(class65.field849.method555(0, true))) {
            var5 = 3;
            arg0 = arg0.substring(class65.field849.method555(0, true).length());
        } else if (var4.startsWith(class65.field850.method555(0, true))) {
            var5 = 4;
            arg0 = arg0.substring(class65.field850.method555(0, true).length());
        } else if (var4.startsWith(class65.field851.method555(0, true))) {
            var5 = 5;
            arg0 = arg0.substring(class65.field851.method555(0, true).length());
        } else if (class697.field9900 != 0) {
            if (var4.startsWith(class65.field847.method555(class697.field9900, true))) {
                var5 = 1;
                arg0 = arg0.substring(class65.field847.method555(class697.field9900, true).length());
            } else if (var4.startsWith(class65.field848.method555(class697.field9900, true))) {
                var5 = 2;
                arg0 = arg0.substring(class65.field848.method555(class697.field9900, true).length());
            } else if (var4.startsWith(class65.field849.method555(class697.field9900, true))) {
                var5 = 3;
                arg0 = arg0.substring(class65.field849.method555(class697.field9900, true).length());
            } else if (var4.startsWith(class65.field850.method555(class697.field9900, true))) {
                var5 = 4;
                arg0 = arg0.substring(class65.field850.method555(class697.field9900, true).length());
            } else if (var4.startsWith(class65.field851.method555(class697.field9900, true))) {
                var5 = 5;
                arg0 = arg0.substring(class65.field851.method555(class697.field9900, true).length());
            }
        }
        field1359++;
        class352 var6 = class290.method1786(98, class199.field2836, class186.field2698);
        var6.field4686.method2817(0, true);
        int var7 = var6.field4686.field6892;
        var6.field4686.method2817(var3, true);
        var6.field4686.method2817(var5, true);
        class563.method3149(arg0, var6.field4686, (byte) -82);
        var6.field4686.method2847(-8, var6.field4686.field6892 - var7);
        class602.method3388(var6, (byte) 28);
    }
}
