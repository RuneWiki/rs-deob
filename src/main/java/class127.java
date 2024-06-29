import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class127 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public int field2192 = 8;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public int field2204 = 16777215;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2195 = new String[100];

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[I")
    public static int[] field2199 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lul;")
    public static class51 field2208 = new class51(4);

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "[Z")
    public static boolean[] field2211 = new boolean[100];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Z")
    public boolean field2205;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZLjava/lang/String;I)Z", line = 4)
    public static final boolean method1057(int arg0, boolean arg1, String arg2, int arg3) {
        field2209++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = arg3; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLcg;)V", line = 80)
    public static final void method1058(boolean arg0, class49 arg1) {
        field2201++;
        class143.field2614 = class67.method642(51, arg1, class161.field2864, 0);
        class81.field1321 = class125.method1043(arg1, 0, class33.field476, 127);
        class106.field1761 = class125.method1043(arg1, 0, class298.field4754, 92);
        class288.field4593 = class125.method1043(arg1, 0, class83.field1336, 52);
        class44.field696 = class125.method1043(arg1, 0, class143.field2615, 48);
        class4.field63 = class125.method1043(arg1, 0, class126.field2167, 113);
        class131.field2252 = class125.method1043(arg1, 0, class317.field5035, 53);
        class72.field1200 = class316.method2177(arg1, class353.field5578, 0, (byte) 39);
        class259.field4202 = class246.method1723(class38.field556, arg1, 0, 0);
        class269.field4305 = class246.method1723(class21.field332, arg1, 0, 0);
        class328.field5222 = class313.method2157(arg1, -6214, class221.field3692, 0);
        class12.field187 = class313.method2157(arg1, -6214, class60.field937, 0);
        class99.field1605.method2242(class12.field187, (int[]) null);
        class241.field3926.method2242(class12.field187, (int[]) null);
        class177.field3014.method2242(class12.field187, (int[]) null);
        if (class43.field680) {
            class14.field221 = class15.method152(class35.field495, 80, arg1, 0);
            for (int var2 = 0; var2 < class14.field221.length; var2++) {
                class14.field221[var2].method1599();
            }
        }
        class309 var3 = class349.method2441(arg1, class349.field5550, false, 0);
        var3.method2139();
        if (class43.field680) {
            class279.field4431 = new class157(var3);
        } else {
            class279.field4431 = var3;
        }
        class309[] var4 = class67.method642(51, arg1, class102.field1646, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method2139();
        }
        if (class43.field680) {
            class36.field534 = new class171[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class36.field534[var6] = new class157(var4[var6]);
            }
        } else {
            class36.field534 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        if (!arg0) {
            field2208 = (class51) null;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class143.field2614.length; var11++) {
            class143.field2614[var11].method2147(var7 + var10, var9 + var10, var8 + var10);
        }
        if (class43.field680) {
            class238.field3902 = new class171[class143.field2614.length];
            for (int var12 = 0; var12 < class143.field2614.length; var12++) {
                class238.field3902[var12] = new class157(class143.field2614[var12]);
            }
        } else {
            class238.field3902 = class143.field2614;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 182)
    public static final void method1059(int arg0, int arg1) {
        if (arg0 == 28367) {
            field2206++;
            class36.field529.method469(-11815, arg1);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILpi;Z)V", line = 193)
    private final void method1060(int arg0, int arg1, class336 arg2, boolean arg3) {
        field2203++;
        if (arg3) {
            field2199 = (int[]) null;
        }
        if (arg1 == 1) {
            this.field2192 = arg2.method2339((byte) -46);
        } else if (arg1 == 2) {
            this.field2205 = true;
        } else if (arg1 == 3) {
            this.field2202 = arg2.method2326(118);
            this.field2207 = arg2.method2326(62);
            this.field2197 = arg2.method2326(107);
        } else if (arg1 == 4) {
            this.field2200 = arg2.method2364(-9069);
        } else if (arg1 == 5) {
            this.field2191 = arg2.method2339((byte) -46);
        } else if (arg1 == 6) {
            this.field2204 = arg2.method2317(21803);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lpi;II)V", line = 247)
    public final void method1061(class336 arg0, int arg1, int arg2) {
        field2196++;
        while (true) {
            int var4 = arg0.method2364(-9069);
            if (var4 == 0) {
                if (arg1 != 0) {
                    field2198 = -31;
                }
                return;
            }
            this.method1060(arg2, var4, arg0, false);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 268)
    public static void method1062(byte arg0) {
        field2211 = null;
        if (arg0 != 3) {
            method1059(-79, -119);
        }
        field2208 = null;
        field2195 = null;
        field2199 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 284)
    public static final void method1063(boolean arg0, Component arg1) {
        field2210++;
        Method var2 = class59.field922;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class296.field4723);
        arg1.addFocusListener(class296.field4723);
        if (arg0) {
            field2211 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIILjava/lang/String;Ljava/awt/Color;)V", line = 307)
    public static final void method1064(boolean arg0, int arg1, int arg2, String arg3, Color arg4) {
        field2193++;
        try {
            Graphics var5 = class42.field616.getGraphics();
            if (class114.field1911 == null) {
                class114.field1911 = new Font("Helvetica", 1, 13);
                class198.field3391 = class42.field616.getFontMetrics(class114.field1911);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class313.field4973, class188.field3152);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class238.field3906 == null) {
                    class238.field3906 = class42.field616.createImage(304, 34);
                }
                Graphics var6 = class238.field3906.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                if (arg2 != -20634) {
                    method1057(-38, true, (String) null, -88);
                }
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * 3) + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class114.field1911);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class198.field3391.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class238.field3906, class313.field4973 / 2 - 152, class188.field3152 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class313.field4973 / 2 - 152;
                int var9 = class188.field3152 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 - -2, 300 - arg1 * 3, 30);
                var5.setFont(class114.field1911);
                var5.setColor(Color.white);
                var5.drawString(arg3, var8 + (304 - class198.field3391.stringWidth(arg3)) / 2, var9 + 22);
            }
            if (class242.field3951 != null) {
                var5.setFont(class114.field1911);
                var5.setColor(Color.white);
                var5.drawString(class242.field3951, class313.field4973 / 2 - (class198.field3391.stringWidth(class242.field3951) / 2), class188.field3152 / 2 + -26);
            }
        } catch (Exception var12) {
            class42.field616.repaint();
        }
    }
}
