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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class284 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Z")
    private boolean field5026 = false;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[S")
    public static short[] field5032 = new short[500];

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lid;")
    private static class149 field5034 = class60.method382("Mar", (byte) 46);

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lid;")
    private static class149 field5037 = class60.method382("Jan", (byte) 44);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lid;")
    private static class149 field5021 = class60.method382("Aug", (byte) 76);

    @OriginalMember(owner = "client!p", name = "H", descriptor = "Lid;")
    private static class149 field5044 = class60.method382("Feb", (byte) 48);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lid;")
    private static class149 field5012 = class60.method382("Jun", (byte) 110);

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Lid;")
    private static class149 field5040 = class60.method382("May", (byte) 15);

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lid;")
    private static class149 field5028 = class60.method382("Apr", (byte) 43);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Lid;")
    private static class149 field5047 = class60.method382("Jul", (byte) 42);

    @OriginalMember(owner = "client!p", name = "y", descriptor = "Lid;")
    private static class149 field5036 = class60.method382("Nov", (byte) 26);

    @OriginalMember(owner = "client!p", name = "T", descriptor = "Lid;")
    private static class149 field5055 = class60.method382("red:", (byte) 113);

    @OriginalMember(owner = "client!p", name = "X", descriptor = "Lid;")
    private static class149 field5059 = class60.method382("Sep", (byte) 68);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lid;")
    public static class149 field5022 = field5055;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "Lid;")
    private static class149 field5051 = class60.method382("Oct", (byte) 64);

    @OriginalMember(owner = "client!p", name = "W", descriptor = "Lid;")
    public static class149 field5058 = class60.method382("Versteckt", (byte) 38);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lid;")
    public static class149 field5031 = field5055;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Lid;")
    private static class149 field5053 = class60.method382("Dec", (byte) 43);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[Lid;")
    public static class149[] field5014 = new class149[] { field5037, field5044, field5034, field5028, field5040, field5012, field5047, field5021, field5059, field5051, field5036, field5053 };

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!p", name = "bb", descriptor = "Z")
    public static boolean field5063;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "[I")
    public static int[] field5046;

    @OriginalMember(owner = "client!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeiconified(WindowEvent arg0) {
        field5017++;
    }

    @OriginalMember(owner = "client!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
        field5019++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)[Lvc;")
    public static final class190[] method1945(byte arg0) {
        class190[] var1 = new class190[class84.field1528];
        if (arg0 != -10) {
            return null;
        }
        for (int var2 = 0; var2 < class84.field1528; var2++) {
            int var3 = class55.field991[var2] * class283.field5005[var2];
            byte[] var4 = class73.field1276[var2];
            if (class106.field1834[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class69.field1199[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class40.method238(class136.method953(var8[var9], 255) << 24, class108.field1865[class136.method953(var4[var9], 255)]);
                }
                var1[var2] = new class274(class251.field4406, class286.field5082, class147.field2651[var2], class18.field259[var2], class283.field5005[var2], class55.field991[var2], var7);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class108.field1865[class136.method953(var4[var6], 255)];
                }
                var1[var2] = new class46(class251.field4406, class286.field5082, class147.field2651[var2], class18.field259[var2], class283.field5005[var2], class55.field991[var2], var5);
            }
        }
        field5048++;
        class103.method731(false);
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowActivated(WindowEvent arg0) {
        field5045++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method1946(int arg0, String arg1) {
        field5052++;
        if (this.field5026) {
            return;
        }
        this.field5026 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 == 31439) {
            try {
                this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        class3.field41 = true;
        field5057++;
        class218.field3852 = true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public abstract void method1114(int arg0);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public abstract void method1106(byte arg0);

    @OriginalMember(owner = "client!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowDeactivated(WindowEvent arg0) {
        field5062++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
    public final void method1947(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5018++;
        if (arg0 > -124) {
            this.update((Graphics) null);
        }
        try {
            if (class168.field3111 == null) {
                class10.field141 = arg3;
                class240.field4197 = arg4;
                class273.field4910 = arg4;
                class213.field3772 = 0;
                class168.field3111 = this;
                class112.field1926 = 0;
                class218.field3851 = arg1;
                class35.field530 = arg1;
                String var6 = this.getParameter("openwinjs");
                boolean var10000;
                if (var6 != null && var6.equals("1")) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
                if (class272.field4900 == null) {
                    class263.field4682 = class272.field4900 = new class29(this, arg2, (String) null, 0);
                }
                class187 var7 = class272.field4900.method175(2, this, 1);
                while (var7.field3358 == 0) {
                    class151.method1074(-112, 10L);
                }
            } else {
                class84.field1535++;
                if (class84.field1535 >= 3) {
                    this.method1946(31439, "alreadyloaded");
                } else {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                }
            }
        } catch (Exception var9) {
            class100.method720(var9, (String) null, 1);
            this.method1946(31439, "crash");
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lra;Z)V")
    public static final void method1948(class231 arg0, boolean arg1) {
        class150.field2739.method1131(arg0, false);
        while (true) {
            class231 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class231[][] var7;
            class231 var66;
            do {
                class231 var65;
                do {
                    class231 var64;
                    do {
                        class231 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class231) class150.field2739.method1137(true);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field4063);
                                            var3 = var2.field4050;
                                            var4 = var2.field4049;
                                            var5 = var2.field4064;
                                            var6 = var2.field4067;
                                            var7 = class261.field4664[var5];
                                            if (!var2.field4055) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class231 var8 = class261.field4664[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field4063) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class118.field2011 && var3 > class224.field3945) {
                                                    class231 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field4063 && (var9.field4055 || (var2.field4068 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class118.field2011 && var3 < class286.field5081 - 1) {
                                                    class231 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field4063 && (var10.field4055 || (var2.field4068 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class124.field2186 && var4 > class75.field1348) {
                                                    class231 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field4063 && (var11.field4055 || (var2.field4068 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class124.field2186 && var4 < class245.field4314 - 1) {
                                                    class231 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field4063 && (var12.field4055 || (var2.field4068 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field4055 = false;
                                            if (var2.field4065 != null) {
                                                class231 var13 = var2.field4065;
                                                if (var13.field4059 == null) {
                                                    if (var13.field4051 != null) {
                                                        if (class7.method37(0, var3, var4)) {
                                                            class223.method1503(var13.field4051, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, true);
                                                        } else {
                                                            class223.method1503(var13.field4051, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class7.method37(0, var3, var4)) {
                                                    class199.method1365(var13.field4059, 0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, true);
                                                } else {
                                                    class199.method1365(var13.field4059, 0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, false);
                                                }
                                                class125 var14 = var13.field4053;
                                                if (var14 != null) {
                                                    var14.field2203.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var14.field2202 - class82.field1495, var14.field2206 - class37.field554, var14.field2207 - class226.field3971, var14.field2200, var5, (class88) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field4047; var15++) {
                                                    class23 var16 = var13.field4061[var15];
                                                    if (var16 != null) {
                                                        var16.field343.method54(var16.field323, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var16.field320 - class82.field1495, var16.field337 - class37.field554, var16.field336 - class226.field3971, var16.field338, var5, (class88) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field4059 == null) {
                                                if (var2.field4051 != null) {
                                                    if (class7.method37(var6, var3, var4)) {
                                                        class223.method1503(var2.field4051, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class223.method1503(var2.field4051, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, false);
                                                    }
                                                }
                                            } else if (class7.method37(var6, var3, var4)) {
                                                class199.method1365(var2.field4059, var6, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field4059.field3371 != 12345678 || class246.field4317 && var5 <= class138.field2526) {
                                                    class199.method1365(var2.field4059, var6, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class100 var18 = var2.field4048;
                                                if (var18 != null && (var18.field1765 & 0x80000000L) != 0L) {
                                                    var18.field1764.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var18.field1767 - class82.field1495, var18.field1772 - class37.field554, var18.field1761 - class226.field3971, var18.field1765, var5, (class88) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class125 var21 = var2.field4053;
                                            class158 var22 = var2.field4056;
                                            if (var21 != null || var22 != null) {
                                                if (class118.field2011 == var3) {
                                                    var19++;
                                                } else if (class118.field2011 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class124.field2186 == var4) {
                                                    var19 += 3;
                                                } else if (class124.field2186 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class96.field1707[var19];
                                                var2.field4060 = class38.field561[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2205 & class232.field4083[var19]) == 0) {
                                                    var2.field4057 = 0;
                                                } else if (var21.field2205 == 16) {
                                                    var2.field4057 = 3;
                                                    var2.field4062 = class211.field3756[var19];
                                                    var2.field4072 = 3 - var2.field4062;
                                                } else if (var21.field2205 == 32) {
                                                    var2.field4057 = 6;
                                                    var2.field4062 = class79.field1467[var19];
                                                    var2.field4072 = 6 - var2.field4062;
                                                } else if (var21.field2205 == 64) {
                                                    var2.field4057 = 12;
                                                    var2.field4062 = class50.field902[var19];
                                                    var2.field4072 = 12 - var2.field4062;
                                                } else {
                                                    var2.field4057 = 9;
                                                    var2.field4062 = class62.field1110[var19];
                                                    var2.field4072 = 9 - var2.field4062;
                                                }
                                                if ((var21.field2205 & var20) != 0 && !class271.method1886(var6, var3, var4, var21.field2205)) {
                                                    var21.field2203.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var21.field2202 - class82.field1495, var21.field2206 - class37.field554, var21.field2207 - class226.field3971, var21.field2200, var5, (class88) null);
                                                }
                                                if ((var21.field2204 & var20) != 0 && !class271.method1886(var6, var3, var4, var21.field2204)) {
                                                    var21.field2197.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var21.field2202 - class82.field1495, var21.field2206 - class37.field554, var21.field2207 - class226.field3971, var21.field2200, var5, (class88) null);
                                                }
                                            }
                                            if (var22 != null && !class93.method681(var6, var3, var4, var22.field2911.method53())) {
                                                if ((var22.field2915 & var20) != 0) {
                                                    var22.field2911.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var22.field2906 + var22.field2910 - class82.field1495, var22.field2907 - class37.field554, var22.field2904 + var22.field2914 - class226.field3971, var22.field2903, var5, (class88) null);
                                                } else if (var22.field2915 == 256) {
                                                    int var23 = var22.field2906 - class82.field1495;
                                                    int var24 = var22.field2907 - class37.field554;
                                                    int var25 = var22.field2904 - class226.field3971;
                                                    int var26 = var22.field2909;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2911.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var22.field2910 + var23, var24, var22.field2914 + var25, var22.field2903, var5, (class88) null);
                                                    } else if (var22.field2913 != null) {
                                                        var22.field2913.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var23, var24, var25, var22.field2903, var5, (class88) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class100 var29 = var2.field4048;
                                                if (var29 != null && (var29.field1765 & 0x80000000L) == 0L) {
                                                    var29.field1764.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var29.field1767 - class82.field1495, var29.field1772 - class37.field554, var29.field1761 - class226.field3971, var29.field1765, var5, (class88) null);
                                                }
                                                class152 var30 = var2.field4052;
                                                if (var30 != null && var30.field2763 == 0) {
                                                    if (var30.field2761 != null) {
                                                        var30.field2761.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var30.field2771 - class82.field1495, var30.field2768 - class37.field554, var30.field2760 - class226.field3971, var30.field2764, var5, (class88) null);
                                                    }
                                                    if (var30.field2765 != null) {
                                                        var30.field2765.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var30.field2771 - class82.field1495, var30.field2768 - class37.field554, var30.field2760 - class226.field3971, var30.field2764, var5, (class88) null);
                                                    }
                                                    if (var30.field2770 != null) {
                                                        var30.field2770.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var30.field2771 - class82.field1495, var30.field2768 - class37.field554, var30.field2760 - class226.field3971, var30.field2764, var5, (class88) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field4068;
                                            if (var31 != 0) {
                                                if (var3 < class118.field2011 && (var31 & 0x4) != 0) {
                                                    class231 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field4063) {
                                                        class150.field2739.method1131(var32, false);
                                                    }
                                                }
                                                if (var4 < class124.field2186 && (var31 & 0x2) != 0) {
                                                    class231 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field4063) {
                                                        class150.field2739.method1131(var33, false);
                                                    }
                                                }
                                                if (var3 > class118.field2011 && (var31 & 0x1) != 0) {
                                                    class231 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field4063) {
                                                        class150.field2739.method1131(var34, false);
                                                    }
                                                }
                                                if (var4 > class124.field2186 && (var31 & 0x8) != 0) {
                                                    class231 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field4063) {
                                                        class150.field2739.method1131(var35, false);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field4057 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field4047; var37++) {
                                                if (class96.field1704 != var2.field4061[var37].field335 && (var2.field4054[var37] & var2.field4057) == var2.field4062) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class125 var38 = var2.field4053;
                                                if (!class271.method1886(var6, var3, var4, var38.field2205)) {
                                                    var38.field2203.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var38.field2202 - class82.field1495, var38.field2206 - class37.field554, var38.field2207 - class226.field3971, var38.field2200, var5, (class88) null);
                                                }
                                                var2.field4057 = 0;
                                            }
                                        }
                                        if (!var2.field4058) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field4047;
                                            var2.field4058 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class23 var42 = var2.field4061[var41];
                                                if (class96.field1704 != var42.field335) {
                                                    for (int var43 = var42.field318; var43 <= var42.field331; var43++) {
                                                        for (int var44 = var42.field330; var44 <= var42.field342; var44++) {
                                                            class231 var45 = var7[var43][var44];
                                                            if (var45.field4055) {
                                                                var2.field4058 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field4057 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field318) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field331) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field330) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field342) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field4057) == var2.field4072) {
                                                                    var2.field4058 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class140.field2572[var40++] = var42;
                                                    int var47 = class118.field2011 - var42.field318;
                                                    int var48 = var42.field331 - class118.field2011;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class124.field2186 - var42.field330;
                                                    int var50 = var42.field342 - class124.field2186;
                                                    if (var50 > var49) {
                                                        var42.field329 = var47 + var50;
                                                    } else {
                                                        var42.field329 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class23 var54 = class140.field2572[var53];
                                                    if (class96.field1704 != var54.field335) {
                                                        if (var54.field329 > var51) {
                                                            var51 = var54.field329;
                                                            var52 = var53;
                                                        } else if (var54.field329 == var51) {
                                                            int var55 = var54.field320 - class82.field1495;
                                                            int var56 = var54.field336 - class226.field3971;
                                                            int var57 = class140.field2572[var52].field320 - class82.field1495;
                                                            int var58 = class140.field2572[var52].field336 - class226.field3971;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class23 var59 = class140.field2572[var52];
                                                var59.field335 = class96.field1704;
                                                if (!class244.method1706(var6, var59.field318, var59.field331, var59.field330, var59.field342, var59.field343.method53())) {
                                                    var59.field343.method54(var59.field323, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var59.field320 - class82.field1495, var59.field337 - class37.field554, var59.field336 - class226.field3971, var59.field338, var5, (class88) null);
                                                }
                                                for (int var60 = var59.field318; var60 <= var59.field331; var60++) {
                                                    for (int var61 = var59.field330; var61 <= var59.field342; var61++) {
                                                        class231 var62 = var7[var60][var61];
                                                        if (var62.field4057 != 0) {
                                                            class150.field2739.method1131(var62, false);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field4063) {
                                                            class150.field2739.method1131(var62, false);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field4058) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field4058 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field4063);
                            } while (var2.field4057 != 0);
                            if (var3 > class118.field2011 || var3 <= class224.field3945) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field4063);
                        if (var3 < class118.field2011 || var3 >= class286.field5081 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field4063);
                    if (var4 > class124.field2186 || var4 <= class75.field1348) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field4063);
                if (var4 < class124.field2186 || var4 >= class245.field4314 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field4063);
            var2.field4063 = false;
            class68.field1194--;
            class152 var67 = var2.field4052;
            if (var67 != null && var67.field2763 != 0) {
                if (var67.field2761 != null) {
                    var67.field2761.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var67.field2771 - class82.field1495, var67.field2768 - class37.field554 - var67.field2763, var67.field2760 - class226.field3971, var67.field2764, var5, (class88) null);
                }
                if (var67.field2765 != null) {
                    var67.field2765.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var67.field2771 - class82.field1495, var67.field2768 - class37.field554 - var67.field2763, var67.field2760 - class226.field3971, var67.field2764, var5, (class88) null);
                }
                if (var67.field2770 != null) {
                    var67.field2770.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var67.field2771 - class82.field1495, var67.field2768 - class37.field554 - var67.field2763, var67.field2760 - class226.field3971, var67.field2764, var5, (class88) null);
                }
            }
            if (var2.field4060 != 0) {
                class158 var68 = var2.field4056;
                if (var68 != null && !class93.method681(var6, var3, var4, var68.field2911.method53())) {
                    if ((var68.field2915 & var2.field4060) != 0) {
                        var68.field2911.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var68.field2906 + var68.field2910 - class82.field1495, var68.field2907 - class37.field554, var68.field2904 + var68.field2914 - class226.field3971, var68.field2903, var5, (class88) null);
                    } else if (var68.field2915 == 256) {
                        int var69 = var68.field2906 - class82.field1495;
                        int var70 = var68.field2907 - class37.field554;
                        int var71 = var68.field2904 - class226.field3971;
                        int var72 = var68.field2909;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2911.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var68.field2910 + var69, var70, var68.field2914 + var71, var68.field2903, var5, (class88) null);
                        } else if (var68.field2913 != null) {
                            var68.field2913.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var69, var70, var71, var68.field2903, var5, (class88) null);
                        }
                    }
                }
                class125 var75 = var2.field4053;
                if (var75 != null) {
                    if ((var75.field2204 & var2.field4060) != 0 && !class271.method1886(var6, var3, var4, var75.field2204)) {
                        var75.field2197.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var75.field2202 - class82.field1495, var75.field2206 - class37.field554, var75.field2207 - class226.field3971, var75.field2200, var5, (class88) null);
                    }
                    if ((var75.field2205 & var2.field4060) != 0 && !class271.method1886(var6, var3, var4, var75.field2205)) {
                        var75.field2203.method54(0, class69.field1205, class243.field4264, class257.field4493, class78.field1465, var75.field2202 - class82.field1495, var75.field2206 - class37.field554, var75.field2207 - class226.field3971, var75.field2200, var5, (class88) null);
                    }
                }
            }
            if (var5 < class62.field1114 - 1) {
                class231 var76 = class261.field4664[var5 + 1][var3][var4];
                if (var76 != null && var76.field4063) {
                    class150.field2739.method1131(var76, false);
                }
            }
            if (var3 < class118.field2011) {
                class231 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field4063) {
                    class150.field2739.method1131(var77, false);
                }
            }
            if (var4 < class124.field2186) {
                class231 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field4063) {
                    class150.field2739.method1131(var78, false);
                }
            }
            if (var3 > class118.field2011) {
                class231 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field4063) {
                    class150.field2739.method1131(var79, false);
                }
            }
            if (var4 > class124.field2186) {
                class231 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field4063) {
                    class150.field2739.method1131(var80, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusLost(FocusEvent arg0) {
        class3.field41 = false;
        field5042++;
    }

    @OriginalMember(owner = "client!p", name = "stop", descriptor = "()V")
    public final void stop() {
        field5039++;
        if (class168.field3111 == this && !class276.field4941) {
            class272.field4888 = class81.method608(19644) + 4000L;
        }
    }

    @OriginalMember(owner = "client!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
    public final URL getDocumentBase() {
        field5013++;
        if (class69.field1203 == null) {
            return class272.field4900 == null || class272.field4900.field436 == this ? super.getDocumentBase() : class272.field4900.field436.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowClosed(WindowEvent arg0) {
        field5027++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public abstract void method1113(boolean arg0);

    @OriginalMember(owner = "client!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field5030++;
    }

    @OriginalMember(owner = "client!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowIconified(WindowEvent arg0) {
        field5041++;
    }

    @OriginalMember(owner = "client!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        field5054++;
        if (class69.field1203 == null) {
            return class272.field4900 == null || class272.field4900.field436 == this ? super.getParameter(arg0) : class272.field4900.field436.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public static void method1949(int arg0) {
        field5036 = null;
        field5022 = null;
        field5059 = null;
        field5037 = null;
        field5031 = null;
        field5051 = null;
        field5014 = null;
        field5047 = null;
        field5034 = null;
        field5046 = null;
        field5012 = null;
        field5058 = null;
        field5040 = null;
        field5032 = null;
        if (arg0 <= 69) {
            return;
        }
        field5053 = null;
        field5055 = null;
        field5028 = null;
        field5021 = null;
        field5044 = null;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public abstract void method1103(int arg0);

    @OriginalMember(owner = "client!p", name = "providesignlink", descriptor = "(Lfb;)V")
    public static final void providesignlink(class29 arg0) {
        field5056++;
        class272.field4900 = arg0;
        class263.field4682 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public abstract void method1108(int arg0);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public final synchronized void method1950(byte arg0) {
        int var2 = 118 % ((arg0 + 10) / 38);
        field5060++;
        if (class244.field4295 != null) {
            class244.field4295.removeFocusListener(this);
            class244.field4295.getParent().remove(class244.field4295);
        }
        Container var3;
        if (class47.field756 != null) {
            var3 = class47.field756;
        } else if (class69.field1203 == null) {
            var3 = class272.field4900.field436;
        } else {
            var3 = class69.field1203;
        }
        var3.setLayout((LayoutManager) null);
        class244.field4295 = new class277(this);
        var3.add(class244.field4295);
        class244.field4295.setSize(class218.field3851, class240.field4197);
        class244.field4295.setVisible(true);
        if (class69.field1203 == var3) {
            Insets var4 = class69.field1203.getInsets();
            class244.field4295.setLocation(class213.field3772 + var4.left, class112.field1926 + var4.top);
        } else {
            class244.field4295.setLocation(class213.field3772, class112.field1926);
        }
        class244.field4295.addFocusListener(this);
        class244.field4295.requestFocus();
        class3.field41 = true;
        class174.field3207 = true;
        class218.field3852 = true;
        class22.field308 = false;
        class190.field3412 = class81.method608(19644);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILjava/lang/String;IZI)V")
    public final void method1951(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5, boolean arg6, int arg7) {
        try {
            class213.field3772 = 0;
            class112.field1926 = 0;
            class10.field141 = arg3;
            if (arg7 != -11014) {
                this.destroy();
            }
            class240.field4197 = arg5;
            class273.field4910 = arg5;
            class168.field3111 = this;
            class218.field3851 = arg0;
            class35.field530 = arg0;
            class69.field1203 = new Frame();
            class69.field1203.setTitle("Jagex");
            class69.field1203.setResizable(true);
            class69.field1203.addWindowListener(this);
            class69.field1203.setVisible(true);
            class69.field1203.toFront();
            Insets var9 = class69.field1203.getInsets();
            class69.field1203.setSize(var9.right + var9.left + class35.field530, class273.field4910 - -var9.top + var9.bottom);
            class263.field4682 = class272.field4900 = new class29((Applet) null, arg1, arg4, arg2);
            class187 var10 = class272.field4900.method175(arg7 + 11016, this, 1);
            while (var10.field3358 == 0) {
                class151.method1074(-124, 10L);
            }
        } catch (Exception var12) {
            class100.method720(var12, (String) null, 1);
        }
        field5061++;
    }

    @OriginalMember(owner = "client!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
    public final void windowOpened(WindowEvent arg0) {
        field5038++;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    private final void method1952(byte arg0) {
        field5025++;
        if (arg0 <= 8) {
            this.getDocumentBase();
        }
        long var2 = class81.method608(19644);
        long var4 = class272.field4890[class214.field3788];
        boolean var10000;
        if (var4 == 0L || var4 >= var2) {
            var10000 = false;
        } else {
            var10000 = true;
        }
        class272.field4890[class214.field3788] = var2;
        class214.field3788 = class214.field3788 + 1 & 0x1F;
        synchronized (this) {
            class174.field3207 = class3.field41;
        }
        this.method1114(121);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    private final void method1953(int arg0) {
        field5029++;
        if (arg0 != -10911) {
            field5051 = null;
        }
        long var2 = class81.method608(19644);
        long var4 = class146.field2632[class263.field4673];
        class146.field2632[class263.field4673] = var2;
        class263.field4673 = class263.field4673 + 1 & 0x1F;
        if (var4 != 0L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class133.field2412 = ((var6 >> 1) + 32000) / var6;
        }
        if (class256.field4478++ > 50) {
            class256.field4478 -= 50;
            class218.field3852 = true;
            class244.field4295.setSize(class218.field3851, class240.field4197);
            class244.field4295.setVisible(true);
            if (class69.field1203 != null && class47.field756 == null) {
                Insets var7 = class69.field1203.getInsets();
                class244.field4295.setLocation(class213.field3772 + var7.left, var7.top - -class112.field1926);
            } else {
                class244.field4295.setLocation(class213.field3772, class112.field1926);
            }
        }
        this.method1108(0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)V")
    private final void method1954(int arg0, boolean arg1) {
        field5024++;
        if (arg0 != -864) {
            return;
        }
        synchronized (this) {
            if (class276.field4941) {
                return;
            }
            class276.field4941 = true;
        }
        if (class272.field4900.field436 != null) {
            class272.field4900.field436.destroy();
        }
        try {
            this.method1103(0);
        } catch (Exception var9) {
        }
        if (class244.field4295 != null) {
            try {
                class244.field4295.removeFocusListener(this);
                class244.field4295.getParent().remove(class244.field4295);
            } catch (Exception var8) {
            }
        }
        if (class272.field4900 != null) {
            try {
                class272.field4900.method171(126);
            } catch (Exception var7) {
            }
        }
        this.method1113(true);
        if (class69.field1203 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg1);
    }

    @OriginalMember(owner = "client!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        field5049++;
        if (class69.field1203 == null) {
            return class272.field4900 == null || class272.field4900.field436 == this ? super.getCodeBase() : class272.field4900.field436.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "destroy", descriptor = "()V")
    public final void destroy() {
        field5033++;
        if (class168.field3111 == this && !class276.field4941) {
            class272.field4888 = class81.method608(19644);
            class151.method1074(-105, 5000L);
            class263.field4682 = null;
            this.method1954(-864, false);
        }
    }

    @OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
    public final void run() {
        field5035++;
        try {
            if (class29.field437 != null) {
                String var1 = class29.field437.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class29.field432;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method1946(31439, "wrongjava");
                        return;
                    }
                    class138.field2525 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class29.field432 == null || class29.field432.equals("1.4.2"))) {
                    this.method1946(31439, "wrongjava");
                    return;
                }
            }
            if (class29.field432 != null && class29.field432.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class29.field432.length() > var3) {
                    char var5 = class29.field432.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - '0');
                    var3++;
                }
                if (var4 >= 5) {
                    class11.field163 = true;
                }
            }
            if (class272.field4900.field436 != null) {
                Method var6 = class29.field443;
                if (var6 != null) {
                    try {
                        var6.invoke(class272.field4900.field436, Boolean.TRUE);
                    } catch (Throwable var9) {
                    }
                }
            }
            class208.method1415(57);
            this.method1950((byte) -90);
            class226.field3970 = class155.method1099(-62, class240.field4197, class244.field4295, class218.field3851);
            this.method1106((byte) -114);
            class24.field367 = class261.method1812((byte) 117);
            while (class272.field4888 == 0L || class81.method608(19644) < class272.field4888) {
                class264.field4735 = class24.field367.method194((byte) 61, class138.field2525, class137.field2508);
                for (int var7 = 0; var7 < class264.field4735; var7++) {
                    this.method1952((byte) 85);
                }
                this.method1953(-10911);
                class147.method1012(-3, class244.field4295, class272.field4900);
            }
        } catch (Exception var10) {
            class100.method720(var10, (String) null, 1);
            this.method1946(31439, "crash");
        }
        this.method1954(-864, true);
    }

    @OriginalMember(owner = "client!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        field5050++;
        if (class69.field1203 == null) {
            return class272.field4900 == null || class272.field4900.field436 == this ? super.getAppletContext() : class272.field4900.field436.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)Z")
    public final boolean method1955(int arg0) {
        field5015++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else {
            if (arg0 != 8) {
                field5053 = null;
            }
            if (var2.endsWith("127.0.0.1")) {
                return true;
            }
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method1946(31439, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final synchronized void paint(Graphics arg0) {
        field5020++;
        if (class168.field3111 != this || class276.field4941) {
            return;
        }
        class218.field3852 = true;
        if (class11.field163 && class81.method608(19644) - class190.field3412 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || class35.field530 <= var2.width && class273.field4910 <= var2.height) {
                class22.field308 = true;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "start", descriptor = "()V")
    public final void start() {
        field5043++;
        if (class168.field3111 == this && !class276.field4941) {
            class272.field4888 = 0L;
        }
    }
}
