import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 implements class27 {

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "Z")
    private boolean field346 = true;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Ln;")
    public static class26 field342 = class9.method82(255, "Estate Agent");

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field345 = -1;

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Ln;")
    public static class26 field350 = class9.method82(255, "Shield Shop");

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "Ln;")
    public static class26 field351 = class9.method82(255, "Brewery");

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "Ln;")
    public static class26 field356 = class9.method82(255, "Requesting ");

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "I")
    public static volatile int field355 = 0;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "Lh;")
    public static class15 field349;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Ls;")
    private static class34 field343;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Le;")
    public static class9 field348;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field357;

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "[B")
    public byte[] field354;

    @OriginalMember(owner = "mapview!n", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 10)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(II)V", line = 37)
    public final void method179(int arg0, int arg1) {
        this.field344 = 0;
        if (!this.field346) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field354.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class37.method243(this.field354, 0, var4, 0, this.field347);
                this.field354 = var4;
            }
            for (int var5 = this.field347; var5 < arg1; var5++) {
                this.field354[var5] = 32;
            }
            int var6 = -63 % ((arg0 - 66) / 53);
            this.field347 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IBI)Ln;", line = 100)
    public final class26 method180(int arg0, byte arg1, int arg2) {
        class26 var4 = new class26();
        var4.field347 = arg2 - arg0;
        var4.field354 = new byte[arg2 - arg0];
        int var5 = 86 % ((71 - arg1) / 32);
        class37.method243(this.field354, arg0, var4.field354, 0, var4.field347);
        return var4;
    }

    @OriginalMember(owner = "mapview!n", name = "toString", descriptor = "()Ljava/lang/String;", line = 115)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 130)
    public final void method181(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field354, 0, this.field347, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field354, 0, this.field347);
        }
        arg0.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(II)I", line = 156)
    private final int method182(int arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        for (int var6 = 0; var6 < this.field347; var6++) {
            int var7 = this.field354[var6] & 0xFF;
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
                throw new NumberFormatException();
            }
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var3 = true;
        }
        if (arg1 >= -95) {
            field351 = null;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ln;B)I", line = 234)
    public final int method183(class26 arg0, byte arg1) {
        int var3;
        if (arg0.field347 >= this.field347) {
            var3 = this.field347;
        } else {
            var3 = arg0.field347;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0.field354[var4] > this.field354[var4]) {
                return -1;
            }
            if (this.field354[var4] > arg0.field354[var4]) {
                return 1;
            }
        }
        if (arg1 != 100) {
            field351 = null;
        }
        if (arg0.field347 > this.field347) {
            return -1;
        } else if (arg0.field347 < this.field347) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(II)Ln;", line = 273)
    public final class26 method184(int arg0, int arg1) {
        if (arg1 < 102) {
            field350 = null;
        }
        return this.method180(arg0, (byte) -42, this.field347);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)J", line = 288)
    private final long method185(int arg0) {
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != -13165) {
            this.method200(-77);
        }
        while (this.field347 > var4) {
            var2 = (var2 << 5) + (long) (this.field354[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IB)I", line = 308)
    public final int method186(int arg0, byte arg1) {
        return arg1 == 3 ? this.field354[arg0] & 0xFF : 39;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(III)I", line = 327)
    private final int method187(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        if (arg2 != -1) {
            this.method198(null, (byte) -101);
        }
        for (int var5 = arg0; var5 < this.field347; var5++) {
            if (this.field354[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)I", line = 363)
    public final int method188(byte arg0) {
        int var2 = -99 % ((19 - arg0) / 46);
        return this.method182(10, -119);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Lla;Ln;BLn;)Lk;", line = 382)
    public static final class20 method189(class23 arg0, class26 arg1, byte arg2, class26 arg3) {
        int var4 = arg0.method159((byte) 111, arg1);
        int var5 = 124 / ((58 - arg2) / 62);
        int var6 = arg0.method160(var4, arg3, -12935);
        return class17.method131(var6, true, var4, arg0);
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 396)
    public static void method190(int arg0) {
        field343 = null;
        field351 = null;
        field349 = null;
        if (arg0 != -10035) {
            field349 = null;
        }
        field348 = null;
        field356 = null;
        field350 = null;
        field342 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "(II)Ln;", line = 431)
    public final class26 method191(int arg0, int arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (arg1 > -116) {
            return (class26) null;
        } else if (this.field346) {
            this.field344 = 0;
            if (this.field354.length == this.field347) {
                int var3;
                for (var3 = 1; var3 <= this.field347; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class37.method243(this.field354, 0, var4, 0, this.field347);
                this.field354 = var4;
            }
            this.field354[this.field347++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!n", name = "hashCode", descriptor = "()I", line = 471)
    public final int hashCode() {
        return this.method195((byte) 85);
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(I)Ln;", line = 504)
    public final class26 method192(int arg0) {
        class26 var2 = new class26();
        var2.field347 = this.field347;
        var2.field354 = new byte[this.field347];
        for (int var3 = 0; var3 < this.field347; var3++) {
            byte var4 = this.field354[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field354[var3] = var4;
        }
        if (arg0 != -34) {
            field356 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "(I)Ln;", line = 532)
    public final class26 method193(int arg0) {
        long var2 = this.method185(-13165);
        synchronized (field357 == null ? (field357 = method202("n")) : field357) {
            if (field343 == null) {
                field343 = new class34(4096);
            } else {
                for (class11 var5 = (class11) field343.method234(var2, 123); var5 != null; var5 = (class11) field343.method231((byte) -94)) {
                    if (this.method198(var5.field206, (byte) 112)) {
                        return var5.field206;
                    }
                }
            }
            if (arg0 != -123) {
                this.method200(-28);
            }
            class11 var6 = new class11();
            this.field346 = false;
            var6.field206 = this;
            field343.method235(var2, var6, (byte) -59);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 533)
    public static Class method202(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "(II)I", line = 571)
    public final int method194(int arg0, int arg1) {
        return arg0 == -123 ? this.method187(0, arg1, arg0 + 122) : 25;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(B)I", line = 590)
    public final int method195(byte arg0) {
        int var2 = 0;
        if (arg0 <= 23) {
            field355 = -57;
        }
        for (int var3 = 0; var3 < this.field347; var3++) {
            var2 = (this.field354[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ILjava/applet/Applet;)Ln;", line = 624)
    public final class26 method196(int arg0, Applet arg1) {
        String var3 = new String(this.field354, 0, this.field347);
        String var4 = arg1.getParameter(var3);
        if (arg0 != -97) {
            this.method181(null, -108, 109, 104);
        }
        return var4 == null ? null : class14.method111(var4, 0);
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Z)I", line = 646)
    public final int method197(boolean arg0) {
        if (!arg0) {
            field356 = null;
        }
        return this.field347;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(Ln;B)Z", line = 669)
    public final boolean method198(class26 arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field347 == arg0.field347) {
            if (!this.field346 || !arg0.field346) {
                if (this.field344 == 0) {
                    this.field344 = this.method195((byte) 77);
                    if (this.field344 == 0) {
                        this.field344 = 1;
                    }
                }
                if (arg0.field344 == 0) {
                    arg0.field344 = arg0.method195((byte) 115);
                    if (arg0.field344 == 0) {
                        arg0.field344 = 1;
                    }
                }
                if (this.field344 != arg0.field344) {
                    return false;
                }
            }
            if (arg1 <= 107) {
                return false;
            }
            for (int var3 = 0; var3 < this.field347; var3++) {
                if (this.field354[var3] != arg0.field354[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 723)
    public final int method199(int arg0, FontMetrics arg1) {
        if (arg0 != -16640) {
            field349 = null;
        }
        String var3;
        try {
            var3 = new String(this.field354, 0, this.field347, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field354, 0, this.field347);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "(I)Ln;", line = 742)
    public final class26 method200(int arg0) {
        if (!this.field346) {
            throw new IllegalArgumentException();
        }
        this.field344 = 0;
        if (arg0 >= -59) {
            this.equals(null);
        }
        if (this.field354.length != this.field347) {
            byte[] var2 = new byte[this.field347];
            class37.method243(this.field354, 0, var2, 0, this.field347);
            this.field354 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(III)Ln;", line = 772)
    public final class26 method201(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class26 var6 = new class26();
        var6.field347 = this.field347;
        var6.field354 = new byte[this.field347];
        for (int var7 = 0; var7 < this.field347; var7++) {
            byte var8 = this.field354[var7];
            if (var5 == var8) {
                var6.field354[var7] = var4;
            } else {
                var6.field354[var7] = var8;
            }
        }
        if (arg0 != 21033) {
            this.method198(null, (byte) -88);
        }
        return var6;
    }
}
