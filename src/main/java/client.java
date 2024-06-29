import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class256 {

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2869;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field2870;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field2871;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1268(int arg0) {
        int var1 = class144.field1908;
        int[] var2 = class521.field7674;
        int var3 = class218.field3156 ? var1 : class434.field6110 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class228 var5;
            if (var4 < var1) {
                var5 = class378.field5355[var2[var4]];
            } else {
                var5 = ((class378) class125.field1687.method2405((long) class488.field6834[var4 - var1], -62)).field5353;
            }
            if (var5.field1904 == arg0) {
                var5.field3331 = 0;
                if (var5.field3294 < 0) {
                    var5.field3354 = false;
                } else {
                    int var6 = var5.method125((byte) -94);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1896 & 0x7F) != 0 || (var5.field1899 & 0x7F) != 0) {
                            var5.field3354 = false;
                            continue;
                        }
                    } else if ((var5.field1896 & 0x7F) != 64 || (var5.field1899 & 0x7F) != 64) {
                        var5.field3354 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1896 >> 7;
                        int var8 = var5.field1899 >> 7;
                        if (class255.field3779[var7][var8] != var5.field3294) {
                            var5.field3354 = true;
                            continue;
                        }
                        if (class508.field7507[var7][var8] > 1) {
                            var10002 = class508.field7507[var7][var8]--;
                            var5.field3354 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1896 - var9 >> 7;
                        int var11 = var5.field1899 - var9 >> 7;
                        int var12 = var5.field1896 + var9 >> 7;
                        int var13 = var5.field1899 + var9 >> 7;
                        if (!class219.method1359(var10, var13, var11, var12, -2, var5.field3294)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class255.field3779[var14][var15] == var5.field3294) {
                                        var10002 = class508.field7507[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3354 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class22 && var5.field3371 != null && class390.field5481 >= var5.field3371.field3225 && class390.field5481 < var5.field3371.field3226) {
                        ((class22) var5).field245 = false;
                    }
                    var5.field3354 = false;
                    var5.field1912 = class488.method2817(var5.field1896, true, var5.field1899, var5.field1904);
                    class120.method806(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Ljava/lang/String;")
    public final String method1269(byte arg0) {
        field2851++;
        String var2 = null;
        try {
            var2 = "[1)" + class441.field6171 + "," + class367.field5241 + "," + class43.field494 + "," + class500.field7068 + "|";
            if (class246.field3587 != null) {
                var2 = var2 + "2)" + class320.field4627 + "," + (class246.field3587.field3368[0] + class441.field6171) + "," + (class246.field3587.field3378[0] + class367.field5241) + "|";
            }
            var2 = var2 + "3)" + class405.field5737 + "|4)" + class4.field81.field1413 + "|5)" + class334.method1996((byte) 123) + "|6)" + class147.field1956 + "," + class273.field4048 + "|";
            var2 = var2 + "7)" + class4.field81.method728(false, class405.field5737) + "|";
            var2 = var2 + "8)" + class4.field81.method726(class405.field5737, 126) + "|";
            if (arg0 != 19) {
                return null;
            }
            var2 = var2 + "9)" + class4.field81.field1428 + "|";
            var2 = var2 + "10)" + class4.field81.field1412 + "|";
            var2 = var2 + "11)" + class4.field81.field1416 + "|";
            var2 = var2 + "12)" + class4.field81.method1791(-2, class405.field5737) + "|";
            var2 = var2 + "13)" + class494.field6991 + "|";
            var2 = var2 + "14)" + class488.field6832;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class405.field5737 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field2870 == null ? (field2870 = method1296("client")) : field2870).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
    private final void method1270(byte[] arg0, byte arg1) {
        field2866++;
        if (arg1 != -111) {
            return;
        }
        class403 var3 = new class403(arg0);
        while (true) {
            int var4;
            label49: do {
                while (true) {
                    while (true) {
                        var4 = var3.method2357((byte) 117);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class469.field6553 = new int[6];
                            var9[0] = var3.method2338(0);
                            var9[1] = var3.method2338(0);
                            var9[2] = var3.method2338(0);
                            var9[3] = var3.method2338(0);
                            var9[4] = var3.method2338(0);
                            var9[5] = var3.method2338(0);
                        } else {
                            if (var4 != 4) {
                                continue label49;
                            }
                            int var7 = var3.method2357((byte) 116);
                            class241.field3513 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class241.field3513[var8] = var3.method2338(0);
                                if (class241.field3513[var8] == 65535) {
                                    class241.field3513[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method2357((byte) 118);
            class91.field1126 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class91.field1126[var6] = var3.method2338(0);
                if (class91.field1126[var6] == 65535) {
                    class91.field1126[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1271(int arg0) {
        field2854++;
        if (arg0 != 0) {
            field2867 = -82;
        }
        if (class405.field5737 != 2) {
            this.method1287(false);
            return;
        }
        try {
            this.method1287(false);
        } catch (Throwable var3) {
            class192.method1221((byte) -87, 0);
            class406.method2409(3896, var3, var3.getMessage() + " (Recovered) " + this.method1269((byte) 19));
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1272(int arg0) {
        field2862++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class432.method2555((byte) -3);
        class384.field5404 = new class180(class268.field3914);
        class15.field192 = new class183();
        if (class293.field4292 != class257.field3825) {
            class390.field5485 = new byte[50][];
        }
        class4.field81 = new class289(class268.field3914);
        if (class293.field4292 == class257.field3825) {
            class334.field4839.field5883 = this.getCodeBase().getHost();
        } else if (class222.method1369(class293.field4292, false)) {
            class334.field4839.field5883 = this.getCodeBase().getHost();
            class334.field4839.field5887 = class334.field4839.field5885 + 40000;
            class489.field6837.field5887 = class489.field6837.field5885 + 40000;
            class334.field4839.field5889 = class334.field4839.field5885 + 50000;
            class5.field86.field5887 = class5.field86.field5885 + 40000;
            class489.field6837.field5889 = class489.field6837.field5885 + 50000;
            class5.field86.field5889 = class5.field86.field5885 + 50000;
        } else if (class500.field7085 == class293.field4292) {
            class334.field4839.field5883 = "127.0.0.1";
            class489.field6837.field5883 = "127.0.0.1";
            class334.field4839.field5887 = class334.field4839.field5885 + 40000;
            class5.field86.field5883 = "127.0.0.1";
            class489.field6837.field5887 = class489.field6837.field5885 + 40000;
            class334.field4839.field5889 = class334.field4839.field5885 + 50000;
            class5.field86.field5887 = class5.field86.field5885 + 40000;
            class489.field6837.field5889 = class489.field6837.field5885 + 50000;
            class5.field86.field5889 = class5.field86.field5885 + 50000;
        }
        if (class71.field886 == class246.field3594) {
            class421.field5942 = class282.field4157;
            class462.field6464 = true;
            class67.field851 = class514.field7590;
            class80.field1041 = class389.field5477;
            class184.field2662 = 16777215;
            class332.field4832 = 0;
            class426.field5988 = class43.field490;
        } else {
            class80.field1041 = class20.field230;
            class426.field5988 = class26.field319;
            class421.field5942 = class125.field1691;
            class67.field851 = class113.field1534;
        }
        if (class519.field7646 == class246.field3594) {
            class476.field6632 = false;
        }
        class426.field5989 = class334.field4839;
        class266.field3895 = class503.field7124 = class292.field4259 = class462.field6468 = new short[256];
        class345.field5009 = class162.method1027((byte) -32, class487.field6799);
        if (arg0 >= -119) {
            field2867 = 98;
        }
        class22.field277 = class271.method1716((byte) 30, true, class487.field6799);
        class1.field37 = class151.field2158;
        try {
            if (class268.field3914.field2151 != null) {
                class259.field3841 = new class6(class268.field3914.field2151, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class449.field6284[var3] = new class6(class268.field3914.field2169[var3], 6000, 0);
                }
                class174.field2506 = new class6(class268.field3914.field2168, 6000, 0);
                class275.field4063 = new class97(255, class259.field3841, class174.field2506, 500000);
                class454.field6372 = new class6(class268.field3914.field2156, 24, 0);
                class268.field3914.field2151 = null;
                class268.field3914.field2156 = null;
                class268.field3914.field2168 = null;
                class268.field3914.field2169 = null;
            }
        } catch (IOException var4) {
            class454.field6372 = null;
            class275.field4063 = null;
            class174.field2506 = null;
            class259.field3841 = null;
        }
        if (class293.field4292 != class257.field3825) {
            class496.field7035 = true;
        }
        if (class519.field7646 == class246.field3594) {
            class221.field3181 = class400.field5636.method3116(class149.field1979, (byte) 95);
        } else if (class71.field886 == class246.field3594) {
            class221.field3181 = class369.field5258.method3116(class149.field1979, (byte) 127);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
    public static final int method1273(int arg0, int arg1) {
        int var2 = -67 / ((arg0 + 76) / 43);
        field2853++;
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1274(int arg0) {
        if (class363.field5189) {
            class524.method3096((byte) 98);
        }
        if (arg0 != 1) {
            field2867 = 111;
        }
        field2868++;
        if (class385.field5414 != null) {
            class385.field5414.method1801(0);
        }
        if (class258.field3835 != null) {
            class390.method2259(class268.field3914, class258.field3835, (byte) -121);
            class258.field3835 = null;
        }
        if (class50.field608 != null) {
            class50.field608.method1360((byte) 48);
            class50.field608 = null;
        }
        class519.method3072((byte) 70);
        class15.field192.method1146(arg0 + 25646);
        class384.field5404.method1123((byte) -90);
        if (class71.field884 != null) {
            class71.field884.method1391((byte) 87);
            class71.field884 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhm;IIIIIIIII)V")
    public static final void method1275(class150[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class150 var11 = arg0[var10];
            if (var11 != null && var11.field2071 == arg1) {
                int var12 = var11.field2015 + arg6;
                int var13 = var11.field2058 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2022 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2113 + var12;
                    int var19 = var11.field2033 + var13;
                    if (var11.field2022 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2022 == 0 || var11.field2098 || method1291(var11).field7033 != 0 || class147.field1965 == var11 || class144.field1909 == var11.field2006) {
                    if (!method1288(var11)) {
                        if (class471.field6573 == var11) {
                            class508.field7531 = true;
                            class469.field6557 = var12;
                            class513.field7576 = var13;
                        }
                        if (var11.field2003 || var14 < var16 && var15 < var17) {
                            if (var11.field2057 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class389 var20 = (class389) class64.field817.method2655(15152); var20 != null; var20 = (class389) class64.field817.method2660((byte) 67)) {
                                    if (var20.field5458) {
                                        var20.method2891(-123);
                                        var20.field5457.field2030 = false;
                                    }
                                }
                                if (class408.field5783 == 0) {
                                    class471.field6573 = null;
                                    class147.field1965 = null;
                                }
                                class171.field2480 = 0;
                                class30.field359 = false;
                                class335.field4856 = false;
                                if (!class424.field5977) {
                                    class183.method1150(false);
                                }
                            }
                            boolean var21;
                            if (class22.field277.method1192(true) >= var14 && class22.field277.method1194(36) >= var15 && class22.field277.method1192(true) < var16 && class22.field277.method1194(36) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class427.field6024 && var21) {
                                if (var11.field2128 >= 0) {
                                    class432.field6097 = var11.field2128;
                                } else if (var11.field2057) {
                                    class432.field6097 = -1;
                                }
                            }
                            if (!class424.field5977 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class236.method1448(var11, arg9 - var13, arg8 - var12, 1004);
                            }
                            boolean var22 = false;
                            if (class22.field277.method1199(14795) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class432 var24 = (class432) class323.field4718.method2655(15152);
                            if (var24 != null && var24.method1080((byte) 87) == 0 && var24.method1084((byte) -102) >= var14 && var24.method1082(-769) >= var15 && var24.method1084((byte) -102) < var16 && var24.method1082(-769) < var17) {
                                var23 = true;
                            }
                            if (var11.field2001 != null) {
                                for (int var25 = 0; var25 < var11.field2001.length; var25++) {
                                    if (class345.field5009.method870(var11.field2001[var25], -126)) {
                                        if (var11.field2137 == null || class390.field5481 >= var11.field2137[var25]) {
                                            byte var26 = var11.field2062[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class345.field5009.method870(86, -116) && !class345.field5009.method870(82, -122) && !class345.field5009.method870(81, -119)) && ((var26 & 0x2) == 0 || class345.field5009.method870(86, -117)) && ((var26 & 0x1) == 0 || class345.field5009.method870(82, -116)) && ((var26 & 0x4) == 0 || class345.field5009.method870(81, -127))) {
                                                if (var25 < 10) {
                                                    class98.method692(true, "", var25 + 1, var11.field2134, -1);
                                                } else if (var25 == 10) {
                                                    class235.method1439(-77);
                                                    class496 var27 = method1291(var11);
                                                    class225.method1387(var11, var27.field7026, var27.method2886((byte) 96), 34165);
                                                    class380.field5366 = class189.method1204(false, var11);
                                                    if (class380.field5366 == null) {
                                                        class380.field5366 = "Null";
                                                    }
                                                    class431.field6089 = var11.field2075 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2020[var25];
                                                if (var11.field2137 == null) {
                                                    var11.field2137 = new int[var11.field2001.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field2137[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2137[var25] = class390.field5481 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field2137 != null) {
                                        var11.field2137[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class373.method2186(var24.method1082(-769) - var13, var24.method1084((byte) -102) - var12, var11, (byte) -115);
                            }
                            if (class471.field6573 != null && class471.field6573 != var11 && var21 && method1291(var11).method2885((byte) 58)) {
                                class76.field991 = var11;
                            }
                            if (class147.field1965 == var11) {
                                class532.field7810 = true;
                                class536.field7848 = var12;
                                class413.field5842 = var13;
                            }
                            if (var11.field2098 || var11.field2006 != 0) {
                                if (var21 && class30.field360 != 0 && var11.field2138 != null) {
                                    class389 var29 = new class389();
                                    var29.field5458 = true;
                                    var29.field5457 = var11;
                                    var29.field5465 = class30.field360;
                                    var29.field5466 = var11.field2138;
                                    class64.field817.method2657(8492, var29);
                                }
                                if (class471.field6573 != null || class424.field5977 || class453.field6357 != var11.field2006 && class171.field2480 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2006 != 0) {
                                    if (class325.field4746 == var11.field2006 || class170.field2478 == var11.field2006) {
                                        class426.field5992 = var11;
                                        if (class74.field903 != null) {
                                            class74.field903.method2481(class385.field5414, 2257, var11.field2033);
                                        }
                                        if (class325.field4746 == var11.field2006) {
                                            if (!class424.field5977 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class508.method3029(-74, class385.field5414, arg9, arg8);
                                                for (class77 var30 = (class77) class363.field5198.method2748(2); var30 != null; var30 = (class77) class363.field5198.method2751(-16195)) {
                                                    if (arg8 >= var30.field1007 && arg8 < var30.field1005 && arg9 >= var30.field1004 && arg9 < var30.field1006) {
                                                        class183.method1150(false);
                                                        class377.method2204(false, var30.field1003);
                                                    }
                                                }
                                            }
                                            class25.method163(var11, false, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class144.field1909 == var11.field2006) {
                                        if (var11.method944(class385.field5414, -1) == null || class230.field3393 != 0 && class230.field3393 != 3 || class424.field5977 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field2094[var32];
                                        if (var31 < var33 || var31 > var11.field2080[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field2113 / 2;
                                        int var35 = var32 - var11.field2033 / 2;
                                        int var36;
                                        if (class504.field7461 == 4) {
                                            var36 = (int) class153.field2204 & 0x3FFF;
                                        } else {
                                            var36 = (int) class153.field2204 + class460.field6441 & 0x3FFF;
                                        }
                                        int var37 = class95.field1242[var36];
                                        int var38 = class95.field1241[var36];
                                        if (class504.field7461 != 4) {
                                            var37 = (class98.field1304 + 256) * var37 >> 8;
                                            var38 = (class98.field1304 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class504.field7461 == 4) {
                                            var41 = (class360.field5147 >> 7) + (var39 >> 2);
                                            var42 = (class168.field2451 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class246.field3587.method125((byte) -87) - 1) * 64;
                                            var41 = (class246.field3587.field1896 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class246.field3587.field1899 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class427.field6024 && (class180.field2579 & 0x40) != 0) {
                                            class150 var44 = class343.method2046(class235.field3424, 0, class231.field3397);
                                            if (var44 == null) {
                                                class235.method1439(-97);
                                            } else {
                                                class509.method3042(1L, class380.field5366, 6, " ->", var41, class474.field6601, false, var42, 23, true, var11.field2089);
                                            }
                                            continue;
                                        }
                                        if (class71.field886 == class246.field3594) {
                                            class509.method3042(1L, class62.field781.method3116(class149.field1979, (byte) 118), 6, "", var41, -1, false, var42, 5, true, -1);
                                        }
                                        class509.method3042(1L, class225.field3240, 6, "", var41, class295.field4330, false, var42, 6, true, -1);
                                        continue;
                                    }
                                    if (class453.field6357 == var11.field2006) {
                                        class378.field5357 = var11;
                                        if (var21) {
                                            class30.field359 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1084((byte) -102) - var12 - var11.field2113 / 2) * 2.0D / (double) class245.field3556);
                                            int var46 = (int) (-((double) (var24.method1082(-769) - var13 - var11.field2033 / 2) * 2.0D / (double) class245.field3556));
                                            int var47 = class307.field4455 + var45 + class245.field3574;
                                            int var48 = class421.field5935 + var46 + class245.field3586;
                                            class309 var49 = class412.method2441(false);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method1877(var48, var50, 2048, var47);
                                            if (var50 != null) {
                                                if (class345.field5009.method870(82, -121) && class208.field3009 > 0) {
                                                    class427.method2530(var50[2], var50[1], 63, var50[0]);
                                                    continue;
                                                }
                                                class335.field4856 = true;
                                                class176.field2528 = var50[0];
                                                class169.field2465 = var50[1];
                                                class519.field7647 = var50[2];
                                            }
                                            class171.field2480 = 1;
                                            class479.field6681 = false;
                                            class454.field6370 = class22.field277.method1192(true);
                                            class403.field5714 = class22.field277.method1194(36);
                                            continue;
                                        }
                                        if (var22 && class171.field2480 > 0) {
                                            if (class171.field2480 == 1 && (class454.field6370 != class22.field277.method1192(true) || class403.field5714 != class22.field277.method1194(36))) {
                                                class53.field666 = class307.field4455;
                                                class369.field5269 = class421.field5935;
                                                class171.field2480 = 2;
                                            }
                                            if (class171.field2480 == 2) {
                                                class479.field6681 = true;
                                                class2.method20((byte) 124, class53.field666 + (int) ((double) (class454.field6370 - class22.field277.method1192(true)) * 2.0D / (double) class245.field3555));
                                                class226.method1392(class369.field5269 - (int) ((double) (class403.field5714 - class22.field277.method1194(36)) * 2.0D / (double) class245.field3555), 94);
                                            }
                                            continue;
                                        }
                                        if (class171.field2480 > 0 && !class479.field6681) {
                                            if ((class234.field3409 == 1 || class172.method1079((byte) -104)) && class37.field408 > 2) {
                                                class184.method1165(112, class403.field5714, class454.field6370);
                                            } else if (class195.method1231(0)) {
                                                class184.method1165(2, class403.field5714, class454.field6370);
                                            }
                                        }
                                        class171.field2480 = 0;
                                        continue;
                                    }
                                    if (class440.field6149 == var11.field2006) {
                                        if (var22) {
                                            class54.method453(var11.field2113, var11.field2033, 1, class22.field277.method1192(true) - var12, class22.field277.method1194(36) - var13);
                                        }
                                        continue;
                                    }
                                    if (class266.field3891 == var11.field2006) {
                                        class103.method709((byte) -109, var13, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field2066 && var23) {
                                    var11.field2066 = true;
                                    if (var11.field2052 != null) {
                                        class389 var51 = new class389();
                                        var51.field5458 = true;
                                        var51.field5457 = var11;
                                        var51.field5468 = var24.method1084((byte) -102) - var12;
                                        var51.field5465 = var24.method1082(-769) - var13;
                                        var51.field5466 = var11.field2052;
                                        class64.field817.method2657(8492, var51);
                                    }
                                }
                                if (var11.field2066 && var22 && var11.field2146 != null) {
                                    class389 var52 = new class389();
                                    var52.field5458 = true;
                                    var52.field5457 = var11;
                                    var52.field5468 = class22.field277.method1192(true) - var12;
                                    var52.field5465 = class22.field277.method1194(36) - var13;
                                    var52.field5466 = var11.field2146;
                                    class64.field817.method2657(8492, var52);
                                }
                                if (var11.field2066 && !var22) {
                                    var11.field2066 = false;
                                    if (var11.field2000 != null) {
                                        class389 var53 = new class389();
                                        var53.field5458 = true;
                                        var53.field5457 = var11;
                                        var53.field5468 = class22.field277.method1192(true) - var12;
                                        var53.field5465 = class22.field277.method1194(36) - var13;
                                        var53.field5466 = var11.field2000;
                                        class91.field1133.method2657(8492, var53);
                                    }
                                }
                                if (var22 && var11.field2106 != null) {
                                    class389 var54 = new class389();
                                    var54.field5458 = true;
                                    var54.field5457 = var11;
                                    var54.field5468 = class22.field277.method1192(true) - var12;
                                    var54.field5465 = class22.field277.method1194(36) - var13;
                                    var54.field5466 = var11.field2106;
                                    class64.field817.method2657(8492, var54);
                                }
                                if (!var11.field2030 && var21) {
                                    var11.field2030 = true;
                                    if (var11.field2100 != null) {
                                        class389 var55 = new class389();
                                        var55.field5458 = true;
                                        var55.field5457 = var11;
                                        var55.field5468 = class22.field277.method1192(true) - var12;
                                        var55.field5465 = class22.field277.method1194(36) - var13;
                                        var55.field5466 = var11.field2100;
                                        class64.field817.method2657(8492, var55);
                                    }
                                }
                                if (var11.field2030 && var21 && var11.field2114 != null) {
                                    class389 var56 = new class389();
                                    var56.field5458 = true;
                                    var56.field5457 = var11;
                                    var56.field5468 = class22.field277.method1192(true) - var12;
                                    var56.field5465 = class22.field277.method1194(36) - var13;
                                    var56.field5466 = var11.field2114;
                                    class64.field817.method2657(8492, var56);
                                }
                                if (var11.field2030 && !var21) {
                                    var11.field2030 = false;
                                    if (var11.field2126 != null) {
                                        class389 var57 = new class389();
                                        var57.field5458 = true;
                                        var57.field5457 = var11;
                                        var57.field5468 = class22.field277.method1192(true) - var12;
                                        var57.field5465 = class22.field277.method1194(36) - var13;
                                        var57.field5466 = var11.field2126;
                                        class91.field1133.method2657(8492, var57);
                                    }
                                }
                                if (var11.field1991 != null) {
                                    class389 var58 = new class389();
                                    var58.field5457 = var11;
                                    var58.field5466 = var11.field1991;
                                    class469.field6558.method2657(8492, var58);
                                }
                                if (var11.field2055 != null && class79.field1032 > var11.field2084) {
                                    if (var11.field2078 == null || class79.field1032 - var11.field2084 > 32) {
                                        class389 var63 = new class389();
                                        var63.field5457 = var11;
                                        var63.field5466 = var11.field2055;
                                        class64.field817.method2657(8492, var63);
                                    } else {
                                        label691: for (int var59 = var11.field2084; var59 < class79.field1032; var59++) {
                                            int var60 = class504.field7471[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field2078.length; var61++) {
                                                if (var11.field2078[var61] == var60) {
                                                    class389 var62 = new class389();
                                                    var62.field5457 = var11;
                                                    var62.field5466 = var11.field2055;
                                                    class64.field817.method2657(8492, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2084 = class79.field1032;
                                }
                                if (var11.field2036 != null && class285.field4182 > var11.field1990) {
                                    if (var11.field2028 == null || class285.field4182 - var11.field1990 > 32) {
                                        class389 var68 = new class389();
                                        var68.field5457 = var11;
                                        var68.field5466 = var11.field2036;
                                        class64.field817.method2657(8492, var68);
                                    } else {
                                        label667: for (int var64 = var11.field1990; var64 < class285.field4182; var64++) {
                                            int var65 = class282.field4160[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field2028.length; var66++) {
                                                if (var11.field2028[var66] == var65) {
                                                    class389 var67 = new class389();
                                                    var67.field5457 = var11;
                                                    var67.field5466 = var11.field2036;
                                                    class64.field817.method2657(8492, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1990 = class285.field4182;
                                }
                                if (var11.field2122 != null && class125.field1689 > var11.field2124) {
                                    if (var11.field2149 == null || class125.field1689 - var11.field2124 > 32) {
                                        class389 var73 = new class389();
                                        var73.field5457 = var11;
                                        var73.field5466 = var11.field2122;
                                        class64.field817.method2657(8492, var73);
                                    } else {
                                        label643: for (int var69 = var11.field2124; var69 < class125.field1689; var69++) {
                                            int var70 = class290.field4249[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2149.length; var71++) {
                                                if (var11.field2149[var71] == var70) {
                                                    class389 var72 = new class389();
                                                    var72.field5457 = var11;
                                                    var72.field5466 = var11.field2122;
                                                    class64.field817.method2657(8492, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2124 = class125.field1689;
                                }
                                if (var11.field2116 != null && class189.field2705 > var11.field2085) {
                                    if (var11.field2059 == null || class189.field2705 - var11.field2085 > 32) {
                                        class389 var78 = new class389();
                                        var78.field5457 = var11;
                                        var78.field5466 = var11.field2116;
                                        class64.field817.method2657(8492, var78);
                                    } else {
                                        label619: for (int var74 = var11.field2085; var74 < class189.field2705; var74++) {
                                            int var75 = class225.field3236[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field2059.length; var76++) {
                                                if (var11.field2059[var76] == var75) {
                                                    class389 var77 = new class389();
                                                    var77.field5457 = var11;
                                                    var77.field5466 = var11.field2116;
                                                    class64.field817.method2657(8492, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2085 = class189.field2705;
                                }
                                if (var11.field2143 != null && class437.field6131 > var11.field1986) {
                                    if (var11.field2051 == null || class437.field6131 - var11.field1986 > 32) {
                                        class389 var83 = new class389();
                                        var83.field5457 = var11;
                                        var83.field5466 = var11.field2143;
                                        class64.field817.method2657(8492, var83);
                                    } else {
                                        label595: for (int var79 = var11.field1986; var79 < class437.field6131; var79++) {
                                            int var80 = class446.field6232[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field2051.length; var81++) {
                                                if (var11.field2051[var81] == var80) {
                                                    class389 var82 = new class389();
                                                    var82.field5457 = var11;
                                                    var82.field5466 = var11.field2143;
                                                    class64.field817.method2657(8492, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1986 = class437.field6131;
                                }
                                if (class244.field3545 > var11.field2061 && var11.field2037 != null) {
                                    class389 var84 = new class389();
                                    var84.field5457 = var11;
                                    var84.field5466 = var11.field2037;
                                    class64.field817.method2657(8492, var84);
                                }
                                if (class360.field5154 > var11.field2061 && var11.field2002 != null) {
                                    class389 var85 = new class389();
                                    var85.field5457 = var11;
                                    var85.field5466 = var11.field2002;
                                    class64.field817.method2657(8492, var85);
                                }
                                if (class478.field6653 > var11.field2061 && var11.field2088 != null) {
                                    class389 var86 = new class389();
                                    var86.field5457 = var11;
                                    var86.field5466 = var11.field2088;
                                    class64.field817.method2657(8492, var86);
                                }
                                if (class369.field5268 > var11.field2061 && var11.field2014 != null) {
                                    class389 var87 = new class389();
                                    var87.field5457 = var11;
                                    var87.field5466 = var11.field2014;
                                    class64.field817.method2657(8492, var87);
                                }
                                if (class430.field6068 > var11.field2061 && var11.field2123 != null) {
                                    class389 var88 = new class389();
                                    var88.field5457 = var11;
                                    var88.field5466 = var11.field2123;
                                    class64.field817.method2657(8492, var88);
                                }
                                var11.field2061 = class371.field5285;
                                if (var11.field1997 != null) {
                                    for (int var89 = 0; var89 < class362.field5183; var89++) {
                                        class389 var90 = new class389();
                                        var90.field5457 = var11;
                                        var90.field5461 = class14.field187[var89].method268((byte) 2);
                                        var90.field5471 = class14.field187[var89].method273(120);
                                        var90.field5466 = var11.field1997;
                                        class64.field817.method2657(8492, var90);
                                    }
                                }
                                if (class1.field40 && var11.field2121 != null) {
                                    class389 var91 = new class389();
                                    var91.field5457 = var11;
                                    var91.field5466 = var11.field2121;
                                    class64.field817.method2657(8492, var91);
                                }
                            }
                            if (var11.field2022 == 5 && var11.field2090 != -1) {
                                var11.method938(class361.field5163, false, class39.field423).method2481(class385.field5414, 2257, var11.field2033);
                            }
                            class498.method2895(true, var11);
                            if (var11.field2022 == 0) {
                                method1275(arg0, var11.field2134, var14, var15, var16, var17, var12 - var11.field2141, var13 - var11.field2111, arg8, arg9);
                                if (var11.field2110 != null) {
                                    method1275(var11.field2110, var11.field2134, var14, var15, var16, var17, var12 - var11.field2141, var13 - var11.field2111, arg8, arg9);
                                }
                                class489 var92 = (class489) class255.field3763.method2405((long) var11.field2134, -43);
                                if (var92 != null) {
                                    if (class519.field7646 == class246.field3594 && var92.field6835 == 0 && !class424.field5977 && var21 && !class126.field1700) {
                                        class183.method1150(false);
                                    }
                                    class196.method1234(-16277, arg8, var17, var16, var14, arg9, var12, var15, var13, var92.field6840);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class498.method2895(true, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lhm;")
    public static final class150 method1276(int arg0, int arg1) {
        field2850++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (arg0 <= 72) {
            field2867 = 103;
        }
        if (class494.field6988[var2] == null || class494.field6988[var2][var3] == null) {
            boolean var4 = class120.method807(-8810, var2);
            if (!var4) {
                return null;
            }
        }
        return class494.field6988[var2][var3];
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method1277(boolean arg0) {
        field2858++;
        if (class15.field192.field2640 > class440.field6153) {
            class39.field422 = (class15.field192.field2640 * 50 - 50) * 5;
            class426.field5989.field5880 = !class426.field5989.field5880;
            if (class39.field422 > 3000) {
                class39.field422 = 3000;
            }
            if (class15.field192.field2640 >= 2 && class15.field192.field2638 == 6) {
                this.method1656(false, "js5connect_outofdate");
                class488.field6832 = 13;
                return;
            }
            if (class15.field192.field2640 >= 4 && class15.field192.field2638 == -1) {
                this.method1656(false, "js5crc");
                class488.field6832 = 13;
                return;
            }
            if (class15.field192.field2640 >= 4 && class338.method2014(class488.field6832, 0)) {
                if (class15.field192.field2638 == 7 || class15.field192.field2638 == 9) {
                    this.method1656(arg0, "js5connect_full");
                } else if (class15.field192.field2638 <= 0) {
                    this.method1656(arg0, "js5io");
                } else {
                    this.method1656(arg0, "js5connect");
                }
                class488.field6832 = 13;
                return;
            }
        }
        class440.field6153 = class15.field192.field2640;
        if (class39.field422 > 0) {
            class39.field422--;
            return;
        }
        try {
            if (class220.field3166 == 0) {
                class71.field889 = class268.field3914.method959(-26521, class426.field5989.method2478(114), class426.field5989.field5883);
                class220.field3166++;
            }
            if (arg0) {
                field2867 = -12;
            }
            if (class220.field3166 == 1) {
                if (class71.field889.field5277 == 2) {
                    this.method1278(1000, (byte) 104);
                    return;
                }
                if (class71.field889.field5277 == 1) {
                    class220.field3166++;
                }
            }
            if (class220.field3166 == 2) {
                class422.field5955 = new class532((Socket) class71.field889.field5274, class268.field3914);
                class403 var2 = new class403(5);
                var2.method2376((byte) 122, class215.field3105.field7739);
                var2.method2354(601, arg0);
                class422.field5955.method3139(5, 0, var2.field5663, 0);
                class220.field3166++;
                class347.field5022 = class465.method2699((byte) 14);
            }
            if (class220.field3166 == 3) {
                if (class338.method2014(class488.field6832, 0) || class422.field5955.method3137(1) > 0) {
                    int var3 = class422.field5955.method3141(0);
                    if (var3 != 0) {
                        this.method1278(var3, (byte) 75);
                        return;
                    }
                    class220.field3166++;
                } else if ((class465.method2699((byte) 14) - class347.field5022) > 30000L) {
                    this.method1278(1001, (byte) 105);
                    return;
                }
            }
            if (class220.field3166 == 4) {
                boolean var4 = class488.field6832 == 1 || class430.method2546(arg0, class488.field6832) || class311.method1886(-25866, class488.field6832);
                class15.field192.method1158(class422.field5955, !var4, (byte) 100);
                class71.field889 = null;
                class422.field5955 = null;
                class220.field3166 = 0;
            }
        } catch (IOException var5) {
            this.method1278(1002, (byte) 69);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1278(int arg0, byte arg1) {
        class71.field889 = null;
        field2852++;
        class220.field3166 = 0;
        class15.field192.field2638 = arg0;
        if (arg1 > 46) {
            class15.field192.field2640++;
            class422.field5955 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1279(byte arg0) {
        field2861++;
        class318.method1911(true);
        class44.method254(-18155);
        class45.method256(-13);
        class530.method3115(3);
        class279.method1744(100);
        class188.method1202((byte) 112);
        class531.method3128(-2);
        class361.method2130(false);
        class498.method2892((byte) 42);
        class256.method1652((byte) -38);
        class260.method1666(14);
        class103.method711((byte) 107);
        class536.method3153(192);
        class205.method1311((byte) 58);
        class125.method829(52);
        class290.method1803(6708);
        class289.method1787((byte) -98);
        class373.method2182(99999999);
        class384.method2227(-103);
        class455.method2666((byte) -22);
        class473.method2735(-120);
        class108.method747((byte) -105);
        class53.method428((byte) 7);
        class6.method42(0);
        class97.method683(-2029631744);
        class174.method1091((byte) -96);
        class350.method2068(22547);
        class483.method2784(-25664);
        class26.method165(true);
        class52.method412(89);
        class501.method2907(-127);
        class504.method3000(35);
        class263.method1675(true);
        class363.method2145(false);
        class316.method1898((byte) -87);
        class206.method1312(false);
        class305.method1858((byte) -95);
        class441.method2586(-2376);
        class154.method991(10);
        class334.method1998(-1025);
        class437.method2567(false);
        class197.method1242(16774);
        class186.method1185((byte) 89);
        class415.method2459((byte) 103);
        class479.method2769((byte) 99);
        class171.method1072(16);
        class385.method2236(false);
        class485.method2800(1623);
        class323.method1950(-13281);
        class67.method529((byte) -106);
        class378.method2207(2048);
        class241.method1517((byte) 0);
        class246.method1560((byte) 76);
        class226.method1390((byte) -74);
        class43.method251(684);
        class40.method223(1);
        class388.method2250((byte) 72);
        class309.method1875(12800);
        class259.method1663((byte) -65);
        class419.method2482(-25240);
        class477.method2746(12103);
        class150.method941((byte) -52);
        class392.method2271(85);
        class22.method119((byte) -109);
        class73.method542(false);
        class62.method503((byte) -123);
        class403.method2353((byte) 44);
        class319.method1916(0);
        class239.method1508((byte) -121);
        class242.method1524(-121);
        class408.method2418(2);
        class429.method2536((byte) -105);
        class489.method2822(-2);
        class496.method2879(-67);
        class60.method486(531);
        class513.method3057((byte) 63);
        class165.method1044((byte) 61);
        class231.method1428(-2);
        class450.method2636((byte) 94);
        class84.method613(4096);
        class438.method2576((byte) -127);
        class218.method1354(29);
        class390.method2260((byte) -84);
        class135.method853((byte) 115);
        class85.method616(122);
        class418.method2474(31);
        class90.method646(false);
        class266.method1684(128);
        class160.method1021(45);
        class294.method1812(-59);
        class207.method1321((byte) -67);
        class107.method732((byte) 93);
        class181.method1124(Integer.MIN_VALUE);
        class454.method2653((byte) -115);
        class449.method2624(-15);
        class265.method1682(116);
        class377.method2199((byte) -98);
        class347.method2057(-120);
        class251.method1632(3);
        class27.method171((byte) -52);
        class461.method2686(54);
        class117.method793(-97);
        class48.method277(2853);
        class38.method212((byte) -70);
        class322.method1941(0);
        class395.method2293(120);
        class15.method78(-1);
        class411.method2432((byte) -59);
        class324.method1957(52);
        class95.method670(-128);
        class75.method556((byte) 57);
        class208.method1331(4);
        class367.method2166(65536);
        class221.method1367(true);
        class304.method1852((byte) -123);
        class2.method19(true);
        class187.method1188((byte) 97);
        class459.method2676(1048575);
        class364.method2150(true);
        class344.method2050(8);
        class264.method1678((byte) -113);
        class14.method77(2);
        class258.method1662(true);
        class510.method3045(true);
        class170.method1066(true);
        class178.method1113(-1);
        class351.method2077();
        class224.method1379(-96);
        class58.method476(4);
        class217.method1348((byte) 82);
        class320.method1930(true);
        class386.method2237((byte) -89);
        class495.method2870();
        class245.method1550();
        class306.method1861(100);
        class11.method62();
        class140.method879(105);
        class156.method1011(5);
        class526.method3108(0);
        class172.method1075((byte) 13);
        class431.method2552(-50);
        class288.method1780((byte) -9);
        class222.method1370((byte) -121);
        class19.method98(0);
        class375.method2192(121);
        class412.method2444((byte) -93);
        class487.method2809(49);
        class500.method2899(-8827);
        class105.method718(true);
        class168.method1058(16);
        class442.method2589(0);
        class326.method1963(23497);
        class356.method2106((byte) 44);
        class66.method525(0);
        class360.method2124(-16711936);
        class57.method470((byte) 109);
        class508.method3034(false);
        class321.method1932((byte) 107);
        class422.method2501(29);
        class327.method1969(-110);
        class162.method1028(0);
        class527.method3112((byte) -79);
        class276.method1738((byte) -114);
        class88.method642((byte) -126);
        class131.method838((byte) 61);
        class400.method2315(true);
        class28.method175(false);
        class420.method2486();
        class5.method35(2);
        class244.method1534((byte) -95);
        class458.method2674(128);
        class472.method2729((byte) 125);
        class516.method3065(9179409);
        class393.method2275((byte) -15);
        class389.method2257(-70);
        class32.method193((byte) 102);
        class106.method723(true);
        class236.method1452((byte) 50);
        class296.method1823(4853);
        class391.method2264((byte) -116);
        class35.method200(4);
        class371.method2178((byte) -117);
        class232.method1432(false);
        class362.method2133((byte) 72);
        class134.method851(0);
        class121.method810(-27171);
        class31.method188((byte) 96);
        class436.method2563((byte) 87);
        class234.method1436(-13393);
        class409.method2420(false);
        class410.method2422((byte) -125);
        class357.method2114(27963);
        class155.method999(3448);
        class509.method3037(858993459);
        class354.method2092(89);
        class332.method1986(true);
        class37.method208((byte) 16);
        class81.method605((byte) -112);
        class267.method1690(0);
        class77.method594(true);
        class143.method895(true);
        class196.method1236(-10332);
        class268.method1691(false);
        class176.method1099(Integer.MAX_VALUE);
        class399.method2313(true);
        class474.method2739((byte) 68);
        class430.method2545((byte) 36);
        class355.method2098((byte) 108);
        class92.method658((byte) -103);
        class475.method2741(126);
        if (arg0 >= -25) {
            field2867 = -113;
        }
        class295.method1815(121);
        class494.method2864(2071987623);
        class211.method1332(105);
        class191.method1216((byte) 65);
        class201.method1297();
        class462.method2689(-127);
        class63.method509(5);
        class469.method2721(0);
        class139.method868(1);
        class443.method2596((byte) 123);
        class127.method836(true);
        class79.method599(11);
        class542.method3181(117);
        class124.method817(121);
        class346.method2055((byte) -15);
        class492.method2858((byte) 113);
        class463.method2693((byte) 94);
        class538.method3163(-1);
        class425.method2520();
        class293.method1811((byte) -118);
        class423.method2511((byte) 102);
        class286.method1766((byte) -62);
        class100.method699(-24880);
        class342.method2038((byte) 112);
        class505.method3008(0);
        class184.method1164(1486958572);
        class427.method2529(117);
        class194.method1227((byte) 119);
        class340.method2020((byte) -55);
        class488.method2819((byte) 120);
        class521.method3082(-26753);
        class112.method756(0);
        class453.method2646(false);
        class163.method1041(0);
        class254.method1641((byte) -127);
        class74.method545((byte) -112);
        class235.method1440(13762560);
        class520.method3080(29422);
        class20.method108(-27335);
        class229.method1424();
        class64.method516((byte) -21);
        class273.method1721(-78);
        class42.method248();
        class298.method1827();
        class537.method3161();
        class39.method213(0);
        class179.method1116(-47);
        class118.method799();
        class328.method1977(false);
        class452.method2641((byte) -102);
        class517.method3067(99);
        class113.method762(4550);
        class490.method2825();
        class30.method185(false);
        class17.method87(3);
        class434.method2557(-118);
        class303.method1850((byte) 8);
        class460.method2682(-1);
        class202.method1299((byte) -128);
        class76.method589(-3399);
        class330.method1983(88);
        class161.method1024(false);
        class368.method2170(29892);
        class366.method2159(-19251);
        class311.method1882(false);
        class467.method2710((byte) -84);
        class307.method1865(26903);
        class227.method1395(1);
        class426.method2523(false);
        class204.method1308(113);
        class503.method2993((byte) 111);
        class405.method2401((byte) 119);
        class177.method1102(9);
        class308.method1868(-123);
        class539.method3170((byte) -76);
        class275.method1735((byte) 121);
        class36.method204(0);
        class146.method903(0);
        class478.method2756((byte) 30);
        class417.method2471(119);
        class3.method23(19865);
        class102.method702((byte) 87);
        class247.method1603(-59);
        class141.method883(7);
        class55.method460(32993);
        class381.method2215();
        class524.method3094(1);
        class396.method2303(true);
        class511.method3049(-118);
        class518.method3070(true);
        class343.method2044((byte) -124);
        class243.method1530(6196);
        class345.method2052(15322);
        class280.method1748(false);
        class338.method2015(-14732);
        class413.method2450((byte) -108);
        class69.method533(-4096);
        class310.method1878(-32621);
        class359.method2121(false);
        class91.method651(4096);
        class541.method3180(4);
        class447.method2606(1);
        class68.method531(2);
        class540.method3176(false);
        class519.method3074((byte) -128);
        class428.method2534((byte) -19);
        class220.method1365(267386880);
        class481.method2770(50);
        class282.method1757(105);
        class315.method1897(0);
        class271.method1715(-128);
        class278.method1742(1);
        class402.method2317((byte) 86);
        class4.method30(-492);
        class33.method195(-26);
        class71.method537((byte) 23);
        class255.method1642((byte) 4);
        class353.method2091(42);
        class374.method2188();
        class491.method2852();
        class138.method862(127);
        class464.method2696(-1);
        class61.method499(24);
        class446.method2604(true);
        class287.method1774((byte) 115);
        class468.method2719(0);
        class213.method1340((byte) 104);
        class1.method16((byte) 52);
        class435.method2562(8);
        class153.method983((byte) -82);
        class466.method2705((byte) -121);
        class50.method396((byte) 120);
        class189.method1207(true);
        class132.method840(0);
        class152.method976(3);
        class126.method834(126);
        class421.method2496((byte) 9);
        class535.method3148(0);
        class380.method2211((byte) -109);
        class198.method1251(6406);
        class336.method2007(false);
        class525.method3100(false);
        class401.method2316(-109);
        class261.method1668(true);
        class292.method1810((byte) -84);
        class147.method918(-65535);
        class54.method457((byte) 100);
        class56.method469(92);
        class257.method1660(false);
        class8.method54(-107);
        class96.method680(34166);
        class285.method1763((byte) 71);
        class335.method2005(128);
        class482.method2781(0);
        class262.method1674(11675);
        class225.method1386(false);
        class80.method604(16);
        class387.method2243(6173);
        class110.method752((byte) -127);
        class471.method2728(false);
        class192.method1220(103);
        class129.method837(-1);
        class215.method1345((byte) 49);
        class493.method2861((byte) 117);
        class284.method1760(1399668615);
        class12.method67(85);
        class240.method1511(-1562);
        class329.method1979(1);
        class87.method630(-24123);
        class476.method2744(true);
        class269.method1695((byte) -127);
        class190.method1212((byte) 30);
        class440.method2577((byte) 96);
        class470.method2725(-16);
        class300.method1837(0);
        class414.method2454(55);
        class23.method141(255);
        class369.method2174((byte) -98);
        class47.method269(55);
        class424.method2512(64);
        class158.method1016((byte) 14);
        class507.method3027((byte) -106);
        class502.method2914((byte) -59);
        class383.method2223(-1780);
        class534.method3142(false);
        class486.method2803(-117);
        class104.method714(117);
        class497.method2889((byte) 101);
        class372.method2179(1073741824);
        class325.method1960((byte) -89);
        class230.method1427(false);
        class133.method845(64);
        class116.method779(1);
        class149.method928((byte) 56);
        class514.method3061(117);
        class382.method2220((byte) 108);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method1280(byte arg0) {
        field2864++;
        if (arg0 != 36) {
            this.method1287(true);
        }
        if (class405.field5737 != 2) {
            this.method1285((byte) 127);
            return;
        }
        try {
            this.method1285((byte) 126);
        } catch (Throwable var3) {
            class192.method1221((byte) -87, 0);
            class406.method2409(3896, var3, var3.getMessage() + " (Recovered) " + this.method1269((byte) 19));
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1281() {
        for (int var0 = 0; var0 < class43.field494; var0++) {
            int[] var1 = class255.field3779[var0];
            for (int var2 = 0; var2 < class500.field7068; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1282(boolean arg0) {
        field2865++;
        boolean var2 = class15.field192.method1154((byte) -121);
        if (!var2) {
            this.method1277(false);
        }
        if (arg0) {
            method1281();
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1283(byte arg0) {
        field2869++;
        if (!class4.field81.field1411) {
            for (int var2 = 0; var2 < class362.field5183; var2++) {
                if (class14.field187[var2].method273(118) == 's' || class14.field187[var2].method273(arg0 ^ 0x5B) == 'S') {
                    class4.field81.field1411 = true;
                    break;
                }
            }
        }
        if (class504.field7469 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class465.method2699((byte) 14);
            if (class43.field498 == 0L) {
                class43.field498 = var5;
            }
            if (var4 > 16384 && (var5 - class43.field498) < 5000L) {
                if ((var5 - class174.field2521) > 1000L) {
                    System.gc();
                    class174.field2521 = var5;
                }
                class520.field7652 = class5.field85.method3116(class149.field1979, (byte) 104);
                class483.field6730 = 5;
            } else {
                class520.field7652 = class449.field6285.method3116(class149.field1979, (byte) 100);
                class504.field7469 = 10;
                class483.field6730 = 5;
            }
        } else if (class504.field7469 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class143.field1877[var7] = class450.method2633(arg0 - 24317, class43.field494, class500.field7068);
            }
            class520.field7652 = class502.field7098.method3116(class149.field1979, (byte) 105);
            class483.field6730 = 10;
            class504.field7469 = 20;
        } else if (class504.field7469 == 20) {
            if (class37.field407 == null) {
                class37.field407 = new class473(class15.field192, class384.field5404);
            }
            if (class37.field407.method2737(-17)) {
                class27.field328 = class61.method494(true, 0, (byte) 50, 1, false);
                class73.field896 = class61.method494(true, 1, (byte) 124, 1, false);
                class390.field5478 = class61.method494(true, 2, (byte) 102, 1, false);
                class403.field5661 = class61.method494(true, 3, (byte) 122, 1, false);
                class477.field6643 = class61.method494(true, 4, (byte) 79, 1, false);
                class189.field2710 = class61.method494(true, 5, (byte) 97, 1, true);
                class75.field927 = class61.method494(false, 6, (byte) 95, 1, true);
                class155.field2251 = class61.method494(true, 7, (byte) 83, 1, false);
                class61.field761 = class61.method494(true, 8, (byte) 43, 1, false);
                class535.field7846 = class61.method494(true, 9, (byte) 40, 1, false);
                class492.field6958 = class61.method494(true, 10, (byte) 37, 1, false);
                class497.field7040 = class61.method494(true, 11, (byte) 46, 1, false);
                class324.field4734 = class61.method494(true, 12, (byte) 56, 1, false);
                class478.field6666 = class61.method494(true, 13, (byte) 88, 1, false);
                class39.field420 = class61.method494(false, 14, (byte) 106, 1, false);
                class524.field7713 = class61.method494(true, 15, (byte) 82, 1, false);
                class342.field4972 = class61.method494(true, 16, (byte) 111, 1, false);
                class147.field1966 = class61.method494(true, 17, (byte) 34, 1, false);
                class184.field2663 = class61.method494(true, 18, (byte) 96, 1, false);
                class382.field5384 = class61.method494(true, 19, (byte) 60, 1, false);
                class474.field6602 = class61.method494(true, 20, (byte) 86, 1, false);
                class276.field4102 = class61.method494(true, 21, (byte) 63, 1, false);
                class204.field2902 = class61.method494(true, 22, (byte) 105, 1, false);
                class290.field4248 = class61.method494(true, 23, (byte) 77, 1, true);
                class23.field307 = class61.method494(true, 24, (byte) 69, 1, false);
                class334.field4837 = class61.method494(true, 25, (byte) 113, 1, false);
                class486.field6776 = class61.method494(true, 26, (byte) 93, 1, true);
                class73.field890 = class61.method494(true, 27, (byte) 48, 1, false);
                class390.field5484 = class61.method494(true, 28, (byte) 104, 1, true);
                class278.field4122 = class61.method494(true, 29, (byte) 38, 1, false);
                class520.field7652 = class77.field1012.method3116(class149.field1979, (byte) 112);
                class483.field6730 = 15;
                class504.field7469 = 30;
            } else {
                class520.field7652 = class44.field502.method3116(class149.field1979, (byte) 118);
                class483.field6730 = 12;
            }
        } else if (class504.field7469 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class485.field6769[var9].method741(arg0 + 41) * class177.field2535[var9] / 100;
            }
            if (var8 == 100) {
                class520.field7652 = class191.field2724.method3116(class149.field1979, (byte) 127);
                class483.field6730 = 20;
                class375.method2191(109, class61.field761);
                class211.method1333(arg0 ^ 0x6A32, class61.field761);
                class504.field7469 = 40;
            } else {
                if (var8 != 0) {
                    class520.field7652 = class296.field4353.method3116(class149.field1979, (byte) 104) + var8 + "%";
                }
                class483.field6730 = 20;
            }
        } else if (class504.field7469 == 40) {
            if (class390.field5484.method440((byte) -128)) {
                this.method1270(class390.field5484.method421(1, 1), (byte) -111);
                class520.field7652 = class290.field4240.method3116(class149.field1979, (byte) 126);
                class483.field6730 = 25;
                class504.field7469 = 50;
            } else {
                class520.field7652 = class247.field3674.method3116(class149.field1979, (byte) 125) + class390.field5484.method444(-20879) + "%";
                class483.field6730 = 25;
            }
        } else if (class504.field7469 == 50) {
            class489.method2820(true);
            class520.field7652 = class190.field2713.method3116(class149.field1979, (byte) 112);
            class483.field6730 = 30;
            class504.field7469 = 60;
        } else if (class504.field7469 == 60) {
            int var10 = class31.method192(25008, class478.field6666, class61.field761);
            int var11 = class188.method1200(false);
            if (var10 < var11) {
                class520.field7652 = class192.field2734.method3116(class149.field1979, (byte) 125) + var10 * 100 / var11 + "%";
                class483.field6730 = 35;
            } else {
                class520.field7652 = class224.field3212.method3116(class149.field1979, (byte) 103);
                class504.field7469 = 70;
                class483.field6730 = 35;
            }
        } else if (class504.field7469 == 70) {
            int var12 = class279.method1745(class61.field761, false);
            int var13 = class4.method28(2);
            if (var13 > var12) {
                class520.field7652 = class15.field190.method3116(class149.field1979, (byte) 101) + var12 * 100 / var13 + "%";
                class483.field6730 = 40;
            } else {
                class520.field7652 = class32.field376.method3116(class149.field1979, (byte) 108);
                class504.field7469 = 80;
                class483.field6730 = 40;
            }
        } else if (class504.field7469 == 80) {
            if (class486.field6776.method440((byte) -60)) {
                class171.field2485 = new class431(class486.field6776, class535.field7846, class61.field761);
                class520.field7652 = class541.field7909.method3116(class149.field1979, (byte) 116);
                class504.field7469 = 90;
                class483.field6730 = 45;
            } else {
                class520.field7652 = class73.field894.method3116(class149.field1979, (byte) 107) + class486.field6776.method444(-20879) + "%";
                class483.field6730 = 45;
            }
        } else if (class504.field7469 == 90) {
            class520.field7652 = class60.field738.method3116(class149.field1979, (byte) 106);
            class483.field6730 = 50;
            class504.field7469 = 95;
        } else if (class504.field7469 == 95) {
            if (class4.field81.field1411) {
                class4.field81.field1435 = 0;
                class4.field81.field1415 = 1;
                class4.field81.field1413 = 0;
                class4.field81.field1426 = 0;
                class4.field81.field1414 = 0;
            }
            class4.field81.field1411 = true;
            class4.field81.method1784((byte) 10, class268.field3914);
            class165.method1045(class4.field81.field1414, false, false);
            class520.field7652 = class542.field7925.method3116(class149.field1979, (byte) 115);
            class504.field7469 = 100;
            class483.field6730 = 55;
        } else if (class504.field7469 == 100) {
            class433.method2556(arg0 - 27, class61.field761, class385.field5414, class478.field6666);
            class520.field7652 = class509.field7554.method3116(class149.field1979, (byte) 103);
            class483.field6730 = 60;
            class86.method623(1, (byte) 120);
            class504.field7469 = 110;
        } else if (class504.field7469 == 110) {
            byte var14 = 0;
            class390.field5478.method440((byte) -66);
            int var15 = var14 + class390.field5478.method444(arg0 ^ 0xFFFFAE53);
            class342.field4972.method440((byte) -90);
            int var16 = var15 + class342.field4972.method444(-20879);
            class147.field1966.method440((byte) -40);
            int var17 = var16 + class147.field1966.method444(arg0 ^ 0xFFFFAE53);
            class184.field2663.method440((byte) -85);
            int var18 = var17 + class184.field2663.method444(-20879);
            class382.field5384.method440((byte) -72);
            int var19 = var18 + class382.field5384.method444(-20879);
            class474.field6602.method440((byte) -106);
            int var20 = var19 + class474.field6602.method444(arg0 ^ 0xFFFFAE53);
            class276.field4102.method440((byte) -75);
            int var21 = var20 + class276.field4102.method444(-20879);
            class204.field2902.method440((byte) -51);
            int var22 = var21 + class204.field2902.method444(-20879);
            class23.field307.method440((byte) -97);
            int var23 = var22 + class23.field307.method444(arg0 - 20913);
            class334.field4837.method440((byte) -102);
            int var24 = var23 + class334.field4837.method444(-20879);
            class73.field890.method440((byte) -70);
            int var25 = var24 + class73.field890.method444(-20879);
            class278.field4122.method440((byte) -50);
            int var26 = var25 + class278.field4122.method444(-20879);
            if (var26 < 1200) {
                class520.field7652 = class463.field6472.method3116(class149.field1979, (byte) 119) + var26 / 12 + "%";
                class483.field6730 = 65;
            } else {
                class454.field6365 = new class334(class246.field3594, class149.field1979, class390.field5478);
                class498.field7049 = new class350(class246.field3594, class149.field1979, class390.field5478);
                class344.field5004 = new class483(class246.field3594, class149.field1979, class390.field5478, class61.field761);
                class472.field6579 = new class26(class246.field3594, class149.field1979, class147.field1966);
                class340.field4928 = new class52(class246.field3594, class149.field1979, class390.field5478);
                class211.field3058 = new class501(class246.field3594, class149.field1979, class390.field5478);
                class539.field7885 = new class504(class246.field3594, class149.field1979, class390.field5478, class155.field2251);
                class146.field1952 = new class263(class246.field3594, class149.field1979, class390.field5478);
                class52.field628 = new class363(class246.field3594, class149.field1979, class390.field5478);
                class377.field5338 = new class316(class246.field3594, class149.field1979, true, class342.field4972, class155.field2251);
                class69.field876 = new class206(class246.field3594, class149.field1979, class390.field5478, class61.field761);
                class412.field5829 = new class305(class246.field3594, class149.field1979, class390.field5478, class61.field761);
                class106.field1400 = new class441(class246.field3594, class149.field1979, true, class184.field2663, class155.field2251);
                class344.field5000 = new class154(class246.field3594, class149.field1979, true, class454.field6365, class382.field5384, class155.field2251);
                class373.field5309 = new class250(class246.field3594, class149.field1979, class390.field5478);
                class62.field784 = new class437(class246.field3594, class149.field1979, class474.field6602, class27.field328, class73.field896);
                class361.field5163 = new class197(class246.field3594, class149.field1979, class390.field5478);
                class39.field423 = new class186(class246.field3594, class149.field1979, class390.field5478);
                class125.field1688 = new class415(class246.field3594, class149.field1979, class276.field4102, class155.field2251);
                class473.field6588 = new class479(class246.field3594, class149.field1979, class390.field5478);
                class377.field5340 = new class171(class246.field3594, class149.field1979, class390.field5478);
                class438.field6141 = new class385(class246.field3594, class149.field1979, class390.field5478);
                class181.field2596 = new class485(class246.field3594, class149.field1979, class204.field2902);
                class385.field5412 = new class323(class246.field3594, class149.field1979, class390.field5478);
                class107.method729(class403.field5661, (byte) 103, class155.field2251, class478.field6666, class61.field761);
                class172.method1074((byte) 84, class278.field4122);
                class489.field6838 = new class41(class149.field1979, class23.field307, class334.field4837);
                class186.field2679 = new class67(class149.field1979, class23.field307, class334.field4837, new class527());
                class520.field7652 = class513.field7579.method3116(class149.field1979, (byte) 122);
                class483.field6730 = 65;
                class133.method844((byte) -52);
                class377.field5338.method1899(!class4.field81.method1791(-2, class405.field5737), (byte) -8);
                class163.field2413 = new class384();
                class217.method1351(-116);
                class147.method919(class73.field890, 0);
                class140.method881((byte) -128, class171.field2485, class155.field2251);
                class504.field7469 = 120;
            }
        } else if (class504.field7469 == 120) {
            int var27 = class368.method2168(class61.field761, arg0 - 116);
            int var28 = class535.method3147(arg0 ^ 0xFFFFFFA2);
            if (var28 > var27) {
                class520.field7652 = class325.field4749.method3116(class149.field1979, (byte) 123) + var27 * 100 / var28 + "%";
                class483.field6730 = 70;
            } else {
                class29.method182(class61.field761, class385.field5414, -64);
                class190.method1214(116, class90.field1122);
                class520.field7652 = class364.field5201.method3116(class149.field1979, (byte) 116);
                class483.field6730 = 70;
                class504.field7469 = 130;
            }
        } else if (class504.field7469 == 130) {
            if (class492.field6958.method427(12035, "huffman", "")) {
                class244 var29 = new class244(class492.field6958.method418(10701, "huffman", ""));
                class295.method1817(arg0 ^ 0x40A8, var29);
                class520.field7652 = class184.field2653.method3116(class149.field1979, (byte) 122);
                class504.field7469 = 140;
                class483.field6730 = 75;
            } else {
                class520.field7652 = class106.field1408.method3116(class149.field1979, (byte) 95) + "0%";
                class483.field6730 = 75;
            }
        } else if (class504.field7469 == 140) {
            if (class403.field5661.method440((byte) -127)) {
                class520.field7652 = class371.field5291.method3116(class149.field1979, (byte) 108);
                class504.field7469 = 150;
                class483.field6730 = 80;
            } else {
                class520.field7652 = class447.field6234.method3116(class149.field1979, (byte) 103) + class403.field5661.method444(-20879) + "%";
                class483.field6730 = 80;
            }
        } else if (class504.field7469 == 150) {
            if (class324.field4734.method440((byte) -80)) {
                class520.field7652 = class342.field4977.method3116(class149.field1979, (byte) 98);
                class504.field7469 = 160;
                class483.field6730 = 82;
            } else {
                class520.field7652 = class47.field545.method3116(class149.field1979, (byte) 123) + class324.field4734.method444(-20879) + "%";
                class483.field6730 = 82;
            }
        } else if (class504.field7469 == 160) {
            if (class478.field6666.method440((byte) -63)) {
                class520.field7652 = class492.field6964.method3116(class149.field1979, (byte) 106);
                class483.field6730 = 85;
                class504.field7469 = 170;
            } else {
                class520.field7652 = class492.field6964.method3116(class149.field1979, (byte) 96) + class478.field6666.method444(-20879) + "%";
                class483.field6730 = 85;
            }
        } else if (class504.field7469 == 170) {
            if (class290.field4248.method443(false, "details")) {
                class245.method1557(class290.field4248, class340.field4928, class211.field3058, class377.field5338, class69.field876, class412.field5829, class163.field2413);
                class520.field7652 = class382.field5381.method3116(class149.field1979, (byte) 111);
                class504.field7469 = 190;
                class483.field6730 = 89;
            } else {
                class520.field7652 = class454.field6371.method3116(class149.field1979, (byte) 104) + class290.field4248.method450("details", 126) + "%";
                class483.field6730 = 87;
            }
        } else if (arg0 == 34) {
            if (class504.field7469 == 190) {
                class336.field4863 = new int[class438.field6141.field5413];
                class421.field5943 = new boolean[class438.field6141.field5413];
                class538.field7867 = new String[class377.field5340.field2483];
                for (int var30 = 0; var30 < class438.field6141.field5413; var30++) {
                    if (class438.field6141.method2234((byte) 77, var30).field5951 == 0) {
                        class421.field5943[var30] = true;
                        class455.field6393++;
                    }
                    class336.field4863[var30] = -1;
                }
                class191.method1217((byte) 67);
                class358.field5133 = class403.field5661.method429("loginscreen", -1);
                class10.field142 = class403.field5661.method429("lobbyscreen", -1);
                class189.field2710.method420((byte) -45, true, false);
                class75.field927.method420((byte) -45, true, true);
                class61.field761.method420((byte) -45, true, true);
                class478.field6666.method420((byte) -45, true, true);
                class492.field6958.method420((byte) -45, true, true);
                class403.field5661.method420((byte) -45, true, true);
                class43.field496 = true;
                class390.field5478.field662 = 2;
                class147.field1966.field662 = 2;
                class342.field4972.field662 = 2;
                class184.field2663.field662 = 2;
                class382.field5384.field662 = 2;
                class474.field6602.field662 = 2;
                class276.field4102.field662 = 2;
                class207.method1322(-1, false, -120, -1, class4.field81.field1415);
                class520.field7652 = class342.field4973.method3116(class149.field1979, (byte) 101);
                class504.field7469 = 200;
                class483.field6730 = 95;
            } else if (class504.field7469 == 200) {
                class86.method623(2, (byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        int var1 = class144.field1908;
        int[] var2 = class521.field7674;
        for (int var3 = 0; var3 < class434.field6110 + var1; var3++) {
            class228 var4;
            if (var3 < var1) {
                var4 = class378.field5355[var2[var3]];
            } else {
                var4 = ((class378) class125.field1687.method2405((long) class488.field6834[var3 - var1], -122)).field5353;
            }
            if (var4.field1904 == arg0 && var4.field3294 >= 0) {
                int var5 = var4.method125((byte) -71);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1896 & 0x7F) != 0 || (var4.field1899 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1896 & 0x7F) != 64 || (var4.field1899 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1896 >> 7;
                    int var7 = var4.field1899 >> 7;
                    if (var4.field3294 > class255.field3779[var6][var7]) {
                        class255.field3779[var6][var7] = var4.field3294;
                        class508.field7507[var6][var7] = 1;
                    } else if (class255.field3779[var6][var7] == var4.field3294) {
                        var10002 = class508.field7507[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1896 - var8 >> 7;
                    int var10 = var4.field1899 - var8 >> 7;
                    int var11 = var4.field1896 + var8 >> 7;
                    int var12 = var4.field1899 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3294 > class255.field3779[var13][var14]) {
                                class255.field3779[var13][var14] = var4.field3294;
                                class508.field7507[var13][var14] = 1;
                            } else if (class255.field3779[var13][var14] == var4.field3294) {
                                var10002 = class508.field7507[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method1285(byte arg0) {
        field2849++;
        if (class488.field6832 == 13) {
            return;
        }
        class390.field5481++;
        if ((class390.field5481 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class33.field380 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class55.field696.setSeed((long) class33.field380);
        }
        if ((class390.field5481 % 50) == 0) {
            class419.field5907 = class423.field5965;
            class113.field1535 = class241.field3512;
            class423.field5965 = 0;
            class241.field3512 = 0;
        }
        this.method1282(false);
        if (class37.field407 != null) {
            class37.field407.method2731(-79);
        }
        class9.method56((byte) -4);
        class345.field5009.method864(-116);
        class22.field277.method1198(3544);
        if (class385.field5414 != null) {
            class385.field5414.method335((int) class465.method2699((byte) 14));
        }
        class205.method1310((byte) -108);
        class362.field5183 = 0;
        if (arg0 < 123) {
            return;
        }
        class23.field302 = 0;
        for (class533 var3 = class345.field5009.method865(106); var3 != null; var3 = class345.field5009.method865(87)) {
            int var6 = var3.method271((byte) 115);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method273(118);
                if (class103.method707(-3) && (var7 == '`' || var7 == '§')) {
                    if (class227.method1394(105)) {
                        class3.method24((byte) 76);
                    } else {
                        class423.method2507(96);
                    }
                } else if (class362.field5183 < 128) {
                    class14.field187[class362.field5183] = var3;
                    class362.field5183++;
                }
            } else if (var6 == 0 && class23.field302 < 75) {
                class217.field3150[class23.field302] = var3;
                class23.field302++;
            }
        }
        class30.field360 = 0;
        for (class432 var4 = class22.field277.method1196(100); var4 != null; var4 = class22.field277.method1196(100)) {
            int var5 = var4.method1080((byte) 88);
            if (var5 == -1) {
                class356.field5107.method2657(8492, var4);
            } else if (var5 == 6) {
                class30.field360 += var4.method1083(-102);
            } else if (class38.method210(1, var5)) {
                class323.field4718.method2657(8492, var4);
                if (class323.field4718.method2665(-111) > 10) {
                    class323.field4718.method2654(-1);
                }
            }
        }
        if (class227.method1394(100)) {
            class102.method703((byte) 62);
        }
        if (class488.field6832 == 0) {
            this.method1283((byte) 34);
            class429.method2539(32);
        } else if (class488.field6832 == 1) {
            this.method1283((byte) 34);
            class429.method2539(32);
        } else if (class181.method1130(false, class488.field6832)) {
            class77.method593(1);
        }
        if (class430.method2546(false, class488.field6832) && !class181.method1130(false, class488.field6832)) {
            this.method1294(-74);
            class378.method2208(true);
            class218.method1353(101);
        } else if (class311.method1886(-25866, class488.field6832) && !class181.method1130(false, class488.field6832)) {
            this.method1294(-98);
            class218.method1353(83);
        } else if (class488.field6832 == 11) {
            class218.method1353(43);
        } else if (class271.method1714(class488.field6832, 10) && !class181.method1130(false, class488.field6832)) {
            class410.method2426(0);
        } else if (class488.field6832 == 12) {
            class218.method1353(81);
            if (class53.field683 != -3 && class53.field683 != 2 && class53.field683 != 15) {
                class287.method1771(false, -2049);
            }
        }
        class496.method2880(class385.field5414, false);
        class323.field4718.method2654(-1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1286() {
        int var0 = class144.field1908;
        int[] var1 = class521.field7674;
        boolean var2 = class4.field81.field1451 == 1 && var0 > 200 || class4.field81.field1451 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class22 var13 = class378.field5355[var1[var3]];
            if (var13.method123(-1)) {
                var13.method893(32107);
                if (var13.field1911 >= 0 && var13.field1902 >= 0 && var13.field1898 < class43.field494 && var13.field1907 < class500.field7068) {
                    var13.field245 = var13.field3302 ? var2 : false;
                    if (class246.field3587 == var13) {
                        var13.field3294 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field3354) {
                            var14++;
                        }
                        if (var13.field3327 > class390.field5481) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method125((byte) -78) << 2);
                        if (var13.field276) {
                            var15 += 512;
                        } else {
                            if (class366.field5219 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field3294 = var15 + 1;
                    }
                } else {
                    var13.field3294 = -1;
                }
            } else {
                var13.field3294 = -1;
            }
        }
        for (int var4 = 0; var4 < class434.field6110; var4++) {
            class429 var10 = ((class378) class125.field1687.method2405((long) class488.field6834[var4], -105)).field5353;
            if (var10.method2538(-1) && var10.field6055.method1948(class163.field2413, (byte) 89)) {
                var10.method893(32107);
                if (var10.field1911 >= 0 && var10.field1902 >= 0 && var10.field1898 < class43.field494 && var10.field1907 < class500.field7068) {
                    int var11 = 0;
                    if (!var10.field3354) {
                        var11++;
                    }
                    if (var10.field3327 > class390.field5481) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method125((byte) -122) << 2);
                    if (class366.field5219 == 0) {
                        if (var10.field6055.field4681) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class366.field5219 == 1) {
                        if (var10.field6055.field4681) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field6055.field4660) {
                        var12 += 1024;
                    } else if (!var10.field6055.field4678) {
                        var12 += 256;
                    }
                    var10.field3294 = var12 + 1;
                } else {
                    var10.field3294 = -1;
                }
            } else {
                var10.field3294 = -1;
            }
        }
        for (int var5 = 0; var5 < class20.field234.length; var5++) {
            class373 var6 = class20.field234[var5];
            if (var6 != null) {
                if (var6.field5302 == 1) {
                    class378 var7 = (class378) class125.field1687.method2405((long) var6.field5310, -36);
                    if (var7 != null) {
                        class429 var8 = var7.field5353;
                        if (var8.field3294 >= 0) {
                            var8.field3294 += 2048;
                        }
                    }
                } else if (var6.field5302 == 10) {
                    class22 var9 = class378.field5355[var6.field5310];
                    if (var9 != null && class246.field3587 != var9 && var9.field3294 >= 0) {
                        var9.field3294 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class48.method275(1, "Argument count");
            }
            class334.field4839 = new class418();
            class334.field4839.field5885 = Integer.parseInt(arg0[0]);
            class489.field6837 = new class418();
            class489.field6837.field5885 = Integer.parseInt(arg0[1]);
            class5.field86 = new class418();
            class5.field86.field5885 = Integer.parseInt(arg0[2]);
            class293.field4292 = class500.field7085;
            if (arg0[3].equals("live")) {
                class174.field2519 = class54.field694;
            } else if (arg0[3].equals("rc")) {
                class174.field2519 = class417.field5868;
            } else if (arg0[3].equals("wip")) {
                class174.field2519 = class437.field6135;
            } else {
                class48.method275(1, "modewhat");
            }
            class149.field1979 = class515.method3064(arg0[4], 0);
            if (class149.field1979 == -1) {
                if (arg0[4].equals("english")) {
                    class149.field1979 = 0;
                } else if (arg0[4].equals("german")) {
                    class149.field1979 = 1;
                } else {
                    class48.method275(1, "language");
                }
            }
            class522.field7685 = false;
            class190.field2712 = false;
            if (arg0[5].equals("game0")) {
                class246.field3594 = class519.field7646;
            } else if (arg0[5].equals("game1")) {
                class246.field3594 = class71.field886;
            } else {
                class48.method275(1, "game");
            }
            class503.field7304 = false;
            class284.field4166 = "";
            class496.field7034 = 0;
            class458.field6419 = true;
            class269.field3918 = true;
            class143.field1867 = class246.field3594.field2962;
            class390.field5483 = 0;
            client var1 = new client();
            class534.field7831 = var1;
            var1.method1659(false, class246.field3594.field2968, class174.field2519.method710(-31022) + 32, false, 30, 601, 768, 1024);
            class81.field1052.setLocation(40, 40);
        } catch (Exception var3) {
            class406.method2409(3896, var3, null);
        }
        field2859++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1287(boolean arg0) {
        field2856++;
        if (class488.field6832 == 13) {
            return;
        }
        long var2 = class102.method704((byte) -111) / 1000000L - class354.field5078;
        class354.field5078 = class102.method704((byte) -93) / 1000000L;
        boolean var4 = class392.method2272(arg0);
        if (var4 && class207.field3003 && class85.field1065 != null) {
            class85.field1065.method1328(98);
        }
        if (class149.method927(class488.field6832, -24210)) {
            if (class244.field3536 != 0L && class465.method2699((byte) 14) > class244.field3536) {
                class207.method1322(class4.field81.field1429, false, -128, class4.field81.field1455, class334.method1996((byte) 119));
            } else if (!class385.field5414.method322() && class5.field82) {
                class172.method1076((byte) -63);
            }
        }
        if (class258.field3835 == null) {
            Container var5;
            if (class81.field1052 == null) {
                var5 = class268.field3914.field2165;
            } else {
                var5 = class81.field1052;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class81.field1052 == var5) {
                Insets var8 = class81.field1052.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.left + var8.right;
            }
            if (class47.field542 != var6 || class285.field4177 != var7) {
                if (class385.field5414 == null || class385.field5414.method364()) {
                    class432.method2555((byte) -3);
                } else {
                    class285.field4177 = var7;
                    class47.field542 = var6;
                }
                class244.field3536 = class465.method2699((byte) 14) + 500L;
            }
        }
        if (class258.field3835 != null && !class60.field745 && class149.method927(class488.field6832, -24210)) {
            class207.method1322(-1, false, -104, -1, class4.field81.field1415);
        }
        boolean var9 = false;
        if (class376.field5333) {
            var9 = true;
            class376.field5333 = false;
        }
        if (var9) {
            class26.method166((byte) -112);
        }
        if (class385.field5414 != null && class385.field5414.method322() || class334.method1996((byte) 66) != 1) {
            class385.method2235((byte) 102);
        }
        if (class488.field6832 == 0) {
            class474.method2740(class390.field5482[class143.field1867], class504.field7459[class143.field1867], class520.field7652, var9, class516.field7598[class143.field1867], class483.field6730, (byte) 112);
        } else if (class488.field6832 == 1) {
            class5.method36(class385.field5414, -20179, var9 | class385.field5414.method322(), class516.field7598[class143.field1867].getRGB(), class390.field5482[class143.field1867].getRGB(), class107.field1431, class504.field7459[class143.field1867].getRGB());
        } else if (class497.method2890(class488.field6832, (byte) -68)) {
            class76.method591(0);
        } else if (class354.method2093(arg0, class488.field6832)) {
            class76.method591(0);
        } else if (class181.method1130(arg0, class488.field6832)) {
            if (class120.field1660 == 1) {
                if (class369.field5270 > class312.field4542) {
                    class312.field4542 = class369.field5270;
                }
                int var10 = (class312.field4542 - class369.field5270) * 50 / class312.field4542;
                class149.method930(true, class38.field415, class527.field7741.method3116(class149.field1979, (byte) 106) + "<br>(" + var10 + "%)", (byte) 62);
            } else if (class120.field1660 == 2) {
                if (class460.field6443 < class284.field4163) {
                    class460.field6443 = class284.field4163;
                }
                int var11 = (class460.field6443 - class284.field4163) * 50 / class460.field6443 + 50;
                class149.method930(true, class38.field415, class527.field7741.method3116(class149.field1979, (byte) 95) + "<br>(" + var11 + "%)", (byte) -107);
            } else {
                class149.method930(true, class38.field415, class527.field7741.method3116(class149.field1979, (byte) 110), (byte) -80);
            }
        } else if (class488.field6832 == 9) {
            class328.method1973(-1, var2);
        } else if (class488.field6832 == 12) {
            class149.method930(true, class38.field415, class422.field5949.method3116(class149.field1979, (byte) 101) + "<br>" + class265.field3888.method3116(class149.field1979, (byte) 115), (byte) -88);
        }
        if (class361.field5165 == 3) {
            for (int var12 = 0; var12 < class449.field6257; var12++) {
                Rectangle var13 = class95.field1226[var12];
                if (class498.field7053[var12]) {
                    class385.field5414.method1794(var13.width, var13.y, -1996553985, var13.height, 87, var13.x);
                } else if (class531.field7773[var12]) {
                    class385.field5414.method1794(var13.width, var13.y, -1996554240, var13.height, 124, var13.x);
                }
            }
        }
        if (class227.method1394(87)) {
            class257.method1661(class385.field5414, (byte) -127);
        }
        if (class149.method927(class488.field6832, -24210) && class361.field5165 == 0 && class334.method1996((byte) -119) == 1 && !var9 && class151.field2164.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class449.field6257; var15++) {
                if (class531.field7773[var15]) {
                    class531.field7773[var15] = false;
                    class428.field6031[var14++] = class95.field1226[var15];
                }
            }
            class385.field5414.method373(class428.field6031, var14);
        } else if (class488.field6832 != 0) {
            class385.field5414.method377();
            for (int var16 = 0; var16 < class449.field6257; var16++) {
                class531.field7773[var16] = false;
            }
        }
        if (class4.field81.field1424 == 0) {
            class52.method411(15L, (byte) 127);
        } else if (class4.field81.field1424 == 1) {
            class52.method411(10L, (byte) 115);
        } else if (class4.field81.field1424 == 2) {
            class52.method411(5L, (byte) 124);
        } else if (class4.field81.field1424 == 3) {
            class52.method411(2L, (byte) 109);
        }
        if (class43.field496) {
            class86.method622((byte) 14);
        }
        if (class4.field81.field1411 && class488.field6832 == 2 && class472.field6578 != -1) {
            class4.field81.field1411 = false;
            class4.field81.method1784((byte) 127, class268.field3914);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhm;)Z")
    public static final boolean method1288(class150 arg0) {
        if (class126.field1700) {
            if (method1291(arg0).field7033 != 0) {
                return false;
            }
            if (arg0.field2022 == 0) {
                return false;
            }
        }
        return arg0.field2125;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILta;Lza;IILhm;II)V")
    public static final void method1289(int arg0, int arg1, class145 arg2, class290 arg3, int arg4, int arg5, class150 arg6, int arg7, int arg8) {
        if (arg5 != 1) {
            return;
        }
        field2860++;
        class156 var9 = class69.field876.method1316((byte) -68, arg4);
        if (var9 == null || !var9.field2348 || !var9.method1004(false, class163.field2413)) {
            return;
        }
        if (var9.field2310 != null) {
            int[] var10 = new int[var9.field2310.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class504.field7461 == 4) {
                    var13 = (int) class153.field2204 & 0x3FFF;
                } else {
                    var13 = (int) class153.field2204 + class460.field6441 & 0x3FFF;
                }
                int var14 = class95.field1242[var13];
                int var15 = class95.field1241[var13];
                if (class504.field7461 != 4) {
                    var15 = var15 * 256 / (class98.field1304 + 256);
                    var14 = var14 * 256 / (class98.field1304 + 256);
                }
                var10[var11 * 2] = ((arg0 + (var9.field2310[var11 * 2] * 4)) * var15 + (var9.field2310[var11 * 2 + 1] * 4 + arg1) * var14 >> 15) + arg6.field2113 / 2 + arg7;
                var10[var11 * 2 + 1] = arg6.field2033 / 2 + arg8 - ((var9.field2310[var11 * 2 + 1] * 4 + arg1) * var15 - ((arg0 + (var9.field2310[var11 * 2] * 4)) * var14) >> 15);
            }
            class490.method2828(arg3, var10, var9.field2341, arg6.field2094, arg6.field2080);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg3.method330(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 2 + 1], var9.field2317, 1, arg2, arg7, arg8);
            }
            arg3.method330(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2317, 1, arg2, arg7, arg8);
        }
        class24 var16 = null;
        if (var9.field2334 != -1) {
            var16 = var9.method1005(false, true, arg3);
            if (var16 != null) {
                class214.method1341(arg0, arg6, arg7, 0, arg2, var16, arg8, arg1);
            }
        }
        if (var9.field2308 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method155();
        }
        class319 var18 = class53.field682;
        class411 var19 = class498.field7057;
        if (var9.field2343 == 1) {
            var19 = class431.field6093;
            var18 = class38.field415;
        }
        if (var9.field2343 == 2) {
            var18 = class107.field1431;
            var19 = class113.field1536;
        }
        class31.method189(arg0, arg6, var19, arg2, arg7, var17, arg1, var9.field2308, arg8, -25396, var9.field2342, var18);
        return;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2855++;
        if (!this.method1657(48)) {
            return;
        }
        class334.field4839 = new class418();
        class334.field4839.field5885 = Integer.parseInt(this.getParameter("worldid"));
        class489.field6837 = new class418();
        class489.field6837.field5885 = Integer.parseInt(this.getParameter("lobbyid"));
        class489.field6837.field5883 = this.getParameter("lobbyaddress");
        class5.field86 = new class418();
        class5.field86.field5885 = Integer.parseInt(this.getParameter("demoid"));
        class5.field86.field5883 = this.getParameter("demoaddress");
        class293.field4292 = class228.method1407(-72, Integer.parseInt(this.getParameter("modewhere")));
        if (!class222.method1369(class293.field4292, false) && class293.field4292 != class257.field3825) {
            class293.field4292 = class257.field3825;
        }
        class174.field2519 = class515.method3063(Integer.parseInt(this.getParameter("modewhat")), true);
        if (class437.field6135 != class174.field2519 && class417.field5868 != class174.field2519 && class54.field694 != class174.field2519) {
            class174.field2519 = class54.field694;
        }
        try {
            class149.field1979 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class149.field1979 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class522.field7685 = true;
        } else {
            class522.field7685 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class190.field2712 = true;
        } else {
            class190.field2712 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class92.field1153 = true;
        } else {
            class92.field1153 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class246.field3594 = class519.field7646;
            } else if (var4.equals("1")) {
                class246.field3594 = class71.field886;
            }
        }
        try {
            class496.field7034 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class496.field7034 = 0;
        }
        class279.field4125 = this.getParameter("quiturl");
        class284.field4166 = this.getParameter("settings");
        if (class284.field4166 == null) {
            class284.field4166 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class390.field5483 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class390.field5483 = 0;
            }
        }
        class143.field1867 = Integer.parseInt(this.getParameter("colourid"));
        if (class143.field1867 < 0 || class143.field1867 >= class516.field7598.length) {
            class143.field1867 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class458.field6419 = true;
            class269.field3918 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class503.field7304 = true;
        }
        class534.field7831 = this;
        if (class519.field7646 == class246.field3594) {
            class196.field2793 = 765;
            class423.field5964 = 503;
        } else if (class71.field886 == class246.field3594) {
            class196.field2793 = 640;
            class423.field5964 = 480;
        }
        this.method1654(class423.field5964, 601, class196.field2793, 12865, class174.field2519.method710(-31022) + 32);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1290() {
        int var0 = class144.field1908;
        int[] var1 = class521.field7674;
        int var2 = class218.field3156 ? var0 : class434.field6110 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class228 var4;
            if (var3 < var0) {
                var4 = class378.field5355[var1[var3]];
            } else {
                var4 = ((class378) class125.field1687.method2405((long) class488.field6834[var3 - var0], -53)).field5353;
            }
            if (var4.field3294 >= 0) {
                int var5 = var4.method125((byte) -93);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1896 & 0x7F) == 0 && (var4.field1899 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1896 & 0x7F) == 64 && (var4.field1899 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class22 && var4.field3371 != null && class390.field5481 >= var4.field3371.field3225 && class390.field5481 < var4.field3371.field3226) {
                    ((class22) var4).field245 = false;
                }
                var4.field1912 = class488.method2817(var4.field1896, true, var4.field1899, var4.field1904);
                class120.method806(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lhm;)Lkb;")
    public static final class496 method1291(class150 arg0) {
        class496 var1 = (class496) class221.field3183.method2405(((long) arg0.field2134 << 32) + (long) arg0.field2105, -109);
        return var1 == null ? arg0.field2101 : var1;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1292() {
        class389.field5470 = 0;
        for (int var0 = 0; var0 < class434.field6110; var0++) {
            class429 var1 = ((class378) class125.field1687.method2405((long) class488.field6834[var0], -118)).field5353;
            if (var1.field3354 && var1.method135(-76) != -1) {
                int var2 = (var1.method125((byte) -76) - 1) * 64 + 60;
                int var3 = var1.field1896 - var2 >> 7;
                int var4 = var1.field1899 - var2 >> 7;
                class228 var5 = class96.method679(-120, var1.field1904, var3, var4);
                if (var5 != null) {
                    int var6 = var5.field3289;
                    if (var5 instanceof class429) {
                        var6 += 2048;
                    }
                    if (var5.field3331 == 0 && var5.method135(-107) != -1) {
                        class23.field305[class389.field5470] = var6;
                        class342.field4976[class389.field5470] = var6;
                        class389.field5470++;
                        var5.field3331++;
                    }
                    class23.field305[class389.field5470] = var6;
                    class342.field4976[class389.field5470] = var1.field3289 + 2048;
                    class389.field5470++;
                    var5.field3331++;
                }
            }
        }
        class247.method1572(class342.field4976, 0, class389.field5470 - 1, class23.field305, (byte) -79);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(CB)Z")
    public static final boolean method1293(char arg0, byte arg1) {
        field2857++;
        if (arg1 != -46) {
            method1281();
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1294(int arg0) {
        field2863++;
        if (class488.field6832 == 6 && class63.field786 == 0) {
            if (class503.field7252 > 1) {
                class503.field7252--;
                class430.field6068 = class371.field5285;
            }
            if (!class424.field5977) {
                class183.method1150(false);
            }
            for (int var2 = 0; var2 < 100 && class488.method2815(0); var2++) {
            }
        }
        class288.field4213++;
        class25.method163(null, false, -1, -1);
        class103.method709((byte) 109, -1, null, -1);
        class304.method1853(39);
        class371.field5285++;
        for (int var3 = 0; var3 < class481.field6704; var3++) {
            class429 var4 = class367.field5245[var3].field5353;
            if (var4 != null) {
                byte var5 = var4.field6055.field4644;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method125((byte) -126);
                    if ((var5 & 0x2) != 0 && var4.field3369 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3368[0] + var7;
                            int var10 = var4.field3378[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class43.field494 - (var6 + 1) < var9) {
                                var9 = class43.field494 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class500.field7068 - var6 - 1 < var10) {
                                var10 = class500.field7068 - var6 - 1;
                            }
                            int var11 = class335.method2004(class143.field1877[var4.field1904], -1, var6, var9, var6, class165.field2428, true, var6, var4.field3378[0], 0, 0, var4.field3368[0], class431.field6088, (byte) -65, var10);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3368[var12] = class431.field6088[var11 - var12 - 1];
                                    var4.field3378[var12] = class165.field2428[var11 - var12 - 1];
                                    var4.field3372[var12] = 1;
                                }
                                var4.field3369 = var11;
                            }
                        }
                    }
                    class291.method1807(var4, true, 0);
                    int var13 = class387.method2242(false, var4);
                    class461.method2687(class149.field1975, 0, var13, var4, class531.field7776);
                    class310.method1879(var4, (byte) 109);
                }
            }
        }
        int var14 = 125 / ((arg0 - 58) / 45);
        if (class63.field786 == 0 && class170.field2473 == 0) {
            if (class504.field7461 == 2) {
                class51.method405(-124);
            } else {
                class197.method1248((byte) -124);
            }
            if (class478.field6654 >> 7 < 14 || (class43.field494 - 14) <= (class478.field6654 >> 7) || (class515.field7596 >> 7) < 14 || (class515.field7596 >> 7) >= (class500.field7068 - 14)) {
                class482.method2778(8);
            }
        }
        while (true) {
            class389 var15;
            class150 var16;
            class150 var17;
            do {
                var15 = (class389) class469.field6558.method2654(-1);
                if (var15 == null) {
                    while (true) {
                        class389 var18;
                        class150 var19;
                        class150 var20;
                        do {
                            var18 = (class389) class91.field1133.method2654(-1);
                            if (var18 == null) {
                                while (true) {
                                    class389 var21;
                                    class150 var22;
                                    class150 var23;
                                    do {
                                        var21 = (class389) class64.field817.method2654(-1);
                                        if (var21 == null) {
                                            if (class471.field6573 != null) {
                                                class540.method3174(2);
                                            }
                                            if (class390.field5481 % 1500 == 0) {
                                                class273.method1723(1);
                                            }
                                            if (class488.field6832 == 6 && class63.field786 == 0) {
                                                class504.method3002((byte) 7);
                                            }
                                            class47.method270((byte) 86);
                                            if (class363.field5189 && (class465.method2699((byte) 14) - 60000L) > class125.field1690) {
                                                class524.method3096((byte) 98);
                                            }
                                            for (class440 var24 = (class440) class466.field6510.method2748(2); var24 != null; var24 = (class440) class466.field6510.method2751(-16195)) {
                                                if ((class465.method2699((byte) 14) / 1000L - 5L) > ((long) var24.field6146)) {
                                                    if (var24.field6150 > 0) {
                                                        class92.method661(var24.field6151 + class383.field5389.method3116(class149.field1979, (byte) 95), -1, "", "", 5, 0);
                                                    }
                                                    if (var24.field6150 == 0) {
                                                        class92.method661(var24.field6151 + class244.field3544.method3116(class149.field1979, (byte) 118), -1, "", "", 5, 0);
                                                    }
                                                    var24.method1805((byte) 89);
                                                }
                                            }
                                            if (class488.field6832 == 6 && class63.field786 == 0) {
                                                if (class50.field608 == null) {
                                                    class287.method1771(false, -2049);
                                                    return;
                                                }
                                                class119.field1644++;
                                                if (class119.field1644 > 50) {
                                                    class61.method498(class23.field301, 1);
                                                    class29.field353++;
                                                }
                                                try {
                                                    if (class50.field608 != null && class30.field357.field5665 > 0) {
                                                        class423.field5965 += class30.field357.field5665;
                                                        class50.field608.method1357(class30.field357.field5663, (byte) 40, class30.field357.field5665, 0);
                                                        class119.field1644 = 0;
                                                        class30.field357.field5665 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var25) {
                                                    class287.method1771(false, -2049);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var22 = var21.field5457;
                                        if (var22.field2105 < 0) {
                                            break;
                                        }
                                        var23 = method1276(119, var22.field2071);
                                    } while (var23 == null || var23.field2110 == null || var22.field2105 >= var23.field2110.length || var23.field2110[var22.field2105] != var22);
                                    class495.method2866(var21);
                                }
                            }
                            var19 = var18.field5457;
                            if (var19.field2105 < 0) {
                                break;
                            }
                            var20 = method1276(124, var19.field2071);
                        } while (var20 == null || var20.field2110 == null || var19.field2105 >= var20.field2110.length || var20.field2110[var19.field2105] != var19);
                        class495.method2866(var18);
                    }
                }
                var16 = var15.field5457;
                if (var16.field2105 < 0) {
                    break;
                }
                var17 = method1276(82, var16.field2071);
            } while (var17 == null || var17.field2110 == null || var17.field2110.length <= var16.field2105 || var17.field2110[var16.field2105] != var16);
            class495.method2866(var15);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lhm;)Lhm;")
    public static final class150 method1295(class150 arg0) {
        int var1 = method1291(arg0).method2884(36);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = method1276(101, arg0.field2071);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1296(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class530("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
