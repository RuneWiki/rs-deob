import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class31 implements class2 {

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Z")
    private boolean field334 = true;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Lt;")
    public static class31 field337 = class14.method84(110, "Cooking Range");

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "[[B")
    public static byte[][] field338 = new byte[1000][];

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "I")
    public int field339;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field340;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "[B")
    public byte[] field336;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)I", line = 11)
    public final int method180(byte arg0) {
        int var2 = 2 / ((arg0 - 70) / 43);
        return this.field339;
    }

    @OriginalMember(owner = "mapview!t", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 60)
    public final void method181(int arg0, Graphics arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field336, arg0, this.field339, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field336, 0, this.field339);
        }
        arg1.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(B)V", line = 73)
    public static void method182(byte arg0) {
        field338 = null;
        if (arg0 == 101) {
            field337 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(B)J", line = 91)
    private final long method183(byte arg0) {
        long var2 = 0L;
        if (arg0 <= 32) {
            this.field334 = true;
        }
        for (int var4 = 0; var4 < this.field339; var4++) {
            var2 = (var2 << 5) + (long) (this.field336[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)I", line = 133)
    public final int method184(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            method182((byte) 96);
        }
        for (int var3 = 0; var3 < this.field339; var3++) {
            var2 = (this.field336[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "hashCode", descriptor = "()I", line = 158)
    public final int hashCode() {
        return this.method184(false);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(Z)Lt;", line = 178)
    public final class31 method185(boolean arg0) {
        long var2 = this.method183((byte) 100);
        synchronized (field340 == null ? (field340 = method201("t")) : field340) {
            if (class28.field313 == null) {
                class28.field313 = new class30(4096);
            } else {
                for (class33 var5 = (class33) class28.field313.method176(-1, var2); var5 != null; var5 = (class33) class28.field313.method177(true)) {
                    if (this.method199(var5.field350, -123)) {
                        return var5.field350;
                    }
                }
            }
            class33 var6 = new class33();
            this.field334 = false;
            var6.field350 = this;
            class28.field313.method178(var6, var2, 1);
            if (!arg0) {
                this.field336 = null;
            }
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 179)
    public static Class method201(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 221)
    public final int method186(int arg0, FontMetrics arg1) {
        String var3;
        try {
            if (arg0 != -14282) {
                this.method199(null, 48);
            }
            var3 = new String(this.field336, 0, this.field339, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field336, 0, this.field339);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!t", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 238)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IZ)I", line = 251)
    public final int method187(int arg0, boolean arg1) {
        return arg1 ? 54 : this.method197(false, 0, arg0);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "([BIII)I", line = 264)
    public static final int method188(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = -1;
        for (int var5 = arg2; var5 < arg1; var5++) {
            var4 = class6.field54[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        int var7 = 102 / ((arg3 - 37) / 55);
        return var6;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 288)
    public final void method189(int arg0) {
        if (arg0 != -3878) {
            this.method197(true, 125, 112);
        }
        String var2;
        try {
            var2 = new String(this.field336, 0, this.field339, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field336, 0, this.field339);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(Z)I", line = 313)
    public final int method190(boolean arg0) {
        if (!arg0) {
            this.field335 = 9;
        }
        return this.method194(10, 17287);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)Lt;", line = 324)
    public final class31 method191(int arg0) {
        if (!this.field334) {
            throw new IllegalArgumentException();
        }
        this.field335 = 0;
        if (arg0 != -81) {
            return (class31) null;
        }
        if (this.field336.length != this.field339) {
            byte[] var2 = new byte[this.field339];
            class9.method51(this.field336, 0, var2, 0, this.field339);
            this.field336 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILjava/applet/Applet;)Lt;", line = 357)
    public final class31 method192(int arg0, Applet arg1) {
        String var3 = new String(this.field336, 0, this.field339);
        String var4 = arg1.getParameter(var3);
        if (arg0 == 97) {
            return var4 == null ? null : class25.method163(var4, -1);
        } else {
            return (class31) null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(I)Lt;", line = 377)
    public final class31 method193(int arg0) {
        if (arg0 != -5015) {
            this.field336 = null;
        }
        class31 var2 = new class31();
        var2.field339 = this.field339;
        var2.field336 = new byte[this.field339];
        for (int var3 = 0; var3 < this.field339; var3++) {
            byte var4 = this.field336[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field336[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)I", line = 408)
    private final int method194(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        if (arg1 != 17287) {
            return -127;
        }
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field339; var6++) {
            int var7 = this.field336[var6] & 0xFF;
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
            if (arg0 <= var7) {
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

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lka;", line = 486)
    public static final class20 method195(Throwable arg0, String arg1) {
        class20 var2;
        if (arg0 instanceof class20) {
            var2 = (class20) arg0;
            var2.field171 = var2.field171 + ' ' + arg1;
        } else {
            var2 = new class20(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(II)Lt;", line = 505)
    public final class31 method196(int arg0, int arg1) {
        int var3 = -47 % ((-arg0 - 34) / 41);
        return this.method200(this.field339, -114, arg1);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ZII)I", line = 523)
    private final int method197(boolean arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field339; var5++) {
            if (this.field336[var5] == var4) {
                return var5;
            }
        }
        if (arg0) {
            this.method180((byte) -122);
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IZ)I", line = 564)
    public final int method198(int arg0, boolean arg1) {
        if (!arg1) {
            this.method197(false, 81, -31);
        }
        return this.field336[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lt;I)Z", line = 600)
    public final boolean method199(class31 arg0, int arg1) {
        if (arg1 != -123) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else if (this.field339 == arg0.field339) {
            if (!this.field334 || !arg0.field334) {
                if (this.field335 == 0) {
                    this.field335 = this.method184(false);
                    if (this.field335 == 0) {
                        this.field335 = 1;
                    }
                }
                if (arg0.field335 == 0) {
                    arg0.field335 = arg0.method184(false);
                    if (arg0.field335 == 0) {
                        arg0.field335 = 1;
                    }
                }
                if (this.field335 != arg0.field335) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field339; var3++) {
                if (this.field336[var3] != arg0.field336[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)Lt;", line = 653)
    public final class31 method200(int arg0, int arg1, int arg2) {
        if (arg1 >= -26) {
            this.toString();
        }
        class31 var4 = new class31();
        var4.field336 = new byte[arg0 - arg2];
        var4.field339 = arg0 - arg2;
        class9.method51(this.field336, arg2, var4.field336, 0, var4.field339);
        return var4;
    }
}
