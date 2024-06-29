import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 implements class33 {

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Z")
    private boolean field69 = true;

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Ld;")
    public static class7 field73 = class38.method251((byte) 63, "Kebab Seller");

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Ld;")
    public static class7 field74 = class38.method251((byte) -80, "Pub)4Bar");

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Z")
    public static boolean field68 = false;

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "I")
    public static int field77 = 0;

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "Ld;")
    public static class7 field79 = class38.method251((byte) 55, " map");

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ld;")
    public static class7 field72 = class38.method251((byte) -80, "Helmet Shop");

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Ld;")
    public static class7 field70 = class38.method251((byte) 126, "Requesting");

    @OriginalMember(owner = "mapview!d", name = "n", descriptor = "Ld;")
    public static class7 field81 = class38.method251((byte) 107, "Jewellery");

    @OriginalMember(owner = "mapview!d", name = "o", descriptor = "Ld;")
    public static class7 field82 = class38.method251((byte) 56, "details)3dat");

    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "Ld;")
    public static class7 field80 = class38.method251((byte) 54, "Silk Trader");

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "I")
    public static int field78;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!d", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field83;

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "[B")
    public byte[] field75;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ld;I)I", line = 7)
    public final int method54(class7 arg0, int arg1) {
        int var3;
        if (arg0.field76 < this.field76) {
            var3 = arg0.field76;
        } else {
            var3 = this.field76;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field75[var4] & 0xFF) < (arg0.field75[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field75[var4] & 0xFF) < (this.field75[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1 != 21184) {
            this.method63(21);
        }
        if (this.field76 < arg0.field76) {
            return -1;
        } else if (this.field76 <= arg0.field76) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 57)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IB)Ld;", line = 69)
    public final class7 method55(int arg0, byte arg1) {
        if (arg1 != -14) {
            this.method74((byte) -53);
        }
        return this.method57(arg0, this.field76, 116);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Z)I", line = 80)
    public final int method56(boolean arg0) {
        return arg0 ? this.method64(48, 10) : 42;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(III)Ld;", line = 91)
    public final class7 method57(int arg0, int arg1, int arg2) {
        class7 var4 = new class7();
        var4.field76 = arg1 - arg0;
        if (arg2 < 106) {
            field82 = null;
        }
        var4.field75 = new byte[arg1 - arg0];
        class13.method107(this.field75, arg0, var4.field75, 0, var4.field76);
        return var4;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BI)Ld;", line = 141)
    public final class7 method58(byte arg0, int arg1) {
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field69) {
            if (arg0 != 57) {
                this.method62(23);
            }
            this.field71 = 0;
            if (this.field75.length == this.field76) {
                int var3;
                for (var3 = 1; var3 <= this.field76; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class13.method107(this.field75, 0, var4, 0, this.field76);
                this.field75 = var4;
            }
            this.field75[this.field76++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 180)
    public final void method59(Graphics arg0, int arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field75, arg3, this.field76, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field75, 0, this.field76);
        }
        arg0.drawString(var5, arg2, arg1);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 195)
    public final int method60(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field75, 0, this.field76, "ISO-8859-1");
            if (arg0 != 22) {
                this.field76 = -28;
            }
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field75, 0, this.field76);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)Ld;", line = 217)
    public final class7 method61(int arg0) {
        class7 var2 = new class7();
        var2.field76 = this.field76;
        var2.field75 = new byte[this.field76];
        if (arg0 < 17) {
            this.method62(79);
        }
        for (int var3 = 0; var3 < this.field76; var3++) {
            byte var4 = this.field75[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field75[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(I)Ld;", line = 257)
    public final class7 method62(int arg0) {
        long var2 = this.method74((byte) 21);
        synchronized (field83 == null ? (field83 = method80("d")) : field83) {
            if (class15.field168 == null) {
                class15.field168 = new class4(4096);
            } else {
                for (class31 var5 = (class31) class15.field168.method22((byte) -88, var2); var5 != null; var5 = (class31) class15.field168.method27(3230)) {
                    if (this.method66((byte) 105, var5.field442)) {
                        return var5.field442;
                    }
                }
            }
            class31 var6 = new class31();
            var6.field442 = this;
            this.field69 = false;
            class15.field168.method25(var6, var2, -84);
        }
        int var8 = -79 % ((arg0 + 14) / 53);
        return this;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 258)
    public static Class method80(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(I)V", line = 300)
    public final void method63(int arg0) {
        String var2;
        try {
            var2 = new String(this.field75, 0, this.field76, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field75, 0, this.field76);
        }
        if (arg0 > -75) {
            field78 = 98;
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)I", line = 326)
    private final int method64(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        if (arg0 != 48) {
            return -82;
        }
        while (var6 < this.field76) {
            label84: {
                int var7 = this.field75[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label84;
                    }
                    if (var7 == 43) {
                        break label84;
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
                int var8 = arg1 * var5 + var7;
                if (var8 / arg1 != var5) {
                    throw new NumberFormatException();
                }
                var5 = var8;
                var4 = true;
            }
            var6++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "(I)[B", line = 402)
    public final byte[] method65(int arg0) {
        byte[] var2 = new byte[this.field76];
        class13.method107(this.field75, arg0, var2, 0, this.field76);
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BLd;)Z", line = 411)
    public final boolean method66(byte arg0, class7 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field76 != arg1.field76) {
            return false;
        } else if (arg0 == 105) {
            if (!this.field69 || !arg1.field69) {
                if (this.field71 == 0) {
                    this.field71 = this.method67(arg0 - 215);
                    if (this.field71 == 0) {
                        this.field71 = 1;
                    }
                }
                if (arg1.field71 == 0) {
                    arg1.field71 = arg1.method67(-100);
                    if (arg1.field71 == 0) {
                        arg1.field71 = 1;
                    }
                }
                if (this.field71 != arg1.field71) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field76; var3++) {
                if (this.field75[var3] != arg1.field75[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "(I)I", line = 465)
    public final int method67(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field76; var3++) {
            var2 = (var2 << 5) + (this.field75[var3] & 0xFF) - var2;
        }
        if (arg0 >= -94) {
            field80 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ljava/applet/Applet;Z)Ld;", line = 484)
    public final class7 method68(Applet arg0, boolean arg1) {
        if (arg1) {
            String var3 = new String(this.field75, 0, this.field76);
            String var4 = arg0.getParameter(var3);
            return var4 == null ? null : class12.method105((byte) -97, var4);
        } else {
            return (class7) null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)V", line = 509)
    public static void method69(byte arg0) {
        if (arg0 < 119) {
            return;
        }
        field81 = null;
        field79 = null;
        field80 = null;
        field72 = null;
        field70 = null;
        field74 = null;
        field73 = null;
        field82 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "toString", descriptor = "()Ljava/lang/String;", line = 528)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BII)I", line = 544)
    private final int method70(byte arg0, int arg1, int arg2) {
        if (arg0 != -110) {
            return -88;
        }
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field76; var5++) {
            if (this.field75[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IBI)Ld;", line = 570)
    public final class7 method71(int arg0, byte arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg1 > -70) {
            field72 = null;
        }
        class7 var5 = new class7();
        var5.field76 = this.field76;
        byte var6 = (byte) arg0;
        var5.field75 = new byte[this.field76];
        for (int var7 = 0; var7 < this.field76; var7++) {
            byte var8 = this.field75[var7];
            if (var4 == var8) {
                var5.field75[var7] = var6;
            } else {
                var5.field75[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(II)I", line = 608)
    public final int method72(int arg0, int arg1) {
        if (arg1 != 24090) {
            method73(81);
        }
        return this.field75[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "(I)B", line = 618)
    public static final byte method73(int arg0) {
        if (arg0 != -19278) {
            field73 = null;
        }
        return class38.field508 == null ? 0 : class38.field508[class2.field10];
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)J", line = 636)
    private final long method74(byte arg0) {
        long var2 = 0L;
        int var4 = 0;
        if (arg0 <= 4) {
            field68 = true;
        }
        while (this.field76 > var4) {
            var2 = (var2 << 5) + (long) (this.field75[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "(I)I", line = 668)
    public final int method75(int arg0) {
        return arg0 == 0 ? this.field76 : -42;
    }

    @OriginalMember(owner = "mapview!d", name = "hashCode", descriptor = "()I", line = 688)
    public final int hashCode() {
        return this.method67(-108);
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(II)I", line = 721)
    public final int method76(int arg0, int arg1) {
        return arg1 == -66 ? this.method70((byte) -110, arg0, 0) : 42;
    }

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "(II)V", line = 732)
    public final void method77(int arg0, int arg1) {
        this.field71 = 0;
        if (!this.field69) {
            throw new IllegalArgumentException();
        } else if (arg1 < arg0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field75.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class13.method107(this.field75, 0, var4, 0, this.field76);
                this.field75 = var4;
            }
            for (int var5 = this.field76; var5 < arg1; var5++) {
                this.field75[var5] = 32;
            }
            this.field76 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "(I)Ld;", line = 810)
    public final class7 method78(int arg0) {
        if (!this.field69) {
            throw new IllegalArgumentException();
        }
        this.field71 = 0;
        if (this.field75.length != this.field76) {
            byte[] var2 = new byte[this.field76];
            class13.method107(this.field75, 0, var2, 0, this.field76);
            this.field75 = var2;
        }
        if (arg0 < 21) {
            this.method66((byte) 53, null);
        }
        return this;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ld;Ld;Lk;B)[Lna;", line = 838)
    public static final class27[] method79(class7 arg0, class7 arg1, class20 arg2, byte arg3) {
        if (arg3 == 103) {
            int var4 = arg2.method145((byte) -117, arg1);
            int var5 = arg2.method141(true, var4, arg0);
            return class28.method207(var4, var5, arg2, 257);
        } else {
            return (class27[]) null;
        }
    }
}
