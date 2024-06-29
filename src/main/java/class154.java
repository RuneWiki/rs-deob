import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class154 {

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2508 = "white:";

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
    public static boolean field2511 = true;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Z")
    public static boolean field2503 = false;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)V", line = 12)
    public static final void method1148(boolean arg0, int arg1) {
        class289.field4554 = arg0;
        field2506++;
        int var2 = 37 % ((-arg1 - 10) / 60);
        class161.field2611 = !class53.method450(2);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 34)
    public static final String method1149(byte arg0, Throwable arg1) throws IOException {
        field2504++;
        String var2;
        if ((arg1 instanceof class259)) {
            class259 var3 = (class259) arg1;
            arg1 = var3.field3849;
            var2 = var3.field3843 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != 105) {
            field2510 = -126;
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZIBIII)V", line = 111)
    public static final void method1150(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2507++;
        if (!arg1 && class211.field3316 == arg3 && client.field4119 == arg5 && class310.field4900 == arg0 || class53.method450(2)) {
            return;
        }
        client.field4119 = arg5;
        class211.field3316 = arg3;
        if (arg4 <= 95) {
            field2511 = false;
        }
        class310.field4900 = arg0;
        if (class53.method450(2)) {
            class310.field4900 = 0;
        }
        if (arg2) {
            class117.method921((byte) -127, 28);
        } else {
            class117.method921((byte) -7, 25);
        }
        class121.method968(class244.field3655, (byte) -103, true);
        int var8 = class117.field1902;
        int var9 = class133.field2118;
        class133.field2118 = arg5 * 8 - 48;
        class117.field1902 = arg3 * 8 - 48;
        class37.field556 = class255.method1767(class211.field3316 * 8, -1, client.field4119 * 8);
        int var10 = class117.field1902 - var8;
        int var11 = class117.field1902;
        int var12 = class133.field2118 - var9;
        int var13 = class133.field2118;
        class320.field5013 = null;
        if (arg2) {
            class83.field1290 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class86 var15 = class197.field3029[var14];
                if (var15 != null) {
                    var15.field4671 -= var10 * 128;
                    var15.field4672 -= var12 * 128;
                    if (var15.field4671 >= 0 && var15.field4671 <= 13184 && var15.field4672 >= 0 && var15.field4672 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field4643[var16] -= var10;
                            var15.field4619[var16] -= var12;
                        }
                        class76.field1192[class83.field1290++] = var14;
                    } else {
                        class197.field3029[var14].method682(32090, (class84) null);
                        class197.field3029[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class86 var18 = class197.field3029[var17];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; var19++) {
                        var18.field4643[var19] -= var10;
                        var18.field4619[var19] -= var12;
                    }
                    var18.field4672 -= var12 * 128;
                    var18.field4671 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class92 var21 = class74.field1140[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4643[var22] -= var10;
                    var21.field4619[var22] -= var12;
                }
                var21.field4671 -= var10 * 128;
                var21.field4672 -= var12 * 128;
            }
        }
        class75.field1153 = arg0;
        class345.field5363.method736(arg6, -2436, arg7, false);
        byte var23 = 0;
        byte var24 = 1;
        byte var25 = 104;
        byte var26 = 0;
        byte var27 = 104;
        if (var10 < 0) {
            var25 = -1;
            var24 = -1;
            var26 = 103;
        }
        byte var28 = 1;
        if (var12 < 0) {
            var28 = -1;
            var27 = -1;
            var23 = 103;
        }
        for (int var29 = var26; var29 != var25; var29 += var24) {
            for (int var30 = var23; var30 != var27; var30 += var28) {
                int var31 = var12 + var30;
                int var32 = var10 + var29;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class316.field4985[var33][var29][var30] = class316.field4985[var33][var32][var31];
                    } else {
                        class316.field4985[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class43 var34 = (class43) class181.field2876.method268(-1); var34 != null; var34 = (class43) class181.field2876.method278(1)) {
            var34.field686 -= var10;
            var34.field688 -= var12;
            if (var34.field686 < 0 || var34.field688 < 0 || var34.field686 >= 104 || var34.field688 >= 104) {
                var34.method489(false);
            }
        }
        if (arg2) {
            class176.field2812 -= var10;
            class137.field2239 -= var12 * 128;
            field2510 -= var12;
            class152.field2498 -= var10 * 128;
            class20.field367 -= var10;
            class3.field80 -= var12;
        } else {
            class73.field1112 = 1;
        }
        class113.field1828 = 0;
        if (class57.field862 != 0) {
            class57.field862 -= var10;
            class169.field2723 -= var12;
        }
        if (class162.field2623 && arg2 && (Math.abs(var10) > 104 || Math.abs(var12) > 104)) {
            class64.method511(false);
        }
        class122.field1987 = -1;
        class143.field2320.method266(-20840);
        class242.field3627.method266(-20840);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 357)
    public static void method1151(byte arg0) {
        field2508 = null;
        if (arg0 < 126) {
            method1150(75, false, false, 54, (byte) -6, -87, 64, 119);
        }
    }
}
