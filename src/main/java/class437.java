import jagex3.jagmisc.jagmisc;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class437 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    private static int[] field6518 = new int[1000];

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    private static int field6517 = 0;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    private static int field6533 = 0;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[Lqu;")
    private static class63[] field6520 = new class63[50];

    @OriginalMember(owner = "client!of", name = "u", descriptor = "[[I")
    private static int[][] field6536 = new int[5][5000];

    @OriginalMember(owner = "client!of", name = "v", descriptor = "[Ljava/lang/String;")
    private static String[] field6537 = new String[1000];

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    private static int field6535 = 0;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
    private static int[] field6534 = new int[5];

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6530 = Calendar.getInstance();

    @OriginalMember(owner = "client!of", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field6542 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!of", name = "B", descriptor = "[I")
    private static int[] field6543 = new int[3];

    @OriginalMember(owner = "client!of", name = "z", descriptor = "Ljv;")
    public static class55 field6541 = new class55(4);

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    private static int field6544 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lmq;")
    private static class350 field6527;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Lmq;")
    private static class350 field6540;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lbo;")
    private static class511 field6522;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
    private static int[] field6526;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field6532;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
    public static final void method2603(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2604(String arg0, int arg1) {
        if (class75.field1260 == 0 && !(!class436.field6497 || class45.field853) || class63.field1091) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class252.field3605.method2180(0, 29491))) {
            var3 = 0;
            arg0 = arg0.substring(class252.field3605.method2180(0, 29491).length());
        } else if (var2.startsWith(class335.field5054.method2180(0, 29491))) {
            var3 = 1;
            arg0 = arg0.substring(class335.field5054.method2180(0, 29491).length());
        } else if (var2.startsWith(class14.field218.method2180(0, 29491))) {
            var3 = 2;
            arg0 = arg0.substring(class14.field218.method2180(0, 29491).length());
        } else if (var2.startsWith(class334.field5046.method2180(0, 29491))) {
            var3 = 3;
            arg0 = arg0.substring(class334.field5046.method2180(0, 29491).length());
        } else if (var2.startsWith(class229.field3258.method2180(0, 29491))) {
            var3 = 4;
            arg0 = arg0.substring(class229.field3258.method2180(0, 29491).length());
        } else if (var2.startsWith(class80.field1418.method2180(0, 29491))) {
            var3 = 5;
            arg0 = arg0.substring(class80.field1418.method2180(0, 29491).length());
        } else if (var2.startsWith(class182.field2733.method2180(0, 29491))) {
            var3 = 6;
            arg0 = arg0.substring(class182.field2733.method2180(0, 29491).length());
        } else if (var2.startsWith(class138.field2207.method2180(0, 29491))) {
            var3 = 7;
            arg0 = arg0.substring(class138.field2207.method2180(0, 29491).length());
        } else if (var2.startsWith(class103.field1705.method2180(0, 29491))) {
            var3 = 8;
            arg0 = arg0.substring(class103.field1705.method2180(0, 29491).length());
        } else if (var2.startsWith(class175.field2680.method2180(0, 29491))) {
            var3 = 9;
            arg0 = arg0.substring(class175.field2680.method2180(0, 29491).length());
        } else if (var2.startsWith(class221.field3177.method2180(0, 29491))) {
            var3 = 10;
            arg0 = arg0.substring(class221.field3177.method2180(0, 29491).length());
        } else if (var2.startsWith(class322.field4922.method2180(0, 29491))) {
            var3 = 11;
            arg0 = arg0.substring(class322.field4922.method2180(0, 29491).length());
        } else if (client.field2870 != 0) {
            if (var2.startsWith(class252.field3605.method2180(client.field2870, 29491))) {
                var3 = 0;
                arg0 = arg0.substring(class252.field3605.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class335.field5054.method2180(client.field2870, 29491))) {
                var3 = 1;
                arg0 = arg0.substring(class335.field5054.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class14.field218.method2180(client.field2870, 29491))) {
                var3 = 2;
                arg0 = arg0.substring(class14.field218.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class334.field5046.method2180(client.field2870, 29491))) {
                var3 = 3;
                arg0 = arg0.substring(class334.field5046.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class229.field3258.method2180(client.field2870, 29491))) {
                var3 = 4;
                arg0 = arg0.substring(class229.field3258.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class80.field1418.method2180(client.field2870, 29491))) {
                var3 = 5;
                arg0 = arg0.substring(class80.field1418.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class182.field2733.method2180(client.field2870, 29491))) {
                var3 = 6;
                arg0 = arg0.substring(class182.field2733.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class138.field2207.method2180(client.field2870, 29491))) {
                var3 = 7;
                arg0 = arg0.substring(class138.field2207.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class103.field1705.method2180(client.field2870, 29491))) {
                var3 = 8;
                arg0 = arg0.substring(class103.field1705.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class175.field2680.method2180(client.field2870, 29491))) {
                var3 = 9;
                arg0 = arg0.substring(class175.field2680.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class221.field3177.method2180(client.field2870, 29491))) {
                var3 = 10;
                arg0 = arg0.substring(class221.field3177.method2180(client.field2870, 29491).length());
            } else if (var2.startsWith(class322.field4922.method2180(client.field2870, 29491))) {
                var3 = 11;
                arg0 = arg0.substring(class322.field4922.method2180(client.field2870, 29491).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class404.field6066.method2180(0, 29491))) {
            var5 = 1;
            arg0 = arg0.substring(class404.field6066.method2180(0, 29491).length());
        } else if (var4.startsWith(class365.field5517.method2180(0, 29491))) {
            var5 = 2;
            arg0 = arg0.substring(class365.field5517.method2180(0, 29491).length());
        } else if (var4.startsWith(class61.field1069.method2180(0, 29491))) {
            var5 = 3;
            arg0 = arg0.substring(class61.field1069.method2180(0, 29491).length());
        } else if (var4.startsWith(class156.field2451.method2180(0, 29491))) {
            var5 = 4;
            arg0 = arg0.substring(class156.field2451.method2180(0, 29491).length());
        } else if (var4.startsWith(class237.field3430.method2180(0, 29491))) {
            var5 = 5;
            arg0 = arg0.substring(class237.field3430.method2180(0, 29491).length());
        } else if (client.field2870 != 0) {
            if (var4.startsWith(class404.field6066.method2180(client.field2870, 29491))) {
                var5 = 1;
                arg0 = arg0.substring(class404.field6066.method2180(client.field2870, 29491).length());
            } else if (var4.startsWith(class365.field5517.method2180(client.field2870, 29491))) {
                var5 = 2;
                arg0 = arg0.substring(class365.field5517.method2180(client.field2870, 29491).length());
            } else if (var4.startsWith(class61.field1069.method2180(client.field2870, 29491))) {
                var5 = 3;
                arg0 = arg0.substring(class61.field1069.method2180(client.field2870, 29491).length());
            } else if (var4.startsWith(class156.field2451.method2180(client.field2870, 29491))) {
                var5 = 4;
                arg0 = arg0.substring(class156.field2451.method2180(client.field2870, 29491).length());
            } else if (var4.startsWith(class237.field3430.method2180(client.field2870, 29491))) {
                var5 = 5;
                arg0 = arg0.substring(class237.field3430.method2180(client.field2870, 29491).length());
            }
        }
        field6523++;
        class28.method321(class40.field728, -5001);
        class410.field6141.method1109(false, 0);
        int var6 = class410.field6141.field2289;
        if (arg1 == 5021) {
            class410.field6141.method1109(false, 1);
        } else if (arg1 == 5022) {
            class410.field6141.method1109(false, 2);
        } else {
            class410.field6141.method1109(false, 0);
        }
        class410.field6141.method1109(false, var3);
        class410.field6141.method1109(false, var5);
        class304.method1993(arg0, -127, class410.field6141);
        class410.field6141.method1110(class410.field6141.field2289 - var6, false);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public static void method2605() {
        field6526 = null;
        field6532 = null;
        field6534 = null;
        field6536 = null;
        field6518 = null;
        field6537 = null;
        field6520 = null;
        field6527 = null;
        field6540 = null;
        field6522 = null;
        field6530 = null;
        field6542 = null;
        field6543 = null;
        field6541 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    private static final void method2606(int arg0) {
        class350 var1 = class319.method2075(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class350[] var3 = class388.field5835[var2];
        if (var3 == null) {
            class350[] var4 = class22.field438[var2];
            int var5 = var4.length;
            var3 = class388.field5835[var2] = new class350[var5];
            class73.method592(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class73.method592(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldj;I)V")
    private static final void method2607(class227 arg0, int arg1) {
        field6517 = 0;
        field6535 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3228;
        int[] var4 = arg0.field3229;
        byte var5 = -1;
        field6533 = 0;
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
                        method2608(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2616(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6518[field6517++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6518[field6517++] = class335.field5059.field5552[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class335.field5059.method2310(var8, -101, field6518[--field6517]);
                } else if (var43 == 3) {
                    field6537[field6535++] = arg0.field3234[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6517 -= 2;
                    if (field6518[field6517 + 1] != field6518[field6517]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6517 -= 2;
                    if (field6518[field6517 + 1] == field6518[field6517]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6517 -= 2;
                    if (field6518[field6517] < field6518[field6517 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6517 -= 2;
                    if (field6518[field6517] > field6518[field6517 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6533 == 0) {
                        return;
                    }
                    class63 var9 = field6520[--field6533];
                    arg0 = var9.field1088;
                    var3 = arg0.field3228;
                    var4 = arg0.field3229;
                    var2 = var9.field1084;
                    field6526 = var9.field1083;
                    field6532 = var9.field1087;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6518[field6517++] = class335.field5059.method981(-74, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class335.field5059.method2303(field6518[--field6517], var11, 0);
                } else if (var43 == 31) {
                    field6517 -= 2;
                    if (field6518[field6517] <= field6518[field6517 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6517 -= 2;
                    if (field6518[field6517] >= field6518[field6517 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6518[field6517++] = field6526[var4[var2]];
                } else if (var43 == 34) {
                    field6526[var4[var2]] = field6518[--field6517];
                } else if (var43 == 35) {
                    field6537[field6535++] = field6532[var4[var2]];
                } else if (var43 == 36) {
                    field6532[var4[var2]] = field6537[--field6535];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6535 -= var12;
                    String var13 = class53.method470(var12, field6535, false, field6537);
                    field6537[field6535++] = var13;
                } else if (var43 == 38) {
                    field6517--;
                } else if (var43 == 39) {
                    field6535--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class227 var15 = class25.method312(-105, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3235];
                    String[] var17 = new String[var15.field3238];
                    for (int var18 = 0; var18 < var15.field3239; var18++) {
                        var16[var18] = field6518[field6517 + var18 - var15.field3239];
                    }
                    for (int var19 = 0; var19 < var15.field3233; var19++) {
                        var17[var19] = field6537[field6535 + var19 - var15.field3233];
                    }
                    field6517 -= var15.field3239;
                    field6535 -= var15.field3233;
                    class63 var20 = new class63();
                    var20.field1088 = arg0;
                    var20.field1084 = var2;
                    var20.field1083 = field6526;
                    var20.field1087 = field6532;
                    if (field6533 >= field6520.length) {
                        throw new RuntimeException();
                    }
                    field6520[field6533++] = var20;
                    arg0 = var15;
                    var3 = var15.field3228;
                    var4 = var15.field3229;
                    var2 = -1;
                    field6526 = var16;
                    field6532 = var17;
                } else if (var43 == 42) {
                    field6518[field6517++] = class170.field2629[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class170.field2629[var21] = field6518[--field6517];
                    class89.method698(512, var21);
                    class310.field4724 |= class255.field3672[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6518[--field6517];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6534[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field6536[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6518[--field6517];
                    if (var28 < 0 || var28 >= field6534[var27]) {
                        throw new RuntimeException();
                    }
                    field6518[field6517++] = field6536[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6517 -= 2;
                    int var30 = field6518[field6517];
                    if (var30 < 0 || var30 >= field6534[var29]) {
                        throw new RuntimeException();
                    }
                    field6536[var29][var30] = field6518[field6517 + 1];
                } else if (var43 == 47) {
                    String var31 = class352.field5392[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6537[field6535++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class352.field5392[var32] = field6537[--field6535];
                    class217.method1447(var32, -15084);
                } else if (var43 == 51) {
                    class20 var33 = arg0.field3232[var4[var2]];
                    class451 var34 = (class451) var33.method171((byte) 31, (long) field6518[--field6517]);
                    if (var34 != null) {
                        var2 += var34.field6742;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3231 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field4904).append(" ");
                for (int var41 = field6533 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6520[var41].field1088.field4904).append(" ");
                }
                var40.append("op: ").append(var5);
                class320.method2087(0, var42, var40.toString());
            } else {
                class101.method754("Clientscript error in: " + arg0.field3231, 0);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3231).append("\n");
                for (int var38 = field6533 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6520[var38].field1088.field3231).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class320.method2087(0, var42, var37.toString());
                class343.method2185(var37.toString(), -82);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IZ)V")
    private static final void method2608(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6517 -= 3;
                int var2 = field6518[field6517];
                int var3 = field6518[field6517 + 1];
                int var4 = field6518[field6517 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class350 var5 = class319.method2075(true, var2);
                if (var5.field5291 == null) {
                    var5.field5291 = new class350[var4 + 1];
                }
                if (var5.field5291.length <= var4) {
                    class350[] var6 = new class350[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5291.length; var7++) {
                        var6[var7] = var5.field5291[var7];
                    }
                    var5.field5291 = var6;
                }
                if (var4 > 0 && var5.field5291[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class350 var8 = new class350();
                var8.field5215 = var3;
                var8.field5297 = var8.field5322 = var5.field5322;
                var8.field5354 = var4;
                var5.field5291[var4] = var8;
                if (arg1) {
                    field6540 = var8;
                } else {
                    field6527 = var8;
                }
                class302.method1902((byte) -113, var5);
                return;
            }
            if (arg0 == 101) {
                class350 var9 = arg1 ? field6540 : field6527;
                if (var9.field5354 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class350 var10 = class319.method2075(true, var9.field5322);
                var10.field5291[var9.field5354] = null;
                class302.method1902((byte) 80, var10);
                return;
            }
            if (arg0 == 102) {
                class350 var11 = class319.method2075(true, field6518[--field6517]);
                var11.field5291 = null;
                class302.method1902((byte) -127, var11);
                return;
            }
            if (arg0 == 200) {
                field6517 -= 2;
                int var12 = field6518[field6517];
                int var13 = field6518[field6517 + 1];
                class350 var14 = class83.method649((byte) 67, var12, var13);
                if (var14 != null && var13 != -1) {
                    field6518[field6517++] = 1;
                    if (arg1) {
                        field6540 = var14;
                        return;
                    }
                    field6527 = var14;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6518[--field6517];
                class350 var16 = class319.method2075(true, var15);
                if (var16 != null) {
                    field6518[field6517++] = 1;
                    if (arg1) {
                        field6540 = var16;
                        return;
                    }
                    field6527 = var16;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6518[--field6517];
                method2613(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6518[--field6517];
                method2606(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6517 -= 2;
                int var19 = field6518[field6517];
                int var20 = field6518[field6517 + 1];
                for (int var21 = 0; var21 < class495.field7316.length; var21++) {
                    if (class495.field7316[var21] == var19) {
                        class139.field2224.field3717.method158(var20, class217.field3125, var21, 2011);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class254.field3645.length; var22++) {
                    if (class254.field3645[var22] == var19) {
                        class139.field2224.field3717.method158(var20, class217.field3125, var22, 2011);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6517 -= 2;
                int var23 = field6518[field6517];
                int var24 = field6518[field6517 + 1];
                class139.field2224.field3717.method157(var24, var23, 7733);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6518[--field6517] != 0;
                class139.field2224.field3717.method156(-8981, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class350 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class319.method2075(true, field6518[--field6517]);
            } else {
                var26 = arg1 ? field6540 : field6527;
            }
            if (arg0 == 1000) {
                field6517 -= 4;
                var26.field5355 = field6518[field6517];
                var26.field5293 = field6518[field6517 + 1];
                int var27 = field6518[field6517 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field6518[field6517 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field5327 = (byte) var27;
                var26.field5246 = (byte) var28;
                class302.method1902((byte) 103, var26);
                class160.method1183(var26, -116);
                if (var26.field5354 == -1) {
                    class425.method2560((byte) 67, var26.field5322);
                }
                return;
            }
            if (arg0 == 1001) {
                field6517 -= 4;
                var26.field5280 = field6518[field6517];
                var26.field5232 = field6518[field6517 + 1];
                var26.field5356 = 0;
                var26.field5229 = 0;
                int var29 = field6518[field6517 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field6518[field6517 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field5244 = (byte) var29;
                var26.field5235 = (byte) var30;
                class302.method1902((byte) -104, var26);
                class160.method1183(var26, 26);
                if (var26.field5215 == 0) {
                    class292.method1842(96, false, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field6518[--field6517] == 1;
                if (var26.field5358 != var31) {
                    var26.field5358 = var31;
                    class302.method1902((byte) 65, var26);
                }
                if (var26.field5354 == -1) {
                    class190.method1327(123, var26.field5322);
                }
                return;
            }
            if (arg0 == 1004) {
                field6517 -= 2;
                var26.field5274 = field6518[field6517];
                var26.field5298 = field6518[field6517 + 1];
                class302.method1902((byte) -126, var26);
                class160.method1183(var26, 108);
                if (var26.field5215 == 0) {
                    class292.method1842(90, false, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field5279 = field6518[--field6517] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class350 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class319.method2075(true, field6518[--field6517]);
            } else {
                var32 = arg1 ? field6540 : field6527;
            }
            if (arg0 == 1100) {
                field6517 -= 2;
                var32.field5265 = field6518[field6517];
                if (var32.field5265 > var32.field5371 - var32.field5329) {
                    var32.field5265 = var32.field5371 - var32.field5329;
                }
                if (var32.field5265 < 0) {
                    var32.field5265 = 0;
                }
                var32.field5226 = field6518[field6517 + 1];
                if (var32.field5226 > var32.field5221 - var32.field5269) {
                    var32.field5226 = var32.field5221 - var32.field5269;
                }
                if (var32.field5226 < 0) {
                    var32.field5226 = 0;
                }
                class302.method1902((byte) -78, var32);
                if (var32.field5354 == -1) {
                    class250.method1616(var32.field5322, 22050);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field5312 = field6518[--field6517];
                class302.method1902((byte) 18, var32);
                if (var32.field5354 == -1) {
                    class451.method2688(var32.field5322, (byte) 87);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field5335 = field6518[--field6517] == 1;
                class302.method1902((byte) 75, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field5359 = field6518[--field6517];
                class302.method1902((byte) 124, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field5324 = field6518[--field6517];
                class302.method1902((byte) 123, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field6518[--field6517];
                if (var32.field5266 != var33) {
                    var32.field5266 = var33;
                    class302.method1902((byte) -102, var32);
                }
                if (var32.field5354 == -1) {
                    class294.method1873(-78, var32.field5322);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field5351 = field6518[--field6517];
                class302.method1902((byte) 29, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field5315 = field6518[--field6517] == 1;
                class302.method1902((byte) -112, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field5286 = 1;
                var32.field5260 = field6518[--field6517];
                class302.method1902((byte) 72, var32);
                if (var32.field5354 == -1) {
                    class209.method1412(103, var32.field5322);
                }
                return;
            }
            if (arg0 == 1109) {
                field6517 -= 6;
                var32.field5308 = field6518[field6517];
                var32.field5288 = field6518[field6517 + 1];
                var32.field5261 = field6518[field6517 + 2];
                var32.field5361 = field6518[field6517 + 3];
                var32.field5321 = field6518[field6517 + 4];
                var32.field5253 = field6518[field6517 + 5];
                class302.method1902((byte) -108, var32);
                if (var32.field5354 == -1) {
                    class433.method2588(var32.field5322, 8);
                    class162.method1193((byte) -106, var32.field5322);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field6518[--field6517];
                if (var32.field5276 != var34) {
                    var32.field5276 = var34;
                    var32.field5342 = 0;
                    var32.field5323 = 1;
                    var32.field5220 = 0;
                    class302.method1902((byte) -95, var32);
                }
                if (var32.field5354 == -1) {
                    class363.method2276(var32.field5322, (byte) 110);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field5317 = field6518[--field6517] == 1;
                class302.method1902((byte) -97, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field6537[--field6535];
                if (!var35.equals(var32.field5364)) {
                    var32.field5364 = var35;
                    class302.method1902((byte) -84, var32);
                }
                if (var32.field5354 == -1) {
                    class382.method2375(var32.field5322, 3);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field5223 = field6518[--field6517];
                class302.method1902((byte) 2, var32);
                if (var32.field5354 == -1) {
                    class339.method2173(var32.field5322, (byte) -98);
                }
                return;
            }
            if (arg0 == 1114) {
                field6517 -= 3;
                var32.field5299 = field6518[field6517];
                var32.field5231 = field6518[field6517 + 1];
                var32.field5263 = field6518[field6517 + 2];
                class302.method1902((byte) -103, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field5360 = field6518[--field6517] == 1;
                class302.method1902((byte) 124, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field5213 = field6518[--field6517];
                class302.method1902((byte) 127, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field5367 = field6518[--field6517];
                class302.method1902((byte) 57, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field5256 = field6518[--field6517] == 1;
                class302.method1902((byte) -119, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field5271 = field6518[--field6517] == 1;
                class302.method1902((byte) -1, var32);
                return;
            }
            if (arg0 == 1120) {
                field6517 -= 2;
                var32.field5371 = field6518[field6517];
                var32.field5221 = field6518[field6517 + 1];
                class302.method1902((byte) 21, var32);
                if (var32.field5215 == 0) {
                    class292.method1842(107, false, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field6517 -= 2;
                var32.field5289 = (short) field6518[field6517];
                var32.field5340 = (short) field6518[field6517 + 1];
                class302.method1902((byte) 56, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field5218 = field6518[--field6517] == 1;
                class302.method1902((byte) 76, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field5253 = field6518[--field6517];
                class302.method1902((byte) 27, var32);
                if (var32.field5354 == -1) {
                    class433.method2588(var32.field5322, 8);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field6518[--field6517];
                var32.field5336 = var36 == 1;
                class302.method1902((byte) -85, var32);
                return;
            }
            if (arg0 == 1125) {
                field6517 -= 2;
                var32.field5353 = field6518[field6517];
                var32.field5344 = field6518[field6517 + 1];
                class302.method1902((byte) -113, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field5250 = field6518[--field6517];
                class302.method1902((byte) -119, var32);
                return;
            }
            if (arg0 == 1127) {
                field6517 -= 2;
                int var37 = field6518[field6517];
                int var38 = field6518[field6517 + 1];
                class61 var39 = class162.field2506.method597(11, var37);
                if (var39.field1062 != var38) {
                    var32.method2220(var37, var38, -29255);
                    return;
                }
                var32.method2214(124, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field6518[--field6517];
                String var41 = field6537[--field6535];
                class61 var42 = class162.field2506.method597(11, var40);
                if (!var42.field1065.equals(var41)) {
                    var32.method2224(-1, var41, var40);
                    return;
                }
                var32.method2214(119, var40);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class350 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class319.method2075(true, field6518[--field6517]);
            } else {
                var43 = arg1 ? field6540 : field6527;
            }
            class302.method1902((byte) -3, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6517 -= 2;
                int var44 = field6518[field6517];
                int var45 = field6518[field6517 + 1];
                if (var43.field5354 == -1) {
                    class404.method2471(0, var43.field5322);
                    class433.method2588(var43.field5322, 8);
                    class162.method1193((byte) -87, var43.field5322);
                }
                if (var44 == -1) {
                    var43.field5286 = 1;
                    var43.field5260 = -1;
                    var43.field5273 = -1;
                    return;
                }
                var43.field5273 = var44;
                var43.field5296 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field5282 = true;
                } else {
                    var43.field5282 = false;
                }
                class134 var46 = class367.field5550.method1312((byte) 91, var44);
                var43.field5261 = var46.field2112;
                var43.field5361 = var46.field2132;
                var43.field5321 = var46.field2167;
                var43.field5308 = var46.field2096;
                var43.field5288 = var46.field2104;
                var43.field5253 = var46.field2151;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field5252 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field5252 = 1;
                } else {
                    var43.field5252 = 2;
                }
                if (var43.field5356 > 0) {
                    var43.field5253 = var43.field5253 * 32 / var43.field5356;
                    return;
                }
                if (var43.field5280 > 0) {
                    var43.field5253 = var43.field5253 * 32 / var43.field5280;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field5286 = 2;
                var43.field5260 = field6518[--field6517];
                if (var43.field5354 == -1) {
                    class209.method1412(80, var43.field5322);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field5286 = 3;
                var43.field5260 = -1;
                if (var43.field5354 == -1) {
                    class209.method1412(90, var43.field5322);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field5286 = 6;
                var43.field5260 = field6518[--field6517];
                if (var43.field5354 == -1) {
                    class209.method1412(36, var43.field5322);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field5286 = 5;
                var43.field5260 = field6518[--field6517];
                if (var43.field5354 == -1) {
                    class209.method1412(82, var43.field5322);
                }
                return;
            }
            if (arg0 == 1206) {
                field6517 -= 4;
                var43.field5233 = field6518[field6517];
                var43.field5378 = field6518[field6517 + 1];
                var43.field5262 = field6518[field6517 + 2];
                var43.field5300 = field6518[field6517 + 3];
                class302.method1902((byte) 97, var43);
                return;
            }
            if (arg0 == 1207) {
                field6517 -= 2;
                var43.field5311 = field6518[field6517];
                var43.field5224 = field6518[field6517 + 1];
                class302.method1902((byte) 40, var43);
                return;
            }
            if (arg0 == 1210) {
                field6517 -= 4;
                var43.field5260 = field6518[field6517];
                var43.field5258 = field6518[field6517 + 1];
                if (field6518[field6517 + 2] == 1) {
                    var43.field5286 = 9;
                } else {
                    var43.field5286 = 8;
                }
                if (field6518[field6517 + 3] == 1) {
                    var43.field5282 = true;
                } else {
                    var43.field5282 = false;
                }
                if (var43.field5354 == -1) {
                    class209.method1412(43, var43.field5322);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field5286 = 5;
                var43.field5260 = class148.field2368;
                var43.field5258 = 0;
                if (var43.field5354 == -1) {
                    class209.method1412(110, var43.field5322);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class350 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class319.method2075(true, field6518[--field6517]);
                } else {
                    var58 = arg1 ? field6540 : field6527;
                }
                String var59 = field6537[--field6535];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field6518[--field6517];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field6518[--field6517];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field6537[--field6535];
                    } else {
                        var62[var63] = Integer.valueOf(field6518[--field6517]);
                    }
                }
                int var64 = field6518[--field6517];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field5374 = var62;
                } else if (arg0 == 1401) {
                    var58.field5259 = var62;
                } else if (arg0 == 1402) {
                    var58.field5307 = var62;
                } else if (arg0 == 1403) {
                    var58.field5278 = var62;
                } else if (arg0 == 1404) {
                    var58.field5295 = var62;
                } else if (arg0 == 1405) {
                    var58.field5375 = var62;
                } else if (arg0 == 1406) {
                    var58.field5245 = var62;
                } else if (arg0 == 1407) {
                    var58.field5214 = var62;
                    var58.field5290 = var60;
                } else if (arg0 == 1408) {
                    var58.field5348 = var62;
                } else if (arg0 == 1409) {
                    var58.field5349 = var62;
                } else if (arg0 == 1410) {
                    var58.field5216 = var62;
                } else if (arg0 == 1411) {
                    var58.field5314 = var62;
                } else if (arg0 == 1412) {
                    var58.field5338 = var62;
                } else if (arg0 == 1414) {
                    var58.field5306 = var62;
                    var58.field5268 = var60;
                } else if (arg0 == 1415) {
                    var58.field5333 = var62;
                    var58.field5285 = var60;
                } else if (arg0 == 1416) {
                    var58.field5237 = var62;
                } else if (arg0 == 1417) {
                    var58.field5294 = var62;
                } else if (arg0 == 1418) {
                    var58.field5236 = var62;
                } else if (arg0 == 1419) {
                    var58.field5346 = var62;
                } else if (arg0 == 1420) {
                    var58.field5281 = var62;
                } else if (arg0 == 1421) {
                    var58.field5302 = var62;
                } else if (arg0 == 1422) {
                    var58.field5373 = var62;
                } else if (arg0 == 1423) {
                    var58.field5369 = var62;
                } else if (arg0 == 1424) {
                    var58.field5325 = var62;
                } else if (arg0 == 1425) {
                    var58.field5331 = var62;
                } else if (arg0 == 1426) {
                    var58.field5267 = var62;
                } else if (arg0 == 1427) {
                    var58.field5238 = var62;
                } else if (arg0 == 1428) {
                    var58.field5313 = var62;
                    var58.field5328 = var60;
                } else if (arg0 == 1429) {
                    var58.field5227 = var62;
                    var58.field5247 = var60;
                } else if (arg0 == 1430) {
                    var58.field5249 = var62;
                }
                var58.field5326 = true;
                return;
            }
            if (arg0 < 1600) {
                class350 var65 = arg1 ? field6540 : field6527;
                if (arg0 == 1500) {
                    field6518[field6517++] = var65.field5225;
                    return;
                }
                if (arg0 == 1501) {
                    field6518[field6517++] = var65.field5234;
                    return;
                }
                if (arg0 == 1502) {
                    field6518[field6517++] = var65.field5329;
                    return;
                }
                if (arg0 == 1503) {
                    field6518[field6517++] = var65.field5269;
                    return;
                }
                if (arg0 == 1504) {
                    field6518[field6517++] = var65.field5358 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6518[field6517++] = var65.field5297;
                    return;
                }
                if (arg0 == 1506) {
                    class350 var66 = class302.method1905(0, var65);
                    field6518[field6517++] = var66 == null ? -1 : var66.field5322;
                    return;
                }
            } else if (arg0 < 1700) {
                class350 var67 = arg1 ? field6540 : field6527;
                if (arg0 == 1600) {
                    field6518[field6517++] = var67.field5265;
                    return;
                }
                if (arg0 == 1601) {
                    field6518[field6517++] = var67.field5226;
                    return;
                }
                if (arg0 == 1602) {
                    field6537[field6535++] = var67.field5364;
                    return;
                }
                if (arg0 == 1603) {
                    field6518[field6517++] = var67.field5371;
                    return;
                }
                if (arg0 == 1604) {
                    field6518[field6517++] = var67.field5221;
                    return;
                }
                if (arg0 == 1605) {
                    field6518[field6517++] = var67.field5253;
                    return;
                }
                if (arg0 == 1606) {
                    field6518[field6517++] = var67.field5261;
                    return;
                }
                if (arg0 == 1607) {
                    field6518[field6517++] = var67.field5321;
                    return;
                }
                if (arg0 == 1608) {
                    field6518[field6517++] = var67.field5361;
                    return;
                }
                if (arg0 == 1609) {
                    field6518[field6517++] = var67.field5359;
                    return;
                }
                if (arg0 == 1610) {
                    field6518[field6517++] = var67.field5308;
                    return;
                }
                if (arg0 == 1611) {
                    field6518[field6517++] = var67.field5288;
                    return;
                }
                if (arg0 == 1612) {
                    field6518[field6517++] = var67.field5266;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field6518[--field6517];
                    class61 var69 = class162.field2506.method597(11, var68);
                    if (var69.method532(-7509)) {
                        field6537[field6535++] = var67.method2217(var69.field1065, var68, -95);
                    } else {
                        field6518[field6517++] = var67.method2225((byte) 116, var68, var69.field1062);
                    }
                }
            } else if (arg0 < 1800) {
                class350 var70 = arg1 ? field6540 : field6527;
                if (arg0 == 1700) {
                    field6518[field6517++] = var70.field5273;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field5273 != -1) {
                        field6518[field6517++] = var70.field5296;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6518[field6517++] = var70.field5354;
                    return;
                }
            } else if (arg0 < 1900) {
                class350 var71 = arg1 ? field6540 : field6527;
                if (arg0 == 1800) {
                    field6518[field6517++] = client.method1349(var71).method1607(-1);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field6518[--field6517];
                    int var334 = var72 - 1;
                    if (var71.field5284 != null && var334 < var71.field5284.length && var71.field5284[var334] != null) {
                        field6537[field6535++] = var71.field5284[var334];
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field5305 == null) {
                        field6537[field6535++] = "";
                        return;
                    }
                    field6537[field6535++] = var71.field5305;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class350 var332;
                if (arg0 >= 2000) {
                    var332 = class319.method2075(true, field6518[--field6517]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field6540 : field6527;
                }
                if (field6544 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field5238 == null) {
                        return;
                    }
                    class207 var333 = new class207();
                    var333.field2995 = var332;
                    var333.field2996 = var332.field5238;
                    var333.field2993 = field6544 + 1;
                    class378.field5715.method2417(-123, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class350 var73 = class319.method2075(true, field6518[--field6517]);
                if (arg0 == 2500) {
                    field6518[field6517++] = var73.field5225;
                    return;
                }
                if (arg0 == 2501) {
                    field6518[field6517++] = var73.field5234;
                    return;
                }
                if (arg0 == 2502) {
                    field6518[field6517++] = var73.field5329;
                    return;
                }
                if (arg0 == 2503) {
                    field6518[field6517++] = var73.field5269;
                    return;
                }
                if (arg0 == 2504) {
                    field6518[field6517++] = var73.field5358 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6518[field6517++] = var73.field5297;
                    return;
                }
                if (arg0 == 1506) {
                    class350 var74 = class302.method1905(0, var73);
                    field6518[field6517++] = var74 == null ? -1 : var74.field5322;
                    return;
                }
            } else if (arg0 < 2700) {
                class350 var75 = class319.method2075(true, field6518[--field6517]);
                if (arg0 == 2600) {
                    field6518[field6517++] = var75.field5265;
                    return;
                }
                if (arg0 == 2601) {
                    field6518[field6517++] = var75.field5226;
                    return;
                }
                if (arg0 == 2602) {
                    field6537[field6535++] = var75.field5364;
                    return;
                }
                if (arg0 == 2603) {
                    field6518[field6517++] = var75.field5371;
                    return;
                }
                if (arg0 == 2604) {
                    field6518[field6517++] = var75.field5221;
                    return;
                }
                if (arg0 == 2605) {
                    field6518[field6517++] = var75.field5253;
                    return;
                }
                if (arg0 == 2606) {
                    field6518[field6517++] = var75.field5261;
                    return;
                }
                if (arg0 == 2607) {
                    field6518[field6517++] = var75.field5321;
                    return;
                }
                if (arg0 == 2608) {
                    field6518[field6517++] = var75.field5361;
                    return;
                }
                if (arg0 == 2609) {
                    field6518[field6517++] = var75.field5359;
                    return;
                }
                if (arg0 == 2610) {
                    field6518[field6517++] = var75.field5308;
                    return;
                }
                if (arg0 == 2611) {
                    field6518[field6517++] = var75.field5288;
                    return;
                }
                if (arg0 == 2612) {
                    field6518[field6517++] = var75.field5266;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class350 var76 = class319.method2075(true, field6518[--field6517]);
                    field6518[field6517++] = var76.field5273;
                    return;
                }
                if (arg0 == 2701) {
                    class350 var77 = class319.method2075(true, field6518[--field6517]);
                    if (var77.field5273 == -1) {
                        field6518[field6517++] = 0;
                        return;
                    } else {
                        field6518[field6517++] = var77.field5296;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field6518[--field6517];
                    class352 var79 = (class352) class162.field2507.method171((byte) 113, (long) var78);
                    if (var79 != null) {
                        field6518[field6517++] = 1;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class350 var80 = class319.method2075(true, field6518[--field6517]);
                    if (var80.field5291 == null) {
                        field6518[field6517++] = 0;
                        return;
                    }
                    int var81 = var80.field5291.length;
                    for (int var82 = 0; var82 < var80.field5291.length; var82++) {
                        if (var80.field5291[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field6518[field6517++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6517 -= 2;
                    int var83 = field6518[field6517];
                    int var84 = field6518[field6517 + 1];
                    class352 var85 = (class352) class162.field2507.method171((byte) -117, (long) var83);
                    if (var85 != null && var85.field5391 == var84) {
                        field6518[field6517++] = 1;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class350 var86 = class319.method2075(true, field6518[--field6517]);
                if (arg0 == 2800) {
                    field6518[field6517++] = client.method1349(var86).method1607(-1);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field6518[--field6517];
                    int var335 = var87 - 1;
                    if (var86.field5284 != null && var335 < var86.field5284.length && var86.field5284[var335] != null) {
                        field6537[field6535++] = var86.field5284[var335];
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field5305 == null) {
                        field6537[field6535++] = "";
                        return;
                    }
                    field6537[field6535++] = var86.field5305;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field6537[--field6535];
                    class101.method754(var88, 0);
                    return;
                }
                if (arg0 == 3101) {
                    field6517 -= 2;
                    class478.method2853(field6518[field6517 + 1], (byte) -72, class139.field2224, field6518[field6517]);
                    return;
                }
                if (arg0 == 3103) {
                    class240.method1569(true, (byte) -84);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field6537[--field6535];
                    int var90 = 0;
                    if (class259.method1675((byte) 4, var89)) {
                        var90 = class463.method2758(-101, var89);
                    }
                    field6516++;
                    class28.method321(class156.field2454, -5001);
                    class410.field6141.method1117(var90, (byte) 12);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field6537[--field6535];
                    field6531++;
                    class28.method321(class531.field7824, -5001);
                    class410.field6141.method1109(false, var91.length() + 1);
                    class410.field6141.method1089((byte) -89, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field6537[--field6535];
                    field6528++;
                    class28.method321(class177.field2696, -5001);
                    class410.field6141.method1109(false, var92.length() + 1);
                    class410.field6141.method1089((byte) -89, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field6518[--field6517];
                    String var94 = field6537[--field6535];
                    class188.method1319((byte) -33, var94, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field6517 -= 3;
                    int var95 = field6518[field6517];
                    int var96 = field6518[field6517 + 1];
                    int var97 = field6518[field6517 + 2];
                    class350 var98 = class319.method2075(true, var97);
                    class347.method2203(var98, 0, var95, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field6517 -= 2;
                    int var99 = field6518[field6517];
                    int var100 = field6518[field6517 + 1];
                    class350 var101 = arg1 ? field6540 : field6527;
                    class347.method2203(var101, 0, var99, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field6518[--field6517];
                    field6539++;
                    class28.method321(class13.field208, -5001);
                    class410.field6141.method1094(1618659784, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field6517 -= 2;
                    int var103 = field6518[field6517];
                    int var104 = field6518[field6517 + 1];
                    class352 var105 = (class352) class162.field2507.method171((byte) -126, (long) var103);
                    if (var105 != null) {
                        class123.method946(var105.field5391 != var104, true, var105, (byte) -118);
                    }
                    class282.method1801(true, var104, var103, 0, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field6517--;
                    int var106 = field6518[field6517];
                    class352 var107 = (class352) class162.field2507.method171((byte) 67, (long) var106);
                    if (var107 != null && var107.field5390 == 3) {
                        class123.method946(true, true, var107, (byte) 71);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class137.method1022(field6537[--field6535], (byte) 20);
                    return;
                }
                if (arg0 == 3114) {
                    field6517 -= 2;
                    int var108 = field6518[field6517];
                    int var109 = field6518[field6517 + 1];
                    String var110 = field6537[--field6535];
                    class431.method2581(var109, var108, var110, "", "", (byte) 55);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6517 -= 3;
                    class215.method1434(field6518[field6517 + 2], 255, field6518[field6517], field6518[field6517 + 1], 2);
                    return;
                }
                if (arg0 == 3201) {
                    class170.method1245(23, 50, field6518[--field6517], 255);
                    return;
                }
                if (arg0 == 3202) {
                    field6517 -= 2;
                    class307.method2011(field6518[field6517 + 1], field6518[field6517], 255, (byte) 91);
                    return;
                }
                if (arg0 == 3203) {
                    field6517 -= 4;
                    class215.method1434(field6518[field6517 + 2], field6518[field6517 + 3], field6518[field6517], field6518[field6517 + 1], 2);
                    return;
                }
                if (arg0 == 3204) {
                    field6517 -= 3;
                    class170.method1245(-95, field6518[field6517 + 2], field6518[field6517], field6518[field6517 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field6517 -= 3;
                    class307.method2011(field6518[field6517 + 1], field6518[field6517], field6518[field6517 + 2], (byte) 88);
                    return;
                }
                if (arg0 == 3206) {
                    field6517 -= 4;
                    class77.method614(field6518[field6517 + 3], field6518[field6517 + 1], field6518[field6517], -74, field6518[field6517 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6518[field6517++] = class531.field7821;
                    return;
                }
                if (arg0 == 3301) {
                    field6517 -= 2;
                    int var111 = field6518[field6517];
                    int var112 = field6518[field6517 + 1];
                    field6518[field6517++] = class145.method1123(var111, false, -1, var112);
                    return;
                }
                if (arg0 == 3302) {
                    field6517 -= 2;
                    int var113 = field6518[field6517];
                    int var114 = field6518[field6517 + 1];
                    field6518[field6517++] = class210.method1416(var114, false, true, var113);
                    return;
                }
                if (arg0 == 3303) {
                    field6517 -= 2;
                    int var115 = field6518[field6517];
                    int var116 = field6518[field6517 + 1];
                    field6518[field6517++] = class80.method641(3, var115, false, var116);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field6518[--field6517];
                    field6518[field6517++] = class237.field3429.method2281(var117, (byte) 104).field2918;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field6518[--field6517];
                    field6518[field6517++] = class95.field1607[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field6518[--field6517];
                    field6518[field6517++] = class232.field3384[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field6518[--field6517];
                    field6518[field6517++] = class489.field7249[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class139.field2224.field6232;
                    int var122 = (class139.field2224.field6228 >> 7) + class200.field2931;
                    int var123 = (class139.field2224.field6233 >> 7) + class403.field6059;
                    field6518[field6517++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field6518[--field6517];
                    field6518[field6517++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field6518[--field6517];
                    field6518[field6517++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field6518[--field6517];
                    field6518[field6517++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6518[field6517++] = class223.field3193 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6517 -= 2;
                    int var127 = field6518[field6517];
                    int var128 = field6518[field6517 + 1];
                    field6518[field6517++] = class145.method1123(var127, true, -1, var128);
                    return;
                }
                if (arg0 == 3314) {
                    field6517 -= 2;
                    int var129 = field6518[field6517];
                    int var130 = field6518[field6517 + 1];
                    field6518[field6517++] = class210.method1416(var130, true, true, var129);
                    return;
                }
                if (arg0 == 3315) {
                    field6517 -= 2;
                    int var131 = field6518[field6517];
                    int var132 = field6518[field6517 + 1];
                    field6518[field6517++] = class80.method641(3, var131, true, var132);
                    return;
                }
                if (arg0 == 3316) {
                    if (class75.field1260 >= 2) {
                        field6518[field6517++] = class75.field1260;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6518[field6517++] = class291.field4140;
                    return;
                }
                if (arg0 == 3318) {
                    field6518[field6517++] = class487.field7219;
                    return;
                }
                if (arg0 == 3321) {
                    field6518[field6517++] = class495.field7309;
                    return;
                }
                if (arg0 == 3322) {
                    field6518[field6517++] = class168.field2602;
                    return;
                }
                if (arg0 == 3323) {
                    if (class431.field6412 >= 5 && class431.field6412 <= 9) {
                        field6518[field6517++] = 1;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class431.field6412 >= 5 && class431.field6412 <= 9) {
                        field6518[field6517++] = class431.field6412;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6518[field6517++] = class110.field1867 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6518[field6517++] = class139.field2224.field3690;
                    return;
                }
                if (arg0 == 3327) {
                    field6518[field6517++] = class139.field2224.field3717.field325 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field6518[field6517++] = class436.field6497 && !class45.field853 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6518[field6517++] = class63.field1091 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field6518[--field6517];
                    field6518[field6517++] = class179.method1271(false, (byte) 114, var133);
                    return;
                }
                if (arg0 == 3331) {
                    field6517 -= 2;
                    int var134 = field6518[field6517];
                    int var135 = field6518[field6517 + 1];
                    field6518[field6517++] = class333.method2138(false, false, var135, -1, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field6517 -= 2;
                    int var136 = field6518[field6517];
                    int var137 = field6518[field6517 + 1];
                    field6518[field6517++] = class333.method2138(true, false, var137, -1, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field6518[field6517++] = class290.field4136;
                    return;
                }
                if (arg0 == 3335) {
                    field6518[field6517++] = client.field2870;
                    return;
                }
                if (arg0 == 3336) {
                    field6517 -= 4;
                    int var138 = field6518[field6517];
                    int var139 = field6518[field6517 + 1];
                    int var140 = field6518[field6517 + 2];
                    int var141 = field6518[field6517 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field6518[field6517++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field6518[field6517++] = class110.field1871;
                    return;
                }
                if (arg0 == 3338) {
                    field6518[field6517++] = class308.method2018(false);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6517 -= 2;
                    int var145 = field6518[field6517];
                    int var146 = field6518[field6517 + 1];
                    class308 var147 = class365.field5520.method886(var145, (byte) -78);
                    field6537[field6535++] = var147.method2020(50, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field6517 -= 4;
                    int var148 = field6518[field6517];
                    int var149 = field6518[field6517 + 1];
                    int var150 = field6518[field6517 + 2];
                    int var151 = field6518[field6517 + 3];
                    class308 var152 = class365.field5520.method886(var150, (byte) -78);
                    if (var152.field4695 == var148 && var152.field4712 == var149) {
                        if (var149 == 115) {
                            field6537[field6535++] = var152.method2020(50, var151);
                            return;
                        }
                        field6518[field6517++] = var152.method2016(true, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field6517 -= 3;
                    int var153 = field6518[field6517];
                    int var154 = field6518[field6517 + 1];
                    int var155 = field6518[field6517 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class308 var156 = class365.field5520.method886(var154, (byte) -78);
                    if (var156.field4712 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6518[field6517++] = var156.method2013(0, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field6518[--field6517];
                    String var158 = field6537[--field6535];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class308 var159 = class365.field5520.method886(var157, (byte) -78);
                    if (var159.field4712 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6518[field6517++] = var159.method2022(120, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field6518[--field6517];
                    class308 var161 = class365.field5520.method886(var160, (byte) -78);
                    field6518[field6517++] = var161.field4709.method169(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class169.field2623 == 0) {
                        field6518[field6517++] = -2;
                        return;
                    }
                    if (class169.field2623 == 1) {
                        field6518[field6517++] = -1;
                        return;
                    }
                    field6518[field6517++] = class184.field2756;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field6518[--field6517];
                    if (class169.field2623 == 2 && var162 < class184.field2756) {
                        field6537[field6535++] = class436.field6504[var162];
                        if (class208.field3014[var162] != null) {
                            field6537[field6535++] = class208.field3014[var162];
                            return;
                        }
                        field6537[field6535++] = "";
                        return;
                    }
                    field6537[field6535++] = "";
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field6518[--field6517];
                    if (class169.field2623 == 2 && var163 < class184.field2756) {
                        field6518[field6517++] = class338.field5098[var163];
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field6518[--field6517];
                    if (class169.field2623 == 2 && var164 < class184.field2756) {
                        field6518[field6517++] = class526.field7778[var164];
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field6537[--field6535];
                    int var166 = field6518[--field6517];
                    class389.method2404(var166, 4940, var165);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field6537[--field6535];
                    class63.method538((byte) -46, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field6537[--field6535];
                    class22.method181(var168, (byte) 107);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field6537[--field6535];
                    class227.method1485(false, var169, 1);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field6537[--field6535];
                    class270.method1746(var170, true);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field6537[--field6535];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field6518[field6517++] = class206.method1401(0, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field6518[--field6517];
                    if (class169.field2623 == 2 && var172 < class184.field2756) {
                        field6537[field6535++] = class255.field3654[var172];
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class202.field2955 != null) {
                        field6537[field6535++] = class310.method2030((byte) 26, class202.field2955);
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class202.field2955 != null) {
                        field6518[field6517++] = class335.field5050;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field6518[--field6517];
                    if (class202.field2955 != null && var173 < class335.field5050) {
                        field6537[field6535++] = class149.field2374[var173].field2174;
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field6518[--field6517];
                    if (class202.field2955 != null && var174 < class335.field5050) {
                        field6518[field6517++] = class149.field2374[var174].field2172;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field6518[--field6517];
                    if (class202.field2955 != null && var175 < class335.field5050) {
                        field6518[field6517++] = class149.field2374[var175].field2173;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6518[field6517++] = class460.field6906;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field6537[--field6535];
                    class200.method1384((byte) -94, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field6518[field6517++] = class5.field120;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field6537[--field6535];
                    class481.method2863(var177, 0);
                    return;
                }
                if (arg0 == 3620) {
                    class413.method2504(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class169.field2623 == 0) {
                        field6518[field6517++] = -1;
                        return;
                    }
                    field6518[field6517++] = class1.field9;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field6518[--field6517];
                    if (class169.field2623 != 0 && var178 < class1.field9) {
                        field6537[field6535++] = class156.field2456[var178];
                        if (class441.field6609[var178] != null) {
                            field6537[field6535++] = class441.field6609[var178];
                            return;
                        }
                        field6537[field6535++] = "";
                        return;
                    }
                    field6537[field6535++] = "";
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field6537[--field6535];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field6518[field6517++] = class334.method2140(0, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field6518[--field6517];
                    if (class149.field2374 != null && var180 < class335.field5050 && class149.field2374[var180].field2178.equalsIgnoreCase(class139.field2224.field3684)) {
                        field6518[field6517++] = 1;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class259.field3769 != null) {
                        field6537[field6535++] = class259.field3769;
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field6518[--field6517];
                    if (class202.field2955 != null && var181 < class335.field5050) {
                        field6537[field6535++] = class149.field2374[var181].field2175;
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field6518[--field6517];
                    if (class169.field2623 == 2 && var182 >= 0 && var182 < class184.field2756) {
                        field6518[field6517++] = class284.field4054[var182] ? 1 : 0;
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field6537[--field6535];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field6518[field6517++] = class305.method2003(var183, 3);
                    return;
                }
                if (arg0 == 3629) {
                    field6518[field6517++] = class233.field3400;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field6537[--field6535];
                    class227.method1485(true, var184, 1);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field6518[--field6517];
                    field6518[field6517++] = class107.field1780[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field6518[--field6517];
                    if (class202.field2955 != null && var186 < class335.field5050) {
                        field6537[field6535++] = class149.field2374[var186].field2178;
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field6518[--field6517];
                    if (class169.field2623 != 0 && var187 < class1.field9) {
                        field6537[field6535++] = class274.field3963[var187];
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field6518[--field6517];
                    field6518[field6517++] = class61.field1072[var188].method2988(-9);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field6518[--field6517];
                    field6518[field6517++] = class61.field1072[var189].field7366;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field6518[--field6517];
                    field6518[field6517++] = class61.field1072[var190].field7363;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field6518[--field6517];
                    field6518[field6517++] = class61.field1072[var191].field7376;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field6518[--field6517];
                    field6518[field6517++] = class61.field1072[var192].field7370;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field6518[--field6517];
                    field6518[field6517++] = class61.field1072[var193].field7373;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field6518[--field6517];
                    int var195 = class61.field1072[var194].method2991((byte) -57);
                    field6518[field6517++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field6518[--field6517];
                    int var197 = class61.field1072[var196].method2991((byte) -57);
                    field6518[field6517++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field6518[--field6517];
                    int var199 = class61.field1072[var198].method2991((byte) -57);
                    field6518[field6517++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field6518[--field6517];
                    int var201 = class61.field1072[var200].method2991((byte) -57);
                    field6518[field6517++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6517 -= 2;
                    int var202 = field6518[field6517];
                    int var203 = field6518[field6517 + 1];
                    field6518[field6517++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field6517 -= 2;
                    int var204 = field6518[field6517];
                    int var205 = field6518[field6517 + 1];
                    field6518[field6517++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field6517 -= 2;
                    int var206 = field6518[field6517];
                    int var207 = field6518[field6517 + 1];
                    field6518[field6517++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field6517 -= 2;
                    int var208 = field6518[field6517];
                    int var209 = field6518[field6517 + 1];
                    field6518[field6517++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field6518[--field6517];
                    field6518[field6517++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field6518[--field6517];
                    field6518[field6517++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6517 -= 5;
                    int var212 = field6518[field6517];
                    int var213 = field6518[field6517 + 1];
                    int var214 = field6518[field6517 + 2];
                    int var215 = field6518[field6517 + 3];
                    int var216 = field6518[field6517 + 4];
                    field6518[field6517++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field6517 -= 2;
                    long var217 = (long) field6518[field6517];
                    long var219 = (long) field6518[field6517 + 1];
                    field6518[field6517++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field6517 -= 2;
                    int var221 = field6518[field6517];
                    int var222 = field6518[field6517 + 1];
                    field6518[field6517++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field6517 -= 2;
                    int var223 = field6518[field6517];
                    int var224 = field6518[field6517 + 1];
                    field6518[field6517++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6517 -= 2;
                    int var225 = field6518[field6517];
                    int var226 = field6518[field6517 + 1];
                    field6518[field6517++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6517 -= 2;
                    int var227 = field6518[field6517];
                    int var228 = field6518[field6517 + 1];
                    field6518[field6517++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field6517 -= 2;
                    int var229 = field6518[field6517];
                    int var230 = field6518[field6517 + 1];
                    if (var229 == 0) {
                        field6518[field6517++] = 0;
                        return;
                    }
                    field6518[field6517++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field6517 -= 2;
                    int var231 = field6518[field6517];
                    int var232 = field6518[field6517 + 1];
                    if (var231 == 0) {
                        field6518[field6517++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field6518[field6517++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6518[field6517++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field6517 -= 2;
                    int var233 = field6518[field6517];
                    int var234 = field6518[field6517 + 1];
                    field6518[field6517++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field6517 -= 2;
                    int var235 = field6518[field6517];
                    int var236 = field6518[field6517 + 1];
                    field6518[field6517++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field6517 -= 2;
                    int var237 = field6518[field6517];
                    int var238 = field6518[field6517 + 1];
                    field6518[field6517++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field6517 -= 2;
                    int var239 = field6518[field6517];
                    int var240 = field6518[field6517 + 1];
                    field6518[field6517++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field6517 -= 3;
                    long var241 = (long) field6518[field6517];
                    long var243 = (long) field6518[field6517 + 1];
                    long var245 = (long) field6518[field6517 + 2];
                    field6518[field6517++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field6537[--field6535];
                    int var248 = field6518[--field6517];
                    field6537[field6535++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field6535 -= 2;
                    String var249 = field6537[field6535];
                    String var250 = field6537[field6535 + 1];
                    field6537[field6535++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field6537[--field6535];
                    int var252 = field6518[--field6517];
                    field6537[field6535++] = var251 + class414.method2509(true, var252, 12);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field6537[--field6535];
                    field6537[field6535++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6537[field6535++] = method2611(field6518[--field6517]);
                    return;
                }
                if (arg0 == 4105) {
                    field6535 -= 2;
                    String var254 = field6537[field6535];
                    String var255 = field6537[field6535 + 1];
                    if (class139.field2224.field3717 != null && class139.field2224.field3717.field325) {
                        field6537[field6535++] = var255;
                        return;
                    }
                    field6537[field6535++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field6518[--field6517];
                    field6537[field6535++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field6535 -= 2;
                    field6518[field6517++] = class261.method1693(field6537[field6535 + 1], client.field2870, field6537[field6535], 25911);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field6537[--field6535];
                    field6517 -= 2;
                    int var258 = field6518[field6517];
                    int var259 = field6518[field6517 + 1];
                    class332 var260 = class436.method2598((byte) 64, class76.field1270, 0, var259);
                    field6518[field6517++] = var260.method2132(var258, class35.field675, (byte) -70, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field6537[--field6535];
                    field6517 -= 2;
                    int var262 = field6518[field6517];
                    int var263 = field6518[field6517 + 1];
                    class332 var264 = class436.method2598((byte) 98, class76.field1270, 0, var263);
                    field6518[field6517++] = var264.method2129(class35.field675, var262, 108, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field6535 -= 2;
                    String var265 = field6537[field6535];
                    String var266 = field6537[field6535 + 1];
                    if (field6518[--field6517] == 1) {
                        field6537[field6535++] = var265;
                        return;
                    }
                    field6537[field6535++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field6537[--field6535];
                    field6537[field6535++] = class263.method1698(var267, 0);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field6537[--field6535];
                    int var269 = field6518[--field6517];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6537[field6535++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field6518[--field6517];
                    field6518[field6517++] = class70.method571((byte) -89, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field6518[--field6517];
                    field6518[field6517++] = class245.method1593((char) var271, (byte) 121) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field6518[--field6517];
                    field6518[field6517++] = class516.method3080((char) var272, -1) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field6518[--field6517];
                    field6518[field6517++] = class260.method1685((char) var273, 84) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field6537[--field6535];
                    if (var274 != null) {
                        field6518[field6517++] = var274.length();
                        return;
                    }
                    field6518[field6517++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field6537[--field6535];
                    field6517 -= 2;
                    int var276 = field6518[field6517];
                    int var277 = field6518[field6517 + 1];
                    field6537[field6535++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field6537[--field6535];
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
                    field6537[field6535++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field6537[--field6535];
                    field6517 -= 2;
                    int var284 = field6518[field6517];
                    int var285 = field6518[field6517 + 1];
                    field6518[field6517++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field6535 -= 2;
                    String var286 = field6537[field6535];
                    String var287 = field6537[field6535 + 1];
                    int var288 = field6518[--field6517];
                    field6518[field6517++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field6518[--field6517];
                    field6518[field6517++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field6518[--field6517];
                    field6518[field6517++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field6518[--field6517] != 0;
                    int var292 = field6518[--field6517];
                    field6537[field6535++] = class338.method2164(client.field2870, (long) var292, (byte) -63, 0, var291);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field6537[--field6535];
                    int var294 = field6518[--field6517];
                    class332 var295 = class436.method2598((byte) 62, class76.field1270, 0, var294);
                    field6518[field6517++] = var295.method2133((byte) 78, class35.field675, var293);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field6518[--field6517];
                    field6537[field6535++] = class367.field5550.method1312((byte) 91, var296).field2133;
                    return;
                }
                if (arg0 == 4201) {
                    field6517 -= 2;
                    int var297 = field6518[field6517];
                    int var298 = field6518[field6517 + 1];
                    class134 var299 = class367.field5550.method1312((byte) 91, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field2153[var298 - 1] != null) {
                        field6537[field6535++] = var299.field2153[var298 - 1];
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6517 -= 2;
                    int var300 = field6518[field6517];
                    int var301 = field6518[field6517 + 1];
                    class134 var302 = class367.field5550.method1312((byte) 91, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field2125[var301 - 1] != null) {
                        field6537[field6535++] = var302.field2125[var301 - 1];
                        return;
                    }
                    field6537[field6535++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field6518[--field6517];
                    field6518[field6517++] = class367.field5550.method1312((byte) 91, var303).field2094;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field6518[--field6517];
                    field6518[field6517++] = class367.field5550.method1312((byte) 91, var304).field2107 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field6518[--field6517];
                    class134 var306 = class367.field5550.method1312((byte) 91, var305);
                    if (var306.field2114 == -1 && var306.field2128 >= 0) {
                        field6518[field6517++] = var306.field2128;
                        return;
                    }
                    field6518[field6517++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field6518[--field6517];
                    class134 var308 = class367.field5550.method1312((byte) 91, var307);
                    if (var308.field2114 >= 0 && var308.field2128 >= 0) {
                        field6518[field6517++] = var308.field2128;
                        return;
                    }
                    field6518[field6517++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field6518[--field6517];
                    field6518[field6517++] = class367.field5550.method1312((byte) 91, var309).field2102 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6517 -= 2;
                    int var310 = field6518[field6517];
                    int var311 = field6518[field6517 + 1];
                    class61 var312 = class162.field2506.method597(11, var311);
                    if (var312.method532(-7509)) {
                        field6537[field6535++] = class367.field5550.method1312((byte) 91, var310).method995(var311, -11549, var312.field1065);
                        return;
                    }
                    field6518[field6517++] = class367.field5550.method1312((byte) 91, var310).method1007(var312.field1062, (byte) 91, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field6517 -= 2;
                    int var313 = field6518[field6517];
                    int var314 = field6518[field6517 + 1] - 1;
                    class134 var315 = class367.field5550.method1312((byte) 91, var313);
                    if (var315.field2129 == var314) {
                        field6518[field6517++] = var315.field2139;
                        return;
                    }
                    if (var315.field2143 == var314) {
                        field6518[field6517++] = var315.field2134;
                        return;
                    }
                    field6518[field6517++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field6537[--field6535];
                    int var317 = field6518[--field6517];
                    class127.method961((byte) -117, var317 == 1, var316);
                    field6518[field6517++] = class511.field7543;
                    return;
                }
                if (arg0 == 4211) {
                    if (class364.field5514 != null && class58.field1032 < class511.field7543) {
                        field6518[field6517++] = class364.field5514[class58.field1032++] & 0xFFFF;
                        return;
                    }
                    field6518[field6517++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class58.field1032 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6517 -= 2;
                    int var318 = field6518[field6517];
                    int var319 = field6518[field6517 + 1];
                    class61 var320 = class162.field2506.method597(11, var319);
                    if (var320.method532(-7509)) {
                        field6537[field6535++] = class61.field1070.method502(var318, -20).method413(true, var319, var320.field1065);
                        return;
                    }
                    field6518[field6517++] = class61.field1070.method502(var318, -62).method421((byte) -16, var320.field1062, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6517 -= 2;
                    int var321 = field6518[field6517];
                    int var322 = field6518[field6517 + 1];
                    class61 var323 = class162.field2506.method597(11, var322);
                    if (var323.method532(-7509)) {
                        field6537[field6535++] = class319.field4807.method2874(var321, -17045).method626(var323.field1065, -26740, var322);
                        return;
                    }
                    field6518[field6517++] = class319.field4807.method2874(var321, -17045).method632((byte) -17, var322, var323.field1062);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6517 -= 2;
                    int var324 = field6518[field6517];
                    int var325 = field6518[field6517 + 1];
                    class61 var326 = class162.field2506.method597(11, var325);
                    if (var326.method532(-7509)) {
                        field6537[field6535++] = class365.field5521.method1439(-1, var324).method1163((byte) 25, var325, var326.field1065);
                        return;
                    }
                    field6518[field6517++] = class365.field5521.method1439(-1, var324).method1159(var325, var326.field1062, (byte) 98);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field6518[--field6517];
                class435 var328 = class203.field2969.method1239(32, var327);
                if (var328.field6451 != null && var328.field6451.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field6474[0];
                    for (int var331 = 1; var331 < var328.field6451.length; var331++) {
                        if (var328.field6474[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field6474[var331];
                        }
                    }
                    field6518[field6517++] = var328.field6451[var329];
                    return;
                }
                field6518[field6517++] = var328.field6460;
                return;
            }
        } else {
            class350 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class319.method2075(true, field6518[--field6517]);
            } else {
                var47 = arg1 ? field6540 : field6527;
            }
            if (arg0 == 1300) {
                int var48 = field6518[--field6517] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2219(field6537[--field6535], 0, var48);
                    return;
                }
                field6535--;
                return;
            }
            if (arg0 == 1301) {
                field6517 -= 2;
                int var49 = field6518[field6517];
                int var50 = field6518[field6517 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field5334 = null;
                    return;
                }
                var47.field5334 = class83.method649((byte) 69, var49, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field6518[--field6517];
                if (class443.field6621 != var51 && class68.field1164 != var51 && class166.field2575 != var51) {
                    return;
                }
                var47.field5275 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field5332 = field6518[--field6517];
                return;
            }
            if (arg0 == 1304) {
                var47.field5254 = field6518[--field6517];
                return;
            }
            if (arg0 == 1305) {
                var47.field5305 = field6537[--field6535];
                return;
            }
            if (arg0 == 1306) {
                var47.field5230 = field6537[--field6535];
                return;
            }
            if (arg0 == 1307) {
                var47.field5284 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field5309 = field6518[--field6517];
                var47.field5357 = field6518[--field6517];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field6518[--field6517];
                int var53 = field6518[--field6517];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2226(var52, (byte) -87, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field5228 = field6537[--field6535];
                return;
            }
            if (arg0 == 1311) {
                var47.field5377 = field6518[--field6517];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field6517 -= 3;
                    var54 = field6518[field6517] - 1;
                    var55 = field6518[field6517 + 1];
                    var56 = field6518[field6517 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6517 -= 2;
                    var54 = 10;
                    var55 = field6518[field6517];
                    var56 = field6518[field6517 + 1];
                }
                if (var47.field5370 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field5370 = new byte[11];
                    var47.field5366 = new byte[11];
                    var47.field5365 = new int[11];
                }
                var47.field5370[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field5319 = false;
                    for (int var57 = 0; var57 < var47.field5370.length; var57++) {
                        if (var47.field5370[var57] != 0) {
                            var47.field5319 = true;
                            break;
                        }
                    }
                } else {
                    var47.field5319 = true;
                }
                var47.field5366[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field5330 = field6518[--field6517];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lno;II)V")
    public static final void method2609(class494 arg0, int arg1, int arg2) {
        class227 var3 = class368.method2300(arg1, arg2, 28069, arg0);
        if (var3 == null) {
            return;
        }
        field6526 = new int[var3.field3235];
        field6532 = new String[var3.field3238];
        if (class527.field7781 == var3.field3230 || class107.field1776 == var3.field3230 || class92.field1575 == var3.field3230) {
            int var4 = 0;
            int var5 = 0;
            if (class47.field876 != null) {
                var4 = class47.field876.field5225;
                var5 = class47.field876.field5234;
            }
            field6526[0] = class166.field2579.method1024(true) - var4;
            field6526[1] = class166.field2579.method1019((byte) 3) - var5;
        }
        method2607(var3, 200000);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lne;I)V")
    private static final void method2610(class207 arg0, int arg1) {
        Object[] var2 = arg0.field2996;
        int var3 = (Integer) var2[0];
        class227 var4 = class25.method312(-77, var3);
        if (var4 == null) {
            return;
        }
        field6526 = new int[var4.field3235];
        int var5 = 0;
        field6532 = new String[var4.field3238];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2994;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2988;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2995 == null ? -1 : arg0.field2995.field5322;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2997;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2995 == null ? -1 : arg0.field2995.field5354;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2998 == null ? -1 : arg0.field2998.field5322;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2998 == null ? -1 : arg0.field2998.field5354;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2990;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2989;
                }
                field6526[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2991;
                }
                field6532[var6++] = var9;
            }
        }
        field6544 = arg0.field2993;
        method2607(var4, arg1);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method2611(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6530.setTime(new Date(var1));
        int var3 = field6530.get(5);
        int var4 = field6530.get(2);
        int var5 = field6530.get(1);
        return var3 + "-" + field6542[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public static final void method2612(int arg0) {
        if (arg0 == -1 || !class355.method2252(arg0, -118)) {
            return;
        }
        class350[] var1 = class22.field438[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class350 var3 = var1[var2];
            if (var3.field5242 != null) {
                class207 var4 = new class207();
                var4.field2995 = var3;
                var4.field2996 = var3.field5242;
                method2610(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    private static final void method2613(int arg0) {
        class350 var1 = class319.method2075(true, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class350[] var3 = class388.field5835[var2];
        if (var3 == null) {
            class350[] var4 = class22.field438[var2];
            int var5 = var4.length;
            var3 = class388.field5835[var2] = new class350[var5];
            class73.method592(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class73.method592(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lne;)V")
    public static final void method2614(class207 arg0) {
        method2610(arg0, 200000);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
    public static final void method2615() {
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(IZ)V")
    private static final void method2616(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6518[field6517++] = class435.field6465;
                return;
            }
            if (arg0 == 5001) {
                field6517 -= 3;
                class435.field6465 = field6518[field6517];
                class69.field1205 = class511.method3062(field6518[field6517 + 1], (byte) 81);
                if (class69.field1205 == null) {
                    class69.field1205 = class407.field6108;
                }
                client.field2876 = field6518[field6517 + 2];
                field6521++;
                class28.method321(class209.field3019, -5001);
                class410.field6141.method1109(false, class435.field6465);
                class410.field6141.method1109(false, class69.field1205.field5836);
                class410.field6141.method1109(false, client.field2876);
                return;
            }
            if (arg0 == 5002) {
                field6535 -= 2;
                String var2 = field6537[field6535];
                String var3 = field6537[field6535 + 1];
                field6517 -= 2;
                int var4 = field6518[field6517];
                int var5 = field6518[field6517 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field6525++;
                class28.method321(class510.field7533, -5001);
                class410.field6141.method1109(false, class217.method1444(var2, -127) + class217.method1444(var3, -123) + 2);
                class410.field6141.method1089((byte) -89, var2);
                class410.field6141.method1109(false, var4 - 1);
                class410.field6141.method1109(false, var5);
                class410.field6141.method1089((byte) -89, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field6518[--field6517];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class142.field2250[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field6537[field6535++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field6518[--field6517];
                int var9 = -1;
                if (var8 < 100 && class142.field2250[var8] != null) {
                    var9 = class153.field2422[var8];
                }
                field6518[field6517++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class69.field1205 == null) {
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = class69.field1205.field5836;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field6537[--field6535];
                method2604(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6535 -= 2;
                String var11 = field6537[field6535];
                String var12 = field6537[field6535 + 1];
                if (class75.field1260 != 0 || (!class436.field6497 || class45.field853) && !class63.field1091) {
                    field6524++;
                    class28.method321(class180.field2728, -5001);
                    class410.field6141.method1109(false, 0);
                    int var13 = class410.field6141.field2289;
                    class410.field6141.method1089((byte) -89, var11);
                    class304.method1993(var12, -96, class410.field6141);
                    class410.field6141.method1110(class410.field6141.field2289 - var13, false);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field6518[--field6517];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class480.field7146[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field6537[field6535++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field6518[--field6517];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class348.field5207[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field6537[field6535++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field6518[--field6517];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class277.field3998[var18];
                }
                field6518[field6517++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class139.field2224 == null || class139.field2224.field3721 == null) {
                    var20 = class334.field5049;
                } else {
                    var20 = class139.field2224.method1663((byte) 106, true);
                }
                field6537[field6535++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field6518[field6517++] = client.field2876;
                return;
            }
            if (arg0 == 5017) {
                field6518[field6517++] = class476.field7117;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field6518[--field6517];
                int var22 = 0;
                if (var21 < 100 && class142.field2250[var21] != null) {
                    var22 = class153.field2422[var21];
                }
                field6518[field6517++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field6518[--field6517];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class12.field204[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field6537[field6535++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class139.field2224 == null || class139.field2224.field3721 == null) {
                    var25 = class334.field5049;
                } else {
                    var25 = class139.field2224.method1660((byte) -80, false);
                }
                field6537[field6535++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field6518[--field6517];
                field6537[field6535++] = class283.field4048.method700(var26, (byte) -31).field6765;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field6518[--field6517];
                class453 var28 = class283.field4048.method700(var27, (byte) -31);
                if (var28.field6772 == null) {
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = var28.field6772.length;
                return;
            }
            if (arg0 == 5052) {
                field6517 -= 2;
                int var29 = field6518[field6517];
                int var30 = field6518[field6517 + 1];
                class453 var31 = class283.field4048.method700(var29, (byte) -31);
                int var32 = var31.field6772[var30];
                field6518[field6517++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field6518[--field6517];
                class453 var34 = class283.field4048.method700(var33, (byte) -31);
                if (var34.field6775 == null) {
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = var34.field6775.length;
                return;
            }
            if (arg0 == 5054) {
                field6517 -= 2;
                int var35 = field6518[field6517];
                int var36 = field6518[field6517 + 1];
                field6518[field6517++] = class283.field4048.method700(var35, (byte) -31).field6775[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field6518[--field6517];
                field6537[field6535++] = class474.field7099.method1473(true, var37).method191(-2);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field6518[--field6517];
                class23 var39 = class474.field7099.method1473(true, var38);
                if (var39.field472 == null) {
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = var39.field472.length;
                return;
            }
            if (arg0 == 5057) {
                field6517 -= 2;
                int var40 = field6518[field6517];
                int var41 = field6518[field6517 + 1];
                field6518[field6517++] = class474.field7099.method1473(true, var40).field472[var41];
                return;
            }
            if (arg0 == 5058) {
                field6522 = new class511();
                field6522.field7537 = field6518[--field6517];
                field6522.field7545 = class474.field7099.method1473(true, field6522.field7537);
                field6522.field7539 = new int[field6522.field7545.method187(0)];
                return;
            }
            if (arg0 == 5059) {
                field6519++;
                class28.method321(class196.field2895, -5001);
                class410.field6141.method1109(false, 0);
                int var42 = class410.field6141.field2289;
                class410.field6141.method1109(false, 0);
                class410.field6141.method1094(1618659784, field6522.field7537);
                field6522.field7545.method196(8, class410.field6141, field6522.field7539);
                class410.field6141.method1110(class410.field6141.field2289 - var42, false);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field6537[--field6535];
                field6538++;
                class28.method321(class362.field5488, -5001);
                class410.field6141.method1109(false, 0);
                int var44 = class410.field6141.field2289;
                class410.field6141.method1089((byte) -89, var43);
                class410.field6141.method1094(1618659784, field6522.field7537);
                field6522.field7545.method196(8, class410.field6141, field6522.field7539);
                class410.field6141.method1110(class410.field6141.field2289 - var44, false);
                return;
            }
            if (arg0 == 5061) {
                field6519++;
                class28.method321(class196.field2895, -5001);
                class410.field6141.method1109(false, 0);
                int var45 = class410.field6141.field2289;
                class410.field6141.method1109(false, 1);
                class410.field6141.method1094(1618659784, field6522.field7537);
                field6522.field7545.method196(8, class410.field6141, field6522.field7539);
                class410.field6141.method1110(class410.field6141.field2289 - var45, false);
                return;
            }
            if (arg0 == 5062) {
                field6517 -= 2;
                int var46 = field6518[field6517];
                int var47 = field6518[field6517 + 1];
                field6518[field6517++] = class283.field4048.method700(var46, (byte) -31).field6763[var47];
                return;
            }
            if (arg0 == 5063) {
                field6517 -= 2;
                int var48 = field6518[field6517];
                int var49 = field6518[field6517 + 1];
                field6518[field6517++] = class283.field4048.method700(var48, (byte) -31).field6767[var49];
                return;
            }
            if (arg0 == 5064) {
                field6517 -= 2;
                int var50 = field6518[field6517];
                int var51 = field6518[field6517 + 1];
                if (var51 == -1) {
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = class283.field4048.method700(var50, (byte) -31).method2703((byte) 87, (char) var51);
                return;
            }
            if (arg0 == 5065) {
                field6517 -= 2;
                int var52 = field6518[field6517];
                int var53 = field6518[field6517 + 1];
                if (var53 == -1) {
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = class283.field4048.method700(var52, (byte) -31).method2707(-111, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field6518[--field6517];
                field6518[field6517++] = class474.field7099.method1473(true, var54).method187(0);
                return;
            }
            if (arg0 == 5067) {
                field6517 -= 2;
                int var55 = field6518[field6517];
                int var56 = field6518[field6517 + 1];
                int var57 = class474.field7099.method1473(true, var55).method195(-128, var56).field5052;
                field6518[field6517++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field6517 -= 2;
                int var58 = field6518[field6517];
                int var59 = field6518[field6517 + 1];
                field6522.field7539[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field6517 -= 2;
                int var60 = field6518[field6517];
                int var61 = field6518[field6517 + 1];
                field6522.field7539[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field6517 -= 3;
                int var62 = field6518[field6517];
                int var63 = field6518[field6517 + 1];
                int var64 = field6518[field6517 + 2];
                class23 var65 = class474.field7099.method1473(true, var62);
                if (var65.method195(-20, var63).field5052 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6518[field6517++] = var65.method189(var64, var63, 123);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field6537[--field6535];
                boolean var67 = field6518[--field6517] == 1;
                class404.method2472(0, var66, var67);
                field6518[field6517++] = class511.field7543;
                return;
            }
            if (arg0 == 5072) {
                if (class364.field5514 != null && class58.field1032 < class511.field7543) {
                    field6518[field6517++] = class364.field5514[class58.field1032++] & 0xFFFF;
                    return;
                }
                field6518[field6517++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class58.field1032 = 0;
                return;
            }
            if (arg0 == 5074) {
                field6519++;
                class28.method321(class196.field2895, -5001);
                class410.field6141.method1109(false, 0);
                int var68 = class410.field6141.field2289;
                class410.field6141.method1109(false, 2);
                class410.field6141.method1094(1618659784, field6522.field7537);
                field6522.field7545.method196(8, class410.field6141, field6522.field7539);
                class410.field6141.method1110(class410.field6141.field2289 - var68, false);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class380.field5726.method1584(14, 86)) {
                    field6518[field6517++] = 1;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class380.field5726.method1584(14, 82)) {
                    field6518[field6517++] = 1;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class380.field5726.method1584(14, 81)) {
                    field6518[field6517++] = 1;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class347.method2205((byte) 124, field6518[--field6517]);
                return;
            }
            if (arg0 == 5201) {
                field6518[field6517++] = class96.method734((byte) -127);
                return;
            }
            if (arg0 == 5205) {
                class407.method2481(-1, 44, -1, false, field6518[--field6517]);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field6518[--field6517];
                class419 var70 = class509.method3042(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = var70.field6263;
                return;
            }
            if (arg0 == 5207) {
                class419 var71 = class509.method3038(field6518[--field6517]);
                if (var71 != null && var71.field6250 != null) {
                    field6537[field6535++] = var71.field6250;
                    return;
                }
                field6537[field6535++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6518[field6517++] = class299.field4255;
                field6518[field6517++] = class306.field4682;
                return;
            }
            if (arg0 == 5209) {
                field6518[field6517++] = class509.field7503 + class404.field6067;
                field6518[field6517++] = class509.field7519 + class158.field2464;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field6518[--field6517];
                class419 var73 = class509.method3038(var72);
                if (var73 == null) {
                    field6518[field6517++] = 0;
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = var73.field6258 >> 14 & 0x3FFF;
                field6518[field6517++] = var73.field6258 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field6518[--field6517];
                class419 var75 = class509.method3038(var74);
                if (var75 == null) {
                    field6518[field6517++] = 0;
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = var75.field6264 - var75.field6255;
                field6518[field6517++] = var75.field6252 - var75.field6272;
                return;
            }
            if (arg0 == 5212) {
                class353 var76 = class502.method3007(true);
                if (var76 == null) {
                    field6518[field6517++] = -1;
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = var76.field5397;
                int var77 = var76.field5400 << 28 | class509.field7503 + var76.field5402 << 14 | class509.field7519 + var76.field5396;
                field6518[field6517++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class353 var78 = class101.method750(-21654);
                if (var78 == null) {
                    field6518[field6517++] = -1;
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = var78.field5397;
                int var79 = var78.field5400 << 28 | class509.field7503 + var78.field5402 << 14 | class509.field7519 + var78.field5396;
                field6518[field6517++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field6518[--field6517];
                class419 var81 = class452.method2695(-4);
                if (var81 != null) {
                    boolean var82 = var81.method2537(var80 >> 14 & 0x3FFF, var80 & 0x3FFF, field6543, var80 >> 28 & 0x3, -26767);
                    if (var82) {
                        class412.method2495(field6543[1], field6543[2], (byte) 118);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6517 -= 2;
                int var83 = field6518[field6517];
                int var84 = field6518[field6517 + 1];
                class259 var85 = class509.method3034(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class419 var87 = (class419) var85.method1679(255); var87 != null; var87 = (class419) var85.method1671(-10033)) {
                    if (var87.field6263 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field6518[field6517++] = 1;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field6518[--field6517];
                class419 var89 = class509.method3038(var88);
                if (var89 == null) {
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = var89.field6265;
                return;
            }
            if (arg0 == 5220) {
                field6518[field6517++] = class368.field5569 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field6518[--field6517];
                class412.method2495(var90 >> 14 & 0x3FFF, var90 & 0x3FFF, (byte) 119);
                return;
            }
            if (arg0 == 5222) {
                class419 var91 = class452.method2695(-4);
                if (var91 != null) {
                    boolean var92 = var91.method2530(-13274, field6543, class509.field7519 + class158.field2464, class509.field7503 + class404.field6067);
                    if (var92) {
                        field6518[field6517++] = field6543[1];
                        field6518[field6517++] = field6543[2];
                        return;
                    }
                    field6518[field6517++] = -1;
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = -1;
                field6518[field6517++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6517 -= 2;
                int var93 = field6518[field6517];
                int var94 = field6518[field6517 + 1];
                class407.method2481(var94 >> 14 & 0x3FFF, 98, var94 & 0x3FFF, false, var93);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field6518[--field6517];
                class419 var96 = class452.method2695(-4);
                if (var96 != null) {
                    boolean var97 = var96.method2537(var95 >> 14 & 0x3FFF, var95 & 0x3FFF, field6543, var95 >> 28 & 0x3, -26767);
                    if (var97) {
                        field6518[field6517++] = field6543[1];
                        field6518[field6517++] = field6543[2];
                        return;
                    }
                    field6518[field6517++] = -1;
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = -1;
                field6518[field6517++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field6518[--field6517];
                class419 var99 = class452.method2695(-4);
                if (var99 != null) {
                    boolean var100 = var99.method2530(-13274, field6543, var98 & 0x3FFF, var98 >> 14 & 0x3FFF);
                    if (var100) {
                        field6518[field6517++] = field6543[1];
                        field6518[field6517++] = field6543[2];
                        return;
                    }
                    field6518[field6517++] = -1;
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = -1;
                field6518[field6517++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class504.method3018(field6518[--field6517], (byte) -112);
                return;
            }
            if (arg0 == 5227) {
                field6517 -= 2;
                int var101 = field6518[field6517];
                int var102 = field6518[field6517 + 1];
                class407.method2481(var102 >> 14 & 0x3FFF, 102, var102 & 0x3FFF, true, var101);
                return;
            }
            if (arg0 == 5228) {
                class161.field2492 = field6518[--field6517] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6518[field6517++] = class161.field2492 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field6518[--field6517];
                class88.method688(var103, false);
                return;
            }
            if (arg0 == 5231) {
                field6517 -= 2;
                int var104 = field6518[field6517];
                boolean var105 = field6518[field6517 + 1] == 1;
                if (class457.field6841 != null) {
                    class320 var106 = class457.field6841.method171((byte) -88, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2090(-1);
                        return;
                    }
                    if (var106 == null && var105) {
                        class320 var107 = new class320();
                        class457.field6841.method166(var107, (long) var104, 64);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field6518[--field6517];
                if (class457.field6841 != null) {
                    class320 var109 = class457.field6841.method171((byte) 115, (long) var108);
                    field6518[field6517++] = var109 == null ? 0 : 1;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6517 -= 2;
                int var110 = field6518[field6517];
                boolean var111 = field6518[field6517 + 1] == 1;
                if (class429.field6390 != null) {
                    class320 var112 = class429.field6390.method171((byte) -106, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2090(-1);
                        return;
                    }
                    if (var112 == null && var111) {
                        class320 var113 = new class320();
                        class429.field6390.method166(var113, (long) var110, 54);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field6518[--field6517];
                if (class429.field6390 != null) {
                    class320 var115 = class429.field6390.method171((byte) -110, (long) var114);
                    field6518[field6517++] = var115 == null ? 0 : 1;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6518[field6517++] = class509.field7483 == null ? -1 : class509.field7483.field6263;
                return;
            }
            if (arg0 == 5236) {
                field6517 -= 2;
                int var116 = field6518[field6517];
                int var117 = field6518[field6517 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class397.method2455(var118, -71, var116, var119);
                if (var120 < 0) {
                    field6518[field6517++] = -1;
                    return;
                }
                field6518[field6517++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6517 -= 2;
                int var121 = field6518[field6517];
                int var122 = field6518[field6517 + 1];
                class228.method1489(3, false, var122, var121, false);
                field6518[field6517++] = class197.field2913 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class197.field2913 != null) {
                    class228.method1489(class443.field6623.field619, false, -1, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class524[] var123 = class203.method1398(0);
                field6518[field6517++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field6518[--field6517];
                class524[] var125 = class203.method1398(0);
                field6518[field6517++] = var125[var124].field7774;
                field6518[field6517++] = var125[var124].field7770;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class443.field6623.field599;
                int var127 = class443.field6623.field628;
                int var128 = -1;
                class524[] var129 = class203.method1398(0);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class524 var131 = var129[var130];
                    if (var131.field7774 == var126 && var131.field7770 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field6518[field6517++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field6518[field6517++] = class8.method43(false);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field6518[--field6517];
                if (var132 >= 1 && var132 <= 2) {
                    class228.method1489(var132, false, -1, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6518[field6517++] = class443.field6623.field619;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field6518[--field6517];
                if (var133 >= 1 && var133 <= 2) {
                    class443.field6623.field619 = var133;
                    class443.field6623.method2844(class368.field5553, 25133);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6535 -= 2;
                String var134 = field6537[field6535];
                String var135 = field6537[field6535 + 1];
                int var136 = field6518[--field6517];
                field6529++;
                class28.method321(class50.field907, -5001);
                class410.field6141.method1109(false, class217.method1444(var134, -128) + class217.method1444(var135, -126) + 1);
                class410.field6141.method1089((byte) -89, var134);
                class410.field6141.method1089((byte) -89, var135);
                class410.field6141.method1109(false, var136);
                return;
            }
            if (arg0 == 5401) {
                field6517 -= 2;
                class163.field2527[field6518[field6517]] = (short) class259.method1676(0, field6518[field6517 + 1]);
                class367.field5550.method1323(false);
                class367.field5550.method1315(-105);
                class61.field1070.method503(-65);
                class511.method3061(22843);
                return;
            }
            if (arg0 == 5405) {
                field6517 -= 2;
                int var137 = field6518[field6517];
                int var138 = field6518[field6517 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class481.field7159[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6517 -= 7;
                int var139 = field6518[field6517];
                int var140 = field6518[field6517 + 1] << 1;
                int var141 = field6518[field6517 + 2];
                int var142 = field6518[field6517 + 3];
                int var143 = field6518[field6517 + 4];
                int var144 = field6518[field6517 + 5];
                int var145 = field6518[field6517 + 6];
                if (var139 >= 0 && var139 < 2 && class481.field7159[var139] != null && var140 >= 0 && var140 < class481.field7159[var139].length) {
                    class481.field7159[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class481.field7159[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class481.field7159[field6518[--field6517]].length >> 1;
                field6518[field6517++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class197.field2913 != null) {
                    class228.method1489(class443.field6623.field619, false, -1, -1, false);
                }
                if (class423.field6321 != null) {
                    class33.method349(true);
                    System.exit(0);
                    return;
                }
                String var147 = class403.field6055 == null ? class359.method2262(110) : class403.field6055;
                class59.method526(-4, false, class169.field2624 == 1, class368.field5553, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class499.field7368 != null) {
                    if (class499.field7368.field4939 == null) {
                        var148 = class264.method1700(class499.field7368.field4943, -121);
                    } else {
                        var148 = (String) class499.field7368.field4939;
                    }
                }
                field6537[field6535++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field6518[field6517++] = class293.field4179 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class197.field2913 != null) {
                    class228.method1489(class443.field6623.field619, false, -1, -1, false);
                }
                String var149 = field6537[--field6535];
                boolean var150 = field6518[--field6517] == 1;
                String var151 = class359.method2262(110) + var149;
                class59.method526(-4, var150, class169.field2624 == 1, class368.field5553, var151);
                return;
            }
            if (arg0 == 5422) {
                field6535 -= 2;
                String var152 = field6537[field6535];
                String var153 = field6537[field6535 + 1];
                int var154 = field6518[--field6517];
                if (var152.length() > 0) {
                    if (class287.field4096 == null) {
                        class287.field4096 = new String[class430.field6399[class403.field6054.field3439]];
                    }
                    class287.field4096[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class32.field640 == null) {
                        class32.field640 = new String[class430.field6399[class403.field6054.field3439]];
                    }
                    class32.field640[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6537[--field6535]);
                return;
            }
            if (arg0 == 5424) {
                field6517 -= 11;
                class436.field6515 = field6518[field6517];
                class323.field4932 = field6518[field6517 + 1];
                class348.field5206 = field6518[field6517 + 2];
                class265.field3819 = field6518[field6517 + 3];
                class294.field4188 = field6518[field6517 + 4];
                class362.field5484 = field6518[field6517 + 5];
                class284.field4050 = field6518[field6517 + 6];
                class285.field4068 = field6518[field6517 + 7];
                class22.field459 = field6518[field6517 + 8];
                class130.field2060 = field6518[field6517 + 9];
                class483.field7199 = field6518[field6517 + 10];
                class151.field2407.method129(true, class294.field4188);
                class151.field2407.method129(true, class362.field5484);
                class151.field2407.method129(true, class284.field4050);
                class151.field2407.method129(true, class285.field4068);
                class151.field2407.method129(true, class22.field459);
                class195.field2867 = null;
                class214.field3089 = null;
                class151.field2406 = null;
                class46.field856 = null;
                class410.field6144 = null;
                class232.field3382 = null;
                class5.field128 = null;
                class480.field7140 = null;
                class295.field4199 = true;
                return;
            }
            if (arg0 == 5425) {
                class425.method2558((byte) -77);
                class295.field4199 = false;
                return;
            }
            if (arg0 == 5426) {
                field6517 -= 2;
                class97.field1621 = field6518[field6517];
                class361.field5476 = field6518[field6517 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6517 -= 2;
                class155.field2446 = field6518[field6517 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6517 -= 2;
                int var155 = field6518[field6517];
                int var156 = field6518[field6517 + 1];
                field6518[field6517++] = class145.method1115(-500076504, var155, var156) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class370.method2317(true, field6537[--field6535], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class512.method3065("accountcreated", class368.field5553.field4170, (byte) 10);
                    return;
                } catch (Throwable var267) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6517 -= 4;
                int var157 = field6518[field6517];
                int var158 = field6518[field6517 + 1];
                int var159 = field6518[field6517 + 2];
                int var160 = field6518[field6517 + 3];
                class383.method2378(var158, var159, var160, 128, (var157 >> 14 & 0x3FFF) - class200.field2931, false, (var157 & 0x3FFF) - class403.field6059);
                return;
            }
            if (arg0 == 5501) {
                field6517 -= 4;
                int var161 = field6518[field6517];
                int var162 = field6518[field6517 + 1];
                int var163 = field6518[field6517 + 2];
                int var164 = field6518[field6517 + 3];
                class121.method926(var163, var164, (var161 >> 14 & 0x3FFF) - class200.field2931, var162, (var161 & 0x3FFF) - class403.field6059, -35);
                return;
            }
            if (arg0 == 5502) {
                field6517 -= 6;
                int var165 = field6518[field6517];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class412.field6156 = var165;
                int var166 = field6518[field6517 + 1];
                if (var166 + 1 >= class481.field7159[class412.field6156].length >> 1) {
                    throw new RuntimeException();
                }
                class365.field5522 = var166;
                class443.field6620 = 0;
                class321.field4911 = field6518[field6517 + 2];
                class175.field2681 = field6518[field6517 + 3];
                int var167 = field6518[field6517 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class190.field2834 = var167;
                int var168 = field6518[field6517 + 5];
                if (var168 + 1 >= class481.field7159[class190.field2834].length >> 1) {
                    throw new RuntimeException();
                }
                class81.field1425 = var168;
                class85.field1473 = 3;
                return;
            }
            if (arg0 == 5503) {
                class123.method945((byte) -122);
                return;
            }
            if (arg0 == 5504) {
                field6517 -= 2;
                class109.method812(field6518[field6517 + 1], field6518[field6517], 0, (byte) -90);
                return;
            }
            if (arg0 == 5505) {
                field6518[field6517++] = (int) class455.field6790 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6518[field6517++] = (int) class526.field7779 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class270.method1744((byte) -90);
                return;
            }
            if (arg0 == 5508) {
                class35.method368(-12713);
                return;
            }
            if (arg0 == 5509) {
                class60.method528(true);
                return;
            }
            if (arg0 == 5510) {
                class274.method1759(-128);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field6518[--field6517];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class200.field2931;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class33.field662) {
                    var172 = class33.field662;
                }
                int var173 = var171 - class403.field6059;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class121.field1966) {
                    var173 = class121.field1966;
                }
                class141.field2245 = (var172 << 7) + 64;
                class206.field2980 = (var173 << 7) + 64;
                class85.field1473 = 4;
                return;
            }
            if (arg0 == 5512) {
                class424.method2553((byte) -44);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6535 -= 2;
                String var174 = field6537[field6535];
                String var175 = field6537[field6535 + 1];
                int var176 = field6518[--field6517];
                if (class281.field4023 != 10) {
                    return;
                }
                if (class446.field6658 == 0 && class350.field5217 == 0 && class91.field1568 == 0 && class431.field6416 == 0) {
                    class8.method44(var176, var175, -1, var174);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class530.method3142(28153);
                return;
            }
            if (arg0 == 5602) {
                if (class350.field5217 == 0) {
                    class68.field1169 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field6517 -= 4;
                if (class281.field4023 != 10) {
                    return;
                }
                if (class446.field6658 == 0 && class350.field5217 == 0 && class91.field1568 == 0 && class431.field6416 == 0) {
                    class399.method2460(field6518[field6517 + 3], 126, field6518[field6517], field6518[field6517 + 2], field6518[field6517 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field6535--;
                if (class281.field4023 != 10) {
                    return;
                }
                if (class446.field6658 == 0 && class350.field5217 == 0 && class91.field1568 == 0 && class431.field6416 == 0) {
                    class253.method1630(class20.method168(field6537[field6535], false), 22937);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6535 -= 3;
                field6517 -= 7;
                if (class281.field4023 != 10) {
                    return;
                }
                if (class446.field6658 == 0 && class350.field5217 == 0 && class91.field1568 == 0 && class431.field6416 == 0) {
                    class68.method562(field6518[field6517 + 3], class20.method168(field6537[field6535], false), field6518[field6517 + 2], field6518[field6517 + 1], field6518[field6517 + 5] == 1, field6537[field6535 + 2], field6518[field6517 + 6] == 1, (byte) 113, field6537[field6535 + 1], field6518[field6517 + 4] == 1, field6518[field6517]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class91.field1568 == 0) {
                    class47.field864 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6518[field6517++] = class68.field1169;
                return;
            }
            if (arg0 == 5608) {
                field6518[field6517++] = class369.field5586;
                return;
            }
            if (arg0 == 5609) {
                field6518[field6517++] = class47.field864;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field6537[field6535++] = class201.field2945.length > var177 ? class310.method2030((byte) 26, class201.field2945[var177]) : "";
                }
                class201.field2945 = null;
                return;
            }
            if (arg0 == 5611) {
                field6518[field6517++] = class106.field1764;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field6518[--field6517];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class443.field6623.field602 = var178;
                class347.method2206(-71);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6002) {
                class443.field6623.method2845(field6518[--field6517] == 1, false);
                class347.method2206(-107);
                class80.method642(-26522);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6003) {
                class443.field6623.field631 = field6518[--field6517] == 1;
                class80.method642(-26522);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6005) {
                class443.field6623.field593 = field6518[--field6517] == 1;
                class347.method2206(-124);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6006) {
                class443.field6623.field618 = field6518[--field6517] == 1;
                class4.field109.method210(!class443.field6623.field618);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6007) {
                class443.field6623.field595 = field6518[--field6517];
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6008) {
                class443.field6623.field598 = field6518[--field6517] == 1;
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6009) {
                class443.field6623.field632 = field6518[--field6517] == 1;
                class347.method2206(-87);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6010) {
                class443.field6623.field612 = field6518[--field6517] == 1;
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field6518[--field6517];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class443.field6623.method334((byte) 98, var179, class169.field2624);
                class347.method2206(-95);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6012) {
                class443.field6623.method335(field6518[--field6517] == 1, class169.field2624, (byte) -97);
                class497.method2981(30);
                class418.method2527((byte) -112);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6014) {
                class443.field6623.field629 = field6518[--field6517] == 1;
                class347.method2206(-93);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6015) {
                class443.field6623.field609 = field6518[--field6517] == 1;
                class347.method2206(-86);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field6518[--field6517];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class443.field6623.field610 = var180;
                class388.method2394(25, class169.field2624);
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6017) {
                class443.field6623.field621 = field6518[--field6517] == 1;
                class277.method1766(104);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field6518[--field6517];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class443.field6623.field630 = var181;
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field6518[--field6517];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class443.field6623.field594 != var182) {
                    if (class443.field6623.field594 == 0 && class281.field4026 != -1) {
                        class3.method30(0, 9576, var182, false, class281.field4026, class84.field1455);
                        class217.field3129 = false;
                    } else if (var182 == 0) {
                        class106.method801(1);
                        class217.field3129 = false;
                    } else {
                        class212.method1420(-1, var182);
                    }
                    class443.field6623.field594 = var182;
                }
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field6518[--field6517];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class443.field6623.field607 = var183;
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6021) {
                class443.field6623.field7092 = field6518[--field6517] == 1;
                class80.method642(-26522);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field6518[--field6517];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class457.field6854 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class156.method1174(110, var184);
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                field6518[field6517++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field6518[--field6517];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class443.field6623.field611 = var186;
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field6518[--field6517];
                if (var187 < 0 || var187 > class87.method684(class457.field6854, 105)) {
                    var187 = 0;
                }
                class443.field6623.field615 = var187;
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field6518[--field6517];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class298.method1887((byte) 121, var188 == 1);
                return;
            }
            if (arg0 == 6028) {
                class443.field6623.field617 = field6518[--field6517] != 0;
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6029) {
                class443.field6623.field595 = field6518[--field6517];
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6030) {
                class443.field6623.field596 = field6518[--field6517] != 0;
                class443.field6623.method2844(class368.field5553, 25133);
                class347.method2206(-65);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field6518[--field6517];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class388.method2394(25, var189);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field6518[--field6517];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class443.field6623.field604 = var190;
                class443.field6623.method2844(class368.field5553, 25133);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field6518[--field6517];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class443.field6623.field626 = var191;
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6034) {
                class443.field6623.field616 = field6518[--field6517] == 1;
                class443.field6623.method2844(class368.field5553, 25133);
                class497.method2981(30);
                class72.field1247 = false;
                return;
            }
            if (arg0 == 6035) {
                class443.field6623.field7097 = field6518[--field6517] == 1;
                class347.method2206(-70);
                class80.method642(-26522);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6518[field6517++] = class443.field6623.field602;
                return;
            }
            if (arg0 == 6102) {
                field6518[field6517++] = class443.field6623.method2843(108, class169.field2624) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6518[field6517++] = class443.field6623.field631 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6518[field6517++] = class443.field6623.field593 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field6518[field6517++] = class443.field6623.field618 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6518[field6517++] = class443.field6623.field595;
                return;
            }
            if (arg0 == 6108) {
                field6518[field6517++] = class443.field6623.field598 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field6518[field6517++] = class443.field6623.field632 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6518[field6517++] = class443.field6623.field612 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6518[field6517++] = class443.field6623.method338(-4, class169.field2624);
                return;
            }
            if (arg0 == 6112) {
                field6518[field6517++] = class443.field6623.method337(class169.field2624, (byte) 113) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6518[field6517++] = class443.field6623.field629 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6518[field6517++] = class443.field6623.field609 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6518[field6517++] = class443.field6623.field610;
                return;
            }
            if (arg0 == 6117) {
                field6518[field6517++] = class443.field6623.field621 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6518[field6517++] = class443.field6623.field630;
                return;
            }
            if (arg0 == 6119) {
                field6518[field6517++] = class443.field6623.field594;
                return;
            }
            if (arg0 == 6120) {
                field6518[field6517++] = class443.field6623.field607;
                return;
            }
            if (arg0 == 6121) {
                field6518[field6517++] = class4.field109.method287() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field6518[field6517++] = class389.method2398(1006);
                return;
            }
            if (arg0 == 6124) {
                field6518[field6517++] = class443.field6623.field611;
                return;
            }
            if (arg0 == 6125) {
                field6518[field6517++] = class443.field6623.field615;
                return;
            }
            if (arg0 == 6126) {
                field6518[field6517++] = class4.field109.method219() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field6518[field6517++] = class443.field6623.field623 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6518[field6517++] = class443.field6623.field617 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6518[field6517++] = class443.field6623.field595;
                return;
            }
            if (arg0 == 6130) {
                field6518[field6517++] = class443.field6623.field596 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6518[field6517++] = class169.field2624;
                return;
            }
            if (arg0 == 6132) {
                field6518[field6517++] = class443.field6623.field604;
                return;
            }
            if (arg0 == 6133) {
                field6518[field6517++] = class293.field4179 == 1 || class293.field4179 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field6518[field6517++] = class87.method684(class457.field6854, 117);
                return;
            }
            if (arg0 == 6135) {
                field6518[field6517++] = class443.field6623.field626;
                return;
            }
            if (arg0 == 6136) {
                field6518[field6517++] = class443.field6623.field616 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var192 = true;
                try {
                    var192 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var268) {
                }
                field6518[field6517++] = var192 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6517 -= 2;
                class361.field5468 = (short) field6518[field6517];
                if (class361.field5468 <= 0) {
                    class361.field5468 = 256;
                }
                class228.field3241 = (short) field6518[field6517 + 1];
                if (class228.field3241 <= 0) {
                    class228.field3241 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6517 -= 2;
                class261.field3796 = (short) field6518[field6517];
                if (class261.field3796 <= 0) {
                    class261.field3796 = 256;
                }
                class309.field4716 = (short) field6518[field6517 + 1];
                if (class309.field4716 <= 0) {
                    class309.field4716 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6517 -= 4;
                class157.field2459 = (short) field6518[field6517];
                if (class157.field2459 <= 0) {
                    class157.field2459 = 1;
                }
                class130.field2059 = (short) field6518[field6517 + 1];
                if (class130.field2059 <= 0) {
                    class130.field2059 = 32767;
                } else if (class130.field2059 < class157.field2459) {
                    class130.field2059 = class157.field2459;
                }
                class159.field2473 = (short) field6518[field6517 + 2];
                if (class159.field2473 <= 0) {
                    class159.field2473 = 1;
                }
                class331.field5014 = (short) field6518[field6517 + 3];
                if (class331.field5014 <= 0) {
                    class331.field5014 = 32767;
                    return;
                }
                if (class331.field5014 < class159.field2473) {
                    class331.field5014 = class159.field2473;
                }
                return;
            }
            if (arg0 == 6203) {
                class514.method3071(false, class28.field579.field5269, class28.field579.field5329, 0, 100, 0);
                field6518[field6517++] = class289.field4117;
                field6518[field6517++] = class183.field2735;
                return;
            }
            if (arg0 == 6204) {
                field6518[field6517++] = class261.field3796;
                field6518[field6517++] = class309.field4716;
                return;
            }
            if (arg0 == 6205) {
                field6518[field6517++] = class361.field5468;
                field6518[field6517++] = class228.field3241;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6518[field6517++] = (int) (class211.method1419(12921) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6518[field6517++] = (int) (class211.method1419(12921) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6517 -= 3;
                int var193 = field6518[field6517];
                int var194 = field6518[field6517 + 1];
                int var195 = field6518[field6517 + 2];
                field6530.clear();
                field6530.set(11, 12);
                field6530.set(var195, var194, var193);
                field6518[field6517++] = (int) (field6530.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field6530.clear();
                field6530.setTime(new Date(class211.method1419(12921)));
                field6518[field6517++] = field6530.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var196 = field6518[--field6517];
                boolean var197 = true;
                if (var196 < 0) {
                    var197 = (var196 + 1) % 4 == 0;
                } else if (var196 < 1582) {
                    var197 = var196 % 4 == 0;
                } else if (var196 % 4 != 0) {
                    var197 = false;
                } else if (var196 % 100 != 0) {
                    var197 = true;
                } else if (var196 % 400 != 0) {
                    var197 = false;
                }
                field6518[field6517++] = var197 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6518[field6517++] = class506.method3027(0) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6518[field6517++] = class321.method2092(120) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class281.field4023 == 10 && class446.field6658 == 0 && class350.field5217 == 0 && class91.field1568 == 0) {
                    field6518[field6517++] = class132.method985((byte) -78) == -1 ? 0 : 1;
                    return;
                }
                field6518[field6517++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class89 var198 = class251.method1617((byte) 54);
                if (var198 != null) {
                    field6518[field6517++] = var198.field1553;
                    field6518[field6517++] = var198.field4259;
                    field6537[field6535++] = var198.field1555;
                    class168 var199 = var198.method697(-2277);
                    field6518[field6517++] = var199.field2603;
                    field6537[field6535++] = var199.field2607;
                    field6518[field6517++] = var198.field4262;
                    field6518[field6517++] = var198.field1556;
                    return;
                }
                field6518[field6517++] = -1;
                field6518[field6517++] = 0;
                field6537[field6535++] = "";
                field6518[field6517++] = 0;
                field6537[field6535++] = "";
                field6518[field6517++] = 0;
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class89 var200 = class170.method1248(16186);
                if (var200 != null) {
                    field6518[field6517++] = var200.field1553;
                    field6518[field6517++] = var200.field4259;
                    field6537[field6535++] = var200.field1555;
                    class168 var201 = var200.method697(-2277);
                    field6518[field6517++] = var201.field2603;
                    field6537[field6535++] = var201.field2607;
                    field6518[field6517++] = var200.field4262;
                    field6518[field6517++] = var200.field1556;
                    return;
                }
                field6518[field6517++] = -1;
                field6518[field6517++] = 0;
                field6537[field6535++] = "";
                field6518[field6517++] = 0;
                field6537[field6535++] = "";
                field6518[field6517++] = 0;
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var202 = field6518[--field6517];
                if (class281.field4023 == 10 && class446.field6658 == 0 && class350.field5217 == 0 && class91.field1568 == 0) {
                    field6518[field6517++] = class305.method2000((byte) -116, var202) ? 1 : 0;
                    return;
                }
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class443.field6623.field620 = field6518[--field6517];
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6505) {
                field6518[field6517++] = class443.field6623.field620;
                return;
            }
            if (arg0 == 6506) {
                int var203 = field6518[--field6517];
                class89 var204 = class329.method2116(var203, (byte) 78);
                if (var204 != null) {
                    field6518[field6517++] = var204.field4259;
                    field6537[field6535++] = var204.field1555;
                    class168 var205 = var204.method697(-2277);
                    field6518[field6517++] = var205.field2603;
                    field6537[field6535++] = var205.field2607;
                    field6518[field6517++] = var204.field4262;
                    field6518[field6517++] = var204.field1556;
                    return;
                }
                field6518[field6517++] = -1;
                field6537[field6535++] = "";
                field6518[field6517++] = 0;
                field6537[field6535++] = "";
                field6518[field6517++] = 0;
                field6518[field6517++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field6517 -= 4;
                int var206 = field6518[field6517];
                boolean var207 = field6518[field6517 + 1] == 1;
                int var208 = field6518[field6517 + 2];
                boolean var209 = field6518[field6517 + 3] == 1;
                class281.method1795(var206, var209, var207, (byte) 125, var208);
                return;
            }
            if (arg0 == 6508) {
                class435.method2594(false);
                return;
            }
            if (arg0 == 6509) {
                if (class281.field4023 != 10) {
                    return;
                }
                class1.field1 = field6518[--field6517] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class443.field6623.field601 = field6518[--field6517] == 1;
                class443.field6623.method2844(class368.field5553, 25133);
                return;
            }
            if (arg0 == 6601) {
                field6518[field6517++] = class443.field6623.field601 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class86.field1505 == class521.field7739) {
            if (arg0 == 6700) {
                int var210 = class162.field2507.method169(0);
                if (class364.field5513 != -1) {
                    var210++;
                }
                field6518[field6517++] = var210;
                return;
            }
            if (arg0 == 6701) {
                int var211 = field6518[--field6517];
                if (class364.field5513 != -1) {
                    if (var211 == 0) {
                        field6518[field6517++] = class364.field5513;
                        return;
                    }
                    var211--;
                }
                class352 var212 = (class352) class162.field2507.method160((byte) -20);
                while (var211-- > 0) {
                    var212 = (class352) class162.field2507.method163(126);
                }
                field6518[field6517++] = var212.field5391;
                return;
            }
            if (arg0 == 6702) {
                int var213 = field6518[--field6517];
                if (class22.field438[var213] == null) {
                    field6537[field6535++] = "";
                    return;
                }
                String var214 = class22.field438[var213][0].field5241;
                if (var214 == null) {
                    field6537[field6535++] = "";
                    return;
                }
                field6537[field6535++] = var214.substring(0, var214.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var215 = field6518[--field6517];
                if (class22.field438[var215] == null) {
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = class22.field438[var215].length;
                return;
            }
            if (arg0 == 6704) {
                field6517 -= 2;
                int var216 = field6518[field6517];
                int var217 = field6518[field6517 + 1];
                if (class22.field438[var216] == null) {
                    field6537[field6535++] = "";
                    return;
                }
                String var218 = class22.field438[var216][var217].field5241;
                if (var218 == null) {
                    field6537[field6535++] = "";
                    return;
                }
                field6537[field6535++] = var218;
                return;
            }
            if (arg0 == 6705) {
                field6517 -= 2;
                int var219 = field6518[field6517];
                int var220 = field6518[field6517 + 1];
                if (class22.field438[var219] == null) {
                    field6518[field6517++] = 0;
                    return;
                }
                field6518[field6517++] = class22.field438[var219][var220].field5345;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field6517 -= 3;
                int var221 = field6518[field6517];
                int var222 = field6518[field6517 + 1];
                int var223 = field6518[field6517 + 2];
                class329.method2118(1, var223, var221 << 16 | var222, (byte) -56, "");
                return;
            }
            if (arg0 == 6708) {
                field6517 -= 3;
                int var224 = field6518[field6517];
                int var225 = field6518[field6517 + 1];
                int var226 = field6518[field6517 + 2];
                class329.method2118(2, var226, var224 << 16 | var225, (byte) -56, "");
                return;
            }
            if (arg0 == 6709) {
                field6517 -= 3;
                int var227 = field6518[field6517];
                int var228 = field6518[field6517 + 1];
                int var229 = field6518[field6517 + 2];
                class329.method2118(3, var229, var227 << 16 | var228, (byte) -56, "");
                return;
            }
            if (arg0 == 6710) {
                field6517 -= 3;
                int var230 = field6518[field6517];
                int var231 = field6518[field6517 + 1];
                int var232 = field6518[field6517 + 2];
                class329.method2118(4, var232, var230 << 16 | var231, (byte) -56, "");
                return;
            }
            if (arg0 == 6711) {
                field6517 -= 3;
                int var233 = field6518[field6517];
                int var234 = field6518[field6517 + 1];
                int var235 = field6518[field6517 + 2];
                class329.method2118(5, var235, var233 << 16 | var234, (byte) -56, "");
                return;
            }
            if (arg0 == 6712) {
                field6517 -= 3;
                int var236 = field6518[field6517];
                int var237 = field6518[field6517 + 1];
                int var238 = field6518[field6517 + 2];
                class329.method2118(6, var238, var236 << 16 | var237, (byte) -56, "");
                return;
            }
            if (arg0 == 6713) {
                field6517 -= 3;
                int var239 = field6518[field6517];
                int var240 = field6518[field6517 + 1];
                int var241 = field6518[field6517 + 2];
                class329.method2118(7, var241, var239 << 16 | var240, (byte) -56, "");
                return;
            }
            if (arg0 == 6714) {
                field6517 -= 3;
                int var242 = field6518[field6517];
                int var243 = field6518[field6517 + 1];
                int var244 = field6518[field6517 + 2];
                class329.method2118(8, var244, var242 << 16 | var243, (byte) -56, "");
                return;
            }
            if (arg0 == 6715) {
                field6517 -= 3;
                int var245 = field6518[field6517];
                int var246 = field6518[field6517 + 1];
                int var247 = field6518[field6517 + 2];
                class329.method2118(9, var247, var245 << 16 | var246, (byte) -56, "");
                return;
            }
            if (arg0 == 6716) {
                field6517 -= 3;
                int var248 = field6518[field6517];
                int var249 = field6518[field6517 + 1];
                int var250 = field6518[field6517 + 2];
                class329.method2118(10, var250, var248 << 16 | var249, (byte) -56, "");
                return;
            }
            if (arg0 == 6717) {
                field6517 -= 3;
                int var251 = field6518[field6517];
                int var252 = field6518[field6517 + 1];
                int var253 = field6518[field6517 + 2];
                class350 var254 = class83.method649((byte) 70, var251 << 16 | var252, var253);
                class227.method1486(0);
                class250 var255 = client.method1349(var254);
                class474.method2838(var255.method1607(-1), -11, var255.field3578, var254);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var256 = field6518[--field6517];
                class447 var257 = class160.field2479.method1812((byte) 28, var256);
                if (var257.field6674 == null) {
                    field6537[field6535++] = "";
                    return;
                }
                field6537[field6535++] = var257.field6674;
                return;
            }
            if (arg0 == 6801) {
                int var258 = field6518[--field6517];
                class447 var259 = class160.field2479.method1812((byte) 28, var258);
                field6518[field6517++] = var259.field6679;
                return;
            }
            if (arg0 == 6802) {
                int var260 = field6518[--field6517];
                class447 var261 = class160.field2479.method1812((byte) 28, var260);
                field6518[field6517++] = var261.field6677;
                return;
            }
            if (arg0 == 6803) {
                int var262 = field6518[--field6517];
                class447 var263 = class160.field2479.method1812((byte) 28, var262);
                field6518[field6517++] = var263.field6670;
                return;
            }
            if (arg0 == 6804) {
                field6517 -= 2;
                int var264 = field6518[field6517];
                int var265 = field6518[field6517 + 1];
                class61 var266 = class162.field2506.method597(11, var265);
                if (var266.method532(-7509)) {
                    field6537[field6535++] = class160.field2479.method1812((byte) 28, var264).method2675(-16, var265, var266.field1065);
                    return;
                }
                field6518[field6517++] = class160.field2479.method1812((byte) 28, var264).method2674(var265, (byte) 73, var266.field1062);
                return;
            }
        }
        throw new IllegalStateException();
    }
}
