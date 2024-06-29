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
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class114 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Z")
    private boolean field1874 = false;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field1842 = -1;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Ltl;")
    public static class59 field1850 = class85.method639("settings=", 9588);

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Ltl;")
    private static class59 field1866 = class85.method639("level: ", 9588);

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Z")
    public static boolean field1863 = false;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Ltl;")
    public static class59 field1853 = field1866;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Ltl;")
    public static class59 field1876 = class85.method639("::wm3", 9588);

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lme;")
    public static class295 field1838;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "Z")
    public static boolean field1877;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Z")
    public static boolean field1878;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method815(int arg0) {
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        field1840++;
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
            }
            if (arg0 != 1) {
                field1863 = false;
            }
            this.method823("invalidhost", -12384);
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 48)
    private static final void method816(int arg0) {
        field1839++;
        if (arg0 != -1104) {
            method816(-125);
        }
        class9.field115.method1484(false);
    }

    @OriginalMember(owner = "client!te", name = "destroy", descriptor = "()V", line = 63)
    public final void destroy() {
        field1852++;
        if (class17.field222 == this && !class285.field4904) {
            class146.field2389 = class205.method1451(19);
            class183.method1360(false, 5000L);
            class97.field1555 = null;
            this.method817(false, -15353);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V", line = 79)
    private final void method817(boolean arg0, int arg1) {
        field1871++;
        synchronized (this) {
            if (class285.field4904) {
                return;
            }
            class285.field4904 = true;
        }
        if (class308.field5222.field2870 != null) {
            class308.field5222.field2870.destroy();
        }
        try {
            if (arg1 != -15353) {
                method824(48);
            }
            this.method285(-5);
        } catch (Exception var12) {
        }
        if (class160.field2607 != null) {
            try {
                class160.field2607.removeFocusListener(this);
                class160.field2607.getParent().remove(class160.field2607);
            } catch (Exception var11) {
            }
        }
        if (class308.field5222 != null) {
            try {
                class308.field5222.method1292(true);
            } catch (Exception var10) {
            }
        }
        this.method268((byte) 53);
        if (class253.field4209 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!te", name = "providesignlink", descriptor = "(Lim;)V", line = 141)
    public static final void providesignlink(class175 arg0) {
        class308.field5222 = arg0;
        class97.field1555 = arg0;
        field1862++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBLvi;)V", line = 151)
    public static final void method818(int arg0, byte arg1, class128 arg2) {
        field1860++;
        if (arg1 > -88) {
            field1838 = (class295) null;
        }
        Object[] var3 = arg2.field2103;
        int var4 = (Integer) var3[0];
        class156 var5 = class125.method921(var4, false);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class37.field565 = 0;
        int var7 = -1;
        int var8 = 0;
        int[] var9 = var5.field2545;
        byte var10 = -1;
        int[] var11 = var5.field2549;
        try {
            class178.field2917 = new class59[var5.field2551];
            class87.field1379 = new int[var5.field2553];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field2105;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field2106;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field2110 == null ? -1 : arg2.field2110.field4392;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field2108;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field2110 == null ? -1 : arg2.field2110.field4500;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field2104 == null ? -1 : arg2.field2104.field4392;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field2104 == null ? -1 : arg2.field2104.field4500;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field2101;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field2109;
                    }
                    class87.field1379[var13++] = var16;
                } else if (var3[var14] instanceof class59) {
                    class59 var15 = (class59) var3[var14];
                    if (var15.method453(class300.field5131, (byte) -54)) {
                        var15 = arg2.field2094;
                    }
                    class178.field2917[var12++] = var15;
                }
            }
            int var17 = 0;
            label3957: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var483 = var9[var7];
                if (var483 < 100) {
                    if (var483 == 0) {
                        class78.field1245[var8++] = var11[var7];
                        continue;
                    }
                    if (var483 == 1) {
                        int var18 = var11[var7];
                        class78.field1245[var8++] = class116.field1915[var18];
                        continue;
                    }
                    if (var483 == 2) {
                        int var19 = var11[var7];
                        var8--;
                        class72.method579(class78.field1245[var8], (byte) -109, var19);
                        continue;
                    }
                    if (var483 == 3) {
                        class188.field3153[var6++] = var5.field2555[var7];
                        continue;
                    }
                    if (var483 == 6) {
                        var7 += var11[var7];
                        continue;
                    }
                    if (var483 == 7) {
                        var8 -= 2;
                        if (class78.field1245[var8 + 1] != class78.field1245[var8]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var483 == 8) {
                        var8 -= 2;
                        if (class78.field1245[var8 + 1] == class78.field1245[var8]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var483 == 9) {
                        var8 -= 2;
                        if (class78.field1245[var8 + 1] > class78.field1245[var8]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var483 == 10) {
                        var8 -= 2;
                        if (class78.field1245[var8 + 1] < class78.field1245[var8]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var483 == 21) {
                        if (class37.field565 == 0) {
                            return;
                        }
                        class56 var20 = class120.field2006[--class37.field565];
                        var5 = var20.field841;
                        var7 = var20.field838;
                        class178.field2917 = var20.field834;
                        var9 = var5.field2545;
                        var11 = var5.field2549;
                        class87.field1379 = var20.field843;
                        continue;
                    }
                    if (var483 == 25) {
                        int var21 = var11[var7];
                        class78.field1245[var8++] = class291.method2017(var21, (byte) -49);
                        continue;
                    }
                    if (var483 == 27) {
                        int var22 = var11[var7];
                        var8--;
                        client.method277(var22, class78.field1245[var8], -6);
                        continue;
                    }
                    if (var483 == 31) {
                        var8 -= 2;
                        if (class78.field1245[var8 + 1] >= class78.field1245[var8]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var483 == 32) {
                        var8 -= 2;
                        if (class78.field1245[var8] >= class78.field1245[var8 + 1]) {
                            var7 += var11[var7];
                        }
                        continue;
                    }
                    if (var483 == 33) {
                        class78.field1245[var8++] = class87.field1379[var11[var7]];
                        continue;
                    }
                    int var10001;
                    if (var483 == 34) {
                        var10001 = var11[var7];
                        var8--;
                        class87.field1379[var10001] = class78.field1245[var8];
                        continue;
                    }
                    if (var483 == 35) {
                        class188.field3153[var6++] = class178.field2917[var11[var7]];
                        continue;
                    }
                    if (var483 == 36) {
                        var10001 = var11[var7];
                        var6--;
                        class178.field2917[var10001] = class188.field3153[var6];
                        continue;
                    }
                    if (var483 == 37) {
                        int var23 = var11[var7];
                        var6 -= var23;
                        class59 var24 = class73.method591(class188.field3153, var6, var23, -127);
                        class188.field3153[var6++] = var24;
                        continue;
                    }
                    if (var483 == 38) {
                        var8--;
                        continue;
                    }
                    if (var483 == 39) {
                        var6--;
                        continue;
                    }
                    if (var483 == 40) {
                        int var25 = var11[var7];
                        class156 var26 = class125.method921(var25, false);
                        int[] var27 = new int[var26.field2553];
                        class59[] var28 = new class59[var26.field2551];
                        for (int var29 = 0; var29 < var26.field2550; var29++) {
                            var27[var29] = class78.field1245[var8 + var29 - var26.field2550];
                        }
                        for (int var30 = 0; var30 < var26.field2547; var30++) {
                            var28[var30] = class188.field3153[var6 + var30 - var26.field2547];
                        }
                        var8 -= var26.field2550;
                        var6 -= var26.field2547;
                        class56 var31 = new class56();
                        var31.field834 = class178.field2917;
                        var31.field843 = class87.field1379;
                        var31.field838 = var7;
                        var31.field841 = var5;
                        if (class120.field2006.length <= class37.field565) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class120.field2006[class37.field565++] = var31;
                        class178.field2917 = var28;
                        var11 = var26.field2549;
                        var9 = var26.field2545;
                        class87.field1379 = var27;
                        var7 = -1;
                        continue;
                    }
                    if (var483 == 42) {
                        class78.field1245[var8++] = class60.field935[var11[var7]];
                        continue;
                    }
                    if (var483 == 43) {
                        int var32 = var11[var7];
                        var8--;
                        class60.field935[var32] = class78.field1245[var8];
                        class157.method1115(var32, -17690);
                        continue;
                    }
                    if (var483 == 44) {
                        int var33 = var11[var7] & 0xFFFF;
                        var8--;
                        int var34 = class78.field1245[var8];
                        int var35 = var11[var7] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            class264.field4569[var35] = var34;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label3957;
                                }
                                class312.field5299[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 45) {
                        int var38 = var11[var7];
                        var8--;
                        int var39 = class78.field1245[var8];
                        if (var39 >= 0 && class264.field4569[var38] > var39) {
                            class78.field1245[var8++] = class312.field5299[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 46) {
                        int var40 = var11[var7];
                        var8 -= 2;
                        int var41 = class78.field1245[var8];
                        if (var41 >= 0 && class264.field4569[var40] > var41) {
                            class312.field5299[var40][var41] = class78.field1245[var8 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 47) {
                        class59 var42 = class229.field3759[var11[var7]];
                        if (var42 == null) {
                            var42 = class123.field2042;
                        }
                        class188.field3153[var6++] = var42;
                        continue;
                    }
                    if (var483 == 48) {
                        int var43 = var11[var7];
                        var6--;
                        class229.field3759[var43] = class188.field3153[var6];
                        class19.method128(var43, (byte) 97);
                        continue;
                    }
                    if (var483 == 51) {
                        class94 var44 = var5.field2559[var11[var7]];
                        var8--;
                        class174 var45 = (class174) var44.method685((long) class78.field1245[var8], 128);
                        if (var45 != null) {
                            var7 += var45.field2851;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var483 < 300) {
                    if (var483 == 100) {
                        var8 -= 3;
                        int var47 = class78.field1245[var8 + 2];
                        int var48 = class78.field1245[var8 + 1];
                        int var49 = class78.field1245[var8];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class263 var50 = class247.method1738(false, var49);
                        if (var50.field4377 == null) {
                            var50.field4377 = new class263[var47 + 1];
                        }
                        if (var50.field4377.length <= var47) {
                            class263[] var51 = new class263[var47 + 1];
                            for (int var52 = 0; var52 < var50.field4377.length; var52++) {
                                var51[var52] = var50.field4377[var52];
                            }
                            var50.field4377 = var51;
                        }
                        if (var47 > 0 && var50.field4377[var47 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var47 - 1));
                        }
                        class263 var53 = new class263();
                        var53.field4500 = var47;
                        var53.field4410 = var53.field4392 = var50.field4392;
                        var53.field4542 = true;
                        var53.field4468 = var48;
                        var50.field4377[var47] = var53;
                        if (var46) {
                            class69.field1060 = var53;
                        } else {
                            class284.field4888 = var53;
                        }
                        class140.method1019(var50, (byte) 101);
                        continue;
                    }
                    if (var483 == 101) {
                        class263 var54 = var46 ? class69.field1060 : class284.field4888;
                        if (var54.field4500 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class263 var55 = class247.method1738(false, var54.field4392);
                        var55.field4377[var54.field4500] = null;
                        class140.method1019(var55, (byte) 99);
                        continue;
                    }
                    if (var483 == 102) {
                        var8--;
                        class263 var56 = class247.method1738(false, class78.field1245[var8]);
                        var56.field4377 = null;
                        class140.method1019(var56, (byte) -111);
                        continue;
                    }
                    if (var483 == 200) {
                        var8 -= 2;
                        int var57 = class78.field1245[var8];
                        int var58 = class78.field1245[var8 + 1];
                        class263 var59 = class297.method2067(var57, 66, var58);
                        if (var59 != null && var58 != -1) {
                            class78.field1245[var8++] = 1;
                            if (var46) {
                                class69.field1060 = var59;
                            } else {
                                class284.field4888 = var59;
                            }
                            continue;
                        }
                        class78.field1245[var8++] = 0;
                        continue;
                    }
                    if (var483 == 201) {
                        var8--;
                        int var60 = class78.field1245[var8];
                        class263 var61 = class247.method1738(false, var60);
                        if (var61 == null) {
                            class78.field1245[var8++] = 0;
                        } else {
                            class78.field1245[var8++] = 1;
                            if (var46) {
                                class69.field1060 = var61;
                            } else {
                                class284.field4888 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var483 < 500) {
                    if (var483 == 403) {
                        var8 -= 2;
                        int var62 = class78.field1245[var8 + 1];
                        int var63 = class78.field1245[var8];
                        if (var63 >= 7) {
                            var63 -= 7;
                        }
                        class286.field4920.field1685.method1364(var63, -27342, var62);
                        continue;
                    }
                    if (var483 == 404) {
                        var8 -= 2;
                        int var64 = class78.field1245[var8 + 1];
                        int var65 = class78.field1245[var8];
                        class286.field4920.field1685.method1367(var64, 124, var65);
                        continue;
                    }
                    if (var483 == 410) {
                        var8--;
                        boolean var66 = class78.field1245[var8] != 0;
                        class286.field4920.field1685.method1371(28067, var66);
                        continue;
                    }
                } else if (var483 >= 1000 && var483 < 1100 || var483 >= 2000 && var483 < 2100) {
                    class263 var471;
                    if (var483 >= 2000) {
                        var8--;
                        var471 = class247.method1738(false, class78.field1245[var8]);
                        var483 -= 1000;
                    } else {
                        var471 = var46 ? class69.field1060 : class284.field4888;
                    }
                    if (var483 == 1000) {
                        var8 -= 4;
                        var471.field4506 = class78.field1245[var8];
                        var471.field4471 = class78.field1245[var8 + 1];
                        int var472 = class78.field1245[var8 + 2];
                        if (var472 < 0) {
                            var472 = 0;
                        } else if (var472 > 5) {
                            var472 = 5;
                        }
                        int var473 = class78.field1245[var8 + 3];
                        var471.field4490 = (byte) var472;
                        if (var473 < 0) {
                            var473 = 0;
                        } else if (var473 > 5) {
                            var473 = 5;
                        }
                        var471.field4384 = (byte) var473;
                        class140.method1019(var471, (byte) -115);
                        class105.method799(var471, -31947);
                        if (var471.field4500 == -1) {
                            class182.method1355(var471.field4392, 101);
                        }
                        continue;
                    }
                    if (var483 == 1001) {
                        var8 -= 4;
                        var471.field4388 = class78.field1245[var8];
                        var471.field4478 = class78.field1245[var8 + 1];
                        var471.field4515 = 0;
                        var471.field4421 = 0;
                        int var474 = class78.field1245[var8 + 2];
                        if (var474 < 0) {
                            var474 = 0;
                        } else if (var474 > 4) {
                            var474 = 4;
                        }
                        int var475 = class78.field1245[var8 + 3];
                        var471.field4389 = (byte) var474;
                        if (var475 < 0) {
                            var475 = 0;
                        } else if (var475 > 4) {
                            var475 = 4;
                        }
                        var471.field4441 = (byte) var475;
                        class140.method1019(var471, (byte) 126);
                        class105.method799(var471, -31947);
                        if (var471.field4468 == 0) {
                            class173.method1273(var471, -20833, false);
                        }
                        continue;
                    }
                    if (var483 == 1003) {
                        var8--;
                        boolean var476 = class78.field1245[var8] == 1;
                        if (var471.field4547 != var476) {
                            var471.field4547 = var476;
                            class140.method1019(var471, (byte) -114);
                        }
                        if (var471.field4500 == -1) {
                            class239.method1671(false, var471.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1004) {
                        var8 -= 2;
                        var471.field4517 = class78.field1245[var8];
                        var471.field4540 = class78.field1245[var8 + 1];
                        class140.method1019(var471, (byte) 117);
                        class105.method799(var471, -31947);
                        if (var471.field4468 == 0) {
                            class173.method1273(var471, -20833, false);
                        }
                        continue;
                    }
                } else if (var483 >= 1100 && var483 < 1200 || var483 >= 2100 && var483 < 2200) {
                    class263 var468;
                    if (var483 < 2000) {
                        var468 = var46 ? class69.field1060 : class284.field4888;
                    } else {
                        var483 -= 1000;
                        var8--;
                        var468 = class247.method1738(false, class78.field1245[var8]);
                    }
                    if (var483 == 1100) {
                        var8 -= 2;
                        var468.field4405 = class78.field1245[var8];
                        if (var468.field4405 > (var468.field4449 - var468.field4420)) {
                            var468.field4405 = var468.field4449 - var468.field4420;
                        }
                        if (var468.field4405 < 0) {
                            var468.field4405 = 0;
                        }
                        var468.field4504 = class78.field1245[var8 + 1];
                        if ((var468.field4479 - var468.field4467) < var468.field4504) {
                            var468.field4504 = var468.field4479 - var468.field4467;
                        }
                        if (var468.field4504 < 0) {
                            var468.field4504 = 0;
                        }
                        class140.method1019(var468, (byte) -126);
                        if (var468.field4500 == -1) {
                            class234.method1647(12, var468.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1101) {
                        var8--;
                        var468.field4525 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 100);
                        if (var468.field4500 == -1) {
                            class174.method1280(var468.field4392, -100);
                        }
                        continue;
                    }
                    if (var483 == 1102) {
                        var8--;
                        var468.field4484 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) -105);
                        continue;
                    }
                    if (var483 == 1103) {
                        var8--;
                        var468.field4489 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 77);
                        continue;
                    }
                    if (var483 == 1104) {
                        var8--;
                        var468.field4459 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 66);
                        continue;
                    }
                    if (var483 == 1105) {
                        var8--;
                        var468.field4408 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 57);
                        continue;
                    }
                    if (var483 == 1106) {
                        var8--;
                        var468.field4445 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 85);
                        continue;
                    }
                    if (var483 == 1107) {
                        var8--;
                        var468.field4485 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) -106);
                        continue;
                    }
                    if (var483 == 1108) {
                        var468.field4412 = 1;
                        var8--;
                        var468.field4438 = class78.field1245[var8];
                        class140.method1019(var468, (byte) -102);
                        if (var468.field4500 == -1) {
                            class233.method1628((byte) 68, var468.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1109) {
                        var8 -= 6;
                        var468.field4532 = class78.field1245[var8];
                        var468.field4497 = class78.field1245[var8 + 1];
                        var468.field4393 = class78.field1245[var8 + 2];
                        var468.field4426 = class78.field1245[var8 + 3];
                        var468.field4539 = class78.field1245[var8 + 4];
                        var468.field4425 = class78.field1245[var8 + 5];
                        class140.method1019(var468, (byte) -86);
                        if (var468.field4500 == -1) {
                            class83.method626(8, var468.field4392);
                            class94.method684(10, var468.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1110) {
                        var8--;
                        int var469 = class78.field1245[var8];
                        if (var468.field4457 != var469) {
                            var468.field4457 = var469;
                            var468.field4431 = 0;
                            var468.field4394 = 0;
                            class140.method1019(var468, (byte) -104);
                        }
                        if (var468.field4500 == -1) {
                            class303.method2110(true, var468.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1111) {
                        var8--;
                        var468.field4494 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) 105);
                        continue;
                    }
                    if (var483 == 1112) {
                        var6--;
                        class59 var470 = class188.field3153[var6];
                        if (!var470.method453(var468.field4534, (byte) -33)) {
                            var468.field4534 = var470;
                            class140.method1019(var468, (byte) 108);
                        }
                        if (var468.field4500 == -1) {
                            class308.method2133(var468.field4392, (byte) 52);
                        }
                        continue;
                    }
                    if (var483 == 1113) {
                        var8--;
                        var468.field4442 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 61);
                        continue;
                    }
                    if (var483 == 1114) {
                        var8 -= 3;
                        var468.field4391 = class78.field1245[var8];
                        var468.field4503 = class78.field1245[var8 + 1];
                        var468.field4473 = class78.field1245[var8 + 2];
                        class140.method1019(var468, (byte) -92);
                        continue;
                    }
                    if (var483 == 1115) {
                        var8--;
                        var468.field4434 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) -90);
                        continue;
                    }
                    if (var483 == 1116) {
                        var8--;
                        var468.field4454 = class78.field1245[var8];
                        class140.method1019(var468, (byte) -69);
                        continue;
                    }
                    if (var483 == 1117) {
                        var8--;
                        var468.field4390 = class78.field1245[var8];
                        class140.method1019(var468, (byte) 116);
                        continue;
                    }
                    if (var483 == 1118) {
                        var8--;
                        var468.field4535 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) -71);
                        continue;
                    }
                    if (var483 == 1119) {
                        var8--;
                        var468.field4432 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) -105);
                        continue;
                    }
                    if (var483 == 1120) {
                        var8 -= 2;
                        var468.field4449 = class78.field1245[var8];
                        var468.field4479 = class78.field1245[var8 + 1];
                        class140.method1019(var468, (byte) -80);
                        if (var468.field4468 == 0) {
                            class173.method1273(var468, -20833, false);
                        }
                        continue;
                    }
                    if (var483 == 1121) {
                        var8 -= 2;
                        var468.field4464 = (short) class78.field1245[var8];
                        var468.field4537 = (short) class78.field1245[var8 + 1];
                        class140.method1019(var468, (byte) -70);
                        continue;
                    }
                    if (var483 == 1122) {
                        var8--;
                        var468.field4483 = class78.field1245[var8] == 1;
                        class140.method1019(var468, (byte) -113);
                        continue;
                    }
                } else if (var483 >= 1200 && var483 < 1300 || var483 >= 2200 && var483 < 2300) {
                    class263 var464;
                    if (var483 < 2000) {
                        var464 = var46 ? class69.field1060 : class284.field4888;
                    } else {
                        var483 -= 1000;
                        var8--;
                        var464 = class247.method1738(false, class78.field1245[var8]);
                    }
                    class140.method1019(var464, (byte) 101);
                    if (var483 == 1200 || var483 == 1205) {
                        var8 -= 2;
                        int var465 = class78.field1245[var8];
                        int var466 = class78.field1245[var8 + 1];
                        if (var464.field4500 == -1) {
                            class183.method1358(9, var464.field4392);
                            class83.method626(8, var464.field4392);
                            class94.method684(10, var464.field4392);
                        }
                        if (var465 == -1) {
                            var464.field4438 = -1;
                            var464.field4533 = -1;
                            var464.field4412 = 1;
                        } else {
                            var464.field4502 = var466;
                            var464.field4533 = var465;
                            class44 var467 = class81.method616(var465, (byte) 25);
                            var464.field4426 = var467.field665;
                            var464.field4425 = var467.field676;
                            var464.field4497 = var467.field669;
                            var464.field4532 = var467.field681;
                            var464.field4393 = var467.field722;
                            if (var483 == 1205) {
                                var464.field4462 = false;
                            } else {
                                var464.field4462 = true;
                            }
                            var464.field4539 = var467.field664;
                            if (var464.field4515 > 0) {
                                var464.field4425 = var464.field4425 * 32 / var464.field4515;
                            } else if (var464.field4388 > 0) {
                                var464.field4425 = var464.field4425 * 32 / var464.field4388;
                            }
                        }
                        continue;
                    }
                    if (var483 == 1201) {
                        var464.field4412 = 2;
                        var8--;
                        var464.field4438 = class78.field1245[var8];
                        if (var464.field4500 == -1) {
                            class233.method1628((byte) 68, var464.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1202) {
                        var464.field4412 = 3;
                        var464.field4438 = class286.field4920.field1685.method1369((byte) -45);
                        if (var464.field4500 == -1) {
                            class233.method1628((byte) 68, var464.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1203) {
                        var464.field4412 = 6;
                        var8--;
                        var464.field4438 = class78.field1245[var8];
                        if (var464.field4500 == -1) {
                            class233.method1628((byte) 68, var464.field4392);
                        }
                        continue;
                    }
                    if (var483 == 1204) {
                        var464.field4412 = 5;
                        var8--;
                        var464.field4438 = class78.field1245[var8];
                        if (var464.field4500 == -1) {
                            class233.method1628((byte) 68, var464.field4392);
                        }
                        continue;
                    }
                } else if ((var483 < 1300 || var483 >= 1400) && (var483 < 2300 || var483 >= 2400)) {
                    if (var483 >= 1400 && var483 < 1500 || var483 >= 2400 && var483 < 2500) {
                        class263 var453;
                        if (var483 >= 2000) {
                            var483 -= 1000;
                            var8--;
                            var453 = class247.method1738(false, class78.field1245[var8]);
                        } else {
                            var453 = var46 ? class69.field1060 : class284.field4888;
                        }
                        int[] var454 = null;
                        var6--;
                        class59 var455 = class188.field3153[var6];
                        if (var455.method495(-128) > 0 && var455.method492(var455.method495(82) - 1, -122) == 89) {
                            var8--;
                            int var456 = class78.field1245[var8];
                            if (var456 > 0) {
                                var454 = new int[var456];
                                while ((var456--) > 0) {
                                    var8--;
                                    var454[var456] = class78.field1245[var8];
                                }
                            }
                            var455 = var455.method473(var455.method495(91) - 1, 0, (byte) 34);
                        }
                        Object[] var457 = new Object[var455.method495(-125) + 1];
                        for (int var458 = var457.length - 1; var458 >= 1; var458--) {
                            if (var455.method492(var458 - 1, -122) == 115) {
                                var6--;
                                var457[var458] = class188.field3153[var6];
                            } else {
                                var8--;
                                var457[var458] = Integer.valueOf(class78.field1245[var8]);
                            }
                        }
                        var8--;
                        int var459 = class78.field1245[var8];
                        if (var459 == -1) {
                            var457 = null;
                        } else {
                            var457[0] = Integer.valueOf(var459);
                        }
                        if (var483 == 1400) {
                            var453.field4521 = var457;
                        } else if (var483 == 1401) {
                            var453.field4386 = var457;
                        } else if (var483 == 1402) {
                            var453.field4463 = var457;
                        } else if (var483 == 1403) {
                            var453.field4488 = var457;
                        } else if (var483 == 1404) {
                            var453.field4516 = var457;
                        } else if (var483 == 1405) {
                            var453.field4524 = var457;
                        } else if (var483 == 1406) {
                            var453.field4543 = var457;
                        } else if (var483 == 1407) {
                            var453.field4541 = var457;
                            var453.field4526 = var454;
                        } else if (var483 == 1408) {
                            var453.field4498 = var457;
                        } else if (var483 == 1409) {
                            var453.field4480 = var457;
                        } else if (var483 == 1410) {
                            var453.field4443 = var457;
                        } else if (var483 == 1411) {
                            var453.field4430 = var457;
                        } else if (var483 == 1412) {
                            var453.field4416 = var457;
                        } else if (var483 == 1414) {
                            var453.field4399 = var457;
                            var453.field4401 = var454;
                        } else if (var483 == 1415) {
                            var453.field4429 = var454;
                            var453.field4509 = var457;
                        } else if (var483 == 1416) {
                            var453.field4476 = var457;
                        } else if (var483 == 1417) {
                            var453.field4387 = var457;
                        } else if (var483 == 1418) {
                            var453.field4465 = var457;
                        } else if (var483 == 1419) {
                            var453.field4385 = var457;
                        } else if (var483 == 1420) {
                            var453.field4548 = var457;
                        } else if (var483 == 1421) {
                            var453.field4499 = var457;
                        } else if (var483 == 1422) {
                            var453.field4496 = var457;
                        } else if (var483 == 1423) {
                            var453.field4536 = var457;
                        } else if (var483 == 1424) {
                            var453.field4378 = var457;
                        } else if (var483 == 1425) {
                            var453.field4474 = var457;
                        } else if (var483 == 1426) {
                            var453.field4477 = var457;
                        } else if (var483 == 1427) {
                            var453.field4529 = var457;
                        } else if (var483 == 1428) {
                            var453.field4455 = var454;
                            var453.field4508 = var457;
                        } else if (var483 == 1429) {
                            var453.field4446 = var457;
                            var453.field4407 = var454;
                        }
                        var453.field4487 = true;
                        continue;
                    }
                    if (var483 < 1600) {
                        class263 var452 = var46 ? class69.field1060 : class284.field4888;
                        if (var483 == 1500) {
                            class78.field1245[var8++] = var452.field4495;
                            continue;
                        }
                        if (var483 == 1501) {
                            class78.field1245[var8++] = var452.field4546;
                            continue;
                        }
                        if (var483 == 1502) {
                            class78.field1245[var8++] = var452.field4420;
                            continue;
                        }
                        if (var483 == 1503) {
                            class78.field1245[var8++] = var452.field4467;
                            continue;
                        }
                        if (var483 == 1504) {
                            class78.field1245[var8++] = var452.field4547 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 1505) {
                            class78.field1245[var8++] = var452.field4410;
                            continue;
                        }
                    } else if (var483 < 1700) {
                        class263 var451 = var46 ? class69.field1060 : class284.field4888;
                        if (var483 == 1600) {
                            class78.field1245[var8++] = var451.field4405;
                            continue;
                        }
                        if (var483 == 1601) {
                            class78.field1245[var8++] = var451.field4504;
                            continue;
                        }
                        if (var483 == 1602) {
                            class188.field3153[var6++] = var451.field4534;
                            continue;
                        }
                        if (var483 == 1603) {
                            class78.field1245[var8++] = var451.field4449;
                            continue;
                        }
                        if (var483 == 1604) {
                            class78.field1245[var8++] = var451.field4479;
                            continue;
                        }
                        if (var483 == 1605) {
                            class78.field1245[var8++] = var451.field4425;
                            continue;
                        }
                        if (var483 == 1606) {
                            class78.field1245[var8++] = var451.field4393;
                            continue;
                        }
                        if (var483 == 1607) {
                            class78.field1245[var8++] = var451.field4539;
                            continue;
                        }
                        if (var483 == 1608) {
                            class78.field1245[var8++] = var451.field4426;
                            continue;
                        }
                        if (var483 == 1609) {
                            class78.field1245[var8++] = var451.field4489;
                            continue;
                        }
                    } else if (var483 < 1800) {
                        class263 var450 = var46 ? class69.field1060 : class284.field4888;
                        if (var483 == 1700) {
                            class78.field1245[var8++] = var450.field4533;
                            continue;
                        }
                        if (var483 == 1701) {
                            if (var450.field4533 == -1) {
                                class78.field1245[var8++] = 0;
                            } else {
                                class78.field1245[var8++] = var450.field4502;
                            }
                            continue;
                        }
                        if (var483 == 1702) {
                            class78.field1245[var8++] = var450.field4500;
                            continue;
                        }
                    } else if (var483 < 1900) {
                        class263 var448 = var46 ? class69.field1060 : class284.field4888;
                        if (var483 == 1800) {
                            class78.field1245[var8++] = class46.method329(127, client.method278(var448));
                            continue;
                        }
                        if (var483 == 1801) {
                            var8--;
                            int var449 = class78.field1245[var8];
                            int var485 = var449 - 1;
                            if (var448.field4403 != null && var448.field4403.length > var485 && var448.field4403[var485] != null) {
                                class188.field3153[var6++] = var448.field4403[var485];
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 1802) {
                            if (var448.field4511 == null) {
                                class188.field3153[var6++] = class295.field5037;
                            } else {
                                class188.field3153[var6++] = var448.field4511;
                            }
                            continue;
                        }
                    } else if (var483 < 2600) {
                        var8--;
                        class263 var447 = class247.method1738(false, class78.field1245[var8]);
                        if (var483 == 2500) {
                            class78.field1245[var8++] = var447.field4495;
                            continue;
                        }
                        if (var483 == 2501) {
                            class78.field1245[var8++] = var447.field4546;
                            continue;
                        }
                        if (var483 == 2502) {
                            class78.field1245[var8++] = var447.field4420;
                            continue;
                        }
                        if (var483 == 2503) {
                            class78.field1245[var8++] = var447.field4467;
                            continue;
                        }
                        if (var483 == 2504) {
                            class78.field1245[var8++] = var447.field4547 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 2505) {
                            class78.field1245[var8++] = var447.field4410;
                            continue;
                        }
                    } else if (var483 < 2700) {
                        var8--;
                        class263 var446 = class247.method1738(false, class78.field1245[var8]);
                        if (var483 == 2600) {
                            class78.field1245[var8++] = var446.field4405;
                            continue;
                        }
                        if (var483 == 2601) {
                            class78.field1245[var8++] = var446.field4504;
                            continue;
                        }
                        if (var483 == 2602) {
                            class188.field3153[var6++] = var446.field4534;
                            continue;
                        }
                        if (var483 == 2603) {
                            class78.field1245[var8++] = var446.field4449;
                            continue;
                        }
                        if (var483 == 2604) {
                            class78.field1245[var8++] = var446.field4479;
                            continue;
                        }
                        if (var483 == 2605) {
                            class78.field1245[var8++] = var446.field4425;
                            continue;
                        }
                        if (var483 == 2606) {
                            class78.field1245[var8++] = var446.field4393;
                            continue;
                        }
                        if (var483 == 2607) {
                            class78.field1245[var8++] = var446.field4539;
                            continue;
                        }
                        if (var483 == 2608) {
                            class78.field1245[var8++] = var446.field4426;
                            continue;
                        }
                        if (var483 == 2609) {
                            class78.field1245[var8++] = var446.field4489;
                            continue;
                        }
                    } else if (var483 < 2800) {
                        if (var483 == 2700) {
                            var8--;
                            class263 var436 = class247.method1738(false, class78.field1245[var8]);
                            class78.field1245[var8++] = var436.field4533;
                            continue;
                        }
                        if (var483 == 2701) {
                            var8--;
                            class263 var437 = class247.method1738(false, class78.field1245[var8]);
                            if (var437.field4533 == -1) {
                                class78.field1245[var8++] = 0;
                            } else {
                                class78.field1245[var8++] = var437.field4502;
                            }
                            continue;
                        }
                        if (var483 == 2702) {
                            var8--;
                            int var438 = class78.field1245[var8];
                            class297 var439 = (class297) class190.field3181.method685((long) var438, 128);
                            if (var439 == null) {
                                class78.field1245[var8++] = 0;
                            } else {
                                class78.field1245[var8++] = 1;
                            }
                            continue;
                        }
                        if (var483 == 2703) {
                            var8--;
                            class263 var440 = class247.method1738(false, class78.field1245[var8]);
                            if (var440.field4377 == null) {
                                class78.field1245[var8++] = 0;
                                continue;
                            }
                            int var441 = var440.field4377.length;
                            for (int var442 = 0; var442 < var440.field4377.length; var442++) {
                                if (var440.field4377[var442] == null) {
                                    var441 = var442;
                                    break;
                                }
                            }
                            class78.field1245[var8++] = var441;
                            continue;
                        }
                        if (var483 == 2704 || var483 == 2705) {
                            var8 -= 2;
                            int var443 = class78.field1245[var8];
                            int var444 = class78.field1245[var8 + 1];
                            class297 var445 = (class297) class190.field3181.method685((long) var443, 128);
                            if (var445 != null && var445.field5089 == var444) {
                                class78.field1245[var8++] = 1;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                    } else if (var483 < 2900) {
                        var8--;
                        class263 var67 = class247.method1738(false, class78.field1245[var8]);
                        if (var483 == 2800) {
                            class78.field1245[var8++] = class46.method329(127, client.method278(var67));
                            continue;
                        }
                        if (var483 == 2801) {
                            var8--;
                            int var68 = class78.field1245[var8];
                            int var484 = var68 - 1;
                            if (var67.field4403 != null && var67.field4403.length > var484 && var67.field4403[var484] != null) {
                                class188.field3153[var6++] = var67.field4403[var484];
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 2802) {
                            if (var67.field4511 == null) {
                                class188.field3153[var6++] = class295.field5037;
                            } else {
                                class188.field3153[var6++] = var67.field4511;
                            }
                            continue;
                        }
                    } else if (var483 < 3200) {
                        if (var483 == 3100) {
                            var6--;
                            class59 var69 = class188.field3153[var6];
                            class288.method2003(class295.field5037, 0, -124, var69);
                            continue;
                        }
                        if (var483 == 3101) {
                            var8 -= 2;
                            class137.method998(class78.field1245[var8 + 1], class286.field4920, (byte) 107, class78.field1245[var8]);
                            continue;
                        }
                        if (var483 == 3103) {
                            class130.method960(20033);
                            continue;
                        }
                        if (var483 == 3104) {
                            class58.field856++;
                            var6--;
                            class59 var70 = class188.field3153[var6];
                            int var71 = 0;
                            if (var70.method456(101)) {
                                var71 = var70.method485(103);
                            }
                            class234.field3888.method1768(true, 34);
                            class234.field3888.method1213(-1, var71);
                            continue;
                        }
                        if (var483 == 3105) {
                            class209.field3411++;
                            var6--;
                            class59 var72 = class188.field3153[var6];
                            class234.field3888.method1768(true, 205);
                            class234.field3888.method1206(var72.method488((byte) -27), false);
                            continue;
                        }
                        if (var483 == 3106) {
                            class39.field586++;
                            var6--;
                            class59 var73 = class188.field3153[var6];
                            class234.field3888.method1768(true, 232);
                            class234.field3888.method1219(var73.method495(110) + 1, true);
                            class234.field3888.method1236((byte) 48, var73);
                            continue;
                        }
                        if (var483 == 3107) {
                            var8--;
                            int var74 = class78.field1245[var8];
                            var6--;
                            class59 var75 = class188.field3153[var6];
                            class193.method1409(true, var74, var75);
                            continue;
                        }
                        if (var483 == 3108) {
                            var8 -= 3;
                            int var76 = class78.field1245[var8 + 1];
                            int var77 = class78.field1245[var8 + 2];
                            int var78 = class78.field1245[var8];
                            class263 var79 = class247.method1738(false, var77);
                            class132.method965(var76, var78, -117, var79);
                            continue;
                        }
                        if (var483 == 3109) {
                            var8 -= 2;
                            int var80 = class78.field1245[var8];
                            int var81 = class78.field1245[var8 + 1];
                            class263 var82 = var46 ? class69.field1060 : class284.field4888;
                            class132.method965(var81, var80, -124, var82);
                            continue;
                        }
                        if (var483 == 3110) {
                            class9.field127++;
                            var8--;
                            int var83 = class78.field1245[var8];
                            class234.field3888.method1768(true, 197);
                            class234.field3888.method1237(true, var83);
                            continue;
                        }
                    } else if (var483 < 3300) {
                        if (var483 == 3200) {
                            var8 -= 3;
                            class14.method97(class78.field1245[var8 + 2], class78.field1245[var8], class78.field1245[var8 + 1], -27648);
                            continue;
                        }
                        if (var483 == 3201) {
                            var8--;
                            class209.method1472(class78.field1245[var8], -1);
                            continue;
                        }
                        if (var483 == 3202) {
                            var8 -= 2;
                            class92.method673(class78.field1245[var8], class78.field1245[var8 + 1], 0);
                            continue;
                        }
                    } else if (var483 < 3400) {
                        if (var483 == 3300) {
                            class78.field1245[var8++] = class30.field420;
                            continue;
                        }
                        if (var483 == 3301) {
                            var8 -= 2;
                            int var84 = class78.field1245[var8 + 1];
                            int var85 = class78.field1245[var8];
                            class78.field1245[var8++] = class77.method604(var84, (byte) -128, var85);
                            continue;
                        }
                        if (var483 == 3302) {
                            var8 -= 2;
                            int var86 = class78.field1245[var8 + 1];
                            int var87 = class78.field1245[var8];
                            class78.field1245[var8++] = class119.method882(false, var87, var86);
                            continue;
                        }
                        if (var483 == 3303) {
                            var8 -= 2;
                            int var88 = class78.field1245[var8];
                            int var89 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class90.method664(var88, var89, (byte) 37);
                            continue;
                        }
                        if (var483 == 3304) {
                            var8--;
                            int var90 = class78.field1245[var8];
                            class78.field1245[var8++] = class8.method63(var90, 107).field2841;
                            continue;
                        }
                        if (var483 == 3305) {
                            var8--;
                            int var91 = class78.field1245[var8];
                            class78.field1245[var8++] = class101.field1647[var91];
                            continue;
                        }
                        if (var483 == 3306) {
                            var8--;
                            int var92 = class78.field1245[var8];
                            class78.field1245[var8++] = class102.field1666[var92];
                            continue;
                        }
                        if (var483 == 3307) {
                            var8--;
                            int var93 = class78.field1245[var8];
                            class78.field1245[var8++] = class120.field2002[var93];
                            continue;
                        }
                        if (var483 == 3308) {
                            int var94 = (class286.field4920.field1769 >> 7) + class187.field3135;
                            int var95 = (class286.field4920.field1774 >> 7) + class197.field3249;
                            int var96 = class247.field4119;
                            class78.field1245[var8++] = (var95 << 14) + (var96 << 28) + var94;
                            continue;
                        }
                        if (var483 == 3309) {
                            var8--;
                            int var97 = class78.field1245[var8];
                            class78.field1245[var8++] = class93.method680(var97 >> 14, 16383);
                            continue;
                        }
                        if (var483 == 3310) {
                            var8--;
                            int var98 = class78.field1245[var8];
                            class78.field1245[var8++] = var98 >> 28;
                            continue;
                        }
                        if (var483 == 3311) {
                            var8--;
                            int var99 = class78.field1245[var8];
                            class78.field1245[var8++] = class93.method680(16383, var99);
                            continue;
                        }
                        if (var483 == 3312) {
                            class78.field1245[var8++] = class26.field351 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3313) {
                            var8 -= 2;
                            int var100 = class78.field1245[var8] + 32768;
                            int var101 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class77.method604(var101, (byte) -54, var100);
                            continue;
                        }
                        if (var483 == 3314) {
                            var8 -= 2;
                            int var102 = class78.field1245[var8 + 1];
                            int var103 = class78.field1245[var8] + 32768;
                            class78.field1245[var8++] = class119.method882(false, var103, var102);
                            continue;
                        }
                        if (var483 == 3315) {
                            var8 -= 2;
                            int var104 = class78.field1245[var8] + 32768;
                            int var105 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class90.method664(var104, var105, (byte) 37);
                            continue;
                        }
                        if (var483 == 3316) {
                            if (class280.field4793 >= 2) {
                                class78.field1245[var8++] = class280.field4793;
                            } else {
                                class78.field1245[var8++] = 0;
                            }
                            continue;
                        }
                        if (var483 == 3317) {
                            class78.field1245[var8++] = class31.field425;
                            continue;
                        }
                        if (var483 == 3318) {
                            class78.field1245[var8++] = class46.field754;
                            continue;
                        }
                        if (var483 == 3321) {
                            class78.field1245[var8++] = class33.field483;
                            continue;
                        }
                        if (var483 == 3322) {
                            class78.field1245[var8++] = class193.field3213;
                            continue;
                        }
                        if (var483 == 3323) {
                            if (class262.field4375 >= 5 && class262.field4375 <= 9) {
                                class78.field1245[var8++] = 1;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3324) {
                            if (class262.field4375 >= 5 && class262.field4375 <= 9) {
                                class78.field1245[var8++] = class262.field4375;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3325) {
                            class78.field1245[var8++] = class45.field737 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3326) {
                            class78.field1245[var8++] = class286.field4920.field1658;
                            continue;
                        }
                        if (var483 == 3327) {
                            class78.field1245[var8++] = class286.field4920.field1685.field3103 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3328) {
                            class78.field1245[var8++] = class27.field356;
                            continue;
                        }
                        if (var483 == 3329) {
                            class78.field1245[var8++] = class143.field2365;
                            continue;
                        }
                        if (var483 == 3330) {
                            var8--;
                            int var106 = class78.field1245[var8];
                            class78.field1245[var8++] = class308.method2131(var106, 0);
                            continue;
                        }
                        if (var483 == 3331) {
                            var8 -= 2;
                            int var107 = class78.field1245[var8];
                            int var108 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class259.method1799(var108, false, -32004, var107);
                            continue;
                        }
                        if (var483 == 3332) {
                            var8 -= 2;
                            int var109 = class78.field1245[var8];
                            int var110 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class259.method1799(var110, true, -32004, var109);
                            continue;
                        }
                        if (var483 == 3333) {
                            class78.field1245[var8++] = class170.field2730;
                            continue;
                        }
                        if (var483 == 3335) {
                            class78.field1245[var8++] = class178.field2922;
                            continue;
                        }
                    } else if (var483 < 3500) {
                        if (var483 == 3400) {
                            var8 -= 2;
                            int var419 = class78.field1245[var8];
                            int var420 = class78.field1245[var8 + 1];
                            class33 var421 = class87.method651((byte) 98, var419);
                            if (var421.field485 != 115) {
                            }
                            class188.field3153[var6++] = var421.method225(var420, (byte) -10);
                            continue;
                        }
                        if (var483 == 3408) {
                            var8 -= 4;
                            int var422 = class78.field1245[var8];
                            int var423 = class78.field1245[var8 + 1];
                            int var424 = class78.field1245[var8 + 3];
                            int var425 = class78.field1245[var8 + 2];
                            class33 var426 = class87.method651((byte) 98, var425);
                            if (var426.field473 == var422 && var426.field485 == var423) {
                                if (var423 == 115) {
                                    class188.field3153[var6++] = var426.method225(var424, (byte) -10);
                                } else {
                                    class78.field1245[var8++] = var426.method223(var424, 2);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var483 == 3409) {
                            var8 -= 3;
                            int var427 = class78.field1245[var8 + 1];
                            int var428 = class78.field1245[var8];
                            int var429 = class78.field1245[var8 + 2];
                            if (var427 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class33 var430 = class87.method651((byte) 98, var427);
                            if (var430.field485 != var428) {
                                throw new RuntimeException("C3409-1");
                            }
                            class78.field1245[var8++] = var430.method216(var429, -116) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3410) {
                            var8--;
                            int var431 = class78.field1245[var8];
                            var6--;
                            class59 var432 = class188.field3153[var6];
                            if (var431 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class33 var433 = class87.method651((byte) 98, var431);
                            if (var433.field485 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class78.field1245[var8++] = var433.method226(var432, true) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3411) {
                            var8--;
                            int var434 = class78.field1245[var8];
                            class33 var435 = class87.method651((byte) 98, var434);
                            class78.field1245[var8++] = var435.field478.method691(-34);
                            continue;
                        }
                    } else if (var483 < 3700) {
                        if (var483 == 3600) {
                            if (class297.field5085 == 0) {
                                class78.field1245[var8++] = -2;
                            } else if (class297.field5085 == 1) {
                                class78.field1245[var8++] = -1;
                            } else {
                                class78.field1245[var8++] = class293.field5001;
                            }
                            continue;
                        }
                        if (var483 == 3601) {
                            var8--;
                            int var111 = class78.field1245[var8];
                            if (class297.field5085 == 2 && var111 < class293.field5001) {
                                class188.field3153[var6++] = class88.field1380[var111];
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 3602) {
                            var8--;
                            int var112 = class78.field1245[var8];
                            if (class297.field5085 == 2 && var112 < class293.field5001) {
                                class78.field1245[var8++] = class25.field332[var112];
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3603) {
                            var8--;
                            int var113 = class78.field1245[var8];
                            if (class297.field5085 == 2 && var113 < class293.field5001) {
                                class78.field1245[var8++] = class34.field501[var113];
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3604) {
                            var8--;
                            int var114 = class78.field1245[var8];
                            var6--;
                            class59 var115 = class188.field3153[var6];
                            class308.method2129(var114, var115, 75);
                            continue;
                        }
                        if (var483 == 3605) {
                            var6--;
                            class59 var116 = class188.field3153[var6];
                            class297.method2069(var116.method488((byte) 79), false);
                            continue;
                        }
                        if (var483 == 3606) {
                            var6--;
                            class59 var117 = class188.field3153[var6];
                            class161.method1150(var117.method488((byte) 116), 1);
                            continue;
                        }
                        if (var483 == 3607) {
                            var6--;
                            class59 var118 = class188.field3153[var6];
                            class121.method904((byte) 122, var118.method488((byte) -25));
                            continue;
                        }
                        if (var483 == 3608) {
                            var6--;
                            class59 var119 = class188.field3153[var6];
                            class20.method139(var119.method488((byte) 95), (byte) -99);
                            continue;
                        }
                        if (var483 == 3609) {
                            var6--;
                            class59 var120 = class188.field3153[var6];
                            if (var120.method500(class161.field2623, (byte) 127) || var120.method500(class263.field4528, (byte) 127)) {
                                var120 = var120.method497(7, (byte) 60);
                            }
                            class78.field1245[var8++] = class59.method454(-1801, var120) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3610) {
                            var8--;
                            int var121 = class78.field1245[var8];
                            if (class297.field5085 == 2 && var121 < class293.field5001) {
                                class188.field3153[var6++] = class97.field1560[var121];
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 3611) {
                            if (class23.field304 == null) {
                                class188.field3153[var6++] = class295.field5037;
                            } else {
                                class188.field3153[var6++] = class23.field304.method480((byte) 89);
                            }
                            continue;
                        }
                        if (var483 == 3612) {
                            if (class23.field304 == null) {
                                class78.field1245[var8++] = 0;
                            } else {
                                class78.field1245[var8++] = class60.field945;
                            }
                            continue;
                        }
                        if (var483 == 3613) {
                            var8--;
                            int var122 = class78.field1245[var8];
                            if (class23.field304 != null && var122 < class60.field945) {
                                class188.field3153[var6++] = class96.field1524[var122].field1428.method480((byte) 41);
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 3614) {
                            var8--;
                            int var123 = class78.field1245[var8];
                            if (class23.field304 != null && var123 < class60.field945) {
                                class78.field1245[var8++] = class96.field1524[var123].field1429;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3615) {
                            var8--;
                            int var124 = class78.field1245[var8];
                            if (class23.field304 != null && var124 < class60.field945) {
                                class78.field1245[var8++] = class96.field1524[var124].field1431;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3616) {
                            class78.field1245[var8++] = class100.field1608;
                            continue;
                        }
                        if (var483 == 3617) {
                            var6--;
                            class59 var125 = class188.field3153[var6];
                            class7.method52((byte) -87, var125);
                            continue;
                        }
                        if (var483 == 3618) {
                            class78.field1245[var8++] = class72.field1129;
                            continue;
                        }
                        if (var483 == 3619) {
                            var6--;
                            class59 var126 = class188.field3153[var6];
                            class311.method2153(-1, var126.method488((byte) -48));
                            continue;
                        }
                        if (var483 == 3620) {
                            class153.method1095(true);
                            continue;
                        }
                        if (var483 == 3621) {
                            if (class297.field5085 == 0) {
                                class78.field1245[var8++] = -1;
                            } else {
                                class78.field1245[var8++] = class156.field2548;
                            }
                            continue;
                        }
                        if (var483 == 3622) {
                            var8--;
                            int var127 = class78.field1245[var8];
                            if (class297.field5085 != 0 && class156.field2548 > var127) {
                                class188.field3153[var6++] = class151.method1085(1, class305.field5166[var127]).method480((byte) 111);
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 3623) {
                            var6--;
                            class59 var128 = class188.field3153[var6];
                            if (var128.method500(class161.field2623, (byte) 123) || var128.method500(class263.field4528, (byte) 127)) {
                                var128 = var128.method497(7, (byte) 60);
                            }
                            class78.field1245[var8++] = class290.method2012(var128, true) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3624) {
                            var8--;
                            int var129 = class78.field1245[var8];
                            if (class96.field1524 != null && class60.field945 > var129 && class96.field1524[var129].field1428.method472(class286.field4920.field1663, 90)) {
                                class78.field1245[var8++] = 1;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3625) {
                            if (class202.field3345 == null) {
                                class188.field3153[var6++] = class295.field5037;
                            } else {
                                class188.field3153[var6++] = class202.field3345.method480((byte) 73);
                            }
                            continue;
                        }
                        if (var483 == 3626) {
                            var8--;
                            int var130 = class78.field1245[var8];
                            if (class23.field304 != null && var130 < class60.field945) {
                                class188.field3153[var6++] = class96.field1524[var130].field1430;
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 3627) {
                            var8--;
                            int var131 = class78.field1245[var8];
                            if (class297.field5085 == 2 && var131 >= 0 && var131 < class293.field5001) {
                                class78.field1245[var8++] = class87.field1375[var131] ? 1 : 0;
                                continue;
                            }
                            class78.field1245[var8++] = 0;
                            continue;
                        }
                        if (var483 == 3628) {
                            var6--;
                            class59 var132 = class188.field3153[var6];
                            if (var132.method500(class161.field2623, (byte) 127) || var132.method500(class263.field4528, (byte) 126)) {
                                var132 = var132.method497(7, (byte) 60);
                            }
                            class78.field1245[var8++] = class294.method2029(var132, -99);
                            continue;
                        }
                    } else if (var483 < 4000) {
                        if (var483 == 3903) {
                            var8--;
                            int var405 = class78.field1245[var8];
                            class78.field1245[var8++] = class31.field429[var405].method1523((byte) 17);
                            continue;
                        }
                        if (var483 == 3904) {
                            var8--;
                            int var406 = class78.field1245[var8];
                            class78.field1245[var8++] = class31.field429[var406].field3567;
                            continue;
                        }
                        if (var483 == 3905) {
                            var8--;
                            int var407 = class78.field1245[var8];
                            class78.field1245[var8++] = class31.field429[var407].field3564;
                            continue;
                        }
                        if (var483 == 3906) {
                            var8--;
                            int var408 = class78.field1245[var8];
                            class78.field1245[var8++] = class31.field429[var408].field3572;
                            continue;
                        }
                        if (var483 == 3907) {
                            var8--;
                            int var409 = class78.field1245[var8];
                            class78.field1245[var8++] = class31.field429[var409].field3562;
                            continue;
                        }
                        if (var483 == 3908) {
                            var8--;
                            int var410 = class78.field1245[var8];
                            class78.field1245[var8++] = class31.field429[var410].field3565;
                            continue;
                        }
                        if (var483 == 3910) {
                            var8--;
                            int var411 = class78.field1245[var8];
                            int var412 = class31.field429[var411].method1521(111);
                            class78.field1245[var8++] = var412 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3911) {
                            var8--;
                            int var413 = class78.field1245[var8];
                            int var414 = class31.field429[var413].method1521(121);
                            class78.field1245[var8++] = var414 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3912) {
                            var8--;
                            int var415 = class78.field1245[var8];
                            int var416 = class31.field429[var415].method1521(123);
                            class78.field1245[var8++] = var416 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3913) {
                            var8--;
                            int var417 = class78.field1245[var8];
                            int var418 = class31.field429[var417].method1521(119);
                            class78.field1245[var8++] = var418 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var483 < 4100) {
                        if (var483 == 4000) {
                            var8 -= 2;
                            int var360 = class78.field1245[var8];
                            int var361 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = var360 + var361;
                            continue;
                        }
                        if (var483 == 4001) {
                            var8 -= 2;
                            int var362 = class78.field1245[var8 + 1];
                            int var363 = class78.field1245[var8];
                            class78.field1245[var8++] = var363 - var362;
                            continue;
                        }
                        if (var483 == 4002) {
                            var8 -= 2;
                            int var364 = class78.field1245[var8];
                            int var365 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = var364 * var365;
                            continue;
                        }
                        if (var483 == 4003) {
                            var8 -= 2;
                            int var366 = class78.field1245[var8 + 1];
                            int var367 = class78.field1245[var8];
                            class78.field1245[var8++] = var367 / var366;
                            continue;
                        }
                        if (var483 == 4004) {
                            var8--;
                            int var368 = class78.field1245[var8];
                            class78.field1245[var8++] = (int) (Math.random() * (double) var368);
                            continue;
                        }
                        if (var483 == 4005) {
                            var8--;
                            int var369 = class78.field1245[var8];
                            class78.field1245[var8++] = (int) (Math.random() * (double) (var369 + 1));
                            continue;
                        }
                        if (var483 == 4006) {
                            var8 -= 5;
                            int var370 = class78.field1245[var8];
                            int var371 = class78.field1245[var8 + 2];
                            int var372 = class78.field1245[var8 + 1];
                            int var373 = class78.field1245[var8 + 3];
                            int var374 = class78.field1245[var8 + 4];
                            class78.field1245[var8++] = (var372 - var370) * (var374 - var371) / (var373 - var371) + var370;
                            continue;
                        }
                        if (var483 == 4007) {
                            var8 -= 2;
                            long var375 = (long) class78.field1245[var8];
                            long var377 = (long) class78.field1245[var8 + 1];
                            class78.field1245[var8++] = (int) (var375 * var377 / 100L + var375);
                            continue;
                        }
                        if (var483 == 4008) {
                            var8 -= 2;
                            int var379 = class78.field1245[var8 + 1];
                            int var380 = class78.field1245[var8];
                            class78.field1245[var8++] = class239.method1677(0x1 << var379, var380);
                            continue;
                        }
                        if (var483 == 4009) {
                            var8 -= 2;
                            int var381 = class78.field1245[var8];
                            int var382 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class93.method680(var381, -(0x1 << var382) - 1);
                            continue;
                        }
                        if (var483 == 4010) {
                            var8 -= 2;
                            int var383 = class78.field1245[var8 + 1];
                            int var384 = class78.field1245[var8];
                            class78.field1245[var8++] = class93.method680(0x1 << var383, var384) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var483 == 4011) {
                            var8 -= 2;
                            int var385 = class78.field1245[var8];
                            int var386 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = var385 % var386;
                            continue;
                        }
                        if (var483 == 4012) {
                            var8 -= 2;
                            int var387 = class78.field1245[var8];
                            int var388 = class78.field1245[var8 + 1];
                            if (var387 == 0) {
                                class78.field1245[var8++] = 0;
                            } else {
                                class78.field1245[var8++] = (int) Math.pow((double) var387, (double) var388);
                            }
                            continue;
                        }
                        if (var483 == 4013) {
                            var8 -= 2;
                            int var389 = class78.field1245[var8];
                            int var390 = class78.field1245[var8 + 1];
                            if (var389 == 0) {
                                class78.field1245[var8++] = 0;
                            } else if (var390 == 0) {
                                class78.field1245[var8++] = Integer.MAX_VALUE;
                            } else {
                                class78.field1245[var8++] = (int) Math.pow((double) var389, 1.0D / (double) var390);
                            }
                            continue;
                        }
                        if (var483 == 4014) {
                            var8 -= 2;
                            int var391 = class78.field1245[var8];
                            int var392 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = class93.method680(var392, var391);
                            continue;
                        }
                        if (var483 == 4015) {
                            var8 -= 2;
                            int var393 = class78.field1245[var8 + 1];
                            int var394 = class78.field1245[var8];
                            class78.field1245[var8++] = class239.method1677(var393, var394);
                            continue;
                        }
                        if (var483 == 4016) {
                            var8 -= 2;
                            int var395 = class78.field1245[var8];
                            int var396 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = var395 >= var396 ? var396 : var395;
                            continue;
                        }
                        if (var483 == 4017) {
                            var8 -= 2;
                            int var397 = class78.field1245[var8];
                            int var398 = class78.field1245[var8 + 1];
                            class78.field1245[var8++] = var398 >= var397 ? var398 : var397;
                            continue;
                        }
                        if (var483 == 4018) {
                            var8 -= 3;
                            long var399 = (long) class78.field1245[var8];
                            long var401 = (long) class78.field1245[var8 + 1];
                            long var403 = (long) class78.field1245[var8 + 2];
                            class78.field1245[var8++] = (int) (var399 * var403 / var401);
                            continue;
                        }
                    } else if (var483 < 4200) {
                        if (var483 == 4100) {
                            var6--;
                            class59 var133 = class188.field3153[var6];
                            var8--;
                            int var134 = class78.field1245[var8];
                            class188.field3153[var6++] = class233.method1630(new class59[] { var133, class81.method619((byte) -102, var134) }, -2883);
                            continue;
                        }
                        if (var483 == 4101) {
                            var6 -= 2;
                            class59 var135 = class188.field3153[var6 + 1];
                            class59 var136 = class188.field3153[var6];
                            class188.field3153[var6++] = class233.method1630(new class59[] { var136, var135 }, -2883);
                            continue;
                        }
                        if (var483 == 4102) {
                            var6--;
                            class59 var137 = class188.field3153[var6];
                            var8--;
                            int var138 = class78.field1245[var8];
                            class188.field3153[var6++] = class233.method1630(new class59[] { var137, class9.method70(true, -26248, var138) }, -2883);
                            continue;
                        }
                        if (var483 == 4103) {
                            var6--;
                            class59 var139 = class188.field3153[var6];
                            class188.field3153[var6++] = var139.method466(119);
                            continue;
                        }
                        if (var483 == 4104) {
                            var8--;
                            int var140 = class78.field1245[var8];
                            long var141 = (long) var140 * 86400000L + 1014768000000L;
                            class97.field1541.setTime(new Date(var141));
                            int var143 = class97.field1541.get(5);
                            int var144 = class97.field1541.get(2);
                            int var145 = class97.field1541.get(1);
                            class188.field3153[var6++] = class233.method1630(new class59[] { class81.method619((byte) -95, var143), class182.field3057, class72.field1134[var144], class182.field3057, class81.method619((byte) -125, var145) }, -2883);
                            continue;
                        }
                        if (var483 == 4105) {
                            var6 -= 2;
                            class59 var146 = class188.field3153[var6];
                            class59 var147 = class188.field3153[var6 + 1];
                            if (class286.field4920.field1685 != null && class286.field4920.field1685.field3103) {
                                class188.field3153[var6++] = var147;
                                continue;
                            }
                            class188.field3153[var6++] = var146;
                            continue;
                        }
                        if (var483 == 4106) {
                            var8--;
                            int var148 = class78.field1245[var8];
                            class188.field3153[var6++] = class81.method619((byte) -106, var148);
                            continue;
                        }
                        if (var483 == 4107) {
                            var6 -= 2;
                            class78.field1245[var8++] = class188.field3153[var6].method479(-1, class188.field3153[var6 + 1]);
                            continue;
                        }
                        if (var483 == 4108) {
                            var8 -= 2;
                            var6--;
                            class59 var149 = class188.field3153[var6];
                            int var150 = class78.field1245[var8];
                            int var151 = class78.field1245[var8 + 1];
                            byte[] var152 = class171.field2824.method2042(var151, 0, (byte) -127);
                            class118 var153 = new class118(var152);
                            var153.method714(class130.field2160, (int[]) null);
                            class78.field1245[var8++] = var153.method717(var149, var150);
                            continue;
                        }
                        if (var483 == 4109) {
                            var8 -= 2;
                            var6--;
                            class59 var154 = class188.field3153[var6];
                            int var155 = class78.field1245[var8];
                            int var156 = class78.field1245[var8 + 1];
                            byte[] var157 = class171.field2824.method2042(var156, 0, (byte) -120);
                            class118 var158 = new class118(var157);
                            var158.method714(class130.field2160, (int[]) null);
                            class78.field1245[var8++] = var158.method701(var154, var155);
                            continue;
                        }
                        if (var483 == 4110) {
                            var6 -= 2;
                            class59 var159 = class188.field3153[var6];
                            class59 var160 = class188.field3153[var6 + 1];
                            var8--;
                            if (class78.field1245[var8] == 1) {
                                class188.field3153[var6++] = var159;
                            } else {
                                class188.field3153[var6++] = var160;
                            }
                            continue;
                        }
                        if (var483 == 4111) {
                            var6--;
                            class59 var161 = class188.field3153[var6];
                            class188.field3153[var6++] = class95.method708(var161);
                            continue;
                        }
                        if (var483 == 4112) {
                            var8--;
                            int var162 = class78.field1245[var8];
                            var6--;
                            class59 var163 = class188.field3153[var6];
                            if (var162 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class188.field3153[var6++] = var163.method487(var162, -67);
                            continue;
                        }
                        if (var483 == 4113) {
                            var8--;
                            int var164 = class78.field1245[var8];
                            class78.field1245[var8++] = class125.method925(true, var164) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4114) {
                            var8--;
                            int var165 = class78.field1245[var8];
                            class78.field1245[var8++] = class223.method1543(var165, 128) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4115) {
                            var8--;
                            int var166 = class78.field1245[var8];
                            class78.field1245[var8++] = class44.method300(90, var166) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4116) {
                            var8--;
                            int var167 = class78.field1245[var8];
                            class78.field1245[var8++] = class40.method260(var167, (byte) -46) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4117) {
                            var6--;
                            class59 var168 = class188.field3153[var6];
                            if (var168 == null) {
                                class78.field1245[var8++] = 0;
                            } else {
                                class78.field1245[var8++] = var168.method495(-118);
                            }
                            continue;
                        }
                        if (var483 == 4118) {
                            var8 -= 2;
                            int var169 = class78.field1245[var8];
                            var6--;
                            class59 var170 = class188.field3153[var6];
                            int var171 = class78.field1245[var8 + 1];
                            class188.field3153[var6++] = var170.method473(var171, var169, (byte) 69);
                            continue;
                        }
                        if (var483 == 4119) {
                            var6--;
                            class59 var172 = class188.field3153[var6];
                            boolean var173 = false;
                            class59 var174 = class90.method670(0, var172.method495(-126));
                            for (int var175 = 0; var175 < var172.method495(-121); var175++) {
                                int var176 = var172.method492(var175, 51);
                                if (var176 == 60) {
                                    var173 = true;
                                } else if (var176 == 62) {
                                    var173 = false;
                                } else if (!var173) {
                                    var174.method484(var176, (byte) -121);
                                }
                            }
                            var174.method490(0);
                            class188.field3153[var6++] = var174;
                            continue;
                        }
                        if (var483 == 4120) {
                            var8 -= 2;
                            int var177 = class78.field1245[var8];
                            int var178 = class78.field1245[var8 + 1];
                            var6--;
                            class59 var179 = class188.field3153[var6];
                            class78.field1245[var8++] = var179.method476(0, var177, var178);
                            continue;
                        }
                        if (var483 == 4121) {
                            var6 -= 2;
                            class59 var180 = class188.field3153[var6 + 1];
                            class59 var181 = class188.field3153[var6];
                            var8--;
                            int var182 = class78.field1245[var8];
                            class78.field1245[var8++] = var181.method481(var180, (byte) 118, var182);
                            continue;
                        }
                        if (var483 == 4122) {
                            var8--;
                            int var183 = class78.field1245[var8];
                            class78.field1245[var8++] = class218.method1516(var183, (byte) -58);
                            continue;
                        }
                        if (var483 == 4123) {
                            var8--;
                            int var184 = class78.field1245[var8];
                            class78.field1245[var8++] = class71.method577(var184, -26891);
                            continue;
                        }
                    } else if (var483 < 4300) {
                        if (var483 == 4200) {
                            var8--;
                            int var185 = class78.field1245[var8];
                            class188.field3153[var6++] = class81.method616(var185, (byte) 25).field699;
                            continue;
                        }
                        if (var483 == 4201) {
                            var8 -= 2;
                            int var186 = class78.field1245[var8 + 1];
                            int var187 = class78.field1245[var8];
                            class44 var188 = class81.method616(var187, (byte) 25);
                            if (var186 >= 1 && var186 <= 5 && var188.field661[var186 - 1] != null) {
                                class188.field3153[var6++] = var188.field661[var186 - 1];
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 4202) {
                            var8 -= 2;
                            int var189 = class78.field1245[var8];
                            int var190 = class78.field1245[var8 + 1];
                            class44 var191 = class81.method616(var189, (byte) 25);
                            if (var190 >= 1 && var190 <= 5 && var191.field704[var190 - 1] != null) {
                                class188.field3153[var6++] = var191.field704[var190 - 1];
                                continue;
                            }
                            class188.field3153[var6++] = class295.field5037;
                            continue;
                        }
                        if (var483 == 4203) {
                            var8--;
                            int var192 = class78.field1245[var8];
                            class78.field1245[var8++] = class81.method616(var192, (byte) 25).field703;
                            continue;
                        }
                        if (var483 == 4204) {
                            var8--;
                            int var193 = class78.field1245[var8];
                            class78.field1245[var8++] = class81.method616(var193, (byte) 25).field682 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4205) {
                            var8--;
                            int var194 = class78.field1245[var8];
                            class44 var195 = class81.method616(var194, (byte) 25);
                            if (var195.field673 == -1 && var195.field684 >= 0) {
                                class78.field1245[var8++] = var195.field684;
                                continue;
                            }
                            class78.field1245[var8++] = var194;
                            continue;
                        }
                        if (var483 == 4206) {
                            var8--;
                            int var196 = class78.field1245[var8];
                            class44 var197 = class81.method616(var196, (byte) 25);
                            if (var197.field673 >= 0 && var197.field684 >= 0) {
                                class78.field1245[var8++] = var197.field684;
                                continue;
                            }
                            class78.field1245[var8++] = var196;
                            continue;
                        }
                        if (var483 == 4207) {
                            var8--;
                            int var198 = class78.field1245[var8];
                            class78.field1245[var8++] = class81.method616(var198, (byte) 25).field712 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4208) {
                            var8 -= 2;
                            int var199 = class78.field1245[var8];
                            int var200 = class78.field1245[var8 + 1];
                            class8 var201 = class31.method208(var200, 0);
                            if (var201.method61(1002)) {
                                class188.field3153[var6++] = class81.method616(var199, (byte) 25).method302(var200, var201.field97, -1);
                            } else {
                                class78.field1245[var8++] = class81.method616(var199, (byte) 25).method297(var201.field107, var200, (byte) 125);
                            }
                            continue;
                        }
                        if (var483 == 4210) {
                            var8--;
                            int var202 = class78.field1245[var8];
                            var6--;
                            class59 var203 = class188.field3153[var6];
                            class33.method218(var203, var202 == 1, (byte) -110);
                            class78.field1245[var8++] = class86.field1361;
                            continue;
                        }
                        if (var483 == 4211) {
                            if (class150.field2460 != null && class44.field675 < class86.field1361) {
                                class78.field1245[var8++] = class93.method680(65535, class150.field2460[class44.field675++]);
                                continue;
                            }
                            class78.field1245[var8++] = -1;
                            continue;
                        }
                        if (var483 == 4212) {
                            class44.field675 = 0;
                            continue;
                        }
                    } else if (var483 < 4400) {
                        if (var483 == 4300) {
                            var8 -= 2;
                            int var204 = class78.field1245[var8 + 1];
                            int var205 = class78.field1245[var8];
                            class8 var206 = class31.method208(var204, 0);
                            if (var206.method61(1002)) {
                                class188.field3153[var6++] = class37.method249(var205, (byte) 102).method879(var204, var206.field97, (byte) 112);
                            } else {
                                class78.field1245[var8++] = class37.method249(var205, (byte) 85).method892(var204, var206.field107, 65535);
                            }
                            continue;
                        }
                        if (var483 == 4301) {
                            var8--;
                            int var207 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var207, (byte) 112).field1987;
                            continue;
                        }
                        if (var483 == 4302) {
                            var8--;
                            int var208 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var208, (byte) 69).field1955;
                            continue;
                        }
                        if (var483 == 4303) {
                            var8--;
                            int var209 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var209, (byte) 121).field1960;
                            continue;
                        }
                        if (var483 == 4304) {
                            var8--;
                            int var210 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var210, (byte) 95).field1940;
                            continue;
                        }
                        if (var483 == 4305) {
                            var8--;
                            int var211 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var211, (byte) 126).field1988;
                            continue;
                        }
                        if (var483 == 4306) {
                            var8--;
                            int var212 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var212, (byte) 109).field1986;
                            continue;
                        }
                        if (var483 == 4307) {
                            var8--;
                            int var213 = class78.field1245[var8];
                            class78.field1245[var8++] = class37.method249(var213, (byte) 97).field1972;
                            continue;
                        }
                    } else if (var483 >= 4500) {
                        if (var483 < 4600) {
                            if (var483 == 4500) {
                                var8 -= 2;
                                int var214 = class78.field1245[var8];
                                int var215 = class78.field1245[var8 + 1];
                                class8 var216 = class31.method208(var215, 0);
                                if (var216.method61(1002)) {
                                    class188.field3153[var6++] = class281.method1978(var214, -1000000).method1511(0, var215, var216.field97);
                                } else {
                                    class78.field1245[var8++] = class281.method1978(var214, -1000000).method1515(29203, var215, var216.field107);
                                }
                                continue;
                            }
                        } else if (var483 < 5100) {
                            if (var483 == 5000) {
                                class78.field1245[var8++] = class286.field4914;
                                continue;
                            }
                            if (var483 == 5001) {
                                var8 -= 3;
                                class230.field3775++;
                                class286.field4914 = class78.field1245[var8];
                                class44.field678 = class78.field1245[var8 + 1];
                                class11.field141 = class78.field1245[var8 + 2];
                                class234.field3888.method1768(true, 220);
                                class234.field3888.method1219(class286.field4914, true);
                                class234.field3888.method1219(class44.field678, true);
                                class234.field3888.method1219(class11.field141, true);
                                continue;
                            }
                            if (var483 == 5002) {
                                var6--;
                                class59 var294 = class188.field3153[var6];
                                var8 -= 2;
                                class100.field1625++;
                                int var295 = class78.field1245[var8 + 1];
                                int var296 = class78.field1245[var8];
                                class234.field3888.method1768(true, 0);
                                class234.field3888.method1206(var294.method488((byte) 88), false);
                                class234.field3888.method1219(var296 - 1, true);
                                class234.field3888.method1219(var295, true);
                                continue;
                            }
                            if (var483 == 5003) {
                                var8--;
                                int var297 = class78.field1245[var8];
                                class59 var298 = null;
                                if (var297 < 100) {
                                    var298 = class182.field3052[var297];
                                }
                                if (var298 == null) {
                                    var298 = class295.field5037;
                                }
                                class188.field3153[var6++] = var298;
                                continue;
                            }
                            if (var483 == 5004) {
                                var8--;
                                int var299 = class78.field1245[var8];
                                int var300 = -1;
                                if (var299 < 100 && class182.field3052[var299] != null) {
                                    var300 = class197.field3255[var299];
                                }
                                class78.field1245[var8++] = var300;
                                continue;
                            }
                            if (var483 == 5005) {
                                class78.field1245[var8++] = class44.field678;
                                continue;
                            }
                            if (var483 == 5008) {
                                var6--;
                                class59 var301 = class188.field3153[var6];
                                if (!var301.method500(class310.field5266, (byte) 122)) {
                                    if (class280.field4793 == 0 && (class27.field356 == 1 || class143.field2365 == 1)) {
                                        continue;
                                    }
                                    class137.field2259++;
                                    byte var302 = 0;
                                    class59 var303 = var301.method466(126);
                                    byte var304 = 0;
                                    if (var303.method500(class218.field3548, (byte) 126)) {
                                        var301 = var301.method497(class218.field3548.method495(-119), (byte) 60);
                                        var302 = 0;
                                    } else if (var303.method500(class190.field3186, (byte) 127)) {
                                        var301 = var301.method497(class190.field3186.method495(-113), (byte) 60);
                                        var302 = 1;
                                    } else if (var303.method500(class198.field3280, (byte) 122)) {
                                        var301 = var301.method497(class198.field3280.method495(112), (byte) 60);
                                        var302 = 2;
                                    } else if (var303.method500(class77.field1224, (byte) 127)) {
                                        var301 = var301.method497(class77.field1224.method495(74), (byte) 60);
                                        var302 = 3;
                                    } else if (var303.method500(class255.field4232, (byte) 121)) {
                                        var302 = 4;
                                        var301 = var301.method497(class255.field4232.method495(75), (byte) 60);
                                    } else if (var303.method500(class6.field61, (byte) 125)) {
                                        var301 = var301.method497(class6.field61.method495(117), (byte) 60);
                                        var302 = 5;
                                    } else if (var303.method500(class39.field591, (byte) 126)) {
                                        var302 = 6;
                                        var301 = var301.method497(class39.field591.method495(86), (byte) 60);
                                    } else if (var303.method500(class300.field5133, (byte) 124)) {
                                        var301 = var301.method497(class300.field5133.method495(-119), (byte) 60);
                                        var302 = 7;
                                    } else if (var303.method500(class151.field2496, (byte) 121)) {
                                        var301 = var301.method497(class151.field2496.method495(-119), (byte) 60);
                                        var302 = 8;
                                    } else if (var303.method500(class223.field3623, (byte) 123)) {
                                        var301 = var301.method497(class223.field3623.method495(38), (byte) 60);
                                        var302 = 9;
                                    } else if (var303.method500(class255.field4246, (byte) 127)) {
                                        var301 = var301.method497(class255.field4246.method495(49), (byte) 60);
                                        var302 = 10;
                                    } else if (var303.method500(class98.field1572, (byte) 123)) {
                                        var302 = 11;
                                        var301 = var301.method497(class98.field1572.method495(-124), (byte) 60);
                                    } else if (class178.field2922 != 0) {
                                        if (var303.method500(class218.field3550, (byte) 124)) {
                                            var301 = var301.method497(class218.field3550.method495(96), (byte) 60);
                                            var302 = 0;
                                        } else if (var303.method500(class190.field3189, (byte) 127)) {
                                            var302 = 1;
                                            var301 = var301.method497(class190.field3189.method495(29), (byte) 60);
                                        } else if (var303.method500(class198.field3272, (byte) 124)) {
                                            var302 = 2;
                                            var301 = var301.method497(class198.field3272.method495(36), (byte) 60);
                                        } else if (var303.method500(class77.field1228, (byte) 124)) {
                                            var302 = 3;
                                            var301 = var301.method497(class77.field1228.method495(49), (byte) 60);
                                        } else if (var303.method500(class255.field4247, (byte) 123)) {
                                            var301 = var301.method497(class255.field4247.method495(-113), (byte) 60);
                                            var302 = 4;
                                        } else if (var303.method500(class6.field63, (byte) 122)) {
                                            var301 = var301.method497(class6.field63.method495(-115), (byte) 60);
                                            var302 = 5;
                                        } else if (var303.method500(class39.field596, (byte) 126)) {
                                            var301 = var301.method497(class39.field596.method495(56), (byte) 60);
                                            var302 = 6;
                                        } else if (var303.method500(class300.field5130, (byte) 125)) {
                                            var302 = 7;
                                            var301 = var301.method497(class300.field5130.method495(77), (byte) 60);
                                        } else if (var303.method500(class151.field2483, (byte) 127)) {
                                            var302 = 8;
                                            var301 = var301.method497(class151.field2483.method495(41), (byte) 60);
                                        } else if (var303.method500(class223.field3616, (byte) 125)) {
                                            var301 = var301.method497(class223.field3616.method495(113), (byte) 60);
                                            var302 = 9;
                                        } else if (var303.method500(class255.field4240, (byte) 127)) {
                                            var301 = var301.method497(class255.field4240.method495(98), (byte) 60);
                                            var302 = 10;
                                        } else if (var303.method500(class98.field1579, (byte) 124)) {
                                            var301 = var301.method497(class98.field1579.method495(41), (byte) 60);
                                            var302 = 11;
                                        }
                                    }
                                    class59 var305 = var301.method466(126);
                                    if (var305.method500(class239.field3987, (byte) 124)) {
                                        var301 = var301.method497(class239.field3987.method495(-125), (byte) 60);
                                        var304 = 1;
                                    } else if (var305.method500(class150.field2478, (byte) 127)) {
                                        var301 = var301.method497(class150.field2478.method495(64), (byte) 60);
                                        var304 = 2;
                                    } else if (var305.method500(class183.field3071, (byte) 122)) {
                                        var304 = 3;
                                        var301 = var301.method497(class183.field3071.method495(-123), (byte) 60);
                                    } else if (var305.method500(class248.field4125, (byte) 127)) {
                                        var301 = var301.method497(class248.field4125.method495(124), (byte) 60);
                                        var304 = 4;
                                    } else if (var305.method500(class285.field4903, (byte) 123)) {
                                        var304 = 5;
                                        var301 = var301.method497(class285.field4903.method495(-113), (byte) 60);
                                    } else if (class178.field2922 != 0) {
                                        if (var305.method500(class239.field3996, (byte) 123)) {
                                            var304 = 1;
                                            var301 = var301.method497(class239.field3996.method495(-112), (byte) 60);
                                        } else if (var305.method500(class150.field2481, (byte) 121)) {
                                            var304 = 2;
                                            var301 = var301.method497(class150.field2481.method495(-116), (byte) 60);
                                        } else if (var305.method500(class183.field3070, (byte) 123)) {
                                            var304 = 3;
                                            var301 = var301.method497(class183.field3070.method495(14), (byte) 60);
                                        } else if (var305.method500(class248.field4138, (byte) 127)) {
                                            var301 = var301.method497(class248.field4138.method495(-125), (byte) 60);
                                            var304 = 4;
                                        } else if (var305.method500(class285.field4905, (byte) 121)) {
                                            var301 = var301.method497(class285.field4905.method495(-123), (byte) 60);
                                            var304 = 5;
                                        }
                                    }
                                    class234.field3888.method1768(true, 61);
                                    class234.field3888.method1219(0, true);
                                    int var306 = class234.field3888.field2787;
                                    class234.field3888.method1219(var302, true);
                                    class234.field3888.method1219(var304, true);
                                    class245.method1734(0, class234.field3888, var301);
                                    class234.field3888.method1215(class234.field3888.field2787 - var306, 126);
                                    continue;
                                }
                                class174.method1279(0, var301);
                                continue;
                            }
                            if (var483 == 5009) {
                                var6 -= 2;
                                class59 var307 = class188.field3153[var6];
                                class59 var308 = class188.field3153[var6 + 1];
                                if (class280.field4793 != 0 || class27.field356 != 1 && class143.field2365 != 1) {
                                    class234.field3888.method1768(true, 12);
                                    class229.field3699++;
                                    class234.field3888.method1219(0, true);
                                    int var309 = class234.field3888.field2787;
                                    class234.field3888.method1206(var307.method488((byte) 83), false);
                                    class245.method1734(0, class234.field3888, var308);
                                    class234.field3888.method1215(class234.field3888.field2787 - var309, 106);
                                }
                                continue;
                            }
                            if (var483 == 5010) {
                                var8--;
                                int var310 = class78.field1245[var8];
                                class59 var311 = null;
                                if (var310 < 100) {
                                    var311 = class80.field1274[var310];
                                }
                                if (var311 == null) {
                                    var311 = class295.field5037;
                                }
                                class188.field3153[var6++] = var311;
                                continue;
                            }
                            if (var483 == 5011) {
                                var8--;
                                int var312 = class78.field1245[var8];
                                class59 var313 = null;
                                if (var312 < 100) {
                                    var313 = class128.field2095[var312];
                                }
                                if (var313 == null) {
                                    var313 = class295.field5037;
                                }
                                class188.field3153[var6++] = var313;
                                continue;
                            }
                            if (var483 == 5012) {
                                var8--;
                                int var314 = class78.field1245[var8];
                                int var315 = -1;
                                if (var314 < 100) {
                                    var315 = class75.field1185[var314];
                                }
                                class78.field1245[var8++] = var315;
                                continue;
                            }
                            if (var483 == 5015) {
                                class59 var316;
                                if (class286.field4920 == null || class286.field4920.field1663 == null) {
                                    var316 = class275.field4744;
                                } else {
                                    var316 = class286.field4920.method771(569);
                                }
                                class188.field3153[var6++] = var316;
                                continue;
                            }
                            if (var483 == 5016) {
                                class78.field1245[var8++] = class11.field141;
                                continue;
                            }
                            if (var483 == 5017) {
                                class78.field1245[var8++] = class119.field1923;
                                continue;
                            }
                            if (var483 == 5050) {
                                var8--;
                                int var317 = class78.field1245[var8];
                                class188.field3153[var6++] = class127.method932(var317, 24058).field1328;
                                continue;
                            }
                            if (var483 == 5051) {
                                var8--;
                                int var318 = class78.field1245[var8];
                                class85 var319 = class127.method932(var318, 24058);
                                if (var319.field1341 == null) {
                                    class78.field1245[var8++] = 0;
                                } else {
                                    class78.field1245[var8++] = var319.field1341.length;
                                }
                                continue;
                            }
                            if (var483 == 5052) {
                                var8 -= 2;
                                int var320 = class78.field1245[var8 + 1];
                                int var321 = class78.field1245[var8];
                                class85 var322 = class127.method932(var321, 24058);
                                int var323 = var322.field1341[var320];
                                class78.field1245[var8++] = var323;
                                continue;
                            }
                            if (var483 == 5053) {
                                var8--;
                                int var324 = class78.field1245[var8];
                                class85 var325 = class127.method932(var324, 24058);
                                if (var325.field1330 == null) {
                                    class78.field1245[var8++] = 0;
                                } else {
                                    class78.field1245[var8++] = var325.field1330.length;
                                }
                                continue;
                            }
                            if (var483 == 5054) {
                                var8 -= 2;
                                int var326 = class78.field1245[var8];
                                int var327 = class78.field1245[var8 + 1];
                                class78.field1245[var8++] = class127.method932(var326, 24058).field1330[var327];
                                continue;
                            }
                            if (var483 == 5055) {
                                var8--;
                                int var328 = class78.field1245[var8];
                                class188.field3153[var6++] = class9.method68(var328, (byte) -74).method121(-2325);
                                continue;
                            }
                            if (var483 == 5056) {
                                var8--;
                                int var329 = class78.field1245[var8];
                                class18 var330 = class9.method68(var329, (byte) -33);
                                if (var330.field243 == null) {
                                    class78.field1245[var8++] = 0;
                                } else {
                                    class78.field1245[var8++] = var330.field243.length;
                                }
                                continue;
                            }
                            if (var483 == 5057) {
                                var8 -= 2;
                                int var331 = class78.field1245[var8];
                                int var332 = class78.field1245[var8 + 1];
                                class78.field1245[var8++] = class9.method68(var331, (byte) 99).field243[var332];
                                continue;
                            }
                            if (var483 == 5058) {
                                class14.field196 = new class248();
                                var8--;
                                class14.field196.field4133 = class78.field1245[var8];
                                class14.field196.field4132 = class9.method68(class14.field196.field4133, (byte) 69);
                                class14.field196.field4128 = new int[class14.field196.field4132.method120(2043)];
                                continue;
                            }
                            if (var483 == 5059) {
                                class159.field2594++;
                                class234.field3888.method1768(true, 204);
                                class234.field3888.method1219(0, true);
                                int var333 = class234.field3888.field2787;
                                class234.field3888.method1219(0, true);
                                class234.field3888.method1237(true, class14.field196.field4133);
                                class14.field196.field4132.method113(class14.field196.field4128, 0, class234.field3888);
                                class234.field3888.method1215(class234.field3888.field2787 - var333, 122);
                                continue;
                            }
                            if (var483 == 5060) {
                                class230.field3779++;
                                var6--;
                                class59 var334 = class188.field3153[var6];
                                class234.field3888.method1768(true, 36);
                                class234.field3888.method1219(0, true);
                                int var335 = class234.field3888.field2787;
                                class234.field3888.method1206(var334.method488((byte) -89), false);
                                class234.field3888.method1237(true, class14.field196.field4133);
                                class14.field196.field4132.method113(class14.field196.field4128, 0, class234.field3888);
                                class234.field3888.method1215(class234.field3888.field2787 - var335, 116);
                                continue;
                            }
                            if (var483 == 5061) {
                                class159.field2594++;
                                class234.field3888.method1768(true, 204);
                                class234.field3888.method1219(0, true);
                                int var336 = class234.field3888.field2787;
                                class234.field3888.method1219(1, true);
                                class234.field3888.method1237(true, class14.field196.field4133);
                                class14.field196.field4132.method113(class14.field196.field4128, 0, class234.field3888);
                                class234.field3888.method1215(class234.field3888.field2787 - var336, 122);
                                continue;
                            }
                            if (var483 == 5062) {
                                var8 -= 2;
                                int var337 = class78.field1245[var8];
                                int var338 = class78.field1245[var8 + 1];
                                class78.field1245[var8++] = class127.method932(var337, 24058).field1325[var338];
                                continue;
                            }
                            if (var483 == 5063) {
                                var8 -= 2;
                                int var339 = class78.field1245[var8];
                                int var340 = class78.field1245[var8 + 1];
                                class78.field1245[var8++] = class127.method932(var339, 24058).field1338[var340];
                                continue;
                            }
                            if (var483 == 5064) {
                                var8 -= 2;
                                int var341 = class78.field1245[var8];
                                int var342 = class78.field1245[var8 + 1];
                                if (var342 == -1) {
                                    class78.field1245[var8++] = -1;
                                } else {
                                    class78.field1245[var8++] = class127.method932(var341, 24058).method637(0, var342);
                                }
                                continue;
                            }
                            if (var483 == 5065) {
                                var8 -= 2;
                                int var343 = class78.field1245[var8];
                                int var344 = class78.field1245[var8 + 1];
                                if (var344 == -1) {
                                    class78.field1245[var8++] = -1;
                                } else {
                                    class78.field1245[var8++] = class127.method932(var343, 24058).method633(1, var344);
                                }
                                continue;
                            }
                            if (var483 == 5066) {
                                var8--;
                                int var345 = class78.field1245[var8];
                                class78.field1245[var8++] = class9.method68(var345, (byte) 63).method120(2043);
                                continue;
                            }
                            if (var483 == 5067) {
                                var8 -= 2;
                                int var346 = class78.field1245[var8 + 1];
                                int var347 = class78.field1245[var8];
                                int var348 = class9.method68(var347, (byte) 75).method116(var346, -1);
                                class78.field1245[var8++] = var348;
                                continue;
                            }
                            if (var483 == 5068) {
                                var8 -= 2;
                                int var349 = class78.field1245[var8 + 1];
                                int var350 = class78.field1245[var8];
                                class14.field196.field4128[var350] = var349;
                                continue;
                            }
                            if (var483 == 5069) {
                                var8 -= 2;
                                int var351 = class78.field1245[var8];
                                int var352 = class78.field1245[var8 + 1];
                                class14.field196.field4128[var351] = var352;
                                continue;
                            }
                            if (var483 == 5070) {
                                var8 -= 3;
                                int var353 = class78.field1245[var8];
                                int var354 = class78.field1245[var8 + 1];
                                int var355 = class78.field1245[var8 + 2];
                                class18 var356 = class9.method68(var353, (byte) -126);
                                if (var356.method116(var354, -1) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class78.field1245[var8++] = var356.method118(var354, var355, 60);
                                continue;
                            }
                        } else if (var483 < 5200) {
                            if (var483 == 5100) {
                                if (class317.field5350[86]) {
                                    class78.field1245[var8++] = 1;
                                } else {
                                    class78.field1245[var8++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5101) {
                                if (class317.field5350[82]) {
                                    class78.field1245[var8++] = 1;
                                } else {
                                    class78.field1245[var8++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5102) {
                                if (class317.field5350[81]) {
                                    class78.field1245[var8++] = 1;
                                } else {
                                    class78.field1245[var8++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 5300) {
                            if (var483 == 5200) {
                                var8--;
                                class270.method1886(-10312, class78.field1245[var8]);
                                continue;
                            }
                            if (var483 == 5201) {
                                class78.field1245[var8++] = class170.method1229(57);
                                continue;
                            }
                            if (var483 == 5202) {
                                var8--;
                                class84.method628(-110, class78.field1245[var8]);
                                continue;
                            }
                            if (var483 == 5203) {
                                var6--;
                                class202.method1447(class188.field3153[var6], (byte) -29);
                                continue;
                            }
                            if (var483 == 5204) {
                                class188.field3153[var6 - 1] = class219.method1518(class188.field3153[var6 - 1], (byte) -112);
                                continue;
                            }
                            if (var483 == 5205) {
                                var6--;
                                class8.method64((byte) 43, class188.field3153[var6]);
                                continue;
                            }
                            if (var483 == 5206) {
                                var8--;
                                int var291 = class78.field1245[var8];
                                class270 var292 = class53.method370(var291 >> 14 & 0x3FFF, (byte) -46, var291 & 0x3FFF);
                                if (var292 == null) {
                                    class188.field3153[var6++] = class295.field5037;
                                } else {
                                    class188.field3153[var6++] = var292.field4692;
                                }
                                continue;
                            }
                            if (var483 == 5207) {
                                var6--;
                                class270 var293 = class140.method1021(6, class188.field3153[var6]);
                                if (var293 != null && var293.field4684 != null) {
                                    class188.field3153[var6++] = var293.field4684;
                                    continue;
                                }
                                class188.field3153[var6++] = class295.field5037;
                                continue;
                            }
                        } else if (var483 < 5400) {
                            if (var483 == 5300) {
                                var8 -= 2;
                                int var278 = class78.field1245[var8];
                                int var279 = class78.field1245[var8 + 1];
                                class289.method2007((byte) -31, 3, false, var278, var279);
                                class78.field1245[var8++] = class232.field3811 == null ? 0 : 1;
                                continue;
                            }
                            if (var483 == 5301) {
                                if (class232.field3811 != null) {
                                    class289.method2007((byte) -35, class262.field4362, false, -1, -1);
                                }
                                continue;
                            }
                            if (var483 == 5302) {
                                class143[] var280 = class285.method1993(-1);
                                class78.field1245[var8++] = var280.length;
                                continue;
                            }
                            if (var483 == 5303) {
                                var8--;
                                int var281 = class78.field1245[var8];
                                class143[] var282 = class285.method1993(-1);
                                class78.field1245[var8++] = var282[var281].field2367;
                                class78.field1245[var8++] = var282[var281].field2364;
                                continue;
                            }
                            if (var483 == 5305) {
                                int var283 = class81.field1283;
                                int var284 = class308.field5207;
                                int var285 = -1;
                                class143[] var286 = class285.method1993(-1);
                                for (int var287 = 0; var287 < var286.length; var287++) {
                                    class143 var288 = var286[var287];
                                    if (var288.field2367 == var284 && var288.field2364 == var283) {
                                        var285 = var287;
                                        break;
                                    }
                                }
                                class78.field1245[var8++] = var285;
                                continue;
                            }
                            if (var483 == 5306) {
                                class78.field1245[var8++] = class284.method1988((byte) 108);
                                continue;
                            }
                            if (var483 == 5307) {
                                var8--;
                                int var289 = class78.field1245[var8];
                                if (var289 < 0 || var289 > 2) {
                                    var289 = 0;
                                }
                                class289.method2007((byte) -94, var289, false, -1, -1);
                                continue;
                            }
                            if (var483 == 5308) {
                                class78.field1245[var8++] = class262.field4362;
                                continue;
                            }
                            if (var483 == 5309) {
                                var8--;
                                int var290 = class78.field1245[var8];
                                if (var290 < 0 || var290 > 2) {
                                    var290 = 0;
                                }
                                class262.field4362 = var290;
                                class101.method767((byte) 50, class308.field5222);
                                continue;
                            }
                        } else if (var483 < 5500) {
                            if (var483 == 5400) {
                                var6 -= 2;
                                class162.field2643++;
                                class59 var217 = class188.field3153[var6];
                                class59 var218 = class188.field3153[var6 + 1];
                                var8--;
                                int var219 = class78.field1245[var8];
                                class234.field3888.method1768(true, 167);
                                class234.field3888.method1219(class169.method1190(21735, var217) + class169.method1190(21735, var218) + 1, true);
                                class234.field3888.method1236((byte) 48, var217);
                                class234.field3888.method1236((byte) 48, var218);
                                class234.field3888.method1219(var219, true);
                                continue;
                            }
                            if (var483 == 5401) {
                                var8 -= 2;
                                class13.field173[class78.field1245[var8]] = (short) class145.method1052(16416, class78.field1245[var8 + 1]);
                                method816(-1104);
                                class8.method60(-94);
                                class238.method1669(121);
                                class93.method679(-1);
                                class179.method1322(-119);
                                continue;
                            }
                            if (var483 == 5405) {
                                var8 -= 2;
                                int var220 = class78.field1245[var8];
                                int var221 = class78.field1245[var8 + 1];
                                if (var220 >= 0 && var220 < 2) {
                                    class263.field4440[var220] = new int[var221 << 1][4];
                                }
                                continue;
                            }
                            if (var483 == 5406) {
                                var8 -= 7;
                                int var222 = class78.field1245[var8 + 1] << 1;
                                int var223 = class78.field1245[var8];
                                int var224 = class78.field1245[var8 + 3];
                                int var225 = class78.field1245[var8 + 2];
                                int var226 = class78.field1245[var8 + 6];
                                int var227 = class78.field1245[var8 + 4];
                                int var228 = class78.field1245[var8 + 5];
                                if (var223 >= 0 && var223 < 2 && class263.field4440[var223] != null && var222 >= 0 && var222 < class263.field4440[var223].length) {
                                    class263.field4440[var223][var222] = new int[] { (class93.method680(var225, 268429392) >> 14) * 128, var224, class93.method680(16383, var225) * 128, var226 };
                                    class263.field4440[var223][var222 + 1] = new int[] { (class93.method680(var227, 268435417) >> 14) * 128, var228, class93.method680(var227, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var483 == 5407) {
                                var8--;
                                int var229 = class263.field4440[class78.field1245[var8]].length >> 1;
                                class78.field1245[var8++] = var229;
                                continue;
                            }
                            if (var483 == 5411) {
                                if (class232.field3811 != null) {
                                    class289.method2007((byte) -51, class262.field4362, false, -1, -1);
                                }
                                if (class253.field4209 == null) {
                                    class9.method71(class311.method2151(100), false, (byte) -57);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var483 == 5419) {
                                class59 var230 = class295.field5037;
                                if (class270.field4675 != null) {
                                    var230 = class179.method1324(class270.field4675.field4258, 255);
                                    try {
                                        if (class270.field4675.field4255 != null) {
                                            byte[] var231 = ((String) class270.field4675.field4255).getBytes("ISO-8859-1");
                                            var230 = class316.method2176(0, var231.length, true, var231);
                                        }
                                    } catch (UnsupportedEncodingException var481) {
                                    }
                                }
                                class188.field3153[var6++] = var230;
                                continue;
                            }
                            if (var483 == 5420) {
                                class78.field1245[var8++] = class175.field2877 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 5421) {
                                if (class232.field3811 != null) {
                                    class289.method2007((byte) -112, class262.field4362, false, -1, -1);
                                }
                                var8--;
                                boolean var233 = class78.field1245[var8] == 1;
                                var6--;
                                class59 var234 = class188.field3153[var6];
                                class59 var235 = class233.method1630(new class59[] { class311.method2151(123), var234 }, -2883);
                                if (class253.field4209 != null || var233 && class175.field2877 != 3 && class175.field2864.startsWith("win") && !class251.field4174) {
                                    class70.field1097 = var235;
                                    class195.field3232 = var233;
                                    class215.field3513 = class308.field5222.method1303(new String(var235.method459(1647627301), "ISO-8859-1"), (byte) 39);
                                    continue;
                                }
                                class9.method71(var235, var233, (byte) -57);
                                continue;
                            }
                            if (var483 == 5422) {
                                var6 -= 2;
                                class59 var236 = class188.field3153[var6];
                                class59 var237 = class188.field3153[var6 + 1];
                                var8--;
                                int var238 = class78.field1245[var8];
                                if (var236.method495(96) > 0) {
                                    if (class176.field2889 == null) {
                                        class176.field2889 = new class59[class72.field1133[class86.field1360]];
                                    }
                                    class176.field2889[var238] = var236;
                                }
                                if (var237.method495(-121) > 0) {
                                    if (class37.field559 == null) {
                                        class37.field559 = new class59[class72.field1133[class86.field1360]];
                                    }
                                    class37.field559[var238] = var237;
                                }
                                continue;
                            }
                            if (var483 == 5423) {
                                var6--;
                                class188.field3153[var6].method502((byte) 125);
                                continue;
                            }
                        } else if (var483 < 5600) {
                            if (var483 == 5500) {
                                var8 -= 4;
                                int var266 = class78.field1245[var8];
                                int var267 = class78.field1245[var8 + 1];
                                int var268 = class78.field1245[var8 + 2];
                                int var269 = class78.field1245[var8 + 3];
                                class25.method162(var268, var269, false, (byte) 121, (var266 & 0x3FFF) - class187.field3135, (var266 >> 14 & 0x3FFF) - class197.field3249, var267);
                                continue;
                            }
                            if (var483 == 5501) {
                                var8 -= 4;
                                int var270 = class78.field1245[var8];
                                int var271 = class78.field1245[var8 + 2];
                                int var272 = class78.field1245[var8 + 1];
                                int var273 = class78.field1245[var8 + 3];
                                class97.method746(var271, var272, ((var270 & 0xFFFDB42) >> 14) - class197.field3249, 128, var273, (var270 & 0x3FFF) - class187.field3135);
                                continue;
                            }
                            if (var483 == 5502) {
                                var8 -= 6;
                                int var274 = class78.field1245[var8];
                                if (var274 >= 2) {
                                    throw new RuntimeException();
                                }
                                class200.field3313 = var274;
                                int var275 = class78.field1245[var8 + 1];
                                if ((class263.field4440[class200.field3313].length >> 1) <= (var275 + 1)) {
                                    throw new RuntimeException();
                                }
                                class268.field4659 = 0;
                                class262.field4361 = var275;
                                class60.field936 = class78.field1245[var8 + 2];
                                class116.field1898 = class78.field1245[var8 + 3];
                                int var276 = class78.field1245[var8 + 4];
                                if (var276 >= 2) {
                                    throw new RuntimeException();
                                }
                                class170.field2753 = var276;
                                int var277 = class78.field1245[var8 + 5];
                                if ((class263.field4440[class170.field2753].length >> 1) <= (var277 + 1)) {
                                    throw new RuntimeException();
                                }
                                class255.field4233 = var277;
                                class266.field4585 = 3;
                                continue;
                            }
                            if (var483 == 5503) {
                                class167.method1178(-1);
                                continue;
                            }
                            if (var483 == 5504) {
                                var8 -= 2;
                                class124.field2057 = class78.field1245[var8];
                                class213.field3489 = class78.field1245[var8 + 1];
                                class140.method1023(true);
                                continue;
                            }
                            if (var483 == 5505) {
                                class78.field1245[var8++] = class124.field2057;
                                continue;
                            }
                            if (var483 == 5506) {
                                class78.field1245[var8++] = class213.field3489;
                                continue;
                            }
                        } else if (var483 < 5700) {
                            if (var483 == 5600) {
                                var6 -= 2;
                                class59 var239 = class188.field3153[var6 + 1];
                                class59 var240 = class188.field3153[var6];
                                var8--;
                                int var241 = class78.field1245[var8];
                                if (class238.field3978 == 10 && class223.field3613 == 0 && class90.field1408 == 0 && class238.field3977 == 0 && class248.field4124 == 0) {
                                    class6.method46(var241, var239, -99, var240);
                                }
                                continue;
                            }
                            if (var483 == 5601) {
                                class140.method1018(false);
                                continue;
                            }
                            if (var483 == 5602) {
                                if (class90.field1408 == 0) {
                                    class276.field4753 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5603) {
                                var8 -= 4;
                                if (class238.field3978 == 10 && class223.field3613 == 0 && class90.field1408 == 0 && class238.field3977 == 0 && class248.field4124 == 0) {
                                    class113.method812(class78.field1245[var8 + 1], class78.field1245[var8 + 2], class78.field1245[var8 + 3], 1, class78.field1245[var8]);
                                }
                                continue;
                            }
                            if (var483 == 5604) {
                                var6--;
                                if (class238.field3978 == 10 && class223.field3613 == 0 && class90.field1408 == 0 && class238.field3977 == 0 && class248.field4124 == 0) {
                                    class96.method725((byte) -121, class188.field3153[var6].method488((byte) -44));
                                }
                                continue;
                            }
                            if (var483 == 5605) {
                                var6 -= 2;
                                var8 -= 4;
                                if (class238.field3978 == 10 && class223.field3613 == 0 && class90.field1408 == 0 && class238.field3977 == 0 && class248.field4124 == 0) {
                                    class314.method2164(class78.field1245[var8 + 1], class78.field1245[var8 + 3], class78.field1245[var8 + 2], (byte) -70, class188.field3153[var6].method488((byte) 119), class188.field3153[var6 + 1], class78.field1245[var8]);
                                }
                                continue;
                            }
                            if (var483 == 5606) {
                                if (class238.field3977 == 0) {
                                    class90.field1405 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5607) {
                                class78.field1245[var8++] = class276.field4753;
                                continue;
                            }
                            if (var483 == 5608) {
                                class78.field1245[var8++] = class189.field3161;
                                continue;
                            }
                            if (var483 == 5609) {
                                class78.field1245[var8++] = class90.field1405;
                                continue;
                            }
                            if (var483 == 5610) {
                                for (int var242 = 0; var242 < 5; var242++) {
                                    class188.field3153[var6++] = class247.field4123.length <= var242 ? class295.field5037 : class247.field4123[var242].method480((byte) 87);
                                }
                                class247.field4123 = null;
                                continue;
                            }
                            if (var483 == 5611) {
                                class78.field1245[var8++] = class94.field1462;
                                continue;
                            }
                        } else if (var483 < 6100) {
                            if (var483 == 6001) {
                                var8--;
                                int var243 = class78.field1245[var8];
                                if (var243 < 1) {
                                    var243 = 1;
                                }
                                if (var243 > 4) {
                                    var243 = 4;
                                }
                                class128.field2092 = var243;
                                if (!class55.field815 || !class308.field5243) {
                                    if (class128.field2092 == 1) {
                                        class298.method2078(0.9F);
                                    }
                                    if (class128.field2092 == 2) {
                                        class298.method2078(0.8F);
                                    }
                                    if (class128.field2092 == 3) {
                                        class298.method2078(0.7F);
                                    }
                                    if (class128.field2092 == 4) {
                                        class298.method2078(0.6F);
                                    }
                                }
                                if (class55.field815) {
                                    class255.method1779(-12843);
                                    if (!class308.field5243) {
                                        class6.method47(-127);
                                    }
                                }
                                class8.method60(-120);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6002) {
                                var8--;
                                class20.method135(class78.field1245[var8] == 1, 14304);
                                class275.method1921(true);
                                class6.method47(-124);
                                class303.method2111(87);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6003) {
                                var8--;
                                class228.field3683 = class78.field1245[var8] == 1;
                                class303.method2111(94);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6005) {
                                var8--;
                                class198.field3288 = class78.field1245[var8] == 1;
                                class6.method47(-127);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6006) {
                                var8--;
                                class131.field2163 = class78.field1245[var8] == 1;
                                ((class280) class298.field5107).method1961(!class131.field2163, 0);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6007) {
                                var8--;
                                class300.field5124 = class78.field1245[var8] == 1;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6008) {
                                var8--;
                                class94.field1452 = class78.field1245[var8] == 1;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6009) {
                                var8--;
                                class67.field1036 = class78.field1245[var8] == 1;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6010) {
                                var8--;
                                class266.field4584 = class78.field1245[var8] == 1;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6011) {
                                var8--;
                                int var244 = class78.field1245[var8];
                                if (var244 < 0 || var244 > 2) {
                                    var244 = 0;
                                }
                                class268.field4658 = var244;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6012) {
                                if (class55.field815) {
                                    class131.method963(-12390, 0, 0);
                                }
                                var8--;
                                class308.field5243 = class78.field1245[var8] == 1;
                                if (class55.field815 && class308.field5243) {
                                    class298.method2078(0.7F);
                                } else {
                                    if (class128.field2092 == 1) {
                                        class298.method2078(0.9F);
                                    }
                                    if (class128.field2092 == 2) {
                                        class298.method2078(0.8F);
                                    }
                                    if (class128.field2092 == 3) {
                                        class298.method2078(0.7F);
                                    }
                                    if (class128.field2092 == 4) {
                                        class298.method2078(0.6F);
                                    }
                                }
                                class6.method47(-124);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6014) {
                                var8--;
                                class193.field3216 = class78.field1245[var8] == 1;
                                if (class55.field815) {
                                    class6.method47(-127);
                                }
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6015) {
                                var8--;
                                class148.field2429 = class78.field1245[var8] == 1;
                                if (class55.field815) {
                                    class255.method1779(-12843);
                                }
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6016) {
                                var8--;
                                int var245 = class78.field1245[var8];
                                if (var245 < 0 || var245 > 2) {
                                    var245 = 0;
                                }
                                class227.field3666 = var245;
                                if (class55.field815) {
                                    class105.field1766 = true;
                                }
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6017) {
                                var8--;
                                class146.field2386 = class78.field1245[var8] == 1;
                                class50.method362(-122);
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6018) {
                                var8--;
                                int var246 = class78.field1245[var8];
                                if (var246 < 0) {
                                    var246 = 0;
                                }
                                if (var246 > 127) {
                                    var246 = 127;
                                }
                                class228.field3686 = var246;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6019) {
                                var8--;
                                int var247 = class78.field1245[var8];
                                if (var247 < 0) {
                                    var247 = 0;
                                }
                                if (var247 > 255) {
                                    var247 = 255;
                                }
                                if (class99.field1600 != var247) {
                                    if (class99.field1600 == 0 && class211.field3454 != -1) {
                                        class150.method1082(98, false, class98.field1573, class211.field3454, 0, var247);
                                        class254.field4219 = false;
                                    } else if (var247 == 0) {
                                        class19.method126((byte) 118);
                                        class254.field4219 = false;
                                    } else {
                                        class139.method1017(-1, var247);
                                    }
                                    class99.field1600 = var247;
                                }
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6020) {
                                var8--;
                                int var248 = class78.field1245[var8];
                                if (var248 < 0) {
                                    var248 = 0;
                                }
                                if (var248 > 127) {
                                    var248 = 127;
                                }
                                class191.field3198 = var248;
                                class101.method767((byte) 50, class308.field5222);
                                class7.field85 = false;
                                continue;
                            }
                            if (var483 == 6021) {
                                var8--;
                                class123.field2039 = class78.field1245[var8] == 1;
                                class303.method2111(84);
                                continue;
                            }
                        } else if (var483 < 6200) {
                            if (var483 == 6101) {
                                class78.field1245[var8++] = class128.field2092;
                                continue;
                            }
                            if (var483 == 6102) {
                                class78.field1245[var8++] = class125.method922((byte) 42) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6103) {
                                class78.field1245[var8++] = class228.field3683 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6105) {
                                class78.field1245[var8++] = class198.field3288 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6106) {
                                class78.field1245[var8++] = class131.field2163 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6107) {
                                class78.field1245[var8++] = class300.field5124 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6108) {
                                class78.field1245[var8++] = class94.field1452 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6109) {
                                class78.field1245[var8++] = class67.field1036 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6110) {
                                class78.field1245[var8++] = class266.field4584 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6111) {
                                class78.field1245[var8++] = class268.field4658;
                                continue;
                            }
                            if (var483 == 6112) {
                                class78.field1245[var8++] = class308.field5243 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6114) {
                                class78.field1245[var8++] = class193.field3216 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6115) {
                                class78.field1245[var8++] = class148.field2429 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6116) {
                                class78.field1245[var8++] = class227.field3666;
                                continue;
                            }
                            if (var483 == 6117) {
                                class78.field1245[var8++] = class146.field2386 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6118) {
                                class78.field1245[var8++] = class228.field3686;
                                continue;
                            }
                            if (var483 == 6119) {
                                class78.field1245[var8++] = class99.field1600;
                                continue;
                            }
                            if (var483 == 6120) {
                                class78.field1245[var8++] = class191.field3198;
                                continue;
                            }
                            if (var483 == 6121) {
                                if (class55.field815) {
                                    class78.field1245[var8++] = class55.field831 ? 1 : 0;
                                } else {
                                    class78.field1245[var8++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 6300) {
                            if (var483 == 6200) {
                                var8 -= 2;
                                class290.field4967 = (short) class78.field1245[var8];
                                if (class290.field4967 <= 0) {
                                    class290.field4967 = 256;
                                }
                                class299.field5113 = (short) class78.field1245[var8 + 1];
                                if (class299.field5113 <= 0) {
                                    class299.field5113 = 205;
                                }
                                continue;
                            }
                            if (var483 == 6201) {
                                var8 -= 2;
                                class58.field854 = (short) class78.field1245[var8];
                                if (class58.field854 <= 0) {
                                    class58.field854 = 256;
                                }
                                class152.field2500 = (short) class78.field1245[var8 + 1];
                                if (class152.field2500 <= 0) {
                                    class152.field2500 = 320;
                                }
                                continue;
                            }
                            if (var483 == 6202) {
                                var8 -= 4;
                                class53.field784 = (short) class78.field1245[var8];
                                if (class53.field784 <= 0) {
                                    class53.field784 = 1;
                                }
                                class238.field3976 = (short) class78.field1245[var8 + 1];
                                if (class238.field3976 <= 0) {
                                    class238.field3976 = 32767;
                                } else if (class53.field784 > class238.field3976) {
                                    class238.field3976 = class53.field784;
                                }
                                class312.field5294 = (short) class78.field1245[var8 + 2];
                                if (class312.field5294 <= 0) {
                                    class312.field5294 = 1;
                                }
                                class184.field3094 = (short) class78.field1245[var8 + 3];
                                if (class184.field3094 <= 0) {
                                    class184.field3094 = 32767;
                                } else if (class312.field5294 > class184.field3094) {
                                    class184.field3094 = class312.field5294;
                                }
                                continue;
                            }
                            if (var483 == 6203) {
                                class23.method146(false, class185.field3110.field4467, 0, 0, false, class185.field3110.field4420);
                                class78.field1245[var8++] = class308.field5209;
                                class78.field1245[var8++] = class232.field3812;
                                continue;
                            }
                            if (var483 == 6204) {
                                class78.field1245[var8++] = class58.field854;
                                class78.field1245[var8++] = class152.field2500;
                                continue;
                            }
                            if (var483 == 6205) {
                                class78.field1245[var8++] = class290.field4967;
                                class78.field1245[var8++] = class299.field5113;
                                continue;
                            }
                        } else if (var483 < 6400) {
                            if (var483 == 6300) {
                                class78.field1245[var8++] = (int) (class205.method1451(-106) / 60000L);
                                continue;
                            }
                            if (var483 == 6301) {
                                class78.field1245[var8++] = (int) (class205.method1451(-104) / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6302) {
                                var8 -= 3;
                                int var249 = class78.field1245[var8 + 2];
                                int var250 = class78.field1245[var8];
                                int var251 = class78.field1245[var8 + 1];
                                class97.field1541.clear();
                                class97.field1541.set(11, 12);
                                class97.field1541.set(var249, var251, var250);
                                class78.field1245[var8++] = (int) (class97.field1541.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6303) {
                                class97.field1541.clear();
                                class97.field1541.setTime(new Date(class205.method1451(118)));
                                class78.field1245[var8++] = class97.field1541.get(1);
                                continue;
                            }
                            if (var483 == 6304) {
                                var8--;
                                int var252 = class78.field1245[var8];
                                boolean var253 = true;
                                if (var252 < 0) {
                                    var253 = (var252 + 1) % 4 == 0;
                                } else if (var252 < 1582) {
                                    var253 = (var252 % 4) == 0;
                                } else if (var252 % 4 != 0) {
                                    var253 = false;
                                } else if (var252 % 100 != 0) {
                                    var253 = true;
                                } else if ((var252 % 400) != 0) {
                                    var253 = false;
                                }
                                class78.field1245[var8++] = var253 ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6500) {
                            if (var483 == 6405) {
                                class78.field1245[var8++] = class149.method1073(17748) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6406) {
                                class78.field1245[var8++] = class99.method751((byte) 81) ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6600) {
                            if (var483 == 6500) {
                                if (class238.field3978 == 10 && class223.field3613 == 0 && class90.field1408 == 0 && class238.field3977 == 0) {
                                    class78.field1245[var8++] = class254.method1774(false) == -1 ? 0 : 1;
                                    continue;
                                }
                                class78.field1245[var8++] = 1;
                                continue;
                            }
                            if (var483 == 6501) {
                                class231 var254 = class71.method573(0);
                                if (var254 == null) {
                                    class78.field1245[var8++] = -1;
                                    class78.field1245[var8++] = 0;
                                    class188.field3153[var6++] = class295.field5037;
                                    class78.field1245[var8++] = 0;
                                    class188.field3153[var6++] = class295.field5037;
                                    class78.field1245[var8++] = 0;
                                } else {
                                    class78.field1245[var8++] = var254.field3798;
                                    class78.field1245[var8++] = var254.field3357;
                                    class188.field3153[var6++] = var254.field3790;
                                    class313 var255 = var254.method1616(0);
                                    class78.field1245[var8++] = var255.field5300;
                                    class188.field3153[var6++] = var255.field5306;
                                    class78.field1245[var8++] = var254.field3360;
                                }
                                continue;
                            }
                            if (var483 == 6502) {
                                class231 var256 = class173.method1275((byte) -108);
                                if (var256 == null) {
                                    class78.field1245[var8++] = -1;
                                    class78.field1245[var8++] = 0;
                                    class188.field3153[var6++] = class295.field5037;
                                    class78.field1245[var8++] = 0;
                                    class188.field3153[var6++] = class295.field5037;
                                    class78.field1245[var8++] = 0;
                                } else {
                                    class78.field1245[var8++] = var256.field3798;
                                    class78.field1245[var8++] = var256.field3357;
                                    class188.field3153[var6++] = var256.field3790;
                                    class313 var257 = var256.method1616(0);
                                    class78.field1245[var8++] = var257.field5300;
                                    class188.field3153[var6++] = var257.field5306;
                                    class78.field1245[var8++] = var256.field3360;
                                }
                                continue;
                            }
                            if (var483 == 6503) {
                                var8--;
                                int var258 = class78.field1245[var8];
                                if (class238.field3978 == 10 && class223.field3613 == 0 && class90.field1408 == 0 && class238.field3977 == 0) {
                                    class78.field1245[var8++] = class194.method1415(var258, (byte) -5) ? 1 : 0;
                                    continue;
                                }
                                class78.field1245[var8++] = 0;
                                continue;
                            }
                            if (var483 == 6504) {
                                var8--;
                                class303.field5158 = class78.field1245[var8];
                                class101.method767((byte) 50, class308.field5222);
                                continue;
                            }
                            if (var483 == 6505) {
                                class78.field1245[var8++] = class303.field5158;
                                continue;
                            }
                            if (var483 == 6506) {
                                var8--;
                                int var259 = class78.field1245[var8];
                                class231 var260 = class102.method770(var259, -65536);
                                if (var260 == null) {
                                    class78.field1245[var8++] = -1;
                                    class188.field3153[var6++] = class295.field5037;
                                    class78.field1245[var8++] = 0;
                                    class188.field3153[var6++] = class295.field5037;
                                    class78.field1245[var8++] = 0;
                                } else {
                                    class78.field1245[var8++] = var260.field3357;
                                    class188.field3153[var6++] = var260.field3790;
                                    class313 var261 = var260.method1616(0);
                                    class78.field1245[var8++] = var261.field5300;
                                    class188.field3153[var6++] = var261.field5306;
                                    class78.field1245[var8++] = var260.field3360;
                                }
                                continue;
                            }
                            if (var483 == 6507) {
                                var8 -= 4;
                                int var262 = class78.field1245[var8 + 2];
                                boolean var263 = class78.field1245[var8 + 1] == 1;
                                int var264 = class78.field1245[var8];
                                boolean var265 = class78.field1245[var8 + 3] == 1;
                                class291.method2014(var262, var264, -119, var265, var263);
                                continue;
                            }
                        }
                    } else if (var483 == 4400) {
                        var8 -= 2;
                        int var357 = class78.field1245[var8];
                        int var358 = class78.field1245[var8 + 1];
                        class8 var359 = class31.method208(var358, 0);
                        if (var359.method61(1002)) {
                            class188.field3153[var6++] = class188.method1390(var357, false).method1334(var359.field97, var358, (byte) 96);
                        } else {
                            class78.field1245[var8++] = class188.method1390(var357, false).method1329((byte) 54, var359.field107, var358);
                        }
                        continue;
                    }
                } else {
                    class263 var460;
                    if (var483 >= 2000) {
                        var8--;
                        var460 = class247.method1738(false, class78.field1245[var8]);
                        var483 -= 1000;
                    } else {
                        var460 = var46 ? class69.field1060 : class284.field4888;
                    }
                    if (var483 == 1300) {
                        var8--;
                        int var461 = class78.field1245[var8] - 1;
                        if (var461 >= 0 && var461 <= 9) {
                            var6--;
                            var460.method1818(class188.field3153[var6], var461, (byte) -49);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var483 == 1301) {
                        var8 -= 2;
                        int var462 = class78.field1245[var8];
                        int var463 = class78.field1245[var8 + 1];
                        var460.field4435 = class297.method2067(var462, 112, var463);
                        continue;
                    }
                    if (var483 == 1302) {
                        var8--;
                        var460.field4398 = class78.field1245[var8] == 1;
                        continue;
                    }
                    if (var483 == 1303) {
                        var8--;
                        var460.field4493 = class78.field1245[var8];
                        continue;
                    }
                    if (var483 == 1304) {
                        var8--;
                        var460.field4523 = class78.field1245[var8];
                        continue;
                    }
                    if (var483 == 1305) {
                        var6--;
                        var460.field4511 = class188.field3153[var6];
                        continue;
                    }
                    if (var483 == 1306) {
                        var6--;
                        var460.field4475 = class188.field3153[var6];
                        continue;
                    }
                    if (var483 == 1307) {
                        var460.field4403 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var482) {
            if (var5.field2558 == null) {
                if (class268.field4661 != 0) {
                    class288.method2003(class295.field5037, 0, -126, class9.field120);
                }
                class306.method2126("CS2 - scr:" + var5.field4932 + " op:" + var10, -13, var482);
            } else {
                class59 var478 = class90.method670(0, 30);
                var478.method462(class307.field5202, 121).method462(var5.field2558, 123);
                for (int var479 = class37.field565 - 1; var479 >= 0; var479--) {
                    var478.method462(class317.field5347, 126).method462(class120.field2006[var479].field841.field2558, 123);
                }
                if (var10 == 40) {
                    int var480 = var11[var7];
                    var478.method462(class23.field299, -124).method462(class81.method619((byte) -98, var480), 122);
                }
                if (class268.field4661 != 0) {
                    class288.method2003(class295.field5037, 0, -128, class233.method1630(new class59[] { class6.field66, var5.field2558 }, -2883));
                }
                class306.method2126("CS2 - scr:" + var5.field4932 + " op:" + var10 + new String(var478.method459(1647627301)), -13, var482);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 6002)
    public final synchronized void method819(boolean arg0) {
        field1851++;
        if (class160.field2607 != null) {
            class160.field2607.removeFocusListener(this);
            class160.field2607.getParent().remove(class160.field2607);
        }
        Container var2;
        if (class232.field3811 != null) {
            var2 = class232.field3811;
        } else if (class253.field4209 == null) {
            var2 = class308.field5222.field2870;
        } else {
            var2 = class253.field4209;
        }
        var2.setLayout((LayoutManager) null);
        class160.field2607 = new class284(this);
        var2.add(class160.field2607);
        class160.field2607.setSize(class152.field2498, class53.field792);
        class160.field2607.setVisible(true);
        if (class253.field4209 == var2) {
            Insets var3 = class253.field4209.getInsets();
            class160.field2607.setLocation(var3.left + class30.field421, var3.top - -class264.field4553);
        } else {
            class160.field2607.setLocation(class30.field421, class264.field4553);
        }
        class160.field2607.addFocusListener(this);
        class160.field2607.requestFocus();
        class56.field842 = true;
        class165.field2679 = true;
        class187.field3137 = true;
        class105.field1766 = arg0;
        class281.field4855 = class205.method1451(-127);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 6050)
    private final void method820(int arg0) {
        field1869++;
        long var2 = class205.method1451(-14);
        long var4 = class288.field4949[class291.field4987];
        if (arg0 != 1) {
            field1876 = (class59) null;
        }
        if (var4 != 0L && var2 <= var4) {
        }
        class288.field4949[class291.field4987] = var2;
        class291.field4987 = class291.field4987 + 1 & 0x1F;
        synchronized (this) {
            class165.field2679 = class56.field842;
        }
        this.method271(-127);
    }

    @OriginalMember(owner = "client!te", name = "start", descriptor = "()V", line = 6090)
    public final void start() {
        field1848++;
        if (class17.field222 == this && !class285.field4904) {
            class146.field2389 = 0L;
        }
    }

    @OriginalMember(owner = "client!te", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6101)
    public final void windowClosed(WindowEvent arg0) {
        field1870++;
    }

    @OriginalMember(owner = "client!te", name = "stop", descriptor = "()V", line = 6113)
    public final void stop() {
        field1849++;
        if (class17.field222 == this && !class285.field4904) {
            class146.field2389 = class205.method1451(-113) + 4000L;
        }
    }

    @OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6125)
    public final void focusGained(FocusEvent arg0) {
        field1841++;
        class56.field842 = true;
        class187.field3137 = true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V", line = 6140)
    public final void method821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1845++;
        try {
            if (class17.field222 != null) {
                class85.field1327++;
                if (class85.field1327 >= 3) {
                    this.method823("alreadyloaded", -12384);
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            class53.field792 = arg3;
            class59.field915 = arg3;
            class30.field421 = 0;
            class152.field2498 = arg2;
            class312.field5289 = arg2;
            class211.field3439 = arg0;
            class17.field222 = this;
            class264.field4553 = 0;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class123.field2040 = true;
            } else {
                class123.field2040 = false;
            }
            if (class308.field5222 == null) {
                class97.field1555 = class308.field5222 = new class175(this, arg1, (String) null, 0);
            }
            class257 var7 = class308.field5222.method1290(1, this, -78);
            while (var7.field4256 == 0) {
                class183.method1360(false, 10L);
            }
            class234.field3892 = (Thread) var7.field4255;
            if (arg4 != 1401) {
                this.start();
            }
        } catch (Exception var9) {
            class306.method2126((String) null, -13, var9);
            this.method823("crash", -12384);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;IIIII)V", line = 6197)
    public final void method822(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class152.field2498 = arg5;
            class312.field5289 = arg5;
            class17.field222 = this;
            class30.field421 = 0;
            class53.field792 = arg6;
            class59.field915 = arg6;
            class264.field4553 = 0;
            class211.field3439 = arg3;
            if (arg2 != -2) {
                return;
            }
            class253.field4209 = new Frame();
            class253.field4209.setTitle("Jagex");
            class253.field4209.setResizable(true);
            class253.field4209.addWindowListener(this);
            class253.field4209.setVisible(true);
            class253.field4209.toFront();
            Insets var8 = class253.field4209.getInsets();
            class253.field4209.setSize(class312.field5289 + var8.left + var8.right, class59.field915 + var8.top + var8.bottom);
            class97.field1555 = class308.field5222 = new class175((Applet) null, arg0, arg1, arg4);
            class257 var9 = class308.field5222.method1290(1, this, arg2 + 103);
            while (var9.field4256 == 0) {
                class183.method1360(false, 10L);
            }
            class234.field3892 = (Thread) var9.field4255;
        } catch (Exception var11) {
            class306.method2126((String) null, -13, var11);
        }
        field1872++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 6236)
    public final void method823(String arg0, int arg1) {
        field1855++;
        if (arg1 != -12384) {
            field1842 = -78;
        }
        if (this.field1874) {
            return;
        }
        this.field1874 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 6258)
    public static void method824(int arg0) {
        field1866 = null;
        field1853 = null;
        field1876 = null;
        field1838 = null;
        if (arg0 != -5611) {
            field1876 = (class59) null;
        }
        field1850 = null;
    }

    @OriginalMember(owner = "client!te", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6272)
    public final void windowDeiconified(WindowEvent arg0) {
        field1854++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 6283)
    public static final void method825(byte arg0) {
        field1857++;
        class11.field142++;
        int var1 = -88 / ((arg0 + 11) / 50);
    }

    @OriginalMember(owner = "client!te", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 6293)
    public final String getParameter(String arg0) {
        field1875++;
        if (class253.field4209 == null) {
            return class308.field5222 == null || class308.field5222.field2870 == this ? super.getParameter(arg0) : class308.field5222.field2870.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V", line = 6308)
    public final void run() {
        field1867++;
        try {
            if (class175.field2872 != null) {
                String var1 = class175.field2872.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class175.field2876;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method823("wrongjava", -12384);
                        return;
                    }
                    class290.field4971 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class175.field2876 == null || class175.field2876.equals("1.4.2"))) {
                    this.method823("wrongjava", -12384);
                    return;
                }
            }
            if (class175.field2876 != null && class175.field2876.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (var3 < class175.field2876.length()) {
                    char var5 = class175.field2876.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class108.field1807 = true;
                }
            }
            if (class308.field5222.field2870 != null) {
                Method var6 = class175.field2881;
                if (var6 != null) {
                    try {
                        var6.invoke(class308.field5222.field2870, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            this.method819(false);
            class221.field3582 = class236.method1655(class160.field2607, class53.field792, -2049, class152.field2498);
            this.method269(-7148);
            class269.field4674 = class102.method778(-28921);
            while (class146.field2389 == 0L || class146.field2389 > class205.method1451(-82)) {
                class29.field384 = class269.field4674.method804(class100.field1623, class290.field4971, -31130);
                for (int var8 = 0; var8 < class29.field384; var8++) {
                    this.method820(1);
                }
                this.method826(1);
                class46.method324(class308.field5222, class160.field2607, 2111924944);
            }
        } catch (Exception var11) {
            class306.method2126((String) null, -13, var11);
            this.method823("crash", -12384);
        }
        this.method817(true, -15353);
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V", line = 6420)
    private final void method826(int arg0) {
        field1859++;
        long var2 = class254.field4216[class39.field594];
        long var4 = class205.method1451(-18);
        class254.field4216[class39.field594] = var4;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class247.field4111 = ((var6 >> 1) + 32000) / var6;
        }
        class39.field594 = class39.field594 + arg0 & 0x1F;
        if ((class19.field251++) > 50) {
            class19.field251 -= 50;
            class187.field3137 = true;
            class160.field2607.setSize(class152.field2498, class53.field792);
            class160.field2607.setVisible(true);
            if (class253.field4209 != null && class232.field3811 == null) {
                Insets var7 = class253.field4209.getInsets();
                class160.field2607.setLocation(class30.field421 + var7.left, class264.field4553 + var7.top);
            } else {
                class160.field2607.setLocation(class30.field421, class264.field4553);
            }
        }
        this.method280((byte) 110);
    }

    @OriginalMember(owner = "client!te", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6460)
    public final void windowDeactivated(WindowEvent arg0) {
        field1844++;
    }

    @OriginalMember(owner = "client!te", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6468)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field1843++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 6475)
    public static final void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class133 var20 = new class133(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class120.field2010[var21][arg1][arg2] == null) {
                    class120.field2010[var21][arg1][arg2] = new class245(var21, arg1, arg2);
                }
            }
            class120.field2010[arg0][arg1][arg2].field4103 = var20;
        } else if (arg3 == 1) {
            class133 var22 = new class133(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class120.field2010[var23][arg1][arg2] == null) {
                    class120.field2010[var23][arg1][arg2] = new class245(var23, arg1, arg2);
                }
            }
            class120.field2010[arg0][arg1][arg2].field4103 = var22;
        } else {
            class79 var24 = new class79(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class120.field2010[var25][arg1][arg2] == null) {
                    class120.field2010[var25][arg1][arg2] = new class245(var25, arg1, arg2);
                }
            }
            class120.field2010[arg0][arg1][arg2].field4105 = var24;
        }
    }

    @OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6528)
    public final void focusLost(FocusEvent arg0) {
        field1868++;
        class56.field842 = false;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 6535)
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class120.field2000 * 128) {
            arg0 = class120.field2000 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class78.field1244 * 128) {
            arg2 = class78.field1244 * 128 - 1;
        }
        class312.field5292 = class298.field5095[arg3];
        class202.field3344 = class298.field5094[arg3];
        class209.field3406 = class298.field5095[arg4];
        class113.field1831 = class298.field5094[arg4];
        class235.field3901 = arg0;
        class189.field3158 = arg1;
        class70.field1073 = arg2;
        class33.field469 = arg0 / 128;
        class88.field1390 = arg2 / 128;
        class224.field3631 = class33.field469 - class286.field4918;
        if (class224.field3631 < 0) {
            class224.field3631 = 0;
        }
        class259.field4332 = class88.field1390 - class286.field4918;
        if (class259.field4332 < 0) {
            class259.field4332 = 0;
        }
        class245.field4096 = class33.field469 + class286.field4918;
        if (class245.field4096 > class120.field2000) {
            class245.field4096 = class120.field2000;
        }
        class309.field5248 = class88.field1390 + class286.field4918;
        if (class309.field5248 > class78.field1244) {
            class309.field5248 = class78.field1244;
        }
        short var15;
        if (class55.field815) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class286.field4918 + class286.field4918 + 2; var16++) {
            for (int var17 = 0; var17 < class286.field4918 + class286.field4918 + 2; var17++) {
                int var18 = (var16 - class286.field4918 << 7) - (class235.field3901 & 0x7F);
                int var19 = (var17 - class286.field4918 << 7) - (class70.field1073 & 0x7F);
                int var20 = class33.field469 + var16 - class286.field4918;
                int var21 = class88.field1390 + var17 - class286.field4918;
                if (var20 >= 0 && var21 >= 0 && var20 < class120.field2000 && var21 < class78.field1244) {
                    int var22;
                    if (class4.field57 == null) {
                        var22 = class239.field3993[0][var20][var21] + 128 - class189.field3158;
                    } else {
                        var22 = class4.field57[0][var20][var21] + 128 - class189.field3158;
                    }
                    int var23 = class239.field3993[3][var20][var21] - class189.field3158 - 1000;
                    class77.field1238[var16][var17] = class275.method1928(var18, var23, var22, var19, var15);
                } else {
                    class77.field1238[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class286.field4918 + class286.field4918 + 1; var24++) {
            for (int var25 = 0; var25 < class286.field4918 + class286.field4918 + 1; var25++) {
                class292.field4994[var24][var25] = class77.field1238[var24][var25] || class77.field1238[var24 + 1][var25] || class77.field1238[var24][var25 + 1] || class77.field1238[var24 + 1][var25 + 1];
            }
        }
        class316.field5329 = arg6;
        class31.field433 = arg7;
        class245.field4077 = arg8;
        class162.field2628 = arg9;
        class129.field2143 = arg10;
        class281.method1975();
        if (class212.field3465 != null) {
            class265.method1835(true);
            class213.method1493(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class55.field815) {
                class14.field199 = false;
                class131.method963(-12390, 0, 0);
                class141.method1025((float[]) null);
                class135.method985();
            }
            class265.method1835(false);
        }
        class213.method1493(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!te", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6674)
    public final void windowIconified(WindowEvent arg0) {
        field1873++;
    }

    @OriginalMember(owner = "client!te", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 6686)
    public final synchronized void paint(Graphics arg0) {
        field1846++;
        if (class17.field222 != this || class285.field4904) {
            return;
        }
        class187.field3137 = true;
        if (class108.field1807 && !class55.field815 && class205.method1451(-94) - class281.field4855 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class312.field5289 && var2.height >= class59.field915) {
                class105.field1766 = true;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 6708)
    public final AppletContext getAppletContext() {
        field1858++;
        if (class253.field4209 == null) {
            return class308.field5222 == null || class308.field5222.field2870 == this ? super.getAppletContext() : class308.field5222.field2870.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 6724)
    public final void update(Graphics arg0) {
        field1861++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!te", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6733)
    public final void windowOpened(WindowEvent arg0) {
        field1856++;
    }

    @OriginalMember(owner = "client!te", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 6743)
    public final URL getDocumentBase() {
        field1864++;
        if (class253.field4209 == null) {
            return class308.field5222 == null || class308.field5222.field2870 == this ? super.getDocumentBase() : class308.field5222.field2870.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 6758)
    public final URL getCodeBase() {
        field1847++;
        if (class253.field4209 == null) {
            return class308.field5222 == null || class308.field5222.field2870 == this ? super.getCodeBase() : class308.field5222.field2870.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 6774)
    public final void windowActivated(WindowEvent arg0) {
        field1865++;
    }

    @OriginalMember(owner = "client!te", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public abstract void method268(byte arg0);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public abstract void method269(int arg0);

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public abstract void method285(int arg0);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public abstract void method280(byte arg0);

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
    public abstract void method271(int arg0);
}
