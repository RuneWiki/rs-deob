import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class193 {

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field2988 = -1;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private int field2990 = 0;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public int field3008 = -1;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Z")
    public boolean field3015 = true;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public int field2994 = -1;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Z")
    public boolean field2991 = true;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Z")
    public boolean field3018 = false;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    private int field3012 = 128;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public int field3022 = -1;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public int field3026 = -1;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public int field3020 = -1;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public int field3007 = 255;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    private int field2986 = 128;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "B")
    private byte field3000 = 0;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "Ljava/lang/String;")
    public String field3031 = "null";

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    private int field3023 = 0;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    private int field3036 = 0;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field2999 = 0;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public int field3032 = -1;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public int field3001 = -1;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "Z")
    public boolean field3027 = false;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    private int field3030 = -1;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "Z")
    public boolean field3037 = false;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "Z")
    public boolean field3041 = false;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "Z")
    public boolean field3049 = true;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public int field3009 = 0;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public int field3016 = 16;

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "S")
    private short field3051 = -1;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "Z")
    public boolean field3043 = false;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public int field3040 = -1;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field3003 = 0;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "Z")
    public boolean field3053 = false;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public boolean field2989 = false;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    public int field3028 = 1;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
    private int field3042 = 128;

    @OriginalMember(owner = "client!ma", name = "tb", descriptor = "I")
    public int field3057 = 2;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "Z")
    public boolean field3045 = false;

    @OriginalMember(owner = "client!ma", name = "ub", descriptor = "Z")
    public boolean field3058 = true;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "Z")
    private boolean field3047 = false;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    private int field3038 = 0;

    @OriginalMember(owner = "client!ma", name = "Bb", descriptor = "I")
    private int field3065 = 0;

    @OriginalMember(owner = "client!ma", name = "vb", descriptor = "Z")
    private boolean field3059 = false;

    @OriginalMember(owner = "client!ma", name = "sb", descriptor = "I")
    public int field3056 = 0;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "I")
    public int field3054 = -1;

    @OriginalMember(owner = "client!ma", name = "zb", descriptor = "I")
    public int field3063 = 1;

    @OriginalMember(owner = "client!ma", name = "Eb", descriptor = "I")
    public int field3068 = -1;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "[Ljava/lang/String;")
    public String[] field3035 = new String[5];

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    private int field3039 = -1;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "[I")
    public static int[] field3034 = new int[4096];

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Z")
    public static boolean field3021 = false;

    @OriginalMember(owner = "client!ma", name = "wb", descriptor = "[Ljava/lang/String;")
    public static String[] field3060 = new String[100];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
    public int field3024;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ma", name = "yb", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ma", name = "Db", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "Led;")
    public static class186 field3048;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lih;")
    public static class208 field3005;

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "Luc;")
    private class39 field3050;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "[B")
    private byte[] field3046;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    public int[] field2997;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "[I")
    private int[] field3019;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "[I")
    private int[] field3044;

    @OriginalMember(owner = "client!ma", name = "Ab", descriptor = "[I")
    public int[] field3064;

    @OriginalMember(owner = "client!ma", name = "Cb", descriptor = "[I")
    public static int[] field3066;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "[S")
    private short[] field2993;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "[S")
    private short[] field3010;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "[S")
    private short[] field3017;

    @OriginalMember(owner = "client!ma", name = "xb", descriptor = "[S")
    private short[] field3061;

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "[[Lre;")
    public static class228[][] field3052;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Lma;")
    public final class193 method1297(boolean arg0) {
        int var2 = -1;
        field3013++;
        if (this.field3030 != -1) {
            var2 = class251.method1719(true, this.field3030);
        } else if (this.field3039 != -1) {
            var2 = class31.field462[this.field3039];
        }
        if (arg0) {
            this.method1301((byte) 33);
        }
        if (var2 < 0 || var2 >= this.field2997.length - 1 || this.field2997[var2] == -1) {
            int var3 = this.field2997[this.field2997.length - 1];
            return var3 == -1 ? null : class69.method501(0, var3);
        } else {
            return class69.method501(0, this.field2997[var2]);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIZIIZLch;[[I[[I)Lec;")
    public final class24 method1298(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, class290 arg8, int[][] arg9, int[][] arg10) {
        field3011++;
        long var12;
        if (this.field3044 == null) {
            var12 = (long) ((this.field3024 << 10) + arg3);
        } else {
            var12 = (long) ((this.field3024 << 10) + (arg2 << 3) + arg3);
        }
        boolean var14;
        if (arg4 && this.field3047) {
            var12 |= Long.MIN_VALUE;
            var14 = true;
        } else {
            var14 = false;
        }
        class43 var15 = (class43) class171.field2664.method1887(0, var12);
        if (var15 == null) {
            class234 var16 = this.method1314(arg2, true, arg3);
            if (var16 == null) {
                class286.field4529.field328 = null;
                return class286.field4529;
            }
            var16.method1562();
            if (arg2 == 10 && arg3 > 3) {
                var16.method1564(256);
            }
            if (var14) {
                var16.field3715 = (short) (this.field3038 + 64);
                var16.field3735 = (short) (this.field3023 * 5 + 768);
                var15 = var16;
                var16.method1576();
            } else {
                var15 = new class54(var16, this.field3038 + 64, this.field3023 * 5 + 768, -50, -10, -50);
            }
            class171.field2664.method1886(-70, var12, var15);
        }
        if (var14) {
            var15 = ((class234) var15).method1567();
        }
        if (this.field3000 != arg6) {
            if (var15 instanceof class54) {
                var15 = ((class54) var15).method414(this.field3000, this.field3051, arg9, arg10, arg0, arg1, arg5, true);
            } else if (var15 instanceof class234) {
                var15 = ((class234) var15).method1561(this.field3000, this.field3051, arg9, arg10, arg0, arg1, arg5, true, false);
            }
        }
        class286.field4529.field328 = var15;
        return class286.field4529;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILma;ZII)V")
    public static final void method1299(int arg0, class193 arg1, boolean arg2, int arg3, int arg4) {
        field2992++;
        if (arg2) {
            method1303(-87);
        }
        for (class11 var5 = (class11) class185.field2857.method1221(125); var5 != null; var5 = (class11) class185.field2857.method1227(-10626)) {
            if (var5.field186 == arg3 && (arg0 * 128) == var5.field182 && (arg4 * 128) == var5.field185 && var5.field197.field3024 == arg1.field3024) {
                if (var5.field206 != null) {
                    class257.field4118.method1205(var5.field206);
                    var5.field206 = null;
                }
                if (var5.field195 != null) {
                    class257.field4118.method1205(var5.field195);
                    var5.field195 = null;
                }
                var5.method1123(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLjava/lang/String;ZLjava/awt/Color;)V")
    public static final void method1300(int arg0, byte arg1, String arg2, boolean arg3, Color arg4) {
        field3014++;
        try {
            Graphics var5 = class230.field3651.getGraphics();
            if (class11.field192 == null) {
                class11.field192 = new Font("Helvetica", 1, 13);
                class185.field2866 = class230.field3651.getFontMetrics(class11.field192);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class29.field409, class79.field1310);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class109.field1787 == null) {
                    class109.field1787 = class230.field3651.createImage(304, 34);
                }
                Graphics var6 = class109.field1787.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class11.field192);
                int var7 = 101 / ((arg1 - 13) / 43);
                var6.setColor(Color.white);
                var6.drawString(arg2, (304 - class185.field2866.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class109.field1787, class29.field409 / 2 - 152, class79.field1310 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var8 = class79.field1310 / 2 - 18;
                int var9 = class29.field409 / 2 - 152;
                var5.setColor(arg4);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 + 1, 301, 31);
                var5.fillRect(var9 - (-arg0 * 3 - 2), var8 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class11.field192);
                var5.setColor(Color.white);
                var5.drawString(arg2, var9 + ((304 - class185.field2866.stringWidth(arg2)) / 2), var8 - -22);
            }
            if (class75.field1248 != null) {
                var5.setFont(class11.field192);
                var5.setColor(Color.white);
                var5.drawString(class75.field1248, class29.field409 / 2 - class185.field2866.stringWidth(class75.field1248) / 2, class79.field1310 / 2 + -26);
            }
        } catch (Exception var11) {
            class230.field3651.repaint();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Z")
    public final boolean method1301(byte arg0) {
        field3055++;
        if (this.field2997 == null) {
            return this.field3001 != -1 || this.field3064 != null;
        }
        if (arg0 != 89) {
            this.field3054 = -16;
        }
        for (int var2 = 0; var2 < this.field2997.length; var2++) {
            if (this.field2997[var2] != -1) {
                class193 var3 = class69.method501(0, this.field2997[var2]);
                if (var3.field3001 != -1 || var3.field3064 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[IIIILch;IIILfb;[[IIIZZ)Lec;")
    public final class24 method1302(int[][] arg0, int arg1, int arg2, int arg3, class290 arg4, int arg5, int arg6, int arg7, class30 arg8, int[][] arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        if (!arg13) {
            return null;
        }
        field3067++;
        long var15;
        if (this.field3044 == null) {
            var15 = (long) ((this.field3024 << 10) + arg5);
        } else {
            var15 = (long) ((this.field3024 << 10) + (arg11 << 3) + arg5);
        }
        class54 var17 = (class54) class161.field2504.method1887(0, var15);
        if (var17 == null) {
            class234 var18 = this.method1314(arg11, true, arg5);
            if (var18 == null) {
                return null;
            }
            var17 = new class54(var18, this.field3038 + 64, this.field3023 * 5 + 768, -50, -10, -50);
            class161.field2504.method1886(-99, var15, var17);
        }
        boolean var19 = false;
        if (arg8 != null) {
            var19 = true;
            var17 = (class54) arg8.method233(arg6, true, arg3, arg5, var17, arg10);
        }
        if (arg11 == 10 && arg5 > 3) {
            if (!var19) {
                var17 = (class54) var17.method83(true, true, true);
                var19 = true;
            }
            var17.method88(256);
        }
        if (this.field3000 != 0) {
            if (!var19) {
                var17 = (class54) var17.method83(true, true, true);
                boolean var20 = true;
            }
            var17 = var17.method414(this.field3000, this.field3051, arg0, arg9, arg2, arg1, arg7, false);
        }
        class286.field4529.field328 = var17;
        return class286.field4529;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field3060 = null;
        field3066 = null;
        field3052 = null;
        field3034 = null;
        field3048 = null;
        if (arg0 != -78) {
            field3048 = null;
        }
        field3005 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBI)I")
    public final int method1304(int arg0, byte arg1, int arg2) {
        field2987++;
        if (this.field3050 == null) {
            return arg0;
        }
        class120 var4 = (class120) this.field3050.method285((long) arg2, arg1 + 13902);
        if (arg1 != -81) {
            this.field3023 = -108;
        }
        return var4 == null ? arg0 : var4.field1932;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Z")
    public final boolean method1305(byte arg0, int arg1) {
        if (arg0 != -51) {
            return false;
        }
        field3025++;
        if (this.field3044 != null) {
            for (int var5 = 0; var5 < this.field3044.length; var5++) {
                if (this.field3044[var5] == arg1) {
                    return class2.field10.method1615(arg0 - 27, this.field3019[var5] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3019 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field3019.length; var4++) {
                var3 &= class2.field10.method1615(-77, this.field3019[var4] & 0xFFFF, 0);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1306(String arg0, int arg1, int arg2) {
        field2995++;
        if (this.field3050 == null) {
            return arg0;
        } else {
            int var4 = 11 % ((arg1 - 25) / 54);
            class244 var5 = (class244) this.field3050.method285((long) arg2, 13821);
            return var5 == null ? arg0 : var5.field3970;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILai;)V")
    public final void method1307(int arg0, class88 arg1) {
        int var3 = -27 % ((arg0 - 8) / 47);
        field2996++;
        while (true) {
            int var4 = arg1.method633(118);
            if (var4 == 0) {
                return;
            }
            this.method1310(arg1, var4, -14362);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(CII)C")
    public static final char method1308(char arg0, int arg1, int arg2) {
        field2998++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg2 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg2 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 != -205) {
            return (char) 65477;
        } else if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)Lqh;")
    public static final class206 method1309(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class206 var4 = var3.field123;
            var3.field123 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lai;II)V")
    private final void method1310(class88 arg0, int arg1, int arg2) {
        if (arg2 != -14362) {
            this.method1306((String) null, -91, 89);
        }
        if (arg1 == 1) {
            int var23 = arg0.method633(81);
            if (var23 > 0) {
                if (this.field3019 == null || class49.field711) {
                    this.field3044 = new int[var23];
                    this.field3019 = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        this.field3019[var24] = arg0.method645(11596);
                        this.field3044[var24] = arg0.method633(101);
                    }
                } else {
                    arg0.field1535 += var23 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3031 = arg0.method675((byte) 16);
        } else if (arg1 == 5) {
            int var21 = arg0.method633(53);
            if (var21 > 0) {
                if (this.field3019 == null || class49.field711) {
                    this.field3044 = null;
                    this.field3019 = new int[var21];
                    for (int var22 = 0; var22 < var21; var22++) {
                        this.field3019[var22] = arg0.method645(11596);
                    }
                } else {
                    arg0.field1535 += var21 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3063 = arg0.method633(61);
        } else if (arg1 == 15) {
            this.field3028 = arg0.method633(110);
        } else if (arg1 == 17) {
            this.field3057 = 0;
            this.field3058 = false;
        } else if (arg1 == 18) {
            this.field3058 = false;
        } else if (arg1 == 19) {
            this.field3020 = arg0.method633(57);
        } else if (arg1 == 21) {
            this.field3000 = 1;
        } else if (arg1 == 22) {
            this.field3047 = true;
        } else if (arg1 == 23) {
            this.field3008 = 1;
        } else if (arg1 == 24) {
            this.field2994 = arg0.method645(11596);
            if (this.field2994 == 65535) {
                this.field2994 = -1;
            }
        } else if (arg1 == 27) {
            this.field3057 = 1;
        } else if (arg1 == 28) {
            this.field3016 = arg0.method633(arg2 ^ 0xFFFFC7D6);
        } else if (arg1 == 29) {
            this.field3038 = arg0.method656(-252);
        } else if (arg1 == 39) {
            this.field3023 = arg0.method656(-252) * 5;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3035[arg1 - 30] = arg0.method675((byte) 16);
            if (this.field3035[arg1 - 30].equalsIgnoreCase(class19.field281)) {
                this.field3035[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var19 = arg0.method633(64);
            this.field3017 = new short[var19];
            this.field3010 = new short[var19];
            for (int var20 = 0; var20 < var19; var20++) {
                this.field3010[var20] = (short) arg0.method645(11596);
                this.field3017[var20] = (short) arg0.method645(arg2 + 25958);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method633(arg2 + 14452);
            this.field2993 = new short[var4];
            this.field3061 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3061[var5] = (short) arg0.method645(11596);
                this.field2993[var5] = (short) arg0.method645(11596);
            }
        } else if (arg1 == 42) {
            int var6 = arg0.method633(arg2 + 14453);
            this.field3046 = new byte[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3046[var7] = arg0.method656(class87.method619(arg2, 14562));
            }
        } else if (arg1 == 60) {
            this.field3040 = arg0.method645(11596);
        } else if (arg1 == 62) {
            this.field3059 = true;
        } else if (arg1 == 64) {
            this.field2991 = false;
        } else if (arg1 == 65) {
            this.field2986 = arg0.method645(11596);
        } else if (arg1 == 66) {
            this.field3012 = arg0.method645(11596);
        } else if (arg1 == 67) {
            this.field3042 = arg0.method645(11596);
        } else if (arg1 == 69) {
            arg0.method633(57);
        } else if (arg1 == 70) {
            this.field3036 = arg0.method649(-2);
        } else if (arg1 == 71) {
            this.field3065 = arg0.method649(-2);
        } else if (arg1 == 72) {
            this.field2990 = arg0.method649(arg2 ^ 0x3818);
        } else if (arg1 == 73) {
            this.field3037 = true;
        } else if (arg1 == 74) {
            this.field3045 = true;
        } else if (arg1 == 75) {
            this.field3054 = arg0.method633(arg2 + 14429);
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3030 = arg0.method645(11596);
            if (this.field3030 == 65535) {
                this.field3030 = -1;
            }
            this.field3039 = arg0.method645(arg2 + 25958);
            if (this.field3039 == 65535) {
                this.field3039 = -1;
            }
            int var16 = -1;
            if (arg1 == 92) {
                var16 = arg0.method645(arg2 ^ 0xFFFFEAAA);
                if (var16 == 65535) {
                    var16 = -1;
                }
            }
            int var17 = arg0.method633(65);
            this.field2997 = new int[var17 + 2];
            for (int var18 = 0; var18 <= var17; var18++) {
                this.field2997[var18] = arg0.method645(arg2 + 25958);
                if (this.field2997[var18] == 65535) {
                    this.field2997[var18] = -1;
                }
            }
            this.field2997[var17 + 1] = var16;
        } else if (arg1 == 78) {
            this.field3001 = arg0.method645(11596);
            this.field2999 = arg0.method633(arg2 + 14441);
        } else if (arg1 == 79) {
            this.field3003 = arg0.method645(11596);
            this.field3056 = arg0.method645(11596);
            this.field2999 = arg0.method633(115);
            int var8 = arg0.method633(94);
            this.field3064 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3064[var9] = arg0.method645(11596);
            }
        } else if (arg1 == 81) {
            this.field3000 = 2;
            this.field3051 = (short) (arg0.method633(arg2 ^ 0xFFFFC788) * 256);
        } else if (arg1 != 82) {
            if (arg1 == 88) {
                this.field3049 = false;
            } else if (arg1 == 89) {
                this.field3015 = false;
            } else if (arg1 == 90) {
                this.field3018 = true;
            } else if (arg1 == 91) {
                this.field3041 = true;
            } else if (arg1 == 93) {
                this.field3000 = 3;
                this.field3051 = (short) arg0.method645(arg2 + 25958);
            } else if (arg1 == 94) {
                this.field3000 = 4;
            } else if (arg1 == 95) {
                this.field3000 = 5;
            } else if (arg1 == 96) {
                this.field3027 = true;
            } else if (arg1 == 97) {
                this.field2989 = true;
            } else if (arg1 == 98) {
                this.field3053 = true;
            } else if (arg1 == 99) {
                this.field3022 = arg0.method633(57);
                this.field3068 = arg0.method645(11596);
            } else if (arg1 == 100) {
                this.field2988 = arg0.method633(arg2 + 14483);
                this.field3026 = arg0.method645(11596);
            } else if (arg1 == 101) {
                this.field3009 = arg0.method633(114);
            } else if (arg1 == 102) {
                this.field3032 = arg0.method645(11596);
            } else if (arg1 == 103) {
                this.field3008 = 0;
            } else if (arg1 == 104) {
                this.field3007 = arg0.method633(48);
            } else if (arg1 == 105) {
                this.field3043 = true;
            } else if (arg1 == 249) {
                int var10 = arg0.method633(96);
                if (this.field3050 == null) {
                    int var11 = class89.method685(var10, -1609027472);
                    this.field3050 = new class39(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method633(95) == 1;
                    int var14 = arg0.method671(arg2 + 14483);
                    class166 var15;
                    if (var13) {
                        var15 = new class244(arg0.method675((byte) 16));
                    } else {
                        var15 = new class120(arg0.method641(arg2 ^ 0x3819));
                    }
                    this.field3050.method281(arg2 + 14363, (long) var14, var15);
                }
            }
        }
        field3002++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lhc;I)V")
    public static final void method1311(class235 arg0, int arg1) {
        field3004++;
        class56.field931 = arg0;
        if (arg1 != -97) {
            field3005 = null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Z")
    public final boolean method1312(byte arg0) {
        field3062++;
        if (this.field3019 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3019.length; var3++) {
            var2 &= class2.field10.method1615(-51, this.field3019[var3] & 0xFFFF, 0);
        }
        if (arg0 != -58) {
            this.field3040 = 98;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final void method1313(int arg0) {
        if (this.field3020 == -1) {
            this.field3020 = 0;
            if (this.field3019 != null && (this.field3044 == null || this.field3044[0] == 10)) {
                this.field3020 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field3035[var2] != null) {
                    this.field3020 = 1;
                    break;
                }
            }
        }
        if (arg0 == 8009) {
            if (this.field3054 == -1) {
                this.field3054 = this.field3057 == 0 ? 0 : 1;
            }
            field3033++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZI)Lui;")
    private final class234 method1314(int arg0, boolean arg1, int arg2) {
        field3006++;
        boolean var4 = this.field3059;
        if (arg0 == 2 && arg2 > 3) {
            var4 = !var4;
        }
        class234 var5 = null;
        if (this.field3044 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3019 == null) {
                return null;
            }
            int var6 = this.field3019.length;
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = this.field3019[var7];
                if (var4) {
                    var8 += 65536;
                }
                var5 = (class234) class57.field944.method1887(0, (long) var8);
                if (var5 == null) {
                    var5 = class234.method1575(class2.field10, var8 & 0xFFFF, 0);
                    if (var5 == null) {
                        return null;
                    }
                    if (var4) {
                        var5.method1578();
                    }
                    class57.field944.method1886(-96, (long) var8, var5);
                }
                if (var6 > 1) {
                    class197.field3114[var7] = var5;
                }
            }
            if (var6 > 1) {
                var5 = new class234(class197.field3114, var6);
            }
        } else {
            int var9 = -1;
            for (int var10 = 0; var10 < this.field3044.length; var10++) {
                if (this.field3044[var10] == arg0) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 == -1) {
                return null;
            }
            int var11 = this.field3019[var9];
            if (var4) {
                var11 += 65536;
            }
            var5 = (class234) class57.field944.method1887(0, (long) var11);
            if (var5 == null) {
                var5 = class234.method1575(class2.field10, var11 & 0xFFFF, 0);
                if (var5 == null) {
                    return null;
                }
                if (var4) {
                    var5.method1578();
                }
                class57.field944.method1886(-71, (long) var11, var5);
            }
        }
        boolean var12;
        if (this.field3036 == 0 && this.field3065 == 0 && this.field2990 == 0) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2986 == 128 && this.field3012 == 128 && this.field3042 == 128) {
            var13 = false;
        } else {
            var13 = true;
        }
        class234 var14 = new class234(var5, arg2 == 0 && !var13 && !var12, this.field3010 == null, this.field3061 == null, arg1);
        if (arg0 == 4 && arg2 > 3) {
            var14.method1564(256);
            var14.method1586(45, 0, -45);
        }
        int var15 = arg2 & 0x3;
        if (var15 == 1) {
            var14.method1587();
        } else if (var15 == 2) {
            var14.method1570();
        } else if (var15 == 3) {
            var14.method1558();
        }
        if (this.field3010 != null) {
            for (int var16 = 0; var16 < this.field3010.length; var16++) {
                if (this.field3046 == null || var16 >= this.field3046.length) {
                    var14.method1565(this.field3010[var16], this.field3017[var16]);
                } else {
                    var14.method1565(this.field3010[var16], class291.field4585[this.field3046[var16] & 0xFF]);
                }
            }
        }
        if (this.field3061 != null) {
            for (int var17 = 0; var17 < this.field3061.length; var17++) {
                var14.method1571(this.field3061[var17], this.field2993[var17]);
            }
        }
        if (var13) {
            var14.method1580(this.field2986, this.field3012, this.field3042);
        }
        if (var12) {
            var14.method1586(this.field3036, this.field3065, this.field2990);
        }
        return var14;
    }
}
