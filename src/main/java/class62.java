import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class62 implements class13 {

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "Z")
    private boolean field936 = true;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Lmh;")
    public static class62 field903 = class201.method1405(true, "um");

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lmh;")
    public static class62 field884 = class201.method1405(true, "gelb:");

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "Lmh;")
    private static class62 field927 = class201.method1405(true, "white:");

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "Lmh;")
    public static class62 field890 = field927;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "Lmh;")
    public static class62 field942 = class201.method1405(true, "loginscreen");

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "[[Z")
    public static boolean[][] field909 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    public static int field934 = -1;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lmh;")
    public static class62 field931 = field927;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Lsk;")
    public static class199 field899 = new class199(30);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!mh", name = "lb", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!mh", name = "mb", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!mh", name = "nb", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!mh", name = "ob", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!mh", name = "pb", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!mh", name = "qb", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!mh", name = "rb", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!mh", name = "sb", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "[B")
    public byte[] field906;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;Z)Lmh;", line = 4)
    public final class62 method403(class62 arg0, boolean arg1) {
        field908++;
        if (!this.field936) {
            throw new IllegalArgumentException();
        }
        this.field912 = 0;
        if (arg1) {
            this.method426((byte) 65);
        }
        if (this.field906.length < (this.field893 + arg0.field893)) {
            int var3;
            for (var3 = 1; var3 < (this.field893 + arg0.field893); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class231.method1635(this.field906, 0, var4, 0, this.field893);
            this.field906 = var4;
        }
        class231.method1635(arg0.field906, 0, this.field906, this.field893, arg0.field893);
        this.field893 += arg0.field893;
        return this;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)[B", line = 50)
    public final byte[] method404(int arg0) {
        if (arg0 != -231) {
            this.method415((byte) -4);
        }
        byte[] var2 = new byte[this.field893];
        field900++;
        class231.method1635(this.field906, 0, var2, 0, this.field893);
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)J", line = 64)
    public final long method405(int arg0) {
        field914++;
        if (arg0 > -49) {
            return -89L;
        }
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field893; var4++) {
            var2 = (var2 << 5) + ((long) (this.field906[var4] & 0xFF)) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/applet/Applet;)Ljava/lang/Object;", line = 93)
    public final Object method406(byte arg0, Applet arg1) throws Throwable {
        field904++;
        String var3 = new String(this.field906, 0, this.field893);
        Object var4 = class128.method953(101, arg1, var3, (Object[]) null);
        if (arg0 != 61) {
            this.method450(5, (byte) -34);
        }
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class266.method1833(0, var5.length, var5, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Lmh;", line = 122)
    public final class62 method407(int arg0, int arg1) {
        field886++;
        if (arg1 != 15552) {
            field899 = (class199) null;
        }
        return this.method429(this.field893, arg0, true);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Lmh;", line = 138)
    public final class62 method408(int arg0) {
        field940++;
        class62 var2 = new class62();
        if (arg0 != -1) {
            this.field893 = 8;
        }
        var2.field893 = this.field893;
        var2.field906 = new byte[var2.field893];
        for (int var3 = 0; var3 < this.field893; var3++) {
            var2.field906[this.field893 - var3 - 1] = this.field906[var3];
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V", line = 161)
    public final void method409(Graphics arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.method405(-54);
        }
        String var5;
        try {
            var5 = new String(this.field906, 0, this.field893, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field906, 0, this.field893);
        }
        arg0.drawString(var5, arg1, arg3);
        field949++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)I", line = 180)
    public final int method410(int arg0, int arg1, int arg2) {
        field911++;
        if (arg1 != 1) {
            this.method409((Graphics) null, -117, false, -73);
        }
        byte var4 = (byte) arg2;
        for (int var5 = arg0; var5 < this.field893; var5++) {
            if (this.field906[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)Z", line = 205)
    private final boolean method411(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field920++;
        boolean var3 = false;
        if (arg1 < 22) {
            return false;
        }
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field893; var6++) {
            int var7 = this.field906[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var5 = true;
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
            if (var5) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                return false;
            }
            var4 = var8;
            var3 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILtd;)V", line = 282)
    public static final void method412(int arg0, class222 arg1) {
        if (class199.field3367 == arg1.field3837 || arg1.field3836 == -1 || arg1.field3843 != 0 || arg1.field3849 + 1 > class151.method1085(arg1.field3836, (byte) 110).field1555[arg1.field3872]) {
            int var2 = class199.field3367 - arg1.field3852;
            int var3 = arg1.field3837 - arg1.field3852;
            int var4 = arg1.field3842 * 128 + arg1.method1101(true) * 64;
            int var5 = arg1.field3865 * 128 + (arg1.method1101(true) * 64);
            int var6 = arg1.field3878 * 128 + (arg1.method1101(true) * 64);
            int var7 = arg1.field3866 * 128 + (arg1.method1101(true) * 64);
            arg1.field3821 = ((var3 - var2) * var4 + var2 * var6) / var3;
            arg1.field3814 = ((var3 - var2) * var5 + var2 * var7) / var3;
        }
        if (arg1.field3809 == 0) {
            arg1.field3862 = 1024;
        }
        field937++;
        if (arg0 >= -11) {
            method412(40, (class222) null);
        }
        if (arg1.field3809 == 1) {
            arg1.field3862 = 1536;
        }
        arg1.field3858 = 0;
        if (arg1.field3809 == 2) {
            arg1.field3862 = 0;
        }
        if (arg1.field3809 == 3) {
            arg1.field3862 = 512;
        }
        arg1.field3856 = arg1.field3862;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)Lmh;", line = 326)
    public final class62 method413(int arg0) {
        field882++;
        if (arg0 != 17384) {
            field884 = (class62) null;
        }
        class62 var2 = class170.method1227(0, this.method451(arg0 - 17336));
        return var2 == null ? class195.field3294 : var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLmh;)Z", line = 345)
    public final boolean method414(byte arg0, class62 arg1) {
        field947++;
        if (arg1.field893 > this.field893) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field893; var3++) {
            if (this.field906[var3] != arg1.field906[var3]) {
                return false;
            }
        }
        if (arg0 != -39) {
            field909 = (boolean[][]) ((boolean[][]) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)I", line = 369)
    public final int method415(byte arg0) {
        field950++;
        if (arg0 < 46) {
            this.method408(107);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field893; var3++) {
            var2 = (var2 << 5) + (this.field906[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)Z", line = 388)
    public static final boolean method416(int arg0, int arg1, int arg2) {
        int var3 = class183.field2926[arg0][arg1][arg2];
        if (-class187.field2992 == var3) {
            return false;
        } else if (class187.field2992 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class201.method1411(var4 + 1, class37.field569[arg0][arg1][arg2], var5 + 1) && class201.method1411(var4 + 128 - 1, class37.field569[arg0][arg1 + 1][arg2], var5 + 1) && class201.method1411(var4 + 128 - 1, class37.field569[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class201.method1411(var4 + 1, class37.field569[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class183.field2926[arg0][arg1][arg2] = class187.field2992;
                return true;
            } else {
                class183.field2926[arg0][arg1][arg2] = -class187.field2992;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)I", line = 413)
    public final int method417(int arg0, byte arg1) {
        if (arg1 < 116) {
            field934 = -99;
        }
        field907++;
        return this.method410(0, 1, arg0);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 434)
    public final int method418(int arg0, FontMetrics arg1) {
        field913++;
        String var3;
        try {
            var3 = new String(this.field906, arg0, this.field893, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field906, 0, this.field893);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)Lmh;", line = 452)
    public final class62 method419(int arg0) {
        field889++;
        if (arg0 != 28768) {
            this.method451(89);
        }
        boolean var2 = true;
        class62 var3 = new class62();
        var3.field893 = this.field893;
        var3.field906 = new byte[this.field893];
        for (int var4 = 0; var4 < this.field893; var4++) {
            byte var5 = this.field906[var4];
            if (var5 == 95) {
                var2 = true;
                var3.field906[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var3.field906[var4] = (byte) (var5 - 32);
                var2 = false;
            } else {
                var2 = false;
                var3.field906[var4] = var5;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[Lmh;", line = 497)
    public final class62[] method420(byte arg0, int arg1) {
        if (arg0 != 21) {
            return (class62[]) null;
        }
        field897++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field893; var4++) {
            if (this.field906[var4] == arg1) {
                var3++;
            }
        }
        class62[] var5 = new class62[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = 0; this.field906[var6 + var9] != arg1; var9++) {
            }
            var5[var7++] = this.method429(var6 + var9, var6, true);
            var6 += var9 + 1;
        }
        var5[var3] = this.method429(this.field893, var6, true);
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Lmh;", line = 553)
    public final class62 method421(byte arg0) {
        field917++;
        long var2 = this.method405(arg0 - 94);
        synchronized (mh.class) {
            if (class232.field4008 == null) {
                class232.field4008 = new class49(4096);
            } else {
                for (class113 var5 = (class113) class232.field4008.method311((byte) 114, var2); var5 != null; var5 = (class113) class232.field4008.method310(127)) {
                    if (this.method446((byte) -111, var5.field1867)) {
                        return var5.field1867;
                    }
                }
            }
            class113 var6 = new class113();
            this.field936 = false;
            var6.field1867 = this;
            if (arg0 == 29) {
                class232.field4008.method309(var6, var2, 1);
                return this;
            } else {
                return (class62) null;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILmh;I)Lmh;", line = 593)
    public final class62 method422(int arg0, int arg1, class62 arg2, int arg3) {
        field932++;
        if (!this.field936) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg0 >= arg3 && arg0 <= arg2.field893) {
            if (arg1 != 65) {
                field903 = (class62) null;
            }
            this.field912 = 0;
            if ((this.field893 + arg0 - arg3) > this.field906.length) {
                int var5;
                for (var5 = 1; var5 < this.field893 + arg2.field893; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class231.method1635(this.field906, 0, var6, 0, this.field893);
                this.field906 = var6;
            }
            class231.method1635(arg2.field906, arg3, this.field906, this.field893, arg0 - arg3);
            this.field893 += arg0 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)I", line = 646)
    public final int method423(byte arg0, int arg1) {
        if (arg0 >= -2) {
            field890 = (class62) null;
        }
        field919++;
        byte var3 = (byte) arg1;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field893; var5++) {
            if (this.field906[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "hashCode", descriptor = "()I", line = 676)
    public final int hashCode() {
        field923++;
        return this.method415((byte) 100);
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)[B", line = 685)
    public final byte[] method424(int arg0) {
        field895++;
        if (this.field893 == 0) {
            return new byte[0];
        }
        if (arg0 != 10) {
            this.method415((byte) -59);
        }
        int var2 = this.field893 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (this.field893 <= (var2 - 2) || class55.method357(arg0 ^ 0x74, this.field906[var2 - 2]) == -1) {
            var3 -= 2;
        } else if ((var2 - 1) >= this.field893 || class55.method357(arg0 ^ 0x6C, this.field906[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method425(0, -99, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[B)I", line = 715)
    private final int method425(int arg0, int arg1, byte[] arg2) {
        field898++;
        int var4 = arg0;
        if (arg1 > -40) {
            return -22;
        }
        for (int var5 = 0; var5 < this.field893; var5 += 4) {
            int var6 = class55.method357(78, this.field906[var5]);
            int var7 = (var5 + 1) >= this.field893 ? -1 : class55.method357(103, this.field906[var5 + 1]);
            int var8 = this.field893 <= var5 + 2 ? -1 : class55.method357(73, this.field906[var5 + 2]);
            int var9 = var5 + 3 >= this.field893 ? -1 : class55.method357(120, this.field906[var5 + 3]);
            arg2[arg0++] = (byte) class270.method1854(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class270.method1854(var8 >>> 2, class234.method1648(var7 << 4, 240));
            if (var9 == -1) {
                break;
            }
            arg2[arg0++] = (byte) class270.method1854(class234.method1648(var8, 3) << 6, var9);
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V", line = 756)
    public final void method426(byte arg0) {
        field896++;
        int var2 = 122 % ((arg0 - 38) / 61);
        String var3;
        try {
            var3 = new String(this.field906, 0, this.field893, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field906, 0, this.field893);
        }
        System.out.println(var3);
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Lmh;", line = 774)
    public final class62 method427(int arg0) {
        field916++;
        class62 var2 = new class62();
        var2.field893 = this.field893;
        var2.field906 = new byte[this.field893];
        byte var3 = 2;
        for (int var4 = 0; var4 < this.field893; var4++) {
            byte var5 = this.field906[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var2.field906[var4] = var5;
        }
        if (arg0 != 22874) {
            this.method440((byte) -68);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[BIB)I", line = 835)
    public final int method428(int arg0, int arg1, byte[] arg2, int arg3, byte arg4) {
        if (arg4 != 18) {
            this.field912 = -48;
        }
        field935++;
        class231.method1635(this.field906, arg0, arg2, arg1, arg3 - arg0);
        return arg3 - arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ)Lmh;", line = 859)
    public final class62 method429(int arg0, int arg1, boolean arg2) {
        field883++;
        class62 var4 = new class62();
        var4.field893 = arg0 - arg1;
        var4.field906 = new byte[arg0 - arg1];
        class231.method1635(this.field906, arg1, var4.field906, 0, var4.field893);
        return arg2 ? var4 : (class62) null;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)Lmh;", line = 874)
    public final class62 method430(int arg0) {
        field887++;
        class62 var2 = new class62();
        var2.field893 = this.field893;
        var2.field906 = new byte[this.field893];
        if (arg0 != 11645) {
            field927 = (class62) null;
        }
        for (int var3 = 0; var3 < this.field893; var3++) {
            byte var4 = this.field906[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field906[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)I", line = 904)
    public final int method431(int arg0) {
        if (arg0 != 64) {
            this.method447((byte) -23);
        }
        field930++;
        return this.method450(10, (byte) 120);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILhi;I)Lwj;", line = 915)
    public static final class135 method432(int arg0, int arg1, class26 arg2, int arg3) {
        field924++;
        if (arg3 == 0) {
            return class127.method951(arg2, arg1, arg3 ^ 0xFFFFFFD7, arg0) ? class12.method50(arg3) : null;
        } else {
            return (class135) null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "(I)Ljava/net/URL;", line = 930)
    public final URL method433(int arg0) throws MalformedURLException {
        if (arg0 <= 100) {
            return (URL) null;
        } else {
            field901++;
            return new URL(new String(this.field906, 0, this.field893));
        }
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "(I)Lmh;", line = 945)
    public final class62 method434(int arg0) {
        if (arg0 > -43) {
            return (class62) null;
        }
        field888++;
        if (!this.field936) {
            throw new IllegalArgumentException();
        }
        this.field912 = 0;
        if (this.field906.length != this.field893) {
            byte[] var2 = new byte[this.field893];
            class231.method1635(this.field906, 0, var2, 0, this.field893);
            this.field906 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BLjava/applet/Applet;)Lmh;", line = 978)
    public final class62 method435(byte arg0, Applet arg1) {
        field933++;
        String var3 = new String(this.field906, 0, this.field893);
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != 36) {
                this.method418(-76, (FontMetrics) null);
            }
            return class24.method123(var4, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;I)Z", line = 996)
    public final boolean method436(class62 arg0, int arg1) {
        field946++;
        if (arg0 == null) {
            return false;
        } else if (this.field893 == arg0.field893) {
            for (int var3 = 0; var3 < this.field893; var3++) {
                byte var4 = this.field906[var3];
                byte var5 = arg0.field906[var3];
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
            if (arg1 != 32) {
                this.method415((byte) 121);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLmh;I)I", line = 1035)
    public final int method437(boolean arg0, class62 arg1, int arg2) {
        field905++;
        int[] var4 = new int[256];
        int[] var5 = new int[arg1.field893];
        int[] var6 = new int[arg1.field893];
        for (int var7 = 0; var7 < var4.length; var7++) {
            var4[var7] = arg1.field893;
        }
        for (int var8 = 1; var8 <= arg1.field893; var8++) {
            var5[var8 - 1] = (arg1.field893 << 1) - var8;
            var4[class234.method1648(arg1.field906[var8 - 1], 255)] = arg1.field893 - var8;
        }
        int var9 = arg1.field893 + 1;
        int var10 = arg1.field893;
        if (!arg0) {
            return -26;
        }
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field893 && arg1.field906[var9 - 1] != arg1.field906[var10 - 1]) {
                if ((arg1.field893 - var10) <= var5[var9 - 1]) {
                    var5[var9 - 1] = arg1.field893 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
            var10--;
        }
        int var11 = 0;
        int var12 = 1;
        int var13 = var9;
        int var14 = arg1.field893 + 1 - var9;
        int var15 = 1;
        while (var14 >= var15) {
            var6[var15 - 1] = var11;
            while (var11 >= 1 && arg1.field906[var11 - 1] != arg1.field906[var15 - 1]) {
                var11 = var6[var11 - 1];
            }
            var15++;
            var11++;
        }
        while (var13 < arg1.field893) {
            for (int var16 = var12; var16 <= var13; var16++) {
                if (var5[var16 - 1] >= (arg1.field893 + var13 - var16)) {
                    var5[var16 - 1] = arg1.field893 + var13 - var16;
                }
            }
            var12 = var13 + 1;
            var13 = var13 + var14 - var6[var14 - 1];
            var14 = var6[var14 - 1];
        }
        int var18;
        for (int var17 = arg2 + arg1.field893 - 1; var17 < this.field893; var17 += Math.max(var4[this.field906[var17] & 0xFF], var5[var18])) {
            for (var18 = arg1.field893 - 1; var18 >= 0 && this.field906[var17] == arg1.field906[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILmh;)Z", line = 1161)
    public final boolean method438(int arg0, class62 arg1) {
        if (arg0 != -11489) {
            return true;
        }
        field951++;
        if (this.field893 < arg1.field893) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field893; var3++) {
            byte var4 = this.field906[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field906[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "toString", descriptor = "()Ljava/lang/String;", line = 1200)
    public final String toString() {
        field941++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "(I)I", line = 1214)
    public final int method439(int arg0) {
        field948++;
        int var2 = 110 % ((41 - arg0) / 37);
        return this.field893;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)Lmh;", line = 1225)
    public final class62 method440(byte arg0) {
        field943++;
        int var2 = 0;
        if (arg0 < 44) {
            field927 = (class62) null;
        }
        while (var2 < this.field893 && (this.field906[var2] >= 0 && this.field906[var2] <= 32 || (this.field906[var2] & 0xFF) == 160)) {
            var2++;
        }
        int var3;
        for (var3 = this.field893; var2 < var3 && (this.field906[var3 - 1] >= 0 && this.field906[var3 - 1] <= 32 || (this.field906[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field893 == var3) {
            return this;
        }
        class62 var4 = new class62();
        var4.field893 = var3 - var2;
        var4.field906 = new byte[var4.field893];
        for (int var5 = 0; var5 < var4.field893; var5++) {
            var4.field906[var5] = this.field906[var2 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1271)
    public final boolean equals(Object arg0) {
        field894++;
        if (!(arg0 instanceof class62)) {
            throw new IllegalArgumentException();
        }
        return this.method446((byte) 74, (class62) arg0);
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "(I)V", line = 1285)
    public static void method441(int arg0) {
        field899 = null;
        if (arg0 != -18161) {
            method416(74, 105, 29);
        }
        field890 = null;
        field909 = (boolean[][]) null;
        field931 = null;
        field927 = null;
        field942 = null;
        field884 = null;
        field903 = null;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BLmh;)Z", line = 1305)
    public final boolean method442(byte arg0, class62 arg1) {
        field945++;
        if (this.field893 < arg1.field893) {
            return false;
        }
        if (arg0 > -10) {
            this.method408(2);
        }
        int var3 = this.field893 - arg1.field893;
        for (int var4 = 0; var4 < arg1.field893; var4++) {
            if (this.field906[var3 + var4] != arg1.field906[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;B)I", line = 1332)
    public final int method443(class62 arg0, byte arg1) {
        field944++;
        int var3 = 0;
        if (arg1 != -49) {
            return 97;
        }
        int var4 = 0;
        int var5 = this.field893;
        int var6 = arg0.field893;
        int var7 = this.field893;
        int var8 = arg0.field893;
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
                var3 = this.field906[var10] & 0xFF;
                var10++;
            }
            if (class256.method1782(var3, -83)) {
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
                var4 = arg0.field906[var9] & 0xFF;
                var9++;
            }
            if (class256.method1782(var4, arg1 - 75)) {
                var8++;
            } else {
                var6--;
            }
            if (class166.field2721[var3] < class166.field2721[var4]) {
                return -1;
            }
            if (class166.field2721[var4] < class166.field2721[var3]) {
                return 1;
            }
        }
        if (var8 <= var7) {
            return var7 > var8 ? 1 : 0;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/applet/Applet;B)V", line = 1422)
    public final void method444(Applet arg0, byte arg1) throws Throwable {
        field939++;
        int var3 = 39 % ((arg1 - 48) / 56);
        String var4 = new String(this.field906, 0, this.field893);
        class128.method954(arg0, 5510, var4);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmh;Lmh;I)Lmh;", line = 1439)
    public final class62 method445(class62 arg0, class62 arg1, int arg2) {
        field892++;
        int var4 = this.field893;
        int var5 = arg1.field893 - arg0.field893;
        int var6 = 0;
        while (true) {
            int var7 = this.method437(true, arg0, var6);
            if (var7 < 0) {
                class62 var8 = class296.method2005(var4, -1757618132);
                int var9 = 0;
                if (arg2 != 16058) {
                    return (class62) null;
                }
                while (true) {
                    int var10 = this.method437(true, arg0, var9);
                    if (var10 < 0) {
                        while (var9 < this.field893) {
                            var8.method449((byte) -71, this.field906[var9++] & 0xFF);
                        }
                        return var8;
                    }
                    while (var9 < var10) {
                        var8.method449((byte) -128, this.field906[var9++] & 0xFF);
                    }
                    var8.method403(arg1, false);
                    var9 += arg0.field893;
                }
            }
            var4 += var5;
            var6 = arg0.field893 + var7;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(BLmh;)Z", line = 1493)
    public final boolean method446(byte arg0, class62 arg1) {
        field928++;
        if (arg1 == null) {
            return false;
        } else if (this.field893 == arg1.field893) {
            if (!this.field936 || !arg1.field936) {
                if (this.field912 == 0) {
                    this.field912 = this.method415((byte) 121);
                    if (this.field912 == 0) {
                        this.field912 = 1;
                    }
                }
                if (arg1.field912 == 0) {
                    arg1.field912 = arg1.method415((byte) 73);
                    if (arg1.field912 == 0) {
                        arg1.field912 = 1;
                    }
                }
                if (this.field912 != arg1.field912) {
                    return false;
                }
            }
            int var3 = 0;
            int var4 = 93 / ((17 - arg0) / 38);
            while (this.field893 > var3) {
                if (this.field906[var3] != arg1.field906[var3]) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)Z", line = 1559)
    public final boolean method447(byte arg0) {
        field925++;
        if (arg0 != -59) {
            this.field912 = 9;
        }
        return this.method411(10, (byte) 35);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V", line = 1576)
    public final void method448(int arg0, int arg1) {
        this.field912 = 0;
        field918++;
        if (!this.field936) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (this.field906.length < arg0) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class231.method1635(this.field906, 0, var4, 0, this.field893);
                this.field906 = var4;
            }
            if (arg1 != -4269) {
                this.method426((byte) -21);
            }
            for (int var5 = this.field893; var5 < arg0; var5++) {
                this.field906[var5] = 32;
            }
            this.field893 = arg0;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(BI)Lmh;", line = 1657)
    public final class62 method449(byte arg0, int arg1) {
        field926++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field936) {
            this.field912 = 0;
            if (this.field906.length == this.field893) {
                int var3;
                for (var3 = 1; var3 <= this.field893; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class231.method1635(this.field906, 0, var4, 0, this.field893);
                this.field906 = var4;
            }
            this.field906[this.field893++] = (byte) arg1;
            return arg0 >= -39 ? (class62) null : this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IB)I", line = 1706)
    public final int method450(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        field915++;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        if (arg1 <= 105) {
            return 1;
        }
        while (this.field893 > var6) {
            label83: {
                int var7 = this.field906[var6] & 0xFF;
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
                var5 = var8;
                var4 = true;
            }
            var6++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "(I)J", line = 1785)
    public final long method451(int arg0) {
        if (arg0 <= 27) {
            this.method429(78, -61, false);
        }
        long var2 = 0L;
        field929++;
        for (int var4 = 0; var4 < this.field893 && var4 < 12; var4++) {
            byte var5 = this.field906[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (1 - (65 - var5));
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (27 - (48 - var5));
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(ILmh;)I", line = 1826)
    public final int method452(int arg0, class62 arg1) {
        field938++;
        int var3;
        if (this.field893 > arg1.field893) {
            var3 = arg1.field893;
        } else {
            var3 = this.field893;
        }
        if (arg0 <= 47) {
            this.field906 = (byte[]) null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field906[var4] & 0xFF) > (this.field906[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field906[var4] & 0xFF) > (arg1.field906[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field893 < arg1.field893) {
            return -1;
        } else if (this.field893 <= arg1.field893) {
            return 0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(BI)Lmh;", line = 1871)
    public final class62 method453(byte arg0, int arg1) {
        if (arg0 != -67) {
            return (class62) null;
        }
        field891++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class62 var3 = new class62();
        var3.field906 = new byte[this.field893 + 1];
        var3.field893 = this.field893 + 1;
        class231.method1635(this.field906, 0, var3.field906, 0, this.field893);
        var3.field906[this.field893] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/net/URL;)Ljava/net/URL;", line = 1891)
    public final URL method454(int arg0, URL arg1) throws MalformedURLException {
        if (arg0 == -1) {
            field902++;
            return new URL(arg1, new String(this.field906, 0, this.field893));
        } else {
            return (URL) null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)Lmh;", line = 1913)
    public final class62 method455(int arg0, int arg1, byte arg2) {
        field921++;
        byte var4 = (byte) arg1;
        byte var5 = (byte) arg0;
        class62 var6 = new class62();
        if (arg2 < 107) {
            this.method449((byte) 23, 104);
        }
        var6.field893 = this.field893;
        var6.field906 = new byte[this.field893];
        for (int var7 = 0; var7 < this.field893; var7++) {
            byte var8 = this.field906[var7];
            if (var4 == var8) {
                var6.field906[var7] = var5;
            } else {
                var6.field906[var7] = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)I", line = 1947)
    public final int method456(int arg0, int arg1) {
        if (arg1 == 31846) {
            field910++;
            return this.field906[arg0] & 0xFF;
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(ILmh;)I", line = 1972)
    public final int method457(int arg0, class62 arg1) {
        field922++;
        if (arg0 != -27773) {
            field884 = (class62) null;
        }
        return this.method437(true, arg1, 0);
    }
}
