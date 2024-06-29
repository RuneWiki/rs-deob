import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 implements class60 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Z")
    private boolean field123 = true;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Z")
    public static boolean field167 = false;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Lea;")
    public static class30 field143 = new class30();

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Laf;")
    private static class7 field170 = class48.method406(40, "Loaded sprites");

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Laf;")
    public static class7 field172 = field170;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field169;

    // $FF: synthetic field
    @OriginalMember(owner = "client!af", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field173;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "[B")
    public byte[] field162;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "[Lfd;")
    public static class40[] field171;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Laf;")
    public final class7 method58(boolean arg0) {
        if (arg0) {
            return null;
        }
        field132++;
        if (!this.field123) {
            throw new IllegalArgumentException();
        }
        this.field134 = 0;
        if (this.field162.length != this.field139) {
            byte[] var2 = new byte[this.field139];
            class125.method1039(this.field162, 0, var2, 0, this.field139);
            this.field162 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Laf;")
    public final class7 method59(int arg0, boolean arg1) {
        field130++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field123) {
            this.field134 = 0;
            if (this.field162.length == this.field139) {
                int var3;
                for (var3 = 1; var3 <= this.field139; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class125.method1039(this.field162, 0, var4, 0, this.field139);
                this.field162 = var4;
            }
            this.field162[this.field139++] = (byte) arg0;
            if (!arg1) {
                field143 = null;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Laf;")
    public final class7 method60(int arg0) {
        class7 var2 = new class7();
        if (arg0 >= 0) {
            return null;
        }
        field125++;
        var2.field139 = this.field139;
        var2.field162 = new byte[this.field139];
        for (int var3 = 0; var3 < this.field139; var3++) {
            var2.field162[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Laf;")
    public final class7 method61(int arg0, int arg1) {
        field151++;
        if (arg0 >= -62) {
            field167 = true;
        }
        return this.method77(arg1, 103, this.field139);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
    private final int method62(int arg0, int arg1, int arg2) {
        field121++;
        byte var4 = (byte) arg2;
        int var5 = arg1;
        if (arg0 < 58) {
            this.method58(true);
        }
        while (var5 < this.field139) {
            if (this.field162[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Laf;")
    public final class7 method63(int arg0) {
        field122++;
        class7 var2 = new class7();
        var2.field162 = new byte[12];
        var2.field139 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field139; var4++) {
            if (this.field162[var4] >= 65 && this.field162[var4] <= 90) {
                var2.field162[var3++] = (byte) (this.field162[var4] + 97 - 65);
                var2.field139 = var3;
            } else if (this.field162[var4] >= 97 && this.field162[var4] <= 122 || this.field162[var4] >= 48 && this.field162[var4] <= 57) {
                var2.field162[var3++] = this.field162[var4];
                var2.field139 = var3;
            } else if (var3 > 0) {
                var2.field162[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        if (arg0 != 97) {
            this.field123 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLaf;)I")
    public final int method64(byte arg0, class7 arg1) {
        int var3;
        if (this.field139 > arg1.field139) {
            var3 = arg1.field139;
        } else {
            var3 = this.field139;
        }
        field126++;
        int var4 = -40 % ((31 - arg0) / 53);
        for (int var5 = 0; var5 < var3; var5++) {
            if (class2.field6[arg1.field162[var5] & 0xFF] > class2.field6[this.field162[var5] & 0xFF]) {
                return -1;
            }
            if (class2.field6[this.field162[var5] & 0xFF] > class2.field6[arg1.field162[var5] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field139 > this.field139) {
            return -1;
        } else if (arg1.field139 < this.field139) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laf;II)I")
    private final int method65(class7 arg0, int arg1, int arg2) {
        field136++;
        int[] var4 = new int[arg0.field139];
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field139];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg0.field139;
        }
        for (int var8 = 1; var8 <= arg0.field139; var8++) {
            var4[var8 - 1] = (arg0.field139 << 1) - var8;
            var5[class84.method705(255, arg0.field162[var8 - 1])] = arg0.field139 - var8;
        }
        int var9 = arg0.field139 + 1;
        int var10 = arg0.field139;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg0.field139 && arg0.field162[var9 - 1] != arg0.field162[var10 - 1]) {
                if (arg0.field139 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg0.field139 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = 0;
        int var12 = 1;
        int var13 = var9;
        int var14 = arg0.field139 + 1 - var9;
        if (arg2 != 534257474) {
            return -30;
        }
        int var15 = 1;
        while (var14 >= var15) {
            var6[var15 - 1] = var11;
            while (var11 >= 1 && arg0.field162[var11 - 1] != arg0.field162[var15 - 1]) {
                var11 = var6[var11 - 1];
            }
            var15++;
            var11++;
        }
        while (var13 < arg0.field139) {
            for (int var18 = var12; var18 <= var13; var18++) {
                if (var4[var18 - 1] >= arg0.field139 + var13 - var18) {
                    var4[var18 - 1] = arg0.field139 + var13 - var18;
                }
            }
            var12 = var13 + 1;
            var13 += var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg0.field139 + arg1 - 1; var16 < this.field139; var16 += Math.max(var5[this.field162[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field139 - 1; var17 >= 0 && this.field162[var16] == arg0.field162[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Laf;")
    public final class7 method66(int arg0) {
        field144++;
        long var2 = this.method91((byte) -100);
        if (arg0 != -34) {
            this.method79(20, -124);
        }
        synchronized (field173 == null ? (field173 = method99("af")) : field173) {
            if (class111.field2692 == null) {
                class111.field2692 = new class12(4096);
            } else {
                for (class79 var5 = (class79) class111.field2692.method126(var2, (byte) 69); var5 != null; var5 = (class79) class111.field2692.method128(-1)) {
                    if (this.method76(78, var5.field1837)) {
                        return var5.field1837;
                    }
                }
            }
            class79 var7 = new class79();
            var7.field1837 = this;
            this.field123 = false;
            class111.field2692.method130(arg0 + 160, var7, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        int var1 = 67 % ((-arg0 - 17) / 43);
        field172 = null;
        field170 = null;
        field171 = null;
        field143 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)I")
    public static final int method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field152++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 8 - arg6 - arg4;
        } else {
            if (arg3 < 90) {
                method68(-103, 103, 33, 15, 32, 118, 91);
            }
            return var7 == 2 ? 7 + 1 - arg0 - arg1 : arg6;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILaf;)Laf;")
    public final class7 method69(int arg0, class7 arg1) {
        field154++;
        if (!this.field123) {
            throw new IllegalArgumentException();
        }
        this.field134 = 0;
        if (this.field162.length < this.field139 + arg1.field139) {
            int var3;
            for (var3 = 1; var3 < this.field139 + arg1.field139; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class125.method1039(this.field162, 0, var4, 0, this.field139);
            this.field162 = var4;
        }
        class125.method1039(arg1.field162, 0, this.field162, this.field139, arg1.field139);
        this.field139 += arg1.field139;
        if (arg0 > -50) {
            this.method78(-28, 124);
        }
        return this;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)J")
    public final long method70(int arg0) {
        if (arg0 != 18982) {
            method68(51, 0, -7, 52, 106, -89, -79);
        }
        long var2 = 0L;
        for (int var4 = 0; this.field139 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field162[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        field129++;
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Laf;")
    public final class7 method71(int arg0) {
        field146++;
        if (arg0 < 78) {
            return null;
        }
        int var2 = this.field139;
        int var3;
        for (var3 = 0; this.field139 > var3 && (this.field162[var3] >= 0 && this.field162[var3] <= 32 || (this.field162[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field162[var2 - 1] >= 0 && this.field162[var2 - 1] <= 32 || (this.field162[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field139 == var2) {
            return this;
        }
        class7 var4 = new class7();
        var4.field139 = var2 - var3;
        var4.field162 = new byte[var4.field139];
        for (int var5 = 0; var5 < var4.field139; var5++) {
            var4.field162[var5] = this.field162[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laf;I)I")
    public final int method72(class7 arg0, int arg1) {
        if (arg1 != 0) {
            field143 = null;
        }
        field163++;
        return this.method65(arg0, 0, arg1 + 534257474);
    }

    @OriginalMember(owner = "client!af", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field160++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)I")
    public final int method73(byte arg0) {
        if (arg0 < 43) {
            this.method63(13);
        }
        field135++;
        return this.method83(10, 43);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BIIII)I")
    public final int method74(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 112 % ((arg1 + 89) / 35);
        field158++;
        class125.method1039(this.field162, arg3, arg0, arg4, arg2 - arg3);
        return arg2 - arg3;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        field147++;
        return arg0 == 0 ? this.method62(89, 0, arg1) : 119;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(ILaf;)Z")
    public final boolean method76(int arg0, class7 arg1) {
        field127++;
        if (arg1 == null) {
            return false;
        } else if (this.field139 == arg1.field139) {
            if (!this.field123 || !arg1.field123) {
                if (this.field134 == 0) {
                    this.field134 = this.method88((byte) -40);
                    if (this.field134 == 0) {
                        this.field134 = 1;
                    }
                }
                if (arg1.field134 == 0) {
                    arg1.field134 = arg1.method88((byte) -87);
                    if (arg1.field134 == 0) {
                        arg1.field134 = 1;
                    }
                }
                if (this.field134 != arg1.field134) {
                    return false;
                }
            }
            int var3 = 125 / ((-arg0 - 60) / 55);
            for (int var4 = 0; var4 < this.field139; var4++) {
                if (this.field162[var4] != arg1.field162[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)Laf;")
    public final class7 method77(int arg0, int arg1, int arg2) {
        if (arg1 < 55) {
            this.method87(122, null, 115, 90);
        }
        field153++;
        class7 var4 = new class7();
        var4.field162 = new byte[arg2 - arg0];
        var4.field139 = arg2 - arg0;
        class125.method1039(this.field162, arg0, var4.field162, 0, var4.field139);
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)Z")
    private final boolean method78(int arg0, int arg1) {
        field169++;
        boolean var3 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 22881) {
            this.method95(null, (byte) 43);
        }
        while (this.field139 > var6) {
            label79: {
                int var7 = this.field162[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label79;
                    }
                    if (var7 == 43) {
                        break label79;
                    }
                }
                if (var7 >= 48 && var7 <= 57) {
                    var7 -= 48;
                } else if (var7 >= 65 && var7 <= 90) {
                    var7 -= 55;
                } else if (var7 >= 97 && var7 <= 122) {
                    var7 -= 87;
                } else {
                    return false;
                }
                if (arg0 <= var7) {
                    return false;
                }
                if (var3) {
                    var7 = -var7;
                }
                int var8 = arg0 * var5 + var7;
                if (var8 / arg0 != var5) {
                    return false;
                }
                var4 = true;
                var5 = var8;
            }
            var6++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(II)I")
    public final int method79(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method70(-4);
        }
        field148++;
        return this.field162[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Ljava/net/URL;")
    public final URL method80(boolean arg0) throws MalformedURLException {
        field161++;
        if (arg0) {
            this.method59(-111, true);
        }
        return new URL(new String(this.field162, 0, this.field139));
    }

    @OriginalMember(owner = "client!af", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field137++;
        return this.method88((byte) -18);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method81(FontMetrics arg0, int arg1) {
        String var3;
        try {
            var3 = new String(this.field162, 0, this.field139, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field162, 0, this.field139);
        }
        if (arg1 <= 36) {
            this.method82(86);
        }
        field157++;
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)Z")
    public final boolean method82(int arg0) {
        field159++;
        if (arg0 != 10) {
            this.field162 = null;
        }
        return this.method78(10, 22881);
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(II)I")
    public final int method83(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        if (arg1 != 43) {
            field167 = true;
        }
        field164++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field139; var6++) {
            int var7 = this.field162[var6] & 0xFF;
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
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
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

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Laf;I)Z")
    public final boolean method84(class7 arg0, int arg1) {
        field145++;
        if (arg0 == null) {
            return false;
        } else if (this.field139 == arg0.field139) {
            int var3 = 0;
            if (arg1 < 123) {
                this.hashCode();
            }
            while (this.field139 > var3) {
                byte var4 = this.field162[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field162[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)Laf;")
    public final class7 method85(boolean arg0) {
        if (arg0) {
            this.field134 = 125;
        }
        field140++;
        class7 var2 = new class7();
        var2.field139 = this.field139;
        var2.field162 = new byte[this.field139];
        for (int var3 = 0; var3 < this.field139; var3++) {
            byte var4 = this.field162[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field162[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Laf;I)I")
    public final int method86(class7 arg0, int arg1) {
        field141++;
        if (arg1 != 255) {
            field171 = null;
        }
        int var3;
        if (this.field139 > arg0.field139) {
            var3 = arg0.field139;
        } else {
            var3 = this.field139;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field162[var4] & 0xFF) < (arg0.field162[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field162[var4] & 0xFF) < (this.field162[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field139 > this.field139) {
            return -1;
        } else if (arg0.field139 < this.field139) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!af", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field124++;
        if (!(arg0 instanceof class7)) {
            throw new IllegalArgumentException();
        }
        return this.method76(71, (class7) arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method87(int arg0, Graphics arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field162, 0, this.field139, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field162, 0, this.field139);
        }
        field128++;
        if (arg3 == 14199) {
            arg1.drawString(var5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)I")
    public final int method88(byte arg0) {
        field150++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field139; var3++) {
            var2 = (var2 << 5) + (this.field162[var3] & 0xFF) - var2;
        }
        return arg0 > -11 ? 82 : var2;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IZ)Laf;")
    public final class7 method89(int arg0, boolean arg1) {
        field168++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class7 var3 = new class7();
        var3.field162 = new byte[this.field139 + 1];
        if (arg1) {
            var3.field139 = this.field139 + 1;
            class125.method1039(this.field162, 0, var3.field162, 0, this.field139);
            var3.field162[this.field139] = (byte) arg0;
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)Laf;")
    public final class7 method90(int arg0) {
        field165++;
        class7 var2 = new class7();
        var2.field139 = this.field139;
        byte var3 = 2;
        var2.field162 = new byte[this.field139];
        for (int var4 = 0; var4 < this.field139; var4++) {
            byte var5 = this.field162[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field162[var4] = var5;
        }
        if (arg0 != -3882) {
            this.method95(null, (byte) 64);
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)J")
    private final long method91(byte arg0) {
        if (arg0 > -53) {
            this.method62(16, 127, 98);
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field139; var4++) {
            var2 = (var2 << 5) + (long) (this.field162[var4] & 0xFF) - var2;
        }
        field155++;
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)I")
    public final int method92(int arg0) {
        int var2 = 87 % ((-arg0 - 28) / 51);
        field166++;
        return this.field139;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laf;Laf;Lkb;B)Lad;")
    public static final class5 method93(class7 arg0, class7 arg1, class71 arg2, byte arg3) {
        int var4 = 78 % ((-arg3 - 59) / 40);
        int var5 = arg2.method586(arg0, -4795);
        int var6 = arg2.method560(arg1, var5, 68);
        field156++;
        return class71.method577(90, arg2, var6, var5);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(BLaf;)Z")
    public final boolean method94(byte arg0, class7 arg1) {
        field131++;
        if (arg1.field139 > this.field139) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field139; var3++) {
            if (this.field162[var3] != arg1.field162[var3]) {
                return false;
            }
        }
        if (arg0 != -123) {
            field172 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laf;B)Z")
    public final boolean method95(class7 arg0, byte arg1) {
        if (arg1 != -82) {
            return false;
        }
        field142++;
        if (this.field139 < arg0.field139) {
            return false;
        }
        int var3 = this.field139 - arg0.field139;
        for (int var4 = 0; var4 < arg0.field139; var4++) {
            if (this.field162[var3 + var4] != arg0.field162[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "(I)Laf;")
    public final class7 method96(int arg0) {
        field149++;
        class7 var2 = new class7();
        boolean var3 = true;
        var2.field139 = this.field139;
        var2.field162 = new byte[this.field139];
        for (int var4 = 0; var4 < this.field139; var4++) {
            byte var5 = this.field162[var4];
            if (var5 == 95) {
                var2.field162[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field162[var4] = (byte) (var5 - 32);
            } else {
                var2.field162[var4] = var5;
                var3 = false;
            }
        }
        if (arg0 != 65) {
            this.field162 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "(I)[B")
    public final byte[] method97(int arg0) {
        field138++;
        byte[] var2 = new byte[this.field139];
        int var3 = 116 % ((arg0 + 7) / 48);
        class125.method1039(this.field162, 0, var2, 0, this.field139);
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILof;)I")
    public static final int method98(int arg0, class103 arg1) {
        field133++;
        class123 var2 = (class123) class51.field1222.method126(((long) arg1.field2442 << 32) + (long) arg1.field2445, (byte) -106);
        if (var2 == null) {
            if (arg0 != 26454) {
                field143 = null;
            }
            return arg1.field2540;
        } else {
            return var2.field2931;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method99(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
