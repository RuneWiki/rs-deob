import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class117 implements class151 {

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Z")
    private boolean field2802 = true;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Leb;")
    public static class31 field2806 = new class31(100);

    @OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lqf;")
    public static class117 field2818 = class72.method514(107, "scrollbar");

    @OriginalMember(owner = "client!qf", name = "jb", descriptor = "Lqf;")
    public static class117 field2823 = class72.method514(123, "Die Verbindung konnte");

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lqf;")
    private static class117 field2812 = class72.method514(113, "Enter name:");

    @OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lqf;")
    private static class117 field2816 = class72.method514(112, " is already on your ignore list");

    @OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lqf;")
    public static class117 field2815 = class72.method514(111, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Lqf;")
    private static class117 field2811 = class72.method514(122, " seconds)3");

    @OriginalMember(owner = "client!qf", name = "ib", descriptor = "Lqf;")
    public static class117 field2822 = class72.method514(114, "backleft1");

    @OriginalMember(owner = "client!qf", name = "nb", descriptor = "Lqf;")
    public static class117 field2827 = field2816;

    @OriginalMember(owner = "client!qf", name = "ob", descriptor = "I")
    public static int field2828 = 0;

    @OriginalMember(owner = "client!qf", name = "kb", descriptor = "Lqf;")
    public static class117 field2824 = field2811;

    @OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lqf;")
    private static class117 field2821 = class72.method514(124, "M");

    @OriginalMember(owner = "client!qf", name = "ab", descriptor = "Lqf;")
    public static class117 field2814 = field2821;

    @OriginalMember(owner = "client!qf", name = "gb", descriptor = "Lqf;")
    public static class117 field2820 = field2812;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "Lqf;")
    public static class117 field2809 = field2821;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!qf", name = "fb", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!qf", name = "mb", descriptor = "Lr;")
    public static class118 field2826;

    @OriginalMember(owner = "client!qf", name = "db", descriptor = "Lha;")
    public static class50 field2817;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qf", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field2829;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[B")
    public byte[] field2800;

    @OriginalMember(owner = "client!qf", name = "lb", descriptor = "[Lr;")
    public static class118[] field2825;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "[Lma;")
    public static class84[] field2810;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
    public final boolean method905(int arg0) {
        if (arg0 == 30350) {
            field2764++;
            return this.method914(10, (byte) 103);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Lqf;")
    public final class117 method906(byte arg0) {
        field2798++;
        int var2;
        for (var2 = 0; this.field2799 > var2 && (this.field2800[var2] >= 0 && this.field2800[var2] <= 32 || (this.field2800[var2] & 0xFF) == 160); var2++) {
        }
        int var3 = this.field2799;
        int var4 = 1 % ((arg0 + 59) / 60);
        while (var3 > var2 && (this.field2800[var3 - 1] >= 0 && this.field2800[var3 - 1] <= 32 || (this.field2800[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field2799 == var3) {
            return this;
        }
        class117 var5 = new class117();
        var5.field2799 = var3 - var2;
        var5.field2800 = new byte[var5.field2799];
        for (int var6 = 0; var6 < var5.field2799; var6++) {
            var5.field2800[var6] = this.field2800[var2 + var6];
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lqf;")
    public final class117 method907(byte arg0, int arg1) {
        field2776++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field2802) {
            this.field2778 = 0;
            if (arg0 != -32) {
                this.hashCode();
            }
            if (this.field2800.length == this.field2799) {
                int var3;
                for (var3 = 1; var3 <= this.field2799; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class109.method822(this.field2800, 0, var4, 0, this.field2799);
                this.field2800 = var4;
            }
            this.field2800[this.field2799++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lqf;")
    public final class117 method908(int arg0, byte arg1) {
        field2766++;
        if (arg1 != 120) {
            this.method925(false);
        }
        return this.method943(arg0, (byte) 123, this.field2799);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqf;I)Lqf;")
    public final class117 method909(class117 arg0, int arg1) {
        if (arg1 != -12860) {
            this.method943(112, (byte) -112, -100);
        }
        field2772++;
        if (!this.field2802) {
            throw new IllegalArgumentException();
        }
        this.field2778 = 0;
        if (this.field2800.length < this.field2799 + arg0.field2799) {
            int var3;
            for (var3 = 1; var3 < this.field2799 + arg0.field2799; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class109.method822(this.field2800, 0, var4, 0, this.field2799);
            this.field2800 = var4;
        }
        class109.method822(arg0.field2800, 0, this.field2800, this.field2799, arg0.field2799);
        this.field2799 += arg0.field2799;
        return this;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Component;ILjb;Ljb;)V")
    public static final void method910(Component arg0, int arg1, class64 arg2, class64 arg3) {
        field2807++;
        if (class68.field1436) {
            return;
        }
        class68.field1426 = class52.method390((byte) -112, arg0, 765, 503);
        class68.field1426.method214(8);
        class49.method353();
        byte[] var4 = arg3.method442(5, class126.field2987, class99.field2410);
        class100.field2425 = new class84(var4, arg0);
        class76.field1667 = class100.field2425.method666();
        class134.field3208 = class67.method475(class126.field2987, -4236, class41.field818, arg2);
        class115.field2728 = class67.method475(class126.field2987, -4236, class41.field807, arg2);
        class93.field2254 = class67.method475(class126.field2987, -4236, class20.field327, arg2);
        class97.field2368 = class65.method468(true, arg2, class76.field1671, class126.field2987);
        class133.field3154 = class65.method468(true, arg2, class36.field743, class126.field2987);
        class120.field2869 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class120.field2869[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class120.field2869[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class120.field2869[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class120.field2869[var8 + 192] = 16777215;
        }
        class134.field3185 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class134.field3185[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class134.field3185[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class134.field3185[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class134.field3185[var12 + 192] = 16777215;
        }
        class153.field3780 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class153.field3780[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class153.field3780[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class153.field3780[var15 + 128] = var15 * 1024 + 16711935;
        }
        if (arg1 < 6) {
            field2812 = null;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class153.field3780[var16 + 192] = 16777215;
        }
        class80.field1816 = new int[256];
        class71.field1503 = new int[32768];
        class134.field3159 = new int[32768];
        class15.method132(null, -1);
        class90.field2185 = new int[32768];
        class26.field507 = false;
        class126.field2991 = class126.field2987;
        class66.field1386 = 0;
        class126.field2982 = class126.field2987;
        class135.field3219 = new int[32768];
        if (class43.field861 == 0) {
            class89.field2065 = true;
        } else {
            class89.field2065 = false;
        }
        if (class89.field2065) {
            class66.method474(-27742, 2);
        } else {
            class96.method754(class50.field1040, 255, false, class110.field2610, class126.field2987, 2, false);
        }
        class138.method1077(false, 68);
        class42.field823 = true;
        class68.field1436 = true;
        class100.field2425.method676(0, 0);
        class76.field1667.method676(382, 0);
        class134.field3208.method951(382 - class134.field3208.field2835 / 2, 18);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)I")
    public final int method911(boolean arg0, int arg1) {
        field2801++;
        return arg0 ? -6 : this.field2800[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)I")
    public final int method912(int arg0) {
        field2773++;
        if (arg0 < 105) {
            this.method915(-90);
        }
        return this.method924(10, (byte) -99);
    }

    @OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2794++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Lqf;")
    public final class117 method913(boolean arg0) {
        field2787++;
        class117 var2 = new class117();
        var2.field2799 = this.field2799;
        var2.field2800 = new byte[this.field2799];
        for (int var3 = 0; var3 < this.field2799; var3++) {
            var2.field2800[var3] = 42;
        }
        if (arg0) {
            this.field2778 = -91;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IB)Z")
    private final boolean method914(int arg0, byte arg1) {
        field2767++;
        boolean var3 = false;
        boolean var4 = false;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var5 = 0;
        if (arg1 != 103) {
            this.field2802 = false;
        }
        for (int var6 = 0; var6 < this.field2799; var6++) {
            int var7 = this.field2800[var6] & 0xFF;
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
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)I")
    public final int method915(int arg0) {
        if (arg0 != 27) {
            this.field2802 = true;
        }
        field2781++;
        return this.field2799;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)Ljava/net/URL;")
    public final URL method916(int arg0) throws MalformedURLException {
        if (arg0 != 24861) {
            field2820 = null;
        }
        field2795++;
        return new URL(new String(this.field2800, 0, this.field2799));
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
    public static void method917(boolean arg0) {
        field2820 = null;
        field2825 = null;
        field2806 = null;
        field2826 = null;
        field2824 = null;
        field2811 = null;
        field2815 = null;
        field2823 = null;
        field2818 = null;
        field2816 = null;
        field2822 = null;
        field2821 = null;
        field2809 = null;
        field2812 = null;
        if (!arg0) {
            field2827 = null;
            field2810 = null;
            field2814 = null;
            field2817 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2791++;
        return this.method934(true);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lqf;I)Z")
    public final boolean method918(class117 arg0, int arg1) {
        field2770++;
        int var3 = -21 / ((arg1 + 11) / 53);
        if (arg0 == null) {
            return false;
        } else if (this.field2799 == arg0.field2799) {
            if (!this.field2802 || !arg0.field2802) {
                if (this.field2778 == 0) {
                    this.field2778 = this.method934(true);
                    if (this.field2778 == 0) {
                        this.field2778 = 1;
                    }
                }
                if (arg0.field2778 == 0) {
                    arg0.field2778 = arg0.method934(true);
                    if (arg0.field2778 == 0) {
                        arg0.field2778 = 1;
                    }
                }
                if (this.field2778 != arg0.field2778) {
                    return false;
                }
            }
            for (int var4 = 0; var4 < this.field2799; var4++) {
                if (this.field2800[var4] != arg0.field2800[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(IB)Lqf;")
    public final class117 method919(int arg0, byte arg1) {
        field2786++;
        int var3 = -70 % ((-arg1 - 70) / 42);
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class117 var4 = new class117();
        var4.field2800 = new byte[this.field2799 + 1];
        var4.field2799 = this.field2799 + 1;
        class109.method822(this.field2800, 0, var4.field2800, 0, this.field2799);
        var4.field2800[this.field2799] = (byte) arg0;
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
    public final int method920(int arg0, int arg1) {
        field2793++;
        if (arg0 != 0) {
            field2811 = null;
        }
        return this.method929(0, arg1, -75);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Lqf;I)I")
    public final int method921(class117 arg0, int arg1) {
        int var3;
        if (this.field2799 <= arg0.field2799) {
            var3 = this.field2799;
        } else {
            var3 = arg0.field2799;
        }
        field2805++;
        if (arg1 <= 105) {
            this.method937(12);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class91.field2239[this.field2800[var4] & 0xFF] < class91.field2239[arg0.field2800[var4] & 0xFF]) {
                return -1;
            }
            if (class91.field2239[this.field2800[var4] & 0xFF] > class91.field2239[arg0.field2800[var4] & 0xFF]) {
                return 1;
            }
        }
        if (this.field2799 < arg0.field2799) {
            return -1;
        } else if (this.field2799 > arg0.field2799) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)J")
    private final long method922(int arg0) {
        long var2 = 0L;
        field2765++;
        for (int var4 = 0; var4 < this.field2799; var4++) {
            var2 = (var2 << 5) + (long) (this.field2800[var4] & 0xFF) - var2;
        }
        int var5 = 60 / ((arg0 - 49) / 41);
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqf;Z)I")
    public final int method923(class117 arg0, boolean arg1) {
        field2788++;
        int var3;
        if (arg0.field2799 >= this.field2799) {
            var3 = this.field2799;
        } else {
            var3 = arg0.field2799;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field2800[var4] & 0xFF) < (arg0.field2800[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field2800[var4] & 0xFF) > (arg0.field2800[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1) {
            field2811 = null;
        }
        if (arg0.field2799 > this.field2799) {
            return -1;
        } else if (arg0.field2799 < this.field2799) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(IB)I")
    public final int method924(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        field2819++;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != -99) {
            field2827 = null;
        }
        while (var6 < this.field2799) {
            label83: {
                int var7 = this.field2800[var6] & 0xFF;
                if (var6 == 0) {
                    if (var7 == 45) {
                        var4 = true;
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
                if (var4) {
                    var7 = -var7;
                }
                int var8 = arg0 * var5 + var7;
                if (var8 / arg0 != var5) {
                    throw new NumberFormatException();
                }
                var5 = var8;
                var3 = true;
            }
            var6++;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)Lqf;")
    public final class117 method925(boolean arg0) {
        field2808++;
        if (!arg0) {
            method910(null, -6, null, null);
        }
        class117 var2 = new class117();
        var2.field2799 = this.field2799;
        var2.field2800 = new byte[this.field2799];
        for (int var3 = 0; var3 < this.field2799; var3++) {
            byte var4 = this.field2800[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2800[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2784++;
        if (!(arg0 instanceof class117)) {
            throw new IllegalArgumentException();
        }
        return this.method918((class117) arg0, -94);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLqf;)I")
    public final int method926(byte arg0, class117 arg1) {
        if (arg0 > -58) {
            return -107;
        } else {
            field2782++;
            return this.method931(true, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lqf;B)Z")
    public final boolean method927(class117 arg0, byte arg1) {
        field2762++;
        if (arg0.field2799 > this.field2799) {
            return false;
        }
        int var3 = this.field2799 - arg0.field2799;
        for (int var4 = 0; var4 < arg0.field2799; var4++) {
            if (this.field2800[var4 + var3] != arg0.field2800[var4]) {
                return false;
            }
        }
        return arg1 == -8 ? true : true;
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Lqf;")
    public final class117 method928(int arg0) {
        field2797++;
        if (arg0 != 57) {
            field2811 = null;
        }
        if (!this.field2802) {
            throw new IllegalArgumentException();
        }
        this.field2778 = 0;
        if (this.field2800.length != this.field2799) {
            byte[] var2 = new byte[this.field2799];
            class109.method822(this.field2800, 0, var2, 0, this.field2799);
            this.field2800 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
    private final int method929(int arg0, int arg1, int arg2) {
        field2775++;
        if (arg2 > -50) {
            this.method921(null, -102);
        }
        byte var4 = (byte) arg1;
        for (int var5 = arg0; var5 < this.field2799; var5++) {
            if (this.field2800[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lv;I)V")
    public static final void method930(class143 arg0, int arg1) {
        field2796++;
        if (class26.field507) {
            class83.method649(arg0, true);
            return;
        }
        if (class133.field3142 == 1 && class153.field3788 >= 715 && class102.field2462 >= 453) {
            class89.field2065 = !class89.field2065;
            if (class89.field2065) {
                class147.method1179(3);
            } else {
                class16.method142(class110.field2610, class126.field2987, false, 10500, class50.field1040, 255);
            }
        }
        if (class48.field1022 == 5) {
            return;
        }
        class27.field542++;
        if (class48.field1022 != 10) {
            return;
        }
        if (class19.field299 != 2 && class144.field3539 == 0) {
            if (class133.field3142 == 1) {
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                byte var5 = 5;
                if (var5 <= class153.field3788 && class153.field3788 <= var3 + var5 && var2 <= class102.field2462 && class102.field2462 <= var2 + var4) {
                    class116.method901((byte) 110);
                    return;
                }
            }
            if (class65.field1363 != null) {
                class116.method901((byte) 110);
            }
        }
        int var6 = class133.field3142;
        int var7 = class153.field3788;
        int var8 = class102.field2462;
        int var9 = -64 / ((38 - arg1) / 40);
        if (class66.field1386 == 0) {
            short var10 = 291;
            short var11 = 302;
            if (var6 == 1 && var11 - 75 <= var7 && var11 + 75 >= var7 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class66.field1391 = 0;
                class66.field1386 = 3;
            }
            short var12 = 462;
            if (var6 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var10 - 20 && var8 <= var10 + 20) {
                class126.field2997 = class48.field990;
                class126.field2975 = class114.field2704;
                class66.field1391 = 0;
                class66.field1386 = 2;
                class126.field2984 = class48.field972;
            }
        } else if (class66.field1386 == 2) {
            short var13 = 231;
            int var21 = var13 + 30;
            if (var6 == 1 && var8 >= var21 - 15 && var8 < var21) {
                class66.field1391 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var8 >= var21 - 15 && var8 < var21) {
                class66.field1391 = 1;
            }
            short var14 = 321;
            var21 += 15;
            short var15 = 302;
            if (var6 == 1 && var7 >= var15 - 75 && var7 <= var15 + 75 && var8 >= var14 - 20 && var14 + 20 >= var8) {
                class126.field2991 = class126.field2991.method933(true).method945(-119);
                if (class126.field2991.method915(27) == 0) {
                    class35.method272(class48.field1008, false, class48.field1016, class87.field2018);
                } else if (class126.field2982.method915(27) == 0) {
                    class35.method272(class48.field976, false, class48.field1015, class3.field56);
                } else {
                    class35.method272(class48.field971, false, class48.field1000, class124.field2930);
                    class62.method430(20, (byte) -47);
                }
            } else {
                short var16 = 462;
                if (var6 == 1 && var7 >= var16 - 75 && var7 <= var16 + 75 && var8 >= var14 - 20 && var8 <= var14 + 20) {
                    class126.field2982 = class126.field2987;
                    class126.field2991 = class126.field2987;
                    class66.field1386 = 0;
                }
                while (true) {
                    boolean var17;
                    label185: do {
                        while (class82.method641((byte) 107)) {
                            var17 = false;
                            for (int var18 = 0; var18 < class107.field2559.method915(27); var18++) {
                                if (class85.field1929 == class107.field2559.method911(false, var18)) {
                                    var17 = true;
                                    break;
                                }
                            }
                            if (class66.field1391 != 0) {
                                continue label185;
                            }
                            if (class104.field2514 == 85 && class126.field2991.method915(27) > 0) {
                                class126.field2991 = class126.field2991.method943(0, (byte) 120, class126.field2991.method915(27) - 1);
                            }
                            if (class104.field2514 == 84 || class104.field2514 == 80) {
                                class66.field1391 = 1;
                            }
                            if (var17 && class126.field2991.method915(27) < 12) {
                                class126.field2991 = class126.field2991.method919(class85.field1929, (byte) 66);
                            }
                        }
                        return;
                    } while (class66.field1391 != 1);
                    if (class104.field2514 == 85 && class126.field2982.method915(27) > 0) {
                        class126.field2982 = class126.field2982.method943(0, (byte) 126, class126.field2982.method915(27) - 1);
                    }
                    if (class104.field2514 == 84 || class104.field2514 == 80) {
                        class66.field1391 = 0;
                    }
                    if (var17 && class126.field2982.method915(27) < 20) {
                        class126.field2982 = class126.field2982.method919(class85.field1929, (byte) -122);
                    }
                }
            }
        } else if (class66.field1386 == 3) {
            short var19 = 382;
            short var20 = 321;
            if (var6 == 1 && var7 >= var19 - 75 && var7 <= var19 + 75 && var20 - 20 <= var8 && var20 + 20 >= var8) {
                class66.field1386 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLqf;I)I")
    private final int method931(boolean arg0, class117 arg1, int arg2) {
        field2789++;
        int[] var4 = new int[arg1.field2799];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field2799];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field2799;
        }
        for (int var8 = 1; var8 <= arg1.field2799; var8++) {
            var4[var8 - 1] = (arg1.field2799 << 1) - var8;
            var5[class16.method135(255, arg1.field2800[var8 - 1])] = arg1.field2799 - var8;
        }
        int var9 = arg1.field2799 + 1;
        for (int var10 = arg1.field2799; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field2799 && arg1.field2800[var9 - 1] != arg1.field2800[var10 - 1]) {
                if (var4[var9 - 1] >= arg1.field2799 - var10) {
                    var4[var9 - 1] = arg1.field2799 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        if (!arg0) {
            this.method931(false, null, 90);
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg1.field2799 + 1 - var9;
        int var14 = 0;
        int var15 = 1;
        while (var13 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field2800[var15 - 1] != arg1.field2800[var14 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg1.field2799) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg1.field2799 + var11 - var18) {
                    var4[var18 - 1] = arg1.field2799 + var11 - var18;
                }
            }
            var12 = var11 + 1;
            var11 -= var6[var13 - 1] - var13;
            var13 = var6[var13 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg1.field2799 - 1; var16 < this.field2799; var16 += Math.max(var5[this.field2800[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field2799 - 1; var17 >= 0 && this.field2800[var16] == arg1.field2800[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(Lqf;I)Z")
    public final boolean method932(class117 arg0, int arg1) {
        field2763++;
        if (arg1 >= -60) {
            method938(-2, (byte) -2);
        }
        if (this.field2799 < arg0.field2799) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field2799; var3++) {
            if (this.field2800[var3] != arg0.field2800[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(Z)Lqf;")
    public final class117 method933(boolean arg0) {
        field2774++;
        class117 var2 = new class117();
        var2.field2799 = 0;
        var2.field2800 = new byte[12];
        int var3 = 0;
        if (!arg0) {
            this.method925(true);
        }
        for (int var4 = 0; var4 < this.field2799; var4++) {
            if (this.field2800[var4] >= 65 && this.field2800[var4] <= 90) {
                var2.field2800[var3++] = (byte) (this.field2800[var4] + 97 - 65);
                var2.field2799 = var3;
            } else if (this.field2800[var4] >= 97 && this.field2800[var4] <= 122 || this.field2800[var4] >= 48 && this.field2800[var4] <= 57) {
                var2.field2800[var3++] = this.field2800[var4];
                var2.field2799 = var3;
            } else if (var3 > 0) {
                var2.field2800[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(Z)I")
    public final int method934(boolean arg0) {
        field2785++;
        int var2 = 0;
        if (!arg0) {
            field2816 = null;
        }
        for (int var3 = 0; var3 < this.field2799; var3++) {
            var2 = (var2 << 5) + (this.field2800[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[BIBI)I")
    public final int method935(int arg0, byte[] arg1, int arg2, byte arg3, int arg4) {
        if (arg3 < 24) {
            field2823 = null;
        }
        class109.method822(this.field2800, arg2, arg1, arg4, arg0 - arg2);
        field2779++;
        return arg0 - arg2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/FontMetrics;Z)I")
    public final int method936(FontMetrics arg0, boolean arg1) {
        field2769++;
        String var3;
        try {
            if (!arg1) {
                return -8;
            }
            var3 = new String(this.field2800, 0, this.field2799, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2800, 0, this.field2799);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)Lqf;")
    public final class117 method937(int arg0) {
        field2804++;
        long var2 = this.method922(-35);
        synchronized (field2829 == null ? (field2829 = method946("qf")) : field2829) {
            if (class130.field3078 == null) {
                class130.field3078 = new class153(4096);
            } else {
                for (class20 var5 = (class20) class130.field3078.method1221(109, var2); var5 != null; var5 = (class20) class130.field3078.method1220(false)) {
                    if (this.method918(var5.field321, -106)) {
                        return var5.field321;
                    }
                }
            }
            if (arg0 != 4096) {
                field2810 = null;
            }
            class20 var7 = new class20();
            var7.field321 = this;
            this.field2802 = false;
            class130.field3078.method1219(var7, (byte) -110, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(IB)I")
    public static final int method938(int arg0, byte arg1) {
        field2803++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        if (arg1 != -98) {
            method930(null, -117);
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILqf;)Z")
    public final boolean method939(int arg0, class117 arg1) {
        field2792++;
        if (arg1 == null) {
            return false;
        } else if (arg0 != -1) {
            return false;
        } else if (this.field2799 == arg1.field2799) {
            for (int var3 = 0; var3 < this.field2799; var3++) {
                byte var4 = this.field2800[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field2800[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)[B")
    public final byte[] method940(int arg0) {
        if (arg0 < 117) {
            return null;
        } else {
            field2777++;
            byte[] var2 = new byte[this.field2799];
            class109.method822(this.field2800, 0, var2, 0, this.field2799);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)Lqf;")
    public final class117 method941(int arg0) {
        byte var2 = 2;
        class117 var3 = new class117();
        var3.field2799 = this.field2799;
        var3.field2800 = new byte[this.field2799];
        for (int var4 = 0; var4 < this.field2799; var4++) {
            byte var5 = this.field2800[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field2800[var4] = var5;
        }
        if (arg0 > -48) {
            return null;
        } else {
            field2780++;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)J")
    public final long method942(byte arg0) {
        if (arg0 != 11) {
            field2810 = null;
        }
        field2783++;
        long var2 = 0L;
        for (int var4 = 0; this.field2799 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2800[var4];
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

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Lqf;")
    public final class117 method943(int arg0, byte arg1, int arg2) {
        field2771++;
        class117 var4 = new class117();
        if (arg1 < 118) {
            field2823 = null;
        }
        var4.field2800 = new byte[arg2 - arg0];
        var4.field2799 = arg2 - arg0;
        class109.method822(this.field2800, arg0, var4.field2800, 0, var4.field2799);
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method944(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 > -56) {
            field2815 = null;
        }
        field2768++;
        String var5;
        try {
            var5 = new String(this.field2800, 0, this.field2799, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2800, 0, this.field2799);
        }
        arg3.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "(I)Lqf;")
    public final class117 method945(int arg0) {
        field2790++;
        class117 var2 = new class117();
        boolean var3 = true;
        var2.field2799 = this.field2799;
        var2.field2800 = new byte[this.field2799];
        if (arg0 >= -88) {
            return null;
        }
        for (int var4 = 0; var4 < this.field2799; var4++) {
            byte var5 = this.field2800[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field2800[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field2800[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field2800[var4] = var5;
            }
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method946(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
