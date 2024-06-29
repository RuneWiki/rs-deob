import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class476 {

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field3984 = true;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field3992 = 64;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lcea;")
    public static class216 field3977;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Lrj;")
    public static class597 field3995;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3991;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Ljava/lang/Class;")
    public static Class field3999;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "Z")
    public static boolean field4000;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1813(boolean arg0) {
        if (!arg0) {
            field3991 = null;
        }
        field3988++;
        boolean var2 = class437.field5817.method4214(0);
        if (!var2) {
            this.method1823((byte) 103);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method1814(byte arg0) {
        field3997++;
        if (arg0 > -75) {
            field3990 = 3;
        }
        String var2 = null;
        try {
            var2 = "[1)" + class332.field4232 + "," + class447.field5936 + "," + class409.field5183 + "," + class543.field7597 + "|";
            if (class380.field4847 != null) {
                var2 = var2 + "2)" + class472.field6329 + "," + (class380.field4847.field264[0] + class332.field4232) + "," + (class380.field4847.field260[0] + class447.field5936) + "|";
            }
            var2 = var2 + "3)" + class748.field10451.field10399.method1924((byte) 72) + "|4)" + class748.field10451.field10389.method3020((byte) -72) + "|5)" + class120.method926(15492) + "|6)" + class356.field4586 + "," + class466.field6263 + "|";
            var2 = var2 + "7)" + class748.field10451.field10427.method4196((byte) -120) + "|";
            var2 = var2 + "8)" + class748.field10451.field10410.method3447((byte) -79) + "|";
            var2 = var2 + "9)" + class748.field10451.field10414.method2470((byte) -128) + "|";
            var2 = var2 + "10)" + class748.field10451.field10420.method1877((byte) -111) + "|";
            var2 = var2 + "11)" + class748.field10451.field10416.method3100((byte) 83) + "|";
            var2 = var2 + "12)" + class748.field10451.field10412.method1806((byte) 96) + "|";
            var2 = var2 + "13)" + field3992 + "|";
            var2 = var2 + "14)" + class27.field484;
            if (class323.field4162 != null) {
                var2 = var2 + "|15)" + class323.field4162.field367;
            }
            try {
                if (class748.field10451.field10399.method1924((byte) -52) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3999 == null ? (field3999 = method1840("client")) : field3999).getClassLoader());
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)[Lkg;")
    public static final class275[] method1815(int arg0) {
        field3974++;
        int var1 = -103 % ((-arg0 - 5) / 51);
        return new class275[] { class631.field8713, class484.field6937, class589.field8258, class577.field8099, class552.field7707, class745.field10380, class665.field9360, class555.field7729, class373.field4788, class706.field9782, class84.field1154, class253.field3237, class353.field4535, class253.field3225, class141.field2006, class738.field10247, class647.field8962, class6.field62, class526.field7344, class31.field529, class681.field9505, class745.field10381, class114.field1638, class435.field5789, class537.field7447, class121.field1761, class631.field8714, class701.field9758, class80.field1106, class698.field9720, class93.field1304, class172.field2380, class6.field63, class761.field10614, class286.field3597, class286.field3603, class718.field9990, class618.field8528, class348.field4490, class310.field4083, class658.field9157, class139.field1986, class359.field4654, class408.field5176, class648.field8971, class641.field8898, class257.field3261, class592.field8279, class692.field9625, class717.field9974, class273.field3423, class201.field2709, class756.field10545, class564.field7934, class474.field6376, class525.field7331, class48.field686, class555.field7730, class368.field4744, class244.field3160, class762.field10626, class126.field1800, class285.field3594, class733.field10200, class526.field7346, class625.field8591, class555.field7724, class36.field566, class378.field4830, class701.field9753, class242.field3130, class705.field9775, class263.field3318, class757.field10549, class267.field3362, class725.field10112, class729.field10145, class550.field7682, class560.field7903, class98.field1365, class136.field1952, class540.field7487, class69.field970, class564.field7928, class725.field10111, class672.field9411, class256.field3256, class56.field794, class507.field7156, class9.field122, class507.field7155, class142.field2014, class339.field4291, class322.field4150, class6.field61, class680.field9493, class236.field3074, class653.field9080, class556.field7737, class205.field2725, class479.field6522, class625.field8597, class239.field3103, class697.field9706, class175.field2443, class124.field1792, class468.field6277, class587.field8201, class356.field4575, class603.field8374, class663.field9343, class653.field9091, class638.field8789, class64.field894, class287.field3611, class92.field1266, class299.field3929, class24.field448, class747.field10442, class692.field9623, class654.field9106, class498.field7014 };
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1816() {
        int var0 = class416.field5303;
        int[] var1 = class657.field9155;
        int var2 = class748.field10451.field10392.method1294((byte) -82);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class724 var14 = class5.field49[var1[var4]];
            if (!var14.method4044((byte) 114)) {
                var14.field166 = -1;
            } else if (var14.field10102) {
                var14.field166 = -1;
            } else {
                var14.method80(-1);
                if (var14.field7734 >= 0 && var14.field7746 >= 0 && var14.field7741 < class409.field5183 && var14.field7744 < class543.field7597) {
                    var14.field10084 = var14.field239 ? var3 : false;
                    if (class380.field4847 == var14) {
                        var14.field166 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field206) {
                            var15++;
                        }
                        if (var14.field241 > class463.field6224) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method82((byte) 49) << 2);
                        if (var14.field10074) {
                            var16 += 512;
                        } else {
                            if (class13.field213 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field166 = var16 + 1;
                    }
                } else {
                    var14.field166 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class646.field8947; var5++) {
            class733 var11 = ((class592) class207.field2745.method1160((long) class751.field10483[var5], 123)).field8280;
            if (var11.method4095((byte) 114) && var11.field10192.method978(class516.field7236, -23853)) {
                var11.method80(-1);
                if (var11.field7734 >= 0 && var11.field7746 >= 0 && var11.field7741 < class409.field5183 && var11.field7744 < class543.field7597) {
                    int var12 = 0;
                    if (!var11.field206) {
                        var12++;
                    }
                    if (var11.field241 > class463.field6224) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method82((byte) 49) << 2);
                    if (class13.field213 == 0) {
                        if (var11.field10192.field1911) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class13.field213 == 1) {
                        if (var11.field10192.field1911) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field10192.field1847) {
                        var13 += 1024;
                    } else if (!var11.field10192.field1891) {
                        var13 += 256;
                    }
                    var11.field166 = var13 + 1;
                } else {
                    var11.field166 = -1;
                }
            } else {
                var11.field166 = -1;
            }
        }
        for (int var6 = 0; var6 < class98.field1369.length; var6++) {
            class323 var7 = class98.field1369[var6];
            if (var7 != null) {
                if (var7.field4163 == 1) {
                    class592 var8 = (class592) class207.field2745.method1160((long) var7.field4156, 125);
                    if (var8 != null) {
                        class733 var9 = var8.field8280;
                        if (var9.field166 >= 0) {
                            var9.field166 += 2048;
                        }
                    }
                } else if (var7.field4163 == 10) {
                    class724 var10 = class5.field49[var7.field4156];
                    if (var10 != null && class380.field4847 != var10 && var10.field166 >= 0) {
                        var10.field166 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method1817(boolean arg0) {
        field3976++;
        if (class27.field484 == 14) {
            return;
        }
        class463.field6224++;
        if ((class463.field6224 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class28.field503 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class653.field9089.setSeed((long) class28.field503);
        }
        if (class463.field6224 % 50 == 0) {
            class63.field881 = class214.field2828;
            class214.field2828 = 0;
            class298.field3913 = class319.field4124;
            class319.field4124 = 0;
        }
        this.method1813(true);
        if (class706.field9779 != null) {
            class706.field9779.method3350(-23539);
        }
        class142.method1027(-1);
        class565.method3254((byte) 23);
        class349.field4502.method210((byte) -17);
        class680.field9495.method1111(-118);
        if (class386.field4930 != null) {
            class386.field4930.method448((int) class446.method2525(500));
        }
        class400.method2238(87);
        class383.field4860 = 0;
        class426.field5715 = 0;
        for (class704 var3 = class349.field4502.method208(113); var3 != null; var3 = class349.field4502.method208(126)) {
            int var6 = var3.method2105(23046);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2106(-3733);
                if (class649.method3638((byte) -53) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class756.method4202(false)) {
                        class596.method3379((byte) -95);
                    } else {
                        class43.method308(61);
                    }
                } else if (class426.field5715 < 128) {
                    class26.field472[class426.field5715] = var3;
                    class426.field5715++;
                }
            } else if (var6 == 0 && class383.field4860 < 75) {
                class293.field3861[class383.field4860] = var3;
                class383.field4860++;
            }
        }
        class688.field9584 = 0;
        for (class614 var4 = class680.field9495.method1114(-28128); var4 != null; var4 = class680.field9495.method1114(-28128)) {
            int var5 = var4.method1426(1600925004);
            if (var5 == -1) {
                class239.field3101.method3671(var4, false);
            } else if (var5 == 6) {
                class688.field9584 += var4.method1424(18);
            } else if (class98.method783(arg0, var5)) {
                class235.field3065.method3671(var4, arg0);
                if (class235.field3065.method3666(0) > 10) {
                    class235.field3065.method3665(23290);
                }
            }
        }
        if (class756.method4202(arg0)) {
            class724.method4045(-104);
        }
        if (class697.method3924((byte) -104, class27.field484)) {
            class6.method32(1);
            class490.method2894(-128);
        } else if (class573.method3282(class27.field484, 111)) {
            class739.method4120(false);
        }
        if (class654.method3674((byte) 107, class27.field484) && !class573.method3282(class27.field484, 66)) {
            this.method1839(1);
            class429.method2462((byte) -4);
            class356.method2070(18102);
        } else if (class575.method3299(class27.field484, true) && !class573.method3282(class27.field484, 67)) {
            this.method1839(1);
            class356.method2070(18102);
        } else if (class27.field484 == 12) {
            class356.method2070(18102);
        } else if (class102.method816(class27.field484, (byte) 125) && !class573.method3282(class27.field484, -81)) {
            class337.method1943(101);
        } else if (class27.field484 == 13) {
            class356.method2070(18102);
            if (class117.field1727 != -3 && class117.field1727 != 2 && class117.field1727 != 15) {
                class98.method785((byte) 87, false);
            }
        }
        class48.method365(0, class386.field4930);
        class235.field3065.method3665(23290);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1818(int arg0, int arg1) {
        class701.field9760 = null;
        class437.field5817.field10573 = arg0;
        int var3 = 75 / ((70 - arg1) / 53);
        class437.field5817.field10572++;
        field3980++;
        class309.field4069 = 0;
        class239.field3102 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1819(boolean arg0) {
        field3998++;
        if (arg0) {
            field3995 = null;
        }
        if (class748.field10451.field10399.method1924((byte) -66) != 2) {
            this.method1817(false);
            return;
        }
        try {
            this.method1817(false);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class684.method3842(1, var5, var5.getMessage() + " (Recovered) " + this.method1814((byte) -125));
            class583.field8154 = true;
            class415.method2331(false, 0, -4);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1820(byte arg0) {
        if (arg0 != -10) {
            field3992 = -37;
        }
        field3985++;
        if (class721.field10035) {
            field3992 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class386.method2195(-58);
        class223.field2977 = new class558(class162.field2227);
        class437.field5817 = new class757();
        class259.method1566(new int[] { 1000, 100 }, new int[] { 20, 260 }, (byte) 20);
        if (class7.field75 != class225.field2991) {
            class130.field1842 = new byte[50][];
        }
        class748.field10451 = class106.method856(false);
        if (class7.field75 == class225.field2991) {
            class90.field1247.field1938 = this.getCodeBase().getHost();
        } else if (class231.method1464(class225.field2991, (byte) 60)) {
            class90.field1247.field1938 = this.getCodeBase().getHost();
            class90.field1247.field1933 = class90.field1247.field1929 + 40000;
            class345.field4358.field1933 = class345.field4358.field1929 + 40000;
            class476.field6434.field1933 = class476.field6434.field1929 + 40000;
            class90.field1247.field1927 = class90.field1247.field1929 + 50000;
            class345.field4358.field1927 = class345.field4358.field1929 + 50000;
            class476.field6434.field1927 = class476.field6434.field1929 + 50000;
        } else if (class225.field2991 == class16.field325) {
            class90.field1247.field1938 = "127.0.0.1";
            class345.field4358.field1938 = "127.0.0.1";
            class90.field1247.field1933 = class90.field1247.field1929 + 40000;
            class476.field6434.field1938 = "127.0.0.1";
            class345.field4358.field1933 = class345.field4358.field1929 + 40000;
            class476.field6434.field1933 = class476.field6434.field1929 + 40000;
            class90.field1247.field1927 = class90.field1247.field1929 + 50000;
            class345.field4358.field1927 = class345.field4358.field1929 + 50000;
            class476.field6434.field1927 = class476.field6434.field1929 + 50000;
        }
        class292.field3842 = class90.field1247;
        if (class722.field10048 == class293.field3867) {
            class599.field8344 = true;
            class453.field5994 = class632.field8722;
            class404.field5109 = class685.field9547;
            class432.field5768 = 0;
            class605.field8416 = 16777215;
        } else if (class683.field9520 == class293.field3867) {
            class404.field5109 = class35.field562;
            class453.field5994 = class417.field5318;
        } else {
            class453.field5994 = class249.field3204;
            class404.field5109 = class638.field8792;
        }
        if (class293.field3867 == class211.field2791) {
            class650.field9028 = false;
        }
        class295.field3891 = class109.field1580 = class395.field5004 = class520.field7297 = new short[256];
        try {
            field3991 = class654.field9104.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class349.field4502 = class100.method802(class262.field3311, (byte) 123);
        class680.field9495 = class713.method3981(88, true, class262.field3311);
        try {
            if (class162.field2227.field6236 != null) {
                class611.field8463 = new class748(class162.field2227.field6236, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class91.field1250[var3] = new class748(class162.field2227.field6242[var3], 6000, 0);
                }
                class752.field10498 = new class748(class162.field2227.field6248, 6000, 0);
                class656.field9141 = new class387(255, class611.field8463, class752.field10498, 500000);
                class605.field8418 = new class748(class162.field2227.field6230, 24, 0);
                class162.field2227.field6242 = null;
                class162.field2227.field6236 = null;
                class162.field2227.field6230 = null;
                class162.field2227.field6248 = null;
            }
        } catch (IOException var5) {
            class752.field10498 = null;
            class656.field9141 = null;
            class605.field8418 = null;
            class611.field8463 = null;
        }
        if (class7.field75 != class225.field2991) {
            class556.field7748 = true;
        }
        class367.field4736 = class454.field6015.method2547(-105, class243.field3143);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lria;)Z")
    public static final boolean method1821(class288 arg0) {
        if (class711.field9869) {
            if (method1833(arg0).field3291 != 0) {
                return false;
            }
            if (arg0.field3655 == 0) {
                return false;
            }
        }
        return arg0.field3637;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1822(int arg0) {
        if (class473.field6353) {
            class548.method3187(true);
        }
        field3979++;
        class655.method3681(arg0);
        if (class386.field4930 != null) {
            class386.field4930.method478((byte) 68);
        }
        if (class353.field4533 != null) {
            class621.method3495((byte) 8, class353.field4533, class162.field2227);
            class353.field4533 = null;
        }
        if (class12.field143 != null) {
            class12.field143.method2307(-1884375310);
            class12.field143 = null;
        }
        class387.method2206(false);
        class437.field5817.method4208(0);
        class223.field2977.method3216((byte) 83);
        if (class140.field1993 != null) {
            class140.field1993.method1784((byte) -127);
            class140.field1993 = null;
        }
        try {
            class611.field8463.method4168((byte) -122);
            for (int var2 = 0; var2 < 37; var2++) {
                class91.field1250[var2].method4168((byte) -122);
            }
            class752.field10498.method4168((byte) -122);
            class605.field8418.method4168((byte) -122);
            class232.method1466(-1383906493);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1823(byte arg0) {
        field3975++;
        if (class437.field5817.field10572 > class631.field8717) {
            class292.field3842.method990(0);
            class123.field1783 = (class437.field5817.field10572 * 50 - 50) * 5;
            if (class123.field1783 > 3000) {
                class123.field1783 = 3000;
            }
            if (class437.field5817.field10572 >= 2 && class437.field5817.field10573 == 6) {
                this.method2726("js5connect_outofdate", 57);
                class27.field484 = 14;
                return;
            }
            if (class437.field5817.field10572 >= 4 && class437.field5817.field10573 == -1) {
                this.method2726("js5crc", 57);
                class27.field484 = 14;
                return;
            }
            if (class437.field5817.field10572 >= 4 && class697.method3924((byte) -105, class27.field484)) {
                if (class437.field5817.field10573 == 7 || class437.field5817.field10573 == 9) {
                    this.method2726("js5connect_full", 57);
                } else if (class437.field5817.field10573 <= 0) {
                    this.method2726("js5io", 57);
                } else if (class651.field9049 == null) {
                    this.method2726("js5connect", 57);
                } else {
                    this.method2726("js5proxy_" + class651.field9049.trim(), 57);
                }
                class27.field484 = 14;
                return;
            }
        }
        class631.field8717 = class437.field5817.field10572;
        int var2 = -27 % ((23 - arg0) / 58);
        if (class123.field1783 > 0) {
            class123.field1783--;
            return;
        }
        try {
            if (class309.field4069 == 0) {
                class701.field9760 = class292.field3842.method992(31687, class162.field2227);
                class309.field4069++;
            }
            if (class309.field4069 == 1) {
                if (class701.field9760.field2538 == 2) {
                    if (class701.field9760.field2540 != null) {
                        class651.field9049 = (String) class701.field9760.field2540;
                    }
                    this.method1818(1000, 127);
                    return;
                }
                if (class701.field9760.field2538 == 1) {
                    class309.field4069++;
                }
            }
            if (class309.field4069 == 2) {
                class239.field3102 = new class444((Socket) class701.field9760.field2540, class162.field2227, 25000);
                class461 var3 = new class461(5);
                var3.method2578(class262.field3299.field7471, -1221492240);
                var3.method2568(638, -535701016);
                class239.field3102.method2512(0, 5, var3.field6180, 0);
                class309.field4069++;
                class86.field1203 = class446.method2525(500);
            }
            if (class309.field4069 == 3) {
                if (class697.method3924((byte) -90, class27.field484) || class239.field3102.method2515(0) > 0) {
                    int var4 = class239.field3102.method2519(3);
                    if (var4 != 0) {
                        this.method1818(var4, -46);
                        return;
                    }
                    class309.field4069++;
                } else if (class446.method2525(500) - class86.field1203 > 30000L) {
                    this.method1818(1001, 124);
                    return;
                }
            }
            if (class309.field4069 == 4) {
                boolean var5 = class697.method3924((byte) -98, class27.field484) || class654.method3674((byte) 107, class27.field484) || class575.method3299(class27.field484, true);
                class649[] var6 = class649.method3643((byte) -65);
                class461 var7 = new class461(var6.length * 4);
                class239.field3102.method2513(0, var7.field6180, true, var7.field6180.length);
                for (int var8 = 0; var8 < var6.length; var8++) {
                    var6[var8].method3636(var7.method2622(-539564808), (byte) 120);
                }
                class437.field5817.method4210(class239.field3102, 0, !var5);
                class309.field4069 = 0;
                class239.field3102 = null;
                class701.field9760 = null;
            }
        } catch (IOException var9) {
            this.method1818(1002, -27);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        int var1 = class416.field5303;
        int[] var2 = class657.field9155;
        int var3 = class310.field4081 ? var1 : class646.field8947 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class13 var5;
            if (var4 < var1) {
                var5 = class5.field49[var2[var4]];
            } else {
                var5 = ((class592) class207.field2745.method1160((long) class751.field10483[var4 - var1], 120)).field8280;
            }
            if (var5.field5796 == arg0) {
                var5.field227 = 0;
                if (var5.field166 < 0) {
                    var5.field206 = false;
                } else {
                    int var6 = var5.method82((byte) 49);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5801 & 0x1FF) != 0 || (var5.field5797 & 0x1FF) != 0) {
                            var5.field206 = false;
                            continue;
                        }
                    } else if ((var5.field5801 & 0x1FF) != 256 || (var5.field5797 & 0x1FF) != 256) {
                        var5.field206 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5801 >> 9;
                        int var8 = var5.field5797 >> 9;
                        if (class331.field4227[var7][var8] != var5.field166) {
                            var5.field206 = true;
                            continue;
                        }
                        if (class125.field1796[var7][var8] > 1) {
                            var10002 = class125.field1796[var7][var8]--;
                            var5.field206 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field5801 - var9 >> 9;
                        int var11 = var5.field5797 - var9 >> 9;
                        int var12 = var5.field5801 + var9 >> 9;
                        int var13 = var5.field5797 + var9 >> 9;
                        if (!class58.method422(var13, var12, 30203, var10, var11, var5.field166)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class331.field4227[var14][var15] == var5.field166) {
                                        var10002 = class125.field1796[var14][var15]--;
                                    }
                                }
                            }
                            var5.field206 = true;
                            continue;
                        }
                    }
                    var5.field206 = false;
                    var5.field5800 = class225.method1448(var5.field5796, var5.field5801, var5.field5797, (byte) 28);
                    class582.method3315(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3993++;
        try {
            if (arg0.length != 6) {
                class655.method3682("Argument count", (byte) -125);
            }
            class90.field1247 = new class134();
            class90.field1247.field1929 = Integer.parseInt(arg0[0]);
            class345.field4358 = new class134();
            class345.field4358.field1929 = Integer.parseInt(arg0[1]);
            class476.field6434 = new class134();
            class476.field6434.field1929 = Integer.parseInt(arg0[2]);
            class225.field2991 = class16.field325;
            if (arg0[3].equals("live")) {
                class660.field9195 = class315.field4105;
            } else if (arg0[3].equals("rc")) {
                class660.field9195 = class26.field469;
            } else if (arg0[3].equals("wip")) {
                class660.field9195 = class542.field7497;
            } else {
                class655.method3682("modewhat", (byte) -126);
            }
            class243.field3143 = class561.method3242(0, arg0[4]);
            if (class243.field3143 == -1) {
                if (arg0[4].equals("english")) {
                    class243.field3143 = 0;
                } else if (arg0[4].equals("german")) {
                    class243.field3143 = 1;
                } else {
                    class655.method3682("language", (byte) -124);
                }
            }
            class760.field10602 = false;
            class91.field1252 = false;
            if (arg0[5].equals("game0")) {
                class293.field3867 = class211.field2791;
            } else if (arg0[5].equals("game1")) {
                class293.field3867 = class722.field10048;
            } else if (arg0[5].equals("game2")) {
                class293.field3867 = class198.field2703;
            } else if (arg0[5].equals("game3")) {
                class293.field3867 = class683.field9520;
            } else {
                class655.method3682("game", (byte) -128);
            }
            class138.field1981 = true;
            class254.field3244 = true;
            class721.field10035 = false;
            class721.field10032 = 0L;
            class618.field8529 = null;
            class722.field10043 = "";
            class555.field7732 = 0;
            class318.field4114 = null;
            class758.field10583 = class293.field3867.field1416;
            class517.field7246 = false;
            class272.field3419 = 0;
            class313.field4096 = 0;
            client var1 = new client();
            class654.field9104 = var1;
            var1.method2729(1024, (byte) 119, 638, class293.field3867.field1418, 768, class660.field9195.method800(-30) + 32, 37, false);
            class731.field10179.setLocation(40, 40);
        } catch (Exception var3) {
            class684.method3842(1, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1825() {
        int var0 = class416.field5303;
        int[] var1 = class657.field9155;
        int var2 = class310.field4081 ? var0 : class646.field8947 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class13 var4;
            if (var3 < var0) {
                var4 = class5.field49[var1[var3]];
            } else {
                var4 = ((class592) class207.field2745.method1160((long) class751.field10483[var3 - var0], 123)).field8280;
            }
            if (var4.field166 >= 0) {
                int var5 = var4.method82((byte) 49);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5801 & 0x1FF) == 0 && (var4.field5797 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field5801 & 0x1FF) == 256 && (var4.field5797 & 0x1FF) == 256) {
                    continue;
                }
                var4.field5800 = class225.method1448(var4.field5796, var4.field5801, var4.field5797, (byte) 28);
                class582.method3315(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([IIIILje;I[IZIIIIIII)I")
    public static final int method1826(int[] arg0, int arg1, int arg2, int arg3, class405 arg4, int arg5, int[] arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field3978++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class161.field2220[var15][var35] = 0;
                class545.field7602[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg12 == 1) {
            var16 = class243.method1519(arg11, arg13, arg1, arg3, arg2, -8777, arg4, arg9, arg8, arg14, arg10);
        } else if (arg12 == 2) {
            var16 = class84.method704(arg8, arg10, arg11, arg3, arg14, arg4, (byte) -100, arg2, arg9, arg13, arg1);
        } else {
            var16 = class427.method2451(arg2, arg14, arg8, arg9, arg1, arg10, arg4, arg12, arg13, (byte) 97, arg3, arg11);
        }
        int var17 = arg11 - 64;
        int var18 = arg14 - 64;
        int var19 = class736.field10234;
        int var20 = class632.field8726;
        if (!var16) {
            if (!arg7) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= (arg13 + var23); var24++) {
                for (int var25 = arg1 - var23; var25 <= (arg1 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class545.field7602[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg13 > var24) {
                            var28 = arg13 - var24;
                        } else if (var24 > arg2 + arg13 - 1) {
                            var28 = var24 + 1 - arg2 - arg13;
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if (var25 > arg1 + arg8 - 1) {
                            var29 = var25 + 1 - arg1 - arg8;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && class545.field7602[var26][var27] < var22) {
                            var21 = var30;
                            var22 = class545.field7602[var26][var27];
                            var19 = var24;
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg5 > -80) {
            field3995 = null;
        }
        if (arg11 == var19 && arg14 == var20) {
            return 0;
        }
        byte var31 = 0;
        class310.field4086[var31] = var19;
        int var37 = var31 + 1;
        class142.field2013[var31] = var20;
        int var32;
        int var33 = var32 = class161.field2220[var19 - var17][var20 - var18];
        while (arg11 != var19 || arg14 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class310.field4086[var37] = var19;
                class142.field2013[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class161.field2220[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg6[var34] = class310.field4086[var37];
            arg0[var34++] = class142.field2013[var37];
            if (var34 >= arg6.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)V")
    public static final void method1827(int arg0, int arg1, int arg2) {
        if (arg1 != 7910) {
            method1838();
        }
        field3982++;
        class37 var3 = class636.method3571(1, arg2, arg1 ^ 0xFFFFE177);
        var3.method232(-3);
        var3.field579 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1828() {
        for (int var0 = 0; var0 < class409.field5183; var0++) {
            int[] var1 = class331.field4227[var0];
            for (int var2 = 0; var2 < class543.field7597; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1829(int arg0) {
        method1836(-10121);
        field3996++;
        class301.method1797(-114);
        class404.method2250(109);
        class454.method2548((byte) -112);
        class31.method211((byte) -46);
        class725.method4048(0);
        class638.method3577((byte) -34);
        class117.method910((byte) 109);
        class649.method3639((byte) 104);
        class692.method3879(119);
        class127.method954(-106);
        class594.method3368(true);
        class168.method1173((byte) 78);
        class16.method117((byte) 82);
        class165.method1155(0);
        class476.method2724((byte) 119);
        class206.method1330(0);
        class705.method3950(arg0 + 35420);
        class631.method3543(-13187);
        class60.method514(10637);
        class746.method4146(arg0 + 25249);
        class323.method1894(arg0 ^ 0xFFFF9D67);
        class409.method2280(arg0 ^ 0xFFFF9D67);
        class653.method3664(0);
        class444.method2518((byte) 97);
        class757.method4207(arg0 ^ 0xFFFF9D07);
        class558.method3218(0);
        class590.method3351(-126);
        class473.method2705(-124);
        class547.method3174(117);
        class748.method4162((byte) 119);
        class387.method2205((byte) 99);
        class176.method1206(-63);
        class721.method4028(true);
        class142.method1025(4096);
        class735.method4098(true);
        class218.method1421((byte) 43);
        class296.method1777((byte) 53);
        class536.method3083((byte) 120);
        class64.method584(96);
        class687.method3866((byte) 79);
        class264.method1590(false);
        class99.method795(-115);
        class195.method1297((byte) 45);
        class697.method3923(-120);
        class762.method4231(arg0 ^ 0xFFFF9D65);
        class362.method2092(-120);
        class469.method2667((byte) 88);
        class402.method2244((byte) 33);
        class743.method4138(arg0 + 21153);
        class600.method3399((byte) -101);
        class87.method719((byte) -46);
        class237.method1484(87);
        class36.method225(63);
        class592.method3358(-53);
        class684.method3843((byte) 33);
        class461.method2596(255);
        class180.method1239((byte) -47);
        class275.method1625((byte) 65);
        class139.method1019((byte) -80);
        class405.method2265((byte) 85);
        class207.method1342((byte) 103);
        class417.method2335(8384);
        class288.method1728(false);
        class72.method644(arg0 ^ 0x6298);
        class724.method4047(-67);
        class501.method2937(false);
        class236.method1481(123);
        class116.method904((byte) -127);
        class589.method3344((byte) -39);
        class14.method101(-91);
        class220.method1430(511);
        class182.method1241((byte) 118);
        class733.method4092(arg0 + 25240);
        class262.method1572(arg0 + 25293);
        class745.method4141(arg0 ^ 0x62D6);
        class531.method3052(126);
        class313.method1866(-100);
        class681.method3834(true);
        class28.method192(0);
        class317.method1872(-8);
        class138.method1013(false);
        class1.method3(30730);
        class134.method988(48);
        class447.method2526(-98);
        class759.method4222(true);
        class197.method1306(30812);
        class235.method1474(-82);
        class660.method3712(-117);
        class470.method2678(arg0 ^ 0x68CC);
        class701.method3945(36);
        class56.method414(256);
        class571.method3279(1);
        class474.method2710((byte) 105);
        class426.method2444(false);
        class210.method1350((byte) -90);
        class267.method1592((byte) -108);
        class463.method2635(false);
        class449.method2529(30836);
        class543.method3110((byte) -126);
        class257.method1563(122);
        class282.method1683(-86);
        class131.method974(arg0 + 25118);
        class552.method3204(arg0 + 13154);
        class639.method3598(2);
        class61.method574(-27710);
        class520.method3021(1);
        class540.method3101(-35);
        class403.method2245(-2);
        class698.method3927(92);
        class550.method3195((byte) -66);
        class516.method3001(true);
        class194.method1293(1);
        class755.method4195((byte) -95);
        class617.method3449((byte) 53);
        class172.method1187((byte) -127);
        class276.method1632((byte) -46);
        class643.method3609(-1);
        class609.method3425(true);
        class318.method1875(3);
        class303.method1808(true);
        class432.method2473((byte) 89);
        class615.method3442(19004);
        class665.method3747(arg0 ^ 0x62EB);
        class52.method390(arg0 + 25326);
        class548.method3189(124);
        class564.method3251(0);
        class753.method4185(arg0 + 25368);
        class327.method1902((byte) -113);
        class354.method2065(arg0 + 25192);
        class647.method3628(arg0 + 25137);
        class230.method1462((byte) -61);
        class489.method2890((byte) -115);
        class416.method2333(arg0 + 25244);
        class274.method1621(255);
        class741.method4133(-1);
        class123.method933(107);
        class756.method4200((byte) -57);
        class556.method3211(-126);
        class435.method2479(-70);
        class216.method1393((byte) -46);
        class651.method3649((byte) 106);
        class396.method2228((byte) -122);
        class268.method1594((byte) 2);
        class188.method1269();
        class526.method3043((byte) 71);
        class15.method106(true);
        class499.method2915((byte) -69);
        class89.method729(arg0 ^ 0x628B);
        class9.method63((byte) 89);
        class629.method3531(false);
        class679.method3829((byte) -26);
        class238.method1491(63);
        class306.method1843(arg0 ^ 0xFFFF9D65);
        class255.method1557(arg0 ^ 0x6298);
        class563.method3247(false);
        class312.method1864(true);
        class109.method874(256);
        class732.method4085(-14603);
        class505.method2947(0);
        class73.method667();
        class155.method1082(16777215);
        class595.method3370(1);
        class731.method4075(false);
        class19.method128(arg0 + 25298);
        class225.method1450((byte) -80);
        class602.method3408((byte) 98);
        class91.method734(8);
        class599.method3396((byte) -120);
        class297.method1780(arg0 + 45138);
        class380.method2167(-21827);
        class641.method3604((byte) 115);
        class428.method2453(5358);
        class144.method1042(arg0 + 25113);
        class509.method2970();
        class738.method4113(6);
        class430.method2463(false);
        class85.method709(22474);
        class329.method1908(arg0 + 25328);
        class320.method1884(0);
        class103.method818(false);
        class722.method4029(-14);
        class593.method3361(115);
        class344.method1975(25278);
        class570.method3273();
        class21.method134(0);
        class657.method3705(0);
        class694.method3887(0);
        class672.method3777(arg0 ^ 0xFFFF9D18);
        class203.method1318((byte) -127);
        class119.method919(-108);
        class205.method1328((byte) -90);
        class667.method3757(true);
        class619.method3457(true);
        class118.method915(-117);
        class272.method1607((byte) 120);
        class374.method2151((byte) -109);
        class621.method3492(101);
        class185.method1247(-1);
        class553.method3205(-1);
        class519.method3014();
        class521.method3025(arg0 + 25367);
        class104.method821((byte) 123);
        class565.method3252(arg0 ^ 0x6E58AF97);
        class110.method877();
        class229.method1460(arg0 + 25241);
        class8.method47(false);
        class164.method1151(true);
        class201.method1311(3);
        class515.method2998((byte) 8);
        class528.method3047(-75);
        class413.method2320();
        class68.method626(-113);
        class124.method944(arg0 + 37529);
        class706.method3954((byte) 23);
        class97.method779((byte) 35);
        class290.method1737(arg0 + 25496);
        class175.method1202(arg0 + 25113);
        class378.method2159((byte) 123);
        class358.method2078(-1);
        class12.method74((byte) -74);
        class242.method1510(-1);
        class39.method238(-124);
        class2.method7((byte) -47);
        class471.method2684((byte) 58);
        class161.method1129((byte) 53);
        class115.method902(false);
        class160.method1123((byte) -80);
        class263.method1577(1000);
        class442.method2507((byte) 94);
        class224.method1445(10);
        class346.method1978((byte) -119);
        class630.method3540(arg0 ^ 0x68E3);
        class652.method3656((byte) 123);
        class729.method4068(true);
        class315.method1870(102);
        class331.method1916((byte) -122);
        class339.method1950((byte) 114);
        class580.method3306(48);
        class459.method2558((byte) -29);
        class163.method1142(true);
        class532.method3059(-76);
        class133.method984(arg0 + 25116);
        class125.method945(1);
        class162.method1133(-9287);
        class575.method3298(true);
        class209.method1346(0);
        class577.method3301(-15);
        class356.method2069((byte) -86);
        class359.method2082((byte) -14);
        class292.method1742(26818);
        class625.method3507(131072);
        class214.method1371((byte) 47);
        class718.method4015(-1781807287);
        class271.method1606((byte) -43);
        class223.method1443(true);
        class686.method3855((byte) 76);
        class6.method31(100);
        class284.method1697(-87);
        class510.method2983((byte) -98);
        class342.method1971(-109);
        class702.method3948((byte) -56);
        class517.method3005(10);
        class258.method1564(6);
        class24.method167((byte) -124);
        class640.method3599(-5453);
        class537.method3088((byte) 74);
        class719.method4017(397151784);
        class120.method927(2);
        class25.method175((byte) 110);
        class676.method3816(arg0 + 40228);
        class541.method3103(-6199);
        class408.method2277((byte) 105);
        class222.method1442((byte) -54);
        class431.method2468(2);
        class309.method1858(arg0 + 25344);
        class749.method4170(0);
        class579.method3305((byte) 2);
        class752.method4182(true);
        class291.method1741(122);
        class217.method1416(arg0 ^ 0x2937);
        class636.method3567((byte) 45);
        class512.method2986((byte) -43);
        class287.method1707(-36);
        class371.method2129();
        class587.method3333(18002);
        class147.method1050(128);
        class542.method3107(0);
        class524.method3038((byte) 105);
        class411.method2308(false);
        class503.method2944(0);
        class627.method3515(0);
        class93.method747((byte) -51);
        class407.method2273(-18694);
        class712.method3979(true);
        class372.method2143((byte) 75);
        class393.method2217(-109);
        class645.method3620((byte) 108);
        class154.method1074(512);
        class761.method4230((byte) 36);
        class441.method2505(125);
        class507.method2960(15285);
        class295.method1775(true);
        class340.method1957();
        class190.method1279(-94);
        class397.method2235((byte) -27);
        class388.method2209();
        class715.method3999();
        class353.method2060(arg0 ^ 0xFFFF9D3B);
        class311.method1862();
        class472.method2686((byte) -66);
        class130.method965(true);
        class739.method4114(-128);
        class281.method1668(4);
        class560.method3239(arg0 ^ 0xFFFF9567);
        class744.method4140(false);
        class332.method1919(119);
        class557.method3214((byte) 79);
        class443.method2509(true);
        class445.method2523((byte) -64);
        class232.method1468((byte) -105);
        class48.method370(86);
        class98.method786(113);
        class709.method3968((byte) -125);
        class671.method3770();
        class334.method1925(arg0 ^ 0xFFFFB831);
        class286.method1703(18);
        class422.method2352((byte) -100);
        class18.method127(127);
        class482.method2770(11414);
        class414.method2322((byte) 7);
        class26.method179((byte) 96);
        class75.method676((byte) -88);
        class150.method1056((byte) 109);
        class385.method2190(true);
        class366.method2114((byte) 61);
        class80.method680((byte) 124);
        class455.method2550((byte) 51);
        class254.method1554(true);
        class239.method1496(arg0 ^ 0xFFFF9D77);
        class381.method2171(-9666);
        class321.method1888(0);
        class588.method3342(arg0 ^ arg0);
        class429.method2461(0);
        class717.method4013(-6132);
        class174.method1196(arg0 ^ 0xFFFF9D11);
        class567.method3257(true);
        class685.method3847(-1270);
        class108.method864(-3);
        class740.method4123(true);
        class338.method1945((byte) -11);
        class603.method3411(104);
        class656.method3687((byte) -125);
        class695.method3891(4);
        class293.method1759(arg0 + 25169);
        class523.method3037(7811);
        class525.method3041(3553);
        class662.method3726((byte) -118);
        class736.method4103(752534248);
        class193.method1292(arg0 + 47893);
        class424.method2395((byte) 40);
        class307.method1846(arg0 + 27241);
        class285.method1699(2);
        class88.method724(false);
        class300.method1796((byte) -113);
        class322.method1892(arg0 ^ 0xFFFF9D64);
        class299.method1788(arg0 ^ 0xFFFF98DE);
        class178.method1216(arg0 ^ 0xFFFFF43B);
        class55.method408(false);
        class33.method219(arg0 ^ 0xFFFFC1D9);
        class114.method896(22);
        class559.method3235(-49);
        class596.method3375(arg0 ^ 0x4301);
        class655.method3678(arg0 + 25124);
        class81.method683((byte) 113);
        class347.method1994(30837);
        class66.method615((byte) 53);
        class308.method1851();
        class141.method1023((byte) 123);
        class259.method1567(0);
        class680.method3831(-28);
        class368.method2125(121);
        class433.method2475(true);
        class632.method3546(true);
        class391.method2212(0);
        class241.method1504(-124);
        class35.method224(1);
        class32.method218(-1);
        class231.method1463(true);
        class484.method2855((byte) 97);
        class394.method2221(arg0 + 25240);
        class475.method2717((byte) 121);
        class511.method2985((byte) -73);
        class669.method3761(0);
        class310.method1861((byte) -19);
        class436.method2485(-26408);
        class530.method3049((byte) -28);
        class349.method2048(2);
        class658.method3706((byte) -86);
        class136.method1001(false);
        class494.method2909(2);
        class82.method686((byte) -26);
        class269.method1599(10671);
        class760.method4227((byte) -109);
        class121.method931(-17780);
        class663.method3739((byte) -46);
        class480.method2756(true);
        class513.method2990(-46);
        class364.method2102();
        class244.method1522(-15803);
        class498.method2911((byte) -104);
        class611.method3427(0);
        class466.method2659(-1);
        class646.method3625(123);
        class59.method425(-1);
        class256.method1558((byte) 86);
        class707.method3958(-120);
        class648.method3632(false);
        class70.method634(arg0 ^ 0xFFFF9D67);
        class400.method2236((byte) 55);
        class345.method1977(0);
        class169.method1181((byte) 55);
        class438.method2493(arg0 + 15905);
        class212.method1361((byte) 110);
        class367.method2122(4);
        class622.method3497((byte) -108);
        class363.method2098(true);
        class253.method1547(-23957);
        class514.method2993((byte) -122);
        class58.method423(true);
        class106.method859(arg0 + 25242);
        class678.method3823((byte) 81);
        class546.method3149((byte) -97);
        class379.method2164(arg0 + 25241);
        class551.method3200(16720915);
        class582.method3317(false);
        class43.method307(-81);
        class348.method2046((byte) -116);
        class659.method3710(126);
        class726.method4051(true);
        class758.method4219((byte) 124);
        class7.method43((byte) 2);
        class584.method3322((byte) 99);
        class623.method3501((byte) -100);
        class468.method2661((byte) -103);
        class140.method1021(arg0 ^ 0xFFFF9D3A);
        class699.method3933((byte) -73);
        class94.method763((byte) -123);
        class283.method1692(-33);
        class386.method2196(arg0 ^ 0x6299);
        class737.method4106(-17014);
        class22.method156((byte) -96);
        class96.method773((byte) -85);
        class395.method2223((byte) 95);
        class440.method2497((byte) -69);
        class628.method3518(arg0 ^ 0x71C);
        class198.method1309(31462);
        class751.method4179(4434);
        class634.method3554(0);
        class683.method3841((byte) -65);
        class583.method3320(arg0 ^ 0xFFFF9D73);
        class227.method1452((byte) 98);
        class294.method1766((byte) 127);
        class453.method2545(arg0 + 25242);
        class330.method1912(true);
        class84.method697((byte) -126);
        class101.method804(arg0 ^ 0x62CB);
        class234.method1470(arg0 ^ 0xFFFF9D15);
        class412.method2309((byte) -119);
        class479.method2755(46);
        class29.method195(10572);
        class437.method2489(-10847);
        class533.method3061(false);
        class343.method1973(false);
        class69.method630(0);
        class90.method732(arg0 + 25129);
        class170.method1182(-86);
        class601.method3407((byte) -123);
        class273.method1611(0);
        class450.method2532(true);
        class92.method741(arg0 ^ 0x62E7);
        class506.method2951(-23250);
        class5.method27((byte) 78);
        class196.method1302(-46);
        class360.method2084(arg0 + 25339);
        class614.method3435((byte) -93);
        class270.method1605((byte) -111);
        class464.method2636((byte) -6);
        class10.method65(-66);
        class607.method3419(-127);
        class555.method3210(-50);
        class562.method3245(-677250676);
        class586.method3328(false);
        class277.method1636((byte) -123);
        class365.method2109(arg0 + 25243);
        class618.method3451((byte) -104);
        class302.method1803(-1);
        class677.method3817(arg0 ^ 0xFFFF9D62);
        class305.method1841((byte) -127);
        class129.method964(arg0 ^ 0xFFFF8EEF);
        class545.method3146(false);
        class730.method4074(80);
        class689.method3868((byte) -14);
        class211.method1357(true);
        class42.method301((byte) -100);
        class654.method3673(arg0 + 25288);
        class373.method2145((byte) 84);
        class83.method693(55);
        class249.method1537((byte) -64);
        class522.method3030((byte) 116);
        class605.method3416((byte) -17);
        class742.method4134(-1);
        class156.method1091(-941985236);
        class527.method3045(16777215);
        class126.method950(arg0 ^ 0x6298);
        class747.method4156((byte) -77);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lria;)Lria;")
    public static final class288 method1830(class288 arg0) {
        int var1 = method1833(arg0).method1573(0);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class501.method2936(-68, arg0.field3743);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final synchronized void method1831(int arg0) {
        field3981++;
        if (class64.field900 != null && class262.field3311 == null && !class162.field2227.field6235) {
            try {
                Class var2 = class64.field900.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class262.field3311 = (Canvas) var3.get(class64.field900);
                var3.set(class64.field900, null);
                if (class262.field3311 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1831(arg0);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1832(int arg0) {
        int var1 = class416.field5303;
        int[] var2 = class657.field9155;
        for (int var3 = 0; var3 < class646.field8947 + var1; var3++) {
            class13 var4;
            if (var3 < var1) {
                var4 = class5.field49[var2[var3]];
            } else {
                var4 = ((class592) class207.field2745.method1160((long) class751.field10483[var3 - var1], 124)).field8280;
            }
            if (var4.field5796 == arg0 && var4.field166 >= 0) {
                int var5 = var4.method82((byte) 49);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5801 & 0x1FF) != 0 || (var4.field5797 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field5801 & 0x1FF) != 256 || (var4.field5797 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5801 >> 9;
                    int var7 = var4.field5797 >> 9;
                    if (var4.field166 > class331.field4227[var6][var7]) {
                        class331.field4227[var6][var7] = var4.field166;
                        class125.field1796[var6][var7] = 1;
                    } else if (class331.field4227[var6][var7] == var4.field166) {
                        var10002 = class125.field1796[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field5801 - var8 >> 9;
                    int var10 = var4.field5797 - var8 >> 9;
                    int var11 = var4.field5801 + var8 >> 9;
                    int var12 = var4.field5797 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field166 > class331.field4227[var13][var14]) {
                                class331.field4227[var13][var14] = var4.field166;
                                class125.field1796[var13][var14] = 1;
                            } else if (class331.field4227[var13][var14] == var4.field166) {
                                var10002 = class125.field1796[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lria;)Lfc;")
    public static final class262 method1833(class288 arg0) {
        class262 var1 = (class262) class16.field323.method1160(((long) arg0.field3696 << 32) + (long) arg0.field3740, 125);
        return var1 == null ? arg0.field3756 : var1;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method1834(byte arg0) {
        field3989++;
        if (class748.field10451.field10399.method1924((byte) 109) == 2) {
            try {
                this.method1837(49);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class684.method3842(arg0 ^ 0xFFFFFFA4, var5, var5.getMessage() + " (Recovered) " + this.method1814((byte) -100));
                class583.field8154 = true;
                class415.method2331(false, 0, -4);
            }
        } else {
            this.method1837(122);
        }
        if (arg0 != -91) {
            this.method1837(-24);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lria;IIIIIIIIIII)V")
    public static final void method1835(class288[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label812: for (int var12 = 0; var12 < arg0.length; var12++) {
            class288 var13 = arg0[var12];
            if (var13 != null && var13.field3743 == arg1) {
                int var14 = var13.field3635 + arg6;
                int var15 = var13.field3687 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field3655 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field3617 + var14;
                    int var21 = var13.field3714 + var15;
                    if (var13.field3655 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field3655 == 0 || var13.field3781 || method1833(var13).field3291 != 0 || class302.field3957 == var13 || class72.field1003 == var13.field3715 || class458.field6087 == var13.field3715) {
                    if (!method1821(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class676.field9448) {
                            var22 = class209.method1347(0);
                            var23 = class453.method2540(-56);
                        }
                        if (class617.field8508 == var13 && class588.method3337(class617.field8508, 1) != null) {
                            class270.field3398 = true;
                            class584.field8166 = var14;
                            class127.field1808 = var15;
                        }
                        if (var13.field3774 || var16 < var18 && var17 < var19) {
                            if (var13.field3615 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class694 var24 = (class694) class129.field1834.method3672(-1); var24 != null; var24 = (class694) class129.field1834.method3662(-1)) {
                                    if (var24.field9641) {
                                        var24.method1175(-2);
                                        var24.field9635.field3684 = false;
                                    }
                                }
                                if (class564.field7933 == 0) {
                                    class617.field8508 = null;
                                    class302.field3957 = null;
                                }
                                class721.field10038 = 0;
                                class184.field2557 = false;
                                class134.field1940 = false;
                                if (!class14.field276) {
                                    class193.method1291(0);
                                }
                            }
                            boolean var25;
                            if (class680.field9495.method1118((byte) 125) + var22 >= var16 && class680.field9495.method1115(4) + var23 >= var17 && class680.field9495.method1118((byte) 123) + var22 < var18 && class680.field9495.method1115(4) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class8.field103 && var25) {
                                if (var13.field3768 >= 0) {
                                    class740.field10331 = var13.field3768;
                                } else if (var13.field3615) {
                                    class740.field10331 = -1;
                                }
                            }
                            if (!class14.field276 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class515.method2996(arg11 - var15, arg10 - var14, var13, -115);
                            }
                            boolean var26 = false;
                            if (class680.field9495.method1109(false) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class614 var28 = (class614) class235.field3065.method3672(-1);
                            if (var28 != null && var28.method1426(1600925004) == 0 && var28.method1428(1212) + var22 >= var16 && var28.method1425((byte) 127) + var23 >= var17 && var28.method1428(1212) + var22 < var18 && var28.method1425((byte) -52) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field3650 != null && !class756.method4202(false)) {
                                for (int var29 = 0; var29 < var13.field3650.length; var29++) {
                                    if (class349.field4502.method207(var13.field3650[var29], 20541)) {
                                        if (var13.field3674 == null || class463.field6224 >= var13.field3674[var29]) {
                                            byte var30 = var13.field3681[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class349.field4502.method207(86, 20541) && !class349.field4502.method207(82, 20541) && !class349.field4502.method207(81, 20541)) && ((var30 & 0x2) == 0 || class349.field4502.method207(86, 20541)) && ((var30 & 0x1) == 0 || class349.field4502.method207(82, 20541)) && ((var30 & 0x4) == 0 || class349.field4502.method207(81, 20541))) {
                                                if (var29 < 10) {
                                                    class458.method2552(var29 + 1, "", var13.field3696, false, -1);
                                                } else if (var29 == 10) {
                                                    class522.method3033(37);
                                                    class262 var31 = method1833(var13);
                                                    class162.method1135(var31.field3297, var31.method1571(false), (byte) -116, var13);
                                                    class551.field7704 = class635.method3559(-126, var13);
                                                    if (class551.field7704 == null) {
                                                        class551.field7704 = "Null";
                                                    }
                                                    class731.field10176 = var13.field3699 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field3623[var29];
                                                if (var13.field3674 == null) {
                                                    var13.field3674 = new int[var13.field3650.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field3674[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field3674[var29] = class463.field6224 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field3674 != null) {
                                        var13.field3674[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class614.method3439((byte) -12, var22 + var28.method1428(1212) - var14, var23 + var28.method1425((byte) 126) - var15, var13);
                            }
                            if (class617.field8508 != null && class617.field8508 != var13 && var25 && method1833(var13).method1576((byte) 106)) {
                                class232.field3042 = var13;
                            }
                            if (class302.field3957 == var13) {
                                class100.field1390 = true;
                                class259.field3280 = var14;
                                class142.field2010 = var15;
                            }
                            if (var13.field3781 || var13.field3715 != 0) {
                                if (var25 && class688.field9584 != 0 && var13.field3629 != null) {
                                    class694 var33 = new class694();
                                    var33.field9641 = true;
                                    var33.field9635 = var13;
                                    var33.field9643 = class688.field9584;
                                    var33.field9645 = var13.field3629;
                                    class129.field1834.method3671(var33, false);
                                }
                                if (class617.field8508 != null || class14.field276 || class738.field10262 != var13.field3715 && class721.field10038 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field3715 != 0) {
                                    if (class360.field4657 == var13.field3715 || class198.field2704 == var13.field3715) {
                                        class223.field2979 = var13;
                                        if (class1.field4 != null) {
                                            class1.field4.method2334(class386.field4930, var13.field3714, (byte) -44);
                                        }
                                        if (class360.field4657 == var13.field3715) {
                                            if (class14.field276 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class275.method1627(false, class386.field4930, arg8, arg9);
                                            class580 var34 = (class580) class669.field9385.method162(-22305);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label812;
                                                }
                                                if (arg10 >= var34.field8112 && arg10 < var34.field8111 && arg11 >= var34.field8113 && arg11 < var34.field8114) {
                                                    class193.method1291(0);
                                                    class21.method136((byte) 87, var34.field8116);
                                                }
                                                var34 = (class580) class669.field9385.method158(false);
                                            }
                                        }
                                    }
                                    if (class72.field1003 == var13.field3715) {
                                        if (var13.method1726(class386.field4930, 117) == null || class33.field547 != 0 && class33.field547 != 3 || class14.field276 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field3777[var36];
                                        if (var35 < var37 || var35 > var13.field3621[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field3617 / 2;
                                        int var39 = var36 - var13.field3714 / 2;
                                        int var40;
                                        if (class650.field9023 == 4) {
                                            var40 = (int) class521.field7309 & 0x3FFF;
                                        } else {
                                            var40 = (int) class521.field7309 + class683.field9519 & 0x3FFF;
                                        }
                                        int var41 = class16.field320[var40];
                                        int var42 = class16.field322[var40];
                                        if (class650.field9023 != 4) {
                                            var41 = (class127.field1815 + 256) * var41 >> 8;
                                            var42 = (class127.field1815 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class650.field9023 == 4) {
                                            var45 = (class289.field3789 >> 9) + (var43 >> 2);
                                            var46 = (class116.field1724 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class380.field4847.method82((byte) 49) - 1) * 256;
                                            var45 = (class380.field4847.field5801 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class380.field4847.field5797 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class8.field103 && (class565.field7935 & 0x40) != 0) {
                                            class288 var48 = class466.method2658(class100.field1388, class27.field489, 30639);
                                            if (var48 == null) {
                                                class522.method3033(41);
                                            } else {
                                                class92.method740(1L, (long) (var13.field3740 << 0 | var13.field3696), false, true, " ->", var13.field3700, class702.field9767, 45, var46, class551.field7704, true, var45, false);
                                            }
                                            continue;
                                        }
                                        if (class722.field10048 == class293.field3867) {
                                            class92.method740(1L, 0L, false, true, "", -1, -1, 44, var46, class454.field6030.method2547(-124, class243.field3143), true, var45, false);
                                        }
                                        class92.method740(1L, 0L, false, true, "", -1, class593.field8290, 13, var46, class193.field2639, true, var45, false);
                                        continue;
                                    }
                                    if (class738.field10262 == var13.field3715) {
                                        class190.field2623 = var13;
                                        if (var25) {
                                            class184.field2557 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1428(1212) - var14 - var13.field3617 / 2) * 2.0D / (double) class73.field1021);
                                            int var50 = (int) (-((double) (var23 + var28.method1425((byte) -43) - var15 - var13.field3714 / 2) * 2.0D / (double) class73.field1021));
                                            int var51 = class756.field10543 + var49 + class73.field1041;
                                            int var52 = class687.field9571 + var50 + class73.field1042;
                                            class490 var53 = class537.method3087((byte) -28);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method2892((byte) 80, var54, var52, var51);
                                            if (var54 != null) {
                                                if (class349.field4502.method207(82, 20541) && class683.field9525 > 0) {
                                                    class415.method2330(var54[2], var54[1], var54[0], 108078022);
                                                    continue;
                                                }
                                                class134.field1940 = true;
                                                class207.field2747 = var54[0];
                                                class736.field10230 = var54[1];
                                                class164.field2274 = var54[2];
                                            }
                                            class721.field10038 = 1;
                                            class387.field4944 = false;
                                            class698.field9721 = class680.field9495.method1118((byte) 127);
                                            class147.field2050 = class680.field9495.method1115(4);
                                            continue;
                                        }
                                        if (var26 && class721.field10038 > 0) {
                                            if (class721.field10038 == 1 && (class698.field9721 != class680.field9495.method1118((byte) 125) || class147.field2050 != class680.field9495.method1115(4))) {
                                                class54.field749 = class756.field10543;
                                                class472.field6330 = class687.field9571;
                                                class721.field10038 = 2;
                                            }
                                            if (class721.field10038 == 2) {
                                                class387.field4944 = true;
                                                class178.method1221(37, class54.field749 + (int) ((double) (class698.field9721 - class680.field9495.method1118((byte) 124)) * 2.0D / (double) class73.field1028));
                                                class354.method2064(-55, class472.field6330 - (int) ((double) (class147.field2050 - class680.field9495.method1115(4)) * 2.0D / (double) class73.field1028));
                                            }
                                            continue;
                                        }
                                        if (class721.field10038 > 0 && !class387.field4944) {
                                            if ((class517.field7244 == 1 || class307.method1848(true)) && class159.field2181 > 2) {
                                                class400.method2240(class698.field9721, class147.field2050, -122);
                                            } else if (class164.method1146(-101)) {
                                                class400.method2240(class698.field9721, class147.field2050, -117);
                                            }
                                        }
                                        class721.field10038 = 0;
                                        continue;
                                    }
                                    if (class260.field3283 == var13.field3715) {
                                        if (var26) {
                                            class375.method2152(var23 + class680.field9495.method1115(4) - var15, var13.field3617, var22 + class680.field9495.method1118((byte) 125) - var14, 2, var13.field3714);
                                        }
                                        continue;
                                    }
                                    if (class458.field6087 == var13.field3715) {
                                        class682.method3837(-200, var13, var14, var15);
                                        continue;
                                    }
                                }
                                if (!var13.field3738 && var27) {
                                    var13.field3738 = true;
                                    if (var13.field3750 != null) {
                                        class694 var55 = new class694();
                                        var55.field9641 = true;
                                        var55.field9635 = var13;
                                        var55.field9647 = var22 + var28.method1428(1212) - var14;
                                        var55.field9643 = var23 + var28.method1425((byte) -123) - var15;
                                        var55.field9645 = var13.field3750;
                                        class129.field1834.method3671(var55, false);
                                    }
                                }
                                if (var13.field3738 && var26 && var13.field3739 != null) {
                                    class694 var56 = new class694();
                                    var56.field9641 = true;
                                    var56.field9635 = var13;
                                    var56.field9647 = var22 + class680.field9495.method1118((byte) 124) - var14;
                                    var56.field9643 = var23 + class680.field9495.method1115(4) - var15;
                                    var56.field9645 = var13.field3739;
                                    class129.field1834.method3671(var56, false);
                                }
                                if (var13.field3738 && !var26) {
                                    var13.field3738 = false;
                                    if (var13.field3727 != null) {
                                        class694 var57 = new class694();
                                        var57.field9641 = true;
                                        var57.field9635 = var13;
                                        var57.field9647 = var22 + class680.field9495.method1118((byte) 127) - var14;
                                        var57.field9643 = var23 + class680.field9495.method1115(4) - var15;
                                        var57.field9645 = var13.field3727;
                                        class600.field8356.method3671(var57, false);
                                    }
                                }
                                if (var26 && var13.field3752 != null) {
                                    class694 var58 = new class694();
                                    var58.field9641 = true;
                                    var58.field9635 = var13;
                                    var58.field9647 = var22 + class680.field9495.method1118((byte) 127) - var14;
                                    var58.field9643 = var23 + class680.field9495.method1115(4) - var15;
                                    var58.field9645 = var13.field3752;
                                    class129.field1834.method3671(var58, false);
                                }
                                if (!var13.field3684 && var25) {
                                    var13.field3684 = true;
                                    if (var13.field3652 != null) {
                                        class694 var59 = new class694();
                                        var59.field9641 = true;
                                        var59.field9635 = var13;
                                        var59.field9647 = var22 + class680.field9495.method1118((byte) 125) - var14;
                                        var59.field9643 = var23 + class680.field9495.method1115(4) - var15;
                                        var59.field9645 = var13.field3652;
                                        class129.field1834.method3671(var59, false);
                                    }
                                }
                                if (var13.field3684 && var25 && var13.field3647 != null) {
                                    class694 var60 = new class694();
                                    var60.field9641 = true;
                                    var60.field9635 = var13;
                                    var60.field9647 = var22 + class680.field9495.method1118((byte) 124) - var14;
                                    var60.field9643 = var23 + class680.field9495.method1115(4) - var15;
                                    var60.field9645 = var13.field3647;
                                    class129.field1834.method3671(var60, false);
                                }
                                if (var13.field3684 && !var25) {
                                    var13.field3684 = false;
                                    if (var13.field3780 != null) {
                                        class694 var61 = new class694();
                                        var61.field9641 = true;
                                        var61.field9635 = var13;
                                        var61.field9647 = var22 + class680.field9495.method1118((byte) 124) - var14;
                                        var61.field9643 = var23 + class680.field9495.method1115(4) - var15;
                                        var61.field9645 = var13.field3780;
                                        class600.field8356.method3671(var61, false);
                                    }
                                }
                                if (var13.field3728 != null) {
                                    class694 var62 = new class694();
                                    var62.field9635 = var13;
                                    var62.field9645 = var13.field3728;
                                    class367.field4733.method3671(var62, false);
                                }
                                if (var13.field3730 != null && class58.field803 > var13.field3711) {
                                    if (var13.field3731 == null || class58.field803 - var13.field3711 > 32) {
                                        class694 var67 = new class694();
                                        var67.field9635 = var13;
                                        var67.field9645 = var13.field3730;
                                        class129.field1834.method3671(var67, false);
                                    } else {
                                        label699: for (int var63 = var13.field3711; var63 < class58.field803; var63++) {
                                            int var64 = class368.field4757[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field3731.length; var65++) {
                                                if (var13.field3731[var65] == var64) {
                                                    class694 var66 = new class694();
                                                    var66.field9635 = var13;
                                                    var66.field9645 = var13.field3730;
                                                    class129.field1834.method3671(var66, false);
                                                    break label699;
                                                }
                                            }
                                        }
                                    }
                                    var13.field3711 = class58.field803;
                                }
                                if (var13.field3717 != null && class739.field10315 > var13.field3691) {
                                    if (var13.field3766 == null || class739.field10315 - var13.field3691 > 32) {
                                        class694 var72 = new class694();
                                        var72.field9635 = var13;
                                        var72.field9645 = var13.field3717;
                                        class129.field1834.method3671(var72, false);
                                    } else {
                                        label675: for (int var68 = var13.field3691; var68 < class739.field10315; var68++) {
                                            int var69 = class386.field4931[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field3766.length; var70++) {
                                                if (var13.field3766[var70] == var69) {
                                                    class694 var71 = new class694();
                                                    var71.field9635 = var13;
                                                    var71.field9645 = var13.field3717;
                                                    class129.field1834.method3671(var71, false);
                                                    break label675;
                                                }
                                            }
                                        }
                                    }
                                    var13.field3691 = class739.field10315;
                                }
                                if (var13.field3759 != null && class510.field7185 > var13.field3632) {
                                    if (var13.field3721 == null || class510.field7185 - var13.field3632 > 32) {
                                        class694 var77 = new class694();
                                        var77.field9635 = var13;
                                        var77.field9645 = var13.field3759;
                                        class129.field1834.method3671(var77, false);
                                    } else {
                                        label651: for (int var73 = var13.field3632; var73 < class510.field7185; var73++) {
                                            int var74 = class556.field7733[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field3721.length; var75++) {
                                                if (var13.field3721[var75] == var74) {
                                                    class694 var76 = new class694();
                                                    var76.field9635 = var13;
                                                    var76.field9645 = var13.field3759;
                                                    class129.field1834.method3671(var76, false);
                                                    break label651;
                                                }
                                            }
                                        }
                                    }
                                    var13.field3632 = class510.field7185;
                                }
                                if (var13.field3649 != null && class501.field7093 > var13.field3702) {
                                    if (var13.field3778 == null || class501.field7093 - var13.field3702 > 32) {
                                        class694 var82 = new class694();
                                        var82.field9635 = var13;
                                        var82.field9645 = var13.field3649;
                                        class129.field1834.method3671(var82, false);
                                    } else {
                                        label627: for (int var78 = var13.field3702; var78 < class501.field7093; var78++) {
                                            int var79 = class735.field10222[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field3778.length; var80++) {
                                                if (var13.field3778[var80] == var79) {
                                                    class694 var81 = new class694();
                                                    var81.field9635 = var13;
                                                    var81.field9645 = var13.field3649;
                                                    class129.field1834.method3671(var81, false);
                                                    break label627;
                                                }
                                            }
                                        }
                                    }
                                    var13.field3702 = class501.field7093;
                                }
                                if (var13.field3761 != null && class453.field5997 > var13.field3620) {
                                    if (var13.field3631 == null || class453.field5997 - var13.field3620 > 32) {
                                        class694 var87 = new class694();
                                        var87.field9635 = var13;
                                        var87.field9645 = var13.field3761;
                                        class129.field1834.method3671(var87, false);
                                    } else {
                                        label603: for (int var83 = var13.field3620; var83 < class453.field5997; var83++) {
                                            int var84 = class443.field5881[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field3631.length; var85++) {
                                                if (var13.field3631[var85] == var84) {
                                                    class694 var86 = new class694();
                                                    var86.field9635 = var13;
                                                    var86.field9645 = var13.field3761;
                                                    class129.field1834.method3671(var86, false);
                                                    break label603;
                                                }
                                            }
                                        }
                                    }
                                    var13.field3620 = class453.field5997;
                                }
                                if (class337.field4272 > var13.field3685 && var13.field3704 != null) {
                                    class694 var88 = new class694();
                                    var88.field9635 = var13;
                                    var88.field9645 = var13.field3704;
                                    class129.field1834.method3671(var88, false);
                                }
                                if (class42.field624 > var13.field3685 && var13.field3678 != null) {
                                    class694 var89 = new class694();
                                    var89.field9635 = var13;
                                    var89.field9645 = var13.field3678;
                                    class129.field1834.method3671(var89, false);
                                }
                                if (class446.field5933 > var13.field3685 && var13.field3710 != null) {
                                    class694 var90 = new class694();
                                    var90.field9635 = var13;
                                    var90.field9645 = var13.field3710;
                                    class129.field1834.method3671(var90, false);
                                }
                                if (class123.field1771 > var13.field3685 && var13.field3641 != null) {
                                    class694 var91 = new class694();
                                    var91.field9635 = var13;
                                    var91.field9645 = var13.field3641;
                                    class129.field1834.method3671(var91, false);
                                }
                                if (class122.field1762 > var13.field3685 && var13.field3760 != null) {
                                    class694 var92 = new class694();
                                    var92.field9635 = var13;
                                    var92.field9645 = var13.field3760;
                                    class129.field1834.method3671(var92, false);
                                }
                                var13.field3685 = class676.field9444;
                                if (var13.field3638 != null) {
                                    for (int var93 = 0; var93 < class426.field5715; var93++) {
                                        class694 var94 = new class694();
                                        var94.field9635 = var13;
                                        var94.field9650 = class26.field472[var93].method2108((byte) 84);
                                        var94.field9638 = class26.field472[var93].method2106(-3733);
                                        var94.field9645 = var13.field3638;
                                        class129.field1834.method3671(var94, false);
                                    }
                                }
                                if (class658.field9172 && var13.field3688 != null) {
                                    class694 var95 = new class694();
                                    var95.field9635 = var13;
                                    var95.field9645 = var13.field3688;
                                    class129.field1834.method3671(var95, false);
                                }
                            }
                            if (var13.field3655 == 5 && var13.field3758 != -1) {
                                var13.method1719(class623.field8571, (byte) 80, class507.field7153).method2334(class386.field4930, var13.field3714, (byte) -44);
                            }
                            class235.method1476(0, var13);
                            if (var13.field3655 == 0) {
                                method1835(arg0, var13.field3696, var16, var17, var18, var19, var14 - var13.field3628, var15 - var13.field3737, arg8, arg9, arg10, arg11);
                                if (var13.field3779 != null) {
                                    method1835(var13.field3779, var13.field3696, var16, var17, var18, var19, var14 - var13.field3628, var15 - var13.field3737, arg8, arg9, arg10, arg11);
                                }
                                class491 var96 = (class491) class290.field3804.method1160((long) var13.field3696, 123);
                                if (var96 != null) {
                                    if (class293.field3867 == class211.field2791 && var96.field6976 == 0 && !class14.field276 && var25 && !class711.field9869) {
                                        class193.method1291(0);
                                    }
                                    class346.method1979(var15, arg9, arg11, var96.field6978, var19, var18, (byte) 46, var14, arg10, var16, var17, arg8);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class235.method1476(0, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method1836(int arg0) {
        if (arg0 == -10121) {
            field3977 = null;
            field3991 = null;
            field3995 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1837(int arg0) {
        field3986++;
        if (arg0 <= 39) {
            field3995 = null;
        }
        if (class27.field484 == 14) {
            return;
        }
        long var2 = class428.method2452((byte) 116) / 1000000L - class662.field9277;
        class662.field9277 = class428.method2452((byte) 108) / 1000000L;
        boolean var4 = class269.method1600((byte) -117);
        if (var4 && class87.field1208 && class684.field9529 != null) {
            class684.field9529.method3654(false);
        }
        if (class740.method4122((byte) -58, class27.field484)) {
            if (class686.field9560 != 0L && class446.method2525(500) > class686.field9560) {
                class318.method1876(class65.field911, 0, false, class120.method926(15492), class427.field5723);
            } else if (!class386.field4930.method431() && class461.field6211) {
                class146.method1048((byte) 76);
            }
        }
        if (class353.field4533 == null) {
            Container var5;
            if (class731.field10179 != null) {
                var5 = class731.field10179;
            } else if (class64.field900 == null) {
                var5 = class319.field4123;
            } else {
                var5 = class64.field900;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class731.field10179 == var5) {
                Insets var8 = class731.field10179.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class754.field10526 != var6 || class317.field4108 != var7 || class508.field7164) {
                if (class386.field4930 == null || class386.field4930.method474()) {
                    class386.method2195(-46);
                } else {
                    class317.field4108 = var7;
                    class754.field10526 = var6;
                }
                class686.field9560 = class446.method2525(500) + 500L;
                class508.field7164 = false;
            }
        }
        if (class353.field4533 != null && !class430.field5752 && class740.method4122((byte) -85, class27.field484)) {
            class318.method1876(-1, 0, false, class748.field10451.field10407.method3441((byte) -77), -1);
        }
        boolean var9 = false;
        if (class10.field134) {
            class10.field134 = false;
            var9 = true;
        }
        if (var9) {
            class759.method4224(0);
        }
        if (class386.field4930 != null && class386.field4930.method431() || class120.method926(15492) != 1) {
            class433.method2476(-102);
        }
        if (class697.method3924((byte) -114, class27.field484)) {
            class25.method169(var9, 2);
        } else if (class182.method1242(-4, class27.field484)) {
            class249.method1536(-1);
        } else if (class571.method3276(105, class27.field484)) {
            class249.method1536(-1);
        } else if (class573.method3282(class27.field484, -87)) {
            if (class575.field8090 == 1) {
                if (class630.field8706 < class4.field38) {
                    class630.field8706 = class4.field38;
                }
                int var11 = (class630.field8706 - class4.field38) * 50 / class630.field8706;
                class163.method1139(class372.field4774, class386.field4930, 118, true, class697.field9708, class454.field6015.method2547(-68, class243.field3143) + "<br>(" + var11 + "%)");
            } else if (class575.field8090 == 2) {
                if (class710.field9861 < class628.field8657) {
                    class710.field9861 = class628.field8657;
                }
                int var10 = (class710.field9861 - class628.field8657) * 50 / class710.field9861 + 50;
                class163.method1139(class372.field4774, class386.field4930, 126, true, class697.field9708, class454.field6015.method2547(-104, class243.field3143) + "<br>(" + var10 + "%)");
            } else {
                class163.method1139(class372.field4774, class386.field4930, 122, true, class697.field9708, class454.field6015.method2547(-74, class243.field3143));
            }
        } else if (class27.field484 == 10) {
            class100.method801(var2, -127);
        } else if (class27.field484 == 13) {
            class163.method1139(class372.field4774, class386.field4930, 117, false, class697.field9708, class454.field6017.method2547(-87, class243.field3143) + "<br>" + class454.field6018.method2547(-68, class243.field3143));
        }
        if (class52.field739 == 3) {
            for (int var12 = 0; var12 < class654.field9100; var12++) {
                Rectangle var13 = class694.field9642[var12];
                if (class374.field4798[var12]) {
                    class386.field4930.method532(var13.height, var13.width, var13.x, var13.y, true, -65281);
                } else if (class755.field10530[var12]) {
                    class386.field4930.method532(var13.height, var13.width, var13.x, var13.y, true, -65536);
                } else {
                    class386.field4930.method532(var13.height, var13.width, var13.x, var13.y, true, -16711936);
                }
            }
        }
        if (class756.method4202(false)) {
            class373.method2144(class386.field4930, 16017);
        }
        if (class162.field2227.field6235 && class740.method4122((byte) 91, class27.field484) && class52.field739 == 0 && class120.method926(15492) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class654.field9100; var15++) {
                if (class755.field10530[var15]) {
                    class755.field10530[var15] = false;
                    class1.field3[var14++] = class694.field9642[var15];
                }
            }
            try {
                if (class676.field9448) {
                    class72.method645(var14, class1.field3, 121);
                } else {
                    class386.field4930.method552(var14, class1.field3, -1);
                }
            } catch (class230 var20) {
            }
        } else if (!class697.method3924((byte) -97, class27.field484)) {
            for (int var16 = 0; var16 < class654.field9100; var16++) {
                class755.field10530[var16] = false;
            }
            try {
                if (class676.field9448) {
                    class283.method1691(-101);
                } else {
                    class386.field4930.method492(81);
                }
            } catch (class230 var19) {
                class684.method3842(1, var19, var19.getMessage() + " (Recovered) " + this.method1814((byte) -77));
                class415.method2331(false, 0, -4);
            }
        }
        class90.method733(-3930);
        int var18 = class748.field10451.field10395.method1045((byte) -108);
        if (var18 == 0) {
            class149.method1052(15L, true);
        } else if (var18 == 1) {
            class149.method1052(10L, true);
        } else if (var18 == 2) {
            class149.method1052(5L, true);
        } else if (var18 == 3) {
            class149.method1052(2L, true);
        }
        if (class291.field3812) {
            class660.method3713(true);
        }
        if (class748.field10451.field10391.method3250((byte) 99) == 1 && class27.field484 == 3 && class540.field7482 != -1) {
            class748.field10451.method4150(class748.field10451.field10391, 0, -5);
            class472.method2688(-124);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1838() {
        class197.field2687 = 0;
        for (int var0 = 0; var0 < class646.field8947; var0++) {
            class733 var1 = ((class592) class207.field2745.method1160((long) class751.field10483[var0], 127)).field8280;
            if (var1.field206 && var1.method79(-1) != -1) {
                int var2 = (var1.method82((byte) 49) - 1) * 256 + 252;
                int var3 = var1.field5801 - var2 >> 9;
                int var4 = var1.field5797 - var2 >> 9;
                class13 var5 = class251.method1543(-88, var4, var1.field5796, var3);
                if (var5 != null) {
                    int var6 = var5.field189;
                    if (var5 instanceof class733) {
                        var6 += 2048;
                    }
                    if (var5.field227 == 0 && var5.method79(-1) != -1) {
                        class6.field64[class197.field2687] = var6;
                        class484.field6932[class197.field2687] = var6;
                        class197.field2687++;
                        var5.field227++;
                    }
                    class6.field64[class197.field2687] = var6;
                    class484.field6932[class197.field2687] = var1.field189 + 2048;
                    class197.field2687++;
                    var5.field227++;
                }
            }
        }
        class276.method1634(class197.field2687 - 1, 0, class6.field64, class484.field6932, -1);
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3994++;
        if (!this.method2725(false)) {
            return;
        }
        class90.field1247 = new class134();
        class90.field1247.field1929 = Integer.parseInt(this.getParameter("worldid"));
        class345.field4358 = new class134();
        class345.field4358.field1929 = Integer.parseInt(this.getParameter("lobbyid"));
        class345.field4358.field1938 = this.getParameter("lobbyaddress");
        class476.field6434 = new class134();
        class476.field6434.field1929 = Integer.parseInt(this.getParameter("demoid"));
        class476.field6434.field1938 = this.getParameter("demoaddress");
        class225.field2991 = class436.method2481(0, Integer.parseInt(this.getParameter("modewhere")));
        if (class225.field2991 == class16.field325) {
            class225.field2991 = class762.field10627;
        } else if (!class231.method1464(class225.field2991, (byte) -50) && class7.field75 != class225.field2991) {
            class225.field2991 = class7.field75;
        }
        class660.field9195 = class624.method3503(Integer.parseInt(this.getParameter("modewhat")), -34);
        if (class660.field9195 != class542.field7497 && class660.field9195 != class26.field469 && class660.field9195 != class315.field4105) {
            class660.field9195 = class315.field4105;
        }
        try {
            class243.field3143 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class243.field3143 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class91.field1252 = true;
        } else {
            class91.field1252 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class760.field10602 = true;
        } else {
            class760.field10602 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class382.field4855 = true;
        } else {
            class382.field4855 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class293.field3867 = class211.field2791;
            } else if (var4.equals("1")) {
                class293.field3867 = class722.field10048;
            } else if (var4.equals("2")) {
                class293.field3867 = class198.field2703;
            } else if (var4.equals("3")) {
                class293.field3867 = class683.field9520;
            }
        }
        try {
            class313.field4096 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class313.field4096 = 0;
        }
        class106.field1535 = this.getParameter("quiturl");
        class722.field10043 = this.getParameter("settings");
        if (class722.field10043 == null) {
            class722.field10043 = "";
        }
        class295.field3882 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class272.field3419 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class272.field3419 = 0;
            }
        }
        class758.field10583 = Integer.parseInt(this.getParameter("colourid"));
        if (class758.field10583 < 0 || class16.field317.length <= class758.field10583) {
            class758.field10583 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class138.field1981 = true;
            class254.field3244 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class517.field7246 = true;
        }
        class318.field4114 = this.getParameter("sskey");
        if (class318.field4114 != null && class318.field4114.length() < 2) {
            class318.field4114 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class721.field10035 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class555.field7732 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class721.field10032 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class618.field8529 = this.getParameter("additionalInfo");
        if (class618.field8529 != null && class618.field8529.length() > 50) {
            class618.field8529 = null;
        }
        if (class293.field3867 == class211.field2791) {
            class478.field6509 = 503;
            class482.field6548 = 765;
        } else if (class722.field10048 == class293.field3867) {
            class482.field6548 = 640;
            class478.field6509 = 480;
        }
        class654.field9104 = this;
        this.method2722(37, 638, 3261, class660.field9195.method800(-116) + 32, class482.field6548, class478.field6509, class293.field3867.field1418);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1839(int arg0) {
        if (class27.field484 == 7 && class391.field4978 == 0) {
            if (class705.field9777 > 1) {
                class705.field9777--;
                class122.field1762 = class676.field9444;
            }
            if (!class14.field276) {
                class193.method1291(0);
            }
            for (int var2 = 0; var2 < 100 && class717.method4010((byte) 120); var2++) {
            }
        }
        field3983++;
        class602.field8367++;
        class326.method1901(null, -1, -1, -1);
        class682.method3837(arg0 ^ 0xFFFFFF39, null, -1, -1);
        class478.method2754(124);
        class676.field9444++;
        for (int var3 = 0; var3 < class54.field752; var3++) {
            class733 var4 = class638.field8801[var3].field8280;
            if (var4 != null) {
                byte var5 = var4.field10192.field1848;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method82((byte) 49);
                    if ((var5 & 0x2) != 0 && var4.field263 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field264[0] + var7;
                            int var10 = var4.field260[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class409.field5183 - var6 - 1)) {
                                var9 = class409.field5183 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class543.field7597 - var6 - 1)) {
                                var10 = class543.field7597 - var6 - 1;
                            }
                            int var11 = method1826(class164.field2280, var10, var6, 0, class526.field7350[var4.field5796], -126, class59.field827, true, var6, 0, -1, var4.field264[0], var6, var9, var4.field260[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field264[var12] = class59.field827[var11 - var12 - 1];
                                    var4.field260[var12] = class164.field2280[var11 - var12 - 1];
                                    var4.field259[var12] = 1;
                                }
                                var4.field263 = var11;
                            }
                        }
                    }
                    class174.method1197(-11299, var4, true);
                    int var13 = class346.method1980(-1, var4);
                    class743.method4139(var4, (byte) 7);
                    class582.method3312(var13, class751.field10492, class550.field7691, var4, (byte) 122);
                    class541.method3104(arg0 - 124, class550.field7691, var4);
                    class653.method3669(var4, 0);
                }
            }
        }
        if (class391.field4978 == 0 && class142.field2011 == 0) {
            if (class650.field9023 == 2) {
                class278.method1645(16384);
            } else {
                class491.method2899((byte) -113);
            }
            if (class450.field5953 >> 9 < 14 || (class450.field5953 >> 9) >= (class409.field5183 - 14) || (class318.field4121 >> 9) < 14 || class318.field4121 >> 9 >= class543.field7597 - 14) {
                class405.method2264(-1);
            }
        }
        while (true) {
            class694 var14;
            class288 var15;
            class288 var16;
            do {
                var14 = (class694) class367.field4733.method3665(arg0 ^ 0x5AFB);
                if (var14 == null) {
                    while (true) {
                        class694 var17;
                        class288 var18;
                        class288 var19;
                        do {
                            var17 = (class694) class600.field8356.method3665(23290);
                            if (var17 == null) {
                                while (true) {
                                    class694 var20;
                                    class288 var21;
                                    class288 var22;
                                    do {
                                        var20 = (class694) class129.field1834.method3665(23290);
                                        if (var20 == null) {
                                            if (class617.field8508 != null) {
                                                class630.method3542((byte) -86);
                                            }
                                            if ((class463.field6224 % 1500) == 0) {
                                                class426.method2445(-1);
                                            }
                                            if (class27.field484 == 7 && class391.field4978 == 0) {
                                                class255.method1556(true);
                                            }
                                            class634.method3555(-27);
                                            if (class473.field6353 && (class446.method2525(500) - 60000L) > class412.field5244) {
                                                class548.method3187(true);
                                            }
                                            if (arg0 != 1) {
                                                return;
                                            }
                                            for (class421 var23 = (class421) class372.field4776.method162(-22305); var23 != null; var23 = (class421) class372.field4776.method158(false)) {
                                                if (((long) var23.field5349) < (class446.method2525(500) / 1000L - 5L)) {
                                                    if (var23.field5350 > 0) {
                                                        class64.method588(arg0 + 1699767751, var23.field5353 + class454.field6022.method2547(-110, class243.field3143), 0, "", "", 5, "");
                                                    }
                                                    if (var23.field5350 == 0) {
                                                        class64.method588(1699767752, var23.field5353 + class454.field6023.method2547(-56, class243.field3143), 0, "", "", 5, "");
                                                    }
                                                    var23.method3835(0);
                                                }
                                            }
                                            if (class27.field484 == 7 && class391.field4978 == 0) {
                                                if (class12.field143 == null) {
                                                    class98.method785((byte) 17, false);
                                                    return;
                                                }
                                                class688.field9586++;
                                                if (class688.field9586 > 50) {
                                                    class367.field4729++;
                                                    class589 var24 = class514.method2994(-29488, class760.field10605, class393.field4991);
                                                    class737.method4107(var24, 7);
                                                }
                                                try {
                                                    class402.method2242((byte) 18);
                                                    return;
                                                } catch (IOException var25) {
                                                    class98.method785((byte) 127, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field9635;
                                        if (var21.field3740 < 0) {
                                            break;
                                        }
                                        var22 = class501.method2936(-55, var21.field3743);
                                    } while (var22 == null || var22.field3779 == null || var21.field3740 >= var22.field3779.length || var22.field3779[var21.field3740] != var21);
                                    class188.method1262(var20);
                                }
                            }
                            var18 = var17.field9635;
                            if (var18.field3740 < 0) {
                                break;
                            }
                            var19 = class501.method2936(-70, var18.field3743);
                        } while (var19 == null || var19.field3779 == null || var19.field3779.length <= var18.field3740 || var19.field3779[var18.field3740] != var18);
                        class188.method1262(var17);
                    }
                }
                var15 = var14.field9635;
                if (var15.field3740 < 0) {
                    break;
                }
                var16 = class501.method2936(-123, var15.field3743);
            } while (var16 == null || var16.field3779 == null || var15.field3740 >= var16.field3779.length || var16.field3779[var15.field3740] != var15);
            class188.method1262(var14);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1840(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
