import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class38 implements class5 {

    @OriginalMember(owner = "mapview!u", name = "i", descriptor = "Z")
    private boolean field486 = true;

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "Lu;")
    public static class38 field481 = class28.method177("Requesting", (byte) -84);

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Lu;")
    public static class38 field480 = class28.method177("Next page", (byte) -84);

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Lm;")
    public static class25 field482 = null;

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "Lu;")
    public static class38 field488 = class28.method177("Windmill", (byte) -84);

    @OriginalMember(owner = "mapview!u", name = "r", descriptor = "Lu;")
    public static class38 field495 = class28.method177("Woodcutting stump", (byte) -84);

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Lu;")
    public static class38 field487 = class28.method177("floorcol)3dat", (byte) -84);

    @OriginalMember(owner = "mapview!u", name = "o", descriptor = "Lu;")
    public static class38 field492 = class28.method177("Magic Shop", (byte) -84);

    @OriginalMember(owner = "mapview!u", name = "m", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "mapview!u", name = "n", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "mapview!u", name = "q", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "mapview!u", name = "g", descriptor = "Lt;")
    public static class37 field484;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lua;")
    public static class39 field478;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!u", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field496;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "[B")
    public byte[] field483;

    @OriginalMember(owner = "mapview!u", name = "h", descriptor = "[I")
    public static int[] field485;

    @OriginalMember(owner = "mapview!u", name = "p", descriptor = "[I")
    public static int[] field493;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)J", line = 7)
    private final long method219(byte arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field494; var4++) {
            var2 = (var2 << 5) + (long) (this.field483[var4] & 0xFF) - var2;
        }
        int var5 = -126 % ((arg0 + 27) / 36);
        return var2;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(III)I", line = 26)
    private final int method220(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        for (int var5 = arg1; var5 < this.field494; var5++) {
            if (this.field483[var5] == var4) {
                return var5;
            }
        }
        if (arg2 >= -112) {
            field488 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IIZ)Lu;", line = 54)
    public final class38 method221(int arg0, int arg1, boolean arg2) {
        byte var4 = (byte) arg0;
        byte var5 = (byte) arg1;
        class38 var6 = new class38();
        var6.field494 = this.field494;
        var6.field483 = new byte[this.field494];
        if (arg2) {
            return (class38) null;
        }
        for (int var7 = 0; var7 < this.field494; var7++) {
            byte var8 = this.field483[var7];
            if (var4 == var8) {
                var6.field483[var7] = var5;
            } else {
                var6.field483[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(II)V", line = 95)
    public final void method222(int arg0, int arg1) {
        this.field491 = 0;
        if (!this.field486) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field483.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class13.method63(this.field483, 0, var4, 0, this.field494);
                this.field483 = var4;
            }
            if (arg1 != -8334) {
                this.method231((byte) 79);
            }
            for (int var5 = this.field494; var5 < arg0; var5++) {
                this.field483[var5] = 32;
            }
            this.field494 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(II)Lu;", line = 145)
    public final class38 method223(int arg0, int arg1) {
        int var3 = 87 % ((67 - arg0) / 38);
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field486) {
            this.field491 = 0;
            if (this.field483.length == this.field494) {
                int var4;
                for (var4 = 1; var4 <= this.field494; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class13.method63(this.field483, 0, var5, 0, this.field494);
                this.field483 = var5;
            }
            this.field483[this.field494++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IB)I", line = 180)
    public final int method224(int arg0, byte arg1) {
        if (arg1 > -14) {
            field495 = null;
        }
        return this.method220(arg0, 0, -113);
    }

    @OriginalMember(owner = "mapview!u", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 196)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class38)) {
            throw new IllegalArgumentException();
        }
        return this.method229((class38) arg0, 106);
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(B)I", line = 210)
    public final int method225(byte arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field494; var3++) {
            var2 = (this.field483[var3] & 0xFF) + (var2 << 5) - var2;
        }
        if (arg0 > -100) {
            this.method241(62);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IZI)Lu;", line = 229)
    public final class38 method226(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return (class38) null;
        }
        class38 var4 = new class38();
        var4.field483 = new byte[arg0 - arg2];
        var4.field494 = arg0 - arg2;
        class13.method63(this.field483, arg2, var4.field483, 0, var4.field494);
        return var4;
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(II)I", line = 246)
    public final int method227(int arg0, int arg1) {
        if (arg0 != -58) {
            return -97;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field494; var6++) {
            int var7 = this.field483[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
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

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(B)Lu;", line = 320)
    public final class38 method228(byte arg0) {
        if (!this.field486) {
            throw new IllegalArgumentException();
        } else if (arg0 == 116) {
            this.field491 = 0;
            if (this.field483.length != this.field494) {
                byte[] var2 = new byte[this.field494];
                class13.method63(this.field483, 0, var2, 0, this.field494);
                this.field483 = var2;
            }
            return this;
        } else {
            return (class38) null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lu;I)Z", line = 351)
    public final boolean method229(class38 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field494 == arg0.field494) {
            if (!this.field486 || !arg0.field486) {
                if (this.field491 == 0) {
                    this.field491 = this.method225((byte) -127);
                    if (this.field491 == 0) {
                        this.field491 = 1;
                    }
                }
                if (arg0.field491 == 0) {
                    arg0.field491 = arg0.method225((byte) -113);
                    if (arg0.field491 == 0) {
                        arg0.field491 = 1;
                    }
                }
                if (this.field491 != arg0.field491) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field494; var3++) {
                if (this.field483[var3] != arg0.field483[var3]) {
                    return false;
                }
            }
            int var4 = -115 % ((12 - arg1) / 52);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(II)Lu;", line = 407)
    public final class38 method230(int arg0, int arg1) {
        if (arg0 != 0) {
            field492 = null;
        }
        return this.method226(this.field494, true, arg1);
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(B)I", line = 427)
    public final int method231(byte arg0) {
        int var2 = -40 / ((-arg0 - 53) / 60);
        return this.field494;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lu;B)Z", line = 444)
    public final boolean method232(class38 arg0, byte arg1) {
        if (arg0.field494 > this.field494) {
            return false;
        }
        if (arg1 != -49) {
            field489 = -31;
        }
        for (int var3 = 0; var3 < arg0.field494; var3++) {
            if (this.field483[var3] != arg0.field483[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(Lu;B)I", line = 471)
    public final int method233(class38 arg0, byte arg1) {
        if (arg1 != 33) {
            this.method231((byte) 122);
        }
        int var3;
        if (arg0.field494 < this.field494) {
            var3 = arg0.field494;
        } else {
            var3 = this.field494;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field483[var4] & 0xFF) > (this.field483[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field483[var4] & 0xFF) < (this.field483[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field494 > this.field494) {
            return -1;
        } else if (this.field494 > arg0.field494) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(B)V", line = 518)
    public static void method234(byte arg0) {
        field481 = null;
        field480 = null;
        field493 = null;
        field484 = null;
        field485 = null;
        field495 = null;
        field492 = null;
        field488 = null;
        field487 = null;
        field478 = null;
        int var1 = 92 / ((arg0 + 8) / 50);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Lb;IIILb;)Lk;", line = 537)
    public static final class21 method235(class3 arg0, int arg1, int arg2, int arg3, class3 arg4) {
        if (class7.method39(arg4, (byte) -19, arg1, arg3)) {
            if (arg2 != -49) {
                field488 = null;
            }
            return class1.method4(-26802, arg0.method15(arg1, (byte) -91, arg3));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 580)
    public final void method236(int arg0) {
        String var2;
        try {
            var2 = new String(this.field483, arg0, this.field494, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field483, 0, this.field494);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!u", name = "toString", descriptor = "()Ljava/lang/String;", line = 595)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!u", name = "hashCode", descriptor = "()I", line = 628)
    public final int hashCode() {
        return this.method225((byte) -118);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V", line = 671)
    public final void method237(Graphics arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field486 = false;
        }
        String var5;
        try {
            var5 = new String(this.field483, 0, this.field494, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field483, 0, this.field494);
        }
        arg0.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I", line = 696)
    public final int method238(FontMetrics arg0, boolean arg1) {
        if (!arg1) {
            field493 = null;
        }
        String var3;
        try {
            var3 = new String(this.field483, 0, this.field494, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field483, 0, this.field494);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)I", line = 718)
    public final int method239(int arg0) {
        if (arg0 != 10) {
            field492 = null;
        }
        return this.method227(-58, 10);
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IILjava/awt/Component;B)Lp;", line = 738)
    public static final class31 method240(int arg0, int arg1, Component arg2, byte arg3) {
        try {
            if (arg3 == -16) {
                Class var4 = Class.forName("s");
                class31 var5 = (class31) var4.getDeclaredConstructor().newInstance();
                var5.method131(arg2, arg0, arg1, -98);
                return var5;
            } else {
                return (class31) null;
            }
        } catch (Throwable var8) {
            class23 var7 = new class23();
            var7.method131(arg2, arg0, arg1, -83);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "(I)Lu;", line = 765)
    public final class38 method241(int arg0) {
        class38 var2 = new class38();
        var2.field494 = this.field494;
        var2.field483 = new byte[this.field494];
        for (int var3 = arg0; var3 < this.field494; var3++) {
            byte var4 = this.field483[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field483[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(II)I", line = 802)
    public final int method242(int arg0, int arg1) {
        int var3 = -121 / ((arg1 - 9) / 32);
        return this.field483[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "(I)Lu;", line = 819)
    public final class38 method243(int arg0) {
        long var2 = this.method219((byte) 53);
        synchronized (field496 == null ? (field496 = method244("u")) : field496) {
            if (class29.field368 == null) {
                class29.field368 = new class7(4096);
            } else {
                for (class28 var5 = (class28) class29.field368.method37(var2, (byte) -100); var5 != null; var5 = (class28) class29.field368.method36((byte) -119)) {
                    if (this.method229(var5.field350, -95)) {
                        return var5.field350;
                    }
                }
            }
            if (arg0 != 27114) {
                return (class38) null;
            }
            class28 var6 = new class28();
            var6.field350 = this;
            this.field486 = false;
            class29.field368.method34(var6, 0, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 820)
    public static Class method244(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
