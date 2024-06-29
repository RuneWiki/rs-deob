import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 extends class30 {

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "Z")
    public boolean field2875 = true;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public int field2885 = 0;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public int field2887 = -1;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public int field2888 = -1;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "[[I")
    public static int[][] field2870 = new int[104][104];

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "Lje;")
    private static class67 field2881 = class85.method592(255, "wave2:");

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "Lje;")
    public static class67 field2878 = field2881;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "Lje;")
    public static class67 field2889 = class85.method592(255, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "Lje;")
    public static class67 field2886 = field2881;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "Lje;")
    public static class67 field2892 = class85.method592(255, "Neuer Benutzer");

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public int field2877;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public int field2884;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "Luf;")
    public static class145 field2893;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "Z")
    public static boolean field2891;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
    public final void method995(byte arg0) {
        field2879++;
        if (this.field2888 != -1) {
            this.method998(true, this.field2888);
            this.field2877 = this.field2884;
            this.field2872 = this.field2882;
            this.field2890 = this.field2876;
        }
        this.method998(true, this.field2885);
        if (arg0 != 85) {
            field2891 = false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(B)V")
    public static void method996(byte arg0) {
        int var1 = 103 / ((3 - arg0) / 38);
        field2878 = null;
        field2889 = null;
        field2886 = null;
        field2881 = null;
        field2870 = null;
        field2892 = null;
        field2893 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILna;)V")
    public final void method997(int arg0, int arg1, class91 arg2) {
        int var4 = 84 / ((arg1 + 37) / 44);
        while (true) {
            int var5 = arg2.method649(false);
            if (var5 == 0) {
                field2871++;
                return;
            }
            this.method999(arg0, arg2, true, var5);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
    private final void method998(boolean arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field2883++;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (!arg0) {
            this.field2888 = -92;
        }
        this.field2884 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (this.field2884 < 0) {
            this.field2884 = 0;
        } else if (this.field2884 > 255) {
            this.field2884 = 255;
        }
        this.field2876 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2876 < 0) {
            this.field2876 = 0;
        } else if (this.field2876 > 255) {
            this.field2876 = 255;
        }
        this.field2882 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILna;ZI)V")
    private final void method999(int arg0, class91 arg1, boolean arg2, int arg3) {
        if (arg3 == 1) {
            this.field2885 = arg1.method637(85);
        } else if (arg3 == 2) {
            this.field2887 = arg1.method649(false);
        } else if (arg3 == 5) {
            this.field2875 = false;
        } else if (arg3 == 7) {
            this.field2888 = arg1.method637(71);
        }
        field2874++;
        if (!arg2) {
            this.field2885 = -84;
        }
    }
}
