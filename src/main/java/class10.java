import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 implements class5 {

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Z")
    private boolean field80 = true;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Lea;")
    public static class10 field74 = class3.method8("floorcol)3dat", -95);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lea;")
    public static class10 field72 = class3.method8("Next page", -100);

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "Lea;")
    public static class10 field77 = class3.method8("mapscene", -64);

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Lea;")
    public static class10 field79 = class3.method8("Prev page", 116);

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Lea;")
    public static class10 field81 = class3.method8(" map", -92);

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Z")
    public static volatile boolean field82 = true;

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "I")
    public int field83;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field84;

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "[B")
    public byte[] field78;

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "[I")
    public static int[] field75;

    @OriginalMember(owner = "mapview!ea", name = "hashCode", descriptor = "()I", line = 7)
    public final int hashCode() {
        return this.method65(68);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)Lea;", line = 17)
    public final class10 method49(int arg0) {
        long var2 = this.method70((byte) -111);
        synchronized (field84 == null ? (field84 = method73("ea")) : field84) {
            if (class36.field490 == null) {
                class36.field490 = new class28(4096);
            } else {
                for (class22 var5 = (class22) class36.field490.method213(-29249, var2); var5 != null; var5 = (class22) class36.field490.method210(-1)) {
                    if (this.method68(var5.field233, -118)) {
                        return var5.field233;
                    }
                }
            }
            class22 var6 = new class22();
            var6.field233 = this;
            this.field80 = false;
            class36.field490.method212(var6, false, var2);
            int var7 = -18 / ((55 - arg0) / 56);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 18)
    public static Class method73(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Lea;I)I", line = 61)
    public final int method50(class10 arg0, int arg1) {
        int var3;
        if (arg0.field83 >= this.field83) {
            var3 = this.field83;
        } else {
            var3 = arg0.field83;
        }
        if (arg1 != 255) {
            field72 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field78[var4] & 0xFF) < (arg0.field78[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field78[var4] & 0xFF) > (arg0.field78[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field83 < arg0.field83) {
            return -1;
        } else if (this.field83 > arg0.field83) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BLjava/awt/Graphics;II)V", line = 113)
    public final void method51(byte arg0, Graphics arg1, int arg2, int arg3) {
        String var5;
        try {
            if (arg0 < 50) {
                this.field80 = false;
            }
            var5 = new String(this.field78, 0, this.field83, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field78, 0, this.field83);
        }
        arg1.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)I", line = 161)
    public final int method52(byte arg0) {
        return arg0 >= -101 ? -126 : this.field83;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(B)Lea;", line = 174)
    public final class10 method53(byte arg0) {
        class10 var2 = new class10();
        var2.field83 = this.field83;
        var2.field78 = new byte[this.field83];
        if (arg0 < 52) {
            return (class10) null;
        }
        for (int var3 = 0; var3 < this.field83; var3++) {
            byte var4 = this.field78[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field78[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(III)I", line = 215)
    private final int method54(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field83; var5++) {
            if (this.field78[var5] == var4) {
                return var5;
            }
        }
        if (arg1 != 31985) {
            this.field76 = 69;
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(I)Lea;", line = 240)
    public final class10 method55(int arg0) {
        if (!this.field80) {
            throw new IllegalArgumentException();
        }
        this.field76 = arg0;
        if (this.field78.length != this.field83) {
            byte[] var2 = new byte[this.field83];
            class26.method197(this.field78, 0, var2, 0, this.field83);
            this.field78 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(III)Lea;", line = 275)
    public final class10 method56(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg1 >= -21) {
            field82 = true;
        }
        class10 var5 = new class10();
        var5.field83 = this.field83;
        var5.field78 = new byte[this.field83];
        byte var6 = (byte) arg0;
        for (int var7 = 0; var7 < this.field83; var7++) {
            byte var8 = this.field78[var7];
            if (var4 == var8) {
                var5.field78[var7] = var6;
            } else {
                var5.field78[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(I)B", line = 308)
    public static final byte method57(int arg0) {
        if (arg0 != 0) {
            field73 = null;
        }
        return class13.field137 == null ? 0 : class13.field137[class22.field238];
    }

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "(I)V", line = 326)
    public static void method58(int arg0) {
        if (arg0 != -26852) {
            return;
        }
        field81 = null;
        field74 = null;
        field75 = null;
        field73 = null;
        field79 = null;
        field72 = null;
        field77 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "(I)I", line = 387)
    public final int method59(int arg0) {
        return arg0 == 10 ? this.method63(10, arg0 - 106) : -123;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Z)V", line = 397)
    public final void method60(boolean arg0) {
        if (!arg0) {
            this.method63(3, 89);
        }
        String var2;
        try {
            var2 = new String(this.field78, 0, this.field83, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field78, 0, this.field83);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!ea", name = "toString", descriptor = "()Ljava/lang/String;", line = 420)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ILea;)Z", line = 428)
    public final boolean method61(int arg0, class10 arg1) {
        if (arg0 != -33) {
            method58(33);
        }
        if (this.field83 < arg1.field83) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field83; var3++) {
            if (this.field78[var3] != arg1.field78[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ea", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 450)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class10)) {
            throw new IllegalArgumentException();
        }
        return this.method68((class10) arg0, -118);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I", line = 465)
    public final int method62(FontMetrics arg0, boolean arg1) {
        if (arg1) {
            field75 = null;
        }
        String var3;
        try {
            var3 = new String(this.field78, 0, this.field83, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field78, 0, this.field83);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(II)I", line = 496)
    public final int method63(int arg0, int arg1) {
        boolean var3 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field83; var6++) {
            int var7 = this.field78[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        if (arg1 != -96) {
            this.method50(null, -10);
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(II)I", line = 574)
    public final int method64(int arg0, int arg1) {
        if (arg0 > -7) {
            this.field80 = true;
        }
        return this.field78[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "(I)I", line = 588)
    public final int method65(int arg0) {
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 54) {
            field75 = null;
        }
        while (this.field83 > var3) {
            var2 = (var2 << 5) + (this.field78[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IB)V", line = 607)
    public final void method66(int arg0, byte arg1) {
        this.field76 = 0;
        if (!this.field80) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field78.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class26.method197(this.field78, 0, var4, 0, this.field83);
                this.field78 = var4;
            }
            if (arg1 == 32) {
                for (int var5 = this.field83; var5 < arg0; var5++) {
                    this.field78[var5] = 32;
                }
                this.field83 = arg0;
            }
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(BI)Lea;", line = 657)
    public final class10 method67(byte arg0, int arg1) {
        return arg0 > -31 ? (class10) null : this.method69(this.field83, -123, arg1);
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(Lea;I)Z", line = 669)
    public final boolean method68(class10 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field83 == arg0.field83) {
            if (!this.field80 || !arg0.field80) {
                if (this.field76 == 0) {
                    this.field76 = this.method65(85);
                    if (this.field76 == 0) {
                        this.field76 = 1;
                    }
                }
                if (arg0.field76 == 0) {
                    arg0.field76 = arg0.method65(91);
                    if (arg0.field76 == 0) {
                        arg0.field76 = 1;
                    }
                }
                if (this.field76 != arg0.field76) {
                    return false;
                }
            }
            if (arg1 != -118) {
                this.method72(121, (byte) 71);
            }
            for (int var3 = 0; var3 < this.field83; var3++) {
                if (this.field78[var3] != arg0.field78[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(III)Lea;", line = 726)
    public final class10 method69(int arg0, int arg1, int arg2) {
        if (arg1 != -123) {
            return (class10) null;
        }
        class10 var4 = new class10();
        var4.field78 = new byte[arg0 - arg2];
        var4.field83 = arg0 - arg2;
        class26.method197(this.field78, arg2, var4.field78, 0, var4.field83);
        return var4;
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(B)J", line = 748)
    private final long method70(byte arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field83; var4++) {
            var2 = (var2 << 5) + ((long) (this.field78[var4] & 0xFF)) - var2;
        }
        if (arg0 != -111) {
            this.method49(-58);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(II)I", line = 772)
    public final int method71(int arg0, int arg1) {
        return arg0 == 0 ? this.method54(arg1, 31985, 0) : 80;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(IB)Lea;", line = 796)
    public final class10 method72(int arg0, byte arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field80) {
            this.field76 = 0;
            if (this.field78.length == this.field83) {
                int var3;
                for (var3 = 1; var3 <= this.field83; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class26.method197(this.field78, 0, var4, 0, this.field83);
                this.field78 = var4;
            }
            this.field78[this.field83++] = (byte) arg0;
            if (arg1 > -12) {
                field77 = null;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
