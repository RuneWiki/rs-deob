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
public class client extends class370 {

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lfs;")
    public static class582[] field3924 = new class582[14];

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3930 = 1;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field3934 = -1;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field3941;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/Class;")
    public static Class field3940;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[S")
    public static short[] field3921;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1874(int arg0) {
        field3923++;
        String var2 = null;
        try {
            var2 = "[1)" + class632.field8626 + "," + class620.field8435 + "," + class596.field8090 + "," + class107.field1350 + "|";
            if (class300.field3596 != null) {
                var2 = var2 + "2)" + class581.field7921 + "," + (class300.field3596.field3453[0] + class632.field8626) + "," + (class300.field3596.field3455[0] + class620.field8435) + "|";
            }
            var2 = var2 + "3)" + class118.field1503.field10665.method1903(0) + "|4)" + class118.field1503.field10631.method2427(0) + "|5)" + class397.method2331(3) + "|6)" + class701.field9880 + "," + class705.field9921 + "|";
            var2 = var2 + "7)" + class118.field1503.field10628.method1580(0) + "|";
            var2 = var2 + "8)" + class118.field1503.field10672.method4113(0) + "|";
            var2 = var2 + "9)" + class118.field1503.field10675.method4155(0) + "|";
            var2 = var2 + "10)" + class118.field1503.field10641.method1572(arg0 + arg0) + "|";
            var2 = var2 + "11)" + class118.field1503.field10667.method408(arg0) + "|";
            var2 = var2 + "12)" + class118.field1503.field10632.method3881(0) + "|";
            var2 = var2 + "13)" + class730.field10230 + "|";
            var2 = var2 + "14)" + class289.field3493;
            if (class174.field2151 != null) {
                var2 = var2 + "|15)" + class174.field2151.field1067;
            }
            try {
                if (class118.field1503.field10665.method1903(0) == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3940 == null ? (field3940 = method1898("client")) : field3940).getClassLoader());
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
            } catch (Throwable var15) {
            }
            var2 = var2 + "]";
        } catch (Throwable var16) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1875(int arg0, int arg1) {
        class100.field1306 = null;
        class182.field2224.field10585 = arg1;
        class730.field10232 = 0;
        class557.field7743 = null;
        field3925++;
        int var3 = -88 % ((arg0 + 44) / 43);
        class182.field2224.field10584++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1876(boolean arg0) {
        field3935++;
        if (arg0) {
            this.method1879((byte) -99);
        }
        if (class182.field2224.field10584 > class615.field8270) {
            class55.field743.method2073((byte) 35);
            class558.field7754 = (class182.field2224.field10584 * 50 - 50) * 5;
            if (class558.field7754 > 3000) {
                class558.field7754 = 3000;
            }
            if (class182.field2224.field10584 >= 2 && class182.field2224.field10585 == 6) {
                this.method2161("js5connect_outofdate", -108);
                class289.field3493 = 14;
                return;
            }
            if (class182.field2224.field10584 >= 4 && class182.field2224.field10585 == -1) {
                this.method2161("js5crc", -113);
                class289.field3493 = 14;
                return;
            }
            if (class182.field2224.field10584 >= 4 && class183.method1227((byte) 127, class289.field3493)) {
                if (class182.field2224.field10585 == 7 || class182.field2224.field10585 == 9) {
                    this.method2161("js5connect_full", -100);
                } else if (class182.field2224.field10585 <= 0) {
                    this.method2161("js5io", -96);
                } else if (class229.field2710 == null) {
                    this.method2161("js5connect", -117);
                } else {
                    this.method2161("js5proxy_" + class229.field2710.trim(), -98);
                }
                class289.field3493 = 14;
                return;
            }
        }
        class615.field8270 = class182.field2224.field10584;
        if (class558.field7754 > 0) {
            class558.field7754--;
            return;
        }
        try {
            if (class730.field10232 == 0) {
                class557.field7743 = class55.field743.method2071(class521.field7389, false);
                class730.field10232++;
            }
            if (class730.field10232 == 1) {
                if (class557.field7743.field7769 == 2) {
                    if (class557.field7743.field7768 != null) {
                        class229.field2710 = (String) class557.field7743.field7768;
                    }
                    this.method1875(-96, 1000);
                    return;
                }
                if (class557.field7743.field7769 == 1) {
                    class730.field10232++;
                }
            }
            if (class730.field10232 == 2) {
                class100.field1306 = new class775((Socket) class557.field7743.field7768, class521.field7389, 25000);
                class403 var2 = new class403(5);
                var2.method2353(88, class307.field3786.field6730);
                var2.method2391(30, 648);
                class100.field1306.method4307(var2.field5275, 5, (byte) 90, 0);
                class730.field10232++;
                class602.field8135 = class349.method2069(true);
            }
            if (class730.field10232 == 3) {
                if (class183.method1227((byte) -117, class289.field3493) || class100.field1306.method4305(-122) > 0) {
                    int var3 = class100.field1306.method4302(false);
                    if (var3 != 0) {
                        this.method1875(-111, var3);
                        return;
                    }
                    class730.field10232++;
                } else if ((class349.method2069(true) - class602.field8135) > 30000L) {
                    this.method1875(-92, 1001);
                    return;
                }
            }
            if (class730.field10232 == 4) {
                boolean var4 = class183.method1227((byte) -52, class289.field3493) || class783.method4341((byte) -88, class289.field3493) || class451.method2741(class289.field3493, 0);
                class378[] var5 = class378.method2217(1);
                class403 var6 = new class403(var5.length * 4);
                class100.field1306.method4308(var6.field5275.length, 0, true, var6.field5275);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method2213(var6.method2381((byte) 78), (byte) 107);
                }
                class182.field2224.method4258(class100.field1306, !var4, (byte) -83);
                class100.field1306 = null;
                class730.field10232 = 0;
                class557.field7743 = null;
            }
        } catch (IOException var8) {
            this.method1875(99, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1877(int arg0) {
        field3937++;
        if (class118.field1503.field10665.method1903(arg0 ^ arg0) != 2) {
            this.method1888(arg0 + 18352);
            return;
        }
        try {
            this.method1888(-10243);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class705.method4008(var5, var5.getMessage() + " (Recovered) " + this.method1874(0), -127);
            class301.field3603 = true;
            class677.method3810(true, 0, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1878(byte arg0) {
        if (arg0 != -85) {
            field3934 = 47;
        }
        field3938++;
        boolean var2 = class182.field2224.method4267(-101);
        if (!var2) {
            this.method1876(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1879(byte arg0) {
        if (class66.field909) {
            class730.field10230 = 64;
        }
        field3929++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        if (arg0 != -31) {
            field3924 = null;
        }
        class387.method2268((byte) 48);
        class531.field7485 = new class692(class521.field7389);
        class182.field2224 = new class769();
        class201.method1301(new int[] { 20, 260 }, true, new int[] { 1000, 100 });
        if (class737.field10285 != class446.field6003) {
            class118.field1500 = new byte[50][];
        }
        class118.field1503 = class440.method2598(-2);
        if (class737.field10285 == class446.field6003) {
            class436.field5746.field4362 = this.getCodeBase().getHost();
        } else if (class612.method3465(class737.field10285, arg0 + 32)) {
            class436.field5746.field4362 = this.getCodeBase().getHost();
            class436.field5746.field4361 = class436.field5746.field4365 + 40000;
            class144.field1819.field4361 = class144.field1819.field4365 + 40000;
            class436.field5746.field4360 = class436.field5746.field4365 + 50000;
            class139.field1734.field4361 = class139.field1734.field4365 + 40000;
            class144.field1819.field4360 = class144.field1819.field4365 + 50000;
            class139.field1734.field4360 = class139.field1734.field4365 + 50000;
        } else if (class737.field10285 == class616.field8277) {
            class436.field5746.field4362 = "127.0.0.1";
            class144.field1819.field4362 = "127.0.0.1";
            class139.field1734.field4362 = "127.0.0.1";
            class436.field5746.field4361 = class436.field5746.field4365 + 40000;
            class144.field1819.field4361 = class144.field1819.field4365 + 40000;
            class436.field5746.field4360 = class436.field5746.field4365 + 50000;
            class139.field1734.field4361 = class139.field1734.field4365 + 40000;
            class144.field1819.field4360 = class144.field1819.field4365 + 50000;
            class139.field1734.field4360 = class139.field1734.field4365 + 50000;
        }
        if (class672.field9229 == class421.field5604) {
            class677.field9293 = class581.field7917;
            class245.field2896 = 16777215;
            class230.field2745 = 0;
            class400.field5239 = class148.field1834;
            class45.field603 = true;
        } else if (class672.field9229 == class607.field8171) {
            class677.field9293 = class558.field7758;
            class400.field5239 = class728.field10200;
        } else {
            class677.field9293 = class62.field837;
            class400.field5239 = class389.field5010;
        }
        field3921 = class17.field307 = class464.field6501 = class680.field9317 = new short[256];
        if (class672.field9229 == class359.field4463) {
            class783.field10808 = false;
        }
        class55.field743 = class436.field5746;
        try {
            class215.field2536 = class90.field1195.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class348.field4350 = class228.method1409((byte) 23, class109.field1370);
        class738.field10291 = class400.method2342((byte) -51, class109.field1370, true);
        try {
            if (class521.field7389.field9265 != null) {
                class370.field4631 = new class456(class521.field7389.field9265, 5200, 0);
                for (int var3 = 0; var3 < 37; var3++) {
                    class187.field2266[var3] = new class456(class521.field7389.field9269[var3], 6000, 0);
                }
                class199.field2377 = new class456(class521.field7389.field9264, 6000, 0);
                class778.field10746 = new class372(255, class370.field4631, class199.field2377, 500000);
                class765.field10540 = new class456(class521.field7389.field9245, 24, 0);
                class521.field7389.field9265 = null;
                class521.field7389.field9264 = null;
                class521.field7389.field9245 = null;
                class521.field7389.field9269 = null;
            }
        } catch (IOException var5) {
            class778.field10746 = null;
            class765.field10540 = null;
            class199.field2377 = null;
            class370.field4631 = null;
        }
        if (class737.field10285 != class446.field6003) {
            class23.field368 = true;
        }
        class25.field376 = class637.field8687.method3584(class770.field10592, true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1880() {
        int var0 = class235.field2787;
        int[] var1 = class75.field1040;
        int var2 = class512.field7236 ? var0 : class3.field42 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class287 var4;
            if (var3 < var0) {
                var4 = class61.field825[var1[var3]];
            } else {
                var4 = ((class273) class30.field444.method2121(103, (long) class2.field29[var3 - var0])).field3210;
            }
            if (var4.field3374 >= 0) {
                int var5 = var4.method1665(1720746760);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field823 & 0x1FF) == 0 && (var4.field813 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field823 & 0x1FF) == 256 && (var4.field813 & 0x1FF) == 256) {
                    continue;
                }
                var4.field809 = class483.method2867(var4.field808, (byte) -88, var4.field813, var4.field823);
                class36.method321(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3936++;
        try {
            if (arg0.length != 6) {
                class416.method2491("Argument count", -91);
            }
            class436.field5746 = new class350();
            class436.field5746.field4365 = Integer.parseInt(arg0[0]);
            class144.field1819 = new class350();
            class144.field1819.field4365 = Integer.parseInt(arg0[1]);
            class139.field1734 = new class350();
            class139.field1734.field4365 = Integer.parseInt(arg0[2]);
            class737.field10285 = class616.field8277;
            if (arg0[3].equals("live")) {
                class190.field2282 = class588.field8006;
            } else if (arg0[3].equals("rc")) {
                class190.field2282 = class358.field4434;
            } else if (arg0[3].equals("wip")) {
                class190.field2282 = class576.field7867;
            } else {
                class416.method2491("modewhat", -91);
            }
            class770.field10592 = class73.method691(-1, arg0[4]);
            if (class770.field10592 == -1) {
                if (arg0[4].equals("english")) {
                    class770.field10592 = 0;
                } else if (arg0[4].equals("german")) {
                    class770.field10592 = 1;
                } else {
                    class416.method2491("language", -91);
                }
            }
            class135.field1699 = false;
            class171.field2050 = false;
            if (arg0[5].equals("game0")) {
                class672.field9229 = class359.field4463;
            } else if (arg0[5].equals("game1")) {
                class672.field9229 = class421.field5604;
            } else if (arg0[5].equals("game2")) {
                class672.field9229 = class207.field2462;
            } else if (arg0[5].equals("game3")) {
                class672.field9229 = class607.field8171;
            } else {
                class416.method2491("game", -91);
            }
            class496.field6934 = false;
            class66.field909 = false;
            class486.field6780 = true;
            class324.field4018 = true;
            class176.field2187 = 0;
            class171.field2051 = 0L;
            class372.field4688 = null;
            class31.field491 = null;
            class444.field5951 = 0;
            class28.field429 = "";
            class86.field1152 = class672.field9229.field5926;
            class117.field1495 = 0;
            client var1 = new client();
            class90.field1195 = var1;
            var1.method2159(648, class190.field2282.method4311(false) + 32, 37, class672.field9229.field5924, false, 768, 1024, (byte) -109);
            class645.field8790.setLocation(40, 40);
        } catch (Exception var3) {
            class705.method4008(var3, null, -123);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1881() {
        int var0 = class235.field2787;
        int[] var1 = class75.field1040;
        int var2 = class118.field1503.field10659.method4298(0);
        boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;
        for (int var4 = 0; var4 < var0; var4++) {
            class521 var14 = class61.field825[var1[var4]];
            if (!var14.method3119((byte) -92)) {
                var14.field3374 = -1;
            } else if (var14.field7366) {
                var14.field3374 = -1;
            } else {
                var14.method671((byte) 127);
                if (var14.field9994 >= 0 && var14.field9997 >= 0 && var14.field9991 < class596.field8090 && var14.field9990 < class107.field1350) {
                    var14.field7398 = var14.field3426 ? var3 : false;
                    if (class300.field3596 == var14) {
                        var14.field3374 = Integer.MAX_VALUE;
                    } else {
                        int var15 = 0;
                        if (!var14.field3363) {
                            var15++;
                        }
                        if (var14.field3445 > class228.field2707) {
                            var15 += 2;
                        }
                        int var16 = var15 + (5 - var14.method1665(1720746760) << 2);
                        if (var14.field7356 || var14.field7353) {
                            var16 += 512;
                        } else {
                            if (class313.field3856 == 0) {
                                var16 += 32;
                            } else {
                                var16 += 128;
                            }
                            var16 += 256;
                        }
                        var14.field3374 = var16 + 1;
                    }
                } else {
                    var14.field3374 = -1;
                }
            }
        }
        for (int var5 = 0; var5 < class3.field42; var5++) {
            class388 var11 = ((class273) class30.field444.method2121(94, (long) class2.field29[var5])).field3210;
            if (var11.method2269((byte) -124) && var11.field5003.method2842(class2.field30, (byte) -16)) {
                var11.method671((byte) 125);
                if (var11.field9994 >= 0 && var11.field9997 >= 0 && var11.field9991 < class596.field8090 && var11.field9990 < class107.field1350) {
                    int var12 = 0;
                    if (!var11.field3363) {
                        var12++;
                    }
                    if (var11.field3445 > class228.field2707) {
                        var12 += 2;
                    }
                    int var13 = var12 + (5 - var11.method1665(1720746760) << 2);
                    if (class313.field3856 == 0) {
                        if (var11.field5003.field6635) {
                            var13 += 64;
                        } else {
                            var13 += 128;
                        }
                    } else if (class313.field3856 == 1) {
                        if (var11.field5003.field6635) {
                            var13 += 32;
                        } else {
                            var13 += 64;
                        }
                    }
                    if (var11.field5003.field6652) {
                        var13 += 1024;
                    } else if (!var11.field5003.field6696) {
                        var13 += 256;
                    }
                    var11.field3374 = var13 + 1;
                } else {
                    var11.field3374 = -1;
                }
            } else {
                var11.field3374 = -1;
            }
        }
        for (int var6 = 0; var6 < class56.field756.length; var6++) {
            class615 var7 = class56.field756[var6];
            if (var7 != null) {
                if (var7.field8259 == 1) {
                    class273 var8 = (class273) class30.field444.method2121(97, (long) var7.field8258);
                    if (var8 != null) {
                        class388 var9 = var8.field3210;
                        if (var9.field3374 >= 0) {
                            var9.field3374 += 2048;
                        }
                    }
                } else if (var7.field8259 == 10) {
                    class521 var10 = class61.field825[var7.field8258];
                    if (var10 != null && class300.field3596 != var10 && var10.field3374 >= 0) {
                        var10.field3374 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lkq;)Lbk;")
    public static final class396 method1882(class620 arg0) {
        class396 var1 = (class396) class539.field7586.method2121(82, ((long) arg0.field8515 << 32) + (long) arg0.field8445);
        return var1 == null ? arg0.field8440 : var1;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1883(int arg0) {
        int var1 = class235.field2787;
        int[] var2 = class75.field1040;
        for (int var3 = 0; var3 < class3.field42 + var1; var3++) {
            class287 var4;
            if (var3 < var1) {
                var4 = class61.field825[var2[var3]];
            } else {
                var4 = ((class273) class30.field444.method2121(98, (long) class2.field29[var3 - var1])).field3210;
            }
            if (var4.field808 == arg0 && var4.field3374 >= 0) {
                int var5 = var4.method1665(1720746760);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field823 & 0x1FF) != 0 || (var4.field813 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field823 & 0x1FF) != 256 || (var4.field813 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field823 >> 9;
                    int var7 = var4.field813 >> 9;
                    if (var4.field3374 > class676.field9280[var6][var7]) {
                        class676.field9280[var6][var7] = var4.field3374;
                        class46.field611[var6][var7] = 1;
                    } else if (class676.field9280[var6][var7] == var4.field3374) {
                        var10002 = class46.field611[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field823 - var8 >> 9;
                    int var10 = var4.field813 - var8 >> 9;
                    int var11 = var4.field823 + var8 >> 9;
                    int var12 = var4.field813 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3374 > class676.field9280[var13][var14]) {
                                class676.field9280[var13][var14] = var4.field3374;
                                class46.field611[var13][var14] = 1;
                            } else if (class676.field9280[var13][var14] == var4.field3374) {
                                var10002 = class46.field611[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        int var1 = class235.field2787;
        int[] var2 = class75.field1040;
        int var3 = class512.field7236 ? var1 : class3.field42 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class287 var5;
            if (var4 < var1) {
                var5 = class61.field825[var2[var4]];
            } else {
                var5 = ((class273) class30.field444.method2121(88, (long) class2.field29[var4 - var1])).field3210;
            }
            if (var5.field808 == arg0) {
                var5.field3433 = 0;
                if (var5.field3374 < 0) {
                    var5.field3363 = false;
                } else {
                    int var6 = var5.method1665(1720746760);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field823 & 0x1FF) != 0 || (var5.field813 & 0x1FF) != 0) {
                            var5.field3363 = false;
                            continue;
                        }
                    } else if ((var5.field823 & 0x1FF) != 256 || (var5.field813 & 0x1FF) != 256) {
                        var5.field3363 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field823 >> 9;
                        int var8 = var5.field813 >> 9;
                        if (class676.field9280[var7][var8] != var5.field3374) {
                            var5.field3363 = true;
                            continue;
                        }
                        if (class46.field611[var7][var8] > 1) {
                            var10002 = class46.field611[var7][var8]--;
                            var5.field3363 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field823 - var9 >> 9;
                        int var11 = var5.field813 - var9 >> 9;
                        int var12 = var5.field823 + var9 >> 9;
                        int var13 = var5.field813 + var9 >> 9;
                        if (!class439.method2589(var11, true, var10, var12, var13, var5.field3374)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class676.field9280[var14][var15] == var5.field3374) {
                                        var10002 = class46.field611[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3363 = true;
                            continue;
                        }
                    }
                    var5.field3363 = false;
                    var5.field809 = class483.method2867(var5.field808, (byte) -80, var5.field813, var5.field823);
                    class36.method321(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lkq;)Lkq;")
    public static final class620 method1885(class620 arg0) {
        int var1 = method1882(arg0).method2323(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class479.method2848(arg0.field8400, (byte) 127);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method1886(int arg0) {
        field3924 = null;
        if (arg0 == -24260) {
            field3921 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1887(int arg0) {
        field3922++;
        method1886(-24260);
        class442.method2601(-112);
        class763.method4231(false);
        class637.method3583((byte) -53);
        class722.method4086((byte) -95);
        class787.method4354((byte) -96);
        class535.method3185(arg0 - 1946);
        class123.method956((byte) -109);
        class378.method2214(-580);
        class552.method3239(arg0 ^ 0x63);
        class476.method2829(16204);
        class676.method3807(false);
        class151.method1084(false);
        class285.method1645(-36);
        class152.method1089((byte) -99);
        class379.method2220(false);
        class362.method2114(0);
        class370.method2157(false);
        class310.method1832(arg0 - 23962);
        class776.method4310((byte) -96);
        class558.method3252(0);
        class441.method2600((byte) -100);
        class778.method4318((byte) -79);
        class66.method624(arg0 ^ arg0);
        class773.method4291(1);
        class615.method3481(-1);
        class589.method3379(true);
        class450.method2731(-49);
        class769.method4268(0);
        class692.method3866(-102);
        class286.method1661((byte) -96);
        class381.method2232((byte) -39);
        class48.method458((byte) -57);
        class456.method2768(true);
        class372.method2174((byte) -128);
        class288.method1688(0);
        class229.method1412((byte) 41);
        class614.method3480(-2);
        class165.method1147(true);
        class517.method3097((byte) 55);
        class544.method3212((byte) -96);
        class473.method2825(-112);
        class750.method4190(32);
        class733.method4135(8);
        class293.method1708(64);
        class148.method1067(-66);
        class486.method2880(50);
        class790.method4363((byte) -118);
        class320.method1909(35);
        class644.method3597(100);
        class185.method1230(2);
        class651.method3682(-20247);
        class245.method1474((byte) 107);
        class141.method1026(1);
        class179.method1209(15);
        class466.method2794(15135);
        class749.method4186(-1);
        class445.method2620(arg0 - 112);
        class627.method3559(arg0 ^ 0x311D);
        class455.method2753((byte) -102);
        class127.method971(arg0 ^ 0x7);
        class629.method3563((byte) 31);
        class403.method2400((byte) -14);
        class468.method2805(true);
        class503.method3020(-99);
        class247.method1485((byte) -125);
        class415.method2483(arg0 ^ 0x6);
        class117.method919(116);
        class257.method1547((byte) -126);
        class146.method1063(1403);
        class408.method2441((byte) -69);
        class620.method3520(-18307);
        class540.method3200(115);
        class521.method3118(arg0 - 6);
        class369.method2154(false);
        class657.method3708(-76);
        class500.method2961((byte) 123);
        class330.method1963((byte) 110);
        class264.method1575((byte) -95);
        class336.method1991((byte) 64);
        class287.method1664(-2229);
        class727.method4111(-12865);
        class659.method3710((byte) 89);
        class388.method2271((byte) -47);
        class52.method473((byte) -14);
        class396.method2322((byte) -74);
        class325.method1935((byte) -117);
        class595.method3407(-58);
        class313.method1848(arg0 ^ 0x23DB);
        class495.method2917(-23493);
        class112.method895((byte) -113);
        class792.method4367((byte) -100);
        class208.method1314((byte) -70);
        class349.method2070((byte) -120);
        class180.method1211(-26880);
        class631.method3568((byte) 44);
        class204.method1309(109);
        class574.method3327(false);
        class467.method2797((byte) -70);
        class145.method1062((byte) 109);
        class639.method3587(arg0 ^ 0x4DF);
        class316.method1863((byte) -56);
        class323.method1926(arg0 ^ 0xFFFF8F87);
        class338.method2000(-15162);
        class756.method4217((byte) -49);
        class498.method2942(arg0 ^ 0xFFFFFF99);
        class269.method1592((byte) -127);
        class140.method1020(-116);
        class645.method3605(arg0 + 119);
        class542.method3209(false);
        class297.method1736(-86);
        class174.method1188(31983);
        class496.method2920(124);
        class37.method324(true);
        class481.method2856((byte) 99);
        class340.method2011(-1);
        class67.method658(-16777216);
        class573.method3320((byte) 100);
        class233.method1434(arg0 ^ 0x107);
        class404.method2428((byte) 126);
        class674.method3785(-12875);
        class222.method1369(true);
        class54.method481(20000);
        class587.method3371(69);
        class607.method3450((byte) 91);
        class656.method3703((byte) 105);
        class266.method1579(-9720);
        class728.method4116((byte) 101);
        class355.method2086(false);
        class437.method2580(-1);
        class272.method1599(false);
        class198.method1288(arg0 - 4);
        class536.method3188((byte) -124);
        class161.method1133((byte) -1);
        class262.method1569(15453);
        class319.method1906((byte) 100);
        class740.method4153(119);
        class680.method3825((byte) -99);
        class662.method3718(-21962);
        class648.method3654(-1);
        class358.method2098(true);
        class267.method1587(-97);
        class22.method241(115);
        class677.method3814((byte) -37);
        class513.method3077((byte) -17);
        class435.method2572((byte) -118);
        class307.method1811(arg0 ^ 0x73);
        class460.method2780((byte) 27);
        class515.method3082(true);
        class192.method1258((byte) 32);
        class712.method4034((byte) -101);
        class61.method522((byte) 100);
        class502.method2994(0);
        class260.method1553((byte) 41);
        class193.method1260(12764);
        class228.method1408(92);
        class142.method1046();
        class744.method4168(true);
        class425.method2537(arg0 ^ 0x6);
        class164.method1142((byte) -66);
        class382.method2251((byte) -20);
        class133.method988((byte) 76);
        class720.method4075((byte) 90);
        class642.method3595((byte) 122);
        class470.method2812(86);
        class26.method258(109);
        class452.method2743(false);
        class541.method3206(-110);
        class187.method1241(-118);
        class32.method303(arg0 + 99);
        class704.method4005(8192);
        class751.method4197(32709);
        class507.method3038(11029);
        class9.method152();
        class647.method3645(-18934);
        class461.method2783(61);
        class548.method3222(-52);
        class678.method3817(arg0 + 114);
        class5.method103(true);
        class462.method2785(arg0 ^ 0x7);
        class459.method2779(arg0 ^ 0xFFFFFFE9);
        class105.method862((byte) 103);
        class4.method100(false);
        class126.method969(arg0 ^ 0x2BF6);
        class103.method851((byte) -24);
        class497.method2937((byte) 113);
        class35.method317(-121);
        class276.method1610(true);
        class687.method3841(-1);
        class155.method1105((byte) -59);
        class766.method4241();
        class416.method2492((byte) 124);
        class780.method4328(0);
        class346.method2061(false);
        class304.method1761(110);
        class701.method3971(false);
        class120.method939(-30369);
        class522.method3132(63);
        class625.method3552(-30049);
        class305.method1770(false);
        class143.method1053();
        class482.method2861(-105);
        class418.method2498(-9147);
        class64.method543(arg0 ^ 0xFFFFFFAE);
        class653.method3695(arg0 + 16624);
        class760.method4227((byte) 113);
        class512.method3075(false);
        class25.method252((byte) 127);
        class250.method1498((byte) -82);
        class393.method2302(true);
        class699.method3886(17);
        class621.method3537(arg0 - 6);
        class10.method173(-9);
        class196.method1285(arg0 - 7);
        class443.method2607();
        class62.method535(121);
        class28.method266((byte) -112);
        class33.method309(512);
        class201.method1299(39);
        class649.method3658();
        class31.method294((byte) 126);
        class308.method1826((byte) -29);
        class725.method4109(arg0 ^ 0xD);
        class430.method2552(1382040008);
        class737.method4145(20361);
        class96.method837(-29765);
        class527.method3149();
        class215.method1344(-1);
        class603.method3440(-9086);
        class63.method542(0);
        class333.method1972(arg0 + 19406);
        class224.method1377(8);
        class270.method1594((byte) 123);
        class253.method1505(arg0 - 118);
        class752.method4203(false);
        class613.method3471((byte) -93);
        class777.method4314(true);
        class130.method976((byte) -19);
        class652.method3685(-5);
        class398.method2338(2);
        class371.method2172((byte) 14);
        class395.method2318(false);
        class113.method899(0);
        class765.method4239(false);
        class124.method961(arg0 - 118);
        class788.method4357(-119);
        class239.method1447(13201);
        class88.method809(false);
        class159.method1115((byte) 127);
        class131.method978(-53);
        class147.method1065((byte) -99);
        class121.method941((byte) 42);
        class68.method675(arg0 + 121);
        class390.method2284(0);
        class707.method4015(31);
        class427.method2546((byte) -101);
        class374.method2183((byte) 47);
        class436.method2576(6);
        class216.method1346(0);
        class397.method2330(0);
        class34.method312((byte) -110);
        class757.method4221(true);
        class569.method3290(79);
        class491.method2900(262144);
        class518.method3105(-119);
        class440.method2599((byte) -1);
        class132.method981(arg0 ^ 0xFFFFE92C);
        class119.method932((byte) -81);
        class3.method96(true);
        class670.method3758(50);
        class17.method206((byte) 105);
        class6.method115(7990);
        class251.method1501(0);
        class139.method1017((byte) 13);
        class212.method1336((byte) 115);
        class2.method95((byte) -116);
        class463.method2788(arg0 - 8);
        class665.method3733(112);
        class554.method3247(0);
        class424.method2535(5);
        class519.method3114(1431655765);
        class332.method1971(19969);
        class226.method1387(true);
        class580.method3344((byte) 127);
        class23.method242((byte) -99);
        class359.method2101(-115);
        class618.method3503(-71);
        class483.method2869(arg0 ^ 0x3FF8);
        class73.method689(94);
        class219.method1358((byte) 52);
        class231.method1421((byte) 127);
        class557.method3250(arg0 ^ 0x7);
        class255.method1518(false);
        class480.method2853(-1);
        class597.method3414(arg0 - 122);
        class576.method3332(true);
        class107.method873(arg0 + 43);
        class668.method3753(2);
        class36.method320(-32406);
        class106.method870();
        class669.method3755(true);
        class301.method1755((byte) -3);
        class611.method3462(14);
        class81.method772(arg0 - 2975);
        class199.method1293((byte) -113);
        class419.method2503(true);
        class431.method2555(arg0 ^ 0x7);
        class417.method2493(false);
        class367.method2139(-117);
        class365.method2132((byte) 126);
        class83.method781((byte) 74);
        class565.method3266(17662);
        class635.method3580(1);
        class144.method1055((byte) 92);
        class156.method1107(200);
        class344.method2044();
        class243.method1467(117);
        class663.method3727();
        class42.method345();
        class454.method2750(20462);
        class538.method3195(arg0 ^ 0x6A);
        class220.method1360();
        class314.method1851(0);
        class716.method4047(-2);
        class56.method490(true);
        class465.method2792(-107);
        class578.method3335(arg0 - 7);
        class137.method1009(88);
        class655.method3700(16384);
        class783.method4338((byte) -58);
        class93.method825(arg0 + 3);
        class357.method2094(90);
        class409.method2449(true);
        class553.method3246(arg0 - 5);
        class71.method683(15);
        class150.method1080(false);
        class526.method3144((byte) -58);
        class102.method850((byte) 92);
        class458.method2771(false);
        class153.method1094((byte) -122);
        class160.method1125();
        class30.method289(2);
        class444.method2616(-66);
        class604.method3442(-17412);
        class109.method880(arg0 ^ 0x7D);
        class488.method2895((byte) 93);
        class375.method2185(-2660);
        class291.method1699(-103);
        class138.method1012(0);
        class18.method223(true);
        class203.method1305(true);
        class85.method786(1);
        class410.method2451(false);
        class244.method1470(arg0 + 940);
        class221.method1366(11);
        class438.method2586((byte) 16);
        class761.method4228((byte) 127);
        class622.method3539(94);
        class7.method140((byte) -104);
        class506.method3037(-5);
        class700.method3957(-59);
        class406.method2438(0);
        class784.method4347(true);
        class742.method4167(false);
        class616.method3489(true);
        class446.method2626(arg0 ^ 0x6);
        class451.method2742(64);
        class195.method1277((byte) -52);
        class400.method2343((byte) 114);
        class182.method1216(false);
        class235.method1441(29095);
        class664.method3731(-4437);
        class421.method2512(2575);
        class283.method1627(-22840);
        class331.method1967(-118);
        class449.method2689(27);
        class504.method3025(false);
        class748.method4175(116);
        class213.method1338(255);
        class256.method1534(-91);
        class688.method3845(0);
        class191.method1252(-16731);
        class721.method4085(-121);
        class532.method3171(53);
        class13.method193(-23302);
        class53.method476(arg0 + 69);
        class368.method2151(-10);
        class785.method4349(65);
        class650.method3659((byte) 58);
        class636.method3582(1);
        class738.method4151(arg0 ^ 0x466D);
        class439.method2591(-8204);
        class609.method3459();
        class274.method1603(-59);
        class619.method3509(arg0 ^ 0x78);
        class114.method904(107);
        class12.method188(2048);
        class599.method3416((byte) -105);
        class661.method3713(-106);
        class477.method2837((byte) -28);
        class277.method1612((byte) 34);
        class520.method3117((byte) 55);
        class39.method335((byte) -95);
        class8.method143(-102);
        class74.method693(2048);
        class345.method2055((byte) 109);
        class641.method3593((byte) -94);
        class72.method687(true);
        class632.method3571(arg0 + 22778);
        class789.method4360(false);
        class556.method3249((byte) -84);
        class588.method3374(70);
        class399.method2339(arg0 + 20264);
        class181.method1213(false);
        class386.method2262(-19324);
        class309.method1828(0);
        class46.method413(arg0 ^ 0x5);
        class634.method3577((byte) -66);
        class352.method2075(1365);
        class271.method1597(119);
        class673.method3781(-74);
        class353.method2079(21440);
        class118.method925(true);
        class654.method3696();
        class95.method833(320);
        class708.method4016(arg0 - 122);
        class173.method1173(-1);
        class282.method1623((byte) 106);
        class779.method4325(false);
        class534.method3180((byte) -22);
        class682.method3831(5888);
        class209.method1318(false);
        class227.method1395(25641);
        class207.method1311(0);
        class210.method1326(0);
        class322.method1925((byte) 70);
        class571.method3306((byte) -95);
        class533.method3174(arg0 ^ 0x17);
        class16.method204(0);
        class237.method1446((byte) -92);
        class709.method4019(1334576944);
        class190.method1250(true);
        class575.method3328(true);
        class104.method855((byte) 29);
        class666.method3737(true);
        class115.method907(false);
        class471.method2814(-74);
        class55.method487((byte) -103);
        class50.method468(-21265);
        class347.method2063(true);
        class434.method2571(true);
        class606.method3444(arg0 - 7);
        class363.method2122((byte) 98);
        class356.method2090(12);
        class508.method3042((byte) 88);
        class464.method2789((byte) -70);
        class426.method2541((byte) 71);
        class324.method1929((byte) -4);
        class531.method3166((byte) -86);
        class591.method3387(91);
        class111.method891(-1);
        class689.method3848(true);
        class710.method4025(-1);
        class612.method3466(arg0 - 8);
        class478.method2840((byte) 63);
        class385.method2260((byte) 70);
        class772.method4284((byte) 103);
        class289.method1696(true);
        class65.method550(4547);
        class501.method2974(30813);
        class172.method1168(30950);
        class583.method3358(1);
        class135.method999(105);
        class383.method2254((byte) -19);
        class300.method1754(true);
        class729.method4122((byte) -105);
        class27.method260(false);
        class764.method4237((byte) 3);
        class321.method1919(-52);
        class394.method2316((byte) -88);
        class447.method2635((byte) -107);
        class610.method3460(arg0 + 119);
        class223.method1374((byte) -70);
        class100.method847(arg0 ^ 0x5495);
        class157.method1108((byte) 69);
        class691.method3859(2);
        class523.method3137(105);
        class747.method4174((byte) 20);
        class348.method2065((byte) 68);
        class392.method2298(-645917983);
        class343.method2033(9750);
        class77.method710(-123);
        class731.method4130(127);
        class389.method2282(2859);
        class754.method4210(-80);
        class188.method1245(-620);
        class448.method2638(-29);
        class730.method4124((byte) -91);
        class318.method1872(-1);
        class432.method2560(arg0 ^ 0x397E3457);
        class342.method2031((byte) -40);
        class149.method1077(23092);
        class329.method1952((byte) 6);
        class514.method3079(arg0 ^ 0x57);
        class786.method4350(true);
        class581.method3345((byte) -78);
        class75.method696(2048);
        class41.method338((byte) -120);
        class259.method1550(arg0 ^ 0xFFFFFFF8);
        class734.method4144(117);
        class617.method3496((byte) -88);
        class624.method3544(true);
        class547.method3219(126);
        class741.method4161(-101);
        class38.method328((byte) 116);
        class683.method3836((byte) 13);
        class189.method1246(19589);
        class303.method1760((byte) 106);
        class384.method2256(arg0 - 5);
        class555.method3248((byte) 98);
        class594.method3406((byte) 30);
        class539.method3198((byte) -117);
        class241.method1454(0);
        class326.method1940((byte) -7);
        class116.method913((byte) 124);
        class770.method4270(-41);
        class633.method3575(true);
        class391.method2291(-257);
        class186.method1239(arg0 ^ 0xFFFFFFA1);
        class82.method776(arg0 + 7179);
        class249.method1494((byte) 22);
        class484.method2870(-103);
        class108.method874(arg0 ^ 0x72);
        class755.method4215(-14134);
        class176.method1203(5);
        class433.method2562(0);
        class90.method817((byte) -90);
        class718.method4068(-1349);
        class354.method2082(127);
        class205.method1310(arg0 ^ 0x6);
        class543.method3211((byte) -102);
        class217.method1351(-29504);
        class183.method1224(22);
        class672.method3778((byte) -69);
        class86.method796(arg0 - 7132);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1888(int arg0) {
        field3928++;
        if (arg0 != -10243 || class289.field3493 == 14) {
            return;
        }
        class228.field2707++;
        if (class228.field2707 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class338.field4187 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class503.field7114.setSeed((long) class338.field4187);
        }
        if ((class228.field2707 % 50) == 0) {
            class381.field4828 = class541.field7603;
            class541.field7603 = 0;
            class54.field722 = class168.field2029;
            class168.field2029 = 0;
        }
        this.method1878((byte) -85);
        if (class458.field6463 != null) {
            class458.field6463.method1655(0);
        }
        class517.method3096(3);
        class7.method129((byte) -120);
        class348.field4350.method212((byte) -76);
        class738.field10291.method121((byte) 121);
        if (class363.field4526 != null) {
            class363.field4526.method56((int) class349.method2069(true));
        }
        class256.method1527(false);
        class437.field5757 = 0;
        class535.field7538 = 0;
        for (class732 var3 = class348.field4350.method210(114); var3 != null; var3 = class348.field4350.method210(116)) {
            int var6 = var3.method1452(6925);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1453(1714);
                if (class506.method3034(-7021) && var7 == '`' || var7 == '§' || var7 == '²') {
                    if (class505.method3030((byte) 125)) {
                        class485.method2873((byte) -25);
                    } else {
                        class41.method339((byte) -11);
                    }
                } else if (class437.field5757 < 128) {
                    class542.field7608[class437.field5757] = var3;
                    class437.field5757++;
                }
            } else if (var6 == 0 && class535.field7538 < 75) {
                class155.field1920[class535.field7538] = var3;
                class535.field7538++;
            }
        }
        class662.field9092 = 0;
        for (class730 var4 = class738.field10291.method111(arg0 + 10319); var4 != null; var4 = class738.field10291.method111(68)) {
            int var5 = var4.method1941(arg0 ^ 0xFFFF28FD);
            if (var5 == -1) {
                class642.field8761.method2732(var4, 21939);
            } else if (var5 == 6) {
                class662.field9092 += var4.method1944((byte) 122);
            } else if (class412.method2456((byte) 84, var5)) {
                class155.field1929.method2732(var4, 21939);
                if (class155.field1929.method2736(-12418) > 10) {
                    class155.field1929.method2730(-31260);
                }
            }
        }
        if (class505.method3030((byte) 125)) {
            class25.method251(arg0 ^ 0x2802);
        }
        if (class183.method1227((byte) 95, class289.field3493)) {
            class391.method2292(100);
            class750.method4194(arg0 + 10243);
        } else if (class458.method2776(false, class289.field3493)) {
            class793.method4372(-110);
        }
        if (class783.method4341((byte) -54, class289.field3493) && !class458.method2776(false, class289.field3493)) {
            this.method1894(false);
            class23.method243(-104);
            class134.method996(113);
        } else if (class451.method2741(class289.field3493, arg0 ^ 0xFFFFD7FD) && !class458.method2776(false, class289.field3493)) {
            this.method1894(false);
            class134.method996(arg0 + 10317);
        } else if (class289.field3493 == 12) {
            class134.method996(121);
        } else if (class17.method211(class289.field3493, arg0 ^ 0x4C3B) && !class458.method2776(false, class289.field3493)) {
            class772.method4281((byte) 27);
        } else if (class289.field3493 == 13) {
            class134.method996(39);
            if (class324.field4023 != -3 && class324.field4023 != 2 && class324.field4023 != 15) {
                class268.method1590(arg0 + 10255, false);
            }
        }
        class571.method3302(class363.field4526, -122);
        class155.field1929.method2730(-31260);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method1889(int arg0) {
        field3932++;
        if (~class118.field1503.field10665.method1903(0) != arg0) {
            this.method1892(-29100);
            return;
        }
        try {
            this.method1892(-29100);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class705.method4008(var5, var5.getMessage() + " (Recovered) " + this.method1874(arg0 + 3), -124);
            class301.field3603 = true;
            class677.method3810(true, 0, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1890() {
        for (int var0 = 0; var0 < class596.field8090; var0++) {
            int[] var1 = class676.field9280[var0];
            for (int var2 = 0; var2 < class107.field1350; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lkq;)Z")
    public static final boolean method1891(class620 arg0) {
        if (class687.field9373) {
            if (method1882(arg0).field5126 != 0) {
                return false;
            }
            if (arg0.field8371 == 0) {
                return false;
            }
        }
        return arg0.field8361;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    private final void method1892(int arg0) {
        field3933++;
        if (class289.field3493 == 14) {
            return;
        }
        long var2 = class635.method3581(-14513) / 1000000L - class280.field3267;
        class280.field3267 = class635.method3581(-14513) / 1000000L;
        boolean var4 = class439.method2594((byte) -121);
        if (var4 && class52.field712 && class388.field4979 != null) {
            class388.field4979.method1557(77);
        }
        if (class757.method4219(arg0 + 28978, class289.field3493)) {
            if (class533.field7510 != 0L && class533.field7510 < class349.method2069(true)) {
                class121.method947(class397.method2331(arg0 ^ 0xFFFF8E57), class178.field2191, class213.field2522, 1, false);
            } else if (!class363.field4526.method629() && class144.field1811) {
                class137.method1008(0);
            }
        }
        if (class260.field3075 == null) {
            Container var5;
            if (class645.field8790 != null) {
                var5 = class645.field8790;
            } else if (class345.field4331 == null) {
                var5 = class672.field9220;
            } else {
                var5 = class345.field4331;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class645.field8790 == var5) {
                Insets var8 = class645.field8790.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class484.field6751 != var6 || class39.field570 != var7 || class723.field10141) {
                if (class363.field4526 == null || class363.field4526.method625()) {
                    class387.method2268((byte) 98);
                } else {
                    class484.field6751 = var6;
                    class39.field570 = var7;
                }
                class533.field7510 = class349.method2069(true) + 500L;
                class723.field10141 = false;
            }
        }
        if (class260.field3075 != null && !class63.field862 && class757.method4219(-65, class289.field3493)) {
            class121.method947(class118.field1503.field10674.method3823(0), -1, -1, 1, false);
        }
        boolean var9 = false;
        if (class4.field45) {
            class4.field45 = false;
            var9 = true;
        }
        if (var9) {
            class419.method2502(-16315);
        }
        if (class363.field4526 != null && class363.field4526.method629() || class397.method2331(3) != 1) {
            class41.method341(-79);
        }
        if (class183.method1227((byte) -79, class289.field3493)) {
            class731.method4132(var9, true);
        } else if (class112.method894(-116, class289.field3493)) {
            class733.method4133(1984);
        } else if (class370.method2167(class289.field3493, false)) {
            class733.method4133(1984);
        } else if (class458.method2776(false, class289.field3493)) {
            if (class783.field10805 == 1) {
                if (class55.field741 < class430.field5666) {
                    class55.field741 = class430.field5666;
                }
                int var10 = (class55.field741 - class430.field5666) * 50 / class55.field741;
                class671.method3764(arg0 + 29024, class637.field8687.method3584(class770.field10592, true) + "<br>(" + var10 + "%)", class466.field6523, class363.field4526, true, class708.field9946);
            } else if (class783.field10805 == 2) {
                if (class148.field1850 < class427.field5654) {
                    class148.field1850 = class427.field5654;
                }
                int var11 = (class148.field1850 - class427.field5654) * 50 / class148.field1850 + 50;
                class671.method3764(-56, class637.field8687.method3584(class770.field10592, true) + "<br>(" + var11 + "%)", class466.field6523, class363.field4526, true, class708.field9946);
            } else {
                class671.method3764(arg0 + 28975, class637.field8687.method3584(class770.field10592, true), class466.field6523, class363.field4526, true, class708.field9946);
            }
        } else if (class289.field3493 == 10) {
            class33.method310(1175895560, var2);
        } else if (class289.field3493 == 13) {
            class671.method3764(-43, class637.field8689.method3584(class770.field10592, true) + "<br>" + class637.field8690.method3584(class770.field10592, true), class466.field6523, class363.field4526, false, class708.field9946);
        }
        if (class710.field9966 == 3) {
            for (int var12 = 0; var12 < class104.field1332; var12++) {
                Rectangle var13 = class483.field6743[var12];
                if (class704.field9908[var12]) {
                    class363.field4526.method598(var13.width, var13.y, arg0 ^ 0xFFFF8E2B, var13.x, var13.height, -65281);
                } else if (class417.field5443[var12]) {
                    class363.field4526.method598(var13.width, var13.y, 127, var13.x, var13.height, -65536);
                } else {
                    class363.field4526.method598(var13.width, var13.y, 126, var13.x, var13.height, -16711936);
                }
            }
        }
        if (class505.method3030((byte) 125)) {
            class340.method2005(class363.field4526, arg0 + 29100);
        }
        if (class521.field7389.field9260 && class757.method4219(-53, class289.field3493) && class710.field9966 == 0 && class397.method2331(3) == 1 && !var9) {
            int var14 = 0;
            for (int var15 = 0; var15 < class104.field1332; var15++) {
                if (class417.field5443[var15]) {
                    class417.field5443[var15] = false;
                    class792.field10889[var14++] = class483.field6743[var15];
                }
            }
            try {
                if (class769.field10572) {
                    class547.method3218(class792.field10889, arg0 ^ 0x71AA, var14);
                } else {
                    class363.field4526.method630(class792.field10889, -72, var14);
                }
            } catch (class677 var20) {
            }
        } else if (!class183.method1227((byte) 106, class289.field3493)) {
            for (int var16 = 0; var16 < class104.field1332; var16++) {
                class417.field5443[var16] = false;
            }
            try {
                if (class769.field10572) {
                    class505.method3027(-98);
                } else {
                    class363.field4526.method591((byte) 112);
                }
            } catch (class677 var19) {
                class705.method4008(var19, var19.getMessage() + " (Recovered) " + this.method1874(0), arg0 + 28976);
                class677.method3810(true, 0, false);
            }
        }
        class537.method3192(-94);
        int var18 = class118.field1503.field10638.method3837(0);
        if (var18 == 0) {
            class594.method3405(15L, arg0 + 16740780);
        } else if (var18 == 1) {
            class594.method3405(10L, 16711680);
        } else if (var18 == 2) {
            class594.method3405(5L, 16711680);
        } else if (var18 == 3) {
            class594.method3405(2L, 16711680);
        }
        if (arg0 != -29100) {
            field3924 = null;
        }
        if (class532.field7498) {
            class426.method2540(-105);
        }
        if (class118.field1503.field10634.method2096(0) == 1 && class289.field3493 == 3 && class131.field1615 != -1) {
            class118.field1503.method4295(class118.field1503.field10634, 0, false);
            class14.method194(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1893() {
        class599.field8115 = 0;
        for (int var0 = 0; var0 < class3.field42; var0++) {
            class388 var1 = ((class273) class30.field444.method2121(99, (long) class2.field29[var0])).field3210;
            if (var1.field3363 && var1.method1670(-125) != -1) {
                int var2 = (var1.method1665(1720746760) - 1) * 256 + 252;
                int var3 = var1.field823 - var2 >> 9;
                int var4 = var1.field813 - var2 >> 9;
                class287 var5 = class233.method1436(var1.field808, (byte) 127, var3, var4);
                if (var5 != null) {
                    int var6 = var5.field3393;
                    if (var5 instanceof class388) {
                        var6 += 2048;
                    }
                    if (var5.field3433 == 0 && var5.method1670(-115) != -1) {
                        class447.field6011[class599.field8115] = var6;
                        class734.field10264[class599.field8115] = var6;
                        class599.field8115++;
                        var5.field3433++;
                    }
                    class447.field6011[class599.field8115] = var6;
                    class734.field10264[class599.field8115] = var1.field3393 + 2048;
                    class599.field8115++;
                    var5.field3433++;
                }
            }
        }
        class192.method1256(0, class599.field8115 - 1, 114, class734.field10264, class447.field6011);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method1894(boolean arg0) {
        field3931++;
        if (class289.field3493 == 7 && !class46.method414(-22723)) {
            if (class359.field4466 > 1) {
                class43.field593 = class87.field1156;
                class359.field4466--;
            }
            if (!class672.field9218) {
                class331.method1970(91);
            }
            for (int var2 = 0; var2 < 100 && class300.method1750(-44); var2++) {
            }
        }
        class190.field2279++;
        class453.method2748(-1, -1, !arg0, null);
        class23.method246(-1, (byte) -55, -1, null);
        class256.method1532(0);
        class87.field1156++;
        if (arg0) {
            field3924 = null;
        }
        for (int var3 = 0; var3 < class370.field4599; var3++) {
            class388 var4 = class616.field8293[var3].field3210;
            if (var4 != null) {
                byte var5 = var4.field5003.field6695;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1665(1720746760);
                    if ((var5 & 0x2) != 0 && var4.field3458 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3453[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class596.field8090 - var6 - 1) {
                                var9 = class596.field8090 - var6 - 1;
                            }
                            int var10 = var4.field3455[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class107.field1350 - var6 - 1) {
                                var10 = class107.field1350 - var6 - 1;
                            }
                            int var11 = class482.method2863(var10, class633.field8649[var4.field808], 0, false, true, var4.field3455[0], var4.field3453[0], 0, -1, class716.field10030, var9, var6, var6, var6, class199.field2384);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3453[var12] = class199.field2384[var11 - var12 - 1];
                                    var4.field3455[var12] = class716.field10030[var11 - var12 - 1];
                                    var4.field3459[var12] = 1;
                                }
                                var4.field3458 = var11;
                            }
                        }
                    }
                    class634.method3578(-106, true, var4);
                    int var13 = class387.method2266(var4, false);
                    class488.method2897(var4, 16383);
                    class86.method793(true, var4, class683.field9353, var13, class413.field5396);
                    class535.method3184(0, class683.field9353, var4);
                    class141.method1023((byte) -99, var4);
                }
            }
        }
        if (!class46.method414(-22723) && class5.field53 == 0) {
            if (class7.field100 == 2) {
                class194.method1265(116);
            } else {
                class33.method311((byte) 114);
            }
            if ((class599.field8107 >> 9) < 14 || class599.field8107 >> 9 >= class596.field8090 - 14 || class350.field4366 >> 9 < 14 || class107.field1350 - 14 <= class350.field4366 >> 9) {
                class729.method4120(8);
            }
        }
        while (true) {
            class529 var14;
            class620 var15;
            class620 var16;
            do {
                var14 = (class529) class277.field3245.method2730(-31260);
                if (var14 == null) {
                    while (true) {
                        class529 var17;
                        class620 var18;
                        class620 var19;
                        do {
                            var17 = (class529) class597.field8095.method2730(-31260);
                            if (var17 == null) {
                                while (true) {
                                    class529 var20;
                                    class620 var21;
                                    class620 var22;
                                    do {
                                        var20 = (class529) class756.field10475.method2730(-31260);
                                        if (var20 == null) {
                                            if (class634.field8654 != null) {
                                                class751.method4198(78);
                                            }
                                            if ((class228.field2707 % 1500) == 0) {
                                                class669.method3754(false);
                                            }
                                            if (class289.field3493 == 7 && !class46.method414(-22723)) {
                                                class487.method2894((byte) 108);
                                            }
                                            class552.method3233((byte) -128);
                                            if (class485.field6770 && class86.field1153 < class349.method2069(true) - 60000L) {
                                                class786.method4352(!arg0);
                                            }
                                            for (class14 var23 = (class14) class195.field2314.method2447(-88); var23 != null; var23 = (class14) class195.field2314.method2439(-125)) {
                                                if (((long) var23.field228) < (class349.method2069(true) / 1000L - 5L)) {
                                                    if (var23.field230 > 0) {
                                                        class318.method1873("", var23.field226 + class637.field8694.method3584(class770.field10592, !arg0), (byte) 64, "", "", 5, 0);
                                                    }
                                                    if (var23.field230 == 0) {
                                                        class318.method1873("", var23.field226 + class637.field8695.method3584(class770.field10592, true), (byte) 33, "", "", 5, 0);
                                                    }
                                                    var23.method892(50560);
                                                }
                                            }
                                            if (class289.field3493 == 7 && !class46.method414(-22723)) {
                                                if (class436.field5748 == null) {
                                                    class268.method1590(12, false);
                                                    return;
                                                }
                                                class566.field7797++;
                                                if (class566.field7797 > 50) {
                                                    class14.field224++;
                                                    class336 var24 = class512.method3076(class447.field6016, class591.field8030, (byte) 117);
                                                    class578.method3334(4, var24);
                                                }
                                                try {
                                                    class671.method3765(8277);
                                                    return;
                                                } catch (IOException var25) {
                                                    class268.method1590(12, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field7473;
                                        if (var21.field8445 < 0) {
                                            break;
                                        }
                                        var22 = class479.method2848(var21.field8400, (byte) -103);
                                    } while (var22 == null || var22.field8343 == null || var22.field8343.length <= var21.field8445 || var22.field8343[var21.field8445] != var21);
                                    class142.method1045(var20);
                                }
                            }
                            var18 = var17.field7473;
                            if (var18.field8445 < 0) {
                                break;
                            }
                            var19 = class479.method2848(var18.field8400, (byte) 122);
                        } while (var19 == null || var19.field8343 == null || var18.field8445 >= var19.field8343.length || var19.field8343[var18.field8445] != var18);
                        class142.method1045(var17);
                    }
                }
                var15 = var14.field7473;
                if (var15.field8445 < 0) {
                    break;
                }
                var16 = class479.method2848(var15.field8400, (byte) 127);
            } while (var16 == null || var16.field8343 == null || var15.field8445 >= var16.field8343.length || var16.field8343[var15.field8445] != var15);
            class142.method1045(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3939++;
        if (!this.method2163(-1)) {
            return;
        }
        class436.field5746 = new class350();
        class436.field5746.field4365 = Integer.parseInt(this.getParameter("worldid"));
        class144.field1819 = new class350();
        class144.field1819.field4365 = Integer.parseInt(this.getParameter("lobbyid"));
        class144.field1819.field4362 = this.getParameter("lobbyaddress");
        class139.field1734 = new class350();
        class139.field1734.field4365 = Integer.parseInt(this.getParameter("demoid"));
        class139.field1734.field4362 = this.getParameter("demoaddress");
        class737.field10285 = class122.method951(-10524, Integer.parseInt(this.getParameter("modewhere")));
        if (class737.field10285 == class616.field8277) {
            class737.field10285 = class18.field342;
        } else if (!class612.method3465(class737.field10285, 1) && class737.field10285 != class446.field6003) {
            class737.field10285 = class446.field6003;
        }
        class190.field2282 = class707.method4013(Integer.parseInt(this.getParameter("modewhat")), 0);
        if (class576.field7867 != class190.field2282 && class358.field4434 != class190.field2282 && class588.field8006 != class190.field2282) {
            class190.field2282 = class588.field8006;
        }
        try {
            class770.field10592 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class770.field10592 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class135.field1699 = true;
        } else {
            class135.field1699 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class171.field2050 = true;
        } else {
            class171.field2050 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class716.field10027 = true;
        } else {
            class716.field10027 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class672.field9229 = class359.field4463;
            } else if (var4.equals("1")) {
                class672.field9229 = class421.field5604;
            } else if (var4.equals("2")) {
                class672.field9229 = class207.field2462;
            } else if (var4.equals("3")) {
                class672.field9229 = class607.field8171;
            }
        }
        try {
            class176.field2187 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class176.field2187 = 0;
        }
        class198.field2366 = this.getParameter("quiturl");
        class28.field429 = this.getParameter("settings");
        if (class28.field429 == null) {
            class28.field429 = "";
        }
        class650.field8959 = "1".equals(this.getParameter("under"));
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class117.field1495 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class117.field1495 = 0;
            }
        }
        class86.field1152 = Integer.parseInt(this.getParameter("colourid"));
        if (class86.field1152 < 0 || class86.field1152 >= class363.field4527.length) {
            class86.field1152 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class486.field6780 = true;
            class324.field4018 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class496.field6934 = true;
        }
        class31.field491 = this.getParameter("sskey");
        if (class31.field491 != null && class31.field491.length() < 2) {
            class31.field491 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class66.field909 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class444.field5951 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class171.field2051 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class372.field4688 = this.getParameter("additionalInfo");
        if (class372.field4688 != null && class372.field4688.length() > 50) {
            class372.field4688 = null;
        }
        if (class672.field9229 == class359.field4463) {
            class243.field2870 = 765;
            class412.field5381 = 503;
        } else if (class672.field9229 == class421.field5604) {
            class412.field5381 = 480;
            class243.field2870 = 640;
        }
        class90.field1195 = this;
        this.method2165(class243.field2870, class672.field9229.field5924, 37, class412.field5381, -119, class190.field2282.method4311(false) + 32, 648);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lkq;IIIIIIIIIII)V")
    public static final void method1895(class620[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        label824: for (int var12 = 0; var12 < arg0.length; var12++) {
            class620 var13 = arg0[var12];
            if (var13 != null && var13.field8400 == arg1) {
                int var14 = var13.field8383 + arg6;
                int var15 = var13.field8492 + arg7;
                int var16;
                int var17;
                int var18;
                int var19;
                if (var13.field8371 == 2) {
                    var16 = arg2;
                    var17 = arg3;
                    var18 = arg4;
                    var19 = arg5;
                } else {
                    int var20 = var13.field8506 + var14;
                    int var21 = var13.field8416 + var15;
                    if (var13.field8371 == 9) {
                        var20++;
                        var21++;
                    }
                    var16 = var14 > arg2 ? var14 : arg2;
                    var17 = var15 > arg3 ? var15 : arg3;
                    var18 = var20 < arg4 ? var20 : arg4;
                    var19 = var21 < arg5 ? var21 : arg5;
                }
                if (var13.field8371 == 0 || var13.field8422 || method1882(var13).field5126 != 0 || class395.field5122 == var13 || class223.field2607 == var13.field8351 || class599.field8111 == var13.field8351) {
                    if (!method1891(var13)) {
                        int var22 = 0;
                        int var23 = 0;
                        if (class769.field10572) {
                            var22 = class793.method4373((byte) 59);
                            var23 = class719.method4070((byte) 123);
                        }
                        if (class634.field8654 == var13 && class580.method3340(-24688, class634.field8654) != null) {
                            class301.field3605 = true;
                            class164.field2013 = var14;
                            class704.field9904 = var15;
                        }
                        if (var13.field8454 || var16 < var18 && var17 < var19) {
                            if (var13.field8503 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                for (class529 var24 = (class529) class756.field10475.method2725(37); var24 != null; var24 = (class529) class756.field10475.method2726(-120)) {
                                    if (var24.field7474) {
                                        var24.method2219(13630);
                                        var24.field7473.field8338 = false;
                                    }
                                }
                                if (class56.field763 == 0) {
                                    class634.field8654 = null;
                                    class395.field5122 = null;
                                }
                                class473.field6590 = 0;
                                class413.field5389 = false;
                                class277.field3247 = false;
                                if (!class672.field9218) {
                                    class331.method1970(123);
                                }
                            }
                            boolean var25;
                            if (class738.field10291.method109(121) + var22 >= var16 && class738.field10291.method117(true) + var23 >= var17 && class738.field10291.method109(122) + var22 < var18 && class738.field10291.method117(true) + var23 < var19) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            if (!class104.field1336 && var25) {
                                if (var13.field8370 >= 0) {
                                    class680.field9309 = var13.field8370;
                                } else if (var13.field8503) {
                                    class680.field9309 = -1;
                                }
                            }
                            if (!class672.field9218 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                                class78.method714(false, arg10 - var14, var13, arg11 - var15);
                            }
                            boolean var26 = false;
                            if (class738.field10291.method113((byte) -41) && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            class730 var28 = (class730) class155.field1929.method2725(37);
                            if (var28 != null && var28.method1941(65280) == 0 && var28.method1936(-564899352) + var22 >= var16 && var28.method1937(-38) + var23 >= var17 && var28.method1936(-564899352) + var22 < var18 && var28.method1937(81) + var23 < var19) {
                                var27 = true;
                            }
                            if (var13.field8403 != null && !class505.method3030((byte) 125)) {
                                for (int var29 = 0; var29 < var13.field8403.length; var29++) {
                                    if (class348.field4350.method216(-108, var13.field8403[var29])) {
                                        if (var13.field8385 == null || class228.field2707 >= var13.field8385[var29]) {
                                            byte var30 = var13.field8513[var29];
                                            if (var30 == 0 || ((var30 & 0x8) == 0 || !class348.field4350.method216(-76, 86) && !class348.field4350.method216(-113, 82) && !class348.field4350.method216(-63, 81)) && ((var30 & 0x2) == 0 || class348.field4350.method216(-102, 86)) && ((var30 & 0x1) == 0 || class348.field4350.method216(-30, 82)) && ((var30 & 0x4) == 0 || class348.field4350.method216(-106, 81))) {
                                                if (var29 < 10) {
                                                    class576.method3331(-8, -1, var13.field8515, "", var29 + 1);
                                                } else if (var29 == 10) {
                                                    class118.method926(-51);
                                                    class396 var31 = method1882(var13);
                                                    class541.method3204(1, var31.field5125, var31.method2321(-64), var13);
                                                    class535.field7539 = class215.method1343(var13, 0);
                                                    if (class535.field7539 == null) {
                                                        class535.field7539 = "Null";
                                                    }
                                                    class481.field6718 = var13.field8429 + "<col=ffffff>";
                                                }
                                                int var32 = var13.field8359[var29];
                                                if (var13.field8385 == null) {
                                                    var13.field8385 = new int[var13.field8403.length];
                                                }
                                                if (var32 == 0) {
                                                    var13.field8385[var29] = Integer.MAX_VALUE;
                                                } else {
                                                    var13.field8385[var29] = class228.field2707 + var32;
                                                }
                                            }
                                        }
                                    } else if (var13.field8385 != null) {
                                        var13.field8385[var29] = 0;
                                    }
                                }
                            }
                            if (var27) {
                                class367.method2141(true, var22 + var28.method1936(-564899352) - var14, var23 + var28.method1937(-109) - var15, var13);
                            }
                            if (class634.field8654 != null && class634.field8654 != var13 && var25 && method1882(var13).method2327(-123)) {
                                class438.field5760 = var13;
                            }
                            if (class395.field5122 == var13) {
                                class410.field5373 = true;
                                class90.field1206 = var14;
                                class585.field7977 = var15;
                            }
                            if (var13.field8422 || var13.field8351 != 0) {
                                if (var25 && class662.field9092 != 0 && var13.field8376 != null) {
                                    class529 var33 = new class529();
                                    var33.field7474 = true;
                                    var33.field7473 = var13;
                                    var33.field7469 = class662.field9092;
                                    var33.field7477 = var13.field8376;
                                    class756.field10475.method2732(var33, 21939);
                                }
                                if (class634.field8654 != null || class672.field9218 || class577.field7873 != var13.field8351 && class473.field6590 > 0) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (var13.field8351 != 0) {
                                    if (class776.field10717 == var13.field8351 || class146.field1831 == var13.field8351) {
                                        class81.field1103 = var13;
                                        if (class454.field6403 != null) {
                                            class454.field6403.method2876((byte) -111, class363.field4526, var13.field8416);
                                        }
                                        if (class776.field10717 == var13.field8351) {
                                            if (class672.field9218 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                                continue;
                                            }
                                            class134.method995(-19700, arg9, class363.field4526, arg8);
                                            class154 var34 = (class154) class216.field2545.method2447(-124);
                                            while (true) {
                                                if (var34 == null) {
                                                    continue label824;
                                                }
                                                if (arg10 >= var34.field1912 && arg10 < var34.field1915 && arg11 >= var34.field1917 && arg11 < var34.field1916) {
                                                    class331.method1970(115);
                                                    class92.method820(var34.field1918, -1);
                                                }
                                                var34 = (class154) class216.field2545.method2439(-114);
                                            }
                                        }
                                    }
                                    if (class223.field2607 == var13.field8351) {
                                        if (var13.method3531((byte) -108, class363.field4526) == null || class13.field218 != 0 && class13.field218 != 3 || class672.field9218 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                            continue;
                                        }
                                        int var35 = arg10 - var14;
                                        int var36 = arg11 - var15;
                                        int var37 = var13.field8379[var36];
                                        if (var35 < var37 || var35 > var13.field8470[var36] + var37) {
                                            continue;
                                        }
                                        int var38 = var35 - var13.field8506 / 2;
                                        int var39 = var36 - var13.field8416 / 2;
                                        int var40;
                                        if (class7.field100 == 4) {
                                            var40 = (int) class47.field626 & 0x3FFF;
                                        } else {
                                            var40 = (int) class47.field626 + class579.field7884 & 0x3FFF;
                                        }
                                        int var41 = class789.field10868[var40];
                                        int var42 = class789.field10864[var40];
                                        if (class7.field100 != 4) {
                                            var41 = (class251.field2948 + 256) * var41 >> 8;
                                            var42 = (class251.field2948 + 256) * var42 >> 8;
                                        }
                                        int var43 = var38 * var42 + var39 * var41 >> 14;
                                        int var44 = var39 * var42 - var38 * var41 >> 14;
                                        int var45;
                                        int var46;
                                        if (class7.field100 == 4) {
                                            var45 = (class467.field6528 >> 9) + (var43 >> 2);
                                            var46 = (class93.field1229 >> 9) - (var44 >> 2);
                                        } else {
                                            int var47 = (class300.field3596.method1665(1720746760) - 1) * 256;
                                            var45 = (class300.field3596.field823 - var47 >> 9) + (var43 >> 2);
                                            var46 = (class300.field3596.field813 - var47 >> 9) - (var44 >> 2);
                                        }
                                        if (class104.field1336 && (class667.field9161 & 0x40) != 0) {
                                            class620 var48 = class481.method2859(class351.field4370, class215.field2531, 16383);
                                            if (var48 == null) {
                                                class118.method926(-39);
                                            } else {
                                                class620.method3534((long) (var13.field8445 << 0 | var13.field8515), var13.field8438, true, " ->", class748.field10390, 1L, false, 110, var46, 8, var45, class535.field7539, true);
                                            }
                                            continue;
                                        }
                                        if (class672.field9229 == class421.field5604) {
                                            class620.method3534(0L, -1, true, "", -1, 1L, false, 125, var46, 4, var45, class637.field8702.method3584(class770.field10592, true), true);
                                        }
                                        class620.method3534(0L, -1, true, "", class302.field3610, 1L, false, 122, var46, 60, var45, class576.field7869, true);
                                        continue;
                                    }
                                    if (class577.field7873 == var13.field8351) {
                                        class358.field4443 = var13;
                                        if (var25) {
                                            class413.field5389 = true;
                                        }
                                        if (var27) {
                                            int var49 = (int) ((double) (var22 + var28.method1936(-564899352) - var14 - var13.field8506 / 2) * 2.0D / (double) class9.field154);
                                            int var50 = (int) (-((double) (var23 + var28.method1937(-46) - var15 - var13.field8416 / 2) * 2.0D / (double) class9.field154));
                                            int var51 = class580.field7912 + var49 + class9.field176;
                                            int var52 = class62.field850 + var50 + class9.field178;
                                            class257 var53 = class473.method2823(58);
                                            if (var53 == null) {
                                                continue;
                                            }
                                            int[] var54 = new int[3];
                                            var53.method1546(true, var52, var51, var54);
                                            if (var54 != null) {
                                                if (class348.field4350.method216(-117, 82) && class637.field8741 > 0) {
                                                    class247.method1487(var54[1], var54[2], -78, var54[0]);
                                                    continue;
                                                }
                                                class277.field3247 = true;
                                                class200.field2405 = var54[0];
                                                class372.field4678 = var54[1];
                                                class714.field10024 = var54[2];
                                            }
                                            class473.field6590 = 1;
                                            class417.field5444 = false;
                                            class140.field1756 = class738.field10291.method109(126);
                                            class209.field2481 = class738.field10291.method117(true);
                                            continue;
                                        }
                                        if (var26 && class473.field6590 > 0) {
                                            if (class473.field6590 == 1 && (class140.field1756 != class738.field10291.method109(126) || class209.field2481 != class738.field10291.method117(true))) {
                                                class48.field684 = class580.field7912;
                                                class673.field9234 = class62.field850;
                                                class473.field6590 = 2;
                                            }
                                            if (class473.field6590 == 2) {
                                                class417.field5444 = true;
                                                class733.method4142(class48.field684 + (int) ((double) (class140.field1756 - class738.field10291.method109(122)) * 2.0D / (double) class9.field149), -1);
                                                class552.method3234(class673.field9234 - (int) ((double) (class209.field2481 - class738.field10291.method117(true)) * 2.0D / (double) class9.field149), -29711);
                                            }
                                            continue;
                                        }
                                        if (class473.field6590 > 0 && !class417.field5444) {
                                            if ((class25.field373 == 1 || class20.method232(false)) && class245.field2894 > 2) {
                                                class583.method3359(class209.field2481, false, class140.field1756);
                                            } else if (class124.method964((byte) 103)) {
                                                class583.method3359(class209.field2481, false, class140.field1756);
                                            }
                                        }
                                        class473.field6590 = 0;
                                        continue;
                                    }
                                    if (class529.field7480 == var13.field8351) {
                                        if (var26) {
                                            class434.method2568(var13.field8416, false, var13.field8506, var23 + class738.field10291.method117(true) - var15, var22 + class738.field10291.method109(124) - var14);
                                        }
                                        continue;
                                    }
                                    if (class599.field8111 == var13.field8351) {
                                        class23.method246(var15, (byte) 3, var14, var13);
                                        continue;
                                    }
                                }
                                if (!var13.field8396 && var27) {
                                    var13.field8396 = true;
                                    if (var13.field8449 != null) {
                                        class529 var55 = new class529();
                                        var55.field7474 = true;
                                        var55.field7473 = var13;
                                        var55.field7475 = var22 + var28.method1936(-564899352) - var14;
                                        var55.field7469 = var23 + var28.method1937(-127) - var15;
                                        var55.field7477 = var13.field8449;
                                        class756.field10475.method2732(var55, 21939);
                                    }
                                }
                                if (var13.field8396 && var26 && var13.field8395 != null) {
                                    class529 var56 = new class529();
                                    var56.field7474 = true;
                                    var56.field7473 = var13;
                                    var56.field7475 = var22 + class738.field10291.method109(126) - var14;
                                    var56.field7469 = var23 + class738.field10291.method117(true) - var15;
                                    var56.field7477 = var13.field8395;
                                    class756.field10475.method2732(var56, 21939);
                                }
                                if (var13.field8396 && !var26) {
                                    var13.field8396 = false;
                                    if (var13.field8489 != null) {
                                        class529 var57 = new class529();
                                        var57.field7474 = true;
                                        var57.field7473 = var13;
                                        var57.field7475 = var22 + class738.field10291.method109(126) - var14;
                                        var57.field7469 = var23 + class738.field10291.method117(true) - var15;
                                        var57.field7477 = var13.field8489;
                                        class597.field8095.method2732(var57, 21939);
                                    }
                                }
                                if (var26 && var13.field8405 != null) {
                                    class529 var58 = new class529();
                                    var58.field7474 = true;
                                    var58.field7473 = var13;
                                    var58.field7475 = var22 + class738.field10291.method109(122) - var14;
                                    var58.field7469 = var23 + class738.field10291.method117(true) - var15;
                                    var58.field7477 = var13.field8405;
                                    class756.field10475.method2732(var58, 21939);
                                }
                                if (!var13.field8338 && var25) {
                                    var13.field8338 = true;
                                    if (var13.field8411 != null) {
                                        class529 var59 = new class529();
                                        var59.field7474 = true;
                                        var59.field7473 = var13;
                                        var59.field7475 = var22 + class738.field10291.method109(123) - var14;
                                        var59.field7469 = var23 + class738.field10291.method117(true) - var15;
                                        var59.field7477 = var13.field8411;
                                        class756.field10475.method2732(var59, 21939);
                                    }
                                }
                                if (var13.field8338 && var25 && var13.field8433 != null) {
                                    class529 var60 = new class529();
                                    var60.field7474 = true;
                                    var60.field7473 = var13;
                                    var60.field7475 = var22 + class738.field10291.method109(126) - var14;
                                    var60.field7469 = var23 + class738.field10291.method117(true) - var15;
                                    var60.field7477 = var13.field8433;
                                    class756.field10475.method2732(var60, 21939);
                                }
                                if (var13.field8338 && !var25) {
                                    var13.field8338 = false;
                                    if (var13.field8412 != null) {
                                        class529 var61 = new class529();
                                        var61.field7474 = true;
                                        var61.field7473 = var13;
                                        var61.field7475 = var22 + class738.field10291.method109(127) - var14;
                                        var61.field7469 = var23 + class738.field10291.method117(true) - var15;
                                        var61.field7477 = var13.field8412;
                                        class597.field8095.method2732(var61, 21939);
                                    }
                                }
                                if (var13.field8473 != null) {
                                    class529 var62 = new class529();
                                    var62.field7473 = var13;
                                    var62.field7477 = var13.field8473;
                                    class277.field3245.method2732(var62, 21939);
                                }
                                if (var13.field8372 != null && class249.field2928 > var13.field8514) {
                                    if (var13.field8497 == null || class249.field2928 - var13.field8514 > 32) {
                                        class529 var67 = new class529();
                                        var67.field7473 = var13;
                                        var67.field7477 = var13.field8372;
                                        class756.field10475.method2732(var67, 21939);
                                    } else {
                                        label711: for (int var63 = var13.field8514; var63 < class249.field2928; var63++) {
                                            int var64 = class270.field3186[var63 & 0x1F];
                                            for (int var65 = 0; var65 < var13.field8497.length; var65++) {
                                                if (var13.field8497[var65] == var64) {
                                                    class529 var66 = new class529();
                                                    var66.field7473 = var13;
                                                    var66.field7477 = var13.field8372;
                                                    class756.field10475.method2732(var66, 21939);
                                                    break label711;
                                                }
                                            }
                                        }
                                    }
                                    var13.field8514 = class249.field2928;
                                }
                                if (var13.field8341 != null && class54.field730 > var13.field8380) {
                                    if (var13.field8420 == null || class54.field730 - var13.field8380 > 32) {
                                        class529 var72 = new class529();
                                        var72.field7473 = var13;
                                        var72.field7477 = var13.field8341;
                                        class756.field10475.method2732(var72, 21939);
                                    } else {
                                        label687: for (int var68 = var13.field8380; var68 < class54.field730; var68++) {
                                            int var69 = class301.field3604[var68 & 0x1F];
                                            for (int var70 = 0; var70 < var13.field8420.length; var70++) {
                                                if (var13.field8420[var70] == var69) {
                                                    class529 var71 = new class529();
                                                    var71.field7473 = var13;
                                                    var71.field7477 = var13.field8341;
                                                    class756.field10475.method2732(var71, 21939);
                                                    break label687;
                                                }
                                            }
                                        }
                                    }
                                    var13.field8380 = class54.field730;
                                }
                                if (var13.field8479 != null && class230.field2736 > var13.field8394) {
                                    if (var13.field8481 == null || class230.field2736 - var13.field8394 > 32) {
                                        class529 var77 = new class529();
                                        var77.field7473 = var13;
                                        var77.field7477 = var13.field8479;
                                        class756.field10475.method2732(var77, 21939);
                                    } else {
                                        label663: for (int var73 = var13.field8394; var73 < class230.field2736; var73++) {
                                            int var74 = class384.field4907[var73 & 0x1F];
                                            for (int var75 = 0; var75 < var13.field8481.length; var75++) {
                                                if (var13.field8481[var75] == var74) {
                                                    class529 var76 = new class529();
                                                    var76.field7473 = var13;
                                                    var76.field7477 = var13.field8479;
                                                    class756.field10475.method2732(var76, 21939);
                                                    break label663;
                                                }
                                            }
                                        }
                                    }
                                    var13.field8394 = class230.field2736;
                                }
                                if (var13.field8342 != null && class382.field4890 > var13.field8414) {
                                    if (var13.field8425 == null || class382.field4890 - var13.field8414 > 32) {
                                        class529 var82 = new class529();
                                        var82.field7473 = var13;
                                        var82.field7477 = var13.field8342;
                                        class756.field10475.method2732(var82, 21939);
                                    } else {
                                        label639: for (int var78 = var13.field8414; var78 < class382.field4890; var78++) {
                                            int var79 = class151.field1890[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var13.field8425.length; var80++) {
                                                if (var13.field8425[var80] == var79) {
                                                    class529 var81 = new class529();
                                                    var81.field7473 = var13;
                                                    var81.field7477 = var13.field8342;
                                                    class756.field10475.method2732(var81, 21939);
                                                    break label639;
                                                }
                                            }
                                        }
                                    }
                                    var13.field8414 = class382.field4890;
                                }
                                if (var13.field8417 != null && class136.field1702 > var13.field8415) {
                                    if (var13.field8373 == null || class136.field1702 - var13.field8415 > 32) {
                                        class529 var87 = new class529();
                                        var87.field7473 = var13;
                                        var87.field7477 = var13.field8417;
                                        class756.field10475.method2732(var87, 21939);
                                    } else {
                                        label615: for (int var83 = var13.field8415; var83 < class136.field1702; var83++) {
                                            int var84 = class223.field2591[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var13.field8373.length; var85++) {
                                                if (var13.field8373[var85] == var84) {
                                                    class529 var86 = new class529();
                                                    var86.field7473 = var13;
                                                    var86.field7477 = var13.field8417;
                                                    class756.field10475.method2732(var86, 21939);
                                                    break label615;
                                                }
                                            }
                                        }
                                    }
                                    var13.field8415 = class136.field1702;
                                }
                                if (class697.field9491 > var13.field8365 && var13.field8485 != null) {
                                    class529 var88 = new class529();
                                    var88.field7473 = var13;
                                    var88.field7477 = var13.field8485;
                                    class756.field10475.method2732(var88, 21939);
                                }
                                if (class462.field6489 > var13.field8365 && var13.field8418 != null) {
                                    class529 var89 = new class529();
                                    var89.field7473 = var13;
                                    var89.field7477 = var13.field8418;
                                    class756.field10475.method2732(var89, 21939);
                                }
                                if (class413.field5394 > var13.field8365 && var13.field8437 != null) {
                                    class529 var90 = new class529();
                                    var90.field7473 = var13;
                                    var90.field7477 = var13.field8437;
                                    class756.field10475.method2732(var90, 21939);
                                }
                                if (class479.field6645 > var13.field8365 && var13.field8431 != null) {
                                    class529 var91 = new class529();
                                    var91.field7473 = var13;
                                    var91.field7477 = var13.field8431;
                                    class756.field10475.method2732(var91, 21939);
                                }
                                if (class293.field3513 > var13.field8365 && var13.field8504 != null) {
                                    class529 var92 = new class529();
                                    var92.field7473 = var13;
                                    var92.field7477 = var13.field8504;
                                    class756.field10475.method2732(var92, 21939);
                                }
                                if (class331.field4098 > var13.field8365 && var13.field8424 != null) {
                                    class529 var93 = new class529();
                                    var93.field7473 = var13;
                                    var93.field7477 = var13.field8424;
                                    class756.field10475.method2732(var93, 21939);
                                }
                                if (class43.field593 > var13.field8365 && var13.field8444 != null) {
                                    class529 var94 = new class529();
                                    var94.field7473 = var13;
                                    var94.field7477 = var13.field8444;
                                    class756.field10475.method2732(var94, 21939);
                                }
                                var13.field8365 = class87.field1156;
                                if (var13.field8486 != null) {
                                    for (int var95 = 0; var95 < class437.field5757; var95++) {
                                        class529 var96 = new class529();
                                        var96.field7473 = var13;
                                        var96.field7471 = class542.field7608[var95].method1451(-88);
                                        var96.field7478 = class542.field7608[var95].method1453(1714);
                                        var96.field7477 = var13.field8486;
                                        class756.field10475.method2732(var96, 21939);
                                    }
                                }
                                if (class62.field841 && var13.field8390 != null) {
                                    class529 var97 = new class529();
                                    var97.field7473 = var13;
                                    var97.field7477 = var13.field8390;
                                    class756.field10475.method2732(var97, 21939);
                                }
                            }
                            if (var13.field8371 == 5 && var13.field8428 != -1) {
                                var13.method3533(class153.field1907, class305.field3675, -116).method2876((byte) -107, class363.field4526, var13.field8416);
                            }
                            class462.method2787(11, var13);
                            if (var13.field8371 == 0) {
                                method1895(arg0, var13.field8515, var16, var17, var18, var19, var14 - var13.field8496, var15 - var13.field8392, arg8, arg9, arg10, arg11);
                                if (var13.field8343 != null) {
                                    method1895(var13.field8343, var13.field8515, var16, var17, var18, var19, var14 - var13.field8496, var15 - var13.field8392, arg8, arg9, arg10, arg11);
                                }
                                class52 var98 = (class52) class728.field10205.method2121(68, (long) var13.field8515);
                                if (var98 != null) {
                                    if (class672.field9229 == class359.field4463 && var98.field711 == 0 && !class672.field9218 && var25 && !class687.field9373) {
                                        class331.method1970(98);
                                    }
                                    class55.method484(arg8, (byte) -65, var15, arg10, var14, var19, var16, arg11, var17, var98.field713, var18, arg9);
                                }
                            }
                        }
                    }
                } else if (var16 < var18 && var17 < var19) {
                    class462.method2787(11, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1896(int arg0) {
        field3927++;
        if (class485.field6770) {
            class786.method4352(true);
        }
        class30.method277(arg0 + 24159);
        if (class363.field4526 != null) {
            class363.field4526.method559((byte) 1);
        }
        if (class260.field3075 != null) {
            class328.method1947(class521.field7389, arg0 ^ 0xFFFFFF9A, class260.field3075);
            class260.field3075 = null;
        }
        if (class436.field5748 != null) {
            class436.field5748.method768(0);
            class436.field5748 = null;
        }
        class713.method4037((byte) -114);
        class182.field2224.method4257(-1);
        class531.field7485.method3865(arg0 ^ 0x42);
        if (class456.field6432 != null) {
            class456.field6432.method3018(0);
            class456.field6432 = null;
        }
        try {
            if (arg0 != -38) {
                field3934 = 91;
            }
            class370.field4631.method2767(true);
            for (int var2 = 0; var2 < 37; var2++) {
                class187.field2266[var2].method2767(true);
            }
            class199.field2377.method2767(true);
            class765.field10540.method2767(true);
            class233.method1435(4);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final synchronized void method1897(int arg0) {
        field3926++;
        if (class345.field4331 != null && class109.field1370 == null && !class521.field7389.field9260) {
            try {
                Class var2 = class345.field4331.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class109.field1370 = (Canvas) var3.get(class345.field4331);
                var3.set(class345.field4331, null);
                if (class109.field1370 != null) {
                    return;
                }
            } catch (Exception var5) {
            }
        }
        int var4 = 8 / ((13 - arg0) / 62);
        super.method1897(123);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1898(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
