import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 implements class111 {

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Z")
    private boolean field3184 = true;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "Ltd;")
    public static class136 field3195 = class145.method1172("l", 45);

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Ltd;")
    public static class136 field3185 = class145.method1172(" x ", 45);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field3174;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field3219;

    // $FF: synthetic field
    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field3220;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[B")
    public byte[] field3182;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "[Lnb;")
    public static class92[] field3207;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Ltd;")
    public final class136 method1090(byte arg0) {
        field3178++;
        int var2 = 0;
        class136 var3 = new class136();
        var3.field3183 = 0;
        var3.field3182 = new byte[12];
        if (arg0 != 68) {
            return null;
        }
        for (int var4 = 0; var4 < this.field3183; var4++) {
            if (this.field3182[var4] >= 65 && this.field3182[var4] <= 90) {
                var3.field3182[var2++] = (byte) (this.field3182[var4] + 97 - 65);
                var3.field3183 = var2;
            } else if (this.field3182[var4] >= 97 && this.field3182[var4] <= 122 || this.field3182[var4] >= 48 && this.field3182[var4] <= 57) {
                var3.field3182[var2++] = this.field3182[var4];
                var3.field3183 = var2;
            } else if (var2 > 0) {
                var3.field3182[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
    private final int method1091(int arg0, int arg1, int arg2) {
        field3214++;
        byte var4 = (byte) arg1;
        if (arg2 != -1) {
            this.method1104((byte) 97);
        }
        for (int var5 = arg0; var5 < this.field3183; var5++) {
            if (this.field3182[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILtd;)Z")
    public final boolean method1092(int arg0, class136 arg1) {
        if (arg0 != 1853) {
            return true;
        }
        field3198++;
        if (arg1 == null) {
            return false;
        } else if (this.field3183 == arg1.field3183) {
            for (int var3 = 0; var3 < this.field3183; var3++) {
                byte var4 = arg1.field3182[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field3182[var3];
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

    @OriginalMember(owner = "client!td", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3173++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)Ltd;")
    public final class136 method1093(int arg0, boolean arg1) {
        field3201++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        if (!arg1) {
            this.method1123(false);
        }
        class136 var3 = new class136();
        var3.field3182 = new byte[this.field3183 + 1];
        var3.field3183 = this.field3183 + 1;
        class138.method1132(this.field3182, 0, var3.field3182, 0, this.field3183);
        var3.field3182[this.field3183] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)I")
    public final int method1094(boolean arg0, int arg1) {
        if (arg0) {
            field3195 = null;
        }
        field3189++;
        return this.field3182[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ILtd;)I")
    public final int method1095(int arg0, class136 arg1) {
        int var3;
        if (this.field3183 > arg1.field3183) {
            var3 = arg1.field3183;
        } else {
            var3 = this.field3183;
        }
        field3210++;
        for (int var4 = arg0; var4 < var3; var4++) {
            if (class131.field3106[arg1.field3182[var4] & 0xFF] > class131.field3106[this.field3182[var4] & 0xFF]) {
                return -1;
            }
            if (class131.field3106[this.field3182[var4] & 0xFF] > class131.field3106[arg1.field3182[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field3183 > this.field3183) {
            return -1;
        } else if (arg1.field3183 < this.field3183) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILca;)V")
    public static final void method1096(int arg0, class16 arg1) {
        field3191++;
        int var2 = 0;
        if (arg1.field324 == 0) {
            var2 = class146.field3366.method739(arg1.field325, arg1.field328, arg1.field315);
        }
        int var3 = 0;
        if (arg1.field324 == 1) {
            var2 = class146.field3366.method773(arg1.field325, arg1.field328, arg1.field315);
        }
        int var4 = -1;
        if (arg1.field324 == 2) {
            var2 = class146.field3366.method787(arg1.field325, arg1.field328, arg1.field315);
        }
        if (arg1.field324 == 3) {
            var2 = class146.field3366.method755(arg1.field325, arg1.field328, arg1.field315);
        }
        int var5 = 0;
        if (var2 != 0) {
            int var6 = class146.field3366.method759(arg1.field325, arg1.field328, arg1.field315, var2);
            var4 = var2 >> 14 & 0x7FFF;
            var5 = var6 >> 6 & 0x3;
            var3 = var6 & 0x1F;
        }
        arg1.field313 = var5;
        if (arg0 != 30370) {
            field3217 = -36;
        }
        arg1.field316 = var3;
        arg1.field329 = var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltd;B)Ltd;")
    public final class136 method1097(class136 arg0, byte arg1) {
        field3202++;
        if (!this.field3184) {
            throw new IllegalArgumentException();
        }
        this.field3174 = 0;
        if (this.field3183 + arg0.field3183 > this.field3182.length) {
            int var3;
            for (var3 = 1; var3 < this.field3183 + arg0.field3183; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class138.method1132(this.field3182, 0, var4, 0, this.field3183);
            this.field3182 = var4;
        }
        class138.method1132(arg0.field3182, 0, this.field3182, this.field3183, arg0.field3183);
        if (arg1 <= 52) {
            this.method1105(-110, (byte) 86, 36);
        }
        this.field3183 += arg0.field3183;
        return this;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Ltd;")
    public final class136 method1098(int arg0) {
        field3172++;
        if (arg0 >= -65) {
            this.field3182 = null;
        }
        if (!this.field3184) {
            throw new IllegalArgumentException();
        }
        this.field3174 = 0;
        if (this.field3182.length != this.field3183) {
            byte[] var2 = new byte[this.field3183];
            class138.method1132(this.field3182, 0, var2, 0, this.field3183);
            this.field3182 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method1099(FontMetrics arg0, byte arg1) {
        field3219++;
        String var3;
        try {
            var3 = new String(this.field3182, 0, this.field3183, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field3182, 0, this.field3183);
        }
        int var4 = 86 % ((arg1 + 39) / 37);
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltd;I)I")
    public final int method1100(class136 arg0, int arg1) {
        field3193++;
        return arg1 == 0 ? this.method1124((byte) -70, arg0, 0) : -49;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Ltd;")
    public final class136 method1101(int arg0) {
        field3196++;
        if (arg0 != 3117) {
            this.method1101(100);
        }
        long var2 = this.method1115(255);
        synchronized (field3220 == null ? (field3220 = method1130("td")) : field3220) {
            if (class132.field3121 == null) {
                class132.field3121 = new class15(4096);
            } else {
                for (class91 var5 = (class91) class132.field3121.method109(59, var2); var5 != null; var5 = (class91) class132.field3121.method108(-91)) {
                    if (this.method1114(arg0 ^ 0xC2D, var5.field2158)) {
                        return var5.field2158;
                    }
                }
            }
            class91 var7 = new class91();
            var7.field2158 = this;
            this.field3184 = false;
            class132.field3121.method112(var7, (byte) 3, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!td", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3199++;
        if (!(arg0 instanceof class136)) {
            throw new IllegalArgumentException();
        }
        return this.method1114(0, (class136) arg0);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Ltd;")
    public final class136 method1102(int arg0) {
        class136 var2 = new class136();
        var2.field3183 = this.field3183;
        var2.field3182 = new byte[this.field3183];
        boolean var3 = true;
        if (arg0 != -1) {
            method1113(null, (byte) -77, 82);
        }
        for (int var4 = 0; var4 < this.field3183; var4++) {
            byte var5 = this.field3182[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field3182[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field3182[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field3182[var4] = var5;
            }
        }
        field3169++;
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Ljava/net/URL;")
    public final URL method1103(byte arg0) throws MalformedURLException {
        if (arg0 != -111) {
            this.field3184 = false;
        }
        field3205++;
        return new URL(new String(this.field3182, 0, this.field3183));
    }

    @OriginalMember(owner = "client!td", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3216++;
        return this.method1127((byte) 110);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Ltd;")
    public final class136 method1104(byte arg0) {
        field3194++;
        class136 var2 = new class136();
        var2.field3183 = this.field3183;
        if (arg0 >= -54) {
            return null;
        }
        var2.field3182 = new byte[this.field3183];
        for (int var3 = 0; var3 < this.field3183; var3++) {
            byte var4 = this.field3182[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3182[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)Ltd;")
    public final class136 method1105(int arg0, byte arg1, int arg2) {
        field3215++;
        class136 var4 = new class136();
        if (arg1 != -7) {
            this.method1108(-20, -84);
        }
        var4.field3182 = new byte[arg2 - arg0];
        var4.field3183 = arg2 - arg0;
        class138.method1132(this.field3182, arg0, var4.field3182, 0, var4.field3183);
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static void method1106(int arg0) {
        field3195 = null;
        field3207 = null;
        if (arg0 != 1) {
            method1106(-23);
        }
        field3185 = null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Z")
    public final boolean method1107(int arg0) {
        field3175++;
        return arg0 == -27364 ? this.method1111(10, (byte) 105) : false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Ltd;")
    public final class136 method1108(int arg0, int arg1) {
        field3187++;
        return arg1 == -16621 ? this.method1105(arg0, (byte) -7, this.field3183) : null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IZ)I")
    public final int method1109(int arg0, boolean arg1) {
        field3209++;
        if (!arg1) {
            field3185 = null;
        }
        return this.method1091(0, arg0, -1);
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)Ltd;")
    public final class136 method1110(int arg0) {
        int var2 = -112 % ((-arg0 - 22) / 33);
        field3218++;
        byte var3 = 2;
        class136 var4 = new class136();
        var4.field3183 = this.field3183;
        var4.field3182 = new byte[this.field3183];
        for (int var5 = 0; var5 < this.field3183; var5++) {
            byte var6 = this.field3182[var5];
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
            var4.field3182[var5] = var6;
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Z")
    private final boolean method1111(int arg0, byte arg1) {
        field3211++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3183; var6++) {
            int var7 = this.field3182[var6] & 0xFF;
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
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        if (arg1 <= 97) {
            this.field3183 = 94;
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Ltd;I)Z")
    public final boolean method1112(class136 arg0, int arg1) {
        field3177++;
        if (this.field3183 < arg0.field3183) {
            return false;
        }
        int var3 = this.field3183 - arg0.field3183;
        if (arg1 != 32526) {
            this.method1118(-103, 19, null, 49, 121);
        }
        for (int var4 = 0; var4 < arg0.field3183; var4++) {
            if (this.field3182[var3 + var4] != arg0.field3182[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ltd;BI)V")
    public static final void method1113(class136 arg0, byte arg1, int arg2) {
        field3212++;
        class7.field125++;
        class15.field304.method867(79, true);
        class15.field304.method1026(arg2, (byte) 127);
        class15.field304.method1029(arg0.method1117(-120), 14384);
        if (arg1 >= -19) {
            field3217 = -42;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(ILtd;)Z")
    public final boolean method1114(int arg0, class136 arg1) {
        field3200++;
        if (arg1 == null) {
            return false;
        } else if (this.field3183 == arg1.field3183) {
            if (!this.field3184 || !arg1.field3184) {
                if (this.field3174 == 0) {
                    this.field3174 = this.method1127((byte) 100);
                    if (this.field3174 == 0) {
                        this.field3174 = 1;
                    }
                }
                if (arg1.field3174 == 0) {
                    arg1.field3174 = arg1.method1127((byte) 123);
                    if (arg1.field3174 == 0) {
                        arg1.field3174 = 1;
                    }
                }
                if (this.field3174 != arg1.field3174) {
                    return false;
                }
            }
            for (int var3 = arg0; var3 < this.field3183; var3++) {
                if (this.field3182[var3] != arg1.field3182[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(I)J")
    private final long method1115(int arg0) {
        field3206++;
        long var2 = 0L;
        if (arg0 == 255) {
            for (int var4 = 0; var4 < this.field3183; var4++) {
                var2 = (var2 << 5) + (long) (this.field3182[var4] & 0xFF) - var2;
            }
            return var2;
        } else {
            return -64L;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Ltd;")
    public final class136 method1116(int arg0, int arg1) {
        field3188++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field3184) {
            if (arg1 != 2) {
                this.method1121(-80, -44, null, 17);
            }
            this.field3174 = 0;
            if (this.field3182.length == this.field3183) {
                int var3;
                for (var3 = 1; var3 <= this.field3183; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class138.method1132(this.field3182, 0, var4, 0, this.field3183);
                this.field3182 = var4;
            }
            this.field3182[this.field3183++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)J")
    public final long method1117(int arg0) {
        field3171++;
        int var2 = 60 % ((arg0 - 3) / 52);
        long var3 = 0L;
        for (int var5 = 0; this.field3183 > var5 && var5 < 12; var5++) {
            var3 *= 37L;
            byte var6 = this.field3182[var5];
            if (var6 >= 65 && var6 <= 90) {
                var3 += var6 - 64;
            } else if (var6 >= 97 && var6 <= 122) {
                var3 += var6 + 1 - 97;
            } else if (var6 >= 48 && var6 <= 57) {
                var3 += var6 - 21;
            }
        }
        while (var3 % 37L == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II[BII)I")
    public final int method1118(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class138.method1132(this.field3182, arg0, arg2, arg4, arg3 - arg0);
        if (arg1 != -23424) {
            this.method1092(58, null);
        }
        field3186++;
        return arg3 - arg0;
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)I")
    public final int method1119(int arg0) {
        if (arg0 != -10511) {
            field3190 = -116;
        }
        field3203++;
        return this.field3183;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Ltd;I)Z")
    public final boolean method1120(class136 arg0, int arg1) {
        field3181++;
        if (arg0.field3183 > this.field3183) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field3183; var3++) {
            if (this.field3182[var3] != arg0.field3182[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method1121(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg1 != -1) {
            return;
        }
        field3170++;
        String var5;
        try {
            var5 = new String(this.field3182, 0, this.field3183, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3182, 0, this.field3183);
        }
        arg2.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)I")
    public final int method1122(int arg0, int arg1) {
        if (arg0 != 97) {
            this.method1101(77);
        }
        field3192++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field3183; var6++) {
            int var7 = this.field3182[var6] & 0xFF;
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
            if (var7 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
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

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)[B")
    public final byte[] method1123(boolean arg0) {
        field3180++;
        byte[] var2 = new byte[this.field3183];
        if (arg0) {
            return null;
        } else {
            class138.method1132(this.field3182, 0, var2, 0, this.field3183);
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLtd;I)I")
    private final int method1124(byte arg0, class136 arg1, int arg2) {
        field3204++;
        if (arg0 >= -62) {
            field3190 = -10;
        }
        int[] var4 = new int[arg1.field3183];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field3183];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field3183;
        }
        for (int var8 = 1; var8 <= arg1.field3183; var8++) {
            var4[var8 - 1] = (arg1.field3183 << 1) - var8;
            var5[class154.method1207(arg1.field3182[var8 - 1], 255)] = arg1.field3183 - var8;
        }
        int var9 = arg1.field3183 + 1;
        for (int var10 = arg1.field3183; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg1.field3183 >= var9 && arg1.field3182[var9 - 1] != arg1.field3182[var10 - 1]) {
                if (var4[var9 - 1] >= arg1.field3183 - var10) {
                    var4[var9 - 1] = arg1.field3183 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field3183 + 1 - var9;
        int var13 = 0;
        for (int var14 = 1; var14 <= var12; var14++) {
            var6[var14 - 1] = var13;
            while (var13 >= 1 && arg1.field3182[var13 - 1] != arg1.field3182[var14 - 1]) {
                var13 = var6[var13 - 1];
            }
            var13++;
        }
        int var15 = 1;
        while (arg1.field3183 > var11) {
            for (int var18 = var15; var18 <= var11; var18++) {
                if (arg1.field3183 + var11 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = arg1.field3183 + var11 - var18;
                }
            }
            var15 = var11 + 1;
            var11 = var11 + var12 - var6[var12 + -1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg1.field3183 - 1; var16 < this.field3183; var16 += Math.max(var5[this.field3182[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field3183 - 1; var17 >= 0 && this.field3182[var16] == arg1.field3182[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(ILtd;)I")
    public final int method1125(int arg0, class136 arg1) {
        field3213++;
        int var3;
        if (this.field3183 <= arg1.field3183) {
            var3 = this.field3183;
        } else {
            var3 = arg1.field3183;
        }
        int var4 = 0;
        if (arg0 != 255) {
            this.field3183 = 111;
        }
        while (var3 > var4) {
            if ((arg1.field3182[var4] & 0xFF) > (this.field3182[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field3182[var4] & 0xFF) > (arg1.field3182[var4] & 0xFF)) {
                return 1;
            }
            var4++;
        }
        if (this.field3183 < arg1.field3183) {
            return -1;
        } else if (this.field3183 > arg1.field3183) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)I")
    public final int method1126(boolean arg0) {
        field3208++;
        return arg0 ? this.method1122(97, 10) : -4;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)I")
    public final int method1127(byte arg0) {
        field3176++;
        int var2 = 0;
        if (arg0 <= 89) {
            return -125;
        } else {
            for (int var3 = 0; var3 < this.field3183; var3++) {
                var2 = (this.field3182[var3] & 0xFF) + (var2 << 5) - var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)Ltd;")
    public final class136 method1128(int arg0) {
        field3179++;
        class136 var2 = new class136();
        var2.field3183 = this.field3183;
        var2.field3182 = new byte[this.field3183];
        int var3 = -35 % ((-arg0 - 44) / 37);
        for (int var4 = 0; var4 < this.field3183; var4++) {
            var2.field3182[var4] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)Ltd;")
    public final class136 method1129(boolean arg0) {
        field3197++;
        int var2;
        for (var2 = 0; var2 < this.field3183 && (this.field3182[var2] >= 0 && this.field3182[var2] <= 32 || (this.field3182[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field3183; var2 < var3 && (this.field3182[var3 - 1] >= 0 && this.field3182[var3 - 1] <= 32 || (this.field3182[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field3183 == var3) {
            return this;
        }
        class136 var4 = new class136();
        var4.field3183 = var3 - var2;
        var4.field3182 = new byte[var4.field3183];
        if (arg0) {
            field3185 = null;
        }
        for (int var5 = 0; var5 < var4.field3183; var5++) {
            var4.field3182[var5] = this.field3182[var2 + var5];
        }
        return var4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1130(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
