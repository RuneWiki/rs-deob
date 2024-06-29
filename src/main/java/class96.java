import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class96 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "[[Z")
    public static boolean[][] field1300 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Ldd;")
    public static class43 field1293 = null;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field1301 = 0;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "J")
    public static volatile long field1307 = 0L;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lvi;")
    public static class257 field1291;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "[[[I")
    public static int[][][] field1302;

    @OriginalMember(owner = "client!qh", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1298++;
        if (class186.field2565 != null) {
            class106.field1427 = 0;
            class68.field941 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qh", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 42)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class186.field2565 != null) {
            class106.field1427 = 0;
            class243.field3470 = -1;
            class342.field5119 = -1;
        }
        field1303++;
    }

    @OriginalMember(owner = "client!qh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 58)
    public final void focusGained(FocusEvent arg0) {
        field1299++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIB)V", line = 67)
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1292++;
        class197.method1394(82, arg0);
        int var7 = 0;
        int var8 = arg0;
        int var9 = -arg0;
        int var10 = arg0 - arg2;
        if (arg6 != 76) {
            field1300 = (boolean[][]) ((boolean[][]) null);
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = var10;
        int var12 = -var10;
        int[] var13 = class126.field1723[arg3];
        int var14 = -1;
        int var15 = -1;
        int var16 = arg5 + var10;
        int var17 = arg5 - var10;
        class190.method1329(var13, var17, arg4, (byte) -125, arg5 - arg0);
        class190.method1329(var13, var16, arg1, (byte) -112, var17);
        class190.method1329(var13, arg0 + arg5, arg4, (byte) -83, var16);
        while (var7 < var8) {
            var15 += 2;
            var12 += var15;
            var14 += 2;
            var9 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class301.field4441[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                if (var10 <= var8) {
                    int[] var18 = class126.field1723[arg3 + var8];
                    int var19 = arg5 + var7;
                    int[] var20 = class126.field1723[arg3 - var8];
                    int var21 = arg5 - var7;
                    class190.method1329(var18, var19, arg4, (byte) -96, var21);
                    class190.method1329(var20, var19, arg4, (byte) -127, var21);
                } else {
                    int[] var22 = class126.field1723[arg3 - var8];
                    int[] var23 = class126.field1723[arg3 + var8];
                    int var24 = class301.field4441[var8];
                    int var25 = arg5 + var7;
                    int var26 = arg5 - var7;
                    int var27 = arg5 - var24;
                    class190.method1329(var23, var27, arg4, (byte) -122, var26);
                    int var28 = arg5 + var24;
                    class190.method1329(var23, var28, arg1, (byte) -78, var27);
                    class190.method1329(var23, var25, arg4, (byte) -76, var28);
                    class190.method1329(var22, var27, arg4, (byte) -100, var26);
                    class190.method1329(var22, var28, arg1, (byte) -127, var27);
                    class190.method1329(var22, var25, arg4, (byte) -117, var28);
                }
                var9 -= var8 << 1;
            }
            int[] var29 = class126.field1723[arg3 - var7];
            int var30 = arg5 - var8;
            int[] var31 = class126.field1723[arg3 + var7];
            int var32 = arg5 + var8;
            if (var7 >= var10) {
                class190.method1329(var31, var32, arg4, (byte) -85, var30);
                class190.method1329(var29, var32, arg4, (byte) -79, var30);
            } else {
                int var33 = var7 <= var11 ? var11 : class301.field4441[var7];
                int var34 = arg5 - var33;
                int var35 = arg5 + var33;
                class190.method1329(var31, var34, arg4, (byte) -99, var30);
                class190.method1329(var31, var35, arg1, (byte) -92, var34);
                class190.method1329(var31, var32, arg4, (byte) -120, var35);
                class190.method1329(var29, var34, arg4, (byte) -88, var30);
                class190.method1329(var29, var35, arg1, (byte) -94, var34);
                class190.method1329(var29, var32, arg4, (byte) -76, var35);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)V", line = 199)
    public static final void method704(byte arg0, int arg1, int arg2) {
        if (arg0 <= 15) {
            field1302 = (int[][][]) ((int[][][]) null);
        }
        class143 var3 = class163.method1176((byte) -25, arg1, 5);
        field1304++;
        var3.method1032((byte) 115);
        var3.field1965 = arg2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 212)
    public static void method705(int arg0) {
        if (arg0 == 0) {
            field1300 = (boolean[][]) null;
            field1291 = null;
            field1302 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 224)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class186.field2565 != null) {
            class106.field1427 = 0;
            class235.field3323 = arg0.getX();
            class66.field872 = arg0.getY();
            class251.field3598 = class29.method174(27763);
            if (arg0.isMetaDown()) {
                class207.field2974 = 2;
                class68.field941 = 2;
            } else {
                class207.field2974 = 1;
                class68.field941 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1290++;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 284)
    public static final void method706(int arg0) {
        field1296++;
        class153.field2113 = null;
        class123.field1661 = null;
        class154.field2133 = null;
        class151.field2103 = null;
        if (arg0 != 24680) {
            field1291 = (class257) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 302)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class186.field2565 != null) {
            class106.field1427 = 0;
            class243.field3470 = arg0.getX();
            class342.field5119 = arg0.getY();
        }
        field1295++;
    }

    @OriginalMember(owner = "client!qh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 318)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class186.field2565 != null) {
            class68.field941 = 0;
        }
        field1305++;
    }

    @OriginalMember(owner = "client!qh", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 341)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1289++;
        if (class186.field2565 != null) {
            class106.field1427 = 0;
            class243.field3470 = arg0.getX();
            class342.field5119 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!qh", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 359)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class186.field2565 != null) {
            class106.field1427 = 0;
            class243.field3470 = arg0.getX();
            class342.field5119 = arg0.getY();
        }
        field1306++;
    }

    @OriginalMember(owner = "client!qh", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 377)
    public final void mouseClicked(MouseEvent arg0) {
        field1294++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
