import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class57 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field924 = 0;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lck;")
    public static class119 field927 = class298.method1987((byte) 51, "10");

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lmd;")
    public static class88 field928;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "[[[I")
    public static int[][][] field926;

    @OriginalMember(owner = "client!tf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 19)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field925++;
        if (class242.field3888 == null) {
            return;
        }
        class120.field1887 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class55.field882.length) {
            var3 = class55.field882[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class119.field1833 >= 0 && var3 >= 0) {
            class297.field4989[class119.field1833] = var3;
            class119.field1833 = class119.field1833 + 1 & 0x7F;
            if (class187.field2936 == class119.field1833) {
                class119.field1833 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class44.field664 + 1 & 0x7F;
            if (class111.field1703 != var4) {
                class108.field1644[class44.field664] = var3;
                class179.field2858[class44.field664] = -1;
                class44.field664 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I", line = 80)
    public static final int method426(int arg0) {
        field933++;
        if (arg0 <= 60) {
            method429(14);
        }
        return ((class184.field2916 == 0 ? 0 : 1) << 22) + ((class14.field226 ? 1 : 0) << 16) + ((class10.field184 ? 1 : 0) << 15) + ((class281.field4640 ? 1 : 0) << 7) + ((class29.field417 ? 1 : 0) << 4) + ((class65.field1020 ? 1 : 0) << 3) + (class99.field1503 & 0x7) + ((class198.field3168 ? 1 : 0) << 5) + ((class78.field1199 ? 1 : 0) << 6) + ((class129.field1979 ? 1 : 0) << 8) + ((class185.field2934 ? 1 : 0) << 9) + ((class224.field3598 ? 1 : 0) << 10) + ((class153.field2434 & 0x3) << 11) + (((class6.field146 ? 1 : 0) << 13) - -(class10.field183 & 0x3 << 17) + ((class244.field3943 ? 1 : 0) << 19) - (-((class4.field120 == 0 ? 0 : 1) << 20) + -((class78.field1205 == 0 ? 0 : 1) << 21)));
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 93)
    public static final void method427() {
        for (int var0 = 0; var0 < class35.field481; var0++) {
            for (int var1 = 0; var1 < class208.field3328; var1++) {
                for (int var2 = 0; var2 < class103.field1569; var2++) {
                    class150.field2390[var0][var1][var2] = null;
                }
            }
        }
        for (int var3 = 0; var3 < class206.field3278; var3++) {
            for (int var4 = 0; var4 < class206.field3273[var3]; var4++) {
                class206.field3287[var3][var4] = null;
            }
            class206.field3273[var3] = 0;
        }
        for (int var5 = 0; var5 < class216.field3454; var5++) {
            class87.field1326[var5] = null;
        }
        class216.field3454 = 0;
        for (int var6 = 0; var6 < class99.field1513.length; var6++) {
            class99.field1513[var6] = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 165)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class242.field3888 != null) {
            class119.field1833 = -1;
        }
        field932++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[BII[Lnc;Z)V", line = 195)
    public static final void method428(int arg0, byte[] arg1, int arg2, int arg3, class266[] arg4, boolean arg5) {
        field930++;
        if (arg0 != 8120) {
            field926 = (int[][][]) ((int[][][]) null);
        }
        class3 var6 = new class3(arg1);
        int var7 = -1;
        while (true) {
            int var8 = var6.method17(true);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method75(-32768);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 & 0x3F;
                int var14 = var6.method64((byte) 121);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var12 + arg2;
                int var18 = arg3 + var13;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class266 var19 = null;
                    if (!arg5) {
                        int var20 = var11;
                        if ((class111.field1707[1][var17][var18] & 0x2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class3.method65(23421, var15, var17, var7, var16, var18, !arg5, var11, arg5, var11, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 269)
    public static void method429(int arg0) {
        field927 = null;
        field928 = null;
        field926 = (int[][][]) null;
        if (arg0 != 16128) {
            method427();
        }
    }

    @OriginalMember(owner = "client!tf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 284)
    public final void keyTyped(KeyEvent arg0) {
        if (class242.field3888 != null) {
            int var2 = class201.method1281(5, arg0);
            if (var2 >= 0) {
                int var3 = class44.field664 + 1 & 0x7F;
                if (class111.field1703 != var3) {
                    class108.field1644[class44.field664] = -1;
                    class179.field2858[class44.field664] = var2;
                    class44.field664 = var3;
                }
            }
        }
        field923++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!tf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 325)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field929++;
        if (class242.field3888 != null) {
            class120.field1887 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class55.field882.length) {
                var3 = class55.field882[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class119.field1833 >= 0 && var3 >= 0) {
                class297.field4989[class119.field1833] = ~var3;
                class119.field1833 = class119.field1833 + 1 & 0x7F;
                if (class187.field2936 == class119.field1833) {
                    class119.field1833 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 358)
    public final void focusGained(FocusEvent arg0) {
        field931++;
    }
}
