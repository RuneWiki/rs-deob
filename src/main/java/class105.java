import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class105 implements class25 {

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Z")
    private boolean field2389 = true;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2380 = 0;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lrc;")
    public static class105 field2396 = class43.method374("invback", 0);

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lrc;")
    public static class105 field2378 = class43.method374("Hier klicken)1 um fortzufahren)3)3)3", 0);

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Lrc;")
    public static class105 field2386 = null;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    private int field2413;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Lfc;")
    public static class34 field2409;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "Ljava/awt/Image;")
    public static Image field2388;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field2425;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "[B")
    public byte[] field2417;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method865(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)Lrc;", line = 8)
    public final class105 method826(boolean arg0) {
        int var2 = 0;
        field2405++;
        class105 var3 = new class105();
        var3.field2383 = 0;
        var3.field2417 = new byte[12];
        if (arg0) {
            field2378 = null;
        }
        for (int var4 = 0; var4 < this.field2383; var4++) {
            if (this.field2417[var4] >= 65 && this.field2417[var4] <= 90) {
                var3.field2417[var2++] = (byte) (this.field2417[var4] + 32);
                var3.field2383 = var2;
            } else if (this.field2417[var4] >= 97 && this.field2417[var4] <= 122 || this.field2417[var4] >= 48 && this.field2417[var4] <= 57) {
                var3.field2417[var2++] = this.field2417[var4];
                var3.field2383 = var2;
            } else if (var2 > 0) {
                var3.field2417[var2++] = 95;
            }
            if (var2 == 12) {
                break;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I", line = 63)
    private final int method827(int arg0, int arg1, int arg2) {
        field2406++;
        byte var4 = (byte) arg1;
        for (int var5 = arg2; var5 < this.field2383; var5++) {
            if (this.field2417[var5] == var4) {
                return var5;
            }
        }
        if (arg0 >= -118) {
            method832(-126, -61, 13, (byte) 124, null, null, -37);
        }
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)J", line = 91)
    public final long method828(int arg0) {
        field2379++;
        if (arg0 != 455) {
            return 50L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2383 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2417[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "toString", descriptor = "()Ljava/lang/String;", line = 132)
    public final String toString() {
        field2393++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLrc;)Z", line = 150)
    public final boolean method829(boolean arg0, class105 arg1) {
        field2385++;
        if (arg1 == null) {
            return false;
        } else if (this.field2383 == arg1.field2383) {
            if (!this.field2389 || !arg1.field2389) {
                if (this.field2413 == 0) {
                    this.field2413 = this.method853(0);
                    if (this.field2413 == 0) {
                        this.field2413 = 1;
                    }
                }
                if (arg1.field2413 == 0) {
                    arg1.field2413 = arg1.method853(0);
                    if (arg1.field2413 == 0) {
                        arg1.field2413 = 1;
                    }
                }
                if (this.field2413 != arg1.field2413) {
                    return false;
                }
            }
            if (!arg0) {
                return true;
            }
            for (int var3 = 0; var3 < this.field2383; var3++) {
                if (this.field2417[var3] != arg1.field2417[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 215)
    public final void method830(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -30874) {
            field2386 = null;
        }
        field2399++;
        String var5;
        try {
            var5 = new String(this.field2417, 0, this.field2383, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field2417, 0, this.field2383);
        }
        arg1.drawString(var5, arg2, arg3);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lrc;I)Z", line = 246)
    public final boolean method831(class105 arg0, int arg1) {
        if (arg1 != -21607) {
            return true;
        }
        field2384++;
        if (arg0 == null) {
            return false;
        } else if (this.field2383 == arg0.field2383) {
            for (int var3 = 0; var3 < this.field2383; var3++) {
                byte var4 = arg0.field2417[var3];
                byte var5 = this.field2417[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
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

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIBLrc;Lrc;I)V", line = 297)
    public static final void method832(int arg0, int arg1, int arg2, byte arg3, class105 arg4, class105 arg5, int arg6) {
        if (arg3 < 119) {
            return;
        }
        field2414++;
        if (class113.field2652 >= 500) {
            return;
        }
        if (arg4.method863(-121) <= 0) {
            class95.field2197[class113.field2652] = arg5;
        } else {
            class95.field2197[class113.field2652] = class108.method878(new class105[] { arg5, class67.field1525, arg4 }, 2867);
        }
        class15.field298[class113.field2652] = arg0;
        class67.field1521[class113.field2652] = arg2;
        class128.field3104[class113.field2652] = arg6;
        class96.field2225[class113.field2652] = arg1;
        class113.field2652++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I", line = 328)
    public final int method833(byte arg0) {
        if (arg0 > -38) {
            this.field2389 = true;
        }
        field2422++;
        return this.method851(122, 10);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLrc;)I", line = 340)
    public final int method834(byte arg0, class105 arg1) {
        if (arg0 <= 124) {
            this.method836(-106, (byte) -75);
        }
        field2404++;
        return this.method847(-92, 0, arg1);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Lrc;", line = 362)
    public final class105 method835(byte arg0) {
        class105 var2 = new class105();
        field2392++;
        int var3 = 61 / ((arg0 + 81) / 44);
        boolean var4 = true;
        var2.field2383 = this.field2383;
        var2.field2417 = new byte[this.field2383];
        for (int var5 = 0; var5 < this.field2383; var5++) {
            byte var6 = this.field2417[var5];
            if (var6 >= 97 && var6 <= 122 || !(var6 < -32 || var6 > -2 || var6 == -9)) {
                if (var4) {
                    var6 = (byte) (var6 - 32);
                }
                var4 = false;
            } else if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
                if (!var4) {
                    var6 = (byte) (var6 + 32);
                }
                var4 = false;
            }
            if (var6 == 46 || var6 == 33 || var6 == 63) {
                var4 = true;
            }
            var2.field2417[var5] = var6;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lrc;", line = 412)
    public final class105 method836(int arg0, byte arg1) {
        if (arg1 > -125) {
            this.method838(true);
        }
        field2374++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field2389) {
            this.field2413 = 0;
            if (this.field2417.length == this.field2383) {
                int var3;
                for (var3 = 1; var3 <= this.field2383; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class82.method697(this.field2417, 0, var4, 0, this.field2383);
                this.field2417 = var4;
            }
            this.field2417[this.field2383++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IB)I", line = 460)
    public final int method837(int arg0, byte arg1) {
        if (arg1 == 59) {
            field2403++;
            return this.field2417[arg0] & 0xFF;
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)Lrc;", line = 471)
    public final class105 method838(boolean arg0) {
        field2391++;
        class105 var2 = new class105();
        var2.field2383 = this.field2383;
        var2.field2417 = new byte[this.field2383];
        for (int var3 = 0; var3 < this.field2383; var3++) {
            var2.field2417[var3] = 42;
        }
        if (!arg0) {
            field2386 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Lrc;", line = 507)
    public final class105 method839(int arg0) {
        field2407++;
        if (!this.field2389) {
            throw new IllegalArgumentException();
        }
        this.field2413 = 0;
        if (this.field2417.length != this.field2383) {
            byte[] var2 = new byte[this.field2383];
            class82.method697(this.field2417, 0, var2, 0, this.field2383);
            this.field2417 = var2;
        }
        return arg0 > -46 ? null : this;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z", line = 539)
    private final boolean method840(int arg0, int arg1) {
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field2415++;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2383; var6++) {
            int var7 = this.field2417[var6] & 0xFF;
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
            if (var7 >= arg1) {
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
        if (arg0 != 37) {
            field2386 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 616)
    public final int method841(int arg0, FontMetrics arg1) {
        field2420++;
        String var3;
        try {
            var3 = new String(this.field2417, 0, this.field2383, "ISO-8859-1");
            if (arg0 <= 110) {
                this.method839(-120);
            }
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field2417, 0, this.field2383);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lrc;B)Lrc;", line = 635)
    public final class105 method842(class105 arg0, byte arg1) {
        field2397++;
        if (arg1 != 20) {
            return null;
        } else if (this.field2389) {
            this.field2413 = 0;
            if (this.field2417.length < this.field2383 + arg0.field2383) {
                int var3;
                for (var3 = 1; var3 < this.field2383 + arg0.field2383; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class82.method697(this.field2417, 0, var4, 0, this.field2383);
                this.field2417 = var4;
            }
            class82.method697(arg0.field2417, 0, this.field2417, this.field2383, arg0.field2383);
            this.field2383 += arg0.field2383;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "hashCode", descriptor = "()I", line = 670)
    public final int hashCode() {
        field2408++;
        return this.method853(0);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Lrc;", line = 678)
    public final class105 method843(int arg0) {
        field2376++;
        int var2 = this.field2383;
        int var3;
        for (var3 = 0; this.field2383 > var3 && (this.field2417[var3] >= 0 && this.field2417[var3] <= 32 || (this.field2417[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field2417[var2 - 1] >= 0 && this.field2417[var2 - 1] <= 32 || (this.field2417[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field2383 == var2) {
            return this;
        }
        class105 var4 = new class105();
        var4.field2383 = var2 - var3;
        if (arg0 != 32) {
            this.method845((byte) -81);
        }
        var4.field2417 = new byte[var4.field2383];
        for (int var5 = 0; var5 < var4.field2383; var5++) {
            var4.field2417[var5] = this.field2417[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Lrc;", line = 713)
    public final class105 method844(int arg0) {
        field2400++;
        boolean var2 = true;
        if (arg0 != 21975) {
            field2396 = null;
        }
        class105 var3 = new class105();
        var3.field2383 = this.field2383;
        var3.field2417 = new byte[this.field2383];
        for (int var4 = 0; var4 < this.field2383; var4++) {
            byte var5 = this.field2417[var4];
            if (var5 == 95) {
                var3.field2417[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field2417[var4] = (byte) (var5 - 32);
            } else {
                var3.field2417[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z", line = 758)
    public final boolean method845(byte arg0) {
        if (arg0 == 15) {
            field2401++;
            return this.method840(arg0 ^ 0x2A, 10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I", line = 769)
    public final int method846(int arg0, int arg1) {
        field2423++;
        return arg0 == -1582 ? this.method827(-119, arg1, 0) : 119;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILrc;)I", line = 780)
    private final int method847(int arg0, int arg1, class105 arg2) {
        int[] var4 = new int[arg2.field2383];
        int[] var5 = new int[256];
        int[] var6 = new int[arg2.field2383];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field2383;
        }
        field2381++;
        for (int var8 = 1; var8 <= arg2.field2383; var8++) {
            var4[var8 - 1] = (arg2.field2383 << 1) - var8;
            var5[class100.method807(255, arg2.field2417[var8 - 1])] = arg2.field2383 - var8;
        }
        int var9 = arg2.field2383 + 1;
        for (int var10 = arg2.field2383; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg2.field2383 && arg2.field2417[var9 - 1] != arg2.field2417[var10 - 1]) {
                if (arg2.field2383 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg2.field2383 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field2383 + 1 - var9;
        int var13 = 0;
        int var14 = 1;
        while (var14 <= var12) {
            var6[var14 - 1] = var13;
            while (var13 >= 1 && arg2.field2417[var13 - 1] != arg2.field2417[var14 - 1]) {
                var13 = var6[var13 - 1];
            }
            var14++;
            var13++;
        }
        int var15 = 1;
        while (arg2.field2383 > var11) {
            for (int var19 = var15; var19 <= var11; var19++) {
                if (arg2.field2383 + var11 - var19 <= var4[var19 - 1]) {
                    var4[var19 - 1] = arg2.field2383 + var11 - var19;
                }
            }
            var15 = var11 + 1;
            var11 = var11 + var12 - var6[var12 + -1];
            var12 = var6[var12 - 1];
        }
        int var18;
        for (int var16 = arg2.field2383 + arg1 - 1; var16 < this.field2383; var16 += Math.max(var5[this.field2417[var16] & 0xFF], var4[var18])) {
            for (var18 = arg2.field2383 - 1; var18 >= 0 && this.field2417[var16] == arg2.field2417[var18]; var18--) {
                var16--;
            }
            if (var18 == -1) {
                return var16 + 1;
            }
        }
        int var17 = 120 % ((arg0 + 20) / 47);
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lrc;I)Z", line = 891)
    public final boolean method848(class105 arg0, int arg1) {
        field2424++;
        if (this.field2383 < arg0.field2383) {
            return false;
        }
        for (int var3 = arg1; var3 < arg0.field2383; var3++) {
            if (this.field2417[var3] != arg0.field2417[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V", line = 917)
    public static void method849(byte arg0) {
        if (arg0 > -92) {
            method864(true);
        }
        field2386 = null;
        field2396 = null;
        field2409 = null;
        field2378 = null;
        field2388 = null;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)[B", line = 933)
    public final byte[] method850(byte arg0) {
        field2402++;
        byte[] var2 = new byte[this.field2383];
        class82.method697(this.field2417, 0, var2, 0, this.field2383);
        if (arg0 != -36) {
            this.method833((byte) -29);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)I", line = 949)
    private final int method851(int arg0, int arg1) {
        field2387++;
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field2383; var6++) {
            int var7 = this.field2417[var6] & 0xFF;
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
            var4 = var8;
            var5 = true;
        }
        if (arg0 <= 36) {
            this.method836(-46, (byte) -111);
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILrc;B)Lrc;", line = 1027)
    public final class105 method852(int arg0, class105 arg1, byte arg2) {
        field2398++;
        if (!this.field2389) {
            throw new IllegalArgumentException();
        } else if (arg0 > this.field2383) {
            throw new IllegalArgumentException();
        } else {
            this.field2413 = 0;
            if (arg1.field2383 + arg0 > this.field2417.length) {
                int var4;
                for (var4 = 1; var4 < arg1.field2383 + arg0; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class82.method697(this.field2417, 0, var5, 0, this.field2383);
                this.field2417 = var5;
            }
            class82.method697(arg1.field2417, 0, this.field2417, arg0, arg1.field2383);
            if (this.field2383 < arg0 + arg1.field2383) {
                this.field2383 = arg1.field2383 + arg0;
            }
            return arg2 == 53 ? this : null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)I", line = 1074)
    public final int method853(int arg0) {
        field2394++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field2383; var3++) {
            var2 = (this.field2417[var3] & 0xFF) + (var2 << 5) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)Lrc;", line = 1096)
    public final class105 method854(int arg0) {
        long var2 = this.method861((byte) 38);
        field2416++;
        synchronized (field2425 == null ? (field2425 = method865("rc")) : field2425) {
            if (client.field440 == null) {
                client.field440 = new class74(4096);
            } else {
                for (class84 var5 = (class84) client.field440.method624((byte) 120, var2); var5 != null; var5 = (class84) client.field440.method620((byte) -74)) {
                    if (this.method829(true, var5.field1891)) {
                        return var5.field1891;
                    }
                }
            }
            class84 var7 = new class84();
            var7.field1891 = this;
            this.field2389 = false;
            client.field440.method625((byte) -118, var7, var2);
            if (arg0 >= -34) {
                this.method833((byte) 86);
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lrc;I)Z", line = 1136)
    public final boolean method855(class105 arg0, int arg1) {
        field2411++;
        if (this.field2383 < arg0.field2383) {
            return false;
        }
        int var3 = this.field2383 - arg0.field2383;
        for (int var4 = arg1; var4 < arg0.field2383; var4++) {
            if (this.field2417[var3 + var4] != arg0.field2417[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILrc;)I", line = 1171)
    public final int method856(int arg0, class105 arg1) {
        field2410++;
        int var3;
        if (arg1.field2383 >= this.field2383) {
            var3 = this.field2383;
        } else {
            var3 = arg1.field2383;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1.field2417[var4] > this.field2417[var4]) {
                return -1;
            }
            if (arg1.field2417[var4] < this.field2417[var4]) {
                return 1;
            }
        }
        if (arg0 != 1) {
            this.method842(null, (byte) -115);
        }
        if (arg1.field2383 > this.field2383) {
            return -1;
        } else if (arg1.field2383 < this.field2383) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)Lrc;", line = 1211)
    public final class105 method857(int arg0, int arg1) {
        field2375++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class105 var3 = new class105();
        var3.field2417 = new byte[this.field2383 + 1];
        var3.field2383 = this.field2383 + 1;
        class82.method697(this.field2417, 0, var3.field2417, 0, this.field2383);
        var3.field2417[this.field2383] = (byte) arg0;
        int var4 = -123 / ((arg1 - 54) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)Lrc;", line = 1234)
    public final class105 method858(byte arg0) {
        field2418++;
        class105 var2 = new class105();
        var2.field2383 = this.field2383;
        var2.field2417 = new byte[this.field2383];
        if (arg0 != -27) {
            return null;
        }
        for (int var3 = 0; var3 < this.field2383; var3++) {
            byte var4 = this.field2417[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2417[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1263)
    public final boolean equals(Object arg0) {
        field2412++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BIII)I", line = 1276)
    public final int method859(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -118) {
            field2388 = null;
        }
        class82.method697(this.field2417, arg3, arg1, arg0, arg2 - arg3);
        field2390++;
        return arg2 - arg3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)Lrc;", line = 1291)
    public final class105 method860(int arg0, boolean arg1, int arg2) {
        field2395++;
        class105 var4 = new class105();
        var4.field2383 = arg2 - arg0;
        var4.field2417 = new byte[arg2 - arg0];
        class82.method697(this.field2417, arg0, var4.field2417, 0, var4.field2383);
        return arg1 ? null : var4;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)J", line = 1314)
    private final long method861(byte arg0) {
        field2419++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field2383; var4++) {
            var2 = (var2 << 5) + (long) (this.field2417[var4] & 0xFF) - var2;
        }
        return arg0 == 38 ? var2 : 69L;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(IB)Lrc;", line = 1355)
    public final class105 method862(int arg0, byte arg1) {
        int var3 = -48 % ((-arg1 - 1) / 48);
        field2377++;
        return this.method860(arg0, false, this.field2383);
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)I", line = 1366)
    public final int method863(int arg0) {
        if (arg0 >= -120) {
            this.method834((byte) 73, null);
        }
        field2373++;
        return this.field2383;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V", line = 1394)
    public static final void method864(boolean arg0) {
        class128.field3103.method323(0);
        if (arg0) {
            method832(103, -103, -124, (byte) 47, null, null, 126);
        }
        field2382++;
    }
}
