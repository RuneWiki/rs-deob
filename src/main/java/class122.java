import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class122 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field2154 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Loh;")
    public static class258 field2156 = class153.method1046("Texturen geladen)3", 99);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field2152 = 0;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Z")
    public static boolean field2170;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[Lvi;")
    public static class129[] field2163;

    @OriginalMember(owner = "client!sh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 12)
    public final void focusGained(FocusEvent arg0) {
        field2158++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZILoh;Ljava/awt/Color;B)V", line = 21)
    public static final void method890(boolean arg0, int arg1, class258 arg2, Color arg3, byte arg4) {
        field2162++;
        try {
            Graphics var5 = class5.field67.getGraphics();
            if (class82.field1390 == null) {
                class82.field1390 = new Font("Helvetica", 1, 13);
                class100.field1785 = class5.field67.getFontMetrics(class82.field1390);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class218.field3773, class42.field577);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class64.field1129 == null) {
                    class64.field1129 = class5.field67.createImage(304, 34);
                }
                Graphics var6 = class64.field1129.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                if (arg4 < 51) {
                    return;
                }
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class82.field1390);
                var6.setColor(Color.white);
                arg2.method1796((byte) 38, (304 - arg2.method1776(class100.field1785, (byte) 114)) / 2, var6, 22);
                var5.drawImage(class64.field1129, class218.field3773 / 2 - 152, class42.field577 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class218.field3773 / 2 - 152;
                int var9 = class42.field577 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class82.field1390);
                var5.setColor(Color.white);
                arg2.method1796((byte) 38, var8 + (304 - arg2.method1776(class100.field1785, (byte) 112)) / 2, var5, var9 + 22);
            }
            if (class287.field4938 != null) {
                var5.setFont(class82.field1390);
                var5.setColor(Color.white);
                class287.field4938.method1796((byte) 38, class218.field3773 / 2 - class287.field4938.method1776(class100.field1785, (byte) -123) / 2, var5, class42.field577 / 2 - 26);
            }
        } catch (Exception var12) {
            class5.field67.repaint();
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIILpb;BI)V", line = 145)
    public static final void method891(boolean arg0, int arg1, int arg2, class2 arg3, byte arg4, int arg5) {
        field2155++;
        if (class299.field5118 >= 50 || arg3.field12 == null || arg3.field12.length <= arg2 || arg3.field12[arg2] == null) {
            return;
        }
        if (arg4 > -38) {
            method892((int[]) null, -77);
        }
        int var6 = arg3.field12[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0xF;
        if (arg3.field12[arg2].length > 1) {
            int var9 = (int) (Math.random() * (double) arg3.field12[arg2].length);
            if (var9 > 0) {
                var7 = arg3.field12[arg2][var9];
            }
        }
        int var10 = (var6 & 0x7A) >> 4;
        if (var8 == 0) {
            if (arg0) {
                class308.method2147(0, var7, -1, var10);
            }
        } else if (class317.field5345 != 0) {
            int var11 = (arg5 - 64) / 128;
            int var12 = (arg1 - 64) / 128;
            class147.field2492[class299.field5118] = var7;
            class182.field3263[class299.field5118] = var10;
            class307.field5212[class299.field5118] = 0;
            class191.field3372[class299.field5118] = null;
            class114.field1964[class299.field5118] = (var11 << 16) + (var12 << 8) + var8;
            class299.field5118++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([II)[I", line = 203)
    public static final int[] method892(int[] arg0, int arg1) {
        field2157++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class275.method1930(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Loh;Loh;ILoh;II)V", line = 220)
    public static final void method893(class258 arg0, class258 arg1, int arg2, class258 arg3, int arg4, int arg5) {
        field2164++;
        for (int var6 = 99; var6 > 0; var6--) {
            class194.field3434[var6] = class194.field3434[var6 - 1];
            class186.field3313[var6] = class186.field3313[var6 - 1];
            class246.field4273[var6] = class246.field4273[var6 - 1];
            class95.field1660[var6] = class95.field1660[var6 - 1];
            class255.field4380[var6] = class255.field4380[var6 - 1];
        }
        class51.field815++;
        class186.field3313[0] = arg0;
        class246.field4273[0] = arg3;
        class194.field3434[0] = arg2;
        class255.field4380[0] = arg5;
        if (arg4 == -1559) {
            class164.field2770 = class182.field3259;
            class95.field1660[0] = arg1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 250)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class215.field3729 != null) {
            class7.field93 = -1;
        }
        field2160++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 269)
    public static void method894(int arg0) {
        int var1 = 43 / ((70 - arg0) / 47);
        field2156 = null;
        field2163 = null;
    }

    @OriginalMember(owner = "client!sh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 285)
    public final void keyTyped(KeyEvent arg0) {
        if (class215.field3729 != null) {
            int var2 = class252.method1709(arg0, -257);
            if (var2 >= 0) {
                int var3 = class231.field3980 + 1 & 0x7F;
                if (class255.field4376 != var3) {
                    class121.field2134[class231.field3980] = -1;
                    class263.field4575[class231.field3980] = var2;
                    class231.field3980 = var3;
                }
            }
        }
        arg0.consume();
        field2166++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lva;", line = 342)
    public static final class235 method895(byte arg0) {
        field2168++;
        int var1 = -111 / ((51 - arg0) / 41);
        class235 var2 = new class235(30);
        var2.method1598(7, 27052);
        var2.method1598(class151.field2557, 27052);
        var2.method1598(class108.field1918 ? 1 : 0, 27052);
        var2.method1598(class45.field672 ? 1 : 0, 27052);
        var2.method1598(class119.field2110 ? 1 : 0, 27052);
        var2.method1598(class173.field3101 ? 1 : 0, 27052);
        var2.method1598(class146.field2477 ? 1 : 0, 27052);
        var2.method1598(class271.field4697 ? 1 : 0, 27052);
        var2.method1598(class50.field743 ? 1 : 0, 27052);
        var2.method1598(class90.field1587 ? 1 : 0, 27052);
        var2.method1598(class250.field4312, 27052);
        var2.method1598(class4.field62 ? 1 : 0, 27052);
        var2.method1598(class20.field239 ? 1 : 0, 27052);
        var2.method1598(class57.field896 ? 1 : 0, 27052);
        var2.method1598(class58.field917, 27052);
        var2.method1598(class197.field3463 ? 1 : 0, 27052);
        var2.method1598(class186.field3307, 27052);
        var2.method1598(class244.field4233, 27052);
        var2.method1598(class317.field5345, 27052);
        var2.method1605(class259.field4501, (byte) 72);
        var2.method1605(class239.field4171, (byte) 67);
        var2.method1598(2, 27052);
        var2.method1577(true, class99.field1758);
        var2.method1598(class61.field1022, 27052);
        var2.method1598(class242.field4196 ? 1 : 0, 27052);
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 402)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2167++;
        if (class215.field3729 != null) {
            class164.field2769 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class61.field1042.length > var2) {
                var3 = class61.field1042[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class7.field93 >= 0 && var3 >= 0) {
                class39.field557[class7.field93] = ~var3;
                class7.field93 = class7.field93 + 1 & 0x7F;
                if (class7.field93 == class185.field3291) {
                    class7.field93 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)I", line = 438)
    public static final int method896(byte arg0, int arg1, int arg2) {
        field2165++;
        if (arg0 != -115) {
            field2163 = (class129[]) null;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 463)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2161++;
        if (class215.field3729 == null) {
            return;
        }
        class164.field2769 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class61.field1042.length) {
            var3 = class61.field1042[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class7.field93 >= 0 && var3 >= 0) {
            class39.field557[class7.field93] = var3;
            class7.field93 = class7.field93 + 1 & 0x7F;
            if (class7.field93 == class185.field3291) {
                class7.field93 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class231.field3980 + 1 & 0x7F;
            if (class255.field4376 != var4) {
                class121.field2134[class231.field3980] = var3;
                class263.field4575[class231.field3980] = -1;
                class231.field3980 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
