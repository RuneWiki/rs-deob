import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 implements class18 {

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Z")
    private boolean field489 = true;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Lt;")
    public static class36 field488 = class3.method8(13631, "overlay2)3dat");

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "I")
    public static volatile int field494 = -1;

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "Lt;")
    public static class36 field490 = class3.method8(13631, "fonts");

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Lt;")
    public static class36 field495 = class3.method8(13631, "Scimitar Shop");

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "Lt;")
    public static class36 field496 = class3.method8(13631, "Tannery");

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "Z")
    public static boolean field497 = false;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "I")
    private int field493;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field499;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "[B")
    public byte[] field491;

    @OriginalMember(owner = "mapview!t", name = "hashCode", descriptor = "()I", line = 14)
    public final int hashCode() {
        return this.method202((byte) 0);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BI)V", line = 53)
    public final void method196(byte arg0, int arg1) {
        int var3 = -65 / ((arg0 + 8) / 37);
        this.field493 = 0;
        if (!this.field489) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field491.length) {
                int var4;
                for (var4 = 1; var4 < arg1; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class16.method89(this.field491, 0, var5, 0, this.field492);
                this.field491 = var5;
            }
            for (int var6 = this.field492; var6 < arg1; var6++) {
                this.field491[var6] = 32;
            }
            this.field492 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 102)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class36)) {
            throw new IllegalArgumentException();
        }
        return this.method213((class36) arg0, (byte) -11);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)I", line = 123)
    public final int method197(byte arg0) {
        if (arg0 != -85) {
            field496 = null;
        }
        return this.field492;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)Lt;", line = 137)
    public final class36 method198(int arg0, int arg1) {
        if (arg1 != -20461) {
            this.method209((byte) 69, null);
        }
        return this.method200(0, arg0, this.field492);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(B)V", line = 149)
    public final void method199(byte arg0) {
        String var2;
        try {
            var2 = new String(this.field491, 0, this.field492, "ISO-8859-1");
            int var3 = 49 % ((91 - arg0) / 35);
        } catch (UnsupportedEncodingException var5) {
            var2 = new String(this.field491, 0, this.field492);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)Lt;", line = 177)
    public final class36 method200(int arg0, int arg1, int arg2) {
        class36 var4 = new class36();
        var4.field491 = new byte[arg2 - arg1];
        var4.field492 = arg2 - arg1;
        class16.method89(this.field491, arg1, var4.field491, arg0, var4.field492);
        return var4;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)Lt;", line = 191)
    public final class36 method201(int arg0) {
        class36 var2 = new class36();
        var2.field492 = this.field492;
        if (arg0 != 29876) {
            return (class36) null;
        }
        var2.field491 = new byte[this.field492];
        for (int var3 = 0; var3 < this.field492; var3++) {
            byte var4 = this.field491[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field491[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(B)I", line = 224)
    public final int method202(byte arg0) {
        if (arg0 != 0) {
            this.field489 = true;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field492; var3++) {
            var2 = (this.field491[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(B)Lt;", line = 248)
    public final class36 method203(byte arg0) {
        long var2 = this.method206(-2);
        synchronized (field499 == null ? (field499 = method220("t")) : field499) {
            if (class17.field224 == null) {
                class17.field224 = new class24(4096);
            } else {
                for (class27 var5 = (class27) class17.field224.method132(var2, (byte) -29); var5 != null; var5 = (class27) class17.field224.method133((byte) 84)) {
                    if (this.method213(var5.field410, (byte) -18)) {
                        return var5.field410;
                    }
                }
            }
            if (arg0 != -115) {
                return (class36) null;
            }
            class27 var6 = new class27();
            this.field489 = false;
            var6.field410 = this;
            class17.field224.method131(var6, var2, 60);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 249)
    public static Class method220(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 290)
    public final void method204(int arg0, int arg1, Graphics arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field491, 0, this.field492, "ISO-8859-1");
            int var6 = -81 % ((-arg1 - 23) / 49);
        } catch (UnsupportedEncodingException var8) {
            var5 = new String(this.field491, 0, this.field492);
        }
        arg2.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 325)
    public static void method205(int arg0) {
        field490 = null;
        if (arg0 != 1) {
            field490 = null;
        }
        field496 = null;
        field488 = null;
        field495 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(I)J", line = 340)
    private final long method206(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field492; var4++) {
            var2 = (var2 << 5) + (long) (this.field491[var4] & 0xFF) - var2;
        }
        return arg0 == -2 ? var2 : 14L;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IZ)I", line = 364)
    public final int method207(int arg0, boolean arg1) {
        return arg1 ? -29 : this.method214(0, arg0, -2);
    }

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "(B)Lt;", line = 380)
    public final class36 method208(byte arg0) {
        if (!this.field489) {
            throw new IllegalArgumentException();
        }
        this.field493 = 0;
        if (arg0 != 81) {
            return (class36) null;
        }
        if (this.field491.length != this.field492) {
            byte[] var2 = new byte[this.field492];
            class16.method89(this.field491, 0, var2, 0, this.field492);
            this.field491 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BLt;)Z", line = 412)
    public final boolean method209(byte arg0, class36 arg1) {
        if (this.field492 < arg1.field492) {
            return false;
        }
        int var3 = 0;
        if (arg0 != 70) {
            this.method215(-48, true);
        }
        while (arg1.field492 > var3) {
            if (this.field491[var3] != arg1.field491[var3]) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(I)I", line = 446)
    public static final int method210(int arg0) {
        if (arg0 <= 100) {
            field495 = null;
        }
        return class33.field459 == null ? 0 : class33.field459[class6.field65];
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I", line = 467)
    public final int method211(FontMetrics arg0, boolean arg1) {
        String var3;
        try {
            if (!arg1) {
                return 66;
            }
            var3 = new String(this.field491, 0, this.field492, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field491, 0, this.field492);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IB)Lt;", line = 490)
    public final class36 method212(int arg0, byte arg1) {
        if (arg1 <= 55) {
            return (class36) null;
        } else if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field489) {
            this.field493 = 0;
            if (this.field491.length == this.field492) {
                int var3;
                for (var3 = 1; var3 <= this.field492; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class16.method89(this.field491, 0, var4, 0, this.field492);
                this.field491 = var4;
            }
            this.field491[this.field492++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lt;B)Z", line = 531)
    public final boolean method213(class36 arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field492 == arg0.field492) {
            if (!this.field489 || !arg0.field489) {
                if (this.field493 == 0) {
                    this.field493 = this.method202((byte) 0);
                    if (this.field493 == 0) {
                        this.field493 = 1;
                    }
                }
                if (arg0.field493 == 0) {
                    arg0.field493 = arg0.method202((byte) 0);
                    if (arg0.field493 == 0) {
                        arg0.field493 = 1;
                    }
                }
                if (this.field493 != arg0.field493) {
                    return false;
                }
            }
            if (arg1 >= -2) {
                this.method198(101, -36);
            }
            for (int var3 = 0; var3 < this.field492; var3++) {
                if (this.field491[var3] != arg0.field491[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "toString", descriptor = "()Ljava/lang/String;", line = 590)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(III)I", line = 601)
    private final int method214(int arg0, int arg1, int arg2) {
        int var4 = -62 % ((-arg2 - 60) / 43);
        byte var5 = (byte) arg1;
        for (int var6 = arg0; var6 < this.field492; var6++) {
            if (this.field491[var6] == var5) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IZ)I", line = 633)
    public final int method215(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = arg1;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field492; var6++) {
            int var7 = this.field491[var6] & 0xFF;
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
            if (var7 >= arg0) {
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

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(IB)I", line = 707)
    public final int method216(int arg0, byte arg1) {
        if (arg1 != 2) {
            this.method209((byte) -46, null);
        }
        return this.field491[arg0] & 0xFF;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ILt;)I", line = 746)
    public final int method217(int arg0, class36 arg1) {
        if (arg0 != 1) {
            field496 = null;
        }
        int var3;
        if (this.field492 <= arg1.field492) {
            var3 = this.field492;
        } else {
            var3 = arg1.field492;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field491[var4] & 0xFF) > (this.field491[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field491[var4] & 0xFF) > (arg1.field491[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field492 < arg1.field492) {
            return -1;
        } else if (arg1.field492 >= this.field492) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ZII)Lt;", line = 820)
    public final class36 method218(boolean arg0, int arg1, int arg2) {
        byte var4 = (byte) arg2;
        byte var5 = (byte) arg1;
        class36 var6 = new class36();
        var6.field492 = this.field492;
        var6.field491 = new byte[this.field492];
        if (!arg0) {
            return (class36) null;
        }
        for (int var7 = 0; var7 < this.field492; var7++) {
            byte var8 = this.field491[var7];
            if (var4 == var8) {
                var6.field491[var7] = var5;
            } else {
                var6.field491[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "(I)I", line = 853)
    public final int method219(int arg0) {
        return arg0 == 10 ? this.method215(10, false) : 113;
    }
}
