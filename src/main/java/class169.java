import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class169 implements class119 {

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Z")
    private boolean field3260 = true;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Lsg;")
    public static class169 field3276 = class165.method1060("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 1536);

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field3265 = -1;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lsg;")
    public static class169 field3249 = class165.method1060("T", 1536);

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "I")
    public static int field3294;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field3295;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[B")
    public byte[] field3248;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public static int[] field3251;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Lsg;")
    public final class169 method1102(byte arg0) {
        field3267++;
        long var2 = this.method1135(true);
        synchronized (field3295 == null ? (field3295 = method1141("sg")) : field3295) {
            if (class13.field310 == null) {
                class13.field310 = new class163(4096);
            } else {
                for (class135 var5 = (class135) class13.field310.method1045(var2, (byte) -77); var5 != null; var5 = (class135) class13.field310.method1049((byte) 12)) {
                    if (this.method1121(var5.field2520, 89)) {
                        return var5.field2520;
                    }
                }
            }
            class135 var7 = new class135();
            if (arg0 < 37) {
                this.field3260 = true;
            }
            this.field3260 = false;
            var7.field2520 = this;
            class13.field310.method1044(var2, true, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!sg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3256++;
        if (!(arg0 instanceof class169)) {
            throw new IllegalArgumentException();
        }
        return this.method1121((class169) arg0, 108);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static final void method1103(byte arg0) {
        field3257++;
        class105 var1 = (class105) class57.field1056.method145(0);
        if (arg0 != 38) {
            method1126(-30, 68, 43);
        }
        while (var1 != null) {
            if (var1.field1927 == -1) {
                var1.field1930 = 0;
                class21.method141((byte) -120, var1);
            } else {
                var1.method1213(9104);
            }
            var1 = (class105) class57.field1056.method152((byte) -128);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)Z")
    public final boolean method1104(int arg0) {
        field3268++;
        if (arg0 != -10) {
            this.method1135(true);
        }
        return this.method1138(20440, 10);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lsg;Z)Lsg;")
    public final class169 method1105(class169 arg0, boolean arg1) {
        field3270++;
        if (!this.field3260) {
            throw new IllegalArgumentException();
        }
        this.field3277 = 0;
        if (this.field3253 + arg0.field3253 > this.field3248.length) {
            int var3;
            for (var3 = 1; var3 < this.field3253 + arg0.field3253; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class97.method580(this.field3248, 0, var4, 0, this.field3253);
            this.field3248 = var4;
        }
        class97.method580(arg0.field3248, 0, this.field3248, this.field3253, arg0.field3253);
        this.field3253 += arg0.field3253;
        return arg1 ? this : null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)Lsg;")
    public final class169 method1106(boolean arg0, int arg1) {
        field3272++;
        return arg0 ? null : this.method1132(arg1, 115, this.field3253);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)Lsg;")
    public final class169 method1107(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field3253 && (this.field3248[var2] >= 0 && this.field3248[var2] <= 32 || (this.field3248[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field3253; var3 > var2 && (this.field3248[var3 - 1] >= 0 && this.field3248[var3 - 1] <= 32 || (this.field3248[var3 - 1] & 0xFF) == 160); var3--) {
        }
        field3294++;
        if (~var2 == arg0 && this.field3253 == var3) {
            return this;
        }
        class169 var4 = new class169();
        var4.field3253 = var3 - var2;
        var4.field3248 = new byte[var4.field3253];
        for (int var5 = 0; var5 < var4.field3253; var5++) {
            var4.field3248[var5] = this.field3248[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)[B")
    public final byte[] method1108(byte arg0) {
        field3252++;
        byte[] var2 = new byte[this.field3253];
        class97.method580(this.field3248, 0, var2, 0, this.field3253);
        return arg0 >= -84 ? null : var2;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)Lsg;")
    public final class169 method1109(int arg0) {
        field3288++;
        byte var2 = 2;
        if (arg0 != -2) {
            return null;
        }
        class169 var3 = new class169();
        var3.field3253 = this.field3253;
        var3.field3248 = new byte[this.field3253];
        for (int var4 = 0; var4 < this.field3253; var4++) {
            byte var5 = this.field3248[var4];
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
            var3.field3248[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lsg;I)Z")
    public final boolean method1110(class169 arg0, int arg1) {
        field3254++;
        if (arg0 == null) {
            return false;
        } else if (this.field3253 == arg0.field3253) {
            for (int var3 = 0; var3 < this.field3253; var3++) {
                byte var4 = arg0.field3248[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field3248[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != 70) {
                this.hashCode();
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
    public final int method1111(int arg0, int arg1, int arg2) {
        field3274++;
        byte var4 = (byte) arg0;
        if (arg1 != 24637) {
            this.method1106(false, -116);
        }
        for (int var5 = arg2; var5 < this.field3253; var5++) {
            if (this.field3248[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3247++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLsg;)I")
    public final int method1112(byte arg0, class169 arg1) {
        if (arg0 != 125) {
            this.field3277 = -25;
        }
        int var3;
        if (arg1.field3253 >= this.field3253) {
            var3 = this.field3253;
        } else {
            var3 = arg1.field3253;
        }
        field3263++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field3248[var4] & 0xFF) < (arg1.field3248[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field3248[var4] & 0xFF) > (arg1.field3248[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field3253 < arg1.field3253) {
            return -1;
        } else if (this.field3253 > arg1.field3253) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lsg;I)Z")
    public final boolean method1113(class169 arg0, int arg1) {
        field3244++;
        if (arg0.field3253 > this.field3253) {
            return false;
        }
        int var3 = this.field3253 - arg0.field3253;
        if (arg1 != 24925) {
            this.method1133(false);
        }
        for (int var4 = 0; var4 < arg0.field3253; var4++) {
            if (this.field3248[var3 + var4] != arg0.field3248[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method1114(int arg0, Graphics arg1, int arg2, int arg3) {
        field3273++;
        String var5;
        try {
            var5 = new String(this.field3248, 0, this.field3253, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3248, 0, this.field3253);
        }
        arg1.drawString(var5, arg0, arg3);
        if (arg2 != 18898) {
            this.method1130((byte) 91);
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Ljava/net/URL;")
    public final URL method1115(int arg0) throws MalformedURLException {
        field3264++;
        return arg0 <= 78 ? null : new URL(new String(this.field3248, 0, this.field3253));
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILsg;)I")
    public final int method1116(int arg0, class169 arg1) {
        field3266++;
        if (arg0 != -248) {
            this.toString();
        }
        return this.method1139((byte) 110, 0, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II[BII)I")
    public final int method1117(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field3275++;
        class97.method580(this.field3248, arg4, arg2, arg3, arg0 - arg4);
        if (arg1 != -21) {
            field3261 = -72;
        }
        return arg0 - arg4;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)Lsg;")
    public final class169 method1118(int arg0) {
        field3246++;
        class169 var2 = new class169();
        var2.field3253 = 0;
        var2.field3248 = new byte[12];
        int var3 = 0;
        int var4 = 0;
        if (arg0 != -13) {
            this.field3248 = null;
        }
        while (var4 < this.field3253) {
            if (this.field3248[var4] >= 65 && this.field3248[var4] <= 90) {
                var2.field3248[var3++] = (byte) (this.field3248[var4] + 97 - 65);
                var2.field3253 = var3;
            } else if (this.field3248[var4] >= 97 && this.field3248[var4] <= 122 || this.field3248[var4] >= 48 && this.field3248[var4] <= 57) {
                var2.field3248[var3++] = this.field3248[var4];
                var2.field3253 = var3;
            } else if (var3 > 0) {
                var2.field3248[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(B)Lsg;")
    public final class169 method1119(byte arg0) {
        field3259++;
        if (!this.field3260) {
            throw new IllegalArgumentException();
        }
        this.field3277 = 0;
        int var2 = 94 % ((44 - arg0) / 52);
        if (this.field3248.length != this.field3253) {
            byte[] var3 = new byte[this.field3253];
            class97.method580(this.field3248, 0, var3, 0, this.field3253);
            this.field3248 = var3;
        }
        return this;
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(B)V")
    public static void method1120(byte arg0) {
        if (arg0 == -61) {
            field3276 = null;
            field3249 = null;
            field3251 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lsg;I)Z")
    public final boolean method1121(class169 arg0, int arg1) {
        field3283++;
        if (arg0 == null) {
            return false;
        } else if (this.field3253 != arg0.field3253) {
            return false;
        } else if (arg1 <= 71) {
            return false;
        } else {
            if (!this.field3260 || !arg0.field3260) {
                if (this.field3277 == 0) {
                    this.field3277 = this.method1130((byte) -101);
                    if (this.field3277 == 0) {
                        this.field3277 = 1;
                    }
                }
                if (arg0.field3277 == 0) {
                    arg0.field3277 = arg0.method1130((byte) -75);
                    if (arg0.field3277 == 0) {
                        arg0.field3277 = 1;
                    }
                }
                if (this.field3277 != arg0.field3277) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field3253; var3++) {
                if (this.field3248[var3] != arg0.field3248[var3]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method1122(FontMetrics arg0, byte arg1) {
        field3258++;
        String var3;
        try {
            var3 = new String(this.field3248, 0, this.field3253, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3248, 0, this.field3253);
        }
        if (arg1 != 50) {
            this.method1114(-92, null, 30, -45);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I")
    public final int method1123(boolean arg0) {
        field3291++;
        if (arg0) {
            this.method1129(false);
        }
        return this.method1125(10, 87);
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(Lsg;I)Z")
    public final boolean method1124(class169 arg0, int arg1) {
        field3281++;
        if (arg0.field3253 > this.field3253) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field3253; var3++) {
            if (this.field3248[var3] != arg0.field3248[var3]) {
                return false;
            }
        }
        if (arg1 < 47) {
            this.field3253 = -48;
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public final int method1125(int arg0, int arg1) {
        field3289++;
        boolean var3 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 0;
        boolean var5 = false;
        if (arg1 != 87) {
            field3261 = 29;
        }
        for (int var6 = 0; var6 < this.field3253; var6++) {
            int var7 = this.field3248[var6] & 0xFF;
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
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3282++;
        return this.method1130((byte) -125);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I")
    public static final int method1126(int arg0, int arg1, int arg2) {
        field3278++;
        long var3 = (long) ((arg2 << 16) + arg1);
        if (class182.field3558 != null && class182.field3558.field3543 == var3) {
            return arg0 >= -116 ? 23 : class189.field3731.field2346 * 99 / (class189.field3731.field2325.length - class182.field3558.field306) + 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)Lsg;")
    public final class169 method1127(byte arg0) {
        field3271++;
        int var2 = 47 % ((arg0 + 90) / 34);
        class169 var3 = new class169();
        var3.field3253 = this.field3253;
        var3.field3248 = new byte[this.field3253];
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field3253; var5++) {
            byte var6 = this.field3248[var5];
            if (var6 == 95) {
                var3.field3248[var5] = 32;
                var4 = true;
            } else if (var6 >= 97 && var6 <= 122 && var4) {
                var3.field3248[var5] = (byte) (var6 - 32);
                var4 = false;
            } else {
                var3.field3248[var5] = var6;
                var4 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)I")
    public final int method1128(int arg0, int arg1) {
        if (arg0 != 255) {
            field3276 = null;
        }
        field3250++;
        return this.field3248[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)Lsg;")
    public final class169 method1129(boolean arg0) {
        class169 var2 = new class169();
        var2.field3253 = this.field3253;
        var2.field3248 = new byte[this.field3253];
        int var3 = 0;
        if (!arg0) {
            this.method1136((byte) -6, null);
        }
        while (var3 < this.field3253) {
            var2.field3248[var3] = 42;
            var3++;
        }
        field3280++;
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(B)I")
    public final int method1130(byte arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3253; var3++) {
            var2 = (this.field3248[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        if (arg0 >= -55) {
            this.method1113(null, 104);
        }
        field3284++;
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(B)Lsg;")
    public final class169 method1131(byte arg0) {
        if (arg0 >= -62) {
            return null;
        }
        field3255++;
        class169 var2 = new class169();
        var2.field3253 = this.field3253;
        var2.field3248 = new byte[this.field3253];
        for (int var3 = 0; var3 < this.field3253; var3++) {
            byte var4 = this.field3248[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3248[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(III)Lsg;")
    public final class169 method1132(int arg0, int arg1, int arg2) {
        if (arg1 < 100) {
            return null;
        }
        field3292++;
        class169 var4 = new class169();
        var4.field3248 = new byte[arg2 - arg0];
        var4.field3253 = arg2 - arg0;
        class97.method580(this.field3248, arg0, var4.field3248, 0, var4.field3253);
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)J")
    public final long method1133(boolean arg0) {
        field3286++;
        if (arg0) {
            field3276 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; this.field3253 > var4 && var4 < 12; var4++) {
            byte var5 = this.field3248[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)I")
    public final int method1134(int arg0) {
        if (arg0 != 0) {
            this.method1112((byte) -30, null);
        }
        field3287++;
        return this.field3253;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(Z)J")
    private final long method1135(boolean arg0) {
        if (!arg0) {
            field3261 = 30;
        }
        long var2 = 0L;
        field3285++;
        for (int var4 = 0; var4 < this.field3253; var4++) {
            var2 = (var2 << 5) + (long) (this.field3248[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(BLsg;)I")
    public final int method1136(byte arg0, class169 arg1) {
        field3293++;
        int var3;
        if (arg1.field3253 < this.field3253) {
            var3 = arg1.field3253;
        } else {
            var3 = this.field3253;
        }
        if (arg0 != 13) {
            field3261 = -74;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class93.field1749[arg1.field3248[var4] & 0xFF] > class93.field1749[this.field3248[var4] & 0xFF]) {
                return -1;
            }
            if (class93.field1749[this.field3248[var4] & 0xFF] > class93.field1749[arg1.field3248[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field3253 > this.field3253) {
            return -1;
        } else if (arg1.field3253 < this.field3253) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lsg;")
    public final class169 method1137(int arg0, byte arg1) {
        field3290++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class169 var3 = new class169();
        var3.field3248 = new byte[this.field3253 + 1];
        var3.field3253 = this.field3253 + 1;
        int var4 = -87 / ((arg1 + 42) / 56);
        class97.method580(this.field3248, 0, var3.field3248, 0, this.field3253);
        var3.field3248[this.field3253] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
    private final boolean method1138(int arg0, int arg1) {
        field3269++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg0 != 20440) {
            this.method1125(-53, -81);
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3253; var6++) {
            int var7 = this.field3248[var6] & 0xFF;
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
            if (arg1 <= var7) {
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

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BILsg;)I")
    public final int method1139(byte arg0, int arg1, class169 arg2) {
        field3279++;
        int[] var4 = new int[arg2.field3253];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field3253];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field3253;
        }
        int var8 = 85 % ((arg0 - 25) / 37);
        for (int var9 = 1; var9 <= arg2.field3253; var9++) {
            var4[var9 - 1] = (arg2.field3253 << 1) - var9;
            var5[class150.method984(255, arg2.field3248[var9 - 1])] = arg2.field3253 - var9;
        }
        int var10 = arg2.field3253 + 1;
        int var11 = arg2.field3253;
        while (var11 > 0) {
            var6[var11 - 1] = var10;
            while (var10 <= arg2.field3253 && arg2.field3248[var10 - 1] != arg2.field3248[var11 - 1]) {
                if (var4[var10 - 1] >= arg2.field3253 - var11) {
                    var4[var10 - 1] = arg2.field3253 - var11;
                }
                var10 = var6[var10 - 1];
            }
            var11--;
            var10--;
        }
        int var12 = var10;
        int var13 = 1;
        int var14 = 0;
        int var15 = arg2.field3253 + 1 - var10;
        int var16 = 1;
        while (var15 >= var16) {
            var6[var16 - 1] = var14;
            while (var14 >= 1 && arg2.field3248[var14 - 1] != arg2.field3248[var16 - 1]) {
                var14 = var6[var14 - 1];
            }
            var16++;
            var14++;
        }
        while (arg2.field3253 > var12) {
            for (int var19 = var13; var19 <= var12; var19++) {
                if (var12 + arg2.field3253 - var19 <= var4[var19 + -1]) {
                    var4[var19 - 1] = arg2.field3253 + var12 - var19;
                }
            }
            var13 = var12 + 1;
            var12 = var12 + var15 - var6[var15 + -1];
            var15 = var6[var15 - 1];
        }
        int var18;
        for (int var17 = arg2.field3253 + arg1 - 1; var17 < this.field3253; var17 += Math.max(var5[this.field3248[var17] & 0xFF], var4[var18])) {
            for (var18 = arg2.field3253 - 1; var18 >= 0 && this.field3248[var17] == arg2.field3248[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(II)Lsg;")
    public final class169 method1140(int arg0, int arg1) {
        field3262++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        }
        if (arg0 <= 98) {
            this.field3253 = -58;
        }
        if (!this.field3260) {
            throw new IllegalArgumentException();
        }
        this.field3277 = 0;
        if (this.field3248.length == this.field3253) {
            int var3;
            for (var3 = 1; var3 <= this.field3253; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class97.method580(this.field3248, 0, var4, 0, this.field3253);
            this.field3248 = var4;
        }
        this.field3248[this.field3253++] = (byte) arg1;
        return this;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1141(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
