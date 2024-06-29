import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class173 implements class53 {

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Z")
    private boolean field3417 = true;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lrd;")
    public static class173 field3370 = class133.method843("(Y", 34);

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[[I")
    public static int[][] field3373 = new int[104][104];

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Lrd;")
    public static class173 field3398 = class133.method843("(U4", -123);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    private int field3380;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    public static int field3419;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field3420;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "[B")
    public byte[] field3415;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[Ldh;")
    public static class39[] field3368;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lrd;")
    public final class173 method1116(byte arg0) {
        field3407++;
        long var2 = this.method1118(22743);
        synchronized (field3420 == null ? (field3420 = method1161("rd")) : field3420) {
            if (class159.field2977 == null) {
                class159.field2977 = new class112(4096);
            } else {
                for (class175 var5 = (class175) class159.field2977.method677(-2755, var2); var5 != null; var5 = (class175) class159.field2977.method676((byte) -41)) {
                    if (this.method1128(false, var5.field3445)) {
                        return var5.field3445;
                    }
                }
            }
            class175 var7 = new class175();
            var7.field3445 = this;
            this.field3417 = false;
            class159.field2977.method675(var2, var7, false);
        }
        if (arg0 >= -25) {
            this.field3379 = -35;
        }
        return this;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JIIZ)Lrd;")
    public static final class173 method1117(long arg0, int arg1, int arg2, boolean arg3) {
        field3366++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 == -1) {
            long var5 = arg0 / (long) arg2;
            int var7 = 1;
            while (var5 != 0L) {
                var7++;
                var5 /= arg2;
            }
            int var8 = var7;
            if (arg0 < 0L || arg3) {
                var8 = var7 + 1;
            }
            byte[] var9 = new byte[var8];
            if (arg0 < 0L) {
                var9[0] = 45;
            } else if (arg3) {
                var9[0] = 43;
            }
            for (int var10 = 0; var10 < var7; var10++) {
                int var12 = (int) (arg0 % (long) arg2);
                arg0 /= arg2;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 9) {
                    var12 += 39;
                }
                var9[var8 - var10 - 1] = (byte) (var12 + 48);
            }
            class173 var11 = new class173();
            var11.field3379 = var8;
            var11.field3415 = var9;
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)J")
    private final long method1118(int arg0) {
        field3394++;
        if (arg0 != 22743) {
            return -9L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field3379; var4++) {
            var2 = (var2 << 5) + (long) (this.field3415[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLrd;)I")
    public final int method1119(int arg0, byte arg1, class173 arg2) {
        field3412++;
        int[] var4 = new int[arg2.field3379];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field3379];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field3379;
        }
        for (int var8 = 1; var8 <= arg2.field3379; var8++) {
            var4[var8 - 1] = (arg2.field3379 << 1) - var8;
            var5[class209.method1383(arg2.field3415[var8 - 1], 255)] = arg2.field3379 - var8;
        }
        int var9 = arg2.field3379 + 1;
        int var10 = arg2.field3379;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field3379 && arg2.field3415[var9 - 1] != arg2.field3415[var10 - 1]) {
                if (arg2.field3379 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field3379 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field3379 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        if (arg1 < 109) {
            this.field3415 = null;
        }
        int var15 = 1;
        while (var15 <= var12) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field3415[var14 - 1] != arg2.field3415[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (arg2.field3379 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (arg2.field3379 + var11 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = arg2.field3379 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 += var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg0 + arg2.field3379 - 1; var16 < this.field3379; var16 += Math.max(var5[this.field3415[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field3379 - 1; var17 >= 0 && this.field3415[var16] == arg2.field3415[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I")
    public final int method1120(byte arg0, int arg1) {
        field3374++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != 44) {
            field3368 = null;
        }
        for (int var6 = 0; var6 < this.field3379; var6++) {
            int var7 = this.field3415[var6] & 0xFF;
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
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/applet/Applet;B)V")
    public final void method1121(Applet arg0, byte arg1) throws Throwable {
        field3382++;
        if (arg1 == -1) {
            String var3 = new String(this.field3415, 0, this.field3379);
            class86.method557(arg0, (byte) 72, var3);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Lrd;")
    public final class173 method1122(int arg0) {
        field3406++;
        int var2 = this.field3379;
        int var3;
        for (var3 = 0; this.field3379 > var3 && (this.field3415[var3] >= 0 && this.field3415[var3] <= 32 || (this.field3415[var3] & 0xFF) == 160); var3++) {
        }
        while (var2 > var3 && (this.field3415[var2 - 1] >= 0 && this.field3415[var2 - 1] <= 32 || (this.field3415[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field3379 == var2) {
            return this;
        }
        int var4 = 0 / ((arg0 - 43) / 55);
        class173 var5 = new class173();
        var5.field3379 = var2 - var3;
        var5.field3415 = new byte[var5.field3379];
        for (int var6 = 0; var6 < var5.field3379; var6++) {
            var5.field3415[var6] = this.field3415[var3 + var6];
        }
        return var5;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILrd;)Z")
    public final boolean method1123(int arg0, class173 arg1) {
        int var3 = 60 % ((-arg0 - 62) / 61);
        field3372++;
        if (arg1 == null) {
            return false;
        } else if (this.field3379 == arg1.field3379) {
            for (int var4 = 0; var4 < this.field3379; var4++) {
                byte var5 = this.field3415[var4];
                byte var6 = arg1.field3415[var4];
                if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                    var6 = (byte) (var6 + 32);
                }
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lrd;B)I")
    public final int method1124(class173 arg0, byte arg1) {
        field3397++;
        int var3;
        if (arg0.field3379 < this.field3379) {
            var3 = arg0.field3379;
        } else {
            var3 = this.field3379;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class131.field2478[this.field3415[var4] & 0xFF] < class131.field2478[arg0.field3415[var4] & 0xFF]) {
                return -1;
            }
            if (class131.field2478[this.field3415[var4] & 0xFF] > class131.field2478[arg0.field3415[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0.field3379 > this.field3379) {
            return -1;
        } else if (this.field3379 > arg0.field3379) {
            return 1;
        } else {
            if (arg1 != 46) {
                this.method1159(-120);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lrd;")
    public final class173 method1125(int arg0, int arg1) {
        field3387++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class173 var3 = new class173();
        var3.field3415 = new byte[this.field3379 + 1];
        var3.field3379 = this.field3379 + 1;
        class85.method553(this.field3415, 0, var3.field3415, 0, this.field3379);
        var3.field3415[this.field3379] = (byte) arg1;
        if (arg0 < 40) {
            this.field3417 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3389++;
        return this.method1136(false);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Ljava/applet/Applet;B)Lrd;")
    public final class173 method1126(Applet arg0, byte arg1) {
        field3378++;
        if (arg1 < 41) {
            field3373 = null;
        }
        String var3 = new String(this.field3415, 0, this.field3379);
        String var4 = arg0.getParameter(var3);
        return var4 == null ? null : class56.method364(0, var4);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lrd;")
    public final class173 method1127(int arg0, int arg1) {
        field3402++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (arg1 != 241) {
            return null;
        } else if (this.field3417) {
            this.field3380 = 0;
            if (this.field3415.length == this.field3379) {
                int var3;
                for (var3 = 1; var3 <= this.field3379; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class85.method553(this.field3415, 0, var4, 0, this.field3379);
                this.field3415 = var4;
            }
            this.field3415[this.field3379++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLrd;)Z")
    public final boolean method1128(boolean arg0, class173 arg1) {
        field3371++;
        if (arg1 == null) {
            return false;
        } else if (this.field3379 == arg1.field3379) {
            if (!this.field3417 || !arg1.field3417) {
                if (this.field3380 == 0) {
                    this.field3380 = this.method1136(false);
                    if (this.field3380 == 0) {
                        this.field3380 = 1;
                    }
                }
                if (arg1.field3380 == 0) {
                    arg1.field3380 = arg1.method1136(false);
                    if (arg1.field3380 == 0) {
                        arg1.field3380 = 1;
                    }
                }
                if (this.field3380 != arg1.field3380) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field3379; var3++) {
                if (this.field3415[var3] != arg1.field3415[var3]) {
                    return false;
                }
            }
            if (arg0) {
                field3370 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Ljava/net/URL;")
    public final URL method1129(byte arg0) throws MalformedURLException {
        if (arg0 == 64) {
            field3395++;
            return new URL(new String(this.field3415, 0, this.field3379));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Lrd;")
    public final class173 method1130(boolean arg0) {
        field3403++;
        if (!arg0) {
            return null;
        } else if (this.field3417) {
            this.field3380 = 0;
            if (this.field3415.length != this.field3379) {
                byte[] var2 = new byte[this.field3379];
                class85.method553(this.field3415, 0, var2, 0, this.field3379);
                this.field3415 = var2;
            }
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILrd;)Z")
    public final boolean method1131(int arg0, class173 arg1) {
        field3386++;
        if (arg1.field3379 > this.field3379) {
            return false;
        } else if (arg0 < 122) {
            return true;
        } else {
            int var3 = this.field3379 - arg1.field3379;
            for (int var4 = 0; var4 < arg1.field3379; var4++) {
                if (this.field3415[var3 + var4] != arg1.field3415[var4]) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)J")
    public final long method1132(int arg0) {
        field3411++;
        if (arg0 <= 99) {
            return 118L;
        }
        long var2 = 0L;
        for (int var4 = 0; this.field3379 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field3415[var4];
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

    @OriginalMember(owner = "client!rd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3396++;
        if (!(arg0 instanceof class173)) {
            throw new IllegalArgumentException();
        }
        return this.method1128(false, (class173) arg0);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(ILrd;)I")
    public final int method1133(int arg0, class173 arg1) {
        field3419++;
        if (arg0 > -97) {
            this.method1134(null, (byte) 39);
        }
        int var3;
        if (this.field3379 > arg1.field3379) {
            var3 = arg1.field3379;
        } else {
            var3 = this.field3379;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((this.field3415[var4] & 0xFF) < (arg1.field3415[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field3415[var4] & 0xFF) < (this.field3415[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field3379 > this.field3379) {
            return -1;
        } else if (arg1.field3379 < this.field3379) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/FontMetrics;B)I")
    public final int method1134(FontMetrics arg0, byte arg1) {
        field3383++;
        int var3 = -96 / (arg1 / 53);
        String var4;
        try {
            var4 = new String(this.field3415, 0, this.field3379, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var4 = new String(this.field3415, 0, this.field3379);
        }
        return arg0.stringWidth(var4);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)[B")
    public final byte[] method1135(byte arg0) {
        byte[] var2 = new byte[this.field3379];
        class85.method553(this.field3415, 0, var2, 0, this.field3379);
        field3384++;
        if (arg0 > -11) {
            this.field3415 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)I")
    public final int method1136(boolean arg0) {
        field3392++;
        int var2 = 0;
        if (arg0) {
            this.method1145((byte) 71, null);
        }
        for (int var3 = 0; var3 < this.field3379; var3++) {
            var2 = (var2 << 5) + (this.field3415[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILmb;)V")
    public static final void method1137(int arg0, class121 arg1) {
        field3376++;
        if (arg0 >= -88) {
            method1158(-62, null);
        }
        byte[] var2 = new byte[24];
        if (class219.field4217 != null) {
            try {
                int var3 = 0;
                class219.field4217.method1002(0L, -1837);
                class219.field4217.method1003((byte) -52, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method738(24, var2, 0, (byte) -47);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static final void method1138(int arg0) {
        int var1 = 66 / ((-arg0 - 62) / 51);
        field3390++;
        if (!class182.field3582) {
            return;
        }
        class165 var2 = class29.method231(class131.field2475, class42.field864, -1);
        if (var2 != null && var2.field3167 != null) {
            class117 var3 = new class117();
            var3.field2174 = var2.field3167;
            var3.field2155 = var2;
            class189.method1265(-3256, var3);
        }
        class182.field3582 = false;
        class209.method1379(1, var2);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field3398 = null;
        field3373 = null;
        if (arg0 != -87) {
            method1138(-48);
        }
        field3368 = null;
        field3370 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lrd;")
    public final class173 method1140(int arg0, byte arg1) {
        if (arg1 < 110) {
            return null;
        } else {
            field3381++;
            return this.method1155(arg0, this.field3379, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)Lrd;")
    public final class173 method1141(int arg0) {
        field3388++;
        class173 var2 = new class173();
        var2.field3379 = this.field3379;
        int var3 = -38 / ((arg0 - 49) / 39);
        var2.field3415 = new byte[this.field3379];
        for (int var4 = 0; var4 < this.field3379; var4++) {
            var2.field3415[var4] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)Lrd;")
    public final class173 method1142(int arg0) {
        field3418++;
        class173 var2 = new class173();
        boolean var3 = true;
        var2.field3379 = this.field3379;
        var2.field3415 = new byte[this.field3379];
        for (int var4 = 0; var4 < this.field3379; var4++) {
            byte var5 = this.field3415[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field3415[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field3415[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field3415[var4] = var5;
            }
        }
        if (arg0 != -98) {
            this.method1118(92);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1143(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 < 23) {
            return;
        }
        String var5;
        try {
            var5 = new String(this.field3415, 0, this.field3379, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3415, 0, this.field3379);
        }
        field3375++;
        arg3.drawString(var5, arg2, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3413++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BIIBI)I")
    public final int method1144(byte[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        class85.method553(this.field3415, arg2, arg0, arg1, arg4 - arg2);
        if (arg3 != 30) {
            this.method1157(null, false);
        }
        field3404++;
        return arg4 - arg2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLrd;)Lrd;")
    public final class173 method1145(byte arg0, class173 arg1) {
        field3369++;
        if (!this.field3417) {
            throw new IllegalArgumentException();
        }
        this.field3380 = 0;
        if (this.field3415.length < this.field3379 + arg1.field3379) {
            int var3;
            for (var3 = 1; var3 < this.field3379 + arg1.field3379; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class85.method553(this.field3415, 0, var4, 0, this.field3379);
            this.field3415 = var4;
        }
        int var5 = 82 % ((arg0 + 70) / 33);
        class85.method553(arg1.field3415, 0, this.field3415, this.field3379, arg1.field3379);
        this.field3379 += arg1.field3379;
        return this;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Lrd;")
    public final class173 method1146(byte arg0) {
        field3416++;
        class173 var2 = new class173();
        var2.field3379 = this.field3379;
        var2.field3415 = new byte[this.field3379];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field3379; var4++) {
            byte var5 = this.field3415[var4];
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
            var2.field3415[var4] = var5;
        }
        if (arg0 >= -52) {
            this.equals(null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I")
    public final int method1147(int arg0, int arg1) {
        if (arg0 != 7028) {
            this.method1142(-79);
        }
        field3410++;
        return this.field3415[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
    public static final void method1148(long arg0, int arg1) {
        try {
            if (arg1 != 0) {
                field3368 = null;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field3414++;
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)Z")
    public final boolean method1149(byte arg0) {
        if (arg0 > -9) {
            method1139((byte) 46);
        }
        field3391++;
        return this.method1150((byte) -36, 10);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)Z")
    private final boolean method1150(byte arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field3393++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != -36) {
            return false;
        }
        for (int var6 = 0; var6 < this.field3379; var6++) {
            int var7 = this.field3415[var6] & 0xFF;
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
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var3 = true;
            var5 = var8;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lrd;Z)I")
    public final int method1151(class173 arg0, boolean arg1) {
        field3385++;
        if (arg1) {
            field3373 = null;
        }
        return this.method1119(0, (byte) 121, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public static final void method1152(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field1972; var4++) {
            class5 var5 = var3.field1948[var4];
            if ((var5.field123 >> 29 & 0x3L) == 2L && var5.field120 == arg1 && var5.field125 == arg2) {
                class71.method431(var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)I")
    public final int method1153(byte arg0) {
        if (arg0 > -126) {
            method1152(86, -10, -53);
        }
        field3401++;
        return this.field3379;
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
    public final int method1154(int arg0) {
        field3400++;
        if (arg0 <= 14) {
            field3373 = null;
        }
        return this.method1120((byte) 44, 10);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)Lrd;")
    public final class173 method1155(int arg0, int arg1, byte arg2) {
        field3367++;
        if (arg2 <= 74) {
            return null;
        }
        class173 var4 = new class173();
        var4.field3379 = arg1 - arg0;
        var4.field3415 = new byte[arg1 - arg0];
        class85.method553(this.field3415, arg0, var4.field3415, 0, var4.field3379);
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)Lrd;")
    public final class173 method1156(int arg0) {
        field3377++;
        class173 var2 = new class173();
        var2.field3379 = this.field3379;
        var2.field3415 = new byte[this.field3379];
        for (int var3 = 0; var3 < this.field3379; var3++) {
            byte var4 = this.field3415[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3415[var3] = var4;
        }
        if (arg0 != -91) {
            method1158(82, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lrd;Z)Z")
    public final boolean method1157(class173 arg0, boolean arg1) {
        field3408++;
        if (arg1) {
            this.method1119(104, (byte) -3, null);
        }
        if (this.field3379 < arg0.field3379) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field3379; var3++) {
            if (this.field3415[var3] != arg0.field3415[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[Lrd;)Lrd;")
    public static final class173 method1158(int arg0, class173[] arg1) {
        field3399++;
        if (arg0 < ~arg1.length) {
            throw new IllegalArgumentException();
        }
        return class120.method728(0, arg1, arg1.length, 124);
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)Lrd;")
    public final class173 method1159(int arg0) {
        field3409++;
        class173 var2 = class22.method185(-23750, this.method1132(101));
        if (arg0 == 0) {
            return var2 == null ? class181.field3555 : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)I")
    public final int method1160(int arg0, int arg1, int arg2) {
        field3405++;
        byte var4 = (byte) arg0;
        int var5 = arg1;
        if (arg2 != -1) {
            return -14;
        }
        while (this.field3379 > var5) {
            if (this.field3415[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1161(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
