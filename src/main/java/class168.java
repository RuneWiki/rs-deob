import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class168 implements class144 {

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Z")
    private boolean field2889 = true;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field2879 = -1;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "Lqe;")
    private static class168 field2894 = class66.method448("Allocated memory", -128);

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lqe;")
    public static class168 field2909 = field2894;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lwc;")
    public static class232 field2863 = new class232(128);

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field2912 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field2919;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field2920;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "[B")
    public byte[] field2904;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method1069(int arg0, Applet arg1) throws Throwable {
        field2918++;
        if (arg0 != 19569) {
            return null;
        }
        String var3 = new String(this.field2904, 0, this.field2870);
        Object var4 = class40.method279((byte) 63, arg1, null, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class119.method812((byte) -51, var5.length, 0, var5);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lqe;")
    public final class168 method1070(int arg0) {
        field2874++;
        if (!this.field2889) {
            throw new IllegalArgumentException();
        }
        this.field2881 = 0;
        if (arg0 != -14668) {
            this.method1097(-58, null, -8);
        }
        if (this.field2904.length != this.field2870) {
            byte[] var2 = new byte[this.field2870];
            class22.method114(this.field2904, 0, var2, 0, this.field2870);
            this.field2904 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Ljava/net/URL;")
    public final URL method1071(int arg0) throws MalformedURLException {
        field2866++;
        if (arg0 != -2010182716) {
            this.field2889 = false;
        }
        return new URL(new String(this.field2904, 0, this.field2870));
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;B)I")
    public final int method1072(class168 arg0, byte arg1) {
        field2867++;
        int var3;
        if (arg0.field2870 >= this.field2870) {
            var3 = this.field2870;
        } else {
            var3 = arg0.field2870;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class44.field575[arg0.field2904[var4] & 0xFF] > class44.field575[this.field2904[var4] & 0xFF]) {
                return -1;
            }
            if (class44.field575[arg0.field2904[var4] & 0xFF] < class44.field575[this.field2904[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1 < 12) {
            this.method1115(null, 31);
        }
        if (this.field2870 < arg0.field2870) {
            return -1;
        } else if (this.field2870 > arg0.field2870) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lqe;")
    public final class168 method1073(boolean arg0) {
        field2913++;
        class168 var2 = new class168();
        if (arg0) {
            field2863 = null;
        }
        var2.field2870 = this.field2870;
        var2.field2904 = new byte[this.field2870];
        for (int var3 = 0; var3 < this.field2870; var3++) {
            byte var4 = this.field2904[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2904[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;BI)I")
    public final int method1074(class168 arg0, byte arg1, int arg2) {
        field2892++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg0.field2870];
        int[] var6 = new int[arg0.field2870];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg0.field2870;
        }
        for (int var8 = 1; var8 <= arg0.field2870; var8++) {
            var5[var8 - 1] = (arg0.field2870 << 1) - var8;
            var4[class86.method571(arg0.field2904[var8 - 1], 255)] = arg0.field2870 - var8;
        }
        int var9 = arg0.field2870 + 1;
        int var10 = arg0.field2870;
        if (arg1 != 61) {
            this.field2870 = -25;
        }
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg0.field2870 >= var9 && arg0.field2904[var9 - 1] != arg0.field2904[var10 - 1]) {
                if (arg0.field2870 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg0.field2870 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
            var10--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = 0;
        int var14 = arg0.field2870 + 1 - var9;
        int var15 = 1;
        while (var14 >= var15) {
            var6[var15 - 1] = var13;
            while (var13 >= 1 && arg0.field2904[var15 - 1] != arg0.field2904[var13 - 1]) {
                var13 = var6[var13 - 1];
            }
            var15++;
            var13++;
        }
        while (arg0.field2870 > var12) {
            for (int var18 = var11; var18 <= var12; var18++) {
                if (arg0.field2870 + var12 - var18 <= var5[var18 + -1]) {
                    var5[var18 - 1] = arg0.field2870 + var12 - var18;
                }
            }
            var11 = var12 + 1;
            var12 = var12 + var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg0.field2870 - 1; var16 < this.field2870; var16 += Math.max(var4[this.field2904[var16] & 0xFF], var5[var17])) {
            for (var17 = arg0.field2870 - 1; var17 >= 0 && this.field2904[var16] == arg0.field2904[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)Z")
    public final boolean method1075(int arg0) {
        field2869++;
        if (arg0 != 10) {
            this.method1076(-43, -52);
        }
        return this.method1118(-15705, 10);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lqe;")
    public final class168 method1076(int arg0, int arg1) {
        field2868++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field2889) {
            this.field2881 = 0;
            if (arg0 != 729) {
                this.field2904 = null;
            }
            if (this.field2904.length == this.field2870) {
                int var3;
                for (var3 = 1; var3 <= this.field2870; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class22.method114(this.field2904, 0, var4, 0, this.field2870);
                this.field2904 = var4;
            }
            this.field2904[this.field2870++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILqe;)Z")
    public final boolean method1077(int arg0, class168 arg1) {
        field2901++;
        if (this.field2870 < arg1.field2870) {
            return false;
        }
        if (arg0 != -91) {
            this.method1120(65, 92);
        }
        int var3 = this.field2870 - arg1.field2870;
        for (int var4 = 0; var4 < arg1.field2870; var4++) {
            if (this.field2904[var3 + var4] != arg1.field2904[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)Lqe;")
    public final class168 method1078(int arg0, byte arg1, int arg2) {
        class168 var4 = new class168();
        field2885++;
        var4.field2904 = new byte[arg2 - arg0];
        if (arg1 == -75) {
            var4.field2870 = arg2 - arg0;
            class22.method114(this.field2904, arg0, var4.field2904, 0, var4.field2870);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)J")
    private final long method1079(byte arg0) {
        field2861++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != 40) {
            return 5L;
        }
        while (this.field2870 > var4) {
            var2 = (var2 << 5) + (long) (this.field2904[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
    public final int method1080(int arg0) {
        field2919++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -15108) {
            this.method1083(null, 28, -4, -48);
        }
        while (var3 < this.field2870) {
            var2 = (var2 << 5) + (this.field2904[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)[B")
    public final byte[] method1081(int arg0) {
        int var2 = -47 / ((77 - arg0) / 37);
        byte[] var3 = new byte[this.field2870];
        class22.method114(this.field2904, 0, var3, 0, this.field2870);
        field2886++;
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method1082(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 != -14734) {
            this.field2870 = -79;
        }
        field2860++;
        String var5;
        try {
            var5 = new String(this.field2904, 0, this.field2870, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2904, 0, this.field2870);
        }
        arg2.drawString(var5, arg0, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;III)Lqe;")
    public final class168 method1083(class168 arg0, int arg1, int arg2, int arg3) {
        field2884++;
        if (!this.field2889) {
            throw new IllegalArgumentException();
        } else if (arg2 >= 0 && arg2 <= arg3 && arg0.field2870 >= arg3) {
            this.field2881 = 0;
            if (arg1 != -58) {
                field2863 = null;
            }
            if (this.field2904.length < this.field2870 + arg3 - arg2) {
                int var5;
                for (var5 = 1; var5 < this.field2870 + arg0.field2870; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class22.method114(this.field2904, 0, var6, 0, this.field2870);
                this.field2904 = var6;
            }
            class22.method114(arg0.field2904, arg2, this.field2904, this.field2870, arg3 - arg2);
            this.field2870 += arg3 - arg2;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)J")
    public final long method1084(int arg0) {
        field2891++;
        long var2 = 0L;
        if (arg0 != 32383) {
            return 122L;
        }
        for (int var4 = 0; this.field2870 > var4 && var4 < 12; var4++) {
            byte var5 = this.field2904[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I")
    public final int method1085(byte arg0) {
        if (arg0 > -105) {
            return -60;
        } else {
            field2898++;
            return this.method1112(10, 65);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lqe;")
    public final class168 method1086(byte arg0) {
        field2859++;
        int var2;
        for (var2 = 0; this.field2870 > var2 && (this.field2904[var2] >= 0 && this.field2904[var2] <= 32 || (this.field2904[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field2870; var3 > var2 && (this.field2904[var3 - 1] >= 0 && this.field2904[var3 - 1] <= 32 || (this.field2904[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field2870 == var3) {
            return this;
        }
        class168 var4 = new class168();
        var4.field2870 = var3 - var2;
        var4.field2904 = new byte[var4.field2870];
        int var5 = 0;
        if (arg0 > -111) {
            return null;
        }
        while (var5 < var4.field2870) {
            var4.field2904[var5] = this.field2904[var2 + var5];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2893++;
        if (!(arg0 instanceof class168)) {
            throw new IllegalArgumentException();
        }
        return this.method1111(104, (class168) arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/applet/Applet;B)Lqe;")
    public final class168 method1087(Applet arg0, byte arg1) {
        String var3 = new String(this.field2904, 0, this.field2870);
        field2914++;
        if (arg1 != 13) {
            field2912 = 124;
        }
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class13.method46(var4, false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Loe;Loe;Loe;Loe;B)V")
    public static final void method1088(class256 arg0, class256 arg1, class256 arg2, class256 arg3, byte arg4) {
        class150.field2608 = arg2;
        class6.field72 = arg0;
        class62.field851 = arg3;
        field2899++;
        class221.field3802 = arg1;
        int var5 = -117 / ((arg4 + 39) / 36);
        class108.field1741 = new class129[class62.field851.method1698(125)][];
        class169.field2938 = new boolean[class62.field851.method1698(-95)];
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(IBI)I")
    public final int method1089(int arg0, byte arg1, int arg2) {
        field2856++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field2870; var5++) {
            if (this.field2904[var5] == var4) {
                return var5;
            }
        }
        if (arg1 <= 102) {
            field2912 = 113;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;I)Lqe;")
    public final class168 method1090(class168 arg0, int arg1) {
        field2875++;
        if (!this.field2889) {
            throw new IllegalArgumentException();
        }
        this.field2881 = 0;
        if (arg1 != 40) {
            this.method1107(-123);
        }
        if (this.field2904.length < this.field2870 + arg0.field2870) {
            int var3;
            for (var3 = 1; var3 < this.field2870 + arg0.field2870; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class22.method114(this.field2904, 0, var4, 0, this.field2870);
            this.field2904 = var4;
        }
        class22.method114(arg0.field2904, 0, this.field2904, this.field2870, arg0.field2870);
        this.field2870 += arg0.field2870;
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[Lqe;")
    public final class168[] method1091(int arg0, int arg1) {
        field2905++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2870; var4++) {
            if (this.field2904[var4] == arg1) {
                var3++;
            }
        }
        class168[] var5 = new class168[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        } else if (arg0 >= -58) {
            return null;
        } else {
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < var3; var8++) {
                int var9;
                for (var9 = 0; this.field2904[var6 + var9] != arg1; var9++) {
                }
                var5[var7++] = this.method1078(var6, (byte) -75, var6 + var9);
                var6 += var9 + 1;
            }
            var5[var3] = this.method1078(var6, (byte) -75, this.field2870);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;")
    public final URL method1092(URL arg0, byte arg1) throws MalformedURLException {
        field2864++;
        if (arg1 != 38) {
            this.method1083(null, 4, -82, 25);
        }
        return new URL(arg0, new String(this.field2904, 0, this.field2870));
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)Lqe;")
    public final class168 method1093(byte arg0) {
        field2908++;
        class168 var2 = class80.method532(this.method1084(32383), (byte) -75);
        if (arg0 > -100) {
            return null;
        } else if (var2 == null) {
            return class165.field2813;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
    public final void method1094(int arg0) {
        field2917++;
        if (arg0 != -31400) {
            field2909 = null;
        }
        String var2;
        try {
            var2 = new String(this.field2904, 0, this.field2870, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field2904, 0, this.field2870);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;Z)Z")
    public final boolean method1095(class168 arg0, boolean arg1) {
        field2903++;
        if (arg0.field2870 > this.field2870) {
            return false;
        }
        int var3 = 0;
        if (!arg1) {
            return true;
        }
        while (arg0.field2870 > var3) {
            if (this.field2904[var3] != arg0.field2904[var3]) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)[B")
    public final byte[] method1096(int arg0) {
        field2911++;
        if (this.field2870 == 0) {
            return new byte[0];
        }
        if (arg0 != 1) {
            field2879 = -4;
        }
        int var2 = this.field2870 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (this.field2870 <= var2 - 2 || class189.method1224(this.field2904[var2 - 2], 0) == -1) {
            var3 -= 2;
        } else if (this.field2870 <= var2 - 1 || class189.method1224(this.field2904[var2 - 1], 0) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method1097(0, var4, arg0 + 13983);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[BI)I")
    private final int method1097(int arg0, byte[] arg1, int arg2) {
        field2862++;
        int var4 = arg0;
        if (arg2 != 13984) {
            return -13;
        }
        for (int var5 = 0; var5 < this.field2870; var5 += 4) {
            int var6 = class189.method1224(this.field2904[var5], arg2 ^ 0x36A0);
            int var7 = var5 + 1 < this.field2870 ? class189.method1224(this.field2904[var5 + 1], arg2 - 13984) : -1;
            int var8 = this.field2870 <= var5 + 2 ? -1 : class189.method1224(this.field2904[var5 + 2], 0);
            int var9 = this.field2870 <= var5 + 3 ? -1 : class189.method1224(this.field2904[var5 + 3], 0);
            arg1[arg0++] = (byte) class102.method675(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class102.method675(class86.method571(15, var7) << 4, var8 >>> 2);
            if (var9 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class102.method675(class86.method571(var8 << 6, 192), var9);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)I")
    public final int method1098(int arg0, int arg1) {
        if (arg0 != -29592) {
            this.field2881 = 51;
        }
        field2865++;
        return this.method1089(arg1, (byte) 108, 0);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)Lqe;")
    public final class168 method1099(int arg0, int arg1) {
        field2880++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class168 var3 = new class168();
        var3.field2904 = new byte[this.field2870 + 1];
        var3.field2870 = this.field2870 + arg0;
        class22.method114(this.field2904, 0, var3.field2904, 0, this.field2870);
        var3.field2904[this.field2870] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(IBI)Lqe;")
    public final class168 method1100(int arg0, byte arg1, int arg2) {
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg2;
        if (arg1 != -72) {
            return null;
        }
        field2897++;
        class168 var6 = new class168();
        var6.field2870 = this.field2870;
        var6.field2904 = new byte[this.field2870];
        for (int var7 = 0; var7 < this.field2870; var7++) {
            byte var8 = this.field2904[var7];
            if (var4 == var8) {
                var6.field2904[var7] = var5;
            } else {
                var6.field2904[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLqe;)Z")
    public final boolean method1101(byte arg0, class168 arg1) {
        field2895++;
        if (arg1.field2870 > this.field2870) {
            return false;
        }
        if (arg0 > -24) {
            this.field2904 = null;
        }
        for (int var3 = 0; var3 < arg1.field2870; var3++) {
            byte var4 = this.field2904[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field2904[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2907++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method1102(int arg0, FontMetrics arg1) {
        field2915++;
        if (arg0 <= 65) {
            return 25;
        }
        String var3;
        try {
            var3 = new String(this.field2904, 0, this.field2870, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2904, 0, this.field2870);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)Lqe;")
    public final class168 method1103(boolean arg0) {
        field2857++;
        class168 var2 = new class168();
        var2.field2870 = this.field2870;
        byte var3 = 2;
        var2.field2904 = new byte[this.field2870];
        if (arg0) {
            field2909 = null;
        }
        for (int var4 = 0; var4 < this.field2870; var4++) {
            byte var5 = this.field2904[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field2904[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lqe;Z)I")
    public final int method1104(class168 arg0, boolean arg1) {
        field2878++;
        return arg1 ? this.method1074(arg0, (byte) 61, 0) : -32;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(II)Lqe;")
    public static final class168 method1105(int arg0, int arg1) {
        if (arg0 != 17283) {
            field2879 = -79;
        }
        field2896++;
        class168 var2 = new class168();
        var2.field2870 = 0;
        var2.field2904 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILqe;)Z")
    public final boolean method1106(int arg0, class168 arg1) {
        field2900++;
        if (arg1 == null) {
            return false;
        } else if (this.field2870 == arg1.field2870) {
            for (int var3 = 0; var3 < this.field2870; var3++) {
                byte var4 = arg1.field2904[var3];
                byte var5 = this.field2904[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 > -8) {
                this.field2889 = true;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)Lqe;")
    public final class168 method1107(int arg0) {
        field2876++;
        long var2 = this.method1079((byte) 40);
        synchronized (field2920 == null ? (field2920 = method1121("qe")) : field2920) {
            if (class155.field2711 == null) {
                class155.field2711 = new class236(4096);
            } else {
                for (class253 var5 = (class253) class155.field2711.method1527(var2, (byte) -105); var5 != null; var5 = (class253) class155.field2711.method1532((byte) -103)) {
                    if (this.method1111(59, var5.field4381)) {
                        return var5.field4381;
                    }
                }
            }
            class253 var7 = new class253();
            if (arg0 != 0) {
                this.method1091(78, 100);
            }
            this.field2889 = false;
            var7.field4381 = this;
            class155.field2711.method1533(var2, arg0 + 28, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
    public final void method1108(int arg0, byte arg1) {
        field2888++;
        this.field2881 = 0;
        if (!this.field2889) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field2904.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class22.method114(this.field2904, 0, var4, 0, this.field2870);
                this.field2904 = var4;
            }
            for (int var5 = this.field2870; var5 < arg0; var5++) {
                this.field2904[var5] = 32;
            }
            this.field2870 = arg0;
            if (arg1 <= 89) {
                field2879 = -93;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)I")
    public final int method1109(byte arg0) {
        if (arg0 <= 19) {
            return -25;
        } else {
            field2858++;
            return this.field2870;
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(II)I")
    public final int method1110(int arg0, int arg1) {
        field2877++;
        return arg0 == 255 ? this.field2904[arg1] & 0xFF : 126;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(ILqe;)Z")
    public final boolean method1111(int arg0, class168 arg1) {
        field2883++;
        if (arg1 == null) {
            return false;
        } else if (this.field2870 == arg1.field2870) {
            if (arg0 < 57) {
                this.field2870 = -105;
            }
            if (!this.field2889 || !arg1.field2889) {
                if (this.field2881 == 0) {
                    this.field2881 = this.method1080(-15108);
                    if (this.field2881 == 0) {
                        this.field2881 = 1;
                    }
                }
                if (arg1.field2881 == 0) {
                    arg1.field2881 = arg1.method1080(-15108);
                    if (arg1.field2881 == 0) {
                        arg1.field2881 = 1;
                    }
                }
                if (this.field2881 != arg1.field2881) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2870; var3++) {
                if (this.field2904[var3] != arg1.field2904[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(II)I")
    public final int method1112(int arg0, int arg1) {
        field2871++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        if (arg1 != 65) {
            this.field2870 = -108;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2870; var6++) {
            int var7 = this.field2904[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII[BI)I")
    public final int method1113(byte arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field2887++;
        class22.method114(this.field2904, arg4, arg3, arg1, arg2 - arg4);
        int var6 = -77 / ((arg0 + 5) / 61);
        return arg2 - arg4;
    }

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)V")
    public static void method1114(int arg0) {
        if (arg0 == -31581) {
            field2894 = null;
            field2863 = null;
            field2909 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lqe;I)I")
    public final int method1115(class168 arg0, int arg1) {
        if (arg1 <= 35) {
            this.field2881 = 95;
        }
        field2906++;
        int var3;
        if (this.field2870 <= arg0.field2870) {
            var3 = this.field2870;
        } else {
            var3 = arg0.field2870;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field2904[var4] & 0xFF) > (this.field2904[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field2904[var4] & 0xFF) < (this.field2904[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field2870 > this.field2870) {
            return -1;
        } else if (this.field2870 > arg0.field2870) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "(I)Lqe;")
    public final class168 method1116(int arg0) {
        class168 var2 = new class168();
        field2910++;
        boolean var3 = true;
        var2.field2870 = this.field2870;
        var2.field2904 = new byte[this.field2870];
        for (int var4 = arg0; var4 < this.field2870; var4++) {
            byte var5 = this.field2904[var4];
            if (var5 == 95) {
                var2.field2904[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field2904[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field2904[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lnh;I)Lre;")
    public static final class73 method1117(class112 arg0, int arg1) {
        field2872++;
        if (arg1 != 1) {
            field2863 = null;
        }
        return new class73(arg0.method740(arg1 ^ 0xFF0001), arg0.method740(16711680), arg0.method740(16711680), arg0.method740(16711680), arg0.method740(16711680), arg0.method740(16711680), arg0.method740(arg1 ^ 0xFF0001), arg0.method740(16711680), arg0.method727(arg1 ^ 0xFFFF941C), arg0.method758(true));
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(II)Z")
    private final boolean method1118(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        field2882++;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != -15705) {
            this.toString();
        }
        for (int var6 = 0; var6 < this.field2870; var6++) {
            int var7 = this.field2904[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method1119(Applet arg0, int arg1) throws Throwable {
        field2890++;
        String var3 = new String(this.field2904, arg1, this.field2870);
        class40.method280(var3, arg0, (byte) 48);
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(II)Lqe;")
    public final class168 method1120(int arg0, int arg1) {
        field2902++;
        if (arg1 < 20) {
            field2909 = null;
        }
        return this.method1078(arg0, (byte) -75, this.field2870);
    }

    @OriginalMember(owner = "client!qe", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2873++;
        return this.method1080(-15108);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1121(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
