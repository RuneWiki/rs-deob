import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class31 implements class20 {

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "Z")
    private boolean field351 = true;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Lt;")
    public static class31 field341 = class11.method64(109, "Short)2cut");

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "I")
    public static int field348 = 1;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lt;")
    public static class31 field342 = class11.method64(103, "Helmet Shop");

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Lt;")
    public static class31 field353 = class11.method64(-79, "world");

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "Lt;")
    public static class31 field355 = class11.method64(94, "Spice Shop");

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "I")
    public static int field354;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field356;

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "[B")
    public byte[] field349;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "[I")
    public static int[] field344;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)I", line = 9)
    public final int method162(int arg0) {
        int var2 = 0;
        if (arg0 != -98) {
            this.toString();
        }
        for (int var3 = 0; var3 < this.field345; var3++) {
            var2 = (var2 << 5) + (this.field349[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IBI)I", line = 29)
    private final int method163(int arg0, byte arg1, int arg2) {
        byte var4 = (byte) arg2;
        int var5 = arg0;
        int var6 = -106 % ((arg1 + 26) / 41);
        while (var5 < this.field345) {
            if (this.field349[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BI)I", line = 52)
    public final int method164(byte arg0, int arg1) {
        if (arg0 != 66) {
            this.method172(-47);
        }
        return this.method163(0, (byte) 126, arg1);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BLt;)Z", line = 69)
    public final boolean method165(byte arg0, class31 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field345 == arg1.field345) {
            if (!this.field351 || !arg1.field351) {
                if (this.field343 == 0) {
                    this.field343 = this.method162(-98);
                    if (this.field343 == 0) {
                        this.field343 = 1;
                    }
                }
                if (arg1.field343 == 0) {
                    arg1.field343 = arg1.method162(-98);
                    if (arg1.field343 == 0) {
                        arg1.field343 = 1;
                    }
                }
                if (this.field343 != arg1.field343) {
                    return false;
                }
            }
            if (arg0 != 90) {
                field342 = null;
            }
            for (int var3 = 0; var3 < this.field345; var3++) {
                if (this.field349[var3] != arg1.field349[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IIILv;)Ld;", line = 146)
    public static final class7 method166(int arg0, int arg1, int arg2, class33 arg3) {
        if (arg0 != -32) {
            field352 = 86;
        }
        return class15.method88(arg3, (byte) 109, arg2, arg1) ? class15.method86((byte) -80) : null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)Lt;", line = 167)
    public final class31 method167(int arg0, int arg1, int arg2) {
        if (arg0 >= -117) {
            return (class31) null;
        }
        class31 var4 = new class31();
        var4.field345 = arg1 - arg2;
        var4.field349 = new byte[arg1 - arg2];
        class5.method47(this.field349, arg2, var4.field349, 0, var4.field345);
        return var4;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IB)I", line = 202)
    public final int method168(int arg0, byte arg1) {
        if (arg1 != 97) {
            this.field345 = -100;
        }
        return this.field349[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!t", name = "toString", descriptor = "()Ljava/lang/String;", line = 243)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)Lt;", line = 260)
    public final class31 method169(byte arg0) {
        long var2 = this.method175((byte) 108);
        synchronized (field356 == null ? (field356 = method181("t")) : field356) {
            if (class18.field246 == null) {
                class18.field246 = new class27(4096);
            } else {
                for (class18 var5 = (class18) class18.field246.method153(-127, var2); var5 != null; var5 = (class18) class18.field246.method154((byte) 63)) {
                    if (this.method165((byte) 90, var5.field249)) {
                        return var5.field249;
                    }
                }
            }
            if (arg0 != -6) {
                return (class31) null;
            }
            class18 var6 = new class18();
            var6.field249 = this;
            this.field351 = false;
            class18.field246.method151(var6, 126, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 261)
    public static Class method181(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 305)
    public final int method170(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field349, arg1, this.field345, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field349, 0, this.field345);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 328)
    public static void method171(int arg0) {
        field353 = null;
        field355 = null;
        int var1 = 97 % ((arg0 - 24) / 62);
        field341 = null;
        field344 = null;
        field342 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(I)Lt;", line = 351)
    public final class31 method172(int arg0) {
        class31 var2 = new class31();
        var2.field345 = this.field345;
        var2.field349 = new byte[this.field345];
        for (int var3 = arg0; var3 < this.field345; var3++) {
            byte var4 = this.field349[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field349[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)I", line = 381)
    public final int method173(boolean arg0) {
        if (arg0) {
            this.method180(75);
        }
        return this.field345;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IB)Lt;", line = 391)
    public final class31 method174(int arg0, byte arg1) {
        if (arg1 != -71) {
            field352 = 42;
        }
        return this.method167(-123, this.field345, arg0);
    }

    @OriginalMember(owner = "mapview!t", name = "hashCode", descriptor = "()I", line = 408)
    public final int hashCode() {
        return this.method162(-98);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(B)J", line = 416)
    private final long method175(byte arg0) {
        if (arg0 < 74) {
            this.method162(76);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field345; var4++) {
            var2 = (var2 << 5) + (long) (this.field349[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILjava/applet/Applet;)Lt;", line = 439)
    public final class31 method176(int arg0, Applet arg1) {
        if (arg0 == 32007) {
            String var3 = new String(this.field349, 0, this.field345);
            String var4 = arg1.getParameter(var3);
            return var4 == null ? null : class25.method133(123, var4);
        } else {
            return (class31) null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 467)
    public final void method177(Graphics arg0, int arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field349, 0, this.field345, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field349, 0, this.field345);
        }
        arg0.drawString(var5, arg2, arg3);
        if (arg1 != 5320) {
            field355 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 486)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)I", line = 495)
    private final int method178(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 != -46) {
            return -75;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field345; var6++) {
            int var7 = this.field349[var6] & 0xFF;
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
            var3 = true;
            var5 = var8;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(I)I", line = 568)
    public final int method179(int arg0) {
        return arg0 < 19 ? 60 : this.method178(10, -46);
    }

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "(I)Lt;", line = 591)
    public final class31 method180(int arg0) {
        if (!this.field351) {
            throw new IllegalArgumentException();
        }
        this.field343 = 0;
        if (this.field349.length != this.field345) {
            byte[] var2 = new byte[this.field345];
            class5.method47(this.field349, 0, var2, 0, this.field345);
            this.field349 = var2;
        }
        if (arg0 > -95) {
            this.field351 = true;
        }
        return this;
    }
}
