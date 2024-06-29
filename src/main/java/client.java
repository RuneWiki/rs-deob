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
public class client extends class245 {

    @OriginalMember(owner = "client!client", name = "G", descriptor = "Loh;")
    public static class370 field3715 = new class370(8, 1);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "J")
    public static long field3731;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field3733;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field3734;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method1673(boolean arg0) {
        field3729++;
        boolean var2 = class654.field9099.method721(-108);
        if (!var2) {
            this.method1686(110);
        }
        if (arg0) {
            field3731 = 117L;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1674() {
        for (int var0 = 0; var0 < class401.field5620; var0++) {
            int[] var1 = class183.field2646[var0];
            for (int var2 = 0; var2 < class257.field3508; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method1528(int arg0) {
        field3724++;
        if (class241.field3300) {
            class651.field9037 = 64;
        }
        if (arg0 < 67) {
            return;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class124.method883(1);
        class41.field477 = new class272(class543.field7374);
        class654.field9099 = new class100();
        class113.method817(new int[] { 20, 260 }, new int[] { 1000, 100 }, 0);
        if (class603.field8404 != class164.field2358) {
            class550.field7434 = new byte[50][];
        }
        class366.field4875 = new class64(class543.field7374);
        if (class603.field8404 == class164.field2358) {
            class138.field1954.field2472 = this.getCodeBase().getHost();
        } else if (class158.method1118(class603.field8404, 34023)) {
            class138.field1954.field2472 = this.getCodeBase().getHost();
            class138.field1954.field2464 = class138.field1954.field2475 + 40000;
            class297.field4066.field2464 = class297.field4066.field2475 + 40000;
            class138.field1954.field2479 = class138.field1954.field2475 + 50000;
            class100.field1401.field2464 = class100.field1401.field2475 + 40000;
            class297.field4066.field2479 = class297.field4066.field2475 + 50000;
            class100.field1401.field2479 = class100.field1401.field2475 + 50000;
        } else if (class603.field8404 == class547.field7412) {
            class138.field1954.field2472 = "127.0.0.1";
            class297.field4066.field2472 = "127.0.0.1";
            class100.field1401.field2472 = "127.0.0.1";
            class138.field1954.field2464 = class138.field1954.field2475 + 40000;
            class297.field4066.field2464 = class297.field4066.field2475 + 40000;
            class100.field1401.field2464 = class100.field1401.field2475 + 40000;
            class138.field1954.field2479 = class138.field1954.field2475 + 50000;
            class297.field4066.field2479 = class297.field4066.field2475 + 50000;
            class100.field1401.field2479 = class100.field1401.field2475 + 50000;
        }
        if (class704.field9959 == class219.field3065) {
            class367.field4945 = true;
            class335.field4509 = class20.field236;
            class657.field9136 = 16777215;
            class611.field8470 = class307.field4236;
            class45.field544 = 0;
        } else {
            class611.field8470 = class207.field2911;
            class335.field4509 = class88.field1275;
        }
        class651.field9040 = class138.field1954;
        if (class454.field6305 == class219.field3065) {
            class666.field9333 = false;
        }
        class43.field517 = class96.field1344 = class270.field3696 = class103.field1451 = new short[256];
        try {
            class65.field852 = class647.field8937.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class353.field4698 = class11.method51((byte) 31, class611.field8473);
        class214.field2991 = class465.method2625((byte) -95, true, class611.field8473);
        try {
            if (class543.field7374.field1473 != null) {
                class485.field6668 = new class208(class543.field7374.field1473, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class691.field9860[var3] = new class208(class543.field7374.field1461[var3], 6000, 0);
                }
                class345.field4630 = new class208(class543.field7374.field1465, 6000, 0);
                class656.field9123 = new class589(255, class485.field6668, class345.field4630, 500000);
                class523.field7100 = new class208(class543.field7374.field1463, 24, 0);
                class543.field7374.field1463 = null;
                class543.field7374.field1473 = null;
                class543.field7374.field1465 = null;
                class543.field7374.field1461 = null;
            }
        } catch (IOException var5) {
            class485.field6668 = null;
            class523.field7100 = null;
            class345.field4630 = null;
            class656.field9123 = null;
        }
        if (class603.field8404 != class164.field2358) {
            class109.field1514 = true;
        }
        if (class454.field6305 == class219.field3065) {
            class84.field1245 = class65.field787.method555(class697.field9900, true);
        } else if (class704.field9959 == class219.field3065) {
            class84.field1245 = class65.field788.method555(class697.field9900, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1516(byte arg0) {
        field3722++;
        if (class503.field6917 == 2) {
            try {
                this.method1688(104);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class413.method2400(var5.getMessage() + " (Recovered) " + this.method1522(-79), var5, (byte) -90);
                class203.method1327((byte) 63, 0);
            }
        } else {
            this.method1688(108);
        }
        if (arg0 >= -91) {
            method1676();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1517(int arg0) {
        if (class9.field90) {
            class235.method1477(-28971);
        }
        field3725++;
        class585.method3331((byte) -15);
        if (class334.field4506 != null) {
            class334.field4506.method1168(80);
        }
        if (class54.field613 != null) {
            class242.method1503(class54.field613, class543.field7374, (byte) -102);
            class54.field613 = null;
        }
        if (class589.field8272 != null) {
            class589.field8272.method1935(0);
            class589.field8272 = null;
        }
        class318.method1920(arg0 + 29370);
        class654.field9099.method724(true);
        class41.field477.method1667((byte) 106);
        if (class531.field7185 != null) {
            class531.field7185.method2898(-201);
            class531.field7185 = null;
        }
        try {
            class485.field6668.method1353((byte) 100);
            for (int var2 = arg0; var2 < 35; var2++) {
                class691.field9860[var2].method1353((byte) 113);
            }
            class345.field4630.method1353((byte) 106);
            class523.field7100.method1353((byte) 122);
            class313.method1897((byte) 31);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public static void method1675(int arg0) {
        field3715 = null;
        if (arg0 > -97) {
            field3715 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1676() {
        int var0 = class528.field7160;
        int[] var1 = class439.field6091;
        boolean var2 = class366.field4875.field9360 == 1 && var0 > 200 || class366.field4875.field9360 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class677 var13 = class671.field9407[var1[var3]];
            if (!var13.method3848(false)) {
                var13.field1787 = -1;
            } else if (var13.field9697) {
                var13.field1787 = -1;
            } else {
                var13.method893((byte) -128);
                if (var13.field2972 >= 0 && var13.field2963 >= 0 && var13.field2973 < class401.field5620 && var13.field2969 < class257.field3508) {
                    var13.field9708 = var13.field1703 ? var2 : false;
                    if (class143.field2063 == var13) {
                        var13.field1787 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field1764) {
                            var14++;
                        }
                        if (var13.field1712 > class186.field2697) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method881(-117) << 2);
                        if (var13.field9660) {
                            var15 += 512;
                        } else {
                            if (class100.field1389 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field1787 = var15 + 1;
                    }
                } else {
                    var13.field1787 = -1;
                }
            }
        }
        for (int var4 = 0; var4 < class698.field9912; var4++) {
            class61 var10 = ((class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var4])).field5552;
            if (var10.method508(false) && var10.field674.method3254(class578.field8156, (byte) -121)) {
                var10.method893((byte) -123);
                if (var10.field2972 >= 0 && var10.field2963 >= 0 && var10.field2973 < class401.field5620 && var10.field2969 < class257.field3508) {
                    int var11 = 0;
                    if (!var10.field1764) {
                        var11++;
                    }
                    if (var10.field1712 > class186.field2697) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method881(-128) << 2);
                    if (class100.field1389 == 0) {
                        if (var10.field674.field8047) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class100.field1389 == 1) {
                        if (var10.field674.field8047) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field674.field8066) {
                        var12 += 1024;
                    } else if (!var10.field674.field8061) {
                        var12 += 256;
                    }
                    var10.field1787 = var12 + 1;
                } else {
                    var10.field1787 = -1;
                }
            } else {
                var10.field1787 = -1;
            }
        }
        for (int var5 = 0; var5 < class309.field4278.length; var5++) {
            class372 var6 = class309.field4278[var5];
            if (var6 != null) {
                if (var6.field5001 == 1) {
                    class393 var7 = (class393) class299.field4071.method970((byte) 89, (long) var6.field5009);
                    if (var7 != null) {
                        class61 var8 = var7.field5552;
                        if (var8.field1787 >= 0) {
                            var8.field1787 += 2048;
                        }
                    }
                } else if (var6.field5001 == 10) {
                    class677 var9 = class671.field9407[var6.field5009];
                    if (var9 != null && class143.field2063 != var9 && var9.field1787 >= 0) {
                        var9.field1787 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        int var1 = class528.field7160;
        int[] var2 = class439.field6091;
        int var3 = class362.field4773 ? var1 : class698.field9912 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class124 var5;
            if (var4 < var1) {
                var5 = class671.field9407[var2[var4]];
            } else {
                var5 = ((class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var4 - var1])).field5552;
            }
            if (var5.field4053 == arg0) {
                var5.field1696 = 0;
                if (var5.field1787 < 0) {
                    var5.field1764 = false;
                } else {
                    int var6 = var5.method881(-116);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4042 & 0x1FF) != 0 || (var5.field4047 & 0x1FF) != 0) {
                            var5.field1764 = false;
                            continue;
                        }
                    } else if ((var5.field4042 & 0x1FF) != 256 || (var5.field4047 & 0x1FF) != 256) {
                        var5.field1764 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4042 >> 9;
                        int var8 = var5.field4047 >> 9;
                        if (class183.field2646[var7][var8] != var5.field1787) {
                            var5.field1764 = true;
                            continue;
                        }
                        if (class435.field6048[var7][var8] > 1) {
                            var10002 = class435.field6048[var7][var8]--;
                            var5.field1764 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field4042 - var9 >> 9;
                        int var11 = var5.field4047 - var9 >> 9;
                        int var12 = var5.field4042 + var9 >> 9;
                        int var13 = var5.field4047 + var9 >> 9;
                        if (!class310.method1876(var11, var13, var10, var5.field1787, -2, var12)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class183.field2646[var14][var15] == var5.field1787) {
                                        var10002 = class435.field6048[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1764 = true;
                            continue;
                        }
                    }
                    var5.field1764 = false;
                    var5.field4052 = class249.method1533(var5.field4053, var5.field4047, var5.field4042, -125);
                    class190.method1291(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3717++;
        try {
            if (arg0.length != 6) {
                class556.method3118("Argument count", 0);
            }
            class138.field1954 = new class171();
            class138.field1954.field2475 = Integer.parseInt(arg0[0]);
            class297.field4066 = new class171();
            class297.field4066.field2475 = Integer.parseInt(arg0[1]);
            class100.field1401 = new class171();
            class100.field1401.field2475 = Integer.parseInt(arg0[2]);
            class603.field8404 = class547.field7412;
            if (arg0[3].equals("live")) {
                class56.field634 = class373.field5024;
            } else if (arg0[3].equals("rc")) {
                class56.field634 = class457.field6348;
            } else if (arg0[3].equals("wip")) {
                class56.field634 = class492.field6730;
            } else {
                class556.method3118("modewhat", 0);
            }
            class697.field9900 = class260.method1592(112, arg0[4]);
            if (class697.field9900 == -1) {
                if (arg0[4].equals("english")) {
                    class697.field9900 = 0;
                } else if (arg0[4].equals("german")) {
                    class697.field9900 = 1;
                } else {
                    class556.method3118("language", 0);
                }
            }
            class652.field9067 = false;
            class123.field1686 = false;
            if (arg0[5].equals("game0")) {
                class219.field3065 = class454.field6305;
            } else if (arg0[5].equals("game1")) {
                class219.field3065 = class704.field9959;
            } else {
                class556.method3118("game", 0);
            }
            class254.field3462 = 0;
            class178.field2583 = true;
            class656.field9121 = true;
            class241.field3300 = false;
            class389.field5491 = 0;
            class650.field9030 = null;
            class652.field9070 = false;
            class52.field607 = class219.field3065.field5857;
            class316.field4350 = null;
            class603.field8399 = 0;
            class365.field4859 = 0L;
            class400.field5614 = "";
            client var1 = new client();
            class647.field8937 = var1;
            var1.method1523(768, class56.field634.method1326(-1) + 32, 1024, class219.field3065.field5862, 626, (byte) -93, 35, false);
            class130.field1868.setLocation(40, 40);
        } catch (Exception var3) {
            class413.method2400(null, var3, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method1526(int arg0) {
        if (arg0 < 125) {
            field3731 = -39L;
        }
        field3718++;
        if (class503.field6917 != 2) {
            this.method1682(false);
            return;
        }
        try {
            this.method1682(false);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class413.method2400(var5.getMessage() + " (Recovered) " + this.method1522(-114), var5, (byte) -85);
            class203.method1327((byte) 63, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lin;)Lin;")
    public static final class78 method1678(class78 arg0) {
        int var1 = method1679(arg0).method1842(6416);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class582.method3319((byte) -102, arg0.field1178);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lin;)Lbb;")
    public static final class303 method1679(class78 arg0) {
        class303 var1 = (class303) class322.field4400.method970((byte) 89, ((long) arg0.field1129 << 32) + (long) arg0.field1034);
        return var1 == null ? arg0.field1090 : var1;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method1680(int arg0) {
        field3721++;
        if (class285.field3921 == 7 && class521.field7090 == 0) {
            if (class37.field444 > 1) {
                class37.field444--;
                class700.field9934 = class436.field6066;
            }
            if (!class541.field7327) {
                class6.method18((byte) 38);
            }
            for (int var2 = 0; var2 < 100 && class436.method2494(111); var2++) {
            }
        }
        class41.field479++;
        class323.method1936(null, -1, -127, -1);
        class419.method2431(-1, 92, null, -1);
        if (arg0 != -16610) {
            method1677(-74);
        }
        class452.method2569(0);
        class436.field6066++;
        for (int var3 = 0; var3 < class254.field3465; var3++) {
            class61 var4 = class31.field400[var3].field5552;
            if (var4 != null) {
                byte var5 = var4.field674.field8020;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method881(-118);
                    if ((var5 & 0x2) != 0 && var4.field1797 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1807[0] + var7;
                            int var10 = var4.field1801[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if ((class401.field5620 - var6 - 1) < var9) {
                                var9 = class401.field5620 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class257.field3508 - var6 - 1) < var10) {
                                var10 = class257.field3508 - var6 - 1;
                            }
                            int var11 = class29.method285(var6, -1, var4.field1801[0], class65.field856, var6, var4.field1807[0], 0, 0, class151.field2218[var4.field4053], var10, -6863, true, class125.field1815, var6, var9);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1807[var12] = class125.field1815[var11 - var12 - 1];
                                    var4.field1801[var12] = class65.field856[var11 - var12 - 1];
                                    var4.field1803[var12] = 1;
                                }
                                var4.field1797 = var11;
                            }
                        }
                    }
                    class647.method3619(var4, (byte) 67, true);
                    int var13 = class437.method2499(111, var4);
                    class332.method1963(var4, arg0 ^ 0x40E1);
                    class455.method2593(class549.field7423, var4, class477.field6580, var13, 0);
                    class487.method2765((byte) -61, class477.field6580, var4);
                    class254.method1569(var4, true);
                }
            }
        }
        if (class521.field7090 == 0 && class263.field3571 == 0) {
            if (class203.field2863 == 2) {
                class302.method1840(-121);
            } else {
                class287.method1766(0);
            }
            if (class666.field9335 >> 9 < 14 || class666.field9335 >> 9 >= class401.field5620 - 14 || (class11.field114 >> 9) < 14 || (class11.field114 >> 9) >= (class257.field3508 - 14)) {
                class503.method2886(-128);
            }
        }
        while (true) {
            class368 var14;
            class78 var15;
            class78 var16;
            do {
                var14 = (class368) class95.field1335.method1442(-10011);
                if (var14 == null) {
                    while (true) {
                        class368 var17;
                        class78 var18;
                        class78 var19;
                        do {
                            var17 = (class368) class68.field920.method1442(-10011);
                            if (var17 == null) {
                                while (true) {
                                    class368 var20;
                                    class78 var21;
                                    class78 var22;
                                    do {
                                        var20 = (class368) class69.field940.method1442(-10011);
                                        if (var20 == null) {
                                            if (class396.field5579 != null) {
                                                class159.method1125(false);
                                            }
                                            if ((class186.field2697 % 1500) == 0) {
                                                class406.method2365(25919);
                                            }
                                            if (class285.field3921 == 7 && class521.field7090 == 0) {
                                                class578.method3299(false);
                                            }
                                            class433.method2486(true);
                                            if (class9.field90 && class282.field3848 < (class577.method3295((byte) 15) - 60000L)) {
                                                class235.method1477(-28971);
                                            }
                                            for (class559 var23 = (class559) class562.field7588.method3898((byte) -111); var23 != null; var23 = (class559) class562.field7588.method3902(true)) {
                                                if (((long) var23.field7534) < (class577.method3295((byte) 15) / 1000L - 5L)) {
                                                    if (var23.field7537 > 0) {
                                                        class628.method3510("", -1, 0, 5, "", var23.field7535 + class65.field807.method555(class697.field9900, true), "");
                                                    }
                                                    if (var23.field7537 == 0) {
                                                        class628.method3510("", -1, 0, 5, "", var23.field7535 + class65.field808.method555(class697.field9900, true), "");
                                                    }
                                                    var23.method3074((byte) 48);
                                                }
                                            }
                                            if (class285.field3921 == 7 && class521.field7090 == 0) {
                                                if (class589.field8272 == null) {
                                                    class9.method35((byte) 80, false);
                                                    return;
                                                }
                                                class43.field515++;
                                                if (class43.field515 > 50) {
                                                    class28.field349++;
                                                    class352 var24 = class290.method1786(98, class199.field2836, class355.field4718);
                                                    class602.method3388(var24, (byte) 28);
                                                }
                                                try {
                                                    class224.method1413((byte) 6);
                                                    return;
                                                } catch (IOException var25) {
                                                    class9.method35((byte) 121, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field4957;
                                        if (var21.field1034 < 0) {
                                            break;
                                        }
                                        var22 = class582.method3319((byte) -49, var21.field1178);
                                    } while (var22 == null || var22.field1046 == null || var21.field1034 >= var22.field1046.length || var22.field1046[var21.field1034] != var21);
                                    class97.method708(var20);
                                }
                            }
                            var18 = var17.field4957;
                            if (var18.field1034 < 0) {
                                break;
                            }
                            var19 = class582.method3319((byte) -113, var18.field1178);
                        } while (var19 == null || var19.field1046 == null || var19.field1046.length <= var18.field1034 || var19.field1046[var18.field1034] != var18);
                        class97.method708(var17);
                    }
                }
                var15 = var14.field4957;
                if (var15.field1034 < 0) {
                    break;
                }
                var16 = class582.method3319((byte) -115, var15.field1178);
            } while (var16 == null || var16.field1046 == null || var16.field1046.length <= var15.field1034 || var16.field1046[var15.field1034] != var15);
            class97.method708(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1681() {
        int var0 = class528.field7160;
        int[] var1 = class439.field6091;
        int var2 = class362.field4773 ? var0 : class698.field9912 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class124 var4;
            if (var3 < var0) {
                var4 = class671.field9407[var1[var3]];
            } else {
                var4 = ((class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var3 - var0])).field5552;
            }
            if (var4.field1787 >= 0) {
                int var5 = var4.method881(-127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4042 & 0x1FF) == 0 && (var4.field4047 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field4042 & 0x1FF) == 256 && (var4.field4047 & 0x1FF) == 256) {
                    continue;
                }
                var4.field4052 = class249.method1533(var4.field4053, var4.field4047, var4.field4042, -124);
                class190.method1291(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method1527(int arg0) {
        field3728++;
        method1675(-106);
        class60.method494(10);
        class51.method400((byte) -92);
        class65.method556(-5618);
        class90.method657(true);
        class239.method1493((byte) -74);
        class219.method1398(84);
        class154.method1097(118);
        class162.method1140((byte) 126);
        class289.method1784(106);
        class578.method3298((byte) 33);
        class401.method2341(false);
        class367.method2124(105);
        class139.method967(10094);
        class29.method286(4);
        class202.method1325(109);
        class235.method1479((byte) 105);
        class414.method2401(97);
        class392.method2294(58);
        class166.method1167(1);
        class64.method548((byte) 94);
        class197.method1304(false);
        class372.method2143(true);
        class121.method871(0);
        class227.method1437((byte) -32);
        class691.method3890(0);
        class100.method736(false);
        class272.method1669((byte) 58);
        class3.method6(5885);
        class119.method857(false);
        class648.method3648((byte) 32);
        class208.method1352((byte) -121);
        class589.method3343((byte) 58);
        class433.method2485((byte) 14);
        class113.method816(28);
        class456.method2599((byte) -80);
        class627.method3505(1);
        class582.method3321(-98);
        class13.method62(15990);
        class660.method3710(6518);
        class40.method357(false);
        class454.method2581((byte) -69);
        class706.method3957(3);
        class338.method1976(-28526);
        class16.method80(1);
        class549.method3083((byte) -1);
        class599.method3383((byte) -92);
        class341.method1996(112);
        class182.method1255(true);
        class412.method2394(458752);
        class355.method2037((byte) -89);
        class125.method904(0);
        class700.method3923((byte) 0);
        class393.method2297(false);
        class482.method2704(126);
        class206.method1338(-106);
        class507.method2899(2);
        class380.method2188(-1);
        class630.method3529(false);
        class112.method812(12800);
        class495.method2791((byte) 78);
        class410.method2388(-1);
        class693.method3897(-107);
        class78.method597(121);
        class483.method2715((byte) -109);
        class677.method3853((byte) -119);
        class428.method2459(true);
        class400.method2337((byte) 127);
        class501.method2852(127);
        class124.method896(false);
        class390.method2289(3);
        class596.method3367(126);
        class81.method630(-126);
        class623.method3461(false);
        class61.method499(0);
        class685.method3874(6);
        class303.method1844(-1402762891);
        class95.method691((byte) -127);
        class176.method1231(126);
        class465.method2626(-5201);
        class698.method3915(-118);
        class248.method1531(false);
        class228.method1447((byte) 100);
        class66.method560(-119);
        class171.method1208((byte) 89);
        class375.method2155((byte) 54);
        class287.method1767((byte) -56);
        class58.method486(-83);
        class68.method570(0);
        class205.method1332(0);
        class550.method3093((byte) 109);
        class667.method3767(127);
        class527.method2996(6668);
        class109.method791(2);
        class133.method940(-2923);
        class55.method468(-9108);
        class689.method3883((byte) -115);
        class674.method3823(-377029181);
        class89.method649(-4);
        class301.method1829(true);
        class270.method1641((byte) 107);
        class568.method3260((byte) 77);
        class417.method2416(-122);
        class181.method1243((byte) 54);
        class134.method942(0);
        class39.method352(-12531);
        class618.method3443(-115);
        class283.method1742(17);
        class472.method2662((byte) -50);
        class186.method1284(-3);
        class363.method2069(15597);
        class210.method1358((byte) -39);
        class295.method1801((byte) -97);
        class364.method2076(94);
        class362.method2065((byte) 117);
        class437.method2502((byte) 110);
        class416.method2405(24068);
        class84.method637(true);
        class543.method3066(100);
        class99.method718(-117);
        class285.method1756(0);
        class605.method3404((byte) -127);
        class41.method364((byte) 110);
        class316.method1912(0);
        class80.method625(-5);
        class14.method71(-16104);
        class53.method409((byte) 54);
        class207.method1340(true);
        class510.method2917();
        class2.method2((byte) 113);
        class298.method1809((byte) -126);
        class330.method1959(-51);
        class306.method1858(-80);
        class4.method9(3);
        class149.method1090((byte) 88);
        class420.method2436(0);
        class594.method3360((byte) -99);
        class12.method58((byte) -119);
        class614.method3435((byte) 27);
        class533.method3026(74);
        class646.method3606();
        class67.method563((byte) 56);
        class405.method2360(10);
        class231.method1454(true);
        class598.method3374(116);
        class221.method1403((byte) -53);
        class116.method825(-123);
        class97.method710();
        class314.method1906(-88);
        class325.method1949(false);
        class666.method3761(0);
        class215.method1383();
        class165.method1164(-24886);
        class342.method2002(-11701);
        class567.method3244((byte) 110);
        class611.method3424((byte) -124);
        class368.method2129(-1);
        class290.method1785((byte) 81);
        class25.method246(false);
        class34.method308((byte) 32);
        class633.method3541(15);
        class345.method2011((byte) 20);
        class130.method925(-22054);
        class216.method1393(6145);
        class457.method2608(9369);
        class511.method2933(10000);
        class353.method2031(126);
        class467.method2641(1);
        class54.method411(1);
        class444.method2519(true);
        class110.method794();
        class357.method2046(true);
        class360.method2060((byte) -82);
        class44.method375(-14682);
        class179.method1238();
        class487.method2767((byte) -116);
        class143.method1008(-60);
        class313.method1900(-31640);
        class669.method3779(-111);
        class373.method2148((byte) -127);
        class75.method583(53);
        class389.method2288(-117);
        class172.method1220();
        class262.method1599(-125);
        class671.method3785((byte) 96);
        class466.method2633(true);
        class79.method617(2);
        class264.method1613((byte) 89);
        class122.method877(10039);
        class488.method2770(-11301);
        class430.method2471((byte) -122);
        class670.method3781((byte) -15);
        class601.method3385(true);
        class532.method3022((byte) -121);
        class26.method249(-1);
        class366.method2113(-9445);
        class91.method660(17325);
        class192.method1293(-28329);
        class635.method3549(false);
        class502.method2878(-1);
        class315.method1907(2076);
        class261.method1598(-21174);
        class492.method2782((byte) 87);
        class508.method2902(82);
        class7.method23(1);
        class188.method1289((byte) 101);
        class280.method1726(0);
        class199.method1320(53);
        class651.method3667(-59);
        class198.method1311(-50);
        class284.method1750((byte) -87);
        class544.method3069(false);
        class385.method2280(-84);
        class524.method2989(121);
        class489.method2774(4332);
        class347.method2016(112);
        class558.method3122(-1);
        class255.method1571((byte) 8);
        class540.method3050((byte) 74);
        class20.method207(-73);
        class545.method3072(97);
        class9.method38((byte) 47);
        class583.method3323((byte) 97);
        class657.method3695(false);
        class477.method2691((byte) 2);
        class167.method1178((byte) 126);
        class358.method2049(-17823);
        class213.method1371((byte) -121);
        class452.method2568((byte) -119);
        class687.method3876(Integer.MIN_VALUE);
        class85.method639((byte) -85);
        class396.method2323((byte) -121);
        class224.method1415((byte) -117);
        class435.method2489((byte) 100);
        class52.method407(-91);
        class266.method1620((byte) 115);
        class563.method3148(true);
        class11.method53((byte) -13);
        class209.method1355(5);
        class656.method3694(59);
        class399.method2333(-31759);
        class619.method3445((byte) 106);
        class408.method2381(-12);
        class587.method3336((byte) -18);
        class586.method3333((byte) -122);
        class419.method2432((byte) -124);
        class286.method1764(false);
        class683.method3868(-4204);
        class59.method491(false);
        class522.method2972();
        class178.method1236(true);
        class552.method3097(-22545);
        class317.method1917(3);
        class108.method783(-81);
        class249.method1534(1);
        class629.method3517((byte) -115);
        class344.method2003((byte) -42);
        class451.method2566(14995);
        class242.method1504((byte) -120);
        class659.method3702(0);
        class48.method385((byte) -3);
        class72.method578(-1);
        class256.method1574(0);
        class260.method1595((byte) 127);
        class606.method3412((byte) 3);
        class636.method3551(1024);
        class38.method345();
        class259.method1588(262144);
        class336.method1974(-76);
        class682.method3867();
        class644.method3586();
        class128.method912(0);
        class647.method3616(0);
        class117.method832();
        class30.method291(118);
        class31.method300((byte) 2);
        class542.method3062(-116);
        class279.method1723(false);
        class123.method880(10102);
        class138.method963((byte) -71);
        class88.method648(4550);
        class425.method2452((byte) -50);
        class485.method2756((byte) 23);
        class497.method2794((byte) 122);
        class187.method1288((byte) -127);
        class57.method477(-14);
        class655.method3692((byte) -32);
        class327.method1951(63);
        class267.method1625(121);
        class643.method3584(1);
        class98.method715((byte) 123);
        class664.method3759((byte) 95);
        class642.method3569();
        class469.method2651(-52);
        class83.method634(false);
        class616.method3442(126);
        class603.method3396(-7690);
        class118.method839((byte) 62);
        class571.method3270(0);
        class292.method1790((byte) 34);
        class653.method3681(false);
        class650.method3665(-121);
        class56.method469(32);
        class307.method1863(-2427);
        class251.method1544((byte) -23);
        class481.method2703(-1);
        class518.method2951(0);
        class320.method1924(true);
        class418.method2430((byte) 14);
        class114.method818(0);
        class333.method1965(false);
        class384.method2279((byte) 96);
        class613.method3430(-255);
        class565.method3231(false);
        class523.method2984(-116);
        class628.method3516((byte) -122);
        class63.method517(false);
        class311.method1887((byte) 84);
        class541.method3060((byte) -23);
        class561.method3138(-30709);
        class442.method2513((byte) 84);
        class254.method1553(2051);
        class136.method945(120);
        class164.method1147(-1);
        class340.method1988(true);
        class696.method3910(-10645);
        class382.method2231(256);
        class103.method754((byte) 72);
        class309.method1874((byte) -37);
        class274.method1701(-79);
        class494.method2790(127);
        class265.method1617((byte) 127);
        class681.method3861(7);
        class321.method1927((byte) -97);
        class159.method1128(123);
        class263.method1607(0);
        class520.method2965(14247);
        class676.method3835(-129);
        class115.method823((byte) -74);
        class562.method3142((byte) 99);
        class93.method672(-6971);
        class147.method1034(16384);
        class547.method3079(false);
        class49.method394();
        class554.method3110(123);
        class513.method2939(-118);
        class498.method2797(-16385);
        class645.method3596((byte) 40);
        class23.method235(-29);
        class244.method1511((byte) 105);
        class131.method926(-3451);
        class152.method1096(0);
        class570.method3264(-107);
        class299.method1811((byte) 5);
        class107.method780(-63);
        class531.method3018(-2048);
        class383.method2275((byte) -98);
        class76.method587((byte) -32);
        class324.method1941(4096);
        class339.method1983(2897);
        class334.method1969(44);
        class127.method909(26663);
        class377.method2157((byte) 59);
        class10.method49(-120);
        class332.method1962(false);
        class21.method228(-40);
        class250.method1539(-1);
        class654.method3690(-16254);
        class273.method1693(-103);
        class402.method2348((byte) 33);
        class391.method2293(false);
        class302.method1841(false);
        class423.method2446(-102);
        class71.method576(0);
        class473.method2666(8192);
        class319.method1921(-21632);
        class155.method1106(false);
        class573.method3273();
        class673.method3805();
        class521.method2969(2047);
        class528.method3010((byte) 120);
        class120.method861(-10735);
        class699.method3917(true);
        class378.method2163(89);
        class46.method382(111);
        class24.method238(6);
        class624.method3466(1);
        class474.method2671((byte) -37);
        class33.method307(120);
        class268.method1630((byte) -111);
        class310.method1880((byte) -100);
        class5.method12((byte) -93);
        class129.method917((byte) 44);
        if (arg0 >= -20) {
            field3715 = null;
        }
        class652.method3674(65280);
        class222.method1407((byte) -51);
        class697.method3911(0);
        class422.method2442((byte) -109);
        class141.method987(5888);
        class226.method1431(true);
        class538.method3046((byte) 22);
        class77.method592(-10336);
        class329.method1955(-25415);
        class557.method3119(-1);
        class233.method1472(true);
        class620.method3449(-15074);
        class675.method3826(4);
        class607.method3416(28818);
        class436.method2495((byte) 106);
        class185.method1275((byte) 10);
        class183.method1256(-1);
        class597.method3372(1);
        class17.method82(187);
        class173.method1224(-124);
        class160.method1131((byte) 31);
        class703.method3940(896);
        class291.method1787(12775);
        class449.method2558(0);
        class300.method1818(464883728);
        class296.method1805((byte) -81);
        class564.method3157((byte) -106);
        class479.method2696(false);
        class525.method2992(12075);
        class214.method1375(107);
        class137.method959(25318);
        class140.method979(128);
        class462.method2617(-118);
        class426.method2454((byte) 119);
        class180.method1239(true);
        class169.method1197(512);
        class151.method1092(0);
        class281.method1729(126);
        class276.method1720(true);
        class220.method1399(-20851);
        class148.method1082(28978);
        class588.method3338((byte) 124);
        class609.method3418(127);
        class534.method3029(10471);
        class184.method1266(126);
        class458.method2610((byte) -62);
        class468.method2642(-106);
        class238.method1488((byte) 99);
        class450.method2562(-19);
        class174.method1226(-9081);
        class308.method1864(0);
        class158.method1123((byte) 126);
        class354.method2032(109);
        class297.method1807((byte) 97);
        class622.method3456(99);
        class705.method3946(-120);
        class203.method1328(6);
        class615.method3440((byte) 59);
        class519.method2955(-20729);
        class43.method370(true);
        class318.method1919((byte) 101);
        class559.method3126(-128);
        class539.method3048((byte) -124);
        class293.method1793(-93);
        class322.method1931((byte) 25);
        class499.method2798(127);
        class69.method573(true);
        class584.method3329(122);
        class463.method2621(81);
        class351.method2027(-127);
        class434.method2488((byte) 99);
        class409.method2384(124);
        class503.method2885((byte) 85);
        class439.method2506((byte) -87);
        class704.method3943(false);
        class96.method700(-16332);
        class413.method2399(true);
        class387.method2285((byte) 111);
        class432.method2480(17025);
        class672.method3792(-125);
        class602.method3389((byte) 69);
        class431.method2476((byte) -100);
        class356.method2042(false);
        class36.method316(2);
        class111.method803(97);
        class684.method3872(-22888);
        class193.method1294(24243);
        class475.method2681(122);
        class234.method1474(-27039);
        class610.method3419(-1);
        class335.method1970(127);
        if (class245.field3361) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1682(boolean arg0) {
        field3726++;
        if (arg0) {
            field3731 = -72L;
        }
        if (class285.field3921 == 14) {
            return;
        }
        class186.field2697++;
        if (class186.field2697 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class119.field1631 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class139.field1963.setSeed((long) class119.field1631);
        }
        if (class186.field2697 % 50 == 0) {
            class214.field2989 = class683.field9754;
            class452.field6233 = class206.field2876;
            class683.field9754 = 0;
            class206.field2876 = 0;
        }
        this.method1673(arg0);
        if (class315.field4347 != null) {
            class315.field4347.method5(true);
        }
        class416.method2404(-2);
        class353.field4698.method37(120);
        class214.field2991.method1494((byte) -29);
        if (class334.field4506 != null) {
            class334.field4506.method194((int) class577.method3295((byte) 15));
        }
        class424.method2449(15);
        class390.field5523 = 0;
        class356.field4730 = 0;
        for (class305 var3 = class353.field4698.method44((byte) -83); var3 != null; var3 = class353.field4698.method44((byte) -96)) {
            int var6 = var3.method1855(-5972);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1853(-29475);
                if (class307.method1862((byte) 60) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class627.method3503(1)) {
                        class206.method1336((byte) 119);
                    } else {
                        class651.method3669((byte) -91);
                    }
                } else if (class356.field4730 < 128) {
                    class378.field5057[class356.field4730] = var3;
                    class356.field4730++;
                }
            } else if (var6 == 0 && class390.field5523 < 75) {
                class677.field9670[class390.field5523] = var3;
                class390.field5523++;
            }
        }
        class26.field322 = 0;
        for (class639 var4 = class214.field2991.method1492((byte) -85); var4 != null; var4 = class214.field2991.method1492((byte) -85)) {
            int var5 = var4.method1013(731);
            if (var5 == -1) {
                class368.field4958.method1441(var4, 0);
            } else if (var5 == 6) {
                class26.field322 += var4.method1011(!arg0);
            } else if (class373.method2146(var5, (byte) 123)) {
                class508.field6960.method1441(var4, 0);
                if (class508.field6960.method1434((byte) -99) > 10) {
                    class508.field6960.method1442(-10011);
                }
            }
        }
        if (class627.method3503(1)) {
            class184.method1269((byte) 76);
        }
        if (class182.method1254(class285.field3921, -20103)) {
            class671.method3789((byte) 99);
            class430.method2469(120);
        } else if (class296.method1804(class285.field3921, 2)) {
            class352.method2028((byte) 70);
        }
        if (class36.method313(class285.field3921, 11041) && !class296.method1804(class285.field3921, 2)) {
            this.method1680(-16610);
            class562.method3144(5);
            class683.method3871(93);
        } else if (class680.method3860(8, class285.field3921) && !class296.method1804(class285.field3921, 2)) {
            this.method1680(-16610);
            class683.method3871(105);
        } else if (class285.field3921 == 12) {
            class683.method3871(88);
        } else if (class689.method3882(class285.field3921, -12) && !class296.method1804(class285.field3921, 2)) {
            class216.method1394(-17480);
        } else if (class285.field3921 == 13) {
            class683.method3871(113);
            if (class422.field5942 != -3 && class422.field5942 != 2 && class422.field5942 != 15) {
                class9.method35((byte) 38, false);
            }
        }
        class46.method378(125, class334.field4506);
        class508.field6960.method1442(-10011);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final synchronized void method1518(int arg0) {
        field3730++;
        if (class59.field668 != null && class611.field8473 == null && !class543.field7374.field1460) {
            try {
                Class var2 = class59.field668.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class611.field8473 = (Canvas) var3.get(class59.field668);
                var3.set(class59.field668, null);
                if (class611.field8473 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1518(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
    public static final boolean method1683(int arg0, byte arg1) {
        field3716++;
        if (class210.field2970[arg0]) {
            return true;
        } else if (class290.field3993.method3651(arg0, arg1 - 120)) {
            int var2 = class290.field3993.method3653(arg0, true);
            if (var2 == 0) {
                class210.field2970[arg0] = true;
                return true;
            }
            if (arg1 != 103) {
                field3731 = -42L;
            }
            if (class167.field2439[arg0] == null) {
                class167.field2439[arg0] = new class78[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class167.field2439[arg0][var3] == null) {
                    byte[] var4 = class290.field3993.method3654(-15615, arg0, var3);
                    if (var4 != null) {
                        class78 var5 = class167.field2439[arg0][var3] = new class78();
                        var5.field1129 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method607(1, new class501(var4));
                    }
                }
            }
            class210.field2970[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    private final void method1684(int arg0, byte arg1) {
        field3723++;
        class103.field1454 = null;
        class654.field9099.field1417++;
        if (arg1 != 51) {
            method1687(null);
        }
        class262.field3551 = null;
        class534.field7216 = 0;
        class654.field9099.field1415 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lin;IIIIIIIII)V")
    public static final void method1685(class78[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class78 var11 = arg0[var10];
            if (var11 != null && var11.field1178 == arg1) {
                int var12 = var11.field1078 + arg6;
                int var13 = var11.field1081 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field1075 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field1104 + var12;
                    int var19 = var11.field1050 + var13;
                    if (var11.field1075 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field1075 == 0 || var11.field1091 || method1679(var11).field4217 != 0 || class501.field6894 == var11 || class325.field4429 == var11.field1109 || class328.field4444 == var11.field1109) {
                    if (!method1687(var11)) {
                        if (class396.field5579 == var11 && class45.method376(95, class396.field5579) != null) {
                            class118.field1597 = true;
                            class11.field108 = var12;
                            class473.field6504 = var13;
                        }
                        if (var11.field1132 || var14 < var16 && var15 < var17) {
                            if (var11.field1147 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class368 var20 = (class368) class69.field940.method1436(28964); var20 != null; var20 = (class368) class69.field940.method1443((byte) 6)) {
                                    if (var20.field4963) {
                                        var20.method2340(-128);
                                        var20.field4957.field1068 = false;
                                    }
                                }
                                if (class498.field6767 == 0) {
                                    class396.field5579 = null;
                                    class501.field6894 = null;
                                }
                                class614.field8574 = 0;
                                class5.field35 = false;
                                class358.field4749 = false;
                                if (!class541.field7327) {
                                    class6.method18((byte) 66);
                                }
                            }
                            boolean var21;
                            if (class214.field2991.method1499(8) >= var14 && class214.field2991.method1491((byte) 116) >= var15 && class214.field2991.method1499(8) < var16 && class214.field2991.method1491((byte) 126) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class426.field5971 && var21) {
                                if (var11.field1080 >= 0) {
                                    class112.field1563 = var11.field1080;
                                } else if (var11.field1147) {
                                    class112.field1563 = -1;
                                }
                            }
                            if (!class541.field7327 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class118.method838(var11, arg8 - var12, true, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class214.field2991.method1490(-3) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class639 var24 = (class639) class508.field6960.method1436(28964);
                            if (var24 != null && var24.method1013(731) == 0 && var24.method1014(false) >= var14 && var24.method1010(-97) >= var15 && var24.method1014(false) < var16 && var24.method1010(-113) < var17) {
                                var23 = true;
                            }
                            if (var11.field1164 != null && !class627.method3503(1)) {
                                for (int var25 = 0; var25 < var11.field1164.length; var25++) {
                                    if (class353.field4698.method34(var11.field1164[var25], -16215)) {
                                        if (var11.field1149 == null || class186.field2697 >= var11.field1149[var25]) {
                                            byte var26 = var11.field1051[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class353.field4698.method34(86, -16215) && !class353.field4698.method34(82, -16215) && !class353.field4698.method34(81, -16215)) && ((var26 & 0x2) == 0 || class353.field4698.method34(86, -16215)) && ((var26 & 0x1) == 0 || class353.field4698.method34(82, -16215)) && ((var26 & 0x4) == 0 || class353.field4698.method34(81, -16215))) {
                                                if (var25 < 10) {
                                                    class99.method719(var25 + 1, var11.field1129, -7, -1, "");
                                                } else if (var25 == 10) {
                                                    class114.method820((byte) -110);
                                                    class303 var27 = method1679(var11);
                                                    class128.method914(var27.field4207, var11, var27.method1849((byte) 66), -99);
                                                    class178.field2551 = class46.method381(-1, var11);
                                                    if (class178.field2551 == null) {
                                                        class178.field2551 = "Null";
                                                    }
                                                    class185.field2679 = var11.field1101 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field1087[var25];
                                                if (var11.field1149 == null) {
                                                    var11.field1149 = new int[var11.field1164.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field1149[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field1149[var25] = class186.field2697 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field1149 != null) {
                                        var11.field1149[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class119.method856(var11, (byte) -128, var24.method1014(false) - var12, var24.method1010(-95) - var13);
                            }
                            if (class396.field5579 != null && class396.field5579 != var11 && var21 && method1679(var11).method1845(-16891)) {
                                class482.field6625 = var11;
                            }
                            if (class501.field6894 == var11) {
                                class198.field2824 = true;
                                class451.field6206 = var12;
                                class1.field3 = var13;
                            }
                            if (var11.field1091 || var11.field1109 != 0) {
                                if (var21 && class26.field322 != 0 && var11.field1043 != null) {
                                    class368 var29 = new class368();
                                    var29.field4963 = true;
                                    var29.field4957 = var11;
                                    var29.field4954 = class26.field322;
                                    var29.field4962 = var11.field1043;
                                    class69.field940.method1441(var29, 0);
                                }
                                if (class396.field5579 != null || class541.field7327 || class346.field4633 != var11.field1109 && class614.field8574 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field1109 != 0) {
                                    if (class42.field489 == var11.field1109 || class99.field1387 == var11.field1109) {
                                        class685.field9775 = var11;
                                        if (class261.field3549 != null) {
                                            class261.field3549.method2391(class334.field4506, (byte) 126, var11.field1050);
                                        }
                                        if (class42.field489 == var11.field1109) {
                                            if (!class541.field7327 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class316.method1910(arg8, arg9, class334.field4506, 97);
                                                for (class651 var30 = (class651) class12.field123.method3898((byte) -69); var30 != null; var30 = (class651) class12.field123.method3902(true)) {
                                                    if (arg8 >= var30.field9036 && arg8 < var30.field9041 && arg9 >= var30.field9039 && arg9 < var30.field9038) {
                                                        class6.method18((byte) 106);
                                                        class575.method3285((byte) -124, var30.field9045);
                                                    }
                                                }
                                            }
                                            class323.method1936(var11, var13, -108, var12);
                                            continue;
                                        }
                                    }
                                    if (class325.field4429 == var11.field1109) {
                                        if (var11.method608(class334.field4506, (byte) -99) == null || class533.field7214 != 0 && class533.field7214 != 3 || class541.field7327 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field1032[var32];
                                        if (var31 < var33 || var31 > var11.field1049[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field1104 / 2;
                                        int var35 = var32 - var11.field1050 / 2;
                                        int var36;
                                        if (class203.field2863 == 4) {
                                            var36 = (int) class705.field9964 & 0x3FFF;
                                        } else {
                                            var36 = (int) class705.field9964 + class174.field2526 & 0x3FFF;
                                        }
                                        int var37 = class597.field8342[var36];
                                        int var38 = class597.field8344[var36];
                                        if (class203.field2863 != 4) {
                                            var37 = (class216.field3062 + 256) * var37 >> 8;
                                            var38 = (class216.field3062 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class203.field2863 == 4) {
                                            var41 = (class247.field3386 >> 9) + (var39 >> 2);
                                            var42 = (class323.field4403 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class143.field2063.method881(-118) - 1) * 256;
                                            var41 = (class143.field2063.field4042 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class143.field2063.field4047 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class426.field5971 && (class89.field1283 & 0x40) != 0) {
                                            class78 var44 = class89.method650(87, class340.field4555, class544.field7389);
                                            if (var44 == null) {
                                                class114.method820((byte) -96);
                                            } else {
                                                class547.method3077(9, var42, class178.field2551, class547.field7417, false, true, " ->", 1L, -128, var41, var11.field1145);
                                            }
                                            continue;
                                        }
                                        if (class704.field9959 == class219.field3065) {
                                            class547.method3077(4, var42, class65.field815.method555(class697.field9900, true), -1, false, true, "", 1L, -54, var41, -1);
                                        }
                                        class547.method3077(23, var42, class594.field8313, class203.field2864, false, true, "", 1L, -95, var41, -1);
                                        continue;
                                    }
                                    if (class346.field4633 == var11.field1109) {
                                        class289.field3960 = var11;
                                        if (var21) {
                                            class5.field35 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1014(false) - var12 - var11.field1104 / 2) * 2.0D / (double) class510.field6990);
                                            int var46 = (int) (-((double) (var24.method1010(-93) - var13 - var11.field1050 / 2) * 2.0D / (double) class510.field6990));
                                            int var47 = class266.field3598 + var45 + class510.field7003;
                                            int var48 = class670.field9403 + var46 + class510.field7012;
                                            class112 var49 = class73.method581((byte) 103);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method810(var50, var47, -1, var48);
                                            if (var50 != null) {
                                                if (class353.field4698.method34(82, -16215) && class296.field4060 > 0) {
                                                    class570.method3265(var50[0], var50[1], 1, var50[2]);
                                                    continue;
                                                }
                                                class358.field4749 = true;
                                                class314.field4338 = var50[0];
                                                class613.field8520 = var50[1];
                                                class458.field6352 = var50[2];
                                            }
                                            class614.field8574 = 1;
                                            class46.field556 = false;
                                            class413.field5853 = class214.field2991.method1499(8);
                                            class220.field3073 = class214.field2991.method1491((byte) 117);
                                            continue;
                                        }
                                        if (var22 && class614.field8574 > 0) {
                                            if (class614.field8574 == 1 && (class413.field5853 != class214.field2991.method1499(8) || class220.field3073 != class214.field2991.method1491((byte) 113))) {
                                                class391.field5538 = class266.field3598;
                                                class528.field7151 = class670.field9403;
                                                class614.field8574 = 2;
                                            }
                                            if (class614.field8574 == 2) {
                                                class46.field556 = true;
                                                class569.method3262(class391.field5538 + (int) ((double) (class413.field5853 - class214.field2991.method1499(8)) * 2.0D / (double) class510.field6991), -1);
                                                class342.method2001(class528.field7151 - (int) ((double) (class220.field3073 - class214.field2991.method1491((byte) 112)) * 2.0D / (double) class510.field6991), (byte) 123);
                                            }
                                            continue;
                                        }
                                        if (class614.field8574 > 0 && !class46.field556) {
                                            if ((class141.field2008 == 1 || class116.method828(1006094723)) && class137.field1948 > 2) {
                                                class389.method2286(class413.field5853, 111, class220.field3073);
                                            } else if (class541.method3053((byte) -107)) {
                                                class389.method2286(class413.field5853, 126, class220.field3073);
                                            }
                                        }
                                        class614.field8574 = 0;
                                        continue;
                                    }
                                    if (class86.field1259 == var11.field1109) {
                                        if (var22) {
                                            class243.method1508(var11.field1050, var11.field1104, class214.field2991.method1491((byte) 127) - var13, 2, class214.field2991.method1499(8) - var12);
                                        }
                                        continue;
                                    }
                                    if (class328.field4444 == var11.field1109) {
                                        class419.method2431(var13, -82, var11, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field1116 && var23) {
                                    var11.field1116 = true;
                                    if (var11.field1058 != null) {
                                        class368 var51 = new class368();
                                        var51.field4963 = true;
                                        var51.field4957 = var11;
                                        var51.field4961 = var24.method1014(false) - var12;
                                        var51.field4954 = var24.method1010(-120) - var13;
                                        var51.field4962 = var11.field1058;
                                        class69.field940.method1441(var51, 0);
                                    }
                                }
                                if (var11.field1116 && var22 && var11.field1115 != null) {
                                    class368 var52 = new class368();
                                    var52.field4963 = true;
                                    var52.field4957 = var11;
                                    var52.field4961 = class214.field2991.method1499(8) - var12;
                                    var52.field4954 = class214.field2991.method1491((byte) 104) - var13;
                                    var52.field4962 = var11.field1115;
                                    class69.field940.method1441(var52, 0);
                                }
                                if (var11.field1116 && !var22) {
                                    var11.field1116 = false;
                                    if (var11.field1171 != null) {
                                        class368 var53 = new class368();
                                        var53.field4963 = true;
                                        var53.field4957 = var11;
                                        var53.field4961 = class214.field2991.method1499(8) - var12;
                                        var53.field4954 = class214.field2991.method1491((byte) 118) - var13;
                                        var53.field4962 = var11.field1171;
                                        class68.field920.method1441(var53, 0);
                                    }
                                }
                                if (var22 && var11.field1156 != null) {
                                    class368 var54 = new class368();
                                    var54.field4963 = true;
                                    var54.field4957 = var11;
                                    var54.field4961 = class214.field2991.method1499(8) - var12;
                                    var54.field4954 = class214.field2991.method1491((byte) 102) - var13;
                                    var54.field4962 = var11.field1156;
                                    class69.field940.method1441(var54, 0);
                                }
                                if (!var11.field1068 && var21) {
                                    var11.field1068 = true;
                                    if (var11.field1134 != null) {
                                        class368 var55 = new class368();
                                        var55.field4963 = true;
                                        var55.field4957 = var11;
                                        var55.field4961 = class214.field2991.method1499(8) - var12;
                                        var55.field4954 = class214.field2991.method1491((byte) 121) - var13;
                                        var55.field4962 = var11.field1134;
                                        class69.field940.method1441(var55, 0);
                                    }
                                }
                                if (var11.field1068 && var21 && var11.field1162 != null) {
                                    class368 var56 = new class368();
                                    var56.field4963 = true;
                                    var56.field4957 = var11;
                                    var56.field4961 = class214.field2991.method1499(8) - var12;
                                    var56.field4954 = class214.field2991.method1491((byte) 106) - var13;
                                    var56.field4962 = var11.field1162;
                                    class69.field940.method1441(var56, 0);
                                }
                                if (var11.field1068 && !var21) {
                                    var11.field1068 = false;
                                    if (var11.field1146 != null) {
                                        class368 var57 = new class368();
                                        var57.field4963 = true;
                                        var57.field4957 = var11;
                                        var57.field4961 = class214.field2991.method1499(8) - var12;
                                        var57.field4954 = class214.field2991.method1491((byte) 123) - var13;
                                        var57.field4962 = var11.field1146;
                                        class68.field920.method1441(var57, 0);
                                    }
                                }
                                if (var11.field1139 != null) {
                                    class368 var58 = new class368();
                                    var58.field4957 = var11;
                                    var58.field4962 = var11.field1139;
                                    class95.field1335.method1441(var58, 0);
                                }
                                if (var11.field1159 != null && class119.field1630 > var11.field1036) {
                                    if (var11.field1027 == null || class119.field1630 - var11.field1036 > 32) {
                                        class368 var63 = new class368();
                                        var63.field4957 = var11;
                                        var63.field4962 = var11.field1159;
                                        class69.field940.method1441(var63, 0);
                                    } else {
                                        label696: for (int var59 = var11.field1036; var59 < class119.field1630; var59++) {
                                            int var60 = class54.field611[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field1027.length; var61++) {
                                                if (var11.field1027[var61] == var60) {
                                                    class368 var62 = new class368();
                                                    var62.field4957 = var11;
                                                    var62.field4962 = var11.field1159;
                                                    class69.field940.method1441(var62, 0);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1036 = class119.field1630;
                                }
                                if (var11.field1107 != null && class703.field9946 > var11.field1110) {
                                    if (var11.field1066 == null || class703.field9946 - var11.field1110 > 32) {
                                        class368 var68 = new class368();
                                        var68.field4957 = var11;
                                        var68.field4962 = var11.field1107;
                                        class69.field940.method1441(var68, 0);
                                    } else {
                                        label672: for (int var64 = var11.field1110; var64 < class703.field9946; var64++) {
                                            int var65 = class250.field3409[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1066.length; var66++) {
                                                if (var11.field1066[var66] == var65) {
                                                    class368 var67 = new class368();
                                                    var67.field4957 = var11;
                                                    var67.field4962 = var11.field1107;
                                                    class69.field940.method1441(var67, 0);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1110 = class703.field9946;
                                }
                                if (var11.field1133 != null && class29.field365 > var11.field1177) {
                                    if (var11.field1088 == null || class29.field365 - var11.field1177 > 32) {
                                        class368 var73 = new class368();
                                        var73.field4957 = var11;
                                        var73.field4962 = var11.field1133;
                                        class69.field940.method1441(var73, 0);
                                    } else {
                                        label648: for (int var69 = var11.field1177; var69 < class29.field365; var69++) {
                                            int var70 = class534.field7219[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field1088.length; var71++) {
                                                if (var11.field1088[var71] == var70) {
                                                    class368 var72 = new class368();
                                                    var72.field4957 = var11;
                                                    var72.field4962 = var11.field1133;
                                                    class69.field940.method1441(var72, 0);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1177 = class29.field365;
                                }
                                if (var11.field1035 != null && class339.field4547 > var11.field1166) {
                                    if (var11.field1073 == null || class339.field4547 - var11.field1166 > 32) {
                                        class368 var78 = new class368();
                                        var78.field4957 = var11;
                                        var78.field4962 = var11.field1035;
                                        class69.field940.method1441(var78, 0);
                                    } else {
                                        label624: for (int var74 = var11.field1166; var74 < class339.field4547; var74++) {
                                            int var75 = class385.field5461[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1073.length; var76++) {
                                                if (var11.field1073[var76] == var75) {
                                                    class368 var77 = new class368();
                                                    var77.field4957 = var11;
                                                    var77.field4962 = var11.field1035;
                                                    class69.field940.method1441(var77, 0);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1166 = class339.field4547;
                                }
                                if (var11.field1072 != null && class31.field398 > var11.field1063) {
                                    if (var11.field1096 == null || class31.field398 - var11.field1063 > 32) {
                                        class368 var83 = new class368();
                                        var83.field4957 = var11;
                                        var83.field4962 = var11.field1072;
                                        class69.field940.method1441(var83, 0);
                                    } else {
                                        label600: for (int var79 = var11.field1063; var79 < class31.field398; var79++) {
                                            int var80 = class620.field8614[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field1096.length; var81++) {
                                                if (var11.field1096[var81] == var80) {
                                                    class368 var82 = new class368();
                                                    var82.field4957 = var11;
                                                    var82.field4962 = var11.field1072;
                                                    class69.field940.method1441(var82, 0);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1063 = class31.field398;
                                }
                                if (class296.field4061 > var11.field1042 && var11.field1026 != null) {
                                    class368 var84 = new class368();
                                    var84.field4957 = var11;
                                    var84.field4962 = var11.field1026;
                                    class69.field940.method1441(var84, 0);
                                }
                                if (class433.field6034 > var11.field1042 && var11.field1165 != null) {
                                    class368 var85 = new class368();
                                    var85.field4957 = var11;
                                    var85.field4962 = var11.field1165;
                                    class69.field940.method1441(var85, 0);
                                }
                                if (class260.field3542 > var11.field1042 && var11.field1150 != null) {
                                    class368 var86 = new class368();
                                    var86.field4957 = var11;
                                    var86.field4962 = var11.field1150;
                                    class69.field940.method1441(var86, 0);
                                }
                                if (class261.field3546 > var11.field1042 && var11.field1103 != null) {
                                    class368 var87 = new class368();
                                    var87.field4957 = var11;
                                    var87.field4962 = var11.field1103;
                                    class69.field940.method1441(var87, 0);
                                }
                                if (class700.field9934 > var11.field1042 && var11.field1112 != null) {
                                    class368 var88 = new class368();
                                    var88.field4957 = var11;
                                    var88.field4962 = var11.field1112;
                                    class69.field940.method1441(var88, 0);
                                }
                                var11.field1042 = class436.field6066;
                                if (var11.field1022 != null) {
                                    for (int var89 = 0; var89 < class356.field4730; var89++) {
                                        class368 var90 = new class368();
                                        var90.field4957 = var11;
                                        var90.field4953 = class378.field5057[var89].method1852(27648);
                                        var90.field4959 = class378.field5057[var89].method1853(-29475);
                                        var90.field4962 = var11.field1022;
                                        class69.field940.method1441(var90, 0);
                                    }
                                }
                                if (class220.field3087 && var11.field1125 != null) {
                                    class368 var91 = new class368();
                                    var91.field4957 = var11;
                                    var91.field4962 = var11.field1125;
                                    class69.field940.method1441(var91, 0);
                                }
                            }
                            if (var11.field1075 == 5 && var11.field1099 != -1) {
                                var11.method612(class433.field6033, class444.field6147, 0).method2391(class334.field4506, (byte) 126, var11.field1050);
                            }
                            class668.method3774((byte) -127, var11);
                            if (var11.field1075 == 0) {
                                method1685(arg0, var11.field1129, var14, var15, var16, var17, var12 - var11.field1158, var13 - var11.field1170, arg8, arg9);
                                if (var11.field1046 != null) {
                                    method1685(var11.field1046, var11.field1129, var14, var15, var16, var17, var12 - var11.field1158, var13 - var11.field1170, arg8, arg9);
                                }
                                class685 var92 = (class685) class4.field26.method970((byte) 89, (long) var11.field1129);
                                if (var92 != null) {
                                    if (class454.field6305 == class219.field3065 && var92.field9774 == 0 && !class541.field7327 && var21 && !class314.field4339) {
                                        class6.method18((byte) 104);
                                    }
                                    class485.method2759(var13, var92.field9776, var14, var15, var12, 104, var16, arg9, arg8, var17);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class668.method3774((byte) -127, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method1522(int arg0) {
        if (arg0 >= -76) {
            field3715 = null;
        }
        field3732++;
        String var2 = null;
        try {
            var2 = "[1)" + class498.field6774 + "," + class613.field8555 + "," + class401.field5620 + "," + class257.field3508 + "|";
            if (class143.field2063 != null) {
                var2 = var2 + "2)" + class367.field4944 + "," + (class143.field2063.field1807[0] + class498.field6774) + "," + (class143.field2063.field1801[0] + class613.field8555) + "|";
            }
            var2 = var2 + "3)" + class503.field6917 + "|4)" + class366.field4875.field9347 + "|5)" + class317.method1913(1) + "|6)" + class222.field3096 + "," + class340.field4553 + "|";
            var2 = var2 + "7)" + class366.field4875.method3766(class503.field6917, (byte) -84) + "|";
            var2 = var2 + "8)" + class366.field4875.method3770(class503.field6917, true) + "|";
            var2 = var2 + "9)" + class366.field4875.field9353 + "|";
            var2 = var2 + "10)" + class366.field4875.field9344 + "|";
            var2 = var2 + "11)" + class366.field4875.field9340 + "|";
            var2 = var2 + "12)" + class366.field4875.method537(class503.field6917, 0) + "|";
            var2 = var2 + "13)" + class651.field9037 + "|";
            var2 = var2 + "14)" + class285.field3921;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class503.field6917 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3733 == null ? (field3733 = method1691("client")) : field3733).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    private final void method1686(int arg0) {
        field3719++;
        if (class243.field3307 < class654.field9099.field1417) {
            class651.field9040.method1209(37);
            class41.field484 = (class654.field9099.field1417 * 50 - 50) * 5;
            if (class41.field484 > 3000) {
                class41.field484 = 3000;
            }
            if (class654.field9099.field1417 >= 2 && class654.field9099.field1415 == 6) {
                this.method1524(0, "js5connect_outofdate");
                class285.field3921 = 14;
                return;
            }
            if (class654.field9099.field1417 >= 4 && class654.field9099.field1415 == -1) {
                this.method1524(0, "js5crc");
                class285.field3921 = 14;
                return;
            }
            if (class654.field9099.field1417 >= 4 && class182.method1254(class285.field3921, -20103)) {
                if (class654.field9099.field1415 == 7 || class654.field9099.field1415 == 9) {
                    this.method1524(0, "js5connect_full");
                } else if (class654.field9099.field1415 <= 0) {
                    this.method1524(0, "js5io");
                } else if (class53.field610 == null) {
                    this.method1524(0, "js5connect");
                } else {
                    this.method1524(0, "js5proxy_" + class53.field610.trim());
                }
                class285.field3921 = 14;
                return;
            }
        }
        class243.field3307 = class654.field9099.field1417;
        if (class41.field484 > 0) {
            class41.field484--;
            return;
        }
        try {
            if (arg0 <= 105) {
                this.method1516((byte) 112);
            }
            if (class534.field7216 == 0) {
                class262.field3551 = class651.field9040.method1206(class543.field7374, 37);
                class534.field7216++;
            }
            if (class534.field7216 == 1) {
                if (class262.field3551.field948 == 2) {
                    if (class262.field3551.field946 != null) {
                        class53.field610 = (String) class262.field3551.field946;
                    }
                    this.method1684(1000, (byte) 51);
                    return;
                }
                if (class262.field3551.field948 == 1) {
                    class534.field7216++;
                }
            }
            if (class534.field7216 == 2) {
                class103.field1454 = new class691((Socket) class262.field3551.field946, class543.field7374, 25000);
                class501 var2 = new class501(5);
                var2.method2817(class206.field2888.field6750, true);
                var2.method2836(626, -22164);
                class103.field1454.method3891(var2.field6855, 0, 75, 5);
                class534.field7216++;
                class468.field6427 = class577.method3295((byte) 15);
            }
            if (class534.field7216 == 3) {
                if (class182.method1254(class285.field3921, -20103) || class103.field1454.method3894(3) > 0) {
                    int var3 = class103.field1454.method3887(95);
                    if (var3 != 0) {
                        this.method1684(var3, (byte) 51);
                        return;
                    }
                    class534.field7216++;
                } else if ((class577.method3295((byte) 15) - class468.field6427) > 30000L) {
                    this.method1684(1001, (byte) 51);
                    return;
                }
            }
            if (class534.field7216 == 4) {
                boolean var4 = class182.method1254(class285.field3921, -20103) || class36.method313(class285.field3921, 11041) || class680.method3860(8, class285.field3921);
                class154[] var5 = class154.method1098((byte) 123);
                class501 var6 = new class501(var5.length * 4);
                class103.field1454.method3892(var6.field6855, 2656, var6.field6855.length, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1099(-12484, var6.method2840(false));
                }
                class654.field9099.method734(!var4, false, class103.field1454);
                class262.field3551 = null;
                class534.field7216 = 0;
                class103.field1454 = null;
            }
        } catch (IOException var8) {
            this.method1684(1002, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lin;)Z")
    public static final boolean method1687(class78 arg0) {
        if (class314.field4339) {
            if (method1679(arg0).field4217 != 0) {
                return false;
            }
            if (arg0.field1075 == 0) {
                return false;
            }
        }
        return arg0.field1059;
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    private final void method1688(int arg0) {
        field3720++;
        if (class285.field3921 == 14) {
            return;
        }
        long var2 = class57.method479(-95) / 1000000L - class55.field624;
        class55.field624 = class57.method479(123) / 1000000L;
        if (arg0 < 76) {
            method1677(0);
        }
        boolean var4 = class586.method3334((byte) 112);
        if (var4 && class636.field8795 && class11.field99 != null) {
            class11.field99.method3555(383);
        }
        if (class60.method496(class285.field3921, 23766)) {
            if (class620.field8619 != 0L && class577.method3295((byte) 15) > class620.field8619) {
                class75.method584(class366.field4875.field9374, false, class317.method1913(1), class366.field4875.field9355, (byte) 105);
            } else if (!class334.field4506.method116() && class529.field7170) {
                class234.method1475((byte) 41);
            }
        }
        if (class54.field613 == null) {
            Container var5;
            if (class130.field1868 != null) {
                var5 = class130.field1868;
            } else if (class59.field668 == null) {
                var5 = class356.field4728;
            } else {
                var5 = class59.field668;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class130.field1868 == var5) {
                Insets var8 = class130.field1868.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class148.field2192 != var6 || class595.field8319 != var7 || class399.field5604) {
                if (class334.field4506 == null || class334.field4506.method87()) {
                    class124.method883(1);
                } else {
                    class595.field8319 = var7;
                    class148.field2192 = var6;
                }
                class620.field8619 = class577.method3295((byte) 15) + 500L;
                class399.field5604 = false;
            }
        }
        if (class54.field613 != null && !class556.field7487 && class60.method496(class285.field3921, 23766)) {
            class75.method584(-1, false, class366.field4875.field9370, -1, (byte) -81);
        }
        boolean var9 = false;
        if (class262.field3554) {
            var9 = true;
            class262.field3554 = false;
        }
        if (var9) {
            class148.method1084(-1);
        }
        if (class334.field4506 != null && class334.field4506.method116() || class317.method1913(1) != 1) {
            class314.method1905(-101);
        }
        if (class182.method1254(class285.field3921, -20103)) {
            class109.method786(var9, -16);
        } else if (class66.method561(class285.field3921, -26019)) {
            class266.method1622(0);
        } else if (class236.method1481(class285.field3921, (byte) -108)) {
            class266.method1622(0);
        } else if (class296.method1804(class285.field3921, 2)) {
            if (class432.field6029 == 1) {
                if (class328.field4447 < class456.field6336) {
                    class328.field4447 = class456.field6336;
                }
                int var10 = (class328.field4447 - class456.field6336) * 50 / class328.field4447;
                class124.method890(class65.field800.method555(class697.field9900, true) + "<br>(" + var10 + "%)", class273.field3741, -1, true, class334.field4506, class136.field1916);
            } else if (class432.field6029 == 2) {
                if (class669.field9394 > class538.field7267) {
                    class538.field7267 = class669.field9394;
                }
                int var11 = (class538.field7267 - class669.field9394) * 50 / class538.field7267 + 50;
                class124.method890(class65.field800.method555(class697.field9900, true) + "<br>(" + var11 + "%)", class273.field3741, -1, true, class334.field4506, class136.field1916);
            } else {
                class124.method890(class65.field800.method555(class697.field9900, true), class273.field3741, -1, true, class334.field4506, class136.field1916);
            }
        } else if (class285.field3921 == 10) {
            class272.method1672((byte) -126, var2);
        } else if (class285.field3921 == 13) {
            class124.method890(class65.field802.method555(class697.field9900, true) + "<br>" + class65.field803.method555(class697.field9900, true), class273.field3741, -1, false, class334.field4506, class136.field1916);
        }
        if (class571.field8104 == 3) {
            for (int var12 = 0; var12 < class84.field1247; var12++) {
                Rectangle var13 = class596.field8331[var12];
                if (class633.field8764[var12]) {
                    class334.field4506.method1170(-1996553985, var13.height, var13.x, var13.width, var13.y, -28207);
                } else if (class325.field4428[var12]) {
                    class334.field4506.method1170(-1996554240, var13.height, var13.x, var13.width, var13.y, -28207);
                }
            }
        }
        if (class627.method3503(1)) {
            class417.method2409((byte) -37, class334.field4506);
        }
        if (class543.field7374.field1460 && class60.method496(class285.field3921, 23766) && class571.field8104 == 0 && class317.method1913(1) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class84.field1247; var17++) {
                if (class325.field4428[var17]) {
                    class325.field4428[var17] = false;
                    class450.field6182[var16++] = class596.field8331[var17];
                }
            }
            try {
                class334.field4506.method92(class450.field6182, var16);
            } catch (class39 var18) {
            }
        } else if (!class182.method1254(class285.field3921, -20103)) {
            for (int var14 = 0; var14 < class84.field1247; var14++) {
                class325.field4428[var14] = false;
            }
            try {
                class334.field4506.method100();
            } catch (class39 var19) {
                class413.method2400(var19.getMessage() + " (Recovered) " + this.method1522(-116), var19, (byte) -97);
                class203.method1327((byte) 63, 0);
            }
        }
        if (class366.field4875.field9380 == 0) {
            class519.method2960(-39, 15L);
        } else if (class366.field4875.field9380 == 1) {
            class519.method2960(87, 10L);
        } else if (class366.field4875.field9380 == 2) {
            class519.method2960(83, 5L);
        } else if (class366.field4875.field9380 == 3) {
            class519.method2960(118, 2L);
        }
        if (class108.field1496) {
            class301.method1834((byte) -93);
        }
        if (class366.field4875.field9362 && class285.field3921 == 3 && class631.field8758 != -1) {
            class366.field4875.field9362 = false;
            class366.field4875.method543(class543.field7374, (byte) 40);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1689() {
        class574.field8119 = 0;
        for (int var0 = 0; var0 < class698.field9912; var0++) {
            class61 var1 = ((class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var0])).field5552;
            if (var1.field1764 && var1.method506(true) != -1) {
                int var2 = (var1.method881(-117) - 1) * 256 + 252;
                int var3 = var1.field4042 - var2 >> 9;
                int var4 = var1.field4047 - var2 >> 9;
                class124 var5 = class424.method2450(var1.field4053, (byte) -106, var3, var4);
                if (var5 != null) {
                    int var6 = var5.field1697;
                    if (var5 instanceof class61) {
                        var6 += 2048;
                    }
                    if (var5.field1696 == 0 && var5.method506(true) != -1) {
                        class340.field4556[class574.field8119] = var6;
                        class131.field1888[class574.field8119] = var6;
                        class574.field8119++;
                        var5.field1696++;
                    }
                    class340.field4556[class574.field8119] = var6;
                    class131.field1888[class574.field8119] = var1.field1697 + 2048;
                    class574.field8119++;
                    var5.field1696++;
                }
            }
        }
        class689.method3881(0, false, class340.field4556, class131.field1888, class574.field8119 - 1);
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public static final void method1690(int arg0) {
        int var1 = class528.field7160;
        int[] var2 = class439.field6091;
        for (int var3 = 0; var3 < class698.field9912 + var1; var3++) {
            class124 var4;
            if (var3 < var1) {
                var4 = class671.field9407[var2[var3]];
            } else {
                var4 = ((class393) class299.field4071.method970((byte) 89, (long) class636.field8790[var3 - var1])).field5552;
            }
            if (var4.field4053 == arg0 && var4.field1787 >= 0) {
                int var5 = var4.method881(-122);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4042 & 0x1FF) != 0 || (var4.field4047 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field4042 & 0x1FF) != 256 || (var4.field4047 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4042 >> 9;
                    int var7 = var4.field4047 >> 9;
                    if (var4.field1787 > class183.field2646[var6][var7]) {
                        class183.field2646[var6][var7] = var4.field1787;
                        class435.field6048[var6][var7] = 1;
                    } else if (class183.field2646[var6][var7] == var4.field1787) {
                        var10002 = class435.field6048[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field4042 - var8 >> 9;
                    int var10 = var4.field4047 - var8 >> 9;
                    int var11 = var4.field4042 + var8 >> 9;
                    int var12 = var4.field4047 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1787 > class183.field2646[var13][var14]) {
                                class183.field2646[var13][var14] = var4.field1787;
                                class435.field6048[var13][var14] = 1;
                            } else if (class183.field2646[var13][var14] == var4.field1787) {
                                var10002 = class435.field6048[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3727++;
        if (!this.method1520(-1)) {
            return;
        }
        class138.field1954 = new class171();
        class138.field1954.field2475 = Integer.parseInt(this.getParameter("worldid"));
        class297.field4066 = new class171();
        class297.field4066.field2475 = Integer.parseInt(this.getParameter("lobbyid"));
        class297.field4066.field2472 = this.getParameter("lobbyaddress");
        class100.field1401 = new class171();
        class100.field1401.field2475 = Integer.parseInt(this.getParameter("demoid"));
        class100.field1401.field2472 = this.getParameter("demoaddress");
        class603.field8404 = class354.method2033(-27378, Integer.parseInt(this.getParameter("modewhere")));
        if (class603.field8404 == class547.field7412) {
            class603.field8404 = class131.field1878;
        } else if (!class158.method1118(class603.field8404, 34023) && class603.field8404 != class164.field2358) {
            class603.field8404 = class164.field2358;
        }
        class56.field634 = class221.method1401(Integer.parseInt(this.getParameter("modewhat")), 25200);
        if (class56.field634 != class492.field6730 && class56.field634 != class457.field6348 && class56.field634 != class373.field5024) {
            class56.field634 = class373.field5024;
        }
        try {
            class697.field9900 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class697.field9900 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class652.field9067 = true;
        } else {
            class652.field9067 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class123.field1686 = true;
        } else {
            class123.field1686 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class372.field5014 = true;
        } else {
            class372.field5014 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class219.field3065 = class454.field6305;
            } else if (var4.equals("1")) {
                class219.field3065 = class704.field9959;
            }
        }
        try {
            class254.field3462 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class254.field3462 = 0;
        }
        class623.field8647 = this.getParameter("quiturl");
        class400.field5614 = this.getParameter("settings");
        if (class400.field5614 == null) {
            class400.field5614 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class389.field5491 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class389.field5491 = 0;
            }
        }
        class52.field607 = Integer.parseInt(this.getParameter("colourid"));
        if (class52.field607 < 0 || class205.field2869.length <= class52.field607) {
            class52.field607 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class178.field2583 = true;
            class656.field9121 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class652.field9070 = true;
        }
        class650.field9030 = this.getParameter("sskey");
        if (class650.field9030 != null && class650.field9030.length() < 2) {
            class650.field9030 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class241.field3300 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class603.field8399 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class365.field4859 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class316.field4350 = this.getParameter("additionalInfo");
        if (class316.field4350 != null && class316.field4350.length() > 50) {
            class316.field4350 = null;
        }
        if (class454.field6305 == class219.field3065) {
            class178.field2581 = 765;
            class157.field2277 = 503;
        } else if (class704.field9959 == class219.field3065) {
            class178.field2581 = 640;
            class157.field2277 = 480;
        }
        class647.field8937 = this;
        this.method1514(class157.field2277, class178.field2581, 626, class56.field634.method1326(-1) + 32, 35, false, class219.field3065.field5862);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1691(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
