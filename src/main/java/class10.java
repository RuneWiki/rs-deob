import java.awt.Canvas;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class10 implements class16 {

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "Z")
    private boolean field113 = true;

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "Lf;")
    public static class10 field105 = class23.method139("", (byte) -88);

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "Z")
    public static boolean field102 = false;

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "Lf;")
    public static class10 field109 = class23.method139("37(U", (byte) -116);

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "Lf;")
    public static class10 field111 = class23.method139("Find", (byte) -62);

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "Lf;")
    public static class10 field110 = class23.method139("Enter place name to find", (byte) -52);

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "Lf;")
    public static class10 field108 = class23.method139("Loading )3)3)3", (byte) -117);

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "Lm;")
    public static class24 field103;

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field107;

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field101;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field114;

    @OriginalMember(owner = "mapview!f", name = "m", descriptor = "[B")
    public byte[] field112;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)Lf;", line = 12)
    public final class10 method55(int arg0) {
        class10 var2 = new class10();
        if (arg0 != -12290) {
            return (class10) null;
        }
        var2.field106 = this.field106;
        var2.field112 = new byte[this.field106];
        for (int var3 = 0; var3 < this.field106; var3++) {
            byte var4 = this.field112[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field112[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IB)Lf;", line = 43)
    public final class10 method56(int arg0, byte arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field113) {
            this.field104 = 0;
            int var3 = -34 % ((arg1 - 29) / 40);
            if (this.field112.length == this.field106) {
                int var4;
                for (var4 = 1; var4 <= this.field106; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class40.method253(this.field112, 0, var5, 0, this.field106);
                this.field112 = var5;
            }
            this.field112[this.field106++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(IB)V", line = 88)
    public final void method57(int arg0, byte arg1) {
        this.field104 = 0;
        if (!this.field113) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field112.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class40.method253(this.field112, 0, var4, 0, this.field106);
                this.field112 = var4;
            }
            for (int var5 = this.field106; var5 < arg0; var5++) {
                this.field112[var5] = 32;
            }
            this.field106 = arg0;
            if (arg1 > -7) {
                field105 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 138)
    public final void method58(int arg0, int arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field112, arg2, this.field106, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field112, 0, this.field106);
        }
        arg3.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(BJ)V", line = 171)
    public static final void method59(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        if (arg0 != 113) {
            method63((byte) 1);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)I", line = 188)
    public final int method60(int arg0, int arg1) {
        return arg1 == -66 ? this.field112[arg0] & 0xFF : 30;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Z)Lf;", line = 198)
    public final class10 method61(boolean arg0) {
        if (!this.field113) {
            throw new IllegalArgumentException();
        }
        if (!arg0) {
            this.method58(-78, 29, -14, null);
        }
        this.field104 = 0;
        if (this.field112.length != this.field106) {
            byte[] var2 = new byte[this.field106];
            class40.method253(this.field112, 0, var2, 0, this.field106);
            this.field112 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!f", name = "hashCode", descriptor = "()I", line = 243)
    public final int hashCode() {
        return this.method66(false);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IBI)I", line = 251)
    private final int method62(int arg0, byte arg1, int arg2) {
        byte var4 = (byte) arg2;
        for (int var5 = arg0; var5 < this.field106; var5++) {
            if (this.field112[var5] == var4) {
                return var5;
            }
        }
        int var6 = -41 % ((-arg1 - 70) / 32);
        return -1;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(B)V", line = 289)
    public static void method63(byte arg0) {
        if (arg0 != 102) {
            return;
        }
        field109 = null;
        field110 = null;
        field108 = null;
        field105 = null;
        field111 = null;
        field101 = null;
        field103 = null;
        field107 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(III)Lf;", line = 310)
    public final class10 method64(int arg0, int arg1, int arg2) {
        class10 var4 = new class10();
        var4.field106 = arg1 - arg2;
        var4.field112 = new byte[arg1 - arg2];
        class40.method253(this.field112, arg2, var4.field112, 0, var4.field106);
        if (arg0 >= -8) {
            field101 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Lf;B)I", line = 326)
    public final int method65(class10 arg0, byte arg1) {
        int var3;
        if (arg0.field106 < this.field106) {
            var3 = arg0.field106;
        } else {
            var3 = this.field106;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field112[var4] & 0xFF) > (this.field112[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field112[var4] & 0xFF) < (this.field112[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field106 > this.field106) {
            return -1;
        } else if (this.field106 > arg0.field106) {
            return 1;
        } else {
            if (arg1 != -69) {
                this.method57(111, (byte) 47);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Z)I", line = 365)
    public final int method66(boolean arg0) {
        int var2 = 0;
        if (arg0) {
            this.method57(-79, (byte) -91);
        }
        for (int var3 = 0; var3 < this.field106; var3++) {
            var2 = (this.field112[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(I)I", line = 384)
    public final int method67(int arg0) {
        if (arg0 != -98) {
            field110 = null;
        }
        return this.field106;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(BI)I", line = 406)
    public final int method68(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        if (arg0 != -20) {
            method59((byte) 45, 33L);
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field106; var6++) {
            int var7 = this.field112[var6] & 0xFF;
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
            if (arg1 <= var7) {
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
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I", line = 511)
    public final int method69(boolean arg0, FontMetrics arg1) {
        String var3;
        try {
            if (!arg0) {
                field101 = null;
            }
            var3 = new String(this.field112, 0, this.field106, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field112, 0, this.field106);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(I)J", line = 534)
    private final long method70(int arg0) {
        long var2 = 0L;
        if (arg0 != -29571) {
            this.method62(114, (byte) -16, 89);
        }
        for (int var4 = 0; var4 < this.field106; var4++) {
            var2 = (var2 << 5) + (long) (this.field112[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!f", name = "toString", descriptor = "()Ljava/lang/String;", line = 553)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!f", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 563)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class10)) {
            throw new IllegalArgumentException();
        }
        return this.method78((class10) arg0, -1);
    }

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "(I)V", line = 583)
    public final void method71(int arg0) {
        String var2;
        try {
            var2 = new String(this.field112, arg0, this.field106, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field112, 0, this.field106);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ILf;)Z", line = 611)
    public final boolean method72(int arg0, class10 arg1) {
        if (this.field106 < arg1.field106) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field106; var3++) {
            if (this.field112[var3] != arg1.field112[var3]) {
                return false;
            }
        }
        if (arg0 > -5) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(II)I", line = 640)
    public final int method73(int arg0, int arg1) {
        return arg0 == 0 ? this.method62(0, (byte) -110, arg1) : -74;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IZI)Lf;", line = 662)
    public final class10 method74(int arg0, boolean arg1, int arg2) {
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg0;
        class10 var6 = new class10();
        var6.field106 = this.field106;
        var6.field112 = new byte[this.field106];
        for (int var7 = 0; var7 < this.field106; var7++) {
            byte var8 = this.field112[var7];
            if (var4 == var8) {
                var6.field112[var7] = var5;
            } else {
                var6.field112[var7] = var8;
            }
        }
        if (!arg1) {
            field100 = 103;
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "(I)Lf;", line = 699)
    public final class10 method75(int arg0) {
        long var2 = this.method70(-29571);
        synchronized (field114 == null ? (field114 = method80("f")) : field114) {
            if (arg0 != -32360) {
                this.field112 = null;
            }
            if (class21.field215 == null) {
                class21.field215 = new class11(4096);
            } else {
                for (class31 var5 = (class31) class21.field215.method82(true, var2); var5 != null; var5 = (class31) class21.field215.method81(arg0 + 32482)) {
                    if (this.method78(var5.field422, arg0 ^ 0x7E67)) {
                        return var5.field422;
                    }
                }
            }
            class31 var6 = new class31();
            var6.field422 = this;
            this.field113 = false;
            class21.field215.method85(var2, var6, true);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 700)
    public static Class method80(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "(I)I", line = 749)
    public static final int method76(int arg0) {
        if (arg0 != -123) {
            method59((byte) -6, 16L);
        }
        return class24.field257 == null ? 0 : class24.field257[class41.field538];
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(Z)I", line = 773)
    public final int method77(boolean arg0) {
        return arg0 ? -4 : this.method68((byte) -20, 10);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Lf;I)Z", line = 805)
    public final boolean method78(class10 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field106 == arg0.field106) {
            if (!this.field113 || !arg0.field113) {
                if (this.field104 == 0) {
                    this.field104 = this.method66(false);
                    if (this.field104 == 0) {
                        this.field104 = 1;
                    }
                }
                if (arg0.field104 == 0) {
                    arg0.field104 = arg0.method66(false);
                    if (arg0.field104 == 0) {
                        arg0.field104 = 1;
                    }
                }
                if (this.field104 != arg0.field104) {
                    return false;
                }
            }
            if (arg1 != -1) {
                this.method79(false, 84);
            }
            for (int var3 = 0; var3 < this.field106; var3++) {
                if (this.field112[var3] != arg0.field112[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ZI)Lf;", line = 865)
    public final class10 method79(boolean arg0, int arg1) {
        if (arg0) {
            this.field113 = false;
        }
        return this.method64(-102, this.field106, arg1);
    }
}
