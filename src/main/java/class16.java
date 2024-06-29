import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!n", name = "o", descriptor = "S")
    public static short field384 = 1;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Loh;")
    public static class263 field385 = class253.method1681(-125, ")4a=");

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Loh;")
    private static class263 field382 = class253.method1681(-118, "Close");

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Loh;")
    public static class263 field371 = field382;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field381 = new CRC32();

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!n", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field370++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!n", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field386++;
        if (class13.field346 != null) {
            class276.field4837 = 0;
            class169.field3111 = -1;
            class233.field4070 = -1;
        }
    }

    @OriginalMember(owner = "client!n", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field379++;
        if (class13.field346 != null) {
            class138.field2557 = 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILpg;BII)V")
    public static final void method116(int arg0, int arg1, int arg2, class73 arg3, byte arg4, int arg5, int arg6) {
        field378++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg2 == 0) {
            var7 = class148.method970(arg5, arg6, arg0);
        } else if (arg2 == 1) {
            var7 = class86.method590(arg5, arg6, arg0);
        } else if (arg2 == 2) {
            var7 = class228.method1549(arg5, arg6, arg0);
        } else if (arg2 == 3) {
            var7 = class13.method103(arg5, arg6, arg0);
        }
        boolean var10 = false;
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class12 var12 = class117.method763(var11, (byte) -127);
        int var13 = ((int) var7 & 0x3A935E) >> 20;
        if (var12.method101((byte) 104)) {
            class268.method1814(arg0, arg6, var12, true, arg5);
        }
        boolean var14 = false;
        int var15 = (int) var7 >> 14 & 0x1F;
        if (var7 != 0L) {
            if (arg2 == 0) {
                class114.method739(arg5, arg6, arg0);
                if (var12.field331 != 0) {
                    arg3.method491(var12.field283, var15, var13, arg0, -1, arg6);
                }
            } else if (arg2 == 1) {
                class162.method1063(arg5, arg6, arg0);
            } else if (arg2 == 2) {
                class150.method987(arg5, arg6, arg0);
                if (var12.field331 != 0 && var12.field329 + arg6 < 104 && var12.field329 + arg0 < 104 && (arg6 + var12.field308) < 104 && var12.field308 + arg0 < 104) {
                    arg3.method476(arg0, var12.field308, arg6, var13, var12.field329, var12.field283, -99);
                }
            } else if (arg2 == 3) {
                class87.method610(arg5, arg6, arg0);
                if (var12.field331 == 1) {
                    arg3.method474(arg6, -262145, arg0);
                }
            }
        }
        if (arg4 != -71) {
            field384 = 1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lpc;I)V")
    public static final void method117(class21 arg0, int arg1) {
        field383++;
        int var2 = arg0.field516;
        if (var2 == 324) {
            if (class258.field4481 == -1) {
                class258.field4481 = arg0.field605;
                class6.field114 = arg0.field514;
            }
            if (class130.field2391.field439) {
                arg0.field605 = class258.field4481;
            } else {
                arg0.field605 = class6.field114;
            }
        } else if (arg1 == 0) {
            if (var2 == 325) {
                if (class258.field4481 == -1) {
                    class6.field114 = arg0.field514;
                    class258.field4481 = arg0.field605;
                }
                if (class130.field2391.field439) {
                    arg0.field605 = class6.field114;
                } else {
                    arg0.field605 = class258.field4481;
                }
            } else if (var2 == 327) {
                arg0.field495 = 150;
                arg0.field588 = (int) (Math.sin((double) class228.field4012 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field594 = -1;
                arg0.field481 = 5;
            } else if (var2 == 328) {
                if (class229.field4018.field2508 == null) {
                    arg0.field594 = 0;
                } else {
                    arg0.field495 = 150;
                    arg0.field588 = (int) (Math.sin((double) class228.field4012 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field481 = 5;
                    arg0.field594 = ((int) class229.field4018.field2508.method1755(arg1 ^ 0x1) << 11) + 2047;
                    arg0.field614 = class229.field4018.field4686;
                    arg0.field623 = class229.field4018.field4652;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field380++;
        if (class13.field346 != null) {
            class276.field4837 = 0;
            class138.field2557 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!n", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field377++;
        if (class13.field346 != null) {
            class276.field4837 = 0;
            class108.field2047 = arg0.getX();
            class173.field3150 = arg0.getY();
            class230.field4037 = class25.method182(true);
            if (arg0.isMetaDown()) {
                class36.field849 = 2;
                class138.field2557 = 2;
            } else {
                class36.field849 = 1;
                class138.field2557 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!n", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class13.field346 != null) {
            class276.field4837 = 0;
            class169.field3111 = arg0.getX();
            class233.field4070 = arg0.getY();
        }
        field375++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZZIZ)Lue;")
    public static final class86 method118(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        field376++;
        class51 var5 = null;
        if (class157.field2821 != null) {
            var5 = new class51(arg3, class157.field2821, class187.field3366[arg3], 1000000);
        }
        class216.field3832[arg3] = class251.field4368.method996(class268.field4729, var5, arg3, (byte) -60);
        if (arg0 != -24530) {
            field385 = null;
        }
        if (arg4) {
            class216.field3832[arg3].method1507(arg0 ^ 0xFFFFD902);
        }
        return new class86(class216.field3832[arg3], arg2, arg1);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method119(int arg0, int arg1) {
        field374++;
        class182.field3299 = -1;
        if (arg1 == 37) {
            class106.field2016 = 3.0F;
        } else if (arg1 == 50) {
            class106.field2016 = 4.0F;
        } else if (arg1 == 75) {
            class106.field2016 = 6.0F;
        } else {
            class106.field2016 = 8.0F;
        }
        if (arg0 != 705) {
            field371 = null;
        }
        class182.field3299 = -1;
    }

    @OriginalMember(owner = "client!n", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field373++;
        if (class13.field346 != null) {
            class276.field4837 = 0;
            class169.field3111 = arg0.getX();
            class233.field4070 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!n", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field372++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method120(byte arg0) {
        field381 = null;
        field371 = null;
        field382 = null;
        int var1 = -1 / ((arg0 - 34) / 59);
        field385 = null;
    }

    @OriginalMember(owner = "client!n", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class13.field346 != null) {
            class276.field4837 = 0;
            class169.field3111 = arg0.getX();
            class233.field4070 = arg0.getY();
        }
        field387++;
    }
}
