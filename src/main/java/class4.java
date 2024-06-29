import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 implements class2 {

    @OriginalMember(owner = "mapview!ba", name = "f", descriptor = "Z")
    private boolean field86 = true;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "Lba;")
    public static class4 field81 = class14.method105((byte) -94, "Altar");

    @OriginalMember(owner = "mapview!ba", name = "g", descriptor = "Lba;")
    public static class4 field87 = class14.method105((byte) -127, "Guide");

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "mapview!ba", name = "i", descriptor = "Ll;")
    private static class22 field89;

    @OriginalMember(owner = "mapview!ba", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field88;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!ba", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field90;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "[B")
    public byte[] field82;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(II)I", line = 15)
    private final int method27(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = arg1; var6 < this.field84; var6++) {
            int var7 = this.field82[var6] & 0xFF;
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
            if (arg0 <= var7) {
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

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V", line = 98)
    public final void method28(Graphics arg0, int arg1, byte arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field82, 0, this.field84, "ISO-8859-1");
            if (arg2 >= -97) {
                field81 = null;
            }
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field82, 0, this.field84);
        }
        arg0.drawString(var5, arg3, arg1);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(III)Lba;", line = 119)
    public final class4 method29(int arg0, int arg1, int arg2) {
        class4 var4 = new class4();
        var4.field84 = arg0 - arg2;
        var4.field82 = new byte[arg0 - arg2];
        if (arg1 <= 11) {
            this.toString();
        }
        class18.method127(this.field82, arg2, var4.field82, 0, var4.field84);
        return var4;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IIZ)Lba;", line = 134)
    public final class4 method30(int arg0, int arg1, boolean arg2) {
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        if (!arg2) {
            method39(false);
        }
        class4 var6 = new class4();
        var6.field84 = this.field84;
        var6.field82 = new byte[this.field84];
        for (int var7 = 0; var7 < this.field84; var7++) {
            byte var8 = this.field82[var7];
            if (var4 == var8) {
                var6.field82[var7] = var5;
            } else {
                var6.field82[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)I", line = 176)
    public final int method31(byte arg0) {
        if (arg0 != -87) {
            this.hashCode();
        }
        return this.field84;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Z)J", line = 206)
    private final long method32(boolean arg0) {
        if (!arg0) {
            this.method45(-1, (byte) -21);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field84; var4++) {
            var2 = (var2 << 5) + (long) (this.field82[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(II)I", line = 225)
    public final int method33(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method30(-13, -24, true);
        }
        return this.method42(arg0, 0, -8458);
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(B)Lba;", line = 252)
    public final class4 method34(byte arg0) {
        long var2 = this.method32(true);
        synchronized (field90 == null ? (field90 = method51("ba")) : field90) {
            if (field89 == null) {
                field89 = new class22(4096);
            } else {
                for (class12 var5 = (class12) field89.method157(var2, (byte) 52); var5 != null; var5 = (class12) field89.method155(true)) {
                    if (this.method49(92, var5.field169)) {
                        return var5.field169;
                    }
                }
            }
            class12 var6 = new class12();
            var6.field169 = this;
            this.field86 = false;
            field89.method158((byte) -125, var6, var2);
            int var7 = 42 / ((53 - arg0) / 52);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 253)
    public static Class method51(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BLjava/applet/Applet;)Lba;", line = 314)
    public final class4 method35(byte arg0, Applet arg1) {
        if (arg0 >= -103) {
            this.field86 = false;
        }
        String var3 = new String(this.field82, 0, this.field84);
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class9.method87(0, var4);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)I", line = 333)
    public final int method36(int arg0) {
        if (arg0 != 20928) {
            this.hashCode();
        }
        return this.method27(10, arg0 - 20928);
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(Z)V", line = 346)
    public static final void method37(boolean arg0) {
        if (++class35.field443 >= 64) {
            class24.field296++;
            class35.field443 = 0;
            if (class24.field296 < class13.field183 >> 6) {
                class23.method164(false);
            }
        }
        class12.field172 = (class35.field443 << 6) + class29.field372;
        if (!arg0) {
            method39(true);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(I)Z", line = 378)
    public static final boolean method38(int arg0) {
        class1 var1 = class17.field212;
        synchronized (class17.field212) {
            if (class3.field77 == class26.field308) {
                return false;
            } else {
                class22.field272 = class24.field295[class26.field308];
                class5.field106 = class5.field114[class26.field308];
                class26.field308 = class26.field308 + arg0 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(Z)V", line = 406)
    public static void method39(boolean arg0) {
        field87 = null;
        field81 = null;
        if (arg0) {
            field88 = null;
            field89 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lba;I)I", line = 426)
    public final int method40(class4 arg0, int arg1) {
        if (arg1 != -28014) {
            this.method31((byte) -4);
        }
        int var3;
        if (this.field84 <= arg0.field84) {
            var3 = this.field84;
        } else {
            var3 = arg0.field84;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0.field82[var4] > this.field82[var4]) {
                return -1;
            }
            if (arg0.field82[var4] < this.field82[var4]) {
                return 1;
            }
        }
        if (arg0.field84 > this.field84) {
            return -1;
        } else if (arg0.field84 < this.field84) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BI)V", line = 464)
    public final void method41(byte arg0, int arg1) {
        this.field83 = 0;
        if (!this.field86) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 < 34) {
                field88 = null;
            }
            if (this.field82.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class18.method127(this.field82, 0, var4, 0, this.field84);
                this.field82 = var4;
            }
            for (int var5 = this.field84; var5 < arg1; var5++) {
                this.field82[var5] = 32;
            }
            this.field84 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "hashCode", descriptor = "()I", line = 517)
    public final int hashCode() {
        return this.method50(-11);
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(III)I", line = 530)
    private final int method42(int arg0, int arg1, int arg2) {
        if (arg2 != -8458) {
            this.method44(95, -36);
        }
        byte var4 = (byte) arg0;
        for (int var5 = arg1; var5 < this.field84; var5++) {
            if (this.field82[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!ba", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 557)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(I)Lba;", line = 567)
    public final class4 method43(int arg0) {
        if (arg0 > -6) {
            return (class4) null;
        } else if (this.field86) {
            this.field83 = 0;
            if (this.field82.length != this.field84) {
                byte[] var2 = new byte[this.field84];
                class18.method127(this.field82, 0, var2, 0, this.field84);
                this.field82 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "toString", descriptor = "()Ljava/lang/String;", line = 595)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(II)Lba;", line = 609)
    public final class4 method44(int arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field86) {
            this.field83 = arg0;
            if (this.field82.length == this.field84) {
                int var3;
                for (var3 = 1; var3 <= this.field84; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class18.method127(this.field82, 0, var4, 0, this.field84);
                this.field82 = var4;
            }
            this.field82[this.field84++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IB)Lba;", line = 643)
    public final class4 method45(int arg0, byte arg1) {
        if (arg1 != 116) {
            field88 = null;
        }
        return this.method29(this.field84, arg1 ^ 0x32, arg0);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I", line = 659)
    public final int method46(FontMetrics arg0, boolean arg1) {
        String var3;
        try {
            var3 = new String(this.field82, 0, this.field84, "ISO-8859-1");
            if (!arg1) {
                this.field82 = null;
            }
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field82, 0, this.field84);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(B)Lba;", line = 683)
    public final class4 method47(byte arg0) {
        class4 var2 = new class4();
        var2.field84 = this.field84;
        var2.field82 = new byte[this.field84];
        if (arg0 != 109) {
            this.method46(null, false);
        }
        for (int var3 = 0; var3 < this.field84; var3++) {
            byte var4 = this.field82[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field82[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "(II)I", line = 715)
    public final int method48(int arg0, int arg1) {
        if (arg1 <= 36) {
            field89 = null;
        }
        return this.field82[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(ILba;)Z", line = 729)
    public final boolean method49(int arg0, class4 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field84 == arg1.field84) {
            if (!this.field86 || !arg1.field86) {
                if (this.field83 == 0) {
                    this.field83 = this.method50(-11);
                    if (this.field83 == 0) {
                        this.field83 = 1;
                    }
                }
                if (arg1.field83 == 0) {
                    arg1.field83 = arg1.method50(-11);
                    if (arg1.field83 == 0) {
                        arg1.field83 = 1;
                    }
                }
                if (this.field83 != arg1.field83) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field84; var3++) {
                if (this.field82[var3] != arg1.field82[var3]) {
                    return false;
                }
            }
            if (arg0 < 45) {
                this.method47((byte) 87);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "(I)I", line = 782)
    public final int method50(int arg0) {
        int var2 = 0;
        if (arg0 != -11) {
            field87 = null;
        }
        for (int var3 = 0; var3 < this.field84; var3++) {
            var2 = (var2 << 5) + (this.field82[var3] & 0xFF) - var2;
        }
        return var2;
    }
}
