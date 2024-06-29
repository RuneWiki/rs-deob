import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class118 implements class135 {

    @OriginalMember(owner = "client!r", name = "S", descriptor = "Z")
    private boolean field2758 = true;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "Lr;")
    public static class118 field2753 = class153.method1136(76, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Lqb;")
    public static class113 field2734 = new class113();

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Lge;")
    public static class47 field2765 = new class47(100);

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "Lr;")
    private static class118 field2768 = class153.method1136(95, "Welcome to RuneScape");

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "Lr;")
    public static class118 field2766 = class153.method1136(97, "ams");

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field2773 = 0;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "Lr;")
    private static class118 field2769 = class153.method1136(80, "Malformed login packet)3");

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "Lr;")
    public static class118 field2770 = field2769;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "Lr;")
    public static class118 field2771 = class153.method1136(109, "Null");

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "[I")
    public static int[] field2774 = new int[256];

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "Lr;")
    public static class118 field2772 = field2768;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    private int field2721;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public int field2743;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public static int field2767;

    // $FF: synthetic field
    @OriginalMember(owner = "client!r", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field2775;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "[B")
    public byte[] field2746;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lr;")
    public final class118 method903(int arg0) {
        field2730++;
        class118 var2 = new class118();
        if (arg0 != 38) {
            this.method905(56, (byte) -119);
        }
        boolean var3 = true;
        var2.field2743 = this.field2743;
        var2.field2746 = new byte[this.field2743];
        for (int var4 = 0; var4 < this.field2743; var4++) {
            byte var5 = this.field2746[var4];
            if (var5 == 95) {
                var2.field2746[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field2746[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field2746[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
    public final int method904(byte arg0) {
        field2724++;
        if (arg0 != -58) {
            this.method941(-51, -30);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2743; var3++) {
            var2 = (this.field2746[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Lr;")
    public final class118 method905(int arg0, byte arg1) {
        field2731++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field2758) {
            if (arg1 >= -111) {
                field2772 = null;
            }
            this.field2721 = 0;
            if (this.field2746.length == this.field2743) {
                int var3;
                for (var3 = 1; var3 <= this.field2743; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class57.method504(this.field2746, 0, var4, 0, this.field2743);
                this.field2746 = var4;
            }
            this.field2746[this.field2743++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)I")
    public final int method906(int arg0) {
        field2736++;
        return arg0 == 34 ? this.method914((byte) 127, 10) : -120;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILr;B)I")
    public final int method907(int arg0, class118 arg1, byte arg2) {
        field2725++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg1.field2743];
        int[] var6 = new int[arg1.field2743];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field2743;
        }
        for (int var8 = 1; var8 <= arg1.field2743; var8++) {
            var5[var8 - 1] = (arg1.field2743 << 1) - var8;
            var4[class79.method669(arg1.field2746[var8 - 1], 255)] = arg1.field2743 - var8;
        }
        int var9 = arg1.field2743 + 1;
        for (int var10 = arg1.field2743; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg1.field2743 >= var9 && arg1.field2746[var9 - 1] != arg1.field2746[var10 - 1]) {
                if (arg1.field2743 - var10 <= var5[var9 + -1]) {
                    var5[var9 - 1] = arg1.field2743 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = -17 / ((7 - arg2) / 60);
        int var12 = 0;
        int var13 = 1;
        int var14 = var9;
        int var15 = arg1.field2743 + 1 - var9;
        int var16 = 1;
        while (var16 <= var15) {
            var6[var16 - 1] = var12;
            while (var12 >= 1 && arg1.field2746[var12 - 1] != arg1.field2746[var16 - 1]) {
                var12 = var6[var12 - 1];
            }
            var16++;
            var12++;
        }
        while (arg1.field2743 > var14) {
            for (int var19 = var13; var19 <= var14; var19++) {
                if (var5[var19 - 1] >= arg1.field2743 + var14 - var19) {
                    var5[var19 - 1] = arg1.field2743 + var14 - var19;
                }
            }
            var13 = var14 + 1;
            var14 = var14 + var15 - var6[var15 + -1];
            var15 = var6[var15 - 1];
        }
        int var18;
        for (int var17 = arg1.field2743 + arg0 - 1; var17 < this.field2743; var17 += Math.max(var4[this.field2746[var17] & 0xFF], var5[var18])) {
            for (var18 = arg1.field2743 - 1; var18 >= 0 && this.field2746[var17] == arg1.field2746[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)J")
    private final long method908(int arg0) {
        if (arg0 < 44) {
            field2774 = null;
        }
        field2732++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2743; var4++) {
            var2 = (var2 << 5) + (long) (this.field2746[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)I")
    public static final int method909(int arg0, int arg1, int arg2) {
        field2740++;
        if (arg1 != 0) {
            method937(true);
        }
        class97 var3 = (class97) class64.field1464.method297((long) arg2, -1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field2262.length > arg0) {
            return var3.field2262[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;I)I")
    public final int method910(class118 arg0, int arg1) {
        int var3;
        if (this.field2743 > arg0.field2743) {
            var3 = arg0.field2743;
        } else {
            var3 = this.field2743;
        }
        field2744++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field2746[var4] & 0xFF) < (arg0.field2746[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field2746[var4] & 0xFF) < (this.field2746[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg0.field2743 > this.field2743) {
            return -1;
        } else if (this.field2743 > arg0.field2743) {
            return 1;
        } else if (arg1 < 12) {
            return 3;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Lr;I)Z")
    public final boolean method911(class118 arg0, int arg1) {
        if (arg1 != 14934) {
            field2753 = null;
        }
        field2752++;
        if (arg0 == null) {
            return false;
        } else if (this.field2743 == arg0.field2743) {
            for (int var3 = 0; var3 < this.field2743; var3++) {
                byte var4 = arg0.field2746[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field2746[var3];
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

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILr;)Z")
    public final boolean method912(int arg0, class118 arg1) {
        field2763++;
        if (arg1.field2743 > this.field2743) {
            return false;
        } else if (arg0 == 31056) {
            int var3 = this.field2743 - arg1.field2743;
            for (int var4 = 0; var4 < arg1.field2743; var4++) {
                if (this.field2746[var4 + var3] != arg1.field2746[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!r", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field2735++;
        return this.method904((byte) -58);
    }

    @OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2737++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Lr;")
    public final class118 method913(byte arg0) {
        class118 var2 = new class118();
        var2.field2743 = this.field2743;
        var2.field2746 = new byte[this.field2743];
        for (int var3 = 0; var3 < this.field2743; var3++) {
            byte var5 = this.field2746[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            var2.field2746[var3] = var5;
        }
        int var4 = 102 / ((-arg0 - 24) / 41);
        field2741++;
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)I")
    public final int method914(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field2760++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 < 126) {
            field2771 = null;
        }
        for (int var6 = 0; var6 < this.field2743; var6++) {
            int var7 = this.field2746[var6] & 0xFF;
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
            if (arg1 <= var7) {
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

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;B)Z")
    public final boolean method915(class118 arg0, byte arg1) {
        field2757++;
        if (arg0.field2743 > this.field2743) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field2743; var3++) {
            if (this.field2746[var3] != arg0.field2746[var3]) {
                return false;
            }
        }
        if (arg1 <= 28) {
            this.method908(-2);
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public final int method916(int arg0, int arg1) {
        if (arg0 != -24853) {
            this.field2758 = false;
        }
        field2733++;
        return this.field2746[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Z")
    public final boolean method917(boolean arg0) {
        if (!arg0) {
            this.field2721 = 125;
        }
        field2716++;
        return this.method941(10, -121);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Lr;")
    public final class118 method918(boolean arg0) {
        field2723++;
        int var2 = this.field2743;
        int var3;
        for (var3 = 0; this.field2743 > var3 && (this.field2746[var3] >= 0 && this.field2746[var3] <= 32 || (this.field2746[var3] & 0xFF) == 160); var3++) {
        }
        if (arg0) {
            return null;
        }
        while (var2 > var3 && (this.field2746[var2 - 1] >= 0 && this.field2746[var2 - 1] <= 32 || (this.field2746[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field2743 == var2) {
            return this;
        }
        class118 var4 = new class118();
        var4.field2743 = var2 - var3;
        var4.field2746 = new byte[var4.field2743];
        for (int var5 = 0; var5 < var4.field2743; var5++) {
            var4.field2746[var5] = this.field2746[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(ILr;)I")
    public final int method919(int arg0, class118 arg1) {
        if (arg0 >= -14) {
            return -4;
        }
        field2728++;
        int var3;
        if (this.field2743 > arg1.field2743) {
            var3 = arg1.field2743;
        } else {
            var3 = this.field2743;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class47.field1131[this.field2746[var4] & 0xFF] < class47.field1131[arg1.field2746[var4] & 0xFF]) {
                return -1;
            }
            if (class47.field1131[arg1.field2746[var4] & 0xFF] < class47.field1131[this.field2746[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field2743 > this.field2743) {
            return -1;
        } else if (arg1.field2743 < this.field2743) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)Lr;")
    public final class118 method920(byte arg0) {
        field2739++;
        if (arg0 > -15) {
            this.field2721 = -85;
        }
        if (!this.field2758) {
            throw new IllegalArgumentException();
        }
        this.field2721 = 0;
        if (this.field2746.length != this.field2743) {
            byte[] var2 = new byte[this.field2743];
            class57.method504(this.field2746, 0, var2, 0, this.field2743);
            this.field2746 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)[B")
    public final byte[] method921(int arg0) {
        if (arg0 != 20377) {
            this.equals(null);
        }
        field2755++;
        byte[] var2 = new byte[this.field2743];
        class57.method504(this.field2746, 0, var2, 0, this.field2743);
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IB)Lr;")
    public final class118 method922(int arg0, byte arg1) {
        field2717++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class118 var3 = new class118();
        var3.field2746 = new byte[this.field2743 + 1];
        var3.field2743 = this.field2743 + 1;
        class57.method504(this.field2746, 0, var3.field2746, 0, this.field2743);
        if (arg1 != -6) {
            field2768 = null;
        }
        var3.field2746[this.field2743] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(ILr;)Lr;")
    public final class118 method923(int arg0, class118 arg1) {
        field2729++;
        if (!this.field2758) {
            throw new IllegalArgumentException();
        }
        this.field2721 = 0;
        if (this.field2746.length < this.field2743 + arg1.field2743) {
            int var3;
            for (var3 = 1; var3 < this.field2743 + arg1.field2743; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class57.method504(this.field2746, 0, var4, 0, this.field2743);
            this.field2746 = var4;
        }
        int var5 = -9 / ((44 - arg0) / 61);
        class57.method504(arg1.field2746, 0, this.field2746, this.field2743, arg1.field2743);
        this.field2743 += arg1.field2743;
        return this;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method924(int arg0, FontMetrics arg1) {
        field2738++;
        if (arg0 < 46) {
            return 43;
        }
        String var3;
        try {
            var3 = new String(this.field2746, 0, this.field2743, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2746, 0, this.field2743);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)J")
    public final long method925(int arg0) {
        long var2 = 0L;
        field2745++;
        for (int var4 = arg0; var4 < this.field2743 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2746[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IB)Lr;")
    public final class118 method926(int arg0, byte arg1) {
        if (arg1 != 117) {
            field2774 = null;
        }
        field2751++;
        return this.method932(this.field2743, (byte) 30, arg0);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static final void method927(byte arg0) {
        class42.field1001.method394(12693);
        if (arg0 != 60) {
            field2773 = -69;
        }
        field2742++;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Lr;")
    public final class118 method928(int arg0) {
        field2718++;
        class118 var2 = new class118();
        var2.field2746 = new byte[12];
        int var3 = 0;
        var2.field2743 = 0;
        if (arg0 != 30330) {
            this.field2743 = 59;
        }
        for (int var4 = 0; var4 < this.field2743; var4++) {
            if (this.field2746[var4] >= 65 && this.field2746[var4] <= 90) {
                var2.field2746[var3++] = (byte) (this.field2746[var4] + 97 - 65);
                var2.field2743 = var3;
            } else if (this.field2746[var4] >= 97 && this.field2746[var4] <= 122 || this.field2746[var4] >= 48 && this.field2746[var4] <= 57) {
                var2.field2746[var3++] = this.field2746[var4];
                var2.field2743 = var3;
            } else if (var3 > 0) {
                var2.field2746[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)I")
    public final int method929(int arg0, int arg1, byte arg2) {
        byte var4 = (byte) arg0;
        field2756++;
        int var5 = arg1;
        int var6 = 98 / ((40 - arg2) / 59);
        while (this.field2743 > var5) {
            if (this.field2746[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)Lr;")
    public final class118 method930(int arg0) {
        field2720++;
        class118 var2 = new class118();
        int var3 = 61 / ((arg0 + 22) / 56);
        var2.field2743 = this.field2743;
        var2.field2746 = new byte[this.field2743];
        for (int var4 = 0; var4 < this.field2743; var4++) {
            var2.field2746[var4] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)Ljava/net/URL;")
    public final URL method931(int arg0) throws MalformedURLException {
        if (arg0 <= 10) {
            field2767 = -23;
        }
        field2764++;
        return new URL(new String(this.field2746, 0, this.field2743));
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)Lr;")
    public final class118 method932(int arg0, byte arg1, int arg2) {
        field2727++;
        class118 var4 = new class118();
        int var5 = 59 % ((79 - arg1) / 41);
        var4.field2743 = arg0 - arg2;
        var4.field2746 = new byte[arg0 - arg2];
        class57.method504(this.field2746, arg2, var4.field2746, 0, var4.field2743);
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLr;)I")
    public final int method933(byte arg0, class118 arg1) {
        field2719++;
        if (arg0 >= -74) {
            field2768 = null;
        }
        return this.method907(0, arg1, (byte) -100);
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)Lr;")
    public final class118 method934(byte arg0) {
        field2750++;
        long var2 = this.method908(123);
        synchronized (field2775 == null ? (field2775 = method942("r")) : field2775) {
            if (class133.field3030 == null) {
                class133.field3030 = new class35(4096);
            } else {
                for (class146 var5 = (class146) class133.field3030.method297(var2, -1); var5 != null; var5 = (class146) class133.field3030.method294((byte) 118)) {
                    if (this.method938((byte) 108, var5.field3264)) {
                        return var5.field3264;
                    }
                }
            }
            class146 var7 = new class146();
            if (arg0 == -40) {
                var7.field3264 = this;
                this.field2758 = false;
                class133.field3030.method288(var7, var2, (byte) -91);
                return this;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field2754++;
        if (!(arg0 instanceof class118)) {
            throw new IllegalArgumentException();
        }
        return this.method938((byte) 110, (class118) arg0);
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)I")
    public final int method935(int arg0) {
        if (arg0 > -60) {
            this.field2758 = true;
        }
        field2715++;
        return this.field2743;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZ[B)I")
    public final int method936(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        class57.method504(this.field2746, arg0, arg4, arg2, arg1 - arg0);
        if (arg3) {
            return 122;
        } else {
            field2762++;
            return arg1 - arg0;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public static void method937(boolean arg0) {
        field2753 = null;
        field2772 = null;
        field2770 = null;
        field2768 = null;
        field2774 = null;
        field2766 = null;
        field2769 = null;
        if (arg0) {
            method927((byte) -119);
        }
        field2734 = null;
        field2771 = null;
        field2765 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BLr;)Z")
    public final boolean method938(byte arg0, class118 arg1) {
        field2749++;
        if (arg1 == null) {
            return false;
        } else if (this.field2743 == arg1.field2743) {
            if (arg0 <= 37) {
                field2768 = null;
            }
            if (!this.field2758 || !arg1.field2758) {
                if (this.field2721 == 0) {
                    this.field2721 = this.method904((byte) -58);
                    if (this.field2721 == 0) {
                        this.field2721 = 1;
                    }
                }
                if (arg1.field2721 == 0) {
                    arg1.field2721 = arg1.method904((byte) -58);
                    if (arg1.field2721 == 0) {
                        arg1.field2721 = 1;
                    }
                }
                if (this.field2721 != arg1.field2721) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field2743; var3++) {
                if (this.field2746[var3] != arg1.field2746[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(B)Lr;")
    public final class118 method939(byte arg0) {
        class118 var2 = new class118();
        field2748++;
        var2.field2743 = this.field2743;
        if (arg0 != 121) {
            this.equals(null);
        }
        var2.field2746 = new byte[this.field2743];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field2743; var4++) {
            byte var5 = this.field2746[var4];
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
            var2.field2746[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method940(int arg0, Graphics arg1, byte arg2, int arg3) {
        field2759++;
        String var5;
        try {
            var5 = new String(this.field2746, 0, this.field2743, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2746, 0, this.field2743);
        }
        arg1.drawString(var5, arg0, arg3);
        if (arg2 < 102) {
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Z")
    private final boolean method941(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field2722++;
        boolean var3 = false;
        boolean var4 = false;
        if (arg1 >= -120) {
            this.method910(null, 123);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2743; var6++) {
            int var7 = this.field2746[var6] & 0xFF;
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

    // $FF: synthetic method
    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method942(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2774[var0] = var1;
        }
    }
}
