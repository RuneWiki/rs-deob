import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class38 implements class28 {

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "Z")
    private boolean field506 = true;

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "Lw;")
    public static class38 field504 = class35.method219("Guide", true);

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "Lw;")
    public static class38 field501 = class35.method219("Shield Shop", true);

    @OriginalMember(owner = "mapview!w", name = "j", descriptor = "Lw;")
    public static class38 field510 = class35.method219("Platebody Shop", true);

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "Lw;")
    public static class38 field508 = class35.method219("Mini)2Game", true);

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Lw;")
    public static class38 field509;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!w", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field511;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "[B")
    public byte[] field503;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "[I")
    public static int[] field505;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Z)I", line = 7)
    public final int method232(boolean arg0) {
        if (arg0) {
            this.equals(null);
        }
        return this.method245(10, 19160);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)V", line = 21)
    public static void method233(int arg0) {
        field504 = null;
        field505 = null;
        field510 = null;
        if (arg0 != 15339) {
            field508 = null;
        }
        field509 = null;
        field501 = null;
        field508 = null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIZ)Lw;", line = 41)
    public final class38 method234(int arg0, int arg1, boolean arg2) {
        byte var4 = (byte) arg1;
        class38 var5 = new class38();
        byte var6 = (byte) arg0;
        var5.field502 = this.field502;
        var5.field503 = new byte[this.field502];
        if (!arg2) {
            this.method237(24, (byte) 82);
        }
        for (int var7 = 0; var7 < this.field502; var7++) {
            byte var8 = this.field503[var7];
            if (var4 == var8) {
                var5.field503[var7] = var6;
            } else {
                var5.field503[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(II)Lw;", line = 87)
    public final class38 method235(int arg0, int arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field506) {
            this.field507 = 0;
            int var3 = -119 % ((17 - arg1) / 63);
            if (this.field503.length == this.field502) {
                int var4;
                for (var4 = 1; var4 <= this.field502; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class2.method5(this.field503, 0, var5, 0, this.field502);
                this.field503 = var5;
            }
            this.field503[this.field502++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lw;I)Z", line = 123)
    public final boolean method236(class38 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field502 == arg0.field502) {
            if (!this.field506 || !arg0.field506) {
                if (this.field507 == 0) {
                    this.field507 = this.method249((byte) -92);
                    if (this.field507 == 0) {
                        this.field507 = 1;
                    }
                }
                if (arg0.field507 == 0) {
                    arg0.field507 = arg0.method249((byte) -31);
                    if (arg0.field507 == 0) {
                        arg0.field507 = 1;
                    }
                }
                if (this.field507 != arg0.field507) {
                    return false;
                }
            }
            if (arg1 > -77) {
                this.method253(0, null, -94, -50);
            }
            for (int var3 = 0; var3 < this.field502; var3++) {
                if (this.field503[var3] != arg0.field503[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IB)I", line = 185)
    public final int method237(int arg0, byte arg1) {
        if (arg1 != -99) {
            this.method250(-72, 60);
        }
        return this.field503[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIB)I", line = 204)
    private final int method238(int arg0, int arg1, byte arg2) {
        int var4 = 40 % ((1 - arg2) / 54);
        byte var5 = (byte) arg0;
        for (int var6 = arg1; var6 < this.field502; var6++) {
            if (this.field503[var6] == var5) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/applet/Applet;B)Lw;", line = 236)
    public final class38 method239(Applet arg0, byte arg1) {
        if (arg1 != -106) {
            this.field507 = 59;
        }
        String var3 = new String(this.field503, 0, this.field502);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class13.method60((byte) -116, var4);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)Lw;", line = 267)
    public final class38 method240(byte arg0) {
        if (arg0 != -37) {
            field508 = null;
        }
        class38 var2 = new class38();
        var2.field502 = this.field502;
        var2.field503 = new byte[this.field502];
        for (int var3 = 0; var3 < this.field502; var3++) {
            byte var4 = this.field503[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field503[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(B)V", line = 296)
    public final void method241(byte arg0) {
        if (arg0 > -65) {
            this.method234(-114, 50, true);
        }
        String var2;
        try {
            var2 = new String(this.field503, 0, this.field502, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field503, 0, this.field502);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(II)Lw;", line = 326)
    public final class38 method242(int arg0, int arg1) {
        return arg0 == 0 ? this.method244(this.field502, arg1, 0) : (class38) null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 339)
    public final int method243(FontMetrics arg0, int arg1) {
        String var3;
        try {
            if (arg1 != 1) {
                field508 = null;
            }
            var3 = new String(this.field503, 0, this.field502, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field503, 0, this.field502);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(III)Lw;", line = 358)
    public final class38 method244(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field502 = -24;
        }
        class38 var4 = new class38();
        var4.field502 = arg0 - arg1;
        var4.field503 = new byte[arg0 - arg1];
        class2.method5(this.field503, arg1, var4.field503, 0, var4.field502);
        return var4;
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(II)I", line = 373)
    private final int method245(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != 19160) {
            this.method232(false);
        }
        for (int var6 = 0; var6 < this.field502; var6++) {
            int var7 = this.field503[var6] & 0xFF;
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
            if (arg0 <= var7) {
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

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(Z)Lw;", line = 481)
    public final class38 method246(boolean arg0) {
        if (!this.field506) {
            throw new IllegalArgumentException();
        }
        this.field507 = 0;
        if (this.field503.length != this.field502) {
            byte[] var2 = new byte[this.field502];
            class2.method5(this.field503, 0, var2, 0, this.field502);
            this.field503 = var2;
        }
        return arg0 ? this : (class38) null;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ZI)I", line = 519)
    public final int method247(boolean arg0, int arg1) {
        if (!arg0) {
            field505 = null;
        }
        return this.method238(arg1, 0, (byte) -92);
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(B)J", line = 531)
    private final long method248(byte arg0) {
        if (arg0 != -99) {
            field510 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field502; var4++) {
            var2 = (var2 << 5) + (long) (this.field503[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(B)I", line = 550)
    public final int method249(byte arg0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -73 % ((arg0 - 19) / 47);
        while (this.field502 > var3) {
            var2 = (var2 << 5) + (this.field503[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!w", name = "hashCode", descriptor = "()I", line = 576)
    public final int hashCode() {
        return this.method249((byte) 106);
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(II)V", line = 589)
    public final void method250(int arg0, int arg1) {
        this.field507 = 0;
        if (!this.field506) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > -77) {
                field501 = null;
            }
            if (this.field503.length < arg1) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class2.method5(this.field503, 0, var4, 0, this.field502);
                this.field503 = var4;
            }
            for (int var5 = this.field502; var5 < arg1; var5++) {
                this.field503[var5] = 32;
            }
            this.field502 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(Z)I", line = 636)
    public final int method251(boolean arg0) {
        return arg0 ? this.field502 : 27;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)Lw;", line = 651)
    public final class38 method252(int arg0) {
        long var2 = this.method248((byte) -99);
        synchronized (field511 == null ? (field511 = method255("w")) : field511) {
            if (arg0 != 0) {
                return (class38) null;
            }
            if (class13.field116 == null) {
                class13.field116 = new class19(4096);
            } else {
                for (class11 var5 = (class11) class13.field116.method118(arg0 ^ 0xFFFFC293, var2); var5 != null; var5 = (class11) class13.field116.method114(73)) {
                    if (this.method236(var5.field95, -91)) {
                        return var5.field95;
                    }
                }
            }
            class11 var6 = new class11();
            var6.field95 = this;
            this.field506 = false;
            class13.field116.method119(var6, arg0 - 51, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 652)
    public static Class method255(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!w", name = "toString", descriptor = "()Ljava/lang/String;", line = 691)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 722)
    public final void method253(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 13 % ((-arg3 - 69) / 41);
        String var6;
        try {
            var6 = new String(this.field503, 0, this.field502, "ISO-8859-1");
        } catch (UnsupportedEncodingException var8) {
            var6 = new String(this.field503, 0, this.field502);
        }
        arg1.drawString(var6, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!w", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 746)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class38)) {
            throw new IllegalArgumentException();
        }
        return this.method236((class38) arg0, -127);
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(Lw;B)I", line = 765)
    public final int method254(class38 arg0, byte arg1) {
        int var3;
        if (this.field502 <= arg0.field502) {
            var3 = this.field502;
        } else {
            var3 = arg0.field502;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field503[var4] & 0xFF) > (this.field503[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field503[var4] & 0xFF) < (this.field503[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1 <= 63) {
            return -48;
        } else if (arg0.field502 > this.field502) {
            return -1;
        } else if (this.field502 > arg0.field502) {
            return 1;
        } else {
            return 0;
        }
    }
}
