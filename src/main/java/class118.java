import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class118 extends class72 {

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public int field2801 = 0;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "Lbd;")
    public static class12 field2794 = new class12(30);

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lae;")
    private static class6 field2808 = class64.method474(111, " is already on your friend list");

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    public static int field2807 = -1;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "Lae;")
    public static class6 field2805 = field2808;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2803 = new CRC32();

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "Lae;")
    public static class6 field2817 = class64.method474(121, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "Lae;")
    public static class6 field2820 = class64.method474(112, "blaugr-Un:");

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "Lae;")
    private static class6 field2814 = class64.method474(125, "From");

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "Lae;")
    public static class6 field2818 = field2814;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "J")
    public static long field2812;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lva;")
    public static class128 field2815;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lbf;")
    public static class14 field2802;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "[I")
    public static int[] field2800;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
    public static int[] field2809;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "[Lq;")
    public static class101[] field2813;

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "[Lq;")
    public static class101[] field2819;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "[[B")
    public static byte[][] field2816;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLm;I)V", line = 22)
    private final void method965(byte arg0, class77 arg1, int arg2) {
        int var4 = -72 / ((arg0 - 49) / 36);
        field2792++;
        if (arg2 == 5) {
            this.field2801 = arg1.method636(97);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 37)
    public static final int method966(KeyEvent arg0, int arg1) {
        if (arg1 != 8) {
            method971(-54);
        }
        field2793++;
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lm;B)V", line = 54)
    public final void method967(class77 arg0, byte arg1) {
        field2806++;
        while (true) {
            int var3 = arg0.method620((byte) -8);
            if (var3 == 0) {
                if (arg1 >= -52) {
                    method966(null, -33);
                    return;
                } else {
                    return;
                }
            }
            this.method965((byte) -8, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 84)
    public static final void method968(byte arg0, Component arg1) {
        arg1.removeKeyListener(class2.field21);
        field2795++;
        arg1.removeFocusListener(class2.field21);
        if (arg0 != 52) {
            field2800 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 97)
    public static final void method969(int arg0) {
        class46.field1040 = null;
        class20.field421 = null;
        class139.field3373 = null;
        class27.field677 = null;
        class117.field2759 = null;
        class64.field1403 = null;
        field2809 = null;
        class57.field1239 = null;
        field2796++;
        class22.field560 = null;
        class87.field2097 = null;
        class15.field316 = null;
        if (arg0 != -1083) {
            field2817 = null;
        }
        class137.field3335 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([IZBII)V", line = 132)
    public static final void method970(int[] arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 78) {
            field2812 = -20L;
        }
        class100.field2344.method941(10);
        class105.field2483.method1036(0, 0);
        if (arg1) {
            if (arg0[arg4] != -1) {
                if (arg4 == 0) {
                    class135.field3296.method1036(22, 10);
                }
                if (arg4 == 1) {
                    class107.field2520.method1036(54, 8);
                }
                if (arg4 == 2) {
                    class107.field2520.method1036(82, 8);
                }
                if (arg4 == 3) {
                    class2.field22.method1036(110, 8);
                }
                if (arg4 == 4) {
                    class130.field3165.method1036(153, 8);
                }
                if (arg4 == 5) {
                    class130.field3165.method1036(181, 8);
                }
                if (arg4 == 6) {
                    class61.field1344.method1036(209, 9);
                }
            }
            if (arg0[0] != -1 && arg3 != 0) {
                class108.field2578[0].method1036(29, 13);
            }
            if (arg0[1] != -1 && arg3 != 1) {
                class108.field2578[1].method1036(53, 11);
            }
            if (arg0[2] != -1 && arg3 != 2) {
                class108.field2578[2].method1036(82, 11);
            }
            if (arg0[3] != -1 && arg3 != 3) {
                class108.field2578[3].method1036(115, 12);
            }
            if (arg0[4] != -1 && arg3 != 4) {
                class108.field2578[4].method1036(153, 13);
            }
            if (arg0[5] != -1 && arg3 != 5) {
                class108.field2578[5].method1036(180, 11);
            }
            if (arg0[6] != -1 && arg3 != 6) {
                class108.field2578[6].method1036(208, 13);
            }
        }
        field2810++;
        class26.field657.method941(10);
        class135.field3297.method1036(0, 0);
        if (arg1) {
            if (arg0[arg4] != -1) {
                if (arg4 == 7) {
                    class7.field144.method1036(42, 0);
                }
                if (arg4 == 8) {
                    field2815.method1036(74, 0);
                }
                if (arg4 == 9) {
                    field2815.method1036(102, 0);
                }
                if (arg4 == 10) {
                    class60.field1308.method1036(130, 1);
                }
                if (arg4 == 11) {
                    class125.field3054.method1036(173, 0);
                }
                if (arg4 == 12) {
                    class125.field3054.method1036(201, 0);
                }
                if (arg4 == 13) {
                    class54.field1196.method1036(229, 0);
                }
            }
            if (arg0[8] != -1 && arg3 != 8) {
                class108.field2578[7].method1036(74, 2);
            }
            if (arg0[9] != -1 && arg3 != 9) {
                class108.field2578[8].method1036(102, 3);
            }
            if (arg0[10] != -1 && arg3 != 10) {
                class108.field2578[9].method1036(137, 4);
            }
            if (arg0[11] != -1 && arg3 != 11) {
                class108.field2578[10].method1036(174, 2);
            }
            if (arg0[12] != -1 && arg3 != 12) {
                class108.field2578[11].method1036(201, 2);
            }
            if (arg0[13] != -1 && arg3 != 13) {
                class108.field2578[12].method1036(226, 2);
            }
        }
        try {
            Graphics var5 = class70.field1564.getGraphics();
            class100.field2344.method1(-73, var5, 516, 160);
            class26.field657.method1(-126, var5, 496, 466);
        } catch (Exception var6) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 270)
    public static void method971(int arg0) {
        field2794 = null;
        field2815 = null;
        field2818 = null;
        field2819 = null;
        field2803 = null;
        field2817 = null;
        field2805 = null;
        field2802 = null;
        if (arg0 != 0) {
            method966(null, 28);
        }
        field2808 = null;
        field2800 = null;
        field2809 = null;
        field2816 = null;
        field2820 = null;
        field2813 = null;
        field2814 = null;
    }
}
