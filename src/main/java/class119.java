import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class119 extends class134 {

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public int field2754 = -1;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "Z")
    public boolean field2764 = true;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "I")
    public int field2767 = 0;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public int field2745 = -1;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lwd;")
    private static class150 field2749 = class2.method9(true, "shake:");

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lwd;")
    public static class150 field2742 = field2749;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field2757 = 127;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lwd;")
    public static class150 field2758 = class2.method9(true, "mapscene");

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "Lwd;")
    public static class150 field2766 = field2749;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "Lwd;")
    public static class150 field2762 = class2.method9(true, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "Z")
    public static boolean field2741 = false;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "[[I")
    public static int[][] field2763 = new int[104][104];

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lwd;")
    private static class150 field2765 = class2.method9(true, "slide:");

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lwd;")
    public static class150 field2752 = field2765;

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lwd;")
    private static class150 field2768 = class2.method9(true, " has logged out)3");

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Lwd;")
    public static class150 field2747 = field2768;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lwd;")
    public static class150 field2746 = field2765;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public int field2744;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    private final void method860(int arg0, int arg1) {
        field2753++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (var5 > var3) {
            var11 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var11 < var7) {
            var11 = var7;
        }
        if (arg0 <= 122) {
            method861(124);
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field2744 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
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
        if (this.field2744 < 0) {
            this.field2744 = 0;
        } else if (this.field2744 > 255) {
            this.field2744 = 255;
        }
        this.field2743 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2751 = (int) (var19 * 256.0D);
        if (this.field2743 < 0) {
            this.field2743 = 0;
        } else if (this.field2743 > 255) {
            this.field2743 = 255;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method861(int arg0) {
        field2746 = null;
        field2747 = null;
        field2763 = null;
        if (arg0 != 0) {
            field2755 = -100;
        }
        field2762 = null;
        field2749 = null;
        field2742 = null;
        field2752 = null;
        field2758 = null;
        field2766 = null;
        field2768 = null;
        field2765 = null;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public final void method862(int arg0) {
        int var2 = -95 % ((-arg0 - 23) / 41);
        if (this.field2754 != -1) {
            this.method860(125, this.field2754);
            this.field2750 = this.field2744;
            this.field2760 = this.field2751;
            this.field2756 = this.field2743;
        }
        this.method860(126, this.field2767);
        field2740++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILwb;I)V")
    private final void method863(int arg0, int arg1, class148 arg2, int arg3) {
        if (arg3 >= -79) {
            this.method864(-36, null, 30);
        }
        if (arg0 == 1) {
            this.field2767 = arg2.method1152((byte) -122);
        } else if (arg0 == 2) {
            this.field2745 = arg2.method1137(255);
        } else if (arg0 == 5) {
            this.field2764 = false;
        } else if (arg0 == 7) {
            this.field2754 = arg2.method1152((byte) 111);
        }
        field2748++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILwb;I)V")
    public final void method864(int arg0, class148 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1137(255);
            if (var4 == 0) {
                field2759++;
                if (arg2 != -1) {
                    this.field2750 = -5;
                    return;
                }
                return;
            }
            this.method863(var4, arg0, arg1, -90);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lff;I)V")
    public static final void method865(class42 arg0, int arg1) {
        class73.field1820 = arg0;
        if (arg1 == 2851) {
            field2761++;
        }
    }
}
