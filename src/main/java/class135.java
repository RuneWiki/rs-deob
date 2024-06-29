import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class135 implements class81 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    private boolean field3228 = true;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3233 = -1;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[Lbc;")
    public static class11[] field3231 = new class11[1000];

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
    public static boolean field3239 = false;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lu;")
    public static class135 field3248 = class87.method676((byte) -47, "Cabbage");

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lu;")
    public static class135 field3245 = class87.method676((byte) -48, "Ignorieren");

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3244 = 0;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lu;")
    public static class135 field3243 = class87.method676((byte) -61, "titlebutton");

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lu;")
    public static class135 field3254 = class87.method676((byte) -60, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Lu;")
    public static class135 field3277 = class87.method676((byte) -51, "null");

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lu;")
    public static class135 field3249 = class87.method676((byte) -89, ":chalreq:");

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "Lic;")
    public static class59 field3285;

    // $FF: synthetic field
    @OriginalMember(owner = "client!u", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field3287;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "[B")
    public byte[] field3266;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "[I")
    public static int[] field3237;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
    public final int method1063(int arg0) {
        field3265++;
        if (arg0 != -64) {
            field3245 = null;
        }
        return this.field3255;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)J")
    public final long method1064(int arg0) {
        if (arg0 != -22243) {
            this.method1077(-48);
        }
        field3250++;
        long var2 = 0L;
        for (int var4 = 0; this.field3255 > var4 && var4 < 12; var4++) {
            byte var5 = this.field3266[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lu;")
    public final class135 method1065(byte arg0, int arg1) {
        field3274++;
        if (arg0 > -25) {
            this.method1064(124);
        }
        return this.method1074(arg1, this.field3255, -27090);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)Lu;")
    public final class135 method1066(int arg0, boolean arg1) {
        field3282++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field3228) {
            if (!arg1) {
                method1081((byte) 80);
            }
            this.field3252 = 0;
            if (this.field3266.length == this.field3255) {
                int var3;
                for (var3 = 1; var3 <= this.field3255; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class71.method575(this.field3266, 0, var4, 0, this.field3255);
                this.field3266 = var4;
            }
            this.field3266[this.field3255++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
    private final int method1067(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        field3273++;
        if (arg0 != 63) {
            field3248 = null;
        }
        for (int var5 = arg1; var5 < this.field3255; var5++) {
            if (this.field3266[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
    public final int method1068(int arg0, int arg1) {
        int var3 = 28 % ((-arg0 - 74) / 40);
        field3267++;
        return this.method1067(63, 0, arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILu;)Z")
    public final boolean method1069(int arg0, class135 arg1) {
        field3259++;
        if (arg0 != 90) {
            this.field3266 = null;
        }
        if (arg1 == null) {
            return false;
        } else if (this.field3255 == arg1.field3255) {
            for (int var3 = 0; var3 < this.field3255; var3++) {
                byte var4 = this.field3266[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field3266[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
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

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lu;")
    public final class135 method1070(int arg0, int arg1) {
        field3276++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class135 var3 = new class135();
        var3.field3266 = new byte[this.field3255 + 1];
        if (arg1 != 255) {
            this.method1080((byte) 8);
        }
        var3.field3255 = this.field3255 + 1;
        class71.method575(this.field3266, 0, var3.field3266, 0, this.field3255);
        var3.field3266[this.field3255] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)I")
    public final int method1071(int arg0, int arg1) {
        if (arg0 != 61) {
            this.method1093(54);
        }
        field3246++;
        return this.field3266[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
    public final int method1072(int arg0) {
        if (arg0 > -79) {
            this.method1074(113, -112, -45);
        }
        field3235++;
        return this.method1094((byte) -125, 10);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLu;I)Lu;")
    public final class135 method1073(byte arg0, class135 arg1, int arg2) {
        field3270++;
        if (!this.field3228) {
            throw new IllegalArgumentException();
        }
        if (arg0 >= -24) {
            field3248 = null;
        }
        if (arg2 > this.field3255) {
            throw new IllegalArgumentException();
        }
        this.field3252 = 0;
        if (arg2 + arg1.field3255 > this.field3266.length) {
            int var4;
            for (var4 = 1; var4 < arg1.field3255 + arg2; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class71.method575(this.field3266, 0, var5, 0, this.field3255);
            this.field3266 = var5;
        }
        class71.method575(arg1.field3266, 0, this.field3266, arg2, arg1.field3255);
        if (this.field3255 < arg1.field3255 + arg2) {
            this.field3255 = arg1.field3255 + arg2;
        }
        return this;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(III)Lu;")
    public final class135 method1074(int arg0, int arg1, int arg2) {
        field3229++;
        class135 var4 = new class135();
        var4.field3255 = arg1 - arg0;
        if (arg2 == -27090) {
            var4.field3266 = new byte[arg1 - arg0];
            class71.method575(this.field3266, arg0, var4.field3266, 0, var4.field3255);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lu;I)Lu;")
    public final class135 method1075(class135 arg0, int arg1) {
        field3253++;
        if (!this.field3228) {
            throw new IllegalArgumentException();
        }
        this.field3252 = arg1;
        if (this.field3266.length < this.field3255 + arg0.field3255) {
            int var3;
            for (var3 = 1; var3 < this.field3255 + arg0.field3255; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class71.method575(this.field3266, 0, var4, 0, this.field3255);
            this.field3266 = var4;
        }
        class71.method575(arg0.field3266, 0, this.field3266, this.field3255, arg0.field3255);
        this.field3255 += arg0.field3255;
        return this;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public final int method1076(byte arg0) {
        field3257++;
        int var2 = 0;
        if (arg0 == 122) {
            for (int var3 = 0; var3 < this.field3255; var3++) {
                var2 = (var2 << 5) + (this.field3266[var3] & 0xFF) - var2;
            }
            return var2;
        } else {
            return 66;
        }
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)Lu;")
    public final class135 method1077(int arg0) {
        field3284++;
        class135 var2 = new class135();
        int var3 = 0;
        var2.field3255 = 0;
        var2.field3266 = new byte[12];
        if (arg0 > -107) {
            return null;
        }
        for (int var4 = 0; var4 < this.field3255; var4++) {
            if (this.field3266[var4] >= 65 && this.field3266[var4] <= 90) {
                var2.field3266[var3++] = (byte) (this.field3266[var4] + 32);
                var2.field3255 = var3;
            } else if (this.field3266[var4] >= 97 && this.field3266[var4] <= 122 || this.field3266[var4] >= 48 && this.field3266[var4] <= 57) {
                var2.field3266[var3++] = this.field3266[var4];
                var2.field3255 = var3;
            } else if (var3 > 0) {
                var2.field3266[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Lu;")
    public final class135 method1078(int arg0) {
        class135 var2 = new class135();
        field3238++;
        var2.field3255 = this.field3255;
        var2.field3266 = new byte[this.field3255];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field3255; var4++) {
            byte var6 = this.field3266[var4];
            if (var6 >= 97 && var6 <= 122 || var6 >= -32 && var6 <= -2 && var6 != -9) {
                if (var3 == 2) {
                    var6 = (byte) (var6 - 32);
                }
                var3 = 0;
            } else if (var6 >= 65 && var6 <= 90 || !(var6 < -64 || var6 > -34 || var6 == -41)) {
                if (var3 == 0) {
                    var6 = (byte) (var6 + 32);
                }
                var3 = 0;
            } else if (var6 == 46 || var6 == 33 || var6 == 63) {
                var3 = 2;
            } else if (var6 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field3266[var4] = var6;
        }
        int var5 = 111 / ((-arg0 - 2) / 54);
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Ljava/net/URL;")
    public final URL method1079(byte arg0) throws MalformedURLException {
        if (arg0 > -96) {
            this.method1071(93, -97);
        }
        field3272++;
        return new URL(new String(this.field3266, 0, this.field3255));
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lu;")
    public final class135 method1080(byte arg0) {
        field3258++;
        class135 var2 = new class135();
        var2.field3255 = this.field3255;
        if (arg0 != -98) {
            return null;
        }
        var2.field3266 = new byte[this.field3255];
        for (int var3 = 0; var3 < this.field3255; var3++) {
            var2.field3266[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
    public static void method1081(byte arg0) {
        field3249 = null;
        field3248 = null;
        field3254 = null;
        field3231 = null;
        field3277 = null;
        field3243 = null;
        field3245 = null;
        int var1 = 63 % ((arg0 - 4) / 52);
        field3285 = null;
        field3237 = null;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)J")
    private final long method1082(int arg0) {
        field3279++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field3255; var4++) {
            var2 = (var2 << 5) - (var2 - (long) (this.field3266[var4] & 0xFF));
        }
        if (arg0 != -14703) {
            field3254 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI[BI)I")
    public final int method1083(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        field3286++;
        class71.method575(this.field3266, arg2, arg3, arg0, arg4 - arg2);
        return arg1 ? arg4 - arg2 : 16;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method1084(FontMetrics arg0, int arg1) {
        field3251++;
        String var3;
        try {
            var3 = new String(this.field3266, arg1, this.field3255, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3266, 0, this.field3255);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method1085(Graphics arg0, int arg1, int arg2, int arg3) {
        field3275++;
        if (arg2 > -126) {
            this.method1065((byte) -71, 104);
        }
        String var5;
        try {
            var5 = new String(this.field3266, 0, this.field3255, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3266, 0, this.field3255);
        }
        arg0.drawString(var5, arg1, arg3);
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(B)Lu;")
    public final class135 method1086(byte arg0) {
        field3280++;
        int var2 = 0;
        int var3 = this.field3255;
        while (var2 < this.field3255 && (this.field3266[var2] >= 0 && this.field3266[var2] <= 32 || (this.field3266[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field3266[var3 - 1] >= 0 && this.field3266[var3 - 1] <= 32 || (this.field3266[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field3255 == var3) {
            return this;
        }
        class135 var4 = new class135();
        var4.field3255 = var3 - var2;
        var4.field3266 = new byte[var4.field3255];
        int var5 = 33 / ((arg0 - 10) / 36);
        for (int var6 = 0; var6 < var4.field3255; var6++) {
            var4.field3266[var6] = this.field3266[var2 + var6];
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3260++;
        if (!(arg0 instanceof class135)) {
            throw new IllegalArgumentException();
        }
        return this.method1101((class135) arg0, (byte) 97);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lu;B)Z")
    public final boolean method1087(class135 arg0, byte arg1) {
        field3281++;
        if (this.field3255 < arg0.field3255) {
            return false;
        }
        if (arg1 != -52) {
            this.method1101(null, (byte) 66);
        }
        for (int var3 = 0; var3 < arg0.field3255; var3++) {
            if (this.field3266[var3] != arg0.field3266[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(B)Lu;")
    public final class135 method1088(byte arg0) {
        class135 var2 = new class135();
        var2.field3255 = this.field3255;
        var2.field3266 = new byte[this.field3255];
        boolean var3 = true;
        field3269++;
        if (arg0 != 56) {
            this.hashCode();
        }
        for (int var4 = 0; var4 < this.field3255; var4++) {
            byte var5 = this.field3266[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field3266[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field3266[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field3266[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3256++;
        return this.method1076((byte) 122);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Z")
    private final boolean method1089(boolean arg0, int arg1) {
        field3271++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (!arg0) {
            this.method1100(-12, -113, null);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3255; var6++) {
            int var7 = this.field3266[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLu;)I")
    public final int method1090(byte arg0, class135 arg1) {
        field3230++;
        if (arg0 != 64) {
            field3277 = null;
        }
        return this.method1100(-1, 0, arg1);
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(B)Lu;")
    public final class135 method1091(byte arg0) {
        if (arg0 <= 97) {
            return null;
        }
        field3278++;
        long var2 = this.method1082(-14703);
        synchronized (field3287 == null ? (field3287 = method1102("u")) : field3287) {
            if (class116.field2783 == null) {
                class116.field2783 = new class102(4096);
            } else {
                for (class115 var5 = (class115) class116.field2783.method842(var2, 126); var5 != null; var5 = (class115) class116.field2783.method841((byte) -26)) {
                    if (this.method1101(var5.field2756, (byte) 114)) {
                        return var5.field2756;
                    }
                }
            }
            class115 var7 = new class115();
            this.field3228 = false;
            var7.field2756 = this;
            class116.field2783.method836(var2, (byte) 118, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lu;I)Z")
    public final boolean method1092(class135 arg0, int arg1) {
        field3261++;
        if (arg0.field3255 > this.field3255) {
            return false;
        }
        int var3 = this.field3255 - arg0.field3255;
        if (arg1 > -121) {
            this.method1064(-71);
        }
        for (int var4 = 0; var4 < arg0.field3255; var4++) {
            if (this.field3266[var3 + var4] != arg0.field3266[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)[B")
    public final byte[] method1093(int arg0) {
        if (arg0 == 14821) {
            field3232++;
            byte[] var2 = new byte[this.field3255];
            class71.method575(this.field3266, 0, var2, 0, this.field3255);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)I")
    private final int method1094(byte arg0, int arg1) {
        field3262++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3255; var6++) {
            int var7 = this.field3266[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        } else if (arg0 >= -118) {
            return 99;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(B)Z")
    public final boolean method1095(byte arg0) {
        field3236++;
        if (arg0 != 69) {
            field3254 = null;
        }
        return this.method1089(true, 10);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)Lu;")
    public final class135 method1096(boolean arg0) {
        field3247++;
        if (!this.field3228) {
            throw new IllegalArgumentException();
        }
        this.field3252 = 0;
        if (arg0) {
            return null;
        }
        if (this.field3266.length != this.field3255) {
            byte[] var2 = new byte[this.field3255];
            class71.method575(this.field3266, 0, var2, 0, this.field3255);
            this.field3266 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)Lu;")
    public final class135 method1097(int arg0) {
        field3241++;
        class135 var2 = new class135();
        var2.field3255 = this.field3255;
        var2.field3266 = new byte[this.field3255];
        for (int var3 = 0; var3 < this.field3255; var3++) {
            byte var4 = this.field3266[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3266[var3] = var4;
        }
        if (arg0 != -41) {
            this.method1087(null, (byte) -11);
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(II)I")
    public static final int method1098(int arg0, int arg1) {
        class17 var2 = class139.method1127(arg0, -1782);
        field3234++;
        int var3 = var2.field371;
        int var4 = var2.field370;
        int var5 = 118 % ((arg1 + 12) / 52);
        int var6 = var2.field376;
        int var7 = class109.field2623[var6 - var4];
        return var7 & class104.field2513[var3] >> var4;
    }

    @OriginalMember(owner = "client!u", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3268++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(Lu;I)I")
    public final int method1099(class135 arg0, int arg1) {
        field3240++;
        int var3;
        if (arg0.field3255 >= this.field3255) {
            var3 = this.field3255;
        } else {
            var3 = arg0.field3255;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class151.field3719[this.field3266[var4] & 0xFF] < class151.field3719[arg0.field3266[var4] & 0xFF]) {
                return -1;
            }
            if (class151.field3719[this.field3266[var4] & 0xFF] > class151.field3719[arg0.field3266[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1 >= -75) {
            this.method1091((byte) 45);
        }
        if (this.field3255 < arg0.field3255) {
            return -1;
        } else if (this.field3255 > arg0.field3255) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILu;)I")
    private final int method1100(int arg0, int arg1, class135 arg2) {
        field3283++;
        int[] var4 = new int[arg2.field3255];
        int[] var5 = new int[arg2.field3255];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field3255;
        }
        for (int var8 = 1; var8 <= arg2.field3255; var8++) {
            var4[var8 - 1] = (arg2.field3255 << 1) - var8;
            var6[class4.method19(255, arg2.field3266[var8 - 1])] = arg2.field3255 - var8;
        }
        int var9 = arg2.field3255 - arg0;
        for (int var10 = arg2.field3255; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (arg2.field3255 >= var9 && arg2.field3266[var9 - 1] != arg2.field3266[var10 - 1]) {
                if (arg2.field3255 - var10 <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg2.field3255 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = 1;
        int var12 = var9;
        int var13 = arg2.field3255 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field3266[var14 - 1] != arg2.field3266[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var14++;
        }
        while (var12 < arg2.field3255) {
            for (int var18 = var11; var18 <= var12; var18++) {
                if (var4[var18 - 1] >= var12 + arg2.field3255 - var18) {
                    var4[var18 - 1] = arg2.field3255 + var12 - var18;
                }
            }
            var11 = var12 + 1;
            var12 -= var5[var13 - 1] - var13;
            var13 = var5[var13 - 1];
        }
        int var17;
        for (int var16 = arg2.field3255 + arg1 - 1; var16 < this.field3255; var16 += Math.max(var6[this.field3266[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field3255 - 1; var17 >= 0 && this.field3266[var16] == arg2.field3266[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Lu;B)Z")
    public final boolean method1101(class135 arg0, byte arg1) {
        field3263++;
        if (arg0 == null) {
            return false;
        } else if (this.field3255 == arg0.field3255) {
            if (!this.field3228 || !arg0.field3228) {
                if (this.field3252 == 0) {
                    this.field3252 = this.method1076((byte) 122);
                    if (this.field3252 == 0) {
                        this.field3252 = 1;
                    }
                }
                if (arg0.field3252 == 0) {
                    arg0.field3252 = arg0.method1076((byte) 122);
                    if (arg0.field3252 == 0) {
                        arg0.field3252 = 1;
                    }
                }
                if (this.field3252 != arg0.field3252) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field3255; var3++) {
                if (this.field3266[var3] != arg0.field3266[var3]) {
                    return false;
                }
            }
            if (arg1 < 76) {
                this.field3252 = 95;
            }
            return true;
        } else {
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1102(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
