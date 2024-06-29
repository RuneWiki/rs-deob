import java.applet.Applet;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class152 implements class261 {

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "Z")
    private boolean field2416 = true;

    @OriginalMember(owner = "client!wm", name = "fb", descriptor = "Lne;")
    public static class235 field2425 = new class235(64);

    @OriginalMember(owner = "client!wm", name = "kb", descriptor = "Lne;")
    public static class235 field2430 = new class235(5);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field2371;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!wm", name = "Y", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!wm", name = "ab", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!wm", name = "bb", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!wm", name = "cb", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!wm", name = "db", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!wm", name = "gb", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!wm", name = "hb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!wm", name = "ib", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!wm", name = "jb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!wm", name = "lb", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "[B")
    public byte[] field2389;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 6)
    public final void method973(int arg0, Graphics arg1, int arg2, int arg3) {
        field2406++;
        if (arg0 != 0) {
            this.method1023((byte) -88);
        }
        String var5;
        try {
            var5 = new String(this.field2389, 0, this.field2371, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field2389, 0, this.field2371);
        }
        arg1.drawString(var5, arg3, arg2);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V", line = 27)
    public final void method974(int arg0, byte arg1) {
        field2388++;
        if (!this.field2416) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field2389.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class187.method1243(this.field2389, 0, var4, 0, this.field2371);
                this.field2389 = var4;
            }
            if (arg1 != 110) {
                field2425 = (class235) null;
            }
            for (int var5 = this.field2371; var5 < arg0; var5++) {
                this.field2389[var5] = 32;
            }
            this.field2371 = arg0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 74)
    public final void method975(byte arg0) {
        if (arg0 != 17) {
            return;
        }
        String var2;
        try {
            var2 = new String(this.field2389, 0, this.field2371, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field2389, 0, this.field2371);
        }
        field2386++;
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/applet/Applet;)Lwm;", line = 96)
    public final class152 method976(byte arg0, Applet arg1) {
        field2387++;
        if (arg0 >= -38) {
            this.method1012(true);
        }
        String var3 = new String(this.field2389, 0, this.field2371);
        String var4 = arg1.getParameter(var3);
        return var4 == null ? null : class55.method366(0, var4);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILwm;)Z", line = 117)
    public final boolean method977(int arg0, class152 arg1) {
        field2395++;
        if (arg1.field2371 > this.field2371) {
            return false;
        }
        int var3 = 0;
        if (arg0 != 22394) {
            this.field2416 = false;
        }
        while (var3 < arg1.field2371) {
            if (this.field2389[var3] != arg1.field2389[var3]) {
                return false;
            }
            var3++;
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Lwm;", line = 151)
    public final class152 method978(int arg0) {
        class152 var2 = class160.method1077(87, this.method1013(-18674));
        field2378++;
        if (arg0 >= -114) {
            this.method1000(44);
        }
        return var2 == null ? class108.field1547 : var2;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)I", line = 168)
    public final int method979(byte arg0) {
        field2401++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2371; var3++) {
            var2 = (var2 << 5) + (this.field2389[var3] & 0xFF) - var2;
        }
        if (arg0 > -89) {
            this.field2416 = true;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I", line = 190)
    public final int method980(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg0 != 5558) {
            this.method977(41, (class152) null);
        }
        field2384++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field2371; var6++) {
            int var7 = this.field2389[var6] & 0xFF;
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
            if ((var8 / arg1) != var5) {
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

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IB)Lwm;", line = 267)
    public final class152 method981(int arg0, byte arg1) {
        field2410++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        }
        int var3 = -115 / ((81 - arg1) / 36);
        if (!this.field2416) {
            throw new IllegalArgumentException();
        }
        if (this.field2389.length == this.field2371) {
            int var4;
            for (var4 = 1; var4 <= this.field2371; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class187.method1243(this.field2389, 0, var5, 0, this.field2371);
            this.field2389 = var5;
        }
        this.field2389[this.field2371++] = (byte) arg0;
        return this;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)Lwm;", line = 302)
    public final class152 method982(byte arg0) {
        field2426++;
        class152 var2 = new class152();
        var2.field2371 = this.field2371;
        var2.field2389 = new byte[var2.field2371];
        for (int var3 = 0; var3 < this.field2371; var3++) {
            var2.field2389[this.field2371 - (var3 + 1)] = this.field2389[var3];
        }
        if (arg0 != 17) {
            field2425 = (class235) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)Lwm;", line = 324)
    public final class152 method983(byte arg0, int arg1) {
        field2415++;
        return arg0 == 88 ? this.method1015(arg1, 19197, this.field2371) : (class152) null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 336)
    public final int method984(byte arg0, FontMetrics arg1) {
        field2374++;
        String var3;
        try {
            var3 = new String(this.field2389, 0, this.field2371, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field2389, 0, this.field2371);
        }
        if (arg0 >= -96) {
            this.field2371 = -104;
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;", line = 356)
    public final URL method985(URL arg0, byte arg1) throws MalformedURLException {
        field2427++;
        if (arg1 != 18) {
            this.method997((byte[]) null, -80, -80, 29, 31);
        }
        return new URL(arg0, new String(this.field2389, 0, this.field2371));
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)J", line = 368)
    public final long method986(int arg0) {
        if (arg0 != 92) {
            return 28L;
        }
        long var2 = 0L;
        field2421++;
        for (int var4 = 0; var4 < this.field2371; var4++) {
            var2 = (var2 << 5) + (long) (this.field2389[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwm;Lwm;I)Lwm;", line = 391)
    public final class152 method987(class152 arg0, class152 arg1, int arg2) {
        int var4 = this.field2371;
        if (arg2 != -1) {
            return (class152) null;
        }
        field2372++;
        int var5 = arg1.field2371 - arg0.field2371;
        int var6 = 0;
        while (true) {
            int var7 = this.method1021(arg0, var6, -18410);
            if (var7 < 0) {
                int var8 = 0;
                class152 var9 = class97.method652(var4, (byte) -17);
                while (true) {
                    int var10 = this.method1021(arg0, var8, -18410);
                    if (var10 < 0) {
                        while (var8 < this.field2371) {
                            var9.method981(this.field2389[var8++] & 0xFF, (byte) -69);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method981(this.field2389[var8++] & 0xFF, (byte) 125);
                    }
                    var9.method1008(arg2 - 8, arg1);
                    var8 += arg0.field2371;
                }
            }
            var6 = arg0.field2371 + var7;
            var4 += var5;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwm;I)I", line = 447)
    public final int method988(class152 arg0, int arg1) {
        if (arg1 != 0) {
            this.method1007((class152) null, (byte) 54);
        }
        field2370++;
        return this.method1021(arg0, 0, -18410);
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)Lwm;", line = 459)
    public final class152 method989(byte arg0) {
        field2408++;
        class152 var2 = new class152();
        byte var3 = 2;
        var2.field2371 = this.field2371;
        var2.field2389 = new byte[this.field2371];
        if (arg0 < 22) {
            this.method1026((class152) null, 63);
        }
        for (int var4 = 0; var4 < this.field2371; var4++) {
            byte var5 = this.field2389[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
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
            var2.field2389[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 521)
    public final void method990(int arg0, Applet arg1) throws Throwable {
        String var3 = new String(this.field2389, arg0, this.field2371);
        field2414++;
        class67.method424(var3, arg1, (byte) 107);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V", line = 530)
    public static void method991(int arg0) {
        field2430 = null;
        if (arg0 != -1) {
            method996(-13);
        }
        field2425 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILwm;)Z", line = 541)
    public final boolean method992(int arg0, class152 arg1) {
        field2409++;
        if (arg1 == null) {
            return false;
        } else if (arg1 == this) {
            return true;
        } else if (this.field2371 == arg1.field2371) {
            byte[] var3 = this.field2389;
            byte[] var4 = arg1.field2389;
            if (arg0 != 23292) {
                this.method1007((class152) null, (byte) 24);
            }
            for (int var5 = 0; var5 < this.field2371; var5++) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(IB)[Lwm;", line = 580)
    public final class152[] method993(int arg0, byte arg1) {
        field2380++;
        int var3 = 0;
        int var4 = -42 / ((-arg1 - 52) / 46);
        for (int var5 = 0; var5 < this.field2371; var5++) {
            if (this.field2389[var5] == arg0) {
                var3++;
            }
        }
        class152[] var6 = new class152[var3 + 1];
        if (var3 == 0) {
            var6[0] = this;
            return var6;
        }
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var3; var9++) {
            int var10;
            for (var10 = 0; this.field2389[var8 + var10] != arg0; var10++) {
            }
            var6[var7++] = this.method1015(var8, 19197, var8 + var10);
            var8 += var10 + 1;
        }
        var6[var3] = this.method1015(var8, 19197, this.field2371);
        return var6;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILwm;)Lwm;", line = 633)
    public final class152 method994(int arg0, int arg1, int arg2, class152 arg3) {
        field2429++;
        if (!this.field2416) {
            throw new IllegalArgumentException();
        }
        if (arg0 <= 35) {
            this.field2371 = -35;
        }
        if (arg2 < 0 || arg1 < arg2 || arg3.field2371 < arg1) {
            throw new IllegalArgumentException();
        }
        if (this.field2371 + arg1 - arg2 > this.field2389.length) {
            int var5;
            for (var5 = 1; var5 < this.field2371 + arg3.field2371; var5 += var5) {
            }
            byte[] var6 = new byte[var5];
            class187.method1243(this.field2389, 0, var6, 0, this.field2371);
            this.field2389 = var6;
        }
        class187.method1243(arg3.field2389, arg2, this.field2389, this.field2371, arg1 - arg2);
        this.field2371 += arg1 - arg2;
        return this;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(ILwm;)Z", line = 679)
    public final boolean method995(int arg0, class152 arg1) {
        field2399++;
        if (arg1 == null) {
            return false;
        } else if (arg0 >= -68) {
            return true;
        } else if (this.field2371 == arg1.field2371) {
            for (int var3 = 0; var3 < this.field2371; var3++) {
                byte var4 = this.field2389[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field2389[var3];
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

    @OriginalMember(owner = "client!wm", name = "toString", descriptor = "()Ljava/lang/String;", line = 721)
    public final String toString() {
        field2377++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V", line = 735)
    public static final void method996(int arg0) {
        field2403++;
        int var1 = class267.field4503;
        int var2 = class17.field232;
        if (arg0 > -103) {
            field2430 = (class235) null;
        }
        int var3 = class128.field1957;
        int var4 = class258.field4429;
        int var5 = 6116423;
        if (class217.field3516) {
            class13.method78(var1, var3, var2, var4, var5);
            class13.method78(var1 + 1, var3 - -1, var2 - 2, 16, 0);
            class13.method68(var1 + 1, var3 - -18, var2 - 2, var4 + -19, 0);
        } else {
            class96.method635(var1, var3, var2, var4, var5);
            class96.method635(var1 + 1, var3 + 1, var2 - 2, 16, 0);
            class96.method648(var1 + 1, var3 - -18, var2 - 2, var4 + -19, 0);
        }
        class316.field5485.method1133(class48.field741, var1 + 3, var3 + 14, var5, -1);
        int var6 = class254.field4397;
        int var7 = class278.field4763;
        for (int var8 = 0; var8 < class160.field2556; var8++) {
            int var9 = (class160.field2556 - var8 - 1) * 15 + var3 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var7 < (var1 + var2) && var9 - 13 < var6 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class316.field5485.method1133(class6.method27(var8, -62), var1 + 3, var9, var10, 0);
        }
        class48.method336(class128.field1957, 103, class17.field232, class258.field4429, class267.field4503);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BIIII)I", line = 790)
    public final int method997(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2383++;
        class187.method1243(this.field2389, arg2, arg0, arg4, arg1 - arg2);
        return arg3 > -75 ? 43 : arg1 - arg2;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)I", line = 810)
    public final int method998(int arg0) {
        field2411++;
        int var2 = -107 % ((-arg0 - 48) / 50);
        return this.method980(5558, 10);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 824)
    public static final String method999(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class106) {
            class106 var2 = (class106) arg0;
            arg0 = var2.field1512;
            var3 = var2.field1505 + " | ";
        } else {
            var3 = "";
        }
        field2407++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 25) {
            return (String) null;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)I", line = 894)
    public final int method1000(int arg0) {
        if (arg0 == 0) {
            field2431++;
            return this.field2371;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V", line = 910)
    public static final void method1001(boolean arg0) {
        class143.field2215 = null;
        class291.method2003(0, -1, class253.field4387, !arg0, 0, 0, class227.field3709, 0, class172.field2757);
        if (!arg0) {
            return;
        }
        field2422++;
        if (class143.field2215 != null) {
            method1010(127, 0, class227.field3709, -1412584499, class172.field2757, 0, class15.field207.field1784, class131.field1991, class242.field3975, class143.field2215);
            class143.field2215 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)I", line = 942)
    public final int method1002(int arg0, int arg1) {
        if (arg0 == -12637) {
            field2413++;
            return this.field2389[arg1] & 0xFF;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(ILwm;)Z", line = 958)
    public final boolean method1003(int arg0, class152 arg1) {
        if (arg0 != 22008) {
            field2425 = (class235) null;
        }
        field2404++;
        if (arg1.field2371 > this.field2371) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field2371; var3++) {
            byte var4 = this.field2389[var3];
            byte var5 = arg1.field2389[var3];
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
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)Z", line = 1020)
    public final boolean method1004(byte arg0) {
        field2412++;
        return arg0 < 70 ? false : this.method1009(10, 0);
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(ILwm;)I", line = 1041)
    public final int method1005(int arg0, class152 arg1) {
        field2375++;
        int var3 = 0;
        if (arg0 != 255) {
            this.method998(-93);
        }
        int var4 = 0;
        int var5 = this.field2371;
        int var6 = this.field2371;
        int var7 = arg1.field2371;
        int var8 = arg1.field2371;
        int var9 = 0;
        int var10 = 0;
        while (var5 != 0 && var7 != 0) {
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = this.field2389[var9] & 0xFF;
                var9++;
            }
            if (class38.method276((byte) -93, var4)) {
                var6++;
            } else {
                var5--;
            }
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = arg1.field2389[var10] & 0xFF;
                var10++;
            }
            if (class38.method276((byte) -93, var3)) {
                var8++;
            } else {
                var7--;
            }
            if (class204.field3301[var4] < class204.field3301[var3]) {
                return -1;
            }
            if (class204.field3301[var3] < class204.field3301[var4]) {
                return 1;
            }
        }
        if (var6 >= var8) {
            return var8 < var6 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)I", line = 1131)
    public final int method1006(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.method977(-95, (class152) null);
        }
        field2397++;
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field2371; var5++) {
            if (this.field2389[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwm;B)I", line = 1156)
    public final int method1007(class152 arg0, byte arg1) {
        field2382++;
        int var3;
        if (this.field2371 <= arg0.field2371) {
            var3 = this.field2371;
        } else {
            var3 = arg0.field2371;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field2389[var4] & 0xFF) > (this.field2389[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field2389[var4] & 0xFF) > (arg0.field2389[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1 != -13) {
            this.method1009(97, 106);
        }
        if (arg0.field2371 > this.field2371) {
            return -1;
        } else if (arg0.field2371 >= this.field2371) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(ILwm;)Lwm;", line = 1196)
    public final class152 method1008(int arg0, class152 arg1) {
        field2376++;
        if (!this.field2416) {
            throw new IllegalArgumentException();
        }
        if ((this.field2371 + arg1.field2371) > this.field2389.length) {
            int var3;
            for (var3 = 1; var3 < (this.field2371 + arg1.field2371); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class187.method1243(this.field2389, 0, var4, 0, this.field2371);
            this.field2389 = var4;
        }
        class187.method1243(arg1.field2389, 0, this.field2389, this.field2371, arg1.field2371);
        this.field2371 += arg1.field2371;
        if (arg0 != -9) {
            this.field2389 = (byte[]) null;
        }
        return this;
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)Z", line = 1244)
    private final boolean method1009(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        field2405++;
        boolean var4 = false;
        int var5 = arg1;
        for (int var6 = 0; var6 < this.field2371; var6++) {
            int var7 = this.field2389[var6] & 0xFF;
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
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if ((var8 / arg0) != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIII[Loe;)V", line = 1313)
    public static final void method1010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class127[] arg9) {
        field2396++;
        if (class217.field3516) {
            class13.method76(arg1, arg5, arg4, arg2);
        } else {
            class96.method634(arg1, arg5, arg4, arg2);
            class181.method1187();
        }
        int var10 = 0;
        if (arg0 <= 124) {
            return;
        }
        while (arg9.length > var10) {
            class127 var11 = arg9[var10];
            if (var11 != null && (var11.field1836 == arg3 || arg3 == -1412584499 && class33.field537 == var11)) {
                int var12;
                if (arg6 == -1) {
                    class288.field4874[class121.field1709] = var11.field1924 + arg7;
                    class286.field4847[class121.field1709] = var11.field1828 + arg8;
                    class227.field3695[class121.field1709] = var11.field1876;
                    class174.field2788[class121.field1709] = var11.field1921;
                    var12 = class121.field1709++;
                } else {
                    var12 = arg6;
                }
                var11.field1892 = class142.field2187;
                var11.field1784 = var12;
                if (!var11.field1794 || !client.method1758(var11)) {
                    label1081: {
                        if (var11.field1887 > 0) {
                            class189.method1256(var11, -27061);
                        }
                        int var13 = var11.field1828 + arg8;
                        int var14 = var11.field1924 + arg7;
                        int var15 = var11.field1880;
                        if (class317.field5495 && (client.method1759(var11).field1171 != 0 || var11.field1902 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class33.field537 == var11) {
                            if (arg3 != -1412584499 && !var11.field1832) {
                                class143.field2215 = arg9;
                                class131.field1991 = arg7;
                                class242.field3975 = arg8;
                                break label1081;
                            }
                            if (!var11.field1832) {
                                var15 = 128;
                            }
                            if (class179.field2864 && class40.field646) {
                                int var16 = class278.field4763;
                                int var17 = class254.field4397;
                                int var18 = var17 - class253.field4377;
                                int var19 = var16 - class305.field5245;
                                if (var19 < class31.field524) {
                                    var19 = class31.field524;
                                }
                                if ((class31.field524 + class15.field207.field1876) < (var11.field1876 + var19)) {
                                    var19 = class31.field524 + class15.field207.field1876 - var11.field1876;
                                }
                                var14 = var19;
                                if (class37.field625 > var18) {
                                    var18 = class37.field625;
                                }
                                if ((class37.field625 + class15.field207.field1921) < (var18 + var11.field1921)) {
                                    var18 = class37.field625 + class15.field207.field1921 - var11.field1921;
                                }
                                var13 = var18;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field1902 == 2) {
                            var20 = arg2;
                            var21 = arg5;
                            var22 = arg4;
                            var23 = arg1;
                        } else {
                            var23 = arg1 >= var14 ? arg1 : var14;
                            var21 = arg5 < var13 ? var13 : arg5;
                            int var24 = var11.field1921 + var13;
                            int var25 = var11.field1876 + var14;
                            if (var11.field1902 == 9) {
                                var24++;
                                var25++;
                            }
                            var20 = arg2 > var24 ? var24 : arg2;
                            var22 = var25 < arg4 ? var25 : arg4;
                        }
                        if (!var11.field1794 || var23 < var22 && var21 < var20) {
                            label1091: {
                                if (var11.field1887 != 0) {
                                    if (var11.field1887 == 1337 || var11.field1887 == 1403 && class217.field3516) {
                                        class288.field4867 = var14;
                                        class85.field1178 = var11;
                                        class279.field4767 = var13;
                                        class70.method444((byte) 20, var14, var11.field1921, var13, var11.field1887 == 1403, var11.field1876);
                                        if (class217.field3516) {
                                            class13.method76(arg1, arg5, arg4, arg2);
                                        } else {
                                            class96.method634(arg1, arg5, arg4, arg2);
                                        }
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1338) {
                                        if (!var11.method819(116)) {
                                            break label1091;
                                        }
                                        class12.method61(var14, var13, var12, var11, -47);
                                        if (class217.field3516) {
                                            class13.method76(arg1, arg5, arg4, arg2);
                                        } else {
                                            class96.method634(arg1, arg5, arg4, arg2);
                                        }
                                        if (class8.field111 != 0 && class8.field111 != 3 || class70.field1016 || class247.field4134 < var23 || class195.field3134 < var21 || class247.field4134 >= var22 || class195.field3134 >= var20) {
                                            break label1091;
                                        }
                                        int var26 = class247.field4134 - var14;
                                        int var27 = class195.field3134 - var13;
                                        int var28 = var11.field1776[var27];
                                        if (var28 > var26 || var26 > (var28 + var11.field1825[var27])) {
                                            break label1091;
                                        }
                                        int var29 = var26 - var11.field1876 / 2;
                                        int var30 = class272.field4645 + class202.field3262 & 0x7FF;
                                        int var31 = class181.field2884[var30];
                                        int var32 = (class130.field1980 + 256) * var31 >> 8;
                                        int var33 = var27 - var11.field1921 / 2;
                                        int var34 = class181.field2886[var30];
                                        int var35 = (class130.field1980 + 256) * var34 >> 8;
                                        int var36 = var33 * var35 - (var29 * var32) >> 11;
                                        int var37 = var29 * var35 + var32 * var33 >> 11;
                                        int var38 = class85.field1176.field4231 - var36 >> 7;
                                        int var39 = class85.field1176.field4162 + var37 >> 7;
                                        if (class125.field1762 && (class239.field3926 & 0x40) != 0) {
                                            class127 var40 = class132.method837(class172.field2758, class93.field1329, 0);
                                            if (var40 == null) {
                                                class233.method1601(6132);
                                            } else {
                                                class146.method915(-100, (short) 44, class208.field3393, var39, class169.field2648, 1L, var38, class62.field942);
                                            }
                                            break label1091;
                                        }
                                        if (class256.field4410 == 1) {
                                            class146.method915(-113, (short) 14, -1, var39, class201.field3252, 1L, var38, class23.field406);
                                        }
                                        class146.method915(-125, (short) 59, -1, var39, class201.field3252, 1L, var38, class219.field3564);
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1339) {
                                        if (var11.method819(106)) {
                                            class128.method822(var12, var14, var13, var11, 119);
                                            if (class217.field3516) {
                                                class13.method76(arg1, arg5, arg4, arg2);
                                            } else {
                                                class96.method634(arg1, arg5, arg4, arg2);
                                            }
                                        }
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1400) {
                                        class317.method2214(var14, 32, var11.field1876, var13, var11.field1921);
                                        class249.field4170[var12] = true;
                                        class206.field3360[var12] = true;
                                        if (class217.field3516) {
                                            class13.method76(arg1, arg5, arg4, arg2);
                                        } else {
                                            class96.method634(arg1, arg5, arg4, arg2);
                                        }
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1401) {
                                        class159.method1070((byte) -8, var13, var14, var11.field1876, var11.field1921);
                                        class249.field4170[var12] = true;
                                        class206.field3360[var12] = true;
                                        if (class217.field3516) {
                                            class13.method76(arg1, arg5, arg4, arg2);
                                        } else {
                                            class96.method634(arg1, arg5, arg4, arg2);
                                        }
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1402) {
                                        if (!class217.field3516) {
                                            class23.method191(var14, var13, 99);
                                            class249.field4170[var12] = true;
                                            class206.field3360[var12] = true;
                                        }
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1405) {
                                        if (!class50.field776) {
                                            break label1091;
                                        }
                                        int var41 = var11.field1876 + var14;
                                        int var42 = var13 + 15;
                                        class305.field5238.method1135(class195.method1307(new class152[] { class117.field1660, class38.method280(116, class160.field2555) }, (byte) 29), var41, var42, 16776960, -1);
                                        int var43 = 16776960;
                                        int var141 = var42 + 15;
                                        Runtime var44 = Runtime.getRuntime();
                                        int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                        if (var45 > 65536) {
                                            var43 = 16711680;
                                        }
                                        class305.field5238.method1135(class195.method1307(new class152[] { class33.field540, class38.method280(93, var45), class212.field3443 }, (byte) 29), var41, var141, var43, -1);
                                        var42 = var141 + 15;
                                        if (class217.field3516) {
                                            int var46 = 16776960;
                                            int var47 = (class207.field3385 + class207.field3382 + class207.field3381) / 1024;
                                            if (var47 > 65536) {
                                                var46 = 16711680;
                                            }
                                            class305.field5238.method1135(class195.method1307(new class152[] { class120.field1699, class38.method280(96, var47), class212.field3443 }, (byte) 29), var41, var42, var46, -1);
                                            var42 += 15;
                                        }
                                        int var48 = 16776960;
                                        int var49 = 0;
                                        int var50 = 0;
                                        int var51 = 0;
                                        for (int var52 = 0; var52 < 28; var52++) {
                                            var49 += class45.field711[var52].method1433((byte) -97);
                                            var51 += class45.field711[var52].method1426(255);
                                            var50 += class45.field711[var52].method1434((byte) -122);
                                        }
                                        int var53 = var50 * 100 / var49;
                                        int var54 = var51 * 10000 / var49;
                                        class152 var55 = class195.method1307(new class152[] { class91.field1277, class101.method676(true, (byte) -113, 2, 0, (long) var54), class238.field3896, class38.method280(122, var53), class189.field2988 }, (byte) 29);
                                        class303.field5220.method1135(var55, var41, var42, var48, -1);
                                        var42 += 12;
                                        class249.field4170[var12] = true;
                                        class206.field3360[var12] = true;
                                        break label1091;
                                    }
                                    if (var11.field1887 == 1406) {
                                        class93.field1324 = var11;
                                        class123.field1731 = var14;
                                        class136.field2084 = var13;
                                        break label1091;
                                    }
                                }
                                if (!class70.field1016) {
                                    if (var11.field1902 == 0 && var11.field1816 && var23 <= class247.field4134 && var21 <= class195.field3134 && var22 > class247.field4134 && var20 > class195.field3134 && !class317.field5495) {
                                        class160.field2556 = 1;
                                        class83.field1156[0] = class321.field5607;
                                        class123.field1734[0] = class57.field880;
                                        class273.field4688[0] = 1004;
                                        class55.field864[0] = class201.field3252;
                                    }
                                    if (class247.field4134 >= var23 && class195.field3134 >= var21 && var22 > class247.field4134 && class195.field3134 < var20) {
                                        class85.method555(-71, class247.field4134 - var14, class195.field3134 - var13, var11);
                                    }
                                }
                                if (var11.field1902 == 0) {
                                    if (!var11.field1794 && client.method1758(var11) && class120.field1694 != var11) {
                                        break label1091;
                                    }
                                    if (!var11.field1794) {
                                        if (var11.field1852 > var11.field1915 - var11.field1921) {
                                            var11.field1852 = var11.field1915 - var11.field1921;
                                        }
                                        if (var11.field1852 < 0) {
                                            var11.field1852 = 0;
                                        }
                                    }
                                    method1010(125, var23, var20, var11.field1868, var22, var21, var12, var14 - var11.field1891, -var11.field1852 + var13, arg9);
                                    if (var11.field1937 != null) {
                                        method1010(125, var23, var20, var11.field1868, var22, var21, var12, var14 - var11.field1891, -var11.field1852 + var13, var11.field1937);
                                    }
                                    class122 var56 = (class122) class107.field1519.method1586((long) var11.field1868, -79);
                                    if (var56 != null) {
                                        if (var56.field1725 == 0 && !class70.field1016 && var23 <= class247.field4134 && class195.field3134 >= var21 && class247.field4134 < var22 && var20 > class195.field3134 && !class317.field5495) {
                                            class160.field2556 = 1;
                                            class83.field1156[0] = class321.field5607;
                                            class273.field4688[0] = 1004;
                                            class123.field1734[0] = class57.field880;
                                            class55.field864[0] = class201.field3252;
                                        }
                                        class291.method2003(var23, var12, var56.field1724, false, var21, var14, var20, var13, var22);
                                    }
                                    if (class217.field3516) {
                                        class13.method76(arg1, arg5, arg4, arg2);
                                    } else {
                                        class96.method634(arg1, arg5, arg4, arg2);
                                        class181.method1187();
                                    }
                                }
                                if (class241.field3946[var12] || class288.field4868 > 1) {
                                    if (var11.field1902 == 0 && !var11.field1794 && var11.field1915 > var11.field1921) {
                                        class155.method1038(var11.field1852, var14 + var11.field1876, (byte) 23, var13, var11.field1921, var11.field1915);
                                    }
                                    if (var11.field1902 != 1) {
                                        if (var11.field1902 == 2) {
                                            int var57 = 0;
                                            for (int var58 = 0; var58 < var11.field1802; var58++) {
                                                for (int var59 = 0; var59 < var11.field1879; var59++) {
                                                    int var60 = (var11.field1840 + 32) * var58 + var13;
                                                    int var61 = var14 + ((var11.field1946 + 32) * var59);
                                                    if (var57 < 20) {
                                                        var60 += var11.field1933[var57];
                                                        var61 += var11.field1865[var57];
                                                    }
                                                    if (var11.field1833[var57] > 0) {
                                                        boolean var62 = false;
                                                        boolean var63 = false;
                                                        int var64 = var11.field1833[var57] - 1;
                                                        if (arg1 < var61 + 32 && arg4 > var61 && var60 + 32 > arg5 && var60 < arg2 || class77.field1091 == var11 && class323.field5642 == var57) {
                                                            class203 var65;
                                                            if (class268.field4527 == 1 && class227.field3683 == var57 && class69.field1011 == var11.field1868) {
                                                                var65 = class164.method1099((byte) 9, var11.field1779, var11.field1837[var57], 0, var64, 2);
                                                            } else {
                                                                var65 = class164.method1099((byte) 9, var11.field1779, var11.field1837[var57], 3153952, var64, 1);
                                                            }
                                                            if (class181.field2892) {
                                                                class249.field4170[var12] = true;
                                                            }
                                                            if (var65 == null) {
                                                                class272.method1868(22889, var11);
                                                            } else if (class77.field1091 == var11 && class323.field5642 == var57) {
                                                                int var66 = class254.field4397 - class169.field2650;
                                                                int var67 = class278.field4763 - class304.field5229;
                                                                if (var67 < 5 && var67 > -5) {
                                                                    var67 = 0;
                                                                }
                                                                if (var66 < 5 && var66 > -5) {
                                                                    var66 = 0;
                                                                }
                                                                if (class205.field3355 < 5) {
                                                                    var66 = 0;
                                                                    var67 = 0;
                                                                }
                                                                var65.method438(var61 + var67, var60 + var66, 128);
                                                                if (arg3 != -1) {
                                                                    class127 var68 = arg9[arg3 & 0xFFFF];
                                                                    int var69;
                                                                    int var70;
                                                                    if (class217.field3516) {
                                                                        var69 = class13.field185;
                                                                        var70 = class13.field182;
                                                                    } else {
                                                                        var69 = class96.field1375;
                                                                        var70 = class96.field1374;
                                                                    }
                                                                    if ((var60 + var66) < var69 && var68.field1852 > 0) {
                                                                        int var71 = (var69 - var60 - var66) * class277.field4740 / 3;
                                                                        if (var71 > class277.field4740 * 10) {
                                                                            var71 = class277.field4740 * 10;
                                                                        }
                                                                        if (var68.field1852 < var71) {
                                                                            var71 = var68.field1852;
                                                                        }
                                                                        class169.field2650 += var71;
                                                                        var68.field1852 -= var71;
                                                                        class272.method1868(22889, var68);
                                                                    }
                                                                    if (var70 < var60 + var66 + 32 && var68.field1915 - var68.field1921 > var68.field1852) {
                                                                        int var72 = (var60 + var66 + 32 - var70) * class277.field4740 / 3;
                                                                        if (var72 > (class277.field4740 * 10)) {
                                                                            var72 = class277.field4740 * 10;
                                                                        }
                                                                        if (var72 > var68.field1915 - var68.field1852 - var68.field1921) {
                                                                            var72 = var68.field1915 - var68.field1921 - var68.field1852;
                                                                        }
                                                                        var68.field1852 += var72;
                                                                        class169.field2650 -= var72;
                                                                        class272.method1868(22889, var68);
                                                                    }
                                                                }
                                                            } else if (class205.field3357 == var11 && class61.field929 == var57) {
                                                                var65.method438(var61, var60, 128);
                                                            } else {
                                                                var65.method429(var61, var60);
                                                            }
                                                        }
                                                    } else if (var11.field1923 != null && var57 < 20) {
                                                        class203 var73 = var11.method805(29636, var57);
                                                        if (var73 != null) {
                                                            var73.method429(var61, var60);
                                                        } else if (class128.field1966) {
                                                            class272.method1868(22889, var11);
                                                        }
                                                    }
                                                    var57++;
                                                }
                                            }
                                        } else if (var11.field1902 == 3) {
                                            int var74;
                                            if (class54.method359(var11, 512)) {
                                                var74 = var11.field1913;
                                                if (class120.field1694 == var11 && var11.field1798 != 0) {
                                                    var74 = var11.field1798;
                                                }
                                            } else {
                                                var74 = var11.field1856;
                                                if (class120.field1694 == var11 && var11.field1898 != 0) {
                                                    var74 = var11.field1898;
                                                }
                                            }
                                            if (var15 == 0) {
                                                if (var11.field1829) {
                                                    if (class217.field3516) {
                                                        class13.method78(var14, var13, var11.field1876, var11.field1921, var74);
                                                    } else {
                                                        class96.method635(var14, var13, var11.field1876, var11.field1921, var74);
                                                    }
                                                } else if (class217.field3516) {
                                                    class13.method68(var14, var13, var11.field1876, var11.field1921, var74);
                                                } else {
                                                    class96.method648(var14, var13, var11.field1876, var11.field1921, var74);
                                                }
                                            } else if (var11.field1829) {
                                                if (class217.field3516) {
                                                    class13.method74(var14, var13, var11.field1876, var11.field1921, var74, 256 - (var15 & 0xFF));
                                                } else {
                                                    class96.method644(var14, var13, var11.field1876, var11.field1921, var74, 256 - (var15 & 0xFF));
                                                }
                                            } else if (class217.field3516) {
                                                class13.method72(var14, var13, var11.field1876, var11.field1921, var74, 256 - (var15 & 0xFF));
                                            } else {
                                                class96.method642(var14, var13, var11.field1876, var11.field1921, var74, 256 - (var15 & 0xFF));
                                            }
                                        } else if (var11.field1902 == 4) {
                                            class171 var137 = var11.method804(class49.field772, 0);
                                            if (var137 != null) {
                                                class152 var138 = var11.field1912;
                                                int var139;
                                                if (class54.method359(var11, 512)) {
                                                    var139 = var11.field1913;
                                                    if (class120.field1694 == var11 && var11.field1798 != 0) {
                                                        var139 = var11.field1798;
                                                    }
                                                    if (var11.field1830.method1000(0) > 0) {
                                                        var138 = var11.field1830;
                                                    }
                                                } else {
                                                    var139 = var11.field1856;
                                                    if (class120.field1694 == var11 && var11.field1898 != 0) {
                                                        var139 = var11.field1898;
                                                    }
                                                }
                                                if (var11.field1794 && var11.field1911 != -1) {
                                                    class312 var140 = class189.method1253((byte) 103, var11.field1911);
                                                    var138 = var140.field5393;
                                                    if (var138 == null) {
                                                        var138 = class163.field2573;
                                                    }
                                                    if ((var140.field5375 == 1 || var11.field1885 != 1) && var11.field1885 != -1) {
                                                        var138 = class195.method1307(new class152[] { class179.field2844, var138, class230.field3757, class20.method123((byte) 79, var11.field1885) }, (byte) 29);
                                                    }
                                                }
                                                if (class127.field1858 == var11) {
                                                    var139 = var11.field1856;
                                                    var138 = class298.field5164;
                                                }
                                                if (!var11.field1794) {
                                                    var138 = class73.method496(var11, var138, -114);
                                                }
                                                var137.method1126(var138, var14, var13, var11.field1876, var11.field1921, var139, var11.field1905 ? 0 : -1, var11.field1859, var11.field1897, var11.field1826);
                                            } else if (class128.field1966) {
                                                class272.method1868(22889, var11);
                                            }
                                        } else if (var11.field1902 == 5) {
                                            if (var11.field1794) {
                                                class203 var75;
                                                if (var11.field1911 == -1) {
                                                    var75 = var11.method818(-1, false);
                                                } else {
                                                    var75 = class164.method1099((byte) 9, var11.field1779, var11.field1885, var11.field1770, var11.field1911, var11.field1848);
                                                }
                                                if (var75 != null) {
                                                    int var76 = var75.field3283;
                                                    int var77 = var75.field3278;
                                                    if (var11.field1895) {
                                                        int var79 = (-(-var76 - var11.field1876) - 1) / var76;
                                                        int var80 = (var11.field1921 + var77 - 1) / var77;
                                                        if (class217.field3516) {
                                                            class13.method79(var14, var13, var14 + var11.field1876, var11.field1921 + var13);
                                                            boolean var83 = class135.method858(var75.field3281, -17597);
                                                            boolean var84 = class135.method858(var75.field3284, -17597);
                                                            class68 var85 = (class68) var75;
                                                            if (var83 && var84) {
                                                                if (var15 == 0) {
                                                                    var85.method426(var14, var13, var79, var80);
                                                                } else {
                                                                    var85.method439(var14, var13, 256 - (var15 & 0xFF), var79, var80);
                                                                }
                                                            } else if (var83) {
                                                                for (int var86 = 0; var86 < var80; var86++) {
                                                                    if (var15 == 0) {
                                                                        var85.method426(var14, var77 * var86 + var13, var79, 1);
                                                                    } else {
                                                                        var85.method439(var14, var77 * var86 + var13, -(var15 & 0xFF) + 256, var79, 1);
                                                                    }
                                                                }
                                                            } else if (var84) {
                                                                for (int var89 = 0; var89 < var79; var89++) {
                                                                    if (var15 == 0) {
                                                                        var85.method426(var76 * var89 + var14, var13, 1, var80);
                                                                    } else {
                                                                        var85.method439(var76 * var89 + var14, var13, 256 - (var15 & 0xFF), 1, var80);
                                                                    }
                                                                }
                                                            } else {
                                                                for (int var87 = 0; var87 < var79; var87++) {
                                                                    for (int var88 = 0; var88 < var80; var88++) {
                                                                        if (var15 == 0) {
                                                                            var75.method429(var76 * var87 + var14, var77 * var88 + var13);
                                                                        } else {
                                                                            var75.method438(var14 + (var76 * var87), var13 - -(var77 * var88), 256 - (var15 & 0xFF));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            class13.method76(arg1, arg5, arg4, arg2);
                                                        } else {
                                                            class96.method651(var14, var13, var11.field1876 + var14, var13 - -var11.field1921);
                                                            int var81 = 0;
                                                            while (true) {
                                                                if (var79 <= var81) {
                                                                    class96.method634(arg1, arg5, arg4, arg2);
                                                                    break;
                                                                }
                                                                for (int var82 = 0; var82 < var80; var82++) {
                                                                    if (var11.field1844 != 0) {
                                                                        var75.method1341(2, 4096, var76 / 2 + var76 * var81 + var14, var11.field1844, var77 * var82 + (var13 + (var77 / 2)));
                                                                    } else if (var15 == 0) {
                                                                        var75.method429(var76 * var81 + var14, var13 - -(var77 * var82));
                                                                    } else {
                                                                        var75.method438(var14 + (var76 * var81), var13 - -(var77 * var82), 256 - (var15 & 0xFF));
                                                                    }
                                                                }
                                                                var81++;
                                                            }
                                                        }
                                                    } else {
                                                        int var78 = var11.field1876 * 4096 / var76;
                                                        if (var11.field1844 != 0) {
                                                            var75.method1341(2, var78, var11.field1876 / 2 + var14, var11.field1844, var11.field1921 / 2 + var13);
                                                        } else if (var15 != 0) {
                                                            var75.method427(var14, var13, var11.field1876, var11.field1921, 256 - (var15 & 0xFF));
                                                        } else if (var11.field1876 == var76 && var11.field1921 == var77) {
                                                            var75.method429(var14, var13);
                                                        } else {
                                                            var75.method428(var14, var13, var11.field1876, var11.field1921);
                                                        }
                                                    }
                                                } else if (class128.field1966) {
                                                    class272.method1868(22889, var11);
                                                }
                                            } else {
                                                class203 var90 = var11.method818(-1, class54.method359(var11, 512));
                                                if (var90 != null) {
                                                    var90.method429(var14, var13);
                                                } else if (class128.field1966) {
                                                    class272.method1868(22889, var11);
                                                }
                                            }
                                        } else if (var11.field1902 == 6) {
                                            class271 var118 = null;
                                            boolean var119 = class54.method359(var11, 512);
                                            int var120 = 0;
                                            int var121;
                                            if (var119) {
                                                var121 = var11.field1778;
                                            } else {
                                                var121 = var11.field1943;
                                            }
                                            if (var11.field1911 != -1) {
                                                class312 var126 = class189.method1253((byte) 106, var11.field1911);
                                                if (var126 != null) {
                                                    class312 var127 = var126.method2177(false, var11.field1885);
                                                    class141 var128 = var121 == -1 ? null : class133.method851(var121, -53);
                                                    var118 = var127.method2169(var11.field1874, 1, var128, 128, var11.field1800, var11.field1795);
                                                    if (var118 == null) {
                                                        class272.method1868(22889, var11);
                                                    } else {
                                                        var120 = -var118.method22() / 2;
                                                    }
                                                }
                                            } else if (var11.field1899 == 5) {
                                                if (var11.field1900 == -1) {
                                                    var118 = class10.field127.method1568(-1, -1, -1, (class141) null, -1, (class141) null, (class111[]) null, true, false, 0, 0);
                                                } else {
                                                    int var122 = var11.field1900 & 0x7FF;
                                                    if (class27.field466 == var122) {
                                                        var122 = 2047;
                                                    }
                                                    class12 var123 = class22.field380[var122];
                                                    class141 var124 = var121 == -1 ? null : class133.method851(var121, 100);
                                                    if (var123 != null && ((int) var123.field146.method1013(-18674) << 11) == (var11.field1900 & 0xFFFFF800)) {
                                                        var118 = var123.field177.method1568(-1, -1, var11.field1795, var124, 0, (class141) null, (class111[]) null, true, false, 0, 0);
                                                    }
                                                }
                                            } else if (var121 == -1) {
                                                var118 = var11.method807(class85.field1176.field177, 0, var119, -1, (class141) null, 1, -1);
                                                if (var118 == null && class128.field1966) {
                                                    class272.method1868(22889, var11);
                                                }
                                            } else {
                                                class141 var125 = class133.method851(var121, -125);
                                                var118 = var11.method807(class85.field1176.field177, var11.field1800, var119, var11.field1795, var125, 1, var11.field1874);
                                                if (var118 == null && class128.field1966) {
                                                    class272.method1868(22889, var11);
                                                }
                                            }
                                            if (var118 != null) {
                                                int var129;
                                                if (var11.field1907 <= 0) {
                                                    var129 = 256;
                                                } else {
                                                    var129 = (var11.field1921 << 8) / var11.field1907;
                                                }
                                                int var130;
                                                if (var11.field1822 > 0) {
                                                    var130 = (var11.field1876 << 8) / var11.field1822;
                                                } else {
                                                    var130 = 256;
                                                }
                                                int var131 = (var11.field1909 * var129 >> 8) + var11.field1921 / 2 + var13;
                                                int var132 = var11.field1876 / 2 + (var14 + (var11.field1860 * var130 >> 8));
                                                if (class217.field3516) {
                                                    if (var11.field1862) {
                                                        class217.method1478(var132, var131, var11.field1861, var11.field1793, var130, var129);
                                                    } else {
                                                        class217.method1453(var132, var131, var130, var129);
                                                        class217.method1465((float) var11.field1896, (float) var11.field1793 * 1.5F);
                                                    }
                                                    class217.method1483();
                                                    class217.method1460(true);
                                                    class217.method1473(false);
                                                    class147.method929(class87.field1228, (byte) -127);
                                                    if (class243.field4027) {
                                                        class13.method81();
                                                        class217.method1463();
                                                        class13.method76(arg1, arg5, arg4, arg2);
                                                        class243.field4027 = false;
                                                    }
                                                    if (var11.field1780) {
                                                        class217.method1479();
                                                    }
                                                    int var135 = class181.field2886[var11.field1820] * var11.field1861 >> 16;
                                                    int var136 = class181.field2884[var11.field1820] * var11.field1861 >> 16;
                                                    if (var11.field1794) {
                                                        var118.method160(0, var11.field1813, var11.field1790, var11.field1820, var11.field1823, var11.field1782 + var136 + var120, var135 - -var11.field1782, -1L);
                                                    } else {
                                                        var118.method160(0, var11.field1813, 0, var11.field1820, 0, var136, var135, -1L);
                                                    }
                                                    if (var11.field1780) {
                                                        class217.method1461();
                                                    }
                                                } else {
                                                    class181.method1186(var132, var131);
                                                    int var133 = class181.field2884[var11.field1820] * var11.field1861 >> 16;
                                                    int var134 = class181.field2886[var11.field1820] * var11.field1861 >> 16;
                                                    if (!var11.field1794) {
                                                        var118.method160(0, var11.field1813, 0, var11.field1820, 0, var133, var134, -1L);
                                                    } else if (var11.field1862) {
                                                        ((class21) var118).method150(0, var11.field1813, var11.field1790, var11.field1820, var11.field1823, var11.field1782 + var133 + var120, var11.field1782 + var134, var11.field1861);
                                                    } else {
                                                        var118.method160(0, var11.field1813, var11.field1790, var11.field1820, var11.field1823, var120 + var133 + var11.field1782, var134 - -var11.field1782, -1L);
                                                    }
                                                    class181.method1193();
                                                }
                                            }
                                        } else {
                                            label1074: {
                                                if (var11.field1902 == 7) {
                                                    class171 var91 = var11.method804(class49.field772, 0);
                                                    if (var91 == null) {
                                                        if (class128.field1966) {
                                                            class272.method1868(22889, var11);
                                                        }
                                                        break label1074;
                                                    }
                                                    int var92 = 0;
                                                    for (int var93 = 0; var93 < var11.field1802; var93++) {
                                                        for (int var94 = 0; var94 < var11.field1879; var94++) {
                                                            if (var11.field1833[var92] > 0) {
                                                                class312 var95 = class189.method1253((byte) 31, var11.field1833[var92] - 1);
                                                                class152 var96;
                                                                if (var95.field5375 != 1 && var11.field1837[var92] == 1) {
                                                                    var96 = class195.method1307(new class152[] { class179.field2844, var95.field5393, class307.field5279 }, (byte) 29);
                                                                } else {
                                                                    var96 = class195.method1307(new class152[] { class179.field2844, var95.field5393, class230.field3757, class20.method123((byte) 109, var11.field1837[var92]) }, (byte) 29);
                                                                }
                                                                int var97 = var14 + ((var11.field1946 + 115) * var94);
                                                                int var98 = var13 + ((var11.field1840 + 12) * var93);
                                                                if (var11.field1859 == 0) {
                                                                    var91.method1133(var96, var97, var98, var11.field1856, var11.field1905 ? 0 : -1);
                                                                } else if (var11.field1859 == 1) {
                                                                    var91.method1122(var96, var97 + 57, var98, var11.field1856, var11.field1905 ? 0 : -1);
                                                                } else {
                                                                    var91.method1135(var96, var97 + 115 - 1, var98, var11.field1856, var11.field1905 ? 0 : -1);
                                                                }
                                                            }
                                                            var92++;
                                                        }
                                                    }
                                                }
                                                if (var11.field1902 == 8 && class108.field1542 == var11 && class91.field1278 == class156.field2483) {
                                                    int var99 = 0;
                                                    int var100 = 0;
                                                    class152 var101 = var11.field1912;
                                                    class171 var102 = class305.field5238;
                                                    class152 var103 = class73.method496(var11, var101, -109);
                                                    while (var103.method1000(0) > 0) {
                                                        int var104 = var103.method988(class198.field3182, 0);
                                                        class152 var105;
                                                        if (var104 == -1) {
                                                            var105 = var103;
                                                            var103 = class201.field3252;
                                                        } else {
                                                            var105 = var103.method1015(0, 19197, var104);
                                                            var103 = var103.method983((byte) 88, var104 + 4);
                                                        }
                                                        int var106 = var102.method1123(var105);
                                                        var100 += var102.field2678 + 1;
                                                        if (var106 > var99) {
                                                            var99 = var106;
                                                        }
                                                    }
                                                    var100 += 7;
                                                    int var107 = var13 + var11.field1921 + 5;
                                                    var99 += 6;
                                                    if ((var100 + var107) > arg2) {
                                                        var107 = arg2 - var100;
                                                    }
                                                    int var108 = var14 + var11.field1876 - (var99 + 5);
                                                    if ((var14 + 5) > var108) {
                                                        var108 = var14 + 5;
                                                    }
                                                    if (arg4 < var99 + var108) {
                                                        var108 = arg4 - var99;
                                                    }
                                                    if (class217.field3516) {
                                                        class13.method78(var108, var107, var99, var100, 16777120);
                                                        class13.method68(var108, var107, var99, var100, 0);
                                                    } else {
                                                        class96.method635(var108, var107, var99, var100, 16777120);
                                                        class96.method648(var108, var107, var99, var100, 0);
                                                    }
                                                    int var109 = var102.field2678 + var107 + 2;
                                                    class152 var110 = var11.field1912;
                                                    class152 var111 = class73.method496(var11, var110, -126);
                                                    while (var111.method1000(0) > 0) {
                                                        int var112 = var111.method988(class198.field3182, 0);
                                                        class152 var113;
                                                        if (var112 == -1) {
                                                            var113 = var111;
                                                            var111 = class201.field3252;
                                                        } else {
                                                            var113 = var111.method1015(0, 19197, var112);
                                                            var111 = var111.method983((byte) 88, var112 + 4);
                                                        }
                                                        var102.method1133(var113, var108 + 3, var109, 0, -1);
                                                        var109 += var102.field2678 + 1;
                                                    }
                                                }
                                                if (var11.field1902 == 9) {
                                                    int var114;
                                                    int var115;
                                                    int var116;
                                                    int var117;
                                                    if (var11.field1889) {
                                                        var114 = var11.field1921 + var13;
                                                        var115 = var13;
                                                        var116 = var14 + var11.field1876;
                                                        var117 = var14;
                                                    } else {
                                                        var115 = var11.field1921 + var13;
                                                        var114 = var13;
                                                        var117 = var14;
                                                        var116 = var14 + var11.field1876;
                                                    }
                                                    if (var11.field1884 == 1) {
                                                        if (class217.field3516) {
                                                            class13.method77(var117, var114, var116, var115, var11.field1856);
                                                        } else {
                                                            class96.method649(var117, var114, var116, var115, var11.field1856);
                                                        }
                                                    } else if (class217.field3516) {
                                                        class13.method83(var117, var114, var116, var115, var11.field1856, var11.field1884);
                                                    } else {
                                                        class96.method645(var117, var114, var116, var115, var11.field1856, var11.field1884);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ldi;IIILjava/awt/Component;)Lle;", line = 2580)
    public static final class244 method1011(class151 arg0, int arg1, int arg2, int arg3, Component arg4) {
        field2420++;
        if (class252.field4337 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class244 var5 = (class244) Class.forName("ma").getDeclaredConstructor().newInstance();
                var5.field4053 = new int[arg2 * (class314.field5440 ? 2 : 1)];
                var5.field4070 = arg3;
                var5.method1679(arg4);
                var5.field4074 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field4074 > 16384) {
                    var5.field4074 = 16384;
                }
                var5.method1675(var5.field4074);
                if (class226.field3664 > 0 && class183.field2914 == null) {
                    class183.field2914 = new class277();
                    class183.field2914.field4747 = arg0;
                    arg0.method956(class226.field3664, 0, class183.field2914);
                }
                if (class183.field2914 != null) {
                    if (class183.field2914.field4751[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class183.field2914.field4751[arg1] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class301 var7 = new class301(arg0, arg1);
                    var7.field4070 = arg3;
                    var7.field4053 = new int[(class314.field5440 ? 2 : 1) * 256];
                    var7.method1679(arg4);
                    var7.field4074 = 16384;
                    var7.method1675(var7.field4074);
                    if (class226.field3664 > 0 && class183.field2914 == null) {
                        class183.field2914 = new class277();
                        class183.field2914.field4747 = arg0;
                        arg0.method956(class226.field3664, arg2 - 256, class183.field2914);
                    }
                    if (class183.field2914 != null) {
                        if (class183.field2914.field4751[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class183.field2914.field4751[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class244();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)Lwm;", line = 2661)
    public final class152 method1012(boolean arg0) {
        long var2 = this.method986(92);
        field2385++;
        synchronized (wm.class) {
            if (class49.field767 == null) {
                class49.field767 = new class231(4096);
            } else {
                for (class74 var5 = (class74) class49.field767.method1586(var2, -98); var5 != null; var5 = (class74) class49.field767.method1590(false)) {
                    if (this.method992(23292, var5.field1074)) {
                        return var5.field1074;
                    }
                }
            }
            class74 var6 = new class74();
            var6.field1074 = this;
            this.field2416 = arg0;
            class49.field767.method1593(var2, var6, 27497);
            return this;
        }
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)J", line = 2701)
    public final long method1013(int arg0) {
        field2428++;
        long var2 = 0L;
        int var4 = 0;
        if (arg0 != -18674) {
            this.method975((byte) -23);
        }
        while (var4 < this.field2371 && var4 < 12) {
            byte var5 = this.field2389[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
            var4++;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)Lwm;", line = 2738)
    public final class152 method1014(int arg0) {
        field2394++;
        return arg0 > -4 ? (class152) null : this;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(III)Lwm;", line = 2750)
    public final class152 method1015(int arg0, int arg1, int arg2) {
        if (arg1 != 19197) {
            return (class152) null;
        }
        field2369++;
        class152 var4 = new class152();
        var4.field2389 = new byte[arg2 - arg0];
        var4.field2371 = arg2 - arg0;
        class187.method1243(this.field2389, arg0, var4.field2389, 0, var4.field2371);
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 2768)
    public final boolean equals(Object arg0) {
        field2373++;
        if (!arg0 instanceof class152) {
            throw new IllegalArgumentException();
        }
        return this.method992(23292, (class152) arg0);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(III)Lwm;", line = 2785)
    public final class152 method1016(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        field2424++;
        if (arg1 != 90) {
            return (class152) null;
        }
        byte var5 = (byte) arg2;
        class152 var6 = new class152();
        var6.field2371 = this.field2371;
        var6.field2389 = new byte[this.field2371];
        for (int var7 = 0; var7 < this.field2371; var7++) {
            byte var8 = this.field2389[var7];
            if (var4 == var8) {
                var6.field2389[var7] = var5;
            } else {
                var6.field2389[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "(I)Ljava/net/URL;", line = 2821)
    public final URL method1017(int arg0) throws MalformedURLException {
        if (arg0 != 0) {
            this.field2389 = (byte[]) null;
        }
        field2418++;
        return new URL(new String(this.field2389, 0, this.field2371));
    }

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)[B", line = 2847)
    public final byte[] method1018(int arg0) {
        if (arg0 > -79) {
            field2430 = (class235) null;
        }
        byte[] var2 = new byte[this.field2371];
        class187.method1243(this.field2389, 0, var2, 0, this.field2371);
        field2392++;
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "hashCode", descriptor = "()I", line = 2864)
    public final int hashCode() {
        field2381++;
        return this.method979((byte) -93);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(ILjava/applet/Applet;)Ljava/lang/Object;", line = 2872)
    public final Object method1019(int arg0, Applet arg1) throws Throwable {
        if (arg0 < 86) {
            this.field2416 = true;
        }
        String var3 = new String(this.field2389, 0, this.field2371);
        Object var4 = class67.method425(var3, 5927, arg1);
        field2391++;
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class117.method775(var5, var5.length, (byte) 77, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)Lwm;", line = 2895)
    public final class152 method1020(int arg0, int arg1) {
        field2379++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class152 var3 = new class152();
        if (arg1 < 96) {
            this.method1002(-118, -18);
        }
        var3.field2389 = new byte[this.field2371 + 1];
        var3.field2371 = this.field2371 + 1;
        class187.method1243(this.field2389, 0, var3.field2389, 0, this.field2371);
        var3.field2389[this.field2371] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwm;II)I", line = 2917)
    public final int method1021(class152 arg0, int arg1, int arg2) {
        field2400++;
        int var4 = arg0.field2371;
        if (this.field2371 <= arg1) {
            return var4 == 0 ? this.field2371 : -1;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (var4 == 0) {
            return arg1;
        }
        byte[] var5 = arg0.field2389;
        byte var6 = var5[0];
        int var7 = this.field2371 - var4;
        for (int var8 = arg1; var8 <= var7; var8++) {
            if (this.field2389[var8] != var6) {
                do {
                    int var10000 = ~var7;
                    var8++;
                    if (var10000 > ~var8) {
                        return -1;
                    }
                } while (this.field2389[var8] != var6);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            for (int var11 = 1; var11 < var4; var11++) {
                if (this.field2389[var10] != var5[var11]) {
                    var9 = false;
                    break;
                }
                var10++;
            }
            if (var9) {
                return var8;
            }
        }
        if (arg2 == -18410) {
            return -1;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)Lwm;", line = 2996)
    public final class152 method1022(int arg0) {
        class152 var2 = new class152();
        field2423++;
        var2.field2371 = this.field2371;
        if (arg0 != -117) {
            this.method1000(39);
        }
        var2.field2389 = new byte[this.field2371];
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field2371; var4++) {
            byte var5 = this.field2389[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field2389[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field2389[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field2389[var4] = var5;
                var3 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(B)Lwm;", line = 3043)
    public final class152 method1023(byte arg0) {
        field2417++;
        class152 var2 = new class152();
        if (arg0 < 19) {
            this.field2371 = 18;
        }
        var2.field2371 = this.field2371;
        var2.field2389 = new byte[this.field2371];
        for (int var3 = 0; var3 < this.field2371; var3++) {
            byte var4 = this.field2389[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2389[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "(I)Lwm;", line = 3079)
    public final class152 method1024(int arg0) {
        field2419++;
        if (!this.field2416) {
            throw new IllegalArgumentException();
        } else if (arg0 == 0) {
            if (this.field2389.length != this.field2371) {
                byte[] var2 = new byte[this.field2371];
                class187.method1243(this.field2389, 0, var2, 0, this.field2371);
                this.field2389 = var2;
            }
            return this;
        } else {
            return (class152) null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "(I)Lwm;", line = 3107)
    public final class152 method1025(int arg0) {
        field2398++;
        int var2 = 0;
        int var3 = this.field2371;
        while (this.field2371 > var2 && (this.field2389[var2] >= 0 && this.field2389[var2] <= 32 || (this.field2389[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var3 > var2 && (this.field2389[var3 - 1] >= 0 && this.field2389[var3 - 1] <= 32 || (this.field2389[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field2371 == var3) {
            return this;
        }
        int var4 = -101 % ((-arg0 - 37) / 53);
        class152 var5 = new class152();
        var5.field2371 = var3 - var2;
        var5.field2389 = new byte[var5.field2371];
        for (int var6 = 0; var6 < var5.field2371; var6++) {
            var5.field2389[var6] = this.field2389[var2 + var6];
        }
        return var5;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Lwm;I)Z", line = 3154)
    public final boolean method1026(class152 arg0, int arg1) {
        field2390++;
        if (arg0.field2371 > this.field2371) {
            return false;
        }
        if (arg1 != 114130118) {
            this.method994(-94, 51, -122, (class152) null);
        }
        int var3 = this.field2371 - arg0.field2371;
        for (int var4 = 0; var4 < arg0.field2371; var4++) {
            if (this.field2389[var3 + var4] != arg0.field2389[var4]) {
                return false;
            }
        }
        return true;
    }
}
