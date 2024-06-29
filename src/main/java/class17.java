import java.applet.Applet;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class17 implements class21 {

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "Z")
    private boolean field261 = true;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Lj;")
    public static class17 field257 = class30.method190(-105, "Altar");

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Lj;")
    public static class17 field264 = class30.method190(-114, "Spice Shop");

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "Lj;")
    public static class17 field259 = class30.method190(-89, "overlay)3dat");

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Lj;")
    public static class17 field266 = class30.method190(-98, "50(U");

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lj;")
    public static class17 field267 = class30.method190(-104, "Agility Training");

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Lj;")
    public static class17 field269 = class30.method190(-128, "(U");

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "Lj;")
    public static class17 field265 = class30.method190(-94, "b12_full");

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lj;")
    public static class17 field260 = class30.method190(-91, "floorcol)3dat");

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Ld;")
    public static class7 field258;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field270;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "[B")
    public byte[] field263;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 13)
    public final void method113(Graphics arg0, int arg1, int arg2, byte arg3) {
        String var6;
        try {
            int var5 = 44 % ((arg3 + 37) / 50);
            var6 = new String(this.field263, 0, this.field268, "ISO-8859-1");
        } catch (UnsupportedEncodingException var8) {
            var6 = new String(this.field263, 0, this.field268);
        }
        arg0.drawString(var6, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)I", line = 33)
    public final int method114(int arg0) {
        return arg0 > -84 ? -127 : this.method115(10, (byte) -114);
    }

    @OriginalMember(owner = "mapview!j", name = "hashCode", descriptor = "()I", line = 51)
    public final int hashCode() {
        return this.method122(-248);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IB)I", line = 58)
    private final int method115(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        if (arg1 > -99) {
            this.method115(90, (byte) -78);
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field268; var6++) {
            int var7 = this.field263[var6] & 0xFF;
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

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(III)Lj;", line = 134)
    public final class17 method116(int arg0, int arg1, int arg2) {
        if (arg2 >= -101) {
            return (class17) null;
        }
        class17 var4 = new class17();
        var4.field263 = new byte[arg0 - arg1];
        var4.field268 = arg0 - arg1;
        class14.method102(this.field263, arg1, var4.field263, 0, var4.field268);
        return var4;
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(IB)Lj;", line = 148)
    public final class17 method117(int arg0, byte arg1) {
        return arg1 == 111 ? this.method116(this.field268, arg0, -116) : (class17) null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)I", line = 159)
    public final int method118(byte arg0) {
        return arg0 == -35 ? this.field268 : 94;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 181)
    public static final void method119(Component arg0, int arg1) {
        arg0.removeMouseListener(class28.field367);
        arg0.removeMouseMotionListener(class28.field367);
        arg0.removeFocusListener(class28.field367);
        if (arg1 < 106) {
            field257 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 227)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!j", name = "toString", descriptor = "()Ljava/lang/String;", line = 251)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V", line = 272)
    public static void method120(int arg0) {
        field257 = null;
        field265 = null;
        field269 = null;
        field258 = null;
        field259 = null;
        if (arg0 != 1084) {
            field269 = null;
        }
        field264 = null;
        field267 = null;
        field260 = null;
        field266 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(II)I", line = 341)
    public final int method121(int arg0, int arg1) {
        if (arg0 != -13355) {
            this.method128(-110, 9);
        }
        return this.field263[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)I", line = 352)
    public final int method122(int arg0) {
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -248) {
            this.field261 = false;
        }
        while (this.field268 > var3) {
            var2 = (var2 << 5) + (this.field263[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ILjava/applet/Applet;)Lj;", line = 389)
    public final class17 method123(int arg0, Applet arg1) {
        String var3 = new String(this.field263, arg0, this.field268);
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class29.method189(11231, var4);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 405)
    public final int method124(int arg0, FontMetrics arg1) {
        int var3 = 37 % ((arg0 - 53) / 63);
        String var4;
        try {
            var4 = new String(this.field263, 0, this.field268, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var4 = new String(this.field263, 0, this.field268);
        }
        return arg1.stringWidth(var4);
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(I)Lj;", line = 422)
    public final class17 method125(int arg0) {
        long var2 = this.method129(arg0 ^ 0x1035);
        synchronized (field270 == null ? (field270 = method136("j")) : field270) {
            if (class15.field247 == null) {
                class15.field247 = new class27(4096);
            } else {
                for (class32 var5 = (class32) class15.field247.method181(var2, (byte) -125); var5 != null; var5 = (class32) class15.field247.method178(arg0 - 4097)) {
                    if (this.method134(var5.field404, true)) {
                        return var5.field404;
                    }
                }
            }
            class32 var6 = new class32();
            if (arg0 != 4096) {
                this.method134(null, true);
            }
            this.field261 = false;
            var6.field404 = this;
            class15.field247.method180((byte) -120, var6, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 423)
    public static Class method136(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "(I)Lj;", line = 459)
    public final class17 method126(int arg0) {
        if (arg0 >= -123) {
            return (class17) null;
        } else if (this.field261) {
            this.field262 = 0;
            if (this.field263.length != this.field268) {
                byte[] var2 = new byte[this.field268];
                class14.method102(this.field263, 0, var2, 0, this.field268);
                this.field263 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ILj;)I", line = 494)
    public final int method127(int arg0, class17 arg1) {
        int var3;
        if (arg1.field268 < this.field268) {
            var3 = arg1.field268;
        } else {
            var3 = this.field268;
        }
        if (arg0 != -24506) {
            return 6;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1.field263[var4] > this.field263[var4]) {
                return -1;
            }
            if (arg1.field263[var4] < this.field263[var4]) {
                return 1;
            }
        }
        if (arg1.field268 > this.field268) {
            return -1;
        } else if (arg1.field268 < this.field268) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(II)V", line = 539)
    public final void method128(int arg0, int arg1) {
        this.field262 = 0;
        if (!this.field261) {
            throw new IllegalArgumentException();
        } else if (~arg0 > arg1) {
            throw new IllegalArgumentException();
        } else {
            if (this.field263.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class14.method102(this.field263, 0, var4, 0, this.field268);
                this.field263 = var4;
            }
            for (int var5 = this.field268; var5 < arg0; var5++) {
                this.field263[var5] = 32;
            }
            this.field268 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "(I)J", line = 585)
    private final long method129(int arg0) {
        long var2 = 0L;
        if (arg0 < 41) {
            this.method113(null, -64, 87, (byte) 85);
        }
        for (int var4 = 0; var4 < this.field268; var4++) {
            var2 = (var2 << 5) + ((long) (this.field263[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(III)Lj;", line = 609)
    public final class17 method130(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        class17 var5 = new class17();
        byte var6 = (byte) arg2;
        var5.field268 = this.field268;
        var5.field263 = new byte[this.field268];
        for (int var7 = arg0; var7 < this.field268; var7++) {
            byte var8 = this.field263[var7];
            if (var4 == var8) {
                var5.field263[var7] = var6;
            } else {
                var5.field263[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(II)I", line = 638)
    public final int method131(int arg0, int arg1) {
        int var3 = -120 % ((arg0 - 15) / 36);
        return this.method132(0, 65, arg1);
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(III)I", line = 649)
    private final int method132(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg1 < 56) {
            return -119;
        }
        for (int var5 = arg0; var5 < this.field268; var5++) {
            if (this.field263[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "(I)Lj;", line = 674)
    public final class17 method133(int arg0) {
        class17 var2 = new class17();
        if (arg0 != 32) {
            this.method134(null, true);
        }
        var2.field268 = this.field268;
        var2.field263 = new byte[this.field268];
        for (int var3 = 0; var3 < this.field268; var3++) {
            byte var4 = this.field263[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field263[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Lj;Z)Z", line = 702)
    public final boolean method134(class17 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field268 == arg0.field268) {
            if (!this.field261 || !arg0.field261) {
                if (this.field262 == 0) {
                    this.field262 = this.method122(-248);
                    if (this.field262 == 0) {
                        this.field262 = 1;
                    }
                }
                if (arg0.field262 == 0) {
                    arg0.field262 = arg0.method122(-248);
                    if (arg0.field262 == 0) {
                        arg0.field262 = 1;
                    }
                }
                if (this.field262 != arg0.field262) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field268; var3++) {
                if (this.field263[var3] != arg0.field263[var3]) {
                    return false;
                }
            }
            if (arg1) {
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(II)Lj;", line = 792)
    public final class17 method135(int arg0, int arg1) {
        if (arg0 >= arg1 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field261) {
            this.field262 = 0;
            if (this.field263.length == this.field268) {
                int var3;
                for (var3 = 1; var3 <= this.field268; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class14.method102(this.field263, 0, var4, 0, this.field268);
                this.field263 = var4;
            }
            this.field263[this.field268++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
