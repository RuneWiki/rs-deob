import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 implements class16 {

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "Z")
    private boolean field468 = true;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Lr;")
    public static class33 field460 = class29.method192("Slayer Master", (byte) 126);

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "Lr;")
    public static class33 field459 = class29.method192("Makeover Mage", (byte) 126);

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "Lr;")
    public static class33 field464 = class29.method192("Loading )3)3)3", (byte) 126);

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Z")
    public static volatile boolean field463 = false;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[I")
    public static int[] field466 = new int[128];

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "J")
    public static long field471 = 0L;

    @OriginalMember(owner = "mapview!r", name = "n", descriptor = "I")
    public static int field472 = 0;

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "Lr;")
    public static class33 field473 = class29.method192("overlay2)3dat", (byte) 126);

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "Lr;")
    public static class33 field467 = class29.method192("world", (byte) 126);

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "Lr;")
    public static class33 field474 = class29.method192("Key", (byte) 126);

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "I")
    public int field470;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field475;

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Ljava/lang/String;")
    public static String field462;

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "[B")
    public byte[] field465;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lr;I)I", line = 7)
    public final int method208(class33 arg0, int arg1) {
        int var3;
        if (arg0.field470 < this.field470) {
            var3 = arg0.field470;
        } else {
            var3 = this.field470;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field465[var4] & 0xFF) < (arg0.field465[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field465[var4] & 0xFF) > (arg0.field465[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1 != 7018) {
            this.equals(null);
        }
        if (this.field470 < arg0.field470) {
            return -1;
        } else if (arg0.field470 < this.field470) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BI)I", line = 46)
    public final int method209(byte arg0, int arg1) {
        int var3 = 31 / ((arg0 - 45) / 47);
        return this.field465[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I[B)[B", line = 59)
    public static final byte[] method210(int arg0, byte[] arg1) {
        class20 var2 = new class20(arg1);
        int var3 = var2.method133(23789);
        int var4 = var2.method128(3);
        if (arg0 != 0) {
            method229((byte) -4);
        }
        if (var4 < 0 || class30.field433 != 0 && class30.field433 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method134(var4, var5, 0, 3);
            return var5;
        } else {
            int var6 = var2.method128(arg0 + 3);
            if (var6 < 0 || class30.field433 != 0 && var6 > class30.field433) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class28.method182(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IB)Lr;", line = 124)
    public final class33 method211(int arg0, byte arg1) {
        int var3 = 49 / ((arg1 - 36) / 55);
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field468) {
            this.field469 = 0;
            if (this.field465.length == this.field470) {
                int var4;
                for (var4 = 1; var4 <= this.field470; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class34.method234(this.field465, 0, var5, 0, this.field470);
                this.field465 = var5;
            }
            this.field465[this.field470++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!r", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 164)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class33)) {
            throw new IllegalArgumentException();
        }
        return this.method222((class33) arg0, (byte) 54);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(III)I", line = 194)
    private final int method212(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field466 = null;
        }
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field470; var5++) {
            if (this.field465[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(BI)Lr;", line = 222)
    public static final class33 method213(byte arg0, int arg1) {
        return arg0 < 46 ? (class33) null : class17.method103((byte) 43, 10, false, arg1);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)I", line = 235)
    public final int method214(int arg0, int arg1) {
        return arg0 == -11509 ? this.method212(-1, 0, arg1) : 40;
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(IB)Lr;", line = 246)
    public final class33 method215(int arg0, byte arg1) {
        if (arg1 >= -63) {
            this.method216(-71, (byte) -36);
        }
        return this.method225(arg0, this.field470, (byte) -74);
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(IB)V", line = 258)
    public final void method216(int arg0, byte arg1) {
        this.field469 = 0;
        int var3 = -94 % ((27 - arg1) / 49);
        if (!this.field468) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field465.length) {
                int var4;
                for (var4 = 1; var4 < arg0; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class34.method234(this.field465, 0, var5, 0, this.field470);
                this.field465 = var5;
            }
            for (int var6 = this.field470; var6 < arg0; var6++) {
                this.field465[var6] = 32;
            }
            this.field470 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 306)
    public final void method217(int arg0) {
        String var2;
        try {
            var2 = new String(this.field465, arg0, this.field470, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field465, 0, this.field470);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I", line = 320)
    public final int method218(FontMetrics arg0, boolean arg1) {
        if (arg1) {
            field466 = null;
        }
        String var3;
        try {
            var3 = new String(this.field465, 0, this.field470, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field465, 0, this.field470);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)Lr;", line = 341)
    public final class33 method219(int arg0) {
        long var2 = this.method223(-32308);
        synchronized (field475 == null ? (field475 = method233("r")) : field475) {
            if (class22.field242 == null) {
                class22.field242 = new class10(4096);
            } else {
                for (class38 var5 = (class38) class22.field242.method60(-16091, var2); var5 != null; var5 = (class38) class22.field242.method66(32)) {
                    if (this.method222(var5.field506, (byte) 65)) {
                        return var5.field506;
                    }
                }
            }
            if (arg0 != 21164) {
                return (class33) null;
            }
            class38 var6 = new class38();
            var6.field506 = this;
            this.field468 = false;
            class22.field242.method64(var6, false, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 342)
    public static Class method233(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(I)I", line = 391)
    public final int method220(int arg0) {
        if (arg0 != 0) {
            this.method218(null, true);
        }
        return this.method227(10, 122);
    }

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "(I)I", line = 414)
    public final int method221(int arg0) {
        int var2 = -65 / ((arg0 - 21) / 61);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field470; var4++) {
            var3 = (var3 << 5) - (var3 - (this.field465[var4] & 0xFF));
        }
        return var3;
    }

    @OriginalMember(owner = "mapview!r", name = "toString", descriptor = "()Ljava/lang/String;", line = 452)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lr;B)Z", line = 473)
    public final boolean method222(class33 arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field470 == arg0.field470) {
            if (!this.field468 || !arg0.field468) {
                if (this.field469 == 0) {
                    this.field469 = this.method221(-123);
                    if (this.field469 == 0) {
                        this.field469 = 1;
                    }
                }
                if (arg0.field469 == 0) {
                    arg0.field469 = arg0.method221(120);
                    if (arg0.field469 == 0) {
                        arg0.field469 = 1;
                    }
                }
                if (this.field469 != arg0.field469) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg1 <= 26) {
                return true;
            }
            while (this.field470 > var3) {
                if (this.field465[var3] != arg0.field465[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "(I)J", line = 528)
    private final long method223(int arg0) {
        if (arg0 != -32308) {
            this.toString();
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field470; var4++) {
            var2 = (var2 << 5) + (long) (this.field465[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)I", line = 550)
    public final int method224(boolean arg0) {
        if (arg0) {
            this.field465 = null;
        }
        return this.field470;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IIB)Lr;", line = 567)
    public final class33 method225(int arg0, int arg1, byte arg2) {
        class33 var4 = new class33();
        var4.field470 = arg1 - arg0;
        var4.field465 = new byte[arg1 - arg0];
        if (arg2 != -74) {
            field472 = -111;
        }
        class34.method234(this.field465, arg0, var4.field465, 0, var4.field470);
        return var4;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)Lr;", line = 590)
    public final class33 method226(byte arg0) {
        if (!this.field468) {
            throw new IllegalArgumentException();
        }
        if (arg0 <= 0) {
            field462 = null;
        }
        this.field469 = 0;
        if (this.field465.length != this.field470) {
            byte[] var2 = new byte[this.field470];
            class34.method234(this.field465, 0, var2, 0, this.field470);
            this.field465 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(II)I", line = 621)
    private final int method227(int arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var5 = false;
        int var6 = -12 % (arg1 / 35);
        for (int var7 = 0; var7 < this.field470; var7++) {
            int var8 = this.field465[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var4 = true;
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
            if (arg0 <= var8) {
                throw new NumberFormatException();
            }
            if (var4) {
                var8 = -var8;
            }
            int var9 = arg0 * var3 + var8;
            if (var9 / arg0 != var3) {
                throw new NumberFormatException();
            }
            var5 = true;
            var3 = var9;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var3;
    }

    @OriginalMember(owner = "mapview!r", name = "hashCode", descriptor = "()I", line = 697)
    public final int hashCode() {
        return this.method221(-127);
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(B)Lr;", line = 716)
    public final class33 method228(byte arg0) {
        class33 var2 = new class33();
        var2.field470 = this.field470;
        var2.field465 = new byte[this.field470];
        if (arg0 != 36) {
            return (class33) null;
        }
        for (int var3 = 0; var3 < this.field470; var3++) {
            byte var4 = this.field465[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field465[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(B)V", line = 753)
    public static void method229(byte arg0) {
        field460 = null;
        field462 = null;
        field474 = null;
        field464 = null;
        field459 = null;
        field473 = null;
        field467 = null;
        if (arg0 == 81) {
            field466 = null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BII)Lr;", line = 796)
    public final class33 method230(byte arg0, int arg1, int arg2) {
        if (arg0 != -63) {
            field461 = -92;
        }
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class33 var6 = new class33();
        var6.field470 = this.field470;
        var6.field465 = new byte[this.field470];
        for (int var7 = 0; var7 < this.field470; var7++) {
            byte var8 = this.field465[var7];
            if (var5 == var8) {
                var6.field465[var7] = var4;
            } else {
                var6.field465[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/applet/Applet;B)Lr;", line = 841)
    public final class33 method231(Applet arg0, byte arg1) {
        String var3 = new String(this.field465, 0, this.field470);
        if (arg1 <= 17) {
            field467 = null;
        }
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class10.method61(var4, (byte) -92);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 872)
    public final void method232(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field465, 0, this.field470, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field465, 0, this.field470);
        }
        arg0.drawString(var5, arg3, arg1);
    }
}
