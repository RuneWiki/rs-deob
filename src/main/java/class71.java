import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lrd;")
    public static class117 field1975 = class95.method812("Keine Antwort vom Server)3", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Lrd;")
    public static class117 field1989 = class95.method812("scrollbar", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lrd;")
    public static class117 field1979 = class95.method812("oder benutzen Sie eine andere Welt)3", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lrd;")
    private static class117 field1981 = class95.method812("Enter message to send to ", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    public static boolean field1984 = false;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[[I")
    public static int[][] field1974 = new int[104][104];

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "Lrd;")
    private static class117 field1996 = class95.method812("white:", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lrd;")
    public static class117 field1982 = field1996;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Lrd;")
    public static class117 field1997 = class95.method812("Bitte benutzen Sie eine andere Welt)3", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lrd;")
    public static class117 field1973 = class95.method812(" )2> @cya@", (byte) 8);

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lrd;")
    public static class117 field1992 = field1981;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lrd;")
    public static class117 field1987 = field1996;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lra;")
    public static class114 field1991;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ll;")
    public static class76 field1983;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Laf;")
    public static class7 field1980;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "[Lra;")
    public static class114[] field1986;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "[Lwa;")
    public static class144[] field1998;

    @OriginalMember(owner = "client!kb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class35.field1041 != null) {
            class46.field1307 = 0;
            class35.field1048 = -1;
            class133.field3195 = -1;
        }
        field1994++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lrd;")
    public static final class117 method683(int arg0, int arg1) {
        class117 var2 = new class117();
        if (arg1 != 26702) {
            method685(-122);
        }
        var2.field2858 = 0;
        var2.field2851 = new byte[arg0];
        field1977++;
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[IIZI)V")
    public static final void method684(byte arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 <= 35) {
            return;
        }
        class102.field2582.method488(-7913);
        field1999++;
        field1991.method929(0, 0);
        if (arg3) {
            if (arg1[arg4] != -1) {
                if (arg4 == 0) {
                    class44.field1241.method929(22, 10);
                }
                if (arg4 == 1) {
                    class136.field3247.method929(54, 8);
                }
                if (arg4 == 2) {
                    class136.field3247.method929(82, 8);
                }
                if (arg4 == 3) {
                    class39.field1130.method929(110, 8);
                }
                if (arg4 == 4) {
                    class120.field2941.method929(153, 8);
                }
                if (arg4 == 5) {
                    class120.field2941.method929(181, 8);
                }
                if (arg4 == 6) {
                    class93.field2342.method929(209, 9);
                }
            }
            if (arg1[0] != -1 && arg2 != 0) {
                field1986[0].method929(29, 13);
            }
            if (arg1[1] != -1 && arg2 != 1) {
                field1986[1].method929(53, 11);
            }
            if (arg1[2] != -1 && arg2 != 2) {
                field1986[2].method929(82, 11);
            }
            if (arg1[3] != -1 && arg2 != 3) {
                field1986[3].method929(115, 12);
            }
            if (arg1[4] != -1 && arg2 != 4) {
                field1986[4].method929(153, 13);
            }
            if (arg1[5] != -1 && arg2 != 5) {
                field1986[5].method929(180, 11);
            }
            if (arg1[6] != -1 && arg2 != 6) {
                field1986[6].method929(208, 13);
            }
        }
        class13.field256.method488(-7913);
        class109.field2726.method929(0, 0);
        if (arg3) {
            if (arg1[arg4] != -1) {
                if (arg4 == 7) {
                    class80.field2143.method929(42, 0);
                }
                if (arg4 == 8) {
                    class18.field444.method929(74, 0);
                }
                if (arg4 == 9) {
                    class18.field444.method929(102, 0);
                }
                if (arg4 == 10) {
                    class133.field3178.method929(130, 1);
                }
                if (arg4 == 11) {
                    class41.field1175.method929(173, 0);
                }
                if (arg4 == 12) {
                    class41.field1175.method929(201, 0);
                }
                if (arg4 == 13) {
                    class84.field2199.method929(229, 0);
                }
            }
            if (arg1[8] != -1 && arg2 != 8) {
                field1986[7].method929(74, 2);
            }
            if (arg1[9] != -1 && arg2 != 9) {
                field1986[8].method929(102, 3);
            }
            if (arg1[10] != -1 && arg2 != 10) {
                field1986[9].method929(137, 4);
            }
            if (arg1[11] != -1 && arg2 != 11) {
                field1986[10].method929(174, 2);
            }
            if (arg1[12] != -1 && arg2 != 12) {
                field1986[11].method929(201, 2);
            }
            if (arg1[13] != -1 && arg2 != 13) {
                field1986[12].method929(226, 2);
            }
        }
        try {
            Graphics var5 = class42.field1216.getGraphics();
            class102.field2582.method485(160, 516, -6898, var5);
            class13.field256.method485(466, 496, -6898, var5);
        } catch (Exception var6) {
            class42.field1216.repaint();
        }
    }

    @OriginalMember(owner = "client!kb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1969++;
        if (class35.field1041 != null) {
            class46.field1307 = 0;
            class32.field958 = arg0.getX();
            class52.field1478 = arg0.getY();
            class85.field2228 = class105.method875((byte) -80);
            if (arg0.isMetaDown()) {
                class35.field1047 = 2;
                class26.field788 = 2;
            } else {
                class35.field1047 = 1;
                class26.field788 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class35.field1041 != null) {
            class46.field1307 = 0;
            class35.field1048 = arg0.getX();
            class133.field3195 = arg0.getY();
        }
        field1978++;
    }

    @OriginalMember(owner = "client!kb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1985++;
        if (class35.field1041 != null) {
            class46.field1307 = 0;
            class35.field1048 = arg0.getX();
            class133.field3195 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1988++;
    }

    @OriginalMember(owner = "client!kb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1972++;
        if (class35.field1041 != null) {
            class46.field1307 = 0;
            class26.field788 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method685(int arg0) {
        field1973 = null;
        field1983 = null;
        if (arg0 != 2) {
            method684((byte) -12, null, 16, false, -5);
        }
        field1979 = null;
        field1991 = null;
        field1982 = null;
        field1997 = null;
        field1981 = null;
        field1992 = null;
        field1989 = null;
        field1998 = null;
        field1980 = null;
        field1974 = null;
        field1996 = null;
        field1987 = null;
        field1975 = null;
        field1986 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method686(byte arg0) {
        if (arg0 != -75) {
            method685(-54);
        }
        field1990++;
        class101.field2535.method488(-7913);
    }

    @OriginalMember(owner = "client!kb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1970++;
        if (class35.field1041 != null) {
            class46.field1307 = 0;
            class35.field1048 = arg0.getX();
            class133.field3195 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class35.field1041 != null) {
            class26.field788 = 0;
        }
        field1993++;
    }

    @OriginalMember(owner = "client!kb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1971++;
    }
}
