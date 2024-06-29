import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 implements class6 {

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "Z")
    private boolean field219 = true;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ll;")
    public static class22 field212 = class33.method229("Key", -59);

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Ll;")
    public static class22 field217 = class33.method229("Prev page", -55);

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "Ll;")
    public static class22 field221 = class33.method229("Find", -124);

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "J")
    public static long field214;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field222;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "[B")
    public byte[] field215;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Z)I", line = 16)
    public final int method129(boolean arg0) {
        if (!arg0) {
            this.field213 = 61;
        }
        return this.field213;
    }

    @OriginalMember(owner = "mapview!l", name = "toString", descriptor = "()Ljava/lang/String;", line = 43)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 54)
    public final void method130(int arg0) {
        int var2 = 60 / ((-arg0 - 11) / 53);
        String var3;
        try {
            var3 = new String(this.field215, 0, this.field213, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field215, 0, this.field213);
        }
        System.out.println(var3);
    }

    @OriginalMember(owner = "mapview!l", name = "hashCode", descriptor = "()I", line = 70)
    public final int hashCode() {
        return this.method140(true);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IBI)Ll;", line = 78)
    public final class22 method131(int arg0, byte arg1, int arg2) {
        class22 var4 = new class22();
        var4.field215 = new byte[arg0 - arg2];
        if (arg1 >= -36) {
            this.method129(false);
        }
        var4.field213 = arg0 - arg2;
        class7.method34(this.field215, arg2, var4.field215, 0, var4.field213);
        return var4;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(III)I", line = 94)
    private final int method132(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        if (arg2 != 30400) {
            return -81;
        }
        for (int var5 = arg0; var5 < this.field213; var5++) {
            if (this.field215[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IZ)Ll;", line = 121)
    public final class22 method133(int arg0, boolean arg1) {
        if (arg1) {
            this.field213 = 42;
        }
        return this.method131(this.field213, (byte) -95, arg0);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)J", line = 134)
    private final long method134(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field213; var4++) {
            var2 = (var2 << 5) - (var2 - (long) (this.field215[var4] & 0xFF));
        }
        if (arg0 < 47) {
            this.field220 = -33;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IB)I", line = 178)
    private final int method135(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 != 63) {
            this.method138(55, null);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field213; var6++) {
            int var7 = this.field215[var6] & 0xFF;
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
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILl;)Z", line = 266)
    public final boolean method136(int arg0, class22 arg1) {
        if (arg1 == null) {
            return false;
        } else if (this.field213 == arg1.field213) {
            if (!this.field219 || !arg1.field219) {
                if (this.field220 == 0) {
                    this.field220 = this.method140(true);
                    if (this.field220 == 0) {
                        this.field220 = 1;
                    }
                }
                if (arg1.field220 == 0) {
                    arg1.field220 = arg1.method140(true);
                    if (arg1.field220 == 0) {
                        arg1.field220 = 1;
                    }
                }
                if (this.field220 != arg1.field220) {
                    return false;
                }
            }
            int var3 = 0;
            if (arg0 != 27321) {
                field216 = 12;
            }
            while (var3 < this.field213) {
                if (this.field215[var3] != arg1.field215[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 331)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class22)) {
            throw new IllegalArgumentException();
        }
        return this.method136(27321, (class22) arg0);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(III)Ll;", line = 349)
    public final class22 method137(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg2;
        class22 var6 = new class22();
        var6.field213 = this.field213;
        if (arg0 != 1) {
            field221 = null;
        }
        var6.field215 = new byte[this.field213];
        for (int var7 = 0; var7 < this.field213; var7++) {
            byte var8 = this.field215[var7];
            if (var4 == var8) {
                var6.field215[var7] = var5;
            } else {
                var6.field215[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 383)
    public final int method138(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field215, 0, this.field213, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field215, 0, this.field213);
        }
        if (arg0 < 27) {
            field212 = null;
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)V", line = 417)
    public final void method139(int arg0, int arg1) {
        this.field220 = 0;
        if (!this.field219) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field215.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class7.method34(this.field215, 0, var4, 0, this.field213);
                this.field215 = var4;
            }
            for (int var5 = this.field213; var5 < arg0; var5++) {
                this.field215[var5] = 32;
            }
            if (arg1 <= 61) {
                this.method151((byte) 79);
            }
            this.field213 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(Z)I", line = 470)
    public final int method140(boolean arg0) {
        int var2 = 0;
        if (!arg0) {
            this.field220 = 26;
        }
        for (int var3 = 0; var3 < this.field213; var3++) {
            var2 = (var2 << 5) + (this.field215[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ll;I)I", line = 488)
    public final int method141(class22 arg0, int arg1) {
        if (arg1 != -621) {
            return 74;
        }
        int var3;
        if (arg0.field213 < this.field213) {
            var3 = arg0.field213;
        } else {
            var3 = this.field213;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field215[var4] & 0xFF) > (this.field215[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field215[var4] & 0xFF) > (arg0.field215[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field213 > this.field213) {
            return -1;
        } else if (this.field213 <= arg0.field213) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(I)B", line = 539)
    public static final byte method142(int arg0) {
        if (arg0 >= -107) {
            method142(-4);
        }
        return class2.field18 == null ? 0 : class2.field18[class35.field471];
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(Z)V", line = 553)
    public static void method143(boolean arg0) {
        if (arg0) {
            field214 = -34L;
        }
        field212 = null;
        field221 = null;
        field217 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IZLjava/awt/Graphics;I)V", line = 569)
    public final void method144(int arg0, boolean arg1, Graphics arg2, int arg3) {
        if (arg1) {
            this.method129(true);
        }
        String var5;
        try {
            var5 = new String(this.field215, 0, this.field213, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field215, 0, this.field213);
        }
        arg2.drawString(var5, arg0, arg3);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(II)I", line = 599)
    public final int method145(int arg0, int arg1) {
        if (arg0 != -117) {
            method143(true);
        }
        return this.method132(0, arg1, arg0 ^ 0xFFFF894B);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(IB)Ll;", line = 610)
    public final class22 method146(int arg0, byte arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        if (arg1 != -117) {
            this.method141(null, 65);
        }
        if (!this.field219) {
            throw new IllegalArgumentException();
        }
        this.field220 = 0;
        if (this.field215.length == this.field213) {
            int var3;
            for (var3 = 1; var3 <= this.field213; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class7.method34(this.field215, 0, var4, 0, this.field213);
            this.field215 = var4;
        }
        this.field215[this.field213++] = (byte) arg0;
        return this;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)Ll;", line = 646)
    public final class22 method147(byte arg0) {
        if (arg0 != -27) {
            field216 = -8;
        }
        long var2 = this.method134(90);
        synchronized (field222 == null ? (field222 = method154("l")) : field222) {
            if (class17.field166 == null) {
                class17.field166 = new class25(4096);
            } else {
                for (class35 var5 = (class35) class17.field166.method165(var2, (byte) 85); var5 != null; var5 = (class35) class17.field166.method168(arg0 - 99)) {
                    if (this.method136(27321, var5.field469)) {
                        return var5.field469;
                    }
                }
            }
            class35 var6 = new class35();
            this.field219 = false;
            var6.field469 = this;
            class17.field166.method169((byte) -101, var6, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 650)
    public static Class method154(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(I)I", line = 709)
    public final int method148(int arg0) {
        if (arg0 != 10) {
            this.field220 = -48;
        }
        return this.method135(10, (byte) 63);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/applet/Applet;B)Ll;", line = 730)
    public final class22 method149(Applet arg0, byte arg1) {
        int var3 = 2 % ((arg1 + 77) / 47);
        String var4 = new String(this.field215, 0, this.field213);
        String var5 = arg0.getParameter(var4);
        return var5 == null ? null : class1.method1(var5, 10071);
    }

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "(I)V", line = 757)
    public static final void method150(int arg0) {
        class16 var1 = class5.field36;
        synchronized (class5.field36) {
            class3.field21 = class34.field466;
            class19.field186 = class29.field406;
            class3.field28 = class12.field131;
            class2.field9 = class34.field465;
            class29.field409 = class21.field204;
            class19.field181 = class38.field506;
            class34.field465 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(B)Ll;", line = 781)
    public final class22 method151(byte arg0) {
        if (!this.field219) {
            throw new IllegalArgumentException();
        }
        this.field220 = 0;
        if (this.field215.length != this.field213) {
            byte[] var2 = new byte[this.field213];
            class7.method34(this.field215, 0, var2, 0, this.field213);
            this.field215 = var2;
        }
        return arg0 > -73 ? (class22) null : this;
    }

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "(I)Ll;", line = 816)
    public final class22 method152(int arg0) {
        class22 var2 = new class22();
        var2.field213 = this.field213;
        var2.field215 = new byte[this.field213];
        for (int var3 = arg0; var3 < this.field213; var3++) {
            byte var4 = this.field215[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field215[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ZI)I", line = 843)
    public final int method153(boolean arg0, int arg1) {
        if (arg0) {
            this.method146(29, (byte) 87);
        }
        return this.field215[arg1] & 0xFF;
    }
}
