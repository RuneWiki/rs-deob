import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class126 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lmc;")
    private static class75 field3076 = class30.method234(true, "Login attempts exceeded)3");

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    public static int[] field3073 = new int[500];

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[J")
    public static long[] field3087 = new long[100];

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "[I")
    public static int[] field3088 = new int[128];

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lmc;")
    public static class75 field3080 = class30.method234(true, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lmc;")
    public static class75 field3090 = field3076;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lja;")
    public static class55 field3078;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 3)
    public static void method997(int arg0) {
        field3076 = null;
        field3087 = null;
        field3080 = null;
        field3073 = null;
        field3090 = null;
        int var1 = -11 / ((arg0 + 54) / 38);
        field3088 = null;
        field3078 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 19)
    public static final void method998(int arg0) {
        field3079++;
        if (class92.field2270 && class99.field2510 != class28.field591) {
            class87.method725(class3.field51, class99.field2510, -8628, class52.field1315.field1270[0], class52.field1315.field1236[0], class108.field2739);
            return;
        }
        if (class99.field2510 != class88.field2160) {
            class88.field2160 = class99.field2510;
            class38.method300((byte) 110, class99.field2510);
        }
        if (arg0 != 12) {
            method998(-112);
        }
    }

    @OriginalMember(owner = "client!vd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 42)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3083++;
    }

    @OriginalMember(owner = "client!vd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 67)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3086++;
        if (class90.field2208 != null) {
            class7.field99 = 0;
            class94.field2375 = arg0.getX();
            class36.field863 = arg0.getY();
            class36.field874 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class59.field1510 = 2;
                class70.field1775 = 2;
            } else {
                class59.field1510 = 1;
                class70.field1775 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI[IBI)V", line = 98)
    public static final void method999(boolean arg0, int arg1, int[] arg2, byte arg3, int arg4) {
        class130.field3164.method767(false);
        field3074++;
        class111.field2821.method687(0, 0);
        if (arg0) {
            if (arg2[arg4] != -1) {
                if (arg4 == 0) {
                    class23.field449.method687(22, 10);
                }
                if (arg4 == 1) {
                    class94.field2371.method687(54, 8);
                }
                if (arg4 == 2) {
                    class94.field2371.method687(82, 8);
                }
                if (arg4 == 3) {
                    class27.field554.method687(110, 8);
                }
                if (arg4 == 4) {
                    class10.field220.method687(153, 8);
                }
                if (arg4 == 5) {
                    class10.field220.method687(181, 8);
                }
                if (arg4 == 6) {
                    class110.field2784.method687(209, 9);
                }
            }
            if (arg2[0] != -1 && arg1 != 0) {
                class92.field2282[0].method687(29, 13);
            }
            if (arg2[1] != -1 && arg1 != 1) {
                class92.field2282[1].method687(53, 11);
            }
            if (arg2[2] != -1 && arg1 != 2) {
                class92.field2282[2].method687(82, 11);
            }
            if (arg2[3] != -1 && arg1 != 3) {
                class92.field2282[3].method687(115, 12);
            }
            if (arg2[4] != -1 && arg1 != 4) {
                class92.field2282[4].method687(153, 13);
            }
            if (arg2[5] != -1 && arg1 != 5) {
                class92.field2282[5].method687(180, 11);
            }
            if (arg2[6] != -1 && arg1 != 6) {
                class92.field2282[6].method687(208, 13);
            }
        }
        class104.field2636.method767(false);
        class99.field2496.method687(0, 0);
        if (arg0) {
            if (arg2[arg4] != -1) {
                if (arg4 == 7) {
                    class96.field2401.method687(42, 0);
                }
                if (arg4 == 8) {
                    class57.field1444.method687(74, 0);
                }
                if (arg4 == 9) {
                    class57.field1444.method687(102, 0);
                }
                if (arg4 == 10) {
                    class82.field2031.method687(130, 1);
                }
                if (arg4 == 11) {
                    class62.field1649.method687(173, 0);
                }
                if (arg4 == 12) {
                    class62.field1649.method687(201, 0);
                }
                if (arg4 == 13) {
                    class36.field854.method687(229, 0);
                }
            }
            if (arg2[8] != -1 && arg1 != 8) {
                class92.field2282[7].method687(74, 2);
            }
            if (arg2[9] != -1 && arg1 != 9) {
                class92.field2282[8].method687(102, 3);
            }
            if (arg2[10] != -1 && arg1 != 10) {
                class92.field2282[9].method687(137, 4);
            }
            if (arg2[11] != -1 && arg1 != 11) {
                class92.field2282[10].method687(174, 2);
            }
            if (arg2[12] != -1 && arg1 != 12) {
                class92.field2282[11].method687(201, 2);
            }
            if (arg2[13] != -1 && arg1 != 13) {
                class92.field2282[12].method687(226, 2);
            }
        }
        if (arg3 != -106) {
            method999(false, -110, null, (byte) 14, -2);
        }
        try {
            Graphics var5 = class108.field2738.getGraphics();
            class130.field3164.method403(516, (byte) -60, var5, 160);
            class104.field2636.method403(496, (byte) 110, var5, 466);
        } catch (Exception var6) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!vd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 241)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class90.field2208 != null) {
            class7.field99 = 0;
            class118.field2926 = -1;
            class28.field592 = -1;
        }
        field3085++;
    }

    @OriginalMember(owner = "client!vd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 265)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3089++;
        if (class90.field2208 != null) {
            class7.field99 = 0;
            class118.field2926 = arg0.getX();
            class28.field592 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIZI)I", line = 300)
    public static final int method1000(int arg0, int arg1, boolean arg2, int arg3) {
        field3081++;
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        if (arg2) {
            field3088 = null;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class74.field1836[1][var5][var4] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = (128 - var7) * class15.field280[var6][var5][var4] + class15.field280[var6][var5 + 1][var4] * var7 >> 7;
        int var9 = arg0 & 0x7F;
        int var10 = (128 - var7) * class15.field280[var6][var5][var4 + 1] + class15.field280[var6][var5 + 1][var4 + 1] * var7 >> 7;
        return (128 - var9) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!vd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 346)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class90.field2208 != null) {
            class7.field99 = 0;
            class118.field2926 = arg0.getX();
            class28.field592 = arg0.getY();
        }
        field3077++;
    }

    @OriginalMember(owner = "client!vd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 360)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class90.field2208 != null) {
            class7.field99 = 0;
            class70.field1775 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3091++;
    }

    @OriginalMember(owner = "client!vd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 381)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class90.field2208 != null) {
            class7.field99 = 0;
            class118.field2926 = arg0.getX();
            class28.field592 = arg0.getY();
        }
        field3082++;
    }
}
