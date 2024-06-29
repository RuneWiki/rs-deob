import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class420 {

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "[[I")
    private static int[][] field6359 = new int[5][5000];

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "[I")
    private static int[] field6362 = new int[1000];

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    private static int field6358 = 0;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "[I")
    private static int[] field6365 = new int[5];

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field6360 = new String[1000];

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "[Ldf;")
    private static class253[] field6366 = new class253[50];

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    private static int field6371 = 0;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    private static int field6376 = 0;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6356 = Calendar.getInstance();

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field6379 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "[I")
    private static int[] field6381 = new int[3];

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "Lof;")
    public static class328 field6380 = new class328(4);

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    private static int field6382 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Ljh;")
    private static class385 field6369;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lgi;")
    private static class437 field6363;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "Lgi;")
    private static class437 field6377;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
    private static int[] field6364;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field6370;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lib;)V")
    public static final void method2673(class491 arg0) {
        method2677(arg0, 200000);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static final void method2674(int arg0) {
        if (arg0 == -1 || !class385.method2479(0, arg0)) {
            return;
        }
        class437[] var1 = class433.field6540[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class437 var3 = var1[var2];
            if (var3.field6597 != null) {
                class491 var4 = new class491();
                var4.field7423 = var3;
                var4.field7430 = var3.field6597;
                method2677(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Laa;I)V")
    private static final void method2675(class57 arg0, int arg1) {
        field6376 = 0;
        field6371 = 0;
        int var2 = -1;
        int[] var3 = arg0.field919;
        int[] var4 = arg0.field918;
        byte var5 = -1;
        field6358 = 0;
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
                        method2679(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2682(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6362[field6376++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6362[field6376++] = class96.field1394.field4650[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class96.field1394.method1985((byte) 93, field6362[--field6376], var8);
                } else if (var43 == 3) {
                    field6360[field6371++] = arg0.field917[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6376 -= 2;
                    if (field6362[field6376 + 1] != field6362[field6376]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6376 -= 2;
                    if (field6362[field6376 + 1] == field6362[field6376]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6376 -= 2;
                    if (field6362[field6376] < field6362[field6376 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6376 -= 2;
                    if (field6362[field6376] > field6362[field6376 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6358 == 0) {
                        return;
                    }
                    class253 var9 = field6366[--field6358];
                    arg0 = var9.field4101;
                    var3 = arg0.field919;
                    var4 = arg0.field918;
                    var2 = var9.field4098;
                    field6364 = var9.field4104;
                    field6370 = var9.field4103;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6362[field6376++] = class96.field1394.method1979(var10, 0);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class96.field1394.method1978(field6362[--field6376], 0, var11);
                } else if (var43 == 31) {
                    field6376 -= 2;
                    if (field6362[field6376] <= field6362[field6376 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6376 -= 2;
                    if (field6362[field6376] >= field6362[field6376 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6362[field6376++] = field6364[var4[var2]];
                } else if (var43 == 34) {
                    field6364[var4[var2]] = field6362[--field6376];
                } else if (var43 == 35) {
                    field6360[field6371++] = field6370[var4[var2]];
                } else if (var43 == 36) {
                    field6370[var4[var2]] = field6360[--field6371];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6371 -= var12;
                    String var13 = class477.method2960(field6360, var12, -48, field6371);
                    field6360[field6371++] = var13;
                } else if (var43 == 38) {
                    field6376--;
                } else if (var43 == 39) {
                    field6371--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class57 var15 = class402.method2583(-30765, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field916];
                    String[] var17 = new String[var15.field924];
                    for (int var18 = 0; var18 < var15.field915; var18++) {
                        var16[var18] = field6362[field6376 + var18 - var15.field915];
                    }
                    for (int var19 = 0; var19 < var15.field912; var19++) {
                        var17[var19] = field6360[field6371 + var19 - var15.field912];
                    }
                    field6376 -= var15.field915;
                    field6371 -= var15.field912;
                    class253 var20 = new class253();
                    var20.field4101 = arg0;
                    var20.field4098 = var2;
                    var20.field4104 = field6364;
                    var20.field4103 = field6370;
                    if (field6358 >= field6366.length) {
                        throw new RuntimeException();
                    }
                    field6366[field6358++] = var20;
                    arg0 = var15;
                    var3 = var15.field919;
                    var4 = var15.field918;
                    var2 = -1;
                    field6364 = var16;
                    field6370 = var17;
                } else if (var43 == 42) {
                    field6362[field6376++] = class187.field2726[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class187.field2726[var21] = field6362[--field6376];
                    class260.method1771(var21, (byte) -100);
                    class325.field5107 |= class225.field3770[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6362[--field6376];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6365[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field6359[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6362[--field6376];
                    if (var28 < 0 || var28 >= field6365[var27]) {
                        throw new RuntimeException();
                    }
                    field6362[field6376++] = field6359[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6376 -= 2;
                    int var30 = field6362[field6376];
                    if (var30 < 0 || var30 >= field6365[var29]) {
                        throw new RuntimeException();
                    }
                    field6359[var29][var30] = field6362[field6376 + 1];
                } else if (var43 == 47) {
                    String var31 = class192.field2842[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6360[field6371++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class192.field2842[var32] = field6360[--field6371];
                    class178.method1131(true, var32);
                } else if (var43 == 51) {
                    class177 var33 = arg0.field911[var4[var2]];
                    class330 var34 = (class330) var33.method1122((byte) 59, (long) field6362[--field6376]);
                    if (var34 != null) {
                        var2 += var34.field5185;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field922 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7780).append(" ");
                for (int var41 = field6358 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6366[var41].field4101.field7780).append(" ");
                }
                var40.append("op: ").append(var5);
                class80.method575(var42, var40.toString(), (byte) -67);
            } else {
                class295.method1988("Clientscript error in: " + arg0.field922, 0);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field922).append("\n");
                for (int var38 = field6358 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6366[var38].field4101.field922).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class80.method575(var42, var37.toString(), (byte) -84);
                class142.method857((byte) 95, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lgf;II)V")
    public static final void method2676(class46 arg0, int arg1, int arg2) {
        class57 var3 = class310.method2083(arg2, arg0, arg1, (byte) -124);
        if (var3 == null) {
            return;
        }
        field6364 = new int[var3.field916];
        field6370 = new String[var3.field924];
        if (class7.field89 == var3.field914 || class528.field7764 == var3.field914 || class321.field4982 == var3.field914) {
            int var4 = 0;
            int var5 = 0;
            if (class204.field3125 != null) {
                var4 = class204.field3125.field6666;
                var5 = class204.field3125.field6644;
            }
            field6364[0] = class472.field7240.method2038(-49) - var4;
            field6364[1] = class472.field7240.method2043((byte) -91) - var5;
        }
        method2675(var3, 200000);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lib;I)V")
    private static final void method2677(class491 arg0, int arg1) {
        Object[] var2 = arg0.field7430;
        int var3 = (Integer) var2[0];
        class57 var4 = class402.method2583(-30765, var3);
        if (var4 == null) {
            return;
        }
        field6364 = new int[var4.field916];
        int var5 = 0;
        field6370 = new String[var4.field924];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field7424;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field7426;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field7423 == null ? -1 : arg0.field7423.field6751;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field7428;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field7423 == null ? -1 : arg0.field7423.field6595;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field7422 == null ? -1 : arg0.field7422.field6751;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field7422 == null ? -1 : arg0.field7422.field6595;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field7433;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field7431;
                }
                field6364[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field7434;
                }
                field6370[var6++] = var9;
            }
        }
        field6382 = arg0.field7439;
        method2675(var4, arg1);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method2678(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6356.setTime(new Date(var1));
        int var3 = field6356.get(5);
        int var4 = field6356.get(2);
        int var5 = field6356.get(1);
        return var3 + "-" + field6379[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V")
    private static final void method2679(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6376 -= 3;
                int var2 = field6362[field6376];
                int var3 = field6362[field6376 + 1];
                int var4 = field6362[field6376 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class437 var5 = class255.method1747(var2, false);
                if (var5.field6675 == null) {
                    var5.field6675 = new class437[var4 + 1];
                }
                if (var5.field6675.length <= var4) {
                    class437[] var6 = new class437[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6675.length; var7++) {
                        var6[var7] = var5.field6675[var7];
                    }
                    var5.field6675 = var6;
                }
                if (var4 > 0 && var5.field6675[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class437 var8 = new class437();
                var8.field6729 = var3;
                var8.field6599 = var8.field6751 = var5.field6751;
                var8.field6595 = var4;
                var5.field6675[var4] = var8;
                if (arg1) {
                    field6377 = var8;
                } else {
                    field6363 = var8;
                }
                class479.method2962(-121, var5);
                return;
            }
            if (arg0 == 101) {
                class437 var9 = arg1 ? field6377 : field6363;
                if (var9.field6595 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class437 var10 = class255.method1747(var9.field6751, false);
                var10.field6675[var9.field6595] = null;
                class479.method2962(-114, var10);
                return;
            }
            if (arg0 == 102) {
                class437 var11 = class255.method1747(field6362[--field6376], false);
                var11.field6675 = null;
                class479.method2962(-106, var11);
                return;
            }
            if (arg0 == 200) {
                field6376 -= 2;
                int var12 = field6362[field6376];
                int var13 = field6362[field6376 + 1];
                class437 var14 = class24.method150(true, var13, var12);
                if (var14 != null && var13 != -1) {
                    field6362[field6376++] = 1;
                    if (arg1) {
                        field6377 = var14;
                        return;
                    }
                    field6363 = var14;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6362[--field6376];
                class437 var16 = class255.method1747(var15, false);
                if (var16 != null) {
                    field6362[field6376++] = 1;
                    if (arg1) {
                        field6377 = var16;
                        return;
                    }
                    field6363 = var16;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6362[--field6376];
                method2681(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6362[--field6376];
                method2680(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6376 -= 2;
                int var19 = field6362[field6376];
                int var20 = field6362[field6376 + 1];
                for (int var21 = 0; var21 < class447.field6948.length; var21++) {
                    if (class447.field6948[var21] == var19) {
                        class358.field5565.field5430.method562(var20, var21, class17.field178, Integer.MIN_VALUE);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class119.field1632.length; var22++) {
                    if (class119.field1632[var22] == var19) {
                        class358.field5565.field5430.method562(var20, var22, class17.field178, Integer.MIN_VALUE);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6376 -= 2;
                int var23 = field6362[field6376];
                int var24 = field6362[field6376 + 1];
                class358.field5565.field5430.method560(var24, -1, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6362[--field6376] != 0;
                class358.field5565.field5430.method559(var25, -90);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class437 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class255.method1747(field6362[--field6376], false);
            } else {
                var26 = arg1 ? field6377 : field6363;
            }
            if (arg0 == 1000) {
                field6376 -= 4;
                var26.field6633 = field6362[field6376];
                var26.field6750 = field6362[field6376 + 1];
                int var27 = field6362[field6376 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field6362[field6376 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field6590 = (byte) var27;
                var26.field6691 = (byte) var28;
                class479.method2962(-120, var26);
                class384.method2473(-69, var26);
                if (var26.field6595 == -1) {
                    class263.method1802(var26.field6751, 11);
                }
                return;
            }
            if (arg0 == 1001) {
                field6376 -= 4;
                var26.field6704 = field6362[field6376];
                var26.field6746 = field6362[field6376 + 1];
                var26.field6702 = 0;
                var26.field6624 = 0;
                int var29 = field6362[field6376 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field6362[field6376 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field6629 = (byte) var29;
                var26.field6604 = (byte) var30;
                class479.method2962(-124, var26);
                class384.method2473(-114, var26);
                if (var26.field6729 == 0) {
                    class235.method1662(true, false, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field6362[--field6376] == 1;
                if (var26.field6739 != var31) {
                    var26.field6739 = var31;
                    class479.method2962(-104, var26);
                }
                if (var26.field6595 == -1) {
                    class169.method1072(var26.field6751, -126);
                }
                return;
            }
            if (arg0 == 1004) {
                field6376 -= 2;
                var26.field6692 = field6362[field6376];
                var26.field6700 = field6362[field6376 + 1];
                class479.method2962(-122, var26);
                class384.method2473(-80, var26);
                if (var26.field6729 == 0) {
                    class235.method1662(true, false, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field6639 = field6362[--field6376] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class437 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class255.method1747(field6362[--field6376], false);
            } else {
                var32 = arg1 ? field6377 : field6363;
            }
            if (arg0 == 1100) {
                field6376 -= 2;
                var32.field6649 = field6362[field6376];
                if (var32.field6649 > var32.field6693 - var32.field6615) {
                    var32.field6649 = var32.field6693 - var32.field6615;
                }
                if (var32.field6649 < 0) {
                    var32.field6649 = 0;
                }
                var32.field6613 = field6362[field6376 + 1];
                if (var32.field6613 > var32.field6647 - var32.field6730) {
                    var32.field6613 = var32.field6647 - var32.field6730;
                }
                if (var32.field6613 < 0) {
                    var32.field6613 = 0;
                }
                class479.method2962(-124, var32);
                if (var32.field6595 == -1) {
                    class411.method2631(var32.field6751, (byte) -103);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field6622 = field6362[--field6376];
                class479.method2962(-107, var32);
                if (var32.field6595 == -1) {
                    class281.method1894(var32.field6751, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field6643 = field6362[--field6376] == 1;
                class479.method2962(-118, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field6713 = field6362[--field6376];
                class479.method2962(-122, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field6748 = field6362[--field6376];
                class479.method2962(-105, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field6362[--field6376];
                if (var32.field6680 != var33) {
                    var32.field6680 = var33;
                    class479.method2962(-126, var32);
                }
                if (var32.field6595 == -1) {
                    class113.method729(var32.field6751, 16383);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field6737 = field6362[--field6376];
                class479.method2962(-105, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field6665 = field6362[--field6376] == 1;
                class479.method2962(-110, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field6608 = 1;
                var32.field6755 = field6362[--field6376];
                class479.method2962(-127, var32);
                if (var32.field6595 == -1) {
                    class179.method1140(var32.field6751, true);
                }
                return;
            }
            if (arg0 == 1109) {
                field6376 -= 6;
                var32.field6740 = field6362[field6376];
                var32.field6726 = field6362[field6376 + 1];
                var32.field6670 = field6362[field6376 + 2];
                var32.field6695 = field6362[field6376 + 3];
                var32.field6677 = field6362[field6376 + 4];
                var32.field6709 = field6362[field6376 + 5];
                class479.method2962(-117, var32);
                if (var32.field6595 == -1) {
                    class131.method813(-11145, var32.field6751);
                    class181.method1143(1, var32.field6751);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field6362[--field6376];
                if (var32.field6605 != var34) {
                    var32.field6605 = var34;
                    var32.field6621 = 0;
                    var32.field6659 = 1;
                    var32.field6610 = 0;
                    class479.method2962(-109, var32);
                }
                if (var32.field6595 == -1) {
                    class113.method728((byte) -111, var32.field6751);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field6690 = field6362[--field6376] == 1;
                class479.method2962(-127, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field6360[--field6371];
                if (!var35.equals(var32.field6742)) {
                    var32.field6742 = var35;
                    class479.method2962(-122, var32);
                }
                if (var32.field6595 == -1) {
                    class375.method2424(var32.field6751, (byte) 82);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field6636 = field6362[--field6376];
                class479.method2962(-111, var32);
                if (var32.field6595 == -1) {
                    class56.method435(-116, var32.field6751);
                }
                return;
            }
            if (arg0 == 1114) {
                field6376 -= 3;
                var32.field6694 = field6362[field6376];
                var32.field6600 = field6362[field6376 + 1];
                var32.field6733 = field6362[field6376 + 2];
                class479.method2962(-102, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field6744 = field6362[--field6376] == 1;
                class479.method2962(-104, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field6609 = field6362[--field6376];
                class479.method2962(-118, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field6749 = field6362[--field6376];
                class479.method2962(-98, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field6743 = field6362[--field6376] == 1;
                class479.method2962(-123, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field6596 = field6362[--field6376] == 1;
                class479.method2962(-94, var32);
                return;
            }
            if (arg0 == 1120) {
                field6376 -= 2;
                var32.field6693 = field6362[field6376];
                var32.field6647 = field6362[field6376 + 1];
                class479.method2962(-109, var32);
                if (var32.field6729 == 0) {
                    class235.method1662(true, false, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field6376 -= 2;
                var32.field6734 = (short) field6362[field6376];
                var32.field6710 = (short) field6362[field6376 + 1];
                class479.method2962(-124, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field6718 = field6362[--field6376] == 1;
                class479.method2962(-107, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field6709 = field6362[--field6376];
                class479.method2962(-119, var32);
                if (var32.field6595 == -1) {
                    class131.method813(-11145, var32.field6751);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field6362[--field6376];
                var32.field6603 = var36 == 1;
                class479.method2962(-97, var32);
                return;
            }
            if (arg0 == 1125) {
                field6376 -= 2;
                var32.field6728 = field6362[field6376];
                var32.field6689 = field6362[field6376 + 1];
                class479.method2962(-107, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field6662 = field6362[--field6376];
                class479.method2962(-104, var32);
                return;
            }
            if (arg0 == 1127) {
                field6376 -= 2;
                int var37 = field6362[field6376];
                int var38 = field6362[field6376 + 1];
                class442 var39 = class274.field4353.method1171((byte) 82, var37);
                if (var39.field6872 != var38) {
                    var32.method2760(var37, var38, -13833);
                    return;
                }
                var32.method2762(var37, 0);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field6362[--field6376];
                String var41 = field6360[--field6371];
                class442 var42 = class274.field4353.method1171((byte) 82, var40);
                if (!var42.field6871.equals(var41)) {
                    var32.method2752(var40, (byte) -87, var41);
                    return;
                }
                var32.method2762(var40, 0);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class437 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class255.method1747(field6362[--field6376], false);
            } else {
                var43 = arg1 ? field6377 : field6363;
            }
            class479.method2962(-122, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6376 -= 2;
                int var44 = field6362[field6376];
                int var45 = field6362[field6376 + 1];
                if (var43.field6595 == -1) {
                    class143.method867(-113, var43.field6751);
                    class131.method813(-11145, var43.field6751);
                    class181.method1143(1, var43.field6751);
                }
                if (var44 == -1) {
                    var43.field6608 = 1;
                    var43.field6755 = -1;
                    var43.field6716 = -1;
                    return;
                }
                var43.field6716 = var44;
                var43.field6678 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field6676 = true;
                } else {
                    var43.field6676 = false;
                }
                class196 var46 = class337.field5262.method2077((byte) -65, var44);
                var43.field6670 = var46.field3012;
                var43.field6695 = var46.field2991;
                var43.field6677 = var46.field2979;
                var43.field6740 = var46.field2958;
                var43.field6726 = var46.field2974;
                var43.field6709 = var46.field3031;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field6611 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field6611 = 1;
                } else {
                    var43.field6611 = 2;
                }
                if (var43.field6702 > 0) {
                    var43.field6709 = var43.field6709 * 32 / var43.field6702;
                    return;
                }
                if (var43.field6704 > 0) {
                    var43.field6709 = var43.field6709 * 32 / var43.field6704;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field6608 = 2;
                var43.field6755 = field6362[--field6376];
                if (var43.field6595 == -1) {
                    class179.method1140(var43.field6751, true);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field6608 = 3;
                var43.field6755 = -1;
                if (var43.field6595 == -1) {
                    class179.method1140(var43.field6751, true);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field6608 = 6;
                var43.field6755 = field6362[--field6376];
                if (var43.field6595 == -1) {
                    class179.method1140(var43.field6751, true);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field6608 = 5;
                var43.field6755 = field6362[--field6376];
                if (var43.field6595 == -1) {
                    class179.method1140(var43.field6751, true);
                }
                return;
            }
            if (arg0 == 1206) {
                field6376 -= 4;
                var43.field6657 = field6362[field6376];
                var43.field6727 = field6362[field6376 + 1];
                var43.field6683 = field6362[field6376 + 2];
                var43.field6735 = field6362[field6376 + 3];
                class479.method2962(-124, var43);
                return;
            }
            if (arg0 == 1207) {
                field6376 -= 2;
                var43.field6635 = field6362[field6376];
                var43.field6606 = field6362[field6376 + 1];
                class479.method2962(-115, var43);
                return;
            }
            if (arg0 == 1210) {
                field6376 -= 4;
                var43.field6755 = field6362[field6376];
                var43.field6731 = field6362[field6376 + 1];
                if (field6362[field6376 + 2] == 1) {
                    var43.field6608 = 9;
                } else {
                    var43.field6608 = 8;
                }
                if (field6362[field6376 + 3] == 1) {
                    var43.field6676 = true;
                } else {
                    var43.field6676 = false;
                }
                if (var43.field6595 == -1) {
                    class179.method1140(var43.field6751, true);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field6608 = 5;
                var43.field6755 = class528.field7772;
                var43.field6731 = 0;
                if (var43.field6595 == -1) {
                    class179.method1140(var43.field6751, true);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class437 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class255.method1747(field6362[--field6376], false);
                } else {
                    var58 = arg1 ? field6377 : field6363;
                }
                String var59 = field6360[--field6371];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field6362[--field6376];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field6362[--field6376];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field6360[--field6371];
                    } else {
                        var62[var63] = Integer.valueOf(field6362[--field6376]);
                    }
                }
                int var64 = field6362[--field6376];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field6738 = var62;
                } else if (arg0 == 1401) {
                    var58.field6741 = var62;
                } else if (arg0 == 1402) {
                    var58.field6641 = var62;
                } else if (arg0 == 1403) {
                    var58.field6612 = var62;
                } else if (arg0 == 1404) {
                    var58.field6614 = var62;
                } else if (arg0 == 1405) {
                    var58.field6653 = var62;
                } else if (arg0 == 1406) {
                    var58.field6616 = var62;
                } else if (arg0 == 1407) {
                    var58.field6638 = var62;
                    var58.field6652 = var60;
                } else if (arg0 == 1408) {
                    var58.field6708 = var62;
                } else if (arg0 == 1409) {
                    var58.field6625 = var62;
                } else if (arg0 == 1410) {
                    var58.field6696 = var62;
                } else if (arg0 == 1411) {
                    var58.field6686 = var62;
                } else if (arg0 == 1412) {
                    var58.field6719 = var62;
                } else if (arg0 == 1414) {
                    var58.field6619 = var62;
                    var58.field6701 = var60;
                } else if (arg0 == 1415) {
                    var58.field6658 = var62;
                    var58.field6634 = var60;
                } else if (arg0 == 1416) {
                    var58.field6721 = var62;
                } else if (arg0 == 1417) {
                    var58.field6627 = var62;
                } else if (arg0 == 1418) {
                    var58.field6720 = var62;
                } else if (arg0 == 1419) {
                    var58.field6687 = var62;
                } else if (arg0 == 1420) {
                    var58.field6685 = var62;
                } else if (arg0 == 1421) {
                    var58.field6723 = var62;
                } else if (arg0 == 1422) {
                    var58.field6712 = var62;
                } else if (arg0 == 1423) {
                    var58.field6668 = var62;
                } else if (arg0 == 1424) {
                    var58.field6654 = var62;
                } else if (arg0 == 1425) {
                    var58.field6591 = var62;
                } else if (arg0 == 1426) {
                    var58.field6706 = var62;
                } else if (arg0 == 1427) {
                    var58.field6679 = var62;
                } else if (arg0 == 1428) {
                    var58.field6602 = var62;
                    var58.field6617 = var60;
                } else if (arg0 == 1429) {
                    var58.field6601 = var62;
                    var58.field6645 = var60;
                } else if (arg0 == 1430) {
                    var58.field6717 = var62;
                }
                var58.field6711 = true;
                return;
            }
            if (arg0 < 1600) {
                class437 var65 = arg1 ? field6377 : field6363;
                if (arg0 == 1500) {
                    field6362[field6376++] = var65.field6666;
                    return;
                }
                if (arg0 == 1501) {
                    field6362[field6376++] = var65.field6644;
                    return;
                }
                if (arg0 == 1502) {
                    field6362[field6376++] = var65.field6615;
                    return;
                }
                if (arg0 == 1503) {
                    field6362[field6376++] = var65.field6730;
                    return;
                }
                if (arg0 == 1504) {
                    field6362[field6376++] = var65.field6739 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6362[field6376++] = var65.field6599;
                    return;
                }
                if (arg0 == 1506) {
                    class437 var66 = class49.method354(var65, (byte) -22);
                    field6362[field6376++] = var66 == null ? -1 : var66.field6751;
                    return;
                }
            } else if (arg0 < 1700) {
                class437 var67 = arg1 ? field6377 : field6363;
                if (arg0 == 1600) {
                    field6362[field6376++] = var67.field6649;
                    return;
                }
                if (arg0 == 1601) {
                    field6362[field6376++] = var67.field6613;
                    return;
                }
                if (arg0 == 1602) {
                    field6360[field6371++] = var67.field6742;
                    return;
                }
                if (arg0 == 1603) {
                    field6362[field6376++] = var67.field6693;
                    return;
                }
                if (arg0 == 1604) {
                    field6362[field6376++] = var67.field6647;
                    return;
                }
                if (arg0 == 1605) {
                    field6362[field6376++] = var67.field6709;
                    return;
                }
                if (arg0 == 1606) {
                    field6362[field6376++] = var67.field6670;
                    return;
                }
                if (arg0 == 1607) {
                    field6362[field6376++] = var67.field6677;
                    return;
                }
                if (arg0 == 1608) {
                    field6362[field6376++] = var67.field6695;
                    return;
                }
                if (arg0 == 1609) {
                    field6362[field6376++] = var67.field6713;
                    return;
                }
                if (arg0 == 1610) {
                    field6362[field6376++] = var67.field6740;
                    return;
                }
                if (arg0 == 1611) {
                    field6362[field6376++] = var67.field6726;
                    return;
                }
                if (arg0 == 1612) {
                    field6362[field6376++] = var67.field6680;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field6362[--field6376];
                    class442 var69 = class274.field4353.method1171((byte) 82, var68);
                    if (var69.method2799(103)) {
                        field6360[field6371++] = var67.method2758(var68, var69.field6871, -1);
                        return;
                    }
                    field6362[field6376++] = var67.method2755(var69.field6872, 0, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class437 var70 = arg1 ? field6377 : field6363;
                if (arg0 == 1700) {
                    field6362[field6376++] = var70.field6716;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field6716 != -1) {
                        field6362[field6376++] = var70.field6678;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6362[field6376++] = var70.field6595;
                    return;
                }
            } else if (arg0 < 1900) {
                class437 var71 = arg1 ? field6377 : field6363;
                if (arg0 == 1800) {
                    field6362[field6376++] = client.method492(var71).method2913(-60);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field6362[--field6376];
                    int var334 = var72 - 1;
                    if (var71.field6724 != null && var334 < var71.field6724.length && var71.field6724[var334] != null) {
                        field6360[field6371++] = var71.field6724[var334];
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field6632 == null) {
                        field6360[field6371++] = "";
                        return;
                    }
                    field6360[field6371++] = var71.field6632;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class437 var332;
                if (arg0 >= 2000) {
                    var332 = class255.method1747(field6362[--field6376], false);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field6377 : field6363;
                }
                if (field6382 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field6679 == null) {
                        return;
                    }
                    class491 var333 = new class491();
                    var333.field7423 = var332;
                    var333.field7430 = var332.field6679;
                    var333.field7439 = field6382 + 1;
                    class176.field2580.method2124(var333, (byte) -116);
                    return;
                }
            } else if (arg0 < 2600) {
                class437 var73 = class255.method1747(field6362[--field6376], false);
                if (arg0 == 2500) {
                    field6362[field6376++] = var73.field6666;
                    return;
                }
                if (arg0 == 2501) {
                    field6362[field6376++] = var73.field6644;
                    return;
                }
                if (arg0 == 2502) {
                    field6362[field6376++] = var73.field6615;
                    return;
                }
                if (arg0 == 2503) {
                    field6362[field6376++] = var73.field6730;
                    return;
                }
                if (arg0 == 2504) {
                    field6362[field6376++] = var73.field6739 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6362[field6376++] = var73.field6599;
                    return;
                }
                if (arg0 == 1506) {
                    class437 var74 = class49.method354(var73, (byte) -22);
                    field6362[field6376++] = var74 == null ? -1 : var74.field6751;
                    return;
                }
            } else if (arg0 < 2700) {
                class437 var75 = class255.method1747(field6362[--field6376], false);
                if (arg0 == 2600) {
                    field6362[field6376++] = var75.field6649;
                    return;
                }
                if (arg0 == 2601) {
                    field6362[field6376++] = var75.field6613;
                    return;
                }
                if (arg0 == 2602) {
                    field6360[field6371++] = var75.field6742;
                    return;
                }
                if (arg0 == 2603) {
                    field6362[field6376++] = var75.field6693;
                    return;
                }
                if (arg0 == 2604) {
                    field6362[field6376++] = var75.field6647;
                    return;
                }
                if (arg0 == 2605) {
                    field6362[field6376++] = var75.field6709;
                    return;
                }
                if (arg0 == 2606) {
                    field6362[field6376++] = var75.field6670;
                    return;
                }
                if (arg0 == 2607) {
                    field6362[field6376++] = var75.field6677;
                    return;
                }
                if (arg0 == 2608) {
                    field6362[field6376++] = var75.field6695;
                    return;
                }
                if (arg0 == 2609) {
                    field6362[field6376++] = var75.field6713;
                    return;
                }
                if (arg0 == 2610) {
                    field6362[field6376++] = var75.field6740;
                    return;
                }
                if (arg0 == 2611) {
                    field6362[field6376++] = var75.field6726;
                    return;
                }
                if (arg0 == 2612) {
                    field6362[field6376++] = var75.field6680;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class437 var76 = class255.method1747(field6362[--field6376], false);
                    field6362[field6376++] = var76.field6716;
                    return;
                }
                if (arg0 == 2701) {
                    class437 var77 = class255.method1747(field6362[--field6376], false);
                    if (var77.field6716 != -1) {
                        field6362[field6376++] = var77.field6678;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field6362[--field6376];
                    class301 var79 = (class301) class423.field6414.method1122((byte) 59, (long) var78);
                    if (var79 != null) {
                        field6362[field6376++] = 1;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class437 var80 = class255.method1747(field6362[--field6376], false);
                    if (var80.field6675 == null) {
                        field6362[field6376++] = 0;
                        return;
                    }
                    int var81 = var80.field6675.length;
                    for (int var82 = 0; var82 < var80.field6675.length; var82++) {
                        if (var80.field6675[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field6362[field6376++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6376 -= 2;
                    int var83 = field6362[field6376];
                    int var84 = field6362[field6376 + 1];
                    class301 var85 = (class301) class423.field6414.method1122((byte) 59, (long) var83);
                    if (var85 != null && var85.field4721 == var84) {
                        field6362[field6376++] = 1;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class437 var86 = class255.method1747(field6362[--field6376], false);
                if (arg0 == 2800) {
                    field6362[field6376++] = client.method492(var86).method2913(-49);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field6362[--field6376];
                    int var335 = var87 - 1;
                    if (var86.field6724 != null && var335 < var86.field6724.length && var86.field6724[var335] != null) {
                        field6360[field6371++] = var86.field6724[var335];
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field6632 == null) {
                        field6360[field6371++] = "";
                        return;
                    }
                    field6360[field6371++] = var86.field6632;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field6360[--field6371];
                    class295.method1988(var88, 0);
                    return;
                }
                if (arg0 == 3101) {
                    field6376 -= 2;
                    class415.method2653(-127, class358.field5565, field6362[field6376 + 1], field6362[field6376]);
                    return;
                }
                if (arg0 == 3103) {
                    class7.method59(true, -1);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field6360[--field6371];
                    int var90 = 0;
                    if (class471.method2929(true, var89)) {
                        var90 = class170.method1078(-103, var89);
                    }
                    field6372++;
                    class81.method578((byte) 66, class48.field607);
                    class170.field2488.method1477(65280, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field6360[--field6371];
                    field6374++;
                    class81.method578((byte) 66, class219.field3717);
                    class170.field2488.method1479((byte) -96, var91.length() + 1);
                    class170.field2488.method1458(var91, (byte) 78);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field6360[--field6371];
                    field6354++;
                    class81.method578((byte) 66, class361.field5592);
                    class170.field2488.method1479((byte) -116, var92.length() + 1);
                    class170.field2488.method1458(var92, (byte) 78);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field6362[--field6376];
                    String var94 = field6360[--field6371];
                    class439.method2788(var94, var93, 30687);
                    return;
                }
                if (arg0 == 3108) {
                    field6376 -= 3;
                    int var95 = field6362[field6376];
                    int var96 = field6362[field6376 + 1];
                    int var97 = field6362[field6376 + 2];
                    class437 var98 = class255.method1747(var97, false);
                    class39.method233(2, var96, var98, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field6376 -= 2;
                    int var99 = field6362[field6376];
                    int var100 = field6362[field6376 + 1];
                    class437 var101 = arg1 ? field6377 : field6363;
                    class39.method233(2, var100, var101, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field6362[--field6376];
                    field6373++;
                    class81.method578((byte) 66, class179.field2617);
                    class170.field2488.method1437(var102, 0);
                    return;
                }
                if (arg0 == 3111) {
                    field6376 -= 2;
                    int var103 = field6362[field6376];
                    int var104 = field6362[field6376 + 1];
                    class301 var105 = (class301) class423.field6414.method1122((byte) 59, (long) var103);
                    if (var105 != null) {
                        class215.method1588(var105.field4721 != var104, -113, var105, true);
                    }
                    class292.method1964(true, var104, 3, var103, 1);
                    return;
                }
                if (arg0 == 3112) {
                    field6376--;
                    int var106 = field6362[field6376];
                    class301 var107 = (class301) class423.field6414.method1122((byte) 59, (long) var106);
                    if (var107 != null && var107.field4720 == 3) {
                        class215.method1588(true, -113, var107, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class54.method411(field6360[--field6371], 0);
                    return;
                }
                if (arg0 == 3114) {
                    field6376 -= 2;
                    int var108 = field6362[field6376];
                    int var109 = field6362[field6376 + 1];
                    String var110 = field6360[--field6371];
                    class528.method3140("", "", var110, -120, var108, var109);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6376 -= 3;
                    class372.method2422(255, field6362[field6376 + 1], 125, field6362[field6376], field6362[field6376 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class322.method2160(field6362[--field6376], true, 50, 255);
                    return;
                }
                if (arg0 == 3202) {
                    field6376 -= 2;
                    class140.method854(field6362[field6376 + 1], field6362[field6376], 67, 255);
                    return;
                }
                if (arg0 == 3203) {
                    field6376 -= 4;
                    class372.method2422(field6362[field6376 + 3], field6362[field6376 + 1], 121, field6362[field6376], field6362[field6376 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field6376 -= 3;
                    class322.method2160(field6362[field6376], true, field6362[field6376 + 2], field6362[field6376 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field6376 -= 3;
                    class140.method854(field6362[field6376 + 1], field6362[field6376], -114, field6362[field6376 + 2]);
                    return;
                }
                if (arg0 == 3206) {
                    field6376 -= 4;
                    class179.method1138(field6362[field6376 + 2], field6362[field6376 + 3], field6362[field6376 + 1], field6362[field6376], 50);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6362[field6376++] = class88.field1278;
                    return;
                }
                if (arg0 == 3301) {
                    field6376 -= 2;
                    int var111 = field6362[field6376];
                    int var112 = field6362[field6376 + 1];
                    field6362[field6376++] = class371.method2414(var112, false, false, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field6376 -= 2;
                    int var113 = field6362[field6376];
                    int var114 = field6362[field6376 + 1];
                    field6362[field6376++] = class428.method2714(0, var114, var113, false);
                    return;
                }
                if (arg0 == 3303) {
                    field6376 -= 2;
                    int var115 = field6362[field6376];
                    int var116 = field6362[field6376 + 1];
                    field6362[field6376++] = class142.method861(var116, false, -39, var115);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field6362[--field6376];
                    field6362[field6376++] = class373.field5722.method469((byte) -110, var117).field360;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field6362[--field6376];
                    field6362[field6376++] = class345.field5371[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field6362[--field6376];
                    field6362[field6376++] = class129.field1748[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field6362[--field6376];
                    field6362[field6376++] = class524.field7741[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class358.field5565.field6419;
                    int var122 = (class358.field5565.field6417 >> 7) + class453.field7018;
                    int var123 = (class358.field5565.field6410 >> 7) + class126.field1718;
                    field6362[field6376++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field6362[--field6376];
                    field6362[field6376++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field6362[--field6376];
                    field6362[field6376++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field6362[--field6376];
                    field6362[field6376++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6362[field6376++] = class153.field2049 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6376 -= 2;
                    int var127 = field6362[field6376];
                    int var128 = field6362[field6376 + 1];
                    field6362[field6376++] = class371.method2414(var128, true, false, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field6376 -= 2;
                    int var129 = field6362[field6376];
                    int var130 = field6362[field6376 + 1];
                    field6362[field6376++] = class428.method2714(0, var130, var129, true);
                    return;
                }
                if (arg0 == 3315) {
                    field6376 -= 2;
                    int var131 = field6362[field6376];
                    int var132 = field6362[field6376 + 1];
                    field6362[field6376++] = class142.method861(var132, true, -32, var131);
                    return;
                }
                if (arg0 == 3316) {
                    if (class439.field6815 >= 2) {
                        field6362[field6376++] = class439.field6815;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6362[field6376++] = class513.field7615;
                    return;
                }
                if (arg0 == 3318) {
                    field6362[field6376++] = class95.field1387.field7722;
                    return;
                }
                if (arg0 == 3321) {
                    field6362[field6376++] = class131.field1780;
                    return;
                }
                if (arg0 == 3322) {
                    field6362[field6376++] = class322.field5023;
                    return;
                }
                if (arg0 == 3323) {
                    if (class189.field2756 >= 5 && class189.field2756 <= 9) {
                        field6362[field6376++] = 1;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class189.field2756 >= 5 && class189.field2756 <= 9) {
                        field6362[field6376++] = class189.field2756;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6362[field6376++] = class198.field3050 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6362[field6376++] = class358.field5565.field5450;
                    return;
                }
                if (arg0 == 3327) {
                    field6362[field6376++] = class358.field5565.field5430.field1159 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6362[field6376++] = class103.field1504 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field6362[--field6376];
                    field6362[field6376++] = class156.method951(false, true, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field6376 -= 2;
                    int var134 = field6362[field6376];
                    int var135 = field6362[field6376 + 1];
                    field6362[field6376++] = class348.method2300(false, var135, var134, false, 0);
                    return;
                }
                if (arg0 == 3332) {
                    field6376 -= 2;
                    int var136 = field6362[field6376];
                    int var137 = field6362[field6376 + 1];
                    field6362[field6376++] = class348.method2300(true, var137, var136, false, 0);
                    return;
                }
                if (arg0 == 3333) {
                    field6362[field6376++] = class300.field4718;
                    return;
                }
                if (arg0 == 3335) {
                    field6362[field6376++] = class12.field131;
                    return;
                }
                if (arg0 == 3336) {
                    field6376 -= 4;
                    int var138 = field6362[field6376];
                    int var139 = field6362[field6376 + 1];
                    int var140 = field6362[field6376 + 2];
                    int var141 = field6362[field6376 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field6362[field6376++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field6362[field6376++] = class348.field5403;
                    return;
                }
                if (arg0 == 3338) {
                    field6362[field6376++] = class440.method2792(100);
                    return;
                }
                if (arg0 == 3339) {
                    field6362[field6376++] = class463.field7118 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field6362[field6376++] = class224.field3767 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field6362[field6376++] = class447.field6946 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6376 -= 2;
                    int var145 = field6362[field6376];
                    int var146 = field6362[field6376 + 1];
                    class41 var147 = class375.field5749.method2439(var145, -1);
                    field6360[field6371++] = var147.method253(var146, 24667);
                    return;
                }
                if (arg0 == 3408) {
                    field6376 -= 4;
                    int var148 = field6362[field6376];
                    int var149 = field6362[field6376 + 1];
                    int var150 = field6362[field6376 + 2];
                    int var151 = field6362[field6376 + 3];
                    class41 var152 = class375.field5749.method2439(var150, -1);
                    if (var152.field447 == var148 && var152.field449 == var149) {
                        if (var149 == 115) {
                            field6360[field6371++] = var152.method253(var151, 24667);
                            return;
                        }
                        field6362[field6376++] = var152.method248(var151, (byte) 126);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field6376 -= 3;
                    int var153 = field6362[field6376];
                    int var154 = field6362[field6376 + 1];
                    int var155 = field6362[field6376 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class41 var156 = class375.field5749.method2439(var154, -1);
                    if (var156.field449 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6362[field6376++] = var156.method252(var155, 32061) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field6362[--field6376];
                    String var158 = field6360[--field6371];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class41 var159 = class375.field5749.method2439(var157, -1);
                    if (var159.field449 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6362[field6376++] = var159.method256((byte) -127, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field6362[--field6376];
                    class41 var161 = class375.field5749.method2439(var160, -1);
                    field6362[field6376++] = var161.field432.method1126(24946);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class75.field1117 == 0) {
                        field6362[field6376++] = -2;
                        return;
                    }
                    if (class75.field1117 == 1) {
                        field6362[field6376++] = -1;
                        return;
                    }
                    field6362[field6376++] = class162.field2352;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field6362[--field6376];
                    if (class75.field1117 == 2 && var162 < class162.field2352) {
                        field6360[field6371++] = class401.field6038[var162];
                        if (class180.field2621[var162] != null) {
                            field6360[field6371++] = class180.field2621[var162];
                            return;
                        }
                        field6360[field6371++] = "";
                        return;
                    }
                    field6360[field6371++] = "";
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field6362[--field6376];
                    if (class75.field1117 == 2 && var163 < class162.field2352) {
                        field6362[field6376++] = class214.field3648[var163];
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field6362[--field6376];
                    if (class75.field1117 == 2 && var164 < class162.field2352) {
                        field6362[field6376++] = class294.field4640[var164];
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field6360[--field6371];
                    int var166 = field6362[--field6376];
                    class186.method1161(var165, var166, 24590);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field6360[--field6371];
                    class327.method2183(var167, (byte) -111);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field6360[--field6371];
                    class49.method355(var168, (byte) 75);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field6360[--field6371];
                    class59.method446(true, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field6360[--field6371];
                    class79.method569(false, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field6360[--field6371];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field6362[field6376++] = class233.method1656(var171, (byte) -121) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field6362[--field6376];
                    if (class75.field1117 == 2 && var172 < class162.field2352) {
                        field6360[field6371++] = class294.field4633[var172];
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class229.field3807 != null) {
                        field6360[field6371++] = class220.method1606(class229.field3807, (byte) -111);
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class229.field3807 != null) {
                        field6362[field6376++] = class314.field4918;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field6362[--field6376];
                    if (class229.field3807 != null && var173 < class314.field4918) {
                        field6360[field6371++] = class183.field2658[var173].field7447;
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field6362[--field6376];
                    if (class229.field3807 != null && var174 < class314.field4918) {
                        field6362[field6376++] = class183.field2658[var174].field7445;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field6362[--field6376];
                    if (class229.field3807 != null && var175 < class314.field4918) {
                        field6362[field6376++] = class183.field2658[var175].field7444;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6362[field6376++] = class248.field4033;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field6360[--field6371];
                    class372.method2419(100, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field6362[field6376++] = class303.field4775;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field6360[--field6371];
                    class163.method1026((byte) 40, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class371.method2413(false);
                    return;
                }
                if (arg0 == 3621) {
                    if (class75.field1117 == 0) {
                        field6362[field6376++] = -1;
                        return;
                    }
                    field6362[field6376++] = class358.field5566;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field6362[--field6376];
                    if (class75.field1117 != 0 && var178 < class358.field5566) {
                        field6360[field6371++] = class329.field5176[var178];
                        if (class12.field132[var178] != null) {
                            field6360[field6371++] = class12.field132[var178];
                            return;
                        }
                        field6360[field6371++] = "";
                        return;
                    }
                    field6360[field6371++] = "";
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field6360[--field6371];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field6362[field6376++] = class487.method2988(var179, -44) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field6362[--field6376];
                    if (class183.field2658 != null && var180 < class314.field4918 && class183.field2658[var180].field7442.equalsIgnoreCase(class358.field5565.field5443)) {
                        field6362[field6376++] = 1;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class38.field382 != null) {
                        field6360[field6371++] = class38.field382;
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field6362[--field6376];
                    if (class229.field3807 != null && var181 < class314.field4918) {
                        field6360[field6371++] = class183.field2658[var181].field7448;
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field6362[--field6376];
                    if (class75.field1117 == 2 && var182 >= 0 && var182 < class162.field2352) {
                        field6362[field6376++] = class101.field1452[var182] ? 1 : 0;
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field6360[--field6371];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field6362[field6376++] = class398.method2562(-105, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field6362[field6376++] = class328.field5158;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field6360[--field6371];
                    class59.method446(true, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field6362[--field6376];
                    field6362[field6376++] = class276.field4382[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field6362[--field6376];
                    if (class229.field3807 != null && var186 < class314.field4918) {
                        field6360[field6371++] = class183.field2658[var186].field7442;
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field6362[--field6376];
                    if (class75.field1117 != 0 && var187 < class358.field5566) {
                        field6360[field6371++] = class449.field6965[var187];
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field6362[--field6376];
                    field6362[field6376++] = class444.field6908[var188].method3185(-18230);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field6362[--field6376];
                    field6362[field6376++] = class444.field6908[var189].field7857;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field6362[--field6376];
                    field6362[field6376++] = class444.field6908[var190].field7862;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field6362[--field6376];
                    field6362[field6376++] = class444.field6908[var191].field7854;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field6362[--field6376];
                    field6362[field6376++] = class444.field6908[var192].field7860;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field6362[--field6376];
                    field6362[field6376++] = class444.field6908[var193].field7856;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field6362[--field6376];
                    int var195 = class444.field6908[var194].method3184(false);
                    field6362[field6376++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field6362[--field6376];
                    int var197 = class444.field6908[var196].method3184(false);
                    field6362[field6376++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field6362[--field6376];
                    int var199 = class444.field6908[var198].method3184(false);
                    field6362[field6376++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field6362[--field6376];
                    int var201 = class444.field6908[var200].method3184(false);
                    field6362[field6376++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6376 -= 2;
                    int var202 = field6362[field6376];
                    int var203 = field6362[field6376 + 1];
                    field6362[field6376++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field6376 -= 2;
                    int var204 = field6362[field6376];
                    int var205 = field6362[field6376 + 1];
                    field6362[field6376++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field6376 -= 2;
                    int var206 = field6362[field6376];
                    int var207 = field6362[field6376 + 1];
                    field6362[field6376++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field6376 -= 2;
                    int var208 = field6362[field6376];
                    int var209 = field6362[field6376 + 1];
                    field6362[field6376++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field6362[--field6376];
                    field6362[field6376++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field6362[--field6376];
                    field6362[field6376++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6376 -= 5;
                    int var212 = field6362[field6376];
                    int var213 = field6362[field6376 + 1];
                    int var214 = field6362[field6376 + 2];
                    int var215 = field6362[field6376 + 3];
                    int var216 = field6362[field6376 + 4];
                    field6362[field6376++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field6376 -= 2;
                    long var217 = (long) field6362[field6376];
                    long var219 = (long) field6362[field6376 + 1];
                    field6362[field6376++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field6376 -= 2;
                    int var221 = field6362[field6376];
                    int var222 = field6362[field6376 + 1];
                    field6362[field6376++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field6376 -= 2;
                    int var223 = field6362[field6376];
                    int var224 = field6362[field6376 + 1];
                    field6362[field6376++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6376 -= 2;
                    int var225 = field6362[field6376];
                    int var226 = field6362[field6376 + 1];
                    field6362[field6376++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6376 -= 2;
                    int var227 = field6362[field6376];
                    int var228 = field6362[field6376 + 1];
                    field6362[field6376++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field6376 -= 2;
                    int var229 = field6362[field6376];
                    int var230 = field6362[field6376 + 1];
                    if (var229 == 0) {
                        field6362[field6376++] = 0;
                        return;
                    }
                    field6362[field6376++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field6376 -= 2;
                    int var231 = field6362[field6376];
                    int var232 = field6362[field6376 + 1];
                    if (var231 == 0) {
                        field6362[field6376++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field6362[field6376++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6362[field6376++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field6376 -= 2;
                    int var233 = field6362[field6376];
                    int var234 = field6362[field6376 + 1];
                    field6362[field6376++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field6376 -= 2;
                    int var235 = field6362[field6376];
                    int var236 = field6362[field6376 + 1];
                    field6362[field6376++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field6376 -= 2;
                    int var237 = field6362[field6376];
                    int var238 = field6362[field6376 + 1];
                    field6362[field6376++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field6376 -= 2;
                    int var239 = field6362[field6376];
                    int var240 = field6362[field6376 + 1];
                    field6362[field6376++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field6376 -= 3;
                    long var241 = (long) field6362[field6376];
                    long var243 = (long) field6362[field6376 + 1];
                    long var245 = (long) field6362[field6376 + 2];
                    field6362[field6376++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field6360[--field6371];
                    int var248 = field6362[--field6376];
                    field6360[field6371++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field6371 -= 2;
                    String var249 = field6360[field6371];
                    String var250 = field6360[field6371 + 1];
                    field6360[field6371++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field6360[--field6371];
                    int var252 = field6362[--field6376];
                    field6360[field6371++] = var251 + class203.method1388((byte) 28, var252, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field6360[--field6371];
                    field6360[field6371++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6360[field6371++] = method2678(field6362[--field6376]);
                    return;
                }
                if (arg0 == 4105) {
                    field6371 -= 2;
                    String var254 = field6360[field6371];
                    String var255 = field6360[field6371 + 1];
                    if (class358.field5565.field5430 != null && class358.field5565.field5430.field1159) {
                        field6360[field6371++] = var255;
                        return;
                    }
                    field6360[field6371++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field6362[--field6376];
                    field6360[field6371++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field6371 -= 2;
                    field6362[field6376++] = class299.method2011(field6360[field6371 + 1], (byte) 66, class12.field131, field6360[field6371]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field6360[--field6371];
                    field6376 -= 2;
                    int var258 = field6362[field6376];
                    int var259 = field6362[field6376 + 1];
                    class340 var260 = class310.method2082((byte) 121, 0, class130.field1767, var259);
                    field6362[field6376++] = var260.method2259(7007, class447.field6944, var258, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field6360[--field6371];
                    field6376 -= 2;
                    int var262 = field6362[field6376];
                    int var263 = field6362[field6376 + 1];
                    class340 var264 = class310.method2082((byte) 121, 0, class130.field1767, var263);
                    field6362[field6376++] = var264.method2254(class447.field6944, var262, var261, -57);
                    return;
                }
                if (arg0 == 4110) {
                    field6371 -= 2;
                    String var265 = field6360[field6371];
                    String var266 = field6360[field6371 + 1];
                    if (field6362[--field6376] == 1) {
                        field6360[field6371++] = var265;
                        return;
                    }
                    field6360[field6371++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field6360[--field6371];
                    field6360[field6371++] = class360.method2381(106, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field6360[--field6371];
                    int var269 = field6362[--field6376];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6360[field6371++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field6362[--field6376];
                    field6362[field6376++] = class399.method2577((char) var270, 127) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field6362[--field6376];
                    field6362[field6376++] = class524.method3130((char) var271, 7434) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field6362[--field6376];
                    field6362[field6376++] = class35.method220((byte) 83, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field6362[--field6376];
                    field6362[field6376++] = class443.method2807((char) var273, -1719) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field6360[--field6371];
                    if (var274 != null) {
                        field6362[field6376++] = var274.length();
                        return;
                    }
                    field6362[field6376++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field6360[--field6371];
                    field6376 -= 2;
                    int var276 = field6362[field6376];
                    int var277 = field6362[field6376 + 1];
                    field6360[field6371++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field6360[--field6371];
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
                    field6360[field6371++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field6360[--field6371];
                    field6376 -= 2;
                    int var284 = field6362[field6376];
                    int var285 = field6362[field6376 + 1];
                    field6362[field6376++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field6371 -= 2;
                    String var286 = field6360[field6371];
                    String var287 = field6360[field6371 + 1];
                    int var288 = field6362[--field6376];
                    field6362[field6376++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field6362[--field6376];
                    field6362[field6376++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field6362[--field6376];
                    field6362[field6376++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field6362[--field6376] != 0;
                    int var292 = field6362[--field6376];
                    field6360[field6371++] = class301.method2026((long) var292, class12.field131, var291, 0, 4160);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field6360[--field6371];
                    int var294 = field6362[--field6376];
                    class340 var295 = class310.method2082((byte) 121, 0, class130.field1767, var294);
                    field6362[field6376++] = var295.method2255(var293, class447.field6944, 169);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field6362[--field6376];
                    field6360[field6371++] = class337.field5262.method2077((byte) -65, var296).field3034;
                    return;
                }
                if (arg0 == 4201) {
                    field6376 -= 2;
                    int var297 = field6362[field6376];
                    int var298 = field6362[field6376 + 1];
                    class196 var299 = class337.field5262.method2077((byte) -65, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field3011[var298 - 1] != null) {
                        field6360[field6371++] = var299.field3011[var298 - 1];
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6376 -= 2;
                    int var300 = field6362[field6376];
                    int var301 = field6362[field6376 + 1];
                    class196 var302 = class337.field5262.method2077((byte) -65, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field3000[var301 - 1] != null) {
                        field6360[field6371++] = var302.field3000[var301 - 1];
                        return;
                    }
                    field6360[field6371++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field6362[--field6376];
                    field6362[field6376++] = class337.field5262.method2077((byte) -65, var303).field3020;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field6362[--field6376];
                    field6362[field6376++] = class337.field5262.method2077((byte) -65, var304).field2973 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field6362[--field6376];
                    class196 var306 = class337.field5262.method2077((byte) -65, var305);
                    if (var306.field3010 == -1 && var306.field3017 >= 0) {
                        field6362[field6376++] = var306.field3017;
                        return;
                    }
                    field6362[field6376++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field6362[--field6376];
                    class196 var308 = class337.field5262.method2077((byte) -65, var307);
                    if (var308.field3010 >= 0 && var308.field3017 >= 0) {
                        field6362[field6376++] = var308.field3017;
                        return;
                    }
                    field6362[field6376++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field6362[--field6376];
                    field6362[field6376++] = class337.field5262.method2077((byte) -65, var309).field3002 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6376 -= 2;
                    int var310 = field6362[field6376];
                    int var311 = field6362[field6376 + 1];
                    class442 var312 = class274.field4353.method1171((byte) 82, var311);
                    if (var312.method2799(-69)) {
                        field6360[field6371++] = class337.field5262.method2077((byte) -65, var310).method1343(-8363, var312.field6871, var311);
                        return;
                    }
                    field6362[field6376++] = class337.field5262.method2077((byte) -65, var310).method1350(var312.field6872, (byte) 72, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field6376 -= 2;
                    int var313 = field6362[field6376];
                    int var314 = field6362[field6376 + 1] - 1;
                    class196 var315 = class337.field5262.method2077((byte) -65, var313);
                    if (var315.field2966 == var314) {
                        field6362[field6376++] = var315.field2977;
                        return;
                    }
                    if (var315.field2976 == var314) {
                        field6362[field6376++] = var315.field2959;
                        return;
                    }
                    field6362[field6376++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field6360[--field6371];
                    int var317 = field6362[--field6376];
                    class345.method2280(var316, (byte) 116, var317 == 1);
                    field6362[field6376++] = class454.field7028;
                    return;
                }
                if (arg0 == 4211) {
                    if (class152.field2019 != null && class77.field1148 < class454.field7028) {
                        field6362[field6376++] = class152.field2019[class77.field1148++] & 0xFFFF;
                        return;
                    }
                    field6362[field6376++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class77.field1148 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6376 -= 2;
                    int var318 = field6362[field6376];
                    int var319 = field6362[field6376 + 1];
                    class442 var320 = class274.field4353.method1171((byte) 82, var319);
                    if (var320.method2799(-111)) {
                        field6360[field6371++] = class6.field72.method2977(var318, 50).method1193(var319, var320.field6871, (byte) 96);
                        return;
                    }
                    field6362[field6376++] = class6.field72.method2977(var318, 50).method1192(var319, true, var320.field6872);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6376 -= 2;
                    int var321 = field6362[field6376];
                    int var322 = field6362[field6376 + 1];
                    class442 var323 = class274.field4353.method1171((byte) 82, var322);
                    if (var323.method2799(-69)) {
                        field6360[field6371++] = class454.field7029.method3002(-1, var321).method963(var323.field6871, var322, (byte) -104);
                        return;
                    }
                    field6362[field6376++] = class454.field7029.method3002(-1, var321).method947(var323.field6872, false, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6376 -= 2;
                    int var324 = field6362[field6376];
                    int var325 = field6362[field6376 + 1];
                    class442 var326 = class274.field4353.method1171((byte) 82, var325);
                    if (var326.method2799(-116)) {
                        field6360[field6371++] = class436.field6588.method347(var324, (byte) 123).method2305(25085, var326.field6871, var325);
                        return;
                    }
                    field6362[field6376++] = class436.field6588.method347(var324, (byte) 107).method2301((byte) 55, var325, var326.field6872);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field6362[--field6376];
                class289 var328 = class19.field199.method2294(var327, 1);
                if (var328.field4548 != null && var328.field4548.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field4546[0];
                    for (int var331 = 1; var331 < var328.field4548.length; var331++) {
                        if (var328.field4546[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field4546[var331];
                        }
                    }
                    field6362[field6376++] = var328.field4548[var329];
                    return;
                }
                field6362[field6376++] = var328.field4562;
                return;
            }
        } else {
            class437 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class255.method1747(field6362[--field6376], false);
            } else {
                var47 = arg1 ? field6377 : field6363;
            }
            if (arg0 == 1300) {
                int var48 = field6362[--field6376] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2766(-29468, field6360[--field6371], var48);
                    return;
                } else {
                    field6371--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field6376 -= 2;
                int var49 = field6362[field6376];
                int var50 = field6362[field6376 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field6637 = null;
                    return;
                }
                var47.field6637 = class24.method150(true, var50, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field6362[--field6376];
                if (class537.field7865 != var51 && class143.field1934 != var51 && class249.field4053 != var51) {
                    return;
                }
                var47.field6661 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field6655 = field6362[--field6376];
                return;
            }
            if (arg0 == 1304) {
                var47.field6650 = field6362[--field6376];
                return;
            }
            if (arg0 == 1305) {
                var47.field6632 = field6360[--field6371];
                return;
            }
            if (arg0 == 1306) {
                var47.field6669 = field6360[--field6371];
                return;
            }
            if (arg0 == 1307) {
                var47.field6724 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field6707 = field6362[--field6376];
                var47.field6618 = field6362[--field6376];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field6362[--field6376];
                int var53 = field6362[--field6376];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2763(var53 - 1, (byte) -119, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field6681 = field6360[--field6371];
                return;
            }
            if (arg0 == 1311) {
                var47.field6745 = field6362[--field6376];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field6376 -= 3;
                    var54 = field6362[field6376] - 1;
                    var55 = field6362[field6376 + 1];
                    var56 = field6362[field6376 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6376 -= 2;
                    var54 = 10;
                    var55 = field6362[field6376];
                    var56 = field6362[field6376 + 1];
                }
                if (var47.field6674 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field6674 = new byte[11];
                    var47.field6631 = new byte[11];
                    var47.field6620 = new int[11];
                }
                var47.field6674[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field6626 = false;
                    for (int var57 = 0; var57 < var47.field6674.length; var57++) {
                        if (var47.field6674[var57] != 0) {
                            var47.field6626 = true;
                            break;
                        }
                    }
                } else {
                    var47.field6626 = true;
                }
                var47.field6631[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field6593 = field6362[--field6376];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    private static final void method2680(int arg0) {
        class437 var1 = class255.method1747(arg0, false);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class437[] var3 = class462.field7111[var2];
        if (var3 == null) {
            class437[] var4 = class433.field6540[var2];
            int var5 = var4.length;
            var3 = class462.field7111[var2] = new class437[var5];
            class324.method2168(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class324.method2168(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    private static final void method2681(int arg0) {
        class437 var1 = class255.method1747(arg0, false);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class437[] var3 = class462.field7111[var2];
        if (var3 == null) {
            class437[] var4 = class433.field6540[var2];
            int var5 = var4.length;
            var3 = class462.field7111[var2] = new class437[var5];
            class324.method2168(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class324.method2168(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IZ)V")
    private static final void method2682(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6362[field6376++] = class435.field6566;
                return;
            }
            if (arg0 == 5001) {
                field6376 -= 3;
                class435.field6566 = field6362[field6376];
                class482.field7334 = class3.method38(field6362[field6376 + 1], (byte) 101);
                if (class482.field7334 == null) {
                    class482.field7334 = class162.field2353;
                }
                class467.field7158 = field6362[field6376 + 2];
                field6355++;
                class81.method578((byte) 66, class276.field4381);
                class170.field2488.method1479((byte) -127, class435.field6566);
                class170.field2488.method1479((byte) -124, class482.field7334.field4795);
                class170.field2488.method1479((byte) -86, class467.field7158);
                return;
            }
            if (arg0 == 5002) {
                field6371 -= 2;
                String var2 = field6360[field6371];
                String var3 = field6360[field6371 + 1];
                field6376 -= 2;
                int var4 = field6362[field6376];
                int var5 = field6362[field6376 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field6368++;
                class81.method578((byte) 66, class237.field3885);
                class170.field2488.method1479((byte) -115, class147.method896(var2, (byte) -99) + class147.method896(var3, (byte) -99) + 2);
                class170.field2488.method1458(var2, (byte) 78);
                class170.field2488.method1479((byte) -93, var4 - 1);
                class170.field2488.method1479((byte) -89, var5);
                class170.field2488.method1458(var3, (byte) 78);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field6362[--field6376];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class266.field4281[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field6360[field6371++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field6362[--field6376];
                int var9 = -1;
                if (var8 < 100 && class266.field4281[var8] != null) {
                    var9 = class226.field3778[var8];
                }
                field6362[field6376++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class482.field7334 == null) {
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = class482.field7334.field4795;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field6360[--field6371];
                method2685(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6371 -= 2;
                String var11 = field6360[field6371];
                String var12 = field6360[field6371 + 1];
                if (class439.field6815 != 0 || (!class504.field7552 || class225.field3771) && !class103.field1504) {
                    field6378++;
                    class81.method578((byte) 66, class473.field7256);
                    class170.field2488.method1479((byte) -128, 0);
                    int var13 = class170.field2488.field3162;
                    class170.field2488.method1458(var11, (byte) 78);
                    class228.method1640(-971571636, class170.field2488, var12);
                    class170.field2488.method1438(65280, class170.field2488.field3162 - var13);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field6362[--field6376];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class361.field5597[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field6360[field6371++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field6362[--field6376];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class102.field1488[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field6360[field6371++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field6362[--field6376];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class204.field3122[var18];
                }
                field6362[field6376++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class358.field5565 == null || class358.field5565.field5417 == null) {
                    var20 = class372.field5719;
                } else {
                    var20 = class358.field5565.method2318(true, 255);
                }
                field6360[field6371++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field6362[field6376++] = class467.field7158;
                return;
            }
            if (arg0 == 5017) {
                field6362[field6376++] = class419.field6353;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field6362[--field6376];
                int var22 = 0;
                if (var21 < 100 && class266.field4281[var21] != null) {
                    var22 = class293.field4630[var21];
                }
                field6362[field6376++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field6362[--field6376];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class93.field1353[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field6360[field6371++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class358.field5565 == null || class358.field5565.field5417 == null) {
                    var25 = class372.field5719;
                } else {
                    var25 = class358.field5565.method2311((byte) 104, false);
                }
                field6360[field6371++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field6362[--field6376];
                field6360[field6371++] = class5.field62.method2276(var26, 93).field5244;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field6362[--field6376];
                class336 var28 = class5.field62.method2276(var27, 29);
                if (var28.field5255 == null) {
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = var28.field5255.length;
                return;
            }
            if (arg0 == 5052) {
                field6376 -= 2;
                int var29 = field6362[field6376];
                int var30 = field6362[field6376 + 1];
                class336 var31 = class5.field62.method2276(var29, 8);
                int var32 = var31.field5255[var30];
                field6362[field6376++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field6362[--field6376];
                class336 var34 = class5.field62.method2276(var33, 121);
                if (var34.field5245 == null) {
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = var34.field5245.length;
                return;
            }
            if (arg0 == 5054) {
                field6376 -= 2;
                int var35 = field6362[field6376];
                int var36 = field6362[field6376 + 1];
                field6362[field6376++] = class5.field62.method2276(var35, 86).field5245[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field6362[--field6376];
                field6360[field6371++] = class500.field7501.method1849(true, var37).method3059(-26099);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field6362[--field6376];
                class504 var39 = class500.field7501.method1849(true, var38);
                if (var39.field7540 == null) {
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = var39.field7540.length;
                return;
            }
            if (arg0 == 5057) {
                field6376 -= 2;
                int var40 = field6362[field6376];
                int var41 = field6362[field6376 + 1];
                field6362[field6376++] = class500.field7501.method1849(true, var40).field7540[var41];
                return;
            }
            if (arg0 == 5058) {
                field6369 = new class385();
                field6369.field5885 = field6362[--field6376];
                field6369.field5891 = class500.field7501.method1849(true, field6369.field5885);
                field6369.field5897 = new int[field6369.field5891.method3063(112)];
                return;
            }
            if (arg0 == 5059) {
                field6367++;
                class81.method578((byte) 66, class166.field2422);
                class170.field2488.method1479((byte) -125, 0);
                int var42 = class170.field2488.field3162;
                class170.field2488.method1479((byte) -94, 0);
                class170.field2488.method1437(field6369.field5885, 0);
                field6369.field5891.method3066(-29699, field6369.field5897, class170.field2488);
                class170.field2488.method1438(65280, class170.field2488.field3162 - var42);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field6360[--field6371];
                field6361++;
                class81.method578((byte) 66, class385.field5889);
                class170.field2488.method1479((byte) -99, 0);
                int var44 = class170.field2488.field3162;
                class170.field2488.method1458(var43, (byte) 78);
                class170.field2488.method1437(field6369.field5885, 0);
                field6369.field5891.method3066(-29699, field6369.field5897, class170.field2488);
                class170.field2488.method1438(65280, class170.field2488.field3162 - var44);
                return;
            }
            if (arg0 == 5061) {
                field6367++;
                class81.method578((byte) 66, class166.field2422);
                class170.field2488.method1479((byte) -101, 0);
                int var45 = class170.field2488.field3162;
                class170.field2488.method1479((byte) -98, 1);
                class170.field2488.method1437(field6369.field5885, 0);
                field6369.field5891.method3066(-29699, field6369.field5897, class170.field2488);
                class170.field2488.method1438(65280, class170.field2488.field3162 - var45);
                return;
            }
            if (arg0 == 5062) {
                field6376 -= 2;
                int var46 = field6362[field6376];
                int var47 = field6362[field6376 + 1];
                field6362[field6376++] = class5.field62.method2276(var46, 73).field5243[var47];
                return;
            }
            if (arg0 == 5063) {
                field6376 -= 2;
                int var48 = field6362[field6376];
                int var49 = field6362[field6376 + 1];
                field6362[field6376++] = class5.field62.method2276(var48, 76).field5249[var49];
                return;
            }
            if (arg0 == 5064) {
                field6376 -= 2;
                int var50 = field6362[field6376];
                int var51 = field6362[field6376 + 1];
                if (var51 == -1) {
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = class5.field62.method2276(var50, 115).method2233(116, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field6376 -= 2;
                int var52 = field6362[field6376];
                int var53 = field6362[field6376 + 1];
                if (var53 == -1) {
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = class5.field62.method2276(var52, 95).method2232(-113, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field6362[--field6376];
                field6362[field6376++] = class500.field7501.method1849(true, var54).method3063(100);
                return;
            }
            if (arg0 == 5067) {
                field6376 -= 2;
                int var55 = field6362[field6376];
                int var56 = field6362[field6376 + 1];
                int var57 = class500.field7501.method1849(true, var55).method3058(var56, 0).field107;
                field6362[field6376++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field6376 -= 2;
                int var58 = field6362[field6376];
                int var59 = field6362[field6376 + 1];
                field6369.field5897[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field6376 -= 2;
                int var60 = field6362[field6376];
                int var61 = field6362[field6376 + 1];
                field6369.field5897[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field6376 -= 3;
                int var62 = field6362[field6376];
                int var63 = field6362[field6376 + 1];
                int var64 = field6362[field6376 + 2];
                class504 var65 = class500.field7501.method1849(true, var62);
                if (var65.method3058(var63, 0).field107 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6362[field6376++] = var65.method3065(4011, var63, var64);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field6360[--field6371];
                boolean var67 = field6362[--field6376] == 1;
                class257.method1756(-88, var66, var67);
                field6362[field6376++] = class454.field7028;
                return;
            }
            if (arg0 == 5072) {
                if (class152.field2019 != null && class77.field1148 < class454.field7028) {
                    field6362[field6376++] = class152.field2019[class77.field1148++] & 0xFFFF;
                    return;
                }
                field6362[field6376++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class77.field1148 = 0;
                return;
            }
            if (arg0 == 5074) {
                field6367++;
                class81.method578((byte) 66, class166.field2422);
                class170.field2488.method1479((byte) -120, 0);
                int var68 = class170.field2488.field3162;
                class170.field2488.method1479((byte) -97, 2);
                class170.field2488.method1437(field6369.field5885, 0);
                field6369.field5891.method3066(-29699, field6369.field5897, class170.field2488);
                class170.field2488.method1438(65280, class170.field2488.field3162 - var68);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class36.field376.method927(86, -1234)) {
                    field6362[field6376++] = 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class36.field376.method927(82, -1234)) {
                    field6362[field6376++] = 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class36.field376.method927(81, -1234)) {
                    field6362[field6376++] = 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class444.method2808(5603, field6362[--field6376]);
                return;
            }
            if (arg0 == 5201) {
                field6362[field6376++] = class148.method902(false);
                return;
            }
            if (arg0 == 5205) {
                class285.method1926(field6362[--field6376], -1, -1, true, false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field6362[--field6376];
                class258 var70 = class194.method1207(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = var70.field4164;
                return;
            }
            if (arg0 == 5207) {
                class258 var71 = class194.method1208(field6362[--field6376]);
                if (var71 != null && var71.field4162 != null) {
                    field6360[field6371++] = var71.field4162;
                    return;
                }
                field6360[field6371++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6362[field6376++] = class331.field5189;
                field6362[field6376++] = class325.field5109;
                return;
            }
            if (arg0 == 5209) {
                field6362[field6376++] = class201.field3060 + class194.field2883;
                field6362[field6376++] = class297.field4679 + class194.field2900;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field6362[--field6376];
                class258 var73 = class194.method1208(var72);
                if (var73 == null) {
                    field6362[field6376++] = 0;
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = var73.field4172 >> 14 & 0x3FFF;
                field6362[field6376++] = var73.field4172 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field6362[--field6376];
                class258 var75 = class194.method1208(var74);
                if (var75 == null) {
                    field6362[field6376++] = 0;
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = var75.field4177 - var75.field4168;
                field6362[field6376++] = var75.field4175 - var75.field4158;
                return;
            }
            if (arg0 == 5212) {
                class224 var76 = class58.method443(false);
                if (var76 == null) {
                    field6362[field6376++] = -1;
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = var76.field3759;
                int var77 = var76.field3764 << 28 | class194.field2883 + var76.field3758 << 14 | class194.field2900 + var76.field3763;
                field6362[field6376++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class224 var78 = class390.method2496((byte) 58);
                if (var78 == null) {
                    field6362[field6376++] = -1;
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = var78.field3759;
                int var79 = var78.field3764 << 28 | class194.field2883 + var78.field3758 << 14 | class194.field2900 + var78.field3763;
                field6362[field6376++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field6362[--field6376];
                class258 var81 = class192.method1200(-86);
                if (var81 != null) {
                    boolean var82 = var81.method1757(0, var80 & 0x3FFF, var80 >> 14 & 0x3FFF, var80 >> 28 & 0x3, field6381);
                    if (var82) {
                        class378.method2448(field6381[2], field6381[1], 131072);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6376 -= 2;
                int var83 = field6362[field6376];
                int var84 = field6362[field6376 + 1];
                class434 var85 = class194.method1214(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class258 var87 = (class258) var85.method2732(34); var87 != null; var87 = (class258) var85.method2729(84)) {
                    if (var87.field4164 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field6362[field6376++] = 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field6362[--field6376];
                class258 var89 = class194.method1208(var88);
                if (var89 == null) {
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = var89.field4165;
                return;
            }
            if (arg0 == 5220) {
                field6362[field6376++] = class213.field3643 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field6362[--field6376];
                class378.method2448(var90 & 0x3FFF, var90 >> 14 & 0x3FFF, 131072);
                return;
            }
            if (arg0 == 5222) {
                class258 var91 = class192.method1200(-34);
                if (var91 != null) {
                    boolean var92 = var91.method1759(field6381, class201.field3060 + class194.field2883, -72, class297.field4679 + class194.field2900);
                    if (var92) {
                        field6362[field6376++] = field6381[1];
                        field6362[field6376++] = field6381[2];
                        return;
                    }
                    field6362[field6376++] = -1;
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = -1;
                field6362[field6376++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6376 -= 2;
                int var93 = field6362[field6376];
                int var94 = field6362[field6376 + 1];
                class285.method1926(var93, var94 >> 14 & 0x3FFF, var94 & 0x3FFF, true, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field6362[--field6376];
                class258 var96 = class192.method1200(-104);
                if (var96 != null) {
                    boolean var97 = var96.method1757(0, var95 & 0x3FFF, var95 >> 14 & 0x3FFF, var95 >> 28 & 0x3, field6381);
                    if (var97) {
                        field6362[field6376++] = field6381[1];
                        field6362[field6376++] = field6381[2];
                        return;
                    }
                    field6362[field6376++] = -1;
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = -1;
                field6362[field6376++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field6362[--field6376];
                class258 var99 = class192.method1200(-29);
                if (var99 != null) {
                    boolean var100 = var99.method1759(field6381, var98 >> 14 & 0x3FFF, -77, var98 & 0x3FFF);
                    if (var100) {
                        field6362[field6376++] = field6381[1];
                        field6362[field6376++] = field6381[2];
                        return;
                    }
                    field6362[field6376++] = -1;
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = -1;
                field6362[field6376++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class474.method2953(field6362[--field6376], (byte) -83);
                return;
            }
            if (arg0 == 5227) {
                field6376 -= 2;
                int var101 = field6362[field6376];
                int var102 = field6362[field6376 + 1];
                class285.method1926(var101, var102 >> 14 & 0x3FFF, var102 & 0x3FFF, true, true);
                return;
            }
            if (arg0 == 5228) {
                class411.field6235 = field6362[--field6376] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6362[field6376++] = class411.field6235 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field6362[--field6376];
                class174.method1092(var103, 73);
                return;
            }
            if (arg0 == 5231) {
                field6376 -= 2;
                int var104 = field6362[field6376];
                boolean var105 = field6362[field6376 + 1] == 1;
                if (class136.field1848 != null) {
                    class529 var106 = class136.field1848.method1122((byte) 59, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method3149(100);
                        return;
                    }
                    if (var106 == null && var105) {
                        class529 var107 = new class529();
                        class136.field1848.method1127(var107, (byte) 47, (long) var104);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field6362[--field6376];
                if (class136.field1848 != null) {
                    class529 var109 = class136.field1848.method1122((byte) 59, (long) var108);
                    field6362[field6376++] = var109 == null ? 0 : 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6376 -= 2;
                int var110 = field6362[field6376];
                boolean var111 = field6362[field6376 + 1] == 1;
                if (class7.field82 != null) {
                    class529 var112 = class7.field82.method1122((byte) 59, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method3149(75);
                        return;
                    }
                    if (var112 == null && var111) {
                        class529 var113 = new class529();
                        class7.field82.method1127(var113, (byte) 40, (long) var110);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field6362[--field6376];
                if (class7.field82 != null) {
                    class529 var115 = class7.field82.method1122((byte) 59, (long) var114);
                    field6362[field6376++] = var115 == null ? 0 : 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6362[field6376++] = class194.field2863 == null ? -1 : class194.field2863.field4164;
                return;
            }
            if (arg0 == 5236) {
                field6376 -= 2;
                int var116 = field6362[field6376];
                int var117 = field6362[field6376 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class321.method2147(var116, 124, var118, var119);
                if (var120 < 0) {
                    field6362[field6376++] = -1;
                    return;
                }
                field6362[field6376++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class31.method201((byte) -33);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6376 -= 2;
                int var121 = field6362[field6376];
                int var122 = field6362[field6376 + 1];
                class320.method2142(false, var122, var121, 3, -4);
                field6362[field6376++] = class216.field3671 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class216.field3671 != null) {
                    class320.method2142(false, -1, -1, class141.field1911.field6110, -4);
                }
                return;
            }
            if (arg0 == 5302) {
                class534[] var123 = class306.method2058((byte) 10);
                field6362[field6376++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field6362[--field6376];
                class534[] var125 = class306.method2058((byte) 10);
                field6362[field6376++] = var125[var124].field7824;
                field6362[field6376++] = var125[var124].field7825;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class141.field1911.field6117;
                int var127 = class141.field1911.field6116;
                int var128 = -1;
                class534[] var129 = class306.method2058((byte) 10);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class534 var131 = var129[var130];
                    if (var131.field7824 == var126 && var131.field7825 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field6362[field6376++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field6362[field6376++] = class5.method47(-1129530388);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field6362[--field6376];
                if (var132 >= 1 && var132 <= 2) {
                    class320.method2142(false, -1, -1, var132, -4);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6362[field6376++] = class141.field1911.field6110;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field6362[--field6376];
                if (var133 >= 1 && var133 <= 2) {
                    class141.field1911.field6110 = var133;
                    class141.field1911.method1638(32749, class339.field5294);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6371 -= 2;
                String var134 = field6360[field6371];
                String var135 = field6360[field6371 + 1];
                int var136 = field6362[--field6376];
                field6357++;
                class81.method578((byte) 66, class450.field6980);
                class170.field2488.method1479((byte) -89, class147.method896(var134, (byte) -99) + class147.method896(var135, (byte) -99) + 1);
                class170.field2488.method1458(var134, (byte) 78);
                class170.field2488.method1458(var135, (byte) 78);
                class170.field2488.method1479((byte) -88, var136);
                return;
            }
            if (arg0 == 5401) {
                field6376 -= 2;
                class96.field1397[field6362[field6376]] = (short) class328.method2193(field6362[field6376 + 1], 255);
                class337.field5262.method2078((byte) -127);
                class337.field5262.method2087(false);
                class6.field72.method2973(true);
                class236.method1667(2318);
                return;
            }
            if (arg0 == 5405) {
                field6376 -= 2;
                int var137 = field6362[field6376];
                int var138 = field6362[field6376 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class123.field1676[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6376 -= 7;
                int var139 = field6362[field6376];
                int var140 = field6362[field6376 + 1] << 1;
                int var141 = field6362[field6376 + 2];
                int var142 = field6362[field6376 + 3];
                int var143 = field6362[field6376 + 4];
                int var144 = field6362[field6376 + 5];
                int var145 = field6362[field6376 + 6];
                if (var139 >= 0 && var139 < 2 && class123.field1676[var139] != null && var140 >= 0 && var140 < class123.field1676[var139].length) {
                    class123.field1676[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class123.field1676[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class123.field1676[field6362[--field6376]].length >> 1;
                field6362[field6376++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class216.field3671 != null) {
                    class320.method2142(false, -1, -1, class141.field1911.field6110, -4);
                }
                if (class92.field1342 != null) {
                    class535.method3169(-121);
                    System.exit(0);
                    return;
                }
                String var147 = class164.field2372 == null ? class10.method67(2) : class164.field2372;
                class68.method488(class339.field5294, class452.field7013 == 1, var147, 0, false);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class439.field6818 != null) {
                    if (class439.field6818.field7462 == null) {
                        var148 = class254.method1742(612130280, class439.field6818.field7463);
                    } else {
                        var148 = (String) class439.field6818.field7462;
                    }
                }
                field6360[field6371++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field6362[field6376++] = class2.field15 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class216.field3671 != null) {
                    class320.method2142(false, -1, -1, class141.field1911.field6110, -4);
                }
                String var149 = field6360[--field6371];
                boolean var150 = field6362[--field6376] == 1;
                String var151 = class10.method67(2) + var149;
                class68.method488(class339.field5294, class452.field7013 == 1, var151, 0, var150);
                return;
            }
            if (arg0 == 5422) {
                field6371 -= 2;
                String var152 = field6360[field6371];
                String var153 = field6360[field6371 + 1];
                int var154 = field6362[--field6376];
                if (var152.length() > 0) {
                    if (class212.field3631 == null) {
                        class212.field3631 = new String[class323.field5082[class516.field7674.field3873]];
                    }
                    class212.field3631[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class178.field2612 == null) {
                        class178.field2612 = new String[class323.field5082[class516.field7674.field3873]];
                    }
                    class178.field2612[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6360[--field6371]);
                return;
            }
            if (arg0 == 5424) {
                field6376 -= 11;
                class217.field3696 = field6362[field6376];
                class10.field103 = field6362[field6376 + 1];
                class149.field2011 = field6362[field6376 + 2];
                class92.field1351 = field6362[field6376 + 3];
                class122.field1665 = field6362[field6376 + 4];
                class303.field4771 = field6362[field6376 + 5];
                class352.field5489 = field6362[field6376 + 6];
                class261.field4201 = field6362[field6376 + 7];
                class16.field165 = field6362[field6376 + 8];
                class126.field1720 = field6362[field6376 + 9];
                class172.field2525 = field6362[field6376 + 10];
                class120.field1646.method1012(class122.field1665, true);
                class120.field1646.method1012(class303.field4771, true);
                class120.field1646.method1012(class352.field5489, true);
                class120.field1646.method1012(class261.field4201, true);
                class120.field1646.method1012(class16.field165, true);
                class189.field2751 = null;
                class7.field79 = null;
                class467.field7155 = null;
                class361.field5591 = null;
                class52.field708 = null;
                class490.field7412 = null;
                class9.field98 = null;
                class417.field6327 = null;
                class377.field5794 = true;
                return;
            }
            if (arg0 == 5425) {
                class7.method61((byte) 95);
                class377.field5794 = false;
                return;
            }
            if (arg0 == 5426) {
                field6376 -= 2;
                class86.field1254 = field6362[field6376];
                class460.field7099 = field6362[field6376 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6376 -= 2;
                class511.field7604 = field6362[field6376 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6376 -= 2;
                int var155 = field6362[field6376];
                int var156 = field6362[field6376 + 1];
                field6362[field6376++] = class216.method1590(var156, var155, -113) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class311.method2091(-17516, field6360[--field6371], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class200.method1370(109, class339.field5294.field27, "accountcreated");
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6376 -= 4;
                int var157 = field6362[field6376];
                int var158 = field6362[field6376 + 1];
                int var159 = field6362[field6376 + 2];
                int var160 = field6362[field6376 + 3];
                class445.method2815((var157 & 0x3FFF) - class126.field1718, -114, (var157 >> 14 & 0x3FFF) - class453.field7018, var158, var160, var159, false);
                return;
            }
            if (arg0 == 5501) {
                field6376 -= 4;
                int var161 = field6362[field6376];
                int var162 = field6362[field6376 + 1];
                int var163 = field6362[field6376 + 2];
                int var164 = field6362[field6376 + 3];
                class166.method1046((var161 & 0x3FFF) - class126.field1718, var164, var162, true, (var161 >> 14 & 0x3FFF) - class453.field7018, var163);
                return;
            }
            if (arg0 == 5502) {
                field6376 -= 6;
                int var165 = field6362[field6376];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class132.field1797 = var165;
                int var166 = field6362[field6376 + 1];
                if (var166 + 1 >= class123.field1676[class132.field1797].length >> 1) {
                    throw new RuntimeException();
                }
                class201.field3055 = var166;
                class72.field1092 = 0;
                class462.field7110 = field6362[field6376 + 2];
                class375.field5748 = field6362[field6376 + 3];
                int var167 = field6362[field6376 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class292.field4605 = var167;
                int var168 = field6362[field6376 + 5];
                if (var168 + 1 >= class123.field1676[class292.field4605].length >> 1) {
                    throw new RuntimeException();
                }
                class517.field7681 = var168;
                class334.field5222 = 3;
                return;
            }
            if (arg0 == 5503) {
                class325.method2174(1);
                return;
            }
            if (arg0 == 5504) {
                field6376 -= 2;
                class472.method2933(field6362[field6376], 0, -32, field6362[field6376 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field6362[field6376++] = (int) class135.field1824 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6362[field6376++] = (int) class388.field5918 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class278.method1867(21029);
                return;
            }
            if (arg0 == 5508) {
                class36.method225(122);
                return;
            }
            if (arg0 == 5509) {
                class526.method3138(-128);
                return;
            }
            if (arg0 == 5510) {
                class274.method1848(-65);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field6362[--field6376];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class453.field7018;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class135.field1839) {
                    var172 = class135.field1839;
                }
                int var173 = var171 - class126.field1718;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class197.field3038) {
                    var173 = class197.field3038;
                }
                class433.field6538 = (var172 << 7) + 64;
                class5.field61 = (var173 << 7) + 64;
                class334.field5222 = 4;
                return;
            }
            if (arg0 == 5512) {
                class253.method1741((byte) 62);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6371 -= 2;
                String var174 = field6360[field6371];
                String var175 = field6360[field6371 + 1];
                int var176 = field6362[--field6376];
                if (class148.field1994 != 2) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    class372.field5719 = var174;
                    class270.field4310 = var175;
                    class300.field4718 = var176;
                    class89.method610(5, (byte) -114);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class471.method2932((byte) -89);
                return;
            }
            if (arg0 == 5602) {
                if (class46.field606 == 0) {
                    class162.field2354 = -2;
                    class390.field5935 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field6376 -= 4;
                if (class148.field1994 != 2) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    class177.method1123((byte) -20, field6362[field6376 + 3], field6362[field6376], field6362[field6376 + 2], field6362[field6376 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field6371--;
                if (class148.field1994 != 2) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    class176.method1116(0, class335.method2229(field6360[field6371], 37));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6371 -= 2;
                if (class148.field1994 != 2) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    class304.method2052(false, field6360[field6371 + 1], 1, class335.method2229(field6360[field6371], 37));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class457.field7048 == 0) {
                    class271.field4327 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6362[field6376++] = class390.field5935;
                return;
            }
            if (arg0 == 5608) {
                field6362[field6376++] = class360.field5581;
                return;
            }
            if (arg0 == 5609) {
                field6362[field6376++] = class271.field4327;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field6360[field6371++] = class341.field5332.length > var177 ? class220.method1606(class341.field5332[var177], (byte) -88) : "";
                }
                class341.field5332 = null;
                return;
            }
            if (arg0 == 5611) {
                field6362[field6376++] = class531.field7793;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field6362[--field6376];
                if (class148.field1994 != 6) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    if (class338.field5281 != null) {
                        class338.field5281.method1892(90);
                        class338.field5281 = null;
                    }
                    class300.field4718 = var178;
                    class89.method610(8, (byte) -99);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field6362[field6376++] = class390.field5935;
                return;
            }
            if (arg0 == 5615) {
                field6371 -= 2;
                String var179 = field6360[field6371];
                String var180 = field6360[field6371 + 1];
                if (class148.field1994 != 2) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    if (class338.field5281 != null) {
                        class338.field5281.method1892(90);
                        class338.field5281 = null;
                    }
                    class372.field5719 = var179;
                    class270.field4310 = var180;
                    class89.method610(4, (byte) -127);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class496.method3034(true, false);
                return;
            }
            if (arg0 == 5617) {
                field6362[field6376++] = class162.field2354;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field6362[--field6376];
                class414.method2638(false, var181, 3);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field6362[--field6376];
                class414.method2638(true, var182, 3);
                return;
            }
            if (arg0 == 5620) {
                class415.method2652(true);
                if (class345.field5379 != "" && class345.field5379 != "") {
                    field6362[field6376++] = 1;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field6371 -= 2;
                if (class148.field1994 != 2) {
                    return;
                }
                if (class46.field606 == 0 && class457.field7048 == 0) {
                    class304.method2052(true, field6360[field6371 + 1], 1, class335.method2229(field6360[field6371], 37));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class495 var183 = class339.field5294.method19(19, false, "3");
                while (var183.field7458 == 0) {
                    class208.method1464((byte) -84, 1L);
                }
                if (var183.field7458 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class488 var184 = (class488) var183.field7462;
                if (var184.method2996(114).exists()) {
                    class208 var185 = new class208(50);
                    try {
                        var184.method2995(true, 50, var185.field3193, 0);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method2994(-30563);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field6362[--field6376];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class141.field1911.field6114 = var186;
                class207.method1415(127);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6002) {
                class141.field1911.method1637(false, field6362[--field6376] == 1);
                class207.method1415(53);
                class98.method658(4);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6003) {
                class141.field1911.field6101 = field6362[--field6376] == 1;
                class98.method658(4);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6005) {
                class141.field1911.field6108 = field6362[--field6376] == 1;
                class207.method1415(91);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6006) {
                class141.field1911.field6094 = field6362[--field6376] == 1;
                class19.field198.method1292(!class141.field1911.field6094);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6007) {
                class141.field1911.field6121 = field6362[--field6376];
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6008) {
                class141.field1911.field6087 = field6362[--field6376] == 1;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6009) {
                class141.field1911.field6096 = field6362[--field6376] == 1;
                class207.method1415(48);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6010) {
                class141.field1911.field6093 = field6362[--field6376] == 1;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field6362[--field6376];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class141.field1911.method2602(class452.field7013, var187, -25787);
                class207.method1415(48);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6012) {
                class141.field1911.method2599(field6362[--field6376] == 1, class452.field7013, (byte) -108);
                class497.method3041(1889);
                class278.method1866((byte) -124);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6014) {
                class141.field1911.field6123 = field6362[--field6376] == 1;
                class207.method1415(91);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6015) {
                class141.field1911.field6120 = field6362[--field6376] == 1;
                class207.method1415(89);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field6362[--field6376];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class141.field1911.field6097 = var188;
                class196.method1341(class452.field7013, 6670);
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6017) {
                class141.field1911.field6122 = field6362[--field6376] == 1;
                class468.method2923(1);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field6362[--field6376];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class141.field1911.field6109 = var189;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field6362[--field6376];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class141.field1911.field6112 != var190) {
                    if (class141.field1911.field6112 == 0 && class236.field3874 != -1) {
                        class50.method358(class236.field3874, class305.field4799, var190, 23618, false, 0);
                        class5.field55 = false;
                    } else if (var190 == 0) {
                        class355.method2340(true);
                        class5.field55 = false;
                    } else {
                        class506.method3073(false, var190);
                    }
                    class141.field1911.field6112 = var190;
                }
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field6362[--field6376];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class141.field1911.field6100 = var191;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6021) {
                class141.field1911.field3782 = field6362[--field6376] == 1;
                class98.method658(4);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field6362[--field6376];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class491.field7438 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class319.method2135(var192, (byte) -117);
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                field6362[field6376++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field6362[--field6376];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class141.field1911.field6089 = var194;
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field6362[--field6376];
                if (var195 < 0 || var195 > class317.method2118(false, class491.field7438)) {
                    var195 = 0;
                }
                class141.field1911.field6095 = var195;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field6362[--field6376];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class295.method1984(var196 == 1, (byte) 22);
                return;
            }
            if (arg0 == 6028) {
                class141.field1911.field6115 = field6362[--field6376] != 0;
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6029) {
                class141.field1911.field6121 = field6362[--field6376];
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6030) {
                class141.field1911.field6106 = field6362[--field6376] != 0;
                class141.field1911.method1638(32749, class339.field5294);
                class207.method1415(97);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field6362[--field6376];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class196.method1341(var197, 6670);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field6362[--field6376];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class141.field1911.field6083 = var198;
                class141.field1911.method1638(32749, class339.field5294);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field6362[--field6376];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class141.field1911.field6119 = var199;
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6034) {
                class141.field1911.field6099 = field6362[--field6376] == 1;
                class141.field1911.method1638(32749, class339.field5294);
                class497.method3041(1889);
                class256.field4144 = false;
                return;
            }
            if (arg0 == 6035) {
                class141.field1911.field3785 = field6362[--field6376] == 1;
                class207.method1415(65);
                class98.method658(4);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6362[field6376++] = class141.field1911.field6114;
                return;
            }
            if (arg0 == 6102) {
                field6362[field6376++] = class141.field1911.method1633(class452.field7013, (byte) -84) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6362[field6376++] = class141.field1911.field6101 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6362[field6376++] = class141.field1911.field6108 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field6362[field6376++] = class141.field1911.field6094 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6362[field6376++] = class141.field1911.field6121;
                return;
            }
            if (arg0 == 6108) {
                field6362[field6376++] = class141.field1911.field6087 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field6362[field6376++] = class141.field1911.field6096 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6362[field6376++] = class141.field1911.field6093 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6362[field6376++] = class141.field1911.method2603((byte) -122, class452.field7013);
                return;
            }
            if (arg0 == 6112) {
                field6362[field6376++] = class141.field1911.method2601((byte) -14, class452.field7013) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6362[field6376++] = class141.field1911.field6123 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6362[field6376++] = class141.field1911.field6120 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6362[field6376++] = class141.field1911.field6097;
                return;
            }
            if (arg0 == 6117) {
                field6362[field6376++] = class141.field1911.field6122 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6362[field6376++] = class141.field1911.field6109;
                return;
            }
            if (arg0 == 6119) {
                field6362[field6376++] = class141.field1911.field6112;
                return;
            }
            if (arg0 == 6120) {
                field6362[field6376++] = class141.field1911.field6100;
                return;
            }
            if (arg0 == 6121) {
                field6362[field6376++] = class19.field198.method1256() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field6362[field6376++] = class241.method1680(108);
                return;
            }
            if (arg0 == 6124) {
                field6362[field6376++] = class141.field1911.field6089;
                return;
            }
            if (arg0 == 6125) {
                field6362[field6376++] = class141.field1911.field6095;
                return;
            }
            if (arg0 == 6126) {
                field6362[field6376++] = class19.field198.method1296() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field6362[field6376++] = class141.field1911.field6098 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6362[field6376++] = class141.field1911.field6115 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6362[field6376++] = class141.field1911.field6121;
                return;
            }
            if (arg0 == 6130) {
                field6362[field6376++] = class141.field1911.field6106 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6362[field6376++] = class452.field7013;
                return;
            }
            if (arg0 == 6132) {
                field6362[field6376++] = class141.field1911.field6083;
                return;
            }
            if (arg0 == 6133) {
                field6362[field6376++] = class2.field15 == 1 || class2.field15 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field6362[field6376++] = class317.method2118(false, class491.field7438);
                return;
            }
            if (arg0 == 6135) {
                field6362[field6376++] = class141.field1911.field6119;
                return;
            }
            if (arg0 == 6136) {
                field6362[field6376++] = class141.field1911.field6099 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field6362[field6376++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6376 -= 2;
                class98.field1402 = (short) field6362[field6376];
                if (class98.field1402 <= 0) {
                    class98.field1402 = 256;
                }
                class253.field4102 = (short) field6362[field6376 + 1];
                if (class253.field4102 <= 0) {
                    class253.field4102 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6376 -= 2;
                class296.field4666 = (short) field6362[field6376];
                if (class296.field4666 <= 0) {
                    class296.field4666 = 256;
                }
                class305.field4802 = (short) field6362[field6376 + 1];
                if (class305.field4802 <= 0) {
                    class305.field4802 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6376 -= 4;
                class330.field5186 = (short) field6362[field6376];
                if (class330.field5186 <= 0) {
                    class330.field5186 = 1;
                }
                class468.field7169 = (short) field6362[field6376 + 1];
                if (class468.field7169 <= 0) {
                    class468.field7169 = 32767;
                } else if (class468.field7169 < class330.field5186) {
                    class468.field7169 = class330.field5186;
                }
                class279.field4426 = (short) field6362[field6376 + 2];
                if (class279.field4426 <= 0) {
                    class279.field4426 = 1;
                }
                class163.field2364 = (short) field6362[field6376 + 3];
                if (class163.field2364 <= 0) {
                    class163.field2364 = 32767;
                    return;
                }
                if (class163.field2364 < class279.field4426) {
                    class163.field2364 = class279.field4426;
                }
                return;
            }
            if (arg0 == 6203) {
                class329.method2206(class330.field5180.field6730, (byte) 98, false, 0, class330.field5180.field6615, 0);
                field6362[field6376++] = class314.field4917;
                field6362[field6376++] = class235.field3863;
                return;
            }
            if (arg0 == 6204) {
                field6362[field6376++] = class296.field4666;
                field6362[field6376++] = class305.field4802;
                return;
            }
            if (arg0 == 6205) {
                field6362[field6376++] = class98.field1402;
                field6362[field6376++] = class253.field4102;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6362[field6376++] = (int) (class246.method1705((byte) 28) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6362[field6376++] = (int) (class246.method1705((byte) 28) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6376 -= 3;
                int var201 = field6362[field6376];
                int var202 = field6362[field6376 + 1];
                int var203 = field6362[field6376 + 2];
                field6356.clear();
                field6356.set(11, 12);
                field6356.set(var203, var202, var201);
                int var204 = (int) (field6356.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field6362[field6376++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field6356.clear();
                field6356.setTime(new Date(class246.method1705((byte) 28)));
                field6362[field6376++] = field6356.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field6362[--field6376];
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
                field6362[field6376++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6362[field6376++] = class70.method519((byte) -86) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6362[field6376++] = class508.method3079(34037) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class148.field1994 == 6 && class46.field606 == 0 && class457.field7048 == 0) {
                    if (class418.field6349) {
                        field6362[field6376++] = 0;
                        return;
                    }
                    if (class202.field3078 > class246.method1705((byte) 28) - 1000L) {
                        field6362[field6376++] = 1;
                        return;
                    }
                    class418.field6349 = true;
                    class81.method578((byte) 66, class463.field7120);
                    class170.field2488.method1477(65280, class506.field7568);
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class68 var207 = class248.method1719(2);
                if (var207 != null) {
                    field6362[field6376++] = var207.field1036;
                    field6362[field6376++] = var207.field2440;
                    field6360[field6371++] = var207.field1035;
                    class16 var208 = var207.method486(102);
                    field6362[field6376++] = var208.field164;
                    field6360[field6371++] = var208.field166;
                    field6362[field6376++] = var207.field2444;
                    field6362[field6376++] = var207.field1034;
                    field6360[field6371++] = var207.field1032;
                    return;
                }
                field6362[field6376++] = -1;
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                field6362[field6376++] = 0;
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                return;
            }
            if (arg0 == 6502) {
                class68 var209 = class295.method1980((byte) -126);
                if (var209 != null) {
                    field6362[field6376++] = var209.field1036;
                    field6362[field6376++] = var209.field2440;
                    field6360[field6371++] = var209.field1035;
                    class16 var210 = var209.method486(-114);
                    field6362[field6376++] = var210.field164;
                    field6360[field6371++] = var210.field166;
                    field6362[field6376++] = var209.field2444;
                    field6362[field6376++] = var209.field1034;
                    field6360[field6371++] = var209.field1032;
                    return;
                }
                field6362[field6376++] = -1;
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                field6362[field6376++] = 0;
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field6362[--field6376];
                String var212 = field6360[--field6371];
                if (class148.field1994 == 6 && class46.field606 == 0 && class457.field7048 == 0) {
                    field6362[field6376++] = class497.method3035(var211, false, var212) ? 1 : 0;
                    return;
                }
                field6362[field6376++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class141.field1911.field6090 = field6362[--field6376];
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6505) {
                field6362[field6376++] = class141.field1911.field6090;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field6362[--field6376];
                class68 var214 = class54.method412(0, var213);
                if (var214 != null) {
                    field6362[field6376++] = var214.field2440;
                    field6360[field6371++] = var214.field1035;
                    class16 var215 = var214.method486(22);
                    field6362[field6376++] = var215.field164;
                    field6360[field6371++] = var215.field166;
                    field6362[field6376++] = var214.field2444;
                    field6362[field6376++] = var214.field1034;
                    field6360[field6371++] = var214.field1032;
                    return;
                }
                field6362[field6376++] = -1;
                field6360[field6371++] = "";
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                field6362[field6376++] = 0;
                field6362[field6376++] = 0;
                field6360[field6371++] = "";
                return;
            }
            if (arg0 == 6507) {
                field6376 -= 4;
                int var216 = field6362[field6376];
                boolean var217 = field6362[field6376 + 1] == 1;
                int var218 = field6362[field6376 + 2];
                boolean var219 = field6362[field6376 + 3] == 1;
                class415.method2649(var217, var218, 0, var216, var219);
                return;
            }
            if (arg0 == 6508) {
                class154.method943(-18293);
                return;
            }
            if (arg0 == 6509) {
                if (class148.field1994 != 6) {
                    return;
                }
                class284.field4476 = field6362[--field6376] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class141.field1911.field6082 = field6362[--field6376] == 1;
                class141.field1911.method1638(32749, class339.field5294);
                return;
            }
            if (arg0 == 6601) {
                field6362[field6376++] = class141.field1911.field6082 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class464.field7130 == class303.field4752) {
            if (arg0 == 6700) {
                int var220 = class423.field6414.method1126(24946);
                if (class509.field7597 != -1) {
                    var220++;
                }
                field6362[field6376++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field6362[--field6376];
                if (class509.field7597 != -1) {
                    if (var221 == 0) {
                        field6362[field6376++] = class509.field7597;
                        return;
                    }
                    var221--;
                }
                class301 var222 = (class301) class423.field6414.method1119(false);
                while (var221-- > 0) {
                    var222 = (class301) class423.field6414.method1121((byte) -125);
                }
                field6362[field6376++] = var222.field4721;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field6362[--field6376];
                if (class433.field6540[var223] == null) {
                    field6360[field6371++] = "";
                    return;
                }
                String var224 = class433.field6540[var223][0].field6747;
                if (var224 == null) {
                    field6360[field6371++] = "";
                    return;
                }
                field6360[field6371++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field6362[--field6376];
                if (class433.field6540[var225] == null) {
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = class433.field6540[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field6376 -= 2;
                int var226 = field6362[field6376];
                int var227 = field6362[field6376 + 1];
                if (class433.field6540[var226] == null) {
                    field6360[field6371++] = "";
                    return;
                }
                String var228 = class433.field6540[var226][var227].field6747;
                if (var228 == null) {
                    field6360[field6371++] = "";
                    return;
                }
                field6360[field6371++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field6376 -= 2;
                int var229 = field6362[field6376];
                int var230 = field6362[field6376 + 1];
                if (class433.field6540[var229] == null) {
                    field6362[field6376++] = 0;
                    return;
                }
                field6362[field6376++] = class433.field6540[var229][var230].field6736;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field6376 -= 3;
                int var231 = field6362[field6376];
                int var232 = field6362[field6376 + 1];
                int var233 = field6362[field6376 + 2];
                class311.method2093(false, var233, 1, var231 << 16 | var232, "");
                return;
            }
            if (arg0 == 6708) {
                field6376 -= 3;
                int var234 = field6362[field6376];
                int var235 = field6362[field6376 + 1];
                int var236 = field6362[field6376 + 2];
                class311.method2093(false, var236, 2, var234 << 16 | var235, "");
                return;
            }
            if (arg0 == 6709) {
                field6376 -= 3;
                int var237 = field6362[field6376];
                int var238 = field6362[field6376 + 1];
                int var239 = field6362[field6376 + 2];
                class311.method2093(false, var239, 3, var237 << 16 | var238, "");
                return;
            }
            if (arg0 == 6710) {
                field6376 -= 3;
                int var240 = field6362[field6376];
                int var241 = field6362[field6376 + 1];
                int var242 = field6362[field6376 + 2];
                class311.method2093(false, var242, 4, var240 << 16 | var241, "");
                return;
            }
            if (arg0 == 6711) {
                field6376 -= 3;
                int var243 = field6362[field6376];
                int var244 = field6362[field6376 + 1];
                int var245 = field6362[field6376 + 2];
                class311.method2093(false, var245, 5, var243 << 16 | var244, "");
                return;
            }
            if (arg0 == 6712) {
                field6376 -= 3;
                int var246 = field6362[field6376];
                int var247 = field6362[field6376 + 1];
                int var248 = field6362[field6376 + 2];
                class311.method2093(false, var248, 6, var246 << 16 | var247, "");
                return;
            }
            if (arg0 == 6713) {
                field6376 -= 3;
                int var249 = field6362[field6376];
                int var250 = field6362[field6376 + 1];
                int var251 = field6362[field6376 + 2];
                class311.method2093(false, var251, 7, var249 << 16 | var250, "");
                return;
            }
            if (arg0 == 6714) {
                field6376 -= 3;
                int var252 = field6362[field6376];
                int var253 = field6362[field6376 + 1];
                int var254 = field6362[field6376 + 2];
                class311.method2093(false, var254, 8, var252 << 16 | var253, "");
                return;
            }
            if (arg0 == 6715) {
                field6376 -= 3;
                int var255 = field6362[field6376];
                int var256 = field6362[field6376 + 1];
                int var257 = field6362[field6376 + 2];
                class311.method2093(false, var257, 9, var255 << 16 | var256, "");
                return;
            }
            if (arg0 == 6716) {
                field6376 -= 3;
                int var258 = field6362[field6376];
                int var259 = field6362[field6376 + 1];
                int var260 = field6362[field6376 + 2];
                class311.method2093(false, var260, 10, var258 << 16 | var259, "");
                return;
            }
            if (arg0 == 6717) {
                field6376 -= 3;
                int var261 = field6362[field6376];
                int var262 = field6362[field6376 + 1];
                int var263 = field6362[field6376 + 2];
                class437 var264 = class24.method150(true, var263, var261 << 16 | var262);
                class497.method3038(50);
                class467 var265 = client.method492(var264);
                class262.method1795(true, var265.field7145, var265.method2913(-48), var264);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field6362[--field6376];
                class210 var267 = class457.field7049.method662(var266, true);
                if (var267.field3249 == null) {
                    field6360[field6371++] = "";
                    return;
                }
                field6360[field6371++] = var267.field3249;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field6362[--field6376];
                class210 var269 = class457.field7049.method662(var268, true);
                field6362[field6376++] = var269.field3254;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field6362[--field6376];
                class210 var271 = class457.field7049.method662(var270, true);
                field6362[field6376++] = var271.field3263;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field6362[--field6376];
                class210 var273 = class457.field7049.method662(var272, true);
                field6362[field6376++] = var273.field3272;
                return;
            }
            if (arg0 == 6804) {
                field6376 -= 2;
                int var274 = field6362[field6376];
                int var275 = field6362[field6376 + 1];
                class442 var276 = class274.field4353.method1171((byte) 82, var275);
                if (var276.method2799(-92)) {
                    field6360[field6371++] = class457.field7049.method662(var274, true).method1483(var275, var276.field6871, true);
                    return;
                }
                field6362[field6376++] = class457.field7049.method662(var274, true).method1487(var275, (byte) -87, var276.field6872);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field6362[field6376++] = class504.field7552 && !class225.field3771 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field6362[field6376++] = class177.field2594;
                return;
            }
            if (arg0 == 6902) {
                field6362[field6376++] = class433.field6536;
                return;
            }
            if (arg0 == 6903) {
                field6362[field6376++] = class201.field3058;
                return;
            }
            if (arg0 == 6904) {
                field6362[field6376++] = class20.field228;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class439.field6818 != null) {
                    if (class439.field6818.field7462 == null) {
                        var277 = class254.method1742(612130280, class439.field6818.field7463);
                    } else {
                        var277 = (String) class439.field6818.field7462;
                    }
                }
                field6360[field6371++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field6362[field6376++] = class95.field1389;
                return;
            }
            if (arg0 == 6907) {
                field6362[field6376++] = class254.field4112;
                return;
            }
            if (arg0 == 6908) {
                field6362[field6376++] = class75.field1116;
                return;
            }
            if (arg0 == 6909) {
                field6362[field6376++] = class67.field1026 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field6362[field6376++] = class513.field7613;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
    public static final void method2683() {
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "()V")
    public static void method2684() {
        field6364 = null;
        field6370 = null;
        field6365 = null;
        field6359 = null;
        field6362 = null;
        field6360 = null;
        field6366 = null;
        field6363 = null;
        field6377 = null;
        field6369 = null;
        field6356 = null;
        field6379 = null;
        field6381 = null;
        field6380 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2685(String arg0, int arg1) {
        if (class439.field6815 == 0 && !(!class504.field7552 || class225.field3771) || class103.field1504) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class522.field7723.method1583(103, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class522.field7723.method1583(84, 0).length());
        } else if (var2.startsWith(class222.field3748.method1583(81, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class222.field3748.method1583(119, 0).length());
        } else if (var2.startsWith(class240.field3903.method1583(92, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class240.field3903.method1583(127, 0).length());
        } else if (var2.startsWith(class516.field7667.method1583(116, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class516.field7667.method1583(104, 0).length());
        } else if (var2.startsWith(class379.field5829.method1583(87, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class379.field5829.method1583(106, 0).length());
        } else if (var2.startsWith(class539.field7886.method1583(94, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class539.field7886.method1583(91, 0).length());
        } else if (var2.startsWith(class91.field1321.method1583(79, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class91.field1321.method1583(79, 0).length());
        } else if (var2.startsWith(class432.field6517.method1583(93, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class432.field6517.method1583(114, 0).length());
        } else if (var2.startsWith(class131.field1769.method1583(127, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class131.field1769.method1583(103, 0).length());
        } else if (var2.startsWith(class210.field3235.method1583(102, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class210.field3235.method1583(107, 0).length());
        } else if (var2.startsWith(class73.field1103.method1583(122, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class73.field1103.method1583(102, 0).length());
        } else if (var2.startsWith(class168.field2449.method1583(80, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class168.field2449.method1583(99, 0).length());
        } else if (class12.field131 != 0) {
            if (var2.startsWith(class522.field7723.method1583(101, class12.field131))) {
                var3 = 0;
                arg0 = arg0.substring(class522.field7723.method1583(100, class12.field131).length());
            } else if (var2.startsWith(class222.field3748.method1583(115, class12.field131))) {
                var3 = 1;
                arg0 = arg0.substring(class222.field3748.method1583(107, class12.field131).length());
            } else if (var2.startsWith(class240.field3903.method1583(116, class12.field131))) {
                var3 = 2;
                arg0 = arg0.substring(class240.field3903.method1583(123, class12.field131).length());
            } else if (var2.startsWith(class516.field7667.method1583(87, class12.field131))) {
                var3 = 3;
                arg0 = arg0.substring(class516.field7667.method1583(81, class12.field131).length());
            } else if (var2.startsWith(class379.field5829.method1583(126, class12.field131))) {
                var3 = 4;
                arg0 = arg0.substring(class379.field5829.method1583(105, class12.field131).length());
            } else if (var2.startsWith(class539.field7886.method1583(83, class12.field131))) {
                var3 = 5;
                arg0 = arg0.substring(class539.field7886.method1583(98, class12.field131).length());
            } else if (var2.startsWith(class91.field1321.method1583(113, class12.field131))) {
                var3 = 6;
                arg0 = arg0.substring(class91.field1321.method1583(81, class12.field131).length());
            } else if (var2.startsWith(class432.field6517.method1583(84, class12.field131))) {
                var3 = 7;
                arg0 = arg0.substring(class432.field6517.method1583(112, class12.field131).length());
            } else if (var2.startsWith(class131.field1769.method1583(121, class12.field131))) {
                var3 = 8;
                arg0 = arg0.substring(class131.field1769.method1583(123, class12.field131).length());
            } else if (var2.startsWith(class210.field3235.method1583(114, class12.field131))) {
                var3 = 9;
                arg0 = arg0.substring(class210.field3235.method1583(117, class12.field131).length());
            } else if (var2.startsWith(class73.field1103.method1583(105, class12.field131))) {
                var3 = 10;
                arg0 = arg0.substring(class73.field1103.method1583(120, class12.field131).length());
            } else if (var2.startsWith(class168.field2449.method1583(87, class12.field131))) {
                var3 = 11;
                arg0 = arg0.substring(class168.field2449.method1583(124, class12.field131).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class193.field2861.method1583(111, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class193.field2861.method1583(95, 0).length());
        } else if (var4.startsWith(class416.field6314.method1583(90, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class416.field6314.method1583(127, 0).length());
        } else if (var4.startsWith(class159.field2179.method1583(86, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class159.field2179.method1583(127, 0).length());
        } else if (var4.startsWith(class146.field1974.method1583(85, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class146.field1974.method1583(87, 0).length());
        } else if (var4.startsWith(class440.field6820.method1583(127, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class440.field6820.method1583(111, 0).length());
        } else if (class12.field131 != 0) {
            if (var4.startsWith(class193.field2861.method1583(123, class12.field131))) {
                var5 = 1;
                arg0 = arg0.substring(class193.field2861.method1583(84, class12.field131).length());
            } else if (var4.startsWith(class416.field6314.method1583(99, class12.field131))) {
                var5 = 2;
                arg0 = arg0.substring(class416.field6314.method1583(91, class12.field131).length());
            } else if (var4.startsWith(class159.field2179.method1583(84, class12.field131))) {
                var5 = 3;
                arg0 = arg0.substring(class159.field2179.method1583(127, class12.field131).length());
            } else if (var4.startsWith(class146.field1974.method1583(107, class12.field131))) {
                var5 = 4;
                arg0 = arg0.substring(class146.field1974.method1583(117, class12.field131).length());
            } else if (var4.startsWith(class440.field6820.method1583(127, class12.field131))) {
                var5 = 5;
                arg0 = arg0.substring(class440.field6820.method1583(120, class12.field131).length());
            }
        }
        field6375++;
        class81.method578((byte) 66, class512.field7608);
        class170.field2488.method1479((byte) -105, 0);
        int var6 = class170.field2488.field3162;
        if (arg1 == 5021) {
            class170.field2488.method1479((byte) -127, 1);
        } else if (arg1 == 5022) {
            class170.field2488.method1479((byte) -104, 2);
        } else {
            class170.field2488.method1479((byte) -91, 0);
        }
        class170.field2488.method1479((byte) -118, var3);
        class170.field2488.method1479((byte) -107, var5);
        class228.method1640(-971571636, class170.field2488, arg0);
        class170.field2488.method1438(65280, class170.field2488.field3162 - var6);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(IZ)V")
    public static final void method2686(int arg0, boolean arg1) {
    }
}
