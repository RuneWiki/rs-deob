import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class160 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2752 = 0;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Lij;")
    private static class50 field2754 = class78.method578(127, "Close");

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lij;")
    public static class50 field2757 = field2754;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public static int field2758 = 0;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "Le;")
    public static class86 field2751 = new class86();

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!oj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2753++;
        if (class89.field1696 != null) {
            class91.field1723 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class192.field3196.length) {
                var3 = class192.field3196[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class61.field1125 >= 0 && var3 >= 0) {
                class103.field1888[class61.field1125] = ~var3;
                class61.field1125 = class61.field1125 + 1 & 0x7F;
                if (class61.field1125 == class222.field3740) {
                    class61.field1125 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2747++;
        if (class89.field1696 != null) {
            class61.field1125 = -1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2756++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIBLff;I)V")
    public static final void method1125(int arg0, int arg1, int arg2, int arg3, byte arg4, class237 arg5, int arg6) {
        if (arg4 != -106) {
            method1129(74, -90, 34, 84, (byte) -105, -23, -80);
        }
        field2759++;
        class74.method553(arg2, arg5.field4027, arg6, arg1, arg0, (byte) -108, arg5.field3990, arg3);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1126(byte arg0) {
        field2757 = null;
        field2754 = null;
        field2751 = null;
        if (arg0 != 24) {
            field2758 = -13;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public static final void method1127(int arg0, int arg1, int arg2) {
        field2745++;
        if (class10.method67(arg1, (byte) -54)) {
            class27.method248(arg2, class137.field2380[arg1], (byte) -17);
            if (arg0 != -17126) {
                method1128((byte) -15);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static final void method1128(byte arg0) {
        if (class247.field4305 == null || class241.field4151 == null) {
            class247.field4305 = new int[256];
            class241.field4151 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class247.field4305[var1] = (int) (Math.sin(var2) * 4096.0D);
                class241.field4151[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != -98) {
            field2757 = null;
        }
        field2746++;
    }

    @OriginalMember(owner = "client!oj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class89.field1696 != null) {
            int var2 = class162.method1136(arg0, true);
            if (var2 >= 0) {
                int var3 = class237.field3983 + 1 & 0x7F;
                if (class229.field3850 != var3) {
                    class45.field833[class237.field3983] = -1;
                    class225.field3779[class237.field3983] = var2;
                    class237.field3983 = var3;
                }
            }
        }
        arg0.consume();
        field2749++;
    }

    @OriginalMember(owner = "client!oj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class89.field1696 != null) {
            class91.field1723 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class192.field3196.length > var2) {
                var3 = class192.field3196[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class61.field1125 >= 0 && var3 >= 0) {
                class103.field1888[class61.field1125] = var3;
                class61.field1125 = class61.field1125 + 1 & 0x7F;
                if (class61.field1125 == class222.field3740) {
                    class61.field1125 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class237.field3983 + 1 & 0x7F;
                if (class229.field3850 != var4) {
                    class45.field833[class237.field3983] = var3;
                    class225.field3779[class237.field3983] = -1;
                    class237.field3983 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2750++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1129(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class27.method249((byte) -40, arg6);
        int var7 = arg6 - arg0;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg6;
        int var10 = arg6;
        int var11 = var7;
        field2748++;
        int var12 = -var7;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class177.field2963[arg2];
        int var16 = arg1 - var7;
        class155.method1090(var15, arg1 - arg6, arg3, arg4 ^ 0xFFFFFF5D, var16);
        int var17 = arg1 + var7;
        class155.method1090(var15, var16, arg5, arg4 ^ 0xFFFFFF5D, var17);
        class155.method1090(var15, var17, arg3, 160, arg1 + arg6);
        while (var8 < var10) {
            var13 += 2;
            var9 += var13;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class100.field1833[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var10--;
                var9 -= var10 << 1;
                if (var10 < var7) {
                    int[] var18 = class177.field2963[arg2 - var10];
                    int[] var19 = class177.field2963[arg2 + var10];
                    int var20 = class100.field1833[var10];
                    int var21 = arg1 + var8;
                    int var22 = arg1 - var8;
                    int var23 = arg1 + var20;
                    int var24 = arg1 - var20;
                    class155.method1090(var19, var22, arg3, 160, var24);
                    class155.method1090(var19, var24, arg5, 160, var23);
                    class155.method1090(var19, var23, arg3, 160, var21);
                    class155.method1090(var18, var22, arg3, 160, var24);
                    class155.method1090(var18, var24, arg5, 160, var23);
                    class155.method1090(var18, var23, arg3, arg4 ^ 0xFFFFFF5D, var21);
                } else {
                    int[] var25 = class177.field2963[arg2 - var10];
                    int[] var26 = class177.field2963[arg2 + var10];
                    int var27 = arg1 + var8;
                    int var28 = arg1 - var8;
                    class155.method1090(var26, var28, arg3, 160, var27);
                    class155.method1090(var25, var28, arg3, 160, var27);
                }
            }
            int[] var29 = class177.field2963[arg2 + var8];
            int[] var30 = class177.field2963[arg2 - var8];
            int var31 = arg1 + var10;
            int var32 = arg1 - var10;
            if (var8 >= var7) {
                class155.method1090(var29, var32, arg3, 160, var31);
                class155.method1090(var30, var32, arg3, 160, var31);
            } else {
                int var33 = var8 > var11 ? class100.field1833[var8] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class155.method1090(var29, var32, arg3, 160, var35);
                class155.method1090(var29, var35, arg5, 160, var34);
                class155.method1090(var29, var34, arg3, arg4 ^ 0xFFFFFF5D, var31);
                class155.method1090(var30, var32, arg3, 160, var35);
                class155.method1090(var30, var35, arg5, arg4 + 163, var34);
                class155.method1090(var30, var34, arg3, 160, var31);
            }
        }
        if (arg4 != -3) {
            field2743 = -13;
        }
    }
}
