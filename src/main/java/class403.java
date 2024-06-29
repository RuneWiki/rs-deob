import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class403 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Ltk;")
    public static class192 field5882;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Llg;")
    public class238 field5879;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lmj;")
    public class393 field5880;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 14)
    public static void method2551(int arg0) {
        if (arg0 != -1) {
            method2555(5, (byte) 57);
        }
        field5882 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLen;)V", line = 24)
    public static final void method2552(byte arg0, class174 arg1) {
        field5881++;
        if (class32.field298.method1126((byte) 118) == 0) {
            return;
        }
        if (arg0 <= 108) {
            field5882 = null;
        }
        if (class341.field5018 == 0 || class341.field5018 == 2) {
            for (class268 var4 = (class268) class32.field298.method1124(-1); var4 != null; var4 = (class268) class32.field298.method1119(false)) {
                class300.method1893(var4.field3772, var4.field3776, arg1, var4.field3777, false, var4.field3769, false, arg1, class105.field1192, var4.field3770 ? class390.field5715.field1843 : null, false, var4.field3771);
                var4.method2290((byte) 98);
            }
            class109.method609(-93);
            return;
        }
        if (class59.field711 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class59.field711 = class349.method2222(0, class225.field3070, 8, 0, var2, class323.field4554);
            class71.field807 = class59.field711.method966(class302.method1906(class323.field4546, 15163, 0, class417.field5990), class145.method865(class92.field1012, class417.field5990, 0), true);
        }
        for (class268 var3 = (class268) class32.field298.method1124(-1); var3 != null; var3 = (class268) class32.field298.method1119(false)) {
            class300.method1893(var3.field3772, var3.field3776, arg1, var3.field3777, false, var3.field3769, false, class59.field711, class71.field807, var3.field3770 ? class390.field5715.field1843 : null, false, var3.field3771);
            var3.method2290((byte) 98);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjf;Ljava/lang/String;)Ljava/lang/String;", line = 76)
    public static final String method2553(int arg0, class119 arg1, String arg2) {
        if (arg2.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class70.field797 != null) {
                                                            if (class70.field797.field3270 == null) {
                                                                var9 = class274.method1737(255, class70.field797.field3267);
                                                            } else {
                                                                var9 = (String) class70.field797.field3270;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class217.method1425(class206.method1306(arg1, true, 4), -1) + arg2.substring(var7 + 2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class217.method1425(class206.method1306(arg1, true, 3), -1) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class217.method1425(class206.method1306(arg1, true, 2), -1) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class217.method1425(class206.method1306(arg1, true, 1), -1) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class217.method1425(class206.method1306(arg1, true, 0), -1) + arg2.substring(var3 + 2);
            }
        }
        field5878++;
        if (arg0 >= -80) {
            field5882 = null;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lfk;", line = 168)
    public static final class392 method2554(Canvas arg0, byte arg1) {
        field5877++;
        try {
            if (arg1 < 107) {
                method2552((byte) -127, (class174) null);
            }
            Class var2 = Class.forName("e");
            class392 var3 = (class392) var2.getDeclaredConstructor().newInstance();
            var3.method1960(arg0, (byte) -62);
            return var3;
        } catch (Throwable var5) {
            class372 var4 = new class372();
            var4.method1960(arg0, (byte) -85);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Lch;", line = 194)
    public static final class270 method2555(int arg0, byte arg1) {
        field5876++;
        class331 var2 = class437.field6410;
        class270 var3;
        synchronized (class437.field6410) {
            var3 = (class270) class437.field6410.method2049(-124, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        } else if (arg1 == 49) {
            byte[] var4 = class45.field545.method361(32, 78, arg0);
            class270 var5 = new class270();
            if (var4 != null) {
                var5.method1712(new class211(var4), 5094);
            }
            var5.method1714((byte) 125);
            class331 var6 = class437.field6410;
            synchronized (class437.field6410) {
                class437.field6410.method2046((long) arg0, 0, var5);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)[B", line = 224)
    public static final byte[] method2556(boolean arg0, int arg1) {
        field5875++;
        class179 var2 = (class179) class213.field2905.method410((byte) -18, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class239.method1529(var7, (byte) -96, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class179(var3);
            class213.field2905.method414(var2, (byte) 66, (long) arg1);
        }
        if (arg0) {
            field5874 = -59;
        }
        return var2.field2466;
    }
}
