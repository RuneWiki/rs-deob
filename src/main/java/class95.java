import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class95 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field2295 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field2302 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lwb;")
    public static class130 field2303 = null;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lbc;")
    public static class10 field2304 = new class10(4096);

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field2309 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2306 = 0;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2307 = new CRC32();

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lwb;")
    public static class130 field2311 = class26.method212("Sprites geladen)3", -32376);

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lwb;")
    private static class130 field2312 = class26.method212("Loading sprites )2 ", -32376);

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lwb;")
    public static class130 field2310 = field2312;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLwb;ILjava/awt/Color;)V", line = 31)
    public static final void method707(byte arg0, class130 arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class84.field2003.getGraphics();
            if (class60.field1555 == null) {
                class60.field1555 = new Font("Helvetica", 1, 13);
                class20.field574 = class84.field2003.getFontMetrics(class60.field1555);
            }
            if (class43.field1191) {
                class43.field1191 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class45.field1204, class3.field115);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class18.field491 == null) {
                    class18.field491 = class84.field2003.createImage(304, 34);
                }
                Graphics var5 = class18.field491.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class60.field1555);
                var5.setColor(Color.white);
                arg1.method956((304 - arg1.method983(-116, class20.field574)) / 2, var5, 22, (byte) -92);
                var4.drawImage(class18.field491, class45.field1204 / 2 - 152, class3.field115 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class45.field1204 / 2 - 152;
                int var7 = class3.field115 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg2 * 3 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class60.field1555);
                var4.setColor(Color.white);
                arg1.method956((304 - arg1.method983(arg0 + 222, class20.field574)) / 2 + var6, var4, var7 + 22, (byte) 98);
            }
        } catch (Exception var9) {
            class84.field2003.repaint();
        }
        field2299++;
        if (arg0 != -116) {
            field2311 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 99)
    public static final void method708(Component arg0, byte arg1) {
        arg0.removeMouseListener(class130.field3083);
        arg0.removeMouseMotionListener(class130.field3083);
        if (arg1 > 12) {
            field2301++;
            arg0.removeFocusListener(class130.field3083);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 123)
    public static void method709(int arg0) {
        field2311 = null;
        field2307 = null;
        field2304 = null;
        int var1 = 83 / ((arg0 - 24) / 58);
        field2303 = null;
        field2312 = null;
        field2310 = null;
        field2302 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 139)
    public static final void method710(byte arg0) {
        field2296++;
        if (arg0 == 83) {
            class41.field1169.method401(arg0 + 26033);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLod;)V", line = 156)
    public static final void method711(boolean arg0, class88 arg1) {
        arg1.field2101 = arg1.field2068;
        if (arg0) {
            return;
        }
        field2300++;
        if (arg1.field2140 == 0) {
            arg1.field2136 = 0;
            return;
        }
        if (arg1.field2115 != -1 && arg1.field2139 == 0) {
            class40 var2 = class85.method641(arg1.field2115, 12);
            if (arg1.field2092 > 0 && var2.field1128 == 0) {
                arg1.field2136++;
                return;
            }
            if (arg1.field2092 <= 0 && var2.field1119 == 0) {
                arg1.field2136++;
                return;
            }
        }
        int var3 = arg1.field2079[arg1.field2140 - 1] * 128 + arg1.field2076 * 64;
        int var4 = arg1.field2107[arg1.field2140 - 1] * 128 + arg1.field2076 * 64;
        int var5 = arg1.field2071;
        int var6 = arg1.field2128;
        if (var4 - var5 > 256 || var4 - var5 < -256 || var3 - var6 > 256 || var3 - var6 < -256) {
            arg1.field2128 = var3;
            arg1.field2071 = var4;
            return;
        }
        if (var4 > var5) {
            if (var6 < var3) {
                arg1.field2106 = 1280;
            } else if (var6 <= var3) {
                arg1.field2106 = 1536;
            } else {
                arg1.field2106 = 1792;
            }
        } else if (var4 < var5) {
            if (var6 < var3) {
                arg1.field2106 = 768;
            } else if (var6 > var3) {
                arg1.field2106 = 256;
            } else {
                arg1.field2106 = 512;
            }
        } else if (var6 < var3) {
            arg1.field2106 = 1024;
        } else if (var3 < var6) {
            arg1.field2106 = 0;
        }
        int var7 = arg1.field2110;
        int var8 = arg1.field2106 - arg1.field2099 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var9 = 4;
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field2086;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field2118;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field2123;
        }
        if (arg1.field2106 != arg1.field2099 && arg1.field2085 == -1 && arg1.field2094 != 0) {
            var9 = 2;
        }
        if (var7 == -1) {
            var7 = arg1.field2086;
        }
        if (arg1.field2140 > 2) {
            var9 = 6;
        }
        arg1.field2101 = var7;
        if (arg1.field2140 > 3) {
            var9 = 8;
        }
        if (arg1.field2136 > 0 && arg1.field2140 > 1) {
            var9 = 8;
            arg1.field2136--;
        }
        if (arg1.field2072[arg1.field2140 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 < var4) {
            arg1.field2071 += var9;
            if (arg1.field2071 > var4) {
                arg1.field2071 = var4;
            }
        } else if (var5 > var4) {
            arg1.field2071 -= var9;
            if (var4 > arg1.field2071) {
                arg1.field2071 = var4;
            }
        }
        if (var6 < var3) {
            arg1.field2128 += var9;
            if (var3 < arg1.field2128) {
                arg1.field2128 = var3;
            }
        } else if (var6 > var3) {
            arg1.field2128 -= var9;
            if (arg1.field2128 < var3) {
                arg1.field2128 = var3;
            }
        }
        if (arg1.field2071 == var4 && arg1.field2128 == var3) {
            if (arg1.field2092 > 0) {
                arg1.field2092--;
            }
            arg1.field2140--;
        }
        if (var9 >= 8 && arg1.field2101 == arg1.field2086 && arg1.field2138 != -1) {
            arg1.field2101 = arg1.field2138;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILab;)Z", line = 341)
    public static final boolean method712(int arg0, class3 arg1) {
        if (arg0 != 256) {
            field2295 = -6;
        }
        field2298++;
        if (arg1.field107 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field107.length; var2++) {
            int var3 = class132.method1019(var2, (byte) -84, arg1);
            int var4 = arg1.field128[var2];
            if (arg1.field107[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field107[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field107[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 410)
    public static final void method713(byte arg0) {
        field2297++;
        if (class53.field1397 == 0) {
            return;
        }
        int var1 = 0;
        class131 var2 = class132.field3202;
        if (class36.field1078 != 0) {
            var1 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class37.field1089[var3] != null) {
                int var4 = class69.field1786[var3];
                class130 var5 = class93.field2218[var3];
                byte var6 = 0;
                if (var5 != null && var5.method981(-11361, class83.field1949)) {
                    var6 = 1;
                    var5 = var5.method977(5, true);
                }
                if (var5 != null && var5.method981(-11361, class7.field232)) {
                    var5 = var5.method977(5, true);
                    var6 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class48.field1291 == 0 || class48.field1291 == 1 && class4.method38(4739, var5))) {
                    int var7 = 329 - var1 * 13;
                    var1++;
                    byte var8 = 4;
                    var2.method1002(class101.field2444, var8, var7, 0);
                    var2.method1002(class101.field2444, var8, var7 - 1, 65535);
                    int var9 = var8 + var2.method1013(class101.field2444);
                    int var10 = var9 + var2.method1003(32);
                    if (var6 == 1) {
                        class52.field1363[0].method744(var10, var7 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class52.field1363[1].method744(var10, var7 - 12);
                        var10 += 14;
                    }
                    var2.method1002(class15.method114(new class130[] { var5, client.field543, class37.field1089[var3] }, -20349), var10, var7, 0);
                    var2.method1002(class15.method114(new class130[] { var5, client.field543, class37.field1089[var3] }, -20349), var10, var7 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class48.field1291 < 2) {
                    int var11 = 329 - var1 * 13;
                    var2.method1002(class37.field1089[var3], 4, var11, 0);
                    var1++;
                    var2.method1002(class37.field1089[var3], 4, var11 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class48.field1291 < 2) {
                    int var12 = 329 - var1 * 13;
                    var2.method1002(class15.method114(new class130[] { class14.field413, class23.field663, var5, client.field543, class37.field1089[var3] }, -20349), 4, var12, 0);
                    var1++;
                    var2.method1002(class15.method114(new class130[] { class14.field413, class23.field663, var5, client.field543, class37.field1089[var3] }, -20349), 4, var12 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 >= -6) {
            method711(false, null);
        }
    }
}
