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
public class client extends class598 {

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field4445 = false;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lei;")
    public static class162 field4436 = new class162("runescape", 0);

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4447 = 0;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field4446;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/Class;")
    public static Class field4448;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "Z")
    public static boolean field4449;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1961(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 3)
    private final void method1935(byte arg0) {
        if (class682.field9564 == 7 && class706.field9988 == 0) {
            if (class157.field2688 > 1) {
                class158.field2701 = class79.field997;
                class157.field2688--;
            }
            if (!class453.field6808) {
                class315.method2151((byte) 105);
            }
            for (int var2 = 0; var2 < 100 && class587.method3435((byte) -87); var2++) {
            }
        }
        field4438++;
        class116.field1805++;
        class347.method2346(-1, null, 0, -1);
        class155.method1290(null, -1, -1, (byte) 112);
        class407.method2608(0);
        class79.field997++;
        for (int var3 = 0; var3 < class289.field4581; var3++) {
            class589 var4 = class613.field8707[var3].field5577;
            if (var4 != null) {
                byte var5 = var4.field8354.field9942;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method1841(20744);
                    if ((var5 & 0x2) != 0 && var4.field4267 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field4264[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class275.field4426 - var6 - 1)) {
                                var9 = class275.field4426 - var6 - 1;
                            }
                            int var10 = var4.field4265[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > class417.field6374 - var6 - 1) {
                                var10 = class417.field6374 - var6 - 1;
                            }
                            int var11 = class532.method3219(0, -1, var9, 0, class399.field6176, var6, class10.field172[var4.field9695], class156.field2677, var4.field4264[0], var10, true, var4.field4265[0], (byte) 86, var6, var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field4264[var12] = class156.field2677[var11 - var12 - 1];
                                    var4.field4265[var12] = class399.field6176[var11 - var12 - 1];
                                    var4.field4263[var12] = 1;
                                }
                                var4.field4267 = var11;
                            }
                        }
                    }
                    class267.method1893((byte) -126, true, var4);
                    int var13 = class189.method1521(var4, -32768);
                    class524.method3160((byte) -127, var4);
                    class266.method1886(class167.field2808, var4, class575.field8199, -118, var13);
                    class271.method1918(class167.field2808, -18546, var4);
                    class476.method2958(var4, (byte) -104);
                }
            }
        }
        if (class706.field9988 == 0 && class125.field2054 == 0) {
            if (class126.field2062 == 2) {
                class244.method1742(-127);
            } else {
                class661.method3794(-5922);
            }
            if (class675.field9521 >> 9 < 14 || (class275.field4426 - 14) <= (class675.field9521 >> 9) || (class412.field6318 >> 9) < 14 || class412.field6318 >> 9 >= class417.field6374 - 14) {
                class433.method2755((byte) -94);
            }
        }
        while (true) {
            class438 var14;
            class665 var15;
            class665 var16;
            do {
                var14 = (class438) class610.field8678.method3471(0);
                if (var14 == null) {
                    while (true) {
                        class438 var17;
                        class665 var18;
                        class665 var19;
                        do {
                            var17 = (class438) class97.field1548.method3471(0);
                            if (var17 == null) {
                                while (true) {
                                    class438 var20;
                                    class665 var21;
                                    class665 var22;
                                    do {
                                        var20 = (class438) class539.field7865.method3471(0);
                                        if (var20 == null) {
                                            if (class573.field8182 != null) {
                                                class262.method1863(-112);
                                            }
                                            if (class562.field8084 % 1500 == 0) {
                                                class184.method1494(true);
                                            }
                                            if (class682.field9564 == 7 && class706.field9988 == 0) {
                                                class310.method2125((byte) -91);
                                            }
                                            class193.method1531((byte) -44);
                                            int var23 = -15 % ((-arg0 - 8) / 38);
                                            if (class40.field565 && class488.field7153 < class112.method1033(-11752) - 60000L) {
                                                class651.method3757(true);
                                            }
                                            for (class126 var24 = (class126) class397.field6156.method2754((byte) -95); var24 != null; var24 = (class126) class397.field6156.method2759(1486415172)) {
                                                if ((long) var24.field2060 < class112.method1033(-11752) / 1000L - 5L) {
                                                    if (var24.field2065 > 0) {
                                                        class247.method1763("", "", var24.field2061 + class122.field1991.method1091(class135.field2206, 1), false, 0, 5, "");
                                                    }
                                                    if (var24.field2065 == 0) {
                                                        class247.method1763("", "", var24.field2061 + class122.field1992.method1091(class135.field2206, 1), false, 0, 5, "");
                                                    }
                                                    var24.method2648((byte) -25);
                                                }
                                            }
                                            if (class682.field9564 == 7 && class706.field9988 == 0) {
                                                if (class499.field7329 == null) {
                                                    class6.method63(0, false);
                                                    return;
                                                }
                                                class159.field2722++;
                                                if (class159.field2722 > 50) {
                                                    class162.field2743++;
                                                    class165 var25 = class271.method1917(class420.field6424, (byte) -94, class470.field6968);
                                                    class642.method3726(-684096285, var25);
                                                }
                                                try {
                                                    class132.method1151(0);
                                                    return;
                                                } catch (IOException var26) {
                                                    class6.method63(0, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field6677;
                                        if (var21.field9380 < 0) {
                                            break;
                                        }
                                        var22 = class326.method2197(false, var21.field9401);
                                    } while (var22 == null || var22.field9296 == null || var22.field9296.length <= var21.field9380 || var22.field9296[var21.field9380] != var21);
                                    class142.method1201(var20);
                                }
                            }
                            var18 = var17.field6677;
                            if (var18.field9380 < 0) {
                                break;
                            }
                            var19 = class326.method2197(false, var18.field9401);
                        } while (var19 == null || var19.field9296 == null || var19.field9296.length <= var18.field9380 || var19.field9296[var18.field9380] != var18);
                        class142.method1201(var17);
                    }
                }
                var15 = var14.field6677;
                if (var15.field9380 < 0) {
                    break;
                }
                var16 = class326.method2197(false, var15.field9401);
            } while (var16 == null || var16.field9296 == null || var16.field9296.length <= var15.field9380 || var16.field9296[var15.field9380] != var15);
            class142.method1201(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLpca;)V", line = 280)
    private static final void method1936(boolean arg0, class665 arg1) {
        field4431++;
        if (arg1.field9309 == 5 && arg1.field9354 != -1) {
            class107.method1013(-16777216, class627.field8857, arg1);
        }
        if (!arg0) {
            field4436 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 295)
    public final void method1937(int arg0) {
        field4429++;
        if (class497.field7259 == 2) {
            try {
                this.method1959(true);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class660.method3790(10216, var5, var5.getMessage() + " (Recovered) " + this.method1941(78));
                class265.method1878(0, -14473);
            }
        } else {
            this.method1959(true);
        }
        if (arg0 <= 101) {
            field4447 = -16;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lpca;)Lpca;", line = 321)
    public static final class665 method1938(class665 arg0) {
        int var1 = method1955(arg0).method738(123);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class326.method2197(false, arg0.field9401);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 340)
    public static final void method1939(int arg0) {
        field4443++;
        for (int var1 = 0; var1 < class288.field4579; var1++) {
            class48.field647[var1] = null;
        }
        class288.field4579 = 0;
        if (arg0 >= -30) {
            return;
        }
        for (int var2 = 0; var2 < class524.field7649; var2++) {
            for (int var42 = 0; var42 < class43.field597; var42++) {
                for (int var43 = 0; var43 < class541.field7896; var43++) {
                    class252 var44 = class454.field6818[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field4020 > 0) {
                            var44.field4020 = (short) (var44.field4020 * -1);
                        }
                        if (var44.field4032 > 0) {
                            var44.field4032 = (short) (var44.field4032 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class524.field7649; var3++) {
            for (int var4 = 0; var4 < class43.field597; var4++) {
                for (int var5 = 0; var5 < class541.field7896; var5++) {
                    class252 var6 = class454.field6818[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class454.field6818[0][var5][var4] != null && class454.field6818[0][var5][var4].field4030 != null;
                        if (var6.field4032 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class252 var12 = class454.field6818[var3][var5][var4 - 1];
                            int var13 = class491.field7187[var3].method479(var4, var5, -94);
                            while (var8 > 0 && var12 != null && var12.field4032 < 0 && var6.field4032 == var12.field4032 && var6.field4021 == var12.field4021 && class491.field7187[var3].method479(var8 - 1, var5, 33) == var13 && ((var8 - 1) <= 0 || class491.field7187[var3].method479(var8 - 2, var5, 125) == var13)) {
                                var8--;
                                var12 = class454.field6818[var3][var5][var8 - 1];
                            }
                            for (class252 var14 = class454.field6818[var3][var5][var4 + 1]; class541.field7896 > var9 && var14 != null && var14.field4032 < 0 && var6.field4032 == var14.field4032 && var6.field4021 == var14.field4021 && class491.field7187[var3].method479(var9 + 1, var5, 67) == var13 && (var9 + 1 >= class541.field7896 || class491.field7187[var3].method479(var9 + 2, var5, -118) == var13); var14 = class454.field6818[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            int var15 = var3 + 1 - var3;
                            int var16 = class491.field7187[var7 ? var3 + 1 : var3].method479(var8, var5, 111);
                            int var17 = var6.field4032 * var15 + var16;
                            int var18 = class491.field7187[var7 ? var3 + 1 : var3].method479(var9 + 1, var5, 115);
                            int var19 = var6.field4032 * var15 + var18;
                            int var20 = var5 << class439.field6699;
                            int var21 = var8 << class439.field6699;
                            int var22 = (var9 << class439.field6699) + class134.field2203;
                            class48.field647[class288.field4579++] = new class686(1, var3, var20 + var6.field4021, var6.field4021 + var20, var6.field4021 + var20, var6.field4021 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; var23 <= var11; var23++) {
                                for (int var24 = var8; var24 <= var9; var24++) {
                                    class454.field6818[var23][var5][var24].field4032 = (short) (class454.field6818[var23][var5][var24].field4032 * -1);
                                }
                            }
                        }
                        if (var6.field4020 < 0) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class252 var29 = class454.field6818[var3][var5 - 1][var4];
                            int var30 = class491.field7187[var3].method479(var4, var5, -112);
                            while (var25 > 0 && var29 != null && var29.field4020 < 0 && var6.field4020 == var29.field4020 && var6.field4033 == var29.field4033 && var30 == class491.field7187[var3].method479(var4, var25 - 1, 38) && ((var25 - 1) <= 0 || class491.field7187[var3].method479(var4, var25 - 2, -93) == var30)) {
                                var25--;
                                var29 = class454.field6818[var3][var25 - 1][var4];
                            }
                            for (class252 var31 = class454.field6818[var3][var5 + 1][var4]; class43.field597 > var26 && var31 != null && var31.field4020 < 0 && var6.field4020 == var31.field4020 && var6.field4033 == var31.field4033 && var30 == class491.field7187[var3].method479(var4, var26 + 1, -88) && (class43.field597 <= (var26 + 1) || var30 == class491.field7187[var3].method479(var4, var26 + 2, 46)); var31 = class454.field6818[var3][var26 + 1][var4]) {
                                var26++;
                            }
                            int var32 = var3 + 1 - var3;
                            int var33 = class491.field7187[var7 ? var3 + 1 : var3].method479(var4, var25, -120);
                            int var34 = var6.field4020 * var32 + var33;
                            int var35 = class491.field7187[var7 ? var3 + 1 : var3].method479(var4, var26 + 1, 32);
                            int var36 = var6.field4020 * var32 + var35;
                            int var37 = var25 << class439.field6699;
                            int var38 = (var26 << class439.field6699) + class134.field2203;
                            int var39 = var4 << class439.field6699;
                            class48.field647[class288.field4579++] = new class686(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 + var6.field4033, var6.field4033 + var39, var39 + var6.field4033, var6.field4033 + var39);
                            for (int var40 = var3; var40 <= var28; var40++) {
                                for (int var41 = var25; var41 <= var26; var41++) {
                                    class454.field6818[var40][var41][var4].field4020 = (short) (class454.field6818[var40][var41][var4].field4020 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class402.field6203 = true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 567)
    public final void method1940(int arg0) {
        field4435++;
        if (class527.field7699) {
            class204.field3324 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class48.method555(-769);
        class474.field7025 = new class605(class402.field6207);
        class683.field9586 = new class476();
        class374.method2464((byte) -124, new int[] { 20, 260 }, new int[] { 1000, 100 });
        if (class660.field9192 != class182.field3060) {
            class98.field1590 = new byte[50][];
        }
        class17.field282 = new class303(class402.field6207);
        if (class660.field9192 == class182.field3060) {
            class255.field4053.field6959 = this.getCodeBase().getHost();
        } else if (class339.method2325(class660.field9192, (byte) 74)) {
            class255.field4053.field6959 = this.getCodeBase().getHost();
            class255.field4053.field6960 = class255.field4053.field6971 + 40000;
            class464.field6931.field6960 = class464.field6931.field6971 + 40000;
            class623.field8794.field6960 = class623.field8794.field6971 + 40000;
            class255.field4053.field6966 = class255.field4053.field6971 + 50000;
            class464.field6931.field6966 = class464.field6931.field6971 + 50000;
            class623.field8794.field6966 = class623.field8794.field6971 + 50000;
        } else if (class660.field9192 == class31.field451) {
            class255.field4053.field6959 = "127.0.0.1";
            class464.field6931.field6959 = "127.0.0.1";
            class255.field4053.field6960 = class255.field4053.field6971 + 40000;
            class623.field8794.field6959 = "127.0.0.1";
            class464.field6931.field6960 = class464.field6931.field6971 + 40000;
            class623.field8794.field6960 = class623.field8794.field6971 + 40000;
            class255.field4053.field6966 = class255.field4053.field6971 + 50000;
            class464.field6931.field6966 = class464.field6931.field6971 + 50000;
            class623.field8794.field6966 = class623.field8794.field6971 + 50000;
        }
        if (class99.field1647 == class34.field500) {
            class11.field184 = 16777215;
            class159.field2705 = true;
            class376.field5859 = class165.field2768;
            class356.field5686 = class534.field7831;
            class22.field349 = 0;
        } else {
            class376.field5859 = class107.field1739;
            class356.field5686 = class266.field4331;
        }
        class221.field3591 = class255.field4053;
        class565.field8122 = class419.field6413 = class192.field3186 = class101.field1662 = new short[256];
        if (field4436 == class99.field1647) {
            class472.field6983 = false;
        }
        try {
            class614.field8723 = class157.field2684.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class83.field1024 = class455.method2861((byte) 86, class271.field4377);
        class464.field6929 = class225.method1655(class271.field4377, true, 82);
        try {
            if (class402.field6207.field7672 != null) {
                class527.field7691 = new class524(class402.field6207.field7672, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class342.field5534[var3] = new class524(class402.field6207.field7673[var3], 6000, 0);
                }
                class35.field507 = new class524(class402.field6207.field7652, 6000, 0);
                class281.field4505 = new class275(255, class527.field7691, class35.field507, 500000);
                class685.field9610 = new class524(class402.field6207.field7676, 24, 0);
                class402.field6207.field7676 = null;
                class402.field6207.field7672 = null;
                class402.field6207.field7652 = null;
                class402.field6207.field7673 = null;
            }
        } catch (IOException var5) {
            class35.field507 = null;
            class685.field9610 = null;
            class527.field7691 = null;
            class281.field4505 = null;
        }
        if (class660.field9192 != class182.field3060) {
            class217.field3567 = true;
        }
        if (field4436 == class99.field1647) {
            class673.field9487 = class122.field1967.method1091(class135.field2206, arg0 - 254);
        } else if (class99.field1647 == class34.field500) {
            class673.field9487 = class122.field1971.method1091(class135.field2206, 1);
        }
        if (arg0 != 255) {
            method1949(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)Ljava/lang/String;", line = 697)
    public final String method1941(int arg0) {
        field4434++;
        String var2 = null;
        try {
            var2 = "[1)" + class612.field8702 + "," + class626.field8855 + "," + class275.field4426 + "," + class417.field6374 + "|";
            if (class567.field8141 != null) {
                var2 = var2 + "2)" + class423.field6439 + "," + (class567.field8141.field4264[0] + class612.field8702) + "," + (class567.field8141.field4265[0] + class626.field8855) + "|";
            }
            var2 = var2 + "3)" + class497.field7259 + "|4)" + class17.field282.field4846 + "|5)" + class33.method452(2) + "|6)" + class56.field732 + "," + class259.field4147 + "|";
            var2 = var2 + "7)" + class17.field282.method2127(7525, class497.field7259) + "|";
            var2 = var2 + "8)" + class17.field282.method2133(true, class497.field7259) + "|";
            var2 = var2 + "9)" + class17.field282.field4853 + "|";
            var2 = var2 + "10)" + class17.field282.field4872 + "|";
            var2 = var2 + "11)" + class17.field282.field4891 + "|";
            var2 = var2 + "12)" + class17.field282.method2089(class497.field7259, -1) + "|";
            var2 = var2 + "13)" + class204.field3324 + "|";
            var2 = var2 + "14)" + class682.field9564;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var16) {
            }
            try {
                if (class497.field7259 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4448 == null ? (field4448 = method1961("client")) : field4448).getClassLoader());
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
                            } catch (Throwable var14) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var15) {
                        }
                    }
                }
            } catch (Throwable var17) {
            }
            int var13 = 19 / ((-arg0 - 26) / 63);
            var2 = var2 + "]";
        } catch (Throwable var18) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 784)
    public static void method1942(byte arg0) {
        if (arg0 <= 112) {
            field4445 = true;
        }
        field4436 = null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 796)
    private final void method1943(int arg0) {
        field4432++;
        if (arg0 <= -79) {
            boolean var2 = class683.field9586.method2948(-4);
            if (!var2) {
                this.method1960((byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lpca;IIIIIIIII)V", line = 815)
    public static final void method1944(class665[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class665 var11 = arg0[var10];
            if (var11 != null && var11.field9401 == arg1) {
                int var12 = var11.field9301 + arg6;
                int var13 = var11.field9402 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field9309 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field9411 + var12;
                    int var19 = var11.field9282 + var13;
                    if (var11.field9309 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field9309 == 0 || var11.field9422 || method1955(var11).field919 != 0 || class409.field6303 == var11 || class505.field7379 == var11.field9343 || class96.field1532 == var11.field9343) {
                    if (!method1949(var11)) {
                        if (class573.field8182 == var11 && class579.method3397(class573.field8182, (byte) 74) != null) {
                            class672.field9479 = true;
                            class102.field1691 = var12;
                            class105.field1705 = var13;
                        }
                        if (var11.field9330 || var14 < var16 && var15 < var17) {
                            if (var11.field9311 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class438 var20 = (class438) class539.field7865.method3465((byte) 127); var20 != null; var20 = (class438) class539.field7865.method3469(0)) {
                                    if (var20.field6681) {
                                        var20.method707((byte) -62);
                                        var20.field6677.field9287 = false;
                                    }
                                }
                                if (class406.field6259 == 0) {
                                    class573.field8182 = null;
                                    class409.field6303 = null;
                                }
                                class301.field4696 = 0;
                                class412.field6327 = false;
                                class38.field526 = false;
                                if (!class453.field6808) {
                                    class315.method2151((byte) 96);
                                }
                            }
                            boolean var21;
                            if (class464.field6929.method451(1196) >= var14 && class464.field6929.method454(-112) >= var15 && class464.field6929.method451(1196) < var16 && class464.field6929.method454(-121) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class145.field2450 && var21) {
                                if (var11.field9335 >= 0) {
                                    class250.field4003 = var11.field9335;
                                } else if (var11.field9311) {
                                    class250.field4003 = -1;
                                }
                            }
                            if (!class453.field6808 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class33.method450(arg8 - var12, var11, arg9 - var13, -127);
                            }
                            boolean var22 = false;
                            if (class464.field6929.method459(110) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class623 var24 = (class623) class655.field9149.method3465((byte) 108);
                            if (var24 != null && var24.method2594((byte) -42) == 0 && var24.method2600(25) >= var14 && var24.method2596(true) >= var15 && var24.method2600(25) < var16 && var24.method2596(true) < var17) {
                                var23 = true;
                            }
                            if (var11.field9271 != null && !class412.method2628(6246)) {
                                for (int var25 = 0; var25 < var11.field9271.length; var25++) {
                                    if (class83.field1024.method1515(var11.field9271[var25], 93)) {
                                        if (var11.field9358 == null || class562.field8084 >= var11.field9358[var25]) {
                                            byte var26 = var11.field9420[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class83.field1024.method1515(86, 55) && !class83.field1024.method1515(82, 122) && !class83.field1024.method1515(81, -128)) && ((var26 & 0x2) == 0 || class83.field1024.method1515(86, -101)) && ((var26 & 0x1) == 0 || class83.field1024.method1515(82, 61)) && ((var26 & 0x4) == 0 || class83.field1024.method1515(81, -117))) {
                                                if (var25 < 10) {
                                                    class277.method1981(-1, var11.field9400, -23301, "", var25 + 1);
                                                } else if (var25 == 10) {
                                                    class490.method3001((byte) 95);
                                                    class73 var27 = method1955(var11);
                                                    class529.method3205(var11, var27.method740(-25706), -256, var27.field921);
                                                    class523.field7609 = class67.method712(126, var11);
                                                    if (class523.field7609 == null) {
                                                        class523.field7609 = "Null";
                                                    }
                                                    class289.field4586 = var11.field9342 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field9382[var25];
                                                if (var11.field9358 == null) {
                                                    var11.field9358 = new int[var11.field9271.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field9358[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field9358[var25] = class562.field8084 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field9358 != null) {
                                        var11.field9358[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class703.method3966(0, var24.method2600(25) - var12, var11, var24.method2596(true) - var13);
                            }
                            if (class573.field8182 != null && class573.field8182 != var11 && var21 && method1955(var11).method743(-1)) {
                                class602.field8563 = var11;
                            }
                            if (class409.field6303 == var11) {
                                field4445 = true;
                                class66.field857 = var12;
                                class157.field2692 = var13;
                            }
                            if (var11.field9422 || var11.field9343 != 0) {
                                if (var21 && class259.field4142 != 0 && var11.field9291 != null) {
                                    class438 var29 = new class438();
                                    var29.field6681 = true;
                                    var29.field6677 = var11;
                                    var29.field6678 = class259.field4142;
                                    var29.field6684 = var11.field9291;
                                    class539.field7865.method3463((byte) -87, var29);
                                }
                                if (class573.field8182 != null || class453.field6808 || class434.field6598 != var11.field9343 && class301.field4696 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field9343 != 0) {
                                    if (class150.field2485 == var11.field9343 || class371.field5819 == var11.field9343) {
                                        class107.field1736 = var11;
                                        if (class581.field8273 != null) {
                                            class581.field8273.method1144(class627.field8857, var11.field9282, (byte) 80);
                                        }
                                        if (class150.field2485 == var11.field9343) {
                                            if (!class453.field6808 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class545.method3295((byte) 44, class627.field8857, arg9, arg8);
                                                for (class349 var30 = (class349) class490.field7162.method2754((byte) -103); var30 != null; var30 = (class349) class490.field7162.method2759(1486415172)) {
                                                    if (arg8 >= var30.field5581 && arg8 < var30.field5579 && arg9 >= var30.field5583 && arg9 < var30.field5585) {
                                                        class315.method2151((byte) 113);
                                                        class134.method1162((byte) -56, var30.field5582);
                                                    }
                                                }
                                            }
                                            class347.method2346(var13, var11, 0, var12);
                                            continue;
                                        }
                                    }
                                    if (class505.field7379 == var11.field9343) {
                                        if (var11.method3808(10492, class627.field8857) == null || class106.field1720 != 0 && class106.field1720 != 3 || class453.field6808 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field9355[var32];
                                        if (var31 < var33 || var31 > var11.field9406[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field9411 / 2;
                                        int var35 = var32 - var11.field9282 / 2;
                                        int var36;
                                        if (class126.field2062 == 4) {
                                            var36 = (int) class37.field514 & 0x3FFF;
                                        } else {
                                            var36 = (int) class37.field514 + class44.field616 & 0x3FFF;
                                        }
                                        int var37 = class567.field8139[var36];
                                        int var38 = class567.field8138[var36];
                                        if (class126.field2062 != 4) {
                                            var37 = (class64.field820 + 256) * var37 >> 8;
                                            var38 = (class64.field820 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class126.field2062 == 4) {
                                            var41 = (class664.field9238 >> 9) + (var39 >> 2);
                                            var42 = (class204.field3333 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class567.field8141.method1841(20744) - 1) * 256;
                                            var41 = (class567.field8141.field9696 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class567.field8141.field9705 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class145.field2450 && (class73.field918 & 0x40) != 0) {
                                            class665 var44 = class626.method3656(28613, class198.field3243, class517.field7498);
                                            if (var44 == null) {
                                                class490.method3001((byte) 101);
                                            } else {
                                                class652.method3758(var42, var11.field9354, class523.field7609, " ->", true, 15, false, false, 1L, var41, class558.field8067);
                                            }
                                            continue;
                                        }
                                        if (class99.field1647 == class34.field500) {
                                            class652.method3758(var42, -1, class122.field1999.method1091(class135.field2206, 1), "", true, 3, false, false, 1L, var41, -1);
                                        }
                                        class652.method3758(var42, -1, class22.field345, "", true, 6, false, false, 1L, var41, class250.field4004);
                                        continue;
                                    }
                                    if (class434.field6598 == var11.field9343) {
                                        class260.field4160 = var11;
                                        if (var21) {
                                            class412.field6327 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method2600(25) - var12 - var11.field9411 / 2) * 2.0D / (double) class378.field5877);
                                            int var46 = (int) (-((double) (var24.method2596(true) - var13 - var11.field9282 / 2) * 2.0D / (double) class378.field5877));
                                            int var47 = class528.field7705 + var45 + class378.field5901;
                                            int var48 = class97.field1570 + var46 + class378.field5902;
                                            class354 var49 = class507.method3083(55);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2375(var47, 112, var50, var48);
                                            if (var50 != null) {
                                                if (class83.field1024.method1515(82, -94) && class139.field2342 > 0) {
                                                    class432.method2747(var50[1], var50[2], var50[0], 95);
                                                    continue;
                                                }
                                                class38.field526 = true;
                                                class590.field8386 = var50[0];
                                                class416.field6369 = var50[1];
                                                class549.field7988 = var50[2];
                                            }
                                            class301.field4696 = 1;
                                            class239.field3789 = false;
                                            class589.field8375 = class464.field6929.method451(1196);
                                            class426.field6477 = class464.field6929.method454(-98);
                                            continue;
                                        }
                                        if (var22 && class301.field4696 > 0) {
                                            if (class301.field4696 == 1 && (class589.field8375 != class464.field6929.method451(1196) || class426.field6477 != class464.field6929.method454(-44))) {
                                                class299.field4654 = class528.field7705;
                                                class466.field6945 = class97.field1570;
                                                class301.field4696 = 2;
                                            }
                                            if (class301.field4696 == 2) {
                                                class239.field3789 = true;
                                                class484.method2974(-95, class299.field4654 + (int) ((double) (class589.field8375 - class464.field6929.method451(1196)) * 2.0D / (double) class378.field5884));
                                                class491.method3007(class466.field6945 - (int) ((double) (class426.field6477 - class464.field6929.method454(63)) * 2.0D / (double) class378.field5884), -1);
                                            }
                                            continue;
                                        }
                                        if (class301.field4696 > 0 && !class239.field3789) {
                                            if ((class14.field198 == 1 || class350.method2355(2544)) && class52.field693 > 2) {
                                                class130.method1134((byte) 35, class426.field6477, class589.field8375);
                                            } else if (class397.method2561(true)) {
                                                class130.method1134((byte) 35, class426.field6477, class589.field8375);
                                            }
                                        }
                                        class301.field4696 = 0;
                                        continue;
                                    }
                                    if (class428.field6525 == var11.field9343) {
                                        if (var22) {
                                            class325.method2191(var11.field9411, 1424, class464.field6929.method451(1196) - var12, var11.field9282, class464.field6929.method454(-32) - var13);
                                        }
                                        continue;
                                    }
                                    if (class96.field1532 == var11.field9343) {
                                        class155.method1290(var11, var12, var13, (byte) 47);
                                        continue;
                                    }
                                }
                                if (!var11.field9289 && var23) {
                                    var11.field9289 = true;
                                    if (var11.field9398 != null) {
                                        class438 var51 = new class438();
                                        var51.field6681 = true;
                                        var51.field6677 = var11;
                                        var51.field6670 = var24.method2600(25) - var12;
                                        var51.field6678 = var24.method2596(true) - var13;
                                        var51.field6684 = var11.field9398;
                                        class539.field7865.method3463((byte) -87, var51);
                                    }
                                }
                                if (var11.field9289 && var22 && var11.field9321 != null) {
                                    class438 var52 = new class438();
                                    var52.field6681 = true;
                                    var52.field6677 = var11;
                                    var52.field6670 = class464.field6929.method451(1196) - var12;
                                    var52.field6678 = class464.field6929.method454(96) - var13;
                                    var52.field6684 = var11.field9321;
                                    class539.field7865.method3463((byte) -87, var52);
                                }
                                if (var11.field9289 && !var22) {
                                    var11.field9289 = false;
                                    if (var11.field9333 != null) {
                                        class438 var53 = new class438();
                                        var53.field6681 = true;
                                        var53.field6677 = var11;
                                        var53.field6670 = class464.field6929.method451(1196) - var12;
                                        var53.field6678 = class464.field6929.method454(-70) - var13;
                                        var53.field6684 = var11.field9333;
                                        class97.field1548.method3463((byte) -87, var53);
                                    }
                                }
                                if (var22 && var11.field9360 != null) {
                                    class438 var54 = new class438();
                                    var54.field6681 = true;
                                    var54.field6677 = var11;
                                    var54.field6670 = class464.field6929.method451(1196) - var12;
                                    var54.field6678 = class464.field6929.method454(-86) - var13;
                                    var54.field6684 = var11.field9360;
                                    class539.field7865.method3463((byte) -87, var54);
                                }
                                if (!var11.field9287 && var21) {
                                    var11.field9287 = true;
                                    if (var11.field9283 != null) {
                                        class438 var55 = new class438();
                                        var55.field6681 = true;
                                        var55.field6677 = var11;
                                        var55.field6670 = class464.field6929.method451(1196) - var12;
                                        var55.field6678 = class464.field6929.method454(93) - var13;
                                        var55.field6684 = var11.field9283;
                                        class539.field7865.method3463((byte) -87, var55);
                                    }
                                }
                                if (var11.field9287 && var21 && var11.field9357 != null) {
                                    class438 var56 = new class438();
                                    var56.field6681 = true;
                                    var56.field6677 = var11;
                                    var56.field6670 = class464.field6929.method451(1196) - var12;
                                    var56.field6678 = class464.field6929.method454(85) - var13;
                                    var56.field6684 = var11.field9357;
                                    class539.field7865.method3463((byte) -87, var56);
                                }
                                if (var11.field9287 && !var21) {
                                    var11.field9287 = false;
                                    if (var11.field9425 != null) {
                                        class438 var57 = new class438();
                                        var57.field6681 = true;
                                        var57.field6677 = var11;
                                        var57.field6670 = class464.field6929.method451(1196) - var12;
                                        var57.field6678 = class464.field6929.method454(-40) - var13;
                                        var57.field6684 = var11.field9425;
                                        class97.field1548.method3463((byte) -87, var57);
                                    }
                                }
                                if (var11.field9258 != null) {
                                    class438 var58 = new class438();
                                    var58.field6677 = var11;
                                    var58.field6684 = var11.field9258;
                                    class610.field8678.method3463((byte) -87, var58);
                                }
                                if (var11.field9404 != null && class282.field4517 > var11.field9322) {
                                    if (var11.field9312 == null || class282.field4517 - var11.field9322 > 32) {
                                        class438 var63 = new class438();
                                        var63.field6677 = var11;
                                        var63.field6684 = var11.field9404;
                                        class539.field7865.method3463((byte) -87, var63);
                                    } else {
                                        label696: for (int var59 = var11.field9322; var59 < class282.field4517; var59++) {
                                            int var60 = class277.field4484[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field9312.length; var61++) {
                                                if (var11.field9312[var61] == var60) {
                                                    class438 var62 = new class438();
                                                    var62.field6677 = var11;
                                                    var62.field6684 = var11.field9404;
                                                    class539.field7865.method3463((byte) -87, var62);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field9322 = class282.field4517;
                                }
                                if (var11.field9313 != null && class409.field6304 > var11.field9336) {
                                    if (var11.field9325 == null || class409.field6304 - var11.field9336 > 32) {
                                        class438 var68 = new class438();
                                        var68.field6677 = var11;
                                        var68.field6684 = var11.field9313;
                                        class539.field7865.method3463((byte) -87, var68);
                                    } else {
                                        label672: for (int var64 = var11.field9336; var64 < class409.field6304; var64++) {
                                            int var65 = class588.field8349[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field9325.length; var66++) {
                                                if (var11.field9325[var66] == var65) {
                                                    class438 var67 = new class438();
                                                    var67.field6677 = var11;
                                                    var67.field6684 = var11.field9313;
                                                    class539.field7865.method3463((byte) -87, var67);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field9336 = class409.field6304;
                                }
                                if (var11.field9326 != null && class403.field6230 > var11.field9267) {
                                    if (var11.field9399 == null || class403.field6230 - var11.field9267 > 32) {
                                        class438 var73 = new class438();
                                        var73.field6677 = var11;
                                        var73.field6684 = var11.field9326;
                                        class539.field7865.method3463((byte) -87, var73);
                                    } else {
                                        label648: for (int var69 = var11.field9267; var69 < class403.field6230; var69++) {
                                            int var70 = class656.field9160[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field9399.length; var71++) {
                                                if (var11.field9399[var71] == var70) {
                                                    class438 var72 = new class438();
                                                    var72.field6677 = var11;
                                                    var72.field6684 = var11.field9326;
                                                    class539.field7865.method3463((byte) -87, var72);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field9267 = class403.field6230;
                                }
                                if (var11.field9346 != null && class529.field7710 > var11.field9370) {
                                    if (var11.field9257 == null || class529.field7710 - var11.field9370 > 32) {
                                        class438 var78 = new class438();
                                        var78.field6677 = var11;
                                        var78.field6684 = var11.field9346;
                                        class539.field7865.method3463((byte) -87, var78);
                                    } else {
                                        label624: for (int var74 = var11.field9370; var74 < class529.field7710; var74++) {
                                            int var75 = class356.field5689[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field9257.length; var76++) {
                                                if (var11.field9257[var76] == var75) {
                                                    class438 var77 = new class438();
                                                    var77.field6677 = var11;
                                                    var77.field6684 = var11.field9346;
                                                    class539.field7865.method3463((byte) -87, var77);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field9370 = class529.field7710;
                                }
                                if (var11.field9324 != null && class310.field4874 > var11.field9298) {
                                    if (var11.field9314 == null || class310.field4874 - var11.field9298 > 32) {
                                        class438 var83 = new class438();
                                        var83.field6677 = var11;
                                        var83.field6684 = var11.field9324;
                                        class539.field7865.method3463((byte) -87, var83);
                                    } else {
                                        label600: for (int var79 = var11.field9298; var79 < class310.field4874; var79++) {
                                            int var80 = class562.field8090[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field9314.length; var81++) {
                                                if (var11.field9314[var81] == var80) {
                                                    class438 var82 = new class438();
                                                    var82.field6677 = var11;
                                                    var82.field6684 = var11.field9324;
                                                    class539.field7865.method3463((byte) -87, var82);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field9298 = class310.field4874;
                                }
                                if (class78.field992 > var11.field9319 && var11.field9368 != null) {
                                    class438 var84 = new class438();
                                    var84.field6677 = var11;
                                    var84.field6684 = var11.field9368;
                                    class539.field7865.method3463((byte) -87, var84);
                                }
                                if (class292.field4608 > var11.field9319 && var11.field9294 != null) {
                                    class438 var85 = new class438();
                                    var85.field6677 = var11;
                                    var85.field6684 = var11.field9294;
                                    class539.field7865.method3463((byte) -87, var85);
                                }
                                if (class122.field2036 > var11.field9319 && var11.field9345 != null) {
                                    class438 var86 = new class438();
                                    var86.field6677 = var11;
                                    var86.field6684 = var11.field9345;
                                    class539.field7865.method3463((byte) -87, var86);
                                }
                                if (class644.field9059 > var11.field9319 && var11.field9372 != null) {
                                    class438 var87 = new class438();
                                    var87.field6677 = var11;
                                    var87.field6684 = var11.field9372;
                                    class539.field7865.method3463((byte) -87, var87);
                                }
                                if (class158.field2701 > var11.field9319 && var11.field9384 != null) {
                                    class438 var88 = new class438();
                                    var88.field6677 = var11;
                                    var88.field6684 = var11.field9384;
                                    class539.field7865.method3463((byte) -87, var88);
                                }
                                var11.field9319 = class79.field997;
                                if (var11.field9277 != null) {
                                    for (int var89 = 0; var89 < class345.field5560; var89++) {
                                        class438 var90 = new class438();
                                        var90.field6677 = var11;
                                        var90.field6680 = class365.field5738[var89].method2053(4006);
                                        var90.field6674 = class365.field5738[var89].method2051((byte) 104);
                                        var90.field6684 = var11.field9277;
                                        class539.field7865.method3463((byte) -87, var90);
                                    }
                                }
                                if (class67.field860 && var11.field9286 != null) {
                                    class438 var91 = new class438();
                                    var91.field6677 = var11;
                                    var91.field6684 = var11.field9286;
                                    class539.field7865.method3463((byte) -87, var91);
                                }
                            }
                            if (var11.field9309 == 5 && var11.field9396 != -1) {
                                var11.method3812(-1552, class275.field4412, class254.field4046).method1144(class627.field8857, var11.field9282, (byte) 80);
                            }
                            method1936(true, var11);
                            if (var11.field9309 == 0) {
                                method1944(arg0, var11.field9400, var14, var15, var16, var17, var12 - var11.field9393, var13 - var11.field9394, arg8, arg9);
                                if (var11.field9296 != null) {
                                    method1944(var11.field9296, var11.field9400, var14, var15, var16, var17, var12 - var11.field9393, var13 - var11.field9394, arg8, arg9);
                                }
                                class102 var92 = (class102) class486.field7115.method1558((long) var11.field9400, (byte) -93);
                                if (var92 != null) {
                                    if (field4436 == class99.field1647 && var92.field1689 == 0 && !class453.field6808 && var21 && !class518.field7505) {
                                        class315.method2151((byte) -95);
                                    }
                                    class244.method1743((byte) -113, arg8, var15, var17, var16, var14, var12, var92.field1687, var13, arg9);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    method1936(true, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1717)
    public final void method1945(int arg0) {
        field4427++;
        if (class497.field7259 != arg0) {
            this.method1953(-104);
            return;
        }
        try {
            this.method1953(arg0 + 43);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class660.method3790(10216, var5, var5.getMessage() + " (Recovered) " + this.method1941(66));
            class265.method1878(0, -14473);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1740)
    public final synchronized void method1946(boolean arg0) {
        field4428++;
        if (class450.field6772 != null && class271.field4377 == null && !class402.field6207.field7677) {
            try {
                Class var2 = class450.field6772.getClass();
                Field var3 = var2.getDeclaredField("canvas");
                class271.field4377 = (Canvas) var3.get(class450.field6772);
                var3.set(class450.field6772, null);
                if (class271.field4377 != null) {
                    return;
                }
            } catch (Exception var4) {
            }
        }
        super.method1946(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1770)
    public static final void method1947() {
        for (int var0 = 0; var0 < class275.field4426; var0++) {
            int[] var1 = class139.field2345[var0];
            for (int var2 = 0; var2 < class417.field6374; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1788)
    public static final void method1948() {
        int var0 = class99.field1607;
        int[] var1 = class359.field5700;
        boolean var2 = class17.field282.field4849 == 1 && var0 > 200 || class17.field282.field4849 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class304 var13 = class597.field8465[var1[var3]];
            if (!var13.method2106(160)) {
                var13.field4187 = -1;
            } else if (var13.field4760) {
                var13.field4187 = -1;
            } else {
                var13.method960(true);
                if (var13.field6865 >= 0 && var13.field6869 >= 0 && var13.field6870 < class275.field4426 && var13.field6871 < class417.field6374) {
                    var13.field4749 = var13.field4217 ? var2 : false;
                    if (class567.field8141 == var13) {
                        var13.field4187 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field4180) {
                            var14++;
                        }
                        if (var13.field4190 > class562.field8084) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method1841(20744) << 2);
                        if (var13.field4758) {
                            var15 += 512;
                        } else {
                            if (class240.field3802 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field4187 = var15 + 1;
                    }
                } else {
                    var13.field4187 = -1;
                }
            }
        }
        for (int var4 = 0; var4 < class283.field4523; var4++) {
            class589 var10 = ((class348) class592.field8395.method1558((long) class102.field1690[var4], (byte) -93)).field5577;
            if (var10.method3446(160) && var10.field8354.method3974(class539.field7869, -28159)) {
                var10.method960(true);
                if (var10.field6865 >= 0 && var10.field6869 >= 0 && var10.field6870 < class275.field4426 && var10.field6871 < class417.field6374) {
                    int var11 = 0;
                    if (!var10.field4180) {
                        var11++;
                    }
                    if (var10.field4190 > class562.field8084) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method1841(20744) << 2);
                    if (class240.field3802 == 0) {
                        if (var10.field8354.field9934) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class240.field3802 == 1) {
                        if (var10.field8354.field9934) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field8354.field9930) {
                        var12 += 1024;
                    } else if (!var10.field8354.field9967) {
                        var12 += 256;
                    }
                    var10.field4187 = var12 + 1;
                } else {
                    var10.field4187 = -1;
                }
            } else {
                var10.field4187 = -1;
            }
        }
        for (int var5 = 0; var5 < class472.field6987.length; var5++) {
            class515 var6 = class472.field6987[var5];
            if (var6 != null) {
                if (var6.field7483 == 1) {
                    class348 var7 = (class348) class592.field8395.method1558((long) var6.field7485, (byte) -93);
                    if (var7 != null) {
                        class589 var8 = var7.field5577;
                        if (var8.field4187 >= 0) {
                            var8.field4187 += 2048;
                        }
                    }
                } else if (var6.field7483 == 10) {
                    class304 var9 = class597.field8465[var6.field7485];
                    if (var9 != null && class567.field8141 != var9 && var9.field4187 >= 0) {
                        var9.field4187 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lpca;)Z", line = 1958)
    public static final boolean method1949(class665 arg0) {
        if (class518.field7505) {
            if (method1955(arg0).field919 != 0) {
                return false;
            }
            if (arg0.field9309 == 0) {
                return false;
            }
        }
        return arg0.field9363;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1972)
    public static final void method1950() {
        int var0 = class99.field1607;
        int[] var1 = class359.field5700;
        int var2 = class354.field5656 ? var0 : class283.field4523 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class260 var4;
            if (var3 < var0) {
                var4 = class597.field8465[var1[var3]];
            } else {
                var4 = ((class348) class592.field8395.method1558((long) class102.field1690[var3 - var0], (byte) -93)).field5577;
            }
            if (var4.field4187 >= 0) {
                int var5 = var4.method1841(20744);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field9696 & 0x1FF) == 0 && (var4.field9705 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field9696 & 0x1FF) == 256 && (var4.field9705 & 0x1FF) == 256) {
                    continue;
                }
                var4.field9701 = class202.method1568(var4.field9696, var4.field9695, var4.field9705, 2);
                class259.method1830(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2014)
    public static final void method1951(int arg0) {
        int var1 = class99.field1607;
        int[] var2 = class359.field5700;
        for (int var3 = 0; var3 < class283.field4523 + var1; var3++) {
            class260 var4;
            if (var3 < var1) {
                var4 = class597.field8465[var2[var3]];
            } else {
                var4 = ((class348) class592.field8395.method1558((long) class102.field1690[var3 - var1], (byte) -93)).field5577;
            }
            if (var4.field9695 == arg0 && var4.field4187 >= 0) {
                int var5 = var4.method1841(20744);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field9696 & 0x1FF) != 0 || (var4.field9705 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field9696 & 0x1FF) != 256 || (var4.field9705 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field9696 >> 9;
                    int var7 = var4.field9705 >> 9;
                    if (var4.field4187 > class139.field2345[var6][var7]) {
                        class139.field2345[var6][var7] = var4.field4187;
                        class17.field280[var6][var7] = 1;
                    } else if (class139.field2345[var6][var7] == var4.field4187) {
                        var10002 = class17.field280[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field9696 - var8 >> 9;
                    int var10 = var4.field9705 - var8 >> 9;
                    int var11 = var4.field9696 + var8 >> 9;
                    int var12 = var4.field9705 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field4187 > class139.field2345[var13][var14]) {
                                class139.field2345[var13][var14] = var4.field4187;
                                class17.field280[var13][var14] = 1;
                            } else if (class139.field2345[var13][var14] == var4.field4187) {
                                var10002 = class17.field280[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2112)
    public static final void method1952(int arg0) {
        int var1 = class99.field1607;
        int[] var2 = class359.field5700;
        int var3 = class354.field5656 ? var1 : class283.field4523 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class260 var5;
            if (var4 < var1) {
                var5 = class597.field8465[var2[var4]];
            } else {
                var5 = ((class348) class592.field8395.method1558((long) class102.field1690[var4 - var1], (byte) -93)).field5577;
            }
            if (var5.field9695 == arg0) {
                var5.field4161 = 0;
                if (var5.field4187 < 0) {
                    var5.field4180 = false;
                } else {
                    int var6 = var5.method1841(20744);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field9696 & 0x1FF) != 0 || (var5.field9705 & 0x1FF) != 0) {
                            var5.field4180 = false;
                            continue;
                        }
                    } else if ((var5.field9696 & 0x1FF) != 256 || (var5.field9705 & 0x1FF) != 256) {
                        var5.field4180 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field9696 >> 9;
                        int var8 = var5.field9705 >> 9;
                        if (class139.field2345[var7][var8] != var5.field4187) {
                            var5.field4180 = true;
                            continue;
                        }
                        if (class17.field280[var7][var8] > 1) {
                            var10002 = class17.field280[var7][var8]--;
                            var5.field4180 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field9696 - var9 >> 9;
                        int var11 = var5.field9705 - var9 >> 9;
                        int var12 = var5.field9696 + var9 >> 9;
                        int var13 = var5.field9705 + var9 >> 9;
                        if (!class295.method2062(var5.field4187, true, var13, var12, var11, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class139.field2345[var14][var15] == var5.field4187) {
                                        var10002 = class17.field280[var14][var15]--;
                                    }
                                }
                            }
                            var5.field4180 = true;
                            continue;
                        }
                    }
                    var5.field4180 = false;
                    var5.field9701 = class202.method1568(var5.field9696, var5.field9695, var5.field9705, 2);
                    class259.method1830(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2226)
    private final void method1953(int arg0) {
        field4440++;
        if (class682.field9564 == 14) {
            return;
        }
        long var2 = class240.method1729((byte) -46) / 1000000L - class247.field3938;
        class247.field3938 = class240.method1729((byte) -46) / 1000000L;
        boolean var4 = class24.method399((byte) -79);
        if (var4 && class659.field9185 && class78.field996 != null) {
            class78.field996.method1753(false);
        }
        if (class649.method3742(class682.field9564, -64)) {
            if (class588.field8352 != 0L && class112.method1033(-11752) > class588.field8352) {
                class356.method2392(false, -98, class17.field282.field4896, class33.method452(2), class17.field282.field4857);
            } else if (!class627.field8857.method261() && class335.field5479) {
                class507.method3079(2);
            }
        }
        if (class476.field7061 == null) {
            Container var5;
            if (class598.field8470 != null) {
                var5 = class598.field8470;
            } else if (class450.field6772 == null) {
                var5 = class64.field825;
            } else {
                var5 = class450.field6772;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class598.field8470 == var5) {
                Insets var8 = class598.field8470.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class235.field3727 != var6 || class101.field1659 != var7 || class311.field4901) {
                if (class627.field8857 == null || class627.field8857.method355()) {
                    class48.method555(-769);
                } else {
                    class235.field3727 = var6;
                    class101.field1659 = var7;
                }
                class588.field8352 = class112.method1033(-11752) + 500L;
                class311.field4901 = false;
            }
        }
        if (class476.field7061 != null && !class437.field6669 && class649.method3742(class682.field9564, -67)) {
            class356.method2392(false, -122, -1, class17.field282.field4865, -1);
        }
        boolean var9 = false;
        if (class245.field3910) {
            var9 = true;
            class245.field3910 = false;
        }
        if (var9) {
            class502.method3057(-9629);
        }
        if (class627.field8857 != null && class627.field8857.method261() || class33.method452(2) != 1) {
            class211.method1601(-20030);
        }
        if (class327.method2206(class682.field9564, (byte) 74)) {
            class364.method2420(119, var9);
        } else if (class609.method3545(-29131, class682.field9564)) {
            class528.method3199(0);
        } else if (class564.method3343(class682.field9564, 26314)) {
            class528.method3199(0);
        } else if (class255.method1804(-5737, class682.field9564)) {
            if (class51.field689 == 1) {
                if (class402.field6206 < class533.field7756) {
                    class402.field6206 = class533.field7756;
                }
                int var11 = (class402.field6206 - class533.field7756) * 50 / class402.field6206;
                class420.method2683(class573.field8183, -31593, class122.field1984.method1091(class135.field2206, 1) + "<br>(" + var11 + "%)", class627.field8857, class125.field2057, true);
            } else if (class51.field689 == 2) {
                if (class6.field80 > class112.field1781) {
                    class112.field1781 = class6.field80;
                }
                int var10 = ((class112.field1781 - class6.field80) * 50 / class112.field1781) + 50;
                class420.method2683(class573.field8183, -31593, class122.field1984.method1091(class135.field2206, 1) + "<br>(" + var10 + "%)", class627.field8857, class125.field2057, true);
            } else {
                class420.method2683(class573.field8183, -31593, class122.field1984.method1091(class135.field2206, 1), class627.field8857, class125.field2057, true);
            }
        } else if (class682.field9564 == 10) {
            class609.method3543(var2, (byte) 58);
        } else if (class682.field9564 == 13) {
            class420.method2683(class573.field8183, -31593, class122.field1986.method1091(class135.field2206, 1) + "<br>" + class122.field1987.method1091(class135.field2206, 1), class627.field8857, class125.field2057, false);
        }
        int var12 = -122 / ((-arg0 - 32) / 44);
        if (class150.field2483 == 3) {
            for (int var13 = 0; var13 < class700.field9880; var13++) {
                Rectangle var14 = class462.field6896[var13];
                if (class476.field7053[var13]) {
                    class627.field8857.method1355(var14.y, var14.x, var14.height, var14.width, -1996553985, 1);
                } else if (class185.field3111[var13]) {
                    class627.field8857.method1355(var14.y, var14.x, var14.height, var14.width, -1996554240, 1);
                }
            }
        }
        if (class412.method2628(6246)) {
            class105.method998((byte) 127, class627.field8857);
        }
        if (class402.field6207.field7677 && class649.method3742(class682.field9564, -105) && class150.field2483 == 0 && class33.method452(2) == 1 && !var9) {
            int var15 = 0;
            for (int var16 = 0; var16 < class700.field9880; var16++) {
                if (class185.field3111[var16]) {
                    class185.field3111[var16] = false;
                    class415.field6362[var15++] = class462.field6896[var16];
                }
            }
            try {
                class627.field8857.method103(class415.field6362, var15);
            } catch (class529 var20) {
            }
        } else if (!class327.method2206(class682.field9564, (byte) 81)) {
            for (int var17 = 0; var17 < class700.field9880; var17++) {
                class185.field3111[var17] = false;
            }
            try {
                class627.field8857.method122();
            } catch (class529 var19) {
                class660.method3790(10216, var19, var19.getMessage() + " (Recovered) " + this.method1941(48));
                class265.method1878(0, -14473);
            }
        }
        if (class17.field282.field4854 == 0) {
            class549.method3313(15L, 126);
        } else if (class17.field282.field4854 == 1) {
            class549.method3313(10L, 125);
        } else if (class17.field282.field4854 == 2) {
            class549.method3313(5L, 126);
        } else if (class17.field282.field4854 == 3) {
            class549.method3313(2L, 125);
        }
        if (class6.field75) {
            class685.method3894((byte) 123);
        }
        if (class17.field282.field4897 && class682.field9564 == 3 && class528.field7706 != -1) {
            class17.field282.field4897 = false;
            class17.field282.method2094(false, class402.field6207);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2473)
    public final void method1954(int arg0) {
        field4433++;
        if (class40.field565) {
            class651.method3757(true);
        }
        class499.method3045(-10256);
        if (class627.field8857 != null) {
            class627.field8857.method1349(arg0 ^ 0xFFFFFFFC);
        }
        if (class476.field7061 != null) {
            class405.method2595(class402.field6207, 2, class476.field7061);
            class476.field7061 = null;
        }
        if (class499.field7329 != null) {
            class499.field7329.method588(24331);
            class499.field7329 = null;
        }
        class250.method1783((byte) 73);
        class683.field9586.method2962((byte) -94);
        class474.field7025.method3519(-54);
        if (class217.field3566 != null) {
            class217.field3566.method1509(115);
            class217.field3566 = null;
        }
        try {
            if (arg0 != -3) {
                this.method1959(false);
            }
            class527.field7691.method3161(127);
            for (int var2 = 0; var2 < 35; var2++) {
                class342.field5534[var2].method3161(119);
            }
            class35.field507.method3161(arg0 + 127);
            class685.field9610.method3161(arg0 + 123);
            class622.method3609(arg0 + 55);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2528)
    public static final void main(String[] arg0) {
        field4441++;
        try {
            if (arg0.length != 6) {
                class373.method2452("Argument count", -3206);
            }
            class255.field4053 = new class470();
            class255.field4053.field6971 = Integer.parseInt(arg0[0]);
            class464.field6931 = new class470();
            class464.field6931.field6971 = Integer.parseInt(arg0[1]);
            class623.field8794 = new class470();
            class623.field8794.field6971 = Integer.parseInt(arg0[2]);
            class660.field9192 = class31.field451;
            if (arg0[3].equals("live")) {
                class66.field858 = class159.field2715;
            } else if (arg0[3].equals("rc")) {
                class66.field858 = class499.field7326;
            } else if (arg0[3].equals("wip")) {
                class66.field858 = class629.field8875;
            } else {
                class373.method2452("modewhat", -3206);
            }
            class135.field2206 = class684.method3889((byte) 112, arg0[4]);
            if (class135.field2206 == -1) {
                if (arg0[4].equals("english")) {
                    class135.field2206 = 0;
                } else if (arg0[4].equals("german")) {
                    class135.field2206 = 1;
                } else {
                    class373.method2452("language", -3206);
                }
            }
            class615.field8740 = false;
            class184.field3108 = false;
            if (arg0[5].equals("game0")) {
                class99.field1647 = field4436;
            } else if (arg0[5].equals("game1")) {
                class99.field1647 = class34.field500;
            } else {
                class373.method2452("game", -3206);
            }
            class464.field6930 = 0;
            class234.field3704 = null;
            class548.field7976 = false;
            class375.field5855 = 0;
            class154.field2630 = null;
            class677.field9526 = class99.field1647.field2742;
            class73.field920 = 0L;
            class368.field5762 = true;
            class303.field4715 = true;
            class98.field1592 = "";
            class527.field7699 = false;
            class611.field8698 = 0;
            client var1 = new client();
            class157.field2684 = var1;
            var1.method3486(1024, false, false, 625, 35, class66.field858.method3058((byte) 18) + 32, class99.field1647.field2741, 768);
            class598.field8470.setLocation(40, 40);
        } catch (Exception var3) {
            class660.method3790(10216, var3, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lpca;)Lgv;", line = 2613)
    public static final class73 method1955(class665 arg0) {
        class73 var1 = (class73) class122.field2037.method1558(((long) arg0.field9400 << 32) + (long) arg0.field9380, (byte) -93);
        return var1 == null ? arg0.field9280 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 2624)
    private final void method1956(byte arg0, int arg1) {
        class106.field1731 = null;
        class192.field3183 = 0;
        class683.field9586.field7068 = arg1;
        field4439++;
        if (arg0 != -62) {
            method1958();
        }
        class683.field9586.field7066++;
        class197.field3237 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 2639)
    public final void method1957(byte arg0) {
        method1942((byte) 119);
        field4430++;
        class218.method1628(0);
        class643.method3730(117);
        class413.method2630((byte) -31);
        class122.method1094(15);
        class591.method3448(27);
        class520.method3134(107);
        class542.method3283(-36);
        class96.method910(0);
        class101.method973((byte) -36);
        class98.method954(-240);
        class66.method709(3000000);
        class283.method2014(0);
        class200.method1557((byte) -55);
        class598.method3490((byte) 101);
        class464.method2897(0);
        class502.method3056(55);
        class501.method3052(1);
        class162.method1322((byte) -62);
        class393.method2547(2478);
        class167.method1352(6614);
        class606.method3531(128);
        class515.method3120(-19410);
        class650.method3745(-27312);
        class610.method3551(true);
        class476.method2956(true);
        class605.method3524(-3);
        class611.method3558(false);
        class487.method2987(-2730);
        class97.method918(-22387);
        class524.method3157((byte) -122);
        class275.method1932(65000);
        class49.method558(122);
        class419.method2679((byte) 105);
        class255.method1808(false);
        class500.method3051(0);
        class74.method745((byte) -23);
        class3.method12(109);
        class374.method2463(19850);
        class474.method2941((byte) -110);
        class412.method2623(255);
        class7.method99(69);
        class266.method1883(122);
        class533.method3225((byte) 17);
        class454.method2854((byte) 126);
        class613.method3570(-122);
        class458.method2873((byte) -80);
        class170.method1406(101);
        class618.method3592(55);
        class634.method3681(1);
        class390.method2531((byte) 29);
        class343.method2334(72);
        class347.method2347(-129);
        class70.method717(1);
        class514.method3119(79);
        class437.method2772(31210);
        class703.method3967((byte) -7);
        class348.method2351(4642);
        class53.method595(5);
        class46.method549(297715426);
        class580.method3400(false);
        class158.method1302(255);
        class187.method1506(-102);
        class567.method3357(122);
        class23.method381(4096);
        class184.method1493((byte) -49);
        class354.method2382((byte) -111);
        class595.method3476((byte) -115);
        class132.method1146(16903);
        class665.method3807((byte) 93);
        class615.method3584(true);
        class304.method2103(25341);
        class116.method1044((byte) -17);
        class221.method1636((byte) -92);
        class83.method782((byte) 125);
        class6.method27((byte) -13);
        class165.method1334((byte) -33);
        class260.method1851((byte) -108);
        class252.method1794(-122);
        class328.method2210((byte) -121);
        class640.method3714(true);
        class559.method3331((byte) 126);
        class589.method3444((byte) 101);
        class102.method982(99);
        class434.method2762((byte) 55);
        class472.method2925(192);
        class453.method2845((byte) -55);
        class416.method2647(109);
        class505.method3062(-96);
        class253.method1796(91);
        class246.method1755(-9909);
        class429.method2719(0);
        class135.method1165((byte) 118);
        class470.method2921((byte) 115);
        class666.method3825((byte) 35);
        class581.method3410((byte) -72);
        class381.method2499(0);
        class338.method2316(12412);
        class310.method2129((byte) -31);
        class144.method1226(12);
        class675.method3862(false);
        class428.method2715((byte) 118);
        class55.method616(0);
        class422.method2688(0);
        class491.method3004((byte) -56);
        class654.method3768(777538440);
        class2.method8((byte) 126);
        class698.method3929(false);
        class534.method3241(-14774);
        class564.method3344((byte) 65);
        class37.method478(1);
        class418.method2664(4);
        class441.method2784(-112);
        class530.method3206((byte) -127);
        class529.method3203(true);
        class493.method3010(-31978);
        class632.method3679(true);
        class674.method3855((byte) -11);
        class459.method2877(88);
        class692.method3917(83);
        class16.method224((byte) 60);
        class245.method1749(true);
        class678.method3872(42);
        class294.method2058((byte) 89);
        class271.method1915((byte) -87);
        class342.method2333(0);
        class687.method3898((byte) -122);
        class326.method2196(2);
        class364.method2419((byte) -62);
        class47.method550(2);
        class668.method3830(33);
        class67.method710(95);
        class286.method2034(16);
        class538.method3269(8867);
        class216.method1619(19676);
        class35.method466(5);
        class685.method3891((byte) -127);
        class25.method418(-15847);
        class378.method2492();
        class473.method2927(6429);
        class100.method969(true);
        class667.method3827(111);
        class262.method1860(127);
        class300.method2075(81);
        class582.method3414(-126);
        class528.method3198(0);
        class254.method1802((byte) -25);
        class395.method2553(117);
        class334.method2312(30058);
        class236.method1703(-11142);
        class536.method3255();
        class642.method3725(119);
        class220.method1633(97);
        class599.method3498(-16902);
        class442.method2793(-21325);
        class238.method1714(false);
        class579.method3396(1);
        class142.method1209();
        class517.method3126(59);
        class174.method1417((byte) -119);
        class628.method3661(8);
        class82.method773();
        class257.method1817(126);
        class489.method2995(-19975);
        class644.method3733(false);
        class566.method3350(73);
        class706.method3986((byte) -24);
        class438.method2776(-14689);
        class307.method2121(1);
        class417.method2650(false);
        class365.method2423(true);
        class48.method554(-15415);
        class691.method3915((byte) -123);
        class263.method1873(2048);
        class367.method2430(0);
        class539.method3271(false);
        class313.method2138((byte) -117);
        class563.method3342((byte) -55);
        class180.method1469(18714);
        class531.method3216(false);
        class54.method596((byte) -93);
        class600.method3509();
        class406.method2603(0);
        class192.method1528(false);
        class401.method2579(-45);
        class652.method3759(false);
        class237.method1708();
        class672.method3846(true);
        class131.method1141(32477);
        class578.method3386((byte) 5);
        class325.method2189(2);
        class527.method3194(-1);
        class119.method1068(0);
        class249.method1769();
        class371.method2447(86);
        class573.method3370(11738);
        class661.method3795(1);
        class565.method3349(-30642);
        class62.method682((byte) -101);
        class507.method3080(101);
        class638.method3706(-22981);
        class490.method2998(3);
        class603.method3514(false);
        class71.method726(7578);
        class391.method2541(-93);
        class585.method3431(true);
        class81.method770((byte) 58);
        class268.method1904(true);
        class90.method808(-128);
        class469.method2911(false);
        class411.method2618(-17073);
        class360.method2409(1408);
        class475.method2945(0);
        class173.method1413(-1);
        class572.method3369(0);
        class43.method528((byte) 35);
        class443.method2798((byte) -101);
        class349.method2352(-53);
        class99.method968((byte) -93);
        class87.method801(52);
        class138.method1186(86);
        class455.method2862((byte) 96);
        class479.method2967(-1);
        class159.method1311(0);
        class210.method1597(-8770);
        class211.method1602(-73);
        class436.method2768(96);
        class626.method3653((byte) -53);
        class695.method3925(0);
        class208.method1589(122);
        class299.method2073(8615);
        class587.method3433(-75);
        class75.method751(-95);
        class188.method1511(28820);
        class444.method2801(true);
        class621.method3604(-27530);
        class341.method2330((byte) -112);
        class602.method3511(512);
        class631.method3668(true);
        class149.method1246((byte) 105);
        class272.method1919(-114);
        class463.method2896(0);
        class217.method1623(-1);
        class682.method3882((byte) -128);
        class339.method2323(108);
        class376.method2468(10656);
        class258.method1827(-97);
        class107.method1017(104);
        class57.method665(-83);
        class175.method1424((byte) 81);
        class72.method736((byte) -106);
        class396.method2556((byte) 60);
        class612.method3564((byte) -82);
        class320.method2175((byte) 65);
        class191.method1526((byte) -110);
        class147.method1239(-29021);
        class289.method2042(-12979);
        class518.method3129(false);
        class301.method2079(91);
        class163.method1326(64);
        class56.method655(109);
        class352.method2363();
        class508.method3087(127);
        class478.method2964((byte) -102);
        class359.method2406(106);
        class137.method1185((byte) 120);
        class312.method2135(-71);
        class292.method2055((byte) 126);
        class331.method2220(true);
        class24.method416((byte) -70);
        class91.method814(32);
        class353.method2371((byte) 84);
        class409.method2615(1);
        class305.method2117(false);
        class584.method3422((byte) 122);
        class160.method1317(false);
        class420.method2681(124);
        class660.method3785(-125);
        class146.method1236((byte) 63);
        class267.method1894(-1024);
        class506.method3065();
        class462.method2891(-90);
        class683.method3885(-3226);
        class76.method757();
        class671.method3836();
        class293.method2056(-63);
        class235.method1701(true);
        class103.method988();
        class673.method3849(-20897);
        class314.method2148(-95);
        class250.method1778(false);
        class329.method2211(124);
        class251.method1786(-23507);
        class549.method3314(true);
        class590.method3447(-16451);
        class425.method2693((byte) -100);
        class350.method2357(122);
        class224.method1647((byte) 42);
        class499.method3046((byte) 44);
        class52.method584(124);
        class407.method2611((byte) -92);
        class330.method2215((byte) 113);
        class118.method1067(0);
        class614.method3575(-113);
        class86.method798((byte) 123);
        class110.method1028(-118);
        class513.method3108();
        class523.method3151(-72);
        class357.method2399(37);
        class34.method464((byte) 74);
        class182.method1483(-76);
        class193.method1532(true);
        class219.method1631(7);
        class641.method3719(-108);
        class553.method3318((byte) -92);
        class281.method2000((byte) 8);
        class166.method1341((byte) -72);
        class44.method532((byte) 77);
        class315.method2152(false);
        class669.method3835(676);
        class318.method2167((byte) -72);
        class627.method3659(-1);
        class677.method3868((byte) 103);
        class435.method2766(98);
        class647.method3740(-74);
        class89.method804(6394);
        class335.method2315(104);
        class243.method1741(-100);
        class384.method2502(-20624);
        class92.method839(17233);
        class282.method2004((byte) 104);
        class592.method3452(-126);
        class155.method1278(89);
        class177.method1435(-38);
        class40.method498(-127);
        class562.method3338(1);
        class183.method1488(0);
        class276.method1962((byte) 31);
        class386.method2510(0);
        class133.method1154(false);
        class202.method1566(16383);
        class197.method1550((byte) 107);
        class136.method1176(false);
        class51.method581((byte) 85);
        class148.method1244(-5471);
        class369.method2439(-7);
        class134.method1161(1);
        class181.method1477(false);
        class498.method3038(15);
        class64.method699((byte) 15);
        class561.method3335(-1);
        class26.method421(0);
        class486.method2978((byte) 121);
        class546.method3300(-27880);
        class423.method2689(6);
        class547.method3304(0);
        class633.method3680(83);
        class153.method1259(77);
        class466.method2903(false);
        class108.method1018((byte) -110);
        class656.method3775(-9884);
        class240.method1730(-9870);
        class104.method993();
        class239.method1719((byte) -67);
        class361.method2412(-87);
        class452.method2843(0);
        class639.method3711(65536);
        class541.method3280(4096);
        class485.method2976(1);
        class690.method3911(0);
        class248.method1765((byte) 63);
        class194.method1538(true);
        class555.method3321((byte) -127);
        class31.method440((byte) -78);
        class649.method3743(98);
        class629.method3666(22439);
        class321.method2182((byte) -88);
        class189.method1523(-35);
        class1.method2(-21839);
        class129.method1124(0);
        class414.method2640((byte) 5);
        class522.method3143(-70);
        class362.method2414((byte) 114);
        class651.method3755(-108);
        class693.method3920(true);
        class114.method1035((byte) -63);
        class41.method524(4096);
        class145.method1229((byte) -8);
        class333.method2309(true);
        class636.method3700(true);
        class68.method714((byte) 5);
        class680.method3875(1000226689);
        class657.method3777(512);
        class402.method2582(-1060549588);
        class11.method199(16777215);
        class593.method3460();
        class179.method1443();
        class123.method1097(15);
        class392.method2543(85);
        class65.method704((byte) -103);
        class140.method1190((byte) -88);
        class85.method796(-2);
        class38.method493((byte) 84);
        class510.method3092(-1);
        class450.method2839(-87);
        class521.method3140((byte) -126);
        class277.method1982(true);
        class694.method3923(false);
        class106.method1002((byte) 25);
        class557.method3325((byte) -52);
        class366.method2425(-69);
        class609.method3544(-30615);
        class287.method2037(-92);
        class597.method3483(false);
        class545.method3296((byte) -124);
        class156.method1292(118);
        class105.method999(350);
        class356.method2396(123);
        class385.method2506((byte) -44);
        class231.method1688(0);
        int var2 = -94 % ((41 - arg0) / 48);
        class540.method3279(3);
        class655.method3773(-4);
        class10.method195((byte) -114);
        class207.method1588(31562);
        class63.method688(11);
        class483.method2972(0);
        class288.method2041(127);
        class130.method1128(9472);
        class373.method2455((byte) -34);
        class415.method2645(true);
        class150.method1251((byte) 30);
        class663.method3801(false);
        class550.method3316((byte) -106);
        class556.method3324(24178);
        class575.method3373(123);
        class199.method1553(62);
        class185.method1503((byte) -72);
        class161.method1321((byte) -83);
        class78.method763((byte) -15);
        class164.method1328(60);
        class39.method494((byte) -101);
        class206.method1584(-122);
        class121.method1089(127);
        class213.method1605(true);
        class203.method1575(-16958);
        class229.method1684((byte) -97);
        class355.method2389((byte) -25);
        class42.method526((byte) -32);
        class9.method190(true);
        class532.method3218(-27108);
        class273.method1923(-5182);
        class497.method3021((byte) 38);
        class157.method1299(1);
        class494.method3012(-1);
        class399.method2571(false);
        class397.method2560(-81);
        class20.method360(-84);
        class22.method368(120);
        class17.method255(255);
        class619.method3593((byte) -44);
        class588.method3436((byte) -128);
        class234.method1695(-1);
        class259.method1834(true);
        class558.method3329((byte) 83);
        class439.method2779(2);
        class504.method3061(102);
        class27.method422(2);
        class574.method3371((byte) -81);
        class471.method2922(true);
        class88.method802(4323);
        class290.method2046(false);
        class125.method1103(false);
        class139.method1187(-1);
        class426.method2698(32552);
        class427.method2704((byte) -12);
        class389.method2530((byte) 69);
        class379.method2496((byte) -61);
        class126.method1108(true);
        class232.method1691((byte) -43);
        class327.method2202(126);
        class623.method3612((byte) -65);
        class646.method3739(-20200);
        class645.method3735(255);
        class295.method2061((byte) 116);
        class622.method3607((byte) 62);
        class659.method3784(62);
        class664.method3805((byte) -105);
        class405.method2597(-104);
        class215.method1614((byte) 106);
        class247.method1761(3203);
        class456.method2865(false);
        class322.method2183(-10966);
        class492.method3008((byte) -92);
        class61.method678(92);
        class28.method432(4);
        class576.method3377(7);
        class124.method1099(true);
        class344.method2342((byte) -91);
        class154.method1274(true);
        class457.method2866(4353);
        class95.method907(-125);
        class351.method2358(6);
        class204.method1576((byte) 103);
        class4.method23((byte) 105);
        class340.method2327(-120);
        class583.method3416(10992);
        class548.method3310((byte) -68);
        class345.method2343((byte) -114);
        class432.method2748(-123);
        class689.method3904(-127);
        if (class598.field8508) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3161)
    public final void init() {
        field4442++;
        if (!this.method3491((byte) -112)) {
            return;
        }
        class255.field4053 = new class470();
        class255.field4053.field6971 = Integer.parseInt(this.getParameter("worldid"));
        class464.field6931 = new class470();
        class464.field6931.field6971 = Integer.parseInt(this.getParameter("lobbyid"));
        class464.field6931.field6959 = this.getParameter("lobbyaddress");
        class623.field8794 = new class470();
        class623.field8794.field6971 = Integer.parseInt(this.getParameter("demoid"));
        class623.field8794.field6959 = this.getParameter("demoaddress");
        class660.field9192 = class534.method3230(Integer.parseInt(this.getParameter("modewhere")), 13800);
        if (class660.field9192 == class31.field451) {
            class660.field9192 = class133.field2182;
        } else if (!class339.method2325(class660.field9192, (byte) 20) && class660.field9192 != class182.field3060) {
            class660.field9192 = class182.field3060;
        }
        class66.field858 = class420.method2682(Integer.parseInt(this.getParameter("modewhat")), -102);
        if (class66.field858 != class629.field8875 && class66.field858 != class499.field7326 && class66.field858 != class159.field2715) {
            class66.field858 = class159.field2715;
        }
        try {
            class135.field2206 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class135.field2206 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class615.field8740 = true;
        } else {
            class615.field8740 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class184.field3108 = true;
        } else {
            class184.field3108 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class476.field7057 = true;
        } else {
            class476.field7057 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class99.field1647 = field4436;
            } else if (var4.equals("1")) {
                class99.field1647 = class34.field500;
            }
        }
        try {
            class611.field8698 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class611.field8698 = 0;
        }
        class371.field5817 = this.getParameter("quiturl");
        class98.field1592 = this.getParameter("settings");
        if (class98.field1592 == null) {
            class98.field1592 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class464.field6930 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class464.field6930 = 0;
            }
        }
        class677.field9526 = Integer.parseInt(this.getParameter("colourid"));
        if (class677.field9526 < 0 || class572.field8179.length <= class677.field9526) {
            class677.field9526 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class368.field5762 = true;
            class303.field4715 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class548.field7976 = true;
        }
        class234.field3704 = this.getParameter("sskey");
        if (class234.field3704 != null && class234.field3704.length() < 2) {
            class234.field3704 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class527.field7699 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class375.field5855 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class73.field920 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class154.field2630 = this.getParameter("additionalInfo");
        if (class154.field2630 != null && class154.field2630.length() > 50) {
            class154.field2630 = null;
        }
        if (field4436 == class99.field1647) {
            class95.field1487 = 503;
            class585.field8333 = 765;
        } else if (class99.field1647 == class34.field500) {
            class585.field8333 = 640;
            class95.field1487 = 480;
        }
        class157.field2684 = this;
        this.method3493(625, class585.field8333, class99.field1647.field2741, class66.field858.method3058((byte) 18) + 32, 35, 109, class95.field1487);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3316)
    public static final void method1958() {
        class469.field6954 = 0;
        for (int var0 = 0; var0 < class283.field4523; var0++) {
            class589 var1 = ((class348) class592.field8395.method1558((long) class102.field1690[var0], (byte) -93)).field5577;
            if (var1.field4180 && var1.method1847(92160000) != -1) {
                int var2 = (var1.method1841(20744) - 1) * 256 + 252;
                int var3 = var1.field9696 - var2 >> 9;
                int var4 = var1.field9705 - var2 >> 9;
                class260 var5 = class110.method1027(var4, var3, -256, var1.field9695);
                if (var5 != null) {
                    int var6 = var5.field4197;
                    if (var5 instanceof class589) {
                        var6 += 2048;
                    }
                    if (var5.field4161 == 0 && var5.method1847(92160000) != -1) {
                        class344.field5547[class469.field6954] = var6;
                        class28.field437[class469.field6954] = var6;
                        class469.field6954++;
                        var5.field4161++;
                    }
                    class344.field5547[class469.field6954] = var6;
                    class28.field437[class469.field6954] = var1.field4197 + 2048;
                    class469.field6954++;
                    var5.field4161++;
                }
            }
        }
        class440.method2781(class469.field6954 - 1, class28.field437, 0, 1, class344.field5547);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 3364)
    private final void method1959(boolean arg0) {
        field4446++;
        if (class682.field9564 == 14) {
            return;
        }
        class562.field8084++;
        if ((class562.field8084 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class105.field1702 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class437.field6664.setSeed((long) class105.field1702);
        }
        if ((class562.field8084 % 50) == 0) {
            class102.field1686 = class71.field899;
            class192.field3181 = class459.field6872;
            class71.field899 = 0;
            class459.field6872 = 0;
        }
        this.method1943(-97);
        if (!arg0) {
            return;
        }
        if (class654.field9147 != null) {
            class654.field9147.method3556(-31742);
        }
        class387.method2518(-12938);
        class83.field1024.method1510((byte) 109);
        class464.field6929.method447(126);
        if (class627.field8857 != null) {
            class627.field8857.method155((int) class112.method1033(-11752));
        }
        class382.method2501(2);
        class496.field7236 = 0;
        class345.field5560 = 0;
        for (class291 var3 = class83.field1024.method1518(false); var3 != null; var3 = class83.field1024.method1518(!arg0)) {
            int var6 = var3.method2052(-28552);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method2051((byte) 104);
                if (class433.method2753(-128) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class412.method2628(6246)) {
                        class315.method2153((byte) -118);
                    } else {
                        class168.method1358((byte) -90);
                    }
                } else if (class345.field5560 < 128) {
                    class365.field5738[class345.field5560] = var3;
                    class345.field5560++;
                }
            } else if (var6 == 0 && class496.field7236 < 75) {
                class307.field4837[class496.field7236] = var3;
                class496.field7236++;
            }
        }
        class259.field4142 = 0;
        for (class623 var4 = class464.field6929.method448((byte) -21); var4 != null; var4 = class464.field6929.method448((byte) -21)) {
            int var5 = var4.method2594((byte) -74);
            if (var5 == -1) {
                class260.field4243.method3463((byte) -87, var4);
            } else if (var5 == 6) {
                class259.field4142 += var4.method2599(arg0);
            } else if (class220.method1632(var5, 109)) {
                class655.field9149.method3463((byte) -87, var4);
                if (class655.field9149.method3468(0) > 10) {
                    class655.field9149.method3471(0);
                }
            }
        }
        if (class412.method2628(6246)) {
            class303.method2084((byte) -124);
        }
        if (class327.method2206(class682.field9564, (byte) 112)) {
            class133.method1156((byte) -103);
            class466.method2904((byte) -109);
        } else if (class255.method1804(-5737, class682.field9564)) {
            class667.method3828(!arg0);
        }
        if (class668.method3832(class682.field9564, 28100) && !class255.method1804(-5737, class682.field9564)) {
            this.method1935((byte) -74);
            class208.method1591((byte) -24);
            class418.method2659(arg0);
        } else if (class471.method2924((byte) 90, class682.field9564) && !class255.method1804(-5737, class682.field9564)) {
            this.method1935((byte) -60);
            class418.method2659(true);
        } else if (class682.field9564 == 12) {
            class418.method2659(true);
        } else if (class650.method3744(-13, class682.field9564) && !class255.method1804(-5737, class682.field9564)) {
            class597.method3481(-116);
        } else if (class682.field9564 == 13) {
            class418.method2659(true);
            if (class538.field7862 != -3 && class538.field7862 != 2 && class538.field7862 != 15) {
                class6.method63(0, false);
            }
        }
        class96.method915((byte) 109, class627.field8857);
        class655.field9149.method3471(0);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 3538)
    private final void method1960(byte arg0) {
        field4444++;
        if (class313.field4923 < class683.field9586.field7066) {
            class221.field3591.method2919((byte) -100);
            class232.field3690 = (class683.field9586.field7066 * 50 - 50) * 5;
            if (class232.field3690 > 3000) {
                class232.field3690 = 3000;
            }
            if (class683.field9586.field7066 >= 2 && class683.field9586.field7068 == 6) {
                this.method3487(true, "js5connect_outofdate");
                class682.field9564 = 14;
                return;
            }
            if (class683.field9586.field7066 >= 4 && class683.field9586.field7068 == -1) {
                this.method3487(true, "js5crc");
                class682.field9564 = 14;
                return;
            }
            if (class683.field9586.field7066 >= 4 && class327.method2206(class682.field9564, (byte) 123)) {
                if (class683.field9586.field7068 == 7 || class683.field9586.field7068 == 9) {
                    this.method3487(true, "js5connect_full");
                } else if (class683.field9586.field7068 <= 0) {
                    this.method3487(true, "js5io");
                } else if (class124.field2047 == null) {
                    this.method3487(true, "js5connect");
                } else {
                    this.method3487(true, "js5proxy_" + class124.field2047.trim());
                }
                class682.field9564 = 14;
                return;
            }
        }
        class313.field4923 = class683.field9586.field7066;
        if (arg0 < 124) {
            return;
        }
        if (class232.field3690 > 0) {
            class232.field3690--;
            return;
        }
        try {
            if (class192.field3183 == 0) {
                class106.field1731 = class221.field3591.method2917((byte) 88, class402.field6207);
                class192.field3183++;
            }
            if (class192.field3183 == 1) {
                if (class106.field1731.field9884 == 2) {
                    if (class106.field1731.field9885 != null) {
                        class124.field2047 = (String) class106.field1731.field9885;
                    }
                    this.method1956((byte) -62, 1000);
                    return;
                }
                if (class106.field1731.field9884 == 1) {
                    class192.field3183++;
                }
            }
            if (class192.field3183 == 2) {
                class197.field3237 = new class610((Socket) class106.field1731.field9885, class402.field6207);
                class6 var2 = new class6(5);
                var2.method65(class434.field6600.field7155, -77);
                var2.method82(false, 625);
                class197.field3237.method3552(var2.field96, 0, 5, true);
                class192.field3183++;
                class641.field8991 = class112.method1033(-11752);
            }
            if (class192.field3183 == 3) {
                if (class327.method2206(class682.field9564, (byte) 120) || class197.field3237.method3546(3) > 0) {
                    int var3 = class197.field3237.method3553((byte) -29);
                    if (var3 != 0) {
                        this.method1956((byte) -62, var3);
                        return;
                    }
                    class192.field3183++;
                } else if ((class112.method1033(-11752) - class641.field8991) > 30000L) {
                    this.method1956((byte) -62, 1001);
                    return;
                }
            }
            if (class192.field3183 == 4) {
                boolean var4 = class327.method2206(class682.field9564, (byte) 90) || class668.method3832(class682.field9564, 28100) || class471.method2924((byte) 91, class682.field9564);
                class96[] var5 = class96.method911((byte) -77);
                class6 var6 = new class6(var5.length * 4);
                class197.field3237.method3555(var6.field96, var6.field96.length, -112, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method914(var6.method72(-38), 32);
                }
                class683.field9586.method2950(!var4, 30000, class197.field3237);
                class197.field3237 = null;
                class192.field3183 = 0;
                class106.field1731 = null;
            }
        } catch (IOException var8) {
            this.method1956((byte) -62, 1002);
        }
    }
}
