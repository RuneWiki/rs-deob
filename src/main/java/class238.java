import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class238 extends class272 {

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Lma;")
    public static class5 field3932 = class12.method119("<col=ff7000>", (byte) 95);

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Lma;")
    public static class5 field3929 = class12.method119("::fullscreen", (byte) 100);

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Z")
    public static boolean field3938 = false;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Lma;")
    public static class5 field3935 = class12.method119("cross", (byte) 78);

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Ltj;")
    public static class73 field3928 = new class73(20);

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Lti;")
    public static class173 field3930;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Lni;")
    public static class202 field3939;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 13)
    public static final void method1679(byte arg0) {
        field3934++;
        Object var1 = class274.field4672;
        synchronized (class274.field4672) {
            if (class288.field4864 == 0) {
                class267.field4597.method991(new class226(), false, 5);
            }
            if (arg0 != -9) {
                field3935 = (class5) null;
            }
            class288.field4864 = 600;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)Lhj;", line = 39)
    public static final class228 method1680(byte arg0, int arg1) {
        field3927++;
        class228 var2 = (class228) class167.field2543.method964(-257, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field2122.method1342(64, 26, arg1);
        class228 var4 = new class228();
        if (var3 != null) {
            var4.method1616(false, new class221(var3));
        }
        class167.field2543.method966(var4, (long) arg1, (byte) 73);
        if (arg0 < 83) {
            method1685((byte) -105, (class5) null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 63)
    public static void method1681(int arg0) {
        field3935 = null;
        field3932 = null;
        field3929 = null;
        if (arg0 < -5) {
            field3928 = null;
            field3939 = null;
            field3930 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILma;Lma;BILma;)V", line = 79)
    public static final void method1682(int arg0, class5 arg1, class5 arg2, byte arg3, int arg4, class5 arg5) {
        field3933++;
        for (int var6 = 99; var6 > 0; var6--) {
            class198.field3170[var6] = class198.field3170[var6 - 1];
            class131.field1967[var6] = class131.field1967[var6 - 1];
            class212.field3378[var6] = class212.field3378[var6 - 1];
            class41.field616[var6] = class41.field616[var6 - 1];
            class112.field1664[var6] = class112.field1664[var6 - 1];
        }
        class179.field2717 = class303.field5107;
        class131.field1967[0] = arg5;
        class212.field3378[0] = arg1;
        class41.field616[0] = arg2;
        if (arg3 > -11) {
            field3928 = (class73) null;
        }
        class210.field3354++;
        class198.field3170[0] = arg4;
        class112.field1664[0] = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lma;IILjava/awt/Color;Z)V", line = 111)
    public static final void method1683(class5 arg0, int arg1, int arg2, Color arg3, boolean arg4) {
        try {
            Graphics var5 = class147.field2141.getGraphics();
            if (class218.field3507 == null) {
                class218.field3507 = new Font("Helvetica", 1, 13);
                class47.field726 = class147.field2141.getFontMetrics(class218.field3507);
            }
            if (arg1 < 124) {
                return;
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class255.field4362, class156.field2314);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class102.field1520 == null) {
                    class102.field1520 = class147.field2141.createImage(304, 34);
                }
                Graphics var6 = class102.field1520.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg2 * 3) + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class218.field3507);
                var6.setColor(Color.white);
                arg0.method33((304 - arg0.method61((byte) -85, class47.field726)) / 2, var6, 22, true);
                var5.drawImage(class102.field1520, class255.field4362 / 2 - 152, class156.field2314 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class255.field4362 / 2 - 152;
                int var9 = class156.field2314 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg2 * 3) + 2, var9 + 2, 300 - (arg2 * 3), 30);
                var5.setFont(class218.field3507);
                var5.setColor(Color.white);
                arg0.method33((304 - arg0.method61((byte) -85, class47.field726)) / 2 + var8, var5, var9 + 22, true);
            }
            if (class92.field1398 != null) {
                var5.setFont(class218.field3507);
                var5.setColor(Color.white);
                class92.field1398.method33(class255.field4362 / 2 - class92.field1398.method61((byte) -85, class47.field726) / 2, var5, class156.field2314 / 2 - 26, true);
            }
        } catch (Exception var12) {
            class147.field2141.repaint();
        }
        field3940++;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 181)
    public static final void method1684(int arg0) {
        field3936++;
        for (int var1 = 0; var1 < class186.field2934; var1++) {
            int var10002 = class29.field470[var1]--;
            if (class29.field470[var1] >= -10) {
                class6 var2 = class142.field2085[var1];
                if (var2 == null) {
                    var2 = class6.method83(class13.field244, class152.field2222[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class29.field470[var1] += var2.method84();
                    class142.field2085[var1] = var2;
                }
                if (class29.field470[var1] < 0) {
                    int var3;
                    if (class185.field2894[var1] == 0) {
                        var3 = class264.field4492;
                    } else {
                        int var4 = (class185.field2894[var1] & 0xFF) * 128;
                        int var5 = class185.field2894[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class151.field2183.field178;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class185.field2894[var1] & 0xFFE8) >> 8;
                        int var8 = var7 * 128 + 64 - class151.field2183.field211;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var4 < var9) {
                            class29.field470[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var3 = (var4 - var9) * class130.field1955 / var4;
                    }
                    if (var3 > 0) {
                        class26 var10 = var2.method81().method190(class62.field974);
                        class108 var11 = class108.method715(var10, 100, var3);
                        var11.method700(class24.field411[var1] - 1);
                        class235.field3889.method275(var11);
                    }
                    class29.field470[var1] = -100;
                }
            } else {
                class186.field2934--;
                for (int var12 = var1; var12 < class186.field2934; var12++) {
                    class152.field2222[var12] = class152.field2222[var12 + 1];
                    class142.field2085[var12] = class142.field2085[var12 + 1];
                    class24.field411[var12] = class24.field411[var12 + 1];
                    class29.field470[var12] = class29.field470[var12 + 1];
                    class185.field2894[var12] = class185.field2894[var12 + 1];
                }
                var1--;
            }
        }
        int var13 = 31 / ((-arg0 - 40) / 34);
        if (class278.field4726 && !class196.method1286(0)) {
            if (class247.field4092 != 0 && class272.field4649 != -1) {
                class217.method1468(class247.field4092, false, true, class272.field4649, 0, class182.field2775);
            }
            class278.field4726 = false;
        } else if (class247.field4092 != 0 && class272.field4649 != -1 && !class196.method1286(0)) {
            class147.field2127.method1389((byte) -20, 162);
            class112.field1669++;
            class147.field2127.method1513(class272.field4649, false);
            class272.field4649 = -1;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLma;)V", line = 309)
    public static final void method1685(byte arg0, class5 arg1) {
        class24.field413 = arg1;
        field3931++;
        if (class267.field4597.field2262 == null) {
            return;
        }
        try {
            class5 var2 = class201.field3190.method46(class267.field4597.field2262, (byte) 23);
            int var3 = 16 % ((-arg0 - 53) / 42);
            class5 var4 = class136.field2010.method46(class267.field4597.field2262, (byte) 73);
            class5 var5 = class288.method1940((byte) 57, new class5[] { var2, class12.field205, arg1, class236.field3897, var4 });
            class5 var6;
            if (arg1.method36(30673) == 0) {
                var6 = class288.method1940((byte) 118, new class5[] { var5, class89.field1333 });
            } else {
                var6 = class288.method1940((byte) 97, new class5[] { var5, class152.field2213, class217.method1472(-54, class212.method1404((byte) -85) + 94608000000L), class73.field1142, class236.method1671(-123, 94608000L) });
            }
            class288.method1940((byte) 100, new class5[] { class123.field1859, var6, class226.field3710 }).method63((byte) -2, class267.field4597.field2262);
        } catch (Throwable var8) {
        }
    }
}
