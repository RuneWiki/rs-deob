import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class124 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Z")
    private boolean field2189 = false;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lke;")
    public static class256 field2167 = class316.method2202("Ablegen", 27626);

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lij;")
    public static class175 field2196 = new class175();

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "[I")
    public static int[] field2198 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field2202 = 0;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Lke;")
    public static class256 field2199 = class316.method2202("<col=c0ff00>", 27626);

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "[Lke;")
    public static class256[] field2203 = new class256[200];

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "[Lsd;")
    public static class37[] field2201 = new class37[4];

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[F")
    public static float[] field2204 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "Lke;")
    public static class256 field2206 = class316.method2202("Veuillez commencer par supprimer ", 27626);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ca", name = "T", descriptor = "Z")
    public static boolean field2207;

    @OriginalMember(owner = "client!ca", name = "U", descriptor = "Z")
    public static boolean field2208;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZZIILjava/lang/String;II)V", line = 7)
    public final void method851(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        try {
            class292.field5050 = arg4;
            class19.field257 = this;
            class112.field1969 = arg6;
            class308.field5326 = arg6;
            class264.field4532 = 0;
            field2200 = arg0;
            class186.field3269 = arg0;
            class100.field1775 = 0;
            class198.field3627 = new Frame();
            class198.field3627.setTitle("Jagex");
            class198.field3627.setResizable(true);
            class198.field3627.addWindowListener(this);
            class198.field3627.setVisible(arg2);
            class198.field3627.toFront();
            Insets var9 = class198.field3627.getInsets();
            class198.field3627.setSize(class308.field5326 + var9.left + var9.right, class186.field3269 - -var9.top + var9.bottom);
            class289.field4995 = class272.field4658 = new class4((Applet) null, arg3, arg5, arg7);
            class82 var10 = class272.field4658.method20(1, this, (byte) -110);
            while (var10.field1500 == 0) {
                class46.method381(10L, -106);
            }
            class165.field2931 = (Thread) var10.field1499;
        } catch (Exception var12) {
            class7.method48((String) null, (byte) 112, var12);
        }
        field2170++;
    }

    @OriginalMember(owner = "client!ca", name = "start", descriptor = "()V", line = 46)
    public final void start() {
        field2165++;
        if (class19.field257 == this && !class187.field3300) {
            class111.field1949 = 0L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 57)
    public final void windowClosed(WindowEvent arg0) {
        field2205++;
    }

    @OriginalMember(owner = "client!ca", name = "stop", descriptor = "()V", line = 65)
    public final void stop() {
        field2171++;
        if (class19.field257 == this && !class187.field3300) {
            class111.field1949 = class224.method1536(false) + 4000L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "providesignlink", descriptor = "(Lff;)V", line = 80)
    public static final void providesignlink(class4 arg0) {
        class272.field4658 = arg0;
        class289.field4995 = arg0;
        field2182++;
    }

    @OriginalMember(owner = "client!ca", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 88)
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field2163++;
    }

    @OriginalMember(owner = "client!ca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 98)
    public final void focusLost(FocusEvent arg0) {
        class48.field868 = false;
        field2192++;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z", line = 108)
    public final boolean method852(int arg0) {
        field2197++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (arg0 != -58) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method857(12245, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 146)
    public final synchronized void method853(boolean arg0) {
        field2164++;
        if (class186.field3271 != null) {
            class186.field3271.removeFocusListener(this);
            class186.field3271.getParent().remove(class186.field3271);
        }
        Container var2;
        if (class317.field5460 != null) {
            var2 = class317.field5460;
        } else if (class198.field3627 == null) {
            var2 = class272.field4658.field52;
        } else {
            var2 = class198.field3627;
        }
        var2.setLayout((LayoutManager) null);
        class186.field3271 = new class107(this);
        var2.add(class186.field3271);
        class186.field3271.setSize(class112.field1969, field2200);
        class186.field3271.setVisible(true);
        if (class198.field3627 == var2) {
            Insets var3 = class198.field3627.getInsets();
            class186.field3271.setLocation(class100.field1775 + var3.left, class264.field4532 + var3.top);
        } else {
            class186.field3271.setLocation(class100.field1775, class264.field4532);
        }
        class186.field3271.addFocusListener(this);
        class186.field3271.requestFocus();
        class305.field5263 = true;
        class48.field868 = arg0;
        class105.field1889 = true;
        class277.field4765 = false;
        class91.field1668 = class224.method1536(false);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V", line = 192)
    public static void method854(boolean arg0) {
        field2198 = null;
        field2201 = null;
        field2199 = null;
        field2203 = null;
        if (!arg0) {
            field2199 = (class256) null;
        }
        field2167 = null;
        field2206 = null;
        field2196 = null;
        field2204 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V", line = 209)
    public final void method855(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2176++;
        try {
            if (class19.field257 != null) {
                class7.field109++;
                if (class7.field109 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method857(12245, "alreadyloaded");
                return;
            }
            field2200 = arg2;
            class186.field3269 = arg2;
            class264.field4532 = 0;
            class100.field1775 = 0;
            class19.field257 = this;
            class112.field1969 = arg3;
            class308.field5326 = arg3;
            class292.field5050 = arg1;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class83.field1504 = true;
            } else {
                class83.field1504 = false;
            }
            int var7 = -97 % ((arg4 - 17) / 44);
            if (class272.field4658 == null) {
                class289.field4995 = class272.field4658 = new class4(this, arg0, (String) null, 0);
            }
            class82 var8 = class272.field4658.method20(1, this, (byte) -62);
            while (var8.field1500 == 0) {
                class46.method381(10L, 78);
            }
            class165.field2931 = (Thread) var8.field1499;
        } catch (Exception var10) {
            class7.method48((String) null, (byte) 101, var10);
            this.method857(12245, "crash");
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZIIIIIIIIIII)Z", line = 268)
    public static final boolean method856(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 != 7789) {
            providesignlink((class4) null);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class199.field3628[var12][var13] = 0;
                class73.field1332[var12][var13] = 99999999;
            }
        }
        class199.field3628[arg6][arg3] = 99;
        field2185++;
        int var14 = arg3;
        int var15 = arg6;
        class73.field1332[arg6][arg3] = 0;
        byte var16 = 0;
        boolean var17 = false;
        int var18 = 0;
        class52.field954[var16] = arg6;
        int var32 = var16 + 1;
        class292.field5058[var16] = arg3;
        int[][] var19 = field2201[class255.field4377].field653;
        while (var32 != var18) {
            var15 = class52.field954[var18];
            var14 = class292.field5058[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg9 == var15 && arg11 == var14) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && field2201[class255.field4377].method274(arg7, -24872, var14, var15, 2, arg9, arg11, arg10 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && field2201[class255.field4377].method271(arg7, 32, var14, arg9, arg10 - 1, 2, var15, arg11)) {
                    var17 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg2 != 0 && field2201[class255.field4377].method270(arg1, arg11, var15, 2, arg5, arg2, var14, arg9, true)) {
                var17 = true;
                break;
            }
            int var20 = class73.field1332[var15][var14] + 1;
            if (var15 > 0 && class199.field3628[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class52.field954[var32] = var15 - 1;
                class292.field5058[var32] = var14;
                class199.field3628[var15 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class73.field1332[var15 - 1][var14] = var20;
            }
            if (var15 < 102 && class199.field3628[var15 + 1][var14] == 0 && (var19[var15 + 2][var14] & 0x12C0183) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class52.field954[var32] = var15 + 1;
                class292.field5058[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var15 + 1][var14] = 8;
                class73.field1332[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class199.field3628[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class52.field954[var32] = var15;
                class292.field5058[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var15][var14 - 1] = 1;
                class73.field1332[var15][var14 - 1] = var20;
            }
            if (var14 < 102 && class199.field3628[var15][var14 + 1] == 0 && (var19[var15][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class52.field954[var32] = var15;
                class292.field5058[var32] = var14 + 1;
                class199.field3628[var15][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class73.field1332[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class199.field3628[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14] & 0x12C0138) == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15][var14 - 1] & 0x12C0183) == 0) {
                class52.field954[var32] = var15 - 1;
                class292.field5058[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var15 - 1][var14 - 1] = 3;
                class73.field1332[var15 - 1][var14 - 1] = var20;
            }
            if (var15 < 102 && var14 > 0 && class199.field3628[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 2][var14] & 0x12C01E0) == 0) {
                class52.field954[var32] = var15 + 1;
                class292.field5058[var32] = var14 - 1;
                class199.field3628[var15 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class73.field1332[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 102 && class199.field3628[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15][var14 + 2] & 0x12C01E0) == 0) {
                class52.field954[var32] = var15 - 1;
                class292.field5058[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class199.field3628[var15 - 1][var14 + 1] = 6;
                class73.field1332[var15 - 1][var14 + 1] = var20;
            }
            if (var15 < 102 && var14 < 102 && class199.field3628[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class52.field954[var32] = var15 + 1;
                class292.field5058[var32] = var14 + 1;
                class199.field3628[var15 + 1][var14 + 1] = 12;
                class73.field1332[var15 + 1][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class91.field1669 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg11 - var23; var25 <= (arg11 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class73.field1332[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (arg9 + arg5 - 1 < var24) {
                            var26 = 1 - arg9 - (arg5 - var24);
                        }
                        int var27 = 0;
                        if (var25 < arg11) {
                            var27 = arg11 - var25;
                        } else if (var25 > (arg11 + arg2 - 1)) {
                            var27 = var25 + 1 - arg2 - arg11;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && var22 > class73.field1332[var24][var25]) {
                            var15 = var24;
                            var22 = class73.field1332[var24][var25];
                            var21 = var28;
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var15 && arg3 == var14) {
                return false;
            }
            class91.field1669 = 1;
        }
        byte var29 = 0;
        class52.field954[var29] = var15;
        int var33 = var29 + 1;
        class292.field5058[var29] = var14;
        int var30;
        int var31 = var30 = class199.field3628[var15][var14];
        while (arg6 != var15 || arg3 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class52.field954[var33] = var15;
                class292.field5058[var33++] = var14;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            var31 = class199.field3628[var15][var14];
        }
        if (var33 > 0) {
            class157.method1163(arg8, var33, 25);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 659)
    public final void focusGained(FocusEvent arg0) {
        class48.field868 = true;
        class105.field1889 = true;
        field2193++;
    }

    @OriginalMember(owner = "client!ca", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 668)
    public final String getParameter(String arg0) {
        field2174++;
        if (class198.field3627 == null) {
            return class272.field4658 == null || class272.field4658.field52 == this ? super.getParameter(arg0) : class272.field4658.field52.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;)V", line = 682)
    public final void method857(int arg0, String arg1) {
        field2168++;
        if (this.field2189) {
            return;
        }
        this.field2189 = true;
        System.out.println("error_game_" + arg1);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var4) {
        }
        if (arg0 != 12245) {
            this.method823((byte) 39);
        }
    }

    @OriginalMember(owner = "client!ca", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 704)
    public final void windowActivated(WindowEvent arg0) {
        field2184++;
    }

    @OriginalMember(owner = "client!ca", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 711)
    public final void windowOpened(WindowEvent arg0) {
        field2178++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V", line = 718)
    private final void method858(boolean arg0, int arg1) {
        field2169++;
        synchronized (this) {
            if (class187.field3300) {
                return;
            }
            class187.field3300 = true;
        }
        if (class272.field4658.field52 != null) {
            class272.field4658.field52.destroy();
        }
        try {
            this.method816((byte) -92);
        } catch (Exception var12) {
        }
        if (class186.field3271 != null) {
            try {
                class186.field3271.removeFocusListener(this);
                class186.field3271.getParent().remove(class186.field3271);
            } catch (Exception var11) {
            }
        }
        if (class272.field4658 != null) {
            try {
                class272.field4658.method24((byte) -45);
            } catch (Exception var10) {
            }
        }
        this.method817(arg1 + arg1);
        if (class198.field3627 != null) {
            try {
                System.exit(0);
            } catch (Throwable var9) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I", line = 778)
    public static final int method859(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        field2180++;
        if (arg0 >= -87) {
            return 90;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ca", name = "run", descriptor = "()V", line = 796)
    public final void run() {
        field2195++;
        try {
            if (class4.field53 != null) {
                String var1 = class4.field53.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class4.field67;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method857(12245, "wrongjava");
                        return;
                    }
                    class56.field1015 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class4.field67 == null || class4.field67.equals("1.4.2"))) {
                    this.method857(12245, "wrongjava");
                    return;
                }
            }
            if (class4.field67 != null && class4.field67.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class4.field67.length() > var3) {
                    char var5 = class4.field67.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = -(-var5 - var4 * 10) - 48;
                }
                if (var4 >= 5) {
                    class5.field82 = true;
                }
            }
            if (class272.field4658.field52 != null) {
                Method var6 = class4.field72;
                if (var6 != null) {
                    try {
                        var6.invoke(class272.field4658.field52, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class132.method897(86);
            this.method853(true);
            class108.field1920 = class177.method1280(class112.field1969, class186.field3271, field2200, 8);
            this.method823((byte) -121);
            class49.field895 = class284.method1991(false);
            while (class111.field1949 == 0L || class111.field1949 > class224.method1536(false)) {
                class59.field1067 = class49.field895.method715(class56.field1015, (byte) 50, class278.field4846);
                for (int var8 = 0; var8 < class59.field1067; var8++) {
                    this.method863(-7);
                }
                this.method864((byte) -5);
                class274.method1896((byte) 107, class186.field3271, class272.field4658);
            }
        } catch (Exception var11) {
            class7.method48((String) null, (byte) 98, var11);
            this.method857(12245, "crash");
        }
        this.method858(true, 0);
    }

    @OriginalMember(owner = "client!ca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 901)
    public final synchronized void paint(Graphics arg0) {
        field2186++;
        if (class19.field257 != this || class187.field3300) {
            return;
        }
        class105.field1889 = true;
        if (class5.field82 && !class253.field4323 && class224.method1536(false) - class91.field1668 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class308.field5326 <= var2.width && class186.field3269 <= var2.height) {
                class277.field4765 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 925)
    public final URL getCodeBase() {
        field2183++;
        if (class198.field3627 == null) {
            return class272.field4658 == null || class272.field4658.field52 == this ? super.getCodeBase() : class272.field4658.field52.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 940)
    public final void update(Graphics arg0) {
        field2194++;
        this.paint(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 948)
    public final void windowDeiconified(WindowEvent arg0) {
        field2173++;
    }

    @OriginalMember(owner = "client!ca", name = "destroy", descriptor = "()V", line = 963)
    public final void destroy() {
        field2166++;
        if (class19.field257 == this && !class187.field3300) {
            class111.field1949 = class224.method1536(false);
            class46.method381(5000L, -115);
            class289.field4995 = null;
            this.method858(false, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIZFIIII)[[I", line = 980)
    public static final int[][] method860(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field2190++;
        int[][] var9 = new int[arg1][arg6];
        class168 var10 = new class168();
        var10.field2972 = (int) (arg4 * 4096.0F);
        var10.field2980 = arg5;
        var10.field2985 = arg8;
        var10.field2977 = arg3;
        var10.field2969 = arg0;
        var10.method418((byte) -110);
        class271.method1873(arg1, (byte) -96, arg6);
        for (int var11 = arg7; var11 < arg1; var11++) {
            var10.method1225(var9[var11], arg7 + 1844420972, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIII)V", line = 1007)
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class91.field1665 = -1;
        class185.field3257 = arg3;
        class311.field5360 = class40.field731 * arg1 / arg4;
        field2187++;
        class271.field4645 = class154.field2753 * arg2 / arg0;
        class297.method2083(false);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 1033)
    public static final void method862(byte arg0) {
        field2181++;
        int var1 = class100.field1775;
        if (arg0 != 96) {
            method854(true);
        }
        int var2 = class264.field4532;
        int var3 = class308.field5326 - var1 - class112.field1969;
        int var4 = class186.field3269 - field2200 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class317.field5460 != null) {
                var5 = class317.field5460;
            } else if (class198.field3627 == null) {
                var5 = class272.field4658.field52;
            } else {
                var5 = class198.field3627;
            }
            int var6 = 0;
            int var7 = 0;
            if (class198.field3627 == var5) {
                Insets var8 = class198.field3627.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class186.field3269);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class308.field5326, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class308.field5326 - var3, var7, var3, class186.field3269);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class186.field3269 + var7 - var4, class308.field5326, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ca", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1099)
    public final void windowIconified(WindowEvent arg0) {
        field2188++;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V", line = 1112)
    private final void method863(int arg0) {
        long var2 = class229.field3928[class256.field4393];
        field2172++;
        long var4 = class224.method1536(false);
        if (var2 != 0L && var2 < var4) {
        }
        class229.field3928[class256.field4393] = var4;
        class256.field4393 = class256.field4393 + 1 & 0x1F;
        synchronized (this) {
            class305.field5263 = class48.field868;
        }
        int var8 = -23 % ((arg0 - 40) / 45);
        this.method822(1);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 1143)
    private final void method864(byte arg0) {
        long var2 = class254.field4353[class201.field3663];
        field2177++;
        long var4 = class224.method1536(false);
        class254.field4353[class201.field3663] = var4;
        if (arg0 != -5) {
            return;
        }
        class201.field3663 = class201.field3663 + 1 & 0x1F;
        if (var2 != 0L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class255.field4373 = ((var6 >> 1) + 32000) / var6;
        }
        if (class80.field1491++ > 50) {
            class80.field1491 -= 50;
            class105.field1889 = true;
            class186.field3271.setSize(class112.field1969, field2200);
            class186.field3271.setVisible(true);
            if (class198.field3627 != null && class317.field5460 == null) {
                Insets var7 = class198.field3627.getInsets();
                class186.field3271.setLocation(var7.left + class100.field1775, class264.field4532 + var7.top);
            } else {
                class186.field3271.setLocation(class100.field1775, class264.field4532);
            }
        }
        this.method821(arg0 + 11999);
    }

    @OriginalMember(owner = "client!ca", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 1190)
    public final URL getDocumentBase() {
        field2179++;
        if (class198.field3627 == null) {
            return class272.field4658 == null || class272.field4658.field52 == this ? super.getDocumentBase() : class272.field4658.field52.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 1206)
    public final AppletContext getAppletContext() {
        field2175++;
        if (class198.field3627 == null) {
            return class272.field4658 == null || class272.field4658.field52 == this ? super.getAppletContext() : class272.field4658.field52.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1258)
    public final void windowDeactivated(WindowEvent arg0) {
        field2191++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public abstract void method822(int arg0);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public abstract void method817(int arg0);

    @OriginalMember(owner = "client!ca", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public abstract void method816(byte arg0);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public abstract void method821(int arg0);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
    public abstract void method823(byte arg0);
}
