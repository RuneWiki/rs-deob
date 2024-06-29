import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
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
public class client extends class123 {

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "[Liv;")
    public static class565[] field1378 = new class565[5];

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field1383 = false;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field1388;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field1387;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1371++;
        try {
            if (arg0.length != 6) {
                class456.method2648("Argument count", 0);
            }
            class494.field7085 = new class309();
            class494.field7085.field4294 = Integer.parseInt(arg0[0]);
            class572.field8418 = new class309();
            class572.field8418.field4294 = Integer.parseInt(arg0[1]);
            class233.field3457 = new class309();
            class233.field3457.field4294 = Integer.parseInt(arg0[2]);
            class554.field8103 = class434.field6248;
            if (arg0[3].equals("live")) {
                class358.field4999 = class198.field3079;
            } else if (arg0[3].equals("rc")) {
                class358.field4999 = class480.field6872;
            } else if (arg0[3].equals("wip")) {
                class358.field4999 = class440.field6367;
            } else {
                class456.method2648("modewhat", 0);
            }
            class238.field3511 = class694.method3912((byte) -52, arg0[4]);
            if (class238.field3511 == -1) {
                if (arg0[4].equals("english")) {
                    class238.field3511 = 0;
                } else if (arg0[4].equals("german")) {
                    class238.field3511 = 1;
                } else {
                    class456.method2648("language", 0);
                }
            }
            class522.field7697 = false;
            class318.field4389 = false;
            if (arg0[5].equals("game0")) {
                class486.field6942 = class470.field6783;
            } else if (arg0[5].equals("game1")) {
                class486.field6942 = class302.field4235;
            } else {
                class456.method2648("game", 0);
            }
            class640.field9072 = null;
            class196.field3066 = false;
            class446.field6456 = class486.field6942.field7806;
            class508.field7568 = false;
            class548.field8044 = 0;
            class434.field6245 = 0;
            class557.field8151 = 0;
            class251.field3625 = "";
            class529.field7808 = null;
            class461.field6627 = 0L;
            class42.field564 = true;
            class165.field2721 = true;
            client var1 = new client();
            class573.field8424 = var1;
            var1.method987(false, 0, 624, class486.field6942.field7804, 35, class358.field4999.method3070(-21392) + 32, 1024, 768);
            class699.field9906.setLocation(40, 40);
        } catch (Exception var3) {
            class18.method200(null, var3, 10296);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method694(int arg0) {
        field1384++;
        boolean var2 = class511.field7607.method1522(false);
        if (arg0 != -19029) {
            method710();
        }
        if (!var2) {
            this.method700(arg0 ^ 0xFFFFB5FB);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)Ljava/lang/String;")
    public final String method695(int arg0) {
        if (arg0 != 50) {
            field1377 = 67;
        }
        field1369++;
        String var2 = null;
        try {
            var2 = "[1)" + class143.field2474 + "," + class63.field917 + "," + class430.field6136 + "," + class580.field8504 + "|";
            if (class103.field1708 != null) {
                var2 = var2 + "2)" + class416.field5926 + "," + (class103.field1708.field2454[0] + class143.field2474) + "," + (class103.field1708.field2459[0] + class63.field917) + "|";
            }
            var2 = var2 + "3)" + class76.field1182 + "|4)" + class525.field7713.field5969 + "|5)" + class154.method1160(95) + "|6)" + class465.field6689 + "," + class597.field8633 + "|";
            var2 = var2 + "7)" + class525.field7713.method2485((byte) 84, class76.field1182) + "|";
            var2 = var2 + "8)" + class525.field7713.method2484(class76.field1182, false) + "|";
            var2 = var2 + "9)" + class525.field7713.field5981 + "|";
            var2 = var2 + "10)" + class525.field7713.field5979 + "|";
            var2 = var2 + "11)" + class525.field7713.field5964 + "|";
            var2 = var2 + "12)" + class525.field7713.method3471(class76.field1182, false) + "|";
            var2 = var2 + "13)" + class246.field3583 + "|";
            var2 = var2 + "14)" + class515.field7636;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class76.field1182 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field1387 == null ? (field1387 = method718("client")) : field1387).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lis;IIIIIIIII)V")
    public static final void method696(class101[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class101 var11 = arg0[var10];
            if (var11 != null && var11.field1539 == arg1) {
                int var12 = var11.field1583 + arg6;
                int var13 = var11.field1589 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field1584 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field1604 + var12;
                    int var19 = var11.field1651 + var13;
                    if (var11.field1584 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field1584 == 0 || var11.field1618 || method707(var11).field4572 != 0 || class456.field6557 == var11 || class571.field8372 == var11.field1638 || class124.field2046 == var11.field1638) {
                    if (!method714(var11)) {
                        if (class512.field7616 == var11 && class468.method2765(class512.field7616, (byte) -80) != null) {
                            class86.field1290 = true;
                            class251.field3627 = var12;
                            class443.field6405 = var13;
                        }
                        if (var11.field1524 || var14 < var16 && var15 < var17) {
                            if (var11.field1498 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class400 var20 = (class400) class286.field4012.method3905(-119); var20 != null; var20 = (class400) class286.field4012.method3899(0)) {
                                    if (var20.field5778) {
                                        var20.method2549((byte) -70);
                                        var20.field5783.field1540 = false;
                                    }
                                }
                                if (class494.field7088 == 0) {
                                    class512.field7616 = null;
                                    class456.field6557 = null;
                                }
                                class221.field3307 = 0;
                                class88.field1300 = false;
                                class476.field6819 = false;
                                if (!class324.field4519) {
                                    class96.method725(false);
                                }
                            }
                            boolean var21;
                            if (class313.field4336.method310(false) >= var14 && class313.field4336.method321(106) >= var15 && class313.field4336.method310(false) < var16 && class313.field4336.method321(116) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class41.field555 && var21) {
                                if (var11.field1573 >= 0) {
                                    class324.field4521 = var11.field1573;
                                } else if (var11.field1498) {
                                    class324.field4521 = -1;
                                }
                            }
                            if (!class324.field4519 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class334.method1991(var11, arg8 - var12, arg9 - var13, 1);
                            }
                            boolean var22 = false;
                            if (class313.field4336.method309((byte) 88) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class634 var24 = (class634) class31.field459.method3905(-123);
                            if (var24 != null && var24.method332((byte) 47) == 0 && var24.method333(25632) >= var14 && var24.method334(true) >= var15 && var24.method333(25632) < var16 && var24.method334(true) < var17) {
                                var23 = true;
                            }
                            if (var11.field1490 != null && !class699.method3934(-27206)) {
                                for (int var25 = 0; var25 < var11.field1490.length; var25++) {
                                    if (class236.field3494.method668(-115, var11.field1490[var25])) {
                                        if (var11.field1487 == null || class148.field2508 >= var11.field1487[var25]) {
                                            byte var26 = var11.field1547[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class236.field3494.method668(-62, 86) && !class236.field3494.method668(-114, 82) && !class236.field3494.method668(-115, 81)) && ((var26 & 0x2) == 0 || class236.field3494.method668(-42, 86)) && ((var26 & 0x1) == 0 || class236.field3494.method668(-78, 82)) && ((var26 & 0x4) == 0 || class236.field3494.method668(-86, 81))) {
                                                if (var25 < 10) {
                                                    class516.method3058("", -1, var11.field1577, -28456, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class372.method2220(-20585);
                                                    class330 var27 = method707(var11);
                                                    class505.method3012(var27.field4567, (byte) 62, var27.method1958((byte) -121), var11);
                                                    class584.field8560 = class491.method2874(var11, 0);
                                                    if (class584.field8560 == null) {
                                                        class584.field8560 = "Null";
                                                    }
                                                    class252.field3651 = var11.field1546 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field1620[var25];
                                                if (var11.field1487 == null) {
                                                    var11.field1487 = new int[var11.field1490.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field1487[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field1487[var25] = class148.field2508 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field1487 != null) {
                                        var11.field1487[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class473.method2781(var24.method333(25632) - var12, var11, var24.method334(true) - var13, (byte) 117);
                            }
                            if (class512.field7616 != null && class512.field7616 != var11 && var21 && method707(var11).method1952(false)) {
                                class201.field3101 = var11;
                            }
                            if (class456.field6557 == var11) {
                                class23.field309 = true;
                                class112.field1794 = var12;
                                class654.field9236 = var13;
                            }
                            if (var11.field1618 || var11.field1638 != 0) {
                                if (var21 && class165.field2730 != 0 && var11.field1606 != null) {
                                    class400 var29 = new class400();
                                    var29.field5778 = true;
                                    var29.field5783 = var11;
                                    var29.field5791 = class165.field2730;
                                    var29.field5790 = var11.field1606;
                                    class286.field4012.method3904(var29, 0);
                                }
                                if (class512.field7616 != null || class324.field4519 || class290.field4073 != var11.field1638 && class221.field3307 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field1638 != 0) {
                                    if (class608.field8740 == var11.field1638 || class611.field8775 == var11.field1638) {
                                        class128.field2090 = var11;
                                        if (class347.field4911 != null) {
                                            class347.field4911.method1480(class637.field9048, (byte) 106, var11.field1651);
                                        }
                                        if (class608.field8740 == var11.field1638) {
                                            if (!class324.field4519 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class188.method1334(arg8, 2201, class637.field9048, arg9);
                                                for (class80 var30 = (class80) class135.field2178.method3313((byte) 80); var30 != null; var30 = (class80) class135.field2178.method3308(54)) {
                                                    if (arg8 >= var30.field1204 && arg8 < var30.field1203 && arg9 >= var30.field1205 && arg9 < var30.field1209) {
                                                        class96.method725(false);
                                                        class453.method2634(var30.field1206, 494);
                                                    }
                                                }
                                            }
                                            class390.method2374(false, var13, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class571.field8372 == var11.field1638) {
                                        if (var11.method842((byte) 127, class637.field9048) == null || class472.field6789 != 0 && class472.field6789 != 3 || class324.field4519 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field1608[var32];
                                        if (var31 < var33 || var31 > var11.field1568[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field1604 / 2;
                                        int var35 = var32 - var11.field1651 / 2;
                                        int var36;
                                        if (class40.field544 == 4) {
                                            var36 = (int) class473.field6790 & 0x3FFF;
                                        } else {
                                            var36 = (int) class473.field6790 + class419.field5957 & 0x3FFF;
                                        }
                                        int var37 = class302.field4241[var36];
                                        int var38 = class302.field4242[var36];
                                        if (class40.field544 != 4) {
                                            var37 = (class239.field3523 + 256) * var37 >> 8;
                                            var38 = (class239.field3523 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class40.field544 == 4) {
                                            var41 = (class386.field5659 >> 9) + (var39 >> 2);
                                            var42 = (class108.field1761 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class103.field1708.method1108(122) - 1) * 256;
                                            var41 = (class103.field1708.field3155 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class103.field1708.field3154 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class41.field555 && (class700.field9918 & 0x40) != 0) {
                                            class101 var44 = class620.method3501(class395.field5705, false, class199.field3091);
                                            if (var44 == null) {
                                                class372.method2220(-20585);
                                            } else {
                                                class476.method2787(var41, 1L, var11.field1565, var42, true, (byte) -26, class584.field8560, 16, " ->", false, class25.field346);
                                            }
                                            continue;
                                        }
                                        if (class486.field6942 == class302.field4235) {
                                            class476.method2787(var41, 1L, -1, var42, true, (byte) -26, class343.field4776.method2059(class238.field3511, true), 17, "", false, -1);
                                        }
                                        class476.method2787(var41, 1L, -1, var42, true, (byte) -26, class458.field6577, 45, "", false, class497.field7402);
                                        continue;
                                    }
                                    if (class290.field4073 == var11.field1638) {
                                        class541.field7950 = var11;
                                        if (var21) {
                                            class88.field1300 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method333(25632) - var12 - var11.field1604 / 2) * 2.0D / (double) class161.field2616);
                                            int var46 = (int) (-((double) (var24.method334(true) - var13 - var11.field1651 / 2) * 2.0D / (double) class161.field2616));
                                            int var47 = class404.field5808 + var45 + class161.field2628;
                                            int var48 = class438.field6298 + var46 + class161.field2636;
                                            class369 var49 = class325.method1943(-1);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2212(var50, 0, var47, var48);
                                            if (var50 != null) {
                                                if (class236.field3494.method668(-60, 82) && class447.field6459 > 0) {
                                                    class262.method1673(var50[0], var50[1], (byte) -87, var50[2]);
                                                    continue;
                                                }
                                                class476.field6819 = true;
                                                class121.field1976 = var50[0];
                                                class91.field1337 = var50[1];
                                                class204.field3161 = var50[2];
                                            }
                                            class221.field3307 = 1;
                                            class643.field9142 = false;
                                            class586.field8575 = class313.field4336.method310(false);
                                            class655.field9260 = class313.field4336.method321(107);
                                            continue;
                                        }
                                        if (var22 && class221.field3307 > 0) {
                                            if (class221.field3307 == 1 && (class586.field8575 != class313.field4336.method310(false) || class655.field9260 != class313.field4336.method321(112))) {
                                                class547.field8030 = class404.field5808;
                                                class99.field1473 = class438.field6298;
                                                class221.field3307 = 2;
                                            }
                                            if (class221.field3307 == 2) {
                                                class643.field9142 = true;
                                                class505.method3017(class547.field8030 + (int) ((double) (class586.field8575 - class313.field4336.method310(false)) * 2.0D / (double) class161.field2614), (byte) 116);
                                                class70.method573(7737, class99.field1473 - (int) ((double) (class655.field9260 - class313.field4336.method321(112)) * 2.0D / (double) class161.field2614));
                                            }
                                            continue;
                                        }
                                        if (class221.field3307 > 0 && !class643.field9142) {
                                            if ((class248.field3608 == 1 || class116.method932((byte) 68)) && class400.field5784 > 2) {
                                                class396.method2404(-15896, class655.field9260, class586.field8575);
                                            } else if (class366.method2194((byte) -74)) {
                                                class396.method2404(-15896, class655.field9260, class586.field8575);
                                            }
                                        }
                                        class221.field3307 = 0;
                                        continue;
                                    }
                                    if (class123.field2012 == var11.field1638) {
                                        if (var22) {
                                            class232.method1526(var11.field1651, class313.field4336.method310(false) - var12, class313.field4336.method321(124) - var13, (byte) 78, var11.field1604);
                                        }
                                        continue;
                                    }
                                    if (class124.field2046 == var11.field1638) {
                                        class25.method244(var13, var12, var11, -87);
                                        continue;
                                    }
                                }
                                if (!var11.field1581 && var23) {
                                    var11.field1581 = true;
                                    if (var11.field1594 != null) {
                                        class400 var51 = new class400();
                                        var51.field5778 = true;
                                        var51.field5783 = var11;
                                        var51.field5785 = var24.method333(25632) - var12;
                                        var51.field5791 = var24.method334(true) - var13;
                                        var51.field5790 = var11.field1594;
                                        class286.field4012.method3904(var51, 0);
                                    }
                                }
                                if (var11.field1581 && var22 && var11.field1599 != null) {
                                    class400 var52 = new class400();
                                    var52.field5778 = true;
                                    var52.field5783 = var11;
                                    var52.field5785 = class313.field4336.method310(false) - var12;
                                    var52.field5791 = class313.field4336.method321(106) - var13;
                                    var52.field5790 = var11.field1599;
                                    class286.field4012.method3904(var52, 0);
                                }
                                if (var11.field1581 && !var22) {
                                    var11.field1581 = false;
                                    if (var11.field1572 != null) {
                                        class400 var53 = new class400();
                                        var53.field5778 = true;
                                        var53.field5783 = var11;
                                        var53.field5785 = class313.field4336.method310(false) - var12;
                                        var53.field5791 = class313.field4336.method321(121) - var13;
                                        var53.field5790 = var11.field1572;
                                        class556.field8137.method3904(var53, 0);
                                    }
                                }
                                if (var22 && var11.field1571 != null) {
                                    class400 var54 = new class400();
                                    var54.field5778 = true;
                                    var54.field5783 = var11;
                                    var54.field5785 = class313.field4336.method310(false) - var12;
                                    var54.field5791 = class313.field4336.method321(114) - var13;
                                    var54.field5790 = var11.field1571;
                                    class286.field4012.method3904(var54, 0);
                                }
                                if (!var11.field1540 && var21) {
                                    var11.field1540 = true;
                                    if (var11.field1596 != null) {
                                        class400 var55 = new class400();
                                        var55.field5778 = true;
                                        var55.field5783 = var11;
                                        var55.field5785 = class313.field4336.method310(false) - var12;
                                        var55.field5791 = class313.field4336.method321(115) - var13;
                                        var55.field5790 = var11.field1596;
                                        class286.field4012.method3904(var55, 0);
                                    }
                                }
                                if (var11.field1540 && var21 && var11.field1614 != null) {
                                    class400 var56 = new class400();
                                    var56.field5778 = true;
                                    var56.field5783 = var11;
                                    var56.field5785 = class313.field4336.method310(false) - var12;
                                    var56.field5791 = class313.field4336.method321(126) - var13;
                                    var56.field5790 = var11.field1614;
                                    class286.field4012.method3904(var56, 0);
                                }
                                if (var11.field1540 && !var21) {
                                    var11.field1540 = false;
                                    if (var11.field1610 != null) {
                                        class400 var57 = new class400();
                                        var57.field5778 = true;
                                        var57.field5783 = var11;
                                        var57.field5785 = class313.field4336.method310(false) - var12;
                                        var57.field5791 = class313.field4336.method321(121) - var13;
                                        var57.field5790 = var11.field1610;
                                        class556.field8137.method3904(var57, 0);
                                    }
                                }
                                if (var11.field1576 != null) {
                                    class400 var58 = new class400();
                                    var58.field5783 = var11;
                                    var58.field5790 = var11.field1576;
                                    class583.field8542.method3904(var58, 0);
                                }
                                if (var11.field1585 != null && class435.field6267 > var11.field1515) {
                                    if (var11.field1640 == null || class435.field6267 - var11.field1515 > 32) {
                                        class400 var63 = new class400();
                                        var63.field5783 = var11;
                                        var63.field5790 = var11.field1585;
                                        class286.field4012.method3904(var63, 0);
                                    } else {
                                        label696: for (int var59 = var11.field1515; var59 < class435.field6267; var59++) {
                                            int var60 = class186.field2922[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field1640.length; var61++) {
                                                if (var11.field1640[var61] == var60) {
                                                    class400 var62 = new class400();
                                                    var62.field5783 = var11;
                                                    var62.field5790 = var11.field1585;
                                                    class286.field4012.method3904(var62, 0);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1515 = class435.field6267;
                                }
                                if (var11.field1597 != null && class477.field6841 > var11.field1485) {
                                    if (var11.field1496 == null || class477.field6841 - var11.field1485 > 32) {
                                        class400 var68 = new class400();
                                        var68.field5783 = var11;
                                        var68.field5790 = var11.field1597;
                                        class286.field4012.method3904(var68, 0);
                                    } else {
                                        label672: for (int var64 = var11.field1485; var64 < class477.field6841; var64++) {
                                            int var65 = class491.field7056[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1496.length; var66++) {
                                                if (var11.field1496[var66] == var65) {
                                                    class400 var67 = new class400();
                                                    var67.field5783 = var11;
                                                    var67.field5790 = var11.field1597;
                                                    class286.field4012.method3904(var67, 0);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1485 = class477.field6841;
                                }
                                if (var11.field1641 != null && class627.field8927 > var11.field1534) {
                                    if (var11.field1520 == null || class627.field8927 - var11.field1534 > 32) {
                                        class400 var73 = new class400();
                                        var73.field5783 = var11;
                                        var73.field5790 = var11.field1641;
                                        class286.field4012.method3904(var73, 0);
                                    } else {
                                        label648: for (int var69 = var11.field1534; var69 < class627.field8927; var69++) {
                                            int var70 = class83.field1267[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field1520.length; var71++) {
                                                if (var11.field1520[var71] == var70) {
                                                    class400 var72 = new class400();
                                                    var72.field5783 = var11;
                                                    var72.field5790 = var11.field1641;
                                                    class286.field4012.method3904(var72, 0);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1534 = class627.field8927;
                                }
                                if (var11.field1636 != null && class309.field4299 > var11.field1563) {
                                    if (var11.field1510 == null || class309.field4299 - var11.field1563 > 32) {
                                        class400 var78 = new class400();
                                        var78.field5783 = var11;
                                        var78.field5790 = var11.field1636;
                                        class286.field4012.method3904(var78, 0);
                                    } else {
                                        label624: for (int var74 = var11.field1563; var74 < class309.field4299; var74++) {
                                            int var75 = class88.field1311[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1510.length; var76++) {
                                                if (var11.field1510[var76] == var75) {
                                                    class400 var77 = new class400();
                                                    var77.field5783 = var11;
                                                    var77.field5790 = var11.field1636;
                                                    class286.field4012.method3904(var77, 0);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1563 = class309.field4299;
                                }
                                if (var11.field1634 != null && class544.field7992 > var11.field1652) {
                                    if (var11.field1593 == null || class544.field7992 - var11.field1652 > 32) {
                                        class400 var83 = new class400();
                                        var83.field5783 = var11;
                                        var83.field5790 = var11.field1634;
                                        class286.field4012.method3904(var83, 0);
                                    } else {
                                        label600: for (int var79 = var11.field1652; var79 < class544.field7992; var79++) {
                                            int var80 = class383.field5615[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field1593.length; var81++) {
                                                if (var11.field1593[var81] == var80) {
                                                    class400 var82 = new class400();
                                                    var82.field5783 = var11;
                                                    var82.field5790 = var11.field1634;
                                                    class286.field4012.method3904(var82, 0);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1652 = class544.field7992;
                                }
                                if (class443.field6412 > var11.field1600 && var11.field1488 != null) {
                                    class400 var84 = new class400();
                                    var84.field5783 = var11;
                                    var84.field5790 = var11.field1488;
                                    class286.field4012.method3904(var84, 0);
                                }
                                if (class419.field5960 > var11.field1600 && var11.field1514 != null) {
                                    class400 var85 = new class400();
                                    var85.field5783 = var11;
                                    var85.field5790 = var11.field1514;
                                    class286.field4012.method3904(var85, 0);
                                }
                                if (class506.field7520 > var11.field1600 && var11.field1491 != null) {
                                    class400 var86 = new class400();
                                    var86.field5783 = var11;
                                    var86.field5790 = var11.field1491;
                                    class286.field4012.method3904(var86, 0);
                                }
                                if (class486.field6941 > var11.field1600 && var11.field1653 != null) {
                                    class400 var87 = new class400();
                                    var87.field5783 = var11;
                                    var87.field5790 = var11.field1653;
                                    class286.field4012.method3904(var87, 0);
                                }
                                if (class587.field8579 > var11.field1600 && var11.field1643 != null) {
                                    class400 var88 = new class400();
                                    var88.field5783 = var11;
                                    var88.field5790 = var11.field1643;
                                    class286.field4012.method3904(var88, 0);
                                }
                                var11.field1600 = class330.field4562;
                                if (var11.field1548 != null) {
                                    for (int var89 = 0; var89 < class443.field6418; var89++) {
                                        class400 var90 = new class400();
                                        var90.field5783 = var11;
                                        var90.field5792 = class336.field4674[var89].method2464((byte) 114);
                                        var90.field5780 = class336.field4674[var89].method2467(24968);
                                        var90.field5790 = var11.field1548;
                                        class286.field4012.method3904(var90, 0);
                                    }
                                }
                                if (class540.field7937 && var11.field1530 != null) {
                                    class400 var91 = new class400();
                                    var91.field5783 = var11;
                                    var91.field5790 = var11.field1530;
                                    class286.field4012.method3904(var91, 0);
                                }
                            }
                            if (var11.field1584 == 5 && var11.field1569 != -1) {
                                var11.method837(18, class111.field1777, class104.field1715).method1480(class637.field9048, (byte) -83, var11.field1651);
                            }
                            class98.method759(var11, -1);
                            if (var11.field1584 == 0) {
                                method696(arg0, var11.field1577, var14, var15, var16, var17, var12 - var11.field1518, var13 - var11.field1523, arg8, arg9);
                                if (var11.field1578 != null) {
                                    method696(var11.field1578, var11.field1577, var14, var15, var16, var17, var12 - var11.field1518, var13 - var11.field1523, arg8, arg9);
                                }
                                class259 var92 = (class259) class199.field3098.method2818(-22803, (long) var11.field1577);
                                if (var92 != null) {
                                    if (class486.field6942 == class470.field6783 && var92.field3711 == 0 && !class324.field4519 && var21 && !class88.field1324) {
                                        class96.method725(false);
                                    }
                                    class689.method3883(var15, arg9, var13, var17, var14, var16, var12, var92.field3716, arg8, (byte) -85);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class98.method759(var11, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method697() {
        for (int var0 = 0; var0 < class430.field6136; var0++) {
            int[] var1 = class256.field3692[var0];
            for (int var2 = 0; var2 < class580.field8504; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method698() {
        class598.field8642 = 0;
        for (int var0 = 0; var0 < class310.field4304; var0++) {
            class88 var1 = ((class6) class314.field4359.method2818(-22803, (long) class253.field3667[var0])).field49;
            if (var1.field2389 && var1.method657(true) != -1) {
                int var2 = (var1.method1108(82) - 1) * 256 + 252;
                int var3 = var1.field3155 - var2 >> 9;
                int var4 = var1.field3154 - var2 >> 9;
                class141 var5 = class199.method1397(var1.field3158, 252, var4, var3);
                if (var5 != null) {
                    int var6 = var5.field2427;
                    if (var5 instanceof class88) {
                        var6 += 2048;
                    }
                    if (var5.field2363 == 0 && var5.method657(true) != -1) {
                        class264.field3795[class598.field8642] = var6;
                        class240.field3527[class598.field8642] = var6;
                        class598.field8642++;
                        var5.field2363++;
                    }
                    class264.field3795[class598.field8642] = var6;
                    class240.field3527[class598.field8642] = var1.field2427 + 2048;
                    class598.field8642++;
                    var5.field2363++;
                }
            }
        }
        class591.method3390(0, (byte) -7, class598.field8642 - 1, class264.field3795, class240.field3527);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method699(byte arg0) {
        if (class196.field3066) {
            class246.field3583 = 64;
        }
        field1373++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class571.method3329((byte) 127);
        class644.field9145 = new class44(class653.field9220);
        class511.field7607 = new class231();
        class460.method2677(new int[] { 1000, 100 }, 1, new int[] { 20, 260 });
        if (class554.field8103 != class205.field3174) {
            class405.field5810 = new byte[50][];
        }
        class525.field7713 = new class616(class653.field9220);
        if (arg0 != -88) {
            return;
        }
        if (class554.field8103 == class205.field3174) {
            class494.field7085.field4286 = this.getCodeBase().getHost();
        } else if (class536.method3145(class554.field8103, (byte) 98)) {
            class494.field7085.field4286 = this.getCodeBase().getHost();
            class494.field7085.field4298 = class494.field7085.field4294 + 40000;
            class572.field8418.field4298 = class572.field8418.field4294 + 40000;
            class494.field7085.field4288 = class494.field7085.field4294 + 50000;
            class233.field3457.field4298 = class233.field3457.field4294 + 40000;
            class572.field8418.field4288 = class572.field8418.field4294 + 50000;
            class233.field3457.field4288 = class233.field3457.field4294 + 50000;
        } else if (class554.field8103 == class434.field6248) {
            class494.field7085.field4286 = "127.0.0.1";
            class572.field8418.field4286 = "127.0.0.1";
            class233.field3457.field4286 = "127.0.0.1";
            class494.field7085.field4298 = class494.field7085.field4294 + 40000;
            class572.field8418.field4298 = class572.field8418.field4294 + 40000;
            class233.field3457.field4298 = class233.field3457.field4294 + 40000;
            class494.field7085.field4288 = class494.field7085.field4294 + 50000;
            class572.field8418.field4288 = class572.field8418.field4294 + 50000;
            class233.field3457.field4288 = class233.field3457.field4294 + 50000;
        }
        if (class486.field6942 == class470.field6783) {
            class536.field7874 = false;
        }
        class432.field6208 = class446.field6455 = class673.field9555 = class262.field3781 = new short[256];
        if (class486.field6942 == class302.field4235) {
            class577.field8449 = true;
            class583.field8544 = class573.field8421;
            class78.field1198 = class418.field5955;
            class466.field6729 = 16777215;
            class512.field7623 = 0;
        } else {
            class583.field8544 = class499.field7418;
            class78.field1198 = class423.field6026;
        }
        class97.field1450 = class494.field7085;
        try {
            class477.field6830 = class573.field8424.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class236.field3494 = class528.method3104(arg0 - 24790, class126.field2061);
        class313.field4336 = class127.method1003(class126.field2061, true, true);
        try {
            if (class653.field9220.field9963 != null) {
                class11.field133 = new class441(class653.field9220.field9963, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class600.field8657[var3] = new class441(class653.field9220.field9981[var3], 6000, 0);
                }
                class530.field7821 = new class441(class653.field9220.field9978, 6000, 0);
                class682.field9715 = new class195(255, class11.field133, class530.field7821, 500000);
                class347.field4908 = new class441(class653.field9220.field9966, 24, 0);
                class653.field9220.field9978 = null;
                class653.field9220.field9966 = null;
                class653.field9220.field9963 = null;
                class653.field9220.field9981 = null;
            }
        } catch (IOException var5) {
            class530.field7821 = null;
            class682.field9715 = null;
            class11.field133 = null;
            class347.field4908 = null;
        }
        if (class554.field8103 != class205.field3174) {
            class570.field8319 = true;
        }
        if (class486.field6942 == class470.field6783) {
            class438.field6297 = class343.field4748.method2059(class238.field3511, true);
        } else if (class486.field6942 == class302.field4235) {
            class438.field6297 = class343.field4749.method2059(class238.field3511, true);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method700(int arg0) {
        if (arg0 < 77) {
            field1383 = false;
        }
        field1375++;
        if (class121.field1981 < class511.field7607.field3440) {
            class97.field1450.method1872(0);
            class187.field2934 = (class511.field7607.field3440 - 1) * 50 * 5;
            if (class187.field2934 > 3000) {
                class187.field2934 = 3000;
            }
            if (class511.field7607.field3440 >= 2 && class511.field7607.field3441 == 6) {
                this.method992(-92, "js5connect_outofdate");
                class515.field7636 = 14;
                return;
            }
            if (class511.field7607.field3440 >= 4 && class511.field7607.field3441 == -1) {
                this.method992(-54, "js5crc");
                class515.field7636 = 14;
                return;
            }
            if (class511.field7607.field3440 >= 4 && class482.method2819((byte) 126, class515.field7636)) {
                if (class511.field7607.field3441 == 7 || class511.field7607.field3441 == 9) {
                    this.method992(-105, "js5connect_full");
                } else if (class511.field7607.field3441 <= 0) {
                    this.method992(-66, "js5io");
                } else if (class16.field257 == null) {
                    this.method992(-33, "js5connect");
                } else {
                    this.method992(-24, "js5proxy_" + class16.field257.trim());
                }
                class515.field7636 = 14;
                return;
            }
        }
        class121.field1981 = class511.field7607.field3440;
        if (class187.field2934 > 0) {
            class187.field2934--;
            return;
        }
        try {
            if (class301.field4219 == 0) {
                class545.field8003 = class97.field1450.method1870(class653.field9220, -17813);
                class301.field4219++;
            }
            if (class301.field4219 == 1) {
                if (class545.field8003.field8787 == 2) {
                    if (class545.field8003.field8785 != null) {
                        class16.field257 = (String) class545.field8003.field8785;
                    }
                    this.method703(1000, (byte) -56);
                    return;
                }
                if (class545.field8003.field8787 == 1) {
                    class301.field4219++;
                }
            }
            if (class301.field4219 == 2) {
                class370.field5126 = new class425((Socket) class545.field8003.field8785, class653.field9220);
                class465 var2 = new class465(5);
                var2.method2753((byte) 105, class561.field8186.field4340);
                var2.method2733(false, 624);
                class370.field5126.method2505(-69, var2.field6719, 5, 0);
                class301.field4219++;
                class403.field5802 = class254.method1619(true);
            }
            if (class301.field4219 == 3) {
                if (class482.method2819((byte) 125, class515.field7636) || class370.field5126.method2506((byte) -90) > 0) {
                    int var3 = class370.field5126.method2507((byte) -67);
                    if (var3 != 0) {
                        this.method703(var3, (byte) -127);
                        return;
                    }
                    class301.field4219++;
                } else if (class254.method1619(true) - class403.field5802 > 30000L) {
                    this.method703(1001, (byte) -69);
                    return;
                }
            }
            if (class301.field4219 == 4) {
                boolean var4 = class482.method2819((byte) 115, class515.field7636) || class490.method2871(true, class515.field7636) || class352.method2135(class515.field7636, (byte) -122);
                class71[] var5 = class71.method578((byte) 76);
                class465 var6 = new class465(var5.length * 4);
                class370.field5126.method2502(-69, var6.field6719.length, 0, var6.field6719);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method580(var6.method2691((byte) -67), false);
                }
                class511.field7607.method1515(-1, class370.field5126, !var4);
                class301.field4219 = 0;
                class545.field8003 = null;
                class370.field5126 = null;
            }
        } catch (IOException var8) {
            this.method703(1002, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method701(int arg0) {
        int var1 = class643.field9134;
        int[] var2 = class98.field1458;
        int var3 = class61.field896 ? var1 : class310.field4304 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class141 var5;
            if (var4 < var1) {
                var5 = class76.field1186[var2[var4]];
            } else {
                var5 = ((class6) class314.field4359.method2818(-22803, (long) class253.field3667[var4 - var1])).field49;
            }
            if (var5.field3158 == arg0) {
                var5.field2363 = 0;
                if (var5.field2386 < 0) {
                    var5.field2389 = false;
                } else {
                    int var6 = var5.method1108(108);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3155 & 0x1FF) != 0 || (var5.field3154 & 0x1FF) != 0) {
                            var5.field2389 = false;
                            continue;
                        }
                    } else if ((var5.field3155 & 0x1FF) != 256 || (var5.field3154 & 0x1FF) != 256) {
                        var5.field2389 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3155 >> 9;
                        int var8 = var5.field3154 >> 9;
                        if (class256.field3692[var7][var8] != var5.field2386) {
                            var5.field2389 = true;
                            continue;
                        }
                        if (class366.field5086[var7][var8] > 1) {
                            var10002 = class366.field5086[var7][var8]--;
                            var5.field2389 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field3155 - var9 >> 9;
                        int var11 = var5.field3154 - var9 >> 9;
                        int var12 = var5.field3155 + var9 >> 9;
                        int var13 = var5.field3154 + var9 >> 9;
                        if (!class40.method331(var5.field2386, var12, 1, var10, var11, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class256.field3692[var14][var15] == var5.field2386) {
                                        var10002 = class366.field5086[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2389 = true;
                            continue;
                        }
                    }
                    var5.field2389 = false;
                    var5.field3160 = class603.method3433(var5.field3154, var5.field3158, var5.field3155, -117);
                    class333.method1985(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static void method702(int arg0) {
        if (arg0 == 1) {
            field1378 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method703(int arg0, byte arg1) {
        class301.field4219 = 0;
        field1380++;
        class370.field5126 = null;
        if (arg1 > -18) {
            method701(-89);
        }
        class545.field8003 = null;
        class511.field7607.field3440++;
        class511.field7607.field3441 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method704(byte arg0) {
        field1385++;
        method702(1);
        class513.method3051(114);
        class449.method2613((byte) -127);
        class343.method2056(-119);
        class89.method665(112);
        class383.method2342(31398);
        class18.method198(108);
        class71.method583((byte) -78);
        class269.method1694(-23);
        class103.method863(false);
        class435.method2554((byte) 99);
        class346.method2113((byte) -90);
        class482.method2811((byte) -106);
        class129.method1016((byte) 127);
        class520.method3071((byte) 93);
        class256.method1626(false);
        class529.method3116(115);
        class152.method1152(true);
        class98.method790(arg0 ^ 0x55);
        class616.method3469(arg0 ^ 0xFFFFE0B4);
        class258.method1640(arg0 ^ 0x4E5938DC);
        class206.method1424(0);
        class692.method3900(true);
        class425.method2503(false);
        class44.method353((byte) -128);
        class314.method1895((byte) 101);
        class183.method1314(121);
        class345.method2080((byte) 121);
        class195.method1379(arg0 ^ 0x1A48);
        class117.method943(arg0 - 201);
        class121.method980(32);
        class376.method2245((byte) 49);
        class525.method3097(0);
        class86.method649((byte) -60);
        class308.method1867(1);
        class596.method3411(true);
        class69.method565((byte) 40);
        class485.method2827(25477);
        class486.method2839(1);
        class229.method1502(false);
        class664.method3745(4);
        class9.method55((byte) 11);
        class238.method1550(10);
        class491.method2875(arg0 + 36);
        class205.method1419(0);
        class556.method3254(false);
        class59.method506(-8993);
        class73.method596(arg0 + 16147);
        class540.method3179(true);
        class1.method1(-1);
        class262.method1672(980);
        class563.method3289((byte) 41);
        class494.method2890(arg0 ^ 0xFFFFFFEF);
        class213.method1454(0);
        class357.method2155(127);
        class6.method25(arg0 + 17520);
        class115.method927(arg0 + 1747280949);
        class373.method2227(false);
        class116.method933(false);
        class237.method1547((byte) 105);
        class99.method828(-11273);
        class538.method3151(-43);
        class678.method3831(0);
        class369.method2207(0);
        class149.method1135((byte) -112);
        class222.method1479(-28190);
        class565.method3314(-126);
        class101.method848(-105);
        class680.method3848((byte) 108);
        class270.method1696(-22120);
        class700.method3938((byte) -66);
        class34.method300(-13937);
        class576.method3337((byte) 37);
        class465.method2754(-31366);
        class699.method3930(-121);
        class293.method1792((byte) -100);
        class511.method3041(-116);
        class131.method1023(arg0 ^ 0xFFFFB1F2);
        class417.method2474(0);
        class88.method651(5);
        class259.method1642((byte) 126);
        class330.method1959(-125);
        class475.method2784((byte) -113);
        class470.method2773(-13768);
        class392.method2384(-127);
        class600.method3419(0);
        class154.method1158(5983);
        class264.method1679(68);
        class254.method1622(false);
        class424.method2498(2195);
        class447.method2608((byte) 104);
        class613.method3466((byte) -64);
        class309.method1873(12515);
        class544.method3195((byte) 113);
        class461.method2682(121);
        class484.method2824(true);
        class603.method3434(false);
        class662.method3720(123);
        class188.method1345(0);
        class374.method2237(0);
        class606.method3446(arg0 ^ 0x7B2C);
        class397.method2416(false);
        class522.method3075(0);
        class63.method520(-65);
        class648.method3635(16);
        class119.method964(-1);
        class163.method1238((byte) 33);
        class75.method601((byte) -123);
        class682.method3859(false);
        class528.method3112(true);
        class432.method2541((byte) -114);
        class395.method2401(false);
        class355.method2148(false);
        class568.method3317(arg0 ^ 0x57);
        class300.method1848(arg0 ^ 0x23);
        class698.method3925(true);
        class490.method2868((byte) 123);
        class272.method1712(-11062);
        class289.method1773((byte) -83);
        class204.method1412((byte) -80);
        class295.method1823(122);
        class282.method1753(true);
        class105.method885(-32342);
        class31.method287(-1);
        class176.method1288(83);
        class172.method1270((byte) 120);
        class508.method3026((byte) 122);
        class456.method2645(0);
        class187.method1331(-18522);
        class386.method2358((byte) -94);
        class516.method3059((byte) -125);
        class472.method2776(false);
        class140.method1090((byte) 87);
        class84.method640(0);
        class399.method2426(122);
        class327.method1950(arg0 - 29648);
        class437.method2558(20359);
        class595.method3406((byte) -107);
        class161.method1212();
        class26.method257((byte) -127);
        class304.method1860(116);
        class620.method3499(-5793);
        class450.method2621(arg0 - 157);
        class239.method1556(-5387);
        class493.method2885(-126);
        class244.method1572(0);
        class186.method1325((byte) 59);
        class409.method2444(120);
        class690.method3886(arg0 ^ 0x50);
        class635.method3585();
        class674.method3815((byte) -74);
        class171.method1267(0);
        class168.method1262(3);
        class35.method302(true);
        class362.method2175();
        class341.method2053(3);
        class366.method2195(-127);
        class66.method543(110);
        class292.method1789();
        class30.method282(false);
        class313.method1894(15150);
        class387.method2367(-37);
        class16.method194(true);
        class353.method2136(255);
        class400.method2427(false);
        class77.method609((byte) 0);
        class438.method2563((byte) -36);
        class481.method2808(arg0 + 14324);
        class201.method1399((byte) 74);
        class78.method611((byte) -106);
        class8.method40((byte) 68);
        class72.method589(5);
        class306.method1862(arg0 - 10267);
        class198.method1391(-68);
        class427.method2513(false);
        class336.method2000((byte) -102);
        class478.method2794();
        class7.method27(97);
        class331.method1963((byte) 119);
        class21.method214((byte) -1);
        class15.method192();
        class125.method999(-116);
        class396.method2408(-1);
        class655.method3702((byte) 25);
        class81.method618((byte) 119);
        class40.method330((byte) 80);
        class569.method3320(-1);
        class192.method1357(0);
        class693.method3907(Integer.MIN_VALUE);
        class459.method2673();
        class515.method3057((byte) 108);
        class661.method3716(106);
        class177.method1293(-1);
        class687.method3874(106);
        class644.method3620((byte) -64);
        class253.method1615((byte) 39);
        class423.method2493((byte) 101);
        class455.method2641(-1);
        class301.method1850(2048);
        class500.method2990((byte) -91);
        class102.method855(0);
        class277.method1727(-16);
        class675.method3822((byte) 91);
        class310.method1877((byte) 36);
        class111.method901(arg0 ^ 0x1203);
        class284.method1757((byte) 6);
        class114.method924(-1);
        class155.method1165(-119);
        class76.method602(87);
        class80.method615(3980);
        class202.method1405(-107);
        class211.method1447((byte) -128);
        class430.method2519(-125);
        class539.method3170((byte) -47);
        class637.method3594((byte) -120);
        class546.method3198(false);
        class303.method1855(-32);
        class142.method1111((byte) -100);
        class82.method629(131072);
        class112.method909((byte) 108);
        class223.method1483((byte) -124);
        class583.method3371(82);
        class10.method57(0);
        class385.method2356(64);
        class624.method3524(118);
        class696.method3920((byte) -105);
        class457.method2655(-61);
        class150.method1140(31314);
        class580.method3361(200);
        class352.method2132(15463);
        class199.method1394(arg0 ^ 0x154);
        class433.method2542(true);
        if (arg0 != 84) {
            return;
        }
        class695.method3915(arg0 + 19916);
        class533.method3131((byte) -77);
        class609.method3460(64);
        class340.method2044((byte) -111);
        class96.method724(0);
        class22.method216((byte) 94);
        class128.method1013(256);
        class377.method2247((byte) 5);
        class333.method1984(0);
        class348.method2117(-2915);
        class208.method1439((byte) 119);
        class302.method1854(true);
        class512.method3049(-121);
        class5.method24(false);
        class434.method2544(false);
        class236.method1545(true);
        class550.method3230((byte) -70);
        class466.method2757(false);
        class480.method2807(-1);
        class190.method1348(arg0 ^ 0xFFFFFFDC);
        class518.method3065(15730);
        class691.method3888((byte) -38);
        class245.method1574();
        class431.method2522(false);
        class250.method1599(true);
        class216.method1460(1);
        class113.method920(0);
        class334.method1992(5599);
        class332.method1972(10);
        class564.method3303(262144);
        class507.method3021((byte) 105);
        class180.method1299((byte) -53);
        class83.method636((byte) -55);
        class527.method3101((byte) -128);
        class505.method3013(arg0 ^ 0x54);
        class221.method1477(81);
        class28.method270((byte) 122);
        class371.method2217(false);
        class281.method1736();
        class61.method513(122);
        class251.method1602(32);
        class469.method2770();
        class604.method3436();
        class68.method562((byte) 102);
        class506.method3020((byte) -123);
        class630.method3560();
        class252.method1612(10);
        class55.method425(true);
        class679.method3842((byte) -98);
        class405.method2436(1);
        class43.method350(-3054);
        class562.method3285(arg0 ^ 0x9);
        class42.method339((byte) 88);
        class567.method3315(-122);
        class572.method3330(arg0 - 197);
        class132.method1024(arg0 - 164);
        class248.method1595((byte) -127);
        class549.method3221(122);
        class653.method3687(1);
        class410.method2449(arg0 + 25132);
        class290.method1782((byte) 124);
        class559.method3268();
        class503.method3010(false);
        class584.method3373(0);
        class344.method2065(-104);
        class278.method1730(false);
        class367.method2202(1);
        class451.method2628((byte) 94);
        class323.method1928((byte) 56);
        class127.method1005(0);
        class11.method60((byte) 125);
        class225.method1487(true);
        class599.method3418(true);
        class536.method3144((byte) 125);
        class537.method3148((byte) -122);
        class235.method1542(16711680);
        class25.method245(-1);
        class49.method392(-1);
        class428.method2517(2);
        class382.method2265(32);
        class492.method2881((byte) 52);
        class487.method2854((byte) 125);
        class97.method728(0);
        class384.method2347((byte) -117);
        class286.method1766(true);
        class260.method1643(-617684776);
        class92.method685((byte) -33);
        class337.method2010(9984);
        class586.method3378(0);
        class196.method1385(arg0 ^ 0xFFFF8819);
        class56.method433(arg0 - 85);
        class70.method572((byte) 118);
        class351.method2131((byte) -114);
        class495.method2895(0);
        class324.method1939(-17345);
        class689.method3881((byte) 117);
        class354.method2138(103);
        class14.method155(-19);
        class90.method671((byte) -98);
        class233.method1532(0);
        class3.method18(526);
        class530.method3121((byte) -40);
        class135.method1036(1634);
        class468.method2766(arg0 + 5);
        class335.method1994((byte) 52);
        class445.method2591((byte) 121);
        class573.method3331((byte) -29);
        class666.method3755(arg0 - 83);
        class479.method2805((byte) 93);
        class329.method1951((byte) 100);
        class148.method1128((byte) -102);
        class627.method3534(false);
        class669.method3770((byte) 13);
        class65.method531(arg0 ^ 0x56);
        class633.method3569();
        class398.method2419((byte) 5);
        class207.method1434(-62);
        class534.method3133(arg0 - 124);
        class611.method3462(arg0 - 155);
        class174.method1278(68);
        class464.method2686(arg0 - 185);
        class311.method1879(1429);
        class33.method297(false);
        class60.method511(arg0 - 44);
        class621.method3503(118);
        class243.method1567(true);
        class160.method1204(arg0 - 80);
        class643.method3617(true);
        class462.method2684(83);
        class694.method3911((byte) 100);
        class246.method1585(true);
        class390.method2375(43);
        class448.method2612((byte) 124);
        class561.method3283(arg0 - 211);
        class288.method1768((byte) -109);
        class224.method1485(true);
        class426.method2509((byte) -11);
        class531.method3124((byte) 55);
        class608.method3456((byte) -42);
        class557.method3266((byte) -4);
        class358.method2160(18250);
        class467.method2759((byte) -119);
        class412.method2458(0);
        class234.method1535(-117);
        class413.method2462(true);
        class242.method1566((byte) 95);
        class20.method209();
        class139.method1089();
        class184.method1322((byte) -126);
        class240.method1558(31);
        class247.method1587(-1);
        class443.method2586(-111);
        class318.method1911(0);
        class294.method1797((byte) 28);
        class104.method879(123);
        class57.method497(-30491);
        class372.method2219(arg0 ^ 0xFFFF8FCC);
        class636.method3590(140);
        class476.method2789(false);
        class535.method3137((byte) 39);
        class325.method1944((byte) 93);
        class440.method2572(-127);
        class554.method3246(7681);
        class665.method3749(-11368);
        class39.method324((byte) 51);
        class134.method1031((byte) 113);
        class418.method2477(-27513);
        class548.method3214((byte) 127);
        class91.method674((byte) 47);
        class458.method2659(true);
        class629.method3554((byte) 1);
        class232.method1528(false);
        class590.method3388(0);
        class230.method1506(arg0 + 40);
        class407.method2441(arg0 - 1111);
        class51.method407(true);
        class697.method3923(42);
        class623.method3514(arg0 ^ 0xFFFFC838);
        class156.method1178(arg0 + 1705643983);
        class598.method3417(arg0 - 210);
        class227.method1495((byte) 53);
        class555.method3250(-126);
        class625.method3529(true);
        class406.method2438((byte) 54);
        class218.method1467((byte) 116);
        class189.method1346((byte) 127);
        class37.method307(119);
        class370.method2215((byte) -95);
        class166.method1258((byte) -107);
        class498.method2980((byte) 106);
        class570.method3325(arg0 + 28932);
        class45.method358((byte) -122);
        class305.method1861(arg0 ^ 0x57);
        class126.method1001(5822);
        class322.method1923(76);
        class685.method3870(true);
        class194.method1375(false);
        class622.method3506(-28);
        class545.method3197((byte) -71);
        class640.method3601(arg0 ^ 0x54);
        class421.method2491(17065);
        class667.method3757((byte) -61);
        class255.method1624(arg0 - 31);
        class347.method2115((byte) 78);
        class541.method3187(190);
        class477.method2792(-94);
        class453.method2635(false);
        class108.method890(-116);
        class379.method2252(1);
        class53.method420(-1);
        class50.method398(arg0 - 136);
        class659.method3711((byte) -25);
        class514.method3053(-93);
        class137.method1045(arg0 ^ 0x8850);
        class547.method3211(true);
        class165.method1253((byte) -111);
        class124.method995(50);
        class24.method235(125);
        class316.method1908((byte) 8);
        class626.method3533((byte) 110);
        class618.method3493(-96);
        class660.method3713(0);
        class676.method3826((byte) -6);
        class454.method2637(arg0 ^ 0xFFFFFFA9);
        class107.method889((byte) -123);
        class130.method1020(false);
        class265.method1681(arg0 - 74);
        class642.method3614((byte) 50);
        class446.method2603(28330);
        class499.method2985(false);
        class133.method1027((byte) -126);
        class634.method3572(arg0 - 82);
        class296.method1841((byte) -127);
        class106.method886(arg0 ^ 0xB);
        class319.method1914(255);
        class673.method3813(2048);
        class297.method1842(true);
        class436.method2557(Integer.MAX_VALUE);
        class703.method3947(true);
        class41.method337(-121);
        class681.method3851(0);
        class136.method1042(true);
        class658.method3709(arg0 + 5974);
        class597.method3414((byte) 103);
        class677.method3830(16824);
        class617.method3489(-196);
        class122.method981(-15337);
        class638.method3597(-51);
        class275.method1719((byte) 124);
        class577.method3341((byte) 81);
        class688.method3880((byte) 110);
        class521.method3074((byte) 110);
        class473.method2780(false);
        class415.method2472(124);
        class27.method262(124);
        class619.method3498(true);
        class23.method221((byte) 12);
        class17.method196((byte) 115);
        class241.method1562(-652209076);
        class12.method63(0);
        class654.method3688((byte) -9);
        class657.method3707(arg0 ^ 0xFFFFFFC5);
        class263.method1676(16);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method705(int arg0) {
        field1386++;
        if (~class76.field1182 != arg0) {
            this.method712(arg0 + 5);
            return;
        }
        try {
            this.method712(2);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class18.method200(var5.getMessage() + " (Recovered) " + this.method695(50), var5, 10296);
            class251.method1604(101, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method706() {
        int var0 = class643.field9134;
        int[] var1 = class98.field1458;
        boolean var2 = class525.field7713.field5998 == 1 && var0 > 200 || class525.field7713.field5998 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class270 var13 = class76.field1186[var1[var3]];
            if (!var13.method1700((byte) 91)) {
                var13.field2386 = -1;
            } else if (var13.field3856) {
                var13.field2386 = -1;
            } else {
                var13.method1096(90);
                if (var13.field2481 >= 0 && var13.field2484 >= 0 && var13.field2483 < class430.field6136 && var13.field2486 < class580.field8504) {
                    var13.field3857 = var13.field2353 ? var2 : false;
                    if (class103.field1708 == var13) {
                        var13.field2386 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field2389) {
                            var14++;
                        }
                        if (var13.field2435 > class148.field2508) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1108(94) << 2);
                        if (var13.field3886) {
                            var15 += 512;
                        } else {
                            if (class640.field9070 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field2386 = var15 + 1;
                    }
                } else {
                    var13.field2386 = -1;
                }
            }
        }
        for (int var4 = 0; var4 < class310.field4304; var4++) {
            class88 var10 = ((class6) class314.field4359.method2818(-22803, (long) class253.field3667[var4])).field49;
            if (var10.method653((byte) -97) && var10.field1309.method3106((byte) 16, class230.field3404)) {
                var10.method1096(-121);
                if (var10.field2481 >= 0 && var10.field2484 >= 0 && var10.field2483 < class430.field6136 && var10.field2486 < class580.field8504) {
                    int var11 = 0;
                    if (!var10.field2389) {
                        var11++;
                    }
                    if (var10.field2435 > class148.field2508) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1108(95) << 2);
                    if (class640.field9070 == 0) {
                        if (var10.field1309.field7722) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class640.field9070 == 1) {
                        if (var10.field1309.field7722) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field1309.field7725) {
                        var12 += 1024;
                    } else if (!var10.field1309.field7734) {
                        var12 += 256;
                    }
                    var10.field2386 = var12 + 1;
                } else {
                    var10.field2386 = -1;
                }
            } else {
                var10.field2386 = -1;
            }
        }
        for (int var5 = 0; var5 < class481.field6873.length; var5++) {
            class258 var6 = class481.field6873[var5];
            if (var6 != null) {
                if (var6.field3709 == 1) {
                    class6 var7 = (class6) class314.field4359.method2818(-22803, (long) var6.field3705);
                    if (var7 != null) {
                        class88 var8 = var7.field49;
                        if (var8.field2386 >= 0) {
                            var8.field2386 += 2048;
                        }
                    }
                } else if (var6.field3709 == 10) {
                    class270 var9 = class76.field1186[var6.field3705];
                    if (var9 != null && class103.field1708 != var9 && var9.field2386 >= 0) {
                        var9.field2386 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lis;)Lqca;")
    public static final class330 method707(class101 arg0) {
        class330 var1 = (class330) class511.field7608.method2818(-22803, ((long) arg0.field1577 << 32) + (long) arg0.field1528);
        return var1 == null ? arg0.field1590 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final synchronized void method708(boolean arg0) {
        field1374++;
        if (class492.field7063 != null && class126.field2061 == null && !class653.field9220.field9985) {
            try {
                Class var2 = class492.field7063.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class126.field2061 = (Canvas) var3.get(class492.field7063);
                var3.set(class492.field7063, null);
                if (class126.field2061 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method708(arg0);
        if (!arg0) {
            method716(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method709(int arg0) {
        int var1 = class643.field9134;
        int[] var2 = class98.field1458;
        for (int var3 = 0; var3 < class310.field4304 + var1; var3++) {
            class141 var4;
            if (var3 < var1) {
                var4 = class76.field1186[var2[var3]];
            } else {
                var4 = ((class6) class314.field4359.method2818(-22803, (long) class253.field3667[var3 - var1])).field49;
            }
            if (var4.field3158 == arg0 && var4.field2386 >= 0) {
                int var5 = var4.method1108(117);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3155 & 0x1FF) != 0 || (var4.field3154 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field3155 & 0x1FF) != 256 || (var4.field3154 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3155 >> 9;
                    int var7 = var4.field3154 >> 9;
                    if (var4.field2386 > class256.field3692[var6][var7]) {
                        class256.field3692[var6][var7] = var4.field2386;
                        class366.field5086[var6][var7] = 1;
                    } else if (class256.field3692[var6][var7] == var4.field2386) {
                        var10002 = class366.field5086[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field3155 - var8 >> 9;
                    int var10 = var4.field3154 - var8 >> 9;
                    int var11 = var4.field3155 + var8 >> 9;
                    int var12 = var4.field3154 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2386 > class256.field3692[var13][var14]) {
                                class256.field3692[var13][var14] = var4.field2386;
                                class366.field5086[var13][var14] = 1;
                            } else if (class256.field3692[var13][var14] == var4.field2386) {
                                var10002 = class366.field5086[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method710() {
        int var0 = class643.field9134;
        int[] var1 = class98.field1458;
        int var2 = class61.field896 ? var0 : class310.field4304 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class141 var4;
            if (var3 < var0) {
                var4 = class76.field1186[var1[var3]];
            } else {
                var4 = ((class6) class314.field4359.method2818(-22803, (long) class253.field3667[var3 - var0])).field49;
            }
            if (var4.field2386 >= 0) {
                int var5 = var4.method1108(115);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3155 & 0x1FF) == 0 && (var4.field3154 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field3155 & 0x1FF) == 256 && (var4.field3154 & 0x1FF) == 256) {
                    continue;
                }
                var4.field3160 = class603.method3433(var4.field3154, var4.field3158, var4.field3155, -66);
                class333.method1985(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method711(byte arg0) {
        field1379++;
        int var2 = -106 % ((36 - arg0) / 43);
        if (class76.field1182 != 2) {
            this.method713(1);
            return;
        }
        try {
            this.method713(1);
        } catch (ThreadDeath var5) {
            throw var5;
        } catch (Throwable var6) {
            class18.method200(var6.getMessage() + " (Recovered) " + this.method695(50), var6, 10296);
            class251.method1604(86, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    private final void method712(int arg0) {
        field1382++;
        if (class515.field7636 == 14) {
            return;
        }
        class148.field2508++;
        if ((class148.field2508 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class529.field7802 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class262.field3777.setSeed((long) class529.field7802);
        }
        if (class148.field2508 % 50 == 0) {
            class98.field1464 = class437.field6284;
            class437.field6284 = 0;
            class277.field3931 = class163.field2696;
            class163.field2696 = 0;
        }
        this.method694(-19029);
        if (class454.field6530 != null) {
            class454.field6530.method1899(-17895);
        }
        class332.method1976(false);
        class236.field3494.method669((byte) 68);
        class313.field4336.method312(arg0 - 2);
        if (class637.field9048 != null) {
            class637.field9048.method147((int) class254.method1619(true));
        }
        class217.method1464(-1);
        class443.field6418 = 0;
        class30.field453 = 0;
        for (class414 var3 = class236.field3494.method666((byte) 120); var3 != null; var3 = class236.field3494.method666((byte) 23)) {
            int var6 = var3.method2468(101);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2467(24968);
                if (class682.method3860(true) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class699.method3934(arg0 - 27208)) {
                        class298.method1843((byte) -80);
                    } else {
                        class193.method1360(15030);
                    }
                } else if (class443.field6418 < 128) {
                    class336.field4674[class443.field6418] = var3;
                    class443.field6418++;
                }
            } else if (var6 == 0 && class30.field453 < 75) {
                class445.field6442[class30.field453] = var3;
                class30.field453++;
            }
        }
        class165.field2730 = 0;
        if (arg0 != 2) {
            field1378 = null;
        }
        for (class634 var4 = class313.field4336.method313((byte) -73); var4 != null; var4 = class313.field4336.method313((byte) -73)) {
            int var5 = var4.method332((byte) 85);
            if (var5 == -1) {
                class413.field5889.method3904(var4, 0);
            } else if (var5 == 6) {
                class165.field2730 += var4.method338(-9993);
            } else if (class461.method2681(arg0 ^ 0x60891C2B, var5)) {
                class31.field459.method3904(var4, arg0 - 2);
                if (class31.field459.method3890(0) > 10) {
                    class31.field459.method3906(0);
                }
            }
        }
        if (class699.method3934(-27206)) {
            class538.method3169(-14693);
        }
        if (class482.method2819((byte) 118, class515.field7636)) {
            class26.method251(-72);
            class692.method3892(-7848);
        } else if (class183.method1312(arg0 ^ 0xFFFFFFF9, class515.field7636)) {
            class155.method1164(false);
        }
        if (class490.method2871(true, class515.field7636) && !class183.method1312(arg0 ^ 0xFFFFFFF9, class515.field7636)) {
            this.method717(arg0 + 111);
            class551.method3232(31253);
            class437.method2561((byte) 117);
        } else if (class352.method2135(class515.field7636, (byte) -122) && !class183.method1312(-5, class515.field7636)) {
            this.method717(125);
            class437.method2561((byte) 117);
        } else if (class515.field7636 == 12) {
            class437.method2561((byte) 117);
        } else if (class272.method1715(arg0 ^ 0x2, class515.field7636) && !class183.method1312(-5, class515.field7636)) {
            class391.method2377(true);
        } else if (class515.field7636 == 13) {
            class437.method2561((byte) 117);
            if (class565.field8267 != -3 && class565.field8267 != 2 && class565.field8267 != 15) {
                class352.method2133(32074, false);
            }
        }
        class640.method3603(class637.field9048, 0);
        class31.field459.method3906(0);
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method713(int arg0) {
        field1381++;
        if (class515.field7636 == 14) {
            return;
        }
        long var2 = class626.method3530(arg0 - 1) / 1000000L - class689.field9779;
        class689.field9779 = class626.method3530(0) / 1000000L;
        boolean var4 = class241.method1561(-88);
        if (var4 && class369.field5120 && class313.field4341 != null) {
            class313.field4341.method1060((byte) -88);
        }
        if (class312.method1887(class515.field7636, (byte) 113)) {
            if (class382.field5353 != 0L && class382.field5353 < class254.method1619(true)) {
                class246.method1584((byte) 118, class525.field7713.field5965, class154.method1160(17), false, class525.field7713.field5976);
            } else if (!class637.field9048.method816() && class183.field2879) {
                class692.method3897(true);
            }
        }
        if (class35.field490 == null) {
            Container var5;
            if (class699.field9906 != null) {
                var5 = class699.field9906;
            } else if (class492.field7063 == null) {
                var5 = class107.field1756;
            } else {
                var5 = class492.field7063;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class699.field9906 == var5) {
                Insets var8 = class699.field9906.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class521.field7686 != var6 || class122.field1985 != var7 || class438.field6302) {
                if (class637.field9048 == null || class637.field9048.method766()) {
                    class571.method3329((byte) 122);
                } else {
                    class122.field1985 = var7;
                    class521.field7686 = var6;
                }
                class382.field5353 = class254.method1619(true) + 500L;
                class438.field6302 = false;
            }
        }
        if (class35.field490 != null && !class54.field710 && class312.method1887(class515.field7636, (byte) 49)) {
            class246.method1584((byte) -96, -1, class525.field7713.field5974, false, -1);
        }
        boolean var9 = false;
        if (class73.field1166) {
            var9 = true;
            class73.field1166 = false;
        }
        if (var9) {
            class461.method2680(true);
        }
        if (class637.field9048 != null && class637.field9048.method816() || class154.method1160(-111) != 1) {
            class498.method2983(-13);
        }
        if (class482.method2819((byte) -32, class515.field7636)) {
            class457.method2652(42, var9);
        } else if (class99.method829((byte) -121, class515.field7636)) {
            class210.method1445(0);
        } else if (class331.method1964(class515.field7636, 96)) {
            class210.method1445(0);
        } else if (class183.method1312(-5, class515.field7636)) {
            if (class105.field1736 == 1) {
                if (class73.field1169 > class256.field3691) {
                    class256.field3691 = class73.field1169;
                }
                int var10 = (class256.field3691 - class73.field1169) * 50 / class256.field3691;
                class194.method1361(class637.field9048, (byte) -12, true, class399.field5763, class335.field4670, class343.field4761.method2059(class238.field3511, true) + "<br>(" + var10 + "%)");
            } else if (class105.field1736 == 2) {
                if (class113.field1806 > class304.field4256) {
                    class304.field4256 = class113.field1806;
                }
                int var11 = (class304.field4256 - class113.field1806) * 50 / class304.field4256 + 50;
                class194.method1361(class637.field9048, (byte) -12, true, class399.field5763, class335.field4670, class343.field4761.method2059(class238.field3511, true) + "<br>(" + var11 + "%)");
            } else {
                class194.method1361(class637.field9048, (byte) -12, true, class399.field5763, class335.field4670, class343.field4761.method2059(class238.field3511, true));
            }
        } else if (class515.field7636 == 10) {
            class89.method670(1, var2);
        } else if (class515.field7636 == 13) {
            class194.method1361(class637.field9048, (byte) -12, false, class399.field5763, class335.field4670, class343.field4763.method2059(class238.field3511, true) + "<br>" + class343.field4764.method2059(class238.field3511, true));
        }
        if (class548.field8046 == 3) {
            for (int var12 = 0; var12 < class43.field586; var12++) {
                Rectangle var13 = class50.field666[var12];
                if (class392.field5701[var12]) {
                    class637.field9048.method792(var13.height, (byte) -88, var13.width, var13.y, -1996553985, var13.x);
                } else if (class221.field3297[var12]) {
                    class637.field9048.method792(var13.height, (byte) -88, var13.width, var13.y, -1996554240, var13.x);
                }
            }
        }
        if (class699.method3934(-27206)) {
            class218.method1469(class637.field9048, (byte) -121);
        }
        if (class653.field9220.field9985 && class312.method1887(class515.field7636, (byte) 74) && class548.field8046 == 0 && class154.method1160(8) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class43.field586; var15++) {
                if (class221.field3297[var15]) {
                    class221.field3297[var15] = false;
                    class539.field7924[var14++] = class50.field666[var15];
                }
            }
            try {
                class637.field9048.method93(class539.field7924, var14);
            } catch (class300 var19) {
            }
        } else if (!class482.method2819((byte) -33, class515.field7636)) {
            for (int var16 = 0; var16 < class43.field586; var16++) {
                class221.field3297[var16] = false;
            }
            try {
                class637.field9048.method87();
            } catch (class300 var18) {
                class18.method200(var18.getMessage() + " (Recovered) " + this.method695(arg0 + 49), var18, 10296);
                class251.method1604(arg0 ^ 0x7C, 0);
            }
        }
        if (class525.field7713.field6006 == 0) {
            class564.method3300((byte) 121, 15L);
        } else if (class525.field7713.field6006 == 1) {
            class564.method3300((byte) 110, 10L);
        } else if (class525.field7713.field6006 == 2) {
            class564.method3300((byte) 114, 5L);
        } else if (class525.field7713.field6006 == 3) {
            class564.method3300((byte) 122, 2L);
        }
        if (arg0 != 1) {
            field1377 = 37;
        }
        if (class114.field1824) {
            class149.method1136(false);
        }
        if (class525.field7713.field5970 && class515.field7636 == 3 && class557.field8146 != -1) {
            class525.field7713.field5970 = false;
            class525.field7713.method3481(true, class653.field9220);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lis;)Z")
    public static final boolean method714(class101 arg0) {
        if (class88.field1324) {
            if (method707(arg0).field4572 != 0) {
                return false;
            }
            if (arg0.field1584 == 0) {
                return false;
            }
        }
        return arg0.field1537;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method715(byte arg0) {
        field1370++;
        if (class609.field8751) {
            class539.method3174((byte) -103);
        }
        class255.method1625(false);
        if (class637.field9048 != null) {
            class637.field9048.method753(1);
        }
        if (class35.field490 != null) {
            class247.method1590(class653.field9220, -2, class35.field490);
            class35.field490 = null;
        }
        if (arg0 != -56) {
            return;
        }
        if (class256.field3696 != null) {
            class256.field3696.method913(arg0 - 10350);
            class256.field3696 = null;
        }
        class272.method1713((byte) 13);
        class511.field7607.method1524(4);
        class644.field9145.method352(108);
        if (class294.field4105 != null) {
            class294.field4105.method1549(-24283);
            class294.field4105 = null;
        }
        try {
            class11.field133.method2575((byte) 0);
            for (int var2 = 0; var2 < 35; var2++) {
                class600.field8657[var2].method2575((byte) 0);
            }
            class530.field7821.method2575((byte) 0);
            class347.field4908.method2575((byte) 0);
            class196.method1383(arg0 + 146);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lis;)Lis;")
    public static final class101 method716(class101 arg0) {
        int var1 = method707(arg0).method1956(528944786);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class271.method1711(arg0.field1539, 23727);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1372++;
        if (!this.method988(false)) {
            return;
        }
        class494.field7085 = new class309();
        class494.field7085.field4294 = Integer.parseInt(this.getParameter("worldid"));
        class572.field8418 = new class309();
        class572.field8418.field4294 = Integer.parseInt(this.getParameter("lobbyid"));
        class572.field8418.field4286 = this.getParameter("lobbyaddress");
        class233.field3457 = new class309();
        class233.field3457.field4294 = Integer.parseInt(this.getParameter("demoid"));
        class233.field3457.field4286 = this.getParameter("demoaddress");
        class554.field8103 = class546.method3205(Integer.parseInt(this.getParameter("modewhere")), (byte) -126);
        if (class554.field8103 == class434.field6248) {
            class554.field8103 = class443.field6422;
        } else if (!class536.method3145(class554.field8103, (byte) 98) && class554.field8103 != class205.field3174) {
            class554.field8103 = class205.field3174;
        }
        class358.field4999 = class395.method2397(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class440.field6367 != class358.field4999 && class480.field6872 != class358.field4999 && class358.field4999 != class198.field3079) {
            class358.field4999 = class198.field3079;
        }
        try {
            class238.field3511 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class238.field3511 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class522.field7697 = true;
        } else {
            class522.field7697 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class318.field4389 = true;
        } else {
            class318.field4389 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class625.field8913 = true;
        } else {
            class625.field8913 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class486.field6942 = class470.field6783;
            } else if (var4.equals("1")) {
                class486.field6942 = class302.field4235;
            }
        }
        try {
            class557.field8151 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class557.field8151 = 0;
        }
        class522.field7689 = this.getParameter("quiturl");
        class251.field3625 = this.getParameter("settings");
        if (class251.field3625 == null) {
            class251.field3625 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class434.field6245 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class434.field6245 = 0;
            }
        }
        class446.field6456 = Integer.parseInt(this.getParameter("colourid"));
        if (class446.field6456 < 0 || class505.field7506.length <= class446.field6456) {
            class446.field6456 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class42.field564 = true;
            class165.field2721 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class508.field7568 = true;
        }
        class640.field9072 = this.getParameter("sskey");
        if (class640.field9072 != null && class640.field9072.length() < 2) {
            class640.field9072 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class196.field3066 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class548.field8044 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class461.field6627 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class529.field7808 = this.getParameter("additionalInfo");
        if (class529.field7808 != null && class529.field7808.length() > 50) {
            class529.field7808 = null;
        }
        if (class486.field6942 == class470.field6783) {
            class140.field2349 = 503;
            class570.field8333 = 765;
        } else if (class486.field6942 == class302.field4235) {
            class570.field8333 = 640;
            class140.field2349 = 480;
        }
        class573.field8424 = this;
        this.method993(35, class358.field4999.method3070(-21392) + 32, class486.field6942.field7804, 624, (byte) -78, class570.field8333, class140.field2349);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method717(int arg0) {
        if (class515.field7636 == 7 && class160.field2597 == 0) {
            if (class26.field363 > 1) {
                class26.field363--;
                class587.field8579 = class330.field4562;
            }
            if (!class324.field4519) {
                class96.method725(false);
            }
            for (int var2 = 0; var2 < 100 && class119.method967((byte) -113); var2++) {
            }
        }
        field1376++;
        class193.field2993++;
        class390.method2374(false, -1, null, -1);
        class25.method244(-1, -1, null, -122);
        class669.method3773(6123);
        class330.field4562++;
        for (int var3 = 0; var3 < class392.field5702; var3++) {
            class88 var4 = class82.field1259[var3].field49;
            if (var4 != null) {
                byte var5 = var4.field1309.field7791;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1108(93);
                    if ((var5 & 0x2) != 0 && var4.field2452 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field2454[0] + var7;
                            int var10 = var4.field2459[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class430.field6136 - var6 - 1 < var9) {
                                var9 = class430.field6136 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class580.field8504 - var6 - 1 < var10) {
                                var10 = class580.field8504 - var6 - 1;
                            }
                            int var11 = class582.method3367(class45.field609[var4.field3158], 0, true, -1, var4.field2459[0], var6, class237.field3505, var10, 124, var9, 0, var6, var6, var4.field2454[0], class405.field5811);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field2454[var12] = class237.field3505[var11 - var12 - 1];
                                    var4.field2459[var12] = class405.field5811[var11 - var12 - 1];
                                    var4.field2457[var12] = 1;
                                }
                                var4.field2452 = var11;
                            }
                        }
                    }
                    class465.method2722(var4, (byte) 67, true);
                    int var13 = class104.method877(true, var4);
                    class33.method296(32768, var4);
                    class266.method1686(var4, class625.field8910, var13, (byte) -31, class694.field9861);
                    class192.method1358(class694.field9861, (byte) 98, var4);
                    class674.method3817(-118, var4);
                }
            }
        }
        if (class160.field2597 == 0 && class250.field3623 == 0) {
            if (class40.field544 == 2) {
                class156.method1172(false);
            } else {
                class692.method3898(1);
            }
            if ((class551.field8078 >> 9) < 14 || class430.field6136 - 14 <= class551.field8078 >> 9 || class322.field4478 >> 9 < 14 || (class322.field4478 >> 9) >= (class580.field8504 - 14)) {
                class624.method3523((byte) 112);
            }
        }
        if (arg0 <= 20) {
            method702(-19);
        }
        while (true) {
            class400 var14;
            class101 var15;
            class101 var16;
            do {
                var14 = (class400) class583.field8542.method3906(0);
                if (var14 == null) {
                    while (true) {
                        class400 var17;
                        class101 var18;
                        class101 var19;
                        do {
                            var17 = (class400) class556.field8137.method3906(0);
                            if (var17 == null) {
                                while (true) {
                                    class400 var20;
                                    class101 var21;
                                    class101 var22;
                                    do {
                                        var20 = (class400) class286.field4012.method3906(0);
                                        if (var20 == null) {
                                            if (class512.field7616 != null) {
                                                class454.method2638(-3);
                                            }
                                            if ((class148.field2508 % 1500) == 0) {
                                                class107.method887(-403);
                                            }
                                            if (class515.field7636 == 7 && class160.field2597 == 0) {
                                                class659.method3710(10);
                                            }
                                            class135.method1035(16628);
                                            if (class609.field8751 && class254.method1619(true) - 60000L > class662.field9304) {
                                                class539.method3174((byte) -103);
                                            }
                                            for (class499 var23 = (class499) class678.field9654.method3313((byte) 45); var23 != null; var23 = (class499) class678.field9654.method3308(12)) {
                                                if (((long) var23.field7415) < (class254.method1619(true) / 1000L - 5L)) {
                                                    if (var23.field7417 > 0) {
                                                        class418.method2478(5, "", "", var23.field7421 + class343.field4768.method2059(class238.field3511, true), 0, "", 0);
                                                    }
                                                    if (var23.field7417 == 0) {
                                                        class418.method2478(5, "", "", var23.field7421 + class343.field4769.method2059(class238.field3511, true), 0, "", 0);
                                                    }
                                                    var23.method3421(3);
                                                }
                                            }
                                            if (class515.field7636 == 7 && class160.field2597 == 0) {
                                                if (class256.field3696 == null) {
                                                    class352.method2133(32074, false);
                                                    return;
                                                }
                                                class510.field7592++;
                                                if (class510.field7592 > 50) {
                                                    class425.field6065++;
                                                    class699 var24 = class452.method2630(class699.field9897, class396.field5727, (byte) 121);
                                                    class149.method1134(var24, true);
                                                }
                                                try {
                                                    class557.method3263(38);
                                                    return;
                                                } catch (IOException var25) {
                                                    class352.method2133(32074, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field5783;
                                        if (var21.field1528 < 0) {
                                            break;
                                        }
                                        var22 = class271.method1711(var21.field1539, 23727);
                                    } while (var22 == null || var22.field1578 == null || var22.field1578.length <= var21.field1528 || var22.field1578[var21.field1528] != var21);
                                    class362.method2171(var20);
                                }
                            }
                            var18 = var17.field5783;
                            if (var18.field1528 < 0) {
                                break;
                            }
                            var19 = class271.method1711(var18.field1539, 23727);
                        } while (var19 == null || var19.field1578 == null || var19.field1578.length <= var18.field1528 || var19.field1578[var18.field1528] != var18);
                        class362.method2171(var17);
                    }
                }
                var15 = var14.field5783;
                if (var15.field1528 < 0) {
                    break;
                }
                var16 = class271.method1711(var15.field1539, 23727);
            } while (var16 == null || var16.field1578 == null || var16.field1578.length <= var15.field1528 || var16.field1578[var15.field1528] != var15);
            class362.method2171(var14);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method718(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; var0 < field1378.length; var0++) {
            field1378[var0] = new class565();
        }
    }
}
