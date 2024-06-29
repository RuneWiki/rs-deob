import java.awt.Canvas;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class40 implements class4 {

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Z")
    private boolean field516 = true;

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Lv;")
    public static class40 field512 = class24.method170("Mini)2Game", (byte) 78);

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "Lv;")
    public static class40 field517 = class24.method170("Suchen", (byte) 12);

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Lv;")
    public static class40 field518 = class24.method170("null", (byte) -126);

    @OriginalMember(owner = "mapview!v", name = "o", descriptor = "Lv;")
    public static class40 field523 = class24.method170("Prev page", (byte) 26);

    @OriginalMember(owner = "mapview!v", name = "q", descriptor = "Z")
    public static volatile boolean field525 = true;

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "mapview!v", name = "l", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "mapview!v", name = "m", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "mapview!v", name = "p", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field509;

    @OriginalMember(owner = "mapview!v", name = "n", descriptor = "Ljava/awt/Image;")
    public static Image field522;

    // $FF: synthetic field
    @OriginalMember(owner = "mapview!v", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field526;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "[B")
    public byte[] field511;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "[Li;")
    public static class15[] field513;

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "[[Lma;")
    public static class23[][] field519;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Lv;I)Z", line = 6)
    public final boolean method242(class40 arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else if (this.field510 != arg0.field510) {
            return false;
        } else if (arg1 == -16673) {
            if (!this.field516 || !arg0.field516) {
                if (this.field524 == 0) {
                    this.field524 = this.method253(false);
                    if (this.field524 == 0) {
                        this.field524 = 1;
                    }
                }
                if (arg0.field524 == 0) {
                    arg0.field524 = arg0.method253(false);
                    if (arg0.field524 == 0) {
                        arg0.field524 = 1;
                    }
                }
                if (this.field524 != arg0.field524) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field510; var3++) {
                if (this.field511[var3] != arg0.field511[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(II)Lv;", line = 80)
    public final class40 method243(int arg0, int arg1) {
        if (arg0 != 30253) {
            field512 = null;
        }
        return this.method251(this.field510, -65, arg1);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 115)
    public final void method244(int arg0, byte arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field511, 0, this.field510, "ISO-8859-1");
        } catch (UnsupportedEncodingException var8) {
            var5 = new String(this.field511, 0, this.field510);
        }
        int var7 = -43 / ((arg1 + 35) / 60);
        arg3.drawString(var5, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(II)Lv;", line = 155)
    public final class40 method245(int arg0, int arg1) {
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field516) {
            this.field524 = 0;
            if (this.field511.length == this.field510) {
                int var3;
                for (var3 = 1; var3 <= this.field510; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class28.method192(this.field511, 0, var4, 0, this.field510);
                this.field511 = var4;
            }
            this.field511[this.field510++] = (byte) arg0;
            if (arg1 != -44) {
                field514 = 91;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!v", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 193)
    public final boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            throw new IllegalArgumentException();
        }
        return this.method242((class40) arg0, -16673);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)V", line = 211)
    public final void method246(int arg0) {
        String var2;
        try {
            var2 = new String(this.field511, 0, this.field510, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field511, 0, this.field510);
        }
        System.out.println(var2);
        if (arg0 != -24312) {
            this.field524 = -34;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(B)Lv;", line = 233)
    public final class40 method247(byte arg0) {
        long var2 = this.method248((byte) -18);
        synchronized (field526 == null ? (field526 = method266("v")) : field526) {
            if (class19.field202 == null) {
                class19.field202 = new class37(4096);
            } else {
                for (class32 var5 = (class32) class19.field202.method223(var2, (byte) -73); var5 != null; var5 = (class32) class19.field202.method224(25938)) {
                    if (this.method242(var5.field437, -16673)) {
                        return var5.field437;
                    }
                }
            }
            int var6 = 59 / ((-arg0 - 11) / 61);
            class32 var7 = new class32();
            this.field516 = false;
            var7.field437 = this;
            class19.field202.method227(var2, -82, var7);
            return this;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 234)
    public static Class method266(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "mapview!v", name = "hashCode", descriptor = "()I", line = 273)
    public final int hashCode() {
        return this.method253(false);
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(B)J", line = 284)
    private final long method248(byte arg0) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = -71 % ((arg0 - 69) / 32);
        while (this.field510 > var4) {
            var2 = (var2 << 5) + (long) (this.field511[var4] & 0xFF) - var2;
            var4++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 304)
    public final int method249(int arg0, FontMetrics arg1) {
        String var4;
        try {
            int var3 = -114 / ((62 - arg0) / 55);
            var4 = new String(this.field511, 0, this.field510, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var4 = new String(this.field511, 0, this.field510);
        }
        return arg1.stringWidth(var4);
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(II)V", line = 320)
    public final void method250(int arg0, int arg1) {
        this.field524 = 0;
        if (!this.field516) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field511.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class28.method192(this.field511, 0, var4, 0, this.field510);
                this.field511 = var4;
            }
            if (arg0 != -14231) {
                this.method263(-7);
            }
            for (int var5 = this.field510; var5 < arg1; var5++) {
                this.field511[var5] = 32;
            }
            this.field510 = arg1;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(III)Lv;", line = 391)
    public final class40 method251(int arg0, int arg1, int arg2) {
        int var4 = -17 / ((arg1 - 92) / 32);
        class40 var5 = new class40();
        var5.field510 = arg0 - arg2;
        var5.field511 = new byte[arg0 - arg2];
        class28.method192(this.field511, arg2, var5.field511, 0, var5.field510);
        return var5;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILv;)I", line = 407)
    public final int method252(int arg0, class40 arg1) {
        int var3;
        if (this.field510 > arg1.field510) {
            var3 = arg1.field510;
        } else {
            var3 = this.field510;
        }
        if (arg0 != 48) {
            return -95;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field511[var4] & 0xFF) > (this.field511[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field511[var4] & 0xFF) > (arg1.field511[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field510 > this.field510) {
            return -1;
        } else if (arg1.field510 < this.field510) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(Z)I", line = 466)
    public final int method253(boolean arg0) {
        int var2 = 0;
        int var3 = 0;
        if (arg0) {
            this.method257(116);
        }
        while (this.field510 > var3) {
            var2 = (this.field511[var3] & 0xFF) + (var2 << 5) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(II)I", line = 488)
    public final int method254(int arg0, int arg1) {
        int var3 = -113 % (arg0 / 48);
        return this.field511[arg1] & 0xFF;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(BI)I", line = 498)
    public final int method255(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != 93) {
            return 102;
        }
        for (int var6 = 0; var6 < this.field510; var6++) {
            int var7 = this.field511[var6] & 0xFF;
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
            if (var7 >= arg1) {
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
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(B)Lv;", line = 588)
    public final class40 method256(byte arg0) {
        class40 var2 = new class40();
        var2.field510 = this.field510;
        var2.field511 = new byte[this.field510];
        int var3 = 0;
        if (arg0 != 116) {
            field513 = null;
        }
        while (var3 < this.field510) {
            byte var4 = this.field511[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field511[var3] = var4;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)I", line = 616)
    public final int method257(int arg0) {
        return arg0 == 10 ? this.method255((byte) 93, 10) : 88;
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(Lv;I)Z", line = 637)
    public final boolean method258(class40 arg0, int arg1) {
        if (this.field510 < arg0.field510) {
            return false;
        }
        if (arg1 < 126) {
            field512 = null;
        }
        for (int var3 = 0; var3 < arg0.field510; var3++) {
            if (this.field511[var3] != arg0.field511[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(I)V", line = 668)
    public static void method259(int arg0) {
        field522 = null;
        field512 = null;
        field523 = null;
        field519 = null;
        field517 = null;
        field518 = null;
        if (arg0 != -49) {
            field521 = 79;
        }
        field509 = null;
        field513 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IB)I", line = 693)
    public final int method260(int arg0, byte arg1) {
        if (arg1 != 76) {
            this.method253(true);
        }
        return this.method261(0, (byte) -70, arg0);
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IBI)I", line = 706)
    private final int method261(int arg0, byte arg1, int arg2) {
        byte var4 = (byte) arg2;
        if (arg1 != -70) {
            return -6;
        }
        for (int var5 = arg0; var5 < this.field510; var5++) {
            if (this.field511[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(I)I", line = 736)
    public final int method262(int arg0) {
        return arg0 == 736276196 ? this.field510 : 60;
    }

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "(I)Lv;", line = 746)
    public final class40 method263(int arg0) {
        if (arg0 != 25877) {
            field519 = null;
        }
        if (!this.field516) {
            throw new IllegalArgumentException();
        }
        this.field524 = 0;
        if (this.field511.length != this.field510) {
            byte[] var2 = new byte[this.field510];
            class28.method192(this.field511, 0, var2, 0, this.field510);
            this.field511 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "mapview!v", name = "toString", descriptor = "()Ljava/lang/String;", line = 790)
    public final String toString() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IIB)Lv;", line = 802)
    public final class40 method264(int arg0, int arg1, byte arg2) {
        byte var4 = (byte) arg1;
        int var5 = -89 % ((arg2 + 44) / 35);
        byte var6 = (byte) arg0;
        class40 var7 = new class40();
        var7.field510 = this.field510;
        var7.field511 = new byte[this.field510];
        for (int var8 = 0; var8 < this.field510; var8++) {
            byte var9 = this.field511[var8];
            if (var6 == var9) {
                var7.field511[var8] = var4;
            } else {
                var7.field511[var8] = var9;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(B)I", line = 834)
    public static final int method265(byte arg0) {
        if (arg0 == -89) {
            return class37.field486 == null ? 0 : class37.field486[class20.field213];
        } else {
            return -17;
        }
    }
}
