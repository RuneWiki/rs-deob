import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 {

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[Z")
    public boolean[] field726 = new boolean[16];

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[[I")
    public int[][] field731 = new int[6][258];

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[[I")
    public int[][] field732 = new int[6][258];

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
    public int[] field744 = new int[256];

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[[I")
    public int[][] field746 = new int[6][258];

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[B")
    public byte[] field755 = new byte[18002];

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "[B")
    public byte[] field762 = new byte[4096];

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
    public int[] field730 = new int[257];

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[Z")
    public boolean[] field729 = new boolean[256];

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[B")
    public byte[] field741 = new byte[256];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field722 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "[B")
    public byte[] field761 = new byte[18002];

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "[I")
    public int[] field747 = new int[6];

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    public int field772 = 0;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "[[B")
    public byte[][] field774 = new byte[6][258];

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "[I")
    public int[] field770 = new int[16];

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Z")
    public static boolean field742 = false;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lwd;")
    public static class150 field739 = class2.method9(true, "Spieler");

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lwd;")
    public static class150 field751 = class2.method9(true, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Lwd;")
    private static class150 field759 = class2.method9(true, "Drop");

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lwd;")
    public static class150 field752 = class2.method9(true, "Standort");

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Lwd;")
    private static class150 field766 = class2.method9(true, "Please try using a different world)3");

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Lwd;")
    public static class150 field734 = field759;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lwd;")
    public static class150 field735 = field766;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lwd;")
    public static class150 field754 = class2.method9(true, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "Lwd;")
    public static class150 field764 = class2.method9(true, "Registrierter Benutzer");

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lwd;")
    private static class150 field728 = class2.method9(true, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "Lwd;")
    public static class150 field743 = field728;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field748 = 0;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Lwd;")
    public static class150 field768 = field766;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lwd;")
    private static class150 field765 = class2.method9(true, " is already on your ignore list");

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lwd;")
    public static class150 field775 = field766;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "Lwd;")
    public static class150 field745 = field765;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lwd;")
    public static class150 field753 = field766;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "Lwd;")
    public static class150 field740 = field766;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lwd;")
    public static class150 field721 = field766;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "B")
    public byte field769;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public int field724;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public int field736;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public int field737;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "[B")
    public byte[] field750;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "[B")
    public byte[] field767;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method204(int arg0) {
        field766 = null;
        field743 = null;
        field739 = null;
        field768 = null;
        field745 = null;
        field751 = null;
        field759 = null;
        field765 = null;
        field752 = null;
        field764 = null;
        if (arg0 != 2) {
            return;
        }
        field754 = null;
        field753 = null;
        field740 = null;
        field721 = null;
        field734 = null;
        field728 = null;
        field775 = null;
        field735 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)I")
    public static final int method205(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        field738++;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        } else if (arg2 == -23287) {
            int var6 = arg1;
            if (arg1 < 3 && (class131.field3097[1][var4][var5] & 0x2) == 2) {
                var6 = arg1 + 1;
            }
            int var7 = arg0 & 0x7F;
            int var8 = arg3 & 0x7F;
            int var9 = (128 - var7) * class121.field2789[var6][var4][var5] + class121.field2789[var6][var4 + 1][var5] * var7 >> 7;
            int var10 = (128 - var7) * class121.field2789[var6][var4][var5 - -1] + class121.field2789[var6][var4 + 1][var5 + 1] * var7 >> 7;
            return (128 - var8) * var9 + var8 * var10 >> 7;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILjava/awt/Color;Lwd;)V")
    public static final void method206(int arg0, int arg1, Color arg2, class150 arg3) {
        try {
            Graphics var4 = class142.field3439.getGraphics();
            if (class2.field23 == null) {
                class2.field23 = new Font("Helvetica", 1, 13);
                class133.field3130 = class142.field3439.getFontMetrics(class2.field23);
            }
            if (class97.field2225) {
                class97.field2225 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class128.field3038, class63.field1624);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class77.field1910 == null) {
                    class77.field1910 = class142.field3439.createImage(304, 34);
                }
                Graphics var5 = class77.field1910.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                if (arg1 != 16) {
                    method204(-92);
                }
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class2.field23);
                var5.setColor(Color.white);
                arg3.method1195((304 - arg3.method1205(125, class133.field3130)) / 2, var5, 22, (byte) -84);
                var4.drawImage(class77.field1910, class128.field3038 / 2 - 152, class63.field1624 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class63.field1624 / 2 - 18;
                int var7 = class128.field3038 / 2 - 152;
                var4.setColor(arg2);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(var7 + arg0 * 3 + 2, var6 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class2.field23);
                var4.setColor(Color.white);
                arg3.method1195((304 - arg3.method1205(arg1 + 108, class133.field3130)) / 2 + var7, var4, var6 + 22, (byte) -84);
            }
        } catch (Exception var9) {
            class142.field3439.repaint();
        }
        field723++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lse;I)V")
    public static final void method207(class127 arg0, int arg1) {
        field760++;
        if (arg0.field2956 == 0 || arg1 != 21769) {
            return;
        }
        if (arg0.field2931 != -1 && arg0.field2931 < 32768) {
            class18 var2 = class37.field1013[arg0.field2931];
            if (var2 != null) {
                int var3 = arg0.field2939 - var2.field2939;
                int var4 = arg0.field3000 - var2.field3000;
                if (var4 != 0 || var3 != 0) {
                    arg0.field3006 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2931 >= 32768) {
            int var5 = arg0.field2931 - 32768;
            if (class29.field876 == var5) {
                var5 = 2047;
            }
            class111 var6 = class137.field3217[var5];
            if (var6 != null) {
                int var7 = arg0.field3000 - var6.field3000;
                int var8 = arg0.field2939 - var6.field2939;
                if (var7 != 0 || var8 != 0) {
                    arg0.field3006 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2972 != 0 || arg0.field2998 != 0) && (arg0.field3013 == 0 || arg0.field2957 > 0)) {
            int var9 = arg0.field3000 - (arg0.field2972 - class66.field1686 - class66.field1686) * 64;
            int var10 = arg0.field2939 - (arg0.field2998 - class77.field1905 - class77.field1905) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field3006 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field2972 = 0;
            arg0.field2998 = 0;
        }
        int var11 = arg0.field3006 - arg0.field2971 & 0x7FF;
        if (var11 == 0) {
            arg0.field3003 = 0;
            return;
        }
        arg0.field3003++;
        if (var11 <= 1024) {
            arg0.field2971 += arg0.field2956;
            boolean var12 = true;
            if (var11 < arg0.field2956 || 2048 - arg0.field2956 < var11) {
                arg0.field2971 = arg0.field3006;
                var12 = false;
            }
            if (arg0.field2978 == arg0.field2976 && (arg0.field3003 > 25 || var12)) {
                if (arg0.field2947 == -1) {
                    arg0.field2976 = arg0.field2930;
                } else {
                    arg0.field2976 = arg0.field2947;
                }
            }
        } else {
            arg0.field2971 -= arg0.field2956;
            boolean var13 = true;
            if (var11 < arg0.field2956 || 2048 - arg0.field2956 < var11) {
                arg0.field2971 = arg0.field3006;
                var13 = false;
            }
            if (arg0.field2978 == arg0.field2976 && (arg0.field3003 > 25 || var13)) {
                if (arg0.field2948 == -1) {
                    arg0.field2976 = arg0.field2930;
                } else {
                    arg0.field2976 = arg0.field2948;
                }
            }
        }
        arg0.field2971 &= 0x7FF;
    }
}
