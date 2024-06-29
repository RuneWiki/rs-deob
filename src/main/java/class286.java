import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class286 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field4957 = -1;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field4963 = 0;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lke;")
    public static class256 field4958 = class316.method2202("<img=1>", 27626);

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lke;")
    public static class256 field4966 = class316.method2202("::clientjs5drop", 27626);

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lke;")
    public static class256 field4967 = class316.method2202("Liste der Welten geladen", 27626);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lgd;")
    public class137 field4962;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
    public int[] field4964;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[Lke;")
    public class256[] field4961;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 5)
    public static void method2000(int arg0) {
        if (arg0 == 0) {
            field4967 = null;
            field4958 = null;
            field4966 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIILrb;)V", line = 25)
    public static final void method2001(int arg0, int arg1, int arg2, class144 arg3) {
        field4965++;
        if ((arg2 & 0x1) != 0) {
            int var4 = class23.field302.method346(-16);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class23.field302.method336(255);
            class164.method1207(var5, -25800, var4, arg3);
        }
        if ((arg2 & 0x4) != 0) {
            int var6 = class23.field302.method354((byte) -128);
            int var7 = class23.field302.method357(false);
            arg3.method513(var7, class45.field840, true, var6);
            arg3.field1225 = class45.field840 + 300;
            arg3.field1203 = class23.field302.method336(255);
        }
        if ((arg2 & 0x100) != 0) {
            int var8 = class23.field302.method362((byte) 47);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class23.field302.method331(0);
            boolean var10 = true;
            if (var8 != -1 && arg3.field1253 != -1 && class250.method1682(class302.method2113(true, var8).field3688, true).field2048 < class250.method1682(class302.method2113(true, arg3.field1253).field3688, true).field2048) {
                var10 = false;
            }
            if (var10) {
                arg3.field1185 = (var9 & 0xFFFF) + class45.field840;
                arg3.field1253 = var8;
                arg3.field1221 = var9 >> 16;
                arg3.field1224 = 0;
                arg3.field1201 = 0;
                if (class45.field840 < arg3.field1185) {
                    arg3.field1201 = -1;
                }
                if (arg3.field1253 != -1 && class45.field840 == arg3.field1185) {
                    int var11 = class302.method2113(true, arg3.field1253).field3688;
                    if (var11 != -1) {
                        class117 var12 = class250.method1682(var11, true);
                        if (var12 != null && var12.field2040 != null) {
                            class49.method391(arg3.field1192, class121.field2124 == arg3, arg3.field1197, 0, var12, -11067);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field1193 = class23.field302.method313((byte) 54);
            if (arg3.field1193.method1786(-751, 0) == 126) {
                arg3.field1193 = arg3.field1193.method1788(25610, 1);
                class274.method1895(2, 22156, arg3.method1053((byte) -97), arg3.field1193);
            } else if (class121.field2124 == arg3) {
                class274.method1895(2, 22156, arg3.method1053((byte) -93), arg3.field1193);
            }
            arg3.field1209 = 0;
            arg3.field1242 = 150;
            arg3.field1183 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            int var13 = class23.field302.method362((byte) 47);
            int var14 = class23.field302.method357(false);
            int var15 = class23.field302.method336(255);
            boolean var16 = (var13 & 0x8000) != 0;
            int var17 = class23.field302.field738;
            if (arg3.field2532 != null && arg3.field2552 != null) {
                long var18 = arg3.field2532.method1780(true);
                boolean var20 = false;
                if (var14 <= 1) {
                    if (var16 || (!class36.field649 || class316.field5454) && !class154.field2759) {
                        for (int var21 = 0; var21 < class129.field2263; var21++) {
                            if (class62.field1090[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    } else {
                        var20 = true;
                    }
                }
                if (!var20 && class130.field2276 == 0) {
                    class54.field999.field738 = 0;
                    class23.field302.method353(var15, class54.field999.field772, true, 0);
                    class54.field999.field738 = 0;
                    int var22 = -1;
                    class256 var23;
                    if (var16) {
                        var13 &= 0x7FFF;
                        class200 var24 = class183.method1338(true, class54.field999);
                        var22 = var24.field3646;
                        var23 = var24.field3650.method108(-1, class54.field999);
                    } else {
                        var23 = class293.method2047(class86.method631(class54.field999, -74).method1805(true));
                    }
                    arg3.field1193 = var23.method1768(false);
                    arg3.field1183 = var13 >> 8;
                    arg3.field1209 = var13 & 0xFF;
                    arg3.field1242 = 150;
                    if (var14 == 2) {
                        class28.method206(var16 ? 17 : 1, (class256) null, class30.method214(new class256[] { field4958, arg3.method1053((byte) -116) }, 29784), var22, (byte) -84, var23);
                    } else if (var14 == 1) {
                        class28.method206(var16 ? 17 : 1, (class256) null, class30.method214(new class256[] { class23.field313, arg3.method1053((byte) -115) }, 29784), var22, (byte) -84, var23);
                    } else {
                        class28.method206(var16 ? 17 : 2, (class256) null, arg3.method1053((byte) -92), var22, (byte) -84, var23);
                    }
                }
            }
            class23.field302.field738 = var17 + var15;
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field1233 = class23.field302.method310((byte) -73);
            if (arg3.field1233 == 65535) {
                arg3.field1233 = -1;
            }
        }
        if ((arg2 & 0x20) != 0) {
            int var25 = class23.field302.method332(255);
            byte[] var26 = new byte[var25];
            class41 var27 = new class41(var26);
            class23.field302.method353(var25, var26, true, 0);
            class213.field3812[arg0] = var27;
            arg3.method1056(var27, -95);
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field1247 = class23.field302.method314(true);
            arg3.field1222 = class23.field302.method346(-16);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field1217 = class23.field302.method332(255);
            arg3.field1200 = class23.field302.method332(255);
            arg3.field1237 = class23.field302.method332(255);
            arg3.field1207 = class23.field302.method357(false);
            arg3.field1212 = class23.field302.method310((byte) 103) + class45.field840;
            arg3.field1216 = class23.field302.method310((byte) -50) + class45.field840;
            arg3.field1252 = class23.field302.method315(-77);
            arg3.field1219 = 0;
            arg3.field1239 = 1;
        }
        if ((arg2 & 0x400) != 0) {
            int var28 = class23.field302.method354((byte) -128);
            int var29 = class23.field302.method315(-69);
            arg3.method513(var29, class45.field840, true, var28);
        }
        if (arg1 > -107) {
            field4967 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 272)
    public static final String method2002(Throwable arg0, int arg1) throws IOException {
        field4959++;
        String var3;
        if (arg0 instanceof class303) {
            class303 var2 = (class303) arg0;
            var3 = var2.field5234 + " | ";
            arg0 = var2.field5235;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1 <= 116) {
            return (String) null;
        }
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 348)
    public static final void method2003(int arg0) {
        if (class134.field2335 != null) {
            class134.field2335.method1404((byte) -40);
        }
        if (arg0 != 65535) {
            return;
        }
        if (class114.field2011 != null) {
            class114.field2011.method1404((byte) -40);
        }
        class54.method435(2, 22050, -22929, class171.field3050);
        field4960++;
        class134.field2335 = class51.method406(22050, class272.field4658, class186.field3271, -25535, 0);
        class134.field2335.method1417(class168.field2988, arg0 - 65506);
        class114.field2011 = class51.method406(2048, class272.field4658, class186.field3271, arg0 - 91070, 1);
        class114.field2011.method1417(class197.field3603, 34);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z", line = 373)
    public static final boolean method2004(int arg0, int arg1, int arg2, int arg3) {
        if (class233.method1582(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class101.method732(var4 + 1, class118.field2090[arg0][arg1][arg2] + arg3, var5 + 1) && class101.method732(var4 + 128 - 1, class118.field2090[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class101.method732(var4 + 128 - 1, class118.field2090[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class101.method732(var4 + 1, class118.field2090[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
