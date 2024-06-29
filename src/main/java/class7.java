import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 implements class10 {

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "Z")
    private boolean field89 = true;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Ld;")
    public static class7 field80 = class37.method242("Water Source", 1333943984);

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ld;")
    public static class7 field83 = class37.method242("Tannery", 1333943984);

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Ld;")
    public static class7 field85 = class37.method242("Fishing Spot", 1333943984);

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "Ld;")
    public static class7 field82 = class37.method242("Loom", 1333943984);

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "Ld;")
    public static class7 field87 = class37.method242("Saw Mill", 1333943984);

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "I")
    public static int field84 = 0;

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "mapview!d", name = "l", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "Lb;")
    public static class3 field86;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!d", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field91;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "[B")
    public byte[] field79;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "[I")
    public static int[] field81;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(III)Ld;", line = 11)
    public final class7 method53(int arg0, int arg1, int arg2) {
        class7 var4 = new class7();
        var4.field79 = new byte[arg2 - arg1];
        var4.field90 = arg2 - arg1;
        class19.method136(this.field79, arg1, var4.field79, 0, var4.field90);
        if (arg0 < 48) {
            this.method70((byte) 33, null);
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 44)
    public static void method54(int arg0) {
        field87 = null;
        field80 = null;
        field82 = null;
        if (arg0 != 10899) {
            field85 = null;
        }
        field86 = null;
        field81 = null;
        field85 = null;
        field83 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BI)I", line = 61)
    public final int method55(byte arg0, int arg1) {
        return arg0 == 9 ? this.method68(arg1, 0, -28222) : 3;
    }

    @OriginalMember(owner = "mapview!d", name = "toString", descriptor = "()Ljava/lang/String;", line = 86)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)I", line = 99)
    public final int method56(byte arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < this.field90; var3++) {
            var2 = (var2 << 5) + (this.field79[var3] & 0xFF) - var2;
        }
        int var4 = 117 % ((arg0 - 79) / 40);
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(III)Ld;", line = 120)
    public final class7 method57(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        if (arg0 <= 64) {
            this.method53(-28, 0, 126);
        }
        class7 var6 = new class7();
        var6.field90 = this.field90;
        var6.field79 = new byte[this.field90];
        for (int var7 = 0; var7 < this.field90; var7++) {
            byte var8 = this.field79[var7];
            if (var4 == var8) {
                var6.field79[var7] = var5;
            } else {
                var6.field79[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!d", name = "hashCode", descriptor = "()I", line = 160)
    public final int hashCode() {
        return this.method56((byte) -125);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(IB)I", line = 167)
    private final int method58(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = -53 / ((arg1 - 45) / 41);
        int var6 = 0;
        for (int var7 = 0; var7 < this.field90; var7++) {
            int var8 = this.field79[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
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
            if (var8 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var6 = var9;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)V", line = 256)
    public final void method59(byte arg0) {
        if (arg0 != -15) {
            this.method65(-1, (byte) -122);
        }
        String var2;
        try {
            var2 = new String(this.field79, 0, this.field90, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field79, 0, this.field90);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)V", line = 274)
    public final void method60(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method53(116, 94, -92);
        }
        this.field88 = 0;
        if (!this.field89) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field79.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class19.method136(this.field79, 0, var4, 0, this.field90);
                this.field79 = var4;
            }
            for (int var5 = this.field90; var5 < arg1; var5++) {
                this.field79[var5] = 32;
            }
            this.field90 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(II)Ld;", line = 344)
    public final class7 method61(int arg0, int arg1) {
        return arg0 == -17333 ? this.method53(115, arg1, this.field90) : (class7) null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZLjava/applet/Applet;)Ld;", line = 357)
    public final class7 method62(boolean arg0, Applet arg1) {
        String var3 = new String(this.field79, 0, this.field90);
        String var4 = arg1.getParameter(var3);
        if (arg0) {
            return var4 == null ? null : class24.method159(true, var4);
        } else {
            return (class7) null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(I)I", line = 375)
    public static final int method63(int arg0) {
        int var1 = 42 % ((-arg0 - 88) / 32);
        if (class4.field52 == null) {
            return 0;
        } else if (class4.field52.field461 == null) {
            return class28.field415[class4.field52.field469 & 0xFF];
        } else {
            return class28.field415[class4.field52.field461[class16.field166] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(II)I", line = 393)
    public final int method64(int arg0, int arg1) {
        if (arg0 < 19) {
            field85 = null;
        }
        return this.field79[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(IB)Ld;", line = 404)
    public final class7 method65(int arg0, byte arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        if (arg1 <= 74) {
            this.toString();
        }
        if (!this.field89) {
            throw new IllegalArgumentException();
        }
        this.field88 = 0;
        if (this.field79.length == this.field90) {
            int var3;
            for (var3 = 1; var3 <= this.field90; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class19.method136(this.field79, 0, var4, 0, this.field90);
            this.field79 = var4;
        }
        this.field79[this.field90++] = (byte) arg0;
        return this;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ld;Ld;Lba;I)[Lj;", line = 452)
    public static final class18[] method66(class7 arg0, class7 arg1, class4 arg2, int arg3) {
        if (arg3 != 12127) {
            field84 = -13;
        }
        int var4 = arg2.method27(false, arg0);
        int var5 = arg2.method25((byte) -30, var4, arg1);
        return class35.method231(arg2, true, var5, var4);
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(B)I", line = 487)
    public final int method67(byte arg0) {
        if (arg0 != 43) {
            field84 = 33;
        }
        return this.method58(10, (byte) 86);
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(III)I", line = 505)
    private final int method68(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        if (arg2 != -28222) {
            this.toString();
        }
        for (int var5 = arg1; var5 < this.field90; var5++) {
            if (this.field79[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(I)Ld;", line = 532)
    public final class7 method69(int arg0) {
        if (!this.field89) {
            throw new IllegalArgumentException();
        }
        this.field88 = 0;
        if (this.field79.length != this.field90) {
            byte[] var2 = new byte[this.field90];
            class19.method136(this.field79, 0, var2, 0, this.field90);
            this.field79 = var2;
        }
        return arg0 == -5 ? this : (class7) null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(BLd;)Z", line = 563)
    public final boolean method70(byte arg0, class7 arg1) {
        if (arg1 == null) {
            return false;
        } else if (arg0 <= 82) {
            return false;
        } else if (this.field90 == arg1.field90) {
            if (!this.field89 || !arg1.field89) {
                if (this.field88 == 0) {
                    this.field88 = this.method56((byte) -108);
                    if (this.field88 == 0) {
                        this.field88 = 1;
                    }
                }
                if (arg1.field88 == 0) {
                    arg1.field88 = arg1.method56((byte) 8);
                    if (arg1.field88 == 0) {
                        arg1.field88 = 1;
                    }
                }
                if (this.field88 != arg1.field88) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field90; var3++) {
                if (this.field79[var3] != arg1.field79[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 637)
    public final boolean equals(Object arg0) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 649)
    public final void method71(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field79, 0, this.field90, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field79, 0, this.field90);
        }
        arg1.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ZLd;)I", line = 683)
    public final int method72(boolean arg0, class7 arg1) {
        int var3;
        if (this.field90 > arg1.field90) {
            var3 = arg1.field90;
        } else {
            var3 = this.field90;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (this.field79[var4] < arg1.field79[var4]) {
                return -1;
            }
            if (this.field79[var4] > arg1.field79[var4]) {
                return 1;
            }
        }
        if (this.field90 < arg1.field90) {
            return -1;
        } else if (this.field90 > arg1.field90) {
            return 1;
        } else if (arg0) {
            return 109;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "(B)Ld;", line = 723)
    public final class7 method73(byte arg0) {
        class7 var2 = new class7();
        var2.field90 = this.field90;
        var2.field79 = new byte[this.field90];
        for (int var3 = 0; var3 < this.field90; var3++) {
            byte var4 = this.field79[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field79[var3] = var4;
        }
        if (arg0 != 12) {
            this.method76(41);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "(B)[B", line = 752)
    public final byte[] method74(byte arg0) {
        if (arg0 == 75) {
            byte[] var2 = new byte[this.field90];
            class19.method136(this.field79, 0, var2, 0, this.field90);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "(I)Ld;", line = 769)
    public final class7 method75(int arg0) {
        long var2 = this.method76(-111);
        if (arg0 != 4096) {
            return (class7) null;
        }
        synchronized (field91 == null ? (field91 = method79("d")) : field91) {
            if (class29.field435 == null) {
                class29.field435 = new class20(4096);
            } else {
                for (class25 var5 = (class25) class29.field435.method140(var2, arg0 ^ 0x1001); var5 != null; var5 = (class25) class29.field435.method138(arg0 ^ 0xFFFFEFFF)) {
                    if (this.method70((byte) 123, var5.field238)) {
                        return var5.field238;
                    }
                }
            }
            class25 var6 = new class25();
            this.field89 = false;
            var6.field238 = this;
            class29.field435.method137(var6, var2, -9435);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 773)
    public static Class method79(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "(I)J", line = 822)
    private final long method76(int arg0) {
        long var2 = 0L;
        int var4 = 0;
        if (arg0 >= -27) {
            return -31L;
        }
        while (var4 < this.field90) {
            var2 = (var2 << 5) - (var2 - ((long) (this.field79[var4] & 0xFF)));
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 846)
    public final int method77(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field79, 0, this.field90, "ISO-8859-1");
            if (arg0 >= -114) {
                this.method71(123, null, 57, 86);
            }
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field79, 0, this.field90);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "(B)I", line = 863)
    public final int method78(byte arg0) {
        if (arg0 != 106) {
            this.method76(-67);
        }
        return this.field90;
    }
}
