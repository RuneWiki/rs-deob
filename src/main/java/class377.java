import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class377 extends class286 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "[Z")
    private boolean[] field5389 = new boolean[112];

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "Z")
    public static boolean field5388;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "[Z")
    public static boolean[] field5395;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Lgf;")
    private class151 field5375;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "Lgf;")
    private class151 field5378;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lgf;")
    private class151 field5379;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field5377;

    static {
        new class442((String) null, "geschickt werden.", (String) null, (String) null);
        field5388 = false;
        field5395 = new boolean[100];
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 8)
    public static final void method2409(int arg0) {
        class333.field4591.method1188(56);
        field5382++;
        int var1 = class333.field4591.method1186((byte) -97, 8);
        if (var1 < class125.field1758) {
            for (int var2 = var1; var2 < class125.field1758; var2++) {
                class112.field1627[class99.field1368++] = class135.field1967[var2];
            }
        }
        if (arg0 != 4) {
            return;
        }
        if (class125.field1758 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class125.field1758 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class135.field1967[var3];
            class198 var5 = class98.field1358[var4];
            int var6 = class333.field4591.method1186((byte) -97, 1);
            if (var6 == 0) {
                class135.field1967[class125.field1758++] = var4;
                var5.field5260 = class276.field3837;
            } else {
                int var7 = class333.field4591.method1186((byte) -97, 2);
                if (var7 == 0) {
                    class135.field1967[class125.field1758++] = var4;
                    var5.field5260 = class276.field3837;
                    class314.field4301[class438.field6171++] = var4;
                } else if (var7 == 1) {
                    class135.field1967[class125.field1758++] = var4;
                    var5.field5260 = class276.field3837;
                    int var8 = class333.field4591.method1186((byte) -97, 3);
                    var5.method1295(1, var8, arg0 ^ 0xFFFFC33A);
                    int var9 = class333.field4591.method1186((byte) -97, 1);
                    if (var9 == 1) {
                        class314.field4301[class438.field6171++] = var4;
                    }
                } else if (var7 == 2) {
                    class135.field1967[class125.field1758++] = var4;
                    var5.field5260 = class276.field3837;
                    if (class333.field4591.method1186((byte) -97, 1) == 1) {
                        int var11 = class333.field4591.method1186((byte) -97, 3);
                        var5.method1295(2, var11, -15554);
                        int var12 = class333.field4591.method1186((byte) -97, 3);
                        var5.method1295(2, var12, -15554);
                    } else {
                        int var10 = class333.field4591.method1186((byte) -97, 3);
                        var5.method1295(0, var10, -15554);
                    }
                    int var13 = class333.field4591.method1186((byte) -97, 1);
                    if (var13 == 1) {
                        class314.field4301[class438.field6171++] = var4;
                    }
                } else if (var7 == 3) {
                    class112.field1627[class99.field1368++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 121)
    public final void method1865(byte arg0) {
        if (arg0 == -80) {
            field5386++;
            this.method2414(true);
        }
    }

    @OriginalMember(owner = "client!sn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 135)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2410(0, arg0, 12059);
        field5380++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V", line = 146)
    private final void method2410(int arg0, KeyEvent arg1, int arg2) {
        field5385++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class272.field3774.length) {
            int var6 = class272.field3774[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (arg2 != 12059) {
            field5396 = -44;
        }
        if (var5 > 0) {
            this.method2412(arg0, arg2 - 12178, var5, '\u0000');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 180)
    private final void method2411(byte arg0, Component arg1) {
        this.method2414(true);
        field5394++;
        this.field5377 = arg1;
        if (arg0 < 29) {
            this.method2412(-49, 13, 12, (char) 65460);
        }
        Method var3 = class294.field4127;
        if (var3 != null) {
            try {
                var3.invoke(this.field5377, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field5377.addKeyListener(this);
        this.field5377.addFocusListener(this);
    }

    @OriginalMember(owner = "client!sn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 206)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5374++;
        char var2 = arg0.getKeyChar();
        if (var2 == '\u0000') {
            var2 = '\u0000';
        }
        if (var2 > '\u0000' && class69.method533(var2, 126)) {
            this.method2412(2, -80, -1, var2);
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIC)V", line = 228)
    private final void method2412(int arg0, int arg1, int arg2, char arg3) {
        field5392++;
        class151 var5 = new class151();
        var5.field2150 = arg2;
        var5.field2136 = arg3;
        var5.field2149 = arg0;
        var5.field2151 = class385.method2442(-6631);
        if (this.field5378 == null) {
            this.field5379 = var5;
        } else {
            this.field5378.field2155 = var5;
        }
        if (arg1 >= -69) {
            this.method2412(66, 82, 78, (char) 65520);
        }
        this.field5378 = var5;
    }

    @OriginalMember(owner = "client!sn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 250)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5393++;
        this.method2412(-1, -85, 0, '\u0000');
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V", line = 260)
    public final synchronized void method1866(byte arg0) {
        field5391++;
        int var2 = -51 % ((-arg0 - 32) / 63);
        for (class151 var3 = this.field5379; var3 != null; var3 = var3.field2155) {
            if (var3.field2149 == 0) {
                if (var3.field2150 >= 0) {
                    var3.field2152 = !this.field5389[var3.field2150];
                }
                this.field5389[var3.field2150] = true;
            } else if (var3.field2149 == 1) {
                this.field5389[var3.field2150] = false;
            } else if (var3.field2149 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    this.field5389[var4] = false;
                }
            }
        }
        this.field5375 = this.field5379;
        this.field5378 = null;
        this.field5379 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZIII)V", line = 313)
    public static final void method2413(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field5390++;
        if (class328.field4549 == null) {
            class64.field949.method2182(arg5, arg1, arg4, -16777216, 103, arg0);
            return;
        }
        class70.field1025++;
        if (class412.field5841 != null && (class412.field5841.field6262 - (class412.field5841.method942(false) - 1) * 64 >> 7) == class50.field697 && class412.field5841.field6266 - (class412.field5841.method942(false) * 64 - 64) >> 7 == class251.field3547) {
            class251.field3547 = -1;
            class50.field697 = -1;
            class280.method1827(true);
        }
        class237.method1603(arg3 + 117);
        if (!arg2) {
            class46.method404((byte) -128);
        }
        class71.method537(-2);
        class243.method1648(arg5, arg1, arg0, arg4, true, -104);
        int var6 = class371.field5226;
        int var7 = class392.field5618;
        int var8 = class22.field402;
        int var9 = class447.field6277;
        if (class128.field1807 == 1) {
            int var12 = (int) class24.field416;
            if ((class214.field2981 >> 8) > var12) {
                var12 = class214.field2981 >> 8;
            }
            if (class161.field2247[4] && var12 < class434.field6126[4] + 128) {
                var12 = class434.field6126[4] + 128;
            }
            int var13 = (int) class333.field4599 + class310.field4252 & 0x3FFF;
            class420.method2631(class67.field999, class285.method1858(class412.field5841.field6262, class142.field2034, class412.field5841.field6266, arg3 ^ 0x5C) - 50, -121, var12, ((var12 >> 3) * 3) + 600, var13, class447.field6265, var6);
        } else if (class128.field1807 == 4) {
            int var10 = (int) class24.field416;
            if (var10 < class214.field2981 >> 8) {
                var10 = class214.field2981 >> 8;
            }
            if (class161.field2247[4] && var10 < class434.field6126[4] + 128) {
                var10 = class434.field6126[4] + 128;
            }
            int var11 = (int) class333.field4599 & 0x3FFF;
            class420.method2631(class67.field999, class285.method1858(class51.field702, class142.field2034, class76.field1100, -85) - 50, -123, var10, (var10 >> 3) * 3 + 600, var11, class447.field6265, var6);
        } else if (class128.field1807 == 5) {
            class242.method1641((byte) -109, var6);
        }
        int var14 = class106.field1447;
        int var15 = class7.field107;
        int var16 = class20.field376;
        int var17 = class329.field4568;
        int var18 = class369.field5199;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class161.field2247[var19]) {
                int var22 = (int) ((double) (-class318.field4341[var19]) + (double) (class318.field4341[var19] * 2 + 1) * Math.random() + Math.sin((double) class53.field735[var19] / 100.0D * (double) class66.field987[var19]) * (double) class434.field6126[var19]);
                if (var19 == 0) {
                    class106.field1447 += var22;
                }
                if (var19 == 1) {
                    class7.field107 += var22;
                }
                if (var19 == 4) {
                    class329.field4568 += var22;
                    if (class329.field4568 < 1024) {
                        class329.field4568 = 1024;
                    } else if (class329.field4568 > 3072) {
                        class329.field4568 = 3072;
                    }
                }
                if (var19 == 2) {
                    class20.field376 += var22;
                }
                if (var19 == 3) {
                    class369.field5199 = class369.field5199 + var22 & 0x3FFF;
                }
            }
        }
        if (class106.field1447 < 0) {
            class106.field1447 = 0;
        }
        if (((class200.field2772 << 7) - 1) < class106.field1447) {
            class106.field1447 = (class200.field2772 << 7) - 1;
        }
        if (class20.field376 < 0) {
            class20.field376 = 0;
        }
        if (((class264.field3687 << 7) - 1) < class20.field376) {
            class20.field376 = (class264.field3687 << 7) - 1;
        }
        class222.method1471((byte) -112);
        class268.method1769(2651);
        class64.field949.method136(var7, var8, var7 + var9, var6 + var8);
        class64.field949.method135();
        if (arg3 != -113) {
            return;
        }
        int var20 = class279.field3917;
        if (class338.field4650 == null) {
            class64.field949.method114(var20);
        } else {
            class338.field4650.method2441(arg3 ^ 0xC, var6, var9, var20, class329.field4568, class403.field5719 << 3, var7, class369.field5199, class64.field949, var8);
        }
        class285.method1860(arg3 ^ 0xFFFFFF83);
        class335.field4613.method694(class106.field1447, class7.field107, class20.field376, -class329.field4568 & 0x3FFF, -class369.field5199 & 0x3FFF, -class155.field2192 & 0x3FFF);
        class64.field949.method126(class335.field4613);
        class64.field949.method63(var9 / 2 + var7, var6 / 2 + var8, class362.field5014 << 1, class362.field5014 << 1);
        class223.method1480(var7 + (var9 / 2), class362.field5014 << 1, var6 / 2 + var8, class362.field5014 << 1, (byte) 126);
        class378.method2417(-class369.field5199 & 0x3FFF, class106.field1447, 0, -class155.field2192 & 0x3FFF, class20.field376, -class329.field4568 & 0x3FFF, class7.field107);
        byte var21 = class100.method716(-30150) == 2 ? (byte) class70.field1025 : 1;
        class155.method1042(class64.field949, class276.field3837, class13.field264, class335.field4613, class106.field1447, class7.field107, class20.field376, class222.field3108, class116.field1672, class304.field4203, class69.field1021, class159.field2235, class164.field2269, class142.field2034 + 1, var21, class412.field5841.field6262 >> 7, class412.field5841.field6266 >> 7, !class70.field1032);
        class285.method1860(12);
        if (class446.field6250 == 30) {
            class303.method1955(-74672569, var6, var7, 256, 256, var9, var8);
            class348.method2204(var8, var9, 256, 256, var7, arg3 - 16117, var6);
            class22.method288(var8, 256, var9, 256, var6, (byte) 120, var7);
            class196.method1270(var6, var7, (byte) 109, var8, var9);
        }
        class431.method2716();
        class369.field5199 = var18;
        class329.field4568 = var17;
        class7.field107 = var15;
        class20.field376 = var16;
        class106.field1447 = var14;
        if (class367.field5187 && class306.field4231.method1278((byte) 109) == 0) {
            class367.field5187 = false;
        }
        if (class367.field5187) {
            class64.field949.method2182(var7, var8, var9, -16777216, -90, var6);
            class427.method2692(class159.field2234, arg3 + 223, false, class80.field1149.method2763(arg3 ^ 0xFFFFFFB5, class210.field2935));
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V", line = 502)
    private final void method2414(boolean arg0) {
        field5376++;
        if (this.field5377 == null) {
            return;
        }
        this.field5377.removeKeyListener(this);
        this.field5377.removeFocusListener(this);
        this.field5377 = null;
        if (!arg0) {
            field5396 = -16;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field5389[var2] = false;
        }
        this.field5375 = null;
        this.field5378 = null;
        this.field5379 = null;
    }

    @OriginalMember(owner = "client!sn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 532)
    public final void focusGained(FocusEvent arg0) {
        field5387++;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 556)
    public class377(Component arg0) {
        class156.method1049(68);
        this.method2411((byte) 67, arg0);
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V", line = 547)
    public static void method2415(byte arg0) {
        field5395 = null;
        if (arg0 != -90) {
            method2413(90, 126, true, -21, 27, -78);
        }
    }

    @OriginalMember(owner = "client!sn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 566)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2410(1, arg0, 12059);
        field5383++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)Lfn;", line = 583)
    public final class73 method1871(byte arg0) {
        field5381++;
        if (arg0 >= -88) {
            return null;
        }
        class151 var2;
        for (var2 = this.field5375; var2 != null && var2.field2149 == -1; var2 = var2.field2155) {
        }
        if (var2 == null) {
            this.field5375 = null;
        } else {
            this.field5375 = var2.field2155;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Z", line = 604)
    public final boolean method1872(int arg0, int arg1) {
        field5384++;
        if (arg0 >= 0 && arg0 < 112) {
            if (arg1 != 4463) {
                field5388 = false;
            }
            return this.field5389[arg0];
        } else {
            return false;
        }
    }
}
