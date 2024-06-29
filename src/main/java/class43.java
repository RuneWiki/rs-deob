import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class43 implements class56 {

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "Z")
    private boolean field853 = true;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
    public static int[] field826 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "[Lge;")
    public static class61[] field822 = new class61[50];

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
    public static volatile int field840 = 0;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Led;")
    public static class43 field856 = class191.method1219("Benutzen", false);

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "[Led;")
    public static class43[] field852 = new class43[1000];

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field863;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field864;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "[B")
    public byte[] field844;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Led;")
    public final class43 method236(int arg0) {
        class43 var2 = new class43();
        var2.field844 = new byte[12];
        if (arg0 != 10) {
            this.field853 = false;
        }
        field854++;
        var2.field818 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field818; var4++) {
            if (this.field844[var4] >= 65 && this.field844[var4] <= 90) {
                var2.field844[var3++] = (byte) (this.field844[var4] + 97 - 65);
                var2.field818 = var3;
            } else if (this.field844[var4] >= 97 && this.field844[var4] <= 122 || this.field844[var4] >= 48 && this.field844[var4] <= 57) {
                var2.field844[var3++] = this.field844[var4];
                var2.field818 = var3;
            } else if (var3 > 0) {
                var2.field844[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field833++;
        if (!(arg0 instanceof class43)) {
            throw new IllegalArgumentException();
        }
        return this.method257((class43) arg0, 42);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)Z")
    public final boolean method237(int arg0) {
        field859++;
        if (arg0 != 10) {
            this.field844 = null;
        }
        return this.method251(10, (byte) -90);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Led;")
    public final class43 method238(int arg0, int arg1) {
        if (arg0 <= 0) {
            return null;
        } else {
            field825++;
            return this.method241((byte) 77, arg1, this.field818);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public final void method239(Graphics arg0, int arg1, int arg2, byte arg3) {
        String var5;
        try {
            var5 = new String(this.field844, 0, this.field818, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field844, 0, this.field818);
        }
        if (arg3 != 15) {
            this.toString();
        }
        field851++;
        arg0.drawString(var5, arg2, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILed;)Z")
    public final boolean method240(int arg0, class43 arg1) {
        field829++;
        if (this.field818 < arg1.field818) {
            return false;
        }
        if (arg0 != -1) {
            this.method252(117, null);
        }
        for (int var3 = 0; var3 < arg1.field818; var3++) {
            if (this.field844[var3] != arg1.field844[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field817++;
        return this.method263(-53);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)Led;")
    public final class43 method241(byte arg0, int arg1, int arg2) {
        field848++;
        class43 var4 = new class43();
        var4.field818 = arg2 - arg1;
        var4.field844 = new byte[arg2 - arg1];
        class42.method234(this.field844, arg1, var4.field844, 0, var4.field818);
        int var5 = 89 / ((28 - arg0) / 47);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method242(int arg0) {
        field852 = null;
        int var1 = 114 / ((85 - arg0) / 37);
        field856 = null;
        field826 = null;
        field822 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Led;I)Z")
    public final boolean method243(class43 arg0, int arg1) {
        field834++;
        if (arg1 != -66) {
            return false;
        } else if (arg0.field818 > this.field818) {
            return false;
        } else {
            int var3 = this.field818 - arg0.field818;
            for (int var4 = 0; var4 < arg0.field818; var4++) {
                if (this.field844[var4 + var3] != arg0.field844[var4]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)Led;")
    public final class43 method244(int arg0) {
        field857++;
        class43 var2 = new class43();
        var2.field818 = this.field818;
        var2.field844 = new byte[this.field818];
        if (arg0 != 19404) {
            return null;
        }
        for (int var3 = 0; var3 < this.field818; var3++) {
            byte var4 = this.field844[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field844[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)Led;")
    public final class43 method245(int arg0) {
        field855++;
        class43 var2 = new class43();
        var2.field818 = this.field818;
        var2.field844 = new byte[this.field818];
        byte var3 = 2;
        for (int var4 = arg0; var4 < this.field818; var4++) {
            byte var5 = this.field844[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || !(var5 < -64 || var5 > -34 || var5 == -41)) {
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
            var2.field844[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)I")
    public final int method246(int arg0, byte arg1) {
        field820++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        if (arg1 >= -101) {
            this.field838 = -54;
        }
        while (this.field818 > var6) {
            label83: {
                int var7 = this.field844[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var3 = true;
                        break label83;
                    }
                    if (var7 == 43) {
                        break label83;
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
                var4 = true;
                var5 = var8;
            }
            var6++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)Led;")
    public final class43 method247(byte arg0) {
        int var2 = 0;
        int var3 = this.field818;
        while (this.field818 > var2 && (this.field844[var2] >= 0 && this.field844[var2] <= 32 || (this.field844[var2] & 0xFF) == 160)) {
            var2++;
        }
        field843++;
        if (arg0 > -45) {
            this.method243(null, 25);
        }
        while (var2 < var3 && (this.field844[var3 - 1] >= 0 && this.field844[var3 - 1] <= 32 || (this.field844[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field818 == var3) {
            return this;
        }
        class43 var4 = new class43();
        var4.field818 = var3 - var2;
        var4.field844 = new byte[var4.field818];
        for (int var5 = 0; var5 < var4.field818; var5++) {
            var4.field844[var5] = this.field844[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field830++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)I")
    public final int method248(byte arg0) {
        field828++;
        return arg0 == 60 ? this.field818 : 77;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)J")
    public final long method249(int arg0) {
        if (arg0 != -48) {
            this.field844 = null;
        }
        field845++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field818 && var4 < 12; var4++) {
            byte var5 = this.field844[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(ILed;)Z")
    public final boolean method250(int arg0, class43 arg1) {
        field824++;
        if (arg1 == null) {
            return false;
        } else if (this.field818 != arg1.field818) {
            return false;
        } else if (arg0 == 63) {
            for (int var3 = 0; var3 < this.field818; var3++) {
                byte var4 = arg1.field844[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field844[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)Z")
    private final boolean method251(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = 125 / ((arg1 - 38) / 57);
        boolean var4 = false;
        field846++;
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field818; var7++) {
            int var8 = this.field844[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var5 = true;
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
                return false;
            }
            if (arg0 <= var8) {
                return false;
            }
            if (var5) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                return false;
            }
            var6 = var9;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method252(int arg0, FontMetrics arg1) {
        field816++;
        if (arg0 != -12828) {
            return 79;
        }
        String var3;
        try {
            var3 = new String(this.field844, 0, this.field818, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field844, 0, this.field818);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)Led;")
    public final class43 method253(boolean arg0) {
        class43 var2 = new class43();
        field863++;
        var2.field818 = this.field818;
        var2.field844 = new byte[this.field818];
        if (!arg0) {
            this.method266(53, -6, 46);
        }
        for (int var3 = 0; var3 < this.field818; var3++) {
            var2.field844[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)J")
    private final long method254(byte arg0) {
        long var2 = 0L;
        field827++;
        for (int var4 = 0; var4 < this.field818; var4++) {
            var2 = (var2 << 5) + (long) (this.field844[var4] & 0xFF) - var2;
        }
        if (arg0 < 47) {
            this.method240(98, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "([BIIIB)I")
    public final int method255(byte[] arg0, int arg1, int arg2, int arg3, byte arg4) {
        class42.method234(this.field844, arg3, arg0, arg1, arg2 - arg3);
        if (arg4 == 92) {
            field839++;
            return arg2 - arg3;
        } else {
            return -114;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)I")
    public final int method256(boolean arg0, int arg1) {
        field860++;
        if (!arg0) {
            this.method244(127);
        }
        return this.field844[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Led;I)Z")
    public final boolean method257(class43 arg0, int arg1) {
        field858++;
        if (arg1 <= 38) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else if (this.field818 == arg0.field818) {
            if (!this.field853 || !arg0.field853) {
                if (this.field838 == 0) {
                    this.field838 = this.method263(-127);
                    if (this.field838 == 0) {
                        this.field838 = 1;
                    }
                }
                if (arg0.field838 == 0) {
                    arg0.field838 = arg0.method263(-24);
                    if (arg0.field838 == 0) {
                        arg0.field838 = 1;
                    }
                }
                if (this.field838 != arg0.field838) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field818; var3++) {
                if (this.field844[var3] != arg0.field844[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)Ljava/net/URL;")
    public final URL method258(byte arg0) throws MalformedURLException {
        if (arg0 != 21) {
            this.method254((byte) -10);
        }
        field815++;
        return new URL(new String(this.field844, 0, this.field818));
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)[B")
    public final byte[] method259(byte arg0) {
        field849++;
        byte[] var2 = new byte[this.field818];
        class42.method234(this.field844, 0, var2, 0, this.field818);
        int var3 = 83 % ((arg0 - 10) / 49);
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILed;I)I")
    public final int method260(int arg0, class43 arg1, int arg2) {
        field835++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg1.field818];
        int[] var6 = new int[arg1.field818];
        if (arg0 >= -24) {
            this.method268((byte) 36, null);
        }
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field818;
        }
        for (int var8 = 1; var8 <= arg1.field818; var8++) {
            var5[var8 - 1] = (arg1.field818 << 1) - var8;
            var4[class7.method38(arg1.field844[var8 - 1], 255)] = arg1.field818 - var8;
        }
        int var9 = arg1.field818 + 1;
        int var10 = arg1.field818;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg1.field818 >= var9 && arg1.field844[var9 - 1] != arg1.field844[var10 - 1]) {
                if (arg1.field818 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg1.field818 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = 0;
        int var14 = arg1.field818 + 1 - var9;
        int var15 = 1;
        while (var15 <= var14) {
            var6[var15 - 1] = var13;
            while (var13 >= 1 && arg1.field844[var15 - 1] != arg1.field844[var13 - 1]) {
                var13 = var6[var13 - 1];
            }
            var15++;
            var13++;
        }
        while (var11 < arg1.field818) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var5[var18 - 1] >= arg1.field818 + var11 - var18) {
                    var5[var18 - 1] = arg1.field818 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg1.field818 - 1; var16 < this.field818; var16 += Math.max(var4[this.field844[var16] & 0xFF], var5[var17])) {
            for (var17 = arg1.field818 - 1; var17 >= 0 && this.field844[var16] == arg1.field844[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLed;)I")
    public final int method261(byte arg0, class43 arg1) {
        field832++;
        int var3 = 125 % ((arg0 + 65) / 60);
        return this.method260(-52, arg1, 0);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Led;I)I")
    public final int method262(class43 arg0, int arg1) {
        field821++;
        int var3;
        if (arg0.field818 < this.field818) {
            var3 = arg0.field818;
        } else {
            var3 = this.field818;
        }
        if (arg1 >= -49) {
            return -96;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field844[var4] & 0xFF) > (this.field844[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field844[var4] & 0xFF) < (this.field844[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field818 < arg0.field818) {
            return -1;
        } else if (arg0.field818 < this.field818) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)I")
    public final int method263(int arg0) {
        field837++;
        int var2 = 0;
        int var3 = 60 / ((arg0 - 65) / 41);
        for (int var4 = 0; var4 < this.field818; var4++) {
            var2 = (var2 << 5) + (this.field844[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)I")
    public final int method264(int arg0) {
        field862++;
        return arg0 == 10 ? this.method246(10, (byte) -112) : -89;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLob;)V")
    public static final void method265(boolean arg0, class129 arg1) {
        if (arg0) {
            method242(1);
        }
        if (class60.field1234 == arg1.field2643) {
            class107.field2056[arg1.field2582] = true;
        }
        field831++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)I")
    public final int method266(int arg0, int arg1, int arg2) {
        field819++;
        byte var4 = (byte) arg2;
        for (int var5 = arg0; var5 < this.field818; var5++) {
            if (this.field844[var5] == var4) {
                return var5;
            }
        }
        if (arg1 != 2) {
            field826 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Led;")
    public final class43 method267(int arg0, int arg1) {
        field841++;
        if (arg1 != -15788) {
            this.field838 = -101;
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field853) {
            this.field838 = 0;
            if (this.field844.length == this.field818) {
                int var3;
                for (var3 = 1; var3 <= this.field818; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class42.method234(this.field844, 0, var4, 0, this.field818);
                this.field844 = var4;
            }
            this.field844[this.field818++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(BLed;)I")
    public final int method268(byte arg0, class43 arg1) {
        field823++;
        int var3;
        if (arg1.field818 < this.field818) {
            var3 = arg1.field818;
        } else {
            var3 = this.field818;
        }
        int var4 = 0;
        int var5 = -73 % ((arg0 - 20) / 47);
        while (var3 > var4) {
            if (class54.field1095[this.field844[var4] & 0xFF] < class54.field1095[arg1.field844[var4] & 0xFF]) {
                return -1;
            }
            if (class54.field1095[this.field844[var4] & 0xFF] > class54.field1095[arg1.field844[var4] & 0xFF]) {
                return 1;
            }
            var4++;
        }
        if (this.field818 < arg1.field818) {
            return -1;
        } else if (this.field818 > arg1.field818) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Led;B)Led;")
    public final class43 method269(class43 arg0, byte arg1) {
        field847++;
        if (!this.field853) {
            throw new IllegalArgumentException();
        }
        this.field838 = 0;
        if (this.field844.length < this.field818 + arg0.field818) {
            int var3;
            for (var3 = 1; var3 < this.field818 + arg0.field818; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class42.method234(this.field844, 0, var4, 0, this.field818);
            this.field844 = var4;
        }
        class42.method234(arg0.field844, 0, this.field844, this.field818, arg0.field818);
        this.field818 += arg0.field818;
        if (arg1 != 91) {
            field852 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)Led;")
    public final class43 method270(int arg0) {
        field842++;
        if (!this.field853) {
            throw new IllegalArgumentException();
        }
        this.field838 = arg0;
        if (this.field844.length != this.field818) {
            byte[] var2 = new byte[this.field818];
            class42.method234(this.field844, 0, var2, 0, this.field818);
            this.field844 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)Led;")
    public final class43 method271(int arg0) {
        long var2 = this.method254((byte) 57);
        field861++;
        synchronized (field864 == null ? (field864 = method274("ed")) : field864) {
            int var5 = 28 / ((arg0 - 15) / 36);
            if (class157.field3183 == null) {
                class157.field3183 = new class17(4096);
            } else {
                for (class175 var6 = (class175) class157.field3183.method75(var2, -111); var6 != null; var6 = (class175) class157.field3183.method84(false)) {
                    if (this.method257(var6.field3480, 119)) {
                        return var6.field3480;
                    }
                }
            }
            class175 var8 = new class175();
            var8.field3480 = this;
            this.field853 = false;
            class157.field3183.method82(-78, var8, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)Led;")
    public final class43 method272(int arg0, int arg1) {
        if (arg1 != 22107) {
            this.method260(83, null, 47);
        }
        field850++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class43 var3 = new class43();
        var3.field844 = new byte[this.field818 + 1];
        var3.field818 = this.field818 + 1;
        class42.method234(this.field844, 0, var3.field844, 0, this.field818);
        var3.field844[this.field818] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "(I)Led;")
    public final class43 method273(int arg0) {
        field836++;
        class43 var2 = new class43();
        boolean var3 = true;
        var2.field818 = this.field818;
        int var4 = 97 / ((5 - arg0) / 33);
        var2.field844 = new byte[this.field818];
        for (int var5 = 0; var5 < this.field818; var5++) {
            byte var6 = this.field844[var5];
            if (var6 == 95) {
                var2.field844[var5] = 32;
                var3 = true;
            } else if (var6 >= 97 && var6 <= 122 && var3) {
                var3 = false;
                var2.field844[var5] = (byte) (var6 - 32);
            } else {
                var2.field844[var5] = var6;
                var3 = false;
            }
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method274(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
