import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 implements class112 {

    @OriginalMember(owner = "client!v", name = "U", descriptor = "Z")
    private boolean field3373 = true;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field3352 = 0;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "Lv;")
    private static class146 field3357 = class159.method1226((byte) -37, "glow3:");

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lv;")
    public static class146 field3333 = field3357;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Lv;")
    public static class146 field3344 = class159.method1226((byte) -37, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Lv;")
    public static class146 field3359 = field3357;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
    public static int[] field3338 = new int[128];

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lv;")
    public static class146 field3366 = class159.method1226((byte) -37, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!v", name = "A", descriptor = "Lv;")
    private static class146 field3353 = class159.method1226((byte) -37, "Select");

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lv;")
    public static class146 field3341 = class159.method1226((byte) -37, "null");

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field3380 = -1;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lv;")
    public static class146 field3334 = field3353;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "I")
    public static int field3386 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    public static int field3388;

    // $FF: synthetic field
    @OriginalMember(owner = "client!v", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field3389;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "[B")
    public byte[] field3365;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
    public static int[] field3376;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
    public final int method1079(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field3327++;
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field3372; var6++) {
            int var7 = this.field3365[var6] & 0xFF;
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
            int var8 = arg1 * var4 + var7;
            if (var8 / arg1 != var4) {
                throw new NumberFormatException();
            }
            var5 = true;
            var4 = var8;
        }
        if (arg0 != -49) {
            return -108;
        } else if (var5) {
            return var4;
        } else {
            throw new NumberFormatException();
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
    public final int method1080(int arg0) {
        if (arg0 != -1) {
            this.method1094(8, null, 20);
        }
        field3328++;
        return this.field3372;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Z")
    public static final boolean method1081(int arg0, int arg1) {
        field3368++;
        if (arg1 != 1957) {
            method1081(111, 20);
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
    private final int method1082(int arg0, int arg1, int arg2) {
        field3378++;
        byte var4 = (byte) arg1;
        int var5 = 114 % ((arg2 - 82) / 35);
        for (int var6 = arg0; var6 < this.field3372; var6++) {
            if (this.field3365[var6] == var4) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lv;")
    public final class146 method1083(int arg0) {
        field3330++;
        if (arg0 != -66) {
            return null;
        }
        class146 var2 = new class146();
        var2.field3372 = this.field3372;
        var2.field3365 = new byte[this.field3372];
        for (int var3 = 0; var3 < this.field3372; var3++) {
            byte var4 = this.field3365[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3365[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Lv;")
    public final class146 method1084(byte arg0) {
        field3329++;
        if (!this.field3373) {
            throw new IllegalArgumentException();
        }
        this.field3375 = 0;
        if (arg0 <= 33) {
            field3376 = null;
        }
        if (this.field3365.length != this.field3372) {
            byte[] var2 = new byte[this.field3372];
            class11.method68(this.field3365, 0, var2, 0, this.field3372);
            this.field3365 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;I)Lv;")
    public final class146 method1085(class146 arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        }
        field3385++;
        if (!this.field3373) {
            throw new IllegalArgumentException();
        }
        this.field3375 = 0;
        if (this.field3365.length < this.field3372 + arg0.field3372) {
            int var3;
            for (var3 = 1; var3 < this.field3372 + arg0.field3372; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class11.method68(this.field3365, 0, var4, 0, this.field3372);
            this.field3365 = var4;
        }
        class11.method68(arg0.field3365, 0, this.field3365, this.field3372, arg0.field3372);
        this.field3372 += arg0.field3372;
        return this;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)I")
    public final int method1086(byte arg0) {
        if (arg0 >= -12) {
            this.hashCode();
        }
        field3370++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3372; var3++) {
            var2 = (this.field3365[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Lv;")
    public final class146 method1087(boolean arg0) {
        field3369++;
        class146 var2 = new class146();
        var2.field3372 = this.field3372;
        var2.field3365 = new byte[this.field3372];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3372; var4++) {
            byte var5 = this.field3365[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field3365[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field3365[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field3365[var4] = var5;
            }
        }
        if (arg0) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
    public final int method1088(int arg0, int arg1) {
        if (arg1 != 29054) {
            field3338 = null;
        }
        field3387++;
        return this.method1082(0, arg0, 118);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)I")
    public final int method1089(int arg0, int arg1) {
        if (arg0 < 72) {
            field3341 = null;
        }
        field3358++;
        return this.field3365[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lv;I)I")
    public final int method1090(class146 arg0, int arg1) {
        if (arg1 != 0) {
            method1081(17, -7);
        }
        field3349++;
        return this.method1094(0, arg0, 0);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)Z")
    public final boolean method1091(int arg0) {
        int var2 = 44 / ((arg0 + 61) / 48);
        field3350++;
        return this.method1108((byte) -112, 10);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLv;)I")
    public final int method1092(byte arg0, class146 arg1) {
        field3339++;
        int var3;
        if (this.field3372 <= arg1.field3372) {
            var3 = this.field3372;
        } else {
            var3 = arg1.field3372;
        }
        if (arg0 != 72) {
            field3334 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class134.field3069[arg1.field3365[var4] & 0xFF] > class134.field3069[this.field3365[var4] & 0xFF]) {
                return -1;
            }
            if (class134.field3069[arg1.field3365[var4] & 0xFF] < class134.field3069[this.field3365[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1.field3372 > this.field3372) {
            return -1;
        } else if (arg1.field3372 < this.field3372) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public final void method1093(Graphics arg0, byte arg1, int arg2, int arg3) {
        field3335++;
        if (arg1 != -6) {
            field3376 = null;
        }
        String var5;
        try {
            var5 = new String(this.field3365, 0, this.field3372, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3365, 0, this.field3372);
        }
        arg0.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILv;I)I")
    private final int method1094(int arg0, class146 arg1, int arg2) {
        int[] var4 = new int[arg1.field3372];
        field3336++;
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field3372];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field3372;
        }
        for (int var8 = 1; var8 <= arg1.field3372; var8++) {
            var4[var8 - 1] = (arg1.field3372 << 1) - var8;
            var5[class90.method711(arg1.field3365[var8 - 1], 255)] = arg1.field3372 - var8;
        }
        int var9 = arg1.field3372 + 1;
        int var10 = arg1.field3372;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field3372 && arg1.field3365[var10 - 1] != arg1.field3365[var9 - 1]) {
                if (var4[var9 - 1] >= arg1.field3372 - var10) {
                    var4[var9 - 1] = arg1.field3372 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = arg0;
        int var12 = 1;
        int var13 = var9;
        int var14 = arg1.field3372 + 1 - var9;
        int var15 = 1;
        while (var14 >= var15) {
            var6[var15 - 1] = var11;
            while (var11 >= 1 && arg1.field3365[var11 - 1] != arg1.field3365[var15 - 1]) {
                var11 = var6[var11 - 1];
            }
            var15++;
            var11++;
        }
        while (arg1.field3372 > var13) {
            for (int var18 = var12; var18 <= var13; var18++) {
                if (var4[var18 - 1] >= arg1.field3372 + var13 - var18) {
                    var4[var18 - 1] = arg1.field3372 + var13 - var18;
                }
            }
            var12 = var13 + 1;
            var13 += var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var17;
        for (int var16 = arg1.field3372 + arg2 - 1; var16 < this.field3372; var16 += Math.max(var5[this.field3365[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field3372 - 1; var17 >= 0 && this.field3365[var16] == arg1.field3365[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)[B")
    public final byte[] method1095(byte arg0) {
        field3351++;
        if (arg0 >= -49) {
            return null;
        } else {
            byte[] var2 = new byte[this.field3372];
            class11.method68(this.field3365, 0, var2, 0, this.field3372);
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Lv;")
    public final class146 method1096(byte arg0, int arg1) {
        field3343++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class146 var3 = new class146();
        if (arg0 > -6) {
            return null;
        }
        var3.field3365 = new byte[this.field3372 + 1];
        var3.field3372 = this.field3372 + 1;
        class11.method68(this.field3365, 0, var3.field3365, 0, this.field3372);
        var3.field3365[this.field3372] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BLv;)Z")
    public final boolean method1097(byte arg0, class146 arg1) {
        field3354++;
        if (this.field3372 < arg1.field3372) {
            return false;
        }
        if (arg0 != 103) {
            this.method1087(false);
        }
        int var3 = this.field3372 - arg1.field3372;
        for (int var4 = 0; var4 < arg1.field3372; var4++) {
            if (this.field3365[var3 + var4] != arg1.field3365[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;Z)Z")
    public final boolean method1098(class146 arg0, boolean arg1) {
        field3355++;
        if (this.field3372 < arg0.field3372) {
            return false;
        }
        if (!arg1) {
            this.method1096((byte) 101, -72);
        }
        for (int var3 = 0; var3 < arg0.field3372; var3++) {
            if (this.field3365[var3] != arg0.field3365[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        field3353 = null;
        field3366 = null;
        field3376 = null;
        int var1 = -21 / ((-arg0 - 59) / 58);
        field3338 = null;
        field3357 = null;
        field3341 = null;
        field3334 = null;
        field3333 = null;
        field3344 = null;
        field3359 = null;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lv;")
    public final class146 method1100(int arg0) {
        int var2 = 17 % ((arg0 - 4) / 50);
        class146 var3 = new class146();
        var3.field3372 = this.field3372;
        byte var4 = 2;
        var3.field3365 = new byte[this.field3372];
        field3379++;
        for (int var5 = 0; var5 < this.field3372; var5++) {
            byte var6 = this.field3365[var5];
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
            var3.field3365[var5] = var6;
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)J")
    public final long method1101(int arg0) {
        field3367++;
        int var2 = 78 % ((53 - arg0) / 57);
        long var3 = 0L;
        for (int var5 = 0; this.field3372 > var5 && var5 < 12; var5++) {
            var3 *= 37L;
            byte var6 = this.field3365[var5];
            if (var6 >= 65 && var6 <= 90) {
                var3 += var6 + 1 - 65;
            } else if (var6 >= 97 && var6 <= 122) {
                var3 += var6 - 96;
            } else if (var6 >= 48 && var6 <= 57) {
                var3 += var6 + 27 - 48;
            }
        }
        while (var3 % 37L == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3360++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Lv;")
    public final class146 method1102(int arg0) {
        field3374++;
        class146 var2 = new class146();
        var2.field3372 = this.field3372;
        var2.field3365 = new byte[this.field3372];
        for (int var3 = arg0; var3 < this.field3372; var3++) {
            var2.field3365[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lv;")
    public final class146 method1103(boolean arg0, int arg1) {
        if (arg0) {
            field3348++;
            return this.method1105(this.field3372, -89, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method1104(int arg0, FontMetrics arg1) {
        field3362++;
        String var3;
        try {
            var3 = new String(this.field3365, 0, this.field3372, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3365, 0, this.field3372);
        }
        if (arg0 != 24812) {
            this.method1089(-39, 71);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Lv;")
    public final class146 method1105(int arg0, int arg1, int arg2) {
        class146 var4 = new class146();
        var4.field3365 = new byte[arg0 - arg2];
        var4.field3372 = arg0 - arg2;
        int var5 = 73 / ((23 - arg1) / 57);
        class11.method68(this.field3365, arg2, var4.field3365, 0, var4.field3372);
        field3346++;
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLv;)I")
    public final int method1106(boolean arg0, class146 arg1) {
        int var3;
        if (this.field3372 <= arg1.field3372) {
            var3 = this.field3372;
        } else {
            var3 = arg1.field3372;
        }
        field3332++;
        if (arg0) {
            this.field3372 = 62;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field3365[var4] & 0xFF) > (this.field3365[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field3365[var4] & 0xFF) > (arg1.field3365[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field3372 < arg1.field3372) {
            return -1;
        } else if (arg1.field3372 < this.field3372) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(BLv;)Z")
    public final boolean method1107(byte arg0, class146 arg1) {
        field3347++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 > -75) {
            field3386 = -43;
        }
        if (this.field3372 != arg1.field3372) {
            return false;
        }
        if (!this.field3373 || !arg1.field3373) {
            if (this.field3375 == 0) {
                this.field3375 = this.method1086((byte) -120);
                if (this.field3375 == 0) {
                    this.field3375 = 1;
                }
            }
            if (arg1.field3375 == 0) {
                arg1.field3375 = arg1.method1086((byte) -71);
                if (arg1.field3375 == 0) {
                    arg1.field3375 = 1;
                }
            }
            if (this.field3375 != arg1.field3375) {
                return false;
            }
        }
        for (int var3 = 0; var3 < this.field3372; var3++) {
            if (this.field3365[var3] != arg1.field3365[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BI)Z")
    private final boolean method1108(byte arg0, int arg1) {
        field3381++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != -112) {
            field3344 = null;
        }
        for (int var6 = 0; var6 < this.field3372; var6++) {
            int var7 = this.field3365[var6] & 0xFF;
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
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Lv;")
    public final class146 method1109(int arg0) {
        long var2 = this.method1110((byte) -58);
        field3361++;
        synchronized (field3389 == null ? (field3389 = method1120("v")) : field3389) {
            if (class58.field1295 == null) {
                class58.field1295 = new class48(4096);
            } else {
                for (class8 var5 = (class8) class58.field1295.method332((byte) -79, var2); var5 != null; var5 = (class8) class58.field1295.method335((byte) -10)) {
                    if (this.method1107((byte) -107, var5.field158)) {
                        return var5.field158;
                    }
                }
            }
            if (arg0 != 4096) {
                method1081(57, -38);
            }
            class8 var7 = new class8();
            this.field3373 = false;
            var7.field158 = this;
            class58.field1295.method336(var2, var7, arg0 ^ 0xFFFFCD3D);
            return this;
        }
    }

    @OriginalMember(owner = "client!v", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3377++;
        if (!(arg0 instanceof class146)) {
            throw new IllegalArgumentException();
        }
        return this.method1107((byte) -90, (class146) arg0);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)J")
    private final long method1110(byte arg0) {
        field3382++;
        long var2 = 0L;
        int var4 = 110 / ((19 - arg0) / 63);
        for (int var5 = 0; var5 < this.field3372; var5++) {
            var2 = (var2 << 5) + (long) (this.field3365[var5] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Lv;I)Z")
    public final boolean method1111(class146 arg0, int arg1) {
        field3345++;
        if (arg0 == null) {
            return false;
        } else if (this.field3372 != arg0.field3372) {
            return false;
        } else if (arg1 == -41) {
            for (int var3 = 0; var3 < this.field3372; var3++) {
                byte var4 = this.field3365[var3];
                byte var5 = arg0.field3365[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
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

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(B)Lv;")
    public final class146 method1112(byte arg0) {
        field3384++;
        int var2;
        for (var2 = 0; this.field3372 > var2 && (this.field3365[var2] >= 0 && this.field3365[var2] <= 32 || (this.field3365[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field3372; var3 > var2 && (this.field3365[var3 - 1] >= 0 && this.field3365[var3 - 1] <= 32 || (this.field3365[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field3372 == var3) {
            return this;
        }
        class146 var4 = new class146();
        var4.field3372 = var3 - var2;
        var4.field3365 = new byte[var4.field3372];
        if (arg0 >= -93) {
            return null;
        } else {
            for (int var5 = 0; var5 < var4.field3372; var5++) {
                var4.field3365[var5] = this.field3365[var2 + var5];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)I")
    public final int method1113(int arg0) {
        field3371++;
        if (arg0 != 10) {
            this.method1086((byte) 34);
        }
        return this.method1079(arg0 ^ 0xFFFFFFC5, 10);
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Lv;")
    public final class146 method1114(int arg0) {
        int var2 = 0;
        field3340++;
        class146 var3 = new class146();
        var3.field3372 = 0;
        if (arg0 >= -126) {
            return null;
        }
        var3.field3365 = new byte[12];
        for (int var4 = 0; var4 < this.field3372; var4++) {
            if (this.field3365[var4] >= 65 && this.field3365[var4] <= 90) {
                var3.field3365[var2++] = (byte) (this.field3365[var4] + 97 - 65);
                var3.field3372 = var2;
            } else if (this.field3365[var4] >= 97 && this.field3365[var4] <= 122 || this.field3365[var4] >= 48 && this.field3365[var4] <= 57) {
                var3.field3365[var2++] = this.field3365[var4];
                var3.field3372 = var2;
            } else if (var2 > 0) {
                var3.field3365[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BIII)I")
    public final int method1115(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        field3342++;
        if (arg4 != 13290) {
            field3344 = null;
        }
        class11.method68(this.field3365, arg2, arg1, arg0, arg3 - arg2);
        return arg3 - arg2;
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "(I)Ljava/net/URL;")
    public final URL method1116(int arg0) throws MalformedURLException {
        field3388++;
        return arg0 >= -73 ? null : new URL(new String(this.field3365, 0, this.field3372));
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(BI)Lv;")
    public final class146 method1117(byte arg0, int arg1) {
        field3337++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field3373) {
            this.field3375 = 0;
            if (this.field3365.length == this.field3372) {
                int var3;
                for (var3 = 1; var3 <= this.field3372; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class11.method68(this.field3365, 0, var4, 0, this.field3372);
                this.field3365 = var4;
            }
            if (arg0 == -31) {
                this.field3365[this.field3372++] = (byte) arg1;
                return this;
            } else {
                return null;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!v", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3331++;
        return this.method1086((byte) -107);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)I")
    public static final int method1118(int arg0, byte arg1) {
        field3363++;
        return arg1 >= -87 ? 95 : arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1119(Component arg0, int arg1) {
        if (arg1 != -39) {
            field3353 = null;
        }
        field3364++;
        arg0.addMouseListener(class110.field2601);
        arg0.addMouseMotionListener(class110.field2601);
        arg0.addFocusListener(class110.field2601);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1120(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
