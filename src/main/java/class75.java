import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lad;")
    public static class5 field1789 = class88.method674("Schlie-8en", 108);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "J")
    public static volatile long field1787 = 0L;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1794 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lbb;")
    public static class9 field1791 = new class9(50);

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lad;")
    public static class5 field1798 = class88.method674("Sichtbare Karte vorbereitet)3", -107);

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lad;")
    public static class5 field1802 = class88.method674("Lade Wordpack )2 ", 46);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lad;")
    private static class5 field1803 = class88.method674("You need a members account to login to this world)3", 53);

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lad;")
    public static class5 field1801 = class88.method674("@yel@", -103);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lad;")
    public static class5 field1796 = field1803;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
    public static int[] field1799 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lad;")
    public static class5 field1805 = class88.method674("RuneScape wird geladen )2 bitte warten)3)3)3", 77);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
    public static int[] field1800;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Z", line = 10)
    public static final boolean method593(boolean arg0, int arg1) {
        field1795++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class22.field562[arg1];
        if (!arg0) {
            field1797 = 21;
        }
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 59;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 48)
    public static void method594(int arg0) {
        field1796 = null;
        field1791 = null;
        field1803 = null;
        field1800 = null;
        field1798 = null;
        field1799 = null;
        field1805 = null;
        field1801 = null;
        field1789 = null;
        if (arg0 != 0) {
            field1801 = null;
        }
        field1802 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIII[I)V", line = 80)
    public static final void method595(boolean arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field1792++;
        class95.field2275.method885(-85);
        class118.field2942.method976(0, 0);
        if (arg0) {
            if (arg4[arg1] != -1) {
                if (arg1 == 0) {
                    class105.field2560.method976(22, 10);
                }
                if (arg1 == 1) {
                    client.field492.method976(54, 8);
                }
                if (arg1 == 2) {
                    client.field492.method976(82, 8);
                }
                if (arg1 == 3) {
                    class87.field2038.method976(110, 8);
                }
                if (arg1 == 4) {
                    class10.field337.method976(153, 8);
                }
                if (arg1 == 5) {
                    class10.field337.method976(181, 8);
                }
                if (arg1 == 6) {
                    class53.field1341.method976(209, 9);
                }
            }
            if (arg4[0] != -1 && arg2 != 0) {
                class30.field725[0].method976(29, 13);
            }
            if (arg4[1] != -1 && arg2 != 1) {
                class30.field725[1].method976(53, 11);
            }
            if (arg4[2] != -1 && arg2 != 2) {
                class30.field725[2].method976(82, 11);
            }
            if (arg4[3] != -1 && arg2 != 3) {
                class30.field725[3].method976(115, 12);
            }
            if (arg4[4] != -1 && arg2 != 4) {
                class30.field725[4].method976(153, 13);
            }
            if (arg4[5] != -1 && arg2 != 5) {
                class30.field725[5].method976(180, 11);
            }
            if (arg4[6] != -1 && arg2 != 6) {
                class30.field725[6].method976(208, 13);
            }
        }
        class18.field467.method885(-52);
        class72.field1745.method976(0, 0);
        if (arg0) {
            if (arg4[arg1] != -1) {
                if (arg1 == 7) {
                    class13.field384.method976(42, 0);
                }
                if (arg1 == 8) {
                    class38.field944.method976(74, 0);
                }
                if (arg1 == 9) {
                    class38.field944.method976(102, 0);
                }
                if (arg1 == 10) {
                    class88.field2082.method976(130, 1);
                }
                if (arg1 == 11) {
                    class118.field2896.method976(173, 0);
                }
                if (arg1 == 12) {
                    class118.field2896.method976(201, 0);
                }
                if (arg1 == 13) {
                    class32.field764.method976(229, 0);
                }
            }
            if (arg4[8] != -1 && arg2 != 8) {
                class30.field725[7].method976(74, 2);
            }
            if (arg4[9] != -1 && arg2 != 9) {
                class30.field725[8].method976(102, 3);
            }
            if (arg4[10] != -1 && arg2 != 10) {
                class30.field725[9].method976(137, 4);
            }
            if (arg4[11] != -1 && arg2 != 11) {
                class30.field725[10].method976(174, 2);
            }
            if (arg4[12] != -1 && arg2 != 12) {
                class30.field725[11].method976(201, 2);
            }
            if (arg4[13] != -1 && arg2 != 13) {
                class30.field725[12].method976(226, 2);
            }
        }
        try {
            Graphics var5 = class9.field305.getGraphics();
            class95.field2275.method253(160, var5, false, 516);
            if (arg3 >= -94) {
                method596(14);
            }
            class18.field467.method253(466, var5, false, 496);
        } catch (Exception var6) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 217)
    public static final void method596(int arg0) {
        field1790++;
        if (arg0 != 8) {
            field1789 = null;
        }
        while (true) {
            class23 var1 = class101.field2460;
            class53 var2;
            synchronized (class101.field2460) {
                var2 = (class53) class121.field3002.method183(arg0 ^ 0xFFFFFFA5);
            }
            if (var2 == null) {
                return;
            }
            var2.field1327.method926((int) var2.field363, (byte) -112, false, var2.field1326, var2.field1340);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILgb;)Lad;", line = 245)
    public static final class5 method597(int arg0, int arg1, class39 arg2) {
        field1793++;
        try {
            class5 var3 = new class5();
            var3.field183 = arg2.method328((byte) 85);
            if (arg1 < var3.field183) {
                var3.field183 = arg1;
            }
            var3.field164 = new byte[var3.field183];
            if (arg0 != 6144) {
                method596(-104);
            }
            arg2.field957 += class48.field1249.method279(0, var3.field183, var3.field164, (byte) 15, arg2.field957, arg2.field974);
            return var3;
        } catch (Exception var4) {
            return class79.field1877;
        }
    }
}
