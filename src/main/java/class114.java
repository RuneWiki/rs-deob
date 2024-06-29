import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class114 extends class19 {

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    private int field2683 = 0;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lkc;")
    public static class67 field2668 = class19.method144("Ung-Ultiges Anmelde)2Paket)3", 101);

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lkc;")
    private static class67 field2674 = class19.method144("You need a members account to login to this world)3", 75);

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lkc;")
    private static class67 field2678 = class19.method144("Loaded input handler", 106);

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "Lkc;")
    public static class67 field2680 = class19.method144("oberen Rand der Webseite ausw-=hlen)3", 68);

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lkc;")
    public static class67 field2666 = class19.method144("Lade Benutzeroberfl-=che )2 ", 98);

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lkc;")
    public static class67 field2669 = class19.method144("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>", 74);

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "J")
    public static volatile long field2670 = 0L;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "Lkc;")
    public static class67 field2665 = class19.method144("null", 110);

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "Lkc;")
    public static class67 field2675 = field2674;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field2671 = -1;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Z")
    public static boolean field2673 = true;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lkc;")
    public static class67 field2677 = class19.method144("Classic", 99);

    @OriginalMember(owner = "client!sb", name = "Cb", descriptor = "Lkc;")
    public static class67 field2695 = field2678;

    @OriginalMember(owner = "client!sb", name = "zb", descriptor = "Lkc;")
    public static class67 field2692 = class19.method144("zur-Uck auf die RuneScape)2Webseite gehen", 124);

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "Lkc;")
    public static class67 field2684 = class19.method144("Bitte versuchen Sie es erneut)3", 120);

    @OriginalMember(owner = "client!sb", name = "Db", descriptor = "Lkc;")
    public static class67 field2696 = class19.method144("nicht hergestellt werden)3", 112);

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!sb", name = "vb", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!sb", name = "wb", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!sb", name = "xb", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!sb", name = "yb", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!sb", name = "Ab", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!sb", name = "Bb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!sb", name = "Eb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sb", name = "ub", descriptor = "Lta;")
    public static class119 field2687;

    @OriginalMember(owner = "client!sb", name = "Fb", descriptor = "[I")
    public static int[] field2698;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V", line = 17)
    private final void method909(int arg0, int arg1) {
        field2682++;
        if (arg0 != 4360) {
            field2680 = null;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (var3 < var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field2690 = (int) (var17 * 256.0D);
        if (this.field2690 < 0) {
            this.field2690 = 0;
        } else if (this.field2690 > 255) {
            this.field2690 = 255;
        }
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2662 = (int) (var15 * 256.0D);
        if (this.field2662 < 0) {
            this.field2662 = 0;
        } else if (this.field2662 > 255) {
            this.field2662 = 255;
        }
        if (var17 > 0.5D) {
            this.field2691 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2691 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2691 < 1) {
            this.field2691 = 1;
        }
        double var19 = var13 / 6.0D;
        this.field2688 = (int) ((double) this.field2691 * var19);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)I", line = 113)
    public static final int method910(int arg0, byte arg1, int arg2) {
        field2693++;
        if (arg0 == -2) {
            return 12345678;
        }
        if (arg1 >= -30) {
            field2677 = null;
        }
        if (arg0 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        }
        int var4 = (arg0 & 0x7F) * arg2 / 128;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V", line = 165)
    public static void method911(int arg0) {
        field2665 = null;
        field2666 = null;
        field2677 = null;
        field2692 = null;
        field2668 = null;
        field2684 = null;
        field2675 = null;
        field2696 = null;
        field2687 = null;
        field2678 = null;
        field2669 = null;
        field2698 = null;
        field2674 = null;
        field2695 = null;
        if (arg0 != -1) {
            field2665 = null;
        }
        field2680 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V", line = 192)
    public static final void method912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 60) {
            return;
        }
        for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
            for (int var6 = arg3; var6 <= arg0 + arg3; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class45.field1095[0][var6][var5] = 127;
                    if (arg3 == var6 && var6 > 0) {
                        class34.field823[0][var6][var5] = class34.field823[0][var6 - 1][var5];
                    }
                    if (arg0 + arg3 == var6 && var6 < 103) {
                        class34.field823[0][var6][var5] = class34.field823[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class34.field823[0][var6][var5] = class34.field823[0][var6][var5 - 1];
                    }
                    if (arg1 + arg2 == var5 && var5 < 103) {
                        class34.field823[0][var6][var5] = class34.field823[0][var6][var5 + 1];
                    }
                }
            }
        }
        field2679++;
    }

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)V", line = 254)
    public static final void method913(int arg0) {
        field2697++;
        class83.field1963.method432((byte) 70);
        for (int var1 = 0; var1 < 32; var1++) {
            class80.field1907[var1] = 0L;
        }
        if (arg0 == 26406) {
            for (int var2 = 0; var2 < 32; var2++) {
                class31.field669[var2] = 0L;
            }
            class82.field1955 = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwd;IBI)V", line = 289)
    private final void method914(class140 arg0, int arg1, byte arg2, int arg3) {
        field2689++;
        if (arg2 < 77) {
            method912(-37, -42, 104, 46, 67);
        }
        if (arg1 == 1) {
            this.field2683 = arg0.method1114(false);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwd;BI)V", line = 323)
    public final void method915(class140 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1105(255);
            if (var4 == 0) {
                int var5 = -9 / ((-arg1 - 47) / 49);
                field2672++;
                return;
            }
            this.method914(arg0, var4, (byte) 91, arg2);
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Z", line = 346)
    public static final boolean method916(byte arg0) {
        field2663++;
        if (arg0 < 89) {
            field2673 = true;
        }
        class12 var1 = class94.field2156;
        synchronized (class94.field2156) {
            if (class7.field154 == class24.field505) {
                return false;
            } else {
                class64.field1502 = class94.field2143[class24.field505];
                class77.field1831 = class1.field16[class24.field505];
                class24.field505 = class24.field505 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V", line = 367)
    public static final void method917(int arg0) {
        field2664++;
        if (arg0 != -27080) {
            field2698 = null;
        }
        for (class115 var1 = (class115) class88.field2026.method83(64); var1 != null; var1 = (class115) class88.field2026.method81(arg0 + 27008)) {
            if (class112.field2593 != var1.field2713 || var1.field2699) {
                var1.method13(70);
            } else if (var1.field2700 <= class135.field3243) {
                var1.method922(class121.field2830, (byte) 126);
                if (var1.field2699) {
                    var1.method13(71);
                } else {
                    class103.field2332.method857(var1.field2713, var1.field2719, var1.field2709, var1.field2711, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V", line = 410)
    public final void method918(byte arg0) {
        this.method909(4360, this.field2683);
        field2676++;
        if (arg0 >= -14) {
            field2673 = false;
        }
    }
}
