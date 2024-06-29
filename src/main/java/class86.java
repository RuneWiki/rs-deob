import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class86 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
    private boolean field1439 = false;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
    private boolean field1457 = false;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "Z")
    public static boolean field1460 = false;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field1472 = -1;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "Lth;")
    public static class57 field1465;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Z")
    public static boolean field1480;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
    public static boolean field1481;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Z")
    public static boolean field1482;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[[B")
    public static byte[][] field1462;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIBII)V", line = 4)
    public final void method681(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1464++;
        try {
            if (class32.field463 != null) {
                class315.field5027++;
                if (class315.field5027 >= 3) {
                    this.method682("alreadyloaded", 25806);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class32.field463 = this;
            class190.field3048 = 0;
            class209.field3299 = arg4;
            class252.field4266 = arg3;
            class129.field2188 = arg3;
            class298.field4779 = arg1;
            class117.field1969 = arg1;
            if (arg2 < 113) {
                field1458 = 68;
            }
            class313.field4976 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class16.field184 = true;
            } else {
                class16.field184 = false;
            }
            if (class128.field2163 == null) {
                class304.field4866 = class128.field2163 = new class145(this, arg0, (String) null, 0);
            }
            class192 var7 = class128.field2163.method1114((byte) 97, 1, this);
            while (var7.field3064 == 0) {
                class283.method2076((byte) -121, 10L);
            }
            class35.field511 = (Thread) var7.field3066;
        } catch (Exception var9) {
            class285.method2079(var9, (byte) -16, (String) null);
            this.method682("crash", 25806);
        }
    }

    @OriginalMember(owner = "client!hh", name = "run", descriptor = "()V", line = 59)
    public final void run() {
        field1454++;
        try {
            if (class145.field2349 != null) {
                String var1 = class145.field2349.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class145.field2347;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method682("wrongjava", 25806);
                        return;
                    }
                    class63.field1130 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class145.field2347 == null || class145.field2347.equals("1.4.2"))) {
                    this.method682("wrongjava", 25806);
                    return;
                }
            }
            if (class145.field2347 != null && class145.field2347.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class145.field2347.length()) {
                    char var5 = class145.field2347.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
                if (var4 >= 5) {
                    class143.field2335 = true;
                }
            }
            if (class128.field2163.field2350 != null) {
                Method var6 = class145.field2363;
                if (var6 != null) {
                    try {
                        var6.invoke(class128.field2163.field2350, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class321.method2268(-121);
            this.method686((byte) -113);
            class292.field4728 = class235.method1809(class298.field4779, class252.field4266, class151.field2402, (byte) -106);
            this.method351(115);
            class336.field5311 = class166.method1288((byte) -50);
            this.method689(126);
            while (class307.field4905 == 0L || class307.field4905 > class47.method371(-73)) {
                class339.field5409 = class336.field5311.method36(class285.field4643, class63.field1130, (byte) 73);
                for (int var8 = 0; var8 < class339.field5409; var8++) {
                    this.method695(25973);
                }
                this.method684(31);
                class264.method2011(class128.field2163, 0, class151.field2402);
            }
        } catch (Exception var11) {
            class285.method2079(var11, (byte) -16, (String) null);
            this.method682("crash", 25806);
        }
        this.method696(true, 0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 169)
    public final void method682(String arg0, int arg1) {
        if (arg1 != 25806) {
            this.method682((String) null, -31);
        }
        field1445++;
        if (this.field1457) {
            return;
        }
        this.field1457 = true;
        System.out.println("error_game_" + arg0);
        try {
            class88.method702(class128.field2163.field2350, "loggedout", (byte) 121);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([[F[[I[[I[[B[[[B[[B[[I[[F[[B[[BI[[[I[[F[[I[[II)[Lua;", line = 194)
    public static final class299[] method683(float[][] arg0, int[][] arg1, int[][] arg2, byte[][] arg3, byte[][][] arg4, byte[][] arg5, int[][] arg6, float[][] arg7, byte[][] arg8, byte[][] arg9, int arg10, int[][][] arg11, float[][] arg12, int[][] arg13, int[][] arg14, int arg15) {
        field1473++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg11 != null) {
                    int var20 = arg11[arg15][var17 >> 3][var18 >> 3];
                    var19 = (var20 & 0x7) >> 1;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg9[var17][var18];
                    if (var22 == 0) {
                        var22 = arg9[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg9[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg9[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg9[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg9[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17][var18];
                    }
                } else {
                    var22 = arg9[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg9[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg9[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class279 var23 = class273.method2045(1, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field4582 + 1 << 16) + var23.field4591;
                }
            }
        }
        class164 var24 = new class164(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg9[var25][var26] != 0) {
                    int[] var27;
                    if (arg8[var25][var26] == 0) {
                        var27 = class21.field242[0];
                    } else {
                        var27 = class111.field1812[arg3[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = 0;
                    if (arg6 != null) {
                        var28 = arg6[var25][var26] & 0xFFFFFF;
                    }
                    int var29 = var16[var25 + 1][var26];
                    int var30 = var16[var25 + 1][var26 + 1];
                    int var31 = var16[var25][var26 + 1];
                    long var32 = (long) var28 | (long) var29 << 32;
                    long var34 = (long) var30 << 32 | (long) var28;
                    long var36 = (long) var28 | (long) var31 << 32;
                    int var38 = var16[var25][var26];
                    long var39 = (long) var28 | (long) var38 << 32;
                    int var41 = var27.length / 2;
                    class299 var42 = (class299) var24.method1268(118, var39);
                    if (var42 == null) {
                        var42 = new class299((var38 >> 16) - 1, (float) (var38 & 0xFFFF), false, arg2 != null, var28);
                        var24.method1273(arg10 ^ 0x48C9, var39, var42);
                    }
                    var42.field4815++;
                    var42.field4804 += var41;
                    if (var32 != var39) {
                        class299 var43 = (class299) var24.method1268(115, var32);
                        if (var43 == null) {
                            var43 = new class299((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg2 != null, var28);
                            var24.method1273(1, var32, var43);
                        }
                        var43.field4804 += var41;
                        var43.field4815++;
                    }
                    if (var34 != var39 && var32 != var34) {
                        class299 var44 = (class299) var24.method1268(-46, var34);
                        if (var44 == null) {
                            var44 = new class299((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg2 != null, var28);
                            var24.method1273(1, var34, var44);
                        }
                        var44.field4815++;
                        var44.field4804 += var41;
                    }
                    if (var36 != var39 && var32 != var36 && var34 != var36) {
                        class299 var45 = (class299) var24.method1268(-105, var36);
                        if (var45 == null) {
                            var45 = new class299((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg2 != null, var28);
                            var24.method1273(arg10 - 18631, var36, var45);
                        }
                        var45.field4815++;
                        var45.field4804 += var41;
                    }
                }
            }
        }
        for (class299 var46 = (class299) var24.method1265(arg10 - 18589); var46 != null; var46 = (class299) var24.method1277((byte) -106)) {
            var46.method2137();
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg9[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg4[arg15][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg4[1][var47][var48] & 0x2) == 2 && arg15 > 0) {
                        var50 = arg15 - 1;
                    } else {
                        var50 = arg15;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    if (arg6 != null) {
                        var52 = arg6[var47][var48] >>> 24 << 3;
                        var51 = arg6[var47][var48] & 0xFFFFFF;
                    }
                    boolean[] var53 = null;
                    int[] var54;
                    byte var55;
                    if (arg8[var47][var48] == 0) {
                        var54 = class21.field242[0];
                        byte var56 = 0;
                        int var57 = var56 + (arg9[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        byte var58 = 0;
                        byte var59 = 0;
                        int var60 = var58 + (arg9[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg9[var47][var48 - 1] == var49) {
                            var57++;
                            var60++;
                        } else {
                            var57--;
                            var60--;
                        }
                        int var61 = var59 + (arg9[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg9[var47 + 1][var48] == var49) {
                            var57++;
                            var61++;
                        } else {
                            var57--;
                            var61--;
                        }
                        byte var62 = 0;
                        int var63 = var62 + (arg9[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg9[var47][var48 + 1] == var49) {
                            var63++;
                            var61++;
                        } else {
                            var61--;
                            var63--;
                        }
                        if (arg9[var47 - 1][var48] == var49) {
                            var63++;
                            var60++;
                        } else {
                            var60--;
                            var63--;
                        }
                        int var64 = var57 - var63;
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        int var65 = var60 - var61;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        var55 = (byte) (var64 > var65 ? 1 : 0);
                        arg5[var47][var48] = var55;
                    } else {
                        var54 = class111.field1812[arg3[var47][var48]];
                        var55 = arg5[var47][var48];
                        var53 = class25.field313[arg3[var47][var48]];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48 + 1];
                    int var68 = var16[var47 + 1][var48];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var51 | (long) var66 << 32;
                    long var72 = (long) var67 << 32 | (long) var51;
                    long var74 = (long) var69 << 32 | (long) var51;
                    long var76 = (long) var68 << 32 | (long) var51;
                    int var78 = arg13[var47][var48];
                    int var79 = arg13[var47 + 1][var48 + 1];
                    int var80 = arg13[var47 + 1][var48];
                    int var81 = arg14[var47][var48];
                    int var82 = arg14[var47 + 1][var48];
                    int var83 = arg13[var47][var48 + 1];
                    int var84 = arg14[var47 + 1][var48 + 1];
                    int var85 = arg14[var47][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var68 >> 16) - 1;
                    int var88 = (var69 >> 16) - 1;
                    int var89 = (var67 >> 16) - 1;
                    class299 var90 = (class299) var24.method1268(127, var70);
                    class56.method439(var52, var66 <= var68, arg2, arg0, arg12, arg7, var50, arg1, (byte) -76, class65.method565(var80, var86, var82, 0), var66 >= var66, var48, var47, class65.method565(var78, var86, var81, arg10 ^ 0x48C8), var90, var69 >= var66, class65.method565(var79, var86, var84, 0), var53, var55, var54, var67 >= var66, class65.method565(var83, var86, var85, 0));
                    if (var70 != var76) {
                        class299 var91 = (class299) var24.method1268(-101, var76);
                        class56.method439(var52, var68 >= var68, arg2, arg0, arg12, arg7, var50, arg1, (byte) -76, class65.method565(var80, var87, var82, 0), var66 >= var68, var48, var47, class65.method565(var78, var87, var81, 0), var91, var69 >= var68, class65.method565(var79, var87, var84, 0), var53, var55, var54, var67 >= var68, class65.method565(var83, var87, var85, 0));
                    }
                    if (var70 != var72 && var72 != var76) {
                        class299 var92 = (class299) var24.method1268(-9, var72);
                        class56.method439(var52, var67 <= var68, arg2, arg0, arg12, arg7, var50, arg1, (byte) -76, class65.method565(var80, var89, var82, 0), var66 >= var67, var48, var47, class65.method565(var78, var89, var81, 0), var92, var69 >= var67, class65.method565(var79, var89, var84, arg10 ^ 0x48C8), var53, var55, var54, var67 <= var67, class65.method565(var83, var89, var85, 0));
                    }
                    if (var70 != var74 && var74 != var76 && var72 != var74) {
                        class299 var93 = (class299) var24.method1268(118, var74);
                        class56.method439(var52, var68 >= var69, arg2, arg0, arg12, arg7, var50, arg1, (byte) -76, class65.method565(var80, var88, var82, 0), var66 >= var69, var48, var47, class65.method565(var78, var88, var81, 0), var93, var69 >= var69, class65.method565(var79, var88, var84, 0), var53, var55, var54, var67 >= var69, class65.method565(var83, var88, var85, 0));
                    }
                }
            }
        }
        for (class299 var94 = (class299) var24.method1265(96); var94 != null; var94 = (class299) var24.method1277((byte) -107)) {
            if (var94.field4793 == 0) {
                var94.method330(arg10 - 18617);
            } else {
                var94.method2138();
            }
        }
        if (arg10 != 18632) {
            field1472 = 127;
        }
        int var95 = var24.method1274((byte) 126);
        long[] var96 = new long[var95];
        class299[] var97 = new class299[var95];
        var24.method1269(-16, var97);
        for (int var98 = 0; var98 < var95; var98++) {
            var96[var98] = var97[var98].field698;
        }
        class70.method597(var97, var96, -537);
        return var97;
    }

    @OriginalMember(owner = "client!hh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 659)
    public final URL getDocumentBase() {
        field1443++;
        if (class241.field3994 == null) {
            return class128.field2163 == null || class128.field2163.field2350 == this ? super.getDocumentBase() : class128.field2163.field2350.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 676)
    private final void method684(int arg0) {
        field1451++;
        long var2 = class47.method371(58);
        long var4 = class194.field3098[class25.field307];
        class194.field3098[class25.field307] = var2;
        class25.field307 = arg0 & class25.field307 + 1;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class141.field2308 = ((var6 >> 1) + 32000) / var6;
        }
        if ((class116.field1945++) > 50) {
            class257.field4313 = true;
            class116.field1945 -= 50;
            class151.field2402.setSize(class298.field4779, class252.field4266);
            class151.field2402.setVisible(true);
            if (class241.field3994 != null && class89.field1502 == null) {
                Insets var7 = class241.field3994.getInsets();
                class151.field2402.setLocation(class313.field4976 + var7.left, class190.field3048 + var7.top);
            } else {
                class151.field2402.setLocation(class313.field4976, class190.field3048);
            }
        }
        this.method354(true);
    }

    @OriginalMember(owner = "client!hh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 719)
    public final AppletContext getAppletContext() {
        field1467++;
        if (class241.field3994 == null) {
            return class128.field2163 == null || class128.field2163.field2350 == this ? super.getAppletContext() : class128.field2163.field2350.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 734)
    public final void windowActivated(WindowEvent arg0) {
        field1461++;
    }

    @OriginalMember(owner = "client!hh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 745)
    public final void windowIconified(WindowEvent arg0) {
        field1475++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILqm;)V", line = 758)
    public static final void method685(int arg0, class227 arg1) {
        field1474++;
        int var2 = arg1.method1708((byte) 103);
        class135.field2258 = new class27[var2];
        if (arg0 <= 125) {
            method683((float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (byte[][][]) ((byte[][][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), -66, (int[][][]) ((int[][][]) null), (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), -94);
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class135.field2258[var3] = new class27();
            class135.field2258[var3].field322 = arg1.method1708((byte) 103);
            class135.field2258[var3].field325 = arg1.method1747((byte) 18);
        }
        class209.field3300 = arg1.method1708((byte) 103);
        class172.field2756 = arg1.method1708((byte) 103);
        class189.field3042 = arg1.method1708((byte) 103);
        class335.field5304 = new class201[class172.field2756 + 1 - class209.field3300];
        for (int var4 = 0; var4 < class189.field3042; var4++) {
            int var5 = arg1.method1708((byte) 103);
            class201 var6 = class335.field5304[var5] = new class201();
            var6.field2847 = arg1.method1720((byte) -121);
            var6.field2839 = arg1.method1715((byte) 70);
            var6.field3205 = class209.field3300 + var5;
            var6.field3196 = arg1.method1747((byte) 18);
            var6.field3209 = arg1.method1747((byte) 18);
        }
        class243.field3997 = arg1.method1715((byte) -107);
        class56.field919 = true;
    }

    @OriginalMember(owner = "client!hh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 805)
    public final void windowDeiconified(WindowEvent arg0) {
        field1442++;
    }

    @OriginalMember(owner = "client!hh", name = "stop", descriptor = "()V", line = 817)
    public final void stop() {
        field1463++;
        if (class32.field463 == this && !class255.field4295) {
            class307.field4905 = class47.method371(63) + 4000L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 829)
    public final synchronized void method686(byte arg0) {
        if (class151.field2402 != null) {
            class151.field2402.removeFocusListener(this);
            class151.field2402.getParent().remove(class151.field2402);
        }
        Container var2;
        if (class89.field1502 != null) {
            var2 = class89.field1502;
        } else if (class241.field3994 == null) {
            var2 = class128.field2163.field2350;
        } else {
            var2 = class241.field3994;
        }
        var2.setLayout((LayoutManager) null);
        if (arg0 != -113) {
            return;
        }
        field1478++;
        class151.field2402 = new class173(this);
        var2.add(class151.field2402);
        class151.field2402.setSize(class298.field4779, class252.field4266);
        class151.field2402.setVisible(true);
        if (class241.field3994 == var2) {
            Insets var3 = class241.field3994.getInsets();
            class151.field2402.setLocation(class313.field4976 + var3.left, class190.field3048 + var3.top);
        } else {
            class151.field2402.setLocation(class313.field4976, class190.field3048);
        }
        class151.field2402.addFocusListener(this);
        class151.field2402.requestFocus();
        class25.field312 = true;
        class257.field4313 = true;
        class59.field1020 = true;
        class64.field1135 = false;
        class264.field4428 = class47.method371(112);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z", line = 877)
    public final boolean method687(byte arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1470++;
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else if (arg0 > -20) {
                return true;
            } else {
                this.method682("invalidhost", 25806);
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "providesignlink", descriptor = "(Lna;)V", line = 915)
    public static final void providesignlink(class145 arg0) {
        field1452++;
        class128.field2163 = arg0;
        class304.field4866 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 923)
    public final void windowClosed(WindowEvent arg0) {
        field1455++;
    }

    @OriginalMember(owner = "client!hh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 946)
    public final synchronized void paint(Graphics arg0) {
        field1448++;
        if (class32.field463 != this || class255.field4295) {
            return;
        }
        class257.field4313 = true;
        if (class143.field2335 && !class42.field607 && class47.method371(-115) - class264.field4428 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class117.field1969 && var2.height >= class129.field2188) {
                class64.field1135 = true;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 969)
    public static void method688(byte arg0) {
        field1465 = null;
        field1462 = (byte[][]) null;
        int var1 = 22 % ((-arg0 - 60) / 36);
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 979)
    public final void method689(int arg0) {
        field1468++;
        if (!this.field1439) {
            try {
                class192 var2 = class128.field2163.method1127(class32.field463.getClass(), (byte) 124);
                while (var2.field3064 == 0) {
                    class283.method2076((byte) 110, 100L);
                }
                if (var2.field3066 != null) {
                    throw (Throwable) var2.field3066;
                }
                jagmisc.init();
                this.field1439 = true;
                class336.field5311 = class166.method1288((byte) -50);
            } catch (Throwable var5) {
            }
        }
        int var4 = -29 / ((76 - arg0) / 49);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 1009)
    public static final void method690(boolean arg0) {
        field1441++;
        if (arg0) {
            field1465 = (class57) null;
        }
        class156.field2470 = null;
        class20.method118(class298.field4779, (byte) 100, -1, 0, 0, 0, class252.field4266, 0, class304.field4870);
        if (class156.field2470 != null) {
            class104.method800(class252.field4266, -29153, class98.field1610, -1412584499, class156.field2470, class176.field2828.field4165, class298.field4779, 0, 0, class75.field1282);
            class156.field2470 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "start", descriptor = "()V", line = 1027)
    public final void start() {
        field1449++;
        if (class32.field463 == this && !class255.field4295) {
            class307.field4905 = 0L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lei;", line = 1045)
    public static final class261 method691(int arg0, int arg1) {
        field1447++;
        class261 var2 = (class261) class169.field2691.method2329((byte) 107, (long) arg1);
        if (arg0 >= -39) {
            field1465 = (class57) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class322.field5123.method472(arg1, 110, 34);
        class261 var4 = new class261();
        if (var3 != null) {
            var4.method1990(new class227(var3), (byte) 85, arg1);
        }
        class169.field2691.method2333((long) arg1, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "destroy", descriptor = "()V", line = 1069)
    public final void destroy() {
        field1438++;
        if (class32.field463 == this && !class255.field4295) {
            class307.field4905 = class47.method371(103);
            class283.method2076((byte) -116, 5000L);
            class304.field4866 = null;
            this.method696(false, 0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZILjava/lang/String;IIII)V", line = 1084)
    public final void method692(int arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            class209.field3299 = arg2;
            class252.field4266 = arg6;
            class129.field2188 = arg6;
            class190.field3048 = 0;
            class313.field4976 = 0;
            class298.field4779 = arg0;
            class117.field1969 = arg0;
            class32.field463 = this;
            class241.field3994 = new Frame();
            class241.field3994.setTitle("Jagex");
            class241.field3994.setResizable(true);
            class241.field3994.addWindowListener(this);
            class241.field3994.setVisible(true);
            class241.field3994.toFront();
            Insets var9 = class241.field3994.getInsets();
            class241.field3994.setSize(var9.left + var9.right + class117.field1969, var9.top + var9.bottom + class129.field2188);
            class304.field4866 = class128.field2163 = new class145((Applet) null, arg5, arg3, arg4);
            class192 var10 = class128.field2163.method1114((byte) 97, arg7, this);
            while (var10.field3064 == 0) {
                class283.method2076((byte) -111, 10L);
            }
            class35.field511 = (Thread) var10.field3066;
        } catch (Exception var12) {
            class285.method2079(var12, (byte) -16, (String) null);
        }
        field1446++;
    }

    @OriginalMember(owner = "client!hh", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1123)
    public final URL getCodeBase() {
        field1476++;
        if (class241.field3994 == null) {
            return class128.field2163 == null || class128.field2163.field2350 == this ? super.getCodeBase() : class128.field2163.field2350.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1141)
    public final void windowDeactivated(WindowEvent arg0) {
        field1450++;
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V", line = 1148)
    public static final void method693(int arg0) {
        field1456++;
        for (class259 var1 = (class259) class226.field3723.method1265(117); var1 != null; var1 = (class259) class226.field3723.method1277((byte) -119)) {
            int var2 = var1.field4358;
            if (class278.method2058(var2, (byte) 4)) {
                boolean var3 = true;
                class250[] var4 = class163.field2587[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4205;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field698;
                    class250 var7 = class13.method74(-20, var6);
                    if (var7 != null) {
                        class205.method1568(var7, (byte) 119);
                    }
                }
            }
        }
        if (arg0 >= -56) {
            field1458 = 21;
        }
    }

    @OriginalMember(owner = "client!hh", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1206)
    public final void update(Graphics arg0) {
        field1471++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!hh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1214)
    public final void focusGained(FocusEvent arg0) {
        class25.field312 = true;
        class257.field4313 = true;
        field1440++;
    }

    @OriginalMember(owner = "client!hh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1224)
    public final void windowClosing(WindowEvent arg0) {
        field1459++;
        this.destroy();
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V", line = 1232)
    public static final void method694(int arg0) {
        field1477++;
        if (arg0 != -26054) {
            field1458 = -89;
        }
        class77.field1342.method2326(-4);
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V", line = 1249)
    private final void method695(int arg0) {
        field1469++;
        if (arg0 != 25973) {
            return;
        }
        long var2 = class173.field2764[class354.field5625];
        long var4 = class47.method371(arg0 - 26100);
        if (var2 != 0L && var4 <= var2) {
        }
        class173.field2764[class354.field5625] = var4;
        class354.field5625 = class354.field5625 + 1 & 0x1F;
        synchronized (this) {
            class59.field1020 = class25.field312;
        }
        this.method365(17189);
    }

    @OriginalMember(owner = "client!hh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1282)
    public final String getParameter(String arg0) {
        field1466++;
        if (class241.field3994 == null) {
            return class128.field2163 == null || class128.field2163.field2350 == this ? super.getParameter(arg0) : class128.field2163.field2350.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1297)
    public final void windowOpened(WindowEvent arg0) {
        field1453++;
    }

    @OriginalMember(owner = "client!hh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1304)
    public final void focusLost(FocusEvent arg0) {
        field1479++;
        class25.field312 = false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V", line = 1312)
    private final void method696(boolean arg0, int arg1) {
        field1444++;
        synchronized (this) {
            if (class255.field4295) {
                return;
            }
            class255.field4295 = true;
        }
        if (class128.field2163.field2350 != null) {
            class128.field2163.field2350.destroy();
        }
        try {
            this.method357(true);
        } catch (Exception var14) {
        }
        if (this.field1439) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field1439 = false;
        }
        class128.field2163.method1135((byte) 122, class32.field463.getClass());
        if (class151.field2402 != null) {
            try {
                class151.field2402.removeFocusListener(this);
                class151.field2402.getParent().remove(class151.field2402);
            } catch (Exception var12) {
            }
        }
        if (class128.field2163 != null) {
            try {
                class128.field2163.method1130(arg1);
            } catch (Exception var11) {
            }
        }
        this.method345(1);
        if (class241.field3994 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        if (arg1 != 0) {
            field1460 = false;
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public abstract void method365(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public abstract void method357(boolean arg0);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public abstract void method345(int arg0);

    @OriginalMember(owner = "client!hh", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public abstract void method351(int arg0);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)V")
    public abstract void method354(boolean arg0);
}
