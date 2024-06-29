import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class126 implements class171 {

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Z")
    private boolean field2154 = true;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "[B")
    public byte[] field2158;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lce;B)Lce;", line = 6)
    public final class126 method835(class126 arg0, byte arg1) {
        field2130++;
        if (!this.field2154) {
            throw new IllegalArgumentException();
        }
        if (this.field2158.length < this.field2140 + arg0.field2140) {
            int var3;
            for (var3 = 1; var3 < (this.field2140 + arg0.field2140); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class230.method1562(this.field2158, 0, var4, 0, this.field2140);
            this.field2158 = var4;
        }
        class230.method1562(arg0.field2158, 0, this.field2158, this.field2140, arg0.field2140);
        if (arg1 == -10) {
            this.field2140 += arg0.field2140;
            return this;
        } else {
            return (class126) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I", line = 50)
    public final int method836(int arg0) {
        if (arg0 != 31252) {
            this.field2140 = -42;
        }
        field2131++;
        return this.method864(10, (byte) 121);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 63)
    public final void method837(int arg0) {
        if (arg0 != 2) {
            this.field2140 = 117;
        }
        field2114++;
        String var2;
        try {
            var2 = new String(this.field2158, 0, this.field2140, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field2158, 0, this.field2140);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lce;", line = 85)
    public final class126 method838(byte arg0) {
        field2119++;
        class126 var2 = new class126();
        var2.field2140 = this.field2140;
        var2.field2158 = new byte[this.field2140];
        if (arg0 >= -57) {
            this.method883(4, (class126) null);
        }
        for (int var3 = 0; var3 < this.field2140; var3++) {
            byte var4 = this.field2158[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field2158[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lce;BI)I", line = 124)
    public final int method839(class126 arg0, byte arg1, int arg2) {
        field2149++;
        int var4 = arg0.field2140;
        if (this.field2140 <= arg2) {
            return var4 == 0 ? this.field2140 : -1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (var4 == 0) {
            return arg2;
        }
        int var5 = this.field2140 - var4;
        byte[] var6 = arg0.field2158;
        byte var7 = var6[0];
        if (arg1 >= -54) {
            this.field2140 = 78;
        }
        for (int var8 = arg2; var8 <= var5; var8++) {
            if (this.field2158[var8] != var7) {
                do {
                    var8++;
                    if (var5 < var8) {
                        return -1;
                    }
                } while (this.field2158[var8] != var7);
            }
            boolean var9 = true;
            int var10 = var8 + 1;
            for (int var11 = 1; var11 < var4; var11++) {
                if (this.field2158[var10] != var6[var11]) {
                    var9 = false;
                    break;
                }
                var10++;
            }
            if (var9) {
                return var8;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)J", line = 202)
    public final long method840(byte arg0) {
        if (arg0 != -40) {
            field2121 = 27;
        }
        long var2 = 0L;
        field2123++;
        for (int var4 = 0; var4 < this.field2140; var4++) {
            var2 = (var2 << 5) + (((long) (this.field2158[var4] & 0xFF)) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z", line = 223)
    public final boolean method841(int arg0) {
        field2115++;
        if (arg0 != -22923) {
            field2121 = 97;
        }
        return this.method876(71, 10);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Lce;", line = 237)
    public final class126 method842(byte arg0) {
        field2155++;
        if (arg0 > -22) {
            this.field2140 = -43;
        }
        class126 var2 = new class126();
        var2.field2140 = this.field2140;
        byte var3 = 2;
        var2.field2158 = new byte[this.field2140];
        for (int var4 = 0; var4 < this.field2140; var4++) {
            byte var5 = this.field2158[var4];
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
            var2.field2158[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I", line = 299)
    public final int method843(int arg0, byte arg1) {
        field2153++;
        return arg1 >= -74 ? -98 : this.field2158[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/applet/Applet;B)Ljava/lang/Object;", line = 313)
    public final Object method844(Applet arg0, byte arg1) throws Throwable {
        if (arg1 != -64) {
            field2121 = -4;
        }
        field2120++;
        String var3 = new String(this.field2158, 0, this.field2140);
        Object var4 = class92.method635(var3, -7455, arg0);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class301.method2021(0, var5.length, var5, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)J", line = 350)
    public final long method845(byte arg0) {
        field2138++;
        long var2 = 0L;
        for (int var4 = 0; this.field2140 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field2158[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 - 64);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 - 96);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (27 - (48 - var5));
            }
        }
        if (arg0 > -116) {
            this.method855(-127, (class126) null, 22, 96);
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lce;", line = 398)
    public final class126 method846(int arg0) {
        field2118++;
        long var2 = this.method840((byte) -40);
        synchronized (ce.class) {
            if (class257.field4321 == null) {
                class257.field4321 = new class237(4096);
            } else {
                for (class305 var5 = (class305) class257.field4321.method1631(false, var2); var5 != null; var5 = (class305) class257.field4321.method1633(0)) {
                    if (this.method872(var5.field5125, 0)) {
                        return var5.field5125;
                    }
                }
            }
            class305 var6 = new class305();
            if (arg0 <= 73) {
                this.method855(95, (class126) null, -3, -59);
            }
            this.field2154 = false;
            var6.field5125 = this;
            class257.field4321.method1636(11311, var6, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/net/URL;I)Ljava/net/URL;", line = 440)
    public final URL method847(URL arg0, int arg1) throws MalformedURLException {
        if (arg1 >= -4) {
            this.method862(-24, -38, 96);
        }
        field2142++;
        return new URL(arg0, new String(this.field2158, 0, this.field2140));
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILce;)Z", line = 451)
    public final boolean method848(int arg0, class126 arg1) {
        field2125++;
        if (arg1.field2140 > this.field2140) {
            return false;
        }
        int var3 = this.field2140 - arg1.field2140;
        int var4 = 0;
        int var5 = 69 % ((-arg0 - 9) / 50);
        while (arg1.field2140 > var4) {
            if (this.field2158[var4 + var3] != arg1.field2158[var4]) {
                return false;
            }
            var4++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)Lce;", line = 480)
    public final class126 method849(int arg0) {
        if (arg0 != 1) {
            this.field2154 = false;
        }
        field2135++;
        class126 var2 = class250.method1696(false, this.method845((byte) -123));
        return var2 == null ? class29.field402 : var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Lce;", line = 508)
    public final class126 method850(boolean arg0) {
        field2129++;
        if (!this.field2154) {
            throw new IllegalArgumentException();
        }
        if (arg0) {
            this.method880((byte) 101, (Applet) null);
        }
        if (this.field2158.length != this.field2140) {
            byte[] var2 = new byte[this.field2140];
            class230.method1562(this.field2158, 0, var2, 0, this.field2140);
            this.field2158 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Ljava/applet/Applet;B)V", line = 534)
    public final void method851(Applet arg0, byte arg1) throws Throwable {
        if (arg1 < 113) {
            this.method878((byte) 96);
        }
        String var3 = new String(this.field2158, 0, this.field2140);
        field2151++;
        class92.method634(var3, arg0, (byte) -69);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)Lce;", line = 548)
    public final class126 method852(int arg0, byte arg1) {
        field2162++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class126 var3 = new class126();
        int var4 = 121 / ((26 - arg1) / 49);
        var3.field2158 = new byte[this.field2140 + 1];
        var3.field2140 = this.field2140 + 1;
        class230.method1562(this.field2158, 0, var3.field2158, 0, this.field2140);
        var3.field2158[this.field2140] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 572)
    public final void method853(byte arg0, int arg1, int arg2, Graphics arg3) {
        String var5;
        try {
            var5 = new String(this.field2158, 0, this.field2140, "ISO-8859-1");
            int var6 = -112 / ((arg0 - 49) / 34);
        } catch (UnsupportedEncodingException var8) {
            var5 = new String(this.field2158, 0, this.field2140);
        }
        arg3.drawString(var5, arg2, arg1);
        field2163++;
    }

    @OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;", line = 588)
    public final String toString() {
        field2134++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Z", line = 601)
    public static final boolean method854(boolean arg0, int arg1) {
        field2124++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            if (arg0) {
                field2121 = -114;
            }
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ce", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 627)
    public final boolean equals(Object arg0) {
        field2168++;
        if (!arg0 instanceof class126) {
            throw new IllegalArgumentException();
        }
        return this.method872((class126) arg0, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILce;II)Lce;", line = 641)
    public final class126 method855(int arg0, class126 arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return (class126) null;
        }
        field2132++;
        if (!this.field2154) {
            throw new IllegalArgumentException();
        } else if (arg0 >= 0 && arg3 >= arg0 && arg1.field2140 >= arg3) {
            if (arg3 + this.field2140 - arg0 > this.field2158.length) {
                int var5;
                for (var5 = 1; var5 < (this.field2140 + arg1.field2140); var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class230.method1562(this.field2158, 0, var6, 0, this.field2140);
                this.field2158 = var6;
            }
            class230.method1562(arg1.field2158, arg0, this.field2158, this.field2140, arg3 - arg0);
            this.field2140 += arg3 - arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[Lce;", line = 688)
    public final class126[] method856(int arg0, int arg1) {
        field2122++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2140; var4++) {
            if (this.field2158[var4] == arg0) {
                var3++;
            }
        }
        class126[] var5 = new class126[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -42 % ((arg1 - 3) / 35);
        for (int var9 = 0; var9 < var3; var9++) {
            int var10;
            for (var10 = 0; this.field2158[var6 + var10] != arg0; var10++) {
            }
            var5[var7++] = this.method859(var6 + var10, -95, var6);
            var6 += var10 + 1;
        }
        var5[var3] = this.method859(this.field2140, 75, var6);
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)Lce;", line = 745)
    public final class126 method857(int arg0) {
        field2148++;
        class126 var2 = new class126();
        var2.field2140 = this.field2140;
        var2.field2158 = new byte[var2.field2140];
        for (int var3 = 0; var3 < this.field2140; var3++) {
            var2.field2158[this.field2140 - var3 - 1] = this.field2158[var3];
        }
        if (arg0 >= -61) {
            this.method868(-120, (FontMetrics) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLce;)Z", line = 773)
    public final boolean method858(byte arg0, class126 arg1) {
        field2133++;
        if (arg1.field2140 > this.field2140) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field2140; var3++) {
            byte var4 = this.field2158[var3];
            byte var5 = arg1.field2158[var3];
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
        if (arg0 != -23) {
            this.method881((class126) null, (byte) -73);
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lce;", line = 811)
    public final class126 method859(int arg0, int arg1, int arg2) {
        int var4 = 87 % ((arg1 + 39) / 51);
        field2139++;
        class126 var5 = new class126();
        var5.field2140 = arg0 - arg2;
        var5.field2158 = new byte[arg0 - arg2];
        class230.method1562(this.field2158, arg2, var5.field2158, 0, var5.field2140);
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)[B", line = 829)
    public final byte[] method860(byte arg0) {
        field2144++;
        if (arg0 != -49) {
            this.method835((class126) null, (byte) 121);
        }
        byte[] var2 = new byte[this.field2140];
        class230.method1562(this.field2158, 0, var2, 0, this.field2140);
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[BII)I", line = 853)
    public final int method861(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class230.method1562(this.field2158, arg3, arg2, arg4, arg0 - arg3);
        if (arg1 != -23450) {
            this.method853((byte) -33, 20, -75, (Graphics) null);
        }
        field2165++;
        return arg0 - arg3;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)I", line = 865)
    public final int method862(int arg0, int arg1, int arg2) {
        field2161++;
        byte var4 = (byte) arg0;
        int var5 = arg2;
        if (arg1 != -1) {
            this.field2158 = (byte[]) null;
        }
        while (this.field2140 > var5) {
            if (this.field2158[var5] == var4) {
                return var5;
            }
            var5++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lce;Lce;I)Lce;", line = 894)
    public final class126 method863(class126 arg0, class126 arg1, int arg2) {
        int var4 = this.field2140;
        int var5 = arg1.field2140 - arg0.field2140;
        field2136++;
        int var6 = 0;
        if (arg2 > -124) {
            this.field2158 = (byte[]) null;
        }
        while (true) {
            int var7 = this.method839(arg0, (byte) -96, var6);
            if (var7 < 0) {
                int var8 = 0;
                class126 var9 = class161.method1191(var4, (byte) -114);
                while (true) {
                    int var10 = this.method839(arg0, (byte) -125, var8);
                    if (var10 < 0) {
                        while (var8 < this.field2140) {
                            var9.method867((byte) 123, this.field2158[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var8 < var10) {
                        var9.method867((byte) 121, this.field2158[var8++] & 0xFF);
                    }
                    var9.method835(arg1, (byte) -10);
                    var8 += arg0.field2140;
                }
            }
            var4 += var5;
            var6 = arg0.field2140 + var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(IB)I", line = 956)
    public final int method864(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field2159++;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg1 <= 89) {
            this.method855(-14, (class126) null, 116, 21);
        }
        for (int var6 = 0; var6 < this.field2140; var6++) {
            int var7 = this.field2158[var6] & 0xFF;
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
            if (var7 >= arg0) {
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

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILce;)I", line = 1033)
    public final int method865(int arg0, class126 arg1) {
        field2126++;
        int var3 = 0;
        int var4 = 0;
        int var5 = this.field2140;
        int var6 = arg1.field2140;
        int var7 = this.field2140;
        int var8 = arg1.field2140;
        if (arg0 != 48) {
            this.method861(96, -119, (byte[]) null, -98, 86);
        }
        int var9 = 0;
        int var10 = 0;
        while (var5 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field2158[var10] & 0xFF;
                var10++;
            }
            if (class241.method1653(arg0 + 15646, var3)) {
                var7++;
            } else {
                var5--;
            }
            if (var4 == 156 || var4 == 230) {
                var4 = 101;
            } else if (var4 == 140 || var4 == 198) {
                var4 = 69;
            } else if (var4 == 223) {
                var4 = 115;
            } else {
                var4 = arg1.field2158[var9] & 0xFF;
                var9++;
            }
            if (class241.method1653(15694, var4)) {
                var8++;
            } else {
                var6--;
            }
            if (class293.field4857[var4] > class293.field4857[var3]) {
                return -1;
            }
            if (class293.field4857[var4] < class293.field4857[var3]) {
                return 1;
            }
        }
        if (var7 >= var8) {
            return var8 < var7 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)Lce;", line = 1123)
    public final class126 method866(int arg0, int arg1, int arg2) {
        field2150++;
        byte var4 = (byte) arg1;
        class126 var5 = new class126();
        var5.field2140 = this.field2140;
        var5.field2158 = new byte[this.field2140];
        if (arg2 != -16192) {
            return (class126) null;
        }
        byte var6 = (byte) arg0;
        for (int var7 = 0; var7 < this.field2140; var7++) {
            byte var8 = this.field2158[var7];
            if (var4 == var8) {
                var5.field2158[var7] = var6;
            } else {
                var5.field2158[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Lce;", line = 1160)
    public final class126 method867(byte arg0, int arg1) {
        field2145++;
        if (arg0 < 119) {
            return (class126) null;
        } else if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field2154) {
            if (this.field2158.length == this.field2140) {
                int var3;
                for (var3 = 1; var3 <= this.field2140; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class230.method1562(this.field2158, 0, var4, 0, this.field2140);
                this.field2158 = var4;
            }
            this.field2158[this.field2140++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 1198)
    public final int method868(int arg0, FontMetrics arg1) {
        field2113++;
        String var3;
        try {
            var3 = new String(this.field2158, arg0, this.field2140, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field2158, 0, this.field2140);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)Lce;", line = 1221)
    public final class126 method869(int arg0) {
        field2143++;
        boolean var2 = true;
        class126 var3 = new class126();
        var3.field2140 = this.field2140;
        var3.field2158 = new byte[this.field2140];
        int var4 = 5 / ((68 - arg0) / 55);
        for (int var5 = 0; var5 < this.field2140; var5++) {
            byte var6 = this.field2158[var5];
            if (var6 == 95) {
                var3.field2158[var5] = 32;
                var2 = true;
            } else if (var6 >= 97 && var6 <= 122 && var2) {
                var2 = false;
                var3.field2158[var5] = (byte) (var6 - 32);
            } else {
                var3.field2158[var5] = var6;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V", line = 1272)
    public final void method870(int arg0, int arg1) {
        field2128++;
        if (!this.field2154) {
            throw new IllegalArgumentException();
        } else if (arg1 < ~arg0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field2158.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class230.method1562(this.field2158, 0, var4, 0, this.field2140);
                this.field2158 = var4;
            }
            for (int var5 = this.field2140; var5 < arg0; var5++) {
                this.field2158[var5] = 32;
            }
            this.field2140 = arg0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLcc;)V", line = 1316)
    public static final void method871(boolean arg0, class313 arg1) {
        class157.field2833 = arg1.method2176(class274.field4615, 0);
        field2146++;
        class85.field1349 = arg1.method2176(class205.field3522, 0);
        class300.field4966 = arg1.method2176(class32.field474, 0);
        class291.field4822 = arg1.method2176(class190.field3260, 0);
        class129.field2218 = arg1.method2176(class257.field4320, 0);
        class305.field5126 = arg1.method2176(class292.field4836, 0);
        if (!arg0) {
            return;
        }
        class159.field2878 = arg1.method2176(class64.field1081, 0);
        class226.field3809 = arg1.method2176(class33.field485, 0);
        class290.field4811 = arg1.method2176(class226.field3799, 0);
        class283.field4703 = arg1.method2176(class76.field1243, 0);
        class112.field1873 = arg1.method2176(class221.field3740, 0);
        class93.field1459 = arg1.method2176(class205.field3521, 0);
        class59.field952 = arg1.method2176(class39.field616, 0);
        class182.field3172 = arg1.method2176(class37.field548, 0);
        class304.field5082 = arg1.method2176(class212.field3610, 0);
        class300.field4971 = arg1.method2176(client.field2074, 0);
        class194.field3301 = arg1.method2176(class87.field1359, 0);
        class140.field2566 = arg1.method2176(class105.field1662, 0);
        class103.field1650 = arg1.method2176(class221.field3733, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lce;I)Z", line = 1346)
    public final boolean method872(class126 arg0, int arg1) {
        field2127++;
        if (arg0 == null) {
            return false;
        } else if (arg0 == this) {
            return true;
        } else if (this.field2140 == arg0.field2140) {
            byte[] var3 = arg0.field2158;
            byte[] var4 = this.field2158;
            for (int var5 = arg1; var5 < this.field2140; var5++) {
                if (var3[var5] != var4[var5]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)I", line = 1379)
    public final int method873(boolean arg0) {
        field2152++;
        if (arg0) {
            return -70;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2140; var3++) {
            var2 = (var2 << 5) + ((this.field2158[var3] & 0xFF) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)Ljava/net/URL;", line = 1405)
    public final URL method874(int arg0) throws MalformedURLException {
        field2164++;
        if (arg0 != 0) {
            this.method866(-50, -48, -125);
        }
        return new URL(new String(this.field2158, 0, this.field2140));
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lce;I)I", line = 1420)
    public final int method875(class126 arg0, int arg1) {
        field2166++;
        return arg1 > -13 ? -49 : this.method839(arg0, (byte) -81, 0);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)Z", line = 1434)
    private final boolean method876(int arg0, int arg1) {
        field2117++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = -37 % ((-arg0 - 60) / 46);
        for (int var7 = 0; var7 < this.field2140; var7++) {
            int var8 = this.field2158[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var3 = true;
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
            if (arg1 <= var8) {
                return false;
            }
            if (var3) {
                var8 = -var8;
            }
            int var9 = arg1 * var5 + var8;
            if (var9 / arg1 != var5) {
                return false;
            }
            var5 = var9;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)Lce;", line = 1509)
    public final class126 method877(int arg0) {
        field2141++;
        int var2 = 0;
        int var3 = this.field2140;
        while (this.field2140 > var2 && (this.field2158[var2] >= 0 && this.field2158[var2] <= 32 || (this.field2158[var2] & 0xFF) == 160)) {
            var2++;
        }
        while (var2 < var3 && (this.field2158[var3 - 1] >= 0 && this.field2158[var3 - 1] <= 32 || (this.field2158[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field2140 == var3) {
            return this;
        }
        class126 var4 = new class126();
        var4.field2140 = var3 - var2;
        var4.field2158 = new byte[var4.field2140];
        if (arg0 > -105) {
            this.field2154 = false;
        }
        for (int var5 = 0; var5 < var4.field2140; var5++) {
            var4.field2158[var5] = this.field2158[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(B)I", line = 1548)
    public final int method878(byte arg0) {
        field2156++;
        int var2 = 45 % ((-arg0 - 6) / 37);
        return this.field2140;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)Lce;", line = 1558)
    public final class126 method879(int arg0, int arg1) {
        if (arg0 == -14178) {
            field2157++;
            return this.method859(this.field2140, 16, arg1);
        } else {
            return (class126) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "hashCode", descriptor = "()I", line = 1580)
    public final int hashCode() {
        field2137++;
        return this.method873(false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLjava/applet/Applet;)Lce;", line = 1589)
    public final class126 method880(byte arg0, Applet arg1) {
        String var3 = new String(this.field2158, 0, this.field2140);
        field2116++;
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 >= -46) {
                this.method868(-75, (FontMetrics) null);
            }
            return class82.method584((byte) 80, var4);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lce;B)Z", line = 1610)
    public final boolean method881(class126 arg0, byte arg1) {
        field2167++;
        if (arg0 == null) {
            return false;
        } else if (this.field2140 == arg0.field2140) {
            for (int var3 = 0; var3 < this.field2140; var3++) {
                byte var4 = arg0.field2158[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = this.field2158[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 == 92) {
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BLce;)I", line = 1654)
    public final int method882(byte arg0, class126 arg1) {
        int var3;
        if (this.field2140 > arg1.field2140) {
            var3 = arg1.field2140;
        } else {
            var3 = this.field2140;
        }
        field2160++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field2158[var4] & 0xFF) > (this.field2158[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field2158[var4] & 0xFF) < (this.field2158[var4] & 0xFF)) {
                return 1;
            }
        }
        if (arg1.field2140 > this.field2140) {
            return -1;
        }
        if (arg0 <= 15) {
            this.method878((byte) -2);
        }
        if (arg1.field2140 >= this.field2140) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(ILce;)Z", line = 1692)
    public final boolean method883(int arg0, class126 arg1) {
        field2147++;
        if (arg1.field2140 > this.field2140) {
            return false;
        }
        for (int var3 = arg0; var3 < arg1.field2140; var3++) {
            if (this.field2158[var3] != arg1.field2158[var3]) {
                return false;
            }
        }
        return true;
    }
}
