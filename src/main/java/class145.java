import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class145 {

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field3453 = 0;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lrd;")
    public static class114 field3459 = class84.method656("Ihr Spielkonto wird bereits benutzt)3", (byte) 124);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lrd;")
    public static class114 field3448 = class84.method656("backhmid1", (byte) 121);

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lrd;")
    private static class114 field3450 = class84.method656("Please wait )2 attempting to reestablish", (byte) 118);

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lrd;")
    public static class114 field3449 = class84.method656(")2", (byte) 120);

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lrd;")
    private static class114 field3456 = class84.method656("To play on this world move to a free area first", (byte) 120);

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3466 = -1;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3463 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Z")
    public static boolean field3464 = false;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lrd;")
    public static class114 field3447 = field3456;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lrd;")
    public static class114 field3451 = field3450;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lrd;")
    public static class114 field3458 = class84.method656("RuneScape wurde aktualisiert(Q", (byte) 126);

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lrd;")
    public static class114 field3465 = class84.method656("Der Anmelde)2Server ist offline)3", (byte) 120);

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lrd;")
    public static class114 field3455 = class84.method656("null", (byte) 117);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "J")
    public static long field3460;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BILpb;I)[Loa;")
    public static final class93[] method1148(byte arg0, int arg1, class100 arg2, int arg3) {
        field3454++;
        if (class122.method955(arg1, (byte) -124, arg3, arg2)) {
            return arg0 > -20 ? null : class72.method585(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field3459 = null;
        field3450 = null;
        field3456 = null;
        if (arg0 < 17) {
            field3464 = true;
        }
        field3449 = null;
        field3451 = null;
        field3448 = null;
        field3455 = null;
        field3458 = null;
        field3465 = null;
        field3447 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1150(int arg0, Throwable arg1) throws IOException {
        field3468++;
        String var2;
        if (arg1 instanceof class58) {
            class58 var3 = (class58) arg1;
            arg1 = var3.field1198;
            var2 = var3.field1199 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 != -22155) {
            return null;
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
    public static final void method1151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3469++;
        for (class65 var5 = (class65) class111.field2601.method654((byte) 53); var5 != null; var5 = (class65) class111.field2601.method644((byte) -68)) {
            if (var5.field1396 != -1 || var5.field1405 != null) {
                int var6 = 0;
                if (var5.field1406 < arg1) {
                    var6 += arg1 - var5.field1406;
                } else if (arg1 < var5.field1404) {
                    var6 += var5.field1404 - arg1;
                }
                if (arg2 > var5.field1393) {
                    var6 += arg2 - var5.field1393;
                } else if (arg2 < var5.field1391) {
                    var6 += var5.field1391 - arg2;
                }
                if (var6 - 64 > var5.field1403 || class84.field1860 == 0 || var5.field1402 != arg0) {
                    if (var5.field1386 != null) {
                        class29.field614.method894(var5.field1386);
                        var5.field1386 = null;
                    }
                    if (var5.field1390 != null) {
                        class29.field614.method894(var5.field1390);
                        var5.field1390 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1403 - var6) * class84.field1860 / var5.field1403;
                    if (var5.field1386 != null) {
                        var5.field1386.method36(var7);
                    } else if (var5.field1396 >= 0) {
                        class57 var8 = class57.method421(class12.field280, var5.field1396, 0);
                        if (var8 != null) {
                            class87 var9 = var8.method418().method664(class80.field1819);
                            class4 var10 = class4.method47(var9, 100, var7);
                            var10.method16(-1);
                            class29.field614.method895(var10);
                            var5.field1386 = var10;
                        }
                    }
                    if (var5.field1390 != null) {
                        var5.field1390.method36(var7);
                        if (!var5.field1390.method537(-32303)) {
                            var5.field1390 = null;
                        }
                    } else if (var5.field1405 != null && (var5.field1398 -= arg4) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field1405.length);
                        class57 var12 = class57.method421(class12.field280, var5.field1405[var11], 0);
                        if (var12 != null) {
                            class87 var13 = var12.method418().method664(class80.field1819);
                            class4 var14 = class4.method47(var13, 100, var7);
                            var14.method16(0);
                            class29.field614.method895(var14);
                            var5.field1398 = (int) (Math.random() * (double) (var5.field1400 - var5.field1384)) + var5.field1384;
                            var5.field1390 = var14;
                        }
                    }
                }
            }
        }
        if (arg3 < 53) {
            method1149(57);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static final void method1152(int arg0) {
        field3467++;
        class34.field666.method200(-119);
        class28.field553.method200(-117);
        class116.field2715.method200(-99);
        if (arg0 != 503) {
            field3460 = 108L;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method1153(int arg0) {
        if (arg0 != 502) {
            method1151(35, 90, -95, 77, 72);
        }
        field3462++;
        if (client.field417 != 1) {
            return;
        }
        if (class142.field3392 >= 539 && class142.field3392 <= 573 && class118.field2758 >= 169 && class118.field2758 < 205 && class123.field2906[0] != -1) {
            class102.field2351 = 0;
            class24.field460 = true;
            class103.field2410 = true;
        }
        if (class142.field3392 >= 569 && class142.field3392 <= 599 && class118.field2758 >= 168 && class118.field2758 < 205 && class123.field2906[1] != -1) {
            class24.field460 = true;
            class103.field2410 = true;
            class102.field2351 = 1;
        }
        if (class142.field3392 >= 597 && class142.field3392 <= 627 && class118.field2758 >= 168 && class118.field2758 < 205 && class123.field2906[2] != -1) {
            class103.field2410 = true;
            class24.field460 = true;
            class102.field2351 = 2;
        }
        if (class142.field3392 >= 625 && class142.field3392 <= 669 && class118.field2758 >= 168 && class118.field2758 < 203 && class123.field2906[3] != -1) {
            class102.field2351 = 3;
            class24.field460 = true;
            class103.field2410 = true;
        }
        if (class142.field3392 >= 666 && class142.field3392 <= 696 && class118.field2758 >= 168 && class118.field2758 < 205 && class123.field2906[4] != -1) {
            class103.field2410 = true;
            class24.field460 = true;
            class102.field2351 = 4;
        }
        if (class142.field3392 >= 694 && class142.field3392 <= 724 && class118.field2758 >= 168 && class118.field2758 < 205 && class123.field2906[5] != -1) {
            class24.field460 = true;
            class103.field2410 = true;
            class102.field2351 = 5;
        }
        if (class142.field3392 >= 722 && class142.field3392 <= 756 && class118.field2758 >= 169 && class118.field2758 < 205 && class123.field2906[6] != -1) {
            class103.field2410 = true;
            class24.field460 = true;
            class102.field2351 = 6;
        }
        if (class142.field3392 >= 540 && class142.field3392 <= 574 && class118.field2758 >= 466 && class118.field2758 < 502 && class123.field2906[7] != -1) {
            class24.field460 = true;
            class102.field2351 = 7;
            class103.field2410 = true;
        }
        if (class142.field3392 >= 572 && class142.field3392 <= 602 && class118.field2758 >= 466 && class118.field2758 < 503 && class123.field2906[8] != -1) {
            class24.field460 = true;
            class103.field2410 = true;
            class102.field2351 = 8;
        }
        if (class142.field3392 >= 599 && class142.field3392 <= 629 && class118.field2758 >= 466 && class118.field2758 < 503 && class123.field2906[9] != -1) {
            class103.field2410 = true;
            class102.field2351 = 9;
            class24.field460 = true;
        }
        if (class142.field3392 >= 627 && class142.field3392 <= 671 && class118.field2758 >= 467 && class118.field2758 < 502 && class123.field2906[10] != -1) {
            class102.field2351 = 10;
            class103.field2410 = true;
            class24.field460 = true;
        }
        if (class142.field3392 >= 669 && class142.field3392 <= 699 && class118.field2758 >= 466 && class118.field2758 < 503 && class123.field2906[11] != -1) {
            class102.field2351 = 11;
            class24.field460 = true;
            class103.field2410 = true;
        }
        if (class142.field3392 >= 696 && class142.field3392 <= 726 && class118.field2758 >= 466 && class118.field2758 < 503 && class123.field2906[12] != -1) {
            class103.field2410 = true;
            class24.field460 = true;
            class102.field2351 = 12;
        }
        if (class142.field3392 >= 724 && class142.field3392 <= 758 && class118.field2758 >= 466 && class118.field2758 < 502 && class123.field2906[13] != -1) {
            class102.field2351 = 13;
            class103.field2410 = true;
            class24.field460 = true;
            return;
        }
    }
}
