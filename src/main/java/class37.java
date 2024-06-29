import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ta")
public class class37 implements class28 {

    @OriginalMember(owner = "mapview!ta", name = "f", descriptor = "Z")
    private boolean field503 = true;

    @OriginalMember(owner = "mapview!ta", name = "e", descriptor = "Lta;")
    public static class37 field502 = class20.method87(-128, "Archery Shop");

    @OriginalMember(owner = "mapview!ta", name = "g", descriptor = "Lta;")
    public static class37 field504 = class20.method87(-112, "Enter place name to find");

    @OriginalMember(owner = "mapview!ta", name = "h", descriptor = "Lta;")
    public static class37 field505 = class20.method87(-90, "Cookery Shop");

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "Z")
    public static boolean field498 = false;

    @OriginalMember(owner = "mapview!ta", name = "m", descriptor = "Lta;")
    public static class37 field510 = class20.method87(-101, "Mini)2Game");

    @OriginalMember(owner = "mapview!ta", name = "o", descriptor = "Z")
    public static boolean field512 = false;

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "mapview!ta", name = "i", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "mapview!ta", name = "l", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "mapview!ta", name = "n", descriptor = "Lf;")
    public static class10 field511;

    @OriginalMember(owner = "mapview!ta", name = "k", descriptor = "Lma;")
    public static class25 field508;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!ta", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field513;

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "[B")
    public byte[] field499;

    @OriginalMember(owner = "mapview!ta", name = "j", descriptor = "[I")
    public static int[] field507;

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(II)Lta;", line = 12)
    public final class37 method222(int arg0, int arg1) {
        if (arg0 != -30696) {
            this.method239((byte) -70);
        }
        return this.method236(arg1, this.field509, (byte) 43);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Z)V", line = 28)
    public final void method223(boolean arg0) {
        String var2;
        try {
            var2 = new String(this.field499, 0, this.field509, "ISO-8859-1");
            if (arg0) {
                field505 = null;
            }
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field499, 0, this.field509);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!ta", name = "toString", descriptor = "()Ljava/lang/String;", line = 51)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(II)I", line = 65)
    public final int method224(int arg0, int arg1) {
        if (arg1 != 0) {
            field512 = false;
        }
        return this.method233((byte) -108, 0, arg0);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(B)Lta;", line = 79)
    public final class37 method225(byte arg0) {
        if (!this.field503) {
            throw new IllegalArgumentException();
        }
        if (arg0 >= -67) {
            this.method241((byte) 120);
        }
        this.field506 = 0;
        if (this.field499.length != this.field509) {
            byte[] var2 = new byte[this.field509];
            class32.method190(this.field499, 0, var2, 0, this.field509);
            this.field499 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(I)J", line = 106)
    private final long method226(int arg0) {
        long var2 = 0L;
        for (int var4 = arg0; var4 < this.field509; var4++) {
            var2 = (var2 << 5) + (long) (this.field499[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(IILjava/awt/Graphics;B)V", line = 126)
    public final void method227(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 > -110) {
            field511 = null;
        }
        String var5;
        try {
            var5 = new String(this.field499, 0, this.field509, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field499, 0, this.field509);
        }
        arg2.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(Z)Lta;", line = 152)
    public final class37 method228(boolean arg0) {
        if (arg0) {
            field512 = true;
        }
        class37 var2 = new class37();
        var2.field509 = this.field509;
        var2.field499 = new byte[this.field509];
        for (int var3 = 0; var3 < this.field509; var3++) {
            byte var4 = this.field499[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field499[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(BI)I", line = 181)
    public final int method229(byte arg0, int arg1) {
        return arg0 < 66 ? 53 : this.field499[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 195)
    public final int method230(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field499, 0, this.field509, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field499, 0, this.field509);
        }
        if (arg1 != -4607) {
            this.method233((byte) 53, 81, -25);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(B)I", line = 222)
    public final int method231(byte arg0) {
        return arg0 >= -86 ? 76 : this.method244(10, 70);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Lta;B)Z", line = 232)
    public final boolean method232(class37 arg0, byte arg1) {
        if (arg0.field509 > this.field509) {
            return false;
        }
        if (arg1 > -55) {
            this.method244(-3, -110);
        }
        for (int var3 = 0; var3 < arg0.field509; var3++) {
            if (this.field499[var3] != arg0.field499[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ta", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 261)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class37)) {
            throw new IllegalArgumentException();
        }
        return this.method235((class37) arg0, (byte) -59);
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(BII)I", line = 281)
    private final int method233(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg0 > -104) {
            field501 = -6;
        }
        for (int var5 = arg1; var5 < this.field509; var5++) {
            if (this.field499[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "(II)V", line = 307)
    public final void method234(int arg0, int arg1) {
        this.field506 = 0;
        if (!this.field503) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else if (arg0 > 29) {
            if (arg1 > this.field499.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class32.method190(this.field499, 0, var4, 0, this.field509);
                this.field499 = var4;
            }
            for (int var5 = this.field509; var5 < arg1; var5++) {
                this.field499[var5] = 32;
            }
            this.field509 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(Lta;B)Z", line = 356)
    public final boolean method235(class37 arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field509 == arg0.field509) {
            if (!this.field503 || !arg0.field503) {
                if (this.field506 == 0) {
                    this.field506 = this.method239((byte) 37);
                    if (this.field506 == 0) {
                        this.field506 = 1;
                    }
                }
                if (arg0.field506 == 0) {
                    arg0.field506 = arg0.method239((byte) 64);
                    if (arg0.field506 == 0) {
                        arg0.field506 = 1;
                    }
                }
                if (this.field506 != arg0.field506) {
                    return false;
                }
            }
            if (arg1 >= -48) {
                return true;
            }
            for (int var3 = 0; var3 < this.field509; var3++) {
                if (this.field499[var3] != arg0.field499[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(IIB)Lta;", line = 426)
    public final class37 method236(int arg0, int arg1, byte arg2) {
        class37 var4 = new class37();
        if (arg2 == 43) {
            var4.field499 = new byte[arg1 - arg0];
            var4.field509 = arg1 - arg0;
            class32.method190(this.field499, arg0, var4.field499, 0, var4.field509);
            return var4;
        } else {
            return (class37) null;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(ZI)Lta;", line = 454)
    public final class37 method237(boolean arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (!arg0) {
            return (class37) null;
        } else if (this.field503) {
            this.field506 = 0;
            if (this.field499.length == this.field509) {
                int var3;
                for (var3 = 1; var3 <= this.field509; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class32.method190(this.field499, 0, var4, 0, this.field509);
                this.field499 = var4;
            }
            this.field499[this.field509++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "b", descriptor = "(I)Lta;", line = 493)
    public final class37 method238(int arg0) {
        long var2 = this.method226(0);
        synchronized (field513 == null ? (field513 = method246("ta")) : field513) {
            if (class6.field63 == null) {
                class6.field63 = new class26(4096);
            } else {
                for (class9 var5 = (class9) class6.field63.method167(var2, (byte) -55); var5 != null; var5 = (class9) class6.field63.method166(true)) {
                    if (this.method235(var5.field97, (byte) -105)) {
                        return var5.field97;
                    }
                }
            }
            if (arg0 != -1) {
                return (class37) null;
            }
            class9 var6 = new class9();
            this.field503 = false;
            var6.field97 = this;
            class6.field63.method169(var2, var6, arg0 ^ 0x0);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 494)
    public static Class method246(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "hashCode", descriptor = "()I", line = 544)
    public final int hashCode() {
        return this.method239((byte) 66);
    }

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "(B)I", line = 572)
    public final int method239(byte arg0) {
        if (arg0 < 35) {
            this.method222(47, 78);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field509; var3++) {
            var2 = (this.field499[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(ILta;)I", line = 597)
    public final int method240(int arg0, class37 arg1) {
        if (arg0 != -2) {
            field501 = 39;
        }
        int var3;
        if (arg1.field509 < this.field509) {
            var3 = arg1.field509;
        } else {
            var3 = this.field509;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field499[var4] & 0xFF) > (this.field499[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field499[var4] & 0xFF) > (arg1.field499[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field509 < arg1.field509) {
            return -1;
        } else if (arg1.field509 >= this.field509) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "(B)I", line = 660)
    public final int method241(byte arg0) {
        return arg0 == 92 ? this.field509 : -121;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(III)Lta;", line = 677)
    public final class37 method242(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        class37 var6 = new class37();
        var6.field509 = this.field509;
        var6.field499 = new byte[this.field509];
        if (arg2 != -66) {
            method245(null, (byte) 51);
        }
        for (int var7 = 0; var7 < this.field509; var7++) {
            byte var8 = this.field499[var7];
            if (var4 == var8) {
                var6.field499[var7] = var5;
            } else {
                var6.field499[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!ta", name = "c", descriptor = "(I)V", line = 712)
    public static void method243(int arg0) {
        field504 = null;
        field511 = null;
        field508 = null;
        field502 = null;
        field505 = null;
        field507 = null;
        if (arg0 != 0) {
            field512 = true;
        }
        field510 = null;
    }

    @OriginalMember(owner = "mapview!ta", name = "d", descriptor = "(II)I", line = 738)
    public final int method244(int arg0, int arg1) {
        boolean var3 = false;
        int var4 = 0;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field509; var6++) {
            int var7 = this.field499[var6] & 0xFF;
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
            var5 = true;
            var4 = var8;
        }
        if (arg1 < 9) {
            this.method232(null, (byte) 119);
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!ta", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 821)
    public static final void method245(Component arg0, byte arg1) {
        if (arg1 != -116) {
            field500 = 40;
        }
        arg0.removeKeyListener(class21.field238);
        arg0.removeFocusListener(class21.field238);
        class14.field152 = -1;
    }
}
