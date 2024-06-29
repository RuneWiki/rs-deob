import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class179 implements class210 {

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Z")
    private boolean field3275 = true;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[J")
    public static long[] field3262 = new long[100];

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lqe;")
    public static class179 field3276 = class206.method1380("leuchten1:", (byte) 56);

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "[[S")
    public static short[][] field3279 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    private int field3272;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lee;")
    public static class49 field3251;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field3299;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[B")
    public byte[] field3256;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public final int method1122(int arg0, int arg1, int arg2) {
        field3281++;
        byte var4 = (byte) arg1;
        for (int var5 = arg0; var5 < this.field3277; var5++) {
            if (this.field3256[var5] == var4) {
                return var5;
            }
        }
        return arg2 == -1 ? -1 : 119;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Leh;Z)V")
    public static final void method1123(class52 arg0, boolean arg1) {
        if (!arg1) {
            class102.field1949 = arg0;
            field3249++;
            class207.field3874 = class102.field1949.method336((byte) -117, 16);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;Z)I")
    public final int method1124(class179 arg0, boolean arg1) {
        field3283++;
        int var3;
        if (arg0.field3277 >= this.field3277) {
            var3 = this.field3277;
        } else {
            var3 = arg0.field3277;
        }
        if (arg1) {
            field3279 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class167.field3003[this.field3256[var4] & 0xFF] < class167.field3003[arg0.field3256[var4] & 0xFF]) {
                return -1;
            }
            if (class167.field3003[arg0.field3256[var4] & 0xFF] < class167.field3003[this.field3256[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field3277 < arg0.field3277) {
            return -1;
        } else if (arg0.field3277 < this.field3277) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;II)I")
    public final int method1125(class179 arg0, int arg1, int arg2) {
        field3245++;
        int[] var4 = new int[arg0.field3277];
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field3277];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg0.field3277;
        }
        int var8 = 1;
        if (arg1 < 78) {
            field3279 = null;
        }
        while (arg0.field3277 >= var8) {
            var4[var8 - 1] = (arg0.field3277 << 1) - var8;
            var5[class107.method696(arg0.field3256[var8 - 1], 255)] = arg0.field3277 - var8;
            var8++;
        }
        int var9 = arg0.field3277 + 1;
        int var10 = arg0.field3277;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg0.field3277 && arg0.field3256[var9 - 1] != arg0.field3256[var10 - 1]) {
                if (arg0.field3277 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg0.field3277 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg0.field3277 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field3256[var14 - 1] != arg0.field3256[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg0.field3277) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg0.field3277 + var11 - var18) {
                    var4[var18 - 1] = var11 + arg0.field3277 - var18;
                }
            }
            var13 = var11 + 1;
            var11 += var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg0.field3277 + arg2 - 1; var16 < this.field3277; var16 += Math.max(var5[this.field3256[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field3277 - 1; var17 >= 0 && this.field3256[var16] == arg0.field3256[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)J")
    private final long method1126(boolean arg0) {
        long var2 = 0L;
        field3297++;
        for (int var4 = 0; var4 < this.field3277; var4++) {
            var2 = (var2 << 5) + (long) (this.field3256[var4] & 0xFF) - var2;
        }
        if (arg0) {
            field3251 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)Lqe;")
    public final class179 method1127(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field3251 = null;
        }
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class179 var6 = new class179();
        field3242++;
        var6.field3277 = this.field3277;
        var6.field3256 = new byte[this.field3277];
        for (int var7 = 0; var7 < this.field3277; var7++) {
            byte var8 = this.field3256[var7];
            if (var4 == var8) {
                var6.field3256[var7] = var5;
            } else {
                var6.field3256[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILqe;)I")
    public final int method1128(int arg0, class179 arg1) {
        field3287++;
        if (arg0 != 0) {
            this.method1152((byte) -60, 45);
        }
        return this.method1125(arg1, 126, 0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method1129(FontMetrics arg0, int arg1) {
        field3274++;
        String var3;
        try {
            var3 = new String(this.field3256, arg1, this.field3277, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3256, 0, this.field3277);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public final void method1130(byte arg0) {
        String var2;
        try {
            var2 = new String(this.field3256, 0, this.field3277, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field3256, 0, this.field3277);
        }
        field3271++;
        System.out.println(var2);
        int var3 = -43 / ((arg0 + 11) / 63);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lqe;")
    public final class179 method1131(byte arg0) {
        field3267++;
        class179 var2 = new class179();
        var2.field3277 = this.field3277;
        var2.field3256 = new byte[this.field3277];
        for (int var3 = 0; var3 < this.field3277; var3++) {
            var2.field3256[var3] = 42;
        }
        return arg0 == 3 ? var2 : null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;I)I")
    public final int method1132(class179 arg0, int arg1) {
        field3295++;
        int var3;
        if (arg0.field3277 >= this.field3277) {
            var3 = this.field3277;
        } else {
            var3 = arg0.field3277;
        }
        if (arg1 != 1) {
            this.method1157(null, (byte) -52);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field3256[var4] & 0xFF) < (arg0.field3256[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field3256[var4] & 0xFF) > (arg0.field3256[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field3277 < arg0.field3277) {
            return -1;
        } else if (arg0.field3277 < this.field3277) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lra;I)Lqe;")
    public static final class179 method1133(class185 arg0, int arg1) {
        int var2 = 2 / ((-arg1 - 20) / 52);
        field3289++;
        return class147.method943(arg0, -26, 32767);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        field3292++;
        if (arg0 < 118) {
            field3251 = null;
        }
        class15.field422.method1297((byte) 89);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/net/URL;)Ljava/net/URL;")
    public final URL method1135(byte arg0, URL arg1) throws MalformedURLException {
        field3248++;
        if (arg0 > -14) {
            this.field3272 = -12;
        }
        return new URL(arg1, new String(this.field3256, 0, this.field3277));
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lqe;I)Z")
    public final boolean method1136(class179 arg0, int arg1) {
        if (arg1 < 99) {
            return true;
        }
        field3298++;
        if (arg0.field3277 > this.field3277) {
            return false;
        }
        int var3 = this.field3277 - arg0.field3277;
        for (int var4 = 0; var4 < arg0.field3277; var4++) {
            if (this.field3256[var3 + var4] != arg0.field3256[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)J")
    public final long method1137(int arg0) {
        field3278++;
        long var2 = 0L;
        if (arg0 <= 69) {
            return 48L;
        }
        for (int var4 = 0; var4 < this.field3277 && var4 < 12; var4++) {
            byte var5 = this.field3256[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLqe;)Z")
    public final boolean method1138(boolean arg0, class179 arg1) {
        field3270++;
        if (arg0) {
            this.field3272 = 9;
        }
        if (arg1 == null) {
            return false;
        } else if (this.field3277 == arg1.field3277) {
            for (int var3 = 0; var3 < this.field3277; var3++) {
                byte var4 = this.field3256[var3];
                byte var5 = arg1.field3256[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I")
    public final int method1139(int arg0) {
        field3264++;
        if (arg0 != 10) {
            this.method1129(null, -78);
        }
        return this.method1152((byte) 92, 10);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lqe;")
    public final class179 method1140(byte arg0) {
        class179 var2 = new class179();
        boolean var3 = true;
        var2.field3277 = this.field3277;
        field3293++;
        var2.field3256 = new byte[this.field3277];
        for (int var4 = 0; var4 < this.field3277; var4++) {
            byte var5 = this.field3256[var4];
            if (var5 == 95) {
                var2.field3256[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field3256[var4] = (byte) (var5 - 32);
            } else {
                var2.field3256[var4] = var5;
                var3 = false;
            }
        }
        if (arg0 != 32) {
            this.field3277 = 27;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Lqe;")
    public final class179 method1141(byte arg0, int arg1) {
        field3253++;
        if (arg0 > -120) {
            return null;
        } else if (arg1 > 0 && arg1 <= 255) {
            class179 var3 = new class179();
            var3.field3256 = new byte[this.field3277 + 1];
            var3.field3277 = this.field3277 + 1;
            class154.method989(this.field3256, 0, var3.field3256, 0, this.field3277);
            var3.field3256[this.field3277] = (byte) arg1;
            return var3;
        } else {
            throw new IllegalArgumentException("invalid char");
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lqe;B)Z")
    public final boolean method1142(class179 arg0, byte arg1) {
        field3266++;
        if (arg0 == null) {
            return false;
        } else if (this.field3277 == arg0.field3277) {
            if (!this.field3275 || !arg0.field3275) {
                if (this.field3272 == 0) {
                    this.field3272 = this.method1165(23458);
                    if (this.field3272 == 0) {
                        this.field3272 = 1;
                    }
                }
                if (arg0.field3272 == 0) {
                    arg0.field3272 = arg0.method1165(23458);
                    if (arg0.field3272 == 0) {
                        arg0.field3272 = 1;
                    }
                }
                if (this.field3272 != arg0.field3272) {
                    return false;
                }
            }
            if (arg1 >= -6) {
                field3251 = null;
            }
            for (int var3 = 0; var3 < this.field3277; var3++) {
                if (this.field3256[var3] != arg0.field3256[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Lqe;")
    public final class179 method1143(int arg0) {
        int var2 = 0;
        int var3 = this.field3277;
        while (var2 < this.field3277 && (this.field3256[var2] >= 0 && this.field3256[var2] <= 32 || (this.field3256[var2] & 0xFF) == 160)) {
            var2++;
        }
        field3257++;
        while (var3 > var2 && (this.field3256[var3 - 1] >= 0 && this.field3256[var3 - 1] <= 32 || (this.field3256[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (arg0 <= 110) {
            this.method1149((byte) -47, -35);
        }
        if (var2 == 0 && this.field3277 == var3) {
            return this;
        }
        class179 var4 = new class179();
        var4.field3277 = var3 - var2;
        var4.field3256 = new byte[var4.field3277];
        for (int var5 = 0; var5 < var4.field3277; var5++) {
            var4.field3256[var5] = this.field3256[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static void method1144(byte arg0) {
        field3262 = null;
        field3276 = null;
        field3279 = null;
        field3251 = null;
        if (arg0 != 12) {
            method1133(null, 92);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[Lqe;")
    public final class179[] method1145(int arg0, int arg1) {
        field3288++;
        int var3 = 0;
        if (arg1 != -11381) {
            method1144((byte) -101);
        }
        for (int var4 = 0; var4 < this.field3277; var4++) {
            if (this.field3256[var4] == arg0) {
                var3++;
            }
        }
        class179[] var5 = new class179[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field3256[var7 + var9] != arg0; var9++) {
            }
            var5[var6++] = this.method1156(-5684, var7 + var9, var7);
            var7 += var9 + 1;
        }
        var5[var3] = this.method1156(-5684, this.field3277, var7);
        return var5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III[BI)I")
    public final int method1146(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field3244++;
        if (arg2 > -101) {
            return -9;
        } else {
            class154.method989(this.field3256, arg1, arg3, arg4, arg0 - arg1);
            return arg0 - arg1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Z")
    public final boolean method1147(int arg0) {
        field3290++;
        if (arg0 != -21185) {
            this.method1146(-38, 105, 43, null, 57);
        }
        return this.method1153((byte) -42, 10);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/applet/Applet;I)V")
    public final void method1148(Applet arg0, int arg1) throws Throwable {
        field3246++;
        String var3 = new String(this.field3256, arg1, this.field3277);
        class181.method1186(true, arg0, var3);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(BI)Lqe;")
    public final class179 method1149(byte arg0, int arg1) {
        field3285++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field3275) {
            this.field3272 = 0;
            if (this.field3256.length == this.field3277) {
                int var3;
                for (var3 = 1; var3 <= this.field3277; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class154.method989(this.field3256, 0, var4, 0, this.field3277);
                this.field3256 = var4;
            }
            this.field3256[this.field3277++] = (byte) arg1;
            int var5 = -16 % ((77 - arg0) / 35);
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)Lqe;")
    public final class179 method1150(int arg0) {
        field3273++;
        if (!this.field3275) {
            throw new IllegalArgumentException();
        }
        this.field3272 = arg0;
        if (this.field3256.length != this.field3277) {
            byte[] var2 = new byte[this.field3277];
            class154.method989(this.field3256, 0, var2, 0, this.field3277);
            this.field3256 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLeh;)V")
    public static final void method1151(byte arg0, class52 arg1) {
        field3284++;
        int var2 = 83 / ((arg0 - 15) / 61);
        class152.field2763 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(BI)I")
    public final int method1152(byte arg0, int arg1) {
        field3239++;
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 5 % ((-arg0 - 35) / 42);
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field3277; var7++) {
            int var8 = this.field3256[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (var8 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var6 + var8;
            if (var9 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var9;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(BI)Z")
    private final boolean method1153(byte arg0, int arg1) {
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field3243++;
        if (arg0 >= -24) {
            field3276 = null;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3277; var6++) {
            int var7 = this.field3256[var6] & 0xFF;
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
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V")
    public static final void method1154(byte arg0) {
        class229 var1 = (class229) class216.field4000.method242(16711680);
        if (arg0 != -39) {
            method1144((byte) -69);
        }
        while (var1 != null) {
            if (var1.field4228 != null) {
                var1.method1508(-14067);
            }
            var1 = (class229) class216.field4000.method237(10);
        }
        field3247++;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(Lqe;I)Z")
    public final boolean method1155(class179 arg0, int arg1) {
        field3250++;
        if (arg0.field3277 > this.field3277) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field3277; var3++) {
            if (this.field3256[var3] != arg0.field3256[var3]) {
                return false;
            }
        }
        if (arg1 != -1721) {
            this.method1139(-42);
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)Lqe;")
    public final class179 method1156(int arg0, int arg1, int arg2) {
        if (arg0 != -5684) {
            field3276 = null;
        }
        class179 var4 = new class179();
        var4.field3277 = arg1 - arg2;
        var4.field3256 = new byte[arg1 - arg2];
        field3294++;
        class154.method989(this.field3256, arg2, var4.field3256, 0, var4.field3277);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lqe;B)Lqe;")
    public final class179 method1157(class179 arg0, byte arg1) {
        field3265++;
        if (!this.field3275) {
            throw new IllegalArgumentException();
        }
        this.field3272 = 0;
        int var3 = 55 / ((14 - arg1) / 41);
        if (this.field3277 + arg0.field3277 > this.field3256.length) {
            int var4;
            for (var4 = 1; var4 < this.field3277 + arg0.field3277; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class154.method989(this.field3256, 0, var5, 0, this.field3277);
            this.field3256 = var5;
        }
        class154.method989(arg0.field3256, 0, this.field3256, this.field3277, arg0.field3277);
        this.field3277 += arg0.field3277;
        return this;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)[B")
    public final byte[] method1158(int arg0) {
        byte[] var2 = new byte[this.field3277];
        class154.method989(this.field3256, 0, var2, 0, this.field3277);
        field3241++;
        if (arg0 != 29570) {
            this.field3275 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(B)Lqe;")
    public final class179 method1159(byte arg0) {
        field3280++;
        byte var2 = 2;
        class179 var3 = new class179();
        var3.field3277 = this.field3277;
        var3.field3256 = new byte[this.field3277];
        if (arg0 < 121) {
            field3276 = null;
        }
        for (int var4 = 0; var4 < this.field3277; var4++) {
            byte var5 = this.field3256[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field3256[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3261++;
        if (!(arg0 instanceof class179)) {
            throw new IllegalArgumentException();
        }
        return this.method1142((class179) arg0, (byte) -57);
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(B)Lqe;")
    public final class179 method1160(byte arg0) {
        class179 var2 = class12.method82(4, this.method1137(94));
        if (arg0 > -54) {
            return null;
        } else {
            field3263++;
            return var2 == null ? class169.field3048 : var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3258++;
        return this.method1165(23458);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)I")
    public final int method1161(int arg0, byte arg1) {
        int var3 = 39 % (-arg1 / 38);
        field3268++;
        return this.field3256[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(BI)Lqe;")
    public final class179 method1162(byte arg0, int arg1) {
        if (arg0 < 92) {
            return null;
        } else {
            field3286++;
            return this.method1156(-5684, this.field3277, arg1);
        }
    }

    @OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3252++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIBLra;II)V")
    public static final void method1163(int arg0, int arg1, int arg2, int arg3, byte arg4, class185 arg5, int arg6, int arg7) {
        if (arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104) {
            class9.field265[arg7][arg2][arg3] = 0;
            while (true) {
                int var8 = arg5.method1243(arg4 ^ 0xFFFFFFBF);
                if (var8 == 0) {
                    if (arg7 == 0) {
                        class194.field3619[0][arg2][arg3] = -class144.method912(120, arg2 + arg0 + 932731, 556238 - -arg6 + arg3) * 8;
                    } else {
                        class194.field3619[arg7][arg2][arg3] = class194.field3619[arg7 - 1][arg2][arg3] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg5.method1243(3);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg7 == 0) {
                        class194.field3619[0][arg2][arg3] = -var9 * 8;
                    } else {
                        class194.field3619[arg7][arg2][arg3] = class194.field3619[arg7 - 1][arg2][arg3] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class14.field342[arg7][arg2][arg3] = arg5.method1204(false);
                    class10.field286[arg7][arg2][arg3] = (byte) ((var8 - 2) / 4);
                    class78.field1510[arg7][arg2][arg3] = (byte) class107.method696(arg1 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class9.field265[arg7][arg2][arg3] = (byte) (var8 - 49);
                } else {
                    class66.field1340[arg7][arg2][arg3] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg5.method1243(3);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg5.method1243(3);
                    break;
                }
                if (var10 <= 49) {
                    arg5.method1243(arg4 ^ 0xFFFFFFBF);
                }
            }
        }
        if (arg4 == -68) {
            field3269++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/applet/Applet;)Lqe;")
    public final class179 method1164(int arg0, Applet arg1) {
        if (arg0 < 31) {
            return null;
        } else {
            field3255++;
            String var3 = new String(this.field3256, 0, this.field3277);
            String var4 = arg1.getParameter(var3);
            return var4 == null ? null : class136.method867((byte) -126, var4);
        }
    }

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "(I)I")
    public final int method1165(int arg0) {
        field3296++;
        int var2 = 0;
        if (arg0 == 23458) {
            for (int var3 = 0; var3 < this.field3277; var3++) {
                var2 = (this.field3256[var3] & 0xFF) + (var2 << 5) - var2;
            }
            return var2;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(Lqe;I)Z")
    public final boolean method1166(class179 arg0, int arg1) {
        field3291++;
        if (arg0.field3277 > this.field3277) {
            return false;
        }
        int var3 = 0;
        if (arg1 != 40) {
            return false;
        }
        while (var3 < arg0.field3277) {
            byte var4 = this.field3256[var3];
            byte var5 = arg0.field3256[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)Ljava/net/URL;")
    public final URL method1167(boolean arg0) throws MalformedURLException {
        field3240++;
        if (arg0) {
            this.method1132(null, 14);
        }
        return new URL(new String(this.field3256, 0, this.field3277));
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)I")
    public final int method1168(boolean arg0) {
        if (!arg0) {
            this.field3272 = -33;
        }
        field3259++;
        return this.field3277;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public final void method1169(int arg0, int arg1, Graphics arg2, boolean arg3) {
        String var5;
        try {
            if (arg3) {
                this.method1140((byte) -16);
            }
            var5 = new String(this.field3256, 0, this.field3277, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3256, 0, this.field3277);
        }
        field3254++;
        arg2.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "(I)Lqe;")
    public final class179 method1170(int arg0) {
        field3282++;
        class179 var2 = new class179();
        var2.field3277 = this.field3277;
        var2.field3256 = new byte[this.field3277];
        if (arg0 != 40) {
            this.method1161(74, (byte) -127);
        }
        for (int var3 = 0; var3 < this.field3277; var3++) {
            byte var4 = this.field3256[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3256[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(Z)Lqe;")
    public final class179 method1171(boolean arg0) {
        field3260++;
        long var2 = this.method1126(!arg0);
        synchronized (field3299 == null ? (field3299 = method1172("qe")) : field3299) {
            if (class93.field1753 == null) {
                class93.field1753 = new class144(4096);
            } else {
                for (class123 var5 = (class123) class93.field1753.method909(-1, var2); var5 != null; var5 = (class123) class93.field1753.method904((byte) 71)) {
                    if (this.method1142(var5.field2282, (byte) -59)) {
                        return var5.field2282;
                    }
                }
            }
            class123 var7 = new class123();
            this.field3275 = false;
            var7.field2282 = this;
            class93.field1753.method914(var2, var7, arg0);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1172(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
