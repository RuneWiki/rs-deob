import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class121 implements class30 {

    @OriginalMember(owner = "client!va", name = "N", descriptor = "Z")
    private boolean field2815 = true;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field2818 = 5063219;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Li;")
    public static class48 field2805 = new class48(64);

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Li;")
    public static class48 field2825 = new class48(64);

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "Lva;")
    public static class121 field2827 = class107.method797("invback", -10983);

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "Lva;")
    private static class121 field2826 = class107.method797("Use", -10983);

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lva;")
    public static class121 field2828 = field2826;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    private int field2813;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public static int field2824;

    // $FF: synthetic field
    @OriginalMember(owner = "client!va", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field2829;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[B")
    public byte[] field2817;

    // $FF: synthetic method
    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J", line = 7)
    public final long method932(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2783 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2817[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        if (arg0 <= 105) {
            this.method963(40);
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        field2802++;
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "hashCode", descriptor = "()I", line = 53)
    public final int hashCode() {
        field2795++;
        return this.method949((byte) 103);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z", line = 69)
    private final boolean method933(int arg0, byte arg1) {
        field2778++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = -51 % ((-arg1 - 3) / 43);
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field2783; var7++) {
            int var8 = this.field2817[var7] & 0xFF;
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
            if (var8 >= arg0) {
                return false;
            }
            if (var5) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                return false;
            }
            var4 = true;
            var6 = var9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lva;I)Z", line = 144)
    public final boolean method934(class121 arg0, int arg1) {
        if (arg1 != -25730) {
            field2805 = null;
        }
        field2800++;
        if (arg0.field2783 > this.field2783) {
            return false;
        }
        int var3 = this.field2783 - arg0.field2783;
        for (int var4 = 0; var4 < arg0.field2783; var4++) {
            if (this.field2817[var3 + var4] != arg0.field2817[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lva;IZ)Lva;", line = 172)
    public final class121 method935(class121 arg0, int arg1, boolean arg2) {
        field2814++;
        if (!this.field2815) {
            throw new IllegalArgumentException();
        } else if (arg1 > this.field2783) {
            throw new IllegalArgumentException();
        } else {
            this.field2813 = 0;
            if (this.field2817.length < arg0.field2783 + arg1) {
                int var4;
                for (var4 = 1; var4 < arg1 + arg0.field2783; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class39.method263(this.field2817, 0, var5, 0, this.field2783);
                this.field2817 = var5;
            }
            class39.method263(arg0.field2817, 0, this.field2817, arg1, arg0.field2783);
            if (!arg2) {
                this.method948(null, 14);
            }
            if (arg1 + arg0.field2783 > this.field2783) {
                this.field2783 = arg1 + arg0.field2783;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lva;", line = 237)
    public final class121 method936(int arg0) {
        field2780++;
        long var2 = this.method938(arg0 ^ 0x1030);
        synchronized (field2829 == null ? (field2829 = method969("va")) : field2829) {
            if (class29.field755 == null) {
                class29.field755 = new class96(4096);
            } else {
                for (class21 var5 = (class21) class29.field755.method652(var2, arg0 - 4216); var5 != null; var5 = (class21) class29.field755.method650(-16430)) {
                    if (this.method954(var5.field565, 17706)) {
                        return var5.field565;
                    }
                }
            }
            class21 var7 = new class21();
            var7.field565 = this;
            this.field2815 = false;
            class29.field755.method654((byte) -99, var7, var2);
        }
        if (arg0 != 4096) {
            this.field2815 = false;
        }
        return this;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lva;", line = 283)
    public final class121 method937(int arg0) {
        field2784++;
        class121 var2 = new class121();
        var2.field2817 = new byte[12];
        int var3 = 0;
        int var4 = -82 % ((arg0 - 22) / 50);
        var2.field2783 = 0;
        for (int var5 = 0; var5 < this.field2783; var5++) {
            if (this.field2817[var5] >= 65 && this.field2817[var5] <= 90) {
                var2.field2817[var3++] = (byte) (this.field2817[var5] + 97 - 65);
                var2.field2783 = var3;
            } else if (this.field2817[var5] >= 97 && this.field2817[var5] <= 122 || this.field2817[var5] >= 48 && this.field2817[var5] <= 57) {
                var2.field2817[var3++] = this.field2817[var5];
                var2.field2783 = var3;
            } else if (var3 > 0) {
                var2.field2817[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)J", line = 329)
    private final long method938(int arg0) {
        field2785++;
        long var2 = 0L;
        if (arg0 != 48) {
            this.method952(99);
        }
        for (int var4 = 0; var4 < this.field2783; var4++) {
            var2 = (var2 << 5) + (long) (this.field2817[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLva;)Lva;", line = 349)
    public final class121 method939(byte arg0, class121 arg1) {
        field2786++;
        if (!this.field2815) {
            throw new IllegalArgumentException();
        }
        this.field2813 = 0;
        if (arg0 < 34) {
            field2828 = null;
        }
        if (this.field2783 + arg1.field2783 > this.field2817.length) {
            int var3;
            for (var3 = 1; var3 < this.field2783 + arg1.field2783; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class39.method263(this.field2817, 0, var4, 0, this.field2783);
            this.field2817 = var4;
        }
        class39.method263(arg1.field2817, 0, this.field2817, this.field2783, arg1.field2783);
        this.field2783 += arg1.field2783;
        return this;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lva;B)Z", line = 387)
    public final boolean method940(class121 arg0, byte arg1) {
        field2806++;
        int var3 = 116 % ((arg1 + 52) / 50);
        if (arg0 == null) {
            return false;
        } else if (this.field2783 == arg0.field2783) {
            for (int var4 = 0; var4 < this.field2783; var4++) {
                byte var5 = this.field2817[var4];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                byte var6 = arg0.field2817[var4];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 != var6) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 434)
    public final void method941(byte arg0, int arg1, int arg2, Graphics arg3) {
        field2801++;
        String var5;
        try {
            var5 = new String(this.field2817, 0, this.field2783, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2817, 0, this.field2783);
        }
        if (arg0 <= 74) {
            this.method947(true, 30);
        }
        arg3.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)I", line = 455)
    public final int method942(int arg0) {
        if (arg0 != 36) {
            this.method950(-84, null);
        }
        field2809++;
        return this.field2783;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)I", line = 478)
    public final int method943(int arg0, boolean arg1) {
        field2812++;
        if (!arg1) {
            field2782 = 65;
        }
        return this.method961(arg0, 4951, 0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lva;", line = 497)
    public final class121 method944(int arg0, int arg1) {
        field2789++;
        if (!this.field2815) {
            throw new IllegalArgumentException();
        }
        if (arg0 > -104) {
            this.method934(null, 125);
        }
        this.field2813 = 0;
        if (this.field2817.length == this.field2783) {
            int var3;
            for (var3 = 1; var3 <= this.field2783; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class39.method263(this.field2817, 0, var4, 0, this.field2783);
            this.field2817 = var4;
        }
        this.field2817[this.field2783++] = (byte) arg1;
        return this;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I", line = 531)
    public final int method945(FontMetrics arg0, int arg1) {
        field2808++;
        if (arg1 < 107) {
            return 76;
        }
        String var3;
        try {
            var3 = new String(this.field2817, 0, this.field2783, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2817, 0, this.field2783);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILva;I)I", line = 552)
    private final int method946(int arg0, class121 arg1, int arg2) {
        field2819++;
        int[] var4 = new int[arg1.field2783];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field2783];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field2783;
        }
        for (int var8 = 1; var8 <= arg1.field2783; var8++) {
            var4[var8 - 1] = (arg1.field2783 << 1) - var8;
            var5[class90.method614(arg1.field2817[var8 - 1], 255)] = arg1.field2783 - var8;
        }
        int var9 = arg1.field2783 - arg0;
        for (int var10 = arg1.field2783; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg1.field2783 >= var9 && arg1.field2817[var9 - 1] != arg1.field2817[var10 - 1]) {
                if (arg1.field2783 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg1.field2783 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field2783 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        while (var12 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field2817[var14 - 1] != arg1.field2817[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg1.field2783 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= var11 + arg1.field2783 - var18) {
                    var4[var18 - 1] = arg1.field2783 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 += var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg1.field2783 + arg2 - 1; var16 < this.field2783; var16 += Math.max(var5[this.field2817[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field2783 - 1; var17 >= 0 && this.field2817[var16] == arg1.field2817[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)I", line = 662)
    public final int method947(boolean arg0, int arg1) {
        if (!arg0) {
            field2825 = null;
        }
        field2777++;
        return this.field2817[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Lva;I)Z", line = 681)
    public final boolean method948(class121 arg0, int arg1) {
        field2823++;
        if (this.field2783 < arg0.field2783) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field2783; var3++) {
            if (this.field2817[var3] != arg0.field2817[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I", line = 701)
    public final int method949(byte arg0) {
        field2824++;
        if (arg0 != 103) {
            return -95;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2783; var3++) {
            var2 = (var2 << 5) + (this.field2817[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILva;)I", line = 721)
    public final int method950(int arg0, class121 arg1) {
        if (arg0 == -2) {
            field2781++;
            return this.method946(-1, arg1, 0);
        } else {
            return -104;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 734)
    public static void method951(byte arg0) {
        field2828 = null;
        field2825 = null;
        if (arg0 != 35) {
            method956(-125, null, null, null);
        }
        field2805 = null;
        field2827 = null;
        field2826 = null;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Lva;", line = 749)
    public final class121 method952(int arg0) {
        field2787++;
        if (!this.field2815) {
            throw new IllegalArgumentException();
        }
        this.field2813 = arg0;
        if (this.field2817.length != this.field2783) {
            byte[] var2 = new byte[this.field2783];
            class39.method263(this.field2817, 0, var2, 0, this.field2783);
            this.field2817 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BIIII)I", line = 775)
    public final int method953(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 57) {
            field2826 = null;
        }
        class39.method263(this.field2817, arg1, arg0, arg4, arg2 - arg1);
        field2797++;
        return arg2 - arg1;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(Lva;I)Z", line = 793)
    public final boolean method954(class121 arg0, int arg1) {
        field2788++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != 17706) {
            this.method962(115, (byte) -101);
        }
        if (this.field2783 != arg0.field2783) {
            return false;
        }
        if (!this.field2815 || !arg0.field2815) {
            if (this.field2813 == 0) {
                this.field2813 = this.method949((byte) 103);
                if (this.field2813 == 0) {
                    this.field2813 = 1;
                }
            }
            if (arg0.field2813 == 0) {
                arg0.field2813 = arg0.method949((byte) 103);
                if (arg0.field2813 == 0) {
                    arg0.field2813 = 1;
                }
            }
            if (this.field2813 != arg0.field2813) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field2783; var3++) {
            if (this.field2817[var3] != arg0.field2817[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Lva;", line = 856)
    public final class121 method955(boolean arg0) {
        field2791++;
        int var2 = this.field2783;
        int var3;
        for (var3 = 0; var3 < this.field2783 && this.field2817[var3] >= 0 && this.field2817[var3] <= 32; var3++) {
        }
        while (var3 < var2 && this.field2817[var2 - 1] >= 0 && this.field2817[var2 - 1] <= 32) {
            var2--;
        }
        if (var3 == 0 && this.field2783 == var2) {
            return this;
        }
        class121 var4 = new class121();
        var4.field2783 = var2 - var3;
        if (arg0) {
            this.field2813 = -36;
        }
        var4.field2817 = new byte[var4.field2783];
        for (int var5 = 0; var5 < var4.field2783; var5++) {
            var4.field2817[var5] = this.field2817[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILhe;Lva;Lva;)[Lbc;", line = 894)
    public static final class10[] method956(int arg0, class47 arg1, class121 arg2, class121 arg3) {
        if (arg0 != -23078) {
            method956(80, null, null, null);
        }
        field2779++;
        int var4 = arg1.method332(arg3, -22814);
        int var5 = arg1.method337(var4, (byte) 57, arg2);
        return class119.method922(var4, arg1, var5, arg0 ^ 0x5A4E);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZI)Lva;", line = 910)
    public final class121 method957(int arg0, boolean arg1, int arg2) {
        field2796++;
        if (!arg1) {
            return null;
        }
        class121 var4 = new class121();
        var4.field2783 = arg0 - arg2;
        var4.field2817 = new byte[arg0 - arg2];
        class39.method263(this.field2817, arg2, var4.field2817, 0, var4.field2783);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lva;", line = 932)
    public final class121 method958(int arg0, int arg1) {
        class121 var3 = new class121();
        field2810++;
        if (arg0 != 38) {
            this.method938(29);
        }
        var3.field2817 = new byte[this.field2783 + 1];
        var3.field2783 = this.field2783 + 1;
        class39.method263(this.field2817, 0, var3.field2817, 0, this.field2783);
        var3.field2817[this.field2783] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Lva;", line = 956)
    public final class121 method959(byte arg0) {
        field2798++;
        class121 var2 = new class121();
        var2.field2783 = this.field2783;
        var2.field2817 = new byte[this.field2783];
        int var3 = 27 % ((-arg0 - 8) / 60);
        for (int var4 = 0; var4 < this.field2783; var4++) {
            byte var5 = this.field2817[var4];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field2817[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)[B", line = 984)
    public final byte[] method960(byte arg0) {
        int var2 = -13 / ((arg0 - 10) / 55);
        field2822++;
        byte[] var3 = new byte[this.field2783];
        class39.method263(this.field2817, 0, var3, 0, this.field2783);
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1007)
    public final boolean equals(Object arg0) {
        field2794++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)I", line = 1019)
    private final int method961(int arg0, int arg1, int arg2) {
        if (arg1 != 4951) {
            this.method959((byte) -37);
        }
        field2816++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field2783; var5++) {
            if (this.field2817[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)I", line = 1044)
    private final int method962(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field2793++;
        boolean var3 = false;
        if (arg1 != -103) {
            return 9;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2783; var6++) {
            int var7 = this.field2817[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)Lva;", line = 1124)
    public final class121 method963(int arg0) {
        boolean var2 = true;
        field2821++;
        if (arg0 != -14767) {
            return null;
        }
        class121 var3 = new class121();
        var3.field2783 = this.field2783;
        var3.field2817 = new byte[this.field2783];
        for (int var4 = 0; var4 < this.field2783; var4++) {
            byte var5 = this.field2817[var4];
            if (var5 == 95) {
                var2 = true;
                var3.field2817[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field2817[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var3.field2817[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "toString", descriptor = "()Ljava/lang/String;", line = 1170)
    public final String toString() {
        field2792++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)Lva;", line = 1192)
    public final class121 method964(int arg0) {
        class121 var2 = new class121();
        var2.field2783 = this.field2783;
        var2.field2817 = new byte[this.field2783];
        field2811++;
        if (arg0 > -102) {
            this.method938(-99);
        }
        for (int var3 = 0; var3 < this.field2783; var3++) {
            var2.field2817[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)Lva;", line = 1220)
    public final class121 method965(int arg0, int arg1) {
        if (arg0 == 63) {
            field2820++;
            return this.method957(this.field2783, true, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)Lva;", line = 1234)
    public final class121 method966(byte arg0) {
        field2799++;
        boolean var2 = true;
        class121 var3 = new class121();
        var3.field2783 = this.field2783;
        var3.field2817 = new byte[this.field2783];
        for (int var4 = 0; var4 < this.field2783; var4++) {
            byte var5 = this.field2817[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var2) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = false;
            }
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = true;
            }
            var3.field2817[var4] = var5;
        }
        if (arg0 < 24) {
            this.method968(-54);
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(I)Z", line = 1291)
    public final boolean method967(int arg0) {
        if (arg0 != -61) {
            this.method966((byte) -48);
        }
        field2804++;
        return this.method933(10, (byte) 117);
    }

    @OriginalMember(owner = "client!va", name = "j", descriptor = "(I)I", line = 1302)
    public final int method968(int arg0) {
        field2790++;
        int var2 = 74 % ((-arg0 - 31) / 45);
        return this.method962(10, (byte) -103);
    }
}
