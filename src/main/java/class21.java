import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class21 implements class7 {

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Z")
    private boolean field261 = true;

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "Lk;")
    public static class21 field257 = class14.method92((byte) 57, "map");

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Lk;")
    public static class21 field260 = class14.method92((byte) 57, "Platelegs Shop");

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "Lk;")
    public static class21 field255 = class14.method92((byte) 57, "Tannery");

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "mapview!k", name = "m", descriptor = "[J")
    public static long[] field265 = new long[32];

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "Lk;")
    public static class21 field264 = class14.method92((byte) 57, "Anvil");

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Lk;")
    public static class21 field254 = class14.method92((byte) 57, "Apothecary");

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "I")
    public int field256;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field262;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!k", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field266;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "[B")
    public byte[] field259;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)I", line = 5)
    public final int method126(int arg0) {
        if (arg0 < 91) {
            this.method137((byte) -106);
        }
        return this.method141(38, 10);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IZI)I", line = 28)
    private final int method127(int arg0, boolean arg1, int arg2) {
        byte var4 = (byte) arg2;
        int var5 = arg0;
        if (arg1) {
            this.field261 = false;
        }
        while (var5 < this.field256) {
            if (this.field259[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)J", line = 54)
    private final long method128(int arg0) {
        if (arg0 != 255) {
            return -40L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field256; var4++) {
            var2 = (var2 << 5) + (long) (this.field259[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILjava/applet/Applet;)Lk;", line = 75)
    public final class21 method129(int arg0, Applet arg1) {
        String var3 = new String(this.field259, 0, this.field256);
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else if (arg0 == -58) {
            return class33.method195((byte) -124, var4);
        } else {
            return (class21) null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "hashCode", descriptor = "()I", line = 96)
    public final int hashCode() {
        return this.method135((byte) 119);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 116)
    public final void method130(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -103) {
            field253 = 27;
        }
        String var5;
        try {
            var5 = new String(this.field259, 0, this.field256, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field259, 0, this.field256);
        }
        arg1.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)V", line = 141)
    public static void method131(byte arg0) {
        field257 = null;
        field254 = null;
        field255 = null;
        field265 = null;
        field260 = null;
        field264 = null;
        field262 = null;
        if (arg0 != 42) {
            field260 = null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Lk;I)Z", line = 165)
    public final boolean method132(class21 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field256 == arg0.field256) {
            if (!this.field261 || !arg0.field261) {
                if (this.field258 == 0) {
                    this.field258 = this.method135((byte) -47);
                    if (this.field258 == 0) {
                        this.field258 = 1;
                    }
                }
                if (arg0.field258 == 0) {
                    arg0.field258 = arg0.method135((byte) -108);
                    if (arg0.field258 == 0) {
                        arg0.field258 = 1;
                    }
                }
                if (this.field258 != arg0.field258) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field256; var3++) {
                if (this.field259[var3] != arg0.field259[var3]) {
                    return false;
                }
            }
            if (arg1 != 24325) {
                this.method141(17, -90);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(I)Lk;", line = 223)
    public final class21 method133(int arg0) {
        long var2 = this.method128(255);
        synchronized (field266 == null ? (field266 = method145("k")) : field266) {
            if (class24.field293 == null) {
                class24.field293 = new class32(4096);
            } else {
                for (class28 var5 = (class28) class24.field293.method189(var2, -101); var5 != null; var5 = (class28) class24.field293.method190((byte) -108)) {
                    if (this.method132(var5.field340, 24325)) {
                        return var5.field340;
                    }
                }
            }
            class28 var6 = new class28();
            if (arg0 <= 38) {
                return (class21) null;
            } else {
                var6.field340 = this;
                this.field261 = false;
                class24.field293.method188(var2, (byte) -115, var6);
                return this;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 224)
    public static Class method145(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(III)Lk;", line = 269)
    public final class21 method134(int arg0, int arg1, int arg2) {
        class21 var4 = new class21();
        if (arg2 == -30761) {
            var4.field259 = new byte[arg0 - arg1];
            var4.field256 = arg0 - arg1;
            class31.method186(this.field259, arg1, var4.field259, 0, var4.field256);
            return var4;
        } else {
            return (class21) null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(B)I", line = 292)
    public final int method135(byte arg0) {
        int var2 = 0;
        int var3 = 71 % ((arg0 - 46) / 42);
        for (int var4 = 0; var4 < this.field256; var4++) {
            var2 = (this.field259[var4] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(I)Lk;", line = 327)
    public final class21 method136(int arg0) {
        if (!this.field261) {
            throw new IllegalArgumentException();
        }
        this.field258 = arg0;
        if (this.field259.length != this.field256) {
            byte[] var2 = new byte[this.field256];
            class31.method186(this.field259, 0, var2, 0, this.field256);
            this.field259 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(B)I", line = 356)
    public final int method137(byte arg0) {
        int var2 = 3 % ((-arg0 - 67) / 57);
        return this.field256;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(II)Lk;", line = 377)
    public final class21 method138(int arg0, int arg1) {
        if (arg0 != 10) {
            this.field258 = 96;
        }
        return this.method134(this.field256, arg1, -30761);
    }

    @OriginalMember(owner = "mapview!k", name = "toString", descriptor = "()Ljava/lang/String;", line = 402)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IZ)I", line = 410)
    public final int method139(int arg0, boolean arg1) {
        if (arg1) {
            this.field256 = 75;
        }
        return this.method127(0, false, arg0);
    }

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "(B)Lk;", line = 447)
    public final class21 method140(byte arg0) {
        class21 var2 = new class21();
        var2.field256 = this.field256;
        var2.field259 = new byte[this.field256];
        if (arg0 < 33) {
            this.method141(2, -47);
        }
        for (int var3 = 0; var3 < this.field256; var3++) {
            byte var4 = this.field259[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field259[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(II)I", line = 483)
    private final int method141(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        int var6 = 0;
        if (arg0 != 38) {
            this.field258 = 44;
        }
        while (this.field256 > var6) {
            label85: {
                int var7 = this.field259[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label85;
                    }
                    if (var7 == 43) {
                        break label85;
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
            var6++;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!k", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 566)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "(I)V", line = 588)
    public static final void method142(int arg0) {
        class8 var1 = class15.field195;
        synchronized (class15.field195) {
            class32.field386 = class27.field334;
            if (class22.field273 >= 0) {
                while (class25.field319 != class22.field273) {
                    int var2 = class17.field206[class25.field319];
                    class25.field319 = class25.field319 + 1 & 0x7F;
                    if (var2 < 0) {
                        class26.field326[~var2] = false;
                    } else {
                        class26.field326[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class26.field326[var3] = false;
                }
                class22.field273 = class25.field319;
            }
            if (arg0 == 127) {
                class27.field334 = class29.field355;
            }
        }
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(II)I", line = 629)
    public final int method143(int arg0, int arg1) {
        if (arg0 >= -1) {
            field254 = null;
        }
        return this.field259[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 646)
    public final int method144(FontMetrics arg0, int arg1) {
        int var3 = -46 % ((40 - arg1) / 58);
        String var4;
        try {
            var4 = new String(this.field259, 0, this.field256, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var4 = new String(this.field259, 0, this.field256);
        }
        return arg0.stringWidth(var4);
    }
}
