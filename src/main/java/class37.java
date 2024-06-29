import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class37 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[J")
    public static long[] field549 = new long[200];

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Z")
    public static boolean field555 = false;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Z")
    public static boolean field545 = false;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field556 = 50;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field542 = new String[field556];

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "[I")
    public static int[] field560 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[I")
    public static int[] field546 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Z")
    public static boolean field554 = false;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Ljava/lang/String;")
    public static String field562 = " ";

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[Lha;")
    public static class304[] field552 = new class304[6];

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "[I")
    public static int[] field565 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "[I")
    public static int[] field559 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[I")
    public static int[] field547 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
    public static int[] field550 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "[I")
    public static int[] field566 = new int[field556];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "F")
    public static float field541;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Llb;")
    public static class211 field563;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "[[S")
    public static short[][] field558;

    @OriginalMember(owner = "client!sg", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 10)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field548++;
        if (class126.field1994 == null) {
            return;
        }
        class124.field1959 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class305.field4780.length) {
            var3 = class305.field4780[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class255.field3805 >= 0 && var3 >= 0) {
            class183.field2734[class255.field3805] = var3;
            class255.field3805 = class255.field3805 + 1 & 0x7F;
            if (class65.field965 == class255.field3805) {
                class255.field3805 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class20.field223 + 1 & 0x7F;
            if (class41.field619 != var4) {
                class228.field3537[class20.field223] = var3;
                class182.field2721[class20.field223] = '\u0000';
                class20.field223 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)I", line = 66)
    public static final int method341(int arg0) {
        field557++;
        class3.field10 = arg0;
        return class83.method679((byte) 83);
    }

    @OriginalMember(owner = "client!sg", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 82)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field551++;
        if (class126.field1994 != null) {
            class124.field1959 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class305.field4780.length > var2) {
                var3 = class305.field4780[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class255.field3805 >= 0 && var3 >= 0) {
                class183.field2734[class255.field3805] = ~var3;
                class255.field3805 = class255.field3805 + 1 & 0x7F;
                if (class65.field965 == class255.field3805) {
                    class255.field3805 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Laj;IIZIII)Laj;", line = 124)
    public static final class1 method342(class1 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            method342((class1) null, -118, 85, false, 40, -18, -29);
        }
        field564++;
        long var7 = (long) arg2;
        class1 var9 = (class1) class22.field242.method1432((byte) 104, var7);
        if (var9 == null) {
            class42 var10 = class42.method404(class302.field4728, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method379(64, 768, -50, -10, -50);
            class22.field242.method1436(false, var9, var7);
        }
        int var11 = arg0.method25();
        int var12 = arg0.method22();
        int var13 = arg0.method12();
        int var14 = arg0.method17();
        class1 var15 = var9.method26(true, true, true);
        if (arg5 != 0) {
            var15.method23(arg5);
        }
        if (class36.field534) {
            class165 var16 = (class165) var15;
            if (class294.method2080(899, arg6 + var13, arg1 + var11, class50.field775) != arg4 || arg4 != class294.method2080(899, arg6 + var14, arg1 + var12, class50.field775)) {
                for (int var17 = 0; var17 < var16.field2438; var17++) {
                    var16.field2473[var17] += class294.method2080(899, var16.field2455[var17] + arg6, var16.field2446[var17] - -arg1, class50.field775) - arg4;
                }
                var16.field2443.field4749 = false;
                var16.field2466.field4989 = false;
            }
        } else {
            class85 var18 = (class85) var15;
            if (arg4 != class294.method2080(899, arg6 + var13, arg1 - -var11, class50.field775) || arg4 != class294.method2080(899, arg6 + var14, arg1 - -var12, class50.field775)) {
                for (int var19 = 0; var19 < var18.field1204; var19++) {
                    var18.field1176[var19] += class294.method2080(899, var18.field1196[var19] + arg6, var18.field1201[var19] - -arg1, class50.field775) - arg4;
                }
                var18.field1187 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 208)
    public static void method343(byte arg0) {
        field558 = (short[][]) null;
        field549 = null;
        field563 = null;
        field562 = null;
        field565 = null;
        int var1 = 109 % ((-arg0) / 63);
        field566 = null;
        field547 = null;
        field542 = null;
        field560 = null;
        field546 = null;
        field552 = null;
        field559 = null;
        field550 = null;
    }

    @OriginalMember(owner = "client!sg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 235)
    public final void focusGained(FocusEvent arg0) {
        field567++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 254)
    public static final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class39.field589 * 128) {
            arg0 = class39.field589 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class210.field3312 * 128) {
            arg2 = class210.field3312 * 128 - 1;
        }
        class235.field3598 = class56.field838[arg3];
        class10.field103 = class56.field830[arg3];
        class304.field4758 = class56.field838[arg4];
        class325.field5057 = class56.field830[arg4];
        class163.field2430 = arg0;
        class6.field57 = arg1;
        class35.field444 = arg2;
        class310.field4837 = arg0 / 128;
        class58.field865 = arg2 / 128;
        class117.field1841 = class310.field4837 - class293.field4601;
        if (class117.field1841 < 0) {
            class117.field1841 = 0;
        }
        class102.field1580 = class58.field865 - class293.field4601;
        if (class102.field1580 < 0) {
            class102.field1580 = 0;
        }
        class90.field1311 = class310.field4837 + class293.field4601;
        if (class90.field1311 > class39.field589) {
            class90.field1311 = class39.field589;
        }
        class29.field335 = class58.field865 + class293.field4601;
        if (class29.field335 > class210.field3312) {
            class29.field335 = class210.field3312;
        }
        short var15;
        if (class36.field534) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class293.field4601 + class293.field4601 + 2; var16++) {
            for (int var17 = 0; var17 < class293.field4601 + class293.field4601 + 2; var17++) {
                int var18 = (var16 - class293.field4601 << 7) - (class163.field2430 & 0x7F);
                int var19 = (var17 - class293.field4601 << 7) - (class35.field444 & 0x7F);
                int var20 = class310.field4837 + var16 - class293.field4601;
                int var21 = class58.field865 + var17 - class293.field4601;
                if (var20 >= 0 && var21 >= 0 && var20 < class39.field589 && var21 < class210.field3312) {
                    int var22;
                    if (class308.field4797 == null) {
                        var22 = class258.field3844[0][var20][var21] + 128 - class6.field57;
                    } else {
                        var22 = class308.field4797[0][var20][var21] + 128 - class6.field57;
                    }
                    int var23 = class258.field3844[3][var20][var21] - class6.field57 - 1000;
                    class142.field2191[var16][var17] = class292.method2060(var18, var23, var22, var19, var15);
                } else {
                    class142.field2191[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class293.field4601 + class293.field4601 + 1; var24++) {
            for (int var25 = 0; var25 < class293.field4601 + class293.field4601 + 1; var25++) {
                class312.field4849[var24][var25] = class142.field2191[var24][var25] || class142.field2191[var24 + 1][var25] || class142.field2191[var24][var25 + 1] || class142.field2191[var24 + 1][var25 + 1];
            }
        }
        class4.field22 = arg6;
        class238.field3623 = arg7;
        class105.field1612 = arg8;
        class289.field4540 = arg9;
        class87.field1279 = arg10;
        class325.method2232();
        if (class314.field4874 != null) {
            class95.method751(true);
            class135.method1034(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class36.field534) {
                class201.field3197 = false;
                class309.method2143(0, -100, 0);
                class264.method1819((float[]) null);
                class286.method2010();
            }
            class95.method751(false);
        }
        class135.method1034(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 390)
    public final synchronized void focusLost(FocusEvent arg0) {
        field544++;
        if (class126.field1994 != null) {
            class255.field3805 = -1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 428)
    public final void keyTyped(KeyEvent arg0) {
        if (class126.field1994 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class133.method1009(var2, (byte) 40)) {
                int var3 = class20.field223 + 1 & 0x7F;
                if (class41.field619 != var3) {
                    class228.field3537[class20.field223] = -1;
                    class182.field2721[class20.field223] = var2;
                    class20.field223 = var3;
                }
            }
        }
        arg0.consume();
        field543++;
    }
}
