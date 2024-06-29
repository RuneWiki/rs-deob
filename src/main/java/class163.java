import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class163 implements class203 {

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Z")
    private boolean field3331 = true;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "B")
    public static byte field3309 = 0;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field3303 = 0;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Z")
    public static boolean field3327 = false;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "[I")
    public static int[] field3326 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public int field3341;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lue;")
    public static class189 field3311;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field3348;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[B")
    public byte[] field3320;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "[[B")
    public static byte[][] field3324;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "[[B")
    public static byte[][] field3347;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Lrf;")
    public final class163 method1022(int arg0, boolean arg1) {
        field3297++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field3331) {
            this.field3299 = 0;
            if (!arg1) {
                return null;
            }
            if (this.field3320.length == this.field3341) {
                int var3;
                for (var3 = 1; var3 <= this.field3341; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class123.method830(this.field3320, 0, var4, 0, this.field3341);
                this.field3320 = var4;
            }
            this.field3320[this.field3341++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)J")
    private final long method1023(byte arg0) {
        field3333++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field3341; var4++) {
            var2 = (var2 << 5) + (long) (this.field3320[var4] & 0xFF) - var2;
        }
        if (arg0 != 45) {
            this.method1037((byte) 77);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILrf;)Z")
    public final boolean method1024(int arg0, class163 arg1) {
        field3315++;
        if (this.field3341 < arg1.field3341) {
            return false;
        }
        if (arg0 <= 88) {
            field3327 = true;
        }
        for (int var3 = 0; var3 < arg1.field3341; var3++) {
            if (this.field3320[var3] != arg1.field3320[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I")
    public final int method1025(int arg0) {
        if (arg0 != 20559) {
            field3347 = null;
        }
        field3332++;
        return this.method1041(10, 42);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lrf;")
    public final class163 method1026(boolean arg0) {
        field3325++;
        if (!this.field3331) {
            throw new IllegalArgumentException();
        } else if (arg0) {
            this.field3299 = 0;
            if (this.field3320.length != this.field3341) {
                byte[] var2 = new byte[this.field3341];
                class123.method830(this.field3320, 0, var2, 0, this.field3341);
                this.field3320 = var2;
            }
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
    private final boolean method1027(int arg0, int arg1) {
        field3301++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = 0;
        boolean var4 = false;
        boolean var5 = false;
        int var6 = -76 % ((arg1 + 69) / 34);
        for (int var7 = 0; var7 < this.field3341; var7++) {
            int var8 = this.field3320[var7] & 0xFF;
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
            int var9 = arg0 * var3 + var8;
            if (var9 / arg0 != var3) {
                return false;
            }
            var4 = true;
            var3 = var9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method1028(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 >= -86) {
            field3311 = null;
        }
        field3316++;
        String var5;
        try {
            var5 = new String(this.field3320, 0, this.field3341, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3320, 0, this.field3341);
        }
        arg2.drawString(var5, arg1, arg0);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
    public final int method1029(int arg0) {
        if (arg0 <= 111) {
            field3303 = 109;
        }
        field3308++;
        return this.field3341;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)Ljava/net/URL;")
    public final URL method1030(int arg0) throws MalformedURLException {
        field3306++;
        return arg0 == 0 ? new URL(new String(this.field3320, 0, this.field3341)) : null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Lrf;")
    public final class163 method1031(boolean arg0) {
        field3321++;
        class163 var2 = new class163();
        var2.field3341 = this.field3341;
        boolean var3 = true;
        var2.field3320 = new byte[this.field3341];
        if (arg0) {
            this.method1034(null, 25);
        }
        for (int var4 = 0; var4 < this.field3341; var4++) {
            byte var5 = this.field3320[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field3320[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field3320[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field3320[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)I")
    public final int method1032(int arg0, byte arg1) {
        field3342++;
        int var3 = -59 / ((63 - arg1) / 44);
        return this.field3320[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILrf;)I")
    public final int method1033(int arg0, int arg1, class163 arg2) {
        field3336++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg2.field3341];
        int[] var6 = new int[arg2.field3341];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg2.field3341;
        }
        for (int var8 = 1; var8 <= arg2.field3341; var8++) {
            var5[var8 - 1] = (arg2.field3341 << 1) - var8;
            var4[class133.method887(arg2.field3320[var8 - 1], 255)] = arg2.field3341 - var8;
        }
        int var9 = arg2.field3341 + 1;
        int var10 = arg2.field3341;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field3341 && arg2.field3320[var9 - 1] != arg2.field3320[var10 - 1]) {
                if (var5[var9 - 1] >= arg2.field3341 - var10) {
                    var5[var9 - 1] = arg2.field3341 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field3341 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        while (var12 >= var15) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field3320[var15 - 1] != arg2.field3320[var14 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg2.field3341) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (arg2.field3341 + var11 - var18 <= var5[var18 + -1]) {
                    var5[var18 - 1] = arg2.field3341 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 += var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg2.field3341 + arg1 - arg0; var16 < this.field3341; var16 += Math.max(var4[this.field3320[var16] & 0xFF], var5[var17])) {
            for (var17 = arg2.field3341 - 1; var17 >= 0 && this.field3320[var16] == arg2.field3320[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lrf;I)Lrf;")
    public final class163 method1034(class163 arg0, int arg1) {
        int var3 = 119 / ((78 - arg1) / 32);
        field3318++;
        if (!this.field3331) {
            throw new IllegalArgumentException();
        }
        this.field3299 = 0;
        if (this.field3320.length < this.field3341 + arg0.field3341) {
            int var4;
            for (var4 = 1; var4 < this.field3341 + arg0.field3341; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class123.method830(this.field3320, 0, var5, 0, this.field3341);
            this.field3320 = var5;
        }
        class123.method830(arg0.field3320, 0, this.field3320, this.field3341, arg0.field3341);
        this.field3341 += arg0.field3341;
        return this;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLrf;)I")
    public final int method1035(boolean arg0, class163 arg1) {
        field3335++;
        if (!arg0) {
            this.method1036(-95, (byte) 22, 8);
        }
        return this.method1033(1, 0, arg1);
    }

    @OriginalMember(owner = "client!rf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3338++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)Lrf;")
    public final class163 method1036(int arg0, byte arg1, int arg2) {
        class163 var4 = new class163();
        field3298++;
        var4.field3320 = new byte[arg0 - arg2];
        if (arg1 < 84) {
            return null;
        } else {
            var4.field3341 = arg0 - arg2;
            class123.method830(this.field3320, arg2, var4.field3320, 0, var4.field3341);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rf", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3310++;
        if (!(arg0 instanceof class163)) {
            throw new IllegalArgumentException();
        }
        return this.method1043(73, (class163) arg0);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Lrf;")
    public final class163 method1037(byte arg0) {
        field3323++;
        int var2 = -72 % ((arg0 + 54) / 62);
        class163 var3 = new class163();
        var3.field3341 = this.field3341;
        var3.field3320 = new byte[this.field3341];
        byte var4 = 2;
        for (int var5 = 0; var5 < this.field3341; var5++) {
            byte var6 = this.field3320[var5];
            if (var6 >= 97 && var6 <= 122 || var6 >= -32 && var6 <= -2 && var6 != -9) {
                if (var4 == 2) {
                    var6 = (byte) (var6 - 32);
                }
                var4 = 0;
            } else if (var6 >= 65 && var6 <= 90 || !(var6 < -64 || var6 > -34 || var6 == -41)) {
                if (var4 == 0) {
                    var6 = (byte) (var6 + 32);
                }
                var4 = 0;
            } else if (var6 == 46 || var6 == 33 || var6 == 63) {
                var4 = 2;
            } else if (var6 != 32) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3.field3320[var5] = var6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Lrf;I)Z")
    public final boolean method1038(class163 arg0, int arg1) {
        field3322++;
        if (arg0 == null) {
            return false;
        } else if (this.field3341 == arg0.field3341) {
            for (int var3 = arg1; var3 < this.field3341; var3++) {
                byte var4 = this.field3320[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field3320[var3];
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

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lrf;")
    public final class163 method1039(int arg0, int arg1) {
        field3345++;
        int var3 = -21 % ((arg1 - 11) / 53);
        return this.method1036(this.field3341, (byte) 127, arg0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLrf;)Z")
    public final boolean method1040(byte arg0, class163 arg1) {
        field3319++;
        if (arg1.field3341 > this.field3341) {
            return false;
        }
        int var3 = this.field3341 - arg1.field3341;
        for (int var4 = 0; var4 < arg1.field3341; var4++) {
            if (this.field3320[var4 + var3] != arg1.field3320[var4]) {
                return false;
            }
        }
        if (arg0 != 40) {
            this.method1041(-23, -126);
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(II)I")
    public final int method1041(int arg0, int arg1) {
        field3296++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3341; var6++) {
            int var7 = this.field3320[var6] & 0xFF;
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
            var5 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        } else if (arg1 <= 4) {
            return -88;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z")
    public final boolean method1042(int arg0) {
        field3304++;
        if (arg0 != -8159) {
            field3309 = 120;
        }
        return this.method1027(10, -116);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(ILrf;)Z")
    public final boolean method1043(int arg0, class163 arg1) {
        field3328++;
        if (arg1 == null) {
            return false;
        } else if (this.field3341 == arg1.field3341) {
            if (!this.field3331 || !arg1.field3331) {
                if (this.field3299 == 0) {
                    this.field3299 = this.method1056(-1);
                    if (this.field3299 == 0) {
                        this.field3299 = 1;
                    }
                }
                if (arg1.field3299 == 0) {
                    arg1.field3299 = arg1.method1056(-1);
                    if (arg1.field3299 == 0) {
                        arg1.field3299 = 1;
                    }
                }
                if (this.field3299 != arg1.field3299) {
                    return false;
                }
            }
            if (arg0 <= 72) {
                this.method1050(true);
            }
            for (int var3 = 0; var3 < this.field3341; var3++) {
                if (this.field3320[var3] != arg1.field3320[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3334++;
        return this.method1056(-1);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Lrf;")
    public final class163 method1044(int arg0) {
        field3344++;
        if (arg0 != -1) {
            this.method1047(-78, (byte) 39);
        }
        class163 var2 = class116.method802(this.method1058(-118), true);
        return var2 == null ? class128.field2636 : var2;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(ILrf;)I")
    public final int method1045(int arg0, class163 arg1) {
        field3340++;
        int var3;
        if (arg1.field3341 < this.field3341) {
            var3 = arg1.field3341;
        } else {
            var3 = this.field3341;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class210.field4092[this.field3320[var4] & 0xFF] < class210.field4092[arg1.field3320[var4] & 0xFF]) {
                return -1;
            }
            if (class210.field4092[arg1.field3320[var4] & 0xFF] < class210.field4092[this.field3320[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field3341 > this.field3341) {
            return -1;
        } else if (this.field3341 > arg1.field3341) {
            return 1;
        } else {
            if (arg0 <= 73) {
                this.field3341 = 119;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method1046(FontMetrics arg0, byte arg1) {
        String var3;
        try {
            var3 = new String(this.field3320, 0, this.field3341, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3320, 0, this.field3341);
        }
        field3329++;
        if (arg1 != -25) {
            this.method1032(118, (byte) -73);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)Lrf;")
    public final class163 method1047(int arg0, byte arg1) {
        field3317++;
        int var3 = -50 / ((arg1 - 63) / 56);
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class163 var4 = new class163();
        var4.field3320 = new byte[this.field3341 + 1];
        var4.field3341 = this.field3341 + 1;
        class123.method830(this.field3320, 0, var4.field3320, 0, this.field3341);
        var4.field3320[this.field3341] = (byte) arg0;
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)[Lrh;")
    public static final class165[] method1048(boolean arg0) {
        field3330++;
        if (!arg0) {
            field3309 = -112;
        }
        class165[] var1 = new class165[class22.field386];
        for (int var2 = 0; var2 < class22.field386; var2++) {
            class165 var3 = new class165();
            var3.field3367 = class206.field4036;
            var3.field3369 = class81.field1639;
            var3.field3366 = class102.field2135[var2];
            var3.field3368 = class129.field2686[var2];
            var3.field3364 = class108.field2242[var2];
            var3.field3365 = class57.field1158[var2];
            int var4 = var3.field3365 * var3.field3364;
            byte[] var5 = class202.field3980[var2];
            var3.field3370 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field3370[var6] = class167.field3393[class133.method887(var5[var6], 255)];
            }
            var1[var2] = var3;
        }
        class119.method814((byte) 84);
        return var1;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public static void method1049(byte arg0) {
        field3347 = null;
        if (arg0 != -118) {
            field3303 = -76;
        }
        field3311 = null;
        field3326 = null;
        field3324 = null;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(Z)Lrf;")
    public final class163 method1050(boolean arg0) {
        field3302++;
        class163 var2 = new class163();
        var2.field3341 = this.field3341;
        var2.field3320 = new byte[this.field3341];
        for (int var3 = 0; var3 < this.field3341; var3++) {
            var2.field3320[var3] = 42;
        }
        return arg0 ? var2 : null;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)Lrf;")
    public final class163 method1051(int arg0) {
        if (arg0 != 5485) {
            this.method1026(false);
        }
        long var2 = this.method1023((byte) 45);
        field3305++;
        synchronized (field3348 == null ? (field3348 = method1061("rf")) : field3348) {
            if (class142.field2926 == null) {
                class142.field2926 = new class65(4096);
            } else {
                for (class181 var5 = (class181) class142.field2926.method465(var2, (byte) 75); var5 != null; var5 = (class181) class142.field2926.method464(-26421)) {
                    if (this.method1043(106, var5.field3641)) {
                        return var5.field3641;
                    }
                }
            }
            class181 var7 = new class181();
            var7.field3641 = this;
            this.field3331 = false;
            class142.field2926.method462(121, var7, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)Lrf;")
    public final class163 method1052(int arg0) {
        int var2;
        for (var2 = 0; var2 < this.field3341 && (this.field3320[var2] >= 0 && this.field3320[var2] <= 32 || (this.field3320[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field3341; var2 < var3 && (this.field3320[var3 - 1] >= 0 && this.field3320[var3 - 1] <= 32 || (this.field3320[var3 - 1] & 0xFF) == 160); var3--) {
        }
        field3337++;
        if (var2 == 0 && this.field3341 == var3) {
            return this;
        }
        class163 var4 = new class163();
        if (arg0 < 21) {
            field3324 = null;
        }
        var4.field3341 = var3 - var2;
        var4.field3320 = new byte[var4.field3341];
        for (int var5 = 0; var5 < var4.field3341; var5++) {
            var4.field3320[var5] = this.field3320[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1053(int arg0, Component arg1) {
        arg1.addMouseListener(class131.field2735);
        arg1.addMouseMotionListener(class131.field2735);
        arg1.addFocusListener(class131.field2735);
        field3343++;
        if (arg0 != 24849) {
            field3327 = true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II[BII)I")
    public final int method1054(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg0 != 4) {
            this.field3341 = -8;
        }
        field3314++;
        class123.method830(this.field3320, arg3, arg2, arg4, arg1 - arg3);
        return arg1 - arg3;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Lrf;I)I")
    public final int method1055(class163 arg0, int arg1) {
        int var3;
        if (arg0.field3341 < this.field3341) {
            var3 = arg0.field3341;
        } else {
            var3 = this.field3341;
        }
        if (arg1 < 92) {
            this.field3341 = 81;
        }
        field3346++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field3320[var4] & 0xFF) < (arg0.field3320[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field3320[var4] & 0xFF) > (arg0.field3320[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field3341 < arg0.field3341) {
            return -1;
        } else if (arg0.field3341 < this.field3341) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)I")
    public final int method1056(int arg0) {
        field3312++;
        int var2 = 0;
        if (arg0 != -1) {
            this.toString();
        }
        for (int var3 = 0; var3 < this.field3341; var3++) {
            var2 = (var2 << 5) + (this.field3320[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
    public final int method1057(int arg0, int arg1, int arg2) {
        field3300++;
        if (arg0 != -21474) {
            field3324 = null;
        }
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field3341; var5++) {
            if (this.field3320[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)J")
    public final long method1058(int arg0) {
        field3313++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field3341 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field3320[var4];
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
        int var6 = -24 % ((-arg0 - 70) / 35);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "(I)[B")
    public final byte[] method1059(int arg0) {
        if (arg0 < 103) {
            this.toString();
        }
        byte[] var2 = new byte[this.field3341];
        field3307++;
        class123.method830(this.field3320, 0, var2, 0, this.field3341);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "(I)Lrf;")
    public final class163 method1060(int arg0) {
        field3339++;
        class163 var2 = new class163();
        var2.field3341 = this.field3341;
        var2.field3320 = new byte[this.field3341];
        if (arg0 != -18265) {
            field3347 = null;
        }
        for (int var3 = 0; var3 < this.field3341; var3++) {
            byte var4 = this.field3320[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3320[var3] = var4;
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1061(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
