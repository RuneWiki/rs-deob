import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class41 implements class15 {

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "Z")
    private boolean field499 = true;

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "[I")
    public static int[] field505 = new int[128];

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "I")
    public static volatile int field500 = 0;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "Lua;")
    public static class41 field501 = class16.method86("Loading", true);

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "Lua;")
    public static class41 field502 = class16.method86("overlay)3dat", true);

    @OriginalMember(owner = "mapview!ua", name = "j", descriptor = "Z")
    public static boolean field508 = false;

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "I")
    public static int field506 = -1;

    @OriginalMember(owner = "mapview!ua", name = "l", descriptor = "I")
    public static int field510 = 0;

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "mapview!ua", name = "i", descriptor = "I")
    private int field507;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!ua", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field511;

    @OriginalMember(owner = "mapview!ua", name = "k", descriptor = "[B")
    public byte[] field509;

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "[Ln;")
    public static class26[] field504;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(ILua;)I", line = 8)
    public final int method222(int arg0, class41 arg1) {
        if (arg0 >= -99) {
            field508 = false;
        }
        int var3;
        if (arg1.field503 < this.field503) {
            var3 = arg1.field503;
        } else {
            var3 = this.field503;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field509[var4] & 0xFF) > (this.field509[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field509[var4] & 0xFF) > (arg1.field509[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field503 < arg1.field503) {
            return -1;
        } else if (this.field503 <= arg1.field503) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IZ)Lua;", line = 54)
    public final class41 method223(int arg0, boolean arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field499) {
            this.field507 = 0;
            if (this.field509.length == this.field503) {
                int var3;
                for (var3 = 1; var3 <= this.field503; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class33.method195(this.field509, 0, var4, 0, this.field503);
                this.field509 = var4;
            }
            if (arg1) {
                this.field499 = false;
            }
            this.field509[this.field503++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I)J", line = 99)
    private final long method224(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field503; var4++) {
            var2 = (var2 << 5) + (long) (this.field509[var4] & 0xFF) - var2;
        }
        if (arg0 != 9868) {
            field510 = 16;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Lua;I)Z", line = 117)
    public final boolean method225(class41 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field503 == arg0.field503) {
            if (!this.field499 || !arg0.field499) {
                if (this.field507 == 0) {
                    this.field507 = this.method243((byte) 80);
                    if (this.field507 == 0) {
                        this.field507 = 1;
                    }
                }
                if (arg0.field507 == 0) {
                    arg0.field507 = arg0.method243((byte) 110);
                    if (arg0.field507 == 0) {
                        arg0.field507 = 1;
                    }
                }
                if (this.field507 != arg0.field507) {
                    return false;
                }
            }
            for (int var3 = arg1; var3 < this.field503; var3++) {
                if (this.field509[var3] != arg0.field509[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IIB)Lua;", line = 174)
    public final class41 method226(int arg0, int arg1, byte arg2) {
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        class41 var6 = new class41();
        if (arg2 > -62) {
            this.method229(38, true);
        }
        var6.field503 = this.field503;
        var6.field509 = new byte[this.field503];
        for (int var7 = 0; var7 < this.field503; var7++) {
            byte var8 = this.field509[var7];
            if (var4 == var8) {
                var6.field509[var7] = var5;
            } else {
                var6.field509[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 208)
    public final int method227(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field509, arg1, this.field503, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field509, 0, this.field503);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Z)Lua;", line = 231)
    public final class41 method228(boolean arg0) {
        if (!arg0) {
            return (class41) null;
        }
        long var2 = this.method224(9868);
        synchronized (field511 == null ? (field511 = method247("ua")) : field511) {
            if (class14.field127 == null) {
                class14.field127 = new class10(4096);
            } else {
                for (class40 var5 = (class40) class14.field127.method58((byte) 48, var2); var5 != null; var5 = (class40) class14.field127.method56(-13055)) {
                    if (this.method225(var5.field498, 0)) {
                        return var5.field498;
                    }
                }
            }
            class40 var6 = new class40();
            var6.field498 = this;
            this.field499 = false;
            class14.field127.method59(var6, 0, var2);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 236)
    public static Class method247(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(IZ)Lua;", line = 270)
    public final class41 method229(int arg0, boolean arg1) {
        if (!arg1) {
            this.method225(null, -44);
        }
        return this.method244(arg0, this.field503, arg1);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IB)I", line = 284)
    public final int method230(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 != 38) {
            this.equals(null);
        }
        for (int var6 = 0; var6 < this.field503; var6++) {
            int var7 = this.field509[var6] & 0xFF;
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

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(Z)Lua;", line = 358)
    public final class41 method231(boolean arg0) {
        if (!this.field499) {
            throw new IllegalArgumentException();
        }
        this.field507 = 0;
        if (this.field509.length != this.field503) {
            byte[] var2 = new byte[this.field503];
            class33.method195(this.field509, 0, var2, 0, this.field503);
            this.field509 = var2;
        }
        if (arg0) {
            this.field499 = true;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)I", line = 390)
    public final int method232(byte arg0) {
        return arg0 > -33 ? 121 : this.method230(10, (byte) 38);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(II)I", line = 416)
    public final int method233(int arg0, int arg1) {
        int var3 = -61 / ((-arg0 - 41) / 36);
        return this.field509[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(B)I", line = 433)
    public final int method234(byte arg0) {
        if (arg0 <= 91) {
            this.hashCode();
        }
        return this.field503;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 451)
    public final void method235(Graphics arg0, int arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field509, 0, this.field503, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field509, 0, this.field503);
        }
        arg0.drawString(var5, arg1, arg3);
        if (arg2 != 21032) {
            this.method241(-63, (byte) -29);
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;", line = 467)
    public static final Object method236(boolean arg0, byte[] arg1, byte arg2) {
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class32.field421) {
            try {
                class1 var3 = (class1) Class.forName("g").getDeclaredConstructor().newInstance();
                var3.method1(arg1, (byte) -22);
                return var3;
            } catch (Throwable var5) {
                class32.field421 = true;
            }
        }
        if (arg2 < 34) {
            field505 = null;
        }
        return arg0 ? class4.method35(7360, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(I)Lua;", line = 501)
    public final class41 method237(int arg0) {
        int var2 = -97 / ((arg0 + 9) / 54);
        class41 var3 = new class41();
        var3.field503 = this.field503;
        var3.field509 = new byte[this.field503];
        for (int var4 = 0; var4 < this.field503; var4++) {
            byte var5 = this.field509[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var3.field509[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "mapview!ua", name = "hashCode", descriptor = "()I", line = 537)
    public final int hashCode() {
        return this.method243((byte) 78);
    }

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "(B)B", line = 552)
    public static final byte method238(byte arg0) {
        if (arg0 < 77) {
            method239(115);
        }
        return mapview.field358 == null ? 0 : mapview.field358[class42.field514];
    }

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "(I)V", line = 609)
    public static void method239(int arg0) {
        field501 = null;
        field502 = null;
        field504 = null;
        field505 = null;
        if (arg0 != 90) {
            field505 = null;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "toString", descriptor = "()Ljava/lang/String;", line = 633)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(BI)I", line = 651)
    public final int method240(byte arg0, int arg1) {
        if (arg0 != -32) {
            field504 = null;
        }
        return this.method246((byte) 95, 0, arg1);
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(IB)V", line = 663)
    public final void method241(int arg0, byte arg1) {
        this.field507 = 0;
        if (!this.field499) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field509.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class33.method195(this.field509, 0, var4, 0, this.field503);
                this.field509 = var4;
            }
            for (int var5 = this.field503; var5 < arg0; var5++) {
                this.field509[var5] = 32;
            }
            int var6 = -52 / ((arg1 - 36) / 45);
            this.field503 = arg0;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "(I)V", line = 719)
    public final void method242(int arg0) {
        if (arg0 != 1) {
            this.method240((byte) -41, -37);
        }
        String var2;
        try {
            var2 = new String(this.field509, 0, this.field503, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field509, 0, this.field503);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "(B)I", line = 744)
    public final int method243(byte arg0) {
        int var2 = -40 % ((arg0 - 31) / 40);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field503; var4++) {
            var3 = (var3 << 5) + (this.field509[var4] & 0xFF) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "mapview!ua", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 762)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class41)) {
            throw new IllegalArgumentException();
        }
        return this.method225((class41) arg0, 0);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(IIZ)Lua;", line = 786)
    public final class41 method244(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return (class41) null;
        }
        class41 var4 = new class41();
        var4.field509 = new byte[arg1 - arg0];
        var4.field503 = arg1 - arg0;
        class33.method195(this.field509, arg0, var4.field509, 0, var4.field503);
        return var4;
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(Lua;I)Z", line = 826)
    public final boolean method245(class41 arg0, int arg1) {
        if (this.field503 < arg0.field503) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field503; var3++) {
            if (this.field509[var3] != arg0.field509[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(BII)I", line = 848)
    private final int method246(byte arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg0 < 76) {
            field508 = false;
        }
        for (int var5 = arg1; var5 < this.field503; var5++) {
            if (this.field509[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }
}
